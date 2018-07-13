package com.app.service

import org.apache.spark.unsafe.types.UTF8String
import org.apache.commons.text.similarity.JaroWinklerDistance

final class ScalaClass(aString: String, val anInteger: Int) {
    def this(aBool: Boolean) {
        this("defaultString", -1)
    }

    val theString = "theString"

    var someString = "some"

    
    
    def minus(x: Int, y: Int): Int = { 
    
    	var sum:Int = 0
      sum = x - y
      return sum
    
    }
    
    def plus(x: Int, y: Int): Int = { 
    	var sum:Int = 0
      sum = x + y
      return sum
    }
    
    def jaroWinklerDistanceDistance(s1: String, s2: String): Double = {
    	
    	var jwd: JaroWinklerDistance = new JaroWinklerDistance()
    	var jwDistance: Double  = jwd.apply(s1, s2)
    	
    	return jwDistance
    	
    }
	
	def levenshteinDistance2(s1: UTF8String, s2: UTF8String): Int = s1.levenshteinDistance(s2)
    
}
