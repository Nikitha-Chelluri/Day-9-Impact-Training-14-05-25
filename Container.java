import java.util.*;

public class Container {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of containers: ");
        int n = scanner.nextInt();
        int[] containers = new int[n];

        System.out.println("Enter the capacities:");
        for (int i = 0; i < n; i++) {
            containers[i] = scanner.nextInt();
        }

        Arrays.sort(containers);

        System.out.println("Container pairs (max with min):");
        for (int i = 0; i < n / 2; i++) {
            int max = containers[n - 1 - i];
            int min = containers[i];
            System.out.println("(" + max + ", " + min + ")");
        }

        if (n % 2 != 0) {
            System.out.println("Unpaired container: " + containers[n / 2]);
        }
    }
}