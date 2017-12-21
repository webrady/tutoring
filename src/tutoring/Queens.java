/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutoring;

/**
 *
 * @author Walt
 */
public class Queens {
    private int [][] board;
    
    public Queens(int size){
        board = new int[size][size];
        for(int i = 0;i < size;i++){
            for(int j = 0;j < size;j++){
                board[i][j] = 0;
            }
        }
        placeQueens(0);
    }
    
    private void placeQueens(int col){
        for(int i = 0;i < board.length;i++){
            //If I can place a queen I will
            if(this.isValid(i, col)){
                board[i][col] = 1;
                //If there is more queens to place, I better go place them
                if(col < board.length - 1){
                    this.placeQueens(col + 1);
                    //Was I able to place every queen? If not, better go back and try again in the next available spot
                    if(this.isFinished()){
                        break;
                    }
                    else{
                        board[i][col] = 0;
                    }
                }
            }
        }
    }
    private boolean isValid(int row,int col){
        //check row
        for(int i = 0;i < col;i++){
            if(board[row][i] == 1){
                return false;
            }
        }
        //check col is unnecesary as only one queen is placed per column anyways
        //check diags
        //up left
        for(int i = 1;i <= row && i <= col;i++){
            if(board[row - i][col - i] == 1){
                return false;
            }
        }
        //down left
        for(int i = 1;row + i < board.length && i <= col;i++){
            if(board[row + i][col - i] == 1){
                return false;
            }
        }
        //anything to the right is unnecesary as there is nothing there...yet...
        return true;
    }
    
    private boolean isFinished(){
        for(int i = 0;i < board.length;i++){
            if(board[i][board.length - 1] == 1){
                return true;
            }
        }
        return false;
    }
    
    public String toString(){
        String str = "";
        for(int i = 0;i < board.length;i++){
            for(int j = 0;j < board.length;j++){
                str += board[i][j] + " ";
            }
            str += "\n";
        }
        return str;
    }
}
