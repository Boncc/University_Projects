public class Rhombus {
    public static void main(String[] args) {
        int x = 8; // width
        int y = 10; // height

        // Check if width is even
        if (x % 2 == 0) {
            x++; // increase it by one to make it odd (rhombus should have odd width)
        }

        // Determine the height of the upper and lower parts of the rhombus
        int upperHeight = (int) Math.ceil(y / 2.0);
        int lowerHeight = y - upperHeight;

        // Print the upper part of the rhombus
        for (int i = 0; i < upperHeight; i++) {
            for (int j = 0; j < x; j++) {
                if (j >= (x / 2) - i && j <= (x / 2) + i) {
                    System.out.print(".");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Print the lower part of the rhombus
        for (int i = lowerHeight - 1; i >= 0; i--) {
            for (int j = 0; j < x; j++) {
                if (j >= (x / 2) - i && j <= (x / 2) + i) {
                    System.out.print(".");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}