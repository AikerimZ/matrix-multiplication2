package epam.lab.task0;

/**

 */
public class Main {

    public static void main(String[] args) {

        Matrix m1 = new Matrix();
        Matrix m2 = new Matrix();
        m1.matrix(1, 2);
        m2.matrix(2, 3);

        Matrix matrix = MatrixFactory.multiply(m1, m2);


    }

}
