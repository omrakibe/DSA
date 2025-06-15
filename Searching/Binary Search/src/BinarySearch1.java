class Search2
{
    int bSearch(int[] arr, int target, int left, int right)
    {
        if (left <= right)
        {
            int mid = (left + right) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                return bSearch(arr, target, mid + 1, right);
            else
                return bSearch(arr, target, left, mid - 1);

        }

//        int left = 0;
//        int right = arr.length - 1;
//        while (left <= right) {
//            int mid = (left + right) / 2;
//
//            if (arr[mid] == target) {
//                return mid;
//            } else if (arr[mid] < target) {
//                left = mid + 1;
//            } else {
//                right = mid - 1;
//            }
//        }
        return -1;
    }
}

public class BinarySearch1
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{2, 4, 5, 6, 7, 8, 67};
        int target = 677;

        Search2 ser = new Search2();
        int res = ser.bSearch(arr, target, 0, arr.length - 1);

        if (res != -1)
        {
            System.out.println("Index of " + target + " in an Array is: " + res);
        } else
        {
            System.out.println("Element not found in an Array");
        }
    }
}
