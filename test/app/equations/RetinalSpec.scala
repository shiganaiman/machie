package app.equations

import org.specs2.mutable._

class RetionalSpec extends SpecificationWithJUnit {

  "A Retional(1, 2)" should {
    val retional = new Retional(1, 2);
    "have numer" in {
      retional.numer must not beNull
    }
    "have denom" in {
      retional.denom must not beNull
    }
    "be 1" in {
      retional.numer must equalTo (1)
    }
    "be 2" in {
      retional.denom must equalTo (2)
    }
    "return '1/2'" in {
      retional.toString() must equalTo("1/2")
    }
  }
}