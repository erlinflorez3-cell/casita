package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.events.IEventSubscriber;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1626yg;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes4.dex */
public final class b70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vb0 f247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SharedPreferences f249c;

    public b70(Context context, vw vwVar, vb0 vb0Var, String str, String str2) throws Throwable {
        short sXd = (short) (FB.Xd() ^ 29986);
        short sXd2 = (short) (FB.Xd() ^ 10863);
        int[] iArr = new int[")dmpGOw".length()];
        QB qb = new QB(")dmpGOw");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        Intrinsics.checkNotNullParameter(context, new String(iArr, 0, i2));
        Intrinsics.checkNotNullParameter(str, C1626yg.Ud("@knQ9\u001f", (short) (C1499aX.Xd() ^ (-15754)), (short) (C1499aX.Xd() ^ (-17739))));
        Intrinsics.checkNotNullParameter(vwVar, Ig.wd("N&{KE\f!2cgR?\u001am\u0011b/,\rw]$", (short) (FB.Xd() ^ 29471)));
        Intrinsics.checkNotNullParameter(vb0Var, EO.Od("\u007f!b\u0005\u0016o\n)R\r\u0010*Dar\u00169_\b\te!tc:\u001f\u000e", (short) (OY.Xd() ^ 26973)));
        this.f247a = vb0Var;
        String str3 = C1561oA.Qd("0;8w+:(@*q6602 %\"i\u001d,\u001a2\u001c\u0015%)&\u001a\u0010\u001d\u0010&\f\u001f\u001f\u0019\u001b\t\u000e\u000b", (short) (C1607wl.Xd() ^ 14109)) + StringUtils.getCacheFileSuffix(context, str2, str);
        short sXd3 = (short) (Od.Xd() ^ (-8339));
        short sXd4 = (short) (Od.Xd() ^ (-1183));
        int[] iArr2 = new int["ESJYWRN\u0019O\\\\cU_f!7ddk]qn".length()];
        QB qb2 = new QB("ESJYWRN\u0019O\\\\cU_f!7ddk]qn");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd3 + i3)) - sXd4);
            i3++;
        }
        Class<?> cls = Class.forName(new String(iArr2, 0, i3));
        Class<?>[] clsArr = {Class.forName(C1561oA.od("PFZD\u0010MAME\u000b/OLBF>", (short) (OY.Xd() ^ 31564))), Integer.TYPE};
        Object[] objArr = {str3, 0};
        short sXd5 = (short) (C1607wl.Xd() ^ 2615);
        int[] iArr3 = new int["*)9\u0019/);//\u001c?355C7A7:I".length()];
        QB qb3 = new QB("*)9\u0019/);//\u001c?355C7A7:I");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - ((sXd5 + sXd5) + i4));
            i4++;
        }
        Method method = cls.getMethod(new String(iArr3, 0, i4), clsArr);
        try {
            method.setAccessible(true);
            this.f248b = (SharedPreferences) method.invoke(context, objArr);
            String str4 = Wg.Zd("\u001c)4fk)*4lv-{gz\u0019o]%jjhsmVy=)qU3\u001a~U&,j*\u001b',(", (short) (ZN.Xd() ^ 4504), (short) (ZN.Xd() ^ 21159)) + StringUtils.getCacheFileSuffix(context, str2, str);
            Class<?> cls2 = Class.forName(C1561oA.Xd("hvm|zuq<r\u007f\u007f\u0007x\u0003\nDZ\b\b\u000f\u0001\u0015\u0012", (short) (C1499aX.Xd() ^ (-15683))));
            Class<?>[] clsArr2 = new Class[2];
            short sXd6 = (short) (Od.Xd() ^ (-6629));
            int[] iArr4 = new int["6,D.};3?;\u0001)IJ@H@".length()];
            QB qb4 = new QB("6,D.};3?;\u0001)IJ@H@");
            int i5 = 0;
            while (qb4.YK()) {
                int iKK4 = qb4.KK();
                Xu xuXd4 = Xu.Xd(iKK4);
                iArr4[i5] = xuXd4.fK((sXd6 ^ i5) + xuXd4.CK(iKK4));
                i5++;
            }
            clsArr2[0] = Class.forName(new String(iArr4, 0, i5));
            clsArr2[1] = Integer.TYPE;
            Object[] objArr2 = {str4, 0};
            Method method2 = cls2.getMethod(Qg.kd("52@\u001e2*:,*\u00156((&2$, !.", (short) (C1499aX.Xd() ^ (-17144)), (short) (C1499aX.Xd() ^ (-29511))), clsArr2);
            try {
                method2.setAccessible(true);
                this.f249c = (SharedPreferences) method2.invoke(context, objArr2);
                vwVar.c(new IEventSubscriber() { // from class: bo.app.b70$$ExternalSyntheticLambda0
                    @Override // com.braze.events.IEventSubscriber
                    public final void trigger(Object obj) {
                        b70.a(this.f$0, (c70) obj);
                    }
                }, c70.class);
                a();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static final void a(b70 this$0, c70 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.f249c.edit().putLong("lastUpdateTime", it.f322a).apply();
    }

    public final void a() {
        long jNowInSeconds = DateTimeUtils.nowInSeconds() - TimeUnit.DAYS.toSeconds(45L);
        SharedPreferences pushMaxPrefs = this.f248b;
        Intrinsics.checkNotNullExpressionValue(pushMaxPrefs, "pushMaxPrefs");
        ArrayList arrayList = new ArrayList();
        Map<String, ?> all = pushMaxPrefs.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "this.all");
        Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
        while (it.hasNext()) {
            String campaignId = it.next().getKey();
            Intrinsics.checkNotNullExpressionValue(campaignId, "campaignId");
            arrayList.add(new z60(campaignId, pushMaxPrefs.getLong(campaignId, 0L)));
        }
        List<z60> list = CollectionsKt.toList(arrayList);
        SharedPreferences.Editor editorEdit = this.f248b.edit();
        for (z60 z60Var : list) {
            if (this.f248b.getLong(z60Var.f2356a, 0L) < jNowInSeconds) {
                editorEdit.remove(z60Var.f2356a);
            }
        }
        editorEdit.apply();
    }

    public final void a(String pushCampaign) {
        Intrinsics.checkNotNullParameter(pushCampaign, "pushCampaign");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new a70(pushCampaign), 7, (Object) null);
        if (StringsKt.isBlank(pushCampaign)) {
            return;
        }
        this.f248b.edit().putLong(pushCampaign, DateTimeUtils.nowInSeconds()).apply();
    }

    public final void b() {
        this.f248b.edit().clear().apply();
        this.f249c.edit().clear().apply();
    }
}
