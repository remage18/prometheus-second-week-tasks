package prometheus;

public class ShellSort {

    public static void main(String[] args) {
        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;

        //PUT YOUR CODE HERE
        int help;
        for(int gap = length / 2; gap > 0; gap /= 2){
            for(int i = gap; i < length; i++){
                for(int j = i - gap; j >= 0 && array[j] > array[j + gap]; j -= gap){
                    help = array[j];
                    array[j] = array[j + gap];
                    array[j + gap] = help;
                }
            }
        }
        //PUT YOUR CODE HERE

        for(int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
