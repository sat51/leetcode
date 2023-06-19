class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int m = matrix.length;
        int n = matrix[0].length;
        Boolean flag = false;
        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][n-1]<target){
                    break;
                }
                else if(matrix[i][j]==target){
                   flag = true; 
                }
                
            }
        }
        return flag;
    }
}