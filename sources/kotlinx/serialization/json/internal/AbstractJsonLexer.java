package kotlinx.serialization.json.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
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
@Metadata(bv = {}, d1 = {"Яt\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116Ȑ\u0007\"B\u0012\u007f\u0007|jA0JhP.hS2şs{B0cҕyCI`\"}(\u0011WNugvJ`\fK\u000f\u0014\u001f\u0001j2Q]xk\u0015\u0017˰JoM=UڎE9n{>\u0005&3*8\u0010\u0005\t\u001a@H\u0018v\u0001IS\f /Hp@c\u0015M\u001b\u001a\u001a\u0006D.\u0007<rɡ~6vk\u001e=ǥ'\u0003wB\u00175mB\u0015M;H\u0005+\u001b\ny\u001eYB}5];a\u0017\u001fR\nA3C\u007fR\u001dhU)[M\u0002mNX.\u0016[+\u0018#k\n>\\3S\u0011\u001059gcy_>,\u0006\u0013\u0014\rj\u0006T\u0006o^<F2f6(cx\u0001nXP0`r\u0004\t}N\u0017S\u0002y=\u0002!tny;Gl} M\u0011,B\u0019nOy\u001d\u001cn43T&oaUN]`N8[\u0004nLtp#B\u0004^eHE\n3F\u0017SQ\f=1D\u0004\u0002vQ\u0018z\u0013v\u0001S\u0018T\u000f@jt$[B\t:g\u000b\tM\u0004^yp.'LJa7\u0002\u001698\\&IQ)\u001eugh\u0018\t\u0014\u0002R+=\u000fOY\u001d\u0015T{\u0002jA]ic>\u000b\u0003z\"iTb3\u0002/Pa4r\\V<bLx:\u0010{ryR'zC\u007fHL,_F%\u0019V16Bo\nQ}h\u0017(~\u0003@T\u0007w2\r\t/_\rt}z\u0011IZ~\u0011&;Wi5G(\u001c%1e\u000bR\u001f~\"\u001awkZndlD\u0014\u0006\u001b.F2Ta@M\"=\fȞ6\f3w\\xk\u0005]\u0014-\u0001#.\u001f=x.\u0016\"\u0019\"rt3N]\n/\"%k;'\u0016\u001b\u0018y\u0010SC]q\f#[lV#\u0007gQf8+\u0007O\"3\u0002\b\"+7sCo#$0,/C{$}82\b\u001c'&#\u007fL?qP\bb\u007f\u0019b?F\u0006q~lKjЗúFHp5Pb\u0017n%3v|\u0015tdve\u000b]\u000b\u0017\r2\r~\u0016s:Aq.:4_84[}Bk\f1\u001f\u000fkg\u001c\b{`\u0019\r'\n9\ty\u0005 _U \u0005Y\u0013\r>\u0014\f\u0018dPkf\u0013=!$b.\u0003\bSYb.\u001e\u0010)\u0002vc\u001d\\JB\"f\u0007\u0012b\u0011tVv\u0007'Y)78G\u0017\u000fa<)9?,\u0006F\u0003M\u00146\u000f\u00195\tI\u0016\u0016~/)9\fl9IF!\u000f\u0019\u000euCw f\bUr\u0006k\u001e7~\u001aE!Pb39\u007f:(\u0005>*#WzM\u0013\u0004Bj`u:)-\u0019E\u001cJV'\u000bGQ#spldN&9\n>IFRv\u001f\f+}v\u001f;TM-kg\u001b\u001a-{e\u0013S}6\"P1\u001239bg\u0010v\n\f(he8еhר\bސц$\u00044\u001b=~\u0018\u007f 6}\u001cc\u0006!1qk&?\t-9@\u001eByj?\u001e,\u0003qCm\u000b1saZ\b\u0007EPK\u000bWQ<hpZh\u0013\u001a4!\u0017\u000ej-&MCNbq\u0016];\u0001p\u001a\\\"!s5y\u0003y1^pd\"g\b\u0004]BTV3k\\S>rctlpuVlx\u0004|t:CD\u0001\rrv\u0011A_\rtfj=\u00141\u001f\n+\u000e`OES'>!_lo\u001fEM#oVxA\u0007H~\r\u007fXD9v\u000eFD-trm95\n<\tt\u00146ZsEܥ\f6\u0017@!5`k0@b Boa5Q\u0019?\u001bCiLoW)CkiSS,7~?\u000f\u0016Ɲ=ˬ>s?\u0088sK\u001dr3[\u0015?\u000e5DQ}ډ\u000eʩN\u000bUޏn\u0011g2W<e \u007f]N\tZ-2.\u001euQ\u000b{5\u001f߳aЪDV{ӒT48B\u0007F9F\u001b\u0006JԄ8ʹ\u001csl\u05572DO\t,\u0019rM\u0001̚nخIQ\u0001{\u0011T\u001bVŬ7\u0014\u000e,9ٴ->NƩD\u000b"}, d2 = {"\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006z.DY\u000b)3t_\nJQJx0\u001c$MoC\u0010J,av4\u001d", "", "u(E", "1ta?X5M>#\r~m0\u0007\u0012", "", "3rR.c,=A(\f~g.", "\u001aiPCTuEO\"\u0001DL;\n\r8g\\8\u007fG\u007f\u0017$\u001d", "\u001aj^A_0G\u001d(~\u000emuj\u0018<i\t*XP\u0005\u001e\u0016G|c", "5dc\u0012f*:^\u0019}hm9\u0001\u00121", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*XP\u0005\u001e\u0016G|c", "Adc\u0012f*:^\u0019}hm9\u0001\u00121", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002\u0005\fD\b\u0016\u0017TEQ-", ">`c5", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006z.DY\u000b)3t_\u0013[MDV0-\u0018>", ">dT8X+,b&\u0003\u0004`", "", "And?V,", "", "5dc b<KQ\u0019", "u(;7T=:\u001d z\u0004`uZ\f+rm(\bP\u0001 \u0015GE", "/o_2a+\u001ea\u0017", "AsP?g\u0017Ha\u001d\u000e~h5", "/o_2a+\u001ea\u0017z\u0006^", ":`bAC6LW(\u0003\u0005g", "1ta?X5M", "/o_2a+!S,", "AsP?g\u0017Ha", "/o_2a++O\"\u0001z", "", "4q^:<5=S,", "Bn8;W,Q", "1`]\u0010b5Lc!~kZ3\r\t", "", "1n]@h4>0#\t\u0002^(\u0006", "AsP?g", "1n]@h4>0#\t\u0002^(\u0006o/n\u0004(\u0005O", "1n]@h4>0#\t\u0002^(\u0006o3t\u007f5wG", ":hc2e(EA)\u007f{b?", "1n]@h4>9\u0019\u0013hm9\u0001\u00121", "1n]@h4>:\u0019zyb5~p+t}+\u007fI\u0003\b\u0013N\u007f\u000e", "9dh!b\u0014:b\u0017\u0002", "7r;2a0>\\(", "1n]@h4><\u0019\u0012\nM6\u0003\t8", "", "3w_2V;>R", "", "1n]@h4><)\u0007zk0zo3t\u007f5wG", "", "1n]@h4>A(\f~g.", "1n]@h4>A(\f~g.Z\f?n\u0006(z", "1n]@h4>1\u001c\u000f\u0004d", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "Asa6a.\u001cV)\b\u0001", "1n]@h4>A(\f~g.c\t8i\u007f1\u000b", "1n]@h4>A(\f~g.c\t8i\u007f1\u000b)\u000b&\u007fWv\u0015", "2dR<W,=A(\f~g.", "3mbBe,!O*~Xa(\n\u0017", "3w_2V;\u001e]\u001a", "4`X9", "", "3w_2V;>R\b\t\u0001^5", "4`X9\u00172Hb \u0003\u0004q&\u000b\t<i{/\u007fU|&\u001bQx\bA\u0005/>", ";db@T.>", ">nb6g0H\\", "6h]A", "4`X9B5.\\\u001f\b\u0005p5b\tC", "9dh", "4q^:;,Q1\u001cz\b", "7mS2k\u0016?", "1gP?", "7mb6W,,b&\u0003\u0004`", "7r=<g\fHT", "7rE._0=D\u0015\u0006\u000b^\u001a\f\u0005<t", "1", ">dT8A,Qb\b\t\u0001^5", ">dT8F;KW\"\u0001", ">qT3X;<V\u0003\fZh-", "@d`B\\9>", "1n]1\\;B]\"", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "@d`B\\9>\u0012\u001f\t\ne0\u0006\u001c)s\u007f5\u007f<\b\u001b,C~\u0012F\u007f\u001f:g\b)", "AjX=83>[\u0019\b\n", "/k[<j\u0013>\\\u001d~\u0004m\u001a\f\u00163n\u00026", "AjX=J/Bb\u0019\r\u0006Z*|\u0017", "AtQ@g9B\\\u001b", "3mS\u001db:", "B`Z2C,>Y\u0019}", "BnBAe0GU", "Bqh\u0010b5Lc!~Xh4\u0005\u0005", "Bqh\u0010b5Lc!~cn3\u0004", "2n2<a:N[\u0019", "CmTEc,<b\u0019}ih2|\u0012", "E`b\"a8N](~yL;\n\r8g", "EqXAX\u0019:\\\u001b~", "1ta?X5M1\u001c\u000f\u0004d\u000fx\u0017\u000fs}$\u0007@", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u001c%Qx"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class AbstractJsonLexer {
    protected int currentPosition;
    private String peekedString;
    public final JsonPath path = new JsonPath();
    private StringBuilder escapedString = new StringBuilder();

    private final int appendEsc(int i2) {
        int iPrefetchOrEof = prefetchOrEof(i2);
        if (iPrefetchOrEof == -1) {
            fail$default(this, "Expected escape sequence to continue, got EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i3 = iPrefetchOrEof + 1;
        char cCharAt = getSource().charAt(iPrefetchOrEof);
        if (cCharAt == 'u') {
            return appendHex(getSource(), i3);
        }
        char cEscapeToChar = AbstractJsonLexerKt.escapeToChar(cCharAt);
        if (cEscapeToChar != 0) {
            this.escapedString.append(cEscapeToChar);
            return i3;
        }
        fail$default(this, "Invalid escaped char '" + cCharAt + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final int appendEscape(int i2, int i3) {
        appendRange(i2, i3);
        return appendEsc(i3 + 1);
    }

    private final int appendHex(CharSequence charSequence, int i2) {
        int i3 = i2 + 4;
        if (i3 < charSequence.length()) {
            this.escapedString.append((char) ((fromHexChar(charSequence, i2) << 12) + (fromHexChar(charSequence, i2 + 1) << 8) + (fromHexChar(charSequence, i2 + 2) << 4) + fromHexChar(charSequence, i2 + 3)));
            return i3;
        }
        this.currentPosition = i2;
        ensureHaveChars();
        if (this.currentPosition + 4 < charSequence.length()) {
            return appendHex(charSequence, this.currentPosition);
        }
        fail$default(this, "Unexpected EOF during unicode escape", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final boolean consumeBoolean(int i2) {
        int iPrefetchOrEof = prefetchOrEof(i2);
        if (iPrefetchOrEof >= getSource().length() || iPrefetchOrEof == -1) {
            fail$default(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i3 = iPrefetchOrEof + 1;
        int iCharAt = (-1) - ((65535 - getSource().charAt(iPrefetchOrEof)) & ((-1) - 32));
        if (iCharAt == 102) {
            consumeBooleanLiteral("alse", i3);
            return false;
        }
        if (iCharAt == 116) {
            consumeBooleanLiteral("rue", i3);
            return true;
        }
        fail$default(this, "Expected valid boolean literal prefix, but had '" + consumeStringLenient() + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final void consumeBooleanLiteral(String str, int i2) {
        if (getSource().length() - i2 < str.length()) {
            fail$default(this, "Unexpected end of boolean literal", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int length = str.length();
        for (int i3 = 0; i3 < length; i3++) {
            if (str.charAt(i3) != (-1) - ((65535 - getSource().charAt(i2 + i3)) & ((-1) - 32))) {
                fail$default(this, "Expected valid boolean literal prefix, but had '" + consumeStringLenient() + '\'', 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
        }
        this.currentPosition = i2 + str.length();
    }

    private final String decodedString(int i2, int i3) {
        appendRange(i2, i3);
        String string = this.escapedString.toString();
        Intrinsics.checkNotNullExpressionValue(string, "escapedString.toString()");
        this.escapedString.setLength(0);
        return string;
    }

    public static /* synthetic */ Void fail$default(AbstractJsonLexer abstractJsonLexer, String str, int i2, String str2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((2 & i3) != 0) {
            i2 = abstractJsonLexer.currentPosition;
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            str2 = "";
        }
        return abstractJsonLexer.fail(str, i2, str2);
    }

    private final int fromHexChar(CharSequence charSequence, int i2) {
        char cCharAt = charSequence.charAt(i2);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        fail$default(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final boolean insideString(boolean z2, char c2) {
        if (z2) {
            if (AbstractJsonLexerKt.charToTokenClass(c2) == 0) {
                return true;
            }
        } else if (c2 != '\"') {
            return true;
        }
        return false;
    }

    public static /* synthetic */ void require$kotlinx_serialization_json$default(AbstractJsonLexer abstractJsonLexer, boolean z2, int i2, Function0 message, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: require");
        }
        if ((i3 + 2) - (i3 | 2) != 0) {
            i2 = abstractJsonLexer.currentPosition;
        }
        Intrinsics.checkNotNullParameter(message, "message");
        if (z2) {
            return;
        }
        fail$default(abstractJsonLexer, (String) message.invoke(), i2, null, 4, null);
        throw new KotlinNothingValueException();
    }

    private final String takePeeked() {
        String str = this.peekedString;
        Intrinsics.checkNotNull(str);
        this.peekedString = null;
        return str;
    }

    public static /* synthetic */ boolean tryConsumeNull$default(AbstractJsonLexer abstractJsonLexer, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryConsumeNull");
        }
        if ((i2 + 1) - (i2 | 1) != 0) {
            z2 = true;
        }
        return abstractJsonLexer.tryConsumeNull(z2);
    }

    private final boolean wasUnquotedString() {
        return getSource().charAt(this.currentPosition - 1) != '\"';
    }

    private final void writeRange(int i2, int i3, boolean z2, Function1<? super String, Unit> function1) {
        if (z2) {
            function1.invoke(decodedString(i2, i3));
        } else {
            function1.invoke(substring(i2, i3));
        }
    }

    protected void appendRange(int i2, int i3) {
        this.escapedString.append(getSource(), i2, i3);
    }

    public abstract boolean canConsumeValue();

    public final boolean consumeBoolean() {
        return consumeBoolean(skipWhitespaces());
    }

    public final boolean consumeBooleanLenient() {
        boolean z2;
        int iSkipWhitespaces = skipWhitespaces();
        if (iSkipWhitespaces == getSource().length()) {
            fail$default(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (getSource().charAt(iSkipWhitespaces) == '\"') {
            iSkipWhitespaces++;
            z2 = true;
        } else {
            z2 = false;
        }
        boolean zConsumeBoolean = consumeBoolean(iSkipWhitespaces);
        if (z2) {
            if (this.currentPosition == getSource().length()) {
                fail$default(this, "EOF", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            if (getSource().charAt(this.currentPosition) != '\"') {
                fail$default(this, "Expected closing quotation mark", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            this.currentPosition++;
        }
        return zConsumeBoolean;
    }

    public abstract String consumeKeyString();

    public abstract String consumeLeadingMatchingValue(String str, boolean z2);

    public abstract byte consumeNextToken();

    public final byte consumeNextToken(byte b2) {
        byte bConsumeNextToken = consumeNextToken();
        if (bConsumeNextToken == b2) {
            return bConsumeNextToken;
        }
        fail$kotlinx_serialization_json(b2);
        throw new KotlinNothingValueException();
    }

    public void consumeNextToken(char c2) {
        ensureHaveChars();
        CharSequence source = getSource();
        int i2 = this.currentPosition;
        while (true) {
            int iPrefetchOrEof = prefetchOrEof(i2);
            if (iPrefetchOrEof == -1) {
                this.currentPosition = iPrefetchOrEof;
                unexpectedToken(c2);
                return;
            }
            i2 = iPrefetchOrEof + 1;
            char cCharAt = source.charAt(iPrefetchOrEof);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.currentPosition = i2;
                if (cCharAt == c2) {
                    return;
                } else {
                    unexpectedToken(c2);
                }
            }
        }
    }

    public final long consumeNumericLiteral() {
        boolean z2;
        int iPrefetchOrEof = prefetchOrEof(skipWhitespaces());
        if (iPrefetchOrEof >= getSource().length() || iPrefetchOrEof == -1) {
            fail$default(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (getSource().charAt(iPrefetchOrEof) == '\"') {
            iPrefetchOrEof++;
            if (iPrefetchOrEof == getSource().length()) {
                fail$default(this, "EOF", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            z2 = true;
        } else {
            z2 = false;
        }
        int i2 = iPrefetchOrEof;
        long j2 = 0;
        boolean z3 = true;
        boolean z4 = false;
        while (z3) {
            char cCharAt = getSource().charAt(i2);
            if (cCharAt != '-') {
                if (AbstractJsonLexerKt.charToTokenClass(cCharAt) != 0) {
                    break;
                }
                i2++;
                z3 = i2 != getSource().length();
                int i3 = cCharAt - '0';
                if (i3 < 0 || i3 >= 10) {
                    fail$default(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                j2 = (j2 * ((long) 10)) - ((long) i3);
                if (j2 > 0) {
                    fail$default(this, "Numeric value overflow", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
            } else {
                if (i2 != iPrefetchOrEof) {
                    fail$default(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                i2++;
                z4 = true;
            }
        }
        if (iPrefetchOrEof == i2 || (z4 && iPrefetchOrEof == i2 - 1)) {
            fail$default(this, "Expected numeric literal", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (z2) {
            if (!z3) {
                fail$default(this, "EOF", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            if (getSource().charAt(i2) != '\"') {
                fail$default(this, "Expected closing quotation mark", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            i2++;
        }
        this.currentPosition = i2;
        if (z4) {
            return j2;
        }
        if (j2 != Long.MIN_VALUE) {
            return -j2;
        }
        fail$default(this, "Numeric value overflow", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final String consumeString() {
        return this.peekedString != null ? takePeeked() : consumeKeyString();
    }

    protected final String consumeString(CharSequence source, int i2, int i3) {
        int iPrefetchOrEof = i2;
        Intrinsics.checkNotNullParameter(source, "source");
        char cCharAt = source.charAt(i3);
        boolean z2 = false;
        while (cCharAt != '\"') {
            if (cCharAt == '\\') {
                iPrefetchOrEof = prefetchOrEof(appendEscape(iPrefetchOrEof, i3));
                if (iPrefetchOrEof == -1) {
                    fail$default(this, "EOF", iPrefetchOrEof, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            } else {
                i3++;
                if (i3 >= source.length()) {
                    appendRange(iPrefetchOrEof, i3);
                    iPrefetchOrEof = prefetchOrEof(i3);
                    if (iPrefetchOrEof == -1) {
                        fail$default(this, "EOF", iPrefetchOrEof, null, 4, null);
                        throw new KotlinNothingValueException();
                    }
                } else {
                    continue;
                    cCharAt = source.charAt(i3);
                }
            }
            z2 = true;
            i3 = iPrefetchOrEof;
            cCharAt = source.charAt(i3);
        }
        String strSubstring = !z2 ? substring(iPrefetchOrEof, i3) : decodedString(iPrefetchOrEof, i3);
        this.currentPosition = i3 + 1;
        return strSubstring;
    }

    public void consumeStringChunked(boolean z2, Function1<? super String, Unit> consumeChunk) {
        Intrinsics.checkNotNullParameter(consumeChunk, "consumeChunk");
        byte bPeekNextToken = peekNextToken();
        if (!z2 || bPeekNextToken == 0) {
            if (!z2) {
                consumeNextToken('\"');
            }
            int iPrefetchOrEof = this.currentPosition;
            char cCharAt = getSource().charAt(iPrefetchOrEof);
            boolean z3 = false;
            int iPrefetchOrEof2 = iPrefetchOrEof;
            while (insideString(z2, cCharAt)) {
                if (z2 || cCharAt != '\\') {
                    iPrefetchOrEof2++;
                } else {
                    iPrefetchOrEof2 = prefetchOrEof(appendEscape(iPrefetchOrEof, iPrefetchOrEof2));
                    z3 = true;
                    iPrefetchOrEof = iPrefetchOrEof2;
                }
                if (iPrefetchOrEof2 >= getSource().length()) {
                    writeRange(iPrefetchOrEof, iPrefetchOrEof2, z3, consumeChunk);
                    iPrefetchOrEof = prefetchOrEof(iPrefetchOrEof2);
                    if (iPrefetchOrEof == -1) {
                        fail$default(this, "EOF", iPrefetchOrEof, null, 4, null);
                        throw new KotlinNothingValueException();
                    }
                    z3 = false;
                    iPrefetchOrEof2 = iPrefetchOrEof;
                }
                cCharAt = getSource().charAt(iPrefetchOrEof2);
            }
            writeRange(iPrefetchOrEof, iPrefetchOrEof2, z3, consumeChunk);
            this.currentPosition = iPrefetchOrEof2;
            if (z2) {
                return;
            }
            consumeNextToken('\"');
        }
    }

    public final String consumeStringLenient() {
        if (this.peekedString != null) {
            return takePeeked();
        }
        int iSkipWhitespaces = skipWhitespaces();
        if (iSkipWhitespaces >= getSource().length() || iSkipWhitespaces == -1) {
            fail$default(this, "EOF", iSkipWhitespaces, null, 4, null);
            throw new KotlinNothingValueException();
        }
        byte bCharToTokenClass = AbstractJsonLexerKt.charToTokenClass(getSource().charAt(iSkipWhitespaces));
        if (bCharToTokenClass == 1) {
            return consumeString();
        }
        if (bCharToTokenClass != 0) {
            fail$default(this, "Expected beginning of the string, but got " + getSource().charAt(iSkipWhitespaces), 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        boolean z2 = false;
        while (AbstractJsonLexerKt.charToTokenClass(getSource().charAt(iSkipWhitespaces)) == 0) {
            iSkipWhitespaces++;
            if (iSkipWhitespaces >= getSource().length()) {
                appendRange(this.currentPosition, iSkipWhitespaces);
                int iPrefetchOrEof = prefetchOrEof(iSkipWhitespaces);
                if (iPrefetchOrEof == -1) {
                    this.currentPosition = iSkipWhitespaces;
                    return decodedString(0, 0);
                }
                iSkipWhitespaces = iPrefetchOrEof;
                z2 = true;
            }
        }
        String strSubstring = !z2 ? substring(this.currentPosition, iSkipWhitespaces) : decodedString(this.currentPosition, iSkipWhitespaces);
        this.currentPosition = iSkipWhitespaces;
        return strSubstring;
    }

    public final String consumeStringLenientNotNull() {
        String strConsumeStringLenient = consumeStringLenient();
        if (!Intrinsics.areEqual(strConsumeStringLenient, "null") || !wasUnquotedString()) {
            return strConsumeStringLenient;
        }
        fail$default(this, "Unexpected 'null' value instead of string literal", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public void ensureHaveChars() {
    }

    public final void expectEof() {
        if (consumeNextToken() == 10) {
            return;
        }
        fail$default(this, "Expected EOF after parsing, but had " + getSource().charAt(this.currentPosition - 1) + " instead", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final Void fail(String message, int i2, String hint) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(hint, "hint");
        throw JsonExceptionsKt.JsonDecodingException(i2, message + " at path: " + this.path.getPath() + (hint.length() == 0 ? "" : "\n" + hint), getSource());
    }

    public final Void fail$kotlinx_serialization_json(byte b2) {
        fail$default(this, "Expected " + (b2 == 1 ? "quotation mark '\"'" : b2 == 4 ? "comma ','" : b2 == 5 ? "colon ':'" : b2 == 6 ? "start of the object '{'" : b2 == 7 ? "end of the object '}'" : b2 == 8 ? "start of the array '['" : b2 == 9 ? "end of the array ']'" : "valid token") + ", but had '" + ((this.currentPosition == getSource().length() || this.currentPosition <= 0) ? "EOF" : String.valueOf(getSource().charAt(this.currentPosition - 1))) + "' instead", this.currentPosition - 1, null, 4, null);
        throw new KotlinNothingValueException();
    }

    public final void failOnUnknownKey(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        fail("Encountered an unknown key '" + key + '\'', StringsKt.lastIndexOf$default((CharSequence) substring(0, this.currentPosition), key, 0, false, 6, (Object) null), AbstractJsonLexerKt.ignoreUnknownKeysHint);
        throw new KotlinNothingValueException();
    }

    protected final StringBuilder getEscapedString() {
        return this.escapedString;
    }

    protected abstract CharSequence getSource();

    public int indexOf(char c2, int i2) {
        return StringsKt.indexOf$default(getSource(), c2, i2, false, 4, (Object) null);
    }

    public final boolean isNotEof() {
        return peekNextToken() != 10;
    }

    protected final boolean isValidValueStart(char c2) {
        return !(c2 == '}' || c2 == ']' || c2 == ':' || c2 == ',');
    }

    public final byte peekNextToken() {
        CharSequence source = getSource();
        int i2 = this.currentPosition;
        while (true) {
            int iPrefetchOrEof = prefetchOrEof(i2);
            if (iPrefetchOrEof == -1) {
                this.currentPosition = iPrefetchOrEof;
                return (byte) 10;
            }
            char cCharAt = source.charAt(iPrefetchOrEof);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.currentPosition = iPrefetchOrEof;
                return AbstractJsonLexerKt.charToTokenClass(cCharAt);
            }
            i2 = iPrefetchOrEof + 1;
        }
    }

    public final String peekString(boolean z2) {
        String strConsumeString;
        byte bPeekNextToken = peekNextToken();
        if (z2) {
            if (bPeekNextToken != 1 && bPeekNextToken != 0) {
                return null;
            }
            strConsumeString = consumeStringLenient();
        } else {
            if (bPeekNextToken != 1) {
                return null;
            }
            strConsumeString = consumeString();
        }
        this.peekedString = strConsumeString;
        return strConsumeString;
    }

    public abstract int prefetchOrEof(int i2);

    public final void require$kotlinx_serialization_json(boolean z2, int i2, Function0<String> message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (z2) {
            return;
        }
        fail$default(this, message.invoke(), i2, null, 4, null);
        throw new KotlinNothingValueException();
    }

    protected final void setEscapedString(StringBuilder sb) {
        Intrinsics.checkNotNullParameter(sb, "<set-?>");
        this.escapedString = sb;
    }

    public final void skipElement(boolean z2) {
        ArrayList arrayList = new ArrayList();
        byte bPeekNextToken = peekNextToken();
        if (bPeekNextToken != 8 && bPeekNextToken != 6) {
            consumeStringLenient();
            return;
        }
        while (true) {
            byte bPeekNextToken2 = peekNextToken();
            if (bPeekNextToken2 != 1) {
                if (bPeekNextToken2 == 8 || bPeekNextToken2 == 6) {
                    arrayList.add(Byte.valueOf(bPeekNextToken2));
                } else if (bPeekNextToken2 == 9) {
                    if (((Number) CollectionsKt.last((List) arrayList)).byteValue() != 8) {
                        throw JsonExceptionsKt.JsonDecodingException(this.currentPosition, "found ] instead of } at path: " + this.path, getSource());
                    }
                    CollectionsKt.removeLast(arrayList);
                } else if (bPeekNextToken2 == 7) {
                    if (((Number) CollectionsKt.last((List) arrayList)).byteValue() != 6) {
                        throw JsonExceptionsKt.JsonDecodingException(this.currentPosition, "found } instead of ] at path: " + this.path, getSource());
                    }
                    CollectionsKt.removeLast(arrayList);
                } else if (bPeekNextToken2 == 10) {
                    fail$default(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                consumeNextToken();
                if (arrayList.size() == 0) {
                    return;
                }
            } else if (z2) {
                consumeStringLenient();
            } else {
                consumeKeyString();
            }
        }
    }

    public int skipWhitespaces() {
        int iPrefetchOrEof;
        char cCharAt;
        int i2 = this.currentPosition;
        while (true) {
            iPrefetchOrEof = prefetchOrEof(i2);
            if (iPrefetchOrEof == -1 || !((cCharAt = getSource().charAt(iPrefetchOrEof)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                break;
            }
            i2 = iPrefetchOrEof + 1;
        }
        this.currentPosition = iPrefetchOrEof;
        return iPrefetchOrEof;
    }

    public String substring(int i2, int i3) {
        return getSource().subSequence(i2, i3).toString();
    }

    public String toString() {
        return "JsonReader(source='" + ((Object) getSource()) + "', currentPosition=" + this.currentPosition + ')';
    }

    public abstract boolean tryConsumeComma();

    public final boolean tryConsumeNull(boolean z2) {
        int iPrefetchOrEof = prefetchOrEof(skipWhitespaces());
        int length = getSource().length() - iPrefetchOrEof;
        if (length < 4 || iPrefetchOrEof == -1) {
            return false;
        }
        for (int i2 = 0; i2 < 4; i2++) {
            if ("null".charAt(i2) != getSource().charAt(iPrefetchOrEof + i2)) {
                return false;
            }
        }
        if (length > 4 && AbstractJsonLexerKt.charToTokenClass(getSource().charAt(iPrefetchOrEof + 4)) == 0) {
            return false;
        }
        if (!z2) {
            return true;
        }
        this.currentPosition = iPrefetchOrEof + 4;
        return true;
    }

    protected final void unexpectedToken(char c2) {
        int i2 = this.currentPosition - 1;
        this.currentPosition = i2;
        if (i2 >= 0 && c2 == '\"' && Intrinsics.areEqual(consumeStringLenient(), "null")) {
            fail("Expected string literal but 'null' literal was found", this.currentPosition - 4, AbstractJsonLexerKt.coerceInputValuesHint);
            throw new KotlinNothingValueException();
        }
        fail$kotlinx_serialization_json(AbstractJsonLexerKt.charToTokenClass(c2));
        throw new KotlinNothingValueException();
    }
}
