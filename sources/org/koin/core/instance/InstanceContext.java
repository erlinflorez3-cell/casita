package org.koin.core.instance;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.logger.Logger;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;
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
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0Jk^\u008c\u0003SX\u000e,\u001bD(i$\nCiV*\u00020\u000bgN\u0016j~R`\u000bQ\u0013\u001e\u0018\u000fiZNǤ|] \u0015\u0003Q}?KM\u001e>˃dz>ӌ84(?\b\rQ+8L(x\u0011By\u0011ܘ4Fxíj\u000fS\u000e(\u001cVM.\u00036\\\u0016QɇLreŽG%\ttPZϴc="}, d2 = {"\u001ana4\"2HW\"Hxh9|R3n\u000e7wI~\u0017`+x\u001cKr.3Y[*@|\u0016A\\\u0019", "", ":nV4X9", "\u001ana4\"2HW\"Hxh9|R6o\u0002*{MJ}!Iq\u000eIL", "Ab^=X", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", ">`a.`,MS&\r", "\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "uK^?ZuD]\u001d\bD\\6\n\txl\n*}@\u000e`}Qq\u0010<\u0004z\u001cc\u000b\"\u0001s 2V\r9uA\u001e^v_C\u0012cu<t1RL$\u0013f_t\u0007\u001a\u001c^\u0017\u0018)\u0017\u0012Y\u000b/jQ3'\b;I\u000f\u0005S|\u0019\u0012\u00165ypOdrQ\u0001\u0014uN~,7", "5dc\u0019b.@S&", "u(;<e.\bY#\u0003\u0004(*\u0007\u0016//\u00072}B\u0001$`.y\u0010>v2\u000b", "5dc\u001dT9:[\u0019\u000ezk:", "u(;<e.\bY#\u0003\u0004(*\u0007\u0016//\u000b$\t<\t\u0017&G|W'r21a}/7z$\u0011WJ:kAs", "5dc V6IS", "u(;<e.\bY#\u0003\u0004(*\u0007\u0016//\u000e&\u0006K\u0001`\u0005Ey\u0019<L", "9nX; *H`\u0019"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class InstanceContext {
    private final Logger logger;
    private final ParametersHolder parameters;
    private final Scope scope;

    public InstanceContext(Logger logger, Scope scope, ParametersHolder parametersHolder) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.logger = logger;
        this.scope = scope;
        this.parameters = parametersHolder;
    }

    public /* synthetic */ InstanceContext(Logger logger, Scope scope, ParametersHolder parametersHolder, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(logger, scope, (i2 + 4) - (i2 | 4) != 0 ? null : parametersHolder);
    }

    public final Logger getLogger() {
        return this.logger;
    }

    public final ParametersHolder getParameters() {
        return this.parameters;
    }

    public final Scope getScope() {
        return this.scope;
    }
}
