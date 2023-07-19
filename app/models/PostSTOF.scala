package models

//Keep user?
//Change date to more fitting type
case class PostSTOF(title:String, text:String, code:String, date:Int, var votes:Int, tags:List[String]){
  def upvote() = votes+=1
  def downvote() = votes-=1
  val id = PostSTOF.generateID()
}
object PostSTOF{
  var id = 0;
  def generateID() = {
    id +=1
    id
  }
}
