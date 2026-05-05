package androidx.compose.material3;

import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.ui.graphics.Color;
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
/* JADX INFO: compiled from: Ripple.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012}\fnjG9LeN.ZS8\u0015sڔ<$i0yّAZ0ԂR\t}M(\u0001~P`\u000bQ\u000f\u001e\u0016'k<Q[xk\u0014'4Xnm6ޜs=Gd=G\u0013*J\"f\u00055\u0007(6`\u0012\ryqJR܌0\tvH_%M3(X\u001a\u0007&\u000f-tg|F\u000f\u0001.Q=#\u001bipOф^ܞǠL\fТX/\u0015vo%CB=:#+$\u0014\u0015TsA\u0019> @ݾl-/Ǣau]>f\tϯ\u00154W\u0010cĘB\u000b\u0004Y`\u0012FˬSt"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006c)@d\u0005 \u0015w\u001f/QEKx0-\u0019rj\u000f", "", "1n[<e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "@h_=_,\u001aZ$\u0002v", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCvWIz0@`}i$q!9TC\u0017r?!\u0011>", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nC@29d\t'77\u00032XNBk\u0010% k]\u000fmi6]}+P\u0016S=d\u001cvF#\u0012g\u0017J2VcYB ~KF|\u00125W\u0011Hx~\u001b \u001b\u001df}HV\u001d\u001d=\u0006", "5dc\u0010b3H``Iy0&b\u000e\u001f", "u(9", "\u0018", "5dc\u001f\\7IZ\u0019Z\u0002i/x", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nC@29d\t'77\u00032XNBk\u0010% k]\u000f", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class RippleConfiguration {
    public static final int $stable = 0;
    private final long color;
    private final RippleAlpha rippleAlpha;

    public /* synthetic */ RippleConfiguration(long j2, RippleAlpha rippleAlpha, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, rippleAlpha);
    }

    private RippleConfiguration(long j2, RippleAlpha rippleAlpha) {
        this.color = j2;
        this.rippleAlpha = rippleAlpha;
    }

    public /* synthetic */ RippleConfiguration(long j2, RippleAlpha rippleAlpha, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 + 1) - (1 | i2) != 0 ? Color.Companion.m4214getUnspecified0d7_KjU() : j2, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? null : rippleAlpha, null);
    }

    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m2420getColor0d7_KjU() {
        return this.color;
    }

    public final RippleAlpha getRippleAlpha() {
        return this.rippleAlpha;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RippleConfiguration)) {
            return false;
        }
        RippleConfiguration rippleConfiguration = (RippleConfiguration) obj;
        return Color.m4179equalsimpl0(this.color, rippleConfiguration.color) && Intrinsics.areEqual(this.rippleAlpha, rippleConfiguration.rippleAlpha);
    }

    public int hashCode() {
        int iM4185hashCodeimpl = Color.m4185hashCodeimpl(this.color) * 31;
        RippleAlpha rippleAlpha = this.rippleAlpha;
        return iM4185hashCodeimpl + (rippleAlpha != null ? rippleAlpha.hashCode() : 0);
    }

    public String toString() {
        return "RippleConfiguration(color=" + ((Object) Color.m4186toStringimpl(this.color)) + ", rippleAlpha=" + this.rippleAlpha + ')';
    }
}
