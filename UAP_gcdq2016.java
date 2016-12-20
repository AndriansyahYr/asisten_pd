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
public class UAP_gcdq2016 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testcase = in.nextInt();
        int A[];
        while(testcase>0){
            int N = in.nextInt();
            A = new int[N];
            int Q = in.nextInt();
            for(int i=0; i<N; i++){
                A[i] = in.nextInt();
            }
            int counter = 1;
            int temp=0;
            
            for (int i = 0; i < Q; i++) {
                int L = in.nextInt();
                int R = in.nextInt();
                for (int j = 0; j < N; j++) {
                    if((j+1!=L) && (j+1!=R)){
                        if(counter == 2){
                            temp = fpb(A[j], temp);
                        }
                        else{
                            temp = A[j];
                            counter=counter+1;
                        }
                    }
                }
                System.out.println(temp);
                counter = 1;
            }
            testcase--;
        }
    }
	//GCD algo using rekursif
    static int fpb(int a, int b){
        if(a>b){
            if(a % b == 0) 
                return b;
            else
                return fpb(b, a % b);
        }
        else if(a<b){
            if(b % a == 0)
                return a;
            else
                return fpb(a, b % a);
        }
        else return a;
    }
}
