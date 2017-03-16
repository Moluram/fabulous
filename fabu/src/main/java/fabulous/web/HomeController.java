package fabulous.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by moluram on 6.3.17.
 */
@Controller
public class HomeController {

  @RequestMapping(value = "/")
  public String home() {
    return "/main";
  }
}
