/*package org.jb.ikmonlinetest;

public class Account {

	public static void main(String[] args) {
		
		class Account<S> {
		    private S accountType;
		    public void add(S newType) {accountType = newType;}
		    public S get() {return accountType;}
		}
			Q: WHich among all these is not a Generic TYpe Declaration 
			 * public class Account(Type) {
		    private Type accountType;
		    public void add(Type newType) {accountType = newType;}
		    public Type get() {return accountType;}
		} this is not Type Generic
			public class Account {
		    private <T> accountType;
		    public void add(<T> newType) {accountType = newType;}
		    public <T> get() {return accountType;}
		} this is not Type Generic
			public class Account {
		    private <T extends Object> accountType;
		    public void add(<T extends Object> newType) {accountType = newType;}
		    public <T extends Object> get() {return accountType;}
		} this is not Type Generic
			public class Account<T> {
		    private T accountType;
		    public void add(T newType) {accountType = newType;}
		    public T get() {return accountType;}
		} is correct type but few errors 

	}

}
*/