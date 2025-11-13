package test

import algorithm.LiKou
import com.sun.xml.internal.fastinfoset.util.StringArray
import org.junit.After
import org.junit.Before
import org.junit.Test
import utils.Utils

class LiKou {
    var mOffer: LiKou? = null

    @Before
    @Throws(Exception::class)
    fun before() {
        mOffer = LiKou()
    }

    @After
    @Throws(Exception::class)
    fun after() {
    }

    // []

    @Test
    @Throws(Exception::class)
    fun twoSum() {
        mOffer?.twoSum(intArrayOf(3, 2, 4), 6).also {
            it?.forEach {
                println(it)
            }
        }
    }

    @Test
    @Throws(Exception::class)
    fun groupAnagrams() {
        val input = arrayOf("eat", "tea", "tan", "ate", "nat", "bat")
        mOffer?.groupAnagrams(input).also {
            it?.forEach { sec ->
                Utils.printListString(sec)
            }
        }
    }

    @Test
    @Throws(Exception::class)
    fun longestConsecutive() {
        val input: IntArray = arrayOf(0, 0, -1).toIntArray()
        println(mOffer?.longestConsecutive(input))
    }

    @Test
    @Throws(Exception::class)
    fun moveZeroes() {
        val input: IntArray = arrayOf(0, 0, -1).toIntArray()
        mOffer?.moveZeroes(input)
        input.forEach {
            println(it)
        }
    }

    @Test
    @Throws(Exception::class)
    fun maxArea() {
        val intArray = intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)
        println(mOffer?.maxArea(intArray))
    }

    @Test
    @Throws(Exception::class)
    fun threeSum() {
        val intArray = intArrayOf(-1, 0, 1, 2, -1, -4)
        mOffer?.threeSum(intArray)?.forEach {
            Utils.printListString(it)
        }
    }
}
