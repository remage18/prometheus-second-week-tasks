package prometheus;

public class BinarySearch {

    public static void main(String[] args) {

        int[] data = { 3, 6, 7, 10, 34, 56, 60 };
        int numberToFind = 10;

        // PUT YOUR CODE HERE
        int min = 0, max = data.length -1, index = -1;
        while(min <= max) {
            int middle = (min + max) / 2;
            if (data[middle] < numberToFind) {
                min = middle + 1;
            } else if (data[middle] > numberToFind) {
                max = middle - 1;
            } else {
                index = middle;
                break;
            }
        }
        System.out.println(index);
        // PUT YOUR CODE HERE
    }
}
