package myApplication;

public class helloWorld {
	public static void main(String[] args) { //Main Method
		sayHelloTo("Eric", "Zorn"); //Calls sayHelloTo method with Args
	}
	
	static void sayHelloTo(String name, String lastName) {
		String hello = "Hello, "; //Creates String Variable
		System.out.println(hello + name + " " + lastName); //Concatenates Strings and Prints to Console
	}
}
