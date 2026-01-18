//linkelidt ki class bani
class LLs{

    Node head;

    //class ky andr ek node class ishe tareky sai represent krty hein
    class Node{

        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;

        }
    }

    //node class compleet ho gai.
    //add first
    //fuction likty hein krny ky leya

    public void addFirst(String data){
        //new node create krlety hein ab
        Node newNode = new Node(data);
        if (head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        //new node create krlety hein ab
        Node newNode = new Node(data);
        if (head==null){
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public void printList() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

}

public class LinkListLastEditind
{
    public static void main(String[] args) {

        //linkelist banay ky leya class ka object

        LLs list = new LLs();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();


        list.addLast("lst");
        list.printList();

    }
}
