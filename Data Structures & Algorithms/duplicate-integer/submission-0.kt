class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val visited = mutableMapOf<Int,Int>()

        for(i in 0..<nums.size) {
            val actual = nums[i]
            if(visited.containsKey(actual)) {
                return true
            }
            visited.put(actual,actual)
        }
        return false
    }
}
