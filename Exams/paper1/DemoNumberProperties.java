/*Complete the given java code to display the properties of a given number. The properties are: isPerfectSquare,
previousNumber, nextNumber (defined in the class named" Properties).
Please Note: The structure of the program given in the Question should not be altered
class Properties
{
boolean isPerfectSquare;
int previousNumber;
int nextNumber;
}
class DemoNumberProperties
{
//main method
public static void main(String s[])
{
Call the get_numberProperties method to return the class Properties object
}                                                                                                                                                         // The get_numberPropertiesmethod should be defined here with suitable signatures
get_numberProperties method with suitable signatures
{
Here write the code to create Properties of class object.
Get the required properties of the input number and
Assign them to the Properties class object.
Also return the created object.
}
Expected Output:                                                                                           For the input :25 the expected output is as follows:
The number is : 25
isPerfectSquare = true
previousNumber = 24
nextNumber = 26  */

class Properties {
  boolean isPerfectSquare;
  int previousNumber;
  int nextNumber;
}

class DemoNumberProperties {
  // Main method
  public static void main(String s[]) {
      // Example input: number = 25
      int number = 25;

      // Call the get_numberProperties method to return the class Properties object
      Properties properties = get_numberProperties(number);

      // Display the properties
      System.out.println("The number is : " + number);
      System.out.println("isPerfectSquare = " + properties.isPerfectSquare);
      System.out.println("previousNumber = " + properties.previousNumber);
      System.out.println("nextNumber = " + properties.nextNumber);
  }

  // get_numberProperties method
  public static Properties get_numberProperties(int number) {
      // Create a new Properties object
      Properties props = new Properties();

      // Check if the number is a perfect square
      double sqrt = Math.sqrt(number);
      props.isPerfectSquare = (sqrt == Math.floor(sqrt)); // True if sqrt is an integer

      // Assign previous and next numbers
      props.previousNumber = number - 1;
      props.nextNumber = number + 1;

      // Return the Properties object
      return props;
  }
}
