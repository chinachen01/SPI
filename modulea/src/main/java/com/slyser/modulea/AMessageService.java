package com.slyser.modulea;

import com.slyser.lib.MessageService;

/**
 * author: chenyong(<a href="chenyong@danlu.com">chenyong@danlu.com</a>)<br/>
 * version: 1.0.0<br/>
 * since: 2018/8/2 下午4:19<br/>
 *
 * <p>
 * 内容描述区域
 * </p>
 */
public class AMessageService implements MessageService {
    @Override
    public String getMessage() {
        return "Hello from module A";
    }
}
