//package controllers.graph
//import play.api.mvc.Controller
//import play.api.mvc.Action
//import play.api.libs.json.Json.toJson
//import play.api.libs.json.JsValue
//
//object Line extends Controller {
//
//
//  def m(min: Int, max: Int, a: Int)(datas: Seq[Seq[Int]]*): JsValue = {
//    toJson(Map("min" -> toJson(min), "max" -> toJson(max), "a" -> toJson(a), "data" -> toJson(datas)))
//  }
//
//  def equLiner(min: Int, max: Int, a: Int) = {
//    (min to max).foldLeft(Seq(Seq.empty[Int]))((s, x) => s :+ Seq(x, a * x))
//  }
//
//  def equQuadratic(min: Int, max: Int, a: Int) = {
//    (min to max).foldLeft(Seq(Seq.empty[Int]))((s, x) => s :+ Seq(x, a * x * x))
//  }
//
//  def liner(min: Int, max: Int, a: Int) = Action {
//    Ok(m(min, max, a)(equLiner(min, max, a)))
//  }
//
//  def quadratic(min: Int, max: Int, a: Int) = Action {
//    Ok(m(min, max, a)(equQuadratic(min, max, a)))
//  }
//
//  def linerAndQuadratic(min: Int, max: Int, a: Int) = Action {
//    Ok(m(min, max, a)(equLiner(min, max, a), equQuadratic(min, max, a)))
//  }
//
//}