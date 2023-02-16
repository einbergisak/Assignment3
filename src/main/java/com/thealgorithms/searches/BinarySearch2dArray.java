package com.thealgorithms.searches;
import java.util.HashSet;

/*
To apply this method, the provided array must be strictly sorted. In this method, two pointers, one at 0th row
& the other at the last row are taken & the searching is done on the basis of the middle element of the middle column.
If that element is equal to target, its coordinates are returned, else if it is smaller than the target, the rows above
that element are ignored (because the elements above it will also be smaller than the target), else that element is
greater than the target, then the rows below it are ignored.
 */
public class BinarySearch2dArray {

    public static HashSet<String> branchesReached = new HashSet<>();
    static int[] BinarySearch(int[][] arr, int target) {
        int rowCount = arr.length, colCount = arr[0].length;

        if (rowCount == 1) {
            branchesReached.add("1.1");
            return binarySearch(arr, target, 0, 0, colCount);
        }

        int startRow = 0, endRow = rowCount - 1, midCol = colCount / 2;

        while (startRow < endRow - 1) {
            branchesReached.add("2.1");
            int midRow = startRow + (endRow - startRow) / 2; //getting the index of middle row

            if (arr[midRow][midCol] == target) {
                branchesReached.add("2.1.1");
                return new int[] { midRow, midCol };
            } else if (arr[midRow][midCol] < target) {
                branchesReached.add("2.1.2");
                startRow = midRow; 
            } else {
                branchesReached.add("2.1.3");
                endRow = midRow;
            }
            
        }
        /*
            if the above search fails to find the target element, these conditions will be used to find the target
            element, which further uses the binary search algorithm in the places which were left unexplored.
             */
        if (arr[startRow][midCol] == target) { 
            branchesReached.add("3.1");
            return new int[] {startRow, midCol};
        }

        if (arr[endRow][midCol] == target){
            branchesReached.add("4.1");
            return new int[] { endRow, midCol };
        }

        if (target <= arr[startRow][midCol - 1]) {
            branchesReached.add("5.1");
         return binarySearch(
            arr,
            target,
            startRow,
            0,
            midCol - 1
        );
        }

        if (
            target >= arr[startRow][midCol + 1] &&
            target <= arr[startRow][colCount - 1]
        ) {
            branchesReached.add("6.1");
            return binarySearch(arr, target, startRow, midCol + 1, colCount - 1);
        }

        if (target <= arr[endRow][midCol - 1]) {
            branchesReached.add("7.1");
            return binarySearch(
            arr,
            target,
            endRow,
            0,
            midCol - 1
        ); } else { 
                branchesReached.add("7.2");
                return binarySearch(
                arr,
                target,
                endRow,
                midCol + 1,
                colCount - 1); 
        }
    }

    static int[] binarySearch(
        int[][] arr,
        int target,
        int row,
        int colStart,
        int colEnd
    ) {
        while (colStart <= colEnd) {
            branchesReached.add("8.1");
            int midIndex = colStart + (colEnd - colStart) / 2;

            if (arr[row][midIndex] == target) {
                branchesReached.add("8.1.1");
                return new int[] {
                row,
                midIndex, }; 
            } else if (arr[row][midIndex] < target) { 
                branchesReached.add("8.1.2");
                colStart = midIndex + 1; 
            } else {
                colEnd = midIndex - 1;
            }
        }

        return new int[] { -1, -1 };
    }
}
