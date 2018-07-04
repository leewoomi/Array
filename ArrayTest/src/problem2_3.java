import java.util.InputMismatchException;
import java.util.Scanner;

/*10명의 국어 성적을 입력받아서, 점수가 80점 이상인 학생이 몇명인지를 
 * 구하는 프로그램
 * 1> 점수는 1점 이상 100점 이하
 * 2>예외처리
 * */
public class problem2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("10명의 국어 점수를 입력하세요");
		int kor[] = new int[10];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < kor.length; i++) {

			kor[i] = sc.nextInt();
			if (kor[i] < 0 || kor[i] > 100) {
				System.out.println("다시입력해주세요");
				i--;
			}

		}

		int count = 0;
		for (int i = 0; i < kor.length; i++) {
			if (kor[i] >= 80) {

				count++;
			}
		}
		System.out.println(count);
	}

}
