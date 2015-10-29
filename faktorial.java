import java.util.*;
public class faktorial{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int f = 1;
		while(n>1){
			f = f * n;
			n--; //n=n-1; 
		}
		System.out.println(f);
	}
}