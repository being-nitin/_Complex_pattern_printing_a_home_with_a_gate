package com.codechef;

public class Main {

    public static void main(String[] args) {
	/*
	        *
	       ***
	      *****
	     *******
	    *********
	    ******  *
	    ******  *
	    ******  *
	    ******  *
	    ******  *
	 *
	 * */
    for(int i=1;i<=5;i++){
        for(int j=1;j<5-i+1;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=((2*i)-1);k++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=1;i<=5;i++){
        for(int j=1;j<=9;j++){
            if(j==7 || j==8){
                System.out.print(" ");
            }
            else{
                System.out.print("*");
            }
        }
        System.out.println();
    }
    }
}