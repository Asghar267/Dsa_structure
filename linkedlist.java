package Lab;

public class IULinkedList<T> {

	
	
    private Node<T> head;
    private int count;
 IULinkedList(T Val)
    {
     count = 0; 
	 head = new Node();
      head.SetVal(Val); 
    }

 
 void add(T Val)
 {
	count++;
	 Node<T> n = new Node<T>();
	 n.SetVal(Val);
	 Node<T> temp = head;
	 while(temp.GetNext() != null)
	 {
		 temp = temp.GetNext();
	 }
	
	 temp.SetNext(n); 
	 
	 
 }
 
 T get(int index)
 {
	  Node<T> temp = head;
	 if(index>-1 && index<=count)
	 {
		 for(int i=0;i<index;i++)
		 {
			 temp = temp.GetNext();
		 }
	 }
	return temp.GetVal();
 }
 
 
 
 
 
 
 public String toString()
 {
	
	Node<T> pri= head;
		String s=pri.GetVal()+"  ";
		while(pri.GetNext() != null)
		{
			pri = pri.GetNext();
			s=s+pri.GetVal()+ "  ";
		}
	 
	return s;
 }
 
 
 
}
