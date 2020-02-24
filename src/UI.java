package adt;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Users {
    public void contactList() {

        try {
            System.out.println("Welcome to Riya's Contact List App");
            Scanner sc = new Scanner(System.in);
            System.out.println("want to enter in App");
            System.out.println("press " + 1 + " for enter:");
            System.out.println("press " + 0 + " for exit");
            int choice = sc.nextInt();
            if (choice == 1) {
                try {
                   
                    modulesCreation ob = new modulesCreation(); 

                    while(true) {
                        try {
                            
                            System.out.println(" * press " + 1 + " to add new contact");
                            System.out.println(" * press " + 2 + " to view all contacts");
                            System.out.println(" * press " + 3 + " to search for a contact");
                            System.out.println(" * press " + 4 + " to delete a contact");
                            System.out.println(" * press " + 5 + " to exit program");
                            int input_choice = sc.nextInt();
                            if (input_choice == 1) {
                                ob.addCon();
                            }
                            if (input_choice == 2) {
                                ob.viewCon(); 
                            } else if (input_choice == 3) {
                             ob.searchCon(); 
                             } else if (input_choice == 4) {
                             ob.deleteCon(); 
                             } else if (input_choice == 5) {
                             ob.exit(); 
                             break;
                             }
                            else if(input_choice>5){
                                System.out.println("Wrong Attempt");
                                System.out.println("Try Again..");
                            }
                        }
                        catch (InputMismatchException e){
                            System.out.println("Wrong Input");
                            break;
                        }
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Wrong Input");

                }

            } else if (choice == 0) {
                System.out.println("Successfully Exit ");
            } else {
                System.out.println("Wrong Input, Try Again");
            }
        } catch (InputMismatchException e) {
            System.out.println("Try Again");

        }
    }
}
