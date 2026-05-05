package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.support.StringUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.EnumSet;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.Od;
import yg.Wg;
import yg.ZN;

/* JADX INFO: loaded from: classes4.dex */
public final class la0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f1182a;

    public la0(Context context, String str, String str2) throws Throwable {
        Intrinsics.checkNotNullParameter(context, EO.Od("\u0003],\u0018\nBh", (short) (Od.Xd() ^ (-14625))));
        Intrinsics.checkNotNullParameter(str, C1561oA.Qd("ol]i?Y", (short) (Od.Xd() ^ (-31865))));
        Intrinsics.checkNotNullParameter(str2, C1593ug.zd("Vf`C^s", (short) (C1607wl.Xd() ^ 26813), (short) (C1607wl.Xd() ^ 31983)));
        Object[] objArr = {C1561oA.od("HSP\u0010CR@XB\nNNHJ8=:\u0002F6</<3A-/+=)&)&'+'", (short) (ZN.Xd() ^ 27989)) + StringUtils.getCacheFileSuffix(context, str, str2), 0};
        Method method = Class.forName(C1561oA.Kd("R`Wfd_[&\\iipbls.Dqqxj~{", (short) (C1499aX.Xd() ^ (-7087)))).getMethod(C1561oA.Xd("\u001a\u0019)\t\u001f\u0019+\u001f\u001f\f/#%%3'1'*9", (short) (Od.Xd() ^ (-6885))), Class.forName(Wg.Zd("}!TlS=P\u000b\u0016wK\t2Ew\r", (short) (C1633zX.Xd() ^ (-18068)), (short) (C1633zX.Xd() ^ (-27254)))), Integer.TYPE);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, Wg.vd("\u001c'%*\"4/g(%3\u0011-%5'-\u00189+31=/ꍢIwyt\u0017B@\r|\u000f\nJhi]e~nomycumP", (short) (C1580rY.Xd() ^ (-24771))));
            this.f1182a = sharedPreferences;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final void a(EnumSet sdkMetadata) {
        Intrinsics.checkNotNullParameter(sdkMetadata, "sdkMetadata");
        this.f1182a.edit().putStringSet("tags", com.braze.support.e.a(sdkMetadata)).apply();
    }

    public final EnumSet b(EnumSet newSdkMetadata) {
        Intrinsics.checkNotNullParameter(newSdkMetadata, "newSdkMetadata");
        if (Intrinsics.areEqual(com.braze.support.e.a(newSdkMetadata), this.f1182a.getStringSet("tags", SetsKt.emptySet()))) {
            return null;
        }
        return newSdkMetadata;
    }
}
