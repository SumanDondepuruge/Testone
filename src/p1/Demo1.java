package p1;

public class Demo1 implements Demo{
public static void main(String args[]) {
	Demo d = new Demo1();	
	d.deposit(100);
	d.withdraw(200);

}
int balance=1000;

public void withdraw(int a) {
	
	int C = balance-a;
	System.out.println(C);
}

public void deposit(int a) {
	
	int D = balance-a;
	System.out.println(D);
}
}
