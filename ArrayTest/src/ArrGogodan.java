import java.util.Scanner;

/*구구단*/
public class ArrGogodan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;
		int j = 0;
		int arr[][] = new int[10][10];

		for (i = 2; i < arr.length; i++) {
			for (j = 1; j < arr.length; j++) {
				arr[i][j]=i*j;
				System.out.print(  i + "*" + j + "=" + arr[i][j]+"  ");
			
			}
			System.out.println();
		}
System.out.println("*******************************************************");
		for (i = 1; i < arr.length; i++) {
			for (j = 2; j < arr.length; j++) {
				arr[i][j]=i*j;
				System.out.print(  j + "*" + i + "=" + arr[i][j]+"    ");
			}
			System.out.println();
		}
		
		Scanner sc =new Scanner(System.in);
		System.out.println("원하는 단을 입력 하세요.");
		int input = sc.nextInt();
		for(int k=0;k<9;k++) {
			System.out.println((input)+"*"+(k+1) +"="+(input*(k+1)));
		}
	}

}
