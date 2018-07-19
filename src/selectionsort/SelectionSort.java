/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsort;

/**
 *
 * @author Christopher
 */
public class SelectionSort {

    
    public static void main(String[] args) {
        
        /* This program SelectionSort creates an integer array of numeric
           values. From the Main program a method selectionSort is invoked and passes the
           integer array as an argument. The method selectionSort with then
           use two nested for loops to place the values in descending order.
           
        
        */
    	
    	//create integer array
        
        int [] numbers = { 67, 78, 4, 15, 47, 30, 99, 33, 65, 85 };
                
        for(int i = 0; i < numbers.length; i++){
            
            System.out.println("Here are the numbers unsorted: " + numbers[i] 
                    + "\t");
        }
        
        selectionSort(numbers);
        
        for(int i = 0; i < numbers.length; i++){
            
            System.out.println("Here are the numbers sorted: " + numbers[i] +
                    "\t");
        }
    }
    
    public static void selectionSort(int [] num){
        
        int i, j, first, temp;
        for(i = num.length - 1; i > 0; i--){
            
            first = 0;  //initialize to subscript of the first element
            
            for(j = 1; j <= i; j++){ //locate the smallest element between 1 and i.
                
                if(num[j] < num[first]) 
                    first = j;       //change element subscript if j element was
                                     //smaller than first element.
                                     //Continue to check all elements up to i.
                                     //with new first element.
                                     
            }
            
            temp = num[first];      //copy small value from element first subscript
            num[first] = num[i];    //copy current max location element of i prior to decrement i.
            num[i] = temp;          //copy temp small value into max current element location.
            
        }
        
    }
        
}
