import java.util.HashMap;
import java.util.LinkedList;

public class MergeSortedList {
	class LinkNode{
		int value;
		LinkNode next;
		
		public LinkNode(int value) {
			super();
			this.value = value;
		}
	}
	
	public static LinkNode mergeLinkList(LinkNode l1,LinkNode l2){
		LinkNode result = null;
		if(l1 == null){
			return l2;
		}
		if(l2 == null){
			return l1;
		}
		
		if(l1.value <= l2.value){
			result = l1;
			l1 = l1.next;
			result.next = mergeLinkList(l1,l2);
		}
		else{
			result = l2;
			l2 = l2.next;
			result.next = mergeLinkList(l1,l2);
		}
		
		return result;
	}
	
	public static void test(){
		LinkNode l1 = new MergeSortedList().new LinkNode(0);
		LinkNode l2 = new MergeSortedList().new LinkNode(5);
		LinkNode l3 = new MergeSortedList().new LinkNode(10);
		LinkNode l4 = new MergeSortedList().new LinkNode(52);
		LinkNode l5 = new MergeSortedList().new LinkNode(60);
		LinkNode l6 = new MergeSortedList().new LinkNode(120);
		LinkNode l7 = new MergeSortedList().new LinkNode(123);
		LinkNode l8 = new MergeSortedList().new LinkNode(456);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = l6;
		l6.next = l7;
		l7.next = l8;
		
		LinkNode l9 = new MergeSortedList().new LinkNode(5);
		LinkNode l10 = new MergeSortedList().new LinkNode(21);
		LinkNode l11= new MergeSortedList().new LinkNode(32);
		LinkNode l12 = new MergeSortedList().new LinkNode(40);
		LinkNode l13 = new MergeSortedList().new LinkNode(46);
		LinkNode l14 = new MergeSortedList().new LinkNode(53);
		LinkNode l15 = new MergeSortedList().new LinkNode(62);
		LinkNode l16 = new MergeSortedList().new LinkNode(87);
		LinkNode l17 = new MergeSortedList().new LinkNode(91);
		l9.next = l10;
		l10.next = l11;
		l11.next = l12;
		l12.next = l13;
		l13.next = l14;
		l14.next = l15;
		l15.next = l16;
		l16.next = l17;
		
		LinkNode l =mergeLinkList(l1, l9);
		while(l != null){
			System.out.println(l.value);
			l = l.next;
		}
		
	}
	
	public static void main(String []args){
		test();
		LinkedList ll = new LinkedList();
		HashMap h = new HashMap(10);

	}
}
