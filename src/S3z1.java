public class S3z1 {
    public static void main(String[] args) {
        int[] array = createArray(10);
        printArray(array);
        mergeSort(array);
        printArray(array);


    }

    private static int[] createArray(int size) {
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int)(Math.random() * 100);
        }
        return array;
    }

    private static void printArray(int[] array) {
        int size = array.length;
        for(int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void mergeSort(int[] array) {
        int n = array.length;

        if(n == 1) return;

        int mid = n/2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for(int i = 0; i < mid; i++) {
            l[i] = array[i];
        }
        for(int i = 0; i < n - mid; i++) {
            r[i] = array[mid + i];
        }
        mergeSort(l);
        mergeSort(r);
        megre(array, l, r);


    }
    // Слияние
    private static void megre(int[] array, int[] l, int[] r) {
        int left = l.length;
        int right = r.length;
        int indexL = 0, indexR = 0;
        int indexArray = 0;

        while(indexL < left && indexR < right) {
            if(l[indexL] < r[indexR]) {
                array[indexArray] = l[indexL];
                indexL++;
                indexArray++;
            } else {
                array[indexArray] = r[indexR];
                indexR++;
                indexArray++;
            }
        }
        for (int i = indexL; i < left; i++) {
            array[indexArray++] = l[i];
        }
        for (int j = indexR; j < right; j++) {
            array[indexArray++] = r[j];
        }
    }
}
