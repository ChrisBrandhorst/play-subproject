package controllers.sub

import play.api._
import play.api.mvc._

object SubApplication extends Controller {
  
  def index = Action {
    Ok(views.html.sub.index("From Sub"))
  }
  
}
