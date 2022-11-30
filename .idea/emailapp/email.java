package emailapp;

import java.util.Scanner;

public class email extends Socialmedia{
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private String companySuffix = "company.com";

    
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        
        this.department = setDepartment();

        
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
    }

    
    private String setDepartment() {
        System.out.println("New worker: " + firstName + "\nDepartment codes:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "sales";
        }
        else if (depChoice == 2) {
            return "dev";
        }
        else if (depChoice == 3) {
            return "acct";
        }
        else {
            return "";
        }
    }

    
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

   
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    
    public void changePassword(String password){
        this.password = password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }
    public String getAlternateEmail() {
        return alternateEmail;
    }
    public String getPassword() {
        return password;
    }

    public String showInfo() {
        return "DISPLAY NAME: " + firstName + lastName + "\nCOMPANY EMAIL: " + email + "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
    }
}


