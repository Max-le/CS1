import java.util.Arrays;

    public class Matrix{

        public static void main(String[] args) {

        //Test matrices
        Double[][] matrixA = {{1.0,9.0,3.0},{4.0,5.0,6.0},{7.0,8.0,9.0}};
        Double[][] matrixB = {{3.0,4.0,1.0},{4.0,0.0,5.0},{-2.0,5.0,3.0}};



        Double[][] matrixC = multiply(matrixA, matrixB);

        //Print the entire array, no loop needed! 
        System.out.println(Arrays.deepToString(matrixC));

            
        }


    public static Double[][] multiply(Double[][] matrixA, Double[][] matrixB) {

        int aRows = matrixA.length;
        int bRows = matrixA.length;
        int aColumns = matrixA[0].length;
        int bColumns = matrixB[0].length;
        
        //Check if the method is legal 
        if (aColumns != bRows) {
            System.out.println("This operation isn't legal");
        }
        // Creating the matrix containing the result ( we already know its size)
        Double[][] newMatrix = new Double[aRows][bColumns];

        //Inititalize the matrix
        for (int i = 0; i < aRows; i++) {
            for (int j = 0; j < bColumns; j++) {
                newMatrix[i][j] = 0.0;
            }
        }
        //Compute the multipication
        for (int i = 0; i < aRows; i++) { 
            for (int j = 0; j < bColumns; j++) { 
                for (int k = 0; k < aColumns; k++) {
                    newMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        return newMatrix;
    }


    }