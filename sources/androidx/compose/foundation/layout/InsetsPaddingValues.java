package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012}\tnjO0LeN0ZS@\u000fs{:)c$\u007fLC٥\"}0ޛWȞog|PbŏK\u000f\u0014\"\u0001̓2Jkތ\u000e\u0012=1\u0003\u0003O7[oU9\u000fuF\t.4:8(\bв\u001e*V\u0014?\u000eQR$\u0012^H7Nƞ\f˟ơ\u0019\u0011ĂB\"\u0007'jq\u0017QVwu:]+3mPZ?_^\n\u0014!ѸS܋͒u`ӿ/B=C#4\u001c\u001e\u0015bs?1G\"A\u0013t?'YV:kΥWÜѥ\u0014*̠\u0011_x7j\u0014\u001as\u001a9CO\u0012S\u0017\"Âv\u07beց\f;Ǭ\u0012\b-[<7bw\u0016\"Kt!hpV\u0010tZ\u0002\u0011`d.kŅ3s?)~iai2\u0015KD\u000b\u001b8;\u0001\u001d<\"h^l#\u001dlw\u007f4(̸?˓R\naƝ>\u0013~b\u001a*21Ͻ\u00045\u0004߾F\u0019+<i?\u05fd!t\nHJ\u0007~\bfćo\u0018Q͛D>"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7y7[CJy\u001f\u001a\u0014geB\tT(U\u0007'U\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u0001*LB?t6\u000f\u0011oq9\u00159", "7mb2g:", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\b2VBE}\u0018'#hpG\\", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u0012*G|_ QL:uF\u0002\u001evaH\u00159\u0013J\u007f&TVR+o\u001cpG\u001c\u001dd\u001cNt\u001d\t#Q-rS\u0001}\b5W\u0006J|VO\u0007", "5dc\u0016a:>b'", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y4A}%w?GDj>0xqo9\u0016q\u0002", "1`[0h3:b\u0019[\u0005m;\u0007\u0011\u001aa~'\u007fI\u0003", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "1`[0h3:b\u0019[\u0005m;\u0007\u0011\u001aa~'\u007fI\u0003^u\u001bO\u0013\fw\r", "u(5", "1`[0h3:b\u0019ez_;g\u0005.d\u00041}", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "1`[0h3:b\u0019ez_;g\u0005.d\u00041}\b\u0011c'Q]}$", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W#r9?i\r~;z\u0016,\\GEt\nau", "1`[0h3:b\u0019k~`/\fs+d~,\u0005B", "1`[0h3:b\u0019k~`/\fs+d~,\u0005BH'cWy{,^", "1`[0h3:b\u0019m\u0005i\u0017x\b.i\t*", "1`[0h3:b\u0019m\u0005i\u0017x\b.i\t*C\u001fTv\u001c\u0017pu", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class InsetsPaddingValues implements PaddingValues {
    private final Density density;
    private final WindowInsets insets;

    public InsetsPaddingValues(WindowInsets windowInsets, Density density) {
        this.insets = windowInsets;
        this.density = density;
    }

    public final WindowInsets getInsets() {
        return this.insets;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* JADX INFO: renamed from: calculateLeftPadding-u2uoSUM, reason: not valid java name */
    public float mo969calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection) {
        Density density = this.density;
        return density.mo707toDpu2uoSUM(this.insets.getLeft(density, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* JADX INFO: renamed from: calculateTopPadding-D9Ej5fM, reason: not valid java name */
    public float mo971calculateTopPaddingD9Ej5fM() {
        Density density = this.density;
        return density.mo707toDpu2uoSUM(this.insets.getTop(density));
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* JADX INFO: renamed from: calculateRightPadding-u2uoSUM, reason: not valid java name */
    public float mo970calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection) {
        Density density = this.density;
        return density.mo707toDpu2uoSUM(this.insets.getRight(density, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* JADX INFO: renamed from: calculateBottomPadding-D9Ej5fM, reason: not valid java name */
    public float mo968calculateBottomPaddingD9Ej5fM() {
        Density density = this.density;
        return density.mo707toDpu2uoSUM(this.insets.getBottom(density));
    }

    public String toString() {
        return "InsetsPaddingValues(insets=" + this.insets + ", density=" + this.density + ')';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InsetsPaddingValues)) {
            return false;
        }
        InsetsPaddingValues insetsPaddingValues = (InsetsPaddingValues) obj;
        return Intrinsics.areEqual(this.insets, insetsPaddingValues.insets) && Intrinsics.areEqual(this.density, insetsPaddingValues.density);
    }

    public int hashCode() {
        return (this.insets.hashCode() * 31) + this.density.hashCode();
    }
}
