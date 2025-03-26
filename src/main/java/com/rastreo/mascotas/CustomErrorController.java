package com.rastreo.mascotas;

import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

@Controller
public class CustomErrorController implements ErrorController {

    private final ErrorAttributes errorAttributes;

    public CustomErrorController(ErrorAttributes errorAttributes) {
        this.errorAttributes = errorAttributes;
    }

    @RequestMapping("/error")
    @ResponseBody
    public Map<String, Object> handleError(WebRequest webRequest) {
        return errorAttributes.getErrorAttributes(webRequest, ErrorAttributeOptions.defaults());
    }

    // El método getErrorPath ya no es necesario en Spring Boot 2.4 o superior
}