package models

object ContactDao {
    var contacts: Seq[Contact] = Seq(
      Contact("Alex", "0123416782"),
      Contact("Bob", "0123456789"),
      Contact("Alice", "0156789123"),
      Contact("Tom", "0189123456"))

  def findAll: List[Contact] = contacts.toList

  def lookupContact(name: String): Seq[Contact] = {
      contacts.filter(_.name== name)
    }
}
