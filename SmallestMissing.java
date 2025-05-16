import java.util.Scanner;

class SmallestMissing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int k = 0; k < n; k++) {
            arr[k] = s.nextInt();
        }
        int missing = 1;
        for(int i =0; i < n; i++) {
            if(arr[i] == missing) {
                missing++;
                i = 0;
            }
        }        
        System.out.print(missing);
    }
}