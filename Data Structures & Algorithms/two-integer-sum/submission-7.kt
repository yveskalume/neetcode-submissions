class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        // item, index
        val past = mutableMapOf<Int,Int>()
        for(i in nums.indices) {
            val actual = nums[i]

            // since the array is sorted, if actuall is >= to target the sum is going to be more, hence empty array and earlier exit
            if(actual >= target) {
                intArrayOf()
            }

            val diff = target - actual
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
