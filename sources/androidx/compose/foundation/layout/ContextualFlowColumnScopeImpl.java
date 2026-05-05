package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measured;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: ContextualFlowLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯN\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000b<H\u0007\"2\u0012\u007f\u0007|jA0JmP.hS2şs{J$c$wCCU0}*\teNo˧vJp\u000bK\u000f\f\u0016\u0001j:N]xc\u0012\u00172PxG\u074cSڎSʠ\u0011td\u0004P2P8:(\u0011\u001e8I(v)E[\u0010 3XphT\u001dQ\u0013\u001e*\u0006l%\u0011\"jmf6vqҺ>/1\n2U\\6w0+]5F\u00037=zo/C@eG[ȄRK&`nW\u0003m\u0002e\u0005\u00177W;W\boBh\u0002$\u0015Ye\u001d_\u0003&\u000b\u0007\u007fuR˄*\u0018vYc&(&\u000b$\rj\u0014>\n5_F-H~NԜ2=\baYh\u0002\rR(z\u0010FG+\u000649S3f\u007f|\u0002ϢM\u007f\u0019\u0013)6#/~I[\u0003\u001e\u0011\u001b!S\u0006mIQnXxR\u0018vUm2\u000f)̻)TBU\u0003G{?0m½9٦=))ǽ\u001aJJo\u0005\u000e1zajjHn$Eނ9Ҋ\r\u0012bե|\u0007qZba|+[\"l\u0007,\riؕ^˵;ƙڰ\u000fMћlqrMk\u0017=1lBgz<(e=v3cV:ߛc٥uܝά;aۖ\\nJS\u001agt*(@Vvݛw\u0005LQ\u0012ưNmp$42Pǲ`4"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s8VR;~C.\u0011oB@\u0011u\nX}7OU<*f]r!\u001c\u001dac", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7v5WU\u0019u;.\u001dqO7\u0011n,$", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s8VR;~C.\u0011oB@\u0011u\nX}7OU<*f]r\u0013", ":h]2<5=S,", "", "7mS2k\u0010G:\u001d\bz", ";`g$\\+MV", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", ";`g\u0015X0@V(b\u0004E0\u0006\t", "uH8\u00139\u0013D](\u0006~gu\u0002\u001a7/\u00041\u000b@\u000e \u0013N9l<w!E`\r}Av$=ZS9z>+|dn?\u0007p\u0002\u0012g", "5dc\u0016a+>f|\bab5|", "u(8", "5dc\u0019\\5>7\"}zq", "5dc\u001aT?!S\u001d\u0001}m\u0010\u0006o3n\u007foZ\u0014`\u001cfHW", "u(5", "\u0014", "5dc\u001aT?0W\u0018\u000e}&\u000bPh45\u0001\u0010", "/kX4a", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "/kX4a4>\\(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4s<\b-;\u0003 7\\?BA", "/kX4a\tR", "/kX4a4>\\(e~g,Y\u00109c\u0006", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7lk", "/kX4a4>\\(e~g,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006g%Bh\u0002\u001e3tq5QEDs4'$OeB\u00079", "4h[9@(Q1#\u0006\u000bf5n\r.t\u0003", "4qP0g0H\\", "", "EdX4[;", "4h[9", "", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ContextualFlowColumnScopeImpl implements FlowColumnScope, ContextualFlowColumnScope {
    public static final int $stable = 0;
    private final /* synthetic */ FlowColumnScopeInstance $$delegate_0;
    private final int indexInLine;
    private final int lineIndex;
    private final float maxHeightInLine;
    private final float maxWidth;

    public /* synthetic */ ContextualFlowColumnScopeImpl(int i2, int i3, float f2, float f3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, f2, f3);
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    public Modifier align(Modifier modifier, Alignment.Horizontal horizontal) {
        return this.$$delegate_0.align(modifier, horizontal);
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    public Modifier alignBy(Modifier modifier, VerticalAlignmentLine verticalAlignmentLine) {
        return this.$$delegate_0.alignBy(modifier, verticalAlignmentLine);
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    public Modifier alignBy(Modifier modifier, Function1<? super Measured, Integer> function1) {
        return this.$$delegate_0.alignBy(modifier, function1);
    }

    @Override // androidx.compose.foundation.layout.FlowColumnScope
    public Modifier fillMaxColumnWidth(Modifier modifier, float f2) {
        return this.$$delegate_0.fillMaxColumnWidth(modifier, f2);
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    public Modifier weight(Modifier modifier, float f2, boolean z2) {
        return this.$$delegate_0.weight(modifier, f2, z2);
    }

    private ContextualFlowColumnScopeImpl(int i2, int i3, float f2, float f3) {
        this.lineIndex = i2;
        this.indexInLine = i3;
        this.maxWidth = f2;
        this.maxHeightInLine = f3;
        this.$$delegate_0 = FlowColumnScopeInstance.INSTANCE;
    }

    @Override // androidx.compose.foundation.layout.ContextualFlowColumnScope
    public int getLineIndex() {
        return this.lineIndex;
    }

    @Override // androidx.compose.foundation.layout.ContextualFlowColumnScope
    public int getIndexInLine() {
        return this.indexInLine;
    }

    @Override // androidx.compose.foundation.layout.ContextualFlowColumnScope
    /* JADX INFO: renamed from: getMaxWidth-D9Ej5fM */
    public float mo936getMaxWidthD9Ej5fM() {
        return this.maxWidth;
    }

    @Override // androidx.compose.foundation.layout.ContextualFlowColumnScope
    /* JADX INFO: renamed from: getMaxHeightInLine-D9Ej5fM */
    public float mo935getMaxHeightInLineD9Ej5fM() {
        return this.maxHeightInLine;
    }
}
