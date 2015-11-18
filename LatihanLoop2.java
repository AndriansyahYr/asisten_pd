import java.util.Scanner; 
public class LatihanLoop2{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int nilai = in.nextInt();
		for(int i=1;i<=nilai;i++){
			for(int j=1;j<=nilai;j++){
				if(i==j)
					System.out.print("* ");
				else if (i+j==nilai+1)
					System.out.print("* ");
				else System.out.print("  ");
			}
			System.out.println();
		}
	}
}