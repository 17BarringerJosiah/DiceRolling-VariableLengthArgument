package arrays;

public class VariableLengthArgumentList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Josiah Barringer - VARIABLE-LENGTH ARGUMENT LIST AND DICE ROLLING ASSIGNMENT");
		
		System.out.println("Product of 1, 2, 3, 4: " + product(1, 2, 3, 4));
        System.out.println("Product of 3, 2, 1: " + product(3, 2, 1));
        System.out.println("Product of 12, 45, 66, 13, 16: " + product(12, 45, 66, 13, 16));
        System.out.println("Product of 69: " + product(69));
        System.out.println("Product of no arguments: " + product());
    }
    
    public static int product(int... numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        
        int result = 1;
        for (int num : numbers) {
            result *= num;
        }
        
        return result;
    }
}

