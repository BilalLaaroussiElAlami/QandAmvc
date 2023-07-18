package models

//Keep user?
case class PostSTOF(text:String, code:String, date:Int, var votes:Int, tags:List[String]){
  def upvote() = votes+=1
}

