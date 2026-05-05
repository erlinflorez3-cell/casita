package o.es;

import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.mp4.media.Mp4VideoDirectory;
import java.lang.reflect.Method;
import o.a.n;
import org.msgpack.core.MessagePack;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class d {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f25309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f25310b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f25311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ d[] f25312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f25313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f25314f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f25315g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f25316i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f25317j = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r7, int r8, short r9) {
        /*
            int r7 = r7 * 3
            int r1 = r7 + 1
            int r0 = r9 * 4
            int r6 = 4 - r0
            byte[] r5 = o.es.d.$$a
            int r0 = r8 * 2
            int r2 = r0 + 113
            byte[] r4 = new byte[r1]
            r3 = 0
            if (r5 != 0) goto L2a
            r0 = r7
            r2 = r6
            r1 = r3
        L16:
            int r0 = -r0
            int r6 = r6 + 1
            int r2 = r2 + r0
        L1a:
            byte r0 = (byte) r2
            r4[r1] = r0
            if (r1 != r7) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L25:
            int r1 = r1 + 1
            r0 = r5[r6]
            goto L16
        L2a:
            r1 = r3
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.es.d.$$c(byte, int, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f25314f = 0;
        f25315g = 1;
        f25317j = 0;
        f25316i = 1;
        b();
        Object[] objArr = new Object[1];
        h(TextUtils.indexOf("", "") + 6, "\n\ufff9\ufff7\ufffb\f\uffff", true, (ViewConfiguration.getJumpTapTimeout() >> 16) + Mp4VideoDirectory.TAG_COMPRESSION_TYPE, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3, objArr);
        f25311c = new d(((String) objArr[0]).intern(), 0);
        Object[] objArr2 = new Object[1];
        h(10 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "\b\u0001\u0007\u0002\ufffe\ufff8\u0001￼\r\ufff8\ufff7", false, 212 - TextUtils.lastIndexOf("", '0', 0, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 11, objArr2);
        f25313e = new d(((String) objArr2[0]).intern(), 1);
        Object[] objArr3 = new Object[1];
        h(10 - (ViewConfiguration.getEdgeSlop() >> 16), "\n\u0003\u000b\ufffa\u0007\ufffe\ufffb\ufffe\ufffa\ufff9", false, (ViewConfiguration.getJumpTapTimeout() >> 16) + 211, 10 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr3);
        f25309a = new d(((String) objArr3[0]).intern(), 2);
        f25312d = d();
        int i2 = f25314f + 123;
        f25315g = i2 % 128;
        int i3 = i2 % 2;
    }

    private d(String str, int i2) {
    }

    static void b() {
        f25310b = -1270219373;
    }

    private static /* synthetic */ d[] d() {
        int i2 = 2 % 2;
        int i3 = f25317j + 59;
        f25316i = i3 % 128;
        if (i3 % 2 != 0) {
            return new d[]{f25311c, f25313e, f25309a};
        }
        d[] dVarArr = new d[3];
        dVarArr[1] = f25311c;
        dVarArr[1] = f25313e;
        dVarArr[4] = f25309a;
        return dVarArr;
    }

    private static void h(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i5 = 2 % 2;
        if (str2 != null) {
            int i6 = $10 + 83;
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
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(f25310b)};
                Object objA = o.d.d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 + 1);
                    objA = o.d.d.a(TextUtils.indexOf((CharSequence) "", '0', 0) + 271, (char) (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 11, -2071844881, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = o.d.d.a(-202660535);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a(522 - View.MeasureSpec.getMode(0), (char) TextUtils.indexOf("", ""), 12 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 627984172, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
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
        }
        if (z2) {
            char[] cArr4 = new char[i2];
            nVar.f19944a = 0;
            while (nVar.f19944a < i2) {
                int i9 = $11 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    cArr4[nVar.f19944a] = cArr2[(i2 % nVar.f19944a) >> 1];
                    Object[] objArr4 = {nVar, nVar};
                    Object objA3 = o.d.d.a(-202660535);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objA3 = o.d.d.a(522 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (Process.myPid() >> 22), 12 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 627984172, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                } else {
                    cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                    Object[] objArr5 = {nVar, nVar};
                    Object objA4 = o.d.d.a(-202660535);
                    if (objA4 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objA4 = o.d.d.a(ExpandableListView.getPackedPositionType(0L) + 522, (char) TextUtils.getOffsetBefore("", 0), View.combineMeasuredStates(0, 0) + 12, 627984172, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr5);
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void init$0() {
        $$a = new byte[]{78, MessagePack.Code.UINT16, MessagePack.Code.FALSE, 123};
        $$b = 248;
    }

    public static d valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f25317j + 37;
        f25316i = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        d dVar = (d) Enum.valueOf(d.class, str);
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = f25317j + 73;
        f25316i = i5 % 128;
        if (i5 % 2 != 0) {
            return dVar;
        }
        obj.hashCode();
        throw null;
    }

    public static d[] values() {
        int i2 = 2 % 2;
        int i3 = f25317j + 71;
        f25316i = i3 % 128;
        int i4 = i3 % 2;
        d[] dVarArr = f25312d;
        if (i4 != 0) {
            return (d[]) dVarArr.clone();
        }
        throw null;
    }
}
