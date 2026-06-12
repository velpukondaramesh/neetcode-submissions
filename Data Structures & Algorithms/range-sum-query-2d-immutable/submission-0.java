class NumMatrix {

    int[][] prefix;

    public NumMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        prefix = new int[rows][cols];

        for(int i = 0; i < rows; i++){
            prefix[i][0] = matrix[i][0];
            for(int j = 1; j < cols; j++){
                prefix[i][j] = prefix[i][j-1] + matrix[i][j];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int res = 0;
        for(int row = row1; row <= row2; row++){
            if(col1>0){
                res += prefix[row][col2] - prefix[row][col1-1];
            }else{
                res += prefix[row][col2];
            }
        }
        return res;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */