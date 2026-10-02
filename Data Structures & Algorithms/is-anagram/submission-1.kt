class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length) return false
        val result = hashMapOf<Char,Int>()
    
        for(i in s.indices) {
            result[s[i]] = result.getOrDefault(s[i],0) + 1
            result[t[i]] = result.getOrDefault(t[i],0) - 1
        }
        return result.values.all { it == 0 }
    }
}
