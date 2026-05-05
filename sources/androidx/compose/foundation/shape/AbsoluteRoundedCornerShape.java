package androidx.compose.foundation.shape;

import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Outline;
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
/* JADX INFO: compiled from: AbsoluteRoundedCornerShape.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯL\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4J\u0007\"B\u0012\u007fјnjO0LeV3Zݷ2\u000f\u0002{<$a%yCI^\"Ԃ*\t]Ȟo˧vJh\u0011KƤ\u000e\u0016\u0007v4կ]xs\u0012\u00172HpE8cڎm9\u000fsv(0608\u0012\u0005/\u001b:L\u001ex\u0013Cy\r\"4NsRR;N\u0015\u001e \nV /\u001f֔kNDM5\u0004H5;\u0003\u0018ĩ~+m7\u0015M;G\u0005+\u001b~y\u001eYAg9#.k\u00035S\fC\u0011I\n=3im;s\n\u0002bNX. E/]\u001aurTj5Un\u0013?+}r{T\u001c0\u0010z*\u001cl\b\u001c\u000f?H\\<Jj\u0016\u0018Kt!bpT\u0010nZ\u007f)r|+Ք~đڢ=\u001dlcoNa_E\u0010\u001d\rL81t/ql\u0010v\u0014Ik>Κ1\u001aFK`f\n\bV4\u00189h\u0010D\u001c0u\u001bu\u0010YE%AO[g@Ik0W\u000bgѱ\u0004_ŞR֟ʐLB(\r$VѪ\t\u0015bGjʯ\b~S`,\u0017lɥX'"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@38U\t \u0001I\u0013<WJKz4\u000b\u001fxj8\u0007b\nX\u00040GY</X]r\u0013", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@38U\t \u0001K ;VCHH0,\u0015gO<\u0003n,$", "Bn_\u0019X-M", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@38U\t \u0001K ;VCHY83\u0015>", "Bn_\u001f\\.Ab", "0ncAb4+W\u001b\u0002\n", "0ncAb4%S\u001a\u000e", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnC\\y+77s8ZL;x\"\"*h7 \u0003l+[\u0001+F_\u0018*fZ}G\"\u0012$\u000fX;\u0016\u0004UP(xM\u0001-\u000b(T\u0002\u0005F\u000b\u0019\u001f\u000eBXtWVe.u\u001etN3lEl)wQIPl8dU`'lC9 #u#$2^1\u0006\u0007SZP\\\u0007pgT\u0007~M$\u0014TWOD|_@s:hI\u0006\u007f\u001d<fttu7\u0014=)2s\tUpaLat ,&\u001f13?< -OxuB\u0002~", "1n_F", "Bn_ g(Kb", "Bn_\u0012a+", "0ncAb4\u001e\\\u0018", "0ncAb4,b\u0015\f\n", "1qT.g,(c(\u0006~g,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001fi\r';v\u0016\u0004", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "1qT.g,(c(\u0006~g,Do4S\u0015/m\u000b", "uI5\u00139\r%O\"}\bh0{\u001cxc\n0\u0007J\u000f\u0017`WsWL\u007f)D#d\u001cKw&=,GHk2-\u0019rj\u000fJJ(Wu4QPM?&P|E\u001f\u001ch\u000e\u0018;\u0011N[N yG;\u001d\u0016u3\u0012Jo\u0005\u0015\u0016c", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "BnA.W0Na", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u0013c\u000b)7z\u0003*LGKy\n", "BnA.W0Na`[\u00100)o\u00039", "uE\u0018\u0017", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AbsoluteRoundedCornerShape extends CornerBasedShape {
    public static final int $stable = 0;

    public AbsoluteRoundedCornerShape(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        super(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    /* JADX INFO: renamed from: createOutline-LjSzlW0 */
    public Outline mo1284createOutlineLjSzlW0(long j2, float f2, float f3, float f4, float f5, LayoutDirection layoutDirection) {
        if (f2 + f3 + f4 + f5 == 0.0f) {
            return new Outline.Rectangle(SizeKt.m4027toRectuvyYCjk(j2));
        }
        return new Outline.Rounded(RoundRectKt.m3989RoundRectZAM2FJo(SizeKt.m4027toRectuvyYCjk(j2), CornerRadiusKt.CornerRadius$default(f2, 0.0f, 2, null), CornerRadiusKt.CornerRadius$default(f3, 0.0f, 2, null), CornerRadiusKt.CornerRadius$default(f4, 0.0f, 2, null), CornerRadiusKt.CornerRadius$default(f5, 0.0f, 2, null)));
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    public AbsoluteRoundedCornerShape copy(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        return new AbsoluteRoundedCornerShape(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    public String toString() {
        return "AbsoluteRoundedCornerShape(topLeft = " + getTopStart() + ", topRight = " + getTopEnd() + ", bottomRight = " + getBottomEnd() + ", bottomLeft = " + getBottomStart() + ')';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbsoluteRoundedCornerShape)) {
            return false;
        }
        AbsoluteRoundedCornerShape absoluteRoundedCornerShape = (AbsoluteRoundedCornerShape) obj;
        return Intrinsics.areEqual(getTopStart(), absoluteRoundedCornerShape.getTopStart()) && Intrinsics.areEqual(getTopEnd(), absoluteRoundedCornerShape.getTopEnd()) && Intrinsics.areEqual(getBottomEnd(), absoluteRoundedCornerShape.getBottomEnd()) && Intrinsics.areEqual(getBottomStart(), absoluteRoundedCornerShape.getBottomStart());
    }

    public int hashCode() {
        return (((((getTopStart().hashCode() * 31) + getTopEnd().hashCode()) * 31) + getBottomEnd().hashCode()) * 31) + getBottomStart().hashCode();
    }

    /* JADX INFO: renamed from: toRadius-Bz7bX_o, reason: not valid java name */
    private final long m1288toRadiusBz7bX_o(float f2) {
        return CornerRadiusKt.CornerRadius$default(f2, 0.0f, 2, null);
    }
}
