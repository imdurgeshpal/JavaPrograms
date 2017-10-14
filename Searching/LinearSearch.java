import java.util.Scanner;

public class LinearSearch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // for test cases
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); // array size
            int num = sc.nextInt(); // number to be searched
            int a[] = new int[n];
            for (int a_i = 0; a_i < n; a_i++) {
                a[a_i] = sc.nextInt(); // filling the array
            }
            System.out.println(linearSearch(n, a, num));
        }
    }

    public static int linearSearch(int n, int a[], int num) {
        for (int i = 0; i < n; i++) {
            if (a[i] == num)
                return (i + 1);
        }
        return -1;
    }
}
