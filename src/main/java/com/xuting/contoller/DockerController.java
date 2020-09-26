package com.xuting.contoller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: docker-demo
 * @author: xuting
 * @create: 2020-09-25 20:59
 * @description:
 **/
@RestController
@Slf4j
public class DockerController {

    @RequestMapping("/")
    public String index() {
        log.info("Hello Docker!");
        return "Hello Docker!";
    }
}