import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;
import java.lang.Math;


public class MathGame
{
    public static void main(String[] args)
    { 
    Scanner scan = new Scanner(System.in);
    
    //Start message
    System.out.println("Choose the math: 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division");
    int choice = scan.nextInt();
    
    //Score variable will keep track of user's score
    int score = 0;
    
    //count variable will be used to make sure 10 questions are generated each time the code runs
    int count;
    
    //each of the four choices has a if statement to determine which skill is being practiced,  	followed by a for loop to make sure 
   //it runs 10 times, and Math.random is used to generate random numbers
    //addition
    if(choice == 1){
      	for (count = 0; count<10; count++){
      		int add1 = (int)(Math.random()*100);
      		int add2 = (int)(Math.random()*100);
      		int sum = (add1+add2);
      		System.out.println(add1 + "+" + add2 + "=?");
      		int userAnswer = scan.nextInt();
      		if (userAnswer == sum){
        		System.out.println("Correct!");
        		score++;
      }
      else{
        System.out.println("Incorrect. The correct answer is " + sum);
      }
      }
    }
    
    //subtraction
    if(choice == 2){
      for (count = 0; count<10; count++){
      	int sub1 = (int)(Math.random()*100);
      	int sub2 = (int)(Math.random()*100);
      	int diff = (sub1-sub2);
      	System.out.println(sub1 + "-" + sub2 + "=?");
      	int userAnswer2 = scan.nextInt();
      	if (userAnswer2 == diff){
        	System.out.println("Correct!");
        	score++;
      }
      else{
        System.out.println("Incorrect. The correct answer is " + diff);
      }
      }
    }
     
    //multiplication
    if(choice == 3){
      for (count = 0; count<10; count++){
      	int mul1 = (int)(Math.random()*10);
      	int mul2 = (int)(Math.random()*10);
      	int mul = (mul1*mul2);
      	System.out.println(mul1 + "x" + mul2 + "=?");
      	int userAnswer3 = scan.nextInt();
      	if (userAnswer3 == mul){
        	System.out.println("Correct!");
        	score++;
      }
      else{
        System.out.println("Incorrect. The correct answer is " + mul);
      }
      }
    }
    //division
    if(choice == 4){
      for (count = 0; count<10; count++){
      	int div1 = 1+(int)(Math.random()*9);
      	int div2 = 1+(int)(Math.random()*9);
      	int div = (div1*div2);
      	System.out.println(div + "/" + div1 + "=?");
      	int userAnswer4 = scan.nextInt();
      	if (userAnswer4 == div2){
        	System.out.println("Correct!");
        	score++;
      }
      else{
        System.out.println("Incorrect. The correct answer is " + div2);
      }
     
    }
    }
      
      //end message, runs after 10 questions and tells user their score
    System.out.println("Game over. You scored " + score + " out of 10");
    }

  }
