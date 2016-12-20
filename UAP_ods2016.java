/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andriansyah
 */
import java.util.*;
public class UAP_ods2016 {
    static int panjang;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        panjang = in.nextInt();
        int nilai[] = new int[panjang];
        int testcase = in.nextInt();
        int counter = 0;
        while(testcase>0){
            int R = in.nextInt();
            int L = in.nextInt();
            if(counter<panjang){
                while(R<=L){
                    if(counter<panjang){
                        nilai[counter] = R;
                    }
                    R++;
                    counter++;
                }
            }
            testcase--;
        }
        SortData(nilai);
        System.out.println(FindMedian(nilai));
    }
	//Sorting using bubble sort
    static void SortData(int[] data){
        for (int i = 0; i < panjang; i++) {
            for (int j = 0; j < panjang; j++) {
                //swap
				if(data[i] < data[j]){
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
    }
    static double FindMedian(int[] data){
        double median = 0;
        if(panjang%2==1){
            median = data[(panjang/2)+1];
        }
        else{
            median = data[panjang/2]+data[(panjang/2)+1];
        }
        return median;
    }
}
