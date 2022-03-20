package ramadhana.sapta.senoaji;
import java.util.NoSuchElementException;

public class SinglyLinkedList<E> {
    private ListNode<E> firstNode;
    private ListNode<E> lastNode;
    private String name;

    public SinglyLinkedList() {
        this("linked list");
    }

    public SinglyLinkedList(String listName) {
        name = listName;
        firstNode = lastNode = null;
    }

    public void insertAtBack(Lagu insertItem) {
        ListNode newNode = new ListNode(insertItem);
        if (isEmpty()) { // firstNode and lastNode refer to same object
                    firstNode = lastNode = new ListNode<E>(insertItem);
        } else { // lastNode refers to new node
            lastNode.next = newNode;
            newNode.perv = lastNode;
            lastNode = newNode;
        }
    }

    public Lagu removeFromBack() throws NoSuchElementException {
        if (isEmpty()) { // throw exception if List is empty
            throw new NoSuchElementException(name + " is empty");
        }
        Lagu removedItem = lastNode.data; // retrieve data being removed
        // update references firstNode and lastNode
        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        } else { // locate new last node
            ListNode<E> current = lastNode.perv;
            lastNode.perv = null;
            lastNode = current; // current is new lastNode
            current.next = null;
        }
        return removedItem; // return removed node data
    }

    public Lagu removeByJudul(String judul) throws NoSuchElementException {
        if (isEmpty()) { // throw exception if List is empty
            throw new NoSuchElementException(name + " is empty");
        }
        Lagu removedItem = null;
        // update references firstNode and lastNode
        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        } else {
            ListNode<E> current = firstNode;
            while (current.getData().getJudul() != judul) {
                // if there's no match
                if (current.next == null) {
                    return current.data;
                }
                current = current.next;
            }
            removedItem = current.data;
            ListNode<E> pervNode = current.perv;
            ListNode<E> nextNode = current.next;

            // decouple the next and prev node from current
            if (nextNode != null && pervNode != null) { // current node not at front or back
                pervNode.next = nextNode;
                nextNode.perv = pervNode;
            } else if (nextNode == null) { // current node at back
                pervNode.next = null;
                lastNode = pervNode;
            } else if (pervNode == null) { // current node at front
                nextNode.perv = null;
                firstNode = nextNode;
            }

            // decouple current
            current.perv = null;
            current.next = null;

        }
        return removedItem; // return removed node data
    }

    private boolean isEmpty() {
        return firstNode == null;
    }

    public void print() {
        if (isEmpty()) {
            System.out.printf("Empty %s\n", name);
            return;
        }
        ListNode<E> current = firstNode;
        // while not at end of list, output current node's data
        while (current != null) {
            System.out.printf("%s \n", current.data);
            current = current.next;
        }
        System.out.println();
    }
}