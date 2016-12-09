import java.util.Scanner;
public class latihanArray{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int array[][] = new int[t][3];
		for(int i=0; i<t;i++){
			for(int j = 0; j<3;j++){
				array[i][j] = in.nextInt();
			}
		}
		int averagecoloumn[] = new int[t];
		int sum1, sum2;
		sum1 = 0; sum2 = 0;
		for(int i=0; i<t;i++){
			sum2 = 0;
			sum1 = 0;
			for(int j = 0; j<3;j++){
				sum2 = sum2 + array[i][j];
				if(j<t)
					sum1 = sum1+array[j][i];
				System.out.print(array[i][j]+" ");
			}
			int averageRow = sum2/3;
			averagecoloumn[i] = sum1/t;
			System.out.print(averageRow+"\n");
		}
		for(int i=0;i<t;i++){
			System.out.print(averagecoloumn[i]+" ");
		}
	}
}