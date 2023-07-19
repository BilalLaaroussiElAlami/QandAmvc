package models

//Keep user?
//Change date to more fitting type
case class PostSTOF(title:String, text:String, code:String, date:Int, var votes:Int, tags:List[String]){
  def upvote() = votes+=1
}

