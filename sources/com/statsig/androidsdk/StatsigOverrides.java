package com.statsig.androidsdk;

import com.google.gson.annotations.SerializedName;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b<N\u0007\":\u001b\u007fјnjGRLeN9ZS8\u0015s{:%aҜwYПs/.\"7N\u0007f|/\"j\u001bQ\u000f\u001e\"\tl<I\u0004zm\u0014\u001f2prm4]\fK=x\rF\u000702P:\n\u0013\u0011&:J v)E[\u000e\"0nohW;N\u00156 \fV8\u0011 lg|8XzmF?%\u0013ipP7a@|{\ftYU\u000ețe\u001e9G\u007fH#1k\u000f\u0017Tk?1A\u0002?\u0015hU*YJ:ʕ7!\u001f\"\"Cg\u001d_\u0003&\u000b\u0007an\u001c3;QsK~\u00108y\u000b{;;2\u00134(\u000fΚ.b\u0006\u0016\u001cK\r\u0003UPP0`R\u000e\u000bmF\u00195\u007fa-I\u001dvQ\u0010:GSe|Kۃ\u001fkb|0sT<֫E-Zw_1iLMJ^\n\b?}\u0006\u0001b0-21w\u001e5{\u001f2/=G]I#Om\u0012VTs\u0007\u0007ph\u0002kbJP\"\u001d\u0015e/7\r\u000bbj\u0005yVlp<\u0013]\u001c\u0003\t\u000e\u0016#,lyL!S\u0012^Qxi\u0019L\f\u000fS0-ǄX7|\u001cgQ^a8\u0002i\u001erjx*>jaKױg\u000bZ\u001alt(PE\u000fѱ\u000f@\u0003Rb$\u0013`A8ˠ3|]'`-`\u0013 RA+\u000bohx\u001c\u000fVC$1k4v\u0019\u0001~[\u001ft\u0016y\u007f0Sʨ$έEW=ӧ>W(pB\u0006s'\rs\u0018SwNWL\u001b\u0018\u0006W\f D\u001dgReAiÉ\u0001Ȟ6\b5զdtk[[\u001bw'\u000b\u007f'Sx0w\b\u0019r<nzV_V'\"%`\u0003%\u0018d.x\u0010K)H\u001aXaϽ@ϗv\taߢf:\u0003\u0010-'ݻ\u0005\u0006"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)7C\u000f Dz\u001a-MQ\u0011", "", "5`c2f", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJt!Pm\u001eI\u0004%>h`\u001cEp}*X\u0019", "", "", "1n]3\\.L", "", ":`h2e:", "uKY.i(\bc(\u0003\u0002(*\u0007\u0012-u\r5{I\u0010`tQx\fL\u000425b\r\u00033{\u0019\u0016IN\u0011R9\u001a&d+I\u0016g3\u0018t1PJ^9iR{L]od\u0017L;\u001a\u0012YJ3Q@E\"o(TW\"m|\u001d\u0012WEytI \u000eQ\u0003\u0013\u0006N6hOh)WQJCr7q\fh,?6H'{m$p,A", "5dc\u0010b5?W\u001b\r", "u(;7T=:\u001d)\u000e~euz\u00138c\u00105\t@\n&`%y\u0017:\u00072BY\u0007/\u001ai$15?FA", "5dc\u0014T;>a", "5dc\u0019T@>`'", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "3pd._:", "=sW2e", "6`b566=S", "", "BnBAe0GU", "\u0011n\\=T5B]\"", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class StatsigOverrides {
    public static final Companion Companion = new Companion(null);

    @SerializedName(alternate = {}, value = "\n\u0015\u0013\n\f\t\u0014")
    @InterfaceC1492Gx
    private final ConcurrentHashMap<String, Map<String, Object>> configs;

    @SerializedName(alternate = {}, value = "\u000e\u0007\u0019\t\u0016")
    @InterfaceC1492Gx
    private final ConcurrentHashMap<String, Boolean> gates;

    @SerializedName(alternate = {}, value = "\u0013\u0007\u001e\t\u0015\u0015")
    @InterfaceC1492Gx
    private final ConcurrentHashMap<String, Map<String, Object>> layers;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f4\u007fB%s$ EшY\u001d"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)7C\u000f Dz\u001a-MQyI>& dj=\u0011l\u0002", "", "u(E", "3l_Al", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)7C\u000f Dz\u001a-MQ\u0011", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final StatsigOverrides empty() {
            return new StatsigOverrides(new ConcurrentHashMap(), new ConcurrentHashMap(), new ConcurrentHashMap());
        }
    }

    public StatsigOverrides(ConcurrentHashMap<String, Boolean> gates, ConcurrentHashMap<String, Map<String, Object>> configs, ConcurrentHashMap<String, Map<String, Object>> layers) {
        Intrinsics.checkNotNullParameter(gates, "gates");
        Intrinsics.checkNotNullParameter(configs, "configs");
        Intrinsics.checkNotNullParameter(layers, "layers");
        this.gates = gates;
        this.configs = configs;
        this.layers = layers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StatsigOverrides copy$default(StatsigOverrides statsigOverrides, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, ConcurrentHashMap concurrentHashMap3, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            concurrentHashMap = statsigOverrides.gates;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            concurrentHashMap2 = statsigOverrides.configs;
        }
        if ((i2 & 4) != 0) {
            concurrentHashMap3 = statsigOverrides.layers;
        }
        return statsigOverrides.copy(concurrentHashMap, concurrentHashMap2, concurrentHashMap3);
    }

    public final ConcurrentHashMap<String, Boolean> component1() {
        return this.gates;
    }

    public final ConcurrentHashMap<String, Map<String, Object>> component2() {
        return this.configs;
    }

    public final ConcurrentHashMap<String, Map<String, Object>> component3() {
        return this.layers;
    }

    public final StatsigOverrides copy(ConcurrentHashMap<String, Boolean> gates, ConcurrentHashMap<String, Map<String, Object>> configs, ConcurrentHashMap<String, Map<String, Object>> layers) {
        Intrinsics.checkNotNullParameter(gates, "gates");
        Intrinsics.checkNotNullParameter(configs, "configs");
        Intrinsics.checkNotNullParameter(layers, "layers");
        return new StatsigOverrides(gates, configs, layers);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatsigOverrides)) {
            return false;
        }
        StatsigOverrides statsigOverrides = (StatsigOverrides) obj;
        return Intrinsics.areEqual(this.gates, statsigOverrides.gates) && Intrinsics.areEqual(this.configs, statsigOverrides.configs) && Intrinsics.areEqual(this.layers, statsigOverrides.layers);
    }

    public final ConcurrentHashMap<String, Map<String, Object>> getConfigs() {
        return this.configs;
    }

    public final ConcurrentHashMap<String, Boolean> getGates() {
        return this.gates;
    }

    public final ConcurrentHashMap<String, Map<String, Object>> getLayers() {
        return this.layers;
    }

    public int hashCode() {
        return (((this.gates.hashCode() * 31) + this.configs.hashCode()) * 31) + this.layers.hashCode();
    }

    public String toString() {
        return "StatsigOverrides(gates=" + this.gates + ", configs=" + this.configs + ", layers=" + this.layers + ')';
    }
}
