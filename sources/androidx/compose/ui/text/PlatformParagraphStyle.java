package androidx.compose.ui.text;

import kotlin.Metadata;
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
/* JADX INFO: compiled from: AndroidTextStyle.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLш|\u0004O\u000f8\u000b4B\u0007\"B\u0012\u007f\u0007ltA0RkP.XS2\u000fy\b<$a$wHQ٥8\u0013R\t}M f\u0004\u000bi\u0011W\u001f\f\u001cxx,aU'^ܫ\u00132Pq\u007fLS\u0004M?ftD\b82P<\n\u000b\u0007\u001a8H(v)Dƚ\u0010\u0012>E1IX!]\u000b \u0012\u0014A8\u0001L`ʄR6Vr\u001e?57ɨmB\\.(A\u000b[%F\u0003(=|o-CBM4C$\u001aΟ\u0007\u001baM\u0013Wqk\u0016/;o9W\u0006o6\u0007ÜD\u001b9^%_\t%\u000bӤ\u001af\u001a:CO\u0012_\u0017\"x\u000f\t~%<2\u0012ϳ&Ξό,\u0019Ǵ\f\u0016;t\u0001]XR\bfP\tKxD\u0017=\u007fa,o_ƻUmCϊ^9\u0002\u0010\u001b%;\u0003t-iaט`\u001e#W}ΥM\u007f?EHT)\u0558A\u0004"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9xCr46c\u000b(\"i#*OP7v7\f$|h9\\", "", "7mR9h+>4#\b\nI({\b3n\u0002", "", "uY\u0018#", "3l^7\\\u001aN^$\t\bm\u0014x\u0018-h", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9mD\u0001*9G\u000e+Bw#=5?Ji7s", "uHI\u0019^6MZ\u001d\bDc=\u0005R3n\u000f(\tI|\u001e`&o\u000f8\u0007,D7\b)E|#>KREx\u001c\u001a\"naF\\'\u001d", "uH;8b;EW\"H\u007fo4F\r8t\u007f5\u0005<\b`uGp\nL}4\u0013c\u0007.Fz&,\\MHS0+\u001bhn\u000fJT", "u(E", "5dc\u0012`6CW\u0007\u000f\u0006i6\n\u0018\u0017a\u000f&~\bzd\u000bUQ^0", "u(8", "\u0017", "5dc\u0016a*Ec\u0018~[h5\fs+d~,\u0005B?\u0013 Py\u001d8\u0006)?b\f", "5dc\u0016a*Ec\u0018~[h5\fs+d~,\u0005B", "u(I", "3pd._:", "=sW2e", "6`b566=S", "", ";da4X", "BnBAe0GU", "", "\u0011n\\=T5B]\"", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PlatformParagraphStyle {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final PlatformParagraphStyle Default = new PlatformParagraphStyle();
    private final int emojiSupportMatch;
    private final boolean includeFontPadding;

    public /* synthetic */ PlatformParagraphStyle(int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2);
    }

    public /* synthetic */ PlatformParagraphStyle(int i2, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, z2);
    }

    public static /* synthetic */ void getIncludeFontPadding$annotations() {
    }

    public final PlatformParagraphStyle merge(PlatformParagraphStyle platformParagraphStyle) {
        return platformParagraphStyle == null ? this : platformParagraphStyle;
    }

    /* JADX INFO: compiled from: AndroidTextStyle.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00053i%\nCiW۟\u0002(\u0011ѧfimqX^ŸG\u0014"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9xCr46c\u000b(\"i#*OP7v7\f$|h9EA6V\u0002#PPX52", "", "u(E", "\u0012dU.h3M", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9xCr46c\u000b(\"i#*OP7v7\f$|h9\\", "5dc\u0011X-:c \u000e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006a,1h~*Du\u0001*Z?=x0)\u0018VpM\u000ec\u0002", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PlatformParagraphStyle getDefault() {
            return PlatformParagraphStyle.Default;
        }
    }

    public final boolean getIncludeFontPadding() {
        return this.includeFontPadding;
    }

    /* JADX INFO: renamed from: getEmojiSupportMatch-_3YsG6Y, reason: not valid java name */
    public final int m6052getEmojiSupportMatch_3YsG6Y() {
        return this.emojiSupportMatch;
    }

    public PlatformParagraphStyle(boolean z2) {
        this.includeFontPadding = z2;
        this.emojiSupportMatch = EmojiSupportMatch.Companion.m5983getDefault_3YsG6Y();
    }

    public /* synthetic */ PlatformParagraphStyle(boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i2) | ((-1) - 1)) != 0 ? false : z2);
    }

    public /* synthetic */ PlatformParagraphStyle(int i2, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((1 & i3) != 0 ? EmojiSupportMatch.Companion.m5983getDefault_3YsG6Y() : i2, (i3 & 2) != 0 ? false : z2, (DefaultConstructorMarker) null);
    }

    private PlatformParagraphStyle(int i2, boolean z2) {
        this.includeFontPadding = z2;
        this.emojiSupportMatch = i2;
    }

    private PlatformParagraphStyle(int i2) {
        this.includeFontPadding = false;
        this.emojiSupportMatch = i2;
    }

    public /* synthetic */ PlatformParagraphStyle(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i3) | ((-1) - 1)) != 0 ? EmojiSupportMatch.Companion.m5983getDefault_3YsG6Y() : i2, (DefaultConstructorMarker) null);
    }

    public PlatformParagraphStyle() {
        this(EmojiSupportMatch.Companion.m5983getDefault_3YsG6Y(), false, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformParagraphStyle)) {
            return false;
        }
        PlatformParagraphStyle platformParagraphStyle = (PlatformParagraphStyle) obj;
        return this.includeFontPadding == platformParagraphStyle.includeFontPadding && EmojiSupportMatch.m5978equalsimpl0(this.emojiSupportMatch, platformParagraphStyle.emojiSupportMatch);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.includeFontPadding) * 31) + EmojiSupportMatch.m5979hashCodeimpl(this.emojiSupportMatch);
    }

    public String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.includeFontPadding + ", emojiSupportMatch=" + ((Object) EmojiSupportMatch.m5980toStringimpl(this.emojiSupportMatch)) + ')';
    }
}
