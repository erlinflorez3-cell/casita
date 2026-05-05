package com.appsflyer.internal;

import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.SecureRandom;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Xu;
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
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u001e\u007f\u0007lkA0ReP.XT0Ʀk\u0012éT[Rp\u0004B[\u001aԥ&\u000bUNuh7_h\u0010[\u000f4\u001a)n:Lmx\f\u0014U7ԲsA9R}C\u0002}\u0003;\u001d `*h}\u0013\u00042*v\u0014'~QR$\u0012^B7?ň\u0011O\u000b\u001f \u000f\u000f6\u000f#tid5vp\u0014:m#Y݇NĚ+c8~S\u0017T_"}, d2 = {"\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u000b\b|\u0013\u0014?S", "", "\nh]6g\u0005", "u(E", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\f\b\u0003\u0013\u0014?S", ">/", "", "5dc\u0010h9KS\"|\u000fB:\u0007W{1Q\u0006\u0006?\u0001", "uKR<`u:^$\r{e@|\u0016xi\t7{M\n\u0013\u001e\u0011Kn:B1#8cuzT\u001b*^?\u0005r0'\u00172OH\u0014g5PL", ">0", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b>\u000b\u001f`Cz\u0019Jw,IY\u000bi;v%.ZL7r}yuf-EtB\u0012$:\u0018", "5dc\u001ab5>b\u001d\u0014vm0\u0007\u0012\u0018e\u000f:\u0006M\u0007", "\u001aiPCTuEO\"\u0001DL;\n\r8gU"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AFb1kSDK {
    public static final AFb1kSDK INSTANCE = new AFb1kSDK();
    private static String getMonetizationNetwork = null;

    private AFb1kSDK() {
    }

    @JvmStatic
    public static final synchronized String getCurrencyIso4217Code(AFc1qSDK aFc1qSDK) {
        String str;
        Intrinsics.checkNotNullParameter(aFc1qSDK, "");
        if (getMonetizationNetwork == null) {
            String monetizationNetwork = aFc1qSDK.getMonetizationNetwork(C1561oA.Xd("@F`KQWYGSTJ^T[[", (short) (OY.Xd() ^ 9293)), (String) null);
            if (monetizationNetwork == null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                short sXd = (short) (FB.Xd() ^ 7653);
                int[] iArr = new int["-#;%t9.+0,&08k\u0014%6GG9)7G<:7".length()];
                QB qb = new QB("-#;%t9.+0,&08k\u0014%6GG9)7G<:7");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                    i2++;
                }
                Object[] objArr = new Object[0];
                Constructor<?> constructor = Class.forName(new String(iArr, 0, i2)).getConstructor(new Class[0]);
                try {
                    constructor.setAccessible(true);
                    monetizationNetwork = jCurrentTimeMillis + Qg.kd(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, (short) (Od.Xd() ^ (-13127)), (short) (Od.Xd() ^ (-29227))) + Math.abs(((SecureRandom) constructor.newInstance(objArr)).nextLong());
                    aFc1qSDK.getRevenue(hg.Vd("\u0010\u0014,\u0015\u0019\u001d\u001d\t\u0013\u0012\u0006\u0018\f\u0011\u000f", (short) (C1499aX.Xd() ^ (-14044)), (short) (C1499aX.Xd() ^ (-18551))), monetizationNetwork);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            getMonetizationNetwork = monetizationNetwork;
        }
        str = getMonetizationNetwork;
        Intrinsics.checkNotNull(str);
        return str;
    }

    @JvmStatic
    public static final synchronized void getCurrencyIso4217Code(String str, AFc1qSDK aFc1qSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aFc1qSDK, "");
        getMonetizationNetwork = str;
        aFc1qSDK.AFAdRevenueData("CUSTOM_INSTALL_ID_APPLIED", true);
        aFc1qSDK.getRevenue("AF_INSTALLATION", str);
    }
}
