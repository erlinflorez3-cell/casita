package com.valid.vssh_bio_validation_library.usecases;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyPermanentlyInvalidatedException;
import com.valid.vssh_bio_validation_library.utils.helpers.SecurePreferencesHelper;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {1, 0, 3}, d1 = {"Я@\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.hS2şs{J$cҕyCIU\"Ԃ*\teNo˧vJh\u0017K\u000f\f\u0018~͚,_ǁ)]@\u000erGu?ݯQoK9)\tD\u001082PD*\t\u000f'BH>\u0005+GY\u001b*0n\u0001\u0003`\u001b^\u001d\u001a@\u0012n$\u000f!tg|:\u000fl&>=5\u001bipPok>\u0010e\rt^W\u0011\u0005n6+nE\u0006!3T\u001b\u0007\u0001]\u0016ŤkџA\u0005pѧw7Wvo6\u0007\u0004jƆW̠\u0011]z̦-\u0011_e$'YU:֢|ˎ,w\u0003Ԉ]H\u0012\u0015\u001e'v6\u0004Ղ\u0013ڿ\u00123|Ɂ$L^\u000bvB.\u00058تCӾ\u000433ݍӾje"}, d2 = {"\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017SIk2\u001a#ho\u0003n_:]v4-Lb\u000f\\Y}=!g", "", "u(E", "1h_5X9", "\u001aiPCT?\bQ&\u0013\u0006m6Ff3p\u0003(\t\u0016", "9dh\u0014X5)O&z\u0003^;|\u0016\u001dp\u007f&", "\u001a`]1e6BRb\rz\\<\n\r>yI.{T\u000f&!ToW\"v9\u0017Y\u0007\u000b3z\u00126MR;x\")\u0015f7", "9dh\u0014X5>`\u0015\u000e\u0005k", "\u001aiPCT?\bQ&\u0013\u0006m6Fn/ya(\u0005@\u000e\u0013&Q|c", "9dh g6KS", "\u001aiPCTuLS\u0017\u000f\bb;\u0011R\u0015e\u0014\u0016\u000bJ\u000e\u0017l", "AdR?X;$S-", "\u001aiPCT?\bQ&\u0013\u0006m6Fv/c\r(\u000b&\u0001+l", "5d]2e(MS\u0001z\tm,\nn/y", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "9dh\u001bT4>", "", "5d]2e(MS\u0007~xk,\fn/y", "5dc\u0010\\7AS&", "5dc X*KS(dzr", "Drb5 (GR&\t~]s|\u0011,e~'{?H\u0014\u001bQ7\u001f8})4U\r$Av\u0010-M@Km"}, k = 1, mv = {1, 4, 1}, pn = "", xs = "")
public final class MasterKeyHelper {
    public static final MasterKeyHelper INSTANCE = new MasterKeyHelper();
    private static Cipher cipher = null;
    private static KeyGenParameterSpec keyGenParameterSpec = null;
    private static KeyGenerator keyGenerator = null;
    private static KeyStore keyStore = null;
    private static SecretKey secretKey = null;

    private MasterKeyHelper() {
    }

    private final void generateSecretKey(KeyGenParameterSpec keyGenParameterSpec2) {
        short sXd = (short) (C1499aX.Xd() ^ (2049888050 ^ (-2049896836)));
        int[] iArr = new int["\u0014\u0017$".length()];
        QB qb = new QB("\u0014\u0017$");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        try {
            KeyGenerator keyGenerator2 = KeyGenerator.getInstance(new String(iArr, 0, i2), C1561oA.Kd("},#20+'\u000f*?\u001a<8<0", (short) (FB.Xd() ^ ((1661047071 ^ 2001557417) ^ 340586261))));
            Intrinsics.checkExpressionValueIsNotNull(keyGenerator2, Wg.Zd("G-\raK &~tS\u001a,3w=\u0018{l|E}\u0016Zg쁀b\u007f1@\u001a:9\u000b5.k\u0005MV\u001dKpP9&lv5\u0001S", (short) (C1633zX.Xd() ^ (604147759 ^ (-604175102))), (short) (C1633zX.Xd() ^ (1449405273 ^ (-1449400590)))));
            keyGenerator = keyGenerator2;
            String strXd = C1561oA.Xd("a\\q@_iao_sos", (short) (C1499aX.Xd() ^ ((2111054708 ^ 95951582) ^ (-2020370609))));
            if (keyGenerator2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(strXd);
            }
            keyGenerator2.init(keyGenParameterSpec2);
            KeyGenerator keyGenerator3 = keyGenerator;
            if (keyGenerator3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(strXd);
            }
            keyGenerator3.generateKey();
        } catch (KeyPermanentlyInvalidatedException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        } catch (InvalidAlgorithmParameterException e4) {
            e4.printStackTrace();
        } catch (KeyStoreException e5) {
            e5.printStackTrace();
        } catch (NoSuchAlgorithmException e6) {
            e6.printStackTrace();
        } catch (NoSuchProviderException e7) {
            e7.printStackTrace();
        } catch (CertificateException e8) {
            e8.printStackTrace();
        }
    }

    public final void generateMasterKey(Context context, String str) throws Throwable {
        Intrinsics.checkParameterIsNotNull(context, Wg.vd("'249-?>", (short) (C1607wl.Xd() ^ (ZN.Xd() ^ (1873901903 ^ 1547399819)))));
        Intrinsics.checkParameterIsNotNull(str, Qg.kd("\u0010\t\u001co\u0002\r\u0004", (short) (C1633zX.Xd() ^ ((1501561239 ^ 654788674) ^ (-2122803526))), (short) (C1633zX.Xd() ^ (ZN.Xd() ^ (-864688399)))));
        new SecurePreferencesHelper(context).setKeyNameSafely(str);
        try {
            KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder(str, (517541339 ^ 2130267891) ^ 1612727083);
            String[] strArr = new String[1];
            short sXd = (short) (C1607wl.Xd() ^ ((1405088182 ^ 443757214) ^ 1238158465));
            short sXd2 = (short) (C1607wl.Xd() ^ (1587773634 ^ 1587777340));
            int[] iArr = new int[":88".length()];
            QB qb = new QB(":88");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                i2++;
            }
            strArr[0] = new String(iArr, 0, i2);
            Object[] objArr = {strArr};
            Method method = Class.forName(C1561oA.ud("t\u0001u\u0003~wq:~ol}yoy}1mfyrrln`(D]p=ZbCScQ\\SaQ]=YMJ\n'YLNEEQ", (short) (C1580rY.Xd() ^ (2113505243 ^ (-2113509282))))).getMethod(C1561oA.yd("@1?\f=?29\u00123''<", (short) (C1607wl.Xd() ^ (519451968 ^ 519468721))), String[].class);
            try {
                method.setAccessible(true);
                KeyGenParameterSpec.Builder builder2 = (KeyGenParameterSpec.Builder) method.invoke(builder, objArr);
                String[] strArr2 = new String[1];
                strArr2[0] = C1561oA.Yd("yun\u007fd~\u0011\u0015\u0016\u001c\"\u001c", (short) (C1607wl.Xd() ^ ((1489470177 ^ 963300835) ^ 1638752741)));
                Object[] objArr2 = {strArr2};
                Method method2 = Class.forName(Xg.qd("hvm|zuq<\u0003ut\b\u0006}\n\u0010E\u0004~\u0014\u000f\u0011\r\u0011\u0005Nl\b\u001dk\u000b\u0015w\n\u001c\f\u0019\u0012\"\u0014\"\u0004\"\u0018\u0017Xw,!%\u001e .", (short) (C1633zX.Xd() ^ ((759507179 ^ 1216641999) ^ (-1707152139))), (short) (C1633zX.Xd() ^ ((1284418319 ^ 14584873) ^ (-1280318733))))).getMethod(Jg.Wd("z`\u0002(c\u001e?\u001c%/u\u0012bJ-F\u0018\u0003\u001ah\u0007", (short) (C1633zX.Xd() ^ (843421728 ^ (-843444347))), (short) (C1633zX.Xd() ^ ((1274851653 ^ 2138879015) ^ (-880826794)))), String[].class);
                try {
                    method2.setAccessible(true);
                    KeyGenParameterSpec.Builder builder3 = (KeyGenParameterSpec.Builder) method2.invoke(builder2, objArr2);
                    short sXd3 = (short) (FB.Xd() ^ ((1754166164 ^ 1702305212) ^ 234423752));
                    short sXd4 = (short) (FB.Xd() ^ ((756865273 ^ 776442123) ^ 56325728));
                    int[] iArr2 = new int[">@\"\u0015PaiO\u001d$ \u0018'2\nxg3&@B.?L5FBQ\u001a\u0015G\u0002\n::!T\\Jq<\boV_9A\nM1\u0018\u007f6".length()];
                    QB qb2 = new QB(">@\"\u0015PaiO\u001d$ \u0018'2\nxg3&@B.?L5FBQ\u001a\u0015G\u0002\n::!T\\Jq<\boV_9A\nM1\u0018\u007f6");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd4) + sXd3)));
                        i3++;
                    }
                    Object[] objArr3 = {true};
                    Method method3 = Class.forName(new String(iArr2, 0, i3)).getMethod(C1626yg.Ud("n@Wc\u0013;1OPdBc\u001f\t u\u000fA:2ex4\"}')\u007fU", (short) (FB.Xd() ^ ((1404566947 ^ 77517371) ^ 1462312745)), (short) (FB.Xd() ^ ((317494765 ^ 146787999) ^ 441651441))), Boolean.TYPE);
                    try {
                        method3.setAccessible(true);
                        KeyGenParameterSpec.Builder builder4 = (KeyGenParameterSpec.Builder) method3.invoke(builder3, objArr3);
                        short sXd5 = (short) (C1633zX.Xd() ^ (674107094 ^ (-674135357)));
                        int[] iArr3 = new int["o%\u0019\u0007\u001b@gX[9A-[P[:\u001ae'S\u000b_DK\f\u0018\u0013\u0001j&0\u0013TCy!Qk\u0002~\u000e\u0005ZS.x~\u0005\t*_+\u001a".length()];
                        QB qb3 = new QB("o%\u0019\u0007\u001b@gX[9A-[P[:\u001ae'S\u000b_DK\f\u0018\u0013\u0001j&0\u0013TCy!Qk\u0002~\u000e\u0005ZS.x~\u0005\t*_+\u001a");
                        int i4 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ (sXd5 + i4)));
                            i4++;
                        }
                        Object[] objArr4 = new Object[0];
                        Method method4 = Class.forName(new String(iArr3, 0, i4)).getMethod(EO.Od("\u0015~\u0003$s", (short) (C1580rY.Xd() ^ (1658672954 ^ (-1658654875)))), new Class[0]);
                        try {
                            method4.setAccessible(true);
                            KeyGenParameterSpec keyGenParameterSpec2 = (KeyGenParameterSpec) method4.invoke(builder4, objArr4);
                            Intrinsics.checkExpressionValueIsNotNull(keyGenParameterSpec2, C1561oA.Qd("\u0015.A\u000e+3\u0014$4\"-$2\".\u000e*\u001e\u001bdw*\u001d\u001f奘PONMLKJIHGFEDCBA@M\u0001\u0013\u0006\b~AA", (short) (C1580rY.Xd() ^ ((1275448998 ^ 744870488) ^ (-1616918387)))));
                            keyGenParameterSpec = keyGenParameterSpec2;
                            if (keyGenParameterSpec2 == null) {
                                short sXd6 = (short) (Od.Xd() ^ ((651062668 ^ 859981883) ^ (-361502036)));
                                short sXd7 = (short) (Od.Xd() ^ ((599520252 ^ 1867523618) ^ (-1290505566)));
                                int[] iArr4 = new int["\u0002|\u0012`\u007f\nl~\u0011\u0001\u000e\u0007\u0017\t\u0017x\u0017\r\f".length()];
                                QB qb4 = new QB("\u0002|\u0012`\u007f\nl~\u0011\u0001\u000e\u0007\u0017\t\u0017x\u0017\r\f");
                                int i5 = 0;
                                while (qb4.YK()) {
                                    int iKK4 = qb4.KK();
                                    Xu xuXd4 = Xu.Xd(iKK4);
                                    iArr4[i5] = xuXd4.fK((xuXd4.CK(iKK4) - (sXd6 + i5)) - sXd7);
                                    i5++;
                                }
                                Intrinsics.throwUninitializedPropertyAccessException(new String(iArr4, 0, i5));
                            }
                            generateSecretKey(keyGenParameterSpec2);
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        } catch (KeyPermanentlyInvalidatedException e6) {
            e6.printStackTrace();
        }
    }

    public final Cipher getCipher() {
        short sXd = (short) (Od.Xd() ^ (1601952067 ^ (-1601960439)));
        int[] iArr = new int["TWd?RPP;[UL[>Vfhgkog".length()];
        QB qb = new QB("TWd?RPP;[UL[>Vfhgkog");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        try {
            Cipher cipher2 = Cipher.getInstance(new String(iArr, 0, i2));
            Intrinsics.checkExpressionValueIsNotNull(cipher2, C1561oA.Kd("\u001aAIB@N\u000bEDT*PVXFTJM\u0011s\u000b\f\r\u000e唪45;A;TFB;L1\u0005\u001c\u001d\u001e\u001f !\"#$%&'1", (short) (OY.Xd() ^ ((1178248261 ^ 712731730) ^ 1816255113))));
            cipher = cipher2;
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
        } catch (NoSuchPaddingException e3) {
            e3.printStackTrace();
        }
        Cipher cipher3 = cipher;
        if (cipher3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Wg.Zd("M\"\u001e0\n?", (short) (OY.Xd() ^ (1707595485 ^ 1707578191)), (short) (OY.Xd() ^ (311639509 ^ 311632840))));
        }
        return cipher3;
    }

    public final SecretKey getSecretKey(Context context) throws Throwable {
        Object[] objArr;
        Method declaredMethod;
        Intrinsics.checkParameterIsNotNull(context, C1561oA.Xd("o||\u0004u\n\u0007", (short) (C1633zX.Xd() ^ (FB.Xd() ^ (-1609517583)))));
        short sXd = (short) (ZN.Xd() ^ (1951720035 ^ 1951708712));
        int[] iArr = new int["/]TcYTP8[pKmaeY".length()];
        QB qb = new QB("/]TcYTP8[pKmaeY");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        try {
            Class<?> cls = Class.forName(Qg.kd("\u000f\u0005\u0019\u0003N\u0013\u0004\u0001\u0012\u000e\u0004\u000e\u0012Eaz\u000ef\u0007\u0001\u0003t", (short) (OY.Xd() ^ ((1144621779 ^ 1289293707) ^ 148938308)), (short) (OY.Xd() ^ ((337559115 ^ 1998151518) ^ 1661453079))));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(hg.Vd("8.B,w5)5-r\u001774*.&", (short) (Od.Xd() ^ ((832473993 ^ 1686690552) ^ (-1427519639))), (short) (Od.Xd() ^ (1703679277 ^ (-1703681947)))));
            objArr = new Object[]{str};
            declaredMethod = cls.getDeclaredMethod(C1561oA.ud("\u001b\u0018&y\u001e\"\"\u000e\u001a\u000e\u000f", (short) (C1633zX.Xd() ^ (4689109 ^ (-4688869)))), clsArr);
        } catch (KeyPermanentlyInvalidatedException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        } catch (InvalidAlgorithmParameterException e4) {
            e4.printStackTrace();
        } catch (KeyStoreException e5) {
            e5.printStackTrace();
        } catch (NoSuchAlgorithmException e6) {
            e6.printStackTrace();
        } catch (NoSuchProviderException e7) {
            e7.printStackTrace();
        } catch (CertificateException e8) {
            e8.printStackTrace();
        }
        try {
            declaredMethod.setAccessible(true);
            KeyStore keyStore2 = (KeyStore) declaredMethod.invoke(null, objArr);
            Intrinsics.checkExpressionValueIsNotNull(keyStore2, C1561oA.yd("<WlGiei]\u0017QP`6\\bdBPFI\r\b(V=LJEA)DY$FBF:w\u007f", (short) (C1499aX.Xd() ^ (914457460 ^ (-914464544)))));
            keyStore = keyStore2;
            String strYd = C1561oA.Yd("% 5\u00102.2&", (short) (ZN.Xd() ^ ((2031184411 ^ 1267566310) ^ 849143460)));
            if (keyStore2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(strYd);
            }
            Class<?> cls2 = Class.forName(Xg.qd("\u0001x\u000fzH\u000f\u0002\u0001\u0014\u0012\n\u0016\u001cQo\u000b z\u001d\u0019\u001d\u0011", (short) (C1499aX.Xd() ^ ((1152442078 ^ 586589531) ^ (-1715887373))), (short) (C1499aX.Xd() ^ (686015034 ^ (-686005946)))));
            Class<?>[] clsArr2 = new Class[1];
            short sXd2 = (short) (C1580rY.Xd() ^ (1586178515 ^ (-1586175367)));
            short sXd3 = (short) (C1580rY.Xd() ^ (788387518 ^ (-788390739)));
            int[] iArr2 = new int["v\u001en\u000b\u0003z(W5c\u0015Q\u0002gA\rlxS\u0001-SK(\u0015:v\u0019b\u0011Ms(l9Y\u00119\u0004&~".length()];
            QB qb2 = new QB("v\u001en\u000b\u0003z(W5c\u0015Q\u0002gA\rlxS\u0001-SK(\u0015:v\u0019b\u0011Ms(l9Y\u00119\u0004&~");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd3) ^ sXd2));
                i3++;
            }
            clsArr2[0] = Class.forName(new String(iArr2, 0, i3));
            Object[] objArr2 = {null};
            Method method = cls2.getMethod(ZO.xd("Z\u0007b,", (short) (C1580rY.Xd() ^ (490387818 ^ (-490405427))), (short) (C1580rY.Xd() ^ (1887968020 ^ (-1887993224)))), clsArr2);
            try {
                method.setAccessible(true);
                method.invoke(keyStore2, objArr2);
                KeyStore keyStore3 = keyStore;
                if (keyStore3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(strYd);
                }
                String keyNameSafely = new SecurePreferencesHelper(context).getKeyNameSafely();
                Class<?> cls3 = Class.forName(C1626yg.Ud("\u0007-k\u0015S\b|v]Nu\u0003q9rE]\u0018^\u000669", (short) (OY.Xd() ^ ((897945999 ^ 446069801) ^ 789832102)), (short) (OY.Xd() ^ ((2015975583 ^ 2092849452) ^ 77027262))));
                Class<?>[] clsArr3 = new Class[282899814 ^ 282899812];
                clsArr3[0] = Class.forName(Ig.wd("&U\u001d 45\u0016c-\u0010;zM6\u001f6", (short) (C1633zX.Xd() ^ ((1212486498 ^ 482012274) ^ (-1426034357)))));
                clsArr3[1] = char[].class;
                Object[] objArr3 = new Object[(187851787 ^ 557647227) ^ 705651058];
                objArr3[0] = keyNameSafely;
                objArr3[1] = null;
                Method method2 = cls3.getMethod(EO.Od("\u007f%&e\bh", (short) (ZN.Xd() ^ (1247530679 ^ 1247524514))), clsArr3);
                try {
                    method2.setAccessible(true);
                    Key key = (Key) method2.invoke(keyStore3, objArr3);
                    if (key == null) {
                        throw new TypeCastException(C1561oA.Qd("\t\u000f\u0005\u00046xu\u0002\u0001\u0001\u0005/pr,nk||'zt$qqo-msih\u001bnrh\\\u0016_UiSi\u001eR`f\\_Y\u0017;LIWIW-FY", (short) (OY.Xd() ^ (304074092 ^ 304065014))));
                    }
                    secretKey = (SecretKey) key;
                    SecretKey secretKey2 = secretKey;
                    if (secretKey2 == null) {
                        short sXd4 = (short) (Od.Xd() ^ ((1963138939 ^ 1213009602) ^ (-1028522382)));
                        short sXd5 = (short) (Od.Xd() ^ (1099174144 ^ (-1099171811)));
                        int[] iArr3 = new int["OBAQEU-H]".length()];
                        QB qb3 = new QB("OBAQEU-H]");
                        int i4 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i4] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd4 + i4)) - sXd5);
                            i4++;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException(new String(iArr3, 0, i4));
                    }
                    return secretKey2;
                } catch (InvocationTargetException e9) {
                    throw e9.getCause();
                }
            } catch (InvocationTargetException e10) {
                throw e10.getCause();
            }
        } catch (InvocationTargetException e11) {
            throw e11.getCause();
        }
    }
}
