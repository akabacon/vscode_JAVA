package BMI_menu_search.wei;
import java.util.*;
public class HW4 {
 public static void main(String[] argv) {
	//System.out.println(argv[0]);
	int select=0;
	PU_Class t=new PU_Class();
	 Teacher tc=new Teacher();
	  Student st[]=new Student[3];
	  //?Q??argv?name,height,weight
	  for(int i=0,j=0;i<argv.length-3&&j<3;i+=3,j++) {
		  st[j].name=argv[i];
	  }
	  for(int i=1,j=0;i<argv.length-3&&j<3;i+=3,j++) {
		  st[j].height=Double.parseDouble(argv[i]);
	  }
	  for(int i=2,j=0;i<argv.length-3&&j<3;i+=3,j++) {
		  st[j].weight=Double.parseDouble(argv[i]);
	  }
	  tc.name=argv[argv.length-3];
	  tc.height=Double.parseDouble(argv[argv.length-2]);
	  tc.weight=Double.parseDouble(argv[argv.length-1]);
	while((select=menu())!=6){
	  if(select==1){HW4 hw=new HW4();hw.update(t);}
	  else if(select==2){
		  System.out.println("?m?W ???? ?? BMI");
		  HW4 hw1=new HW4();hw1.bmiCalculate(tc,st[3]);
	  }
	  else if(select==3){
		  System.out.println("?m?W"+""+t.courseName[0]+t.courseName[1]+t.courseName[2]);
		  //?��???Z?????60-100?????C
		  HW4 hw2=new HW4();hw2.rand_score(st[3]);
	  }
	  else if(select==4){
		  Scanner scanner=new Scanner(System.in);
		  String course=scanner.next();
		  System.out.println(course+"???????:");
		  t.max_score(course);
		  System.out.println(course+"????C??:");
		  t.min_score(course);
		  System.out.println(course+"??????????");
		  t.average_score(st, course);
	  }
	  else if(select==5){
		  Scanner scan=new Scanner(System.in);
		  String name=scan.next();
		  if(name==st[0].name) {
		   t.search(st, name);}
		  if(name==st[1].name) {
		   t.search(st, name);}
		  if(name==st[2].name) {
			t.search(st, name);}
	  }
	  else {System.out.println("Please enter 1-6");}
	}	 
	System.out.println("Thank you!! Bye Bye");
 }
 static int menu(){	 
	 System.out.println("1.???Z?????");
	 System.out.println("2.?q?X???Z??BMI");
	 System.out.println("3.?��??????????Z");
	 System.out.println("4.?p???????A???????C??");
	 System.out.println("5.??J?m?W?A?d??...");
	 System.out.println("6.Exit");
	 
	 Scanner scan = new Scanner(System.in);
	 int select =scan.nextInt();
	 return select;
 }
 void bmiCalculate(Person...people) {
	for(Person p:people) {
    	p.BMI=p.weight/(p.height/100)/(p.height/100);
    	System.out.println(p.name+""+p.height+""+p.weight+""+p.BMI); 
	}
 };
 int update(PU_Class c){
	 System.out.println("?�e?J?z???Z??");
	 Scanner scan=new Scanner(System.in);
	 String classname=scan.next();
	 if(classname!="??u?@A"||classname!="??u?@B")return 0;
	 classname=c.className;
	 System.out.println("?�e?J?z?????W??:(?T??):");
	 String coursename[]=new String[3];
	 for(int i=0;i<3;i++) {
		 coursename[i]=scan.next();
		 coursename[i]=c.courseName[i];
	 }
	 return 1;
	 
 }
 void rand_score(Person...people) {
	 for(Person pt:people) {
		  pt.score[0]=(int)(Math.random()*(100-60+1))+60;
		  pt.score[1]=(int)(Math.random()*(100-60+1))+60;
		  pt.score[2]=(int)(Math.random()*(100-60+1))+60;
		  System.out.println(pt.name+""+pt.score[0]+""+pt.score[1]+""+pt.score[2]);
	  }
 };
}
