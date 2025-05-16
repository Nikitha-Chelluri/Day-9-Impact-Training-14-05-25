import java.util.Scanner;

class ArrangeEvenOdd2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int k = 0; k < n; k++) {
            arr[k] = s.nextInt();
        }
        int arr2[] = new int[n];
        int i = 0;
        int j = n-1;
        while (i<j) {
            if ((arr[i] % 2 == 0) && (arr[j] % 2 != 0)) {
                arr2[i] = arr[i];
                arr2[j] = arr[j];
            }
            else {
                arr2[j] = arr[i];
                arr2[i] = arr[j];
            }
            i++;
            j--;
        }
        for(int k =0; k < n; k++) {
            System.out.print(arr2[k]+"\t");
        }
    }
}