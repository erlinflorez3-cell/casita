package com.davivienda.daviviendaapp.bridges.VsshCoreInit;

import com.davivienda.daviviendaapp.common.helper.CoreHelper;
import com.davivienda.daviviendaapp.common.helper.Utils;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.valid.security.entities.TransformAes;
import com.valid.vssh_android_core.VsshCoreManagerImp;
import com.valid.vssh_android_core.model.LambdaError;
import com.valid.vssh_android_core.model.LambdaSuccess;
import com.valid.vssh_android_core.model.SetupModel;
import com.valid.vssh_android_core.model.response.CoreErrorModelResponse;
import com.valid.vssh_android_core.model.response.CoreGenericBridgeModelResponse;
import com.valid.vssh_android_core.model.response.CoreGenericModelResponse;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
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
import yg.Od;
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
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007fјnjO0L͜P.hS2şs{B0c$wCCU(}*\tUSog\u0005Jb\u000bI\u000f\u001cǝ)jZH\u0016\u0004m\u0016\u001d2Zom4ޜs=Gb=D\u0013'J\"f\u00025\u0005(3`\u0010%\u0005\nKT\u0018>K\t:\u0001\u0017\u0014\u0019b\u0018\u0014J8\u0001Li.N~3zkR/Q\u0010\u001aJT'm?\u0015O#E\u00031=~g\u001e9PO7+$\u0002\r7Za?\u0011P\n?\u001bgU1[QyWDj\u0018\u0016+*}\u0017\u000ez,\\\u0013dx\u000e=*}m{X\u0014(\u0006\u0004\u0014\u000fR\u0003<\u0010WN<A2h\u001e\ra\n#YNf\u001a`X~)vf\u001b3\u0003K+g\u001f-V2I'QO}\u001b\fL'W͜-ƟX\u000ehٽk`\u0006VIQnC\u001fݓ6ՒAm\f͏Đ\u0006A"}, d2 = {"\u001ab^:\"+:d\u001d\u0010~^5{\u0005xd{9\u007fQ\u0005\u0017 Fk\nG\u0002n2f\u0002\u001f9m$w>QIn\u0012(\"hEB\u000bru?\u00055J*X9\\6{A#yV\u0017J-\r\u0012/", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3h[*@|\u0016A\\ 7y4\u0003\u0011y]!\u0011b<Uv|", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3hY+Bt\u001a,IR?u={\u001fqp9\u001ar\u0002", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1W\r{Bx\u001d2K?Jo>'rrjH\u0007v;$:\u0018", "1`[9U(<Y", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW\u001ar,<Vy\u001e=C", "1na2@(GO\u001b~\b", "\u001ab^:\"=:Z\u001d}Do:\u000b\f)a\t'\tJ\u0005\u0016\u0011Ey\u001b<@\u0016Cg\u0001}Az\u0016\u0016IL7m4+xpl\u000f", "5dc\u000eX:&]\u0018~lb;\u007fv>r\u00041}", "\u001ab^:\"=:Z\u001d}Dl,z\u0019<i\u000f<E@\n&\u001bVs\u000eJ@\u0014BU\u0007.8w#6)CIA", "/db\u001ab+>", "", "5dc\u001bT4>", "7mXA66KS", "", "AdcBc", "Cq[\u000fT:>", ">tQ9\\*$S-", "/oX\u0014X;\u001cS&\u000e~_0z\u0005>e\u000e", "/oX\u0012k*AO\"\u0001z", "3wR5T5@Sx\byI6\u0001\u0012>", "3wR5T5@St}yb;\u0001\u00138a\u0007\u0007wO|", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", "3wR5T5@S{~v],\n\u0017", "/o_,e,ES\u0015\rz"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class VsshCoreInitManager extends ReactContextBaseJavaModule {
    private Callback callback;
    private VsshCoreManagerImp coreManager;

    public static /* synthetic */ void $r8$lambda$UTmaCUTKZyFFNJ7AwrotsSeNVUs(Callback callback, CoreGenericModelResponse coreGenericModelResponse) throws Throwable {
        Class<?> cls = Class.forName(C1561oA.Xd("\u0006\u0013\u0012S\u000b\t\u001f\u0013!\u0015\u0012\u001c\u0013\u0011^\u0016\u0014*\u001e, \u001d'\u001e\u001c\u001d-.l\"3+'+*9t\u001e<=3\u000f<@4\u0019?;G\u0002+IJ@\u001cIMA&LHT.CQELKY", (short) (C1499aX.Xd() ^ (1623129433 ^ (-1623126146)))));
        Class<?>[] clsArr = new Class[C1580rY.Xd() ^ (1265198517 ^ (-2061529514))];
        clsArr[0] = Class.forName(Wg.vd(" +,k\u001f\u0019\u001e\u001f\u0017#&!^\"\u0018\u0013\u0010 \\\u0010\u001b\u0011\u000f\u0011\nQi\u0007\r\f\u0005\u0003\u007f\u0007", (short) (C1607wl.Xd() ^ (1610551769 ^ 1610579393))));
        int iXd = C1580rY.Xd() ^ (2110287172 ^ 1279355574);
        clsArr[1] = Class.forName(Qg.kd("@KH\bO9C?9\u0002IED8./;0=92,&)46(o./##)i-\u001f,(&$(\u0019`t \"\u0014t\u0012\u001a\u0010\u001c\u0012\u000bs\u0015\t\t\u000fs\u0006\u0013\u000f\r\u000b\u000f\u007f", (short) (Od.Xd() ^ (62572904 ^ (-62585061))), (short) (Od.Xd() ^ iXd)));
        Object[] objArr = new Object[C1607wl.Xd() ^ (345251753 ^ 2060455025)];
        objArr[0] = callback;
        objArr[1] = coreGenericModelResponse;
        Method declaredMethod = cls.getDeclaredMethod(hg.Vd("/ ..(Z\"\u0016!\u0015\u0016\u0012S_", (short) (OY.Xd() ^ (OY.Xd() ^ (83629153 ^ 14119347))), (short) (OY.Xd() ^ (ZN.Xd() ^ 864697750))), clsArr);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static /* synthetic */ void $r8$lambda$irClbsWi2KR9KZmwIrOUbmyp7Lk(Callback callback, CoreErrorModelResponse coreErrorModelResponse) throws Throwable {
        Class<?> cls = Class.forName(C1561oA.ud("\u0013\u001e\u001bZ\u0010\f \u0012\u001e\u0010\u000b\u0013\b\u0004O\u0005\u0001\u0015\u0007\u0013\u0005\u007f\b|xw\u0006\u0005At\u0004ysur\u007f9`|{oItvhKois,Sonb<gi[>b\\f>Q]OTQ]", (short) (OY.Xd() ^ (C1499aX.Xd() ^ (-1134246623)))));
        Class<?>[] clsArr = new Class[1032841585 ^ 1032841587];
        short sXd = (short) (C1499aX.Xd() ^ ((2138313030 ^ 1427664929) ^ (-711730918)));
        int[] iArr = new int["6AB\u0002=7<==ILG\rPFA&6r&9/-/0w\u0010-;:31V]".length()];
        QB qb = new QB("6AB\u0002=7<==ILG\rPFA&6r&9/-/0w\u0010-;:31V]");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        clsArr[1] = Class.forName(C1561oA.Yd(">KJ\fUAMKG\u0012[YZPHKYP_]XTPUbfZ$dg]_g*ocrpppvi3IvznO}~|\u0001\\\u007fuw\u007ffz\n\b\b\b\u000e\u0001", (short) (Od.Xd() ^ ((426774697 ^ 208865473) ^ (-352550212)))));
        Object[] objArr = new Object[OY.Xd() ^ 69929194];
        objArr[0] = callback;
        objArr[1] = coreErrorModelResponse;
        Method declaredMethod = cls.getDeclaredMethod(Xg.qd("B5EGCwA7D:=;~\u000e", (short) (C1633zX.Xd() ^ (OY.Xd() ^ (1699809410 ^ (-1635405502)))), (short) (C1633zX.Xd() ^ ((1087642195 ^ 547466103) ^ (-1618321682)))), clsArr);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static /* synthetic */ void $r8$lambda$zyCEfcvM_8E_9dTYCH6ZHMWoiew(Callback callback, CoreGenericBridgeModelResponse coreGenericBridgeModelResponse) throws Throwable {
        Class<?> cls = Class.forName(Jg.Wd("Z6w\u000e\u0004>'_,l,\n?y\u001a\u0016R5kN\u0001:\u0017P\u000f^/\u0003\u0002uW\u0012\u000e _A=%\u0014W\u000e8&x3XI\u0006XcG6}sYG\u0012Vul/{ u\n\rP\"t", (short) (C1607wl.Xd() ^ (FB.Xd() ^ 1609511473)), (short) (C1607wl.Xd() ^ (C1607wl.Xd() ^ (886642688 ^ 1520256637)))));
        Class<?>[] clsArr = new Class[(450397969 ^ 1688598145) ^ 2122150290];
        clsArr[0] = Class.forName(ZO.xd("WgdBd\u007f\u00076Yz\u000b_([\u0012#\nNl\u0006$v8\u000eE-,^S\u0011!5\u0011^", (short) (OY.Xd() ^ (ZN.Xd() ^ (1538564839 ^ 1748933546))), (short) (OY.Xd() ^ (C1633zX.Xd() ^ (1063183671 ^ (-1259309536))))));
        short sXd = (short) (C1499aX.Xd() ^ ((1460861261 ^ 1658636835) ^ (-902715923)));
        short sXd2 = (short) (C1499aX.Xd() ^ ((877574209 ^ 1033822553) ^ (-164635649)));
        int[] iArr = new int["KI4_M,nl`[e\u0001\u00135Q\u0014\u0011PCc^ks-cX-gHi:\u0016\u0011,\u0015\u000b{]\u001db\u0006cJsn\u001cd2P(w\u0012P?\u0004\u0017\u0016J\u0017w+%G\u0012^Ik\u000f\u0012Fu^L".length()];
        QB qb = new QB("KI4_M,nl`[e\u0001\u00135Q\u0014\u0011PCc^ks-cX-gHi:\u0016\u0011,\u0015\u000b{]\u001db\u0006cJsn\u001cd2P(w\u0012P?\u0004\u0017\u0016J\u0017w+%G\u0012^Ik\u000f\u0012Fu^L");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        clsArr[1] = Class.forName(new String(iArr, 0, i2));
        Object[] objArr = new Object[(583905680 ^ 1042247402) ^ 483581816];
        objArr[0] = callback;
        objArr[1] = coreGenericBridgeModelResponse;
        Method declaredMethod = cls.getDeclaredMethod(Ig.wd("\u0018a\u0001\u001b\rc\u001al*LRogc", (short) (C1607wl.Xd() ^ (C1580rY.Xd() ^ (-831092357)))), clsArr);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VsshCoreInitManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Intrinsics.checkNotNullParameter(reactApplicationContext, EO.Od("\u001a['\u0007\t\u0015S\fA$3\u000f", (short) (C1499aX.Xd() ^ (ZN.Xd() ^ (-864684140)))));
    }

    private final TransformAes getAesModeWithString(String str) {
        short sXd = (short) (C1499aX.Xd() ^ (C1607wl.Xd() ^ (-1849952269)));
        int[] iArr = new int["\u0002\u007f\u007f".length()];
        QB qb = new QB("\u0002\u007f\u007f");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        return Intrinsics.areEqual(str, new String(iArr, 0, i2)) ? TransformAes.CBC : TransformAes.GCM;
    }

    private final void initCore() throws Throwable {
        CoreHelper coreHelper = CoreHelper.INSTANCE;
        short sXd = (short) (C1499aX.Xd() ^ (C1580rY.Xd() ^ (472335940 ^ 766382891)));
        int iXd = C1499aX.Xd();
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1593ug.zd("\u0004\u0011\u0010Q\t\u0007\u001d\u0011\u001f\u0013\u0010\u001a\u0011\u000f\\\u0014\u0012(\u001c*\u001e\u001b%\u001c\u001a\u001b+,j!.-.11q-+38.<x\u000f<@4\u00186>C9G", sXd, (short) (iXd ^ (1460981662 ^ (-1460987099))))).getMethod(C1561oA.od("@=K\u001fCGG3?34\u0011<>0\u0017*6(-*6", (short) (ZN.Xd() ^ (C1499aX.Xd() ^ (-1134245521)))), new Class[0]);
        try {
            method.setAccessible(true);
            this.coreManager = (VsshCoreManagerImp) method.invoke(coreHelper, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static /* synthetic */ void setup$default(VsshCoreInitManager vsshCoreInitManager, String str, String str2, String str3, String str4, String str5, String str6, ReadableMap readableMap, ReadableMap readableMap2, Callback callback, int i2, Object obj) throws Throwable {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            str = "";
        }
        if ((i2 & 2) != 0) {
            str2 = "";
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            str3 = "";
        }
        if ((i2 + 8) - (i2 | 8) != 0) {
            str4 = "";
        }
        if ((-1) - (((-1) - i2) | ((-1) - 16)) != 0) {
            str5 = "";
        }
        String str7 = (i2 + 32) - (i2 | 32) == 0 ? str6 : "";
        short sXd = (short) (C1499aX.Xd() ^ ((334823813 ^ 1666052013) ^ (-1891157224)));
        int[] iArr = new int["Uba#ZXnbpdakb`.ecym{olvmkl|}<q\u0003zvzy\tDm\f\r\u0003^\f\u0010\u0004h\u000f\u000b\u0017Qz\u0019\u001a\u0010k\u0019\u001d\u0011u\u001c\u0018$}\u0013!\u0015\u001c\u001b)".length()];
        QB qb = new QB("Uba#ZXnbpdakb`.ecym{olvmkl|}<q\u0003zvzy\tDm\f\r\u0003^\f\u0010\u0004h\u000f\u000b\u0017Qz\u0019\u001a\u0010k\u0019\u001d\u0011u\u001c\u0018$}\u0013!\u0015\u001c\u001b)");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i3));
            i3++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i3));
        Class<?>[] clsArr = new Class[577221275 ^ 577221266];
        int iXd = OY.Xd() ^ (1977052939 ^ 1912369730);
        short sXd2 = (short) (ZN.Xd() ^ ((801690734 ^ 27002258) ^ 777306556));
        short sXd3 = (short) (ZN.Xd() ^ iXd);
        int[] iArr2 = new int["\\tr=0W,`Ags<\u001bx%\u007f".length()];
        QB qb2 = new QB("\\tr=0W,`Ags<\u001bx%\u007f");
        int i4 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i4] = xuXd2.fK(((i4 * sXd3) ^ sXd2) + xuXd2.CK(iKK2));
            i4++;
        }
        clsArr[0] = Class.forName(new String(iArr2, 0, i4));
        short sXd4 = (short) (ZN.Xd() ^ ((60637249 ^ 1735703375) ^ 1693024322));
        int[] iArr3 = new int["3+A-z:0>8\u007f&HG?E?".length()];
        QB qb3 = new QB("3+A-z:0>8\u007f&HG?E?");
        int i5 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i5] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd4 + i5));
            i5++;
        }
        clsArr[1] = Class.forName(new String(iArr3, 0, i5));
        clsArr[(1600106071 ^ 190265175) ^ 1409849602] = Class.forName(Wg.vd("\u0011\u0007\u001f\tX\u0016\u000e\u001a\u0006Ks\u0014\u0015\u000b\u0013\u000b", (short) (C1607wl.Xd() ^ (1793444447 ^ 1793443891))));
        clsArr[1345788197 ^ 1345788198] = Class.forName(Qg.kd("WMaK\u0017THTL\u00126VSIME", (short) (Od.Xd() ^ ((2108034118 ^ 6641136) ^ (-2109963943))), (short) (Od.Xd() ^ (C1607wl.Xd() ^ (-1849980375)))));
        int iXd2 = C1499aX.Xd() ^ (1448244734 ^ (-365499114));
        int iXd3 = Od.Xd() ^ (-1207820121);
        short sXd5 = (short) (C1633zX.Xd() ^ ((373714500 ^ 790808849) ^ (-962907572)));
        short sXd6 = (short) (C1633zX.Xd() ^ iXd3);
        int[] iArr4 = new int["bXlV\"_S_W\u001dAa^TXP".length()];
        QB qb4 = new QB("bXlV\"_S_W\u001dAa^TXP");
        int i6 = 0;
        while (qb4.YK()) {
            int iKK4 = qb4.KK();
            Xu xuXd4 = Xu.Xd(iKK4);
            iArr4[i6] = xuXd4.fK(sXd5 + i6 + xuXd4.CK(iKK4) + sXd6);
            i6++;
        }
        clsArr[iXd2] = Class.forName(new String(iArr4, 0, i6));
        clsArr[FB.Xd() ^ 1609527094] = Class.forName(C1561oA.ud("!\u0017+\u0015`\u001e\u0012\u001e\u0016[\u007f \u001d\u0013\u0017\u000f", (short) (C1607wl.Xd() ^ (606629391 ^ 606615914))));
        clsArr[163276356 ^ 163276354] = Class.forName(C1561oA.yd("7DC\u0005>:=@>LMJ\u000eSGDGY\u0014IZRNRQ\u001b@TQUSU`ZCXh", (short) (Od.Xd() ^ ((774110939 ^ 400514995) ^ (-972858307)))));
        clsArr[C1607wl.Xd() ^ (1578044779 ^ 810229430)] = Class.forName(C1561oA.Yd("GTS\u0015NJMPN\\]Z\u001ecWTWi$Yjb^ba+PdaecepjShx", (short) (C1499aX.Xd() ^ ((433531453 ^ 1810769167) ^ (-1916359053)))));
        int iXd4 = C1499aX.Xd() ^ (-1134257948);
        int iXd5 = C1499aX.Xd() ^ (670666561 ^ (-1684186204));
        int iXd6 = Od.Xd() ^ 1207806407;
        short sXd7 = (short) (OY.Xd() ^ iXd5);
        short sXd8 = (short) (OY.Xd() ^ iXd6);
        int[] iArr5 = new int["ivu7plorp~\u007f|@\u0006yvy\fF{\r\u0005\u0001\u0005\u0004Mc\u0003\u000f\u0010\u0007\u0007\n\u0013".length()];
        QB qb5 = new QB("ivu7plorp~\u007f|@\u0006yvy\fF{\r\u0005\u0001\u0005\u0004Mc\u0003\u000f\u0010\u0007\u0007\n\u0013");
        int i7 = 0;
        while (qb5.YK()) {
            int iKK5 = qb5.KK();
            Xu xuXd5 = Xu.Xd(iKK5);
            iArr5[i7] = xuXd5.fK((xuXd5.CK(iKK5) - (sXd7 + i7)) + sXd8);
            i7++;
        }
        clsArr[iXd4] = Class.forName(new String(iArr5, 0, i7));
        Object[] objArr = new Object[Od.Xd() ^ 1207800924];
        objArr[0] = str;
        objArr[1] = str2;
        objArr[FB.Xd() ^ (1592682362 ^ 16844875)] = str3;
        objArr[Od.Xd() ^ 1207800918] = str4;
        objArr[(1251943226 ^ 1035879496) ^ 1998677878] = str5;
        objArr[ZN.Xd() ^ (323906389 ^ 549737888)] = str7;
        objArr[(1646974431 ^ 144746237) ^ 1787458340] = readableMap;
        objArr[1284298437 ^ 1284298434] = readableMap2;
        objArr[C1633zX.Xd() ^ (148992606 ^ (-2091914851))] = callback;
        Method method = cls.getMethod(Jg.Wd("22%$`", (short) (Od.Xd() ^ (2127860508 ^ (-2127867044))), (short) (Od.Xd() ^ ((2132606479 ^ 1680192578) ^ (-456749108)))), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(vsshCoreInitManager, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static final void setup$lambda$0(Callback callback, CoreGenericBridgeModelResponse coreGenericBridgeModelResponse) throws Throwable {
        Intrinsics.checkNotNullParameter(callback, ZO.xd(")\u0019Do;\u000be:\u0016", (short) (C1499aX.Xd() ^ (2124241309 ^ (-2124222764))), (short) (C1499aX.Xd() ^ (76142211 ^ (-76141603)))));
        Intrinsics.checkNotNullParameter(coreGenericBridgeModelResponse, C1626yg.Ud(";\r\u0005{u$%'u&\u0017L\u001be", (short) (ZN.Xd() ^ (ZN.Xd() ^ 864691973)), (short) (ZN.Xd() ^ ((1665060538 ^ 1722503808) ^ 93689802))));
        Utils utils = Utils.INSTANCE;
        Object[] objArr = {coreGenericBridgeModelResponse};
        Method method = Class.forName(Ig.wd("u1]>\u0015TM!r\u0002\u007f+qd\u00192i\r(M\u00055 \u001a\fgU\u0010;??\u001e\u0006f\u0002s\u001bs\u000e\bxnz\u0010eN-\u0004", (short) (Od.Xd() ^ (ZN.Xd() ^ (-864709321))))).getMethod(C1561oA.Qd("~q\u007f`r\u007f{yw{lYzgfgtsRcqqk", (short) (C1633zX.Xd() ^ ((1825383186 ^ 767956810) ^ (-1091244456)))), Class.forName(EO.Od("k\u001f\u00118+bw/T\u0011Y2`QnQ\u0013\u0011I,`\n\u0011\u001bAn\u0006\u001bb\u0019(GxbFy*IMX_{r\u0010\u0019&?h\u0017FH\u0002ZG\u0004\bxU$ \u0014\u0018ZA\u0010=\u0010eLO.\u001fn", (short) (C1607wl.Xd() ^ (C1607wl.Xd() ^ (1091701720 ^ 794190205))))));
        try {
            method.setAccessible(true);
            callback.invoke(null, (WritableArray) method.invoke(utils, objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static final void setup$lambda$1(Callback callback, CoreGenericModelResponse coreGenericModelResponse) throws Throwable {
        Intrinsics.checkNotNullParameter(callback, C1593ug.zd("\u001aZYef]]`i", (short) (C1633zX.Xd() ^ (C1633zX.Xd() ^ (2089763060 ^ 148795970))), (short) (C1633zX.Xd() ^ ((1075323465 ^ 2070022656) ^ (-997873370)))));
        short sXd = (short) (C1633zX.Xd() ^ (C1499aX.Xd() ^ 1134253541));
        int[] iArr = new int["\u0011\u0003\u0010\f\n\b\f|".length()];
        QB qb = new QB("\u0011\u0003\u0010\f\n\b\f|");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Intrinsics.checkNotNullParameter(coreGenericModelResponse, new String(iArr, 0, i2));
        Utils utils = Utils.INSTANCE;
        Object[] objArr = {coreGenericModelResponse};
        Method method = Class.forName(C1561oA.Kd("\b\u0015\u0014U\r\u000b!\u0015#\u0017\u0014\u001e\u0015\u0013`\u0018\u0016, .\"\u001f) \u001e\u001f/0n%21255u1/7<2@|%E;?G", (short) (Od.Xd() ^ (ZN.Xd() ^ (410898240 ^ (-737668925)))))).getMethod(C1561oA.Xd("SHX,Y]Q4S]Uc[VAdZ\\dK_nlllre", (short) (C1499aX.Xd() ^ ((781736922 ^ 1320852700) ^ (-1612876954)))), Class.forName(Wg.Zd("%^\u0015\u0010l\u001ae\u00065\u0019:au-S\u001c9_@a\u0006*_(F\n/<\u0019?\u0003$cOI~\u001d\\\u00109v\u0006\u001fZ#l\u00100c1b\u00189W\u0014ep2g\u0012CrFa\u0015<n", (short) (Od.Xd() ^ ((339137384 ^ 1689607564) ^ (-1887682503))), (short) (Od.Xd() ^ (ZN.Xd() ^ (-864710175))))));
        try {
            method.setAccessible(true);
            callback.invoke(null, (WritableMap) method.invoke(utils, objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static final void setup$lambda$2(Callback callback, CoreErrorModelResponse coreErrorModelResponse) throws Throwable {
        Intrinsics.checkNotNullParameter(callback, Wg.vd("#c^jg^Z]b", (short) (FB.Xd() ^ (C1607wl.Xd() ^ (1298243473 ^ 589669385)))));
        Intrinsics.checkNotNullParameter(coreErrorModelResponse, Qg.kd("\u000b\u0017\u0016\u0012\u0014", (short) (Od.Xd() ^ ((2015392132 ^ 216633493) ^ (-1959389996))), (short) (Od.Xd() ^ (814630896 ^ (-814617950)))));
        Utils utils = Utils.INSTANCE;
        Object[] objArr = {coreErrorModelResponse};
        Method method = Class.forName(hg.Vd("r}z:ok\u007fq}ojrgc/d`tfrd_g\\XWed!U`]\\][\u001aSOUXLX\u00139WKMS", (short) (Od.Xd() ^ (1285137561 ^ (-1285156403))), (short) (Od.Xd() ^ (FB.Xd() ^ (-1609522276))))).getMethod(C1561oA.yd("7,<\u0010=A5\u00164537\u00136,.&\r!0...4\u0017", (short) (C1580rY.Xd() ^ (C1580rY.Xd() ^ (1745220595 ^ 1502411595)))), Class.forName(C1561oA.ud("epm-t^hd^'nji]ST`Ub^WQKNY[M\u0015STHHN\u000fRDQMKIM>\u0006\u001aEG9\u0018DC?A\u001b<006\u001b-:6426'", (short) (C1580rY.Xd() ^ (421473591 ^ (-421462575))))));
        try {
            method.setAccessible(true);
            callback.invoke((WritableMap) method.invoke(utils, objArr), null);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        short sXd = (short) (OY.Xd() ^ (291623963 ^ 291626925));
        int[] iArr = new int["\u0005#$\u001au#'\u001b\u007f&\".\b\u001d+\u001f&%3\u0003\u0011\b\u0017\u0015\u0010\f".length()];
        QB qb = new QB("\u0005#$\u001au#'\u001b\u007f&\".\b\u001d+\u001f&%3\u0003\u0011\b\u0017\u0015\u0010\f");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    @ReactMethod
    public final void setup(String str, String str2, String str3, String str4, String str5, String str6, ReadableMap readableMap, ReadableMap readableMap2, final Callback callback) throws Throwable {
        Intrinsics.checkNotNullParameter(callback, Xg.qd(",+78//2;", (short) (OY.Xd() ^ (Od.Xd() ^ (1331884394 ^ 144659539))), (short) (OY.Xd() ^ (C1580rY.Xd() ^ (-831091513)))));
        int iXd = OY.Xd() ^ (-69957705);
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(Jg.Wd("H\u0001\u0003r2n{j,\u001fb_Z\u0017cYKh\u001f\u001cOKL\u0002w7J',`( \u000fUS\u0012P<QR\u0007aQEDg\u000187tdr6+fVM\u0004l\u0002@KXlq(3l}", (short) (C1499aX.Xd() ^ ((904823353 ^ 240198026) ^ (-1002414522))), (short) (C1499aX.Xd() ^ iXd))).getDeclaredMethod(ZO.xd("!\u001f^}*AXw", (short) (ZN.Xd() ^ (C1580rY.Xd() ^ (1765780384 ^ (-1488371573)))), (short) (ZN.Xd() ^ ((1685689255 ^ 2034609213) ^ 490473565))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this, objArr);
            this.callback = callback;
            SetupModel setupModel = new SetupModel();
            setupModel.context = getReactApplicationContext();
            setupModel.urlBase = str;
            setupModel.publicKey = str2;
            setupModel.apiGetCertificates = str3;
            setupModel.apiExchange = str4;
            setupModel.exchangeEndPoint = str5;
            Intrinsics.checkNotNull(str6);
            short sXd = (short) (ZN.Xd() ^ ((495807691 ^ 877608625) ^ 700602619));
            short sXd2 = (short) (ZN.Xd() ^ ((1403234391 ^ 533055536) ^ 1281779196));
            int[] iArr = new int[".\u0007PNW^Y~+ N|?m\u0017\u0003\u001aq\u001d\"\u001e_@LkyMb\u0012(\fG2??n\u0017EG<\u0013\u000f\u0015\\C\u0001yD\u0012\u00128meaXA>r\u0001\niz D+fT\t\u0016".length()];
            QB qb = new QB(".\u0007PNW^Y~+ N|?m\u0017\u0003\u001aq\u001d\"\u001e_@LkyMb\u0012(\fG2??n\u0017EG<\u0013\u000f\u0015\\C\u0001yD\u0012\u00128meaXA>r\u0001\niz D+fT\t\u0016");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
                i2++;
            }
            Object[] objArr2 = {str6};
            Method declaredMethod2 = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(EO.Od("j\u001f\u0012<*mY5M@* ZR[d\u0018\u001f={", (short) (Od.Xd() ^ ((523097356 ^ 39234636) ^ (-494602606)))), Class.forName(Ig.wd("V\u0016GWy\u0004b5\fc\u0011J\u001a\r\u0014$", (short) (OY.Xd() ^ (2126784877 ^ 2126802891)))));
            try {
                declaredMethod2.setAccessible(true);
                setupModel.transformAes = (TransformAes) declaredMethod2.invoke(this, objArr2);
                if (readableMap != null) {
                    setupModel.exchangeAdditionalData = readableMap.toHashMap();
                } else {
                    setupModel.exchangeAdditionalData = new HashMap();
                }
                if (readableMap2 != null) {
                    Utils utils = Utils.INSTANCE;
                    Object[] objArr3 = {readableMap2.toHashMap()};
                    Method method = Class.forName(C1561oA.Qd("\b\u0013\u0010O\u0005\u0001\u0015\u0007\u0013\u0005\u007f\b|xDyu\n{\byt|qmlzy6jurqrp/hdjmam(Nl`bh", (short) (ZN.Xd() ^ ((3262985 ^ 1950093021) ^ 1947042596)))).getMethod(C1561oA.od("e_?O__P\\6IW9YVLPH", (short) (C1607wl.Xd() ^ ((1980203129 ^ 1275305439) ^ 973364318))), Class.forName(C1593ug.zd("G?UA\u000fWWMQ\u0014/I\\R8M]", (short) (C1633zX.Xd() ^ (1671712971 ^ (-1671712224))), (short) (C1633zX.Xd() ^ ((1213590213 ^ 2109769306) ^ (-898957984))))));
                    try {
                        method.setAccessible(true);
                        setupModel.exchangeHeaders = (Map) method.invoke(utils, objArr3);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                VsshCoreManagerImp vsshCoreManagerImp = this.coreManager;
                if (vsshCoreManagerImp == null) {
                    short sXd3 = (short) (OY.Xd() ^ (1660995682 ^ 1660991336));
                    int[] iArr2 = new int["\u000b\u0018\u001c\u0010x\u000e\u001c\u0010\u0017\u0016$".length()];
                    QB qb2 = new QB("\u000b\u0018\u001c\u0010x\u000e\u001c\u0010\u0017\u0016$");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd3 + sXd3) + i3));
                        i3++;
                    }
                    Intrinsics.throwUninitializedPropertyAccessException(new String(iArr2, 0, i3));
                    vsshCoreManagerImp = null;
                }
                vsshCoreManagerImp.setup(setupModel, new LambdaSuccess() { // from class: com.davivienda.daviviendaapp.bridges.VsshCoreInit.VsshCoreInitManager$$ExternalSyntheticLambda0
                    @Override // com.valid.vssh_android_core.model.LambdaSuccess
                    public final void lambdaSuccessResponse(Object obj) throws Throwable {
                        VsshCoreInitManager.$r8$lambda$zyCEfcvM_8E_9dTYCH6ZHMWoiew(callback, (CoreGenericBridgeModelResponse) obj);
                    }
                }, new LambdaSuccess() { // from class: com.davivienda.daviviendaapp.bridges.VsshCoreInit.VsshCoreInitManager$$ExternalSyntheticLambda1
                    @Override // com.valid.vssh_android_core.model.LambdaSuccess
                    public final void lambdaSuccessResponse(Object obj) throws Throwable {
                        VsshCoreInitManager.$r8$lambda$UTmaCUTKZyFFNJ7AwrotsSeNVUs(callback, (CoreGenericModelResponse) obj);
                    }
                }, new LambdaError() { // from class: com.davivienda.daviviendaapp.bridges.VsshCoreInit.VsshCoreInitManager$$ExternalSyntheticLambda2
                    @Override // com.valid.vssh_android_core.model.LambdaError
                    public final void lambdaErrorResponse(Object obj) throws Throwable {
                        VsshCoreInitManager.$r8$lambda$irClbsWi2KR9KZmwIrOUbmyp7Lk(callback, (CoreErrorModelResponse) obj);
                    }
                });
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }
}
