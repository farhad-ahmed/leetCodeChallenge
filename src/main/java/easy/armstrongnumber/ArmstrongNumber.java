package easy.armstrongnumber;

public class ArmstrongNumber {

    /**Time Complexity O(n)**/
    public boolean isArmstrong(int N) {

        String num = Integer.toString(N);
        int ex = num.length();
        int result =0;

        for(int i=0; i<num.length();i++){
            int digit = Character.getNumericValue(num.charAt(i));
            result+= Math.pow(digit,ex);
        }

        if(result==N){
            return true;
        }

        return false;
    }
}
