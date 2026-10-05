class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        // item, index
        val past = mutableMapOf<Int,Int>()
        for(i in nums.indices) {
            val diff = target - nums[i]
            val pastIndex = past[diff]
            if(pastIndex != null) {
                return intArrayOf(pastIndex,i)
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
