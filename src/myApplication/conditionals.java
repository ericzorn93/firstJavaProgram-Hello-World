package myApplication;

public class conditionals {
	public static void main(String[] args) {

		//if (some expression that evaluates to true)
		//	do something
		
		boolean sayHello = false;
		boolean sayGoodBye = false;
		boolean sayHey = true;

		//Only the first statement to evaluate to true gets executed
		if (sayHello) {
			System.out.println("Hello");
		} else if (sayHey) {
			System.out.println("Hey!");
		} else {
			System.out.println("Good Bye");
		}
		
		
		//>, <, >=, <=, !=, ==, === relational operators
		
		//if(x = 5) assign 5 to x
		//if(x == 5) test whether x has the value 5 (true or false)
		
		//&& AND, || OR (shift + backslash)
		
		int playerX = 50;
		
		if (true) {
			if(false)
				extracted();
	}
		
		
		//if our player is past the left side of the screen or if the player is the past the right side of the screen
		if(playerX < 0 || playerX > 800) {
			//some code that reverses our player's direction
			System.out.println("OR Executed");
		}
		
	} //End of Main Method

	
	//Extracted method in conditionals class
	private static void extracted() {
		System.out.println("AND executed");
	}
	
} //End of Class
