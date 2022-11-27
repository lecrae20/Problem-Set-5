package emailapp;

import java.util.Scanner;

public class Email {
    private String firstname;
    private String lastname;
    private String password;
    private int defaultpasswordLength=10;
    private String department;
    private String email;
    private int mailboxCapactity=500;
    private String alternateEmail;
    private String companySuffix="aeycompany.com";

    public Email(String firstname, String lastname){
        this.firstname=firstname;
        this.lastname=lastname;
        System.out.println("EMAIL CREATED: " + this.firstname +" " + this.lastname);
        this.department=setDepartment();
        System.out.println("Department" + this.department);
        this.password=randomPassword(defaultpasswordLength);
        System.out.println("Your password is: " + this.password);
        email=firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+ department+"."+companySuffix;

    }

    private String setDepartment(){
        System.out.println("New worker: " + firstname+ ". Department codes:\n1 for sales\n2 for Development\n3 for Accounting \n0 for none\nEnter department code: ");
        Scanner in=new Scanner(System.in);
        int depChoice=in.nextInt();
        if(depChoice==1){return "sales"; }
        else if(depChoice==2){return "dev";}
        else if(depChoice==3){return "acct";}
        else{return "";}
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
