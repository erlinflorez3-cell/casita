package androidx.compose.material3.internal;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.text.StringsKt;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message tag had invalid wire type.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidWireType(InvalidProtocolBufferException.java:99)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:268)
    	at kotlin.metadata.internal.protobuf.GeneratedMessageLite.parseUnknownField(GeneratedMessageLite.java:73)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:110)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 5 more
    */
/* JADX INFO: compiled from: AccessibilityServiceStateProvider.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u0016DLc\u000b\u0004I\u0006>\u00146B\u0005,4\u0012}\bnj?4Le^.ZS0\u0010s{B$c$wGcU(\u000f(\neȞ\u0018g\u001dI\u000b\u0011S\u0011\u0016\u0016'kZI\u000ew}R\"BF}AKM\u001e>Id\u00039\u001d `#أ}\u0005\u000f\u001erV\u001e\u0011\u0013Cy'B4N\rRR;NK.Z\u0012L=\u0019\u001e\u000b\u0003~:V\u000bu:]:KuPm?_^\u0018}\u0011Tr?\r%xnTN=M\u0015ST3\u000b``W\u0003mrsE'g}ǥɭsɱ:h\b\u0016\u001b6]\u0019ut,c\u0013Y\u0001\u000e-4]m\u001c`\u001c5\u0010|\u0012\fj\u0012dͽ)ρ2/\"f\u0016\u001d\u0004\u0005\u0001cXR\u0018]p\u0011Qʫ8а)\u0002;+G-7coN1Ne|;atŗ\u0003ͼ%_l\u0010f))iHg?gX=vO2Yk\u0005:19̦,˙4K\u00181\u0002)<0Ï;|"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\u0015QQJk=\u001e\">", "\u001a`]1e6BRb\u0010~^>F\u0005-c\u007f6\nD}\u001b\u001eK~\"\u0006R#3Y\f.;j\u001a5QROS0'\u0011jaFE?*Lv5UPK0cV\u0002Q\u0002!V\u001dN\t\u0010\u0001bC$UHE.\b5I\u000f\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "", ":hbAX5-]\b\t\u000b\\/\\\u001c:l\n5wO\u0005! 5~\nKv", ":hbAX5-]\u0007\u0011~m*\u007fd-c\u007f6\n.\u0010\u0013&G", "uYIuI", "\nrTA \u0006\u0017", "/bR2f:BP\u001d\u0006~m@\\\u0012+b\u0007(z", "5dc\u000eV*>a'\u0003wb3\u0001\u0018CE\t$xG\u0001\u0016", "u(I", "Adc\u000eV*>a'\u0003wb3\u0001\u0018CE\t$xG\u0001\u0016", "uY\u0018#", "/bR2f:BP\u001d\u0006~m@\\\u0012+b\u0007(z~\u007f\u0017\u001eGq\nKv", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "AvXAV/\u001aQ\u0017~\tl\u0013\u0001\u0017>e\t(\t", "/mS?b0=fb|\u0005f7\u0007\u0017//\b$\u000b@\u000e\u001b\u0013N=W@\u007f45f\u0007\u001c>7|2[R;t4+Svs=\u0016a/*t%GZ\\\u0013``\u0002=\u001d\u0012gL\u001a", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\u0015QQJk=\u001e\"'oK\u000br*QR%EL\\:CV\u0001L\u0014\u001bZ\u001b\rvb", "Bnd0[\fQ^ \t\bZ;\u0001\u00138L\u00046\u000b@\n\u0017$", "/mS?b0=fb|\u0005f7\u0007\u0017//\b$\u000b@\u000e\u001b\u0013N=W@\u007f45f\u0007\u001c>7|2[R;t4+SwkI\u0005f\fa\u0002.QYJ;`\\{$\u0018 i\u000eW+\u001aC%", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\u0015QQJk=\u001e\"'pC\u0017a/.\n2NV[(kV|Fz\u0016h\u001dN4\r\u0012\u0018\ry", "D`[BX", "5dc#T3NS", "u(;7T=:\u001d z\u0004`uY\u00139l\u007f$\u0005\u0016", "AvXAV/\u001aQ\u0017~\tl\f\u0006\u0005,l\u007f'", "\u001a`]1e6BRb\u0010~^>F\u0005-c\u007f6\nD}\u001b\u001eK~\"\u0006R#3Y\f.;j\u001a5QROS0'\u0011jaF\\", "5dc j0MQ\u001cZx\\,\u000b\u0017\u000fn{%\u0003@\u007f", "uKP;W9HW\u0018H\fb,\u000fR+c}(\nN\u0005\u0014\u001bNs\u001dP@\u00013W}.Eq\u00132TGJ\u007f\u001c\u001a\u001edc9\u00149oC", "=m00V,La\u001d{~e0\f\u001d\u001dt{7{\u001e\u0004\u0013 Io\r", "", "3mP/_,=", "@dV6f;>`", "/l", "Cma2Z0Lb\u0019\f", "\u000foX\u007f&\u0010F^ ", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class Listener implements AccessibilityManager.AccessibilityStateChangeListener, State<Boolean> {
    private final MutableState accessibilityEnabled$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    private final Listener$switchAccessListener$1 switchAccessListener;
    private final Listener$touchExplorationListener$1 touchExplorationListener;

    public Listener(boolean z2, boolean z3) {
        Listener$switchAccessListener$1 listener$switchAccessListener$1 = null;
        this.touchExplorationListener = z2 ? new Listener$touchExplorationListener$1() : null;
        if (z3 && Build.VERSION.SDK_INT >= 33) {
            listener$switchAccessListener$1 = new Listener$switchAccessListener$1(this);
        }
        this.switchAccessListener = listener$switchAccessListener$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getAccessibilityEnabled() {
        return ((Boolean) this.accessibilityEnabled$delegate.getValue()).booleanValue();
    }

    private final void setAccessibilityEnabled(boolean z2) {
        this.accessibilityEnabled$delegate.setValue(Boolean.valueOf(z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getSwitchAccessEnabled(AccessibilityManager accessibilityManager) throws Throwable {
        Object[] objArr = {16};
        Method method = Class.forName(ZO.xd("|\u000eD%I[Ev?hv~9\u0015s[e&-[\u001d\u001d@>\u0010_\u0003|\f;k\f\u0018\u001e\\vXI\u0017\u007f%wmD<k'", (short) (C1499aX.Xd() ^ (-8478)), (short) (C1499aX.Xd() ^ (-15209)))).getMethod(C1626yg.Ud("!\"9\u0013\u000f\u0003IlH{-i\u000f_0B][?0r@\u0004}!|DSKg,\u0012vZ", (short) (FB.Xd() ^ 18656), (short) (FB.Xd() ^ 1605)), Integer.TYPE);
        try {
            method.setAccessible(true);
            List list = (List) method.invoke(accessibilityManager, objArr);
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                String settingsActivityName = ((AccessibilityServiceInfo) list.get(i2)).getSettingsActivityName();
                if (settingsActivityName != null) {
                    String str = settingsActivityName;
                    short sXd = (short) (OY.Xd() ^ 24007);
                    int[] iArr = new int[".\rnT@\u0010\u00177\u0014hzZ".length()];
                    QB qb = new QB(".\rnT@\u0010\u00177\u0014hzZ");
                    int i3 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd + i3)));
                        i3++;
                    }
                    if (StringsKt.contains$default((CharSequence) str, (CharSequence) new String(iArr, 0, i3), false, 2, (Object) null)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    @Override // androidx.compose.runtime.State
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Boolean getValue() {
        /*
            r2 = this;
            boolean r0 = r2.getAccessibilityEnabled()
            r1 = 0
            if (r0 == 0) goto L1c
            androidx.compose.material3.internal.Listener$touchExplorationListener$1 r0 = r2.touchExplorationListener
            if (r0 == 0) goto L23
            boolean r0 = r0.getEnabled()
        Lf:
            if (r0 != 0) goto L1b
            androidx.compose.material3.internal.Listener$switchAccessListener$1 r0 = r2.switchAccessListener
            if (r0 == 0) goto L21
            boolean r0 = r0.getEnabled()
        L19:
            if (r0 == 0) goto L1c
        L1b:
            r1 = 1
        L1c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L21:
            r0 = r1
            goto L19
        L23:
            r0 = r1
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.Listener.getValue():java.lang.Boolean");
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean z2) {
        setAccessibilityEnabled(z2);
    }

    public final void register(AccessibilityManager accessibilityManager) throws Throwable {
        Listener$switchAccessListener$1 listener$switchAccessListener$1;
        Class<?> cls = Class.forName(EO.Od("H\u0003-UE\fT\u0011\u0004%!S8g\u00100f\u0001+\u000b>oC<#\u0018.\u000bzlN<$wR\u0017}bv\u0006a]\u001a\u000b*8+", (short) (C1499aX.Xd() ^ (-11303))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1633zX.Xd() ^ (-7059));
        int[] iArr = new int["s|Muggphf".length()];
        QB qb = new QB("s|Muggphf");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            setAccessibilityEnabled(((Boolean) method.invoke(accessibilityManager, objArr)).booleanValue());
            Object[] objArr2 = {this};
            Method method2 = Class.forName(C1593ug.zd("SaXge`\\'pdat,`cdgvwnhptr~\u0005:Nqru\u0005\u0006|v~\u0003\u0001\r\u0013g|\u000b~\u0006\u0005\u0013", (short) (ZN.Xd() ^ 20237), (short) (ZN.Xd() ^ 17512))).getMethod(C1561oA.Kd("Z^_=`adstkemqo{\u0002\\~l\u0001rQwq\u007fyx`~\n\f}\b\u007f\u000e", (short) (C1580rY.Xd() ^ (-1285))), Class.forName(C1561oA.od("{\b|\n\u0006~xA\tzu\u0007<nono|{phnplvz.@a`anmbZ`b^hl?R^PUR^\u000f+LKLYXMEKMISW0P<N>\u001b?7C;8\u001e:CC3;1=", (short) (OY.Xd() ^ 26490))));
            try {
                method2.setAccessible(true);
                method2.invoke(accessibilityManager, objArr2);
                Listener$touchExplorationListener$1 listener$touchExplorationListener$1 = this.touchExplorationListener;
                if (listener$touchExplorationListener$1 != null) {
                    Object[] objArr3 = new Object[0];
                    Method method3 = Class.forName(Wg.Zd("j\u0006\t!;\u000bP'\u000e\u0012[<\fU%.N2<\u007f\u0016/\u007fJo\u0002H))3Jf@\u0004\u0013#D\u000fk~oMp1Q\\7", (short) (OY.Xd() ^ 26353), (short) (OY.Xd() ^ 9362))).getMethod(C1561oA.Xd(">I+GN=C!UNKOSCWMTT,VJLWQQ", (short) (ZN.Xd() ^ 32189)), new Class[0]);
                    try {
                        method3.setAccessible(true);
                        listener$touchExplorationListener$1.setEnabled(((Boolean) method3.invoke(accessibilityManager, objArr3)).booleanValue());
                        Class<?> cls2 = Class.forName(Wg.vd("\f\u0018\r\u001a\u0016\u000f\tQ)\u001b\u0016'\\\u000f\u0010\u000f\u007f\r\f\u0001x~\u0001|\u0017\u001bN`\u0002\u0001\u0002\u000f}rjprnx|_r~pur~", (short) (C1633zX.Xd() ^ (-8829))));
                        Class<?>[] clsArr2 = {Class.forName(Qg.kd(">J?LHA;\u0004K=8I~1212?>3+13/9=p\u0003$#$10%\u001d#%!+/\u0002\u0015!\u0013\u0018\u0015!Q\u0001\u001b \r\u0011l\u001f\u0016\u0011\u0013\u0015\u0003\u0015\t\u000e\fo\u0010{\u000e}Z~v\u0003zw]y\u0003\u0003rzp|", (short) (C1499aX.Xd() ^ (-22769)), (short) (C1499aX.Xd() ^ (-18160))))};
                        Object[] objArr4 = {listener$touchExplorationListener$1};
                        short sXd2 = (short) (Od.Xd() ^ (-6146));
                        short sXd3 = (short) (Od.Xd() ^ (-4109));
                        int[] iArr2 = new int[".0/\u001e8=*.\n<3.02 2&+)\r-\u0019+\u001bw\u001c\u0014 \u0018\u0015z\u0017  \u0010\u0018\u000e\u001a".length()];
                        QB qb2 = new QB(".0/\u001e8=*.\n<3.02 2&+)\r-\u0019+\u001bw\u001c\u0014 \u0018\u0015z\u0017  \u0010\u0018\u000e\u001a");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK(sXd2 + i3 + xuXd2.CK(iKK2) + sXd3);
                            i3++;
                        }
                        Method method4 = cls2.getMethod(new String(iArr2, 0, i3), clsArr2);
                        try {
                            method4.setAccessible(true);
                            method4.invoke(accessibilityManager, objArr4);
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                }
                if (Build.VERSION.SDK_INT < 33 || (listener$switchAccessListener$1 = this.switchAccessListener) == null) {
                    return;
                }
                listener$switchAccessListener$1.setEnabled(getSwitchAccessEnabled(accessibilityManager));
                Api33Impl.addAccessibilityServicesStateChangeListener(accessibilityManager, listener$switchAccessListener$1);
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (InvocationTargetException e5) {
            throw e5.getCause();
        }
    }

    public final void unregister(AccessibilityManager accessibilityManager) throws Throwable {
        Listener$switchAccessListener$1 listener$switchAccessListener$1;
        Listener listener = this;
        short sXd = (short) (Od.Xd() ^ (-25077));
        int[] iArr = new int["nzo|xqk4{mhy/ababonc[ac_im!3TSTa`UMSUQ[_2EQCHEQ".length()];
        QB qb = new QB("nzo|xqk4{mhy/ababonc[ac_im!3TSTa`UMSUQ[_2EQCHEQ");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[1];
        short sXd2 = (short) (Od.Xd() ^ (-24805));
        int[] iArr2 = new int["FTGVPKC\u000eSG@S\u0007;:;Zif]S[[Yag\u0019-LML[xoemmksyJ_i]`_i\u001cVyvy\u0005\u0006xrvzt\u0001\u0003]{i\u0019\u000be\f\u0002\u0010\u0006\u0005h\u0007\u000e\u0010}\b{\n".length()];
        QB qb2 = new QB("FTGVPKC\u000eSG@S\u0007;:;Zif]S[[Yag\u0019-LML[xoemmksyJ_i]`_i\u001cVyvy\u0005\u0006xrvzt\u0001\u0003]{i\u0019\u000be\f\u0002\u0010\u0006\u0005h\u0007\u000e\u0010}\b{\n");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 ^ i3));
            i3++;
        }
        clsArr[0] = Class.forName(new String(iArr2, 0, i3));
        Object[] objArr = {listener};
        Method method = cls.getMethod(C1561oA.Yd("qenqyiFijm|}tnvzx\u0005\u000be\bu\n{Z\u0001z\t\u0003\u0002i\b\u0013\u0015\u0007\u0011\t\u0017", (short) (Od.Xd() ^ (-8765))), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(accessibilityManager, objArr);
            Listener$touchExplorationListener$1 listener$touchExplorationListener$1 = this.touchExplorationListener;
            if (listener$touchExplorationListener$1 != null) {
                Object[] objArr2 = {listener$touchExplorationListener$1};
                Method method2 = Class.forName(Xg.qd("HVM\\ZUQ\u001ceYVi!UXY\\klc]eigsy/Cfgjyzqkswu\u0002\b\\q\u007fszy\b", (short) (C1499aX.Xd() ^ (-28679)), (short) (C1499aX.Xd() ^ (-20377)))).getMethod(ZO.xd("q\u0011B~b'\u000bXd6wF\tGPT\t>C)SSl\t;#$\u0014>\u0006\u001a{0MpgijHR\u0013", (short) (C1633zX.Xd() ^ (-30057)), (short) (C1633zX.Xd() ^ (-1980))), Class.forName(Jg.Wd("~\u0017Ti.?\u0002Rb\r\u0010i'2;\u0003\fQ\u0019\u0016Vt?C\u0016R\u000eh\u0012irHO\u0011AO\u001a\u001e\u0001\r(C\bBO\u001592iL\n~K/:9|\u0007Aw\u0012Nk2\u001e\u000b~I\u0002fSc88}\u001c@\u0012\u001abr1E", (short) (FB.Xd() ^ 25652), (short) (FB.Xd() ^ 14283))));
                try {
                    method2.setAccessible(true);
                    method2.invoke(accessibilityManager, objArr2);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            if (Build.VERSION.SDK_INT < 33 || (listener$switchAccessListener$1 = this.switchAccessListener) == null) {
                return;
            }
            Api33Impl.removeAccessibilityServicesStateChangeListener(accessibilityManager, listener$switchAccessListener$1);
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    /* JADX INFO: compiled from: AccessibilityServiceStateProvider.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0LeN.X\u07bb*%ӆ,4RZdvI;ڈ\u001e}0\t\u0018duh\u0007J\t\rs\u0013\u0014\u0019\u0011jZM\u0006|k\u0017'2pu\u00068\u0016\u0006K@xtd\u0007P60;\u0012\u0005/\u001eZL\u001e{\u0013Cy\u0012X5ϴtB"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\u0015QQJk=\u001e\"'=D\u000b1y2~2N\"", "", "u(E", "/cS\u000eV*>a'\u0003wb3\u0001\u0018CS\u007f5\rD~\u0017%5~\nKv\u00038U\u0007\"7T\u001a<\\CDkA", "", "/l", "\u001a`]1e6BRb\u0010~^>F\u0005-c\u007f6\nD}\u001b\u001eK~\"\u0006R#3Y\f.;j\u001a5QROS0'\u0011jaF\\", ":hbAX5>`", "\u001a`]1e6BRb\u0010~^>F\u0005-c\u007f6\nD}\u001b\u001eK~\"\u0006R#3Y\f.;j\u001a5QROS0'\u0011jaFE?*Lv5UPK0cV\u0002Q\u0002\u0012g\u001fR)\r\u0013GP }D\u0015\"\u00045K\u0002\"l\u000f\u001b\u0016\u00175wF", "@d\\<i,\u001aQ\u0017~\tl0y\r6i\u000f<i@\u000e(\u001bEo\u001c*\u0006!DY[#3v\u0018.4GIz4'\u0015u", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class Api33Impl {
        public static final Api33Impl INSTANCE = new Api33Impl();

        private Api33Impl() {
        }

        @JvmStatic
        public static final void addAccessibilityServicesStateChangeListener(AccessibilityManager accessibilityManager, AccessibilityManager.AccessibilityServicesStateChangeListener accessibilityServicesStateChangeListener) throws Throwable {
            Object[] objArr = {accessibilityServicesStateChangeListener};
            Method method = Class.forName(C1561oA.Qd("|\t}\u000b\u0007\u007fyB\n{v\b=opop}|qioqmw{/Ababonc[ac_im@S_QVS_", (short) (ZN.Xd() ^ 23386))).getMethod(C1561oA.od(")+*\u0006'&'43( &($.2\u000b\u001c(+\u001d\u0016\u0017$\u0003#\u000f!\u0011m\u0012\n\u0016\u000e\u000bp\r\u0016\u0016\u0006\u000e\u0004\u0010", (short) (C1633zX.Xd() ^ (-12209))), Class.forName(C1593ug.zd("q\u007fv\u0006\u0004~zE\u000f\u0003\u007f\u0013J~\u0002\u0003\u0006\u0015\u0016\r\u0007\u000f\u0013\u0011\u001d#Xl\u0010\u0011\u0014#$\u001b\u0015\u001d!\u001f+1\u0006\u001b)\u001d$#1c\u0002%&)890*264@F!4BG;69H)K9M?\u001eD>LFE-KVXJTLZ", (short) (FB.Xd() ^ 3927), (short) (FB.Xd() ^ 30341))));
            try {
                method.setAccessible(true);
                method.invoke(accessibilityManager, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        @JvmStatic
        public static final void removeAccessibilityServicesStateChangeListener(AccessibilityManager accessibilityManager, AccessibilityManager.AccessibilityServicesStateChangeListener accessibilityServicesStateChangeListener) throws Throwable {
            Object[] objArr = {accessibilityServicesStateChangeListener};
            Method method = Class.forName(C1561oA.Kd("m{r\u0002\u007fzvA\u000b~{\u000fFz}~\u0002\u0011\u0012\t\u0003\u000b\u000f\r\u0019\u001fTh\f\r\u0010\u001f \u0017\u0011\u0019\u001d\u001b'-\u0002\u0017%\u0019 \u001f-", (short) (C1607wl.Xd() ^ 25679))).getMethod(C1561oA.Xd("{ox{\u0004sPstw\u0007\b~x\u0001\u0005\u0003\u000f\u0015o\u0003\u0011\u0016\n\u0005\b\u0017w\u001a\b\u001c\u000el\u0013\r\u001b\u0015\u0014{\u001a%'\u0019#\u001b)", (short) (C1633zX.Xd() ^ (-11713))), Class.forName(Wg.Zd(",IKd]dk@%$-;|<Kgt\u000f\u001b\u0012\u0017)HRiz*Ix\u0015\"<I;@Ra{\u0017'v\u001710Q[u#Ky\u0006%?JLBYh\u0001\u0018*\u0010\u001d6GV\\i\u0004`\u000e\u0006%2\u001dRF_eoq\u001b1/,@Cm", (short) (C1607wl.Xd() ^ 26726), (short) (C1607wl.Xd() ^ 27334))));
            try {
                method.setAccessible(true);
                method.invoke(accessibilityManager, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }
}
