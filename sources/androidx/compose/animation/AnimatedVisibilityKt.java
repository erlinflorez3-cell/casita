package androidx.compose.animation;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: compiled from: AnimatedVisibility.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яn\u001d̉=!,r\bDZc|\u0004W\u00068\u000b4C\u0007\":\u0012\u007f\u0007lkA0ZeP\u008cZS@\u000fsڔ<$q$yّCU0}*ޛWN}gvϺb\u000bY\u000f\u000eǝ\u0001jBI]xs\u0012\u00172XoG3SpE9vt>ӌ(20D\u0002\u0005\u0007\u001d2H&v\u0003CQ\f\u001a0VpBR\u0013S\u001dܗ\u0011\u0014B8\u0001La\bP<ԟzcj91\n\u0002H^)o0CS;F\u00057\u001b~y*;BG5[+c\u0005\u0017R\n>1H\"A\u0013r?'YT$[Dd\u0018\u0014C8\u007f\u0011k\u0001>\\3`\u0011\"5;gu[R\u001e(&{\f\u000fL\u0004<\u00077J>-He6\u001fc|xSNb\u001a`X~)tf13\u0014KAI\u001dvQ\u0010P)PG{3\u0012L,ъr!aj\u05f8d\u0015!k>PśU@K`figV\u0006\u0004\u001fg24\u0012J_\u0006?}!.E$evi)'k\u0010R\\g%\u0010\u0011nYi`TX\"\u001d#g0\u000f\fhR|\u0005\u001a_\u0005^2\u0011[8l\u0007,%C:j\fT75\u0012^O\u0017~zOm\nS4\u0015@֍rk\u0014mߍb3;h*\u0015уVv\"]T<\u0013q~B\u0002\u0011\u000b`6*JH\u0019\u000f(\u0002JN\u001a\u001dJ? 'd27\u0019j!`\u0003LOq\u0003\u000f_hv(~\u0003BT\to$\u0003%\u0019P\u000b\u000e \u0002\u0007]D\u0013p$=A\u007fJ)(e\"\u00179+,ȷ\u0003s\u0006]ѨPGR\u0004\\zʀ\u007f $9Q;=]+\u000f-.R\u00043զZx\u0016[[\u0019?\u0001\r{\u001f;/4\u0016\b\u001b\u0001:h\u0003V_V'\"=d\u0003%\u0018d.x\u0010O+Kq^#[lT#\u0007gHf8+\u0012O\"3\u000f\b\"+D]]51.\u000e$1%a\f~\u007f0\nb=+#nנ0c\u001c\u0006͈U]8R~H˕\u0003>0E\u0005nPa\u0003w6G)6\u0013ΉVG\rvf:]\u000bu\u0004\u0015\u0007\\\u001d~^sF#q\u000e4te:uS}B]q.ASYg{wc\\9U?\u0010\u0011{?z*\u001ck-\u0007]h\t>\u0014\f\u0018dPk|\u0013P!:D.L\b9Xdk\u0016\u0010)\u0005thʸ\u001b2H\nŌZ\u000eZ\u0010#[߃\t`S\u00039\u000e\u000f\u0018'3L}]13\u0011v^=}J\u0007c\u001f\u0019\u001b\u0019N-\u0002U1JTG%@X/\u0016ucII\u0010B\u001cGWz\u001cu\u00128&\u000b5BF*iW\u0017_\u0005Lv\u000b\u0004\u0002~~\u0005&~h^$9~)\u0012\u001e>\u001a\u000f9\u001e}{ƚf-Rdߺ;C \u0018]Iͫ\u000b\f\u000b\b^x;\u001fM-kN\u0013\u0014U\u001f\bWI\u0006  N&4z'\\e\u0018~\n\f&j\u001cw\u0016p\u000e!\u0013~-44Pt\u0001\u0018F\bd^29\b\u0013lu\u0004wO]WEz\u001aZaxz\u001ac\u001bx~W\u001b\u0003\u00156\u0005\u0003ӊ1P#\u001fߓQ.\u0019o!?ñW f6\u0018w#?766gQ\u0010}\n\u0019zyis\u0013;1{*\u00100^mN\u0004%y\u0004\u000eBTV k\\S>r\u0015tlpd>dp(r\u0003$)B\f/Nd\u0011!P^rL\u0002_Q'3s#Wb\u0017\u0004s^6#ARm e;цs(|'ܾ>bz\u0017pG֟v\u007fuSE$bV2'\b)\u0016d1L{IFJ ,?\rA5`8.Ht\u001aJF\u00029G\u0019\u001f\r-84|7\u001f;j_a=*/\f1\u0013Ey?\bRse\u0010SI\u001d\u00043mv=55\u0014a7\u000e\u0012ex\u0004{lȡ\u0013a2_ˢI\u001e\u007fl\u0007\u0005ˌ#$2.\u000eZ\u000enIHX`|B\\؛e\nN0FpT#\u000er's:<w \fpkcDAA\u001a)FN*[k5N}l\b5\\\r\f\u001a}\u0010ҋ-3%(0k\u007f˟CI!LWbm>#s2;`al:\u001eʢ[م\n1*Vilxp̒c<ٱ\u0016-\u001b1\u0010Cbb\u0010`K\u00197M\u0007Fd]\tOQb9?=5~0HԽ\u0019\flǥЈ\u0017Ѯ\u0002XnC+3uraI\u0018͟\n'sǙ؈%"}, d2 = {"3wXA90GW'\u0002z]", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fDi\u001f<QR?u=s", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006V.DY\u000b\u007fJq%\u001c\\?Jk\n", "5dc\u0012k0M4\u001d\b~l/|\b", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i&z\u00127[GJo>'j,V", "\u000fmX:T;>Rx\b\n^9\\\u001c3tc0\u0007G", "", "\"", "BqP;f0MW#\b", "Dhb6U3>", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "3mc2e", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006V.DY\u000b\u000fDi\u001f<QR?u=s", "3wXA", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006V89hl-3v$2\\GEt\n", "Ag^B_+\u001dW'\n\u0005l,Y\u00109c\u0006", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "=m;<b2:V\u0019zyF,x\u0017?r\u007f'", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006`.\u001cc\b&3p\u0016*L+;gB.\"h`\u000f", "1n]AX5M", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006R.9ay/7l\u00072[G8o;\"$|O7\u0011n,$", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i&z\u00127[GJo>'jOgC\u0016j0W@,XT\u0018-l[pL\u0018\u001cc\u001c\u0018\f\u001d\u000eWP(xM\u0003tn(R\u0001Hr\u0005\u000b)W3txM`\u001eGC%y\u000b\u0011rE]`}GN\u001bI&m\u000bl'`9Mm\u0012{!&r^.Sw\\\u0015zN\tkqPbZA3>zJSAxc@\u0004+)TQ^\u000e;W\u00025x,\u0017}(@l\u0010Uu\u0018\bZ\u0002\u00194XP+0?\u0006rROrdy:\u0017v#p\f\u0018k\u000b\u0018\u001fotjL\u0018Pb(c~bo\n5a\nHR}^\bV\b@j}\u001f\u0012SyTaRB(^\u0005\u0019\u0004\u000e i\u0019\u000e\rt\u0018e*\u001fAa\u000bw.i@\u0017|\u0012OB\u0016\u0002UF\u0015lGwmG\u0001kdo#\f_\u0017S0:OE@WTwY\u0017D\n\t\u000e!}rPC\u0017#.#L]Bk.\u0005qc\\!&q<\u001b2v/\fZKxlwp\"\u000e\u0017w\u0001\u001d]\b\u0016\f;LSx\"I9/h\u007fK", "\u000fmX:T;>R\n\u0003\tb)\u0001\u00103t\u0014", "Dhb6U3>A(z\n^", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\bG|\u0012+TC*x0'#lp=\u0011l\u001a]r6G\"", ":`Q2_", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u001f}%*JJ;ZA\u001a\u001eveH\u000bm5<\u0006#VL$\u0013X[qJ\u001e\u0016Y!\u0018)\u0017\rdK2n\u000eG#Q\u0014S\u0001?i\u0005\f#c\u001cfyAc\u001aKx(??3pQcmy\u0011=Nf2`\u001bc'e\u0004\u001a-#q&\nuL7\u0018\u007fb\u0015|[ONcP\u0018\bB(=\u0001%DOw`F\u0003'hG\u0005{\u001a.gx5}vcG.ES\u0012Gp&Bm|\u001f52(,\"G8\\FGlw6,\u001du#j\ncI;;(lil\u0012\u0014\u0018e`\\Ej]\u0010;\\\u000fL\u0013P%0D\u000eFe\u0003b^m vdVM\u001fS\u0014cnN*j\u001b\u0011\u00030%,7%Aa\u000f2\bi?X\u001d\u0017hEa_=\u0007\u0006", "uY;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`~Qn\u0012=z%B/d\u001c@l#8QBN52(\u001dskG\u0007-(Wz/C[R6e\u001cRF#\u0012g|['\u0016\u0013]P(xM\r\u0006\u00045H\u000fEl\u007f\u001f_\f?r{Ld\u0010\u0011u\u001eyI%wJchC'TIq\u0019q\bh+`I>.\u001dG\u007f da*S\u0003O\u001at\u001cgvtK\"|\u000e\u000bDwjMIx\u001fA\u0006/hL\f\u0001\u0010A\\~4\u0003vdD34s\tUpe\u0014Et\u001e+iK+%I\u0006\u0011ISn\u007fz>Wu/j\u0017\u0012j5zvomnR\u001d\u0007jl?\u0019%P", "\u000fmX:T;>R\n\u0003\tb)\u0001\u00103t\u0014\f\u0004K\b", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i&z\u00127[GJo>'jOgC\u0016j0W@,XT\u0018-l[pL\u0018\u001cc\u001c\u0018\f\u001d\u000eWP(xM\u0003tn(R\u0001Hr\u0005\u000b)W3txM`\u001eGC%y\u000b\u0011rE]`}GN\u001bI&m\u000bl'`9Mm\u0012{!&r^.Sw\\\u0015zN\tkqPbZA3>zJSAxc@\u0004+)TQ^\u000e;W\u00025x,\u0017}(@l\u0010Uu\u0018\bZ\u0002\u00194XP+0?\u0006rROrdy:\u0017v#p\f\u0018k\u000b\u0018\u001fotjL\u0018Pb(c~bo\n5a\nHR}^\bV\b@j}\u001f\u0012TyTaRB(^\u0005\u0019\u0004\u000e i\u0019\u000e\rt\u0018e;&Fh\u0013p*)\u0015W\u001b\u0014rF\f\t/'Xa", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i&z\u00127[GJo>'jOgC\u0016j0W@,XT\u0018-l[pL\u0018\u001cc\u001c\u0018\f\u001d\u000eWP(xM\u0003tn(R\u0001Hr\u0005\u000b)W3txM`\u001eGC%y\u000b\u0011rE]`}GN\u001bI&m\u000bl'`9Mm\u0012{!&r^.Sw\\\u0015zN\tkqPbZA3>zJSAxc@\u0004+)TQ^\u000e;W\u00025x,\u0017}(@l\u0010Uu\u0018\bZ\u0002\u00194XP+0?\u0006rROrdy:\u0017v#p\f\u0018k\u000b\u0018\u001fotjL\u0018Pb(c~bo\n5a\nHR}^\bV\b@j}\u001f\u0012TyTaRB(^\u0005\u0019\u0004\u000e i\u0019\u000e\rt\u0018e;&Fh\u0013p*)\u0015W\u001b\u0014rF\f\t/'x49", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s8TSCt\"\u001c\u001fsa\u000f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u0012*G|_\fWJKs=\f\u0013rl9\\J(Wu4QPM?&P|E\u001f\u001ch\u000e\u0018'\u0016\ta=3rN@h\u00066V\u0002\u0005P\u0011\u001b\u0012\u000b<j_OR\u0019U}$yK2VUUny\u001d(Ak)q\u0016c\u001co\u00048.\u001c|#)h\u001a>\u000eE;\u001bqVzkgTna4-=zeJD\u0003\u001f:~/*U\nw[.ax3p<\b>3\u007fD\u000eZg%-kt\u001e:`P+0?\u0012y;Tb\u0003vB\r{h_\u0012\u0016m??\u0019/alL\u0017\u0003l\u001be>+?\u0014;atKEx#+U\u0003LdO{\u000e\u00035i/P?$VJ\b\u007fQ&h\u0013Xil\"+5\u001aF#\u0014y2)8]\u001c\u0007w<\u0016\u0005g\ru\u0001Q\u000e|O|d%E\u000b2\u0002\u0010V+7JO@PMw\u001b B\u0001T\f-|xF\u00026\\\u0003/EdBp`<`K7e\n", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u0012*G|_\fWJKs=\f\u0013rl9\\X\u0013J\u007f&TVR+o\u001cpG\u001c\u001dd\u001cNt\u001d\t#).mH8#\b9\u001fh7q\u007f\u0019 \u00124}:@`\u0018R\u0004#u\u000b%qJa[\tKKN,\nm\u001b_*KG6-\"u(\u001frY\u0004pw\\\u0010\u007f\\}fz\u0011\u0017\u0005@/H{[\u0010AxYDp6#U\u0005AqE\\\u0004\u001a\u0002)\rB.Eh\u000fT=~CZ\n\u0011uc=0(\u007f*\"LOlwB%\u0014r.h\f\u0017,:B!/fsQ\r\u0016a!dC+@\u0011@P\u0015BSxb|-zKZ\u0007\u001f\r\u000677cSK&^\u000f\u001a:Q2h \u0007\u000bfay8\u001eHc\u001dh75\u001b1Vy", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u00038_19u?\u001ej", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u0012*G|_\u001bWU)i>)\u0015>H5\u0010b9Xz&Z\u0016L6d]|K\u0014[V\u0017R3\t\u0014]K-8BA,\bu1\u0012Jd}\u0013\u0016|BfyPZ\u001fK\u0004\u001ecP%wF/FuP@Rl.c\u001f)\u001bfBE.\"qb+l\u001a\u0016\u0014zW\u0012vR\u0007=NC\"yE.Bln\u0010Cy]G~5\u001f\u0015w\u0001\u0016:T\u0004/~6M\u00143Ed\u0012:t\u0014Gl|$0fJ|\r2E\u0012LUgt\u007f\b\fr'l\u0012\u001cb~-\"im_W\u0013\u0011f`;HenoDN\u000fLM~\u00191OT)`u&\u0005P+inK\r\tc\u000e\u001eyFwF\u0017\r\u0012m\u001c%w\u001bNaXi:h5\\\u0017\u0013qFU\\iL\u0013\u007fL\u001av\u0019HBSx#C\u0003\u0015H4|IF~]M}\u0010_A\u0011\u0014\u000e!{i\fW@\u001b0/KYE8D\u0013NX", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u0012*G|_\u001bWU)i>)\u0015>V \u0003l+[\u0001+F_\u0018*fZ}G\"\u0012$\u001eRtt\u000fXE%rDDtn(R\u0001Hr\u0005\u000b)W3txM`\u001eGC\u0011~E1dU]i\u0003\u0011!Nq*qzl\u0019eH>3\u0018{\"pOL7\t\t]\u0015qeCeqO$\u0005F$\bidJMkd@~0h+\u000f{!!ep4\u00031\u001384?:kPc):(\u007f\u00115^\u000b\u00155C@\u001cA!J{vM\u0015l(+\r\u001fj~2)ncrL\u0019\u0010k`<Ej]\u0010;\\\u000f\f\u001fV\u00110E\fL_x(R\u0005.upSQ\u001b\u001e\u000e*yS&g\u0011L`p '8$=fdL\u000e#(", "B`a4X;\u001e\\(~\b>?\u0001\u0018", "B`a4X;,b\u0015\u000ez", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i&z\u00127[GJo>'jOgC\u0016j0W@,XT\u0018-l[pL\u0018\u001cc\u001c\u0018\f\u001d\u000eWP(xM\u0003tn1E\u001372\b\b\u001f\u0010~TmGV\u000eVO{qJ(uP]^\r\u0011?Oj5n\u001a_fiJC3\u0018y\u0019dFZ6\u0015\u0006a\u0011\u007f(]+NC\"yE.Bln\u0010Cy]G~5\u001f\u0015w\u0001\u0016:T\u0004/~6M\u00143Ed\u0012+z\u001cML\b\u0011;\\\u0017", "/mX:T;B]\"x\b^3|\u0005=e", "Ag^B_+\u001dW'\n\u0005l,Y\u00109c\u0006\u0018\u0007?|&\u0017F", "Ag^B_+\u001dW'\n\u0005l,X\n>e\r\b\u000fD\u0010"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AnimatedVisibilityKt {
    public static final void AnimatedVisibility(final boolean z2, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, final Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2, final int i3) {
        int i4;
        final String str2 = str;
        final ExitTransition exitTransitionPlus = exitTransition;
        final EnterTransition enterTransitionPlus = enterTransition;
        final Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(2088733774);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(AnimatedVisibility)P(5,4,1,2,3)132@6967L32,133@7004L84:AnimatedVisibility.kt#xbi5r1");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            i4 = i2 | 6;
        } else if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            int i5 = composerStartRestartGroup.changed(z2) ? 4 : 2;
            i4 = (i5 + i2) - (i5 & i2);
        } else {
            i4 = i2;
        }
        int i6 = (-1) - (((-1) - i3) | ((-1) - 2));
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(companion) ? 32 : 16;
        }
        int i7 = (-1) - (((-1) - i3) | ((-1) - 4));
        if (i7 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(enterTransitionPlus) ? 256 : 128)));
        }
        int i8 = (-1) - (((-1) - i3) | ((-1) - 8));
        if (i8 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(exitTransitionPlus) ? 2048 : 1024;
        }
        int i9 = i3 & 16;
        if (i9 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 24576));
        } else if ((i2 + 24576) - (i2 | 24576) == 0) {
            int i10 = composerStartRestartGroup.changed(str2) ? 16384 : 8192;
            i4 = (i4 + i10) - (i4 & i10);
        }
        if ((i3 & 32) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE));
        } else if ((-1) - (((-1) - i2) | ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE)) == 0) {
            int i11 = composerStartRestartGroup.changedInstance(function3) ? 131072 : 65536;
            i4 = (i4 + i11) - (i4 & i11);
        }
        if ((-1) - (((-1) - 74899) | ((-1) - i4)) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (i6 != 0) {
                companion = Modifier.Companion;
            }
            if (i7 != 0) {
                enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
            }
            if (i8 != 0) {
                exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
            }
            if (i9 != 0) {
                str2 = "AnimatedVisibility";
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2088733774, i4, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
            }
            Boolean boolValueOf = Boolean.valueOf(z2);
            int i12 = (-1) - (((-1) - i4) | ((-1) - 14));
            int i13 = (-1) - (((-1) - (i4 >> 9)) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION));
            int i14 = i4 << 3;
            int i15 = (i14 + 896) - (896 | i14);
            AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition(boolValueOf, str2, composerStartRestartGroup, (i12 + i13) - (i12 & i13), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.1
                public final Boolean invoke(boolean z3) {
                    return Boolean.valueOf(z3);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                    return invoke(bool.booleanValue());
                }
            }, companion, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (-1) - (((-1) - ((-1) - (((-1) - (i14 & 57344)) & ((-1) - (((i15 + 48) - (i15 & 48)) | (7168 & i14)))))) & ((-1) - (i4 & 458752))));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i16) {
                    AnimatedVisibilityKt.AnimatedVisibility(z2, companion, enterTransitionPlus, exitTransitionPlus, str2, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }

    public static final void AnimatedVisibility(final RowScope rowScope, final boolean z2, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, final Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2, final int i3) {
        int i4;
        final String str2 = str;
        final ExitTransition exitTransitionPlus = exitTransition;
        final EnterTransition enterTransitionPlus = enterTransition;
        final Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1741346906);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(AnimatedVisibility)P(5,4,1,2,3)207@11272L32,208@11309L84:AnimatedVisibility.kt#xbi5r1");
        if ((i3 & 1) != 0) {
            i4 = (-1) - (((-1) - i2) & ((-1) - 48));
        } else if ((i2 & 48) == 0) {
            i4 = (composerStartRestartGroup.changed(z2) ? 32 : 16) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i6 = composerStartRestartGroup.changed(companion) ? 256 : 128;
            i4 = (i4 + i6) - (i4 & i6);
        }
        int i7 = (-1) - (((-1) - i3) | ((-1) - 4));
        if (i7 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 3072));
        } else if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            i4 |= composerStartRestartGroup.changed(enterTransitionPlus) ? 2048 : 1024;
        }
        int i8 = (-1) - (((-1) - i3) | ((-1) - 8));
        if (i8 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 24576));
        } else if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(exitTransitionPlus) ? 16384 : 8192;
        }
        int i9 = (-1) - (((-1) - i3) | ((-1) - 16));
        if (i9 != 0) {
            i4 = (i4 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        } else if ((-1) - (((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ((-1) - i2)) == 0) {
            i4 |= composerStartRestartGroup.changed(str2) ? 131072 : 65536;
        }
        if ((i3 & 32) != 0) {
            i4 = (i4 + 1572864) - (i4 & 1572864);
        } else if ((i2 & 1572864) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function3) ? 1048576 : 524288)));
        }
        if ((599185 + i4) - (599185 | i4) != 599184 || !composerStartRestartGroup.getSkipping()) {
            if (i5 != 0) {
                companion = Modifier.Companion;
            }
            if (i7 != 0) {
                enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null));
            }
            if (i8 != 0) {
                exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null));
            }
            if (i9 != 0) {
                str2 = "AnimatedVisibility";
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1741346906, i4, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:206)");
            }
            Boolean boolValueOf = Boolean.valueOf(z2);
            int i10 = i4 >> 3;
            int i11 = (-1) - (((-1) - i10) | ((-1) - 14));
            int i12 = (i4 >> 12) & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION;
            AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition(boolValueOf, str2, composerStartRestartGroup, (i11 + i12) - (i11 & i12), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.3
                public final Boolean invoke(boolean z3) {
                    return Boolean.valueOf(z3);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                    return invoke(bool.booleanValue());
                }
            }, companion, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (-1) - (((-1) - ((-1) - (((-1) - ((i4 + 57344) - (i4 | 57344))) & ((-1) - ((-1) - (((-1) - ((-1) - (((-1) - (i4 & 896)) & ((-1) - 48)))) & ((-1) - ((i4 + 7168) - (7168 | i4))))))))) & ((-1) - (i10 & 458752))));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i13) {
                    AnimatedVisibilityKt.AnimatedVisibility(rowScope, z2, companion, enterTransitionPlus, exitTransitionPlus, str2, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }

    public static final void AnimatedVisibility(final ColumnScope columnScope, final boolean z2, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, final Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2, final int i3) {
        int i4;
        final String str2 = str;
        final ExitTransition exitTransitionPlus = exitTransition;
        final EnterTransition enterTransitionPlus = enterTransition;
        final Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(1766503102);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(AnimatedVisibility)P(5,4,1,2,3)280@15555L32,281@15592L84:AnimatedVisibility.kt#xbi5r1");
        if ((i3 & 1) != 0) {
            i4 = (i2 + 48) - (i2 & 48);
        } else if ((i2 + 48) - (i2 | 48) == 0) {
            i4 = (-1) - (((-1) - (composerStartRestartGroup.changed(z2) ? 32 : 16)) & ((-1) - i2));
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i4 |= composerStartRestartGroup.changed(companion) ? 256 : 128;
        }
        int i6 = (i3 + 4) - (i3 | 4);
        if (i6 != 0) {
            i4 |= 3072;
        } else if ((i2 + 3072) - (i2 | 3072) == 0) {
            int i7 = composerStartRestartGroup.changed(enterTransitionPlus) ? 2048 : 1024;
            i4 = (i4 + i7) - (i4 & i7);
        }
        int i8 = (i3 + 8) - (i3 | 8);
        if (i8 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 24576));
        } else if ((i2 + 24576) - (i2 | 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(exitTransitionPlus) ? 16384 : 8192;
        }
        int i9 = (-1) - (((-1) - i3) | ((-1) - 16));
        if (i9 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE));
        } else if ((ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE + i2) - (196608 | i2) == 0) {
            int i10 = composerStartRestartGroup.changed(str2) ? 131072 : 65536;
            i4 = (i4 + i10) - (i4 & i10);
        }
        if ((i3 & 32) != 0) {
            i4 = (i4 + 1572864) - (i4 & 1572864);
        } else if ((i2 & 1572864) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function3) ? 1048576 : 524288;
        }
        if ((599185 & i4) != 599184 || !composerStartRestartGroup.getSkipping()) {
            if (i5 != 0) {
                companion = Modifier.Companion;
            }
            if (i6 != 0) {
                enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null));
            }
            if (i8 != 0) {
                exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null));
            }
            if (i9 != 0) {
                str2 = "AnimatedVisibility";
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1766503102, i4, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
            }
            int i11 = i4 >> 3;
            int i12 = i4 & 896;
            int i13 = (-1) - (((-1) - ((i12 + 48) - (i12 & 48))) & ((-1) - ((-1) - (((-1) - i4) | ((-1) - 7168)))));
            int i14 = i4 & 57344;
            AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z2), str2, composerStartRestartGroup, ((i11 + 14) - (14 | i11)) | ((-1) - (((-1) - (i4 >> 12)) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.5
                public final Boolean invoke(boolean z3) {
                    return Boolean.valueOf(z3);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                    return invoke(bool.booleanValue());
                }
            }, companion, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, ((i14 + i13) - (i14 & i13)) | (i11 & 458752));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i15) {
                    AnimatedVisibilityKt.AnimatedVisibility(columnScope, z2, companion, enterTransitionPlus, exitTransitionPlus, str2, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }

    public static final void AnimatedVisibility(final MutableTransitionState<Boolean> mutableTransitionState, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, final Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2, final int i3) {
        int i4;
        final String str2 = str;
        final ExitTransition exitTransitionPlus = exitTransition;
        final EnterTransition enterTransitionPlus = enterTransition;
        final Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-222898426);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(AnimatedVisibility)P(5,4,1,2,3)385@20955L39,386@20999L84:AnimatedVisibility.kt#xbi5r1");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 + 6) - (i2 | 6) == 0) {
            int i5 = (i2 & 8) == 0 ? composerStartRestartGroup.changed(mutableTransitionState) : composerStartRestartGroup.changedInstance(mutableTransitionState) ? 4 : 2;
            i4 = (i5 + i2) - (i5 & i2);
        } else {
            i4 = i2;
        }
        int i6 = (i3 + 2) - (i3 | 2);
        if (i6 != 0) {
            i4 = (i4 + 48) - (i4 & 48);
        } else if ((i2 & 48) == 0) {
            int i7 = composerStartRestartGroup.changed(companion) ? 32 : 16;
            i4 = (i4 + i7) - (i4 & i7);
        }
        int i8 = i3 & 4;
        if (i8 != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(enterTransitionPlus) ? 256 : 128)));
        }
        int i9 = (i3 + 8) - (i3 | 8);
        if (i9 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 3072));
        } else if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(exitTransitionPlus) ? 2048 : 1024)));
        }
        int i10 = i3 & 16;
        if (i10 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 24576));
        } else if ((i2 + 24576) - (i2 | 24576) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(str2) ? 16384 : 8192)));
        }
        if ((i3 + 32) - (i3 | 32) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE));
        } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function3) ? 131072 : 65536)));
        }
        if ((74899 + i4) - (74899 | i4) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (i6 != 0) {
                companion = Modifier.Companion;
            }
            if (i8 != 0) {
                enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
            }
            if (i9 != 0) {
                exitTransitionPlus = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
            }
            if (i10 != 0) {
                str2 = "AnimatedVisibility";
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-222898426, i4, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:384)");
            }
            int i11 = i4 << 3;
            AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.rememberTransition(mutableTransitionState, str2, composerStartRestartGroup, MutableTransitionState.$stable | (14 & i4) | ((-1) - (((-1) - (i4 >> 9)) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.7
                public final Boolean invoke(boolean z2) {
                    return Boolean.valueOf(z2);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                    return invoke(bool.booleanValue());
                }
            }, companion, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, ((-1) - (((-1) - ((-1) - (((-1) - i11) | ((-1) - 57344)))) & ((-1) - (((-1) - (((-1) - ((-1) - (((-1) - i11) | ((-1) - 896)))) & ((-1) - 48))) | (7168 & i11))))) | ((i4 + 458752) - (i4 | 458752)));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.8
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i12) {
                    MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                    Modifier modifier2 = companion;
                    EnterTransition enterTransition2 = enterTransitionPlus;
                    ExitTransition exitTransition2 = exitTransitionPlus;
                    String str3 = str2;
                    Function3<AnimatedVisibilityScope, Composer, Integer, Unit> function32 = function3;
                    int i13 = i2;
                    AnimatedVisibilityKt.AnimatedVisibility(mutableTransitionState2, modifier2, enterTransition2, exitTransition2, str3, function32, composer2, RecomposeScopeImplKt.updateChangedFlags((i13 + 1) - (i13 & 1)), i3);
                }
            });
        }
    }

    public static final void AnimatedVisibility(final RowScope rowScope, final MutableTransitionState<Boolean> mutableTransitionState, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, final Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2, final int i3) {
        int i4;
        final String str2 = str;
        final ExitTransition exitTransitionPlus = exitTransition;
        final EnterTransition enterTransitionPlus = enterTransition;
        final Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(836509870);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(AnimatedVisibility)P(5,4,1,2,3)460@25318L39,461@25362L84:AnimatedVisibility.kt#xbi5r1");
        if ((i3 + 1) - (i3 | 1) != 0) {
            i4 = (-1) - (((-1) - i2) & ((-1) - 48));
        } else if ((i2 & 48) == 0) {
            int i5 = (-1) - (((-1) - i2) | ((-1) - 64)) == 0 ? composerStartRestartGroup.changed(mutableTransitionState) : composerStartRestartGroup.changedInstance(mutableTransitionState) ? 32 : 16;
            i4 = (i5 + i2) - (i5 & i2);
        } else {
            i4 = i2;
        }
        int i6 = (i3 + 2) - (i3 | 2);
        if (i6 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i7 = composerStartRestartGroup.changed(companion) ? 256 : 128;
            i4 = (i4 + i7) - (i4 & i7);
        }
        int i8 = (-1) - (((-1) - i3) | ((-1) - 4));
        if (i8 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 3072));
        } else if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(enterTransitionPlus) ? 2048 : 1024;
        }
        int i9 = (-1) - (((-1) - i3) | ((-1) - 8));
        if (i9 != 0) {
            i4 = (i4 + 24576) - (i4 & 24576);
        } else if ((i2 & 24576) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(exitTransitionPlus) ? 16384 : 8192)));
        }
        int i10 = i3 & 16;
        if (i10 != 0) {
            i4 = (i4 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        } else if ((-1) - (((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ((-1) - i2)) == 0) {
            int i11 = composerStartRestartGroup.changed(str2) ? 131072 : 65536;
            i4 = (i4 + i11) - (i4 & i11);
        }
        if ((i3 & 32) != 0) {
            i4 |= 1572864;
        } else if ((i2 + 1572864) - (i2 | 1572864) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function3) ? 1048576 : 524288)));
        }
        if ((599185 + i4) - (599185 | i4) != 599184 || !composerStartRestartGroup.getSkipping()) {
            if (i6 != 0) {
                companion = Modifier.Companion;
            }
            if (i8 != 0) {
                enterTransitionPlus = EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
            }
            if (i9 != 0) {
                exitTransitionPlus = EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
            }
            if (i10 != 0) {
                str2 = "AnimatedVisibility";
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(836509870, i4, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:459)");
            }
            int i12 = MutableTransitionState.$stable;
            int i13 = i4 >> 3;
            int i14 = (i13 + 14) - (14 | i13);
            int i15 = (i12 + i14) - (i12 & i14);
            int i16 = (-1) - (((-1) - (i4 >> 12)) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION));
            AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.rememberTransition(mutableTransitionState, str2, composerStartRestartGroup, (i15 + i16) - (i15 & i16), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.9
                public final Boolean invoke(boolean z2) {
                    return Boolean.valueOf(z2);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                    return invoke(bool.booleanValue());
                }
            }, companion, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, ((i4 + 57344) - (i4 | 57344)) | (i4 & 896) | 48 | ((-1) - (((-1) - i4) | ((-1) - 7168))) | ((i13 + 458752) - (i13 | 458752)));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.10
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i17) {
                    AnimatedVisibilityKt.AnimatedVisibility(rowScope, mutableTransitionState, companion, enterTransitionPlus, exitTransitionPlus, str2, function3, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i2) & ((-1) - 1))), i3);
                }
            });
        }
    }

    public static final void AnimatedVisibility(final ColumnScope columnScope, final MutableTransitionState<Boolean> mutableTransitionState, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, final Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2, final int i3) {
        int i4;
        final String str2 = str;
        final ExitTransition exitTransitionPlus = exitTransition;
        final EnterTransition enterTransitionPlus = enterTransition;
        final Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-850656618);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(AnimatedVisibility)P(5,4,1,2,3)536@29773L39,537@29817L84:AnimatedVisibility.kt#xbi5r1");
        if ((i3 & 1) != 0) {
            i4 = (i2 + 48) - (i2 & 48);
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            i4 = (-1) - (((-1) - ((-1) - (((-1) - i2) | ((-1) - 64)) == 0 ? composerStartRestartGroup.changed(mutableTransitionState) : composerStartRestartGroup.changedInstance(mutableTransitionState) ? 32 : 16)) & ((-1) - i2));
        } else {
            i4 = i2;
        }
        int i5 = (i3 + 2) - (i3 | 2);
        if (i5 != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(companion) ? 256 : 128)));
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 3072));
        } else if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(enterTransitionPlus) ? 2048 : 1024)));
        }
        int i7 = (-1) - (((-1) - i3) | ((-1) - 8));
        if (i7 != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(exitTransitionPlus) ? 16384 : 8192)));
        }
        int i8 = (i3 + 16) - (i3 | 16);
        if (i8 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE));
        } else if ((196608 & i2) == 0) {
            int i9 = composerStartRestartGroup.changed(str2) ? 131072 : 65536;
            i4 = (i4 + i9) - (i4 & i9);
        }
        if ((i3 + 32) - (i3 | 32) != 0) {
            i4 |= 1572864;
        } else if ((-1) - (((-1) - i2) | ((-1) - 1572864)) == 0) {
            int i10 = composerStartRestartGroup.changedInstance(function3) ? 1048576 : 524288;
            i4 = (i4 + i10) - (i4 & i10);
        }
        if ((-1) - (((-1) - 599185) | ((-1) - i4)) != 599184 || !composerStartRestartGroup.getSkipping()) {
            if (i5 != 0) {
                companion = Modifier.Companion;
            }
            if (i6 != 0) {
                enterTransitionPlus = EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
            }
            if (i7 != 0) {
                exitTransitionPlus = EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
            }
            if (i8 != 0) {
                str2 = "AnimatedVisibility";
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-850656618, i4, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:535)");
            }
            int i11 = MutableTransitionState.$stable;
            int i12 = i4 >> 3;
            int i13 = 14 & i12;
            int i14 = (i11 + i13) - (i11 & i13);
            int i15 = (i4 >> 12) & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION;
            int i16 = ((i4 + 896) - (896 | i4)) | 48;
            int i17 = (i4 + 7168) - (7168 | i4);
            int i18 = (i16 + i17) - (i16 & i17);
            int i19 = (i4 + 57344) - (i4 | 57344);
            AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.rememberTransition(mutableTransitionState, str2, composerStartRestartGroup, (i14 + i15) - (i14 & i15), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.11
                public final Boolean invoke(boolean z2) {
                    return Boolean.valueOf(z2);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                    return invoke(bool.booleanValue());
                }
            }, companion, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (-1) - (((-1) - ((i19 + i18) - (i19 & i18))) & ((-1) - ((i12 + 458752) - (i12 | 458752)))));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.12
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i20) {
                    ColumnScope columnScope2 = columnScope;
                    MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                    Modifier modifier2 = companion;
                    EnterTransition enterTransition2 = enterTransitionPlus;
                    ExitTransition exitTransition2 = exitTransitionPlus;
                    String str3 = str2;
                    Function3<AnimatedVisibilityScope, Composer, Integer, Unit> function32 = function3;
                    int i21 = i2;
                    AnimatedVisibilityKt.AnimatedVisibility(columnScope2, mutableTransitionState2, modifier2, enterTransition2, exitTransition2, str3, function32, composer2, RecomposeScopeImplKt.updateChangedFlags((i21 + 1) - (i21 & 1)), i3);
                }
            });
        }
    }

    public static final <T> void AnimatedVisibility(final Transition<T> transition, final Function1<? super T, Boolean> function1, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, final Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2, final int i3) {
        int i4;
        final EnterTransition enterTransitionPlus = enterTransition;
        final ExitTransition exitTransitionPlus = exitTransition;
        final Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(1031950689);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(AnimatedVisibility)P(4,3,1,2)609@34120L79:AnimatedVisibility.kt#xbi5r1");
        if ((i3 - Integer.MIN_VALUE) - (i3 | Integer.MIN_VALUE) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (-1) - (((-1) - (composerStartRestartGroup.changed(transition) ? 4 : 2)) & ((-1) - i2));
        } else {
            i4 = i2;
        }
        if ((i3 + 1) - (i3 | 1) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            int i5 = composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
            i4 = (i4 + i5) - (i4 & i5);
        }
        int i6 = (-1) - (((-1) - i3) | ((-1) - 2));
        if (i6 != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i4 |= composerStartRestartGroup.changed(companion) ? 256 : 128;
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 = (i4 + 3072) - (i4 & 3072);
        } else if ((i2 + 3072) - (i2 | 3072) == 0) {
            int i8 = composerStartRestartGroup.changed(enterTransitionPlus) ? 2048 : 1024;
            i4 = (i4 + i8) - (i4 & i8);
        }
        int i9 = i3 & 8;
        if (i9 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 24576));
        } else if ((i2 & 24576) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(exitTransitionPlus) ? 16384 : 8192)));
        }
        if ((i3 + 16) - (i3 | 16) != 0) {
            i4 = (i4 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        } else if ((-1) - (((-1) - i2) | ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function3) ? 131072 : 65536)));
        }
        if ((74899 & i4) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i6 != 0) {
                companion = Modifier.Companion;
            }
            if (i7 != 0) {
                enterTransitionPlus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
            }
            if (i9 != 0) {
                exitTransitionPlus = EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1031950689, i4, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:609)");
            }
            AnimatedVisibilityImpl(transition, function1, companion, enterTransitionPlus, exitTransitionPlus, function3, composerStartRestartGroup, (524286 + i4) - (524286 | i4));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.13
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i10) {
                    AnimatedVisibilityKt.AnimatedVisibility(transition, function1, companion, enterTransitionPlus, exitTransitionPlus, function3, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i2) & ((-1) - 1))), i3);
                }
            });
        }
    }

    public static final <T> void AnimatedVisibilityImpl(final Transition<T> transition, final Function1<? super T, Boolean> function1, final Modifier modifier, final EnterTransition enterTransition, final ExitTransition exitTransition, final Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(429978603);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(AnimatedVisibilityImpl)P(4,5,3,1,2)697@38299L415,694@38181L703:AnimatedVisibility.kt#xbi5r1");
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(transition) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 + 48) - (i2 | 48) == 0) {
            int i4 = composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
            i3 = (i3 + i4) - (i3 & i4);
        }
        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changed(modifier) ? 256 : 128)));
        }
        if ((i2 & 3072) == 0) {
            int i5 = composerStartRestartGroup.changed(enterTransition) ? 2048 : 1024;
            i3 = (i3 + i5) - (i3 & i5);
        }
        if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changed(exitTransition) ? 16384 : 8192)));
        }
        if ((-1) - (((-1) - i2) | ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE)) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function3) ? 131072 : 65536;
        }
        if ((74899 & i3) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(429978603, i3, -1, "androidx.compose.animation.AnimatedVisibilityImpl (AnimatedVisibility.kt:693)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 689212639, "CC(remember):AnimatedVisibility.kt#9igjgp");
            int i6 = (-1) - (((-1) - i3) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION));
            int i7 = (i3 + 14) - (14 | i3);
            boolean z2 = (i6 == 32) | (i7 == 4);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (Function3) new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                        return m404invoke3p2s80s(measureScope, measurable, constraints.m6597unboximpl());
                    }

                    /* JADX WARN: Type inference incomplete: some casts might be missing */
                    /* JADX INFO: renamed from: invoke-3p2s80s, reason: not valid java name */
                    public final MeasureResult m404invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
                        long jIntSize;
                        final Placeable placeableMo5514measureBRTryo0 = measurable.mo5514measureBRTryo0(j2);
                        if (measureScope.isLookingAhead() && !function1.invoke((T) transition.getTargetState()).booleanValue()) {
                            jIntSize = IntSize.Companion.m6813getZeroYbymL2g();
                        } else {
                            jIntSize = IntSizeKt.IntSize(placeableMo5514measureBRTryo0.getWidth(), placeableMo5514measureBRTryo0.getHeight());
                        }
                        return MeasureScope.layout$default(measureScope, IntSize.m6808getWidthimpl(jIntSize), IntSize.m6807getHeightimpl(jIntSize), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1.1
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
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            int i8 = 196608 | i7;
            int i9 = (-1) - (((-1) - ((i6 + i8) - (i6 & i8))) & ((-1) - (7168 & i3)));
            int i10 = (-1) - (((-1) - 57344) | ((-1) - i3));
            int i11 = i3 << 6;
            AnimatedEnterExitImpl(transition, function1, LayoutModifierKt.layout(modifier, (Function3) objRememberedValue), enterTransition, exitTransition, new Function2<EnterExitState, EnterExitState, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibilityImpl.2
                @Override // kotlin.jvm.functions.Function2
                public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
                    return Boolean.valueOf(enterExitState == enterExitState2 && enterExitState2 == EnterExitState.PostExit);
                }
            }, null, function3, composerStartRestartGroup, (-1) - (((-1) - ((i9 + i10) - (i9 & i10))) & ((-1) - ((i11 + 29360128) - (i11 | 29360128)))), 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibilityImpl.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i12) {
                    Transition<T> transition2 = transition;
                    Function1<T, Boolean> function12 = function1;
                    Modifier modifier2 = modifier;
                    EnterTransition enterTransition2 = enterTransition;
                    ExitTransition exitTransition2 = exitTransition;
                    Function3<AnimatedVisibilityScope, Composer, Integer, Unit> function32 = function3;
                    int i13 = i2;
                    AnimatedVisibilityKt.AnimatedVisibilityImpl(transition2, function12, modifier2, enterTransition2, exitTransition2, function32, composer2, RecomposeScopeImplKt.updateChangedFlags((i13 + 1) - (i13 & 1)));
                }
            });
        }
    }

    public static final <T> void AnimatedEnterExitImpl(final Transition<T> transition, final Function1<? super T, Boolean> function1, final Modifier modifier, final EnterTransition enterTransition, final ExitTransition exitTransition, final Function2<? super EnterExitState, ? super EnterExitState, Boolean> function2, OnLookaheadMeasured onLookaheadMeasured, final Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier.Companion companionLayout;
        final OnLookaheadMeasured onLookaheadMeasured2 = onLookaheadMeasured;
        Composer composerStartRestartGroup = composer.startRestartGroup(-891967166);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(AnimatedEnterExitImpl)P(6,7,3,1,2,5,4):AnimatedVisibility.kt#xbi5r1");
        if ((i3 + 1) - (i3 | 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 + 6) - (i2 | 6) == 0) {
            int i5 = composerStartRestartGroup.changed(transition) ? 4 : 2;
            i4 = (i5 + i2) - (i5 & i2);
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 = (i4 + 48) - (i4 & 48);
        } else if ((i2 & 48) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function1) ? 32 : 16)));
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(modifier) ? 256 : 128)));
        }
        if ((i3 + 8) - (i3 | 8) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 3072));
        } else if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            int i6 = composerStartRestartGroup.changed(enterTransition) ? 2048 : 1024;
            i4 = (i4 + i6) - (i4 & i6);
        }
        if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
            i4 = (i4 + 24576) - (i4 & 24576);
        } else if ((i2 + 24576) - (i2 | 24576) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(exitTransition) ? 16384 : 8192)));
        }
        if ((i3 + 32) - (i3 | 32) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE));
        } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            int i7 = composerStartRestartGroup.changedInstance(function2) ? 131072 : 65536;
            i4 = (i4 + i7) - (i4 & i7);
        }
        int i8 = i3 & 64;
        int i9 = 1572864;
        if (i8 != 0) {
            i4 |= i9;
        } else if ((i2 + 1572864) - (i2 | 1572864) == 0) {
            i9 = (i2 + 2097152) - (i2 | 2097152) == 0 ? composerStartRestartGroup.changed(onLookaheadMeasured2) : composerStartRestartGroup.changedInstance(onLookaheadMeasured2) ? 1048576 : 524288;
            i4 |= i9;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 128)) != 0) {
            i4 = (i4 + 12582912) - (i4 & 12582912);
        } else if ((i2 + 12582912) - (i2 | 12582912) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
        }
        if ((4793491 + i4) - (4793491 | i4) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i8 != 0) {
                onLookaheadMeasured2 = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-891967166, i4, -1, "androidx.compose.animation.AnimatedEnterExitImpl (AnimatedVisibility.kt:737)");
            }
            if (function1.invoke(transition.getTargetState()).booleanValue() || function1.invoke(transition.getCurrentState()).booleanValue() || transition.isSeeking() || transition.getHasInitialValueAnimations()) {
                composerStartRestartGroup.startReplaceGroup(1787977937);
                ComposerKt.sourceInformation(composerStartRestartGroup, "741@39659L116,745@39818L40,752@40073L399,747@39898L574");
                int i10 = (-1) - (((-1) - i4) | ((-1) - 14));
                int i11 = i10 | 48;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1215497572, "CC(createChildTransition)1813@74138L36,1814@74198L74,1815@74295L39,1816@74346L63:Transition.kt#pdpnli");
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 272027253, "CC(remember):Transition.kt#9igjgp");
                int i12 = i11 & 14;
                boolean z2 = true;
                boolean z3 = ((i12 ^ 6) > 4 && composerStartRestartGroup.changed(transition)) || (i11 + 6) - (i11 | 6) == 4;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z3 || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = transition.getCurrentState();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (transition.isSeeking()) {
                    objRememberedValue = transition.getCurrentState();
                }
                composerStartRestartGroup.startReplaceGroup(-466616829);
                ComposerKt.sourceInformation(composerStartRestartGroup, "C742@39737L28:AnimatedVisibility.kt#xbi5r1");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-466616829, 0, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:742)");
                }
                int i13 = i4 & 126;
                EnterExitState enterExitStateTargetEnterExit = targetEnterExit(transition, function1, objRememberedValue, composerStartRestartGroup, i13);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceGroup();
                T targetState = transition.getTargetState();
                composerStartRestartGroup.startReplaceGroup(-466616829);
                ComposerKt.sourceInformation(composerStartRestartGroup, "C742@39737L28:AnimatedVisibility.kt#xbi5r1");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-466616829, 0, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:742)");
                }
                EnterExitState enterExitStateTargetEnterExit2 = targetEnterExit(transition, function1, targetState, composerStartRestartGroup, i13);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceGroup();
                Transition transitionCreateChildTransitionInternal = androidx.compose.animation.core.TransitionKt.createChildTransitionInternal(transition, enterExitStateTargetEnterExit, enterExitStateTargetEnterExit2, "EnterExitTransition", composerStartRestartGroup, (i12 + 3072) - (i12 & 3072));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                int i14 = i4 >> 15;
                State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function2, composerStartRestartGroup, (i14 + 14) - (i14 | 14));
                Boolean boolInvoke = function2.invoke(transitionCreateChildTransitionInternal.getCurrentState(), transitionCreateChildTransitionInternal.getTargetState());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1581710007, "CC(remember):AnimatedVisibility.kt#9igjgp");
                boolean zChanged = composerStartRestartGroup.changed(transitionCreateChildTransitionInternal);
                boolean zChanged2 = composerStartRestartGroup.changed(stateRememberUpdatedState);
                boolean z4 = ((zChanged ? 1 : 0) + (zChanged2 ? 1 : 0)) - ((zChanged ? 1 : 0) & (zChanged2 ? 1 : 0)) == 1;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z4 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = (Function2) new AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1(transitionCreateChildTransitionInternal, stateRememberUpdatedState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                State stateProduceState = SnapshotStateKt.produceState(boolInvoke, (Function2) objRememberedValue2, composerStartRestartGroup, 0);
                if (getExitFinished(transitionCreateChildTransitionInternal) && AnimatedEnterExitImpl$lambda$4(stateProduceState)) {
                    composerStartRestartGroup.startReplaceGroup(1790256282);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1788869559);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "768@40570L69,773@40810L47,794@41913L50,769@40652L1325");
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1581725581, "CC(remember):AnimatedVisibility.kt#9igjgp");
                    boolean z5 = i10 == 4;
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (z5 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                        objRememberedValue3 = new AnimatedVisibilityScopeImpl(transitionCreateChildTransitionInternal);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    AnimatedVisibilityScopeImpl animatedVisibilityScopeImpl = (AnimatedVisibilityScopeImpl) objRememberedValue3;
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    int i15 = i4 >> 6;
                    int i16 = (-1) - (((-1) - i15) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION));
                    int i17 = (i16 + 24576) - (i16 & 24576);
                    int i18 = i15 & 896;
                    Modifier modifierCreateModifier = EnterExitTransitionKt.createModifier(transitionCreateChildTransitionInternal, enterTransition, exitTransition, null, "Built-in", composerStartRestartGroup, (i17 + i18) - (i17 & i18), 4);
                    if (onLookaheadMeasured2 != null) {
                        composerStartRestartGroup.startReplaceGroup(1789227361);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "775@40967L849");
                        Modifier.Companion companion = Modifier.Companion;
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1581739065, "CC(remember):AnimatedVisibility.kt#9igjgp");
                        if ((3670016 + i4) - (3670016 | i4) != 1048576 && ((i4 + 2097152) - (i4 | 2097152) == 0 || !composerStartRestartGroup.changedInstance(onLookaheadMeasured2))) {
                            z2 = false;
                        }
                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (z2 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                            objRememberedValue4 = (Function3) new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$2$1
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                                    return m403invoke3p2s80s(measureScope, measurable, constraints.m6597unboximpl());
                                }

                                /* JADX INFO: renamed from: invoke-3p2s80s, reason: not valid java name */
                                public final MeasureResult m403invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
                                    final Placeable placeableMo5514measureBRTryo0 = measurable.mo5514measureBRTryo0(j2);
                                    OnLookaheadMeasured onLookaheadMeasured3 = onLookaheadMeasured2;
                                    if (measureScope.isLookingAhead()) {
                                        onLookaheadMeasured3.m435invokeozmzZPI(IntSizeKt.IntSize(placeableMo5514measureBRTryo0.getWidth(), placeableMo5514measureBRTryo0.getHeight()));
                                    }
                                    return MeasureScope.layout$default(measureScope, placeableMo5514measureBRTryo0.getWidth(), placeableMo5514measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$2$1$1$1
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
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        companionLayout = LayoutModifierKt.layout(companion, (Function3) objRememberedValue4);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(1581766416);
                        composerStartRestartGroup.endReplaceGroup();
                        companionLayout = Modifier.Companion;
                    }
                    Modifier modifierThen = modifier.then(modifierCreateModifier.then(companionLayout));
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1581768538, "CC(remember):AnimatedVisibility.kt#9igjgp");
                    Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                        objRememberedValue5 = new AnimatedEnterExitMeasurePolicy(animatedVisibilityScopeImpl);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    AnimatedEnterExitMeasurePolicy animatedEnterExitMeasurePolicy = (AnimatedEnterExitMeasurePolicy) objRememberedValue5;
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM3671constructorimpl = Updater.m3671constructorimpl(composerStartRestartGroup);
                    Updater.m3678setimpl(composerM3671constructorimpl, animatedEnterExitMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                    if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 254461613, "C770@40694L9:AnimatedVisibility.kt#xbi5r1");
                    function3.invoke(animatedVisibilityScopeImpl, composerStartRestartGroup, Integer.valueOf((-1) - (((-1) - (i4 >> 18)) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))));
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1790262234);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final OnLookaheadMeasured onLookaheadMeasured3 = onLookaheadMeasured2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt.AnimatedEnterExitImpl.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i19) {
                    AnimatedVisibilityKt.AnimatedEnterExitImpl(transition, function1, modifier, enterTransition, exitTransition, function2, onLookaheadMeasured3, function3, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i2) & ((-1) - 1))), i3);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getExitFinished(Transition<EnterExitState> transition) {
        return transition.getCurrentState() == EnterExitState.PostExit && transition.getTargetState() == EnterExitState.PostExit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> EnterExitState targetEnterExit(Transition<T> transition, Function1<? super T, Boolean> function1, T t2, Composer composer, int i2) {
        EnterExitState enterExitState;
        ComposerKt.sourceInformationMarkerStart(composer, 361571134, "C(targetEnterExit)P(1):AnimatedVisibility.kt#xbi5r1");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(361571134, i2, -1, "androidx.compose.animation.targetEnterExit (AnimatedVisibility.kt:855)");
        }
        composer.startMovableGroup(-902048200, transition);
        ComposerKt.sourceInformation(composer, "");
        if (transition.isSeeking()) {
            composer.startReplaceGroup(2101296683);
            composer.endReplaceGroup();
            if (function1.invoke(t2).booleanValue()) {
                enterExitState = EnterExitState.Visible;
            } else if (function1.invoke(transition.getCurrentState()).booleanValue()) {
                enterExitState = EnterExitState.PostExit;
            } else {
                enterExitState = EnterExitState.PreEnter;
            }
        } else {
            composer.startReplaceGroup(2101530516);
            ComposerKt.sourceInformation(composer, "868@44365L34");
            ComposerKt.sourceInformationMarkerStart(composer, -902039492, "CC(remember):AnimatedVisibility.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (function1.invoke(transition.getCurrentState()).booleanValue()) {
                mutableState.setValue(true);
            }
            if (function1.invoke(t2).booleanValue()) {
                enterExitState = EnterExitState.Visible;
            } else if (((Boolean) mutableState.getValue()).booleanValue()) {
                enterExitState = EnterExitState.PostExit;
            } else {
                enterExitState = EnterExitState.PreEnter;
            }
            composer.endReplaceGroup();
        }
        composer.endMovableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return enterExitState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function2<EnterExitState, EnterExitState, Boolean> AnimatedEnterExitImpl$lambda$2(State<? extends Function2<? super EnterExitState, ? super EnterExitState, Boolean>> state) {
        return (Function2) state.getValue();
    }

    private static final boolean AnimatedEnterExitImpl$lambda$4(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
