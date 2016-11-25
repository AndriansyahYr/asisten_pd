import java.util.*;
public class latihan{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int angka[] = {1, 2, 3, 4, 5, 6};
		int angka2[] = {2, 3, 4, 1, 6, 5};
		for(int i=0;i<angka.length;i++){
			System.out.print(angka[i]+" ");
		}
		System.out.println();
		for(int i=0;i<angka.length;i++){
			System.out.print(angka2[i]+" ");
		}
		System.out.println();
		System.out.println("output");
		int n = angka.length;
		int ketemu=0;
		for(int i=0;i<n;i++){
			if(angka[i]!=angka2[i]){
				//find
				for(int j=0;j<n;j++){
					if(angka[i]==angka2[j]){
						ketemu = j;
					}
				}
				int t;
				t = angka2[i];
				angka2[i] = angka2[ketemu];
				angka2[ketemu] = t;
				System.out.println((i+1)+" "+(ketemu+1));
			}
			
		}
		for(int i=0;i<angka.length;i++){
			System.out.print(angka2[i]+" ");
		}
	}
}