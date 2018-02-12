package seven.nine;

import java.util.Iterator;

public class CircularArray<T> implements Iterable<Node<T>> {
	public Node<T> firstNode;
	private Integer cantNodes=0;
	
	
	public void rotate() 
	{
		firstNode = firstNode.next;
	}

	public void addNode() 
	{
		//...
		cantNodes++;
	}
	
	
	@Override
	public Iterator<Node<T>> iterator() {
        Iterator<Node<T>> it = new Iterator<Node<T>>() {

            private Node<T> currentNode = firstNode;
            Integer count = 0;

            @Override
            public boolean hasNext() {
                return count<cantNodes || currentNode != firstNode;
            }

            @Override
            public Node<T> next() {
            	Node<T> node = currentNode;
            	currentNode = node.next;
            	count++;
                return node;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
		return it;
	}
	
	
	
	
}
