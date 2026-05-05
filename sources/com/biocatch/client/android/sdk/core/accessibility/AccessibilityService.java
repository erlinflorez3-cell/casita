package com.biocatch.client.android.sdk.core.accessibility;

import android.view.accessibility.AccessibilityManager;
import com.biocatch.client.android.sdk.core.ApplicationCache;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	... 4 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007fјnjG9LeN/ZS8\u000fsڔ<$q$yّCU0}*\tUOm˧\u0005Ϻ\u000b\u000bq\u000eF!\tn:Imx\f\u0013Ƥ6B}A{Y}FQ`#@5$@-Py3\rb6V\u001d\u000fzqU<\u0016>K\t:\u0001\u001b\u0016\u0011(!\u001e>N\u000bN`uYNH\u001bi\u0003;1\u0013\u0002B|1\u00104\u000bX%F\u00035]\u0003o!C@e9kǯUΫ\u000bRcΪSN\u007fB\u001dhU-a\u000eָ[:p\u0002\u001a\u001a9V]l\u0001.t\u0005\u007ffBk˦SgcR\u00140\u0006\u0002Ա\u0011M"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wIA9kB,\u0019ee@\u000br@\u0018R%EL\\:`OvD\u0018!n{N8\u001e\tWAy", "", "/o_9\\*:b\u001d\t\u0004<(z\f/", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016w)NFr8\u001c\u0011weC\u0010A(Ly'\u001d", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i5w#.\u0017\u001fFv;\"\u0013dp=\u0011l\nJt*G\"\u0012\u001d", "/bR2f:BP\u001d\u0006~m@d\u00058a\u0002(\t", "\u001a`]1e6BRb\u0010~^>F\u0005-c\u007f6\nD}\u001b\u001eK~\"\u0006R#3Y\f.;j\u001a5QROS0'\u0011jaF\\", "7r00V,La\u001d{~e0\f\u001d\u000fn{%\u0003@\u007f", "", "u(I", "7rC<h*A3,\n\u0002h9x\u00183o\t\b\u0005<}\u001e\u0017F", "/cS\u000eV*>a'\u0003wb3\u0001\u0018CS\u000f$\u000b@^\u001a\u0013Pq\u000e#z3DY\u0007 D", "", ":hbAX5>`", "\u001a`]1e6BRb\u0010~^>F\u0005-c\u007f6\nD}\u001b\u001eK~\"\u0006R#3Y\f.;j\u001a5QROS0'\u0011jaFE?*Lv5UPK0cV\u0002Q\u0002!V\u001dN\t\u0010\u0001bC$UHE.\b5I\u000f\u0011", "/cS!b<<Vx\u0012\u0006e6\n\u0005>i\n1iO|&\u0017%r\nEx%\u001c]\f/7v\u0016;", "\u001a`]1e6BRb\u0010~^>F\u0005-c\u007f6\nD}\u001b\u001eK~\"\u0006R#3Y\f.;j\u001a5QROS0'\u0011jaFER6^t*'_Y3f_nL\u0018\u001cc{]'\u001c\u00057D wF7\u0006\f:X\u0002Dh\u000ea", "@d\\<i,\u001aQ\u0017~\tl0y\r6i\u000f<iO|&\u0017%r\nEx%\u001c]\f/7v\u0016;", "@d\\<i,-])|}>?\b\u00109r{7\u007fJ\n\u0005&C~\u000e\u001ay!>[}\u0007;{%.VCH", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class AccessibilityService {
    private final AccessibilityManager accessibilityManager;

    public AccessibilityService(ApplicationCache applicationCache) {
        Intrinsics.checkNotNullParameter(applicationCache, "applicationCache");
        Object systemService = applicationCache.get().getSystemService("accessibility");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.accessibilityManager = (AccessibilityManager) systemService;
    }

    public final void addAccessibilityStateChangeListener(AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener) throws Throwable {
        Intrinsics.checkNotNullParameter(accessibilityStateChangeListener, EO.Od("\u0006\\4\u0016\u000fl?\u001d", (short) (C1499aX.Xd() ^ (-1790))));
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        Class<?> cls = Class.forName(C1561oA.Qd("UaVc_XR\u001bbTO`\u0016HIHIVUJBHJFPT\b\u001a;:;HG<4:<8BF\u0019,8*/,8", (short) (ZN.Xd() ^ 20565)));
        Class<?>[] clsArr = {Class.forName(C1593ug.zd(")7.=;62|F:7J\u000269:=LMD>FJHTZ\u0010$GHKZ[RLTXVbh=R`T[Zh\u001b9\\]`opgaimkw}Xzh|nMsm{ut\\z\u0006\by\u0004{\n", (short) (C1580rY.Xd() ^ (-17597)), (short) (C1580rY.Xd() ^ (-20310))))};
        Object[] objArr = {accessibilityStateChangeListener};
        short sXd = (short) (OY.Xd() ^ 5392);
        int[] iArr = new int["xzyUvuv\u0004\u0003wouws}\u0002ZzfxhEiamebHdmm]e[g".length()];
        QB qb = new QB("xzyUvuv\u0004\u0003wouws}\u0002ZzfxhEiamebHdmm]e[g");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(accessibilityManager, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final void addTouchExplorationStateChangeListener(AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener) throws Throwable {
        short sXd = (short) (FB.Xd() ^ 20578);
        int[] iArr = new int["\u000e\f\u0017\u0019\u000b\u0015\r\u001b".length()];
        QB qb = new QB("\u000e\f\u0017\u0019\u000b\u0015\r\u001b");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        Intrinsics.checkNotNullParameter(touchExplorationStateChangeListener, new String(iArr, 0, i2));
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        Class<?> cls = Class.forName(Wg.Zd("&t~\u0010\u001flb}]\u0010\u001e/u\u007fCSdtHA\f\u001e%w\u0012\u001b\u001an)8<YhdpwHXc?dt\u0015\n#4?", (short) (C1499aX.Xd() ^ (-13836)), (short) (C1499aX.Xd() ^ (-19319))));
        Class<?>[] clsArr = {Class.forName(C1561oA.Xd(" .%42-)s=1.Ax-014CD;5=A?KQ\u0007\u001b>?BQRICKOMY_4IWKRQ_\u0012C_fU[9mfcgk[oellRtbvhGmguonVt\u007f\u0002s}u\u0004", (short) (C1633zX.Xd() ^ (-22372))))};
        Object[] objArr = {touchExplorationStateChangeListener};
        short sXd2 = (short) (FB.Xd() ^ 2026);
        int[] iArr2 = new int["596'?F17!UJGGK7KMTP6TBRD/UKYON2P')\u0017!\u0015#".length()];
        QB qb2 = new QB("596'?F17!UJGGK7KMTP6TBRD/UKYON2P')\u0017!\u0015#");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((sXd2 ^ i3) + xuXd2.CK(iKK2));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(accessibilityManager, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final boolean isAccessibilityEnabled() throws Throwable {
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        Object[] objArr = new Object[0];
        Method method = Class.forName(Qg.kd("\n\u0016\u000b\u0018\u0014\r\u0007O\u0017\t\u0004\u0015J|}|}\u000b\n~v|~z\u0005\t<Nono|{phnplvzM`l^c`l", (short) (FB.Xd() ^ 31943), (short) (FB.Xd() ^ 8017))).getMethod(hg.Vd("6?\u00108**3+)", (short) (C1633zX.Xd() ^ (-11338)), (short) (C1633zX.Xd() ^ (-6032))), new Class[0]);
        try {
            method.setAccessible(true);
            return ((Boolean) method.invoke(accessibilityManager, objArr)).booleanValue();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final boolean isTouchExplorationEnabled() throws Throwable {
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        short sXd = (short) (OY.Xd() ^ 27541);
        int[] iArr = new int["\u001c(\u001d*&\u001f\u0019a)\u001b\u0016'\\\u000f\u0010\u000f\u0010\u001d\u001c\u0011\t\u000f\u0011\r\u0017\u001bN`\u0002\u0001\u0002\u000f\u000e\u0003z\u0001\u0003~\t\r_r~pur~".length()];
        QB qb = new QB("\u001c(\u001d*&\u001f\u0019a)\u001b\u0016'\\\u000f\u0010\u000f\u0010\u001d\u001c\u0011\t\u000f\u0011\r\u0017\u001bN`\u0002\u0001\u0002\u000f\u000e\u0003z\u0001\u0003~\t\r_r~pur~");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.yd("XaA[hUY5_VQS]K]QNL\"JDDME;", (short) (C1607wl.Xd() ^ 31425)), new Class[0]);
        try {
            method.setAccessible(true);
            return ((Boolean) method.invoke(accessibilityManager, objArr)).booleanValue();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final void removeAccessibilityStateChangeListener(AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener) throws Throwable {
        Intrinsics.checkNotNullParameter(accessibilityStateChangeListener, C1561oA.Yd("'%02$.&4", (short) (FB.Xd() ^ 11600)));
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        Object[] objArr = {accessibilityStateChangeListener};
        Method method = Class.forName(Xg.qd("\u0001\u000f\u0006\u0015\u0013\u000e\nT\u001e\u0012\u000f\"Y\u000e\u0011\u0012\u0015$%\u001c\u0016\u001e\" ,2g{\u001f #23*$,0.:@\u0015*8,32@", (short) (C1633zX.Xd() ^ (-706)), (short) (C1633zX.Xd() ^ (-32603)))).getMethod(ZO.xd("D\u0018BZ1'l\u0006:\bf[r\u0015}\u0001OGR\u0007\t|(- ~Cn'u+\u0016/<(=j+", (short) (C1607wl.Xd() ^ 31270), (short) (C1607wl.Xd() ^ 10854)), Class.forName(Jg.Wd("-\u001e)gIm}6f\u0007`\u0010~\u00106\u0012\t7\\xW\rgQ~1<~Il\u0014B8Jf\f\u0006`\n|v:\u001b9%\u00126\u0018 `\bgj\u0006\"y9_r,X\u001eRmf\n=\u0006t!>\u001a50!B^Vb\u001e", (short) (C1580rY.Xd() ^ (-18108)), (short) (C1580rY.Xd() ^ (-6613)))));
        try {
            method.setAccessible(true);
            method.invoke(accessibilityManager, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final void removeTouchExplorationStateChangeListener(AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener) throws Throwable {
        Intrinsics.checkNotNullParameter(touchExplorationStateChangeListener, C1626yg.Ud("\u001fW[FCs\u001b\u001a", (short) (OY.Xd() ^ 3125), (short) (OY.Xd() ^ 27844)));
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        Class<?> cls = Class.forName(Ig.wd("\u0012m5$\u0001-DFO~\u0001p{1\u0017uJ:\u0013p*yRS_\u0001V\u0019]n\r8XoR'C\\FU%P3\u0018\byQ", (short) (OY.Xd() ^ 19264)));
        Class<?>[] clsArr = new Class[1];
        short sXd = (short) (C1499aX.Xd() ^ (-18055));
        int[] iArr = new int["0l\u0017Ba)m)\u001dQM{a\u0011)H\u007f.Wc\u0018\\,'\rs\rdf[7$\u000edk3\u0019w\u0010!vu1$FN\u0013\u0014\u0014\u000e\u00160W^p\u000b\u0003&sbo\t[V\u0006\u001dH6O+n\n7`\u001b\u0012Q}!..Y\r".length()];
        QB qb = new QB("0l\u0017Ba)m)\u001dQM{a\u0011)H\u007f.Wc\u0018\\,'\rs\rdf[7$\u000edk3\u0019w\u0010!vu1$FN\u0013\u0014\u0014\u000e\u00160W^p\u000b\u0003&sbo\t[V\u0006\u001dH6O+n\n7`\u001b\u0012Q}!..Y\r");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        Object[] objArr = {touchExplorationStateChangeListener};
        Method method = cls.getMethod(C1561oA.Qd("oahio]KejW[7i`[]_M_SXV:ZFXH%IAMEB(DMM=E;G", (short) (OY.Xd() ^ 8122)), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(accessibilityManager, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
