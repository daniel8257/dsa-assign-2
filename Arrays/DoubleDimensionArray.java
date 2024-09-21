package Arrays;

public class DoubleDimensionArray {
    int[][] arr = null;

    public DoubleDimensionArray(int numberOfRows, int numberOfColumns) {
        arr = new int[numberOfRows][numberOfColumns];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Integer.MIN_VALUE; // Initialize array with MIN_VALUE
            }
        }
    }

    // Insert method
    public void insert(int row, int col, int value) {
        try {
            if (arr[row][col] == Integer.MIN_VALUE) {
                arr[row][col] = value;
                System.out.println("Successfully inserted " + value + " at position [" + row + "][" + col + "]");
            } else {
                System.out.println("This cell is already occupied at position [" + row + "][" + col + "]");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array.");
        }
    }

    // Traverse the array
    public void traverse() {
        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println(); // For new line after each row
            }
        } catch (Exception e) {
            System.out.println("Array no longer exists.");
        }
    }

    // Search for an element
    public void search(int value) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == value) {
                    System.out.println("Value " + value + " is found at position [" + i + "][" + j + "]");
                    return;
                }
            }
        }
        System.out.println("Value " + value + " is not found.");
    }

    // Delete value at specific row and column
    public void delete(int row, int col) {
        try {
            arr[row][col] = Integer.MIN_VALUE;
            System.out.println("Successfully deleted value at position [" + row + "][" + col + "]");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array.");
        }
    }

    public static void main(String[] args) {
        // Create a 2x3 array
        DoubleDimensionArray doubleDimensionArray = new DoubleDimensionArray(2, 3);

        // Insert values
        doubleDimensionArray.insert(0, 0, 10);
        doubleDimensionArray.insert(0, 1, 20);
        doubleDimensionArray.insert(1, 0, 30);
        doubleDimensionArray.insert(1, 2, 40);

        // Traverse the array
        System.out.println("Array after insertions:");
        doubleDimensionArray.traverse();

        // Search for an element
        doubleDimensionArray.search(30);
        doubleDimensionArray.search(50); // Should indicate value not found

        // Delete an element
        doubleDimensionArray.delete(0, 1);
        System.out.println("Array after deletion:");
        doubleDimensionArray.traverse();
    }
}
