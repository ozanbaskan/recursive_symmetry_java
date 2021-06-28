import java.util.Scanner;

public class Symmetry {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int input;
        do
        {
            System.out.print("Enter a number bigger than 0: ");
            input = s.nextInt();
        } while(input < 0);
        symmetry(input, false, input);
    }

    static void symmetry(int n, boolean backwards, int i)
    {
        System.out.print(n + " ");
        if (n < 0) {
            symmetry(n + 5, true, i);
            return;
        }
        if (backwards == false)
        {
            symmetry(n - 5, backwards, i);
        }
        else
        {
            if (n == i) return;
            symmetry(n + 5, true, i);
        }

    }

}
