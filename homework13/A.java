package homework13;

import java.util.Scanner;

public class A {
    // 1. write a method to return sum of cube of elements of array 
    Scanner sc = new Scanner(System.in);
    int size;
    int arra[];
    public void acceptValue(){
        System.out.println("Enter size of array:");
        size = sc.nextInt();
        arra= new int[size];//initialize
        System.out.println("Enter elements of array:");
        for( int k=0; k<size; k++){
            arra[k] =sc.nextInt();
        }
    }

    public void showValue(){
        for ( int k = 0; k< size; k++){
            System.out.println("Values of array are:"+arra[k]);
        }
    }

    public int sumOfCubeOfArray(){
        int sum =0;
        
        for( int k=0; k< size;k++){
            int cube = arra[k]*arra[k]*arra[k];
            sum = sum+cube;

        }
        return sum;
    }
    // 2. write a method to return product of square of elements of array
    public int productOfSquare(){
        int product= 1;
        for( int k=0; k<size; k++){
            int square = arra[k]*arra[k];
            product = square*product;
        }
        return product;
    }
    
}
