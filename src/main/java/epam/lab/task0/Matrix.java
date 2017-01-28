package epam.lab.task0;

/**
 *
 */
public class Matrix {

    private int[][] m;

    public Matrix(){
    }

    public Matrix(int[][] m){
        this.m = m;
    }

    public int[][] matrix(int rows, int columns) {

        m = new int[rows][columns];

        System.out.println("Matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                m[i][j] = i + (int) (Math.random() * 10);
                System.out.print(m[i][j] + (j == columns - 1 ? "\n" : "\t"));
            }
        }


        return m;
    }

    public int getrows(){
        return m.length;
    }

    public int getcolumns(){
        return m[0].length;
    }



}
