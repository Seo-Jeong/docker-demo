package com.xuting.contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: docker-demo
 * @author: xuting
 * @create: 2020-09-25 20:59
 * @description:
 **/
@RestController
public class DockerController {
//    static Log log = LogFactory.getLog(DockerController.class);

    @RequestMapping("/")
    public String index() {
//        log.info("Hello Docker!");
        return "Hello Docker!";
    }
}