package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
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
/* JADX INFO: compiled from: VisibilityThresholds.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яn\u001d̉=!,n\bDJc|\u0004W\u00068é6B\rD4\u0012\u000e\u0007nj?1Le^.ZS@\u000fs{:$c$\bCC٥\"}8\tWN}gvϺb\u000bY\u000f\u000e\u0016\u000fj4կ]xs\u0012\u00172XoG\u074cUoS9htL\u0005(݅*8\u0010\u0005\t\u001a@H\u0018͌\u0003CY\u0012\u001a0VpBR\u0013M%& ßV /\u001d3ɤ!ɇLleŽO/\u0011iZNU^\u0007Ū ϘJT/˙\u0017m,,X7c\u0017{و\u0005\u07baV[Gš_\u0018K\b\u0001;75Y{g6^\u0001$\u00151P;b\u0003(l\u0005\u007f_:+\u0002ՓeׂT\u00140»\u0013}\u0013B\u0012\u0015&:V6E\u001a\u0015\u001163#|\n\u0005г\u0006bZ\u0002\u0001lD#E\u0013A3Q\u001b\u0015S\n;G[m@˿\u0011\";\u0003t,ib.s##lw\u007f@y@kX\u0005NՒAq\u001crh\r8\u0015PZ\u000e7\u0014\u0011\\)M7\nLYeȠ\u0006L\\i|\u0010n|s|`PX\"\u001d+_*7\"\u0011\t\u0081\tohV^7\u001fd<g\u0015\u0006 \u0013Nt <O>F\u0013ћlm\u0003Oc\u00153I\u0007Jgv\u0004\u000e\u0006T\u00073cm\u001aTуVz,ABm\u0013u\u0007Ua\u0014r\\V@ZH\u0019/.@ΌR\u0010+4E|*TϢ5:"}, d2 = {"\u0012oE6f0;W \u0003\nr\u001b\u007f\u0016/s\u00032\u0003?", "", "\u001ewE6f0;W \u0003\nr\u001b\u007f\u0016/s\u00032\u0003?", "@dRAI0LW\u0016\u0003\u0002b;\u0011w2r\u007f6~J\b\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "Dhb6U0EW(\u0013ia9|\u00172o\u0007'c<\f", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fIw\b*a!EtE\u001e\"waF\\", "5dc#\\:BP\u001d\u0006~m@k\f<e\u000e+\u0006G\u007f~\u0013R", "u(;7T=:\u001d)\u000e~eud\u0005:;", "$hb6U0EW(\u0013ia9|\u00172o\u0007'", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|T\fWKFg=\"\u001fq7", "5dc#\\:BP\u001d\u0006~m@k\f<e\u000e+\u0006G\u007f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019\u0017Qw\u000eK\u00049~C~!Em%l+MCv0'\u0019rj\u000fJH", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/uK 6X?Do>'j", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019\u0017Qw\u000eK\u00049~F}\u001eF,s8UN7t8(\u001e>% \u0003l+[\u0001+F_\u0018*fZ}G\"\u0012$\u001eRt\u000f\u0005cI$}QKht,G\u0011\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 uK 6X?Do>'j", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019\u0017Qw\u000eK\u00049~G\u000257,s8UN7t8(\u001e>%\u001e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lG5\u0003?a\t\u001c@q 7#", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W\u001b\u0002c\u0013c\u0006+3v\u001a8V\u0019~L", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lG`&6g}/\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lG`&6g}/uK 6X?Do>'j", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W\u001b\u0002\u000f6Z\f F,s8UN7t8(\u001e>%\u001e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f F,s8UN7t8(\u001e>", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W \u007f4\u001fZ~.7|T\fWKFg=\"\u001fq7|k", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}^\u0015w\u001e9IL?u=s", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W \u007f4#]\u0013 uK 6X?Do>'j,F", "", "\u001aj^A_0G\u001d|\b\n\u001d\n\u0007\u0011:a\t,\u0006IV", "uKZ<g3B\\b\u0004\ffu\u0001\u0012>e\r1wGJz VM\u0018D\u0002!>]\b)!j\u001b.KR\u0011/\u0018", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class VisibilityThresholdsKt {
    private static final float DpVisibilityThreshold = 0.1f;
    private static final float PxVisibilityThreshold = 0.5f;
    private static final Rect rectVisibilityThreshold;
    private static final Map<TwoWayConverter<?, ?>, Float> visibilityThresholdMap;

    public static final int getVisibilityThreshold(IntCompanionObject intCompanionObject) {
        return 1;
    }

    static {
        Float fValueOf = Float.valueOf(0.5f);
        rectVisibilityThreshold = new Rect(0.5f, 0.5f, 0.5f, 0.5f);
        TwoWayConverter<Integer, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE);
        Float fValueOf2 = Float.valueOf(1.0f);
        TwoWayConverter<Dp, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(Dp.Companion);
        Float fValueOf3 = Float.valueOf(0.1f);
        visibilityThresholdMap = MapsKt.mapOf(TuplesKt.to(vectorConverter, fValueOf2), TuplesKt.to(VectorConvertersKt.getVectorConverter(IntSize.Companion), fValueOf2), TuplesKt.to(VectorConvertersKt.getVectorConverter(IntOffset.Companion), fValueOf2), TuplesKt.to(VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), Float.valueOf(0.01f)), TuplesKt.to(VectorConvertersKt.getVectorConverter(Rect.Companion), fValueOf), TuplesKt.to(VectorConvertersKt.getVectorConverter(Size.Companion), fValueOf), TuplesKt.to(VectorConvertersKt.getVectorConverter(Offset.Companion), fValueOf), TuplesKt.to(vectorConverter2, fValueOf3), TuplesKt.to(VectorConvertersKt.getVectorConverter(DpOffset.Companion), fValueOf3));
    }

    public static final long getVisibilityThreshold(IntOffset.Companion companion) {
        return IntOffsetKt.IntOffset(1, 1);
    }

    public static final long getVisibilityThreshold(Offset.Companion companion) {
        return OffsetKt.Offset(0.5f, 0.5f);
    }

    public static final long getVisibilityThreshold(DpOffset.Companion companion) {
        return DpKt.m6659DpOffsetYgX7TsA(getVisibilityThreshold(Dp.Companion), getVisibilityThreshold(Dp.Companion));
    }

    public static final long getVisibilityThreshold(Size.Companion companion) {
        return SizeKt.Size(0.5f, 0.5f);
    }

    public static final long getVisibilityThreshold(IntSize.Companion companion) {
        return IntSizeKt.IntSize(1, 1);
    }

    public static final Rect getVisibilityThreshold(Rect.Companion companion) {
        return rectVisibilityThreshold;
    }

    public static final Map<TwoWayConverter<?, ?>, Float> getVisibilityThresholdMap() {
        return visibilityThresholdMap;
    }

    public static final float getVisibilityThreshold(Dp.Companion companion) {
        return Dp.m6638constructorimpl(0.1f);
    }
}
