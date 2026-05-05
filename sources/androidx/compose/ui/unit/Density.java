package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
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
/* JADX INFO: compiled from: Density.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u0016DLш|\u0004O\u000b8\u000b4E\u0007\":\u0018\u007f\u0007|jA0JeP.hS2\u000fq\u0001<$q$yCQU\"}(\u000eWN}gvJp\u000bK\u000f\f\u001b~PBկ\u0006x\f\u0011WFPuW3{ve9\u000f||\u001a܌1Ĳأ}\u0007\u0007#8RX\u000b\tIc\f@7hph]Sbơ\u0019ŇĂB\"\u0007*jt\u0017MVzu:]++ipOmtޗ{LЮEÖܮ\u0011xg-9P\u007fL#3k\u00035Z\u0004?1F8Rߔg&߉*ɞָ[8^\u000f\"&sc\u001bo\u000b&\u000b\u0018y`:;qdԣJִˎ,y\u0001\u0011\u001bRL\"\u0014>`.[\u001b\u000f\b<;;\b֘?АؿbD\u0006\u0013oF_9\u000eJC9Igyai$\u0015L\u009e\u0004ټ̷'\u0003t:inVj#6lw\u007fMy@ke\u0015\u001f\"Q{\"\tb0>,0u\u0013u\u0011ö-ϏÉ;]?B/\u0002J_R\b\u000f\u0005\u000fs{i\u0001I\u00077Ļ\u00156Ӡ\bȱʑHf\u000b\r^v!C\u001fm4T5\t0\u0013Nc>QȒ$\u000f̓NŖȬnOc+3R7Ogn\u0004\u000e\u0006:\u0015W\fɉeߧe\\\u0007\u0016E>p\bphHW\u001a_ۛ'\"øHy\u0018z\u0002\u038bj:\u0012:?w;<.78\u000b\u0014Ȧ\u0007B֔E}"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9nF\u007f4#Wy';v\u0018\u0004", "2d]@\\;R", "", "5dc\u0011X5LW(\u00139Z5\u0006\u0013>a\u000f,\u0006I\u000f", "u(E", "5dc\u0011X5LW(\u0013", "u(5", "@nd;W\u001bH>,", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "@nd;W\u001bH>,FE/~G\u000e)4", "uE\u0018\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9|<\n4%b\u0002/\r", "@nd;W\u001bH>,FBKxo\u0003\u007fo", "uI\u0018\u0016", "Bn3=", "Bn3= <\u000bc#ljF", "uE\u0018\u0013", "uH\u0018\u0013", "Bn3=F0SS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGd)JYS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "Bn3=F0SS`\u0005Bk-my\u0017", "uI\u0018\u0017", "Bn?E", "Bn?E v\u000f&c\u0004t-", "Bn?E s+ \fxKh", "uI\u0018\u0013", "BnA2V;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGc%3hS", "BnB6m,", "BnB6m,\u0006F\u001fzlG\u001bh", "BnB=", "BnB= 2)he`\u000f-", "uE\u0018\u0017", "uH\u0018\u0017", "Ch\u001cBa0MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface Density extends FontScaling {
    float getDensity();

    /* JADX INFO: compiled from: Density.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class DefaultImpls {
        public static /* synthetic */ void getDensity$annotations() {
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-GaN1DYA */
        public static float m6626toDpGaN1DYA(Density density, long j2) {
            return Density.super.mo705toDpGaN1DYA(j2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-0xMU5do */
        public static long m6633toSp0xMU5do(Density density, float f2) {
            return Density.super.mo712toSp0xMU5do(f2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toPx-0680j_4 */
        public static float m6631toPx0680j_4(Density density, float f2) {
            return Density.super.mo710toPx0680j_4(f2);
        }

        @Deprecated
        /* JADX INFO: renamed from: roundToPx-0680j_4 */
        public static int m6625roundToPx0680j_4(Density density, float f2) {
            return Density.super.mo704roundToPx0680j_4(f2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toPx--R2X_6o */
        public static float m6630toPxR2X_6o(Density density, long j2) {
            return Density.super.mo709toPxR2X_6o(j2);
        }

        @Deprecated
        /* JADX INFO: renamed from: roundToPx--R2X_6o */
        public static int m6624roundToPxR2X_6o(Density density, long j2) {
            return Density.super.mo703roundToPxR2X_6o(j2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM */
        public static float m6628toDpu2uoSUM(Density density, int i2) {
            return Density.super.mo707toDpu2uoSUM(i2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4 */
        public static long m6635toSpkPz2Gy4(Density density, int i2) {
            return Density.super.mo714toSpkPz2Gy4(i2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM */
        public static float m6627toDpu2uoSUM(Density density, float f2) {
            return Density.super.mo706toDpu2uoSUM(f2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4 */
        public static long m6634toSpkPz2Gy4(Density density, float f2) {
            return Density.super.mo713toSpkPz2Gy4(f2);
        }

        @Deprecated
        public static Rect toRect(Density density, DpRect dpRect) {
            return Density.super.toRect(dpRect);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSize-XkaWNTQ */
        public static long m6632toSizeXkaWNTQ(Density density, long j2) {
            return Density.super.mo711toSizeXkaWNTQ(j2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDpSize-k-rfVVM */
        public static long m6629toDpSizekrfVVM(Density density, long j2) {
            return Density.super.mo708toDpSizekrfVVM(j2);
        }
    }

    /* JADX INFO: renamed from: toPx-0680j_4 */
    default float mo710toPx0680j_4(float f2) {
        return f2 * getDensity();
    }

    /* JADX INFO: renamed from: roundToPx-0680j_4 */
    default int mo704roundToPx0680j_4(float f2) {
        float fMo710toPx0680j_4 = mo710toPx0680j_4(f2);
        if (Float.isInfinite(fMo710toPx0680j_4)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fMo710toPx0680j_4);
    }

    /* JADX INFO: renamed from: toPx--R2X_6o */
    default float mo709toPxR2X_6o(long j2) {
        if (!TextUnitType.m6859equalsimpl0(TextUnit.m6830getTypeUIouoOA(j2), TextUnitType.Companion.m6864getSpUIouoOA())) {
            throw new IllegalStateException("Only Sp can convert to Px".toString());
        }
        return mo710toPx0680j_4(mo705toDpGaN1DYA(j2));
    }

    /* JADX INFO: renamed from: roundToPx--R2X_6o */
    default int mo703roundToPxR2X_6o(long j2) {
        return Math.round(mo709toPxR2X_6o(j2));
    }

    /* JADX INFO: renamed from: toDp-u2uoSUM */
    default float mo707toDpu2uoSUM(int i2) {
        return Dp.m6638constructorimpl(i2 / getDensity());
    }

    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    default long mo714toSpkPz2Gy4(int i2) {
        return mo712toSp0xMU5do(mo707toDpu2uoSUM(i2));
    }

    /* JADX INFO: renamed from: toDp-u2uoSUM */
    default float mo706toDpu2uoSUM(float f2) {
        return Dp.m6638constructorimpl(f2 / getDensity());
    }

    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    default long mo713toSpkPz2Gy4(float f2) {
        return mo712toSp0xMU5do(mo706toDpu2uoSUM(f2));
    }

    default Rect toRect(DpRect dpRect) {
        return new Rect(mo710toPx0680j_4(dpRect.m6721getLeftD9Ej5fM()), mo710toPx0680j_4(dpRect.m6723getTopD9Ej5fM()), mo710toPx0680j_4(dpRect.m6722getRightD9Ej5fM()), mo710toPx0680j_4(dpRect.m6720getBottomD9Ej5fM()));
    }

    /* JADX INFO: renamed from: toSize-XkaWNTQ */
    default long mo711toSizeXkaWNTQ(long j2) {
        return j2 != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats ? SizeKt.Size(mo710toPx0680j_4(DpSize.m6736getWidthD9Ej5fM(j2)), mo710toPx0680j_4(DpSize.m6734getHeightD9Ej5fM(j2))) : Size.Companion.m4014getUnspecifiedNHjbRc();
    }

    /* JADX INFO: renamed from: toDpSize-k-rfVVM */
    default long mo708toDpSizekrfVVM(long j2) {
        return j2 != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats ? DpKt.m6660DpSizeYgX7TsA(mo706toDpu2uoSUM(Size.m4006getWidthimpl(j2)), mo706toDpu2uoSUM(Size.m4003getHeightimpl(j2))) : DpSize.Companion.m6745getUnspecifiedMYxV2XQ();
    }
}
