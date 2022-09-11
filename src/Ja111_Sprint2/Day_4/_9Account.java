package Ja111_Sprint2.Day_4;

public class _9Account {
    String customerName;
    double balance;
 static  String bankName;
    public static void main(String[] args) {
        _9Account.bankName="HDFC";
        _9Account yourAccount=new _9Account();
        yourAccount.balance=75152151589.1234;
        yourAccount.customerName="Anand";

        _9Account myAccount=new _9Account();
        myAccount.customerName="Ankita";
        myAccount.balance=78454454545454782.1548;

        System.out.println(yourAccount.customerName+yourAccount.balance);
        System.out.println(_9Account.bankName);
    }
}
