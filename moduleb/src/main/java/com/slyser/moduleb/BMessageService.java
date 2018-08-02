package com.slyser.moduleb;

import com.google.auto.service.AutoService;

import com.slyser.lib.MessageService;

/**
 * author: chenyong(<a href="chenyong@danlu.com">chenyong@danlu.com</a>)<br/>
 * version: 1.0.0<br/>
 * since: 2018/8/2 下午4:24<br/>
 *
 * <p>
 * 内容描述区域
 * </p>
 */
@AutoService(MessageService.class)
public class BMessageService implements MessageService {
    @Override
    public String getMessage() {
        return "Welcome from b";
    }
}
