import java.util.Random;

public class bubbleSort {

    public static int ARRAY_LENGTH = 20;
    private static int[] array = new int[ARRAY_LENGTH];
    private static Random generator = new Random();

    public static void initArray() {
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            array[i] = generator.nextInt(100);
        }
    }

    public static void printArray() {
        for (int i = 0; i < ARRAY_LENGTH - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[ARRAY_LENGTH - 1]);
    }

    public static void swap(int a,int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }


    public static void doSort() {

        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(j,j+1);
                    printArray();
                }
            }
        }
    }

    public static void main(String[] args) {
        initArray();
        printArray();
        doSort();
    }
}
