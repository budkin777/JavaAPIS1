import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class S2z1 {

    public static int[] createArray(int amountOfElements) {
        int[] array = new int[amountOfElements];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int temp : arr) {
            System.out.print(" " + temp);
        }
        System.out.print(" ]\n");

    }

    public static File createFile() throws IOException {
        File file = new File("log");
        if (file.createNewFile()) {
            System.out.println("File is created!");
        } else {
            System.out.println("File already exists.");
        }
        return file;

    }

    public static int[] bubbleSortLog(int[] arr) throws IOException {
        FileWriter writer = new FileWriter("log", true);
        int len = arr.length - 1;
        int temp;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < len; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
                String s = Arrays.toString(arr);
                writer.write(s);
                writer.append('\n');
                writer.flush();
            }
        }
        return arr;
    }

    public static void main(String[] args) throws IOException {
        int a[] = createArray(6);
        printArray(a);
        bubbleSortLog(a);
        printArray(a);
    }

}
