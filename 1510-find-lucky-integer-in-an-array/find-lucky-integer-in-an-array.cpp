class Solution {
public:
    int findLucky(vector<int>& arr) {
        int a[501] = {0};

        for (int i = 0; i < arr.size(); i++) {
            a[arr[i]]++;
        }

        int max = -1;

        for (int i = 0; i <= 500; i++) {
            if (i == a[i] && a[i] != 0) {
                if (max < a[i]) {
                    max = i;
                }
            }
        }
        return max;
    }
};