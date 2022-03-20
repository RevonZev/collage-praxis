package ramadhana.sapta.senoaji;

public class ListNode<E> {
    E data;
    ListNode<E> next;
    ListNode<E> perv;

    public ListNode(E object){
        data = object;
        this.next = null;
        this.perv = null;
    }

    public E getData(){
        return data;
    }
}
