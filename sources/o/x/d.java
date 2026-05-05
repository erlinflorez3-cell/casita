package o.x;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback;
import fr.antelop.sdk.authentication.CustomerAuthenticatedProcess;
import java.lang.reflect.Method;
import java.util.List;
import o.a.n;
import o.ea.m;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements f {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: g */
    private static int f26885g = 0;

    /* JADX INFO: renamed from: i */
    private static int f26886i = 0;

    /* JADX INFO: renamed from: j */
    private static int f26887j = 0;

    /* JADX INFO: renamed from: a */
    private final CustomCustomerAuthenticatedProcessCallback f26888a;

    /* JADX INFO: renamed from: b */
    private final Context f26889b;

    /* JADX INFO: renamed from: c */
    private final CustomerAuthenticatedProcess f26890c;

    /* JADX INFO: renamed from: d */
    private final String f26891d;

    /* JADX INFO: renamed from: e */
    private final i<?> f26892e;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0020 -> B:17:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r7, int r8, int r9) {
        /*
            int r7 = r7 * 2
            int r1 = r7 + 1
            int r6 = r8 + 4
            byte[] r5 = o.x.d.$$a
            int r0 = r9 * 2
            int r4 = 115 - r0
            byte[] r3 = new byte[r1]
            r2 = 0
            if (r5 != 0) goto L27
            r0 = r4
            r1 = r2
            r4 = r7
        L14:
            int r4 = r4 + r0
        L15:
            byte r0 = (byte) r4
            r3[r1] = r0
            if (r1 != r7) goto L20
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L20:
            int r1 = r1 + 1
            int r6 = r6 + 1
            r0 = r5[r6]
            goto L14
        L27:
            r1 = r2
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.x.d.$$c(short, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f26887j = 0;
        f26885g = 1;
        f26886i = -1270219463;
    }

    public d(Context context, CustomCustomerAuthenticatedProcessCallback customCustomerAuthenticatedProcessCallback, CustomerAuthenticatedProcess customerAuthenticatedProcess, i<?> iVar) throws Throwable {
        Object[] objArr = new Object[1];
        f(Process.getGidForName("") + 48, "\u000e\r\u0001\ufffe\u0007\r\u0002￼\ufffa\r\ufffe�￩\u000b\b￼\ufffe\f\fￜ\ufffa\u0005\u0005\ufffb\ufffa￼\u0004￢\u0007\u0007\ufffe\u000bￜ\u000e\f\r\b\u0006ￜ\u000e\f\r\b\u0006\ufffe\u000bￚ", false, 137 - View.MeasureSpec.makeMeasureSpec(0, 0), 27 - ExpandableListView.getPackedPositionGroup(0L), objArr);
        this.f26891d = ((String) objArr[0]).intern();
        this.f26889b = context;
        this.f26888a = customCustomerAuthenticatedProcessCallback;
        this.f26890c = customerAuthenticatedProcess;
        this.f26892e = iVar;
    }

    private static void f(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
        Object charArray;
        char[] cArr;
        String str2 = str;
        int i5 = 2 % 2;
        int i6 = $10 + 51;
        $11 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 14 / 0;
            charArray = str2 != null ? str2.toCharArray() : str2;
        } else {
            if (str2 != null) {
            }
        }
        char[] cArr2 = (char[]) charArray;
        n nVar = new n();
        char[] cArr3 = new char[i2];
        nVar.f19944a = 0;
        while (nVar.f19944a < i2) {
            nVar.f19946e = cArr2[nVar.f19944a];
            cArr3[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i8 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i8]), Integer.valueOf(f26886i)};
                Object objA = o.d.d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 - 1);
                    objA = o.d.d.a(TextUtils.getTrimmedLength("") + 270, (char) (MotionEvent.axisFromString("") + 1), 11 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -2071844881, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = o.d.d.a(-202660535);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 - 1);
                    objA2 = o.d.d.a(522 - TextUtils.getCapsMode("", 0, 0), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 12 - Color.green(0), 627984172, false, $$c(b4, b5, (byte) (-b5)), new Class[]{Object.class, Object.class});
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
            int i9 = $11 + 13;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            nVar.f19945b = i4;
            char[] cArr4 = new char[i2];
            System.arraycopy(cArr3, 0, cArr4, 0, i2);
            System.arraycopy(cArr4, 0, cArr3, i2 - nVar.f19945b, nVar.f19945b);
            System.arraycopy(cArr4, nVar.f19945b, cArr3, 0, i2 - nVar.f19945b);
        }
        if (z2) {
            int i11 = $11 + 115;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                cArr = new char[i2];
                nVar.f19944a = 1;
            } else {
                cArr = new char[i2];
                nVar.f19944a = 0;
            }
            while (nVar.f19944a < i2) {
                int i12 = $10 + 13;
                $11 = i12 % 128;
                if (i12 % 2 == 0) {
                    cArr[nVar.f19944a] = cArr3[i2 / nVar.f19944a];
                    Object[] objArr4 = {nVar, nVar};
                    Object objA3 = o.d.d.a(-202660535);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 - 1);
                        objA3 = o.d.d.a((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 522, (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 12 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 627984172, false, $$c(b6, b7, (byte) (-b7)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                } else {
                    cArr[nVar.f19944a] = cArr3[(i2 - nVar.f19944a) - 1];
                    Object[] objArr5 = {nVar, nVar};
                    Object objA4 = o.d.d.a(-202660535);
                    if (objA4 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = (byte) (b8 - 1);
                        objA4 = o.d.d.a(522 - View.combineMeasuredStates(0, 0), (char) TextUtils.indexOf("", ""), 11 - ImageFormat.getBitsPerPixel(0), 627984172, false, $$c(b8, b9, (byte) (-b9)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr5);
                }
            }
            cArr3 = cArr;
        }
        objArr[0] = new String(cArr3);
    }

    static void init$0() {
        $$a = new byte[]{96, -114, MessagePack.Code.EXT16, -13};
        $$b = 75;
    }

    @Override // o.x.f
    public final void onAuthenticationDeclined() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26887j + 113;
        f26885g = i3 % 128;
        if (i3 % 2 == 0) {
            o.ea.f.a();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            f((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 47, "\u000e\r\u0001\ufffe\u0007\r\u0002￼\ufffa\r\ufffe�￩\u000b\b￼\ufffe\f\fￜ\ufffa\u0005\u0005\ufffb\ufffa￼\u0004￢\u0007\u0007\ufffe\u000bￜ\u000e\f\r\b\u0006ￜ\u000e\f\r\b\u0006\ufffe\u000bￚ", false, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 136, 27 - ExpandableListView.getPackedPositionType(0L), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            f((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 26, "\u0007\u0012\f\u0003\u0006\u0012\u0013\uffdf\f\rￇￆ\u0002\u0003\f\u0007\n\u0001\u0003￢\f\r\u0007\u0012\uffff\u0001", true, 131 - TextUtils.lastIndexOf("", '0', 0), 9 - TextUtils.indexOf((CharSequence) "", '0'), objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        this.f26888a.onAuthenticationDeclined(this.f26890c);
        int i4 = f26885g + 11;
        f26887j = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.x.f
    public final void onCustomerCredentialsInvalid(o.j.b bVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26885g + 61;
        f26887j = i3 % 128;
        if (i3 % 2 != 0) {
            o.ea.f.a();
            throw null;
        }
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            f(TextUtils.getCapsMode("", 0, 0) + 47, "\u000e\r\u0001\ufffe\u0007\r\u0002￼\ufffa\r\ufffe�￩\u000b\b￼\ufffe\f\fￜ\ufffa\u0005\u0005\ufffb\ufffa￼\u0004￢\u0007\u0007\ufffe\u000bￜ\u000e\f\r\b\u0006ￜ\u000e\f\r\b\u0006\ufffe\u000bￚ", false, View.combineMeasuredStates(0, 0) + 137, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 27, objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            f(41 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "\u0014\u0013￨\u001a\u0018\u0019\u0014\u0012\n\u0017￨\u0017\n\t\n\u0013\u0019\u000e\u0006\u0011\u0018￮\u0013\u001b\u0006\u0011\u000e\tￍￎￅￒￅ\u0017\n\u0006\u0018\u0014\u0013ￅￒￅ", false, (Process.myPid() >> 22) + 125, 41 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr2);
            o.ea.f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(bVar).toString());
            int i4 = f26887j + 83;
            f26885g = i4 % 128;
            int i5 = i4 % 2;
        }
        this.f26888a.onCustomerCredentialsInvalid(bVar.a(), this.f26890c);
    }

    @Override // o.x.f
    public final void onCustomerCredentialsRequired(List<o.m.h> list) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26887j + 107;
        f26885g = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            int i5 = f26885g + 31;
            f26887j = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            f(48 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), "\u000e\r\u0001\ufffe\u0007\r\u0002￼\ufffa\r\ufffe�￩\u000b\b￼\ufffe\f\fￜ\ufffa\u0005\u0005\ufffb\ufffa￼\u0004￢\u0007\u0007\ufffe\u000bￜ\u000e\f\r\b\u0006ￜ\u000e\f\r\b\u0006\ufffe\u000bￚ", false, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 137, 27 - TextUtils.getOffsetBefore("", 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            f(View.getDefaultSize(0, 0) + 31, "\n\u000bￅￄ\u0000\u0001\u000e\u0005\u0011\r\u0001￮\u000f\b�\u0005\u0010\n\u0001\u0000\u0001\u000e\uffdf\u000e\u0001\t\u000b\u0010\u000f\u0011\uffdf", true, 133 - TextUtils.lastIndexOf("", '0'), 3 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            int i7 = f26887j + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f26885g = i7 % 128;
            int i8 = i7 % 2;
        }
        this.f26888a.onCustomerCredentialsRequired(m.b(list), this.f26890c);
    }

    @Override // o.x.f
    public final void onError(o.by.c cVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26887j + 47;
        f26885g = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            f((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 47, "\u000e\r\u0001\ufffe\u0007\r\u0002￼\ufffa\r\ufffe�￩\u000b\b￼\ufffe\f\fￜ\ufffa\u0005\u0005\ufffb\ufffa￼\u0004￢\u0007\u0007\ufffe\u000bￜ\u000e\f\r\b\u0006ￜ\u000e\f\r\b\u0006\ufffe\u000bￚ", false, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 137, KeyEvent.getDeadChar(0, 0) + 27, objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            f(19 - View.MeasureSpec.makeMeasureSpec(0, 0), "\u001b\ufff2\u001f\u001f\u001c\u001fￕￖￍￚￍ\u0012\u001f\u001f\u001c\u001f\uffe7ￍ\u001c", false, 116 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 18 - Color.green(0), objArr2);
            o.ea.f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(cVar).toString());
            int i5 = f26887j + 5;
            f26885g = i5 % 128;
            int i6 = i5 % 2;
        }
        this.f26892e.a();
        this.f26888a.onError(cVar.a(), this.f26890c);
    }

    @Override // o.x.f
    public final void onProcessStart() throws Throwable {
        int i2 = 2 % 2;
        if (o.ea.f.a()) {
            int i3 = f26885g + 81;
            f26887j = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            f(View.getDefaultSize(0, 0) + 47, "\u000e\r\u0001\ufffe\u0007\r\u0002￼\ufffa\r\ufffe�￩\u000b\b￼\ufffe\f\fￜ\ufffa\u0005\u0005\ufffb\ufffa￼\u0004￢\u0007\u0007\ufffe\u000bￜ\u000e\f\r\b\u0006ￜ\u000e\f\r\b\u0006\ufffe\u000bￚ", false, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 137, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 27, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            f(16 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), "\u0013\u0011\u0000\u0013\ufff2\u0012\u0012\u0004\u0002\u000e\u0011\uffef\r\u000e\uffc8ￇ", true, ExpandableListView.getPackedPositionType(0L) + 131, 13 - TextUtils.indexOf((CharSequence) "", '0'), objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        this.f26888a.onProcessStart(this.f26890c);
        int i5 = f26887j + 107;
        f26885g = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // o.x.f
    public final void onProcessSuccess() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26885g + 17;
        f26887j = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            int i5 = f26885g + 19;
            f26887j = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            f(View.combineMeasuredStates(0, 0) + 47, "\u000e\r\u0001\ufffe\u0007\r\u0002￼\ufffa\r\ufffe�￩\u000b\b￼\ufffe\f\fￜ\ufffa\u0005\u0005\ufffb\ufffa￼\u0004￢\u0007\u0007\ufffe\u000bￜ\u000e\f\r\b\u0006ￜ\u000e\f\r\b\u0006\ufffe\u000bￚ", false, 138 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 28 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            f(Color.blue(0) + 18, "\u0003\u0011\u0011ￆￇ\r\f￮\u0010\r\u0001\u0003\u0011\u0011\ufff1\u0013\u0001\u0001", false, TextUtils.indexOf("", "") + 132, 5 - TextUtils.indexOf("", "", 0), objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        this.f26888a.onProcessSuccess(this.f26890c);
    }
}
