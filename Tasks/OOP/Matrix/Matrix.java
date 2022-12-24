import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.image.BufferedImage;

public class Main {
    static class Matrix{
        private int rowAmount;
        private int columnAmount;
        private double[][] content;
        public Matrix sum(Matrix mat){
            Matrix new_mat = new Matrix();
            if ((this.getColumnAmount() == mat.getColumnAmount()) && (this.getRowAmount() == mat.getRowAmount())){
                for (int i = 0; i < mat.getRowAmount(); i++){
                    for (int j = 0; j < mat.getColumnAmount(); j++){
                        new_mat.content[i][j] = this.content[i][j] + mat.content[i][j];
                    }
                }
            }
            return new_mat;
        }
        public double[][]  getContent() { return this.content; }
        public int getRowAmount() { return this.rowAmount; }
        public int getColumnAmount() { return this.columnAmount; }
        public Matrix(){
            for (int i = 0; i < this.getRowAmount(); i++){
                for (int j = 0; j < this.getColumnAmount(); j++){
                    this.content[i][j] = 0;
                }
            }
        }
        public void multiplication(int k){
            for (int i = 0; i < this.getRowAmount(); i++){
                for (int j = 0; j < this.getColumnAmount(); j++){
                    this.content[i][j] *= k;
                }
            }
        }

        public void output(){
            for (int i = 0; i < this.getRowAmount(); i++){
                for (int j = 0; j < this.getColumnAmount(); j++){
                    System.out.print(this.content[i][j] + " ");
                }
                System.out.println();
            }
        }
        public void setContent(double[][] content){
            if ((content.length == this.getRowAmount()) && (content[0].length == this.getColumnAmount())){
                for (int i = 0; i < this.getRowAmount(); i++){
                    for (int j = 0; j < this.getColumnAmount(); j++){
                        this.content[i][j] = content[i][j];
                    }
                }
            }
        }

        public Matrix(double[][] content, int rowAmount, int columnAmount){
            this.rowAmount = rowAmount;
            this.columnAmount = columnAmount;
            this.content = new double[rowAmount][columnAmount];
            for (int i = 0; i < rowAmount; i++){
                for (int j = 0; j < columnAmount; j++){
                    this.content[i][j] = content[i][j];
                }
            }
        }
        public Matrix multiplication(Matrix new_mat){
            int sum = 0;
            //int k = 0;
            double[][] content = new double[this.rowAmount][new_mat.columnAmount];
            /*for (int i = 0; i < this.rowAmount; i++){
                sum = 0;
                for (int j = 0; j < new_mat.columnAmount; j++){
                    sum += this.content[i][j]*new_mat.content[j][i];
                }
                content[i][]
            }*/
            for (int i = 0; i < this.rowAmount; i++){
                for (int j = 0; j < new_mat.columnAmount; j++){
                    sum = 0;
                    for (int k = 0; k < this.columnAmount; k++){
                        sum += this.content[i][k]*new_mat.content[k][j];
                    }
                    content[i][j] = sum;
                }
            }
            return new Matrix(content, this.rowAmount, new_mat.columnAmount);
        }

    }
    public static void main(String[] args) {
        double[][] array1 = {{1, 2, 3}, {4, 5, 6}};
        double[][] array2 = {{2, 3, 4}, {7, 9, 0}, {10, 1, 2}};
        Matrix mat = new Matrix(array1, 2, 3);
        Matrix mat1 = new Matrix(array2, 3, 3);
        Matrix new_mat = mat.multiplication(mat1);
        new_mat.output();
    }
}