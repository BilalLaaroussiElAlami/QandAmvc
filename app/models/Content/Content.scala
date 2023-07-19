package models.Content

class Content(val title:String,val  text:String, val code:String, val date:Int, var votes:Int){
  def upvote() = votes+=1
  def downvote() = votes-=1
  val id = Content.generateID()
}

object Content{
  var id = 0;
  def generateID() = {
    id +=1
    id
  }
}

