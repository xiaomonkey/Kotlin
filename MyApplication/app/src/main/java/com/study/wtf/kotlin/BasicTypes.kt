package com.study.wtf.kotlin

import android.util.Log
import android.util.Log.println

/**
 * Created by musikid on 17/7/6.
 */

//布尔类型
val aBoolean : Boolean = true

val anotherBoolean : Boolean = false

//int 类型

val aInt = 8
val anotherInt: Int = 0xFF
 val moreInt: Int = 0b00000011

val maxInt: Int = Int.MAX_VALUE
val minInt: Int = Int.MIN_VALUE

//long类型
val aLong : Long = 12368172397127391
val anotherLong : Long = 123
val maxLong: Long = Long.MAX_VALUE
val minLong: Long = Long.MIN_VALUE

//float 类型

val aFloat : Float = 2.0F
val anotherFloat: Float = 1E3f
val maxFloat: Float = Float.MAX_VALUE
val minFloat : Float = Float.MIN_VALUE


//double类型

val aDouble :Double = 3.0
val anotherDouble:Double = 3.1415926
val maxDouble:Double = Double.MAX_VALUE

val minDouble:Double = Double.MIN_VALUE


//short类型
val aShort:Short = 127
val maxShort:Short = Short.MAX_VALUE
val minShort:Short = Short.MIN_VALUE

//byte类型
val maxByte:Byte = Byte.MAX_VALUE
val minByte:Byte = Byte.MIN_VALUE
fun main(args: Array<String>){
 println("=========布尔============")
 println(aBoolean)
 println(anotherBoolean)

 println("=========int类型============")
 println(aInt)
 println(anotherInt)
 println(moreInt)
 println(maxInt)
 println(minInt)

 println("==========长整型===========")

 println(aLong)
 println(anotherLong)
 println( maxLong)
 println(minLong)


 println("=========float类型===========")

 println(aFloat)
 println(anotherFloat)
 println(maxFloat)
 println(minFloat)

 print("==============double================")
 println(aDouble)
 println(anotherDouble)
 println(maxDouble)
 println(minDouble)

 println("===========short================")
 println(maxShort)
 println(minShort)

 println("===========byte==========")
 println(maxByte)
 println(minByte)


}
