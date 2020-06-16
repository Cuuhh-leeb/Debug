import java.util.Scanner;

public class Debug {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please input something: ");
        System.out.println("Input your name; ");
        String name= input.nextLine();
        System.out.println("Please enter your age: ");
        int age=input.nextInt();
        //transferring from int to string so you need a buffer
        input.nextLine();
        System.out.println("Enter you DOB year: ");
        String dob=input.nextLine();
        System.out.println("Summary: " + "Your name is: " + name + "\n"+"Your age is" + age +"\n"+"Your DOB: " + dob);}

}
