package o.x;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import fr.antelop.sdk.AntelopErrorCode;
import java.lang.reflect.Method;
import o.a.n;
import o.by.g;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements o.c.e {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f26876b = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f26877g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f26878h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f26879i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f26880j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f26881a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o.c.a f26882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f26883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f26884e;

    public interface a {
        void runWithWallet(Context context, o.en.b bVar);
    }

    private static String $$c(byte b2, short s2, int i2) {
        int i3 = 115 - (s2 * 2);
        int i4 = b2 * 4;
        byte[] bArr = $$a;
        int i5 = i2 + 4;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        int i7 = -1;
        if (bArr == null) {
            i3 += -i5;
            i5 = i5;
        }
        while (true) {
            int i8 = i5 + 1;
            i7++;
            bArr2[i7] = (byte) i3;
            if (i7 == i6) {
                return new String(bArr2, 0);
            }
            i3 += -bArr[i8];
            i5 = i8;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f26880j = 0;
        f26877g = 1;
        f26878h = 0;
        f26879i = 1;
        e();
        ViewConfiguration.getScrollBarSize();
        Process.getGidForName("");
        Color.green(0);
        int i2 = f26877g + 33;
        f26880j = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 86 / 0;
        }
    }

    c(a aVar, Context context, f fVar) {
        this.f26881a = aVar;
        this.f26884e = context;
        this.f26883d = fVar;
        this.f26882c = new o.c.a(context);
    }

    static void e() {
        f26876b = -1270219338;
    }

    private static void f(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
        String str2 = str;
        int i5 = 2 % 2;
        int i6 = $11 + 99;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        n nVar = new n();
        char[] cArr2 = new char[i2];
        nVar.f19944a = 0;
        while (nVar.f19944a < i2) {
            int i8 = $10 + 55;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            nVar.f19946e = cArr[nVar.f19944a];
            cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
            int i10 = nVar.f19944a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i10]), Integer.valueOf(f26876b)};
                Object objA = o.d.d.a(1376241034);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(270 - Color.alpha(0), (char) View.MeasureSpec.getSize(0), 11 - ExpandableListView.getPackedPositionGroup(0L), -2071844881, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i10] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objA2 = o.d.d.a(-202660535);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 1);
                    objA2 = o.d.d.a((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 521, (char) TextUtils.getTrimmedLength(""), 12 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 627984172, false, $$c(b4, b5, (byte) (-b5)), new Class[]{Object.class, Object.class});
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
            int i11 = $11 + 49;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            nVar.f19945b = i4;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - nVar.f19945b, nVar.f19945b);
            System.arraycopy(cArr3, nVar.f19945b, cArr2, 0, i2 - nVar.f19945b);
        }
        if (z2) {
            char[] cArr4 = new char[i2];
            nVar.f19944a = 0;
            int i13 = $10 + 99;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            while (nVar.f19944a < i2) {
                int i15 = $11 + 87;
                $10 = i15 % 128;
                if (i15 % 2 != 0) {
                    cArr4[nVar.f19944a] = cArr2[i2 << nVar.f19944a];
                    Object[] objArr4 = {nVar, nVar};
                    Object objA3 = o.d.d.a(-202660535);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 + 1);
                        objA3 = o.d.d.a(522 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 13 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 627984172, false, $$c(b6, b7, (byte) (-b7)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                } else {
                    cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                    Object[] objArr5 = {nVar, nVar};
                    Object objA4 = o.d.d.a(-202660535);
                    if (objA4 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = (byte) (b8 + 1);
                        objA4 = o.d.d.a(522 - (KeyEvent.getMaxKeyCode() >> 16), (char) KeyEvent.keyCodeFromString(""), 12 - (ViewConfiguration.getPressedStateDuration() >> 16), 627984172, false, $$c(b8, b9, (byte) (-b9)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr5);
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void init$0() {
        $$a = new byte[]{17, -84, -78, -70};
        $$b = 98;
    }

    @Override // o.c.e
    public final void a(o.en.b bVar, o.bg.c cVar, g gVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26879i + 25;
        f26878h = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            f(41 - View.MeasureSpec.makeMeasureSpec(0, 0), "\u0010\u0005\u000b\n\uffdf�\b\b\ufffe�\uffff\u0007\uffef\uffff�\uffdd\n\u0010\u0001\b\u000b\f\ufff3�\b\b\u0001\u0010￩�\n�\u0003\u0001\u000e\uffdf\u000b\n\n\u0001\uffff", false, 321 - AndroidCharacter.getMirror('0'), (-16777204) - Color.rgb(0, 0, 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            f(KeyEvent.keyCodeFromString("") + 33, "\u0003\u0010￡\r\f\f\u0003\u0001\u0012\u0003\u0002ￆￇ\r\f\uffdf\f\u0012\u0003\n\r\u000e\ufff5\uffff\n\n\u0003\u0012￫\uffff\f\uffff\u0005", false, ImageFormat.getBitsPerPixel(0) + 272, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 12, objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        this.f26881a.runWithWallet(this.f26884e, bVar);
        int i5 = f26878h + 37;
        f26879i = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // o.c.e
    public final void b() {
        int i2 = 2 % 2;
        int i3 = f26879i + 117;
        f26878h = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.c.e
    public final void d() throws Throwable {
        int i2 = 2 % 2;
        if (o.ea.f.a()) {
            int i3 = f26878h + 117;
            f26879i = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            f(41 - View.resolveSizeAndState(0, 0, 0), "\u0010\u0005\u000b\n\uffdf�\b\b\ufffe�\uffff\u0007\uffef\uffff�\uffdd\n\u0010\u0001\b\u000b\f\ufff3�\b\b\u0001\u0010￩�\n�\u0003\u0001\u000e\uffdf\u000b\n\n\u0001\uffff", false, 272 - TextUtils.indexOf((CharSequence) "", '0'), 12 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            f((ViewConfiguration.getLongPressTimeout() >> 16) + 45, "\u0006\uffff\u000e\uffe7\ufffb\b\ufffb\u0001\uffff\f￩\b\u0006\u0003\b\uffffￛ�\u000e\u0003\u0010\ufffb\u000e\u0003\t\b￩\b￡\t\u0003\b\u0001\t\bￛ\b\u000e\uffff\u0006\t\n\ufff1\ufffb\u0006", false, 274 - ExpandableListView.getPackedPositionChild(0L), ((byte) KeyEvent.getModifierMetaStateMask()) + 34, objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            int i5 = f26878h + 117;
            f26879i = i5 % 128;
            int i6 = i5 % 2;
        }
        f fVar = this.f26883d;
        if (fVar != null) {
            fVar.onError(new o.by.c(AntelopErrorCode.WalletNotActivated));
        }
        this.f26882c.a(this.f26884e);
    }

    @Override // o.c.e
    public final void d(o.bx.d dVar, o.j.b bVar, o.bg.c cVar) {
        int i2 = 2 % 2;
        int i3 = f26879i + 105;
        f26878h = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        f fVar = this.f26883d;
        if (fVar != null) {
            fVar.onError(new o.by.c(AntelopErrorCode.WalletNotActivated));
        }
        int i4 = f26878h + 37;
        f26879i = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.c.e
    public final void e(o.bg.c cVar) throws Throwable {
        int i2 = 2 % 2;
        if (o.ea.f.a()) {
            int i3 = f26879i + 53;
            f26878h = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            f(TextUtils.lastIndexOf("", '0', 0) + 42, "\u0010\u0005\u000b\n\uffdf�\b\b\ufffe�\uffff\u0007\uffef\uffff�\uffdd\n\u0010\u0001\b\u000b\f\ufff3�\b\b\u0001\u0010￩�\n�\u0003\u0001\u000e\uffdf\u000b\n\n\u0001\uffff", false, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 273, 12 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            f(View.MeasureSpec.getSize(0) + 40, "\u0011\u0006\f\u000b￣\ufffe\u0006\t\u0002\u0001ￅￆ\f\u000b\uffde\u000b\u0011\u0002\t\f\r\ufff4\ufffe\t\t\u0002\u0011￪\ufffe\u000b\ufffe\u0004\u0002\u000f￠\f\u000b\u000b\u0002\u0000", false, 272 - Gravity.getAbsoluteGravity(0, 0), Process.getGidForName("") + 13, objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        f fVar = this.f26883d;
        if (fVar != null) {
            int i5 = f26878h + 105;
            f26879i = i5 % 128;
            int i6 = i5 % 2;
            fVar.onError(o.by.c.b(cVar));
            int i7 = f26879i + 61;
            f26878h = i7 % 128;
            int i8 = i7 % 2;
        }
    }
}
