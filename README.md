# http4s-scala-xml-1

This is a backport of [http4s'][http4s] integration module for
[scala-xml][scala-xml] based on scala-xml-1.x.  Most users will want
scala-xml-2.x support, which is in the standard `http4s-scala-xml`
module.

## Why?

[Twirl][twirl], a template engine integrated into http4s, is still
built on scala-xml-1.x for Scala 2.  To avoid a diamond dependency
with `http4s-twirl` or any other scala-xml-1.x library, we offer this
backport.

[http4s]: https://http4s.org/
[scala-xml]: https://github.com/scala/scala-xml
[twirl]: https://github.com/playframework/twirl
