package StackJava;

public class StackJava {
	public static void main(String[] args) {
		Stack s1 = new Stack();
		Stack e2 = new Stack(5);
		e2.push(1);
		e2.push(2);
		e2.push(3);
		e2.push(4);
		e2.push(5);
		System.out.println(e2.getTopElement());
	}

}

