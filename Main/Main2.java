package Main;

public class Main2 {
    public static int[] digitize(long n) {
        String s = Long.toString(n);
        String s2 = new StringBuffer(s).reverse().toString();
        String[] nums = s2.split("");
        int[] digitize = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            digitize[i] = Integer.parseInt(nums[i]);
        }
        return digitize;
    }
}
