package o.dd;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.os.UserHandle;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imageutils.JfifUtil;
import com.google.common.base.Ascii;
import fr.antelop.exposed.AntelopLifecycleService;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import o.a.k;
import o.a.n;
import o.a.q;
import o.dd.b;
import o.ea.f;
import org.msgpack.core.MessagePack;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1626yg;
import yg.C1633zX;
import yg.CX;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes6.dex */
public final class d {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f22841a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f22842b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f22843c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f22844d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f22845e = 0;

    public static class c extends Service implements b.c {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static final int $$f = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static long f22846a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static long f22847b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f22848c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f22849d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static int f22850e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f22851f = 0;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:5:0x0016). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$g(byte r10, short r11, byte r12) {
            /*
                byte[] r9 = o.dd.d.c.$$c
                int r8 = 114 - r11
                int r0 = r10 * 2
                int r7 = 3 - r0
                int r1 = r12 * 2
                int r0 = 1 - r1
                byte[] r6 = new byte[r0]
                r5 = 0
                int r4 = 0 - r1
                if (r9 != 0) goto L2e
                r0 = r8
                r3 = r5
                r2 = r7
            L16:
                int r0 = -r0
                int r7 = r7 + r0
                r1 = r3
                r8 = r7
                r7 = r2
            L1b:
                byte r0 = (byte) r8
                r6[r1] = r0
                int r3 = r1 + 1
                if (r1 != r4) goto L28
                java.lang.String r0 = new java.lang.String
                r0.<init>(r6, r5)
                return r0
            L28:
                int r2 = r7 + 1
                r0 = r9[r2]
                r7 = r8
                goto L16
            L2e:
                r1 = r5
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: o.dd.d.c.$$g(byte, short, byte):java.lang.String");
        }

        static {
            init$2();
            $10 = 0;
            $11 = 1;
            init$1();
            f22851f = -1113655905;
            f22850e = 2036192770;
            init$0();
            f22848c = 0;
            f22849d = 1;
            f22846a = 3594824669561383334L;
            f22847b = 1150627162889530739L;
        }

        private static void g(String str, int i2, Object[] objArr) throws Throwable {
            String str2 = str;
            int i3 = 2 % 2;
            int i4 = $11 + 3;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            Object obj = str2;
            if (str2 != null) {
                char[] charArray = str2.toCharArray();
                int i6 = $10 + 31;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                obj = charArray;
            }
            char[] cArr = (char[]) obj;
            q qVar = new q();
            qVar.f19949d = i2;
            int length = cArr.length;
            long[] jArr = new long[length];
            qVar.f19948a = 0;
            while (qVar.f19948a < cArr.length) {
                int i8 = qVar.f19948a;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                    Object objA = o.d.d.a(-1011865131);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        objA = o.d.d.a(730 - TextUtils.lastIndexOf("", '0', 0), (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 7932), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 12, 355847088, false, $$g(b2, (byte) ((-1) - (((-1) - b2) & ((-1) - 43))), b2), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i8] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() ^ (f22847b ^ 4743694005979712847L);
                    Object[] objArr3 = {qVar, qVar};
                    Object objA2 = o.d.d.a(1452497747);
                    if (objA2 == null) {
                        byte b3 = (byte) 0;
                        objA2 = o.d.d.a((ViewConfiguration.getJumpTapTimeout() >> 16) + 836, (char) (27279 - View.resolveSizeAndState(0, 0, 0)), 11 - (ViewConfiguration.getFadingEdgeLength() >> 16), -2145994442, false, $$g(b3, (byte) ((b3 + 36) - (36 & b3)), b3), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA2).invoke(null, objArr3);
                    int i9 = $10 + 15;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr2 = new char[length];
            qVar.f19948a = 0;
            while (qVar.f19948a < cArr.length) {
                cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
                Object[] objArr4 = {qVar, qVar};
                Object objA3 = o.d.d.a(1452497747);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    objA3 = o.d.d.a(837 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (View.combineMeasuredStates(0, 0) + 27279), Color.alpha(0) + 11, -2145994442, false, $$g(b4, (byte) ((b4 + 36) - (36 & b4)), b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr2);
        }

        private static void h(String str, int i2, Object[] objArr) throws Throwable {
            String str2 = str;
            int i3 = 2 % 2;
            int i4 = $10 + 89;
            int i5 = i4 % 128;
            $11 = i5;
            int i6 = i4 % 2;
            Object obj = null;
            Object charArray = str2;
            if (str2 != null) {
                int i7 = i5 + 75;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    str2.toCharArray();
                    obj.hashCode();
                    throw null;
                }
                charArray = str2.toCharArray();
            }
            k kVar = new k();
            char[] cArrC = k.c(f22846a ^ (-5882309809461882246L), (char[]) charArray, i2);
            kVar.f19939c = 4;
            while (kVar.f19939c < cArrC.length) {
                kVar.f19938a = kVar.f19939c - 4;
                int i8 = kVar.f19939c;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f22846a)};
                    Object objA = o.d.d.a(-1093976004);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        objA = o.d.d.a(KeyEvent.getDeadChar(0, 0) + 229, (char) (TextUtils.lastIndexOf("", '0', 0) + 51005), 9 - TextUtils.indexOf("", "", 0), 1749983833, false, $$g(b2, (byte) ((-1) - (((-1) - b2) & ((-1) - 7))), b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrC[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {kVar, kVar};
                    Object objA2 = o.d.d.a(-912105096);
                    if (objA2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objA2 = o.d.d.a((ViewConfiguration.getKeyRepeatDelay() >> 16) + 675, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), ExpandableListView.getPackedPositionGroup(0L) + 12, 522683165, false, $$g(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA2).invoke(null, objArr3);
                    int i9 = $10 + 19;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArrC, 4, cArrC.length - 4);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0016). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void i(byte r8, short r9, int r10, java.lang.Object[] r11) {
            /*
                byte[] r7 = o.dd.d.c.$$a
                int r2 = r8 * 2
                int r1 = 1 - r2
                int r0 = r10 * 2
                int r6 = 3 - r0
                int r0 = 106 - r9
                byte[] r5 = new byte[r1]
                r4 = 0
                int r3 = 0 - r2
                if (r7 != 0) goto L2c
                r0 = r3
                r1 = r6
                r2 = r4
            L16:
                int r0 = -r0
                int r6 = r6 + r0
            L18:
                byte r0 = (byte) r6
                r5[r2] = r0
                int r1 = r1 + 1
                if (r2 != r3) goto L27
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                r11[r4] = r0
                return
            L27:
                r0 = r7[r1]
                int r2 = r2 + 1
                goto L16
            L2c:
                r2 = r4
                r1 = r6
                r6 = r0
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: o.dd.d.c.i(byte, short, int, java.lang.Object[]):void");
        }

        static void init$0() {
            $$a = new byte[]{124, 69, -84, MessagePack.Code.STR8};
            $$b = JfifUtil.MARKER_SOI;
        }

        static void init$1() {
            $$d = new byte[]{37, -107, Ascii.NAK, -25, 59, MessagePack.Code.EXT8, -6, 45, MessagePack.Code.BIN32, 56, -19};
            $$e = 100;
        }

        static void init$2() {
            $$c = new byte[]{Ascii.FF, 10, -28, MessagePack.Code.NEGFIXINT_PREFIX};
            $$f = JfifUtil.MARKER_RST7;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:5:0x0015). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void j(int r8, int r9, short r10, java.lang.Object[] r11) {
            /*
                int r0 = r8 * 7
                int r8 = 8 - r0
                int r0 = r10 * 2
                int r7 = 111 - r0
                byte[] r6 = o.dd.d.c.$$d
                int r0 = r9 * 7
                int r0 = 11 - r0
                byte[] r5 = new byte[r8]
                r4 = 0
                if (r6 != 0) goto L2f
                r3 = r4
                r2 = r0
            L15:
                int r1 = -r0
                int r0 = r2 + 1
                int r7 = r7 + r1
                int r7 = r7 + (-6)
            L1b:
                byte r1 = (byte) r7
                r5[r3] = r1
                int r3 = r3 + 1
                if (r3 != r8) goto L2a
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                r11[r4] = r0
                return
            L2a:
                r1 = r6[r0]
                r2 = r0
                r0 = r1
                goto L15
            L2f:
                r3 = r4
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: o.dd.d.c.j(int, int, short, java.lang.Object[]):void");
        }

        @Override // android.app.Service, android.content.ContextWrapper
        public void attachBaseContext(Context context) {
            int i2 = 2 % 2;
            int i3 = f22849d + 73;
            f22848c = i3 % 128;
            int i4 = i3 % 2;
            super.attachBaseContext(context);
            int i5 = f22849d + 67;
            f22848c = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final boolean bindService(Intent intent, ServiceConnection serviceConnection, int i2) {
            int i3 = 2 % 2;
            int i4 = f22849d + 57;
            f22848c = i4 % 128;
            int i5 = i4 % 2;
            boolean zBindService = super.bindService(intent, serviceConnection, i2);
            int i6 = f22849d + 3;
            f22848c = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 38 / 0;
            }
            return zBindService;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final int checkCallingOrSelfPermission(String str) {
            int i2 = 2 % 2;
            int i3 = f22848c + 59;
            f22849d = i3 % 128;
            int i4 = i3 % 2;
            int iCheckCallingOrSelfPermission = super.checkCallingOrSelfPermission(str);
            int i5 = f22848c + 109;
            f22849d = i5 % 128;
            int i6 = i5 % 2;
            return iCheckCallingOrSelfPermission;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final int checkCallingOrSelfUriPermission(Uri uri, int i2) {
            int i3 = 2 % 2;
            int i4 = f22848c + 61;
            f22849d = i4 % 128;
            int i5 = i4 % 2;
            int iCheckCallingOrSelfUriPermission = super.checkCallingOrSelfUriPermission(uri, i2);
            if (i5 == 0) {
                int i6 = 27 / 0;
            }
            int i7 = f22849d + 37;
            f22848c = i7 % 128;
            int i8 = i7 % 2;
            return iCheckCallingOrSelfUriPermission;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final int checkCallingPermission(String str) {
            int i2 = 2 % 2;
            int i3 = f22848c + 41;
            f22849d = i3 % 128;
            int i4 = i3 % 2;
            int iCheckCallingPermission = super.checkCallingPermission(str);
            int i5 = f22848c + 117;
            f22849d = i5 % 128;
            int i6 = i5 % 2;
            return iCheckCallingPermission;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final int checkCallingUriPermission(Uri uri, int i2) {
            int i3 = 2 % 2;
            int i4 = f22849d + 23;
            f22848c = i4 % 128;
            int i5 = i4 % 2;
            int iCheckCallingUriPermission = super.checkCallingUriPermission(uri, i2);
            if (i5 != 0) {
                int i6 = 24 / 0;
            }
            return iCheckCallingUriPermission;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final int checkPermission(String str, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = f22849d + 61;
            f22848c = i5 % 128;
            int i6 = i5 % 2;
            int iCheckPermission = super.checkPermission(str, i2, i3);
            int i7 = f22848c + 55;
            f22849d = i7 % 128;
            int i8 = i7 % 2;
            return iCheckPermission;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final int checkSelfPermission(String str) {
            int i2 = 2 % 2;
            int i3 = f22848c + 31;
            f22849d = i3 % 128;
            int i4 = i3 % 2;
            int iCheckSelfPermission = super.checkSelfPermission(str);
            int i5 = f22849d + 23;
            f22848c = i5 % 128;
            if (i5 % 2 == 0) {
                return iCheckSelfPermission;
            }
            throw null;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final int checkUriPermission(Uri uri, int i2, int i3, int i4) {
            int i5 = 2 % 2;
            int i6 = f22848c + 91;
            f22849d = i6 % 128;
            int i7 = i6 % 2;
            int iCheckUriPermission = super.checkUriPermission(uri, i2, i3, i4);
            int i8 = f22849d + 105;
            f22848c = i8 % 128;
            int i9 = i8 % 2;
            return iCheckUriPermission;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final int checkUriPermission(Uri uri, String str, String str2, int i2, int i3, int i4) {
            int i5 = 2 % 2;
            int i6 = f22849d + 55;
            f22848c = i6 % 128;
            if (i6 % 2 == 0) {
                return super.checkUriPermission(uri, str, str2, i2, i3, i4);
            }
            super.checkUriPermission(uri, str, str2, i2, i3, i4);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final void clearWallpaper() throws IOException {
            int i2 = 2 % 2;
            int i3 = f22848c + 79;
            f22849d = i3 % 128;
            int i4 = i3 % 2;
            super.clearWallpaper();
            int i5 = f22848c + 19;
            f22849d = i5 % 128;
            int i6 = i5 % 2;
        }

        protected final Object clone() throws CloneNotSupportedException {
            int i2 = 2 % 2;
            throw new CloneNotSupportedException();
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final Context createConfigurationContext(Configuration configuration) {
            int i2 = 2 % 2;
            int i3 = f22849d + 63;
            f22848c = i3 % 128;
            int i4 = i3 % 2;
            Context contextCreateConfigurationContext = super.createConfigurationContext(configuration);
            int i5 = f22848c + 77;
            f22849d = i5 % 128;
            int i6 = i5 % 2;
            return contextCreateConfigurationContext;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final Context createContextForSplit(String str) throws PackageManager.NameNotFoundException {
            int i2 = 2 % 2;
            int i3 = f22849d + 115;
            f22848c = i3 % 128;
            int i4 = i3 % 2;
            Context contextCreateContextForSplit = super.createContextForSplit(str);
            int i5 = f22848c + 63;
            f22849d = i5 % 128;
            int i6 = i5 % 2;
            return contextCreateContextForSplit;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final Context createDeviceProtectedStorageContext() {
            int i2 = 2 % 2;
            int i3 = f22848c + 107;
            f22849d = i3 % 128;
            int i4 = i3 % 2;
            Context contextCreateDeviceProtectedStorageContext = super.createDeviceProtectedStorageContext();
            if (i4 == 0) {
                int i5 = 25 / 0;
            }
            return contextCreateDeviceProtectedStorageContext;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final Context createDisplayContext(Display display) {
            int i2 = 2 % 2;
            int i3 = f22848c + 77;
            f22849d = i3 % 128;
            if (i3 % 2 == 0) {
                super.createDisplayContext(display);
                throw null;
            }
            Context contextCreateDisplayContext = super.createDisplayContext(display);
            int i4 = f22849d + 95;
            f22848c = i4 % 128;
            if (i4 % 2 == 0) {
                return contextCreateDisplayContext;
            }
            throw null;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final Context createPackageContext(String str, int i2) throws PackageManager.NameNotFoundException {
            int i3 = 2 % 2;
            int i4 = f22849d + 69;
            f22848c = i4 % 128;
            int i5 = i4 % 2;
            Context contextCreatePackageContext = super.createPackageContext(str, i2);
            if (i5 != 0) {
                int i6 = 60 / 0;
            }
            return contextCreatePackageContext;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final String[] databaseList() {
            int i2 = 2 % 2;
            int i3 = f22848c + 109;
            f22849d = i3 % 128;
            int i4 = i3 % 2;
            String[] strArrDatabaseList = super.databaseList();
            int i5 = f22849d + 31;
            f22848c = i5 % 128;
            int i6 = i5 % 2;
            return strArrDatabaseList;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final boolean deleteDatabase(String str) {
            int i2 = 2 % 2;
            int i3 = f22848c + 17;
            f22849d = i3 % 128;
            int i4 = i3 % 2;
            boolean zDeleteDatabase = super.deleteDatabase(str);
            if (i4 == 0) {
                int i5 = 79 / 0;
            }
            return zDeleteDatabase;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final boolean deleteFile(String str) {
            int i2 = 2 % 2;
            int i3 = f22848c + 51;
            f22849d = i3 % 128;
            if (i3 % 2 == 0) {
                super.deleteFile(str);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            boolean zDeleteFile = super.deleteFile(str);
            int i4 = f22848c + 1;
            f22849d = i4 % 128;
            int i5 = i4 % 2;
            return zDeleteFile;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final boolean deleteSharedPreferences(String str) {
            int i2 = 2 % 2;
            int i3 = f22849d + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f22848c = i3 % 128;
            if (i3 % 2 != 0) {
                super.deleteSharedPreferences(str);
                throw null;
            }
            boolean zDeleteSharedPreferences = super.deleteSharedPreferences(str);
            int i4 = f22848c + 69;
            f22849d = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 95 / 0;
            }
            return zDeleteSharedPreferences;
        }

        @Override // android.app.Service
        protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            int i2 = 2 % 2;
            int i3 = f22848c + 25;
            f22849d = i3 % 128;
            if (i3 % 2 == 0) {
                super.dump(fileDescriptor, printWriter, strArr);
                throw null;
            }
            super.dump(fileDescriptor, printWriter, strArr);
            int i4 = f22848c + 109;
            f22849d = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final void enforceCallingOrSelfPermission(String str, String str2) {
            int i2 = 2 % 2;
            int i3 = f22849d + 115;
            f22848c = i3 % 128;
            if (i3 % 2 != 0) {
                super.enforceCallingOrSelfPermission(str, str2);
                int i4 = 99 / 0;
            } else {
                super.enforceCallingOrSelfPermission(str, str2);
            }
            int i5 = f22849d + 51;
            f22848c = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 46 / 0;
            }
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final void enforceCallingOrSelfUriPermission(Uri uri, int i2, String str) {
            int i3 = 2 % 2;
            int i4 = f22848c + 93;
            f22849d = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                super.enforceCallingOrSelfUriPermission(uri, i2, str);
                throw null;
            }
            super.enforceCallingOrSelfUriPermission(uri, i2, str);
            int i5 = f22849d + 73;
            f22848c = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final void enforceCallingPermission(String str, String str2) {
            int i2 = 2 % 2;
            int i3 = f22848c + 33;
            f22849d = i3 % 128;
            if (i3 % 2 != 0) {
                super.enforceCallingPermission(str, str2);
            } else {
                super.enforceCallingPermission(str, str2);
                int i4 = 14 / 0;
            }
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final void enforceCallingUriPermission(Uri uri, int i2, String str) {
            int i3 = 2 % 2;
            int i4 = f22848c + 53;
            f22849d = i4 % 128;
            int i5 = i4 % 2;
            super.enforceCallingUriPermission(uri, i2, str);
            int i6 = f22849d + 5;
            f22848c = i6 % 128;
            if (i6 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final void enforcePermission(String str, int i2, int i3, String str2) {
            int i4 = 2 % 2;
            int i5 = f22848c + 33;
            f22849d = i5 % 128;
            int i6 = i5 % 2;
            super.enforcePermission(str, i2, i3, str2);
            int i7 = f22849d + 53;
            f22848c = i7 % 128;
            int i8 = i7 % 2;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final void enforceUriPermission(Uri uri, int i2, int i3, int i4, String str) {
            int i5 = 2 % 2;
            int i6 = f22849d + 3;
            f22848c = i6 % 128;
            int i7 = i6 % 2;
            super.enforceUriPermission(uri, i2, i3, i4, str);
            int i8 = f22848c + 87;
            f22849d = i8 % 128;
            int i9 = i8 % 2;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final void enforceUriPermission(Uri uri, String str, String str2, int i2, int i3, int i4, String str3) {
            int i5 = 2 % 2;
            int i6 = f22848c + 39;
            f22849d = i6 % 128;
            Object obj = null;
            if (i6 % 2 == 0) {
                super.enforceUriPermission(uri, str, str2, i2, i3, i4, str3);
                obj.hashCode();
                throw null;
            }
            super.enforceUriPermission(uri, str, str2, i2, i3, i4, str3);
            int i7 = f22848c + 19;
            f22849d = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            int i2 = 2 % 2;
            int i3 = f22849d + 13;
            f22848c = i3 % 128;
            int i4 = i3 % 2;
            boolean zEquals = super.equals(obj);
            int i5 = f22849d + 95;
            f22848c = i5 % 128;
            if (i5 % 2 == 0) {
                return zEquals;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final String[] fileList() {
            String[] strArrFileList;
            int i2 = 2 % 2;
            int i3 = f22848c + 47;
            f22849d = i3 % 128;
            if (i3 % 2 == 0) {
                strArrFileList = super.fileList();
                int i4 = 88 / 0;
            } else {
                strArrFileList = super.fileList();
            }
            int i5 = f22849d + 21;
            f22848c = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 7 / 0;
            }
            return strArrFileList;
        }

        protected final void finalize() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f22848c + 123;
            f22849d = i3 % 128;
            int i4 = i3 % 2;
            super.finalize();
            int i5 = f22848c + 113;
            f22849d = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final Context getApplicationContext() {
            Context applicationContext;
            int i2 = 2 % 2;
            int i3 = f22848c + 89;
            f22849d = i3 % 128;
            if (i3 % 2 == 0) {
                applicationContext = super.getApplicationContext();
                int i4 = 3 / 0;
            } else {
                applicationContext = super.getApplicationContext();
            }
            int i5 = f22848c + 57;
            f22849d = i5 % 128;
            int i6 = i5 % 2;
            return applicationContext;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final ApplicationInfo getApplicationInfo() {
            int i2 = 2 % 2;
            int i3 = f22849d + 21;
            f22848c = i3 % 128;
            int i4 = i3 % 2;
            ApplicationInfo applicationInfo = super.getApplicationInfo();
            int i5 = f22849d + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f22848c = i5 % 128;
            if (i5 % 2 == 0) {
                return applicationInfo;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final AssetManager getAssets() {
            int i2 = 2 % 2;
            int i3 = f22849d + 31;
            f22848c = i3 % 128;
            int i4 = i3 % 2;
            AssetManager assets = super.getAssets();
            int i5 = f22849d + 45;
            f22848c = i5 % 128;
            if (i5 % 2 == 0) {
                return assets;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.content.ContextWrapper
        public final Context getBaseContext() {
            int i2 = 2 % 2;
            int i3 = f22848c + 125;
            f22849d = i3 % 128;
            int i4 = i3 % 2;
            Context baseContext = super.getBaseContext();
            if (i4 == 0) {
                int i5 = 51 / 0;
            }
            return baseContext;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final File getCacheDir() {
            int i2 = 2 % 2;
            int i3 = f22849d + 19;
            f22848c = i3 % 128;
            int i4 = i3 % 2;
            File cacheDir = super.getCacheDir();
            int i5 = f22848c + 103;
            f22849d = i5 % 128;
            int i6 = i5 % 2;
            return cacheDir;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final ClassLoader getClassLoader() {
            int i2 = 2 % 2;
            int i3 = f22848c + 77;
            f22849d = i3 % 128;
            int i4 = i3 % 2;
            ClassLoader classLoader = super.getClassLoader();
            int i5 = f22849d + 45;
            f22848c = i5 % 128;
            if (i5 % 2 == 0) {
                return classLoader;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final File getCodeCacheDir() {
            int i2 = 2 % 2;
            int i3 = f22848c + 63;
            f22849d = i3 % 128;
            int i4 = i3 % 2;
            File codeCacheDir = super.getCodeCacheDir();
            int i5 = f22849d + 125;
            f22848c = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 59 / 0;
            }
            return codeCacheDir;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final ContentResolver getContentResolver() {
            int i2 = 2 % 2;
            int i3 = f22849d + 67;
            f22848c = i3 % 128;
            int i4 = i3 % 2;
            ContentResolver contentResolver = super.getContentResolver();
            int i5 = f22848c + 55;
            f22849d = i5 % 128;
            int i6 = i5 % 2;
            return contentResolver;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final File getDataDir() {
            int i2 = 2 % 2;
            int i3 = f22849d + 77;
            f22848c = i3 % 128;
            int i4 = i3 % 2;
            File dataDir = super.getDataDir();
            int i5 = f22849d + 47;
            f22848c = i5 % 128;
            int i6 = i5 % 2;
            return dataDir;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final File getDatabasePath(String str) {
            int i2 = 2 % 2;
            int i3 = f22848c + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f22849d = i3 % 128;
            int i4 = i3 % 2;
            File databasePath = super.getDatabasePath(str);
            int i5 = f22848c + 3;
            f22849d = i5 % 128;
            if (i5 % 2 != 0) {
                return databasePath;
            }
            throw null;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final File getDir(String str, int i2) {
            int i3 = 2 % 2;
            int i4 = f22848c + 27;
            f22849d = i4 % 128;
            int i5 = i4 % 2;
            File dir = super.getDir(str, i2);
            int i6 = f22849d + 63;
            f22848c = i6 % 128;
            int i7 = i6 % 2;
            return dir;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final File getExternalCacheDir() {
            int i2 = 2 % 2;
            int i3 = f22848c + 1;
            f22849d = i3 % 128;
            if (i3 % 2 != 0) {
                return super.getExternalCacheDir();
            }
            super.getExternalCacheDir();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final File[] getExternalCacheDirs() {
            int i2 = 2 % 2;
            int i3 = f22849d + 3;
            f22848c = i3 % 128;
            int i4 = i3 % 2;
            File[] externalCacheDirs = super.getExternalCacheDirs();
            int i5 = f22849d + 63;
            f22848c = i5 % 128;
            int i6 = i5 % 2;
            return externalCacheDirs;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final File getExternalFilesDir(String str) {
            int i2 = 2 % 2;
            int i3 = f22848c + 29;
            f22849d = i3 % 128;
            int i4 = i3 % 2;
            File externalFilesDir = super.getExternalFilesDir(str);
            int i5 = f22849d + 65;
            f22848c = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 20 / 0;
            }
            return externalFilesDir;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final File[] getExternalFilesDirs(String str) {
            int i2 = 2 % 2;
            int i3 = f22849d + 3;
            f22848c = i3 % 128;
            if (i3 % 2 == 0) {
                return super.getExternalFilesDirs(str);
            }
            super.getExternalFilesDirs(str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final File[] getExternalMediaDirs() {
            File[] externalMediaDirs;
            int i2 = 2 % 2;
            int i3 = f22848c + 109;
            f22849d = i3 % 128;
            if (i3 % 2 == 0) {
                externalMediaDirs = super.getExternalMediaDirs();
                int i4 = 78 / 0;
            } else {
                externalMediaDirs = super.getExternalMediaDirs();
            }
            int i5 = f22849d + 9;
            f22848c = i5 % 128;
            int i6 = i5 % 2;
            return externalMediaDirs;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final File getFileStreamPath(String str) {
            int i2 = 2 % 2;
            int i3 = f22848c + 31;
            f22849d = i3 % 128;
            int i4 = i3 % 2;
            File fileStreamPath = super.getFileStreamPath(str);
            if (i4 == 0) {
                int i5 = 8 / 0;
            }
            return fileStreamPath;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final File getFilesDir() {
            int i2 = 2 % 2;
            int i3 = f22848c + 19;
            f22849d = i3 % 128;
            int i4 = i3 % 2;
            File filesDir = super.getFilesDir();
            int i5 = f22849d + 105;
            f22848c = i5 % 128;
            if (i5 % 2 == 0) {
                return filesDir;
            }
            throw null;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final Executor getMainExecutor() {
            int i2 = 2 % 2;
            int i3 = f22848c + 7;
            f22849d = i3 % 128;
            if (i3 % 2 == 0) {
                super.getMainExecutor();
                throw null;
            }
            Executor mainExecutor = super.getMainExecutor();
            int i4 = f22848c + 41;
            f22849d = i4 % 128;
            int i5 = i4 % 2;
            return mainExecutor;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final Looper getMainLooper() {
            int i2 = 2 % 2;
            int i3 = f22849d + 91;
            f22848c = i3 % 128;
            if (i3 % 2 != 0) {
                super.getMainLooper();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Looper mainLooper = super.getMainLooper();
            int i4 = f22849d + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f22848c = i4 % 128;
            int i5 = i4 % 2;
            return mainLooper;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final File getNoBackupFilesDir() {
            int i2 = 2 % 2;
            int i3 = f22848c + 103;
            f22849d = i3 % 128;
            int i4 = i3 % 2;
            File noBackupFilesDir = super.getNoBackupFilesDir();
            int i5 = f22848c + 11;
            f22849d = i5 % 128;
            if (i5 % 2 != 0) {
                return noBackupFilesDir;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final File getObbDir() {
            int i2 = 2 % 2;
            int i3 = f22848c + 117;
            f22849d = i3 % 128;
            if (i3 % 2 != 0) {
                return super.getObbDir();
            }
            super.getObbDir();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final File[] getObbDirs() {
            int i2 = 2 % 2;
            int i3 = f22848c + 95;
            f22849d = i3 % 128;
            if (i3 % 2 == 0) {
                super.getObbDirs();
                throw null;
            }
            File[] obbDirs = super.getObbDirs();
            int i4 = f22848c + 35;
            f22849d = i4 % 128;
            int i5 = i4 % 2;
            return obbDirs;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final String getPackageCodePath() {
            int i2 = 2 % 2;
            int i3 = f22849d + 53;
            f22848c = i3 % 128;
            int i4 = i3 % 2;
            String packageCodePath = super.getPackageCodePath();
            if (i4 != 0) {
                int i5 = 50 / 0;
            }
            return packageCodePath;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final PackageManager getPackageManager() {
            int i2 = 2 % 2;
            int i3 = f22848c + 1;
            f22849d = i3 % 128;
            int i4 = i3 % 2;
            PackageManager packageManager = super.getPackageManager();
            int i5 = f22848c + 45;
            f22849d = i5 % 128;
            int i6 = i5 % 2;
            return packageManager;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final String getPackageName() {
            int i2 = 2 % 2;
            int i3 = f22849d + 23;
            f22848c = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                super.getPackageName();
                throw null;
            }
            String packageName = super.getPackageName();
            int i4 = f22849d + 125;
            f22848c = i4 % 128;
            if (i4 % 2 == 0) {
                return packageName;
            }
            obj.hashCode();
            throw null;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final String getPackageResourcePath() {
            String packageResourcePath;
            int i2 = 2 % 2;
            int i3 = f22848c + 49;
            f22849d = i3 % 128;
            if (i3 % 2 == 0) {
                packageResourcePath = super.getPackageResourcePath();
                int i4 = 53 / 0;
            } else {
                packageResourcePath = super.getPackageResourcePath();
            }
            int i5 = f22848c + 81;
            f22849d = i5 % 128;
            int i6 = i5 % 2;
            return packageResourcePath;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final Resources getResources() {
            int i2 = 2 % 2;
            int i3 = f22849d + 67;
            f22848c = i3 % 128;
            if (i3 % 2 == 0) {
                return super.getResources();
            }
            super.getResources();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final SharedPreferences getSharedPreferences(String str, int i2) {
            int i3 = 2 % 2;
            int i4 = f22849d + 105;
            f22848c = i4 % 128;
            if (i4 % 2 != 0) {
                super.getSharedPreferences(str, i2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            SharedPreferences sharedPreferences = super.getSharedPreferences(str, i2);
            int i5 = f22849d + 115;
            f22848c = i5 % 128;
            int i6 = i5 % 2;
            return sharedPreferences;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final Object getSystemService(String str) {
            int i2 = 2 % 2;
            int i3 = f22849d + 51;
            f22848c = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                super.getSystemService(str);
                obj.hashCode();
                throw null;
            }
            Object systemService = super.getSystemService(str);
            int i4 = f22849d + 61;
            f22848c = i4 % 128;
            if (i4 % 2 == 0) {
                return systemService;
            }
            obj.hashCode();
            throw null;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final String getSystemServiceName(Class<?> cls) {
            int i2 = 2 % 2;
            int i3 = f22848c + 49;
            f22849d = i3 % 128;
            int i4 = i3 % 2;
            String systemServiceName = super.getSystemServiceName(cls);
            int i5 = f22849d + 75;
            f22848c = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 81 / 0;
            }
            return systemServiceName;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final Resources.Theme getTheme() {
            int i2 = 2 % 2;
            int i3 = f22849d + 97;
            f22848c = i3 % 128;
            if (i3 % 2 != 0) {
                super.getTheme();
                throw null;
            }
            Resources.Theme theme = super.getTheme();
            int i4 = f22849d + 113;
            f22848c = i4 % 128;
            int i5 = i4 % 2;
            return theme;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final Drawable getWallpaper() {
            Drawable wallpaper;
            int i2 = 2 % 2;
            int i3 = f22849d + 23;
            f22848c = i3 % 128;
            if (i3 % 2 != 0) {
                wallpaper = super.getWallpaper();
                int i4 = 29 / 0;
            } else {
                wallpaper = super.getWallpaper();
            }
            int i5 = f22848c + 71;
            f22849d = i5 % 128;
            if (i5 % 2 != 0) {
                return wallpaper;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final int getWallpaperDesiredMinimumHeight() {
            int i2 = 2 % 2;
            int i3 = f22849d + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f22848c = i3 % 128;
            if (i3 % 2 == 0) {
                return super.getWallpaperDesiredMinimumHeight();
            }
            super.getWallpaperDesiredMinimumHeight();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final int getWallpaperDesiredMinimumWidth() {
            int i2 = 2 % 2;
            int i3 = f22849d + 89;
            f22848c = i3 % 128;
            int i4 = i3 % 2;
            int wallpaperDesiredMinimumWidth = super.getWallpaperDesiredMinimumWidth();
            int i5 = f22849d + 9;
            f22848c = i5 % 128;
            if (i5 % 2 == 0) {
                return wallpaperDesiredMinimumWidth;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final void grantUriPermission(String str, Uri uri, int i2) {
            int i3 = 2 % 2;
            int i4 = f22849d + 75;
            f22848c = i4 % 128;
            if (i4 % 2 != 0) {
                super.grantUriPermission(str, uri, i2);
                int i5 = 3 / 0;
            } else {
                super.grantUriPermission(str, uri, i2);
            }
            int i6 = f22848c + 41;
            f22849d = i6 % 128;
            if (i6 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public int hashCode() {
            int i2 = 2 % 2;
            int i3 = f22848c + 9;
            f22849d = i3 % 128;
            if (i3 % 2 != 0) {
                return super.hashCode();
            }
            super.hashCode();
            throw null;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final boolean isDeviceProtectedStorage() {
            int i2 = 2 % 2;
            int i3 = f22848c + 59;
            f22849d = i3 % 128;
            if (i3 % 2 == 0) {
                super.isDeviceProtectedStorage();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            boolean zIsDeviceProtectedStorage = super.isDeviceProtectedStorage();
            int i4 = f22849d + 71;
            f22848c = i4 % 128;
            int i5 = i4 % 2;
            return zIsDeviceProtectedStorage;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final boolean isRestricted() {
            int i2 = 2 % 2;
            int i3 = f22848c + 105;
            f22849d = i3 % 128;
            int i4 = i3 % 2;
            boolean zIsRestricted = super.isRestricted();
            int i5 = f22848c + 37;
            f22849d = i5 % 128;
            int i6 = i5 % 2;
            return zIsRestricted;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final boolean moveDatabaseFrom(Context context, String str) {
            int i2 = 2 % 2;
            int i3 = f22849d + 3;
            f22848c = i3 % 128;
            if (i3 % 2 == 0) {
                return super.moveDatabaseFrom(context, str);
            }
            super.moveDatabaseFrom(context, str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final boolean moveSharedPreferencesFrom(Context context, String str) {
            int i2 = 2 % 2;
            int i3 = f22848c + 55;
            f22849d = i3 % 128;
            if (i3 % 2 != 0) {
                return super.moveSharedPreferencesFrom(context, str);
            }
            super.moveSharedPreferencesFrom(context, str);
            throw null;
        }

        @Override // android.app.Service
        public IBinder onBind(Intent intent) {
            int i2 = 2 % 2;
            int i3 = f22849d + 123;
            int i4 = i3 % 128;
            f22848c = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 97;
            f22849d = i6 % 128;
            int i7 = i6 % 2;
            return null;
        }

        @Override // android.app.Service, android.content.ComponentCallbacks
        public final void onConfigurationChanged(Configuration configuration) {
            int i2 = 2 % 2;
            int i3 = f22849d + 33;
            f22848c = i3 % 128;
            int i4 = i3 % 2;
            super.onConfigurationChanged(configuration);
            int i5 = f22848c + 105;
            f22849d = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // android.app.Service
        public void onCreate() {
            int i2 = 2 % 2;
            int i3 = f22848c + 71;
            f22849d = i3 % 128;
            int i4 = i3 % 2;
            super.onCreate();
            int i5 = f22848c + 65;
            f22849d = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.app.Service
        public final void onDestroy() {
            int i2 = 2 % 2;
            int i3 = f22849d + 19;
            f22848c = i3 % 128;
            if (i3 % 2 == 0) {
                super.onDestroy();
            } else {
                super.onDestroy();
                int i4 = 61 / 0;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0100  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0593  */
        @Override // o.dd.b.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onJobEnd(o.bg.c r27, o.dd.b r28, o.by.g r29) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 3783
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.dd.d.c.onJobEnd(o.bg.c, o.dd.b, o.by.g):void");
        }

        @Override // android.app.Service, android.content.ComponentCallbacks
        public final void onLowMemory() {
            int i2 = 2 % 2;
            int i3 = f22848c + 107;
            f22849d = i3 % 128;
            int i4 = i3 % 2;
            super.onLowMemory();
            int i5 = f22848c + 45;
            f22849d = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        @Override // android.app.Service
        public final void onRebind(Intent intent) {
            int i2 = 2 % 2;
            int i3 = f22849d + 45;
            f22848c = i3 % 128;
            int i4 = i3 % 2;
            super.onRebind(intent);
            int i5 = f22848c + 69;
            f22849d = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        @Override // android.app.Service
        public final void onStart(Intent intent, int i2) {
            int i3 = 2 % 2;
            int i4 = f22849d + 73;
            f22848c = i4 % 128;
            if (i4 % 2 == 0) {
                super.onStart(intent, i2);
            } else {
                super.onStart(intent, i2);
                int i5 = 13 / 0;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
        
            if (r16.getExtras() != null) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x006e, code lost:
        
            if (o.ea.f.a() == false) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0070, code lost:
        
            r1 = new java.lang.Object[1];
            h("椖辰楹˃旪鈁\u20c2蘇\u124f畝팢ぬ랙⎯䒹ŻꝦ㌗呦ኤ퓶䂝✘戄쑇倐㚌玒\uf5d3慿ت䌶\ue567绯ᆬ겦ዸ蹘\ue155뱚φ", android.text.AndroidCharacter.getMirror('0') - '0', r1);
            o.ea.f.d(r4, ((java.lang.String) r1[0]).intern());
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x008a, code lost:
        
            stopSelf();
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x008d, code lost:
        
            return 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x008e, code lost:
        
            r6 = r16.getExtras();
            r1 = new java.lang.Object[1];
            g("\u205f쩻\uf407黒裫늂嵖䜑焥ᯯ֏ぴ\uda6d쐬\ueedd颜芫굆圦䄸毠ᖂ", 59951 - android.graphics.Color.blue(0), r1);
            r9 = o.az.a.c(r6.getString(((java.lang.String) r1[0]).intern()));
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00b1, code lost:
        
            if (r9 != null) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00b3, code lost:
        
            r1 = o.dd.d.c.f22848c + 49;
            o.dd.d.c.f22849d = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00bc, code lost:
        
            if ((r1 % 2) == 0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00c2, code lost:
        
            if (o.ea.f.a() == true) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00c4, code lost:
        
            stopSelf();
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00c7, code lost:
        
            return 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00c8, code lost:
        
            r1 = new java.lang.Object[1];
            g("⁓㔍\u0ad1恕甡䪕ꁲ뗯誫\ue009\uf5aa쬄\u2068㖬୦惈疯䬘ꂲ뙄謠\ue093\uf677쯁₱㙛௷慜瘫䮌ꅿ뛚讹\ue123\uf6d6쮸ℐ㛢ఆ愫皋䱿ꆊ뚯谇\ue1fa\uf740착", android.view.KeyEvent.getDeadChar(0, 0) + 5471, r1);
            o.ea.f.d(r4, ((java.lang.String) r1[0]).intern());
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00e1, code lost:
        
            o.ea.f.a();
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00e5, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00e6, code lost:
        
            r6 = r16.getExtras();
            r1 = new java.lang.Object[1];
            g("\u205f澍뿫쿔ἳ꽔ｚື底\ueee9㸣丢鹵⹊綑跪\uddcb洰봪쵕Ს겖ﳽద尖", (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 20441, r1);
            r11 = o.dd.g.d(r6.getString(((java.lang.String) r1[0]).intern()));
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0109, code lost:
        
            if (r11 != null) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x010f, code lost:
        
            if (o.ea.f.a() == true) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0111, code lost:
        
            stopSelf();
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0114, code lost:
        
            return 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0115, code lost:
        
            r1 = new java.lang.Object[1];
            g("⁓¿憵䊏ꏩ蓯\ue5c6옍✻ࠋ楞䨾\uab00豹\ueca3춹⺉\u0fe2烯凈닔錨\uf442픝㙫\u177b砎墷릢验ﮝ\udce8㷹ể罦ꀵ脇\ue209쌲⑁՛於䚰ꞗ", 8429 - android.view.View.getDefaultSize(0, 0), r1);
            o.ea.f.d(r4, ((java.lang.String) r1[0]).intern());
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x012e, code lost:
        
            r6 = r16.getExtras();
            r1 = new java.lang.Object[1];
            g("\u205f醇䏿㔦\ue71b奶ાﲝ껅怣퉧葠疽⟸駅䬀㵫\uef5aꂣዱ", (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 45522, r1);
            r10 = r6.getString(((java.lang.String) r1[0]).intern());
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x014f, code lost:
        
            if (r10 != null) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0155, code lost:
        
            if (o.ea.f.a() == false) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0157, code lost:
        
            r1 = new java.lang.Object[1];
            g("⁓嚉췙䓙בּ爉\ue96aᾋ隋෭蒒㭸뉘⥩復횋䶬쓾笞\uf25d楎龤ᚚ趱Ӓ묰㉷ꥋ\udfac", 30427 - android.view.View.resolveSizeAndState(0, 0, 0), r1);
            o.ea.f.d(r4, ((java.lang.String) r1[0]).intern());
            r1 = o.dd.d.c.f22848c + 15;
            o.dd.d.c.f22849d = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0178, code lost:
        
            stopSelf();
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x017b, code lost:
        
            return 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x017c, code lost:
        
            o.dc.d.a().c(r15, r9, r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0187, code lost:
        
            if (o.ea.f.a() == false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0189, code lost:
        
            r1 = new java.lang.Object[1];
            g("⁓瀥肁턭憁눝슂ጷꏫ\uf471Һ唌\ue588㙄䛊隤✾瞯蠋\ud887椗맟쩨\u1ae8ꭣﮃీ峞\ued5a", (android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1)) + 20598, r1);
            o.ea.f.c(r4, ((java.lang.String) r1[0]).intern());
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x01a5, code lost:
        
            new o.dd.b(r15, r15, r9, r10, r11).c();
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x01af, code lost:
        
            return 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0026, code lost:
        
            if (r16 == null) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:
        
            r12 = o.az.a.f20791b;
            r1 = new java.lang.Object[1];
            h("㴦䧚㵔뉣볙䬂\ua7e5툠ꋳ걘吞", (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, r1);
            new o.dd.b(r15, r15, r12, ((java.lang.String) r1[0]).intern(), o.dd.g.f22869n).a();
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x004d, code lost:
        
            return 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0061, code lost:
        
            if (r16 == null) goto L6;
         */
        @Override // android.app.Service
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int onStartCommand(android.content.Intent r16, int r17, int r18) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 432
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.dd.d.c.onStartCommand(android.content.Intent, int, int):int");
        }

        @Override // android.app.Service
        public final void onTaskRemoved(Intent intent) {
            int i2 = 2 % 2;
            int i3 = f22849d + 123;
            f22848c = i3 % 128;
            int i4 = i3 % 2;
            super.onTaskRemoved(intent);
            int i5 = f22849d + 113;
            f22848c = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // android.app.Service, android.content.ComponentCallbacks2
        public final void onTrimMemory(int i2) {
            int i3 = 2 % 2;
            int i4 = f22849d + 29;
            f22848c = i4 % 128;
            if (i4 % 2 != 0) {
                super.onTrimMemory(i2);
                throw null;
            }
            super.onTrimMemory(i2);
            int i5 = f22848c + 31;
            f22849d = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        @Override // android.app.Service
        public final boolean onUnbind(Intent intent) {
            int i2 = 2 % 2;
            int i3 = f22849d + 55;
            f22848c = i3 % 128;
            if (i3 % 2 == 0) {
                return super.onUnbind(intent);
            }
            super.onUnbind(intent);
            throw null;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final FileInputStream openFileInput(String str) throws FileNotFoundException {
            int i2 = 2 % 2;
            int i3 = f22848c + 97;
            f22849d = i3 % 128;
            if (i3 % 2 == 0) {
                super.openFileInput(str);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            FileInputStream fileInputStreamOpenFileInput = super.openFileInput(str);
            int i4 = f22849d + 15;
            f22848c = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 50 / 0;
            }
            return fileInputStreamOpenFileInput;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final FileOutputStream openFileOutput(String str, int i2) throws FileNotFoundException {
            int i3 = 2 % 2;
            int i4 = f22848c + 25;
            f22849d = i4 % 128;
            int i5 = i4 % 2;
            FileOutputStream fileOutputStreamOpenFileOutput = super.openFileOutput(str, i2);
            int i6 = f22849d + 47;
            f22848c = i6 % 128;
            int i7 = i6 % 2;
            return fileOutputStreamOpenFileOutput;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final SQLiteDatabase openOrCreateDatabase(String str, int i2, SQLiteDatabase.CursorFactory cursorFactory) {
            int i3 = 2 % 2;
            int i4 = f22848c + 17;
            f22849d = i4 % 128;
            if (i4 % 2 == 0) {
                super.openOrCreateDatabase(str, i2, cursorFactory);
                throw null;
            }
            SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase = super.openOrCreateDatabase(str, i2, cursorFactory);
            int i5 = f22849d + 123;
            f22848c = i5 % 128;
            int i6 = i5 % 2;
            return sQLiteDatabaseOpenOrCreateDatabase;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final SQLiteDatabase openOrCreateDatabase(String str, int i2, SQLiteDatabase.CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
            int i3 = 2 % 2;
            int i4 = f22849d + 121;
            f22848c = i4 % 128;
            int i5 = i4 % 2;
            SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase = super.openOrCreateDatabase(str, i2, cursorFactory, databaseErrorHandler);
            int i6 = f22848c + 67;
            f22849d = i6 % 128;
            int i7 = i6 % 2;
            return sQLiteDatabaseOpenOrCreateDatabase;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final Drawable peekWallpaper() {
            int i2 = 2 % 2;
            int i3 = f22849d + 117;
            f22848c = i3 % 128;
            int i4 = i3 % 2;
            Drawable drawablePeekWallpaper = super.peekWallpaper();
            int i5 = f22848c + 91;
            f22849d = i5 % 128;
            if (i5 % 2 != 0) {
                return drawablePeekWallpaper;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final void registerComponentCallbacks(ComponentCallbacks componentCallbacks) {
            int i2 = 2 % 2;
            int i3 = f22848c + 69;
            f22849d = i3 % 128;
            if (i3 % 2 == 0) {
                super.registerComponentCallbacks(componentCallbacks);
                int i4 = 28 / 0;
            } else {
                super.registerComponentCallbacks(componentCallbacks);
            }
            int i5 = f22848c + 3;
            f22849d = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            int i2 = 2 % 2;
            int i3 = f22848c + 11;
            f22849d = i3 % 128;
            int i4 = i3 % 2;
            Intent intentRegisterReceiver = super.registerReceiver(broadcastReceiver, intentFilter);
            int i5 = f22849d + 11;
            f22848c = i5 % 128;
            if (i5 % 2 == 0) {
                return intentRegisterReceiver;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i2) {
            int i3 = 2 % 2;
            int i4 = f22848c + 57;
            f22849d = i4 % 128;
            if (i4 % 2 != 0) {
                return super.registerReceiver(broadcastReceiver, intentFilter, i2);
            }
            super.registerReceiver(broadcastReceiver, intentFilter, i2);
            throw null;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler) {
            int i2 = 2 % 2;
            int i3 = f22849d + 41;
            f22848c = i3 % 128;
            int i4 = i3 % 2;
            Intent intentRegisterReceiver = super.registerReceiver(broadcastReceiver, intentFilter, str, handler);
            int i5 = f22849d + 31;
            f22848c = i5 % 128;
            int i6 = i5 % 2;
            return intentRegisterReceiver;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i2) {
            int i3 = 2 % 2;
            int i4 = f22848c + 109;
            f22849d = i4 % 128;
            int i5 = i4 % 2;
            Intent intentRegisterReceiver = super.registerReceiver(broadcastReceiver, intentFilter, str, handler, i2);
            int i6 = f22849d + 59;
            f22848c = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 85 / 0;
            }
            return intentRegisterReceiver;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final void removeStickyBroadcast(Intent intent) {
            int i2 = 2 % 2;
            int i3 = f22849d + 81;
            f22848c = i3 % 128;
            int i4 = i3 % 2;
            super.removeStickyBroadcast(intent);
            int i5 = f22848c + 53;
            f22849d = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final void removeStickyBroadcastAsUser(Intent intent, UserHandle userHandle) {
            int i2 = 2 % 2;
            int i3 = f22849d + 91;
            f22848c = i3 % 128;
            int i4 = i3 % 2;
            super.removeStickyBroadcastAsUser(intent, userHandle);
            int i5 = f22849d + 11;
            f22848c = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final void revokeUriPermission(Uri uri, int i2) {
            int i3 = 2 % 2;
            int i4 = f22849d + 57;
            f22848c = i4 % 128;
            int i5 = i4 % 2;
            super.revokeUriPermission(uri, i2);
            int i6 = f22849d + 7;
            f22848c = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final void revokeUriPermission(String str, Uri uri, int i2) {
            int i3 = 2 % 2;
            int i4 = f22848c + 45;
            f22849d = i4 % 128;
            if (i4 % 2 == 0) {
                super.revokeUriPermission(str, uri, i2);
                int i5 = 9 / 0;
            } else {
                super.revokeUriPermission(str, uri, i2);
            }
            int i6 = f22848c + 67;
            f22849d = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 61 / 0;
            }
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final void sendBroadcast(Intent intent) {
            int i2 = 2 % 2;
            int i3 = f22849d + 35;
            f22848c = i3 % 128;
            int i4 = i3 % 2;
            super.sendBroadcast(intent);
            int i5 = f22848c + 89;
            f22849d = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 59 / 0;
            }
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final void sendBroadcast(Intent intent, String str) {
            int i2 = 2 % 2;
            int i3 = f22849d + 27;
            f22848c = i3 % 128;
            int i4 = i3 % 2;
            super.sendBroadcast(intent, str);
            int i5 = f22849d + 21;
            f22848c = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final void sendBroadcastAsUser(Intent intent, UserHandle userHandle) {
            int i2 = 2 % 2;
            int i3 = f22849d + 107;
            f22848c = i3 % 128;
            int i4 = i3 % 2;
            super.sendBroadcastAsUser(intent, userHandle);
            int i5 = f22848c + 61;
            f22849d = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final void sendBroadcastAsUser(Intent intent, UserHandle userHandle, String str) {
            int i2 = 2 % 2;
            int i3 = f22849d + 123;
            f22848c = i3 % 128;
            if (i3 % 2 == 0) {
                super.sendBroadcastAsUser(intent, userHandle, str);
            } else {
                super.sendBroadcastAsUser(intent, userHandle, str);
                throw null;
            }
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final void sendOrderedBroadcast(Intent intent, String str) {
            int i2 = 2 % 2;
            int i3 = f22849d + 23;
            f22848c = i3 % 128;
            if (i3 % 2 == 0) {
                super.sendOrderedBroadcast(intent, str);
            } else {
                super.sendOrderedBroadcast(intent, str);
                throw null;
            }
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final void sendOrderedBroadcast(Intent intent, String str, BroadcastReceiver broadcastReceiver, Handler handler, int i2, String str2, Bundle bundle) {
            int i3 = 2 % 2;
            int i4 = f22848c + 97;
            f22849d = i4 % 128;
            int i5 = i4 % 2;
            super.sendOrderedBroadcast(intent, str, broadcastReceiver, handler, i2, str2, bundle);
            int i6 = f22849d + 109;
            f22848c = i6 % 128;
            int i7 = i6 % 2;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final void sendOrderedBroadcastAsUser(Intent intent, UserHandle userHandle, String str, BroadcastReceiver broadcastReceiver, Handler handler, int i2, String str2, Bundle bundle) {
            int i3 = 2 % 2;
            int i4 = f22848c + 111;
            f22849d = i4 % 128;
            int i5 = i4 % 2;
            super.sendOrderedBroadcastAsUser(intent, userHandle, str, broadcastReceiver, handler, i2, str2, bundle);
            int i6 = f22849d + 125;
            f22848c = i6 % 128;
            if (i6 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final void sendStickyBroadcast(Intent intent) {
            int i2 = 2 % 2;
            int i3 = f22849d + 37;
            f22848c = i3 % 128;
            if (i3 % 2 == 0) {
                super.sendStickyBroadcast(intent);
            } else {
                super.sendStickyBroadcast(intent);
                int i4 = 43 / 0;
            }
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final void sendStickyBroadcastAsUser(Intent intent, UserHandle userHandle) {
            int i2 = 2 % 2;
            int i3 = f22848c + 31;
            f22849d = i3 % 128;
            if (i3 % 2 != 0) {
                super.sendStickyBroadcastAsUser(intent, userHandle);
                return;
            }
            super.sendStickyBroadcastAsUser(intent, userHandle);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final void sendStickyOrderedBroadcast(Intent intent, BroadcastReceiver broadcastReceiver, Handler handler, int i2, String str, Bundle bundle) {
            int i3 = 2 % 2;
            int i4 = f22848c + 29;
            f22849d = i4 % 128;
            int i5 = i4 % 2;
            super.sendStickyOrderedBroadcast(intent, broadcastReceiver, handler, i2, str, bundle);
            int i6 = f22849d + 111;
            f22848c = i6 % 128;
            int i7 = i6 % 2;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final void sendStickyOrderedBroadcastAsUser(Intent intent, UserHandle userHandle, BroadcastReceiver broadcastReceiver, Handler handler, int i2, String str, Bundle bundle) {
            int i3 = 2 % 2;
            int i4 = f22848c + 47;
            f22849d = i4 % 128;
            if (i4 % 2 != 0) {
                super.sendStickyOrderedBroadcastAsUser(intent, userHandle, broadcastReceiver, handler, i2, str, bundle);
            } else {
                super.sendStickyOrderedBroadcastAsUser(intent, userHandle, broadcastReceiver, handler, i2, str, bundle);
                int i5 = 34 / 0;
            }
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final void setTheme(int i2) {
            int i3 = 2 % 2;
            int i4 = f22849d + 117;
            f22848c = i4 % 128;
            int i5 = i4 % 2;
            super.setTheme(i2);
            int i6 = f22848c + 47;
            f22849d = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 29 / 0;
            }
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final void setWallpaper(Bitmap bitmap) throws IOException {
            int i2 = 2 % 2;
            int i3 = f22849d + 101;
            f22848c = i3 % 128;
            int i4 = i3 % 2;
            super.setWallpaper(bitmap);
            int i5 = f22848c + 37;
            f22849d = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final void setWallpaper(InputStream inputStream) throws IOException {
            int i2 = 2 % 2;
            int i3 = f22849d + 11;
            f22848c = i3 % 128;
            if (i3 % 2 != 0) {
                super.setWallpaper(inputStream);
                throw null;
            }
            super.setWallpaper(inputStream);
            int i4 = f22848c + 91;
            f22849d = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final void startActivities(Intent[] intentArr) {
            int i2 = 2 % 2;
            int i3 = f22849d + 67;
            f22848c = i3 % 128;
            if (i3 % 2 != 0) {
                super.startActivities(intentArr);
                throw null;
            }
            super.startActivities(intentArr);
            int i4 = f22848c + 35;
            f22849d = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final void startActivities(Intent[] intentArr, Bundle bundle) {
            int i2 = 2 % 2;
            int i3 = f22849d + 99;
            f22848c = i3 % 128;
            if (i3 % 2 != 0) {
                super.startActivities(intentArr, bundle);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            super.startActivities(intentArr, bundle);
            int i4 = f22849d + 105;
            f22848c = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final void startActivity(Intent intent) {
            int i2 = 2 % 2;
            int i3 = f22849d + 69;
            f22848c = i3 % 128;
            int i4 = i3 % 2;
            super.startActivity(intent);
            int i5 = f22848c + 121;
            f22849d = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final void startActivity(Intent intent, Bundle bundle) {
            int i2 = 2 % 2;
            int i3 = f22848c + 97;
            f22849d = i3 % 128;
            int i4 = i3 % 2;
            super.startActivity(intent, bundle);
            int i5 = f22849d + 57;
            f22848c = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final ComponentName startForegroundService(Intent intent) {
            int i2 = 2 % 2;
            int i3 = f22848c + 109;
            f22849d = i3 % 128;
            int i4 = i3 % 2;
            ComponentName componentNameStartForegroundService = super.startForegroundService(intent);
            int i5 = f22849d + 77;
            f22848c = i5 % 128;
            int i6 = i5 % 2;
            return componentNameStartForegroundService;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final boolean startInstrumentation(ComponentName componentName, String str, Bundle bundle) {
            int i2 = 2 % 2;
            int i3 = f22849d + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f22848c = i3 % 128;
            if (i3 % 2 != 0) {
                super.startInstrumentation(componentName, str, bundle);
                throw null;
            }
            boolean zStartInstrumentation = super.startInstrumentation(componentName, str, bundle);
            int i4 = f22848c + 61;
            f22849d = i4 % 128;
            if (i4 % 2 != 0) {
                return zStartInstrumentation;
            }
            throw null;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final void startIntentSender(IntentSender intentSender, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
            int i5 = 2 % 2;
            int i6 = f22848c + 27;
            f22849d = i6 % 128;
            int i7 = i6 % 2;
            super.startIntentSender(intentSender, intent, i2, i3, i4);
            int i8 = f22848c + 33;
            f22849d = i8 % 128;
            int i9 = i8 % 2;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final void startIntentSender(IntentSender intentSender, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
            int i5 = 2 % 2;
            int i6 = f22849d + 23;
            f22848c = i6 % 128;
            int i7 = i6 % 2;
            super.startIntentSender(intentSender, intent, i2, i3, i4, bundle);
            int i8 = f22848c + 89;
            f22849d = i8 % 128;
            int i9 = i8 % 2;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final ComponentName startService(Intent intent) {
            int i2 = 2 % 2;
            int i3 = f22848c + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f22849d = i3 % 128;
            if (i3 % 2 == 0) {
                super.startService(intent);
                throw null;
            }
            ComponentName componentNameStartService = super.startService(intent);
            int i4 = f22849d + 23;
            f22848c = i4 % 128;
            int i5 = i4 % 2;
            return componentNameStartService;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final boolean stopService(Intent intent) {
            int i2 = 2 % 2;
            int i3 = f22849d + 45;
            f22848c = i3 % 128;
            int i4 = i3 % 2;
            boolean zStopService = super.stopService(intent);
            int i5 = f22848c + 63;
            f22849d = i5 % 128;
            if (i5 % 2 != 0) {
                return zStopService;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String toString() {
            int i2 = 2 % 2;
            int i3 = f22849d + 67;
            f22848c = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                super.toString();
                throw null;
            }
            String string = super.toString();
            int i4 = f22848c + 19;
            f22849d = i4 % 128;
            if (i4 % 2 != 0) {
                return string;
            }
            obj.hashCode();
            throw null;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final void unbindService(ServiceConnection serviceConnection) {
            int i2 = 2 % 2;
            int i3 = f22848c + 83;
            f22849d = i3 % 128;
            if (i3 % 2 != 0) {
                super.unbindService(serviceConnection);
            } else {
                super.unbindService(serviceConnection);
                int i4 = 2 / 0;
            }
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final void unregisterComponentCallbacks(ComponentCallbacks componentCallbacks) {
            int i2 = 2 % 2;
            int i3 = f22849d + 59;
            f22848c = i3 % 128;
            if (i3 % 2 != 0) {
                super.unregisterComponentCallbacks(componentCallbacks);
                int i4 = 69 / 0;
            } else {
                super.unregisterComponentCallbacks(componentCallbacks);
            }
            int i5 = f22848c + 47;
            f22849d = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 49 / 0;
            }
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
            int i2 = 2 % 2;
            int i3 = f22848c + 111;
            f22849d = i3 % 128;
            int i4 = i3 % 2;
            super.unregisterReceiver(broadcastReceiver);
            int i5 = f22848c + 105;
            f22849d = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r7, short r8, int r9) {
        /*
            int r2 = r8 + 4
            int r4 = r7 * 4
            int r3 = 1 - r4
            byte[] r8 = o.dd.d.$$a
            int r0 = r9 * 2
            int r1 = r0 + 113
            byte[] r7 = new byte[r3]
            r6 = 0
            int r5 = 0 - r4
            if (r8 != 0) goto L2d
            r3 = r5
            r0 = r2
            r4 = r6
        L16:
            int r1 = -r2
            int r1 = r1 + r3
            r3 = r4
            r2 = r0
        L1a:
            int r0 = r2 + 1
            byte r2 = (byte) r1
            r7[r3] = r2
            int r4 = r3 + 1
            if (r3 != r5) goto L29
            java.lang.String r0 = new java.lang.String
            r0.<init>(r7, r6)
            return r0
        L29:
            r2 = r8[r0]
            r3 = r1
            goto L16
        L2d:
            r3 = r6
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dd.d.$$c(int, short, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22843c = 0;
        f22842b = 1;
        f22845e = 0;
        f22841a = 1;
        c();
        TextUtils.getOffsetBefore("", 0);
        ExpandableListView.getPackedPositionForChild(0, 0);
        SystemClock.currentThreadTimeMillis();
        AudioTrack.getMinVolume();
        View.MeasureSpec.makeMeasureSpec(0, 0);
        TextUtils.indexOf("", "", 0, 0);
        ViewConfiguration.getTapTimeout();
        View.MeasureSpec.getSize(0);
        ViewConfiguration.getKeyRepeatDelay();
        ViewConfiguration.getScrollBarFadeDuration();
        View.MeasureSpec.getMode(0);
        Color.rgb(0, 0, 0);
        int i2 = f22842b + 125;
        f22843c = i2 % 128;
        int i3 = i2 % 2;
    }

    public static void a(Context context) {
        int i2 = 2 % 2;
        Object[] objArr = {new Intent(context, (Class<?>) AntelopLifecycleService.class)};
        Method method = Class.forName(C1561oA.Kd("LZQ`^YU Vccj\\fm(>kkrdxu", (short) (C1633zX.Xd() ^ (-11797)))).getMethod(C1561oA.Xd("7957\u001b.<A503", (short) (Od.Xd() ^ (-18244))), Class.forName(Wg.Zd("\u000ek\u0018M\u0003DufT']\f4\u0004A#ta 8wE", (short) (C1633zX.Xd() ^ (-17980)), (short) (C1633zX.Xd() ^ (-18905)))));
        try {
            method.setAccessible(true);
            method.invoke(context, objArr);
            int i3 = f22845e + 93;
            f22841a = i3 % 128;
            int i4 = i3 % 2;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static void c() {
        f22844d = -1270219377;
    }

    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5 */
    public static boolean d(Context context, o.dd.c cVar, String str) throws Exception {
        int i2 = 2 % 2;
        Bundle bundle = new Bundle();
        ?? Invoke = 0;
        Invoke = 0;
        Object[] objArr = new Object[1];
        f(TextUtils.indexOf((CharSequence) "", '0') + 23, Wg.vd("ST뙘뙁뙞Y뙘뙜H뙃A뙏뙖E뙒뙕@J똷뙉;뙋", (short) (C1580rY.Xd() ^ (-23996))), true, 250 - View.MeasureSpec.makeMeasureSpec(0, 0), View.combineMeasuredStates(0, 0) + 15, objArr);
        bundle.putString(((String) objArr[0]).intern(), cVar.e().toString());
        Object[] objArr2 = new Object[1];
        f(View.resolveSizeAndState(0, 0, 0) + 25, Qg.kd("_URQ꽱Z꽭N꽭꽪N꽚Q꽧꽣R꽥꽌꽣ML꽜>꽞꽌", (short) (C1499aX.Xd() ^ (-3051)), (short) (C1499aX.Xd() ^ (-31613))), false, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 250, 6 - Color.argb(0, 0, 0, 0), objArr2);
        bundle.putString(((String) objArr2[0]).intern(), cVar.d().toString());
        Object[] objArr3 = new Object[1];
        f((ViewConfiguration.getDoubleTapTimeout() >> 16) + 20, hg.Vd("\u0094\u001e蟴\u0017蠀\u000f\u0011蟽\u008c蟡\n\u000b蟶\u0015\u0014\u0005蟞\u0003\u0011蟯", (short) (OY.Xd() ^ 18218), (short) (OY.Xd() ^ 8401)), true, 248 - TextUtils.getCapsMode("", 0, 0), ExpandableListView.getPackedPositionType(0L) + 8, objArr3);
        bundle.putString(((String) objArr3[0]).intern(), str);
        Intent intent = new Intent(context, (Class<?>) AntelopLifecycleService.class);
        intent.putExtras(bundle);
        try {
            if (f.a()) {
                int i3 = f22845e + 77;
                f22841a = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr4 = new Object[1];
                f(28 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), C1561oA.ud("푵!푰*Ƿ푘\u001c\u0018ǳ푫(푩\u0019Ǯ푍\u0019푣푒\u001c\u0014\u0013Ǧ\u0015푃\u000e\rǡ", (short) (C1499aX.Xd() ^ (-19610))), false, TextUtils.lastIndexOf("", '0', 0) + 250, 24 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr4);
                String strIntern = ((String) objArr4[0]).intern();
                Object[] objArr5 = new Object[1];
                f(KeyEvent.getDeadChar(0, 0) + 31, C1561oA.yd("眫LX睒c`N`VYPN眧KHMql^k眿ekegdRdj眶睏", (short) (FB.Xd() ^ 88)), true, 245 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), TextUtils.lastIndexOf("", '0') + 10, objArr5);
                f.c(strIntern, ((String) objArr5[0]).intern());
                int i5 = f22841a + 9;
                f22845e = i5 % 128;
                int i6 = i5 % 2;
            }
            CX.ud();
            Class<?> cls = Class.forName(C1561oA.Yd("O]Tca\\X#Yffm_ip+Annug{x", (short) (C1633zX.Xd() ^ (-27369))));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(Xg.qd("\u007f\u000e\u0005\u0014\u0012\r\tS\n\u0017\u0017\u001e\u0010\u001a![w\u001e%\u0017!(", (short) (FB.Xd() ^ 91), (short) (FB.Xd() ^ 29760)));
            Object[] objArr6 = {intent};
            Method method = cls.getMethod(Jg.Wd("\u0017L#ZGZV\nf\u0010q\u001a", (short) (C1499aX.Xd() ^ (-23483)), (short) (C1499aX.Xd() ^ (-21507))), clsArr);
            try {
                method.setAccessible(true);
                Invoke = method.invoke(context, objArr6);
                return true;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (IllegalStateException e3) {
            if (f.a()) {
                Object[] objArr7 = new Object[1];
                f(Color.argb((int) Invoke, (int) Invoke, (int) Invoke, (int) Invoke) + 27, ZO.xd("む\tꤞwяී]s٘鸀L䊤\u000eף库\u001e킩䩩\u0012%Y۔t郦$\\ˍ", (short) (FB.Xd() ^ 18354), (short) (FB.Xd() ^ 8817)), false, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 248, 23 - (ViewConfiguration.getScrollBarSize() >> 8), objArr7);
                String strIntern2 = ((String) objArr7[Invoke]).intern();
                Object[] objArr8 = new Object[1];
                f(54 - (ViewConfiguration.getTouchSlop() >> 8), C1626yg.Ud("\u0006{\u001bRJ\"Xsa6佰]D$G/b뽤죘᥇\u0b7c[\rg\u000f\u001eKh笀 \u0005g\t3呼\u001ak\u0dbfu>udMn.d}oẾୠ墌4.譱", (short) (FB.Xd() ^ 30890), (short) (FB.Xd() ^ 32166)), true, 241 - (ViewConfiguration.getFadingEdgeLength() >> 16), 5 - (ViewConfiguration.getTapTimeout() >> 16), objArr8);
                f.e(strIntern2, ((String) objArr8[Invoke]).intern(), e3);
            }
            return Invoke;
        }
    }

    private static void f(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i5 = 2 % 2;
        if (str2 != null) {
            int i6 = $10 + 109;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            charArray = str2.toCharArray();
        } else {
            charArray = str2;
        }
        char[] cArr = (char[]) charArray;
        n nVar = new n();
        char[] cArr2 = new char[i2];
        nVar.f19944a = 0;
        while (nVar.f19944a < i2) {
            nVar.f19946e = cArr[nVar.f19944a];
            cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i8 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(f22844d)};
                Object objA = o.d.d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) ($$b - 5);
                    byte b3 = (byte) (b2 - 1);
                    objA = o.d.d.a(ImageFormat.getBitsPerPixel(0) + 271, (char) Color.green(0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 11, -2071844881, false, $$c(b2, b3, (byte) (-b3)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = o.d.d.a(-202660535);
                if (objA2 == null) {
                    byte b4 = (byte) ($$b - 5);
                    byte b5 = (byte) (b4 - 1);
                    objA2 = o.d.d.a((ViewConfiguration.getScrollDefaultDelay() >> 16) + 522, (char) (ViewConfiguration.getTapTimeout() >> 16), 12 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 627984172, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i4 > 0) {
            nVar.f19945b = i4;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - nVar.f19945b, nVar.f19945b);
            System.arraycopy(cArr3, nVar.f19945b, cArr2, 0, i2 - nVar.f19945b);
            int i9 = $11 + 87;
            $10 = i9 % 128;
            int i10 = i9 % 2;
        }
        if (z2) {
            char[] cArr4 = new char[i2];
            nVar.f19944a = 0;
            while (nVar.f19944a < i2) {
                int i11 = $11 + 59;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    cArr4[nVar.f19944a] = cArr2[(nVar.f19944a * i2) / 0];
                    Object[] objArr4 = {nVar, nVar};
                    Object objA3 = o.d.d.a(-202660535);
                    if (objA3 == null) {
                        byte b6 = (byte) ($$b - 5);
                        byte b7 = (byte) (b6 - 1);
                        objA3 = o.d.d.a(523 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 12 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 627984172, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                } else {
                    cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                    Object[] objArr5 = {nVar, nVar};
                    Object objA4 = o.d.d.a(-202660535);
                    if (objA4 == null) {
                        byte b8 = (byte) ($$b - 5);
                        byte b9 = (byte) (b8 - 1);
                        objA4 = o.d.d.a(522 - ExpandableListView.getPackedPositionType(0L), (char) Color.red(0), TextUtils.lastIndexOf("", '0', 0, 0) + 13, 627984172, false, $$c(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr5);
                }
                int i12 = $10 + 3;
                $11 = i12 % 128;
                int i13 = i12 % 2;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void init$0() {
        $$a = new byte[]{65, 52, MessagePack.Code.UINT64, -121};
        $$b = 5;
    }
}
