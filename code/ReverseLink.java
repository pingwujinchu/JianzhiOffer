
public class ReverseLink {
     
	class LinkList {
		int value;
		LinkList next;
		
		public LinkList(int value) {
			super();
			this.value = value;
		}
	}
	
	public static LinkList reverse(LinkList root){
		 if(root.next == null){
			 return root;
		 }
		 LinkList befor = root;
		 LinkList  pNext = root.next;
		 if(pNext.next == null){
			 pNext.next = root;
			 root.next = null;
			 return pNext;
		 }
		 LinkList pTNext = pNext.next;
		 while(pTNext != null){
			 pNext.next = befor;
			 if(befor == root){
				 befor.next = null;
			 }
			 befor = pNext;
			 pNext = pTNext;
			 pTNext = pTNext.next;
		 }
		 pNext.next = befor;

		 return pNext;
		 
	}
	
	public static void main(String[]args){
		LinkList root = new ReverseLink().new LinkList(0);
		LinkList nod1 = new ReverseLink().new LinkList(1);
		LinkList nod2 = new ReverseLink().new LinkList(2);
		LinkList nod3 = new ReverseLink().new LinkList(3);
		LinkList nod4 = new ReverseLink().new LinkList(4);
		LinkList nod5 = new ReverseLink().new LinkList(5);
		LinkList nod6 = new ReverseLink().new LinkList(6);
		LinkList nod7 = new ReverseLink().new LinkList(7);
		LinkList nod8 = new ReverseLink().new LinkList(8);
		
		root.next = nod1;
		nod1.next = nod2;
//		nod2.next = nod3;
//		nod3.next = nod4;
//		nod4.next = nod5;
//		nod5.next = nod6;
//		nod6.next = nod7;
//		nod7.next = nod8;
		
		root = ReverseLink.reverse(root);
		
		while(root != null){
			System.out.println(root.value);
			root = root.next;
		}
	}
}
