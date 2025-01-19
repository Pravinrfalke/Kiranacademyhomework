package homework13;

import java.util.Scanner;

public class B {
    int arrray1[];
    int size;
    Scanner sc = new Scanner(System.in);
    public void acceptOddValue(){
        System.out.println("Enter the size of array:");
        size = sc.nextInt();
        arrray1= new int[size];
        int count =0;
        while( count<size) {
        
            System.out.println("Enter the element of array:");
            int j = sc.nextInt();
            if( j%2!=0 && j!=0){
                arrray1[count]=j;
                count++;
            }
        }

    }
    public void displayArray(){
        for(int k=0; k<arrray1.length; k++){
            System.out.println("Value of array is"+arrray1[k]);
        }
    }
    public static void main(String[] args) {
        B b1 = new B();
        b1.acceptOddValue();
        b1.displayArray();
    }
}
