package extra;


import javax.swing.JOptionPane;

public class SimpleCalculator 
{
	public static void main(String[] args) 
	{

		// 1. Get 2 numbers from the user and convert them to integer.
		String num1 = JOptionPane.showInputDialog("Please input an integer: ");
		int int1 = Integer.parseInt(num1);
		String num2 = JOptionPane.showInputDialog("Please input another integer: ");
		int int2 = Integer.parseInt(num2);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "Would you like to add, subtract, multiply, or divide?", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Division", "Multiplication", "Subtraction", "Addition" },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.

		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
	

	// 4. Create similar methods for subtraction, multiplication and division.
	 
	 if(operation == 3)
	 {
	addition(int1, int2);
	 }
	 	else if (operation == 2)
	 	{
	 		subtraction(int1, int2);
	 	}

	 		else if (operation == 1)
	 		{
	 			multiplication(int1, int2);

	 		}
	 			else if (operation == 0)
	 			{
	 				division(int1, int2);
	 			}	
	
		// TODO Auto-generated method stub
		
	}
	
	private static void addition(int int1, int int2) 
	{
		int int3;
		int3 = int1 + int2;
		System.out.println(int1 + " + " + int2 + " = " + int3);

	}


	private static void subtraction(int int1, int int2)
	{
		int int4;
		int4 = int1 - int2;
		System.out.println(int1 + " - " + int2 + " = " + int4);
	}

	private static void multiplication(int int1, int int2)
	{
		int int5;
		int5 = int1* int2;
		System.out.println(int1 + " * " + int2 + " = " + int5);
	}

	private static void division(int int1, int int2)
	{
		int int6;
		int6 = int1/int2;
		System.out.println(int1 + "/" + int2 + " = " + int6);
	}


}