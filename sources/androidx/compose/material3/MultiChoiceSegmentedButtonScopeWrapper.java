package androidx.compose.material3;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.Measured;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: SegmentedButton.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\f6B\u0015\"4ߚ\u007f\u0007|jA0JeP.hS2\u000f\u0002{<$i*yّCU0}*\tUNog|ObŏK\u000f\u0014\u001f\u0001̓2Ikތ\u000e\u0012=1rom3\u000ezM=nuN\u0005N2ŕ<y\u0013\u0003b=V\u0013\u000fzqO4\u0012^D!>`\u0012e\u0005H\u0018L̜\u001fI=jnf6vp\u0006:]'3yPV?k@~]\rt^7\u000f\u0007aL6n@{ծ$\u001c\u0016\u0015Ys?1C\u001a=3lW+9U\fWdeFЄ\u0014sZ\u001bk\u000b&\u000b\ty`:+qժb\u0014o\u001c7\u0010z*\u0011d\u0004<\nWN4,(u \u000ea\u0005#YFP\u0010oZ\u007f)s|Х$ŗ7>"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006^5<h\u0002}:w\u001a,M1;m<\u001e\u001ewa8cs;]\u000105JX7\\D\u007f9\u001f\u001dZ\u001b$", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006^5<h\u0002}:w\u001a,M1;m<\u001e\u001ewa8cs;]\u000104V`\u001aZ\\}=i", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u00038_19u?\u001ej", "Ab^=X", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u0012*G|_\u001bWU)i>)\u0015>%*", "/kX4a", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "/kX4a4>\\(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4sJ}-Fq\u0014*T\u0019", "/kX4a\tR", "/kX4a4>\\(e~g,Y\u00109c\u0006", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7lk", "", "/kX4a4>\\(e~g,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006Y/B]\u0013*@|\u00125)J?m=&\u0015qp \u000bl,$", "/kX4a\tR0\u0015\rze0\u0006\t", "EdX4[;", "", "4h[9", "", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class MultiChoiceSegmentedButtonScopeWrapper implements MultiChoiceSegmentedButtonRowScope, RowScope {
    private final /* synthetic */ RowScope $$delegate_0;

    @Override // androidx.compose.foundation.layout.RowScope
    public Modifier align(Modifier modifier, Alignment.Vertical vertical) {
        return this.$$delegate_0.align(modifier, vertical);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public Modifier alignBy(Modifier modifier, HorizontalAlignmentLine horizontalAlignmentLine) {
        return this.$$delegate_0.alignBy(modifier, horizontalAlignmentLine);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public Modifier alignBy(Modifier modifier, Function1<? super Measured, Integer> function1) {
        return this.$$delegate_0.alignBy(modifier, function1);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public Modifier alignByBaseline(Modifier modifier) {
        return this.$$delegate_0.alignByBaseline(modifier);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public Modifier weight(Modifier modifier, float f2, boolean z2) {
        return this.$$delegate_0.weight(modifier, f2, z2);
    }

    public MultiChoiceSegmentedButtonScopeWrapper(RowScope rowScope) {
        this.$$delegate_0 = rowScope;
    }
}
