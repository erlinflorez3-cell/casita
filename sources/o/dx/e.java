package o.dx;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.LruCache;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import o.a.q;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import yg.C1607wl;
import yg.FB;
import yg.QB;
import yg.Wg;
import yg.Xu;

/* JADX INFO: loaded from: classes6.dex */
public final class e {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f23413a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e f23414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f23415c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f23416e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f23417g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f23418h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f23419j = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LruCache<String, Object> f23420d = new LruCache<>(4194304);

    private static String $$c(short s2, byte b2, short s3) {
        int i2 = (b2 * 2) + 4;
        byte[] bArr = $$a;
        int i3 = s2 * 2;
        int i4 = 115 - s3;
        byte[] bArr2 = new byte[i3 + 1];
        int i5 = -1;
        if (bArr == null) {
            i2++;
            i4 = i2 + i3;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i4;
            if (i5 == i3) {
                return new String(bArr2, 0);
            }
            int i6 = bArr[i2];
            i2++;
            i4 += i6;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f23419j = 0;
        f23417g = 1;
        f23416e = 0;
        f23418h = 1;
        d();
        View.combineMeasuredStates(0, 0);
        TextUtils.lastIndexOf("", '0', 0);
        TypedValue.complexToFraction(0, 0.0f, 0.0f);
        TextUtils.getTrimmedLength("");
        TextUtils.indexOf((CharSequence) "", '0');
        Color.red(0);
        f23414b = new e();
        int i2 = f23419j + 83;
        f23417g = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 48 / 0;
        }
    }

    private e() {
    }

    private static File b(Context context, b<?, ?, ?, ?> bVar) throws Throwable {
        int i2 = 2 % 2;
        Class<?> cls = Class.forName(Wg.Zd("-\u0007>X5z{ajp?!\u00181\u0017X/?N\u0012O>\u000e", (short) (C1607wl.Xd() ^ 22852), (short) (C1607wl.Xd() ^ 2433)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (FB.Xd() ^ 31409);
        int[] iArr = new int["\u0015\u0014$s\u0013\u0016\u001c\u001ay *".length()];
        QB qb = new QB("\u0015\u0014$s\u0013\u0016\u001c\u001ay *");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (sXd + i3));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            File file = new File((File) method.invoke(context, objArr), d(bVar));
            int i4 = f23416e + 11;
            f23418h = i4 % 128;
            int i5 = i4 % 2;
            return file;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private <ObjRes> void c(Context context, b<?, ?, ? extends o.dz.c<ObjRes>, ObjRes> bVar) throws Throwable {
        String strD = d(bVar);
        synchronized (this.f23420d) {
            if (this.f23420d.get(strD) != null) {
                return;
            }
            File fileB = b(context, bVar);
            if (!fileB.exists() || !fileB.isFile()) {
                Object[] objArr = new Object[1];
                i("﵎ೡṴ⧂㭜䪨呣枰焌肔鋪鰢꿵륋죞\uda3d\ue5fd\uf73eڈဎ∩ⷹ㽫仏塆殼", TextUtils.indexOf((CharSequence) "", '0') + 61838, objArr);
                throw new a(((String) objArr[0]).intern());
            }
            try {
                Object objE = bVar.a().e(fileB);
                synchronized (this.f23420d) {
                    this.f23420d.put(strD, objE);
                }
            } catch (a e2) {
                if (o.ea.f.a()) {
                    Object[] objArr2 = new Object[1];
                    f(26 - TextUtils.indexOf("", "", 0, 0), "￩\u000b\b\u000f\u0002�\ufffe\u000b￫\ufffe\u0006\b\r\ufffe￫\ufffe\f\b\u000e\u000b￼\ufffe\uffdd\ufffa\r\ufffa", false, 272 - Gravity.getAbsoluteGravity(0, 0), 8 - (KeyEvent.getMaxKeyCode() >> 16), objArr2);
                    String strIntern = ((String) objArr2[0]).intern();
                    StringBuilder sb = new StringBuilder();
                    Object[] objArr3 = new Object[1];
                    i("ﵩꠋ垨﵋꣥垇ﴌ꣗噠ﴄꢰ嘩\ufde8ꭤ嘃ﶃꭜ国ﶓꬱ囥ﱽꯃ嚚ﰰꮆ儮ﱜ", TextUtils.getCapsMode("", 0, 0) + 21859, objArr3);
                    o.ea.f.e(strIntern, sb.append(((String) objArr3[0]).intern()).append(bVar.toString()).toString(), e2);
                }
            }
        }
    }

    private static String d(b<?, ?, ?, ?> bVar) throws Throwable {
        int i2 = 2 % 2;
        String strC = bVar.c();
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        f(View.resolveSizeAndState(0, 0, 0) + 3, "ￚ\b\u001f", false, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 255, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2, objArr);
        StringBuilder sbAppend = sb.append(((String) objArr[0]).intern()).append(bVar.e().a());
        Object[] objArr2 = new Object[1];
        f((ViewConfiguration.getScrollBarSize() >> 8) + 1, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, false, Color.blue(0) + 264, (ViewConfiguration.getPressedStateDuration() >> 16) + 1, objArr2);
        StringBuilder sbAppend2 = sbAppend.append(((String) objArr2[0]).intern()).append(bVar.d().e());
        String string = "";
        if (strC == null) {
            int i3 = f23418h;
            int i4 = i3 + 51;
            f23416e = i4 % 128;
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 39;
            f23416e = i5 % 128;
            int i6 = i5 % 2;
        } else {
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr3 = new Object[1];
            f((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, true, 215 - TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1, objArr3);
            string = sb2.append(((String) objArr3[0]).intern()).append(strC).toString();
        }
        return sbAppend2.append(string).toString();
    }

    private static String d(o.dy.d dVar) throws Throwable {
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        f(KeyEvent.keyCodeFromString("") + 3, "ￚ\b\u001f", false, 256 - Gravity.getAbsoluteGravity(0, 0), 1 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr);
        String string = sb.append(((String) objArr[0]).intern()).append(dVar.a()).toString();
        int i3 = f23418h + 15;
        f23416e = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 33 / 0;
        }
        return string;
    }

    static void d() {
        f23413a = -1270219342;
        f23415c = 3904315942709162050L;
    }

    public static e e() {
        int i2 = 2 % 2;
        int i3 = f23416e + 97;
        int i4 = i3 % 128;
        f23418h = i4;
        int i5 = i3 % 2;
        e eVar = f23414b;
        int i6 = i4 + 33;
        f23416e = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 65 / 0;
        }
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean e(o.dy.d dVar, List list, File file) {
        int i2 = 2 % 2;
        if (!file.getName().startsWith(d(dVar))) {
            return false;
        }
        int i3 = f23418h + 1;
        f23416e = i3 % 128;
        int i4 = i3 % 2;
        if (list.contains(file.getName())) {
            return false;
        }
        int i5 = f23418h;
        int i6 = i5 + 55;
        f23416e = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i5 + 73;
        f23416e = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void f(int r20, java.lang.String r21, boolean r22, int r23, int r24, java.lang.Object[] r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 505
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dx.e.f(int, java.lang.String, boolean, int, int, java.lang.Object[]):void");
    }

    private static void i(String str, int i2, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = $10 + 33;
        int i5 = i4 % 128;
        $11 = i5;
        int i6 = i4 % 2;
        Object obj = null;
        if (str2 != null) {
            int i7 = i5 + 121;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                str2.toCharArray();
                obj.hashCode();
                throw null;
            }
            charArray = str2.toCharArray();
        } else {
            charArray = str2;
        }
        char[] cArr = (char[]) charArray;
        q qVar = new q();
        qVar.f19949d = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        qVar.f19948a = 0;
        while (qVar.f19948a < cArr.length) {
            int i8 = $10 + 91;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = qVar.f19948a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                Object objA = o.d.d.a(-1011865131);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(731 - Gravity.getAbsoluteGravity(0, 0), (char) (7933 - (ViewConfiguration.getPressedStateDuration() >> 16)), 12 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 355847088, false, $$c(b2, b3, (byte) (44 | b3)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i10] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() ^ (f23415c ^ 4743694005979712847L);
                Object[] objArr3 = {qVar, qVar};
                Object objA2 = o.d.d.a(1452497747);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a(836 - (Process.myPid() >> 22), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 27278), Color.argb(0, 0, 0, 0) + 11, -2145994442, false, $$c(b4, b5, (byte) ((b5 + 37) - (37 & b5))), new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        qVar.f19948a = 0;
        while (qVar.f19948a < cArr.length) {
            cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
            Object[] objArr4 = {qVar, qVar};
            Object objA3 = o.d.d.a(1452497747);
            if (objA3 == null) {
                byte b6 = (byte) 0;
                byte b7 = b6;
                objA3 = o.d.d.a(View.MeasureSpec.getSize(0) + 836, (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 27279), 11 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -2145994442, false, $$c(b6, b7, (byte) ((b7 + 37) - (37 & b7))), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
        }
        String str3 = new String(cArr2);
        int i11 = $10 + 31;
        $11 = i11 % 128;
        int i12 = i11 % 2;
        objArr[0] = str3;
    }

    static void init$0() {
        $$a = new byte[]{74, -74, 100, -77};
        $$b = 118;
    }

    final <ObjRes> ObjRes a(Context context, b<?, ?, ? extends o.dz.c<ObjRes>, ObjRes> bVar) throws Throwable {
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            f(26 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "￩\u000b\b\u000f\u0002�\ufffe\u000b￫\ufffe\u0006\b\r\ufffe￫\ufffe\f\b\u000e\u000b￼\ufffe\uffdd\ufffa\r\ufffa", false, TextUtils.indexOf("", "", 0, 0) + 272, 8 - (Process.myTid() >> 22), objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            f((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 9, "\u0011\ufff4$\u0015\u0017\uffd0\uffdd\uffd0\u0011$", true, 249 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 5 - TextUtils.getCapsMode("", 0, 0), objArr2);
            o.ea.f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(bVar.toString()).toString());
        }
        c(context, bVar);
        synchronized (this.f23420d) {
            ObjRes objres = (ObjRes) this.f23420d.get(d(bVar));
            if (objres == null) {
                return null;
            }
            if (bVar.a().a().isAssignableFrom(objres.getClass())) {
                if (o.ea.f.a()) {
                    Object[] objArr3 = new Object[1];
                    f(27 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), "￩\u000b\b\u000f\u0002�\ufffe\u000b￫\ufffe\u0006\b\r\ufffe￫\ufffe\f\b\u000e\u000b￼\ufffe\uffdd\ufffa\r\ufffa", false, 271 - ImageFormat.getBitsPerPixel(0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 8, objArr3);
                    String strIntern2 = ((String) objArr3[0]).intern();
                    Object[] objArr4 = new Object[1];
                    f((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 23, "\u000e\u0010\u000e\u0011\f\n\f\uffc9\u0017\u0012\uffc9\r\u0017\u001e\u0018\uffef\uffc9ￖ\uffc9\n\u001d\n￭\u001d", true, Color.alpha(0) + 256, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1, objArr4);
                    o.ea.f.c(strIntern2, ((String) objArr4[0]).intern());
                }
                return objres;
            }
            if (o.ea.f.a()) {
                Object[] objArr5 = new Object[1];
                f(Process.getGidForName("") + 27, "￩\u000b\b\u000f\u0002�\ufffe\u000b￫\ufffe\u0006\b\r\ufffe￫\ufffe\f\b\u000e\u000b￼\ufffe\uffdd\ufffa\r\ufffa", false, (Process.myPid() >> 22) + 272, 8 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr5);
                String strIntern3 = ((String) objArr5[0]).intern();
                Object[] objArr6 = new Object[1];
                f(67 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), "\u000b\u0013\u000e\f\u001d\uffc9\u001d\"\u0019\u000e\uffc9ￎ\u001c\uffc9\u000b\u001e\u001d\uffc9\u0010\u000e\u001d\u001c\uffc9ￎ\u001c\u0010\u000e\u001d￭\n\u001d\n\uffc9ￖ\uffc9￬\n\f\u0011\u000e\r\uffc9\ufff8\u000b\u0013\u000e\f\u001d\uffc9\u000f\u0018\u001b\uffc9ￎ\u001c\uffc9\u000e!\u0019\u000e\f\u001d\u000e\r\uffc9\u0018", false, Drawable.resolveOpacity(0, 0) + 256, ExpandableListView.getPackedPositionType(0L) + 25, objArr6);
                o.ea.f.d(strIntern3, String.format(((String) objArr6[0]).intern(), bVar.getClass().getCanonicalName(), bVar.a().a().getCanonicalName(), objres.getClass().getCanonicalName()));
            }
            Object[] objArr7 = new Object[1];
            f((ViewConfiguration.getJumpTapTimeout() >> 16) + 33, "\u0006\u000b\b\ufffa\u0015\u0012\u0011\nￃ\ufff2\u0005\r\b\u0006\u0017ￃ\u0017\u001c\u0013\bￃ\u0015\b\u0004\u0007ￃ\t\u0015\u0012\u0010ￃ\u0006\u0004", false, (ViewConfiguration.getEdgeSlop() >> 16) + 262, TextUtils.indexOf("", "", 0) + 3, objArr7);
            throw new a(((String) objArr7[0]).intern());
        }
    }

    public final boolean d(Context context, b<?, ?, ?, ?> bVar) throws a {
        int i2 = 2 % 2;
        int i3 = f23416e + 29;
        f23418h = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            f(26 - TextUtils.getTrimmedLength(""), "￩\u000b\b\u000f\u0002�\ufffe\u000b￫\ufffe\u0006\b\r\ufffe￫\ufffe\f\b\u000e\u000b￼\ufffe\uffdd\ufffa\r\ufffa", false, 272 - View.MeasureSpec.getMode(0), 7 - TextUtils.indexOf((CharSequence) "", '0'), objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            f(20 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "\u0007\u0014ￂￏￂ\u0016\u0015\u000b\u0015\u0014\u0007\ufff2\u0006\u0010￣\u0007\u0018\u000e\u0011\u0015", true, 262 - TextUtils.lastIndexOf("", '0', 0, 0), TextUtils.indexOf((CharSequence) "", '0') + 3, objArr2);
            o.ea.f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(bVar.toString()).toString());
        }
        File fileB = b(context, bVar);
        FileOutputStream fileOutputStream = null;
        if (fileB.isFile() && fileB.exists()) {
            int i5 = f23416e + 1;
            f23418h = i5 % 128;
            if (i5 % 2 == 0) {
                o.ea.f.a();
                fileOutputStream.hashCode();
                throw null;
            }
            if (o.ea.f.a()) {
                Object[] objArr3 = new Object[1];
                f((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 26, "￩\u000b\b\u000f\u0002�\ufffe\u000b￫\ufffe\u0006\b\r\ufffe￫\ufffe\f\b\u000e\u000b￼\ufffe\uffdd\ufffa\r\ufffa", false, 271 - ImageFormat.getBitsPerPixel(0), 8 - (Process.myTid() >> 22), objArr3);
                String strIntern2 = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                i("ﵿ\u175d⤔䏽喵湲聖騿곋운\udb4f\ued2f܃\u19cf㎂䑥帩炨誚鳂녯쬽\uddef\uf7ab\u09d5≡㐃仨悤畭轟ꄟ뮍춽\ue67f\uf85bሊⓐ㻳匳敻罐釺ꮒ뱸혨", 59957 - TextUtils.indexOf("", "", 0, 0), objArr4);
                o.ea.f.c(strIntern2, ((String) objArr4[0]).intern());
            }
            return false;
        }
        InputStream inputStreamD = bVar.d().d().d();
        try {
            try {
                if (!fileB.createNewFile()) {
                    Object[] objArr5 = new Object[1];
                    i("ﵘ甘\ued9a搞\udc8d圏쿏䘤뺺ㅾꦠ‶颬ፓ诃ɝ窝\ued48旎\udc5b咱콼䟶빬㛠", 34939 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr5);
                    throw new IOException(((String) objArr5[0]).intern());
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(fileB);
                try {
                    byte[] bArr = new byte[8192];
                    int i6 = 0;
                    while (true) {
                        int i7 = inputStreamD.read(bArr);
                        if (i7 == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, i7);
                        i6 += i7;
                    }
                    if (o.ea.f.a()) {
                        Object[] objArr6 = new Object[1];
                        f(27 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), "￩\u000b\b\u000f\u0002�\ufffe\u000b￫\ufffe\u0006\b\r\ufffe￫\ufffe\f\b\u000e\u000b￼\ufffe\uffdd\ufffa\r\ufffa", false, (ViewConfiguration.getJumpTapTimeout() >> 16) + 272, 8 - TextUtils.getTrimmedLength(""), objArr6);
                        String strIntern3 = ((String) objArr6[0]).intern();
                        StringBuilder sb2 = new StringBuilder();
                        Object[] objArr7 = new Object[1];
                        f(28 - (Process.myTid() >> 22), "\ufff0\u0004\u000e￡\u0005\u0016\f\u000f\u0013\u0005\u0012\uffc0\u0005\u0016\f\u000f\u0013\u0005\u0012\uffc0ￍ\uffc0\u0014\u0013\t\u0013\u0012\u0005", true, 264 - Process.getGidForName(""), 11 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr7);
                        StringBuilder sbAppend = sb2.append(((String) objArr7[0]).intern()).append(i6);
                        Object[] objArr8 = new Object[1];
                        i("ﴭ춾鳖漊㸬५", 12497 - (Process.myTid() >> 22), objArr8);
                        o.ea.f.c(strIntern3, sbAppend.append(((String) objArr8[0]).intern()).toString());
                    }
                    try {
                        inputStreamD.close();
                    } catch (IOException unused) {
                    }
                    try {
                        fileOutputStream2.close();
                    } catch (IOException unused2) {
                    }
                    c(context, bVar);
                    return true;
                } catch (IOException e2) {
                    e = e2;
                    if (o.ea.f.a()) {
                        Object[] objArr9 = new Object[1];
                        f(26 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), "￩\u000b\b\u000f\u0002�\ufffe\u000b￫\ufffe\u0006\b\r\ufffe￫\ufffe\f\b\u000e\u000b￼\ufffe\uffdd\ufffa\r\ufffa", false, TextUtils.indexOf((CharSequence) "", '0', 0) + 273, KeyEvent.keyCodeFromString("") + 8, objArr9);
                        String strIntern4 = ((String) objArr9[0]).intern();
                        Object[] objArr10 = new Object[1];
                        f(40 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "ￏￂ\u0016\u0015\u000b\u0015\u0014\u0007\ufff2\u0006\u0010￣\u0007\u0018\u000e\u0011\u0015\u0007\u0014\u0003\u0016\u0003\u0006ￂ\u0007\u0016\u000b\u0014\u0019ￂ\u0011\u0016ￂ\u0007\u000e\u0004\u0003\u0010\ufff7ￂ", true, 263 - (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 19, objArr10);
                        o.ea.f.e(strIntern4, ((String) objArr10[0]).intern(), e);
                    }
                    throw new a(e.getMessage());
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    try {
                        inputStreamD.close();
                    } catch (IOException unused3) {
                    }
                    if (fileOutputStream == null) {
                        throw th;
                    }
                    try {
                        fileOutputStream.close();
                        throw th;
                    } catch (IOException unused4) {
                        throw th;
                    }
                }
            } catch (IOException e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x023a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <Type extends o.dy.d> void e(android.content.Context r23, final Type r24, java.util.Collection<o.dx.b<Type, ?, ?, ?>> r25) {
        /*
            Method dump skipped, instruction units count: 725
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dx.e.e(android.content.Context, o.dy.d, java.util.Collection):void");
    }
}
