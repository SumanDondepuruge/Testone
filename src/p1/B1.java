package p1;

public class B1 {
public static void main(String args[]) {
	ex h = new ex();
	ex h2 = new ex();
	ex h3 = new ex();
	
}
}
class ex{
	int x=2;
	static int y=2;
	
	public ex() {
		x++;
		y++;
		System.out.println("value of x is: "+y);
		System.out.println("value of x is: "+x);
	}
}
