public class leetcodeproblem {
    public int misingNumer(int[] nums){
        int n = nums.length;
        int sum = n*(n+1)/2;
        for(int i = 0; i < n; i++){
            sum -= nums[i];
        }
        return sum;
    }
        public static void main(String[] args) {
            System.out.println("Ashu Singh");
        
    }
}
