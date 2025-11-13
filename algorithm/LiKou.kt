package algorithm

import java.util.*
import kotlin.math.max
import kotlin.math.min


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

    /**
     * 给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
     * 请你设计并实现时间复杂度为 O(n) 的算法解决此问题。
     *
     * 0,3,7,2,5,8,4,6,0,1
     * 9
     */
    fun longestConsecutive(nums: IntArray): Int {
        val map = mutableMapOf<Int, MutableList<Int>>()
        var maxList = mutableListOf<Int>()
        val numsSet = nums.toSet()
        for (i in numsSet) {
            if (numsSet.contains(i - 1)) {
                continue
            }
            var value = i
            val targetList = map.getOrPut(value, { mutableListOf() })
            while (true) {
                if (numsSet.contains(value)) { // 包括+1的值
                    targetList.add(value)
                } else {
                    break
                }
                value++
            }
            map[value] = targetList
            if (targetList.size >= maxList.size) {
                maxList = targetList
            }
        }
        return maxList.size
    }

    /**
     * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
     * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
     * 0 是无序的
     * 非0 是有序的，所以要挪非0
     */
    fun moveZeroes(nums: IntArray): Unit {
        val length = nums.size
        var left = 0
        var right = 0
        while (right < length) {
            if (nums[right] != 0) {
                swap(nums, left, right)
                left++ // 指向的时0
            }
            right++
        }
    }

    /**
     * 交换两个元素
     */
    private fun swap(number: IntArray, left: Int, right: Int) {
        val temp = number[left]
        number[left] = number[right]
        number[right] = temp
    }

    /**
     * 给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。
     * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
     * 返回容器可以储存的最大水量。
     * 输入：[1,8,6,2,5,4,8,3,7]
     * 输出：49
     *
     * 双指针的思路，如果最开始所以 1 7 最大的面积是 1*7，此时要找比他最大的水量，所以只有两种情况，要么1往里走，要么7往里走
     * 大的往里走，面积一定是变小的，此时是没意义的
     * 小的往里走，面积不一定变小，因为面积是
     * min(左边 右边) * x 间距。
     */
    fun maxArea(height: IntArray): Int {
        var max = 0
        var left = 0
        var right = height.size - 1
        while (left < right) {
            val curArea = (right - left) * min(height[left], height[right])
            max = max(max, curArea)
            if (height[left] > height[right]) {
                right--
            } else {
                left++
            }
        }
        return max
    }

    /**
     * 给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，
     * 同时还满足 nums[i] + nums[j] + nums[k] == 0 。请你返回所有和为 0 且不重复的三元组。
     * 思路：相当于不同的找两数（c d）之和等于a的数组
     * a就是第一从循环
     * c d 是除了前面一个元素后，后边的元素。
     *
     * 优化：先排序，如果当前值比0大，后边的遍历就没有意义了。
     */
    fun threeSum(nums: IntArray): List<List<Int>> {
        val  res = mutableListOf<MutableList<Int>>()
        return res
    }
}
