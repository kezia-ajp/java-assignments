import java.util.*;

public class  DistinctValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();  // number of test cases

        while (T-- > 0) {
            int n = sc.nextInt();  // size of array

            HashSet<Integer> set = new HashSet<>();

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                set.add(Math.abs(x));
            }

            System.out.println(set.size());
        }

        sc.close();
    }
}
