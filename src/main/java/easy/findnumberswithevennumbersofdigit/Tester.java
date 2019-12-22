package easy.findnumberswithevennumbersofdigit;

public class Tester {

    public static void main(String[] args) {

        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));

    }

    public static int findNumbers(int[] nums) {

        int count =0;

        for(int i=0; i<nums.length; i++){

            String digit = ""+nums[i];
            if(digit.length()%2==0){
                count++;
            }
        }

        return count;

    }
}
