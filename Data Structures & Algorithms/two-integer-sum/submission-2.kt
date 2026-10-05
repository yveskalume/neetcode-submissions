class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        // item, index
        val past = mutableMapOf<Int,Int>()
        for(i in nums.indices) {
            val diff = target - nums[i]
            // why not dirrectly check the next item (can win on iteration in best case scenario)
            if(i < nums.lastIndex && nums[i+1] == diff) {
                return intArrayOf(i,i+1)
            }
            if(past.containsKey(diff)) {
                return intArrayOf(past[diff]!!,i)
            }
            past.put(nums[i],i)
        }
        return intArrayOf()
    }
}


// target = nums[i] + nums[j]
// potentialJ = target - nums[i]
// passedValues <- get Index of potentialJ if it exists
// if not passedValues.put(nums[i],i) // can be check with a futur value 
