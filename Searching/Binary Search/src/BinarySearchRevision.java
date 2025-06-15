import java.util.Scanner;

class BinarySearch2
{
    int Binary2(int[] arr, int target, int left, int right)
    {
        while (left <= right)
        {
            int mid = (right + left) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                return Binary2(arr, target, mid + 1, right);
            else
                return Binary2(arr, target, left, mid - 1);
        }
        return -1;
    }
}

public class BinarySearchRevision
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

//        System.out.print("Enter the size of an Array: ");
//        int size = scan.nextInt();
        int[] arr = new int[]{1, 2, 4, 5, 6, 7, 67, 98, 105};
//        for (int i = 0; i < arr.length; i++)
//        {
//            arr[i] = (int) Math.floor(Math.random() * 1000);
//        }

        System.out.print("Enter number to be Search in an Array: ");
        int target = scan.nextInt();

        BinarySearch2 bs = new BinarySearch2();
        int res = bs.Binary2(arr, target, 0, arr.length - 1);

        if (res != -1)
            System.out.println("Index of " + target + " is: " + res);
        else
            System.out.println("Number not found!!");

    }
}
