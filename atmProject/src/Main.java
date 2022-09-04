import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int balance = 1500, right = 3, select;
        String username, password;
        boolean isContinue = true;
        Scanner scanner = new Scanner(System.in);
        while (isContinue) {
            System.out.println("Welcome!");
            System.out.println("Enter your username: ");
            username = scanner.nextLine();
            System.out.println("And your password: ");
            password = scanner.nextLine();
            if(username.equals("patika") && password.equals("dev123")){
                System.out.println("Welcome to your bank account.");
                System.out.println("1-Deposit money \n 2-Withdraw money \n 3-Balance query \n 4-Exit");
                System.out.println("Please select the operation: ");
                select = scanner.nextInt();
                switch (select){
                    case 1:
                        System.out.println("The amount will be deposited: ");
                        int amount = scanner.nextInt();
                        balance += amount;
                        System.out.println("Do you want to do any other operation: Y/n");
                        String choice = scanner.nextLine();
                        switch (choice){
                            case "Y":
                                continue;
                        }
                    case 2:
                        System.out.println("The amount will be withdrawn: ");
                        amount = scanner.nextInt();
                        balance -= amount;
                        break;
                    case 3:
                        System.out.println("Your balance is: " + balance);
                        break;
                    case 4:
                        System.out.println("Have a good day.");
                        break;
                }
                isContinue = false;
            }else{
                System.out.println("Username or password is wrong, please try again.");
                right--;
                switch (right){
                    case 0:
                        System.out.println("Your account has been blocked, please contact with the bank.");
                    default:
                        System.out.println("Remaining rights: " + right);
                }
            }
        }
    }
}
