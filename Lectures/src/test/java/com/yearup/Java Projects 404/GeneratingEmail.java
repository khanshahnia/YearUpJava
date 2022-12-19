import java.util.Scanner;

public class GeneratingEmail {

    private String firstName,lastName,Password,dept,Email;
    int mailboxCapacity;
    int defaultPasswordLength=10;
    //constractor to receive the first and last name
    //Ask for dept
    //Generate random pass
    //set Mailbox capacity
    //Change password, get alternate email
    //costructor to receive the email
    public GeneratingEmail(String firstaName,String lastName,String dept){
        this.firstName=firstaName;
        this.lastName=lastName;
        this.dept=dept;
        this.Email=firstaName+"."+lastName+"."+dept+"@ gmail.com";

       System.out.println("Your Email is : "+ this.Email);

        this.Password=RandomPassword(defaultPasswordLength);
       System.out.println("your Password is: "+ this.Password);

    }
    //Return random password
    public String RandomPassword (int length){

        String PassSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$%";
        char[] pass=new char[length];
        for (int i=0;i<length;i++){

            int random=(int) (Math.random() * PassSet.length());
            pass[i]=PassSet.charAt(random);
        }

        return new String(pass);

    }

    public void changePassword(String newPassword){
        this.Password=newPassword;

    }

    public void Display(){
        System.out.println(firstName+lastName+Email+"Capacity");
    }

}
