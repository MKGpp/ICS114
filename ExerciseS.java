/*
Goals: To gain experience with
1. declaring and initializing variables
2. arithmetic operators: / %
3. type casting (explicit and implicit)
4. syntax errors
5. constants

Instructions:
Provide the Java code indicated by the comments (//)
Save, compile and run after each step.
When there is a question, supply your answer in a comment.
(This will be useful to you when you are studying later.)
Do not remove the comments once you have completed a task!!
*/

public class ExerciseS {
    public static void main(String args[]) {
        System.out.println("Variables, Arithmetic Operators, and Type Casting\n");
        
        int num = 0; 					//Here: Declare 2 integer variables with variable names: num, count.
		int count = 0; 					/*Initialize both to zero.
										Question: What if you initialize an integer to 0.0? Try it.
										Answer: javac has an error, "possible lossy conversion from double to int" */
        
        double tempurature = 0.0;		//Here: Declare 2 double variables with variables names: temperature, price.
		double price = 0.0;				/*Initialize both to zero.
										Question: Do you have to use 0.0 (ie Can you just use 0?) Why or why not?
										System.out.println(tempurature); when temperature = 0 results in output 0.0
										so I would say yes you can just use 0 and java will convert to a double. */ 
        
										/*Here: Remove the comment indicator from the following output statement.
										Observe the \n. What does it do?
										The /n creates a newline  in the output similar to println but can be 
										used inside string literals*/
        
		System.out.println("Temperature is: " + tempurature + "\nPrice is: " + price);
        
        float depth = 0.0f; 			/*Here: Declare a float variable called depth.
										Initialize it to 0.0.
										Compile. What happens? Why? How can we correct the error? (four ways)*/
										/* float type needs to be typecasted either with = (float) 0.0; or = 0.0f;
										another way would be to use double instead of float*/
        
        price = 150.99;					//Here: Provide an assignment statement to store 150.99 in variable price.
										//System.out.println("Price is now: " + price); tested updated variable assignment
        
		count = count + (int) price;	//Here: Provide an assignment statement to store price in count.
										/*What happens? Why? How can it be fixed?
										Causes a syntax error, cannot store type double in type int.
										must either change count to double OR typecast price as an int in the reassignment*/
        
										//Here: Remove the comment from the following statement to display price and count.
										/*Think: What do you expect to happen?
										the println statement will return price 150.99 and count 150
										because price was typecasted into an int the value of .99 get dropped*/
        System.out.println("price is " + price + " and count is " + count);
        
        num = 10;						//Here: Provide an assignment statement to store the value 10 in variable num.
        
        count = 3;						//Here: Provide an assignment statement to store the value 3 in variable count.
        
        int quotient;					//Here: Declare an integer variable called quotient.
        quotient = num / count;			//Initialize it to num/count
        
										//Here: Remove the comment indicator from the following output statement.
        System.out.println(num + "/" + count + ": quotient is: " + quotient);
        
        int remainder;					//Here: Declare an integer variable called remainder.
        remainder = num % count;		//Initialize it to the remainder when num is divided by count.
        
										//Here: Copy the System.out.println statement from above and paste it here.
        System.out.println(num + "/" + count + ": remainder is: " + remainder);
        
        float floatQuotient;			//Here: Declare a float variable called floatQuotient.
        floatQuotient = num / count;	//Initialize it to num / count.
        
										//Here: Again, paste the System.out.println statement here.
        System.out.println(num + "/" + count + ": floatQuotient is: " + floatQuotient);
        
										/*Here: Change all of the above System.out.println statements to 
										System.out.print statements. Observe the output. What happens? Why?
										All output gets placed on the same long messy line because println ends
										each statement with a new line and print does not*/
        
        float value;					//Here: Declare a float called value.
        value = num / count;			//Initialize it to num / count.
										//Notice the implicit type conversion that is done.
		System.out.println(num + "/" + count + ": value is: " + value);
        
		float valueR;					//Here: Copy and paste the above two lines and then change the integer division operator 
		valueR = (float)num % count;	//to the modulo operator.
										/* You will have to make one change. Try to compile to determine what needs to be changed.
										Is there implicit type conversion again?
										variable name needs to be changed, there is implicit type conversion again*/
		System.out.println(num + "/" + count + ": valueR is: " + valueR);
		
										//Here: Let's see floating point division.
		float size;						//Declare variables called size, height, width. The first two are of type float and the last of type int.
		float height = 100.3f;			//Initialize height to 100.3 and width to 7.
		int width = 7;					//Provide an assignment statement that assigns size the value of height / width.
		size = height / width;			/*Question: What type of division is this?
										//Write a System.out.println statement to output size, height and width.
										this is floating point division because java will use implicit type 
										conversion when dividing a float with an int.*/
		System.out.println("size is: " + size + " height is: " + height + " width is: " + width);
        
										//Here: This is the formula to convert a Fahrenheit temperature to Celcius
										//5 / 9 * (fahrenheit -32)
										//Declare and initialize variables to perform this conversion.
										//You need not get input from the user. Simply use an assignment statement to store a value in fahrenheit.
										//Output the celsius value as a real number.
										//Once you have done this, replace the values 5, 9, 32 with constants. (See zyBooks: Constants)
		int fahrenheit = 90;
		int celsius;
		final int five = 5;
		final int nine = 9;
		final int thrtwo = 32;
		
		celsius = ((fahrenheit-thrtwo) * five) / nine;
		
		System.out.println(fahrenheit + " degrees fahrenheit is " + celsius + " degrees in celsius!");
    }
}
