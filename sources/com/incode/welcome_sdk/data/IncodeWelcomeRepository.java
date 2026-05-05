package com.incode.welcome_sdk.data;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.util.Pair;
import com.c.a.f;
import com.c.a.n;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.incode.welcome_sdk.CommonConfig;
import com.incode.welcome_sdk.IdCategory;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.IncodeWelcome$getWrappedDelayedOnboardingListener$1;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.SessionConfig;
import com.incode.welcome_sdk.commons.m;
import com.incode.welcome_sdk.commons.utils.BitmapUtils;
import com.incode.welcome_sdk.commons.utils.FaceProcessingUtils;
import com.incode.welcome_sdk.commons.utils.ae;
import com.incode.welcome_sdk.data.local.FaceInfo;
import com.incode.welcome_sdk.data.local.l;
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
import com.incode.welcome_sdk.data.remote.beans.s;
import com.incode.welcome_sdk.data.remote.beans.t;
import com.incode.welcome_sdk.data.remote.beans.u;
import com.incode.welcome_sdk.data.remote.beans.v;
import com.incode.welcome_sdk.data.remote.beans.w;
import com.incode.welcome_sdk.data.remote.beans.x;
import com.incode.welcome_sdk.data.remote.beans.y;
import com.incode.welcome_sdk.data.remote.beans.z;
import com.incode.welcome_sdk.data.remote.h;
import com.incode.welcome_sdk.data.remote.j;
import com.incode.welcome_sdk.modules.FaceMatch;
import com.incode.welcome_sdk.modules.IdScan;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.modules.SelfieScan;
import com.incode.welcome_sdk.results.EventResult;
import com.incode.welcome_sdk.results.IdProcessResult;
import com.incode.welcome_sdk.results.IdScanResult;
import com.incode.welcome_sdk.results.InterviewEventResult;
import com.incode.welcome_sdk.results.NfcScanResult;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType;
import com.incode.welcome_sdk.ui.camera.id_validation.helper.IdScanResultHelperKt;
import com.incode.welcome_sdk.ui.dynamic_forms.view.FormsSelectInputScreenKt;
import com.incode.welcome_sdk.ui.ekyb.EKYBForm;
import com.incode.welcome_sdk.ui.ekyc.EKYCForm;
import com.incode.welcome_sdk.ui.global_watchlist.GlobalWatchlistModel;
import com.incode.welcome_sdk.ui.id_capture.view.IdCaptureModuleScreenKt;
import com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt;
import com.incode.welcome_sdk.ui.id_info.IdInfoModel;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.PublishSubject;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import org.msgpack.core.MessagePack;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public class IncodeWelcomeRepository {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    public static final int RESULTS_POLL_MAX_COUNT = 7;

    /* JADX INFO: renamed from: t */
    private static int f7519t = 0;

    /* JADX INFO: renamed from: u */
    private static char f7520u = 0;

    /* JADX INFO: renamed from: v */
    private static int f7521v = 0;

    /* JADX INFO: renamed from: w */
    private static char[] f7522w = null;

    /* JADX INFO: renamed from: x */
    private static int f7523x = 0;

    /* JADX INFO: renamed from: b */
    private final h f7525b;

    /* JADX INFO: renamed from: d */
    private int f7527d;

    /* JADX INFO: renamed from: e */
    private final l f7528e;

    /* JADX INFO: renamed from: f */
    private boolean f7529f;

    /* JADX INFO: renamed from: g */
    private int f7530g;

    /* JADX INFO: renamed from: h */
    private boolean f7531h;

    /* JADX INFO: renamed from: i */
    private boolean f7532i;

    /* JADX INFO: renamed from: j */
    private boolean f7533j;

    /* JADX INFO: renamed from: k */
    private boolean f7534k;

    /* JADX INFO: renamed from: l */
    private boolean f7535l;

    /* JADX INFO: renamed from: m */
    private boolean f7536m;

    /* JADX INFO: renamed from: n */
    private ScreenName f7537n;

    /* JADX INFO: renamed from: o */
    private boolean f7538o;

    /* JADX INFO: renamed from: p */
    private boolean f7539p;

    /* JADX INFO: renamed from: q */
    private String f7540q;

    /* JADX INFO: renamed from: s */
    private Modules f7542s;

    /* JADX INFO: renamed from: c */
    private final boolean f7526c = false;

    /* JADX INFO: renamed from: a */
    private int f7524a = 1;

    /* JADX INFO: renamed from: r */
    private boolean f7541r = false;

    private static String $$c(int i2, byte b2, int i3) {
        byte[] bArr = $$a;
        int i4 = b2 + 4;
        int i5 = i3 * 2;
        int i6 = 121 - i2;
        byte[] bArr2 = new byte[i5 + 1];
        int i7 = -1;
        if (bArr == null) {
            i6 = (-i6) + i4;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i6;
            i4++;
            if (i7 == i5) {
                return new String(bArr2, 0);
            }
            i6 = (-bArr[i4]) + i6;
        }
    }

    public static /* synthetic */ Object b(int i2, Object[] objArr, int i3, int i4, int i5, int i6, int i7) throws Throwable {
        int i8 = (~(i6 | i3)) | i7;
        int i9 = i3 | i6 | i7;
        int i10 = ~i6;
        int i11 = i6 + i7 + i2 + ((-421447895) * i4) + ((-859425246) * i5);
        int i12 = i11 * i11;
        int i13 = (i6 * (-629045104)) + 1817116672 + ((-629045104) * i7) + (i8 * (-1407420559)) + ((-1407420559) * i9) + (1407420559 * i10) + ((-2036465664) * i2) + ((-2125594624) * i4) + (888930304 * i5) + (441384960 * i12);
        int i14 = (i6 * 1303038832) + 2077918271 + (i7 * 1303038832) + (i8 * (-49)) + (i9 * (-49)) + (i10 * 49) + (i2 * 1303038783) + (i4 * 1583617559) + (i5 * (-1102559138)) + (i12 * 510722048);
        switch (i13 + (i14 * i14 * 607191040)) {
            case 1:
                return d(objArr);
            case 2:
                return e(objArr);
            case 3:
                return a(objArr);
            case 4:
                return c(objArr);
            case 5:
                return i(objArr);
            case 6:
                return h(objArr);
            case 7:
                return f(objArr);
            case 8:
                return j(objArr);
            case 9:
                return g(objArr);
            case 10:
                return n(objArr);
            case 11:
                return m(objArr);
            case 12:
                IncodeWelcomeRepository incodeWelcomeRepository = (IncodeWelcomeRepository) objArr[0];
                bh bhVar = (bh) objArr[1];
                int i15 = 2 % 2;
                int i16 = f7523x + 9;
                f7521v = i16 % 128;
                int i17 = i16 % 2;
                incodeWelcomeRepository.c();
                incodeWelcomeRepository.setToken(bhVar.e());
                incodeWelcomeRepository.setInterviewId(bhVar.a());
                incodeWelcomeRepository.setInterviewCode(bhVar.b());
                incodeWelcomeRepository.setOptInEnabled(bhVar.k());
                Object[] objArr2 = {bhVar};
                incodeWelcomeRepository.setOptInCompanyName((String) bh.e(IncodeWelcome$getWrappedDelayedOnboardingListener$1.c(), IncodeWelcome$getWrappedDelayedOnboardingListener$1.c(), 1905909278, IncodeWelcome$getWrappedDelayedOnboardingListener$1.c(), objArr2, IncodeWelcome$getWrappedDelayedOnboardingListener$1.c(), -1905909278));
                int i18 = f7523x + 27;
                f7521v = i18 % 128;
                int i19 = i18 % 2;
                return null;
            case 13:
                return k(objArr);
            case 14:
                return l(objArr);
            case 15:
                return o(objArr);
            case 16:
                return q(objArr);
            case 17:
                return r(objArr);
            default:
                return b(objArr);
        }
    }

    static void init$0() {
        $$a = new byte[]{125, 126, MessagePack.Code.INT64, -128};
        $$b = 90;
    }

    private static void y(String str, int i2, int i3, boolean z2, int i4, Object[] objArr) throws Throwable {
        String str2 = str;
        int i5 = 2 % 2;
        int i6 = $11 + 111;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        n nVar = new n();
        char[] cArr2 = new char[i3];
        nVar.f2781b = 0;
        while (nVar.f2781b < i3) {
            int i8 = $11 + 41;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            nVar.f2782c = cArr[nVar.f2781b];
            cArr2[nVar.f2781b] = (char) (i4 + nVar.f2782c);
            int i10 = nVar.f2781b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i10]), Integer.valueOf(f7519t)};
                Object objC = com.c.a.e.e.c(2056116162);
                if (objC == null) {
                    byte b2 = (byte) (-1);
                    objC = com.c.a.e.e.e((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), TextUtils.getOffsetAfter("", 0) + 20, 902 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 2048382395, false, $$c((byte) 52, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i10] = ((Character) ((Method) objC).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objC2 = com.c.a.e.e.c(1507983255);
                if (objC2 == null) {
                    byte b3 = (byte) (-1);
                    objC2 = com.c.a.e.e.e((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 19 - (ViewConfiguration.getTouchSlop() >> 8), 279 - Process.getGidForName(""), 1501298158, false, $$c((byte) 51, b3, (byte) (b3 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objC2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i2 > 0) {
            nVar.f2780a = i2;
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr2, 0, cArr3, 0, i3);
            System.arraycopy(cArr3, 0, cArr2, i3 - nVar.f2780a, nVar.f2780a);
            System.arraycopy(cArr3, nVar.f2780a, cArr2, 0, i3 - nVar.f2780a);
        }
        if (z2) {
            char[] cArr4 = new char[i3];
            nVar.f2781b = 0;
            int i11 = $10 + 105;
            $11 = i11 % 128;
            while (true) {
                int i12 = i11 % 2;
                if (nVar.f2781b >= i3) {
                    break;
                }
                cArr4[nVar.f2781b] = cArr2[(i3 - nVar.f2781b) - 1];
                Object[] objArr4 = {nVar, nVar};
                Object objC3 = com.c.a.e.e.c(1507983255);
                if (objC3 == null) {
                    byte b4 = (byte) (-1);
                    objC3 = com.c.a.e.e.e((char) View.resolveSize(0, 0), 19 - (ViewConfiguration.getEdgeSlop() >> 16), Color.blue(0) + 280, 1501298158, false, $$c((byte) 51, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objC3).invoke(null, objArr4);
                i11 = $11 + 27;
                $10 = i11 % 128;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    @Inject
    public IncodeWelcomeRepository(l lVar, h hVar) {
        this.f7528e = lVar;
        this.f7525b = hVar;
    }

    public Single<bh> startOnboarding(String str, String str2, Map<String, String> map, String str3, String str4, String str5) {
        int i2 = 2 % 2;
        int i3 = f7523x + 73;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        Single<bh> singleDoOnSuccess = this.f7525b.b(str, str2, map, str3, str4, str5).doOnSuccess(new Consumer() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda18
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.i((bh) obj);
            }
        });
        int i5 = f7521v + 65;
        f7523x = i5 % 128;
        if (i5 % 2 == 0) {
            return singleDoOnSuccess;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Observable<ResponseAttachFlow> attachFlow(List<String> list, boolean z2) {
        Observable<ResponseAttachFlow> observableD;
        int i2 = 2 % 2;
        int i3 = f7521v + 9;
        f7523x = i3 % 128;
        if (i3 % 2 != 0) {
            observableD = this.f7525b.d(getToken(), list, z2);
            int i4 = 24 / 0;
        } else {
            observableD = this.f7525b.d(getToken(), list, z2);
        }
        int i5 = f7521v + 29;
        f7523x = i5 % 128;
        if (i5 % 2 == 0) {
            return observableD;
        }
        throw null;
    }

    public Observable<bh> resumeOnboarding() {
        int i2 = 2 % 2;
        int i3 = f7521v + 103;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        Observable<bh> observableDoOnNext = this.f7525b.c(getInterviewId(), getExternalId(), getExternalCustomerId(), getLanguage()).toObservable().doOnNext(new Consumer() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda14
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.g((bh) obj);
            }
        });
        int i5 = f7521v + 95;
        f7523x = i5 % 128;
        if (i5 % 2 == 0) {
            return observableDoOnNext;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object h(Object[] objArr) {
        IncodeWelcomeRepository incodeWelcomeRepository = (IncodeWelcomeRepository) objArr[0];
        bh bhVar = (bh) objArr[1];
        int i2 = 2 % 2;
        int i3 = f7523x + 69;
        f7521v = i3 % 128;
        if (i3 % 2 == 0) {
            incodeWelcomeRepository.setToken(bhVar.e());
            incodeWelcomeRepository.setInterviewId(bhVar.a());
            incodeWelcomeRepository.setInterviewCode(bhVar.b());
            incodeWelcomeRepository.setOptInEnabled(bhVar.k());
            int iC = IncodeWelcome$getWrappedDelayedOnboardingListener$1.c();
            int iC2 = IncodeWelcome$getWrappedDelayedOnboardingListener$1.c();
            int iC3 = IncodeWelcome$getWrappedDelayedOnboardingListener$1.c();
            incodeWelcomeRepository.setOptInCompanyName((String) bh.e(iC, IncodeWelcome$getWrappedDelayedOnboardingListener$1.c(), 1905909278, iC2, new Object[]{bhVar}, iC3, -1905909278));
            int i4 = 30 / 0;
            return null;
        }
        incodeWelcomeRepository.setToken(bhVar.e());
        incodeWelcomeRepository.setInterviewId(bhVar.a());
        incodeWelcomeRepository.setInterviewCode(bhVar.b());
        incodeWelcomeRepository.setOptInEnabled(bhVar.k());
        Object[] objArr2 = {bhVar};
        incodeWelcomeRepository.setOptInCompanyName((String) bh.e(IncodeWelcome$getWrappedDelayedOnboardingListener$1.c(), IncodeWelcome$getWrappedDelayedOnboardingListener$1.c(), 1905909278, IncodeWelcome$getWrappedDelayedOnboardingListener$1.c(), objArr2, IncodeWelcome$getWrappedDelayedOnboardingListener$1.c(), -1905909278));
        return null;
    }

    public Single<bh> resumeOnboardingSingle() {
        int i2 = 2 % 2;
        int i3 = f7521v + 95;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        Single<bh> singleDoOnSuccess = this.f7525b.c(getInterviewId(), getExternalId(), getExternalCustomerId(), getLanguage()).doOnSuccess(new Consumer() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda57
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.j((bh) obj);
            }
        });
        int i5 = f7521v + 67;
        f7523x = i5 % 128;
        int i6 = i5 % 2;
        return singleDoOnSuccess;
    }

    public /* synthetic */ void j(bh bhVar) throws Exception {
        int i2 = 2 % 2;
        int i3 = f7521v + 63;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        setToken(bhVar.e());
        setInterviewId(bhVar.a());
        setInterviewCode(bhVar.b());
        setOptInEnabled(bhVar.k());
        int iC = IncodeWelcome$getWrappedDelayedOnboardingListener$1.c();
        int iC2 = IncodeWelcome$getWrappedDelayedOnboardingListener$1.c();
        int iC3 = IncodeWelcome$getWrappedDelayedOnboardingListener$1.c();
        setOptInCompanyName((String) bh.e(iC, IncodeWelcome$getWrappedDelayedOnboardingListener$1.c(), 1905909278, iC2, new Object[]{bhVar}, iC3, -1905909278));
        int i5 = f7523x + 85;
        f7521v = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 55 / 0;
        }
    }

    public int getNfcScanAttemptCount() {
        int i2 = 2 % 2;
        int i3 = f7521v + 79;
        int i4 = i3 % 128;
        f7523x = i4;
        int i5 = i3 % 2;
        int i6 = this.f7524a;
        int i7 = i4 + 57;
        f7521v = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public void incNfcScanAttemptCount() {
        int i2 = 2 % 2;
        int i3 = f7523x;
        int i4 = i3 + 9;
        f7521v = i4 % 128;
        int i5 = i4 % 2;
        this.f7524a++;
        int i6 = i3 + 37;
        f7521v = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 96 / 0;
        }
    }

    public boolean canRetryNfcScan() {
        int i2 = 2 % 2;
        if (this.f7524a > getNfcMaxRetries()) {
            return false;
        }
        int i3 = f7521v;
        int i4 = i3 + 109;
        f7523x = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 107;
        f7523x = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void clearNfcScanAttemptCount() {
        int i2 = 2 % 2;
        int i3 = f7521v + 37;
        int i4 = i3 % 128;
        f7523x = i4;
        this.f7524a = i3 % 2 != 0 ? 0 : 1;
        int i5 = i4 + 105;
        f7521v = i5 % 128;
        int i6 = i5 % 2;
    }

    public int getEditOcrViewsCount() {
        int i2 = 2 % 2;
        int i3 = f7521v + 19;
        int i4 = i3 % 128;
        f7523x = i4;
        int i5 = i3 % 2;
        int i6 = this.f7530g;
        int i7 = i4 + 5;
        f7521v = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 76 / 0;
        }
        return i6;
    }

    public void incEditOcrViewsCount() {
        int i2 = 2 % 2;
        int i3 = f7523x;
        int i4 = i3 + 73;
        f7521v = i4 % 128;
        int i5 = i4 % 2;
        this.f7530g++;
        int i6 = i3 + 121;
        f7521v = i6 % 128;
        int i7 = i6 % 2;
    }

    private static void z(String str, byte b2, int i2, Object[] objArr) throws Throwable {
        int i3;
        String str2 = str;
        int i4 = 2 % 2;
        int i5 = $11 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        int i6 = i5 % 128;
        $10 = i6;
        int i7 = i5 % 2;
        Object charArray = str2;
        if (str2 != null) {
            int i8 = i6 + 11;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        f fVar = new f();
        char[] cArr2 = f7522w;
        int i10 = 1768797182;
        float f2 = 0.0f;
        if (cArr2 != null) {
            int i11 = $10 + 71;
            int i12 = i11 % 128;
            $11 = i12;
            int i13 = i11 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i14 = i12 + 77;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            int i16 = 0;
            while (i16 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i16])};
                    Object objC = com.c.a.e.e.c(i10);
                    if (objC == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 - 1);
                        objC = com.c.a.e.e.e((char) (29971 - (TypedValue.complexToFraction(0, f2, f2) > f2 ? 1 : (TypedValue.complexToFraction(0, f2, f2) == f2 ? 0 : -1))), Color.alpha(0) + 18, 828 - (Process.myTid() >> 22), 1777840519, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i16] = ((Character) ((Method) objC).invoke(null, objArr2)).charValue();
                    i16++;
                    i10 = 1768797182;
                    f2 = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(f7520u)};
        Object objC2 = com.c.a.e.e.c(1768797182);
        char c2 = '\b';
        if (objC2 == null) {
            byte b5 = (byte) 0;
            byte b6 = (byte) (b5 - 1);
            objC2 = com.c.a.e.e.e((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 29970), (ViewConfiguration.getWindowTouchSlop() >> 8) + 18, 828 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1777840519, false, $$c(b5, b6, (byte) (b6 + 1)), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objC2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i2];
        if (i2 % 2 != 0) {
            i3 = i2 - 1;
            cArr4[i3] = (char) (cArr[i3] - b2);
        } else {
            i3 = i2;
        }
        if (i3 > 1) {
            fVar.f2749e = 0;
            while (fVar.f2749e < i3) {
                fVar.f2747c = cArr[fVar.f2749e];
                fVar.f2746b = cArr[fVar.f2749e + 1];
                if (fVar.f2747c == fVar.f2746b) {
                    cArr4[fVar.f2749e] = (char) (fVar.f2747c - b2);
                    cArr4[fVar.f2749e + 1] = (char) (fVar.f2746b - b2);
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = fVar;
                    objArr4[11] = Integer.valueOf(cCharValue);
                    objArr4[10] = fVar;
                    objArr4[9] = fVar;
                    objArr4[c2] = Integer.valueOf(cCharValue);
                    objArr4[7] = fVar;
                    objArr4[6] = fVar;
                    objArr4[5] = Integer.valueOf(cCharValue);
                    objArr4[4] = fVar;
                    objArr4[3] = fVar;
                    objArr4[2] = Integer.valueOf(cCharValue);
                    objArr4[1] = fVar;
                    objArr4[0] = fVar;
                    Object objC3 = com.c.a.e.e.c(1369381351);
                    if (objC3 == null) {
                        byte b7 = (byte) 3;
                        byte b8 = (byte) (b7 - 4);
                        objC3 = com.c.a.e.e.e((char) (49571 - ExpandableListView.getPackedPositionChild(0L)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 20, 1222 - ((Process.getThreadPriority(0) + 20) >> 6), 1359289246, false, $$c(b7, b8, (byte) (b8 + 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objC3).invoke(null, objArr4)).intValue() == fVar.f2750f) {
                        Object[] objArr5 = {fVar, fVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), fVar, fVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), fVar, Integer.valueOf(cCharValue), fVar};
                        Object objC4 = com.c.a.e.e.c(-486756316);
                        if (objC4 == null) {
                            byte b9 = (byte) 1;
                            byte b10 = (byte) (-b9);
                            c2 = '\b';
                            objC4 = com.c.a.e.e.e((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 27451), 19 - (ViewConfiguration.getKeyRepeatDelay() >> 16), ExpandableListView.getPackedPositionType(0L) + 392, -496586147, false, $$c(b9, b10, (byte) (b10 + 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            c2 = '\b';
                        }
                        int iIntValue = ((Integer) ((Method) objC4).invoke(null, objArr5)).intValue();
                        int i17 = (fVar.f2745a * cCharValue) + fVar.f2750f;
                        cArr4[fVar.f2749e] = cArr2[iIntValue];
                        cArr4[fVar.f2749e + 1] = cArr2[i17];
                    } else {
                        c2 = '\b';
                        if (fVar.f2748d == fVar.f2745a) {
                            int i18 = $11 + 37;
                            $10 = i18 % 128;
                            int i19 = i18 % 2;
                            fVar.f2751h = ((fVar.f2751h + cCharValue) - 1) % cCharValue;
                            fVar.f2750f = ((fVar.f2750f + cCharValue) - 1) % cCharValue;
                            int i20 = (fVar.f2748d * cCharValue) + fVar.f2751h;
                            int i21 = (fVar.f2745a * cCharValue) + fVar.f2750f;
                            cArr4[fVar.f2749e] = cArr2[i20];
                            cArr4[fVar.f2749e + 1] = cArr2[i21];
                        } else {
                            int i22 = (fVar.f2748d * cCharValue) + fVar.f2750f;
                            int i23 = (fVar.f2745a * cCharValue) + fVar.f2751h;
                            cArr4[fVar.f2749e] = cArr2[i22];
                            cArr4[fVar.f2749e + 1] = cArr2[i23];
                        }
                    }
                }
                fVar.f2749e += 2;
            }
        }
        for (int i24 = 0; i24 < i2; i24++) {
            cArr4[i24] = (char) (cArr4[i24] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    public void clearEditOcrViewsCount() {
        int i2 = 2 % 2;
        int i3 = f7523x + 121;
        int i4 = i3 % 128;
        f7521v = i4;
        if (i3 % 2 == 0) {
            this.f7530g = 1;
        } else {
            this.f7530g = 0;
        }
        int i5 = i4 + 39;
        f7523x = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 57 / 0;
        }
    }

    private void b() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f7521v + 95;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        setFullName(null);
        setFirstName(null);
        setMiddleName(null);
        setLastName(null);
        setGivenNameMrz(null);
        setLastNameMrz(null);
        setGender(null);
        setAddress(null);
        setState(null);
        setCity(null);
        setPostalCode(null);
        setStreet(null);
        setBirthDate(null);
        setIssuingCountry(null);
        setCurp(null);
        setDocumentNumber(null);
        setExpireAt(null);
        setIdCic(null);
        setPoaState(null);
        setPoaCity(null);
        setPoaPostalCode(null);
        setPoaStreet(null);
        int i5 = f7523x + 31;
        f7521v = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void clearLocalData() {
        int i2 = 2 % 2;
        int i3 = f7521v + 93;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        c();
        setCustomerToken(null);
        setPrefilledPhoneNumber(null);
        int i5 = f7521v + 67;
        f7523x = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 24 / 0;
        }
    }

    private void c() throws Throwable {
        int i2 = 2 % 2;
        setToken(null);
        setInterviewId(null);
        setInterviewCode(null);
        setLanguage(null);
        i();
        b();
        m.a();
        File[] fileArrListFiles = getImagesDirectory().listFiles();
        int length = fileArrListFiles.length;
        int i3 = 0;
        while (i3 < length) {
            int i4 = f7523x + 23;
            f7521v = i4 % 128;
            int i5 = i4 % 2;
            fileArrListFiles[i3].delete();
            i3++;
            int i6 = f7521v + 29;
            f7523x = i6 % 128;
            int i7 = i6 % 2;
        }
        f();
        int iA = IdCaptureModuleScreenKt.d.a();
        b(IdCaptureModuleScreenKt.d.a(), new Object[]{this}, iA, IdCaptureModuleScreenKt.d.a(), IdCaptureModuleScreenKt.d.a(), 444352694, -444352691);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0017, code lost:
    
        if (getInterviewId() == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0019, code lost:
    
        r1 = com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7523x + 79;
        com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7521v = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0022, code lost:
    
        if ((r1 % 2) != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0024, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x002b, code lost:
    
        if (getInterviewId() == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0032, code lost:
    
        if (getToken() != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0034, code lost:
    
        r1 = com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7523x + 51;
        r0 = r1 % 128;
        com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7521v = r0;
        r1 = r1 % 2;
        r1 = r0 + 3;
        com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7523x = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0044, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0045, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a() {
        /*
            r5 = this;
            r4 = 2
            int r0 = r4 % r4
            int r0 = com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7521v
            int r1 = r0 + 49
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7523x = r0
            int r1 = r1 % r4
            r3 = 1
            r2 = 0
            if (r1 == 0) goto L27
            java.lang.String r1 = r5.getInterviewId()
            r0 = 67
            int r0 = r0 / r2
            if (r1 != 0) goto L2e
        L19:
            int r0 = com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7523x
            int r1 = r0 + 79
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7521v = r0
            int r1 = r1 % r4
            if (r1 != 0) goto L25
        L24:
            return r3
        L25:
            r3 = r2
            goto L24
        L27:
            java.lang.String r0 = r5.getInterviewId()
            if (r0 != 0) goto L2e
            goto L19
        L2e:
            java.lang.String r0 = r5.getToken()
            if (r0 != 0) goto L45
            int r0 = com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7523x
            int r1 = r0 + 51
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7521v = r0
            int r1 = r1 % r4
            int r1 = r0 + 3
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7523x = r0
            int r1 = r1 % r4
            return r3
        L45:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.IncodeWelcomeRepository.a():boolean");
    }

    public /* synthetic */ SingleSource l(String str, bh bhVar) throws Exception {
        int i2 = 2 % 2;
        int i3 = f7523x + 113;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        Single<ab> singleCreateOpenTokSession = createOpenTokSession(str);
        int i5 = f7521v + 81;
        f7523x = i5 % 128;
        if (i5 % 2 == 0) {
            return singleCreateOpenTokSession;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Single<ab> createOpenTokSession(final String str) {
        int i2 = 2 % 2;
        if (!a()) {
            Single<ab> singleD = this.f7525b.d(getToken(), str);
            int i3 = f7521v + 33;
            f7523x = i3 % 128;
            int i4 = i3 % 2;
            return singleD;
        }
        Single singleFlatMap = resumeOnboarding().singleOrError().flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda6
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.l(str, (bh) obj);
            }
        });
        int i5 = f7521v + 65;
        f7523x = i5 % 128;
        if (i5 % 2 == 0) {
            return singleFlatMap;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object i(Object[] objArr) {
        IncodeWelcomeRepository incodeWelcomeRepository = (IncodeWelcomeRepository) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        String str3 = (String) objArr[3];
        int i2 = 2 % 2;
        int i3 = f7521v + 111;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        Single<ResponseSuccess> singleStartOpenTokStreamRecording = incodeWelcomeRepository.startOpenTokStreamRecording(str, str2, str3);
        int i5 = f7523x + 111;
        f7521v = i5 % 128;
        if (i5 % 2 != 0) {
            return singleStartOpenTokStreamRecording;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0016, code lost:
    
        if (a() != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0029, code lost:
    
        return resumeOnboarding().singleOrError().flatMap(new com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda47(r4, r5, r6, r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002e, code lost:
    
        if (a() != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        r2 = r4.f7525b.a(getToken(), r5, r6, r7);
        r1 = com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7523x + 15;
        com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7521v = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public io.reactivex.Single<com.incode.welcome_sdk.data.remote.beans.ResponseSuccess> startOpenTokStreamRecording(final java.lang.String r5, final java.lang.String r6, final java.lang.String r7) {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7523x
            int r1 = r0 + 31
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7521v = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L2a
            boolean r1 = r4.a()
            r0 = 34
            int r0 = r0 / 0
            if (r1 == 0) goto L31
        L18:
            io.reactivex.Observable r0 = r4.resumeOnboarding()
            io.reactivex.Single r1 = r0.singleOrError()
            com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda47 r0 = new com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda47
            r0.<init>()
            io.reactivex.Single r0 = r1.flatMap(r0)
            return r0
        L2a:
            boolean r0 = r4.a()
            if (r0 == 0) goto L31
            goto L18
        L31:
            com.incode.welcome_sdk.data.remote.h r1 = r4.f7525b
            java.lang.String r0 = r4.getToken()
            io.reactivex.Single r2 = r1.a(r0, r5, r6, r7)
            int r0 = com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7523x
            int r1 = r0 + 15
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7521v = r0
            int r1 = r1 % r3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.IncodeWelcomeRepository.startOpenTokStreamRecording(java.lang.String, java.lang.String, java.lang.String):io.reactivex.Single");
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        IncodeWelcomeRepository incodeWelcomeRepository = (IncodeWelcomeRepository) objArr[0];
        String str = (String) objArr[1];
        final Function0 function0 = (Function0) objArr[2];
        int i2 = 2 % 2;
        int i3 = f7523x + 5;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr2 = {incodeWelcomeRepository.f7525b, incodeWelcomeRepository.getToken(), str};
        int iC = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        Single singleDoOnSubscribe = ((Single) h.a(IdCaptureModuleScreenKt.e.AnonymousClass2.c(), -1155380694, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), 1155380706, objArr2, iC, IdCaptureModuleScreenKt.e.AnonymousClass2.c())).doOnSubscribe(new Consumer() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda77
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                IncodeWelcomeRepository.a(function0, (Disposable) obj);
            }
        });
        int i5 = f7521v + 47;
        f7523x = i5 % 128;
        if (i5 % 2 == 0) {
            return singleDoOnSubscribe;
        }
        throw null;
    }

    public static /* synthetic */ void a(Function0 function0, Disposable disposable) throws Exception {
        int i2 = 2 % 2;
        int i3 = f7521v + 101;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        function0.invoke();
        int i5 = f7521v + 39;
        f7523x = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 32 / 0;
        }
    }

    public Single<ResponseSuccess> stopOpenTokStreamRecording(final String str, final Function0<Unit> function0) {
        int i2 = 2 % 2;
        int i3 = f7521v + 87;
        f7523x = i3 % 128;
        if (i3 % 2 == 0) {
            if (!(!a())) {
                Single singleFlatMap = resumeOnboarding().singleOrError().flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda58
                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj) {
                        return this.f$0.b(str, function0, (bh) obj);
                    }
                });
                int i4 = f7521v + 101;
                f7523x = i4 % 128;
                int i5 = i4 % 2;
                return singleFlatMap;
            }
            return ((Single) h.a(IdCaptureModuleScreenKt.e.AnonymousClass2.c(), -1155380694, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), 1155380706, new Object[]{this.f7525b, getToken(), str}, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), IdCaptureModuleScreenKt.e.AnonymousClass2.c())).doOnSubscribe(new Consumer() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda59
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    IncodeWelcomeRepository.c(function0, (Disposable) obj);
                }
            });
        }
        a();
        throw null;
    }

    public static /* synthetic */ void c(Function0 function0, Disposable disposable) throws Exception {
        int i2 = 2 % 2;
        int i3 = f7523x + 15;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        function0.invoke();
        int i5 = f7521v + 17;
        f7523x = i5 % 128;
        int i6 = i5 % 2;
    }

    public Single<ab> createOpenTokSessionAuth(String str, String str2) {
        int i2 = 2 % 2;
        int i3 = f7523x + 53;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.f7525b, str, str2};
        int iC = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        Single<ab> single = (Single) h.a(IdCaptureModuleScreenKt.e.AnonymousClass2.c(), 1969968490, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), -1969968489, objArr, iC, IdCaptureModuleScreenKt.e.AnonymousClass2.c());
        int i5 = f7521v + 33;
        f7523x = i5 % 128;
        if (i5 % 2 == 0) {
            return single;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Single<ResponseSuccess> startOpenTokStreamRecordingAuth(String str, String str2, String str3, String str4) {
        int i2 = 2 % 2;
        int i3 = f7521v + 71;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        Single<ResponseSuccess> singleE = this.f7525b.e(str, str2, str3, str4);
        int i5 = f7523x + 35;
        f7521v = i5 % 128;
        int i6 = i5 % 2;
        return singleE;
    }

    public Single<ResponseSuccess> stopOpenTokStreamRecordingAuth(String str, String str2, final Function0<Unit> function0) {
        int i2 = 2 % 2;
        int i3 = f7521v + 97;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        Single<ResponseSuccess> singleDoOnSubscribe = this.f7525b.e(str, str2).doOnSubscribe(new Consumer() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda7
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                IncodeWelcomeRepository.e(function0, (Disposable) obj);
            }
        });
        int i5 = f7521v + 111;
        f7523x = i5 % 128;
        int i6 = i5 % 2;
        return singleDoOnSubscribe;
    }

    public static /* synthetic */ void e(Function0 function0, Disposable disposable) throws Exception {
        int i2 = 2 % 2;
        int i3 = f7523x + 115;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        function0.invoke();
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = f7521v + 99;
        f7523x = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object m(Object[] objArr) {
        IncodeWelcomeRepository incodeWelcomeRepository = (IncodeWelcomeRepository) objArr[0];
        String str = (String) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[3]).booleanValue();
        int i2 = 2 % 2;
        int i3 = f7521v + 83;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        Observable<ResponseSuccess> observableAddPhone = incodeWelcomeRepository.addPhone(str, zBooleanValue, zBooleanValue2);
        int i5 = f7523x + 121;
        f7521v = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 59 / 0;
        }
        return observableAddPhone;
    }

    public Observable<ResponseSuccess> addPhone(final String str, final boolean z2, final boolean z3) {
        int i2 = 2 % 2;
        int i3 = f7521v + 103;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        if (a()) {
            int i5 = f7521v + 117;
            f7523x = i5 % 128;
            int i6 = i5 % 2;
            return resumeOnboarding().flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda21
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.f$0.c(str, z2, z3, (bh) obj);
                }
            });
        }
        return this.f7525b.c(getToken(), str, z2, z3);
    }

    public /* synthetic */ ObservableSource b(t tVar, bh bhVar) throws Exception {
        int i2 = 2 % 2;
        int i3 = f7523x + 79;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        Observable<ResponseSuccess> observableSendOtp = sendOtp(tVar);
        int i5 = f7521v + 123;
        f7523x = i5 % 128;
        if (i5 % 2 == 0) {
            return observableSendOtp;
        }
        throw null;
    }

    public Observable<ResponseSuccess> sendOtp(final t tVar) {
        int i2 = 2 % 2;
        int i3 = f7521v + 105;
        f7523x = i3 % 128;
        if (i3 % 2 == 0) {
            if (a()) {
                return resumeOnboarding().flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda51
                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj) {
                        return this.f$0.b(tVar, (bh) obj);
                    }
                });
            }
            Observable<ResponseSuccess> observableA = this.f7525b.a(getToken(), tVar);
            int i4 = f7521v + 109;
            f7523x = i4 % 128;
            int i5 = i4 % 2;
            return observableA;
        }
        a();
        throw null;
    }

    public /* synthetic */ ObservableSource a(String str, t tVar, bh bhVar) throws Exception {
        int i2 = 2 % 2;
        int i3 = f7521v + 53;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        Observable<ResponseSuccess> observableCompareOtp = compareOtp(str, tVar);
        int i5 = f7521v + 7;
        f7523x = i5 % 128;
        if (i5 % 2 == 0) {
            return observableCompareOtp;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Observable<ResponseSuccess> compareOtp(final String str, final t tVar) {
        int i2 = 2 % 2;
        int i3 = f7521v + 79;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        if (a()) {
            int i5 = f7523x + 3;
            f7521v = i5 % 128;
            if (i5 % 2 != 0) {
                return resumeOnboarding().flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda5
                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj) {
                        return this.f$0.a(str, tVar, (bh) obj);
                    }
                });
            }
            resumeOnboarding().flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda5
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.f$0.a(str, tVar, (bh) obj);
                }
            });
            throw null;
        }
        Object[] objArr = {this.f7525b, getToken(), str, tVar};
        int iC = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        return (Observable) h.a(IdCaptureModuleScreenKt.e.AnonymousClass2.c(), -766009455, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), 766009459, objArr, iC, IdCaptureModuleScreenKt.e.AnonymousClass2.c());
    }

    public /* synthetic */ ObservableSource b(String str, boolean z2, bh bhVar) throws Exception {
        int i2 = 2 % 2;
        int i3 = f7523x + 17;
        f7521v = i3 % 128;
        if (i3 % 2 != 0) {
            return addEmail(str, z2);
        }
        addEmail(str, z2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Observable<ResponseSuccess> addEmail(final String str, final boolean z2) {
        int i2 = 2 % 2;
        int i3 = f7523x + 5;
        f7521v = i3 % 128;
        if (i3 % 2 != 0) {
            if (a()) {
                int i4 = f7521v + 9;
                f7523x = i4 % 128;
                int i5 = i4 % 2;
                return resumeOnboarding().flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda8
                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj) {
                        return this.f$0.b(str, z2, (bh) obj);
                    }
                });
            }
            Observable<ResponseSuccess> observableD = this.f7525b.d(getToken(), str, z2);
            int i6 = f7521v + 15;
            f7523x = i6 % 128;
            int i7 = i6 % 2;
            return observableD;
        }
        a();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object l(Object[] objArr) {
        IncodeWelcomeRepository incodeWelcomeRepository = (IncodeWelcomeRepository) objArr[0];
        String str = (String) objArr[1];
        int i2 = 2 % 2;
        int i3 = f7523x + 33;
        f7521v = i3 % 128;
        if (i3 % 2 == 0) {
            incodeWelcomeRepository.addName(str);
            throw null;
        }
        Observable<ResponseSuccess> observableAddName = incodeWelcomeRepository.addName(str);
        int i4 = f7521v + 79;
        f7523x = i4 % 128;
        int i5 = i4 % 2;
        return observableAddName;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0016, code lost:
    
        if (a() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0018, code lost:
    
        r2 = resumeOnboarding().flatMap(new com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda61(r4, r5));
        r1 = com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7521v + 55;
        com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7523x = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        if (a() != true) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
    
        return r4.f7525b.c(getToken(), r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public io.reactivex.Observable<com.incode.welcome_sdk.data.remote.beans.ResponseSuccess> addName(final java.lang.String r5) {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7521v
            int r1 = r0 + 65
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7523x = r0
            int r1 = r1 % r3
            if (r1 == 0) goto L2f
            boolean r1 = r4.a()
            r0 = 15
            int r0 = r0 / 0
            if (r1 == 0) goto L36
        L18:
            io.reactivex.Observable r1 = r4.resumeOnboarding()
            com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda61 r0 = new com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda61
            r0.<init>()
            io.reactivex.Observable r2 = r1.flatMap(r0)
            int r0 = com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7521v
            int r1 = r0 + 55
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7523x = r0
            int r1 = r1 % r3
            return r2
        L2f:
            boolean r1 = r4.a()
            r0 = 1
            if (r1 == r0) goto L18
        L36:
            com.incode.welcome_sdk.data.remote.h r1 = r4.f7525b
            java.lang.String r0 = r4.getToken()
            io.reactivex.Observable r0 = r1.c(r0, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.IncodeWelcomeRepository.addName(java.lang.String):io.reactivex.Observable");
    }

    public Single<ac> sendDeviceInfo() {
        int i2 = 2 % 2;
        int i3 = f7523x + 5;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        Single<ac> singleDefer = Single.defer(new Callable() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda43
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f$0.k();
            }
        });
        int i5 = f7523x + 123;
        f7521v = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 40 / 0;
        }
        return singleDefer;
    }

    public /* synthetic */ SingleSource k() throws Exception {
        int i2 = 2 % 2;
        int i3 = f7523x + 113;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        h hVar = this.f7525b;
        if (i4 != 0) {
            return hVar.a(getToken(), getDeviceFingerprint());
        }
        hVar.a(getToken(), getDeviceFingerprint());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Observable<ResponseSuccess> deleteUser(String str) {
        Observable<ResponseSuccess> observableF;
        int i2 = 2 % 2;
        int i3 = f7521v + 109;
        f7523x = i3 % 128;
        if (i3 % 2 != 0) {
            observableF = this.f7525b.f(getToken(), str);
            int i4 = 23 / 0;
        } else {
            observableF = this.f7525b.f(getToken(), str);
        }
        int i5 = f7523x + 29;
        f7521v = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 16 / 0;
        }
        return observableF;
    }

    public Observable<ResponseSuccess> deleteCustomer(String str) {
        int i2 = 2 % 2;
        int i3 = f7521v + 113;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        h hVar = this.f7525b;
        if (i4 == 0) {
            return hVar.n(getToken(), str);
        }
        hVar.n(getToken(), str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Observable<ResponseSuccess> bankAccountLogin(String str, String str2, String str3) {
        int i2 = 2 % 2;
        int i3 = f7523x + 29;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        h hVar = this.f7525b;
        if (i4 != 0) {
            Object[] objArr = {hVar, getToken(), str, str2, str3};
            int iC = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
            return (Observable) h.a(IdCaptureModuleScreenKt.e.AnonymousClass2.c(), 32531939, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), -32531932, objArr, iC, IdCaptureModuleScreenKt.e.AnonymousClass2.c());
        }
        Object[] objArr2 = {hVar, getToken(), str, str2, str3};
        int iC2 = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object q(Object[] objArr) {
        IncodeWelcomeRepository incodeWelcomeRepository = (IncodeWelcomeRepository) objArr[0];
        String str = (String) objArr[1];
        int i2 = 2 % 2;
        int i3 = f7521v + 5;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        Observable<ResponseSuccess> observableAddDocumentId = incodeWelcomeRepository.addDocumentId(str);
        int i5 = f7521v + 95;
        f7523x = i5 % 128;
        if (i5 % 2 == 0) {
            return observableAddDocumentId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Observable<ResponseSuccess> addDocumentId(final String str) {
        int i2 = 2 % 2;
        int i3 = f7523x + 95;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        if (!(!a())) {
            int i5 = f7523x + 107;
            f7521v = i5 % 128;
            int i6 = i5 % 2;
            return resumeOnboarding().flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda56
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.f$0.f(str, (bh) obj);
                }
            });
        }
        Observable<ResponseSuccess> observable = (Observable) h.a(IdCaptureModuleScreenKt.e.AnonymousClass2.c(), -1452334977, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), 1452334991, new Object[]{this.f7525b, getToken(), str}, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), IdCaptureModuleScreenKt.e.AnonymousClass2.c());
        int i7 = f7523x + 111;
        f7521v = i7 % 128;
        if (i7 % 2 != 0) {
            return observable;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ ObservableSource h(String str, bh bhVar) throws Exception {
        int i2 = 2 % 2;
        int i3 = f7523x + 29;
        f7521v = i3 % 128;
        if (i3 % 2 != 0) {
            return addQrCodeText(str);
        }
        addQrCodeText(str);
        throw null;
    }

    public Observable<ResponseSuccess> addQrCodeText(final String str) {
        int i2 = 2 % 2;
        int i3 = f7521v + 123;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        if (a()) {
            int i5 = f7521v + 19;
            f7523x = i5 % 128;
            if (i5 % 2 == 0) {
                return resumeOnboarding().flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda41
                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj) {
                        return this.f$0.h(str, (bh) obj);
                    }
                });
            }
            int i6 = 56 / 0;
            return resumeOnboarding().flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda41
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.f$0.h(str, (bh) obj);
                }
            });
        }
        return this.f7525b.o(getToken(), str);
    }

    private static /* synthetic */ Object g(Object[] objArr) {
        Observable<bc> observableOnErrorResumeNext;
        IncodeWelcomeRepository incodeWelcomeRepository = (IncodeWelcomeRepository) objArr[0];
        bt btVar = (bt) objArr[1];
        String str = (String) objArr[2];
        int i2 = 2 % 2;
        int i3 = f7523x + 49;
        f7521v = i3 % 128;
        if (i3 % 2 == 0) {
            observableOnErrorResumeNext = incodeWelcomeRepository.f7525b.c(str, btVar).onErrorResumeNext(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda0
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return IncodeWelcomeRepository.e((Throwable) obj);
                }
            });
            int i4 = 60 / 0;
        } else {
            observableOnErrorResumeNext = incodeWelcomeRepository.f7525b.c(str, btVar).onErrorResumeNext(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda0
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return IncodeWelcomeRepository.e((Throwable) obj);
                }
            });
        }
        int i5 = f7523x + 33;
        f7521v = i5 % 128;
        if (i5 % 2 != 0) {
            return observableOnErrorResumeNext;
        }
        throw null;
    }

    public Observable<bc> sendFrontIdScan(final bt btVar) {
        int i2 = 2 % 2;
        int i3 = f7523x + 81;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        Observable<bc> observable = (Observable) b(IdCaptureModuleScreenKt.d.a(), new Object[]{this, new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda24
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.a(btVar, (String) obj);
            }
        }}, IdCaptureModuleScreenKt.d.a(), IdCaptureModuleScreenKt.d.a(), IdCaptureModuleScreenKt.d.a(), 1039237223, -1039237206);
        int i5 = f7521v + 51;
        f7523x = i5 % 128;
        int i6 = i5 % 2;
        return observable;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ io.reactivex.ObservableSource e(java.lang.Throwable r5) throws java.lang.Exception {
        /*
            r4 = 2
            int r0 = r4 % r4
            int r0 = com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7521v
            int r1 = r0 + 59
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7523x = r0
            int r1 = r1 % r4
            r3 = 0
            if (r1 == 0) goto L22
            boolean r1 = r5 instanceof retrofit2.HttpException
            r0 = 36
            int r0 = r0 / r3
            if (r1 == 0) goto L7e
        L16:
            r2 = r5
            retrofit2.HttpException r2 = (retrofit2.HttpException) r2
            int r1 = r2.code()
            r0 = 400(0x190, float:5.6E-43)
            if (r1 != r0) goto L7e
            goto L27
        L22:
            boolean r0 = r5 instanceof retrofit2.HttpException
            if (r0 == 0) goto L7e
            goto L16
        L27:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L76
            retrofit2.Response r0 = r2.response()     // Catch: java.lang.Exception -> L76
            okhttp3.ResponseBody r0 = r0.errorBody()     // Catch: java.lang.Exception -> L76
            java.lang.String r0 = r0.string()     // Catch: java.lang.Exception -> L76
            r1.<init>(r0)     // Catch: java.lang.Exception -> L76
            java.lang.String r0 = "status"
            int r1 = r1.optInt(r0)     // Catch: java.lang.Exception -> L76
            r0 = 4019(0xfb3, float:5.632E-42)
            if (r1 != r0) goto L7e
            int r0 = com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7521v
            int r1 = r0 + 33
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7523x = r0
            int r1 = r1 % r4
            if (r1 == 0) goto L4f
            goto L59
        L4f:
            com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda15 r0 = new com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda15     // Catch: java.lang.Exception -> L76
            r0.<init>()     // Catch: java.lang.Exception -> L76
            io.reactivex.Observable r2 = io.reactivex.Observable.error(r0)     // Catch: java.lang.Exception -> L76
            goto L65
        L59:
            com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda15 r0 = new com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda15     // Catch: java.lang.Exception -> L76
            r0.<init>()     // Catch: java.lang.Exception -> L76
            io.reactivex.Observable r2 = io.reactivex.Observable.error(r0)     // Catch: java.lang.Exception -> L76
            r0 = 27
            int r0 = r0 / r3
        L65:
            int r0 = com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7521v
            int r1 = r0 + 1
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7523x = r0
            int r1 = r1 % r4
            if (r1 == 0) goto L73
            r0 = 92
            int r0 = r0 / r3
        L73:
            return r2
        L74:
            r0 = move-exception
            throw r0
        L76:
            r2 = move-exception
            java.lang.String r1 = "Couldn't parse error"
            java.lang.Object[] r0 = new java.lang.Object[r3]
            timber.log.Timber.e(r2, r1, r0)
        L7e:
            java.lang.Throwable r0 = r5.getCause()
            if (r0 == 0) goto L9d
            java.lang.Throwable r0 = r5.getCause()
            io.reactivex.Observable r2 = io.reactivex.Observable.error(r0)
            int r0 = com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7521v
            int r1 = r0 + 113
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7523x = r0
            int r1 = r1 % r4
            if (r1 != 0) goto L98
            return r2
        L98:
            r0 = 0
            r0.hashCode()
            throw r0
        L9d:
            io.reactivex.Observable r0 = io.reactivex.Observable.error(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.IncodeWelcomeRepository.e(java.lang.Throwable):io.reactivex.ObservableSource");
    }

    public String saveFaceCrop(String str, boolean z2) throws Throwable {
        String strIntern;
        int i2 = 2 % 2;
        if (str == null || str.isEmpty()) {
            int i3 = f7521v + 41;
            f7523x = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        Bitmap bitmapDecodeByteArray = BitmapUtils.decodeByteArray(Base64.decode(str, 0), 600, 600);
        File imagesDirectory = getImagesDirectory();
        if (z2) {
            Object[] objArr = new Object[1];
            y("\ufffb\ufff9\ufffe\ufff7\f\u0006\u0007\n\ufffe\ufff7￼\u0001\ufff7￼\u0006\u0007\ufffb�\u000b\b\u0007\n\ufffb\ufff7�", 19 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), Color.red(0) + 25, true, KeyEvent.getDeadChar(0, 0) + 110, objArr);
            strIntern = ((String) objArr[0]).intern();
            int i5 = f7523x + 47;
            f7521v = i5 % 128;
            int i6 = i5 % 2;
        } else {
            Object[] objArr2 = new Object[1];
            z("\f\u0011\u0013\u000e\u0002\u0016\u0017\u000f\u0013\u000e\u0001\u0018\u0018\r\u0016\u0017\u0012\f", (byte) (103 - TextUtils.lastIndexOf("", '0', 0, 0)), TextUtils.indexOf("", "", 0) + 18, objArr2);
            strIntern = ((String) objArr2[0]).intern();
        }
        return BitmapUtils.saveBitmapToFile(bitmapDecodeByteArray, imagesDirectory, strIntern).getAbsolutePath();
    }

    public /* synthetic */ ObservableSource c(bt btVar, bh bhVar) throws Exception {
        int i2 = 2 % 2;
        int i3 = f7523x + 55;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        Observable<bc> observableSendBackIdScan = sendBackIdScan(btVar);
        int i5 = f7523x + 7;
        f7521v = i5 % 128;
        int i6 = i5 % 2;
        return observableSendBackIdScan;
    }

    public Observable<bc> sendBackIdScan(final bt btVar) {
        int i2 = 2 % 2;
        int i3 = f7521v + 95;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        if (a()) {
            int i5 = f7523x + 121;
            f7521v = i5 % 128;
            if (i5 % 2 != 0) {
                return resumeOnboarding().flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda2
                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj) {
                        return this.f$0.c(btVar, (bh) obj);
                    }
                });
            }
            resumeOnboarding().flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda2
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.f$0.c(btVar, (bh) obj);
                }
            });
            throw null;
        }
        Object[] objArr = {this.f7525b, getToken(), btVar};
        int iC = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        return (Observable) h.a(IdCaptureModuleScreenKt.e.AnonymousClass2.c(), 1290889477, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), -1290889454, objArr, iC, IdCaptureModuleScreenKt.e.AnonymousClass2.c());
    }

    public Observable<Pair<IdProcessResult, bb>> processId(final boolean z2) {
        int i2 = 2 % 2;
        int i3 = f7521v + 51;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.f7525b, getToken(), IncodeWelcome.getInstance().getInternalConfig().queueName, Boolean.valueOf(z2)};
        int iC = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        Observable<Pair<IdProcessResult, bb>> map = ((Observable) h.a(IdCaptureModuleScreenKt.e.AnonymousClass2.c(), 1442796435, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), -1442796435, objArr, iC, IdCaptureModuleScreenKt.e.AnonymousClass2.c())).flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda49
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.e(z2, (ResponseSuccess) obj);
            }
        }).map(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda50
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.d((Pair) obj);
            }
        });
        int i5 = f7523x + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f7521v = i5 % 128;
        if (i5 % 2 != 0) {
            return map;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ ObservableSource e(boolean z2, ResponseSuccess responseSuccess) throws Exception {
        int i2 = 2 % 2;
        int i3 = f7521v + 1;
        f7523x = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            if (!j()) {
                return b(z2);
            }
            Observable observableJust = Observable.just(new Pair(new IdProcessResult(ResultCode.SUCCESS, IncodeWelcome.OCRData.createEmpty()), null));
            int i4 = f7521v + 99;
            f7523x = i4 % 128;
            int i5 = i4 % 2;
            return observableJust;
        }
        j();
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ Pair d(Pair pair) throws Exception {
        boolean z2;
        int i2 = 2 % 2;
        IdScanResult idFrontResult = getIdFrontResult();
        bb bbVar = (bb) pair.second;
        if (idFrontResult == null) {
            if (bbVar != null) {
                com.incode.welcome_sdk.data.remote.beans.e eVarE = bbVar.e();
                com.incode.welcome_sdk.data.remote.beans.e eVarC = bbVar.c();
                if (eVarE != null) {
                    idFrontResult = IdScanResultHelperKt.createIdScanResultFromIdSummary(eVarE, bbVar.d());
                }
                IdScanResult idBackResult = getIdBackResult();
                if (!bbVar.d() && eVarC != null) {
                    int i3 = f7523x + 5;
                    f7521v = i3 % 128;
                    int i4 = i3 % 2;
                    if (idBackResult == null || !idBackResult.isOnlyBack) {
                        z2 = false;
                    } else {
                        int i5 = f7523x + 33;
                        f7521v = i5 % 128;
                        int i6 = i5 % 2;
                        z2 = true;
                    }
                    idBackResult = IdScanResultHelperKt.createIdScanResultFromIdSummary(eVarC, bbVar.d(), Boolean.valueOf(z2));
                }
                if (idFrontResult != null) {
                    persistIdFrontResult(idFrontResult);
                }
                if (idBackResult != null) {
                    int i7 = f7523x + 93;
                    f7521v = i7 % 128;
                    if (i7 % 2 == 0) {
                        persistIdBackResult(idBackResult);
                        throw null;
                    }
                    persistIdBackResult(idBackResult);
                }
            } else {
                IdScanResult idScanResult = new IdScanResult();
                idScanResult.scanStatus = -1;
                persistIdFrontResult(idScanResult);
            }
        }
        Pair pair2 = new Pair((IdProcessResult) pair.first, bbVar);
        int i8 = f7523x + 17;
        f7521v = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 64 / 0;
        }
        return pair2;
    }

    private Observable<Pair<IdProcessResult, bb>> b(final boolean z2) {
        int i2 = 2 % 2;
        int i3 = f7523x + 65;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.f7525b, getToken(), Boolean.valueOf(z2)};
        int iC = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        Observable<Pair<IdProcessResult, bb>> observableFlatMap = ((Observable) h.a(IdCaptureModuleScreenKt.e.AnonymousClass2.c(), 2029210259, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), -2029210256, objArr, iC, IdCaptureModuleScreenKt.e.AnonymousClass2.c())).flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda11
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.d(z2, (ResponseOCRData) obj);
            }
        }).flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda22
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.e((IdProcessResult) obj);
            }
        });
        int i5 = f7523x + 57;
        f7521v = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 85 / 0;
        }
        return observableFlatMap;
    }

    public /* synthetic */ ObservableSource d(boolean z2, ResponseOCRData responseOCRData) throws Exception {
        int i2 = 2 % 2;
        int i3 = f7521v + 1;
        int i4 = i3 % 128;
        f7523x = i4;
        int i5 = i3 % 2;
        Object obj = null;
        if (z2) {
            int i6 = i4 + 25;
            f7521v = i6 % 128;
            if (i6 % 2 != 0) {
                c(responseOCRData);
            } else {
                c(responseOCRData);
                throw null;
            }
        } else {
            e(responseOCRData);
        }
        Observable observableJust = Observable.just(new IdProcessResult(ResultCode.SUCCESS, new IncodeWelcome.OCRData(responseOCRData)));
        int i7 = f7523x + 125;
        f7521v = i7 % 128;
        if (i7 % 2 != 0) {
            return observableJust;
        }
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ ObservableSource e(IdProcessResult idProcessResult) throws Exception {
        int i2 = 2 % 2;
        int i3 = f7523x + 15;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        if (getIdFrontResult() != null || IncodeWelcome.getInstance().isDelayedMode()) {
            return Observable.just(new Pair(idProcessResult, null));
        }
        Observable<Pair<IdProcessResult, bb>> observableFetchIdSummary = fetchIdSummary(idProcessResult);
        int i5 = f7523x + 3;
        f7521v = i5 % 128;
        int i6 = i5 % 2;
        return observableFetchIdSummary;
    }

    public /* synthetic */ void d(ResponseOCRData responseOCRData) throws Exception {
        int i2 = 2 % 2;
        int i3 = f7523x + 121;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        if (responseOCRData.getAddressFieldsFromStatement() != null) {
            int i5 = f7523x + 3;
            f7521v = i5 % 128;
            if (i5 % 2 != 0) {
                setPoaState(responseOCRData.getAddressFieldsFromStatement().b());
                setPoaCity(responseOCRData.getAddressFieldsFromStatement().a());
                setPoaPostalCode(responseOCRData.getAddressFieldsFromStatement().d());
                setPoaStreet(responseOCRData.getAddressFieldsFromStatement().c());
            } else {
                setPoaState(responseOCRData.getAddressFieldsFromStatement().b());
                setPoaCity(responseOCRData.getAddressFieldsFromStatement().a());
                setPoaPostalCode(responseOCRData.getAddressFieldsFromStatement().d());
                setPoaStreet(responseOCRData.getAddressFieldsFromStatement().c());
                throw null;
            }
        }
        IncodeWelcome.getInstance().getOcrDataBus().onNext(new IncodeWelcome.OCRData(responseOCRData));
    }

    private static /* synthetic */ Object o(Object[] objArr) {
        Throwable th = (Throwable) objArr[0];
        int i2 = 2 % 2;
        int i3 = f7521v + 65;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        IncodeWelcome.getInstance().getOcrDataBus().onNext(IncodeWelcome.OCRData.createEmpty());
        Timber.e(th);
        int i5 = f7523x + 77;
        f7521v = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object n(Object[] objArr) {
        final IncodeWelcomeRepository incodeWelcomeRepository = (IncodeWelcomeRepository) objArr[0];
        int i2 = 2 % 2;
        int i3 = f7521v + 113;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        if (j()) {
            IncodeWelcome.getInstance().getOcrDataBus().onNext(IncodeWelcome.OCRData.createEmpty());
            int i5 = f7523x + 99;
            f7521v = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 39 / 0;
            }
            return null;
        }
        Object[] objArr2 = {incodeWelcomeRepository.f7525b, incodeWelcomeRepository.getToken(), false};
        int iC = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        ((Observable) h.a(IdCaptureModuleScreenKt.e.AnonymousClass2.c(), 2029210259, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), -2029210256, objArr2, iC, IdCaptureModuleScreenKt.e.AnonymousClass2.c())).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda27
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.d((ResponseOCRData) obj);
            }
        }, new Consumer() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda28
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                IncodeWelcomeRepository.a((Throwable) obj);
            }
        });
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0016, code lost:
    
        if (j() != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0023, code lost:
    
        return io.reactivex.Observable.error(new java.lang.IllegalStateException("Cannot fetch data; SubmitOnly mode is enabled"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0028, code lost:
    
        if (j() != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002b, code lost:
    
        r9 = new java.lang.Object[]{r12.f7525b, r13, false};
        r10 = com.incode.welcome_sdk.ui.id_capture.view.IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        r2 = (io.reactivex.Observable) com.incode.welcome_sdk.data.remote.h.a(com.incode.welcome_sdk.ui.id_capture.view.IdCaptureModuleScreenKt.e.AnonymousClass2.c(), 2029210259, com.incode.welcome_sdk.ui.id_capture.view.IdCaptureModuleScreenKt.e.AnonymousClass2.c(), -2029210256, r9, r10, com.incode.welcome_sdk.ui.id_capture.view.IdCaptureModuleScreenKt.e.AnonymousClass2.c());
        r1 = com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7521v + 115;
        com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7523x = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
    
        if ((r1 % 2) == 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        r0 = 63 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005f, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public io.reactivex.Observable<com.incode.welcome_sdk.data.remote.beans.ResponseOCRData> fetchOCRData(java.lang.String r13) {
        /*
            r12 = this;
            r4 = 2
            int r0 = r4 % r4
            int r0 = com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7521v
            int r1 = r0 + 15
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7523x = r0
            int r1 = r1 % r4
            r3 = 0
            if (r1 == 0) goto L24
            boolean r1 = j()
            r0 = 90
            int r0 = r0 / r3
            if (r1 == 0) goto L2b
        L18:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot fetch data; SubmitOnly mode is enabled"
            r1.<init>(r0)
            io.reactivex.Observable r0 = io.reactivex.Observable.error(r1)
            return r0
        L24:
            boolean r0 = j()
            if (r0 == 0) goto L2b
            goto L18
        L2b:
            com.incode.welcome_sdk.data.remote.h r1 = r12.f7525b
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            java.lang.Object[] r9 = new java.lang.Object[]{r1, r13, r0}
            int r10 = com.incode.welcome_sdk.ui.id_capture.view.IdCaptureModuleScreenKt.e.AnonymousClass2.c()
            int r5 = com.incode.welcome_sdk.ui.id_capture.view.IdCaptureModuleScreenKt.e.AnonymousClass2.c()
            int r11 = com.incode.welcome_sdk.ui.id_capture.view.IdCaptureModuleScreenKt.e.AnonymousClass2.c()
            int r7 = com.incode.welcome_sdk.ui.id_capture.view.IdCaptureModuleScreenKt.e.AnonymousClass2.c()
            r8 = -2029210256(0xffffffff870cb570, float:-1.0585749E-34)
            r6 = 2029210259(0x78f34a93, float:3.9476271E34)
            java.lang.Object r2 = com.incode.welcome_sdk.data.remote.h.a(r5, r6, r7, r8, r9, r10, r11)
            io.reactivex.Observable r2 = (io.reactivex.Observable) r2
            int r0 = com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7521v
            int r1 = r0 + 115
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7523x = r0
            int r1 = r1 % r4
            if (r1 == 0) goto L5f
            r0 = 63
            int r0 = r0 / r3
        L5f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.IncodeWelcomeRepository.fetchOCRData(java.lang.String):io.reactivex.Observable");
    }

    public /* synthetic */ ObservableSource j(String str, bh bhVar) throws Exception {
        int i2 = 2 % 2;
        int i3 = f7521v + 45;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        Observable<ResponseSuccess> observableProcessLaborHistory = processLaborHistory(str);
        int i5 = f7523x + 1;
        f7521v = i5 % 128;
        int i6 = i5 % 2;
        return observableProcessLaborHistory;
    }

    public Observable<ResponseSuccess> processLaborHistory(final String str) {
        int i2 = 2 % 2;
        if (!a()) {
            Observable<ResponseSuccess> observableK = this.f7525b.k(getToken(), str);
            int i3 = f7521v + 37;
            f7523x = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 26 / 0;
            }
            return observableK;
        }
        int i5 = f7523x + 73;
        f7521v = i5 % 128;
        if (i5 % 2 != 0) {
            return resumeOnboarding().flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda40
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.f$0.j(str, (bh) obj);
                }
            });
        }
        int i6 = 87 / 0;
        return resumeOnboarding().flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda40
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.j(str, (bh) obj);
            }
        });
    }

    public /* synthetic */ ObservableSource h(bh bhVar) throws Exception {
        int i2 = 2 % 2;
        int i3 = f7523x + 7;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        Observable<ResponseSuccess> observableProcessPaymentProof = processPaymentProof();
        int i5 = f7521v + 115;
        f7523x = i5 % 128;
        int i6 = i5 % 2;
        return observableProcessPaymentProof;
    }

    public Observable<ResponseSuccess> processPaymentProof() {
        int i2 = 2 % 2;
        Object obj = null;
        if (a()) {
            int i3 = f7521v + 31;
            f7523x = i3 % 128;
            if (i3 % 2 == 0) {
                return resumeOnboarding().flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda3
                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj2) {
                        return this.f$0.h((bh) obj2);
                    }
                });
            }
            resumeOnboarding().flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda3
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj2) {
                    return this.f$0.h((bh) obj2);
                }
            });
            obj.hashCode();
            throw null;
        }
        Observable<ResponseSuccess> observableM = this.f7525b.m(getToken());
        int i4 = f7521v + 93;
        f7523x = i4 % 128;
        if (i4 % 2 == 0) {
            return observableM;
        }
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ ObservableSource f(bh bhVar) throws Exception {
        int i2 = 2 % 2;
        int i3 = f7521v + 109;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        Observable<bg> paymentProofInfo = getPaymentProofInfo();
        int i5 = f7521v + 73;
        f7523x = i5 % 128;
        int i6 = i5 % 2;
        return paymentProofInfo;
    }

    public Observable<bg> getPaymentProofInfo() {
        int i2 = 2 % 2;
        int i3 = f7521v + 81;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        if (!a()) {
            return this.f7525b.l(getToken());
        }
        Observable observableFlatMap = resumeOnboarding().flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda35
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.f((bh) obj);
            }
        });
        int i5 = f7523x + 91;
        f7521v = i5 % 128;
        int i6 = i5 % 2;
        return observableFlatMap;
    }

    public /* synthetic */ ObservableSource d(bh bhVar) throws Exception {
        int i2 = 2 % 2;
        int i3 = f7521v + 59;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        Observable<x> observableAddNOM151Archive = addNOM151Archive();
        int i5 = f7521v + 97;
        f7523x = i5 % 128;
        int i6 = i5 % 2;
        return observableAddNOM151Archive;
    }

    public Observable<x> addNOM151Archive() {
        int i2 = 2 % 2;
        int i3 = f7521v + 81;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        if (!a()) {
            return this.f7525b.o(getToken());
        }
        Observable observableFlatMap = resumeOnboarding().flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda9
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.d((bh) obj);
            }
        });
        int i5 = f7521v + 35;
        f7523x = i5 % 128;
        int i6 = i5 % 2;
        return observableFlatMap;
    }

    public Observable<ResponseAddCurp> addCurp(String str) {
        int i2 = 2 % 2;
        int i3 = f7523x + 9;
        f7521v = i3 % 128;
        if (i3 % 2 == 0) {
            this.f7525b.l(getToken(), str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Observable<ResponseAddCurp> observableL = this.f7525b.l(getToken(), str);
        int i4 = f7521v + 67;
        f7523x = i4 % 128;
        int i5 = i4 % 2;
        return observableL;
    }

    public Observable<ResponseAddCurpV2> addCurpV2(String str, String str2, String str3, String str4, String str5, String str6) {
        int i2 = 2 % 2;
        int i3 = f7521v + 107;
        f7523x = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f7525b.c(getToken(), str, str2, str3, str4, str5, str6);
        }
        this.f7525b.c(getToken(), str, str2, str3, str4, str5, str6);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Single<bl> validateRfc(String str) {
        int i2 = 2 % 2;
        int i3 = f7521v + 113;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        Single<bl> singleR = this.f7525b.r(getToken(), str);
        int i5 = f7523x + 7;
        f7521v = i5 % 128;
        if (i5 % 2 != 0) {
            return singleR;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Observable<ResponseSuccess> addNfcData(boolean z2, NfcScanResult nfcScanResult) {
        int i2 = 2 % 2;
        int i3 = f7523x + 97;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.f7525b, getToken(), Boolean.valueOf(z2), nfcScanResult};
        int iC = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        Observable<ResponseSuccess> observable = (Observable) h.a(IdCaptureModuleScreenKt.e.AnonymousClass2.c(), -2117426535, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), 2117426545, objArr, iC, IdCaptureModuleScreenKt.e.AnonymousClass2.c());
        int i5 = f7521v + 19;
        f7523x = i5 % 128;
        int i6 = i5 % 2;
        return observable;
    }

    public /* synthetic */ Observable e(IdInfoModel idInfoModel, boolean z2, String str) throws Exception {
        int i2 = 2 % 2;
        int i3 = f7521v + 45;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.f7525b, str, idInfoModel, Boolean.valueOf(z2)};
        int iC = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        Observable observable = (Observable) h.a(IdCaptureModuleScreenKt.e.AnonymousClass2.c(), 41456448, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), -41456431, objArr, iC, IdCaptureModuleScreenKt.e.AnonymousClass2.c());
        int i5 = f7523x + 115;
        f7521v = i5 % 128;
        int i6 = i5 % 2;
        return observable;
    }

    public Observable<ResponseSuccess> addOcrData(final IdInfoModel idInfoModel, final boolean z2) {
        int i2 = 2 % 2;
        int i3 = f7523x + 99;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        Observable<ResponseSuccess> observable = (Observable) b(IdCaptureModuleScreenKt.d.a(), new Object[]{this, new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda60
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.e(idInfoModel, z2, (String) obj);
            }
        }}, IdCaptureModuleScreenKt.d.a(), IdCaptureModuleScreenKt.d.a(), IdCaptureModuleScreenKt.d.a(), 1039237223, -1039237206);
        int i5 = f7523x + 27;
        f7521v = i5 % 128;
        int i6 = i5 % 2;
        return observable;
    }

    public Single<ResponseBody> addGlobalWatchlistData(GlobalWatchlistModel globalWatchlistModel) {
        Single<ResponseBody> singleE;
        int i2 = 2 % 2;
        int i3 = f7521v + 113;
        f7523x = i3 % 128;
        if (i3 % 2 != 0) {
            singleE = this.f7525b.e(getToken(), globalWatchlistModel);
            int i4 = 63 / 0;
        } else {
            singleE = this.f7525b.e(getToken(), globalWatchlistModel);
        }
        int i5 = f7523x + 115;
        f7521v = i5 % 128;
        int i6 = i5 % 2;
        return singleE;
    }

    public Observable<ResponseSuccess> processCustomWatchlist() {
        int i2 = 2 % 2;
        int i3 = f7523x + 27;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.f7525b, getToken()};
        int iC = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        Observable<ResponseSuccess> observable = (Observable) h.a(IdCaptureModuleScreenKt.e.AnonymousClass2.c(), 1062023863, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), -1062023852, objArr, iC, IdCaptureModuleScreenKt.e.AnonymousClass2.c());
        int i5 = f7521v + 17;
        f7523x = i5 % 128;
        int i6 = i5 % 2;
        return observable;
    }

    public /* synthetic */ Observable e(EKYBForm eKYBForm, String str) throws Exception {
        int i2 = 2 % 2;
        int i3 = f7521v + 17;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        Observable<ah> observableE = this.f7525b.e(str, eKYBForm);
        int i5 = f7521v + 89;
        f7523x = i5 % 128;
        int i6 = i5 % 2;
        return observableE;
    }

    public Observable<ah> processEKYBChecks(final EKYBForm eKYBForm) {
        int i2 = 2 % 2;
        int i3 = f7523x + 11;
        f7521v = i3 % 128;
        if (i3 % 2 != 0) {
            return (Observable) b(IdCaptureModuleScreenKt.d.a(), new Object[]{this, new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda36
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.f$0.e(eKYBForm, (String) obj);
                }
            }}, IdCaptureModuleScreenKt.d.a(), IdCaptureModuleScreenKt.d.a(), IdCaptureModuleScreenKt.d.a(), 1039237223, -1039237206);
        }
        int i4 = 83 / 0;
        return (Observable) b(IdCaptureModuleScreenKt.d.a(), new Object[]{this, new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda36
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.e(eKYBForm, (String) obj);
            }
        }}, IdCaptureModuleScreenKt.d.a(), IdCaptureModuleScreenKt.d.a(), IdCaptureModuleScreenKt.d.a(), 1039237223, -1039237206);
    }

    public /* synthetic */ Observable e(EKYCForm eKYCForm, String str) throws Exception {
        int i2 = 2 % 2;
        int i3 = f7523x + 3;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        h hVar = this.f7525b;
        if (i4 != 0) {
            return hVar.d(str, eKYCForm);
        }
        hVar.d(str, eKYCForm);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Observable<ai> processEKYCChecks(final EKYCForm eKYCForm) {
        int i2 = 2 % 2;
        int i3 = f7521v + 43;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        Observable<ai> observable = (Observable) b(IdCaptureModuleScreenKt.d.a(), new Object[]{this, new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda66
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.e(eKYCForm, (String) obj);
            }
        }}, IdCaptureModuleScreenKt.d.a(), IdCaptureModuleScreenKt.d.a(), IdCaptureModuleScreenKt.d.a(), 1039237223, -1039237206);
        int i5 = f7521v + 37;
        f7523x = i5 % 128;
        int i6 = i5 % 2;
        return observable;
    }

    public Observable<ResponseSuccess> setManualIdCheckNeeded(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f7523x + 51;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        Observable<ResponseSuccess> observableA = this.f7525b.a(getToken(), z2);
        int i5 = f7521v + 3;
        f7523x = i5 % 128;
        if (i5 % 2 == 0) {
            return observableA;
        }
        throw null;
    }

    public /* synthetic */ ObservableSource a(DocumentType documentType, File file, String str, j.b bVar, int i2, bh bhVar) throws Exception {
        int i3 = 2 % 2;
        int i4 = f7521v + 103;
        f7523x = i4 % 128;
        int i5 = i4 % 2;
        Observable<ResponseSuccess> observableSendDocumentScan = sendDocumentScan(documentType, file, str, bVar, i2);
        if (i5 != 0) {
            int i6 = 64 / 0;
        }
        int i7 = f7521v + 5;
        f7523x = i7 % 128;
        if (i7 % 2 == 0) {
            return observableSendDocumentScan;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Observable<ResponseSuccess> sendDocumentScan(final DocumentType documentType, final File file, final String str, final j.b bVar, final int i2) {
        int i3 = 2 % 2;
        int i4 = f7521v + 29;
        f7523x = i4 % 128;
        if (i4 % 2 != 0) {
            a();
            throw null;
        }
        if (a()) {
            return resumeOnboarding().flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda75
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.f$0.a(documentType, file, str, bVar, i2, (bh) obj);
                }
            });
        }
        Observable<ResponseSuccess> observableC = this.f7525b.c(getToken(), documentType, file, str, bVar, i2);
        int i5 = f7523x + 85;
        f7521v = i5 % 128;
        if (i5 % 2 != 0) {
            return observableC;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Observable<ResponseSuccess> processAddressStatement() {
        Observable observableFlatMap;
        int i2 = 2 % 2;
        int i3 = f7521v + 61;
        f7523x = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 2 / 0;
            observableFlatMap = this.f7525b.k(getToken()).flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda76
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.f$0.e((ResponseSuccess) obj);
                }
            });
        } else {
            observableFlatMap = this.f7525b.k(getToken()).flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda76
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.f$0.e((ResponseSuccess) obj);
                }
            });
        }
        int i5 = f7523x + 19;
        f7521v = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 47 / 0;
        }
        return observableFlatMap;
    }

    public /* synthetic */ ObservableSource e(ResponseSuccess responseSuccess) throws Exception {
        int i2 = 2 % 2;
        int i3 = f7523x + 17;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        int iA = IdCaptureModuleScreenKt.d.a();
        b(IdCaptureModuleScreenKt.d.a(), new Object[]{this}, iA, IdCaptureModuleScreenKt.d.a(), IdCaptureModuleScreenKt.d.a(), 447429535, -447429525);
        Observable observableJust = Observable.just(responseSuccess);
        int i5 = f7523x + 65;
        f7521v = i5 % 128;
        int i6 = i5 % 2;
        return observableJust;
    }

    public Observable<ResponseMedicalDoc> processMedicalDoc() {
        int i2 = 2 % 2;
        int i3 = f7523x + 57;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        if (j()) {
            return Observable.just(new ResponseMedicalDoc());
        }
        Object[] objArr = {this.f7525b, getToken()};
        int iC = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        Observable<ResponseMedicalDoc> observable = (Observable) h.a(IdCaptureModuleScreenKt.e.AnonymousClass2.c(), -368943289, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), 368943294, objArr, iC, IdCaptureModuleScreenKt.e.AnonymousClass2.c());
        int i5 = f7521v + 81;
        f7523x = i5 % 128;
        int i6 = i5 % 2;
        return observable;
    }

    public /* synthetic */ ObservableSource b(double d2, double d3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, bh bhVar) throws Exception {
        Observable<ax> observableSendGeolocation;
        int i2 = 2 % 2;
        int i3 = f7523x + 85;
        f7521v = i3 % 128;
        if (i3 % 2 == 0) {
            observableSendGeolocation = sendGeolocation(d2, d3, str, str2, str3, str4, str5, str6, str7, str8, str9);
            int i4 = 5 / 0;
        } else {
            observableSendGeolocation = sendGeolocation(d2, d3, str, str2, str3, str4, str5, str6, str7, str8, str9);
        }
        int i5 = f7523x + 63;
        f7521v = i5 % 128;
        int i6 = i5 % 2;
        return observableSendGeolocation;
    }

    public Observable<ax> sendGeolocation(final double d2, final double d3, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9) {
        int i2 = 2 % 2;
        int i3 = f7521v + 1;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        if (a()) {
            int i5 = f7523x + 105;
            f7521v = i5 % 128;
            int i6 = i5 % 2;
            return resumeOnboarding().flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda20
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.f$0.b(d2, d3, str, str2, str3, str4, str5, str6, str7, str8, str9, (bh) obj);
                }
            });
        }
        return this.f7525b.e(getToken(), d2, d3, str, str2, str3, str4, str5, str6, str7, str8, str9);
    }

    public Observable<ResponseSuccess> setManualSelfieCheckNeeded(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f7523x + 67;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        Observable<ResponseSuccess> observableE = this.f7525b.e(getToken(), z2);
        int i5 = f7523x + 21;
        f7521v = i5 % 128;
        int i6 = i5 % 2;
        return observableE;
    }

    public /* synthetic */ Observable b(Map map, com.incode.welcome_sdk.data.remote.beans.f fVar, String str, String str2, String str3, String str4) throws Exception {
        int i2 = 2 % 2;
        int i3 = f7521v + 111;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        Observable<v> observableOnErrorResumeNext = this.f7525b.e(str2, str3, str4, map, fVar, str).onErrorResumeNext(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda34
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return IncodeWelcomeRepository.d((Throwable) obj);
            }
        });
        int i5 = f7523x + 27;
        f7521v = i5 % 128;
        if (i5 % 2 != 0) {
            return observableOnErrorResumeNext;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Observable<v> addFace(s sVar, String str, final Map<String, Float> map, final com.incode.welcome_sdk.data.remote.beans.f fVar, final String str2) {
        int i2 = 2 % 2;
        int i3 = f7523x + 75;
        f7521v = i3 % 128;
        if (i3 % 2 != 0) {
            return d(str, sVar, new Function3() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda48
                @Override // io.reactivex.functions.Function3
                public final Object apply(Object obj, Object obj2, Object obj3) {
                    return this.f$0.b(map, fVar, str2, (String) obj, (String) obj2, (String) obj3);
                }
            });
        }
        d(str, sVar, new Function3() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda48
            @Override // io.reactivex.functions.Function3
            public final Object apply(Object obj, Object obj2, Object obj3) {
                return this.f$0.b(map, fVar, str2, (String) obj, (String) obj2, (String) obj3);
            }
        });
        throw null;
    }

    public static /* synthetic */ ObservableSource d(Throwable th) throws Exception {
        int i2 = 2 % 2;
        int i3 = f7523x + 93;
        f7521v = i3 % 128;
        if (i3 % 2 == 0) {
            Timber.e(th, "Couldn't recognizeFace", new Object[0]);
        } else {
            Timber.e(th, "Couldn't recognizeFace", new Object[0]);
        }
        Observable observableError = Observable.error(th);
        int i4 = f7523x + 9;
        f7521v = i4 % 128;
        int i5 = i4 % 2;
        return observableError;
    }

    public Observable<v> addFaceVideoSelfie(String str, final Map<String, Float> map, final boolean z2) {
        Observable<v> observableD;
        int i2 = 2 % 2;
        int i3 = f7523x + 31;
        f7521v = i3 % 128;
        if (i3 % 2 == 0) {
            observableD = d(str, (s) null, new Function3() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda52
                @Override // io.reactivex.functions.Function3
                public final Object apply(Object obj, Object obj2, Object obj3) {
                    return this.f$0.c(map, z2, (String) obj, (String) obj2, (String) obj3);
                }
            });
            int i4 = 27 / 0;
        } else {
            observableD = d(str, (s) null, new Function3() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda52
                @Override // io.reactivex.functions.Function3
                public final Object apply(Object obj, Object obj2, Object obj3) {
                    return this.f$0.c(map, z2, (String) obj, (String) obj2, (String) obj3);
                }
            });
        }
        int i5 = f7523x + 83;
        f7521v = i5 % 128;
        int i6 = i5 % 2;
        return observableD;
    }

    public /* synthetic */ Observable c(Map map, boolean z2, String str, String str2, String str3) throws Exception {
        Observable<v> observableB;
        int i2 = 2 % 2;
        int i3 = f7523x + 97;
        f7521v = i3 % 128;
        if (i3 % 2 == 0) {
            observableB = this.f7525b.b(str, str2, (Map<String, Float>) map, z2);
            int i4 = 28 / 0;
        } else {
            observableB = this.f7525b.b(str, str2, (Map<String, Float>) map, z2);
        }
        int i5 = f7523x + 19;
        f7521v = i5 % 128;
        if (i5 % 2 != 0) {
            return observableB;
        }
        throw null;
    }

    private Observable<v> d(final String str, final s sVar, final Function3<String, String, String, Observable<v>> function3) {
        int i2 = 2 % 2;
        int i3 = f7523x + 43;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        Observable<v> observable = (Observable) b(IdCaptureModuleScreenKt.d.a(), new Object[]{this, new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda12
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return IncodeWelcomeRepository.c(str, sVar, function3, (String) obj);
            }
        }}, IdCaptureModuleScreenKt.d.a(), IdCaptureModuleScreenKt.d.a(), IdCaptureModuleScreenKt.d.a(), 1039237223, -1039237206);
        int i5 = f7521v + 19;
        f7523x = i5 % 128;
        if (i5 % 2 == 0) {
            return observable;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Observable c(String str, s sVar, Function3 function3, String str2) throws Exception {
        int i2 = 2 % 2;
        int i3 = f7521v + 47;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        try {
            Observable observable = (Observable) function3.apply(str2, ae.e(str, ae.c(str, ae.c())), com.incode.welcome_sdk.data.e.b.e(sVar));
            int i5 = f7523x + 27;
            f7521v = i5 % 128;
            if (i5 % 2 != 0) {
                return observable;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Exception e2) {
            Timber.e(e2, "Couldn't encrypt content.", new Object[0]);
            return Observable.error(e2);
        }
    }

    public /* synthetic */ ObservableSource i(String str, bh bhVar) throws Exception {
        int i2 = 2 % 2;
        int i3 = f7521v + 19;
        f7523x = i3 % 128;
        if (i3 % 2 != 0) {
            videoSelfieCompareFrontId(str);
            throw null;
        }
        Observable<ad> observableVideoSelfieCompareFrontId = videoSelfieCompareFrontId(str);
        int i4 = f7523x + 53;
        f7521v = i4 % 128;
        if (i4 % 2 != 0) {
            return observableVideoSelfieCompareFrontId;
        }
        throw null;
    }

    public Observable<ad> videoSelfieCompareFrontId(final String str) {
        int i2 = 2 % 2;
        if (!a()) {
            Object[] objArr = {this.f7525b, getToken(), str};
            int iC = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
            return (Observable) h.a(IdCaptureModuleScreenKt.e.AnonymousClass2.c(), 1254682654, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), -1254682636, objArr, iC, IdCaptureModuleScreenKt.e.AnonymousClass2.c());
        }
        int i3 = f7523x + 55;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        Observable observableFlatMap = resumeOnboarding().flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda42
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.i(str, (bh) obj);
            }
        });
        int i5 = f7523x + 109;
        f7521v = i5 % 128;
        int i6 = i5 % 2;
        return observableFlatMap;
    }

    public /* synthetic */ ObservableSource c(String str, bh bhVar) throws Exception {
        int i2 = 2 % 2;
        int i3 = f7523x + 85;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        Observable<ad> observableVideoSelfieCompareBackId = videoSelfieCompareBackId(str);
        int i5 = f7521v + 19;
        f7523x = i5 % 128;
        if (i5 % 2 == 0) {
            return observableVideoSelfieCompareBackId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Observable<ad> videoSelfieCompareBackId(final String str) {
        int i2 = 2 % 2;
        if (a()) {
            int i3 = f7523x + 125;
            f7521v = i3 % 128;
            if (i3 % 2 != 0) {
                return resumeOnboarding().flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda30
                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj) {
                        return this.f$0.c(str, (bh) obj);
                    }
                });
            }
            resumeOnboarding().flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda30
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.f$0.c(str, (bh) obj);
                }
            });
            throw null;
        }
        Object[] objArr = {this.f7525b, getToken(), str};
        int iC = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        Observable<ad> observable = (Observable) h.a(IdCaptureModuleScreenKt.e.AnonymousClass2.c(), -662123512, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), 662123514, objArr, iC, IdCaptureModuleScreenKt.e.AnonymousClass2.c());
        int i4 = f7523x + 115;
        f7521v = i4 % 128;
        int i5 = i4 % 2;
        return observable;
    }

    public /* synthetic */ ObservableSource d(String str, String str2, bh bhVar) throws Exception {
        int i2 = 2 % 2;
        int i3 = f7523x + 45;
        f7521v = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            sendZoomedFrame(str, str2);
            obj.hashCode();
            throw null;
        }
        Observable<ResponseSuccess> observableSendZoomedFrame = sendZoomedFrame(str, str2);
        int i4 = f7521v + 39;
        f7523x = i4 % 128;
        if (i4 % 2 == 0) {
            return observableSendZoomedFrame;
        }
        throw null;
    }

    public Observable<ResponseSuccess> sendZoomedFrame(final String str, final String str2) {
        int i2 = 2 % 2;
        int i3 = f7523x + 99;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        if (a()) {
            int i5 = f7521v + 63;
            f7523x = i5 % 128;
            int i6 = i5 % 2;
            return resumeOnboarding().flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda16
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.f$0.d(str, str2, (bh) obj);
                }
            });
        }
        Observable<ResponseSuccess> observableD = this.f7525b.d(getToken(), str, str2);
        int i7 = f7523x + 1;
        f7521v = i7 % 128;
        if (i7 % 2 != 0) {
            return observableD;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ ObservableSource e(bh bhVar) throws Exception {
        int i2 = 2 % 2;
        int i3 = f7521v + 107;
        f7523x = i3 % 128;
        if (i3 % 2 != 0) {
            processGovernmentValidation();
            throw null;
        }
        Observable<ay> observableProcessGovernmentValidation = processGovernmentValidation();
        int i4 = f7523x + 59;
        f7521v = i4 % 128;
        int i5 = i4 % 2;
        return observableProcessGovernmentValidation;
    }

    public Observable<ay> processGovernmentValidation() {
        int i2 = 2 % 2;
        int i3 = f7521v + 125;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        if (a()) {
            int i5 = f7521v + 87;
            f7523x = i5 % 128;
            if (i5 % 2 == 0) {
                return resumeOnboarding().flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda31
                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj) {
                        return this.f$0.e((bh) obj);
                    }
                });
            }
            resumeOnboarding().flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda31
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.f$0.e((bh) obj);
                }
            });
            throw null;
        }
        return this.f7525b.s(getToken());
    }

    public Observable<bf> processFace(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f7523x + 123;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        Observable<bf> observable = processFace(FaceMatch.MatchType.ID_SELFIE, z2).toObservable();
        if (i4 == 0) {
            int i5 = 70 / 0;
        }
        return observable;
    }

    private static /* synthetic */ Object j(Object[] objArr) throws Throwable {
        IncodeWelcomeRepository incodeWelcomeRepository = (IncodeWelcomeRepository) objArr[0];
        FaceMatch.MatchType matchType = (FaceMatch.MatchType) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i2 = 2 % 2;
        int i3 = f7521v + 25;
        f7523x = i3 % 128;
        if (i3 % 2 == 0) {
            return incodeWelcomeRepository.f7525b.d(incodeWelcomeRepository.getToken(), matchType, zBooleanValue);
        }
        incodeWelcomeRepository.f7525b.d(incodeWelcomeRepository.getToken(), matchType, zBooleanValue);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Single<bf> processFace(final FaceMatch.MatchType matchType, final boolean z2) throws Throwable {
        int i2 = 2 % 2;
        if (a()) {
            int i3 = f7521v + 11;
            f7523x = i3 % 128;
            int i4 = i3 % 2;
            return resumeOnboardingSingle().flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda19
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.f$0.d(matchType, z2, (bh) obj);
                }
            });
        }
        Single<bf> singleD = this.f7525b.d(getToken(), matchType, z2);
        int i5 = f7521v + 75;
        f7523x = i5 % 128;
        int i6 = i5 % 2;
        return singleD;
    }

    public /* synthetic */ ObservableSource e(boolean z2, bh bhVar) throws Exception {
        int i2 = 2 % 2;
        int i3 = f7523x + 97;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        Observable<bf> observableProcessFaceVideoSelfie = processFaceVideoSelfie(z2);
        int i5 = f7523x + 89;
        f7521v = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 6 / 0;
        }
        return observableProcessFaceVideoSelfie;
    }

    public Observable<bf> processFaceVideoSelfie(final boolean z2) {
        int i2 = 2 % 2;
        int i3 = f7523x + 51;
        f7521v = i3 % 128;
        if (i3 % 2 != 0) {
            if (a()) {
                int i4 = f7523x + 35;
                f7521v = i4 % 128;
                int i5 = i4 % 2;
                return resumeOnboarding().flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda25
                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj) {
                        return this.f$0.e(z2, (bh) obj);
                    }
                });
            }
            Object[] objArr = {this.f7525b, getToken(), Boolean.valueOf(z2)};
            int iC = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
            Observable<bf> observable = (Observable) h.a(IdCaptureModuleScreenKt.e.AnonymousClass2.c(), -376974981, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), 376974997, objArr, iC, IdCaptureModuleScreenKt.e.AnonymousClass2.c());
            int i6 = f7523x + 59;
            f7521v = i6 % 128;
            int i7 = i6 % 2;
            return observable;
        }
        a();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ ObservableSource b(String str, bh bhVar) throws Exception {
        int i2 = 2 % 2;
        int i3 = f7523x + 67;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        Observable<ResponseSuccess> observableVideoSelfieCompareFrontIdOcr = videoSelfieCompareFrontIdOcr(str);
        int i5 = f7523x + 15;
        f7521v = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 34 / 0;
        }
        return observableVideoSelfieCompareFrontIdOcr;
    }

    public Observable<ResponseSuccess> videoSelfieCompareFrontIdOcr(final String str) {
        int i2 = 2 % 2;
        if (!(!a())) {
            int i3 = f7521v + 75;
            f7523x = i3 % 128;
            if (i3 % 2 == 0) {
                return resumeOnboarding().flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda44
                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj) {
                        return this.f$0.b(str, (bh) obj);
                    }
                });
            }
            resumeOnboarding().flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda44
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.f$0.b(str, (bh) obj);
                }
            });
            throw null;
        }
        Observable<ResponseSuccess> observable = (Observable) h.a(IdCaptureModuleScreenKt.e.AnonymousClass2.c(), -1816160792, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), 1816160798, new Object[]{this.f7525b, getToken(), str}, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), IdCaptureModuleScreenKt.e.AnonymousClass2.c());
        int i4 = f7523x + 65;
        f7521v = i4 % 128;
        int i5 = i4 % 2;
        return observable;
    }

    public /* synthetic */ ObservableSource e(String str, bh bhVar) throws Exception {
        int i2 = 2 % 2;
        int i3 = f7523x + 1;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        Observable<ResponseSuccess> observableVideoSelfieCompareBackIdOcr = videoSelfieCompareBackIdOcr(str);
        int i5 = f7523x + 73;
        f7521v = i5 % 128;
        if (i5 % 2 != 0) {
            return observableVideoSelfieCompareBackIdOcr;
        }
        throw null;
    }

    public Observable<ResponseSuccess> videoSelfieCompareBackIdOcr(final String str) {
        int i2 = 2 % 2;
        int i3 = f7521v + 27;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        if (!(!a())) {
            return resumeOnboarding().flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda38
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.f$0.e(str, (bh) obj);
                }
            });
        }
        Observable<ResponseSuccess> observableP = this.f7525b.p(getToken(), str);
        int i5 = f7523x + 79;
        f7521v = i5 % 128;
        int i6 = i5 % 2;
        return observableP;
    }

    public Observable<aa> decrypt(String str) {
        int i2 = 2 % 2;
        int i3 = f7523x + 125;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        h hVar = this.f7525b;
        if (i4 != 0) {
            return hVar.h(getToken(), str);
        }
        hVar.h(getToken(), str);
        throw null;
    }

    public Observable<ak> getFaceTemplate(String str, String str2, String str3, String str4) {
        int i2 = 2 % 2;
        int i3 = f7521v + 39;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        h hVar = this.f7525b;
        if (i4 == 0) {
            return hVar.b(str, str2, str3, str4);
        }
        hVar.b(str, str2, str3, str4);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ ObservableSource e(ImageType[] imageTypeArr, boolean z2, bh bhVar) throws Exception {
        int i2 = 2 % 2;
        int i3 = f7521v + 123;
        f7523x = i3 % 128;
        if (i3 % 2 != 0) {
            getImages(imageTypeArr, z2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Observable<ResponseGetImages> images = getImages(imageTypeArr, z2);
        int i4 = f7523x + 123;
        f7521v = i4 % 128;
        int i5 = i4 % 2;
        return images;
    }

    public Observable<ResponseGetImages> getImages(final ImageType[] imageTypeArr, final boolean z2) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f7521v + 97;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        if (j()) {
            return Observable.just(new ResponseGetImages());
        }
        if (a()) {
            int i5 = f7521v + 35;
            f7523x = i5 % 128;
            int i6 = i5 % 2;
            return resumeOnboarding().flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda37
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.f$0.e(imageTypeArr, z2, (bh) obj);
                }
            });
        }
        Observable<ResponseGetImages> observableE = this.f7525b.e(getToken(), imageTypeArr, z2);
        int i7 = f7523x + 105;
        f7521v = i7 % 128;
        int i8 = i7 % 2;
        return observableE;
    }

    public /* synthetic */ ObservableSource c(ImageType[] imageTypeArr, bh bhVar) throws Exception {
        int i2 = 2 % 2;
        int i3 = f7523x + 51;
        f7521v = i3 % 128;
        if (i3 % 2 == 0) {
            getImages(imageTypeArr);
            throw null;
        }
        Observable<ResponseGetImages> images = getImages(imageTypeArr);
        int i4 = f7523x + 61;
        f7521v = i4 % 128;
        int i5 = i4 % 2;
        return images;
    }

    public Observable<ResponseGetImages> getAndSaveImages(final ImageType[] imageTypeArr) {
        int i2 = 2 % 2;
        int i3 = f7521v + 89;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        if (a()) {
            int i5 = f7523x + 15;
            f7521v = i5 % 128;
            int i6 = i5 % 2;
            return resumeOnboarding().flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda68
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.f$0.c(imageTypeArr, (bh) obj);
                }
            });
        }
        return getImages(imageTypeArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0016, code lost:
    
        if (j() != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0021, code lost:
    
        return io.reactivex.Observable.just(new com.incode.welcome_sdk.data.remote.beans.ResponseGetImages());
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0026, code lost:
    
        if (j() != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0029, code lost:
    
        r2 = r5.f7525b.e(getToken(), r6, false).map(new com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda32(r5, r6));
        r1 = com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7521v + 21;
        com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7523x = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0045, code lost:
    
        if ((r1 % 2) == 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
    
        r0 = 16 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004a, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public io.reactivex.Observable<com.incode.welcome_sdk.data.remote.beans.ResponseGetImages> getImages(final com.incode.welcome_sdk.data.ImageType[] r6) {
        /*
            r5 = this;
            r4 = 2
            int r0 = r4 % r4
            int r0 = com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7523x
            int r1 = r0 + 97
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7521v = r0
            int r1 = r1 % r4
            r3 = 0
            if (r1 != 0) goto L22
            boolean r1 = j()
            r0 = 71
            int r0 = r0 / r3
            if (r1 == 0) goto L29
        L18:
            com.incode.welcome_sdk.data.remote.beans.ResponseGetImages r0 = new com.incode.welcome_sdk.data.remote.beans.ResponseGetImages
            r0.<init>()
            io.reactivex.Observable r0 = io.reactivex.Observable.just(r0)
            return r0
        L22:
            boolean r0 = j()
            if (r0 == 0) goto L29
            goto L18
        L29:
            com.incode.welcome_sdk.data.remote.h r1 = r5.f7525b
            java.lang.String r0 = r5.getToken()
            io.reactivex.Observable r1 = r1.e(r0, r6, r3)
            com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda32 r0 = new com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda32
            r0.<init>()
            io.reactivex.Observable r2 = r1.map(r0)
            int r0 = com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7521v
            int r1 = r0 + 21
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7523x = r0
            int r1 = r1 % r4
            if (r1 == 0) goto L4a
            r0 = 16
            int r0 = r0 / r3
        L4a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.IncodeWelcomeRepository.getImages(com.incode.welcome_sdk.data.ImageType[]):io.reactivex.Observable");
    }

    public /* synthetic */ ResponseGetImages a(ImageType[] imageTypeArr, ResponseGetImages responseGetImages) throws Exception {
        int i2 = 2 % 2;
        for (int i3 = 0; i3 < imageTypeArr.length; i3++) {
            int i4 = f7521v + 23;
            f7523x = i4 % 128;
            if (i4 % 2 == 0) {
                String image = responseGetImages.getImage(imageTypeArr[i3]);
                String imagePath = ImageType.getImagePath(imageTypeArr[i3]);
                if (image != null && imagePath != null) {
                    BitmapUtils.saveBitmapToFile(BitmapUtils.decodeByteArray(Base64.decode(image, 0), 600, 600), getImagesDirectory(), imagePath);
                }
            } else {
                responseGetImages.getImage(imageTypeArr[i3]);
                ImageType.getImagePath(imageTypeArr[i3]);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        int i5 = f7521v + 31;
        f7523x = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 51 / 0;
        }
        return responseGetImages;
    }

    private static boolean e() {
        int i2 = 2 % 2;
        if (!(!IncodeWelcome.getInstance().isCaptureOnlyMode())) {
            int i3 = f7523x + 85;
            f7521v = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        int i5 = f7521v + 35;
        f7523x = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public Observable<az> sendEvent(com.incode.welcome_sdk.c.b.d dVar) {
        int i2 = 2 % 2;
        int i3 = f7521v + 97;
        f7523x = i3 % 128;
        if (i3 % 2 == 0) {
            if (e()) {
                Observable<az> observableJust = Observable.just(new az(""));
                int i4 = f7523x + 73;
                f7521v = i4 % 128;
                int i5 = i4 % 2;
                return observableJust;
            }
            return this.f7525b.b(getToken(), dVar);
        }
        e();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Observable<ResponseSuccess> sendEvents(List<com.incode.welcome_sdk.c.b.d> list) {
        int i2 = 2 % 2;
        int i3 = f7523x + 31;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        if (!e()) {
            return this.f7525b.a(getToken(), list);
        }
        Observable<ResponseSuccess> observableJust = Observable.just(new ResponseSuccess(false));
        int i5 = f7523x + 11;
        f7521v = i5 % 128;
        int i6 = i5 % 2;
        return observableJust;
    }

    public Observable<ResponseSuccess> sendEvents(String str, List<com.incode.welcome_sdk.c.b.d> list) {
        int i2 = 2 % 2;
        int i3 = f7521v + 59;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        if (e()) {
            return Observable.just(new ResponseSuccess(false));
        }
        Observable<ResponseSuccess> observableA = this.f7525b.a(str, list);
        int i5 = f7521v + 123;
        f7523x = i5 % 128;
        if (i5 % 2 == 0) {
            return observableA;
        }
        throw null;
    }

    public Observable<am> getExternalScreenshotUploadUrl(String str) {
        int i2 = 2 % 2;
        int i3 = f7523x + 73;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        if (e()) {
            return Observable.just(new am(""));
        }
        Observable<am> observableJ = this.f7525b.j(getToken(), str);
        int i5 = f7523x + 69;
        f7521v = i5 % 128;
        if (i5 % 2 != 0) {
            return observableJ;
        }
        throw null;
    }

    public Observable<ResponseBody> uploadExternalScreenshot(String str, File file) {
        int i2 = 2 % 2;
        if (e()) {
            int i3 = f7523x + 79;
            f7521v = i3 % 128;
            return Observable.just(i3 % 2 == 0 ? ResponseBody.create(new byte[0], (MediaType) null) : ResponseBody.create(new byte[0], (MediaType) null));
        }
        Observable<ResponseBody> observable = (Observable) h.a(IdCaptureModuleScreenKt.e.AnonymousClass2.c(), -298238439, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), 298238458, new Object[]{this.f7525b, str, file}, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), IdCaptureModuleScreenKt.e.AnonymousClass2.c());
        int i4 = f7521v + 51;
        f7523x = i4 % 128;
        int i5 = i4 % 2;
        return observable;
    }

    public Observable<af> getEventReport(String str, File file) {
        int i2 = 2 % 2;
        int i3 = f7523x + 79;
        f7521v = i3 % 128;
        if (i3 % 2 == 0) {
            this.f7525b.c(getToken(), str, file);
            throw null;
        }
        Observable<af> observableC = this.f7525b.c(getToken(), str, file);
        int i4 = f7521v + 17;
        f7523x = i4 % 128;
        int i5 = i4 % 2;
        return observableC;
    }

    @Deprecated
    public void onEvent(Event event, HashMap<String, Object> map) {
        int i2 = 2 % 2;
        IncodeWelcome.getInstance().getEventResultBus().onNext(new EventResult(event, map));
        int i3 = f7523x + 101;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
    }

    public void onInterviewEvent(com.incode.welcome_sdk.c.b.d dVar) {
        int i2 = 2 % 2;
        PublishSubject<InterviewEventResult> interviewEventResultBus = IncodeWelcome.getInstance().getInterviewEventResultBus();
        Intrinsics.checkNotNullParameter(dVar, "");
        interviewEventResultBus.onNext(new InterviewEventResult(dVar.d(), dVar.e(), dVar.b(), dVar.c(), dVar.a()));
        int i3 = f7523x + 27;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
    }

    public Observable<ResponseSuccess> verifyInterviewCode(String str) {
        int i2 = 2 % 2;
        int i3 = f7523x + 11;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        Observable<ResponseSuccess> observableG = this.f7525b.g(getToken(), str);
        int i5 = f7521v + 17;
        f7523x = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 11 / 0;
        }
        return observableG;
    }

    public Observable<ar> generateInterviewCode() {
        int i2 = 2 % 2;
        int i3 = f7523x + 93;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        Observable<ar> observableB = this.f7525b.b(getToken());
        int i5 = f7521v + 111;
        f7523x = i5 % 128;
        int i6 = i5 % 2;
        return observableB;
    }

    public /* synthetic */ ObservableSource d(String str, bh bhVar) throws Exception {
        int i2 = 2 % 2;
        int i3 = f7523x + 59;
        f7521v = i3 % 128;
        if (i3 % 2 == 0) {
            verifyFace(str);
            throw null;
        }
        Observable<ResponseVerifyFace> observableVerifyFace = verifyFace(str);
        int i4 = f7521v + 31;
        f7523x = i4 % 128;
        if (i4 % 2 == 0) {
            return observableVerifyFace;
        }
        throw null;
    }

    public Observable<ResponseVerifyFace> verifyFace(final String str) throws Throwable {
        int i2 = 2 % 2;
        if (a()) {
            Observable observableFlatMap = resumeOnboarding().flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda54
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.f$0.d(str, (bh) obj);
                }
            });
            int i3 = f7523x + 59;
            f7521v = i3 % 128;
            int i4 = i3 % 2;
            return observableFlatMap;
        }
        try {
            Observable<ResponseVerifyFace> observableE = this.f7525b.e(getToken(), str, getInterviewId());
            int i5 = f7523x + 89;
            f7521v = i5 % 128;
            if (i5 % 2 != 0) {
                return observableE;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Exception e2) {
            Timber.e(e2, "Couldn't encrypt image", new Object[0]);
            return Observable.error(e2);
        }
    }

    public Observable<ap> fetchFlowConfiguration() {
        int i2 = 2 % 2;
        int i3 = f7523x + 27;
        f7521v = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            this.f7525b.a(getToken());
            obj.hashCode();
            throw null;
        }
        Observable<ap> observableA = this.f7525b.a(getToken());
        int i4 = f7521v + 65;
        f7523x = i4 % 128;
        if (i4 % 2 == 0) {
            return observableA;
        }
        throw null;
    }

    public Single<be> fetchPhoneNumber() {
        int i2 = 2 % 2;
        int i3 = f7521v + 115;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        Single<be> singleD = this.f7525b.d(getToken());
        int i5 = f7521v + 89;
        f7523x = i5 % 128;
        if (i5 % 2 == 0) {
            return singleD;
        }
        throw null;
    }

    public Observable<as> fetchFlowIndexes() {
        int i2 = 2 % 2;
        int i3 = f7523x + 109;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        Observable<as> observableE = this.f7525b.e(getToken());
        int i5 = f7523x + 19;
        f7521v = i5 % 128;
        int i6 = i5 % 2;
        return observableE;
    }

    @Deprecated
    public Observable<aj> fetchAllFlows(String str) {
        int i2 = 2 % 2;
        int i3 = f7521v + 91;
        f7523x = i3 % 128;
        if (i3 % 2 != 0) {
            this.f7525b.f(str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Observable<aj> observableF = this.f7525b.f(str);
        int i4 = f7521v + 73;
        f7523x = i4 % 128;
        int i5 = i4 % 2;
        return observableF;
    }

    @Deprecated
    public Observable<Flow> fetchFlow(String str, String str2) {
        Observable<Flow> observableI;
        int i2 = 2 % 2;
        int i3 = f7523x + 9;
        f7521v = i3 % 128;
        if (i3 % 2 == 0) {
            observableI = this.f7525b.i(str, str2);
            int i4 = 58 / 0;
        } else {
            observableI = this.f7525b.i(str, str2);
        }
        int i5 = f7523x + 73;
        f7521v = i5 % 128;
        int i6 = i5 % 2;
        return observableI;
    }

    public Observable<List<Workflow>> fetchWorkflows(String str, int i2, int i3, String str2) {
        int i4 = 2 % 2;
        int i5 = f7523x + 55;
        f7521v = i5 % 128;
        int i6 = i5 % 2;
        Observable<List<Workflow>> observableE = this.f7525b.e(str, i2, i3, str2);
        int i7 = f7521v + 95;
        f7523x = i7 % 128;
        int i8 = i7 % 2;
        return observableE;
    }

    public Observable<ResponseWorkflowInfo> getWorkflowInfo() {
        int i2 = 2 % 2;
        int i3 = f7523x + 71;
        f7521v = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            this.f7525b.h(getToken());
            obj.hashCode();
            throw null;
        }
        Observable<ResponseWorkflowInfo> observableH = this.f7525b.h(getToken());
        int i4 = f7521v + 51;
        f7523x = i4 % 128;
        if (i4 % 2 == 0) {
            return observableH;
        }
        throw null;
    }

    public Observable<br> getWorkflowRootNode() {
        int i2 = 2 % 2;
        int i3 = f7523x + 105;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        Observable<br> observableJ = this.f7525b.j(getToken());
        int i5 = f7521v + 45;
        f7523x = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 72 / 0;
        }
        return observableJ;
    }

    public Observable<br> processWorkflowNode() {
        int i2 = 2 % 2;
        int i3 = f7523x + 121;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        Observable<br> observableG = this.f7525b.g(getToken());
        int i5 = f7523x + 115;
        f7521v = i5 % 128;
        int i6 = i5 % 2;
        return observableG;
    }

    public Observable<bi> fetchRegions() {
        int i2 = 2 % 2;
        int i3 = f7523x + 103;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        Observable<bi> observableC = this.f7525b.c();
        int i5 = f7523x + 37;
        f7521v = i5 % 128;
        if (i5 % 2 != 0) {
            return observableC;
        }
        throw null;
    }

    public /* synthetic */ ObservableSource b(IdProcessResult idProcessResult, bh bhVar) throws Exception {
        int i2 = 2 % 2;
        int i3 = f7523x + 31;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        Observable<Pair<IdProcessResult, bb>> observableFetchIdSummary = fetchIdSummary(idProcessResult);
        int i5 = f7523x + 5;
        f7521v = i5 % 128;
        int i6 = i5 % 2;
        return observableFetchIdSummary;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0016, code lost:
    
        if (a() != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0018, code lost:
    
        r2 = resumeOnboarding().flatMap(new com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda45(r4, r5));
        r1 = com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7523x + 13;
        com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7521v = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002e, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0035, code lost:
    
        if ((!a()) != true) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0038, code lost:
    
        r2 = r4.f7525b.i(getToken()).map(new com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda46(r5));
        r1 = com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7521v + 69;
        com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7523x = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        if ((r1 % 2) != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0058, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public io.reactivex.Observable<androidx.core.util.Pair<com.incode.welcome_sdk.results.IdProcessResult, com.incode.welcome_sdk.data.remote.beans.bb>> fetchIdSummary(final com.incode.welcome_sdk.results.IdProcessResult r5) {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7523x
            int r1 = r0 + 61
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7521v = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L2f
            boolean r1 = r4.a()
            r0 = 90
            int r0 = r0 / 0
            if (r1 == 0) goto L38
        L18:
            io.reactivex.Observable r1 = r4.resumeOnboarding()
            com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda45 r0 = new com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda45
            r0.<init>()
            io.reactivex.Observable r2 = r1.flatMap(r0)
            int r0 = com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7523x
            int r1 = r0 + 13
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7521v = r0
            int r1 = r1 % r3
            return r2
        L2f:
            boolean r1 = r4.a()
            r0 = 1
            r1 = r1 ^ r0
            if (r1 == r0) goto L38
            goto L18
        L38:
            com.incode.welcome_sdk.data.remote.h r1 = r4.f7525b
            java.lang.String r0 = r4.getToken()
            io.reactivex.Observable r1 = r1.i(r0)
            com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda46 r0 = new com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda46
            r0.<init>()
            io.reactivex.Observable r2 = r1.map(r0)
            int r0 = com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7521v
            int r1 = r0 + 69
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7523x = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L57
            return r2
        L57:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.IncodeWelcomeRepository.fetchIdSummary(com.incode.welcome_sdk.results.IdProcessResult):io.reactivex.Observable");
    }

    public static /* synthetic */ Pair c(IdProcessResult idProcessResult, bb bbVar) throws Exception {
        int i2 = 2 % 2;
        Pair pair = new Pair(idProcessResult, bbVar);
        int i3 = f7521v + 37;
        f7523x = i3 % 128;
        if (i3 % 2 == 0) {
            return pair;
        }
        throw null;
    }

    public String getModelAndLibsPath() {
        String str;
        int i2 = 2 % 2;
        int i3 = f7521v + 85;
        f7523x = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = {this.f7528e};
            int iD = IdCaptureScreenKt.bg.d();
            int iD2 = IdCaptureScreenKt.bg.d();
            str = (String) l.c(objArr, IdCaptureScreenKt.bg.d(), -877935218, IdCaptureScreenKt.bg.d(), iD2, 877935241, iD);
            int i4 = 29 / 0;
        } else {
            Object[] objArr2 = {this.f7528e};
            int iD3 = IdCaptureScreenKt.bg.d();
            int iD4 = IdCaptureScreenKt.bg.d();
            str = (String) l.c(objArr2, IdCaptureScreenKt.bg.d(), -877935218, IdCaptureScreenKt.bg.d(), iD4, 877935241, iD3);
        }
        int i5 = f7521v + 87;
        f7523x = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setModelAndLibsPath(String str) {
        int i2 = 2 % 2;
        int i3 = f7523x + 57;
        f7521v = i3 % 128;
        if (i3 % 2 != 0) {
            this.f7528e.e(str);
        } else {
            this.f7528e.e(str);
            throw null;
        }
    }

    public List<TemplateModel> getAllTemplates() {
        int i2 = 2 % 2;
        int i3 = f7521v + 21;
        f7523x = i3 % 128;
        if (i3 % 2 != 0) {
            this.f7528e.j();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<TemplateModel> listJ = this.f7528e.j();
        int i4 = f7523x + 23;
        f7521v = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 26 / 0;
        }
        return listJ;
    }

    public TemplateModel getTemplate() {
        TemplateModel templateModelF;
        int i2 = 2 % 2;
        int i3 = f7523x + 31;
        f7521v = i3 % 128;
        if (i3 % 2 == 0) {
            templateModelF = this.f7528e.f();
            int i4 = 76 / 0;
        } else {
            templateModelF = this.f7528e.f();
        }
        int i5 = f7523x + 49;
        f7521v = i5 % 128;
        int i6 = i5 % 2;
        return templateModelF;
    }

    public Completable addFace(FaceInfo faceInfo) {
        int i2 = 2 % 2;
        int i3 = f7523x + 29;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        Completable completableC = this.f7528e.c(faceInfo);
        int i5 = f7521v + 113;
        f7523x = i5 % 128;
        if (i5 % 2 == 0) {
            return completableC;
        }
        throw null;
    }

    public Completable removeFace(String str) {
        int i2 = 2 % 2;
        int i3 = f7521v + 5;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        l lVar = this.f7528e;
        if (i4 == 0) {
            int iD = IdCaptureScreenKt.bg.d();
            int iD2 = IdCaptureScreenKt.bg.d();
            return (Completable) l.c(new Object[]{lVar, str}, IdCaptureScreenKt.bg.d(), 446111069, IdCaptureScreenKt.bg.d(), iD2, -446111039, iD);
        }
        int iD3 = IdCaptureScreenKt.bg.d();
        int iD4 = IdCaptureScreenKt.bg.d();
        throw null;
    }

    public Completable removeAllFaces() {
        Completable completableI;
        int i2 = 2 % 2;
        int i3 = f7521v + 101;
        f7523x = i3 % 128;
        if (i3 % 2 != 0) {
            completableI = this.f7528e.i();
            int i4 = 84 / 0;
        } else {
            completableI = this.f7528e.i();
        }
        int i5 = f7521v + 89;
        f7523x = i5 % 128;
        int i6 = i5 % 2;
        return completableI;
    }

    public Completable setFaces(List<FaceInfo> list) {
        int i2 = 2 % 2;
        int i3 = f7521v + 99;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        Completable completableD = this.f7528e.d(list);
        int i5 = f7523x + 61;
        f7521v = i5 % 128;
        int i6 = i5 % 2;
        return completableD;
    }

    public Maybe<List<FaceInfo>> getFaces() {
        int i2 = 2 % 2;
        int i3 = f7523x + 47;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        Maybe<List<FaceInfo>> maybeG = this.f7528e.g();
        if (i4 == 0) {
            int i5 = 0 / 0;
        }
        return maybeG;
    }

    public Maybe<List<FaceInfo>> getFacesByCustomerId(String str) {
        int i2 = 2 % 2;
        int i3 = f7523x + 99;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        l lVar = this.f7528e;
        if (i4 != 0) {
            return lVar.a(str);
        }
        lVar.a(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Maybe<String> getCustomerUUIDByTemplateId(String str) {
        Maybe<String> maybeB;
        int i2 = 2 % 2;
        int i3 = f7523x + 101;
        f7521v = i3 % 128;
        if (i3 % 2 == 0) {
            maybeB = this.f7528e.b(str);
            int i4 = 7 / 0;
        } else {
            maybeB = this.f7528e.b(str);
        }
        int i5 = f7521v + 63;
        f7523x = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 25 / 0;
        }
        return maybeB;
    }

    public Completable addFaceLoginAttempt(com.incode.welcome_sdk.data.local.d dVar) {
        int i2 = 2 % 2;
        int i3 = f7523x + 103;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        Completable completableE = this.f7528e.e(dVar);
        int i5 = f7521v + 17;
        f7523x = i5 % 128;
        int i6 = i5 % 2;
        return completableE;
    }

    public Single<List<com.incode.welcome_sdk.data.local.d>> getFaceLoginAttemptsByStatus(List<com.incode.welcome_sdk.data.local.h> list) {
        int i2 = 2 % 2;
        int i3 = f7521v + 35;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        l lVar = this.f7528e;
        if (i4 == 0) {
            return lVar.b(list);
        }
        lVar.b(list);
        throw null;
    }

    public Single<List<com.incode.welcome_sdk.data.local.d>> getFaceLoginAttemptsByStatusFromCurrentSyncSession(List<com.incode.welcome_sdk.data.local.h> list, List<Long> list2) {
        int i2 = 2 % 2;
        int i3 = f7521v + 3;
        f7523x = i3 % 128;
        if (i3 % 2 != 0) {
            this.f7528e.b(list, list2);
            throw null;
        }
        Single<List<com.incode.welcome_sdk.data.local.d>> singleB = this.f7528e.b(list, list2);
        int i4 = f7521v + 107;
        f7523x = i4 % 128;
        if (i4 % 2 == 0) {
            return singleB;
        }
        throw null;
    }

    public Completable updateFaceLoginAttempt(com.incode.welcome_sdk.data.local.d dVar) {
        int i2 = 2 % 2;
        int i3 = f7523x + 111;
        f7521v = i3 % 128;
        if (i3 % 2 == 0) {
            this.f7528e.c(dVar);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Completable completableC = this.f7528e.c(dVar);
        int i4 = f7521v + 115;
        f7523x = i4 % 128;
        int i5 = i4 % 2;
        return completableC;
    }

    public Observable<bp> getQuestionAndAnswer(int i2, boolean z2) {
        int i3 = 2 % 2;
        int i4 = f7523x + 69;
        f7521v = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {this.f7525b, getToken(), Integer.valueOf(i2), Boolean.valueOf(z2)};
        int iC = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        Observable<bp> observable = (Observable) h.a(IdCaptureModuleScreenKt.e.AnonymousClass2.c(), -754212719, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), 754212728, objArr, iC, IdCaptureModuleScreenKt.e.AnonymousClass2.c());
        int i6 = f7521v + 65;
        f7523x = i6 % 128;
        if (i6 % 2 == 0) {
            return observable;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Observable<ResponseSuccess> addSpeech(File file) {
        int i2 = 2 % 2;
        int i3 = f7521v + 23;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.f7525b, getToken(), file};
        int iC = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        Observable<ResponseSuccess> observable = (Observable) h.a(IdCaptureModuleScreenKt.e.AnonymousClass2.c(), 1199331194, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), -1199331181, objArr, iC, IdCaptureModuleScreenKt.e.AnonymousClass2.c());
        int i5 = f7521v + 73;
        f7523x = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 87 / 0;
        }
        return observable;
    }

    public Observable<?> getEventsSignature() {
        int i2 = 2 % 2;
        int i3 = f7521v + 19;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        if (j()) {
            return Observable.just(new Object());
        }
        Observable<ResponseSignature> observableC = this.f7525b.c(getToken());
        int i5 = f7521v + 1;
        f7523x = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 67 / 0;
        }
        return observableC;
    }

    public /* synthetic */ ObservableSource e(File file, j.b bVar, bh bhVar) throws Exception {
        int i2 = 2 % 2;
        int i3 = f7523x + 83;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        Observable<ResponseSuccess> observableSendSignature = sendSignature(file, bVar);
        int i5 = f7521v + 107;
        f7523x = i5 % 128;
        int i6 = i5 % 2;
        return observableSendSignature;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0017, code lost:
    
        if (a() != true) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0019, code lost:
    
        r2 = r4.f7525b.a(getToken(), r5, r6);
        r1 = com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7521v + 47;
        com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7523x = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0031, code lost:
    
        if (a() != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
    
        return resumeOnboarding().flatMap(new com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda26(r4, r5, r6));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public io.reactivex.Observable<com.incode.welcome_sdk.data.remote.beans.ResponseSuccess> sendSignature(final java.io.File r5, final com.incode.welcome_sdk.data.remote.j.b r6) {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7523x
            int r1 = r0 + 23
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7521v = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L2d
            boolean r1 = r4.a()
            r0 = 32
            int r0 = r0 / 0
            r0 = 1
            if (r1 == r0) goto L33
        L19:
            com.incode.welcome_sdk.data.remote.h r1 = r4.f7525b
            java.lang.String r0 = r4.getToken()
            io.reactivex.Observable r2 = r1.a(r0, r5, r6)
            int r0 = com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7521v
            int r1 = r0 + 47
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7523x = r0
            int r1 = r1 % r3
            return r2
        L2d:
            boolean r0 = r4.a()
            if (r0 == 0) goto L19
        L33:
            io.reactivex.Observable r1 = r4.resumeOnboarding()
            com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda26 r0 = new com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda26
            r0.<init>()
            io.reactivex.Observable r0 = r1.flatMap(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.IncodeWelcomeRepository.sendSignature(java.io.File, com.incode.welcome_sdk.data.remote.j$b):io.reactivex.Observable");
    }

    public Observable<y> addCustomerToInterviewQueue(String str) {
        int i2 = 2 % 2;
        int i3 = f7523x + 81;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        Observable<y> observableU = this.f7525b.u(getToken(), str);
        int i5 = f7523x + 95;
        f7521v = i5 % 128;
        int i6 = i5 % 2;
        return observableU;
    }

    public Observable<au> getCustomerInterviewPosition(String str) {
        int i2 = 2 % 2;
        int i3 = f7523x + 3;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        h hVar = this.f7525b;
        if (i4 != 0) {
            return hVar.y(getToken(), str);
        }
        hVar.y(getToken(), str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Observable<at> getInterviewerInfo() {
        int i2 = 2 % 2;
        int i3 = f7521v + 67;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        Observable<at> observableQ = this.f7525b.q(getToken());
        int i5 = f7523x + 57;
        f7521v = i5 % 128;
        int i6 = i5 % 2;
        return observableQ;
    }

    public /* synthetic */ ObservableSource c(boolean z2, bh bhVar) throws Exception {
        int i2 = 2 % 2;
        int i3 = f7521v + 75;
        f7523x = i3 % 128;
        if (i3 % 2 == 0) {
            return getResults(z2);
        }
        getResults(z2);
        throw null;
    }

    public static /* synthetic */ ObservableSource b(Observable observable) throws Exception {
        int i2 = 2 % 2;
        int i3 = f7521v + 87;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        Observable observableDelay = observable.delay(3L, TimeUnit.SECONDS);
        int i5 = f7521v + 93;
        f7523x = i5 % 128;
        int i6 = i5 % 2;
        return observableDelay;
    }

    public /* synthetic */ boolean e(aq aqVar) throws Exception {
        int i2 = 2 % 2;
        int i3 = f7521v + 67;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        boolean zA = aqVar.a();
        if (i4 != 0) {
            int i5 = 56 / 0;
            if (zA) {
                return true;
            }
        } else if (zA) {
            return true;
        }
        if (this.f7527d == 7) {
            return true;
        }
        int i6 = f7521v + 111;
        f7523x = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ boolean a(com.incode.welcome_sdk.data.remote.beans.aq r5) throws java.lang.Exception {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7521v
            int r1 = r0 + 73
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7523x = r0
            int r1 = r1 % r3
            r2 = 1
            if (r1 == 0) goto L2b
            int r0 = r4.f7527d
            int r0 = r0 % r2
            r4.f7527d = r0
            boolean r0 = r5.a()
            if (r0 != 0) goto L1f
        L1a:
            int r1 = r4.f7527d
            r0 = 7
            if (r1 != r0) goto L39
        L1f:
            int r0 = com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7521v
            int r1 = r0 + 91
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7523x = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L37
            return r2
        L2b:
            int r0 = r4.f7527d
            int r0 = r0 + r2
            r4.f7527d = r0
            boolean r0 = r5.a()
            if (r0 != 0) goto L1f
            goto L1a
        L37:
            r0 = 0
            throw r0
        L39:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.IncodeWelcomeRepository.a(com.incode.welcome_sdk.data.remote.beans.aq):boolean");
    }

    public /* synthetic */ ObservableSource d(boolean z2, aq aqVar) throws Exception {
        int i2 = 2 % 2;
        int i3 = f7523x + 105;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.f7525b, getToken()};
        int iC = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        Observable observable = (Observable) h.a(IdCaptureModuleScreenKt.e.AnonymousClass2.c(), 654533145, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), -654533123, objArr, iC, IdCaptureModuleScreenKt.e.AnonymousClass2.c());
        int i5 = f7523x + 33;
        f7521v = i5 % 128;
        if (i5 % 2 != 0) {
            return observable;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ void h() throws Exception {
        int i2 = 2 % 2;
        int i3 = f7523x;
        int i4 = i3 + 71;
        f7521v = i4 % 128;
        int i5 = i4 % 2;
        this.f7527d = 0;
        int i6 = i3 + 91;
        f7521v = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Observable<bj> getResults(final boolean z2) {
        int i2 = 2 % 2;
        int i3 = f7523x + 7;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        if (!(!a())) {
            return resumeOnboarding().flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda69
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.f$0.c(z2, (bh) obj);
                }
            });
        }
        if (z2) {
            int i5 = f7521v + 107;
            f7523x = i5 % 128;
            int i6 = i5 % 2;
            return this.f7525b.p(getToken()).subscribeOn(Schedulers.io()).repeatWhen(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda70
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return IncodeWelcomeRepository.b((Observable) obj);
                }
            }).takeUntil(new Predicate() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda71
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    return this.f$0.e((aq) obj);
                }
            }).filter(new Predicate() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda72
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    return this.f$0.a((aq) obj);
                }
            }).flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda73
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.f$0.d(z2, (aq) obj);
                }
            }).doOnTerminate(new Action() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda74
                @Override // io.reactivex.functions.Action
                public final void run() throws Exception {
                    this.f$0.h();
                }
            });
        }
        return (Observable) h.a(IdCaptureModuleScreenKt.e.AnonymousClass2.c(), 654533145, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), -654533123, new Object[]{this.f7525b, getToken()}, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), IdCaptureModuleScreenKt.e.AnonymousClass2.c());
    }

    public /* synthetic */ ObservableSource b(bh bhVar) throws Exception {
        int i2 = 2 % 2;
        int i3 = f7523x + 89;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        Observable<aq> observableIsManualCorrectionFinished = isManualCorrectionFinished();
        int i5 = f7521v + 93;
        f7523x = i5 % 128;
        int i6 = i5 % 2;
        return observableIsManualCorrectionFinished;
    }

    public Observable<aq> isManualCorrectionFinished() {
        int i2 = 2 % 2;
        int i3 = f7521v + 39;
        f7523x = i3 % 128;
        if (i3 % 2 == 0) {
            if (a()) {
                return resumeOnboarding().flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda10
                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj) {
                        return this.f$0.b((bh) obj);
                    }
                });
            }
            Observable<aq> observableP = this.f7525b.p(getToken());
            int i4 = f7523x + 73;
            f7521v = i4 % 128;
            int i5 = i4 % 2;
            return observableP;
        }
        a();
        throw null;
    }

    public /* synthetic */ ObservableSource a(String str, bh bhVar) throws Exception {
        int i2 = 2 % 2;
        int i3 = f7523x + 91;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        Observable<w> observableApprove = approve(str);
        int i5 = f7523x + 13;
        f7521v = i5 % 128;
        if (i5 % 2 != 0) {
            return observableApprove;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0016, code lost:
    
        if (a() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0018, code lost:
    
        r1 = com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7523x + 123;
        com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7521v = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0021, code lost:
    
        if ((r1 % 2) == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0023, code lost:
    
        r2 = resumeOnboarding().flatMap(new com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda62(r4, r5));
        r1 = com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7521v + 71;
        com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7523x = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0039, code lost:
    
        if ((r1 % 2) == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x003b, code lost:
    
        r0 = 50 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0044, code lost:
    
        if (a() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0047, code lost:
    
        resumeOnboarding().flatMap(new com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda62(r4, r5));
        r0 = null;
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0057, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0079, code lost:
    
        return r4.f7525b.v(getToken(), r5).flatMap(new com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda63(r4), new com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda64(r4)).doOnNext(new com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda65(r4));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public io.reactivex.Observable<com.incode.welcome_sdk.data.remote.beans.w> approve(final java.lang.String r5) {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7521v
            int r1 = r0 + 103
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7523x = r0
            int r1 = r1 % r3
            if (r1 == 0) goto L40
            boolean r1 = r4.a()
            r0 = 48
            int r0 = r0 / 0
            if (r1 == 0) goto L58
        L18:
            int r0 = com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7523x
            int r1 = r0 + 123
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7521v = r0
            int r1 = r1 % r3
            if (r1 == 0) goto L47
            io.reactivex.Observable r1 = r4.resumeOnboarding()
            com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda62 r0 = new com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda62
            r0.<init>()
            io.reactivex.Observable r2 = r1.flatMap(r0)
            int r0 = com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7521v
            int r1 = r0 + 71
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.IncodeWelcomeRepository.f7523x = r0
            int r1 = r1 % r3
            if (r1 == 0) goto L3f
            r0 = 50
            int r0 = r0 / 0
        L3f:
            return r2
        L40:
            boolean r0 = r4.a()
            if (r0 == 0) goto L58
            goto L18
        L47:
            io.reactivex.Observable r1 = r4.resumeOnboarding()
            com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda62 r0 = new com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda62
            r0.<init>()
            r1.flatMap(r0)
            r0 = 0
            r0.hashCode()
            throw r0
        L58:
            com.incode.welcome_sdk.data.remote.h r1 = r4.f7525b
            java.lang.String r0 = r4.getToken()
            io.reactivex.Observable r2 = r1.v(r0, r5)
            com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda63 r1 = new com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda63
            r1.<init>()
            com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda64 r0 = new com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda64
            r0.<init>()
            io.reactivex.Observable r1 = r2.flatMap(r1, r0)
            com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda65 r0 = new com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda65
            r0.<init>()
            io.reactivex.Observable r0 = r1.doOnNext(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.IncodeWelcomeRepository.approve(java.lang.String):io.reactivex.Observable");
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        IncodeWelcomeRepository incodeWelcomeRepository = (IncodeWelcomeRepository) objArr[0];
        w wVar = (w) objArr[1];
        int i2 = 2 % 2;
        int i3 = f7521v + 57;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        String strB = wVar.b();
        if (i4 != 0) {
            incodeWelcomeRepository.fetchOCRData(strB);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Observable<ResponseOCRData> observableFetchOCRData = incodeWelcomeRepository.fetchOCRData(strB);
        int i5 = f7521v + 13;
        f7523x = i5 % 128;
        int i6 = i5 % 2;
        return observableFetchOCRData;
    }

    public /* synthetic */ w c(w wVar, ResponseOCRData responseOCRData) throws Exception {
        int i2 = 2 % 2;
        int i3 = f7523x + 117;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        b(responseOCRData);
        int i5 = f7521v + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f7523x = i5 % 128;
        int i6 = i5 % 2;
        return wVar;
    }

    public /* synthetic */ void e(w wVar) throws Exception {
        int i2 = 2 % 2;
        int i3 = f7523x + 107;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        setCustomerToken(wVar.b());
        int i5 = f7523x + 115;
        f7521v = i5 % 128;
        int i6 = i5 % 2;
    }

    private void b(ResponseOCRData responseOCRData) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f7523x + 7;
        f7521v = i3 % 128;
        if (i3 % 2 != 0) {
            setFullName(responseOCRData.getFullName());
            setFirstName(responseOCRData.getFirstName());
            setLastName(responseOCRData.getLastName());
            setGivenNameMrz(responseOCRData.getGivenNameMrz());
            setLastNameMrz(responseOCRData.getLastNameMrz());
            int i4 = f7521v + 95;
            f7523x = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        setFullName(responseOCRData.getFullName());
        setFirstName(responseOCRData.getFirstName());
        setLastName(responseOCRData.getLastName());
        setGivenNameMrz(responseOCRData.getGivenNameMrz());
        setLastNameMrz(responseOCRData.getLastNameMrz());
        throw null;
    }

    public String getFrontIdFaceCropPath() throws Throwable {
        int i2 = 2 % 2;
        StringBuilder sbAppend = new StringBuilder().append(getImagesDirectory()).append(RemoteSettings.FORWARD_SLASH_STRING);
        Object[] objArr = new Object[1];
        z("\f\u0011\u0013\u000e\u0002\u0016\u0017\u000f\u0013\u000e\u0001\u0018\u0018\r\u0016\u0017\u0012\f", (byte) (104 - (ViewConfiguration.getScrollBarSize() >> 8)), (ViewConfiguration.getTouchSlop() >> 8) + 18, objArr);
        String string = sbAppend.append(((String) objArr[0]).intern()).toString();
        int i3 = f7521v + 57;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    public String getFrontSecondIdFaceCropPath() throws Throwable {
        int i2 = 2 % 2;
        StringBuilder sbAppend = new StringBuilder().append(getImagesDirectory()).append(RemoteSettings.FORWARD_SLASH_STRING);
        Object[] objArr = new Object[1];
        y("\ufffb\ufff9\ufffe\ufff7\f\u0006\u0007\n\ufffe\ufff7￼\u0001\ufff7￼\u0006\u0007\ufffb�\u000b\b\u0007\n\ufffb\ufff7�", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 18, 25 - ExpandableListView.getPackedPositionGroup(0L), true, 110 - (Process.myTid() >> 22), objArr);
        String string = sbAppend.append(((String) objArr[0]).intern()).toString();
        int i3 = f7523x + 61;
        f7521v = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 44 / 0;
        }
        return string;
    }

    public String getCroppedSelfiePath() {
        int i2 = 2 % 2;
        StringBuilder sbAppend = new StringBuilder().append(getImagesDirectory()).append(RemoteSettings.FORWARD_SLASH_STRING);
        Object[] objArr = new Object[1];
        z("\u0012\u0018\u0006\u0005\b\u0016", (byte) (Color.alpha(0) + 24), 6 - (ViewConfiguration.getScrollBarSize() >> 8), objArr);
        String string = sbAppend.append(((String) objArr[0]).intern()).toString();
        int i3 = f7523x + 79;
        f7521v = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 25 / 0;
        }
        return string;
    }

    public String getFullFrameSelfiePath() {
        int i2 = 2 % 2;
        StringBuilder sbAppend = new StringBuilder().append(getImagesDirectory()).append(RemoteSettings.FORWARD_SLASH_STRING);
        Object[] objArr = new Object[1];
        y("\r\ufffe�\u0001\ufffe\u0004�\u000b\ufff7�\u0005\ufff9\n\ufffe\ufff7\u0004\u0004", 1 - TextUtils.indexOf((CharSequence) "", '0'), (Process.myTid() >> 22) + 17, true, TextUtils.getOffsetBefore("", 0) + 110, objArr);
        String string = sbAppend.append(((String) objArr[0]).intern()).toString();
        int i3 = f7521v + 3;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    public String getNfcSelfiePath() throws Throwable {
        int i2 = 2 % 2;
        StringBuilder sbAppend = new StringBuilder().append(getImagesDirectory()).append(RemoteSettings.FORWARD_SLASH_STRING);
        Object[] objArr = new Object[1];
        z("\u0018\u0005\u0018\u000b\u0012\u0018\u0006\u0005\b\u0016", (byte) (67 - TextUtils.indexOf((CharSequence) "", '0', 0)), 11 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr);
        String string = sbAppend.append(((String) objArr[0]).intern()).toString();
        int i3 = f7523x + 23;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    public String getVideoSelfiePath() throws Throwable {
        int i2 = 2 % 2;
        StringBuilder sbAppend = new StringBuilder().append(getImagesDirectory()).append(RemoteSettings.FORWARD_SLASH_STRING);
        Object[] objArr = new Object[1];
        z("\u0007\f\r\u0016\u000f\f\u0014\b\u0005\b\u0014\u0003\u0017\u000e㗾", (byte) (80 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 14 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr);
        String string = sbAppend.append(((String) objArr[0]).intern()).toString();
        int i3 = f7521v + 115;
        f7523x = i3 % 128;
        if (i3 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getVideoSelfieTempPath() throws Throwable {
        int i2 = 2 % 2;
        StringBuilder sbAppend = new StringBuilder().append(getImagesDirectory()).append(RemoteSettings.FORWARD_SLASH_STRING);
        Object[] objArr = new Object[1];
        z("\u0002\u0006\r\u0016\u0013\f\u0012\u0018\u0006\u0005\b\u0016\r\u0013\u0018\u0014\u000e\n\u0002\u0006\r\u0016㘹", (byte) (68 - (ViewConfiguration.getPressedStateDuration() >> 16)), 23 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr);
        String string = sbAppend.append(((String) objArr[0]).intern()).toString();
        int i3 = f7521v + 103;
        f7523x = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 32 / 0;
        }
        return string;
    }

    public String getVsSelfiePath() throws Throwable {
        int i2 = 2 % 2;
        StringBuilder sbAppend = new StringBuilder().append(getImagesDirectory()).append(RemoteSettings.FORWARD_SLASH_STRING);
        Object[] objArr = new Object[1];
        y("￼\uffff\ufffb\f\t\ufff5\t\ufffb\u0002", 3 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 10 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), false, 113 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
        String string = sbAppend.append(((String) objArr[0]).intern()).toString();
        int i3 = f7521v + 73;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    public String getVsIdFrontPath() throws Throwable {
        int i2 = 2 % 2;
        StringBuilder sbAppend = new StringBuilder().append(getImagesDirectory()).append(RemoteSettings.FORWARD_SLASH_STRING);
        Object[] objArr = new Object[1];
        z("\u0004\u0010\f\t\r\n\u0007\u0018\u000f\u0016㘫", (byte) (61 - Color.blue(0)), 11 - TextUtils.getOffsetAfter("", 0), objArr);
        String string = sbAppend.append(((String) objArr[0]).intern()).toString();
        int i3 = f7521v + 27;
        f7523x = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 66 / 0;
        }
        return string;
    }

    public String getVsIdBackPath() throws Throwable {
        int i2 = 2 % 2;
        StringBuilder sbAppend = new StringBuilder().append(getImagesDirectory()).append(RemoteSettings.FORWARD_SLASH_STRING);
        Object[] objArr = new Object[1];
        z("\u0004\u0010\f\t\r\n\t\u0003\u0001\u000b", (byte) (ExpandableListView.getPackedPositionChild(0L) + 13), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 10, objArr);
        String string = sbAppend.append(((String) objArr[0]).intern()).toString();
        int i3 = f7523x + 51;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    public String getVsDocumentPath() throws Throwable {
        int i2 = 2 % 2;
        StringBuilder sbAppend = new StringBuilder().append(getImagesDirectory()).append(RemoteSettings.FORWARD_SLASH_STRING);
        Object[] objArr = new Object[1];
        y("\ufff7\u0003\ufff8\ufff3\u0007\n\b\u0002\ufff9\u0001\t", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 6, 11 - TextUtils.indexOf("", "", 0, 0), true, (ViewConfiguration.getTouchSlop() >> 8) + 114, objArr);
        String string = sbAppend.append(((String) objArr[0]).intern()).toString();
        int i3 = f7521v + 107;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    public String getVsAudioPath() throws Throwable {
        int i2 = 2 % 2;
        StringBuilder sbAppend = new StringBuilder().append(getImagesDirectory()).append(RemoteSettings.FORWARD_SLASH_STRING);
        Object[] objArr = new Object[1];
        z("\u0004\u0010\u0013\t\u0011\u000b\f\u0016", (byte) (26 - TextUtils.getTrimmedLength("")), 8 - View.combineMeasuredStates(0, 0), objArr);
        String string = sbAppend.append(((String) objArr[0]).intern()).toString();
        int i3 = f7521v + 23;
        f7523x = i3 % 128;
        if (i3 % 2 == 0) {
            return string;
        }
        throw null;
    }

    public String getVsVoiceConsentSelfiePath() throws Throwable {
        int i2 = 2 % 2;
        StringBuilder sbAppend = new StringBuilder().append(getImagesDirectory()).append(RemoteSettings.FORWARD_SLASH_STRING);
        Object[] objArr = new Object[1];
        z("\u0004\u0010\u000b\u0004\u0016\f\u0016\u0018\u000b\u0018\u000f\u0016\u0012\u0018\u0017\u000f\u0013\u0018\u0014\b\u0005\b㙴", (byte) (KeyEvent.normalizeMetaState(0) + 117), (ViewConfiguration.getPressedStateDuration() >> 16) + 23, objArr);
        String string = sbAppend.append(((String) objArr[0]).intern()).toString();
        int i3 = f7523x + 31;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    public File getImagesDirectory() {
        int i2 = 2 % 2;
        int i3 = f7523x + 17;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        l lVar = this.f7528e;
        if (i4 != 0) {
            return lVar.e();
        }
        lVar.e();
        throw null;
    }

    public File getScreenRecordingsDirectory() {
        File file;
        int i2 = 2 % 2;
        int i3 = f7521v + 1;
        f7523x = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = {this.f7528e};
            int iD = IdCaptureScreenKt.bg.d();
            int iD2 = IdCaptureScreenKt.bg.d();
            file = (File) l.c(objArr, IdCaptureScreenKt.bg.d(), 1417893301, IdCaptureScreenKt.bg.d(), iD2, -1417893300, iD);
            int i4 = 75 / 0;
        } else {
            Object[] objArr2 = {this.f7528e};
            int iD3 = IdCaptureScreenKt.bg.d();
            int iD4 = IdCaptureScreenKt.bg.d();
            file = (File) l.c(objArr2, IdCaptureScreenKt.bg.d(), 1417893301, IdCaptureScreenKt.bg.d(), iD4, -1417893300, iD3);
        }
        int i5 = f7521v + 125;
        f7523x = i5 % 128;
        int i6 = i5 % 2;
        return file;
    }

    public File getVideoRecordingsDirectory() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f7521v + 53;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        File fileB = this.f7528e.b();
        int i5 = f7523x + 15;
        f7521v = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 69 / 0;
        }
        return fileB;
    }

    public File getInternalImagesDirectory() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f7523x + 9;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        File fileA = this.f7528e.a();
        if (i4 == 0) {
            int i5 = 65 / 0;
        }
        return fileA;
    }

    public File getDownloadsDirectory() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f7521v + 79;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        l lVar = this.f7528e;
        if (i4 == 0) {
            return lVar.c();
        }
        lVar.c();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getInterviewId() {
        int i2 = 2 % 2;
        int i3 = f7521v + 123;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        String strN = this.f7528e.n();
        int i5 = f7521v + 7;
        f7523x = i5 % 128;
        int i6 = i5 % 2;
        return strN;
    }

    public void setInterviewId(String str) {
        int i2 = 2 % 2;
        int i3 = f7523x + 79;
        f7521v = i3 % 128;
        if (i3 % 2 != 0) {
            this.f7528e.d(str);
        } else {
            this.f7528e.d(str);
            throw null;
        }
    }

    public String getExternalId() {
        int i2 = 2 % 2;
        int i3 = f7521v + 13;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        String strL = this.f7528e.l();
        int i5 = f7523x + 103;
        f7521v = i5 % 128;
        int i6 = i5 % 2;
        return strL;
    }

    public void setExternalId(String str) {
        int i2 = 2 % 2;
        int i3 = f7523x + 89;
        f7521v = i3 % 128;
        if (i3 % 2 == 0) {
            this.f7528e.f(str);
            int i4 = 5 / 0;
        } else {
            this.f7528e.f(str);
        }
    }

    public String getExternalCustomerId() {
        int i2 = 2 % 2;
        int i3 = f7521v + 95;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.f7528e};
        int iD = IdCaptureScreenKt.bg.d();
        int iD2 = IdCaptureScreenKt.bg.d();
        String str = (String) l.c(objArr, IdCaptureScreenKt.bg.d(), -307163058, IdCaptureScreenKt.bg.d(), iD2, 307163064, iD);
        int i5 = f7521v + 65;
        f7523x = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setExternalCustomerId(String str) {
        int i2 = 2 % 2;
        int i3 = f7521v + 21;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        this.f7528e.g(str);
        int i5 = f7521v + 91;
        f7523x = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 59 / 0;
        }
    }

    public String getLanguage() {
        int i2 = 2 % 2;
        int i3 = f7523x + 35;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        String strO = this.f7528e.o();
        int i5 = f7521v + 49;
        f7523x = i5 % 128;
        int i6 = i5 % 2;
        return strO;
    }

    public void setLanguage(String str) {
        int i2 = 2 % 2;
        int i3 = f7521v + 121;
        f7523x = i3 % 128;
        if (i3 % 2 == 0) {
            this.f7528e.j(str);
        } else {
            this.f7528e.j(str);
            throw null;
        }
    }

    public String getToken() {
        String strM;
        int i2 = 2 % 2;
        int i3 = f7523x + 13;
        f7521v = i3 % 128;
        if (i3 % 2 == 0) {
            strM = this.f7528e.m();
            int i4 = 34 / 0;
        } else {
            strM = this.f7528e.m();
        }
        int i5 = f7521v + 81;
        f7523x = i5 % 128;
        int i6 = i5 % 2;
        return strM;
    }

    public void setToken(String str) {
        int i2 = 2 % 2;
        int i3 = f7523x + 117;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.f7528e, str};
        int iD = IdCaptureScreenKt.bg.d();
        int iD2 = IdCaptureScreenKt.bg.d();
        l.c(objArr, IdCaptureScreenKt.bg.d(), 1414907619, IdCaptureScreenKt.bg.d(), iD2, -1414907604, iD);
        int i5 = f7521v + 115;
        f7523x = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 35 / 0;
        }
    }

    @Deprecated
    public String getCustomerToken() {
        int i2 = 2 % 2;
        int i3 = f7521v + 69;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        String strR = this.f7528e.r();
        int i5 = f7523x + 55;
        f7521v = i5 % 128;
        int i6 = i5 % 2;
        return strR;
    }

    @Deprecated
    public void setCustomerToken(String str) {
        int i2 = 2 % 2;
        int i3 = f7521v + 111;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        this.f7528e.h(str);
        int i5 = f7523x + 111;
        f7521v = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getInterviewToken() {
        int i2 = 2 % 2;
        int i3 = f7521v + 71;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        l lVar = this.f7528e;
        if (i4 == 0) {
            int iD = IdCaptureScreenKt.bg.d();
            int iD2 = IdCaptureScreenKt.bg.d();
            return (String) l.c(new Object[]{lVar}, IdCaptureScreenKt.bg.d(), -227128498, IdCaptureScreenKt.bg.d(), iD2, 227128527, iD);
        }
        int iD3 = IdCaptureScreenKt.bg.d();
        int iD4 = IdCaptureScreenKt.bg.d();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setInterviewToken(String str) {
        int i2 = 2 % 2;
        int i3 = f7521v + 113;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        this.f7528e.l(str);
        int i5 = f7523x + 79;
        f7521v = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public String getInterviewSessionId() {
        int i2 = 2 % 2;
        int i3 = f7523x + 67;
        f7521v = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            this.f7528e.p();
            throw null;
        }
        String strP = this.f7528e.p();
        int i4 = f7523x + 33;
        f7521v = i4 % 128;
        if (i4 % 2 != 0) {
            return strP;
        }
        obj.hashCode();
        throw null;
    }

    public void setInterviewSessionId(String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f7521v + 63;
        f7523x = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = {this.f7528e, str};
            int iD = IdCaptureScreenKt.bg.d();
            int iD2 = IdCaptureScreenKt.bg.d();
            l.c(objArr, IdCaptureScreenKt.bg.d(), 1624993600, IdCaptureScreenKt.bg.d(), iD2, -1624993579, iD);
            int i4 = 1 / 0;
        } else {
            Object[] objArr2 = {this.f7528e, str};
            int iD3 = IdCaptureScreenKt.bg.d();
            int iD4 = IdCaptureScreenKt.bg.d();
            l.c(objArr2, IdCaptureScreenKt.bg.d(), 1624993600, IdCaptureScreenKt.bg.d(), iD4, -1624993579, iD3);
        }
        int i5 = f7523x + 125;
        f7521v = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getInterviewCode() {
        int i2 = 2 % 2;
        int i3 = f7523x + 97;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        l lVar = this.f7528e;
        if (i4 != 0) {
            return lVar.q();
        }
        lVar.q();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setInterviewCode(String str) {
        int i2 = 2 % 2;
        int i3 = f7521v + 91;
        f7523x = i3 % 128;
        if (i3 % 2 != 0) {
            this.f7528e.o(str);
            int i4 = 53 / 0;
        } else {
            this.f7528e.o(str);
        }
        int i5 = f7523x + 83;
        f7521v = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 63 / 0;
        }
    }

    public boolean isOptInEnabled() {
        int i2 = 2 % 2;
        int i3 = f7521v + 73;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = this.f7539p;
        if (i4 != 0) {
            int i5 = 36 / 0;
        }
        return z2;
    }

    public void setOptInEnabled(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f7523x + 49;
        int i4 = i3 % 128;
        f7521v = i4;
        int i5 = i3 % 2;
        this.f7539p = z2;
        int i6 = i4 + 59;
        f7523x = i6 % 128;
        int i7 = i6 % 2;
    }

    public boolean isSkipGlareBackId() {
        int i2 = 2 % 2;
        int i3 = f7521v + 69;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = this.f7541r;
        if (i4 != 0) {
            int i5 = 18 / 0;
        }
        return z2;
    }

    public void setSkipGlareBackId(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f7521v + 57;
        int i4 = i3 % 128;
        f7523x = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            this.f7541r = z2;
            int i5 = i4 + 97;
            f7521v = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        this.f7541r = z2;
        obj.hashCode();
        throw null;
    }

    public String getOptInCompanyName() {
        int i2 = 2 % 2;
        int i3 = f7521v + 113;
        f7523x = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f7540q;
        }
        throw null;
    }

    public void setOptInCompanyName(String str) {
        int i2 = 2 % 2;
        int i3 = f7523x + 5;
        f7521v = i3 % 128;
        if (i3 % 2 != 0) {
            this.f7540q = str;
        } else {
            this.f7540q = str;
            throw null;
        }
    }

    public void setIdCic(String str) {
        int i2 = 2 % 2;
        int i3 = f7523x + 9;
        f7521v = i3 % 128;
        if (i3 % 2 == 0) {
            this.f7528e.k(str);
            int i4 = 86 / 0;
        } else {
            this.f7528e.k(str);
        }
    }

    public String getIdCic() {
        int i2 = 2 % 2;
        int i3 = f7523x + 105;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        String strT = this.f7528e.t();
        int i5 = f7523x + 111;
        f7521v = i5 % 128;
        int i6 = i5 % 2;
        return strT;
    }

    public String getFullName() {
        int i2 = 2 % 2;
        int i3 = f7521v + 25;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.f7528e};
        int iD = IdCaptureScreenKt.bg.d();
        int iD2 = IdCaptureScreenKt.bg.d();
        String str = (String) l.c(objArr, IdCaptureScreenKt.bg.d(), -1100990969, IdCaptureScreenKt.bg.d(), iD2, 1100990991, iD);
        int i5 = f7523x + 111;
        f7521v = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public void setFullName(String str) {
        int i2 = 2 % 2;
        int i3 = f7521v + 99;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        this.f7528e.t(str);
        int i5 = f7521v + 25;
        f7523x = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getFullNameSecondId() {
        int i2 = 2 % 2;
        int i3 = f7521v + 13;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.f7528e};
        int iD = IdCaptureScreenKt.bg.d();
        int iD2 = IdCaptureScreenKt.bg.d();
        String str = (String) l.c(objArr, IdCaptureScreenKt.bg.d(), -1048009840, IdCaptureScreenKt.bg.d(), iD2, 1048009849, iD);
        int i5 = f7521v + 7;
        f7523x = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setFullNameSecondId(String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f7521v + 91;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.f7528e, str};
        int iD = IdCaptureScreenKt.bg.d();
        int iD2 = IdCaptureScreenKt.bg.d();
        l.c(objArr, IdCaptureScreenKt.bg.d(), -733612198, IdCaptureScreenKt.bg.d(), iD2, 733612215, iD);
        int i5 = f7523x + 117;
        f7521v = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getFirstName() {
        int i2 = 2 % 2;
        int i3 = f7521v + 43;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        String strW = this.f7528e.w();
        int i5 = f7521v + 95;
        f7523x = i5 % 128;
        if (i5 % 2 == 0) {
            return strW;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setFirstName(String str) {
        int i2 = 2 % 2;
        int i3 = f7521v + 33;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        this.f7528e.r(str);
        int i5 = f7521v + 33;
        f7523x = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getMiddleName() {
        int i2 = 2 % 2;
        int i3 = f7523x + 29;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        String strZ = this.f7528e.z();
        int i5 = f7523x + 43;
        f7521v = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 71 / 0;
        }
        return strZ;
    }

    public void setMiddleName(String str) {
        int i2 = 2 % 2;
        int i3 = f7523x + 77;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        this.f7528e.C(str);
        int i5 = f7521v + 115;
        f7523x = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getLastName() {
        int i2 = 2 % 2;
        int i3 = f7521v + 121;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        String strE = this.f7528e.E();
        int i5 = f7521v + 37;
        f7523x = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 71 / 0;
        }
        return strE;
    }

    public void setLastName(String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f7523x + 83;
        f7521v = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = {this.f7528e, str};
            int iD = IdCaptureScreenKt.bg.d();
            int iD2 = IdCaptureScreenKt.bg.d();
            l.c(objArr, IdCaptureScreenKt.bg.d(), 1006838269, IdCaptureScreenKt.bg.d(), iD2, -1006838245, iD);
            int i4 = f7523x + 59;
            f7521v = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        Object[] objArr2 = {this.f7528e, str};
        int iD3 = IdCaptureScreenKt.bg.d();
        int iD4 = IdCaptureScreenKt.bg.d();
        l.c(objArr2, IdCaptureScreenKt.bg.d(), 1006838269, IdCaptureScreenKt.bg.d(), iD4, -1006838245, iD3);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setGivenNameMrz(String str) {
        int i2 = 2 % 2;
        int i3 = f7521v + 117;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        this.f7528e.y(str);
        int i5 = f7523x + 71;
        f7521v = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setLastNameMrz(String str) {
        int i2 = 2 % 2;
        int i3 = f7523x + 105;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        this.f7528e.z(str);
        int i5 = f7523x + 55;
        f7521v = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 93 / 0;
        }
    }

    public String getGivenNameMrz() {
        int i2 = 2 % 2;
        int i3 = f7523x + 99;
        f7521v = i3 % 128;
        if (i3 % 2 == 0) {
            this.f7528e.D();
            throw null;
        }
        String strD = this.f7528e.D();
        int i4 = f7521v + 123;
        f7523x = i4 % 128;
        int i5 = i4 % 2;
        return strD;
    }

    public String getLastNameMrz() {
        int i2 = 2 % 2;
        int i3 = f7523x + 29;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        l lVar = this.f7528e;
        if (i4 != 0) {
            return lVar.B();
        }
        lVar.B();
        throw null;
    }

    public String getBirthDate() {
        int i2 = 2 % 2;
        int i3 = f7521v + 69;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        String strQ = this.f7528e.Q();
        int i5 = f7521v + 113;
        f7523x = i5 % 128;
        int i6 = i5 % 2;
        return strQ;
    }

    public void setBirthDate(String str) {
        int i2 = 2 % 2;
        int i3 = f7523x + 81;
        f7521v = i3 % 128;
        if (i3 % 2 != 0) {
            this.f7528e.X(str);
        } else {
            this.f7528e.X(str);
            throw null;
        }
    }

    public String getBirthDateSecondId() {
        int i2 = 2 % 2;
        int i3 = f7523x + 29;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        String strS = this.f7528e.S();
        int i5 = f7523x + 83;
        f7521v = i5 % 128;
        if (i5 % 2 != 0) {
            return strS;
        }
        throw null;
    }

    public void setBirthDateSecondId(String str) {
        int i2 = 2 % 2;
        int i3 = f7521v + 87;
        f7523x = i3 % 128;
        if (i3 % 2 == 0) {
            this.f7528e.T(str);
            return;
        }
        this.f7528e.T(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getIssuingCountry() {
        int i2 = 2 % 2;
        int i3 = f7521v + 107;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.f7528e};
        int iD = IdCaptureScreenKt.bg.d();
        int iD2 = IdCaptureScreenKt.bg.d();
        String str = (String) l.c(objArr, IdCaptureScreenKt.bg.d(), -521630438, IdCaptureScreenKt.bg.d(), iD2, 521630464, iD);
        int i5 = f7523x + 101;
        f7521v = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public void setIssuingCountry(String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f7521v + 77;
        f7523x = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Object[] objArr = {this.f7528e, str};
            int iD = IdCaptureScreenKt.bg.d();
            int iD2 = IdCaptureScreenKt.bg.d();
            l.c(objArr, IdCaptureScreenKt.bg.d(), -980866501, IdCaptureScreenKt.bg.d(), iD2, 980866520, iD);
            int i4 = f7521v + 49;
            f7523x = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        Object[] objArr2 = {this.f7528e, str};
        int iD3 = IdCaptureScreenKt.bg.d();
        int iD4 = IdCaptureScreenKt.bg.d();
        l.c(objArr2, IdCaptureScreenKt.bg.d(), -980866501, IdCaptureScreenKt.bg.d(), iD4, 980866520, iD3);
        obj.hashCode();
        throw null;
    }

    public String getCurp() {
        int i2 = 2 % 2;
        int i3 = f7523x + 41;
        f7521v = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = {this.f7528e};
            int iD = IdCaptureScreenKt.bg.d();
            int iD2 = IdCaptureScreenKt.bg.d();
            throw null;
        }
        Object[] objArr2 = {this.f7528e};
        int iD3 = IdCaptureScreenKt.bg.d();
        int iD4 = IdCaptureScreenKt.bg.d();
        String str = (String) l.c(objArr2, IdCaptureScreenKt.bg.d(), 1655469593, IdCaptureScreenKt.bg.d(), iD4, -1655469561, iD3);
        int i4 = f7523x + 111;
        f7521v = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public void setCurp(String str) {
        int i2 = 2 % 2;
        int i3 = f7521v + 45;
        f7523x = i3 % 128;
        if (i3 % 2 == 0) {
            this.f7528e.N(str);
            int i4 = f7521v + 97;
            f7523x = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        this.f7528e.N(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getAddress() {
        int i2 = 2 % 2;
        int i3 = f7523x + 95;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        String strG = this.f7528e.G();
        int i5 = f7523x + 53;
        f7521v = i5 % 128;
        int i6 = i5 % 2;
        return strG;
    }

    public void setAddress(String str) {
        int i2 = 2 % 2;
        int i3 = f7521v + 91;
        f7523x = i3 % 128;
        if (i3 % 2 == 0) {
            this.f7528e.L(str);
        } else {
            this.f7528e.L(str);
            throw null;
        }
    }

    public String getState() {
        int i2 = 2 % 2;
        int i3 = f7523x + 45;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        String strN = this.f7528e.N();
        int i5 = f7521v + 117;
        f7523x = i5 % 128;
        if (i5 % 2 == 0) {
            return strN;
        }
        throw null;
    }

    public void setState(String str) {
        int i2 = 2 % 2;
        int i3 = f7521v + 83;
        f7523x = i3 % 128;
        if (i3 % 2 == 0) {
            this.f7528e.K(str);
            int i4 = f7521v + 39;
            f7523x = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        this.f7528e.K(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getCity() {
        int i2 = 2 % 2;
        int i3 = f7521v + 117;
        f7523x = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.f7528e.L();
            obj.hashCode();
            throw null;
        }
        String strL = this.f7528e.L();
        int i4 = f7521v + 57;
        f7523x = i4 % 128;
        if (i4 % 2 == 0) {
            return strL;
        }
        throw null;
    }

    public void setCity(String str) {
        int i2 = 2 % 2;
        int i3 = f7523x + 27;
        f7521v = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.f7528e.Q(str);
            int i4 = f7521v + 117;
            f7523x = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        this.f7528e.Q(str);
        obj.hashCode();
        throw null;
    }

    public String getPostalCode() {
        int i2 = 2 % 2;
        int i3 = f7523x + 19;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        String strJ = this.f7528e.J();
        int i5 = f7523x + 75;
        f7521v = i5 % 128;
        if (i5 % 2 != 0) {
            return strJ;
        }
        throw null;
    }

    public void setPostalCode(String str) {
        int i2 = 2 % 2;
        int i3 = f7521v + 101;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        this.f7528e.P(str);
        int i5 = f7523x + 71;
        f7521v = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public String getStreet() {
        int i2 = 2 % 2;
        int i3 = f7521v + 1;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        String strK = this.f7528e.K();
        int i5 = f7523x + 103;
        f7521v = i5 % 128;
        int i6 = i5 % 2;
        return strK;
    }

    public void setStreet(String str) {
        int i2 = 2 % 2;
        int i3 = f7523x + 27;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        this.f7528e.W(str);
        int i5 = f7523x + 77;
        f7521v = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 40 / 0;
        }
    }

    public String getHouseNumber() {
        int i2 = 2 % 2;
        int i3 = f7521v + 107;
        f7523x = i3 % 128;
        if (i3 % 2 != 0) {
            this.f7528e.M();
            throw null;
        }
        String strM = this.f7528e.M();
        int i4 = f7521v + 15;
        f7523x = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 37 / 0;
        }
        return strM;
    }

    public void setHouseNumber(String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f7521v + 111;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.f7528e, str};
        int iD = IdCaptureScreenKt.bg.d();
        int iD2 = IdCaptureScreenKt.bg.d();
        l.c(objArr, IdCaptureScreenKt.bg.d(), 1439940989, IdCaptureScreenKt.bg.d(), iD2, -1439940962, iD);
        int i5 = f7521v + 51;
        f7523x = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getGender() {
        int i2 = 2 % 2;
        int i3 = f7521v + 5;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        String strH = this.f7528e.H();
        int i5 = f7523x + 103;
        f7521v = i5 % 128;
        int i6 = i5 % 2;
        return strH;
    }

    public void setGender(String str) {
        int i2 = 2 % 2;
        int i3 = f7523x + 123;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        this.f7528e.F(str);
        int i5 = f7521v + 89;
        f7523x = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getDocumentNumber() {
        int i2 = 2 % 2;
        int i3 = f7521v + 51;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        String strR = this.f7528e.R();
        int i5 = f7521v + 39;
        f7523x = i5 % 128;
        int i6 = i5 % 2;
        return strR;
    }

    public void setDocumentNumber(String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f7521v + 27;
        f7523x = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = {this.f7528e, str};
            int iD = IdCaptureScreenKt.bg.d();
            int iD2 = IdCaptureScreenKt.bg.d();
            l.c(objArr, IdCaptureScreenKt.bg.d(), 628589234, IdCaptureScreenKt.bg.d(), iD2, -628589226, iD);
            return;
        }
        Object[] objArr2 = {this.f7528e, str};
        int iD3 = IdCaptureScreenKt.bg.d();
        int iD4 = IdCaptureScreenKt.bg.d();
        l.c(objArr2, IdCaptureScreenKt.bg.d(), 628589234, IdCaptureScreenKt.bg.d(), iD4, -628589226, iD3);
        throw null;
    }

    public String getDocumentNumberSecondId() {
        int i2 = 2 % 2;
        int i3 = f7523x + 121;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        l lVar = this.f7528e;
        if (i4 != 0) {
            return lVar.P();
        }
        lVar.P();
        throw null;
    }

    public void setDocumentNumberSecondId(String str) {
        int i2 = 2 % 2;
        int i3 = f7521v + 77;
        f7523x = i3 % 128;
        if (i3 % 2 == 0) {
            this.f7528e.ab(str);
            int i4 = f7523x + 91;
            f7521v = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 36 / 0;
                return;
            }
            return;
        }
        this.f7528e.ab(str);
        throw null;
    }

    public String getExpireAt() {
        int i2 = 2 % 2;
        int i3 = f7521v + 125;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        String strO = this.f7528e.O();
        int i5 = f7521v + 99;
        f7523x = i5 % 128;
        int i6 = i5 % 2;
        return strO;
    }

    public void setExpireAt(String str) {
        int i2 = 2 % 2;
        int i3 = f7521v + 91;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        this.f7528e.Y(str);
        int i5 = f7523x + 11;
        f7521v = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public String getExpireAtSecondId() {
        int i2 = 2 % 2;
        int i3 = f7523x + 57;
        f7521v = i3 % 128;
        if (i3 % 2 == 0) {
            this.f7528e.T();
            throw null;
        }
        String strT = this.f7528e.T();
        int i4 = f7523x + 71;
        f7521v = i4 % 128;
        int i5 = i4 % 2;
        return strT;
    }

    public void setExpireAtSecondId(String str) {
        int i2 = 2 % 2;
        int i3 = f7523x + 91;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        this.f7528e.Z(str);
        int i5 = f7523x + 103;
        f7521v = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void e(com.incode.welcome_sdk.data.remote.beans.ResponseOCRData r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.IncodeWelcomeRepository.e(com.incode.welcome_sdk.data.remote.beans.ResponseOCRData):void");
    }

    private void c(ResponseOCRData responseOCRData) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f7523x + 23;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.f7528e, responseOCRData.getFullName()};
        int iD = IdCaptureScreenKt.bg.d();
        int iD2 = IdCaptureScreenKt.bg.d();
        l.c(objArr, IdCaptureScreenKt.bg.d(), -733612198, IdCaptureScreenKt.bg.d(), iD2, 733612215, iD);
        this.f7528e.q(responseOCRData.getFirstName());
        this.f7528e.B(responseOCRData.getMiddleName());
        this.f7528e.G(responseOCRData.getLastName());
        this.f7528e.E(responseOCRData.getGender());
        Object[] objArr2 = {this.f7528e, responseOCRData.getAddress()};
        int iD3 = IdCaptureScreenKt.bg.d();
        int iD4 = IdCaptureScreenKt.bg.d();
        l.c(objArr2, IdCaptureScreenKt.bg.d(), -1186198374, IdCaptureScreenKt.bg.d(), iD4, 1186198384, iD3);
        this.f7528e.v(responseOCRData.getGivenNameMrz());
        this.f7528e.D(responseOCRData.getLastNameMrz());
        ResponseOCRData.e addressFields = responseOCRData.getAddressFields();
        this.f7528e.S(addressFields.b());
        Object[] objArr3 = {this.f7528e, addressFields.a()};
        int iD5 = IdCaptureScreenKt.bg.d();
        int iD6 = IdCaptureScreenKt.bg.d();
        l.c(objArr3, IdCaptureScreenKt.bg.d(), 1399392376, IdCaptureScreenKt.bg.d(), iD6, -1399392372, iD5);
        Object[] objArr4 = {this.f7528e, addressFields.c()};
        int iD7 = IdCaptureScreenKt.bg.d();
        int iD8 = IdCaptureScreenKt.bg.d();
        l.c(objArr4, IdCaptureScreenKt.bg.d(), 1100190799, IdCaptureScreenKt.bg.d(), iD8, -1100190779, iD7);
        this.f7528e.R(addressFields.d());
        setBirthDateSecondId(responseOCRData.getBirthDate());
        Object[] objArr5 = {this.f7528e, responseOCRData.getIssuingCountry()};
        int iD9 = IdCaptureScreenKt.bg.d();
        int iD10 = IdCaptureScreenKt.bg.d();
        l.c(objArr5, IdCaptureScreenKt.bg.d(), -1299927848, IdCaptureScreenKt.bg.d(), iD10, 1299927862, iD9);
        this.f7528e.M(responseOCRData.getCurp());
        this.f7528e.n(responseOCRData.getCic());
        Map<String, Object> extendedOcrJsonData = responseOCRData.getExtendedOcrJsonData();
        Object obj = extendedOcrJsonData.get("documentNumber");
        Object obj2 = null;
        if (obj == null) {
            int i5 = f7523x + 117;
            f7521v = i5 % 128;
            if (i5 % 2 == 0) {
                TextUtils.isEmpty(responseOCRData.getCic());
                throw null;
            }
            String cic = responseOCRData.getCic();
            if (TextUtils.isEmpty(cic)) {
                cic = "";
            }
            setDocumentNumberSecondId(cic);
        } else {
            setDocumentNumberSecondId(obj.toString());
        }
        Object obj3 = extendedOcrJsonData.get("expireAt");
        if (obj3 != null) {
            setExpireAtSecondId(obj3.toString());
            int i6 = f7521v + 125;
            f7523x = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        int i8 = f7521v + 101;
        f7523x = i8 % 128;
        if (i8 % 2 == 0) {
            setExpireAtSecondId("");
        } else {
            setExpireAtSecondId("");
            obj2.hashCode();
            throw null;
        }
    }

    public void setPoaState(String str) {
        int i2 = 2 % 2;
        int i3 = f7523x + 99;
        f7521v = i3 % 128;
        if (i3 % 2 == 0) {
            this.f7528e.s(str);
            int i4 = 23 / 0;
        } else {
            this.f7528e.s(str);
        }
        int i5 = f7521v + 43;
        f7523x = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public String getPoaState() {
        String strY;
        int i2 = 2 % 2;
        int i3 = f7521v + 7;
        f7523x = i3 % 128;
        if (i3 % 2 != 0) {
            strY = this.f7528e.y();
            int i4 = 56 / 0;
        } else {
            strY = this.f7528e.y();
        }
        int i5 = f7523x + 43;
        f7521v = i5 % 128;
        if (i5 % 2 != 0) {
            return strY;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setPoaCity(String str) {
        int i2 = 2 % 2;
        int i3 = f7521v + 61;
        f7523x = i3 % 128;
        if (i3 % 2 == 0) {
            this.f7528e.w(str);
            return;
        }
        this.f7528e.w(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getPoaCity() {
        int i2 = 2 % 2;
        int i3 = f7523x + 17;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        l lVar = this.f7528e;
        if (i4 != 0) {
            return lVar.u();
        }
        lVar.u();
        throw null;
    }

    public void setPoaPostalCode(String str) {
        int i2 = 2 % 2;
        int i3 = f7521v + 77;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        this.f7528e.u(str);
        int i5 = f7521v + 29;
        f7523x = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getPoaPostalCode() {
        int i2 = 2 % 2;
        int i3 = f7521v + 125;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        String strC = this.f7528e.C();
        int i5 = f7521v + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f7523x = i5 % 128;
        if (i5 % 2 == 0) {
            return strC;
        }
        throw null;
    }

    public void setPoaStreet(String str) {
        int i2 = 2 % 2;
        int i3 = f7523x + 55;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        this.f7528e.x(str);
        int i5 = f7523x + 37;
        f7521v = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 83 / 0;
        }
    }

    public String getPoaStreet() {
        int i2 = 2 % 2;
        int i3 = f7523x + 121;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        String strA = this.f7528e.A();
        int i5 = f7523x + 93;
        f7521v = i5 % 128;
        int i6 = i5 % 2;
        return strA;
    }

    public String getCurrentLocation() {
        int i2 = 2 % 2;
        int i3 = f7523x + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        l lVar = this.f7528e;
        if (i4 != 0) {
            int iD = IdCaptureScreenKt.bg.d();
            int iD2 = IdCaptureScreenKt.bg.d();
            return (String) l.c(new Object[]{lVar}, IdCaptureScreenKt.bg.d(), 1284818193, IdCaptureScreenKt.bg.d(), iD2, -1284818168, iD);
        }
        int iD3 = IdCaptureScreenKt.bg.d();
        int iD4 = IdCaptureScreenKt.bg.d();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setCurrentLocation(String str) {
        int i2 = 2 % 2;
        int i3 = f7521v + 41;
        f7523x = i3 % 128;
        if (i3 % 2 != 0) {
            this.f7528e.aa(str);
            int i4 = 73 / 0;
        } else {
            this.f7528e.aa(str);
        }
        int i5 = f7523x + 49;
        f7521v = i5 % 128;
        int i6 = i5 % 2;
    }

    public void persistSessionConfig(SessionConfig sessionConfig) {
        int i2 = 2 % 2;
        int i3 = f7521v + 53;
        f7523x = i3 % 128;
        if (i3 % 2 == 0) {
            this.f7528e.b(sessionConfig);
            int i4 = f7523x + 13;
            f7521v = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 46 / 0;
                return;
            }
            return;
        }
        this.f7528e.b(sessionConfig);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public SessionConfig getPersistedSessionConfig() {
        int i2 = 2 % 2;
        int i3 = f7521v + 121;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.f7528e};
        int iD = IdCaptureScreenKt.bg.d();
        int iD2 = IdCaptureScreenKt.bg.d();
        SessionConfig sessionConfig = (SessionConfig) l.c(objArr, IdCaptureScreenKt.bg.d(), -1976679355, IdCaptureScreenKt.bg.d(), iD2, 1976679366, iD);
        int i5 = f7521v + 69;
        f7523x = i5 % 128;
        if (i5 % 2 == 0) {
            return sessionConfig;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void persistCommonConfig(CommonConfig commonConfig) {
        int i2 = 2 % 2;
        int i3 = f7523x + 105;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        this.f7528e.b(commonConfig);
        int i5 = f7523x + 99;
        f7521v = i5 % 128;
        int i6 = i5 % 2;
    }

    public CommonConfig getPersistedCommonConfig() {
        int i2 = 2 % 2;
        int i3 = f7521v + 117;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        CommonConfig commonConfigV = this.f7528e.V();
        int i5 = f7521v + 75;
        f7523x = i5 % 128;
        int i6 = i5 % 2;
        return commonConfigV;
    }

    public void persistIdFrontResult(IdScanResult idScanResult) {
        int i2 = 2 % 2;
        int i3 = f7521v + 43;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        this.f7528e.a(idScanResult);
        int i5 = f7523x + 91;
        f7521v = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public void persistIdBackResult(IdScanResult idScanResult) {
        int i2 = 2 % 2;
        int i3 = f7523x + 63;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        this.f7528e.e(idScanResult);
        int i5 = f7523x + 121;
        f7521v = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public IdScanResult getIdFrontResult() {
        int i2 = 2 % 2;
        int i3 = f7521v + 117;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        IdScanResult idScanResultU = this.f7528e.U();
        int i5 = f7521v + 1;
        f7523x = i5 % 128;
        if (i5 % 2 == 0) {
            return idScanResultU;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public IdScanResult getIdBackResult() {
        int i2 = 2 % 2;
        int i3 = f7523x + 49;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        IdScanResult idScanResultAa = this.f7528e.aa();
        int i5 = f7523x + 123;
        f7521v = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 44 / 0;
        }
        return idScanResultAa;
    }

    private void i() {
        int i2 = 2 % 2;
        int i3 = f7523x + 17;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        persistIdFrontResult(null);
        persistIdBackResult(null);
        int i5 = f7523x + 63;
        f7521v = i5 % 128;
        int i6 = i5 % 2;
    }

    private void f() {
        int i2 = 2 % 2;
        int i3 = f7523x + 21;
        f7521v = i3 % 128;
        if (i3 % 2 == 0) {
            com.incode.welcome_sdk.commons.utils.l.e(this);
            int i4 = 3 / 0;
        } else {
            com.incode.welcome_sdk.commons.utils.l.e(this);
        }
    }

    public void clearIdType() {
        int i2 = 2 % 2;
        int i3 = f7521v + 101;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        persistIdType(null, IdCategory.FIRST);
        persistIdType(null, IdCategory.SECOND);
        int i5 = f7521v + 77;
        f7523x = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        IncodeWelcomeRepository incodeWelcomeRepository = (IncodeWelcomeRepository) objArr[0];
        int i2 = 2 % 2;
        int i3 = f7521v + 107;
        f7523x = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            incodeWelcomeRepository.f7528e.am();
            int i4 = f7523x + 59;
            f7521v = i4 % 128;
            if (i4 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        incodeWelcomeRepository.f7528e.am();
        obj.hashCode();
        throw null;
    }

    public IdScan.IdType getIdType(IdCategory idCategory) {
        int i2 = 2 % 2;
        int i3 = f7523x + 31;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        IdScan.IdType idTypeE = this.f7528e.e(idCategory);
        int i5 = f7523x + 109;
        f7521v = i5 % 128;
        if (i5 % 2 != 0) {
            return idTypeE;
        }
        throw null;
    }

    public void persistIdType(IdScan.IdType idType, IdCategory idCategory) {
        int i2 = 2 % 2;
        int i3 = f7521v + 41;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.f7528e, idType, idCategory};
        int iD = IdCaptureScreenKt.bg.d();
        int iD2 = IdCaptureScreenKt.bg.d();
        l.c(objArr, IdCaptureScreenKt.bg.d(), -2010743696, IdCaptureScreenKt.bg.d(), iD2, 2010743696, iD);
        int i5 = f7521v + 109;
        f7523x = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void persistShowRetakeScreenForManualCapture(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f7523x + 47;
        f7521v = i3 % 128;
        if (i3 % 2 == 0) {
            this.f7528e.e(z2);
            int i4 = 28 / 0;
        } else {
            this.f7528e.e(z2);
        }
        int i5 = f7521v + 117;
        f7523x = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 9 / 0;
        }
    }

    public boolean isShowRetakeScreenForManualCapture() {
        int i2 = 2 % 2;
        int i3 = f7523x + 69;
        f7521v = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = {this.f7528e};
            int iD = IdCaptureScreenKt.bg.d();
            int iD2 = IdCaptureScreenKt.bg.d();
            ((Boolean) l.c(objArr, IdCaptureScreenKt.bg.d(), -1790794432, IdCaptureScreenKt.bg.d(), iD2, 1790794435, iD)).booleanValue();
            throw null;
        }
        Object[] objArr2 = {this.f7528e};
        int iD3 = IdCaptureScreenKt.bg.d();
        int iD4 = IdCaptureScreenKt.bg.d();
        boolean zBooleanValue = ((Boolean) l.c(objArr2, IdCaptureScreenKt.bg.d(), -1790794432, IdCaptureScreenKt.bg.d(), iD4, 1790794435, iD3)).booleanValue();
        int i4 = f7521v + 15;
        f7523x = i4 % 128;
        if (i4 % 2 == 0) {
            return zBooleanValue;
        }
        throw null;
    }

    public void persistShowRetakeScreenForAutoCapture(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f7521v + 89;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        this.f7528e.b(z2);
        int i5 = f7523x + 5;
        f7521v = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public boolean isShowRetakeScreenForAutoCapture() {
        int i2 = 2 % 2;
        int i3 = f7523x + 97;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        boolean zAb = this.f7528e.ab();
        int i5 = f7521v + 35;
        f7523x = i5 % 128;
        int i6 = i5 % 2;
        return zAb;
    }

    public void persistEnableRotationOnRetakeScreen(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f7523x + 111;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.f7528e, Boolean.valueOf(z2)};
        int iD = IdCaptureScreenKt.bg.d();
        int iD2 = IdCaptureScreenKt.bg.d();
        l.c(objArr, IdCaptureScreenKt.bg.d(), 1415169583, IdCaptureScreenKt.bg.d(), iD2, -1415169565, iD);
        int i5 = f7523x + 17;
        f7521v = i5 % 128;
        int i6 = i5 % 2;
    }

    public boolean isEnabledRotationOnRetakeScreen() {
        int i2 = 2 % 2;
        int i3 = f7521v + 13;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        l lVar = this.f7528e;
        if (i4 == 0) {
            return lVar.ac();
        }
        lVar.ac();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void persistShowNfcSymbolConfirmationScreen(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f7523x + 77;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        this.f7528e.d(z2);
        int i5 = f7523x + 35;
        f7521v = i5 % 128;
        int i6 = i5 % 2;
    }

    public boolean isShowNfcSymbolConfirmationScreen() {
        int i2 = 2 % 2;
        int i3 = f7523x + 23;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        boolean zAh = this.f7528e.ah();
        int i5 = f7523x + 81;
        f7521v = i5 % 128;
        int i6 = i5 % 2;
        return zAh;
    }

    public boolean isShowNfcTutorials() {
        int i2 = 2 % 2;
        int i3 = f7521v + 69;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        boolean zAg = this.f7528e.ag();
        int i5 = f7521v + 27;
        f7523x = i5 % 128;
        int i6 = i5 % 2;
        return zAg;
    }

    public void persistShowNfcTutorials(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f7523x + 55;
        f7521v = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.f7528e.j(z2);
            int i4 = f7523x + 35;
            f7521v = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        this.f7528e.j(z2);
        obj.hashCode();
        throw null;
    }

    public boolean shouldShowExtendedNfcTutorials() {
        int i2 = 2 % 2;
        int i3 = f7523x + 99;
        int i4 = i3 % 128;
        f7521v = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z2 = this.f7533j;
        int i5 = i4 + 43;
        f7523x = i5 % 128;
        int i6 = i5 % 2;
        return z2;
    }

    public void persistShowExtendedNfcTutorials(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f7521v + 115;
        int i4 = i3 % 128;
        f7523x = i4;
        int i5 = i3 % 2;
        this.f7533j = z2;
        int i6 = i4 + 69;
        f7521v = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean hasNfcExtendedTutorialsBeenShown() {
        int i2 = 2 % 2;
        int i3 = f7523x;
        int i4 = i3 + 111;
        f7521v = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f7532i;
        int i6 = i3 + 103;
        f7521v = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public void setNfcExtendedTutorialsShown(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f7521v + 105;
        int i4 = i3 % 128;
        f7523x = i4;
        if (i3 % 2 != 0) {
            this.f7532i = z2;
            int i5 = 33 / 0;
        } else {
            this.f7532i = z2;
        }
        int i6 = i4 + 29;
        f7521v = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 33 / 0;
        }
    }

    public boolean hasNfcIdTutorialsShown() {
        int i2 = 2 % 2;
        int i3 = f7521v + 83;
        int i4 = i3 % 128;
        f7523x = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f7531h;
        int i6 = i4 + 107;
        f7521v = i6 % 128;
        if (i6 % 2 != 0) {
            return z2;
        }
        throw null;
    }

    public void setNfcIdTutorialsShown(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f7521v;
        int i4 = i3 + 71;
        f7523x = i4 % 128;
        int i5 = i4 % 2;
        this.f7531h = z2;
        int i6 = i3 + 33;
        f7523x = i6 % 128;
        int i7 = i6 % 2;
    }

    public boolean shouldShowNfcNeedHelpButton() {
        int i2 = 2 % 2;
        int i3 = f7523x;
        int i4 = i3 + 43;
        f7521v = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f7529f;
        int i6 = i3 + 43;
        f7521v = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public void showNfcNeedHelpButton(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f7523x;
        int i4 = i3 + 13;
        f7521v = i4 % 128;
        int i5 = i4 % 2;
        this.f7529f = z2;
        int i6 = i3 + 79;
        f7521v = i6 % 128;
        int i7 = i6 % 2;
    }

    public int getNfcMaxRetries() {
        int i2 = 2 % 2;
        int i3 = f7521v + 5;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        int iAe = this.f7528e.ae();
        int i5 = f7523x + 15;
        f7521v = i5 % 128;
        if (i5 % 2 != 0) {
            return iAe;
        }
        throw null;
    }

    public void persistsNfcMaxRetries(int i2) {
        int i3 = 2 % 2;
        int i4 = f7521v + 47;
        f7523x = i4 % 128;
        int i5 = i4 % 2;
        this.f7528e.a(i2);
        int i6 = f7523x + 81;
        f7521v = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public void persistProcessNfcData(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f7521v + 7;
        f7523x = i3 % 128;
        if (i3 % 2 == 0) {
            this.f7528e.f(z2);
            int i4 = f7521v + 11;
            f7523x = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        this.f7528e.f(z2);
        throw null;
    }

    public boolean isProcessNfcData() {
        int i2 = 2 % 2;
        int i3 = f7523x + 39;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.f7528e};
        int iD = IdCaptureScreenKt.bg.d();
        int iD2 = IdCaptureScreenKt.bg.d();
        boolean zBooleanValue = ((Boolean) l.c(objArr, IdCaptureScreenKt.bg.d(), -570893616, IdCaptureScreenKt.bg.d(), iD2, 570893618, iD)).booleanValue();
        int i5 = f7523x + 13;
        f7521v = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 97 / 0;
        }
        return zBooleanValue;
    }

    public void persistNfcIdType(IdScan.IdType idType) {
        int i2 = 2 % 2;
        int i3 = f7521v + 103;
        f7523x = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = {this.f7528e, idType};
            int iD = IdCaptureScreenKt.bg.d();
            int iD2 = IdCaptureScreenKt.bg.d();
            l.c(objArr, IdCaptureScreenKt.bg.d(), -1856403293, IdCaptureScreenKt.bg.d(), iD2, 1856403298, iD);
            int i4 = 55 / 0;
        } else {
            Object[] objArr2 = {this.f7528e, idType};
            int iD3 = IdCaptureScreenKt.bg.d();
            int iD4 = IdCaptureScreenKt.bg.d();
            l.c(objArr2, IdCaptureScreenKt.bg.d(), -1856403293, IdCaptureScreenKt.bg.d(), iD4, 1856403298, iD3);
        }
        int i5 = f7523x + 123;
        f7521v = i5 % 128;
        int i6 = i5 % 2;
    }

    public IdScan.IdType getNfcIdType() {
        int i2 = 2 % 2;
        int i3 = f7523x + 123;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        l lVar = this.f7528e;
        if (i4 != 0) {
            return lVar.ad();
        }
        lVar.ad();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean shouldReturnNfcResultImmediately() {
        int i2 = 2 % 2;
        int i3 = f7523x + 65;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        boolean zAj = this.f7528e.aj();
        int i5 = f7521v + 97;
        f7523x = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 42 / 0;
        }
        return zAj;
    }

    public void persistReturnNfcResultImmediately(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f7523x + 69;
        f7521v = i3 % 128;
        if (i3 % 2 == 0) {
            this.f7528e.g(z2);
            int i4 = 51 / 0;
        } else {
            this.f7528e.g(z2);
        }
        int i5 = f7521v + 25;
        f7523x = i5 % 128;
        int i6 = i5 % 2;
    }

    public void persistExternalTokenUsage(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f7523x + 51;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        this.f7528e.a(z2);
        int i5 = f7521v + 39;
        f7523x = i5 % 128;
        int i6 = i5 % 2;
    }

    public boolean isExternalTokenUsed() {
        int i2 = 2 % 2;
        int i3 = f7523x + 29;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        boolean Z = this.f7528e.Z();
        int i5 = f7521v + 39;
        f7523x = i5 % 128;
        int i6 = i5 % 2;
        return Z;
    }

    public String getPrefilledPhoneNumber() {
        int i2 = 2 % 2;
        int i3 = f7523x + 53;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        String strAn = this.f7528e.an();
        if (i4 == 0) {
            int i5 = 0 / 0;
        }
        return strAn;
    }

    public void setPrefilledPhoneNumber(String str) {
        int i2 = 2 % 2;
        int i3 = f7521v + 47;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.f7528e, str};
        int iD = IdCaptureScreenKt.bg.d();
        int iD2 = IdCaptureScreenKt.bg.d();
        l.c(objArr, IdCaptureScreenKt.bg.d(), -2140880259, IdCaptureScreenKt.bg.d(), iD2, 2140880266, iD);
        int i5 = f7521v + 3;
        f7523x = i5 % 128;
        int i6 = i5 % 2;
    }

    public Single<ResponseBody> uploadVideo(String str, File file) {
        Single<ResponseBody> singleB;
        int i2 = 2 % 2;
        int i3 = f7523x + 49;
        f7521v = i3 % 128;
        if (i3 % 2 == 0) {
            singleB = this.f7525b.b(str, file);
            int i4 = 7 / 0;
        } else {
            singleB = this.f7525b.b(str, file);
        }
        int i5 = f7523x + 73;
        f7521v = i5 % 128;
        int i6 = i5 % 2;
        return singleB;
    }

    public Observable<av> generateVideoSelfieUrl() {
        int i2 = 2 % 2;
        int i3 = f7523x + 37;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        h hVar = this.f7525b;
        if (i4 != 0) {
            return hVar.u(getToken());
        }
        hVar.u(getToken());
        throw null;
    }

    public Single<aw> generateSessionRecordingUploadUrl(String str, String str2) {
        int i2 = 2 % 2;
        int i3 = f7523x + 9;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        Single<aw> singleX = this.f7525b.x(str, str2);
        int i5 = f7521v + 61;
        f7523x = i5 % 128;
        int i6 = i5 % 2;
        return singleX;
    }

    public /* synthetic */ ObservableSource a(bh bhVar) throws Exception {
        int i2 = 2 % 2;
        int i3 = f7523x + 47;
        f7521v = i3 % 128;
        if (i3 % 2 != 0) {
            return finishOnboarding();
        }
        finishOnboarding();
        throw null;
    }

    public Observable<an> finishOnboarding() {
        int i2 = 2 % 2;
        int i3 = f7523x + 105;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        if (a()) {
            int i5 = f7521v + 15;
            f7523x = i5 % 128;
            int i6 = i5 % 2;
            return resumeOnboarding().flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda33
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.f$0.a((bh) obj);
                }
            });
        }
        return this.f7525b.v(getToken());
    }

    public Single<ResponseFaceLogin> loginFaceOneToOne(String str, String str2, Map<String, Float> map, String str3, boolean z2, String str4, long j2, String str5, String str6) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f7521v + 9;
        f7523x = i3 % 128;
        if (i3 % 2 == 0) {
            Single<ResponseFaceLogin> singleC = this.f7525b.c(str, str2, map, str3, z2, str4, j2, str5, str6, getDeviceFingerprint());
            int i4 = f7523x + 93;
            f7521v = i4 % 128;
            int i5 = i4 % 2;
            return singleC;
        }
        this.f7525b.c(str, str2, map, str3, z2, str4, j2, str5, str6, getDeviceFingerprint());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Single<ResponseFaceLogin> loginFaceOneToNServerLiveness(String str, Map<String, Float> map, boolean z2, String str2, long j2, String str3, String str4) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f7523x + 61;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        Single<ResponseFaceLogin> singleD = this.f7525b.d((String) null, str, map, z2, str2, j2, str3, str4);
        int i5 = f7521v + 83;
        f7523x = i5 % 128;
        int i6 = i5 % 2;
        return singleD;
    }

    public Single<ResponseFaceLogin> loginFaceOneToNLocalLiveness(String str, String str2) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f7523x + 21;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        Single<ResponseFaceLogin> singleD = this.f7525b.d(str, (String) null, (Map<String, Float>) null, false, str2, System.currentTimeMillis(), (String) null, (String) null);
        int i5 = f7523x + 27;
        f7521v = i5 % 128;
        if (i5 % 2 != 0) {
            return singleD;
        }
        throw null;
    }

    public Single<ResponseFaceAuthentication> authenticateFace(s sVar, String str, Map<String, Float> map, String str2, String str3) {
        int i2 = 2 % 2;
        try {
            Single<ResponseFaceAuthentication> singleE = this.f7525b.e(getToken(), new FaceAuthenticationRequest(com.incode.welcome_sdk.data.e.b.e(sVar), str, map, str2, str3));
            int i3 = f7521v + 107;
            f7523x = i3 % 128;
            int i4 = i3 % 2;
            return singleE;
        } catch (UnsupportedEncodingException | InvalidKeyException | NoSuchAlgorithmException e2) {
            Timber.e(e2, "Error encrypting metadata for face authentication", new Object[0]);
            return Single.error(e2);
        }
    }

    public /* synthetic */ ObservableSource d(String str, String str2, boolean z2, bh bhVar) throws Exception {
        int i2 = 2 % 2;
        int i3 = f7521v + 57;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        Observable<ResponseSuccess> observableAddUserConsent = addUserConsent(str, str2, z2);
        if (i4 != 0) {
            int i5 = 55 / 0;
        }
        return observableAddUserConsent;
    }

    public Observable<ResponseSuccess> addUserConsent(final String str, final String str2, final boolean z2) {
        int i2 = 2 % 2;
        int i3 = f7521v + 121;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        if (a()) {
            int i5 = f7521v + 83;
            f7523x = i5 % 128;
            if (i5 % 2 == 0) {
                return resumeOnboarding().flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda53
                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj) {
                        return this.f$0.d(str, str2, z2, (bh) obj);
                    }
                });
            }
            int i6 = 42 / 0;
            return resumeOnboarding().flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda53
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.f$0.d(str, str2, z2, (bh) obj);
                }
            });
        }
        return this.f7525b.c(getToken(), str, str2, z2);
    }

    public /* synthetic */ ObservableSource b(String str, String str2, String str3, bh bhVar) throws Exception {
        int i2 = 2 % 2;
        int i3 = f7523x + 83;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        Observable<z> observableFetchConsent = fetchConsent(str, str2, str3);
        int i5 = f7523x + 73;
        f7521v = i5 % 128;
        int i6 = i5 % 2;
        return observableFetchConsent;
    }

    public Observable<z> fetchConsent(final String str, final String str2, final String str3) {
        int i2 = 2 % 2;
        int i3 = f7521v + 49;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        if (!a()) {
            return this.f7525b.f(getToken(), str, str2, str3);
        }
        Observable observableFlatMap = resumeOnboarding().flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.b(str, str2, str3, (bh) obj);
            }
        });
        int i5 = f7521v + 69;
        f7523x = i5 % 128;
        if (i5 % 2 == 0) {
            return observableFlatMap;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Observable<z> fetchBiometricConsent(String str) {
        int i2 = 2 % 2;
        int i3 = f7521v + 67;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        Observable<z> observableFetchConsent = fetchConsent(str, "EN", "MANDATORY");
        int i5 = f7521v + 21;
        f7523x = i5 % 128;
        if (i5 % 2 == 0) {
            return observableFetchConsent;
        }
        throw null;
    }

    public /* synthetic */ ObservableSource c(boolean z2, String str, bh bhVar) throws Exception {
        int i2 = 2 % 2;
        int i3 = f7521v + 95;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        Observable<ResponseSuccess> observableAddConsent = addConsent(z2, str);
        if (i4 != 0) {
            int i5 = 65 / 0;
        }
        int i6 = f7521v + 123;
        f7523x = i6 % 128;
        if (i6 % 2 == 0) {
            return observableAddConsent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Observable<ResponseSuccess> addConsent(final boolean z2, final String str) {
        int i2 = 2 % 2;
        if (!a()) {
            return this.f7525b.a(getToken(), z2, str);
        }
        int i3 = f7523x + 69;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        Observable observableFlatMap = resumeOnboarding().flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda29
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.c(z2, str, (bh) obj);
            }
        });
        int i5 = f7521v + 113;
        f7523x = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 39 / 0;
        }
        return observableFlatMap;
    }

    public /* synthetic */ SingleSource e(String str, String str2, bh bhVar) throws Exception {
        int i2 = 2 % 2;
        int i3 = f7523x + 55;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        Single<ResponseCombinedConsent> combinedConsent = getCombinedConsent(str, str2);
        int i5 = f7521v + 121;
        f7523x = i5 % 128;
        int i6 = i5 % 2;
        return combinedConsent;
    }

    public Single<ResponseCombinedConsent> getCombinedConsent(final String str, final String str2) {
        int i2 = 2 % 2;
        int i3 = f7521v + 85;
        f7523x = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            if (a()) {
                int i4 = f7523x + 77;
                f7521v = i4 % 128;
                if (i4 % 2 != 0) {
                    return resumeOnboarding().singleOrError().flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda13
                        @Override // io.reactivex.functions.Function
                        public final Object apply(Object obj2) {
                            return this.f$0.e(str, str2, (bh) obj2);
                        }
                    });
                }
                resumeOnboarding().singleOrError().flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda13
                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj2) {
                        return this.f$0.e(str, str2, (bh) obj2);
                    }
                });
                obj.hashCode();
                throw null;
            }
            return this.f7525b.b(getToken(), str, str2);
        }
        a();
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object f(Object[] objArr) {
        IncodeWelcomeRepository incodeWelcomeRepository = (IncodeWelcomeRepository) objArr[0];
        bn bnVar = (bn) objArr[1];
        int i2 = 2 % 2;
        int i3 = f7521v + 33;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        Single<ResponseSuccess> singleSignCombinedConsent = incodeWelcomeRepository.signCombinedConsent(bnVar);
        int i5 = f7523x + 61;
        f7521v = i5 % 128;
        if (i5 % 2 != 0) {
            return singleSignCombinedConsent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Single<ResponseSuccess> signCombinedConsent(final bn bnVar) {
        int i2 = 2 % 2;
        int i3 = f7523x + 5;
        f7521v = i3 % 128;
        if (i3 % 2 == 0) {
            a();
            throw null;
        }
        if (!a()) {
            return this.f7525b.d(getToken(), bnVar);
        }
        int i4 = f7521v + 1;
        f7523x = i4 % 128;
        if (i4 % 2 != 0) {
            resumeOnboarding().singleOrError().flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda4
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.f$0.e(bnVar, (bh) obj);
                }
            });
            throw null;
        }
        Single singleFlatMap = resumeOnboarding().singleOrError().flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda4
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.e(bnVar, (bh) obj);
            }
        });
        int i5 = f7521v + 99;
        f7523x = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 20 / 0;
        }
        return singleFlatMap;
    }

    public boolean isDynamicLocalisationAvailable() {
        int i2 = 2 % 2;
        int i3 = f7521v + 101;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = this.f7538o;
        if (i4 != 0) {
            int i5 = 45 / 0;
        }
        return z2;
    }

    public void setDynamicLocalisationAvailable(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f7521v;
        int i4 = i3 + 85;
        f7523x = i4 % 128;
        if (i4 % 2 == 0) {
            this.f7538o = z2;
            int i5 = i3 + 59;
            f7523x = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 38 / 0;
                return;
            }
            return;
        }
        this.f7538o = z2;
        throw null;
    }

    public boolean isDynamicStylingAvailable() {
        int i2 = 2 % 2;
        int i3 = f7521v + 121;
        f7523x = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f7535l;
        }
        throw null;
    }

    public void setDynamicStylingAvailable(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f7521v;
        int i4 = i3 + 123;
        f7523x = i4 % 128;
        int i5 = i4 % 2;
        this.f7535l = z2;
        int i6 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f7523x = i6 % 128;
        int i7 = i6 % 2;
    }

    public boolean isVideoStreamingAvailable() {
        int i2 = 2 % 2;
        int i3 = f7523x + 69;
        int i4 = i3 % 128;
        f7521v = i4;
        int i5 = i3 % 2;
        if (this.f7536m) {
            int i6 = i4 + 105;
            f7523x = i6 % 128;
            int i7 = i6 % 2;
            if (this.f7534k) {
                int i8 = i4 + 65;
                f7523x = i8 % 128;
                boolean z2 = i8 % 2 == 0;
                int i9 = i4 + 99;
                f7523x = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 89 / 0;
                }
                return z2;
            }
        }
        return false;
    }

    public boolean isVideoStreamingDependencyAvailable() {
        int i2 = 2 % 2;
        int i3 = f7523x;
        int i4 = i3 + 111;
        f7521v = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        boolean z2 = this.f7536m;
        int i5 = i3 + 103;
        f7521v = i5 % 128;
        if (i5 % 2 != 0) {
            return z2;
        }
        throw null;
    }

    public void setVideoStreamingDependencyAvailable(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f7523x;
        int i4 = i3 + 117;
        f7521v = i4 % 128;
        int i5 = i4 % 2;
        this.f7536m = z2;
        int i6 = i3 + 103;
        f7521v = i6 % 128;
        int i7 = i6 % 2;
    }

    public boolean isEnoughRAMAvailableForStreaming() {
        int i2 = 2 % 2;
        int i3 = f7521v + 11;
        int i4 = i3 % 128;
        f7523x = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f7534k;
        int i6 = i4 + 83;
        f7521v = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public void setEnoughRAMAvailableForStreaming(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f7523x + 45;
        int i4 = i3 % 128;
        f7521v = i4;
        int i5 = i3 % 2;
        this.f7534k = z2;
        int i6 = i4 + 67;
        f7523x = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public Single<ResponseSuccess> updateLivenessStat(String str, float f2, float f3, float f4, float f5, FaceProcessingUtils.DetectionData detectionData, String str2, boolean z2, float f6, SelfieScan.FaceAuthMode faceAuthMode) {
        int i2 = 2 % 2;
        int i3 = f7521v + 59;
        f7523x = i3 % 128;
        if (i3 % 2 != 0) {
            h hVar = this.f7525b;
            int iB = FormsSelectInputScreenKt.h.b();
            int iB2 = FormsSelectInputScreenKt.h.b();
            int i4 = 43 / 0;
            return hVar.a((String) ae.b(iB, FormsSelectInputScreenKt.h.b(), FormsSelectInputScreenKt.h.b(), iB2, -643729730, 643729732, new Object[0]), str, f2, f3, f4, f5, detectionData, str2, z2, f6, faceAuthMode);
        }
        h hVar2 = this.f7525b;
        int iB3 = FormsSelectInputScreenKt.h.b();
        int iB4 = FormsSelectInputScreenKt.h.b();
        return hVar2.a((String) ae.b(iB3, FormsSelectInputScreenKt.h.b(), FormsSelectInputScreenKt.h.b(), iB4, -643729730, 643729732, new Object[0]), str, f2, f3, f4, f5, detectionData, str2, z2, f6, faceAuthMode);
    }

    public Observable<ResponseSuccess> insertLivenessStat(float f2, float f3, float f4, float f5, float f6, float f7, FaceProcessingUtils.DetectionData detectionData, String str, String str2, SelfieScan.FaceAuthMode faceAuthMode) {
        int i2 = 2 % 2;
        int i3 = f7523x + 105;
        f7521v = i3 % 128;
        if (i3 % 2 != 0) {
            h hVar = this.f7525b;
            int iB = FormsSelectInputScreenKt.h.b();
            int iB2 = FormsSelectInputScreenKt.h.b();
            return hVar.a((String) ae.b(iB, FormsSelectInputScreenKt.h.b(), FormsSelectInputScreenKt.h.b(), iB2, -643729730, 643729732, new Object[0]), f2, f3, f4, f5, f6, f7, detectionData, str, str2, faceAuthMode);
        }
        h hVar2 = this.f7525b;
        int iB3 = FormsSelectInputScreenKt.h.b();
        int iB4 = FormsSelectInputScreenKt.h.b();
        hVar2.a((String) ae.b(iB3, FormsSelectInputScreenKt.h.b(), FormsSelectInputScreenKt.h.b(), iB4, -643729730, 643729732, new Object[0]), f2, f3, f4, f5, f6, f7, detectionData, str, str2, faceAuthMode);
        throw null;
    }

    public Single<ResponseSuccess> insertLivenessStat(com.incode.welcome_sdk.data.remote.f fVar) {
        int i2 = 2 % 2;
        int i3 = f7521v + 85;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        h hVar = this.f7525b;
        int iB = FormsSelectInputScreenKt.h.b();
        int iB2 = FormsSelectInputScreenKt.h.b();
        Single<ResponseSuccess> singleE = hVar.e((String) ae.b(iB, FormsSelectInputScreenKt.h.b(), FormsSelectInputScreenKt.h.b(), iB2, -643729730, 643729732, new Object[0]), fVar);
        int i5 = f7521v + 19;
        f7523x = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 2 / 0;
        }
        return singleE;
    }

    public Observable<ResponseBody> getBlocklistTemplates() {
        int i2 = 2 % 2;
        int i3 = f7523x + 43;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        h hVar = this.f7525b;
        int iB = FormsSelectInputScreenKt.h.b();
        int iB2 = FormsSelectInputScreenKt.h.b();
        Object[] objArr = {hVar, (String) ae.b(iB, FormsSelectInputScreenKt.h.b(), FormsSelectInputScreenKt.h.b(), iB2, -643729730, 643729732, new Object[0])};
        int iC = IdCaptureModuleScreenKt.e.AnonymousClass2.c();
        Observable<ResponseBody> observable = (Observable) h.a(IdCaptureModuleScreenKt.e.AnonymousClass2.c(), 404366001, IdCaptureModuleScreenKt.e.AnonymousClass2.c(), -404365986, objArr, iC, IdCaptureModuleScreenKt.e.AnonymousClass2.c());
        int i5 = f7523x + 19;
        f7521v = i5 % 128;
        int i6 = i5 % 2;
        return observable;
    }

    public Observable<ResponseInitFaceAuth> initFaceAuth(String str) {
        int i2 = 2 % 2;
        int i3 = f7523x + 95;
        f7521v = i3 % 128;
        if (i3 % 2 == 0) {
            this.f7525b.y(str);
            throw null;
        }
        Observable<ResponseInitFaceAuth> observableY = this.f7525b.y(str);
        int i4 = f7521v + 17;
        f7523x = i4 % 128;
        int i5 = i4 % 2;
        return observableY;
    }

    public /* synthetic */ ObservableSource c(bh bhVar) throws Exception {
        Observable<u> observableProcessAntifraud;
        int i2 = 2 % 2;
        int i3 = f7521v + 123;
        f7523x = i3 % 128;
        if (i3 % 2 != 0) {
            observableProcessAntifraud = processAntifraud();
            int i4 = 2 / 0;
        } else {
            observableProcessAntifraud = processAntifraud();
        }
        int i5 = f7523x + 5;
        f7521v = i5 % 128;
        int i6 = i5 % 2;
        return observableProcessAntifraud;
    }

    public Observable<u> processAntifraud() {
        int i2 = 2 % 2;
        if (a()) {
            int i3 = f7523x + 105;
            f7521v = i3 % 128;
            if (i3 % 2 != 0) {
                return resumeOnboarding().flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda17
                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj) {
                        return this.f$0.c((bh) obj);
                    }
                });
            }
            resumeOnboarding().flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda17
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.f$0.c((bh) obj);
                }
            });
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Observable<u> observableX = this.f7525b.x(getToken());
        int i4 = f7521v + 35;
        f7523x = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 71 / 0;
        }
        return observableX;
    }

    public ScreenName getCurrentScreenName() {
        int i2 = 2 % 2;
        int i3 = f7523x + 107;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        ScreenName screenName = this.f7537n;
        if (i4 == 0) {
            int i5 = 96 / 0;
        }
        return screenName;
    }

    public void setCurrentScreenName(ScreenName screenName) {
        int i2 = 2 % 2;
        int i3 = f7521v;
        int i4 = i3 + 43;
        f7523x = i4 % 128;
        if (i4 % 2 == 0) {
            this.f7537n = screenName;
            int i5 = i3 + 93;
            f7523x = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 14 / 0;
                return;
            }
            return;
        }
        this.f7537n = screenName;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Modules getCurrentModule() {
        int i2 = 2 % 2;
        int i3 = f7523x;
        int i4 = i3 + 49;
        f7521v = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Modules modules = this.f7542s;
        int i5 = i3 + 93;
        f7521v = i5 % 128;
        if (i5 % 2 != 0) {
            return modules;
        }
        throw null;
    }

    public void setCurrentModule(Modules modules) {
        int i2 = 2 % 2;
        int i3 = f7521v;
        int i4 = i3 + 105;
        f7523x = i4 % 128;
        if (i4 % 2 == 0) {
            this.f7542s = modules;
            int i5 = i3 + 13;
            f7523x = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 97 / 0;
                return;
            }
            return;
        }
        this.f7542s = modules;
        throw null;
    }

    private static boolean j() {
        int i2 = 2 % 2;
        int i3 = f7521v + 61;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        boolean zIsSubmitOnlyMode = IncodeWelcome.getInstance().isSubmitOnlyMode();
        int i5 = f7523x + 41;
        f7521v = i5 % 128;
        if (i5 % 2 != 0) {
            return zIsSubmitOnlyMode;
        }
        throw null;
    }

    public Single<Map<String, Object>> getCustomConfig() {
        int i2 = 2 % 2;
        int i3 = f7521v + 39;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        Single<Map<String, Object>> singleB = this.f7525b.B(getToken());
        int i5 = f7523x + 47;
        f7521v = i5 % 128;
        if (i5 % 2 != 0) {
            return singleB;
        }
        throw null;
    }

    public Single<ResponseBody> getPublicKeyE2EE() {
        int i2 = 2 % 2;
        int i3 = f7523x + 23;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        Single<ResponseBody> singleD = this.f7525b.D(getToken());
        int i5 = f7521v + 15;
        f7523x = i5 % 128;
        if (i5 % 2 == 0) {
            return singleD;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Single<ResponseBody> getPublicKeyE2EEAndForcePost() {
        int i2 = 2 % 2;
        int i3 = f7523x + 15;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        Single<ResponseBody> singleD = this.f7525b.d();
        int i5 = f7521v + 7;
        f7523x = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 75 / 0;
        }
        return singleD;
    }

    public Single<al> fetchFeatureConfig() {
        int i2 = 2 % 2;
        int i3 = f7521v + 77;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        final h hVar = this.f7525b;
        Objects.requireNonNull(hVar);
        Single<al> single = (Single) b(IdCaptureModuleScreenKt.d.a(), new Object[]{this, new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda67
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return hVar.z((String) obj);
            }
        }}, IdCaptureModuleScreenKt.d.a(), IdCaptureModuleScreenKt.d.a(), IdCaptureModuleScreenKt.d.a(), 1112491429, -1112491416);
        int i5 = f7521v + 7;
        f7523x = i5 % 128;
        if (i5 % 2 == 0) {
            return single;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Single<ResponseSuccess> submitDynamicForm(String str, String str2) {
        int i2 = 2 % 2;
        int i3 = f7523x + 123;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        Single<ResponseSuccess> singleG = this.f7525b.g(getToken(), str, str2, getInterviewId());
        int i5 = f7523x + 91;
        f7521v = i5 % 128;
        if (i5 % 2 != 0) {
            return singleG;
        }
        throw null;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        IncodeWelcomeRepository incodeWelcomeRepository = (IncodeWelcomeRepository) objArr[0];
        Function function = (Function) objArr[1];
        int i2 = 2 % 2;
        int i3 = f7523x + 37;
        f7521v = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ObservableSource observableSource = (ObservableSource) function.apply(incodeWelcomeRepository.getToken());
        int i4 = f7521v + 75;
        f7523x = i4 % 128;
        int i5 = i4 % 2;
        return observableSource;
    }

    private static /* synthetic */ Object r(Object[] objArr) {
        final IncodeWelcomeRepository incodeWelcomeRepository = (IncodeWelcomeRepository) objArr[0];
        final Function function = (Function) objArr[1];
        int i2 = 2 % 2;
        int i3 = f7521v + 53;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        if (incodeWelcomeRepository.a()) {
            return incodeWelcomeRepository.resumeOnboarding().flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda39
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.f$0.e(function, (bh) obj);
                }
            });
        }
        try {
            Observable observable = (Observable) function.apply(incodeWelcomeRepository.getToken());
            int i5 = f7521v + 69;
            f7523x = i5 % 128;
            int i6 = i5 % 2;
            return observable;
        } catch (Exception e2) {
            Timber.e(e2, "Error while processing with old token", new Object[0]);
            return Observable.error(e2);
        }
    }

    public /* synthetic */ SingleSource c(Function function, bh bhVar) throws Exception {
        int i2 = 2 % 2;
        int i3 = f7523x + 19;
        f7521v = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        SingleSource singleSource = (SingleSource) function.apply(getToken());
        int i4 = f7521v + 65;
        f7523x = i4 % 128;
        if (i4 % 2 == 0) {
            return singleSource;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object k(Object[] objArr) {
        final IncodeWelcomeRepository incodeWelcomeRepository = (IncodeWelcomeRepository) objArr[0];
        final Function function = (Function) objArr[1];
        int i2 = 2 % 2;
        int i3 = f7523x + 69;
        f7521v = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            if (!incodeWelcomeRepository.a()) {
                try {
                    Single single = (Single) function.apply(incodeWelcomeRepository.getToken());
                    int i4 = f7523x + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                    f7521v = i4 % 128;
                    if (i4 % 2 != 0) {
                        return single;
                    }
                    obj.hashCode();
                    throw null;
                } catch (Exception e2) {
                    Timber.e(e2, "Error while processing with old token", new Object[0]);
                    return Single.error(e2);
                }
            }
            int i5 = f7521v + 105;
            f7523x = i5 % 128;
            if (i5 % 2 == 0) {
                return incodeWelcomeRepository.resumeOnboarding().singleOrError().flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda23
                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj2) {
                        return this.f$0.c(function, (bh) obj2);
                    }
                });
            }
            int i6 = 99 / 0;
            return incodeWelcomeRepository.resumeOnboarding().singleOrError().flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda23
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj2) {
                    return this.f$0.c(function, (bh) obj2);
                }
            });
        }
        incodeWelcomeRepository.a();
        obj.hashCode();
        throw null;
    }

    public void persistFeatureConfig(Map<String, Boolean> map) {
        int i2 = 2 % 2;
        int i3 = f7521v + 63;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.f7528e, map};
        int iD = IdCaptureScreenKt.bg.d();
        int iD2 = IdCaptureScreenKt.bg.d();
        l.c(objArr, IdCaptureScreenKt.bg.d(), 1517304500, IdCaptureScreenKt.bg.d(), iD2, -1517304472, iD);
        int i5 = f7523x + 15;
        f7521v = i5 % 128;
        int i6 = i5 % 2;
    }

    public Single<Map<String, Boolean>> getPersistedFeatureConfig() {
        int i2 = 2 % 2;
        int i3 = f7521v + 1;
        f7523x = i3 % 128;
        if (i3 % 2 != 0) {
            this.f7528e.ak();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Single<Map<String, Boolean>> singleAk = this.f7528e.ak();
        int i4 = f7521v + 99;
        f7523x = i4 % 128;
        int i5 = i4 % 2;
        return singleAk;
    }

    public void persistServerConfig(bh bhVar) {
        int i2 = 2 % 2;
        int i3 = f7521v + 19;
        f7523x = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Object[] objArr = {this.f7528e, bhVar};
            int iD = IdCaptureScreenKt.bg.d();
            int iD2 = IdCaptureScreenKt.bg.d();
            l.c(objArr, IdCaptureScreenKt.bg.d(), -568122801, IdCaptureScreenKt.bg.d(), iD2, 568122813, iD);
            int i4 = f7521v + 27;
            f7523x = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        Object[] objArr2 = {this.f7528e, bhVar};
        int iD3 = IdCaptureScreenKt.bg.d();
        int iD4 = IdCaptureScreenKt.bg.d();
        l.c(objArr2, IdCaptureScreenKt.bg.d(), -568122801, IdCaptureScreenKt.bg.d(), iD4, 568122813, iD3);
        throw null;
    }

    public bh getPersistedServerConfig() {
        int i2 = 2 % 2;
        int i3 = f7521v + 61;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        bh bhVarAi = this.f7528e.ai();
        int i5 = f7521v + 17;
        f7523x = i5 % 128;
        int i6 = i5 % 2;
        return bhVarAi;
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        Single<ResponseSuccess> singleAddVoiceConsentFace;
        IncodeWelcomeRepository incodeWelcomeRepository = (IncodeWelcomeRepository) objArr[0];
        String str = (String) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        float fFloatValue2 = ((Number) objArr[3]).floatValue();
        int i2 = 2 % 2;
        int i3 = f7523x + 63;
        f7521v = i3 % 128;
        if (i3 % 2 == 0) {
            singleAddVoiceConsentFace = incodeWelcomeRepository.addVoiceConsentFace(str, fFloatValue, fFloatValue2);
            int i4 = 30 / 0;
        } else {
            singleAddVoiceConsentFace = incodeWelcomeRepository.addVoiceConsentFace(str, fFloatValue, fFloatValue2);
        }
        int i5 = f7523x + 111;
        f7521v = i5 % 128;
        int i6 = i5 % 2;
        return singleAddVoiceConsentFace;
    }

    public Single<ResponseSuccess> addVoiceConsentFace(final String str, final float f2, final float f3) {
        int i2 = 2 % 2;
        int i3 = f7521v + 61;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        if (a()) {
            int i5 = f7521v + 67;
            f7523x = i5 % 128;
            int i6 = i5 % 2;
            return resumeOnboarding().singleOrError().flatMap(new Function() { // from class: com.incode.welcome_sdk.data.IncodeWelcomeRepository$$ExternalSyntheticLambda55
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.f$0.c(str, f2, f3, (bh) obj);
                }
            });
        }
        Single<ResponseSuccess> singleA = this.f7525b.a(getToken(), str, f2, f3);
        int i7 = f7523x + 11;
        f7521v = i7 % 128;
        if (i7 % 2 != 0) {
            return singleA;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public DeviceFingerprint getDeviceFingerprint() {
        int i2 = 2 % 2;
        int i3 = f7521v + 101;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        l lVar = this.f7528e;
        if (i4 == 0) {
            int iD = IdCaptureScreenKt.bg.d();
            int iD2 = IdCaptureScreenKt.bg.d();
            return (DeviceFingerprint) l.c(new Object[]{lVar}, IdCaptureScreenKt.bg.d(), -190501947, IdCaptureScreenKt.bg.d(), iD2, 190501963, iD);
        }
        int iD3 = IdCaptureScreenKt.bg.d();
        int iD4 = IdCaptureScreenKt.bg.d();
        DeviceFingerprint deviceFingerprint = (DeviceFingerprint) l.c(new Object[]{lVar}, IdCaptureScreenKt.bg.d(), -190501947, IdCaptureScreenKt.bg.d(), iD4, 190501963, iD3);
        int i5 = 42 / 0;
        return deviceFingerprint;
    }

    public boolean isCameraPermissionRequested() {
        int i2 = 2 % 2;
        int i3 = f7521v + 69;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        boolean zAp = this.f7528e.ap();
        if (i4 != 0) {
            int i5 = 0 / 0;
        }
        return zAp;
    }

    public void setCameraPermissionRequested(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f7521v + 33;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        this.f7528e.i(z2);
        int i5 = f7523x + 83;
        f7521v = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public String getPersistedVideoRecordingId() {
        int i2 = 2 % 2;
        int i3 = f7523x + 35;
        f7521v = i3 % 128;
        int i4 = i3 % 2;
        String strAo = this.f7528e.ao();
        int i5 = f7521v + 77;
        f7523x = i5 % 128;
        if (i5 % 2 == 0) {
            return strAo;
        }
        throw null;
    }

    public void persistVideoRecordingId(String str) {
        int i2 = 2 % 2;
        int i3 = f7521v + 81;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        this.f7528e.ag(str);
        int i5 = f7521v + 77;
        f7523x = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getFaceAuthenticationHint() {
        int i2 = 2 % 2;
        int i3 = f7521v + 33;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        String strAr = this.f7528e.ar();
        int i5 = f7523x + 31;
        f7521v = i5 % 128;
        if (i5 % 2 != 0) {
            return strAr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setFaceAuthenticationHint(String str) {
        int i2 = 2 % 2;
        int i3 = f7521v + 103;
        f7523x = i3 % 128;
        int i4 = i3 % 2;
        this.f7528e.af(str);
        int i5 = f7521v + 83;
        f7523x = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f7523x = 0;
        f7521v = 1;
        f7519t = 1994499258;
        f7522w = new char[]{23152, 23080, 23048, 23153, 23103, 23090, 23093, 23095, 23100, 23096, 23053, 23146, 23098, 23086, 23041, 23154, 23083, 23089, 23082, 23085, 23088, 23101, 23084, 23099, 23091};
        f7520u = (char) 28609;
    }

    public /* synthetic */ void i(bh bhVar) throws Exception {
        int iA = IdCaptureModuleScreenKt.d.a();
        b(IdCaptureModuleScreenKt.d.a(), new Object[]{this, bhVar}, iA, IdCaptureModuleScreenKt.d.a(), IdCaptureModuleScreenKt.d.a(), -1793394116, 1793394128);
    }

    public /* synthetic */ void g(bh bhVar) throws Exception {
        int iA = IdCaptureModuleScreenKt.d.a();
        b(IdCaptureModuleScreenKt.d.a(), new Object[]{this, bhVar}, iA, IdCaptureModuleScreenKt.d.a(), IdCaptureModuleScreenKt.d.a(), 296553260, -296553254);
    }

    public /* synthetic */ SingleSource c(String str, String str2, String str3, bh bhVar) throws Exception {
        int iA = IdCaptureModuleScreenKt.d.a();
        return (SingleSource) b(IdCaptureModuleScreenKt.d.a(), new Object[]{this, str, str2, str3, bhVar}, iA, IdCaptureModuleScreenKt.d.a(), IdCaptureModuleScreenKt.d.a(), -1687766130, 1687766135);
    }

    public /* synthetic */ SingleSource b(String str, Function0 function0, bh bhVar) throws Exception {
        int iA = IdCaptureModuleScreenKt.d.a();
        return (SingleSource) b(IdCaptureModuleScreenKt.d.a(), new Object[]{this, str, function0, bhVar}, iA, IdCaptureModuleScreenKt.d.a(), IdCaptureModuleScreenKt.d.a(), 1764606921, -1764606917);
    }

    public /* synthetic */ ObservableSource c(String str, boolean z2, boolean z3, bh bhVar) throws Exception {
        return (ObservableSource) b(IdCaptureModuleScreenKt.d.a(), new Object[]{this, str, Boolean.valueOf(z2), Boolean.valueOf(z3), bhVar}, IdCaptureModuleScreenKt.d.a(), IdCaptureModuleScreenKt.d.a(), IdCaptureModuleScreenKt.d.a(), 873261423, -873261412);
    }

    public /* synthetic */ ObservableSource g(String str, bh bhVar) throws Exception {
        int iA = IdCaptureModuleScreenKt.d.a();
        return (ObservableSource) b(IdCaptureModuleScreenKt.d.a(), new Object[]{this, str, bhVar}, iA, IdCaptureModuleScreenKt.d.a(), IdCaptureModuleScreenKt.d.a(), 1554116336, -1554116322);
    }

    public /* synthetic */ ObservableSource f(String str, bh bhVar) throws Exception {
        int iA = IdCaptureModuleScreenKt.d.a();
        return (ObservableSource) b(IdCaptureModuleScreenKt.d.a(), new Object[]{this, str, bhVar}, iA, IdCaptureModuleScreenKt.d.a(), IdCaptureModuleScreenKt.d.a(), 752383360, -752383344);
    }

    public /* synthetic */ Observable a(bt btVar, String str) throws Exception {
        int iA = IdCaptureModuleScreenKt.d.a();
        return (Observable) b(IdCaptureModuleScreenKt.d.a(), new Object[]{this, btVar, str}, iA, IdCaptureModuleScreenKt.d.a(), IdCaptureModuleScreenKt.d.a(), 20594989, -20594980);
    }

    public static /* synthetic */ void a(Throwable th) throws Exception {
        int iA = IdCaptureModuleScreenKt.d.a();
        b(IdCaptureModuleScreenKt.d.a(), new Object[]{th}, iA, IdCaptureModuleScreenKt.d.a(), IdCaptureModuleScreenKt.d.a(), -1335927257, 1335927272);
    }

    public /* synthetic */ SingleSource d(FaceMatch.MatchType matchType, boolean z2, bh bhVar) throws Exception {
        return (SingleSource) b(IdCaptureModuleScreenKt.d.a(), new Object[]{this, matchType, Boolean.valueOf(z2), bhVar}, IdCaptureModuleScreenKt.d.a(), IdCaptureModuleScreenKt.d.a(), IdCaptureModuleScreenKt.d.a(), -37111811, 37111819);
    }

    public /* synthetic */ ObservableSource d(w wVar) throws Exception {
        int iA = IdCaptureModuleScreenKt.d.a();
        return (ObservableSource) b(IdCaptureModuleScreenKt.d.a(), new Object[]{this, wVar}, iA, IdCaptureModuleScreenKt.d.a(), IdCaptureModuleScreenKt.d.a(), -739080144, 739080145);
    }

    public /* synthetic */ SingleSource e(bn bnVar, bh bhVar) throws Exception {
        int iA = IdCaptureModuleScreenKt.d.a();
        return (SingleSource) b(IdCaptureModuleScreenKt.d.a(), new Object[]{this, bnVar, bhVar}, iA, IdCaptureModuleScreenKt.d.a(), IdCaptureModuleScreenKt.d.a(), -470346722, 470346729);
    }

    public /* synthetic */ ObservableSource e(Function function, bh bhVar) throws Exception {
        int iA = IdCaptureModuleScreenKt.d.a();
        return (ObservableSource) b(IdCaptureModuleScreenKt.d.a(), new Object[]{this, function, bhVar}, iA, IdCaptureModuleScreenKt.d.a(), IdCaptureModuleScreenKt.d.a(), -803231078, 803231078);
    }

    public /* synthetic */ SingleSource c(String str, float f2, float f3, bh bhVar) throws Exception {
        return (SingleSource) b(IdCaptureModuleScreenKt.d.a(), new Object[]{this, str, Float.valueOf(f2), Float.valueOf(f3), bhVar}, IdCaptureModuleScreenKt.d.a(), IdCaptureModuleScreenKt.d.a(), IdCaptureModuleScreenKt.d.a(), -1433890078, 1433890080);
    }

    private <T> Single<T> e(Function<String, Single<T>> function) {
        int iA = IdCaptureModuleScreenKt.d.a();
        return (Single) b(IdCaptureModuleScreenKt.d.a(), new Object[]{this, function}, iA, IdCaptureModuleScreenKt.d.a(), IdCaptureModuleScreenKt.d.a(), 1112491429, -1112491416);
    }

    private <T> Observable<T> d(Function<String, Observable<T>> function) {
        int iA = IdCaptureModuleScreenKt.d.a();
        return (Observable) b(IdCaptureModuleScreenKt.d.a(), new Object[]{this, function}, iA, IdCaptureModuleScreenKt.d.a(), IdCaptureModuleScreenKt.d.a(), 1039237223, -1039237206);
    }

    private void g() throws Throwable {
        int iA = IdCaptureModuleScreenKt.d.a();
        b(IdCaptureModuleScreenKt.d.a(), new Object[]{this}, iA, IdCaptureModuleScreenKt.d.a(), IdCaptureModuleScreenKt.d.a(), 444352694, -444352691);
    }

    private void d() throws Throwable {
        int iA = IdCaptureModuleScreenKt.d.a();
        b(IdCaptureModuleScreenKt.d.a(), new Object[]{this}, iA, IdCaptureModuleScreenKt.d.a(), IdCaptureModuleScreenKt.d.a(), 447429535, -447429525);
    }
}
