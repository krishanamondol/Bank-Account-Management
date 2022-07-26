public class Service extends  Account{

    public void  Home(){
        System.out.println(" 1 : Log in");
        System.out.println(" 2 :Sing Up");
        System.out.println("Please Select 1/2");
        int number = input.nextInt();
        if (number == 1) {
            logIn();

        }else if (number == 2){
            singUp();
        }
        else {
            Home();
        }
    Menu();
    }

    public void Menu(){
        System.out.println("1 : Account datisls");
        System.out.println("2 : Check Ballence ");
        System.out.println("3 : Deposited Ballence ");
        System.out.println("4 : Withdraw Ballence ");
        System.out.println("Please Select AnyOne : 1 / 2 / 3 or 4");
        try {
            int number = input.nextInt();
            if (number >=5){

            }
            if (number == 1){
                userInformationShow();
                Menu();
            }else if (number == 2){
                checkBallence();
                Menu();
            } else  if (number == 3){
                deposited();
                Menu();
            }else if (number == 4 ){
                withdrew();
                Menu();
            }else if (number == -1){

            }else {
                Menu();
            }
        }
        catch (Exception e){
            System.out.println("Wrong input ");
            e.printStackTrace();
        }


    }


    public void logIn(){

    }
    public void singUp(){
    userInformationAdd();
    }
    public void deposited(){
        System.out.print("Enter The Deposited Amount : ");
        int amount = input.nextInt();
        balance = balance+ amount;
    }
    public void withdrew(){
        System.out.print("Enter The Withdrew Amount : ");
        int amount = input.nextInt();
        if (balance>amount){balance = balance - amount;}

        else if (balance<amount){
            try {
                System.out.println("insufficient Ballence ");
                throw new MyException("insufficient "+"\n");

            } catch (MyException e) {

            }

        }

    }
    public void checkBallence(){
        System.out.println("Your Account Ballence Is : "+balance +"\n");

    }
}
