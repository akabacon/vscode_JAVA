
public class student extends person {
	double score[] = new double[3];

	public student(String name, double height, double weight, double score[]) {
		set_student(name, height, weight, score);
	}

	public void set_student(String name, double height, double weight, double score[]) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.score = new double[score.length]; // class array need claim twice, one is new to get memory
		for (int i = 0; i < this.score.length; i++) { // second is to claim
			this.score[i] = score[i];
		}

	}

	public void show_student() {
		System.out.println("姓名\t身高\t體重\t程式\t進階\t物件");
		System.out.printf("%s\t%.2f\t%.2f\t", this.name, this.height, this.weight);
		for (int i = 0; i < this.score.length; i++) {
			System.out.printf("%.2f\t", this.score[i]);
		}
		System.out.println("");
		
	}
	public void show_name_bmi() {
		this.bmi=this.weight/((this.height/100)*(this.height/100));
		System.out.printf("%s\t%f\n",this.name,this.bmi);
	}

	
	public void random_score() {
		for(int i=0;i<this.score.length;i++) {
		this.score[i]=(int)(Math.random()*(100-60+1))+60;
		}
	}
	




	

}
