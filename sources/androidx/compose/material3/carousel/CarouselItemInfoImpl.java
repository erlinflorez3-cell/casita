package androidx.compose.material3.carousel;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Rect;
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
/* JADX INFO: compiled from: CarouselState.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0005*4\u0012\u0006\fnj?CJ͜^\u008c\u0003SX\u000e,~Č([2q\u0014Mc\u001b\u0016\"7Q\u0005<>ĈLҼ\u000fG'\b\u001c{x0\u001a~\u0007c*\u000f`D CAR\b=gb+zCd\tĹ؏yڱ\u0005*2J\u0016\u0001\tNc\u000e\u00187NtZT\u0013U\u0013#b\u0018L,\u0019\u001e\u000bt\u0005\u000b\u001fǤ_Ơ3'\u001bkH\\5n\u0001&[\u001d^TU\u001a'e,0X7c\"[\u0018AK)Àι\u0003ӭuM\rj-;9^\fY<i\u000e#5-U\u001fk\u0006vn\u0013gx\fU8\u00068\"\u05cb\u0010߭{~\u0014\u000fB\u001b\u001c\u0015wq<E2f6\u001bcx\u0001XXP0kxD9&\rДӪ\u007fĴ/I#hW|I.f9\u0002\u001e\u001b-C\u0003t;ig^r#7lw\u007f>\b\u0015\u0014ˇP̆]A\u0006\u0006v\u007f\u00109TYU\u001eG{?;G)E`Q#Ox8\r\u0003,MݚªhרmbPB(\u0010$LB\u000b\u0012yRs%mVtf?ҳQ>"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006t!Bc\u000e.7t_\fIPE{B\u001e\u001cLp9\u000fG5O\u0001\u000bOWU\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006t!Bc\u000e.7t_\fIPE{B\u001e\u001cLp9\u000fG5O\u0001|", "u(E", ";`b8E,<b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "5dc\u001aT:D@\u0019|\n", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Gy\u0016<\u00062I#j 5|k", "\nrTA \u0006\u0017", ";`b8E,<b\u0007\u000evm,", "5dc\u001aT:D@\u0019|\nL;x\u0018/", "Adc\u001aT:D@\u0019|\nL;x\u0018/", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019\u0017Qw\u000eK\u00049~F}\u001eFCY\u001f", ";`b8E,<b\u0007\u000evm,;\b/l\u007f*wO\u0001", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", ";`g \\A>", "", "5dc\u001aT?,W.~", "u(5", ";`g \\A>A(z\n^", "5dc\u001aT?,W.~hm(\f\t", "Adc\u001aT?,W.~hm(\f\t", "uE\u0018#", ";`g \\A>A(z\n^j{\t6e\u0002$\u000b@", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u0001>w\u0012=;R7z4s", ";h] \\A>", "5dc\u001a\\5,W.~", ";h] \\A>A(z\n^", "5dc\u001a\\5,W.~hm(\f\t", "Adc\u001a\\5,W.~hm(\f\t", ";h] \\A>A(z\n^j{\t6e\u0002$\u000b@", "Ahi2", "5dc \\A>", "Ahi2F;:b\u0019", "5dc \\A>A(z\n^", "Adc \\A>A(z\n^", "Ahi2F;:b\u0019=y^3|\u000b+t\u007f", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class CarouselItemInfoImpl implements CarouselItemInfo {
    public static final int $stable = 0;
    private final MutableFloatState sizeState$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
    private final MutableFloatState minSizeState$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
    private final MutableFloatState maxSizeState$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
    private final MutableState maskRectState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Rect.Companion.getZero(), null, 2, null);

    public final float getSizeState() {
        return this.sizeState$delegate.getFloatValue();
    }

    public final void setSizeState(float f2) {
        this.sizeState$delegate.setFloatValue(f2);
    }

    public final float getMinSizeState() {
        return this.minSizeState$delegate.getFloatValue();
    }

    public final void setMinSizeState(float f2) {
        this.minSizeState$delegate.setFloatValue(f2);
    }

    public final float getMaxSizeState() {
        return this.maxSizeState$delegate.getFloatValue();
    }

    public final void setMaxSizeState(float f2) {
        this.maxSizeState$delegate.setFloatValue(f2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Rect getMaskRectState() {
        return (Rect) this.maskRectState$delegate.getValue();
    }

    public final void setMaskRectState(Rect rect) {
        this.maskRectState$delegate.setValue(rect);
    }

    @Override // androidx.compose.material3.carousel.CarouselItemInfo
    public float getSize() {
        return getSizeState();
    }

    @Override // androidx.compose.material3.carousel.CarouselItemInfo
    public float getMinSize() {
        return getMinSizeState();
    }

    @Override // androidx.compose.material3.carousel.CarouselItemInfo
    public float getMaxSize() {
        return getMaxSizeState();
    }

    @Override // androidx.compose.material3.carousel.CarouselItemInfo
    public Rect getMaskRect() {
        return getMaskRectState();
    }
}
