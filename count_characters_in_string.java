import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(int i=0;i<s.length();i++){
		    char c = s.charAt(i); 
		   if(map.containsKey(c)){
		         map.put(c, map.get(c) + 1);
		    }else{
		        map.put(c,1);
		    }
		    
		}
		int max_count = 0;
		char max_character= 'x';
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        	for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char c = entry.getKey(); 
            int count = entry.getValue();
            if(count>max_count){
                max_count=count;
                max_character=c;
                
            }
        }
        System.out.println(max_count);
        System.out.println(max_character);
        
      /*
      max_count=0; 
      1->c=p ,count=1 , max_count=1 , max_character=p;
      2->c=a , count=3, max_count=3, max_character=a;
      3->c=r, count=1, max_count=3, max_character=a;
      4->c=s, count=1, max_count=3, max_character=a;
      5->c=n count=2, max_count=3 , max_character=a;
      */
        

	}
}
