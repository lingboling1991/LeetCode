package FIN.length_of_last_word;

public class Solution {
    public static int lengthOfLastWord(String s) {
    	
        if(s.length()==0){
        	return 0;
        }
        
        String[] strs = s.split(" ");
        
        if(strs.length==0){
        	return 0;
        }
        
		return strs[strs.length-1].length();
    }
    
    public static void main(String arg[]) {
    	int res = lengthOfLastWord(" ");
    	System.out.println(res);
	}
}
