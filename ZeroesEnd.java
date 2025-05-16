import java.util.*;

public class ZeroesEnd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int arr[] = new int[t];
        for(int r = 0; r < t; r++) {
            arr[r] = s.nextInt();
        }
        for (int q = 0; q < t; q++) {
            int n = arr[q];
            int arr0[] =  new int[10];
            int arr1[] =  new int[10];
            int temp = 0;
            int i = 0; 
            int j = 0;
            int count0 = 0;
            int count1 = 0;
            while(n > 0) {
                temp = n % 10;
                if ( temp == 0) {
                    arr0[i] = temp;
                    i++;
                    count0++;
                }
                else if (temp == 1) {
                    arr1[j] = temp;
                    j++;
                    count1++;
                }
                n = n / 10;
            }
            for(int k = 0; k < count1; k++) {
                System.out.print(arr1[k]);
            }
            for(int p = 0; p < count0; p++) {
                System.out.print(arr0[p]);
            }
            System.out.println();
        }
    }
}