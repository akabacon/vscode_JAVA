
public class teacher extends person{
	public teacher(String name, double height, double weight) {
		set_teacher(name, height, weight);
	}

	public void set_teacher(String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;

	}
	
	public void show_name_bmi() {
		this.bmi=this.weight/((this.height/100)*(this.height/100));
		System.out.printf("%s\t%f\n",this.name,this.bmi);
	}
	
}
