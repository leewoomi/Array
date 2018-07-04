import java.util.Scanner;

/*5명의 학색 성적을 입력받아서
 * 합계와 평균을 구하되, 각 과목별 총점과 평균을 구하여 출력해 주세요.*/
public class Problem2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int kor[] = new int[5];
		int math[] = new int[5];
		int eng[] = new int[5];
		int totkor = 0;
		int totmath = 0;
		int toteng = 0;
		float avgkor =0;
		float avgmath =0;
		float avgeng =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("5명의 국어 점수를 입력 하세요.");
		for (int i = 0; i < kor.length; i++) {
			kor[i] = sc.nextInt();
			totkor += kor[i];
			avgkor = totkor/kor.length;
		}
		System.out.println("5명의 수학 점수를 입력 하세요.");
		for (int j = 0; j < math.length; j++) {
			math[j] = sc.nextInt();
			totmath += math[j];
			avgmath = totmath/math.length;
		}
		System.out.println("5명의 영어 점수를 입력 하세요.");
		for (int k = 0; k < eng.length; k++) {
			eng[k] = sc.nextInt();
			toteng += eng[k];
			avgeng = toteng/eng.length;
		}
		System.out.println();
		for (int i = 0; i < kor.length; i++) {
		
		System.out.print(kor[i]+"\t");
		}
		System.out.println();

		for (int j = 0; j < math.length; j++) {
			System.out.print(math[j]+"\t");
		}
		
		System.out.println();
		for (int k = 0; k < eng.length; k++) {
			System.out.print(math[k]+"\t");
		}
		System.out.println();
		System.out.println("국어 총점 = " + totkor);
		System.out.println("수학 총점 = " + totmath);
		System.out.println("영어 총점 = " + toteng);
		System.out.println("국어 평균 = " + avgkor);
		System.out.println("수학 평균 = " + avgmath);
		System.out.println("영어 평균 = " + avgeng);
		System.out.println("전체 총점 = " + (totmath + totkor + toteng));
		System.out.println("전체 평균 = " + (avgmath + avgkor + avgeng));


	}

}
