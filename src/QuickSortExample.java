import java.util.Random;

public class QuickSortExample {
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

    public static void quickSort() {
        int startIndex = 0;
        int endIndex = ARRAY_LENGTH - 1;
        doSort(startIndex, endIndex);
    }

    public static void swap(int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    private static void doSort(int start, int end) {
        if (start >= end)
            return;
        int a = start;
        int z = end;
        int cur = a;

        while (a < z) {
            if (array[a] <= array[z]) {
                swap(a, cur);
                cur++;
                a++;
            } else {
                a++;
            }
        }

        swap(a, cur);
        printArray();
        doSort(start, cur - 1);
        doSort(cur, end);
    }

    public enum Singleton {
        INSTANCE;
        int i;
    }

    public static void main(String[] args) {
        initArray();
        printArray();
        quickSort();
        Singleton si = Singleton.INSTANCE;
        si.i = 0;
    }
}