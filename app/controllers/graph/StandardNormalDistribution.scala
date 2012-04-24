package controllers.graph
import play.api._
import play.api.mvc._
import java.math.BigDecimal

object Distribution  extends Controller{
  
  def index() = Action{
    Ok("")
  }
  
  def show(min:BigDecimal, max:BigDecimal) = Action{
    Ok("")
  }


}