package okio;

import com.google.common.base.Ascii;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.msgpack.core.MessagePack;
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
@Metadata(bv = {}, d1 = {"Яt\u001d<K!&i\u0016DLc\u0003\u0011Iي8\u000b<R\u0007\"2\u0014\u007f\u0007tpA0JiP.`_2\u000fq~<$q$yCAX\"}0\tWNmmvJh\u0014K\u000f\f\u0016\u0001j:կ]ތe\u0012\u001d5JoEJUoS9ht<\u000b(288\u0002\u0005\u0007!2H&v\u0003ŏS\f(0Hp@R\u0015M\u001b\u001a\u001a\u0006D \u00072rɡl\u0012xl\f9_)\u0013kRNUڿ^|\u0006\f\"\u00154\u0013Ǹq\"9AO5C'٨\u0007\u0007`^\b\tM\u0005U\u0005\u0017;m?\u0012yeKp\u007fB#qcUc\u0001<t\u0005\u007fnR;s^qbh\u000eV~+\u007f\u001bT\u001c\u000e4Ω\u000fͪ-b\u0011\u0016'Kt!mpV\b^P\u001b\u0013ad\u001eU\u0004AGQ\u001b\u0015S\u0012A\u001fNE\u0019\u001d\rL*1r/yl\u000e\u000f\u001cah@d?pX=vݐ:]K\u000e\u001cp\u0011\u0010p\u0012ΥK\u007f5\u001dY:%GO[gFQo\u0010l\\g%\u0007)ta\fjHnE\u001f\u001aEN!\f\tե-\u0016yulXZ4}\"b\u001f\u0016\n)\u001f\u000b\u001e\u0003ư%Xb]\u0010\u0002j{\u0006:)=\u0010OY\u001drTë9ӷ75W\u000eXt`!,?j\u000b5\\tkk\f\tcn'ĘLj\u0016#DO\\8+2mxbBϜ5\u0019bB\u0011\t,HY|7f!|X\u0005ba<\u0003\u00182;\u001dIkj \bg'̢\\\u0001nBEA\u007fCI*cR\u00014+ȽM\r\u0381\u0004Gm}\u0010ZzH\u000eU*\u008dF\u001eG\u0002G=AÁE=z\u0010;xdr\u0014ʸ}\u00165+\u0015y=\u0090/B0\u0016x%D`\u0019\u07ba\u007fX%R\u000f^!ּNxH\u0012o{\u0013G\u0012[;_La\u000b\u0003\b>~>\u0003\u0005-T=\u0001\u001e)CJu[5R.wB6Eek\u0002\b.(ʬ?,ze\u0012b{\u0016\u001ei\u0018bzFF\u0001q~l$jzúFHp0PU\u0017m%3vi\u0015tdre\u000b]\u0005-\u0015Ր\u0011p\\\u0017\u0003+}:L.\u000e1$G\f,vCS\u0013}Ymm{\u0002t\u000bx\u0016P DI|N4=N]\bf\u0017H\u001esFܽqAh\u0005J?<4ZCN\u0010\fXwC(z.ʋ(5%pZsiy>X\u0007wnH3gud/B\u0019~=5N|Cp\u001dmt[_g@\u001fk\u001d7\"1cG\r3i\\Tg>X\\\u000f&]]qP2:\u0012_Am\u001aƑ<<&<5BF\"iU\u001f}\u000f0\r\u0012\u001cx\u0017r\u0005R~R|<Y\u0003\t>&<8QQ\u0019\u0018v}&EL|ߗ\u007fG(E/DW܍T\u0001q\f3-4זuHWv,'*^\u001a@֞\f &mL\u0001/$o\u000e\u0015-\u000e\u001fH^\n\u0016\u0011\u0004Q\u001f^g\u001c.x\u0018#\u000e<PNO0֯J!l#\u0004wONW/zPZK\u0017DPw5}|\"#\u0003\u0015۲\u0007\u007ft-^j!'{5C^`:\u001f\"8X?\u0007Z*n%DWz)>˖*|9q],%+]մpuy6`o\u0016\u001f(wJ>\u001d.#\u000enMlrOp5He\u001bvjVr; q\"\u000bR`^?-dJ\u0001r|/eneoUjnZ\u001cEw@Q5`\u001637`b ,\u0005,\u001b:\u0011{0.P'\u000b\u007f\u00163sTÊA\u001a-2l{r\\>KsRr\f:e&\u0011]5~ \u000fn(\u001dSQaCoև\u0003ͤ<\fwޞ17pUa*z\u0019\u000b\u0007%?(8B \u007f٥v/7ݩ\b\u001d]nI.UgR1\u001a\r6Y\rY{V=hb\u000fˢI\"\u0012WF\f\u0018(t>\u0014\u0003;\u0002[0v86ЈLҕwc\fڏB8tS1W\rzy\u001b:{ҋwA"}, d2 = {"\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "\u001aiPCTuB]blzk0x\u00103z{%\u0003@V", "", "2`c.", "", "uZ1uI", "5dc\u0011T;:\u0012#\u0005~h", "u(J\u000f", "6`b566=S", "", "5dc\u0015T:A1#}z\u001d6\u0003\r9", "u(8", "Adc\u0015T:A1#}z\u001d6\u0003\r9", "uH\u0018#", "Ahi2", "CsU\u0005", "", "5dc\"g-\u0011\u0012#\u0005~h", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\"g-\u0011\u0012#\u0005~h", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "/r1Fg,\u001bc\u001a\u007fzk", "\u001aiPCTuGW#HWr;|e?f\u0001(\t\u0016", "0`b2)z", "0`b2)z.` ", "1n\\=T9>B#", "=sW2e", "1n_F<5M]", "", "=eU@X;", "B`a4X;", "B`a4X;(T\u001a\rzm", "0xc266N\\(", "2hV2f;", "/kV<e0MV!", "2hV2f;|]\u001f\u0003\u0005", "3mS@J0MV", "", "AtU3\\?", "3pd._:", "", "5dc", "", "7mS2k", "5dc\u000fl;>", "zcT=e,<O(~yX.|\u0018\fy\u000f(", "5dc \\A>", "5dc \\A>\u0012#\u0005~h", "6dg", "6lP0", "9dh", "6lP0\u00176DW#", "6lP0F/:\u001f", "6lP0F/: hO", "6lP0F/:#dK", "7mS2k\u0016?", "4q^:<5=S,", "7mc2e5:Zt\f\bZ@", "7mc2e5:Zt\f\bZ@;\u00135i\n", "7mc2e5:Zz~\n", ">nb", "7mc2e5:Zz~\n\u001d6\u0003\r9", ":`bA<5=S,h{", ";c$", "@`]4X\fJc\u0015\u0006\t", "=sW2e\u0016?T'~\n", "@dP1B)CS\u0017\u000e", "7m", "\u001aiPCTuB]bhwc,z\u0018\u0013n\u000b8\u000b.\u0010$\u0017Cwc", "AgP}", "AgP~(|", "AgP\u0002$x", "zcT=e,<O(~yX:\u0001\u001e/", "AsP?g:0W(\u0002", ">qT3\\?", "Asa6a.", "1gP?f,M", "\u001aiPCTuGW#Hxa(\n\u0017/tI\u0006~<\u000e%\u0017VE", "AtQ@g9B\\\u001b", "0dV6a\u0010GR\u0019\u0012", "3mS\u0016a+>f", "Bn0@V0B:#\u0011zk*x\u0017/", "Bn0@V0BC$\nzk*x\u0017/", "Bn1Fg,\u001a`&z\u000f", "BnBAe0GU", "EqXAX", "=tc", "\u001aiPCTuB]bh\u000bm7\r\u0018\u001dt\r(wHV", "0tU3X9", "\u001anZ6bu\u001bc\u001a\u007fzk\u0002", "EqXAXjHY\u001d\t", "EqXAX\u0016;X\u0019|\n", "\u001aiPCTuB]bhwc,z\u0018\u0019u\u000f3\fOn&$Gk\u0016\u0012", "\u0011n\\=T5B]\"", "=jX<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public class ByteString implements Serializable, Comparable<ByteString> {
    public static final Companion Companion = new Companion(null);
    public static final ByteString EMPTY = new ByteString(new byte[0]);
    private static final long serialVersionUID = 1;
    private final byte[] data;
    private transient int hashCode;
    private transient String utf8;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯP\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u0019\u007f\u0007ljA0RqP.XV2\u000f\u0002{<$a'yCQU\"}(\tWNuwvJh\u000eK\u000f\f\u0016\u0001j:O]xc\u0013\u00172XoG3SrCʧa\u000bȂ5 `!x~\u000b\u0001ʀ.H\u001evCXY\u0011*2VohT=Q\u0013 *\u0006l'G#֔kN<P5pH8;\u0003\u0018D~+m6\u0015M;M\u001b,˼za$5\tRC =S1\t\u0003_M\tWqk\f\u0019+57as\u0006C\u001f\u0005Џ\u0019+U\u001b&\u00064k\u001dQ\u000f\u000eW/]icP</>\u007fԫ\u0011<\n\u001eN:V?E\u001a\u0015\n>7\u0003\u0005k@~\u0015%Gȸ~a<+m\u0012A<Q\u001b\u0015S\u0012C'cO{3#>#/\u0006g`\u001d1n&3T&SaUNU`N8omq\u0012\nz\u0002X\u001e`K\u000eJ\u0014\u0011\\1k<٦=#'\u007fJcR\u0004\u000f\u0005\u000fj\u0004m`eX\"\u001d4g.\u0017'rD\u0013\u001f2UԜ\\,\u0017ld`\u0015\u0003 \u00156[&>I%>U\u0016m2t[f\"%]h_Y\u001drT\\\u0002wAUic>czvBFlh\u000bXtNk\f\tin'ĘLj\u0016\u0003DN\\\u001b+2msD4Z8_a]_\u0011?ZA+\u000b\bZ\u0017./XA?\u001biR\u000fO\u0006˩`pu\u0004AX:\u001fx\"[Cy5G9\u001c'מ8|)\u0018G\u0017\u000ei\u007fLuN\u0015\u0016$k,&\u001c\u001aGjG=A)//8\u0002;`dr\u0014k\u0014\u0017ؠ~|\u007f \fv<h j\u001f.\u0017n!֪VЂ&vfаs\u0014r\u0003\u0012at~\u001eύ'ߏ_>QͿî]_"}, d2 = {"\u001anZ6bu\u001bg(~hm9\u0001\u00121$]2\u0004K| \u001bQxc", "", "u(E", "\u0013L?!L", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "Ada6T3/S&\r~h5ll\u000e", "", "2dR<W,\u001bO'~K-", "Asa6a.", "", "zcT=e,<O(~yX+|\u00079d\u007f\u0005wN\u0001ge", "2dR<W,!S,", "zcT=e,<O(~yX+|\u00079d\u007f\u000b{S", "3mR<W,,b&\u0003\u0004`", "1gP?f,M", "\u001aiPCTuGW#Hxa(\n\u0017/tI\u0006~<\u000e%\u0017VE", "zcT=e,<O(~yX,\u0006\u00079d\u007f\u0016\u000bM\u0005 \u0019", "3mR<W,.b\u001aQ", "zcT=e,<O(~yX,\u0006\u00079d\u007f\u0018\u000bAS", "=e", "0tU3X9", "\u001aiPCTuGW#HWr;|e?f\u0001(\t\u0016", "zcT=e,<O(~yX6}", "2`c.", "", "", "/qa.l", "=eU@X;", "", "0xc266N\\(", "@dP1", "7m_Bg:M`\u0019z\u0003", "\u001aiPCTuB]bb\u0004i<\fv>r\u007f$\u0004\u0016", "zcT=e,<O(~yX9|\u0005.", "3mR<W,", "@dP15@MS\u0007\u000e\bb5~", "Bn1Fg,,b&\u0003\u0004`", "=jX<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ByteString encodeString$default(Companion companion, String str, Charset charset, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                charset = Charsets.UTF_8;
            }
            return companion.encodeString(str, charset);
        }

        public static /* synthetic */ ByteString of$default(Companion companion, byte[] bArr, int i2, int i3, int i4, Object obj) {
            if ((i4 + 1) - (1 | i4) != 0) {
                i2 = 0;
            }
            if ((i4 & 2) != 0) {
                i3 = SegmentedByteString.getDEFAULT__ByteString_size();
            }
            return companion.of(bArr, i2, i3);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018L@\u000fU#?WkZH-\u001av\u000ff\u007fU|", replaceWith = @ReplaceWith(expression = "string.decodeBase64()", imports = {"okio.ByteString.Companion.decodeBase64"}))
        @InterfaceC1492Gx
        /* JADX INFO: renamed from: -deprecated_decodeBase64 */
        public final ByteString m10800deprecated_decodeBase64(String string) {
            Intrinsics.checkNotNullParameter(string, "string");
            return decodeBase64(string);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018L@\u000fU#?WkZH-\u001av\u000ff\u007fU|", replaceWith = @ReplaceWith(expression = "string.decodeHex()", imports = {"okio.ByteString.Companion.decodeHex"}))
        @InterfaceC1492Gx
        /* JADX INFO: renamed from: -deprecated_decodeHex */
        public final ByteString m10801deprecated_decodeHex(String string) {
            Intrinsics.checkNotNullParameter(string, "string");
            return decodeHex(string);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018L@\u000fU#?WkZH-\u001av\u000ff\u007fU|", replaceWith = @ReplaceWith(expression = "string.encode(charset)", imports = {"okio.ByteString.Companion.encode"}))
        @InterfaceC1492Gx
        /* JADX INFO: renamed from: -deprecated_encodeString */
        public final ByteString m10802deprecated_encodeString(String string, Charset charset) {
            Intrinsics.checkNotNullParameter(string, "string");
            Intrinsics.checkNotNullParameter(charset, "charset");
            return encodeString(string, charset);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018L@\u000fU#?WkZH-\u001av\u000ff\u007fU|", replaceWith = @ReplaceWith(expression = "string.encodeUtf8()", imports = {"okio.ByteString.Companion.encodeUtf8"}))
        @InterfaceC1492Gx
        /* JADX INFO: renamed from: -deprecated_encodeUtf8 */
        public final ByteString m10803deprecated_encodeUtf8(String string) {
            Intrinsics.checkNotNullParameter(string, "string");
            return encodeUtf8(string);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018L@\u000fU#?WkZH-\u001av\u000ff\u007fU|", replaceWith = @ReplaceWith(expression = "buffer.toByteString()", imports = {"okio.ByteString.Companion.toByteString"}))
        @InterfaceC1492Gx
        /* JADX INFO: renamed from: -deprecated_of */
        public final ByteString m10804deprecated_of(ByteBuffer buffer) {
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            return of(buffer);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018L@\u000fU#?WkZH-\u001av\u000ff\u007fU|", replaceWith = @ReplaceWith(expression = "array.toByteString(offset, byteCount)", imports = {"okio.ByteString.Companion.toByteString"}))
        @InterfaceC1492Gx
        /* JADX INFO: renamed from: -deprecated_of */
        public final ByteString m10805deprecated_of(byte[] array, int i2, int i3) {
            Intrinsics.checkNotNullParameter(array, "array");
            return of(array, i2, i3);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018L@\u000fU#?WkZH-\u001av\u000ff\u007fU|", replaceWith = @ReplaceWith(expression = "inputstream.readByteString(byteCount)", imports = {"okio.ByteString.Companion.readByteString"}))
        @InterfaceC1492Gx
        /* JADX INFO: renamed from: -deprecated_read */
        public final ByteString m10806deprecated_read(InputStream inputstream, int i2) {
            Intrinsics.checkNotNullParameter(inputstream, "inputstream");
            return read(inputstream, i2);
        }

        @JvmStatic
        public final ByteString decodeBase64(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            byte[] bArrDecodeBase64ToArray = Base64.decodeBase64ToArray(str);
            if (bArrDecodeBase64ToArray != null) {
                return new ByteString(bArrDecodeBase64ToArray);
            }
            return null;
        }

        @JvmStatic
        public final ByteString decodeHex(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = i2 * 2;
                bArr[i2] = (byte) ((okio.internal.ByteString.decodeHexDigit(str.charAt(i3)) << 4) + okio.internal.ByteString.decodeHexDigit(str.charAt(i3 + 1)));
            }
            return new ByteString(bArr);
        }

        @JvmStatic
        public final ByteString encodeString(String str, Charset charset) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Intrinsics.checkNotNullParameter(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return new ByteString(bytes);
        }

        @JvmStatic
        public final ByteString encodeUtf8(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            ByteString byteString = new ByteString(_JvmPlatformKt.asUtf8ToByteArray(str));
            byteString.setUtf8$okio(str);
            return byteString;
        }

        @JvmStatic
        public final ByteString of(ByteBuffer byteBuffer) {
            Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new ByteString(bArr);
        }

        @JvmStatic
        public final ByteString of(byte... data) {
            Intrinsics.checkNotNullParameter(data, "data");
            byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
            Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
            return new ByteString(bArrCopyOf);
        }

        @JvmStatic
        public final ByteString of(byte[] bArr, int i2, int i3) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(bArr, i3);
            SegmentedByteString.checkOffsetAndCount(bArr.length, i2, iResolveDefaultParameter);
            return new ByteString(ArraysKt.copyOfRange(bArr, i2, iResolveDefaultParameter + i2));
        }

        @JvmStatic
        public final ByteString read(InputStream inputStream, int i2) throws IOException {
            Intrinsics.checkNotNullParameter(inputStream, "<this>");
            if (i2 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + i2).toString());
            }
            byte[] bArr = new byte[i2];
            int i3 = 0;
            while (i3 < i2) {
                int i4 = inputStream.read(bArr, i3, i2 - i3);
                if (i4 == -1) {
                    throw new EOFException();
                }
                i3 += i4;
            }
            return new ByteString(bArr);
        }
    }

    public ByteString(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    public static /* synthetic */ void copyInto$default(ByteString byteString, int i2, byte[] bArr, int i3, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copyInto");
        }
        if ((1 & i5) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        byteString.copyInto(i2, bArr, i3, i4);
    }

    @JvmStatic
    public static final ByteString decodeBase64(String str) {
        return Companion.decodeBase64(str);
    }

    @JvmStatic
    public static final ByteString decodeHex(String str) {
        return Companion.decodeHex(str);
    }

    @JvmStatic
    public static final ByteString encodeString(String str, Charset charset) {
        return Companion.encodeString(str, charset);
    }

    @JvmStatic
    public static final ByteString encodeUtf8(String str) {
        return Companion.encodeUtf8(str);
    }

    public static /* synthetic */ int indexOf$default(ByteString byteString, ByteString byteString2, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return byteString.indexOf(byteString2, i2);
    }

    public static /* synthetic */ int indexOf$default(ByteString byteString, byte[] bArr, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            i2 = 0;
        }
        return byteString.indexOf(bArr, i2);
    }

    public static /* synthetic */ int lastIndexOf$default(ByteString byteString, ByteString byteString2, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            i2 = SegmentedByteString.getDEFAULT__ByteString_size();
        }
        return byteString.lastIndexOf(byteString2, i2);
    }

    public static /* synthetic */ int lastIndexOf$default(ByteString byteString, byte[] bArr, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i3 & 2) != 0) {
            i2 = SegmentedByteString.getDEFAULT__ByteString_size();
        }
        return byteString.lastIndexOf(bArr, i2);
    }

    @JvmStatic
    public static final ByteString of(ByteBuffer byteBuffer) {
        return Companion.of(byteBuffer);
    }

    @JvmStatic
    public static final ByteString of(byte... bArr) {
        return Companion.of(bArr);
    }

    @JvmStatic
    public static final ByteString of(byte[] bArr, int i2, int i3) {
        return Companion.of(bArr, i2, i3);
    }

    @JvmStatic
    public static final ByteString read(InputStream inputStream, int i2) throws IOException {
        return Companion.read(inputStream, i2);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, NoSuchFieldException, IOException {
        ByteString byteString = Companion.read(objectInputStream, objectInputStream.readInt());
        Field declaredField = ByteString.class.getDeclaredField("data");
        declaredField.setAccessible(true);
        declaredField.set(this, byteString.data);
    }

    public static /* synthetic */ ByteString substring$default(ByteString byteString, int i2, int i3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
        }
        if ((i4 + 1) - (1 | i4) != 0) {
            i2 = 0;
        }
        if ((i4 + 2) - (i4 | 2) != 0) {
            i3 = SegmentedByteString.getDEFAULT__ByteString_size();
        }
        return byteString.substring(i2, i3);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018V8\u007fb\u0016@]n\f\u000f<\u0013k [\u0006T", replaceWith = @ReplaceWith(expression = "this[index]", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_getByte */
    public final byte m10798deprecated_getByte(int i2) {
        return getByte(i2);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = RRWebVideoEvent.JsonKeys.SIZE, imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_size */
    public final int m10799deprecated_size() {
        return size();
    }

    public ByteBuffer asByteBuffer() {
        ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(this.data).asReadOnlyBuffer();
        Intrinsics.checkNotNullExpressionValue(byteBufferAsReadOnlyBuffer, "asReadOnlyBuffer(...)");
        return byteBufferAsReadOnlyBuffer;
    }

    public String base64() {
        return Base64.encodeBase64$default(getData$okio(), null, 1, null);
    }

    public String base64Url() {
        return Base64.encodeBase64(getData$okio(), Base64.getBASE64_URL_SAFE());
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0039, code lost:
    
        if (r6 < r5) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x003e, code lost:
    
        if (r2 < r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0041, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return 1;
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int compareTo(okio.ByteString r11) {
        /*
            r10 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            int r6 = r10.size()
            int r5 = r11.size()
            int r4 = java.lang.Math.min(r6, r5)
            r9 = 0
            r3 = r9
        L13:
            r8 = -1
            r7 = 1
            if (r3 >= r4) goto L36
            byte r1 = r10.getByte(r3)
            r0 = 255(0xff, float:3.57E-43)
            int r1 = (-1) - r1
            int r0 = (-1) - r0
            r1 = r1 | r0
            int r2 = (-1) - r1
            byte r1 = r11.getByte(r3)
            r0 = 255(0xff, float:3.57E-43)
            int r1 = (-1) - r1
            int r0 = (-1) - r0
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r2 != r0) goto L3e
            int r3 = r3 + 1
            goto L13
        L36:
            if (r6 != r5) goto L39
            goto L41
        L39:
            if (r6 >= r5) goto L3c
            goto L40
        L3c:
            r9 = r7
            goto L41
        L3e:
            if (r2 >= r0) goto L3c
        L40:
            r9 = r8
        L41:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.ByteString.compareTo(okio.ByteString):int");
    }

    public void copyInto(int i2, byte[] target, int i3, int i4) {
        Intrinsics.checkNotNullParameter(target, "target");
        ArraysKt.copyInto(getData$okio(), target, i3, i2, i4 + i2);
    }

    public ByteString digest$okio(String algorithm) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.data, 0, size());
        byte[] bArrDigest = messageDigest.digest();
        Intrinsics.checkNotNull(bArrDigest);
        return new ByteString(bArrDigest);
    }

    public final boolean endsWith(ByteString suffix) {
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return rangeEquals(size() - suffix.size(), suffix, 0, suffix.size());
    }

    public final boolean endsWith(byte[] suffix) {
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return rangeEquals(size() - suffix.length, suffix, 0, suffix.length);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == getData$okio().length && byteString.rangeEquals(0, getData$okio(), 0, getData$okio().length)) {
                return true;
            }
        }
        return false;
    }

    public final byte getByte(int i2) {
        return internalGet$okio(i2);
    }

    public final byte[] getData$okio() {
        return this.data;
    }

    public final int getHashCode$okio() {
        return this.hashCode;
    }

    public int getSize$okio() {
        return getData$okio().length;
    }

    public final String getUtf8$okio() {
        return this.utf8;
    }

    public int hashCode() {
        int hashCode$okio = getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int iHashCode = Arrays.hashCode(getData$okio());
        setHashCode$okio(iHashCode);
        return iHashCode;
    }

    public String hex() {
        char[] cArr = new char[getData$okio().length * 2];
        int i2 = 0;
        for (byte b2 : getData$okio()) {
            int i3 = i2 + 1;
            int i4 = b2 >> 4;
            cArr[i2] = okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i4 + 15) - (i4 | 15)];
            i2 += 2;
            cArr[i3] = okio.internal.ByteString.getHEX_DIGIT_CHARS()[(b2 + Ascii.SI) - (b2 | Ascii.SI)];
        }
        return StringsKt.concatToString(cArr);
    }

    public ByteString hmac$okio(String algorithm, ByteString key) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.toByteArray(), algorithm));
            byte[] bArrDoFinal = mac.doFinal(this.data);
            Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
            return new ByteString(bArrDoFinal);
        } catch (InvalidKeyException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public ByteString hmacSha1(ByteString key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return hmac$okio("HmacSHA1", key);
    }

    public ByteString hmacSha256(ByteString key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return hmac$okio("HmacSHA256", key);
    }

    public ByteString hmacSha512(ByteString key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return hmac$okio("HmacSHA512", key);
    }

    public final int indexOf(ByteString other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return indexOf$default(this, other, 0, 2, (Object) null);
    }

    public final int indexOf(ByteString other, int i2) {
        Intrinsics.checkNotNullParameter(other, "other");
        return indexOf(other.internalArray$okio(), i2);
    }

    public final int indexOf(byte[] other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return indexOf$default(this, other, 0, 2, (Object) null);
    }

    public int indexOf(byte[] other, int i2) {
        Intrinsics.checkNotNullParameter(other, "other");
        int length = getData$okio().length - other.length;
        int iMax = Math.max(i2, 0);
        if (iMax <= length) {
            while (!SegmentedByteString.arrayRangeEquals(getData$okio(), iMax, other, 0, other.length)) {
                if (iMax != length) {
                    iMax++;
                }
            }
            return iMax;
        }
        return -1;
    }

    public byte[] internalArray$okio() {
        return getData$okio();
    }

    public byte internalGet$okio(int i2) {
        return getData$okio()[i2];
    }

    public final int lastIndexOf(ByteString other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return lastIndexOf$default(this, other, 0, 2, (Object) null);
    }

    public final int lastIndexOf(ByteString other, int i2) {
        Intrinsics.checkNotNullParameter(other, "other");
        return lastIndexOf(other.internalArray$okio(), i2);
    }

    public final int lastIndexOf(byte[] other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return lastIndexOf$default(this, other, 0, 2, (Object) null);
    }

    public int lastIndexOf(byte[] other, int i2) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int iMin = Math.min(SegmentedByteString.resolveDefaultParameter(this, i2), getData$okio().length - other.length); -1 < iMin; iMin--) {
            if (SegmentedByteString.arrayRangeEquals(getData$okio(), iMin, other, 0, other.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public final ByteString md5() {
        return digest$okio(MessageDigestAlgorithms.MD5);
    }

    public boolean rangeEquals(int i2, ByteString other, int i3, int i4) {
        Intrinsics.checkNotNullParameter(other, "other");
        return other.rangeEquals(i3, getData$okio(), i2, i4);
    }

    public boolean rangeEquals(int i2, byte[] other, int i3, int i4) {
        Intrinsics.checkNotNullParameter(other, "other");
        return i2 >= 0 && i2 <= getData$okio().length - i4 && i3 >= 0 && i3 <= other.length - i4 && SegmentedByteString.arrayRangeEquals(getData$okio(), i2, other, i3, i4);
    }

    public final void setHashCode$okio(int i2) {
        this.hashCode = i2;
    }

    public final void setUtf8$okio(String str) {
        this.utf8 = str;
    }

    public final ByteString sha1() {
        return digest$okio("SHA-1");
    }

    public final ByteString sha256() {
        return digest$okio("SHA-256");
    }

    public final ByteString sha512() {
        return digest$okio("SHA-512");
    }

    public final int size() {
        return getSize$okio();
    }

    public final boolean startsWith(ByteString prefix) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return rangeEquals(0, prefix, 0, prefix.size());
    }

    public final boolean startsWith(byte[] prefix) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return rangeEquals(0, prefix, 0, prefix.length);
    }

    public String string(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new String(this.data, charset);
    }

    public final ByteString substring() {
        return substring$default(this, 0, 0, 3, null);
    }

    public final ByteString substring(int i2) {
        return substring$default(this, i2, 0, 2, null);
    }

    public ByteString substring(int i2, int i3) {
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(this, i3);
        if (i2 < 0) {
            throw new IllegalArgumentException("beginIndex < 0".toString());
        }
        if (iResolveDefaultParameter > getData$okio().length) {
            throw new IllegalArgumentException(("endIndex > length(" + getData$okio().length + ')').toString());
        }
        if (iResolveDefaultParameter - i2 >= 0) {
            return (i2 == 0 && iResolveDefaultParameter == getData$okio().length) ? this : new ByteString(ArraysKt.copyOfRange(getData$okio(), i2, iResolveDefaultParameter));
        }
        throw new IllegalArgumentException("endIndex < beginIndex".toString());
    }

    public ByteString toAsciiLowercase() {
        for (int i2 = 0; i2 < getData$okio().length; i2++) {
            byte b2 = getData$okio()[i2];
            if (b2 >= 65 && b2 <= 90) {
                byte[] data$okio = getData$okio();
                byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
                Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i2] = (byte) (b2 + 32);
                for (int i3 = i2 + 1; i3 < bArrCopyOf.length; i3++) {
                    byte b3 = bArrCopyOf[i3];
                    if (b3 >= 65 && b3 <= 90) {
                        bArrCopyOf[i3] = (byte) (b3 + 32);
                    }
                }
                return new ByteString(bArrCopyOf);
            }
        }
        return this;
    }

    public ByteString toAsciiUppercase() {
        for (int i2 = 0; i2 < getData$okio().length; i2++) {
            byte b2 = getData$okio()[i2];
            if (b2 >= 97 && b2 <= 122) {
                byte[] data$okio = getData$okio();
                byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
                Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i2] = (byte) (b2 + MessagePack.Code.NEGFIXINT_PREFIX);
                for (int i3 = i2 + 1; i3 < bArrCopyOf.length; i3++) {
                    byte b3 = bArrCopyOf[i3];
                    if (b3 >= 97 && b3 <= 122) {
                        bArrCopyOf[i3] = (byte) (b3 + MessagePack.Code.NEGFIXINT_PREFIX);
                    }
                }
                return new ByteString(bArrCopyOf);
            }
        }
        return this;
    }

    public byte[] toByteArray() {
        byte[] data$okio = getData$okio();
        byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    public String toString() {
        String str;
        if (getData$okio().length == 0) {
            str = "[size=0]";
        } else {
            int iCodePointIndexToCharIndex = okio.internal.ByteString.codePointIndexToCharIndex(getData$okio(), 64);
            if (iCodePointIndexToCharIndex != -1) {
                String strUtf8 = utf8();
                String strSubstring = strUtf8.substring(0, iCodePointIndexToCharIndex);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                String strReplace$default = StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(strSubstring, "\\", "\\\\", false, 4, (Object) null), "\n", "\\n", false, 4, (Object) null), "\r", "\\r", false, 4, (Object) null);
                return iCodePointIndexToCharIndex < strUtf8.length() ? "[size=" + getData$okio().length + " text=" + strReplace$default + "…]" : "[text=" + strReplace$default + AbstractJsonLexerKt.END_LIST;
            }
            if (getData$okio().length > 64) {
                StringBuilder sbAppend = new StringBuilder("[size=").append(getData$okio().length).append(" hex=");
                ByteString byteString = this;
                int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(byteString, 64);
                if (iResolveDefaultParameter > getData$okio().length) {
                    throw new IllegalArgumentException(("endIndex > length(" + getData$okio().length + ')').toString());
                }
                if (iResolveDefaultParameter < 0) {
                    throw new IllegalArgumentException("endIndex < beginIndex".toString());
                }
                if (iResolveDefaultParameter != getData$okio().length) {
                    byteString = new ByteString(ArraysKt.copyOfRange(getData$okio(), 0, iResolveDefaultParameter));
                }
                return sbAppend.append(byteString.hex()).append("…]").toString();
            }
            str = "[hex=" + hex() + AbstractJsonLexerKt.END_LIST;
        }
        return str;
    }

    public String utf8() {
        String utf8$okio = getUtf8$okio();
        if (utf8$okio != null) {
            return utf8$okio;
        }
        String utf8String = _JvmPlatformKt.toUtf8String(internalArray$okio());
        setUtf8$okio(utf8String);
        return utf8String;
    }

    public void write(OutputStream out) throws IOException {
        Intrinsics.checkNotNullParameter(out, "out");
        out.write(this.data);
    }

    public void write$okio(Buffer buffer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        okio.internal.ByteString.commonWrite(this, buffer, i2, i3);
    }
}
