package app.equations

trait Equation {
  
  val max:Int;
  val min:Int;
  val as:Seq[Int];
  
  def calculate(f: => Int):(Int, Int , Seq[Int], Seq[Seq[Int]]) = {
	 val a = as(0);
	 (max, min, as, (min to max).foldLeft(Seq(Seq.empty[Int]))((s, x) => s :+ Seq(x,  f)));
  }
}