package androidx.compose.ui.graphics;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import kotlin.Metadata;
import kotlin.jvm.internal.ShortCompanionObject;
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
/* JADX INFO: compiled from: Float16.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d̉=!,o\bDJi|\u0004O\u000b8\u000b4H\u0007\"B\u0012\u007f\u0007lkA0RmP.X^B\u001ey\u0010L$\n9\"GIk2}P\u0011\u0016ȟm\u007f}Xq#C=\u000eF|xDaU'rXƂ8Z\u0010MLeokJ\u0011xD\u001f82PI*\t\u000f5BH>\bAŏǰ\u000b۵ضDr@n\u001bj\u001d: $V //\rk\\P`l\fK_'\u0011\u0005ZNUpvŧת\fϿù+\u000f|\u0001,HXFC5=S1\u0006\u0003_M$Wqk\u001a/Ѫ-KU\u0002ɎNX.\u0013kۃ\"ոar.ؘ%]n\f?+}b\"ַ`߭{z\u0004Ȟ\\\u0010\u001c\u0007?H\\,pǔZԧ7tzԟ`\\\u0010`Z\u007f)`\rАwő7+Aӕ\u0007]o>1Nez[ٿpţ\u0005n)żt\u001an\u00193T&P\b҈\u0013ףLN\u0012ԯ]y\u0012uz\u0002X\u0003\u0007ϝR\u009e\u007f\u00116ϏECi?;!\u001a\u0001\u001fֶ:Л\t`pׅ\n^VG:nD?\u0001¡\u000eʑHd\rߘp`f5)MJS]åZ˙$\\\u007f˓A1\u001eXgh\u0018i$έ\\ɻ3f?ժ\u000fw\u001cbQ^a4(ҲbуVv\u001c̳\\n\u0013d~B\u0002\u000b1٥zϒ6Hrݘ\u0018\bR[$\u0013`>Hʌ\u0007Ϝ5\u0019déh\u000f,PY|7^1ӓbњX3,Ѱ\n0\u0003\u0018\u0019P\u000boF\u03a2Kͅ0|hõMO_E1&\u00043?ؗ~ɠ\u000b\u0001{\u007fUylUZ\u007f.u\u0004\rvډ\u001c\u07fcU1E\u0013\u001d\u0011Ǿ2\u00075HRȋ\u0002\u007fLɥ+\u001d"}, d2 = {"\u0014o \u000366FP\u001d\bz]", "", "\u0014o \u00038?I]\"~\u0004m\t\u0001\u0005=", "\u0014o \u00038?I]\"~\u0004m\u0014x\u00175", "\u0014o \u00038?I]\"~\u0004m\u0014x\u001c", "\u0014o \u00038?I]\"~\u0004m\u001a\u007f\r0t", "\u0014o \u0003F0@\\\u0001z\td", "\u0014o \u0003F0@\\\u0007\u0002~_;", "\u0014o \u0003F0@\\\u001d\u007f~\\(\u0006\b\u0017a\u000e.", "\u0014o\"~7,G]&\u0007ve\r\u0004\u0013+t", "", "\u0014o\"~7,G]&\u0007ve\u0014x\u000b3c", "\u0014o\"~8?I]\"~\u0004m\t\u0001\u0005=", "\u0014o\"~8?I]\"~\u0004m\u0014x\u00175", "\u0014o\"~8?I]\"~\u0004m\u001a\u007f\r0t", "\u0014o\"~D\u0015:<\u0001z\td", "\u0014o\"~F0@\\\u0007\u0002~_;", "\u0014o\"~F0@\\\u001d\u007f~\\(\u0006\b\u0017a\u000e.", "\u001cdV.g0OS\u0003\bz", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0016`\b\u001cF9f\u0004", "!", "\u001dmT", "4k^.g\u001bH6\u0015\u0006{", "", "4", "6`[3G6\u001fZ#z\n", "6", ";`g", "F", "G", ";`gy46,a\u0018`E", "uRBuF", ";h]", ";h]y46,a\u0018`E", "Bn2<`7:`\u0019ove<|", "D`[BX", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Float16Kt {
    private static final int Fp16Combined = 32767;
    private static final int Fp16ExponentBias = 15;
    private static final int Fp16ExponentMask = 31;
    private static final int Fp16ExponentMax = 31744;
    private static final int Fp16ExponentShift = 10;
    private static final int Fp16SignMask = 32768;
    private static final int Fp16SignShift = 15;
    private static final int Fp16SignificandMask = 1023;
    private static final int Fp32ExponentBias = 127;
    private static final int Fp32ExponentMask = 255;
    private static final int Fp32ExponentShift = 23;
    private static final int Fp32QNaNMask = 4194304;
    private static final int Fp32SignShift = 31;
    private static final int Fp32SignificandMask = 8388607;
    private static final short One = Float16.m4286constructorimpl(1.0f);
    private static final short NegativeOne = Float16.m4286constructorimpl(-1.0f);
    private static final int Fp32DenormalMagic = 1056964608;
    private static final float Fp32DenormalFloat = Float.intBitsToFloat(Fp32DenormalMagic);

    private static final int toCompareValue(short s2) {
        return (s2 + ShortCompanionObject.MIN_VALUE) - (s2 | ShortCompanionObject.MIN_VALUE) != 0 ? 32768 - ((-1) - (((-1) - s2) | ((-1) - 65535))) : (s2 + 65535) - (s2 | 65535);
    }

    public static final short floatToHalf(float f2) {
        int i2;
        int i3;
        int iFloatToRawIntBits = Float.floatToRawIntBits(f2);
        int i4 = iFloatToRawIntBits >>> 31;
        int i5 = iFloatToRawIntBits >>> 23;
        int i6 = (i5 + 255) - (i5 | 255);
        int i7 = (Fp32SignificandMask + iFloatToRawIntBits) - (Fp32SignificandMask | iFloatToRawIntBits);
        int i8 = 31;
        int i9 = 0;
        if (i6 == 255) {
            if (i7 != 0) {
                i3 = 512;
                i9 = i3;
            }
            i2 = (-1) - (((-1) - ((-1) - (((-1) - (i4 << 15)) & ((-1) - (i8 << 10))))) & ((-1) - i9));
        } else {
            int i10 = i6 - 112;
            if (i10 >= 31) {
                i8 = 49;
            } else if (i10 > 0) {
                i9 = i7 >> 13;
                if ((iFloatToRawIntBits + 4096) - (iFloatToRawIntBits | 4096) != 0) {
                    i2 = (((i10 << 10) | i9) + 1) | (i4 << 15);
                } else {
                    i8 = i10;
                }
            } else if (i10 >= -10) {
                int i11 = (8388608 | i7) >> (1 - i10);
                if ((4096 & i11) != 0) {
                    i11 += 8192;
                }
                i3 = i11 >> 13;
                i8 = 0;
                i9 = i3;
            } else {
                i8 = 0;
            }
            i2 = (-1) - (((-1) - ((-1) - (((-1) - (i4 << 15)) & ((-1) - (i8 << 10))))) & ((-1) - i9));
        }
        return (short) i2;
    }

    /* JADX INFO: renamed from: min-AoSsdG0, reason: not valid java name */
    public static final short m4325minAoSsdG0(short s2, short s3) {
        if (Float16.m4297isNaNimpl(s2) || Float16.m4297isNaNimpl(s3)) {
            return Float16.Companion.m4319getNaNslo4al4();
        }
        return Float16.m4284compareTo41bOqos(s2, s3) <= 0 ? s2 : s3;
    }

    /* JADX INFO: renamed from: max-AoSsdG0, reason: not valid java name */
    public static final short m4324maxAoSsdG0(short s2, short s3) {
        if (Float16.m4297isNaNimpl(s2) || Float16.m4297isNaNimpl(s3)) {
            return Float16.Companion.m4319getNaNslo4al4();
        }
        return Float16.m4284compareTo41bOqos(s2, s3) >= 0 ? s2 : s3;
    }

    public static final float halfToFloat(short s2) {
        int i2;
        int i3;
        int i4 = (-1) - (((-1) - 32768) | ((-1) - s2));
        int i5 = (((65535 + s2) - (65535 | s2)) >>> 10) & 31;
        int i6 = (s2 + Fp16SignificandMask) - (s2 | Fp16SignificandMask);
        if (i5 != 0) {
            i2 = i6 << 13;
            if (i5 == 31) {
                i3 = 255;
                if (i2 != 0) {
                    i2 = (i2 + 4194304) - (i2 & 4194304);
                }
            } else {
                i3 = i5 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION;
            }
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + Fp32DenormalMagic) - Fp32DenormalFloat;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((-1) - (((-1) - ((i3 << 23) | (i4 << 16))) & ((-1) - i2)));
    }
}
