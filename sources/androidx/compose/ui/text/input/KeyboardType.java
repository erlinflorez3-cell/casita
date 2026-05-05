package androidx.compose.ui.text.input;

import com.reactnativeincodesdk.ModuleNames;
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
/* JADX INFO: compiled from: KeyboardType.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4C\u0007\":\u001b\u007f\u0007lnA0RqP.XU0ŧ*\u0012éBjTqq:\u000e\u0019\rb\u0018UNwk|Jr\u000bq\u0010و\u001azp.WXAu \u0013JB\u001eDcS}CQb\u000b53\u001fxƉ9ѩ\t\u0003 1V\u0018?\tQT$\u0012^A7ńQҫQ\u0007 \u001c\u0014Ah\u000e,g\u007fNdT3qƠ3%\tvP\\wk>|e\rtU}˜xҐ\"+Hʺߗ\u0014%٘\u0002\u0007\u0001\\ϓ\u0007O"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#c Kj *ZB*\u007f?\u001ej", "", "D`[BX", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uH\u0018\u0016", "3pd._:", "", "=sW2e", "3pd._:\u0006W!\n\u0002", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "6`b566=S", "6`b566=S`\u0003\u0003i3", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uH\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "\u0011n\\=T5B]\"", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class KeyboardType {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Unspecified = m6339constructorimpl(0);
    private static final int Text = m6339constructorimpl(1);
    private static final int Ascii = m6339constructorimpl(2);
    private static final int Number = m6339constructorimpl(3);
    private static final int Phone = m6339constructorimpl(4);
    private static final int Uri = m6339constructorimpl(5);
    private static final int Email = m6339constructorimpl(6);
    private static final int Password = m6339constructorimpl(7);
    private static final int NumberPassword = m6339constructorimpl(8);
    private static final int Decimal = m6339constructorimpl(9);

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ KeyboardType m6338boximpl(int i2) {
        return new KeyboardType(i2);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static int m6339constructorimpl(int i2) {
        return i2;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m6340equalsimpl(int i2, Object obj) {
        return (obj instanceof KeyboardType) && i2 == ((KeyboardType) obj).m6344unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6341equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m6342hashCodeimpl(int i2) {
        return Integer.hashCode(i2);
    }

    public boolean equals(Object obj) {
        return m6340equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m6342hashCodeimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m6344unboximpl() {
        return this.value;
    }

    private /* synthetic */ KeyboardType(int i2) {
        this.value = i2;
    }

    public String toString() {
        return m6343toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m6343toStringimpl(int i2) {
        return m6341equalsimpl0(i2, Unspecified) ? "Unspecified" : m6341equalsimpl0(i2, Text) ? "Text" : m6341equalsimpl0(i2, Ascii) ? "Ascii" : m6341equalsimpl0(i2, Number) ? "Number" : m6341equalsimpl0(i2, Phone) ? ModuleNames.PHONE : m6341equalsimpl0(i2, Uri) ? "Uri" : m6341equalsimpl0(i2, Email) ? ModuleNames.EMAIL : m6341equalsimpl0(i2, Password) ? "Password" : m6341equalsimpl0(i2, NumberPassword) ? "NumberPassword" : m6341equalsimpl0(i2, Decimal) ? "Decimal" : "Invalid";
    }

    /* JADX INFO: compiled from: KeyboardType.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005@2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u0005Fi%\nCiWP\u0002xޣQʗf˧ŪIYŲG\u001d\u000e\u0016\u0007p<K[{k\u0012'4HsM8\u001e\u0012K@xtd\u0007V6x؈{܇\u007fɝߋG\u000fͯ~QS\f 6Pr@Z\u001bM\u001d\u001c\u0018\u000fL%Q@jqf6vn\u0014>\u0006ݒ\u0005\u07bcA÷ф^/ƊQ\u001bNT5\u0013\u0007c$6N7M\u0017+_\u0011\f#}M\u0010Wqk\u0007\u001f+}ǪK؎V̬ߒ~\u0013Ʀ/]\u0015]\u0001,l\u0007Wn\u001a'CQiZ^\u0013x\u001a\t\f%<2\u0010<+\u001f͛/ָeڜս2sɤWNX\u0002lH\u0010|gG%%\u001851K)k\"\u0004I,f7*\u0007C\"yЯpƈZ٪َ_\u0014ôX\u0006Y1_FMJT\u001eg=\u0006\u0006vw\u0010/TRU\u0016G{?0M)\u000eً;ٳ ǽʮGCϼz\u0013hhaobJF9|\u0016O,\u000f$hI5'yilXZ\u0013\u0004 +ͽ\u007fު\u0012\u05feиv;Ƽ)\u001eVOvozOc$3/~9_\ny\u0013([lOMQ\u0012\u0012\u0018VMܥAسaڳؓeAΐ\u0010hd(08Xl\u0016\u0015\nDf\u000e\u0019PMvlV:P1\\CJ9\"\u0019ˎ~ɺ^ʳՉ\u000f}Ձ72\u000bi2z\u0019\u0003V|~o\u007fzOM\u000beø-JY8\u001fŁqPg<|)&ґw\""}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#c Kj *ZB*\u007f?\u001eSFkA\u0012_5R\u00010\u001d", "", "u(E", "\u000frR6\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#c Kj *ZB*\u007f?\u001ej", "5dc\u000ef*BW`i\u007fA4Mh\u000f${1\u0005J\u0010\u0013&Ky\u0017J", "5dc\u000ef*BW`i\u007fA4Mh\u000f", "u(8", "\u0017", "\u0012dR6`(E", "5dc\u0011X*B[\u0015\u0006BI1_\u0011\u007fE_fwI\n!&C~\u0012F\u007f3", "5dc\u0011X*B[\u0015\u0006BI1_\u0011\u007fE_", "\u0013lP6_", "5dc\u0012`(BZ`i\u007fA4Mh\u000f${1\u0005J\u0010\u0013&Ky\u0017J", "5dc\u0012`(BZ`i\u007fA4Mh\u000f", "\u001ct\\/X9", "5dc\u001bh4;S&Fec\u000f\u0005Y\u000fE>$\u0005I\u000b&\u0013Vs\u0018E\u0005", "5dc\u001bh4;S&Fec\u000f\u0005Y\u000fE", "\u001ct\\/X9)O'\r\rh9{", "5dc\u001bh4;S&ivl:\u000f\u0013<dG\u0013\u0001#\tgv'.\nE\u007f/DU\r$Av$", "5dc\u001bh4;S&ivl:\u000f\u0013<dG\u0013\u0001#\tgv'", "\u001e`b@j6KR", "5dc\u001dT:Le#\fy&\u0017\u0002k76_\b:<\n !Vk\u001d@\u0001.C", "5dc\u001dT:Le#\fy&\u0017\u0002k76_\b", "\u001eg^;X", "5dc\u001d[6GS`i\u007fA4Mh\u000f${1\u0005J\u0010\u0013&Ky\u0017J", "5dc\u001d[6GS`i\u007fA4Mh\u000f", "\"dgA", "5dc!X?M\u001b\u0004\u0004]f|\\hma\t1\u0006O|&\u001bQx\u001c", "5dc!X?M\u001b\u0004\u0004]f|\\h", "#mb=X*BT\u001d~y", "5dc\"a:IS\u0017\u0003{b,{P\u001ajb0L `U\u0013Px\u0018Kr49c\u0007.", "5dc\"a:IS\u0017\u0003{b,{P\u001ajb0L `", "#qX", "5dc\"e0\u0006>\u001ea\u0003/\f\\G+n\t2\u000b<\u0010\u001b!P}", "5dc\"e0\u0006>\u001ea\u0003/\f\\", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getAscii-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m6345getAsciiPjHm6EE$annotations() {
        }

        /* JADX INFO: renamed from: getDecimal-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m6346getDecimalPjHm6EE$annotations() {
        }

        /* JADX INFO: renamed from: getEmail-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m6347getEmailPjHm6EE$annotations() {
        }

        /* JADX INFO: renamed from: getNumber-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m6348getNumberPjHm6EE$annotations() {
        }

        /* JADX INFO: renamed from: getNumberPassword-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m6349getNumberPasswordPjHm6EE$annotations() {
        }

        /* JADX INFO: renamed from: getPassword-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m6350getPasswordPjHm6EE$annotations() {
        }

        /* JADX INFO: renamed from: getPhone-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m6351getPhonePjHm6EE$annotations() {
        }

        /* JADX INFO: renamed from: getText-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m6352getTextPjHm6EE$annotations() {
        }

        /* JADX INFO: renamed from: getUnspecified-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m6353getUnspecifiedPjHm6EE$annotations() {
        }

        /* JADX INFO: renamed from: getUri-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m6354getUriPjHm6EE$annotations() {
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getUnspecified-PjHm6EE, reason: not valid java name */
        public final int m6363getUnspecifiedPjHm6EE() {
            return KeyboardType.Unspecified;
        }

        /* JADX INFO: renamed from: getText-PjHm6EE, reason: not valid java name */
        public final int m6362getTextPjHm6EE() {
            return KeyboardType.Text;
        }

        /* JADX INFO: renamed from: getAscii-PjHm6EE, reason: not valid java name */
        public final int m6355getAsciiPjHm6EE() {
            return KeyboardType.Ascii;
        }

        /* JADX INFO: renamed from: getNumber-PjHm6EE, reason: not valid java name */
        public final int m6358getNumberPjHm6EE() {
            return KeyboardType.Number;
        }

        /* JADX INFO: renamed from: getPhone-PjHm6EE, reason: not valid java name */
        public final int m6361getPhonePjHm6EE() {
            return KeyboardType.Phone;
        }

        /* JADX INFO: renamed from: getUri-PjHm6EE, reason: not valid java name */
        public final int m6364getUriPjHm6EE() {
            return KeyboardType.Uri;
        }

        /* JADX INFO: renamed from: getEmail-PjHm6EE, reason: not valid java name */
        public final int m6357getEmailPjHm6EE() {
            return KeyboardType.Email;
        }

        /* JADX INFO: renamed from: getPassword-PjHm6EE, reason: not valid java name */
        public final int m6360getPasswordPjHm6EE() {
            return KeyboardType.Password;
        }

        /* JADX INFO: renamed from: getNumberPassword-PjHm6EE, reason: not valid java name */
        public final int m6359getNumberPasswordPjHm6EE() {
            return KeyboardType.NumberPassword;
        }

        /* JADX INFO: renamed from: getDecimal-PjHm6EE, reason: not valid java name */
        public final int m6356getDecimalPjHm6EE() {
            return KeyboardType.Decimal;
        }
    }
}
