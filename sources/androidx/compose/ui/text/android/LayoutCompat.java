package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
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
/* JADX INFO: compiled from: LayoutCompat.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005*4\u0012\u0006\u0010nj?2Le^.ZS0\u0010s{B)c$wGCU0}*\tUlm̨n`ҙ;C=\u0005N~ b\u0001\u000e2\u0018MKrGu?ݯQoK91\u0001D\u000682P:PڕSʀ.H\u0018͌KOY\u000f*0nr\u0011Ĭ_̂\t\u001a\u001aß\u000f,\u000f\"tg|8\u001fǔ0Ơ3#\u000b݃\u0013Z5dH|{\u000f\u001dÝy˼za&Ѩ\u0011CC\u001b=S1\t)À\u0012ƄCqEݛ9352as\u00068/ãfƦ/O\u0015ƞC2j\ri`:)\u0002ՙ6ׂT\u000e0»K\b\u001bE\u001c\u000e4)\u001f͚\u007fբj\b\u0016ޗE~aJh\u0002\rDVд4ي\u001b%\bđ{E)qiai\u001b%њN˿\u0011\u001e+Ч?-i`&`C(+Ȯ$śU@Eʰ\u001f\u0016gK\u0006\u0004\u001fdXÐVΥK\u007f7Ʌa:%4O[g0wǾTҩHg~ݓ1tayjHn$Eݲ\nҊ\r\fbե5\u0017yalXZ#$ȽVΘ\u0002\u000e\u001b\u05fetyB43$\u001f[v~\u0003M\f {Å9Ơ]nsލ(ElJMQ\u0012&8׳I݀C<jڳ)rPk$Z\u000b*xö\u001bн\u0014w\u0004ͩ\u001f\u0018!KWqJ6\u0003ռkÅ\u0019H\u000bٜ\u0013M\u000b#wZ\u0017\u0012Uԟ\u0006ʗ\u0007i,ڏY\r^w\to\u0016z ؔO˃&-Iٛ\u0006+4q:hb\u001ayȕ\u0001\u0381\u0004Moն_Nr4\u0004tL,$:QQ]?iÈQȞ6\u00025զ\u001d~sre\u0012U|Sȱa³l.oō;|:\u0003\u0003J}VmǸI݈v#\u0010ۭP\u0006oi\u0013G\u0012Vaϼ\u0011ϗv\u0003aߢ\u001fD\u000b)7\u001eS\u0003FܹOީ1C/ݴf\u0004\"T-a\fkFЊLˏ\u0013&|ЁT8q<\bb\u007f_\tյ\u000bա]~FЭtx\u0011i`j&\n\u0019ލ\u0007٢7HIЬAbFu#/,h]Դ_\u0080Z[Bܤ@\nBWw*\"ETн1ǜ)\u0011Uω8y{ut\u000bx\u0011`ΡNϥr\u0012$ܻpbe\u000e!04un݄\u0014ވf\u0005Dɿt@:h \u000bqV@йbĢ\u0004Fgʕg>P!SV<VOֻ)߃\t`MǷq6\u000f-'3Lz\f̔W֪JT7Ѳ\u0003\raL!\u001b\u0019QU݁wŠHTAЉxd\u000f;]]qKXԔVھ-msƑ\\D&.5BF\u001d\u0010ܸcچz0fΗ&p\\\u0017\u000f\u0012\u0015T%ä{Ή~|\u0016ڳZ\u001b\u0019Lgr\u001ed\u0004ْ!ߺ;C\"݅gP7;$|\u0012HqҕX\u05f91=Qݝ͈+9"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|i\u001ei*8]R\u0019u<)\u0011w7", "", "u(E", "\u000fK8\u0014A&\u001c3\u0002mZK", "", "\u000fK8\u0014A&%3ym", "\u000fK8\u0014A&'=\u0006fVE", "\u000fK8\u0014A&(>\u0004hhB\u001b\\", "\u000fK8\u0014A&+7zai", "\u0010Q4\u000e>&,B\u0006Zi>\u000ep\u0003\fAf\u0004d\u001e`u", "\u0010Q4\u000e>&,B\u0006Zi>\u000ep\u0003\u0012Ia\u000bu,pr}+^\u0002", "\u0010Q4\u000e>&,B\u0006Zi>\u000ep\u0003\u001dIg\u0013b ", "\u0012D5\u000eH\u0013-Mte^@\u0015dh\u0018T", "\u0012D5\u000eH\u0013-MukZ:\u0012vv\u001eR[\u0017[\"t", "\u0012D5\u000eH\u0013-MyZaE\tXf\u0015_f\fd z\u0005\u0002#Mq%X", "", "\u0012D5\u000eH\u0013-M{reA\fed\u001eIi\u0011u!mv\u00037Ov\u001aj", "\u0012D5\u000eH\u0013-M|gXE\u001c[h)P[\u0007Z$ix", "\u0012D5\u000eH\u0013-M}nhM\u0010]l\rAn\fe)z~\u0001&O", "\u0012D5\u000eH\u0013-M\u007fZnH\u001ck\u0003\u000bLc\nd(`\u007f\u0006", "\u001a`]1e6BRb\u000ezq;Fo+y\n8\u000b~\\\u001e\u001bIx\u0016<\u007f4\u000b", "5dc\u00118\r\u001aC\u007fmtE\bpr\u001fTy\u0004b$b\u007f~'X|z\u0007)/h}3Fg#.TC7y4", "u(;.a+K]\u001d}Dm,\u0010\u0018xL{<\u0006P\u0010UrNs\u0010E~%>hS", "\u0012D5\u000eH\u0013-M\u007fbc>\u001agd\rIh\nu s\u0006\u0004#", "", "\u0012D5\u000eH\u0013-M\u007fbc>\u001agd\rIh\nu(p}\u0006+Zt V\u0012", "\u0012D5\u000eH\u0013-M\u007fbc>&Yu\u000fAe\"i/t}v", "\u0012D5\u000eH\u0013-M\u007fbc>&Yu\u000fAe\"m*mu\u00115^\u0002#V", "\u0012D5\u000eH\u0013-M\u0001ZmX\u0013`q\u000fS", "\u0012D5\u000eH\u0013-M\b^mM&[l\u001cE]\u0017_*i", "\u0012D5\u000eH\u0013-M\b^mM&[l\u001cE]\u0017_*i\u0011y'_z d\u0014\u00197", "\u001a`]1e6BRb\u000ezq;Fw/x\u000f\u0007\u007fM\u0001\u0015&Ky\u0017\u001fv5B]\f/;kk", "5dc\u00118\r\u001aC\u007fmtM\fow)Dc\u0015[\u001eoz\u00010ip\u001cf\u0012\u0019Gl\u0004\u0015,&2GR;~C\u0018\"hh9\u0003q,", "u(;.a+K]\u001d}Dm,\u0010\u0018xT\u007f;\u000b\u001f\u0005$\u0017E~\u0012F\u007f\b5i\u000b$E|\u001a,#", "\u0016X?\u00158\u0015\u001aB|hcX\rih\u001bU_\u0011Y4zw\u0007.V", "\u0016X?\u00158\u0015\u001aB|hcX\rih\u001bU_\u0011Y4zw\u0007.V\b\u001dR\u0013$", "\u0016X?\u00158\u0015\u001aB|hcX\rih\u001bU_\u0011Y4z\u007f\u00010O", "\u0016X?\u00158\u0015\u001aB|hcX\rih\u001bU_\u0011Y4z\u007f\u00014Wi#", "\u0016X?\u00158\u0015\u001aB|hcX\rih\u001bU_\u0011Y4z\u007f\u00014Wi#p\u0006\u0011Gl", "\u0018TB!<\r\"1tm^H\u0015vp\u0019D_\"_)ov\u0004Aaw)U", "\u0018TB!<\r\"1tm^H\u0015vp\u0019D_\"d*iv", "\u001aH=\u0012R\t+3tdtL\u001bpo\u000f_f\u0012e.`", "\u001aH=\u0012R\t+3tdtL\u001bpo\u000f_h\u0012d ", "\u001aH=\u0012R\t+3tdtL\u001bpo\u000f_h\u0012h(\\}", "\u001aH=\u0012R\t+3tdtL\u001bpo\u000f_m\u0017h$^\u0006", "\u001aH=\u0012R\t+3tdtP\u0016ig)Sn\u001cb z\u007f\u00010O", "\u001aH=\u0012R\t+3tdtP\u0016ig)Sn\u001cb z\u0002y4K{\u001c", "\"DG!R\u000b\"@x\\iB\u0016e\u0003\u000bNs\"h/g\u0011}6\\", "\"DG!R\u000b\"@x\\iB\u0016e\u0003\u0010Il\u0016j:n\u0006\u00041Xo6]\u0014\"", "\"DG!R\u000b\"@x\\iB\u0016e\u0003\u0010Il\u0016j:n\u0006\u00041Xo6c\u0014\u001c", "\"DG!R\u000b\"@x\\iB\u0016e\u0003\u0016O]\u0004b ", "\"DG!R\u000b\"@x\\iB\u0016e\u0003\u0016Tl", "\"DG!R\u000b\"@x\\iB\u0016e\u0003\u001cTf", "\"DG!R\u000e+/\u0002na:\u0019`w#_]\u000bW-\\t\u0006'\\", "\"DG!R\u000e+/\u0002na:\u0019`w#_q\u0012h\u001f", "\u0010qT.^\u001aM`\u0015\u000ez`@", "\u0016x_5X5:b\u001d\t\u0004?9|\u0015?e\t&\u0010", "\u0018tbA\\-BQ\u0015\u000e~h5d\u0013.e", "\u001ah]259>O\u001fl\nr3|", "\u001ah]259>O\u001fp\u0005k+j\u0018Cl\u007f", "\"dgA70KS\u0017\u000e~h5", "\"dgA:9:\\)\u0006vk0\f\u001d", "\"dgA?(R])\u000eVe0~\u00127e\t7", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LayoutCompat {
    public static final int ALIGN_CENTER = 2;
    public static final int ALIGN_LEFT = 3;
    public static final int ALIGN_NORMAL = 0;
    public static final int ALIGN_OPPOSITE = 1;
    public static final int ALIGN_RIGHT = 4;
    public static final int BREAK_STRATEGY_BALANCED = 2;
    public static final int BREAK_STRATEGY_HIGH_QUALITY = 1;
    public static final int BREAK_STRATEGY_SIMPLE = 0;
    public static final int DEFAULT_ALIGNMENT = 0;
    public static final int DEFAULT_BREAK_STRATEGY = 0;
    public static final boolean DEFAULT_FALLBACK_LINE_SPACING = true;
    public static final int DEFAULT_HYPHENATION_FREQUENCY = 0;
    public static final boolean DEFAULT_INCLUDE_PADDING = false;
    public static final int DEFAULT_JUSTIFICATION_MODE = 0;
    public static final float DEFAULT_LINESPACING_EXTRA = 0.0f;
    public static final float DEFAULT_LINESPACING_MULTIPLIER = 1.0f;
    public static final int DEFAULT_LINE_BREAK_STYLE = 0;
    public static final int DEFAULT_LINE_BREAK_WORD_STYLE = 0;
    public static final int DEFAULT_MAX_LINES = Integer.MAX_VALUE;
    public static final int DEFAULT_TEXT_DIRECTION = 2;
    public static final int HYPHENATION_FREQUENCY_FULL = 2;
    public static final int HYPHENATION_FREQUENCY_FULL_FAST = 4;
    public static final int HYPHENATION_FREQUENCY_NONE = 0;
    public static final int HYPHENATION_FREQUENCY_NORMAL = 1;
    public static final int HYPHENATION_FREQUENCY_NORMAL_FAST = 3;
    public static final int JUSTIFICATION_MODE_INTER_WORD = 1;
    public static final int JUSTIFICATION_MODE_NONE = 0;
    public static final int LINE_BREAK_STYLE_LOOSE = 1;
    public static final int LINE_BREAK_STYLE_NONE = 0;
    public static final int LINE_BREAK_STYLE_NORMAL = 2;
    public static final int LINE_BREAK_STYLE_STRICT = 3;
    public static final int LINE_BREAK_WORD_STYLE_NONE = 0;
    public static final int LINE_BREAK_WORD_STYLE_PHRASE = 1;
    public static final int TEXT_DIRECTION_ANY_RTL_LTR = 4;
    public static final int TEXT_DIRECTION_FIRST_STRONG_LTR = 2;
    public static final int TEXT_DIRECTION_FIRST_STRONG_RTL = 3;
    public static final int TEXT_DIRECTION_LOCALE = 5;
    public static final int TEXT_DIRECTION_LTR = 0;
    public static final int TEXT_DIRECTION_RTL = 1;
    public static final int TEXT_GRANULARITY_CHARACTER = 0;
    public static final int TEXT_GRANULARITY_WORD = 1;
    public static final LayoutCompat INSTANCE = new LayoutCompat();
    private static final Layout.Alignment DEFAULT_LAYOUT_ALIGNMENT = Layout.Alignment.ALIGN_NORMAL;
    private static final TextDirectionHeuristic DEFAULT_TEXT_DIRECTION_HEURISTIC = TextDirectionHeuristics.FIRSTSTRONG_LTR;
    public static final int $stable = 8;

    /* JADX INFO: compiled from: LayoutCompat.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d<K!&i\u000e]LшzĲA\u001cֶ;.p}bܥ\u0082{\u0007"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|i\u001ei*8]R\u0019u<)\u0011w \u0016\u0014c(Td6TH],^fH", "", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface BreakStrategy {
    }

    /* JADX INFO: compiled from: LayoutCompat.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d<K!&i\u000e]LшzĲA\u001cֶ;.p}bܥ\u0082{\u0007"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|i\u001ei*8]R\u0019u<)\u0011w \u001c\u001bn/N\u007f#VPX5=_rI$\u0012c\fb\u0001", "", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface HyphenationFrequency {
    }

    /* JADX INFO: compiled from: LayoutCompat.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d<K!&i\u000e]LшzĲA\u001cֶ;.p}bܥ\u0082{\u0007"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|i\u001ei*8]R\u0019u<)\u0011w \u001e\u0017q;Rw+EH]0f[ZG\u0013\u00120", "", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface JustificationMode {
    }

    /* JADX INFO: compiled from: LayoutCompat.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d<K!&i\u000e]LшzĲA\u001cֶ;.p}bܥ\u0082{\u0007"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|i\u001ei*8]R\u0019u<)\u0011w  \u000bl,+\u0004'CR<;pYr\u0013", "", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface LineBreakStyle {
    }

    /* JADX INFO: compiled from: LayoutCompat.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d<K!&i\u000e]LшzĲA\u001cֶ;.p}bܥ\u0082{\u0007"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|i\u001ei*8]R\u0019u<)\u0011w  \u000bl,+\u0004'CR@6iQ`L(\u0019Zc", "", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface LineBreakWordStyle {
    }

    /* JADX INFO: compiled from: LayoutCompat.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d<K!&i\u000e]LшzĲA\u001cֶ;.p}bܥ\u0082{\u0007"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|i\u001ei*8]R\u0019u<)\u0011w (\u0007v;-z4GJ]0f[H", "", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface TextDirection {
    }

    /* JADX INFO: compiled from: LayoutCompat.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d<K!&i\u000e]LшzĲA\u001cֶ;.p}bܥ\u0082{\u0007"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|i\u001ei*8]R\u0019u<)\u0011w (\u0007v;0\u0004#P\\U(iV\u0002Qi", "", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface TextGranularity {
    }

    /* JADX INFO: compiled from: LayoutCompat.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d<K!&i\u000e]LшzĲA\u001cֶ;.p}bܥ\u0082{\u0007"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|i\u001ei*8]R\u0019u<)\u0011w (\u0007v;5r;Q\\]\bcVtF\u001c\u0012c\u001d$", "", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface TextLayoutAlignment {
    }

    private LayoutCompat() {
    }

    public final Layout.Alignment getDEFAULT_LAYOUT_ALIGNMENT$ui_text_release() {
        return DEFAULT_LAYOUT_ALIGNMENT;
    }

    public final TextDirectionHeuristic getDEFAULT_TEXT_DIRECTION_HEURISTIC$ui_text_release() {
        return DEFAULT_TEXT_DIRECTION_HEURISTIC;
    }
}
