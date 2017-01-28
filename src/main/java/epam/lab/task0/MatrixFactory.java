package epam.lab.task0;

/**
 * Created by Aikerim.
 *
 * 28.01.2017
 */
public class MatrixFactory {
    private static final String TEXT = "Matrix multiplication is impossible. The number of columns of the first matrix must be equal to the number of rows of the second matrix";

    public static Matrix multiply(Matrix m1, Matrix m2){

        int[][] m = new int[m1.getrows()][m2.getcolumns()];

        if (m1.getcolumns() != m2.getrows()) System.out.println(TEXT);
        else {
            System.out.println("Matrix multiplication");
            for (int i = 0; i < m1.getrows(); i++)
            {
                for (int j = 0; j < m2.getcolumns(); j++)
                {
                    for (int k = 0; k < m2.getrows(); k++)
                    {
                        m[i][j] += m1.m[i][k] * m2.m[k][j];
                    }
                    System.out.print(m[i][j] + (j == m2.getcolumns() - 1 ? "\n" : "\t"));
                }
            }
        }
        return new Matrix(m);
    }
}

