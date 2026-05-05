package okhttp3;

import cz.msebera.android.httpclient.client.utils.URLEncodedUtils;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSink;
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
@Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u0016DLш|\u0004O$8\u000b<N\u0007\"2\u0013\u007f\u0007tpA0JeP.`Z2şs{J$c$wICU0}*ޛWNupvϺb\u000bQ\u000f\u000e\u0016~kBկs\u0013\u000e\u0012=1zoXM\u000e\u0011Cʠp~D\u0005882:\n\u0005/\u001cXI \u0001\tFc\u0012\"2PphT;Nŋ\u001e\u0012\u0014Bh\u0007,d\u007fNdQ3q\u000351\r\u0002B|2&DEY\u001bRl';x\u0012\"9MO5C+\u001c\u000f\u0015`s?1A\"A\u0013u?'YO<cDg\u0018\u0014C-\u007f\u0011k\u007f>\\3W)\u001750gcyVT-Þ~{\u0013LL\u001a\u00148`.[\u001c\u0017\f\u001c@\rr\u0002F\u0019\u001alT\u0018z\u0010?G+\u000eFC;1e\u007fuk\u001d\\L\u0014\u0005;4i\u00017/ik&`C3\u0005{_Di@k\\\u0015\u001e*O{\u0004\th\u0012,\u00140u\u0002]|gч\u0019É;[A\u05faq}\u0010K\\m\u0007\u0007ph\u0002k\u0001I\u0017̑pގ;*\u0011ȱ+Sr\n\u0004P\u0003^bVܖ X\u001f\u007f\u000e\u0018.cʥ@<"}, d2 = {"\u001anZ5g;I!b_\u0005k4Y\u0013.yU", "\u001anZ5g;I!bkzj<|\u0017>B\n'\u0010\u0016", "3mR<W,=<\u0015\u0007zl", "", "", "3mR<W,=D\u0015\u0006\u000b^:", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;f-wQ|`'Vs\u0015\u0006])ChSc(", "Ahi2", "", "u(8", "1n]AX5M:\u0019\b|m/", "", "1n]AX5MB-\nz", "\u001anZ5g;I!bfz]0xwCp\u007f}", "3mR<W,=<\u0015\u0007z", "7mS2k", "3mR<W,=D\u0015\u0006\u000b^", "<`\\2", "zcT=e,<O(~yX:\u0001\u001e/", "D`[BX", "EqXAX\u0016K1#\u000f\u0004m\t\u0011\u0018/s", "Ah]8", "\u001anZ6bu\u001bc\u001a\u007fzk,{v3n\u0006}", "1nd;g\tRb\u0019\r", "", "EqXAX\u001bH", "", "\u0010tX9W,K", "\u0011n\\=T5B]\"", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class FormBody extends RequestBody {
    private final List<String> encodedNames;
    private final List<String> encodedValues;
    public static final Companion Companion = new Companion(null);
    private static final MediaType CONTENT_TYPE = MediaType.Companion.get(URLEncodedUtils.CONTENT_TYPE);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\":1\u007f\u0007tvA0JiP.hS2ş\u0002ڔd$\n#2TAZ*\u0006(\t]N\u007fi\u0005I\t\fß\u0013\u0006$z3@W\\\u0011]@ƁbF}GKM\u001eBid\u0003?\u001d `'\u0001\u000e\u0013\u000b2*vƵ'~QS$\u0012^E!>`\u0016e\u0005H\u0017NB.\f6\\\u0016Z\u0007Vz]R19\u0002\u0018C%ώa݁\u0001M\u0015Ͽ%9\u001byy$;BG5C*\u0002\u0007]ѻ]ύ\u0007?yܵUz5-CO\u0004YFX.\u0019C/&\u0558_ę*\\\rĩԉ\u00104"}, d2 = {"\u001anZ5g;I!b_\u0005k4Y\u0013.y>\u0005\fD\b\u0016\u0017TE", "", "1gP?f,M", "\u001aiPCTuGW#Hxa(\n\u0017/tI\u0006~<\u000e%\u0017VE", "uKY.i(\b\\\u001d\tD\\/x\u0016=e\u000fqYC|$%G~c\u007fg", "<`\\2f", "", "", "D`[BX:", "/cS", "<`\\2", "D`[BX", "/cS\u0012a*HR\u0019}", "0tX9W", "\u001anZ5g;I!b_\u0005k4Y\u0013.yU", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Builder {
        private final Charset charset;
        private final List<String> names;
        private final List<String> values;

        public Builder() {
            this(null, 1, null);
        }

        public Builder(Charset charset) {
            this.charset = charset;
            this.names = new ArrayList();
            this.values = new ArrayList();
        }

        public /* synthetic */ Builder(Charset charset, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : charset);
        }

        public final Builder add(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.names.add(HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.Companion, name, 0, 0, HttpUrl.FORM_ENCODE_SET, false, false, true, false, this.charset, 91, null));
            this.values.add(HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.Companion, value, 0, 0, HttpUrl.FORM_ENCODE_SET, false, false, true, false, this.charset, 91, null));
            return this;
        }

        public final Builder addEncoded(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.names.add(HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.Companion, name, 0, 0, HttpUrl.FORM_ENCODE_SET, true, false, true, false, this.charset, 83, null));
            this.values.add(HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.Companion, value, 0, 0, HttpUrl.FORM_ENCODE_SET, true, false, true, false, this.charset, 83, null));
            return this;
        }

        public final FormBody build() {
            return new FormBody(this.names, this.values);
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٨\u001cԥ&\tWȞ˝kq"}, d2 = {"\u001anZ5g;I!b_\u0005k4Y\u0013.y>\u0006\u0006H\f\u0013 Ky\u0017\u0012", "", "u(E", "\u0011N=!8\u0015-M\bre>", "\u001anZ5g;I!bfz]0xwCp\u007f}", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public FormBody(List<String> encodedNames, List<String> encodedValues) {
        Intrinsics.checkNotNullParameter(encodedNames, "encodedNames");
        Intrinsics.checkNotNullParameter(encodedValues, "encodedValues");
        this.encodedNames = Util.toImmutableList(encodedNames);
        this.encodedValues = Util.toImmutableList(encodedValues);
    }

    private final long writeOrCountBytes(BufferedSink bufferedSink, boolean z2) throws EOFException {
        Buffer buffer;
        if (z2) {
            buffer = new Buffer();
        } else {
            Intrinsics.checkNotNull(bufferedSink);
            buffer = bufferedSink.getBuffer();
        }
        int size = this.encodedNames.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 > 0) {
                buffer.writeByte(38);
            }
            buffer.writeUtf8(this.encodedNames.get(i2));
            buffer.writeByte(61);
            buffer.writeUtf8(this.encodedValues.get(i2));
        }
        if (!z2) {
            return 0L;
        }
        long size2 = buffer.size();
        buffer.clear();
        return size2;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = RRWebVideoEvent.JsonKeys.SIZE, imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_size */
    public final int m10700deprecated_size() {
        return size();
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        return writeOrCountBytes(null, true);
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return CONTENT_TYPE;
    }

    public final String encodedName(int i2) {
        return this.encodedNames.get(i2);
    }

    public final String encodedValue(int i2) {
        return this.encodedValues.get(i2);
    }

    public final String name(int i2) {
        return HttpUrl.Companion.percentDecode$okhttp$default(HttpUrl.Companion, encodedName(i2), 0, 0, true, 3, null);
    }

    public final int size() {
        return this.encodedNames.size();
    }

    public final String value(int i2) {
        return HttpUrl.Companion.percentDecode$okhttp$default(HttpUrl.Companion, encodedValue(i2), 0, 0, true, 3, null);
    }

    @Override // okhttp3.RequestBody
    public void writeTo(BufferedSink sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        writeOrCountBytes(sink, false);
    }
}
