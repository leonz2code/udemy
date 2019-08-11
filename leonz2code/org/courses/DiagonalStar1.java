package leonz2code.org.courses;

public class DiagonalStar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printSquareStar(8);
		
	}

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int row = 0; row < number; row++) {
                for (int col = 0; col < number; col++) {
                    if (row == 0 || row == number - 1 || col == 0 || col == number - 1 || row == col || col == number - (row + 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
	
}
