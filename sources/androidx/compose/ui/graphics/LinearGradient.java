package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
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
@Metadata(bv = {}, d1 = {"ЯX\u001d<K!&i\u0016DLш|\u0004O$8\u000bDB\u0007Ӭ4\u0012\u0006\fnʑA0ZeP.XS2\u000f\u0002{<$a%yCQU\"}(\u000bWN}gvJp\u000bK\u000f\f\u0018\u0001j:R]ތe\u0012\u001d˰JģG3[uEʠhtD\u0011(݅(=\u0010ڎ1\u001aXGP6\u0001ŏ[\u0016 0XvJT\u001dM3\u001c@\u0007N.\u0007\u001ejjf>Xnm:]'\u0019hpO7c>\u0002e\rtZ7\u0011\u0005h6+n=E\u001b+S\u0011\u000fj[m\fӭu=\u0013roC9Z\f[djh\u0014s>\u007f\u0011k\u0007>\\3^' ̥*ՒӍOR\u0014=\u0006\u0011D\u001eJ\u001b&\u0006U`^3(\u007f \u0010Is!m\u0007Ч\u0002'H\u000e\u0016y6EAFGs?)\u0004iai7\u0015KL\u0017\u001b\u001e;\u0007~#kT<bC\u001c+ȰSśU@Eʰ\u001f\u001egD\u0006\u0004\u001fhXÒ\u0006ϻFĉôz\u0010ѧ\u001b'?[G.q\u0004\u0010T\\g%\u0012\u0017=*ֶTΫ?̎Ļ\u00156Ҋ\r\u0010rFj\u0013y_%l:\u0016e\u001c\u0003\rTܴ\u0015ٷ[ɼ͌ $ŎRQpixX.\u001e32~?ip{\u000e\u0006=t2cR:߇c؏z\u0014Gֺ3\u0019fnZS:c3̨$ŮGКߑvzΌR\u000e\u001b2M\u0002ʌ459\u001cbċd1\u001dJA\u0003(މ^\b"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001c]\u0007 3zw;IB?k=-j", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y\u001f7zr;]Q>A", "1n[<e:", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "As^=f", "", "AsP?g", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "3mS", "Bh[2@6=S", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n$]\u0005 \u001fw\u0015.#", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;f-wQ|`'Vs\u0015\u0006])ChS\u0005\u001cQ|4WRBo=g\u001ayi\u0003\u000bl;N\u00040CS\u0018\u000b\\SnM\u001b!8\u0018W9\u001c\u0012i?3xQ\u001f\u001b\u00152I\u000f\u0011,q", "\u0018", "7mc?\\5LW\u0017l~s,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "5dc\u0016a;KW\"\r~\\\u001a\u0001\u001e/-h\u000bCE}\u0004\u0015", "u(9", "\u0017", "1qT.g,,V\u0015}zk", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0016~<\u007f\u0017$\u001d", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y\u001f7zk", "Ahi2", "1qT.g,,V\u0015}zks\r\u001aCY]-\u0002", "uI\u0018\u0019T5=`#\u0003y(.\n\u0005:h\u0004&\n\nn\u001a\u0013Fo\u001b\u0012", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LinearGradient extends ShaderBrush {
    private final List<Color> colors;
    private final long end;
    private final long start;
    private final List<Float> stops;
    private final int tileMode;

    public /* synthetic */ LinearGradient(List list, List list2, long j2, long j3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, j2, j3, i2);
    }

    public /* synthetic */ LinearGradient(List list, List list2, long j2, long j3, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (-1) - (((-1) - i3) | ((-1) - 2)) != 0 ? null : list2, j2, j3, (i3 + 16) - (i3 | 16) != 0 ? TileMode.Companion.m4551getClamp3opZhB0() : i2, null);
    }

    private LinearGradient(List<Color> list, List<Float> list2, long j2, long j3, int i2) {
        this.colors = list;
        this.stops = list2;
        this.start = j2;
        this.end = j3;
        this.tileMode = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    @Override // androidx.compose.ui.graphics.Brush
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo4126getIntrinsicSizeNHjbRc() {
        /*
            r4 = this;
            long r0 = r4.start
            float r1 = androidx.compose.ui.geometry.Offset.m3937getXimpl(r0)
            boolean r0 = java.lang.Float.isInfinite(r1)
            r2 = 2143289344(0x7fc00000, float:NaN)
            if (r0 != 0) goto L71
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L71
            long r0 = r4.end
            float r1 = androidx.compose.ui.geometry.Offset.m3937getXimpl(r0)
            boolean r0 = java.lang.Float.isInfinite(r1)
            if (r0 != 0) goto L71
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L71
            long r0 = r4.start
            float r3 = androidx.compose.ui.geometry.Offset.m3937getXimpl(r0)
            long r0 = r4.end
            float r0 = androidx.compose.ui.geometry.Offset.m3937getXimpl(r0)
            float r3 = r3 - r0
            float r3 = java.lang.Math.abs(r3)
        L37:
            long r0 = r4.start
            float r1 = androidx.compose.ui.geometry.Offset.m3938getYimpl(r0)
            boolean r0 = java.lang.Float.isInfinite(r1)
            if (r0 != 0) goto L6c
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L6c
            long r0 = r4.end
            float r1 = androidx.compose.ui.geometry.Offset.m3938getYimpl(r0)
            boolean r0 = java.lang.Float.isInfinite(r1)
            if (r0 != 0) goto L6c
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L6c
            long r0 = r4.start
            float r2 = androidx.compose.ui.geometry.Offset.m3938getYimpl(r0)
            long r0 = r4.end
            float r0 = androidx.compose.ui.geometry.Offset.m3938getYimpl(r0)
            float r2 = r2 - r0
            float r2 = java.lang.Math.abs(r2)
        L6c:
            long r0 = androidx.compose.ui.geometry.SizeKt.Size(r3, r2)
            return r0
        L71:
            r3 = r2
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.LinearGradient.mo4126getIntrinsicSizeNHjbRc():long");
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    /* JADX INFO: renamed from: createShader-uvyYCjk */
    public Shader mo4147createShaderuvyYCjk(long j2) {
        return ShaderKt.m4493LinearGradientShaderVjE6UOU(OffsetKt.Offset(Offset.m3937getXimpl(this.start) == Float.POSITIVE_INFINITY ? Size.m4006getWidthimpl(j2) : Offset.m3937getXimpl(this.start), Offset.m3938getYimpl(this.start) == Float.POSITIVE_INFINITY ? Size.m4003getHeightimpl(j2) : Offset.m3938getYimpl(this.start)), OffsetKt.Offset(Offset.m3937getXimpl(this.end) == Float.POSITIVE_INFINITY ? Size.m4006getWidthimpl(j2) : Offset.m3937getXimpl(this.end), Offset.m3938getYimpl(this.end) == Float.POSITIVE_INFINITY ? Size.m4003getHeightimpl(j2) : Offset.m3938getYimpl(this.end)), this.colors, this.stops, this.tileMode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinearGradient)) {
            return false;
        }
        LinearGradient linearGradient = (LinearGradient) obj;
        return Intrinsics.areEqual(this.colors, linearGradient.colors) && Intrinsics.areEqual(this.stops, linearGradient.stops) && Offset.m3934equalsimpl0(this.start, linearGradient.start) && Offset.m3934equalsimpl0(this.end, linearGradient.end) && TileMode.m4547equalsimpl0(this.tileMode, linearGradient.tileMode);
    }

    public int hashCode() {
        int iHashCode = this.colors.hashCode() * 31;
        List<Float> list = this.stops;
        return ((((((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + Offset.m3939hashCodeimpl(this.start)) * 31) + Offset.m3939hashCodeimpl(this.end)) * 31) + TileMode.m4548hashCodeimpl(this.tileMode);
    }

    public String toString() {
        return "LinearGradient(colors=" + this.colors + ", stops=" + this.stops + ", " + (OffsetKt.m3954isFinitek4lQ0M(this.start) ? "start=" + ((Object) Offset.m3945toStringimpl(this.start)) + ", " : "") + (OffsetKt.m3954isFinitek4lQ0M(this.end) ? "end=" + ((Object) Offset.m3945toStringimpl(this.end)) + ", " : "") + "tileMode=" + ((Object) TileMode.m4549toStringimpl(this.tileMode)) + ')';
    }
}
