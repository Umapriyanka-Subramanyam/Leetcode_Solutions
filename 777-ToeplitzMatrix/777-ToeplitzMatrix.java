// Last updated: 7/14/2026, 2:18:03 PM
class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        for(int i=0;i<rows-1;i++){
            for(int j=0;j<cols-1;j++){
                if(matrix[i][j]!=matrix[i+1][j+1]){
                    return false;
                }
            }
        }
        return true;
    }
}