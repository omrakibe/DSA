import java.util.Scanner;

interface ISearchRevision
{
    int LinearSearchRevision(int[] arr, int target);
}

class SearchRevision implements ISearchRevision
{
    int steps;

    public int LinearSearchRevision(int[] arr, int target)
    {
        for (int i = 0; i < arr.length; i++)
        {
            steps++;
            if (arr[i] == target)
            {
                System.out.println("Steps: " + steps);
                return i;
            }
        }
        return -1;
    }
}

public class LinearSearchRevision
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);


        System.out.print("Enter size of an Array: ");
        int size = scan.nextInt();

        System.out.print("Enter number to Search: ");
        int target = scan.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = (int) Math.ceil((Math.random()) * 1000);
        }

        SearchRevision ser = new SearchRevision();
        int res = ser.LinearSearchRevision(arr, target);

        if (res != -1)
        {
            System.out.println("Index of " + target + " is: " + res);
        } else
        {
            System.out.println("Target not found in an Array.");
        }

    }
}
