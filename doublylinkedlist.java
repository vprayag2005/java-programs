import java.util.Iterator;
import java.util.LinkedList;

public class doublylinkedlist {
    public static void main(String[] args) {
        LinkedList<String> node=new LinkedList<String>();
        node.add("hai");
        node.add("hello");
        node.add("hi");
        Iterator<String> i = node.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        node.remove("hai");
        Iterator<String> j= node.iterator();
        System.out.println();
        while (j.hasNext()) {
            System.out.println(j.next());
        }

    }
}
