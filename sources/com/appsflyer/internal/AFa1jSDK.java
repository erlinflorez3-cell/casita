package com.appsflyer.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLc\u0003'I\u0006>\u00176Ȑ\u0007\"B\u0012\u007f\u0007lkA0RnP.XS2\u000fy{<$a)\bّYfJ}P\b\bMx(\u0018PZ\u001bU\u001d\b.\u0007z.YU'^\"\u0013BD\u0006>aL\u001e=Ihz6\u0013$J$Nx3\u0004ʀ.J\u0016{\tI\u0014\u001f 8XphY=Q\u0013\u001c*\u0006l!Ә\"^mVDQ5zH:;\u0003\u0018L~+m2\u0015M;G\u0005-\u001bzy A?e4չ)U\t\u0012`g\u0010#M\u007fU\u0013x)7+wtg:h\u0002*\u0014YN;])&3ӨSԃ\u0010+3QiS^\u001bx\f\t\f%>\u001a\r4*~.\u0004Ճhڿ\u00127|tYN^\u0011"}, d2 = {"\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\n\b{\u0013\u0014?S", "", "", "", ">/", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\n\b}\u0013\u0014?S", ">0", "\nh]6g\u0005", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005L}2\u0004\n|\"\"Up\u0015Pv2~]\u0007/7z\u001f*T\r\u0017L0i\u001cV@\u001f\\'\u001d", "", "5dc\u001ab5>b\u001d\u0014vm0\u0007\u0012\u0018e\u000f:\u0006M\u0007", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?5", "", "5dc\u001fX=>\\)~", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq>", "\u001aiPCTuNb\u001d\u0006DF(\b^", "\u000fE01E,OS\"\u000fz=(\f\u0005", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\n\b}\u0013\u0014?S", "5dc\u001aX+BO(\u0003\u0005g\u0015|\u0018Ao\r.", "\u000fEP}l\u001a\u001d9"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AFa1jSDK {
    public static final AFa1ySDK AFa1ySDK = new AFa1ySDK(null);
    final AFa1lSDK AFAdRevenueData;
    final Map<String, Object> getMonetizationNetwork;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ljA0ZeP.XS0Ŧl\u0012éT[Rp\u0004B[\u001aԥ&\u000bUNuh7_h\u0010[\u000f4\u001a)n:Lmx\f\u0014U7ԲsA9R}C\u0002u\u0003>\u001d `&h}\u0013\u00042*v\u0017=\u007fŲO\u000e\u00188Ny"}, d2 = {"\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\n\b{\u0013\u0014?<{\u0018iaB;\"!A", "", "\nh]6g\u0005", "u(E", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u0011\b~\u0013\u0014?S", ">/", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\n\b{\u0013\u0014?S", "\u000fE01E,OS\"\u000fz=(\f\u0005", "uKR<`u:^$\r{e@|\u0016xi\t7{M\n\u0013\u001e\u0011Kn?B-#8cuzT\u00148U\r7v?,\u0016ou9\u0014-0W\u0006'TUJ3&.S9_\u0017Hl4\u0001", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\n\b}\u0013\u0014?S", "5dc\u001fX=>\\)~", "uKR<`u:^$\r{e@|\u0016xi\t7{M\n\u0013\u001e\u0011Kn8B,#8cuzT\u00148U\r7v?,\u0016ou9\u0014-0W\u0006'TUJ3&.S9_\u0017Hl4\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AFa1ySDK {
        private AFa1ySDK() {
        }

        public /* synthetic */ AFa1ySDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static AFa1jSDK AFAdRevenueData(AFh1mSDK aFh1mSDK) {
            Intrinsics.checkNotNullParameter(aFh1mSDK, "");
            Map<String, Object> map = aFh1mSDK.AFAdRevenueData;
            Intrinsics.checkNotNullExpressionValue(map, "");
            return new AFa1jSDK(map, null, 2, 0 == true ? 1 : 0);
        }

        @JvmStatic
        public static AFa1jSDK getRevenue(AFa1lSDK aFa1lSDK) {
            Intrinsics.checkNotNullParameter(aFa1lSDK, "");
            return new AFa1jSDK(new LinkedHashMap(), aFa1lSDK, null);
        }
    }

    private AFa1jSDK(Map<String, Object> map, AFa1lSDK aFa1lSDK) {
        this.getMonetizationNetwork = map;
        this.AFAdRevenueData = aFa1lSDK;
    }

    /* synthetic */ AFa1jSDK(Map map, AFa1lSDK aFa1lSDK, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i2 + 2) - (i2 | 2) != 0 ? null : aFa1lSDK);
    }

    public /* synthetic */ AFa1jSDK(Map map, AFa1lSDK aFa1lSDK, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, aFa1lSDK);
    }

    @JvmStatic
    public static final AFa1jSDK getCurrencyIso4217Code(AFh1mSDK aFh1mSDK) {
        return AFa1ySDK.AFAdRevenueData(aFh1mSDK);
    }

    @JvmStatic
    public static final AFa1jSDK getMediationNetwork(AFa1lSDK aFa1lSDK) {
        return AFa1ySDK.getRevenue(aFa1lSDK);
    }

    public final boolean getMonetizationNetwork(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.getMonetizationNetwork.containsKey(str);
    }

    public final void getRevenue(String str, Object obj) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getMonetizationNetwork.put(str, obj);
        AFa1lSDK aFa1lSDK = this.AFAdRevenueData;
        if (aFa1lSDK != null) {
            aFa1lSDK.getMonetizationNetwork(this.getMonetizationNetwork);
        }
    }
}
