package com.ts.coresdk.crypto.logic;

import android.content.Context;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ts.coresdk.ITSModuleInfo;
import com.ts.coresdk.crypto.Encryptor;
import com.ts.coresdk.crypto.SignatureAuthenticator;
import com.ts.coresdk.crypto.logic.CryptographyActionError;
import com.ts.coresdk.crypto.logic.SignWithKeyResult;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
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
@Metadata(bv = {}, d1 = {"ЯL\u001d<K!&i\u0016DLш|\u0004O\u00128é6B\u0015\"4\u0012}\tnjG9LeN.ZS@\u000fsڔ<$i$yCAU\"}8\tWNmgvJp\u000bK\u000f\u0014&\u0001jBI]xc\u0014\u00172XoEޓM\u0006މi`#PE'8\"أ}\u0007\u000728aX\u001e\tHc\u000e(/nqjV\u001bM\u001d\u001a@\u0005n$\u000f tg|7xpk>G#1l\tcϮc2\u0003R\u001bL\u001dN\u001b}y A?e6E)a\u0003\u001fR\n>3C\u007f?\u001dhU([M\u0002[NX.\u0017[@̠\u0011_x-j\u000b\u001a\u001e\u001a5CO\u0012X\u0001\u00126w\u0013{;;4\u0012\u0014)`.[\u001d\u0017\f\u001c7\rr\u0002A\u0001\u0006lK\u0018z\u0010>G)\u000e=C9Ig\u0002eI%f7*\u0010S2ţ\u0005p'ib\u001d)<)e\u0010SGPnMxR\u0018YUm2o\u0013\u00068\u0006HG.2,\u0015<\u001b=7\n:i6Ƞ\u0006JJx\u0005\u0017)$a\u007fjHn7\u001f\u001aE*!\f\tC\u0015\tyRlXZ\u0014}\"b\u000b\u0016\n)\u001f\u000b\u000bl%3\u0019fO\u0017j\u001bQk\u0014=/\u0015K ʼ*\u0085Vުӷ77Wy\u001exׯv\u0016G<h\u001c"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u001eQq\u0012:@#\u000b", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", ">/", "", ">0", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxIn\u0016cJ\u007f'\u001eGS\u0017=\u0001z", ">1", "2dR?l7M", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEtAr61#\u0005\u001c@o_\u001c\\P?t6s{fkAPr:\u0018t1TL\\+b\u001cV,\u0002yd\r^2\rhbB.D\b\u001e$\u0004=EKBd\n\u000e_{DwtKXe", "3mR?l7M", "", ">2", ">3", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`vPm\u001bP\u00024?f<\u00027v\u0016;IR;Q42#OeG\u0016c5N\u0004|", ">4", "", "5d]2e(MS~~\u000fl", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt:\u0001-~h\fi5w#.[BA5\u0018\r\u0003Pk8\u0017j,2\u007f(Q\"51Xcn\u0007\u001b\u000ec\u0010\u0018\u0019\u001c\u0012]J&D9\u001e$\u0004=EKBd\n\u000e_{DwtKXe.w\u001f}\u000b8v\u0010Wi\u0007GODhsb\u0019s(kD\u0004\u0004\u001do&/s_8\u0017:5\u0011{R\u0007cvG~zL2%qiUExUIJj\u0010", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u001eQq\u0012:@\u0014#?}4Bi\u001a;,?Jg\n", "1", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt:\u0001-~h\fi5w#.[BA5\u0018\r\u0003Pk8\u0017j,2\u007f(Q\"51Xcn\u0007\u001b\u000ec\u0010\u0018\u0019\u001c\u0012]J&D\b\u001e\u001d\u00124\u0013\u0011I2~\u0016#\u000eCiv\fT\u001d[\u0005$\u007f\u000b0rH]]C6/+b>o\bc*;6I i", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0005Kq\u00178\u00065BYY0Fp\u00167\\G9gC(\">", "", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u001eQq\u0012:@\u00139[\u0007\u0012;|\u0019\u0014MW(kB.\u001cw7", RemoteSettings.FORWARD_SLASH_STRING, "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt:\u0001-~h\fi5w#.[BA5\u0018\r\u0003Pk8\u0017j,2\u007f(Q\"5*fZ<L\"[X\u0018[+\u001b\u0004_\u000b\"{XB.\u0012u7\u0006=q|\u001b&\u001b5F\u0001QY\u0010P\t\u0019s=8rS/F~CRA,1`\u0015afJIG(\u001dsn\u0011E74\u0014\u000bZ\u0015{\u001cwqtQ)\n<->{%$Oxd@}7\u001bZ\u007f\u0002\u001b\b\u001c[0p>\u007f}12m\u0007\u0015Q\u0015C^v$\u0002", "\nh]6g\u0005", "u(E", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u001eQq\u0012:@!\u000b"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class c implements a {
    public static final c INSTANCE = new c();

    private c() {
    }

    @Override // com.ts.coresdk.crypto.logic.a
    public Object a(Context context, ITSModuleInfo iTSModuleInfo, SignatureAuthenticator signatureAuthenticator, String str, byte[] bArr, Continuation<? super SignWithKeyResult> continuation) {
        return new SignWithKeyResult.Failure(new CryptographyActionError.Other("Not Supported", null));
    }

    @Override // com.ts.coresdk.crypto.logic.a
    public TSKeypairData c(Context context, ITSModuleInfo iTSModuleInfo, String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        return null;
    }

    @Override // com.ts.coresdk.crypto.logic.a
    public String decrypt(Context context, String str, ITSModuleInfo iTSModuleInfo) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        Cipher cipher = Cipher.getInstance(C1561oA.Xd("sx\bdyy{h\u000b\u0007\u007f\u0011s\u0010\"&'-3-", (short) (FB.Xd() ^ 30159)));
        String strVd = Wg.vd("=\u0007\"D\u0004\u0017\u00072C\u0013\u001e\u0010Q':*\r\u001e\u000b40\u0017\u0002&\u001e~\u001b{\u0018\u0015:\u0001\u001f\u001ck \\\u0019*\u001ct\u000e\u0001y", (short) (FB.Xd() ^ 250));
        Class<?> cls = Class.forName(Qg.kd("\u000f\u001b\u0010\u001d\u0019\u0012\fT\u001b\u0019\r\u000fOb\u0001\u0012\u0003RO", (short) (ZN.Xd() ^ 7597), (short) (ZN.Xd() ^ 20736)));
        Class<?>[] clsArr = {Class.forName(hg.Vd("KAU?\u000bH<H@\u0006*JG=A9", (short) (C1633zX.Xd() ^ (-10748)), (short) (C1633zX.Xd() ^ (-4722)))), Integer.TYPE};
        Object[] objArr = {strVd, 0};
        short sXd = (short) (C1633zX.Xd() ^ (-27744));
        int[] iArr = new int["hhepdd".length()];
        QB qb = new QB("hhepdd");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
        try {
            declaredMethod.setAccessible(true);
            SecretKeySpec secretKeySpec = new SecretKeySpec((byte[]) declaredMethod.invoke(null, objArr), C1561oA.yd("[`o", (short) (ZN.Xd() ^ 32360)));
            Object[] objArr2 = {C1561oA.Yd("+J\u0018D!\u001f/ Z>Hl$Kko]FgP_M:;", (short) (C1607wl.Xd() ^ 25707)), 0};
            Method declaredMethod2 = Class.forName(Xg.qd("~\r\u0004\u0013\u0011\f\bR\u001b\u001b\u0011\u0015Wl\r \u0013dc", (short) (C1607wl.Xd() ^ 32716), (short) (C1607wl.Xd() ^ 7789))).getDeclaredMethod(ZO.xd("Mn$\\kh", (short) (C1580rY.Xd() ^ (-25062)), (short) (C1580rY.Xd() ^ (-9710))), Class.forName(Jg.Wd("L\f;.\fVey\u0005\u0018W\u007f\b\u001b):", (short) (C1607wl.Xd() ^ 16870), (short) (C1607wl.Xd() ^ 3575))), Integer.TYPE);
            try {
                declaredMethod2.setAccessible(true);
                cipher.init(2, secretKeySpec, new IvParameterSpec((byte[]) declaredMethod2.invoke(null, objArr2)));
                short sXd2 = (short) (C1499aX.Xd() ^ (-10870));
                short sXd3 = (short) (C1499aX.Xd() ^ (-17065));
                int[] iArr2 = new int["]\u0016t^I\u0001s\u000b9px|d\u0016!L%aM".length()];
                QB qb2 = new QB("]\u0016t^I\u0001s\u000b9px|d\u0016!L%aM");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd2 + sXd2) + (i3 * sXd3))) + xuXd2.CK(iKK2));
                    i3++;
                }
                Class<?> cls2 = Class.forName(new String(iArr2, 0, i3));
                Class<?>[] clsArr2 = {Class.forName(Ig.wd("i\u0012#lg\u0001\u0010+p\u001af ORIY", (short) (FB.Xd() ^ 19205))), Integer.TYPE};
                Object[] objArr3 = {str, 0};
                short sXd4 = (short) (FB.Xd() ^ 20011);
                int[] iArr3 = new int["/\u007f\u000e3Z\u0019".length()];
                QB qb3 = new QB("/\u007f\u000e3Z\u0019");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd4 + sXd4) + i4)) + xuXd3.CK(iKK3));
                    i4++;
                }
                Method declaredMethod3 = cls2.getDeclaredMethod(new String(iArr3, 0, i4), clsArr2);
                try {
                    declaredMethod3.setAccessible(true);
                    byte[] bArrDoFinal = cipher.doFinal((byte[]) declaredMethod3.invoke(null, objArr3));
                    Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "");
                    return new String(bArrDoFinal, Charsets.UTF_8);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    @Override // com.ts.coresdk.crypto.logic.a
    public String encrypt(Context context, String str, ITSModuleInfo iTSModuleInfo) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        Cipher cipher = Cipher.getInstance(C1561oA.Qd("'*7\u0012%##\u000e.(\u001f.\u000f)9;:>B:", (short) (C1607wl.Xd() ^ 7875)));
        Object[] objArr = {C1593ug.zd("B\f+M\u0011$\u0018CH\u0018'\u0019^4K;2C4]]D3WC$D%EBk2da5i*f{m:SJC", (short) (FB.Xd() ^ 31023), (short) (FB.Xd() ^ 15965)), 0};
        Method declaredMethod = Class.forName(C1561oA.od("=I>KG@:\u0003IG;=}\u0011/@1\u0001}", (short) (C1580rY.Xd() ^ (-15456)))).getDeclaredMethod(Wg.Zd("-8~\u000fNU", (short) (C1607wl.Xd() ^ 17231), (short) (C1607wl.Xd() ^ 16617)), Class.forName(C1561oA.Kd("( 6\"o/%3-t\u001b=<4:4", (short) (C1499aX.Xd() ^ (-22605)))), Integer.TYPE);
        try {
            declaredMethod.setAccessible(true);
            SecretKeySpec secretKeySpec = new SecretKeySpec((byte[]) declaredMethod.invoke(null, objArr), C1561oA.Xd("pu\u0005", (short) (ZN.Xd() ^ 2613)));
            String strVd = Wg.vd("0M\u001dG\u001e\u001a,\u001b_AMo!FhjB)L3<(\u0017\u0016", (short) (C1607wl.Xd() ^ 18352));
            short sXd = (short) (C1633zX.Xd() ^ (-24322));
            short sXd2 = (short) (C1633zX.Xd() ^ (-4334));
            int[] iArr = new int["y\u0006z\b\u0004|v?\u0006\u0004wy:Mk|m=:".length()];
            QB qb = new QB("y\u0006z\b\u0004|v?\u0006\u0004wy:Mk|m=:");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                i2++;
            }
            Object[] objArr2 = {strVd, 0};
            Method declaredMethod2 = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(C1561oA.ud("[[XcWW", (short) (OY.Xd() ^ 18051)), Class.forName(hg.Vd("\u0003x\rvB\u007fs\u007fw=a\u0002~txp", (short) (Od.Xd() ^ (-5183)), (short) (Od.Xd() ^ (-28641)))), Integer.TYPE);
            try {
                declaredMethod2.setAccessible(true);
                cipher.init(1, secretKeySpec, new IvParameterSpec((byte[]) declaredMethod2.invoke(null, objArr2)));
                byte[] bytes = str.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "");
                Object[] objArr3 = {cipher.doFinal(bytes), 0};
                Method declaredMethod3 = Class.forName(C1561oA.yd("5A6C?82zA?35u\t'8)xu", (short) (C1499aX.Xd() ^ (-7757)))).getDeclaredMethod(C1561oA.Yd("\u0003\r\u0003\u0010\u0006\bw\u0014x\u001b\u001a\u0012\u0018\u0012", (short) (C1499aX.Xd() ^ (-26275))), byte[].class, Integer.TYPE);
                try {
                    declaredMethod3.setAccessible(true);
                    return (String) declaredMethod3.invoke(null, objArr3);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    @Override // com.ts.coresdk.crypto.logic.a
    public void generateKeys(Context context, ITSModuleInfo iTSModuleInfo, String str, boolean z2, String str2, Encryptor.GenerateKeysListener generateKeysListener) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(generateKeysListener, "");
    }
}
