/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Team17;

import static java.lang.System.out;

/**
 *
 * @author KhaledMostafa
 */
public class revers_arr {
    public  void reversint(int arr[]){
        int s=arr.length;
        for(int i=0;i<s/2;i++){
            int temp=arr[i];
            arr[i]=arr[s-1-i];
            arr[s-1-i]=temp;
        }
		out.print("reversed array:");
        for(int i=0;i<s;i++){
            out.print(arr[i] + " ");
        }
        out.println();
    }
    public  void reverschar(char arr[]){
        int s=arr.length;
        for(int i=0;i<s/2;i++){
            char temp=arr[i];
            arr[i]=arr[s-1-i];
            arr[s-1-i]=temp;
        }
		out.print("reversed array:");
        for(int i=0;i<s;i++){
            out.print(arr[i] + " ");
        }
        out.println();
    }
}
