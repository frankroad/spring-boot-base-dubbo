package cn.xmt.donate;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author yank
 * 2018/1/19
 */
@Service(version = "1.0.0")
public class EchoServerImpl implements EchoService {

    @Override
    public String echo(String str) {
        return str;
    }
}
