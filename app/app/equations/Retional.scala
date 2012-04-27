package app.equations
import scala.math.BigInt

class Retional(n: Int, d: Int) {
  require(d != 0)
  val g = gcd(n.abs, d.abs)
  val numer = n / g
  val denom = d / g
  def this(n: Int) = this(n, 1)
  override def toString = {
    denom match {
      case 1 => numer.toString()
      case _ => numer + "/" + denom
    }
  }
  def add(that: Retional): Retional =
    new Retional(
      numer * that.denom + that.numer * denom,
      denom * that.denom)
  def +(that: Retional): Retional = add(that)

  def *(that: Retional): Retional =
    new Retional(
      numer * that.numer, denom * that.denom)

  
  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)

}

implicit def intToRational(x: Int)= new Retional(x)
