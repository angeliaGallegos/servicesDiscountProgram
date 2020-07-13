/*
Angelia
09-28-2018
CSCI 1015
Programming Assignment 5
The purpose of this program is to calculate and display totals for 
packages and display savings on other packages if there is any.
*/

import java.util.Scanner;

public class LovelandPass5
{
	public static void main(String[] args)
	{
      Scanner sc = new Scanner(System.in); 
      String in; //Input from user
      String up; //Storing in to uppercase
		char pt; //Package type being used 
		final double packageA = 9.95; //Price for package A per month
		final double hoursA = 10; //Hours of access for package A
		final double overagesA = 2.00; //Overage charges for package A
		final double packageB = 13.95; //Price for package B per month
		final double hoursB = 20; //Hours of access for package B
		final double overagesB = 1.00; //Overage charges for package B
		final double packageC = 19.95; //Price for package C 
		double hoursUsed; //Hours packages are used 
		double total = 0; //total amount owed
		double total2 = 0; //additional total for switch statement
		double total3 = 0; //additional total for switch statement 
      double totalA = 0; //total amount for package A with hoursUsed
      double totalB = 0; //total amount for package B with hoursUsed
      double totalC = 0; //total amount for package C with hoursUsed
      
		//User inputs the type of package and setting case to upper
      System.out.printf("Please enter the package type A, B, or C: ");
      in = sc.nextLine();
      up = in.toUpperCase();
      pt = up.charAt(0);
      
      //User inputs the amount of hours product was used
      System.out.printf("Please enter the number of hours the product was used: ");
      hoursUsed = sc.nextDouble();
      
      //Setting totalA
      if(hoursUsed > hoursA)
      {
         double tempHours;//Storing hoursUsed without changing hoursUsed
         tempHours = hoursUsed; 
         tempHours -= hoursA;
         totalA = packageA + (tempHours * overagesA);
      }
      else
      {
         totalA = packageA;
      }
      
      //Setting totalB using hoursUsed
      if(hoursUsed > hoursB)
      {
         double tempHours;
         tempHours = hoursUsed;
         tempHours -= hoursB;
         totalB = packageB + (tempHours * overagesB);
      }
      else
      {
         totalB = packageB;
      }
      
      //Setting totalC using hoursUsed
      totalC = packageC;
      
      //Switch on package input
		switch(pt)
		{
         //Calculating package A
			case 'A':
				if(pt == 'A')
				{             
               total = totalA;
               System.out.printf("Your total charge for package A is $%.2f" ,total);
               total2 = totalA - totalB;
               
               if(total2 > 0)
               {
                  System.out.printf("\nWith package B, you would've saved $%.2f" ,total2);
               }
               
               total3 = totalA - totalC;
               
               if(total3 >0)
               {
                  System.out.printf("\nWith package C, you would've saved $%.2f" ,total3);
               }
				}
            break;
         //Calculating package B   
			case 'B':         
				if(pt == 'B')
				{
				   total = totalB;
               System.out.printf("Your total charge for package B is $%.2f" ,total);
               total2 = totalB - totalA;
               
               if(total2 > 0)
               {
                  System.out.printf("\nWith package A, you would've saved $%.2f" ,total2);
               }
               
               total3 = totalB - totalC;
               
               if(total3 >0)
               {
                  System.out.printf("\nWith package C, you would've saved $%.2f" ,total3);
               }           
				}
            break;
         //Calculating package C   
			case 'C':
				if(pt == 'C')
				{
	            total = totalC;
               System.out.printf("Your total charge for package C is $%.2f" ,total);
               total2 = totalC - totalA;
               
               if(total2 > 0)
               {
                  System.out.printf("\nWith package A, you would've saved $%.2f" ,total2);
               }
               
               total3 = totalC - totalB;
               
               if(total3 >0)
               {
                  System.out.printf("\nWith package B, you would've saved $%.2f" ,total3);
               }    
				}
            break;            
		}
	}
}