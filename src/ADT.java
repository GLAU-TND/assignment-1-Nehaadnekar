public interface ContactADT1 {
    void addCon();
    void showCon();

}

public interface MyListADT1<A> {
    void add(A item);
    A delete();
    int search(A item);
   
}
