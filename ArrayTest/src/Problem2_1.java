import java.util.Scanner;

/*10개의 데이터를 초기화 시키고, 총점을 구하는 프로그램ㅇ르 
 * 작성해 봅니다. 배열사용.
 * 데이터] 90 80 60 70 93 100 50 66 100 88*/
public class Problem2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
		int sung[] = new int[10];
		int total=0;

		 for(int i=0; i<sung.length;i++) {
			 System.out.println("sung["+i+"] = ");
		sung[i]=sc.nextInt();
			 total +=sung[i];
		
		 }
		System.out.println("total = " + total);
		System.out.println("avg = " +total/sung.length );
		
	}

}
