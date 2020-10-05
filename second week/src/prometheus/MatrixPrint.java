package prometheus;

public class MatrixPrint {

    public static void main(String[] args){
        //PUT YOUR CODE HERE
        int size = 5;
        int s = 1;
        int [][] arr = new int[size][size];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = s++;
            }
        }
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {
                if(i == j || size - i - 1 == j) {
                    System.out.printf("%2c ", '*');
                } else {
                    System.out.printf("%2d ", arr[i][j]);
                }
            }
            System.out.println();
        }
        //PUT YOUR CODE HERE
    }
}
