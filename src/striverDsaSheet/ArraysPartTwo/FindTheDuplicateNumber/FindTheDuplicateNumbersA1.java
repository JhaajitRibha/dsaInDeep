package striverDsaSheet.ArraysPartTwo.FindTheDuplicateNumber;

//using floyd algorithm to detect cycle for this problem
public class FindTheDuplicateNumbersA1 {
    public int findDuplicate(int[] nums) {
        int slow=nums[0];
        int fast=nums[0];
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow!=fast);

        slow=nums[0];
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;
    }

    public static void main(String[] args) {

        int[] arr = {2,5,9,6,9,3,8,9,7,1};
        System.out.println(new FindTheDuplicateNumbersA1().findDuplicate(arr));
    }
}
