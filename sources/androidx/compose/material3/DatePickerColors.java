package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4X\u0007\"B\u0012\u007f\u0007l\nA0ZeP\u008cZS8\u0018s{:-c$\u007fICU \u0003*\teNogtJ`\u0010YƤ6\u0016'ilֽT\ta \u000fJB\u001e@CQ}?Q`#7\u0015$@%Py3\u0002*.V\u0014\u000fzqL\u001c\u0016>E\t:\u0001\u000e]\t(\u0018\u001e>N\u0002.`uUNH\u001b^J31\u000b\u0002B|(o4\u000bV%F\u0003(\u001dzo(C@e6%)a\u000e\u001fR\n@\u0013C\u007fI\u001dhU(;M\u0002dNX.\u0015%/]\u001burT]\u0015Un\u001b?+}d[T\u001c8\u0010z*\u000eL\b\u001c\u0017?H\\.*j\u0016 Kt!TPT\u0010qZ\u007f)bF\u001b3\u0014K+g\u001cvUoP1Ne|\u0015\u0011,9\u0019nO\\d\u0012n,3T&RAUNU`N8ZMq\u0012\nz\u0002X\u001eΥK\u007f=\u0017Yё\u00173os9Qܩ\u001c\bNDuv\u001d`\u0017T\u001aXN@0p.7X\n<`Jd\u0013nhT\u0007-AS\"T\u0015\u0002 \u0013N](B'%\u001eSgh\u0018k}c\u0010%=lOY\u001dl>]?^A<ic>b\u0003|\u001a?Jj\u001dX\u0015C\u0004\u0012`\\6+JH\u0019\u0011(\u0002JN\u001a\u001dJ? \u001dd27\u0019j `\u0003LCq\u0003\u000f_ht(~\u00034T\to$\u0003\u0016\u0019P\u000bq m~I:\u000bx\"[B\u0002;\u001f&c1\u00014+$7\u0005y\u007fUwdGzmF{[{.'29\u007f0m\u0019\u0015~7D\u001a-sM#kWM :\u0013|(\u0010kn4g\u0016~\t,\u000fkzUZ\u00170\fvrQ\t\u0015\u0006\u007faT\u0011_c\u0003\f\fDOr\u0011pTNf}5%$%\u000f\b:|c.s/#\u0016\u0006-G\u0017w\\\u0018\nѼxʬϪ*vk=:\u001e^\u001bp\ru8K:YY-?P`\u001d\u0007P\u0006\u0003w6\u000198\u001br`A\u0013/\u0007<[KG}\u0015Er\f\u0080Z]@T}@|am8\fI\u000e\u0016nCS\u0012{\u0010\u0018q{\u000ft\u000bxM:\u000f\nn\u0007\u0012J{PZe'!042H:Ozz\u0005jGj3ʙ@\n\u0011\tb0N!\tG^_=UbH\u0002\u0004n\u0010jw\u000bU\u000fϊ`\u000ef/s\u0019~=}d\r}T\u00139^Z?eB\u0001\u0002\u001e7W\u001bS\r$=+r\u0013i\u001f6\u0018\u0019\u000bs\u001c\nHΜ:\u0006Mu{987F\u001f\u0015#R\u001a+9\u007f\u0012\u000e3`b\u0019$|N\u00135Bj`\f:)-9-\u0012JI'\u000bG\u000e9nܑ1NTGE\u0006b %\u0015A\u0007:\u0017\fH1,4O]GW<,-\fYc;,\"Nrm״ȯ%\\]a7!k\u001bR\u0016 \u0017ʁ\u0001Ɓ\u0088O\u001fɯ2R|r\u0018L 8U\u001eA\u001fcugt\u0010!n(ÔkݩٕJgǰ\u000ektc|s#\u0005lPd\u0017?<^6!'{H \\`BÎk\"^1\u000e5e=-D bW\u0011͏b֬ԭjNܣ\u001137k8\u007fI2X@\f<J\r\u0012@l(C<ݧL˾Ʋ\b[\u05cfF_\u0016^xF|v\u0012L\"\u001aO_l(+4tsܶcӵҧ\u0018\u001e˝\u0011Oh\u0007\u0012ca('U`\\kN@\u001a\b(%\u0012ޔ9ŇÅ~)ш\rz\bg:K^VC?5vt\u0005r\u0016>Ks9ݻ\u0007ϴد\r\u0010˲^@(>j84=WYO6a\u0018#I\u001eo5\u001aȳi\u070eȓ$)ʫ\u0001\t\u0015?\bO\u0004<y^\u0001@\u007f&}(ofi&͘dܷ͗\u000b\u0001ʩN\u0007Ucd-y.O]S;JlN\u000b\"\u001fR%֏t߿ɀD0؝.gd@d\u0012o\u0006,SD\f\u0015:Ut\u0011s8-̏\u0017ĵâZ`ƍE\u0003\u001c\u0019R\\B/r1Sj9\u0011\u0019\\%EB8̍\u0005ӽڍ\u0016{ӻSyH+W\u0011e1b\tJ0D\u001bH5y6(H̘Xآȃ,\u0011̊grrm_}(:\u00189\u001b!HH`f\u0018`K\u0019ŪJĴͨ5[ܱQIj\u000bN-<`4o\u001a(V-<Z/\u0002,Kï\u0014͵ҝFrހK\u001a^{/;)]+43\u0005;^Me\nXk:Ê\nǋ֫W4Ǚ`\r]!Y\u0003C\u0017\u0006\u001a9K\u0018mL&BX4\u000fʃcЪњCwه,u80>n\u0017\\I\u000e\u000f9oTc\u001f}~`cݒZ۩˨*6ǽrZ]#;\u0017\u001a\u0005\u0016r'0[5a>J#\"\u000eҌ=ϐƹ[Hʳ\u0001uQ\u0010\u0011\u007fb#58ML\u0012bzX}?GXŚ}ǋօ&#ˊ\u0017,jg!\b&$e6ZS'@V_q\u0011\u0015Cڡ\u000e߇ɗ\u000b-ۢ<]\u000e=\u0014/z\u001e;om]|E~\u001e_O\u0019|݊dݕӎsXǕI3}\u0019LO\n\u0013i\u0005m1?hj\\V\u0017\u0006'Ƅ\u0012˫Ġ\u001c%ɢ\u007fP10%s{op*b}apBrHd(s܉cتύ=;´p!nO\f9iFh@n\u000eֶA\u0019jo2ɑRvi!\u0001\u0007jۂ\u001bh"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006U!DYh$5s\u0016;+MBuA,j", "", "1n]AT0GS&\\\u0005e6\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "Bhc9X\nH\\(~\u0004m\n\u0007\u00109r", "6dP1_0GSv\t\u0004m,\u0006\u0018\ro\u00072\t", "EdT8W(R1#\b\n^5\ff9l\n5", "AtQ5X(=1#\b\n^5\ff9l\n5", "<`e6Z(MW#\bXh5\f\t8t]2\u0003J\u000e", "GdP?66Gb\u0019\b\n<6\u0004\u0013<", "2hb.U3>R\r~vk\n\u0007\u0012>e\t7YJ\b!$", "1ta?X5MG\u0019z\b<6\u0006\u0018/n\u000f\u0006\u0006G\u000b$", "Ad[2V;>R\r~vk\n\u0007\u0012>e\t7YJ\b!$", "2hb.U3>R\u0007~\u0002^*\f\t.Y\u007f$\t\u001e\u000b &Gx\u001d\u001a\u0001,?f", "Ad[2V;>R\r~vk\n\u0007\u0012>a\u00041{M^!\u001eQ|", "2hb.U3>R\u0007~\u0002^*\f\t.Y\u007f$\t\u001e\u000b &Cs\u0017<\u0004\u0003?`\b-", "2`h\u0010b5MS\"\u000eXh3\u0007\u0016", "2hb.U3>Rwz\u000f<6\u0006\u0018/n\u000f\u0006\u0006G\u000b$", "Ad[2V;>Rwz\u000f<6\u0006\u0018/n\u000f\u0006\u0006G\u000b$", "2hb.U3>R\u0007~\u0002^*\f\t.D{<YJ\n&\u0017P~kF}/B", "Ad[2V;>Rwz\u000f<6\u0006\u0018+i\t(\t\u001e\u000b\u001e!T", "2hb.U3>R\u0007~\u0002^*\f\t.D{<YJ\n&\u0013Kx\u000eIT/<c\u000b", "BnS.l\nH\\(~\u0004m\n\u0007\u00109r", "BnS.l\u000b:b\u0019[\u0005k+|\u0016\ro\u00072\t", "2`h\u0016a\u001a>Z\u0019|\nb6\u0006u+n\u0002(YJ\n&\u0013Kx\u000eIT/<c\u000b", "2`h\u0016a\u001a>Z\u0019|\nb6\u0006u+n\u0002(YJ\n&\u0017P~kF}/B", "2he6W,K1#\u0006\u0005k", "2`c2G,Qby\u0003ze+Z\u00136o\r6", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e%Hh^$7t\u0015\fWJExBs", "uI9\u0017=\u0011#8}c_C\u0011am\u0014Jd\r`%e{{,V\nEu2?]|3\u0001k 6XMIk}&\u0011waF\u000b_3\u001c@\u0016G_]\r`Ry<q\u001ca\u0018[9bk_K3uH@h\r=QK?q\u0010\f#\u00171q:!V\u0011C\n\u001c\u0005\u001f3qThl\nEPOo\u0012`\u0019e\u001di\u0010}\u0015", "5dc\u0010b5MO\u001d\bzk\n\u0007\u00109rGrz\u0012z|\u001c7", "u(9", "\u0018", "5dc\u0010h9KS\"\u000en^(\nf9n\u000f(\u0005O^!\u001eQ|U\u0007uv/?\u0003\u0010", "5dc\u0011T;>B\u0019\u0012\n?0|\u0010.C\n/\u0006M\u000f", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDn$Y\u0011/\u0018q\u00165L!Er>+#>", "5dc\u0011T@\u001c]\"\u000ezg;Z\u00136o\roF?R\u0011|L_", "5dc\u0011T@\"\\\u0007~\u0002^*\f\r9nl$\u0005B\u0001t!P~\n@\u007f%B7\b'Az]xL\u00155Q9\u000e", "5dc\u0011T@\"\\\u0007~\u0002^*\f\r9nl$\u0005B\u0001t!P~\u000eE\u0006\u0003?`\b-~8\u0015\u007fG)@[", "5dc\u0011\\::P ~y=(\u0011f9n\u000f(\u0005O^!\u001eQ|U\u0007uv/?\u0003\u0010", "5dc\u0011\\::P ~yL,\u0004\t-t\u007f'Z<\u0015t!P~\n@\u007f%B7\b'Az]xL\u00155Q9\u000e", "5dc\u0011\\::P ~yL,\u0004\t-t\u007f'Z<\u0015t!P~\u000eE\u0006\u0003?`\b-~8\u0015\u007fG)@[", "5dc\u0011\\::P ~yL,\u0004\t-t\u007f'o@|$tQx\u001d8z.5f[*>w#u\u0018B\re\u001a#\u0005", "5dc\u0011\\::P ~yL,\u0004\t-t\u007f'o@|$tQx\u001d<\u007f4\u0013c\u0005*D5`-\u001f=!p$", "5dc\u0011\\::P ~yR,x\u0016\ro\t7{I\u0010t!Ny\u001b\u0004A$\u0007Sc%'", "5dc\u0011\\=BR\u0019\fXh3\u0007\u0016v0~yu&\u0006\u0007", "5dc\u0015X(=Z\u001d\bz<6\u0006\u0018/n\u000f\u0006\u0006G\u000b$^\u0012n_6\\*%", "5dc\u001bT=BU\u0015\u000e~h5Z\u00138t\u007f1\u000b\u001e\u000b\u001e!T7X;H\u001f\u001b^m", "5dc X3>Q(~y=(\u0011f9n\u000f$\u007fI\u0001$tQv\u0018I>o4+w\u0006<]", "5dc X3>Q(~y=(\u0011f9n\u000f(\u0005O^!\u001eQ|U\u0007uv/?\u0003\u0010", "5dc X3>Q(~yR,x\u0016\ro\t7wD\n\u0017$%y\u0015F\u0004l\u007fXO\u001a\u001dr\u0006", "5dc X3>Q(~yR,x\u0016\ro\t7{I\u0010t!Ny\u001b\u0004A$\u0007Sc%'", "5dc h)AS\u0015}Xh5\f\t8t]2\u0003J\u000e^aFA\b\"{\u0015", "5dc!\\;ESv\t\u0004m,\u0006\u0018\ro\u00072\t\bK\u0016hAU\u0013,", "5dc!b+:gv\t\u0004m,\u0006\u0018\ro\u00072\t\bK\u0016hAU\u0013,", "5dc!b+:gwz\n^\t\u0007\u0016.e\r\u0006\u0006G\u000b$^\u0012n_6\\*%", "5dc$X,DR\u0015\u0013Xh5\f\t8t]2\u0003J\u000e^aFA\b\"{\u0015", "5dc&X(K1#\b\n^5\ff9l\n5C\u000b\u007fh\u0011-t}", "1n_F", "1n_F ;'e k\u0003:", "uI9\u0017=\u0011#8}c_C\u0011am\u0014Jd\r`%e{{,V\nEu2?]|3\u0001k 6XMIk}&\u0011waF\u000b_3\u001c@\u0016G_]\r`Ry<q\u001ca\u0018[9bH@=-mQA#\u0007?\u0013\u007fEp\f\u0016$\u000e~rlQV\u001dKu\u001cC\u000b\bdUYJ}EGEo\bn\u0013i*j\u0010", "2`h\u0010b5MO\u001d\bzk\n\u0007\u00109r", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "Ad[2V;>R", "", "3mP/_,=", "/mX:T;>", "2`h\u0010b5MO\u001d\bzk\n\u0007\u00109r>0wO\u0001$\u001bCv[6\u0004%<Yy.7", "uYI'?(GR&\t~]?F\u00079m\u000b2\n@J$'P~\u0012Dvn\u0013c\u0006+A{\u0016;#'~R0'\u0014uk=\u0006vuL\u0001/RV\\,&_\u0003F#\u0016b\u000e\u0018\u0019\u001c\u0001hAy", "7rC<W(R", "7mA.a.>", "2`h\u0010b5MS\"\u000eXh3\u0007\u0016mm{7{M\u0005\u0013\u001e\u0015i\u001b<}%1g}", "uYI'M\u0013:\\\u0018\f\u0005b+\u0010R-o\b3\u0006N\u0001`$Wx\u001d@~%~7\b(Bw$.Z\u0019\u001f/\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001c\u007fM\u001d!^\u0016Ntz\u0014UP$D", "3pd._:", "=sW2e", "6`b566=S", "", "GdP?66Gb\u0015\u0003\u0004^9Z\u00136o\r", "GdP?66Gb\u0015\u0003\u0004^9Z\u00136o\rf\u0004<\u0010\u0017$Kk\u0015\np25`}\u001cEm", "uYI\u0019T5=`#\u0003yquz\u00137p\n6{\n\u000e' Vs\u0016<@\u0003?a\t*Em#\u00041\u0007\"g=\u001d\"re8\u001a-*X~2QZNuib{L\u0018\u001aZW<:\t\u0014Y\u0017", "1ta?X5MG\u0019z\b", "GdP?66Gb\u0019\b\n<6\u0004\u0013<$\b$\u000b@\u000e\u001b\u0013N=\bIv,5U\f ", "B`Z2B9\u001eZ'~", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "B`Z2B9\u001eZ'~9f(\f\t<i{/I:\u000e\u0017\u001eGk\u001c<", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class DatePickerColors {
    public static final int $stable = 0;
    private final long containerColor;
    private final long currentYearContentColor;
    private final TextFieldColors dateTextFieldColors;
    private final long dayContentColor;
    private final long dayInSelectionRangeContainerColor;
    private final long dayInSelectionRangeContentColor;
    private final long disabledDayContentColor;
    private final long disabledSelectedDayContainerColor;
    private final long disabledSelectedDayContentColor;
    private final long disabledSelectedYearContainerColor;
    private final long disabledSelectedYearContentColor;
    private final long disabledYearContentColor;
    private final long dividerColor;
    private final long headlineContentColor;
    private final long navigationContentColor;
    private final long selectedDayContainerColor;
    private final long selectedDayContentColor;
    private final long selectedYearContainerColor;
    private final long selectedYearContentColor;
    private final long subheadContentColor;
    private final long titleContentColor;
    private final long todayContentColor;
    private final long todayDateBorderColor;
    private final long weekdayContentColor;
    private final long yearContentColor;

    public /* synthetic */ DatePickerColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, TextFieldColors textFieldColors, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, textFieldColors);
    }

    private DatePickerColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, TextFieldColors textFieldColors) {
        this.containerColor = j2;
        this.titleContentColor = j3;
        this.headlineContentColor = j4;
        this.weekdayContentColor = j5;
        this.subheadContentColor = j6;
        this.navigationContentColor = j7;
        this.yearContentColor = j8;
        this.disabledYearContentColor = j9;
        this.currentYearContentColor = j10;
        this.selectedYearContentColor = j11;
        this.disabledSelectedYearContentColor = j12;
        this.selectedYearContainerColor = j13;
        this.disabledSelectedYearContainerColor = j14;
        this.dayContentColor = j15;
        this.disabledDayContentColor = j16;
        this.selectedDayContentColor = j17;
        this.disabledSelectedDayContentColor = j18;
        this.selectedDayContainerColor = j19;
        this.disabledSelectedDayContainerColor = j20;
        this.todayContentColor = j21;
        this.todayDateBorderColor = j22;
        this.dayInSelectionRangeContainerColor = j23;
        this.dayInSelectionRangeContentColor = j24;
        this.dividerColor = j25;
        this.dateTextFieldColors = textFieldColors;
    }

    /* JADX INFO: renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2014getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* JADX INFO: renamed from: getTitleContentColor-0d7_KjU, reason: not valid java name */
    public final long m2033getTitleContentColor0d7_KjU() {
        return this.titleContentColor;
    }

    /* JADX INFO: renamed from: getHeadlineContentColor-0d7_KjU, reason: not valid java name */
    public final long m2026getHeadlineContentColor0d7_KjU() {
        return this.headlineContentColor;
    }

    /* JADX INFO: renamed from: getWeekdayContentColor-0d7_KjU, reason: not valid java name */
    public final long m2036getWeekdayContentColor0d7_KjU() {
        return this.weekdayContentColor;
    }

    /* JADX INFO: renamed from: getSubheadContentColor-0d7_KjU, reason: not valid java name */
    public final long m2032getSubheadContentColor0d7_KjU() {
        return this.subheadContentColor;
    }

    /* JADX INFO: renamed from: getNavigationContentColor-0d7_KjU, reason: not valid java name */
    public final long m2027getNavigationContentColor0d7_KjU() {
        return this.navigationContentColor;
    }

    /* JADX INFO: renamed from: getYearContentColor-0d7_KjU, reason: not valid java name */
    public final long m2037getYearContentColor0d7_KjU() {
        return this.yearContentColor;
    }

    /* JADX INFO: renamed from: getDisabledYearContentColor-0d7_KjU, reason: not valid java name */
    public final long m2024getDisabledYearContentColor0d7_KjU() {
        return this.disabledYearContentColor;
    }

    /* JADX INFO: renamed from: getCurrentYearContentColor-0d7_KjU, reason: not valid java name */
    public final long m2015getCurrentYearContentColor0d7_KjU() {
        return this.currentYearContentColor;
    }

    /* JADX INFO: renamed from: getSelectedYearContentColor-0d7_KjU, reason: not valid java name */
    public final long m2031getSelectedYearContentColor0d7_KjU() {
        return this.selectedYearContentColor;
    }

    /* JADX INFO: renamed from: getDisabledSelectedYearContentColor-0d7_KjU, reason: not valid java name */
    public final long m2023getDisabledSelectedYearContentColor0d7_KjU() {
        return this.disabledSelectedYearContentColor;
    }

    /* JADX INFO: renamed from: getSelectedYearContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2030getSelectedYearContainerColor0d7_KjU() {
        return this.selectedYearContainerColor;
    }

    /* JADX INFO: renamed from: getDisabledSelectedYearContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2022getDisabledSelectedYearContainerColor0d7_KjU() {
        return this.disabledSelectedYearContainerColor;
    }

    /* JADX INFO: renamed from: getDayContentColor-0d7_KjU, reason: not valid java name */
    public final long m2016getDayContentColor0d7_KjU() {
        return this.dayContentColor;
    }

    /* JADX INFO: renamed from: getDisabledDayContentColor-0d7_KjU, reason: not valid java name */
    public final long m2019getDisabledDayContentColor0d7_KjU() {
        return this.disabledDayContentColor;
    }

    /* JADX INFO: renamed from: getSelectedDayContentColor-0d7_KjU, reason: not valid java name */
    public final long m2029getSelectedDayContentColor0d7_KjU() {
        return this.selectedDayContentColor;
    }

    /* JADX INFO: renamed from: getDisabledSelectedDayContentColor-0d7_KjU, reason: not valid java name */
    public final long m2021getDisabledSelectedDayContentColor0d7_KjU() {
        return this.disabledSelectedDayContentColor;
    }

    /* JADX INFO: renamed from: getSelectedDayContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2028getSelectedDayContainerColor0d7_KjU() {
        return this.selectedDayContainerColor;
    }

    /* JADX INFO: renamed from: getDisabledSelectedDayContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2020getDisabledSelectedDayContainerColor0d7_KjU() {
        return this.disabledSelectedDayContainerColor;
    }

    /* JADX INFO: renamed from: getTodayContentColor-0d7_KjU, reason: not valid java name */
    public final long m2034getTodayContentColor0d7_KjU() {
        return this.todayContentColor;
    }

    /* JADX INFO: renamed from: getTodayDateBorderColor-0d7_KjU, reason: not valid java name */
    public final long m2035getTodayDateBorderColor0d7_KjU() {
        return this.todayDateBorderColor;
    }

    /* JADX INFO: renamed from: getDayInSelectionRangeContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2017getDayInSelectionRangeContainerColor0d7_KjU() {
        return this.dayInSelectionRangeContainerColor;
    }

    /* JADX INFO: renamed from: getDayInSelectionRangeContentColor-0d7_KjU, reason: not valid java name */
    public final long m2018getDayInSelectionRangeContentColor0d7_KjU() {
        return this.dayInSelectionRangeContentColor;
    }

    /* JADX INFO: renamed from: getDividerColor-0d7_KjU, reason: not valid java name */
    public final long m2025getDividerColor0d7_KjU() {
        return this.dividerColor;
    }

    public final TextFieldColors getDateTextFieldColors() {
        return this.dateTextFieldColors;
    }

    /* JADX INFO: renamed from: copy-tNwlRmA$default, reason: not valid java name */
    public static /* synthetic */ DatePickerColors m2012copytNwlRmA$default(DatePickerColors datePickerColors, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, TextFieldColors textFieldColors, int i2, Object obj) {
        long j26 = j8;
        long j27 = j7;
        long j28 = j2;
        long j29 = j6;
        long j30 = j5;
        long j31 = j4;
        long j32 = j3;
        TextFieldColors textFieldColors2 = textFieldColors;
        long j33 = j25;
        long j34 = j24;
        long j35 = j22;
        long j36 = j20;
        long j37 = j17;
        long j38 = j13;
        long j39 = j15;
        long j40 = j16;
        long j41 = j14;
        long j42 = j11;
        long j43 = j23;
        long j44 = j21;
        long j45 = j19;
        long j46 = j10;
        long j47 = j18;
        long j48 = j12;
        long j49 = j9;
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            j28 = datePickerColors.containerColor;
        }
        if ((i2 & 2) != 0) {
            j32 = datePickerColors.titleContentColor;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            j31 = datePickerColors.headlineContentColor;
        }
        if ((i2 & 8) != 0) {
            j30 = datePickerColors.weekdayContentColor;
        }
        if ((i2 + 16) - (i2 | 16) != 0) {
            j29 = datePickerColors.subheadContentColor;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 32)) != 0) {
            j27 = datePickerColors.navigationContentColor;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 64)) != 0) {
            j26 = datePickerColors.yearContentColor;
        }
        if ((i2 + 128) - (i2 | 128) != 0) {
            j49 = datePickerColors.disabledYearContentColor;
        }
        if ((i2 & 256) != 0) {
            j46 = datePickerColors.currentYearContentColor;
        }
        if ((i2 & 512) != 0) {
            j42 = datePickerColors.selectedYearContentColor;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 1024)) != 0) {
            j48 = datePickerColors.disabledSelectedYearContentColor;
        }
        if ((i2 & 2048) != 0) {
            j38 = datePickerColors.selectedYearContainerColor;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4096)) != 0) {
            j41 = datePickerColors.disabledSelectedYearContainerColor;
        }
        if ((i2 + 8192) - (i2 | 8192) != 0) {
            j39 = datePickerColors.dayContentColor;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 16384)) != 0) {
            j40 = datePickerColors.disabledDayContentColor;
        }
        if ((i2 + 32768) - (i2 | 32768) != 0) {
            j37 = datePickerColors.selectedDayContentColor;
        }
        if ((i2 + 65536) - (i2 | 65536) != 0) {
            j47 = datePickerColors.disabledSelectedDayContentColor;
        }
        if ((i2 & 131072) != 0) {
            j45 = datePickerColors.selectedDayContainerColor;
        }
        if ((i2 + 262144) - (i2 | 262144) != 0) {
            j36 = datePickerColors.disabledSelectedDayContainerColor;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 524288)) != 0) {
            j44 = datePickerColors.todayContentColor;
        }
        if ((i2 + 1048576) - (i2 | 1048576) != 0) {
            j35 = datePickerColors.todayDateBorderColor;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2097152)) != 0) {
            j43 = datePickerColors.dayInSelectionRangeContainerColor;
        }
        if ((i2 & 4194304) != 0) {
            j34 = datePickerColors.dayInSelectionRangeContentColor;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8388608)) != 0) {
            j33 = datePickerColors.dividerColor;
        }
        if ((i2 + 16777216) - (i2 | 16777216) != 0) {
            textFieldColors2 = datePickerColors.dateTextFieldColors;
        }
        return datePickerColors.m2013copytNwlRmA(j28, j32, j31, j30, j29, j27, j26, j49, j46, j42, j48, j38, j41, j39, j40, j37, j47, j45, j36, j44, j35, j43, j34, j33, textFieldColors2);
    }

    /* JADX INFO: renamed from: copy-tNwlRmA, reason: not valid java name */
    public final DatePickerColors m2013copytNwlRmA(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, TextFieldColors textFieldColors) {
        long j26 = j2;
        long j27 = j3;
        long j28 = j4;
        long j29 = j5;
        long j30 = j6;
        long j31 = j7;
        long j32 = j8;
        long j33 = j9;
        long j34 = j10;
        long j35 = j11;
        long j36 = j12;
        long j37 = j13;
        long j38 = j14;
        long j39 = j15;
        long j40 = j16;
        long j41 = j17;
        long j42 = j18;
        long j43 = j19;
        long j44 = j20;
        long j45 = j21;
        long j46 = j22;
        long j47 = j23;
        long j48 = j24;
        long j49 = j25;
        if (j26 == 16) {
            j26 = this.containerColor;
        }
        if (j27 == 16) {
            j27 = this.titleContentColor;
        }
        if (j28 == 16) {
            j28 = this.headlineContentColor;
        }
        if (j29 == 16) {
            j29 = this.weekdayContentColor;
        }
        if (j30 == 16) {
            j30 = this.subheadContentColor;
        }
        if (j31 == 16) {
            j31 = this.navigationContentColor;
        }
        if (j32 == 16) {
            j32 = this.yearContentColor;
        }
        if (j33 == 16) {
            j33 = this.disabledYearContentColor;
        }
        if (j34 == 16) {
            j34 = this.currentYearContentColor;
        }
        if (j35 == 16) {
            j35 = this.selectedYearContentColor;
        }
        if (j36 == 16) {
            j36 = this.disabledSelectedYearContentColor;
        }
        if (j37 == 16) {
            j37 = this.selectedYearContainerColor;
        }
        if (j38 == 16) {
            j38 = this.disabledSelectedYearContainerColor;
        }
        if (j39 == 16) {
            j39 = this.dayContentColor;
        }
        if (j40 == 16) {
            j40 = this.disabledDayContentColor;
        }
        if (j41 == 16) {
            j41 = this.selectedDayContentColor;
        }
        if (j42 == 16) {
            j42 = this.disabledSelectedDayContentColor;
        }
        if (j43 == 16) {
            j43 = this.selectedDayContainerColor;
        }
        if (j44 == 16) {
            j44 = this.disabledSelectedDayContainerColor;
        }
        if (j45 == 16) {
            j45 = this.todayContentColor;
        }
        if (j46 == 16) {
            j46 = this.todayDateBorderColor;
        }
        if (j47 == 16) {
            j47 = this.dayInSelectionRangeContainerColor;
        }
        if (j48 == 16) {
            j48 = this.dayInSelectionRangeContentColor;
        }
        if (j49 == 16) {
            j49 = this.dividerColor;
        }
        return new DatePickerColors(j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j40, j41, j42, j43, j44, j45, j46, j47, j48, j49, takeOrElse$material3_release(textFieldColors, new Function0<TextFieldColors>() { // from class: androidx.compose.material3.DatePickerColors$copy$25
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final TextFieldColors invoke() {
                return this.this$0.getDateTextFieldColors();
            }
        }), null);
    }

    public final TextFieldColors takeOrElse$material3_release(TextFieldColors textFieldColors, Function0<TextFieldColors> function0) {
        return textFieldColors == null ? function0.invoke() : textFieldColors;
    }

    public final State<Color> dayContentColor$material3_release(boolean z2, boolean z3, boolean z4, boolean z5, Composer composer, int i2) {
        long j2;
        State<Color> stateM451animateColorAsStateeuL9pac;
        ComposerKt.sourceInformationMarkerStart(composer, -1233694918, "C(dayContentColor)P(2,3,1):DatePicker.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1233694918, i2, -1, "androidx.compose.material3.DatePickerColors.dayContentColor (DatePicker.kt:901)");
        }
        if (!z3 || !z5) {
            if (z3 && !z5) {
                j2 = this.disabledSelectedDayContentColor;
            } else if (z4 && z5) {
                j2 = this.dayInSelectionRangeContentColor;
            } else if (z4 && !z5) {
                j2 = this.disabledDayContentColor;
            } else if (z2) {
                j2 = this.todayContentColor;
            } else if (z5) {
                j2 = this.dayContentColor;
            } else {
                j2 = this.disabledDayContentColor;
            }
        } else {
            j2 = this.selectedDayContentColor;
        }
        if (z4) {
            composer.startReplaceGroup(-828303257);
            ComposerKt.sourceInformation(composer, "914@44574L28");
            stateM451animateColorAsStateeuL9pac = SnapshotStateKt.rememberUpdatedState(Color.m4168boximpl(j2), composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-828241443);
            ComposerKt.sourceInformation(composer, "917@44710L88");
            stateM451animateColorAsStateeuL9pac = SingleValueAnimationKt.m451animateColorAsStateeuL9pac(j2, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer, 0, 12);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateM451animateColorAsStateeuL9pac;
    }

    public final State<Color> dayContainerColor$material3_release(boolean z2, boolean z3, boolean z4, Composer composer, int i2) {
        long jM4213getTransparent0d7_KjU;
        State<Color> stateRememberUpdatedState;
        ComposerKt.sourceInformationMarkerStart(composer, -1240482658, "C(dayContainerColor)P(2,1):DatePicker.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1240482658, i2, -1, "androidx.compose.material3.DatePickerColors.dayContainerColor (DatePicker.kt:933)");
        }
        if (z2) {
            jM4213getTransparent0d7_KjU = z3 ? this.selectedDayContainerColor : this.disabledSelectedDayContainerColor;
        } else {
            jM4213getTransparent0d7_KjU = Color.Companion.m4213getTransparent0d7_KjU();
        }
        if (z4) {
            composer.startReplaceGroup(-217363149);
            ComposerKt.sourceInformation(composer, "941@45516L88");
            stateRememberUpdatedState = SingleValueAnimationKt.m451animateColorAsStateeuL9pac(jM4213getTransparent0d7_KjU, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer, 0, 12);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-217247953);
            ComposerKt.sourceInformation(composer, "943@45634L28");
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m4168boximpl(jM4213getTransparent0d7_KjU), composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateRememberUpdatedState;
    }

    public final State<Color> yearContentColor$material3_release(boolean z2, boolean z3, boolean z4, Composer composer, int i2) {
        long j2;
        ComposerKt.sourceInformationMarkerStart(composer, 874111097, "C(yearContentColor)P(!1,2)969@46510L122:DatePicker.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(874111097, i2, -1, "androidx.compose.material3.DatePickerColors.yearContentColor (DatePicker.kt:959)");
        }
        if (!z3 || !z4) {
            if (z3 && !z4) {
                j2 = this.disabledSelectedYearContentColor;
            } else if (z2) {
                j2 = this.currentYearContentColor;
            } else if (z4) {
                j2 = this.yearContentColor;
            } else {
                j2 = this.disabledYearContentColor;
            }
        } else {
            j2 = this.selectedYearContentColor;
        }
        State<Color> stateM451animateColorAsStateeuL9pac = SingleValueAnimationKt.m451animateColorAsStateeuL9pac(j2, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer, 0, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateM451animateColorAsStateeuL9pac;
    }

    public final State<Color> yearContainerColor$material3_release(boolean z2, boolean z3, Composer composer, int i2) {
        long jM4213getTransparent0d7_KjU;
        ComposerKt.sourceInformationMarkerStart(composer, -1306331107, "C(yearContainerColor)P(1)989@47197L122:DatePicker.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1306331107, i2, -1, "androidx.compose.material3.DatePickerColors.yearContainerColor (DatePicker.kt:982)");
        }
        if (z2) {
            jM4213getTransparent0d7_KjU = z3 ? this.selectedYearContainerColor : this.disabledSelectedYearContainerColor;
        } else {
            jM4213getTransparent0d7_KjU = Color.Companion.m4213getTransparent0d7_KjU();
        }
        State<Color> stateM451animateColorAsStateeuL9pac = SingleValueAnimationKt.m451animateColorAsStateeuL9pac(jM4213getTransparent0d7_KjU, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer, 0, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateM451animateColorAsStateeuL9pac;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DatePickerColors)) {
            return false;
        }
        DatePickerColors datePickerColors = (DatePickerColors) obj;
        return Color.m4179equalsimpl0(this.containerColor, datePickerColors.containerColor) && Color.m4179equalsimpl0(this.titleContentColor, datePickerColors.titleContentColor) && Color.m4179equalsimpl0(this.headlineContentColor, datePickerColors.headlineContentColor) && Color.m4179equalsimpl0(this.weekdayContentColor, datePickerColors.weekdayContentColor) && Color.m4179equalsimpl0(this.subheadContentColor, datePickerColors.subheadContentColor) && Color.m4179equalsimpl0(this.yearContentColor, datePickerColors.yearContentColor) && Color.m4179equalsimpl0(this.disabledYearContentColor, datePickerColors.disabledYearContentColor) && Color.m4179equalsimpl0(this.currentYearContentColor, datePickerColors.currentYearContentColor) && Color.m4179equalsimpl0(this.selectedYearContentColor, datePickerColors.selectedYearContentColor) && Color.m4179equalsimpl0(this.disabledSelectedYearContentColor, datePickerColors.disabledSelectedYearContentColor) && Color.m4179equalsimpl0(this.selectedYearContainerColor, datePickerColors.selectedYearContainerColor) && Color.m4179equalsimpl0(this.disabledSelectedYearContainerColor, datePickerColors.disabledSelectedYearContainerColor) && Color.m4179equalsimpl0(this.dayContentColor, datePickerColors.dayContentColor) && Color.m4179equalsimpl0(this.disabledDayContentColor, datePickerColors.disabledDayContentColor) && Color.m4179equalsimpl0(this.selectedDayContentColor, datePickerColors.selectedDayContentColor) && Color.m4179equalsimpl0(this.disabledSelectedDayContentColor, datePickerColors.disabledSelectedDayContentColor) && Color.m4179equalsimpl0(this.selectedDayContainerColor, datePickerColors.selectedDayContainerColor) && Color.m4179equalsimpl0(this.disabledSelectedDayContainerColor, datePickerColors.disabledSelectedDayContainerColor) && Color.m4179equalsimpl0(this.todayContentColor, datePickerColors.todayContentColor) && Color.m4179equalsimpl0(this.todayDateBorderColor, datePickerColors.todayDateBorderColor) && Color.m4179equalsimpl0(this.dayInSelectionRangeContainerColor, datePickerColors.dayInSelectionRangeContainerColor) && Color.m4179equalsimpl0(this.dayInSelectionRangeContentColor, datePickerColors.dayInSelectionRangeContentColor);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((Color.m4185hashCodeimpl(this.containerColor) * 31) + Color.m4185hashCodeimpl(this.titleContentColor)) * 31) + Color.m4185hashCodeimpl(this.headlineContentColor)) * 31) + Color.m4185hashCodeimpl(this.weekdayContentColor)) * 31) + Color.m4185hashCodeimpl(this.subheadContentColor)) * 31) + Color.m4185hashCodeimpl(this.yearContentColor)) * 31) + Color.m4185hashCodeimpl(this.disabledYearContentColor)) * 31) + Color.m4185hashCodeimpl(this.currentYearContentColor)) * 31) + Color.m4185hashCodeimpl(this.selectedYearContentColor)) * 31) + Color.m4185hashCodeimpl(this.disabledSelectedYearContentColor)) * 31) + Color.m4185hashCodeimpl(this.selectedYearContainerColor)) * 31) + Color.m4185hashCodeimpl(this.disabledSelectedYearContainerColor)) * 31) + Color.m4185hashCodeimpl(this.dayContentColor)) * 31) + Color.m4185hashCodeimpl(this.disabledDayContentColor)) * 31) + Color.m4185hashCodeimpl(this.selectedDayContentColor)) * 31) + Color.m4185hashCodeimpl(this.disabledSelectedDayContentColor)) * 31) + Color.m4185hashCodeimpl(this.selectedDayContainerColor)) * 31) + Color.m4185hashCodeimpl(this.disabledSelectedDayContainerColor)) * 31) + Color.m4185hashCodeimpl(this.todayContentColor)) * 31) + Color.m4185hashCodeimpl(this.todayDateBorderColor)) * 31) + Color.m4185hashCodeimpl(this.dayInSelectionRangeContainerColor)) * 31) + Color.m4185hashCodeimpl(this.dayInSelectionRangeContentColor);
    }
}
