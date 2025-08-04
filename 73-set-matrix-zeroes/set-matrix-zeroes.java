class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] == 0){
                    for(int x = 0; x < m; x++){
                        if(matrix[x][j] != 0){
                            matrix[x][j] = -91827;
                        }
                        
                    }
                    for(int x = 0; x < n; x++){
                        if(matrix[i][x] != 0){
                            matrix[i][x] = -91827;
                        }
                    }
                }
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] == -91827){
                    matrix[i][j]=0;
                }
            }
        }
    }
}