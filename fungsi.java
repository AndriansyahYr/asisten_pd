import java.util.Scanner;
public class fungsi{
	static int nilaiRandom;
	static int skor;
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		random();
		skor = 100;
		boolean status = true;
		while(status){
			int masukan = in.nextInt();
			boolean b = cekKebenaran(masukan);
			skor = (b)?skor:hitungPoint();
			status = (b)?false:true;
		}
		System.out.println(cetak());
	}
	static void random(){
		nilaiRandom = (int)(Math.random()*10)+0;
	}
	static boolean cekKebenaran(int nilai){
		if(nilai>nilaiRandom){
			System.out.println("kebesaran");
			return false;
		}
		else if(nilai<nilaiRandom){
			System.out.println("kekecilan");
			return false;
		}
		else return true;
	}
	static int hitungPoint(){
		skor = skor - 10;
		return skor;
	}
	static String cetak(){
		String s = "benar nilai yang ditebak adalah : "+nilaiRandom+"\n";
		String s2 = "Skor adalah : "+skor;
		return s+s2;
	}
}

//1. random > void
//cekKebenaran > boolean
//hitungPoint > int
//cetak > String