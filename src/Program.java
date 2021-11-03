import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author Tom Tsiliopoulos
 * @studentID 100100100
 * @date November 3, 2021
 *
 */

public class Program
{
    // constants
    public static final int NUM_OF_PEOPLE = 10;

    /**
     * This function returns the square of the value parameter
     *
     * @param value a floating point number to be sqaured
     * @return returns the square of value
     */
    public static float square(float value)
    {
        return value * value;
    }

    /**
     * This function builds an array of Person objects by instantiating NUM_OF_PEOPLE Person objects
     *
     * @param people an array of Person objects
     */
    public static void buildPersonArray(Person[] people)
    {
        for (int i = 0; i < NUM_OF_PEOPLE; i++)
        {
            people[i] = new Person();
        }
    }

    public static void buildPersonArrayList(ArrayList<Person> people)
    {
        for (int i = 0; i < NUM_OF_PEOPLE; i++)
        {
            people.add(new Person());
        }
    }

    public static void buildPersonLinkedList(LinkedList<Person> people)
    {
        for (int i = 0; i < NUM_OF_PEOPLE; i++)
        {
            people.add(new Person());
        }
    }

    /**
     * The entry point for our program
     *
     * @param args an array of command line parameters
     */
    public static void main(String[] args)
    {

        var people = new LinkedList<Person>();

        buildPersonLinkedList(people);

        //ArrayList<Person> people = new ArrayList<Person>(); // creates a new empty list of Person object shape

        //buildPersonArrayList(people);

        //Person[] people = new Person[NUM_OF_PEOPLE];

        //buildPersonArray(people);

        System.out.println("Hello, World!");

        float valueToSquare = 5;
        float squaredValue = square(valueToSquare);

        // example of output
        System.out.println("The Squared Value is: " + squaredValue);

        // Step 1. for input we need to create a Scanner object
        Scanner inputObject = new Scanner(System.in);
        System.out.print("Enter your name: ");
        // Step 2. use the Scanner object to get the "next" line of data in this case a String value
        String name = inputObject.nextLine();

        System.out.print("Enter your age: ");
        int age = inputObject.nextInt();

        Person person = new Person(name, age);

        people.set(0, person);
        people.get(0).SaysHello();

    }
}
