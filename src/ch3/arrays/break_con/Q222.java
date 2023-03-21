package ch3.arrays.break_con;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Q222 {
    public static void main(String[] args) {
  
    	
    	List<String>lst= Arrays.asList("EN","FR","CH","FR");
        Iterator<String> itr=lst.iterator();
        
        while(itr.hasNext()){
            String e=itr.next();
            
            if(e=="CH"){
                break;
            }
            System.out.println(e +" ");
        }
    }
}

/*
What is the result? 
 A. EN FR JP
 B. EN FR 			>>OK
 C. CH
 D. EN FR CH
 
 */