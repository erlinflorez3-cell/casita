package com.dynatrace.android.compose;

import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.state.ToggleableStateKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
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
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u0016DLc\u0003İI\u0006F\u000b6B\u0005\"4\u0012\u000e\u0007nʑA0RnP.XU2\u000fy\b<řc$\bCC٥ \u00038ޛ\u007fVwk~Lp\nq\u000f4\u0015)jZJ\u0016.m\u001e\u001d4ZwO7]qS8\u000ftd\u00040F0;\u0012\u0015\u0011\u001e:J&u)C[\u0010\"2VohR;Q\u0015\u001e \u000bV /$֔kP<Oze\u000381\f\u0002Dd&\u000e0Cֈ\r\u000fZ5\u0017\u000faL6\u0007K}\u001b3_\u001b\u0007\u0001h\u0006\u0017\u0010\u0006K\u0007\u0001/7/Yum5\u0007\u007fB\u0014\u0002̀\u000fǁv&dӤ\"|\u001a*C_sO`\u0010>v){\u001d@\u0014\u0010\u001c&v.[\u001e=ڟ\u0010\u07baxr[ó!\u000elG\u0018z\u0010<mӞ\u0002Ĵ/9#ƘЈeI"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0015Qw\u0019F\u0005%~K\u000b\u001cBx\u001a7O2Em6%\u0015d^@\u0007A6V\u00021UL,(cYo9\u0012\u00180", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0015Qw\u0019F\u0005%~H\b\"9t\u0016*JJ;J0-\u0011SnC\u0018g+N\u0004|", "4t]0g0H\\", "And?V,", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "1gT0^,=", "", "\nh]6g\u0005", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u0007=w%5QL\u0005pE&^iqB\u0005r0X\u007f5\u0011-^5ZavG\u001d]0\u0003\u0012\u001c", "7me<^,", ">q^C\\+>a\u0007\t\u000bk*|q+m\u007f", "", ">q^C\\+>a\b\t|`3|\u0005,l\u007f\u0016\u000b<\u0010\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f&\u0013VoW+\u0001'7`}\u001c4t\u0016\u001c\\?Jk\n", "/fT;gtB\\'\u000e\bn4|\u0012>o\r\u0004f$I\u0015!Oz\u0018Jv\u001fBY\u0005 3{\u0016"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class WrappingToggleableComposeCallback implements Function0<Object>, ToggleableDataProvider {
    public static final int $stable = 0;
    private final boolean checked;
    private final Function0<Object> function;
    private final Function1<Object, Object> source;

    public WrappingToggleableComposeCallback(Function0<? extends Object> function, Function1<Object, ? extends Object> source, boolean z2) {
        Intrinsics.checkNotNullParameter(function, "function");
        Intrinsics.checkNotNullParameter(source, "source");
        this.function = function;
        this.source = source;
        this.checked = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return this.function.invoke();
    }

    @Override // com.dynatrace.android.compose.ToggleableDataProvider
    public String providesSourceName() {
        String name = this.source.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }

    @Override // com.dynatrace.android.compose.ToggleableDataProvider
    public ToggleableState providesToggleableState() {
        return ToggleableStateKt.ToggleableState(this.checked);
    }
}
