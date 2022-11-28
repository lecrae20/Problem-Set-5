package emailapp;

import java.util.Scanner;

public class Socialmedia {
    private String firstname;
    private String lastname;
    private String password;
    private int defaultpasswordLength=8;
    private String country;
    private String email;
    private int mailboxCapactity=500;
    private String alternateEmail;
    private String companySuffix="aeycompany.com";

    public Email(String firstname, String lastname){
        this.firstname=firstname;
        this.lastname=lastname;
        System.out.println("EMAIL CREATED: " + this.firstname +" " + this.lastname);
        this.country=setCountry();
        System.out.println("Country" + this.country);
        this.password=randomPassword(defaultpasswordLength);
        System.out.println("Your password is: " + this.password);
        email=firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+ country+"."+companySuffix;

    }

    private String Country(){
        System.out.println("New worker: " + firstname+ ". Country codes:\n1 for USA\n2 for England\n3 for Canada \n0 for Mexico\nEnter department code: ");
        Scanner in=new Scanner(System.in);
        int depChoice=in.nextInt();
        if(depChoice==1){return "USA"; }
        else if(depChoice==2){return "England";}
        else if(depChoice==3){return "Canada";}
        else{return "Mexico";}
    }
    private String randomPassword(int length){
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
