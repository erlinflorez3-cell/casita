package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
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
/* JADX INFO: compiled from: WindowInsets.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0005'4\u0012\u0006\u0010nʑA0R͜P\u008cZS8\u0015sڔ<$q$yCAU\"}8\tWNmivJh\u0017KƤ\f\u0017\u000f̓\\I\u0004w\u001e%\u001f6PoW3{nM=nuN\u0005N4ŕ<y\u0013\u0004b;V\u0019\u000fzqU<\u0018>K\t<h\f{\u0011`Ş\u0006\u0007.\u000f+tg|DxpkIG#1y\tbou>\u000ee\rtbW\u0011\u0005p6+nGe\u00193e\u001b\u0007\u0001n\u0006\u0017\b\bK\u0019\u0001'U9yweEp\u007fB%[S\u001bo\u000b&\u000b\u0018\u0018tT59d{K~\u001cX{\t\u000b%<2\u001eL;\u00114;0~\b<A;\u0007\u001cF^\u0019vB.\u0013(Jg4\u000e3C9IeЂeA!\u05cbO}\u000b\u0011,(Q\u0006/\\l\u000e\u000f\u0017ŊSȭϼ0P͘APV\ngE\u0006\u0006vh\u00101ʹ0P\b2\u0002\u009fJE$?[?Bݒo\u001b"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7|2UGJO=,\u0015wo\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\b2VBE}\u0018'#hpG\\", "7mb2g:", "AhS2f", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\b2VBE}\u0018'#hpGtg+N\u0005|", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u0012*G|_ QL:uF\u0002\u001evaH\u00159\u00105|1VSR5&W\u0004E]\u0016c\u001dN8\u0016\u0001`\u000b\u0003nE3/\u000f;'\fDv\u0010\u0019&\fDt}*R\u001dMy\"K\u0005\u001a", "5dc\u0016a:>b'", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y4A}%w?GDj>0xqo9\u0016q\u0002", "5dc \\+>a`c\u0005^\u001e\t\u001d\u0017", "u(8", "\u0017", "3pd._:", "", "=sW2e", "", "5dc\u000fb;M]!", "", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "5dc\u0019X-M", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "5dc\u001f\\.Ab", "5dc!b7", "6`b566=S", "BnBAe0GU", "", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class LimitInsets implements WindowInsets {
    private final WindowInsets insets;
    private final int sides;

    public /* synthetic */ LimitInsets(WindowInsets windowInsets, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(windowInsets, i2);
    }

    private LimitInsets(WindowInsets windowInsets, int i2) {
        this.insets = windowInsets;
        this.sides = i2;
    }

    public final WindowInsets getInsets() {
        return this.insets;
    }

    /* JADX INFO: renamed from: getSides-JoeWqyM, reason: not valid java name */
    public final int m973getSidesJoeWqyM() {
        return this.sides;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        int iM1106getAllowLeftInRtlJoeWqyM$foundation_layout_release;
        if (layoutDirection == LayoutDirection.Ltr) {
            iM1106getAllowLeftInRtlJoeWqyM$foundation_layout_release = WindowInsetsSides.Companion.m1105getAllowLeftInLtrJoeWqyM$foundation_layout_release();
        } else {
            iM1106getAllowLeftInRtlJoeWqyM$foundation_layout_release = WindowInsetsSides.Companion.m1106getAllowLeftInRtlJoeWqyM$foundation_layout_release();
        }
        if (WindowInsetsSides.m1099hasAnybkgdKaI$foundation_layout_release(this.sides, iM1106getAllowLeftInRtlJoeWqyM$foundation_layout_release)) {
            return this.insets.getLeft(density, layoutDirection);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        if (WindowInsetsSides.m1099hasAnybkgdKaI$foundation_layout_release(this.sides, WindowInsetsSides.Companion.m1115getTopJoeWqyM())) {
            return this.insets.getTop(density);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        int iM1108getAllowRightInRtlJoeWqyM$foundation_layout_release;
        if (layoutDirection == LayoutDirection.Ltr) {
            iM1108getAllowRightInRtlJoeWqyM$foundation_layout_release = WindowInsetsSides.Companion.m1107getAllowRightInLtrJoeWqyM$foundation_layout_release();
        } else {
            iM1108getAllowRightInRtlJoeWqyM$foundation_layout_release = WindowInsetsSides.Companion.m1108getAllowRightInRtlJoeWqyM$foundation_layout_release();
        }
        if (WindowInsetsSides.m1099hasAnybkgdKaI$foundation_layout_release(this.sides, iM1108getAllowRightInRtlJoeWqyM$foundation_layout_release)) {
            return this.insets.getRight(density, layoutDirection);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        if (WindowInsetsSides.m1099hasAnybkgdKaI$foundation_layout_release(this.sides, WindowInsetsSides.Companion.m1109getBottomJoeWqyM())) {
            return this.insets.getBottom(density);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitInsets)) {
            return false;
        }
        LimitInsets limitInsets = (LimitInsets) obj;
        return Intrinsics.areEqual(this.insets, limitInsets.insets) && WindowInsetsSides.m1098equalsimpl0(this.sides, limitInsets.sides);
    }

    public int hashCode() {
        return (this.insets.hashCode() * 31) + WindowInsetsSides.m1100hashCodeimpl(this.sides);
    }

    public String toString() {
        return "(" + this.insets + " only " + ((Object) WindowInsetsSides.m1102toStringimpl(this.sides)) + ')';
    }
}
