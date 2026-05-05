package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.IntentUtils;
import com.braze.support.WebContentUtils;
import cz.msebera.android.httpclient.cookie.ClientCookie;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes4.dex */
public final class re0 {

    /* JADX INFO: renamed from: e */
    public static final ee0 f1682e = new ee0();

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f1683a;

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f1684b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f1685c;

    /* JADX INFO: renamed from: d */
    public final File f1686d;

    public re0(Context context, String str) throws Throwable {
        Intrinsics.checkNotNullParameter(context, Xg.qd("\b\u0015\u0015\u001c\u000e\"\u001f", (short) (C1580rY.Xd() ^ (-3805)), (short) (C1580rY.Xd() ^ (-19084))));
        Intrinsics.checkNotNullParameter(str, Jg.Wd("J\u000fl87#", (short) (FB.Xd() ^ 18340), (short) (FB.Xd() ^ 7757)));
        String str2 = ZO.xd(".\u001dZ7f\u00177H@EyYc)\t\tWg]T\u0004v\u0013C[u:k\u0019_a\u007fd;z\u001c\u007fOM\u0001~", (short) (FB.Xd() ^ 26893), (short) (FB.Xd() ^ 24170)) + str;
        Class<?> cls = Class.forName(C1626yg.Ud("\u000e\"\u000f\u0016@-E\u00065A1\u0002n\u001dt\u001bky\rK_JX", (short) (C1633zX.Xd() ^ (-12135)), (short) (C1633zX.Xd() ^ (-9110))));
        Class<?>[] clsArr = new Class[2];
        short sXd = (short) (Od.Xd() ^ (-5600));
        int[] iArr = new int["^~\u007f`r\r\u0014>\u0001-J3afs\u000f".length()];
        QB qb = new QB("^~\u007f`r\r\u0014>\u0001-J3afs\u000f");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        clsArr[1] = Integer.TYPE;
        Object[] objArr = {str2, 0};
        Method method = cls.getMethod(EO.Od("\r=>x|Cd\u00071\r-\u00022+`1or\u001cV", (short) (OY.Xd() ^ 31661)), clsArr);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, C1561oA.Qd("]hfk[mh!YVdBVN^PN9ZLLJVH\u2008FY\u000b} KIN>PK\u0004\"#\u0017\u00170 !\u0017#\r\u001f\u000fq", (short) (C1499aX.Xd() ^ (-26386))));
            this.f1683a = sharedPreferences;
            this.f1684b = f1682e.a(sharedPreferences);
            this.f1685c = new LinkedHashMap();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(C1593ug.zd("\u001a(\u001f.,'#m$118*4;u\f99@2FC", (short) (ZN.Xd() ^ 16379), (short) (ZN.Xd() ^ 4770))).getMethod(C1561oA.od("\u0002~\rZwx|xVz\u0003", (short) (C1580rY.Xd() ^ (-27680))), new Class[0]);
            try {
                method2.setAccessible(true);
                this.f1686d = new File(sb.append(((File) method2.invoke(context, objArr2)).getPath()).append(C1561oA.Kd(".acawvnmnm{}", (short) (FB.Xd() ^ 4595))).toString());
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [T, java.lang.Object, java.lang.String] */
    public final String a(s70 remotePath) {
        Long lA;
        String lastPathSegment;
        int iLastIndexOf$default;
        Intrinsics.checkNotNullParameter(remotePath, "remotePath");
        String remoteAssetUrl = remotePath.f1748b;
        int iOrdinal = remotePath.f1747a.ordinal();
        if (iOrdinal == 0) {
            String localHtmlUrlFromRemoteUrl = WebContentUtils.getLocalHtmlUrlFromRemoteUrl(this.f1686d, remoteAssetUrl);
            if (localHtmlUrlFromRemoteUrl == null || StringsKt.isBlank(localHtmlUrlFromRemoteUrl)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new ge0(remoteAssetUrl), 7, (Object) null);
                return null;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new fe0(localHtmlUrlFromRemoteUrl, remoteAssetUrl), 6, (Object) null);
            return localHtmlUrlFromRemoteUrl;
        }
        if (iOrdinal != 1 && iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        ee0 ee0Var = f1682e;
        Intrinsics.checkNotNullParameter(remoteAssetUrl, "remoteAssetUrl");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        Uri uri = Uri.parse(remoteAssetUrl);
        if (uri != null && (lastPathSegment = uri.getLastPathSegment()) != null && lastPathSegment.length() != 0 && (iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) lastPathSegment, '.', 0, false, 6, (Object) null)) > -1) {
            ?? Substring = lastPathSegment.substring(iLastIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(Substring, "this as java.lang.String).substring(startIndex)");
            objectRef.element = Substring;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) ee0Var, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new zd0(remoteAssetUrl, objectRef), 6, (Object) null);
        }
        String str = IntentUtils.getRequestCode() + ((String) objectRef.element);
        try {
            String string = this.f1686d.toString();
            Intrinsics.checkNotNullExpressionValue(string, "triggeredAssetDirectory.toString()");
            Pair pairDownloadFileToPath$default = BrazeFileUtils.downloadFileToPath$default(string, remoteAssetUrl, str, null, 8, null);
            File file = (File) pairDownloadFileToPath$default.component1();
            Map map = (Map) pairDownloadFileToPath$default.component2();
            String str2 = (String) map.get(ClientCookie.EXPIRES_ATTR);
            if (str2 != null && (lA = com.braze.support.i.a(str2)) != null && lA.longValue() <= 0) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new ie0(remoteAssetUrl, map), 7, (Object) null);
                return null;
            }
            Uri uriFromFile = Uri.fromFile(file);
            if (uriFromFile != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new je0(remoteAssetUrl, uriFromFile), 6, (Object) null);
                return uriFromFile.getPath();
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new ke0(remoteAssetUrl), 7, (Object) null);
            return null;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new he0(remoteAssetUrl), 4, (Object) null);
            return null;
        }
    }

    public final Map a(k10 triggeredAction) {
        Intrinsics.checkNotNullParameter(triggeredAction, "triggeredAction");
        if (!((bh0) triggeredAction).f282c) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new le0(triggeredAction), 7, (Object) null);
            return MapsKt.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = triggeredAction.a().iterator();
        while (it.hasNext()) {
            String str = ((s70) it.next()).f1748b;
            String path = (String) this.f1684b.get(str);
            if (path != null) {
                Intrinsics.checkNotNullParameter(path, "path");
                if (new File(path).exists()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new me0(path, str), 7, (Object) null);
                    this.f1685c.put(str, path);
                    linkedHashMap.put(str, path);
                }
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new ne0(str), 6, (Object) null);
        }
        if (linkedHashMap.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new oe0(triggeredAction), 6, (Object) null);
        }
        return linkedHashMap;
    }
}
