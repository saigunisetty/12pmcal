package com.ibm.JavaApp;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    
	public int firstNum;
	public int secondNum;
	
	
	public int getFirstNum() {
		return firstNum;
	}


	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}


	public int getSecondNum() {
		return secondNum;
	}


	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}

	public int addFunction(int firstNum, int secondNum) {
			return firstNum+secondNum;
	}
	
	public int subFunction(int firstNum, int secondNum) {
		return secondNum-firstNum;
	}
	
	public int mulFunction(int firstNum, int secondNum) {
		return firstNum*secondNum;
	}
	
	public static void main( String[] args )
    {
        
        App app = new App();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first numeric value ");
        int firstNum =  sc.nextInt();
        app.setFirstNum(firstNum);
        
        System.out.println("Enter the second numeric value ");
        int secondNum =  sc.nextInt();
        app.setSecondNum(secondNum);
        
        System.out.println("Sum is : "+app.addFunction(secondNum, secondNum));
        System.out.println("Difference is : "+app.subFunction(firstNum, secondNum));
        System.out.println("Product is : "+app.mulFunction(firstNum, secondNum));
        
        //String output = String.format("\n*** Your Calculator ***\n\nFirst: %d\nSecond: %d\n\nSum : %d\nDifference : %d\nProduct : %d\n\n", app.firstNum, app.secondNum, app.addFunction(firstNum, secondNum), app.subFunction(firstNum, secondNum), app.mulFunction(firstNum, secondNum));
	    //System.out.println(output);
        
    }
}
