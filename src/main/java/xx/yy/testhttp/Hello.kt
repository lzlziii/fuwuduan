package xx.yy.testhttp

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class H {

  @RequestMapping("hello")
  fun h(): String {
    return "AAAAAAAasdfasdf"
  }

}