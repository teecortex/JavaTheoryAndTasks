import java.lang.reflect.Array;

public class Main {
    private static int BinarySearch(int[] myArray, int element){
        int low = 0;
        int high = myArray.length - 1;
        int element_position = -1;
        while (low <= high){
            if (element > myArray[(high + low)/2]){
                low = ((high + low)/2) + 1;
            }
            else if (element < myArray[(high + low)/2]){
                high = ((high + low)/2) - 1;
            }
            else{
                element_position = (high + low)/2;
                break;
            }
        }
        return element_position;
    }
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 19, 21, 37};
        System.out.println(BinarySearch(myArray, 3));
    }
}


