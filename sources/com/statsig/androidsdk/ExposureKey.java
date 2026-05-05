package com.statsig.androidsdk;

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
@Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLcz\u0006I\u0006F\u000b6B\u0015\"4\u0012\u000e\u0007nʑ?dZ͜x.\u0001Rb\u0010l}7d`*sٴ?U(}̠\bPRlmĚNa"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`'\u0003\u0019F\u00055BYc KC", "", "u(E", "\u0011n]3\\.", "\u0015`c2", "\u001a`h2e", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`'\u0003\u0019F\u00055BYc K,w*\\C\u0011", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`'\u0003\u0019F\u00055BYc K,s8VD?m\n", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`'\u0003\u0019F\u00055BYc K,|*aCHA", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public abstract class ExposureKey {

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u0016DLш|\u0004O\u00128\u000b4B\u0007\"B\u0012\u007f\u0007lsA0RnP\u008cZS8şsڔ<$i*yCAU ԉ(\u001fѧ~g\u0016m\u000bu\u001bG\u001d\u0006.x\u0019-YY\u0007_*\u000f`C\u007fCAP\b=gdҽ:\u0005.7j?\b\u0010\u0019\u001aXIVΓ{\fR\u001a\u001eH@\u001f;\u0019ӏNM! \u0013V /\"#ʨO~mzkR/QɅ\u001aHT'm0\u0015M;G\u0005-\u0013vo C@e6E+Y\u0003\u0015Us?1C8ݼ\u0004185:as\u0006F\t\u0006\"&CQ#\\!8#ԻR)\u00135>gcydT vC\u0003\u001bQ\u001c\u000e4(\u000fΪ,ju\u0016\u000eKt!TĖT\bfۍ\u0018|g<%,PB9<3f\u007feޅ\u001dT?ަ\u001d\u000f$+\u000fwqjb\u0010x\u0015IUɐU7Y̵UJT\u0014gDѐ\b\u0007"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`'\u0003\u0019F\u00055BYc K,s8VD?m\n", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`'\u0003\u0019F\u00055BYc KC", "<`\\2", "", "@t[2<\u000b", "@dP@b5", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`'\u0001\nC\u0007!D]\b)$m\u0012<WL\u0011", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0015KMC5B-\u0011wo=\t-(Wu4QPM:[X<\u001d%\u000ea\u001eJ:\u0011\u000fb.$jRA(]o:", "5dc\u001bT4>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u001fX(L]\"", "u(;0b4\ba(z\nl0~R+n~5\u0006D\u007f%\u0016M9mMr,EU\r$Av\u0003.IQEt\n", "5dc\u001fh3>7w", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    public static final class Config extends ExposureKey {
        private final String name;
        private final EvaluationReason reason;
        private final String ruleID;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Config(String name, String ruleID, EvaluationReason reason) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(ruleID, "ruleID");
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.name = name;
            this.ruleID = ruleID;
            this.reason = reason;
        }

        public static /* synthetic */ Config copy$default(Config config, String str, String str2, EvaluationReason evaluationReason, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                str = config.name;
            }
            if ((i2 + 2) - (2 | i2) != 0) {
                str2 = config.ruleID;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
                evaluationReason = config.reason;
            }
            return config.copy(str, str2, evaluationReason);
        }

        public final String component1() {
            return this.name;
        }

        public final String component2() {
            return this.ruleID;
        }

        public final EvaluationReason component3() {
            return this.reason;
        }

        public final Config copy(String name, String ruleID, EvaluationReason reason) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(ruleID, "ruleID");
            Intrinsics.checkNotNullParameter(reason, "reason");
            return new Config(name, ruleID, reason);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return Intrinsics.areEqual(this.name, config.name) && Intrinsics.areEqual(this.ruleID, config.ruleID) && this.reason == config.reason;
        }

        public final String getName() {
            return this.name;
        }

        public final EvaluationReason getReason() {
            return this.reason;
        }

        public final String getRuleID() {
            return this.ruleID;
        }

        public int hashCode() {
            return (((this.name.hashCode() * 31) + this.ruleID.hashCode()) * 31) + this.reason.hashCode();
        }

        public String toString() {
            return "Config(name=" + this.name + ", ruleID=" + this.ruleID + ", reason=" + this.reason + ')';
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u0016DLш|\u0004O\u00128\u000b4B\u0007\"B\u0012\u007fјnjG9LeN;ZS8şsڔ<$i*yCAU ԉ(\u001fѧ~g\u0016m\u000b}\u001bG\u001d\u0006.x\u0019-YY\u0007_*\u000f`C\u007fCAP\b=gd\u0005:\u0013%J\"f\u007fڱ\u0005\u001a8OX}\tRc\f@1\u0007È;\u001b\u0014[\u00152\u00124?fӼ\u001f%n\\G`l\f>uޑ\u00042I\\9w0+SSцUo<\u0005t6+nʺe\u001b+S\u0011\u0007j[m\u0004owC\u0005v)?+wt\b<^\u007f\"\u0018CO;a#,b\u0005_e$'YU*צOV9\u0006\u000f\u0014\rj\n>\f5]F/0e6$yЖs\u001cG^\u0019vB.\u0013(پ\u0016m\u0007ADQ\u001b\u0015R(\u07b9\u0018\u001fF\n\u0005%\u001eQ\u0002ͼ%a\\וx\u0017!\\\u0006Z\u0002`N@`N8]ǀq\nxç\u001a,\n:U\u000b\u007f\u000b\u001f0/%e\\ޠ''sȵ`Fm\u0003\u0013i9bwW`@Ptގ;0\u0011ȱrFj\u0012y^Ԣ\\F"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`'\u0003\u0019F\u00055BYc K,w*\\C\u0011", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`'\u0003\u0019F\u00055BYc KC", "<`\\2", "", "@t[2<\u000b", "@dP@b5", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`'\u0001\nC\u0007!D]\b)$m\u0012<WL\u0011", "D`[BX", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0015KMC5B-\u0011wo=\t-(Wu4QPM:[X<\u001d%\u000ea\u001eJ:\u0011\u000fb.$jRA(]!\rr", "5dc\u001bT4>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u001fX(L]\"", "u(;0b4\ba(z\nl0~R+n~5\u0006D\u007f%\u0016M9mMr,EU\r$Av\u0003.IQEt\n", "5dc\u001fh3>7w", "5dc#T3NS", "u(I", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n_F", "3pd._:", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    public static final class Gate extends ExposureKey {
        private final String name;
        private final EvaluationReason reason;
        private final String ruleID;
        private final boolean value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Gate(String name, String ruleID, EvaluationReason reason, boolean z2) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(ruleID, "ruleID");
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.name = name;
            this.ruleID = ruleID;
            this.reason = reason;
            this.value = z2;
        }

        public static /* synthetic */ Gate copy$default(Gate gate, String str, String str2, EvaluationReason evaluationReason, boolean z2, int i2, Object obj) {
            if ((i2 + 1) - (1 | i2) != 0) {
                str = gate.name;
            }
            if ((2 & i2) != 0) {
                str2 = gate.ruleID;
            }
            if ((4 & i2) != 0) {
                evaluationReason = gate.reason;
            }
            if ((i2 & 8) != 0) {
                z2 = gate.value;
            }
            return gate.copy(str, str2, evaluationReason, z2);
        }

        public final String component1() {
            return this.name;
        }

        public final String component2() {
            return this.ruleID;
        }

        public final EvaluationReason component3() {
            return this.reason;
        }

        public final boolean component4() {
            return this.value;
        }

        public final Gate copy(String name, String ruleID, EvaluationReason reason, boolean z2) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(ruleID, "ruleID");
            Intrinsics.checkNotNullParameter(reason, "reason");
            return new Gate(name, ruleID, reason, z2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Gate)) {
                return false;
            }
            Gate gate = (Gate) obj;
            return Intrinsics.areEqual(this.name, gate.name) && Intrinsics.areEqual(this.ruleID, gate.ruleID) && this.reason == gate.reason && this.value == gate.value;
        }

        public final String getName() {
            return this.name;
        }

        public final EvaluationReason getReason() {
            return this.reason;
        }

        public final String getRuleID() {
            return this.ruleID;
        }

        public final boolean getValue() {
            return this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v7, types: [int] */
        /* JADX WARN: Type inference failed for: r0v8 */
        /* JADX WARN: Type inference failed for: r0v9 */
        public int hashCode() {
            int iHashCode = ((((this.name.hashCode() * 31) + this.ruleID.hashCode()) * 31) + this.reason.hashCode()) * 31;
            boolean z2 = this.value;
            ?? r02 = z2;
            if (z2) {
                r02 = 1;
            }
            return iHashCode + r02;
        }

        public String toString() {
            return "Gate(name=" + this.name + ", ruleID=" + this.ruleID + ", reason=" + this.reason + ", value=" + this.value + ')';
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u0016DLш|\u0004O\u00128\u000b4D\u0007\":\u001b\u007fјnjO0LeN>ZS8şsڔ<$i*yCAU ԉ(\u001fѧ~g\u0016m\u000b\u000e\u001bG\u001d\u0006.x\u0019-YY\u0007_*\u000f`C\u007fCAP\b=ga\u0005:\u0013$J\"fz\u0015\u0005(/`\u0010%\u0001SO\u001a\u0019H@\u001fBň\u0011M\u0013#Z\rL2\u0019\u001e\u000bh\u0015ɫI5dHB;\u0003\u0018C\u0015В`x\u0004[!^TU\u000e=Ҵ\u001fsGEJ-%\u0002\u0004Mҿ\\\b\nM\bU\u0005\u0017-mȩJ<^Do\u0018\u0014C3\u0016֜^;ij\u001di`:ʬ[UiK^\u000e@w)|=B\n\u000e\u0014)`.[\u001b\u0017\u000e\u00143\u0003uk@~\u0003\u000fH\u0006zo:/%.4[?!f_fS\u0019|=,\u000b\u0013\u001e1\b\u0007!\n\\Tײ\u0014ce\u0006jIQnCxT\u0018sUo\u001ao\u0011\u001dp̍1\u0010\u0007=\u0018).EB}ښ8k(y `D\u0016wKòg$x`KX\"\u001d\u0017֖.\u000f\u0014ɮ\\f\u000bu^_);\u001fM4T5~ݔ\u0017&dɼT#+\u001c\\Z9xxRu\nS5Ϭ;_v\u0088&Y?cAB\"r\u001eejvB@םf\u000b`٨ZU\u0012hj3rAVq(w*L«\u0010\u0019:ŭ\n\u001e:;?)-$V\u00056Bo}Ȥc`pɭ\u0017V95\u0011tˮx("}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`'\u0003\u0019F\u00055BYc K,|*aCHA", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`'\u0003\u0019F\u00055BYc KC", "1n]3\\.'O!~", "", "@t[2<\u000b", "/k[<V(MS\u0018^\u000ei,\n\r7e\t7", ">`a.`,MS&gvf,", "7r4Ec3BQ\u001d\u000eeZ9x\u0011/t\u007f5", "", "@dP@b5", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`'\u0001\nC\u0007!D]\b)$m\u0012<WL\u0011", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0015R?Lg}%\u0011qc\u0003tr9R\u007f)\u001d3S(mN<D\u0010\u001b\\W<:\u001a\tbCyc+5)\u0010uW\u00117w\u000f\u0010\u0018W1soO`\u0014F\b\u0014{\u000b\tyB`ouVEOk\u0017d\bm'e\u0010}\u0015", "5dc\u000e_3HQ\u0015\u000ez]\f\u0010\u0014/r\u00040{I\u0010", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0010b5?W\u001bgvf,", "u(I", "5dc\u001dT9:[\u0019\u000ezk\u0015x\u0011/", "5dc\u001fX(L]\"", "u(;0b4\ba(z\nl0~R+n~5\u0006D\u007f%\u0016M9mMr,EU\r$Av\u0003.IQEt\n", "5dc\u001fh3>7w", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n_F", "3pd._:", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    public static final class Layer extends ExposureKey {
        private final String allocatedExperiment;
        private final String configName;
        private final boolean isExplicitParameter;
        private final String parameterName;
        private final EvaluationReason reason;
        private final String ruleID;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Layer(String configName, String ruleID, String allocatedExperiment, String parameterName, boolean z2, EvaluationReason reason) {
            super(null);
            Intrinsics.checkNotNullParameter(configName, "configName");
            Intrinsics.checkNotNullParameter(ruleID, "ruleID");
            Intrinsics.checkNotNullParameter(allocatedExperiment, "allocatedExperiment");
            Intrinsics.checkNotNullParameter(parameterName, "parameterName");
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.configName = configName;
            this.ruleID = ruleID;
            this.allocatedExperiment = allocatedExperiment;
            this.parameterName = parameterName;
            this.isExplicitParameter = z2;
            this.reason = reason;
        }

        public static /* synthetic */ Layer copy$default(Layer layer, String str, String str2, String str3, String str4, boolean z2, EvaluationReason evaluationReason, int i2, Object obj) {
            if ((i2 + 1) - (1 | i2) != 0) {
                str = layer.configName;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
                str2 = layer.ruleID;
            }
            if ((4 & i2) != 0) {
                str3 = layer.allocatedExperiment;
            }
            if ((i2 + 8) - (8 | i2) != 0) {
                str4 = layer.parameterName;
            }
            if ((16 & i2) != 0) {
                z2 = layer.isExplicitParameter;
            }
            if ((i2 + 32) - (i2 | 32) != 0) {
                evaluationReason = layer.reason;
            }
            return layer.copy(str, str2, str3, str4, z2, evaluationReason);
        }

        public final String component1() {
            return this.configName;
        }

        public final String component2() {
            return this.ruleID;
        }

        public final String component3() {
            return this.allocatedExperiment;
        }

        public final String component4() {
            return this.parameterName;
        }

        public final boolean component5() {
            return this.isExplicitParameter;
        }

        public final EvaluationReason component6() {
            return this.reason;
        }

        public final Layer copy(String configName, String ruleID, String allocatedExperiment, String parameterName, boolean z2, EvaluationReason reason) {
            Intrinsics.checkNotNullParameter(configName, "configName");
            Intrinsics.checkNotNullParameter(ruleID, "ruleID");
            Intrinsics.checkNotNullParameter(allocatedExperiment, "allocatedExperiment");
            Intrinsics.checkNotNullParameter(parameterName, "parameterName");
            Intrinsics.checkNotNullParameter(reason, "reason");
            return new Layer(configName, ruleID, allocatedExperiment, parameterName, z2, reason);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Layer)) {
                return false;
            }
            Layer layer = (Layer) obj;
            return Intrinsics.areEqual(this.configName, layer.configName) && Intrinsics.areEqual(this.ruleID, layer.ruleID) && Intrinsics.areEqual(this.allocatedExperiment, layer.allocatedExperiment) && Intrinsics.areEqual(this.parameterName, layer.parameterName) && this.isExplicitParameter == layer.isExplicitParameter && this.reason == layer.reason;
        }

        public final String getAllocatedExperiment() {
            return this.allocatedExperiment;
        }

        public final String getConfigName() {
            return this.configName;
        }

        public final String getParameterName() {
            return this.parameterName;
        }

        public final EvaluationReason getReason() {
            return this.reason;
        }

        public final String getRuleID() {
            return this.ruleID;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v12 */
        /* JADX WARN: Type inference failed for: r0v13 */
        /* JADX WARN: Type inference failed for: r0v9, types: [int] */
        public int hashCode() {
            int iHashCode = ((((((this.configName.hashCode() * 31) + this.ruleID.hashCode()) * 31) + this.allocatedExperiment.hashCode()) * 31) + this.parameterName.hashCode()) * 31;
            boolean z2 = this.isExplicitParameter;
            ?? r02 = z2;
            if (z2) {
                r02 = 1;
            }
            return ((iHashCode + r02) * 31) + this.reason.hashCode();
        }

        public final boolean isExplicitParameter() {
            return this.isExplicitParameter;
        }

        public String toString() {
            return "Layer(configName=" + this.configName + ", ruleID=" + this.ruleID + ", allocatedExperiment=" + this.allocatedExperiment + ", parameterName=" + this.parameterName + ", isExplicitParameter=" + this.isExplicitParameter + ", reason=" + this.reason + ')';
        }
    }

    private ExposureKey() {
    }

    public /* synthetic */ ExposureKey(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
