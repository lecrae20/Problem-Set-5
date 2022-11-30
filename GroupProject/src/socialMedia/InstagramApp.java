package socialMedia;

import java.util.Scanner;

public class InstagramApp {
  public static void main(String[] args){

    Scanner scnr=new Scanner(System.in);
    System.out.println("Enter first name: ");
    String firstname=scnr.next();

    System.out.println("Enter last name: ");
    String lastname=scnr.next();

    Instagram insta1= new Instagram(firstname, lastname);

    System.out.print(insta1.showInfo());
    
    
  }
}
