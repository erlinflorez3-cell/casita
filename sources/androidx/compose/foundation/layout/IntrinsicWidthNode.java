package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: Intrinsic.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\r+4\u0012}\u000fnjO0Le^.Zݷ2\u000f\u0002{<$a&yCI[\"}8\tWN}gvJ`\fI\u000f\u001cǝ)jZH\u0016\fm\u0016\u001d2Zom4]sK;xtd\bڶ6\"F}M%(7`\u0010%\tkK:!`D~Jj\r{\u0016J\u0016\u0014P8\u0001Lj.bʝGǍҺ>1)\u0016wV\u0017AmE\u0015M;\\|';\u000e\u0012\"9PO5C=\u0004\u0007\u0015ks?1U8QM\u00035ACI\"m^X.+E/]\u001durTt5Un%?+}y\u0012d^@\u0006|\u0014\rj\u0007dΑ3ρ29\"Ǒ \u00109y\u0001Y`R\beP\bKyD\u0017=\u007fa,\u0010ӜrЂeG!\u05cbO}\u000b\u0016,-!p'fb\u001a֮\u0015 \\zWŚmn<˙R%"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7y7\\P?tB\"\u0013Ze8\u0016f\u0015Xu'\u001d", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7y7\\P?tB\"\u0013VeN\u0007K6Mz(KL[\u0002", "EhSA[", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7y7\\P?tB\"\u0013VeN\u00079", "3mU<e*>7\"|\u0005f0\u0006\u000b", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u0012*G|_\u0012VRHo=,\u0019fO=\u001cc\u0002C:\u0018", "5dc\u0012a-H`\u0017~^g*\u0007\u00113n\u0002", "u(I", "Adc\u0012a-H`\u0017~^g*\u0007\u00113n\u0002", "uY\u0018#", "5dc$\\+MV", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y4A}%w1LJx8'#l_'\u000bx,$", "Adc$\\+MV", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u0012*G|_\u0012VRHo=,\u0019fO=\u001cc\u0002\u0012g", "1`[0h3:b\u0019\\\u0005g;|\u0012>C\n1\nO\u000e\u0013\u001bP~\u001c", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7[\u00148XC\u0011", ";dP@h9:P ~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-3j\u001d.#", "1n]@g9:W\"\u000e\t", "1`[0h3:b\u0019\\\u0005g;|\u0012>C\n1\nO\u000e\u0013\u001bP~\u001c\u0004}t\bAe\u0005\u0002", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\r5U\f0Dm\u0004,WN;A\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001c\u0003A]\u0019V\"X;\u001cNAA |TD\u001b\u00053IW ,e", ";`g\u0016a;KW\"\r~\\\u001e\u0001\b>h", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006Z.Df\u0002)Eq\u0014\u0016M?I{A\u001e\u0003fkD\u00079", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006Z.Df\u0002)Eq\u0014\u0016M?I{A\u001a\u0012oa\u000f", "6dX4[;", ";h]\u0016a;KW\"\r~\\\u001e\u0001\b>h", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class IntrinsicWidthNode extends IntrinsicSizeModifier {
    private boolean enforceIncoming;
    private IntrinsicSize width;

    public final IntrinsicSize getWidth() {
        return this.width;
    }

    public final void setWidth(IntrinsicSize intrinsicSize) {
        this.width = intrinsicSize;
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier
    public boolean getEnforceIncoming() {
        return this.enforceIncoming;
    }

    public void setEnforceIncoming(boolean z2) {
        this.enforceIncoming = z2;
    }

    public IntrinsicWidthNode(IntrinsicSize intrinsicSize, boolean z2) {
        this.width = intrinsicSize;
        this.enforceIncoming = z2;
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier
    /* JADX INFO: renamed from: calculateContentConstraints-l58MMJ0 */
    public long mo972calculateContentConstraintsl58MMJ0(MeasureScope measureScope, Measurable measurable, long j2) {
        int iMaxIntrinsicWidth;
        if (this.width == IntrinsicSize.Min) {
            iMaxIntrinsicWidth = measurable.minIntrinsicWidth(Constraints.m6590getMaxHeightimpl(j2));
        } else {
            iMaxIntrinsicWidth = measurable.maxIntrinsicWidth(Constraints.m6590getMaxHeightimpl(j2));
        }
        if (iMaxIntrinsicWidth < 0) {
            iMaxIntrinsicWidth = 0;
        }
        return Constraints.Companion.m6603fixedWidthOenEA2s(iMaxIntrinsicWidth);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return this.width == IntrinsicSize.Min ? intrinsicMeasurable.minIntrinsicWidth(i2) : intrinsicMeasurable.maxIntrinsicWidth(i2);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return this.width == IntrinsicSize.Min ? intrinsicMeasurable.minIntrinsicWidth(i2) : intrinsicMeasurable.maxIntrinsicWidth(i2);
    }
}
