package Practice_program;

public class Findingcountof_vowels
 
 {
	public static void main(String[] args) 
	{
		String s="sandhya";
	    int count=0;
	    for(int i=0;i<s.length();i++)
	    {
	        if
	        
	        (s.charAt(i)=='a'||
	        s.charAt(i)=='e' ||
	        s.charAt(i)=='i' ||
	        s.charAt(i)=='o' ||
	        s.charAt(i)=='u')
	        	
	        count++;
	    }
	    System.out.println(count);
		
	}
}
