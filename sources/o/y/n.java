package o.y;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.drew.metadata.exif.makernotes.OlympusMakernoteDirectory;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import cz.msebera.android.httpclient.HttpStatus;
import fr.antelop.sdk.AntelopErrorCode;
import fr.antelop.sdk.exception.WalletValidationErrorCode;
import fr.antelop.sdk.exception.WalletValidationException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.io.encoding.Base64;
import o.aq.b;
import o.eo.e;
import o.er.ac;
import o.er.y;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class n extends c {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: k */
    public static int f27263k = 0;

    /* JADX INFO: renamed from: l */
    public static int f27264l = 0;

    /* JADX INFO: renamed from: m */
    public static int f27265m = 0;

    /* JADX INFO: renamed from: n */
    public static int f27266n = 0;

    /* JADX INFO: renamed from: q */
    private static long f27267q = 0;

    /* JADX INFO: renamed from: s */
    private static char[] f27268s = null;

    /* JADX INFO: renamed from: u */
    private static int f27269u = 0;

    /* JADX INFO: renamed from: v */
    private static int f27270v = 0;

    /* JADX INFO: renamed from: x */
    private static int f27271x = 0;

    /* JADX INFO: renamed from: y */
    private static int f27272y = 0;

    /* JADX INFO: renamed from: o */
    final List<o.ex.b<?>> f27273o;

    /* JADX INFO: renamed from: p */
    private final boolean f27274p;

    /* JADX INFO: renamed from: t */
    private final y f27275t;

    /* JADX INFO: renamed from: o.y.n$3 */
    final class AnonymousClass3 implements b.a {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: d */
        private static char[] f27276d = null;

        /* JADX INFO: renamed from: e */
        private static char f27277e = 0;

        /* JADX INFO: renamed from: f */
        private static int f27278f = 0;

        /* JADX INFO: renamed from: g */
        private static int f27279g = 0;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ o.eo.e f27280a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ Context f27281b;

        /* JADX WARN: Removed duplicated region for block: B:20:0x001d  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0023  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0023 -> B:17:0x0013). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(short r9, int r10, short r11) {
            /*
                int r0 = r10 * 2
                int r8 = 1 - r0
                byte[] r7 = o.y.n.AnonymousClass3.$$a
                int r0 = r11 * 2
                int r6 = 4 - r0
                int r5 = 111 - r9
                byte[] r4 = new byte[r8]
                r3 = 0
                if (r7 != 0) goto L28
                r0 = r6
                r2 = r3
            L13:
                int r6 = r6 + 1
                int r5 = r5 + r0
            L16:
                byte r0 = (byte) r5
                r4[r2] = r0
                int r2 = r2 + 1
                if (r2 != r8) goto L23
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                return r0
            L23:
                r1 = r7[r6]
                r0 = r5
                r5 = r1
                goto L13
            L28:
                r2 = r3
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: o.y.n.AnonymousClass3.$$c(short, int, short):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f27279g = 0;
            f27278f = 1;
            f27276d = new char[]{64586, 64576, 64608, 64629, 64580, 64521, 64587, 65470, 64583, 64598, 64582, 64618, 64630, 64588, 64520, 64543, 64611, 64578, 64579, 64625, 65469, 64609, 64614, 64594, 65471, 64620, 64592, 64624, 64597, 64599, 64585, 64593, 64517, 64584, 64577, 64581};
            f27277e = (char) 51641;
        }

        AnonymousClass3(o.eo.e eVar, Context context) {
            eVar = eVar;
            context = context;
        }

        private static void h(int i2, String str, byte b2, Object[] objArr) throws Throwable {
            int i3;
            int i4;
            String str2 = str;
            int i5 = 2;
            int i6 = 2 % 2;
            int i7 = $11;
            int i8 = i7 + 1;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            Object charArray = str2;
            if (str2 != null) {
                int i10 = i7 + 103;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 31 / 0;
                    charArray = str2.toCharArray();
                } else {
                    charArray = str2.toCharArray();
                }
            }
            char[] cArr = (char[]) charArray;
            o.a.h hVar = new o.a.h();
            char[] cArr2 = f27276d;
            int i12 = 421932776;
            int i13 = 8;
            int i14 = 9;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i15 = 0;
                while (i15 < length) {
                    int i16 = $11 + 1;
                    $10 = i16 % 128;
                    if (i16 % i5 != 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i15])};
                            Object objA = o.d.d.a(i12);
                            if (objA == null) {
                                byte b3 = (byte) i14;
                                byte b4 = (byte) 0;
                                objA = o.d.d.a((ViewConfiguration.getTouchSlop() >> i13) + 270, (char) (ViewConfiguration.getScrollBarSize() >> 8), Gravity.getAbsoluteGravity(0, 0) + 11, -811348851, false, $$c(b3, b4, b4), new Class[]{Integer.TYPE});
                            }
                            cArr3[i15] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                            i5 = 2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i15])};
                        Object objA2 = o.d.d.a(i12);
                        if (objA2 == null) {
                            byte b5 = (byte) 0;
                            objA2 = o.d.d.a((ViewConfiguration.getDoubleTapTimeout() >> 16) + 270, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 12 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), -811348851, false, $$c((byte) 9, b5, b5), new Class[]{Integer.TYPE});
                        }
                        cArr3[i15] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                        i15++;
                        i5 = 2;
                        i12 = 421932776;
                    }
                    i13 = 8;
                    i14 = 9;
                }
                cArr2 = cArr3;
            }
            Object[] objArr4 = {Integer.valueOf(f27277e)};
            Object objA3 = o.d.d.a(421932776);
            if (objA3 == null) {
                byte b6 = (byte) 0;
                objA3 = o.d.d.a(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 271, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 11 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -811348851, false, $$c((byte) 9, b6, b6), new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
            char[] cArr4 = new char[i2];
            if (i2 % 2 != 0) {
                i3 = i2 - 1;
                cArr4[i3] = (char) (cArr[i3] - b2);
            } else {
                i3 = i2;
            }
            int i17 = 1;
            if (i3 > 1) {
                hVar.f19926b = 0;
                while (hVar.f19926b < i3) {
                    hVar.f19927c = cArr[hVar.f19926b];
                    hVar.f19925a = cArr[hVar.f19926b + i17];
                    if (hVar.f19927c == hVar.f19925a) {
                        int i18 = $11 + 95;
                        $10 = i18 % 128;
                        int i19 = i18 % 2;
                        cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                        cArr4[hVar.f19926b + 1] = (char) (hVar.f19925a - b2);
                        i4 = 2;
                        i17 = 1;
                    } else {
                        Object[] objArr5 = {hVar, hVar, Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), hVar};
                        Object objA4 = o.d.d.a(219124184);
                        if (objA4 == null) {
                            byte b7 = (byte) 0;
                            byte b8 = b7;
                            objA4 = o.d.d.a(Color.argb(0, 0, 0, 0) + 825, (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), 11 - TextUtils.getTrimmedLength(""), -611683395, false, $$c(b7, b8, b8), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objA4).invoke(null, objArr5)).intValue() == hVar.f19930g) {
                            Object[] objArr6 = {hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, Integer.valueOf(cCharValue), hVar};
                            Object objA5 = o.d.d.a(-634864343);
                            if (objA5 == null) {
                                byte b9 = (byte) 2;
                                byte b10 = (byte) (b9 - 2);
                                objA5 = o.d.d.a(219 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 11 - View.getDefaultSize(0, 0), 212688716, false, $$c(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            int iIntValue = ((Integer) ((Method) objA5).invoke(null, objArr6)).intValue();
                            int i20 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                            cArr4[hVar.f19926b] = cArr2[iIntValue];
                            cArr4[hVar.f19926b + 1] = cArr2[i20];
                        } else if (hVar.f19928d == hVar.f19929e) {
                            hVar.f19931i = ((hVar.f19931i + cCharValue) - 1) % cCharValue;
                            hVar.f19930g = ((hVar.f19930g + cCharValue) - 1) % cCharValue;
                            int i21 = (hVar.f19928d * cCharValue) + hVar.f19931i;
                            int i22 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                            cArr4[hVar.f19926b] = cArr2[i21];
                            cArr4[hVar.f19926b + 1] = cArr2[i22];
                        } else {
                            int i23 = (hVar.f19928d * cCharValue) + hVar.f19930g;
                            int i24 = (hVar.f19929e * cCharValue) + hVar.f19931i;
                            cArr4[hVar.f19926b] = cArr2[i23];
                            i17 = 1;
                            cArr4[hVar.f19926b + 1] = cArr2[i24];
                            int i25 = $11 + 3;
                            $10 = i25 % 128;
                            i4 = 2;
                            int i26 = i25 % 2;
                        }
                        i4 = 2;
                        i17 = 1;
                    }
                    hVar.f19926b += i4;
                }
            }
            int i27 = 0;
            while (i27 < i2) {
                int i28 = $10 + 53;
                $11 = i28 % 128;
                if (i28 % 2 == 0) {
                    cArr4[i27] = (char) (cArr4[i27] ^ 23880);
                    i27 += 51;
                } else {
                    cArr4[i27] = (char) (cArr4[i27] ^ 13722);
                    i27++;
                }
            }
            objArr[0] = new String(cArr4);
        }

        static void init$0() {
            $$a = new byte[]{121, Base64.padSymbol, 92, -93};
            $$b = 81;
        }

        @Override // o.aq.b.a
        public final void b(Map<o.ex.c, Object> map, String str, Date date) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f27279g + 15;
            f27278f = i3 % 128;
            if (i3 % 2 == 0) {
                o.ea.f.a();
                throw null;
            }
            if (o.ea.f.a()) {
                Object[] objArr = new Object[1];
                h(53 - TextUtils.indexOf("", "", 0, 0), "\u0018\u0007\u0007\u0000\u0018\u0011\u0004\u0007\u001b\u0018\u0003\u0013\u000e\f\u0013\u0001\u0000\"\u001c\n\u001c#\u001c\u001d\u0004\n\u0001\u0007\u0017\u0019\u0000\n\n\u0003\u0007\"\f\u0001\n\u0012\u0006\f#\u0019\u0006\u0000\u0005\u001b\u0004\u0006\u0003\u0007㘼", (byte) (83 - Color.alpha(0)), objArr);
                String strIntern = ((String) objArr[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr2 = new Object[1];
                h(82 - (ViewConfiguration.getScrollDefaultDelay() >> 16), "\u0018\u001b\t\u0000\u0018\u0005\u0007\u0004㘌㘌\u0002\u0014\u001e\u0002\n\u0012\u0019\u0005\u0001\"\u0005\u0007\u0018\u001c\"\u0004\u0001\"\u0007\u0019\u001c\u0005\u0007\n\n\u0010\u0001\u0013\u0006\f\u0012\u0004\u0007\u001e\u0018\u0005\u0000\u0012\u001c\b\u0007\u0004㘌㘌\u0002#\u0007\u0000\u0014#\u0017\u0019\u0000\n\n\u0003\u0007\"\f\u0001\n\u0012\u0006\f#\u0019\u0006\u0000\b!\u000e!", (byte) (35 - (ViewConfiguration.getScrollBarSize() >> 8)), objArr2);
                o.ea.f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(str).toString());
            }
            ArrayList arrayList = new ArrayList();
            o.ex.c[] cVarArrValues = o.ex.c.values();
            int i4 = f27278f + 103;
            f27279g = i4 % 128;
            int i5 = i4 % 2;
            for (o.ex.c cVar : cVarArrValues) {
                arrayList.add(new o.ex.b(map.get(cVar), cVar, Boolean.TRUE, ((c) n.this).f27088r));
            }
            eVar.d(context, ((c) n.this).f27088r.b(), arrayList, date);
            if (n.c(n.this) != null) {
                n.a(n.this).onProcessSuccess();
                int i6 = f27279g + 47;
                f27278f = i6 % 128;
                int i7 = i6 % 2;
            }
        }

        @Override // o.aq.b.a
        public final void d(o.bg.c cVar) throws Throwable {
            int i2 = 2 % 2;
            o.by.c cVarB = o.by.c.b(cVar);
            if (o.ea.f.a()) {
                Object[] objArr = new Object[1];
                h(52 - ImageFormat.getBitsPerPixel(0), "\u0018\u0007\u0007\u0000\u0018\u0011\u0004\u0007\u001b\u0018\u0003\u0013\u000e\f\u0013\u0001\u0000\"\u001c\n\u001c#\u001c\u001d\u0004\n\u0001\u0007\u0017\u0019\u0000\n\n\u0003\u0007\"\f\u0001\n\u0012\u0006\f#\u0019\u0006\u0000\u0005\u001b\u0004\u0006\u0003\u0007㘼", (byte) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 83), objArr);
                String strIntern = ((String) objArr[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr2 = new Object[1];
                h(56 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "\u0018\u001b\t\u0000\u0018\u0005\u0007\u0004㘃㘃\u0002\u0014\u001e\u0002\n\u0012\u0019\u0005\u0001\"\u0005\u0007\u0018\u001c\"\u0004\u0001\"\u0007\u0019\u001c\u0005\u0007\n\n\u0010\u0001\u0013\u0006\f\u0012\u0004\u0007\u001e\u0018\u0005\"\f\u0001\u0010 \u0018\u0019\u0005\u0002\u0014㗔", (byte) (26 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), objArr2);
                o.ea.f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(cVarB).toString());
                int i3 = f27279g + 75;
                f27278f = i3 % 128;
                int i4 = i3 % 2;
            }
            if (n.d(n.this) != null) {
                int i5 = f27278f + 45;
                f27279g = i5 % 128;
                int i6 = i5 % 2;
                if (o.ea.f.a()) {
                    Object[] objArr3 = new Object[1];
                    h(53 - KeyEvent.keyCodeFromString(""), "\u0018\u0007\u0007\u0000\u0018\u0011\u0004\u0007\u001b\u0018\u0003\u0013\u000e\f\u0013\u0001\u0000\"\u001c\n\u001c#\u001c\u001d\u0004\n\u0001\u0007\u0017\u0019\u0000\n\n\u0003\u0007\"\f\u0001\n\u0012\u0006\f#\u0019\u0006\u0000\u0005\u001b\u0004\u0006\u0003\u0007㘼", (byte) (83 - View.MeasureSpec.makeMeasureSpec(0, 0)), objArr3);
                    String strIntern2 = ((String) objArr3[0]).intern();
                    StringBuilder sb2 = new StringBuilder();
                    Object[] objArr4 = new Object[1];
                    h(AndroidCharacter.getMirror('0') + 22, "\u0018\u001b\t\u0000\u0018\u0005\u0007\u0004㘙㘙\u0002\u0014\u001e\u0002\n\u0012\u0019\u0005\u0001\"\u0005\u0007\u0018\u001c\"\u0004\u0001\"\u0007\u0019\u001c\u0005\u0007\n\n\u0010\u0001\u0013\u0006\f\u0012\u0004\u0007\u001e\u0018\u0005\"\f\u0001\u0010 \u0018\u0019\u0005\u0002\u0014\u0002\b㘘㘘\u0005\u0018\u0012\u0004\u001f\u0004!\u000e㗪㗪", (byte) (TextUtils.getTrimmedLength("") + 48), objArr4);
                    o.ea.f.d(strIntern2, sb2.append(((String) objArr4[0]).intern()).append(cVar.c()).toString());
                }
                if (cVar.c() != o.bg.a.az) {
                    n.j(n.this).onError(cVarB);
                } else {
                    n.e(n.this);
                    n.b(n.this).onAuthenticationDeclined();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.y.n$4 */
    public class AnonymousClass4 implements e.d<o.ex.b<?>> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: b */
        private static char f27283b = 0;

        /* JADX INFO: renamed from: d */
        private static char f27284d = 0;

        /* JADX INFO: renamed from: f */
        private static int f27285f = 0;

        /* JADX INFO: renamed from: g */
        private static char[] f27286g = null;

        /* JADX INFO: renamed from: h */
        private static int f27287h = 0;

        /* JADX INFO: renamed from: i */
        private static char f27288i = 0;

        /* JADX INFO: renamed from: j */
        private static char f27289j = 0;

        /* JADX INFO: renamed from: k */
        public static int f27290k = 0;

        /* JADX INFO: renamed from: l */
        public static int f27291l = 0;

        /* JADX INFO: renamed from: m */
        public static int f27292m = 0;

        /* JADX INFO: renamed from: n */
        public static int f27293n = 0;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ o.aq.b f27294a;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ o.i.d f27295c;

        /* JADX WARN: Removed duplicated region for block: B:20:0x001d  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0023  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0023 -> B:17:0x0015). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$e(int r8, int r9, byte r10) {
            /*
                int r7 = r10 + 69
                byte[] r6 = o.y.n.AnonymousClass4.$$c
                int r0 = r9 * 4
                int r5 = 4 - r0
                int r1 = r8 * 3
                int r0 = 1 - r1
                byte[] r4 = new byte[r0]
                r3 = 0
                int r2 = 0 - r1
                if (r6 != 0) goto L28
                r0 = r5
                r1 = r3
            L15:
                int r5 = r5 + 1
                int r7 = r7 + r0
            L18:
                byte r0 = (byte) r7
                r4[r1] = r0
                if (r1 != r2) goto L23
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                return r0
            L23:
                int r1 = r1 + 1
                r0 = r6[r5]
                goto L15
            L28:
                r1 = r3
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: o.y.n.AnonymousClass4.$$e(int, int, byte):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            f27293n = 2140165657;
            f27292m = 585615565;
            f27291l = -3680986;
            f27290k = 1738603325;
            init$0();
            f27285f = 0;
            f27287h = 1;
            f27284d = (char) 2352;
            f27283b = (char) 61228;
            f27288i = (char) 54958;
            f27289j = (char) 62515;
            f27286g = new char[]{56477, 56493, 56521, 56560, 56560, 56562, 56555, 56514, 56518, 56557, 56560, 56563, 56561, 56558, 56537, 56536, 56558, 56556, 56558, 56555, 56546, 56554, 56560, 56551, 56553, 56547, 56540, 56557, 56557, 56551, 56557, 56563, 56556, 56555, 56521, 56486, 56486, 56521, 56563, 56556, 56548, 56553, 56560, 56545, 56543, 56561, 56563, 56528, 56345, 56340, 56341, 56348, 56345, 56337, 56322, 56329, 56350, 56328, 56324, 56344, 56345, 56348, 56348, 56339, 56346, 56472};
        }

        AnonymousClass4(o.aq.b bVar, o.i.d dVar) {
            bVar = bVar;
            dVar = dVar;
        }

        /* JADX WARN: Not initialized variable reg: 7, insn: 0x0171: ARITH (r8 I:??[int, boolean]) = (r7 I:??[int, boolean, short, byte, char]) ^ (2 ??[int, float, short, byte, char]), block:B:106:0x0171 */
        /* JADX WARN: Removed duplicated region for block: B:162:0x0553  */
        /* JADX WARN: Removed duplicated region for block: B:167:0x05cd  */
        /* JADX WARN: Removed duplicated region for block: B:179:0x04f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.Object[] d(int r24, int r25) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1595
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.y.n.AnonymousClass4.d(int, int):java.lang.Object[]");
        }

        static void init$0() {
            $$a = new byte[]{103, 35, 47, 90};
            $$b = 191;
        }

        static void init$1() {
            $$c = new byte[]{112, 68, MessagePack.Code.BIN8, -81};
            $$d = 49;
        }

        private static void o(String str, int i2, Object[] objArr) throws Throwable {
            int i3;
            String str2 = str;
            int i4 = 2 % 2;
            int i5 = $11;
            int i6 = i5 + 41;
            $10 = i6 % 128;
            Object charArray = str2;
            if (i6 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (str2 != null) {
                int i7 = i5 + 115;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                charArray = str2.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            o.a.g gVar = new o.a.g();
            char[] cArr2 = new char[cArr.length];
            gVar.f19924d = 0;
            char[] cArr3 = new char[2];
            int i9 = $10 + 13;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            while (gVar.f19924d < cArr.length) {
                int i11 = $10 + 75;
                $11 = i11 % 128;
                int i12 = 58224;
                if (i11 % 2 == 0) {
                    cArr3[0] = cArr[gVar.f19924d];
                    cArr3[1] = cArr[gVar.f19924d / 0];
                    i3 = 1;
                } else {
                    cArr3[0] = cArr[gVar.f19924d];
                    cArr3[1] = cArr[gVar.f19924d + 1];
                    i3 = 0;
                }
                while (i3 < 16) {
                    char c2 = cArr3[1];
                    char c3 = cArr3[0];
                    try {
                        Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i12) ^ ((c3 << 4) + ((char) (((long) f27288i) ^ (-7511683281764982996L))))), Integer.valueOf(c3 >>> 5), Integer.valueOf(f27289j)};
                        Object objA = o.d.d.a(1603517628);
                        if (objA == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objA = o.d.d.a((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 270, (char) TextUtils.indexOf("", ""), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 11, -1995022631, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i12) ^ ((cCharValue << 4) + ((char) (((long) f27284d) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f27283b)};
                        Object objA2 = o.d.d.a(1603517628);
                        if (objA2 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objA2 = o.d.d.a((-16776946) - Color.rgb(0, 0, 0), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 11 - ((Process.getThreadPriority(0) + 20) >> 6), -1995022631, false, $$e(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                        i12 -= 40503;
                        i3++;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2[gVar.f19924d] = cArr3[0];
                cArr2[gVar.f19924d + 1] = cArr3[1];
                Object[] objArr4 = {gVar, gVar};
                Object objA3 = o.d.d.a(1390051551);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA3 = o.d.d.a((Process.myTid() >> 22) + 270, (char) (AndroidCharacter.getMirror('0') - '0'), TextUtils.lastIndexOf("", '0', 0, 0) + 12, -2074123590, false, $$e(b6, b7, (byte) (b7 + 3)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr2, 0, i2);
        }

        private static void p(String str, int[] iArr, boolean z2, Object[] objArr) throws Throwable {
            char[] cArr;
            String str2 = str;
            int i2 = 2;
            int i3 = 2 % 2;
            Object bytes = str2;
            if (str2 != null) {
                bytes = str2.getBytes("ISO-8859-1");
            }
            byte[] bArr = (byte[]) bytes;
            o.a.m mVar = new o.a.m();
            int i4 = 0;
            int i5 = iArr[0];
            int i6 = iArr[1];
            int i7 = iArr[2];
            int i8 = iArr[3];
            char[] cArr2 = f27286g;
            long j2 = 0;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                while (i4 < length) {
                    int i9 = $11 + 65;
                    $10 = i9 % 128;
                    if (i9 % i2 != 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                            Object objA = o.d.d.a(-2071388435);
                            if (objA == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objA = o.d.d.a((SystemClock.elapsedRealtime() > j2 ? 1 : (SystemClock.elapsedRealtime() == j2 ? 0 : -1)) + 248, (char) (ExpandableListView.getPackedPositionForGroup(0) > j2 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j2 ? 0 : -1)), TextUtils.getTrimmedLength("") + 11, 1376582792, false, $$e(b2, b3, (byte) ((b3 + 47) - (b3 & 47))), new Class[]{Integer.TYPE});
                            }
                            cArr3[i4] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i4])};
                        Object objA2 = o.d.d.a(-2071388435);
                        if (objA2 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objA2 = o.d.d.a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 249, (char) Color.green(0), KeyEvent.normalizeMetaState(0) + 11, 1376582792, false, $$e(b4, b5, (byte) (47 | b5)), new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                        i4++;
                    }
                    i2 = 2;
                    j2 = 0;
                }
                cArr2 = cArr3;
            }
            char[] cArr4 = new char[i6];
            System.arraycopy(cArr2, i5, cArr4, 0, i6);
            if (bArr != null) {
                int i10 = $11 + 23;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                char[] cArr5 = new char[i6];
                mVar.f19943d = 0;
                char c2 = 0;
                while (mVar.f19943d < i6) {
                    int i12 = $11 + 85;
                    $10 = i12 % 128;
                    if (i12 % 2 == 0 ? bArr[mVar.f19943d] != 1 : bArr[mVar.f19943d] != 0) {
                        int i13 = mVar.f19943d;
                        Object[] objArr4 = {Integer.valueOf(cArr4[mVar.f19943d]), Integer.valueOf(c2)};
                        Object objA3 = o.d.d.a(1632715197);
                        if (objA3 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objA3 = o.d.d.a((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 836, (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 27279), 10 - ExpandableListView.getPackedPositionChild(0L), -1210801192, false, $$e(b6, b7, (byte) ((b7 + 51) - (51 & b7))), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[i13] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                    } else {
                        int i14 = $10 + 39;
                        $11 = i14 % 128;
                        if (i14 % 2 == 0) {
                            int i15 = mVar.f19943d;
                            Object[] objArr5 = {Integer.valueOf(cArr4[mVar.f19943d]), Integer.valueOf(c2)};
                            Object objA4 = o.d.d.a(120026474);
                            if (objA4 == null) {
                                objA4 = o.d.d.a(11 - (Process.myTid() >> 22), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 10 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[i15] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                            int i16 = 92 / 0;
                        } else {
                            int i17 = mVar.f19943d;
                            Object[] objArr6 = {Integer.valueOf(cArr4[mVar.f19943d]), Integer.valueOf(c2)};
                            Object objA5 = o.d.d.a(120026474);
                            if (objA5 == null) {
                                objA5 = o.d.d.a(11 - KeyEvent.getDeadChar(0, 0), (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 10 - TextUtils.indexOf("", ""), -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[i17] = ((Character) ((Method) objA5).invoke(null, objArr6)).charValue();
                        }
                    }
                    c2 = cArr5[mVar.f19943d];
                    Object[] objArr7 = {mVar, mVar};
                    Object objA6 = o.d.d.a(-1041906996);
                    if (objA6 == null) {
                        objA6 = o.d.d.a((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 20, (char) (35715 - View.MeasureSpec.getSize(0)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 10, 392175785, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA6).invoke(null, objArr7);
                }
                cArr4 = cArr5;
            }
            if (i8 > 0) {
                char[] cArr6 = new char[i6];
                System.arraycopy(cArr4, 0, cArr6, 0, i6);
                int i18 = i6 - i8;
                System.arraycopy(cArr6, 0, cArr4, i18, i8);
                System.arraycopy(cArr6, i8, cArr4, 0, i18);
                int i19 = $10 + 109;
                $11 = i19 % 128;
                int i20 = i19 % 2;
            }
            int i21 = 1;
            if (z2) {
                int i22 = $10 + 111;
                $11 = i22 % 128;
                if (i22 % 2 == 0) {
                    cArr = new char[i6];
                    mVar.f19943d = 1;
                } else {
                    cArr = new char[i6];
                    mVar.f19943d = 0;
                }
                while (mVar.f19943d < i6) {
                    cArr[mVar.f19943d] = cArr4[(i6 - mVar.f19943d) - i21];
                    mVar.f19943d += i21;
                    i21 = 1;
                }
                cArr4 = cArr;
            }
            if (i7 > 0) {
                int i23 = $11 + 17;
                $10 = i23 % 128;
                char c3 = 2;
                int i24 = i23 % 2;
                mVar.f19943d = 0;
                while (mVar.f19943d < i6) {
                    cArr4[mVar.f19943d] = (char) (cArr4[mVar.f19943d] - iArr[c3]);
                    mVar.f19943d++;
                    c3 = 2;
                }
            }
            String str3 = new String(cArr4);
            int i25 = $10 + 89;
            $11 = i25 % 128;
            if (i25 % 2 == 0) {
                throw null;
            }
            objArr[0] = str3;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0020  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0028 -> B:17:0x0015). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void q(byte r8, short r9, int r10, java.lang.Object[] r11) {
            /*
                int r0 = r10 * 4
                int r7 = 4 - r0
                byte[] r6 = o.y.n.AnonymousClass4.$$a
                int r0 = r8 * 4
                int r5 = r0 + 1
                int r0 = r9 * 4
                int r4 = 100 - r0
                byte[] r3 = new byte[r5]
                r2 = 0
                if (r6 != 0) goto L2b
                r0 = r5
                r1 = r2
            L15:
                int r0 = -r0
                int r4 = r4 + r0
                int r7 = r7 + 1
            L19:
                byte r0 = (byte) r4
                r3[r1] = r0
                int r1 = r1 + 1
                if (r1 != r5) goto L28
                java.lang.String r0 = new java.lang.String
                r0.<init>(r3, r2)
                r11[r2] = r0
                return
            L28:
                r0 = r6[r7]
                goto L15
            L2b:
                r1 = r2
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: o.y.n.AnonymousClass4.q(byte, short, int, java.lang.Object[]):void");
        }

        @Override // o.eo.e.d
        public final void a(o.by.c cVar) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f27287h + 23;
            f27285f = i3 % 128;
            if (i3 % 2 != 0) {
                o.ea.f.a();
                throw null;
            }
            if (o.ea.f.a()) {
                Object[] objArr = new Object[1];
                o("⌌V\uf205\udac2⣇ګ倂ꎝ踗捧왧㻭澄\ude5d䪯\udbbf嘿ቀ\ude52\ue3dfᝈ蹵\uf7de忘ₐ燴\uec7a暜秨씦\udc50ꮝ⯀鹡ᮐྒ실\ue573ꕉ怢ᯀ䎺㞡냩→Ἱ⊑㙐\ue4ca蟐앮賧鞪ꤌ", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 53, objArr);
                String strIntern = ((String) objArr[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr2 = new Object[1];
                p("\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001", new int[]{0, 47, 0, 0}, true, objArr2);
                o.ea.f.d(strIntern, sb.append(((String) objArr2[0]).intern()).append(cVar.d()).toString());
            }
            int i4 = f27285f + 39;
            f27287h = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // o.eo.e.d
        public final void d(List<o.ex.b<?>> list) throws Throwable {
            int i2 = 2 % 2;
            Map<o.ex.c, Object> mapB = n.b(list, n.this.f27273o);
            Pair<Boolean, String> pairB = n.b(mapB);
            if (!((Boolean) pairB.first).booleanValue()) {
                if (n.h(n.this) != null) {
                    n.i(n.this).onError(new o.by.c(AntelopErrorCode.OperationRefused, (String) pairB.second));
                }
                int i3 = f27285f + 49;
                f27287h = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            int i5 = f27287h + 9;
            f27285f = i5 % 128;
            if (i5 % 2 == 0) {
                bVar.e(((c) n.this).f27088r.b(), mapB, dVar, n.this.g());
                return;
            }
            bVar.e(((c) n.this).f27088r.b(), mapB, dVar, n.this.g());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX INFO: renamed from: o.y.n$5 */
    static /* synthetic */ class AnonymousClass5 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f27297a;

        /* JADX INFO: renamed from: b */
        private static int f27298b = 1;

        /* JADX INFO: renamed from: e */
        private static int f27299e = 0;

        static {
            int[] iArr = new int[o.ex.c.values().length];
            f27297a = iArr;
            try {
                iArr[o.ex.c.f25564s.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27297a[o.ex.c.f25565t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27297a[o.ex.c.f25570y.ordinal()] = 3;
                int i2 = f27298b + 37;
                f27299e = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27297a[o.ex.c.f25567v.ordinal()] = 4;
                int i4 = f27299e + 121;
                f27298b = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27297a[o.ex.c.f25569x.ordinal()] = 5;
                int i7 = f27298b;
                int i8 = (((-1) - (((-1) - i7) & ((-1) - 29))) << 1) - (i7 ^ 29);
                f27299e = i8 % 128;
                int i9 = i8 % 2;
                int i10 = 2 % 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27297a[o.ex.c.f25568w.ordinal()] = 6;
                int i11 = f27298b + 89;
                f27299e = i11 % 128;
                int i12 = i11 % 2;
                int i13 = 2 % 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f27297a[o.ex.c.B.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f27297a[o.ex.c.A.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0023 -> B:17:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$j(int r6, byte r7, int r8) {
        /*
            int r2 = r7 * 4
            int r1 = 1 - r2
            byte[] r7 = o.y.n.$$d
            int r0 = r6 * 4
            int r6 = 4 - r0
            int r5 = 105 - r8
            byte[] r4 = new byte[r1]
            r3 = 0
            int r2 = 0 - r2
            if (r7 != 0) goto L28
            r0 = r2
            r1 = r3
        L15:
            int r5 = r5 + r0
            int r6 = r6 + 1
        L18:
            byte r0 = (byte) r5
            r4[r1] = r0
            if (r1 != r2) goto L23
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L23:
            int r1 = r1 + 1
            r0 = r7[r6]
            goto L15
        L28:
            r1 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.y.n.$$j(int, byte, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f27266n = 279163052;
        f27265m = -305464985;
        f27263k = -97638297;
        f27264l = -602833519;
        f27270v = 0;
        f27269u = 1;
        f27272y = 0;
        f27271x = 1;
        o();
        ViewConfiguration.getEdgeSlop();
        ViewConfiguration.getEdgeSlop();
        TypedValue.complexToFraction(0, 0.0f, 0.0f);
        int i2 = f27270v + 51;
        f27269u = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public n(String str, o.ep.d dVar, boolean z2, y yVar, List<o.ex.a<?>> list) {
        super(str, dVar);
        this.f27274p = z2;
        this.f27275t = yVar;
        ArrayList arrayList = new ArrayList();
        for (o.ex.a<?> aVar : list) {
            arrayList.add(new o.ex.b(aVar.c(), aVar.b(), Boolean.TRUE, dVar));
        }
        this.f27273o = arrayList;
    }

    private static void B(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o.a.o oVar = new o.a.o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i5 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f27268s[i2 + i5])};
                Object objA = o.d.d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(742 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 12, 632508977, false, $$j(b2, b3, (byte) ((b3 + 6) - (6 & b3))), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(f27267q), Integer.valueOf(c2)};
                Object objA2 = o.d.d.a(-1567654649);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a(766 - Drawable.resolveOpacity(0, 0), (char) (12469 - ExpandableListView.getPackedPositionChild(0L)), 12 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1946853218, false, $$j(b4, b5, (byte) (b5 + 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i5] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = o.d.d.a(-723636472);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA3 = o.d.d.a(387 - (ViewConfiguration.getTapTimeout() >> 16), (char) View.MeasureSpec.makeMeasureSpec(0, 0), 17 - TextUtils.indexOf((CharSequence) "", '0'), 39570797, false, $$j(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
                int i6 = $11 + 69;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 3 / 5;
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i8 = $11 + 39;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr5 = {oVar, oVar};
            Object objA4 = o.d.d.a(-723636472);
            if (objA4 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                objA4 = o.d.d.a(386 - TextUtils.lastIndexOf("", '0'), (char) KeyEvent.normalizeMetaState(0), 19 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 39570797, false, $$j(b8, b9, b9), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    private static /* synthetic */ Object a(Object[] objArr) throws Throwable {
        n nVar = (n) objArr[0];
        Context context = (Context) objArr[1];
        o.x.f fVar = (o.x.f) objArr[2];
        int i2 = 2 % 2;
        if (o.ea.f.a()) {
            int i3 = f27272y + 103;
            f27271x = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr2 = new Object[1];
            B((char) (OlympusMakernoteDirectory.CameraSettings.TAG_BLACK_AND_WHITE_FILTER - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 18, View.getDefaultSize(0, 0) + 53, objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            B((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 54437), (ViewConfiguration.getTouchSlop() >> 8) + 573, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 11, objArr3);
            o.ea.f.c(strIntern, ((String) objArr3[0]).intern());
            int i5 = f27271x + 1;
            f27272y = i5 % 128;
            int i6 = i5 % 2;
        }
        if (!((c) nVar).f27088r.u()) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
            Object[] objArr4 = new Object[1];
            B((char) (View.resolveSize(0, 0) + 32734), 585 - Gravity.getAbsoluteGravity(0, 0), 4 - Color.green(0), objArr4);
            throw new WalletValidationException(walletValidationErrorCode, ((String) objArr4[0]).intern());
        }
        if (nVar.f27275t.c()) {
            nVar.b(context, fVar);
            int i7 = f27272y + 15;
            f27271x = i7 % 128;
            if (i7 % 2 != 0) {
                return null;
            }
            throw null;
        }
        WalletValidationErrorCode walletValidationErrorCode2 = WalletValidationErrorCode.WrongState;
        Object[] objArr5 = new Object[1];
        B((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 548 - KeyEvent.getDeadChar(0, 0), 25 - KeyEvent.keyCodeFromString(""), objArr5);
        throw new WalletValidationException(walletValidationErrorCode2, ((String) objArr5[0]).intern());
    }

    static /* synthetic */ o.x.f a(n nVar) {
        int i2 = 2 % 2;
        int i3 = f27271x + 91;
        f27272y = i3 % 128;
        if (i3 % 2 == 0) {
            return nVar.i();
        }
        nVar.i();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:174:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static android.util.Pair<java.lang.Boolean, java.lang.String> b(java.util.Map<o.ex.c, java.lang.Object> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 782
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.y.n.b(java.util.Map):android.util.Pair");
    }

    public static /* synthetic */ Object b(int i2, int i3, int i4, int i5, int i6, Object[] objArr, int i7) {
        int i8 = ~i7;
        int i9 = ~i6;
        int i10 = ~((i8 + i9) - (i8 & i9));
        int i11 = ~i5;
        int i12 = ~((i9 + i11) - (i9 & i11));
        int i13 = i10 | i12;
        int i14 = (~(i5 | i9 | i7)) | ((-1) - (((-1) - (~((-1) - (((-1) - i8) & ((-1) - i6))))) & ((-1) - (~((-1) - (((-1) - i11) & ((-1) - i8)))))));
        int i15 = i7 + i6 + i4 + ((-1336646162) * i3) + (1706069763 * i2);
        int i16 = i15 * i15;
        int i17 = ((i7 * (-1709230891)) - 203685888) + ((-1709230891) * i6) + ((-1137600936) * i13) + (568800468 * i12) + ((-568800468) * i14) + (2016935936 * i4) + ((-602931200) * i3) + ((-1331167232) * i2) + ((-1604583424) * i16);
        int i18 = ((i7 * 112646815) - 831444653) + (i6 * 112646815) + (i13 * 520) + (i12 * (-260)) + (i14 * 260) + (i4 * 112647075) + (i3 * (-2078048118)) + (i2 * (-2015059991)) + (i16 * (-829161472));
        return i17 + ((i18 * i18) * (-1266417664)) != 1 ? a(objArr) : b(objArr);
    }

    private static /* synthetic */ Object b(Object[] objArr) throws Throwable {
        n nVar = (n) objArr[0];
        int i2 = 2 % 2;
        int i3 = f27271x + 65;
        f27272y = i3 % 128;
        if (i3 % 2 != 0) {
            boolean z2 = nVar.f27274p;
            throw null;
        }
        if (!nVar.f27274p) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
            Object[] objArr2 = new Object[1];
            B((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 547 - ExpandableListView.getPackedPositionChild(0L), 25 - KeyEvent.normalizeMetaState(0), objArr2);
            throw new WalletValidationException(walletValidationErrorCode, ((String) objArr2[0]).intern());
        }
        Iterator<o.ex.b<?>> it = nVar.f27273o.iterator();
        while (it.hasNext()) {
            if (!((ac) nVar.f27275t.h()[0]).c(it.next().c()).booleanValue()) {
                WalletValidationErrorCode walletValidationErrorCode2 = WalletValidationErrorCode.Unexpected;
                Object[] objArr3 = new Object[1];
                B((char) ((ViewConfiguration.getTapTimeout() >> 16) + 51391), (-1) - ((byte) KeyEvent.getModifierMetaStateMask()), Color.argb(0, 0, 0, 0) + 18, objArr3);
                throw new WalletValidationException(walletValidationErrorCode2, ((String) objArr3[0]).intern());
            }
            int i4 = f27271x + 71;
            f27272y = i4 % 128;
            int i5 = i4 % 2;
        }
        return null;
    }

    static Map<o.ex.c, Object> b(List<o.ex.b<?>> list, List<o.ex.b<?>> list2) {
        o.ex.b<?> next;
        int i2 = 2 % 2;
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (o.ex.b<?> bVar : list2) {
            int i3 = f27272y + 43;
            f27271x = i3 % 128;
            int i4 = i3 % 2;
            map.put(bVar.c(), bVar.a());
            arrayList.add(bVar.c());
        }
        Iterator<o.ex.b<?>> it = list.iterator();
        while (it.hasNext()) {
            int i5 = f27272y + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f27271x = i5 % 128;
            if (i5 % 2 == 0) {
                next = it.next();
                int i6 = 10 / 0;
                if (!arrayList.contains(next.c())) {
                    int i7 = f27271x + 1;
                    f27272y = i7 % 128;
                    int i8 = i7 % 2;
                    map.put(next.c(), next.a());
                }
            } else {
                next = it.next();
                if (!arrayList.contains(next.c())) {
                    int i72 = f27271x + 1;
                    f27272y = i72 % 128;
                    int i82 = i72 % 2;
                    map.put(next.c(), next.a());
                }
            }
        }
        return map;
    }

    static /* synthetic */ o.x.f b(n nVar) {
        int i2 = 2 % 2;
        int i3 = f27271x + 15;
        f27272y = i3 % 128;
        if (i3 % 2 != 0) {
            nVar.i();
            throw null;
        }
        o.x.f fVarI = nVar.i();
        int i4 = f27272y + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f27271x = i4 % 128;
        int i5 = i4 % 2;
        return fVarI;
    }

    static /* synthetic */ o.x.f c(n nVar) {
        int i2 = 2 % 2;
        int i3 = f27272y + 67;
        f27271x = i3 % 128;
        int i4 = i3 % 2;
        o.x.f fVarI = nVar.i();
        int i5 = f27271x + 121;
        f27272y = i5 % 128;
        int i6 = i5 % 2;
        return fVarI;
    }

    static /* synthetic */ o.x.f d(n nVar) {
        int i2 = 2 % 2;
        int i3 = f27271x + 17;
        f27272y = i3 % 128;
        int i4 = i3 % 2;
        o.x.f fVarI = nVar.i();
        int i5 = f27271x + 89;
        f27272y = i5 % 128;
        int i6 = i5 % 2;
        return fVarI;
    }

    static /* synthetic */ void e(n nVar) {
        int i2 = 2 % 2;
        int i3 = f27271x + 109;
        f27272y = i3 % 128;
        int i4 = i3 % 2;
        nVar.e();
        int i5 = f27271x + 85;
        f27272y = i5 % 128;
        int i6 = i5 % 2;
    }

    static /* synthetic */ o.x.f h(n nVar) {
        int i2 = 2 % 2;
        int i3 = f27271x + 45;
        f27272y = i3 % 128;
        int i4 = i3 % 2;
        o.x.f fVarI = nVar.i();
        if (i4 != 0) {
            int i5 = 52 / 0;
        }
        return fVarI;
    }

    static /* synthetic */ o.x.f i(n nVar) {
        int i2 = 2 % 2;
        int i3 = f27272y + 53;
        f27271x = i3 % 128;
        int i4 = i3 % 2;
        o.x.f fVarI = nVar.i();
        int i5 = f27271x + 41;
        f27272y = i5 % 128;
        int i6 = i5 % 2;
        return fVarI;
    }

    static void init$0() {
        $$d = new byte[]{67, Ascii.SI, 99, -76};
        $$e = 104;
    }

    static /* synthetic */ o.x.f j(n nVar) {
        int i2 = 2 % 2;
        int i3 = f27272y + 93;
        f27271x = i3 % 128;
        int i4 = i3 % 2;
        o.x.f fVarI = nVar.i();
        int i5 = f27272y + 57;
        f27271x = i5 % 128;
        int i6 = i5 % 2;
        return fVarI;
    }

    static void o() {
        char[] cArr = new char[1705];
        ByteBuffer.wrap("\\9,¨½\u0002\ræ\u009ebnßÿ¤H\u0018Ø\u009c©m9Å\u008as\u001b6ë\u0088t{ÄæUR&&d\u0090\u0014 \u0085\u00995y¦÷VyÇ6p\u009bà\u0014\u0091ä\u0001Z²à#¤Ó\u0015LòütmÈ\u001e²\u008e\u0004?\u008d¯gXÞÈvy8ê\u0095\u009a\u0007\u000bû»Q4\t¥°U\nÆþvJçÏ\u0090´\u0000\b±\u008c!eÒÝC\u009bó.l\u0098\u001ck\u008dö=B®>_«Ï\u0012xæè]\u0099Â\n¿º\u0006\u0094\u0080ä\u0010u²ÅgVÜ¦n7\u001b\u0080¶\u00109aÎ¾jÎú_Xï\u008d|6\u008c\u0084\u001dñª\\:ÓK$ÛÞhHù,\tÁ\u0096?&µ·\u001aÄvTãå[u±\u0082[\u0012\u0096£û0Q@ÉÑ=a\u0094îÿ\u007fw\u008fÃ\u001c>¬\u0096=OJuÚÒkJû¿\b\u0000\u0099v)ì¶DÆþWhçÌtÝ\u0085U\u0015\u0081¢<2\u008dC\u0007Ðc`Çñ:\u0001¡\u008e\u001d\u001fy¯è<@LõÝ\u001fm\u008cúä\u000bE\u009bª( ¸\u009aÉîV$æ\u0086wl\u0087Ù\u0014$¥x5\u009eBWÒ©c\u0015ðh\u0000ä\u0091[!·æt\u0096ä\u0007F·\u0093$(Ô\u009aEïòBbÍ\u0013:\u0083À0V¡2QßÎ!~«ï\u0004\u009ch\fý½E-¯ÚEJ\u0088ûåhO\u0018×\u0089#9\u008a¶á'i×ÝD ô\u0088eQ\u0012k\u0082Ì3T£¡P\u001eÁhqòîZ\u009eà\u000fv¿Ò,ÉÝEMËú3jÁ\u001b\u0011\u0088`8\u008a©+Y©Ö\u001bGb÷¹d\u001d\u0014õ\u0085B5¹¢ûS\u000fÃ´p4à\u008e\u0091ñ\u000e\u007f¾Æ/$\u0094\u0080ä\u0010u²ÅgVÜ¦n7\u001b\u0080¶\u00109aÎñ4B¢ÓÆ#+¼Õ\f_\u009dðî\u009c~\tÏ±_[¨±8|\u0089\u0011\u001a»j#û×K~Ä\u0015U\u009d¥)6Ô\u0086|\u0017¥`\u009fð8A ÑU\"ê³\u009c\u0003\u0006\u009c®ì\u0014}\u0082Í&^5¯±?8\u0088Ö\u00185iþú\u0082J*ÛÃ+A¤æ5\u008c\u0085\b\u0016äfO÷÷GzÐ\u0014!û±\u0003\u0002\u0095\u0092,ãG|ÞÌ,]Ë\u00ad3>§\u008fÃ\u001fth\u008bøII¹Ú\u0082*\u000e»¤\u000bG\u0084É\u0014te\u0016\u0094\u0080ä\u0010u²ÅgVÜ¦n7\u001b\u0080¶\u00109aÎñ4B¢ÓÆ#+¼Õ\f_\u009dðî\u009c~\tÏ±_[¨±8|\u0089\u0011\u001a»j#û×K~Ä\u0015U\u009d¥)6Ô\u0086|\u0017¥`\u009fð8A ÑU\"ê³\u009c\u0003\u0006\u009c®ì\u0014}\u0082Í&^7¯¿?k\u0088Ð\u0018piêú\u0095J;ÛÂ+@¤£5\u008e\u0085\u0002\u0016äf[÷ùG%Ð@!©±W\u0002Ñ\u0092iã\u0005|\u0080Ìa]Û\u00adf>ø\u008f\u008f\u001f1h¡øRI¹Ú\u0084*\u0019»£\u000b[\u0084ß\u0014fe\u001dö¥F!×Ì't°\u00ad\u0001\u0087\u00910âØr]Ãò\\\u0094¬>=¶\u0014îd~õÜE\tÖ²&\u0000·u\u0000Ø\u0090Wá qZÂÌS¨£E<»\u008c1\u001d\u009enòþgOßß5(ß¸\u0012\t\u007f\u009aÕêM{¹Ë\u0010D{Õó%G¶º\u0006\u0012\u0097ËàñpVÁÎQ;¢\u00843ò\u0083h\u001cÀlzýìMHÞS/Ñ¿\u0005\b\u009e\u0098\u001eé\u0084zûÊU[¬«.\u0093LãÜr~Â«Q\u0010¡¢0×\u0087z\u0017õf\u0002öøEnÔ\n$ç»\u0019\u000b\u0093\u009a<éPyÅÈ}X\u0097¯\t?¶\u008eÎ\u001dxmòü\tL°ÃÎRL¢ã1\u0019\u0081\u009d\u0010&g^÷ïFpÖ\u0082%8´\u001f\u0004ñ\u009bpë\u0094z\u000fÊ¯YÁ¨J8æ\u008f\u0002\u001f°n$ýJMæÜ\u0014,\u008b£!2s\u0082Ù\u0011ka\u0096ð*@±×Å&x¶\u0090\u0005I\u0095µäÃ{AËèZ\u0004ª«9/\u0088^\u0018öo#\u0094\u0086ä\u0017u½ÅYVÝ¦`7\u001b\u0080§\u0010#aÒñzBÌÓ\u0089#7¼Ä\fY\u009díî\u0099~?Ï¢_L¨ç8a\u0089\u0000\u001a¿@;0¡¡\f\u0011ü\u0082hrÌã\u0088T\u0006Ä\u008bµy%Å\u0096Oëo\u009bÚ\npº\u008d\u0085¹õ\bd¢ÔFGÂ·\u007f&\u0004\u0091¸\u0001<pÍàeS°Â\u009a2)\u00adÁ\u001d@\u008cïÿ\u0085o\u001fÞøNB¹á)y\u0098\u000f\u000b±{ êÚZiÕ\u0007D\u0082´,'\u0084\u00977\u0006ºq\u008aá.PñÀy3â¢\u0083\u0012\u0019\u008d\u00adýHlÑÜmO\u000f¾ .:\u0099\u0093\tHxÿë\u0097[\"ÊÅ:vµð$\u0089\u0094R\u0007²wSæ©VbÁ\r0± H\u0013\u0096\u0083#ò\u000bm\u009eÝ+LÉ¼x/ç\u009e\u008b\u000e.y£énXîË\u0086;\u0000ª¸\u001aF\u0095Ú\u0005kt\u0015çîW8ÆÎ6%¡á\u0010\u008f\u0080!óÝcSÒÈM\u008c½$,®\u009cF\u000fä\u007fxî\rY³É\f8Ø¨w\u001b\u0018\u008a\u0084ú7u\u0081å{T´Ç\u009f7/¦ó\u0016V\u0081ôð\u0082`\u001bÓüCJ²À\";\u009d\u0005\f¤|&ïË_}\u0094¦ä\u0017u½ÅYVÝ¦`7\u001b\u0080§\u0010#aÒñzB¯Ó\u0085#6¼Þ\f_\u009dðî\u009a~\u0000Ïç_]¨þ8f\u0089\u0010\u001a®j?ûÅKvÄ\u0018U\u009d¥36\u009b\u0086(\u0017¥`\u0095ð1AîÑf\"ý³\u009c\u0003\u0006\u009c²ìW}ÎÍr^\u0010¯¿?%\u0088\u008c\u0018Tiàú\u0082J,ÛÅ+i¤ï5\u0096\u0085M\u0016\u00adfL÷¶G}Ð\u0012!®±W\u0002\u0089\u0092<ã\u0014|\u0081Ì4]Ö\u00adg>ø\u008f\u0094\u001f1h¼øqIñÚ\u0099*\u001f»§\u000bY\u0084Å\u0014te\nöñF'×Ñ':°þ\u0001\u0090\u0091>âÂrLÃ×\\\u0093¬;=±\u008dY\u001eûngÿ\u0012H¬Ø\u0013)Ç¹h\n\u0007\u009b\u009bë(d\u009eôdE«Ö\u0080&0·ì\u0007I\u0090ëá\u009dq\u0004ÂãRU£ß3$\u008c\u001a\u001d»m9þÔNb\u0094¦ä\u0017u½ÅYVÝ¦`7\u001b\u0080§\u0010#aÒñzB¯Ó\u0085#6¼Þ\f_\u009dðî\u009a~\u0000Ïç_]¨þ8f\u0089\u0010\u001a®j?ûÅKvÄ\u0018U\u009d¥36\u009b\u0086(\u0017¥`\u0095ð1AîÑl\"ý³\u0081\u0003\t\u009cµìU}ÁÍr^-¯©?;\u0088Ç\u0018;iÎú\u008bJ1ÛÒ+C¤Â5\u0096\u0085\u0001\u0016äfV÷åG)Ð\u0014!©±G\u0002À\u00920ãW|¬Ì-]Ù\u00adp>á\u008f\u0091\u001f=h¼øRIüÚ\u0094*&»§\u000bG\u0084Ï\u0014oe\u001fö¿F<×÷'c°ý\u0001\u0081\u0091,â\u0096rDÃõ\\\u0088¬&=«\u008d\u001b\u001eãn.ÿ\u0003H½Ø\u0013)Ä¹h\n\u0018\u009b\u0083ëfdÖôbE«Ö\u0087&8·¼\u0007S\u0090ç\u0094¦ä\u0017u½ÅYVÝ¦`7\u001b\u0080§\u0010#aÒñzB¯Ó\u0085#6¼Þ\f_\u009dðî\u009a~\u0000Ïç_]¨þ8f\u0089\u0010\u001a®j?ûÅKvÄ\u0018U\u009d¥36\u009b\u0086(\u0017¥`\u0095ð1AîÑl\"ý³\u0081\u0003\t\u009cµìU}ÁÍr^-¯©?;\u0088Ç\u0018;iÍú\u008bJ;ÛÃ+\\¤Â5\u0096\u0085\u0001\u0016äfV÷åG)Ð\u0014!©±G\u0002À\u00920ãW|¬Ì-]Ù\u00adp>á\u008f\u0091\u001f=h¼øRIüÚ\u0094*&»§\u000bG\u0084Ï\u0014oe\u001fö¿F<×÷'c°ý\u0001\u0081\u0091,â\u0096rDÃõ\\\u0088¬&=«\u008d\u001b\u001eãn.ÿ\u0003H½Ø\u0013)Ä¹h\n\u0018\u009b\u0083ëfdÖôbE«Ö\u0087&8·¼\u0007S\u0090ç\u0095;å\u008at ÄÄW@§ý6\u0086\u0081:\u0011¾`OðçC2Ò\u0018\"«½C\rÂ\u009cmï\u0007\u007f\u009dÎz^À©c9û\u0088\u008d\u001b3k¢úXJëÅ\u0085T\u0000¤®7\u0006\u0087µ\u00168a\bñ¬@sÐê#`²\u0002\u0002\u0098\u009d#íÀ|FÌâ_Ê®\u001d>³\u0089M\u0019áh~û\u001eKãÚE*Æ¥p4@\u0084\u0084\u0017ygÌö~FøÑ\u0091 j°\u008f\u0003L\u0093éâ\u008f}\u001dÍü\\s¬ë?{\u008e\u000f\u001eªi;ùÏH}ÛC+¢º6\nÅ\u0085T\u0015Àd\u008c÷\"G°Ö\u001e&ê±e\u0000\n\u0090¶ã\u000bsÚÂr]\u0012\u00adï<:\u008cÄ\u001f*oýþ\u0089I)ÙÂ(\u0017¸á\u000b\u009a\u009aRê¬eAõáDz×_'©¶\"\u0006\u009a\u0091fà\u0005p\u0081Ã6SÂ¢B2¹\u008d´\u001c.l¸ÿROåÞ\u0086)\f¹¸\b\u0004\u0098ñëpz\nÊ\u00adE<Õô$a´à\u0007\u009e\u00967æÅqYÁóP\u008c£Q3µ\u0082Q\u0012¬mCü\u001bL«ß?/Ú¾k\t\u001f\u0099\u008dèsxçËc[ýª\u0093%>µ\u0087\u0004T\u0094÷ç\u008bv\u0004Æ¨QF¡Þ0\u007f\u0094¦ä\u0017u½ÅYVÝ¦`7\u001b\u0080§\u0010#aÒñzB¯Ó\u0085#6¼Þ\f_\u009dðî\u009a~\u0000Ïç_]¨þ8f\u0089\u0010\u001a®j?ûÅKvÄ\u0018U\u009d¥36\u009b\u0086(\u0017¥`\u0095ð1AîÑw\"ý³\u009f\u0003\u0005\u009c¾ì]}ÛÍ\u007f^W¯\u0092?'\u0088Í\u0018viçú³J6ÛÃ+M¤ð5\u0092\u0085\u0002\u0016¨f[÷¶G`Ð\u0013!µ±\u0015\u0002Ñ\u0092<ã\u0019|\u009bÌ-]Ô\u00ad?>ª\u008f\u0089\u001f<hªøHI¹Ú¦*\u000e»®\u000bZ\u0084Ï\u0014ne\nö¨Ff×ó'\u007f°ÿ\u0001\u008d\u00910âÒr\tÃá\\\u0095¬6=å\u008dj\u001eònbÿ\u000eH»ØZ)Þ¹d\nZ\u009b»ë/dÔôuEÑÖ\u008d&;·©\u0007\u0007\u0090óá\u0084q\u001bÂ·R\u001a£Ã3k\u008c\u000b\u001döm+þÅN;ß\u001c(\u0090¸0\tÛ\u0099\u000eêà{\u008bËsD½ÔX%øµc\u0094¦ä\u0017u½ÅYVÝ¦`7\u001b\u0080§\u0010#aÒñzB¯Ó\u0085#6¼Þ\f_\u009dðî\u009a~\u0000Ïç_]¨þ8f\u0089\u0010\u001a®j?ûÅKvÄ\u0018U\u009d¥36\u009b\u0086(\u0017¥`\u0095ð1AîÑw\"ý³\u009f\u0003\u0005\u009c¾ì]}ÛÍ\u007f^W¯\u0091?'\u0088Ç\u0018giøú³J6ÛÃ+M¤ð5\u0092\u0085\u0002\u0016¨f[÷¶G`Ð\u0013!µ±\u0015\u0002Ñ\u0092<ã\u0019|\u009bÌ-]Ô\u00ad?>ª\u008f\u0089\u001f<hªøHI¹Ú¦*\u000e»®\u000bZ\u0084Ï\u0014ne\nö¨Ff×ó'\u007f°ÿ\u0001\u008d\u00910âÒr\tÃá\\\u0095¬6=å\u008dj\u001eònbÿ\u000eH»ØZ)Þ¹d\nZ\u009b»ë/dÔôuEÑÖ\u008d&;·©\u0007\u0007\u0090óá\u0084q\u001bÂ·R\u001a£Ã3k\u008c\u000b\u001döm+þÅN;ß\u001c(\u0090¸0\tÛ\u0099\u000eêà{\u008bËsD½ÔX%øµc\u0094¦ä\u0017u½ÅYVÝ¦`7\u001b\u0080§\u0010#aÒñzB¯Ó\u0085#6¼Þ\f_\u009dðî\u009a~\u0000Ïç_]¨þ8f\u0089\u0010\u001a®j?ûÅKvÄ\u0018U\u009d¥36\u009b\u0086(\u0017¥`\u0095ð1AîÑw\"ý³\u009f\u0003\u0005\u009c¾ì]}ÛÍ\u007f^W¯\u0084?\"\u0088Ï\u0018piÖú\u0088J0ÛÔ+\b¤ê5\u0089\u0085\u0003\u0016ãfK÷¶GgÐ\u0015!·±^\u0002\u0089\u0092<ã\u0003|\u0086Ì$]Ö\u00ad3>Ü\u008f\u0098\u001f8h øEIðÚ\u0084*\u0012»ì\u000be\u0084É\u0014ue\u0017ö¾F,×\u0083'w°ø\u0001\u0097\u0091+â\u0096rGÃï\\\u008f¬r=§\u008dY\u001e·n`ÿ\u0014H´Ø_)\u008a¹|\n\u0007\u009bÏë1dÜô|EçÖÂ&4·¿\u0007\u0007\u0090ûá\u0098q\u001cÂ«R_£ß3$\u008c)\u001d³m%þÏNxß\u001b(\u0091¸%\t\u0099\u0099lêí{\u0097Ë0D¡Ôi%üµ}\u0006\u0003\u0097ªçXpÄÀnQ\u0011¢Ì2(\u0083Ì\u00131lÞý\u0086M6Þ¢.G¿ö\b\u0082\u0098\u0010éîyzÊþZ`«\u000e$£´\u001a\u0005É\u0095jæ\u0016w\u0099Ç5PÛ C1â".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1705);
        f27268s = cArr;
        f27267q = 1806213696156197989L;
    }

    public final void a(Context context, o.x.f fVar) throws WalletValidationException {
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i2 = f27264l * 1598386653;
        f27264l = i2;
        int i3 = f27263k * (-150805110);
        f27263k = i3;
        b((int) Runtime.getRuntime().maxMemory(), i3, i2, iElapsedRealtime, -1425880657, new Object[]{this, context, fVar}, 1425880657);
    }

    @Override // o.y.c
    final void a_() throws WalletValidationException {
        int i2 = f27265m * 372875646;
        f27265m = i2;
        int i3 = (int) Runtime.getRuntime().totalMemory();
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i4 = f27266n * (-1076329617);
        f27266n = i4;
        b(i4, elapsedCpuTime, i3, i2, -655849789, new Object[]{this}, 655849790);
    }

    @Override // o.x.i
    public final String c() throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = f27271x + 63;
        f27272y = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = new Object[1];
            B((char) (51391 >> (ViewConfiguration.getKeyRepeatDelay() >>> 34)), (-1) >> TextUtils.lastIndexOf("", 'E', 1), 102 >>> (ViewConfiguration.getScrollBarSize() * 94), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            B((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 51391), (-1) - TextUtils.lastIndexOf("", '0', 0), 18 - (ViewConfiguration.getScrollBarSize() >> 8), objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern();
    }

    @Override // o.x.i
    public final void c(Context context, o.en.b bVar, o.i.d dVar) throws Throwable {
        Object obj;
        Object obj2;
        int i2 = 2 % 2;
        int i3 = f27271x + 117;
        f27272y = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        B((char) (OlympusMakernoteDirectory.CameraSettings.TAG_COLOR_FILTER - Process.getGidForName("")), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 18, (ViewConfiguration.getFadingEdgeLength() >> 16) + 53, objArr);
        String strIntern = ((String) objArr[0]).intern();
        if (o.ea.f.a()) {
            int i5 = f27272y + 1;
            f27271x = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr2 = new Object[1];
            B((char) View.combineMeasuredStates(0, 0), View.resolveSize(0, 0) + 71, Color.rgb(0, 0, 0) + 16777226, objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        o.eo.e eVarJ = o.en.b.c().j();
        o.aq.b bVar2 = new o.aq.b(context, new b.a() { // from class: o.y.n.3
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static int $10 = 0;
            private static int $11 = 0;

            /* JADX INFO: renamed from: d */
            private static char[] f27276d = null;

            /* JADX INFO: renamed from: e */
            private static char f27277e = 0;

            /* JADX INFO: renamed from: f */
            private static int f27278f = 0;

            /* JADX INFO: renamed from: g */
            private static int f27279g = 0;

            /* JADX INFO: renamed from: a */
            private /* synthetic */ o.eo.e f27280a;

            /* JADX INFO: renamed from: b */
            private /* synthetic */ Context f27281b;

            private static String $$c(short v2, int v3, short v4) {
                /*
                    int r0 = r10 * 2
                    int r8 = 1 - r0
                    byte[] r7 = o.y.n.AnonymousClass3.$$a
                    int r0 = r11 * 2
                    int r6 = 4 - r0
                    int r5 = 111 - r9
                    byte[] r4 = new byte[r8]
                    r3 = 0
                    if (r7 != 0) goto L28
                    r0 = r6
                    r2 = r3
                L13:
                    int r6 = r6 + 1
                    int r5 = r5 + r0
                L16:
                    byte r0 = (byte) r5
                    r4[r2] = r0
                    int r2 = r2 + 1
                    if (r2 != r8) goto L23
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r4, r3)
                    return r0
                L23:
                    r1 = r7[r6]
                    r0 = r5
                    r5 = r1
                    goto L13
                L28:
                    r2 = r3
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: o.y.n.AnonymousClass3.$$c(short, int, short):java.lang.String");
            }

            static {
                init$0();
                $10 = 0;
                $11 = 1;
                f27279g = 0;
                f27278f = 1;
                f27276d = new char[]{64586, 64576, 64608, 64629, 64580, 64521, 64587, 65470, 64583, 64598, 64582, 64618, 64630, 64588, 64520, 64543, 64611, 64578, 64579, 64625, 65469, 64609, 64614, 64594, 65471, 64620, 64592, 64624, 64597, 64599, 64585, 64593, 64517, 64584, 64577, 64581};
                f27277e = (char) 51641;
            }

            AnonymousClass3(o.eo.e eVarJ2, Context context2) {
                eVar = eVarJ2;
                context = context2;
            }

            private static void h(int i22, String str, byte b2, Object[] objArr3) throws Throwable {
                int i32;
                int i42;
                String str2 = str;
                int i52 = 2;
                int i62 = 2 % 2;
                int i7 = $11;
                int i8 = i7 + 1;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                Object charArray = str2;
                if (str2 != null) {
                    int i10 = i7 + 103;
                    $10 = i10 % 128;
                    if (i10 % 2 != 0) {
                        int i11 = 31 / 0;
                        charArray = str2.toCharArray();
                    } else {
                        charArray = str2.toCharArray();
                    }
                }
                char[] cArr = (char[]) charArray;
                o.a.h hVar = new o.a.h();
                char[] cArr2 = f27276d;
                int i12 = 421932776;
                int i13 = 8;
                int i14 = 9;
                if (cArr2 != null) {
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    int i15 = 0;
                    while (i15 < length) {
                        int i16 = $11 + 1;
                        $10 = i16 % 128;
                        if (i16 % i52 != 0) {
                            try {
                                Object[] objArr22 = {Integer.valueOf(cArr2[i15])};
                                Object objA = o.d.d.a(i12);
                                if (objA == null) {
                                    byte b3 = (byte) i14;
                                    byte b4 = (byte) 0;
                                    objA = o.d.d.a((ViewConfiguration.getTouchSlop() >> i13) + 270, (char) (ViewConfiguration.getScrollBarSize() >> 8), Gravity.getAbsoluteGravity(0, 0) + 11, -811348851, false, $$c(b3, b4, b4), new Class[]{Integer.TYPE});
                                }
                                cArr3[i15] = ((Character) ((Method) objA).invoke(null, objArr22)).charValue();
                                i52 = 2;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            Object[] objArr32 = {Integer.valueOf(cArr2[i15])};
                            Object objA2 = o.d.d.a(i12);
                            if (objA2 == null) {
                                byte b5 = (byte) 0;
                                objA2 = o.d.d.a((ViewConfiguration.getDoubleTapTimeout() >> 16) + 270, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 12 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), -811348851, false, $$c((byte) 9, b5, b5), new Class[]{Integer.TYPE});
                            }
                            cArr3[i15] = ((Character) ((Method) objA2).invoke(null, objArr32)).charValue();
                            i15++;
                            i52 = 2;
                            i12 = 421932776;
                        }
                        i13 = 8;
                        i14 = 9;
                    }
                    cArr2 = cArr3;
                }
                Object[] objArr4 = {Integer.valueOf(f27277e)};
                Object objA3 = o.d.d.a(421932776);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    objA3 = o.d.d.a(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 271, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 11 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -811348851, false, $$c((byte) 9, b6, b6), new Class[]{Integer.TYPE});
                }
                char cCharValue = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                char[] cArr4 = new char[i22];
                if (i22 % 2 != 0) {
                    i32 = i22 - 1;
                    cArr4[i32] = (char) (cArr[i32] - b2);
                } else {
                    i32 = i22;
                }
                int i17 = 1;
                if (i32 > 1) {
                    hVar.f19926b = 0;
                    while (hVar.f19926b < i32) {
                        hVar.f19927c = cArr[hVar.f19926b];
                        hVar.f19925a = cArr[hVar.f19926b + i17];
                        if (hVar.f19927c == hVar.f19925a) {
                            int i18 = $11 + 95;
                            $10 = i18 % 128;
                            int i19 = i18 % 2;
                            cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                            cArr4[hVar.f19926b + 1] = (char) (hVar.f19925a - b2);
                            i42 = 2;
                            i17 = 1;
                        } else {
                            Object[] objArr5 = {hVar, hVar, Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), hVar};
                            Object objA4 = o.d.d.a(219124184);
                            if (objA4 == null) {
                                byte b7 = (byte) 0;
                                byte b8 = b7;
                                objA4 = o.d.d.a(Color.argb(0, 0, 0, 0) + 825, (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), 11 - TextUtils.getTrimmedLength(""), -611683395, false, $$c(b7, b8, b8), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objA4).invoke(null, objArr5)).intValue() == hVar.f19930g) {
                                Object[] objArr6 = {hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, Integer.valueOf(cCharValue), hVar};
                                Object objA5 = o.d.d.a(-634864343);
                                if (objA5 == null) {
                                    byte b9 = (byte) 2;
                                    byte b10 = (byte) (b9 - 2);
                                    objA5 = o.d.d.a(219 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 11 - View.getDefaultSize(0, 0), 212688716, false, $$c(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                int iIntValue = ((Integer) ((Method) objA5).invoke(null, objArr6)).intValue();
                                int i20 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                                cArr4[hVar.f19926b] = cArr2[iIntValue];
                                cArr4[hVar.f19926b + 1] = cArr2[i20];
                            } else if (hVar.f19928d == hVar.f19929e) {
                                hVar.f19931i = ((hVar.f19931i + cCharValue) - 1) % cCharValue;
                                hVar.f19930g = ((hVar.f19930g + cCharValue) - 1) % cCharValue;
                                int i21 = (hVar.f19928d * cCharValue) + hVar.f19931i;
                                int i222 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                                cArr4[hVar.f19926b] = cArr2[i21];
                                cArr4[hVar.f19926b + 1] = cArr2[i222];
                            } else {
                                int i23 = (hVar.f19928d * cCharValue) + hVar.f19930g;
                                int i24 = (hVar.f19929e * cCharValue) + hVar.f19931i;
                                cArr4[hVar.f19926b] = cArr2[i23];
                                i17 = 1;
                                cArr4[hVar.f19926b + 1] = cArr2[i24];
                                int i25 = $11 + 3;
                                $10 = i25 % 128;
                                i42 = 2;
                                int i26 = i25 % 2;
                            }
                            i42 = 2;
                            i17 = 1;
                        }
                        hVar.f19926b += i42;
                    }
                }
                int i27 = 0;
                while (i27 < i22) {
                    int i28 = $10 + 53;
                    $11 = i28 % 128;
                    if (i28 % 2 == 0) {
                        cArr4[i27] = (char) (cArr4[i27] ^ 23880);
                        i27 += 51;
                    } else {
                        cArr4[i27] = (char) (cArr4[i27] ^ 13722);
                        i27++;
                    }
                }
                objArr3[0] = new String(cArr4);
            }

            static void init$0() {
                $$a = new byte[]{121, Base64.padSymbol, 92, -93};
                $$b = 81;
            }

            @Override // o.aq.b.a
            public final void b(Map<o.ex.c, Object> map, String str, Date date) throws Throwable {
                int i22 = 2 % 2;
                int i32 = f27279g + 15;
                f27278f = i32 % 128;
                if (i32 % 2 == 0) {
                    o.ea.f.a();
                    throw null;
                }
                if (o.ea.f.a()) {
                    Object[] objArr3 = new Object[1];
                    h(53 - TextUtils.indexOf("", "", 0, 0), "\u0018\u0007\u0007\u0000\u0018\u0011\u0004\u0007\u001b\u0018\u0003\u0013\u000e\f\u0013\u0001\u0000\"\u001c\n\u001c#\u001c\u001d\u0004\n\u0001\u0007\u0017\u0019\u0000\n\n\u0003\u0007\"\f\u0001\n\u0012\u0006\f#\u0019\u0006\u0000\u0005\u001b\u0004\u0006\u0003\u0007㘼", (byte) (83 - Color.alpha(0)), objArr3);
                    String strIntern2 = ((String) objArr3[0]).intern();
                    StringBuilder sb = new StringBuilder();
                    Object[] objArr22 = new Object[1];
                    h(82 - (ViewConfiguration.getScrollDefaultDelay() >> 16), "\u0018\u001b\t\u0000\u0018\u0005\u0007\u0004㘌㘌\u0002\u0014\u001e\u0002\n\u0012\u0019\u0005\u0001\"\u0005\u0007\u0018\u001c\"\u0004\u0001\"\u0007\u0019\u001c\u0005\u0007\n\n\u0010\u0001\u0013\u0006\f\u0012\u0004\u0007\u001e\u0018\u0005\u0000\u0012\u001c\b\u0007\u0004㘌㘌\u0002#\u0007\u0000\u0014#\u0017\u0019\u0000\n\n\u0003\u0007\"\f\u0001\n\u0012\u0006\f#\u0019\u0006\u0000\b!\u000e!", (byte) (35 - (ViewConfiguration.getScrollBarSize() >> 8)), objArr22);
                    o.ea.f.c(strIntern2, sb.append(((String) objArr22[0]).intern()).append(str).toString());
                }
                ArrayList arrayList = new ArrayList();
                o.ex.c[] cVarArrValues = o.ex.c.values();
                int i42 = f27278f + 103;
                f27279g = i42 % 128;
                int i52 = i42 % 2;
                for (o.ex.c cVar : cVarArrValues) {
                    arrayList.add(new o.ex.b(map.get(cVar), cVar, Boolean.TRUE, ((c) n.this).f27088r));
                }
                eVar.d(context, ((c) n.this).f27088r.b(), arrayList, date);
                if (n.c(n.this) != null) {
                    n.a(n.this).onProcessSuccess();
                    int i62 = f27279g + 47;
                    f27278f = i62 % 128;
                    int i7 = i62 % 2;
                }
            }

            @Override // o.aq.b.a
            public final void d(o.bg.c cVar) throws Throwable {
                int i22 = 2 % 2;
                o.by.c cVarB = o.by.c.b(cVar);
                if (o.ea.f.a()) {
                    Object[] objArr3 = new Object[1];
                    h(52 - ImageFormat.getBitsPerPixel(0), "\u0018\u0007\u0007\u0000\u0018\u0011\u0004\u0007\u001b\u0018\u0003\u0013\u000e\f\u0013\u0001\u0000\"\u001c\n\u001c#\u001c\u001d\u0004\n\u0001\u0007\u0017\u0019\u0000\n\n\u0003\u0007\"\f\u0001\n\u0012\u0006\f#\u0019\u0006\u0000\u0005\u001b\u0004\u0006\u0003\u0007㘼", (byte) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 83), objArr3);
                    String strIntern2 = ((String) objArr3[0]).intern();
                    StringBuilder sb = new StringBuilder();
                    Object[] objArr22 = new Object[1];
                    h(56 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "\u0018\u001b\t\u0000\u0018\u0005\u0007\u0004㘃㘃\u0002\u0014\u001e\u0002\n\u0012\u0019\u0005\u0001\"\u0005\u0007\u0018\u001c\"\u0004\u0001\"\u0007\u0019\u001c\u0005\u0007\n\n\u0010\u0001\u0013\u0006\f\u0012\u0004\u0007\u001e\u0018\u0005\"\f\u0001\u0010 \u0018\u0019\u0005\u0002\u0014㗔", (byte) (26 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), objArr22);
                    o.ea.f.c(strIntern2, sb.append(((String) objArr22[0]).intern()).append(cVarB).toString());
                    int i32 = f27279g + 75;
                    f27278f = i32 % 128;
                    int i42 = i32 % 2;
                }
                if (n.d(n.this) != null) {
                    int i52 = f27278f + 45;
                    f27279g = i52 % 128;
                    int i62 = i52 % 2;
                    if (o.ea.f.a()) {
                        Object[] objArr32 = new Object[1];
                        h(53 - KeyEvent.keyCodeFromString(""), "\u0018\u0007\u0007\u0000\u0018\u0011\u0004\u0007\u001b\u0018\u0003\u0013\u000e\f\u0013\u0001\u0000\"\u001c\n\u001c#\u001c\u001d\u0004\n\u0001\u0007\u0017\u0019\u0000\n\n\u0003\u0007\"\f\u0001\n\u0012\u0006\f#\u0019\u0006\u0000\u0005\u001b\u0004\u0006\u0003\u0007㘼", (byte) (83 - View.MeasureSpec.makeMeasureSpec(0, 0)), objArr32);
                        String strIntern22 = ((String) objArr32[0]).intern();
                        StringBuilder sb2 = new StringBuilder();
                        Object[] objArr4 = new Object[1];
                        h(AndroidCharacter.getMirror('0') + 22, "\u0018\u001b\t\u0000\u0018\u0005\u0007\u0004㘙㘙\u0002\u0014\u001e\u0002\n\u0012\u0019\u0005\u0001\"\u0005\u0007\u0018\u001c\"\u0004\u0001\"\u0007\u0019\u001c\u0005\u0007\n\n\u0010\u0001\u0013\u0006\f\u0012\u0004\u0007\u001e\u0018\u0005\"\f\u0001\u0010 \u0018\u0019\u0005\u0002\u0014\u0002\b㘘㘘\u0005\u0018\u0012\u0004\u001f\u0004!\u000e㗪㗪", (byte) (TextUtils.getTrimmedLength("") + 48), objArr4);
                        o.ea.f.d(strIntern22, sb2.append(((String) objArr4[0]).intern()).append(cVar.c()).toString());
                    }
                    if (cVar.c() != o.bg.a.az) {
                        n.j(n.this).onError(cVarB);
                    } else {
                        n.e(n.this);
                        n.b(n.this).onAuthenticationDeclined();
                    }
                }
            }
        }, bVar);
        List<o.ex.b<?>> listJ = eVarJ2.e().j(((c) this).f27088r.b());
        if (!listJ.isEmpty()) {
            Object[] objArr3 = {eVarJ2.e(), ((c) this).f27088r.b()};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i7 = o.eo.c.f24259d * (-1919265164);
            o.eo.c.f24259d = i7;
            int i8 = o.eo.c.f24258c * (-869862370);
            o.eo.c.f24258c = i8;
            Long l2 = (Long) o.eo.c.a((int) Runtime.getRuntime().freeMemory(), objArr3, i8, 523744759, -523744758, iElapsedRealtime, i7);
            if (l2 == null) {
                if (o.ea.f.a()) {
                    int i9 = f27271x + 111;
                    f27272y = i9 % 128;
                    if (i9 % 2 != 0) {
                        Object[] objArr4 = new Object[1];
                        B((char) (32339 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 10418 << (SystemClock.uptimeMillis() > 1L ? 1 : (SystemClock.uptimeMillis() == 1L ? 0 : -1)), TextUtils.getCapsMode("", 0, 1) + 21, objArr4);
                        obj = objArr4[0];
                    } else {
                        Object[] objArr5 = new Object[1];
                        B((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 29427), 164 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), TextUtils.getCapsMode("", 0, 0) + 71, objArr5);
                        obj = objArr5[0];
                    }
                    o.ea.f.c(strIntern, ((String) obj).intern());
                }
            } else {
                if (l2.longValue() >= System.currentTimeMillis() - 10000) {
                    int i10 = f27272y + 99;
                    f27271x = i10 % 128;
                    if (i10 % 2 == 0) {
                        o.ea.f.a();
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    if (o.ea.f.a()) {
                        Object[] objArr6 = new Object[1];
                        B((char) (Process.getGidForName("") + 1), 319 - TextUtils.getOffsetAfter("", 0), 97 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr6);
                        o.ea.f.c(strIntern, ((String) objArr6[0]).intern());
                    }
                    Map<o.ex.c, Object> mapB = b(listJ, this.f27273o);
                    Pair<Boolean, String> pairB = b(mapB);
                    if (((Boolean) pairB.first).booleanValue()) {
                        bVar2.e(((c) this).f27088r.b(), mapB, dVar, g());
                        return;
                    } else {
                        if (i() != null) {
                            i().onError(new o.by.c(AntelopErrorCode.OperationRefused, (String) pairB.second));
                            return;
                        }
                        return;
                    }
                }
                if (o.ea.f.a()) {
                    Object[] objArr7 = new Object[1];
                    B((char) (TextUtils.lastIndexOf("", '0') + 1), 234 - (ViewConfiguration.getScrollBarSize() >> 8), 85 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr7);
                    o.ea.f.c(strIntern, ((String) objArr7[0]).intern());
                }
                int i11 = f27272y + 75;
                f27271x = i11 % 128;
                int i12 = i11 % 2;
            }
        } else if (o.ea.f.a()) {
            int i13 = f27271x + 123;
            f27272y = i13 % 128;
            if (i13 % 2 != 0) {
                Object[] objArr8 = new Object[1];
                B((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) * 22992), 45 % MotionEvent.axisFromString(""), 113 / KeyEvent.normalizeMetaState(0), objArr8);
                obj2 = objArr8[0];
            } else {
                Object[] objArr9 = new Object[1];
                B((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 10985), MotionEvent.axisFromString("") + 82, KeyEvent.normalizeMetaState(0) + 82, objArr9);
                obj2 = objArr9[0];
            }
            o.ea.f.c(strIntern, ((String) obj2).intern());
        }
        if (o.ea.f.a()) {
            Object[] objArr10 = new Object[1];
            B((char) (32879 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), TextUtils.getTrimmedLength("") + HttpStatus.SC_EXPECTATION_FAILED, 54 - ExpandableListView.getPackedPositionChild(0L), objArr10);
            o.ea.f.c(strIntern, ((String) objArr10[0]).intern());
            int i14 = f27271x + 71;
            f27272y = i14 % 128;
            int i15 = i14 % 2;
        }
        try {
            eVarJ2.b(context2, ((c) this).f27088r.b(), new e.d<o.ex.b<?>>() { // from class: o.y.n.4
                private static final byte[] $$a = null;
                private static final int $$b = 0;
                private static final byte[] $$c = null;
                private static final int $$d = 0;
                private static int $10 = 0;
                private static int $11 = 0;

                /* JADX INFO: renamed from: b */
                private static char f27283b = 0;

                /* JADX INFO: renamed from: d */
                private static char f27284d = 0;

                /* JADX INFO: renamed from: f */
                private static int f27285f = 0;

                /* JADX INFO: renamed from: g */
                private static char[] f27286g = null;

                /* JADX INFO: renamed from: h */
                private static int f27287h = 0;

                /* JADX INFO: renamed from: i */
                private static char f27288i = 0;

                /* JADX INFO: renamed from: j */
                private static char f27289j = 0;

                /* JADX INFO: renamed from: k */
                public static int f27290k = 0;

                /* JADX INFO: renamed from: l */
                public static int f27291l = 0;

                /* JADX INFO: renamed from: m */
                public static int f27292m = 0;

                /* JADX INFO: renamed from: n */
                public static int f27293n = 0;

                /* JADX INFO: renamed from: a */
                private /* synthetic */ o.aq.b f27294a;

                /* JADX INFO: renamed from: c */
                private /* synthetic */ o.i.d f27295c;

                private static String $$e(int v2, int v3, byte v4) {
                    /*
                        int r7 = r10 + 69
                        byte[] r6 = o.y.n.AnonymousClass4.$$c
                        int r0 = r9 * 4
                        int r5 = 4 - r0
                        int r1 = r8 * 3
                        int r0 = 1 - r1
                        byte[] r4 = new byte[r0]
                        r3 = 0
                        int r2 = 0 - r1
                        if (r6 != 0) goto L28
                        r0 = r5
                        r1 = r3
                    L15:
                        int r5 = r5 + 1
                        int r7 = r7 + r0
                    L18:
                        byte r0 = (byte) r7
                        r4[r1] = r0
                        if (r1 != r2) goto L23
                        java.lang.String r0 = new java.lang.String
                        r0.<init>(r4, r3)
                        return r0
                    L23:
                        int r1 = r1 + 1
                        r0 = r6[r5]
                        goto L15
                    L28:
                        r1 = r3
                        goto L18
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.y.n.AnonymousClass4.$$e(int, int, byte):java.lang.String");
                }

                static {
                    init$1();
                    $10 = 0;
                    $11 = 1;
                    f27293n = 2140165657;
                    f27292m = 585615565;
                    f27291l = -3680986;
                    f27290k = 1738603325;
                    init$0();
                    f27285f = 0;
                    f27287h = 1;
                    f27284d = (char) 2352;
                    f27283b = (char) 61228;
                    f27288i = (char) 54958;
                    f27289j = (char) 62515;
                    f27286g = new char[]{56477, 56493, 56521, 56560, 56560, 56562, 56555, 56514, 56518, 56557, 56560, 56563, 56561, 56558, 56537, 56536, 56558, 56556, 56558, 56555, 56546, 56554, 56560, 56551, 56553, 56547, 56540, 56557, 56557, 56551, 56557, 56563, 56556, 56555, 56521, 56486, 56486, 56521, 56563, 56556, 56548, 56553, 56560, 56545, 56543, 56561, 56563, 56528, 56345, 56340, 56341, 56348, 56345, 56337, 56322, 56329, 56350, 56328, 56324, 56344, 56345, 56348, 56348, 56339, 56346, 56472};
                }

                AnonymousClass4(o.aq.b bVar22, o.i.d dVar2) {
                    bVar = bVar22;
                    dVar = dVar2;
                }

                /* JADX WARN: Not initialized variable reg: 7, insn: 0x0171: ARITH (r8 I:??[int, boolean]) = (r7 I:??[int, boolean, short, byte, char]) ^ (2 ??[int, float, short, byte, char]), block:B:106:0x0171 */
                /* JADX WARN: Removed duplicated region for block: B:162:0x0553  */
                /* JADX WARN: Removed duplicated region for block: B:167:0x05cd  */
                /* JADX WARN: Removed duplicated region for block: B:179:0x04f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public static java.lang.Object[] d(int r24, int r25) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instruction units count: 1595
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.y.n.AnonymousClass4.d(int, int):java.lang.Object[]");
                }

                static void init$0() {
                    $$a = new byte[]{103, 35, 47, 90};
                    $$b = 191;
                }

                static void init$1() {
                    $$c = new byte[]{112, 68, MessagePack.Code.BIN8, -81};
                    $$d = 49;
                }

                private static void o(String str, int i22, Object[] objArr11) throws Throwable {
                    int i32;
                    String str2 = str;
                    int i42 = 2 % 2;
                    int i52 = $11;
                    int i62 = i52 + 41;
                    $10 = i62 % 128;
                    Object charArray = str2;
                    if (i62 % 2 != 0) {
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                    if (str2 != null) {
                        int i72 = i52 + 115;
                        $10 = i72 % 128;
                        int i82 = i72 % 2;
                        charArray = str2.toCharArray();
                    }
                    char[] cArr = (char[]) charArray;
                    o.a.g gVar = new o.a.g();
                    char[] cArr2 = new char[cArr.length];
                    gVar.f19924d = 0;
                    char[] cArr3 = new char[2];
                    int i92 = $10 + 13;
                    $11 = i92 % 128;
                    int i102 = i92 % 2;
                    while (gVar.f19924d < cArr.length) {
                        int i112 = $10 + 75;
                        $11 = i112 % 128;
                        int i122 = 58224;
                        if (i112 % 2 == 0) {
                            cArr3[0] = cArr[gVar.f19924d];
                            cArr3[1] = cArr[gVar.f19924d / 0];
                            i32 = 1;
                        } else {
                            cArr3[0] = cArr[gVar.f19924d];
                            cArr3[1] = cArr[gVar.f19924d + 1];
                            i32 = 0;
                        }
                        while (i32 < 16) {
                            char c2 = cArr3[1];
                            char c3 = cArr3[0];
                            try {
                                Object[] objArr22 = {Integer.valueOf(c2), Integer.valueOf((c3 + i122) ^ ((c3 << 4) + ((char) (((long) f27288i) ^ (-7511683281764982996L))))), Integer.valueOf(c3 >>> 5), Integer.valueOf(f27289j)};
                                Object objA = o.d.d.a(1603517628);
                                if (objA == null) {
                                    byte b2 = (byte) 0;
                                    byte b3 = b2;
                                    objA = o.d.d.a((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 270, (char) TextUtils.indexOf("", ""), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 11, -1995022631, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                                }
                                char cCharValue = ((Character) ((Method) objA).invoke(null, objArr22)).charValue();
                                cArr3[1] = cCharValue;
                                Object[] objArr32 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i122) ^ ((cCharValue << 4) + ((char) (((long) f27284d) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f27283b)};
                                Object objA2 = o.d.d.a(1603517628);
                                if (objA2 == null) {
                                    byte b4 = (byte) 0;
                                    byte b5 = b4;
                                    objA2 = o.d.d.a((-16776946) - Color.rgb(0, 0, 0), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 11 - ((Process.getThreadPriority(0) + 20) >> 6), -1995022631, false, $$e(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                                }
                                cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr32)).charValue();
                                i122 -= 40503;
                                i32++;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        cArr2[gVar.f19924d] = cArr3[0];
                        cArr2[gVar.f19924d + 1] = cArr3[1];
                        Object[] objArr42 = {gVar, gVar};
                        Object objA3 = o.d.d.a(1390051551);
                        if (objA3 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objA3 = o.d.d.a((Process.myTid() >> 22) + 270, (char) (AndroidCharacter.getMirror('0') - '0'), TextUtils.lastIndexOf("", '0', 0, 0) + 12, -2074123590, false, $$e(b6, b7, (byte) (b7 + 3)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA3).invoke(null, objArr42);
                    }
                    objArr11[0] = new String(cArr2, 0, i22);
                }

                private static void p(String str, int[] iArr, boolean z2, Object[] objArr11) throws Throwable {
                    char[] cArr;
                    String str2 = str;
                    int i22 = 2;
                    int i32 = 2 % 2;
                    Object bytes = str2;
                    if (str2 != null) {
                        bytes = str2.getBytes("ISO-8859-1");
                    }
                    byte[] bArr = (byte[]) bytes;
                    o.a.m mVar = new o.a.m();
                    int i42 = 0;
                    int i52 = iArr[0];
                    int i62 = iArr[1];
                    int i72 = iArr[2];
                    int i82 = iArr[3];
                    char[] cArr2 = f27286g;
                    long j2 = 0;
                    if (cArr2 != null) {
                        int length = cArr2.length;
                        char[] cArr3 = new char[length];
                        while (i42 < length) {
                            int i92 = $11 + 65;
                            $10 = i92 % 128;
                            if (i92 % i22 != 0) {
                                try {
                                    Object[] objArr22 = {Integer.valueOf(cArr2[i42])};
                                    Object objA = o.d.d.a(-2071388435);
                                    if (objA == null) {
                                        byte b2 = (byte) 0;
                                        byte b3 = b2;
                                        objA = o.d.d.a((SystemClock.elapsedRealtime() > j2 ? 1 : (SystemClock.elapsedRealtime() == j2 ? 0 : -1)) + 248, (char) (ExpandableListView.getPackedPositionForGroup(0) > j2 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j2 ? 0 : -1)), TextUtils.getTrimmedLength("") + 11, 1376582792, false, $$e(b2, b3, (byte) ((b3 + 47) - (b3 & 47))), new Class[]{Integer.TYPE});
                                    }
                                    cArr3[i42] = ((Character) ((Method) objA).invoke(null, objArr22)).charValue();
                                } catch (Throwable th) {
                                    Throwable cause = th.getCause();
                                    if (cause == null) {
                                        throw th;
                                    }
                                    throw cause;
                                }
                            } else {
                                Object[] objArr32 = {Integer.valueOf(cArr2[i42])};
                                Object objA2 = o.d.d.a(-2071388435);
                                if (objA2 == null) {
                                    byte b4 = (byte) 0;
                                    byte b5 = b4;
                                    objA2 = o.d.d.a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 249, (char) Color.green(0), KeyEvent.normalizeMetaState(0) + 11, 1376582792, false, $$e(b4, b5, (byte) (47 | b5)), new Class[]{Integer.TYPE});
                                }
                                cArr3[i42] = ((Character) ((Method) objA2).invoke(null, objArr32)).charValue();
                                i42++;
                            }
                            i22 = 2;
                            j2 = 0;
                        }
                        cArr2 = cArr3;
                    }
                    char[] cArr4 = new char[i62];
                    System.arraycopy(cArr2, i52, cArr4, 0, i62);
                    if (bArr != null) {
                        int i102 = $11 + 23;
                        $10 = i102 % 128;
                        int i112 = i102 % 2;
                        char[] cArr5 = new char[i62];
                        mVar.f19943d = 0;
                        char c2 = 0;
                        while (mVar.f19943d < i62) {
                            int i122 = $11 + 85;
                            $10 = i122 % 128;
                            if (i122 % 2 == 0 ? bArr[mVar.f19943d] != 1 : bArr[mVar.f19943d] != 0) {
                                int i132 = mVar.f19943d;
                                Object[] objArr42 = {Integer.valueOf(cArr4[mVar.f19943d]), Integer.valueOf(c2)};
                                Object objA3 = o.d.d.a(1632715197);
                                if (objA3 == null) {
                                    byte b6 = (byte) 0;
                                    byte b7 = b6;
                                    objA3 = o.d.d.a((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 836, (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 27279), 10 - ExpandableListView.getPackedPositionChild(0L), -1210801192, false, $$e(b6, b7, (byte) ((b7 + 51) - (51 & b7))), new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr5[i132] = ((Character) ((Method) objA3).invoke(null, objArr42)).charValue();
                            } else {
                                int i142 = $10 + 39;
                                $11 = i142 % 128;
                                if (i142 % 2 == 0) {
                                    int i152 = mVar.f19943d;
                                    Object[] objArr52 = {Integer.valueOf(cArr4[mVar.f19943d]), Integer.valueOf(c2)};
                                    Object objA4 = o.d.d.a(120026474);
                                    if (objA4 == null) {
                                        objA4 = o.d.d.a(11 - (Process.myTid() >> 22), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 10 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                                    }
                                    cArr5[i152] = ((Character) ((Method) objA4).invoke(null, objArr52)).charValue();
                                    int i16 = 92 / 0;
                                } else {
                                    int i17 = mVar.f19943d;
                                    Object[] objArr62 = {Integer.valueOf(cArr4[mVar.f19943d]), Integer.valueOf(c2)};
                                    Object objA5 = o.d.d.a(120026474);
                                    if (objA5 == null) {
                                        objA5 = o.d.d.a(11 - KeyEvent.getDeadChar(0, 0), (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 10 - TextUtils.indexOf("", ""), -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                                    }
                                    cArr5[i17] = ((Character) ((Method) objA5).invoke(null, objArr62)).charValue();
                                }
                            }
                            c2 = cArr5[mVar.f19943d];
                            Object[] objArr72 = {mVar, mVar};
                            Object objA6 = o.d.d.a(-1041906996);
                            if (objA6 == null) {
                                objA6 = o.d.d.a((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 20, (char) (35715 - View.MeasureSpec.getSize(0)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 10, 392175785, false, "v", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objA6).invoke(null, objArr72);
                        }
                        cArr4 = cArr5;
                    }
                    if (i82 > 0) {
                        char[] cArr6 = new char[i62];
                        System.arraycopy(cArr4, 0, cArr6, 0, i62);
                        int i18 = i62 - i82;
                        System.arraycopy(cArr6, 0, cArr4, i18, i82);
                        System.arraycopy(cArr6, i82, cArr4, 0, i18);
                        int i19 = $10 + 109;
                        $11 = i19 % 128;
                        int i20 = i19 % 2;
                    }
                    int i21 = 1;
                    if (z2) {
                        int i222 = $10 + 111;
                        $11 = i222 % 128;
                        if (i222 % 2 == 0) {
                            cArr = new char[i62];
                            mVar.f19943d = 1;
                        } else {
                            cArr = new char[i62];
                            mVar.f19943d = 0;
                        }
                        while (mVar.f19943d < i62) {
                            cArr[mVar.f19943d] = cArr4[(i62 - mVar.f19943d) - i21];
                            mVar.f19943d += i21;
                            i21 = 1;
                        }
                        cArr4 = cArr;
                    }
                    if (i72 > 0) {
                        int i23 = $11 + 17;
                        $10 = i23 % 128;
                        char c3 = 2;
                        int i24 = i23 % 2;
                        mVar.f19943d = 0;
                        while (mVar.f19943d < i62) {
                            cArr4[mVar.f19943d] = (char) (cArr4[mVar.f19943d] - iArr[c3]);
                            mVar.f19943d++;
                            c3 = 2;
                        }
                    }
                    String str3 = new String(cArr4);
                    int i25 = $10 + 89;
                    $11 = i25 % 128;
                    if (i25 % 2 == 0) {
                        throw null;
                    }
                    objArr11[0] = str3;
                }

                private static void q(byte v2, short v3, int v4, Object[] v5) {
                    /*
                        int r0 = r10 * 4
                        int r7 = 4 - r0
                        byte[] r6 = o.y.n.AnonymousClass4.$$a
                        int r0 = r8 * 4
                        int r5 = r0 + 1
                        int r0 = r9 * 4
                        int r4 = 100 - r0
                        byte[] r3 = new byte[r5]
                        r2 = 0
                        if (r6 != 0) goto L2b
                        r0 = r5
                        r1 = r2
                    L15:
                        int r0 = -r0
                        int r4 = r4 + r0
                        int r7 = r7 + 1
                    L19:
                        byte r0 = (byte) r4
                        r3[r1] = r0
                        int r1 = r1 + 1
                        if (r1 != r5) goto L28
                        java.lang.String r0 = new java.lang.String
                        r0.<init>(r3, r2)
                        r11[r2] = r0
                        return
                    L28:
                        r0 = r6[r7]
                        goto L15
                    L2b:
                        r1 = r2
                        goto L19
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.y.n.AnonymousClass4.q(byte, short, int, java.lang.Object[]):void");
                }

                @Override // o.eo.e.d
                public final void a(o.by.c cVar) throws Throwable {
                    int i22 = 2 % 2;
                    int i32 = f27287h + 23;
                    f27285f = i32 % 128;
                    if (i32 % 2 != 0) {
                        o.ea.f.a();
                        throw null;
                    }
                    if (o.ea.f.a()) {
                        Object[] objArr11 = new Object[1];
                        o("⌌V\uf205\udac2⣇ګ倂ꎝ踗捧왧㻭澄\ude5d䪯\udbbf嘿ቀ\ude52\ue3dfᝈ蹵\uf7de忘ₐ燴\uec7a暜秨씦\udc50ꮝ⯀鹡ᮐྒ실\ue573ꕉ怢ᯀ䎺㞡냩→Ἱ⊑㙐\ue4ca蟐앮賧鞪ꤌ", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 53, objArr11);
                        String strIntern2 = ((String) objArr11[0]).intern();
                        StringBuilder sb = new StringBuilder();
                        Object[] objArr22 = new Object[1];
                        p("\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001", new int[]{0, 47, 0, 0}, true, objArr22);
                        o.ea.f.d(strIntern2, sb.append(((String) objArr22[0]).intern()).append(cVar.d()).toString());
                    }
                    int i42 = f27285f + 39;
                    f27287h = i42 % 128;
                    int i52 = i42 % 2;
                }

                @Override // o.eo.e.d
                public final void d(List<o.ex.b<?>> list) throws Throwable {
                    int i22 = 2 % 2;
                    Map<o.ex.c, Object> mapB2 = n.b(list, n.this.f27273o);
                    Pair<Boolean, String> pairB2 = n.b(mapB2);
                    if (!((Boolean) pairB2.first).booleanValue()) {
                        if (n.h(n.this) != null) {
                            n.i(n.this).onError(new o.by.c(AntelopErrorCode.OperationRefused, (String) pairB2.second));
                        }
                        int i32 = f27285f + 49;
                        f27287h = i32 % 128;
                        int i42 = i32 % 2;
                        return;
                    }
                    int i52 = f27287h + 9;
                    f27285f = i52 % 128;
                    if (i52 % 2 == 0) {
                        bVar.e(((c) n.this).f27088r.b(), mapB2, dVar, n.this.g());
                        return;
                    }
                    bVar.e(((c) n.this).f27088r.b(), mapB2, dVar, n.this.g());
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
            });
        } catch (WalletValidationException e2) {
            if (o.ea.f.a()) {
                Object[] objArr11 = new Object[1];
                B((char) (1996 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), ExpandableListView.getPackedPositionType(0L) + 472, 76 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr11);
                o.ea.f.e(strIntern, ((String) objArr11[0]).intern(), e2);
            }
        }
    }
}
