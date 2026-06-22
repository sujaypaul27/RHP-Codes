import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();

        int MAX = 200000;

        int[] diff = new int[MAX + 2];

        // Difference Array
        for(int i = 0; i < n; i++)
        {
            int l = sc.nextInt();
            int r = sc.nextInt();

            diff[l]++;
            diff[r + 1]--;
        }

        // Frequency of recipes covering each temperature
        int[] freq = new int[MAX + 1];

        freq[1] = diff[1];

        for(int i = 2; i <= MAX; i++)
        {
            freq[i] = freq[i - 1] + diff[i];
        }

        // Mark admissible temperatures
        int[] admissible = new int[MAX + 1];

        for(int i = 1; i <= MAX; i++)
        {
            if(freq[i] >= k)
            {
                admissible[i] = 1;
            }
        }

        // Prefix sum of admissible temperatures
        int[] prefix = new int[MAX + 1];

        prefix[1] = admissible[1];

        for(int i = 2; i <= MAX; i++)
        {
            prefix[i] = prefix[i - 1] + admissible[i];
        }

        // Answer queries
        while(q-- > 0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(prefix[b] - prefix[a - 1]);
        }
    }//....
}// problem link : https://codeforces.com/contest/816/problem/B