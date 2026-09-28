import java.util.*;

public class electronicsNumber1 {
    public static void main(String[] args) {
      String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
      String[] consoles = {"PS5", "Xbox", "Switch"};

      int[][] sales = {
        1000, 2000, 3000},
        2000, 3000, 4000},
        1500, 1100, 1200}
      };
      int[] cityTotal = new int[cities.length];

      int row; 
      int column;

      for(row = 0; row < sales.length; ++row){
        for(column = 0; column < sales[row].length; ++column){
          citiesTotals[row] += sales[row][column];
        }
      }
      int biggestSales = citiesTotals[0];
      int biggestCity = 0;

      for(row = 1; row < citiesTotals.length; ++row){
        if(citiesTotals[row] > biggestSales){
          biggestSales =cityTotal[row];
          biggestCity = row;
        }
      }
     }
}