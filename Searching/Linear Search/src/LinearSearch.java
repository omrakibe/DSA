import java.util.Scanner;

interface ISearch
{
    int linearSearch(int []arr, int target);
}

class Search implements ISearch
{
    int steps = 0;
    public int linearSearch(int []arr, int target)
    {
        for(int i=0; i<arr.length; i++)
        {
            steps++;
            if(arr[i] == target) {
                System.out.println("Steps: " + steps);
                return i;
            }
        }
        System.out.println("steps: " + steps);
        return -1;
    }
}

public class LinearSearch
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[100000];
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = (int)Math.floor(Math.random() * 100000);
        }

        System.out.print("Enter Number to search in array: ");
        int target = scan.nextInt();
        Search ser = new Search();
        int res = ser.linearSearch(arr, target);
        if(res != -1)
        {
            System.out.println("Index of " + target + " in an Array is: " + res);
        } else {
            System.out.println("Target not found in Array");
        }
    }
}