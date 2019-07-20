package p1;

import java.util.Scanner;

public class If {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the mark obtained");
	int mark=sc.nextInt();
	mark=mark/10;
	String grade="";
	switch(mark)
	{
	case 9:
		grade="o";
		break;
	case 8: 
		grade="e";
		break;
	case 7:
		grade="f";
		break;
	case 6:
		grade="g";
		break;
	case 5:
		grade="h";
		break;
	case 4:
		grade="j";
		break;
	default:
		grade="L";
		}
	System.out.println("grade is "+grade);
}
}
