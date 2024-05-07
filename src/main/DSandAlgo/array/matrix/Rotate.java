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
        print(matrix);
        //Swapping
        for(int i=0; i<n;i++){
            for(int j=0; j<n-i; j++){
                int t = matrix[i][j];
                matrix[i][j] = matrix[n-j-1][n-i-1];
                matrix[n-j-1][n-i-1] = t;
            }
        }
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        matrix[0] = new int[]{1, 2, 3};
        matrix[1] = new int[]{4, 5, 6};
        matrix[2] = new int[]{7, 8, 9};
        print(matrix);
        rotate(matrix);
        System.out.println();
        print(matrix);
    }
    public static void print(int[][] matrix){
        int n = matrix.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
