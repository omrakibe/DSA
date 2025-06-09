class Search1
{
    int steps = 0;

    int BSearch(int[] arr, int target)
    {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            steps++;
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                System.out.println("Steps: " + steps);
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Steps: " + steps);
        return -1;
    }
}

public class BinarySearch
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{5, 6, 7, 8, 9};
        int target = 9;

        Search1 ser = new Search1();
        int res = ser.BSearch(arr, target);

        if (res != -1) {
            System.out.println("Index of " + target + " in an Array is: " + res);
        } else {
            System.out.println("Element not found in an array.");
        }

    }
}