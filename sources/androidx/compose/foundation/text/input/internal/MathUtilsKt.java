package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: MathUtils.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d̉=!,o\bDJc|\u0004W\u00068é6B\r'4\u0012\u000e\u0007nʑA0ZeP.XZB0yڔL$\n#\u001aCiTJ\u00020\tgN\u0016f\u001fTh\f[\u0015\u0016\u0018\tjZH\u0004z$܉\u0015J^}BKM\u001eAa`#;5$@(Py3\b`*ѳ\u000f͌ټGM\u0012\u001a>I\t^`\u0017e\u0005H\u0011.>N\u0006N`uYNH\u001bdj31\u000f\u0002B|.&ܞǠLεТX)\u0013\u0004o,CaED-%\u0002\u0002/R\n>3C\u007f=\u001dhU&[S\u0002XN^\u0010\u0016%+}\f\ftlؙ\u000bĬ`\u0011/.Uӌg~\r߳{\u000b"}, d2 = {"/cS\u0012k(<b\u0003\fZe:|", "", "@hV5g", "2dU.h3MD\u0015\u0006\u000b^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "2hbAT5<S\u0007\u000b\u000bZ9|\b\u001eo]/\u0006N\u0001%&%y\u001bEv2\u0016f\b(!}%<QB;", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "@dRA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "2hbAT5<S\u0007\u000b\u000bZ9|\b\u001eo]/\u0006N\u0001%&%y\u001bEv2\u0016f\b(!}%<QB;3\u0002\u0006\u001dhI\n\r", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Gy\u0016<\u00062I#j 5|kq.", "4h]163Ha\u0019\r\nK,z\u0018", "@dRA$", "@dRA%", "4h]163Ha\u0019\r\nK,z\u0018v9e\fcN\u0016!", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Gy\u0016<\u00062I#j 5|k\u0015IL:x>\"\u0014{+7\u0011k7X\u0005'\u0011\\Ru^R|E\u0014!g\"\u0018\u0018\r\u0003h\u0017gR", "AtQAe(<bx\u0012v\\;f\u0016\u000fl\u000e(", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MathUtilsKt {
    public static final int addExactOrElse(int i2, int i3, Function0<Integer> function0) {
        int i4 = i2 + i3;
        int i5 = i2 ^ i4;
        int i6 = i3 ^ i4;
        return (i5 + i6) - (i5 | i6) < 0 ? function0.invoke().intValue() : i4;
    }

    public static final int subtractExactOrElse(int i2, int i3, Function0<Integer> function0) {
        int i4 = i2 - i3;
        int i5 = i3 ^ i2;
        int i6 = i2 ^ i4;
        return (i6 + i5) - (i6 | i5) < 0 ? function0.invoke().intValue() : i4;
    }

    /* JADX INFO: renamed from: findClosestRect-9KIMszo, reason: not valid java name */
    public static final int m1514findClosestRect9KIMszo(long j2, Rect rect, Rect rect2) {
        float fM1513distanceSquaredToClosestCornerFromOutside3MmeM6k = m1513distanceSquaredToClosestCornerFromOutside3MmeM6k(j2, rect);
        float fM1513distanceSquaredToClosestCornerFromOutside3MmeM6k2 = m1513distanceSquaredToClosestCornerFromOutside3MmeM6k(j2, rect2);
        if (fM1513distanceSquaredToClosestCornerFromOutside3MmeM6k == fM1513distanceSquaredToClosestCornerFromOutside3MmeM6k2) {
            return 0;
        }
        return fM1513distanceSquaredToClosestCornerFromOutside3MmeM6k < fM1513distanceSquaredToClosestCornerFromOutside3MmeM6k2 ? -1 : 1;
    }

    /* JADX INFO: renamed from: distanceSquaredToClosestCornerFromOutside-3MmeM6k, reason: not valid java name */
    private static final float m1513distanceSquaredToClosestCornerFromOutside3MmeM6k(long j2, Rect rect) {
        if (SelectionManagerKt.m1718containsInclusiveUv8p0NA(rect, j2)) {
            return 0.0f;
        }
        float fM3936getDistanceSquaredimpl = Offset.m3936getDistanceSquaredimpl(Offset.m3941minusMKHz9U(rect.m3972getTopLeftF1C5BW0(), j2));
        if (fM3936getDistanceSquaredimpl >= Float.MAX_VALUE) {
            fM3936getDistanceSquaredimpl = Float.MAX_VALUE;
        }
        float fM3936getDistanceSquaredimpl2 = Offset.m3936getDistanceSquaredimpl(Offset.m3941minusMKHz9U(rect.m3973getTopRightF1C5BW0(), j2));
        if (fM3936getDistanceSquaredimpl2 < fM3936getDistanceSquaredimpl) {
            fM3936getDistanceSquaredimpl = fM3936getDistanceSquaredimpl2;
        }
        float fM3936getDistanceSquaredimpl3 = Offset.m3936getDistanceSquaredimpl(Offset.m3941minusMKHz9U(rect.m3965getBottomLeftF1C5BW0(), j2));
        if (fM3936getDistanceSquaredimpl3 < fM3936getDistanceSquaredimpl) {
            fM3936getDistanceSquaredimpl = fM3936getDistanceSquaredimpl3;
        }
        float fM3936getDistanceSquaredimpl4 = Offset.m3936getDistanceSquaredimpl(Offset.m3941minusMKHz9U(rect.m3966getBottomRightF1C5BW0(), j2));
        return fM3936getDistanceSquaredimpl4 < fM3936getDistanceSquaredimpl ? fM3936getDistanceSquaredimpl4 : fM3936getDistanceSquaredimpl;
    }
}
