class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length) return false
        val result = hashMapOf<Char,Int>()
    
        for(ch1 in s) {
            result[ch1] = result.getOrDefault(ch1,0) + 1
        }

        for(ch2 in t) {
            val count = result.getOrDefault(ch2,0)
            if(count == 0) return false
            result[ch2] = count - 1
        }

        return result.values.all { it == 0 }
    }
}
