package com.at.sparsearray;



public class SparseArray {
    public static void main(String[] args){
        int chessarray[][]=new int[11][11];//11*11的二维数组
        chessarray[1][2]=1;
        chessarray[2][3]=2;
        for (int[] row:chessarray){
            for (int item:row){
                System.out.printf("%d\t",item);
            }
            System.out.println();
        }

        int sum=0;
        for (int i=0;i<11;i++){
            for(int j=0;j<11;j++){
                if(chessarray[i][j]!=0){
                    sum++;
                }
            }
        }
        System.out.println("sum="+sum);

    }



}
