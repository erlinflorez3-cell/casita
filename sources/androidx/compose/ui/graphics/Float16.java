package androidx.compose.ui.graphics;

import androidx.compose.ui.layout.LayoutKt;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlin.text.CharsKt;
import kotlin.text.Regex;
import org.apache.commons.codec.language.Soundex;
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
/* JADX INFO: compiled from: Float16.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯP\u001d<K!&i\u000eQLш|\u0004O\u000b8\u000b4B\u0007\":\u0016\u007f\u0007ljA0RmP.XS2\u000fy\u0002<$a3yCI^\"}0ޛWNmyvJh\u000eK\u000f\f\u001d\u0001j:U]xc\u0015\u00172PvG3S|Cʢ\u001f\u000bȂ#pb(H{\u0015\u0001Hݒv\u000f/y\u0014\f\u001b\u0018DPtHR%M3\u001bŪ\n@&\u0003,_(]<\\|aH/;\u0003\u0018FĚ+a6~[\u0012\u0007a7\u0011\u0005g6+n>߱\u0019'Y\u0005\u0015Z$P\u0011R\n=3ؒӠ&*˗rɎ͏\\\u0002\u001a)9WUn\u0001;t\u0005\u007fӠѨ&*\u05cbb֟ח\u0012*}\u0011\n\u0015\u0005\u001d\u001c\u001d?H\\7Jj\u0016&Kt!ԟ\u0007Ч\u0002\u0081Aȕѐe8\u001d>\u000eMsQ)\u0002iai5~=\n\u001d% 9\u007f\u001d>\"ہ\u000f\u05ce\u0019\u001dZ\u0016_P\u001aQKhf\n\bƝҠ\u0003oŠ\u0001Ï˙4I\u0006P\n\u0019v%3Ys9Q+2ʌGזkx\u000b\u0004v_2]Vd:nDSҊ\r\u000e`ir+4[b\u007fD\u0011{8Τ\u000b\u007f\u000e;.\u0003@G/N(N}\u0005ȬnOc43U/Bg\u001a\u0004\u000e\u0006Uӷ77W\u0010\u001e\b\u001b\b\"lTb3֚ۡAR݇Y٢͈&4N\u0019\u001e\u007fDO\\;+2m{ʬ8.7Ij!\u0011\u000e,sY|7\u0012˖l\u0012\u0005\bAXKt2*!\u0001~`ʼsi~\u007f:4)-;yi5G'Ɓ&j:61AG~\u000e\u0003\u007fLu\t̡\u001aw[9.TbD_nU\u0013=\tȞ6\u00043\u0006Z~.\\[S?z+<ӛ?j4+\u0016/97n0bO\u0003!Ȕz`xi\u0016pH\u0005o\u000e\u0013G\u0012[ߏ_@O;\u0011a\u0005[FF\u001d\u001fLaG\u0004ݕ\u000173\u000e5[^\t\"z-a\fɐݩ-x̥\u000eծ܌i\u000620$w+gk\u007fS8wʲ/B03\u0005\u0003pוݬv٤ɚ\r6\u0013\u0002V\u00115\u007fdAe\u000b]\b\u001dKՐ\u0011tn]@\u001e}\n\u0005=m0\fC,\u001bڎG+\u0019\u07bdkiszYj[_\u001d\u0019#{_ޫH`\u07b4\u001f݈Ωa\bޘ\nw08GKp\r\r\u00182ED<6\u0015y\u0019Ɏ\n\u0014\u0013\u0002Lq\u001d#ϱAyĬV\u0017\\{bƩd3_M`'Iܩ\u0003`"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0016`\b\u001cF9f\u0004", "", "D`[BX", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uE\u0018 ", "", "uC\u0018 ", "6`[3I(Ec\u0019", "", "uR\u0018 ", "3w_<a,Gb", "", "5dc\u0012k7H\\\u0019\b\n&0\u0005\u00146", "uR\u0018\u0016", "5dc\u0015T3?D\u0015\u0006\u000b^", "u(B", "AhV;", "5dc \\.G\u001b'\u0006\u0005-(\u0004W", "AhV;\\-BQ\u0015\by", "5dc \\.GW\u001a\u0003xZ5{P3m\u000b/", "/ab<_<MS\nz\u0002n,", "/ab<_<MS\nz\u0002n,D\u00176oN$\u0003\u000f", "1dX9", "1dX9 :E]gz\u0002-", "1n\\=T9>B#", "=sW2e", "1n\\=T9>B#FI*)f\u00159s", "uRBu<", "3pd._:", "", "", "3pd._:\u0006W!\n\u0002", "uR;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "4k^<e", "4k^<esLZ#Mvez", "6`b566=S", "6`b566=S`\u0003\u0003i3", "7r56a0MS", "7r56a0MS`\u0003\u0003i3", "uR\u0018'", "7r8;Y0GW(~", "7r8;Y0GW(~Bb4\b\u0010", "7r=.A", "7r=.AsB[$\u0006", "7r=<e4:Z\u001d\u0014z]", "7r=<e4:Z\u001d\u0014z]s\u0001\u0011:l", "@nd;W", "@nd;WsLZ#Mvez", "Bn16g:", "Bn16g:\u0006W!\n\u0002", "Bn1Fg,", "", "Bn1Fg,\u0006W!\n\u0002", "uR\u0018\u000f", "Bn3<h)ES", "Bn3<h)ES`\u0003\u0003i3", "uR\u0018\u0011", "Bn59b(M", "Bn59b(M\u001b\u001d\u0007\u0006e", "uR\u0018\u0013", "Bn72k\u001aM`\u001d\b|", "", "Bn72k\u001aM`\u001d\b|&0\u0005\u00146", "uR\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "Bn8;g", "Bn8;gsB[$\u0006", "Bn;<a.", "", "Bn;<a.\u0006W!\n\u0002", "uR\u0018\u0017", "BnA.j\tBb'", "BnA.j\tBb'F~f7\u0004", "BnB5b9M", "BnB5b9M\u001b\u001d\u0007\u0006e", "BnBAe0GU", "BnBAe0GU`\u0003\u0003i3", "Bqd;V", "Bqd;VsLZ#Mvez", "Ehc5F0@\\", "Ehc5F0@\\`\u000bX^\u0018~\f1", "uRBuF", "\u0011n\\=T5B]\"", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class Float16 implements Comparable<Float16> {
    public static final int MaxExponent = 15;
    public static final int MinExponent = -14;
    public static final int Size = 16;
    private final short halfValue;
    public static final Companion Companion = new Companion(null);
    private static final short Epsilon = m4287constructorimpl((short) 5120);
    private static final short LowestValue = m4287constructorimpl((short) -1025);
    private static final short MaxValue = m4287constructorimpl((short) 31743);
    private static final short MinNormal = m4287constructorimpl((short) 1024);
    private static final short MinValue = m4287constructorimpl((short) 1);
    private static final short NaN = m4287constructorimpl((short) 32256);
    private static final short NegativeInfinity = m4287constructorimpl((short) -1024);
    private static final short NegativeZero = m4287constructorimpl(ShortCompanionObject.MIN_VALUE);
    private static final short PositiveInfinity = m4287constructorimpl((short) 31744);
    private static final short PositiveZero = m4287constructorimpl((short) 0);

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Float16 m4282boximpl(short s2) {
        return new Float16(s2);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static short m4287constructorimpl(short s2) {
        return s2;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m4288equalsimpl(short s2, Object obj) {
        return (obj instanceof Float16) && s2 == ((Float16) obj).m4313unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4289equalsimpl0(short s2, short s3) {
        return s2 == s3;
    }

    /* JADX INFO: renamed from: getExponent-impl, reason: not valid java name */
    public static final int m4291getExponentimpl(short s2) {
        return ((s2 >>> 10) & 31) - 15;
    }

    /* JADX INFO: renamed from: getSignificand-impl, reason: not valid java name */
    public static final int m4293getSignificandimpl(short s2) {
        return (s2 + 1023) - (s2 | 1023);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m4294hashCodeimpl(short s2) {
        return Short.hashCode(s2);
    }

    /* JADX INFO: renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m4295isFiniteimpl(short s2) {
        return (-1) - (((-1) - s2) | ((-1) - LayoutKt.LargeDimension)) != 31744;
    }

    /* JADX INFO: renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m4296isInfiniteimpl(short s2) {
        return (s2 + LayoutKt.LargeDimension) - (s2 | ShortCompanionObject.MAX_VALUE) == 31744;
    }

    /* JADX INFO: renamed from: isNaN-impl, reason: not valid java name */
    public static final boolean m4297isNaNimpl(short s2) {
        return (s2 & ShortCompanionObject.MAX_VALUE) > 31744;
    }

    /* JADX INFO: renamed from: isNormalized-impl, reason: not valid java name */
    public static final boolean m4298isNormalizedimpl(short s2) {
        int i2 = s2 & 31744;
        return (i2 == 0 || i2 == 31744) ? false : true;
    }

    /* JADX INFO: renamed from: toRawBits-impl, reason: not valid java name */
    public static final int m4307toRawBitsimpl(short s2) {
        return (-1) - (((-1) - s2) | ((-1) - 65535));
    }

    public boolean equals(Object obj) {
        return m4288equalsimpl(this.halfValue, obj);
    }

    public int hashCode() {
        return m4294hashCodeimpl(this.halfValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ short m4313unboximpl() {
        return this.halfValue;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Float16 float16) {
        return m4312compareTo41bOqos(float16.m4313unboximpl());
    }

    private /* synthetic */ Float16(short s2) {
        this.halfValue = s2;
    }

    public final short getHalfValue() {
        return this.halfValue;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static short m4285constructorimpl(double d2) {
        return m4286constructorimpl((float) d2);
    }

    /* JADX INFO: renamed from: toByte-impl, reason: not valid java name */
    public static final byte m4301toByteimpl(short s2) {
        return (byte) m4303toFloatimpl(s2);
    }

    /* JADX INFO: renamed from: toShort-impl, reason: not valid java name */
    public static final short m4308toShortimpl(short s2) {
        return (short) m4303toFloatimpl(s2);
    }

    /* JADX INFO: renamed from: toInt-impl, reason: not valid java name */
    public static final int m4305toIntimpl(short s2) {
        return (int) m4303toFloatimpl(s2);
    }

    /* JADX INFO: renamed from: toLong-impl, reason: not valid java name */
    public static final long m4306toLongimpl(short s2) {
        return (long) m4303toFloatimpl(s2);
    }

    /* JADX INFO: renamed from: toDouble-impl, reason: not valid java name */
    public static final double m4302toDoubleimpl(short s2) {
        return m4303toFloatimpl(s2);
    }

    /* JADX INFO: renamed from: toBits-impl, reason: not valid java name */
    public static final int m4300toBitsimpl(short s2) {
        return m4297isNaNimpl(s2) ? NaN : (-1) - (((-1) - s2) | ((-1) - 65535));
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m4309toStringimpl(short s2) {
        return String.valueOf(m4303toFloatimpl(s2));
    }

    public String toString() {
        return m4309toStringimpl(this.halfValue);
    }

    /* JADX INFO: renamed from: compareTo-41bOqos, reason: not valid java name */
    public int m4312compareTo41bOqos(short s2) {
        return m4284compareTo41bOqos(this.halfValue, s2);
    }

    /* JADX INFO: renamed from: compareTo-41bOqos, reason: not valid java name */
    public static int m4284compareTo41bOqos(short s2, short s3) {
        if (m4297isNaNimpl(s2)) {
            return !m4297isNaNimpl(s3) ? 1 : 0;
        }
        if (m4297isNaNimpl(s3)) {
            return -1;
        }
        return Intrinsics.compare((-1) - (((-1) - s2) | ((-1) - 32768)) != 0 ? 32768 - (s2 & 65535) : s2 & 65535, (s3 & 32768) != 0 ? 32768 - ((s3 + 65535) - (s3 | 65535)) : (-1) - (((-1) - s3) | ((-1) - 65535)));
    }

    /* JADX INFO: renamed from: getSign-slo4al4, reason: not valid java name */
    public static final short m4292getSignslo4al4(short s2) {
        if (m4297isNaNimpl(s2)) {
            return NaN;
        }
        if (m4284compareTo41bOqos(s2, NegativeZero) < 0) {
            return Float16Kt.NegativeOne;
        }
        if (m4284compareTo41bOqos(s2, PositiveZero) > 0) {
            return Float16Kt.One;
        }
        return s2;
    }

    /* JADX INFO: renamed from: withSign-qCeQghg, reason: not valid java name */
    public static final short m4311withSignqCeQghg(short s2, short s3) {
        return m4287constructorimpl((short) ((-1) - (((-1) - (s2 & ShortCompanionObject.MAX_VALUE)) & ((-1) - ((-1) - (((-1) - s3) | ((-1) - 32768)))))));
    }

    /* JADX INFO: renamed from: absoluteValue-slo4al4, reason: not valid java name */
    public static final short m4281absoluteValueslo4al4(short s2) {
        return m4287constructorimpl((short) ((s2 + LayoutKt.LargeDimension) - (s2 | ShortCompanionObject.MAX_VALUE)));
    }

    /* JADX INFO: renamed from: round-slo4al4, reason: not valid java name */
    public static final short m4299roundslo4al4(short s2) {
        int i2 = (s2 + 65535) - (s2 | 65535);
        int i3 = s2 & ShortCompanionObject.MAX_VALUE;
        if (i3 < 15360) {
            int i4 = s2 & ShortCompanionObject.MIN_VALUE;
            int i5 = i3 < 14336 ? 0 : 65535;
            int i6 = (i5 + 15360) - (i5 | 15360);
            i2 = (i4 + i6) - (i4 & i6);
        } else if (i3 < 25600) {
            int i7 = i3 >> 10;
            int i8 = i2 + (1 << (24 - i7));
            int i9 = ~((1 << (25 - i7)) - 1);
            i2 = (i8 + i9) - (i8 | i9);
        }
        return m4287constructorimpl((short) i2);
    }

    /* JADX INFO: renamed from: ceil-slo4al4, reason: not valid java name */
    public static final short m4283ceilslo4al4(short s2) {
        int i2 = (-1) - (((-1) - 65535) | ((-1) - s2));
        int i3 = s2 & ShortCompanionObject.MAX_VALUE;
        if (i3 < 15360) {
            int i4 = (-1) - (((-1) - s2) | ((-1) - 32768));
            int i5 = ~(i2 >> 15);
            int i6 = i3 == 0 ? 0 : 1;
            int i7 = -((i5 + i6) - (i5 | i6));
            i2 = (-1) - (((-1) - ((i7 + 15360) - (i7 | 15360))) & ((-1) - i4));
        } else if (i3 < 25600) {
            int i8 = (1 << (25 - (i3 >> 10))) - 1;
            i2 = (i2 + ((-1) - (((-1) - ((i2 >> 15) - 1)) | ((-1) - i8)))) & (~i8);
        }
        return m4287constructorimpl((short) i2);
    }

    /* JADX INFO: renamed from: floor-slo4al4, reason: not valid java name */
    public static final short m4290floorslo4al4(short s2) {
        int i2 = s2 & 65535;
        int i3 = (-1) - (((-1) - s2) | ((-1) - LayoutKt.LargeDimension));
        if (i3 < 15360) {
            int i4 = (-1) - (((-1) - s2) | ((-1) - 32768));
            int i5 = (i2 <= 32768 ? 0 : 65535) & 15360;
            i2 = (i4 + i5) - (i4 & i5);
        } else if (i3 < 25600) {
            int i6 = (1 << (25 - (i3 >> 10))) - 1;
            i2 = (-1) - (((-1) - (i2 + ((-(i2 >> 15)) & i6))) | ((-1) - (~i6)));
        }
        return m4287constructorimpl((short) i2);
    }

    /* JADX INFO: renamed from: trunc-slo4al4, reason: not valid java name */
    public static final short m4310truncslo4al4(short s2) {
        int i2 = (-1) - (((-1) - 65535) | ((-1) - s2));
        int i3 = (s2 + LayoutKt.LargeDimension) - (Short.MAX_VALUE | s2);
        if (i3 < 15360) {
            i2 = Short.MIN_VALUE & s2;
        } else if (i3 < 25600) {
            int i4 = ~((1 << (25 - (i3 >> 10))) - 1);
            i2 = (i2 + i4) - (i2 | i4);
        }
        return m4287constructorimpl((short) i2);
    }

    /* JADX INFO: renamed from: toHexString-impl, reason: not valid java name */
    public static final String m4304toHexStringimpl(short s2) {
        StringBuilder sb = new StringBuilder();
        int i2 = (65535 + s2) - (65535 | s2);
        int i3 = i2 >>> 15;
        int i4 = (-1) - (((-1) - (i2 >>> 10)) | ((-1) - 31));
        int i5 = s2 & 1023;
        if (i4 != 31) {
            if (i3 == 1) {
                sb.append(Soundex.SILENT_MARKER);
            }
            if (i4 != 0) {
                sb.append("0x1.");
                String string = Integer.toString(i5, CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(string, "toString(this, checkRadix(radix))");
                sb.append(new Regex("0{2,}$").replaceFirst(string, ""));
                sb.append('p');
                sb.append(String.valueOf(i4 - 15));
            } else if (i5 == 0) {
                sb.append("0x0.0p0");
            } else {
                sb.append("0x0.");
                String string2 = Integer.toString(i5, CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(string2, "toString(this, checkRadix(radix))");
                sb.append(new Regex("0{2,}$").replaceFirst(string2, ""));
                sb.append("p-14");
            }
        } else if (i5 == 0) {
            if (i3 != 0) {
                sb.append(Soundex.SILENT_MARKER);
            }
            sb.append("Infinity");
        } else {
            sb.append("NaN");
        }
        return sb.toString();
    }

    /* JADX INFO: compiled from: Float16.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005&4\u0012\u0006\rnj?AJͣIDɟ\u0004*=j<9*[ҸuCIUj\u00150\ngN\u0016iŪIҙǈB\u000eو\u001a\u0001r,WZ\u0011_\u0018\u0012@F@VAS\b=gbԓ5ӌ܌1!أ}\r\t\u001a8M(x\u0001JY\u0010b<NxRR;V[܌dĂB \tȦ-~\\@`l\f<Ȼ\"Ʌ\u07bcAMϮc8\u0005M\u001bKl)\u0013\u0002o\"{LEA-%\u0002\f]ѿ.ύ\u0007?yܵU\u007f54CI\"YΥWÜѥ\u0014*̠\u0011ez&j\nib\u001259S4b^\u001d@w)}ʗ;ǉٳ\u0005&ρ25\"f\u0016\u0013KvxcNTRuP\u0011\u0013ad\u0019Ք~đ۸8\u001aƻUiC\u0019\\<\u0014\u0007\u001301\u0005?8ig&`C\u001dȑv\u0383ƱP?ףLV\u0012YKr\u001crh\u00168\b\u0001^\u000eD\u0014\u0011\\\u0019ğ6ك߶\" Ƞ\u0006PLg\u0005\nxjY\u007f`L\u00119|-O*7\u000e˧Cߟ̆jOԜ\\4\u0019M*Y\u001f\u007f\u000e+.`HS/>(N}jʂiܔУ\t$çj?any\u0013o;dMCU4\u001com\u000f\u0014mE9ں+ڋFS\u0014ȗ٥(+:Kpݺ\u0014*CV\f\u0019QƖu8"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0016`\b\u001cF9fl+MCv0'\u0019rj\u000f", "", "u(E", "\u0013ob6_6G", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0016`\b\u001cF9f\u0004", "5dc\u0012c:BZ#\bBl3\u0007W+lN", "u(B", "!", "\u001anf2f;/O \u000fz", "5dc\u0019b>>a(ove<|P=l\nvwGO", "\u001b`g\u0012k7H\\\u0019\b\n", "", "\u001b`g#T3NS", "5dc\u001aT?/O \u000fz&:\u0004\u0013}a\u0007v", "\u001bh]\u0012k7H\\\u0019\b\n", "\u001bh]\u001bb9FO ", "5dc\u001a\\5']&\u0007ves\u000b\u001094{/J", "\u001bh]#T3NS", "5dc\u001a\\5/O \u000fz&:\u0004\u0013}a\u0007v", "\u001c`=", "5dc\u001bT\u0015\u0006a \tIZ3K", "\u001cdV.g0OS|\b{b5\u0001\u0018C", "5dc\u001bX.:b\u001d\u0010zB5}\r8i\u000f<CN\b!eCv\\", "\u001cdV.g0OS\u000e~\bh", "5dc\u001bX.:b\u001d\u0010zS,\n\u0013vs\u00072J<\be", "\u001enb6g0OS|\b{b5\u0001\u0018C", "5dc\u001db:Bb\u001d\u0010zB5}\r8i\u000f<CN\b!eCv\\", "\u001enb6g0OS\u000e~\bh", "5dc\u001db:Bb\u001d\u0010zS,\n\u0013vs\u00072J<\be", "!hi2", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getEpsilon-slo4al4, reason: not valid java name */
        public final short m4314getEpsilonslo4al4() {
            return Float16.Epsilon;
        }

        /* JADX INFO: renamed from: getLowestValue-slo4al4, reason: not valid java name */
        public final short m4315getLowestValueslo4al4() {
            return Float16.LowestValue;
        }

        /* JADX INFO: renamed from: getMaxValue-slo4al4, reason: not valid java name */
        public final short m4316getMaxValueslo4al4() {
            return Float16.MaxValue;
        }

        /* JADX INFO: renamed from: getMinNormal-slo4al4, reason: not valid java name */
        public final short m4317getMinNormalslo4al4() {
            return Float16.MinNormal;
        }

        /* JADX INFO: renamed from: getMinValue-slo4al4, reason: not valid java name */
        public final short m4318getMinValueslo4al4() {
            return Float16.MinValue;
        }

        /* JADX INFO: renamed from: getNaN-slo4al4, reason: not valid java name */
        public final short m4319getNaNslo4al4() {
            return Float16.NaN;
        }

        /* JADX INFO: renamed from: getNegativeInfinity-slo4al4, reason: not valid java name */
        public final short m4320getNegativeInfinityslo4al4() {
            return Float16.NegativeInfinity;
        }

        /* JADX INFO: renamed from: getNegativeZero-slo4al4, reason: not valid java name */
        public final short m4321getNegativeZeroslo4al4() {
            return Float16.NegativeZero;
        }

        /* JADX INFO: renamed from: getPositiveInfinity-slo4al4, reason: not valid java name */
        public final short m4322getPositiveInfinityslo4al4() {
            return Float16.PositiveInfinity;
        }

        /* JADX INFO: renamed from: getPositiveZero-slo4al4, reason: not valid java name */
        public final short m4323getPositiveZeroslo4al4() {
            return Float16.PositiveZero;
        }
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static short m4286constructorimpl(float f2) {
        int i2;
        int i3;
        int iFloatToRawIntBits = Float.floatToRawIntBits(f2);
        int i4 = iFloatToRawIntBits >>> 31;
        int i5 = iFloatToRawIntBits >>> 23;
        int i6 = (i5 + 255) - (i5 | 255);
        int i7 = 8388607 & iFloatToRawIntBits;
        int i8 = 31;
        int i9 = 0;
        if (i6 == 255) {
            if (i7 != 0) {
                i3 = 512;
                i9 = i3;
            }
            i2 = (-1) - (((-1) - ((i4 << 15) | (i8 << 10))) & ((-1) - i9));
        } else {
            int i10 = i6 - 112;
            if (i10 >= 31) {
                i8 = 49;
            } else if (i10 > 0) {
                i9 = i7 >> 13;
                if ((-1) - (((-1) - iFloatToRawIntBits) | ((-1) - 4096)) != 0) {
                    int i11 = ((-1) - (((-1) - (i10 << 10)) & ((-1) - i9))) + 1;
                    int i12 = i4 << 15;
                    i2 = (i11 + i12) - (i11 & i12);
                } else {
                    i8 = i10;
                }
            } else if (i10 >= -10) {
                int i13 = ((-1) - (((-1) - 8388608) & ((-1) - i7))) >> (1 - i10);
                if ((i13 + 4096) - (4096 | i13) != 0) {
                    i13 += 8192;
                }
                i3 = i13 >> 13;
                i8 = 0;
                i9 = i3;
            } else {
                i8 = 0;
            }
            i2 = (-1) - (((-1) - ((i4 << 15) | (i8 << 10))) & ((-1) - i9));
        }
        return m4287constructorimpl((short) i2);
    }

    /* JADX INFO: renamed from: toFloat-impl, reason: not valid java name */
    public static final float m4303toFloatimpl(short s2) {
        int i2;
        int i3;
        int i4 = Short.MIN_VALUE & s2;
        int i5 = (65535 & s2) >>> 10;
        int i6 = (i5 + 31) - (i5 | 31);
        int i7 = (-1) - (((-1) - s2) | ((-1) - 1023));
        if (i6 != 0) {
            i2 = i7 << 13;
            if (i6 == 31) {
                i3 = 255;
                if (i2 != 0) {
                    i2 = (i2 + 4194304) - (i2 & 4194304);
                }
            } else {
                i3 = i6 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION;
            }
        } else {
            if (i7 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - Float16Kt.Fp32DenormalFloat;
                if (i4 == 0) {
                    return fIntBitsToFloat;
                }
                return -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat(((-1) - (((-1) - (i3 << 23)) & ((-1) - (i4 << 16)))) | i2);
    }
}
