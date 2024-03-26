package Interview_Asked_Program;

import java.util.Arrays;
import java.util.Scanner;

public class practice {
public static void main(String[] args) {
	String org ="bhagvanta";

	String rev="";

	for(int i=org.length()-1;i>=0 ;i--)

	{
	rev=rev+org.charAt(i);
	}
	System.out.println("org");
	System.out.println("rev");

	if(org.equals(rev))
	{
	System.out.println("given String name is pallindrome");
	}
	else
	{
	System.out.println("given string is not pallindrome");
	}
	}
}

