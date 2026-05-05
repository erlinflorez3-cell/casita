package kotlinx.serialization.json.internal;

import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
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
@Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u0016DLш|\u0004O\u00128\u000b4D\u0007\":\u001b\u007f\u0007lmA0RhP.`S2şs{B.c$wCCU0}*\teNogtKb\u000bQ\u0015\u000e\u0016~l2կkތ\u000e\u0012=1\u0003zO7[oU9\u000fuȥ\t @$\u0001\u007f\u0013\u00062*v\u0016=\u000f\fQ\u001a\u0019H@\u001f;\u0019!\u0016\u001d(\u001a\u001e@6\u007fL]\u0018RDQ\u0005]h0S\u0007wLf'\u000e6CaULb2%v\u0010*qT\u007fC#0k\u00035_\fC\u0011M\n=3wm;sz\u0002gNX.!E/]\u0017urTb5pn\u001d?F_t[_<)Þ~\u0006\u0013O\u0014\u0014\f;X03 \r\u001d\u001e5\u0005r\u0002M~\u0014%VH\toL/%.J[=)~iai0\u0015KD\u000b\u001b7;\u0001\u001d8\"hVf#5lw\u007f7\u0018T\u000eZ\\\nq=\u001c\u0005Gü\u0004ò\b6OĉG}\u00171%)ۄ_T"}, d2 = {"\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006z.DY\u000b)3t_\u001c\\P?t6\u0003#rj \u0007v,[L", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006z.DY\u000b)3t_\nJQJx0\u001c$MoC\u0010J,av4\u001d", "And?V,", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc b<KQ\u0019", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1`]\u0010b5Lc!~kZ3\r\t", "", "1n]@h4>9\u0019\u0013hm9\u0001\u00121", "1n]@h4>:\u0019zyb5~p+t}+\u007fI\u0003\b\u0013N\u007f\u000e", "9dh!b\u0014:b\u0017\u0002", "7r;2a0>\\(", "1n]@h4><\u0019\u0012\nM6\u0003\t8", "", "", "3w_2V;>R", "", "1n]@h4>A(\f~g.Z\f?n\u0006(z", "1n]@h4>1\u001c\u000f\u0004d", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "Asa6a.\u001cV)\b\u0001", ">qT3X;<V\u0003\fZh-", "", ">nb6g0H\\", "AjX=J/Bb\u0019\r\u0006Z*|\u0017", "Bqh\u0010b5Lc!~Xh4\u0005\u0005", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u001c%Qx"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class StringJsonLexer extends AbstractJsonLexer {
    private final String source;

    public StringJsonLexer(String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public boolean canConsumeValue() {
        int i2 = this.currentPosition;
        if (i2 == -1) {
            return false;
        }
        while (i2 < getSource().length()) {
            char cCharAt = getSource().charAt(i2);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.currentPosition = i2;
                return isValidValueStart(cCharAt);
            }
            i2++;
        }
        this.currentPosition = i2;
        return false;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public String consumeKeyString() {
        consumeNextToken('\"');
        int i2 = this.currentPosition;
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) getSource(), '\"', i2, false, 4, (Object) null);
        if (iIndexOf$default == -1) {
            fail$kotlinx_serialization_json((byte) 1);
            throw new KotlinNothingValueException();
        }
        for (int i3 = i2; i3 < iIndexOf$default; i3++) {
            if (getSource().charAt(i3) == '\\') {
                return consumeString(getSource(), this.currentPosition, i3);
            }
        }
        this.currentPosition = iIndexOf$default + 1;
        String strSubstring = getSource().substring(i2, iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public String consumeLeadingMatchingValue(String keyToMatch, boolean z2) {
        Intrinsics.checkNotNullParameter(keyToMatch, "keyToMatch");
        int i2 = this.currentPosition;
        try {
            if (consumeNextToken() != 6) {
                return null;
            }
            if (!Intrinsics.areEqual(z2 ? consumeKeyString() : consumeStringLenientNotNull(), keyToMatch)) {
                return null;
            }
            if (consumeNextToken() != 5) {
                return null;
            }
            return z2 ? consumeString() : consumeStringLenientNotNull();
        } finally {
            this.currentPosition = i2;
        }
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public byte consumeNextToken() {
        String source = getSource();
        while (this.currentPosition != -1 && this.currentPosition < source.length()) {
            int i2 = this.currentPosition;
            this.currentPosition = i2 + 1;
            byte bCharToTokenClass = AbstractJsonLexerKt.charToTokenClass(source.charAt(i2));
            if (bCharToTokenClass != 3) {
                return bCharToTokenClass;
            }
        }
        return (byte) 10;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public void consumeNextToken(char c2) {
        if (this.currentPosition == -1) {
            unexpectedToken(c2);
        }
        String source = getSource();
        while (this.currentPosition < source.length()) {
            int i2 = this.currentPosition;
            this.currentPosition = i2 + 1;
            char cCharAt = source.charAt(i2);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                if (cCharAt == c2) {
                    return;
                } else {
                    unexpectedToken(c2);
                }
            }
        }
        unexpectedToken(c2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public void consumeStringChunked(boolean z2, Function1<? super String, Unit> consumeChunk) {
        Intrinsics.checkNotNullParameter(consumeChunk, "consumeChunk");
        Iterator<T> it = StringsKt.chunked(z2 ? consumeStringLenient() : consumeString(), 16384).iterator();
        while (it.hasNext()) {
            consumeChunk.invoke(it.next());
        }
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public String getSource() {
        return this.source;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public int prefetchOrEof(int i2) {
        if (i2 < getSource().length()) {
            return i2;
        }
        return -1;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public int skipWhitespaces() {
        char cCharAt;
        int i2 = this.currentPosition;
        if (i2 == -1) {
            return i2;
        }
        while (i2 < getSource().length() && ((cCharAt = getSource().charAt(i2)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i2++;
        }
        this.currentPosition = i2;
        return i2;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public boolean tryConsumeComma() {
        int iSkipWhitespaces = skipWhitespaces();
        if (iSkipWhitespaces == getSource().length() || iSkipWhitespaces == -1 || getSource().charAt(iSkipWhitespaces) != ',') {
            return false;
        }
        this.currentPosition++;
        int i2 = this.currentPosition;
        return true;
    }
}
