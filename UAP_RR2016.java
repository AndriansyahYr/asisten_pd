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
public class UAP_RR2016 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean status[] = {true, true, true, true, true, true, true, true, true,
        true, true, true, true, true, true, true,true};
        String kamar[] = {"0","1","2","3","4","5","6","7","8","9","10","11",
            "12","13","14","15","16"};
        Scanner in2 = new Scanner(System.in);
        int jumlah = in.nextInt();
        String[] nama = new String[jumlah];
        for(int i=0; i<jumlah; i++){
            nama[i] = in2.next();
            nama[i] = nama[i].toUpperCase();
        }
        for(int i=0; i<jumlah;i++){
            char c = nama[i].charAt(0);
            int huruf1 = c-64;
            c = nama[i].charAt(1);
            int huruf2 = c-64;
            int rumus = (10*huruf1+huruf2) % 17;
            if(status[rumus]){
                kamar[rumus] = nama[i];
                status[rumus] = false;
            }
            else{
                int n = rumus;
                while(!status[n]){
                    n++;
                    if(n==17){
                        n = 0;
                    }
                }
                kamar[n] = nama[i];
                status[n] = false;
            }
            
        }
        for (int i = 0; i < kamar.length; i++) {
            System.out.print(kamar[i]+" ");
        }
    }
}
