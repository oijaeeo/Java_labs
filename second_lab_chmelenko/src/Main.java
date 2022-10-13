import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(3, 3);
        matrix.setRandElements();
        matrix.print();
        System.out.println("-------------");
        Matrix b = getMatrix(2, 2);
        b.print();
        System.out.println("-------------");
        System.out.println("The matrix is transformed upper triangular.");
        matrix.UpperMatrix();
        System.out.println("-------------");
        System.out.println("The matrix is transformed lower triangular.");
        Matrix c = getMatrix(3, 3);
        System.out.println("-------------");
        c.LowerMatrix();
    }

    public static Matrix getMatrix(int n, int m) {
        Matrix matrix = new Matrix(n, m);
        matrix.setRandElements();
        return matrix;
    }
}

class Matrix {
    public Matrix() {
        n = m = 1;
        arr = new int[n][m];
    }

    public Matrix(int row, int column) {
        n = row;
        m = column;
        arr = new int[n][m];
    }

    public Matrix(Matrix obj) {
        n = obj.getRows();
        m = obj.getColumns();
        arr = new int[n][m];
        for(int i = 0; i < n; ++i){
            for(int j = 0; j < m; ++j){
                arr[i][j] = obj.getElement(i, j);
            }
        }
    }

    public void setRandElements() {
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                arr[i][j] = -10 + (int) (Math.random() * 20);
            }
        }
    }

    public void setElements() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                System.out.print("Введите [" + i + 1 + "][" + j + 1 + "]элемент: ");
                arr[i][j] = scanner.nextInt();
            }
        }
    }
    private void MulArr(double[][] arr, int n, int k, int l, double mul){
        for(int i = 0; i < n; ++i) {
            arr[k][i] *= mul;
        }
        for(int i = 0; i < n; ++i){
            arr[k][i] += arr[l][i];
        }
    }
    public void LowerMatrix(){
        double[][] second = new double[n][m];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                second[i][j] = arr[i][j];
            }
        }
        double mul;
        boolean flag = false;
        while(!flag){
            for(int i = n - 1; i >= 0; --i){
                for(int j = n - 1; j > 0; --j){
                    if(i < j){
                        if(second[i][j] == 0)
                            continue;
                        mul = -1 * (second[j][j] / second[i][j]);
                        MulArr(second, n, i, j, mul);
                    }
                }
                if(i == 0)
                    flag = true;
            }
        }
        for(int i = 0; i < n; ++i){
            for(int j = 0; j < m; ++j){
                System.out.print(second[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public void UpperMatrix() {
        double[][] second = new double[n][m];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                second[i][j] = arr[i][j];
            }
        }
        double mul;
        boolean flag = false;
        while (!flag) {
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < m; ++j) {
                    if(i > j) {
                        if (second[i][j] == 0)
                            continue;
                        mul = -1 * (second[j][j] / second[i][j]);
                        MulArr(second, n, i, j, mul);
                    }
                    if(i == n - 1)
                        flag = true;
                }
            }
        }
        for(int i = 0; i < n; ++i){
            for(int j = 0; j < m; ++j){
                System.out.print(second[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void print () {
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int getElement ( int i, int j){
        return arr[i][j];
    }

    public int[] getRow ( int index){
        return arr[index];
    }
    public int[] getColumn ( int index){
        int[] result;
        result = new int[n];
        for (int i = 0; i < n; ++i) {
            result[i] = arr[i][index];
        }
        return result;
    }

    public boolean equals (Matrix obj){
        if (obj.getRows() != n) return false;
        if (obj.getColumns() != m) return false;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                if (arr[i][j] != obj.getElement(i, j)) return false;
            }
        }
        return true;
    }
    public int hashcode () {
        return Arrays.deepHashCode(arr);
    }

    public int getRows () {
        return n;
    }
    public int getColumns () {
        return m;
    }
    private final int[][] arr;
    private final int n;
    private final int m;
}