// public class Solution {

//     public int backtrack(boolean traversal, int[][] grid, int i, int j) {
//         if (grid[i][j] == -1) return -1;
//         if (traversal) {
//             if (i == 0 && j == 0) {
//                 return grid[i][j];
//             }
//             int tempLeft = -1;
//             int tempTop = -1;
//             if (j != 0) {
//                 tempLeft = backtrack(true, grid, i, j - 1);
//             }
//             if (i != 0) {
//                 tempTop = backtrack(true, grid, i - 1, j);
//             }
//             if (tempLeft > tempTop) tempTop = tempLeft;
//             if (tempTop == -1) return -1;
//             else {
//                 return tempTop + grid[i][j];
//             }
//         } else {
//             int n = grid.length;
//             int m = grid[0].length;
//             if (i == n - 1 && j == m - 1) {
//                 return backtrack(true, grid, i, j);
//             }
//             int temp=0;
//             if(grid[i][j]==1){
//                  temp=1;
//                  grid[i][j]=0;
//             }
//             int tempBottom = -1;
//             int tempRight = -1;
//             if (i < n - 1) {
//                 tempBottom = backtrack(false, grid, i + 1, j);
//             }
//             if (j < m - 1) {
//                 tempRight = backtrack(false, grid, i, j + 1);
//             }
//             if (tempRight < tempBottom) tempRight = tempBottom;
//             if (tempRight == -1) {
//                 if(temp==1) grid[i][j]=1;
//                 return -1;
//                 }
//             else {
//                 int out = tempRight + temp;
//                 if(temp==1) grid[i][j]=1;
//                 return out;
//             }
//         }
//     }

//     public int cherryPickup(int[][] grid) {
//         int ans =  backtrack(false, grid, 0, 0);
//         if(ans==-1) return 0;
        
//         return ans;
//     }
// }
