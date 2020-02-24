package adt;
public class Node {
    public String frstname ,lstname,Email;
    public long[] num=new long[2];
    public int index;
    private Node next;
    public Node(String frstname ,String lstname, long[] num,String Email)
    {
        this.frstname=frstname;
        this.lstname=lstname;
        for(int i =0;i<2;i++)
        {
            this.num[i] = num[i];
        }
        this.Email=Email;
        setNext(null);
    }
    public Node getNext()
    {
        return next;
    }
    public void setNext(Node next) 
    {
  
        this.next = next;
    }
}
