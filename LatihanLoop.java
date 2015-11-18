import java.util.Scanner; 
public class LatihanLoop{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int nilai = in.nextInt();
		//nilai = 3;
		for(int i=1;i<=nilai;i++){
			for(int j=1;j<=nilai;j++){
				if(i==(nilai/2)+1)
					System.out.print(" *");
				else if (j==(nilai/2)+1)
					System.out.print(" *");
				else System.out.print("  ");
			}
			System.out.println();
		}
	}
}