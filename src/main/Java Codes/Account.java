import java.util.Scanner;
public class Account {
    private String Name;
    private String Gender;
    private String PhoneNo;
    int balance;
    Scanner input = new Scanner(System.in);

      void userInformationAdd(){
        System.out.print("Enter Account Holder Name : ");
         Name = input.nextLine(); Name = input.nextLine();
        System.out.print("Enter Account Holder Gender : ");
        Gender = input.nextLine();
        System.out.print("Enter Phone Number : ");
        PhoneNo = input.nextLine();
          balance = 0;
    }


    public String getGender() {
        return Gender;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public String getName() {
        return Name;
    }
    void userInformationShow()
    {
        System.out.println("User Name : "+getName() +" User Gender : "+getGender()+" Mobile Number : "+ getPhoneNo() );
    }

}
