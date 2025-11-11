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
}
