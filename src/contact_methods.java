import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Contact {
    public static ArrayList<Person> contact=new ArrayList<>();

public void addContact(){
    Scanner sc=new Scanner(System.in);
    System.out.println("add a new contact: \n" +
            "Please enter the first Name:");
    String firstname=sc.nextLine();
    System.out.println("Last Name");
    String lastname=sc.nextLine();
    System.out.println("Contact Number");
    String num=sc.nextLine();
    ArrayList list=new ArrayList();
    list.add(num);
    System.out.println("Would you like to add another contact number? (y/n)");
    String num2=sc.nextLine();

    while(n.equals("y")){
        num=sc.nextLine();
        list.add(num);
        System.out.println("Would you like to add another contact number? (y/n)");
num2=sc.nextLine();
    }
    System.out.println("Would you like to add email address? (y/n): ");
    num2=sc.nextLine();
    String mailID;
    if (num.equals("y")){
        mailID=sc.nextLine();
    }
    else{
        mailID=null;
    }


contact.add(new Person(firstname,lastname,list,mailID));
    System.out.println(contact);
    Collections.sort(contact,new Sortbyname());


}
void view(){
    for(int i=0;i<contact.size();i++){
    System.out.println(contact.get(i));}
}
void search(){
    System.out.println("search for a contact from their first names: ");
    Scanner sc=new Scanner(System.in);
    String ans=sc.nextLine();
    for(int i=0;i<contact.size();i++){
        if(Person.equalsto(contact.get(i),ans)){
            System.out.println(contact.get(i));

        }
    }
}void delete(){
        System.out.println("Here are all your contacts: ");
        for(int i=0;i<contact.size();i++){
            System.out.println((i+1) +" . " + Person.getFirstname(contact.get(i)));
        }
        System.out.println("Press the number against the contact to delete it:");
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        System.out.println(Person.getFirstname(contact.get(i))+" contact deleted from list!");
        contact.remove(i);

    }
