import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    
    System.out.println("Welcome to Neha's Contact List App");
    System.out.println("Press 1 to add a new contact");
    System.out.println("Press 2 to view all contacts");
    System.out.println("Press 3 to search for a contact");
    System.out.println("Press 4 to delete a contact);
    System.out.println("Press 5 to exit program");
    Scanner sc= new Scanner(System.in);
    Menu obj=new Menu();
    int ch=sc.nextInt();
    switch(ch)
   {
     case 1: obj.addCon();
             break;
     case 2: obj.showCon();
             break;
     case 3: obj.searchCon();
             break;
     case 4: obj.deleteCon();
             break;
     case 5: obj.exit();
             break;
    }
	
                       
                  
    
   }
 }
