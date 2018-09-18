package com.prasetia.erpui.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController{
    @RequestMapping("")
    fun home(model:Model): String{
        return "home"
    }
}