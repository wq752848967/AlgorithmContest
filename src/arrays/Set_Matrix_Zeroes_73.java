package arrays;

public class Set_Matrix_Zeroes_73 {
    public static void main(String[] args) {
        int[][] ma = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(ma);
    }
    public static void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        boolean row_flag = false;
        boolean col_flag = false;
        for (int i = 0; i < n; i++) {
            if(matrix[i][0]==0){
                row_flag = true;
                break;
            }
        }
        for (int i = 0; i < m; i++) {
            if (matrix[0][i] == 0) {
                col_flag = true;
                break;

            }
        }
        System.out.println(row_flag+" "+col_flag);
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                int status =  matrix[i][j]==0?0:1;
                matrix[0][j] =status==0?0:matrix[0][j];
                matrix[i][0] = status==0?0:matrix[i][0];
            }
        }


        for (int i = 0; i < n; i++) {
            System.out.println("0-"+matrix[i][0]);
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                matrix[i][j] = matrix[i][0]==0?0:matrix[i][j];
            }
        }
        for (int j = 1; j < m; j++) {
            for (int i = 1; i < n; i++) {
                matrix[i][j] = matrix[0][j]==0?0:matrix[i][j];
            }
        }
        if(row_flag == true){
            for (int i = 0; i < n; i++) {
                matrix[i][0]=0;
            }
        }
        if (col_flag == true)
        for (int i = 0; i < m; i++) {
             {
                 matrix[0][i] = 0;
            }
        }

    }
}
