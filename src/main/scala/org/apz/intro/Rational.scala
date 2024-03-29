package org.apz.intro

class Rational(n: Int, d: Int) {
    private val g = gcd(n.abs, d.abs)
    
    val num: Int = n
    val den: Int = d
    
    require(den != 0) // IllegalArgumentException si no se cumple la condición
    
    override def toString = num + "/" + den
    
    def this(n: Int) = this(n, 1) // si el denominador no se indica, se asume 1
    
    /**
     * definición del máximo común divisor
     * @param a
     * @param b
     * @return
     */
    private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)    
    
    def +(other: Rational): Rational = new Rational(num * other.den + den * other.num, den * other.den)
    
    def -(other: Rational): Rational = new Rational(num * other.den - den * other.num, den * other.den)
    
    def *(other: Rational): Rational = new Rational(num * other.num, den * other.den)
    
    def /(other: Rational): Rational = new Rational(num * other.den, den * other.num)
    
    def equals(other: Rational): Boolean = (num/den) == (other.num / other.den)

}