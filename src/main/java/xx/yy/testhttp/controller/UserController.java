package xx.yy.testhttp.controller;

import xx.yy.testhttp.User;
import xx.yy.testhttp.Utils.SerializeUtils;
import xx.yy.testhttp.jpa.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Objects;

@RestController
public class UserController {

  @Autowired
  private PersonRepository pp;

  @RequestMapping("/helloUser/{id}")
  String selectUser(@PathVariable Integer id) {
    return "sss";
  }

  @RequestMapping("/jia")
  String ip() {
    if (pp.findById(1L).isPresent()) {
      System.err.println("testjpa" + pp.findById(1L).get());
    }
    return "xing";
  }

  @RequestMapping("/oooo")
  String o(HttpServletRequest req) throws IOException, ClassNotFoundException {

    String jin = req.getParameter("account");
    System.err.println("jin: " + jin);

    User x = new User();

    String a = SerializeUtils.serialize(x);
    System.err.println("aaa: " + a);
    User y = ((User) SerializeUtils.serializeToObject(a));
    User z = ((User) SerializeUtils.serializeToObject(jin));
    System.err.println("test: " + y.toString());
    System.err.println("test: " + z.toString());

    if (!Objects.equals(jin, a)) {
      System.err.println("bu deng");
    }

    return "asdf";
  }

  @RequestMapping("/big")
  String f(HttpServletRequest req) throws IOException, ClassNotFoundException {
    String big = req.getParameter("big");
    System.err.println("big: " + big);
    BigInteger x = ((BigInteger) SerializeUtils.serializeToObject(big));
    System.err.println(x.toString());
    return "chenggong";
  }
}

