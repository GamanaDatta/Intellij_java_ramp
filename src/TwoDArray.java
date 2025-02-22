public class TwoDArray {
    public static void main(String[] args) {

    //3*3 number matrix using 2D arrays
        int [][] a = new int[3][3];

        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                a[i][j] = i+j;
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

       //print star patterns
        int rows = 5; // Number of rows for the star pattern
        char[][] stars = new char[rows][rows]; // 2D array to hold the stars

        // Fill the 2D array to create a star pattern
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (j <= i) {
                    stars[i][j] = '*'; // Fill with star
                } else {
                    stars[i][j] = ' '; // Fill with space
                }
            }
        }

        // Print the star pattern from the 2D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(stars[i][j]);
            }
            System.out.println(); // Move to the next line
        }



    }

    }

