public class Computer extends Player {
    int counter = 0;
    public Computer(String token) {

        super("Bit Bucket", token);
    }

    //************ ALGORITHM #4 ***************
    // very basic random move algorithm for now
    // how should the computer decide how to move?
    public int determineMove() {
        if (counter == 3) {
            for (int row = 0; row < 8; row++) {
                for (int col = 0; col < 6; col++) {
                    //checks for 3 x's
                    if ((grid[row][col].equals("X")) &&
                            (grid[row][col + 1].equals("X")) &&
                            (grid[row][col + 2].equals("X"))) {
                        //checks for empty spaces infront
                        if (grid[row][col + 3].equals("-")) {
                            //checks for tokens under 4th
                            if ((grid[row + 1][col + 4].equals("X")) || (grid[row + 1][col + 4].equals("O"))) {
                                return (col + 4);
                            }
                        }

                        //checks for empty spaces in back
                        if (grid[row][col - 1].equals("-")) {
                            if ((grid[row + 1][col - 1].equals("X")) || (grid[row + 1][col - 1].equals("O"))) {
                                return (col - 1);
                            }
                        }

                    }
                }
            }
        }
        counter += 1;
        return 7;
        //return ( (int ) (Math.random() * 8) );
    }



}