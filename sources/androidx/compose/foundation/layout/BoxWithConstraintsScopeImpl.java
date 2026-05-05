package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
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
/* JADX INFO: compiled from: BoxWithConstraints.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯL\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nj?3Le^.ZS0\u001cs{B-cҕyCI٥\"Ԃ*\t]To˧vJh\u0017KƤ\u000e\u0016\u000fj4կ]xs\u0012\u00172HoEݏS\u0006މi`#55 `\"x\r\u0015\u0005(+`\u0010%|SO\u001a\u0015H@\u001f>ň\u0011M\u0013\u001fZ\rL3\u0019\u001e\u000bi\u0015ɧI5qHC;\u0003\u0018F\u0015В`ޗ{LЮEÖܮ\u0011xg39G\u007fZ#;k\u00035Ѹ\fE\t?\u007f>\u001dhU)[OyWD[\u0018\u0014C/\u0016֜\\ů%ؘԇUb\u0012>9g,\\^'@w)\u0016=B\u0012)\u001e)^-[6-۳\u000f{{\u0001pXP0|\tɬy*=%D\u00183YYaǯP*N'oO{3/F#/\u0011Q_b1x\u0015Ix>Λ0\u001aKKmf\n\b_\u0016\u0004\u001f\u0005Hç\u0003\u0001a\u000e2\u0014\u0011\\\u001b{ڲ]߶\"ܩɶ\u0001Gזk~\r`v[\u0002TNF0ufC8\n$Zrf[ߛRԜ\\,\u0019۳ll\u0015\u0007 \u0013Nf.\u0011wَ\u0012̓NŖʂiLύ\u000e)Gh=d|w^oGkK5\u007fmF6)ί\u0016ά;ϵܬWe͞W\u0010r^.0@T;(\u0006\u000b\\N:\u001dh\u0014Hʠ6в0ǉě\u0014GҴ\"FY~\u000foht`\u0017bD<\u0003\u0018.+]W˝^̒nΟקH+ʬd&ECWG'2š\"q<\u007f)ȶ\u001b\"~OgRfƫp<"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7r8`5?z7{\u001fqoH\u0014_0W\u000655JX7\\6zH\u001bg", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7r8`5?z7{\u001fqoH\u0014_0W\u000655JX7\\(", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7r8`19u?\u001ej", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W\u001bv.C]\r4\rR|4WRBo=g\u001ayi\u0003\u000bl;N\u00040CS\u0018\u000b\\SnM\u001b!8\u0018W9\u001c\u0012i?3xQ\u001f\u001b\u00152I\u000f\u0011,q", "5dc\u0010b5Lb&z~g;\u000bP7s_\rw\u001f\u0007", "u(9", "\u0018", ";`g\u0015X0@V(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "5dc\u001aT?!S\u001d\u0001}ms[\\\u000fjO)c", "u(5", ";`g$\\+MV", "5dc\u001aT?0W\u0018\u000e}&\u000bPh45\u0001\u0010", ";h]\u0015X0@V(", "5dc\u001a\\5!S\u001d\u0001}ms[\\\u000fjO)c", ";h]$\\+MV", "5dc\u001a\\50W\u0018\u000e}&\u000bPh45\u0001\u0010", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(KBf:\\m+D\u0006", "1n_F", "1n_F vD:%[\u0007p", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W\u001bv.C]\r4\rRY\u0015IL:x>\"\u0014{+7\u0011k7X\u0005'\u0011MX<eQnL\u0018\u001ccWU'!\u000fiPmKNJ\u0011\f;L_Eq\u000f\u001b#\n9s\u007fPD\u000eQ\u0005\u0015YI4o\u001c", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "/kX4a", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "/kX4a4>\\(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4\u000b", ";`c0[\u0017:`\u0019\b\nL0\u0012\t", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class BoxWithConstraintsScopeImpl implements BoxWithConstraintsScope, BoxScope {
    private final /* synthetic */ BoxScopeInstance $$delegate_0;
    private final long constraints;
    private final Density density;

    public /* synthetic */ BoxWithConstraintsScopeImpl(Density density, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(density, j2);
    }

    private final Density component1() {
        return this.density;
    }

    /* JADX INFO: renamed from: copy-0kLqBqw$default, reason: not valid java name */
    public static /* synthetic */ BoxWithConstraintsScopeImpl m930copy0kLqBqw$default(BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl, Density density, long j2, int i2, Object obj) {
        if ((1 & i2) != 0) {
            density = boxWithConstraintsScopeImpl.density;
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            j2 = boxWithConstraintsScopeImpl.constraints;
        }
        return boxWithConstraintsScopeImpl.m932copy0kLqBqw(density, j2);
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    public Modifier align(Modifier modifier, Alignment alignment) {
        return this.$$delegate_0.align(modifier, alignment);
    }

    /* JADX INFO: renamed from: component2-msEJaDk, reason: not valid java name */
    public final long m931component2msEJaDk() {
        return this.constraints;
    }

    /* JADX INFO: renamed from: copy-0kLqBqw, reason: not valid java name */
    public final BoxWithConstraintsScopeImpl m932copy0kLqBqw(Density density, long j2) {
        return new BoxWithConstraintsScopeImpl(density, j2, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoxWithConstraintsScopeImpl)) {
            return false;
        }
        BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj;
        return Intrinsics.areEqual(this.density, boxWithConstraintsScopeImpl.density) && Constraints.m6584equalsimpl0(this.constraints, boxWithConstraintsScopeImpl.constraints);
    }

    public int hashCode() {
        return (this.density.hashCode() * 31) + Constraints.m6594hashCodeimpl(this.constraints);
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    public Modifier matchParentSize(Modifier modifier) {
        return this.$$delegate_0.matchParentSize(modifier);
    }

    public String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.density + ", constraints=" + ((Object) Constraints.m6596toStringimpl(this.constraints)) + ')';
    }

    private BoxWithConstraintsScopeImpl(Density density, long j2) {
        this.density = density;
        this.constraints = j2;
        this.$$delegate_0 = BoxScopeInstance.INSTANCE;
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* JADX INFO: renamed from: getConstraints-msEJaDk */
    public long mo925getConstraintsmsEJaDk() {
        return this.constraints;
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* JADX INFO: renamed from: getMinWidth-D9Ej5fM */
    public float mo929getMinWidthD9Ej5fM() {
        return this.density.mo707toDpu2uoSUM(Constraints.m6593getMinWidthimpl(mo925getConstraintsmsEJaDk()));
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* JADX INFO: renamed from: getMaxWidth-D9Ej5fM */
    public float mo927getMaxWidthD9Ej5fM() {
        return Constraints.m6587getHasBoundedWidthimpl(mo925getConstraintsmsEJaDk()) ? this.density.mo707toDpu2uoSUM(Constraints.m6591getMaxWidthimpl(mo925getConstraintsmsEJaDk())) : Dp.Companion.m6657getInfinityD9Ej5fM();
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* JADX INFO: renamed from: getMinHeight-D9Ej5fM */
    public float mo928getMinHeightD9Ej5fM() {
        return this.density.mo707toDpu2uoSUM(Constraints.m6592getMinHeightimpl(mo925getConstraintsmsEJaDk()));
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* JADX INFO: renamed from: getMaxHeight-D9Ej5fM */
    public float mo926getMaxHeightD9Ej5fM() {
        return Constraints.m6586getHasBoundedHeightimpl(mo925getConstraintsmsEJaDk()) ? this.density.mo707toDpu2uoSUM(Constraints.m6590getMaxHeightimpl(mo925getConstraintsmsEJaDk())) : Dp.Companion.m6657getInfinityD9Ej5fM();
    }
}
