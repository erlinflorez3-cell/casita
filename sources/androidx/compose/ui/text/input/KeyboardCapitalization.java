package androidx.compose.ui.text.input;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: KeyboardCapitalization.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4C\u0007\":\u001b\u007f\u0007lnA0RqP.XU0ŧ*\u0012éBjTqq:\u000e\u0019\rb\u0018UNwk|Jr\u000bq\u0010و\u001azp.WXAu \u0013JB\u001eDcS}CQb\u000b53\u001fxƉ9ѩ\t\u0003 1V\u0018?\tQT$\u0012^A7ńQҫQ\u0007 \u001c\u0014Ah\u000e,g\u007fNdT3qƠ3%\tvP\\wk>|e\rtU}˜xҐ\"+Hʺߗ\u0014%٘\u0002\u0007\u0001\\ϓ\u0007O"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#c Kj *ZB\u0019g?\"$dh=\u001c_;R\u00010\u001d", "", "D`[BX", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uH\u0018\u0016", "3pd._:", "", "=sW2e", "3pd._:\u0006W!\n\u0002", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "6`b566=S", "6`b566=S`\u0003\u0003i3", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uH\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "\u0011n\\=T5B]\"", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class KeyboardCapitalization {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Unspecified = m6322constructorimpl(-1);
    private static final int None = m6322constructorimpl(0);
    private static final int Characters = m6322constructorimpl(1);
    private static final int Words = m6322constructorimpl(2);
    private static final int Sentences = m6322constructorimpl(3);

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ KeyboardCapitalization m6321boximpl(int i2) {
        return new KeyboardCapitalization(i2);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static int m6322constructorimpl(int i2) {
        return i2;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m6323equalsimpl(int i2, Object obj) {
        return (obj instanceof KeyboardCapitalization) && i2 == ((KeyboardCapitalization) obj).m6327unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6324equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m6325hashCodeimpl(int i2) {
        return Integer.hashCode(i2);
    }

    public boolean equals(Object obj) {
        return m6323equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m6325hashCodeimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m6327unboximpl() {
        return this.value;
    }

    private /* synthetic */ KeyboardCapitalization(int i2) {
        this.value = i2;
    }

    public String toString() {
        return m6326toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m6326toStringimpl(int i2) {
        return m6324equalsimpl0(i2, Unspecified) ? "Unspecified" : m6324equalsimpl0(i2, None) ? "None" : m6324equalsimpl0(i2, Characters) ? "Characters" : m6324equalsimpl0(i2, Words) ? "Words" : m6324equalsimpl0(i2, Sentences) ? "Sentences" : "Invalid";
    }

    /* JADX INFO: compiled from: KeyboardCapitalization.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u000512ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u0005Fi%\nCiWP\u0002xޣQʗf˧ŪIYŲG\u001d\u000e\u0016\u0007p<K[{k\u0012'4HsM8\u001e\u0012K@xtd\u0007V6x؈{܇\u007fɝߋG\u000fͯ~QS\f 6Pr@Z\u001bM\u001d\u001c\u0018\u000fL%Q@jqf6vn\u0014>\u0006ݒ\u0005\u07bcA÷ф^/ƊQ\u001bNT5\u0013\u0007c$6N7M\u0017+_\u0011\f#}M\u0010Wqk\u0007\u001f+}ǪK؎V̬ߒ~\u0013Ʀ/]\u0015]\u0001,l\u0007Wn\u001a'CQiZ^\u0013x\u001a\t\f%<2\u0010<+\u001f͛/ָeڜս2sɤWNX\u0002lH\u0010|gG%%\u001851K)kϢaD!Q=߈!;\u001d+\u0001t@ƥX!"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#c Kj *ZB\u0019g?\"$dh=\u001c_;R\u00010\u0006*X4gN{A\u001e\u001b0", "", "u(E", "\u0011gP?T*MS&\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#c Kj *ZB\u0019g?\"$dh=\u001c_;R\u00010\u001d", "5dc\u0010[(KO\u0017\u000ezk:Dl\u001fNs\u0013OF?\u0013 Py\u001d8\u0006)?b\f", "5dc\u0010[(KO\u0017\u000ezk:Dl\u001fNs\u0013OF", "u(8", "\u0017", "\u001cn]2", "5dc\u001bb5>\u001b|ncR\u0017P\u000fma\t1\u0006O|&\u001bQx\u001c", "5dc\u001bb5>\u001b|ncR\u0017P\u000f", "!d]AX5<S'", "5dc X5MS\"|zls`x\u0018Yj{\u0002~|  Q~\nKz/>g", "5dc X5MS\"|zls`x\u0018Yj{\u0002", "#mb=X*BT\u001d~y", "5dc\"a:IS\u0017\u0003{b,{P\u0013Uh\u001cf\u0014\u0007U\u0013Px\u0018Kr49c\u0007.", "5dc\"a:IS\u0017\u0003{b,{P\u0013Uh\u001cf\u0014\u0007", "%na1f", "5dc$b9=a`bjG g\\5${1\u0005J\u0010\u0013&Ky\u0017J", "5dc$b9=a`bjG g\\5", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getCharacters-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m6328getCharactersIUNYP9k$annotations() {
        }

        /* JADX INFO: renamed from: getNone-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m6329getNoneIUNYP9k$annotations() {
        }

        /* JADX INFO: renamed from: getSentences-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m6330getSentencesIUNYP9k$annotations() {
        }

        /* JADX INFO: renamed from: getUnspecified-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m6331getUnspecifiedIUNYP9k$annotations() {
        }

        /* JADX INFO: renamed from: getWords-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m6332getWordsIUNYP9k$annotations() {
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getUnspecified-IUNYP9k, reason: not valid java name */
        public final int m6336getUnspecifiedIUNYP9k() {
            return KeyboardCapitalization.Unspecified;
        }

        /* JADX INFO: renamed from: getNone-IUNYP9k, reason: not valid java name */
        public final int m6334getNoneIUNYP9k() {
            return KeyboardCapitalization.None;
        }

        /* JADX INFO: renamed from: getCharacters-IUNYP9k, reason: not valid java name */
        public final int m6333getCharactersIUNYP9k() {
            return KeyboardCapitalization.Characters;
        }

        /* JADX INFO: renamed from: getWords-IUNYP9k, reason: not valid java name */
        public final int m6337getWordsIUNYP9k() {
            return KeyboardCapitalization.Words;
        }

        /* JADX INFO: renamed from: getSentences-IUNYP9k, reason: not valid java name */
        public final int m6335getSentencesIUNYP9k() {
            return KeyboardCapitalization.Sentences;
        }
    }
}
