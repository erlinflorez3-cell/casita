package com.facetec.sdk;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.text.Typography;
import org.json.JSONObject;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes3.dex */
final class bt {
    private static long B = 0;
    private static HashMap<String, Integer> Code = null;
    private static int D = 0;
    private static int F = 1;
    private static String I = null;
    private static int L = 0;
    private static char S = 0;
    private static String V = null;
    private static boolean Z = false;

    /* JADX INFO: renamed from: com.facetec.sdk.bt$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Z;

        static {
            int[] iArr = new int[FaceTecSessionStatus.values().length];
            Z = iArr;
            try {
                iArr[FaceTecSessionStatus.NON_PRODUCTION_MODE_KEY_INVALID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Z[FaceTecSessionStatus.NON_PRODUCTION_MODE_NETWORK_REQUIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Z[FaceTecSessionStatus.GRACE_PERIOD_EXCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Z[FaceTecSessionStatus.USER_CANCELLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                Z[FaceTecSessionStatus.USER_CANCELLED_VIA_HARDWARE_BUTTON.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                Z[FaceTecSessionStatus.SESSION_COMPLETED_SUCCESSFULLY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                Z[FaceTecSessionStatus.SESSION_UNSUCCESSFUL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                Z[FaceTecSessionStatus.CAMERA_PERMISSION_DENIED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                Z[FaceTecSessionStatus.ENCRYPTION_KEY_INVALID.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                Z[FaceTecSessionStatus.TIMEOUT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                Z[FaceTecSessionStatus.CONTEXT_SWITCH.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                Z[FaceTecSessionStatus.CAMERA_INITIALIZATION_ISSUE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                Z[FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                Z[FaceTecSessionStatus.LANDSCAPE_MODE_NOT_ALLOWED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                Z[FaceTecSessionStatus.REVERSE_PORTRAIT_NOT_ALLOWED.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                Z[FaceTecSessionStatus.LOCKED_OUT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                Z[FaceTecSessionStatus.MISSING_GUIDANCE_IMAGES.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    static class V implements Runnable {
        private final WeakReference<Context> Z;

        V(Context context) throws Throwable {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.Qd("4@5B>71y.97<,49q\u00061/4$61", (short) (ZN.Xd() ^ 7479))).getMethod(C1593ug.zd("vu\u0006S\u0004\u0005\u0002\u007fzy\u000e\u0004\u000b\u000b`\u000e\u000e\u0015\u0007\u001b\u0018", (short) (C1633zX.Xd() ^ (-1919)), (short) (C1633zX.Xd() ^ (-23243))), new Class[0]);
            try {
                method.setAccessible(true);
                this.Z = new WeakReference<>((Context) method.invoke(context, objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            Context context = this.Z.get();
            if (context == null) {
                return;
            }
            try {
                Object[] objArr = new Object[0];
                Method method = Class.forName(C1561oA.od("\f\u0018\r\u001a\u0016\u000f\tQ\u0006\u0011\u000f\u0014\u0004\f\u0011I]\t\u0007\f{\u000e\t", (short) (C1499aX.Xd() ^ (-19980)))).getMethod(C1561oA.Kd("43C\u001325;9\u0019?I", (short) (C1499aX.Xd() ^ (-27422))), new Class[0]);
                try {
                    method.setAccessible(true);
                    bt.I((File) method.invoke(context, objArr));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (Exception e3) {
                ce.I(e3.getMessage());
            }
        }
    }

    static {
        Z();
        V = "";
        Z = false;
        I = "";
        int i2 = D + 23;
        F = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 52 / 0;
        }
    }

    bt() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        r1 = new java.lang.Thread(new com.facetec.sdk.bt.V(r3));
        r1.setPriority(1);
        r1.start();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r3 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        r1 = r1 + 45;
        com.facetec.sdk.bt.F = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r3 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void B(android.content.Context r3) {
        /*
            r2 = 2
            int r0 = r2 % r2
            int r0 = com.facetec.sdk.bt.F
            int r0 = r0 + 13
            int r1 = r0 % 128
            com.facetec.sdk.bt.D = r1
            int r0 = r0 % r2
            if (r0 == 0) goto L1c
            r0 = 80
            int r0 = r0 / 0
            if (r3 != 0) goto L1f
        L14:
            int r1 = r1 + 45
            int r0 = r1 % 128
            com.facetec.sdk.bt.F = r0
            int r1 = r1 % r2
            return
        L1c:
            if (r3 != 0) goto L1f
            goto L14
        L1f:
            java.lang.Thread r1 = new java.lang.Thread
            com.facetec.sdk.bt$V r0 = new com.facetec.sdk.bt$V
            r0.<init>(r3)
            r1.<init>(r0)
            r0 = 1
            r1.setPriority(r0)
            r1.start()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.bt.B(android.content.Context):void");
    }

    private static byte[] B() throws Exception {
        int i2 = 2 % 2;
        byte[] bArrB = C1150r.B(new StringBuilder().append(V).append(I).append(V("\u0000\u0000\u0000\u0000", (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), "圢ₗ혵屪", 891328343 - (ViewConfiguration.getWindowTouchSlop() >> 8), "뗐欈䯯슼ꙻ熏츴ً뵱ፑᄐ").intern()).toString());
        int i3 = F + 125;
        D = i3 % 128;
        int i4 = i3 % 2;
        return bArrB;
    }

    static String Code() {
        int i2 = 2 % 2;
        int i3 = F + 73;
        D = i3 % 128;
        int i4 = i3 % 2;
        String string = Code.toString();
        int i5 = F + 103;
        D = i5 % 128;
        int i6 = i5 % 2;
        return string;
    }

    static void Code(Context context) {
        int i2 = 2 % 2;
        int i3 = F + 53;
        D = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (Z) {
            return;
        }
        Code = new HashMap<>();
        FaceTecSessionStatus[] faceTecSessionStatusArrValues = FaceTecSessionStatus.values();
        int length = faceTecSessionStatusArrValues.length;
        int i4 = 0;
        while (i4 < length) {
            int i5 = F + 17;
            D = i5 % 128;
            if (i5 % 2 != 0) {
                Code.put(I(faceTecSessionStatusArrValues[i4]), 0);
                i4 += 96;
            } else {
                Code.put(I(faceTecSessionStatusArrValues[i4]), 0);
                i4++;
            }
        }
        Code.put(V(C1561oA.Xd("ϯϰϱϲ", (short) (C1499aX.Xd() ^ (-10602))), (char) (18303 - TextUtils.indexOf("", "", 0, 0)), Wg.vd("⨵㬛ⲫ頱", (short) (OY.Xd() ^ 23549)), View.MeasureSpec.getSize(0), Wg.Zd("욚༭", (short) (Od.Xd() ^ (-3445)), (short) (Od.Xd() ^ (-24620)))).intern(), 1);
        short sXd = (short) (Od.Xd() ^ (-6076));
        short sXd2 = (short) (Od.Xd() ^ (-30009));
        int[] iArr = new int["&2'40)#k +).\u001e&+cw#!&\u0016(#".length()];
        QB qb = new QB("&2'40)#k +).\u001e&+cw#!&\u0016(#");
        int i6 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i6] = xuXd.fK(((sXd + i6) + xuXd.CK(iKK)) - sXd2);
            i6++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i6)).getMethod(yg.hg.Vd("KHV1ABI>C@(:E<", (short) (OY.Xd() ^ 25585), (short) (OY.Xd() ^ 32086)), new Class[0]);
        try {
            method.setAccessible(true);
            V = (String) method.invoke(context, objArr);
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(C1561oA.ud("!-\"/+$\u001ef\u001b&$)\u0019!&^r\u001e\u001c!\u0011#\u001e", (short) (C1580rY.Xd() ^ (-26312)))).getMethod(C1561oA.yd("ihxHuu|nhoNbqnlww\u0006", (short) (C1499aX.Xd() ^ (-31708))), new Class[0]);
            try {
                method2.setAccessible(true);
                I = Settings.Secure.getString((ContentResolver) method2.invoke(context, objArr2), C1561oA.Yd("\u0017%\u001c+)$ \u001c'#", (short) (C1607wl.Xd() ^ 17623)));
                V(context);
                Z = true;
                int i7 = F + 13;
                D = i7 % 128;
                int i8 = i7 % 2;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    static int I(Context context) {
        int i2 = 2 % 2;
        int i3 = F + 85;
        D = i3 % 128;
        if (i3 % 2 == 0 ? !Code.containsKey(V("\u0000\u0000\u0000\u0000", (char) (TextUtils.lastIndexOf("", '0', 0) + 18304), "絊踯翂\ueb47", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "㕸粌").intern()) : !Code.containsKey(V("\u0000\u0000\u0000\u0000", (char) (21959 >> TextUtils.lastIndexOf("", Typography.greater, 1)), "絊踯翂\ueb47", (TypedValue.complexToFraction(0, 2.0f, 1.0f) > 2.0f ? 1 : (TypedValue.complexToFraction(0, 2.0f, 1.0f) == 2.0f ? 0 : -1)), "㕸粌").intern())) {
            Z(context);
        }
        int iIntValue = Code.get(V("\u0000\u0000\u0000\u0000", (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 18303), "絊踯翂\ueb47", Color.alpha(0), "㕸粌").intern()).intValue();
        int i4 = F + 45;
        D = i4 % 128;
        int i5 = i4 % 2;
        return iIntValue;
    }

    private static String I(FaceTecSessionStatus faceTecSessionStatus) {
        int i2 = 2 % 2;
        switch (AnonymousClass1.Z[faceTecSessionStatus.ordinal()]) {
            case 1:
                return "LI";
            case 2:
                return "DM";
            case 3:
                return "OE";
            case 4:
                return "UC";
            case 5:
                return "CH";
            case 6:
                return "PS";
            case 7:
                int i3 = F + 49;
                D = i3 % 128;
                int i4 = i3 % 2;
                return "NP";
            case 8:
                return "CD";
            case 9:
                return "EI";
            case 10:
                int i5 = F + 121;
                D = i5 % 128;
                int i6 = i5 % 2;
                return "TO";
            case 11:
                return "CS";
            case 12:
                return "CE";
            case 13:
                return "IE";
            case 14:
                return "LA";
            case 15:
                return "RP";
            case 16:
                return "UL";
            case 17:
                return "GI";
            default:
                return "NA";
        }
    }

    static void I(FaceTecSessionStatus faceTecSessionStatus, Context context) {
        int i2 = 2 % 2;
        int i3 = F + 93;
        D = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (Z) {
            String strI = I(faceTecSessionStatus);
            if (Code.get(strI) == null) {
                int i4 = F + 65;
                D = i4 % 128;
                int i5 = i4 % 2;
                Code.put(strI, 0);
            } else {
                HashMap<String, Integer> map = Code;
                map.put(strI, Integer.valueOf(map.get(strI).intValue() + 1));
            }
            B(context);
            int i6 = F + 121;
            D = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    static /* synthetic */ void I(File file) throws Exception {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(V("\u0000\u0000\u0000\u0000", (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), "䓲戍ۃ㟧", ((byte) KeyEvent.getModifierMetaStateMask()) - 1016984251, "뎈궳塍Ϡ兲ꝸ䫺").intern(), new JSONObject(Code));
        jSONObject.put(V("\u0000\u0000\u0000\u0000", (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 47010), "\ue278̄ꏡ⮷", (-519895837) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), "\ue101").intern(), ce.V(16, 128));
        m.I(new File(file, V()), B(), jSONObject.toString().getBytes(StandardCharsets.UTF_8));
        int i3 = D + 49;
        F = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    private static String V() throws Exception {
        int i2 = 2 % 2;
        String strI = C1150r.I(new StringBuilder().append(V).append(I).append(V("\u0000\u0000\u0000\u0000", (char) (ViewConfiguration.getEdgeSlop() >> 16), "䯷㲁ힶ⧛", TextUtils.indexOf((CharSequence) "", '0', 0) - 1237548724, "嬙\uea05篩縲㚿\uf6f4≿턚읷鸷⒱輡ﾻ㔙ᝈ堃齖敶\ue9c3䝊䋖").intern()).toString());
        int i3 = F + 105;
        D = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 4 / 0;
        }
        return strI;
    }

    private static String V(String str, char c2, String str2, int i2, String str3) {
        int i3 = 2 % 2;
        int i4 = D + 39;
        F = i4 % 128;
        Object charArray = str3;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            int i5 = F + 59;
            D = i5 % 128;
            int i6 = i5 % 2;
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = (char[]) cArr2.clone();
        char[] cArr4 = (char[]) ((char[]) charArray3).clone();
        cArr3[0] = (char) (c2 ^ cArr3[0]);
        cArr4[2] = (char) (cArr4[2] + ((char) i2));
        int length = cArr.length;
        char[] cArr5 = new char[length];
        for (int i7 = 0; i7 < length; i7++) {
            et.Z(cArr3, cArr4, i7);
            cArr5[i7] = (char) (((((long) (cArr[i7] ^ cArr3[(i7 + 3) % 4])) ^ B) ^ ((long) L)) ^ ((long) S));
        }
        return new String(cArr5);
    }

    private static boolean V(Context context) throws Throwable {
        int i2 = 2 % 2;
        try {
            byte[] bArrB = B();
            Object[] objArr = new Object[0];
            Method method = Class.forName(Xg.qd(">LCRPKG\u0012HUU\\NX_\u001a0]]dVjg", (short) (C1607wl.Xd() ^ 220), (short) (C1607wl.Xd() ^ 13349))).getMethod(Jg.Wd("k+}\u001f\u0002H\u0015f\b`;", (short) (C1499aX.Xd() ^ (-15323)), (short) (C1499aX.Xd() ^ (-5184))), new Class[0]);
            try {
                method.setAccessible(true);
                byte[] bArrI = m.I(new File((File) method.invoke(context, objArr), V()), bArrB);
                JSONObject jSONObject = new JSONObject(new String(bArrI, 0, bArrI.length, StandardCharsets.UTF_8));
                Code.clear();
                short sXd = (short) (OY.Xd() ^ 31363);
                short sXd2 = (short) (OY.Xd() ^ 14936);
                int[] iArr = new int["ɛӳɓЋ".length()];
                QB qb = new QB("ɛӳɓЋ");
                int i3 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd2) + sXd)));
                    i3++;
                }
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(V(new String(iArr, 0, i3), (char) View.MeasureSpec.makeMeasureSpec(0, 0), C1626yg.Ud("僾쎟²섙", (short) (OY.Xd() ^ 32018), (short) (OY.Xd() ^ 495)), View.MeasureSpec.getMode(0) - 1016984252, Ig.wd("퇻㊔풟Ѐ鉾\ue8d7诬", (short) (C1499aX.Xd() ^ (-31073)))).intern());
                if (jSONObjectOptJSONObject != null) {
                    int i4 = D + 73;
                    F = i4 % 128;
                    if (i4 % 2 == 0) {
                        jSONObjectOptJSONObject.keys();
                        Object obj = null;
                        super.hashCode();
                        throw null;
                    }
                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        Code.put(next, Integer.valueOf(jSONObjectOptJSONObject.optInt(next)));
                        int i5 = D + 99;
                        F = i5 % 128;
                        int i6 = i5 % 2;
                    }
                }
                int i7 = D + 121;
                F = i7 % 128;
                int i8 = i7 % 2;
                return true;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (FileNotFoundException unused) {
            return false;
        } catch (Exception e3) {
            ce.I(e3.getMessage());
            e3.getStackTrace();
            return false;
        }
    }

    static void Z() {
        S = (char) 2955;
        L = 0;
        B = 0L;
    }

    static void Z(Context context) {
        HashMap<String, Integer> map;
        char offsetAfter;
        long packedPositionForChild;
        int i2 = 2 % 2;
        int i3 = D + 19;
        F = i3 % 128;
        int i4 = i3 % 2;
        if (Z) {
            if (Code.get(V("\u0000\u0000\u0000\u0000", (char) (18303 - (KeyEvent.getMaxKeyCode() >> 16)), "絊踯翂\ueb47", View.MeasureSpec.getSize(0), "㕸粌").intern()) == null) {
                int i5 = F + 77;
                D = i5 % 128;
                if (i5 % 2 != 0) {
                    map = Code;
                    offsetAfter = (char) (TextUtils.getOffsetAfter("", 1) + 5144);
                    packedPositionForChild = ExpandableListView.getPackedPositionForChild(1, 0);
                } else {
                    map = Code;
                    offsetAfter = (char) (18303 - TextUtils.getOffsetAfter("", 0));
                    packedPositionForChild = ExpandableListView.getPackedPositionForChild(0, 0);
                }
                map.put(V("\u0000\u0000\u0000\u0000", offsetAfter, "絊踯翂\ueb47", (-1) - (packedPositionForChild > 0L ? 1 : (packedPositionForChild == 0L ? 0 : -1)), "㕸粌").intern(), 1);
            } else {
                Code.put(V("\u0000\u0000\u0000\u0000", (char) (KeyEvent.normalizeMetaState(0) + 18303), "絊踯翂\ueb47", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1, "㕸粌").intern(), Integer.valueOf(Code.get(V("\u0000\u0000\u0000\u0000", (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 18303), "絊踯翂\ueb47", (-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), "㕸粌").intern()).intValue() + 1));
                int i6 = D + 7;
                F = i6 % 128;
                int i7 = i6 % 2;
            }
            B(context);
        }
    }
}
