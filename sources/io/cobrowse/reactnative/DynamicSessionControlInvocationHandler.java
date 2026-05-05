package io.cobrowse.reactnative;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class DynamicSessionControlInvocationHandler implements InvocationHandler {
    private CobrowseIOCommonDelegates delegates;
    private final Map<String, Method> methods = new HashMap();

    DynamicSessionControlInvocationHandler(CobrowseIOCommonDelegates cobrowseIOCommonDelegates) {
        this.delegates = cobrowseIOCommonDelegates;
        for (Method method : cobrowseIOCommonDelegates.getClass().getDeclaredMethods()) {
            this.methods.put(method.getName(), method);
        }
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (method.getName() == "showSessionControls" || method.getName() == "hideSessionControls") {
            return null;
        }
        return this.methods.get(method.getName()).invoke(this.delegates, objArr);
    }
}
