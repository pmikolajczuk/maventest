package pl.mikolaj.leetcode.zigzag;

public class Solution {
    public String convert(String s, int numRows) {
        int numCols = calculateNumberOfColumns(s, numRows);
        char[][] zigzag = buildZigZag(s, numRows, numCols);
        return zigZagToString(zigzag);
    }

    private String zigZagToString(char[][] zigzag) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < zigzag.length; i++) {
            for (int j = 0; j < zigzag[i].length; j++) {
                if (zigzag[i][j] != 0) {
                    sb.append(zigzag[i][j]);
                }
            }
        }
        return sb.toString();
    }

    private char[][] buildZigZag(String s, int numRows, int numCols) {
        char[][] zigzag = new char[numRows][numCols];
        if (numRows == 1) {
            for (int i = 0; i < s.length(); i++) {
                zigzag[0][i] = s.charAt(i);
            }
            return zigzag;
        }

        int j = 0, k = 0;
        boolean down = true;
        for (int i = 0; i < s.length(); i++) {
            zigzag[j][k] = s.charAt(i);
            if (down) {
                j++;
                if (j == numRows) {
                    j -= 2;
                    k++;
                    if(j > 0) {
                        down = false;
                    }
                }
            } else {
                j--;
                k++;
                if (j == 0) {
                    down = true;
                }

            }
        }
        return zigzag;
    }

    private int calculateNumberOfColumns(String s, int numRows) {
        if (numRows == 1) {
            return s.length();
        }
        int numCols = 0;
        boolean down = true;

        for (int i = 0; i < s.length(); ) {
            if (down) {
                i += numRows;
                down = false;
                numCols++;
            } else {
                i += numRows - 2;
                down = true;
                numCols += numRows - 2;
            }
        }
        return numCols;
    }

    private void printZigZag(char[][] zigzag) {
        for (int i = 0; i < zigzag.length; i++) {
            for (int j = 0; j < zigzag[i].length; j++) {
                System.out.print(zigzag[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String s = "ABCD";
        //String s = "PAYPALISHIRING";
        //String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Solution solution = new Solution();
        String result = solution.convert(s, 2);
        System.out.println(result);
    }
}
