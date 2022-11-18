package EmailApp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String altEmail;
    private String companySuffix = "aeycompany.com";

    //Constructor to receive first and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        //call a method asking for department then return department
        this.department = setDepartment();

        //call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        //combine elements into email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
    }
    //ask for department
    private String setDepartment(){
        System.out.print("NEW WORKER: " + firstName + "\nDEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
        Scanner kb = new Scanner(System.in);
        int depChoice = kb.nextInt();

        if (depChoice == 1){
            return "sales";
        }
        else if (depChoice == 2){
            return "dev";
        }
        else if (depChoice == 3){
            return "acct";
        }
        else {
            return "";
        }
    }
    //generate random pass
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
    //set mailboxCap
    public void setMailboxCapacity(int capacity){

        this.mailboxCapacity = capacity;
    }
    //set the altEmail
    public void setAltEmail(String altEmail){

        this.altEmail = altEmail;
    }
    //change the password
    public void changePass(String password){

        this.password = password;
    }

    public int getMailboxCapacity() {

        return mailboxCapacity;
    }

    public String getAltEmail() {

        return altEmail;
    }

    public String getPassword(){

        return password;
    }

    public String showInfo(){
        return "DISPLAY NAME: " + firstName + lastName +
                "\nCOMPANY EMAIL: " + email +
                "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";

    }

}
