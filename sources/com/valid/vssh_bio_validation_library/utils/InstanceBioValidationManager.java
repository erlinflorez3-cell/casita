package com.valid.vssh_bio_validation_library.utils;

import android.app.KeyguardManager;
import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import com.valid.vssh_bio_validation_library.manager.IBioValidationManager;
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
import yg.Od;
import yg.QB;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {1, 0, 3}, d1 = {"ЯJ\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005%4\u0012\u000e\u0007nj?3Le^.ZS0\u0012s{J$c$wFCU(\u0007*ޛWN}gvJ`\u000eK\u000f\u0014\u0016\u0001j2L]xs\u0012\u0017˰HŪ?Iݹ =g_5;\u000b ݨ&8\b\u0005I&8i(v)e{\u0010 SXphfUQ\u0013>*\u0006l\"I\"j\rf6v\u0007&F=I\u001bippWc>$e\rt|w%\u0005b6+n9\f՝Q٨\u0007\u0013Z¹W\u0005EtK\t\t)-0Wy(Nf\u0007,\u0015YWcƥ\u001f͉`\u0011YӠ$)1XqUp\u0010.\u0003\t\b]T\u0012\u001b\u001e'v<\u0004Ն\u0013ڿ\u0012?|ɁkBV\u0011lR |gG%7PK9L3f\u007fu\u0012ϑzѼ\u007f\u0011\u0015̔;\u0003t6ij.b\u001b2b\u0010\"=_YUH|$0Ơyձtb\nÏTHU\u001bG{?Jm\u00adc٦=/)ǽ\u001aJJ\u0005\u0005#\u0001jY\t`hـ&\u0018"}, d2 = {"\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017SJo;,^LjG\u0016_5Lv\u0004KV?(cVq9#\u0016d\u00176'\u0016\u0001[A1D", "", "u(E", "1`]0X3EO(\u0003\u0005g\u001a\u0001\u000b8a\u0007", "\u001a`]1e6BRb\t\t(\nx\u0012-e\u0007/wO\u0005! 5s\u0010Er,\u000b", "5dc\u0010T5<S \u0006vm0\u0007\u0012\u001di\u00021wG", "u(;.a+K]\u001d}Dh:Ff+n}(\u0003G|&\u001bQx{@x.1`S", "Adc\u0010T5<S \u0006vm0\u0007\u0012\u001di\u00021wG", "uKP;W9HW\u0018H\u0005luZ\u00058c\u007f/\u0003<\u0010\u001b!P]\u0012>\u007f!</A\u0011", "2hP9b.\u001fW\"\u0001zk7\n\r8t", "\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017SJo;,^Ge5\u000em./z0IL[7iV{Li", "5dc\u0011\\(E]\u001b_~g.|\u0016:r\u00041\u000b", "u(;0b4\bd\u0015\u0006~]u\u000e\u0017=hy%\u007fJz(\u0013Ns\r8\u0006)?bw';j#*ZW\u0005{C\"\u001cv+\u0018\u000b_3Xx\bKUP,i]\u007fA\u001d!0", "Adc\u0011\\(E]\u001b_~g.|\u0016:r\u00041\u000b", "uKR<`uOO \u0003y(=\u000b\u00172_|,\u0006:\u0012\u0013\u001eKn\nKz/>S\u0005$4z\u0012;a\rKz8%#2@=\u0003j6PW+PNN9g_vF#g\u001e~", "4h]4X9I`\u001d\b\nF(\u0006\u00051e\r", "\u001a`]1e6BRb\u0002vk+\u000f\u0005<eI)\u007fI\u0003\u0017$R|\u0012E\u0006n\u0016]\u0007\"7z!;QLJS0'\u0011jaF\\", "5dc\u0013\\5@S&\n\bb5\fp+n{*{M", "u(;.a+K]\u001d}Da(\n\bAa\r(EA\u0005 \u0019G|\u0019Iz.D#^$@o\u0016;XP?tC\u0006\u0011q];\u0007p\u0002", "Adc\u0013\\5@S&\n\bb5\fp+n{*{M", "uKP;W9HW\u0018H}Z9{\u001b+r\u007fq|D\n\u0019\u0017Tz\u001b@\u007f4~:\u0002)9m#9ZGDz\u001c\u001a\u001edc9\u00149o?", "7LTA[6=au\u0003\u0005O(\u0004\r.a\u000f,\u0006I", "\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017K7t0 \u0015u+\u001dcg6?r.KKJ;`\\{%\u0010\u001bV\u0010N8b", "5dc\u0016@,MV#}\t;0\u0007y+l\u0004'wO\u0005! ", "u(;0b4\bd\u0015\u0006~]u\u000e\u0017=hy%\u007fJz(\u0013Ns\r8\u0006)?bw';j#*ZW\u0005s0'\u0011jaFPG\tR\u0001\u0018CSR+XavG\u001dyV\u0017J-\r\u0012/", "Adc\u0016@,MV#}\t;0\u0007y+l\u0004'wO\u0005! ", "uKR<`uOO \u0003y(=\u000b\u00172_|,\u0006:\u0012\u0013\u001eKn\nKz/>S\u0005$4z\u0012;a\rCg=\u001a\u0017hn\u0003j@0Xg#NPM(kV|F{\u000ec\nP+\u001aZ\u001d2", "7mbAT5<S\u0001z\u0004Z.|\u0016", "", "9dh4h(KR\u0001z\u0004Z.|\u0016", "\u001a`]1e6BRbz\u0006iub\tCg\u0010$\t?h\u0013 Cq\u000eIL", "5dc\u0018X@@c\u0015\fyF(\u0006\u00051e\r", "u(;.a+K]\u001d}DZ7\bR\u0015e\u0014*\f<\u000e\u0016~Cx\n>v2\u000b", "Adc\u0018X@@c\u0015\fyF(\u0006\u00051e\r", "uKP;W9HW\u0018Hvi7Fn/y\u00028wM\u007f~\u0013Pk\u0010<\u0004zxJ", "1qT.g,\"\\'\u000evg*|", "", "7AX<I(EW\u0018z\nb6\u0006p+n{*{M", "5dc\u0010T5<S \u0006vm0\u0007\u0012\u001di\u00021wGd %Vk\u0017:v", "5dc\u0016a:MO\"|z", "AsP?g\rB\\\u001b~\bI9\u0001\u0012>", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "Drb5 (GR&\t~]s|\u0011,e~'{?H\u0014\u001bQ7\u001f8})4U\r$Av\u0010-M@Km"}, k = 1, mv = {1, 4, 1}, pn = "", xs = "")
public final class InstanceBioValidationManager {
    public static final InstanceBioValidationManager INSTANCE = new InstanceBioValidationManager();
    public static CancellationSignal cancellationSignal = null;
    public static DialogFingerprint dialogFingerprint = null;
    public static FingerprintManager fingerprintManager = null;
    public static IBioValidationManager iMethodsBioValidation = null;
    private static boolean instanceManager = false;
    public static KeyguardManager keyguardManager = null;

    private InstanceBioValidationManager() {
    }

    public final void createInstance(IBioValidationManager iBioValidationManager) {
        Intrinsics.checkParameterIsNotNull(iBioValidationManager, Jg.Wd(":LASAX!c+6\u0011P\u0013\u001c\u0004${zz\u0005\\", (short) (C1607wl.Xd() ^ (FB.Xd() ^ 1609510848)), (short) (C1607wl.Xd() ^ (C1580rY.Xd() ^ (107672241 ^ (-937668134))))));
        iMethodsBioValidation = iBioValidationManager;
        instanceManager = true;
    }

    public final CancellationSignal getCancellationSignal() {
        CancellationSignal cancellationSignal2 = cancellationSignal;
        if (cancellationSignal2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(ZO.xd("qnR\u0002E+L9B;\\vD \u0016\u0010?b", (short) (C1580rY.Xd() ^ ((333317721 ^ 25958621) ^ (-307382249))), (short) (C1580rY.Xd() ^ (1902481035 ^ (-1902502897)))));
        }
        return cancellationSignal2;
    }

    public final CancellationSignal getCancellationSignalInstance() {
        CancellationSignal cancellationSignal2 = cancellationSignal;
        if (cancellationSignal2 == null) {
            int iXd = C1633zX.Xd() ^ (863345543 ^ (-1193606482));
            Intrinsics.throwUninitializedPropertyAccessException(C1626yg.Ud("\u0017\u001cF=fH\u007fL6nT3lV\\\u0016cn", (short) (OY.Xd() ^ ((668454861 ^ 468876287) ^ 1009104725)), (short) (OY.Xd() ^ iXd)));
        }
        return cancellationSignal2;
    }

    public final DialogFingerprint getDialogFingerprint() {
        DialogFingerprint dialogFingerprint2 = dialogFingerprint;
        if (dialogFingerprint2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Ig.wd("\bf0\u0013\u0007*5w:\u0013\u0017\u0002-)4\u0017D", (short) (FB.Xd() ^ (1001773289 ^ 1001756165))));
        }
        return dialogFingerprint2;
    }

    public final FingerprintManager getFingerprintManager() {
        FingerprintManager fingerprintManager2 = fingerprintManager;
        if (fingerprintManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(EO.Od("H#6OH+Gb!\u0004\u000eB\"7\u001c}YV", (short) (C1607wl.Xd() ^ ((174240164 ^ 621364672) ^ 795582528))));
        }
        return fingerprintManager2;
    }

    public final IBioValidationManager getIMethodsBioValidation() {
        IBioValidationManager iBioValidationManager = iMethodsBioValidation;
        if (iBioValidationManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException(C1561oA.Qd("\u0002d{\n|\u0003v\u0005Rx}cmwsmi{otr", (short) (C1580rY.Xd() ^ ((698675921 ^ 1110279840) ^ (-1804168628)))));
        }
        return iBioValidationManager;
    }

    public final boolean getInstance() {
        return instanceManager;
    }

    public final KeyguardManager getKeyguardManager() {
        KeyguardManager keyguardManager2 = keyguardManager;
        if (keyguardManager2 == null) {
            int iXd = C1580rY.Xd() ^ (1444872473 ^ (-1737911524));
            Intrinsics.throwUninitializedPropertyAccessException(C1593ug.zd("mh}l{hzmWlznut\u0003", (short) (OY.Xd() ^ (1813492750 ^ 1813507464)), (short) (OY.Xd() ^ iXd)));
        }
        return keyguardManager2;
    }

    public final void setCancellationSignal(CancellationSignal cancellationSignal2) {
        Intrinsics.checkParameterIsNotNull(cancellationSignal2, C1561oA.od("\u000fE6D{\r\u000b", (short) (Od.Xd() ^ (45887151 ^ (-45891430)))));
        cancellationSignal = cancellationSignal2;
    }

    public final void setDialogFingerprint(DialogFingerprint dialogFingerprint2) {
        short sXd = (short) (ZN.Xd() ^ (C1499aX.Xd() ^ (436147803 ^ (-1516507667))));
        int[] iArr = new int["\nB5E~\u0012\u0012".length()];
        QB qb = new QB("\nB5E~\u0012\u0012");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        Intrinsics.checkParameterIsNotNull(dialogFingerprint2, new String(iArr, 0, i2));
        dialogFingerprint = dialogFingerprint2;
    }

    public final void setFingerprintManager(FingerprintManager fingerprintManager2) {
        Intrinsics.checkParameterIsNotNull(fingerprintManager2, Wg.Zd("LeE#\niW", (short) (OY.Xd() ^ (1037742755 ^ 1037753965)), (short) (OY.Xd() ^ (145247157 ^ 145242293))));
        fingerprintManager = fingerprintManager2;
    }

    public final void setIMethodsBioValidation(IBioValidationManager iBioValidationManager) {
        Intrinsics.checkParameterIsNotNull(iBioValidationManager, C1561oA.Xd("i\"\u0015%^qq", (short) (C1499aX.Xd() ^ (1847806784 ^ (-1847818926)))));
        iMethodsBioValidation = iBioValidationManager;
    }

    public final void setKeyguardManager(KeyguardManager keyguardManager2) {
        Intrinsics.checkParameterIsNotNull(keyguardManager2, Wg.vd("_\u0018\u000b\u001bL__", (short) (C1607wl.Xd() ^ (152546821 ^ 152546660))));
        keyguardManager = keyguardManager2;
    }

    public final void startFingerPrint(Context context) throws Throwable {
        int iXd = C1633zX.Xd() ^ 1951496659;
        int iXd2 = C1499aX.Xd() ^ 1134250255;
        short sXd = (short) (C1499aX.Xd() ^ iXd);
        short sXd2 = (short) (C1499aX.Xd() ^ iXd2);
        int[] iArr = new int["\u001a%#(\u0018*%".length()];
        QB qb = new QB("\u001a%#(\u0018*%");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        Intrinsics.checkParameterIsNotNull(context, new String(iArr, 0, i2));
        Object[] objArr = {hg.Vd("\n\u0003\u0016\u0003\u0010z\u000b{", (short) (C1633zX.Xd() ^ (ZN.Xd() ^ (916987516 ^ (-86127200)))), (short) (C1633zX.Xd() ^ (C1607wl.Xd() ^ (572942581 ^ (-1281518649)))))};
        Method method = Class.forName(C1561oA.ud("JVKXTMG\u0010DOMRBJO\b\u001cGEJ:LG", (short) (C1499aX.Xd() ^ (C1607wl.Xd() ^ (-1849962391))))).getMethod(C1561oA.Yd("WVfFmhj\\eL_mrfad", (short) (ZN.Xd() ^ (ZN.Xd() ^ 864713009))), Class.forName(C1561oA.yd("UMcO\u0015TJXJ\u00128ZQIOI", (short) (FB.Xd() ^ ((572996710 ^ 326925264) ^ 828079673)))));
        try {
            method.setAccessible(true);
            KeyguardManager keyguardManager2 = (KeyguardManager) method.invoke(context, objArr);
            if (keyguardManager2 == null) {
                Intrinsics.throwNpe();
            }
            keyguardManager = keyguardManager2;
            Object[] objArr2 = {Xg.qd("kouon|{~v|\u0004", (short) (ZN.Xd() ^ (1839337116 ^ 1839337096)), (short) (ZN.Xd() ^ ((1963417095 ^ 616213775) ^ 1371395154)))};
            Method method2 = Class.forName(Jg.Wd("\u007f\u0015H\u001a ]\u0016cb2/z3:\u0004\u0007_\tK\u001c\u000fa#", (short) (FB.Xd() ^ ((1604210041 ^ 1295292206) ^ 313191355)), (short) (FB.Xd() ^ ((950419923 ^ 308942281) ^ 718018655)))).getMethod(C1626yg.Ud("GZtyD+\u0001[G#2LEu({", (short) (FB.Xd() ^ ((96817082 ^ 1162211844) ^ 1082163685)), (short) (FB.Xd() ^ (1028385804 ^ 1028361759))), Class.forName(ZO.xd("2^aB\u0007\f@Co=g\u0011F6MK", (short) (C1633zX.Xd() ^ (993176614 ^ (-993167826))), (short) (C1633zX.Xd() ^ (9886267 ^ (-9873114))))));
            try {
                method2.setAccessible(true);
                FingerprintManager fingerprintManager2 = (FingerprintManager) method2.invoke(context, objArr2);
                if (fingerprintManager2 == null) {
                    Intrinsics.throwNpe();
                }
                fingerprintManager = fingerprintManager2;
                dialogFingerprint = new DialogFingerprint();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }
}
