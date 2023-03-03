import java.util.*;
class Atm{
    int upin,uid;
    ArrayList<String> t=new ArrayList<>();
    double amount,money=0;
    Scanner sc=new Scanner(System.in);
    Atm(int id,int pin){
        uid=id;
        upin=pin;
        amount=50000;
    }
    public void TransactionDetails(){
        if(t.size()==0){
            System.out.println("No Transactions are done yet");
        }
        else{
            System.out.println(" Your Transactions Details");
            System.out.println();
            for(int i=0;i<t.size();i++){
                System.out.println(t.get(i));
            }
        }
        System.out.println();
    }
    public void Withdraw(){
        System.out.println("Enter amount");
        money=sc.nextInt();
        if(money<=amount){
            amount-=money;
            t.add(money+" is withdrawn from your account "+uid);
            System.out.println("Witndrawn Successfully");
            System.out.println();
            System.out.println("Current Balance is "+amount);
        }
        else{
            System.out.println("No suffcient money in your account");
        }
        System.out.println();
    }
    public void Deposit(){
        System.out.println("Enter amount");
        money=sc.nextInt();
        amount+=money;
        t.add(money+" is deposited to your account "+uid);
        System.out.println();
        System.out.println("Your Current Balance is "+amount);
        System.out.println();
    }
    public void Transfer(){
        System.out.println("Enter account id to which you want to transfer");
        int account_id=sc.nextInt();
        System.out.println("Enter cash you want to transfer");
        money=sc.nextInt();
        if(money<=amount){
        amount-=money;
        t.add(money+" is transfered to the account "+account_id);
        System.out.println(money+" is transfered to the account "+account_id+" successfully");
        System.out.println("Your Current Balance is "+amount);}
        else{
             System.out.println("No suffcient money in your account");
        }
        System.out.println();
    }
    public void Exit(){
        System.out.println("Now remove your card");
        System.out.println();
    }
}
class Atminterface{
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter user id");
         int id=sc.nextInt();
         System.out.println("Enter pin");
         int pin=sc.nextInt();
         Atm user=new Atm(id,pin);
         int choice=0;
         do{
         System.out.println();
         System.out.println("  .........Please choose option.......... ");
         System.out.println();
         System.out.println("1.Withdraw");
         System.out.println("2.Deposit");
         System.out.println("3.Transfer");
         System.out.println("4.Transaction Details");
         System.out.println("5.Exit");
         System.out.println();
         System.out.println("Enter your choice:");
         choice=sc.nextInt();
         switch(choice){
            case 1: user.Withdraw();
                    break;
            case 2: user.Deposit();
                    break;
            case 3: user.Transfer();
                    break;
            case 4: user.TransactionDetails();
                    break;       
            case 5: user.Exit();
                    break;
            default:System.out.println("Select correct option");
                    break;
         }
         }while(choice!=5);
         System.out.println("Thank You for visiting!");
    }
}