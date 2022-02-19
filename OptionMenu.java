package com.company;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account {
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00"); //TO DENOTE WHAT KIND OF MONEY

    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();  //Create map "data" and add a few login options within the getLogin method

    public void getLogin() { //Constructs an IOException with null as its error detail message
        int x = 1;
        do {
            try{
                data.put(9363355,60020);  //9363355 - Pointing to customer ID, 60020 - Pointing to the pin
                data.put(2747825, 123456);

                System.out.println("Welcome to WTV Credit Union ATM.");
                System.out.println("Enter Customer ID");
                setCustomerID(menuInput.nextInt());

                System.out.println("Enter your Pin Number");
                setPinNumber(menuInput.nextInt());
            }catch (Exception e) {
                System.out.println("Invalid Character(s). Numbers Only");
                x = 2;
            }
            int cn = getCustomerID();
            int pn = getPinNumber();
            if (data.containsKey(cn) && data.get(cn) == pn){
                getAccountType();
            }else
                System.out.println("Wrong Customer Number or Pin Number");
        } while (x == 1);
    }

    public void getAccountType() {
        System.out.println("Select Account You Want to Access:");
        System.out.println("Option 1 - Saving Account");
        System.out.println("Option 2 - Exit");

        int selection = menuInput.nextInt();

        switch (selection) {
            case 1:
                getSaving();
                break;

            case 2:
                System.out.println("Thank you for using this ATM!");
                break;

            default:
                System.out.println("Invalid Choice");
                getAccountType();
        }
    }
    public void getSaving(){
        System.out.println("Saving Account: ");
        System.out.println("Option 1 - Balance Enquiry");
        System.out.println("Option 2 - Withdrawal");
        System.out.println("Option 3 - Deposit");
        System.out.println("Option 4 - Exit");
        System.out.println("Choice:" );

        int selection = menuInput.nextInt();

        switch (selection) {
            case 1:
                System.out.println("Saving Account Balance is: " + moneyFormat.format(getSavingBalance()));
                getAccountType();

            case 2:
                getsavingWithdrawInput();
                getAccountType();
                break;

            case 3:
                getsavingDepositInput();
                getAccountType();
                break;

            case 4:
                System.out.println("Thank You for using this ATM!");
                break;

            default:
                System.out.println("Invalid Input");
                getSaving();
        }

    }


}
