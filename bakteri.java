import java.util.*;
public class bakteri{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int jB = 0;
		int temp = 1;
		if (n<2) {
			System.out.println("1");
		}
		else{
			int i = 1;
			while(i<=n){
				if(i==1){
					temp = 1;
					jB=1;
				}
				else if(i<=5){
					temp = temp*2;
					jB = temp + jB;
				}
				else{
					temp = temp*3;
					jB = jB+temp;
				}
				i++;
			}
		}
		System.out.println(jB);
	}
}