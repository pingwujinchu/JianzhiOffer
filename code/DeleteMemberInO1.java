
public class DeleteMemberInO1 {
      class LinkList{
    	  int val;
    	  LinkList next;
		public LinkList(int val) {
			super();
			this.val = val;
		}
      }
      
      public void deleteNumInO1(LinkList ll,LinkList curr){
    	  if(curr.next == null){
    		  if(ll == curr){
    			  ll = null;
    		  }else{
    			  LinkList head = ll;
    			  while(head!= null && head.next != curr){
    				  head = head.next;
    			  }
    			  head.next = null;
    		  }
    	  }
    	  curr.val = curr.next.val;
    	  curr.next = curr.next.next;
      }
      
      public static void main(String []args){
    	  
      }
}
