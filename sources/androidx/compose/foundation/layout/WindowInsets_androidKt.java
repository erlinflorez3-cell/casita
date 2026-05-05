package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.graphics.Insets;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: WindowInsets.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d̉=!,r\bDZc|\u0004G\u000f8\u000bDB\u0007\"2\u0017\u007f\u0007|jA0JgP.hS2\u000fq/<$q$yّCU0}*ޛWNusvϺb\u000bY\u000f\u000eǝ\u0011\u0001:\u0018mx\fa?6P@W3{Am=nGN\u0005N\u0006h\u0600\u0012\u000f\u000fnBH>L#Cy]Xؓ`\rHĥ%M3\u0019:\u0006l 7c3ɩPɇLvm<5$\u0011kZP-b>\u0001m)TY?\r%`F+n7kZ{ٍ\u0005\u07baVeO\u0005EwK\u0007\u0001)-2WwwRf\b,\u0015YN5]!&\u0013J(Ө\u000eˏ/YsMV\u00176y\u0013}\u0013F\u0012\u0012&:V9E\u001a\u0015\u001463#r\n\u0006г\u0006bZ\u0002\u0001nD%E\u001cA:Q\u001b\u0015]\n;GNmA[ڄ ţ\u0005x1]Z\u001en\u00173V}b?_`cVa\"Ykl,p\u0011\u0016Z\b>Y\u0018/*\u0010d[c{2ބ/\u074co\f`Fm\f\u0013v\tUoiVXB\u001b$JB\t:Yld3\u0005\u0001Xf>)MJS=BFWvχ\u0004˶%5 PU\u0003w\u0006e_\u0010:=\u0003W[t\u0003\u001ctYqASic>mzvB?r(ۖ\\jZU\u0012yj6BEV\u000b(w*Pv\fA2u7ʬ80I\u001bb6V\u0011>^O\u001f!_\tt8~\u00033ZH@ˍv֊\u0005Zlru\u000b\u0007KD~fF;OqQ'Km\"\u0017@%#5~*E\u001eэNܤPv&w[\".\u00182;WVK!/\u001b7Z\u001a-sK\u001be\u007fMHlQۨ{ӛ?r>i\u000e\u0014~.xlPwb\u001bB\u0013l\u001d;\b\u0013~\"atz})+\u07b4]ƏM|\u0013[ByF~\u001d!$O\u000fsB\u0019CY['K\u0015 \u0014]\u0015\u0018#@۸0ԃf\u00196vk1:e.qh}k6[KW\b\u0017>P0\u0015\u0003pH!=ڇF\rL\u000f9wOr\u0011iF}#/,r/,;p\r!ǈ\u0017s\u001664\u00118\u0002c\u001a\"\u0011[%?Y{g\u001cm\u0002\"aͯ\u0011ϻ\u000f\u0006Ap\u0018OK\"nYh=>\u0014\u0014+DvSb3H1$b,rMդGX\u0002\b\u00161\u000eT\u007f\"%iZsib6T'\\\r\u000eϖdIx#09\r\u001dS1\u0007nI\u0005\u001cR|/\u001227\u0019\u009b\r\u001f\u0003Q\u0005!39dgGV@X/\u0017m]qI8{\u0086K-\u0006muHF&\u001d9PU39\u007f\u001d\bv^^A\u001b;̷fʝ\u0016pbP(g\r|\u0015\u0010BI\u001d\u00199b\u00010z-zZ 7q\u001a7\\ؐ-\u000b$~i\b);&Q;\u007fajB3$W\u0002;4Mvñ)ؗx+lY\u0014*\u0018_3<\u001c6$p\"\u001c!\u00168\u0004\\V\u001dr8.>{с\u00067\u001a\u0015d y\u0006AS5r\u0005\u0006pW\u0011x8c#)߾Y\u000f\u001bh7\u001f\b|Ml+R?M\\\u001f\u0001Zh\u0011\ne/Ӂ\u0002ȗ\u00190/8\u000e-7\u0012gen<y]{ 9{\u0004*\u0010=XRL}U?Ȅ\b.l*\u001b\td[̧h_"}, d2 = {"/qT\u001bT=BU\u0015\u000e~h5Y\u0005<sp,\nD}\u001e\u0017", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\b2VBE}\u0018'#hpGEA6V\u0002#PPX52", "5dc\u000ee,'O*\u0003|Z;\u0001\u00138B{5\n1\u0005%\u001bDv\u000ezr.>c\r\u001cFq 7[", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u0012*G|_ QL:uF\u0002\u001evaH\u0015\"\nX~2CUR6e(6.", "5dc\u000ee,'O*\u0003|Z;\u0001\u00138B{5\n1\u0005%\u001bDv\u000e", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u0012*G|_ QL:uF\u0002\u001evaH\u0015\"\nX~2CUR6e(Y9\u001d\u0011g\u0018R* NWK,yNE\u001fQ9Y\u000bJl\t\f_k?r{Ld\u0010TOx96", "/qT g(Mc'[vk:m\r=i|/{", "5dc\u000ee,,b\u0015\u000e\u000bl\tx\u0016=V\u00046\u007f=\b\u0017UCx\u0017F\u0006!D]\b)E", "5dc\u000ee,,b\u0015\u000e\u000bl\tx\u0016=V\u00046\u007f=\b\u0017", "/qT l:MS![vk:m\r=i|/{", "5dc\u000ee,,g'\u000ezf\tx\u0016=V\u00046\u007f=\b\u0017UCx\u0017F\u0006!D]\b)E", "5dc\u000ee,,g'\u000ezf\tx\u0016=V\u00046\u007f=\b\u0017", "1`_A\\6G0\u0015\f", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\b2VBE}\u0018'#hpG\\", "5dc\u0010T7MW#\bWZ9", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u0012*G|_ QL:uF\u0002\u001evaH\u0015\"\nX~2CUR6e(Y9\u001d\u0011g\u0018R* NWK,yNE\u001fQ9Y\u000bJl\t\f_k?r{Ld\u0010TOx9(%qEfi}FT\u000f`4l\u0017i+\\\u0004;.$z\u0018\u0017wT8\u0013EZ\r\u0007\\\nv19\u001d\u00047.PQdTE~c\u0012", "1`_A\\6G0\u0015\f^`5\u0007\u00163n\u0002\u0019\u007fN\u0005\u0014\u001bNs\u001dP", "5dc\u0010T7MW#\bWZ9`\u000b8o\r,\u0005Bq\u001b%Kl\u0012Cz4I\u0018y)@w%*\\GEtB", "5dc\u0010T7MW#\bWZ9`\u000b8o\r,\u0005Bq\u001b%Kl\u0012Cz4I", "D`[BX", "1n]@h4>E\u001d\byh>`\u0012=e\u000f6", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011V\f/Di\u0014=+MCv>,\u0015Ye9\u00199", "5dc\u0010b5Lc!~lb5{\u0013AI\t6{O\u000f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\"\u001eC~\u000fF\u0004-~5z.Fz\u0012,\\!Es?(#hR=\u0007u\u0002\u0012k", "Adc\u0010b5Lc!~lb5{\u0013AI\t6{O\u000f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\"\u001eC~\u000fF\u0004-~5z.Fz\u0012,\\!Es?(#hR=\u0007u\u0002C:\u0018", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0013c\u0006+A{\u0016\u001fQCMA", "5dc\u0010b5Lc!~lb5{\u0013AI\t6{O\u000fU\u0013Px\u0018Kr49c\u0007.", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\"\u001eC~\u000fF\u0004-~7\b(Bw$.>G;}\na\u0006", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\"\u001eC~\u000fF\u0004-~7\b(Bw$.>G;}\na\n", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\"\u001eC~\u000fF\u0004-~7\b(Bw$.>G;}\n\u0013XY", "2hb=_(R1)\u000e\u0005n;", "5dc\u0011\\:IZ\u0015\u0013Xn;\u0007\u0019>", "7lT", "5dc\u0016`,", "7lT\u000ea0FO(\u0003\u0005g\u001a\u0007\u0019<c\u007f", "5dc\u0016`,\u001a\\\u001d\u0007vm0\u0007\u0012\u001do\u00105y@?\u0013 Py\u001d8\u0006)?b\f", "5dc\u0016`,\u001a\\\u001d\u0007vm0\u0007\u0012\u001do\u00105y@", "7lT\u000ea0FO(\u0003\u0005g\u001bx\u00161e\u000f", "5dc\u0016`,\u001a\\\u001d\u0007vm0\u0007\u0012\u001ea\r*{O?\u0013 Py\u001d8\u0006)?b\f", "5dc\u0016`,\u001a\\\u001d\u0007vm0\u0007\u0012\u001ea\r*{O", "7r2.c;B]\"[vk\u001d\u0001\u00173b\u0007(", "7r2.c;B]\"[vk\u001d\u0001\u00173b\u0007(:<\n !Vk\u001d@\u0001.C", "7r8:X\u001dBa\u001d{\u0002^", "7r8:X\u001dBa\u001d{\u0002^jx\u00128o\u000f$\u000bD\u000b %", "7rC.c7:P ~Ze,\u0005\t8tp,\nD}\u001e\u0017", "7rC.c7:P ~Ze,\u0005\t8tp,\nD}\u001e\u0017\u0006k\u0017E\u000141h\u0002*@{", ";`]1T;H`-l\u000fl;|\u0011\u0011e\u000e7\fM\u0001%", "5dc\u001aT5=O(\t\br\u001a\u0011\u0017>e\b\n{N\u0010'$G}", "<`e6Z(MW#\bWZ9\u000b", "5dc\u001bT=BU\u0015\u000e~h5Y\u0005<s", "<`e6Z(MW#\bWZ9\u000bl1n\n5\u007fI\u0003\b\u001bUs\u000b@})Dm", "5dc\u001bT=BU\u0015\u000e~h5Y\u0005<sc*\u0005J\u000e\u001b I`\u0012Jz\"9`\u0002/K,\u00127VMJgC\"\u001fqo", "5dc\u001bT=BU\u0015\u000e~h5Y\u0005<sc*\u0005J\u000e\u001b I`\u0012Jz\"9`\u0002/K", "A`U266Gb\u0019\b\n", "5dc T->1#\b\n^5\f", "A`U279:e\u001d\b|", "5dc T->2&z\rb5~", "A`U2:,Lb)\fzl", "5dc T->5\u0019\r\nn9|\u0017", "AsPAh:\u001bO&\r", "5dc g(Mc'[vk:", "AsPAh:\u001bO&\r^`5\u0007\u00163n\u0002\u0019\u007fN\u0005\u0014\u001bNs\u001dP", "5dc g(Mc'[vk:`\u000b8o\r,\u0005Bq\u001b%Kl\u0012Cz4I\u0018y)@w%*\\GEtB", "5dc g(Mc'[vk:`\u000b8o\r,\u0005Bq\u001b%Kl\u0012Cz4I", "AxbAX4\u001bO&\r", "5dc l:MS![vk:", "AxbAX4\u001bO&\r^`5\u0007\u00163n\u0002\u0019\u007fN\u0005\u0014\u001bNs\u001dP", "5dc l:MS![vk:`\u000b8o\r,\u0005Bq\u001b%Kl\u0012Cz4I\u0018y)@w%*\\GEtB", "5dc l:MS![vk:`\u000b8o\r,\u0005Bq\u001b%Kl\u0012Cz4I", "AxbAX4 S'\u000e\u000bk,\u000b", "5dc l:MS!`zl;\r\u0016/s", "B`_=T)ESx\u0006zf,\u0006\u0018", "5dc!T7IO\u0016\u0006z>3|\u0011/n\u000f", "B`_=T)ESx\u0006zf,\u0006\u0018\u0013g\t2\tD\n\u0019\bK}\u00129z,9h\u0012", "5dc!T7IO\u0016\u0006z>3|\u0011/n\u000f\f}I\u000b$\u001bPq~@\u0005)2]\u0005$F\u0002T*VLEz0-\u0019rjG", "5dc!T7IO\u0016\u0006z>3|\u0011/n\u000f\f}I\u000b$\u001bPq~@\u0005)2]\u0005$F\u0002", "E`c2e-:Z ", "5dc$T;>`\u001az\u0002e", "$`[BX\u0010Ga\u0019\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u0007*TS;O=,\u0015wo\u000f", "7mb2g:", "\u001a`]1e6BR,Hxh9|R1r{3~D~%`+x\u001c<\u00063\u000b", "<`\\2", "", "Bn8;f,Ma\nz\u0002n,\u000b", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7y7[CJy%\u001a\u001cxaG\\", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class WindowInsets_androidKt {
    public static /* synthetic */ void getAreNavigationBarsVisible$annotations(WindowInsets.Companion companion) {
    }

    public static /* synthetic */ void getAreStatusBarsVisible$annotations(WindowInsets.Companion companion) {
    }

    public static /* synthetic */ void getAreSystemBarsVisible$annotations(WindowInsets.Companion companion) {
    }

    public static /* synthetic */ void getCaptionBarIgnoringVisibility$annotations(WindowInsets.Companion companion) {
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0013R\u00016\u0005yTlkLg[R(@`]O\u001d\n\u0014u\u001ca\nKdsS\fqiwZwWZa_BT\"BQzd_~6k")
    @InterfaceC1492Gx
    public static /* synthetic */ void getConsumeWindowInsets$annotations(ComposeView composeView) {
    }

    public static /* synthetic */ void getImeAnimationSource$annotations(WindowInsets.Companion companion) {
    }

    public static /* synthetic */ void getImeAnimationTarget$annotations(WindowInsets.Companion companion) {
    }

    public static /* synthetic */ void getNavigationBarsIgnoringVisibility$annotations(WindowInsets.Companion companion) {
    }

    public static /* synthetic */ void getStatusBarsIgnoringVisibility$annotations(WindowInsets.Companion companion) {
    }

    public static /* synthetic */ void getSystemBarsIgnoringVisibility$annotations(WindowInsets.Companion companion) {
    }

    public static /* synthetic */ void getTappableElementIgnoringVisibility$annotations(WindowInsets.Companion companion) {
    }

    public static /* synthetic */ void isCaptionBarVisible$annotations(WindowInsets.Companion companion) {
    }

    public static /* synthetic */ void isImeVisible$annotations(WindowInsets.Companion companion) {
    }

    public static /* synthetic */ void isTappableElementVisible$annotations(WindowInsets.Companion companion) {
    }

    public static final InsetsValues toInsetsValues(Insets insets) {
        return new InsetsValues(insets.left, insets.top, insets.right, insets.bottom);
    }

    public static final ValueInsets ValueInsets(Insets insets, String str) {
        return new ValueInsets(toInsetsValues(insets), str);
    }

    public static final boolean getConsumeWindowInsets(AbstractComposeView abstractComposeView) {
        Object tag = abstractComposeView.getTag(androidx.compose.ui.R.id.consume_window_insets_tag);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public static final void setConsumeWindowInsets(AbstractComposeView abstractComposeView, boolean z2) {
        abstractComposeView.setTag(androidx.compose.ui.R.id.consume_window_insets_tag, Boolean.valueOf(z2));
    }

    public static final /* synthetic */ boolean getConsumeWindowInsets(ComposeView composeView) {
        Object tag = composeView.getTag(androidx.compose.ui.R.id.consume_window_insets_tag);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public static final WindowInsets getCaptionBar(WindowInsets.Companion companion, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1832025528, "C142@4955L9:WindowInsets.android.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1832025528, i2, -1, "androidx.compose.foundation.layout.<get-captionBar> (WindowInsets.android.kt:142)");
        }
        AndroidWindowInsets captionBar = WindowInsetsHolder.Companion.current(composer, 6).getCaptionBar();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return captionBar;
    }

    public static final WindowInsets getDisplayCutout(WindowInsets.Companion companion, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1324817724, "C151@5303L9:WindowInsets.android.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1324817724, i2, -1, "androidx.compose.foundation.layout.<get-displayCutout> (WindowInsets.android.kt:151)");
        }
        AndroidWindowInsets displayCutout = WindowInsetsHolder.Companion.current(composer, 6).getDisplayCutout();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return displayCutout;
    }

    public static final WindowInsets getIme(WindowInsets.Companion companion, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1466917860, "C165@5937L9:WindowInsets.android.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1466917860, i2, -1, "androidx.compose.foundation.layout.<get-ime> (WindowInsets.android.kt:165)");
        }
        AndroidWindowInsets ime = WindowInsetsHolder.Companion.current(composer, 6).getIme();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return ime;
    }

    public static final WindowInsets getMandatorySystemGestures(WindowInsets.Companion companion, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1369492988, "C174@6271L9:WindowInsets.android.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1369492988, i2, -1, "androidx.compose.foundation.layout.<get-mandatorySystemGestures> (WindowInsets.android.kt:174)");
        }
        AndroidWindowInsets mandatorySystemGestures = WindowInsetsHolder.Companion.current(composer, 6).getMandatorySystemGestures();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return mandatorySystemGestures;
    }

    public static final WindowInsets getNavigationBars(WindowInsets.Companion companion, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1596175702, "C184@6630L9:WindowInsets.android.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1596175702, i2, -1, "androidx.compose.foundation.layout.<get-navigationBars> (WindowInsets.android.kt:184)");
        }
        AndroidWindowInsets navigationBars = WindowInsetsHolder.Companion.current(composer, 6).getNavigationBars();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return navigationBars;
    }

    public static final WindowInsets getStatusBars(WindowInsets.Companion companion, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -675090670, "C192@6849L9:WindowInsets.android.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-675090670, i2, -1, "androidx.compose.foundation.layout.<get-statusBars> (WindowInsets.android.kt:192)");
        }
        AndroidWindowInsets statusBars = WindowInsetsHolder.Companion.current(composer, 6).getStatusBars();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return statusBars;
    }

    public static final WindowInsets getSystemBars(WindowInsets.Companion companion, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -282936756, "C200@7064L9:WindowInsets.android.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-282936756, i2, -1, "androidx.compose.foundation.layout.<get-systemBars> (WindowInsets.android.kt:200)");
        }
        AndroidWindowInsets systemBars = WindowInsetsHolder.Companion.current(composer, 6).getSystemBars();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return systemBars;
    }

    public static final WindowInsets getSystemGestures(WindowInsets.Companion companion, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 989216224, "C208@7287L9:WindowInsets.android.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(989216224, i2, -1, "androidx.compose.foundation.layout.<get-systemGestures> (WindowInsets.android.kt:208)");
        }
        AndroidWindowInsets systemGestures = WindowInsetsHolder.Companion.current(composer, 6).getSystemGestures();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return systemGestures;
    }

    public static final WindowInsets getTappableElement(WindowInsets.Companion companion, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1994205284, "C216@7516L9:WindowInsets.android.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1994205284, i2, -1, "androidx.compose.foundation.layout.<get-tappableElement> (WindowInsets.android.kt:216)");
        }
        AndroidWindowInsets tappableElement = WindowInsetsHolder.Companion.current(composer, 6).getTappableElement();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return tappableElement;
    }

    public static final WindowInsets getWaterfall(WindowInsets.Companion companion, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1943241020, "C224@7745L9:WindowInsets.android.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1943241020, i2, -1, "androidx.compose.foundation.layout.<get-waterfall> (WindowInsets.android.kt:224)");
        }
        ValueInsets waterfall = WindowInsetsHolder.Companion.current(composer, 6).getWaterfall();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return waterfall;
    }

    public static final WindowInsets getSafeDrawing(WindowInsets.Companion companion, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -49441252, "C234@8107L9:WindowInsets.android.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-49441252, i2, -1, "androidx.compose.foundation.layout.<get-safeDrawing> (WindowInsets.android.kt:234)");
        }
        WindowInsets safeDrawing = WindowInsetsHolder.Companion.current(composer, 6).getSafeDrawing();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return safeDrawing;
    }

    public static final WindowInsets getSafeGestures(WindowInsets.Companion companion, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1594247780, "C245@8541L9:WindowInsets.android.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1594247780, i2, -1, "androidx.compose.foundation.layout.<get-safeGestures> (WindowInsets.android.kt:245)");
        }
        WindowInsets safeGestures = WindowInsetsHolder.Companion.current(composer, 6).getSafeGestures();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return safeGestures;
    }

    public static final WindowInsets getSafeContent(WindowInsets.Companion companion, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -2026663876, "C254@8858L9:WindowInsets.android.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2026663876, i2, -1, "androidx.compose.foundation.layout.<get-safeContent> (WindowInsets.android.kt:254)");
        }
        WindowInsets safeContent = WindowInsetsHolder.Companion.current(composer, 6).getSafeContent();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return safeContent;
    }

    public static final WindowInsets getCaptionBarIgnoringVisibility(WindowInsets.Companion companion, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1731251574, "C266@9266L9:WindowInsets.android.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1731251574, i2, -1, "androidx.compose.foundation.layout.<get-captionBarIgnoringVisibility> (WindowInsets.android.kt:266)");
        }
        ValueInsets captionBarIgnoringVisibility = WindowInsetsHolder.Companion.current(composer, 6).getCaptionBarIgnoringVisibility();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return captionBarIgnoringVisibility;
    }

    public static final WindowInsets getNavigationBarsIgnoringVisibility(WindowInsets.Companion companion, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1990981160, "C280@9832L9:WindowInsets.android.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1990981160, i2, -1, "androidx.compose.foundation.layout.<get-navigationBarsIgnoringVisibility> (WindowInsets.android.kt:280)");
        }
        ValueInsets navigationBarsIgnoringVisibility = WindowInsetsHolder.Companion.current(composer, 6).getNavigationBarsIgnoringVisibility();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return navigationBarsIgnoringVisibility;
    }

    public static final WindowInsets getStatusBarsIgnoringVisibility(WindowInsets.Companion companion, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 594020756, "C292@10273L9:WindowInsets.android.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(594020756, i2, -1, "androidx.compose.foundation.layout.<get-statusBarsIgnoringVisibility> (WindowInsets.android.kt:292)");
        }
        ValueInsets statusBarsIgnoringVisibility = WindowInsetsHolder.Companion.current(composer, 6).getStatusBarsIgnoringVisibility();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return statusBarsIgnoringVisibility;
    }

    public static final WindowInsets getSystemBarsIgnoringVisibility(WindowInsets.Companion companion, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1564566798, "C305@10710L9:WindowInsets.android.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1564566798, i2, -1, "androidx.compose.foundation.layout.<get-systemBarsIgnoringVisibility> (WindowInsets.android.kt:305)");
        }
        ValueInsets systemBarsIgnoringVisibility = WindowInsetsHolder.Companion.current(composer, 6).getSystemBarsIgnoringVisibility();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return systemBarsIgnoringVisibility;
    }

    public static final WindowInsets getTappableElementIgnoringVisibility(WindowInsets.Companion companion, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1488788292, "C318@11155L9:WindowInsets.android.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1488788292, i2, -1, "androidx.compose.foundation.layout.<get-tappableElementIgnoringVisibility> (WindowInsets.android.kt:318)");
        }
        ValueInsets tappableElementIgnoringVisibility = WindowInsetsHolder.Companion.current(composer, 6).getTappableElementIgnoringVisibility();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return tappableElementIgnoringVisibility;
    }

    public static final boolean isCaptionBarVisible(WindowInsets.Companion companion, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -501076620, "C330@11561L9:WindowInsets.android.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-501076620, i2, -1, "androidx.compose.foundation.layout.<get-isCaptionBarVisible> (WindowInsets.android.kt:330)");
        }
        boolean zIsVisible = WindowInsetsHolder.Companion.current(composer, 6).getCaptionBar().isVisible();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return zIsVisible;
    }

    public static final boolean isImeVisible(WindowInsets.Companion companion, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1873571424, "C342@11942L9:WindowInsets.android.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1873571424, i2, -1, "androidx.compose.foundation.layout.<get-isImeVisible> (WindowInsets.android.kt:342)");
        }
        boolean zIsVisible = WindowInsetsHolder.Companion.current(composer, 6).getIme().isVisible();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return zIsVisible;
    }

    public static final boolean getAreStatusBarsVisible(WindowInsets.Companion companion, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1613283456, "C354@12319L9:WindowInsets.android.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1613283456, i2, -1, "androidx.compose.foundation.layout.<get-areStatusBarsVisible> (WindowInsets.android.kt:354)");
        }
        boolean zIsVisible = WindowInsetsHolder.Companion.current(composer, 6).getStatusBars().isVisible();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return zIsVisible;
    }

    public static final boolean getAreNavigationBarsVisible(WindowInsets.Companion companion, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 710310464, "C366@12711L9:WindowInsets.android.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(710310464, i2, -1, "androidx.compose.foundation.layout.<get-areNavigationBarsVisible> (WindowInsets.android.kt:366)");
        }
        boolean zIsVisible = WindowInsetsHolder.Companion.current(composer, 6).getNavigationBars().isVisible();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return zIsVisible;
    }

    public static final boolean getAreSystemBarsVisible(WindowInsets.Companion companion, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1985490720, "C378@13099L9:WindowInsets.android.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1985490720, i2, -1, "androidx.compose.foundation.layout.<get-areSystemBarsVisible> (WindowInsets.android.kt:378)");
        }
        boolean zIsVisible = WindowInsetsHolder.Companion.current(composer, 6).getSystemBars().isVisible();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return zIsVisible;
    }

    public static final boolean isTappableElementVisible(WindowInsets.Companion companion, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1737201120, "C389@13490L9:WindowInsets.android.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1737201120, i2, -1, "androidx.compose.foundation.layout.<get-isTappableElementVisible> (WindowInsets.android.kt:389)");
        }
        boolean zIsVisible = WindowInsetsHolder.Companion.current(composer, 6).getTappableElement().isVisible();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return zIsVisible;
    }

    public static final WindowInsets getImeAnimationSource(WindowInsets.Companion companion, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1126064918, "C404@14002L9:WindowInsets.android.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1126064918, i2, -1, "androidx.compose.foundation.layout.<get-imeAnimationSource> (WindowInsets.android.kt:404)");
        }
        ValueInsets imeAnimationSource = WindowInsetsHolder.Companion.current(composer, 6).getImeAnimationSource();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return imeAnimationSource;
    }

    public static final WindowInsets getImeAnimationTarget(WindowInsets.Companion companion, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -466319786, "C419@14543L9:WindowInsets.android.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-466319786, i2, -1, "androidx.compose.foundation.layout.<get-imeAnimationTarget> (WindowInsets.android.kt:419)");
        }
        ValueInsets imeAnimationTarget = WindowInsetsHolder.Companion.current(composer, 6).getImeAnimationTarget();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return imeAnimationTarget;
    }
}
