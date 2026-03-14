/*
    13. Program to determine whether a given matrix is a sparse matrix 
*/
class Test
{
    // A sparse matrix is a matrix in which most of the elements are zero. 

    public static boolean matrix(int[][] matrix, double range)
    {
        int zeroElements = 0;
        int totalElements = matrix.length * matrix[0].length;
        
        if (matrix.length == 0 || matrix[0].length == 0)
            return false;

        for (int[] row : matrix)
            for (int element : row)
                if (element == 0)
                    zeroElements++;
                
        double zeroPercentage = (double) zeroElements / totalElements;

        return zeroPercentage >= range;
    }
    public static void main(String[] args)
    {
        int[][] matrix = {
            {0, 0, 0, 0},
            {0, 5, 0, 0},
            {0, 0, 0, 0}
        };
        double range = 0.9;

        if (matrix(matrix, range))
        {
            System.out.println("The matrix is sparse.");
        }
        else
        {
            System.out.println("The matrix is not sparse.");
        }
    }
}
