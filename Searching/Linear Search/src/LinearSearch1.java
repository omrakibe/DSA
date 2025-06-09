class Search1
{
    int Search1(int []arr, int target)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==target) {
                return i;
            }
        }
        return -1;
    }
}

public class LinearSearch1
{
    public static void main(String[] args)
    {
        int []arr = new int[] {4, 6, 3, 6, 2, 7};
        int target = 6;

        Search1 ser = new Search1();
        int res = ser.Search1(arr, target);

        if(res != -1)
        {
            System.out.println(res);
        } else {
            System.out.println("No such element");
        }

    }
}
