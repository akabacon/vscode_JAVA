import java.util.Scanner;

public class PU_class {
	String courseName[] = { "�{���y��", "�i���{��", "����ɦV" };
	String className = "��u�@A";

	public int input_search_and_show_bmi(student[] st, teacher tc) { // class person's p array
		Scanner b = new Scanner(System.in);
		String inName = b.next();
		int flag = 0; //flag means not find
		for (int i = 0; i < st.length; i++) { //compare student name
			if (inName.equals(st[i].name)) {
				st[i].show_name_bmi();
				flag = 1; //find
			}

		}
		if (inName.equals(tc.name)) { //compare teacher name
			tc.show_name_bmi();
			flag = 1; //find
		}
		
		
		return flag;
	}

	public void show_score_analization(student st[]) {
		System.out.println("����\t�{��\t�i��\t����");

		double average = 0;
		System.out.printf("����\t");
		for (int j = 0; j < st[0].score.length; j++) {

			for (student i : st) {
				average += i.score[j];
			}
			average /= st.length;

			System.out.printf("%.2f\t", average);
			average = 0;
		}
		System.out.println("");

		System.out.printf("�̰�\t");
		double max = 0;
		for (int j = 0; j < st[0].score.length; j++) {
			for (student i : st) {
				if (max < i.score[j]) {
					max = i.score[j];
				}
			}

			System.out.printf("%.2f\t", max);
			max = 0;
		}
		System.out.println("");

		System.out.printf("�̤p\t");
		double min = 100;
		for (int j = 0; j < st[0].score.length; j++) {
			for (student i : st) {
				if (min > i.score[j]) {
					min = i.score[j];
				}
			}
			System.out.printf("%.2f\t", min);
			min = 100;
		}
		System.out.println("");
	}

}
