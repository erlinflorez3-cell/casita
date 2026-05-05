package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import java.util.List;
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
/* JADX INFO: compiled from: LazyLayoutMeasureScope.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&i\u0016DLш|\u0004O$8\u000bDB\u0007Ӭ4\u0012\u0006\rnʑA0ZeP.XT2\u000f\u0002{<$q$yCAU\"}0\u000eWNmivJp\u000bK\u000f\u001c\u0016\u0001j2P]xs\u0012\u0017˰HeU\u074c}ok8)\u001bD\u0005882:\n\u0005/\u001cXI@z\tFc\f@4ptHW%M3 X*ͽ\u001fҵɉ`iT=Vt&N=,\u001bipXO_^\b\u0014\"ѸS܋˼zc$7ND},3\\\u001b\u0007\u0001eg\u0003m\u007f\u0004\u001aڋ&&ɛH֕ɱ:Z\u0006##;\u0018$k{>\\3[\t\fU/\u0016xؘO\rÂv\u07beԫ\u0011>\n\u001d\u00148\u0011B;,~\b<F\u001dr\u0002T\u0017\u0017\u0081Aȕѐe8\u001d:\u000eIsM)}iai-v7*\u0018S3ƹ\u007f͙Ĳ_V\u0014x#1\u001d\f_Ji@kSv\n\bG4\u0019ψạò\b2M\u001a=\u0017YE%>O[g.Ik0V\u000b|ѱ\u0004_ŞR֟ʐLB(\u000b$Rr \u001as\\d3vxT\u00070WbʵS\u0006ś\u0007ʶء`yB=3-ʝNg\bԍL]܆%>n:_ˆ\b<VA^9TYe\u0016\u0001\u0001u݆C[ж\tW"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;6v#U\\[,JP|H\u0014g", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7[\u00148XC\u0011", ";dP@h9>", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016\u0004", "7mS2k", "", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ";dP@h9>\u001bc\u0005aj\t\t\u001b", "uH9u?1:d\u0015H\u000bm0\u0004R\u0016i\u000e7Q", "Bn3=", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9|<\n4%b\u0002/\r", "Bn3= \u000e:<d]n:", "uI\u0018\u0013", "", "Bn3= <\u000bc#ljF", "uE\u0018\u0013", "uH\u0018\u0013", "Bn3=F0SS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGd)JYS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "Bn3=F0SS`\u0005Bk-my\u0017", "uI\u0018\u0017", "BnB6m,", "BnB6m,\u0006F\u001fzlG\u001bh", "BnB=", "BnB= vQ;\tNyh", "uE\u0018\u0017", "BnB= 2)he`\u000f-", "uH\u0018\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;6v#U\\[,JP|H\u0014ub\u0019U\u0001", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface LazyLayoutMeasureScope extends MeasureScope {
    /* JADX INFO: renamed from: measure-0kLqBqw, reason: not valid java name */
    List<Placeable> mo1189measure0kLqBqw(int i2, long j2);

    @Override // androidx.compose.ui.unit.FontScaling
    /* JADX INFO: renamed from: toDp-GaN1DYA */
    default float mo705toDpGaN1DYA(long j2) {
        if (!TextUnitType.m6859equalsimpl0(TextUnit.m6830getTypeUIouoOA(j2), TextUnitType.Companion.m6864getSpUIouoOA())) {
            throw new IllegalStateException("Only Sp can convert to Px".toString());
        }
        return Dp.m6638constructorimpl(TextUnit.m6831getValueimpl(j2) * getFontScale());
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    default float mo707toDpu2uoSUM(int i2) {
        return Dp.m6638constructorimpl(i2 / getDensity());
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    default float mo706toDpu2uoSUM(float f2) {
        return Dp.m6638constructorimpl(f2 / getDensity());
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    default long mo713toSpkPz2Gy4(float f2) {
        return TextUnitKt.getSp(f2 / (getFontScale() * getDensity()));
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    default long mo714toSpkPz2Gy4(int i2) {
        return TextUnitKt.getSp(i2 / (getFontScale() * getDensity()));
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* JADX INFO: renamed from: toSp-0xMU5do */
    default long mo712toSp0xMU5do(float f2) {
        return TextUnitKt.getSp(f2 / getFontScale());
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSize-XkaWNTQ */
    default long mo711toSizeXkaWNTQ(long j2) {
        return j2 != InlineClassHelperKt.UnspecifiedPackedFloats ? SizeKt.Size(mo710toPx0680j_4(DpSize.m6736getWidthD9Ej5fM(j2)), mo710toPx0680j_4(DpSize.m6734getHeightD9Ej5fM(j2))) : Size.Companion.m4014getUnspecifiedNHjbRc();
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDpSize-k-rfVVM */
    default long mo708toDpSizekrfVVM(long j2) {
        return j2 != InlineClassHelperKt.UnspecifiedPackedFloats ? DpKt.m6660DpSizeYgX7TsA(mo706toDpu2uoSUM(Size.m4006getWidthimpl(j2)), mo706toDpu2uoSUM(Size.m4003getHeightimpl(j2))) : DpSize.Companion.m6745getUnspecifiedMYxV2XQ();
    }
}
