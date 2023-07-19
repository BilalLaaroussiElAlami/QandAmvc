package models.Content

case class Post(titlePost: String, textPost: String, codePost: String, datePost: Int, var votesPost: Int, val tags: List[String]) extends Content(titlePost, textPost, codePost, datePost, votesPost) {
  var answers: List[Int] = List() //list of ids of answer
  def addAnswer(id:Int) = answers = id :: answers
}
