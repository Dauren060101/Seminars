package com.company;
import java.util.Scanner;

public class Main {
    public static float avg(int[] arr){//method for calculating arithmetic average of an array
        float sum=0;
        for (int j : arr) {
            sum += j;
        }
        return sum/ arr.length;
    }
    public static boolean find(int[] arr,int x){//function to check if the value is in arr
        for (int j : arr) {//looping through our array
            if (j == x)//if x is in arr
                return true;
        }
        return false;
    }

    public static void Display(int[] arr){//method for printing out an array
        System.out.print("Elements are: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {

        int size=25;//declaring size of an array
        int[] array=new int[25];//initializing array
        for(int i=0;i<size;i++){
            array[i]=(int)(Math.random()*10);//assigning a random value between [0,..10]
        }
        Display(array);//displaying array
        //Testing avg() function
        System.out.println("Среднее значение массива равно: "+avg(array));//printing the average of an array

        //Testing the find() function
        System.out.print("Введите значение которое хотите найти в массиве:");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();//getting input from user
        if(find(array,x)){//printing the result of find function
            System.out.print(x+" есть в массиве");
        }
        else{
            System.out.print(x+" в массиве найден не был");
        }
        in.close();


    }

}