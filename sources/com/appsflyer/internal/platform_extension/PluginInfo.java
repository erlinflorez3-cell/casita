package com.appsflyer.internal.platform_extension;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
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
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLc\u000b\u0004Iي8\u000b<N\u0007Ӭ4\u0012\u0006)nj?:LeV7ZS0\u000fs{B*c$wJA٬ \u0014̝9O|f(\u001cP_\u001bG\u001d\u0007.x\u0019,YY\u0007`*\u000f`D\u007fQ9M}BQl\u00058\u0015 `$H{\u0015\u0001H,v\u0014ͯ~EQ\u0012 7\t~HZ%M3\u001aXħ?ŋ\u0005 bo\\?\u0011zkDG#1k\tĿ(ۢ4~S\u0017T_o'\u0005m67P9E\u0015SU\u0013\tb[m\u0005mu\u0004ޣiҊ+-O\u007feC!8\"#CO;ƞ#,b\u0005_a$'YO\u0014QV\u000e6z\u0013{;>4 \f'V3E&v\n\u001e3#tcB`\u0002\rD.~(ٯ\u0016Ӿ\u000451G)u\u001ayI+f7*\u0016=$1\u0011\u0007#qS<_[ĨUɐU3WRK[\u0017\u0018gR\u0006\u0004\u001fvHĦ\u0003ΥK\u00025\u0011\u001fD_3ErQ#OmHӞCϼz\u0007f\u007fat#lN'\u0007\"G,\u0019\f\tFt\u0007{P\u0003ZZ\u0015\u0004!+ͽ\u007fݔ\u0017*dyB&3(fQn\u0003xZ.\"30~7\bn\"\u0013.\u07b2`ۋ9[k\u0012gS\u0005.W>h fo\u0013k\u001a]t(P4~ofǶ}ΌR\u0016\u001b4Et*PD3\u001fy#S"}, d2 = {"\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`Rv\nKw/Baw J|\u00167[GEt}\t\u001cxc=\u0010G5O\u0001|", "", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`Rv\nKw/Baw J|\u00167[GEt}\t\u001cxc=\u00109", ">kd4\\5", "", "Dda@\\6G", "", "/cS6g0H\\\u0015\u0006eZ9x\u0011=", "\nh]6g\u0005", "uKR<`u:^$\r{e@|\u0016xi\t7{M\n\u0013\u001e\u0011z\u00158\u0006&?f\u0006\u001a7\u0001%.VQ?u=g\u007foq;\u000bl\u00025{#XH\u00183X[t\u0007\u0002!g\u0012W-bk^=5j\u000eG.\f3\u0013i7sVO\u0007", "1n\\=b5>\\(J", "u(;0b4\bO$\n\t_3\u0011\t</\u00041\u000b@\u000e \u0013N9\u0019Cr46c\u000b(1m)=MLIo>'^ShI\tg5$", "1n\\=b5>\\(K", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n\\=b5>\\(L", "u(;7T=:\u001d)\u000e~eud\u0005:;", "1n_F", "uKR<`u:^$\r{e@|\u0016xi\t7{M\n\u0013\u001e\u0011z\u00158\u0006&?f\u0006\u001a7\u0001%.VQ?u=g\u007foq;\u000bl\u00025{#XH\u00183X[t\u0007\u0002!g\u0012W-bk^=5j\u000eG.\f3\u0013i7sVO|\f?r:>a\u001bUz\u001c\nA62JbnyTJAiso\u0013[,]DG,\u000eq,*hY<\u000e\u0006\\Z]Y\nikP|\u00049.\u0014", "=sW2e", "", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "6`b566=S", "u(8", "BnBAe0GU", "\u001aiPCTuNb\u001d\u0006DF(\b^", "5dc\u000eW+Bb\u001d\t\u0004Z3g\u0005<a\b6", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`Rv\nKw/Baw J|\u00167[GEt}\t\u001cxc=\u00109", "5dc\u001d_<@W\"", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc#X9LW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PluginInfo {
    private final Map<String, String> additionalParams;
    private final Plugin plugin;
    private final String version;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PluginInfo(Plugin plugin, String str) {
        this(plugin, str, null, 4, null);
        Intrinsics.checkNotNullParameter(plugin, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    public PluginInfo(Plugin plugin, String str, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(plugin, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.plugin = plugin;
        this.version = str;
        this.additionalParams = map;
    }

    public /* synthetic */ PluginInfo(Plugin plugin, String str, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(plugin, str, (-1) - (((-1) - i2) | ((-1) - 4)) != 0 ? MapsKt.emptyMap() : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PluginInfo copy$default(PluginInfo pluginInfo, Plugin plugin, String str, Map map, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            plugin = pluginInfo.plugin;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            str = pluginInfo.version;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            map = pluginInfo.additionalParams;
        }
        return pluginInfo.copy(plugin, str, map);
    }

    public final Plugin component1() {
        return this.plugin;
    }

    public final String component2() {
        return this.version;
    }

    public final Map<String, String> component3() {
        return this.additionalParams;
    }

    public final PluginInfo copy(Plugin plugin, String str, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(plugin, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        return new PluginInfo(plugin, str, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PluginInfo)) {
            return false;
        }
        PluginInfo pluginInfo = (PluginInfo) obj;
        return this.plugin == pluginInfo.plugin && Intrinsics.areEqual(this.version, pluginInfo.version) && Intrinsics.areEqual(this.additionalParams, pluginInfo.additionalParams);
    }

    public final Map<String, String> getAdditionalParams() {
        return this.additionalParams;
    }

    public final Plugin getPlugin() {
        return this.plugin;
    }

    public final String getVersion() {
        return this.version;
    }

    public final int hashCode() {
        return (((this.plugin.hashCode() * 31) + this.version.hashCode()) * 31) + this.additionalParams.hashCode();
    }

    public final String toString() {
        return "PluginInfo(plugin=" + this.plugin + ", version=" + this.version + ", additionalParams=" + this.additionalParams + ")";
    }
}
