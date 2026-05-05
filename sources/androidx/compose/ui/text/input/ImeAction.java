package androidx.compose.ui.text.input;

import androidx.webkit.Profile;
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
/* JADX INFO: compiled from: ImeAction.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4C\u0007\":\u001b\u007f\u0007lnA0RqP.XU0ŧ*\u0012éBjTqq:\u000e\u0019\rb\u0018UNwk|Jr\u000bq\u0010و\u001azp.WXAu \u0013JB\u001eDcS}CQb\u000b53\u001fxƉ9ѩ\t\u0003 1V\u0018?\tQT$\u0012^A7ńQҫQ\u0007 \u001c\u0014Ah\u000e,g\u007fNdT3qƠ3%\tvP\\wk>|e\rtU}˜xҐ\"+Hʺߗ\u0014%٘\u0002\u0007\u0001\\ϓ\u0007O"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#a(7I\u0014=QMDA", "", "D`[BX", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uH\u0018\u0016", "3pd._:", "", "=sW2e", "3pd._:\u0006W!\n\u0002", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "6`b566=S", "6`b566=S`\u0003\u0003i3", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uH\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "\u0011n\\=T5B]\"", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class ImeAction {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Unspecified = m6286constructorimpl(-1);
    private static final int Default = m6286constructorimpl(1);
    private static final int None = m6286constructorimpl(0);
    private static final int Go = m6286constructorimpl(2);
    private static final int Search = m6286constructorimpl(3);
    private static final int Send = m6286constructorimpl(4);
    private static final int Previous = m6286constructorimpl(5);
    private static final int Next = m6286constructorimpl(6);
    private static final int Done = m6286constructorimpl(7);

    /* JADX INFO: renamed from: box-impl */
    public static final /* synthetic */ ImeAction m6285boximpl(int i2) {
        return new ImeAction(i2);
    }

    /* JADX INFO: renamed from: constructor-impl */
    private static int m6286constructorimpl(int i2) {
        return i2;
    }

    /* JADX INFO: renamed from: equals-impl */
    public static boolean m6287equalsimpl(int i2, Object obj) {
        return (obj instanceof ImeAction) && i2 == ((ImeAction) obj).m6291unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0 */
    public static final boolean m6288equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* JADX INFO: renamed from: hashCode-impl */
    public static int m6289hashCodeimpl(int i2) {
        return Integer.hashCode(i2);
    }

    public boolean equals(Object obj) {
        return m6287equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m6289hashCodeimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl */
    public final /* synthetic */ int m6291unboximpl() {
        return this.value;
    }

    private /* synthetic */ ImeAction(int i2) {
        this.value = i2;
    }

    public String toString() {
        return m6290toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: toString-impl */
    public static String m6290toStringimpl(int i2) {
        return m6288equalsimpl0(i2, Unspecified) ? "Unspecified" : m6288equalsimpl0(i2, None) ? "None" : m6288equalsimpl0(i2, Default) ? Profile.DEFAULT_PROFILE_NAME : m6288equalsimpl0(i2, Go) ? "Go" : m6288equalsimpl0(i2, Search) ? "Search" : m6288equalsimpl0(i2, Send) ? "Send" : m6288equalsimpl0(i2, Previous) ? "Previous" : m6288equalsimpl0(i2, Next) ? "Next" : m6288equalsimpl0(i2, Done) ? "Done" : "Invalid";
    }

    /* JADX INFO: compiled from: ImeAction.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005=2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u0005Fi%\nCiWP\u0002xޣQʗf˧ŪIYŲG\u001d\u000e\u0016\u0007p<K[{k\u0012'4HsM8\u001e\u0012K@xtd\u0007V6x؈{܇\u007fɝߋG\u000fͯ~QS\f 6Pr@Z\u001bM\u001d\u001c\u0018\u000fL%Q@jqf6vn\u0014>\u0006ݒ\u0005\u07bcA÷ф^/ƊQ\u001bNT5\u0013\u0007c$6N7M\u0017+_\u0011\f#}M\u0010Wqk\u0007\u001f+}ǪK؎V̬ߒ~\u0013Ʀ/]\u0015]\u0001,l\u0007Wn\u001a'CQiZ^\u0013x\u001a\t\f%<2\u0010<+\u001f͛/ָeڜս2sɤWNX\u0002lH\u0010|gG%%\u001851K)k\"\u0004I,f7*\u0007C\"yЯpƈZ٪َ_\u0014ôX\u0006Y1_FMJT\u001eg=\u0006\u0006vw\u0010/TRU\u0016G{?0M)\u000eً;ٳ ǽʮGCϼz\u0013hhaobJF9|\u0016O,\u000f$hI5'yilXZ\u0013\u0004 +ͽ\u007fު\u0012\u05feиv;Ƽ)\u001eVOvozOc$3/~9_\ny\u0013([lOMQ\u0012\u0012\u0018VMܥAسaڳؓeAΐ\u0010hd(08Xl\u0016\u0015\nDf\u000e\u0019PMvʌ459\u001cbċd1\u001dJA\u0003(މ^\b"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#a(7I\u0014=QMD*\u0012(\u001ds]B\u000bm5$", "", "u(E", "\u0012dU.h3M", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#a(7I\u0014=QMDA", "5dc\u0011X-:c \u000eB^\u001c{\u0019\u001du\nfwI\n!&C~\u0012F\u007f3", "5dc\u0011X-:c \u000eB^\u001c{\u0019\u001du\n", "u(8", "\u0017", "\u0012n]2", "5dc\u0011b5>\u001b\u0019nyn\u001a\r\u0013ma\t1\u0006O|&\u001bQx\u001c", "5dc\u0011b5>\u001b\u0019nyn\u001a\r\u0013", "\u0015n", "5dc\u0014bs>C\u0018\u000fhn6;\u00058n\n7wO\u0005! U", "5dc\u0014bs>C\u0018\u000fhn6", "\u001cdgA", "5dc\u001bX?M\u001b\u0019nyn\u001a\r\u0013ma\t1\u0006O|&\u001bQx\u001c", "5dc\u001bX?M\u001b\u0019nyn\u001a\r\u0013", "\u001cn]2", "5dc\u001bb5>\u001b\u0019nyn\u001a\r\u0013ma\t1\u0006O|&\u001bQx\u001c", "5dc\u001bb5>\u001b\u0019nyn\u001a\r\u0013", "\u001eqTC\\6Na", "5dc\u001de,OW#\u000f\t&,l\b?S\u00102:<\n !Vk\u001d@\u0001.C", "5dc\u001de,OW#\u000f\t&,l\b?S\u00102", "!dP?V/", "5dc X(KQ\u001cFzN+\rv?o>$\u0005I\u000b&\u0013Vs\u0018E\u0005", "5dc X(KQ\u001cFzN+\rv?o", "!d]1", "5dc X5=\u001b\u0019nyn\u001a\r\u0013ma\t1\u0006O|&\u001bQx\u001c", "5dc X5=\u001b\u0019nyn\u001a\r\u0013", "#mb=X*BT\u001d~y", "5dc\"a:IS\u0017\u0003{b,{P/U~8iP\u000bU\u0013Px\u0018Kr49c\u0007.", "5dc\"a:IS\u0017\u0003{b,{P/U~8iP\u000b", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getDefault-eUduSuo$annotations */
        public static /* synthetic */ void m6292getDefaulteUduSuo$annotations() {
        }

        /* JADX INFO: renamed from: getDone-eUduSuo$annotations */
        public static /* synthetic */ void m6293getDoneeUduSuo$annotations() {
        }

        /* JADX INFO: renamed from: getGo-eUduSuo$annotations */
        public static /* synthetic */ void m6294getGoeUduSuo$annotations() {
        }

        /* JADX INFO: renamed from: getNext-eUduSuo$annotations */
        public static /* synthetic */ void m6295getNexteUduSuo$annotations() {
        }

        /* JADX INFO: renamed from: getNone-eUduSuo$annotations */
        public static /* synthetic */ void m6296getNoneeUduSuo$annotations() {
        }

        /* JADX INFO: renamed from: getPrevious-eUduSuo$annotations */
        public static /* synthetic */ void m6297getPreviouseUduSuo$annotations() {
        }

        /* JADX INFO: renamed from: getSearch-eUduSuo$annotations */
        public static /* synthetic */ void m6298getSearcheUduSuo$annotations() {
        }

        /* JADX INFO: renamed from: getSend-eUduSuo$annotations */
        public static /* synthetic */ void m6299getSendeUduSuo$annotations() {
        }

        /* JADX INFO: renamed from: getUnspecified-eUduSuo$annotations */
        public static /* synthetic */ void m6300getUnspecifiedeUduSuo$annotations() {
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getUnspecified-eUduSuo */
        public final int m6309getUnspecifiedeUduSuo() {
            return ImeAction.Unspecified;
        }

        /* JADX INFO: renamed from: getDefault-eUduSuo */
        public final int m6301getDefaulteUduSuo() {
            return ImeAction.Default;
        }

        /* JADX INFO: renamed from: getNone-eUduSuo */
        public final int m6305getNoneeUduSuo() {
            return ImeAction.None;
        }

        /* JADX INFO: renamed from: getGo-eUduSuo */
        public final int m6303getGoeUduSuo() {
            return ImeAction.Go;
        }

        /* JADX INFO: renamed from: getSearch-eUduSuo */
        public final int m6307getSearcheUduSuo() {
            return ImeAction.Search;
        }

        /* JADX INFO: renamed from: getSend-eUduSuo */
        public final int m6308getSendeUduSuo() {
            return ImeAction.Send;
        }

        /* JADX INFO: renamed from: getPrevious-eUduSuo */
        public final int m6306getPreviouseUduSuo() {
            return ImeAction.Previous;
        }

        /* JADX INFO: renamed from: getNext-eUduSuo */
        public final int m6304getNexteUduSuo() {
            return ImeAction.Next;
        }

        /* JADX INFO: renamed from: getDone-eUduSuo */
        public final int m6302getDoneeUduSuo() {
            return ImeAction.Done;
        }
    }
}
