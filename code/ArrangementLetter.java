
public class ArrangementLetter {
       public void ArrangementLetter (String str){
    	   ArrangementLetter(str.toCharArray(),0,"");
       }
       
       public void ArrangementLetter(char[]ch,int start,String prefix){
    	   
    	   if(start == ch.length){
    		   System.out.println(prefix);
    		   return;
    	   }
    	   for(int i = start ; i < ch.length ; i++ ){
    		   String newPrefix = prefix+ch[i];
    		   swap(ch,start,i);
    		   ArrangementLetter(ch,start + 1,newPrefix);
    		   swap(ch,start,i);
    	   }
       }
       
       public void swap(char[]arr,int i ,int j){
    	   char tem = arr[i];
    	   arr[i] = arr[j];
    	   arr[j] = tem;
       }
       
       public static void main(String []args){
    	   ArrangementLetter al = new ArrangementLetter();
    	   al.ArrangementLetter("absc");
       }
}
