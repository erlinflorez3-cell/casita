package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.tokens.AssistChipTokens;
import androidx.compose.material3.tokens.FilterChipTokens;
import androidx.compose.material3.tokens.InputChipTokens;
import androidx.compose.material3.tokens.SuggestionChipTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.google.firebase.messaging.Constants;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
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
/* JADX INFO: compiled from: Chip.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яĉ\u0014D߬)\u001e\u007f\u007fLDit\fA\u001c0\u0013.H~*, \u0004\u000ffp;8D{H6Ri*\u0017k\u00025,[2qKП]\u001a\u0014\"\u0011ѧVg}nRҙ\u0013C%\u0006\u001eюr,W^\u0001]\u0018\u0010:B\u0006?;Mu=A`\u000b6\rړ:\"Ny\rЏ\"*^\u0010~ٙKK\"\u00128@v;Z\rc\u0005\"Ň\u000e>6\u0001&\\mY>H\u0003]B/9\u0003qBT6w݇{[\u001b^TU\u001c'k,;X=E\u00175S1\u0016\u0001lo\u0012M\u0004U\u0010x)7+w\u0003\u0006Gݼ\u0004\u0014\u001b>\u007f\u0013cr4p\u001dQ\u000f!W1UcYf&(&\u0012, B\u0004\u001c\u001e?U>/*f6\u001dIs!dĖT\u0002dU0\u000eg6%>\u0018@;;+f\u007fpQ\u0018|H߉\t\r$61t'[b(x\u0015Io(W7QNY`N8cmu\npp\u001fB\u0006FF.M,\u00194\u00173Vs;9 \u001a\"xLmv\u0013\u0002\u0001U\u007fQvbhsގ;*\u0017/r\u058cc\u0013yhT\u0007;AW*d\u001f\u0004\u0018\u00150\\&KO6@]]z\u0002u]_\u001a%]uejˇo\u000e]L\u000f9;Qq$yR%)oBh\u0005f|ZS:q\r;(2V\u0003(\u0005\fF^\fAAUpJEϜ5\u0019b(x\u0016$BO\u0016!ljj ~\u0003B:\u0002\u00185ڲ\r\u0001Vo!umxWF\u0015`PHqW;\u00194q:hb\u0007S\u000f\u0005s\u000ed\u007fN]K\u001b4&]\u0002 $9QSE<A3//8\u0002;fdr\u0014s\u0014\u0017ؠ~|\b4SĘ-u.\u0003pZo\u001bN]h/\"%s#-\u0016t\u0018\u007fqH\u000bG\u0012c9lnM\u0001\u0019q<|O-\u0014-0=\f\u007f$\r5[RU.ə{\u00145(\u0012aw\u0017Fy\u00117Vxs-DcD\u001a\u0013bkJSEY[\u000f>P3\u0003\u0002pYܖ{\bH\u001cd\u001eAaYq\u0001XHM9>\u0014e5=ޛtVaMCs\fNF_X\u000fs\u0002\"z[%?W\u0004m{\u000bc^!I=(;\u0002?\u000e*\u001eS\u001f\u0005w\u0013\r>1\f\u0018dCkf\u0013h!$b+l\u000e\u0019dlk\u001c\u000f)\"\r`̎\u0016Ϩ¡w=\\;b'tƜG\u0013\u0010]`O91\u000e\u001dE6\u0004E3\u0015mtc]t҅\u0005S#\u001cKn]&~%Yl\u0005=)Qp\u00019o\u000eTW\u001aN\u0011W+}k\u001e\u001bN\u0017+.Ð\u001c\u001b?dAp\u0005`v\u0018ef^d%!|Q|3Ĺ\u0003z\u0003!l\u001b\u001d$1\\\u0003qr-z]\u000e6q+ݨ\u001bD/\u001a<\u0001qw3-4_]AW\u001d,'*\u0002\u0004?\f38 U\u0006%%j\u0004&f8\\a;мpдȫ\u0006\u000b\u0019\u0004.8Fئs\u0001?F\bd^2=\u0010#v_{y1@U:\u001b\u0017rZv\u000b\"n|e~U9\u0012\u0015Bٟ}n3cM\u000f-M<'pZh&\u0004&^\u0011\u000e*-&MM8u/\u0010]{\u0001}{Qk\rY>\u0002)\u0010BëV\u001e\u00042*\t\n*bA-HfONd7k\u0003A\u0006\u001f߿n(j\b</\u001a|\rbv\u0011AOvx$d=S1\u001f\n\u0017wh\r\u0004Sf>#GQm9g:\u0011o6\u0016)\u0005Pa# ZJ\u000fr\u000e\tD/\\Sk<m^ޡqd\u0011IcԾ7P=D\u0011< _dF0Vb*\u001eKQaPG\"1$F\u0018\b\u0012)7zQ\u00024X\u0012Ϙ\u0005\rE\raq@sE\u0007;/=\u0005K]l;3K}LU#2xP~[{n\u001cq.Y5s-\u0010Tn\u0011ˌ#$*\u0019&6\u0006E?aBllBfs\u0006\u0013<)d\u007f\u07b2'Gr\f$\u00102i&\u000e|[\u0010Oq\u0001\u001a\u0019RZB-\u001b\u0011uUny\u0019a%G*6=$Y;\u001d|\u001en\nBAH!q_bc<!\u0015\u001c:`\u0004|~üDY8+EËSq!\u0003m\u007fn@< D%\u0004&H\u0003j\u000ep5\u001e7M\u0007Fdk'^qq\u0019R'/n0R\f9\u0015D?Ц\u001b\u0002\u0004]\u0011\u001b\u00193U\bYG@k,'#\u0011i;\u001e%\u0016\u0002wR[qfUQ@\u001boZXctr\u0004\u00042ʢh+\u001b\u0013\u001b>4GdW27h\b\u001eE\u0013W&C'Uڍq06C\u0001\u0005`Ck\u001b4\u001fkpEk\u00052pSsd?cg_tRc@Ez\u0018\u0002>zI\u001b\u0011\u001eaXJ%\n\f_^,\u0010bIc\u001e\u0006K&\u0002\u0010lg4ωC/O\u0006\u0005ɱdMTo?-\u001bP12\u0016+*ri#i<1\u000e\u0014|Ed;`Vi\u0013vB\u0019\u001e)\u0006\u07be2\f>h6C\f\u0011p0M;\u000eU\\4v\tUe\u0003{X| yzY[\u0002C\u0003)@Aq?re^B\u007fӐ`XD*\b,F\u0013\u001045&\u0010\u0017x/6\u0017c\u007f\u0006j\"^\u0011\u0019_4yM|{\te\u0013\\\u0014FBHz8~Q\u0014\u001a\u007fd\u0013\u0011fpVb(d\u0003+UX\u000fo\u07fb\u0005\u0001Y\u001f/֟6R2;gaIRk0cu+WL\u0016\u000e\u0019p&&,lAH%z<~%\u0005lu!\u0015ɂ\tM6\u0017\u001c58FhT4-\t<\u001en\u000e*\u001c\"\u0015\u0005Z\u0006\u0004eWu-/|\f3 *A\u0006H] A\u0014ƨ@\b8`\t\u0001tXj?F{4:BH\u00025z]\f{aa\"W:],F\u0016k\u000e\u001f;\nB\fiJ1n\u0002d'\\\\q(\r_<gb\u001a\nPKj\rƜ+\u0002Vrbߏ!1@'6FY\u0017r\u0007\\!e:F%\u007f\u001cB\u0006D\u0004hmgbPkf\u000e\u000eS?G|\u0018MYm-:u\u001fʋ\u001a:U_\u001e{a=b*J\u0007\u001e\u0019a\u0016y`iX/w6yd~@{U\u001b,w[0*Z\u0015}\u0003u~rшA\u0016\u0013'5Qy)1Y=lpi\u0010;7\u007f36\u007fVڻ\u000fD\u0017;\u00118D\u0012\u001dbpf<62\u000bQd(2QE'x{\u001da\u0004u\u0001i$}G\u001aa_\u0012}\u0016D<\u00187O\f\"p\u000f=m^\u0017v;\u0010=m}*85ߐK]hZGى\u0007\u001c\u000b~L~\u001cq\u000bze\u000fv!.o\u001f\u0010:](-Eu\u0019\u0016\u0014d}klve|\u0006.pk[U?,\u0017í\u0017A%)>*\u000e\u007f\u0003oLO$\u0016pN\u0019\f(YF\bB\u001c\u0016_\u000b5\u0018YILcr)+&ntA3\u001eۚ%(\u0011+Xtr\u0013}E@/S\u0015\u0007\u001b\u001c\u0018&\u001bw6ï1Q|\u000eJE\u0016 c)W\u0017#dnw.0_/^\u0005֝QLs\u0011^puj\u0006x(O W\u000e\u0005}6SD(&\u0001sDjbD5x@F-\rLXZ,8\f|O3^~|\u001e\u0017\u0003j\u0018`B\u0010MZV4YEG+ދ\u0005\t1\u001fCý=g\u0018^d=u'TQIvtl\u0001-\f?1\u001c\u0006yzb&GY\u0012'{6P\"XqB5\u0016\u0010\u001bbh-HM\u0010K0KT&\u00042\u000f\u0017?O\u0019\u0006Ӏ3F\u0017\u00069t?Ya_\u000bG\\o7\t\u0004\u0007?RbA{}E\u0019E7Ͳe7)^\u00163*u\u007fJY'%\rMy\"s1.Ǧu\\d=o\u0013\u0014=,O\u000f8\u0001C\u0019M\f\u001bb%Ș&boG^FpiB\u0016@\u0001~+e\u000e|\u0013\u0010l.@[7\u001a`_\u0006;_S3\u0019:B\u0005bC\u007fS\u001dgU\u0001\u000f\\;\u0011aAwsHL$y.\"@\u0013Xy\t`\u001aX\f\u0001ˮ(ܛǽ54\bO^\u0011\bւ/WWd\u000bp!C<N.\u0018!fhY4v\u0005\u000bG\u001dlR;\u0016\u0019v8}>:\\sgÍ\n6#r\u001b\u0005yvdz+?E'F\u0003\u0005<{{\u001deT:ZY\u0006SA\u001e\u0014dcl\u001fHEAz3p%а\u000f\u001e0gP\u0011\u0011OuN68z\u0014vTKa\u0013J:\u001a\u00112=6vo^Wp\u0003sEgYM{Z`G\u0011xxm&~\tg\u001e\u0011q@ddat [\u0002Q\u0018\u00ad!S!\u0011\u001aĳ,`\u0001OG\b\u0017\bPz\u0018F%Uk/o3G\u001dP{y$9Wb\b]p*n\u001319ٓH ,%W\u0013D=,\u000b,6U\u001a;]Vd\u0010\tb\u001aC\u0003\u0001\u001c=\u0012Sy[bp]\u0002;Sm`\u000b?6݉3\t <\u0018r,t#\t|\f\u007fT\u000e67Pp&\u0002Q\u001c\u001a+\u0005\"4$?q\u0014W\u0015I\u0007QAMgWRM\u0006$O~\u0014/7^ty\u000fzXBTI#̅>x\u0016)p\t'Bpn\u0011E[e4F'W:-X}(V/9.+\u0001\u0001$\n\nk\u001c^5<O]-\u00176gerUΡeeNt)ҋ\u001eÕXl\u0017ښ\u0019`S<|vp+\u0019;x\u008b\u0010\fXԙX-HL\u0012(\u001b*\u001cɝrƝ`dRN_\u00141\u007fh\u0001<~\u000fB\u0015ǲFϨ\u000b\u001b\u001bˈ7\u0007\u0018w%Yf\u0012Kɧ\u0018ѝ]a)؏\u0002F\u0003r\u00193I\u0012ZɄ1˕`[pΏJ\u0002w\u0014D0RHB̀\"Ղ%\u0011+Â,MWi\u0013y\u000fkRC5\u0010\\U\u001eծLʨLr\u0019BfzdDޫ'3~u\rװ(\u001b\u0019\u0380o\u001b"}, d2 = {"\u000frb6f;\u001cV\u001d\neZ+{\r8g", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u0001*LB?t6\u000f\u0011oq9\u00159", "\u0014h[AX9\u001cV\u001d\neZ+{\r8g", "\u0016na6m6Gb\u0015\u0006Ze,\u0005\t8t\u000e\u0013w?\u007f\u001b I", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "\u0014", "\u001a`Q2_\u0013:g#\u000f\nB+", "", "\u001adP1\\5@7\u0017\t\u0004E(\u0011\u0013?tc'", "!tV4X:MW#\bXa0\bs+d~,\u0005B", "\"qP6_0GU||\u0005g\u0013x\u001d9u\u000f\fz", "2dU.h3MA)\u0001|^:\f\r9n]+\u007fK^!\u001eQ|\u001c", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T(9d[*>w#<#", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T/<c\u000b\u000e5p\u00166M\u0019", "5dc\u0011X-:c \u000ehn.~\t=t\u00042\u0005\u001e\u0004\u001b\"%y\u0015F\u00043", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0003?`\b-%k\u0019.UC\u0011/\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001cz9#\u0012g\u0012J2ZN7D(y\"A&\u00129WW", "\u000frb6f;\u001cV\u001d\n", "", "=m29\\*D", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", ":`Q2_", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "3mP/_,=", "", ":dP1\\5@7\u0017\t\u0004", "BqP6_0GU||\u0005g", "AgP=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "1n[<e:", "3kTCT;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T(9d]'7~\u0012=QMDA", "0na1X9", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0002?f| D[%;WI;A", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005SD-\u0011eh9jl;N\u0004#E[R6e@|M!\u0010Zc", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u0007=w%5QL\u0005pE&^iqB\u0005r0X\u007f5\u0011-^5ZavG\u001d^0tJ4\f\u0012cE#\u0002\u000e5)\u00107S\u0010;2\u0011\u0010_u?itCZ\u0010TO\n\\G3wM]hCLRM,+t\u0015],`DC2]R)$f_2\u0014\u0005 fYX\u0004vnK\"D=5F7\\VNmd@~0-\u0015\\\b\u001b0gx5}yY\u001b&?c\u0012Uk\u0017Q(v\u001f4gK5&\u007fL\u0017\tMpqwA\u0012f-+u\u0011^@1nLalG\u001c\u0011a\u0016n~_i\tB\\\u0014>\u0013w\u00116F\fFW\u0001bRd'qp'M\"^\u000e(F+\u001eh\u0010\u0010\rj\u0017/w\u0014Ga\u001ar8_\u0001U\u000f\u0018hE\u0010w`\u0011^NK\u0014x+y[hk3:\u0003\u001a\u001f\b/T;\u0004\\Gn#_2\u000b\u0013\n'\u0002i\fz@#.$9h<lixgq`!\u0019t&+,77\u0002('jgv4\u001f\u0002\r{F\u0013gFC\fAA\u0013k,LlJ\u0001K^\\\u0019uQ\u001e>`\u0002\u0012@jw?S8u\u0010\u0013'u\u001a\u001c\u0010/\u0005G,c\u0019>j\u0016\u0015wy-<\u0019\u0001.5\u0012V\u0012{RL\u0019\u0011%-\u000f\u0018-Pv\u0015\u0016\u000e9LIRPvh\u0011\u0012\u0006_\u0010@XDOG\u001e^d\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T(9dZ*Dl\u0016;#", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u0007=w%5QL\u0005pE&^iqB\u0005r0X\u007f5\u0011-^5ZavG\u001d^0tJ4\f\u0012cE#\u0002\u000e5)\u00107S\u0010;2\u0011\u0010_u?itCZ\u0010TO\n\\G3wM]hCLRM,+t\u0015],`DC2]R)$f_2\u0014\u0005 fYX\u0004vnK\"D=5F7\\VNmd@~0-\u0015\\\b\u001b0gx5}yY\u001b&?c\u0012Uk\u0017Q(v\u001f4gK5&\u007fL\u0017\tMpqwA\u0012f-+u\u0011^@1nLalG\u001c\u0011a\u0016n~_i\tB\\\u0014>\u0013w\u00116F\fFW\u0001bRd'qp'M\"^\u000e(F+\u001eh\u0010\u0010\rj\u0017/w\u0014Ga\u001ar8_\u0001U\u000f\u0018hE\u0010w`\u0011^NK\u0014x+y[hk3:\u0003\u001a\u001f\b/T;\u0004\\Gn#_2\u000b\u0013\n'\u0002i\f\u00022\"%2AU?0*\r\u000ek^~#t7\u001c,\u0003\u0018}[?{h{&(G\fr\u0005 gL8K4KYs!8rO\u000fE$V\u0019;M\"+^\u0004\u001aLd=\u001dZ}\n|\u000b+\\\u001c+,3qE.k%8T\u0016\u001c\u0017m\u001d\u0005\u0002|aM#W\u0017m[\u0012\u0018\bc:\u000f\u001e\"\u0010u%U\u0010-K:\u0018&\u0001'>\u0012\fT\u0013\b<\u001b]'+", "\u0011gX=", ":`Q2_\u001b>f(l\nr3|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4#h\u0012'7C", ":`Q2_\nHZ#\f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", ";h]\u0015X0@V(", ">`S1\\5@D\u0015\u0006\u000b^:", "\u0011gX= 5DC\"mZl", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@\u0004*Ft\u001a7\u0017HLs}\u001f%q_H\u000bm5\\@\bWUL;`\\{\bi\u0007A\u0014X:\u0014\tb\u000b)\u007fL\u0001 \u00185G\u0011?r\n\u001a_nEsnQZ\u001aPFj\\=2gSccxZ\u000bCl2o\u0016m\u001d&J>m#q,*2?.\u001d\u000bA \u0007Yy=L.\u001f\u0005G+Bv%KVw\u001f=\u00050\u001dZ\u007f\u0002\u001b@\"U;}+\u001384?1Z2m\"Me|\u001euaR/o7L\u001c=Zg\u007fuLWI/j\u0006\u001df?:e;L_Q\u000e\u0014g\u001bZH+]\u000b?]\u0010LI9%+\u0010\u0001OW\u0005\u0018\r\u000527SL?&TV\u0001lM!l\u001b\u0007\u0002ya\u001a8\u001eHc\u001dhsg3\\\u0013\u0016l4\u0013I#!\u0018tSmwR|heE\u000b2\u0002\u0010V+7JO@PMw\u001b B\u0001T\u0007\u0019\u0003iO}2\u001arn\u001b\\<m@6\u000bxO1\u001dqAq\u0006):\u0001_Jr]\u000bp\u0013\b\u0016s\u0007#]\b9\fCJHf1@mTN\u0019d_\u000f,Z\u0003>m~\u001cB1T\u001cFw\r\r\u000e/w&e*0}R)u\u001bxg\u0016\u001c\u0013n\u0019>\u001f\u000ba\u0018\u001dI'xXWchW.\u0004\u0014+HY\u0011S\u0011)Q\u00105D\u007f\u001e@\u0012\u0002S\u0019{VA\u0002nD\t!jB\u001c\u0016\u0011O\u0003.I%d_}\u0001{N<]O1\u0010~_\t}^J\u00115'\u001ad^Tux~Rs\u000e\u000b5\u0004\u0006I{p\u000f\u0012\u001bV~\u001c>\u00010hZ1k\u0001)G\u00166SG(Eyw(\u000eg0P~Z\u000f\u001a99>P* \u0016\u000f", "\u0011gX=66Gb\u0019\b\n", "/uPAT9", ":dP1\\5@7\u0017\t\u0004<6\u0004\u0013<", "BqP6_0GU||\u0005g\n\u0007\u00109r", "\u0011gX=66Gb\u0019\b\n&-|S\u0019Dy\f", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu^zpVLa;&ArP#\u007fi\"U+bi@G.}K;(Q1Z\n\u0005i\u0011\u0015\u0014\u001d9tyP pW\u0003\u0013\u0005E3q\u0013/F\u007fQPLf3.\u0011p%&;J-\u0012\u0001\u001d%q^wj\f\\\u000f\u0002V\u0004p4\u001d\u007f\u0001B3Eqd\u0010J\u0001]\u0006u7(I\u000b{\u001c;f>\f\u00056\u0002C.@mQ!L|\u001fEt\u001e+iK+%I\u0006\u0011ISn\u007fz>Wi)q\u0011\r^D5#n/jD#\u0011m&% ]^\u007f;[\b/Ev%'TT)W\u0003\u0014\u0016\u0011(lx\u0013A%\\\f$~Dkl!\f\u0012j \u001cwsGa\u001ar8_D#vLY", "\u0013kTCT;>Rt\r\tb:\ff2i\u000b", "\u0013kTCT;>Ry\u0003\u0002m,\nf2i\u000b", "Ad[2V;>R", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d%<Y{/3j\u001d.+F?v\u0012(\u001crnG\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d%<Y{/3j\u001d.+F?v\u0014%\u0015y]H\u000bm5$", "uY;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu\u001es =TGD59/\u001d2bI\u0010a;R\u00010U\u0016/<eP\u0002A\u001e\u001b'c5'\u0016\u0004fK(mW\u0001\u001d\u00124T\fIhJ\u001c\u001aW\u001dtoFW\u0014G\u0007jj(/rU`c\u0003\u0011FVjse\u001ch\u001bk>D-\";y+qN=\u000e\u0006\\]H9\u007fqvN\u001d\u0004\u0002)Ou%GUxSKx1(YEX\";V\u0004/~6P\n\u00112m\u0004Xq\u001c=qB\u00136dL146\u0006#C\u0015e\u0003hI\u0011l\u001doQ{e1<\u0019;L_Q\u000e\u0014g\u001bZH+]\u000b?]\u0010LI9\u001d#U~O_u\u001cVP\u0012mlIA*P}!p\"%c\u001c`\rm\")<k$U\u0018g7i;L&RfB\u0014\u0007cQ\u0015:P\f|K\u007f_Svq\u007ff\u0011P!1Z8sYCM\u0013\u001a?`\u0012~.oxF\u0004?h\f!FXEld.\u001e1Q,!rB*\u001fv2\fbImZ\u0007+\u001f\u0007WE\u0007\"\\>EoBNSp\"\u0012JG\u000e;g\\\u0014+`^-j|!Lis~Kx\u001e\t\u0003'\b\u0017&5oyP.g(+d\u001b\u0010\u0014xf\u0017+\u0010TK\u001dMvwWH'yY>\t\u001a+4r%Y~)\u0019!JQu,=\f|gO0b?\u0005mHzj.Q\u001b\u0015\fX\u0007h#%c!\u0004\u0006l[\u0005E5\u0006Oe", "\u0013kTCT;>R\u0007\u000f|`,\u000b\u00183o\t\u0006~D\f", "7b^;", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u0007=w%5QL\u0005pE&^iqB\u0005r0X\u007f5\u0011-^5ZavG\u001d^0tJ4\f\u0012cE#\u0002\u000e5)\u00107S\u0010;2\u0011\u0010_u?itCZ\u0010TO\n\\G3wM]hCLRM,+t\u0015],`DC2]R)$f_2\u0014\u0005 fYN\u0003ftQ\u001dyKm<wcQO}U\u0006\u0005+hM\ts\u001d5\\r9>\u001b\u0007056:kGp\u0017Kh|\u0014?&?1.AF!?\u0015kq{>\u001bl\u001bhUW@85$CojR\u001c\u00153}W>`l\u000b;Q\u0019\bGy\u001d2P\rB%\u0002\u0011\u0018\u00071qaP\u0011d2\u0004\u001e{$)_\"~\u0012j\"%\u0004|9b\u000eu4c6`\\\u0007r@\u0017\u0006gC^qR vJnj[y-\u007fU\u001bV 3X*\u0006_Mu\u0010k\u001b|\u0014}*}mA\r\u007f\u0011/-HcFb*0\u0015w\\!\u0015v<&(v5\u000ba@{Zu6\u0019\b\u00172d%l:5\t3%Ry\"I_I\u0014@d[}6]\"-`J|>drBTr\r\u0013M)\u0003\u001b'64u\u0011,w$>j\u0014\fSM'7&\u000bfN##vR\f9", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u0007=w%5QL\u0005pE&^iqB\u0005r0X\u007f5\u0011-^5ZavG\u001d^0tJ4\f\u0012cE#\u0002\u000e5)\u00107S\u0010;2\u0011\u0010_u?itCZ\u0010TO\n\\G3wM]hCLRM,+t\u0015],`DC2]R)$f_2\u0014\u0005 fYN\u0003ftQ\u001dyKm<wcQO}U\u0006\u0005+hM\ts\u001d5\\r9>\u001b\u0007056:kGp\u0017Kh|\u0014?&?1.AF!?\u0015kq{>\u001bl\u001bhUW@85$CojR\u001c\u00153}W>`l\u000b;Q\u0019\bGy\u001d2P\rB%\u0002\u0011\u0018\u00071qaP\u0011d2\u0004\u001e{$)_\"~\u0012j\"%\u0004|9b\u000eu4c6`\\\u0007r@\u0017\u0006gC^xD\u001fmXvW^=m\u0014{\u0015T}=X;v_\u0019V\f\u001f3\u000e\u0015\u0003\u001c\u00073@\u0004>\u001e/3=#9lp8\ncb&#p\u0002 (<1\u000fN>}b\u00020^e\u001ewx\u0012d>\u001c\u000bBAVf KgU\u000e*db\u001d*Mj\u0016\\}\u0015Oew4]8\f\n\f6\u0003!\u001cu3\u0006P.k#/0i\u0016\u0012z'=\u001b\u000e.2y\u0011\u0004", "\u0014h[AX9\u001cV\u001d\n", "\u0017m_Bg\nAW$", "uY;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu\u001es =TGD59/\u001d2bI\u0010a;R\u00010U\u0016/<eP\u0002A\u001e\u001b'c5'\u0016\u0004fK(mW\u0001\u001d\u00124T\fIhJ\u001c\u001aW\u001dtoFW\u0014G\u0007jj(/rU`c\u0003\u0011FVjse\u001ch\u001bk>D-\";y+qN=\u000e\u0006\\]H9\u007fqvN\u001d\u0004\u0002)Ou%GUxSKx1(YEX\";V\u0004/~6P\n\u0011<n\u0014Rk!\bc\n\u001du]Q0$E@\u001dHY-V|G\fw#k\u0011Z8\u001c-\"drmL\u000e\u001a'\u0015e=li\u000f7\u001c\u0016B\u0013q\"#Q\u0002FY\b^v\n xe\u001f*\u0017]\u007f'zH!rZ\u0001\rn#&<\u0016\u0007a\u000bw*l;I\u001aV2&\f\u0003YA$lE\u0017m)u_bM.=\u0003\u001eWv\u001aGEu_Ms\u000f)}~\u0015\u0007(}wBC>\u000f4%J]4i.xxgZ\"\u0017v4\u0019&-\u000f\u0005VKNew8\u0011\r\u0012r\u0006jD:A\u0001@KMi5\u0006aU\rGd`\u0010uN\u001f?is\u0012Q_}>\u0014K\u0018\r\u0003+\u0006\u0001+90{GtN\u00178e\u0019\u0016\u000en0x\u0019\u000b`Y [\u00138IR*\u0007Z+\u0014\u0014,O2\u0019U\u0010)P6LWz)<Qed\u0015.U>yGC\n!.=\u0010\u0015\fZ\u0010\rO+h\u0014yMSJ8`^,\u0010si\t\u0014XC B.\u001aJbU~z\u0007\\dS^6\u001e\u0007C|r\u001c\u0012\u0018>Y`\"", "!d[2V;:P ~Xa0\b", "!d[2V;:P ~Xa0\bP?0l1_-`", "uY;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`~Qn\u0012=z%B/d&A|\u001d2V\r@|<g\u0016xj7\u0016g6W\u0005p(\\W*kV|F^gOtT5\u001c\f]JmsU?h\t<R\u007fJl\u000b\u0015$W\u0016zy@e\u0014Q\u0003aK(%qEfi}FT\u000f`4l\u0017i+\\\u0004J(]\u0001\u0019.w\u001a\u001d\n\u000fb~\u0002f\u0001g=.\u001f\u0005G+Bv%KVw\u001f=\u00050\u001dZ\u007f\u0002\u001b@\"U;}+\u001384?1Z2m\"Me|\u001euaR/o7L\u001c=Zg\u007fuLWI/j\u0006\u001df?:e;LiR\u001e\u000ea %:rgJ8b\u000f<Xs\u001f0TH#k\u0003\u0013\u0018\u000b.v2\u001f*\u0017]\u007f'zH!rZ\u0001\rn#&<\u0016\u0007i\u00132,l3X\u0016\rfFUi\\? p\u001eviTqhas#IB\u000fS)>UJv\u001cKk\u001f\u0016A\u0005\u0007\u0006j=WB\u00016\u00114!:`8@c3\u0016E])#tFq\u0006):\u0001_Jr]\u000bp\u0013\b\u0016s\u0007#]\b@}BAVn\u001eC1\u0015r<aR\u000e;I\u00126`R\u0019FfS<J\u007f\n\u000f\b5\u0002h\u0003(/tT)k\u001aB0\n\u0016\u0012z'=\u001bJYX&V\u0012jWL$\u0007%\f\u000f\u001d!Fu\u0003[\u000e3I:$)]\u001b<\u0007\u000b^\n1k\u0001wmB\u0006+/A[\u0007\u0012`\u0010\u001eA*_ \u0003AsJCka1U_R>\u0015RD\u0017)\u001c!\u0011USKR~]c\u0017\u000b0\u0015\u000f\u0003l|\u0017G>huf2\u0001<rFc|z+EU,\\\r\u001bBlf3\nqo<\\b\u0013\f(@1^OKR+<K6\u0001~e\u001c44\u0011ICnd2{\u001c*Su\u0013Q>\u00051On\u0014OsaEcNTa2 ddi\u000fDg<P}v9.\f\u001b", "!tV4X:MW#\bXa0\b", "7m_Bg\nAW$iv]+\u0001\u00121", "6`b\u000ei(MO&", "6`b\u0019X(=W\"\u0001^\\6\u0006", "6`b!e(BZ\u001d\b|B*\u0007\u0012", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ChipKt {
    private static final PaddingValues AssistChipPadding;
    private static final PaddingValues FilterChipPadding;
    private static final float HorizontalElementsPadding;
    private static final String LabelLayoutId = "label";
    private static final String LeadingIconLayoutId = "leadingIcon";
    private static final PaddingValues SuggestionChipPadding;
    private static final String TrailingIconLayoutId = "trailingIcon";

    /* JADX INFO: renamed from: androidx.compose.material3.ChipKt$AssistChip$1 */
    /* JADX INFO: compiled from: Chip.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$changed1;
        final /* synthetic */ int $$default;
        final /* synthetic */ BorderStroke $border;
        final /* synthetic */ ChipColors $colors;
        final /* synthetic */ ChipElevation $elevation;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ Function2<Composer, Integer, Unit> $label;
        final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onClick;
        final /* synthetic */ Shape $shape;
        final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, int i2, int i3, int i4) {
            super(2);
            function0 = function0;
            function2 = function2;
            modifier = modifier;
            z = z2;
            function2 = function22;
            function2 = function23;
            shape = shape;
            chipColors = chipColors;
            chipElevation = chipElevation;
            borderStroke = borderStroke;
            mutableInteractionSource = mutableInteractionSource;
            i = i2;
            i = i3;
            i = i4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            ChipKt.AssistChip(function0, function2, modifier, z, function2, function2, shape, chipColors, chipElevation, borderStroke, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.ChipKt$AssistChip$3 */
    /* JADX INFO: compiled from: Chip.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass3 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$changed1;
        final /* synthetic */ int $$default;
        final /* synthetic */ ChipBorder $border;
        final /* synthetic */ ChipColors $colors;
        final /* synthetic */ ChipElevation $elevation;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ Function2<Composer, Integer, Unit> $label;
        final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onClick;
        final /* synthetic */ Shape $shape;
        final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, int i2, int i3, int i4) {
            super(2);
            function0 = function0;
            function2 = function2;
            modifier = modifier;
            z = z2;
            function2 = function22;
            function2 = function23;
            shape = shape;
            chipColors = chipColors;
            chipElevation = chipElevation;
            chipBorder = chipBorder;
            mutableInteractionSource = mutableInteractionSource;
            i = i2;
            i = i3;
            i = i4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            Function0<Unit> function0 = function0;
            Function2<Composer, Integer, Unit> function2 = function2;
            Modifier modifier = modifier;
            boolean z2 = z;
            Function2<Composer, Integer, Unit> function22 = function2;
            Function2<Composer, Integer, Unit> function23 = function2;
            Shape shape = shape;
            ChipColors chipColors = chipColors;
            ChipElevation chipElevation = chipElevation;
            ChipBorder chipBorder = chipBorder;
            MutableInteractionSource mutableInteractionSource = mutableInteractionSource;
            int i3 = i;
            ChipKt.AssistChip(function0, function2, modifier, z2, function22, function23, shape, chipColors, chipElevation, chipBorder, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags((i3 + 1) - (i3 & 1)), RecomposeScopeImplKt.updateChangedFlags(i), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.ChipKt$ElevatedAssistChip$1 */
    /* JADX INFO: compiled from: Chip.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06131 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$changed1;
        final /* synthetic */ int $$default;
        final /* synthetic */ BorderStroke $border;
        final /* synthetic */ ChipColors $colors;
        final /* synthetic */ ChipElevation $elevation;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ Function2<Composer, Integer, Unit> $label;
        final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onClick;
        final /* synthetic */ Shape $shape;
        final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C06131(Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, int i2, int i3, int i4) {
            super(2);
            function0 = function0;
            function2 = function2;
            modifier = modifier;
            z = z2;
            function2 = function22;
            function2 = function23;
            shape = shape;
            chipColors = chipColors;
            chipElevation = chipElevation;
            borderStroke = borderStroke;
            mutableInteractionSource = mutableInteractionSource;
            i = i2;
            i = i3;
            i = i4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            ChipKt.ElevatedAssistChip(function0, function2, modifier, z, function2, function2, shape, chipColors, chipElevation, borderStroke, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), RecomposeScopeImplKt.updateChangedFlags(i), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.ChipKt$ElevatedAssistChip$3 */
    /* JADX INFO: compiled from: Chip.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06143 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$changed1;
        final /* synthetic */ int $$default;
        final /* synthetic */ ChipBorder $border;
        final /* synthetic */ ChipColors $colors;
        final /* synthetic */ ChipElevation $elevation;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ Function2<Composer, Integer, Unit> $label;
        final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onClick;
        final /* synthetic */ Shape $shape;
        final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C06143(Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, int i2, int i3, int i4) {
            super(2);
            function0 = function0;
            function2 = function2;
            modifier = modifier;
            z = z2;
            function2 = function22;
            function2 = function23;
            shape = shape;
            chipColors = chipColors;
            chipElevation = chipElevation;
            chipBorder = chipBorder;
            mutableInteractionSource = mutableInteractionSource;
            i = i2;
            i = i3;
            i = i4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            ChipKt.ElevatedAssistChip(function0, function2, modifier, z, function2, function2, shape, chipColors, chipElevation, chipBorder, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), RecomposeScopeImplKt.updateChangedFlags(i), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.ChipKt$ElevatedFilterChip$1 */
    /* JADX INFO: compiled from: Chip.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06151 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$changed1;
        final /* synthetic */ int $$default;
        final /* synthetic */ BorderStroke $border;
        final /* synthetic */ SelectableChipColors $colors;
        final /* synthetic */ SelectableChipElevation $elevation;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ Function2<Composer, Integer, Unit> $label;
        final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onClick;
        final /* synthetic */ boolean $selected;
        final /* synthetic */ Shape $shape;
        final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C06151(boolean z2, Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z3, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, int i2, int i3, int i4) {
            super(2);
            z = z2;
            function0 = function0;
            function2 = function2;
            modifier = modifier;
            z = z3;
            function2 = function22;
            function2 = function23;
            shape = shape;
            selectableChipColors = selectableChipColors;
            selectableChipElevation = selectableChipElevation;
            borderStroke = borderStroke;
            mutableInteractionSource = mutableInteractionSource;
            i = i2;
            i = i3;
            i = i4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            boolean z2 = z;
            Function0<Unit> function0 = function0;
            Function2<Composer, Integer, Unit> function2 = function2;
            Modifier modifier = modifier;
            boolean z3 = z;
            Function2<Composer, Integer, Unit> function22 = function2;
            Function2<Composer, Integer, Unit> function23 = function2;
            Shape shape = shape;
            SelectableChipColors selectableChipColors = selectableChipColors;
            SelectableChipElevation selectableChipElevation = selectableChipElevation;
            BorderStroke borderStroke = borderStroke;
            MutableInteractionSource mutableInteractionSource = mutableInteractionSource;
            int i3 = i;
            ChipKt.ElevatedFilterChip(z2, function0, function2, modifier, z3, function22, function23, shape, selectableChipColors, selectableChipElevation, borderStroke, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags((i3 + 1) - (i3 & 1)), RecomposeScopeImplKt.updateChangedFlags(i), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.ChipKt$ElevatedSuggestionChip$1 */
    /* JADX INFO: compiled from: Chip.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06161 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ BorderStroke $border;
        final /* synthetic */ ChipColors $colors;
        final /* synthetic */ ChipElevation $elevation;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ Function2<Composer, Integer, Unit> $icon;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ Function2<Composer, Integer, Unit> $label;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onClick;
        final /* synthetic */ Shape $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C06161(Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function22, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, int i2, int i3) {
            super(2);
            function0 = function0;
            function2 = function2;
            modifier = modifier;
            z = z2;
            function2 = function22;
            shape = shape;
            chipColors = chipColors;
            chipElevation = chipElevation;
            borderStroke = borderStroke;
            mutableInteractionSource = mutableInteractionSource;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            ChipKt.ElevatedSuggestionChip(function0, function2, modifier, z, function2, shape, chipColors, chipElevation, borderStroke, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.ChipKt$ElevatedSuggestionChip$3 */
    /* JADX INFO: compiled from: Chip.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06173 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ ChipBorder $border;
        final /* synthetic */ ChipColors $colors;
        final /* synthetic */ ChipElevation $elevation;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ Function2<Composer, Integer, Unit> $icon;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ Function2<Composer, Integer, Unit> $label;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onClick;
        final /* synthetic */ Shape $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C06173(Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function22, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, int i2, int i3) {
            super(2);
            function0 = function0;
            function2 = function2;
            modifier = modifier;
            z = z2;
            function2 = function22;
            shape = shape;
            chipColors = chipColors;
            chipElevation = chipElevation;
            chipBorder = chipBorder;
            mutableInteractionSource = mutableInteractionSource;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            ChipKt.ElevatedSuggestionChip(function0, function2, modifier, z, function2, shape, chipColors, chipElevation, chipBorder, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.ChipKt$FilterChip$1 */
    /* JADX INFO: compiled from: Chip.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06181 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$changed1;
        final /* synthetic */ int $$default;
        final /* synthetic */ BorderStroke $border;
        final /* synthetic */ SelectableChipColors $colors;
        final /* synthetic */ SelectableChipElevation $elevation;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ Function2<Composer, Integer, Unit> $label;
        final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onClick;
        final /* synthetic */ boolean $selected;
        final /* synthetic */ Shape $shape;
        final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C06181(boolean z2, Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z3, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, int i2, int i3, int i4) {
            super(2);
            z = z2;
            function0 = function0;
            function2 = function2;
            modifier = modifier;
            z = z3;
            function2 = function22;
            function2 = function23;
            shape = shape;
            selectableChipColors = selectableChipColors;
            selectableChipElevation = selectableChipElevation;
            borderStroke = borderStroke;
            mutableInteractionSource = mutableInteractionSource;
            i = i2;
            i = i3;
            i = i4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            boolean z2 = z;
            Function0<Unit> function0 = function0;
            Function2<Composer, Integer, Unit> function2 = function2;
            Modifier modifier = modifier;
            boolean z3 = z;
            Function2<Composer, Integer, Unit> function22 = function2;
            Function2<Composer, Integer, Unit> function23 = function2;
            Shape shape = shape;
            SelectableChipColors selectableChipColors = selectableChipColors;
            SelectableChipElevation selectableChipElevation = selectableChipElevation;
            BorderStroke borderStroke = borderStroke;
            MutableInteractionSource mutableInteractionSource = mutableInteractionSource;
            int i3 = i;
            ChipKt.FilterChip(z2, function0, function2, modifier, z3, function22, function23, shape, selectableChipColors, selectableChipElevation, borderStroke, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags((i3 + 1) - (i3 & 1)), RecomposeScopeImplKt.updateChangedFlags(i), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.ChipKt$InputChip$2 */
    /* JADX INFO: compiled from: Chip.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$changed1;
        final /* synthetic */ int $$default;
        final /* synthetic */ Function2<Composer, Integer, Unit> $avatar;
        final /* synthetic */ BorderStroke $border;
        final /* synthetic */ SelectableChipColors $colors;
        final /* synthetic */ SelectableChipElevation $elevation;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ Function2<Composer, Integer, Unit> $label;
        final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onClick;
        final /* synthetic */ boolean $selected;
        final /* synthetic */ Shape $shape;
        final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(boolean z2, Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z3, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, int i2, int i3, int i4) {
            super(2);
            z = z2;
            function0 = function0;
            function2 = function2;
            modifier = modifier;
            z = z3;
            function2 = function22;
            function2 = function23;
            function2 = function24;
            shape = shape;
            selectableChipColors = selectableChipColors;
            selectableChipElevation = selectableChipElevation;
            borderStroke = borderStroke;
            mutableInteractionSource = mutableInteractionSource;
            i = i2;
            i = i3;
            i = i4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            boolean z2 = z;
            Function0<Unit> function0 = function0;
            Function2<Composer, Integer, Unit> function2 = function2;
            Modifier modifier = modifier;
            boolean z3 = z;
            Function2<Composer, Integer, Unit> function22 = function2;
            Function2<Composer, Integer, Unit> function23 = function2;
            Function2<Composer, Integer, Unit> function24 = function2;
            Shape shape = shape;
            SelectableChipColors selectableChipColors = selectableChipColors;
            SelectableChipElevation selectableChipElevation = selectableChipElevation;
            BorderStroke borderStroke = borderStroke;
            MutableInteractionSource mutableInteractionSource = mutableInteractionSource;
            int i3 = i;
            ChipKt.InputChip(z2, function0, function2, modifier, z3, function22, function23, function24, shape, selectableChipColors, selectableChipElevation, borderStroke, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags((i3 + 1) - (i3 & 1)), RecomposeScopeImplKt.updateChangedFlags(i), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.ChipKt$SuggestionChip$1 */
    /* JADX INFO: compiled from: Chip.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06201 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ BorderStroke $border;
        final /* synthetic */ ChipColors $colors;
        final /* synthetic */ ChipElevation $elevation;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ Function2<Composer, Integer, Unit> $icon;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ Function2<Composer, Integer, Unit> $label;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onClick;
        final /* synthetic */ Shape $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C06201(Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function22, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, int i2, int i3) {
            super(2);
            function0 = function0;
            function2 = function2;
            modifier = modifier;
            z = z2;
            function2 = function22;
            shape = shape;
            chipColors = chipColors;
            chipElevation = chipElevation;
            borderStroke = borderStroke;
            mutableInteractionSource = mutableInteractionSource;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            Function0<Unit> function0 = function0;
            Function2<Composer, Integer, Unit> function2 = function2;
            Modifier modifier = modifier;
            boolean z2 = z;
            Function2<Composer, Integer, Unit> function22 = function2;
            Shape shape = shape;
            ChipColors chipColors = chipColors;
            ChipElevation chipElevation = chipElevation;
            BorderStroke borderStroke = borderStroke;
            MutableInteractionSource mutableInteractionSource = mutableInteractionSource;
            int i3 = i;
            ChipKt.SuggestionChip(function0, function2, modifier, z2, function22, shape, chipColors, chipElevation, borderStroke, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags((i3 + 1) - (i3 & 1)), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.ChipKt$SuggestionChip$3 */
    /* JADX INFO: compiled from: Chip.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06213 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ ChipBorder $border;
        final /* synthetic */ ChipColors $colors;
        final /* synthetic */ ChipElevation $elevation;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ Function2<Composer, Integer, Unit> $icon;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ Function2<Composer, Integer, Unit> $label;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onClick;
        final /* synthetic */ Shape $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C06213(Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function22, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, int i2, int i3) {
            super(2);
            function0 = function0;
            function2 = function2;
            modifier = modifier;
            z = z2;
            function2 = function22;
            shape = shape;
            chipColors = chipColors;
            chipElevation = chipElevation;
            chipBorder = chipBorder;
            mutableInteractionSource = mutableInteractionSource;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            ChipKt.SuggestionChip(function0, function2, modifier, z, function2, shape, chipColors, chipElevation, chipBorder, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), i);
        }
    }

    public static final void AssistChip(Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Composer composer, int i2, int i3, int i4) {
        int i5;
        int i6;
        MutableInteractionSource mutableInteractionSource2;
        int i7;
        boolean z3 = z2;
        BorderStroke borderStrokeM1799assistChipBorderh1eTWw = borderStroke;
        ChipElevation chipElevationM1801assistChipElevationaqJV_2Y = chipElevation;
        Modifier.Companion companion = modifier;
        ChipColors chipColorsAssistChipColors = chipColors;
        Shape shape2 = shape;
        Function2<? super Composer, ? super Integer, Unit> function24 = function22;
        Function2<? super Composer, ? super Integer, Unit> function25 = function23;
        Composer composerStartRestartGroup = composer.startRestartGroup(313450168);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(AssistChip)P(8,5,7,3,6,10,9,1,2)126@6277L5,127@6328L18,128@6399L21,129@6469L25,137@6729L5,132@6561L541:Chip.kt#uh7d8r");
        Function0<Unit> function02 = function0;
        if ((i4 + 1) - (i4 | 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerStartRestartGroup.changedInstance(function02) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
            i5 = (i5 + 48) - (i5 & 48);
        } else if ((i2 & 48) == 0) {
            int i8 = composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
            i5 = (i5 + i8) - (i5 & i8);
        }
        int i9 = (i4 + 4) - (i4 | 4);
        if (i9 != 0) {
            i5 = (i5 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i5 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i5 |= composerStartRestartGroup.changed(companion) ? 256 : 128;
        }
        int i10 = i4 & 8;
        if (i10 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 3072));
        } else if ((i2 + 3072) - (i2 | 3072) == 0) {
            int i11 = composerStartRestartGroup.changed(z3) ? 2048 : 1024;
            i5 = (i5 + i11) - (i5 & i11);
        }
        int i12 = (i4 + 16) - (i4 | 16);
        if (i12 != 0) {
            i5 = (i5 + 24576) - (i5 & 24576);
        } else if ((i2 & 24576) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changedInstance(function24) ? 16384 : 8192)));
        }
        int i13 = (i4 + 32) - (i4 | 32);
        if (i13 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE));
        } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function25) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= ((i4 + 64) - (i4 | 64) == 0 && composerStartRestartGroup.changed(shape2)) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            int i14 = ((i4 + 128) - (i4 | 128) == 0 && composerStartRestartGroup.changed(chipColorsAssistChipColors)) ? 8388608 : 4194304;
            i5 = (i5 + i14) - (i5 & i14);
        }
        if ((i2 & 100663296) == 0) {
            int i15 = ((-1) - (((-1) - i4) | ((-1) - 256)) == 0 && composerStartRestartGroup.changed(chipElevationM1801assistChipElevationaqJV_2Y)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            i5 = (i5 + i15) - (i5 & i15);
        }
        if ((i2 & 805306368) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (((-1) - (((-1) - i4) | ((-1) - 512)) == 0 && composerStartRestartGroup.changed(borderStrokeM1799assistChipBorderh1eTWw)) ? 536870912 : 268435456)));
        }
        int i16 = (i4 + 1024) - (i4 | 1024);
        if (i16 != 0) {
            i6 = (i3 + 6) - (i3 & 6);
        } else if ((i3 & 6) == 0) {
            i6 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changed(mutableInteractionSource) ? 4 : 2)));
        } else {
            i6 = i3;
        }
        if ((-1) - (((-1) - i5) | ((-1) - 306783379)) == 306783378 && (i6 + 3) - (3 | i6) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            mutableInteractionSource2 = mutableInteractionSource;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i9 != 0) {
                    companion = Modifier.Companion;
                }
                if (i10 != 0) {
                    z3 = true;
                }
                mutableInteractionSource2 = null;
                if (i12 != 0) {
                    function24 = null;
                }
                if (i13 != 0) {
                    function25 = null;
                }
                if ((-1) - (((-1) - i4) | ((-1) - 64)) != 0) {
                    shape2 = AssistChipDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    i5 &= -3670017;
                }
                if ((i4 + 128) - (i4 | 128) != 0) {
                    chipColorsAssistChipColors = AssistChipDefaults.INSTANCE.assistChipColors(composerStartRestartGroup, 6);
                    i5 = (i5 - 29360129) - (i5 | (-29360129));
                }
                if ((-1) - (((-1) - i4) | ((-1) - 256)) != 0) {
                    chipElevationM1801assistChipElevationaqJV_2Y = AssistChipDefaults.INSTANCE.m1801assistChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                    i7 = (i5 - 234881025) - (i5 | (-234881025));
                } else {
                    i7 = i5;
                }
                if ((i4 + 512) - (i4 | 512) != 0) {
                    borderStrokeM1799assistChipBorderh1eTWw = AssistChipDefaults.INSTANCE.m1799assistChipBorderh1eTWw(z3, 0L, 0L, 0.0f, composerStartRestartGroup, (-1) - (((-1) - ((i7 >> 9) & 14)) & ((-1) - 24576)), 14);
                    i7 &= -1879048193;
                }
                if (i16 == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((-1) - (((-1) - i4) | ((-1) - 64)) != 0) {
                    i5 = (i5 - 3670017) - (i5 | (-3670017));
                }
                if ((i4 + 128) - (i4 | 128) != 0) {
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-29360129)));
                }
                if ((i4 + 256) - (i4 | 256) != 0) {
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-234881025)));
                }
                if ((i4 + 512) - (i4 | 512) != 0) {
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-1879048193)));
                }
                mutableInteractionSource2 = mutableInteractionSource;
                i7 = i5;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(313450168, i7, i6, "androidx.compose.material3.AssistChip (Chip.kt:132)");
            }
            TextStyle value = TypographyKt.getValue(AssistChipTokens.INSTANCE.getLabelTextFont(), composerStartRestartGroup, 6);
            long jM1882labelColorvNxB06k$material3_release = chipColorsAssistChipColors.m1882labelColorvNxB06k$material3_release(z3);
            float fM1804getHeightD9Ej5fM = AssistChipDefaults.INSTANCE.m1804getHeightD9Ej5fM();
            PaddingValues paddingValues = AssistChipPadding;
            int i17 = i7 << 3;
            int i18 = ((-1) - (((-1) - (i7 >> 6)) | ((-1) - 14))) | ((i17 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i17 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION));
            int i19 = (i7 >> 3) & 896;
            int i20 = (i18 + i19) - (i18 & i19);
            int i21 = i7 << 6;
            int i22 = ((-1) - (((-1) - i20) & ((-1) - ((-1) - (((-1) - i21) | ((-1) - 7168)))))) | ((-1) - (((-1) - 3670016) | ((-1) - i21))) | ((-1) - (((-1) - 29360128) | ((-1) - i21)));
            int i23 = 234881024 & i21;
            int i24 = (i22 + i23) - (i22 & i23);
            int i25 = i21 & 1879048192;
            int i26 = i7 >> 24;
            int i27 = (-1) - (((-1) - (i26 & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)) & ((-1) - ((i26 & 14) | 3456)));
            int i28 = i6 << 12;
            function02 = function02;
            m1891ChipnkUnTEs(companion, function02, z3, function2, value, jM1882labelColorvNxB06k$material3_release, function24, function25, shape2, chipColorsAssistChipColors, chipElevationM1801assistChipElevationaqJV_2Y, borderStrokeM1799assistChipBorderh1eTWw, fM1804getHeightD9Ej5fM, paddingValues, mutableInteractionSource2, composerStartRestartGroup, (i24 + i25) - (i24 & i25), i27 | ((i28 + 57344) - (i28 | 57344)));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt.AssistChip.1
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$changed1;
                final /* synthetic */ int $$default;
                final /* synthetic */ BorderStroke $border;
                final /* synthetic */ ChipColors $colors;
                final /* synthetic */ ChipElevation $elevation;
                final /* synthetic */ boolean $enabled;
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ Function0<Unit> $onClick;
                final /* synthetic */ Shape $shape;
                final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(Function0<Unit> function022, Function2<? super Composer, ? super Integer, Unit> function26, Modifier companion2, boolean z32, Function2<? super Composer, ? super Integer, Unit> function242, Function2<? super Composer, ? super Integer, Unit> function252, Shape shape22, ChipColors chipColorsAssistChipColors2, ChipElevation chipElevationM1801assistChipElevationaqJV_2Y2, BorderStroke borderStrokeM1799assistChipBorderh1eTWw2, MutableInteractionSource mutableInteractionSource22, int i29, int i32, int i42) {
                    super(2);
                    function0 = function022;
                    function2 = function26;
                    modifier = companion2;
                    z = z32;
                    function2 = function242;
                    function2 = function252;
                    shape = shape22;
                    chipColors = chipColorsAssistChipColors2;
                    chipElevation = chipElevationM1801assistChipElevationaqJV_2Y2;
                    borderStroke = borderStrokeM1799assistChipBorderh1eTWw2;
                    mutableInteractionSource = mutableInteractionSource22;
                    i = i29;
                    i = i32;
                    i = i42;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i29) {
                    ChipKt.AssistChip(function0, function2, modifier, z, function2, function2, shape, chipColors, chipElevation, borderStroke, mutableInteractionSource, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
                }
            });
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0010G\u0005C\u0006u\u001ee]Kg\u0001_'kPeZ\n9\u001e(\u000fa\u0004Vo~Wv-rq`}\u0010\rQ{>\u000648L%_[\baoQOm}\u0015%\u001fP'X}~=\u00122 w80\u000b\u0012|h'G|\bqN\rE3:$g\u0002J^!.\u0005.\t6I\u0011*", replaceWith = @ReplaceWith(expression = "AssistChip(onClick, label, modifier, enabled,leadingIcon, trailingIcon, shape, colors, elevation, border, interactionSource", imports = {}))
    @InterfaceC1492Gx
    public static final /* synthetic */ void AssistChip(Function0 function0, Function2 function2, Modifier modifier, boolean z2, Function2 function22, Function2 function23, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, Composer composer, int i2, int i3, int i4) {
        int i5;
        int i6;
        State<BorderStroke> stateBorderStroke$material3_release;
        ChipBorder chipBorderM1798assistChipBorderd_3_b6Q = chipBorder;
        ChipElevation chipElevationM1801assistChipElevationaqJV_2Y = chipElevation;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        ChipColors chipColorsAssistChipColors = chipColors;
        Function2 function24 = function23;
        Shape shape2 = shape;
        boolean z3 = z2;
        Function2 function25 = function22;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1932300596);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(AssistChip)P(8,5,7,3,6,10,9,1,2)213@10395L5,214@10446L18,215@10517L21,216@10585L18,217@10655L39,224@10872L5,219@10704L571:Chip.kt#uh7d8r");
        if ((-1) - (((-1) - i4) | ((-1) - 1)) != 0) {
            i5 = (i2 + 6) - (i2 & 6);
        } else if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            i5 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 + 2) - (i4 | 2) != 0) {
            i5 = (i5 + 48) - (i5 & 48);
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            int i7 = composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
            i5 = (i5 + i7) - (i5 & i7);
        }
        int i8 = i4 & 4;
        if (i8 != 0) {
            i5 = (i5 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i5 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            int i9 = composerStartRestartGroup.changed(companion) ? 256 : 128;
            i5 = (i5 + i9) - (i5 & i9);
        }
        int i10 = (-1) - (((-1) - i4) | ((-1) - 8));
        if (i10 != 0) {
            i5 |= 3072;
        } else if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            i5 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
        }
        int i11 = i4 & 16;
        if (i11 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 24576));
        } else if ((i2 + 24576) - (i2 | 24576) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function25) ? 16384 : 8192;
        }
        int i12 = (-1) - (((-1) - i4) | ((-1) - 32));
        if (i12 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE));
        } else if ((i2 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i2 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            int i13 = composerStartRestartGroup.changedInstance(function24) ? 131072 : 65536;
            i5 = (i5 + i13) - (i5 & i13);
        }
        if ((-1) - (((-1) - i2) | ((-1) - 1572864)) == 0) {
            int i14 = ((-1) - (((-1) - i4) | ((-1) - 64)) == 0 && composerStartRestartGroup.changed(shape2)) ? 1048576 : 524288;
            i5 = (i5 + i14) - (i5 & i14);
        }
        if ((-1) - (((-1) - i2) | ((-1) - 12582912)) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (((-1) - (((-1) - i4) | ((-1) - 128)) == 0 && composerStartRestartGroup.changed(chipColorsAssistChipColors)) ? 8388608 : 4194304)));
        }
        if ((i2 & 100663296) == 0) {
            i5 |= ((-1) - (((-1) - i4) | ((-1) - 256)) == 0 && composerStartRestartGroup.changed(chipElevationM1801assistChipElevationaqJV_2Y)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i2 + 805306368) - (i2 | 805306368) == 0) {
            int i15 = ((-1) - (((-1) - i4) | ((-1) - 512)) == 0 && composerStartRestartGroup.changed(chipBorderM1798assistChipBorderd_3_b6Q)) ? 536870912 : 268435456;
            i5 = (i5 + i15) - (i5 & i15);
        }
        int i16 = (-1) - (((-1) - i4) | ((-1) - 1024));
        if (i16 != 0) {
            i6 = (i3 + 6) - (i3 & 6);
        } else if ((i3 & 6) == 0) {
            i6 = i3 | (composerStartRestartGroup.changed(mutableInteractionSource2) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if ((i5 + 306783379) - (306783379 | i5) == 306783378 && (i6 + 3) - (3 | i6) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 + 1) - (i2 | 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i8 != 0) {
                    companion = Modifier.Companion;
                }
                if (i10 != 0) {
                    z3 = true;
                }
                if (i11 != 0) {
                    function25 = null;
                }
                if (i12 != 0) {
                    function24 = null;
                }
                if ((i4 + 64) - (i4 | 64) != 0) {
                    shape2 = AssistChipDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    i5 &= -3670017;
                }
                if ((-1) - (((-1) - i4) | ((-1) - 128)) != 0) {
                    chipColorsAssistChipColors = AssistChipDefaults.INSTANCE.assistChipColors(composerStartRestartGroup, 6);
                    i5 = (i5 - 29360129) - (i5 | (-29360129));
                }
                if ((i4 & 256) != 0) {
                    chipElevationM1801assistChipElevationaqJV_2Y = AssistChipDefaults.INSTANCE.m1801assistChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-234881025)));
                }
                if ((i4 & 512) != 0) {
                    chipBorderM1798assistChipBorderd_3_b6Q = AssistChipDefaults.INSTANCE.m1798assistChipBorderd_3_b6Q(0L, 0L, 0.0f, composerStartRestartGroup, 3072, 7);
                    i5 &= -1879048193;
                }
                if (i16 != 0) {
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 267303551, "CC(remember):Chip.kt#9igjgp");
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i4 + 64) - (i4 | 64) != 0) {
                    i5 &= -3670017;
                }
                if ((i4 & 128) != 0) {
                    i5 &= -29360129;
                }
                if ((-1) - (((-1) - i4) | ((-1) - 256)) != 0) {
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-234881025)));
                }
                if ((-1) - (((-1) - i4) | ((-1) - 512)) != 0) {
                    i5 &= -1879048193;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1932300596, i5, i6, "androidx.compose.material3.AssistChip (Chip.kt:219)");
            }
            TextStyle value = TypographyKt.getValue(AssistChipTokens.INSTANCE.getLabelTextFont(), composerStartRestartGroup, 6);
            long jM1882labelColorvNxB06k$material3_release = chipColorsAssistChipColors.m1882labelColorvNxB06k$material3_release(z3);
            composerStartRestartGroup.startReplaceGroup(267317901);
            ComposerKt.sourceInformation(composerStartRestartGroup, "231@11104L21");
            if (chipBorderM1798assistChipBorderd_3_b6Q == null) {
                stateBorderStroke$material3_release = null;
            } else {
                int i17 = i5 >> 24;
                stateBorderStroke$material3_release = chipBorderM1798assistChipBorderd_3_b6Q.borderStroke$material3_release(z3, composerStartRestartGroup, ((-1) - (((-1) - (i5 >> 9)) | ((-1) - 14))) | ((i17 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i17 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)));
            }
            composerStartRestartGroup.endReplaceGroup();
            BorderStroke value2 = stateBorderStroke$material3_release != null ? stateBorderStroke$material3_release.getValue() : null;
            float fM1804getHeightD9Ej5fM = AssistChipDefaults.INSTANCE.m1804getHeightD9Ej5fM();
            PaddingValues paddingValues = AssistChipPadding;
            int i18 = (-1) - (((-1) - ((-1) - (((-1) - (i5 >> 6)) | ((-1) - 14)))) & ((-1) - ((-1) - (((-1) - (i5 << 3)) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)))));
            int i19 = i5 >> 3;
            int i20 = (i19 + 896) - (i19 | 896);
            int i21 = i5 << 6;
            int i22 = ((-1) - (((-1) - (((i20 + i18) - (i20 & i18)) | (i21 & 7168))) & ((-1) - ((-1) - (((-1) - 3670016) | ((-1) - i21)))))) | (29360128 & i21);
            int i23 = (234881024 + i21) - (234881024 | i21);
            int i24 = (i22 + i23) - (i22 & i23);
            int i25 = (i21 + 1879048192) - (i21 | 1879048192);
            int i26 = (i24 + i25) - (i24 & i25);
            int i27 = i5 >> 24;
            int i28 = ((i27 + 14) - (i27 | 14)) | 3456;
            int i29 = i6 << 12;
            int i30 = (i29 + 57344) - (i29 | 57344);
            m1891ChipnkUnTEs(companion, function0, z3, function2, value, jM1882labelColorvNxB06k$material3_release, function25, function24, shape2, chipColorsAssistChipColors, chipElevationM1801assistChipElevationaqJV_2Y, value2, fM1804getHeightD9Ej5fM, paddingValues, mutableInteractionSource2, composerStartRestartGroup, i26, (i28 + i30) - (i28 & i30));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt.AssistChip.3
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$changed1;
                final /* synthetic */ int $$default;
                final /* synthetic */ ChipBorder $border;
                final /* synthetic */ ChipColors $colors;
                final /* synthetic */ ChipElevation $elevation;
                final /* synthetic */ boolean $enabled;
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ Function0<Unit> $onClick;
                final /* synthetic */ Shape $shape;
                final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass3(Function0<Unit> function02, Function2<? super Composer, ? super Integer, Unit> function26, Modifier companion2, boolean z32, Function2<? super Composer, ? super Integer, Unit> function252, Function2<? super Composer, ? super Integer, Unit> function242, Shape shape22, ChipColors chipColorsAssistChipColors2, ChipElevation chipElevationM1801assistChipElevationaqJV_2Y2, ChipBorder chipBorderM1798assistChipBorderd_3_b6Q2, MutableInteractionSource mutableInteractionSource22, int i210, int i32, int i42) {
                    super(2);
                    function0 = function02;
                    function2 = function26;
                    modifier = companion2;
                    z = z32;
                    function2 = function252;
                    function2 = function242;
                    shape = shape22;
                    chipColors = chipColorsAssistChipColors2;
                    chipElevation = chipElevationM1801assistChipElevationaqJV_2Y2;
                    chipBorder = chipBorderM1798assistChipBorderd_3_b6Q2;
                    mutableInteractionSource = mutableInteractionSource22;
                    i = i210;
                    i = i32;
                    i = i42;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i210) {
                    Function0<Unit> function02 = function0;
                    Function2<Composer, Integer, Unit> function26 = function2;
                    Modifier modifier2 = modifier;
                    boolean z22 = z;
                    Function2<Composer, Integer, Unit> function222 = function2;
                    Function2<Composer, Integer, Unit> function232 = function2;
                    Shape shape3 = shape;
                    ChipColors chipColors2 = chipColors;
                    ChipElevation chipElevation2 = chipElevation;
                    ChipBorder chipBorder2 = chipBorder;
                    MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
                    int i32 = i;
                    ChipKt.AssistChip(function02, function26, modifier2, z22, function222, function232, shape3, chipColors2, chipElevation2, chipBorder2, mutableInteractionSource3, composer2, RecomposeScopeImplKt.updateChangedFlags((i32 + 1) - (i32 & 1)), RecomposeScopeImplKt.updateChangedFlags(i), i);
                }
            });
        }
    }

    public static final void ElevatedAssistChip(Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Composer composer, int i2, int i3, int i4) {
        int i5;
        int i6;
        MutableInteractionSource mutableInteractionSource2;
        Modifier.Companion companion = modifier;
        ChipElevation chipElevationM1803elevatedAssistChipElevationaqJV_2Y = chipElevation;
        Shape shape2 = shape;
        Function2<? super Composer, ? super Integer, Unit> function24 = function23;
        Function2<? super Composer, ? super Integer, Unit> function25 = function22;
        BorderStroke borderStroke2 = borderStroke;
        boolean z3 = z2;
        ChipColors chipColorsElevatedAssistChipColors = chipColors;
        Composer composerStartRestartGroup = composer.startRestartGroup(1594789934);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ElevatedAssistChip)P(8,5,7,3,6,10,9,1,2)289@14186L5,290@14237L26,291@14316L29,300@14613L5,295@14445L541:Chip.kt#uh7d8r");
        Function0<Unit> function02 = function0;
        if ((-1) - (((-1) - i4) | ((-1) - 1)) != 0) {
            i5 = (i2 + 6) - (i2 & 6);
        } else if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            int i7 = composerStartRestartGroup.changedInstance(function02) ? 4 : 2;
            i5 = (i7 + i2) - (i7 & i2);
        } else {
            i5 = i2;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
            i5 = (i5 + 48) - (i5 & 48);
        } else if ((i2 + 48) - (i2 | 48) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changedInstance(function2) ? 32 : 16)));
        }
        int i8 = (-1) - (((-1) - i4) | ((-1) - 4));
        if (i8 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i5 |= composerStartRestartGroup.changed(companion) ? 256 : 128;
        }
        int i9 = (-1) - (((-1) - i4) | ((-1) - 8));
        if (i9 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 3072));
        } else if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            i5 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
        }
        int i10 = i4 & 16;
        if (i10 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 24576));
        } else if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            int i11 = composerStartRestartGroup.changedInstance(function25) ? 16384 : 8192;
            i5 = (i5 + i11) - (i5 & i11);
        }
        int i12 = (-1) - (((-1) - i4) | ((-1) - 32));
        if (i12 != 0) {
            i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function24) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= ((i4 & 64) == 0 && composerStartRestartGroup.changed(shape2)) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (((-1) - (((-1) - i4) | ((-1) - 128)) == 0 && composerStartRestartGroup.changed(chipColorsElevatedAssistChipColors)) ? 8388608 : 4194304)));
        }
        if ((i2 + 100663296) - (i2 | 100663296) == 0) {
            i5 |= ((i4 & 256) == 0 && composerStartRestartGroup.changed(chipElevationM1803elevatedAssistChipElevationaqJV_2Y)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        int i13 = i4 & 512;
        if (i13 != 0) {
            i5 = (i5 + 805306368) - (i5 & 805306368);
        } else if ((-1) - (((-1) - i2) | ((-1) - 805306368)) == 0) {
            int i14 = composerStartRestartGroup.changed(borderStroke2) ? 536870912 : 268435456;
            i5 = (i5 + i14) - (i5 & i14);
        }
        int i15 = (-1) - (((-1) - i4) | ((-1) - 1024));
        if (i15 != 0) {
            i6 = i3 | 6;
        } else if ((i3 + 6) - (i3 | 6) == 0) {
            int i16 = composerStartRestartGroup.changed(mutableInteractionSource) ? 4 : 2;
            i6 = (i3 + i16) - (i3 & i16);
        } else {
            i6 = i3;
        }
        if ((i5 & 306783379) == 306783378 && (-1) - (((-1) - i6) | ((-1) - 3)) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            mutableInteractionSource2 = mutableInteractionSource;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((-1) - (((-1) - i2) | ((-1) - 1)) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i8 != 0) {
                    companion = Modifier.Companion;
                }
                if (i9 != 0) {
                    z3 = true;
                }
                mutableInteractionSource2 = null;
                if (i10 != 0) {
                    function25 = null;
                }
                if (i12 != 0) {
                    function24 = null;
                }
                if ((-1) - (((-1) - i4) | ((-1) - 64)) != 0) {
                    shape2 = AssistChipDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    i5 &= -3670017;
                }
                if ((i4 & 128) != 0) {
                    chipColorsElevatedAssistChipColors = AssistChipDefaults.INSTANCE.elevatedAssistChipColors(composerStartRestartGroup, 6);
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-29360129)));
                }
                if ((-1) - (((-1) - i4) | ((-1) - 256)) != 0) {
                    chipElevationM1803elevatedAssistChipElevationaqJV_2Y = AssistChipDefaults.INSTANCE.m1803elevatedAssistChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-234881025)));
                }
                if (i13 != 0) {
                    borderStroke2 = null;
                }
                if (i15 == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((-1) - (((-1) - i4) | ((-1) - 64)) != 0) {
                    i5 &= -3670017;
                }
                if ((i4 + 128) - (i4 | 128) != 0) {
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-29360129)));
                }
                if ((i4 + 256) - (i4 | 256) != 0) {
                    i5 &= -234881025;
                }
                mutableInteractionSource2 = mutableInteractionSource;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1594789934, i5, i6, "androidx.compose.material3.ElevatedAssistChip (Chip.kt:295)");
            }
            TextStyle value = TypographyKt.getValue(AssistChipTokens.INSTANCE.getLabelTextFont(), composerStartRestartGroup, 6);
            long jM1882labelColorvNxB06k$material3_release = chipColorsElevatedAssistChipColors.m1882labelColorvNxB06k$material3_release(z3);
            float fM1804getHeightD9Ej5fM = AssistChipDefaults.INSTANCE.m1804getHeightD9Ej5fM();
            PaddingValues paddingValues = AssistChipPadding;
            int i17 = i5 >> 6;
            int i18 = i5 << 3;
            int i19 = (-1) - (((-1) - ((i17 + 14) - (i17 | 14))) & ((-1) - ((i18 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i18 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))));
            int i20 = i5 >> 3;
            int i21 = (i20 + 896) - (i20 | 896);
            int i22 = i5 << 6;
            int i23 = ((i19 + i21) - (i19 & i21)) | ((-1) - (((-1) - i22) | ((-1) - 7168)));
            int i24 = (3670016 + i22) - (3670016 | i22);
            int i25 = (i23 + i24) - (i23 & i24);
            int i26 = (-1) - (((-1) - 29360128) | ((-1) - i22));
            int i27 = (i25 + i26) - (i25 & i26);
            int i28 = (-1) - (((-1) - 234881024) | ((-1) - i22));
            int i29 = (-1) - (((-1) - ((i27 + i28) - (i27 & i28))) & ((-1) - (i22 & 1879048192)));
            int i30 = i5 >> 24;
            int i31 = ((-1) - (((-1) - i30) | ((-1) - 14))) | 3456;
            int i32 = i30 & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION;
            function02 = function02;
            m1891ChipnkUnTEs(companion, function02, z3, function2, value, jM1882labelColorvNxB06k$material3_release, function25, function24, shape2, chipColorsElevatedAssistChipColors, chipElevationM1803elevatedAssistChipElevationaqJV_2Y, borderStroke2, fM1804getHeightD9Ej5fM, paddingValues, mutableInteractionSource2, composerStartRestartGroup, i29, (-1) - (((-1) - ((i32 + i31) - (i32 & i31))) & ((-1) - ((-1) - (((-1) - (i6 << 12)) | ((-1) - 57344))))));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt.ElevatedAssistChip.1
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$changed1;
                final /* synthetic */ int $$default;
                final /* synthetic */ BorderStroke $border;
                final /* synthetic */ ChipColors $colors;
                final /* synthetic */ ChipElevation $elevation;
                final /* synthetic */ boolean $enabled;
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ Function0<Unit> $onClick;
                final /* synthetic */ Shape $shape;
                final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C06131(Function0<Unit> function022, Function2<? super Composer, ? super Integer, Unit> function26, Modifier companion2, boolean z32, Function2<? super Composer, ? super Integer, Unit> function252, Function2<? super Composer, ? super Integer, Unit> function242, Shape shape22, ChipColors chipColorsElevatedAssistChipColors2, ChipElevation chipElevationM1803elevatedAssistChipElevationaqJV_2Y2, BorderStroke borderStroke22, MutableInteractionSource mutableInteractionSource22, int i210, int i33, int i42) {
                    super(2);
                    function0 = function022;
                    function2 = function26;
                    modifier = companion2;
                    z = z32;
                    function2 = function252;
                    function2 = function242;
                    shape = shape22;
                    chipColors = chipColorsElevatedAssistChipColors2;
                    chipElevation = chipElevationM1803elevatedAssistChipElevationaqJV_2Y2;
                    borderStroke = borderStroke22;
                    mutableInteractionSource = mutableInteractionSource22;
                    i = i210;
                    i = i33;
                    i = i42;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i210) {
                    ChipKt.ElevatedAssistChip(function0, function2, modifier, z, function2, function2, shape, chipColors, chipElevation, borderStroke, mutableInteractionSource, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), RecomposeScopeImplKt.updateChangedFlags(i), i);
                }
            });
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0010G\u0005C\u0006u\u001ee]Kg\u0001_'kPeZ\n9\u001e(\u000fa\u0004Vo~Wv-rq`}\u0010\rQ{>\u000648L%_[\baoQOm}\u0019\u001e\u0011]\u0015X z\u0015\u0015\u0006\u0015\u0003K~S\u0007\f\u001d6\u0010|\\OS{L3g2\u0013QJe s\u000e\u0013\n4S\u001b+>$#\u001eMW\u0013$", replaceWith = @ReplaceWith(expression = "ElevatedAssistChip(onClick, label, modifier, enabled,leadingIcon, trailingIcon, shape, colors, elevation, border, interactionSource", imports = {}))
    @InterfaceC1492Gx
    public static final /* synthetic */ void ElevatedAssistChip(Function0 function0, Function2 function2, Modifier modifier, boolean z2, Function2 function22, Function2 function23, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, Composer composer, int i2, int i3, int i4) {
        int i5;
        int i6;
        State<BorderStroke> stateBorderStroke$material3_release;
        Modifier.Companion companion = modifier;
        ChipBorder chipBorder2 = chipBorder;
        ChipElevation chipElevationM1803elevatedAssistChipElevationaqJV_2Y = chipElevation;
        ChipColors chipColorsElevatedAssistChipColors = chipColors;
        boolean z3 = z2;
        Shape shape2 = shape;
        Function2 function24 = function22;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        Function2 function25 = function23;
        Composer composerStartRestartGroup = composer.startRestartGroup(1295844802);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ElevatedAssistChip)P(8,5,7,3,6,10,9,1,2)375@18287L5,376@18338L26,377@18417L29,379@18530L39,386@18746L5,381@18578L571:Chip.kt#uh7d8r");
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            i5 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 48));
        } else if ((i2 & 48) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changedInstance(function2) ? 32 : 16)));
        }
        int i7 = (-1) - (((-1) - i4) | ((-1) - 4));
        if (i7 != 0) {
            i5 = (i5 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i5 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i5 |= composerStartRestartGroup.changed(companion) ? 256 : 128;
        }
        int i8 = (-1) - (((-1) - i4) | ((-1) - 8));
        if (i8 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 3072));
        } else if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            int i9 = composerStartRestartGroup.changed(z3) ? 2048 : 1024;
            i5 = (i5 + i9) - (i5 & i9);
        }
        int i10 = (i4 + 16) - (i4 | 16);
        if (i10 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 24576));
        } else if ((i2 + 24576) - (i2 | 24576) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changedInstance(function24) ? 16384 : 8192)));
        }
        int i11 = (-1) - (((-1) - i4) | ((-1) - 32));
        if (i11 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE));
        } else if ((-1) - (((-1) - i2) | ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE)) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changedInstance(function25) ? 131072 : 65536)));
        }
        if ((i2 & 1572864) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (((-1) - (((-1) - i4) | ((-1) - 64)) == 0 && composerStartRestartGroup.changed(shape2)) ? 1048576 : 524288)));
        }
        if ((i2 & 12582912) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (((-1) - (((-1) - i4) | ((-1) - 128)) == 0 && composerStartRestartGroup.changed(chipColorsElevatedAssistChipColors)) ? 8388608 : 4194304)));
        }
        if ((i2 & 100663296) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (((i4 + 256) - (i4 | 256) == 0 && composerStartRestartGroup.changed(chipElevationM1803elevatedAssistChipElevationaqJV_2Y)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432)));
        }
        int i12 = (-1) - (((-1) - i4) | ((-1) - 512));
        if (i12 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 805306368));
        } else if ((i2 + 805306368) - (i2 | 805306368) == 0) {
            i5 |= composerStartRestartGroup.changed(chipBorder2) ? 536870912 : 268435456;
        }
        int i13 = i4 & 1024;
        if (i13 != 0) {
            i6 = (-1) - (((-1) - i3) & ((-1) - 6));
        } else if ((i3 + 6) - (i3 | 6) == 0) {
            i6 = i3 | (composerStartRestartGroup.changed(mutableInteractionSource2) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if ((i5 & 306783379) == 306783378 && (-1) - (((-1) - i6) | ((-1) - 3)) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i7 != 0) {
                    companion = Modifier.Companion;
                }
                if (i8 != 0) {
                    z3 = true;
                }
                if (i10 != 0) {
                    function24 = null;
                }
                if (i11 != 0) {
                    function25 = null;
                }
                if ((i4 & 64) != 0) {
                    shape2 = AssistChipDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    i5 &= -3670017;
                }
                if ((i4 + 128) - (i4 | 128) != 0) {
                    chipColorsElevatedAssistChipColors = AssistChipDefaults.INSTANCE.elevatedAssistChipColors(composerStartRestartGroup, 6);
                    i5 &= -29360129;
                }
                if ((i4 & 256) != 0) {
                    chipElevationM1803elevatedAssistChipElevationaqJV_2Y = AssistChipDefaults.INSTANCE.m1803elevatedAssistChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                    i5 &= -234881025;
                }
                if (i12 != 0) {
                    chipBorder2 = null;
                }
                if (i13 != 0) {
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1551989929, "CC(remember):Chip.kt#9igjgp");
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i4 & 64) != 0) {
                    i5 &= -3670017;
                }
                if ((i4 + 128) - (i4 | 128) != 0) {
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-29360129)));
                }
                if ((i4 & 256) != 0) {
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-234881025)));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1295844802, i5, i6, "androidx.compose.material3.ElevatedAssistChip (Chip.kt:381)");
            }
            TextStyle value = TypographyKt.getValue(AssistChipTokens.INSTANCE.getLabelTextFont(), composerStartRestartGroup, 6);
            long jM1882labelColorvNxB06k$material3_release = chipColorsElevatedAssistChipColors.m1882labelColorvNxB06k$material3_release(z3);
            float fM1804getHeightD9Ej5fM = AssistChipDefaults.INSTANCE.m1804getHeightD9Ej5fM();
            PaddingValues paddingValues = AssistChipPadding;
            composerStartRestartGroup.startReplaceGroup(1552007127);
            ComposerKt.sourceInformation(composerStartRestartGroup, "395@19068L21");
            if (chipBorder2 == null) {
                stateBorderStroke$material3_release = null;
            } else {
                int i14 = i5 >> 9;
                int i15 = (i14 + 14) - (i14 | 14);
                int i16 = (i5 >> 24) & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION;
                stateBorderStroke$material3_release = chipBorder2.borderStroke$material3_release(z3, composerStartRestartGroup, (i15 + i16) - (i15 & i16));
            }
            composerStartRestartGroup.endReplaceGroup();
            BorderStroke value2 = stateBorderStroke$material3_release != null ? stateBorderStroke$material3_release.getValue() : null;
            int i17 = i5 >> 6;
            int i18 = (i17 + 14) - (i17 | 14);
            int i19 = (-1) - (((-1) - (i5 << 3)) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION));
            int i20 = ((i18 + i19) - (i18 & i19)) | ((i5 >> 3) & 896);
            int i21 = i5 << 6;
            int i22 = (i21 + 7168) - (i21 | 7168);
            int i23 = (-1) - (((-1) - ((i22 + i20) - (i22 & i20))) & ((-1) - ((3670016 + i21) - (3670016 | i21))));
            int i24 = (-1) - (((-1) - 29360128) | ((-1) - i21));
            int i25 = (i23 + i24) - (i23 & i24);
            int i26 = (-1) - (((-1) - 234881024) | ((-1) - i21));
            int i27 = (-1) - (((-1) - ((i25 + i26) - (i25 & i26))) & ((-1) - (1879048192 & i21)));
            int i28 = i5 >> 24;
            int i29 = (i28 + 14) - (i28 | 14);
            int i30 = (i29 + 3456) - (i29 & 3456);
            int i31 = (i6 << 12) & 57344;
            m1891ChipnkUnTEs(companion, function0, z3, function2, value, jM1882labelColorvNxB06k$material3_release, function24, function25, shape2, chipColorsElevatedAssistChipColors, chipElevationM1803elevatedAssistChipElevationaqJV_2Y, value2, fM1804getHeightD9Ej5fM, paddingValues, mutableInteractionSource2, composerStartRestartGroup, i27, (i30 + i31) - (i30 & i31));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt.ElevatedAssistChip.3
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$changed1;
                final /* synthetic */ int $$default;
                final /* synthetic */ ChipBorder $border;
                final /* synthetic */ ChipColors $colors;
                final /* synthetic */ ChipElevation $elevation;
                final /* synthetic */ boolean $enabled;
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ Function0<Unit> $onClick;
                final /* synthetic */ Shape $shape;
                final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C06143(Function0<Unit> function02, Function2<? super Composer, ? super Integer, Unit> function26, Modifier companion2, boolean z32, Function2<? super Composer, ? super Integer, Unit> function242, Function2<? super Composer, ? super Integer, Unit> function252, Shape shape22, ChipColors chipColorsElevatedAssistChipColors2, ChipElevation chipElevationM1803elevatedAssistChipElevationaqJV_2Y2, ChipBorder chipBorder22, MutableInteractionSource mutableInteractionSource22, int i210, int i32, int i42) {
                    super(2);
                    function0 = function02;
                    function2 = function26;
                    modifier = companion2;
                    z = z32;
                    function2 = function242;
                    function2 = function252;
                    shape = shape22;
                    chipColors = chipColorsElevatedAssistChipColors2;
                    chipElevation = chipElevationM1803elevatedAssistChipElevationaqJV_2Y2;
                    chipBorder = chipBorder22;
                    mutableInteractionSource = mutableInteractionSource22;
                    i = i210;
                    i = i32;
                    i = i42;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i210) {
                    ChipKt.ElevatedAssistChip(function0, function2, modifier, z, function2, function2, shape, chipColors, chipElevation, chipBorder, mutableInteractionSource, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), RecomposeScopeImplKt.updateChangedFlags(i), i);
                }
            });
        }
    }

    public static final void FilterChip(boolean z2, Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z3, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Composer composer, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        BorderStroke borderStrokeM2128filterChipBorder_7El2pE = borderStroke;
        SelectableChipElevation selectableChipElevationM2130filterChipElevationaqJV_2Y = selectableChipElevation;
        boolean z4 = z3;
        Function2<? super Composer, ? super Integer, Unit> function24 = function23;
        Shape shape2 = shape;
        SelectableChipColors selectableChipColorsFilterChipColors = selectableChipColors;
        Function2<? super Composer, ? super Integer, Unit> function25 = function22;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1711985619);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(FilterChip)P(9,8,5,7,3,6,11,10,1,2)462@22511L5,463@22572L18,464@22653L21,465@22723L35,474@23031L5,468@22824L554:Chip.kt#uh7d8r");
        if ((i4 & 1) != 0) {
            i5 = (-1) - (((-1) - i2) & ((-1) - 6));
        } else if ((i2 & 6) == 0) {
            int i8 = composerStartRestartGroup.changed(z2) ? 4 : 2;
            i5 = (i8 + i2) - (i8 & i2);
        } else {
            i5 = i2;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
            i5 |= 48;
        } else if ((i2 + 48) - (i2 | 48) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            int i9 = composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
            i5 = (i5 + i9) - (i5 & i9);
        }
        int i10 = (-1) - (((-1) - i4) | ((-1) - 8));
        if (i10 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 3072));
        } else if ((i2 + 3072) - (i2 | 3072) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(companion) ? 2048 : 1024)));
        }
        int i11 = i4 & 16;
        if (i11 != 0) {
            i5 = (i5 + 24576) - (i5 & 24576);
        } else if ((i2 & 24576) == 0) {
            int i12 = composerStartRestartGroup.changed(z4) ? 16384 : 8192;
            i5 = (i5 + i12) - (i5 & i12);
        }
        int i13 = (-1) - (((-1) - i4) | ((-1) - 32));
        if (i13 != 0) {
            i5 = (i5 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        } else if ((i2 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i2 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            int i14 = composerStartRestartGroup.changedInstance(function25) ? 131072 : 65536;
            i5 = (i5 + i14) - (i5 & i14);
        }
        int i15 = (-1) - (((-1) - i4) | ((-1) - 64));
        if (i15 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 1572864));
        } else if ((i2 & 1572864) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changedInstance(function24) ? 1048576 : 524288)));
        }
        if ((i2 + 12582912) - (i2 | 12582912) == 0) {
            i5 |= ((i4 & 128) == 0 && composerStartRestartGroup.changed(shape2)) ? 8388608 : 4194304;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 100663296)) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (((i4 & 256) == 0 && composerStartRestartGroup.changed(selectableChipColorsFilterChipColors)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432)));
        }
        if ((i2 & 805306368) == 0) {
            i5 |= ((-1) - (((-1) - i4) | ((-1) - 512)) == 0 && composerStartRestartGroup.changed(selectableChipElevationM2130filterChipElevationaqJV_2Y)) ? 536870912 : 268435456;
        }
        if ((i3 + 6) - (i3 | 6) == 0) {
            i6 = i3 | (((i4 + 1024) - (i4 | 1024) == 0 && composerStartRestartGroup.changed(borderStrokeM2128filterChipBorder_7El2pE)) ? 4 : 2);
        } else {
            i6 = i3;
        }
        int i16 = i4 & 2048;
        if (i16 != 0) {
            i6 |= 48;
        } else if ((-1) - (((-1) - i3) | ((-1) - 48)) == 0) {
            int i17 = composerStartRestartGroup.changed(mutableInteractionSource2) ? 32 : 16;
            i6 = (i6 + i17) - (i6 & i17);
        }
        if ((i5 + 306783379) - (306783379 | i5) == 306783378 && (-1) - (((-1) - i6) | ((-1) - 19)) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((-1) - (((-1) - i2) | ((-1) - 1)) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i10 != 0) {
                    companion = Modifier.Companion;
                }
                if (i11 != 0) {
                    z4 = true;
                }
                if (i13 != 0) {
                    function25 = null;
                }
                if (i15 != 0) {
                    function24 = null;
                }
                if ((i4 & 128) != 0) {
                    shape2 = FilterChipDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-29360129)));
                }
                if ((i4 & 256) != 0) {
                    selectableChipColorsFilterChipColors = FilterChipDefaults.INSTANCE.filterChipColors(composerStartRestartGroup, 6);
                    i7 = (i5 - 234881025) - (i5 | (-234881025));
                } else {
                    i7 = i5;
                }
                if ((-1) - (((-1) - i4) | ((-1) - 512)) != 0) {
                    selectableChipElevationM2130filterChipElevationaqJV_2Y = FilterChipDefaults.INSTANCE.m2130filterChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                    i5 = (i7 - 1879048193) - (i7 | (-1879048193));
                } else {
                    i5 = i7;
                }
                if ((i4 & 1024) != 0) {
                    FilterChipDefaults filterChipDefaults = FilterChipDefaults.INSTANCE;
                    int i18 = (i5 >> 12) & 14;
                    int i19 = (i18 + 100663296) - (i18 & 100663296);
                    int i20 = i5 << 3;
                    int i21 = (i20 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i20 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION);
                    borderStrokeM2128filterChipBorder_7El2pE = filterChipDefaults.m2128filterChipBorder_7El2pE(z4, z2, 0L, 0L, 0L, 0L, 0.0f, 0.0f, composerStartRestartGroup, (i19 + i21) - (i19 & i21), 252);
                    i6 &= -15;
                }
                if (i16 != 0) {
                    mutableInteractionSource2 = null;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i4 & 128) != 0) {
                    i5 = (i5 - 29360129) - (i5 | (-29360129));
                }
                if ((i4 + 256) - (i4 | 256) != 0) {
                    i5 &= -234881025;
                }
                if ((i4 + 512) - (i4 | 512) != 0) {
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-1879048193)));
                }
                if ((-1) - (((-1) - i4) | ((-1) - 1024)) != 0) {
                    i6 = (-1) - (((-1) - i6) | ((-1) - (-15)));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1711985619, i5, i6, "androidx.compose.material3.FilterChip (Chip.kt:468)");
            }
            TextStyle value = TypographyKt.getValue(FilterChipTokens.INSTANCE.getLabelTextFont(), composerStartRestartGroup, 6);
            float fM2131getHeightD9Ej5fM = FilterChipDefaults.INSTANCE.m2131getHeightD9Ej5fM();
            PaddingValues paddingValues = FilterChipPadding;
            int i22 = i5 >> 6;
            int i23 = ((-1) - (((-1) - (i5 & 14)) & ((-1) - 12582912))) | ((i22 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i22 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION));
            int i24 = i5 << 3;
            int i25 = i24 & 896;
            int i26 = (i23 + i25) - (i23 & i25);
            int i27 = (i5 >> 3) & 7168;
            int i28 = (i26 + i27) - (i26 & i27);
            int i29 = i5 << 6;
            int i30 = (-1) - (((-1) - (i28 | ((i29 + 57344) - (i29 | 57344)))) & ((-1) - ((i24 + 3670016) - (i24 | 3670016))));
            int i31 = 234881024 & i29;
            int i32 = (-1) - (((-1) - ((i30 + i31) - (i30 & i31))) & ((-1) - ((1879048192 + i29) - (1879048192 | i29))));
            int i33 = i5 >> 24;
            int i34 = (-1) - (((-1) - (i33 & 14)) & ((-1) - 27648));
            int i35 = (i33 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i33 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION);
            int i36 = i6 << 12;
            m1893SelectableChipu0RnIRE(z2, companion, function0, z4, function2, value, function25, null, function24, shape2, selectableChipColorsFilterChipColors, selectableChipElevationM2130filterChipElevationaqJV_2Y, borderStrokeM2128filterChipBorder_7El2pE, fM2131getHeightD9Ej5fM, paddingValues, mutableInteractionSource2, composerStartRestartGroup, i32, (-1) - (((-1) - ((-1) - (((-1) - ((i35 + i34) - (i35 & i34))) & ((-1) - ((-1) - (((-1) - (i6 << 6)) | ((-1) - 896))))))) & ((-1) - ((i36 + 458752) - (i36 | 458752)))));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt.FilterChip.1
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$changed1;
                final /* synthetic */ int $$default;
                final /* synthetic */ BorderStroke $border;
                final /* synthetic */ SelectableChipColors $colors;
                final /* synthetic */ SelectableChipElevation $elevation;
                final /* synthetic */ boolean $enabled;
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ Function0<Unit> $onClick;
                final /* synthetic */ boolean $selected;
                final /* synthetic */ Shape $shape;
                final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C06181(boolean z22, Function0<Unit> function02, Function2<? super Composer, ? super Integer, Unit> function26, Modifier companion2, boolean z42, Function2<? super Composer, ? super Integer, Unit> function252, Function2<? super Composer, ? super Integer, Unit> function242, Shape shape22, SelectableChipColors selectableChipColorsFilterChipColors2, SelectableChipElevation selectableChipElevationM2130filterChipElevationaqJV_2Y2, BorderStroke borderStrokeM2128filterChipBorder_7El2pE2, MutableInteractionSource mutableInteractionSource22, int i210, int i37, int i42) {
                    super(2);
                    z = z22;
                    function0 = function02;
                    function2 = function26;
                    modifier = companion2;
                    z = z42;
                    function2 = function252;
                    function2 = function242;
                    shape = shape22;
                    selectableChipColors = selectableChipColorsFilterChipColors2;
                    selectableChipElevation = selectableChipElevationM2130filterChipElevationaqJV_2Y2;
                    borderStroke = borderStrokeM2128filterChipBorder_7El2pE2;
                    mutableInteractionSource = mutableInteractionSource22;
                    i = i210;
                    i = i37;
                    i = i42;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i210) {
                    boolean z22 = z;
                    Function0<Unit> function02 = function0;
                    Function2<Composer, Integer, Unit> function26 = function2;
                    Modifier modifier2 = modifier;
                    boolean z32 = z;
                    Function2<Composer, Integer, Unit> function222 = function2;
                    Function2<Composer, Integer, Unit> function232 = function2;
                    Shape shape3 = shape;
                    SelectableChipColors selectableChipColors2 = selectableChipColors;
                    SelectableChipElevation selectableChipElevation2 = selectableChipElevation;
                    BorderStroke borderStroke2 = borderStroke;
                    MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
                    int i37 = i;
                    ChipKt.FilterChip(z22, function02, function26, modifier2, z32, function222, function232, shape3, selectableChipColors2, selectableChipElevation2, borderStroke2, mutableInteractionSource3, composer2, RecomposeScopeImplKt.updateChangedFlags((i37 + 1) - (i37 & 1)), RecomposeScopeImplKt.updateChangedFlags(i), i);
                }
            });
        }
    }

    public static final void ElevatedFilterChip(boolean z2, Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z3, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Composer composer, int i2, int i3, int i4) {
        int i5;
        int i6;
        MutableInteractionSource mutableInteractionSource2;
        Modifier.Companion companion = modifier;
        BorderStroke borderStroke2 = borderStroke;
        SelectableChipColors selectableChipColorsElevatedFilterChipColors = selectableChipColors;
        Shape shape2 = shape;
        Function2<? super Composer, ? super Integer, Unit> function24 = function22;
        boolean z4 = z3;
        Function2<? super Composer, ? super Integer, Unit> function25 = function23;
        SelectableChipElevation selectableChipElevationM2127elevatedFilterChipElevationaqJV_2Y = selectableChipElevation;
        Composer composerStartRestartGroup = composer.startRestartGroup(-106647389);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ElevatedFilterChip)P(9,8,5,7,3,6,11,10,1,2)546@26622L5,547@26683L26,548@26772L29,558@27108L5,552@26901L554:Chip.kt#uh7d8r");
        if ((i4 + 1) - (i4 | 1) != 0) {
            i5 = (i2 + 6) - (i2 & 6);
        } else if ((i2 & 6) == 0) {
            int i7 = composerStartRestartGroup.changed(z2) ? 4 : 2;
            i5 = (i7 + i2) - (i7 & i2);
        } else {
            i5 = i2;
        }
        Function0<Unit> function02 = function0;
        if ((i4 & 2) != 0) {
            i5 = (i5 + 48) - (i5 & 48);
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            int i8 = composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
            i5 = (i5 + i8) - (i5 & i8);
        }
        if ((-1) - (((-1) - i4) | ((-1) - 4)) != 0) {
            i5 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i9 = composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
            i5 = (i5 + i9) - (i5 & i9);
        }
        int i10 = (i4 + 8) - (i4 | 8);
        if (i10 != 0) {
            i5 = (i5 + 3072) - (i5 & 3072);
        } else if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            int i11 = composerStartRestartGroup.changed(companion) ? 2048 : 1024;
            i5 = (i5 + i11) - (i5 & i11);
        }
        int i12 = (-1) - (((-1) - i4) | ((-1) - 16));
        if (i12 != 0) {
            i5 |= 24576;
        } else if ((i2 & 24576) == 0) {
            int i13 = composerStartRestartGroup.changed(z4) ? 16384 : 8192;
            i5 = (i5 + i13) - (i5 & i13);
        }
        int i14 = (-1) - (((-1) - i4) | ((-1) - 32));
        if (i14 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE));
        } else if ((-1) - (((-1) - i2) | ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE)) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changedInstance(function24) ? 131072 : 65536)));
        }
        int i15 = (i4 + 64) - (i4 | 64);
        if (i15 != 0) {
            i5 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changedInstance(function25) ? 1048576 : 524288)));
        }
        if ((i2 & 12582912) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (((i4 + 128) - (i4 | 128) == 0 && composerStartRestartGroup.changed(shape2)) ? 8388608 : 4194304)));
        }
        if ((i2 + 100663296) - (i2 | 100663296) == 0) {
            i5 |= ((i4 + 256) - (i4 | 256) == 0 && composerStartRestartGroup.changed(selectableChipColorsElevatedFilterChipColors)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            int i16 = ((i4 + 512) - (i4 | 512) == 0 && composerStartRestartGroup.changed(selectableChipElevationM2127elevatedFilterChipElevationaqJV_2Y)) ? 536870912 : 268435456;
            i5 = (i5 + i16) - (i5 & i16);
        }
        int i17 = i4 & 1024;
        if (i17 != 0) {
            i6 = i3 | 6;
        } else if ((-1) - (((-1) - i3) | ((-1) - 6)) == 0) {
            int i18 = composerStartRestartGroup.changed(borderStroke2) ? 4 : 2;
            i6 = (i3 + i18) - (i3 & i18);
        } else {
            i6 = i3;
        }
        int i19 = i4 & 2048;
        if (i19 != 0) {
            i6 = (i6 + 48) - (i6 & 48);
        } else if ((i3 + 48) - (i3 | 48) == 0) {
            int i20 = composerStartRestartGroup.changed(mutableInteractionSource) ? 32 : 16;
            i6 = (i6 + i20) - (i6 & i20);
        }
        if ((-1) - (((-1) - i5) | ((-1) - 306783379)) == 306783378 && (i6 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            mutableInteractionSource2 = mutableInteractionSource;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 + 1) - (i2 | 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i10 != 0) {
                    companion = Modifier.Companion;
                }
                if (i12 != 0) {
                    z4 = true;
                }
                mutableInteractionSource2 = null;
                if (i14 != 0) {
                    function24 = null;
                }
                if (i15 != 0) {
                    function25 = null;
                }
                if ((-1) - (((-1) - i4) | ((-1) - 128)) != 0) {
                    shape2 = FilterChipDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    i5 = (i5 - 29360129) - (i5 | (-29360129));
                }
                if ((i4 + 256) - (i4 | 256) != 0) {
                    selectableChipColorsElevatedFilterChipColors = FilterChipDefaults.INSTANCE.elevatedFilterChipColors(composerStartRestartGroup, 6);
                    i5 &= -234881025;
                }
                if ((i4 & 512) != 0) {
                    selectableChipElevationM2127elevatedFilterChipElevationaqJV_2Y = FilterChipDefaults.INSTANCE.m2127elevatedFilterChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-1879048193)));
                }
                if (i17 != 0) {
                    borderStroke2 = null;
                }
                if (i19 == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((-1) - (((-1) - i4) | ((-1) - 128)) != 0) {
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-29360129)));
                }
                if ((i4 + 256) - (i4 | 256) != 0) {
                    i5 &= -234881025;
                }
                if ((i4 + 512) - (i4 | 512) != 0) {
                    i5 &= -1879048193;
                }
                mutableInteractionSource2 = mutableInteractionSource;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-106647389, i5, i6, "androidx.compose.material3.ElevatedFilterChip (Chip.kt:552)");
            }
            TextStyle value = TypographyKt.getValue(FilterChipTokens.INSTANCE.getLabelTextFont(), composerStartRestartGroup, 6);
            float fM2131getHeightD9Ej5fM = FilterChipDefaults.INSTANCE.m2131getHeightD9Ej5fM();
            PaddingValues paddingValues = FilterChipPadding;
            int i21 = i5 >> 6;
            int i22 = i5 << 3;
            int i23 = (-1) - (((-1) - ((-1) - (((-1) - ((-1) - (((-1) - (14 & i5)) & ((-1) - 12582912)))) & ((-1) - ((i21 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i21 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)))))) & ((-1) - ((-1) - (((-1) - i22) | ((-1) - 896)))));
            int i24 = (i5 >> 3) & 7168;
            int i25 = (i23 + i24) - (i23 & i24);
            int i26 = i5 << 6;
            int i27 = (-1) - (((-1) - i25) & ((-1) - ((-1) - (((-1) - i26) | ((-1) - 57344)))));
            int i28 = (-1) - (((-1) - i22) | ((-1) - 3670016));
            int i29 = ((i27 + i28) - (i27 & i28)) | (234881024 & i26);
            int i30 = 1879048192 & i26;
            int i31 = (i29 + i30) - (i29 & i30);
            int i32 = i5 >> 24;
            int i33 = (-1) - (((-1) - ((-1) - (((-1) - ((-1) - (((-1) - i32) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)))) & ((-1) - ((i32 & 14) | 27648))))) & ((-1) - ((-1) - (((-1) - (i6 << 6)) | ((-1) - 896)))));
            int i34 = (i6 << 12) & 458752;
            function02 = function02;
            m1893SelectableChipu0RnIRE(z2, companion, function02, z4, function2, value, function24, null, function25, shape2, selectableChipColorsElevatedFilterChipColors, selectableChipElevationM2127elevatedFilterChipElevationaqJV_2Y, borderStroke2, fM2131getHeightD9Ej5fM, paddingValues, mutableInteractionSource2, composerStartRestartGroup, i31, (i33 + i34) - (i33 & i34));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt.ElevatedFilterChip.1
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$changed1;
                final /* synthetic */ int $$default;
                final /* synthetic */ BorderStroke $border;
                final /* synthetic */ SelectableChipColors $colors;
                final /* synthetic */ SelectableChipElevation $elevation;
                final /* synthetic */ boolean $enabled;
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ Function0<Unit> $onClick;
                final /* synthetic */ boolean $selected;
                final /* synthetic */ Shape $shape;
                final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C06151(boolean z22, Function0<Unit> function022, Function2<? super Composer, ? super Integer, Unit> function26, Modifier companion2, boolean z42, Function2<? super Composer, ? super Integer, Unit> function242, Function2<? super Composer, ? super Integer, Unit> function252, Shape shape22, SelectableChipColors selectableChipColorsElevatedFilterChipColors2, SelectableChipElevation selectableChipElevationM2127elevatedFilterChipElevationaqJV_2Y2, BorderStroke borderStroke22, MutableInteractionSource mutableInteractionSource22, int i210, int i35, int i42) {
                    super(2);
                    z = z22;
                    function0 = function022;
                    function2 = function26;
                    modifier = companion2;
                    z = z42;
                    function2 = function242;
                    function2 = function252;
                    shape = shape22;
                    selectableChipColors = selectableChipColorsElevatedFilterChipColors2;
                    selectableChipElevation = selectableChipElevationM2127elevatedFilterChipElevationaqJV_2Y2;
                    borderStroke = borderStroke22;
                    mutableInteractionSource = mutableInteractionSource22;
                    i = i210;
                    i = i35;
                    i = i42;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i210) {
                    boolean z22 = z;
                    Function0<Unit> function03 = function0;
                    Function2<Composer, Integer, Unit> function26 = function2;
                    Modifier modifier2 = modifier;
                    boolean z32 = z;
                    Function2<Composer, Integer, Unit> function222 = function2;
                    Function2<Composer, Integer, Unit> function232 = function2;
                    Shape shape3 = shape;
                    SelectableChipColors selectableChipColors2 = selectableChipColors;
                    SelectableChipElevation selectableChipElevation2 = selectableChipElevation;
                    BorderStroke borderStroke3 = borderStroke;
                    MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
                    int i35 = i;
                    ChipKt.ElevatedFilterChip(z22, function03, function26, modifier2, z32, function222, function232, shape3, selectableChipColors2, selectableChipElevation2, borderStroke3, mutableInteractionSource3, composer2, RecomposeScopeImplKt.updateChangedFlags((i35 + 1) - (i35 & 1)), RecomposeScopeImplKt.updateChangedFlags(i), i);
                }
            });
        }
    }

    public static final void InputChip(boolean z2, Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z3, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Composer composer, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        BorderStroke borderStrokeM2182inputChipBorder_7El2pE = borderStroke;
        SelectableChipElevation selectableChipElevationM2184inputChipElevationaqJV_2Y = selectableChipElevation;
        SelectableChipColors selectableChipColorsInputChipColors = selectableChipColors;
        Shape shape2 = shape;
        Function2<? super Composer, ? super Integer, Unit> function25 = function24;
        Function2<? super Composer, ? super Integer, Unit> function26 = function23;
        Function2<? super Composer, ? super Integer, Unit> function27 = function22;
        boolean z4 = z3;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(1658928131);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(InputChip)P(10,9,6,8,4,7!1,12,11,2,3)638@30882L5,639@30942L17,640@31021L20,641@31089L34,671@32220L5,665@32014L745:Chip.kt#uh7d8r");
        if ((-1) - (((-1) - i4) | ((-1) - 1)) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(z2) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 48));
        } else if ((i2 & 48) == 0) {
            int i8 = composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
            i5 = (i5 + i8) - (i5 & i8);
        }
        if ((i4 + 4) - (i4 | 4) != 0) {
            i5 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changedInstance(function2) ? 256 : 128)));
        }
        int i9 = i4 & 8;
        if (i9 != 0) {
            i5 = (i5 + 3072) - (i5 & 3072);
        } else if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(companion) ? 2048 : 1024)));
        }
        int i10 = i4 & 16;
        if (i10 != 0) {
            i5 = (i5 + 24576) - (i5 & 24576);
        } else if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            i5 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
        }
        int i11 = i4 & 32;
        if (i11 != 0) {
            i5 = (i5 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changedInstance(function27) ? 131072 : 65536)));
        }
        int i12 = (-1) - (((-1) - i4) | ((-1) - 64));
        if (i12 != 0) {
            i5 = (i5 + 1572864) - (i5 & 1572864);
        } else if ((i2 & 1572864) == 0) {
            int i13 = composerStartRestartGroup.changedInstance(function26) ? 1048576 : 524288;
            i5 = (i5 + i13) - (i5 & i13);
        }
        int i14 = (i4 + 128) - (i4 | 128);
        if (i14 != 0) {
            i5 = (i5 + 12582912) - (i5 & 12582912);
        } else if ((i2 & 12582912) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function25) ? 8388608 : 4194304;
        }
        if ((i2 + 100663296) - (i2 | 100663296) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (((-1) - (((-1) - i4) | ((-1) - 256)) == 0 && composerStartRestartGroup.changed(shape2)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432)));
        }
        if ((i2 & 805306368) == 0) {
            int i15 = ((i4 + 512) - (i4 | 512) == 0 && composerStartRestartGroup.changed(selectableChipColorsInputChipColors)) ? 536870912 : 268435456;
            i5 = (i5 + i15) - (i5 & i15);
        }
        if ((i3 + 6) - (i3 | 6) == 0) {
            i6 = i3 | (((i4 + 1024) - (i4 | 1024) == 0 && composerStartRestartGroup.changed(selectableChipElevationM2184inputChipElevationaqJV_2Y)) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            int i16 = ((-1) - (((-1) - i4) | ((-1) - 2048)) == 0 && composerStartRestartGroup.changed(borderStrokeM2182inputChipBorder_7El2pE)) ? 32 : 16;
            i6 = (i6 + i16) - (i6 & i16);
        }
        int i17 = (-1) - (((-1) - i4) | ((-1) - 4096));
        if (i17 != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((i3 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i3 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changed(mutableInteractionSource2) ? 256 : 128)));
        }
        if ((-1) - (((-1) - i5) | ((-1) - 306783379)) != 306783378 || (i6 + 147) - (147 | i6) != 146 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            ComposableLambda composableLambdaRememberComposableLambda = null;
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i9 != 0) {
                    companion = Modifier.Companion;
                }
                if (i10 != 0) {
                    z4 = true;
                }
                if (i11 != 0) {
                    function27 = null;
                }
                if (i12 != 0) {
                    function26 = null;
                }
                if (i14 != 0) {
                    function25 = null;
                }
                if ((-1) - (((-1) - i4) | ((-1) - 256)) != 0) {
                    shape2 = InputChipDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    i5 &= -234881025;
                }
                if ((-1) - (((-1) - i4) | ((-1) - 512)) != 0) {
                    selectableChipColorsInputChipColors = InputChipDefaults.INSTANCE.inputChipColors(composerStartRestartGroup, 6);
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-1879048193)));
                }
                if ((-1) - (((-1) - i4) | ((-1) - 1024)) != 0) {
                    selectableChipElevationM2184inputChipElevationaqJV_2Y = InputChipDefaults.INSTANCE.m2184inputChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                    i6 = (-1) - (((-1) - i6) | ((-1) - (-15)));
                }
                if ((i4 + 2048) - (i4 | 2048) != 0) {
                    borderStrokeM2182inputChipBorder_7El2pE = InputChipDefaults.INSTANCE.m2182inputChipBorder_7El2pE(z4, z2, 0L, 0L, 0L, 0L, 0.0f, 0.0f, composerStartRestartGroup, ((-1) - (((-1) - ((-1) - (((-1) - (i5 >> 12)) | ((-1) - 14)))) & ((-1) - 100663296))) | ((i5 << 3) & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION), 252);
                    i6 = (-1) - (((-1) - i6) | ((-1) - (-113)));
                }
                if (i17 != 0) {
                    mutableInteractionSource2 = null;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i4 & 256) != 0) {
                    i5 = (i5 - 234881025) - (i5 | (-234881025));
                }
                if ((-1) - (((-1) - i4) | ((-1) - 512)) != 0) {
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-1879048193)));
                }
                if ((i4 + 1024) - (i4 | 1024) != 0) {
                    i6 = (-1) - (((-1) - i6) | ((-1) - (-15)));
                }
                if ((i4 + 2048) - (i4 | 2048) != 0) {
                    i6 = (-1) - (((-1) - i6) | ((-1) - (-113)));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1658928131, i5, i6, "androidx.compose.material3.InputChip (Chip.kt:643)");
            }
            composerStartRestartGroup.startReplaceGroup(417920884);
            ComposerKt.sourceInformation(composerStartRestartGroup, "649@31531L5,651@31584L419");
            if (function26 != null) {
                i7 = 6;
                composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1154227507, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt.InputChip.1
                    final /* synthetic */ Function2<Composer, Integer, Unit> $avatar;
                    final /* synthetic */ float $avatarOpacity;
                    final /* synthetic */ Shape $avatarShape;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C06191(float f2, Shape shape3, Function2<? super Composer, ? super Integer, Unit> function262) {
                        super(2);
                        f = f2;
                        shape = shape3;
                        function2 = function262;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i18) {
                        ComposerKt.sourceInformation(composer2, "C654@31685L180,652@31602L387:Chip.kt#uh7d8r");
                        if ((i18 + 3) - (3 | i18) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1154227507, i18, -1, "androidx.compose.material3.InputChip.<anonymous> (Chip.kt:652)");
                        }
                        Modifier.Companion companion2 = Modifier.Companion;
                        ComposerKt.sourceInformationMarkerStart(composer2, -724235578, "CC(remember):Chip.kt#9igjgp");
                        boolean zChanged = composer2.changed(f);
                        boolean zChanged2 = composer2.changed(shape);
                        boolean z5 = ((zChanged ? 1 : 0) + (zChanged2 ? 1 : 0)) - ((zChanged ? 1 : 0) & (zChanged2 ? 1 : 0)) == 1;
                        final float f2 = f;
                        final Shape shape3 = shape;
                        Object objRememberedValue = composer2.rememberedValue();
                        if (z5 || objRememberedValue == Composer.Companion.getEmpty()) {
                            objRememberedValue = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.ChipKt$InputChip$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                    invoke2(graphicsLayerScope);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                                    graphicsLayerScope.setAlpha(f2);
                                    graphicsLayerScope.setShape(shape3);
                                    graphicsLayerScope.setClip(true);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion2, (Function1) objRememberedValue);
                        Alignment center = Alignment.Companion.getCenter();
                        Function2<Composer, Integer, Unit> function28 = function2;
                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierGraphicsLayer);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM3671constructorimpl = Updater.m3671constructorimpl(composer2);
                        Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer2, 1618257738, "C661@31963L8:Chip.kt#uh7d8r");
                        function28.invoke(composer2, 0);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54);
            } else {
                i7 = 6;
            }
            composerStartRestartGroup.endReplaceGroup();
            TextStyle value = TypographyKt.getValue(InputChipTokens.INSTANCE.getLabelTextFont(), composerStartRestartGroup, i7);
            float fM2180getHeightD9Ej5fM = InputChipDefaults.INSTANCE.m2180getHeightD9Ej5fM();
            PaddingValues paddingValuesInputChipPadding = inputChipPadding(composableLambdaRememberComposableLambda != null, function27 != null, function25 != null);
            int i18 = (-1) - (((-1) - (i5 & 14)) & ((-1) - ((i5 >> 6) & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)));
            int i19 = i5 << 3;
            int i20 = (i19 + 896) - (896 | i19);
            int i21 = ((-1) - (((-1) - ((((i18 + i20) - (i18 & i20)) | ((-1) - (((-1) - (i5 >> 3)) | ((-1) - 7168)))) | ((i5 << 6) & 57344))) & ((-1) - ((-1) - (((-1) - 3670016) | ((-1) - i19)))))) | (234881024 & i19);
            int i22 = (-1) - (((-1) - i19) | ((-1) - 1879048192));
            int i23 = (i21 + i22) - (i21 & i22);
            int i24 = i6 << 3;
            int i25 = (-1) - (((-1) - (((-1) - (((-1) - ((i5 >> 27) & 14)) & ((-1) - 3072))) | (112 & i24))) & ((-1) - (i24 & 896)));
            int i26 = (-1) - (((-1) - (i6 << 9)) | ((-1) - 458752));
            m1893SelectableChipu0RnIRE(z2, companion, function0, z4, function2, value, function27, composableLambdaRememberComposableLambda, function25, shape2, selectableChipColorsInputChipColors, selectableChipElevationM2184inputChipElevationaqJV_2Y, borderStrokeM2182inputChipBorder_7El2pE, fM2180getHeightD9Ej5fM, paddingValuesInputChipPadding, mutableInteractionSource2, composerStartRestartGroup, i23, (i25 + i26) - (i25 & i26));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt.InputChip.2
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$changed1;
                final /* synthetic */ int $$default;
                final /* synthetic */ Function2<Composer, Integer, Unit> $avatar;
                final /* synthetic */ BorderStroke $border;
                final /* synthetic */ SelectableChipColors $colors;
                final /* synthetic */ SelectableChipElevation $elevation;
                final /* synthetic */ boolean $enabled;
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ Function0<Unit> $onClick;
                final /* synthetic */ boolean $selected;
                final /* synthetic */ Shape $shape;
                final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass2(boolean z22, Function0<Unit> function02, Function2<? super Composer, ? super Integer, Unit> function28, Modifier companion2, boolean z42, Function2<? super Composer, ? super Integer, Unit> function272, Function2<? super Composer, ? super Integer, Unit> function262, Function2<? super Composer, ? super Integer, Unit> function252, Shape shape22, SelectableChipColors selectableChipColorsInputChipColors2, SelectableChipElevation selectableChipElevationM2184inputChipElevationaqJV_2Y2, BorderStroke borderStrokeM2182inputChipBorder_7El2pE2, MutableInteractionSource mutableInteractionSource22, int i27, int i32, int i42) {
                    super(2);
                    z = z22;
                    function0 = function02;
                    function2 = function28;
                    modifier = companion2;
                    z = z42;
                    function2 = function272;
                    function2 = function262;
                    function2 = function252;
                    shape = shape22;
                    selectableChipColors = selectableChipColorsInputChipColors2;
                    selectableChipElevation = selectableChipElevationM2184inputChipElevationaqJV_2Y2;
                    borderStroke = borderStrokeM2182inputChipBorder_7El2pE2;
                    mutableInteractionSource = mutableInteractionSource22;
                    i = i27;
                    i = i32;
                    i = i42;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i27) {
                    boolean z22 = z;
                    Function0<Unit> function02 = function0;
                    Function2<Composer, Integer, Unit> function28 = function2;
                    Modifier modifier2 = modifier;
                    boolean z32 = z;
                    Function2<Composer, Integer, Unit> function222 = function2;
                    Function2<Composer, Integer, Unit> function232 = function2;
                    Function2<Composer, Integer, Unit> function242 = function2;
                    Shape shape3 = shape;
                    SelectableChipColors selectableChipColors2 = selectableChipColors;
                    SelectableChipElevation selectableChipElevation2 = selectableChipElevation;
                    BorderStroke borderStroke2 = borderStroke;
                    MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
                    int i32 = i;
                    ChipKt.InputChip(z22, function02, function28, modifier2, z32, function222, function232, function242, shape3, selectableChipColors2, selectableChipElevation2, borderStroke2, mutableInteractionSource3, composer2, RecomposeScopeImplKt.updateChangedFlags((i32 + 1) - (i32 & 1)), RecomposeScopeImplKt.updateChangedFlags(i), i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.ChipKt$InputChip$1 */
    /* JADX INFO: compiled from: Chip.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJc\u0003İY\u0006^\ntK֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq>"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06191 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Function2<Composer, Integer, Unit> $avatar;
        final /* synthetic */ float $avatarOpacity;
        final /* synthetic */ Shape $avatarShape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C06191(float f2, Shape shape3, Function2<? super Composer, ? super Integer, Unit> function262) {
            super(2);
            f = f2;
            shape = shape3;
            function2 = function262;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
            invoke(composer2, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer2, int i18) {
            ComposerKt.sourceInformation(composer2, "C654@31685L180,652@31602L387:Chip.kt#uh7d8r");
            if ((i18 + 3) - (3 | i18) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1154227507, i18, -1, "androidx.compose.material3.InputChip.<anonymous> (Chip.kt:652)");
            }
            Modifier.Companion companion2 = Modifier.Companion;
            ComposerKt.sourceInformationMarkerStart(composer2, -724235578, "CC(remember):Chip.kt#9igjgp");
            boolean zChanged = composer2.changed(f);
            boolean zChanged2 = composer2.changed(shape);
            boolean z5 = ((zChanged ? 1 : 0) + (zChanged2 ? 1 : 0)) - ((zChanged ? 1 : 0) & (zChanged2 ? 1 : 0)) == 1;
            final float f2 = f;
            final Shape shape3 = shape;
            Object objRememberedValue = composer2.rememberedValue();
            if (z5 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.ChipKt$InputChip$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                        invoke2(graphicsLayerScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                        graphicsLayerScope.setAlpha(f2);
                        graphicsLayerScope.setShape(shape3);
                        graphicsLayerScope.setClip(true);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion2, (Function1) objRememberedValue);
            Alignment center = Alignment.Companion.getCenter();
            Function2<Composer, Integer, Unit> function28 = function2;
            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierGraphicsLayer);
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer composerM3671constructorimpl = Updater.m3671constructorimpl(composer2);
            Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, 1618257738, "C661@31963L8:Chip.kt#uh7d8r");
            function28.invoke(composer2, 0);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public static final void SuggestionChip(Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function22, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Composer composer, int i2, int i3) {
        int i4;
        MutableInteractionSource mutableInteractionSource2;
        int i5;
        BorderStroke borderStrokeM2558suggestionChipBorderh1eTWw = borderStroke;
        boolean z3 = z2;
        ChipColors chipColorsSuggestionChipColors = chipColors;
        ChipElevation chipElevationM2560suggestionChipElevationaqJV_2Y = chipElevation;
        Shape shape2 = shape;
        Function2<? super Composer, ? super Integer, Unit> function23 = function22;
        MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1700130831);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SuggestionChip)P(8,6,7,3,4,9,1,2)740@35497L5,741@35552L22,742@35631L25,743@35709L29,751@35977L5,746@35805L538:Chip.kt#uh7d8r");
        if ((i3 + 1) - (i3 | 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            int i6 = composerStartRestartGroup.changedInstance(function0) ? 4 : 2;
            i4 = (i6 + i2) - (i6 & i2);
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 48));
        } else if ((i2 & 48) == 0) {
            int i7 = composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
            i4 = (i4 + i7) - (i4 & i7);
        }
        int i8 = i3 & 4;
        if (i8 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i9 = composerStartRestartGroup.changed(companion) ? 256 : 128;
            i4 = (i4 + i9) - (i4 & i9);
        }
        int i10 = i3 & 8;
        if (i10 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 3072));
        } else if ((i2 + 3072) - (i2 | 3072) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(z3) ? 2048 : 1024)));
        }
        int i11 = (-1) - (((-1) - i3) | ((-1) - 16));
        if (i11 != 0) {
            i4 |= 24576;
        } else if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            int i12 = composerStartRestartGroup.changedInstance(function23) ? 16384 : 8192;
            i4 = (i4 + i12) - (i4 & i12);
        }
        if ((196608 & i2) == 0) {
            int i13 = ((i3 & 32) == 0 && composerStartRestartGroup.changed(shape2)) ? 131072 : 65536;
            i4 = (i4 + i13) - (i4 & i13);
        }
        if ((-1) - (((-1) - 1572864) | ((-1) - i2)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((i3 & 64) == 0 && composerStartRestartGroup.changed(chipColorsSuggestionChipColors)) ? 1048576 : 524288)));
        }
        if ((i2 & 12582912) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((-1) - (((-1) - i3) | ((-1) - 128)) == 0 && composerStartRestartGroup.changed(chipElevationM2560suggestionChipElevationaqJV_2Y)) ? 8388608 : 4194304)));
        }
        if ((i2 + 100663296) - (i2 | 100663296) == 0) {
            int i14 = ((i3 & 256) == 0 && composerStartRestartGroup.changed(borderStrokeM2558suggestionChipBorderh1eTWw)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            i4 = (i4 + i14) - (i4 & i14);
        }
        int i15 = (i3 + 512) - (i3 | 512);
        if (i15 != 0) {
            i4 = (i4 + 805306368) - (i4 & 805306368);
        } else if ((i2 & 805306368) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(mutableInteractionSource3) ? 536870912 : 268435456)));
        }
        if ((-1) - (((-1) - i4) | ((-1) - 306783379)) == 306783378 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((-1) - (((-1) - i2) | ((-1) - 1)) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i8 != 0) {
                    companion = Modifier.Companion;
                }
                if (i10 != 0) {
                    z3 = true;
                }
                mutableInteractionSource2 = null;
                if (i11 != 0) {
                    function23 = null;
                }
                if ((i3 + 32) - (i3 | 32) != 0) {
                    shape2 = SuggestionChipDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    i4 &= -458753;
                }
                if ((i3 & 64) != 0) {
                    chipColorsSuggestionChipColors = SuggestionChipDefaults.INSTANCE.suggestionChipColors(composerStartRestartGroup, 6);
                    i5 = (i4 - 3670017) - (i4 | (-3670017));
                } else {
                    i5 = i4;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 128)) != 0) {
                    chipElevationM2560suggestionChipElevationaqJV_2Y = SuggestionChipDefaults.INSTANCE.m2560suggestionChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-29360129)));
                }
                if ((i3 + 256) - (i3 | 256) != 0) {
                    borderStrokeM2558suggestionChipBorderh1eTWw = SuggestionChipDefaults.INSTANCE.m2558suggestionChipBorderh1eTWw(z3, 0L, 0L, 0.0f, composerStartRestartGroup, (-1) - (((-1) - ((-1) - (((-1) - (i5 >> 9)) | ((-1) - 14)))) & ((-1) - 24576)), 14);
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-234881025)));
                }
                if (i15 == 0) {
                    mutableInteractionSource2 = mutableInteractionSource3;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 & 32) != 0) {
                    i4 = (i4 - 458753) - (i4 | (-458753));
                }
                if ((i3 & 64) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-3670017)));
                }
                if ((i3 & 128) != 0) {
                    i4 = (i4 - 29360129) - (i4 | (-29360129));
                }
                if ((i3 + 256) - (i3 | 256) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-234881025)));
                }
                mutableInteractionSource2 = mutableInteractionSource3;
                i5 = i4;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1700130831, i5, -1, "androidx.compose.material3.SuggestionChip (Chip.kt:746)");
            }
            TextStyle value = TypographyKt.getValue(SuggestionChipTokens.INSTANCE.getLabelTextFont(), composerStartRestartGroup, 6);
            long jM1882labelColorvNxB06k$material3_release = chipColorsSuggestionChipColors.m1882labelColorvNxB06k$material3_release(z3);
            float fM2555getHeightD9Ej5fM = SuggestionChipDefaults.INSTANCE.m2555getHeightD9Ej5fM();
            PaddingValues paddingValues = SuggestionChipPadding;
            int i16 = (i5 >> 6) & 14;
            int i17 = i5 << 6;
            int i18 = ((-1) - (((-1) - ((((i16 + 12582912) - (i16 & 12582912)) | ((-1) - (((-1) - (i5 << 3)) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)))) | ((-1) - (((-1) - (i5 >> 3)) | ((-1) - 896))))) & ((-1) - (7168 & i17)))) | ((-1) - (((-1) - i17) | ((-1) - 3670016)));
            int i19 = i5 << 9;
            int i20 = i18 | ((234881024 + i19) - (234881024 | i19));
            int i21 = (-1) - (((-1) - i19) | ((-1) - 1879048192));
            int i22 = (i20 + i21) - (i20 & i21);
            int i23 = i5 >> 21;
            int i24 = i23 & 14;
            int i25 = (-1) - (((-1) - (i23 & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)) & ((-1) - ((i24 + 3456) - (i24 & 3456))));
            int i26 = (i5 >> 15) & 57344;
            m1891ChipnkUnTEs(companion, function0, z3, function2, value, jM1882labelColorvNxB06k$material3_release, function23, null, shape2, chipColorsSuggestionChipColors, chipElevationM2560suggestionChipElevationaqJV_2Y, borderStrokeM2558suggestionChipBorderh1eTWw, fM2555getHeightD9Ej5fM, paddingValues, mutableInteractionSource2, composerStartRestartGroup, i22, (i25 + i26) - (i25 & i26));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            mutableInteractionSource3 = mutableInteractionSource2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt.SuggestionChip.1
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ BorderStroke $border;
                final /* synthetic */ ChipColors $colors;
                final /* synthetic */ ChipElevation $elevation;
                final /* synthetic */ boolean $enabled;
                final /* synthetic */ Function2<Composer, Integer, Unit> $icon;
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ Function0<Unit> $onClick;
                final /* synthetic */ Shape $shape;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C06201(Function0<Unit> function02, Function2<? super Composer, ? super Integer, Unit> function24, Modifier companion2, boolean z32, Function2<? super Composer, ? super Integer, Unit> function232, Shape shape22, ChipColors chipColorsSuggestionChipColors2, ChipElevation chipElevationM2560suggestionChipElevationaqJV_2Y2, BorderStroke borderStrokeM2558suggestionChipBorderh1eTWw2, MutableInteractionSource mutableInteractionSource32, int i27, int i32) {
                    super(2);
                    function0 = function02;
                    function2 = function24;
                    modifier = companion2;
                    z = z32;
                    function2 = function232;
                    shape = shape22;
                    chipColors = chipColorsSuggestionChipColors2;
                    chipElevation = chipElevationM2560suggestionChipElevationaqJV_2Y2;
                    borderStroke = borderStrokeM2558suggestionChipBorderh1eTWw2;
                    mutableInteractionSource = mutableInteractionSource32;
                    i = i27;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i27) {
                    Function0<Unit> function02 = function0;
                    Function2<Composer, Integer, Unit> function24 = function2;
                    Modifier modifier2 = modifier;
                    boolean z22 = z;
                    Function2<Composer, Integer, Unit> function222 = function2;
                    Shape shape3 = shape;
                    ChipColors chipColors2 = chipColors;
                    ChipElevation chipElevation2 = chipElevation;
                    BorderStroke borderStroke2 = borderStroke;
                    MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource;
                    int i32 = i;
                    ChipKt.SuggestionChip(function02, function24, modifier2, z22, function222, shape3, chipColors2, chipElevation2, borderStroke2, mutableInteractionSource4, composer2, RecomposeScopeImplKt.updateChangedFlags((i32 + 1) - (i32 & 1)), i);
                }
            });
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0010G\u0005C\u0006u\u001ee]Kg\u0001_'kPeZ\n9\u001e(\u000fa\u0004Vo~Wv-rq`}\u0010\rQ{>\u000648L%_[\baoQOm}''\u0013N\u0019W/\u007fC\u0010U\u0014xG[_\u0006|qa\u001c|S\u0015~{\u0001\u00107CWtMF0\u0001\u000b+zaM\u001e9\u0013 \u0016\u000f", replaceWith = @ReplaceWith(expression = "SuggestionChip(onClick, label, modifier, enabled, icon, shape, colors, elevation, border, interactionSource", imports = {}))
    @InterfaceC1492Gx
    public static final /* synthetic */ void SuggestionChip(Function0 function0, Function2 function2, Modifier modifier, boolean z2, Function2 function22, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, Composer composer, int i2, int i3) {
        int i4;
        State<BorderStroke> stateBorderStroke$material3_release;
        ChipColors chipColorsSuggestionChipColors = chipColors;
        Modifier.Companion companion = modifier;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        ChipBorder chipBorderM2557suggestionChipBorderd_3_b6Q = chipBorder;
        ChipElevation chipElevationM2560suggestionChipElevationaqJV_2Y = chipElevation;
        Function2 function23 = function22;
        Shape shape2 = shape;
        boolean z3 = z2;
        Composer composerStartRestartGroup = composer.startRestartGroup(170629701);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SuggestionChip)P(8,6,7,3,4,9,1,2)824@39441L5,825@39496L22,826@39575L25,827@39651L22,828@39725L39,835@39946L5,830@39774L568:Chip.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = (i2 + 6) - (i2 & 6);
        } else if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            int i5 = composerStartRestartGroup.changedInstance(function0) ? 4 : 2;
            i4 = (i5 + i2) - (i5 & i2);
        } else {
            i4 = i2;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 48));
        } else if ((i2 & 48) == 0) {
            int i6 = composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
            i4 = (i4 + i6) - (i4 & i6);
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 = (i4 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i4 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(companion) ? 256 : 128)));
        }
        int i8 = (i3 + 8) - (i3 | 8);
        if (i8 != 0) {
            i4 = (i4 + 3072) - (i4 & 3072);
        } else if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
        }
        int i9 = (i3 + 16) - (i3 | 16);
        if (i9 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 24576));
        } else if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function23) ? 16384 : 8192)));
        }
        if ((-1) - (((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ((-1) - i2)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((i3 & 32) == 0 && composerStartRestartGroup.changed(shape2)) ? 131072 : 65536)));
        }
        if ((1572864 + i2) - (1572864 | i2) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((i3 & 64) == 0 && composerStartRestartGroup.changed(chipColorsSuggestionChipColors)) ? 1048576 : 524288)));
        }
        if ((-1) - (((-1) - i2) | ((-1) - 12582912)) == 0) {
            int i10 = ((i3 + 128) - (i3 | 128) == 0 && composerStartRestartGroup.changed(chipElevationM2560suggestionChipElevationaqJV_2Y)) ? 8388608 : 4194304;
            i4 = (i4 + i10) - (i4 & i10);
        }
        if ((i2 & 100663296) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((i3 & 256) == 0 && composerStartRestartGroup.changed(chipBorderM2557suggestionChipBorderd_3_b6Q)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432)));
        }
        int i11 = i3 & 512;
        if (i11 != 0) {
            i4 |= 805306368;
        } else if ((i2 + 805306368) - (i2 | 805306368) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(mutableInteractionSource2) ? 536870912 : 268435456)));
        }
        if ((-1) - (((-1) - i4) | ((-1) - 306783379)) == 306783378 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i7 != 0) {
                    companion = Modifier.Companion;
                }
                if (i8 != 0) {
                    z3 = true;
                }
                if (i9 != 0) {
                    function23 = null;
                }
                if ((i3 & 32) != 0) {
                    shape2 = SuggestionChipDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    i4 = (i4 - 458753) - (i4 | (-458753));
                }
                if ((i3 + 64) - (i3 | 64) != 0) {
                    chipColorsSuggestionChipColors = SuggestionChipDefaults.INSTANCE.suggestionChipColors(composerStartRestartGroup, 6);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-3670017)));
                }
                if ((i3 & 128) != 0) {
                    chipElevationM2560suggestionChipElevationaqJV_2Y = SuggestionChipDefaults.INSTANCE.m2560suggestionChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                    i4 = (i4 - 29360129) - (i4 | (-29360129));
                }
                if ((i3 + 256) - (i3 | 256) != 0) {
                    chipBorderM2557suggestionChipBorderd_3_b6Q = SuggestionChipDefaults.INSTANCE.m2557suggestionChipBorderd_3_b6Q(0L, 0L, 0.0f, composerStartRestartGroup, 3072, 7);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-234881025)));
                }
                if (i11 != 0) {
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1248029210, "CC(remember):Chip.kt#9igjgp");
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 + 32) - (i3 | 32) != 0) {
                    i4 = (i4 - 458753) - (i4 | (-458753));
                }
                if ((i3 & 64) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-3670017)));
                }
                if ((-1) - (((-1) - i3) | ((-1) - 128)) != 0) {
                    i4 &= -29360129;
                }
                if ((i3 & 256) != 0) {
                    i4 = (i4 - 234881025) - (i4 | (-234881025));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(170629701, i4, -1, "androidx.compose.material3.SuggestionChip (Chip.kt:830)");
            }
            TextStyle value = TypographyKt.getValue(SuggestionChipTokens.INSTANCE.getLabelTextFont(), composerStartRestartGroup, 6);
            long jM1882labelColorvNxB06k$material3_release = chipColorsSuggestionChipColors.m1882labelColorvNxB06k$material3_release(z3);
            composerStartRestartGroup.startReplaceGroup(1248043208);
            ComposerKt.sourceInformation(composerStartRestartGroup, "842@40163L21");
            if (chipBorderM2557suggestionChipBorderd_3_b6Q == null) {
                stateBorderStroke$material3_release = null;
            } else {
                int i12 = i4 >> 9;
                int i13 = (i12 + 14) - (i12 | 14);
                int i14 = (i4 >> 21) & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION;
                stateBorderStroke$material3_release = chipBorderM2557suggestionChipBorderd_3_b6Q.borderStroke$material3_release(z3, composerStartRestartGroup, (i13 + i14) - (i13 & i14));
            }
            composerStartRestartGroup.endReplaceGroup();
            BorderStroke value2 = stateBorderStroke$material3_release != null ? stateBorderStroke$material3_release.getValue() : null;
            float fM2555getHeightD9Ej5fM = SuggestionChipDefaults.INSTANCE.m2555getHeightD9Ej5fM();
            PaddingValues paddingValues = SuggestionChipPadding;
            int i15 = i4 >> 6;
            int i16 = (-1) - (((-1) - ((i15 + 14) - (i15 | 14))) & ((-1) - 12582912));
            int i17 = (i4 << 3) & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION;
            int i18 = (i16 + i17) - (i16 & i17);
            int i19 = i4 >> 3;
            int i20 = (i19 + 896) - (i19 | 896);
            int i21 = (i18 + i20) - (i18 & i20);
            int i22 = i4 << 6;
            int i23 = 7168 & i22;
            int i24 = (-1) - (((-1) - ((i21 + i23) - (i21 & i23))) & ((-1) - (i22 & 3670016)));
            int i25 = i4 << 9;
            m1891ChipnkUnTEs(companion, function0, z3, function2, value, jM1882labelColorvNxB06k$material3_release, function23, null, shape2, chipColorsSuggestionChipColors, chipElevationM2560suggestionChipElevationaqJV_2Y, value2, fM2555getHeightD9Ej5fM, paddingValues, mutableInteractionSource2, composerStartRestartGroup, ((-1) - (((-1) - i24) & ((-1) - (234881024 & i25)))) | ((-1) - (((-1) - i25) | ((-1) - 1879048192))), (-1) - (((-1) - (((-1) - (((-1) - (i4 >> 21)) | ((-1) - 14))) | 3456)) & ((-1) - ((i4 >> 15) & 57344))));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt.SuggestionChip.3
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ ChipBorder $border;
                final /* synthetic */ ChipColors $colors;
                final /* synthetic */ ChipElevation $elevation;
                final /* synthetic */ boolean $enabled;
                final /* synthetic */ Function2<Composer, Integer, Unit> $icon;
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ Function0<Unit> $onClick;
                final /* synthetic */ Shape $shape;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C06213(Function0<Unit> function02, Function2<? super Composer, ? super Integer, Unit> function24, Modifier companion2, boolean z32, Function2<? super Composer, ? super Integer, Unit> function232, Shape shape22, ChipColors chipColorsSuggestionChipColors2, ChipElevation chipElevationM2560suggestionChipElevationaqJV_2Y2, ChipBorder chipBorderM2557suggestionChipBorderd_3_b6Q2, MutableInteractionSource mutableInteractionSource22, int i26, int i32) {
                    super(2);
                    function0 = function02;
                    function2 = function24;
                    modifier = companion2;
                    z = z32;
                    function2 = function232;
                    shape = shape22;
                    chipColors = chipColorsSuggestionChipColors2;
                    chipElevation = chipElevationM2560suggestionChipElevationaqJV_2Y2;
                    chipBorder = chipBorderM2557suggestionChipBorderd_3_b6Q2;
                    mutableInteractionSource = mutableInteractionSource22;
                    i = i26;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i26) {
                    ChipKt.SuggestionChip(function0, function2, modifier, z, function2, shape, chipColors, chipElevation, chipBorder, mutableInteractionSource, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), i);
                }
            });
        }
    }

    public static final void ElevatedSuggestionChip(Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function22, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Composer composer, int i2, int i3) {
        int i4;
        MutableInteractionSource mutableInteractionSource2;
        int i5;
        BorderStroke borderStroke2 = borderStroke;
        ChipElevation chipElevationM2554elevatedSuggestionChipElevationaqJV_2Y = chipElevation;
        boolean z3 = z2;
        ChipColors chipColorsElevatedSuggestionChipColors = chipColors;
        Shape shape2 = shape;
        Function2<? super Composer, ? super Integer, Unit> function23 = function22;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-818834969);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ElevatedSuggestionChip)P(8,6,7,3,4,9,1,2)897@43055L5,898@43110L30,899@43197L33,908@43503L5,903@43331L538:Chip.kt#uh7d8r");
        if ((i3 + 1) - (i3 | 1) != 0) {
            i4 = (i2 + 6) - (i2 & 6);
        } else if ((i2 & 6) == 0) {
            i4 = (-1) - (((-1) - (composerStartRestartGroup.changedInstance(function0) ? 4 : 2)) & ((-1) - i2));
        } else {
            i4 = i2;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            i4 = (i4 + 48) - (i4 & 48);
        } else if ((i2 + 48) - (i2 | 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        int i6 = (-1) - (((-1) - i3) | ((-1) - 4));
        if (i6 != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 |= composerStartRestartGroup.changed(companion) ? 256 : 128;
        }
        int i7 = i3 & 8;
        if (i7 != 0) {
            i4 = (i4 + 3072) - (i4 & 3072);
        } else if ((i2 & 3072) == 0) {
            int i8 = composerStartRestartGroup.changed(z3) ? 2048 : 1024;
            i4 = (i4 + i8) - (i4 & i8);
        }
        int i9 = i3 & 16;
        if (i9 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 24576));
        } else if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function23) ? 16384 : 8192;
        }
        if ((-1) - (((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ((-1) - i2)) == 0) {
            i4 |= ((i3 + 32) - (i3 | 32) == 0 && composerStartRestartGroup.changed(shape2)) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            int i10 = ((i3 + 64) - (i3 | 64) == 0 && composerStartRestartGroup.changed(chipColorsElevatedSuggestionChipColors)) ? 1048576 : 524288;
            i4 = (i4 + i10) - (i4 & i10);
        }
        if ((i2 & 12582912) == 0) {
            i4 |= ((i3 & 128) == 0 && composerStartRestartGroup.changed(chipElevationM2554elevatedSuggestionChipElevationaqJV_2Y)) ? 8388608 : 4194304;
        }
        int i11 = i3 & 256;
        if (i11 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 100663296));
        } else if ((-1) - (((-1) - i2) | ((-1) - 100663296)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(borderStroke2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432)));
        }
        int i12 = (i3 + 512) - (i3 | 512);
        if (i12 != 0) {
            i4 = (i4 + 805306368) - (i4 & 805306368);
        } else if ((i2 & 805306368) == 0) {
            i4 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 536870912 : 268435456;
        }
        if ((i4 & 306783379) == 306783378 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            mutableInteractionSource2 = mutableInteractionSource;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 + 1) - (i2 | 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i6 != 0) {
                    companion = Modifier.Companion;
                }
                if (i7 != 0) {
                    z3 = true;
                }
                mutableInteractionSource2 = null;
                if (i9 != 0) {
                    function23 = null;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 32)) != 0) {
                    shape2 = SuggestionChipDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-458753)));
                }
                if ((i3 + 64) - (i3 | 64) != 0) {
                    chipColorsElevatedSuggestionChipColors = SuggestionChipDefaults.INSTANCE.elevatedSuggestionChipColors(composerStartRestartGroup, 6);
                    i5 = (i4 - 3670017) - (i4 | (-3670017));
                } else {
                    i5 = i4;
                }
                if ((i3 & 128) != 0) {
                    chipElevationM2554elevatedSuggestionChipElevationaqJV_2Y = SuggestionChipDefaults.INSTANCE.m2554elevatedSuggestionChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                    i5 &= -29360129;
                }
                if (i11 != 0) {
                    borderStroke2 = null;
                }
                if (i12 == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 + 32) - (i3 | 32) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-458753)));
                }
                if ((i3 + 64) - (i3 | 64) != 0) {
                    i4 = (i4 - 3670017) - (i4 | (-3670017));
                }
                if ((-1) - (((-1) - i3) | ((-1) - 128)) != 0) {
                    i4 &= -29360129;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                i5 = i4;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-818834969, i5, -1, "androidx.compose.material3.ElevatedSuggestionChip (Chip.kt:903)");
            }
            TextStyle value = TypographyKt.getValue(SuggestionChipTokens.INSTANCE.getLabelTextFont(), composerStartRestartGroup, 6);
            long jM1882labelColorvNxB06k$material3_release = chipColorsElevatedSuggestionChipColors.m1882labelColorvNxB06k$material3_release(z3);
            float fM2555getHeightD9Ej5fM = SuggestionChipDefaults.INSTANCE.m2555getHeightD9Ej5fM();
            PaddingValues paddingValues = SuggestionChipPadding;
            int i13 = (i5 >> 6) & 14;
            int i14 = i5 << 6;
            int i15 = (-1) - (((-1) - ((((i13 + 12582912) - (i13 & 12582912)) | ((-1) - (((-1) - (i5 << 3)) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)))) | ((i5 >> 3) & 896))) & ((-1) - ((i14 + 7168) - (7168 | i14))));
            int i16 = (i14 + 3670016) - (i14 | 3670016);
            int i17 = (i15 + i16) - (i15 & i16);
            int i18 = i5 << 9;
            int i19 = 234881024 & i18;
            int i20 = (i17 + i19) - (i17 & i19);
            int i21 = (i18 + 1879048192) - (i18 | 1879048192);
            int i22 = (i20 + i21) - (i20 & i21);
            int i23 = i5 >> 21;
            m1891ChipnkUnTEs(companion, function0, z3, function2, value, jM1882labelColorvNxB06k$material3_release, function23, null, shape2, chipColorsElevatedSuggestionChipColors, chipElevationM2554elevatedSuggestionChipElevationaqJV_2Y, borderStroke2, fM2555getHeightD9Ej5fM, paddingValues, mutableInteractionSource2, composerStartRestartGroup, i22, (-1) - (((-1) - ((i23 & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) | ((-1) - (((-1) - (i23 & 14)) & ((-1) - 3456))))) & ((-1) - ((i5 >> 15) & 57344))));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt.ElevatedSuggestionChip.1
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ BorderStroke $border;
                final /* synthetic */ ChipColors $colors;
                final /* synthetic */ ChipElevation $elevation;
                final /* synthetic */ boolean $enabled;
                final /* synthetic */ Function2<Composer, Integer, Unit> $icon;
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ Function0<Unit> $onClick;
                final /* synthetic */ Shape $shape;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C06161(Function0<Unit> function02, Function2<? super Composer, ? super Integer, Unit> function24, Modifier companion2, boolean z32, Function2<? super Composer, ? super Integer, Unit> function232, Shape shape22, ChipColors chipColorsElevatedSuggestionChipColors2, ChipElevation chipElevationM2554elevatedSuggestionChipElevationaqJV_2Y2, BorderStroke borderStroke22, MutableInteractionSource mutableInteractionSource22, int i24, int i32) {
                    super(2);
                    function0 = function02;
                    function2 = function24;
                    modifier = companion2;
                    z = z32;
                    function2 = function232;
                    shape = shape22;
                    chipColors = chipColorsElevatedSuggestionChipColors2;
                    chipElevation = chipElevationM2554elevatedSuggestionChipElevationaqJV_2Y2;
                    borderStroke = borderStroke22;
                    mutableInteractionSource = mutableInteractionSource22;
                    i = i24;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i24) {
                    ChipKt.ElevatedSuggestionChip(function0, function2, modifier, z, function2, shape, chipColors, chipElevation, borderStroke, mutableInteractionSource, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), i);
                }
            });
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0010G\u0005C\u0006u\u001ee]Kg\u0001_'kPeZ\n9\u001e(\u000fa\u0004Vo~Wv-rq`}\u0010\rQ{>\u000648L%_[\baoQOm}\u0019\u001e\u0011]\u0015X z'\u0017y\u0013tJ0T\r\n@*\u0011\f\b$G{Um<2^tzT[P\u000b2y'V\u0003:\u0011* \u0010x[ 33C8i", replaceWith = @ReplaceWith(expression = "ElevatedSuggestionChip(onClick, label, modifier, enabled, icon, shape, colors, elevation, border, interactionSource", imports = {}))
    @InterfaceC1492Gx
    public static final /* synthetic */ void ElevatedSuggestionChip(Function0 function0, Function2 function2, Modifier modifier, boolean z2, Function2 function22, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, Composer composer, int i2, int i3) {
        int i4;
        State<BorderStroke> stateBorderStroke$material3_release;
        Shape shape2 = shape;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        ChipBorder chipBorder2 = chipBorder;
        ChipElevation chipElevationM2554elevatedSuggestionChipElevationaqJV_2Y = chipElevation;
        ChipColors chipColorsElevatedSuggestionChipColors = chipColors;
        Function2 function23 = function22;
        boolean z3 = z2;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(1668751803);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ElevatedSuggestionChip)P(8,6,7,3,4,9,1,2)980@46960L5,981@47015L30,982@47102L33,984@47219L39,991@47440L5,986@47268L568:Chip.kt#uh7d8r");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (-1) - (((-1) - (composerStartRestartGroup.changedInstance(function0) ? 4 : 2)) & ((-1) - i2));
        } else {
            i4 = i2;
        }
        if ((i3 + 2) - (i3 | 2) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 48));
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function2) ? 32 : 16)));
        }
        int i5 = (i3 + 4) - (i3 | 4);
        if (i5 != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(companion) ? 256 : 128)));
        }
        int i6 = i3 & 8;
        if (i6 != 0) {
            i4 = (i4 + 3072) - (i4 & 3072);
        } else if ((i2 + 3072) - (i2 | 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
        }
        int i7 = i3 & 16;
        if (i7 != 0) {
            i4 |= 24576;
        } else if ((i2 + 24576) - (i2 | 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function23) ? 16384 : 8192;
        }
        if ((-1) - (((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ((-1) - i2)) == 0) {
            i4 |= ((i3 & 32) == 0 && composerStartRestartGroup.changed(shape2)) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            int i8 = ((-1) - (((-1) - i3) | ((-1) - 64)) == 0 && composerStartRestartGroup.changed(chipColorsElevatedSuggestionChipColors)) ? 1048576 : 524288;
            i4 = (i4 + i8) - (i4 & i8);
        }
        if ((i2 + 12582912) - (i2 | 12582912) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((-1) - (((-1) - i3) | ((-1) - 128)) == 0 && composerStartRestartGroup.changed(chipElevationM2554elevatedSuggestionChipElevationaqJV_2Y)) ? 8388608 : 4194304)));
        }
        int i9 = (-1) - (((-1) - i3) | ((-1) - 256));
        if (i9 != 0) {
            i4 |= 100663296;
        } else if ((-1) - (((-1) - i2) | ((-1) - 100663296)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(chipBorder2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432)));
        }
        int i10 = (i3 + 512) - (i3 | 512);
        if (i10 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 805306368));
        } else if ((i2 & 805306368) == 0) {
            int i11 = composerStartRestartGroup.changed(mutableInteractionSource2) ? 536870912 : 268435456;
            i4 = (i4 + i11) - (i4 & i11);
        }
        if ((-1) - (((-1) - i4) | ((-1) - 306783379)) == 306783378 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 + 1) - (i2 | 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if (i6 != 0) {
                    z3 = true;
                }
                if (i7 != 0) {
                    function23 = null;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 32)) != 0) {
                    shape2 = SuggestionChipDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-458753)));
                }
                if ((i3 + 64) - (i3 | 64) != 0) {
                    chipColorsElevatedSuggestionChipColors = SuggestionChipDefaults.INSTANCE.elevatedSuggestionChipColors(composerStartRestartGroup, 6);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-3670017)));
                }
                if ((i3 & 128) != 0) {
                    chipElevationM2554elevatedSuggestionChipElevationaqJV_2Y = SuggestionChipDefaults.INSTANCE.m2554elevatedSuggestionChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-29360129)));
                }
                if (i9 != 0) {
                    chipBorder2 = null;
                }
                if (i10 != 0) {
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2121795492, "CC(remember):Chip.kt#9igjgp");
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 + 32) - (i3 | 32) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-458753)));
                }
                if ((i3 + 64) - (i3 | 64) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-3670017)));
                }
                if ((-1) - (((-1) - i3) | ((-1) - 128)) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-29360129)));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1668751803, i4, -1, "androidx.compose.material3.ElevatedSuggestionChip (Chip.kt:986)");
            }
            TextStyle value = TypographyKt.getValue(SuggestionChipTokens.INSTANCE.getLabelTextFont(), composerStartRestartGroup, 6);
            long jM1882labelColorvNxB06k$material3_release = chipColorsElevatedSuggestionChipColors.m1882labelColorvNxB06k$material3_release(z3);
            float fM2555getHeightD9Ej5fM = SuggestionChipDefaults.INSTANCE.m2555getHeightD9Ej5fM();
            PaddingValues paddingValues = SuggestionChipPadding;
            composerStartRestartGroup.startReplaceGroup(2121812626);
            ComposerKt.sourceInformation(composerStartRestartGroup, "1000@47755L21");
            if (chipBorder2 == null) {
                stateBorderStroke$material3_release = null;
            } else {
                int i12 = i4 >> 21;
                stateBorderStroke$material3_release = chipBorder2.borderStroke$material3_release(z3, composerStartRestartGroup, ((i4 >> 9) & 14) | ((i12 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i12 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)));
            }
            composerStartRestartGroup.endReplaceGroup();
            BorderStroke value2 = stateBorderStroke$material3_release != null ? stateBorderStroke$material3_release.getValue() : null;
            int i13 = i4 >> 6;
            int i14 = (i13 + 14) - (i13 | 14);
            int i15 = (i14 + 12582912) - (i14 & 12582912);
            int i16 = i4 << 3;
            int i17 = (i16 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i16 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION);
            int i18 = (i15 + i17) - (i15 & i17);
            int i19 = (-1) - (((-1) - (i4 >> 3)) | ((-1) - 896));
            int i20 = (i18 + i19) - (i18 & i19);
            int i21 = i4 << 6;
            int i22 = (-1) - (((-1) - i21) | ((-1) - 7168));
            int i23 = ((i20 + i22) - (i20 & i22)) | ((i21 + 3670016) - (i21 | 3670016));
            int i24 = i4 << 9;
            int i25 = 234881024 & i24;
            int i26 = (i23 + i25) - (i23 & i25);
            int i27 = (i24 + 1879048192) - (i24 | 1879048192);
            int i28 = (i26 + i27) - (i26 & i27);
            int i29 = (-1) - (((-1) - (i4 >> 21)) | ((-1) - 14));
            m1891ChipnkUnTEs(companion, function0, z3, function2, value, jM1882labelColorvNxB06k$material3_release, function23, null, shape2, chipColorsElevatedSuggestionChipColors, chipElevationM2554elevatedSuggestionChipElevationaqJV_2Y, value2, fM2555getHeightD9Ej5fM, paddingValues, mutableInteractionSource2, composerStartRestartGroup, i28, (-1) - (((-1) - ((i29 + 3456) - (i29 & 3456))) & ((-1) - ((i4 >> 15) & 57344))));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt.ElevatedSuggestionChip.3
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ ChipBorder $border;
                final /* synthetic */ ChipColors $colors;
                final /* synthetic */ ChipElevation $elevation;
                final /* synthetic */ boolean $enabled;
                final /* synthetic */ Function2<Composer, Integer, Unit> $icon;
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ Function0<Unit> $onClick;
                final /* synthetic */ Shape $shape;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C06173(Function0<Unit> function02, Function2<? super Composer, ? super Integer, Unit> function24, Modifier companion2, boolean z32, Function2<? super Composer, ? super Integer, Unit> function232, Shape shape22, ChipColors chipColorsElevatedSuggestionChipColors2, ChipElevation chipElevationM2554elevatedSuggestionChipElevationaqJV_2Y2, ChipBorder chipBorder22, MutableInteractionSource mutableInteractionSource22, int i210, int i32) {
                    super(2);
                    function0 = function02;
                    function2 = function24;
                    modifier = companion2;
                    z = z32;
                    function2 = function232;
                    shape = shape22;
                    chipColors = chipColorsElevatedSuggestionChipColors2;
                    chipElevation = chipElevationM2554elevatedSuggestionChipElevationaqJV_2Y2;
                    chipBorder = chipBorder22;
                    mutableInteractionSource = mutableInteractionSource22;
                    i = i210;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i210) {
                    ChipKt.ElevatedSuggestionChip(function0, function2, modifier, z, function2, shape, chipColors, chipElevation, chipBorder, mutableInteractionSource, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Chip-nkUnTEs */
    public static final void m1891ChipnkUnTEs(final Modifier modifier, Function0<Unit> function0, final boolean z2, final Function2<? super Composer, ? super Integer, Unit> function2, final TextStyle textStyle, final long j2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, final Shape shape, final ChipColors chipColors, final ChipElevation chipElevation, final BorderStroke borderStroke, final float f2, final PaddingValues paddingValues, final MutableInteractionSource mutableInteractionSource, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1400504719);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Chip)P(10,11,3,5,7,6:c#ui.graphics.Color,8,14,13,1,2!1,9:c#ui.unit.Dp,12)1975@97230L477,1966@96860L847:Chip.kt#uh7d8r");
        if ((i2 + 6) - (i2 | 6) == 0) {
            int i6 = composerStartRestartGroup.changed(modifier) ? 4 : 2;
            i4 = (i6 + i2) - (i6 & i2);
        } else {
            i4 = i2;
        }
        Function0<Unit> function02 = function0;
        if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function02) ? 32 : 16)));
        }
        if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(z2) ? 256 : 128)));
        }
        if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            int i7 = composerStartRestartGroup.changed(textStyle) ? 16384 : 8192;
            i4 = (i4 + i7) - (i4 & i7);
        }
        if ((-1) - (((-1) - i2) | ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE)) == 0) {
            int i8 = composerStartRestartGroup.changed(j2) ? 131072 : 65536;
            i4 = (i4 + i8) - (i4 & i8);
        }
        final Function2<? super Composer, ? super Integer, Unit> function24 = function22;
        if ((i2 & 1572864) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function24) ? 1048576 : 524288;
        }
        final Function2<? super Composer, ? super Integer, Unit> function25 = function23;
        if ((-1) - (((-1) - i2) | ((-1) - 12582912)) == 0) {
            int i9 = composerStartRestartGroup.changedInstance(function25) ? 8388608 : 4194304;
            i4 = (i4 + i9) - (i4 & i9);
        }
        if ((i2 + 100663296) - (i2 | 100663296) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(shape) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432)));
        }
        if ((i2 + 805306368) - (i2 | 805306368) == 0) {
            i4 |= composerStartRestartGroup.changed(chipColors) ? 536870912 : 268435456;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 6)) == 0) {
            i5 = (-1) - (((-1) - (composerStartRestartGroup.changed(chipElevation) ? 4 : 2)) & ((-1) - i3));
        } else {
            i5 = i3;
        }
        if ((i3 + 48) - (i3 | 48) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(borderStroke) ? 32 : 16)));
        }
        if ((i3 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i3 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i10 = composerStartRestartGroup.changed(f2) ? 256 : 128;
            i5 = (i5 + i10) - (i5 & i10);
        }
        if ((-1) - (((-1) - i3) | ((-1) - 3072)) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(paddingValues) ? 2048 : 1024)));
        }
        if ((i3 & 24576) == 0) {
            i5 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 16384 : 8192;
        }
        if ((306783379 + i4) - (306783379 | i4) == 306783378 && (i5 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1400504719, i4, i5, "androidx.compose.material3.Chip (Chip.kt:1963)");
            }
            composerStartRestartGroup.startReplaceGroup(1985614987);
            ComposerKt.sourceInformation(composerStartRestartGroup, "1965@96816L39");
            if (mutableInteractionSource == null) {
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1985615638, "CC(remember):Chip.kt#9igjgp");
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            } else {
                mutableInteractionSource2 = mutableInteractionSource;
            }
            composerStartRestartGroup.endReplaceGroup();
            State<Dp> stateShadowElevation$material3_release = null;
            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifier, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ChipKt$Chip$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertiesKt.m5952setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m5933getButtono7Vup1c());
                }
            }, 1, null);
            long jM1872containerColorvNxB06k$material3_release = chipColors.m1872containerColorvNxB06k$material3_release(z2);
            composerStartRestartGroup.startReplaceGroup(1985624506);
            ComposerKt.sourceInformation(composerStartRestartGroup, "1972@97093L43");
            if (chipElevation != null) {
                int i11 = (-1) - (((-1) - (i4 >> 6)) | ((-1) - 14));
                int i12 = i5 << 6;
                int i13 = (i12 + 896) - (i12 | 896);
                stateShadowElevation$material3_release = chipElevation.shadowElevation$material3_release(z2, mutableInteractionSource2, composerStartRestartGroup, (i11 + i13) - (i11 & i13));
            }
            composerStartRestartGroup.endReplaceGroup();
            float fM6652unboximpl = stateShadowElevation$material3_release != null ? stateShadowElevation$material3_release.getValue().m6652unboximpl() : Dp.m6638constructorimpl(0);
            function24 = function24;
            function25 = function25;
            int i14 = (i4 >> 3) & 14;
            int i15 = 896 & i4;
            int i16 = (-1) - (((-1) - ((i4 >> 15) & 7168)) & ((-1) - ((i14 + i15) - (i14 & i15))));
            int i17 = (-1) - (((-1) - (i5 << 21)) | ((-1) - 234881024));
            function02 = function02;
            SurfaceKt.m2564Surfaceo_FOJdg(function02, modifierSemantics$default, z2, shape, jM1872containerColorvNxB06k$material3_release, 0L, 0.0f, fM6652unboximpl, borderStroke, mutableInteractionSource2, ComposableLambdaKt.rememberComposableLambda(-1985962652, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt$Chip$2
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

                public final void invoke(Composer composer2, int i18) {
                    ComposerKt.sourceInformation(composer2, "C1976@97240L461:Chip.kt#uh7d8r");
                    if ((-1) - (((-1) - i18) | ((-1) - 3)) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1985962652, i18, -1, "androidx.compose.material3.Chip.<anonymous> (Chip.kt:1976)");
                        }
                        ChipKt.m1892ChipContentfe0OD_I(function2, textStyle, j2, function24, null, function25, chipColors.m1883leadingIconContentColorvNxB06k$material3_release(z2), chipColors.m1884trailingIconContentColorvNxB06k$material3_release(z2), f2, paddingValues, composer2, 24576);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i16 + i17) - (i16 & i17), 6, 96);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function2<? super Composer, ? super Integer, Unit> function26 = function24;
            final Function2<? super Composer, ? super Integer, Unit> function27 = function25;
            final Function0<Unit> function03 = function02;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt$Chip$3
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

                public final void invoke(Composer composer2, int i18) {
                    Modifier modifier2 = modifier;
                    Function0<Unit> function04 = function03;
                    boolean z3 = z2;
                    Function2<Composer, Integer, Unit> function28 = function2;
                    TextStyle textStyle2 = textStyle;
                    long j3 = j2;
                    Function2<Composer, Integer, Unit> function29 = function26;
                    Function2<Composer, Integer, Unit> function210 = function27;
                    Shape shape2 = shape;
                    ChipColors chipColors2 = chipColors;
                    ChipElevation chipElevation2 = chipElevation;
                    BorderStroke borderStroke2 = borderStroke;
                    float f3 = f2;
                    PaddingValues paddingValues2 = paddingValues;
                    MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
                    int i19 = i2;
                    ChipKt.m1891ChipnkUnTEs(modifier2, function04, z3, function28, textStyle2, j3, function29, function210, shape2, chipColors2, chipElevation2, borderStroke2, f3, paddingValues2, mutableInteractionSource3, composer2, RecomposeScopeImplKt.updateChangedFlags((i19 + 1) - (i19 & 1)), RecomposeScopeImplKt.updateChangedFlags(i3));
                }
            });
        }
    }

    /* JADX INFO: renamed from: SelectableChip-u0RnIRE */
    public static final void m1893SelectableChipu0RnIRE(final boolean z2, final Modifier modifier, final Function0<Unit> function0, final boolean z3, final Function2<? super Composer, ? super Integer, Unit> function2, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, final Shape shape, final SelectableChipColors selectableChipColors, final SelectableChipElevation selectableChipElevation, final BorderStroke borderStroke, final float f2, final PaddingValues paddingValues, final MutableInteractionSource mutableInteractionSource, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Composer composerStartRestartGroup = composer.startRestartGroup(402951308);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SelectableChip)P(13,10,11,4,6,7,8!1,15,14,2,3!1,9:c#ui.unit.Dp,12)2023@98879L525,2013@98468L936:Chip.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            int i6 = composerStartRestartGroup.changed(z2) ? 4 : 2;
            i4 = (i6 + i2) - (i6 & i2);
        } else {
            i4 = i2;
        }
        if ((i2 + 48) - (i2 | 48) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(modifier) ? 32 : 16)));
        }
        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function0) ? 256 : 128)));
        }
        if ((i2 & 3072) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(z3) ? 2048 : 1024)));
        }
        if ((i2 & 24576) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function2) ? 16384 : 8192)));
        }
        final TextStyle textStyle2 = textStyle;
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(textStyle2) ? 131072 : 65536)));
        }
        final Function2<? super Composer, ? super Integer, Unit> function25 = function22;
        if ((i2 & 1572864) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function25) ? 1048576 : 524288;
        }
        final Function2<? super Composer, ? super Integer, Unit> function26 = function23;
        if ((-1) - (((-1) - i2) | ((-1) - 12582912)) == 0) {
            int i7 = composerStartRestartGroup.changedInstance(function26) ? 8388608 : 4194304;
            i4 = (i4 + i7) - (i4 & i7);
        }
        final Function2<? super Composer, ? super Integer, Unit> function27 = function24;
        if ((-1) - (((-1) - i2) | ((-1) - 100663296)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function27) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432)));
        }
        if ((i2 & 805306368) == 0) {
            i4 |= composerStartRestartGroup.changed(shape) ? 536870912 : 268435456;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 6)) == 0) {
            int i8 = composerStartRestartGroup.changed(selectableChipColors) ? 4 : 2;
            i5 = (i8 + i3) - (i8 & i3);
        } else {
            i5 = i3;
        }
        if ((i3 + 48) - (i3 | 48) == 0) {
            int i9 = composerStartRestartGroup.changed(selectableChipElevation) ? 32 : 16;
            i5 = (i5 + i9) - (i5 & i9);
        }
        if ((i3 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i3 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i10 = composerStartRestartGroup.changed(borderStroke) ? 256 : 128;
            i5 = (i5 + i10) - (i5 & i10);
        }
        if ((-1) - (((-1) - i3) | ((-1) - 3072)) == 0) {
            i5 |= composerStartRestartGroup.changed(f2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(paddingValues) ? 16384 : 8192)));
        }
        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(mutableInteractionSource) ? 131072 : 65536)));
        }
        if ((-1) - (((-1) - i4) | ((-1) - 306783379)) == 306783378 && (74899 & i5) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(402951308, i4, i5, "androidx.compose.material3.SelectableChip (Chip.kt:2009)");
            }
            composerStartRestartGroup.startReplaceGroup(2072749057);
            ComposerKt.sourceInformation(composerStartRestartGroup, "2011@98346L39");
            if (mutableInteractionSource == null) {
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2072749708, "CC(remember):Chip.kt#9igjgp");
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            } else {
                mutableInteractionSource2 = mutableInteractionSource;
            }
            composerStartRestartGroup.endReplaceGroup();
            State<Dp> stateShadowElevation$material3_release = null;
            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifier, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ChipKt$SelectableChip$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertiesKt.m5952setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m5934getCheckboxo7Vup1c());
                }
            }, 1, null);
            long jM2477containerColorWaAFU9c$material3_release = selectableChipColors.m2477containerColorWaAFU9c$material3_release(z3, z2);
            composerStartRestartGroup.startReplaceGroup(2072762384);
            ComposerKt.sourceInformation(composerStartRestartGroup, "2020@98742L43");
            if (selectableChipElevation != null) {
                int i11 = i4 >> 9;
                stateShadowElevation$material3_release = selectableChipElevation.shadowElevation$material3_release(z3, mutableInteractionSource2, composerStartRestartGroup, (-1) - (((-1) - ((i11 + 14) - (i11 | 14))) & ((-1) - ((-1) - (((-1) - (i5 << 3)) | ((-1) - 896))))));
            }
            composerStartRestartGroup.endReplaceGroup();
            float fM6652unboximpl = stateShadowElevation$material3_release != null ? stateShadowElevation$material3_release.getValue().m6652unboximpl() : Dp.m6638constructorimpl(0);
            textStyle2 = textStyle2;
            function25 = function25;
            function26 = function26;
            function27 = function27;
            int i12 = i4 >> 3;
            int i13 = i5 << 21;
            SurfaceKt.m2562Surfaced85dljk(z2, function0, modifierSemantics$default, z3, shape, jM2477containerColorWaAFU9c$material3_release, 0L, 0.0f, fM6652unboximpl, borderStroke, mutableInteractionSource2, ComposableLambdaKt.rememberComposableLambda(-577614814, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt$SelectableChip$2
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

                public final void invoke(Composer composer2, int i14) {
                    ComposerKt.sourceInformation(composer2, "C2024@98889L509:Chip.kt#uh7d8r");
                    if ((i14 + 3) - (3 | i14) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-577614814, i14, -1, "androidx.compose.material3.SelectableChip.<anonymous> (Chip.kt:2024)");
                        }
                        ChipKt.m1892ChipContentfe0OD_I(function2, textStyle2, selectableChipColors.m2479labelColorWaAFU9c$material3_release(z3, z2), function25, function26, function27, selectableChipColors.m2480leadingIconContentColorWaAFU9c$material3_release(z3, z2), selectableChipColors.m2481trailingIconContentColorWaAFU9c$material3_release(z3, z2), f2, paddingValues, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (-1) - (((-1) - ((-1) - (((-1) - ((-1) - (((-1) - ((-1) - (((-1) - ((-1) - (((-1) - i4) | ((-1) - 14)))) & ((-1) - ((i12 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i12 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)))))) & ((-1) - ((-1) - (((-1) - i4) | ((-1) - 7168))))))) & ((-1) - ((i4 >> 15) & 57344))))) & ((-1) - ((i13 + 1879048192) - (i13 | 1879048192)))), 48, 192);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final TextStyle textStyle3 = textStyle2;
            final Function2<? super Composer, ? super Integer, Unit> function28 = function25;
            final Function2<? super Composer, ? super Integer, Unit> function29 = function26;
            final Function2<? super Composer, ? super Integer, Unit> function210 = function27;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt$SelectableChip$3
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

                public final void invoke(Composer composer2, int i14) {
                    boolean z4 = z2;
                    Modifier modifier2 = modifier;
                    Function0<Unit> function02 = function0;
                    boolean z5 = z3;
                    Function2<Composer, Integer, Unit> function211 = function2;
                    TextStyle textStyle4 = textStyle3;
                    Function2<Composer, Integer, Unit> function212 = function28;
                    Function2<Composer, Integer, Unit> function213 = function29;
                    Function2<Composer, Integer, Unit> function214 = function210;
                    Shape shape2 = shape;
                    SelectableChipColors selectableChipColors2 = selectableChipColors;
                    SelectableChipElevation selectableChipElevation2 = selectableChipElevation;
                    BorderStroke borderStroke2 = borderStroke;
                    float f3 = f2;
                    PaddingValues paddingValues2 = paddingValues;
                    MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
                    int i15 = i2;
                    ChipKt.m1893SelectableChipu0RnIRE(z4, modifier2, function02, z5, function211, textStyle4, function212, function213, function214, shape2, selectableChipColors2, selectableChipElevation2, borderStroke2, f3, paddingValues2, mutableInteractionSource3, composer2, RecomposeScopeImplKt.updateChangedFlags((i15 + 1) - (i15 & 1)), RecomposeScopeImplKt.updateChangedFlags(i3));
                }
            });
        }
    }

    /* JADX INFO: renamed from: ChipContent-fe0OD_I */
    public static final void m1892ChipContentfe0OD_I(Function2<? super Composer, ? super Integer, Unit> function2, final TextStyle textStyle, final long j2, Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final long j3, final long j4, final float f2, final PaddingValues paddingValues, Composer composer, final int i2) {
        int i3;
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-782878228);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ChipContent)P(1,3,2:c#ui.graphics.Color,4!1,8,5:c#ui.graphics.Color,9:c#ui.graphics.Color,6:c#ui.unit.Dp)2055@99907L3519,2052@99781L3645:Chip.kt#uh7d8r");
        final Function2<? super Composer, ? super Integer, Unit> function25 = function2;
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function25) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            i3 |= composerStartRestartGroup.changed(textStyle) ? 32 : 16;
        }
        if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            int i5 = composerStartRestartGroup.changed(j2) ? 256 : 128;
            i3 = (i3 + i5) - (i3 & i5);
        }
        final Function2<? super Composer, ? super Integer, Unit> function26 = function22;
        if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changedInstance(function26) ? 2048 : 1024)));
        }
        if ((i2 + 24576) - (i2 | 24576) == 0) {
            int i6 = composerStartRestartGroup.changedInstance(function23) ? 16384 : 8192;
            i3 = (i3 + i6) - (i3 & i6);
        }
        if ((196608 & i2) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changedInstance(function24) ? 131072 : 65536)));
        }
        if ((1572864 & i2) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changed(j3) ? 1048576 : 524288)));
        }
        if ((-1) - (((-1) - 12582912) | ((-1) - i2)) == 0) {
            int i7 = composerStartRestartGroup.changed(j4) ? 8388608 : 4194304;
            i4 = (i3 + i7) - (i3 & i7);
        } else {
            i4 = i3;
        }
        if ((-1) - (((-1) - 100663296) | ((-1) - i2)) == 0) {
            i4 |= composerStartRestartGroup.changed(f2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 805306368)) == 0) {
            i4 |= composerStartRestartGroup.changed(paddingValues) ? 536870912 : 268435456;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 306783379)) == 306783378 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-782878228, i4, -1, "androidx.compose.material3.ChipContent (Chip.kt:2051)");
            }
            ProvidedValue[] providedValueArr = {ContentColorKt.getLocalContentColor().provides(Color.m4168boximpl(j2)), TextKt.getLocalTextStyle().provides(textStyle)};
            function26 = function26;
            function25 = function25;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1748799148, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt$ChipContent$1
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

                public final void invoke(Composer composer2, int i8) {
                    ComposerKt.sourceInformation(composer2, "C2056@99917L3503:Chip.kt#uh7d8r");
                    if ((i8 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1748799148, i8, -1, "androidx.compose.material3.ChipContent.<anonymous> (Chip.kt:2056)");
                        }
                        Modifier modifierPadding = PaddingKt.padding(SizeKt.m1048defaultMinSizeVpY3zN4$default(Modifier.Companion, 0.0f, f2, 1, null), paddingValues);
                        AnonymousClass1 anonymousClass1 = new MeasurePolicy() { // from class: androidx.compose.material3.ChipKt$ChipContent$1.1
                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            /* JADX INFO: renamed from: measure-3p2s80s */
                            public final MeasureResult mo375measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j5) {
                                Measurable measurable;
                                Measurable measurable2;
                                int size = list.size();
                                int i9 = 0;
                                while (true) {
                                    if (i9 >= size) {
                                        measurable = null;
                                        break;
                                    }
                                    measurable = list.get(i9);
                                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "leadingIcon")) {
                                        break;
                                    }
                                    i9++;
                                }
                                Measurable measurable3 = measurable;
                                final Placeable placeableMo5514measureBRTryo0 = measurable3 != null ? measurable3.mo5514measureBRTryo0(Constraints.m6582copyZbe2FdA$default(j5, 0, 0, 0, 0, 10, null)) : null;
                                final int iWidthOrZero = TextFieldImplKt.widthOrZero(placeableMo5514measureBRTryo0);
                                final int iHeightOrZero = TextFieldImplKt.heightOrZero(placeableMo5514measureBRTryo0);
                                int size2 = list.size();
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= size2) {
                                        measurable2 = null;
                                        break;
                                    }
                                    measurable2 = list.get(i10);
                                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "trailingIcon")) {
                                        break;
                                    }
                                    i10++;
                                }
                                Measurable measurable4 = measurable2;
                                final Placeable placeableMo5514measureBRTryo02 = measurable4 != null ? measurable4.mo5514measureBRTryo0(Constraints.m6582copyZbe2FdA$default(j5, 0, 0, 0, 0, 10, null)) : null;
                                int iWidthOrZero2 = TextFieldImplKt.widthOrZero(placeableMo5514measureBRTryo02);
                                final int iHeightOrZero2 = TextFieldImplKt.heightOrZero(placeableMo5514measureBRTryo02);
                                int size3 = list.size();
                                for (int i11 = 0; i11 < size3; i11++) {
                                    Measurable measurable5 = list.get(i11);
                                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable5), Constants.ScionAnalytics.PARAM_LABEL)) {
                                        final Placeable placeableMo5514measureBRTryo03 = measurable5.mo5514measureBRTryo0(ConstraintsKt.m6611offsetNN6EwU$default(j5, -(iWidthOrZero + iWidthOrZero2), 0, 2, null));
                                        int width = placeableMo5514measureBRTryo03.getWidth() + iWidthOrZero + iWidthOrZero2;
                                        final int iMax = Math.max(iHeightOrZero, Math.max(placeableMo5514measureBRTryo03.getHeight(), iHeightOrZero2));
                                        return MeasureScope.layout$default(measureScope, width, iMax, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.ChipKt.ChipContent.1.1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                                Placeable placeable = placeableMo5514measureBRTryo0;
                                                if (placeable != null) {
                                                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, Alignment.Companion.getCenterVertically().align(iHeightOrZero, iMax), 0.0f, 4, null);
                                                }
                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo5514measureBRTryo03, iWidthOrZero, 0, 0.0f, 4, null);
                                                Placeable placeable2 = placeableMo5514measureBRTryo02;
                                                if (placeable2 != null) {
                                                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, placeableMo5514measureBRTryo03.getWidth() + iWidthOrZero, Alignment.Companion.getCenterVertically().align(iHeightOrZero2, iMax), 0.0f, 4, null);
                                                }
                                            }
                                        }, 4, null);
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        };
                        Function2<Composer, Integer, Unit> function27 = function23;
                        Function2<Composer, Integer, Unit> function28 = function26;
                        Function2<Composer, Integer, Unit> function29 = function24;
                        long j5 = j3;
                        Function2<Composer, Integer, Unit> function210 = function25;
                        long j6 = j4;
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierPadding);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM3671constructorimpl = Updater.m3671constructorimpl(composer2);
                        Updater.m3678setimpl(composerM3671constructorimpl, anonymousClass1, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -1433527257, "C2075@100797L325:Chip.kt#uh7d8r");
                        composer2.startReplaceGroup(-1293169671);
                        ComposerKt.sourceInformation(composer2, "2060@100124L638");
                        if (function27 != null || function28 != null) {
                            Modifier modifierLayoutId = LayoutIdKt.layoutId(Modifier.Companion, "leadingIcon");
                            Alignment center = Alignment.Companion.getCenter();
                            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierLayoutId);
                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM3671constructorimpl2 = Updater.m3671constructorimpl(composer2);
                            Updater.m3678setimpl(composerM3671constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                            Updater.m3678setimpl(composerM3671constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                            if (composerM3671constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM3671constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM3671constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m3678setimpl(composerM3671constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer2, 832670363, "C:Chip.kt#uh7d8r");
                            if (function27 == null) {
                                if (function28 != null) {
                                    composer2.startReplaceGroup(832788565);
                                    ComposerKt.sourceInformation(composer2, "2067@100486L198");
                                    CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4168boximpl(j5)), function28, composer2, ProvidedValue.$stable);
                                    composer2.endReplaceGroup();
                                } else {
                                    composer2.startReplaceGroup(833040347);
                                    composer2.endReplaceGroup();
                                }
                            } else {
                                composer2.startReplaceGroup(832680499);
                                ComposerKt.sourceInformation(composer2, "2065@100383L8");
                                function27.invoke(composer2, 0);
                                composer2.endReplaceGroup();
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                        }
                        composer2.endReplaceGroup();
                        Modifier modifierM1019paddingVpY3zN4 = PaddingKt.m1019paddingVpY3zN4(LayoutIdKt.layoutId(Modifier.Companion, Constants.ScionAnalytics.PARAM_LABEL), ChipKt.HorizontalElementsPadding, Dp.m6638constructorimpl(0));
                        Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                        Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                        ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, 54);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierM1019paddingVpY3zN4);
                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor3);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM3671constructorimpl3 = Updater.m3671constructorimpl(composer2);
                        Updater.m3678setimpl(composerM3671constructorimpl3, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.m3678setimpl(composerM3671constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composerM3671constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM3671constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM3671constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m3678setimpl(composerM3671constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer2, 833418517, "C2080@101095L7:Chip.kt#uh7d8r");
                        function210.invoke(composer2, 0);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.startReplaceGroup(-1293135324);
                        ComposerKt.sourceInformation(composer2, "2083@101187L442");
                        if (function29 != null) {
                            Modifier modifierLayoutId2 = LayoutIdKt.layoutId(Modifier.Companion, "trailingIcon");
                            Alignment center2 = Alignment.Companion.getCenter();
                            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierLayoutId2);
                            Function0<ComposeUiNode> constructor4 = ComposeUiNode.Companion.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor4);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM3671constructorimpl4 = Updater.m3671constructorimpl(composer2);
                            Updater.m3678setimpl(composerM3671constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                            Updater.m3678setimpl(composerM3671constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                            if (composerM3671constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                composerM3671constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                composerM3671constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                            }
                            Updater.m3678setimpl(composerM3671constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer2, 833719744, "C2087@101393L188:Chip.kt#uh7d8r");
                            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4168boximpl(j6)), function29, composer2, ProvidedValue.$stable);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                        }
                        composer2.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54);
            int i8 = ProvidedValue.$stable;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, composableLambdaRememberComposableLambda, composerStartRestartGroup, (i8 + 48) - (i8 & 48));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function2<? super Composer, ? super Integer, Unit> function27 = function26;
            final Function2<? super Composer, ? super Integer, Unit> function28 = function25;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt$ChipContent$2
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

                public final void invoke(Composer composer2, int i9) {
                    ChipKt.m1892ChipContentfe0OD_I(function28, textStyle, j2, function27, function23, function24, j3, j4, f2, paddingValues, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i2) & ((-1) - 1))));
                }
            });
        }
    }

    public static final ChipColors getDefaultSuggestionChipColors(ColorScheme colorScheme) {
        ChipColors defaultSuggestionChipColorsCached$material3_release = colorScheme.getDefaultSuggestionChipColorsCached$material3_release();
        if (defaultSuggestionChipColorsCached$material3_release != null) {
            return defaultSuggestionChipColorsCached$material3_release;
        }
        ChipColors chipColors = new ChipColors(Color.Companion.m4213getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, SuggestionChipTokens.INSTANCE.getLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, SuggestionChipTokens.INSTANCE.getLeadingIconColor()), Color.Companion.m4214getUnspecified0d7_KjU(), Color.Companion.m4213getTransparent0d7_KjU(), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SuggestionChipTokens.INSTANCE.getDisabledLabelTextColor()), SuggestionChipTokens.INSTANCE.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4177copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SuggestionChipTokens.INSTANCE.getDisabledLeadingIconColor()), SuggestionChipTokens.INSTANCE.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.Companion.m4214getUnspecified0d7_KjU(), null);
        colorScheme.setDefaultSuggestionChipColorsCached$material3_release(chipColors);
        return chipColors;
    }

    static /* synthetic */ PaddingValues inputChipPadding$default(boolean z2, boolean z3, boolean z4, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            z2 = false;
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            z3 = false;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            z4 = false;
        }
        return inputChipPadding(z2, z3, z4);
    }

    private static final PaddingValues inputChipPadding(boolean z2, boolean z3, boolean z4) {
        return PaddingKt.m1015PaddingValuesa9UjIt4$default(Dp.m6638constructorimpl((z2 || !z3) ? 4 : 8), 0.0f, Dp.m6638constructorimpl(z4 ? 8 : 4), 0.0f, 10, null);
    }

    static {
        float fM6638constructorimpl = Dp.m6638constructorimpl(8);
        HorizontalElementsPadding = fM6638constructorimpl;
        AssistChipPadding = PaddingKt.m1013PaddingValuesYgX7TsA$default(fM6638constructorimpl, 0.0f, 2, null);
        FilterChipPadding = PaddingKt.m1013PaddingValuesYgX7TsA$default(fM6638constructorimpl, 0.0f, 2, null);
        SuggestionChipPadding = PaddingKt.m1013PaddingValuesYgX7TsA$default(fM6638constructorimpl, 0.0f, 2, null);
    }
}
