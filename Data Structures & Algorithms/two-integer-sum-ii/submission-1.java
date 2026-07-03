class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0;i<numbers.length;i++){
            map.put(numbers[i],i);
        }

        for(int i=0;i<numbers.length;i++){
            int wanted = target - numbers[i];
            if(map.containsKey(wanted) && numbers[i]<=wanted && i < map.get(wanted)){
                result[0] = i + 1;
                result[1] = map.get(wanted) + 1;
                break;
            }
        }
        return result;
    }
}