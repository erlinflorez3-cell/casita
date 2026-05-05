package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.material3.tokens.DividerTokens;
import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
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
/* JADX INFO: compiled from: DatePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яď\u0014D57\u001eq\u007fR܀kt\nA\u000e0!.J~(-\u001aw\u001dfr96FmH<^[*\u0015l\u00044:[,qI<]\u001a\u0014\"\u0011OThon`Z\u0013C%\u0006\u001exp-QU\u0007]\u001aƁ:B}F;ݹw=O`|Ȃ\r H\"@ц\r\u00010*P\u0010|\u0001KK\"\u00128@vPZ\rc\u0005\"\u0012\fB(\u00014\\oޮ>H\u0003]Bǂ+\u0003\u007fBV'm5\u0005M\u0013GZݓ\r\rѭN+n6u\u001a+SΫ\u000bRi?Ks\u007fX\u001dhUC[O\u0002tNZ\u0016\u0013CI\u007f\u0011k\u0012>\\3q\u0011\u00105Lgcyr>.}z\n0T\u0004<*mMό,ԿǴ\f\u00109\u001a\u0001y\tr\u0010\u0006Z\u007f)}f\u001b3\u001fK+g;\u0017Wg;'qO{31d(ҠmďƟX\u0010f=)}@\\?{X=veP^ǀq\u0004~\u000eJÞ\u0004>q\u0018/*(^\u001d+7ie;!\u001a/xJmv\u0013\u000f\u0001S\u0018\u007fxF(n$fB\t:\btj\u000bk^\u0005p,?zLZ\r}\u0016D8\\&iQ+\u0016N]\u001b\u0002j{\u000b:+5fE\r\u0007k<\u0005id95_\u0018(a\u0001$DEBb\u0013\u000e~B\u00029\u000bb.\"@~\u0003\u0010&)tT\u0012\u0013@v\n\u001cbYa\u001fb\u0015V;6Bo*9e`h\u001e8l3R0\u001a*z\t\u000f\u000btp\u001e\u0015)O2|n]EA\u007fbI,[\"vp\u0015#5,$\u0006MgZ\u0005dlD#\u0006\u0002&\u0016(wi/k@?\u0005/2\u0010l]L!\u0013\u0002S\u0018'\t=\u0012\u000fi\u0016^m\u000ej~mxjx|\u0005\u001d(vl5;\b\u0013-*gLzU'l\u000b\nkyx\tYJ\u0013P|3LN-\u0007o0BM/Y&K\\>\u0019ۥ\u0014˕ԃmq4ApWn\u0017s%DcD\u0012\u0013Wc2I\u0002aY-IR*r\u0003P\u0013\u0003w6M9:\u00133V\r|p\u0005C\u00160=J~\u0007ZZ!Zi\t+o,\u0004^k0sQN,dS'!M\u0002:\u001c?\u0012[\u05c8N\u0011\u0010^\n\u0006?!*>8V\u0006dס4\f{̸NCAe\u0013@Y;B1T\b9IԆhвڄy~ʮc\u0017\u001f2P|SX\u0014[\u0007d'T\u0013j]`O5WϚaʟ\"x=̍UyT`Gc`\f*\u0000[ƨnO\u0007ܺu7RaQ\u001bVcWՑ\u0018زGI\nԍTV7{\u0004o:G±\u0001#JȰ3;W!m\b\u0001m\u0019g|N\u0013\nH,ŽR&A\u0001\u0001\u0011\u001cQZ%\u0019/gr\u001eyUL|\u0010m\u0003p݆\u0019ؐ-\u000b$~i_)Gݥ56ELṕC*V[;\u0004'ß$|"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006U!DYh$5s\u0016;,C<gD%$v7", "", "u(E", "\u000fk[\u0011T;>a", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d%<Y{/3j\u001d.,?JkBs", "5dc\u000e_3\u001dO(~\t", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDn#Y\u0005 5|\u0012+TC\u001agC\u001e#>", "\"n]._\fES*z\nb6\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "5dc!b5:Zx\u0006zo(\f\r9nG\u0007O \u0006f\u0018/", "u(5", "\u0014", "'dP?4);`\u0001\t\u0004m/[\u0005CS\u0006(\u0003@\u0010! ", "", "'dP?@6Gb\u001cl\u0001^3|\u00189n", "'dP?@6Gb\u001cpz^2{\u0005CD{<iF\u0001\u001e\u0017Vy\u0017", "'dP?E(GU\u0019", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u0013n\u000f\u0015wI\u0003\u0017l", "5dc&X(K@\u0015\b|^", "u(;8b;EW\"H\bZ5~\t=/c1\u000b-| \u0019GE", "AgP=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "5dc [(IS", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016^0&T\u007f9\u001f\u0015^\f\\tz\bUL$D", "2dU.h3M2\u0015\u000ezI0z\u000f/r]2\u0003J\u000e%", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006U!DYh$5s\u0016;+MBuA,j", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T/<c\u000b\u000e5p\u00166M\u0019", "5dc\u0011X-:c \u000eYZ;|s3c\u0006(\t\u001e\u000b\u001e!T}", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0003?`\b-%k\u0019.UC\u0011R0'\u0014uk=\u0006vuL\u0001/RV\\,&_\u0003F#\u0016b\u000e\u0018\t\u0017\rdK2nQ\r\u0003K\u0013E\u000b:u\u000b\u0010\u0015!~hzJa\u001aUy^}=8hS][\u0001\u0015\u000b$^9dvc\u001bb:G\u0002\u001ex#(v&", "\u0012`c2C0<Y\u0019\f]^({\u00103n\u007f", "", "Ad[2V;>Rwz\n^\u0014\u0001\u00106i\u000e", "", "2hb=_(R;#}z", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006U)Cd\u0005\u001cKU -M\u0019", "2`c296K[\u0015\u000e\n^9", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006U!DYh$5s\u0016;.MHs0-$hn\u000f", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "\u0012`c2C0<Y\u0019\f]^({\u00103n\u007foIF}\t\u0013YS", "uKY.i(\bZ\u0015\b|(\u0013\u0007\u00121;c\u000fwI\u007f$!Kn!\u0006t/=d\b.77\u001e*\\CHo0%b2@5\u0016c\u0017Rt-GY/6iZnL#\u0012gc5'\u0016\u0004fK(mW\u0001\u001d\u00124T\fIhJ\u001c\u001aW\u001dtoFW\u0014G\u0007j\\=2gSccxZ\u000bCl2o\u0016m\u001d&GJ-#u!\u001b2.8\u0012\u0007]\u001fr_OKK\u000b\n", "\u0012`c2C0<Y\u0019\fib;\u0004\t", "\u0012`c2C0<Y\u0019\fib;\u0004\tvhi\u0007O\f\u0016e", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`~Qn\u0012=z%B/d\u001c@l#8QBN52(\u001dskG\u0007-9^\u007f6KTNu:\\zH\u001e Z\u001b$\u000fpHJ", "1n[<e:", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016V(kR\u007fA\u0010\u0019(W-'\u001c\u0005DE\"tDD|\u00123S\u000fI>", "1n]AT0GS&\\\u0005e6\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "Bhc9X\nH\\(~\u0004m\n\u0007\u00109r", "6dP1_0GSv\t\u0004m,\u0006\u0018\ro\u00072\t", "EdT8W(R1#\b\n^5\ff9l\n5", "AtQ5X(=1#\b\n^5\ff9l\n5", "<`e6Z(MW#\bXh5\f\t8t]2\u0003J\u000e", "GdP?66Gb\u0019\b\n<6\u0004\u0013<", "2hb.U3>R\r~vk\n\u0007\u0012>e\t7YJ\b!$", "1ta?X5MG\u0019z\b<6\u0006\u0018/n\u000f\u0006\u0006G\u000b$", "Ad[2V;>R\r~vk\n\u0007\u0012>e\t7YJ\b!$", "2hb.U3>R\u0007~\u0002^*\f\t.Y\u007f$\t\u001e\u000b &Gx\u001d\u001a\u0001,?f", "Ad[2V;>R\r~vk\n\u0007\u0012>a\u00041{M^!\u001eQ|", "2hb.U3>R\u0007~\u0002^*\f\t.Y\u007f$\t\u001e\u000b &Cs\u0017<\u0004\u0003?`\b-", "2`h\u0010b5MS\"\u000eXh3\u0007\u0016", "2hb.U3>Rwz\u000f<6\u0006\u0018/n\u000f\u0006\u0006G\u000b$", "Ad[2V;>Rwz\u000f<6\u0006\u0018/n\u000f\u0006\u0006G\u000b$", "2hb.U3>R\u0007~\u0002^*\f\t.D{<YJ\n&\u0017P~kF}/B", "Ad[2V;>Rwz\u000f<6\u0006\u0018+i\t(\t\u001e\u000b\u001e!T", "2hb.U3>R\u0007~\u0002^*\f\t.D{<YJ\n&\u0013Kx\u000eIT/<c\u000b", "BnS.l\nH\\(~\u0004m\n\u0007\u00109r", "BnS.l\u000b:b\u0019[\u0005k+|\u0016\ro\u00072\t", "2`h\u0016a\u001a>Z\u0019|\nb6\u0006u+n\u0002(YJ\n&\u0017P~kF}/B", "2`h\u0016a\u001a>Z\u0019|\nb6\u0006u+n\u0002(YJ\n&\u0013Kx\u000eIT/<c\u000b", "2he6W,K1#\u0006\u0005k", "2`c2G,Qby\u0003ze+Z\u00136o\r6", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e%Hh^$7t\u0015\fWJExBs", "1n[<e:\u0006P\u0007knfxG", "uI9\u0017=\u0011#8}c_C\u0011am\u0014Jd\r`%e{{,V\nEu2?]|3\u0001k 6XMIk}&\u0011waF\u000b_3\u001c@\u0016G_]\r`Ry<q\u001ca\u0018[9bkUJ#{N;\u001e\u001buG\fCs\u000b\u001a\u0016WBzyQZ\u0018GCr\u007fI4rTYlO+%)FmK\bh\u001ciD>#';\u0017%p[8\u0018{\u001d\u0019naytkC H\u0002\u0003:|[1Im[<\u0002\u0005)R\u0006\u0005 \b", "GdP?F,ES\u0017\u000e~h5j\u000f/l\u007f7\u0006I", "Ad[2V;>Rwz\n^\u001a\u0003\t6e\u000f2\u0005", "Ad[2V;>Rwz\n^\u000b|\u0017-r\u00043\u000bD\u000b \u0005Mo\u0015<\u0006/>", "@d\\2`)>`\u0007\bvi\r\u0004\r8g\\(~<\u0012\u001b!T", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w.J?t6z\u0015k]J\u000bm9$", ":`iF?0Lb\u0007\u000evm,", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B4GIz\"-\u0011wa\u000f", "2dR.l\bGW!z\nb6\u0006v:e}", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG~7k\u0012B)L?s0-\u0019rj'\u0012c*$", "", "@d\\2`)>`\u0007\bvi\r\u0004\r8g\\(~<\u0012\u001b!T.\u00168\u0006%B]y'\u0005g#.TC7y4", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001T\u0012Ca*?yC\f$dp9\\J(Wu4QPM?&P|E\u001f\u001ch\u000e\u0018'\u0016\ta=3rN@h\u00066V\u0002\u0005G\u0001\n\u0012\"\u0011stJR\u001fK\u0004\u001ecL)f\u001c@[\u0003FNOf)wU]'dED2\u0014;&+q_2\u0012{\u001dn|Z\u0005quG&P\u001c\b\u0002TWOD|_@s:hI\u0006\u007f\u001d<fttu7\u0014=)2s\tUpa@^\u0007$<iA5o\u0017C\u0017HM@uo:\u001fl)n]", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class DatePickerDefaults {
    public static final int $stable = 0;
    public static final String YearAbbrMonthDaySkeleton = "yMMMd";
    public static final String YearMonthSkeleton = "yMMMM";
    public static final String YearMonthWeekdayDaySkeleton = "yMMMMEEEEd";
    public static final DatePickerDefaults INSTANCE = new DatePickerDefaults();
    private static final IntRange YearRange = new IntRange(1900, 2100);
    private static final float TonalElevation = ElevationTokens.INSTANCE.m3191getLevel0D9Ej5fM();
    private static final SelectableDates AllDates = new SelectableDates() { // from class: androidx.compose.material3.DatePickerDefaults$AllDates$1
    };

    private DatePickerDefaults() {
    }

    public final DatePickerColors colors(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -275219611, "C(colors)432@18805L11,432@18817L23:DatePicker.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-275219611, i2, -1, "androidx.compose.material3.DatePickerDefaults.colors (DatePicker.kt:432)");
        }
        int i3 = i2 << 3;
        DatePickerColors defaultDatePickerColors = getDefaultDatePickerColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i3 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i3 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultDatePickerColors;
    }

    /* JADX INFO: renamed from: colors-bSRYm20 */
    public final DatePickerColors m2040colorsbSRYm20(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, TextFieldColors textFieldColors, Composer composer, int i2, int i3, int i4, int i5) {
        TextFieldColors textFieldColors2 = textFieldColors;
        long jM4214getUnspecified0d7_KjU = j25;
        long jM4214getUnspecified0d7_KjU2 = j24;
        long jM4214getUnspecified0d7_KjU3 = j19;
        long jM4214getUnspecified0d7_KjU4 = j23;
        long jM4214getUnspecified0d7_KjU5 = j14;
        long jM4214getUnspecified0d7_KjU6 = j22;
        long jM4214getUnspecified0d7_KjU7 = j21;
        long jM4214getUnspecified0d7_KjU8 = j17;
        long jM4214getUnspecified0d7_KjU9 = j15;
        long jM4214getUnspecified0d7_KjU10 = j20;
        long jM4214getUnspecified0d7_KjU11 = j10;
        long jM4214getUnspecified0d7_KjU12 = j18;
        long jM4214getUnspecified0d7_KjU13 = j16;
        long jM4214getUnspecified0d7_KjU14 = j9;
        long jM4214getUnspecified0d7_KjU15 = j13;
        long jM4214getUnspecified0d7_KjU16 = j11;
        long jM4214getUnspecified0d7_KjU17 = j7;
        long jM4214getUnspecified0d7_KjU18 = j12;
        long jM4214getUnspecified0d7_KjU19 = j8;
        long jM4214getUnspecified0d7_KjU20 = j6;
        long jM4214getUnspecified0d7_KjU21 = j2;
        long jM4214getUnspecified0d7_KjU22 = j4;
        long jM4214getUnspecified0d7_KjU23 = j3;
        long jM4214getUnspecified0d7_KjU24 = j5;
        ComposerKt.sourceInformationMarkerStart(composer, 1991626358, "C(colors)P(0:c#ui.graphics.Color,20:c#ui.graphics.Color,13:c#ui.graphics.Color,23:c#ui.graphics.Color,19:c#ui.graphics.Color,14:c#ui.graphics.Color,24:c#ui.graphics.Color,11:c#ui.graphics.Color,1:c#ui.graphics.Color,18:c#ui.graphics.Color,10:c#ui.graphics.Color,17:c#ui.graphics.Color,9:c#ui.graphics.Color,3:c#ui.graphics.Color,6:c#ui.graphics.Color,16:c#ui.graphics.Color,8:c#ui.graphics.Color,15:c#ui.graphics.Color,7:c#ui.graphics.Color,21:c#ui.graphics.Color,22:c#ui.graphics.Color,5:c#ui.graphics.Color,4:c#ui.graphics.Color,12:c#ui.graphics.Color)501@23101L11,501@23113L23:DatePicker.kt#uh7d8r");
        if ((i5 & 1) != 0) {
            jM4214getUnspecified0d7_KjU21 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i5) | ((-1) - 2)) != 0) {
            jM4214getUnspecified0d7_KjU23 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i5 & 4) != 0) {
            jM4214getUnspecified0d7_KjU22 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i5 + 8) - (i5 | 8) != 0) {
            jM4214getUnspecified0d7_KjU24 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i5) | ((-1) - 16)) != 0) {
            jM4214getUnspecified0d7_KjU20 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i5) | ((-1) - 32)) != 0) {
            jM4214getUnspecified0d7_KjU17 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i5) | ((-1) - 64)) != 0) {
            jM4214getUnspecified0d7_KjU19 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i5 & 128) != 0) {
            jM4214getUnspecified0d7_KjU14 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i5 + 256) - (i5 | 256) != 0) {
            jM4214getUnspecified0d7_KjU11 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i5 + 512) - (i5 | 512) != 0) {
            jM4214getUnspecified0d7_KjU16 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i5 & 1024) != 0) {
            jM4214getUnspecified0d7_KjU18 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i5) | ((-1) - 2048)) != 0) {
            jM4214getUnspecified0d7_KjU15 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i5) | ((-1) - 4096)) != 0) {
            jM4214getUnspecified0d7_KjU5 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i5) | ((-1) - 8192)) != 0) {
            jM4214getUnspecified0d7_KjU9 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i5 & 16384) != 0) {
            jM4214getUnspecified0d7_KjU13 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - 32768) | ((-1) - i5)) != 0) {
            jM4214getUnspecified0d7_KjU8 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((65536 & i5) != 0) {
            jM4214getUnspecified0d7_KjU12 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - 131072) | ((-1) - i5)) != 0) {
            jM4214getUnspecified0d7_KjU3 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((262144 & i5) != 0) {
            jM4214getUnspecified0d7_KjU10 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - 524288) | ((-1) - i5)) != 0) {
            jM4214getUnspecified0d7_KjU7 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((1048576 + i5) - (1048576 | i5) != 0) {
            jM4214getUnspecified0d7_KjU6 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((2097152 + i5) - (2097152 | i5) != 0) {
            jM4214getUnspecified0d7_KjU4 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - 4194304) | ((-1) - i5)) != 0) {
            jM4214getUnspecified0d7_KjU2 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - 8388608) | ((-1) - i5)) != 0) {
            jM4214getUnspecified0d7_KjU = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i5 + 16777216) - (i5 | 16777216) != 0) {
            textFieldColors2 = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1991626358, i2, i3, "androidx.compose.material3.DatePickerDefaults.colors (DatePicker.kt:501)");
        }
        int i6 = i4 >> 12;
        DatePickerColors datePickerColorsM2013copytNwlRmA = getDefaultDatePickerColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i6 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i6 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)).m2013copytNwlRmA(jM4214getUnspecified0d7_KjU21, jM4214getUnspecified0d7_KjU23, jM4214getUnspecified0d7_KjU22, jM4214getUnspecified0d7_KjU24, jM4214getUnspecified0d7_KjU20, jM4214getUnspecified0d7_KjU17, jM4214getUnspecified0d7_KjU19, jM4214getUnspecified0d7_KjU14, jM4214getUnspecified0d7_KjU11, jM4214getUnspecified0d7_KjU16, jM4214getUnspecified0d7_KjU18, jM4214getUnspecified0d7_KjU15, jM4214getUnspecified0d7_KjU5, jM4214getUnspecified0d7_KjU9, jM4214getUnspecified0d7_KjU13, jM4214getUnspecified0d7_KjU8, jM4214getUnspecified0d7_KjU12, jM4214getUnspecified0d7_KjU3, jM4214getUnspecified0d7_KjU10, jM4214getUnspecified0d7_KjU7, jM4214getUnspecified0d7_KjU6, jM4214getUnspecified0d7_KjU2, jM4214getUnspecified0d7_KjU4, jM4214getUnspecified0d7_KjU, textFieldColors2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return datePickerColorsM2013copytNwlRmA;
    }

    public final DatePickerColors getDefaultDatePickerColors(ColorScheme colorScheme, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1180555308, "C:DatePicker.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1180555308, i2, -1, "androidx.compose.material3.DatePickerDefaults.<get-defaultDatePickerColors> (DatePicker.kt:531)");
        }
        DatePickerColors defaultDatePickerColorsCached$material3_release = colorScheme.getDefaultDatePickerColorsCached$material3_release();
        composer.startReplaceGroup(-653681037);
        ComposerKt.sourceInformation(composer, "*589@28839L30");
        if (defaultDatePickerColorsCached$material3_release == null) {
            defaultDatePickerColorsCached$material3_release = new DatePickerColors(ColorSchemeKt.fromToken(colorScheme, DatePickerModalTokens.INSTANCE.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, DatePickerModalTokens.INSTANCE.getHeaderSupportingTextColor()), ColorSchemeKt.fromToken(colorScheme, DatePickerModalTokens.INSTANCE.getHeaderHeadlineColor()), ColorSchemeKt.fromToken(colorScheme, DatePickerModalTokens.INSTANCE.getWeekdaysLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, DatePickerModalTokens.INSTANCE.getRangeSelectionMonthSubheadColor()), colorScheme.m1923getOnSurfaceVariant0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, DatePickerModalTokens.INSTANCE.getSelectionYearUnselectedLabelTextColor()), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, DatePickerModalTokens.INSTANCE.getSelectionYearUnselectedLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, DatePickerModalTokens.INSTANCE.getDateTodayLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, DatePickerModalTokens.INSTANCE.getSelectionYearSelectedLabelTextColor()), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, DatePickerModalTokens.INSTANCE.getSelectionYearSelectedLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, DatePickerModalTokens.INSTANCE.getSelectionYearSelectedContainerColor()), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, DatePickerModalTokens.INSTANCE.getSelectionYearSelectedContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, DatePickerModalTokens.INSTANCE.getDateUnselectedLabelTextColor()), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, DatePickerModalTokens.INSTANCE.getDateUnselectedLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, DatePickerModalTokens.INSTANCE.getDateSelectedLabelTextColor()), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, DatePickerModalTokens.INSTANCE.getDateSelectedLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, DatePickerModalTokens.INSTANCE.getDateSelectedContainerColor()), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, DatePickerModalTokens.INSTANCE.getDateSelectedContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, DatePickerModalTokens.INSTANCE.getDateTodayLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, DatePickerModalTokens.INSTANCE.getDateTodayContainerOutlineColor()), ColorSchemeKt.fromToken(colorScheme, DatePickerModalTokens.INSTANCE.getRangeSelectionActiveIndicatorContainerColor()), ColorSchemeKt.fromToken(colorScheme, DatePickerModalTokens.INSTANCE.getSelectionDateInRangeLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, DividerTokens.INSTANCE.getColor()), OutlinedTextFieldDefaults.INSTANCE.getDefaultOutlinedTextFieldColors(colorScheme, composer, ((i2 + 14) - (i2 | 14)) | 48), null);
            colorScheme.setDefaultDatePickerColorsCached$material3_release(defaultDatePickerColorsCached$material3_release);
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultDatePickerColorsCached$material3_release;
    }

    public static /* synthetic */ DatePickerFormatter dateFormatter$default(DatePickerDefaults datePickerDefaults, String str, String str2, String str3, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            str = YearMonthSkeleton;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            str2 = YearAbbrMonthDaySkeleton;
        }
        if ((i2 & 4) != 0) {
            str3 = YearMonthWeekdayDaySkeleton;
        }
        return datePickerDefaults.dateFormatter(str, str2, str3);
    }

    public final DatePickerFormatter dateFormatter(String str, String str2, String str3) {
        return new DatePickerFormatterImpl(str, str2, str3);
    }

    /* JADX INFO: renamed from: DatePickerTitle-hOD91z4 */
    public final void m2039DatePickerTitlehOD91z4(final int i2, Modifier modifier, Composer composer, final int i3, final int i4) {
        int i5;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(327413563);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(DatePickerTitle)P(0:c#material3.DisplayMode):DatePicker.kt#uh7d8r");
        if ((i4 & 1) != 0) {
            i5 = (i3 + 6) - (i3 & 6);
        } else if ((-1) - (((-1) - i3) | ((-1) - 6)) == 0) {
            i5 = i3 | (composerStartRestartGroup.changed(i2) ? 4 : 2);
        } else {
            i5 = i3;
        }
        int i6 = (-1) - (((-1) - i4) | ((-1) - 2));
        if (i6 != 0) {
            i5 |= 48;
        } else if ((-1) - (((-1) - i3) | ((-1) - 48)) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(companion) ? 32 : 16)));
        }
        if ((-1) - (((-1) - i5) | ((-1) - 19)) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i6 != 0) {
                companion = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(327413563, i5, -1, "androidx.compose.material3.DatePickerDefaults.DatePickerTitle (DatePicker.kt:629)");
            }
            if (DisplayMode.m2082equalsimpl0(i2, DisplayMode.Companion.m2087getPickerjFl4v0())) {
                composerStartRestartGroup.startReplaceGroup(406439148);
                ComposerKt.sourceInformation(composerStartRestartGroup, "632@30821L43,632@30809L77");
                Strings.Companion companion2 = Strings.Companion;
                TextKt.m2711Text4IGK_g(Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(R.string.m3c_date_picker_title), composerStartRestartGroup, 0), companion, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (-1) - (((-1) - i5) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)), 0, 131068);
                composerStartRestartGroup.endReplaceGroup();
            } else if (DisplayMode.m2082equalsimpl0(i2, DisplayMode.Companion.m2086getInputjFl4v0())) {
                composerStartRestartGroup.startReplaceGroup(406443211);
                ComposerKt.sourceInformation(composerStartRestartGroup, "634@30948L42,634@30936L76");
                Strings.Companion companion3 = Strings.Companion;
                TextKt.m2711Text4IGK_g(Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(R.string.m3c_date_input_title), composerStartRestartGroup, 0), companion, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i5 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i5 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION), 0, 131068);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-285079389);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerDefaults$DatePickerTitle$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i7) {
                    this.$tmp0_rcvr.m2039DatePickerTitlehOD91z4(i2, modifier2, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i3) & ((-1) - 1))), i4);
                }
            });
        }
    }

    /* JADX INFO: renamed from: DatePickerHeadline-3kbWawI */
    public final void m2038DatePickerHeadline3kbWawI(final Long l2, final int i2, final DatePickerFormatter datePickerFormatter, Modifier modifier, Composer composer, final int i3, final int i4) {
        int i5;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(1502835813);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(DatePickerHeadline)P(3,1:c#material3.DisplayMode)655@31791L15,688@33142L135,685@33045L268:DatePicker.kt#uh7d8r");
        if ((i4 + 1) - (i4 | 1) != 0) {
            i5 = i3 | 6;
        } else if ((-1) - (((-1) - i3) | ((-1) - 6)) == 0) {
            i5 = (composerStartRestartGroup.changed(l2) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 48));
        } else if ((i3 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(i2) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 = (i5 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i5 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i5 |= (i3 + 512) - (i3 | 512) == 0 ? composerStartRestartGroup.changed(datePickerFormatter) : composerStartRestartGroup.changedInstance(datePickerFormatter) ? 256 : 128;
        }
        int i6 = (-1) - (((-1) - i4) | ((-1) - 8));
        if (i6 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 3072));
        } else if ((-1) - (((-1) - i3) | ((-1) - 3072)) == 0) {
            i5 |= composerStartRestartGroup.changed(companion) ? 2048 : 1024;
        }
        if ((-1) - (((-1) - i5) | ((-1) - 1171)) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (i6 != 0) {
                companion = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1502835813, i5, -1, "androidx.compose.material3.DatePickerDefaults.DatePickerHeadline (DatePicker.kt:654)");
            }
            Locale localeDefaultLocale = CalendarLocale_androidKt.defaultLocale(composerStartRestartGroup, 0);
            String date$default = DatePickerFormatter.formatDate$default(datePickerFormatter, l2, localeDefaultLocale, false, 4, null);
            String date = datePickerFormatter.formatDate(l2, localeDefaultLocale, true);
            composerStartRestartGroup.startReplaceGroup(1148835145);
            String strM2993getString2EP1pXo = "";
            ComposerKt.sourceInformation(composerStartRestartGroup, "");
            if (date == null) {
                if (DisplayMode.m2082equalsimpl0(i2, DisplayMode.Companion.m2087getPickerjFl4v0())) {
                    composerStartRestartGroup.startReplaceGroup(1148842944);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "665@32234L51");
                    Strings.Companion companion2 = Strings.Companion;
                    date = Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(R.string.m3c_date_picker_no_selection_description), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (DisplayMode.m2082equalsimpl0(i2, DisplayMode.Companion.m2086getInputjFl4v0())) {
                    composerStartRestartGroup.startReplaceGroup(1148845915);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "666@32327L46");
                    Strings.Companion companion3 = Strings.Companion;
                    date = Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(R.string.m3c_date_input_no_input_description), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1254558033);
                    composerStartRestartGroup.endReplaceGroup();
                    date = "";
                }
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1148850481);
            ComposerKt.sourceInformation(composerStartRestartGroup, "");
            if (date$default == null) {
                if (DisplayMode.m2082equalsimpl0(i2, DisplayMode.Companion.m2087getPickerjFl4v0())) {
                    composerStartRestartGroup.startReplaceGroup(1148853330);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "673@32559L37");
                    Strings.Companion companion4 = Strings.Companion;
                    date$default = Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(R.string.m3c_date_picker_headline), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (DisplayMode.m2082equalsimpl0(i2, DisplayMode.Companion.m2086getInputjFl4v0())) {
                    composerStartRestartGroup.startReplaceGroup(1148855857);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "674@32638L36");
                    Strings.Companion companion5 = Strings.Companion;
                    date$default = Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(R.string.m3c_date_input_headline), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1254856625);
                    composerStartRestartGroup.endReplaceGroup();
                    date$default = "";
                }
            }
            composerStartRestartGroup.endReplaceGroup();
            if (DisplayMode.m2082equalsimpl0(i2, DisplayMode.Companion.m2087getPickerjFl4v0())) {
                composerStartRestartGroup.startReplaceGroup(1148862013);
                ComposerKt.sourceInformation(composerStartRestartGroup, "680@32830L48");
                Strings.Companion companion6 = Strings.Companion;
                strM2993getString2EP1pXo = Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(R.string.m3c_date_picker_headline_description), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (DisplayMode.m2082equalsimpl0(i2, DisplayMode.Companion.m2086getInputjFl4v0())) {
                composerStartRestartGroup.startReplaceGroup(1148864764);
                ComposerKt.sourceInformation(composerStartRestartGroup, "681@32916L47");
                Strings.Companion companion7 = Strings.Companion;
                strM2993getString2EP1pXo = Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(R.string.m3c_date_input_headline_description), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1255139345);
                composerStartRestartGroup.endReplaceGroup();
            }
            final String str = String.format(strM2993getString2EP1pXo, Arrays.copyOf(new Object[]{date}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(this, *args)");
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1148872084, "CC(remember):DatePicker.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(str);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DatePickerDefaults$DatePickerHeadline$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.m5951setLiveRegionhR3wRGc(semanticsPropertyReceiver, LiveRegionMode.Companion.m5925getPolite0phEisY());
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            TextKt.m2711Text4IGK_g(date$default, SemanticsModifierKt.semantics$default(companion, false, (Function1) objRememberedValue, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 3072, 122876);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerDefaults$DatePickerHeadline$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i7) {
                    DatePickerDefaults datePickerDefaults = this.$tmp9_rcvr;
                    Long l3 = l2;
                    int i8 = i2;
                    DatePickerFormatter datePickerFormatter2 = datePickerFormatter;
                    Modifier modifier3 = modifier2;
                    int i9 = i3;
                    datePickerDefaults.m2038DatePickerHeadline3kbWawI(l3, i8, datePickerFormatter2, modifier3, composer2, RecomposeScopeImplKt.updateChangedFlags((i9 + 1) - (i9 & 1)), i4);
                }
            });
        }
    }

    public final FlingBehavior rememberSnapFlingBehavior$material3_release(LazyListState lazyListState, DecayAnimationSpec<Float> decayAnimationSpec, Composer composer, int i2, int i3) {
        ComposerKt.sourceInformationMarkerStart(composer, -2036003494, "C(rememberSnapFlingBehavior)P(1)708@33801L669:DatePicker.kt#uh7d8r");
        if ((i3 + 2) - (i3 | 2) != 0) {
            decayAnimationSpec = DecayAnimationSpecKt.exponentialDecay$default(0.0f, 0.0f, 3, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2036003494, i2, -1, "androidx.compose.material3.DatePickerDefaults.rememberSnapFlingBehavior (DatePicker.kt:707)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 2078676503, "CC(remember):DatePicker.kt#9igjgp");
        int i4 = (-1) - (((-1) - (((((14 & i2) ^ 6) <= 4 || !composer.changed(lazyListState)) && (i2 + 6) - (i2 | 6) != 4) ? 0 : 1)) & ((-1) - (composer.changed(decayAnimationSpec) ? 1 : 0)));
        Object objRememberedValue = composer.rememberedValue();
        if (i4 != 0 || objRememberedValue == Composer.Companion.getEmpty()) {
            final SnapLayoutInfoProvider snapLayoutInfoProviderSnapLayoutInfoProvider$default = LazyListSnapLayoutInfoProviderKt.SnapLayoutInfoProvider$default(lazyListState, null, 2, null);
            objRememberedValue = SnapFlingBehaviorKt.snapFlingBehavior(new SnapLayoutInfoProvider() { // from class: androidx.compose.material3.DatePickerDefaults$rememberSnapFlingBehavior$1$snapLayoutInfoProvider$1
                @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
                public float calculateApproachOffset(float f2, float f3) {
                    return 0.0f;
                }

                @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
                public float calculateSnapOffset(float f2) {
                    return snapLayoutInfoProviderSnapLayoutInfoProvider$default.calculateSnapOffset(f2);
                }
            }, decayAnimationSpec, AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null));
            composer.updateRememberedValue(objRememberedValue);
        }
        TargetedFlingBehavior targetedFlingBehavior = (TargetedFlingBehavior) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return targetedFlingBehavior;
    }

    public final IntRange getYearRange() {
        return YearRange;
    }

    /* JADX INFO: renamed from: getTonalElevation-D9Ej5fM */
    public final float m2041getTonalElevationD9Ej5fM() {
        return TonalElevation;
    }

    public final Shape getShape(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 700927667, "C734@34850L5:DatePicker.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(700927667, i2, -1, "androidx.compose.material3.DatePickerDefaults.<get-shape> (DatePicker.kt:734)");
        }
        Shape value = ShapesKt.getValue(DatePickerModalTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final SelectableDates getAllDates() {
        return AllDates;
    }
}
