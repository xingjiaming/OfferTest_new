package algorithm

import java.util.*


class LiKou {
    constructor()

    /**
     * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
     * 你可以假设每种输入只会对应一个答案，并且你不能使用两次相同的元素。
     * 你可以按任意顺序返回答案。
     */
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val res = IntArray(2)
        val map = mutableMapOf<Int, Int>() // first index second otherV
        for (i in nums.indices) {
            val otherValueIndex = map[nums[i]] ?: 0
            if ((nums[otherValueIndex] + nums[i] == target)) {
                res[0] = otherValueIndex
                res[1] = i
            } else {
                map[target - nums[i]] = i
            }
        }
        return res
    }

    /**
     * 给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。
     * 异位词有一个共同的特点，就是他们的字母出现次数、字母的种类是一样的，如果是一样的就可以作为统一key
     * 这个很满足hash 的key的设计
     * 1. 每个数组按同一个规范转成一个key，存在一个list里
     * 2. 输出即可
     */
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val res = mutableListOf<MutableList<String>>()
        val map = mutableMapOf<String, MutableList<String>>()
        for (str in strs) {
            val strChars = str.toCharArray()
            Arrays.sort(strChars)
            val key = String(strChars)
            map.getOrPut(key, { mutableListOf() }).add(str)
        }
        map.forEach { (_, value) ->
            res.add(value)
        }
        return res
    }

}
