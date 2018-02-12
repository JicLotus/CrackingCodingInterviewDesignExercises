
import seven.nine.*;
import seven.one.*;

public class main {

	public static void main(String[] args) {
		
		Node<Integer> node = new Node<Integer>();
		node.value =10;
		node.next = node;
		
		Node<Integer> node2 = new Node<Integer>();
		node2.value =20;
		node2.next = node;
		
		node.next = node2;
		
		
		CircularArray<Integer> circ = new CircularArray<Integer>();
		circ.firstNode = node;
		circ.addNode();
		circ.addNode();
		
		for (Object o : circ) 
		{
			System.out.print(((Node<Integer>)o).value);
		}
		
	}

}
