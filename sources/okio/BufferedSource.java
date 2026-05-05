package okio;

import com.dynatrace.android.agent.AdkSettings;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яč\u0014D57\u001eq\u007fZDkt\u001aA\u000eֶ\u0013.X~*,\u0018x\u000ffxB8ǏmH<Y[ճ\u0017k\n7,[*rK;k\u001a\u0006\"\u000fPVg}nRZ\u0011E\u0017\u0006$~r,OV\u0001] \u001f:ԏw?IMw=?c|6\u0013 :\">}\r\u0001(2P\u0010|zKK\u001a\u001e8ϋx:h\rU\u0005 \u0019\u000e>6\u0001&ձoNDԟt]P/+\u0003oBV'u0\u0005ձ\u0013;j܋=v\u0010\u001d[@e5]+a\u0004\u001fR\nAId:C\u0013m?'YO:{~f\u000e\u001b-+}\u0015\u000ev4e\u001dQ\u000f\u0016mO\u0018yYW&(&\u0003,\u0011J\r&\u0006UR^1(q \u000ea|9w\tn\u0010eZ\u007f)if\u001b3\tK+g%\u0017UoF1Ne\u00045\u0011,/\u0019nOc\u001b2)#)[\u0010Q_YpAV[\"Yk{J\u0015+\u00188\u000bHG.7,\u0015<$=7\nGS%y\r`D\u0016~K\u00051awa`@PvF;8\u0019$ZrrK\u0010\u0019jf;)MJ\\7\u0002\u0016#8\\&JQ)\u001eYgh\u0018r\u0014\u0002R+=wOY\u001d}T{\u0002dAHic>Р\u0019\u001b\\UJv\u001dX\u0015H\u0004\u0010hq@\"`P\u001b\u0014\u0006\t\\N:!xc:BB@I\u0019\u000b\u001bx\u0007,WY|7g\u000bl\u001e\fl3R\u0011\u001a(\u0003\u001f\u0019P\u000b\b k\u0007aD|\u000f9se\u001aC'?m\"\u0017K-'\u0015\u0019\f\u007fu\u0003\u0013k\u0015\u000b$\u000fm{N-J=_IU\u0013=\u001aY6\u0010B]L!|\u0002Q ?\u0013|(&\u0002\rvu\u0016\u0007\t,\u000frzSb1:v\r\u0010i,-\u0006\b\u007f^zum\u001b/$DW\u0012\u001bYji~!M-,D\u0019oP\u0018e1Q?5\u0016&\u001cu9*cw\u0010Fy\u0011\u001dl\u0019.\u0012:\u0004.o\u0011_\u000e6IPaY-FhH5\tPi\u0003w6JOXUAVc|p\u0005[}\u000f=\u0018~\u0007Z(7z$P!\u0012\u00164\\\u0003ZwQ\u0018,^q'AQa\u007f\u0006mydQnW\u0010\u0019 In@$\u0004D\u001f]p.H\u0006\"/|e\u0004h\u0013b!$bC\u0003,SIb\u0011\u001e\u0010)\b\r\u0004W\u001d@j\f;\u0005\u0016\u001b\u001d%\\V.xE\u000fKp%G\u0015AI\u00115_/4j\u001d=q^\u0019SK6Kn]-~%Ys\u001b]c>f-#E\fpy\u0006D\u001c_)\u001cs \u0010FF\u0015\u001dpGa]\u001a\u0017m'H^9\u0003+r-\u0005 \u0017jNPV/~\u000b&T\n=\u0013_s;up^dN&N\n>I\u001fR[\u001f\u000e\u0013btHs*}3K|\u0003\u0014U)\u001ew\u0004\f\u0016S8'2\"Q`eB~\n\f#\u0001::$p7!\u0013~&42X\r\u000b\n\\\u0010|sJA\u0010IvY\u001a\u001bQD5C\u0005\u0006pS/\u001dRqz\u001b\u0007U9\u001a\u00175d2\u0007-~VOK\u0016S!\u0010r<'Rf\u00131\u0006\u001aݻ4Y^\b\u0011d@Yq!\tq_]\u001d+u&X\u001ewTݟ\"}-7>\u00128\u0013@\u0015iy}Br!tlp_T\u0003;8ru$)B~UŃ`ǚ\u00178^t$g=;آ\u001e[\u000f\u0007ؕ\u0006ʗكI*)3X^I6ס\u000f0Ŋz\u0010"}, d2 = {"\u001anZ6bu\u001bc\u001a\u007fzk,{v9u\r&{\u0016", "\u001anZ6bu,])\fx^\u0002", "\u001aiPCTuGW#Hxa(\u0006\u0012/l\u000eqh@|\u0016\u0013Dv\u000e\u0019\u000b457\u0001\u001c@v\u00165#", "0tU3X9", "\u001anZ6bu\u001bc\u001a\u007fzk\u0002", "5dc\u000fh-?S&", "u(;<^0H\u001du\u000f{_,\n^", "3wW.h:MS\u0018", "", "7mS2k\u0016?", "", AdkSettings.PLATFORM_TYPE_MOBILE, "", "4q^:<5=S,", "Bn8;W,Q", "0xc2f", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "7mS2k\u0016?3 ~\u0003^5\f", "B`a4X;\u001bg(~\t", "7m_Bg\u001aM`\u0019z\u0003", "\u001aiPCTuB]bb\u0004i<\fv>r\u007f$\u0004\u0016", ">dT8", "@`]4X\fJc\u0015\u0006\t", "=eU@X;", "0xc2f\u0016?T'~\n", "", "0xc266N\\(", "@dP1", "Ah]8", "", "@dP143E", "\u001anZ6bu,W\"\u0005P", "@dP15@MS", "@dP15@MSt\f\bZ@", "@dP15@MS\u0007\u000e\bb5~", "@dP17,<W!z\u0002E6\u0006\u000b", "@dP19<EZ-", "", "@dP1;,QO\u0018~xb4x\u0010\u001fn\u000e,}I\u0001\u0016}Qx\u0010", "@dP1<5M", "@dP1<5M:\u0019", "@dP1?6GU", "@dP1?6GU\u007f~", "@dP1F/H`(", "", "@dP1F/H`(ez", "@dP1F;KW\"\u0001", "", "1gP?f,M", "\u001aiPCTuGW#Hxa(\n\u0017/tI\u0006~<\u000e%\u0017VE", "@dP1H;?&", "@dP1H;?&v\ty^\u0017\u0007\r8t", "@dP1H;?&\u007f\u0003\u0004^", "@dP1H;?&\u007f\u0003\u0004^\u001a\f\u00163c\u000f", ":h\\6g", "@d`BX:M", "@d`B\\9>", "Ad[2V;", "=oc6b5L", "\u001anZ6bu(^(\u0003\u0005g:R", "\"", "", "\u001anZ6bu-g$~yH7\f\r9n\u000e}", "uK^8\\6\bB-\nz]\u0016\b\u00183o\t6Q\u0004g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#", "AjX=", "\u001anZ6bu+S\u0015\u0006Wn-}\t<e~\u0016\u0006P\u000e\u0015\u0017\u001d", "=jX<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public interface BufferedSource extends Source, ReadableByteChannel {
    @Deprecated(level = DeprecationLevel.WARNING, message = "0U\u0012:u4)f\u0018])\u0007*TAaa\f\u0010,\u0019J!X|K\u00012\u00174-t{`iCQ", replaceWith = @ReplaceWith(expression = "buffer", imports = {}))
    @InterfaceC1492Gx
    Buffer buffer();

    boolean exhausted() throws IOException;

    Buffer getBuffer();

    long indexOf(byte b2) throws IOException;

    long indexOf(byte b2, long j2) throws IOException;

    long indexOf(byte b2, long j2, long j3) throws IOException;

    long indexOf(ByteString byteString) throws IOException;

    long indexOf(ByteString byteString, long j2) throws IOException;

    long indexOfElement(ByteString byteString) throws IOException;

    long indexOfElement(ByteString byteString, long j2) throws IOException;

    InputStream inputStream();

    BufferedSource peek();

    boolean rangeEquals(long j2, ByteString byteString) throws IOException;

    boolean rangeEquals(long j2, ByteString byteString, int i2, int i3) throws IOException;

    int read(byte[] bArr) throws IOException;

    int read(byte[] bArr, int i2, int i3) throws IOException;

    long readAll(Sink sink) throws IOException;

    byte readByte() throws IOException;

    byte[] readByteArray() throws IOException;

    byte[] readByteArray(long j2) throws IOException;

    ByteString readByteString() throws IOException;

    ByteString readByteString(long j2) throws IOException;

    long readDecimalLong() throws IOException;

    void readFully(Buffer buffer, long j2) throws IOException;

    void readFully(byte[] bArr) throws IOException;

    long readHexadecimalUnsignedLong() throws IOException;

    int readInt() throws IOException;

    int readIntLe() throws IOException;

    long readLong() throws IOException;

    long readLongLe() throws IOException;

    short readShort() throws IOException;

    short readShortLe() throws IOException;

    String readString(long j2, Charset charset) throws IOException;

    String readString(Charset charset) throws IOException;

    String readUtf8() throws IOException;

    String readUtf8(long j2) throws IOException;

    int readUtf8CodePoint() throws IOException;

    String readUtf8Line() throws IOException;

    String readUtf8LineStrict() throws IOException;

    String readUtf8LineStrict(long j2) throws IOException;

    boolean request(long j2) throws IOException;

    void require(long j2) throws IOException;

    int select(Options options) throws IOException;

    <T> T select(TypedOptions<T> typedOptions) throws IOException;

    void skip(long j2) throws IOException;
}
