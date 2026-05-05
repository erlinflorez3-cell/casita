package androidx.compose.foundation.shape;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
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
/* JADX INFO: compiled from: CutCornerShape.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4F\u0007\"B\u0012\u007fјnjO0LeV3Zݷ2\u000f\u0002{<$a%yCI^\"Ԃ*\t]Ȟo˧vJh\u0011KƤ\u000e\u0016\u0007v4կ[}s܈?2pn\u007fV]sK9xtd\u0006060:\u0012\u0005/\u001b:L\u001ey\u0013Cy\r\"4NtRR;Nŋ\u001e\u0012\u0014Ch',b\u007fNdԟ\u001daH/;\u0003\u0018C~+m2\u0015M;G\u0005+\u001byy\u001eYAg9#)k\u00035S\"SK\u007f\u007fD\u001dhU/[M\u0002`NX.\u001eE/]\rurTg5Un\u000e?+}n{T\u001c+\u0010z*\u0018l\b\u001c\n?H\\8Jj\u0016\u001aKt!`\u0007dڕ]ۍȸ~c<%3\u000f{<G+~Q\u0010LITE\u000e\u001d\u000f4\"/\u0002gƓTVf#/lw\u007fF\u0018T\u0006N\\ q=\u001c\u001b7v̦*\t8J\u0006\u009d\u0018?-ϸ)O"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@38U\t \u0001K&=+MHt4+\u0003k]D\u00079", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@38U\t \u0001K ;VCHH0,\u0015gO<\u0003n,$", "Bn_ g(Kb", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@38U\t \u0001K ;VCHY83\u0015>", "Bn_\u0012a+", "0ncAb4\u001e\\\u0018", "0ncAb4,b\u0015\f\n", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnC\\y+77s8ZL;x\"\"*h7 \u0003l+[\u0001+F_\u0018*fZ}G\"\u0012$\u000fX;\u0016\u0004UP(xM\u0001-\u000b(T\u0002\u0005F\u000b\u0019\u001f\u000eBXtWVe.u\u001etN3lEl)wQIPl8dU`'lC9 #u#$2^1\u0006\u0007SZP\\\u0007pgT\u0007~M$\u0014TWOD|_@s:hI\u0006\u007f\u001d<fttu7\u0014=)2s\tUpaLat ,&\u001f13?< -OxuB\u0002~", "1n_F", "1qT.g,(c(\u0006~g,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001fi\r';v\u0016\u0004", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "1qT.g,(c(\u0006~g,Do4S\u0015/m\u000b", "uI5\u00139\r%O\"}\bh0{\u001cxc\n0\u0007J\u000f\u0017`WsWL\u007f)D#d\u001cKw&=,GHk2-\u0019rj\u000fJJ(Wu4QPM?&P|E\u001f\u001ch\u000e\u0018;\u0011N[N yG;\u001d\u0016u3\u0012Jo\u0005\u0015\u0016c", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class CutCornerShape extends CornerBasedShape {
    public static final int $stable = 0;

    public CutCornerShape(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        super(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    /* JADX INFO: renamed from: createOutline-LjSzlW0 */
    public Outline mo1284createOutlineLjSzlW0(long j2, float f2, float f3, float f4, float f5, LayoutDirection layoutDirection) {
        if (f2 + f3 + f5 + f4 == 0.0f) {
            return new Outline.Rectangle(SizeKt.m4027toRectuvyYCjk(j2));
        }
        Path Path = AndroidPath_androidKt.Path();
        float f6 = layoutDirection == LayoutDirection.Ltr ? f2 : f3;
        Path.moveTo(0.0f, f6);
        Path.lineTo(f6, 0.0f);
        if (layoutDirection == LayoutDirection.Ltr) {
            f2 = f3;
        }
        Path.lineTo(Size.m4006getWidthimpl(j2) - f2, 0.0f);
        Path.lineTo(Size.m4006getWidthimpl(j2), f2);
        float f7 = layoutDirection == LayoutDirection.Ltr ? f4 : f5;
        Path.lineTo(Size.m4006getWidthimpl(j2), Size.m4003getHeightimpl(j2) - f7);
        Path.lineTo(Size.m4006getWidthimpl(j2) - f7, Size.m4003getHeightimpl(j2));
        if (layoutDirection == LayoutDirection.Ltr) {
            f4 = f5;
        }
        Path.lineTo(f4, Size.m4003getHeightimpl(j2));
        Path.lineTo(0.0f, Size.m4003getHeightimpl(j2) - f4);
        Path.close();
        return new Outline.Generic(Path);
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    public CutCornerShape copy(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        return new CutCornerShape(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    public String toString() {
        return "CutCornerShape(topStart = " + getTopStart() + ", topEnd = " + getTopEnd() + ", bottomEnd = " + getBottomEnd() + ", bottomStart = " + getBottomStart() + ')';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutCornerShape)) {
            return false;
        }
        CutCornerShape cutCornerShape = (CutCornerShape) obj;
        return Intrinsics.areEqual(getTopStart(), cutCornerShape.getTopStart()) && Intrinsics.areEqual(getTopEnd(), cutCornerShape.getTopEnd()) && Intrinsics.areEqual(getBottomEnd(), cutCornerShape.getBottomEnd()) && Intrinsics.areEqual(getBottomStart(), cutCornerShape.getBottomStart());
    }

    public int hashCode() {
        return (((((getTopStart().hashCode() * 31) + getTopEnd().hashCode()) * 31) + getBottomEnd().hashCode()) * 31) + getBottomStart().hashCode();
    }
}
