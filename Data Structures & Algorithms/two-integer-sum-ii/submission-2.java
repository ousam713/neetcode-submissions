class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int i=0;
        while(i<numbers.length){
            int wanted = target - numbers[i];
            int j=i+1;
            while(j<numbers.length){
                if(numbers[j] == wanted){
                    result[0] = i+1;
                    result[1] = j+1;
                    break;
                }
                j++;
            }
            i++;
        }
        return result;
    }
}