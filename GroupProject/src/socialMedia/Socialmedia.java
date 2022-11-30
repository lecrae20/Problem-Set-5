/**********************************************************************
 2 *@file: SocialMedia.java
 3 *@brief: The most difficult part was creating methods and classes so that the inheritance aspect of the code run correctly.
 4 *@author: Abby L., Ella V., Emma D., Caroline M.
 5 *@date: 11/30/22
 6 *@acknowledgement: Master Skills Email App - YouTube
 7 ***********************************************************************/

package socialMedia;
import java.util.Scanner;

public class Socialmedia {
    public String firstname;
    public String lastname;
    public String password;
    public int defaultpasswordLength=8;
    public String country;
    public String username;
    public int followerCapacity=2125;
    public int age;
    public String song;

    public Socialmedia(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.setCountry();
        System.out.println("Country:" + this.country);
        this.password=randomPassword(defaultpasswordLength);
        System.out.println("Your password is: " + this.password);
        this.setUsername(this.firstname, this.lastname);
        this.setAge();
        this.setSong();

    }

    public void setAge(){
        System.out.println("Enter age: ");
        Scanner scnr=new Scanner(System.in);
        this.age =  scnr.nextInt();

    }




    public String setUsername(String firstname, String lastname) {
        this.firstname = "" + firstname.charAt(0);
        this.lastname = lastname.substring(0, 3);
        System.out.println("Username Created: " + this.firstname + "_" + this.lastname);
        return username;
    }


    public void setCountry(){
        System.out.println("New account: " + firstname + lastname + " \nCountry codes:\n1 for USA\n2 for England\n3 for Canada \n0 for Mexico\nEnter country code: ");
        Scanner in=new Scanner(System.in);
        int depChoice=in.nextInt();
        if(depChoice==1){country = " USA"; }
        else if(depChoice==2){country = " England";}
        else if(depChoice==3){country = " Canada";}
        else{country = " Mexico";}
    }
    public String randomPassword(int length){
        String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[]password= new char[length];
        for(int i=0; i<length; i++){
            int rand = (int)(Math.random()* passwordSet.length());
            password[i]=passwordSet.charAt(rand);

        }
        return new String(password);
    }
    public void setFollowerCapacity(){
        this.followerCapacity=followerCapacity;
    }


    public void setCountry(String country){
        this.country=country;
    }

    public void changePassword(String password){
        this.password=password;
    }

    public String getPassword(){
        return password;
    }

    public String setSong(){
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter your favorite song: ");
        song = scnr.nextLine();
        return song;
    }

    public String showInfo(){
        return "******* MY BIO ******\nHello! I'm so glad you're here! I am a " + age + " year old from" + country + "!\nMy favorite song is " + song + "!\nWelcome to my page! \nFollower count: " + followerCapacity + "\n**********************";
    }
}