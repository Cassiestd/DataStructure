package com.at.sparsearray;


/**
 * 二维数组和稀疏数组的互转
 */
public class SparseArray {
    public static void main(String[] args){
        int chessarray[][]=new int[11][11];//11*11的二维数组
        chessarray[1][2]=1;
        chessarray[2][3]=2;
        chessarray[2][4]=2;
        for (int[] row:chessarray){    //遍历创建的二维数组
            for (int item:row){
                System.out.printf("%d\t",item);
            }
            System.out.println();
        }

        int sum=0;    //用于统计二维数组中的有效元素个数
        for (int i=0;i<11;i++){
            for(int j=0;j<11;j++){
                if(chessarray[i][j]!=0){
                    sum++;
                }
            }
        }
        System.out.println("sum="+sum);

        int[][] sparsearray=new int[sum+1][3];//创建稀疏数组
        sparsearray[0][0]=11;
        sparsearray[0][1]=11;
        sparsearray[0][2]=sum;

        //接下来继续完善稀疏数组的非0行
        //需要知道有效值的所在位置，所以不能使用foreach遍历，否则不能知道有效值的位置
        //而且需要一个计数器（一个计数变量）用来给稀疏数组的第1、2、3......行赋值
        int count=1;    //与视频中所赋值不同（视频赋值为0），因为在给有效元素创建一条记录时，这里是先赋值再自增；视频中是先自增再赋值
        outter:     //标识符= =
        for(int i=0;i<11;i++){
            for(int j=0;j<11;j++){
                if(chessarray[i][j]!=0){
                    sparsearray[count][0]=i;
                    sparsearray[count][1]=j;
                    sparsearray[count][2]=chessarray[i][j];
                    count++;
                    if(count>sum){
                        break outter;
                    }
                }
            }
        }

        for(int[] row:sparsearray){       //遍历稀疏数组并将其打印
            for(int i=0;i<3;i++){
                System.out.printf("%d\t",row[i]);
            }
            System.out.println();
        }

        //以下为：稀疏数组向二维数组的转换：
        // 基本思想--（1）先遍历稀疏数组第一行获取二维数组的行列。
        // （2）遍历稀疏数组余下记录获取有效元素位置和值，并将其赋予二维数组对应位置。


        int[][] array=new int[sparsearray[0][0]][sparsearray[0][1]];
        for(int i=1;i<=sum;i++){
           array[sparsearray[i][0]][sparsearray[i][1]]=sparsearray[i][2];
        }
        System.out.println("============================");
        for(int i=0;i<11;i++){
            for(int j=0;j<11;j++){
                System.out.printf("%d\t",array[i][j]);
            }
            System.out.println();
        }








    }













}
