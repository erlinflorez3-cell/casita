package com.incode.welcome_sdk.c.c;

import android.app.Application;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.c.a.q;
import com.incode.welcome_sdk.SdkMode;
import com.incode.welcome_sdk.commons.utils.z;
import io.sentry.Hint;
import io.sentry.ILogger;
import io.sentry.IScope;
import io.sentry.Sentry;
import io.sentry.SentryEvent;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.Session;
import io.sentry.android.core.ActivityFramesTracker;
import io.sentry.android.core.AndroidLogger;
import io.sentry.android.core.BuildInfoProvider;
import io.sentry.android.core.LoadClass;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.protocol.SdkVersion;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public final class c {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    private static int f4515a = 0;

    /* JADX INFO: renamed from: b */
    private static boolean f4516b = false;

    /* JADX INFO: renamed from: c */
    private static char f4517c = 0;

    /* JADX INFO: renamed from: d */
    private static int f4518d = 0;

    /* JADX INFO: renamed from: e */
    private static long f4519e = 0;

    /* JADX INFO: renamed from: f */
    private static int f4520f = 0;

    /* JADX INFO: renamed from: g */
    private static int f4521g = 0;

    /* JADX INFO: renamed from: h */
    private static int f4522h = 0;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0026 -> B:17:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r9, short r10, short r11) {
        /*
            int r0 = r11 * 4
            int r8 = r0 + 4
            int r0 = r9 * 2
            int r7 = r0 + 1
            byte[] r6 = com.incode.welcome_sdk.c.c.c.$$a
            int r0 = r10 * 3
            int r5 = 111 - r0
            byte[] r4 = new byte[r7]
            r3 = 0
            if (r6 != 0) goto L2b
            r0 = r8
            r2 = r3
        L15:
            int r8 = r8 + 1
            int r5 = r5 + r0
            r1 = r2
        L19:
            byte r0 = (byte) r5
            int r2 = r1 + 1
            r4[r1] = r0
            if (r2 != r7) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L26:
            r1 = r6[r8]
            r0 = r5
            r5 = r1
            goto L15
        L2b:
            r1 = r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.c.c.c.$$c(byte, short, short):java.lang.String");
    }

    static void init$0() {
        $$a = new byte[]{113, 6, MessagePack.Code.FIXARRAY_PREFIX, 1};
        $$b = 122;
    }

    private c() {
    }

    private static void d() {
        int i2 = 2 % 2;
        int i3 = f4518d + 35;
        f4522h = i3 % 128;
        if (i3 % 2 != 0) {
            if (f4516b) {
                SentryOptions sentryOptions = new SentryOptions();
                sentryOptions.setEnabled(false);
                e.f4530c.b(sentryOptions);
                int i4 = f4518d + 113;
                f4522h = i4 % 128;
                int i5 = i4 % 2;
            }
            f4516b = false;
            int i6 = f4522h + 67;
            f4518d = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        throw null;
    }

    @JvmStatic
    public static final void d(Application application, boolean z2, SdkMode sdkMode) {
        int i2 = 2 % 2;
        int i3 = f4522h + 63;
        f4518d = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(application, "");
            Intrinsics.checkNotNullParameter(sdkMode, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(sdkMode, "");
        if (!f4516b && z2) {
            int i4 = f4522h + 103;
            f4518d = i4 % 128;
            int i5 = i4 % 2;
            if (sdkMode != SdkMode.CAPTURE_ONLY) {
                int i6 = f4522h + 69;
                f4518d = i6 % 128;
                int i7 = i6 % 2;
                a(application);
                return;
            }
        }
        if (!z2 || sdkMode == SdkMode.CAPTURE_ONLY) {
            d();
            int i8 = f4518d + 75;
            f4522h = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    private static void i(String str, int i2, char c2, String str2, String str3, Object[] objArr) throws Throwable {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        int i3 = 2 % 2;
        Object charArray = str6;
        if (str6 != null) {
            int i4 = $11 + 11;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 97 / 0;
                charArray = str6.toCharArray();
            } else {
                charArray = str6.toCharArray();
            }
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str5;
        if (str5 != null) {
            charArray2 = str5.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str4;
        if (str4 != null) {
            charArray3 = str4.toCharArray();
        }
        q qVar = new q();
        int length = cArr.length;
        char[] cArr3 = new char[length];
        int length2 = cArr2.length;
        char[] cArr4 = new char[length2];
        System.arraycopy(cArr, 0, cArr3, 0, length);
        System.arraycopy(cArr2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c2);
        cArr4[2] = (char) (cArr4[2] + ((char) i2));
        int length3 = ((char[]) charArray3).length;
        char[] cArr5 = new char[length3];
        qVar.f2785d = 0;
        while (qVar.f2785d < length3) {
            try {
                Object[] objArr2 = {qVar};
                Object objC = com.c.a.e.e.c(1902411467);
                if (objC == null) {
                    objC = com.c.a.e.e.e((char) (((Process.getThreadPriority(0) + 20) >> 6) + 42780), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 15, 134 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1912503474, false, "k", new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objC).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {qVar};
                Object objC2 = com.c.a.e.e.c(1563994930);
                if (objC2 == null) {
                    byte b2 = (byte) ($$a[3] - 1);
                    byte b3 = b2;
                    objC2 = com.c.a.e.e.e((char) (ImageFormat.getBitsPerPixel(0) + 1), KeyEvent.normalizeMetaState(0) + 19, TextUtils.lastIndexOf("", '0', 0, 0) + 676, 1570941259, false, $$c(b2, b3, b3), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objC2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {qVar, Integer.valueOf(cArr3[qVar.f2785d % 4] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objC3 = com.c.a.e.e.c(-869156665);
                if (objC3 == null) {
                    char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int iAlpha = 27 - Color.alpha(0);
                    int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 573;
                    byte b4 = $$a[3];
                    byte b5 = (byte) (b4 - 1);
                    byte b6 = b4;
                    objC3 = com.c.a.e.e.e(keyRepeatDelay, iAlpha, packedPositionGroup, -861160770, false, $$c(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objC3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objC4 = com.c.a.e.e.c(911331319);
                if (objC4 == null) {
                    objC4 = com.c.a.e.e.e((char) (KeyEvent.keyCodeFromString("") + 9336), 17 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0, 0) + 1395, 919326094, false, "m", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr4[iIntValue2] = ((Character) ((Method) objC4).invoke(null, objArr5)).charValue();
                cArr3[iIntValue2] = qVar.f2784b;
                cArr5[qVar.f2785d] = (char) (((((long) (cArr3[iIntValue2] ^ r8[qVar.f2785d])) ^ (f4519e ^ 1009698840002613947L)) ^ ((long) ((int) (((long) f4515a) ^ 1009698840002613947L)))) ^ ((long) ((char) (((long) f4517c) ^ 1009698840002613947L))));
                qVar.f2785d++;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str7 = new String(cArr5);
        int i6 = $10 + 17;
        $11 = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
        objArr[0] = str7;
    }

    public static final void b(AndroidLogger androidLogger, Application application, Sentry.OptionsConfiguration optionsConfiguration, SentryAndroidOptions sentryAndroidOptions) throws Throwable {
        boolean z2;
        boolean z3;
        Class<?> cls;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(androidLogger, "");
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(optionsConfiguration, "");
        LoadClass loadClass = new LoadClass();
        SentryAndroidOptions sentryAndroidOptions2 = sentryAndroidOptions;
        boolean zIsClassAvailable = loadClass.isClassAvailable("timber.log.Timber", sentryAndroidOptions2);
        if (loadClass.isClassAvailable("androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks", sentryAndroidOptions2) && loadClass.isClassAvailable("io.sentry.android.fragment.FragmentLifecycleIntegration", sentryAndroidOptions2)) {
            int i3 = f4522h + 69;
            f4518d = i3 % 128;
            int i4 = i3 % 2;
            z2 = true;
        } else {
            int i5 = f4522h + 125;
            f4518d = i5 % 128;
            int i6 = i5 % 2;
            z2 = false;
        }
        if (zIsClassAvailable && loadClass.isClassAvailable("io.sentry.android.timber.SentryTimberIntegration", sentryAndroidOptions2)) {
            int i7 = f4522h + 39;
            f4518d = i7 % 128;
            int i8 = i7 % 2;
            z3 = true;
        } else {
            z3 = false;
        }
        boolean zIsClassAvailable2 = loadClass.isClassAvailable("io.sentry.android.replay.ReplayIntegration", sentryAndroidOptions2);
        BuildInfoProvider buildInfoProvider = new BuildInfoProvider(androidLogger);
        Intrinsics.checkNotNull(sentryAndroidOptions);
        int iA = a(sentryAndroidOptions2);
        LoadClass loadClass2 = new LoadClass();
        if (iA == 8) {
            int i9 = f4522h + 69;
            f4518d = i9 % 128;
            int i10 = i9 % 2;
            cls = Class.forName("io.sentry.util.LoadClass");
        } else {
            cls = LoadClass.class;
        }
        Object objNewInstance = iA == 8 ? Class.forName("io.sentry.android.core.ActivityFramesTracker").getConstructor(cls, SentryAndroidOptions.class).newInstance(loadClass2, sentryAndroidOptions) : new ActivityFramesTracker(loadClass2, sentryAndroidOptions);
        z zVar = z.f6699c;
        Method methodD = z.d("io.sentry.android.core.AndroidOptionsInitializer", "loadDefaultAndMetadataOptions", SentryAndroidOptions.class, Context.class, ILogger.class, BuildInfoProvider.class);
        if (methodD == null) {
            sentryAndroidOptions.getLogger().log(SentryLevel.ERROR, "Error in calling io.sentry.android.core.AndroidOptionsInitializer.loadDefaultAndMetadataOptions(). Will proceed without crash reporting working.", new Object[0]);
        } else {
            z zVar2 = z.f6699c;
            z.b(methodD, (Object) null, sentryAndroidOptions, application, androidLogger, buildInfoProvider);
        }
        z zVar3 = z.f6699c;
        Intrinsics.checkNotNull(cls);
        char c2 = 4;
        Class cls2 = Boolean.TYPE;
        Intrinsics.checkNotNull(cls2);
        Class cls3 = Boolean.TYPE;
        Intrinsics.checkNotNull(cls3);
        Class cls4 = Boolean.TYPE;
        Intrinsics.checkNotNull(cls4);
        Method methodD2 = z.d("io.sentry.android.core.AndroidOptionsInitializer", "installDefaultIntegrations", Context.class, SentryAndroidOptions.class, BuildInfoProvider.class, cls, ActivityFramesTracker.class, cls2, cls3, cls4);
        if (methodD2 == null) {
            sentryAndroidOptions.getLogger().log(SentryLevel.ERROR, "Error in calling io.sentry.android.core.AndroidOptionsInitializer.installDefaultIntegrations(). Will proceed without crash reporting working.", new Object[0]);
            int i11 = f4518d + 83;
            f4522h = i11 % 128;
            int i12 = i11 % 2;
        } else {
            z zVar4 = z.f6699c;
            Intrinsics.checkNotNull(objNewInstance);
            c2 = 4;
            z.b(methodD2, (Object) null, application, sentryAndroidOptions, buildInfoProvider, loadClass2, objNewInstance, Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(zIsClassAvailable2));
        }
        try {
            optionsConfiguration.configure(sentryAndroidOptions);
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().log(SentryLevel.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th);
        }
        z zVar5 = z.f6699c;
        Class[] clsArr = new Class[5];
        clsArr[0] = SentryAndroidOptions.class;
        clsArr[1] = Context.class;
        clsArr[2] = BuildInfoProvider.class;
        clsArr[3] = cls;
        clsArr[c2] = ActivityFramesTracker.class;
        Method methodD3 = z.d("io.sentry.android.core.AndroidOptionsInitializer", "initializeIntegrationsAndProcessors", clsArr);
        if (methodD3 == null) {
            sentryAndroidOptions.getLogger().log(SentryLevel.ERROR, "Error in calling io.sentry.android.core.AndroidOptionsInitializer.initializeIntegrationsAndProcessors(). Will proceed without crash reporting working.", new Object[0]);
            return;
        }
        z zVar6 = z.f6699c;
        Intrinsics.checkNotNull(objNewInstance);
        z.b(methodD3, (Object) null, sentryAndroidOptions, application, buildInfoProvider, loadClass2, objNewInstance);
    }

    public static final void a(AtomicBoolean atomicBoolean, IScope iScope) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(atomicBoolean, "");
        Intrinsics.checkNotNull(iScope);
        Session session = iScope.getSession();
        if (session != null) {
            int i3 = f4522h + 99;
            f4518d = i3 % 128;
            int i4 = i3 % 2;
            if (session.getStarted() != null) {
                int i5 = f4518d + 13;
                f4522h = i5 % 128;
                int i6 = i5 % 2;
                atomicBoolean.set(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0067  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void a(final android.app.Application r9) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.c.c.c.a(android.app.Application):void");
    }

    @JvmStatic
    public static final int a(SentryOptions sentryOptions) {
        String str;
        Integer intOrNull;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(sentryOptions, "");
        SdkVersion sdkVersion = sentryOptions.getSdkVersion();
        if (sdkVersion != null) {
            int i3 = f4518d + 113;
            f4522h = i3 % 128;
            int i4 = i3 % 2;
            String version = sdkVersion.getVersion();
            if (version != null) {
                int i5 = f4522h + 93;
                f4518d = i5 % 128;
                int i6 = i5 % 2;
                List listSplit$default = StringsKt.split$default((CharSequence) version, new String[]{"."}, false, 0, 6, (Object) null);
                if (listSplit$default != null && (str = (String) CollectionsKt.getOrNull(listSplit$default, 0)) != null && (intOrNull = StringsKt.toIntOrNull(str)) != null) {
                    int i7 = f4518d + 113;
                    f4522h = i7 % 128;
                    int i8 = i7 % 2;
                    return intOrNull.intValue();
                }
            }
        }
        int i9 = f4522h + 19;
        f4518d = i9 % 128;
        int i10 = i9 % 2;
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final io.sentry.SentryEvent a(android.app.Application r18, io.sentry.SentryEvent r19, io.sentry.Hint r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.c.c.c.a(android.app.Application, io.sentry.SentryEvent, io.sentry.Hint):io.sentry.SentryEvent");
    }

    public static final void a(final Application application, SentryAndroidOptions sentryAndroidOptions) throws Throwable {
        double d2;
        Double dValueOf;
        int i2 = 2 % 2;
        int i3 = f4522h + 85;
        f4518d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(sentryAndroidOptions, "");
        Object[] objArr = new Object[1];
        i("嘰\uee6d섦힖ꏑ挆ֱ߉퉏ߺ\uf43b蕍䫼熏\udd73瓑༽繊ҝῘୱ\uf680\udc63漮쌷ℳᦽ䌭\uec3c\uaa4f껡ఢ熕鹩곳ꤶ갢뙻㮶䚉䬕Ḥ賺⓹簙剢\ud86b\uf8c9\udcf0ḽ涐┇撩ˉ\uf7e2⮑\ue464ၡ塹衧⊺ᓉ\uf11c妷겙礡\uf87f煰屄ផ\uf629\ude3f拟䁒䚋䄣뮳扇ꑒⴀ췴䣣谔틫\ue651茜䙙澄␏购瀆委", 1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (22928 - TextUtils.lastIndexOf("", '0')), "\u0000\u0000\u0000\u0000", "誫\ud800醩\ua959", objArr);
        sentryAndroidOptions.setDsn(((String) objArr[0]).intern());
        sentryAndroidOptions.setDebug(false);
        if (sentryAndroidOptions.isDebug()) {
            int i5 = f4518d + 39;
            f4522h = i5 % 128;
            if (i5 % 2 == 0) {
                dValueOf = Double.valueOf(0.0d);
                sentryAndroidOptions.setSampleRate(dValueOf);
                sentryAndroidOptions.setEnableUncaughtExceptionHandler(false);
                sentryAndroidOptions.addIntegration(new d());
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format(Locale.ROOT, "%s@%s", Arrays.copyOf(new Object[]{"com.incode.welcome_sdk", "5.40.3"}, 2));
                Intrinsics.checkNotNullExpressionValue(str, "");
                sentryAndroidOptions.setRelease(str);
                sentryAndroidOptions.setBeforeSend(new SentryOptions.BeforeSendCallback() { // from class: com.incode.welcome_sdk.c.c.c$$ExternalSyntheticLambda2
                    @Override // io.sentry.SentryOptions.BeforeSendCallback
                    public final SentryEvent execute(SentryEvent sentryEvent, Hint hint) {
                        return c.a(application, sentryEvent, hint);
                    }
                });
                sentryAndroidOptions.enableAllAutoBreadcrumbs(true);
                sentryAndroidOptions.setAttachScreenshot(true);
                sentryAndroidOptions.setAttachViewHierarchy(true);
            }
            d2 = 1.0d;
        } else {
            d2 = 0.25d;
        }
        dValueOf = Double.valueOf(d2);
        sentryAndroidOptions.setSampleRate(dValueOf);
        sentryAndroidOptions.setEnableUncaughtExceptionHandler(false);
        sentryAndroidOptions.addIntegration(new d());
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String str2 = String.format(Locale.ROOT, "%s@%s", Arrays.copyOf(new Object[]{"com.incode.welcome_sdk", "5.40.3"}, 2));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        sentryAndroidOptions.setRelease(str2);
        sentryAndroidOptions.setBeforeSend(new SentryOptions.BeforeSendCallback() { // from class: com.incode.welcome_sdk.c.c.c$$ExternalSyntheticLambda2
            @Override // io.sentry.SentryOptions.BeforeSendCallback
            public final SentryEvent execute(SentryEvent sentryEvent, Hint hint) {
                return c.a(application, sentryEvent, hint);
            }
        });
        sentryAndroidOptions.enableAllAutoBreadcrumbs(true);
        sentryAndroidOptions.setAttachScreenshot(true);
        sentryAndroidOptions.setAttachViewHierarchy(true);
    }

    private static Sentry.OptionsConfiguration<SentryAndroidOptions> e(final Application application) {
        int i2 = 2 % 2;
        int i3 = f4518d + 85;
        f4522h = i3 % 128;
        if (i3 % 2 != 0) {
            return new Sentry.OptionsConfiguration() { // from class: com.incode.welcome_sdk.c.c.c$$ExternalSyntheticLambda3
                @Override // io.sentry.Sentry.OptionsConfiguration
                public final void configure(SentryOptions sentryOptions) throws Throwable {
                    c.a(application, (SentryAndroidOptions) sentryOptions);
                }
            };
        }
        int i4 = 80 / 0;
        return new Sentry.OptionsConfiguration() { // from class: com.incode.welcome_sdk.c.c.c$$ExternalSyntheticLambda3
            @Override // io.sentry.Sentry.OptionsConfiguration
            public final void configure(SentryOptions sentryOptions) throws Throwable {
                c.a(application, (SentryAndroidOptions) sentryOptions);
            }
        };
    }

    static void a() {
        f4519e = 1009698840002613947L;
        f4515a = -797257029;
        f4517c = (char) 44227;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f4521g = 0;
        f4520f = 1;
        f4518d = 0;
        f4522h = 1;
        a();
        new c();
        int i2 = f4521g + 109;
        f4520f = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 38 / 0;
        }
    }
}
