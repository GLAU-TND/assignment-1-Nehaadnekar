package adt;
import java.util.*;
import java.lang.*;
public class Methods {
    Scanner sc= new Scanner(System.in);
    Node head;
    public void addCon()
    {
       
        String frstname, lstname;
        String Email = "null",  option1="y",option2="y";
        long[] num=new long[2];

        System.out.println("enter the name of the Person");
        System.out.print("First Name: ");
        frstname=sc.nextLine();
        System.out.print("Last Name: ");
        lstname=sc.nextLine();
        System.out.print("Contact Number: ");
        for(int i=0;i<1;i++)
        {
           num[i]= sc.nextLong();
        }
        sc.nextLine();
        System.out.println("Would you like to add another contact number?(y/n)");
        option1 = sc.nextLine();

        if(option1.equals("y"))
        {
            for(int i=1;i<2;i++)
            {

                num[i]= sc.nextLong();
                break;
            }
        }
            System.out.println();
            sc.nextLine();
            System.out.println("Would you like to add Email address?(y/n)");
            option2 = sc.nextLine();
            while (true)
            {
                if (option2.equals("y"))
                {
                    System.out.print("Email address: ");
                    Email = sc.nextLine();
                    break;
                } 
                else 
                {
                    break;
                }
        }
        Node new_node = new Node(frstame,lstname,no,Email);
        if(head==null){
            head=new_node;
            new_node.getNext();
            System.out.println("Inserted");
        }

        else
        {
            Node temp=head;
            while (temp.getNext()!=null)
            {
                temp= temp.getNext();
            }
            temp.setNext(new_node);
            System.out.println("Inserted");
            sort();

    }
    public void sort(){
       
        Node temp= head;
        Node temp3= head;
        if(head!= null && head.getNext()!=null)
        {

            while(temp3.getNext()!=null)
            {

                while (temp.getNext()!=null)
                {
               
                    if(temp.f_name.compareTo(temp.getNext().f_name)>0){
                        String temp2=temp.f_name;
                        temp.f_name=temp.getNext().f_name;
                        temp.getNext().f_name=temp2;

                        temp2=temp.l_name;
                        temp.l_name=temp.getNext().l_name;
                        temp.getNext().l_name=temp2;

                        temp2=temp.Email;
                        temp.Email=temp.getNext().Email;
                        temp.getNext().Email=temp2;

                        long[] array= new long[2];

                        array = temp.num;
                        temp.num = temp.getNext().num;
                        temp.getNext().num = array;


                    }
                    temp=temp.getNext();

                }
                temp3=temp3.getNext();
            }

        }


    }
    public void view(){
        
            Node temp = head;
            if(head== null)
            {
                System.out.println("list is empty");
            }

            else
            {
                System.out.println("contactlist:");
                    while (temp.getNext() != null)
                    {
                    System.out.println("First Name: " + temp.frstname);
                    System.out.println("Last Name: " + temp.lstname);
                    System.out.print("Contact Number: ");
                    for (int i = 0; i < 2; i++) {
                        System.out.print(temp.num[i] + " ,");
                    }
                    System.out.println();
                    System.out.println("Email address: " + temp.Email);
                    temp = temp.getNext();
                }
                System.out.println("First Name: " + temp.frstname);
                System.out.println("Last Name: " + temp.lstname);
                System.out.print("Contact Number: ");
                for (int i = 0; i < 2; i++) {
                    System.out.print(temp.num[i] + " ,");
                }
               
                System.out.println("Email address: " + temp.Email);
          
            }
        }


    public void search(){
      
            Node temp = head;
            Node temp2 = head;
            System.out.println("You could search for a contact from their first names: ");
            String val = sc.nextLine();
            int ctr33 = 0;
            if(head==null){
                System.out.println("list is empty");
                System.out.println("Try Again..");
            }
            else 
            {
                while (temp.getNext() != null)
                {
                    if (val.equals(temp.frstname))
                    {
                        ctr33++;
                    }
                    temp = temp.getNext();
                }
                if (val.equals(temp.frstname)) {
                    ctr33++;
                }
                if (ctr33 == 0) 
                {
                    System.out.println("NOT FOUND");
                } else 
                {
                    System.out.println(ctr33 + " Match Found!");
                }
                while (temp2.getNext() != null) {
                
                    if (val.equals(temp2.f_name)) 
                    {

                        
                        System.out.println("First Name: " + temp2.frstname);
                        System.out.println("Last Name: " + temp2.lstname);
                        System.out.print("Contact Number: ");
                        for (int i = 0; i < 2; i++) {
                            System.out.print(temp2.num[i] + " ,");
                        }
                        System.out.println();
                        System.out.println("Email address: " + temp2.Email);
                       
                    }
                    temp2 = temp2.getNext();
                }
                if (val.equals(temp2.frstname))
                {
                    System.out.println("First Name: " + temp2.frstname);
                    System.out.println("Last Name: " + temp2.lstname);
                    System.out.print("Contact Number: ");
                    for (int i = 0; i < 2; i++) {
                        System.out.print(temp2.num[i] + " ,");
                    }
                    System.out.println();
                    System.out.println("Email address: " + temp2.Email);
                    
                }
            }
        }
    public void delete()
    {
       
        if(head==null)
        {
            System.out.println("list is empty");
            System.out.println("try again..");
        }
        else {
            System.out.println("Here are all your contacts: ");
            
            Node temp = head;
            Node temp2 = head;
            int count = 0;
            while (temp.getNext() != null) {
                System.out.print(count + 1 + ". ");
                System.out.print(temp.frstname + " ");
                System.out.println(temp.lstname);
                count++;
                temp = temp.getNext();
            }
            System.out.print(count + 1 + ". ");
            System.out.print(temp.frstname + " ");
            System.out.println(temp.lstname);
            System.out.print("Press the number against the contact to delete it: ");
            int choice = sc.nextInt();
            while (choice > 1) {
                temp2 = temp2.getNext();
                choice--;
            }
            System.out.print(temp2.frstname + " ");
            System.out.println(temp2.lstname + "'s contact deleted from list!");
            temp2.f_name = "null";
            temp2.l_name = "null";
            for (int i = 0; i < 2; i++) {
                temp2.no[i] = 0;
            }
            temp2.Email = "null";
        }
    }
    public void exit()
    {
       
        System.out.println("Successfully Exit");
    }
}
