package unit7;
import java.util.ArrayList;

public class text {
    public static void main(String[] args) {
     ArrayList<Integer> list;
     list=new ArrayList<Integer>();
     // Define element
     Integer one=1;
     Integer two=2;
     int three=3;
     
     // add to the ArrayList
     list.add(one);
     list.add(two);
     list.add(three);
     
     // Perform an operation
     int sum=0;
     for(int i=0;i<list.size();i++) {
    	 sum+=list.get(i);
    	 System.out.println("i:"+i+",type:"+list.get(i).getClass().getSimpleName());
     }
     System.out.println("sum="+sum);
    }
}