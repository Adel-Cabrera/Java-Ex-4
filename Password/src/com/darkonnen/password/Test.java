package com.darkonnen.password;

import java.util.Scanner;
import java.util.ArrayList; 

public class Test {

	public static void main(String[] args) {
		
		boolean option = true;
		
		ArrayList<Password> passwords = new ArrayList<Password>();
		ArrayList<Boolean> strength= new ArrayList<Boolean>();

		
		while(option) {
			
		    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		    System.out.println("Enter password length");
		    int passLength = Integer.parseInt(myObj.nextLine());  // Read user input
		    Password pwd = new Password(passLength);
		    passwords.add(pwd);
		    
		    if(pwd.esFuerte()) {
		    	strength.add(true);
		    } else {
		    	strength.add(!true);
		    }
		    
		    Scanner another = new Scanner(System.in);  // Create a Scanner object
		    System.out.println("Enter another password? (y/n)");
		    String choice = another.nextLine();  // Read user input
		    System.out.println(choice);
		    
		    if(choice.equals("y")) {
		    	option = true;
		    	
		    } else {
		    	option = false;
		    }
		    
		}
		
		for(int i = 0; i < passwords.size(); i++) {
			
			System.out.println(String.format("%s %s", passwords.get(i).getContrasena(), strength.get(i)));
			
		}
		
		
	}

}
