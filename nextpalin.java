import java.util.Scanner;
public class nextpalin{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int value = in.nextInt();
		boolean status = false;
		do{
			if(value<=10){
				value = 11;
				status = true;
			}
			else{
				value++;
				int angka = value;
				char c;
				String temp = String.valueOf(angka);
				int nilai = temp.length()-1;
				String s = "";
				while(nilai>=0){
					c = temp.charAt(nilai);
					String st = String.valueOf(c);
					s = s+st;
					nilai--;
				}
				if(value==Integer.parseInt(s)){
					status = true;
				}
				else{
					status = false;
				}
			}
		}while(!status);
		System.out.println(value);
	}
}