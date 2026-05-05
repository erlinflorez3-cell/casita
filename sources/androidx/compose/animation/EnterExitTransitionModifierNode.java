package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: EnterExitTransition.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яč\u0014D57\u001eq\u007fZDkŞ\fA\u001c0\u0013.X~*ܥ\u001aw\u001dfr9FDmHDR[ճ\u0017k\u00124,[*qK;k\u001a\u0006̝\u0011OdgoñRZ!C\u0017\u0006$\u0002rߚQU\u000f]\u001a\u000f8Bw?IMw=?t|6\u001b :\">\u0005\r\u00010*P\u0010\rzKK\"\u00128@\u0007:Z\rS\u000e\"\u0012\u0014>(\u0001$doNLHt]P/+ɅqBd'g0\u0003O\u0013Fj܋=v\u0010\u001dkÂ6E\u001f3S\u001b\rb]O\u0003msk\u0006xC5.a\fg8h\u007fB\u001a;Q\u001d]!,r\u0004\u007fd\\-;QsK~\u0010Vx\u000b\u0018\u001bC\u001c&\u0016)X.[\"v\n\u001e3#xi?~\u0006/H\u0010|q6E'.4;U)oiyK\u001b^7*\r\u001d 3\u0001\u001d'qS<de!dya1\u007fBkI^\u000egG\u0006\u0004\u001fm\u0012.\u0012<_\u007f]\t!8%3OaI%1k0Xrv\u0007\tnyki\u0001Zغ&n$Jr\u000f\u001a#\\d35\u0017h!J\u001f\u00184T5\u00038\u0017.(\u0010<O'@R]5\u0002j{bݼ$ÄϬ;[t9\u001c&\u0002|A\u0005ic>i\u0003z\"\u000bTb3Z\u0017FaXr\\V'ŮGКݻ{}J\u001f\u001aaz]\u007fmL,_!\r\u0019VN6Bo~9ch5(~\u00038˭\u0002ǭ˨x\u000b\u0007#j?8\f\u0007\u001dD|\u000fvUA\u007f\u000bI*cx\u00014+z7\u0003\u0002X_gzs\u0013\u0001خtɝދ$\u0018 \u0013_\n\u000e$\u001d\u0013A4\u0018,sa)*˛Q\u0016?|\u0003\u0010\u001dR9Hu \u0003rB_\u0019_&ܾ#Ȕzjzּ f\u0006\u0013o]\u001bIin\u0019v\u000fa\u0001\rq<|CSą+Ǫ)\rwܲ\u001573_5:6y\u001aM#\u0001.\u0002}:\u0012b=3KЈ\u0010Нg\"w̥i_8[Fjy\u0001DD2\u0010SZV{\u0010\bp\u001b\u000bن?ȈEpxމPO\u0011S\f\f'.\u0013\u0017d\u0003\u000b1}\fL4o,\u0004C,$\rR{ݕYϬkyuжt\rP\u001d\u00183\u001c3t;*gpze\u0010!04 H:Ofz\u0005j5bt\u0003ч\u0014ֺBҍʤ\u0005\u000fĢ\u0004Ng\u000f%bbuA\u0005\u001c\u0004Ihdy\u001d`spwƤ\r϶\u00133&֭\u0006E\u0013 ^T]h\tܯ_ñ\bƅ̻N}ݝ)-LTGKx\t\u000f\u0012]uSK\u001262O9o{o:>.{KFh!IS!_%2\r\f,̫ZЩz\u001enŚf$/2\t1.>\u0010D\u0019O #}eEd^yGCH\u0006'F9\u0007:\u0003yEI1V;=?YjB)*X*ȓ\nл$,/״\r#b\u000f\u001c\u001b*_!r$(f\u000f\u0010B+m0\f>P\u0005t\u001a.68}=C\n#dim\b!n,Y)4|Ƒlx\u0010!ؼgt]̃\u001bh7\u0015\b.}\u0001+\u0012?e>\u0015hZh\u0019c\"h\u0011.\u001a+%M:Xh9\u0012_c\u0017r\u001aP2Å7Խo6iɵHT$>-.\u0016\u00060\u00166K\f\u0003[\u0001|&ltR]\u001e`z(\u0013v:d$\u0005\u000fNn\u0013#4tzL!]qق#[\u0013\u0005ֿ\u000b\nMÒ>#7\u0016MZ\bP\u0019o@|!\u0005Jb#\u0002XC_ۉ\f\u05ff09N§U\u001c-\u001e23\u0005\u0005,\u0012S\u007f܅\b5\u0019\u0011\u0017˱vf\u001fF\\ ;ՆU\u000f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006V.DY\u000b\u007fJq%\u001dZ?Dy8-\u0019rj!\u0011b0Oz'T5X+\\(", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006]!Ic\u000e/\u001fw\u00152NG;x\u001d(\u0014hS=\u0016f\u0017J\u000556O[6lTu!\u001d!g\u0012W9\u0011\u0003g\u0017", "BqP;f0MW#\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fDi\u001f<QR?u=s", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006V.DY\u000b\u007fJq%\u001c\\?Jk\n", "Ahi245B[\u0015\u000e~h5", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fDi\u001f<QR?u=\\shb9\u0014p,MR0KTJ;`\\{\u0013", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkFSB\u0002", "=eU@X;\u001a\\\u001d\u0007vm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "AkX1X\bGW!z\nb6\u0006", "3mc2e", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006V.DY\u000b\u000fDi\u001f<QR?u=s", "3wXA", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006V89hl-3v$2\\GEt\n", "7r4;T)ES\u0018", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "5qP=[0<a\u007fz\u000f^9Y\u00109c\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006X21d\u0001$5{|*aCHH;(\u0013nBC\u0014C5]v4'_R;2", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i&z\u00127[GJo>'jO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\u000ec\u0012V'\u001c\tcJmlND\u001fQ\u001bV}Dv\u0005\u001b\u001a\u0018>)OBW\u0010T\u0007\u0015t\u001d2lNUn}QJ\u001bI&m\u000bl'`9Mm\u0012{!&r^.Sw\\\u0015zN\tkqPbxB1>7JSAxc@\u0004+)T:V\u00123X\u00028t,_=.>`\u0014Oq!\u0014Et\u001e+iK+%I\u0006\u0011ISn\u007fz>Wd(e\u0010\nq9;\"/cmU\u000fPL$W>oc\u0010;\\\u000f|(o\u0016'S\fBZU\u001e\r\u000f |iSLp;|#oQ,c\u0010\u0016Ld\"$9 KYXd3c?I\"\rrAU[bR\u0015}7\u001diT\u0001_fs.?NwE*2XFzQV9\u000e <\f\u0015\r\u001d=eK}>\u000f4)Gb\u0002Bs3\u001aV`\u001e\"u<+#7:W9Fxm~+\u001eG\u0013y\u0005^^NA\u007fBESs0\u0006D[\u000e:iV\u001a5\u0018j\u0016\\}\u0015Oew4]8\f\n\f6\u0003!\u001cu\"~K'c*3p\u0015Uk|\u0019:\u001e\u0005V\\|I'nU%!\bY5e\u001a/&q$L\u000e\tV>]\u001e:\u0010", "/kX4a4>\\(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4\u000b", "5dc\u000e_0@\\!~\u0004m", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`rNs\u0010E~%>hS", "1ta?X5M/ \u0003|g4|\u0012>", "5dc\u0010h9KS\"\u000eVe0~\u00127e\t7", "Adc\u0010h9KS\"\u000eVe0~\u00127e\t7", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJr\u001eKq\u0017Dv.D/A\u0011", "5dc\u0012a;>`", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn\u0015b\r D\\#*VQ?z8(\u001e>", "Adc\u0012a;>`", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@\u0005>h}-&z\u00127[GJo>'j,R", "5dc\u0012k0M", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn\u0015l\u0002/&z\u00127[GJo>'j", "Adc\u0012k0M", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@\u0005H]\r\u000fDi\u001f<QR?u=sXY", "5dc\u0014e(IV\u001d|\tE(\u0011\t<B\u00072yF", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn\u0017fy+:q\u0014<4?OkAz\u001cr_?gm9.\u007f6GY.?`aH", "Adc\u0014e(IV\u001d|\tE(\u0011\t<B\u00072yF", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@\u0007BU\t#;k$\u0015IW;x\u0011%\u001ffg\u001a\u0011p\fW\u0006'T,a0k(6.", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu", "Adc\u0012a(;Z\u0019}", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$Sc(", "D`[BX", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ":n^8T/>O\u0018\\\u0005g:\f\u0016+i\t7\n", "Adc\u0019b6DO\u001c~v]\n\u0007\u0012=t\r$\u007fI\u0010%^$\\|I\u000b/\u007f", "uI\u0018#", "\u0018", ":n^8T/>O\u0018\\\u0005g:\f\u0016+i\t7\n\u001c\u0012\u0013\u001bNk\u000bCv", ":n^8T/>O\u0018l~s,", "5dc\u001cY-LS(Z\u0004b4x\u00183o\t", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001\\#*VQ?z8(\u001e'@9\bc9[v&#UR4XavG\u001dg", "Adc\u001cY-LS(Z\u0004b4x\u00183o\t", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i&z\u00127[GJo>'SGa:\u0007p9Nu\u0003PPV(kV|FiUK", "5dc \\A>/\"\u0003\u0003Z;\u0001\u00138", "Adc \\A>/\"\u0003\u0003Z;\u0001\u00138", "Ahi2G9:\\'\u0003\nb6\u0006v:e}", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fDi\u001f<QR?u=\\\u0003hcA\u0007l;$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u0001;v\u001a=M\u001fDo<\u001a$lkBtn,LL", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "5dc \\A>B&z\u0004l0\f\r9nm3{>", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "5dc _0=St\b~f(\f\r9n", "Adc _0=St\b~f(\f\r9n", "AkX1X\u001aIS\u0017", "5dc _0=S\u0007\nz\\", "5dc!e(Ga\u001d\u000e~h5", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001\\#*VQ?z8(\u001e>", "Adc!e(Ga\u001d\u000e~h5", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i&z\u00127[GJo>'j,R", "=m0Ag(<V", "", "Ahi25@,b\u0015\u000ez", "B`a4X;,b\u0015\u000ez", "4t[9F0SS", "Ahi25@,b\u0015\u000ez&\u001c\u0012\u0007)V\u0014\u0018", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@\u0005>h}-\u0017\u0001\u001a=;R7z4sy,F", "AkX1X\u001b:`\u001b~\nO(\u0004\u0019/B\u0014\u0016\u000b<\u0010\u0017", "AkX1X\u001b:`\u001b~\nO(\u0004\u0019/B\u0014\u0016\u000b<\u0010\u0017^QP}>\n/\u007f", "B`a4X;(T\u001a\rzm\t\u0011v>a\u000f(", "B`a4X;(T\u001a\rzm\t\u0011v>a\u000f(CJa\u0007\u0019ZyX", ";dP@h9>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7[\u00148XC\u0011", ";dP@h9:P ~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-3j\u001d.#", "1n]@g9:W\"\u000e\t", ";dP@h9>\u001bf\nGl~G\u0017", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\r5U\f0Dm\u0004,WN;A\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001c\u0003A]\u0019V\"X;\u001cNAA |TD\u001b\u00053IW ,g\b\u001f\rBttAiYE\u0004\u001d\u0001K7h\u0010icCN=Yl:sUG\u001dXHJ1\u0014^\u0019)xW=_", "/mX:T;B]\"x\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class EnterExitTransitionModifierNode extends LayoutModifierNodeWithPassThroughIntrinsics {
    private Alignment currentAlignment;
    private EnterTransition enter;
    private ExitTransition exit;
    private GraphicsLayerBlockForEnterExit graphicsLayerBlock;
    private Function0<Boolean> isEnabled;
    private boolean lookaheadConstraintsAvailable;
    private Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> offsetAnimation;
    private Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation;
    private Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> slideAnimation;
    private Transition<EnterExitState> transition;
    private long lookaheadSize = AnimationModifierKt.getInvalidSize();
    private long lookaheadConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
    private final Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntSize>> sizeTransitionSpec = new Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntSize>>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$sizeTransitionSpec$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final FiniteAnimationSpec<IntSize> invoke(Transition.Segment<EnterExitState> segment) {
            SpringSpec animationSpec = null;
            if (segment.isTransitioningTo(EnterExitState.PreEnter, EnterExitState.Visible)) {
                ChangeSize changeSize = this.this$0.getEnter().getData$animation_release().getChangeSize();
                if (changeSize != null) {
                    animationSpec = changeSize.getAnimationSpec();
                }
            } else if (!segment.isTransitioningTo(EnterExitState.Visible, EnterExitState.PostExit)) {
                animationSpec = EnterExitTransitionKt.DefaultSizeAnimationSpec;
            } else {
                ChangeSize changeSize2 = this.this$0.getExit().getData$animation_release().getChangeSize();
                if (changeSize2 != null) {
                    animationSpec = changeSize2.getAnimationSpec();
                }
            }
            return animationSpec == null ? EnterExitTransitionKt.DefaultSizeAnimationSpec : animationSpec;
        }
    };
    private final Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>> slideSpec = new Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$slideSpec$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final FiniteAnimationSpec<IntOffset> invoke(Transition.Segment<EnterExitState> segment) {
            FiniteAnimationSpec<IntOffset> animationSpec;
            FiniteAnimationSpec<IntOffset> animationSpec2;
            if (segment.isTransitioningTo(EnterExitState.PreEnter, EnterExitState.Visible)) {
                Slide slide = this.this$0.getEnter().getData$animation_release().getSlide();
                if (slide == null || (animationSpec2 = slide.getAnimationSpec()) == null) {
                    return EnterExitTransitionKt.DefaultOffsetAnimationSpec;
                }
                return animationSpec2;
            }
            if (!segment.isTransitioningTo(EnterExitState.Visible, EnterExitState.PostExit)) {
                return EnterExitTransitionKt.DefaultOffsetAnimationSpec;
            }
            Slide slide2 = this.this$0.getExit().getData$animation_release().getSlide();
            if (slide2 == null || (animationSpec = slide2.getAnimationSpec()) == null) {
                return EnterExitTransitionKt.DefaultOffsetAnimationSpec;
            }
            return animationSpec;
        }
    };

    /* JADX INFO: compiled from: EnterExitTransition.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnterExitState.values().length];
            try {
                iArr[EnterExitState.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnterExitState.PreEnter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnterExitState.PostExit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final Transition<EnterExitState> getTransition() {
        return this.transition;
    }

    public final void setTransition(Transition<EnterExitState> transition) {
        this.transition = transition;
    }

    public final Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> getSizeAnimation() {
        return this.sizeAnimation;
    }

    public final void setSizeAnimation(Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation) {
        this.sizeAnimation = deferredAnimation;
    }

    public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> getOffsetAnimation() {
        return this.offsetAnimation;
    }

    public final void setOffsetAnimation(Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation) {
        this.offsetAnimation = deferredAnimation;
    }

    public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> getSlideAnimation() {
        return this.slideAnimation;
    }

    public final void setSlideAnimation(Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation) {
        this.slideAnimation = deferredAnimation;
    }

    public final EnterTransition getEnter() {
        return this.enter;
    }

    public final void setEnter(EnterTransition enterTransition) {
        this.enter = enterTransition;
    }

    public final ExitTransition getExit() {
        return this.exit;
    }

    public final void setExit(ExitTransition exitTransition) {
        this.exit = exitTransition;
    }

    public final Function0<Boolean> isEnabled() {
        return this.isEnabled;
    }

    public final void setEnabled(Function0<Boolean> function0) {
        this.isEnabled = function0;
    }

    public final GraphicsLayerBlockForEnterExit getGraphicsLayerBlock() {
        return this.graphicsLayerBlock;
    }

    public final void setGraphicsLayerBlock(GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit) {
        this.graphicsLayerBlock = graphicsLayerBlockForEnterExit;
    }

    public EnterExitTransitionModifierNode(Transition<EnterExitState> transition, Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation, Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation2, Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation3, EnterTransition enterTransition, ExitTransition exitTransition, Function0<Boolean> function0, GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit) {
        this.transition = transition;
        this.sizeAnimation = deferredAnimation;
        this.offsetAnimation = deferredAnimation2;
        this.slideAnimation = deferredAnimation3;
        this.enter = enterTransition;
        this.exit = exitTransition;
        this.isEnabled = function0;
        this.graphicsLayerBlock = graphicsLayerBlockForEnterExit;
    }

    /* JADX INFO: renamed from: setLookaheadConstraints-BRTryo0, reason: not valid java name */
    private final void m427setLookaheadConstraintsBRTryo0(long j2) {
        this.lookaheadConstraintsAvailable = true;
        this.lookaheadConstraints = j2;
    }

    public final Alignment getCurrentAlignment() {
        return this.currentAlignment;
    }

    public final void setCurrentAlignment(Alignment alignment) {
        this.currentAlignment = alignment;
    }

    public final Alignment getAlignment() {
        Alignment alignment;
        if (this.transition.getSegment().isTransitioningTo(EnterExitState.PreEnter, EnterExitState.Visible)) {
            ChangeSize changeSize = this.enter.getData$animation_release().getChangeSize();
            if (changeSize == null || (alignment = changeSize.getAlignment()) == null) {
                ChangeSize changeSize2 = this.exit.getData$animation_release().getChangeSize();
                if (changeSize2 != null) {
                    return changeSize2.getAlignment();
                }
                return null;
            }
        } else {
            ChangeSize changeSize3 = this.exit.getData$animation_release().getChangeSize();
            if (changeSize3 == null || (alignment = changeSize3.getAlignment()) == null) {
                ChangeSize changeSize4 = this.enter.getData$animation_release().getChangeSize();
                if (changeSize4 != null) {
                    return changeSize4.getAlignment();
                }
                return null;
            }
        }
        return alignment;
    }

    public final Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntSize>> getSizeTransitionSpec() {
        return this.sizeTransitionSpec;
    }

    /* JADX INFO: renamed from: sizeByState-Uzc_VyU, reason: not valid java name */
    public final long m429sizeByStateUzc_VyU(EnterExitState enterExitState, long j2) {
        Function1<IntSize, IntSize> size;
        Function1<IntSize, IntSize> size2;
        int i2 = WhenMappings.$EnumSwitchMapping$0[enterExitState.ordinal()];
        if (i2 == 1) {
            return j2;
        }
        if (i2 == 2) {
            ChangeSize changeSize = this.enter.getData$animation_release().getChangeSize();
            return (changeSize == null || (size = changeSize.getSize()) == null) ? j2 : size.invoke(IntSize.m6800boximpl(j2)).m6812unboximpl();
        }
        if (i2 == 3) {
            ChangeSize changeSize2 = this.exit.getData$animation_release().getChangeSize();
            return (changeSize2 == null || (size2 = changeSize2.getSize()) == null) ? j2 : size2.invoke(IntSize.m6800boximpl(j2)).m6812unboximpl();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        super.onAttach();
        this.lookaheadConstraintsAvailable = false;
        this.lookaheadSize = AnimationModifierKt.getInvalidSize();
    }

    /* JADX INFO: renamed from: targetOffsetByState-oFUgxo0, reason: not valid java name */
    public final long m431targetOffsetByStateoFUgxo0(EnterExitState enterExitState, long j2) {
        if (this.currentAlignment != null && getAlignment() != null && !Intrinsics.areEqual(this.currentAlignment, getAlignment())) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[enterExitState.ordinal()];
            if (i2 == 1) {
                return IntOffset.Companion.m6776getZeronOccac();
            }
            if (i2 == 2) {
                return IntOffset.Companion.m6776getZeronOccac();
            }
            if (i2 == 3) {
                ChangeSize changeSize = this.exit.getData$animation_release().getChangeSize();
                if (changeSize != null) {
                    long jM6812unboximpl = changeSize.getSize().invoke(IntSize.m6800boximpl(j2)).m6812unboximpl();
                    Alignment alignment = getAlignment();
                    Intrinsics.checkNotNull(alignment);
                    long jMo3783alignKFBX0sM = alignment.mo3783alignKFBX0sM(j2, jM6812unboximpl, LayoutDirection.Ltr);
                    Alignment alignment2 = this.currentAlignment;
                    Intrinsics.checkNotNull(alignment2);
                    return IntOffset.m6769minusqkQi6aY(jMo3783alignKFBX0sM, alignment2.mo3783alignKFBX0sM(j2, jM6812unboximpl, LayoutDirection.Ltr));
                }
                return IntOffset.Companion.m6776getZeronOccac();
            }
            throw new NoWhenBranchMatchedException();
        }
        return IntOffset.Companion.m6776getZeronOccac();
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
    public MeasureResult mo428measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
        State<IntOffset> stateAnimate;
        State<IntOffset> stateAnimate2;
        if (this.transition.getCurrentState() == this.transition.getTargetState()) {
            this.currentAlignment = null;
        } else if (this.currentAlignment == null) {
            Alignment alignment = getAlignment();
            if (alignment == null) {
                alignment = Alignment.Companion.getTopStart();
            }
            this.currentAlignment = alignment;
        }
        if (measureScope.isLookingAhead()) {
            final Placeable placeableMo5514measureBRTryo0 = measurable.mo5514measureBRTryo0(j2);
            long jIntSize = IntSizeKt.IntSize(placeableMo5514measureBRTryo0.getWidth(), placeableMo5514measureBRTryo0.getHeight());
            this.lookaheadSize = jIntSize;
            m427setLookaheadConstraintsBRTryo0(j2);
            return MeasureScope.layout$default(measureScope, IntSize.m6808getWidthimpl(jIntSize), IntSize.m6807getHeightimpl(jIntSize), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable.PlacementScope placementScope) {
                    Placeable.PlacementScope.place$default(placementScope, placeableMo5514measureBRTryo0, 0, 0, 0.0f, 4, null);
                }
            }, 4, null);
        }
        if (this.isEnabled.invoke().booleanValue()) {
            final Function1<GraphicsLayerScope, Unit> function1Init = this.graphicsLayerBlock.init();
            final Placeable placeableMo5514measureBRTryo02 = measurable.mo5514measureBRTryo0(j2);
            long jIntSize2 = IntSizeKt.IntSize(placeableMo5514measureBRTryo02.getWidth(), placeableMo5514measureBRTryo02.getHeight());
            final long j3 = AnimationModifierKt.m405isValidozmzZPI(this.lookaheadSize) ? this.lookaheadSize : jIntSize2;
            Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation = this.sizeAnimation;
            State<IntSize> stateAnimate3 = deferredAnimation != null ? deferredAnimation.animate(this.sizeTransitionSpec, new Function1<EnterExitState, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$animSize$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ IntSize invoke(EnterExitState enterExitState) {
                    return IntSize.m6800boximpl(m432invokeYEO4UFw(enterExitState));
                }

                /* JADX INFO: renamed from: invoke-YEO4UFw, reason: not valid java name */
                public final long m432invokeYEO4UFw(EnterExitState enterExitState) {
                    return this.this$0.m429sizeByStateUzc_VyU(enterExitState, j3);
                }
            }) : null;
            if (stateAnimate3 != null) {
                jIntSize2 = stateAnimate3.getValue().m6812unboximpl();
            }
            long jM6605constrain4WqzIAM = ConstraintsKt.m6605constrain4WqzIAM(j2, jIntSize2);
            Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation2 = this.offsetAnimation;
            final long jM6776getZeronOccac = (deferredAnimation2 == null || (stateAnimate2 = deferredAnimation2.animate(new Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$offsetDelta$1
                @Override // kotlin.jvm.functions.Function1
                public final FiniteAnimationSpec<IntOffset> invoke(Transition.Segment<EnterExitState> segment) {
                    return EnterExitTransitionKt.DefaultOffsetAnimationSpec;
                }
            }, new Function1<EnterExitState, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$offsetDelta$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ IntOffset invoke(EnterExitState enterExitState) {
                    return IntOffset.m6757boximpl(m433invokeBjo55l4(enterExitState));
                }

                /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                public final long m433invokeBjo55l4(EnterExitState enterExitState) {
                    return this.this$0.m431targetOffsetByStateoFUgxo0(enterExitState, j3);
                }
            })) == null) ? IntOffset.Companion.m6776getZeronOccac() : stateAnimate2.getValue().m6775unboximpl();
            Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation3 = this.slideAnimation;
            long jM6776getZeronOccac2 = (deferredAnimation3 == null || (stateAnimate = deferredAnimation3.animate(this.slideSpec, new Function1<EnterExitState, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$slideOffset$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ IntOffset invoke(EnterExitState enterExitState) {
                    return IntOffset.m6757boximpl(m434invokeBjo55l4(enterExitState));
                }

                /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                public final long m434invokeBjo55l4(EnterExitState enterExitState) {
                    return this.this$0.m430slideTargetValueByStateoFUgxo0(enterExitState, j3);
                }
            })) == null) ? IntOffset.Companion.m6776getZeronOccac() : stateAnimate.getValue().m6775unboximpl();
            Alignment alignment2 = this.currentAlignment;
            final long jM6770plusqkQi6aY = IntOffset.m6770plusqkQi6aY(alignment2 != null ? alignment2.mo3783alignKFBX0sM(j3, jM6605constrain4WqzIAM, LayoutDirection.Ltr) : IntOffset.Companion.m6776getZeronOccac(), jM6776getZeronOccac2);
            return MeasureScope.layout$default(measureScope, IntSize.m6808getWidthimpl(jM6605constrain4WqzIAM), IntSize.m6807getHeightimpl(jM6605constrain4WqzIAM), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable.PlacementScope placementScope) {
                    placementScope.placeWithLayer(placeableMo5514measureBRTryo02, IntOffset.m6766getXimpl(jM6776getZeronOccac) + IntOffset.m6766getXimpl(jM6770plusqkQi6aY), IntOffset.m6767getYimpl(jM6776getZeronOccac) + IntOffset.m6767getYimpl(jM6770plusqkQi6aY), 0.0f, function1Init);
                }
            }, 4, null);
        }
        final Placeable placeableMo5514measureBRTryo03 = measurable.mo5514measureBRTryo0(j2);
        return MeasureScope.layout$default(measureScope, placeableMo5514measureBRTryo03.getWidth(), placeableMo5514measureBRTryo03.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$3$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.place$default(placementScope, placeableMo5514measureBRTryo03, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    public final Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>> getSlideSpec() {
        return this.slideSpec;
    }

    /* JADX INFO: renamed from: slideTargetValueByState-oFUgxo0, reason: not valid java name */
    public final long m430slideTargetValueByStateoFUgxo0(EnterExitState enterExitState, long j2) {
        Function1<IntSize, IntOffset> slideOffset;
        Function1<IntSize, IntOffset> slideOffset2;
        Slide slide = this.enter.getData$animation_release().getSlide();
        long jM6776getZeronOccac = (slide == null || (slideOffset2 = slide.getSlideOffset()) == null) ? IntOffset.Companion.m6776getZeronOccac() : slideOffset2.invoke(IntSize.m6800boximpl(j2)).m6775unboximpl();
        Slide slide2 = this.exit.getData$animation_release().getSlide();
        long jM6776getZeronOccac2 = (slide2 == null || (slideOffset = slide2.getSlideOffset()) == null) ? IntOffset.Companion.m6776getZeronOccac() : slideOffset.invoke(IntSize.m6800boximpl(j2)).m6775unboximpl();
        int i2 = WhenMappings.$EnumSwitchMapping$0[enterExitState.ordinal()];
        if (i2 == 1) {
            return IntOffset.Companion.m6776getZeronOccac();
        }
        if (i2 == 2) {
            return jM6776getZeronOccac;
        }
        if (i2 == 3) {
            return jM6776getZeronOccac2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
