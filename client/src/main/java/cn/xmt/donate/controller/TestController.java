package cn.xmt.donate.controller;

import cn.xmt.donate.EchoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;

@RestController
public class TestController {

    @Reference(version = "1.0.0")
    private EchoService echoService;

    @GetMapping("/echo/{str}")
    public String echo(@PathVariable String str) {
        return echoService.echo(str);
    }
}
