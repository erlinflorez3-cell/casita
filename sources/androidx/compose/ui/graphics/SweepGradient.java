package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import java.util.List;
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
/* JADX INFO: compiled from: Brush.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯN\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\r@4\u0012\u000e\u0007nʑA0RjP.XT2\u000f\u0002{<$q$yّCU0}*\tUOog|SbŏK\u000f\u0014ǝ\u0001̓4Ic~e܈\u00172P{G\u074cStSʠ\u0011td\u0004`_(\u0600\n\t\u000f\u001aBH>w\u000bMY\u000e*6PrJR;Q3\u001d\"\u0014D \u000f#to^8Xl\f@E\"1lŌR'm7Ei\u001bOl+;\u0001J\u001e\nKg9#1k\u00035_\"Sǚ>мݘ\tj-59X<hDh\u0018\u0014C<\u007f\u0013k\u0005>^\u001bP\u000f\u001fm˚O,Q^\"@w)\u0011SPL\u0014\u0014=`.[1-\u001c^G\u0003rk@~\u00035ې\u0002Ҧ`ا҆$~Ĵ/;#f_i\f+\\9\u0014\u000b\u001d 3\u0001\u001d%\nWd֮\u0017ôXwYĸ\"TKMf\u0012i?}\u0004\u001fh\u0018)23\u001eČ1ɨ\u0015.\u001f¦ڞ[B+$qɗdrf~\u0005f\b\u05eemj"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#k} BO#*LG;tCs", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y\u001f7zr;]Q>A", "1d]AX9", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "1n[<e:", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "As^=f", "", "uI;7T=:\u001d)\u000e~euc\r=tU\u000f\u0001<\u0012\u0013`W~\u0012C@\f9g\ru\u001es =TGD59/\u001d2eB\u0016c9Wr.\u0011+N-XbyLq\u001cc\u001c]8\u001d\u0003hK1V@D%\b9\u001fE,", "\u0018", "1qT.g,,V\u0015}zk", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0016~<\u007f\u0017$\u001d", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y\u001f7zk", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "1qT.g,,V\u0015}zks\r\u001aCY]-\u0002", "uI\u0018\u0019T5=`#\u0003y(.\n\u0005:h\u0004&\n\nn\u001a\u0013Fo\u001b\u0012", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SweepGradient extends ShaderBrush {
    private final long center;
    private final List<Color> colors;
    private final List<Float> stops;

    public /* synthetic */ SweepGradient(long j2, List list, List list2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, list, list2);
    }

    public /* synthetic */ SweepGradient(long j2, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, list, (-1) - (((-1) - i2) | ((-1) - 4)) != 0 ? null : list2, null);
    }

    private SweepGradient(long j2, List<Color> list, List<Float> list2) {
        this.center = j2;
        this.colors = list;
        this.stops = list2;
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    /* JADX INFO: renamed from: createShader-uvyYCjk */
    public Shader mo4147createShaderuvyYCjk(long j2) {
        long jOffset;
        if (OffsetKt.m3958isUnspecifiedk4lQ0M(this.center)) {
            jOffset = SizeKt.m4016getCenteruvyYCjk(j2);
        } else {
            jOffset = OffsetKt.Offset(Offset.m3937getXimpl(this.center) == Float.POSITIVE_INFINITY ? Size.m4006getWidthimpl(j2) : Offset.m3937getXimpl(this.center), Offset.m3938getYimpl(this.center) == Float.POSITIVE_INFINITY ? Size.m4003getHeightimpl(j2) : Offset.m3938getYimpl(this.center));
        }
        return ShaderKt.m4497SweepGradientShader9KIMszo(jOffset, this.colors, this.stops);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SweepGradient)) {
            return false;
        }
        SweepGradient sweepGradient = (SweepGradient) obj;
        return Offset.m3934equalsimpl0(this.center, sweepGradient.center) && Intrinsics.areEqual(this.colors, sweepGradient.colors) && Intrinsics.areEqual(this.stops, sweepGradient.stops);
    }

    public int hashCode() {
        int iM3939hashCodeimpl = ((Offset.m3939hashCodeimpl(this.center) * 31) + this.colors.hashCode()) * 31;
        List<Float> list = this.stops;
        return iM3939hashCodeimpl + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "SweepGradient(" + (OffsetKt.m3956isSpecifiedk4lQ0M(this.center) ? "center=" + ((Object) Offset.m3945toStringimpl(this.center)) + ", " : "") + "colors=" + this.colors + ", stops=" + this.stops + ')';
    }
}
