import java.util.Scanner;

/*10개 데이터를 입력받아서 최대값과 최소값을 구하고,
 * 합계를 구하는 프로그램을 작성하세요.
 * 배열이용*/
public class Problem2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[10];
		int i=0;
		
		int sum=0;
		System.out.println("10개의 숫자를 입력하세요");
		Scanner sc =new Scanner(System.in);
		for(i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			sum +=arr[i];
		}
		System.out.println("합계 : "+sum);
		int MAX = arr[0];
		int MIN =arr[0];
		for(i=0;i<arr.length;i++) {
		
			if(arr[i]>MAX) {
				MAX=arr[i];
			//	System.out.println("최대값"+MAX);
				
			}if(arr[i]<MIN) {
			MIN=arr[i];
			//System.out.println("최소값"+MIN);
			}
		}
		System.out.println("최대값="+MAX+",최소값="+MIN);
	}

}
