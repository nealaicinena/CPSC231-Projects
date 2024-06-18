public class Drawing {
    public static void main(String[] args) {
        char[][] canvas = (Drawing.createCanvas(10, 5)); // creates canvas and stores it in 2D array called canvas
        Drawing.addCharacter(canvas, '(', 3, 2); 
        Drawing.addCharacter(canvas, ':', 4, 2);
        // adds a smiley face to the canvas

        Drawing.printCanvas(canvas); // calls print method to print the canvas to terminal 
    }

    public static char[][] createCanvas(int width, int height) {
        char[][] screen = new char[height][width]; // 2D array canvas created with input height and width dimensions
        for(int i = 0; i < height; i++) {
            for(int j = 0; j < width; j++) {
                // iterates through each canvas element
                
                if((i == 0 && j == 0) || (i == height - 1 && j == 0) || (i == 0 && j == width - 1) || (i == height - 1 && j == width - 1))  { // if the canvas element is in the corner...
                    screen[i][j] = '+'; // then put a plus sign
                }
                else if(i == 0 || i == height - 1) { // if the element is the upper or lower boarder...
                    screen[i][j] = '='; // put an equals sign
                }
                else if((j == 0) || (j == width - 1)) { // if the element is the left or right boarder...
                    screen[i][j] = '|'; // put a vertical bar
                }
                else{ // otherwise...
                    screen[i][j] = ' '; // make the element a blank space
                }
            }
        }
        return screen; // return the screen
    }

    public static void addCharacter(char [][] canvas, char input, int x, int y) { // takes in canvas, indexes, and character
        canvas[y][x] = input; // puts character at the chosen index of the canvas
    }

    public static void printCanvas(char[][] canvas) { // takes in canvas to print out
        for (int i = 0; i < canvas.length; i++) {
            for (int j = 0; j < canvas[i].length; j++) {
                // iterates through each element
                System.out.print(canvas[i][j] + " "); // prints out element with a space
            }
            System.out.println(); // moves to new line when the first array in the 2D array is finished
        }
    }
}
