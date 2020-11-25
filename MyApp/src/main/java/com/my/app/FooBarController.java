package com.my.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * FooBar service controller.
 *
 * This controller implements the following behavior:
 *
 * GET /foobars/{number}
 * which returns FooBar representation of a single number, for example {"value": "Foo"}
 *
 * GET /foobars?start={start}&end={end}
 * which returns a list of FooBar values for the range {start, end}. The query arguments following '?' are optional
 *
 */
@RestController
@RequestMapping("/foobars")
public class FooBarController {

  @Autowired
  private FooBarService fooBarService;

  @RequestMapping(value = "/{number}", method = RequestMethod.GET)
  @ResponseBody
  public Map<String, Object> getNumber(@PathVariable String number) {
    HashMap map = new HashMap();
    // TODO
    // use com.my.app.FooBarService.getNumberValue
    // map.put("value", {FooBar value});
    return map;
  }


  @RequestMapping(value = {"/", ""}, method = RequestMethod.GET)
  @ResponseBody
  public List<Object> getNumbers(@RequestParam(value = "start", defaultValue = "1", required = false) String start,
                                 @RequestParam(value = "end", defaultValue = "100", required = false) String end) {

    List<Object> list = new ArrayList<>();
    // TODO
    // use com.my.app.FooBarService.getNumberValues to populate the list
    return list;
  }

  @RequestMapping(value = "/{number}", method = RequestMethod.PUT)
  public void setNumber(@PathVariable String number, @RequestBody Map<String, Object> body,
                        HttpServletResponse response, HttpServletRequest request) {

    // TODO
    // use com.my.app.FooBarService#setNumberValue
    // send appropriate response code and headers as necessary
  }
}
