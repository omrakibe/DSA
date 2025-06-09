class Search3
{
    int Search(int[] arr, int target, int left, int right)
    {
        if (left <= right)
        {
            int mid = (left + right) / 2;
            if (arr[mid] == target)
            {
                return mid;
            } else if (arr[mid] < target)
            {
                return Search(arr, target, mid + 1, right);
            } else
            {
                return Search(arr, target, left, mid - 1);
            }
        }
        return -1;
    }
}

public class RBinarySearch
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 8;
        Search3 ser = new Search3();
        int res = ser.Search(arr, target, 0, arr.length - 1);

        if (res != -1)
        {
            System.out.println("Index of " + target + " is: " + res);
        } else
        {
            System.out.println("Element not found in an array");
        }
    }
}
