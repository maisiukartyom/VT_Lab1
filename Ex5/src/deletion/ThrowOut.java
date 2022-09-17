package deletion;

public class ThrowOut {
        public int lis( int arr[], int n )
        {
            int result = 0;
            int[] lis = new int[n];

            for (int i = 0; i < n; i++ )
                lis[i] = 1;

            for (int i = 1; i < n; i++ )
                for (int j = 0; j < i; j++ )
                    if ( arr[i] > arr[j] &&
                            lis[i] < lis[j] + 1)
                        lis[i] = lis[j] + 1;

            for (int i = 0; i < n; i++ )
                if (result < lis[i])
                    result = lis[i];

            return result;
        }

        public int minimumNumberOfDeletions(int arr[],
                                            int n)
        {
            int len = lis(arr, n);

            return (n - len);
        }
}
