package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaceKt;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.exifinterface.media.ExifInterface;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.dynatrace.android.agent.Global;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.UnsignedKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.ws.WebSocketProtocol;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: compiled from: Color.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4C\u0007\":\u0017\u007f\u0007lpA0ZeP.Xn2\u000fy\u0005<$a&yCI[\"}(\nWNusvJ`\rIƬD,ю\tdyU'\\J\u000ej\u0003|O7[oU9\u000fuȥ\t\"8$F|M\u000f(E`\u0010%\u007f\nſ\u0014ܘ4BvV`\u0016\u0016\u0013(/\u001e>N\u0006dչoߑ:Jr{H8k\u0011waf'\u000e5Cչ\u0015ТX)\u0013\u0017o'sNEV-%\u0002\bMҀcύ\u0007Aw_\u0013qo59l\fWdfFϴ\u001dۣS\u000fc\u00174mMjn1?+}Ҫ{T\u001c5\u0010z*\u001b˖\u0003\rϳ&ΞͶ1\u001cl.\u001cZ=.ahh\u0002\rۍ0\u0001g6%)\u00183Y>KlWaI.f7*\n=$)\u0001|3sT<eE!Zw_;i@kM\u0015\u000f֨<lׇoç͆.\u00066p\u000eYD)<B=7\neS'y/`F}u3_/\u061cjʐLB(\u001d$fr\u0017\u001a\u000b\\d3\u001d\u0017ՐW¯\u0015O\"\u0007\u00151P .\u0011\u0010<OZVbћlkp\u0004kAuGt;qn\u001a\u0013\u000e}5ڰ7Ʉg\u001aqT|\u001aMCz\u0007^nP\\\\rj2:2voF<RͱPܟ\u0017<Os\"?:81^\u001bT\u0011'\u0013Y\u000b\u0016wZ\u0017\u001e5\u0019\nɼ\u0005Ȑ(~\u0019\u0003Vk~v\u007fzO<\u000bqrEOcM\u0019TZX-\u000bò%ȷ\u0003}\u0010Im_US\u0005\u0018{i\n)f2GfG=A\u00145m\tĐ/։P|uSS(5\u0002\u0015{\u0015Rv78\u001fxpD`\u0019K؛Sϟɪu]ѓ'\u0010l\u007f\b{^|M{b$Ͼ=I\u0382\u0003bDQ>٪!M\u001d-\u0001uAŅ9f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "", "D`[BX", "\u001aj^A_0G\u001d\te\u0005g.R", "1n]@g9NQ(\t\b&0\u0005\u00146", "uI\u0018\u0017", "/k_5T", "", "5dc\u000e_7AOWz\u0004g6\f\u0005>i\n1\n", "u(E", "5dc\u000e_7AO`\u0003\u0003i3", "uI\u0018\u0013", "0kd2", "5dc\u000f_<>\u0012\u0015\b\u0004h;x\u00183o\t6", "5dc\u000f_<>\u001b\u001d\u0007\u0006e", "1n[<e\u001aIO\u0017~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005I>%\u001fuOD\u0003a,$", "5dc\u0010b3H`\u0007\nv\\,;\u00058n\n7wO\u0005! U", "5dc\u0010b3H`\u0007\nv\\,D\r7p\u0007", "uI\u0018\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`I|\nGy)3gG\u001eAt ;[N7i4grrhC\u0014Q7Jt'\u001d", "5qT2a", "5dc\u0014e,>\\Wz\u0004g6\f\u0005>i\n1\n", "5dc\u0014e,>\\`\u0003\u0003i3", "@dS", "5dc\u001fX+|O\"\b\u0005m(\f\r9n\u000e", "5dc\u001fX+\u0006W!\n\u0002", "5dc#T3NS`\rBO\u0012en\u001f", "u(9", "\u0018", "1n\\=b5>\\(J", "1n\\=b5>\\(JBb4\b\u0010", "1n\\=b5>\\(K", "1n\\=b5>\\(KBb4\b\u0010", "1n\\=b5>\\(L", "1n\\=b5>\\(LBb4\b\u0010", "1n\\=b5>\\(M", "1n\\=b5>\\(MBb4\b\u0010", "1n\\=b5>\\(N", "1n\\=b5>\\(NBb4\b\u0010", "1n]CX9M", "1n]CX9M\u001b*g\u000e;vM\u000f", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#{*>w#<X?9k}{\u001fokFtn(Lv|\u000b1", "1n_F", "1n_F >F?\u000b\u0014J\\", "uI5\u00139\r\u00028", "3pd._:", "", "=sW2e", "3pd._:\u0006W!\n\u0002", "uI;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "6`b566=S", "", "6`b566=S`\u0003\u0003i3", "uI\u0018\u0016", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uI\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "\u0011n\\=T5B]\"", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class Color {
    private final long value;
    public static final Companion Companion = new Companion(null);
    private static final long Black = ColorKt.Color(4278190080L);
    private static final long DarkGray = ColorKt.Color(4282664004L);
    private static final long Gray = ColorKt.Color(4287137928L);
    private static final long LightGray = ColorKt.Color(4291611852L);
    private static final long White = ColorKt.Color(4294967295L);
    private static final long Red = ColorKt.Color(4294901760L);
    private static final long Green = ColorKt.Color(4278255360L);
    private static final long Blue = ColorKt.Color(4278190335L);
    private static final long Yellow = ColorKt.Color(4294967040L);
    private static final long Cyan = ColorKt.Color(4278255615L);
    private static final long Magenta = ColorKt.Color(4294902015L);
    private static final long Transparent = ColorKt.Color(0);
    private static final long Unspecified = ColorKt.Color(0.0f, 0.0f, 0.0f, 0.0f, ColorSpaces.INSTANCE.getUnspecified$ui_graphics_release());

    /* JADX INFO: renamed from: box-impl */
    public static final /* synthetic */ Color m4168boximpl(long j2) {
        return new Color(j2);
    }

    /* JADX INFO: renamed from: constructor-impl */
    public static long m4174constructorimpl(long j2) {
        return j2;
    }

    /* JADX INFO: renamed from: equals-impl */
    public static boolean m4178equalsimpl(long j2, Object obj) {
        return (obj instanceof Color) && j2 == ((Color) obj).m4188unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0 */
    public static final boolean m4179equalsimpl0(long j2, long j3) {
        return ULong.m9161equalsimpl0(j2, j3);
    }

    public static /* synthetic */ void getAlpha$annotations() {
    }

    public static /* synthetic */ void getBlue$annotations() {
    }

    public static /* synthetic */ void getColorSpace$annotations() {
    }

    public static /* synthetic */ void getGreen$annotations() {
    }

    public static /* synthetic */ void getRed$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl */
    public static int m4185hashCodeimpl(long j2) {
        return ULong.m9166hashCodeimpl(j2);
    }

    public boolean equals(Object obj) {
        return m4178equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4185hashCodeimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl */
    public final /* synthetic */ long m4188unboximpl() {
        return this.value;
    }

    private /* synthetic */ Color(long j2) {
        this.value = j2;
    }

    /* JADX INFO: renamed from: getValue-s-VKNKU */
    public final long m4187getValuesVKNKU() {
        return this.value;
    }

    /* JADX INFO: renamed from: getColorSpace-impl */
    public static final ColorSpace m4182getColorSpaceimpl(long j2) {
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        return colorSpaces.getColorSpacesArray$ui_graphics_release()[(int) ULong.m9154constructorimpl(j2 & 63)];
    }

    /* JADX INFO: renamed from: convert-vNxB06k */
    public static final long m4175convertvNxB06k(long j2, ColorSpace colorSpace) {
        return ColorSpaceKt.m4597connectYBCOT_4$default(m4182getColorSpaceimpl(j2), colorSpace, 0, 2, null).mo4600transformToColorl2rxGTc$ui_graphics_release(j2);
    }

    /* JADX INFO: renamed from: getRed-impl */
    public static final float m4184getRedimpl(long j2) {
        int i2;
        int i3;
        if (ULong.m9154constructorimpl(63 & j2) == 0) {
            return ((float) UnsignedKt.ulongToDouble(ULong.m9154constructorimpl((-1) - (((-1) - ULong.m9154constructorimpl(j2 >>> 48)) | ((-1) - 255))))) / 255.0f;
        }
        long jM9154constructorimpl = ULong.m9154constructorimpl(j2 >>> 48);
        short sM9154constructorimpl = (short) ULong.m9154constructorimpl((jM9154constructorimpl + WebSocketProtocol.PAYLOAD_SHORT_MAX) - (jM9154constructorimpl | WebSocketProtocol.PAYLOAD_SHORT_MAX));
        int i4 = (Short.MIN_VALUE + sM9154constructorimpl) - (Short.MIN_VALUE | sM9154constructorimpl);
        int i5 = ((65535 + sM9154constructorimpl) - (65535 | sM9154constructorimpl)) >>> 10;
        int i6 = (i5 + 31) - (i5 | 31);
        int i7 = sM9154constructorimpl & 1023;
        if (i6 != 0) {
            i2 = i7 << 13;
            if (i6 == 31) {
                i3 = 255;
                if (i2 != 0) {
                    i2 = (-1) - (((-1) - i2) & ((-1) - 4194304));
                }
            } else {
                i3 = i6 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION;
            }
        } else {
            if (i7 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - Float16Kt.Fp32DenormalFloat;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((-1) - (((-1) - ((-1) - (((-1) - (i3 << 23)) & ((-1) - (i4 << 16))))) & ((-1) - i2)));
    }

    /* JADX INFO: renamed from: getGreen-impl */
    public static final float m4183getGreenimpl(long j2) {
        int i2;
        int i3;
        if (ULong.m9154constructorimpl(63 & j2) == 0) {
            long jM9154constructorimpl = ULong.m9154constructorimpl(j2 >>> 40);
            return ((float) UnsignedKt.ulongToDouble(ULong.m9154constructorimpl((jM9154constructorimpl + 255) - (jM9154constructorimpl | 255)))) / 255.0f;
        }
        long jM9154constructorimpl2 = ULong.m9154constructorimpl(j2 >>> 32);
        short sM9154constructorimpl = (short) ULong.m9154constructorimpl((jM9154constructorimpl2 + WebSocketProtocol.PAYLOAD_SHORT_MAX) - (jM9154constructorimpl2 | WebSocketProtocol.PAYLOAD_SHORT_MAX));
        int i4 = (Short.MIN_VALUE + sM9154constructorimpl) - (Short.MIN_VALUE | sM9154constructorimpl);
        int i5 = ((65535 + sM9154constructorimpl) - (65535 | sM9154constructorimpl)) >>> 10;
        int i6 = (i5 + 31) - (i5 | 31);
        int i7 = (-1) - (((-1) - sM9154constructorimpl) | ((-1) - 1023));
        if (i6 != 0) {
            i2 = i7 << 13;
            if (i6 == 31) {
                i3 = 255;
                if (i2 != 0) {
                    i2 |= 4194304;
                }
            } else {
                i3 = i6 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION;
            }
        } else {
            if (i7 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - Float16Kt.Fp32DenormalFloat;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        int i8 = i4 << 16;
        int i9 = i3 << 23;
        int i10 = (i9 + i8) - (i9 & i8);
        return Float.intBitsToFloat((i10 + i2) - (i10 & i2));
    }

    /* JADX INFO: renamed from: getBlue-impl */
    public static final float m4181getBlueimpl(long j2) {
        int i2;
        int i3;
        if (ULong.m9154constructorimpl((-1) - (((-1) - 63) | ((-1) - j2))) == 0) {
            long jM9154constructorimpl = ULong.m9154constructorimpl(j2 >>> 32);
            return ((float) UnsignedKt.ulongToDouble(ULong.m9154constructorimpl((jM9154constructorimpl + 255) - (jM9154constructorimpl | 255)))) / 255.0f;
        }
        short sM9154constructorimpl = (short) ULong.m9154constructorimpl((-1) - (((-1) - ULong.m9154constructorimpl(j2 >>> 16)) | ((-1) - WebSocketProtocol.PAYLOAD_SHORT_MAX)));
        int i4 = (-1) - (((-1) - 32768) | ((-1) - sM9154constructorimpl));
        int i5 = (((-1) - (((-1) - 65535) | ((-1) - sM9154constructorimpl))) >>> 10) & 31;
        int i6 = (sM9154constructorimpl + 1023) - (sM9154constructorimpl | 1023);
        if (i5 != 0) {
            i2 = i6 << 13;
            if (i5 == 31) {
                i3 = 255;
                if (i2 != 0) {
                    i2 = (-1) - (((-1) - i2) & ((-1) - 4194304));
                }
            } else {
                i3 = i5 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION;
            }
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - Float16Kt.Fp32DenormalFloat;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        int i7 = i4 << 16;
        int i8 = i3 << 23;
        int i9 = (i8 + i7) - (i8 & i7);
        return Float.intBitsToFloat((i9 + i2) - (i9 & i2));
    }

    /* JADX INFO: renamed from: getAlpha-impl */
    public static final float m4180getAlphaimpl(long j2) {
        float fUlongToDouble;
        float f2;
        if (ULong.m9154constructorimpl(63 & j2) == 0) {
            long jM9154constructorimpl = ULong.m9154constructorimpl(j2 >>> 56);
            fUlongToDouble = (float) UnsignedKt.ulongToDouble(ULong.m9154constructorimpl((jM9154constructorimpl + 255) - (jM9154constructorimpl | 255)));
            f2 = 255.0f;
        } else {
            long jM9154constructorimpl2 = ULong.m9154constructorimpl(j2 >>> 6);
            fUlongToDouble = (float) UnsignedKt.ulongToDouble(ULong.m9154constructorimpl((jM9154constructorimpl2 + 1023) - (jM9154constructorimpl2 | 1023)));
            f2 = 1023.0f;
        }
        return fUlongToDouble / f2;
    }

    /* JADX INFO: renamed from: component1-impl */
    public static final float m4169component1impl(long j2) {
        return m4184getRedimpl(j2);
    }

    /* JADX INFO: renamed from: component2-impl */
    public static final float m4170component2impl(long j2) {
        return m4183getGreenimpl(j2);
    }

    /* JADX INFO: renamed from: component3-impl */
    public static final float m4171component3impl(long j2) {
        return m4181getBlueimpl(j2);
    }

    /* JADX INFO: renamed from: component4-impl */
    public static final float m4172component4impl(long j2) {
        return m4180getAlphaimpl(j2);
    }

    /* JADX INFO: renamed from: component5-impl */
    public static final ColorSpace m4173component5impl(long j2) {
        return m4182getColorSpaceimpl(j2);
    }

    /* JADX INFO: renamed from: copy-wmQWz5c$default */
    public static /* synthetic */ long m4177copywmQWz5c$default(long j2, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((1 & i2) != 0) {
            f2 = m4180getAlphaimpl(j2);
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            f3 = m4184getRedimpl(j2);
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            f4 = m4183getGreenimpl(j2);
        }
        if ((i2 & 8) != 0) {
            f5 = m4181getBlueimpl(j2);
        }
        return m4176copywmQWz5c(j2, f2, f3, f4, f5);
    }

    /* JADX INFO: renamed from: copy-wmQWz5c */
    public static final long m4176copywmQWz5c(long j2, float f2, float f3, float f4, float f5) {
        return ColorKt.Color(f3, f4, f5, f2, m4182getColorSpaceimpl(j2));
    }

    public String toString() {
        return m4186toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: toString-impl */
    public static String m4186toStringimpl(long j2) {
        return "Color(" + m4184getRedimpl(j2) + ", " + m4183getGreenimpl(j2) + ", " + m4181getBlueimpl(j2) + ", " + m4180getAlphaimpl(j2) + ", " + m4182getColorSpaceimpl(j2).getName() + ')';
    }

    /* JADX INFO: compiled from: Color.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005J4\u0012\u0006\fnj?2Le^.ZS0\u0011s{B*c$wJA٬\u001b\u0014̝9O|f(sPZŲG\u000f\u0014\u0016A(:tmx\f\u0014?6P\u001cW3{\u001dm=n#N\u0005N_R<\b4\u0019\u001aXu@|\u0001CY<*0n\u001ejX\u0013M\u0013K*\u0006lRԮ\u001d[˚MȤՂp_@b172h\\\\w0+z=Jb]%v\u0010U[DEm-%\u000207Vix\u001b? j5l5aCI\"\u0005|XHQ#fg\r\ftV`\u0013}x\fUX\u007fgY~&(&(,\u0011J@&\u0006Uu^3 f\u0016>Kt!\u0001pV\b^P1\u0013adIՔ~2۸8ӕƻUcAV\\kD+\u001b\\;\u0001\u001dN\fX\u001c\u0017-\u001b\u0003/\u00025_xUH|7\nA{=\tb0W44U?G{?[]%\b}G$9k0JzkMݛbŞR֟˦G?̱r$?*\u0017\u0012jFj\byPlZ2\u0015[!%)\f\u000f+ \u000byr%{ĳPұgȉԍL\\ܦ)=n7gt{\u0010]Al3MSi\u0019oWG6MFz\u0005\u0007hxWbȟ^Ξ!ȭi\u000fȑ\u007fRV\f!8Os\"?:11^\u001bT\u0011#\u0013c\u000b\u0016wZ\u0017\u00125X\nɼ\u0005ɦ#ڏנ\u007fOʷt}oxW2\rb(;OQM\u001b,d0m\u0005\u001f1\u0017\u0017s.I\u001eP\u001eƊnخtɝߡ\u001f\u0015׀=_7=!\u0015\u000f+8\u0013;Edtkc[\u0017w\u001d\u000b\r';\u00170\u001e\fAѹ.Äi\u07ba؛S\u0016Ȕzlz#\u0016j\u0010{gZ\tG{V\u0011pLNC%gRf8+\u0007U\"{ˢqޫ{ކտB&ޗ\u001a\u0006\u001c/#gmkuE\bb'(z}\u0012148}{i]`=nM0ˢ@Ҧ#ЗŐAGܖ{\u0016J\tB\u0013CJG~~VPO\u0011J\fkWN\u001b\rn[h\u0015&\u0002\u000bʥaρrʕϘ\u0013]ǜ)\u001fUSus}Mb(X\u000f\"\r\u0002O|\u0017l_.uob72<wn݅CߞaŝĮ\b#Ҭ0J\u0010\u000bQZy\b\u0016\u001b\u000eFw\u0011\u001dSPx\fx\u001cv\u0011\\\u0005J;d\u001cǿ#Ț\u007fϓݩ2\u001dא9?\rmTZ?e8$a\u001d!\u001dps\rkuMRyQ\u001bVZ7\u000f\u001cؗEΫ\u0001ԍÜF(Թo}\u00148&\u0003-D\u001eAGQ)a|Wl\u0010&\u0007\\\r\u000f\u0012\u0015T\u0005&\u007fͮ|ֽ\rڳõ\u000e\nĢS\u0001wb;R^y=l(\u0001/F/1\u001a\u0002ݰF$5\t;ϥYwi\u001c'\u0002vŀ?>"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*D,s8UN7t8(\u001e>", "", "u(E", "\u0010kP0^", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "5dc\u000f_(<Y`Iy0&b\u000e\u001f${1\u0005J\u0010\u0013&Ky\u0017J", "5dc\u000f_(<Y`Iy0&b\u000e\u001f", "u(9", "\u0018", "\u0010kd2", "5dc\u000f_<>\u001bc}LX\u0012\u0002xma\t1\u0006O|&\u001bQx\u001c", "5dc\u000f_<>\u001bc}LX\u0012\u0002x", "\u0011xP;", "5dc\u0010l(G\u001bc}LX\u0012\u0002xma\t1\u0006O|&\u001bQx\u001c", "5dc\u0010l(G\u001bc}LX\u0012\u0002x", "\u0012`a8:9:g", "5dc\u0011T9D5&z\u000f&v{Z)K\u0005\u0018:<\n !Vk\u001d@\u0001.C", "5dc\u0011T9D5&z\u000f&v{Z)K\u0005\u0018", "\u0015qPF", "5dc\u0014e(R\u001bc}LX\u0012\u0002xma\t1\u0006O|&\u001bQx\u001c", "5dc\u0014e(R\u001bc}LX\u0012\u0002x", "\u0015qT2a", "5dc\u0014e,>\\`Iy0&b\u000e\u001f${1\u0005J\u0010\u0013&Ky\u0017J", "5dc\u0014e,>\\`Iy0&b\u000e\u001f", "\u001ahV5g\u000eKO-", "5dc\u0019\\.Abz\fvrsG\b\u0001_e-k~|  Q~\nKz/>g", "5dc\u0019\\.Abz\fvrsG\b\u0001_e-k", "\u001b`V2a;:", "5dc\u001aT.>\\(zB)+N\u0003\u0015jofwI\n!&C~\u0012F\u007f3", "5dc\u001aT.>\\(zB)+N\u0003\u0015jo", " dS", "5dc\u001fX+\u0006\u001e\u0018PtD1lG+n\t2\u000b<\u0010\u001b!P}", "5dc\u001fX+\u0006\u001e\u0018PtD1l", "\"qP;f7:`\u0019\b\n", "5dc!e(Ga$z\b^5\fPydQ\"aEpU\u0013Px\u0018Kr49c\u0007.", "5dc!e(Ga$z\b^5\fPydQ\"aEp", "#mb=X*BT\u001d~y", "5dc\"a:IS\u0017\u0003{b,{PydQ\"aEpU\u0013Px\u0018Kr49c\u0007.", "5dc\"a:IS\u0017\u0003{b,{PydQ\"aEp", "%gXAX", "5dc$[0MS`Iy0&b\u000e\u001f${1\u0005J\u0010\u0013&Ky\u0017J", "5dc$[0MS`Iy0&b\u000e\u001f", "'d[9b>", "5dc&X3E]+FE]}vn4U>$\u0005I\u000b&\u0013Vs\u0018E\u0005", "5dc&X3E]+FE]}vn4U", "6r[", "6tT", "", "A`cBe(MW#\b", ":hV5g5>a'", "/k_5T", "1n[<e\u001aIO\u0017~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005X6\u001bj", "6r[y=3'W\u007f\r|", "uE5\u00139\u0013:\\\u0018\f\u0005b+\u0010R-o\b3\u0006N\u0001`'K9\u0010Ir08]{.\u0001k 5WPIv0\u001c\u00152N;\u00049o3", "6r[!b\u0019@Pv\t\u0003i6\u0006\t8t", "<", "", "6", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, Global.COLON, "6re", "D`[BX", "6rey=3'W\u007f\r|", "6re!b\u0019@Pv\t\u0003i6\u0006\t8t", "D", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getBlack-0d7_KjU$annotations */
        public static /* synthetic */ void m4189getBlack0d7_KjU$annotations() {
        }

        /* JADX INFO: renamed from: getBlue-0d7_KjU$annotations */
        public static /* synthetic */ void m4190getBlue0d7_KjU$annotations() {
        }

        /* JADX INFO: renamed from: getCyan-0d7_KjU$annotations */
        public static /* synthetic */ void m4191getCyan0d7_KjU$annotations() {
        }

        /* JADX INFO: renamed from: getDarkGray-0d7_KjU$annotations */
        public static /* synthetic */ void m4192getDarkGray0d7_KjU$annotations() {
        }

        /* JADX INFO: renamed from: getGray-0d7_KjU$annotations */
        public static /* synthetic */ void m4193getGray0d7_KjU$annotations() {
        }

        /* JADX INFO: renamed from: getGreen-0d7_KjU$annotations */
        public static /* synthetic */ void m4194getGreen0d7_KjU$annotations() {
        }

        /* JADX INFO: renamed from: getLightGray-0d7_KjU$annotations */
        public static /* synthetic */ void m4195getLightGray0d7_KjU$annotations() {
        }

        /* JADX INFO: renamed from: getMagenta-0d7_KjU$annotations */
        public static /* synthetic */ void m4196getMagenta0d7_KjU$annotations() {
        }

        /* JADX INFO: renamed from: getRed-0d7_KjU$annotations */
        public static /* synthetic */ void m4197getRed0d7_KjU$annotations() {
        }

        /* JADX INFO: renamed from: getTransparent-0d7_KjU$annotations */
        public static /* synthetic */ void m4198getTransparent0d7_KjU$annotations() {
        }

        /* JADX INFO: renamed from: getUnspecified-0d7_KjU$annotations */
        public static /* synthetic */ void m4199getUnspecified0d7_KjU$annotations() {
        }

        /* JADX INFO: renamed from: getWhite-0d7_KjU$annotations */
        public static /* synthetic */ void m4200getWhite0d7_KjU$annotations() {
        }

        /* JADX INFO: renamed from: getYellow-0d7_KjU$annotations */
        public static /* synthetic */ void m4201getYellow0d7_KjU$annotations() {
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getBlack-0d7_KjU */
        public final long m4204getBlack0d7_KjU() {
            return Color.Black;
        }

        /* JADX INFO: renamed from: getDarkGray-0d7_KjU */
        public final long m4207getDarkGray0d7_KjU() {
            return Color.DarkGray;
        }

        /* JADX INFO: renamed from: getGray-0d7_KjU */
        public final long m4208getGray0d7_KjU() {
            return Color.Gray;
        }

        /* JADX INFO: renamed from: getLightGray-0d7_KjU */
        public final long m4210getLightGray0d7_KjU() {
            return Color.LightGray;
        }

        /* JADX INFO: renamed from: getWhite-0d7_KjU */
        public final long m4215getWhite0d7_KjU() {
            return Color.White;
        }

        /* JADX INFO: renamed from: getRed-0d7_KjU */
        public final long m4212getRed0d7_KjU() {
            return Color.Red;
        }

        /* JADX INFO: renamed from: getGreen-0d7_KjU */
        public final long m4209getGreen0d7_KjU() {
            return Color.Green;
        }

        /* JADX INFO: renamed from: getBlue-0d7_KjU */
        public final long m4205getBlue0d7_KjU() {
            return Color.Blue;
        }

        /* JADX INFO: renamed from: getYellow-0d7_KjU */
        public final long m4216getYellow0d7_KjU() {
            return Color.Yellow;
        }

        /* JADX INFO: renamed from: getCyan-0d7_KjU */
        public final long m4206getCyan0d7_KjU() {
            return Color.Cyan;
        }

        /* JADX INFO: renamed from: getMagenta-0d7_KjU */
        public final long m4211getMagenta0d7_KjU() {
            return Color.Magenta;
        }

        /* JADX INFO: renamed from: getTransparent-0d7_KjU */
        public final long m4213getTransparent0d7_KjU() {
            return Color.Transparent;
        }

        /* JADX INFO: renamed from: getUnspecified-0d7_KjU */
        public final long m4214getUnspecified0d7_KjU() {
            return Color.Unspecified;
        }

        /* JADX INFO: renamed from: hsv-JlNiLsg$default */
        public static /* synthetic */ long m4203hsvJlNiLsg$default(Companion companion, float f2, float f3, float f4, float f5, Rgb rgb, int i2, Object obj) {
            if ((8 & i2) != 0) {
                f5 = 1.0f;
            }
            if ((i2 + 16) - (i2 | 16) != 0) {
                rgb = ColorSpaces.INSTANCE.getSrgb();
            }
            return companion.m4218hsvJlNiLsg(f2, f3, f4, f5, rgb);
        }

        /* JADX INFO: renamed from: hsv-JlNiLsg */
        public final long m4218hsvJlNiLsg(float f2, float f3, float f4, float f5, Rgb rgb) {
            if (!(0.0f <= f2 && f2 <= 360.0f && 0.0f <= f3 && f3 <= 1.0f && 0.0f <= f4 && f4 <= 1.0f)) {
                InlineClassHelperKt.throwIllegalArgumentException("HSV (" + f2 + ", " + f3 + ", " + f4 + ") must be in range (0..360, 0..1, 0..1)");
            }
            return ColorKt.Color(hsvToRgbComponent(5, f2, f3, f4), hsvToRgbComponent(3, f2, f3, f4), hsvToRgbComponent(1, f2, f3, f4), f5, rgb);
        }

        private final float hsvToRgbComponent(int i2, float f2, float f3, float f4) {
            float f5 = (i2 + (f2 / 60.0f)) % 6.0f;
            return f4 - ((f3 * f4) * Math.max(0.0f, Math.min(f5, Math.min(4 - f5, 1.0f))));
        }

        /* JADX INFO: renamed from: hsl-JlNiLsg$default */
        public static /* synthetic */ long m4202hslJlNiLsg$default(Companion companion, float f2, float f3, float f4, float f5, Rgb rgb, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
                f5 = 1.0f;
            }
            if ((i2 & 16) != 0) {
                rgb = ColorSpaces.INSTANCE.getSrgb();
            }
            return companion.m4217hslJlNiLsg(f2, f3, f4, f5, rgb);
        }

        /* JADX INFO: renamed from: hsl-JlNiLsg */
        public final long m4217hslJlNiLsg(float f2, float f3, float f4, float f5, Rgb rgb) {
            if (!(0.0f <= f2 && f2 <= 360.0f && 0.0f <= f3 && f3 <= 1.0f && 0.0f <= f4 && f4 <= 1.0f)) {
                InlineClassHelperKt.throwIllegalArgumentException("HSL (" + f2 + ", " + f3 + ", " + f4 + ") must be in range (0..360, 0..1, 0..1)");
            }
            return ColorKt.Color(hslToRgbComponent(0, f2, f3, f4), hslToRgbComponent(8, f2, f3, f4), hslToRgbComponent(4, f2, f3, f4), f5, rgb);
        }

        private final float hslToRgbComponent(int i2, float f2, float f3, float f4) {
            float f5 = (i2 + (f2 / 30.0f)) % 12.0f;
            return f4 - ((f3 * Math.min(f4, 1.0f - f4)) * Math.max(-1.0f, Math.min(f5 - 3, Math.min(9 - f5, 1.0f))));
        }
    }
}
