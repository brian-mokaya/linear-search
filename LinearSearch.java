public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 50;
        int result = linearSearch(nums, target);

        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found in the array.");

    }

    public static int linearSearch(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target){
                return  i;
            }
        }
         return -1;
    }
}
