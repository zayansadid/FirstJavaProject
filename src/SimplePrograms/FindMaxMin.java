package SimplePrograms;

import java.util.Arrays;

public class FindMaxMin {
    public static void main(String[] args) {
        int []allNumbers={7,10,2,25,37,-11,45,57,32,30,3,82,25};
      // findMax(allNumbers);
      //  findMaxMinBySorting(allNumbers);
    }

    public static void findMax(int[]supplyArray){
        int max=supplyArray[0];
        int min=supplyArray[0];

        for(int i=1;i<supplyArray.length;i++){

            if(supplyArray[i]>max){
                max=supplyArray[i];
            }else if(supplyArray[i]<min){
                min=supplyArray[i];
            }
        }
        System.out.println("Maximum Number is: "+max+ " and Minimum number is: "+min);
    }

    public static void findMaxMinBySorting(int[]supplyArray){
        Arrays.sort(supplyArray);
        System.out.println("Maximum Number is: "+supplyArray[supplyArray.length-1]+
                " and Minimum number is: "+supplyArray[0]+ "  By sorting");
    }



}
