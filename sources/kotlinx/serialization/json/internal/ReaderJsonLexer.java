package kotlinx.serialization.json.internal;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(bv = {}, d1 = {"ЯN\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\r94\u0012}\u0007njO0LeN/ZS8\u0015sڔ<$i$yCAV\"}0\u0012WȞog|Vb\u000bI\u0011\u000e\u0016\u0007m4I[ye\u0012\u001d<JoE;SڎSʠ\u0011td\u0004`G2<\b\u0005\u0019\u001aXI |\u0001CY\u000e*0nsĐV\r[\tb(\u0014I8\u0001Lh\u0018RDU\u0005]h9S\u0007wPf'\u000e:C_ULb6%v\u0010.qT\u007f;#6k\u00035d\"SKW\u007fP\u001dj=&Y[$[Dl\u0018\u0014C=\u007f\u0011k\b>\\3a' o1]ycP<?>\u000fD\u0013J\u001c&\u0006UTtAb|\u0016'Kt!]pT\u0010xZ\u007f)|f\u001b3\u001cK+g%-e*I'kO{3\u0017N'\u000f\r9[\u0003\u0018')cb\u0006pIQnIxR\u0018yUm2z)\u0002r\b>h\u0018/*\u001dv-3Ys9Q3\u001c\u0006V`\u007fv3j\u0019Wwu`@Px\\Kr\u000f\u001a~\\d3{\u0017h)8\u001fO4T5\u0001^ʹ\"Ϣ{<)ط`Z]h\u0002j{^`ɛ1Ϭ;Yv\u0088^iGcK5\u007fifеTλ\u0018EDϵ\u001dZlIa\u0014+h6+JH\u0019\u001aNӾP«\u0010\u0013:ŭۍ Y"}, d2 = {"\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006z.DY\u000b)3t_\u001bM?:kA\u0003#rj \u0007v,[L", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006z.DY\u000b)3t_\nJQJx0\u001c$MoC\u0010J,av4\u001d", "@dP1X9", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006z.DY\u000b)3t_\u001cMP?g;\u000b\u0015d`9\u00149", "0tU3X9", "", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `L}\u0018E@)>h}-@i\u001dw;CHo0%\u0002h]8\u0007p\u0002DTj8", "And?V,", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006z.DY\u000b)3t_\nZP7\u007f\u0010,\u0003hmI\u0007l*NL", "5dc b<KQ\u0019", "u(;8b;EW\"\u0012Dl,\n\r+l\u0004=wO\u0005! \u0011t\u001cF\u007fn9b\r Dv\u00125\u0017\u001fHx02pvO9\u0013s,Wt'\u001d", "Bga2f/HZ\u0018", "", "/o_2a++O\"\u0001z", "", "4q^:<5=S,", "Bn8;W,Q", "1`]\u0010b5Lc!~kZ3\r\t", "", "1n]@h4>9\u0019\u0013hm9\u0001\u00121", "", "1n]@h4>:\u0019zyb5~p+t}+\u007fI\u0003\b\u0013N\u007f\u000e", "9dh!b\u0014:b\u0017\u0002", "7r;2a0>\\(", "1n]@h4><\u0019\u0012\nM6\u0003\t8", "", "3mbBe,!O*~Xa(\n\u0017", "7mS2k\u0016?", "1gP?", "", "AsP?g\u0017Ha", ">qT3X;<V\u0003\fZh-", ">nb6g0H\\", ">qT9b(=", "Cm_?b*>a'~y<6\r\u0012>", "@d[2T:>", "AtQ@g9B\\\u001b", "3mS\u001db:", "Bqh\u0010b5Lc!~Xh4\u0005\u0005", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u001c%Qx"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ReaderJsonLexer extends AbstractJsonLexer {
    private final char[] buffer;
    private final SerialReader reader;
    private final ArrayAsSequence source;
    private int threshold;

    public ReaderJsonLexer(SerialReader reader, char[] buffer) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.reader = reader;
        this.buffer = buffer;
        this.threshold = 128;
        this.source = new ArrayAsSequence(buffer);
        preload(0);
    }

    public /* synthetic */ ReaderJsonLexer(SerialReader serialReader, char[] cArr, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(serialReader, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? CharArrayPoolBatchSize.INSTANCE.take() : cArr);
    }

    private final void preload(int i2) {
        char[] cArr = getSource().buffer;
        if (i2 != 0) {
            ArraysKt.copyInto(cArr, cArr, 0, this.currentPosition, this.currentPosition + i2);
        }
        int length = getSource().length();
        while (true) {
            if (i2 == length) {
                break;
            }
            int i3 = this.reader.read(cArr, i2, length - i2);
            if (i3 == -1) {
                getSource().trim(i2);
                this.threshold = -1;
                break;
            }
            i2 += i3;
        }
        this.currentPosition = 0;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    protected void appendRange(int i2, int i3) {
        Intrinsics.checkNotNullExpressionValue(getEscapedString().append(getSource().buffer, i2, i3 - i2), "this.append(value, start…x, endIndex - startIndex)");
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public boolean canConsumeValue() {
        ensureHaveChars();
        int i2 = this.currentPosition;
        while (true) {
            int iPrefetchOrEof = prefetchOrEof(i2);
            if (iPrefetchOrEof == -1) {
                this.currentPosition = iPrefetchOrEof;
                return false;
            }
            char cCharAt = getSource().charAt(iPrefetchOrEof);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.currentPosition = iPrefetchOrEof;
                return isValidValueStart(cCharAt);
            }
            i2 = iPrefetchOrEof + 1;
        }
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public String consumeKeyString() {
        consumeNextToken('\"');
        int i2 = this.currentPosition;
        int iIndexOf = indexOf('\"', i2);
        if (iIndexOf == -1) {
            int iPrefetchOrEof = prefetchOrEof(i2);
            if (iPrefetchOrEof != -1) {
                return consumeString(getSource(), this.currentPosition, iPrefetchOrEof);
            }
            fail$kotlinx_serialization_json((byte) 1);
            throw new KotlinNothingValueException();
        }
        for (int i3 = i2; i3 < iIndexOf; i3++) {
            if (getSource().charAt(i3) == '\\') {
                return consumeString(getSource(), this.currentPosition, i3);
            }
        }
        this.currentPosition = iIndexOf + 1;
        return substring(i2, iIndexOf);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public String consumeLeadingMatchingValue(String keyToMatch, boolean z2) {
        Intrinsics.checkNotNullParameter(keyToMatch, "keyToMatch");
        return null;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public byte consumeNextToken() {
        byte bCharToTokenClass;
        ensureHaveChars();
        ArrayAsSequence source = getSource();
        int i2 = this.currentPosition;
        do {
            int iPrefetchOrEof = prefetchOrEof(i2);
            if (iPrefetchOrEof == -1) {
                this.currentPosition = iPrefetchOrEof;
                return (byte) 10;
            }
            i2 = iPrefetchOrEof + 1;
            bCharToTokenClass = AbstractJsonLexerKt.charToTokenClass(source.charAt(iPrefetchOrEof));
        } while (bCharToTokenClass == 3);
        this.currentPosition = i2;
        return bCharToTokenClass;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public void ensureHaveChars() {
        int length = getSource().length() - this.currentPosition;
        if (length > this.threshold) {
            return;
        }
        preload(length);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public ArrayAsSequence getSource() {
        return this.source;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public int indexOf(char c2, int i2) {
        ArrayAsSequence source = getSource();
        int length = source.length();
        while (i2 < length) {
            if (source.charAt(i2) == c2) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public int prefetchOrEof(int i2) {
        if (i2 < getSource().length()) {
            return i2;
        }
        this.currentPosition = i2;
        ensureHaveChars();
        return (this.currentPosition != 0 || getSource().length() == 0) ? -1 : 0;
    }

    public final void release() {
        CharArrayPoolBatchSize.INSTANCE.release(this.buffer);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public String substring(int i2, int i3) {
        return getSource().substring(i2, i3);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public boolean tryConsumeComma() {
        int iSkipWhitespaces = skipWhitespaces();
        if (iSkipWhitespaces >= getSource().length() || iSkipWhitespaces == -1 || getSource().charAt(iSkipWhitespaces) != ',') {
            return false;
        }
        this.currentPosition++;
        int i2 = this.currentPosition;
        return true;
    }
}
