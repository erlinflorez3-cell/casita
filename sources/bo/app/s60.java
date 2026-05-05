package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.FB;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes4.dex */
public final class s60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantLock f1743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f1744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SharedPreferences f1745c;

    public s60(Context context, String str) throws Throwable {
        Intrinsics.checkNotNullParameter(context, Wg.Zd("z!'5-G\u000f", (short) (ZN.Xd() ^ 23888), (short) (ZN.Xd() ^ 22806)));
        Intrinsics.checkNotNullParameter(str, C1561oA.Xd("\u007f\u0010\nl\b\u001d", (short) (ZN.Xd() ^ 26522)));
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f1743a = reentrantLock;
        ArrayList arrayList = new ArrayList();
        this.f1744b = arrayList;
        String str2 = Wg.vd("\u0012\u001f\u001a[\u0015&\u0012,\u001ce(**.\u001a!$m\u001f0$>&!7=8.*0.6w\u0006q\u007f\fr\u0004\u0006\u0006\nu|\u007f", (short) (OY.Xd() ^ 4853)) + StringUtils.getCacheFileSuffix(context, null, str);
        Class<?> cls = Class.forName(Qg.kd("MYN[WPJ\u0013GRPUEMR\u000b\u001fJHM=OJ", (short) (C1580rY.Xd() ^ (-8709)), (short) (C1580rY.Xd() ^ (-20389))));
        Class<?>[] clsArr = {Class.forName(yg.hg.Vd("\u0010\u0006\u001a\u0004O\r\u0001\r\u0005Jn\u000f\f\u0002\u0006}", (short) (C1499aX.Xd() ^ (-15942)), (short) (C1499aX.Xd() ^ (-3696)))), Integer.TYPE};
        Object[] objArr = {str2, 0};
        short sXd = (short) (FB.Xd() ^ 20749);
        int[] iArr = new int[",)7\u0015)!1#!\f-\u001f\u001f\u001d)\u001b#\u0017\u0018%".length()];
        QB qb = new QB(",)7\u0015)!1#!\f-\u001f\u001f\u001d)\u001b#\u0017\u0018%");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr);
            this.f1745c = sharedPreferences;
            reentrantLock.lock();
            try {
                arrayList.clear();
                Map<String, ?> all = sharedPreferences.getAll();
                short sXd2 = (short) (OY.Xd() ^ 31994);
                int[] iArr2 = new int["la_Krfdr2fno".length()];
                QB qb2 = new QB("la_Krfdr2fno");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 ^ i3));
                    i3++;
                }
                Intrinsics.checkNotNullExpressionValue(all, new String(iArr2, 0, i3));
                Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
                while (it.hasNext()) {
                    String key = it.next().getKey();
                    ArrayList arrayList2 = this.f1744b;
                    short sXd3 = (short) (C1580rY.Xd() ^ (-22979));
                    int[] iArr3 = new int["NMZ^PYX`<X".length()];
                    QB qb3 = new QB("NMZ^PYX`<X");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (((sXd3 + sXd3) + sXd3) + i4));
                        i4++;
                    }
                    Intrinsics.checkNotNullExpressionValue(key, new String(iArr3, 0, i4));
                    arrayList2.add(new o60(key, this.f1745c.getLong(key, 0L)));
                }
                Unit unit = Unit.INSTANCE;
            } finally {
                reentrantLock.unlock();
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        ReentrantLock reentrantLock = this.f1743a;
        reentrantLock.lock();
        try {
            for (o60 o60Var : this.f1744b) {
                if (arrayList.size() >= 32) {
                    break;
                }
                arrayList.add(o60Var);
            }
            this.f1744b.removeAll(arrayList);
            return arrayList;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void a(String pushCampaignId) {
        Intrinsics.checkNotNullParameter(pushCampaignId, "pushCampaignId");
        ReentrantLock reentrantLock = this.f1743a;
        reentrantLock.lock();
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new p60(pushCampaignId), 7, (Object) null);
            long jNowInSeconds = DateTimeUtils.nowInSeconds();
            this.f1745c.edit().putLong(pushCampaignId, jNowInSeconds).apply();
            this.f1744b.add(new o60(pushCampaignId, jNowInSeconds));
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void a(List events) {
        Intrinsics.checkNotNullParameter(events, "events");
        ReentrantLock reentrantLock = this.f1743a;
        reentrantLock.lock();
        try {
            SharedPreferences.Editor editorEdit = this.f1745c.edit();
            Iterator it = events.iterator();
            while (it.hasNext()) {
                o60 o60Var = (o60) it.next();
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new q60(o60Var), 7, (Object) null);
                String string = o60Var.f260b.getString("cid");
                Intrinsics.checkNotNullExpressionValue(string, "data.getString(IBrazeEvent.DATA_CAMPAIGN_ID)");
                editorEdit.remove(string);
            }
            editorEdit.apply();
            this.f1744b.removeAll(events);
        } finally {
            reentrantLock.unlock();
        }
    }
}
