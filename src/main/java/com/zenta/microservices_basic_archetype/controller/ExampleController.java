package com.zenta.microservices_basic_archetype.controller;

import com.zenta.microservices_basic_archetype.entities.RequestExample;
import com.zenta.microservices_basic_archetype.entities.ResponseExample;
import io.swagger.annotations.ApiParam;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class ExampleController  {


    private static final Logger logger = LoggerFactory.getLogger(ExampleController.class);

    @RequestMapping(method = RequestMethod.POST , value="/api/services/ExampleServiceOne")
    public ResponseExample exampleMethod(@ApiParam( required = true) @RequestBody RequestExample request){

        logger.info("Logging INFO form exampleService One");
        ResponseExample es = new ResponseExample();
        es.setCode("00");
        es.setMessage("Exitoso");
        return es;
    }


    @RequestMapping(method = RequestMethod.POST , value="/api/services/ExampleServiceTwo")
    public ResponseExample exampleMethodTwo(@ApiParam( required = true) @RequestBody RequestExample request){

        logger.error("Logging ERROR from exampleService Two");
        ResponseExample es = new ResponseExample();
        es.setCode("99");
        es.setMessage("Error");
        return es;
    }


}
