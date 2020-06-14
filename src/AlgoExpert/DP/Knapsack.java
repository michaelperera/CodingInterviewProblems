package AlgoExpert.DP;

import java.util.ArrayList;
import java.util.Arrays;

public class Knapsack {
    public static void main(String[] args) {

        int[][] items = new int[][]{{1,2},{4,3},{5,6},{6,7}};
        System.out.println(knapsackProblem(items, 10));
    }
    public static ArrayList<ArrayList<Integer>> knapsackProblem(int[][] items, int capacity) {
        ArrayList<ArrayList<Integer>> results = new ArrayList<>();
        int[][] knap = new int[items.length+1][capacity+1];

        for (int i = 1; i < items.length+1; i++) {

            int currentValue = items[i-1][0];
            int currentweight = items[i-1][1];
            for (int j = 0; j < capacity +1; j++) {
                if(currentweight > j){
                    knap[i][j] =  knap[i-1][j];
                }
                else{
                    knap[i][j] = Math.max(knap[i-1][j], knap[i-1][j-currentweight]+currentValue);
                }

            }

        }
        for(int[] arr :knap){

            System.out.println(Arrays.toString(arr));
        }

        return results;
    }
}