class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> ans;

        for (int row = 1; row <= numRows; row++) {
            long long val = 1;
            vector<int> ansRow;

            ansRow.push_back(1);

            for (int col = 1; col < row; col++) {
                val = val * (row - col) / col;
                ansRow.push_back(val);
            }

            ans.push_back(ansRow);
        }

        return ans;
    }
};
