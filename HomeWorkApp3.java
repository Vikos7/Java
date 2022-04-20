package lesson3;

public class HomeWorkApp3 {
    public static void main(String[] args) {
        System.out.println("Task 1: ");
        invertArray();
        System.out.println("Task 2: ");
        fillArray();
        System.out.println("Task 3: ");
        cnahgeArray();
        System.out.println("Task 4: ");
        fillDiagonal();
        System.out.println("Task 5: ");
        twoArguments(6,2);
        System.out.println("Task 6: ");
        maxMinElements();

    }
        public static void invertArray () {
            int[] arr = {1, 0, 1, 0, 0, 1};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    arr[i] = 1;
                } else {
                    arr[i] = 0;
                }
                System.out.print(arr[i] + " | ");
            }
            System.out.println();

        }

        public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " | ");
        }
            System.out.println();
        }
        public static void cnahgeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 6) {
                arr[i]= arr[i] * 2;
            }
            System.out.print(arr[i] + " | ");
            }
            System.out.println();
        }

        public static void fillDiagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i== j) {
                        arr[i][j]= 1;
                }
                System.out.print(arr[i][j] + " | ");
        }
            System.out.println();
        }
                }
        public static void twoArguments(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
            System.out.println();
    }
        public static void maxMinElements() {
        int[] arr = {4, 7, 10, 2, 12, 8, 3, 9, 5 };
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Max:" + max);
        System.out.println("Min:" + min);
    }

}







