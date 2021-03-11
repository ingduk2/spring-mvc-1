package spring.mvc.web.frontcontroller.v3;

import spring.mvc.web.frontcontroller.ModelView;

import java.util.Map;

public interface ControllerV3 {

    ModelView process(Map<String, String> paramMap);
}
