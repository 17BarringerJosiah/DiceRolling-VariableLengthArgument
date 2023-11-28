package arrays;

import java.util.Random;

public class DiceRolling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println("Josiah Barringer - VARIABLE-LENGTH ARGUMENT LIST AND DICE ROLLING ASSIGNMENT");
		
      Random random = new Random();
      int[] sums = new int[11];
      
      for (int i = 0; i < 36000; i++) {
    	  int dice1 = random.nextInt(6) + 1;
    	  int dice2 = random.nextInt(6) + 1;
    	  int sum = dice1 + dice2;
    	  
    	  sums[sum - 2]++;
      }
		
      
      for (int i =2; i <= 12; i++) {
    	  System.out.println(i + "\t" + sums[i - 2]);
      }
	}

}
