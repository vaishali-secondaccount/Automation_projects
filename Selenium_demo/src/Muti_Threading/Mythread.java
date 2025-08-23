package Muti_Threading;
//We can create Multi threading using
//1. By extending Thread class
//2. By implementing Runnable Interface

public class Mythread extends Thread{
	synchronized void alphabet() throws InterruptedException
	{
		for(char ch='A';ch<='Z';ch++)
		{
		System.out.print(ch+" ");
		Thread.sleep(50);
		}
	}
	synchronized void numbers()throws InterruptedException
	{
		for(int i=1;i<=10;i++)
		{
		System.out.print(i+" ");
		Thread.sleep(1);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Mythread my=new Mythread();// creating thread
		//System.out.println(Thread.currentThread().getName());
		my.alphabet();// assign task for printing alphabets
		
	   
		Mythread my1=new Mythread();// creating second thread
		my1.numbers();// assign task for printing numbers
		my.start();
		Thread.sleep(5);
		my1.start();

	}

}
