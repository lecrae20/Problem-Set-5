package socialMedia;

import java.util.Scanner;
public class Instagram extends Socialmedia{


  public Instagram(String firstname, String lastname){
    super(firstname, lastname);
    Scanner scnr = new Scanner(System.in);
    String song = "";

    System.out.println("**********************");

    System.out.println("Your Username: " + username);
    System.out.println("Your password: " + password);

    System.out.println("******* MY BIO ******");
    System.out.print("Hello! My name is " + firstname + " " + lastname + "! " + "I am a " + age + " year old from " + country + "! Welcome to my page!");
    System.out.print("My favorite song is " + song);
  }
}
