package mribrahimtasks;

import java.util.Scanner;

public class FirstPush {
	
     public static void main(String[] args) {
         int years;
    	 boolean leapyear = false;
    	 System.out.println("Pls enter the year to be checked : ");
    	 Scanner check = new Scanner(System.in);
    	 years = check.nextInt();
    	 
    	 if(years % 4 == 0)
    		 leapyear = true;
    	 if(years % 100 == 0)
    		 leapyear = false;
    	 if(years % 400 == 0)
    		 leapyear = true;
    		 
    	 System.out.println("Is" + " " + years + " " + "a leap year ? == " + " " + leapyear);
    	
    	check.close(); 
     }
}
