package com.xavier.design.pattern.proxy.cglib;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @authore wuyanfeng
 * @description
 * @date 2018/4/7
 */
public class CGlibProxy implements MethodInterceptor {

    private Enhancer enhancer = new Enhancer();

    public Object getProxy(Class clazz) {
        //设置创建子类的类
        enhancer.setSuperclass(clazz);
        //设置回调
        enhancer.setCallback(this);
        //创建子类的实例
        return enhancer.create();
    }

    /**
     * 拦截所有目标类方法的调用
     * obj目标类的实例
     * m目标方法的返回对象
     * args方法的参数
     * proxy代理类的实例
     */
    @Override
    public Object intercept(Object obj, Method m, Object[] args,
                            MethodProxy proxy) throws Throwable {

        judge();
        proxy.invokeSuper(obj, args);

        return null;
    }

    /**
     * 代理功能的业务逻辑
     */
    public void judge() {

        System.out.println("--验证用户信息--");
    }

}
