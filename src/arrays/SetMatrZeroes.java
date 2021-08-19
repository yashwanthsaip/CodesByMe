package arrays;

import java.util.Arrays;

public class SetMatrZeroes {

    public static void setZeroes(int[][] matrix) {
        int col0=1, rows=matrix.length, cols=matrix[0].length;
        for(int i=0; i<rows; i++){
            if(matrix[i][0]==0) {col0=0;}
            for(int j=1; j<cols; j++)
                if(matrix[i][j]==0)
                    matrix[i][0]=matrix[0][j]=0;
        }
        for(int i=rows-1; i>=0; i--){
            for(int j=cols-1; j>=1; j--)
                if(matrix[i][0]==0 || matrix[0][j]==0)
                    matrix[i][j]=0;
            if(col0==0)
                matrix[i][0]=0;
        }
    }

    public static void main(String[] args) {

        int[][] arrs= new int[3][3];
        arrs[0][0]=1;
        arrs[0][1]=1;
        arrs[0][2]=1;
        arrs[1][0]=1;
        arrs[1][1]=0;
        arrs[1][2]=1;
        arrs[2][0]=1;
        arrs[2][1]=1;
        arrs[2][2]=1;
        setZeroes(arrs);
        System.out.println(Arrays.deepToString(arrs));


    }


}
