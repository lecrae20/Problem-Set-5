package emailapp;
import java.awt.*;

import java.util.Scanner;

public class instagram extends Socialmedia{
Scanner scnr=new Scanner(System.in);
  StdDraw.setScale(-0.1, 7.1);
  String song="";
  
  System.out.println("**********************");
  
  System.out.println("Your Username: " +username);
  System.out.println("Your password: " + password);
  System.out.println("Enter favorite song: ");
  song=scnr.next();
  StdDraw.rectangle(3.5, 6.18, .45, .15);
  
  
  StdDraw.text(3.5, 6.5, "******* MY BIO ******/n Hello! My name is " + firstname + " " + lastname + "! " + "I am a " + age + " year old from " + country + "! Welcome to my page!/n My favorite song is " + song);
  
 // System.out.println("******* MY BIO ******");
//  System.out.print("Hello! My name is " + firstname + " " + lastname + "! " + "I am a " + age + " year old from " + country + "! " + "Welcome to my page!");
 // System.out.print(" My favorite song is" + song);
}
