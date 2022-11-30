package Socialmedia;
import java.util.Scanner;

public class Socialmedia {
    public String firstname;
    public String lastname;
    public String password;
    public int defaultpasswordLength=8;
    public String country;
    public String username;
    public int followerCapacity=2000;
    public int age;

    public Socialmedia(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.setCountry();
        System.out.println("Country" + this.country);
        this.password=randomPassword(defaultpasswordLength);
        System.out.println("Your password is: " + this.password);
        this.setUsername(this.firstname, this.lastname);
        this.setAge();

    }

    public void setAge(){
        System.out.println("Enter age: ");
        Scanner scnr=new Scanner(System.in);
        this.age =  scnr.nextInt();

    }
    
    public void setName(){
        Scanner scnr=new Scanner(System.in);
        System.out.println("Enter first name: ");
        firstname=scnr.next();
        this.firstname=firstname;
        System.out.println("Enter last name: ");
        lastname=scnr.next();
        this.lastname=lastname;
    }



    public void setUsername(String firstname, String lastname) {
        this.firstname = "" + firstname.charAt(0);
        this.lastname = lastname.substring(0, 3);
        System.out.println("Username Created: " + this.firstname + " " + this.lastname + this.age);
    }


    public void setCountry(){
        System.out.println("New worker: " + firstname+ ". Country codes:\n1 for USA\n2 for England\n3 for Canada \n0 for Mexico\nEnter country code: ");
        Scanner in=new Scanner(System.in);
        int depChoice=in.nextInt();
        if(depChoice==1){country = "USA"; }
        else if(depChoice==2){country = "England";}
        else if(depChoice==3){country = "Canada";}
        else{country = "Mexico";}
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

    public String showInfo(){
        return "DISPLAY NAME: " + firstname+" "+lastname+
                "\n Username: "+username+
                "\n FOLLOWER MAX: " + followerCapacity;
    }



}
