package o.r;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.mp4.media.Mp4VideoDirectory;
import com.dynatrace.android.callback.Callback;
import fr.antelop.sdk.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o.a.m;
import o.ea.f;
import o.ea.k;
import o.l.d;
import org.msgpack.core.MessagePack;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.CX;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends Fragment {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b */
    private static int f26781b = 0;

    /* JADX INFO: renamed from: c */
    private static char[] f26782c = null;

    /* JADX INFO: renamed from: f */
    private static int f26783f = 0;

    /* JADX INFO: renamed from: h */
    private static int f26784h = 0;

    /* JADX INFO: renamed from: i */
    private static int f26785i = 0;

    /* JADX INFO: renamed from: a */
    private final b f26786a;

    /* JADX INFO: renamed from: d */
    private final boolean f26787d;

    /* JADX INFO: renamed from: e */
    private final a f26788e;

    /* JADX INFO: renamed from: o.r.e$1 */
    final class AnonymousClass1 extends k {

        /* JADX INFO: renamed from: b */
        private static int f26789b = 0;

        /* JADX INFO: renamed from: d */
        private static int f26790d = 1;

        AnonymousClass1() {
        }

        @Override // o.ea.k
        public final void c(Context context) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f26790d;
            int i4 = (i3 ^ 17) + (((-1) - (((-1) - i3) | ((-1) - 17))) << 1);
            f26789b = i4 % 128;
            int i5 = i4 % 2;
            Context contextRequireContext = e.this.requireContext();
            int i6 = R.string.antelopScreenUnlockPromptOverlayWarningMessage;
            short sXd = (short) (C1580rY.Xd() ^ (-15626));
            short sXd2 = (short) (C1580rY.Xd() ^ (-14919));
            int[] iArr = new int["\u0016$\u001b*(#\u001fi --4&07q\b55<.B?".length()];
            QB qb = new QB("\u0016$\u001b*(#\u001fi --4&07q\b55<.B?");
            int i7 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i7] = xuXd.fK((xuXd.CK(iKK) - (sXd + i7)) + sXd2);
                i7++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i7));
            Class<?>[] clsArr = {Integer.TYPE};
            Object[] objArr = {Integer.valueOf(i6)};
            short sXd3 = (short) (C1580rY.Xd() ^ (-22988));
            short sXd4 = (short) (C1580rY.Xd() ^ (-6745));
            int[] iArr2 = new int["Y\u0001q*-\u0013\f\u000bM".length()];
            QB qb2 = new QB("Y\u0001q*-\u0013\f\u000bM");
            int i8 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i8] = xuXd2.fK(xuXd2.CK(iKK2) - ((i8 * sXd4) ^ sXd3));
                i8++;
            }
            Method method = cls.getMethod(new String(iArr2, 0, i8), clsArr);
            try {
                method.setAccessible(true);
                Toast.makeText(context, (String) method.invoke(contextRequireContext, objArr), 1).show();
                int i9 = f26789b + 61;
                f26790d = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 8 / 0;
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    interface b {
        void a();

        void a(d dVar);

        void d();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0027 -> B:17:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r8, byte r9, int r10) {
        /*
            int r9 = r9 + 4
            int r0 = r8 * 4
            int r0 = 120 - r0
            int r1 = r10 * 2
            int r8 = 1 - r1
            byte[] r7 = o.r.e.$$a
            byte[] r6 = new byte[r8]
            r5 = 0
            if (r7 != 0) goto L2b
            r2 = r9
            r1 = r8
            r4 = r5
        L14:
            int r9 = r9 + r1
            r3 = r4
            r0 = r9
            r9 = r2
        L18:
            int r2 = r9 + 1
            int r4 = r3 + 1
            byte r1 = (byte) r0
            r6[r3] = r1
            if (r4 != r8) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L27:
            r1 = r7[r2]
            r9 = r0
            goto L14
        L2b:
            r3 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r.e.$$c(int, byte, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f26784h = 0;
        f26783f = 1;
        f26781b = 0;
        f26785i = 1;
        a();
        int i2 = f26784h + 3;
        f26783f = i2 % 128;
        int i3 = i2 % 2;
    }

    public e(a aVar, boolean z2, b bVar) {
        this.f26788e = aVar;
        this.f26786a = bVar;
        this.f26787d = z2;
    }

    private View a(LayoutInflater layoutInflater, ViewGroup viewGroup) throws Throwable {
        int i2 = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.antelop_screenunlock_prompt_fragment, viewGroup, false);
        Button button = (Button) viewInflate.findViewById(R.id.antelop_screenunlock_prompt_button_submit);
        button.setText(this.f26788e.j());
        button.setOnClickListener(new View.OnClickListener() { // from class: o.r.e$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e.m10657xb30e4730(this.f$0, view);
            }
        });
        ((TextView) viewInflate.findViewById(R.id.antelop_screenunlock_prompt_title)).setText(this.f26788e.h());
        ((TextView) viewInflate.findViewById(R.id.antelop_screenunlock_prompt_subtitle)).setText(this.f26788e.i());
        ((ImageView) viewInflate.findViewById(R.id.antelop_screenunlock_prompt_cancel)).setOnClickListener(new View.OnClickListener() { // from class: o.r.e$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e.m10658xcc0f98cf(this.f$0, view);
            }
        });
        Context contextRequireContext = requireContext();
        Object[] objArr = new Object[0];
        Method method = Class.forName(ZO.xd("93V\u001dl|la7,g,/\u001c\u001fW\u0005;tI\u000bfS", (short) (OY.Xd() ^ 30256), (short) (OY.Xd() ^ 6687))).getMethod(C1626yg.Ud("V\n\f{\t\u0001LK6B$#", (short) (C1607wl.Xd() ^ 2042), (short) (C1607wl.Xd() ^ 29454)), new Class[0]);
        try {
            method.setAccessible(true);
            if (((Resources) method.invoke(contextRequireContext, objArr)).getBoolean(R.bool.antelopScreenUnlockPromptEnableOverlayProtection)) {
                button.setOnTouchListener(new k() { // from class: o.r.e.1

                    /* JADX INFO: renamed from: b */
                    private static int f26789b = 0;

                    /* JADX INFO: renamed from: d */
                    private static int f26790d = 1;

                    AnonymousClass1() {
                    }

                    @Override // o.ea.k
                    public final void c(Context context) throws Throwable {
                        int i22 = 2 % 2;
                        int i3 = f26790d;
                        int i4 = (i3 ^ 17) + (((-1) - (((-1) - i3) | ((-1) - 17))) << 1);
                        f26789b = i4 % 128;
                        int i5 = i4 % 2;
                        Context contextRequireContext2 = e.this.requireContext();
                        int i6 = R.string.antelopScreenUnlockPromptOverlayWarningMessage;
                        short sXd = (short) (C1580rY.Xd() ^ (-15626));
                        short sXd2 = (short) (C1580rY.Xd() ^ (-14919));
                        int[] iArr = new int["\u0016$\u001b*(#\u001fi --4&07q\b55<.B?".length()];
                        QB qb = new QB("\u0016$\u001b*(#\u001fi --4&07q\b55<.B?");
                        int i7 = 0;
                        while (qb.YK()) {
                            int iKK = qb.KK();
                            Xu xuXd = Xu.Xd(iKK);
                            iArr[i7] = xuXd.fK((xuXd.CK(iKK) - (sXd + i7)) + sXd2);
                            i7++;
                        }
                        Class<?> cls = Class.forName(new String(iArr, 0, i7));
                        Class<?>[] clsArr = {Integer.TYPE};
                        Object[] objArr2 = {Integer.valueOf(i6)};
                        short sXd3 = (short) (C1580rY.Xd() ^ (-22988));
                        short sXd4 = (short) (C1580rY.Xd() ^ (-6745));
                        int[] iArr2 = new int["Y\u0001q*-\u0013\f\u000bM".length()];
                        QB qb2 = new QB("Y\u0001q*-\u0013\f\u000bM");
                        int i8 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i8] = xuXd2.fK(xuXd2.CK(iKK2) - ((i8 * sXd4) ^ sXd3));
                            i8++;
                        }
                        Method method2 = cls.getMethod(new String(iArr2, 0, i8), clsArr);
                        try {
                            method2.setAccessible(true);
                            Toast.makeText(context, (String) method2.invoke(contextRequireContext2, objArr2), 1).show();
                            int i9 = f26789b + 61;
                            f26790d = i9 % 128;
                            if (i9 % 2 == 0) {
                                int i10 = 8 / 0;
                            }
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    }
                });
                int i3 = f26785i + 47;
                f26781b = i3 % 128;
                int i4 = i3 % 2;
            }
            int i5 = f26781b + 73;
            f26785i = i5 % 128;
            int i6 = i5 % 2;
            return viewInflate;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static void a() {
        f26782c = new char[]{56498, 56553, 56554, 56548, 56553, 56540, 56541, 56554, 56552, 56558, 56558, 56537, 56535, 56551, 56553, 56557, 56557, 56545, 56545, 56553, 56549, 56555, 56554, 56539, 56547, 56561, 56379, 56381, 56384, 56340, 56377, 56369, 56381, 56378, 56380, 56355, 56386, 56385, 56371, 56387, 56383, 56371, 56384, 56380, 56371, 56371, 56384, 56369, 56353, 56370, 56371, 56377, 56369, 56381, 56378, 56380, 56355, 56326, 56714, 56721, 56722, 56720, 56717, 56715, 56717, 56498, 56549, 56555, 56554, 56539, 56539, 56548, 56552, 56551, 56553, 56557, 56557, 56545, 56545, 56558, 56560, 56540, 56536, 56551, 56553, 56557, 56557, 56545, 56548, 56563, 56556, 56557, 56563, 56555, 56555, 56562, 56555, 56550, 56548, 56551, 56551, 56535, 56536, 56555, 56553, 56555, 56558, 56560, 56559, 56536, 56501, 56518, 56556, 56560, 56561, 56519, 56486, 56486, 56519};
    }

    private void a(Context context) throws Exception {
        int i2 = 2 % 2;
        int i3 = f26781b + 47;
        f26785i = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            f.a();
            obj.hashCode();
            throw null;
        }
        boolean zA = f.a();
        String strWd = Ig.wd(",ӋѼƛ\u000eɳώ\u0015b\u0014ίԌԹӂɍ/ǡn$\u000e˴tH;@Ɉ", (short) (ZN.Xd() ^ 22439));
        if (zA) {
            Object[] objArr = new Object[1];
            g(strWd, new int[]{0, 26, 0, 24}, true, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            g(null, new int[]{26, 31, 78, 17}, true, objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
        }
        int[] iArr = {57, 8, 162, 0};
        Object[] objArr3 = new Object[1];
        short sXd = (short) (FB.Xd() ^ 16394);
        int[] iArr2 = new int["Pܢ\u07b5і۳ڰ\fײ".length()];
        QB qb = new QB("Pܢ\u07b5і۳ڰ\fײ");
        int i4 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr2[i4] = xuXd.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd + sXd) + i4)) + xuXd.CK(iKK));
            i4++;
        }
        g(new String(iArr2, 0, i4), iArr, false, objArr3);
        Object[] objArr4 = {((String) objArr3[0]).intern()};
        Method method = Class.forName(C1561oA.Qd("-9.;70*r'205%-2j~*(-\u001d/*", (short) (ZN.Xd() ^ 28982))).getMethod(C1561oA.od("SP^<aZZJQ6GSVHAB", (short) (ZN.Xd() ^ 21184)), Class.forName(C1593ug.zd("5-C/|<2@:\u0002(JIAGA", (short) (C1633zX.Xd() ^ (-25209)), (short) (C1633zX.Xd() ^ (-30076)))));
        try {
            method.setAccessible(true);
            KeyguardManager keyguardManager = (KeyguardManager) method.invoke(context, objArr4);
            if (keyguardManager != null) {
                Intent intentCreateConfirmDeviceCredentialIntent = keyguardManager.createConfirmDeviceCredentialIntent(this.f26788e.h(), this.f26788e.i());
                if (intentCreateConfirmDeviceCredentialIntent == null) {
                    this.f26786a.a(d.f26354c);
                    return;
                } else {
                    CX.ud();
                    startActivityForResult(intentCreateConfirmDeviceCredentialIntent, 1042);
                    return;
                }
            }
            if (f.a()) {
                Object[] objArr5 = new Object[1];
                g(strWd, new int[]{0, 26, 0, 24}, true, objArr5);
                String strIntern2 = ((String) objArr5[0]).intern();
                Object[] objArr6 = new Object[1];
                g(C1561oA.Kd(",Ũ./ū12ŮůŰ6Ų8Ŵŵ;ŷ=Źź@żBCDƀƁƂƃIƅKƇƈNOƋQƍSƏƐƑƒƓYƕƖ\\]ƙ_`Ɯ", (short) (C1633zX.Xd() ^ (-18767))), new int[]{65, 54, 0, 30}, true, objArr6);
                f.d(strIntern2, ((String) objArr6[0]).intern());
            }
            this.f26786a.a(d.f26354c);
            int i5 = f26781b + 55;
            f26785i = i5 % 128;
            int i6 = i5 % 2;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private /* synthetic */ void c(View view) {
        int i2 = 2 % 2;
        int i3 = f26785i + 33;
        f26781b = i3 % 128;
        if (i3 % 2 == 0) {
            requireActivity().finish();
        } else {
            requireActivity().finish();
            throw null;
        }
    }

    private /* synthetic */ void e(View view) {
        int i2 = 2 % 2;
        int i3 = f26785i + 15;
        f26781b = i3 % 128;
        int i4 = i3 % 2;
        this.f26786a.a();
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void g(String str, int[] iArr, boolean z2, Object[] objArr) throws Throwable {
        char[] cArr;
        String str2 = str;
        int i2 = 2;
        int i3 = 2 % 2;
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        m mVar = new m();
        int i4 = 0;
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr2 = f26782c;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i9])};
                    Object objA = o.d.d.a(-2071388435);
                    if (objA == null) {
                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 249;
                        char cMyPid = (char) (Process.myPid() >> 22);
                        int size = 11 - View.MeasureSpec.getSize(i4);
                        byte b2 = (byte) ((-1) - (((-1) - $$b) | ((-1) - 3)));
                        objA = o.d.d.a(pressedStateDuration, cMyPid, size, 1376582792, false, $$c(b2, (byte) (-b2), $$a[2]), new Class[]{Integer.TYPE});
                    }
                    cArr3[i9] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i9++;
                    i4 = 0;
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
        char[] cArr4 = new char[i6];
        char c2 = 0;
        System.arraycopy(cArr2, i5, cArr4, 0, i6);
        if (bArr != null) {
            int i10 = $10 + 7;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                cArr = new char[i6];
                mVar.f19943d = 0;
            } else {
                cArr = new char[i6];
                mVar.f19943d = 0;
                c2 = 0;
            }
            while (mVar.f19943d < i6) {
                if (bArr[mVar.f19943d] == 1) {
                    int i11 = mVar.f19943d;
                    char c3 = cArr4[mVar.f19943d];
                    Object[] objArr3 = new Object[i2];
                    objArr3[1] = Integer.valueOf(c2);
                    objArr3[0] = Integer.valueOf(c3);
                    Object objA2 = o.d.d.a(120026474);
                    if (objA2 == null) {
                        int mirror = ';' - AndroidCharacter.getMirror('0');
                        char defaultSize = (char) View.getDefaultSize(0, 0);
                        int absoluteGravity = 10 - Gravity.getAbsoluteGravity(0, 0);
                        Class[] clsArr = new Class[i2];
                        clsArr[0] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        objA2 = o.d.d.a(mirror, defaultSize, absoluteGravity, -777873649, false, "p", clsArr);
                    }
                    cArr[i11] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                } else {
                    int i12 = mVar.f19943d;
                    char c4 = cArr4[mVar.f19943d];
                    Object[] objArr4 = new Object[i2];
                    objArr4[1] = Integer.valueOf(c2);
                    objArr4[0] = Integer.valueOf(c4);
                    Object objA3 = o.d.d.a(1632715197);
                    if (objA3 == null) {
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 836;
                        char c5 = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 27279);
                        int capsMode = 11 - TextUtils.getCapsMode("", 0, 0);
                        byte b3 = $$a[i2];
                        byte b4 = b3;
                        objA3 = o.d.d.a(scrollDefaultDelay, c5, capsMode, -1210801192, false, $$c(b4, (byte) (b4 - 1), b3), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i12] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr[mVar.f19943d];
                Object[] objArr5 = {mVar, mVar};
                Object objA4 = o.d.d.a(-1041906996);
                if (objA4 == null) {
                    objA4 = o.d.d.a((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 21, (char) (((Process.getThreadPriority(0) + 20) >> 6) + 35715), TextUtils.getOffsetAfter("", 0) + 11, 392175785, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
                i2 = 2;
            }
            cArr4 = cArr;
        }
        if (i8 > 0) {
            int i13 = $11 + 113;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                char[] cArr5 = new char[i6];
                System.arraycopy(cArr4, 0, cArr5, 1, i6);
                System.arraycopy(cArr5, 0, cArr4, i6 << i8, i8);
                System.arraycopy(cArr5, i8, cArr4, 0, i6 >>> i8);
            } else {
                char[] cArr6 = new char[i6];
                System.arraycopy(cArr4, 0, cArr6, 0, i6);
                int i14 = i6 - i8;
                System.arraycopy(cArr6, 0, cArr4, i14, i8);
                System.arraycopy(cArr6, i8, cArr4, 0, i14);
            }
        }
        if (z2) {
            int i15 = $10 + 15;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            char[] cArr7 = new char[i6];
            int i17 = 0;
            while (true) {
                mVar.f19943d = i17;
                if (mVar.f19943d >= i6) {
                    break;
                }
                int i18 = $10 + 123;
                $11 = i18 % 128;
                if (i18 % 2 == 0) {
                    cArr7[mVar.f19943d] = cArr4[mVar.f19943d * i6];
                    i17 = mVar.f19943d - 1;
                } else {
                    cArr7[mVar.f19943d] = cArr4[(i6 - mVar.f19943d) - 1];
                    i17 = mVar.f19943d + 1;
                }
            }
            cArr4 = cArr7;
        }
        if (i7 > 0) {
            int i19 = $10 + 125;
            $11 = i19 % 128;
            int i20 = i19 % 2;
            mVar.f19943d = 0;
            int i21 = $11 + 1;
            $10 = i21 % 128;
            int i22 = i21 % 2;
            while (mVar.f19943d < i6) {
                cArr4[mVar.f19943d] = (char) (cArr4[mVar.f19943d] - iArr[2]);
                mVar.f19943d++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    static void init$0() {
        $$a = new byte[]{123, MessagePack.Code.FLOAT32, 0, -17};
        $$b = Mp4VideoDirectory.TAG_COLOR_TABLE;
    }

    /* JADX INFO: renamed from: instrumented$0$a$-Landroid-view-LayoutInflater-Landroid-view-ViewGroup--Landroid-view-View- */
    public static /* synthetic */ void m10657xb30e4730(e eVar, View view) {
        Callback.onClick_enter(view);
        try {
            eVar.c(view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: renamed from: instrumented$1$a$-Landroid-view-LayoutInflater-Landroid-view-ViewGroup--Landroid-view-View- */
    public static /* synthetic */ void m10658xcc0f98cf(e eVar, View view) {
        Callback.onClick_enter(view);
        try {
            eVar.e(view);
        } finally {
            Callback.onClick_exit();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i2, int i3, Intent intent) {
        int i4 = 2 % 2;
        int i5 = f26785i;
        int i6 = i5 + 11;
        f26781b = i6 % 128;
        if (i6 % 2 != 0) {
            if (i2 != 21931) {
                return;
            }
        } else if (i2 != 1042) {
            return;
        }
        int i7 = i5 + 55;
        f26781b = i7 % 128;
        int i8 = i7 % 2;
        if (i3 == -1) {
            int i9 = i5 + 33;
            f26781b = i9 % 128;
            int i10 = i9 % 2;
            this.f26786a.d();
            return;
        }
        this.f26786a.a();
        int i11 = f26785i + 11;
        f26781b = i11 % 128;
        int i12 = i11 % 2;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Exception {
        int i2 = 2 % 2;
        if (!this.f26787d) {
            a(requireContext());
            return new FrameLayout(layoutInflater.getContext());
        }
        int i3 = f26781b + 17;
        f26785i = i3 % 128;
        int i4 = i3 % 2;
        View viewA = a(layoutInflater, viewGroup);
        int i5 = f26781b + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f26785i = i5 % 128;
        if (i5 % 2 != 0) {
            return viewA;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
