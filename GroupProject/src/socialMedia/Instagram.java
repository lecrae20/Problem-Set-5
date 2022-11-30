package socialMedia;

import java.util.Scanner;
public class Instagram extends Socialmedia{


  public Instagram(String firstname, String lastname){
    super(firstname, lastname);

    System.out.println();
    System.out.println();

    System.out.println("**********************");
    System.out.println("Your username: " + this.firstname + "_" + this.lastname);
    System.out.println("Your password: " + password);
    System.out.println("**********************");

    System.out.println();
    System.out.println();


   /*  System.out.println("******* MY BIO ******");
    System.out.println("Hello! My name is " + firstname + " " + lastname + "! " + "I am a " + age + " year old from" + country + "!");
    System.out.println("My favorite song is " + song + "!");
    System.out.println("Welcome to my page!");
    System.out.println("**********************");

    */
  }
}
