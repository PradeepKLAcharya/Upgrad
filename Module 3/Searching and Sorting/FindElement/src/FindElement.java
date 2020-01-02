import java.util.*;

public class FindElement {
    static int bSearch ( int[] arr, int needle)
    {
        boolean done = false;
        int i = 1;
        int lower = 1;
        int upper = 2;
        int temp;
        while (!done)
        {
            try{
                if (needle == arr[upper])
                    return upper;
                else if (needle > arr[upper])
                {
                    temp = lower;
                    lower = upper;
                    upper = temp + (int) Math.pow(2,i);
                    i = i + 1;
                }
                else
                {
                    done = true;
                    break; //found the upper bounds
                }
            }
            catch (IndexOutOfBoundsException e)
            {
                upper = (upper -lower) / 2;
                i = 0;
            }
        }
        if (done == true)
        {
            return binarySearch(arr, lower, upper, needle);
        }

    else
        return -1;
    }

    public static int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int elementToSearch = scanner.nextInt();
        int array[] = new int[size + 1];
        array[0] = -1;
        for (int i = 1; i <= size; i++) {
            array[i] = scanner.nextInt();
        }

        int index = FindElement.bSearch(array, elementToSearch);
        if(index!=-1)
            System.out.println(index);
        else
            System.out.println("NOT_FOUND");
    }
}