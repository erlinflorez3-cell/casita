package com.incode.welcome_sdk.modules;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.incode.welcome_sdk.commons.utils.an;
import com.incode.welcome_sdk.data.Event;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import java.io.File;
import java.lang.reflect.Method;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class g {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f10681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f10682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f10683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f10684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f10685e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f10686g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static char[] f10687i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ g[] f10688j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f10689k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static boolean f10690l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f10691m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f10692n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static boolean f10693o = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static int f10694t = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f10695f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f10696h;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0018). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r8, short r9, byte r10) {
        /*
            byte[] r7 = com.incode.welcome_sdk.modules.g.$$a
            int r0 = r9 * 50
            int r6 = 122 - r0
            int r0 = r10 * 2
            int r5 = 3 - r0
            int r1 = r8 * 4
            int r0 = 1 - r1
            byte[] r4 = new byte[r0]
            r3 = 0
            int r2 = 0 - r1
            if (r7 != 0) goto L2c
            r1 = r6
            r0 = r3
            r6 = r2
        L18:
            int r6 = r6 + r1
            r1 = r0
        L1a:
            byte r0 = (byte) r6
            r4[r1] = r0
            int r0 = r1 + 1
            if (r1 != r2) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L27:
            int r5 = r5 + 1
            r1 = r7[r5]
            goto L18
        L2c:
            r1 = r3
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.modules.g.$$c(int, short, byte):java.lang.String");
    }

    static void init$0() {
        $$a = new byte[]{53, 69, 94, -115};
        $$b = 111;
    }

    private g(String str, int i2, String str2, String str3) {
        this.f10695f = str2;
        this.f10696h = str3;
    }

    public final String a() {
        int i2 = 2 % 2;
        int i3 = f10689k;
        int i4 = i3 + 31;
        f10691m = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f10696h;
        int i6 = i3 + 49;
        f10691m = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String d() {
        int i2 = 2 % 2;
        int i3 = f10691m + 99;
        f10689k = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f10695f;
        if (i4 == 0) {
            int i5 = 74 / 0;
        }
        return str;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f10692n = 0;
        f10694t = 1;
        f10691m = 0;
        f10689k = 1;
        c();
        f10684d = new g("FRONT_ID_SCAN", 0, "FrontIdScanScreenRecordVideo", "frontId");
        f10682b = new g("BACK_ID_SCAN", 1, "BackIdScanScreenRecordVideo", "backId");
        Object[] objArr = new Object[1];
        p("\u0082\u0085\u0084\u0083\u0082\u0081", null, null, 127 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr);
        f10685e = new g("SELFIE_SCAN_SCREEN", 2, "SelfieScanScreenRecordVideo", ((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        p("\u0082\u0085\u0084\u0083\u0082\u0081", null, null, TextUtils.indexOf("", "") + 127, objArr2);
        f10681a = new g("SELFIE_SCAN_VIDEO", 3, "SelfieScanVideoRecordVideo", ((String) objArr2[0]).intern());
        g[] gVarArrB = b();
        f10688j = gVarArrB;
        EnumEntriesKt.enumEntries(gVarArrB);
        f10683c = new b((byte) 0);
        int i2 = f10692n + 53;
        f10694t = i2 % 128;
        int i3 = i2 % 2;
    }

    public final File d(IncodeWelcomeRepository incodeWelcomeRepository) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        File file = new File(b(incodeWelcomeRepository));
        int i3 = f10689k + 121;
        f10691m = i3 % 128;
        if (i3 % 2 == 0) {
            return file;
        }
        throw null;
    }

    public final String b(IncodeWelcomeRepository incodeWelcomeRepository) {
        int i2 = 2 % 2;
        int i3 = f10691m + 27;
        f10689k = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
            return e(incodeWelcomeRepository) + RemoteSettings.FORWARD_SLASH_STRING + this.f10695f + ".mp4";
        }
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        int i4 = 68 / 0;
        return e(incodeWelcomeRepository) + RemoteSettings.FORWARD_SLASH_STRING + this.f10695f + ".mp4";
    }

    public final Boolean c(IncodeWelcomeRepository incodeWelcomeRepository) {
        int i2 = 2 % 2;
        int i3 = f10691m + 11;
        f10689k = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        File fileD = d(incodeWelcomeRepository);
        if (!fileD.exists()) {
            fileD = null;
        }
        if (fileD == null) {
            return null;
        }
        int i5 = f10691m + 121;
        f10689k = i5 % 128;
        int i6 = i5 % 2;
        return Boolean.valueOf(fileD.delete());
    }

    private final File i(IncodeWelcomeRepository incodeWelcomeRepository) throws Throwable {
        int i2 = 2 % 2;
        if (this == f10681a) {
            int i3 = f10689k + 25;
            f10691m = i3 % 128;
            int i4 = i3 % 2;
            File videoRecordingsDirectory = incodeWelcomeRepository.getVideoRecordingsDirectory();
            Intrinsics.checkNotNull(videoRecordingsDirectory);
            int i5 = f10691m + 51;
            f10689k = i5 % 128;
            if (i5 % 2 != 0) {
                return videoRecordingsDirectory;
            }
            throw null;
        }
        File screenRecordingsDirectory = incodeWelcomeRepository.getScreenRecordingsDirectory();
        Intrinsics.checkNotNull(screenRecordingsDirectory);
        return screenRecordingsDirectory;
    }

    public final String e(IncodeWelcomeRepository incodeWelcomeRepository) {
        int i2 = 2 % 2;
        int i3 = f10689k + 71;
        f10691m = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        String path = i(incodeWelcomeRepository).getPath();
        Intrinsics.checkNotNullExpressionValue(path, "");
        int i5 = f10689k + 9;
        f10691m = i5 % 128;
        if (i5 % 2 == 0) {
            return path;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void a(IncodeWelcomeRepository incodeWelcomeRepository) {
        int i2 = 2 % 2;
        int i3 = f10691m + 27;
        f10689k = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        File fileD = d(incodeWelcomeRepository);
        an anVar = an.f6429c;
        Timber.Forest.d("Metadata for " + this.f10695f + ":\n- Duration: " + an.c(fileD) + " ms\n- File Size: " + (fileD.length() / 1024) + " KB", new Object[0]);
        int i5 = f10691m + 55;
        f10689k = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f10697b = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f10698d = 0;

        private b() {
        }

        @JvmStatic
        public static Event e(g gVar) {
            int i2 = 2 % 2;
            int i3 = f10697b + 11;
            f10698d = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(gVar, "");
                int i4 = a.f10700b[gVar.ordinal()];
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(gVar, "");
            int i5 = a.f10700b[gVar.ordinal()];
            if (i5 == 1) {
                return Event.START_FRONT_ID_SCAN_SCREEN_RECORDING;
            }
            if (i5 != 2) {
                if (i5 == 3 || i5 == 4) {
                    return Event.START_SELFIE_SCAN_SCREEN_RECORDING;
                }
                throw new NoWhenBranchMatchedException();
            }
            Event event = Event.START_BACK_ID_SCAN_SCREEN_RECORDING;
            int i6 = f10698d + 21;
            f10697b = i6 % 128;
            if (i6 % 2 != 0) {
                return event;
            }
            obj.hashCode();
            throw null;
        }

        public static Event c(g gVar) {
            int i2 = 2 % 2;
            int i3 = f10697b + 37;
            f10698d = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(gVar, "");
                int i4 = a.f10700b[gVar.ordinal()];
                throw null;
            }
            Intrinsics.checkNotNullParameter(gVar, "");
            int i5 = a.f10700b[gVar.ordinal()];
            if (i5 == 1) {
                return Event.FRONT_ID_SCAN_SCREEN_RECORD_VIDEO_LINK_GENERATED;
            }
            if (i5 == 2) {
                return Event.BACK_ID_SCAN_SCREEN_RECORD_VIDEO_LINK_GENERATED;
            }
            if (i5 != 3 && i5 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            Event event = Event.SELFIE_SCAN_SCREEN_RECORD_VIDEO_LINK_GENERATED;
            int i6 = f10697b + 17;
            f10698d = i6 % 128;
            if (i6 % 2 == 0) {
                return event;
            }
            obj.hashCode();
            throw null;
        }

        public static Event d(g gVar) {
            int i2 = 2 % 2;
            int i3 = f10697b + 37;
            f10698d = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(gVar, "");
            int i5 = a.f10700b[gVar.ordinal()];
            if (i5 == 1) {
                Event event = Event.FRONT_ID_SCAN_SCREEN_RECORD_VIDEO_UPLOADED;
                int i6 = f10697b + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f10698d = i6 % 128;
                int i7 = i6 % 2;
                return event;
            }
            if (i5 == 2) {
                return Event.BACK_ID_SCAN_SCREEN_RECORD_VIDEO_UPLOADED;
            }
            if (i5 != 3 && i5 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            Event event2 = Event.SELFIE_SCAN_SCREEN_RECORD_VIDEO_UPLOADED;
            int i8 = f10698d + 49;
            f10697b = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 81 / 0;
            }
            return event2;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x001e A[PHI: r2
  0x001e: PHI (r2v2 java.io.File) = (r2v0 java.io.File), (r2v5 java.io.File) binds: [B:30:0x007a, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void a(com.incode.welcome_sdk.data.IncodeWelcomeRepository r5) {
            /*
                r4 = 2
                int r0 = r4 % r4
                int r0 = com.incode.welcome_sdk.modules.g.b.f10698d
                int r1 = r0 + 87
                int r0 = r1 % 128
                com.incode.welcome_sdk.modules.g.b.f10697b = r0
                int r1 = r1 % r4
                java.lang.String r0 = ""
                r3 = 0
                if (r1 != 0) goto L73
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.io.File r2 = r5.getScreenRecordingsDirectory()
                r0 = 61
                int r0 = r0 / 0
                if (r2 == 0) goto L7d
            L1e:
                int r0 = com.incode.welcome_sdk.modules.g.b.f10698d
                int r1 = r0 + 19
                int r0 = r1 % 128
                com.incode.welcome_sdk.modules.g.b.f10697b = r0
                int r1 = r1 % r4
                if (r1 == 0) goto L8b
                boolean r0 = r2.exists()
                if (r0 == 0) goto L71
                int r0 = com.incode.welcome_sdk.modules.g.b.f10697b
                int r1 = r0 + 7
                int r0 = r1 % 128
                com.incode.welcome_sdk.modules.g.b.f10698d = r0
                int r1 = r1 % r4
            L38:
                if (r2 == 0) goto L7d
                int r0 = com.incode.welcome_sdk.modules.g.b.f10697b
                int r1 = r0 + 1
                int r0 = r1 % 128
                com.incode.welcome_sdk.modules.g.b.f10698d = r0
                int r1 = r1 % r4
                if (r1 != 0) goto L87
                kotlin.io.FilesKt.deleteRecursively(r2)
            L48:
                java.io.File r2 = r5.getVideoRecordingsDirectory()
                if (r2 == 0) goto L69
                int r0 = com.incode.welcome_sdk.modules.g.b.f10697b
                int r1 = r0 + 55
                int r0 = r1 % 128
                com.incode.welcome_sdk.modules.g.b.f10698d = r0
                int r1 = r1 % r4
                if (r1 == 0) goto L6a
                boolean r1 = r2.exists()
                r0 = 34
                int r0 = r0 / 0
                if (r1 == 0) goto L64
            L63:
                r3 = r2
            L64:
                if (r3 == 0) goto L69
                kotlin.io.FilesKt.deleteRecursively(r3)
            L69:
                return
            L6a:
                boolean r0 = r2.exists()
                if (r0 == 0) goto L64
                goto L63
            L71:
                r2 = r3
                goto L38
            L73:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.io.File r2 = r5.getScreenRecordingsDirectory()
                if (r2 == 0) goto L7d
                goto L1e
            L7d:
                int r0 = com.incode.welcome_sdk.modules.g.b.f10698d
                int r1 = r0 + 5
                int r0 = r1 % 128
                com.incode.welcome_sdk.modules.g.b.f10697b = r0
                int r1 = r1 % r4
                goto L48
            L87:
                kotlin.io.FilesKt.deleteRecursively(r2)
                throw r3
            L8b:
                r2.exists()
                r3.hashCode()
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.modules.g.b.a(com.incode.welcome_sdk.data.IncodeWelcomeRepository):void");
        }

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f10699a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f10700b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f10701d = 1;

            static {
                int[] iArr = new int[g.values().length];
                try {
                    iArr[g.f10684d.ordinal()] = 1;
                    int i2 = 2 % 2;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[g.f10682b.ordinal()] = 2;
                    int i3 = f10701d + 109;
                    f10699a = i3 % 128;
                    int i4 = i3 % 2;
                    int i5 = 2 % 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[g.f10685e.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[g.f10681a.ordinal()] = 4;
                    int i6 = f10699a + 11;
                    f10701d = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 2 % 2;
                    }
                } catch (NoSuchFieldError unused4) {
                }
                f10700b = iArr;
            }
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    private static void p(String str, String str2, int[] iArr, int i2, Object[] objArr) throws Throwable {
        String str3 = str;
        String str4 = str2;
        int i3 = 2 % 2;
        Object obj = str4;
        if (str4 != null) {
            int i4 = $10 + 81;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            char[] charArray = str4.toCharArray();
            int i6 = $10 + 3;
            $11 = i6 % 128;
            obj = charArray;
            if (i6 % 2 == 0) {
                int i7 = 5 % 3;
                obj = charArray;
            }
        }
        char[] cArr = (char[]) obj;
        int i8 = 0;
        Object bytes = str3;
        if (str3 != null) {
            int i9 = $11 + 17;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 6 / 0;
                bytes = str3.getBytes("ISO-8859-1");
            } else {
                bytes = str3.getBytes("ISO-8859-1");
            }
        }
        byte[] bArr = (byte[]) bytes;
        com.c.a.i iVar = new com.c.a.i();
        char[] cArr2 = f10687i;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i11 = 0;
            while (i11 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i11])};
                    Object objC = com.c.a.e.e.c(936178174);
                    if (objC == null) {
                        byte b2 = (byte) i8;
                        byte b3 = b2;
                        objC = com.c.a.e.e.e((char) Color.alpha(i8), 20 - View.MeasureSpec.makeMeasureSpec(i8, i8), 846 - (ViewConfiguration.getTapTimeout() >> 16), 928445319, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i11] = ((Character) ((Method) objC).invoke(null, objArr2)).charValue();
                    i11++;
                    i8 = 0;
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
        Object[] objArr3 = {Integer.valueOf(f10686g)};
        Object objC2 = com.c.a.e.e.c(-1774242729);
        if (objC2 == null) {
            objC2 = com.c.a.e.e.e((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 35038), 17 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 1361 - TextUtils.indexOf((CharSequence) "", '0', 0), -1767557586, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objC2).invoke(null, objArr3)).intValue();
        int i12 = 49813;
        if (!f10693o) {
            if (!f10690l) {
                iVar.f2754b = iArr.length;
                char[] cArr4 = new char[iVar.f2754b];
                iVar.f2755c = 0;
                while (iVar.f2755c < iVar.f2754b) {
                    cArr4[iVar.f2755c] = (char) (cArr2[iArr[(iVar.f2754b - 1) - iVar.f2755c] - i2] - iIntValue);
                    iVar.f2755c++;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            iVar.f2754b = cArr.length;
            char[] cArr5 = new char[iVar.f2754b];
            iVar.f2755c = 0;
            while (iVar.f2755c < iVar.f2754b) {
                cArr5[iVar.f2755c] = (char) (cArr2[cArr[(iVar.f2754b - 1) - iVar.f2755c] - i2] - iIntValue);
                Object[] objArr4 = {iVar, iVar};
                Object objC3 = com.c.a.e.e.c(-1471606930);
                if (objC3 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 1);
                    objC3 = com.c.a.e.e.e((char) (49813 - (Process.myTid() >> 22)), 20 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1343 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -1462563561, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objC3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        iVar.f2754b = bArr.length;
        char[] cArr6 = new char[iVar.f2754b];
        iVar.f2755c = 0;
        while (iVar.f2755c < iVar.f2754b) {
            int i13 = $11 + 3;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                cArr6[iVar.f2755c] = (char) (cArr2[bArr[(iVar.f2754b - 1) >> iVar.f2755c] << i2] + iIntValue);
                Object[] objArr5 = {iVar, iVar};
                Object objC4 = com.c.a.e.e.c(-1471606930);
                if (objC4 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 1);
                    objC4 = com.c.a.e.e.e((char) (((Process.getThreadPriority(0) + 20) >> 6) + i12), 20 - View.MeasureSpec.getMode(0), 1342 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -1462563561, false, $$c(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objC4).invoke(null, objArr5);
            } else {
                cArr6[iVar.f2755c] = (char) (cArr2[bArr[(iVar.f2754b - 1) - iVar.f2755c] + i2] - iIntValue);
                Object[] objArr6 = {iVar, iVar};
                Object objC5 = com.c.a.e.e.c(-1471606930);
                if (objC5 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = (byte) (b8 + 1);
                    objC5 = com.c.a.e.e.e((char) (49814 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 20 - TextUtils.getTrimmedLength(""), 1342 - Color.argb(0, 0, 0, 0), -1462563561, false, $$c(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objC5).invoke(null, objArr6);
            }
            i12 = 49813;
        }
        objArr[0] = new String(cArr6);
    }

    static void c() {
        f10687i = new char[]{64460, 64442, 64453, 64443, 64454};
        f10686g = -1867973807;
        f10690l = true;
        f10693o = true;
    }

    private static final /* synthetic */ g[] b() {
        int i2 = 2 % 2;
        int i3 = f10691m;
        int i4 = i3 + 91;
        f10689k = i4 % 128;
        int i5 = i4 % 2;
        g[] gVarArr = {f10684d, f10682b, f10685e, f10681a};
        int i6 = i3 + 71;
        f10689k = i6 % 128;
        int i7 = i6 % 2;
        return gVarArr;
    }

    public static g valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f10691m + 75;
        f10689k = i3 % 128;
        int i4 = i3 % 2;
        g gVar = (g) Enum.valueOf(g.class, str);
        if (i4 != 0) {
            return gVar;
        }
        throw null;
    }

    public static g[] values() {
        g[] gVarArr;
        int i2 = 2 % 2;
        int i3 = f10689k + 51;
        f10691m = i3 % 128;
        if (i3 % 2 != 0) {
            gVarArr = (g[]) f10688j.clone();
            int i4 = 8 / 0;
        } else {
            gVarArr = (g[]) f10688j.clone();
        }
        int i5 = f10689k + 45;
        f10691m = i5 % 128;
        int i6 = i5 % 2;
        return gVarArr;
    }
}
