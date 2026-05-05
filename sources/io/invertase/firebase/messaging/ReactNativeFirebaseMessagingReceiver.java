package io.invertase.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.facebook.react.HeadlessJsTaskService;
import com.google.firebase.messaging.RemoteMessage;
import io.invertase.firebase.app.ReactNativeFirebaseApp;
import io.invertase.firebase.common.ReactNativeFirebaseEventEmitter;
import io.invertase.firebase.common.SharedUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.CX;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
public class ReactNativeFirebaseMessagingReceiver extends BroadcastReceiver {
    private static final String TAG = "RNFirebaseMsgReceiver";
    static HashMap<String, RemoteMessage> notifications = new HashMap<>();

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) throws Exception {
        short sXd = (short) (C1633zX.Xd() ^ (-7817));
        int[] iArr = new int["{Tay\u00072\u0012\u0017utA\u0016__o^\u001b\u007f\u0003\u0011Y$;\rd^<cO\u001b".length()];
        QB qb = new QB("{Tay\u00072\u0012\u0017utA\u0016__o^\u001b\u007f\u0003\u0011Y$;\rd^<cO\u001b");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        new String(iArr, 0, i2);
        C1561oA.Qd("-(\u001fAI;75F7\u001eC6 2/03?-9", (short) (Od.Xd() ^ (-29967)));
        if (ReactNativeFirebaseApp.getApplicationContext() == null) {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1593ug.zd("\b\u0016\r\u001c\u001a\u0015\u0011[\u0012\u001f\u001f&\u0018\")cy''. 41", (short) (C1580rY.Xd() ^ (-25896)), (short) (C1580rY.Xd() ^ (-710)))).getMethod(C1561oA.od("GDR\u001eLKFB;8J>CA\u0015@>C3E@", (short) (C1580rY.Xd() ^ (-19779))), new Class[0]);
            try {
                method.setAccessible(true);
                ReactNativeFirebaseApp.setApplicationContext((Context) method.invoke(context, objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        if (intent.getExtras() == null) {
            C1561oA.Kd("\u001b,*\u001d!! 35a,29+5<h<0/27E55qJ=I>vFHy@TQP@S", (short) (Od.Xd() ^ (-27688)));
            return;
        }
        RemoteMessage remoteMessage = new RemoteMessage(intent.getExtras());
        ReactNativeFirebaseEventEmitter sharedInstance = ReactNativeFirebaseEventEmitter.getSharedInstance();
        if (remoteMessage.getNotification() != null) {
            notifications.put(remoteMessage.getMessageId(), remoteMessage);
            ReactNativeFirebaseMessagingStoreHelper.getInstance().getMessagingStore().storeFirebaseMessage(remoteMessage);
        }
        if (SharedUtils.isAppInForeground(context)) {
            sharedInstance.sendEvent(ReactNativeFirebaseMessagingSerializer.remoteMessageToEvent(remoteMessage, false));
            return;
        }
        try {
            Intent intent2 = new Intent(context, (Class<?>) ReactNativeFirebaseMessagingHeadlessService.class);
            intent2.putExtra(Wg.Zd("|V\u001e\u001eQ%/", (short) (OY.Xd() ^ 18946), (short) (OY.Xd() ^ 24164)), remoteMessage);
            CX.ud();
            Class<?> cls = Class.forName(C1561oA.Xd("n|s\u0003\u0001{wBx\u0006\u0006\r~\t\u0010J`\u000e\u000e\u0015\u0007\u001b\u0018", (short) (FB.Xd() ^ 29180)));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(Wg.vd("%3*972.x\u001f,,3%/6p|#*\u001c&-", (short) (C1499aX.Xd() ^ (-11573))));
            Object[] objArr2 = {intent2};
            short sXd2 = (short) (C1607wl.Xd() ^ 23301);
            short sXd3 = (short) (C1607wl.Xd() ^ 17684);
            int[] iArr2 = new int["~~jz{Yjvykde".length()];
            QB qb2 = new QB("~~jz{Yjvykde");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(((sXd2 + i3) + xuXd2.CK(iKK2)) - sXd3);
                i3++;
            }
            Method method2 = cls.getMethod(new String(iArr2, 0, i3), clsArr);
            try {
                method2.setAccessible(true);
                if (((ComponentName) method2.invoke(context, objArr2)) != null) {
                    HeadlessJsTaskService.acquireWakeLockNow(context);
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (IllegalStateException e4) {
            hg.Vd("'EFMHRNSK@zG>KJ7<9Fq@>;GlC:<4g0,d8+'`-$10\u001d\"\u001fX()\u001f$&\u001c&*O\u0018!L\u001f\u0010\u001eH\u001c\u0016EK\f\f\t\tF", (short) (OY.Xd() ^ 5989), (short) (OY.Xd() ^ 27502));
        }
    }
}
