package models

import play.api.libs.json.JsError
import play.api.libs.json.JsResult.Exception

import javax.inject.Inject
import scala.::

@javax.inject.Singleton
class PostDaoSTOF @Inject()() {

  var posts: Seq[PostSTOF] = Seq(
    PostSTOF("title",  "What does the * stand for?", "float *x", 2023, 0, List("C", "Pointer")),
    PostSTOF("title","Why do i get a stackoverflow error?", "def main(): \n main()", 2015, 10, List("error", "python")),
    PostSTOF("title","What is a macro?", "#define SIZE 30", 2019, 5, List("macros", "C")),
    PostSTOF("title","What is an if", "if true ok", 2017, 2, List("beginner")),
    PostSTOF("title","What is an if", "if true ok", 2017, 2, List("beginner")),
    PostSTOF("title","What is an if", "if true ok", 2017, 2, List("beginner")),
    PostSTOF("title","What is an if", "if true ok", 2017, 2, List("beginner")),
    PostSTOF("title","What is an if", "if true ok", 2017, 2, List("beginner")))


  def findbyId(idd:Int): PostSTOF = {
    posts.find(p => p.id == idd).getOrElse(throw Exception(JsError("couldn't find post by id")))
  }
  def upvote(id: Int) = {
    val index = posts.indexWhere(p => p.id == id)
    val post = posts(index)
    post.upvote()
  }
  def downvote(id: Int) = {
    val index = posts.indexWhere(p => p.id == id)
    val post = posts(index)
    post.downvote()
  }
  def add(p:PostSTOF) = {
    posts = posts :+ p
  }
  def lookupPost(p: PostSTOF): Boolean = {
    posts.contains(p)
  }
  def sortPostsByDate() = {
     posts.sortWith((p1,p2) => p1.date < p2.date)
  }
  def sortPostsByUpvotes() = {
     posts.sortWith((p1,p2) => p1.votes < p2.votes)
  }
  def searchByTag(tag:String) = {
    posts.filter(p => p.tags.contains(tag))
  }
  
}
