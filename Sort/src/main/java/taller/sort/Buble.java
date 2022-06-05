/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.sort;

/**
 *
 * @author LENOVO
 */
public class Buble {
        
    int[] arr;
    
    public Buble(int[] arr){
        this.arr=arr;
        bubbleSort(arr);
    }
    void bubbleSort(int[] arr) { 
        int n = arr.length;  
        int temp = 0;  
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){  
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];  
                    arr[j-1] = arr[j];  
                    arr[j] = temp;  
                }  
            }  
        }
    }

    public int[] getArr() {
        return arr;
    }
    
}     
