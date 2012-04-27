package app.equations

import org.specs2.mutable._

class RetionalSpec extends Specification {

  "A Retional(1, 2)" should {
    val retional = new Retional(1, 2);
    "have numer" in {
      retional.numer must not beNull
    }
    "have denom" in {
      retional.denom must not beNull
    }
    "be 1" in {
      retional.numer must be_==(1)
    }
    "be 2" in {
      retional.denom must be_==(2)
    }
    "return '1/2'" in {
      retional.toString() must be_==("1/2")
    }
  }

  "A Retional(2, 4)" should {
    "equal '1/2'" in {
      new Retional(1, 2).toString() must be_==("1/2")
    }
  }

  "A Retional(5, 0)" should {
    "throw Exception" in {
      new Retional(5, 0) must throwA[IllegalArgumentException]
    }
  }

  "1/3 add 1/3" should {
    "equal 2/3" in {
      (new Retional(1, 3) add new Retional(1, 3)).toString() must be_==("2/3")

    }
  }
  "3/8 add 1/8" should {
    "equal 1/2" in {
      (new Retional(3, 8) add new Retional(1, 8)).toString() must be_==("1/2")

    }
  }
  "2/3 add 3/4" should {
    "equal 17/12" in {
      (new Retional(2, 3) add new Retional(3, 4)).toString() must be_==("17/12")

    }
  }
  "2/3 + 3/4" should {
    "equal 17/12" in {
      (new Retional(2, 3) + new Retional(3, 4)).toString() must be_==("17/12")

    }
  }
  "2/3 * 3/4" should {
    "equal 1/2" in {
      (new Retional(2, 3) * new Retional(3, 4)).toString() must be_==("1/2")

    }
  }
  "2 * 2/3" should {
    "equal 4/3" in {
      implicit def intToRational(x: Int)= new Retional(x)
      (2 * new Retional(4, 3)).toString() must be_==("4/3")
    }
  }
 }