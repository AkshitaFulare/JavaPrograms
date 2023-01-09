package StackJava;

import java.lang.String;
public class Stack {
	private int stackArray[];
	private int stackSize;
	private int topPointer;
	Stack()
	{
		topPointer = -1;
		this.stackSize = 20;
		stackArray = new int[20];
	}
	Stack(int stackSize)
	{
		topPointer = -1;
		this.stackSize = stackSize;
		this.stackArray = new int[stackSize];
	}
	public boolean stackIsEmpty()
	{
		if(topPointer == -1)
		{
			return true;
		}
		return false;
	}
	public boolean stackIsFull()
	{
		if(topPointer == stackSize-1)
		{
			return true;
		}
		return false;
	}
	public void push(int elementToBePushed)
	{
		if(stackIsFull() == true)
		{
			System.out.println("Error...\nStack is full\nelement cannot be pushed\n");
			return;
		}
		this.stackArray[++topPointer] = elementToBePushed;
	}
	public int pop()
	{
		if(stackIsEmpty()==true)
		{
			System.out.println("Error...\nStack is empty\npop operation not possible\n");
			return -9997;
		}
		return stackArray[topPointer--];
	}
	public int getTopElement()
	{
		if(stackIsEmpty()==true)
		{
			return -9998;
		}
		return stackArray[topPointer];
	}
}