package ramadhana.sapta.senoaji;

public class ListNode<E> {
    Lagu data;
    ListNode<E> next;
    ListNode<E> perv;

    public ListNode(Lagu object){
        data = object;
        this.next = null;
        this.perv = null;
    }

    public Lagu getData(){
        return data;
    }
}
