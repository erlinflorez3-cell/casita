package j;

import android.app.Application;
import com.cleafy.mobile.detection.agent.configuration.CleafyConfiguration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import kotlinx.coroutines.CoroutineDispatcher;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;

/* JADX INFO: loaded from: classes6.dex */
public final class slide {

    /* JADX INFO: renamed from: a */
    public final CleafyConfiguration f19795a;

    /* JADX INFO: renamed from: b */
    public final Map f19796b;

    /* JADX INFO: renamed from: c */
    public final skate f19797c;

    /* JADX INFO: renamed from: d */
    public final String f19798d;

    /* JADX INFO: renamed from: e */
    public final apparatus f19799e;

    /* JADX INFO: renamed from: f */
    public final CoroutineDispatcher f19800f;

    public slide(Application application, CleafyConfiguration cleafyConfiguration, Map map, CoroutineDispatcher coroutineDispatcher) throws Throwable {
        skate skateVar = new skate(application);
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.yd("\u0006\u0012\u0007\u0014\u0018\u0011\u000bS\u007f\u000b\t\u000e\u0006\u000e\u0013KW\u0003\u0001\u0006}\u0010\u000b", (short) (C1607wl.Xd() ^ 1953))).getMethod(C1561oA.Yd("\u001a\u0019)\u0006\u0018\u001b$\u001b\"!\u000b\u001f,%", (short) (C1499aX.Xd() ^ (-31086))), new Class[0]);
        try {
            method.setAccessible(true);
            String str = (String) method.invoke(application, objArr);
            apparatus apparatusVar = new apparatus(application);
            this.f19795a = cleafyConfiguration;
            this.f19796b = map;
            this.f19797c = skateVar;
            this.f19798d = str;
            this.f19799e = apparatusVar;
            this.f19800f = coroutineDispatcher;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
