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
@Metadata(bv = {}, d1 = {"ЯX\u001d<K!&i\u0016DLш|\u0004O$8\u000bDB\u0007Ӭ4\u0012\u0006\fnʑA0ZeP.XS2\u000f\u0002{<$a%yCQU\"}(\u000bWN}gvJp\u000bK\u000f\f\u0018\u0001j:R]ތe\u0012\u001d˰JģG3[uEʠhtD\u0011(݅(=\u0010ڎ1\u001aXGP6\u0001ŏ[\u0016 0XvJT\u001dM3\u001c@\u0007N.\u0007\u001ejjf>Xnm:]'\u0019hpO7c>\u0002e\rtZ7\u0011\u0005h6+n;E\u001b+S\u0011\u000fj[m\fӭu=\u0013roC9Z\f[djh\u0014s>\u007f\u0011k\u0007>\\3^' ̥*ՒӍOR\u0014=\u0006\u0011D\u001eJ\u001b&\u0006U`^3(\u007f \u0010Is!m\u0007Ч\u0002'H\u000e\u0016y6EAFGs?)\u0004iai7\u0015KL\u0019\u001b#;\u0001\u001d'2٭\u0010ؤ\u0014ÑȑvPśUBEH\\\u0015*O{\u0004\th\u0012,\u00140u\u0002]|gч\u0019É;[A\u05faq\u0004\u0010T\\g%\u0012\u0017=*ֶTΫ?̎Ļ\u00156Ҋ\r\u0010rFj\u0013y_%d:\u0018e\u001c\u0003\u000bTܴ\u0015ء`wDƙu$\\R\u0001qzOm\nS3|6\boBސYߍb3=ȡ4$oZ\u000f\u0014mE9ڶZۡAͭ݇Y[͈&4Pj\u001e\bӾDW\u0014\u00168Ə\u000eJ341\u001f{ĒL\""}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\"U|$3tw;IB?k=-j", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y\u001f7zr;]Q>A", "1n[<e:", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "As^=f", "", "1d]AX9", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "@`S6h:", "Bh[2@6=S", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n$]\u0005 \u001fw\u0015.#", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;f-wQ|`'Vs\u0015\u0006])ChS\u0005\u0018Q|4WRBo=g\u001ayi\u0003\u000bl;N\u00040CS\u0018\u000b\\SnM\u001b!8\u0018W9\u001c\u0012i?3xQ\u001f\u001b\u00152I\u000f\u0011,q", "\u0018", "7mc?\\5LW\u0017l~s,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "5dc\u0016a;KW\"\r~\\\u001a\u0001\u001e/-h\u000bCE}\u0004\u0015", "u(9", "\u0017", "1qT.g,,V\u0015}zk", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0016~<\u007f\u0017$\u001d", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y\u001f7zk", "Ahi2", "1qT.g,,V\u0015}zks\r\u001aCY]-\u0002", "uI\u0018\u0019T5=`#\u0003y(.\n\u0005:h\u0004&\n\nn\u001a\u0013Fo\u001b\u0012", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class RadialGradient extends ShaderBrush {
    private final long center;
    private final List<Color> colors;
    private final float radius;
    private final List<Float> stops;
    private final int tileMode;

    public /* synthetic */ RadialGradient(List list, List list2, long j2, float f2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, j2, f2, i2);
    }

    public /* synthetic */ RadialGradient(List list, List list2, long j2, float f2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i3 + 2) - (2 | i3) != 0 ? null : list2, j2, f2, (i3 + 16) - (i3 | 16) != 0 ? TileMode.Companion.m4551getClamp3opZhB0() : i2, null);
    }

    private RadialGradient(List<Color> list, List<Float> list2, long j2, float f2, int i2) {
        this.colors = list;
        this.stops = list2;
        this.center = j2;
        this.radius = f2;
        this.tileMode = i2;
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public long mo4126getIntrinsicSizeNHjbRc() {
        float f2 = this.radius;
        if (Float.isInfinite(f2) || Float.isNaN(f2)) {
            return Size.Companion.m4014getUnspecifiedNHjbRc();
        }
        float f3 = this.radius;
        float f4 = 2;
        return SizeKt.Size(f3 * f4, f3 * f4);
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    /* JADX INFO: renamed from: createShader-uvyYCjk */
    public Shader mo4147createShaderuvyYCjk(long j2) {
        float fM4006getWidthimpl;
        float fM4003getHeightimpl;
        if (OffsetKt.m3958isUnspecifiedk4lQ0M(this.center)) {
            long jM4016getCenteruvyYCjk = SizeKt.m4016getCenteruvyYCjk(j2);
            fM4006getWidthimpl = Offset.m3937getXimpl(jM4016getCenteruvyYCjk);
            fM4003getHeightimpl = Offset.m3938getYimpl(jM4016getCenteruvyYCjk);
        } else {
            fM4006getWidthimpl = Offset.m3937getXimpl(this.center) == Float.POSITIVE_INFINITY ? Size.m4006getWidthimpl(j2) : Offset.m3937getXimpl(this.center);
            fM4003getHeightimpl = Offset.m3938getYimpl(this.center) == Float.POSITIVE_INFINITY ? Size.m4003getHeightimpl(j2) : Offset.m3938getYimpl(this.center);
        }
        List<Color> list = this.colors;
        List<Float> list2 = this.stops;
        long jOffset = OffsetKt.Offset(fM4006getWidthimpl, fM4003getHeightimpl);
        float fM4005getMinDimensionimpl = this.radius;
        if (fM4005getMinDimensionimpl == Float.POSITIVE_INFINITY) {
            fM4005getMinDimensionimpl = Size.m4005getMinDimensionimpl(j2) / 2;
        }
        return ShaderKt.m4495RadialGradientShader8uybcMk(jOffset, fM4005getMinDimensionimpl, list, list2, this.tileMode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RadialGradient)) {
            return false;
        }
        RadialGradient radialGradient = (RadialGradient) obj;
        return Intrinsics.areEqual(this.colors, radialGradient.colors) && Intrinsics.areEqual(this.stops, radialGradient.stops) && Offset.m3934equalsimpl0(this.center, radialGradient.center) && this.radius == radialGradient.radius && TileMode.m4547equalsimpl0(this.tileMode, radialGradient.tileMode);
    }

    public int hashCode() {
        int iHashCode = this.colors.hashCode() * 31;
        List<Float> list = this.stops;
        return ((((((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + Offset.m3939hashCodeimpl(this.center)) * 31) + Float.hashCode(this.radius)) * 31) + TileMode.m4548hashCodeimpl(this.tileMode);
    }

    public String toString() {
        String str = "";
        String str2 = OffsetKt.m3956isSpecifiedk4lQ0M(this.center) ? "center=" + ((Object) Offset.m3945toStringimpl(this.center)) + ", " : "";
        float f2 = this.radius;
        if (!Float.isInfinite(f2) && !Float.isNaN(f2)) {
            str = "radius=" + this.radius + ", ";
        }
        return "RadialGradient(colors=" + this.colors + ", stops=" + this.stops + ", " + str2 + str + "tileMode=" + ((Object) TileMode.m4549toStringimpl(this.tileMode)) + ')';
    }
}
