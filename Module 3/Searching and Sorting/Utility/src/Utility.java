import java.util.*;

public class Utility {
    public static int printFirstElementWhoseValueEqualsIndex(int[] inputArr, int startingIndex, int endingIndex ){
        return printFirstElementWhoseValueEqualsIndex(inputArr, startingIndex, endingIndex, -1 );
    }

    private static int printFirstElementWhoseValueEqualsIndex(int[] inputArr, int startingIndex, int endingIndex, int recentIndex ) {


        if(endingIndex >= startingIndex)
        {
            int mid = startingIndex + (endingIndex - startingIndex)/2;
            if(mid == inputArr[mid])
            {
                recentIndex = mid;
                return printFirstElementWhoseValueEqualsIndex(inputArr, startingIndex, (mid -1), recentIndex);
            }
            if(mid > inputArr[mid])
                return printFirstElementWhoseValueEqualsIndex(inputArr, (mid + 1), endingIndex, recentIndex);
            else
                return printFirstElementWhoseValueEqualsIndex(inputArr, startingIndex, (mid -1), recentIndex);
        }

        return recentIndex;
    }

    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size + 1];
        array[0] = -1;
        for (int i = 1; i <= size; i++) {
            array[i] = scanner.nextInt();
        }
        int startingIndex = 1;
        int index = Utility.printFirstElementWhoseValueEqualsIndex(array, startingIndex, size);
        if(index != -1)
            System.out.println(index);
        else
            System.out.println("NOT_FOUND");
    }
}
