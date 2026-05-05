package androidx.compose.ui.text.input;

import androidx.compose.ui.text.intl.LocaleList;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: ImeOptions.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u000eӵLш|\u0004O\u000f8é6B\u0015\"4\u0012}\u0007njO0L͜P.hS2şs{J$c$wDCU0}*\tUcog|PbŏK\u000f\u0014\"\u0001j2I[}s܈-[rom2\u0006nfy$zK\u0015&8\"Fy\u001d\u0001H+X\u0016|zQM$\u0012^C\u0001@X\r[\t2\u00124?0\u0007$\\uSNH\u001bcJ5)\u0003wIf'\u000e8\rU\u0013Fb0%xw\u001dYJ˝9\u00153^C>XpO\tEqK\u0005\u0001'U,Yy]6f\u0002,\u0015YR\u001dcx&j\ti`:(;UiK^\u0013@w)\u0002\u001dB\n\u000e\u0014.`.[\"Ǵ\f\u000eA\u00013\u001fPV\b^P\u007f\u0013ad\u00185\u00069+G\u001d~Q\u0010>)T={\u0013\u00116#/o1aZ\u000en\u001a3T&WAWF=VU\"Yku\u0014xh\u00028\rHI\u0016.*\u001b>\u001d+7iF;!\u001a\u0010ҩHg\u0005\u0014)+a\u0006jHn̎\u001f\u001c=*\u0017\frD\u0013\u0006\u001cVZX:\u0013e\u001c\u0003\n.\u000e\u0019 j{T!S\u0011~UnixRu\nS5\u0017=_ny\u0015o9\r;{VԨ\u000fР؏z\u0016EYp#!5Po$Z\u000b̥R8Nj\u001ew\u0014D|\rC8Eq*6D1G_EN\t\u001ePE\u0015\t\u000e[\u0019\u0016\u0005TA)\u001biRz9\u0007V\\~v\u007fxw4-h(-OZM\u001b<TPrz\u0002ʶ\u0006Ѩ\u0381\u0004ImkUl5l\u0004q\u0014 D֝iW5=!\u000f\u0017)`\u0003]KRrsSe\u0012U}-\u007f\u0015;v2\u007f\b\u0019q\\fpJ]Y/\"%d#)\u000ed\u000e\u0001yF)O\u0014\\\u0011[LR\u000b\u0005o;|B-\u000b%\u001e3\u000e\b\"+CտBگޗ\u001ay\u001aP#\u0004&z}Q\u0012b='%k\u0012P{\u0018\u0006a\u007f\\xօ8\u0012_\rc:$\u001b)\t\\3}\u0016i!4;[\u000fU5\u007fd<e\u000b]~֨\u000b2\u0015ߞn]@#}\u000f\u0005Em,\fC,\u0017ۤBљ߇LRܭquS\\\u0019^'\f\u0011\u000e?\u0002b+K-nW\u0011\u0017ޘ\ny ܽY=h\u001aJ\u001ftK:C \u000bq\\ʤ\u0005؋Ÿ~Eݍ\u0013\u001f:B\u0002On\u0010Z\u0010ji\u0019\u001cnJx!X\u0007ь\u000eɼϡw4̰\tuNT=wJ\u0003Y5\u0017.;`\ro=-ZSg%Ϝ\\\u0007\u0013ԵuEO\u001bD\u001e\u00188{k\b\ff\u0019Ԡ!H ÇQS\u0017z\u0005A͟\u000b^lQjʜ.\u0015QV\"/\u001eҼ\u00018"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#a(7W!=QMDy\n", "", "Ah]4_,%W\"~", "", "1`_6g(EW.z\nb6\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#c Kj *ZB\u0019g?\"$dh=\u001c_;R\u00010\u001d", "/tc<66K`\u0019|\n", "9dh/b(KR\b\u0013\u0006^", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#c Kj *ZB*\u007f?\u001ej", "7lT\u000eV;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#a(7I\u0014=QMDA", ">kPAY6K[|\u0007zH7\f\r9n\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#h'3|\u00178ZK\u001fs4\b weC\u0010q\u0002", "uY8'<\u0010%O\"}\bh0{\u001cxc\n0\u0007J\u000f\u0017`WsWKv8D#\u0002)B}%w8J7z5(\"pEA\u0007M7]z1PZ$\u0013b\\\u0002D\u0018\u001b$\u0013_3V\tbP${M3&Q\u000bI\u00037x\b\u001bs\u0018>x\u007fOf\u000eV\u0004\"]=6nFf5=8", "uY8'<\u0010%Y#\u000e\u0002b5F\u000e@mI,\u0005O\u0001$ CvW\u001bv&1i\u0005/\u0015w\u001f<\\PKiC(\"P]F\rc9$:\u0018", "6h]A?6<O ~\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u0006,~@\b\u001e3t\u0016\u0015QQJA", "uY8'<\u0010%O\"}\bh0{\u001cxc\n0\u0007J\u000f\u0017`WsWKv8D#\u0002)B}%w8J7z5(\"pEA\u0007M7]z1PZ$\u0013X[qJ\u001e\u0016Y!\u0018)\u0017\rdK2n\u000eG#Q;I\u0015J2\u0005\u0015%\u0015~Qz@R\u0017G`\u0019\u0004P~OLcn\u0001KJ\u000fg;lUc&k:G-\u0010xbyhQ*\u001a\u0003bn|[\bvtW\u0017\nB1&ihLE|+\u007fe", "5dc\u000eh;H1#\f\b^*\f", "u(I", "5dc\u0010T7Bb\u0015\u0006~s(\f\r9nG\fk)t\u0002jM", "u(8", "\u0017", "5dc\u0015\\5M:#|ve,\u000b", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006z.D`G\u0007Ak\u00125M*?yCs", "5dc\u0016`,\u001aQ(\u0003\u0005gs|x.um8\u0006", "5dc\u0018X@;]\u0015\fyM@\b\tvP\u0005\u000b\u0004\u0011`v", "5dc\u001d_(MT#\f\u0003B4|r:t\u00042\u0005N", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006z.@i\ri\"t\u0012=NMHs\u0018&\u0015RlH\u000bm5\\L", "5dc \\5@Z\u0019e~g,", "1n_F", "1n_F <QUhRe:", "uY8'<\u0010\u0002:\u0015\byk6\u0001\bB/}2\u0004K\u000b%\u0017\u0011\u007f\u0012\u0006\u0006%HhG$@x&=\u0017'Ck\u001e)$lkB\u00159", "1n_F  -6\u0007\u0002L)", "uY8'<\u0010%O\"}\bh0{\u001cxc\n0\u0007J\u000f\u0017`WsWKv8D#\u0002)B}%w8J7z5(\"pEA\u0007M7]z1PZ$oCN{<!\u001c^\rat\u000b\u000faL.|D\u0001/\fuX\u0002NwJ\u0010\u001f\u0019Ey:&^\u00101\u0005$yK2v\u001c", "1n_F >\u001b6\"|Z-", "uY8'<\u0010%O\"}\bh0{\u001cxc\n0\u0007J\u000f\u0017`WsWKv8D#\u0002)B}%w8J7z5(\"pEA\u0007M7]z1PZ$\u0013X[qJ\u001e\u0016Y!\u0018)\u0017\rdK2n\u000eG#Q;I\u0015J2\u0005\u0015%\u0015~Qz@R\u0017G`\u0019\u0004P~,-UhxTKIa=.\ni%gDH$]\u0002\u001ddwPA\u0019EW\u001a}b\t1KO\u0019dC3BwdT\u001b", "3pd._:", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "\u0011n\\=T5B]\"", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ImeOptions {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final ImeOptions Default = new ImeOptions(false, 0, false, 0, 0, null, null, 127, null);
    private final boolean autoCorrect;
    private final int capitalization;
    private final LocaleList hintLocales;
    private final int imeAction;
    private final int keyboardType;
    private final PlatformImeOptions platformImeOptions;
    private final boolean singleLine;

    public /* synthetic */ ImeOptions(boolean z2, int i2, boolean z3, int i3, int i4, PlatformImeOptions platformImeOptions, LocaleList localeList, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, i2, z3, i3, i4, platformImeOptions, localeList);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0013R\u00016\u0005yTlkLg\u000fX\u001ak\\acH*\u0014v\u001ff\t[q~]\u0007czpMx\u0002a]s>Y]BJ&_[\b#d\bCnLH}\u001bJ\u0015P \ns\u0012s\u001epD!_\u0003\u000e+")
    @InterfaceC1492Gx
    public /* synthetic */ ImeOptions(boolean z2, int i2, boolean z3, int i3, int i4, PlatformImeOptions platformImeOptions, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, i2, z3, i3, i4, platformImeOptions);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0013R\u00016\u0005yTlkLg\u000fX\u001ak\\acH*\u0014v\u001ff\t[q~]\u0007czpMx\u0002a]s>Y]BJ&_[\b#d\bKq?H\u0018\u001bY!-({#\u0012\u0007\u0015~E/\u000b\u000e|o#\u0015\u0001\\\u0015QH")
    @InterfaceC1492Gx
    public /* synthetic */ ImeOptions(boolean z2, int i2, boolean z3, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, i2, z3, i3, i4);
    }

    private ImeOptions(boolean z2, int i2, boolean z3, int i3, int i4, PlatformImeOptions platformImeOptions, LocaleList localeList) {
        this.singleLine = z2;
        this.capitalization = i2;
        this.autoCorrect = z3;
        this.keyboardType = i3;
        this.imeAction = i4;
        this.platformImeOptions = platformImeOptions;
        this.hintLocales = localeList;
    }

    public final boolean getSingleLine() {
        return this.singleLine;
    }

    public /* synthetic */ ImeOptions(boolean z2, int i2, boolean z3, int i3, int i4, PlatformImeOptions platformImeOptions, LocaleList localeList, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i5) | ((-1) - 1)) != 0 ? false : z2, (i5 + 2) - (i5 | 2) != 0 ? KeyboardCapitalization.Companion.m6334getNoneIUNYP9k() : i2, (-1) - (((-1) - i5) | ((-1) - 4)) != 0 ? true : z3, (i5 & 8) != 0 ? KeyboardType.Companion.m6362getTextPjHm6EE() : i3, (i5 + 16) - (i5 | 16) != 0 ? ImeAction.Companion.m6301getDefaulteUduSuo() : i4, (i5 & 32) != 0 ? null : platformImeOptions, (i5 & 64) != 0 ? LocaleList.Companion.getEmpty() : localeList, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: getCapitalization-IUNYP9k */
    public final int m6316getCapitalizationIUNYP9k() {
        return this.capitalization;
    }

    public final boolean getAutoCorrect() {
        return this.autoCorrect;
    }

    /* JADX INFO: renamed from: getKeyboardType-PjHm6EE */
    public final int m6318getKeyboardTypePjHm6EE() {
        return this.keyboardType;
    }

    /* JADX INFO: renamed from: getImeAction-eUduSuo */
    public final int m6317getImeActioneUduSuo() {
        return this.imeAction;
    }

    public final PlatformImeOptions getPlatformImeOptions() {
        return this.platformImeOptions;
    }

    public final LocaleList getHintLocales() {
        return this.hintLocales;
    }

    /* JADX INFO: compiled from: ImeOptions.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00053i%\nCiW۟\u0002(\u0011ѧfimqX^ŸG\u0014"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#a(7W!=QMDyr{\u001fpl5\u0010g6WL", "", "u(E", "\u0012dU.h3M", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#a(7W!=QMDy\n", "5dc\u0011X-:c \u000e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006z.@i\ri\u001bu\u0016\u0018XR?u=,j", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ImeOptions getDefault() {
            return ImeOptions.Default;
        }
    }

    public /* synthetic */ ImeOptions(boolean z2, int i2, boolean z3, int i3, int i4, PlatformImeOptions platformImeOptions, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? false : z2, (i5 & 2) != 0 ? KeyboardCapitalization.Companion.m6334getNoneIUNYP9k() : i2, (i5 + 4) - (i5 | 4) != 0 ? true : z3, (-1) - (((-1) - i5) | ((-1) - 8)) != 0 ? KeyboardType.Companion.m6362getTextPjHm6EE() : i3, (i5 & 16) != 0 ? ImeAction.Companion.m6301getDefaulteUduSuo() : i4, (i5 + 32) - (i5 | 32) != 0 ? null : platformImeOptions, (DefaultConstructorMarker) null);
    }

    private ImeOptions(boolean z2, int i2, boolean z3, int i3, int i4, PlatformImeOptions platformImeOptions) {
        this(z2, i2, z3, i3, i4, platformImeOptions, LocaleList.Companion.getEmpty(), (DefaultConstructorMarker) null);
    }

    public /* synthetic */ ImeOptions(boolean z2, int i2, boolean z3, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i5) | ((-1) - 1)) != 0 ? false : z2, (-1) - (((-1) - i5) | ((-1) - 2)) != 0 ? KeyboardCapitalization.Companion.m6334getNoneIUNYP9k() : i2, (4 & i5) != 0 ? true : z3, (i5 + 8) - (8 | i5) != 0 ? KeyboardType.Companion.m6362getTextPjHm6EE() : i3, (-1) - (((-1) - i5) | ((-1) - 16)) != 0 ? ImeAction.Companion.m6301getDefaulteUduSuo() : i4, (DefaultConstructorMarker) null);
    }

    private ImeOptions(boolean z2, int i2, boolean z3, int i3, int i4) {
        this(z2, i2, z3, i3, i4, null, null, 64, null);
    }

    /* JADX INFO: renamed from: copy-wBHncE4$default */
    public static /* synthetic */ ImeOptions m6312copywBHncE4$default(ImeOptions imeOptions, boolean z2, int i2, boolean z3, int i3, int i4, PlatformImeOptions platformImeOptions, LocaleList localeList, int i5, Object obj) {
        if ((-1) - (((-1) - i5) | ((-1) - 1)) != 0) {
            z2 = imeOptions.singleLine;
        }
        if ((2 & i5) != 0) {
            i2 = imeOptions.capitalization;
        }
        if ((-1) - (((-1) - i5) | ((-1) - 4)) != 0) {
            z3 = imeOptions.autoCorrect;
        }
        if ((-1) - (((-1) - i5) | ((-1) - 8)) != 0) {
            i3 = imeOptions.keyboardType;
        }
        if ((i5 + 16) - (16 | i5) != 0) {
            i4 = imeOptions.imeAction;
        }
        if ((-1) - (((-1) - i5) | ((-1) - 32)) != 0) {
            platformImeOptions = imeOptions.platformImeOptions;
        }
        if ((i5 + 64) - (i5 | 64) != 0) {
            localeList = imeOptions.hintLocales;
        }
        return imeOptions.m6315copywBHncE4(z2, i2, z3, i3, i4, platformImeOptions, localeList);
    }

    /* JADX INFO: renamed from: copy-wBHncE4 */
    public final ImeOptions m6315copywBHncE4(boolean z2, int i2, boolean z3, int i3, int i4, PlatformImeOptions platformImeOptions, LocaleList localeList) {
        return new ImeOptions(z2, i2, z3, i3, i4, platformImeOptions, localeList, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: copy-YTHSh70$default */
    public static /* synthetic */ ImeOptions m6310copyYTHSh70$default(ImeOptions imeOptions, boolean z2, int i2, boolean z3, int i3, int i4, PlatformImeOptions platformImeOptions, int i5, Object obj) {
        if ((-1) - (((-1) - i5) | ((-1) - 1)) != 0) {
            z2 = imeOptions.singleLine;
        }
        if ((2 & i5) != 0) {
            i2 = imeOptions.capitalization;
        }
        if ((i5 + 4) - (4 | i5) != 0) {
            z3 = imeOptions.autoCorrect;
        }
        if ((8 & i5) != 0) {
            i3 = imeOptions.keyboardType;
        }
        if ((16 & i5) != 0) {
            i4 = imeOptions.imeAction;
        }
        if ((i5 & 32) != 0) {
            platformImeOptions = imeOptions.platformImeOptions;
        }
        return imeOptions.m6313copyYTHSh70(z2, i2, z3, i3, i4, platformImeOptions);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0013R\u00016\u0005yTlkLg\u000fX\u001ak\\acH*\u0014x%\u0012|[|mb}3t(`lCa\u001c|:Q#Fy!f`\u00031fIG%F=  3#G\u001c\u00039\u00152\u001cpI\u001dX\u0003\u0010b4U")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: copy-YTHSh70 */
    public final /* synthetic */ ImeOptions m6313copyYTHSh70(boolean z2, int i2, boolean z3, int i3, int i4, PlatformImeOptions platformImeOptions) {
        return new ImeOptions(z2, i2, z3, i3, i4, platformImeOptions, this.hintLocales, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: copy-uxg59PA$default */
    public static /* synthetic */ ImeOptions m6311copyuxg59PA$default(ImeOptions imeOptions, boolean z2, int i2, boolean z3, int i3, int i4, int i5, Object obj) {
        if ((1 & i5) != 0) {
            z2 = imeOptions.singleLine;
        }
        if ((-1) - (((-1) - i5) | ((-1) - 2)) != 0) {
            i2 = imeOptions.capitalization;
        }
        if ((i5 + 4) - (4 | i5) != 0) {
            z3 = imeOptions.autoCorrect;
        }
        if ((8 & i5) != 0) {
            i3 = imeOptions.keyboardType;
        }
        if ((-1) - (((-1) - i5) | ((-1) - 16)) != 0) {
            i4 = imeOptions.imeAction;
        }
        return imeOptions.m6314copyuxg59PA(z2, i2, z3, i3, i4);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0013R\u00016\u0005yTlkLg\u000fX\u001ak\\acH*\u0014x%\u0012|[|mb}3t(`lCa\u001c|:Q#Fy!f`\u00031fIG%N@\u0013 M#V(_A\u0007a\u001c\u0004@+Y\u0011;m#\u001a|U\u0015S\u007fS{")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: copy-uxg59PA */
    public final /* synthetic */ ImeOptions m6314copyuxg59PA(boolean z2, int i2, boolean z3, int i3, int i4) {
        return new ImeOptions(z2, i2, z3, i3, i4, this.platformImeOptions, this.hintLocales, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImeOptions)) {
            return false;
        }
        ImeOptions imeOptions = (ImeOptions) obj;
        return this.singleLine == imeOptions.singleLine && KeyboardCapitalization.m6324equalsimpl0(this.capitalization, imeOptions.capitalization) && this.autoCorrect == imeOptions.autoCorrect && KeyboardType.m6341equalsimpl0(this.keyboardType, imeOptions.keyboardType) && ImeAction.m6288equalsimpl0(this.imeAction, imeOptions.imeAction) && Intrinsics.areEqual(this.platformImeOptions, imeOptions.platformImeOptions) && Intrinsics.areEqual(this.hintLocales, imeOptions.hintLocales);
    }

    public int hashCode() {
        int iHashCode = ((((((((Boolean.hashCode(this.singleLine) * 31) + KeyboardCapitalization.m6325hashCodeimpl(this.capitalization)) * 31) + Boolean.hashCode(this.autoCorrect)) * 31) + KeyboardType.m6342hashCodeimpl(this.keyboardType)) * 31) + ImeAction.m6289hashCodeimpl(this.imeAction)) * 31;
        PlatformImeOptions platformImeOptions = this.platformImeOptions;
        return ((iHashCode + (platformImeOptions != null ? platformImeOptions.hashCode() : 0)) * 31) + this.hintLocales.hashCode();
    }

    public String toString() {
        return "ImeOptions(singleLine=" + this.singleLine + ", capitalization=" + ((Object) KeyboardCapitalization.m6326toStringimpl(this.capitalization)) + ", autoCorrect=" + this.autoCorrect + ", keyboardType=" + ((Object) KeyboardType.m6343toStringimpl(this.keyboardType)) + ", imeAction=" + ((Object) ImeAction.m6290toStringimpl(this.imeAction)) + ", platformImeOptions=" + this.platformImeOptions + ", hintLocales=" + this.hintLocales + ')';
    }
}
