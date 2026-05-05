package com.dynatrace.android.compose;

import androidx.compose.ui.state.ToggleableState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
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
@Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u0016DLc\u0003İI\u0006F\u000b6B\u0005\"4\u0012\u000e\u0007nj?2LeV:ZS0\u000fq\u0001Jř\f,\u0002GKW0|P\t}M\u0018g\u001dK\u001b(S\u001b\u0014\u0018\u0011r<Mezs\u0011=2pnO7[rU9\u000fxȥ\t\"8'F\u007fM\n(1`\u0012\ryqKR܌0\tvHZ%M3#X\u001a\u0007&\u000f(tg|:\u000f\u0001.N=%\u001bqRR7aF{{\rtS}˜xҐ\"+Hʺ\u0006!3V\u001b\u0007\u0001_\u0016ŤAџA\u0005pѧݹ/T"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0015Qw\u0019F\u0005%~H\u000b$&w\u00180TC7h;\u001erriD\u0011q,,r.NIJ*b(", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0015Qw\u0019F\u0005%~H\b\"9t\u0016*JJ;J0-\u0011SnC\u0018g+N\u0004|", "And?V,", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f&\u0013VoW+\u0001'7`}\u001c4t\u0016\u001c\\?Jk\n", "\nh]6g\u0005", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu^zpU[J;\\\u001caG\u0016\u0014a\u000eJ(\u0014\u0005GP }D\rbx", "7me<^,", ">q^C\\+>a\u0007\t\u000bk*|q+m\u007f", "", ">q^C\\+>a\b\t|`3|\u0005,l\u007f\u0016\u000b<\u0010\u0017", "/fT;gtB\\'\u000e\bn4|\u0012>o\r\u0004f$I\u0015!Oz\u0018Jv\u001fBY\u0005 3{\u0016"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class TriToggleableComposeCallback implements Function0<Object>, ToggleableDataProvider {
    public static final int $stable = 0;
    private final Function0<Object> source;
    private final ToggleableState state;

    public TriToggleableComposeCallback(Function0<? extends Object> source, ToggleableState state) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(state, "state");
        this.source = source;
        this.state = state;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return this.source.invoke();
    }

    @Override // com.dynatrace.android.compose.ToggleableDataProvider
    public String providesSourceName() {
        String name = this.source.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }

    @Override // com.dynatrace.android.compose.ToggleableDataProvider
    public ToggleableState providesToggleableState() {
        return this.state;
    }
}
