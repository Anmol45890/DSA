class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));

        //Har row ka first element 

        for (int i = 0; i < n; i++) {
            pq.add(new int[] { matrix[i][0], i, 0 });
        }

        // k-1 elements remove karo
        for (int i = 0; i < k - 1; i++) {

            int[] curr = pq.poll();

            int row = curr[1];
            int col = curr[2];

            // Same row ka next element
            if (col + 1 < n) {
                pq.add(new int[] {
                        matrix[row][col + 1],
                        row,
                        col + 1
                });
            }
        }

        return pq.peek()[0];
    }
}