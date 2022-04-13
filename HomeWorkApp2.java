package lesson2;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println(within10and20(7, 7));
        isPositiveOrNegative(5);
        System.out.println(isNegative(0));
        printWordNTimes("Hello", 5);
    }

    public static boolean within10and20(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        }else {
            return false;
        }
    }
    public static void isPositiveOrNegative(int x) {
        if (x>=0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    public static boolean isNegative(int x) {
        if (x<0) {
            return true;
        }
        return false;
    }

    public static void printWordNTimes(String x, int n) {
        for ( int i = 1; i < n; i++) {
            System.out.println(x);
        }
    }


}



