package models.Content

case class Answer(textAns: String, codeAns: String, dateAns: Int, var votesAns: Int, val post: Int) extends
  Content(textAns, codeAns, dateAns, votesAns)
