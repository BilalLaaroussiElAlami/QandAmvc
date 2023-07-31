package models.Content

case class Answer(textAns: String, codeAns: String, dateAns: Int, var votesAns: Int, var post: Int) extends
  Content(textAns, codeAns, dateAns, votesAns)
