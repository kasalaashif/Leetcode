class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> prefixSumArray = new HashMap<>();
        int prefixSum = 0;
        prefixSumArray.put(0,1);
        int count=0;
        for(int num : nums)
        {
            prefixSum += num;
            if(prefixSumArray.containsKey(prefixSum-k))
                count += prefixSumArray.get(prefixSum-k);
            prefixSumArray.put(prefixSum, prefixSumArray.getOrDefault(prefixSum, 0)+1);  
        }
        return count;
    }
}