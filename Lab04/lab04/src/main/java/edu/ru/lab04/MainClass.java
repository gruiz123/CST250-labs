
package edu.ru.lab04;

public class MainClass {
    
    public static void main(String[] args){
        
        int[][] myGrid = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12} };
        
        int[][] myGrid2 = { {-9,11,-5,6,12}, {-90,-100,-65,-23,-87} };
        printMaxOfEachRow(myGrid);
        
    }
    
    public static void printMaxOfEachRow(int[][] inputArray){
        
        int maxOfEachRow;
        for(int row = 0; row < inputArray.length; row++){
            
            maxOfEachRow = inputArray[row][0];
            for(int col = 0; col < inputArray[row].length; col++){
                if(inputArray[row][col] > maxOfEachRow){
                    maxOfEachRow = inputArray[row][col];
                }
            }
            
            System.out.println("The MAX value at row " + row + " is : " + maxOfEachRow);   
        }
        
    }

}
