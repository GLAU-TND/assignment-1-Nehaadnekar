import list.MyList;
import java.util.Scanner;
import adt.ContactADT1;

class Menu implements ContactADT1
{  
    MyList<String> con = new MyList<>();
    Scanner sc = new Scanner(System.in);
    
    public void addCon()
    {
        System.out.println("Please enter the name of the person");
        String frst_name = sc.nextLine();
        String lst_name = sc.nextLine();
        String contact= sc.nextLine();
        Con.add(contact);
        
        System.out.println("would you like to enter another contact? (Y/N)");
        String answr = sc.nextLine();
        while(answr == "Y" || answr == "y")
        {
            contact= sc.nextLine();
            Con.add(contact);
            
            System.out.println("would you like to enter another contact? (Y/N)");
            String answr = sc.nextLine();
        }
        System.out.println("would you like to add email address? (Y/N)");
        String answr2 = sc.nextLine();
        if(answr2=="Y"||answr2=="y")
        {
            String mail=sc.nextLine();
            Con.add(mail);
         }
        

    }


    public int exit()
    {
       System.out.println("Thankyou, visit again!");
       return 0;
     }  
     
     
     public void showCon()
     {
     
     }
     
     
     
     
     
     
     
     
     
     
     
}
