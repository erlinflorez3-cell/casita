package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: AlignmentLine.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nj?<Le^.ZS@\u000fsڔ<$q$yّCU0}*\tUOmg\u0005Ϻ\u000b\u000bq\u000e6\u0016'jlde|k\u0013'2pqO7[rU9\u000fxF\t.7:8(\tв\u001e*V\u0016?\u001fQ]$\u0012^S\u0019:\u0001!}\t('\u001e>N\u0017N`ueNH\u001bu\u0001C߃\u0002݃ŌR)eI\u000bg]fb,%v\u0010\"\u0002¯CÆ\u0014Ǭھ\u0002\u0006қ_M\u000b?\u007fH\u001dj-.9Q\u0014Y<a\u000e\u001eeC]\u000eurT^[İlВ+7WҪcR\u00144\u0006\b\u001c\u000fB\u0012\u001c\u0015wh<02f6\u0012\nφ~֘?Аڕ]Aȸ~o>\u00173\u000bK-?+tY\u0002=\u001f_E\u0006˟\r'+\u0004tıw\u0003\rh\u0015!sɖUL"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q5QEDs4'$OeB\u0007M-O\u0005'V;N?kB{A#zd\rN\u0001", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehe*6q\u00172MP$u3\u001ej", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u001ec| \r", "/kX4a4>\\(e~g,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006R,9[\u0007(7v%\u0015QL;A", "0dU<e,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9|<\n4%b\u0002/\r", "/ec2e", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\u0001<]\u007f)?m\u001f=4GDk\n\u0003yOgC\u0016j0W@,XT\u00180earJ\u001d\u000eaW-+\u000e\u0001iH3LN@-\u00179Y\u007fJr\u000es\u0012\u001b;j}\u0018\u001a\u0001", "5dc\u000eY;>``qh:\u0010`}\u000f", "u(9", "Adc\u000eY;>``Fg+\u001fvY9", "uI\u0018#", "\u0018", "5dc\u000e_0@\\!~\u0004m\u0013\u0001\u0012/", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n\u0011`\u0002\"@u\u00167\\*?t4s", "Adc\u000e_0@\\!~\u0004m\u0013\u0001\u0012/", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\u0001<]\u007f)?m\u001f=4GDk\na\u0006", "5dc\u000fX-H`\u0019FmL\b`l$E", "Adc\u000fX-H`\u0019FBKxo\u0003\u007fo", ";dP@h9>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7[\u00148XC\u0011", ";dP@h9:P ~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-3j\u001d.#", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ";dP@h9>\u001bf\nGl~G\u0017", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\r5U\f0Dm\u0004,WN;A\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001c\u0003A]\u0019V\"X;\u001cNAA |TD\u001b\u00053IW ,g\b\u001f\rBttAiYE\u0004\u001d\u0001K7h\u0010icCN=Yl:sUG\u001dXHJ1\u0014^\u0019)xW=_", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class AlignmentLineOffsetTextUnitNode extends Modifier.Node implements LayoutModifierNode {
    private long after;
    private AlignmentLine alignmentLine;
    private long before;

    public /* synthetic */ AlignmentLineOffsetTextUnitNode(AlignmentLine alignmentLine, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(alignmentLine, j2, j3);
    }

    public final AlignmentLine getAlignmentLine() {
        return this.alignmentLine;
    }

    public final void setAlignmentLine(AlignmentLine alignmentLine) {
        this.alignmentLine = alignmentLine;
    }

    /* JADX INFO: renamed from: getBefore-XSAIIZE, reason: not valid java name */
    public final long m885getBeforeXSAIIZE() {
        return this.before;
    }

    /* JADX INFO: renamed from: setBefore--R2X_6o, reason: not valid java name */
    public final void m887setBeforeR2X_6o(long j2) {
        this.before = j2;
    }

    /* JADX INFO: renamed from: getAfter-XSAIIZE, reason: not valid java name */
    public final long m884getAfterXSAIIZE() {
        return this.after;
    }

    /* JADX INFO: renamed from: setAfter--R2X_6o, reason: not valid java name */
    public final void m886setAfterR2X_6o(long j2) {
        this.after = j2;
    }

    private AlignmentLineOffsetTextUnitNode(AlignmentLine alignmentLine, long j2, long j3) {
        this.alignmentLine = alignmentLine;
        this.before = j2;
        this.after = j3;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo428measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
        return AlignmentLineKt.m867alignmentLineOffsetMeasuretjqqzMA(measureScope, this.alignmentLine, !TextUnitKt.m6849isUnspecifiedR2X_6o(this.before) ? measureScope.mo705toDpGaN1DYA(this.before) : Dp.Companion.m6658getUnspecifiedD9Ej5fM(), !TextUnitKt.m6849isUnspecifiedR2X_6o(this.after) ? measureScope.mo705toDpGaN1DYA(this.after) : Dp.Companion.m6658getUnspecifiedD9Ej5fM(), measurable, j2);
    }
}
