class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val visited = HashSet<Int>()

        for(i in 0..<nums.size) {
            val actual = nums[i]
            if(!visited.add(actual)) {
                return true
            }
        }
        return false
    }
}
