package dia_2;

/**
 *
 * @author Uniminuto Tibu
 */
public class Dia_2 {
     public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int numeros = left + (right - left) / 2;  
            if (nums[numeros] == target) {
                return numeros;  
            } else if (nums[numeros] < target) {
                left = numeros + 1; 
            } else {
                right = numeros - 1;  
            }
        }
        return left;
    }
    
}
