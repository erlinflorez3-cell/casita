package fr.antelop.exposed;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import fr.antelop.sdk.firebase.AntelopFirebaseMessagingUtil;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Xu;

/* JADX INFO: loaded from: classes5.dex */
public final class DefaultAntelopFirebaseMessagingService extends FirebaseMessagingService {
    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onMessageReceived(RemoteMessage remoteMessage) throws Throwable {
        Class<?> cls = Class.forName(Qg.kd("CODQMF@\t=HFK;CH\u0001\u0015@>C3E@", (short) (OY.Xd() ^ 22096), (short) (OY.Xd() ^ 27004)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1499aX.Xd() ^ (-30730));
        short sXd2 = (short) (C1499aX.Xd() ^ (-23542));
        int[] iArr = new int[".+9\u000532-)\"\u001f1%*({'%*\u001a,'".length()];
        QB qb = new QB(".+9\u000532-)\"\u001f1%*({'%*\u001a,'");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            AntelopFirebaseMessagingUtil.onMessageReceived((Context) method.invoke(this, objArr), remoteMessage);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onNewToken(String str) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.ud("\u0012\u001e\u0013 \u001c\u0015\u000fW\f\u0017\u0015\u001a\n\u0012\u0017Oc\u000f\r\u0012\u0002\u0014\u000f", (short) (C1580rY.Xd() ^ (-23843)))).getMethod(C1561oA.yd("98H\u0016>?<:-,@655\u000b8PWI]R", (short) (C1499aX.Xd() ^ (-30144))), new Class[0]);
        try {
            method.setAccessible(true);
            AntelopFirebaseMessagingUtil.onTokenRefresh((Context) method.invoke(this, objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
