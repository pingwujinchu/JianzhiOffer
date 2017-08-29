import java.util.LinkedList;

public class StackFlow {
	   LinkedList stack = new LinkedList();
       public boolean isPopOrder(int []push,int []pop){
    	   boolean isPopOrder = false;
    	   int i = 0,j = 0,curr = 0;
    	   if(push.length == 0){
    		   return false;
    	   }

    	   for( ;j < pop.length ; j++){
    		   while(stack.isEmpty()||(Integer)stack.peek()!=pop[j]){
    			   	if(i < push.length){
    			   	   stack.push(push[i++]);
    			   	}else{
    			   		isPopOrder = false;
    			   		break;
    			   	}
    		   }
    		   
    		   if(!stack.isEmpty() && (Integer)stack.peek()== pop[j]){
    			   stack.pop();
    		   }
    	   }
    	  if(stack.isEmpty() && j == pop.length ){
    		  isPopOrder = true;
    	  }
    	  return isPopOrder;
       }
       
       
       public static void main(String[]args){
    	   StackFlow sf = new StackFlow();
    	   System.out.println(sf.isPopOrder(new int[]{1,2,3,4,5}, new int[]{4,3,5,2,1}));
       }
}
