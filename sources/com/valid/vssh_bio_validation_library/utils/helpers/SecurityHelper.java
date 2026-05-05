package com.valid.vssh_bio_validation_library.utils.helpers;

import com.valid.security.entities.TransformRsa;
import com.valid.security.managers.RsaCrypto;
import com.valid.security.utils.SecurityUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Key;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;

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
@Metadata(bv = {1, 0, 3}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u001e\u007f\u0007lk?ԋD{߉^R\u0002)Op\u00024ż_$\u007fC\u0004e(~:\u000beM\u0016i\u001fNh\u000e[\u000f4\u001a?jt]c}u\u0012=6rsM9eok=\u0011xD\b82P<ѯ\t\b"}, d2 = {"\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017SJo;,^ka@\u0012c9\\@\u0015GJ^9`a\u0007 \u0014\u0019e\u000e[\u0001", "", "u(E", "0tX9W\u0017NP \u0003xD,\u0011i<o\b\u0016\u000bM\u0005 \u0019", "\u001aiPCTuLS\u0017\u000f\bb;\u0011R\u001au|/\u007f>f\u0017+\u001d", "9dh", "", "3mR?l7M@\u0007Z", "D`[BX", "Drb5 (GR&\t~]s|\u0011,e~'{?H\u0014\u001bQ7\u001f8})4U\r$Av\u0010-M@Km"}, k = 1, mv = {1, 4, 1}, pn = "", xs = "")
public final class SecurityHelper {
    public static final SecurityHelper INSTANCE = new SecurityHelper();

    private SecurityHelper() {
    }

    private final PublicKey buildPublicKeyFromString(String str) throws Throwable {
        try {
            Class<?> cls = Class.forName(C1561oA.yd("R`Sbd_W\"nn`d+@\\of83", (short) (C1633zX.Xd() ^ ((707264459 ^ 1264877935) ^ (-1631808531)))));
            Class<?>[] clsArr = new Class[819804508 ^ 819804510];
            clsArr[0] = Class.forName(C1561oA.Yd("\u0012\n \fY\u0019\u000f\u001d\u0017^\u0005'&\u001e$\u001e", (short) (OY.Xd() ^ (1942192939 ^ 1942205272))));
            clsArr[1] = Integer.TYPE;
            Object[] objArr = new Object[(1556791384 ^ 2080197377) ^ 657951579];
            objArr[0] = str;
            objArr[1] = 0;
            Method declaredMethod = cls.getDeclaredMethod(Xg.qd("IKJWMO", (short) (C1607wl.Xd() ^ (1075553547 ^ 1075574188)), (short) (C1607wl.Xd() ^ (39985173 ^ 39990493))), clsArr);
            try {
                declaredMethod.setAccessible(true);
                byte[] bArr = (byte[]) declaredMethod.invoke(null, objArr);
                Intrinsics.checkExpressionValueIsNotNull(bArr, Jg.Wd("puMu\fR\u000e~A\u007fY\rKN[\u0018ex2\u001b\u007fF}\u0019X\u0013f&t,}7\t?", (short) (C1499aX.Xd() ^ (1407642595 ^ (-1407643970))), (short) (C1499aX.Xd() ^ (547350116 ^ (-547343977)))));
                X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(bArr);
                short sXd = (short) (OY.Xd() ^ ((514619983 ^ 597066346) ^ 1027265339));
                short sXd2 = (short) (OY.Xd() ^ ((519457784 ^ 726398367) ^ 901624876));
                int[] iArr = new int["\u0011hs".length()];
                QB qb = new QB("\u0011hs");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
                    i2++;
                }
                KeyFactory keyFactory = KeyFactory.getInstance(new String(iArr, 0, i2));
                Intrinsics.checkExpressionValueIsNotNull(keyFactory, C1626yg.Ud("Zeg\u0010\u0011\u0006(^DJ\u001e=*~%3-\u0004\u001a\u000f}\fq+mm \u000f\u0015", (short) (C1607wl.Xd() ^ ((1513975666 ^ 243235944) ^ 1413615703)), (short) (C1607wl.Xd() ^ (2013487428 ^ 2013490591))));
                return keyFactory.generatePublic(x509EncodedKeySpec);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Exception unused) {
            return null;
        }
    }

    public final String encryptRSA(String str, String str2) throws Throwable {
        Intrinsics.checkParameterIsNotNull(str, Ig.wd("\u001eZs(x", (short) (Od.Xd() ^ (C1633zX.Xd() ^ 1951474515))));
        short sXd = (short) (C1607wl.Xd() ^ (ZN.Xd() ^ (1593502937 ^ 1836109797)));
        int[] iArr = new int["\u0007.r".length()];
        QB qb = new QB("\u0007.r");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        Intrinsics.checkParameterIsNotNull(str2, new String(iArr, 0, i2));
        String hexStringFromByteArray = SecurityUtils.getHexStringFromByteArray(new RsaCrypto().encrypt(TransformRsa.PKCS1, str, (Key) buildPublicKeyFromString(str2)));
        Intrinsics.checkExpressionValueIsNotNull(hexStringFromByteArray, C1561oA.Qd("VgduqgquPnbdj$\\Yg:VhBb_UYQ/ZVS']WG\"RQ?V\u0004=SM=\u0018HG5Lz", (short) (C1607wl.Xd() ^ (ZN.Xd() ^ 864693588))));
        return hexStringFromByteArray;
    }
}
