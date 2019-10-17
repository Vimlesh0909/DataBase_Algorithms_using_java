package LinkedList;

public class LinkedList {

	Node head;
	
	public LinkedList insert(LinkedList list, int data) {
		
		Node newNode=new Node(data);
		newNode.next=null;
		if(list.head==null)
		{
			list.head=newNode;
			
		}
		else {
			Node last=list.head;
		
			while(last.next!=null) {
			last=last.next;
			
			}
			last.next=newNode;
			}
		
			
		
		
		return list;
	}
	
	public void PrintLinkedListItems(LinkedList list)
	{
		
		Node currentNode=list.head;
		while(currentNode!=null)
		{
			System.out.println(currentNode.data);
			currentNode=currentNode.next;
		}
	}

	public LinkedList addNewNodeatStart(LinkedList list,int nodevalue) {
		
		
		Node node=new Node(nodevalue);
		Node temp=list.head;
		list.head=node;
		list.head.next=temp;
	
			
		return list;
	}
public LinkedList addNewNodeatEnd(LinkedList list,int nodevalue) {
	
		
	Node newNode=new Node(nodevalue);
	newNode.next=null;
	Node lastNode=list.head;
while(lastNode.next!=null) {
	lastNode=lastNode.next;
}
lastNode.next=newNode;
		return list;
}

public Integer getLargestData(LinkedList l) {
	Node head=l.head;
	int max=head.data;
	while(head!=null) {
	if(max<head.data) {
		max=head.data;		
	}
	head=head.next;
	}
	return max;
}
	
public Integer getSecondLargestNo(LinkedList l) {
	Node head=l.head;
	int sMax=head.data;
	int max=head.data;
	while(head!=null) {
		if(max<head.data) {
			sMax=max;
			max=head.data;
		}
//		else if(sMax<head.data){
//			
//			sMax=head.data;
//		}
		head=head.next;
	}
	
	
return sMax;	
}



public Integer getMiddleElement(LinkedList l) {
	Node fastPointer=l.head;
	Node slowPointer=l.head;

	while(fastPointer!=null) {
	fastPointer=fastPointer.next.next;
	slowPointer=slowPointer.next;
	}
	
	
	return slowPointer.data;
	
}
//switch node 1<->2 , 3<->4 and so on..
public LinkedList switchNode(LinkedList l) {

	Node node=l.head;
	Node tempNode;
	Node node2=l.head.next;
	while(node!=null) {
		if(node2!=null)
		{	tempNode=node;
	node=node2;
	node2=tempNode;
	System.out.println(node.data
			+", "+node2.data);
	node=node.next;
	if(node!=null)
	{	
	node2=node.next;}
		}
		else {
			node=null;
		}
	}
	
	return l;
	
	// 8 2 3 5 7 10
	//3 2  8
}

public LinkedList reversList(LinkedList l) {
	Node pre=null;
	Node currentNode=l.head;
	Node next=null;
	while(currentNode!=null) {
		next=currentNode.next;
		currentNode.next=pre;
		pre=currentNode;
		currentNode=next;
	}
l.head=pre;
	
	return l; 
}

public void addNewNodeatInMiddle(Node head,int nodevalue) {
	Node newNode=new Node(nodevalue);
	
	
	
}
	
	public static void main(String args[]) {
		LinkedList l=new LinkedList();
		l=l.insert(l, 2);
		l=l.insert(l, 3);
		l=l.insert(l, 5);
		l=l.insert(l, 7);
		
		l.PrintLinkedListItems(l);
		l=l.addNewNodeatEnd(l, 10);
		
		l=l.addNewNodeatStart(l, 8);
		l.PrintLinkedListItems(l);
		System.out.println("largest no: "+l.getLargestData(l));
		System.out.println("largest no: "+l.getSecondLargestNo(l));
		System.out.println("largest no: "+l.getMiddleElement(l));
	l.switchNode(l);
		System.out.println("Node Switching");
		l.PrintLinkedListItems(l);
		
		System.out.println("reverse Linked List");
		l.reversList(l);
		l.PrintLinkedListItems(l);


	}
	
	
	
	
	
}
