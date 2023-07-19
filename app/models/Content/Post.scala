package models.Content

case class Post(title: String, textPost: String, codePost: String, datePost: Int, var votesPost: Int, val tags: List[String]) extends Content(textPost, codePost, datePost, votesPost) {
  var answers: List[Int] = List() //list of ids of answer
  def addAnswer(id:Int) = answers = id :: answers
}
