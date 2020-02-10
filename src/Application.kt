package com.lkb.ktordemo

import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.html.respondHtml
import io.ktor.routing.get
import io.ktor.routing.routing
import kotlinx.html.*


fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)


fun Application.module(testing: Boolean = false) {
    routing {
        get("/"){
            call.respondHtml {
                head {
                    title { +"Async World" }
                }
                body {
                    h1 {
                        +"Title"
                    }
                }
            }
        }
    }
}