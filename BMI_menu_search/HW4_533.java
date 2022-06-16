import java.util.Scanner;

public class HW4_533 {
	static int menu() {
		System.out.println("0.show all");
		System.out.println("1.change");
		System.out.println("2.showBMI");
		System.out.println("3.set random remark");
		System.out.println("4.cal and show average, highest and lowest grade");
		System.out.println("5.input and check");
		System.out.println("6.Exit");

		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();
		return select;
	}

	static class input {
		String name;
		double height, weight, bmi;
		double score[] = new double[3];
	}

	static void update(PU_class cl) {
		System.out.printf("目前是: 資工一A\n請輸入班級: ");
		Scanner sc = new Scanner(System.in);
		cl.className = sc.next();

		while (!(cl.className.equals("資工一A") || cl.className.equals("資工一B"))) {
			System.out.printf("you entered \"%s\",please enter again: ", cl.className);
			cl.className = sc.next();
		}
		System.out.printf("already changed to %s\n\n", cl.className);

		System.out.printf("current courseName: %s %s %s\n", cl.courseName[0], cl.courseName[1], cl.courseName[2]);
		System.out.printf("please enter course: ");
		for (int i = 0; i < cl.courseName.length; i++) {
			cl.courseName[i] = sc.next();
			System.out.printf("you entered: %s %s %s\n\n", cl.courseName[0], cl.courseName[1], cl.courseName[2]);

		}

	}

	public static void main(String[] argv) {

		student st[] = new student[3];
		teacher tc = new teacher("test", 0, 0);
		PU_class p = new PU_class();
		input in = new input();
		Scanner sc = new Scanner(System.in);

		for (int j = 0; j < st.length; j += +1) {
			in.name = argv[6 * j];
			in.height = Double.parseDouble(argv[6 * j + 1]);
			in.weight = Double.parseDouble(argv[6 * j + 2]);
			for (int i = 0; i < in.score.length; i++) {
				in.score[i] = Double.parseDouble(argv[6 * j + 3 + i]);
			}

			// assign
			st[j] = new student(in.name, in.height, in.weight, in.score);

		}

		tc.set_teacher(argv[18], Double.parseDouble(argv[19]), Double.parseDouble(argv[20]));

		// menu
		int flag = 1;
		while (flag == 1) {
			switch (menu()) {
			case 0:
				System.out.printf("teacher\n%s\t%.2f\t%.2f\n", tc.name, tc.height, tc.weight);
				// show
				System.out.println("student");
				for (int i = 0; i < st.length; i++) {
					st[i].show_student();
				}
				break;
			case 1:
				update(p);

				break;
			case 2:
				// show bmi
				for (int i = 0; i < st.length; i++) {
					st[i].show_name_bmi();
				}
				System.out.println("\nteacher");
				tc.show_name_bmi();

				break;

			case 3:
				// set random
				for (student i : st) {
					i.random_score();
				}

				break;
			case 4:
				p.show_score_analization(st);

				break;
			case 5:
				System.out.printf("enter a name: ");
				while (p.input_search_and_show_bmi(st, tc) == 0) { // not found,so flag=0,0is to repeat
					System.out.println("name not found:");

					int search_flag = 0;
					System.out.println("1.continue to search");
					System.out.println("2.enter 0 to back main menu");
					search_flag = sc.nextInt();
					if (search_flag == 0) {
						break;
					}
				}
				break;
			case 6:
				flag = 0;
				break;
			}

		}

	}

}
