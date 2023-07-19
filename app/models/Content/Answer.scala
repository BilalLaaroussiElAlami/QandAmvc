package models.Content

case class Answer(titleAns: String, textAns: String, codeAns: String, dateAns: Int, var votesAns: Int, val post: Post) extends
  Content(titleAns, textAns, codeAns, dateAns, votesAns)
