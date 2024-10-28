public class TwoSum {
    public static int[] twoSum(int[] numbs, int target){
        for(int i=1; i< numbs.length; i++){
            for(int j=i; j < numbs.length; j++){
                if(numbs[j] + numbs[j-i] == target){
                    return new int[]{j,j-i};
                }
            }
        }
        return null;
    }

    public static void main(String[] args){
        int[] numbs = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(numbs,target);
        for(int k : result){
            System.out.print(k + " ");
        }
    }
}
