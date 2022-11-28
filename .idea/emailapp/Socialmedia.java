package emailapp;

import java.util.Scanner;

public class Socialmedia {
    public String firstname;
    public String lastname;
    public String password;
    public int defaultpasswordLength=8;
    public String country;
    public String username;
    public int mailboxCapactity=500;
    public String alternateEmail;
    public String companySuffix="aeycompany.com";
    publci int age;
    
    public age(){
        System.out.println("Enter age: ");
        int age;
        Scanner scnr=new Scanner(System.in);
        age=scnr.nextInt();
        return age;
    }
    
    

    public username(String firstname, String lastname){
        this.age=age;
        this.firstname=firstname.charAt(0);
        this.lastname=lastname.charAt(0)+lastname.charAt(1)+lastname.charAt(2);
        System.out.println("Username Created: " + this.firstname+" " + this.lastname+this.age);
        this.country=setCountry();
        System.out.println("Country" + this.country);
        this.password=randomPassword(defaultpasswordLength);
        System.out.println("Your password is: " + this.password);
        email=firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+ country+"."+companySuffix;

    }

    public String Country(){
        System.out.println("New worker: " + firstname+ ". Country codes:\n1 for USA\n2 for England\n3 for Canada \n0 for Mexico\nEnter country code: ");
        Scanner in=new Scanner(System.in);
        int depChoice=in.nextInt();
        if(depChoice==1){return "USA"; }
        else if(depChoice==2){return "England";}
        else if(depChoice==3){return "Canada";}
        else{return "Mexico";}
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
    public void setMailboxCapactity(int capactity){
        this.mailboxCapactity=capactity;
    }

    public void setAlternateEmail(String altEmail){
        this.alternateEmail=altEmail;

    }

    public void changePassword(String password){
        this.password=password;
    }

    public int getMailboxCapactity(){
        return mailboxCapactity;
    }
    public String getAlternateEmail(){
        return alternateEmail;
    }
    public String getPassword(){
        return password;
    }

    public String showInfo(){
        return "DISPLAY NAME: " + firstname+" "+lastname+
                "\nCOMPANY EMAIL: "+email+
                "\nMAILBOX CAPACITY: " + mailboxCapactity+ "mb";
    }



}
