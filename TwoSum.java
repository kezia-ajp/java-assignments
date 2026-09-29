import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();

            int[] arr = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            boolean found = false;

            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {

                    if (arr[i] + arr[j] == K) {
                        System.out.println(i + " " + j);
                        found = true;
                        break;
                    }
                }

                if (found) {
                    break;
                }
            }

            if (!found) {
                System.out.println("-1 -1");
            }
        }

        sc.close();
    }
}
