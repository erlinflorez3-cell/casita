package kotlin.text;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
import yg.InterfaceC1492Gx;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
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
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eRLш|\u0004O\f8é6B\r.4\u0012}\u000bnjG9L͜P.`]2\u000fq\u001a:ŠӍ$\bّY\u0001J\u00042\u000b_N\u0016˧\u001dI\u0013\nnO\u001b\u001cxz0WU\u0011]@\u0010BF}AKM\u001e@˃dtD\thA0A\u0012\u0005/$ZL\u001e\u0002\u0013Cy\u0018Xؚ@AI`\u000fe\u0005H\u0015ĂB&\tȦtiT;Vr.I=#\u001bipOϮc6\u0005ձ%HZ.\u001b~J\u001e1M 5\u001b3<\u0003\raD?\tOZ=\u000by\u0010'1[\\W<kh\u0014\u001b?8\rc\b\u000f\\\u000bgI\f-B8cQhv(}\u0014d\rB\u001ev\u0006-c\u0017- \u0003p\u000e9\u0012[SFnj^H\u001fca<7\u000e\u007f9L\"\u001blsJ;\u001fq {\u000b1\u0007#\u0007\u0014\n[Z4I\u0015!{`Q7y)=NwrYC\u0018շt\u000f"}, d2 = {"\u001aj^A_0G\u001d(~\u000emuZ\f+r]$\u000b@\u0003!$[E", "", "D`[BX", "", "1nS2", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_$g\u001c\u0013XkWCr.7#k/Dq\u001f0#\u0007,", "5dc\u0010b+>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc#T3NS", "u(8", "1n]AT0Ga", "", "1gP?", "", "#M0 F\u0010 <x]", "#O?\u0012E\n\u001aAxxa>\u001bkh\u001c", "\u001aNF\u0012E\n\u001aAxxa>\u001bkh\u001c", "\"HC\u00198\n\u001aAxxa>\u001bkh\u001c", "\u001bN3\u00169\u0010\u001e@\u0013eZM\u001b\\u", "\u001dS7\u0012E&%3\bmZK", "\u001cN=,F\u0017\u001a1|g\\X\u0014Xu\u0015", "\u0013M2\u0019B\u001a\"<zxb:\u0019b", "\u0011N<\u000f<\u0015\"<zxhI\bZl\u0018Gy\u0010W-f", "\u0012D2\u0016@\b%Mwb\\B\u001bvq\u001fM\\\bh", "\u001aDC!8\u00198<\tfW>\u0019", "\u001dS7\u0012E&'C\u0001[ZK", "!O0\u00108&,3\u0004Zg:\u001bfu", "\u001aH=\u0012R\u001a\u001e>tkVM\u0016i", "\u001e@A\u000e:\u0019\u001a>{xh>\u0017Xu\u000bTi\u0015", "\u0011N=!E\u0016%", "\u0014NA\u001a4\u001b", "\u001eQ8#4\u001b\u001eM\tlZ", "!TA\u001fB\u000e\u001aBx", "\u0012@B\u0015R\u0017.<vmj:\u001b`r\u0018", "!S0\u001fG&)C\u0002\\iN\bkl\u0019N", "\u0013M3,C\u001c'1\bnVM\u0010fq", "\u0011N=\u001b8\n-=\u0006xeN\u0015Zw\u001fAn\fe)", "\u001dS7\u0012E&)C\u0002\\iN\bkl\u0019N", "\u001b@C\u0015R\u001a2;uha", "\u0011TA\u001f8\u0015\u001cG\u0013lnF\tfo", "\u001bN3\u00169\u0010\u001e@\u0013lnF\tfo", "\u001dS7\u0012E&,G\u0001[dE", "\u0017M8!<\b%M\u0005ndM\fvs\u001fN]\u0017k\u001coz\u00010", "\u0014H=\u000e?&*C\u0003mZX\u0017lq\rTo\u0004j$j\u007f", "\u0011n\\=T5B]\"", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class CharCategory {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CharCategory[] $VALUES;
    public static final Companion Companion;
    private final String code;
    private final int value;
    public static final CharCategory UNASSIGNED = new CharCategory("UNASSIGNED", 0, 0, "Cn");
    public static final CharCategory UPPERCASE_LETTER = new CharCategory("UPPERCASE_LETTER", 1, 1, "Lu");
    public static final CharCategory LOWERCASE_LETTER = new CharCategory("LOWERCASE_LETTER", 2, 2, "Ll");
    public static final CharCategory TITLECASE_LETTER = new CharCategory("TITLECASE_LETTER", 3, 3, "Lt");
    public static final CharCategory MODIFIER_LETTER = new CharCategory("MODIFIER_LETTER", 4, 4, "Lm");
    public static final CharCategory OTHER_LETTER = new CharCategory("OTHER_LETTER", 5, 5, "Lo");
    public static final CharCategory NON_SPACING_MARK = new CharCategory("NON_SPACING_MARK", 6, 6, "Mn");
    public static final CharCategory ENCLOSING_MARK = new CharCategory("ENCLOSING_MARK", 7, 7, "Me");
    public static final CharCategory COMBINING_SPACING_MARK = new CharCategory("COMBINING_SPACING_MARK", 8, 8, "Mc");
    public static final CharCategory DECIMAL_DIGIT_NUMBER = new CharCategory("DECIMAL_DIGIT_NUMBER", 9, 9, "Nd");
    public static final CharCategory LETTER_NUMBER = new CharCategory("LETTER_NUMBER", 10, 10, "Nl");
    public static final CharCategory OTHER_NUMBER = new CharCategory("OTHER_NUMBER", 11, 11, "No");
    public static final CharCategory SPACE_SEPARATOR = new CharCategory("SPACE_SEPARATOR", 12, 12, "Zs");
    public static final CharCategory LINE_SEPARATOR = new CharCategory("LINE_SEPARATOR", 13, 13, "Zl");
    public static final CharCategory PARAGRAPH_SEPARATOR = new CharCategory("PARAGRAPH_SEPARATOR", 14, 14, "Zp");
    public static final CharCategory CONTROL = new CharCategory("CONTROL", 15, 15, "Cc");
    public static final CharCategory FORMAT = new CharCategory("FORMAT", 16, 16, "Cf");
    public static final CharCategory PRIVATE_USE = new CharCategory("PRIVATE_USE", 17, 18, "Co");
    public static final CharCategory SURROGATE = new CharCategory("SURROGATE", 18, 19, "Cs");
    public static final CharCategory DASH_PUNCTUATION = new CharCategory("DASH_PUNCTUATION", 19, 20, "Pd");
    public static final CharCategory START_PUNCTUATION = new CharCategory("START_PUNCTUATION", 20, 21, "Ps");
    public static final CharCategory END_PUNCTUATION = new CharCategory("END_PUNCTUATION", 21, 22, "Pe");
    public static final CharCategory CONNECTOR_PUNCTUATION = new CharCategory("CONNECTOR_PUNCTUATION", 22, 23, "Pc");
    public static final CharCategory OTHER_PUNCTUATION = new CharCategory("OTHER_PUNCTUATION", 23, 24, "Po");
    public static final CharCategory MATH_SYMBOL = new CharCategory("MATH_SYMBOL", 24, 25, "Sm");
    public static final CharCategory CURRENCY_SYMBOL = new CharCategory("CURRENCY_SYMBOL", 25, 26, "Sc");
    public static final CharCategory MODIFIER_SYMBOL = new CharCategory("MODIFIER_SYMBOL", 26, 27, "Sk");
    public static final CharCategory OTHER_SYMBOL = new CharCategory("OTHER_SYMBOL", 27, 28, "So");
    public static final CharCategory INITIAL_QUOTE_PUNCTUATION = new CharCategory("INITIAL_QUOTE_PUNCTUATION", 28, 29, "Pi");
    public static final CharCategory FINAL_QUOTE_PUNCTUATION = new CharCategory("FINAL_QUOTE_PUNCTUATION", 29, 30, "Pf");

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u0018\u007fјlʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$:OIV2}P\u000b\u007fRuj\u0007J\t\u000få\u0013\u000b"}, d2 = {"\u001aj^A_0G\u001d(~\u000emuZ\f+r]$\u000b@\u0003!$[.kF~01b\u0002*@C", "", "u(E", "D`[BX\u0016?", "\u001aj^A_0G\u001d(~\u000emuZ\f+r]$\u000b@\u0003!$[E", "1`c2Z6Kg", "", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CharCategory valueOf(int i2) {
            if (new IntRange(0, 16).contains(i2)) {
                return CharCategory.getEntries().get(i2);
            }
            if (new IntRange(18, 30).contains(i2)) {
                return CharCategory.getEntries().get(i2 - 1);
            }
            throw new IllegalArgumentException("Category #" + i2 + " is not defined.");
        }
    }

    private static final /* synthetic */ CharCategory[] $values() {
        return new CharCategory[]{UNASSIGNED, UPPERCASE_LETTER, LOWERCASE_LETTER, TITLECASE_LETTER, MODIFIER_LETTER, OTHER_LETTER, NON_SPACING_MARK, ENCLOSING_MARK, COMBINING_SPACING_MARK, DECIMAL_DIGIT_NUMBER, LETTER_NUMBER, OTHER_NUMBER, SPACE_SEPARATOR, LINE_SEPARATOR, PARAGRAPH_SEPARATOR, CONTROL, FORMAT, PRIVATE_USE, SURROGATE, DASH_PUNCTUATION, START_PUNCTUATION, END_PUNCTUATION, CONNECTOR_PUNCTUATION, OTHER_PUNCTUATION, MATH_SYMBOL, CURRENCY_SYMBOL, MODIFIER_SYMBOL, OTHER_SYMBOL, INITIAL_QUOTE_PUNCTUATION, FINAL_QUOTE_PUNCTUATION};
    }

    static {
        CharCategory[] charCategoryArr$values = $values();
        $VALUES = charCategoryArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(charCategoryArr$values);
        Companion = new Companion(null);
    }

    private CharCategory(String str, int i2, int i3, String str2) {
        this.value = i3;
        this.code = str2;
    }

    public static EnumEntries<CharCategory> getEntries() {
        return $ENTRIES;
    }

    public static CharCategory valueOf(String str) {
        return (CharCategory) Enum.valueOf(CharCategory.class, str);
    }

    public static CharCategory[] values() {
        return (CharCategory[]) $VALUES.clone();
    }

    public final boolean contains(char c2) {
        return Character.getType(c2) == this.value;
    }

    public final String getCode() {
        return this.code;
    }

    public final int getValue() {
        return this.value;
    }
}
