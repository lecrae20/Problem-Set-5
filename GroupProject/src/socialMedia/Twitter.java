package socialMedia;
import java.util.Scanner;

public class Twitter extends Socialmedia {

    public Twitter(String firstname, String lastname) {
        super(firstname, lastname);

        System.out.println();
        System.out.println();

        System.out.println("**********************");
        System.out.println("Your username: " + this.firstname + "_" + this.lastname);
        System.out.println("Your password: " + password);
        System.out.println("**********************");

        System.out.println();
        System.out.println();

        getTweet();


        }
    }
