package models.Content

import play.api.libs.json.JsError
import play.api.libs.json.JsResult.Exception

import javax.inject.Inject

@javax.inject.Singleton
class AnswerDao @Inject()() {
  var answers:Seq[Answer] = Seq()

  def add(answer: Answer) = {
    answers = answers :+ answer
  }

  def findById(id:Int) = {
    answers.find(a => a.id == id).getOrElse(throw Exception(JsError(s"couldn't find answer by id $id")))
  }

  def upvote(id: Int) = {
    print("got here A🙏")
    val index = answers.indexWhere(p => p.id == id)
    print("got here B 🙏")
    val answerr = answers(index)
    print("got here C 🙏")
    answerr.upvote()
  }
  def downvote(id: Int) = {
    val index = answers.indexWhere(p => p.id == id)
    val answerr = answers(index)
    answerr.downvote()
  }
}
