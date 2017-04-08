package gitbucket.helloworld.controllers

import gitbucket.core.controller.ControllerBase

class HelloWorldController extends ControllerBase {

  get("/helloworld"){
    "Hello World!"
  }

}