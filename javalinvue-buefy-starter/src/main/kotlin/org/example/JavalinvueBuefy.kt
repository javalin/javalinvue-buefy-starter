package org.example

import io.javalin.Javalin
import io.javalin.apibuilder.ApiBuilder.get
import io.javalin.vue.VueComponent

fun main() {
    Javalin.create {
        it.staticFiles.enableWebjars()
    }.routes {
        get("/", VueComponent("example-page"))
    }.start(7070)
}
