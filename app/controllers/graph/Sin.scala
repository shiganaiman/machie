package controllers.graph
import play.api.mvc.Controller
import play.api.mvc.Action
import play.api.libs.json.Json.toJson
import play.api.libs.json.JsValue

object Sin extends Controller {


  def m(min: Double, max: Double, a: Double)(datas: Seq[Seq[Double]]*): JsValue = {
    toJson(Map("min" -> toJson(min), "max" -> toJson(max), "a" -> toJson(a), "data" -> toJson(datas)))
  }

  def equLiner(min: Double, max: Double, a: Double) = {
    (min to max by 0.1).foldLeft(Seq(Seq.empty[Double]))((s, x) => s :+ Seq(x, a * math.sin(x)))
  }

  def index() = Action {
    Ok(views.html.graph.sin.index(Graph.graphType, "Sin"))
  }

  def show(min:String, max:String, a:String) = Action {
    Ok(m(min.toDouble, max.toDouble, a.toDouble)(equLiner(min.toDouble, max.toDouble, a.toDouble)))
  }


}