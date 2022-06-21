# http4s-scala-xml-1

This was a backport of [http4s'][http4s] integration module for
[scala-xml] based on scala-xml-1.x.  Support for both 
scala-xml-1.x and scala-xml-2.x is now maintained in [http4s-scala-xml].
This repository is now archived.

## Why?

[Twirl][twirl], a template engine integrated into http4s, is still
built on scala-xml-1.x for Scala 2.  To avoid a diamond dependency
with `http4s-twirl` or any other scala-xml-1.x library, we offer this
backport.

[http4s]: https://http4s.org/
[http4s-scala-xml]: https://github.com/http4s/http4s-scala-xml
[scala-xml]: https://github.com/scala/scala-xml
[twirl]: https://github.com/playframework/twirl
