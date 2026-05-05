package o.ar;

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
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import fr.antelop.sdk.TimePeriod;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;
import o.a.l;
import o.d.d;
import o.ea.f;
import o.ef.a;
import okio.Utf8;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class c {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f20584a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f20585b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f20586c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static byte[] f20587d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int[] f20588e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static short[] f20589f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f20590g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f20591h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f20592i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f20593j = 0;

    /* JADX INFO: renamed from: o.ar.c$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f20594a = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f20595c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final /* synthetic */ int[] f20596e;

        static {
            int[] iArr = new int[o.ex.c.values().length];
            f20596e = iArr;
            try {
                iArr[o.ex.c.f25549d.ordinal()] = 1;
                int i2 = f20595c + 87;
                f20594a = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20596e[o.ex.c.f25550e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20596e[o.ex.c.f25546a.ordinal()] = 3;
                int i5 = f20595c;
                int i6 = (i5 ^ 23) + ((i5 & 23) << 1);
                f20594a = i6 % 128;
                int i7 = i6 % 2;
                int i8 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20596e[o.ex.c.f25547b.ordinal()] = 4;
                int i9 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20596e[o.ex.c.f25548c.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20596e[o.ex.c.f25553h.ordinal()] = 6;
                int i10 = 2 % 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20596e[o.ex.c.f25555j.ordinal()] = 7;
                int i11 = f20595c;
                int i12 = (((-1) - (((-1) - i11) & ((-1) - 97))) << 1) - (i11 ^ 97);
                f20594a = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 4 / 4;
                } else {
                    int i14 = 2 % 2;
                }
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f20596e[o.ex.c.f25552g.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f20596e[o.ex.c.f25554i.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f20596e[o.ex.c.f25551f.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f20596e[o.ex.c.f25558m.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f20596e[o.ex.c.f25556k.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f20596e[o.ex.c.f25557l.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f20596e[o.ex.c.f25560o.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f20596e[o.ex.c.f25559n.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f20596e[o.ex.c.f25562q.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f20596e[o.ex.c.f25564s.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f20596e[o.ex.c.f25565t.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f20596e[o.ex.c.f25563r.ordinal()] = 19;
                int i15 = f20594a;
                int i16 = (i15 ^ 17) + (((17 + i15) - (17 | i15)) << 1);
                f20595c = i16 % 128;
                if (i16 % 2 != 0) {
                    int i17 = 4 / 2;
                } else {
                    int i18 = 2 % 2;
                }
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f20596e[o.ex.c.f25561p.ordinal()] = 20;
                int i19 = f20595c;
                int i20 = (i19 ^ PanasonicMakernoteDirectory.TAG_BURST_SPEED) + (((i19 + PanasonicMakernoteDirectory.TAG_BURST_SPEED) - (i19 | PanasonicMakernoteDirectory.TAG_BURST_SPEED)) << 1);
                f20594a = i20 % 128;
                if (i20 % 2 != 0) {
                    int i21 = 2 % 2;
                }
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f20596e[o.ex.c.f25570y.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f20596e[o.ex.c.f25567v.ordinal()] = 22;
                int i22 = 2 % 2;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f20596e[o.ex.c.f25566u.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f20596e[o.ex.c.f25569x.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f20596e[o.ex.c.f25568w.ordinal()] = 25;
                int i23 = f20595c + 3;
                f20594a = i23 % 128;
                if (i23 % 2 != 0) {
                    int i24 = 2 % 2;
                }
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f20596e[o.ex.c.B.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f20596e[o.ex.c.A.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r5, byte r6, int r7) {
        /*
            int r2 = r7 * 3
            int r1 = 1 - r2
            int r7 = 121 - r6
            int r0 = r5 * 4
            int r6 = r0 + 4
            byte[] r5 = o.ar.c.$$a
            byte[] r4 = new byte[r1]
            r3 = 0
            int r2 = 0 - r2
            if (r5 != 0) goto L29
            r0 = r6
            r1 = r3
        L15:
            int r6 = r6 + 1
            int r0 = -r0
            int r7 = r7 + r0
        L19:
            byte r0 = (byte) r7
            r4[r1] = r0
            if (r1 != r2) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L24:
            int r1 = r1 + 1
            r0 = r5[r6]
            goto L15
        L29:
            r1 = r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ar.c.$$c(byte, byte, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f20591h = 0;
        f20593j = 1;
        f20590g = 0;
        f20592i = 1;
        c();
        TextUtils.indexOf((CharSequence) "", '0');
        int i2 = f20591h + 53;
        f20593j = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 33 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Map<o.ex.c, Object> b(a aVar) throws Throwable {
        BigDecimal bigDecimalM;
        BigDecimal bigDecimalM2;
        Boolean boolI;
        a aVarV;
        a aVarV2;
        a aVarV3;
        a aVarV4;
        a aVarV5;
        a aVarV6;
        Boolean boolI2;
        Boolean boolI3;
        Integer[] numArr;
        String[] strArrY;
        Boolean boolI4;
        TimeZone timeZone;
        Boolean boolI5;
        Object objY;
        String strS;
        Object objM;
        Object objM2;
        String strS2;
        int i2 = 2 % 2;
        Object[] objArr = new Object[1];
        k((short) ((ViewConfiguration.getJumpTapTimeout() >> 16) - 31), (-2107305768) + (ViewConfiguration.getKeyRepeatDelay() >> 16), View.MeasureSpec.getMode(0) + 1356130019, (-121) - TextUtils.indexOf("", ""), (byte) (ImageFormat.getBitsPerPixel(0) + 1), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        k((short) (TextUtils.indexOf("", "", 0) + 89), (-2107305761) - TextUtils.lastIndexOf("", '0', 0, 0), 1356130018 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), AndroidCharacter.getMirror('0') - 169, (byte) TextUtils.indexOf("", "", 0, 0), objArr2);
        String strIntern2 = ((String) objArr2[0]).intern();
        if (f.a()) {
            Object[] objArr3 = new Object[1];
            l(new int[]{-1220424068, 1580500457, -1662551851, -1981629939, 1609284626, 782586989, -1652391137, 387099481, 138881731, 1993551278, -911753779, -356254066, 2076722043, -462777959, -1320508411, -838762289}, TextUtils.lastIndexOf("", '0', 0, 0) + 32, objArr3);
            String strIntern3 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            k((short) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 110), (-2107305670) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1356130021, (-121) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (byte) View.MeasureSpec.makeMeasureSpec(0, 0), objArr4);
            f.c(strIntern3, ((String) objArr4[0]).intern());
        }
        HashMap map = new HashMap();
        try {
            Object[] objArr5 = new Object[1];
            k((short) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 122), View.MeasureSpec.getMode(0) - 2107305695, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1356130024, (-121) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (byte) (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr5);
            a aVarV7 = aVar.v(((String) objArr5[0]).intern());
            Object[] objArr6 = new Object[1];
            l(new int[]{628375121, -236165012, -1662551851, -1981629939, 1109296235, 710332046, 365952757, -1043257113}, 15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr6);
            a aVarV8 = aVar.v(((String) objArr6[0]).intern());
            Object[] objArr7 = new Object[1];
            k((short) ((-124) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (-2107305689) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1356130024 - (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.indexOf((CharSequence) "", '0') - 120, (byte) TextUtils.indexOf("", "", 0, 0), objArr7);
            a aVarV9 = aVar.v(((String) objArr7[0]).intern());
            Object[] objArr8 = new Object[1];
            l(new int[]{-1566102995, 538798164, -483521741, -2108530333, 230128956, 1998380986}, 11 - ImageFormat.getBitsPerPixel(0), objArr8);
            a aVarV10 = aVar.v(((String) objArr8[0]).intern());
            Object[] objArr9 = new Object[1];
            k((short) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 69), (-2107305678) - (Process.myTid() >> 22), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1356130039, (-121) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (byte) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr9);
            a aVarV11 = aVar.v(((String) objArr9[0]).intern());
            o.ex.c cVar = o.ex.c.f25549d;
            Boolean boolI6 = null;
            if (aVarV7 != null) {
                int i3 = f20592i + 65;
                f20590g = i3 % 128;
                if (i3 % 2 != 0) {
                    aVarV7.i(strIntern);
                    throw null;
                }
                boolI6 = aVarV7.i(strIntern);
            } else {
                int i4 = f20592i + 109;
                f20590g = i4 % 128;
                int i5 = i4 % 2;
            }
            map.put(cVar, boolI6);
            o.ex.c cVar2 = o.ex.c.f25550e;
            if (aVarV7 != null) {
                Object[] objArr10 = new Object[1];
                l(new int[]{238748935, 1776703845, 1774803730, -160720478, -1279369915, 2077367486, -1123577793, -966389749}, 16 - (ViewConfiguration.getEdgeSlop() >> 16), objArr10);
                bigDecimalM = aVarV7.m(((String) objArr10[0]).intern());
            } else {
                bigDecimalM = null;
            }
            map.put(cVar2, bigDecimalM);
            o.ex.c cVar3 = o.ex.c.f25546a;
            if (aVarV7 != null) {
                Object[] objArr11 = new Object[1];
                l(new int[]{-534798925, 268280951, 905016341, -1140632789, 997811483, 1744261750, -393861412, -1441961470}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 13, objArr11);
                bigDecimalM2 = aVarV7.m(((String) objArr11[0]).intern());
            } else {
                bigDecimalM2 = null;
            }
            map.put(cVar3, bigDecimalM2);
            o.ex.c cVar4 = o.ex.c.f25547b;
            if (aVarV7 != null) {
                int i6 = f20590g + 109;
                f20592i = i6 % 128;
                int i7 = i6 % 2;
                Object[] objArr12 = new Object[1];
                l(new int[]{2079899423, -1206782244, 437374660, 677461368, -1814601198, 1133886286, 1579406091, -1893167522}, Process.getGidForName("") + 14, objArr12);
                boolI = aVarV7.i(((String) objArr12[0]).intern());
                int i8 = f20590g + 71;
                f20592i = i8 % 128;
                int i9 = i8 % 2;
            } else {
                boolI = null;
            }
            map.put(cVar4, boolI);
            if (aVarV8 != null) {
                Object[] objArr13 = new Object[1];
                k((short) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 65), (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 2107305752, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1356130018, (-122) - TextUtils.lastIndexOf("", '0', 0), (byte) (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr13);
                aVarV = aVarV8.v(((String) objArr13[0]).intern());
            } else {
                aVarV = null;
            }
            if (aVarV8 != null) {
                Object[] objArr14 = new Object[1];
                k((short) (4 - TextUtils.getOffsetBefore("", 0)), TextUtils.indexOf("", "", 0, 0) - 2107305749, 1356130035 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), View.MeasureSpec.getSize(0) - 121, (byte) TextUtils.getOffsetAfter("", 0), objArr14);
                aVarV2 = aVarV8.v(((String) objArr14[0]).intern());
            } else {
                aVarV2 = null;
            }
            if (aVarV8 != null) {
                Object[] objArr15 = new Object[1];
                k((short) ((-108) - (ViewConfiguration.getTouchSlop() >> 8)), (-2107305740) - (KeyEvent.getMaxKeyCode() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) + 1356130019, (-121) - Drawable.resolveOpacity(0, 0), (byte) ((-1) - ImageFormat.getBitsPerPixel(0)), objArr15);
                aVarV3 = aVarV8.v(((String) objArr15[0]).intern());
            } else {
                aVarV3 = null;
            }
            if (aVarV8 != null) {
                Object[] objArr16 = new Object[1];
                k((short) ((-36) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (-2107305725) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), Color.alpha(0) + 1356130020, (ViewConfiguration.getWindowTouchSlop() >> 8) - 121, (byte) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr16);
                aVarV4 = aVarV8.v(((String) objArr16[0]).intern());
            } else {
                aVarV4 = null;
            }
            if (aVarV8 != null) {
                Object[] objArr17 = new Object[1];
                k((short) (TextUtils.getOffsetAfter("", 0) - 63), (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 2107305715, 1356130021 - ((byte) KeyEvent.getModifierMetaStateMask()), ExpandableListView.getPackedPositionGroup(0L) - 121, (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), objArr17);
                aVarV5 = aVarV8.v(((String) objArr17[0]).intern());
            } else {
                aVarV5 = null;
            }
            if (aVarV8 != null) {
                Object[] objArr18 = new Object[1];
                k((short) ((ViewConfiguration.getLongPressTimeout() >> 16) + 4), (-2107305706) - (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.getTrimmedLength("") + 1356130020, (-121) - View.resolveSize(0, 0), (byte) ((-1) - TextUtils.lastIndexOf("", '0')), objArr18);
                aVarV6 = aVarV8.v(((String) objArr18[0]).intern());
            } else {
                aVarV6 = null;
            }
            map.put(o.ex.c.f25548c, aVarV != null ? aVarV.i(strIntern) : null);
            map.put(o.ex.c.f25553h, aVarV != null ? aVarV.i(strIntern2) : null);
            map.put(o.ex.c.f25555j, aVarV2 != null ? aVarV2.i(strIntern) : null);
            map.put(o.ex.c.f25552g, aVarV2 != null ? aVarV2.i(strIntern2) : null);
            map.put(o.ex.c.f25554i, aVarV3 != null ? aVarV3.i(strIntern) : null);
            o.ex.c cVar5 = o.ex.c.f25551f;
            if (aVarV3 != null) {
                int i10 = f20590g + 3;
                f20592i = i10 % 128;
                if (i10 % 2 == 0) {
                    aVarV3.i(strIntern2);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                boolI2 = aVarV3.i(strIntern2);
            } else {
                boolI2 = null;
            }
            map.put(cVar5, boolI2);
            o.ex.c cVar6 = o.ex.c.f25558m;
            if (aVarV4 != null) {
                int i11 = f20590g + 109;
                f20592i = i11 % 128;
                int i12 = i11 % 2;
                boolI3 = aVarV4.i(strIntern);
            } else {
                boolI3 = null;
            }
            map.put(cVar6, boolI3);
            map.put(o.ex.c.f25556k, aVarV4 != null ? aVarV4.i(strIntern2) : null);
            map.put(o.ex.c.f25557l, aVarV5 != null ? aVarV5.i(strIntern) : null);
            map.put(o.ex.c.f25560o, aVarV5 != null ? aVarV5.i(strIntern2) : null);
            map.put(o.ex.c.f25559n, aVarV6 != null ? aVarV6.i(strIntern) : null);
            map.put(o.ex.c.f25562q, aVarV6 != null ? aVarV6.i(strIntern2) : null);
            map.put(o.ex.c.f25564s, aVarV9 != null ? aVarV9.i(strIntern) : null);
            map.put(o.ex.c.f25565t, aVarV9 != null ? aVarV9.i(strIntern2) : null);
            if (aVarV9 != null) {
                Object[] objArr19 = new Object[1];
                l(new int[]{2093134027, -1950451691, -1552383094, 1858932900, -144258563, -39712993, 494633641, -1226493072, 1353359891, 3802501}, (ViewConfiguration.getTapTimeout() >> 16) + 18, objArr19);
                Object[] objArr20 = {aVarV9, ((String) objArr19[0]).intern()};
                int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                int i13 = a.f23786t * (-299832344);
                a.f23786t = i13;
                int iNextInt = new Random().nextInt(1654102492);
                int i14 = a.f23785s * (-1442580203);
                a.f23785s = i14;
                numArr = (Integer[]) a.a(-1422234627, objArr20, iNextInt, i14, 1422234636, iFreeMemory, i13);
            } else {
                numArr = null;
            }
            map.put(o.ex.c.f25563r, numArr);
            if (aVarV9 != null) {
                int i15 = f20590g + 109;
                f20592i = i15 % 128;
                int i16 = i15 % 2;
                Object[] objArr21 = new Object[1];
                l(new int[]{-1198949419, 1837555270, -1082944633, -1985243197, -29851967, 1163787078, -1756536858, 1532866823}, ImageFormat.getBitsPerPixel(0) + 16, objArr21);
                strArrY = aVarV9.y(((String) objArr21[0]).intern());
            } else {
                strArrY = null;
            }
            map.put(o.ex.c.f25561p, strArrY);
            o.ex.c cVar7 = o.ex.c.f25570y;
            if (aVarV10 != null) {
                int i17 = f20592i + 49;
                f20590g = i17 % 128;
                if (i17 % 2 != 0) {
                    aVarV10.i(strIntern);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                boolI4 = aVarV10.i(strIntern);
            } else {
                boolI4 = null;
            }
            map.put(cVar7, boolI4);
            o.ex.c cVar8 = o.ex.c.f25567v;
            if (aVarV10 != null) {
                int i18 = f20592i + 55;
                f20590g = i18 % 128;
                if (i18 % 2 != 0) {
                    aVarV10.i(strIntern2);
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                boolI5 = aVarV10.i(strIntern2);
                timeZone = null;
            } else {
                timeZone = null;
                boolI5 = null;
            }
            map.put(cVar8, boolI5);
            if (aVarV10 != null) {
                Object[] objArr22 = new Object[1];
                l(new int[]{-1943912370, 1402393894, 332589471, -360613565}, TextUtils.indexOf("", "", 0) + 5, objArr22);
                objY = aVarV10.y(((String) objArr22[0]).intern());
            } else {
                objY = timeZone;
            }
            map.put(o.ex.c.f25566u, objY);
            if (aVarV11 != null) {
                int i19 = f20592i + 37;
                f20590g = i19 % 128;
                int i20 = i19 % 2;
                Object[] objArr23 = new Object[1];
                l(new int[]{1744582308, -40803513, -2002666416, -900959025}, 5 - ImageFormat.getBitsPerPixel(0), objArr23);
                strS = aVarV11.s(((String) objArr23[0]).intern());
            } else {
                strS = timeZone;
            }
            map.put(o.ex.c.f25569x, TimePeriod.getPeriodFromString(strS));
            o.ex.c cVar9 = o.ex.c.f25568w;
            if (aVarV11 != null) {
                Object[] objArr24 = new Object[1];
                l(new int[]{1600888526, -1424705892, -2056549147, -383911143, 997811483, 1744261750, -393861412, -1441961470}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 13, objArr24);
                objM = aVarV11.m(((String) objArr24[0]).intern());
            } else {
                objM = timeZone;
            }
            map.put(cVar9, objM);
            o.ex.c cVar10 = o.ex.c.B;
            if (aVarV11 != null) {
                Object[] objArr25 = new Object[1];
                l(new int[]{-534798925, 268280951, 905016341, -1140632789, 997811483, 1744261750, -393861412, -1441961470}, 14 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr25);
                objM2 = aVarV11.m(((String) objArr25[0]).intern());
            } else {
                objM2 = timeZone;
            }
            map.put(cVar10, objM2);
            if (aVarV11 != null) {
                Object[] objArr26 = new Object[1];
                l(new int[]{547319836, -588757320, 337622747, -1779629842}, TextUtils.getCapsMode("", 0, 0) + 8, objArr26);
                strS2 = aVarV11.s(((String) objArr26[0]).intern());
            } else {
                strS2 = timeZone;
            }
            if (strS2 != 0) {
                timeZone = TimeZone.getTimeZone(strS2);
            }
            map.put(o.ex.c.A, timeZone);
        } catch (o.ef.b e2) {
            if (f.a()) {
                Object[] objArr27 = new Object[1];
                l(new int[]{-1220424068, 1580500457, -1662551851, -1981629939, 1609284626, 782586989, -1652391137, 387099481, 138881731, 1993551278, -911753779, -356254066, 2076722043, -462777959, -1320508411, -838762289}, 31 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr27);
                String strIntern4 = ((String) objArr27[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr28 = new Object[1];
                k((short) (10 - View.resolveSize(0, 0)), (-2107305642) - TextUtils.lastIndexOf("", '0', 0), 1356130021 - View.MeasureSpec.getSize(0), (-121) - TextUtils.indexOf("", ""), (byte) KeyEvent.getDeadChar(0, 0), objArr28);
                f.d(strIntern4, sb.append(((String) objArr28[0]).intern()).append(e2).toString());
            }
        }
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x043d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static o.ef.a b(java.util.Map<o.ex.c, java.lang.Object> r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ar.c.b(java.util.Map):o.ef.a");
    }

    static void c() {
        f20588e = new int[]{-179284396, 1503887023, 1989718207, 858069851, -261346381, 1851959895, 597174297, 1094821631, 2002495547, 743802854, 2067701509, 2038401580, -2134942452, 1448284791, -1356140259, -373460614, 509845326, 1309408155};
        f20585b = 956883621;
        f20586c = 1150422517;
        f20584a = -340192014;
        f20587d = new byte[]{Ascii.GS, -110, MessagePack.Code.EXT8, 120, -86, -98, -81, -92, Ascii.GS, 42, 95, -7, 36, 57, 45, Utf8.REPLACEMENT_BYTE, 6, 58, 92, Ascii.FS, 120, -116, 126, 113, 116, -125, 119, 98, Ascii.ESC, -16, MessagePack.Code.FIXEXT1, -29, -30, 3, MessagePack.Code.FIXEXT16, -17, Ascii.DC4, MessagePack.Code.UINT64, -7, -21, -18, -15, Ascii.RS, -68, -88, -101, -86, MessagePack.Code.ARRAY16, 126, -87, -91, -84, -66, Ascii.FS, MessagePack.Code.UINT8, -67, MessagePack.Code.NEVER_USED, -70, -78, -80, MessagePack.Code.BIN32, -80, Ascii.RS, 113, -121, 120, 121, -128, 115, 100, -113, 118, -123, 3, Ascii.FS, 8, -12, 4, 6, Ascii.RS, -15, Ascii.SO, -1, Ascii.GS, -10, -4, Ascii.CR, -9, 10, -10, Ascii.GS, MessagePack.Code.EXT8, MessagePack.Code.ARRAY32, MessagePack.Code.BIN32, -76, MessagePack.Code.BIN16, MessagePack.Code.NEVER_USED, -71, 40, 3, 3, 2, Ascii.SUB, Ascii.GS, 48, -21, Ascii.GS, Ascii.SUB, Ascii.VT, 47, Ascii.RS, -14, Ascii.ESC, 19, Ascii.CR, 34, Ascii.CR, -15, 47, 3, 17, 4, 5, 19, Ascii.SO, Ascii.DC2, Ascii.US, 58, 37, 120, 113, 102, 119, -116, 117, 108, -124, -74, 37, 120, 127, 114, MessagePack.Code.UINT16, 100, -114, 39, 126, 126, 121, 113, 120, -81, 70, 120, 113, 102, -118, 117, 105, 118, -114, 104, -103, 104, 108, -118, 126, -116, 99, 96, -114, 101, -119, 122};
    }

    static void init$0() {
        $$a = new byte[]{95, MessagePack.Code.FALSE, -107, -90};
        $$b = 72;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void k(short r26, int r27, int r28, int r29, byte r30, java.lang.Object[] r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 826
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ar.c.k(short, int, int, int, byte, java.lang.Object[]):void");
    }

    private static void l(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i3 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = f20588e;
        int i4 = 989264422;
        char c2 = '0';
        int i5 = 0;
        if (iArr3 != null) {
            int i6 = $10 + 77;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i8 = 0;
            while (i8 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i8])};
                    Object objA = d.a(i4);
                    if (objA == null) {
                        byte b2 = (byte) i5;
                        byte b3 = b2;
                        objA = d.a(TextUtils.lastIndexOf("", c2, i5) + 676, (char) View.resolveSizeAndState(i5, i5, i5), TextUtils.getTrimmedLength("") + 12, -328001469, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    iArr4[i8] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    i8++;
                    i4 = 989264422;
                    c2 = '0';
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = f20588e;
        if (iArr6 != null) {
            int i9 = $11 + 37;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            for (int i10 = 0; i10 < length; i10++) {
                Object[] objArr3 = {Integer.valueOf(iArr6[i10])};
                Object objA2 = d.a(989264422);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = d.a(TextUtils.indexOf((CharSequence) "", '0', 0) + 676, (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 12, -328001469, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                }
                iArr2[i10] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
            }
            iArr6 = iArr2;
        }
        char c3 = 0;
        System.arraycopy(iArr6, 0, iArr5, 0, length3);
        lVar.f19941d = 0;
        while (lVar.f19941d < iArr.length) {
            cArr[c3] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr5);
            int i11 = $10 + 41;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 2 / 2;
            }
            for (int i13 = 0; i13 < 16; i13++) {
                lVar.f19942e ^= iArr5[i13];
                Object[] objArr4 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                Object objA3 = d.a(2098218801);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 2);
                    objA3 = d.a(301 - TextUtils.indexOf("", ""), (char) (52696 - Process.getGidForName("")), 11 - KeyEvent.normalizeMetaState(0), -1416256172, false, $$c(b6, b7, (byte) (b7 - 2)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = iIntValue;
            }
            int i14 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i14;
            lVar.f19940a ^= iArr5[16];
            lVar.f19942e ^= iArr5[17];
            int i15 = lVar.f19942e;
            int i16 = lVar.f19940a;
            cArr[0] = (char) (lVar.f19942e >>> 16);
            cArr[1] = (char) lVar.f19942e;
            cArr[2] = (char) (lVar.f19940a >>> 16);
            cArr[3] = (char) lVar.f19940a;
            l.a(iArr5);
            cArr2[lVar.f19941d * 2] = cArr[0];
            cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
            cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
            cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
            Object[] objArr5 = {lVar, lVar};
            Object objA4 = d.a(986820978);
            if (objA4 == null) {
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 230;
                char c4 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 51003);
                int iIndexOf = TextUtils.indexOf("", "", 0) + 9;
                byte length4 = (byte) $$a.length;
                objA4 = d.a(iLastIndexOf, c4, iIndexOf, -330018025, false, $$c((byte) 0, length4, (byte) (length4 - 4)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
            c3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }
}
