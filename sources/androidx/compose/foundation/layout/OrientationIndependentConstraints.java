package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
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
/* JADX INFO: compiled from: RowColumnImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4F\u0007\"B\u0012\u007fјnjO0LeN9ZS8\u0018s{:1c$\u007fOCU ~(ޝ\u000edʴ\u0018nxYKj\u0015\u001a&|x,aU'^\"\u0013@D\b?aN\u007fAGc\r63!B&F}\u001d\u0001H+Н\u0014x\u0001HY\u0012RGF\u0005JV\u001bT\u001d\u001a@\u000eN$\u000f'tg|@Ղp_@41\u000e*QT'o4\u000bY%F\u0003/˼zc$0ND}N3g\u001b\u0007\u0001¹o\tEqK\u0005\u0001'U,yy]6f\u0002,\u0015YP=cx&j\bi`:([UiK^\u0012@w)|ʗ;\u0003ٳ\u0005Ωρ2/ {\u0016${\r\u0001jXP0vr\u0006\tzN\u0019;~a*\u007fԬgЂe=\u001fhE\u0017M\u001b,?\u0019nO\\\u001bج_ڠ\u001fV}n?`\tPVl\"Ykn4tp\u000bB\u0004^QĬ3}\u0017M%E\u007fnGD9k0Itk\u0005\u000exh\u0002sʐLB(\u0011$Wr\u001a\u001a}\\d3ߘĥSWą\u0010۳ɟX\t\u0004,!-%\u0011JF=\u0010|W\u0019mxVu\nS9т6X̝jލĆ=`9[_nXo`\u001e,?j\u000bKױe͞W\u000e`\u00066L\u0003Xx\u0014\u0010{rOBǕ2Ɛu L.7'j$\u0019\u0013,EY|7`\u0011ԗ\u0010њX7<\u0005o4\u0003\u0018Q`jr\bg'Jbː`Ę1Ei7\u001f7c19D\u000b#\u001f~\"\u0001}ҌLܤPp.w[\u000e.%jM_;U\u0013=\u0007\u007fɈ\u0004ЈDɣɢdP̊\u0016)\u0003|\b\"\u0099g:ԩ\u0007j\u001f4ߏjSWW\u001dȓ\u0013\rq+\bj\u001f\u0601eq"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u007f;QCDz0-\u0019rj\u001d\u0010b,Yv0FLW;:\\{K#\u001fV\u0012W:\u001bZ", "", ";`X;4?Ba\u0001\u0003\u0004", "", ";`X;4?Ba\u0001z\u000e", "1q^@f\bQW'f~g", "1q^@f\bQW'fvq", "1n]@g9NQ(\t\b&0\u0005\u00146", "uH8\u0016<o#", "1", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "=qX2a;:b\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7|*aMKz\u001e+\u0019hjH\u0003r0X\u007f|", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y4A}%w4?OuD-~ue9\u0010r(]z1P\"\u0012\u0011", "D`[BX", "uI\u0018\u0017", "5dc\u0010e6Lat\u0012~l\u0014x\u001cvi\b3\u0003", "uI\u0018\u0016", "5dc\u0010e6Lat\u0012~l\u0014\u0001\u0012vi\b3\u0003", "5dc\u001aT0G/,\u0003\tF(\u0010P3m\u000b/", "5dc\u001aT0G/,\u0003\tF0\u0006P3m\u000b/", "\u0018", "1n_F", "1n_F @.5l_\n)", "uI8\u0016<\u0010\u00028", "3pd._:", "", "=sW2e", "3pd._:\u0006W!\n\u0002", "uI;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "6`b566=S", "6`b566=S`\u0003\u0003i3", ";`g\u0015X0@V(", ";`g\u0015X0@V(F~f7\u0004", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y4A}%w4?OuD-~ue9\u0010r(]z1P\"\u0012\u0010", ";`g$\\+MV", ";`g$\\+MV`\u0003\u0003i3", "Asa2g*A1&\t\tl\b\u0010\r=", "Asa2g*A1&\t\tl\b\u0010\r=-\fv{U\u000bh\u000b", "Bn1<k\nH\\'\u000e\bZ0\u0006\u0018=", "Bn1<k\nH\\'\u000e\bZ0\u0006\u0018=-i(\u0005 \\c%", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uI\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class OrientationIndependentConstraints {
    private final long value;

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ OrientationIndependentConstraints m984boximpl(long j2) {
        return new OrientationIndependentConstraints(j2);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static long m986constructorimpl(long j2) {
        return j2;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m990equalsimpl(long j2, Object obj) {
        return (obj instanceof OrientationIndependentConstraints) && Constraints.m6584equalsimpl0(j2, ((OrientationIndependentConstraints) obj).m1002unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m991equalsimpl0(long j2, long j3) {
        return Constraints.m6584equalsimpl0(j2, j3);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m996hashCodeimpl(long j2) {
        return Constraints.m6594hashCodeimpl(j2);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1001toStringimpl(long j2) {
        return "OrientationIndependentConstraints(value=" + ((Object) Constraints.m6596toStringimpl(j2)) + ')';
    }

    public boolean equals(Object obj) {
        return m990equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m996hashCodeimpl(this.value);
    }

    public String toString() {
        return m1001toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m1002unboximpl() {
        return this.value;
    }

    private /* synthetic */ OrientationIndependentConstraints(long j2) {
        this.value = j2;
    }

    /* JADX INFO: renamed from: getMainAxisMin-impl, reason: not valid java name */
    public static final int m995getMainAxisMinimpl(long j2) {
        return Constraints.m6593getMinWidthimpl(j2);
    }

    /* JADX INFO: renamed from: getMainAxisMax-impl, reason: not valid java name */
    public static final int m994getMainAxisMaximpl(long j2) {
        return Constraints.m6591getMaxWidthimpl(j2);
    }

    /* JADX INFO: renamed from: getCrossAxisMin-impl, reason: not valid java name */
    public static final int m993getCrossAxisMinimpl(long j2) {
        return Constraints.m6592getMinHeightimpl(j2);
    }

    /* JADX INFO: renamed from: getCrossAxisMax-impl, reason: not valid java name */
    public static final int m992getCrossAxisMaximpl(long j2) {
        return Constraints.m6590getMaxHeightimpl(j2);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m985constructorimpl(int i2, int i3, int i4, int i5) {
        return m986constructorimpl(ConstraintsKt.Constraints(i2, i3, i4, i5));
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m987constructorimpl(long j2, LayoutOrientation layoutOrientation) {
        return m985constructorimpl(layoutOrientation == LayoutOrientation.Horizontal ? Constraints.m6593getMinWidthimpl(j2) : Constraints.m6592getMinHeightimpl(j2), layoutOrientation == LayoutOrientation.Horizontal ? Constraints.m6591getMaxWidthimpl(j2) : Constraints.m6590getMaxHeightimpl(j2), layoutOrientation == LayoutOrientation.Horizontal ? Constraints.m6592getMinHeightimpl(j2) : Constraints.m6593getMinWidthimpl(j2), layoutOrientation == LayoutOrientation.Horizontal ? Constraints.m6590getMaxHeightimpl(j2) : Constraints.m6591getMaxWidthimpl(j2));
    }

    /* JADX INFO: renamed from: toBoxConstraints-OenEA2s, reason: not valid java name */
    public static final long m1000toBoxConstraintsOenEA2s(long j2, LayoutOrientation layoutOrientation) {
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return ConstraintsKt.Constraints(Constraints.m6593getMinWidthimpl(j2), Constraints.m6591getMaxWidthimpl(j2), Constraints.m6592getMinHeightimpl(j2), Constraints.m6590getMaxHeightimpl(j2));
        }
        return ConstraintsKt.Constraints(Constraints.m6592getMinHeightimpl(j2), Constraints.m6590getMaxHeightimpl(j2), Constraints.m6593getMinWidthimpl(j2), Constraints.m6591getMaxWidthimpl(j2));
    }

    /* JADX INFO: renamed from: maxWidth-impl, reason: not valid java name */
    public static final int m998maxWidthimpl(long j2, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? Constraints.m6591getMaxWidthimpl(j2) : Constraints.m6590getMaxHeightimpl(j2);
    }

    /* JADX INFO: renamed from: maxHeight-impl, reason: not valid java name */
    public static final int m997maxHeightimpl(long j2, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? Constraints.m6590getMaxHeightimpl(j2) : Constraints.m6591getMaxWidthimpl(j2);
    }

    /* JADX INFO: renamed from: copy-yUG9Ft0, reason: not valid java name */
    public static final long m988copyyUG9Ft0(long j2, int i2, int i3, int i4, int i5) {
        return m985constructorimpl(i2, i3, i4, i5);
    }

    /* JADX INFO: renamed from: stretchCrossAxis-q4ezo7Y, reason: not valid java name */
    public static final long m999stretchCrossAxisq4ezo7Y(long j2) {
        return m985constructorimpl(Constraints.m6593getMinWidthimpl(j2), Constraints.m6591getMaxWidthimpl(j2), Constraints.m6590getMaxHeightimpl(j2) != Integer.MAX_VALUE ? Constraints.m6590getMaxHeightimpl(j2) : Constraints.m6592getMinHeightimpl(j2), Constraints.m6590getMaxHeightimpl(j2));
    }

    /* JADX INFO: renamed from: copy-yUG9Ft0$default, reason: not valid java name */
    public static /* synthetic */ long m989copyyUG9Ft0$default(long j2, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((-1) - (((-1) - i6) | ((-1) - 1)) != 0) {
            i2 = Constraints.m6593getMinWidthimpl(j2);
        }
        if ((-1) - (((-1) - i6) | ((-1) - 2)) != 0) {
            i3 = Constraints.m6591getMaxWidthimpl(j2);
        }
        if ((i6 + 4) - (4 | i6) != 0) {
            i4 = Constraints.m6592getMinHeightimpl(j2);
        }
        if ((i6 & 8) != 0) {
            i5 = Constraints.m6590getMaxHeightimpl(j2);
        }
        return m988copyyUG9Ft0(j2, i2, i3, i4, i5);
    }
}
