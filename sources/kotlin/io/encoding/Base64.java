package kotlin.io.encoding;

import com.google.common.base.Ascii;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import okio.Utf8;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u000eӵLш|\u0004O\u000f8\u000b4F\u0007\":\u001e\u007fјnjG@LeN.ZS8\u001asڔ<$i*yCAV\"}0\tWNmwvJp\u000bK\u000f\u001c\u0016\u0001j2Q[\u000es܈-brom2\u0006nmyuz6\u0015$@\"Py3\u0002*.V\u0012\u000fzqLë\u00160Ns\u0003e\u001bT\u001d\u001a@\u000en$\u000f'tg|@\u000fǍҺ>/)\u000e2e\\3w0+W=Jb0%v\u0010+[DEC-%\u0002\u00127ViO\u001b? LKؒҊ++O\u0005 Tf\u0012,\u0015Yb=a\u0001:t\u0005\u007fo<+9d{K~\u001dX{\t\u0012%<2\u001dL'\u0011Q;1~\b<F%vaXh\u0002\rQ0~oD/%.B[=)viai(\u0015љ߉\t\r$<I\u000f/ul\u000e\u000f\u001fKX\u0006ZIQnGxT\u0010YK{\u001cp\u0011\u0011Z\n6G\u000e?\u0014\u0011\\&mWiS;!\u001a\fxHu\u007f\u001d`\u0017`\u001aXN@0|.7X\u0018<`Jd\u0013{hT\u0007;Y{*o\u001f}6\"P`\u0006E9%>X\u007flw\u0007e]8/_jEn\u0007k<fibACic>p\u0003z\"OTb3g-B\u001c>hy@\"`W\u001b\u0014\u0006\u0005\\N:\u001dbC\u007f8L,_#\r\u001bN\u0003,WY|7n\u000bn\u0016~bA<\u0003\u00183%\u000f\u0007Pj\u0001\bg'Xt/n?EA\u007fDI*c+\u00014+07\u0003\u0002\u001c_gzQ|r\u001cuc\u00118\u0016HH\u00025C\u0013\u001d\rA20<uRxe_]*')\fB-I\u0007Fg6y!0nsbO\u0003!Rzl\u0001;\b\u0013\u000f*eT\u000b_c\u0003\u001a\">\u0012\u0013\u0011xTNf\u00055#,.\u0019oP\u0007e3I'+$\u0010\u0014]$\u0012coo<\nz\u000fT\u0004.6:\u0004.o\u0011`\u000e6IAaY-HR(z\u001fZH\u0019\u00028H\u000f4\u001bH`A\u0013\u007f\u0007>S\u000b=\f~\u0007Z\u001c!\\a:!\u007f\u00164\\nr'Q\u001f,^q4AQap\u0006myf;N\u001d&#{_xB K5nW\u0011\u0018`\n\u0002&NAiq5@\u00174L,j\u0017Q͏Ұm\u0006\u0016\u001dHTm2/2p\u0003kZ\u001cl\u0011\\\u0005WK`\u000e\u001c/N\u0019~UX>\u0003;̍\u0013\u0013nX]\n\u001b\u00012D9\u001fxX\u0017fS5tXG7@XG0ucII\u0010D\u001cGW|\u001cu\u00128&\r5BF*ʦU\u0011m\u001fx~\u0019~|N\u0013\u0001Bj`W:)-\u0005-\u0014B\n\u001d\u00191O!~\u00133RN\u0006G[\u001a/&\rL\u00156\u0015ct%]\nC6UI\u0019\u001eW\u007feaS}6/P+\u0012\u00059\\\u0006\u001d-Ŋܤ\u001f:\u001c\u001d^\t\u00105+PN\u0013^N\u0003{\".6@\u007f\u0006A/+^\bz(%N7Cl4Q{l\u00078{l\u0012}\u001c\u000bK\u0005?\u0006\u0012n[_M\r5VF\u0013\u0007dj\u0015a.p\u0011.#E*-F bW\u001f\u0016c9\u0003yQs\rY0Bˌcʘ4X&ݙ7{{\b8Yx'IVe>\u0013\n3֭DŃ\u0012dr۪|v\u0012/\"\u0002۱L\u0010"}, d2 = {"\u001aj^A_0G\u001d\u001d\tD^5z\u0013.i\t*E\u001d|%\u0017\u0018>c", "", "7rD?_\u001a:T\u0019", "", "7r<6`,,Q\u001c~\u0003^", "uYIuI", "7r<6`,,Q\u001c~\u0003^j\u0003\u0013>l\u00041uN\u0010\u0016\u001eKl", "u(I", "7rD?_\u001a:T\u0019=\u0001h;\u0004\r8_\u000e7zG\u0005\u0014", "0xc2f\u001bHA(\f~g.`\u0011:l", "", "And?V,", "", "0xc2f\u001bHA(\f~g.`\u0011:l>.\u0006O\b\u001b A}\u001d;})2", "1gP?f\u001bH0-\u000ezl\u0010\u0005\u00146", "", "AsP?g\u0010GR\u0019\u0012", "", "3mS\u0016a+>f", "1gP?f\u001bH0-\u000ezl\u0010\u0005\u00146$\u00062\u000bG\u0005 \u0011U~\rCz\"", "1gT0^\u000b>a(\u0003\u0004Z;\u0001\u00138B\n8\u0005?\u000f", "", "2dbA\\5:b\u001d\t\u0004L0\u0012\t", "2dbA\\5:b\u001d\t\u0004H-}\u0017/t", "1`_.V0Mg\u0002~z],{", "1gT0^\u001aHc&|z;6\r\u0012.s", "And?V,,W.~", "1gT0^\u001aHc&|z;6\r\u0012.s>.\u0006O\b\u001b A}\u001d;})2", "2dR<W,", "2dR<W,\"[$\u0006", "2dbA\\5:b\u001d\t\u0004", "2dR<W,\"\\(\tWr;|d<r{<", "2dR<W,,W.~", "3mR<W,", "3mR<W,\"\\(\tWr;|d<r{<", "3mR<W,\"\\(\tWr;|d<r{<_H\f\u001e", "3mR<W,\"\\(\tWr;|d<r{<_H\f\u001eUMy\u001dCz./g\r\u001f>q\u0013", "3mR<W,,W.~", "3mR<W,-]t\n\u0006^5{\u0005,l\u007f", "\u000f", "\u001aiPCTuEO\"\u0001D:7\b\t8d{%\u0003@V", "\u001aj^A_0G\u001d(~\u000emuX\u0014:e\t'w=\b\u0017l", "uZ1\u0019](OOb\u0006vg.Fd:p\u007f1z<}\u001e\u0017\u001dSq\u007f]*1jyi>i\u001f0\u0017\u001fFv4'\u0014d^@\u00079", "3mR<W,-]u\u0013\n^\b\n\u0016+y", "3mR<W,-]u\u0013\n^\b\n\u0016+yc0\u0007G", "3mR<W,-]u\u0013\n^\b\n\u0016+yc0\u0007G?\u001d!Vv\u0012Ep3DX\u0005$4", "6`]1_,)O\u0018}~g.j\u001d7b\n/", ">`S\u0016a+>f", "0xc2F;:`(", "AjX=<3ES\u001bz\u0002L@\u0005\u00069l\u000e\f|(\u0005\u001f\u0017", "\u0012dU.h3M", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public class Base64 {
    private static final int bitsPerByte = 8;
    private static final int bitsPerSymbol = 6;
    public static final int bytesPerGroup = 3;
    private static final int mimeGroupsPerLine = 19;
    public static final int mimeLineLength = 76;
    public static final byte padSymbol = 61;
    public static final int symbolsPerGroup = 4;
    private final boolean isMimeScheme;
    private final boolean isUrlSafe;
    public static final Default Default = new Default(null);
    private static final byte[] mimeLineSeparatorSymbols = {Ascii.CR, 10};
    private static final Base64 UrlSafe = new Base64(true, false);
    private static final Base64 Mime = new Base64(false, true);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u0016DLcz\tI\u0006>\u00116B\u0005%4\u0012\u0006\u0017nj?1LeV1ZS0\u000fqڛ5:ӋTqq:\u0016\u001f\u0004\"\u07beSNug?Yh\f[\u000f4\u0015ѱn2Qǁ\u0011_\u0018\u0011@E@NAQ\b=g_ҽ:\u000b(݅::\u007f\n\u000f\u001dzT\u001e|\u0013Cy\u0013hؖ\u0013¤>R\u0015˟U& \u000eV /%3ɤ!ɇLleŽ\u007f/\u0011rZNUf\u0007Ũ ϘJT/˙Gm,5X7c\u001c{وU\u07baV[Gš\u0010}K\u0010\u0001'U2 ֖*͏\\\u007f\u001cƃ{a\u001bi\u000b&\u000b\u0012(ӡ\u000eˏ/Uk֟h\u0010.\u0006\t\u000b]H\u0012\u001e\u001e'v?\u0004Հ9ڿ\u00123|Ɂ$L^\u0014vB.\u00028بiӾ\u000433ݍӾjd"}, d2 = {"\u001aj^A_0G\u001d\u001d\tD^5z\u0013.i\t*E\u001d|%\u0017\u0018>L\u001bv&1i\u0005/\r", "\u001aj^A_0G\u001d\u001d\tD^5z\u0013.i\t*E\u001d|%\u0017\u0018>c", "u(E", "\u001bh\\2", "5dc\u001a\\4>", "u(;8b;EW\"H~hu|\u0012-o~,\u0005BJs\u0013Uo^\u000bL", "#q[ T->", "5dc\"e3,O\u001a~", "0hc@C,K0-\u000ez", "", "0hc@C,KA-\u0007wh3", "0xc2f\u0017>`z\f\u0005n7", ";h\\2:9Hc$\re^9c\r8e", ";h\\2?0GS\u007f~\u0004`;\u007f", ";h\\2?0GS\u0007~\u0006Z9x\u00189rm<\u0004=\u000b\u001e%", "", "5dc\u001a\\4>:\u001d\bzL,\b\u0005<a\u000f2\t.\u0015\u001f\u0014Qv\u001cz|/D`\u0002)1{%-TG8", "u(J\u000f", ">`S l4;] ", "", "Ax\\/b3L>\u0019\f\\k6\r\u0014", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Default extends Base64 {
        private Default() {
            super(false, false, null);
        }

        public /* synthetic */ Default(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Base64 getMime() {
            return Base64.Mime;
        }

        public final byte[] getMimeLineSeparatorSymbols$kotlin_stdlib() {
            return Base64.mimeLineSeparatorSymbols;
        }

        public final Base64 getUrlSafe() {
            return Base64.UrlSafe;
        }
    }

    private Base64(boolean z2, boolean z3) {
        this.isUrlSafe = z2;
        this.isMimeScheme = z3;
        if (z2 && z3) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public /* synthetic */ Base64(boolean z2, boolean z3, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, z3);
    }

    private final void checkDestinationBounds(int i2, int i3, int i4) {
        if (i3 < 0 || i3 > i2) {
            throw new IndexOutOfBoundsException("destination offset: " + i3 + ", destination size: " + i2);
        }
        int i5 = i3 + i4;
        if (i5 < 0 || i5 > i2) {
            throw new IndexOutOfBoundsException("The destination array does not have enough capacity, destination offset: " + i3 + ", destination size: " + i2 + ", capacity needed: " + i4);
        }
    }

    public static /* synthetic */ byte[] decode$default(Base64 base64, CharSequence charSequence, int i2, int i3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((i4 + 2) - (2 | i4) != 0) {
            i2 = 0;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 4)) != 0) {
            i3 = charSequence.length();
        }
        return base64.decode(charSequence, i2, i3);
    }

    public static /* synthetic */ byte[] decode$default(Base64 base64, byte[] bArr, int i2, int i3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((i4 + 2) - (2 | i4) != 0) {
            i2 = 0;
        }
        if ((i4 + 4) - (i4 | 4) != 0) {
            i3 = bArr.length;
        }
        return base64.decode(bArr, i2, i3);
    }

    private final int decodeImpl(byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        int iHandlePaddingSymbol = i3;
        int[] iArr = this.isUrlSafe ? Base64Kt.base64UrlDecodeMap : Base64Kt.base64DecodeMap;
        int i5 = -8;
        int i6 = 0;
        int i7 = i2;
        int i8 = -8;
        while (true) {
            if (iHandlePaddingSymbol >= i4) {
                break;
            }
            if (i8 == i5 && iHandlePaddingSymbol + 3 < i4) {
                int i9 = iArr[bArr[iHandlePaddingSymbol] & 255];
                int i10 = iArr[(-1) - (((-1) - bArr[iHandlePaddingSymbol + 1]) | ((-1) - 255))];
                int i11 = iArr[bArr[iHandlePaddingSymbol + 2] & 255];
                int i12 = iHandlePaddingSymbol + 4;
                int i13 = iArr[(-1) - (((-1) - bArr[iHandlePaddingSymbol + 3]) | ((-1) - 255))];
                int i14 = (i9 << 18) | (i10 << 12);
                int i15 = i11 << 6;
                int i16 = (i14 + i15) - (i14 & i15);
                int i17 = (i16 + i13) - (i16 & i13);
                if (i17 >= 0) {
                    bArr2[i7] = (byte) (i17 >> 16);
                    int i18 = i7 + 2;
                    bArr2[i7 + 1] = (byte) (i17 >> 8);
                    i7 += 3;
                    bArr2[i18] = (byte) i17;
                    iHandlePaddingSymbol = i12;
                }
                i5 = -8;
            }
            int i19 = bArr[iHandlePaddingSymbol] & 255;
            int i20 = iArr[i19];
            if (i20 >= 0) {
                iHandlePaddingSymbol++;
                int i21 = i6 << 6;
                i6 = (i21 + i20) - (i21 & i20);
                int i22 = i8 + 6;
                if (i22 >= 0) {
                    bArr2[i7] = (byte) (i6 >>> i22);
                    int i23 = (1 << i22) - 1;
                    i6 = (i6 + i23) - (i6 | i23);
                    i8 -= 2;
                    i7++;
                } else {
                    i8 = i22;
                }
            } else {
                if (i20 == -2) {
                    iHandlePaddingSymbol = handlePaddingSymbol(bArr, iHandlePaddingSymbol, i4, i8);
                    break;
                }
                if (!this.isMimeScheme) {
                    StringBuilder sbAppend = new StringBuilder("Invalid symbol '").append((char) i19).append("'(");
                    String string = Integer.toString(i19, CharsKt.checkRadix(8));
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    throw new IllegalArgumentException(sbAppend.append(string).append(") at index ").append(iHandlePaddingSymbol).toString());
                }
                iHandlePaddingSymbol++;
            }
            i5 = -8;
        }
        if (i8 == -2) {
            throw new IllegalArgumentException("The last unit of input does not have enough bits");
        }
        int iSkipIllegalSymbolsIfMime = skipIllegalSymbolsIfMime(bArr, iHandlePaddingSymbol, i4);
        if (iSkipIllegalSymbolsIfMime >= i4) {
            return i7 - i2;
        }
        int i24 = (-1) - (((-1) - bArr[iSkipIllegalSymbolsIfMime]) | ((-1) - 255));
        StringBuilder sbAppend2 = new StringBuilder("Symbol '").append((char) i24).append("'(");
        String string2 = Integer.toString(i24, CharsKt.checkRadix(8));
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        throw new IllegalArgumentException(sbAppend2.append(string2).append(") at index ").append(iSkipIllegalSymbolsIfMime - 1).append(" is prohibited after the pad character").toString());
    }

    public static /* synthetic */ int decodeIntoByteArray$default(Base64 base64, CharSequence charSequence, byte[] bArr, int i2, int i3, int i4, int i5, Object obj) {
        int length = i4;
        int i6 = i2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
        }
        if ((-1) - (((-1) - i5) | ((-1) - 4)) != 0) {
            i6 = 0;
        }
        int i7 = (8 & i5) == 0 ? i3 : 0;
        if ((i5 & 16) != 0) {
            length = charSequence.length();
        }
        return base64.decodeIntoByteArray(charSequence, bArr, i6, i7, length);
    }

    public static /* synthetic */ int decodeIntoByteArray$default(Base64 base64, byte[] bArr, byte[] bArr2, int i2, int i3, int i4, int i5, Object obj) {
        int length = i4;
        int i6 = i2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
        }
        if ((i5 + 4) - (4 | i5) != 0) {
            i6 = 0;
        }
        int i7 = (i5 + 8) - (8 | i5) == 0 ? i3 : 0;
        if ((-1) - (((-1) - i5) | ((-1) - 16)) != 0) {
            length = bArr.length;
        }
        return base64.decodeIntoByteArray(bArr, bArr2, i6, i7, length);
    }

    private final int decodeSize(byte[] bArr, int i2, int i3) {
        int i4 = i3 - i2;
        if (i4 == 0) {
            return 0;
        }
        if (i4 == 1) {
            throw new IllegalArgumentException("Input should have at list 2 symbols for Base64 decoding, startIndex: " + i2 + ", endIndex: " + i3);
        }
        if (this.isMimeScheme) {
            while (true) {
                if (i2 >= i3) {
                    break;
                }
                int i5 = Base64Kt.base64DecodeMap[bArr[i2] & 255];
                if (i5 < 0) {
                    if (i5 == -2) {
                        i4 -= i3 - i2;
                        break;
                    }
                    i4--;
                }
                i2++;
            }
        } else if (bArr[i3 - 1] == 61) {
            i4 = bArr[i3 + (-2)] == 61 ? i4 - 2 : i4 - 1;
        }
        return (int) ((((long) i4) * ((long) 6)) / ((long) 8));
    }

    public static /* synthetic */ String encode$default(Base64 base64, byte[] bArr, int i2, int i3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encode");
        }
        if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
            i2 = 0;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 4)) != 0) {
            i3 = bArr.length;
        }
        return base64.encode(bArr, i2, i3);
    }

    public static /* synthetic */ int encodeIntoByteArray$default(Base64 base64, byte[] bArr, byte[] bArr2, int i2, int i3, int i4, int i5, Object obj) {
        int length = i4;
        int i6 = i2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeIntoByteArray");
        }
        if ((4 & i5) != 0) {
            i6 = 0;
        }
        int i7 = (8 & i5) == 0 ? i3 : 0;
        if ((i5 & 16) != 0) {
            length = bArr.length;
        }
        return base64.encodeIntoByteArray(bArr, bArr2, i6, i7, length);
    }

    private final int encodeSize(int i2) {
        int i3 = (i2 + 2) / 3;
        int i4 = (i3 * 4) + ((this.isMimeScheme ? (i3 - 1) / 19 : 0) * 2);
        if (i4 >= 0) {
            return i4;
        }
        throw new IllegalArgumentException("Input is too big");
    }

    public static /* synthetic */ Appendable encodeToAppendable$default(Base64 base64, byte[] bArr, Appendable appendable, int i2, int i3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToAppendable");
        }
        if ((-1) - (((-1) - i4) | ((-1) - 4)) != 0) {
            i2 = 0;
        }
        if ((i4 + 8) - (i4 | 8) != 0) {
            i3 = bArr.length;
        }
        return base64.encodeToAppendable(bArr, appendable, i2, i3);
    }

    public static /* synthetic */ byte[] encodeToByteArray$default(Base64 base64, byte[] bArr, int i2, int i3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToByteArray");
        }
        if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
            i2 = 0;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 4)) != 0) {
            i3 = bArr.length;
        }
        return base64.encodeToByteArray(bArr, i2, i3);
    }

    private final int handlePaddingSymbol(byte[] bArr, int i2, int i3, int i4) {
        if (i4 == -8) {
            throw new IllegalArgumentException("Redundant pad character at index " + i2);
        }
        if (i4 != -6) {
            if (i4 == -4) {
                i2 = skipIllegalSymbolsIfMime(bArr, i2 + 1, i3);
                if (i2 == i3 || bArr[i2] != 61) {
                    throw new IllegalArgumentException("Missing one pad character at index " + i2);
                }
            } else if (i4 != -2) {
                throw new IllegalStateException("Unreachable".toString());
            }
        }
        return i2 + 1;
    }

    private final int skipIllegalSymbolsIfMime(byte[] bArr, int i2, int i3) {
        if (!this.isMimeScheme) {
            return i2;
        }
        while (i2 < i3) {
            byte b2 = bArr[i2];
            if (Base64Kt.base64DecodeMap[(b2 + 255) - (b2 | 255)] != -1) {
                return i2;
            }
            i2++;
        }
        return i2;
    }

    public final String bytesToStringImpl$kotlin_stdlib(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        StringBuilder sb = new StringBuilder(source.length);
        for (byte b2 : source) {
            sb.append((char) b2);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final byte[] charsToBytesImpl$kotlin_stdlib(CharSequence source, int i2, int i3) {
        int i4;
        Intrinsics.checkNotNullParameter(source, "source");
        checkSourceBounds$kotlin_stdlib(source.length(), i2, i3);
        byte[] bArr = new byte[i3 - i2];
        int i5 = 0;
        while (i2 < i3) {
            char cCharAt = source.charAt(i2);
            if (cCharAt <= 255) {
                i4 = i5 + 1;
                bArr[i5] = (byte) cCharAt;
            } else {
                i4 = i5 + 1;
                bArr[i5] = Utf8.REPLACEMENT_BYTE;
            }
            i5 = i4;
            i2++;
        }
        return bArr;
    }

    public final void checkSourceBounds$kotlin_stdlib(int i2, int i3, int i4) {
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(i3, i4, i2);
    }

    public final byte[] decode(CharSequence source, int i2, int i3) {
        byte[] bArrCharsToBytesImpl$kotlin_stdlib;
        Intrinsics.checkNotNullParameter(source, "source");
        if (source instanceof String) {
            checkSourceBounds$kotlin_stdlib(source.length(), i2, i3);
            String strSubstring = ((String) source).substring(i2, i3);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            Charset charset = Charsets.ISO_8859_1;
            Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
            bArrCharsToBytesImpl$kotlin_stdlib = strSubstring.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bArrCharsToBytesImpl$kotlin_stdlib, "getBytes(...)");
        } else {
            bArrCharsToBytesImpl$kotlin_stdlib = charsToBytesImpl$kotlin_stdlib(source, i2, i3);
        }
        return decode$default(this, bArrCharsToBytesImpl$kotlin_stdlib, 0, 0, 6, (Object) null);
    }

    public final byte[] decode(byte[] source, int i2, int i3) {
        Intrinsics.checkNotNullParameter(source, "source");
        checkSourceBounds$kotlin_stdlib(source.length, i2, i3);
        int iDecodeSize = decodeSize(source, i2, i3);
        byte[] bArr = new byte[iDecodeSize];
        if (decodeImpl(source, bArr, 0, i2, i3) == iDecodeSize) {
            return bArr;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final int decodeIntoByteArray(CharSequence source, byte[] destination, int i2, int i3, int i4) {
        byte[] bArrCharsToBytesImpl$kotlin_stdlib;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (source instanceof String) {
            checkSourceBounds$kotlin_stdlib(source.length(), i3, i4);
            String strSubstring = ((String) source).substring(i3, i4);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            Charset charset = Charsets.ISO_8859_1;
            Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
            bArrCharsToBytesImpl$kotlin_stdlib = strSubstring.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bArrCharsToBytesImpl$kotlin_stdlib, "getBytes(...)");
        } else {
            bArrCharsToBytesImpl$kotlin_stdlib = charsToBytesImpl$kotlin_stdlib(source, i3, i4);
        }
        return decodeIntoByteArray$default(this, bArrCharsToBytesImpl$kotlin_stdlib, destination, i2, 0, 0, 24, (Object) null);
    }

    public final int decodeIntoByteArray(byte[] source, byte[] destination, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        checkSourceBounds$kotlin_stdlib(source.length, i3, i4);
        checkDestinationBounds(destination.length, i2, decodeSize(source, i3, i4));
        return decodeImpl(source, destination, i2, i3, i4);
    }

    public final String encode(byte[] source, int i2, int i3) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new String(encodeToByteArrayImpl$kotlin_stdlib(source, i2, i3), Charsets.ISO_8859_1);
    }

    public final int encodeIntoByteArray(byte[] source, byte[] destination, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        return encodeIntoByteArrayImpl$kotlin_stdlib(source, destination, i2, i3, i4);
    }

    public final int encodeIntoByteArrayImpl$kotlin_stdlib(byte[] source, byte[] destination, int i2, int i3, int i4) {
        int i5 = i3;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        checkSourceBounds$kotlin_stdlib(source.length, i5, i4);
        checkDestinationBounds(destination.length, i2, encodeSize(i4 - i5));
        byte[] bArr = this.isUrlSafe ? Base64Kt.base64UrlEncodeMap : Base64Kt.base64EncodeMap;
        int i6 = this.isMimeScheme ? 19 : Integer.MAX_VALUE;
        int i7 = i2;
        while (i5 + 2 < i4) {
            int iMin = Math.min((i4 - i5) / 3, i6);
            for (int i8 = 0; i8 < iMin; i8++) {
                int i9 = source[i5] & 255;
                int i10 = i5 + 2;
                int i11 = source[i5 + 1] & 255;
                i5 += 3;
                int i12 = ((-1) - (((-1) - (i11 << 8)) & ((-1) - (i9 << 16)))) | ((-1) - (((-1) - source[i10]) | ((-1) - 255)));
                destination[i7] = bArr[i12 >>> 18];
                destination[i7 + 1] = bArr[(-1) - (((-1) - (i12 >>> 12)) | ((-1) - 63))];
                int i13 = i7 + 3;
                destination[i7 + 2] = bArr[(i12 >>> 6) & 63];
                i7 += 4;
                destination[i13] = bArr[(-1) - (((-1) - i12) | ((-1) - 63))];
            }
            if (iMin == i6 && i5 != i4) {
                int i14 = i7 + 1;
                byte[] bArr2 = mimeLineSeparatorSymbols;
                destination[i7] = bArr2[0];
                i7 += 2;
                destination[i14] = bArr2[1];
            }
        }
        int i15 = i4 - i5;
        if (i15 == 1) {
            int i16 = i5 + 1;
            int i17 = (source[i5] & 255) << 4;
            destination[i7] = bArr[i17 >>> 6];
            destination[i7 + 1] = bArr[(i17 + 63) - (i17 | 63)];
            int i18 = i7 + 3;
            destination[i7 + 2] = padSymbol;
            i7 += 4;
            destination[i18] = padSymbol;
            i5 = i16;
        } else if (i15 == 2) {
            int i19 = i5 + 1;
            int i20 = source[i5] & 255;
            i5 += 2;
            int i21 = (((-1) - (((-1) - source[i19]) | ((-1) - 255))) << 2) | (i20 << 10);
            destination[i7] = bArr[i21 >>> 12];
            destination[i7 + 1] = bArr[(-1) - (((-1) - (i21 >>> 6)) | ((-1) - 63))];
            int i22 = i7 + 3;
            destination[i7 + 2] = bArr[(i21 + 63) - (i21 | 63)];
            i7 += 4;
            destination[i22] = padSymbol;
        }
        if (i5 == i4) {
            return i7 - i2;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final <A extends Appendable> A encodeToAppendable(byte[] source, A destination, int i2, int i3) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        destination.append(new String(encodeToByteArrayImpl$kotlin_stdlib(source, i2, i3), Charsets.ISO_8859_1));
        return destination;
    }

    public final byte[] encodeToByteArray(byte[] source, int i2, int i3) {
        Intrinsics.checkNotNullParameter(source, "source");
        return encodeToByteArrayImpl$kotlin_stdlib(source, i2, i3);
    }

    public final byte[] encodeToByteArrayImpl$kotlin_stdlib(byte[] source, int i2, int i3) {
        Intrinsics.checkNotNullParameter(source, "source");
        checkSourceBounds$kotlin_stdlib(source.length, i2, i3);
        byte[] bArr = new byte[encodeSize(i3 - i2)];
        encodeIntoByteArrayImpl$kotlin_stdlib(source, bArr, 0, i2, i3);
        return bArr;
    }

    public final boolean isMimeScheme$kotlin_stdlib() {
        return this.isMimeScheme;
    }

    public final boolean isUrlSafe$kotlin_stdlib() {
        return this.isUrlSafe;
    }
}
