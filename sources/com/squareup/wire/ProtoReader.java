package com.squareup.wire;

import com.google.common.base.Ascii;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я^\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4C\u0007\":\u0019\u007f\u0007ljA0RkP.XU2\u000f\u0002{<řc$\u007fbCU0}*\tUNog\u0005Jb\u000bI\u000f\u000e\u0016\u0007j4I[\u007fe\u0012\u001d;JoE3UoKEht<\r(288\u0002\u0005\u0007\u001f0\\&͌\u0019w{\f@/xon\u0013\u001a]\t(\u0012\u001e>N\u0002ɉ`iT8Vo&@=4\u001bipSmsx\u000b[\u001f^TU 'e,?X7c\u001akgK\u0015`pW\u0003m\bm\tv;?+wx\u001e;!\u0006\",CO;e9:%\u000b_x$'YW*K\u0019\u00146\u0011\u0013{;DJ\"N/VHE\u001c|\u0007<@;\u0007\u001cF^\u001dvB.\u0011(J_3\u000eOC9I|\u0002eI6f7*\rS\u001ek\u0007|?sT<s[/\u001d\u0003_Pi@kh\u0015\u0018ՒAm\n\u0012+\b8&HG.RB%v\u001d3[s9Q)2\u0016\u0011Ju\u001c\u001d`\u0017[0R\u0011F0\u0015.7X\u000eRn\rj\u0013\u0013hT\u00074WadZ\u0015& \u0013Na>Pi3\u001ewgh\u0018\u0001}a\u0018OGfea5kV]G\nK5\u007fhVa\u001b\u001a\"kTb3k\u0017Ra9rh8$BH\u0019\u0018\b}TN:\u0012`m8ʑ:в0ǉÅ\u0019H\tM\u000bO\u000b9wZ\u0017&/XA.\u001biR|O\u0015\u0019|~!\u007fxwB-d07YQc!VY0\u0013L|Q\u0014/y\u000ey\u007fN]K\u001b\u0015<iD&$MQQ]BY#O5@\u0002EEzs<ʻOɟ+z\u0005Ȫ_Gv2\u007f\b\u0019u\u0003ߏvߝST\u001fǱGj\u0001) d.~8Â\u0007ĕgT\u0013ϵ\u000fU\u0001\nq<|@Sā+Ǫ)\u0001wܲMA;L?\u001dD\u007fjٯ!˸aiwЃJn\u001d0\re24:ܡ{͈U]:ծ\tUg\nV\"RqYܬTܖ{\bJކ\u0005\u001bATYf\u0007UfZaɃ\n֨\u000b,\u0015ߞ'mH!\b\u0004D0o*\"S,#5Ƽ'ݱQSoƚޱKa\u0013M\u0015ϲ;*0ߔ\u0016Q"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!4o\n;v2\u000b", "", "And?V,", "\u001anZ6bu\u001bc\u001a\u007fzk,{v9u\r&{\u0016", "\nh]6g\u0005", "uK^8\\6\b0)\u007f{^9|\b\u001do\u00105y@VZ\b", ">nb", "", ":h\\6g", "@dRBe:B]\"]zi;\u007f", "", "AsPAX", "B`V", ">tb5X+%W!\u0003\n", "<dgA90>Z\u0018^\u0004\\6{\r8g", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\\D\u0001\u001e\u0016'x\fFu)>[S", "0tU3X9,b\u0015|\u0001", "", "\u001anZ6bu\u001bc\u001a\u007fzk\u0002", "0dV6a\u0014>a'z|^", "3mS\u001aX:LO\u001b~Vg+^\t>U\t.\u0005J\u0013 wKo\u0015;\u0005", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "BnZ2a", "3mS\u001aX:LO\u001b~", "", "<dgA?,GU(\u0002Y^3\u0001\u00113t\u007f'", "7mc2e5:Z\u0002~\u000em\u0013|\u00121t\u0003\u0007{G\u0005\u001f\u001bVo\r", "<dgAG(@", ">dT890>Z\u0018^\u0004\\6{\r8g", "AjX=", "AjX=:9Hc$", "3w_2V;>Rx\byM(~", "@dP15@MS'", "0dU<e,)]'\r~[3\u0011s+c\u0006(z.~\u0013\u001eC|", "", "0dU<e,)]'\r~[3\u0011s+c\u0006(z.~\u0013\u001eC|LNz25S\u000b0@|\u001a6M", "@dP1F;KW\"\u0001", "", "@dP1I(KW\"\u000eH+", "7mc2e5:Z\u0006~v]\u001dx\u00163n\u000fuH", "@dP1I(KW\"\u000eK-", "@dP190QS\u0018LG", "@dP190QS\u0018OI", "/ec2e\u0017:Q\u001fzwe,j\u0007+l{5", "4hT9W\fGQ#}~g.", "0dU<e,%S\"\u0001\na\u000b|\u00103m\u00047{?n\u0015\u0013Nk\u001b", "4na\u0012T*AB\u0015\u0001", "B`V\u0015T5=Z\u0019\f", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "ze^?8(<V\bz|", "@dP1H5D\\#\u0011\u0004?0|\u0010.", "/cS\"a2G]+\b[b,\u0004\b", "D`[BX", "<dgA90>Z\u0018f~g\u0013|\u00121t\u0003\f\u0005\u001d\u0015&\u0017U", "\u0011n\\=T5B]\"", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public class ProtoReader {
    public static final Companion Companion = new Companion(null);
    public static final int FIELD_ENCODING_MASK = 7;
    public static final int RECURSION_LIMIT = 100;
    public static final int STATE_END_GROUP = 4;
    public static final int STATE_FIXED32 = 5;
    public static final int STATE_FIXED64 = 1;
    public static final int STATE_LENGTH_DELIMITED = 2;
    public static final int STATE_PACKED_TAG = 7;
    public static final int STATE_START_GROUP = 3;
    public static final int STATE_TAG = 6;
    public static final int STATE_VARINT = 0;
    public static final int TAG_FIELD_ENCODING_BITS = 3;
    private final List<Buffer> bufferStack;
    private long limit;
    private FieldEncoding nextFieldEncoding;
    private long pos;
    private long pushedLimit;
    private int recursionDepth;
    private final BufferedSource source;
    private int state;
    private int tag;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u00116B\u0005+2ߡx\u001d߿\u001b9^C&O4Rޚ.\u0011q{B%,0\u007fESUH\u0001xޜ\"ɁkgvϺ+\u0017Q\u0013\u001e\u0016'm\u0003հ(ޯa\u0012\u0017˰\u0013{M8eok<7қ\tӯ$2*\u0600J\u0011\u000f BH>yQŐ\u001eë\u00160H\u0081\u000b^\u001bT\u001d\u001a@\t\u0015ĩSɉ`gVȤ\u0019xkBG#1l\u0019øyۢ4|Uε\u0017`5\u0016\u000faL.\u0017ʻ\bչ)S\u000bޗ#gM\rWqk\b?ѨyȅMs_̬)\f\" CO;`I̧/ԇU`\u0014ʬ{[qWh\u000eVzQԉ_ʀ\b\u000e\u000eΩ\u0019:;'~\b<6Kɂ&ĖT\u0002fۍȾ~o"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!4o\n;v2s7\b(Bi\u001f2WL\u0011", "", "\nh]6g\u0005", "u(E", " D2\"E\u001a\"=\u0002xaB\u0014`w", "", "\u0014H4\u00197&\u001e<vhYB\u0015^\u0003\u0017Am\u000e", "\"@6,9\u0010\u001e:wxZG\nfg\u0013Na\"X$o\u0005", "!S0!8&//\u0006bcM", "!S0!8&\u001f7\f^Y/z", "!S0!8&%3\u0002`iA&[h\u0016Ig\fj _", "!S0!8&,BtkiX\u000eir\u001fP", "!S0!8&\u001e<wx\\K\u0016ls", "!S0!8&\u001f7\f^Y,x", "!S0!8&-/z", "!S0!8&)/vdZ=&kd\u0011", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FieldEncoding.values().length];
            try {
                iArr[FieldEncoding.LENGTH_DELIMITED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FieldEncoding.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FieldEncoding.FIXED64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FieldEncoding.VARINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ProtoReader(BufferedSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
        this.limit = Long.MAX_VALUE;
        this.state = 2;
        this.tag = -1;
        this.pushedLimit = -1L;
        this.bufferStack = new ArrayList();
    }

    private final void afterPackableScalar(int i2) throws IOException {
        if (this.state == i2) {
            this.state = 6;
            return;
        }
        long j2 = this.pos;
        long j3 = this.limit;
        if (j2 > j3) {
            throw new IOException("Expected to end at " + this.limit + " but was " + this.pos);
        }
        if (j2 != j3) {
            this.state = 7;
            return;
        }
        this.limit = this.pushedLimit;
        this.pushedLimit = -1L;
        this.state = 6;
    }

    private final long beforeLengthDelimitedScalar() throws IOException {
        if (this.state != 2) {
            throw new ProtocolException("Expected LENGTH_DELIMITED but was " + this.state);
        }
        long j2 = this.limit - this.pos;
        this.source.require(j2);
        this.state = 6;
        this.pos = this.limit;
        this.limit = this.pushedLimit;
        this.pushedLimit = -1L;
        return j2;
    }

    private final int internalNextLengthDelimited() throws IOException {
        this.nextFieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        this.state = 2;
        int iInternalReadVarint32 = internalReadVarint32();
        if (iInternalReadVarint32 < 0) {
            throw new ProtocolException("Negative length: " + iInternalReadVarint32);
        }
        if (this.pushedLimit != -1) {
            throw new IllegalStateException();
        }
        long j2 = this.limit;
        this.pushedLimit = j2;
        long j3 = this.pos + ((long) iInternalReadVarint32);
        this.limit = j3;
        if (j3 <= j2) {
            return iInternalReadVarint32;
        }
        throw new EOFException();
    }

    private final int internalReadVarint32() throws IOException {
        int i2;
        this.source.require(1L);
        this.pos++;
        byte b2 = this.source.readByte();
        if (b2 >= 0) {
            return b2;
        }
        int i3 = (-1) - (((-1) - b2) | ((-1) - 127));
        this.source.require(1L);
        this.pos++;
        byte b3 = this.source.readByte();
        if (b3 >= 0) {
            i2 = b3 << 7;
        } else {
            int i4 = ((b3 + 127) - (b3 | 127)) << 7;
            i3 = (i3 + i4) - (i3 & i4);
            this.source.require(1L);
            this.pos++;
            byte b4 = this.source.readByte();
            if (b4 >= 0) {
                i2 = b4 << Ascii.SO;
            } else {
                i3 = (-1) - (((-1) - i3) & ((-1) - (((b4 + 127) - (b4 | 127)) << 14)));
                this.source.require(1L);
                this.pos++;
                byte b5 = this.source.readByte();
                if (b5 < 0) {
                    int i5 = i3 | (((-1) - (((-1) - b5) | ((-1) - 127))) << 21);
                    this.source.require(1L);
                    this.pos++;
                    byte b6 = this.source.readByte();
                    int i6 = i5 | (b6 << Ascii.FS);
                    if (b6 >= 0) {
                        return i6;
                    }
                    for (int i7 = 0; i7 < 5; i7++) {
                        this.source.require(1L);
                        this.pos++;
                        if (this.source.readByte() >= 0) {
                            return i6;
                        }
                    }
                    throw new ProtocolException("Malformed VARINT");
                }
                i2 = b5 << Ascii.NAK;
            }
        }
        return i3 | i2;
    }

    private final void skipGroup(int i2) throws IOException {
        while (this.pos < this.limit && !this.source.exhausted()) {
            int iInternalReadVarint32 = internalReadVarint32();
            if (iInternalReadVarint32 == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i3 = iInternalReadVarint32 >> 3;
            int i4 = iInternalReadVarint32 & 7;
            if (i4 == 0) {
                this.state = 0;
                readVarint64();
            } else if (i4 == 1) {
                this.state = 1;
                readFixed64();
            } else if (i4 == 2) {
                long jInternalReadVarint32 = internalReadVarint32();
                this.pos += jInternalReadVarint32;
                this.source.skip(jInternalReadVarint32);
            } else {
                if (i4 == 3) {
                    int i5 = this.recursionDepth + 1;
                    this.recursionDepth = i5;
                    if (i5 > 100) {
                        throw new IOException("Wire recursion limit exceeded");
                    }
                    try {
                        skipGroup(i3);
                    } finally {
                    }
                    this.recursionDepth--;
                }
                if (i4 == 4) {
                    if (i3 != i2) {
                        throw new ProtocolException("Unexpected end group");
                    }
                    return;
                } else {
                    if (i4 != 5) {
                        throw new ProtocolException("Unexpected field encoding: " + i4);
                    }
                    this.state = 5;
                    readFixed32();
                }
            }
        }
        throw new EOFException();
    }

    /* JADX INFO: renamed from: -forEachTag, reason: not valid java name */
    public final ByteString m8719forEachTag(Function1<? super Integer, ? extends Object> tagHandler) throws IOException {
        Intrinsics.checkNotNullParameter(tagHandler, "tagHandler");
        long jBeginMessage = beginMessage();
        while (true) {
            int iNextTag = nextTag();
            if (iNextTag == -1) {
                return endMessageAndGetUnknownFields(jBeginMessage);
            }
            tagHandler.invoke(Integer.valueOf(iNextTag));
        }
    }

    public void addUnknownField(int i2, FieldEncoding fieldEncoding, Object obj) throws IOException {
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        ProtoWriter protoWriter = new ProtoWriter(this.bufferStack.get(this.recursionDepth - 1));
        ProtoAdapter<?> protoAdapterRawProtoAdapter = fieldEncoding.rawProtoAdapter();
        Intrinsics.checkNotNull(protoAdapterRawProtoAdapter, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
        protoAdapterRawProtoAdapter.encodeWithTag(protoWriter, i2, obj);
    }

    public boolean beforePossiblyPackedScalar$wire_runtime() throws ProtocolException {
        int i2 = this.state;
        if (i2 == 0 || i2 == 1) {
            return true;
        }
        if (i2 != 2) {
            if (i2 == 5) {
                return true;
            }
            throw new ProtocolException("unexpected state: " + this.state);
        }
        if (this.pos < this.limit) {
            return true;
        }
        this.limit = this.pushedLimit;
        this.pushedLimit = -1L;
        this.state = 6;
        return false;
    }

    public long beginMessage() throws IOException {
        if (this.state != 2) {
            throw new IllegalStateException("Unexpected call to beginMessage()".toString());
        }
        int i2 = this.recursionDepth + 1;
        this.recursionDepth = i2;
        if (i2 > 100) {
            throw new IOException("Wire recursion limit exceeded");
        }
        if (i2 > this.bufferStack.size()) {
            this.bufferStack.add(new Buffer());
        }
        long j2 = this.pushedLimit;
        this.pushedLimit = -1L;
        this.state = 6;
        return j2;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "3X\u0001;v\u0007T\\fK\u0015\u007fc(-Ua-\u0017+km G\u0005Q|ye\u0003\nomXhU\u0015%", replaceWith = @ReplaceWith(expression = "endMessageAndGetUnknownFields(token)", imports = {}))
    @InterfaceC1492Gx
    public final void endMessage(long j2) throws IOException {
        endMessageAndGetUnknownFields(j2);
    }

    public ByteString endMessageAndGetUnknownFields(long j2) throws IOException {
        if (this.state != 6) {
            throw new IllegalStateException("Unexpected call to endMessage()".toString());
        }
        int i2 = this.recursionDepth - 1;
        this.recursionDepth = i2;
        if (i2 < 0 || this.pushedLimit != -1) {
            throw new IllegalStateException("No corresponding call to beginMessage()".toString());
        }
        if (this.pos != this.limit && i2 != 0) {
            throw new IOException("Expected to end at " + this.limit + " but was " + this.pos);
        }
        this.limit = j2;
        Buffer buffer = this.bufferStack.get(i2);
        return buffer.size() > 0 ? buffer.readByteString() : ByteString.EMPTY;
    }

    public long nextFieldMinLengthInBytes() {
        FieldEncoding fieldEncoding = this.nextFieldEncoding;
        int i2 = fieldEncoding == null ? -1 : WhenMappings.$EnumSwitchMapping$0[fieldEncoding.ordinal()];
        if (i2 == -1) {
            throw new IllegalStateException("nextFieldEncoding is not set");
        }
        if (i2 == 1) {
            return this.limit - this.pos;
        }
        if (i2 == 2) {
            return 4L;
        }
        if (i2 == 3) {
            return 8L;
        }
        if (i2 == 4) {
            return 1L;
        }
        throw new NoWhenBranchMatchedException();
    }

    public int nextLengthDelimited() throws IOException {
        int i2 = this.state;
        if (i2 == 6 || i2 == 2) {
            return internalNextLengthDelimited();
        }
        throw new IllegalStateException("Unexpected call to nextDelimited()".toString());
    }

    public int nextTag() throws IOException {
        int i2 = this.state;
        if (i2 == 7) {
            this.state = 2;
            return this.tag;
        }
        if (i2 != 6) {
            throw new IllegalStateException("Unexpected call to nextTag()");
        }
        while (this.pos < this.limit && !this.source.exhausted()) {
            int iInternalReadVarint32 = internalReadVarint32();
            if (iInternalReadVarint32 == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i3 = iInternalReadVarint32 >> 3;
            this.tag = i3;
            int i4 = (iInternalReadVarint32 + 7) - (iInternalReadVarint32 | 7);
            if (i4 == 0) {
                this.nextFieldEncoding = FieldEncoding.VARINT;
                this.state = 0;
                return this.tag;
            }
            if (i4 == 1) {
                this.nextFieldEncoding = FieldEncoding.FIXED64;
                this.state = 1;
                return this.tag;
            }
            if (i4 == 2) {
                internalNextLengthDelimited();
                return this.tag;
            }
            if (i4 != 3) {
                if (i4 == 4) {
                    throw new ProtocolException("Unexpected end group");
                }
                if (i4 != 5) {
                    throw new ProtocolException("Unexpected field encoding: " + i4);
                }
                this.nextFieldEncoding = FieldEncoding.FIXED32;
                this.state = 5;
                return this.tag;
            }
            skipGroup(i3);
        }
        return -1;
    }

    public FieldEncoding peekFieldEncoding() {
        return this.nextFieldEncoding;
    }

    public ByteString readBytes() throws IOException {
        long jBeforeLengthDelimitedScalar = beforeLengthDelimitedScalar();
        this.source.require(jBeforeLengthDelimitedScalar);
        return this.source.readByteString(jBeforeLengthDelimitedScalar);
    }

    public int readFixed32() throws IOException {
        int i2 = this.state;
        if (i2 != 5 && i2 != 2) {
            throw new ProtocolException("Expected FIXED32 or LENGTH_DELIMITED but was " + this.state);
        }
        this.source.require(4L);
        this.pos += (long) 4;
        int intLe = this.source.readIntLe();
        afterPackableScalar(5);
        return intLe;
    }

    public long readFixed64() throws IOException {
        int i2 = this.state;
        if (i2 != 1 && i2 != 2) {
            throw new ProtocolException("Expected FIXED64 or LENGTH_DELIMITED but was " + this.state);
        }
        this.source.require(8L);
        this.pos += (long) 8;
        long longLe = this.source.readLongLe();
        afterPackableScalar(1);
        return longLe;
    }

    public String readString() throws IOException {
        long jBeforeLengthDelimitedScalar = beforeLengthDelimitedScalar();
        this.source.require(jBeforeLengthDelimitedScalar);
        return this.source.readUtf8(jBeforeLengthDelimitedScalar);
    }

    public void readUnknownField(int i2) throws IOException {
        FieldEncoding fieldEncodingPeekFieldEncoding = peekFieldEncoding();
        Intrinsics.checkNotNull(fieldEncodingPeekFieldEncoding);
        addUnknownField(i2, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(this));
    }

    public int readVarint32() throws IOException {
        int i2 = this.state;
        if (i2 != 0 && i2 != 2) {
            throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.state);
        }
        int iInternalReadVarint32 = internalReadVarint32();
        afterPackableScalar(0);
        return iInternalReadVarint32;
    }

    public long readVarint64() throws IOException {
        int i2 = this.state;
        if (i2 != 0 && i2 != 2) {
            throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.state);
        }
        long j2 = 0;
        for (int i3 = 0; i3 < 64; i3 += 7) {
            this.source.require(1L);
            this.pos++;
            byte b2 = this.source.readByte();
            j2 = (-1) - (((-1) - j2) & ((-1) - (((long) ((b2 + 127) - (127 | b2))) << i3)));
            if ((-1) - (((-1) - b2) | ((-1) - 128)) == 0) {
                afterPackableScalar(0);
                return j2;
            }
        }
        throw new ProtocolException("WireInput encountered a malformed varint");
    }

    public void skip() throws IOException {
        int i2 = this.state;
        if (i2 == 0) {
            readVarint64();
            return;
        }
        if (i2 == 1) {
            readFixed64();
            return;
        }
        if (i2 == 2) {
            this.source.skip(beforeLengthDelimitedScalar());
        } else {
            if (i2 != 5) {
                throw new IllegalStateException("Unexpected call to skip()");
            }
            readFixed32();
        }
    }
}
