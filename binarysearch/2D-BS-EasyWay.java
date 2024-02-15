https://leetcode.com/problems/search-a-2d-matrix/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int column = matrix[0].length;
        int tr=0;
        for(int i=0;i<row;i++)
        {
            if(target <= matrix[i][column-1])
            {
                 tr = i;
                 break;
            }
        }
        int start =0;
        int end = column-1;
        while(start <= end)
        {
            int mid = (start+end)/2;
            if(matrix[tr][mid] == target)
            {
                return true;
            }
            else if(matrix[tr][mid] > target)
            {
                 end = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
        return false;
        
    }
}
