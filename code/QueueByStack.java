import java.util.LinkedList;

public class QueueByStack {
	   LinkedList<Integer> stack1 = new LinkedList<Integer>();
	   LinkedList<Integer> stack2 = new LinkedList<Integer>();
	   
       public void inQueue(int value){
    	   stack1.push(value);
       }
       
       public int deQueue()throws Exception{
    	   int result = 0;
    	   if(stack1.isEmpty() && stack2.isEmpty()){
    		   throw new RuntimeException();
    	   }
    	   if(stack2.isEmpty()){
    		   while(!stack1.isEmpty()){
    			   stack2.push(stack1.pop());
    		   }
    	   }
    	   result = stack2.pop();
    	   return result;
       }
       
       public static void main(String []args) throws Exception{
    	   QueueByStack qs = new QueueByStack();
    	   qs.inQueue(30);
    	   qs.inQueue(20);
    	   qs.inQueue(30);
    	   System.out.println(qs.deQueue());
    	   System.out.println(qs.deQueue());
    	   System.out.println(qs.deQueue());
       }
}
