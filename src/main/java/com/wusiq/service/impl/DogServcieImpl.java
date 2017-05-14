package com.wusiq.service.impl;

import com.wusiq.service.DogServcie;

/**
 * 用一个狗子的例子，实现从配置文件获取值的功能
 */
public class DogServcieImpl implements DogServcie{
    private String dogName = null;

    public DogServcieImpl(String dogName){
        this.dogName = dogName;
    }

    @Override
    public void dogDo() {
        System.out.println(dogName + " go to school and stardy!");
    }
}
