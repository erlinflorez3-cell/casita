package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
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
/* JADX INFO: compiled from: DragGestureDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4D\u0007\"B\u0012\u007f\u0007lkA0ZeP\u008cZS8\u0014s{:'c$\u007fCCU \u0002(\teȞ\u0018g\u001dI\u001b\u001aS\u0017\f\u0016\u0007jDKkw\f\u0013Ƥ6B}A{n}EQb\u000b53&b&F\u0003\u001d\u0001H4x\u0014\u0005\u0006[K:\u001eڌ?oŦQ҈̂\t\u001a\u0018\u0013\u0007;\u000f,tg|<xpkEG#1u\tNф^/ǠLεТX)\u0013\u0006o.sDEF-%\u0002\u0015OdiR\u001b? I-hU-ɛH֕ɱ:Z\u0006(#@\u0018\u001fk\t>\\3]\t\fU1\u05cbb֟ח\u0012*}\u0012\n\"\r\u0015\u001c\u0006?JD,Hgڿ\u00129|ɁkBV\u0005lFP\u000fo;/%.9\u0002ݐ'ȑPĥߛ\u0018MѼ\u007f\u0007\u0015\u001e1\b͜!d\\\u0011fڟ7\u0003vY1W_שLf"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w<MKi7\f\u001crl\u0018\u0007r,L\u00061T\"", "", "=qX2a;:b\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w7P?k=-\u0011weC\u00109", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn7Y\f/Gz\u0016<\u0017-Ho4'$dp=\u0011l\u0002\u0012g", "5dc\u001ce0>\\(z\nb6\u0006", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~[}.F}#.[\r%x8\u001e\u001ew]H\u000bm5$", "Bnc._\u0017Ha\u001d\u000e~h5Z\f+n\u0002(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "\u0018", "/cS\u001db0Gb\u0019\f^g7\r\u0018\rh{1}@", "2qP48=>\\(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp\u0017\n_5Pv|", "Bnd0[\u001aE]$", "", "/cS\u001db0Gb\u0019\f^g7\r\u0018\rh{1}@Hx\u0015YS|=f", "1`[0h3:b\u0019i\u0005l;j\u00109pi)|N\u0001&", "1`[0h3:b\u0019i\u0005l;j\u00109pi)|N\u0001&^V\u007fz,\b*!", "uE\u0018\u0017", "@db2g", "", "1q^@f\bQW'", "1q^@f\bQW'F\u0001&z\u0004tyM", "uI\u0018\u0013", ";`X;4?Ba", ";`X;4?Ba`\u0005B-3hS\u0017", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class TouchSlopDetector {
    private final Orientation orientation;
    private long totalPositionChange;

    public TouchSlopDetector() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public TouchSlopDetector(Orientation orientation) {
        this.orientation = orientation;
        this.totalPositionChange = Offset.Companion.m3953getZeroF1C5BW0();
    }

    public /* synthetic */ TouchSlopDetector(Orientation orientation, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i2) | ((-1) - 1)) != 0 ? null : orientation);
    }

    public final Orientation getOrientation() {
        return this.orientation;
    }

    /* JADX INFO: renamed from: mainAxis-k-4lQ0M, reason: not valid java name */
    public final float m843mainAxisk4lQ0M(long j2) {
        return this.orientation == Orientation.Horizontal ? Offset.m3937getXimpl(j2) : Offset.m3938getYimpl(j2);
    }

    /* JADX INFO: renamed from: crossAxis-k-4lQ0M, reason: not valid java name */
    public final float m842crossAxisk4lQ0M(long j2) {
        return this.orientation == Orientation.Horizontal ? Offset.m3938getYimpl(j2) : Offset.m3937getXimpl(j2);
    }

    /* JADX INFO: renamed from: addPointerInputChange-GcwITfU, reason: not valid java name */
    public final Offset m841addPointerInputChangeGcwITfU(PointerInputChange pointerInputChange, float f2) {
        float fAbs;
        long jM3942plusMKHz9U = Offset.m3942plusMKHz9U(this.totalPositionChange, Offset.m3941minusMKHz9U(pointerInputChange.m5385getPositionF1C5BW0(), pointerInputChange.m5386getPreviousPositionF1C5BW0()));
        this.totalPositionChange = jM3942plusMKHz9U;
        if (this.orientation == null) {
            fAbs = Offset.m3935getDistanceimpl(jM3942plusMKHz9U);
        } else {
            fAbs = Math.abs(m843mainAxisk4lQ0M(jM3942plusMKHz9U));
        }
        if (fAbs >= f2) {
            return Offset.m3926boximpl(m840calculatePostSlopOffsettuRUvjQ(f2));
        }
        return null;
    }

    public final void reset() {
        this.totalPositionChange = Offset.Companion.m3953getZeroF1C5BW0();
    }

    /* JADX INFO: renamed from: calculatePostSlopOffset-tuRUvjQ, reason: not valid java name */
    private final long m840calculatePostSlopOffsettuRUvjQ(float f2) {
        if (this.orientation == null) {
            long j2 = this.totalPositionChange;
            return Offset.m3941minusMKHz9U(this.totalPositionChange, Offset.m3944timestuRUvjQ(Offset.m3932divtuRUvjQ(j2, Offset.m3935getDistanceimpl(j2)), f2));
        }
        float fM843mainAxisk4lQ0M = m843mainAxisk4lQ0M(this.totalPositionChange) - (Math.signum(m843mainAxisk4lQ0M(this.totalPositionChange)) * f2);
        float fM842crossAxisk4lQ0M = m842crossAxisk4lQ0M(this.totalPositionChange);
        if (this.orientation == Orientation.Horizontal) {
            return OffsetKt.Offset(fM843mainAxisk4lQ0M, fM842crossAxisk4lQ0M);
        }
        return OffsetKt.Offset(fM842crossAxisk4lQ0M, fM843mainAxisk4lQ0M);
    }
}
