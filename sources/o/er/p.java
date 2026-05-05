package o.er;

import android.content.Context;
import android.media.AudioTrack;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class p {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f25122c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f25123d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f25124e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f25125f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f25126g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o.ep.d f25127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f25128b;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r8, int r9, byte r10) {
        /*
            int r0 = r8 * 3
            int r8 = r0 + 1
            byte[] r7 = o.er.p.$$a
            int r0 = r10 * 2
            int r6 = 115 - r0
            int r5 = r9 + 4
            byte[] r4 = new byte[r8]
            r3 = 0
            if (r7 != 0) goto L2b
            r0 = r6
            r2 = r3
            r1 = r5
        L14:
            int r0 = -r0
            int r5 = r5 + r0
            r6 = r5
            r5 = r1
        L18:
            int r1 = r5 + 1
            byte r0 = (byte) r6
            r4[r2] = r0
            int r2 = r2 + 1
            if (r2 != r8) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L27:
            r0 = r7[r1]
            r5 = r6
            goto L14
        L2b:
            r2 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.er.p.$$c(int, int, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f25126g = 0;
        f25125f = 1;
        f25124e = 0;
        f25122c = 1;
        d();
        ViewConfiguration.getKeyRepeatDelay();
        CdmaCellLocation.convertQuartSecToDecDegrees(0);
        KeyEvent.getDeadChar(0, 0);
        int i2 = f25125f + 77;
        f25126g = i2 % 128;
        int i3 = i2 % 2;
    }

    public p(Context context, o.ep.d dVar) {
        this.f25128b = context;
        this.f25127a = dVar;
    }

    static void d() {
        f25123d = -1270219458;
    }

    private static void h(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
        String str2 = str;
        int i5 = 2 % 2;
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        o.a.n nVar = new o.a.n();
        char[] cArr2 = new char[i2];
        nVar.f19944a = 0;
        while (nVar.f19944a < i2) {
            int i6 = $10 + 91;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            nVar.f19946e = cArr[nVar.f19944a];
            cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i8 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(f25123d)};
                Object objA = o.d.d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 - 1);
                    objA = o.d.d.a(TextUtils.getTrimmedLength("") + 270, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), ExpandableListView.getPackedPositionChild(0L) + 12, -2071844881, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = o.d.d.a(-202660535);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 - 1);
                    objA2 = o.d.d.a(522 - KeyEvent.keyCodeFromString(""), (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 12 - TextUtils.getOffsetBefore("", 0), 627984172, false, $$c(b4, b5, (byte) (-b5)), new Class[]{Object.class, Object.class});
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
            int i9 = $10 + 9;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 5 / 5;
            }
            while (nVar.f19944a < i2) {
                cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                Object[] objArr4 = {nVar, nVar};
                Object objA3 = o.d.d.a(-202660535);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 - 1);
                    objA3 = o.d.d.a((KeyEvent.getMaxKeyCode() >> 16) + 522, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 12 - View.combineMeasuredStates(0, 0), 627984172, false, $$c(b6, b7, (byte) (-b7)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
                int i11 = $11 + 61;
                $10 = i11 % 128;
                int i12 = i11 % 2;
            }
            cArr2 = cArr4;
        }
        String str3 = new String(cArr2);
        int i13 = $10 + 39;
        $11 = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
        objArr[0] = str3;
    }

    static void init$0() {
        $$a = new byte[]{97, 52, 124, MessagePack.Code.EXT16};
        $$b = 71;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(final fr.antelop.sdk.util.OperationCallback<java.lang.Void> r20) throws fr.antelop.sdk.exception.WalletValidationException {
        /*
            Method dump skipped, instruction units count: 457
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.er.p.d(fr.antelop.sdk.util.OperationCallback):void");
    }
}
