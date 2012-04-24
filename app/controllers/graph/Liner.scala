package controllers.graph
import play.api.mvc.Controller
import play.api.mvc.Action
import play.api.libs.json.Json.toJson
import play.api.libs.json.JsValue

object Liner extends Controller {


  def m(min: Int, max: Int, a: Int)(datas: Seq[Seq[Int]]*): JsValue = {
    toJson(Map("min" -> toJson(min), "max" -> toJson(max), "a" -> toJson(a), "data" -> toJson(datas)))
  }

  def equLiner(min: Int, max: Int, a: Int) = {
    (min to max).foldLeft(Seq(Seq.empty[Int]))((s, x) => s :+ Seq(x, a * x))
  }

  def index() = Action {
    Ok(views.html.graph.liner.index(Graph.graphType, "Liner"))
  }

  def show(min: Int, max: Int, a: Int) = Action {
    Ok(m(min, max, a)(equLiner(min, max, a)))
  }


}