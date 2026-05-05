package androidx.compose.ui.platform;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.text.SpannableString;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.collection.ArraySet;
import androidx.collection.IntList;
import androidx.collection.IntListKt;
import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntIntMap;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.collection.MutableObjectIntMap;
import androidx.collection.SparseArrayCompat;
import androidx.compose.ui.R;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.HitTestResult;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AccessibilityIterators;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.platform.AndroidAccessibilitySpannableString_androidKt;
import androidx.compose.ui.text.platform.URLSpanCache;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.dynatrace.android.agent.AdkSettings;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
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
/* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яů\u0015D57\u001eq\u007fZDkŞ\fA\u001c0\u0013.H~*, \u0004\u000ffp<8DsO6RY-\u0017k\n:,Ӌ,qQD]\u001a\u0004&\u0011OdgoñRZ!C\u0017\u0006$\u0004rߚQU\u000f]\u001a\u000f@Bw?9Mw=O`|6\u001b :\">{\r\u00010*PƵ~zQj\u0014\u0012F@xíZ\r[#\"Ň\u000e>6\u0001&\\mN>H\u0003]B/)\tqBd'g0\u0003V\u0015Fj'\u0015Ǹi\u001eA@?ߎ\u001d%i\u0003\u000fRq?\u000b?wA\rh='3ɞ{WLX\b\u0014++WՕer<\\\rQf\f/+ecSP\u0014*\u007fz\u0012\rD\u0004\u0014\u0006/HD-\"f\u000e\u000e;t\tSHP\u0018^Jȕ\u0003aL\u0017-Į;+O\u001bnQg@!NM{\rټ&#\u0017n)[Z\u0014h\u00151T\u007fQ7YH=^N\u0012YCs\fpx\u00022\u00046I\b/\u0012\u00116\u0017;7c9)!s\u0002^Doϸ\r`~SqRNC*n,72\t\u0012ZLd\u001bkXT^-\u0019M*Y\u000f}\u000e'(\\\u000e<)%&NWho\u000bU] %7f=Yvk$WA^9=Yc&aZΘ\u001c?Rb\rXlIYێp٢FЪ1xj>v4Rā\u000bȈ1Ǩp̅3ж0ɇ[ŨGԑ\u001d\u0003L\r\rmZ\u0001\u0010-Uտ(\u0003w&=1\u000f?tp\u001e\u0007)M:lx\"[Q\u00029'\u0017m\"\u0017\\-'\u0015p\f\u007fuk|MZ_.wkzN\n`9\u001a=K\b'~W(21SC\u000be\u007fpX'C\u000b\b\u0007Sh\\\u0007Nο/ݽdlPHb\u0011j0lm;\b\u0013\u0012*kT\u001c_id\rk>w\u00161{lRFx\u001d\u001fL71s0yM-q7M\u001b\u0006\u0012G\u0016\u0010ӡh6.ՙaχ֑xi\nϼb$˴a\u001a\t@6PI\b\u0011n&2h\u001bBv|(\fP\u0006L\raXqi~TPN9Ɂ|-߿֦\fߞÆ_>\u0019̎|Bʢ^rzQͥ\u0013vCS0\u0014S0|{н[#J=\u001c;\u007f?^*\u001ck0\u001dW+!>ҷr06o\b\u0013\tJx<4ZL8\u0010QҖh\u001e\u0010)\u0010\r`W(@\u0088rSX$S'\u0005\u0007L\u0013P]`O:G~WE,ָ4I\u0007\u0004E\u00033\u00147\u000fJ5\nIˎNEfmlRȁ83(\u0007M;Ik3a\u0002d\u0014w0{®n$:.{KRH\"G݀\u0010wxF]9e\u0015Urʊ\u0011~Td!W\u000f+\u0004\u001cۄ\t'\r/N!\f)-ٮRxEƣ\u0019I.R͛\u0006$|\u0012XK3\u0014ת,UJ\u0019̴&Bߺĺ?~\u000eÌ\u001foH\u0003ռ[o\u000e\u0015)\u000e!Hϛp.c0ƍ\u0012\u00019\u0012̑I\r\u0007\u001a1\u00187}ך20՜]Bs\b$P(Y˖\u0005!Ɖg)\u001cqصb\u0007b\u001b\fv8f|~.~ɋ\bUw\\h\u001fZ\u0003#aލW)\u0001Bޙ%O<\u0016Ԓ((P\u0012\u05cco2c$\u001d9ԻjBa_@\u0003#\f\u0016\u0012v2ժSn\u0015\u0004f[̠c!\\\u001bR\b\u0013la@e#\u05cf(Z|GXlǚ\u0012LF!0\u00154E\u00107\\;ӝ_M\u0004\u000e[4З0jA16`\u000f -\u0005\b\u001b;\u0011ߙ~pBQ\u0006\u000e\u0601+EIj<HƁXTrry>LsлAN,Y\"\u001f˶YP\"T[H kXA81\u0014\u0017\u0014fۙnM\u0019}\t_ǂ$B\u0004\u0013\u007f;\u05edxarHjOu9.=\u0381\u001a\bkIĎ4}LU\u001cHe\u0013 [\u07baU'aZYeK,ÅTX\u00018ڗ#T\f\u0004¬~]2v\u0097^#?ҕwX\nھ)~}RĜF\u0005x\"\u001c\\m&c|[\u0010D\bz\\)RĜ)El5W}m\b\u0002\\\u000esŵ6U\u0006qC%϶\u000fgqn=yw[&t^jʹrJ:zqD͉FXYX%]\u0017bői\u0003m\u007fGV8Z#\u001bղvIR\u000f\u001f\u0011\"&ĥJ\u000fFdD?\u0090یf\fFǹ#';Pմ\n\u001e\u0016\\g]лҍNa\u001bέ2\u0010\u0016O۠\u0011n{O/A_3u=g\u0019WoZ\u007f٣<Q39}z^CXt\u0007k yXq\u0015H\f9ʴFn>HI\t\n\u001c5|H>T)H6^H0^x/`Qؕ\u007f4 kց\u0014,~z\u0002Eמc)+ei\u001fWcǨ,\u0011\u00021 q$!ȹ\u001dk?B%\u0004\r_\u001f*5#I\u001e\f{ܞ\u000f\u001bax3_\nM\u001fYK\u001bf,?agM\u05f8\u000b8'R%C)pԼ\u0012\u0002\u000eP@IL~{7۲Jq%vEz\u0010)Ǫ\u000b\\܃7>\u000eM\t!cJޙ:>ߓ+^u\u0017ÝN\u0003{Xw6јz\"]Sϕt1>_\u0002Ah]Ȯ\u0013\u0007Q\u000bh\u0005\u0017 @NɅ\u00012\u001dT\u0001,N7ݯ\u0016md\u001cؖr\u0005e\u001fب3\u00040\u0013U9f-Nqߢ;`lGx\u007f\u0003)оCz\t\u000f=\u000fAX!zպ&NH\u0019+1\u0005YQ/\u0014eT'(uʱ9:aPc\u000e.MJ\u0014Îiyy+z\fCf\u001cu,\u000bн\u0004Vn\u0003\u0006|\u0005{4\u001aj]_\rZޓ .h÷l1,8œ\u000b\u0015\u0005Z\u000e\u0004W_Ϗ\u001e\u000bd-3N\u001fOÛ8_!A\u0013IC\u0016ɡLp|\u0005W\u000b)t{N/ ݓzMlo\u0013,8eǄNL]L9Di@6\u001bݒ\u0011\u001ccxB\u007ftp˸\\FS\b\ti<\bd0,h)l!#؈\u0001`4xQR(\u000f٧50J\u0015V)*\u0017Ĕ\u000bGt$axm\u0007\u0004t˳fLAkt\u000e\u0004SՐ.\n\by14~sr\u001cˁ\u0015ROz\u007f&`KK.35ؑ\u0003a\u0015\u0002յZZ\u0017&\u0018\u00139yЫz_\u0003Bz{3(̘e\u0007l%b(\u0010\u0006.\u001bѷ\u0004VsWBp*mW\u007f\u0001iˌoM;_6|\u000br9n`zV ިGpf<:2\nY[2\u0017g\u061cwpO#L\u001cg\u0012yhg\u0011\u00046\u0080\t\u0010\u0016d<0:G\u0004\fQ\rړf\u000f\rc\u0014&'\u001dwNqxJU˔Y8/\n'>OtCh\u000eo\u0601k^z\u0005c/?C*pEj$Qʙ\u0018\u007f\u0005d\f\u0002]1 rӥ\u001d\u0007bk*@~4Ö\u0012oIF\u00132ԥ~\r[ba&\u001aNߵ\u0012$.S1\u0018\u00153߱K3İ\t*9OV\u0001\u001aYш^=ȸ\u0004=9'(\u0019ſ'yy#x%/2F#wĨ\b>FwzO-\u001a\u001e\tσ1('e\u0013O\u000bAК]&*QN>ڢr!Mz\u007f.:xҐi\u0010e R\u0002=\f̿vdon\u0010nrIӥatG=ZVܸ\u0016>&-ܣ#J\u000f\u0005/Iբg.u\u0005ɂa*abϰ4\u001f@}V1ז%\u0019\u000175\u000e0\"5qVtŎ\u000e\u0017{^ٕ\u0011vtly-\r?ܚ\u0003\u001eK\u0014DL>Wێ \u00044n4pb\\Vsϱ\fdSC\u0019|Ќ;B@Bҫ\u0002ւ}?\u0011n\u0007%\f=ؿ\u0010\u000b\f\u00070x۷^\r&2]7רj\u0012/~b\bM՞3\u001b%¢7*F1Țd:\u001cs\u0007mM3\u0005%\u001f\u0019\u001c;\u0003e<\u007fð]B?0%j\u0014\u000b\u000eDƾB\u0003A\f\u001bb؏sJc\u0018ץ-\tb\u00189$ڊdf*mp\u0013ߠ`\\~hΣ\u0019H^\u001a\u0019\u001b);-9\u001f\u0001ݚNŬU9t˶_W|a\u001b\u0015\u0002OwNHL$~T\u05f94ۂD}zߏ\u00048K\b&/\u0015a?;\u001a\f~VFձ<ذ\u0016X\u0013͍*\u00158K,\f;XlVBVFhD{uDW\u000ed˪B\u05eeB\fUğ'P\u0014I5_\u0019\u0011$zdw+?E$T;Uëyɵ\tq.˰BH\u0006gAv\u001cYY\u0001\u001d_g>rLZ\u0014M$tݧVɩ\u000f\u000bWۦ\u00056Ff\u0011R^Mq\u000b>$*bV)\\\f\u001ek\u0011ֳ\rӌJ9C݅DfnV\nf\u0007Y7P\u0017VD)HَEֻc^)\u05fe0\u0017!j5SAeXĦ9ȷ?7O˯XqT\u000e 4/Gy\u001f\u001e(f\u0011u\fAò3ѕ[}cمBB\n'6:\u0015,48?\rlOtɥ ʶ+\u0005\u0013؏!r\u0010\u001ab\u001c+j~1\u000eȱQޢGUhßBk3\bb0!/67'FQi\u0003%#@\u001d\u0010*}am@;`j(\u0016yo&y+GbA8X@nDE?ÒEݏkI;ėT\u001a^~\b~_\bK˘o̡\\\u0014:ȱnOH) j\u0007toëdʛfF3߳~R'A:-X\u0019Nх+߉$bpקF\u0015g\u0019.^U\u0003mٚ=ǷFŶQƈKWU\u05300wX/*\u000fln\u0015!\u0007\fe>j/Pe\u0013d\u0005Z$\f~\"\u000fٿFڀ}4t©]+vaj jPWO\u001f3+\u00152?x=lXJφ\u0013ڊ\u0017N\u001fܚ\"s\u0013\u001bFJ\u00158K\u0010g!qDo}\rk/EQQZɂ1˕`_\u0001~0:w!|B2\t\u0004A}7WQyÅ\u000e²Md\u0013{f'8XW\u001d4]_\rZ{Xt\u0011Bpn\u0005Svn\\\u0012I֢/һp\u001a\u001cǓ!=g>~!\u0014\u0002T|A\u038b\u001bװXۼ\u0015'2ϣ]JXSeUc=A&:`K\u001fcQ \u0016\\Y)шpϩV̾BԆJs|ԓ\b>K\u0010k\u001f#P<\u0003\u0014^jVxT>MeX\u001f\u0016tQ#X5Ƈiǣ+\u000e\u0003\u0090\u0001/\u000bE}J=\u0004 fNHrc$ߣ\u001aܟO9)ƫ<\u0012\u0004Mof-AyjqٽMƼ6\u007fMȃ;y|b\\\u001c\u0004\u001eN[\u0004C=$qךhʛJ\u0012-ߐ5\u0001\u001c~#\u0016biJ\u001fl&*\u001d%ߍpĐpfdӃ\u001dY\u0003\u000eJ\u0015-n\u001aћ\rԙ?\u001f\u007f߮7Q\u0004B\u0013_=\u0012Y\u000b2ȿ\u0007ºKNde1\u001315!-:_m\u0014J\u0014\u001eu\u000e\u0002\u0018 v7/x%ܳ'ܧo#y\u07bb\u0013\u0003Q1\u0007^xx.w\u0011CXo]ȅ(ލL\"3ƶ}\u001d\u0011fz1\u0003^@ΓQ\u0603\u0019'Pω_\"%Rh\r\f*\u001eӆSغh\u001e?ܣ0yYw,.<1 \u001d{P\u001e\u0011Mʼ/ӻR\u0016\u0006ÅG}#\u0010h$B\u001c)ؗ~߹<\u001a0\u061cdQ*\b\u0001c*w\u0004ό=ď\r\u000eVٞA\u0014?_\ro!fҕV\u0011IΫ\u001e\u0001G5?\u0007ĢQC'ujòG\u00141ǰGڨ\u001e"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011b|-Aq\u0015\fWKFuB\u001e\u0006laKba*N\u00055KIR3`a\u0007\u001c\u0014\u0019Z\u0010J:\rbcI/jS\r", "\u001a`]1e6BR,Hxh9|R@i\u007f:E\u001c~\u0015\u0017U}\u00129z,9h\u0012~7t\u00160IR;I>& dp\u000f", "DhTD", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011b|-Aq\u0015\fWKFuB\u001e\u0006laK\\", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\"\u001eC~\u000fF\u0004-~5\u0007\u001fDw\u001a-+MCv>,\u0015Ye9\u00199o?", "\u0013wc?T\u000b:b\u0015mzl;k\u0016+v\u007f5\n<\br\u0018Vo\u001b-r,", "", "5dc\u0012k;KOwz\nZ\u001b|\u0017>T\r$\r@\u000e%\u0013NK\u000fKv2&U\u0005^Gq\u0010;MJ;gB\u001e", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "\u0013wc?T\u000b:b\u0015mzl;k\u0016+v\u007f5\n<\bs\u0017Hy\u001b<g!<", "5dc\u0012k;KOwz\nZ\u001b|\u0017>T\r$\r@\u000e%\u0013NL\u000e=\u000125Jy'u}\u001a(ZCBk0,\u0015", "!d]1E,<c&\f~g.X\u0007-e\u000e6\u007f=\u0005\u001e\u001bV\u0004mMv.Dga)Fm#?IJ#o;%\u0019v", "", "5dc X5=@\u0019|\u000bk9\u0001\u00121A}&{N\u000f\u001b\u0014Kv\u0012K\u000b\u0005FY\u0007/EQ\u001f=MPLg;\u0006\u0019oh=\u0015\"<Rp4GSN(jR", "u(9", "Adc X5=@\u0019|\u000bk9\u0001\u00121A}&{N\u000f\u001b\u0014Kv\u0012K\u000b\u0005FY\u0007/EQ\u001f=MPLg;\u0006\u0019oh=\u0015\"<Rp4GSN(jR", "uI\u0018#", "/bR2f:BP\u001d\u0006~m@Z\u0019<s\n5fJ\u000f\u001b&Ky\u0017", "", "D`[BX", "", "/bR2f:BP\u001d\u0006~m@]\u0013<c\u007f\b\u0005<}\u001e\u0017FP\u0018Ie%Ch\u0002)9", "5dc\u000eV*>a'\u0003wb3\u0001\u0018CF\n5y@` \u0013Dv\u000e;W/BH}.Fq\u001f0\fS?eA\u001e\u001ch]G\u0007", "u(I", "Adc\u000eV*>a'\u0003wb3\u0001\u0018CF\n5y@` \u0013Dv\u000e;W/BH}.Fq\u001f0\fS?eA\u001e\u001ch]G\u0007", "uY\u0018#", "/bR2f:BP\u001d\u0006~m@d\u00058a\u0002(\t", "\u001a`]1e6BRb\u0010~^>F\u0005-c\u007f6\nD}\u001b\u001eK~\"\u0006R#3Y\f.;j\u001a5QROS0'\u0011jaF\\", "/bc6b5\"R\b\taZ)|\u0010", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nn\"\u0013T}\u000e\u0018\u000421m[*?x\u0012=#", "", "0nd;W:.^\u0018z\n^\n\u007f\u00058n\u007f/", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00038U\u0007)7tk", "", "1gT0^0GUy\t\bL,\u0005\u00058t\u0004&\n\u001e\u0004\u0013 Io\u001c", "1ta?X5MA\u0019\u0007vg;\u0001\u0007=N\n'{N", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nd &1l\u0013<t4\u001dU\tu", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n#Y\u0006\u001c@|\u001a,[,Ej4\u0010\u0019wd\u0015\u0006h<\\\u0006'F)X<eQ\u0001\u0013", "5dc\u0010h9KS\"\u000eh^4x\u0012>i}6dJ\u007f\u0017%", "u(;.a+K]\u001d}\u000e(*\u0007\u00106e}7\u007fJ\n`zP~w9{%3he\u001cBC", "1ta?X5MA\u0019\u0007vg;\u0001\u0007=N\n'{Nd (Cv\u0012;r45X", "1ta?X5MZ-_\u0005\\<\u000b\t.Ah\f", "\u001a`]1e6BR,Hxh9|R@i\u007f:E<~\u0015\u0017U}\u00129z,9h\u0012i\u0013k\u0014.[Q?h8%\u0019wu\"\u0011b,2\u007f(Q*X4gN\u0002\u0013", "3mP/_,=A\u0019\f\fb*|\u0017", "", "\u001a`]1e6BRbzx\\,\u000b\u00173b\u0004/\u007fO\u0015%\u0017T\u0001\u0012:vn\u0011W{ E{\u001a+QJ?zH\f\u0015ur=\u0005c\u0010Ww1\u001d", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "", "3mP/_,=A(z\n^\u0013\u0001\u0017>e\t(\t", "\u001a`]1e6BRb\u0010~^>F\u0005-c\u007f6\nD}\u001b\u001eK~\"\u0006R#3Y\f.;j\u001a5QROS0'\u0011jaFE?*Lv5UPK0cV\u0002Q\u0002!V\u001dN\t\u0010\u0001bC$UHE.\b5I\u000f\u0011", "4nRBf,=D\u001d\f\nn(\u0004y3e\u0012\fz", "6`]1_,K", "\u001a`]1e6BRb\t\t(\u000fx\u0012.l\u007f5Q", "6ne2e,=D\u001d\f\nn(\u0004y3e\u0012\fz", "5dc\u0015b=>`\u0019}kb9\f\u0019+lp,{Rd\u0016UWs\bIv,5U\f ui\u001f7WR7z8(\u001ev", "u(E", "5dc\u0015b=>`\u0019}kb9\f\u0019+lp,{Rd\u0016UWs\bIv,5U\f ", "u(8", "Adc\u0015b=>`\u0019}kb9\f\u0019+lp,{Rd\u0016UWs\bIv,5U\f ", "uH\u0018#", "7cC<4-MS&fvi", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<Z.D=\u0007/\u001fi!\u0004", "5dc\u0016W\u001bH/\u001a\u000ezk\u0014x\u0014mu\u0004\"\t@\b\u0017\u0013Uo", "u(;.a+K]\u001d}\u000e(*\u0007\u00106e}7\u007fJ\n`~W~\n9}%\u0019b\r\u0004@|}*X\u0019", "Adc\u0016W\u001bH/\u001a\u000ezk\u0014x\u0014mu\u0004\"\t@\b\u0017\u0013Uo", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJ~'Vk\u000bCv\t>ha)FU\u00129#\u0007,", "7cC<5,?]&~bZ7", "5dc\u0016W\u001bH0\u0019\u007f\u0005k,d\u0005:$\u0010,uM\u0001\u001e\u0017C}\u000e", "Adc\u0016W\u001bH0\u0019\u007f\u0005k,d\u0005:$\u0010,uM\u0001\u001e\u0017C}\u000e", "7r4;T)ES\u0018", "7r4;T)ES\u0018=\u000bb&\n\t6e{6{", "7rC<h*A3,\n\u0002h9x\u00183o\t\b\u0005<}\u001e\u0017F", ":`Q2_\u001bH/\u0017\u000e~h5`\b", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<`\":Y{/\u001bv%\u0016IN\u0011", "<nS2C9Hd\u001d}zk", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011b|-Aq\u0015\fWKFuB\u001e\u0006laKba*N\u00055KIR3`a\u0007\u001c\u0014\u0019Z\u0010J:\rbcI/jSu|\u00124T\fIh\\\n\u0014\u000eCxt?Z\u0017K\t)^K(h1fi\u000bK@Eo\u007f", "=mB2a+\u001aQ\u0017~\tl0y\r6i\u000f<[Q\u0001 &", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BRb\u0010~^>F\u0005-c\u007f6\nD}\u001b\u001eK~\"\u0006R#3Y\f.;j\u001a5QROKE\u001e\u001ew7", "5dc\u001ca\u001a>\\\u0018Zx\\,\u000b\u00173b\u0004/\u007fO\u0015v(Gx\u001dz\u0007)/f}'7i$.\f?Dt>-\u0011weC\u0010q", "5dc\u001ca\u001a>\\\u0018Zx\\,\u000b\u00173b\u0004/\u007fO\u0015v(Gx\u001dz\u0007)/f}'7i$.", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "Adc\u001ca\u001a>\\\u0018Zx\\,\u000b\u00173b\u0004/\u007fO\u0015v(Gx\u001dz\u0007)/f}'7i$.", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc(", ">`]270L^ z\u000f^+", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<Z.DG}/\r", ">d]1\\5@6#\f~s6\u0006\u0018+lm&\tJ\b\u001evXo\u0017K\u0005", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<Z.DCz%7k%\u0016IN\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G{-At\u001d\n`GIX0'\u0017h7", ">d]1\\5@B\u0019\u0012\nM9x\u001a/r\u000e(z \u0012\u0017 V", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011b|-Aq\u0015\fWKFuB\u001e\u0006laKba*N\u00055KIR3`a\u0007\u001c\u0014\u0019Z\u0010J:\rbcI/jSu\n\b5H\u0006Djo\f)\u001d$wlSV\u001dUy\u0014UR)qU/", ">d]1\\5@D\u0019\f\nb*x\u0010\u001dc\r2\u0003G`(\u0017P~\u001c", ">qTC\\6Na\u0007~\u0003Z5\f\r-sh2z@\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n#Y\u0006\u001c@|\u001a,[,Ej4{\u001fsu\u000f", ">qTC\\6Na\u0007~\u0003Z5\f\r-sl2\u0006O", ">qTC\\6Na\b\fvo,\n\u0017/dh2z@", "\u001aiPCTuEO\"\u0001DB5\f\t1e\r}", "AbW2W<ES\u0007|\bh3\u0004h@e\t7_Ai\u0017\u0017Fo\r#r-2Xy", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n#W\u000b*>t\u007f+[CH|0-\u0019rj'\u0005m7NL", "Aba<_3(P'~\bo(\f\r9nm&\u0006K\u0001%", "Ad\\.a;BQ'\\}Z5~\t\rh\u007f&\u0002@\u000e", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "Ad]1\\5@4#|\u000bl\b}\n/c\u000f,\u0005B`(\u0017P~", "AtQAe,>1\u001cz\u0004`,{o+y\n8\u000b)\u000b\u0016\u0017U", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\n\\$$C\u0004{<\u0006z", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6mk", "Bnd0[\fQ^ \t\bZ;\u0001\u00138S\u000f$\u000b@g\u001b%Vo\u0017<\u0004", "\u001a`]1e6BRb\u0010~^>F\u0005-c\u007f6\nD}\u001b\u001eK~\"\u0006R#3Y\f.;j\u001a5QROS0'\u0011jaFER6^t*'_Y3f_nL\u0018\u001cc{]'\u001c\u00057D wF7\u0006\f:X\u0002Dh\u000ea", "Cq[ c(G1\u0015|}^", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0019Cr46c\u000b(\u0001]\u0003\u0015;N7t\u0012\u001a\u0013ka\u000f", "5dc#\\,P", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\"Nk\u001d=\u00012=#Y)6z 2L!Es?(#hR=\u0007u\u0002", "/cS\u0012k;KOwz\nZ\u001b\u0007d-c\u007f6\nD}\u001b\u001eK~\"%\u0001$5=\u0007!AP\u00165XCH", "DhaAh(ED\u001d~\rB+", "7mU<", "3wc?T\u000b:b\u0015dzr", "/qVB`,Gb'", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "0nd;W:\"\\\u0007|\b^,\u0006", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{>\u0010l", "<nS2", "0nd;W:.^\u0018z\n^:\\\u001a/n\u000f\u000f\u0006J\f", "0nd;W:.^\u0018z\n^:\\\u001a/n\u000f\u000f\u0006J\fU'Ki\u001b<}%1g}", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "1`] V9HZ ", "DdaA\\*:Z", "2ha2V;B]\"", ">nb6g0H\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "1`] V9HZ F\u0003h\u001eie\u0015g", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJz VY\u000bAv#DAy+\rby\u0013\u00118", "1`] V9HZ FE:\u0019Go\u000b0>8\u007f:\u000e\u0017\u001eGk\u001c<", "uY8\u0017\u001c!", "1gT0^\rH`\u0007~\u0003Z5\f\r-s]+wI\u0003\u0017%", "1kT.e\b<Q\u0019\r\tb)\u0001\u00103t\u0014\t\u0006>\u0011%", "1qT.g,\u001ed\u0019\b\n", "3uT;g\u001bR^\u0019", "1qT.g,']\u0018~^g-\u0007", "1qT.g,,b\u0015\u000ez=,\u000b\u0007<i\u000b7\u007fJ\nw!T^\u000eO\u0006\u00069Y\u0005\u001f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ$u3\u001ej", "1qT.g,-S,\u000eh^3|\u0007>i\n1YC| \u0019GnmMv.D", "4q^:<5=S,", "Bn8;W,Q", "7sT:66N\\(", "BdgA", "uH;7T=:\u001d z\u0004`u`\u0012>e\u0002(\t\u0016g\u001c\u0013XkWCr.7#a)Fm\u0018.Z\u0019\"p0/\u00112h5\u0010eu2\u007f6GNN929w9%\u000e$\u0015J4\u000fN7D {27+\u0018,R\u007f;>Dr\u0012\u00174wzFUYX}\u0015\b\u000b%fDYm\bK>Ii.s )xZ8:2\"u\u0016\u001foT=\u001e[d\u0011{aO", "2hb=T;<V{\t\f^9\\\u001a/n\u000f", "3uT;g", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "2hb=T;<V{\t\f^9\\\u001a/n\u000ff\fDz$\u0017No\nJv", "5d^:X;Kgw~\u0006m/]\r<s\u000f\u0016{<\u000e\u0015\u001a", "1ta?A6=S", "5d^:X;Kg\u007f\u0003\tm", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", "1n]AT0GS&fvi\u001b\u0007f2i\u0007'\t@\n", "5dc\u000eV*>a'\u0003wb3\u0001\u0018CN\n'{+\u000e!(Kn\u000eI", "\u001a`]1e6BR,Hxh9|R@i\u007f:E<~\u0015\u0017U}\u00129z,9h\u0012i\u0013k\u0014.[Q?h8%\u0019wu\"\u0011b,9\u00041XPM,i0|E\u001f\u000eic", "6nbA", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "5dc\u000eV*>a'\u0003wb3\u0001\u0018CS\u007f/{>\u0010\u001b!PO\u0017;", "5dc\u000eV*>a'\u0003wb3\u0001\u0018CS\u007f/{>\u0010\u001b!P]\u001d8\u00044", "5dc\u0016a-H7'\\}^*\u0003\u0005,l\u007f", "5dc\u0016a-HA(z\n^\u000b|\u0017-r\u00043\u000bD\u000b \u0001TX\u001eC}", "5dc\u0016a-HB\u0019\u0012\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=A", "5dc\u0016g,KO\u0016\u0006zM,\u0010\u0018\u0010o\r\u0004y>\u0001%%Kl\u0012Cz4I", "5dc\u0016g,KO(\t\b?6\nj<a\t8\u0003<\u000e\u001b&[", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011W{ E{\u001a+QJ?zH\u0002$hn5\u0016m9\\5\u0016G_]\u001a\\Tz=\u001d!>\u001dN8\t\u0014cNy", "5qP;h3:`\u001d\u000e\u000f", "6hc!X:MA\u0019\u0007vg;\u0001\u0007=A\u000f", "F", "", "G", "6hc!X:MA\u0019\u0007vg;\u0001\u0007=A\u000ff\fDz$\u0017No\nJv", "7r00V,La\u001d{~e0\f\u001d\u0010o}8\n@\u007f", "7r00V,La\u001d{~e0\f\u001d\u001de\u0007(yO\u0005! '\u0003\u001d<\u007f$1V\u0005 ", "7rB0e,>\\\u0006~v],\ni9c\u00106w=\b\u0017", "<nc6Y@,c\u0016\u000e\b^,X\u0007-e\u000e6\u007f=\u0005\u001e\u001bV\u0004{Kr457\u0001\u001c@o\u0016-1D$k4\u001d\u0015g", ":`h<h;']\u0018~", "=m;.l6Nbv\u0002vg.|", "=m;.l6Nbv\u0002vg.|G?iy5{G\u0001\u0013%G", "=mB2`(Gb\u001d|\t</x\u00121e", "=mB2`(Gb\u001d|\t</x\u00121e>8\u007f:\u000e\u0017\u001eGk\u001c<", ">da3b9F/\u0017\u000e~h5_\t6p\u007f5", "/bc6b5", ">n_B_(MSt|x^:\u000b\r,i\u0007,\u000bTi!\u0016GS\u0017=\u0001\u0010Bc\t D|\u001a.[", "Ad\\.a;BQ'g\u0005],", "@dV6f;>`\u0007|\bh3\u0004\r8gc'", "7c", "=kS V9HZ hwl,\n\u001a+t\u00042\u0005.~!\"G}", "@d`BX:M/\u0017|zl:\u0001\u00063l\u00047\u0010!\u000b\u0015'U", "AbW2W<ES\u0007|\bh3\u0004h@e\t7_Ai\u0017\u0017Fo\r", "Aba<_3(P'~\bo(\f\r9nm&\u0006K\u0001", "Ad\\.a;BQv\t\u0003i(\n\u0005>o\r", "\u001aiPCTuNb\u001d\u0006D<6\u0005\u0014+r{7\u0006MV", "\u001aj^A_0G\u001dv\t\u0003i(\n\u0005>o\r}", ":`h<h;\"a\u0006\u000e\u0002", "Ad\\.a;BQ'g\u0005],`\b\u001eo[&y@\u000f%\u001bDs\u0015@\u00069&]\u000b/Gi\u001d\u0017WB;O3", "Ad]14*<S'\r~[0\u0004\r>ym(\u0004<\n&\u001bE}{K\u000453h\u000e-7K\u0019*VE;KE\u001e\u001ewo", "<df\u001bb+>", "=kS\u001bb+>", "Ad]18=>\\(", "Ad]18=>\\(_\u0005k\u001d\u0001\u0016>u{/lD\u0001)", "1n]AX5M1\u001cz\u0004`,k\u001d:e", "1n]AX5M2\u0019\rxk0\b\u00183o\t", "uH8\u0019](OOb\u0006vg.Fl8t\u007f*{MV}\u001cC\u0001\n\u0006\u000749`G\u0007;{%\u0004\u00118", "Ad]1C(GSv\u0002vg.|h@e\t7\n", "Ad\\.a;BQ'g\u0005],`\b", "Bhc9X", "Ad]1C,GR\u001d\b|M,\u0010\u0018\u001er{9{M\u000f\u0017\u0016#~oIr.E`y-;|*\u000e^CDz", "Ad]1F,FO\"\u000e~\\:g\u00169p\u007f5\u000bT^\u001a\u0013Pq\u000e\u001c\b%>h\f", "<df X4:\\(\u0003xl\u0015\u0007\b/s", "Ad]1F<;b&~z</x\u00121e[&y@\u000f%\u001bDs\u0015@\u00069\u0015j})F{", "AtQAe,>1\u001cz\u0004`,{v/m{1\u000bD~%\u007fQn\u000eJZ$C", "Ad]1G@IS\n\u0003zp\u001az\u00169l\u0007(z\u001c~\u0015\u0017U}\u00129z,9h\u0012\u007fHm\u001f=", "Adc\u000eV*>a'\u0003wb3\u0001\u0018CS\u007f/{>\u0010\u001b!P", "AsP?g", "3mS", "BqPCX9LO f\u0005],", "Adc\u0010b5MS\"\u000e^g=x\u00103d", "Adc\u0016f\nAS\u0017\u0005v[3|", "Adc g(MSw~\t\\9\u0001\u0014>i\n1", "Adc!X?M", "Adc!e(OS&\rve\u001dx\u0010?e\u000e", "AnaA5@ S#\u0007zm9\u0011j<o\u00103\u007fI\u0003%", ">`a2a;%W'\u000eih\u001a\u0007\u0016>", "1n]AT0GS&\\}b3{\u0016/ng$\u0007K\u0005 \u0019", "AtQAe,>A#\f\n^+Y\u001d\u0011e\n0{O\u000e+xTy\u001eGz.7", ":hbAG6,]&\u000e", "BnB0e,>\\v\t\u0005k+\u000b", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{>\u0010wl", "BdgAA6=S", "0nd;W:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "BqPCX9LSt\u000e\\k(\u0006\u00196a\r,\u000bT", "4naDT9=", "3wc2a+,S ~xm0\u0007\u0012", "BqX:G6,W.~", "\"", "Ahi2", "uKY.i(\bZ\u0015\b|(\n\u007f\u0005<S\u007f4\f@\n\u0015\u0017\u001dSQ#{!FUG'3v\u0018w+F7x\"\u001e!xaB\u0005c\u0002", "CoS.g,!]*~\b^+m\r<t\u0010$\u00031\u0005\u0017)", "CoS.g,,S!z\u0004m0z\u0017\u0018o~(\n\u001e\u000b\"+#x\r'r.5g", "5dc!X?M4#\fi^?\fi3e\u0007'", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ\u0019u=\u001f\u0019jqF\u0003r0X\u007f|", "BnB=T5GO\u0016\u0006zL;\n\r8g", "\u001a`]1e6BRb\u000ezq;Fv:a\t1w=\b\u0017\u0005V|\u0012Exz", "\u000foX~'\u0010F^ ", "\u000foX~,\u0010F^ ", "\u0011n\\=T5B]\"", "\u0011n\\=b:>/\u0017|zl:\u0001\u00063l\u00047\u0010)\u000b\u0016\u00172|\u0018Mz$5f", "\u001asa\u000fb<GR'\\\u0005f7x\u0016+t\n5", "\u001ed]1\\5@B\u0019\u0012\nM9x\u001a/r\u000e(z \u0012\u0017 V", " s[\u000fb<GR'\\\u0005f7x\u0016+t\n5", "\"n_\u000fb;M]![\u0005n5{\u0017\ro\b3wM|&!T", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AndroidComposeViewAccessibilityDelegateCompat extends AccessibilityDelegateCompat {
    public static final int AccessibilityCursorPositionUndefined = -1;
    public static final int AccessibilitySliderStepsCount = 20;
    public static final String ClassName = "android.view.View";
    public static final String ExtraDataIdKey = "androidx.compose.ui.semantics.id";
    public static final String ExtraDataTestTagKey = "androidx.compose.ui.semantics.testTag";
    public static final int InvalidId = Integer.MIN_VALUE;
    public static final String LogTag = "AccessibilityDelegate";
    public static final int ParcelSafeTextLength = 100000;
    public static final String TextClassName = "android.widget.TextView";
    public static final String TextFieldClassName = "android.widget.EditText";
    public static final long TextTraversedEventTimeoutMillis = 1000;
    private final String ExtraDataTestTraversalAfterVal;
    private final String ExtraDataTestTraversalBeforeVal;
    private long SendRecurringAccessibilityEventsIntervalMillis;
    private int accessibilityCursorPosition;
    private boolean accessibilityForceEnabledForTesting;
    private final android.view.accessibility.AccessibilityManager accessibilityManager;
    private SparseArrayCompat<SparseArrayCompat<CharSequence>> actionIdToLabel;
    private final Channel<Unit> boundsUpdateChannel;
    private boolean checkingForSemanticsChanges;
    private IntObjectMap<SemanticsNodeWithAdjustedBounds> currentSemanticsNodes;
    private boolean currentSemanticsNodesInvalidated;
    private AccessibilityNodeInfoCompat currentlyFocusedANI;
    private List<AccessibilityServiceInfo> enabledServices;
    private final AccessibilityManager.AccessibilityStateChangeListener enabledStateListener;
    private int focusedVirtualViewId;
    private final Handler handler;
    private MutableIntIntMap idToAfterMap;
    private MutableIntIntMap idToBeforeMap;
    private SparseArrayCompat<MutableObjectIntMap<CharSequence>> labelToActionId;
    private ComposeAccessibilityNodeProvider nodeProvider;
    private MutableIntSet paneDisplayed;
    private final MutableIntObjectMap<ScrollAxisRange> pendingHorizontalScrollEvents;
    private PendingTextTraversedEvent pendingTextTraversedEvent;
    private final MutableIntObjectMap<ScrollAxisRange> pendingVerticalScrollEvents;
    private MutableIntObjectMap<SemanticsNodeCopy> previousSemanticsNodes;
    private SemanticsNodeCopy previousSemanticsRoot;
    private Integer previousTraversedNode;
    private final Function1<ScrollObservationScope, Unit> scheduleScrollEventIfNeededLambda;
    private final List<ScrollObservationScope> scrollObservationScopes;
    private final Runnable semanticsChangeChecker;
    private boolean sendingFocusAffectingEvent;
    private final ArraySet<LayoutNode> subtreeChangedLayoutNodes;
    private final AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateListener;
    private final URLSpanCache urlSpanCache;
    private final AndroidComposeView view;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final IntList AccessibilityActionsResourceIds = IntListKt.intListOf(R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31);
    private int hoveredVirtualViewId = Integer.MIN_VALUE;
    private Function1<? super AccessibilityEvent, Boolean> onSendAccessibilityEvent = new Function1<AccessibilityEvent, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(AccessibilityEvent accessibilityEvent) {
            return Boolean.valueOf(this.this$0.getView().getParent().requestSendAccessibilityEvent(this.this$0.getView(), accessibilityEvent));
        }
    };

    /* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleableState.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ void getHoveredVirtualViewId$ui_release$annotations() {
    }

    public static /* synthetic */ void getOnSendAccessibilityEvent$ui_release$annotations() {
    }

    public final AndroidComposeView getView() {
        return this.view;
    }

    /* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u0018\u007f\u0007ljA0RqP.XY2\u000fy\u0003<řaҜrYП\u0006\u001a,!ITTg̊rJh\u000b\u0014\u001b\u0014\u0017\u0011jZK,ޏ_ܫ\u00132Jģ\u0010?[rU9\u000fx\rӓrݨ&8\u0002ڎQ&8M(v)G\"ÏdضDpBĥ]Y\u0013 *\u0006l'Wȭ/ʄR6PǍ.F=+\u001bipU}ۆ\u0003ƊQ\rNÖw\u0019\u0005j6+n>\f՝w٨\u0007\u0007Z¹\u0010\u000fM{U\u0005\u0017+}ǩ\u001cָ[6`Üd!9Z%]!-3ӫ$ԃ\u0010'3Ւ4W^\u001a@w)\u007fcɤV؝\n'P͓}&t\u0015&3#y*ú#ؿbB\bЭ2B%3\u00183Y@qƟ$ň?\u0019VљL\u0011\u001b-;\u0001\u001d12ٱ`\u05ce\u0019\u001b\\ȭά5b"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011b|-Aq\u0015\fWKFuB\u001e\u0006laKba*N\u00055KIR3`a\u0007\u001c\u0014\u0019Z\u0010J:\rbcI/jSu|\u00124T}Dl\u000b\u0015k", "", "u(E", "\u000fbR2f:BP\u001d\u0006~m@X\u0007>i\n1\n-\u0001%!W|\f<Z$C", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nd &.s\u001cKL", "\u000fbR2f:BP\u001d\u0006~m@Z\u0019<s\n5fJ\u000f\u001b&Ky\u0017,\u007f$5Z\u0002)7l", "", "\u000fbR2f:BP\u001d\u0006~m@j\u00103d\u007f5iO\u0001\"%%y\u001eE\u0006", "\u0011kP@f\u0015:[\u0019", "", "\u0013wc?T\u000b:b\u0015byD,\u0011", "\u0013wc?T\u000b:b\u0015mzl;k\u00051K\u007f<", "\u0017me._0=7\u0018", "\u001anV!T.", "\u001e`a0X3,O\u001a~i^?\fo/n\u00027~", "\"dgA63:a'gvf,", "\"dgA90>Z\u0018\\\u0002Z:\u000bq+m\u007f", "\"dgAG9:d\u0019\f\t^+\\\u001a/n\u000f\u0017\u007fH\u0001!'VW\u0012C})C", "", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AndroidComposeViewAccessibilityDelegateCompat(AndroidComposeView androidComposeView) throws Throwable {
        this.view = androidComposeView;
        Context context = androidComposeView.getContext();
        Object[] objArr = {C1626yg.Ud("x5]\u0005\u000f@ax\u0017\u001fVoF", (short) (Od.Xd() ^ (-10162)), (short) (Od.Xd() ^ (-31348)))};
        Method method = Class.forName(Ig.wd("\ng/\u001d\t6MNE\u001d\"\u0006LWQhQoFDva3", (short) (FB.Xd() ^ 28891))).getMethod(C1561oA.Qd("RO];`YYIP5FRUG@A", (short) (ZN.Xd() ^ 30212)), Class.forName(EO.Od("\u001ckB\n>!>s\u001fVQ\u001diR7V", (short) (FB.Xd() ^ 12888))));
        try {
            method.setAccessible(true);
            Object objInvoke = method.invoke(context, objArr);
            short sXd = (short) (C1607wl.Xd() ^ 1171);
            short sXd2 = (short) (C1607wl.Xd() ^ 19029);
            int[] iArr = new int["*2*+_$#124:f*.i.-@BnD@qACC\u0003EMEFzPVND\u007fBPGVTOK\u0016_SPc\u001bORSVef]W_cams)=`adstkemqo{\u0002Vkymts\u0002".length()];
            QB qb = new QB("*2*+_$#124:f*.i.-@BnD@qACC\u0003EMEFzPVND\u007fBPGVTOK\u0016_SPc\u001bORSVef]W_cams)=`adstkemqo{\u0002Vkymts\u0002");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
                i2++;
            }
            Intrinsics.checkNotNull(objInvoke, new String(iArr, 0, i2));
            android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) objInvoke;
            this.accessibilityManager = accessibilityManager;
            this.SendRecurringAccessibilityEventsIntervalMillis = 100L;
            this.enabledStateListener = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$$ExternalSyntheticLambda1
                @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
                public final void onAccessibilityStateChanged(boolean z2) throws Throwable {
                    AndroidComposeViewAccessibilityDelegateCompat.enabledStateListener$lambda$0(this.f$0, z2);
                }
            };
            this.touchExplorationStateListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$$ExternalSyntheticLambda2
                @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
                public final void onTouchExplorationStateChanged(boolean z2) throws Throwable {
                    AndroidComposeViewAccessibilityDelegateCompat.touchExplorationStateListener$lambda$1(this.f$0, z2);
                }
            };
            short sXd3 = (short) (OY.Xd() ^ 15491);
            int[] iArr2 = new int["8D9FB;5}E72Cx+,+,98-%+-)37j|\u001e\u001d\u001e+*\u001f\u0017\u001d\u001f\u001b%){\u000f\u001b\r\u0012\u000f\u001b".length()];
            QB qb2 = new QB("8D9FB;5}E72Cx+,+,98-%+-)37j|\u001e\u001d\u001e+*\u001f\u0017\u001d\u001f\u001b%){\u000f\u001b\r\u0012\u000f\u001b");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(sXd3 + sXd3 + i3 + xuXd2.CK(iKK2));
                i3++;
            }
            Object[] objArr2 = {-1};
            Method method2 = Class.forName(new String(iArr2, 0, i3)).getMethod(C1561oA.Kd("baqCmacnhhFijm|}tnvzx\u0005\u000bex\u0007\f\u007fz}e\u0004\u000f\u0011", (short) (Od.Xd() ^ (-7932))), Integer.TYPE);
            try {
                method2.setAccessible(true);
                this.enabledServices = (List) method2.invoke(accessibilityManager, objArr2);
                Object[] objArr3 = new Object[0];
                Method declaredMethod = Class.forName(Wg.Zd(",\u000e~\u0017\u000e\u0013H[Wf\u001bCak'f.", (short) (C1580rY.Xd() ^ (-1679)), (short) (C1580rY.Xd() ^ (-32231)))).getDeclaredMethod(C1561oA.Xd("EDT.CLR1UVXN\\", (short) (Od.Xd() ^ (-17191))), new Class[0]);
                try {
                    declaredMethod.setAccessible(true);
                    this.handler = new Handler((Looper) declaredMethod.invoke(null, objArr3));
                    this.nodeProvider = new ComposeAccessibilityNodeProvider();
                    this.focusedVirtualViewId = Integer.MIN_VALUE;
                    int i4 = 0;
                    int i5 = 1;
                    DefaultConstructorMarker defaultConstructorMarker = null;
                    this.pendingHorizontalScrollEvents = new MutableIntObjectMap<>(0, 1, null);
                    this.pendingVerticalScrollEvents = new MutableIntObjectMap<>(0, 1, null);
                    this.actionIdToLabel = new SparseArrayCompat<>(i4, i5, defaultConstructorMarker);
                    this.labelToActionId = new SparseArrayCompat<>(i4, i5, defaultConstructorMarker);
                    this.accessibilityCursorPosition = -1;
                    this.subtreeChangedLayoutNodes = new ArraySet<>(i4, i5, defaultConstructorMarker);
                    this.boundsUpdateChannel = ChannelKt.Channel$default(1, null, null, 6, null);
                    this.currentSemanticsNodesInvalidated = true;
                    this.currentSemanticsNodes = IntObjectMapKt.intObjectMapOf();
                    this.paneDisplayed = new MutableIntSet(0, 1, null);
                    this.idToBeforeMap = new MutableIntIntMap(0, 1, null);
                    this.idToAfterMap = new MutableIntIntMap(0, 1, null);
                    this.ExtraDataTestTraversalBeforeVal = Wg.vd("@NETJEA\fMA>Q\u00015894CD;-597;Av/;87'l\u0005\u0019\u0016\r|\u001c\u0002w\fy\u0019\u0007x\b\n\u000e\u0004\u0003r\u0001p~\u0001gsjnhrvj~vbn", (short) (C1607wl.Xd() ^ 32153));
                    short sXd4 = (short) (C1633zX.Xd() ^ (-12357));
                    short sXd5 = (short) (C1633zX.Xd() ^ (-4521));
                    int[] iArr3 = new int["P\\Q^ZSM\u0016]OJ[\u0011CDCDQPE=CEAKO\u00039KFC1|\u0013% \u001d\u000b(\f\b\u001a\u0006#\u0017\u0007\u0014\u0014\u001e\u0012\u000f|\u0011~\u000b\u000bw\u0002uy\u0007v\u0003\u000f\u0005nx".length()];
                    QB qb3 = new QB("P\\Q^ZSM\u0016]OJ[\u0011CDCDQPE=CEAKO\u00039KFC1|\u0013% \u001d\u000b(\f\b\u001a\u0006#\u0017\u0007\u0014\u0014\u001e\u0012\u000f|\u0011~\u000b\u000bw\u0002uy\u0007v\u0003\u000f\u0005nx");
                    int i6 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i6] = xuXd3.fK(((sXd4 + i6) + xuXd3.CK(iKK3)) - sXd5);
                        i6++;
                    }
                    this.ExtraDataTestTraversalAfterVal = new String(iArr3, 0, i6);
                    this.urlSpanCache = new URLSpanCache();
                    this.previousSemanticsNodes = IntObjectMapKt.mutableIntObjectMapOf();
                    this.previousSemanticsRoot = new SemanticsNodeCopy(androidComposeView.getSemanticsOwner().getUnmergedRootSemanticsNode(), IntObjectMapKt.intObjectMapOf());
                    androidComposeView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.1
                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewAttachedToWindow(View view) throws Throwable {
                            android.view.accessibility.AccessibilityManager accessibilityManager2 = AndroidComposeViewAccessibilityDelegateCompat.this.accessibilityManager;
                            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
                            AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener = androidComposeViewAccessibilityDelegateCompat.enabledStateListener;
                            short sXd6 = (short) (C1499aX.Xd() ^ (-13661));
                            int[] iArr4 = new int["KYP_]XT\u001fh\\Yl$X[\\_nof`hljv|2Fijm|}tnvzx\u0005\u000b_t\u0003v}|\u000b".length()];
                            QB qb4 = new QB("KYP_]XT\u001fh\\Yl$X[\\_nof`hljv|2Fijm|}tnvzx\u0005\u000b_t\u0003v}|\u000b");
                            int i7 = 0;
                            while (qb4.YK()) {
                                int iKK4 = qb4.KK();
                                Xu xuXd4 = Xu.Xd(iKK4);
                                iArr4[i7] = xuXd4.fK(xuXd4.CK(iKK4) - ((sXd6 + sXd6) + i7));
                                i7++;
                            }
                            Class<?> cls = Class.forName(new String(iArr4, 0, i7));
                            Class<?>[] clsArr = {Class.forName(Wg.Zd(".Ot0X\n2'-Gn.\u0014z*Y\u0019j\u001a=a\u001ePxAmM\u000e_\u0015B\u007f=6\\\u0013As.^o+e\u00049l%\u0006`Fs%^\u00149_\"Lv-ap=W*\u001f*~%e\u000e9[ W\u0004\"b\u0005?", (short) (FB.Xd() ^ 11416), (short) (FB.Xd() ^ 18508)))};
                            Object[] objArr4 = {accessibilityStateChangeListener};
                            short sXd7 = (short) (ZN.Xd() ^ 18732);
                            int[] iArr5 = new int["/34\u0012569HI@:BFDPV1SAUG&LFTNM5S^`R\\Tb".length()];
                            QB qb5 = new QB("/34\u0012569HI@:BFDPV1SAUG&LFTNM5S^`R\\Tb");
                            int i8 = 0;
                            while (qb5.YK()) {
                                int iKK5 = qb5.KK();
                                Xu xuXd5 = Xu.Xd(iKK5);
                                iArr5[i8] = xuXd5.fK(xuXd5.CK(iKK5) - (sXd7 + i8));
                                i8++;
                            }
                            Method method3 = cls.getMethod(new String(iArr5, 0, i8), clsArr);
                            try {
                                method3.setAccessible(true);
                                method3.invoke(accessibilityManager2, objArr4);
                                Object[] objArr5 = {androidComposeViewAccessibilityDelegateCompat.touchExplorationStateListener};
                                Method method4 = Class.forName(Wg.vd("o}t\u0004\u0002|xC|pm\u00018lop\u0004\u0013\u0014\u000b\u0005\r\u0011\u000f\u000b\u0011FZ}~\u0002\u0011aXRZ^\\hn3HVJQP^", (short) (C1607wl.Xd() ^ 24333))).getMethod(hg.Vd("dfeTns`d@ridfhVh\\a_CcOaQ.RJVNK1MVVFNDP", (short) (OY.Xd() ^ 1553), (short) (OY.Xd() ^ 13190)), Class.forName(Qg.kd("o{p}yrl5|niz0bcbcpod\\bd`jn\"4UTUbaVNTVR\\`3FRDIFR\u00032LQ>B\u001ePGBDF4F:?=!A-?/\f0(4,)\u000f+44$,\".", (short) (ZN.Xd() ^ 3180), (short) (ZN.Xd() ^ 352))));
                                try {
                                    method4.setAccessible(true);
                                    method4.invoke(accessibilityManager2, objArr5);
                                } catch (InvocationTargetException e2) {
                                    throw e2.getCause();
                                }
                            } catch (InvocationTargetException e3) {
                                throw e3.getCause();
                            }
                        }

                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewDetachedFromWindow(View view) throws Throwable {
                            AndroidComposeViewAccessibilityDelegateCompat.this.handler.removeCallbacks(AndroidComposeViewAccessibilityDelegateCompat.this.semanticsChangeChecker);
                            android.view.accessibility.AccessibilityManager accessibilityManager2 = AndroidComposeViewAccessibilityDelegateCompat.this.accessibilityManager;
                            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
                            Object[] objArr4 = {androidComposeViewAccessibilityDelegateCompat.enabledStateListener};
                            Method method3 = Class.forName(C1561oA.ud("nzo|xqk4{mhy/ababonc[ac_im!3TSTa`UMSUQ[_2EQCHEQ", (short) (C1607wl.Xd() ^ 32078))).getMethod(C1561oA.Yd("=1:=E5\u0012569HI@:BFDPV1SAUG&LFTNM5S^`R\\Tb", (short) (FB.Xd() ^ 17624)), Class.forName(C1561oA.yd("=IBOG@>\u0007ZLK\\\u000e@ED1>A6*062HL\u0004\u0016327D/$ &$ .2\u0011$4&'$4dl\u000e\u0011\u0012\u001b\u001a\u0013\u000b\u001d\u001f\u001f))\u0002&\u0012\u0011\u0001a\u0006y\u0006\u0002~p\r\u001a\u001a\u0006\u000e\b\u0014", (short) (ZN.Xd() ^ 11717))));
                            try {
                                method3.setAccessible(true);
                                method3.invoke(accessibilityManager2, objArr4);
                                Object[] objArr5 = {androidComposeViewAccessibilityDelegateCompat.touchExplorationStateListener};
                                Method method4 = Class.forName(Xg.qd("M[Ra_ZV!j^[n&Z]^apqhbjnlx~4Hklo~\u007fvpx|z\u0007\rav\u0005x\u007f~\r", (short) (FB.Xd() ^ 1907), (short) (FB.Xd() ^ 379))).getMethod(ZO.xd("TqnvX\u0019}/\u001dC%\u0006)4NH#m&V\f<\u0007D$r\u0002\u000e\u0011CIF45zXdEP|F", (short) (FB.Xd() ^ 29720), (short) (FB.Xd() ^ 11114)), Class.forName(Jg.Wd("MWisLCa+P>UdoA@\u001d\u0019KI\u001e\u001276\u0005-/AQ\u0011\u0014q{\u001c\rZ}|U_\u0002YHRbcAc\u0010\u001b4VJ-\u0006SG!;9\u0006\u0014$/\u000en,\u0016\u0004\tbg\\\u0006z]?{\u0003_ci=H", (short) (OY.Xd() ^ 23895), (short) (OY.Xd() ^ 7347))));
                                try {
                                    method4.setAccessible(true);
                                    method4.invoke(accessibilityManager2, objArr5);
                                } catch (InvocationTargetException e2) {
                                    throw e2.getCause();
                                }
                            } catch (InvocationTargetException e3) {
                                throw e3.getCause();
                            }
                        }
                    });
                    this.semanticsChangeChecker = new Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$$ExternalSyntheticLambda3
                        @Override // java.lang.Runnable
                        public final void run() {
                            AndroidComposeViewAccessibilityDelegateCompat.semanticsChangeChecker$lambda$49(this.f$0);
                        }
                    };
                    this.scrollObservationScopes = new ArrayList();
                    this.scheduleScrollEventIfNeededLambda = new Function1<ScrollObservationScope, Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeededLambda$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(ScrollObservationScope scrollObservationScope) {
                            invoke2(scrollObservationScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(ScrollObservationScope scrollObservationScope) {
                            this.this$0.scheduleScrollEventIfNeeded(scrollObservationScope);
                        }
                    };
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    public final int getHoveredVirtualViewId$ui_release() {
        return this.hoveredVirtualViewId;
    }

    public final void setHoveredVirtualViewId$ui_release(int i2) {
        this.hoveredVirtualViewId = i2;
    }

    public final Function1<AccessibilityEvent, Boolean> getOnSendAccessibilityEvent$ui_release() {
        return this.onSendAccessibilityEvent;
    }

    public final void setOnSendAccessibilityEvent$ui_release(Function1<? super AccessibilityEvent, Boolean> function1) {
        this.onSendAccessibilityEvent = function1;
    }

    public final boolean getAccessibilityForceEnabledForTesting$ui_release() {
        return this.accessibilityForceEnabledForTesting;
    }

    public final void setAccessibilityForceEnabledForTesting$ui_release(boolean z2) {
        this.accessibilityForceEnabledForTesting = z2;
        this.currentSemanticsNodesInvalidated = true;
    }

    public final long getSendRecurringAccessibilityEventsIntervalMillis$ui_release() {
        return this.SendRecurringAccessibilityEventsIntervalMillis;
    }

    public final void setSendRecurringAccessibilityEventsIntervalMillis$ui_release(long j2) {
        this.SendRecurringAccessibilityEventsIntervalMillis = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enabledStateListener$lambda$0(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z2) throws Throwable {
        List<AccessibilityServiceInfo> listEmptyList;
        if (z2) {
            android.view.accessibility.AccessibilityManager accessibilityManager = androidComposeViewAccessibilityDelegateCompat.accessibilityManager;
            Object[] objArr = {-1};
            Method method = Class.forName(Jg.Wd("y\bc\u0013\u0007&#QK$E:\u0007[Bg[\u0010\u0012m\u001c\u0004-+-Wm'9?fW\rd\u0004\u000f\u0004&\u0014?\b\u001dO$`DS", (short) (Od.Xd() ^ (-17261)), (short) (Od.Xd() ^ (-23857)))).getMethod(ZO.xd("x^MyQ0\u001f/8`\fLO\u001egxu\nf<HTEm\r\u000eZHyWZ\u000b&Q", (short) (C1580rY.Xd() ^ (-14038)), (short) (C1580rY.Xd() ^ (-11356))), Integer.TYPE);
            try {
                method.setAccessible(true);
                listEmptyList = (List) method.invoke(accessibilityManager, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        androidComposeViewAccessibilityDelegateCompat.enabledServices = listEmptyList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void touchExplorationStateListener$lambda$1(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z2) throws Throwable {
        android.view.accessibility.AccessibilityManager accessibilityManager = androidComposeViewAccessibilityDelegateCompat.accessibilityManager;
        short sXd = (short) (FB.Xd() ^ 9576);
        short sXd2 = (short) (FB.Xd() ^ 11536);
        int[] iArr = new int["z\t\u007f\u000f\r\b\u0004N\u0018\f\t\u001cS\b\u000b\f\u000f\u001e\u001f\u0016\u0010\u0018\u001c\u001a&,au\u0019\u001a\u001d,-$\u001e&*(4:\u000f$2&-,:".length()];
        QB qb = new QB("z\t\u007f\u000f\r\b\u0004N\u0018\f\t\u001cS\b\u000b\f\u000f\u001e\u001f\u0016\u0010\u0018\u001c\u001a&,au\u0019\u001a\u001d,-$\u001e&*(4:\u000f$2&-,:");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        Object[] objArr = {-1};
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.od("\u0018\u0015#r\u001b\r\r\u0016\u000e\fg\t\b\t\u0016\u0015\n\u0002\b\n\u0006\u0010\u0014l}\n\r~wx^z\u0004\u0004", (short) (ZN.Xd() ^ 32277)), Integer.TYPE);
        try {
            method.setAccessible(true);
            androidComposeViewAccessibilityDelegateCompat.enabledServices = (List) method.invoke(accessibilityManager, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final boolean isEnabled$ui_release() throws Throwable {
        if (!this.accessibilityForceEnabledForTesting) {
            android.view.accessibility.AccessibilityManager accessibilityManager = this.accessibilityManager;
            short sXd = (short) (Od.Xd() ^ (-9094));
            int[] iArr = new int["!-\"/+$\u001ef. \u001b,a\u0014\u0015\u0014\u0015\"!\u0016\u000e\u0014\u0016\u0012\u001c Se\u0007\u0006\u0007\u0014\u0013\b\u007f\u0006\b\u0004\u000e\u0012dw\u0004uzw\u0004".length()];
            QB qb = new QB("!-\"/+$\u001ef. \u001b,a\u0014\u0015\u0014\u0015\"!\u0016\u000e\u0014\u0016\u0012\u001c Se\u0007\u0006\u0007\u0014\u0013\b\u007f\u0006\b\u0004\u000e\u0012dw\u0004uzw\u0004");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd2 = (short) (Od.Xd() ^ (-8549));
            int[] iArr2 = new int["NY(RBDKEA".length()];
            QB qb2 = new QB("NY(RBDKEA");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 ^ i3));
                i3++;
            }
            Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
            try {
                method.setAccessible(true);
                if (!((Boolean) method.invoke(accessibilityManager, objArr)).booleanValue() || this.enabledServices.isEmpty()) {
                    return false;
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        return true;
    }

    private final boolean isTouchExplorationEnabled() throws Throwable {
        if (!this.accessibilityForceEnabledForTesting) {
            android.view.accessibility.AccessibilityManager accessibilityManager = this.accessibilityManager;
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1626yg.Ud("`\u0011jLG\u001cZ\u00195\nw\u0007\u0001A)=-\u0002\u0010f\u0019>|\u0005\u007fE\u0001.\u001bn\u00107ZMtI+\r\b;{\u001c-\u001do\u0015\"", (short) (C1580rY.Xd() ^ (-16779)), (short) (C1580rY.Xd() ^ (-27655)))).getMethod(Ig.wd("'\u0003$3d\u0019=k,", (short) (C1580rY.Xd() ^ (-15991))), new Class[0]);
            try {
                method.setAccessible(true);
                if (((Boolean) method.invoke(accessibilityManager, objArr)).booleanValue()) {
                    android.view.accessibility.AccessibilityManager accessibilityManager2 = this.accessibilityManager;
                    Object[] objArr2 = new Object[0];
                    Method method2 = Class.forName(EO.Od("B}cPN%2\u0016-bZLM\u0011lQ\u0010*d!X\nd_Y@U\u0019'wK<N`c/HgspFtL;*\u0012%", (short) (Od.Xd() ^ (-31755)))).getMethod(C1561oA.Qd("FO/IN;?\u001bMD?AC1C7<:\u00108**3+)", (short) (C1607wl.Xd() ^ 30727)), new Class[0]);
                    try {
                        method2.setAccessible(true);
                        if (((Boolean) method2.invoke(accessibilityManager2, objArr2)).booleanValue()) {
                        }
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                return false;
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        return true;
    }

    /* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r(4\u0012}\tnjG7LeN7XS@ş\u001c{b#\u001cW\u0002GIU2}P\n_Rui\u0007J\t\u000eS\u0013\u0014\u001a\u0011jZLe|k\u0017'2prO7[uU9\u000fwF\t.9:8(\rв\u001e*V\u0019G\nQM$\u0012^C¤>X\u0015˟\u001d\u001c\u0018\u0010L+Q-jlf6voҺ>5+Ʌ\u0002DT3m;M\\\u001bJl';yҐ\"1HʺM\u0017+`\u0011\u0012#jM\u0003Wqk\u0006ص+-3ɞ\fY<f\u000e#e:]\u0013urT_ԇUf\u0014ʬCQi[^\u0019x\u0007\t\u0003%<2\u0016Ν+N6Ʀ2h\u000e\u001fA\u0007ɪWS"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011b|-Aq\u0015\fWKFuB\u001e\u0006laKba*N\u00055KIR3`a\u0007\u001c\u0014\u0019Z\u0010J:\rbcI/jSu\n\b5H\u0006Djo\f)\u001d$wlSV\u001dUy\u0014UR)qU/", "", "<nS2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ$u3\u001ej", "/bc6b5", "", "5qP;h3:`\u001d\u000e\u000f", "4q^:<5=S,", "Bn8;W,Q", "BqPCX9LS\b\u0003\u0003^", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ%\u0017Ok\u0017Kz#C#k ?i\u001f=QAIT>\u001d\u0015>E\u001djG\u0011\u0012g", "5dc\u000eV;B]\"", "u(8", "5dc\u0013e6F7\"}zq", "5dc\u0014e(Gc z\bb;\u0011", "5dc\u001bb+>", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`%Gw\nE\u0006)3gG\u000e7u\u00127\\G9y\u001d(\u0014h7", "5dc!b\u0010GR\u0019\u0012", "5dc!e(OS&\rzM0\u0005\t", "u(9", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class PendingTextTraversedEvent {
        private final int action;
        private final int fromIndex;
        private final int granularity;
        private final SemanticsNode node;
        private final int toIndex;
        private final long traverseTime;

        public PendingTextTraversedEvent(SemanticsNode semanticsNode, int i2, int i3, int i4, int i5, long j2) {
            this.node = semanticsNode;
            this.action = i2;
            this.granularity = i3;
            this.fromIndex = i4;
            this.toIndex = i5;
            this.traverseTime = j2;
        }

        public final SemanticsNode getNode() {
            return this.node;
        }

        public final int getAction() {
            return this.action;
        }

        public final int getGranularity() {
            return this.granularity;
        }

        public final int getFromIndex() {
            return this.fromIndex;
        }

        public final int getToIndex() {
            return this.toIndex;
        }

        public final long getTraverseTime() {
            return this.traverseTime;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IntObjectMap<SemanticsNodeWithAdjustedBounds> getCurrentSemanticsNodes() {
        if (this.currentSemanticsNodesInvalidated) {
            this.currentSemanticsNodesInvalidated = false;
            this.currentSemanticsNodes = SemanticsUtils_androidKt.getAllUncoveredSemanticsNodesToIntObjectMap(this.view.getSemanticsOwner());
            if (isEnabled$ui_release()) {
                setTraversalValues();
            }
        }
        return this.currentSemanticsNodes;
    }

    public final MutableIntIntMap getIdToBeforeMap$ui_release() {
        return this.idToBeforeMap;
    }

    public final void setIdToBeforeMap$ui_release(MutableIntIntMap mutableIntIntMap) {
        this.idToBeforeMap = mutableIntIntMap;
    }

    public final MutableIntIntMap getIdToAfterMap$ui_release() {
        return this.idToAfterMap;
    }

    public final void setIdToAfterMap$ui_release(MutableIntIntMap mutableIntIntMap) {
        this.idToAfterMap = mutableIntIntMap;
    }

    public final String getExtraDataTestTraversalBeforeVal$ui_release() {
        return this.ExtraDataTestTraversalBeforeVal;
    }

    public final String getExtraDataTestTraversalAfterVal$ui_release() {
        return this.ExtraDataTestTraversalAfterVal;
    }

    /* JADX INFO: renamed from: canScroll-0AR0LA0$ui_release, reason: not valid java name */
    public final boolean m5847canScroll0AR0LA0$ui_release(boolean z2, int i2, long j2) throws Throwable {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(Qg.kd("DPERNGA\nJM\u0007$FEE9E", (short) (FB.Xd() ^ 18417), (short) (FB.Xd() ^ 32742))).getDeclaredMethod(hg.Vd("iftL_fjGihh\\h", (short) (OY.Xd() ^ 32475), (short) (OY.Xd() ^ 25706)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            if (Intrinsics.areEqual(((Looper) declaredMethod.invoke(null, objArr)).getThread(), Thread.currentThread())) {
                return m5846canScrollmoWRBKg(getCurrentSemanticsNodes(), z2, i2, j2);
            }
            return false;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX INFO: renamed from: canScroll-moWRBKg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean m5846canScrollmoWRBKg(androidx.collection.IntObjectMap<androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds> r19, boolean r20, int r21, long r22) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.m5846canScrollmoWRBKg(androidx.collection.IntObjectMap, boolean, int, long):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final AccessibilityNodeInfoCompat createNodeInfo(int i2) throws Throwable {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        AndroidComposeView.ViewTreeOwners viewTreeOwners = this.view.getViewTreeOwners();
        if (((viewTreeOwners == null || (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) ? null : lifecycle.getCurrentState()) == Lifecycle.State.DESTROYED) {
            return null;
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatObtain = AccessibilityNodeInfoCompat.obtain();
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(i2);
        if (semanticsNodeWithAdjustedBounds == null) {
            return null;
        }
        SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode();
        if (i2 == -1) {
            ViewParent parentForAccessibility = this.view.getParentForAccessibility();
            accessibilityNodeInfoCompatObtain.setParent(parentForAccessibility instanceof View ? (View) parentForAccessibility : null);
        } else {
            SemanticsNode parent = semanticsNode.getParent();
            Integer numValueOf = parent != null ? Integer.valueOf(parent.getId()) : null;
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                accessibilityNodeInfoCompatObtain.setParent(this.view, iIntValue != this.view.getSemanticsOwner().getUnmergedRootSemanticsNode().getId() ? iIntValue : -1);
            } else {
                InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("semanticsNode " + i2 + " has null parent");
                throw new KotlinNothingValueException();
            }
        }
        accessibilityNodeInfoCompatObtain.setSource(this.view, i2);
        accessibilityNodeInfoCompatObtain.setBoundsInScreen(boundsInScreen(semanticsNodeWithAdjustedBounds));
        populateAccessibilityNodeInfoProperties(i2, accessibilityNodeInfoCompatObtain, semanticsNode);
        return accessibilityNodeInfoCompatObtain;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect boundsInScreen(SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds) {
        Rect adjustedBounds = semanticsNodeWithAdjustedBounds.getAdjustedBounds();
        long jMo5467localToScreenMKHz9U = this.view.mo5467localToScreenMKHz9U(OffsetKt.Offset(adjustedBounds.left, adjustedBounds.top));
        long jMo5467localToScreenMKHz9U2 = this.view.mo5467localToScreenMKHz9U(OffsetKt.Offset(adjustedBounds.right, adjustedBounds.bottom));
        return new Rect((int) Math.floor(Offset.m3937getXimpl(jMo5467localToScreenMKHz9U)), (int) Math.floor(Offset.m3938getYimpl(jMo5467localToScreenMKHz9U)), (int) Math.ceil(Offset.m3937getXimpl(jMo5467localToScreenMKHz9U2)), (int) Math.ceil(Offset.m3938getYimpl(jMo5467localToScreenMKHz9U2)));
    }

    /* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6B\rA4\u0012\u000e\u0007njO0LeN.ZS8\u0015s{:%aӘqYП\u0006N\u000e6\u0019a^iwnx[\u001bK\u001f\f&zz,wX'_@\u000f`AXWCa\u007fOIb\u000563!B*H\u007f\u0015\u0003**v\u0013%|qKj\u0016pEv:ň\u0011M\u0013\u001fZ@L&\u0019\u001e\u000bn~LVtuL?%\u0013ipO7g@\u0003]\u000fVTU\u0010%cL+pMC\u001e=e\u0013\tb[m\u0004OyM\u000bx)7+wv\u00068\u0007\u007fZ)۩S\u0017"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011b|-Aq\u0015\fWKFuB\u001e\u0006laKba*N\u00055KIR3`a\u0007\u001c\u0014\u0019Z\u0010J:\rbcI/jSu\u000e\u00127&\fJw\u000b\u0014r\u0018EsoP4\u001aO\u0005\u0011\u0003=8rS/", "\u001aiPCTuNb\u001d\u0006D<6\u0005\u0014+r{7\u0006MV", "\u001aj^A_0G\u001d\u0004z~k\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ$u3\u001ej", "\u001aj^A_0G\u001dv\t\u0003i(\n\u0005>o\r}", "u(E", "1n\\=T9>", "", RemoteSettings.FORWARD_SLASH_STRING, AdkSettings.PLATFORM_TYPE_MOBILE, "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class TopBottomBoundsComparator implements Comparator<Pair<? extends androidx.compose.ui.geometry.Rect, ? extends List<SemanticsNode>>> {
        public static final TopBottomBoundsComparator INSTANCE = new TopBottomBoundsComparator();

        private TopBottomBoundsComparator() {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Pair<? extends androidx.compose.ui.geometry.Rect, ? extends List<SemanticsNode>> pair, Pair<? extends androidx.compose.ui.geometry.Rect, ? extends List<SemanticsNode>> pair2) {
            return compare2((Pair<androidx.compose.ui.geometry.Rect, ? extends List<SemanticsNode>>) pair, (Pair<androidx.compose.ui.geometry.Rect, ? extends List<SemanticsNode>>) pair2);
        }

        /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(Pair<androidx.compose.ui.geometry.Rect, ? extends List<SemanticsNode>> pair, Pair<androidx.compose.ui.geometry.Rect, ? extends List<SemanticsNode>> pair2) {
            int iCompare = Float.compare(pair.getFirst().getTop(), pair2.getFirst().getTop());
            return iCompare != 0 ? iCompare : Float.compare(pair.getFirst().getBottom(), pair2.getFirst().getBottom());
        }
    }

    /* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6B\u0005\"4\u0012\u0006\rnj?1JΟHDɟ\u0004:\u001fm\f4R[Rp,Ae\u001c\u000e\"7O-h(sPZŲG\u000f\u0014\u0018A\u0001:Lmx\f\u0016?6PtW3{om=nzN\u0005N2hLѯ\t\b"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011b|-Aq\u0015\fWKFuB\u001e\u0006laKba*N\u00055KIR3`a\u0007\u001c\u0014\u0019Z\u0010J:\rbcI/jSu\u0006\u00179&\fKq\u007f\u001as\u0018=ulOR\u001fQ\u0007j", "\u001aiPCTuNb\u001d\u0006D<6\u0005\u0014+r{7\u0006MV", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ$u3\u001ej", "\u001aj^A_0G\u001dv\t\u0003i(\n\u0005>o\r}", "u(E", "1n\\=T9>", "", RemoteSettings.FORWARD_SLASH_STRING, AdkSettings.PLATFORM_TYPE_MOBILE, "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class LtrBoundsComparator implements Comparator<SemanticsNode> {
        public static final LtrBoundsComparator INSTANCE = new LtrBoundsComparator();

        private LtrBoundsComparator() {
        }

        @Override // java.util.Comparator
        public int compare(SemanticsNode semanticsNode, SemanticsNode semanticsNode2) {
            androidx.compose.ui.geometry.Rect boundsInWindow = semanticsNode.getBoundsInWindow();
            androidx.compose.ui.geometry.Rect boundsInWindow2 = semanticsNode2.getBoundsInWindow();
            int iCompare = Float.compare(boundsInWindow.getLeft(), boundsInWindow2.getLeft());
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompare2 = Float.compare(boundsInWindow.getTop(), boundsInWindow2.getTop());
            if (iCompare2 != 0) {
                return iCompare2;
            }
            int iCompare3 = Float.compare(boundsInWindow.getBottom(), boundsInWindow2.getBottom());
            return iCompare3 != 0 ? iCompare3 : Float.compare(boundsInWindow.getRight(), boundsInWindow2.getRight());
        }
    }

    /* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6B\u0005\"4\u0012\u0006\rnj?1JΟHDɟ\u0004:\u001fm\f4R[Rp,Ae\u001c\u000e\"7O-h(sPZŲG\u000f\u0014\u0018A\u0001:Lmx\f\u0016?6PtW3{om=nzN\u0005N2hLѯ\t\b"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011b|-Aq\u0015\fWKFuB\u001e\u0006laKba*N\u00055KIR3`a\u0007\u001c\u0014\u0019Z\u0010J:\rbcI/jSu\f\u00173&\fKq\u007f\u001as\u0018=ulOR\u001fQ\u0007j", "\u001aiPCTuNb\u001d\u0006D<6\u0005\u0014+r{7\u0006MV", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ$u3\u001ej", "\u001aj^A_0G\u001dv\t\u0003i(\n\u0005>o\r}", "u(E", "1n\\=T9>", "", RemoteSettings.FORWARD_SLASH_STRING, AdkSettings.PLATFORM_TYPE_MOBILE, "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class RtlBoundsComparator implements Comparator<SemanticsNode> {
        public static final RtlBoundsComparator INSTANCE = new RtlBoundsComparator();

        private RtlBoundsComparator() {
        }

        @Override // java.util.Comparator
        public int compare(SemanticsNode semanticsNode, SemanticsNode semanticsNode2) {
            androidx.compose.ui.geometry.Rect boundsInWindow = semanticsNode.getBoundsInWindow();
            androidx.compose.ui.geometry.Rect boundsInWindow2 = semanticsNode2.getBoundsInWindow();
            int iCompare = Float.compare(boundsInWindow2.getRight(), boundsInWindow.getRight());
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompare2 = Float.compare(boundsInWindow.getTop(), boundsInWindow2.getTop());
            if (iCompare2 != 0) {
                return iCompare2;
            }
            int iCompare3 = Float.compare(boundsInWindow.getBottom(), boundsInWindow2.getBottom());
            return iCompare3 != 0 ? iCompare3 : Float.compare(boundsInWindow2.getLeft(), boundsInWindow.getLeft());
        }
    }

    private final Comparator<SemanticsNode> semanticComparator(boolean z2) {
        return new AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$$inlined$thenBy$2(new AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$$inlined$thenBy$1(z2 ? RtlBoundsComparator.INSTANCE : LtrBoundsComparator.INSTANCE, LayoutNode.Companion.getZComparator$ui_release()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ List sortByGeometryGroupings$default(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z2, ArrayList arrayList, MutableIntObjectMap mutableIntObjectMap, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            mutableIntObjectMap = IntObjectMapKt.mutableIntObjectMapOf();
        }
        return androidComposeViewAccessibilityDelegateCompat.sortByGeometryGroupings(z2, arrayList, mutableIntObjectMap);
    }

    private final List<SemanticsNode> sortByGeometryGroupings(boolean z2, ArrayList<SemanticsNode> arrayList, MutableIntObjectMap<List<SemanticsNode>> mutableIntObjectMap) {
        ArrayList arrayList2 = new ArrayList();
        int lastIndex = CollectionsKt.getLastIndex(arrayList);
        int size = 0;
        if (lastIndex >= 0) {
            int i2 = 0;
            while (true) {
                SemanticsNode semanticsNode = arrayList.get(i2);
                if (i2 == 0 || !sortByGeometryGroupings$placedEntryRowOverlaps(arrayList2, semanticsNode)) {
                    arrayList2.add(new Pair(semanticsNode.getBoundsInWindow(), CollectionsKt.mutableListOf(semanticsNode)));
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2++;
            }
        }
        ArrayList arrayList3 = arrayList2;
        CollectionsKt.sortWith(arrayList3, TopBottomBoundsComparator.INSTANCE);
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList3.size();
        for (int i3 = 0; i3 < size2; i3++) {
            Pair pair = (Pair) arrayList3.get(i3);
            CollectionsKt.sortWith((List) pair.getSecond(), new AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$$inlined$thenBy$2(new AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$$inlined$thenBy$1(z2 ? RtlBoundsComparator.INSTANCE : LtrBoundsComparator.INSTANCE, LayoutNode.Companion.getZComparator$ui_release())));
            arrayList4.addAll((Collection) pair.getSecond());
        }
        ArrayList arrayList5 = arrayList4;
        final AnonymousClass2 anonymousClass2 = new Function2<SemanticsNode, SemanticsNode, Integer>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sortByGeometryGroupings.2
            @Override // kotlin.jvm.functions.Function2
            public final Integer invoke(SemanticsNode semanticsNode2, SemanticsNode semanticsNode3) {
                return Integer.valueOf(Float.compare(((Number) semanticsNode2.getUnmergedConfig$ui_release().getOrElse(SemanticsProperties.INSTANCE.getTraversalIndex(), new Function0<Float>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sortByGeometryGroupings.2.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Float invoke() {
                        return Float.valueOf(0.0f);
                    }
                })).floatValue(), ((Number) semanticsNode3.getUnmergedConfig$ui_release().getOrElse(SemanticsProperties.INSTANCE.getTraversalIndex(), new Function0<Float>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sortByGeometryGroupings.2.2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Float invoke() {
                        return Float.valueOf(0.0f);
                    }
                })).floatValue()));
            }
        };
        CollectionsKt.sortWith(arrayList5, new Comparator() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AndroidComposeViewAccessibilityDelegateCompat.sortByGeometryGroupings$lambda$7(anonymousClass2, obj, obj2);
            }
        });
        while (size <= CollectionsKt.getLastIndex(arrayList5)) {
            List<SemanticsNode> list = mutableIntObjectMap.get(((SemanticsNode) arrayList4.get(size)).getId());
            if (list != null) {
                if (!isScreenReaderFocusable((SemanticsNode) arrayList4.get(size))) {
                    arrayList4.remove(size);
                } else {
                    size++;
                }
                arrayList4.addAll(size, list);
                size += list.size();
            } else {
                size++;
            }
        }
        return arrayList5;
    }

    private static final boolean sortByGeometryGroupings$placedEntryRowOverlaps(ArrayList<Pair<androidx.compose.ui.geometry.Rect, List<SemanticsNode>>> arrayList, SemanticsNode semanticsNode) {
        float top = semanticsNode.getBoundsInWindow().getTop();
        float bottom = semanticsNode.getBoundsInWindow().getBottom();
        boolean z2 = top >= bottom;
        int lastIndex = CollectionsKt.getLastIndex(arrayList);
        if (lastIndex >= 0) {
            int i2 = 0;
            while (true) {
                androidx.compose.ui.geometry.Rect first = arrayList.get(i2).getFirst();
                boolean z3 = first.getTop() >= first.getBottom();
                if (!z2 && !z3 && Math.max(top, first.getTop()) < Math.min(bottom, first.getBottom())) {
                    arrayList.set(i2, new Pair<>(first.intersect(0.0f, top, Float.POSITIVE_INFINITY, bottom), arrayList.get(i2).getSecond()));
                    arrayList.get(i2).getSecond().add(semanticsNode);
                    return true;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sortByGeometryGroupings$lambda$7(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    private final void geometryDepthFirstSearch(SemanticsNode semanticsNode, ArrayList<SemanticsNode> arrayList, MutableIntObjectMap<List<SemanticsNode>> mutableIntObjectMap) {
        boolean zIsRtl = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isRtl(semanticsNode);
        boolean zBooleanValue = ((Boolean) semanticsNode.getUnmergedConfig$ui_release().getOrElse(SemanticsProperties.INSTANCE.getIsTraversalGroup(), new Function0<Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$geometryDepthFirstSearch$isTraversalGroup$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return false;
            }
        })).booleanValue();
        if ((zBooleanValue || isScreenReaderFocusable(semanticsNode)) && getCurrentSemanticsNodes().containsKey(semanticsNode.getId())) {
            arrayList.add(semanticsNode);
        }
        if (zBooleanValue) {
            mutableIntObjectMap.set(semanticsNode.getId(), subtreeSortedByGeometryGrouping(zIsRtl, CollectionsKt.toMutableList((Collection) semanticsNode.getChildren())));
            return;
        }
        List<SemanticsNode> children = semanticsNode.getChildren();
        int size = children.size();
        for (int i2 = 0; i2 < size; i2++) {
            geometryDepthFirstSearch(children.get(i2), arrayList, mutableIntObjectMap);
        }
    }

    private final List<SemanticsNode> subtreeSortedByGeometryGrouping(boolean z2, List<SemanticsNode> list) {
        MutableIntObjectMap<List<SemanticsNode>> mutableIntObjectMapMutableIntObjectMapOf = IntObjectMapKt.mutableIntObjectMapOf();
        ArrayList<SemanticsNode> arrayList = new ArrayList<>();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            geometryDepthFirstSearch(list.get(i2), arrayList, mutableIntObjectMapMutableIntObjectMapOf);
        }
        return sortByGeometryGroupings(z2, arrayList, mutableIntObjectMapMutableIntObjectMapOf);
    }

    private final void setTraversalValues() {
        this.idToBeforeMap.clear();
        this.idToAfterMap.clear();
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(-1);
        SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
        Intrinsics.checkNotNull(semanticsNode);
        int i2 = 1;
        List<SemanticsNode> listSubtreeSortedByGeometryGrouping = subtreeSortedByGeometryGrouping(AndroidComposeViewAccessibilityDelegateCompat_androidKt.isRtl(semanticsNode), CollectionsKt.mutableListOf(semanticsNode));
        int lastIndex = CollectionsKt.getLastIndex(listSubtreeSortedByGeometryGrouping);
        if (1 > lastIndex) {
            return;
        }
        while (true) {
            int id = listSubtreeSortedByGeometryGrouping.get(i2 - 1).getId();
            int id2 = listSubtreeSortedByGeometryGrouping.get(i2).getId();
            this.idToBeforeMap.set(id, id2);
            this.idToAfterMap.set(id2, id);
            if (i2 == lastIndex) {
                return;
            } else {
                i2++;
            }
        }
    }

    private final boolean isScreenReaderFocusable(SemanticsNode semanticsNode) {
        List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getContentDescription());
        boolean z2 = ((list != null ? (String) CollectionsKt.firstOrNull(list) : null) == null && getInfoText(semanticsNode) == null && getInfoStateDescriptionOrNull(semanticsNode) == null && !getInfoIsCheckable(semanticsNode)) ? false : true;
        if (SemanticsUtils_androidKt.isVisible(semanticsNode)) {
            return semanticsNode.getUnmergedConfig$ui_release().isMergingSemanticsOfDescendants() || (semanticsNode.isUnmergedLeafNode$ui_release() && z2);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x042a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void populateAccessibilityNodeInfoProperties(int r18, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r19, androidx.compose.ui.semantics.SemanticsNode r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2902
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.populateAccessibilityNodeInfoProperties(int, androidx.core.view.accessibility.AccessibilityNodeInfoCompat, androidx.compose.ui.semantics.SemanticsNode):void");
    }

    private static final boolean populateAccessibilityNodeInfoProperties$canScrollForward(ScrollAxisRange scrollAxisRange) {
        return (scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue() && !scrollAxisRange.getReverseScrolling()) || (scrollAxisRange.getValue().invoke().floatValue() > 0.0f && scrollAxisRange.getReverseScrolling());
    }

    private static final boolean populateAccessibilityNodeInfoProperties$canScrollBackward(ScrollAxisRange scrollAxisRange) {
        return (scrollAxisRange.getValue().invoke().floatValue() > 0.0f && !scrollAxisRange.getReverseScrolling()) || (scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue() && scrollAxisRange.getReverseScrolling());
    }

    private final void setContentInvalid(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getError())) {
            accessibilityNodeInfoCompat.setContentInvalid(true);
            accessibilityNodeInfoCompat.setError((CharSequence) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getError()));
        }
    }

    private final String getInfoStateDescriptionOrNull(SemanticsNode semanticsNode) throws Throwable {
        Object orNull = SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getStateDescription());
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getToggleableState());
        Role role = (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getRole());
        if (toggleableState != null) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i2 == 1) {
                if ((role == null ? false : Role.m5929equalsimpl0(role.m5932unboximpl(), Role.Companion.m5938getSwitcho7Vup1c())) && orNull == null) {
                    Context context = this.view.getContext();
                    Class<?> cls = Class.forName(C1593ug.zd("\u000b\u0019\u0010\u001f\u001d\u0018\u0014^\u0015\"\")\u001b%,f|**1#74", (short) (FB.Xd() ^ 4754), (short) (FB.Xd() ^ 17153)));
                    Class<?>[] clsArr = new Class[0];
                    Object[] objArr = new Object[0];
                    short sXd = (short) (OY.Xd() ^ 25184);
                    int[] iArr = new int["*'5\u0012$1,1-\u001d\u001e+".length()];
                    QB qb = new QB("*'5\u0012$1,1-\u001d\u001e+");
                    int i3 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i3] = xuXd.fK(sXd + sXd + i3 + xuXd.CK(iKK));
                        i3++;
                    }
                    Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
                    try {
                        method.setAccessible(true);
                        orNull = ((Resources) method.invoke(context, objArr)).getString(R.string.state_on);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
            } else if (i2 == 2) {
                if ((role == null ? false : Role.m5929equalsimpl0(role.m5932unboximpl(), Role.Companion.m5938getSwitcho7Vup1c())) && orNull == null) {
                    Context context2 = this.view.getContext();
                    Class<?> cls2 = Class.forName(EO.Od("D\u0018aVLrw\u001c\u001cJIk+0,\u0006o\u0014]Y\u0005v~", (short) (Od.Xd() ^ (-31496))));
                    Class<?>[] clsArr2 = new Class[0];
                    Object[] objArr2 = new Object[0];
                    short sXd2 = (short) (Od.Xd() ^ (-27114));
                    int[] iArr2 = new int["\u0011\u000e\u001cx\u000b\u0018\u0013\u0018\u0014\u0004\u0005\u0012".length()];
                    QB qb2 = new QB("\u0011\u000e\u001cx\u000b\u0018\u0013\u0018\u0014\u0004\u0005\u0012");
                    int i4 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i4] = xuXd2.fK(sXd2 + sXd2 + sXd2 + i4 + xuXd2.CK(iKK2));
                        i4++;
                    }
                    Method method2 = cls2.getMethod(new String(iArr2, 0, i4), clsArr2);
                    try {
                        method2.setAccessible(true);
                        orNull = ((Resources) method2.invoke(context2, objArr2)).getString(R.string.state_off);
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                }
            } else if (i2 == 3 && orNull == null) {
                Context context3 = this.view.getContext();
                short sXd3 = (short) (Od.Xd() ^ (-32005));
                short sXd4 = (short) (Od.Xd() ^ (-1522));
                int[] iArr3 = new int["*VY\u0011BI)\u0017>QUFLB0L\u00172QhT_B".length()];
                QB qb3 = new QB("*VY\u0011BI)\u0017>QUFLB0L\u00172QhT_B");
                int i5 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i5] = xuXd3.fK((C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + (i5 * sXd4))) + xuXd3.CK(iKK3));
                    i5++;
                }
                Object[] objArr3 = new Object[0];
                Method method3 = Class.forName(new String(iArr3, 0, i5)).getMethod(Ig.wd("\u00044uo\u000b;W\u00067\r\r|", (short) (FB.Xd() ^ 28584)), new Class[0]);
                try {
                    method3.setAccessible(true);
                    orNull = ((Resources) method3.invoke(context3, objArr3)).getString(R.string.indeterminate);
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            }
        }
        Boolean bool = (Boolean) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getSelected());
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if (!(role == null ? false : Role.m5929equalsimpl0(role.m5932unboximpl(), Role.Companion.m5939getTabo7Vup1c())) && orNull == null) {
                if (zBooleanValue) {
                    Context context4 = this.view.getContext();
                    Object[] objArr4 = new Object[0];
                    Method method4 = Class.forName(C1561oA.Kd("&4+:83/y0==D6@G\u0002\u0018EEL>RO", (short) (C1633zX.Xd() ^ (-8484)))).getMethod(Wg.Zd("\u0017C[F\u0004\u001f&\u0016`ZJ\"", (short) (C1607wl.Xd() ^ 2885), (short) (C1607wl.Xd() ^ 1613)), new Class[0]);
                    try {
                        method4.setAccessible(true);
                        orNull = ((Resources) method4.invoke(context4, objArr4)).getString(R.string.selected);
                    } catch (InvocationTargetException e5) {
                        throw e5.getCause();
                    }
                } else {
                    Context context5 = this.view.getContext();
                    short sXd5 = (short) (C1499aX.Xd() ^ (-23506));
                    int[] iArr4 = new int["\u001e,#20+'q(55<.8?y\u0010==D6JG".length()];
                    QB qb4 = new QB("\u001e,#20+'q(55<.8?y\u0010==D6JG");
                    int i6 = 0;
                    while (qb4.YK()) {
                        int iKK4 = qb4.KK();
                        Xu xuXd4 = Xu.Xd(iKK4);
                        iArr4[i6] = xuXd4.fK(xuXd4.CK(iKK4) - (sXd5 + i6));
                        i6++;
                    }
                    Object[] objArr5 = new Object[0];
                    Method method5 = Class.forName(new String(iArr4, 0, i6)).getMethod(Wg.vd("+*:\u0019%418. #2", (short) (Od.Xd() ^ (-30506))), new Class[0]);
                    try {
                        method5.setAccessible(true);
                        orNull = ((Resources) method5.invoke(context5, objArr5)).getString(R.string.not_selected);
                    } catch (InvocationTargetException e6) {
                        throw e6.getCause();
                    }
                }
            }
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getProgressBarRangeInfo());
        if (progressBarRangeInfo != null) {
            if (progressBarRangeInfo != ProgressBarRangeInfo.Companion.getIndeterminate()) {
                if (orNull == null) {
                    ClosedFloatingPointRange<Float> range = progressBarRangeInfo.getRange();
                    float current = ((range.getEndInclusive().floatValue() - range.getStart().floatValue()) > 0.0f ? 1 : ((range.getEndInclusive().floatValue() - range.getStart().floatValue()) == 0.0f ? 0 : -1)) == 0 ? 0.0f : (progressBarRangeInfo.getCurrent() - range.getStart().floatValue()) / (range.getEndInclusive().floatValue() - range.getStart().floatValue());
                    if (current < 0.0f) {
                        current = 0.0f;
                    }
                    if (current > 1.0f) {
                        current = 1.0f;
                    }
                    if (!(current == 0.0f)) {
                        iCoerceIn = (current == 1.0f ? 1 : 0) != 0 ? 100 : RangesKt.coerceIn(Math.round(current * 100), 1, 99);
                    }
                    Context context6 = this.view.getContext();
                    Object[] objArr6 = new Object[0];
                    Method method6 = Class.forName(Qg.kd("=I>KG@:\u00037B@E5=Bz\u000f:8=-?:", (short) (C1607wl.Xd() ^ 25295), (short) (C1607wl.Xd() ^ 619))).getMethod(hg.Vd("96D!3@;@<,-:", (short) (C1499aX.Xd() ^ (-12221)), (short) (C1499aX.Xd() ^ (-15915))), new Class[0]);
                    try {
                        method6.setAccessible(true);
                        orNull = ((Resources) method6.invoke(context6, objArr6)).getString(R.string.template_percent, Integer.valueOf(iCoerceIn));
                    } catch (InvocationTargetException e7) {
                        throw e7.getCause();
                    }
                }
            } else if (orNull == null) {
                Context context7 = this.view.getContext();
                Object[] objArr7 = new Object[0];
                Method method7 = Class.forName(C1561oA.ud("\n\u0016\u000b\u0018\u0014\r\u0007O\u0004\u000f\r\u0012\u0002\n\u000fG[\u0007\u0005\ny\f\u0007", (short) (C1633zX.Xd() ^ (-20571)))).getMethod(C1561oA.yd("b_mJdqlqeUVc", (short) (C1580rY.Xd() ^ (-13238))), new Class[0]);
                try {
                    method7.setAccessible(true);
                    orNull = ((Resources) method7.invoke(context7, objArr7)).getString(R.string.in_progress);
                } catch (InvocationTargetException e8) {
                    throw e8.getCause();
                }
            }
        }
        if (semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getEditableText())) {
            orNull = createStateDescriptionForTextField(semanticsNode);
        }
        return (String) orNull;
    }

    private final String createStateDescriptionForTextField(SemanticsNode semanticsNode) throws Throwable {
        Collection collection;
        CharSequence charSequence;
        SemanticsConfiguration config = semanticsNode.copyWithMergingEnabled$ui_release().getConfig();
        Collection collection2 = (Collection) SemanticsConfigurationKt.getOrNull(config, SemanticsProperties.INSTANCE.getContentDescription());
        if ((collection2 != null && !collection2.isEmpty()) || (((collection = (Collection) SemanticsConfigurationKt.getOrNull(config, SemanticsProperties.INSTANCE.getText())) != null && !collection.isEmpty()) || ((charSequence = (CharSequence) SemanticsConfigurationKt.getOrNull(config, SemanticsProperties.INSTANCE.getEditableText())) != null && charSequence.length() != 0))) {
            return null;
        }
        Context context = this.view.getContext();
        Class<?> cls = Class.forName(C1561oA.Yd("\t\u0017\u000e\u001d\u001b\u0016\u0012\\\u0013  '\u0019#*dz((/!52", (short) (C1499aX.Xd() ^ (-24815))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (Od.Xd() ^ (-14329));
        short sXd2 = (short) (Od.Xd() ^ (-23142));
        int[] iArr = new int["@?O.BQNUSEHW".length()];
        QB qb = new QB("@?O.BQNUSEHW");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            return ((Resources) method.invoke(context, objArr)).getString(R.string.state_empty);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private final void setStateDescription(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        accessibilityNodeInfoCompat.setStateDescription(getInfoStateDescriptionOrNull(semanticsNode));
    }

    private final boolean getInfoIsCheckable(SemanticsNode semanticsNode) {
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getToggleableState());
        Role role = (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getRole());
        boolean z2 = toggleableState != null;
        Boolean bool = (Boolean) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getSelected());
        if (bool == null) {
            return z2;
        }
        bool.booleanValue();
        return role != null ? Role.m5929equalsimpl0(role.m5932unboximpl(), Role.Companion.m5939getTabo7Vup1c()) : false ? z2 : true;
    }

    private final void setIsCheckable(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        accessibilityNodeInfoCompat.setCheckable(getInfoIsCheckable(semanticsNode));
    }

    private final AnnotatedString getInfoText(SemanticsNode semanticsNode) {
        AnnotatedString textForTextField = getTextForTextField(semanticsNode.getUnmergedConfig$ui_release());
        List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getText());
        return textForTextField == null ? list != null ? (AnnotatedString) CollectionsKt.firstOrNull(list) : null : textForTextField;
    }

    private final SpannableString toSpannableString(AnnotatedString annotatedString) {
        return (SpannableString) trimToSize(AndroidAccessibilitySpannableString_androidKt.toAccessibilitySpannableString(annotatedString, this.view.getDensity(), this.view.getFontFamilyResolver(), this.urlSpanCache), 100000);
    }

    private final void setText(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        AnnotatedString infoText = getInfoText(semanticsNode);
        accessibilityNodeInfoCompat.setText(infoText != null ? toSpannableString(infoText) : null);
    }

    private final boolean isAccessibilityFocused(int i2) {
        return this.focusedVirtualViewId == i2;
    }

    private final boolean requestAccessibilityFocus(int i2) {
        if (!isTouchExplorationEnabled() || isAccessibilityFocused(i2)) {
            return false;
        }
        int i3 = this.focusedVirtualViewId;
        if (i3 != Integer.MIN_VALUE) {
            sendEventForVirtualView$default(this, i3, 65536, null, null, 12, null);
        }
        this.focusedVirtualViewId = i2;
        this.view.invalidate();
        sendEventForVirtualView$default(this, i2, 32768, null, null, 12, null);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ boolean sendEventForVirtualView$default(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i2, int i3, Integer num, List list, int i4, Object obj) {
        if ((4 & i4) != 0) {
            num = null;
        }
        if ((i4 & 8) != 0) {
            list = null;
        }
        return androidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView(i2, i3, num, list);
    }

    private final boolean sendEventForVirtualView(int i2, int i3, Integer num, List<String> list) throws Throwable {
        if (i2 != Integer.MIN_VALUE && isEnabled$ui_release()) {
            AccessibilityEvent accessibilityEventCreateEvent = createEvent(i2, i3);
            if (num != null) {
                accessibilityEventCreateEvent.setContentChangeTypes(num.intValue());
            }
            if (list != null) {
                accessibilityEventCreateEvent.setContentDescription(ListUtilsKt.fastJoinToString$default(list, ",", null, null, 0, null, null, 62, null));
            }
            Trace.beginSection("sendEvent");
            try {
                return sendEvent(accessibilityEventCreateEvent);
            } finally {
                Trace.endSection();
            }
        }
        return false;
    }

    private final boolean sendEvent(AccessibilityEvent accessibilityEvent) {
        if (!isEnabled$ui_release()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.sendingFocusAffectingEvent = true;
        }
        try {
            return this.onSendAccessibilityEvent.invoke(accessibilityEvent).booleanValue();
        } finally {
            this.sendingFocusAffectingEvent = false;
        }
    }

    private final AccessibilityEvent createEvent(int i2, int i3) throws Throwable {
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i3);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName(hg.Vd("x\u0005y\u0007\u0003{u>\u0006wr\u00049`rm~", (short) (Od.Xd() ^ (-490)), (short) (Od.Xd() ^ (-30723))));
        Context context = this.view.getContext();
        Class<?> cls = Class.forName(C1561oA.ud("\u000e\u001a\u000f\u001c\u0018\u0011\u000bS\b\u0013\u0011\u0016\u0006\u000e\u0013K_\u000b\t\u000e}\u0010\u000b", (short) (OY.Xd() ^ 25491)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1499aX.Xd() ^ (-25706));
        int[] iArr = new int["hgsPfine`_EYjc".length()];
        QB qb = new QB("hgsPfine`_EYjc");
        int i4 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i4] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i4));
            i4++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i4), clsArr);
        try {
            method.setAccessible(true);
            accessibilityEventObtain.setPackageName((String) method.invoke(context, objArr));
            accessibilityEventObtain.setSource(this.view, i2);
            if (isEnabled$ui_release() && (semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(i2)) != null) {
                accessibilityEventObtain.setPassword(semanticsNodeWithAdjustedBounds.getSemanticsNode().getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getPassword()));
            }
            return accessibilityEventObtain;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private final AccessibilityEvent createTextSelectionChangedEvent(int i2, Integer num, Integer num2, Integer num3, CharSequence charSequence) throws Throwable {
        AccessibilityEvent accessibilityEventCreateEvent = createEvent(i2, 8192);
        if (num != null) {
            accessibilityEventCreateEvent.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventCreateEvent.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventCreateEvent.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventCreateEvent.getText().add(charSequence);
        }
        return accessibilityEventCreateEvent;
    }

    private final boolean clearAccessibilityFocus(int i2) {
        if (!isAccessibilityFocused(i2)) {
            return false;
        }
        this.focusedVirtualViewId = Integer.MIN_VALUE;
        this.currentlyFocusedANI = null;
        this.view.invalidate();
        sendEventForVirtualView$default(this, i2, 65536, null, null, 12, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v147 */
    /* JADX WARN: Type inference failed for: r0v148 */
    /* JADX WARN: Type inference failed for: r0v239 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r3v24, types: [androidx.compose.ui.Modifier$Node, androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.SemanticsModifierNode] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:262:0x0551 -> B:253:0x0531). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:253:0x0531
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:71)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final boolean performActionHelper(int r21, int r22, android.os.Bundle r23) {
        /*
            Method dump skipped, instruction units count: 1916
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.performActionHelper(int, int, android.os.Bundle):boolean");
    }

    private static final boolean performActionHelper$canScroll(ScrollAxisRange scrollAxisRange, float f2) {
        return (f2 < 0.0f && scrollAxisRange.getValue().invoke().floatValue() > 0.0f) || (f2 > 0.0f && scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue());
    }

    private static final float performActionHelper$scrollDelta(float f2, float f3) {
        if (Math.signum(f2) == Math.signum(f3)) {
            return Math.abs(f2) < Math.abs(f3) ? f2 : f3;
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addExtraDataToAccessibilityNodeInfoHelper(int i2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, String str, Bundle bundle) {
        SemanticsNode semanticsNode;
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(i2);
        if (semanticsNodeWithAdjustedBounds != null && (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) != null) {
            String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
            if (Intrinsics.areEqual(str, this.ExtraDataTestTraversalBeforeVal)) {
                int orDefault = this.idToBeforeMap.getOrDefault(i2, -1);
                if (orDefault != -1) {
                    accessibilityNodeInfoCompat.getExtras().putInt(str, orDefault);
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual(str, this.ExtraDataTestTraversalAfterVal)) {
                int orDefault2 = this.idToAfterMap.getOrDefault(i2, -1);
                if (orDefault2 != -1) {
                    accessibilityNodeInfoCompat.getExtras().putInt(str, orDefault2);
                    return;
                }
                return;
            }
            if (semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getGetTextLayoutResult()) && bundle != null && Intrinsics.areEqual(str, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_KEY)) {
                int i3 = bundle.getInt(AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX, -1);
                int i4 = bundle.getInt(AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH, -1);
                if (i4 > 0 && i3 >= 0) {
                    if (i3 < (iterableTextForAccessibility != null ? iterableTextForAccessibility.length() : Integer.MAX_VALUE)) {
                        TextLayoutResult textLayoutResult = SemanticsUtils_androidKt.getTextLayoutResult(semanticsNode.getUnmergedConfig$ui_release());
                        if (textLayoutResult == null) {
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i5 = 0; i5 < i4; i5++) {
                            int i6 = i3 + i5;
                            if (i6 >= textLayoutResult.getLayoutInput().getText().length()) {
                                arrayList.add(null);
                            } else {
                                arrayList.add(toScreenCoords(semanticsNode, textLayoutResult.getBoundingBox(i6)));
                            }
                        }
                        accessibilityNodeInfoCompat.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                        return;
                    }
                }
                return;
            }
            if (semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getTestTag()) && bundle != null && Intrinsics.areEqual(str, ExtraDataTestTagKey)) {
                String str2 = (String) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getTestTag());
                if (str2 != null) {
                    accessibilityNodeInfoCompat.getExtras().putCharSequence(str, str2);
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual(str, ExtraDataIdKey)) {
                accessibilityNodeInfoCompat.getExtras().putInt(str, semanticsNode.getId());
            }
        }
    }

    private final RectF toScreenCoords(SemanticsNode semanticsNode, androidx.compose.ui.geometry.Rect rect) {
        if (semanticsNode == null) {
            return null;
        }
        androidx.compose.ui.geometry.Rect rectM3974translatek4lQ0M = rect.m3974translatek4lQ0M(semanticsNode.m5941getPositionInRootF1C5BW0());
        androidx.compose.ui.geometry.Rect boundsInRoot = semanticsNode.getBoundsInRoot();
        androidx.compose.ui.geometry.Rect rectIntersect = rectM3974translatek4lQ0M.overlaps(boundsInRoot) ? rectM3974translatek4lQ0M.intersect(boundsInRoot) : null;
        if (rectIntersect == null) {
            return null;
        }
        long jMo5467localToScreenMKHz9U = this.view.mo5467localToScreenMKHz9U(OffsetKt.Offset(rectIntersect.getLeft(), rectIntersect.getTop()));
        long jMo5467localToScreenMKHz9U2 = this.view.mo5467localToScreenMKHz9U(OffsetKt.Offset(rectIntersect.getRight(), rectIntersect.getBottom()));
        return new RectF(Offset.m3937getXimpl(jMo5467localToScreenMKHz9U), Offset.m3938getYimpl(jMo5467localToScreenMKHz9U), Offset.m3937getXimpl(jMo5467localToScreenMKHz9U2), Offset.m3938getYimpl(jMo5467localToScreenMKHz9U2));
    }

    public final boolean dispatchHoverEvent$ui_release(MotionEvent motionEvent) {
        if (!isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iHitTestSemanticsAt$ui_release = hitTestSemanticsAt$ui_release(motionEvent.getX(), motionEvent.getY());
            boolean zDispatchGenericMotionEvent = this.view.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
            updateHoveredVirtualView(iHitTestSemanticsAt$ui_release);
            if (iHitTestSemanticsAt$ui_release == Integer.MIN_VALUE) {
                return zDispatchGenericMotionEvent;
            }
            return true;
        }
        if (action != 10) {
            return false;
        }
        if (this.hoveredVirtualViewId == Integer.MIN_VALUE) {
            return this.view.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
        }
        updateHoveredVirtualView(Integer.MIN_VALUE);
        return true;
    }

    public final int hitTestSemanticsAt$ui_release(float f2, float f3) {
        int iSemanticsNodeIdToAccessibilityVirtualNodeId;
        Owner.measureAndLayout$default(this.view, false, 1, null);
        HitTestResult hitTestResult = new HitTestResult();
        LayoutNode.m5663hitTestSemanticsM_7yMNQ$ui_release$default(this.view.getRoot(), OffsetKt.Offset(f2, f3), hitTestResult, false, false, 12, null);
        int lastIndex = CollectionsKt.getLastIndex(hitTestResult);
        while (true) {
            iSemanticsNodeIdToAccessibilityVirtualNodeId = Integer.MIN_VALUE;
            if (-1 >= lastIndex) {
                break;
            }
            LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(hitTestResult.get(lastIndex));
            if (this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(layoutNodeRequireLayoutNode) != null) {
                return Integer.MIN_VALUE;
            }
            if (layoutNodeRequireLayoutNode.getNodes$ui_release().m5710hasH91voCI$ui_release(NodeKind.m5749constructorimpl(8))) {
                iSemanticsNodeIdToAccessibilityVirtualNodeId = semanticsNodeIdToAccessibilityVirtualNodeId(layoutNodeRequireLayoutNode.getSemanticsId());
                if (SemanticsUtils_androidKt.isImportantForAccessibility(SemanticsNodeKt.SemanticsNode(layoutNodeRequireLayoutNode, false))) {
                    break;
                }
            }
            lastIndex--;
        }
        return iSemanticsNodeIdToAccessibilityVirtualNodeId;
    }

    private final void updateHoveredVirtualView(int i2) {
        int i3 = this.hoveredVirtualViewId;
        if (i3 == i2) {
            return;
        }
        this.hoveredVirtualViewId = i2;
        sendEventForVirtualView$default(this, i2, 128, null, null, 12, null);
        sendEventForVirtualView$default(this, i3, 256, null, null, 12, null);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view) {
        return this.nodeProvider;
    }

    private final <T extends CharSequence> T trimToSize(T t2, int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("size should be greater than 0".toString());
        }
        if (t2 != null && t2.length() != 0 && t2.length() > i2) {
            int i3 = i2 - 1;
            if (Character.isHighSurrogate(t2.charAt(i3)) && Character.isLowSurrogate(t2.charAt(i2))) {
                i2 = i3;
            }
            T t3 = (T) t2.subSequence(0, i2);
            Intrinsics.checkNotNull(t3, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
            return t3;
        }
        return t2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void semanticsChangeChecker$lambda$49(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        Trace.beginSection("measureAndLayout");
        try {
            Owner.measureAndLayout$default(androidComposeViewAccessibilityDelegateCompat.view, false, 1, null);
            Unit unit = Unit.INSTANCE;
            Trace.endSection();
            Trace.beginSection("checkForSemanticsChanges");
            try {
                androidComposeViewAccessibilityDelegateCompat.checkForSemanticsChanges();
                Unit unit2 = Unit.INSTANCE;
                Trace.endSection();
                androidComposeViewAccessibilityDelegateCompat.checkingForSemanticsChanges = false;
            } finally {
            }
        } finally {
        }
    }

    public final void onSemanticsChange$ui_release() {
        this.currentSemanticsNodesInvalidated = true;
        if (!isEnabled$ui_release() || this.checkingForSemanticsChanges) {
            return;
        }
        this.checkingForSemanticsChanges = true;
        Handler handler = this.handler;
        Object[] objArr = {this.semanticsChangeChecker};
        Method method = Class.forName(C1561oA.Yd("\u001a(\u001f.,'#m05p\f&4+4.<", (short) (C1607wl.Xd() ^ 6768))).getMethod(Jg.Wd("`\u0014aT", (short) (ZN.Xd() ^ 5093), (short) (ZN.Xd() ^ 16537)), Class.forName(Xg.qd("\u0011\t\u001f\u000bX\u0018\u000e\u001c\u0016]\u0003'!\"\u0016\u0018#\u001d", (short) (C1499aX.Xd() ^ (-7427)), (short) (C1499aX.Xd() ^ (-24642)))));
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d A[Catch: all -> 0x0143, TryCatch #1 {all -> 0x0143, blocks: (B:13:0x003b, B:19:0x0071, B:24:0x0085, B:26:0x008d, B:28:0x0096, B:30:0x009f, B:31:0x00b0, B:33:0x00b7, B:35:0x00d3, B:37:0x00e9, B:39:0x0103, B:40:0x0108, B:47:0x0133, B:48:0x0137, B:41:0x010f, B:23:0x0082), top: B:58:0x0022, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0138  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0094 -> B:44:0x012f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x012c -> B:44:0x012f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object boundsUpdatesEventLoop$ui_release(kotlin.coroutines.Continuation<? super kotlin.Unit> r17) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.boundsUpdatesEventLoop$ui_release(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void onLayoutChange$ui_release(LayoutNode layoutNode) {
        this.currentSemanticsNodesInvalidated = true;
        if (isEnabled$ui_release()) {
            notifySubtreeAccessibilityStateChangedIfNeeded(layoutNode);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifySubtreeAccessibilityStateChangedIfNeeded(LayoutNode layoutNode) {
        if (this.subtreeChangedLayoutNodes.add(layoutNode)) {
            this.boundsUpdateChannel.mo10484trySendJP2dKIU(Unit.INSTANCE);
        }
    }

    private final void sendTypeViewScrolledAccessibilityEvent(LayoutNode layoutNode) throws Throwable {
        if (layoutNode.isAttached() && !this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode)) {
            int semanticsId = layoutNode.getSemanticsId();
            ScrollAxisRange scrollAxisRange = this.pendingHorizontalScrollEvents.get(semanticsId);
            ScrollAxisRange scrollAxisRange2 = this.pendingVerticalScrollEvents.get(semanticsId);
            if (scrollAxisRange == null && scrollAxisRange2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventCreateEvent = createEvent(semanticsId, 4096);
            if (scrollAxisRange != null) {
                accessibilityEventCreateEvent.setScrollX((int) scrollAxisRange.getValue().invoke().floatValue());
                accessibilityEventCreateEvent.setMaxScrollX((int) scrollAxisRange.getMaxValue().invoke().floatValue());
            }
            if (scrollAxisRange2 != null) {
                accessibilityEventCreateEvent.setScrollY((int) scrollAxisRange2.getValue().invoke().floatValue());
                accessibilityEventCreateEvent.setMaxScrollY((int) scrollAxisRange2.getMaxValue().invoke().floatValue());
            }
            sendEvent(accessibilityEventCreateEvent);
        }
    }

    private final void sendSubtreeChangeAccessibilityEvents(LayoutNode layoutNode, MutableIntSet mutableIntSet) {
        SemanticsConfiguration collapsedSemantics$ui_release;
        LayoutNode layoutNodeFindClosestParentNode;
        if (layoutNode.isAttached() && !this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode)) {
            if (!layoutNode.getNodes$ui_release().m5710hasH91voCI$ui_release(NodeKind.m5749constructorimpl(8))) {
                layoutNode = AndroidComposeViewAccessibilityDelegateCompat_androidKt.findClosestParentNode(layoutNode, new Function1<LayoutNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Boolean invoke(LayoutNode layoutNode2) {
                        return Boolean.valueOf(layoutNode2.getNodes$ui_release().m5710hasH91voCI$ui_release(NodeKind.m5749constructorimpl(8)));
                    }
                });
            }
            if (layoutNode != null && (collapsedSemantics$ui_release = layoutNode.getCollapsedSemantics$ui_release()) != null) {
                if (!collapsedSemantics$ui_release.isMergingSemanticsOfDescendants() && (layoutNodeFindClosestParentNode = AndroidComposeViewAccessibilityDelegateCompat_androidKt.findClosestParentNode(layoutNode, new Function1<LayoutNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendSubtreeChangeAccessibilityEvents.1
                    @Override // kotlin.jvm.functions.Function1
                    public final Boolean invoke(LayoutNode layoutNode2) {
                        SemanticsConfiguration collapsedSemantics$ui_release2 = layoutNode2.getCollapsedSemantics$ui_release();
                        boolean z2 = false;
                        if (collapsedSemantics$ui_release2 != null && collapsedSemantics$ui_release2.isMergingSemanticsOfDescendants()) {
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                    }
                })) != null) {
                    layoutNode = layoutNodeFindClosestParentNode;
                }
                if (layoutNode != null) {
                    int semanticsId = layoutNode.getSemanticsId();
                    if (mutableIntSet.add(semanticsId)) {
                        sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(semanticsId), 2048, 1, null, 8, null);
                    }
                }
            }
        }
    }

    private final void checkForSemanticsChanges() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (isEnabled$ui_release()) {
                sendAccessibilitySemanticsStructureChangeEvents(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), this.previousSemanticsRoot);
            }
            Unit unit = Unit.INSTANCE;
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                sendSemanticsPropertyChangeEvents(getCurrentSemanticsNodes());
                Unit unit2 = Unit.INSTANCE;
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    updateSemanticsNodesCopyAndPanes();
                    Unit unit3 = Unit.INSTANCE;
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void updateSemanticsNodesCopyAndPanes() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.updateSemanticsNodesCopyAndPanes():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x05c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void sendSemanticsPropertyChangeEvents(androidx.collection.IntObjectMap<androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds> r38) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1556
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendSemanticsPropertyChangeEvents(androidx.collection.IntObjectMap):void");
    }

    private final boolean registerScrollingId(int i2, List<ScrollObservationScope> list) {
        boolean z2;
        ScrollObservationScope scrollObservationScopeFindById = SemanticsUtils_androidKt.findById(list, i2);
        if (scrollObservationScopeFindById != null) {
            z2 = false;
        } else {
            scrollObservationScopeFindById = new ScrollObservationScope(i2, this.scrollObservationScopes, null, null, null, null);
            z2 = true;
        }
        this.scrollObservationScopes.add(scrollObservationScopeFindById);
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleScrollEventIfNeeded(final ScrollObservationScope scrollObservationScope) {
        if (scrollObservationScope.isValidOwnerScope()) {
            this.view.getSnapshotObserver().observeReads$ui_release(scrollObservationScope, this.scheduleScrollEventIfNeededLambda, new Function0<Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.scheduleScrollEventIfNeeded.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    SemanticsNode semanticsNode;
                    LayoutNode layoutNode$ui_release;
                    ScrollAxisRange horizontalScrollAxisRange = scrollObservationScope.getHorizontalScrollAxisRange();
                    ScrollAxisRange verticalScrollAxisRange = scrollObservationScope.getVerticalScrollAxisRange();
                    Float oldXValue = scrollObservationScope.getOldXValue();
                    Float oldYValue = scrollObservationScope.getOldYValue();
                    float fFloatValue = (horizontalScrollAxisRange == null || oldXValue == null) ? 0.0f : horizontalScrollAxisRange.getValue().invoke().floatValue() - oldXValue.floatValue();
                    float fFloatValue2 = (verticalScrollAxisRange == null || oldYValue == null) ? 0.0f : verticalScrollAxisRange.getValue().invoke().floatValue() - oldYValue.floatValue();
                    if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                        int iSemanticsNodeIdToAccessibilityVirtualNodeId = this.semanticsNodeIdToAccessibilityVirtualNodeId(scrollObservationScope.getSemanticsNodeId());
                        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) this.getCurrentSemanticsNodes().get(this.focusedVirtualViewId);
                        if (semanticsNodeWithAdjustedBounds != null) {
                            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this;
                            try {
                                AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = androidComposeViewAccessibilityDelegateCompat.currentlyFocusedANI;
                                if (accessibilityNodeInfoCompat != null) {
                                    accessibilityNodeInfoCompat.setBoundsInScreen(androidComposeViewAccessibilityDelegateCompat.boundsInScreen(semanticsNodeWithAdjustedBounds));
                                    Unit unit = Unit.INSTANCE;
                                }
                            } catch (IllegalStateException unused) {
                                Unit unit2 = Unit.INSTANCE;
                            }
                        }
                        this.getView().invalidate();
                        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds2 = (SemanticsNodeWithAdjustedBounds) this.getCurrentSemanticsNodes().get(iSemanticsNodeIdToAccessibilityVirtualNodeId);
                        if (semanticsNodeWithAdjustedBounds2 != null && (semanticsNode = semanticsNodeWithAdjustedBounds2.getSemanticsNode()) != null && (layoutNode$ui_release = semanticsNode.getLayoutNode$ui_release()) != null) {
                            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat2 = this;
                            if (horizontalScrollAxisRange != null) {
                                androidComposeViewAccessibilityDelegateCompat2.pendingHorizontalScrollEvents.set(iSemanticsNodeIdToAccessibilityVirtualNodeId, horizontalScrollAxisRange);
                            }
                            if (verticalScrollAxisRange != null) {
                                androidComposeViewAccessibilityDelegateCompat2.pendingVerticalScrollEvents.set(iSemanticsNodeIdToAccessibilityVirtualNodeId, verticalScrollAxisRange);
                            }
                            androidComposeViewAccessibilityDelegateCompat2.notifySubtreeAccessibilityStateChangedIfNeeded(layoutNode$ui_release);
                        }
                    }
                    if (horizontalScrollAxisRange != null) {
                        scrollObservationScope.setOldXValue(horizontalScrollAxisRange.getValue().invoke());
                    }
                    if (verticalScrollAxisRange != null) {
                        scrollObservationScope.setOldYValue(verticalScrollAxisRange.getValue().invoke());
                    }
                }
            });
        }
    }

    private final void sendPaneChangeEvents(int i2, int i3, String str) throws Throwable {
        AccessibilityEvent accessibilityEventCreateEvent = createEvent(semanticsNodeIdToAccessibilityVirtualNodeId(i2), 32);
        accessibilityEventCreateEvent.setContentChangeTypes(i3);
        if (str != null) {
            accessibilityEventCreateEvent.getText().add(str);
        }
        sendEvent(accessibilityEventCreateEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void sendAccessibilitySemanticsStructureChangeEvents(androidx.compose.ui.semantics.SemanticsNode r21, androidx.compose.ui.platform.SemanticsNodeCopy r22) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendAccessibilitySemanticsStructureChangeEvents(androidx.compose.ui.semantics.SemanticsNode, androidx.compose.ui.platform.SemanticsNodeCopy):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int semanticsNodeIdToAccessibilityVirtualNodeId(int i2) {
        if (i2 == this.view.getSemanticsOwner().getUnmergedRootSemanticsNode().getId()) {
            return -1;
        }
        return i2;
    }

    private final boolean traverseAtGranularity(SemanticsNode semanticsNode, int i2, boolean z2, boolean z3) throws Throwable {
        AccessibilityIterators.TextSegmentIterator iteratorForGranularity;
        int accessibilitySelectionStart;
        int i3;
        int id = semanticsNode.getId();
        Integer num = this.previousTraversedNode;
        if (num == null || id != num.intValue()) {
            this.accessibilityCursorPosition = -1;
            this.previousTraversedNode = Integer.valueOf(semanticsNode.getId());
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
        String str = iterableTextForAccessibility;
        if (str == null || str.length() == 0 || (iteratorForGranularity = getIteratorForGranularity(semanticsNode, i2)) == null) {
            return false;
        }
        int accessibilitySelectionEnd = getAccessibilitySelectionEnd(semanticsNode);
        if (accessibilitySelectionEnd == -1) {
            accessibilitySelectionEnd = z2 ? 0 : iterableTextForAccessibility.length();
        }
        int[] iArrFollowing = z2 ? iteratorForGranularity.following(accessibilitySelectionEnd) : iteratorForGranularity.preceding(accessibilitySelectionEnd);
        if (iArrFollowing == null) {
            return false;
        }
        int i4 = iArrFollowing[0];
        int i5 = iArrFollowing[1];
        if (z3 && isAccessibilitySelectionExtendable(semanticsNode)) {
            accessibilitySelectionStart = getAccessibilitySelectionStart(semanticsNode);
            if (accessibilitySelectionStart == -1) {
                accessibilitySelectionStart = z2 ? i4 : i5;
            }
            i3 = z2 ? i5 : i4;
        } else {
            accessibilitySelectionStart = z2 ? i5 : i4;
            i3 = accessibilitySelectionStart;
        }
        this.pendingTextTraversedEvent = new PendingTextTraversedEvent(semanticsNode, z2 ? 256 : 512, i2, i4, i5, SystemClock.uptimeMillis());
        setAccessibilitySelection(semanticsNode, accessibilitySelectionStart, i3, true);
        return true;
    }

    private final void sendPendingTextTraversedAtGranularityEvent(int i2) throws Throwable {
        PendingTextTraversedEvent pendingTextTraversedEvent = this.pendingTextTraversedEvent;
        if (pendingTextTraversedEvent != null) {
            if (i2 != pendingTextTraversedEvent.getNode().getId()) {
                return;
            }
            if (SystemClock.uptimeMillis() - pendingTextTraversedEvent.getTraverseTime() <= 1000) {
                AccessibilityEvent accessibilityEventCreateEvent = createEvent(semanticsNodeIdToAccessibilityVirtualNodeId(pendingTextTraversedEvent.getNode().getId()), 131072);
                accessibilityEventCreateEvent.setFromIndex(pendingTextTraversedEvent.getFromIndex());
                accessibilityEventCreateEvent.setToIndex(pendingTextTraversedEvent.getToIndex());
                accessibilityEventCreateEvent.setAction(pendingTextTraversedEvent.getAction());
                accessibilityEventCreateEvent.setMovementGranularity(pendingTextTraversedEvent.getGranularity());
                accessibilityEventCreateEvent.getText().add(getIterableTextForAccessibility(pendingTextTraversedEvent.getNode()));
                sendEvent(accessibilityEventCreateEvent);
            }
        }
        this.pendingTextTraversedEvent = null;
    }

    private final boolean setAccessibilitySelection(SemanticsNode semanticsNode, int i2, int i3, boolean z2) throws Throwable {
        String iterableTextForAccessibility;
        if (semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getSetSelection()) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode)) {
            Function3 function3 = (Function3) ((AccessibilityAction) semanticsNode.getUnmergedConfig$ui_release().get(SemanticsActions.INSTANCE.getSetSelection())).getAction();
            if (function3 != null) {
                return ((Boolean) function3.invoke(Integer.valueOf(i2), Integer.valueOf(i3), Boolean.valueOf(z2))).booleanValue();
            }
            return false;
        }
        if ((i2 == i3 && i3 == this.accessibilityCursorPosition) || (iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode)) == null) {
            return false;
        }
        if (i2 < 0 || i2 != i3 || i3 > iterableTextForAccessibility.length()) {
            i2 = -1;
        }
        this.accessibilityCursorPosition = i2;
        String str = iterableTextForAccessibility;
        boolean z3 = str.length() > 0;
        sendEvent(createTextSelectionChangedEvent(semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNode.getId()), z3 ? Integer.valueOf(this.accessibilityCursorPosition) : null, z3 ? Integer.valueOf(this.accessibilityCursorPosition) : null, z3 ? Integer.valueOf(iterableTextForAccessibility.length()) : null, str));
        sendPendingTextTraversedAtGranularityEvent(semanticsNode.getId());
        return true;
    }

    private final int getAccessibilitySelectionStart(SemanticsNode semanticsNode) {
        if (!semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getContentDescription()) && semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getTextSelectionRange())) {
            return TextRange.m6123getStartimpl(((TextRange) semanticsNode.getUnmergedConfig$ui_release().get(SemanticsProperties.INSTANCE.getTextSelectionRange())).m6127unboximpl());
        }
        return this.accessibilityCursorPosition;
    }

    private final int getAccessibilitySelectionEnd(SemanticsNode semanticsNode) {
        if (!semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getContentDescription()) && semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getTextSelectionRange())) {
            return TextRange.m6118getEndimpl(((TextRange) semanticsNode.getUnmergedConfig$ui_release().get(SemanticsProperties.INSTANCE.getTextSelectionRange())).m6127unboximpl());
        }
        return this.accessibilityCursorPosition;
    }

    private final boolean isAccessibilitySelectionExtendable(SemanticsNode semanticsNode) {
        return !semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getContentDescription()) && semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getEditableText());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator getIteratorForGranularity(androidx.compose.ui.semantics.SemanticsNode r16, int r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.getIteratorForGranularity(androidx.compose.ui.semantics.SemanticsNode, int):androidx.compose.ui.platform.AccessibilityIterators$TextSegmentIterator");
    }

    private final String getIterableTextForAccessibility(SemanticsNode semanticsNode) {
        AnnotatedString annotatedString;
        if (semanticsNode == null) {
            return null;
        }
        if (semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getContentDescription())) {
            return ListUtilsKt.fastJoinToString$default((List) semanticsNode.getUnmergedConfig$ui_release().get(SemanticsProperties.INSTANCE.getContentDescription()), ",", null, null, 0, null, null, 62, null);
        }
        if (semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getEditableText())) {
            AnnotatedString textForTextField = getTextForTextField(semanticsNode.getUnmergedConfig$ui_release());
            if (textForTextField != null) {
                return textForTextField.getText();
            }
            return null;
        }
        List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getText());
        if (list == null || (annotatedString = (AnnotatedString) CollectionsKt.firstOrNull(list)) == null) {
            return null;
        }
        return annotatedString.getText();
    }

    private final AnnotatedString getTextForTextField(SemanticsConfiguration semanticsConfiguration) {
        return (AnnotatedString) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsProperties.INSTANCE.getEditableText());
    }

    /* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u0016DLcz\u0004I\u0006>\u000b6Ȑ\u0007\":\u0018\u007fјnjO0L͜P.`_2şs{J$c$wECU(\u0007*\tUNm˪p`ҙ;C=\u0005V{̶0Icx&:\u001d3Zom5}sK<xtd\tP60=\u0012\u0005/ ZL\u001e}\u0013Cy\u0014B6NyRT#L3$X\u001a\u00070\u000f)tid5vr\u000e>=&\u001bipRmsx\r[\u0019^V=\f%gN/NDM\u0015SWI\u001b\u001b{M\u0011Wqk\u0014\u0019+5.as\u0006:\t\u0004\"%CO;a#,j\u000eib\"&YY*_ם\u00129"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011b|-Aq\u0015\fWKFuB\u001e\u0006laKba*N\u00055KIR3`a\u0007\u001c\u0014\u0019Z\u0010J:\rbcI/jSu|\u00124T\fIh\\\n\u0014\u000eCxt?Z\u0017K\t)^K(h1fi\u000bK@Eo\u007f", "\u001a`]1e6BR,Hxh9|R@i\u007f:E<~\u0015\u0017U}\u00129z,9h\u0012i\u0013k\u0014.[Q?h8%\u0019wu\"\u0011b,9\u00041XPM,i0|E\u001f\u000eic", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\"\u001eC~\u000fF\u0004-~5\u0007\u001fDw\u001a-+MCv>,\u0015Ye9\u0019?*Lv5UPK0cV\u0002Qr\u0012a\u000eP'\u001c\u00057K,y@FtK\u001d", "/cS\u0012k;KOwz\nZ\u001b\u0007d-c\u007f6\nD}\u001b\u001eK~\"%\u0001$5=\u0007!A", "", "DhaAh(ED\u001d~\rB+", "", "7mU<", "\u001a`]1e6BR,Hxh9|R@i\u007f:E<~\u0015\u0017U}\u00129z,9h\u0012i\u0013k\u0014.[Q?h8%\u0019wu\"\u0011b,2\u007f(Q*X4gN\u0002\u0013", "3wc?T\u000b:b\u0015dzr", "", "/qVB`,Gb'", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "1qT.g,\u001aQ\u0017~\tl0y\r6i\u000f<dJ\u007f\u0017zPp\u0018", "4h]196<c'", "4nRBf", ">da3b9F/\u0017\u000e~h5", "", "/bc6b5", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private final class ComposeAccessibilityNodeProvider extends AccessibilityNodeProviderCompat {
        public ComposeAccessibilityNodeProvider() {
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int i2) throws Throwable {
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompatCreateNodeInfo = AndroidComposeViewAccessibilityDelegateCompat.this.createNodeInfo(i2);
            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
            if (androidComposeViewAccessibilityDelegateCompat.sendingFocusAffectingEvent && i2 == androidComposeViewAccessibilityDelegateCompat.focusedVirtualViewId) {
                androidComposeViewAccessibilityDelegateCompat.currentlyFocusedANI = accessibilityNodeInfoCompatCreateNodeInfo;
            }
            return accessibilityNodeInfoCompatCreateNodeInfo;
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public boolean performAction(int i2, int i3, Bundle bundle) {
            return AndroidComposeViewAccessibilityDelegateCompat.this.performActionHelper(i2, i3, bundle);
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public void addExtraDataToAccessibilityNodeInfo(int i2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, String str, Bundle bundle) {
            AndroidComposeViewAccessibilityDelegateCompat.this.addExtraDataToAccessibilityNodeInfoHelper(i2, accessibilityNodeInfoCompat, str, bundle);
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public AccessibilityNodeInfoCompat findFocus(int i2) {
            return createAccessibilityNodeInfo(AndroidComposeViewAccessibilityDelegateCompat.this.focusedVirtualViewId);
        }
    }

    /* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜NÐRiճ?k*3d`*qٴ?U(}j\u001f]O\u007fg\u001dL\u000b\u000fQ\u0012\u001e\u0016'n\\Mc}u\u0012=8\ttЩ7T"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011b|-Aq\u0015\fWKFuB\u001e\u0006laKba*N\u00055KIR3`a\u0007\u001c\u0014\u0019Z\u0010J:\rbcI/jSuz\u00130\u0016P\u001fp\f\u0013k", "", "u(E", "/cS X;)`#\u0001\b^:\u000bd-t\u00042\u0005", "", "7mU<", "\u001a`]1e6BR,Hxh9|R@i\u007f:E<~\u0015\u0017U}\u00129z,9h\u0012i\u0013k\u0014.[Q?h8%\u0019wu\"\u0011b,2\u007f(Q*X4gN\u0002\u0013", "Ad\\.a;BQ'g\u0005],", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ$u3\u001ej", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class Api24Impl {
        public static final Api24Impl INSTANCE = new Api24Impl();

        private Api24Impl() {
        }

        @JvmStatic
        public static final void addSetProgressAction(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, SemanticsNode semanticsNode) {
            AccessibilityAction accessibilityAction;
            if (!AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode) || (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getSetProgress())) == null) {
                return;
            }
            accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionSetProgress, accessibilityAction.getLabel()));
        }
    }

    /* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜NÐRiճ?k*3d`*qٴ?U(}j\u001f]O\u007fg\u001dL\u000b\u000fQ\u0012\u001e\u0016'n\\Mc}u\u0012=8\ttЩ7T"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011b|-Aq\u0015\fWKFuB\u001e\u0006laKba*N\u00055KIR3`a\u0007\u001c\u0014\u0019Z\u0010J:\rbcI/jSuz\u00130\u0016U\u001fp\f\u0013k", "", "u(E", "/cS\u001dT.>/\u0017\u000e~h5\u000b", "", "7mU<", "\u001a`]1e6BR,Hxh9|R@i\u007f:E<~\u0015\u0017U}\u00129z,9h\u0012i\u0013k\u0014.[Q?h8%\u0019wu\"\u0011b,2\u007f(Q*X4gN\u0002\u0013", "Ad\\.a;BQ'g\u0005],", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ$u3\u001ej", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class Api29Impl {
        public static final Api29Impl INSTANCE = new Api29Impl();

        private Api29Impl() {
        }

        @JvmStatic
        public static final void addPageActions(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, SemanticsNode semanticsNode) {
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode)) {
                AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getPageUp());
                if (accessibilityAction != null) {
                    accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageUp, accessibilityAction.getLabel()));
                }
                AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getPageDown());
                if (accessibilityAction2 != null) {
                    accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageDown, accessibilityAction2.getLabel()));
                }
                AccessibilityAction accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getPageLeft());
                if (accessibilityAction3 != null) {
                    accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageLeft, accessibilityAction3.getLabel()));
                }
                AccessibilityAction accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getPageRight());
                if (accessibilityAction4 != null) {
                    accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageRight, accessibilityAction4.getLabel()));
                }
            }
        }
    }
}
