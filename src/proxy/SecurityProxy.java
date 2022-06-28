package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SecurityProxy implements InvocationHandler {

    private Object o;
    private SecurityProxy(Object o) {
        this.o = o;
    }

    public static Object newInstance(Object o) {
        return Proxy.newProxyInstance(o.getClass().getClassLoader(), o.getClass().getInterfaces(), new SecurityProxy(o));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;

        try {
            if (method.getName().equals("postToTimeline")) {
                throw new IllegalAccessException("postToTimeline is NOT ALLOWED!");
            } else {
                result = method.invoke(o, args);
            }
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        } catch (Exception e) {
            throw new RuntimeException("Unexpected invocation exception: " + e.getMessage());
        }

        return result;
    }

}
