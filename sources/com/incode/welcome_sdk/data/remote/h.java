package com.incode.welcome_sdk.data.remote;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.autofill.HintConstants;
import com.appsflyer.AdRevenueScheme;
import com.biocatch.client.android.sdk.core.Constants;
import com.braze.models.IBrazeLocation;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.common.callercontext.ContextChain;
import com.google.common.base.Ascii;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.commons.utils.BitmapUtils;
import com.incode.welcome_sdk.commons.utils.FaceProcessingUtils;
import com.incode.welcome_sdk.commons.utils.NetworkUtils;
import com.incode.welcome_sdk.commons.utils.StringUtils;
import com.incode.welcome_sdk.commons.utils.ae;
import com.incode.welcome_sdk.data.DeviceFingerprint;
import com.incode.welcome_sdk.data.ImageType;
import com.incode.welcome_sdk.data.remote.beans.FaceAuthenticationRequest;
import com.incode.welcome_sdk.data.remote.beans.Flow;
import com.incode.welcome_sdk.data.remote.beans.ResponseAddCurp;
import com.incode.welcome_sdk.data.remote.beans.ResponseAddCurpV2;
import com.incode.welcome_sdk.data.remote.beans.ResponseAttachFlow;
import com.incode.welcome_sdk.data.remote.beans.ResponseCombinedConsent;
import com.incode.welcome_sdk.data.remote.beans.ResponseFaceAuthentication;
import com.incode.welcome_sdk.data.remote.beans.ResponseFaceLogin;
import com.incode.welcome_sdk.data.remote.beans.ResponseGetImages;
import com.incode.welcome_sdk.data.remote.beans.ResponseInitFaceAuth;
import com.incode.welcome_sdk.data.remote.beans.ResponseMedicalDoc;
import com.incode.welcome_sdk.data.remote.beans.ResponseOCRData;
import com.incode.welcome_sdk.data.remote.beans.ResponseSignature;
import com.incode.welcome_sdk.data.remote.beans.ResponseSuccess;
import com.incode.welcome_sdk.data.remote.beans.ResponseVerifyFace;
import com.incode.welcome_sdk.data.remote.beans.ResponseWorkflowInfo;
import com.incode.welcome_sdk.data.remote.beans.Workflow;
import com.incode.welcome_sdk.data.remote.beans.aa;
import com.incode.welcome_sdk.data.remote.beans.ab;
import com.incode.welcome_sdk.data.remote.beans.ac;
import com.incode.welcome_sdk.data.remote.beans.ad;
import com.incode.welcome_sdk.data.remote.beans.af;
import com.incode.welcome_sdk.data.remote.beans.ah;
import com.incode.welcome_sdk.data.remote.beans.ai;
import com.incode.welcome_sdk.data.remote.beans.aj;
import com.incode.welcome_sdk.data.remote.beans.ak;
import com.incode.welcome_sdk.data.remote.beans.al;
import com.incode.welcome_sdk.data.remote.beans.am;
import com.incode.welcome_sdk.data.remote.beans.an;
import com.incode.welcome_sdk.data.remote.beans.ap;
import com.incode.welcome_sdk.data.remote.beans.aq;
import com.incode.welcome_sdk.data.remote.beans.ar;
import com.incode.welcome_sdk.data.remote.beans.as;
import com.incode.welcome_sdk.data.remote.beans.at;
import com.incode.welcome_sdk.data.remote.beans.au;
import com.incode.welcome_sdk.data.remote.beans.av;
import com.incode.welcome_sdk.data.remote.beans.aw;
import com.incode.welcome_sdk.data.remote.beans.ax;
import com.incode.welcome_sdk.data.remote.beans.ay;
import com.incode.welcome_sdk.data.remote.beans.az;
import com.incode.welcome_sdk.data.remote.beans.bb;
import com.incode.welcome_sdk.data.remote.beans.bc;
import com.incode.welcome_sdk.data.remote.beans.be;
import com.incode.welcome_sdk.data.remote.beans.bf;
import com.incode.welcome_sdk.data.remote.beans.bg;
import com.incode.welcome_sdk.data.remote.beans.bh;
import com.incode.welcome_sdk.data.remote.beans.bi;
import com.incode.welcome_sdk.data.remote.beans.bj;
import com.incode.welcome_sdk.data.remote.beans.bl;
import com.incode.welcome_sdk.data.remote.beans.bn;
import com.incode.welcome_sdk.data.remote.beans.bp;
import com.incode.welcome_sdk.data.remote.beans.br;
import com.incode.welcome_sdk.data.remote.beans.bt;
import com.incode.welcome_sdk.data.remote.beans.t;
import com.incode.welcome_sdk.data.remote.beans.u;
import com.incode.welcome_sdk.data.remote.beans.v;
import com.incode.welcome_sdk.data.remote.beans.w;
import com.incode.welcome_sdk.data.remote.beans.x;
import com.incode.welcome_sdk.data.remote.beans.y;
import com.incode.welcome_sdk.data.remote.beans.z;
import com.incode.welcome_sdk.data.remote.j;
import com.incode.welcome_sdk.modules.FaceMatch;
import com.incode.welcome_sdk.modules.SelfieScan;
import com.incode.welcome_sdk.results.NfcScanResult;
import com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType;
import com.incode.welcome_sdk.ui.ekyb.EKYBForm;
import com.incode.welcome_sdk.ui.ekyc.EKYCForm;
import com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistModel;
import com.incode.welcome_sdk.ui.id_capture.view.IdCaptureModuleScreenKt;
import com.incode.welcome_sdk.ui.id_info.IdInfoModel;
import com.reactnativecommunity.clipboard.ClipboardModule;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import io.sentry.HttpStatusCodeRange;
import io.sentry.protocol.DebugMeta;
import io.sentry.protocol.Device;
import io.sentry.protocol.Geo;
import io.sentry.protocol.SentryThread;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.functions.Function6;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.msgpack.core.MessagePack;
import retrofit2.Response;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public class h {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: f */
    private static char[] f10176f = null;

    /* JADX INFO: renamed from: g */
    private static char f10177g = 0;

    /* JADX INFO: renamed from: h */
    private static char f10178h = 0;

    /* JADX INFO: renamed from: i */
    private static char f10179i = 0;

    /* JADX INFO: renamed from: j */
    private static char f10180j = 0;

    /* JADX INFO: renamed from: k */
    private static char f10181k = 0;

    /* JADX INFO: renamed from: n */
    private static int f10182n = 0;

    /* JADX INFO: renamed from: o */
    private static int f10183o = 0;

    /* JADX INFO: renamed from: a */
    private final boolean f10184a;

    /* JADX INFO: renamed from: b */
    private final com.incode.welcome_sdk.data.remote.e.a f10185b;

    /* JADX INFO: renamed from: c */
    private final com.incode.welcome_sdk.data.remote.e.c f10186c;

    /* JADX INFO: renamed from: d */
    private final com.incode.welcome_sdk.data.remote.e.c f10187d;

    /* JADX INFO: renamed from: e */
    private final com.incode.welcome_sdk.data.remote.e.a f10188e;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0025 -> B:17:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r7, byte r8, byte r9) {
        /*
            int r8 = 121 - r8
            int r0 = r7 * 2
            int r7 = 1 - r0
            byte[] r6 = com.incode.welcome_sdk.data.remote.h.$$a
            int r0 = r9 * 4
            int r5 = 4 - r0
            byte[] r4 = new byte[r7]
            r3 = 0
            if (r6 != 0) goto L2a
            r1 = r5
            r2 = r3
        L13:
            int r0 = -r5
            int r8 = r8 + r0
            int r5 = r1 + 1
            r1 = r2
        L18:
            int r2 = r1 + 1
            byte r0 = (byte) r8
            r4[r1] = r0
            if (r2 != r7) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L25:
            r0 = r6[r5]
            r1 = r5
            r5 = r0
            goto L13
        L2a:
            r1 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.remote.h.$$c(int, byte, byte):java.lang.String");
    }

    public static /* synthetic */ Object a(int i2, int i3, int i4, int i5, Object[] objArr, int i6, int i7) throws Throwable {
        String strIntern;
        String strIntern2;
        int i8 = ~i3;
        int i9 = ~i5;
        int i10 = (~i6) | i9;
        int i11 = ~(i6 | i9);
        int i12 = i5 + i3 + i2 + ((-714989572) * i7) + (1142003473 * i4);
        int i13 = i12 * i12;
        int i14 = (((-190873766) * i5) - 1983905792) + (1136689320 * i3) + (i8 * (-1483702105)) + (1483702105 * i10) + ((-1483702105) * i11) + ((-1674575872) * i2) + ((-1891631104) * i7) + ((-1355808768) * i4) + ((-1882259456) * i13);
        int i15 = (i5 * (-1158907614)) + 1427560840 + (i3 * (-1158905656)) + (i8 * 979) + (i10 * (-979)) + (i11 * 979) + (i2 * (-1158906635)) + (i7 * 1387703340) + (i4 * 1202573125) + (i13 * (-451215360));
        switch (i14 + (i15 * i15 * (-310837248))) {
            case 1:
                return b(objArr);
            case 2:
                return d(objArr);
            case 3:
                h hVar = (h) objArr[0];
                String str = (String) objArr[1];
                boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
                int i16 = 2 % 2;
                com.incode.welcome_sdk.data.remote.e.c cVarB = hVar.b();
                if (zBooleanValue) {
                    int i17 = f10183o + 79;
                    f10182n = i17 % 128;
                    int i18 = i17 % 2;
                    Object[] objArr2 = new Object[1];
                    C("\u0012\f\u0015\u0012\f\u000b\u0000\u0018\f\u0010\u0004\u0013\u0002\u0006\u0005\u0017\u0006\u0003\u0003\u0000\u0016\u0013\u0016\b\u0006\u0015㘄", (byte) (((Process.getThreadPriority(0) + 20) >> 6) + 6), 27 - ((Process.getThreadPriority(0) + 20) >> 6), objArr2);
                    strIntern2 = ((String) objArr2[0]).intern();
                } else {
                    Object[] objArr3 = new Object[1];
                    E("獲닎ᘉᷮ䎽픅฿\udf2b闭̚몗⪺\ud9d6쯚粹琈\uf3c1Ⲓ", (ViewConfiguration.getTapTimeout() >> 16) + 17, objArr3);
                    strIntern2 = ((String) objArr3[0]).intern();
                    int i19 = f10182n + 75;
                    f10183o = i19 % 128;
                    int i20 = i19 % 2;
                }
                return cVarB.a(strIntern2, str).map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda8
                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj) {
                        return ResponseOCRData.parse((ResponseBody) obj);
                    }
                });
            case 4:
                return a(objArr);
            case 5:
                return c(objArr);
            case 6:
                return i(objArr);
            case 7:
                return f(objArr);
            case 8:
                int i21 = 2 % 2;
                j jVar = new j((RequestBody) objArr[1], (j.b) objArr[2], ((h) objArr[0]).f10184a);
                int i22 = f10183o + 99;
                f10182n = i22 % 128;
                int i23 = i22 % 2;
                return jVar;
            case 9:
                h hVar2 = (h) objArr[0];
                String str2 = (String) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                boolean zBooleanValue2 = ((Boolean) objArr[3]).booleanValue();
                int i24 = 2 % 2;
                int i25 = f10182n + 125;
                f10183o = i25 % 128;
                int i26 = i25 % 2;
                ObservableSource map = hVar2.b().a(str2, iIntValue, zBooleanValue2).map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda9
                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj) {
                        return bp.c((ResponseBody) obj);
                    }
                });
                int i27 = f10183o + 55;
                f10182n = i27 % 128;
                int i28 = i27 % 2;
                return map;
            case 10:
                return j(objArr);
            case 11:
                h hVar3 = (h) objArr[0];
                String str3 = (String) objArr[1];
                int i29 = 2 % 2;
                int i30 = f10183o + 53;
                f10182n = i30 % 128;
                int i31 = i30 % 2;
                ObservableSource map2 = hVar3.b().c(str3).map(new h$$ExternalSyntheticLambda11());
                int i32 = f10183o + 113;
                f10182n = i32 % 128;
                int i33 = i32 % 2;
                return map2;
            case 12:
                return h(objArr);
            case 13:
                return g(objArr);
            case 14:
                return l(objArr);
            case 15:
                return k(objArr);
            case 16:
                h hVar4 = (h) objArr[0];
                String str4 = (String) objArr[1];
                boolean zBooleanValue3 = ((Boolean) objArr[2]).booleanValue();
                int i34 = 2 % 2;
                int i35 = f10183o + 61;
                f10182n = i35 % 128;
                int i36 = i35 % 2;
                com.incode.welcome_sdk.data.remote.e.c cVarB2 = hVar4.b();
                if (zBooleanValue3) {
                    int i37 = f10182n + 77;
                    f10183o = i37 % 128;
                    int i38 = i37 % 2;
                    Object[] objArr4 = new Object[1];
                    C("\u0003\u0000\u0013\b\u0013\u0001", (byte) (98 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 6 - ((Process.getThreadPriority(0) + 20) >> 6), objArr4);
                    strIntern = ((String) objArr4[0]).intern();
                } else {
                    strIntern = "videoSelfie";
                }
                return cVarB2.e(str4, strIntern).map(new h$$ExternalSyntheticLambda6());
            case 17:
                return n(objArr);
            case 18:
                return m(objArr);
            case 19:
                return o(objArr);
            case 20:
                return s(objArr);
            case 21:
                return q(objArr);
            case 22:
                return t(objArr);
            case 23:
                h hVar5 = (h) objArr[0];
                String str5 = (String) objArr[1];
                bt btVar = (bt) objArr[2];
                int i39 = 2 % 2;
                int i40 = f10182n + 45;
                f10183o = i40 % 128;
                int i41 = i40 % 2;
                Observable<bc> observableA = hVar5.a(false, str5, btVar);
                int i42 = f10183o + 97;
                f10182n = i42 % 128;
                int i43 = i42 % 2;
                return observableA;
            default:
                return e(objArr);
        }
    }

    static void init$0() {
        $$a = new byte[]{68, MessagePack.Code.EXT16, -99, -125};
        $$b = 60;
    }

    private static void E(String str, int i2, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i3 = 2 % 2;
        if (str2 != null) {
            int i4 = $10 + 43;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            charArray = str2.toCharArray();
        } else {
            charArray = str2;
        }
        char[] cArr = (char[]) charArray;
        com.c.a.h hVar = new com.c.a.h();
        char[] cArr2 = new char[cArr.length];
        int i6 = 0;
        hVar.f2753d = 0;
        char[] cArr3 = new char[2];
        while (hVar.f2753d < cArr.length) {
            cArr3[i6] = cArr[hVar.f2753d];
            char c2 = 1;
            cArr3[1] = cArr[hVar.f2753d + 1];
            int i7 = 58224;
            int i8 = i6;
            while (i8 < 16) {
                int i9 = $11 + 69;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                char c3 = cArr3[c2];
                char c4 = cArr3[i6];
                int i11 = (c4 + i7) ^ ((c4 << 4) + ((char) (((long) f10180j) ^ (-995256607575678378L))));
                int i12 = c4 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f10181k);
                    objArr2[2] = Integer.valueOf(i12);
                    objArr2[c2] = Integer.valueOf(i11);
                    objArr2[0] = Integer.valueOf(c3);
                    Object objC = com.c.a.e.e.c(1785266233);
                    if (objC == null) {
                        char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                        int keyRepeatDelay = 18 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int i13 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + HttpStatusCodeRange.DEFAULT_MAX;
                        byte b2 = (byte) 0;
                        String str$$c = $$c(b2, (byte) (b2 | 16), b2);
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c2] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objC = com.c.a.e.e.e(absoluteGravity, keyRepeatDelay, i13, 1794310720, false, str$$c, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objC).invoke(null, objArr2)).charValue();
                    cArr3[c2] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (((long) f10179i) ^ (-995256607575678378L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f10177g)};
                    Object objC2 = com.c.a.e.e.c(1785266233);
                    if (objC2 == null) {
                        byte b3 = (byte) 0;
                        objC2 = com.c.a.e.e.e((char) Color.red(0), 18 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 600, 1794310720, false, $$c(b3, (byte) (b3 | 16), b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objC2).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i8++;
                    int i14 = $11 + 77;
                    $10 = i14 % 128;
                    if (i14 % 2 != 0) {
                        int i15 = 5 % 4;
                    }
                    i6 = 0;
                    c2 = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[hVar.f2753d] = cArr3[0];
            cArr2[hVar.f2753d + 1] = cArr3[1];
            Object[] objArr4 = {hVar, hVar};
            Object objC3 = com.c.a.e.e.c(-1055823967);
            if (objC3 == null) {
                byte b4 = (byte) 0;
                objC3 = com.c.a.e.e.e((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), TextUtils.lastIndexOf("", '0') + 20, (Process.myPid() >> 22) + 675, -1047829032, false, $$c(b4, (byte) (b4 | Ascii.VT), b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objC3).invoke(null, objArr4);
            i6 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    public h(com.incode.welcome_sdk.data.remote.e.c cVar, com.incode.welcome_sdk.data.remote.e.a aVar, com.incode.welcome_sdk.data.remote.e.c cVar2, com.incode.welcome_sdk.data.remote.e.a aVar2, boolean z2) {
        this.f10186c = cVar;
        this.f10185b = aVar;
        this.f10187d = cVar2;
        this.f10188e = aVar2;
        this.f10184a = z2;
    }

    private com.incode.welcome_sdk.data.remote.e.c b() {
        int i2 = 2 % 2;
        int i3 = f10182n + 85;
        f10183o = i3 % 128;
        if (i3 % 2 == 0) {
            if (NetworkUtils.hasToUseSecuredNetwork()) {
                int i4 = f10182n + 63;
                f10183o = i4 % 128;
                int i5 = i4 % 2;
                return this.f10186c;
            }
            return this.f10187d;
        }
        NetworkUtils.hasToUseSecuredNetwork();
        throw null;
    }

    private static /* synthetic */ Object s(Object[] objArr) {
        h hVar = (h) objArr[0];
        int i2 = 2 % 2;
        int i3 = f10182n + 21;
        f10183o = i3 % 128;
        if (i3 % 2 == 0) {
            if (NetworkUtils.hasToUseSecuredNetwork()) {
                return hVar.f10185b;
            }
            com.incode.welcome_sdk.data.remote.e.a aVar = hVar.f10188e;
            int i4 = f10182n + 5;
            f10183o = i4 % 128;
            int i5 = i4 % 2;
            return aVar;
        }
        NetworkUtils.hasToUseSecuredNetwork();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Single<ab> d(String str, String str2) {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", str2);
            Single map = b().e(str, e(jSONObject)).map(new h$$ExternalSyntheticLambda5());
            int i3 = f10183o + 67;
            f10182n = i3 % 128;
            int i4 = i3 % 2;
            return map;
        } catch (JSONException e2) {
            Timber.e(e2, "Couldn't send create OpenTok session API request", new Object[0]);
            return null;
        }
    }

    public final Single<ResponseSuccess> a(String str, String str2, String str3, String str4) {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("videoRecordingId", str2);
            jSONObject.put("resolution", str3);
            jSONObject.put("type", str4);
            Single map = b().a(str, e(jSONObject)).map(new h$$ExternalSyntheticLambda11());
            int i3 = f10182n + 61;
            f10183o = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 2 / 0;
            }
            return map;
        } catch (JSONException e2) {
            Timber.e(e2, "Couldn't send start OpenTok stream recording API request", new Object[0]);
            return null;
        }
    }

    private static /* synthetic */ Object h(Object[] objArr) {
        h hVar = (h) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("videoRecordingId", str2);
            SingleSource map = hVar.b().d(str, e(jSONObject)).map(new h$$ExternalSyntheticLambda11());
            int i3 = f10182n + 53;
            f10183o = i3 % 128;
            int i4 = i3 % 2;
            return map;
        } catch (JSONException e2) {
            Timber.e(e2, "Couldn't send stop OpenTok stream recording API request", new Object[0]);
            return null;
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        h hVar = (h) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        Object obj = null;
        try {
            jSONObject.put("type", str2);
            SingleSource map = hVar.b().c(str, e(jSONObject)).map(new h$$ExternalSyntheticLambda5());
            int i3 = f10182n + 91;
            f10183o = i3 % 128;
            if (i3 % 2 == 0) {
                return map;
            }
            obj.hashCode();
            throw null;
        } catch (JSONException e2) {
            Timber.e(e2, "Couldn't send create OpenTok Auth session API request", new Object[0]);
            return null;
        }
    }

    public final Single<ResponseSuccess> e(String str, String str2, String str3, String str4) {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        Object obj = null;
        try {
            jSONObject.put("videoRecordingId", str2);
            jSONObject.put("resolution", str3);
            jSONObject.put("type", str4);
            jSONObject.put("outputMode", "COMPOSED");
            Single map = b().b(str, e(jSONObject)).map(new h$$ExternalSyntheticLambda11());
            int i3 = f10183o + 39;
            f10182n = i3 % 128;
            if (i3 % 2 != 0) {
                return map;
            }
            obj.hashCode();
            throw null;
        } catch (JSONException e2) {
            Timber.e(e2, "Couldn't send start OpenTok stream recording API request", new Object[0]);
            return null;
        }
    }

    public final Single<ResponseSuccess> e(String str, String str2) {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("videoRecordingId", str2);
            Single map = b().h(str, e(jSONObject)).map(new h$$ExternalSyntheticLambda11());
            int i3 = f10182n + 39;
            f10183o = i3 % 128;
            if (i3 % 2 == 0) {
                return map;
            }
            throw null;
        } catch (JSONException e2) {
            Timber.e(e2, "Couldn't send stop OpenTok stream recording API request", new Object[0]);
            return null;
        }
    }

    private static void C(String str, byte b2, int i2, Object[] objArr) throws Throwable {
        int i3;
        int length;
        char[] cArr;
        int i4;
        String str2 = str;
        int i5 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray;
        com.c.a.f fVar = new com.c.a.f();
        char[] cArr3 = f10176f;
        int i6 = 1768797182;
        char c2 = '0';
        int i7 = 1;
        if (cArr3 != null) {
            int i8 = $11 + 43;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                length = cArr3.length;
                cArr = new char[length];
                i4 = 1;
            } else {
                length = cArr3.length;
                cArr = new char[length];
                i4 = 0;
            }
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i4])};
                    Object objC = com.c.a.e.e.c(i6);
                    if (objC == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objC = com.c.a.e.e.e((char) (TextUtils.lastIndexOf("", c2) + 29972), View.MeasureSpec.getMode(0) + 18, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 828, 1777840519, false, $$c(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    cArr[i4] = ((Character) ((Method) objC).invoke(null, objArr2)).charValue();
                    i4++;
                    int i9 = $11 + 125;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    i6 = 1768797182;
                    c2 = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr;
        }
        Object[] objArr3 = {Integer.valueOf(f10178h)};
        Object objC2 = com.c.a.e.e.c(1768797182);
        if (objC2 == null) {
            byte b5 = (byte) 0;
            byte b6 = b5;
            objC2 = com.c.a.e.e.e((char) (29970 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), TextUtils.lastIndexOf("", '0') + 19, TextUtils.getCapsMode("", 0, 0) + 828, 1777840519, false, $$c(b5, b6, b6), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objC2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i2];
        if (i2 % 2 != 0) {
            int i11 = $11 + 97;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            i3 = i2 - 1;
            cArr4[i3] = (char) (cArr2[i3] - b2);
        } else {
            i3 = i2;
        }
        if (i3 > 1) {
            fVar.f2749e = 0;
            while (fVar.f2749e < i3) {
                fVar.f2747c = cArr2[fVar.f2749e];
                fVar.f2746b = cArr2[fVar.f2749e + i7];
                if (fVar.f2747c == fVar.f2746b) {
                    cArr4[fVar.f2749e] = (char) (fVar.f2747c - b2);
                    cArr4[fVar.f2749e + i7] = (char) (fVar.f2746b - b2);
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = fVar;
                    objArr4[11] = Integer.valueOf(cCharValue);
                    objArr4[10] = fVar;
                    objArr4[9] = fVar;
                    objArr4[8] = Integer.valueOf(cCharValue);
                    objArr4[7] = fVar;
                    objArr4[6] = fVar;
                    objArr4[5] = Integer.valueOf(cCharValue);
                    objArr4[4] = fVar;
                    objArr4[3] = fVar;
                    objArr4[2] = Integer.valueOf(cCharValue);
                    objArr4[i7] = fVar;
                    objArr4[0] = fVar;
                    Object objC3 = com.c.a.e.e.c(1369381351);
                    if (objC3 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = (byte) (b7 + 3);
                        objC3 = com.c.a.e.e.e((char) (ImageFormat.getBitsPerPixel(0) + 49573), (ViewConfiguration.getEdgeSlop() >> 16) + 20, 1222 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1359289246, false, $$c(b7, b8, (byte) (b8 - 3)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objC3).invoke(null, objArr4)).intValue() == fVar.f2750f) {
                        int i13 = $10 + 101;
                        $11 = i13 % 128;
                        int i14 = i13 % 2;
                        Object[] objArr5 = {fVar, fVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), fVar, fVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), fVar, Integer.valueOf(cCharValue), fVar};
                        Object objC4 = com.c.a.e.e.c(-486756316);
                        if (objC4 == null) {
                            byte b9 = (byte) 0;
                            byte b10 = (byte) (b9 + 1);
                            objC4 = com.c.a.e.e.e((char) (TextUtils.getOffsetAfter("", 0) + 27451), View.resolveSize(0, 0) + 19, 392 - Color.argb(0, 0, 0, 0), -496586147, false, $$c(b9, b10, (byte) (b10 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objC4).invoke(null, objArr5)).intValue();
                        int i15 = (fVar.f2745a * cCharValue) + fVar.f2750f;
                        cArr4[fVar.f2749e] = cArr3[iIntValue];
                        cArr4[fVar.f2749e + 1] = cArr3[i15];
                    } else if (fVar.f2748d == fVar.f2745a) {
                        fVar.f2751h = ((fVar.f2751h + cCharValue) - 1) % cCharValue;
                        fVar.f2750f = ((fVar.f2750f + cCharValue) - 1) % cCharValue;
                        int i16 = (fVar.f2748d * cCharValue) + fVar.f2751h;
                        int i17 = (fVar.f2745a * cCharValue) + fVar.f2750f;
                        cArr4[fVar.f2749e] = cArr3[i16];
                        cArr4[fVar.f2749e + 1] = cArr3[i17];
                    } else {
                        int i18 = (fVar.f2748d * cCharValue) + fVar.f2750f;
                        int i19 = (fVar.f2745a * cCharValue) + fVar.f2751h;
                        cArr4[fVar.f2749e] = cArr3[i18];
                        i7 = 1;
                        cArr4[fVar.f2749e + 1] = cArr3[i19];
                    }
                    i7 = 1;
                }
                fVar.f2749e += 2;
            }
        }
        for (int i20 = 0; i20 < i2; i20++) {
            cArr4[i20] = (char) (cArr4[i20] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    public final Single<bh> b(String str, String str2, Map<String, String> map, String str3, String str4, String str5) {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("interviewId", str);
            jSONObject.putOpt("configurationId", str2);
            if (!StringUtils.isNotBlank(str4)) {
                if (StringUtils.isNotBlank(str3)) {
                    int i3 = f10182n + 5;
                    f10183o = i3 % 128;
                    int i4 = i3 % 2;
                    jSONObject.putOpt("externalId", str3);
                }
            } else {
                int i5 = f10182n + 101;
                f10183o = i5 % 128;
                int i6 = i5 % 2;
                jSONObject.putOpt("externalCustomerId", str4);
            }
            if (StringUtils.isNotBlank(str5)) {
                jSONObject.putOpt(Device.JsonKeys.LANGUAGE, str5);
            }
            if (map != null) {
                jSONObject.putOpt("customFields", new JSONObject(map));
            }
            return b().b(e(jSONObject)).map(new h$$ExternalSyntheticLambda10());
        } catch (JSONException e2) {
            Timber.e(e2, "Couldn't send start onboarding API request", new Object[0]);
            return null;
        }
    }

    public final Observable<ResponseAttachFlow> d(String str, List<String> list, boolean z2) {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("checks", new JSONArray((Collection) list));
            if (z2) {
                jSONObject.putOpt("configurations", new JSONArray((Collection) Collections.singletonList("mergeSessionRecordings")));
                int i3 = f10183o + 79;
                f10182n = i3 % 128;
                int i4 = i3 % 2;
            }
            Observable map = b().g(str, e(jSONObject)).map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda46
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return ResponseAttachFlow.parse((ResponseBody) obj);
                }
            });
            int i5 = f10182n + 43;
            f10183o = i5 % 128;
            int i6 = i5 % 2;
            return map;
        } catch (JSONException e2) {
            Timber.e(e2, "Couldn't send attachFlow API request", new Object[0]);
            return null;
        }
    }

    public final Single<bh> c(String str, String str2, String str3, String str4) {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        Object obj = null;
        try {
            jSONObject.putOpt("interviewId", str);
            jSONObject.putOpt("externalId", str2);
            jSONObject.putOpt("externalCustomerId", str3);
            if (StringUtils.isNotBlank(str4)) {
                int i3 = f10182n + 31;
                f10183o = i3 % 128;
                if (i3 % 2 != 0) {
                    jSONObject.putOpt(Device.JsonKeys.LANGUAGE, str4);
                    obj.hashCode();
                    throw null;
                }
                jSONObject.putOpt(Device.JsonKeys.LANGUAGE, str4);
            }
            Single map = b().b(e(jSONObject)).map(new h$$ExternalSyntheticLambda10());
            int i4 = f10182n + 95;
            f10183o = i4 % 128;
            if (i4 % 2 == 0) {
                return map;
            }
            throw null;
        } catch (JSONException e2) {
            Timber.e(e2, "Couldn't send resume onboarding API request", new Object[0]);
            return null;
        }
    }

    public final Observable<ResponseSuccess> c(String str, String str2, boolean z2, boolean z3) {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(HintConstants.AUTOFILL_HINT_PHONE, str2);
            jSONObject.put("otpVerification", z3);
            jSONObject.put("optInGranted", z2);
            Observable map = b().f(str, e(jSONObject)).map(new h$$ExternalSyntheticLambda11());
            int i3 = f10183o + 81;
            f10182n = i3 % 128;
            if (i3 % 2 != 0) {
                return map;
            }
            throw null;
        } catch (JSONException e2) {
            Timber.e(e2, "Couldn't send add phone API request", new Object[0]);
            return null;
        }
    }

    public final Observable<ResponseSuccess> a(String str, t tVar) {
        int i2 = 2 % 2;
        int i3 = f10182n + 111;
        f10183o = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.data.remote.e.c cVarB = b();
        if (i4 == 0) {
            return cVarB.b(str, tVar.c()).map(new h$$ExternalSyntheticLambda11());
        }
        cVarB.b(str, tVar.c()).map(new h$$ExternalSyntheticLambda11());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        h hVar = (h) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        t tVar = (t) objArr[3];
        int i2 = 2 % 2;
        int i3 = f10182n + 23;
        f10183o = i3 % 128;
        int i4 = i3 % 2;
        ObservableSource map = hVar.b().d(str, str2, tVar.c()).map(new h$$ExternalSyntheticLambda11());
        int i5 = f10182n + 83;
        f10183o = i5 % 128;
        if (i5 % 2 == 0) {
            return map;
        }
        throw null;
    }

    public final Observable<ResponseSuccess> d(String str, String str2, boolean z2) {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("email", str2);
            jSONObject.put("otpVerification", z2);
            Observable map = b().i(str, e(jSONObject)).map(new h$$ExternalSyntheticLambda11());
            int i3 = f10183o + 123;
            f10182n = i3 % 128;
            int i4 = i3 % 2;
            return map;
        } catch (JSONException e2) {
            Timber.e(e2, "Couldn't send add email API request", new Object[0]);
            return null;
        }
    }

    public final Observable<ResponseSuccess> c(String str, String str2) {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", str2);
            Observable map = b().j(str, e(jSONObject)).map(new h$$ExternalSyntheticLambda11());
            int i3 = f10182n + 61;
            f10183o = i3 % 128;
            int i4 = i3 % 2;
            return map;
        } catch (JSONException e2) {
            Timber.e(e2, "Couldn't send add name API request", new Object[0]);
            return null;
        }
    }

    public final Single<ac> a(String str, DeviceFingerprint deviceFingerprint) {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("deviceType", deviceFingerprint.getDeviceType());
            jSONObject.put("hash", deviceFingerprint.getHash());
            jSONObject.put("ip", deviceFingerprint.getIp());
            jSONObject.put("data", deviceFingerprint.getData());
            jSONObject.put("deviceModel", deviceFingerprint.getDeviceModel());
            jSONObject.put("osVersion", deviceFingerprint.getOsVersion());
            jSONObject.put("sdkVersion", deviceFingerprint.getSdkVersion());
            Single map = b().k(str, e(jSONObject)).map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda34
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return ac.b((ResponseBody) obj);
                }
            });
            int i3 = f10183o + 101;
            f10182n = i3 % 128;
            if (i3 % 2 != 0) {
                return map;
            }
            throw null;
        } catch (JSONException e2) {
            Timber.e(e2, "Couldn't send device fingerprint API request", new Object[0]);
            return null;
        }
    }

    public final Observable<aa> h(String str, String str2) {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("encrypted", str2);
            Observable map = b().J(str, e(jSONObject)).map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda54
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return aa.b((ResponseBody) obj);
                }
            });
            int i3 = f10182n + 111;
            f10183o = i3 % 128;
            int i4 = i3 % 2;
            return map;
        } catch (JSONException e2) {
            Timber.e(e2, "Couldn't send bankAccountLogin API request", new Object[0]);
            return null;
        }
    }

    public final Observable<ResponseGetImages> e(String str, ImageType[] imageTypeArr, boolean z2) throws Throwable {
        String strIntern;
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            for (ImageType imageType : imageTypeArr) {
                jSONArray.put(imageType.name());
            }
            jSONObject.put(DebugMeta.JsonKeys.IMAGES, jSONArray);
            com.incode.welcome_sdk.data.remote.e.c cVarB = b();
            if (!z2) {
                Object[] objArr = new Object[1];
                C("\u0012\f\u0015\u0012\f\u000b\u0000\u0018\u0010\u0015\u0012\r\u000e\u0000㘄", (byte) (26 - Process.getGidForName("")), (ViewConfiguration.getLongPressTimeout() >> 16) + 15, objArr);
                strIntern = ((String) objArr[0]).intern();
                int i3 = f10182n + 93;
                f10183o = i3 % 128;
                int i4 = i3 % 2;
            } else {
                int i5 = f10183o + 103;
                f10182n = i5 % 128;
                int i6 = i5 % 2;
                Object[] objArr2 = new Object[1];
                C("\u0012\f\u0015\u0012\f\u000b\u0000\u0018\u0010\u0015\u0012\r\u000e\u0000\u0003\u0002\u0003\u0000\u0016\u0013\u0016\b\u0006\u0015㙫", (byte) (109 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 24 - TextUtils.lastIndexOf("", '0', 0, 0), objArr2);
                strIntern = ((String) objArr2[0]).intern();
            }
            return cVarB.b(strIntern, str, e(jSONObject)).map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda4
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return ResponseGetImages.parse((ResponseBody) obj);
                }
            });
        } catch (JSONException e2) {
            Timber.e(e2, "Couldn't send getImages API request", new Object[0]);
            return null;
        }
    }

    public final Observable<az> b(String str, com.incode.welcome_sdk.c.b.d dVar) {
        int i2 = 2 % 2;
        int i3 = f10183o + 91;
        f10182n = i3 % 128;
        int i4 = i3 % 2;
        try {
            Observable map = b().t(str, e(b(dVar))).map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda23
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return az.a((ResponseBody) obj);
                }
            });
            int i5 = f10182n + 125;
            f10183o = i5 % 128;
            if (i5 % 2 == 0) {
                return map;
            }
            throw null;
        } catch (JSONException e2) {
            Timber.e(e2, "Couldn't send addInterviewEvent API request", new Object[0]);
            return null;
        }
    }

    public static /* synthetic */ ResponseSuccess b(Response response) throws Exception {
        return new ResponseSuccess(response.code() == 200);
    }

    public final Observable<ResponseSuccess> a(String str, List<com.incode.welcome_sdk.c.b.d> list) {
        int i2 = 2 % 2;
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator<com.incode.welcome_sdk.c.b.d> it = list.iterator();
            while (it.hasNext()) {
                int i3 = f10183o + 117;
                f10182n = i3 % 128;
                int i4 = i3 % 2;
                jSONArray.put(b(it.next()));
            }
            Observable map = b().s(str, b(jSONArray)).map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda18
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return h.b((Response) obj);
                }
            });
            int i5 = f10182n + 79;
            f10183o = i5 % 128;
            int i6 = i5 % 2;
            return map;
        } catch (JSONException e2) {
            Timber.e(e2, "Couldn't send addInterviewEvents API request", new Object[0]);
            return null;
        }
    }

    private static JSONObject b(com.incode.welcome_sdk.c.b.d dVar) throws JSONException {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", dVar.d());
        if (dVar.e() != null) {
            jSONObject.put("module", dVar.e());
            int i3 = f10182n + 97;
            f10183o = i3 % 128;
            int i4 = i3 % 2;
        }
        if (dVar.b() != null) {
            jSONObject.put("screen", dVar.b());
        }
        if (dVar.a() != null) {
            int i5 = f10182n + 13;
            f10183o = i5 % 128;
            if (i5 % 2 != 0) {
                jSONObject.put("clientTimestamp", dVar.a());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            jSONObject.put("clientTimestamp", dVar.a());
        }
        JSONObject jSONObject2 = new JSONObject();
        if (dVar.c() != null) {
            int i6 = f10182n + 9;
            f10183o = i6 % 128;
            int i7 = i6 % 2;
            Iterator<Map.Entry<String, Object>> it = dVar.c().entrySet().iterator();
            while (!(!it.hasNext())) {
                Map.Entry<String, Object> next = it.next();
                jSONObject2.put(next.getKey(), next.getValue());
            }
        }
        jSONObject.put("payload", jSONObject2);
        int i8 = f10182n + 117;
        f10183o = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 12 / 0;
        }
        return jSONObject;
    }

    public final Observable<am> j(String str, String str2) {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("eventId", str2);
            Observable map = b().y(str, e(jSONObject)).map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda12
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return am.a((ResponseBody) obj);
                }
            });
            int i3 = f10183o + 43;
            f10182n = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 3 / 0;
            }
            return map;
        } catch (JSONException e2) {
            Timber.e(e2, "Couldn't send generateUploadUrl API request", new Object[0]);
            return null;
        }
    }

    private static /* synthetic */ Object o(Object[] objArr) {
        h hVar = (h) objArr[0];
        String str = (String) objArr[1];
        File file = (File) objArr[2];
        int i2 = 2 % 2;
        int i3 = f10182n + 7;
        f10183o = i3 % 128;
        if (i3 % 2 == 0) {
            Observable<ResponseBody> observableU = hVar.b().u(str, RequestBody.create(file, MediaType.parse(ClipboardModule.MIMETYPE_JPEG)));
            int i4 = f10182n + 117;
            f10183o = i4 % 128;
            int i5 = i4 % 2;
            return observableU;
        }
        hVar.b().u(str, RequestBody.create(file, MediaType.parse(ClipboardModule.MIMETYPE_JPEG)));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ af b(String str, File file, ResponseBody responseBody) throws Exception {
        int i2 = 2 % 2;
        int i3 = f10183o + 61;
        f10182n = i3 % 128;
        int i4 = i3 % 2;
        af afVarD = af.d(responseBody, str, file);
        if (i4 == 0) {
            int i5 = 62 / 0;
        }
        return afVarD;
    }

    public final Observable<af> c(String str, final String str2, final File file) {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        Object obj = null;
        try {
            jSONObject.put("provider", str2);
            Observable map = b().M(str, e(jSONObject)).map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda49
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj2) {
                    return h.b(str2, file, (ResponseBody) obj2);
                }
            });
            int i3 = f10182n + 3;
            f10183o = i3 % 128;
            if (i3 % 2 == 0) {
                return map;
            }
            obj.hashCode();
            throw null;
        } catch (JSONException e2) {
            Timber.e(e2, "Couldn't send getEventReport API request", new Object[0]);
            return null;
        }
    }

    private static /* synthetic */ Object g(Object[] objArr) {
        h hVar = (h) objArr[0];
        String str = (String) objArr[1];
        File file = (File) objArr[2];
        int i2 = 2 % 2;
        int i3 = f10182n + 85;
        f10183o = i3 % 128;
        int i4 = i3 % 2;
        ObservableSource map = hVar.b().B(str, RequestBody.create(file, MediaType.parse("audio/mp4"))).map(new h$$ExternalSyntheticLambda11());
        int i5 = f10183o + 55;
        f10182n = i5 % 128;
        if (i5 % 2 != 0) {
            return map;
        }
        throw null;
    }

    public final Observable<ResponseSignature> c(String str) {
        int i2 = 2 % 2;
        int i3 = f10183o + 93;
        f10182n = i3 % 128;
        int i4 = i3 % 2;
        Observable<ResponseBody> observableH = b().h(str);
        if (i4 != 0) {
            return observableH.map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda39
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return ResponseSignature.parse((ResponseBody) obj);
                }
            });
        }
        int i5 = 66 / 0;
        return observableH.map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda39
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ResponseSignature.parse((ResponseBody) obj);
            }
        });
    }

    public final Observable<ResponseSuccess> g(String str, String str2) {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("interviewCode", str2);
            Observable map = b().O(str, e(jSONObject)).map(new h$$ExternalSyntheticLambda11());
            int i3 = f10183o + 5;
            f10182n = i3 % 128;
            int i4 = i3 % 2;
            return map;
        } catch (JSONException e2) {
            Timber.e(e2, "Couldn't send getEventReport API request", new Object[0]);
            return null;
        }
    }

    public final Observable<ar> b(String str) {
        int i2 = 2 % 2;
        int i3 = f10182n + 11;
        f10183o = i3 % 128;
        if (i3 % 2 != 0) {
            b().i(str).map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda50
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return ar.e((ResponseBody) obj);
                }
            });
            throw null;
        }
        Observable map = b().i(str).map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda50
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ar.e((ResponseBody) obj);
            }
        });
        int i4 = f10182n + 105;
        f10183o = i4 % 128;
        int i5 = i4 % 2;
        return map;
    }

    public final Observable<ResponseVerifyFace> e(String str, String str2, String str3) throws Throwable {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("base64Image", str2);
            jSONObject.put("interviewId", str3);
            Object[] objArr = new Object[1];
            C("\u0003\u0000\u0013\b\u0013\u0001", (byte) ((ViewConfiguration.getPressedStateDuration() >> 16) + 97), 6 - Gravity.getAbsoluteGravity(0, 0), objArr);
            jSONObject.put("compareWith", ((String) objArr[0]).intern());
            Observable map = b().S(str, e(jSONObject)).map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda42
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return ResponseVerifyFace.parse((ResponseBody) obj);
                }
            });
            int i3 = f10183o + 123;
            f10182n = i3 % 128;
            int i4 = i3 % 2;
            return map;
        } catch (JSONException e2) {
            Timber.e(e2, "Couldn't send recognizeFace API request", new Object[0]);
            return null;
        }
    }

    public final Observable<ap> a(String str) {
        int i2 = 2 % 2;
        int i3 = f10183o + 113;
        f10182n = i3 % 128;
        int i4 = i3 % 2;
        Observable map = b().k(str).map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda36
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ap.d((ResponseBody) obj);
            }
        });
        int i5 = f10183o + 73;
        f10182n = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 84 / 0;
        }
        return map;
    }

    public final Single<be> d(String str) {
        Single<be> singleSingleOrError;
        int i2 = 2 % 2;
        int i3 = f10182n + 47;
        f10183o = i3 % 128;
        if (i3 % 2 != 0) {
            singleSingleOrError = b().u(str).map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda14
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return be.c((ResponseBody) obj);
                }
            }).singleOrError();
            int i4 = 18 / 0;
        } else {
            singleSingleOrError = b().u(str).map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda14
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return be.c((ResponseBody) obj);
                }
            }).singleOrError();
        }
        int i5 = f10182n + 15;
        f10183o = i5 % 128;
        if (i5 % 2 == 0) {
            return singleSingleOrError;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Observable<as> e(String str) {
        int i2 = 2 % 2;
        int i3 = f10182n + 89;
        f10183o = i3 % 128;
        int i4 = i3 % 2;
        Observable map = b().n(str).map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda24
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return as.e((ResponseBody) obj);
            }
        });
        int i5 = f10182n + 69;
        f10183o = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    @Deprecated
    public final Observable<aj> f(String str) {
        int i2 = 2 % 2;
        int i3 = f10183o + 5;
        f10182n = i3 % 128;
        int i4 = i3 % 2;
        Observable map = b().o(str).map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda51
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return aj.e((ResponseBody) obj);
            }
        });
        int i5 = f10183o + 39;
        f10182n = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 97 / 0;
        }
        return map;
    }

    @Deprecated
    public final Observable<Flow> i(String str, String str2) {
        int i2 = 2 % 2;
        int i3 = f10182n + 35;
        f10183o = i3 % 128;
        int i4 = i3 % 2;
        Observable<ResponseBody> observableF = b().f(str, str2);
        if (i4 == 0) {
            return observableF.map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda30
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return Flow.parse((ResponseBody) obj);
                }
            });
        }
        observableF.map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda30
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return Flow.parse((ResponseBody) obj);
            }
        });
        throw null;
    }

    public final Observable<List<Workflow>> e(String str, int i2, int i3, String str2) {
        int i4 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("$regex", str2);
            jSONObject2.put("$options", ContextChain.TAG_INFRA);
            jSONObject.put("name", jSONObject2);
            Observable map = b().e(str, i2, i3, e(jSONObject)).map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda21
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return Workflow.parse((ResponseBody) obj);
                }
            });
            int i5 = f10183o + 103;
            f10182n = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 59 / 0;
            }
            return map;
        } catch (JSONException e2) {
            Timber.e(e2, "Couldn't send fetch workflows API request", new Object[0]);
            return null;
        }
    }

    public final Observable<ResponseWorkflowInfo> h(String str) {
        int i2 = 2 % 2;
        int i3 = f10183o + 17;
        f10182n = i3 % 128;
        int i4 = i3 % 2;
        Observable map = b().m(str).map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda37
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ResponseWorkflowInfo.parse((ResponseBody) obj);
            }
        });
        int i5 = f10182n + 19;
        f10183o = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public final Observable<br> j(String str) {
        int i2 = 2 % 2;
        int i3 = f10182n + 97;
        f10183o = i3 % 128;
        int i4 = i3 % 2;
        Observable map = b().s(str).map(new h$$ExternalSyntheticLambda25());
        int i5 = f10183o + 13;
        f10182n = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public final Observable<br> g(String str) {
        int i2 = 2 % 2;
        int i3 = f10183o + 41;
        f10182n = i3 % 128;
        int i4 = i3 % 2;
        Observable map = b().r(str).map(new h$$ExternalSyntheticLambda25());
        int i5 = f10182n + 121;
        f10183o = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 78 / 0;
        }
        return map;
    }

    public final Observable<bi> c() {
        int i2 = 2 % 2;
        int i3 = f10183o + 71;
        f10182n = i3 % 128;
        if (i3 % 2 == 0) {
            b().c().map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda53
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return bi.c((ResponseBody) obj);
                }
            });
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Observable map = b().c().map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda53
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj2) {
                return bi.c((ResponseBody) obj2);
            }
        });
        int i4 = f10182n + 83;
        f10183o = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 65 / 0;
        }
        return map;
    }

    public final Observable<bb> i(String str) {
        int i2 = 2 % 2;
        int i3 = f10182n + 55;
        f10183o = i3 % 128;
        int i4 = i3 % 2;
        Observable<ResponseBody> observableQ = b().q(str);
        if (i4 == 0) {
            return observableQ.map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda17
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return bb.b((ResponseBody) obj);
                }
            });
        }
        int i5 = 77 / 0;
        return observableQ.map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda17
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return bb.b((ResponseBody) obj);
            }
        });
    }

    public final Observable<ResponseSuccess> f(String str, String str2) {
        int i2 = 2 % 2;
        int i3 = f10183o + 87;
        f10182n = i3 % 128;
        if (i3 % 2 == 0) {
            b().c(str, str2).map(new h$$ExternalSyntheticLambda11());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Observable map = b().c(str, str2).map(new h$$ExternalSyntheticLambda11());
        int i4 = f10182n + 17;
        f10183o = i4 % 128;
        int i5 = i4 % 2;
        return map;
    }

    public final Observable<ResponseSuccess> n(String str, String str2) {
        int i2 = 2 % 2;
        int i3 = f10182n + 49;
        f10183o = i3 % 128;
        int i4 = i3 % 2;
        Observable map = b().j(str, str2).map(new h$$ExternalSyntheticLambda11());
        int i5 = f10182n + 125;
        f10183o = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    private static /* synthetic */ Object f(Object[] objArr) {
        h hVar = (h) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        String str3 = (String) objArr[3];
        String str4 = (String) objArr[4];
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("bankIdentifier", str2);
            jSONObject.put("username", str3);
            jSONObject.put(HintConstants.AUTOFILL_HINT_PASSWORD, str4);
            ObservableSource map = hVar.b().D(str, e(jSONObject)).map(new h$$ExternalSyntheticLambda11());
            int i3 = f10182n + 97;
            f10183o = i3 % 128;
            int i4 = i3 % 2;
            return map;
        } catch (JSONException e2) {
            Timber.e(e2, "Couldn't send bankAccountLogin API request", new Object[0]);
            return null;
        }
    }

    private static /* synthetic */ Object l(Object[] objArr) {
        h hVar = (h) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        int i2 = 2 % 2;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("documentIdentifier", str2);
            ObservableSource map = hVar.b().n(str, e(jSONObject)).map(new h$$ExternalSyntheticLambda11());
            int i3 = f10182n + 71;
            f10183o = i3 % 128;
            int i4 = i3 % 2;
            return map;
        } catch (JSONException e2) {
            Timber.e(e2, "Couldn't send processId API request", new Object[0]);
            return null;
        }
    }

    public final Observable<ResponseSuccess> o(String str, String str2) {
        int i2 = 2 % 2;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("qrCodeText", str2);
            Observable map = b().l(str, e(jSONObject)).map(new h$$ExternalSyntheticLambda11());
            int i3 = f10182n + 93;
            f10183o = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 33 / 0;
            }
            return map;
        } catch (JSONException e2) {
            Timber.e(e2, "Couldn't send addQrCodeText API request", new Object[0]);
            return null;
        }
    }

    public final Observable<bc> c(String str, bt btVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f10183o + 97;
        f10182n = i3 % 128;
        int i4 = i3 % 2;
        Observable<bc> observableA = a(true, str, btVar);
        int i5 = f10183o + 115;
        f10182n = i5 % 128;
        if (i5 % 2 != 0) {
            return observableA;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private Observable<bc> a(boolean z2, String str, bt btVar) throws Throwable {
        Function6 function6;
        JSONObject jSONObject;
        String base64FromBitmap;
        int i2 = 2 % 2;
        boolean zIsSubmitOnlyMode = IncodeWelcome.getInstance().isSubmitOnlyMode();
        final com.incode.welcome_sdk.data.remote.e.c cVarB = b();
        if (zIsSubmitOnlyMode) {
            Objects.requireNonNull(cVarB);
            function6 = z2 ? new Function6() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda44
                @Override // kotlin.jvm.functions.Function6
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                    return cVarB.a((String) obj, (String) obj2, ((Integer) obj3).intValue(), (com.incode.welcome_sdk.data.remote.beans.f) obj4, (Integer) obj5, (RequestBody) obj6);
                }
            } : new Function6() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda55
                @Override // kotlin.jvm.functions.Function6
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                    return cVarB.c((String) obj, (String) obj2, ((Integer) obj3).intValue(), (com.incode.welcome_sdk.data.remote.beans.f) obj4, (Integer) obj5, (RequestBody) obj6);
                }
            };
        } else {
            Objects.requireNonNull(cVarB);
            if (z2) {
                function6 = new Function6() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda56
                    @Override // kotlin.jvm.functions.Function6
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                        return cVarB.e((String) obj, (String) obj2, ((Integer) obj3).intValue(), (com.incode.welcome_sdk.data.remote.beans.f) obj4, (Integer) obj5, (RequestBody) obj6);
                    }
                };
            } else {
                function6 = new Function6() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda57
                    @Override // kotlin.jvm.functions.Function6
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                        return cVarB.b((String) obj, (String) obj2, ((Integer) obj3).intValue(), (com.incode.welcome_sdk.data.remote.beans.f) obj4, (Integer) obj5, (RequestBody) obj6);
                    }
                };
                int i3 = f10183o + 37;
                f10182n = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        String strB = b(zIsSubmitOnlyMode, z2, btVar.f9564a);
        try {
            jSONObject = new JSONObject();
            if (zIsSubmitOnlyMode) {
                base64FromBitmap = (String) a(IdCaptureModuleScreenKt.e.AnonymousClass2.c(), -105176839, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), 105176860, new Object[]{btVar.b()}, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), IdCaptureModuleScreenKt.e.AnonymousClass2.c());
            } else {
                base64FromBitmap = BitmapUtils.getBase64FromBitmap(BitmapUtils.getBitmapFromFile(btVar.b()));
            }
            jSONObject.put("base64Image", base64FromBitmap);
            jSONObject.put("metadata", e(btVar.j()));
        } catch (JSONException e2) {
            e = e2;
        } catch (Exception e3) {
            e = e3;
        }
        try {
            RequestBody requestBody = (RequestBody) a(IdCaptureModuleScreenKt.e.AnonymousClass2.c(), -2062838864, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), 2062838872, new Object[]{this, e(jSONObject), btVar.e()}, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), IdCaptureModuleScreenKt.e.AnonymousClass2.c());
            int i5 = f10182n + 39;
            f10183o = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 3;
            }
            Integer numValueOf = Integer.valueOf(btVar.a());
            int iB = IncodeWelcome.a.b();
            int iB2 = IncodeWelcome.a.b();
            com.incode.welcome_sdk.data.remote.beans.f fVar = (com.incode.welcome_sdk.data.remote.beans.f) bt.e(-1494803683, IncodeWelcome.a.b(), IncodeWelcome.a.b(), iB, iB2, new Object[]{btVar}, 1494803684);
            int iB3 = IncodeWelcome.a.b();
            int iB4 = IncodeWelcome.a.b();
            return ((Observable) function6.invoke(strB, str, numValueOf, fVar, (Integer) bt.e(-951383871, IncodeWelcome.a.b(), IncodeWelcome.a.b(), iB3, iB4, new Object[]{btVar}, 951383871), requestBody)).map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda58
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return bc.b((ResponseBody) obj);
                }
            });
        } catch (JSONException e4) {
            e = e4;
            Timber.e(e, "Couldn't send recognizeFace API request", new Object[0]);
            return Observable.error(e);
        } catch (Exception e5) {
            e = e5;
            Timber.e(e, "Couldn't encrypt image", new Object[0]);
            return Observable.error(e);
        }
    }

    private static /* synthetic */ Object q(Object[] objArr) {
        File file = (File) objArr[0];
        int i2 = 2 % 2;
        Object obj = null;
        if (file == null) {
            int i3 = f10182n + 19;
            f10183o = i3 % 128;
            if (i3 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        String base64FromBitmap = BitmapUtils.getBase64FromBitmap(BitmapUtils.getBitmapFromFile(file));
        try {
            String strE = ae.e(base64FromBitmap, ae.c(base64FromBitmap, ae.c()));
            int i4 = f10183o + 81;
            f10182n = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 41 / 0;
            }
            return strE;
        } catch (Exception e2) {
            Timber.e(e2, "Couldn't encrypt image", new Object[0]);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0010, code lost:
    
        if (r4 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0012, code lost:
    
        r1 = r2 + 103;
        com.incode.welcome_sdk.data.remote.h.f10182n = r1 % 128;
        r1 = r1 % 2;
        r1 = r2 + com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        com.incode.welcome_sdk.data.remote.h.f10182n = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0021, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0022, code lost:
    
        if (r4 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0029, code lost:
    
        return com.incode.welcome_sdk.data.e.b.e(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String e(com.incode.welcome_sdk.data.remote.beans.s r4) throws java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.io.UnsupportedEncodingException {
        /*
            r3 = 2
            int r0 = r3 % r3
            int r2 = com.incode.welcome_sdk.data.remote.h.f10183o
            int r1 = r2 + 33
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.remote.h.f10182n = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L22
            r0 = 0
            int r0 = r0 / r0
            if (r4 != 0) goto L25
        L12:
            int r1 = r2 + 103
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.remote.h.f10182n = r0
            int r1 = r1 % r3
            int r1 = r2 + 119
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.remote.h.f10182n = r0
            int r1 = r1 % r3
            r0 = 0
            return r0
        L22:
            if (r4 != 0) goto L25
            goto L12
        L25:
            java.lang.String r0 = com.incode.welcome_sdk.data.e.b.e(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.remote.h.e(com.incode.welcome_sdk.data.remote.beans.s):java.lang.String");
    }

    private static /* synthetic */ Object e(Object[] objArr) throws Throwable {
        String strIntern;
        h hVar = (h) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("queueName", str2);
            com.incode.welcome_sdk.data.remote.e.c cVarB = hVar.b();
            if (!zBooleanValue) {
                Object[] objArr2 = new Object[1];
                C("\u0012\f\u0015\u0012\f\r\f\u0013\u0004\t㘰㘰\u0010\u0015㙅", (byte) (TextUtils.indexOf((CharSequence) "", '0') + 72), 15 - KeyEvent.normalizeMetaState(0), objArr2);
                strIntern = ((String) objArr2[0]).intern();
                int i3 = f10183o + 93;
                f10182n = i3 % 128;
                int i4 = i3 % 2;
            } else {
                int i5 = f10182n + 59;
                f10183o = i5 % 128;
                int i6 = i5 % 2;
                Object[] objArr3 = new Object[1];
                E("獲닎ᘉᷮ湞ㆂ\ue9b7厈ᮘ䠝즃\ua9da罍魰Ὁ跜쌜\u0aba櫭䦯瀞롒", (ViewConfiguration.getTapTimeout() >> 16) + 22, objArr3);
                strIntern = ((String) objArr3[0]).intern();
            }
            return cVarB.e(strIntern, str, e(jSONObject)).map(new h$$ExternalSyntheticLambda11());
        } catch (JSONException e2) {
            Timber.e(e2, "Couldn't send processId API request", new Object[0]);
            return null;
        }
    }

    public final Observable<ResponseSuccess> k(String str, String str2) {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("curp", str2);
            Observable map = b().F(str, e(jSONObject)).map(new h$$ExternalSyntheticLambda11());
            int i3 = f10183o + 81;
            f10182n = i3 % 128;
            int i4 = i3 % 2;
            return map;
        } catch (JSONException e2) {
            Timber.e(e2, "Couldn't send processImss API request", new Object[0]);
            return null;
        }
    }

    public final Observable<ResponseSuccess> m(String str) {
        int i2 = 2 % 2;
        int i3 = f10183o + 17;
        f10182n = i3 % 128;
        int i4 = i3 % 2;
        Observable map = b().a(str).map(new h$$ExternalSyntheticLambda11());
        int i5 = f10183o + 49;
        f10182n = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public final Observable<bg> l(String str) {
        int i2 = 2 % 2;
        int i3 = f10182n + 79;
        f10183o = i3 % 128;
        int i4 = i3 % 2;
        Observable map = b().g(str).map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda38
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return bg.d((ResponseBody) obj);
            }
        });
        int i5 = f10182n + 41;
        f10183o = i5 % 128;
        if (i5 % 2 == 0) {
            return map;
        }
        throw null;
    }

    public final Observable<x> o(String str) {
        int i2 = 2 % 2;
        int i3 = f10182n + 53;
        f10183o = i3 % 128;
        int i4 = i3 % 2;
        Observable map = b().e(str).map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda13
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return x.e((ResponseBody) obj);
            }
        });
        int i5 = f10182n + 79;
        f10183o = i5 % 128;
        if (i5 % 2 == 0) {
            return map;
        }
        throw null;
    }

    public final Observable<ResponseAddCurp> l(String str, String str2) {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("curp", str2);
            Observable map = b().C(str, e(jSONObject)).map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda40
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return ResponseAddCurp.parse((ResponseBody) obj);
                }
            });
            int i3 = f10183o + 59;
            f10182n = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 67 / 0;
            }
            return map;
        } catch (JSONException e2) {
            Timber.e(e2, "Couldn't send processId API request", new Object[0]);
            return null;
        }
    }

    public final Observable<ResponseAddCurpV2> c(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", str2);
            jSONObject.put("firstLastName", str3);
            jSONObject.put("secondLastName", str4);
            jSONObject.put(HintConstants.AUTOFILL_HINT_GENDER, str5);
            jSONObject.put("birthDate", str6);
            jSONObject.put(SentryThread.JsonKeys.STATE, str7);
            Observable map = b().z(str, e(jSONObject)).map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda32
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return ResponseAddCurpV2.parse((ResponseBody) obj);
                }
            });
            int i3 = f10182n + 51;
            f10183o = i3 % 128;
            int i4 = i3 % 2;
            return map;
        } catch (JSONException e2) {
            Timber.e(e2, "Couldn't send processId API request", new Object[0]);
            return null;
        }
    }

    public final Single<bl> r(String str, String str2) {
        int i2 = 2 % 2;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("rfc", str2);
            Single map = b().H(str, e(jSONObject)).map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda45
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return bl.c((ResponseBody) obj);
                }
            });
            int i3 = f10182n + 121;
            f10183o = i3 % 128;
            int i4 = i3 % 2;
            return map;
        } catch (JSONException e2) {
            Timber.e(e2, "Couldn't execute RFC validation request.", new Object[0]);
            return null;
        }
    }

    private static /* synthetic */ Object j(Object[] objArr) {
        h hVar = (h) objArr[0];
        String str = (String) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        NfcScanResult nfcScanResult = (NfcScanResult) objArr[3];
        int i2 = 2 % 2;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("processNfcData", zBooleanValue);
            jSONObject.put("dg1", nfcScanResult.getDg1Json());
            jSONObject.put("dg1Enc", nfcScanResult.getDg1EncodedData());
            jSONObject.put("dg2", nfcScanResult.getDg2Json());
            jSONObject.put("dg2Enc", nfcScanResult.getDg2EncodedData());
            jSONObject.put("sod", nfcScanResult.getSodEncodedData());
            ObservableSource map = hVar.b().E(str, e(jSONObject)).map(new h$$ExternalSyntheticLambda11());
            int i3 = f10183o + 83;
            f10182n = i3 % 128;
            int i4 = i3 % 2;
            return map;
        } catch (JSONException e2) {
            Timber.e(e2, "Couldn't send addNfcData API request", new Object[0]);
            return null;
        }
    }

    private static /* synthetic */ Object n(Object[] objArr) throws Throwable {
        String strIntern;
        h hVar = (h) objArr[0];
        String str = (String) objArr[1];
        IdInfoModel idInfoModel = (IdInfoModel) objArr[2];
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        int i2 = 2 % 2;
        try {
            JSONObject jSONObject = new JSONObject();
            Object[] objArr2 = new Object[1];
            E("螞\udc93僎쾇䅵\uf535駗⍹", 7 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr2);
            jSONObject.put(((String) objArr2[0]).intern(), idInfoModel.getAddress());
            jSONObject.put("documentNumber", idInfoModel.getDocumentNumber());
            jSONObject.put("expireAt", idInfoModel.getExpiryDate());
            jSONObject.put("name", idInfoModel.getFullName());
            jSONObject.put("birthDate", idInfoModel.getDateOfBirth());
            jSONObject.put(HintConstants.AUTOFILL_HINT_GENDER, idInfoModel.getSex());
            com.incode.welcome_sdk.data.remote.e.c cVarB = hVar.b();
            if (!(!zBooleanValue)) {
                int i3 = f10182n + 47;
                f10183o = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr3 = new Object[1];
                C("\u0012\f\u0015\u0012\n\u0006\u0011\f\u0005\u0017\u0001\u000e\u0002\t\u000f\u0015\r\b\u0013\u0003\u0002\u0010\u0004\u0013\u0002\u0006\u0005\u0017\u0006\u0003\u0003\u0000\u0016\u0013\u0016\b\u0006\u0015㘗", (byte) (TextUtils.getOffsetAfter("", 0) + 25), View.MeasureSpec.getMode(0) + 39, objArr3);
                strIntern = ((String) objArr3[0]).intern();
                int i5 = f10183o + 73;
                f10182n = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 4 % 3;
                }
            } else {
                Object[] objArr4 = new Object[1];
                C("\u0012\f\u0015\u0012\n\u0006\u0011\f\u0005\u0017\u0001\u000e\u0002\t\u000f\u0015\r\b\u0013\u0003\u0002\u0010\u0004\u0013\u0002\u0006\u0005\u0017㘷", (byte) (60 - TextUtils.indexOf("", "", 0, 0)), (ViewConfiguration.getEdgeSlop() >> 16) + 29, objArr4);
                strIntern = ((String) objArr4[0]).intern();
            }
            return cVarB.d(strIntern, str, e(jSONObject)).map(new h$$ExternalSyntheticLambda11());
        } catch (JSONException e2) {
            Timber.e(e2, "Couldn't send addOcrData API request", new Object[0]);
            return null;
        }
    }

    public final Single<ResponseBody> e(String str, GlobalWatchlistModel globalWatchlistModel) {
        int i2 = 2 % 2;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("firstName", globalWatchlistModel.getFirstName());
            jSONObject.put("surName", globalWatchlistModel.getSurName());
            jSONObject.putOpt("birthYear", globalWatchlistModel.getBirthYear());
            if (globalWatchlistModel.getCountryCode() != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(globalWatchlistModel.getCountryCode());
                jSONObject.put("countryCodes", new JSONArray((Collection) arrayList));
                int i3 = f10182n + 93;
                f10183o = i3 % 128;
                int i4 = i3 % 2;
            }
            Single<ResponseBody> singleG = b().G(str, e(jSONObject));
            int i5 = f10182n + 59;
            f10183o = i5 % 128;
            if (i5 % 2 == 0) {
                return singleG;
            }
            throw null;
        } catch (JSONException e2) {
            Timber.e(e2, "Couldn't send addGlobalWatchlistData API request", new Object[0]);
            return null;
        }
    }

    public final Observable<ah> e(String str, EKYBForm eKYBForm) {
        int i2 = 2 % 2;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("plugins", new JSONArray((Collection) Collections.singletonList("ekyb")));
            jSONObject.putOpt("businessName", eKYBForm.getBusinessName());
            jSONObject.putOpt("houseNo", eKYBForm.getHouseNumber());
            jSONObject.putOpt("street", eKYBForm.getStreet());
            jSONObject.putOpt("addressLine2", eKYBForm.getAddressLine2());
            jSONObject.putOpt(AdRevenueScheme.COUNTRY, eKYBForm.getCountry());
            jSONObject.putOpt(Geo.JsonKeys.CITY, eKYBForm.getCity());
            jSONObject.putOpt(SentryThread.JsonKeys.STATE, eKYBForm.getState());
            jSONObject.putOpt(HintConstants.AUTOFILL_HINT_POSTAL_CODE, eKYBForm.getZipCode());
            jSONObject.putOpt("taxId", eKYBForm.getTaxId());
            Observable map = this.f10186c.v(str, e(jSONObject)).map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda20
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return ah.b((ResponseBody) obj);
                }
            });
            int i3 = f10182n + 21;
            f10183o = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 97 / 0;
            }
            return map;
        } catch (JSONException unused) {
            Timber.e("Couldn't send processEKYBChecks API request", new Object[0]);
            return null;
        }
    }

    public final Observable<ai> d(String str, EKYCForm eKYCForm) {
        int i2 = 2 % 2;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("plugins", new JSONArray((Collection) Collections.singletonList("kyc")));
            jSONObject.putOpt("firstName", eKYCForm.getFirstName());
            jSONObject.putOpt("surName", eKYCForm.getSurName());
            jSONObject.putOpt("street", eKYCForm.getStreet());
            jSONObject.putOpt("houseNo", eKYCForm.getHouseNumber());
            jSONObject.putOpt(Geo.JsonKeys.CITY, eKYCForm.getCity());
            jSONObject.putOpt(SentryThread.JsonKeys.STATE, eKYCForm.getState());
            jSONObject.putOpt(HintConstants.AUTOFILL_HINT_POSTAL_CODE, eKYCForm.getPostalCode());
            jSONObject.putOpt("taxId", eKYCForm.getTaxId());
            jSONObject.putOpt(AdRevenueScheme.COUNTRY, eKYCForm.getCountry());
            jSONObject.putOpt("email", eKYCForm.getEmail());
            jSONObject.putOpt("dateOfBirth", eKYCForm.getDateOfBirth());
            jSONObject.putOpt("nationality", eKYCForm.getNationality());
            Observable map = b().x(str, e(jSONObject)).map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda52
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return ai.b((ResponseBody) obj);
                }
            });
            int i3 = f10183o + 35;
            f10182n = i3 % 128;
            int i4 = i3 % 2;
            return map;
        } catch (JSONException unused) {
            Timber.e("Couldn't send processEKYCChecks API request", new Object[0]);
            return null;
        }
    }

    public final Observable<ResponseSuccess> a(String str, boolean z2) {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("manualIdCheckNeeded", z2);
            Observable map = b().w(str, e(jSONObject)).map(new h$$ExternalSyntheticLambda11());
            int i3 = f10182n + 35;
            f10183o = i3 % 128;
            int i4 = i3 % 2;
            return map;
        } catch (JSONException e2) {
            Timber.e(e2, "Couldn't send updateCustomer API request", new Object[0]);
            return null;
        }
    }

    public final Observable<ResponseSuccess> c(String str, DocumentType documentType, File file, String str2, j.b bVar, int i2) {
        int i3 = 2 % 2;
        int i4 = f10182n + 113;
        f10183o = i4 % 128;
        int i5 = i4 % 2;
        if (documentType == null) {
            return Observable.just(new ResponseSuccess(false));
        }
        RequestBody requestBodyCreate = RequestBody.create(file, MediaType.parse(str2));
        if (!IncodeWelcome.getInstance().isSubmitOnlyMode()) {
            com.incode.welcome_sdk.data.remote.e.c cVarB = b();
            String documentTypeString = documentType.getDocumentTypeString();
            String subtypeString = documentType.getSubtypeString(str2);
            int iC = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
            int iC2 = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
            int iC3 = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
            Observable map = cVarB.b(str, documentTypeString, subtypeString, (String) null, (RequestBody) a(iC2, -2062838864, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), 2062838872, new Object[]{this, requestBodyCreate, bVar}, iC, iC3), i2).map(new h$$ExternalSyntheticLambda11());
            int i6 = f10183o + 105;
            f10182n = i6 % 128;
            if (i6 % 2 != 0) {
                return map;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            int iC4 = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
            int iC5 = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
            int iC6 = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
            jSONObject.put("base64Image", (String) a(iC5, -105176839, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), 105176860, new Object[]{file}, iC4, iC6));
            int i7 = f10182n + 73;
            f10183o = i7 % 128;
            int i8 = i7 % 2;
        } catch (JSONException e2) {
            Timber.e(e2, "Couldn't encrypt image", new Object[0]);
        }
        RequestBody requestBodyE = e(jSONObject);
        com.incode.welcome_sdk.data.remote.e.c cVarB2 = b();
        String documentTypeString2 = documentType.getDocumentTypeString();
        String subtypeString2 = documentType.getSubtypeString(str2);
        Object[] objArr = {this, requestBodyE, bVar};
        int iC7 = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        return cVarB2.d(str, documentTypeString2, subtypeString2, null, (RequestBody) a(IdCaptureModuleScreenKt.e.AnonymousClass2.c(), -2062838864, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), 2062838872, objArr, iC7, IdCaptureModuleScreenKt.e.AnonymousClass2.c()), i2).map(new h$$ExternalSyntheticLambda11());
    }

    public final Observable<ResponseSuccess> k(String str) {
        int i2 = 2 % 2;
        int i3 = f10182n + 109;
        f10183o = i3 % 128;
        int i4 = i3 % 2;
        Observable map = b().d(str).map(new h$$ExternalSyntheticLambda11());
        int i5 = f10182n + 83;
        f10183o = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 13 / 0;
        }
        return map;
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        Object map;
        h hVar = (h) objArr[0];
        String str = (String) objArr[1];
        int i2 = 2 % 2;
        int i3 = f10182n + 75;
        f10183o = i3 % 128;
        if (i3 % 2 != 0) {
            map = hVar.b().b(str).map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda28
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return ResponseMedicalDoc.parse((ResponseBody) obj);
                }
            });
            int i4 = 53 / 0;
        } else {
            map = hVar.b().b(str).map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda28
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return ResponseMedicalDoc.parse((ResponseBody) obj);
                }
            });
        }
        int i5 = f10182n + 15;
        f10183o = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public final Observable<ax> e(String str, double d2, double d3, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IBrazeLocation.LATITUDE, d2);
            jSONObject.put(IBrazeLocation.LONGITUDE, d3);
            jSONObject.put("mThoroughfare", str2);
            jSONObject.put("mSubThoroughfare", str3);
            jSONObject.put("mLocality", str4);
            jSONObject.put("mSubLocality", str5);
            jSONObject.put("mAdminArea", str6);
            jSONObject.put("mSubAdminArea", str7);
            jSONObject.put("mPostalCode", str8);
            jSONObject.put("mCountryCode", str9);
            jSONObject.put("mCountryName", str10);
            Observable map = b().o(str, e(jSONObject)).map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda48
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return ax.d((ResponseBody) obj);
                }
            });
            int i3 = f10183o + 113;
            f10182n = i3 % 128;
            int i4 = i3 % 2;
            return map;
        } catch (JSONException e2) {
            Timber.e(e2, "Couldn't send geolocation API request", new Object[0]);
            return null;
        }
    }

    public final Observable<ResponseSuccess> e(String str, boolean z2) {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("manualSelfieCheckNeeded", z2);
            Observable map = b().A(str, e(jSONObject)).map(new h$$ExternalSyntheticLambda11());
            int i3 = f10182n + 11;
            f10183o = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 14 / 0;
            }
            return map;
        } catch (JSONException e2) {
            Timber.e(e2, "Couldn't send updateCustomer API request", new Object[0]);
            return null;
        }
    }

    public final Observable<v> e(String str, String str2, String str3, Map<String, Float> map, com.incode.welcome_sdk.data.remote.beans.f fVar, String str4) {
        int i2 = 2 % 2;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("base64Image", str2);
            jSONObject.put("metadata", str3);
            if (map != null) {
                jSONObject.putOpt("faceCoordinates", new JSONObject(map));
            }
            Observable map2 = b().e(str, e(jSONObject), fVar, str4).map(new h$$ExternalSyntheticLambda0());
            int i3 = f10182n + 73;
            f10183o = i3 % 128;
            int i4 = i3 % 2;
            return map2;
        } catch (JSONException e2) {
            Timber.e(e2, "Couldn't send recognizeFace API request", new Object[0]);
            return null;
        }
    }

    public final Observable<v> b(String str, String str2, Map<String, Float> map, boolean z2) throws Throwable {
        String strIntern;
        int i2 = 2 % 2;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("base64Image", str2);
            if (map != null) {
                jSONObject.putOpt("faceCoordinates", new JSONObject(map));
                int i3 = f10183o + 41;
                f10182n = i3 % 128;
                int i4 = i3 % 2;
            }
            com.incode.welcome_sdk.data.remote.e.c cVarB = b();
            RequestBody requestBodyE = e(jSONObject);
            com.incode.welcome_sdk.data.remote.beans.f fVar = com.incode.welcome_sdk.data.remote.beans.f.AUTO;
            if (z2) {
                Object[] objArr = new Object[1];
                C("\u0003\u0000\u0013\b\u0013\u0001", (byte) (TextUtils.indexOf("", "") + 97), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 6, objArr);
                strIntern = ((String) objArr[0]).intern();
            } else {
                strIntern = "videoSelfie";
                int i5 = f10182n + 19;
                f10183o = i5 % 128;
                int i6 = i5 % 2;
            }
            return cVarB.d(str, requestBodyE, fVar, strIntern).map(new h$$ExternalSyntheticLambda0());
        } catch (JSONException e2) {
            Timber.e(e2, "Couldn't send recognizeFace API request", new Object[0]);
            return null;
        }
    }

    private static /* synthetic */ Object m(Object[] objArr) {
        h hVar = (h) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            if (IncodeWelcome.getInstance().isSubmitOnlyMode()) {
                int i3 = f10183o + 23;
                f10182n = i3 % 128;
                int i4 = i3 % 2;
                jSONObject.put("base64Image", ae.e(str2, ae.c(str2, ae.c())));
                return hVar.b().p(str, e(jSONObject)).map(new h$$ExternalSyntheticLambda22());
            }
            jSONObject.put("base64Image", str2);
            ObservableSource map = hVar.b().r(str, e(jSONObject)).map(new h$$ExternalSyntheticLambda22());
            int i5 = f10182n + 23;
            f10183o = i5 % 128;
            int i6 = i5 % 2;
            return map;
        } catch (JSONException e2) {
            Timber.e(e2, "Couldn't send recognizeFace API request", new Object[0]);
            return null;
        } catch (Exception e3) {
            Timber.e(e3, "Couldn't encrypt image", new Object[0]);
            return null;
        }
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        h hVar = (h) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("base64Image", str2);
            ObservableSource map = hVar.b().q(str, e(jSONObject)).map(new h$$ExternalSyntheticLambda22());
            int i3 = f10183o + 37;
            f10182n = i3 % 128;
            int i4 = i3 % 2;
            return map;
        } catch (JSONException e2) {
            Timber.e(e2, "Couldn't send recognizeFace API request", new Object[0]);
            return null;
        } catch (Exception e3) {
            Timber.e(e3, "Couldn't encrypt image", new Object[0]);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0041 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.reactivex.Observable<com.incode.welcome_sdk.data.remote.beans.ResponseSuccess> d(java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r5 = this;
            r4 = 2
            int r0 = r4 % r4
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            r3 = 0
            java.lang.String r0 = "base64Image"
            r2.put(r0, r8)     // Catch: org.json.JSONException -> L24 java.lang.Exception -> L2d
            com.incode.welcome_sdk.data.remote.e.c r1 = r5.b()     // Catch: org.json.JSONException -> L24 java.lang.Exception -> L2d
            okhttp3.RequestBody r0 = e(r2)     // Catch: org.json.JSONException -> L24 java.lang.Exception -> L2d
            io.reactivex.Observable r1 = r1.a(r6, r7, r0)     // Catch: org.json.JSONException -> L24 java.lang.Exception -> L2d
            com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda11 r0 = new com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda11     // Catch: org.json.JSONException -> L24 java.lang.Exception -> L2d
            r0.<init>()     // Catch: org.json.JSONException -> L24 java.lang.Exception -> L2d
            io.reactivex.Observable r0 = r1.map(r0)     // Catch: org.json.JSONException -> L24 java.lang.Exception -> L2d
            return r0
        L24:
            r2 = move-exception
            java.lang.String r1 = "Couldn't send sendZoomedFrame API request"
            java.lang.Object[] r0 = new java.lang.Object[r3]
            timber.log.Timber.e(r2, r1, r0)
            goto L35
        L2d:
            r2 = move-exception
            java.lang.String r1 = "Couldn't encrypt image"
            java.lang.Object[] r0 = new java.lang.Object[r3]
            timber.log.Timber.e(r2, r1, r0)
        L35:
            int r0 = com.incode.welcome_sdk.data.remote.h.f10183o
            int r1 = r0 + 67
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.remote.h.f10182n = r0
            int r1 = r1 % r4
            r0 = 0
            if (r1 == 0) goto L42
            return r0
        L42:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.remote.h.d(java.lang.String, java.lang.String, java.lang.String):io.reactivex.Observable");
    }

    public final Observable<ay> s(String str) {
        int i2 = 2 % 2;
        Observable map = b().K(str, e(new JSONObject())).map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda47
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ay.c((ResponseBody) obj);
            }
        });
        int i3 = f10182n + 95;
        f10183o = i3 % 128;
        if (i3 % 2 == 0) {
            return map;
        }
        throw null;
    }

    public final Single<bf> d(String str, FaceMatch.MatchType matchType, boolean z2) throws Throwable {
        String strIntern;
        int i2 = 2 % 2;
        int i3 = f10183o + 33;
        f10182n = i3 % 128;
        if (i3 % 2 == 0) {
            b();
            throw null;
        }
        com.incode.welcome_sdk.data.remote.e.c cVarB = b();
        if (!z2) {
            Object[] objArr = new Object[1];
            E("獲닎ᘉᷮ湞ㆂ\ue9b7厈ᮘ䠝즃\ua9da釬䀘裃掁ᕽ㷽", 17 - ExpandableListView.getPackedPositionGroup(0L), objArr);
            strIntern = ((String) objArr[0]).intern();
        } else {
            Object[] objArr2 = new Object[1];
            E("獲닎ᘉᷮ湞ㆂ\ue9b7厈ᮘ䠝즃\ua9da釬䀘裃掁坛ᔧ椄菝囧ཡὉ跜쌜\u0aba櫭䦯瀞롒", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 30, objArr2);
            strIntern = ((String) objArr2[0]).intern();
            int i4 = f10183o + 79;
            f10182n = i4 % 128;
            int i5 = i4 % 2;
        }
        return cVarB.b(strIntern, matchType.apiName, str).map(new h$$ExternalSyntheticLambda6());
    }

    public final Observable<ak> b(String str, String str2, String str3, String str4) {
        int i2 = 2 % 2;
        int i3 = f10182n + 125;
        f10183o = i3 % 128;
        if (i3 % 2 == 0) {
            Observable map = b().e(str, str2, str3, str4).map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda26
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return ak.e((ResponseBody) obj);
                }
            });
            int i4 = f10182n + 85;
            f10183o = i4 % 128;
            int i5 = i4 % 2;
            return map;
        }
        b().e(str, str2, str3, str4).map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda26
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ak.e((ResponseBody) obj);
            }
        });
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object i(Object[] objArr) {
        h hVar = (h) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            if (!IncodeWelcome.getInstance().isSubmitOnlyMode()) {
                jSONObject.put("base64Image", str2);
                ObservableSource map = hVar.b().I(str, e(jSONObject)).map(new h$$ExternalSyntheticLambda11());
                int i3 = f10182n + 117;
                f10183o = i3 % 128;
                int i4 = i3 % 2;
                return map;
            }
            int i5 = f10182n + 69;
            f10183o = i5 % 128;
            if (i5 % 2 == 0) {
                jSONObject.put("base64Image", ae.e(str2, ae.c(str2, ae.c())));
                return hVar.b().L(str, e(jSONObject)).map(new h$$ExternalSyntheticLambda11());
            }
            jSONObject.put("base64Image", ae.e(str2, ae.c(str2, ae.c())));
            hVar.b().L(str, e(jSONObject)).map(new h$$ExternalSyntheticLambda11());
            throw null;
        } catch (JSONException e2) {
            Timber.e(e2, "Couldn't send recognizeFace API request", new Object[0]);
            return null;
        } catch (Exception e3) {
            Timber.e(e3, "Couldn't encrypt image", new Object[0]);
            return null;
        }
    }

    public final Observable<ResponseSuccess> p(String str, String str2) {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("base64Image", str2);
            return b().N(str, e(jSONObject)).map(new h$$ExternalSyntheticLambda11());
        } catch (JSONException e2) {
            Timber.e(e2, "Couldn't send recognizeFace API request", new Object[0]);
            int i3 = f10183o + 45;
            f10182n = i3 % 128;
            int i4 = i3 % 2;
            return null;
        } catch (Exception e3) {
            Timber.e(e3, "Couldn't encrypt image", new Object[0]);
            int i32 = f10183o + 45;
            f10182n = i32 % 128;
            int i42 = i32 % 2;
            return null;
        }
    }

    public final Observable<ResponseSuccess> a(String str, File file, j.b bVar) {
        int i2 = 2 % 2;
        int i3 = f10182n + 57;
        f10183o = i3 % 128;
        int i4 = i3 % 2;
        RequestBody requestBodyCreate = RequestBody.create(file, MediaType.parse(ClipboardModule.MIMETYPE_JPEG));
        com.incode.welcome_sdk.data.remote.e.c cVarB = b();
        int iC = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        int iC2 = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        int iC3 = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        Observable map = cVarB.m(str, (RequestBody) a(iC2, -2062838864, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), 2062838872, new Object[]{this, requestBodyCreate, bVar}, iC, iC3)).map(new h$$ExternalSyntheticLambda11());
        int i5 = f10183o + 5;
        f10182n = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public final Observable<y> u(String str, String str2) {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        int iC = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        int iC2 = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        int iC3 = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        Observable map = ((com.incode.welcome_sdk.data.remote.e.a) a(iC2, 1604477131, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), -1604477111, new Object[]{this}, iC, iC3)).e(str, str2, e(jSONObject)).map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda29
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return y.d((ResponseBody) obj);
            }
        });
        int i3 = f10182n + 15;
        f10183o = i3 % 128;
        int i4 = i3 % 2;
        return map;
    }

    public final Observable<au> y(String str, String str2) {
        int i2 = 2 % 2;
        int i3 = f10183o + 125;
        f10182n = i3 % 128;
        if (i3 % 2 != 0) {
            int iC = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
            int iC2 = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
            int iC3 = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
            return ((com.incode.welcome_sdk.data.remote.e.a) a(iC2, 1604477131, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), -1604477111, new Object[]{this}, iC, iC3)).d(str, str2).map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda35
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return au.d((ResponseBody) obj);
                }
            });
        }
        int iC4 = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        int iC5 = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        int iC6 = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        ((com.incode.welcome_sdk.data.remote.e.a) a(iC5, 1604477131, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), -1604477111, new Object[]{this}, iC4, iC6)).d(str, str2).map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda35
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return au.d((ResponseBody) obj);
            }
        });
        throw null;
    }

    public final Observable<at> q(String str) {
        int i2 = 2 % 2;
        int i3 = f10182n + 63;
        f10183o = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        Object[] objArr = {this};
        int iC = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        int iC2 = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        int iC3 = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        int iC4 = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        if (i4 != 0) {
            ((com.incode.welcome_sdk.data.remote.e.a) a(iC2, 1604477131, iC4, -1604477111, objArr, iC, iC3)).d(str).map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda7
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj2) {
                    return at.a((ResponseBody) obj2);
                }
            });
            throw null;
        }
        Observable map = ((com.incode.welcome_sdk.data.remote.e.a) a(iC2, 1604477131, iC4, -1604477111, objArr, iC, iC3)).d(str).map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda7
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj2) {
                return at.a((ResponseBody) obj2);
            }
        });
        int i5 = f10182n + 105;
        f10183o = i5 % 128;
        if (i5 % 2 == 0) {
            return map;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object t(Object[] objArr) {
        h hVar = (h) objArr[0];
        String str = (String) objArr[1];
        int i2 = 2 % 2;
        int i3 = f10182n + 47;
        f10183o = i3 % 128;
        int i4 = i3 % 2;
        ObservableSource map = hVar.b().f(str).map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda43
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return bj.c((ResponseBody) obj);
            }
        });
        int i5 = f10183o + 43;
        f10182n = i5 % 128;
        if (i5 % 2 != 0) {
            return map;
        }
        throw null;
    }

    public final Observable<aq> p(String str) {
        int i2 = 2 % 2;
        int i3 = f10182n + 105;
        f10183o = i3 % 128;
        int i4 = i3 % 2;
        Observable map = b().j(str).map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda19
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return aq.d((ResponseBody) obj);
            }
        });
        int i5 = f10183o + 53;
        f10182n = i5 % 128;
        if (i5 % 2 != 0) {
            return map;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Observable<w> v(String str, String str2) {
        int i2 = 2 % 2;
        int i3 = f10182n + 81;
        f10183o = i3 % 128;
        int i4 = i3 % 2;
        Observable map = b().d(str, str2).map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda16
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return w.a((ResponseBody) obj);
            }
        });
        int i5 = f10182n + 79;
        f10183o = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public final Single<ResponseBody> b(String str, File file) {
        int i2 = 2 % 2;
        int i3 = f10182n + 21;
        f10183o = i3 % 128;
        if (i3 % 2 == 0) {
            return b().P(str, RequestBody.create(file, MediaType.parse("video/mp4")));
        }
        b().P(str, RequestBody.create(file, MediaType.parse("video/mp4")));
        throw null;
    }

    public final Observable<av> u(String str) {
        int i2 = 2 % 2;
        int i3 = f10183o + 21;
        f10182n = i3 % 128;
        int i4 = i3 % 2;
        Observable map = b().p(str).map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda59
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return av.a((ResponseBody) obj);
            }
        });
        int i5 = f10182n + 55;
        f10183o = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 41 / 0;
        }
        return map;
    }

    public final Single<aw> x(String str, String str2) {
        int i2 = 2 % 2;
        int i3 = f10182n + 81;
        f10183o = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.data.remote.e.c cVarB = b();
        if (i4 != 0) {
            Single map = cVarB.h(str, str2).map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda1
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return aw.b((ResponseBody) obj);
                }
            });
            int i5 = 7 / 0;
            return map;
        }
        return cVarB.h(str, str2).map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return aw.b((ResponseBody) obj);
            }
        });
    }

    public final Observable<an> v(String str) {
        int i2 = 2 % 2;
        int i3 = f10183o + 69;
        f10182n = i3 % 128;
        int i4 = i3 % 2;
        Observable map = b().l(str).map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda31
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return an.d((ResponseBody) obj);
            }
        });
        int i5 = f10183o + 59;
        f10182n = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public final Single<ResponseFaceAuthentication> e(String str, FaceAuthenticationRequest faceAuthenticationRequest) {
        int i2 = 2 % 2;
        int i3 = f10182n + 41;
        f10183o = i3 % 128;
        int i4 = i3 % 2;
        Single<ResponseFaceAuthentication> singleA = b().a(str, faceAuthenticationRequest);
        int i5 = f10182n + 97;
        f10183o = i5 % 128;
        int i6 = i5 % 2;
        return singleA;
    }

    public final Single<ResponseFaceLogin> c(String str, String str2, Map<String, Float> map, String str3, boolean z2, String str4, long j2, String str5, String str6, DeviceFingerprint deviceFingerprint) throws Throwable {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("configurationId", str4);
            jSONObject.put("uuid", str);
            jSONObject.put("deviceFingerprintHash", deviceFingerprint.getHash());
            if (str5 != null) {
                jSONObject.put("videoRecordingToken", str5);
                int i3 = f10183o + 17;
                f10182n = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 4 % 5;
                }
            }
            if (str6 != null) {
                int i5 = f10182n + 123;
                f10183o = i5 % 128;
                int i6 = i5 % 2;
                jSONObject.put("videoRecordingId", str6);
                int i7 = f10182n + 27;
                f10183o = i7 % 128;
                int i8 = i7 % 2;
            }
            JSONObject jSONObject2 = new JSONObject();
            if (str2 != null) {
                int i9 = f10183o + 109;
                f10182n = i9 % 128;
                if (i9 % 2 == 0) {
                    jSONObject2.put("base64Image", str2);
                    int i10 = 19 / 0;
                    if (map != null) {
                        jSONObject2.putOpt("faceCoordinates", new JSONObject(map));
                        int i11 = f10182n + 65;
                        f10183o = i11 % 128;
                        int i12 = i11 % 2;
                    }
                } else {
                    jSONObject2.put("base64Image", str2);
                    if (map != null) {
                        jSONObject2.putOpt("faceCoordinates", new JSONObject(map));
                        int i112 = f10182n + 65;
                        f10183o = i112 % 128;
                        int i122 = i112 % 2;
                    }
                }
            } else if (str3 != null) {
                int i13 = f10182n + 55;
                f10183o = i13 % 128;
                if (i13 % 2 != 0) {
                    jSONObject2.put("template", str3);
                    int i14 = 74 / 0;
                } else {
                    jSONObject2.put("template", str3);
                }
            }
            Object[] objArr = new Object[1];
            C("\u0003\u0000\u0013\b\u0013\u0001", (byte) (96 - ExpandableListView.getPackedPositionChild(0L)), View.MeasureSpec.makeMeasureSpec(0, 0) + 6, objArr);
            jSONObject.put(((String) objArr[0]).intern(), jSONObject2);
            if (z2) {
                int i15 = f10182n + 75;
                f10183o = i15 % 128;
                if (i15 % 2 != 0) {
                    jSONObject.put("faceAttributes", false);
                } else {
                    jSONObject.put("faceAttributes", true);
                }
            }
            return b().d(j2, e(jSONObject)).map(new h$$ExternalSyntheticLambda2());
        } catch (JSONException e2) {
            Timber.e(e2, "Couldn't send recognizeFace API request", new Object[0]);
            return null;
        }
    }

    public final Single<ResponseFaceLogin> d(String str, String str2, Map<String, Float> map, boolean z2, String str3, long j2, String str4, String str5) throws Throwable {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("configurationId", str3);
            if (str4 != null) {
                jSONObject.put("videoRecordingToken", str4);
            }
            if (str5 != null) {
                int i3 = f10182n + 71;
                f10183o = i3 % 128;
                int i4 = i3 % 2;
                jSONObject.put("videoRecordingId", str5);
            }
            JSONObject jSONObject2 = new JSONObject();
            if (str != null) {
                int i5 = f10182n + 89;
                f10183o = i5 % 128;
                int i6 = i5 % 2;
                jSONObject2.putOpt("template", str);
            } else {
                jSONObject2.putOpt("base64Image", str2);
                if (map != null) {
                    jSONObject2.putOpt("faceCoordinates", new JSONObject(map));
                }
            }
            Object[] objArr = new Object[1];
            C("\u0003\u0000\u0013\b\u0013\u0001", (byte) (View.MeasureSpec.makeMeasureSpec(0, 0) + 97), (ViewConfiguration.getPressedStateDuration() >> 16) + 6, objArr);
            jSONObject.put(((String) objArr[0]).intern(), jSONObject2);
            if (z2) {
                int i7 = f10182n + 115;
                f10183o = i7 % 128;
                int i8 = i7 % 2;
                jSONObject.put("faceAttributes", true);
            }
            Single map2 = b().e(j2, e(jSONObject)).map(new h$$ExternalSyntheticLambda2());
            int i9 = f10182n + 11;
            f10183o = i9 % 128;
            int i10 = i9 % 2;
            return map2;
        } catch (JSONException e2) {
            Timber.e(e2, "Couldn't send recognizeFace API request", new Object[0]);
            return null;
        }
    }

    public final Observable<ResponseSuccess> c(String str, String str2, String str3, boolean z2) {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("title", str2);
            jSONObject.put("content", str3);
            jSONObject.put("status", z2);
            Observable map = b().R(str, e(jSONObject)).map(new h$$ExternalSyntheticLambda11());
            int i3 = f10183o + 11;
            f10182n = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 27 / 0;
            }
            return map;
        } catch (JSONException e2) {
            Timber.e(e2, "Couldn't send add user consent API request", new Object[0]);
            return null;
        }
    }

    public final Observable<z> f(String str, String str2, String str3, String str4) {
        int i2 = 2 % 2;
        int i3 = f10183o + 47;
        f10182n = i3 % 128;
        int i4 = i3 % 2;
        Observable map = b().a(str, str2, str3, str4).map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda27
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return z.c((ResponseBody) obj);
            }
        });
        int i5 = f10182n + 19;
        f10183o = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 68 / 0;
        }
        return map;
    }

    public final Observable<ResponseSuccess> a(String str, boolean z2, String str2) {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Object obj = null;
        try {
            jSONObject2.put("isSigned", z2);
            jSONObject2.put("id", str2);
            jSONArray.put(jSONObject2);
            jSONObject.put("consents", jSONArray);
            Observable map = b().Q(str, e(jSONObject)).map(new h$$ExternalSyntheticLambda11());
            int i3 = f10183o + 111;
            f10182n = i3 % 128;
            if (i3 % 2 != 0) {
                return map;
            }
            obj.hashCode();
            throw null;
        } catch (JSONException e2) {
            Timber.e(e2, "Couldn't send add consent API request", new Object[0]);
            return null;
        }
    }

    public final Single<ResponseCombinedConsent> b(String str, String str2, String str3) {
        int i2 = 2 % 2;
        int i3 = f10182n + 73;
        f10183o = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.data.remote.e.c cVarB = b();
        if (i4 == 0) {
            return cVarB.a(str, str2, str3).map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda33
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return ResponseCombinedConsent.parse((ResponseBody) obj);
                }
            });
        }
        cVarB.a(str, str2, str3).map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda33
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ResponseCombinedConsent.parse((ResponseBody) obj);
            }
        });
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Single<ResponseSuccess> d(String str, bn bnVar) {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("languageConsentId", bnVar.c());
            jSONObject.putOpt("checkboxes", new JSONObject(bnVar.b()));
            Single map = b().W(str, e(jSONObject)).map(new h$$ExternalSyntheticLambda11());
            int i3 = f10183o + 63;
            f10182n = i3 % 128;
            if (i3 % 2 != 0) {
                return map;
            }
            throw null;
        } catch (JSONException e2) {
            Timber.e(e2, "Couldn't sign combined consent.", new Object[0]);
            return null;
        }
    }

    public final Single<ResponseSuccess> a(String str, String str2, float f2, float f3, float f4, float f5, FaceProcessingUtils.DetectionData detectionData, String str3, boolean z2, float f6, SelfieScan.FaceAuthMode faceAuthMode) {
        int i2 = 2 % 2;
        int i3 = f10183o + 23;
        f10182n = i3 % 128;
        int i4 = i3 % 2;
        JSONObject jSONObjectD = d(f4, f5, detectionData, str3, -1.0f, f2, f3, faceAuthMode);
        Object obj = null;
        if (jSONObjectD == null) {
            return null;
        }
        if (!(!z2)) {
            int i5 = f10182n + 45;
            f10183o = i5 % 128;
            try {
                if (i5 % 2 != 0) {
                    jSONObjectD.put("livenessConfidence", f6);
                    jSONObjectD.put("base64Frame", BitmapUtils.getBase64FromBitmap(detectionData.bitmap));
                    throw null;
                }
                jSONObjectD.put("livenessConfidence", f6);
                jSONObjectD.put("base64Frame", BitmapUtils.getBase64FromBitmap(detectionData.bitmap));
            } catch (JSONException e2) {
                Timber.e(e2, "Failed to put base64Frame into update liveness stat request", new Object[0]);
            }
        }
        Single map = b().c(str, str2, e(jSONObjectD)).map(new h$$ExternalSyntheticLambda11());
        int i6 = f10183o + 67;
        f10182n = i6 % 128;
        if (i6 % 2 != 0) {
            return map;
        }
        obj.hashCode();
        throw null;
    }

    public final Observable<ResponseSuccess> a(String str, float f2, float f3, float f4, float f5, float f6, float f7, FaceProcessingUtils.DetectionData detectionData, String str2, String str3, SelfieScan.FaceAuthMode faceAuthMode) {
        int i2 = 2 % 2;
        JSONObject jSONObjectD = d(f6, f7, detectionData, str2, f2, f4, f5, faceAuthMode);
        if (jSONObjectD == null) {
            return null;
        }
        if (f3 > -1.0f) {
            int i3 = f10183o + 105;
            f10182n = i3 % 128;
            int i4 = i3 % 2;
            try {
                jSONObjectD.put("livenessConfidence", f3);
            } catch (JSONException e2) {
                Timber.e(e2, "Couldn't send insert liveness stat API request", new Object[0]);
                return null;
            }
        }
        jSONObjectD.put("base64Frame", BitmapUtils.getBase64FromBitmap(detectionData.bitmap));
        if (str3 != null) {
            int i5 = f10182n + 55;
            f10183o = i5 % 128;
            int i6 = i5 % 2;
            jSONObjectD.put("userId", str3);
        }
        return b().T(str, e(jSONObjectD)).map(new h$$ExternalSyntheticLambda11());
    }

    private static /* synthetic */ Object k(Object[] objArr) {
        h hVar = (h) objArr[0];
        String str = (String) objArr[1];
        int i2 = 2 % 2;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("$gt", "000000000000000000000000");
            jSONObject.put("_id", jSONObject2);
            Observable<ResponseBody> observableB = hVar.b().b(str, 0, Integer.MAX_VALUE, e(jSONObject));
            int i3 = f10183o + 15;
            f10182n = i3 % 128;
            if (i3 % 2 != 0) {
                return observableB;
            }
            throw null;
        } catch (JSONException e2) {
            Timber.e(e2, "Couldn't send getBlocklistTemplates request", new Object[0]);
            return null;
        }
    }

    public final Observable<ResponseInitFaceAuth> y(String str) {
        int i2 = 2 % 2;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(HintConstants.AUTOFILL_HINT_PHONE_NUMBER, str);
            Observable map = b().c(e(jSONObject)).map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda15
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return i.b((ResponseBody) obj);
                }
            });
            int i3 = f10182n + 39;
            f10183o = i3 % 128;
            if (i3 % 2 == 0) {
                return map;
            }
            throw null;
        } catch (JSONException unused) {
            Timber.e("Couldn't parse the response", new Object[0]);
            return null;
        }
    }

    public final Observable<u> x(String str) {
        int i2 = 2 % 2;
        int i3 = f10183o + 39;
        f10182n = i3 % 128;
        int i4 = i3 % 2;
        Observable<ResponseBody> observableT = b().t(str);
        if (i4 != 0) {
            return observableT.map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda3
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return u.d((ResponseBody) obj);
                }
            });
        }
        int i5 = 54 / 0;
        return observableT.map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda3
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return u.d((ResponseBody) obj);
            }
        });
    }

    public final Single<Map<String, Object>> B(String str) {
        int i2 = 2 % 2;
        int i3 = f10183o + 45;
        f10182n = i3 % 128;
        int i4 = i3 % 2;
        Single map = b().x(str).map(new Function() { // from class: com.incode.welcome_sdk.data.remote.h$$ExternalSyntheticLambda41
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return i.d((ResponseBody) obj);
            }
        });
        int i5 = f10182n + 15;
        f10183o = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public final Single<ResponseBody> D(String str) {
        int i2 = 2 % 2;
        int i3 = f10183o + 37;
        f10182n = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.data.remote.e.c cVarB = b();
        if (i4 != 0) {
            return cVarB.w(str);
        }
        cVarB.w(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Single<ResponseBody> d() {
        int i2 = 2 % 2;
        int i3 = f10182n + 107;
        f10183o = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.data.remote.e.c cVarB = b();
        if (i4 == 0) {
            return cVarB.y(ae.e());
        }
        int i5 = 56 / 0;
        return cVarB.y(ae.e());
    }

    public Single<al> z(String str) {
        int i2 = 2 % 2;
        int i3 = f10182n + 55;
        f10183o = i3 % 128;
        int i4 = i3 % 2;
        Single<al> singleV = b().v(str);
        int i5 = f10183o + 107;
        f10182n = i5 % 128;
        if (i5 % 2 != 0) {
            return singleV;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Single<ResponseSuccess> g(String str, String str2, String str3, String str4) {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("interviewId", str4);
            jSONObject.put("questionId", str2);
            jSONObject2.put("singleAnswer", str3);
            jSONObject.put("answerDetails", jSONObject2);
            Single map = b().V(str, e(jSONObject)).map(new h$$ExternalSyntheticLambda11());
            int i3 = f10182n + 61;
            f10183o = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 43 / 0;
            }
            return map;
        } catch (JSONException e2) {
            Timber.e(e2, "Couldn't send submit dynamic form API request", new Object[0]);
            return null;
        }
    }

    public final Single<ResponseSuccess> a(String str, String str2, float f2, float f3) {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("base64Image", str2);
            jSONObject.put("confidence", f2);
            jSONObject.put("threshold", f3);
            Single map = b().U(str, e(jSONObject)).map(new h$$ExternalSyntheticLambda11());
            int i3 = f10183o + 11;
            f10182n = i3 % 128;
            int i4 = i3 % 2;
            return map;
        } catch (JSONException e2) {
            Timber.e(e2, "Couldn't send add voice consent face API request", new Object[0]);
            return null;
        }
    }

    private static JSONObject d(float f2, float f3, FaceProcessingUtils.DetectionData detectionData, String str, float f4, float f5, float f6, SelfieScan.FaceAuthMode faceAuthMode) {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("deviceType", "ANDROID");
            jSONObject.put("deviceName", Build.MODEL);
            jSONObject.put("version", Build.VERSION.SDK_INT);
            jSONObject.put("authenticationType", str);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", detectionData.bitmap.getWidth());
            jSONObject2.put("height", detectionData.bitmap.getHeight());
            jSONObject.put("frameSize", jSONObject2);
            if (detectionData.face != null) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("x", detectionData.face.rect.f3644x);
                jSONObject3.put("y", detectionData.face.rect.f3645y);
                jSONObject3.put("width", detectionData.face.rect.width);
                jSONObject3.put("height", detectionData.face.rect.height);
                jSONObject3.put("leftEyeX", detectionData.faceLandmarksState.leftEye.x);
                jSONObject3.put("leftEyeY", detectionData.faceLandmarksState.leftEye.y);
                jSONObject3.put("rightEyeX", detectionData.faceLandmarksState.rightEye.x);
                jSONObject3.put("rightEyeY", detectionData.faceLandmarksState.rightEye.y);
                Pair<Float, Float> pairC = FaceProcessingUtils.c(detectionData);
                jSONObject3.put("mouthX", pairC.first);
                jSONObject3.put("mouthY", pairC.second);
                jSONObject.put("coordinates", jSONObject3);
            }
            jSONObject.put("brightness", f2);
            jSONObject.put("blurriness", f3);
            if (f4 > -1.0f) {
                int i3 = f10182n + 75;
                f10183o = i3 % 128;
                int i4 = i3 % 2;
                jSONObject.put("recognitionConfidence", f4);
            }
            if (faceAuthMode != null) {
                jSONObject.put("authenticationMethod", faceAuthMode.toString().toLowerCase());
                if (faceAuthMode == SelfieScan.FaceAuthMode.LOCAL) {
                    int i5 = f10182n + 13;
                    f10183o = i5 % 128;
                    int i6 = i5 % 2;
                    jSONObject.put("clientRecognitionThreshold", f5);
                    jSONObject.put("clientLivenessThreshold", f6);
                    int i7 = f10183o + 107;
                    f10182n = i7 % 128;
                    int i8 = i7 % 2;
                }
            }
            return jSONObject;
        } catch (JSONException e2) {
            Timber.e(e2, "LivenessStat JSON parsing error", new Object[0]);
            return null;
        }
    }

    public final Single<ResponseSuccess> e(String str, f fVar) {
        int i2 = 2 % 2;
        int i3 = f10182n + 87;
        f10183o = i3 % 128;
        int i4 = i3 % 2;
        Single map = b().T(str, A(fVar.e(((com.incode.welcome_sdk.commons.utils.x) com.incode.welcome_sdk.e.b.a((Class<?>) com.incode.welcome_sdk.commons.utils.x.class)).b()))).singleOrError().map(new h$$ExternalSyntheticLambda11());
        int i5 = f10182n + 67;
        f10183o = i5 % 128;
        if (i5 % 2 == 0) {
            return map;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static RequestBody e(JSONObject jSONObject) {
        int i2 = 2 % 2;
        int i3 = f10182n + 39;
        f10183o = i3 % 128;
        int i4 = i3 % 2;
        String string = jSONObject.toString();
        if (i4 == 0) {
            return A(string);
        }
        A(string);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static RequestBody b(JSONArray jSONArray) {
        int i2 = 2 % 2;
        int i3 = f10182n + 105;
        f10183o = i3 % 128;
        int i4 = i3 % 2;
        RequestBody requestBodyA = A(jSONArray.toString());
        int i5 = f10183o + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f10182n = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 49 / 0;
        }
        return requestBodyA;
    }

    private static RequestBody A(String str) {
        int i2 = 2 % 2;
        int i3 = f10182n + 65;
        f10183o = i3 % 128;
        int i4 = i3 % 2;
        RequestBody requestBodyCreate = RequestBody.create(str, MediaType.Companion.get(Constants.WUP_CONTENT_TYPE));
        int i5 = f10182n + 95;
        f10183o = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 74 / 0;
        }
        return requestBodyCreate;
    }

    private static String b(boolean z2, boolean z3, boolean z4) throws Throwable {
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder("omni/add/");
        if (z3) {
            Object[] objArr = new Object[1];
            E("眰흷쌜\u0aba\ue92e홝", (ViewConfiguration.getPressedStateDuration() >> 16) + 5, objArr);
            sb.append(((String) objArr[0]).intern());
        } else {
            Object[] objArr2 = new Object[1];
            C("\b\r\u0014\u0013", (byte) (12 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 4, objArr2);
            sb.append(((String) objArr2[0]).intern());
        }
        if (z4) {
            int i3 = f10182n + 45;
            f10183o = i3 % 128;
            if (i3 % 2 != 0) {
                sb.append("-second");
                int i4 = 45 / 0;
            } else {
                sb.append("-second");
            }
        }
        sb.append("-id");
        if (z2) {
            sb.append("/encrypted");
            int i5 = f10183o + 53;
            f10182n = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 4 % 3;
            }
        } else {
            sb.append("/v2");
        }
        return sb.toString();
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f10183o = 0;
        f10182n = 1;
        f10176f = new char[]{28615, 23155, 23085, 23100, 23099, 23083, 28614, 23098, 23103, 23096, 23097, 23153, 23086, 23091, 23084, 23093, 23095, 23089, 23090, 28609, 23082, 28613, 28608, 23088, 23101};
        f10178h = (char) 28609;
        f10179i = (char) 48896;
        f10177g = (char) 41645;
        f10180j = (char) 40834;
        f10181k = (char) 56710;
    }

    public final Observable<ResponseBody> w(String str) {
        int iC = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        int iC2 = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        int iC3 = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        return (Observable) a(iC2, 404366001, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), -404365986, new Object[]{this, str}, iC, iC3);
    }

    public final Observable<bj> t(String str) {
        int iC = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        int iC2 = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        int iC3 = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        return (Observable) a(iC2, 654533145, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), -654533123, new Object[]{this, str}, iC, iC3);
    }

    public final Observable<ResponseSuccess> t(String str, String str2) {
        int iC = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        int iC2 = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        int iC3 = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        return (Observable) a(iC2, -1816160792, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), 1816160798, new Object[]{this, str, str2}, iC, iC3);
    }

    public final Observable<bf> c(String str, boolean z2) {
        Object[] objArr = {this, str, Boolean.valueOf(z2)};
        int iC = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        return (Observable) a(IdCaptureModuleScreenKt.e.AnonymousClass2.c(), -376974981, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), 376974997, objArr, iC, IdCaptureModuleScreenKt.e.AnonymousClass2.c());
    }

    public final Observable<ad> q(String str, String str2) {
        int iC = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        int iC2 = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        int iC3 = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        return (Observable) a(iC2, -662123512, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), 662123514, new Object[]{this, str, str2}, iC, iC3);
    }

    public final Observable<ad> s(String str, String str2) {
        int iC = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        int iC2 = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        int iC3 = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        return (Observable) a(iC2, 1254682654, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), -1254682636, new Object[]{this, str, str2}, iC, iC3);
    }

    public final Observable<ResponseOCRData> d(String str, boolean z2) {
        Object[] objArr = {this, str, Boolean.valueOf(z2)};
        int iC = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        return (Observable) a(IdCaptureModuleScreenKt.e.AnonymousClass2.c(), 2029210259, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), -2029210256, objArr, iC, IdCaptureModuleScreenKt.e.AnonymousClass2.c());
    }

    public final Observable<ResponseMedicalDoc> r(String str) {
        int iC = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        int iC2 = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        int iC3 = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        return (Observable) a(iC2, -368943289, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), 368943294, new Object[]{this, str}, iC, iC3);
    }

    public final Observable<ResponseSuccess> n(String str) {
        int iC = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        int iC2 = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        int iC3 = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        return (Observable) a(iC2, 1062023863, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), -1062023852, new Object[]{this, str}, iC, iC3);
    }

    public final Observable<ResponseSuccess> d(String str, IdInfoModel idInfoModel, boolean z2) {
        Object[] objArr = {this, str, idInfoModel, Boolean.valueOf(z2)};
        int iC = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        return (Observable) a(IdCaptureModuleScreenKt.e.AnonymousClass2.c(), 41456448, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), -41456431, objArr, iC, IdCaptureModuleScreenKt.e.AnonymousClass2.c());
    }

    public final Observable<ResponseSuccess> e(String str, boolean z2, NfcScanResult nfcScanResult) {
        Object[] objArr = {this, str, Boolean.valueOf(z2), nfcScanResult};
        int iC = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        return (Observable) a(IdCaptureModuleScreenKt.e.AnonymousClass2.c(), -2117426535, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), 2117426545, objArr, iC, IdCaptureModuleScreenKt.e.AnonymousClass2.c());
    }

    public final Observable<ResponseSuccess> e(String str, String str2, boolean z2) {
        Object[] objArr = {this, str, str2, Boolean.valueOf(z2)};
        int iC = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        return (Observable) a(IdCaptureModuleScreenKt.e.AnonymousClass2.c(), 1442796435, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), -1442796435, objArr, iC, IdCaptureModuleScreenKt.e.AnonymousClass2.c());
    }

    private static String e(File file) {
        Object[] objArr = {file};
        int iC = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        return (String) a(IdCaptureModuleScreenKt.e.AnonymousClass2.c(), -105176839, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), 105176860, objArr, iC, IdCaptureModuleScreenKt.e.AnonymousClass2.c());
    }

    public final Observable<bc> a(String str, bt btVar) {
        int iC = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        int iC2 = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        int iC3 = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        return (Observable) a(iC2, 1290889477, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), -1290889454, new Object[]{this, str, btVar}, iC, iC3);
    }

    public final Observable<ResponseSuccess> m(String str, String str2) {
        int iC = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        int iC2 = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        int iC3 = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        return (Observable) a(iC2, -1452334977, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), 1452334991, new Object[]{this, str, str2}, iC, iC3);
    }

    public final Observable<ResponseSuccess> d(String str, String str2, String str3, String str4) {
        int iC = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        int iC2 = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        int iC3 = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        return (Observable) a(iC2, 32531939, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), -32531932, new Object[]{this, str, str2, str3, str4}, iC, iC3);
    }

    public final Observable<ResponseSuccess> a(String str, File file) {
        int iC = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        int iC2 = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        int iC3 = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        return (Observable) a(iC2, 1199331194, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), -1199331181, new Object[]{this, str, file}, iC, iC3);
    }

    public final Observable<bp> c(String str, int i2, boolean z2) {
        Object[] objArr = {this, str, Integer.valueOf(i2), Boolean.valueOf(z2)};
        int iC = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        return (Observable) a(IdCaptureModuleScreenKt.e.AnonymousClass2.c(), -754212719, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), 754212728, objArr, iC, IdCaptureModuleScreenKt.e.AnonymousClass2.c());
    }

    public final Observable<ResponseBody> c(String str, File file) {
        int iC = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        int iC2 = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        int iC3 = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        return (Observable) a(iC2, -298238439, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), 298238458, new Object[]{this, str, file}, iC, iC3);
    }

    public final Observable<ResponseSuccess> e(String str, String str2, t tVar) {
        int iC = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        int iC2 = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        int iC3 = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        return (Observable) a(iC2, -766009455, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), 766009459, new Object[]{this, str, str2, tVar}, iC, iC3);
    }

    public final Single<ab> a(String str, String str2) {
        int iC = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        int iC2 = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        int iC3 = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        return (Single) a(iC2, 1969968490, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), -1969968489, new Object[]{this, str, str2}, iC, iC3);
    }

    public final Single<ResponseSuccess> b(String str, String str2) {
        int iC = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        int iC2 = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        int iC3 = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        return (Single) a(iC2, -1155380694, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), 1155380706, new Object[]{this, str, str2}, iC, iC3);
    }

    private RequestBody b(RequestBody requestBody, j.b bVar) {
        int iC = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        int iC2 = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        int iC3 = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        return (RequestBody) a(iC2, -2062838864, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), 2062838872, new Object[]{this, requestBody, bVar}, iC, iC3);
    }

    private com.incode.welcome_sdk.data.remote.e.a a() {
        int iC = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        int iC2 = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        int iC3 = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        return (com.incode.welcome_sdk.data.remote.e.a) a(iC2, 1604477131, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), -1604477111, new Object[]{this}, iC, iC3);
    }
}
