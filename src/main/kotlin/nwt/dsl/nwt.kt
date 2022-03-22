package nwt.dsl

fun nwt(initialize: NwtBuilder.() -> Unit) {
  NwtBuilder().apply(initialize)
}
