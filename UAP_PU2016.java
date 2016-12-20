/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andriansyah
 */
import java.util.Scanner;
public class UAP_PU2016 {
    public static void main(String[] args) {
        int uang[] = {100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 100, 50};
        int sisa[] = new int[10];
        Scanner in = new Scanner(System.in);
        int testcase = in.nextInt();
        while(testcase>0){
            int besaranUang = in.nextInt();
            for(int i=0 ;i < 10; i++){
                if(besaranUang>=sisa[i]){
                    sisa[i] = besaranUang/uang[i];
                    besaranUang = besaranUang % uang[i];
                }
            }
            for (int i = 0; i < 10; i++) {
                System.out.println(uang[i]+" = "+sisa[i]);
            }
            testcase--;
        }
    }
}
