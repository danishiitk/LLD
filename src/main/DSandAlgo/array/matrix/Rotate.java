package array.matrix;

//array.matrix.Rotate a matrix by 180 degree
public class Rotate {
    public static void rotate(int[][] matrix){
        int n = matrix.length;
        //Transpose
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n;j++){
                int t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
            }
        }
        //Swapping
        for(int i=0; i<n;i++){
            for(int j=0; j<n-i; j++){
                int t = matrix[i][j];
                matrix[i][j] = matrix[n-j-1][n-i-1];
                matrix[n-j-1][n-i-1] = t;
            }
        }
    }
}
