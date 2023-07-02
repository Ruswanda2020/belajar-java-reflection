package progremmerbeginner.belajar_java_reflection;

import org.junit.jupiter.api.Test;
import progremmerbeginner.belajar_java_reflection.data.Car;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest{
    @Test
    void testProxy() {
        InvocationHandler invocationHandler= new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                if (method.getName().equals("getName")){
                    return "this car proxy";
                }else if (method.getName().equals("run")){
                    System.out.println("car is runing");
                }
                return null;
            }
        };

        Car car =(Car) Proxy.newProxyInstance(
                ClassLoader.getPlatformClassLoader(),
                new Class[]{Car.class}, invocationHandler);

        car.getName();

    }
}
