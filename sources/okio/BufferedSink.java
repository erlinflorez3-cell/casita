package okio;

import androidx.exifinterface.media.ExifInterface;
import com.dynatrace.android.agent.AdkSettings;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
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
@Metadata(bv = {}, d1 = {"ЯX\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\"2\u0015\u007f\u0007tjAӄLe^.ZS0\u000fs{B4cҕyCI[\"}(\tWN}gvJp\u000bK\u000f\u0014\u001d\u0001j2W]xk\u001e\u0017˰JoU3UoC<htL\u0005(݅(-\u0010ڎ1\u001aXG@v)C\u0014\u0012 1XphTSrM  \u000bV /Ȧ#\f\u0017<Vru:]݊I\u000e\u000bT5fH|{\u0015\rxo\u0013\u0005j6+nA{9ma\u0011\u0012j[mšouK\u0011\u0001'U8\u0010\u0018 Tf\u000b,\u0015Y˽=a\u00012t\u0005\u007fm<+9]{K~\u001dX{\t\f%<2\u001dLK\u0011<;%~\b<ޗ%vaQh\u0002\rTF\u001f*T%0\u00183YݍKj_rS\u0019|I,\t\u001b,;\u0001\u001d0\fX\u001cp-\u001b\u0003\u0007\u0018U\u001aVKSf\n\bƝ\u001e\b~n\u001a*2Cw\u0004=\f).E9}\u007f\u00021/\u0001\u001aHr{'\tntki\u0001[\u0007F7$E@!\f\tե\u0015\tyglXZ \u0014@\u001d\u0015\f + \u000bɼl%3)fO\u0017}1q&\u00183I~7\bʤ\u001c\u0012eRv3ce*4*`\u0005/W<\u0011ڳ\tjPo$Z\u000b7hV\u0011x\u001e\u0015\u0014D|ۼC6M\u000e44Z@_\u0001]V\u0011<ZA+ȁ\u0010^v)\u0017Ta8I\u000el\u0003\u0017 h\\\u001fב\u0018|WE\u0015`PA\bu}'4u:hbêS\u000b\r\u0015\u0018G\u0016[\u000ep5$\u0004w\u0014 D֝iU=^+\u000f-8x&u[Z\u0016}Q{ȼW~\u000b\u001e';\u0017S\u0018\fx\u0017D`\u0019q\u0016x_H\u0005\u0002\u000b#6ۭ0}oj\u0013G\u0012y;_Lq\u000b\u0003\bK~<\u000b.7\u001eS\u0010 &\u000b[ECUD\\\u001c\\=#\fui\u001eЃ*f\u001dJ\re2Q*:8\u0001_\bJ;fԾ\n\u0003LF<l1gxn\u00060Z\tb\u001ccLO\u000e\tVf\\QSFt\u0015W%p\u0005ܪj\u0017}*L.\u000e9:gN$lD=\u0011{U>ǁoљ`\u000fb\u0011\u0010\u000e\n5ޮ\u0011\u001c?M߁Vłׁ0\n{\u001a<`iaƆ@7Ԙ8+"}, d2 = {"\u001anZ6bu\u001bc\u001a\u007fzk,{v3n\u0006}", "\u001anZ6bu,W\"\u0005P", "\u001aiPCTuGW#Hxa(\u0006\u0012/l\u000eqmM\u0005&\u0013Dv\u000e\u0019\u000b457\u0001\u001c@v\u00165#", "0tU3X9", "\u001anZ6bu\u001bc\u001a\u007fzk\u0002", "5dc\u000fh-?S&", "u(;<^0H\u001du\u000f{_,\n^", "3lXA", "3lXA66F^ ~\n^\u001a|\u000b7e\t7\n", "4kd@[", "", "=tc=h;,b&~vf", "\u001aiPCTuB]bh\u000bm7\r\u0018\u001dt\r(wHV", "EqXAX", "And?V,", "", "=eU@X;", "", "0xc266N\\(", "0xc2F;KW\"\u0001", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "\u001anZ6bu,])\fx^\u0002", "", "EqXAX\bEZ", "EqXAX\tRb\u0019", AdkSettings.PLATFORM_TYPE_MOBILE, "EqXAX\u000b>Q\u001d\u0007ve\u0013\u0007\u00121", "D", "EqXAX\u000f>f\u0015}z\\0\u0005\u00056U\t6\u007fB\n\u0017\u0016.y\u0017>", "EqXAX\u0010Gb", "7", "EqXAX\u0010Gb\u007f~", "EqXAX\u0013H\\\u001b", "EqXAX\u0013H\\\u001bez", "EqXAX\u001aA]&\u000e", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "EqXAX\u001aA]&\u000ea^", "EqXAX\u001aM`\u001d\b|", "Asa6a.", "", "1gP?f,M", "\u001aiPCTuGW#Hxa(\n\u0017/tI\u0006~<\u000e%\u0017VE", "0dV6a\u0010GR\u0019\u0012", "3mS\u0016a+>f", "EqXAX\u001cMTk", "EqXAX\u001cMTk\\\u0005],g\u00133n\u000f", "1nS2C6B\\(", "\u001anZ6bu+S\u0015\u0006Wn-}\t<e~\u0016\u007fI\u0007l", "=jX<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public interface BufferedSink extends Sink, WritableByteChannel {
    @Deprecated(level = DeprecationLevel.WARNING, message = "0U\u0012:u4)f\u0018])\u0007*TAaa\f\u0010,\u0019J!X|K\u00012\u00174-t{`iCQ", replaceWith = @ReplaceWith(expression = "buffer", imports = {}))
    @InterfaceC1492Gx
    Buffer buffer();

    BufferedSink emit() throws IOException;

    BufferedSink emitCompleteSegments() throws IOException;

    @Override // okio.Sink, java.io.Flushable
    void flush() throws IOException;

    Buffer getBuffer();

    OutputStream outputStream();

    BufferedSink write(ByteString byteString) throws IOException;

    BufferedSink write(ByteString byteString, int i2, int i3) throws IOException;

    BufferedSink write(Source source, long j2) throws IOException;

    BufferedSink write(byte[] bArr) throws IOException;

    BufferedSink write(byte[] bArr, int i2, int i3) throws IOException;

    long writeAll(Source source) throws IOException;

    BufferedSink writeByte(int i2) throws IOException;

    BufferedSink writeDecimalLong(long j2) throws IOException;

    BufferedSink writeHexadecimalUnsignedLong(long j2) throws IOException;

    BufferedSink writeInt(int i2) throws IOException;

    BufferedSink writeIntLe(int i2) throws IOException;

    BufferedSink writeLong(long j2) throws IOException;

    BufferedSink writeLongLe(long j2) throws IOException;

    BufferedSink writeShort(int i2) throws IOException;

    BufferedSink writeShortLe(int i2) throws IOException;

    BufferedSink writeString(String str, int i2, int i3, Charset charset) throws IOException;

    BufferedSink writeString(String str, Charset charset) throws IOException;

    BufferedSink writeUtf8(String str) throws IOException;

    BufferedSink writeUtf8(String str, int i2, int i3) throws IOException;

    BufferedSink writeUtf8CodePoint(int i2) throws IOException;
}
