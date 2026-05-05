package com.incode.welcome_sdk.ui.camera.id_validation;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.c.a.g;
import com.google.common.base.Ascii;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.commons.utils.BitmapUtils;
import com.incode.welcome_sdk.commons.utils.l;
import com.incode.welcome_sdk.data.ImageType;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.remote.beans.ResponseGetImages;
import com.incode.welcome_sdk.modules.IdScan;
import com.incode.welcome_sdk.results.IdScanResult;
import com.incode.welcome_sdk.ui.camera.id_validation.ReferredToExecutiveContract;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.lang.reflect.Method;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.msgpack.core.MessagePack;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class ReferredToExecutivePresenter implements ReferredToExecutiveContract.Presenter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    private static int f11624a = 0;

    /* JADX INFO: renamed from: f */
    private static int f11625f = 0;

    /* JADX INFO: renamed from: g */
    private static byte[] f11626g = null;

    /* JADX INFO: renamed from: h */
    private static short[] f11627h = null;

    /* JADX INFO: renamed from: i */
    private static int f11628i = 0;

    /* JADX INFO: renamed from: j */
    private static int f11629j = 0;

    /* JADX INFO: renamed from: k */
    private static int f11630k = 0;

    /* JADX INFO: renamed from: n */
    private static int f11631n = 0;

    /* JADX INFO: renamed from: o */
    private static int f11632o = 0;

    /* JADX INFO: renamed from: b */
    private final IncodeWelcomeRepository f11633b;

    /* JADX INFO: renamed from: c */
    private final ReferredToExecutiveContract.View f11634c;

    /* JADX INFO: renamed from: d */
    private final CompositeDisposable f11635d;

    /* JADX INFO: renamed from: e */
    private final IdScan.IdType f11636e;

    private static String $$c(int i2, byte b2, short s2) {
        int i3 = s2 + 65;
        byte[] bArr = $$a;
        int i4 = b2 * 3;
        int i5 = i2 + 4;
        byte[] bArr2 = new byte[i4 + 1];
        int i6 = -1;
        if (bArr == null) {
            i3 = i4 + i3;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            i5++;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            i3 += bArr[i5];
        }
    }

    static void init$0() {
        $$a = new byte[]{Ascii.ESC, -99, -92, 1};
        $$b = 21;
    }

    @Inject
    public ReferredToExecutivePresenter(IncodeWelcomeRepository incodeWelcomeRepository, ReferredToExecutiveContract.View view) {
        IdScan.IdType idType;
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(view, "");
        this.f11633b = incodeWelcomeRepository;
        this.f11634c = view;
        this.f11635d = new CompositeDisposable();
        IdScanResult idFrontResult = incodeWelcomeRepository.getIdFrontResult();
        this.f11636e = (idFrontResult == null || (idType = idFrontResult.chosenIdType) == null) ? IdScan.IdType.ID : idType;
    }

    public static final /* synthetic */ IdScan.IdType access$getIdType$p(ReferredToExecutivePresenter referredToExecutivePresenter) {
        int i2 = 2 % 2;
        int i3 = f11630k;
        int i4 = i3 + 123;
        f11625f = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        IdScan.IdType idType = referredToExecutivePresenter.f11636e;
        if (i5 != 0) {
            obj.hashCode();
            throw null;
        }
        int i6 = i3 + 1;
        f11625f = i6 % 128;
        if (i6 % 2 == 0) {
            return idType;
        }
        throw null;
    }

    public static final /* synthetic */ IncodeWelcomeRepository access$getMIncodeWelcomeRepository$p(ReferredToExecutivePresenter referredToExecutivePresenter) {
        int i2 = 2 % 2;
        int i3 = f11625f;
        int i4 = i3 + 13;
        f11630k = i4 % 128;
        int i5 = i4 % 2;
        IncodeWelcomeRepository incodeWelcomeRepository = referredToExecutivePresenter.f11633b;
        int i6 = i3 + 83;
        f11630k = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 0 / 0;
        }
        return incodeWelcomeRepository;
    }

    public static final /* synthetic */ ReferredToExecutiveContract.View access$getMView$p(ReferredToExecutivePresenter referredToExecutivePresenter) {
        int i2 = 2 % 2;
        int i3 = f11630k + 41;
        f11625f = i3 % 128;
        int i4 = i3 % 2;
        ReferredToExecutiveContract.View view = referredToExecutivePresenter.f11634c;
        if (i4 == 0) {
            return view;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BasePresenter
    public final void onDestroy() {
        int i2 = 2 % 2;
        int i3 = f11625f + 21;
        f11630k = i3 % 128;
        if (i3 % 2 == 0) {
            this.f11635d.clear();
            int i4 = 45 / 0;
        } else {
            this.f11635d.clear();
        }
        int i5 = f11625f + 67;
        f11630k = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 75 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.ReferredToExecutiveContract.Presenter
    public final void init() {
        int i2 = 2 % 2;
        int i3 = f11625f + 91;
        f11630k = i3 % 128;
        if (i3 % 2 != 0) {
            this.f11634c.showResults(this.f11636e);
            if (IncodeWelcome.Companion.getInstance().getInternalConfig().isDownloadImagesEnabled() && this.f11636e == IdScan.IdType.ID) {
                a();
                int i4 = f11630k + 35;
                f11625f = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 4 / 4;
                    return;
                }
                return;
            }
            return;
        }
        this.f11634c.showResults(this.f11636e);
        IncodeWelcome.Companion.getInstance().getInternalConfig().isDownloadImagesEnabled();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class a extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f11641a = 0;

        /* JADX INFO: renamed from: b */
        private static int f11642b = 0;

        /* JADX INFO: renamed from: c */
        private static int f11643c = 1;

        /* JADX INFO: renamed from: d */
        public static final a f11644d = new a();

        /* JADX INFO: renamed from: e */
        private static int f11645e = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f11645e + 45;
            f11642b = i3 % 128;
            int i4 = i3 % 2;
            c(th);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                return unit;
            }
            throw null;
        }

        private static void c(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f11645e + 113;
            f11642b = i3 % 128;
            int i4 = i3 % 2;
            Timber.Forest.e(th);
            int i5 = f11642b + 41;
            f11645e = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 9 / 0;
            }
        }

        static {
            int i2 = f11641a + 81;
            f11643c = i2 % 128;
            int i3 = i2 % 2;
        }

        a() {
            super(1);
        }
    }

    static final class e extends Lambda implements Function1<ResponseGetImages, Unit> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: b */
        private static int f11646b = 0;

        /* JADX INFO: renamed from: c */
        private static long f11647c = 0;

        /* JADX INFO: renamed from: d */
        private static char[] f11648d = null;

        /* JADX INFO: renamed from: e */
        private static int f11649e = 0;

        /* JADX WARN: Removed duplicated region for block: B:20:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0028 -> B:17:0x0016). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(byte r6, byte r7, short r8) {
            /*
                int r0 = r8 * 3
                int r0 = 3 - r0
                int r8 = r7 + 113
                int r2 = r6 * 3
                int r1 = 1 - r2
                byte[] r7 = com.incode.welcome_sdk.ui.camera.id_validation.ReferredToExecutivePresenter.e.$$a
                byte[] r6 = new byte[r1]
                r5 = 0
                int r4 = 0 - r2
                if (r7 != 0) goto L2b
                r8 = r4
                r1 = r0
                r3 = r5
            L16:
                int r8 = r8 + r0
                r0 = r1
                r2 = r3
            L19:
                byte r1 = (byte) r8
                r6[r2] = r1
                int r1 = r0 + 1
                int r3 = r2 + 1
                if (r2 != r4) goto L28
                java.lang.String r0 = new java.lang.String
                r0.<init>(r6, r5)
                return r0
            L28:
                r0 = r7[r1]
                goto L16
            L2b:
                r2 = r5
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.id_validation.ReferredToExecutivePresenter.e.$$c(byte, byte, short):java.lang.String");
        }

        static void init$0() {
            $$a = new byte[]{52, -111, -122, 98};
            $$b = 18;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(ResponseGetImages responseGetImages) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f11649e + 27;
            f11646b = i3 % 128;
            int i4 = i3 % 2;
            c(responseGetImages);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                return unit;
            }
            throw null;
        }

        private void c(ResponseGetImages responseGetImages) throws Throwable {
            File imagesDirectory;
            Object obj;
            int i2 = 2 % 2;
            String image = responseGetImages.getImage(ImageType.croppedFrontID);
            String image2 = responseGetImages.getImage(ImageType.croppedBackID);
            if (!TextUtils.isEmpty(image)) {
                int i3 = f11649e + 9;
                f11646b = i3 % 128;
                if (i3 % 2 != 0) {
                    imagesDirectory = ReferredToExecutivePresenter.access$getMIncodeWelcomeRepository$p(ReferredToExecutivePresenter.this).getImagesDirectory();
                    Object[] objArr = new Object[1];
                    f(Color.green(0), 108 << KeyEvent.normalizeMetaState(0), (char) (21740 << (ViewConfiguration.getTouchSlop() * 77)), objArr);
                    obj = objArr[0];
                } else {
                    imagesDirectory = ReferredToExecutivePresenter.access$getMIncodeWelcomeRepository$p(ReferredToExecutivePresenter.this).getImagesDirectory();
                    Object[] objArr2 = new Object[1];
                    f(Color.green(0), 15 - KeyEvent.normalizeMetaState(0), (char) ((ViewConfiguration.getTouchSlop() >> 8) + 17220), objArr2);
                    obj = objArr2[0];
                }
                BitmapUtils.saveBase64ImageToFile(image, imagesDirectory, ((String) obj).intern());
            }
            if (!TextUtils.isEmpty(image2)) {
                int i4 = f11649e + 75;
                f11646b = i4 % 128;
                int i5 = i4 % 2;
                File imagesDirectory2 = ReferredToExecutivePresenter.access$getMIncodeWelcomeRepository$p(ReferredToExecutivePresenter.this).getImagesDirectory();
                Object[] objArr3 = new Object[1];
                f(15 - KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 14, (char) (10441 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), objArr3);
                BitmapUtils.saveBase64ImageToFile(image2, imagesDirectory2, ((String) objArr3[0]).intern());
            }
            ReferredToExecutivePresenter.access$getMView$p(ReferredToExecutivePresenter.this).showResults(ReferredToExecutivePresenter.access$getIdType$p(ReferredToExecutivePresenter.this));
        }

        private static void f(int i2, int i3, char c2, Object[] objArr) throws Throwable {
            int i4 = 2 % 2;
            g gVar = new g();
            long[] jArr = new long[i3];
            gVar.f2752c = 0;
            int i5 = $10 + 95;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 5 / 2;
            }
            while (gVar.f2752c < i3) {
                int i7 = $11 + 99;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                int i9 = gVar.f2752c;
                try {
                    Object[] objArr2 = {Integer.valueOf(f11648d[i2 + i9])};
                    Object objC = com.c.a.e.e.c(-542847437);
                    if (objC == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objC = com.c.a.e.e.e((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 18, (ViewConfiguration.getEdgeSlop() >> 16) + 1028, -549532598, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objC).invoke(null, objArr2)).longValue()), Long.valueOf(i9), Long.valueOf(f11647c), Integer.valueOf(c2)};
                    Object objC2 = com.c.a.e.e.c(1506450485);
                    if (objC2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 1);
                        objC2 = com.c.a.e.e.e((char) ((Process.myPid() >> 22) + 60521), 20 - View.resolveSizeAndState(0, 0, 0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 922, 1498455628, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i9] = ((Long) ((Method) objC2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {gVar, gVar};
                    Object objC3 = com.c.a.e.e.c(-364489268);
                    if (objC3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 + 3);
                        objC3 = com.c.a.e.e.e((char) (9087 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 18, Gravity.getAbsoluteGravity(0, 0) + 242, -354658379, false, $$c(b6, b7, (byte) (b7 - 3)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objC3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr = new char[i3];
            gVar.f2752c = 0;
            while (gVar.f2752c < i3) {
                cArr[gVar.f2752c] = (char) jArr[gVar.f2752c];
                Object[] objArr5 = {gVar, gVar};
                Object objC4 = com.c.a.e.e.c(-364489268);
                if (objC4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = (byte) (b8 + 3);
                    objC4 = com.c.a.e.e.e((char) (9087 - KeyEvent.getDeadChar(0, 0)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 18, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 241, -354658379, false, $$c(b8, b9, (byte) (b9 - 3)), new Class[]{Object.class, Object.class});
                }
                ((Method) objC4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr);
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f11646b = 0;
            f11649e = 1;
            f11648d = new char[]{8646, 65429, 40271, 47885, 22728, 30356, 5235, 12814, 54246, 61887, 36722, 44332, 19163, 26793, 1640, 19019, 37912, 63170, 53376, 13125, 7449, 32766, 22919, 47224, 39486, 58618, 50826, 8544, 809};
            f11647c = 7494408164957338804L;
        }

        e() {
            super(1);
        }
    }

    public static final void a(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f11625f + 55;
        f11630k = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f11625f + 89;
        f11630k = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 20 / 0;
        }
    }

    public static final void b(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f11630k + 5;
        f11625f = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
        } else {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    private final void a() {
        int i2 = 2 % 2;
        ImageType[] imageTypeArr = {ImageType.croppedFrontID, ImageType.croppedBackID};
        CompositeDisposable compositeDisposable = this.f11635d;
        Observable<ResponseGetImages> observableObserveOn = this.f11633b.getImages(imageTypeArr, false).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        final e eVar = new e();
        Consumer<? super ResponseGetImages> consumer = new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ReferredToExecutivePresenter$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ReferredToExecutivePresenter.a(eVar, obj);
            }
        };
        final a aVar = a.f11644d;
        compositeDisposable.add(observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ReferredToExecutivePresenter$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ReferredToExecutivePresenter.b(aVar, obj);
            }
        }));
        int i3 = f11630k + 45;
        f11625f = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.ReferredToExecutiveContract.Presenter
    public final int getFrontIdResult() {
        int i2 = 2 % 2;
        IdScanResult idFrontResult = this.f11633b.getIdFrontResult();
        if (idFrontResult == null) {
            return -1;
        }
        int i3 = f11625f + 37;
        f11630k = i3 % 128;
        int i4 = i3 % 2;
        int i5 = idFrontResult.scanStatus;
        int i6 = f11625f + 91;
        f11630k = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.ReferredToExecutiveContract.Presenter
    public final int getBackIdResult() {
        int i2 = 2 % 2;
        IdScanResult idBackResult = this.f11633b.getIdBackResult();
        if (idBackResult == null) {
            return -1;
        }
        int i3 = f11630k + 75;
        f11625f = i3 % 128;
        int i4 = i3 % 2;
        int i5 = idBackResult.scanStatus;
        int i6 = f11630k + 125;
        f11625f = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.ReferredToExecutiveContract.Presenter
    public final File getImageFile(IdScan.IdType idType, IdScan.ScanStep scanStep) throws Throwable {
        String strIntern;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(idType, "");
        Intrinsics.checkNotNullParameter(scanStep, "");
        int i4 = WhenMappings.f11640e[idType.ordinal()];
        if (i4 == 1) {
            Object[] objArr = new Object[1];
            l((ViewConfiguration.getDoubleTapTimeout() >> 16) + 1944517535, (byte) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (short) (TextUtils.getOffsetBefore("", 0) - 74), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1076846008, (-44) - TextUtils.getOffsetAfter("", 0), objArr);
            strIntern = ((String) objArr[0]).intern();
        } else {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i5 = WhenMappings.f11638b[scanStep.ordinal()];
            if (i5 == 1 || i5 == 2) {
                Object[] objArr2 = new Object[1];
                l(1944517550 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (byte) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), (short) (Color.green(0) + 48), Color.blue(0) - 1076846007, (-44) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr2);
                strIntern = ((String) objArr2[0]).intern();
                i2 = f11625f + 77;
            } else {
                if (i5 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                Object[] objArr3 = new Object[1];
                l(1944517564 - ((Process.getThreadPriority(0) + 20) >> 6), (byte) (TextUtils.lastIndexOf("", '0') + 1), (short) ((-11) - TextUtils.indexOf("", "", 0, 0)), (-1076846007) - (ViewConfiguration.getEdgeSlop() >> 16), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 46, objArr3);
                strIntern = ((String) objArr3[0]).intern();
                i2 = f11625f + 1;
            }
            f11630k = i2 % 128;
            int i6 = i2 % 2;
        }
        File imagesDirectory = this.f11633b.getImagesDirectory();
        Intrinsics.checkNotNullExpressionValue(imagesDirectory, "");
        return l.b(imagesDirectory, strIntern);
    }

    private static void l(int i2, byte b2, short s2, int i3, int i4, Object[] objArr) throws Throwable {
        boolean z2;
        int i5 = 2;
        int i6 = 2 % 2;
        com.c.a.l lVar = new com.c.a.l();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(f11629j)};
            Object objC = com.c.a.e.e.c(1394921452);
            char c2 = 3;
            if (objC == null) {
                char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 7674);
                int touchSlop = 27 - (ViewConfiguration.getTouchSlop() >> 8);
                int packedPositionChild = 526 - ExpandableListView.getPackedPositionChild(0L);
                byte b3 = (byte) (-$$a[3]);
                byte b4 = (byte) (b3 + 1);
                objC = com.c.a.e.e.e(tapTimeout, touchSlop, packedPositionChild, 1405013397, false, $$c(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objC).invoke(null, objArr2)).intValue();
            int i7 = iIntValue == -1 ? 1 : 0;
            if (i7 != 0) {
                int i8 = $11 + 85;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                byte[] bArr = f11626g;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i10 = 0;
                    while (i10 < length) {
                        int i11 = $10 + 31;
                        $11 = i11 % 128;
                        int i12 = i11 % i5;
                        Object[] objArr3 = {Integer.valueOf(bArr[i10])};
                        Object objC2 = com.c.a.e.e.c(-713221154);
                        if (objC2 == null) {
                            char cIndexOf = (char) (65414 - TextUtils.indexOf("", "", 0, 0));
                            int capsMode = TextUtils.getCapsMode("", 0, 0) + 19;
                            int i13 = 262 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                            byte b5 = (byte) (-$$a[c2]);
                            byte b6 = (byte) (b5 + 1);
                            objC2 = com.c.a.e.e.e(cIndexOf, capsMode, i13, -706274905, false, $$c(b5, b6, (byte) (b6 + 3)), new Class[]{Integer.TYPE});
                        }
                        bArr2[i10] = ((Byte) ((Method) objC2).invoke(null, objArr3)).byteValue();
                        i10++;
                        i5 = 2;
                        c2 = 3;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = f11626g;
                    Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(f11624a)};
                    Object objC3 = com.c.a.e.e.c(1394921452);
                    if (objC3 == null) {
                        char offsetBefore = (char) (7674 - TextUtils.getOffsetBefore("", 0));
                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 27;
                        int i14 = 528 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        byte b7 = (byte) (-$$a[3]);
                        byte b8 = (byte) (b7 + 1);
                        objC3 = com.c.a.e.e.e(offsetBefore, absoluteGravity, i14, 1405013397, false, $$c(b7, b8, b8), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objC3).invoke(null, objArr4)).intValue()]) ^ 8033500363701343155L)) + ((int) (((long) f11629j) ^ 8033500363701343155L)));
                } else {
                    iIntValue = (short) (((short) (((long) f11627h[i2 + ((int) (((long) f11624a) ^ 8033500363701343155L))]) ^ 8033500363701343155L)) + ((int) (((long) f11629j) ^ 8033500363701343155L)));
                }
            }
            if (iIntValue > 0) {
                int i15 = $11 + 61;
                $10 = i15 % 128;
                int i16 = i15 % 2;
                lVar.f2775b = ((i2 + iIntValue) - 2) + ((int) (((long) f11624a) ^ 8033500363701343155L)) + i7;
                Object[] objArr5 = {lVar, Integer.valueOf(i3), Integer.valueOf(f11628i), sb};
                Object objC4 = com.c.a.e.e.c(-893097792);
                if (objC4 == null) {
                    char c3 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 19416);
                    int offsetBefore2 = 20 - TextUtils.getOffsetBefore("", 0);
                    int iIndexOf = 1067 - TextUtils.indexOf("", "");
                    byte b9 = $$a[3];
                    byte b10 = (byte) (-b9);
                    objC4 = com.c.a.e.e.e(c3, offsetBefore2, iIndexOf, -899781959, false, $$c(b10, (byte) (b10 + 1), b9), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objC4).invoke(null, objArr5)).append(lVar.f2776c);
                lVar.f2774a = lVar.f2776c;
                byte[] bArr4 = f11626g;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i17 = $10 + 65;
                    $11 = i17 % 128;
                    if (i17 % 2 == 0) {
                        int i18 = 3 % 2;
                    }
                    for (int i19 = 0; i19 < length2; i19++) {
                        bArr5[i19] = (byte) (((long) bArr4[i19]) ^ 8033500363701343155L);
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    z2 = true;
                } else {
                    int i20 = $10 + 59;
                    $11 = i20 % 128;
                    int i21 = i20 % 2;
                    z2 = false;
                }
                lVar.f2777d = 1;
                while (lVar.f2777d < iIntValue) {
                    int i22 = $10 + 117;
                    $11 = i22 % 128;
                    if (i22 % 2 == 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (z2) {
                        byte[] bArr6 = f11626g;
                        lVar.f2775b = lVar.f2775b - 1;
                        lVar.f2776c = (char) (lVar.f2774a + (((byte) (((byte) (((long) bArr6[r3]) ^ 8033500363701343155L)) + s2)) ^ b2));
                    } else {
                        short[] sArr = f11627h;
                        lVar.f2775b = lVar.f2775b - 1;
                        lVar.f2776c = (char) (lVar.f2774a + (((short) (((short) (((long) sArr[r3]) ^ 8033500363701343155L)) + s2)) ^ b2));
                    }
                    sb.append(lVar.f2776c);
                    lVar.f2774a = lVar.f2776c;
                    lVar.f2777d++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        private static int f11637a = 0;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f11638b;

        /* JADX INFO: renamed from: d */
        private static int f11639d = 1;

        /* JADX INFO: renamed from: e */
        public static final /* synthetic */ int[] f11640e;

        static {
            int[] iArr = new int[IdScan.ScanStep.values().length];
            try {
                iArr[IdScan.ScanStep.FRONT.ordinal()] = 1;
                int i2 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IdScan.ScanStep.BOTH.ordinal()] = 2;
                int i3 = f11639d + 21;
                f11637a = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IdScan.ScanStep.BACK.ordinal()] = 3;
                int i6 = f11637a + 95;
                f11639d = i6 % 128;
                int i7 = i6 % 2;
                int i8 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            f11638b = iArr;
            int[] iArr2 = new int[IdScan.IdType.values().length];
            try {
                iArr2[IdScan.IdType.PASSPORT.ordinal()] = 1;
                int i9 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[IdScan.IdType.ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f11640e = iArr2;
        }
    }

    static void e() {
        f11624a = -176498734;
        f11629j = 2036585359;
        f11628i = 961318298;
        f11626g = new byte[]{-1, -2, -6, -12, -7, -17, -120, -24, -10, -6, -8, -13, -16, -29, -12, 120, 105, 8, 101, 124, 126, 111, 100, 8, 107, 116, 97, 109, 112, -75, -90, 76, MessagePack.Code.FIXSTR_PREFIX, -66, -71, -67, 69, MessagePack.Code.FIXSTR_PREFIX, -79, -66, -86, 77, -77, -77, -77};
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f11631n = 0;
        f11632o = 1;
        f11625f = 0;
        f11630k = 1;
        e();
        int i2 = f11631n + 95;
        f11632o = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
