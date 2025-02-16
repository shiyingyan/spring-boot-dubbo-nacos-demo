package com.example.nacossampleprovider.service;

import com.shing.IHelloService;
import org.apache.dubbo.config.annotation.DubboService;

/*
Shing 2025/2/16
*/
@DubboService
public class HelloServiceImpl implements IHelloService {
 @Override
 public String sayHello(String name) {
  return "hello world:"+name;
 }
}
