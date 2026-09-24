import java.util.Scanner;

public class BirthMonth {
    void main()
    {
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;

        IO.print("Enter your birth month [1-12]: ");

        if(in.hasNextInt())
        {
            birthMonth = in.nextInt();
            in.nextLine(); // Clear the newline from the buffer

            if(birthMonth >= 1 && birthMonth <= 12)
            {
                IO.println("You said your birth month is " + birthMonth);
            }
            else
            {
                IO.println("You said your birth month was " + birthMonth);
                IO.println("That is invalid, must be [1-12]");
            }
        }
    }
}
