import java.util.Scanner;

public class clearBuffer {
    public static void main(String[] args) {

        Scanner in  = new Scanner(System.in);
        int favNum = 0;
        int birthMonth =0;
        String name ="";
        String newLine = "";
        boolean done = false;
        String trash = "";

do {
    System.out.println("Please enter your favorite integer number: ");
    if (in.hasNextInt()) {
    favNum = in.nextInt();
    newLine = in.nextLine();
    done = true;
}
    else {
        trash = in.nextLine();
        System.out.println("Wrong input, Try again " + trash);
        done = false;
    }
}
while (!done);

do {
    System.out.println("Please enter your birth month as a number: ");
    if (in.hasNextInt())
    {

        birthMonth = in.nextInt();
        newLine = in.nextLine();
        done = true;
    }
    else {
        trash = in.nextLine();
        System.out.println("Wrong input, Try again " + trash);
        done = false;
    }
}
while (!done);

do {
    System.out.println("Please enter your name: ");
    if (in.hasNextLine())
    {

        name = in.nextLine();

        done = true;
    }
    else {
        trash = in.nextLine();
        System.out.println("Wrong input, Try again " + trash);
        done = false;
    }
}
while (!done);

System.out.println("Your favorite number is: " + favNum);
System.out.println("Your birth number is: " + birthMonth);
System.out.println("Your name is: " + name);

System.out.println("Thanks!");

        }
    }
