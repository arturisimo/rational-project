package org.apz.intro

import org.scalatest.FlatSpec

class RationalSpec extends FlatSpec {
  
    "A rational with denominator 1" should "be equal to a natural number" in {
        val rat1 = new Rational(5)
        val rat2 = new Rational(5, 1)
        assert(rat1.toString === rat2.toString)
    }

    "A rational with denominator 0" should "not be allowed as it is not a valid rational" in {
        assertThrows[IllegalArgumentException] {
            new Rational(5, 0)
        }
    }
    
    "al comparar dos racionales" should "ser iguales si son fracciones equivalentes" in {
        val rat1 = new Rational(5)
        val rat2 = new Rational(5, 10)
        assert(rat1 equals rat2)
      
    }
    
    
    
}
