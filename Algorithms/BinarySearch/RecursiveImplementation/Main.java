import java.lang.reflect.Array;

public class Main {
    private static int BinarySearch(int[] myArray, int element, int low, int high){
        int mid = (low + high)/2;
        if (low <= high){
            if (element < myArray[mid]){
                return BinarySearch(myArray, element, low, mid - 1);
            }
            else if (element > myArray[mid]){
                return BinarySearch(myArray, element, mid + 1, high);
            }
            else{
                return mid;
            }
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 19, 21, 37};
        System.out.println(BinarySearch(myArray, 5, 0, 8));
    }
}


