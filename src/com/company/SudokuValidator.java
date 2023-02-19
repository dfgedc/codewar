package com.company;

public class SudokuValidator {
    public static boolean check(int[][] sudoku) {
        //do your magic
        for (int i = 0; i < sudoku.length; i++) {
            int sum = 0;
            for (int j = 0; j < sudoku[i].length; j++) {
                sum+=sudoku[i][j];
            }
            if(sum!=45){
                return false;
            }
        }
        for (int j = 0; j < 9; j++) {
            int sum = 0;
            for (int i = 0; i < 9; i++) {
                sum+=sudoku[i][j];
            }
            if(sum!=45){
                return false;
            }
        }
      return true;
    }
}
