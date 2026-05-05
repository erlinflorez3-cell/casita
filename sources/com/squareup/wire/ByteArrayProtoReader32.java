package com.squareup.wire;

import com.google.common.base.Ascii;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.Buffer;
import okio.ByteString;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яn\u001d<K!&i\u0016DLш|\u0004O\u00168é6B\r(4\u0012}\rnjO0L͜P.`r2\u000f\u0002{<řc$\bCC٥\"}8\tWNmgvJp\u000bK\u000f\f\u001a\u0001j:I]xc\u0014\u00172PxG\u074cUoKEht<\u0006(20?\u0002\u0005\u0007 2H\u001e͌\u0003CQ\u000f\u001a0NsBR\u0013N\u000b܅(ßn /\u001d\u001d\t^:Vlu:]$\u0013oHN5aH|{\u0010VZ-\r\u0005e6+n:߱\u0019'Y\b\u0015X$E\u0011Q\n=3{m;sO\u0002kNX.\u0017[?\u0018\u001bk\b>\\3g\u0011\u00105BgcyST<@\u0001\n%T\u0004<\tm\\v3(\u007f \u000eaw9S\tV\u0010xZ\u007f)d|+m\bAFQ\u001d|P\u0010G_b\u007f\u0002\u0013)6#/\fgo\u001d\u001cn33T&naUN\\`N8\\\u0004mLvp\"B\u0004^]FCD\u0017<8=7\n[i54\bVg\u007fv3\u0005/g2XVe:nD:p\u001dT`R\u000b\u001dk~W\u001f,YS*{\u001f}6;fp@B/N(N}k0~\u0016c\u0018OGfe\u00025\u007fVeG\nK5\u007f\u0001@e`#,?jeKX/Ha9r\\V%xH3\u001e\u0006*\\N:0bC\u007f%L,_\u001c#)\u0011#,qY|7|\u000bl\u001e\bl3R\u0006\u001a(\u00035\u0019P\u000b| m\u0007yD~v![r\u0018Ia,cT\u00014+&M\u0013<\u000eU\u0004dGz\nFyc/8\u0016H<\u0018/\u0006!\u001d3A20CuP\u0001\u0019iM@*A|B\u001dI\u001eFg6\u000f!0n\u001ebO\u0003\u001ahv'x1>|\u007f(\u0019\rz\u0010ibCs>wuIY\u0005TF6\u001d\u001fLMGor\tC-['K\u0017NҤ1ֵe]q۰~\u0006p\u0011>t\u0014\u0007\u0003Ϧ\"̔fQeЦ\fDW]\u0017>P'CÚN\u05f8nw\u0010ȷY@\u001b:`A\u0013s-ИYߵ3}n߿|\u0019~^s:ArTұ:ʡ.sK͟djQ.)M\u0002jDޱWů\u000fJ\u0017Ϙ[\b?x*\u001ck#-̳nס4\u0006{̸\u0007OIm\u001d>\u001f#b8\u0013ލ\u0017ͲXi\u000e؋K\u0012Tl'\u001dBD\u0004;\u0005\u001d\u0003\u00073ƊJϖdEhԠz\u000f\r\u001fK \u000f4_\u0016D۱`вg2\tҵ¡\rU"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqXT\u0010\u0017rT|\nPa2?h\b\r7i\u0015.Z\u0011\bA", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!4o\n;v2\u0003&S", "And?V,", "", ">nb", "", ":h\\6g", "\nh]6g\u0005", "uZ1\u0016<o/", "@dRBe:B]\"]zi;\u007f", "AsPAX", "B`V", ">tb5X+%W!\u0003\n", "<dgA90>Z\u0018^\u0004\\6{\r8g", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\\D\u0001\u001e\u0016'x\fFu)>[S", "0tU3X9,b\u0015|\u0001", "", "\u001anZ6bu\u001bc\u001a\u007fzk\u0002", ">q^Ab\u0019>O\u0018~\b", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!4o\n;v2\u0003&Y.\"z =W0;g3\u001e\">", "/r??b;H@\u0019zy^9", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!4o\n;v2\u000b", "0dV6a\u0014>a'z|^", "3mS\u001aX:LO\u001b~Vg+^\t>U\t.\u0005J\u0013 wKo\u0015;\u0005", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "BnZ2a", "<dgA?,GU(\u0002Y^3\u0001\u00113t\u007f'", "7mc2e5:Z\u0002~\u000em\u0013|\u00121t\u0003\u0007{G\u0005\u001f\u001bVo\r", "<dgAG(@", ">dT890>Z\u0018^\u0004\\6{\r8g", "AjX=", "", "AjX=:9Hc$", "3w_2V;>Rx\byM(~", "@dP15@MS'", "0dU<e,)]'\r~[3\u0011s+c\u0006(z.~\u0013\u001eC|", "", "@dP1F;KW\"\u0001", "", "@dP1I(KW\"\u000eH+", "7mc2e5:Z\u0006~v]\u001dx\u00163n\u000fuH", "@dP1I(KW\"\u000eK-", "", "@dP190QS\u0018LG", "@dP190QS\u0018OI", "/ec2e\u0017:Q\u001fzwe,j\u0007+l{5", "4hT9W\fGQ#}~g.", "0dU<e,%S\"\u0001\na\u000b|\u00103m\u00047{?n\u0015\u0013Nk\u001b", "@dP1H5D\\#\u0011\u0004?0|\u0010.", "/cS\"a2G]+\b[b,\u0004\b", "D`[BX", "", "<dgA90>Z\u0018f~g\u0013|\u00121t\u0003\f\u0005\u001d\u0015&\u0017U", "0xc266N\\(", "@dP15@MS\u0007\u000e\bb5~", "@dP1H;?&", "@dP15@MS", "", "@dP1<5M:\u0019", "@dP1?6GU\u007f~", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ByteArrayProtoReader32 implements ProtoReader32 {
    private final List<Buffer> bufferStack;
    private int limit;
    private FieldEncoding nextFieldEncoding;
    private int pos;
    private ProtoReader32AsProtoReader protoReader;
    private int pushedLimit;
    private int recursionDepth;
    private final byte[] source;
    private int state;
    private int tag;

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

    public ByteArrayProtoReader32(byte[] source, int i2, int i3) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
        this.pos = i2;
        this.limit = i3;
        this.state = 2;
        this.tag = -1;
        this.pushedLimit = -1;
        this.bufferStack = new ArrayList();
    }

    public /* synthetic */ ByteArrayProtoReader32(byte[] bArr, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, (i4 + 2) - (2 | i4) != 0 ? 0 : i2, (i4 + 4) - (i4 | 4) != 0 ? bArr.length : i3);
    }

    private final void afterPackableScalar(int i2) throws IOException {
        if (this.state == i2) {
            this.state = 6;
            return;
        }
        int i3 = this.pos;
        int i4 = this.limit;
        if (i3 > i4) {
            throw new IOException("Expected to end at " + this.limit + " but was " + this.pos);
        }
        if (i3 != i4) {
            this.state = 7;
            return;
        }
        this.limit = this.pushedLimit;
        this.pushedLimit = -1;
        this.state = 6;
    }

    private final int beforeLengthDelimitedScalar() throws ProtocolException {
        if (this.state != 2) {
            throw new ProtocolException("Expected LENGTH_DELIMITED but was " + this.state);
        }
        int i2 = this.limit - this.pos;
        this.state = 6;
        this.limit = this.pushedLimit;
        this.pushedLimit = -1;
        return i2;
    }

    private final int internalNextLengthDelimited() throws ProtocolException, EOFException {
        this.nextFieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        this.state = 2;
        int iInternalReadVarint32 = internalReadVarint32();
        if (iInternalReadVarint32 < 0) {
            throw new ProtocolException("Negative length: " + iInternalReadVarint32);
        }
        if (this.pushedLimit != -1) {
            throw new IllegalStateException();
        }
        int i2 = this.limit;
        this.pushedLimit = i2;
        int i3 = this.pos + iInternalReadVarint32;
        this.limit = i3;
        if (i3 <= i2) {
            return iInternalReadVarint32;
        }
        throw new EOFException();
    }

    private final int internalReadVarint32() throws ProtocolException, EOFException {
        int i2;
        byte b2 = readByte();
        if (b2 >= 0) {
            return b2;
        }
        int i3 = (-1) - (((-1) - b2) | ((-1) - 127));
        byte b3 = readByte();
        if (b3 >= 0) {
            i2 = b3 << 7;
        } else {
            int i4 = (b3 & 127) << 7;
            i3 = (i3 + i4) - (i3 & i4);
            byte b4 = readByte();
            if (b4 >= 0) {
                i2 = b4 << Ascii.SO;
            } else {
                int i5 = ((-1) - (((-1) - b4) | ((-1) - 127))) << 14;
                i3 = (i3 + i5) - (i3 & i5);
                byte b5 = readByte();
                if (b5 < 0) {
                    byte b6 = readByte();
                    int i6 = (-1) - (((-1) - (i3 | ((b5 & 127) << 21))) & ((-1) - (b6 << Ascii.FS)));
                    if (b6 >= 0) {
                        return i6;
                    }
                    for (int i7 = 0; i7 < 5; i7++) {
                        if (readByte() >= 0) {
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

    private final byte readByte() throws EOFException {
        int i2 = this.pos;
        if (i2 == this.limit) {
            throw new EOFException();
        }
        byte[] bArr = this.source;
        this.pos = i2 + 1;
        return bArr[i2];
    }

    private final ByteString readByteString(int i2) throws EOFException {
        int i3 = this.pos + i2;
        if (i3 > this.limit) {
            throw new EOFException();
        }
        ByteString byteStringOf = ByteString.Companion.of(this.source, this.pos, i2);
        this.pos = i3;
        return byteStringOf;
    }

    private final int readIntLe() throws EOFException {
        int i2 = this.pos;
        if (i2 + 4 > this.limit) {
            throw new EOFException();
        }
        byte[] bArr = this.source;
        int i3 = i2 + 1;
        this.pos = i3;
        int i4 = (-1) - (((-1) - bArr[i2]) | ((-1) - 255));
        int i5 = i2 + 2;
        this.pos = i5;
        byte b2 = bArr[i3];
        int i6 = (((b2 + 255) - (b2 | 255)) << 8) | i4;
        int i7 = i2 + 3;
        this.pos = i7;
        int i8 = i6 | ((bArr[i5] & 255) << 16);
        this.pos = i2 + 4;
        int i9 = ((-1) - (((-1) - bArr[i7]) | ((-1) - 255))) << 24;
        return (i9 + i8) - (i9 & i8);
    }

    private final long readLongLe() throws EOFException {
        int i2 = this.pos;
        if (i2 + 8 > this.limit) {
            throw new EOFException();
        }
        byte[] bArr = this.source;
        int i3 = i2 + 1;
        this.pos = i3;
        long j2 = ((long) bArr[i2]) & 255;
        int i4 = i2 + 2;
        this.pos = i4;
        long j3 = ((-1) - (((-1) - ((long) bArr[i3])) | ((-1) - 255))) << 8;
        long j4 = (j2 + j3) - (j2 & j3);
        int i5 = i2 + 3;
        this.pos = i5;
        long j5 = bArr[i4];
        int i6 = i2 + 4;
        this.pos = i6;
        long j6 = bArr[i5];
        long j7 = (-1) - (((-1) - (j4 | (((j5 + 255) - (j5 | 255)) << 16))) & ((-1) - (((j6 + 255) - (j6 | 255)) << 24)));
        int i7 = i2 + 5;
        this.pos = i7;
        long j8 = bArr[i6];
        int i8 = i2 + 6;
        this.pos = i8;
        long j9 = (-1) - (((-1) - (j7 | (((j8 + 255) - (j8 | 255)) << 32))) & ((-1) - ((((long) bArr[i7]) & 255) << 40)));
        int i9 = i2 + 7;
        this.pos = i9;
        long j10 = bArr[i8];
        long j11 = (-1) - (((-1) - j9) & ((-1) - (((j10 + 255) - (j10 | 255)) << 48)));
        this.pos = i2 + 8;
        return ((((long) bArr[i9]) & 255) << 56) | j11;
    }

    private final String readUtf8(int i2) throws EOFException {
        int i3 = this.pos;
        int i4 = i2 + i3;
        if (i4 > this.limit) {
            throw new EOFException();
        }
        String strDecodeToString$default = StringsKt.decodeToString$default(this.source, i3, i4, false, 4, null);
        this.pos = i4;
        return strDecodeToString$default;
    }

    private final void skip(int i2) throws EOFException {
        int i3 = this.pos + i2;
        if (i3 > this.limit) {
            throw new EOFException();
        }
        this.pos = i3;
    }

    private final void skipGroup(int i2) throws IOException {
        while (this.pos < this.limit) {
            int iInternalReadVarint32 = internalReadVarint32();
            if (iInternalReadVarint32 == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i3 = iInternalReadVarint32 >> 3;
            int i4 = (-1) - (((-1) - iInternalReadVarint32) | ((-1) - 7));
            if (i4 == 0) {
                this.state = 0;
                readVarint64();
            } else if (i4 == 1) {
                this.state = 1;
                readFixed64();
            } else if (i4 == 2) {
                skip(internalReadVarint32());
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

    @Override // com.squareup.wire.ProtoReader32
    public void addUnknownField(int i2, FieldEncoding fieldEncoding, Object obj) throws IOException {
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        ProtoWriter protoWriter = new ProtoWriter(this.bufferStack.get(this.recursionDepth - 1));
        ProtoAdapter<?> protoAdapterRawProtoAdapter = fieldEncoding.rawProtoAdapter();
        Intrinsics.checkNotNull(protoAdapterRawProtoAdapter, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
        protoAdapterRawProtoAdapter.encodeWithTag(protoWriter, i2, obj);
    }

    @Override // com.squareup.wire.ProtoReader32
    public ProtoReader asProtoReader() {
        ProtoReader32AsProtoReader protoReader32AsProtoReader = this.protoReader;
        if (protoReader32AsProtoReader != null) {
            return protoReader32AsProtoReader;
        }
        ProtoReader32AsProtoReader protoReader32AsProtoReader2 = new ProtoReader32AsProtoReader(this);
        this.protoReader = protoReader32AsProtoReader2;
        return protoReader32AsProtoReader2;
    }

    @Override // com.squareup.wire.ProtoReader32
    public boolean beforePossiblyPackedScalar() throws ProtocolException {
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
        this.pushedLimit = -1;
        this.state = 6;
        return false;
    }

    @Override // com.squareup.wire.ProtoReader32
    public int beginMessage() throws IOException {
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
        int i3 = this.pushedLimit;
        this.pushedLimit = -1;
        this.state = 6;
        return i3;
    }

    @Override // com.squareup.wire.ProtoReader32
    public ByteString endMessageAndGetUnknownFields(int i2) throws IOException {
        if (this.state != 6) {
            throw new IllegalStateException("Unexpected call to endMessage()".toString());
        }
        int i3 = this.recursionDepth - 1;
        this.recursionDepth = i3;
        if (i3 < 0 || this.pushedLimit != -1) {
            throw new IllegalStateException("No corresponding call to beginMessage()".toString());
        }
        if (this.pos != this.limit && i3 != 0) {
            throw new IOException("Expected to end at " + this.limit + " but was " + this.pos);
        }
        this.limit = i2;
        Buffer buffer = this.bufferStack.get(i3);
        return buffer.size() > 0 ? buffer.readByteString() : ByteString.EMPTY;
    }

    @Override // com.squareup.wire.ProtoReader32
    public int nextFieldMinLengthInBytes() {
        FieldEncoding fieldEncoding = this.nextFieldEncoding;
        int i2 = fieldEncoding == null ? -1 : WhenMappings.$EnumSwitchMapping$0[fieldEncoding.ordinal()];
        if (i2 == -1) {
            throw new IllegalStateException("nextFieldEncoding is not set");
        }
        if (i2 == 1) {
            return this.limit - this.pos;
        }
        if (i2 == 2) {
            return 4;
        }
        if (i2 == 3) {
            return 8;
        }
        if (i2 == 4) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.squareup.wire.ProtoReader32
    public int nextLengthDelimited() {
        int i2 = this.state;
        if (i2 == 6 || i2 == 2) {
            return internalNextLengthDelimited();
        }
        throw new IllegalStateException("Unexpected call to nextDelimited()".toString());
    }

    @Override // com.squareup.wire.ProtoReader32
    public int nextTag() throws IOException {
        int i2 = this.state;
        if (i2 == 7) {
            this.state = 2;
            return this.tag;
        }
        if (i2 != 6) {
            throw new IllegalStateException("Unexpected call to nextTag()");
        }
        while (this.pos < this.limit) {
            int iInternalReadVarint32 = internalReadVarint32();
            if (iInternalReadVarint32 == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i3 = iInternalReadVarint32 >> 3;
            this.tag = i3;
            int i4 = iInternalReadVarint32 & 7;
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

    @Override // com.squareup.wire.ProtoReader32
    public FieldEncoding peekFieldEncoding() {
        return this.nextFieldEncoding;
    }

    @Override // com.squareup.wire.ProtoReader32
    public ByteString readBytes() {
        return readByteString(beforeLengthDelimitedScalar());
    }

    @Override // com.squareup.wire.ProtoReader32
    public int readFixed32() throws IOException {
        int i2 = this.state;
        if (i2 != 5 && i2 != 2) {
            throw new ProtocolException("Expected FIXED32 or LENGTH_DELIMITED but was " + this.state);
        }
        int intLe = readIntLe();
        afterPackableScalar(5);
        return intLe;
    }

    @Override // com.squareup.wire.ProtoReader32
    public long readFixed64() throws IOException {
        int i2 = this.state;
        if (i2 != 1 && i2 != 2) {
            throw new ProtocolException("Expected FIXED64 or LENGTH_DELIMITED but was " + this.state);
        }
        long longLe = readLongLe();
        afterPackableScalar(1);
        return longLe;
    }

    @Override // com.squareup.wire.ProtoReader32
    public String readString() {
        return readUtf8(beforeLengthDelimitedScalar());
    }

    @Override // com.squareup.wire.ProtoReader32
    public void readUnknownField(int i2) throws IOException {
        FieldEncoding fieldEncodingPeekFieldEncoding = peekFieldEncoding();
        Intrinsics.checkNotNull(fieldEncodingPeekFieldEncoding);
        addUnknownField(i2, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(this));
    }

    @Override // com.squareup.wire.ProtoReader32
    public int readVarint32() throws IOException {
        int i2 = this.state;
        if (i2 != 0 && i2 != 2) {
            throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.state);
        }
        int iInternalReadVarint32 = internalReadVarint32();
        afterPackableScalar(0);
        return iInternalReadVarint32;
    }

    @Override // com.squareup.wire.ProtoReader32
    public long readVarint64() throws IOException {
        int i2 = this.state;
        if (i2 != 0 && i2 != 2) {
            throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.state);
        }
        long j2 = 0;
        for (int i3 = 0; i3 < 64; i3 += 7) {
            byte b2 = readByte();
            long j3 = ((long) (127 & b2)) << i3;
            j2 = (j2 + j3) - (j2 & j3);
            if ((b2 & 128) == 0) {
                afterPackableScalar(0);
                return j2;
            }
        }
        throw new ProtocolException("WireInput encountered a malformed varint");
    }

    @Override // com.squareup.wire.ProtoReader32
    public void skip() throws IOException {
        int i2 = this.state;
        if (i2 == 0) {
            readVarint64();
            return;
        }
        if (i2 == 1) {
            readFixed64();
        } else if (i2 == 2) {
            skip(beforeLengthDelimitedScalar());
        } else {
            if (i2 != 5) {
                throw new IllegalStateException("Unexpected call to skip()");
            }
            readFixed32();
        }
    }
}
