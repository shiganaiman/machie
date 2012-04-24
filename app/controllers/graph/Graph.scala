package controllers.graph
import play.api.libs.json.Json.toJson
import play.api.libs.json.JsValue
import play.api.mvc.Controller
import play.api.mvc.Action

object Graph extends Controller{
  
  val graphType =  Seq(
        		Seq("", "/graph"),
        		Seq("Liner", "/graph/liner"),
        		Seq("Quadratic", "/graph/quadratic")
        	)
  
  def index = Action{
    
    Ok(views.html.graph.graph.index(graphType, ""))
  }
}


