package socialMedia;

import java.util.Arrays;
import java.util.Scanner;

public class TwitterApp {
    public static void main(String[] args) {
        Scanner scnr=new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstname=scnr.next();

        System.out.println("Enter last name: ");
        String lastname=scnr.next();

        Twitter twitter1 = new Twitter(firstname, lastname);
        System.out.println(twitter1.showInfo());

    }

}
