package controllers.graph.distribution
import play.api.mvc.Controller
import play.api.mvc.Action
import play.api.libs.json.Json.toJson
import play.api.libs.json.JsValue

object StandardNormal extends Controller {


//  def m(min: Int, max: Int, a: Int)(datas: Seq[Seq[Int]]*): JsValue = {
//    toJson(Map("min" -> toJson(min), "max" -> toJson(max), "a" -> toJson(a), "data" -> toJson(datas)))
//  }

//  def equQuadratic(min: Int, max: Int, a: Int) = {
//    (min to max).foldLeft(Seq(Seq.empty[Int]))((s, x) => s :+ Seq(x, a * x * x))
//  }

//  def index() = Action {
//    Ok(views.html.graph.quadratic.index(Graph.graphType, "Quadratic"))
//  }

//  def show(min: Int, max: Int, a: Int) = Action {
//    Ok(m(min, max, a)(equQuadratic(min, max, a)))
//  }

  def index = TODO
  
}