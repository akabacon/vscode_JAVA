package BMI_menu_search.wei;

public class PU_Class {
    Teacher tc=new Teacher();
   	String courseName[]= {"�{���y��","�i���{���y��","����ɦV�{���y��"};
   	Student st[]=new Student[3];
    String className="��u1";  	
   	void average_score(Person[] prs,String course){
   		int count=0;
   		for(Person pt:prs) {
   			if(course==courseName[0]) {
   			   count+=pt.score[0];
   			}
   			if(course==courseName[1]) {
    		  count+=pt.score[1];
    		}
   			if(course==courseName[2]) {
    			  count+=pt.score[2];
    		}
   			int average=count/3;
   			System.out.println("average of "+course+"="+average);
   		}
   	};
   	void search(Person[] prs,String st_name){
   		for(Person l:prs){
   			PU_Class sc=new PU_Class();
   			if(l==st[0]){
   				System.out.printf(st[0].height+""+st[0].weight+""+st[0].score[0]+"");
   				System.out.printf(st[0].score[1]+""+st[0].score[2]);
   				sc.average_score(prs,courseName[0]);
   				sc.average_score(prs,courseName[1]);
   				sc.average_score(prs,courseName[2]);
   			}
   			if(l==st[1]){
   				System.out.printf(st[1].height+""+st[1].weight+""+st[1].score[0]+"");
   				System.out.printf(st[1].score[1]+""+st[1].score[2]);
   				sc.average_score(prs,courseName[0]);
   				sc.average_score(prs,courseName[1]);
   				sc.average_score(prs,courseName[2]);
   			}
   			if(l==st[2]){
   				System.out.printf(st[2].height+""+st[2].weight+""+st[2].score[0]+"");
   				System.out.printf(st[2].score[1]+""+st[2].score[2]);
   				sc.average_score(prs,courseName[0]);
   				sc.average_score(prs,courseName[1]);
   				sc.average_score(prs,courseName[2]);
   			}
   		}
   		
   	}
   	double max_score(String cName){
   		if(cName==courseName[0]){
   		 double max= st[0].score[0];
   		for(int i=0;i<3;i++) {
   			if(st[i].score[0]>max)max=st[i].score[0];
   			return max;
   		}
   		}
   		if(cName==courseName[1]){
      		 double max= st[0].score[1];
      		for(int i=0;i<3;i++) {
      			if(st[i].score[1]>max)max=st[i].score[1];
      			return max;
      		}
      	}
   		if(cName==courseName[2]){
     		 double max= st[0].score[2];
     		for(int i=0;i<3;i++) {
     			if(st[i].score[2]>max)max=st[i].score[2];
     			return max;
     		}
     	}
   	return 0.0;
   	}
   	double min_score(String cName){
   		if(cName==courseName[0]){
     		 double min= st[0].score[0];
     		for(int i=0;i<3;i++) {
     			if(st[i].score[0]<min)min=st[i].score[0];
     			return min;
     		}
     	}
   		if(cName==courseName[1]){
    		 double min= st[0].score[1];
    		for(int i=0;i<3;i++) {
    			if(st[i].score[1]<min)min=st[i].score[1];
    			return min;
    		}
    	}
   		if(cName==courseName[2]){
    		 double min= st[0].score[2];
    		for(int i=0;i<3;i++) {
    			if(st[i].score[2]<min)min=st[i].score[2];
    			return min;
    		}
    	}
   		return 0.0;
   		};  	
}