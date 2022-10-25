import java.util.LinkedList;

public class program {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.push(1);
        linkedList.push(2);
        linkedList.push(3);
        linkedList.push(4);
        linkedList.push(5);
        System.out.println("List: " + linkedList);
        System.out.println("Reversed list: " + HW4.LinkedListReverse(linkedList));
        System.out.println("Reversed list: " + HW4.LinkedListReverseIterator(linkedList));
        System.out.println(HW4.CalculateSumOfLinkedListElements(linkedList));
        System.out.println();
    }
}
