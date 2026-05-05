package androidx.compose.material3;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.ScrollAxisRange;
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
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import com.dynatrace.android.agent.Global;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
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
/* JADX INFO: compiled from: DateRangePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯŃ\u0014D߬)\u001e\u007f\u007fLDiw\fA\u001c0\u0013.H~*, w\u000f߿r9FDm߉6Ri*\u0017ӆ\u00044:[,ڎK;k\u001a\u0006\"\u001fOVgmnRZ\u0019L\u0017إ\u001ex\u0001,QU~^\u001a\u000f@Iw?9Nw=O`|6\u001b :\">{\r\u00010*P\u0010|zKK\"\u00128ϋx:h\rUĨ\"\u0012\u001c>(\u0001$]oNLHt]P/+\u0003oDV'u0\u0005M\u0013L\\'#vi\u001e1@?5#C[\u0003\u001dRcΪ\u000b?\b=\rؒ/'9U{W<`\b\u0014++WՕer<\\\rĩh\f=+WcQQ&\u0012\u0006\u0002\u0014\rj\f>\n5QF-Hp8\u00149t\u0001^XP0jr\u0006\u0001aD$=\u007fa9i.lQoJ1[G}\u0015\rL+\u0017mOkڍ\u0012`\u001b,\u0005\u000bW1_RUU^\fi=\u001c\f\u0007a0:˙4G\u0006@,\u00174\u00173Js9Q5\u001c\bNDu\f\u001d`\u0017i0W͕D\"|-OҘ\b\u001ar\\d3s\u0001ZfE)O2S5\u00188\u0019.w\u0010>7$>h\u007flw\u0007e]8?_\u001fEv\u0007 \u001ejIoI4\u007f}ߧe\\|3OBh%hhHY2{l;2C^i>\u0012ԞHX\u00122BEw<D.7\u001f\u00037X\u0005.Bo\u00057}\u000b\b\u001e\"lN4\u0014y3##ɹTfv\u000fw~OL\rb(3gvE\u001b6UPpb!S\u000b\r\u001a\u0018G\u0016swPz>\u000eU*IF\u001eG^G=A\u001d/-@,EEz\u001e\u0016U['?z+\u0010U<ÿ2g\u0016\u0017\t\u000bn\u0018bO\u0003!R~l!;\f\u0013/ba%+wkZ\u000bioat\u0019Xjhh\u0005\u000b\u001f,W\u0019q8{cGs/#\u0016\u0006GG\u0017w\\\u0018\n^\u007fh\u000f4\u001d}\u0004Z\rFuhQkfS8w\u000f/D($z-ZH\u0019#NG߿3ؿάLCj'doe\u008f.\f\u001f\u001f,;x\u0007aH,\b\u007fJ-\u000eD$I\f/vE;\u0010{m\u0018q{gt\u000bx):\u000f\nj\u0007\u0012JrP\u000fe\u007f!d\u0016\u0007(GW:\u0011\u001fØ\r.:KL\u000e\u0011cdk\f\u0016!!Vr\u001f(HA\"Uټ\u0012^~{fN\u000b\u0001Ub'0'!\u001f5.xc93\fvs=\u0007J\u001cc.\u0019*\u0019iǎj/1cd?!Hh\u0003\u0011K\u0004hY\u0004F\u0004u1\u001c\u0010 \u0010F>\u0015\u001dp?K=_9wv^\b;Yr[|v@t\u0003R0S\u0017z+9l\u000e\u001d 1O!\u0006).ۄMߗ̢G\u001c\u0007QRd\u001fҊ{q\u00033-4=]AW(,'*\u0016\u0004A\f!8\"=\u0003#;\r]\u001c\u0002\"_19D\fF\u001b\u0010&+\u00050\u0017>[\u000bq8Hĝ:Y\bR\u0012\u0019dy{y'FML|\u0019R\\~w8}ؼgx[*\u0013l7v\np3VC+7O>\u0013\u0007bh/\u0004?f4\u0018/%7/E6|Ѝ\u0014Yi\b\u0001qU{\u001d-5qP\u0007A2b\u001e,'(\u001a4.bN-;\u0005tnh\u0017\u0005\u0005B\u00067\u000fn6q\r\fW\"-\u0003V\t)\u0013bq#\"rDO\u0019MqSHֿ\u000b\u0004S\t>M?\u0013W!G4\u001boV9?Djf\u0003\tBB710k:p^Tk^W]23|\u0003T\u0012u<POD\u0011<WuZPrL%2\u001ci[cI\u001f\u0011\u000fFP\b\u0006\u0006GO\u001bYY%83\u0015\u0003#>(K\u001cBy7\u0001VG\u0011\u0006\u001a\u0006\u0001k+;eZO$\u0002\u0014s/SiV\u001d\u0016DIczN\u007f[@\u000e47$R1<(ɀDʹ؝.ab\nd>og4uNnr+wp\u0007@\",\u00182$ji/LC\u0011\u0013G^n0;;\u001fGcg(%tES1OC\u0016<C(\u0013\u000f}\f̂/Sxl?bc\\#u\n@X\u0003F\rWQo)4G½Xmp\n}We0H\u0014\u0013\u0013*\u001aATp\u007f\u000f%FE\u0012v̒:\\\u0007\u001dY\u0007\u0019\u0011'$\r6j\f9WF2Vi\u001a}x4E\u0017A\u001c\fAug\u001dº٭\u001cǎئ)\b+>x\u001f_g\u007fةU9a\nDԳZ˥ib\rǹ9Mj+#\u0001\u000b7<In>H)/Ɯ\u0010ȭhH\u0018͊\u0019P6pH0^OUߣE\u05fc\u0005\u001c'\u07b7u#s\u0003Jbe`;ɲ-Ů[pZU13ҿ\u0002\b\u0018D\u001fҜ'LR֍6{"}, d2 = {"\u0011`[2a+:`\u0001\t\u0004m/j\u0019,h\u007f$z+|\u0016\u0016Kx\u0010", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u0001*LB?t6\u000f\u0011oq9\u00159", "5dc\u0010T3>\\\u0018z\bF6\u0006\u00182S\u0010%~@|\u0016\u0002Cn\r@\u007f'", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y4A}%w8?:j8'\u0017Y]@\u0017c:$", "\u0012`c2E(GU\u0019i~\\2|\u0016\u0012e{'\u0003D\n\u0017\u0002Cn\r@\u007f'", "\u0012`c2E(GU\u0019i~\\2|\u0016\u001ei\u000f/{+|\u0016\u0016Kx\u0010", "\u0016dP1X9!S\u001d\u0001}m\u0016}\n=e\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "\u0014", "\u0012`c2E(GU\u0019i~\\2|\u0016", "", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006U!DYj\u001c@o\u0016\u0019QAAkA\f$dp9\\", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "2`c296K[\u0015\u000e\n^9", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006U!DYh$5s\u0016;.MHs0-$hn\u000f", "Bhc9X", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "6dP1_0GS", "Ag^D@6=S\b\t|`3|", "", "1n[<e:", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006U!DYh$5s\u0016;+MBuA,j", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u00041h}\r3v\u0018.8G9q4+\u0003w]H\u00079\u0013J\u007f&TVR+o\u001cpG\u001c\u001dd\u001cNt\u001d\t#).mH8#\b9\u001fh7q\u007f\u0019 \u00124}:@`\u0018R\u0004#u\u000b1dUYl}CH\u0013,\t`\u001b_\b`8@$!R#(pL=\u0019{`fYX\u0004vnK\"D=5F7\\VNmd@~0-\u0015\\\b\u001b0gx5}yY\u001b0@s\fOpaCo\u0001^-lJ%5:F\u001cM\u0015D\u0006u<\u001dl)jTcW\u001c-\"drmL\u000e\u001a'\u0015e=li\u000f7\u001c\u000e:Xo\"+B\u0006\u0010%X\u0011\u0018\u0007\u000fqcOC(2\u000b!zQ05w~\fe%&2\u0015P#\rr2jA[\u0013RuH\u0015\u000b]K\u0015:&\u001auV|iW|y\u001a\\T:", "\u0012`c2E(GU\u0019i~\\2|\u0016\ro\t7{I\u0010", "Ad[2V;>R\u0007\u000evk;[\u0005>eg,\u0003G\u0005%", "", "Ad[2V;>Rx\by=(\f\t\u0017i\u0007/\u007fN", "2hb=_(RS\u0018f\u0005g;\u007fp3l\u0007,\n", "=m3.g,LA\u0019\u0006z\\;\u0001\u00138C\u0003$\u0005B\u0001", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "AsP?g\u000b:b\u0019f~e3\u0001\u0017", "3mS\u0011T;>;\u001d\u0006\u0002b:", "=m36f7EO-~yF6\u0006\u00182C\u0003$\u0005B\u0001", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", ";n]A[\u0010G;\u001d\u0006\u0002b:", "1`[2a+:`\u0001\ty^3", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\fIJ;t3\u001a\"Pk8\u0007j\u0002", "GdP?E(GU\u0019", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u0013n\u000f\u0015wI\u0003\u0017l", "Ad[2V;:P ~YZ;|\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d%<Y{/3j\u001d.,?JkBs", "uKY.i(\bZ\u0015\b|(\u0013\u0007\u00121;f-wQ|`\u001eCx\u0010\u0006]/>[S\u0005\u001es =TGD59/\u001d2bI\u0010a;R\u00010U\u0016/<eP\u0002A\u001e\u001b'c51\u0017\u0014`E-8IH'Q-Y\u000b9w\u0005\u0016\u001f\u001c~K\u0001KT\u001fK\u0004\u001eA\u0017\u0010dOXl\u0004K@X,(n\u0014j'j:\u0004,\u0010\u0001\u0019(lL5WEW\u001a\u0002R\u0007pcNbX4+>vZBRW_;t.t2\u0002\u0002!9\\}t\u0002)\r6*D.hTv\u0005:gz\u0015\u0002C=0%CF\u0017>^-svF\u0019r-aQ\u0016^D1&iaj\u0016XeY&[ e]\u00077_fHVw\u00116U~O1`\u0011\u0012\u00061wiHVdR\u000b\"{N0_Z\u000b~u\u0018)2\u0012D'XV*f7K\"\u0005e?\fZUR\u0015~\u001eviTqhas#IB\u000fS)>UJv\u001cKk\u001f\u0016A\u0005\u0007\u0006j=H>\t6})#CYE@j6\u0015taw\u007fcA\u001b,75\u0001e\nlh\u007f2\u001f\f\u000e2\n%fM<\n3\u000b't*GmY\u0005I06S\u001d", "\u0012`c2E(GU\u0019i~\\2|\u0016\u001dt{7{", ":nR._,", "\u001aiPCTuNb\u001d\u0006DE6z\u00056eU", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T!<Y\u0007\u001f3z|8K?Bk\n", "7mXA\\(EA\u0019\u0006z\\;|\b\u001dt{5\u000b\u001f|&\u0017/s\u0015Cz3", "7mXA\\(EA\u0019\u0006z\\;|\b\u000fn~\u0007wO\u0001~\u001bNv\u0012J", "7mXA\\(E2\u001d\r\u0006e(\u0011\t.M\n1\u000bCh\u001b\u001eNs\u001c", "7mXA\\(E2\u001d\r\u0006e(\u0011p9d\u007f", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006U)Cd\u0005\u001cKU -M\u0019", "\u0012`c2E(GU\u0019i~\\2|\u0016\u001dt{7{\bc\b\u0002\u0016=# ", "uKY.i(\bc(\u0003\u0002(\u0013\u0007\u0007+l\u007f}bE|(\u0013\u0011v\nExn\u001cc\u0007\"\rT\u001b*^?\u0005r0'\u00172HC\u0010e\u00025{#XH\u00183X[t\u0007z\u001cc\u0010$\u0012\u0013\u000fhH(w\u000eD\u001b\u0011.I\u0010\u0005L\n\u001b\u0003\n>lp\u0018:vC\u0003\u0014\u0003K-gY#]\u0004OLOp*.\u0014[,\\G> \u001b?b\thW.\b\u000bO\u000eyRXcvG'P{\u000b:vZSOsTO>%)S\u0007\u0002 2\"|'\u0004-\u00118&=2N*c'>Kt\u001e.\\,+$<< -Z_\u0005l\u0014", "!vXAV/:P ~YZ;|h8t\r<YJ\n&\u0017P~", "2hb=_(R;#}z", "!vXAV/:P ~YZ;|h8t\r<YJ\n&\u0017P~U)_l\u00028I\f", "uKY.i(\bZ\u0015\b|(\u0013\u0007\u00121;f-wQ|`\u001eCx\u0010\u0006]/>[S\u0005\u001bT\u001c8\\J?t}#&p+:\u0017l*]z1PZ\u0018\rl[pL\u0018\u001ccZ$\u0012\u0013\u000fhH(w\u000e<0\u0010uJ\u0012Df\u0010\u0010 \u0017C4QR_\u000eV}\u001f~\r~OBb^\u0007QEDusb\u0016g(fH:m\u001cm(\u001buT*\u0011I\u001d\u0015{aytpC D\u0016 EmdEA|=Fs'&!b}\u001cA_x4>:\u007f=,6rN/p'+Z\u0002\u0017,2(#/5I\u001dCJv?jH\u0016s)o\bWj1@\u0019ri_O\\P<\u0013j5Lc~=R\u0013\u001fS|\u001d#U\u000eBhO{\u0005\u0010#zoMB.\u001e~$xO,m\u0011L\u000bb'\u001c;\u001a9`\\2\u0018_>M\u0011\u0018d5\u0013{8?$pVeTG{Zdy(5\fZG+;VF\u0005R\rw\f%4\u000e\u000fz$A3!uE\u0013\u0010);_8o>9\u0012q`0nN4%\u001e:;\u0006QS8\\\u0002/ \b\u001chF\"mGG\u0006;A\u0013H,DnU\u0013<g(s\u0010\u0011\u0006", "$daA\\*:Z\u0001\t\u0004m/\u000bo3s\u000f", ":`iF?0Lb\u0007\u000evm,", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B4GIz\"-\u0011wa\u000f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001T\u0012Ca*?yC\f$dp9\\J1J\b#\u0011SJ5^\u001cYG\u001d\u00140tS'\u001e\u0001#H wF\u0001\u0006\u00125KW\"n\u000b\u001b\u001d\u0012>4uS^YH\n\u001esP-rOg)ZWJCq.n\u0015,rC@D3\u001bu\"dma6S|c\u001apa}qpUb[H-<|_PN;+#p0\u001eX\u0006{\u0011E\"r5|8\u000eB*\u007fl\u0001Zg%BZ\u007fbu`J6&CE\u000fF\u0015Aqs>\u0017g\u001bno\u0018a58nLkmW\u0016\u000bf`h1ja\u0001E\u001ciGX\\\u00110H~\u0018Bu\u001e\b\u0014.qd\\\r\u0019^\t%zR\")\u0019~\u0012f% *\u001d\u000b#md9_\"Q\u0011\u000fhEl\u0006fK\u0011\u007fW\u0010z!YW`n1@|\u0010\\j1UD\u0002\\QoY\u001e0\u0010\u000b\f!op\u0010C$\u0013,%;h4_g/icb\"'=\u001f\u0018(,>\fV?\u0002(u1\u001d\t\u0018v|^e:G\u0002@EEqo\u0006BG\u0014<EV\u000e2M\"\rj{ OiI\u001cFw\r\r\u000e/w&e*0}R)u\u001bxs\u001c\u0015\u0019s%/d^bV!W!nU\u001e}AL", "1tbAb4,Q&\t\u0002e\bz\u00183o\t6", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~7\u000e.Fw\u001e\nKA;yB\"\u0012lh=\u0016w\bL\u0006+QU$", "1na<h;B\\\u0019lxh7|", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "Aba<_3.^\u007fzw^3", "", "Aba<_3\u001d]+\baZ)|\u0010", "@d\\2`)>`wz\n^\u0019x\u00121ej,yF\u0001$\u0005Vk\u001d<", "@d\\2`)>`wz\n^\u0019x\u00121ej,yF\u0001$\u0005Vk\u001d<>\t<:ek\u000b{", "uKY.i(\bZ\u0015\b|(\u0013\u0007\u00121;f-wQ|`\u001eCx\u0010\u0006]/>[S\u0007<i'*\u0017J7t6g{rj;\\J2X\u0006.KU\u00189X[t=\"[>\u0017]\u0018\t\u000e[AyR+3(\u00079S\u0006:{J\n \u0016@t~B \u0018C\t\u0015\u0003E%o\u0014#MyNACq&a\u0013_{XI:2iX\u0015$g]8\u000ezfZp\\\u0002rqU\u0019DE4G|_NE93F|2)Y{\u0005g\u0016<8\u0012p6\u0003A4:c\u0018\u0015e\"Fi\u0003#,&I#56I\u0017;R1?K:\u001dh\f]\u0011\u0010b 5\u0017kep6\u001e\u0003l\u00171", "CoS.g,\u001dO(~h^3|\u0007>i\n1", "2`c2<5&W \u0006~l", "1ta?X5MA(z\bm\u000bx\u0018/M\u0004/\u0003D\u000f", "1ta?X5M3\"}YZ;|p3l\u0007,\n", "uI;7T=:\u001d z\u0004`uc\u00138gU\u000f\u0001<\u0012\u0013`Nk\u0017>@\f?b\u007fu\u001es =TGD59/\u001d2bI\u0010a;R\u00010U\u0016/<eP\u0002A\u001e\u001b'c\u0012\u001c", "2qPDE(GU\u0019[v\\2~\u00169u\t'", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u0019u=-\u0015qp\u0018\u0014_><t1RL$", "Ad[2V;>R\u0006z\u0004`,`\u00120o", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d%<Y{/7l\u0003*VE;O=\u001f\u001f>", "1n[<e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "2qPDE(GU\u0019[v\\2~\u00169u\t'CH\u0014) Gui", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~X\u000b\u001cI{\u00148XC\u0005I>'$hjHep(`d%QWN\u0002CN{<!\u001c^\rat\u000b\u000faL.|D\u0001'\u0004;I\u000f?d\bY_{5qp@e\u0010Ff\u0011~C)LOZiO,\u00056", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class DateRangePickerKt {
    private static final PaddingValues DateRangePickerHeadlinePadding;
    private static final PaddingValues DateRangePickerTitlePadding;
    private static final PaddingValues CalendarMonthSubheadPadding = PaddingKt.m1015PaddingValuesa9UjIt4$default(Dp.m6638constructorimpl(24), Dp.m6638constructorimpl(20), 0.0f, Dp.m6638constructorimpl(8), 4, null);
    private static final float HeaderHeightOffset = Dp.m6638constructorimpl(60);

    /* JADX WARN: Removed duplicated region for block: B:113:0x02cc  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void DateRangePicker(final androidx.compose.material3.DateRangePickerState r16, androidx.compose.ui.Modifier r17, androidx.compose.material3.DatePickerFormatter r18, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r19, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r20, boolean r21, androidx.compose.material3.DatePickerColors r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instruction units count: 777
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DateRangePickerKt.DateRangePicker(androidx.compose.material3.DateRangePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.DatePickerFormatter, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.material3.DatePickerColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: renamed from: rememberDateRangePickerState-IlFM19s, reason: not valid java name */
    public static final DateRangePickerState m2065rememberDateRangePickerStateIlFM19s(Long l2, Long l3, Long l4, IntRange intRange, int i2, SelectableDates selectableDates, Composer composer, int i3, int i4) {
        final int iM2087getPickerjFl4v0 = i2;
        final IntRange yearRange = intRange;
        final Long l5 = l4;
        final SelectableDates allDates = selectableDates;
        final Long l6 = l2;
        ComposerKt.sourceInformationMarkerStart(composer, -2012087461, "C(rememberDateRangePickerState)P(3,2,1,5,0:c#material3.DisplayMode)262@11757L15,*263@11866L475,263@11784L557:DateRangePicker.kt#uh7d8r");
        if ((i4 + 1) - (i4 | 1) != 0) {
            l6 = null;
        }
        final Long l7 = (i4 & 2) == 0 ? l3 : null;
        if ((-1) - (((-1) - i4) | ((-1) - 4)) != 0) {
            l5 = l6;
        }
        if ((i4 & 8) != 0) {
            yearRange = DatePickerDefaults.INSTANCE.getYearRange();
        }
        if ((i4 & 16) != 0) {
            iM2087getPickerjFl4v0 = DisplayMode.Companion.m2087getPickerjFl4v0();
        }
        if ((i4 & 32) != 0) {
            allDates = DatePickerDefaults.INSTANCE.getAllDates();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2012087461, i3, -1, "androidx.compose.material3.rememberDateRangePickerState (DateRangePicker.kt:261)");
        }
        final Locale localeDefaultLocale = CalendarLocale_androidKt.defaultLocale(composer, 0);
        Object[] objArr = new Object[0];
        Saver<DateRangePickerStateImpl, Object> Saver = DateRangePickerStateImpl.Companion.Saver(allDates, localeDefaultLocale);
        ComposerKt.sourceInformationMarkerStart(composer, -250595201, "CC(remember):DateRangePicker.kt#9igjgp");
        int i5 = 1;
        int i6 = ((-1) - (((-1) - ((-1) - (((-1) - ((((((i3 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (112 | i3)) ^ 48) <= 32 || !composer.changed(l7)) && (-1) - (((-1) - i3) | ((-1) - 48)) != 32) ? 0 : 1)) & ((-1) - (((((14 & i3) ^ 6) <= 4 || !composer.changed(l6)) && (6 & i3) != 4) ? 0 : 1))))) & ((-1) - ((((((i3 + 896) - (896 | i3)) ^ BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) <= 256 || !composer.changed(l5)) && (384 & i3) != 256) ? 0 : 1)))) | (composer.changedInstance(yearRange) ? 1 : 0);
        int i7 = (((((-1) - (((-1) - 57344) | ((-1) - i3))) ^ 24576) > 16384 && composer.changed(iM2087getPickerjFl4v0)) || (24576 & i3) == 16384) ? 1 : 0;
        int i8 = (i6 + i7) - (i6 & i7);
        if ((((458752 & i3) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072 || !composer.changed(allDates)) && (i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 131072) {
            i5 = 0;
        }
        int i9 = (-1) - (((-1) - i8) & ((-1) - i5));
        boolean zChangedInstance = composer.changedInstance(localeDefaultLocale);
        int i10 = (i9 + (zChangedInstance ? 1 : 0)) - (i9 & (zChangedInstance ? 1 : 0));
        Object objRememberedValue = composer.rememberedValue();
        if (i10 != 0 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = (Function0) new Function0<DateRangePickerStateImpl>() { // from class: androidx.compose.material3.DateRangePickerKt$rememberDateRangePickerState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final DateRangePickerStateImpl invoke() {
                    return new DateRangePickerStateImpl(l6, l7, l5, yearRange, iM2087getPickerjFl4v0, allDates, localeDefaultLocale, null);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        DateRangePickerStateImpl dateRangePickerStateImpl = (DateRangePickerStateImpl) RememberSaveableKt.m3764rememberSaveable(objArr, (Saver) Saver, (String) null, (Function0) objRememberedValue, composer, 0, 4);
        dateRangePickerStateImpl.setSelectableDates(allDates);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return dateRangePickerStateImpl;
    }

    /* JADX INFO: renamed from: DateRangePickerState-HVP43zI$default, reason: not valid java name */
    public static /* synthetic */ DateRangePickerState m2061DateRangePickerStateHVP43zI$default(Locale locale, Long l2, Long l3, Long l4, IntRange intRange, int i2, SelectableDates selectableDates, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            l2 = null;
        }
        if ((i3 + 4) - (4 | i3) != 0) {
            l3 = null;
        }
        if ((i3 + 8) - (8 | i3) != 0) {
            l4 = l2;
        }
        if ((i3 + 16) - (16 | i3) != 0) {
            intRange = DatePickerDefaults.INSTANCE.getYearRange();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 32)) != 0) {
            i2 = DisplayMode.Companion.m2087getPickerjFl4v0();
        }
        if ((i3 + 64) - (i3 | 64) != 0) {
            selectableDates = DatePickerDefaults.INSTANCE.getAllDates();
        }
        return m2060DateRangePickerStateHVP43zI(locale, l2, l3, l4, intRange, i2, selectableDates);
    }

    /* JADX INFO: renamed from: DateRangePickerState-HVP43zI, reason: not valid java name */
    public static final DateRangePickerState m2060DateRangePickerStateHVP43zI(Locale locale, Long l2, Long l3, Long l4, IntRange intRange, int i2, SelectableDates selectableDates) {
        return new DateRangePickerStateImpl(l2, l3, l4, intRange, i2, selectableDates, locale, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: SwitchableDateEntryContent-RN-2D1Q, reason: not valid java name */
    public static final void m2062SwitchableDateEntryContentRN2D1Q(Long l2, Long l3, final long j2, final int i2, final Function2<? super Long, ? super Long, Unit> function2, final Function1<? super Long, Unit> function1, final CalendarModel calendarModel, final IntRange intRange, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, Composer composer, final int i3, final int i4) {
        int i5;
        int i6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-532789335);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SwitchableDateEntryContent)P(9,8,4,3:c#material3.DisplayMode,5,6!1,10,2,7)676@30273L1249,668@30045L1477:DateRangePicker.kt#uh7d8r");
        final Long l4 = l2;
        if ((-1) - (((-1) - i3) | ((-1) - 6)) == 0) {
            i5 = (-1) - (((-1) - (composerStartRestartGroup.changed(l4) ? 4 : 2)) & ((-1) - i3));
        } else {
            i5 = i3;
        }
        final Long l5 = l3;
        if ((i3 & 48) == 0) {
            int i7 = composerStartRestartGroup.changed(l5) ? 32 : 16;
            i5 = (i5 + i7) - (i5 & i7);
        }
        if ((-1) - (((-1) - i3) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            int i8 = composerStartRestartGroup.changed(j2) ? 256 : 128;
            i5 = (i5 + i8) - (i5 & i8);
        }
        if ((i3 + 3072) - (i3 | 3072) == 0) {
            int i9 = composerStartRestartGroup.changed(i2) ? 2048 : 1024;
            i5 = (i5 + i9) - (i5 & i9);
        }
        if ((i3 & 24576) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changedInstance(function2) ? 16384 : 8192)));
        }
        if ((196608 & i3) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changedInstance(function1) ? 131072 : 65536)));
        }
        if ((-1) - (((-1) - 1572864) | ((-1) - i3)) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(calendarModel) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changedInstance(intRange) ? 8388608 : 4194304)));
        }
        if ((-1) - (((-1) - i3) | ((-1) - 100663296)) == 0) {
            i5 |= (i3 + 134217728) - (i3 | 134217728) == 0 ? composerStartRestartGroup.changed(datePickerFormatter) : composerStartRestartGroup.changedInstance(datePickerFormatter) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i3 + 805306368) - (i3 | 805306368) == 0) {
            i5 |= composerStartRestartGroup.changed(selectableDates) ? 536870912 : 268435456;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 6)) == 0) {
            i6 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(datePickerColors) ? 4 : 2)));
        } else {
            i6 = i4;
        }
        if ((i5 & 306783379) == 306783378 && (i6 + 3) - (3 | i6) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-532789335, i5, i6, "androidx.compose.material3.SwitchableDateEntryContent (DateRangePicker.kt:665)");
            }
            l4 = l4;
            l5 = l5;
            int i10 = i5 >> 9;
            CrossfadeKt.Crossfade(DisplayMode.m2079boximpl(i2), SemanticsModifierKt.semantics$default(Modifier.Companion, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$SwitchableDateEntryContent$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertiesKt.setContainer(semanticsPropertyReceiver, true);
                }
            }, 1, null), AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null), (String) null, ComposableLambdaKt.rememberComposableLambda(-1026642619, true, new Function3<DisplayMode, Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$SwitchableDateEntryContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(DisplayMode displayMode, Composer composer2, Integer num) {
                    m2067invokeQujVXRc(displayMode.m2085unboximpl(), composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke-QujVXRc, reason: not valid java name */
                public final void m2067invokeQujVXRc(int i11, Composer composer2, int i12) {
                    int i13 = i12;
                    ComposerKt.sourceInformation(composer2, "CP(0:c#material3.DisplayMode):DateRangePicker.kt#uh7d8r");
                    if ((-1) - (((-1) - i13) | ((-1) - 6)) == 0) {
                        i13 = (-1) - (((-1) - i13) & ((-1) - (composer2.changed(i11) ? 4 : 2)));
                    }
                    if ((i13 + 19) - (19 | i13) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1026642619, i13, -1, "androidx.compose.material3.SwitchableDateEntryContent.<anonymous> (DateRangePicker.kt:677)");
                    }
                    if (DisplayMode.m2082equalsimpl0(i11, DisplayMode.Companion.m2087getPickerjFl4v0())) {
                        composer2.startReplaceGroup(-1871299185);
                        ComposerKt.sourceInformation(composer2, "679@30355L618");
                        DateRangePickerKt.DateRangePickerContent(l4, l5, j2, function2, function1, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, composer2, 0);
                        composer2.endReplaceGroup();
                    } else if (DisplayMode.m2082equalsimpl0(i11, DisplayMode.Companion.m2086getInputjFl4v0())) {
                        composer2.startReplaceGroup(-1871277944);
                        ComposerKt.sourceInformation(composer2, "692@31023L483");
                        DateRangeInputKt.DateRangeInputContent(l4, l5, function2, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, composer2, 0);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(2120399965);
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i10 + 14) - (i10 | 14)) | 24960, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Long l6 = l4;
            final Long l7 = l5;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$SwitchableDateEntryContent$3
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

                public final void invoke(Composer composer2, int i11) {
                    DateRangePickerKt.m2062SwitchableDateEntryContentRN2D1Q(l6, l7, j2, i2, function2, function1, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DateRangePickerContent(final Long l2, final Long l3, final long j2, final Function2<? super Long, ? super Long, Unit> function2, final Function1<? super Long, Unit> function1, final CalendarModel calendarModel, final IntRange intRange, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-787063721);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(DateRangePickerContent)P(8,7,3,4,5!1,9,2,6)722@32197L64,725@32351L309,725@32324L336,733@32666L648:DateRangePicker.kt#uh7d8r");
        if ((i2 + 6) - (i2 | 6) == 0) {
            i3 = (composerStartRestartGroup.changed(l2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            int i4 = composerStartRestartGroup.changed(l3) ? 32 : 16;
            i3 = (i3 + i4) - (i3 & i4);
        }
        if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i3 |= composerStartRestartGroup.changed(j2) ? 256 : 128;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            int i5 = composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
            i3 = (i3 + i5) - (i3 & i5);
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changedInstance(calendarModel) ? 131072 : 65536)));
        }
        if ((-1) - (((-1) - 1572864) | ((-1) - i2)) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changedInstance(intRange) ? 1048576 : 524288)));
        }
        if ((12582912 & i2) == 0) {
            int i6 = (16777216 + i2) - (16777216 | i2) == 0 ? composerStartRestartGroup.changed(datePickerFormatter) : composerStartRestartGroup.changedInstance(datePickerFormatter) ? 8388608 : 4194304;
            i3 = (i3 + i6) - (i3 & i6);
        }
        if ((-1) - (((-1) - 100663296) | ((-1) - i2)) == 0) {
            i3 |= composerStartRestartGroup.changed(selectableDates) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i2 + 805306368) - (i2 | 805306368) == 0) {
            i3 |= composerStartRestartGroup.changed(datePickerColors) ? 536870912 : 268435456;
        }
        if ((i3 + 306783379) - (306783379 | i3) == 306783378 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-787063721, i3, -1, "androidx.compose.material3.DateRangePickerContent (DateRangePicker.kt:719)");
            }
            int iCoerceAtLeast = RangesKt.coerceAtLeast(calendarModel.getMonth(j2).indexIn(intRange), 0);
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(iCoerceAtLeast, 0, composerStartRestartGroup, 0, 2);
            Integer numValueOf = Integer.valueOf(iCoerceAtLeast);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1097467628, "CC(remember):DateRangePicker.kt#9igjgp");
            boolean z2 = (-1) - (((-1) - (composerStartRestartGroup.changed(lazyListStateRememberLazyListState) ? 1 : 0)) & ((-1) - (composerStartRestartGroup.changed(iCoerceAtLeast) ? 1 : 0))) == 1;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (Function2) new DateRangePickerKt$DateRangePickerContent$1$1(lazyListStateRememberLazyListState, iCoerceAtLeast, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 0);
            Modifier modifierM1020paddingVpY3zN4$default = PaddingKt.m1020paddingVpY3zN4$default(Modifier.Companion, DatePickerKt.getDatePickerHorizontalPadding(), 0.0f, 2, null);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1020paddingVpY3zN4$default);
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
            Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384862393, "C87@4365L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 556963099, "C734@32754L31,735@32794L514:DateRangePicker.kt#uh7d8r");
            int i7 = i3 >> 12;
            DatePickerKt.WeekDays(datePickerColors, calendarModel, composerStartRestartGroup, (-1) - (((-1) - ((-1) - (((-1) - (i3 >> 27)) | ((-1) - 14)))) & ((-1) - ((i7 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i7 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)))));
            int i8 = (-1) - (((-1) - (i3 << 3)) | ((-1) - 1008));
            int i9 = 7168 & i3;
            int i10 = (-1) - (((-1) - ((i8 + i9) - (i8 & i9))) & ((-1) - ((-1) - (((-1) - 57344) | ((-1) - i3)))));
            int i11 = 458752 & i3;
            int i12 = (-1) - (((-1) - ((i10 + i11) - (i10 & i11))) & ((-1) - (3670016 & i3)));
            int i13 = 29360128 & i3;
            int i14 = (-1) - (((-1) - ((i12 + i13) - (i12 & i13))) & ((-1) - (234881024 & i3)));
            int i15 = (1879048192 + i3) - (1879048192 | i3);
            VerticalMonthsList(lazyListStateRememberLazyListState, l2, l3, function2, function1, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, composerStartRestartGroup, (i14 + i15) - (i14 & i15));
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePickerContent.3
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
                    DateRangePickerKt.DateRangePickerContent(l2, l3, j2, function2, function1, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i2) & ((-1) - 1))));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void VerticalMonthsList(final LazyListState lazyListState, final Long l2, final Long l3, final Function2<? super Long, ? super Long, Unit> function2, final Function1<? super Long, Unit> function1, final CalendarModel calendarModel, final IntRange intRange, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1257365001);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(VerticalMonthsList)P(3,8,7,4,5!1,9,2,6)770@34042L158,776@34262L5,776@34269L3748,776@34205L3812,853@38052L228,853@38022L258:DateRangePicker.kt#uh7d8r");
        if ((i2 + 6) - (i2 | 6) == 0) {
            i3 = (-1) - (((-1) - (composerStartRestartGroup.changed(lazyListState) ? 4 : 2)) & ((-1) - i2));
        } else {
            i3 = i2;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changed(l2) ? 32 : 16)));
        }
        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changed(l3) ? 256 : 128;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            int i4 = composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
            i3 = (i3 + i4) - (i3 & i4);
        }
        if ((ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE + i2) - (196608 | i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(calendarModel) ? 131072 : 65536;
        }
        if ((1572864 + i2) - (1572864 | i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(intRange) ? 1048576 : 524288;
        }
        if ((-1) - (((-1) - 12582912) | ((-1) - i2)) == 0) {
            i3 |= (-1) - (((-1) - 16777216) | ((-1) - i2)) == 0 ? composerStartRestartGroup.changed(datePickerFormatter) : composerStartRestartGroup.changedInstance(datePickerFormatter) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            int i5 = composerStartRestartGroup.changed(selectableDates) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            i3 = (i3 + i5) - (i3 & i5);
        }
        if ((805306368 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(datePickerColors) ? 536870912 : 268435456;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 306783379)) == 306783378 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1257365001, i3, -1, "androidx.compose.material3.VerticalMonthsList (DateRangePicker.kt:767)");
            }
            final CalendarDate today = calendarModel.getToday();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2140145208, "CC(remember):DateRangePicker.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(intRange);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = calendarModel.getMonth(intRange.getFirst(), 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final CalendarMonth calendarMonth = (CalendarMonth) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            TextKt.ProvideTextStyle(TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getDateLabelTextFont(), composerStartRestartGroup, 6), ComposableLambdaKt.rememberComposableLambda(1090773432, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.VerticalMonthsList.1
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

                public final void invoke(Composer composer2, int i6) {
                    ComposerKt.sourceInformation(composer2, "C777@34300L24,778@34366L59,779@34463L55,783@34699L317,808@35694L2317,800@35319L2692:DateRangePicker.kt#uh7d8r");
                    if ((-1) - (((-1) - i6) | ((-1) - 3)) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1090773432, i6, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous> (DateRangePicker.kt:777)");
                    }
                    ComposerKt.sourceInformationMarkerStart(composer2, 773894976, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
                    ComposerKt.sourceInformationMarkerStart(composer2, -954363344, "CC(remember):Effects.kt#9igjgp");
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue2).getCoroutineScope();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    Strings.Companion companion = Strings.Companion;
                    String strM2993getString2EP1pXo = Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(R.string.m3c_date_range_picker_scroll_to_previous_month), composer2, 0);
                    Strings.Companion companion2 = Strings.Companion;
                    String strM2993getString2EP1pXo2 = Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(R.string.m3c_date_range_picker_scroll_to_next_month), composer2, 0);
                    ComposerKt.sourceInformationMarkerStart(composer2, -522190970, "CC(remember):DateRangePicker.kt#9igjgp");
                    boolean zChanged2 = composer2.changed(l2);
                    boolean zChanged3 = composer2.changed(l3);
                    int i7 = ((zChanged2 ? 1 : 0) + (zChanged3 ? 1 : 0)) - ((zChanged2 ? 1 : 0) & (zChanged3 ? 1 : 0)) != 1 ? 0 : 1;
                    boolean zChanged4 = composer2.changed(function2);
                    boolean z2 = (i7 + (zChanged4 ? 1 : 0)) - (i7 & (zChanged4 ? 1 : 0)) == 1;
                    final Long l4 = l2;
                    final Long l5 = l3;
                    final Function2<Long, Long, Unit> function22 = function2;
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (z2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                        objRememberedValue3 = (Function1) new Function1<Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$onDateSelectionChange$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Long l6) {
                                invoke(l6.longValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(long j2) {
                                DateRangePickerKt.updateDateSelection(j2, l4, l5, function22);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    final Function1 function12 = (Function1) objRememberedValue3;
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    final List listCustomScrollActions = DateRangePickerKt.customScrollActions(lazyListState, coroutineScope, strM2993getString2EP1pXo, strM2993getString2EP1pXo2);
                    Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(Modifier.Companion, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.VerticalMonthsList.1.1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setVerticalScrollAxisRange(semanticsPropertyReceiver, new ScrollAxisRange(new Function0<Float>() { // from class: androidx.compose.material3.DateRangePickerKt.VerticalMonthsList.1.1.1
                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Float invoke() {
                                    return Float.valueOf(0.0f);
                                }
                            }, new Function0<Float>() { // from class: androidx.compose.material3.DateRangePickerKt.VerticalMonthsList.1.1.2
                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Float invoke() {
                                    return Float.valueOf(0.0f);
                                }
                            }, false, 4, null));
                        }
                    }, 1, null);
                    LazyListState lazyListState2 = lazyListState;
                    ComposerKt.sourceInformationMarkerStart(composer2, -522157130, "CC(remember):DateRangePicker.kt#9igjgp");
                    int i8 = (composer2.changedInstance(intRange) ? 1 : 0) | (composer2.changedInstance(calendarModel) ? 1 : 0);
                    boolean zChanged5 = composer2.changed(calendarMonth);
                    int i9 = ((-1) - (((-1) - (((i8 + (zChanged5 ? 1 : 0)) - (i8 & (zChanged5 ? 1 : 0)) != 1 ? 0 : 1) | (composer2.changedInstance(datePickerFormatter) ? 1 : 0))) & ((-1) - (composer2.changedInstance(listCustomScrollActions) ? 1 : 0))) != 1 ? 0 : 1) | (composer2.changed(datePickerColors) ? 1 : 0);
                    boolean zChanged6 = composer2.changed(l2);
                    int i10 = ((-1) - (((-1) - ((i9 + (zChanged6 ? 1 : 0)) - (i9 & (zChanged6 ? 1 : 0)) != 1 ? 0 : 1)) & ((-1) - (composer2.changed(l3) ? 1 : 0))) != 1 ? 0 : 1) | (composer2.changed(function12) ? 1 : 0);
                    boolean zChanged7 = composer2.changed(today);
                    boolean zChanged8 = ((i10 + (zChanged7 ? 1 : 0)) - (i10 & (zChanged7 ? 1 : 0)) == 1) | composer2.changed(selectableDates);
                    final IntRange intRange2 = intRange;
                    final CalendarModel calendarModel2 = calendarModel;
                    final CalendarMonth calendarMonth2 = calendarMonth;
                    final Long l6 = l2;
                    final Long l7 = l3;
                    final CalendarDate calendarDate = today;
                    final DatePickerFormatter datePickerFormatter2 = datePickerFormatter;
                    final SelectableDates selectableDates2 = selectableDates;
                    final DatePickerColors datePickerColors2 = datePickerColors;
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (zChanged8 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                        objRememberedValue4 = (Function1) new Function1<LazyListScope, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
                                invoke2(lazyListScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(LazyListScope lazyListScope) {
                                int iNumberOfMonthsInRange = DatePickerKt.numberOfMonthsInRange(intRange2);
                                final CalendarModel calendarModel3 = calendarModel2;
                                final CalendarMonth calendarMonth3 = calendarMonth2;
                                final Long l8 = l6;
                                final Long l9 = l7;
                                final Function1<Long, Unit> function13 = function12;
                                final CalendarDate calendarDate2 = calendarDate;
                                final DatePickerFormatter datePickerFormatter3 = datePickerFormatter2;
                                final SelectableDates selectableDates3 = selectableDates2;
                                final DatePickerColors datePickerColors3 = datePickerColors2;
                                final List<CustomAccessibilityAction> list = listCustomScrollActions;
                                LazyListScope.items$default(lazyListScope, iNumberOfMonthsInRange, null, null, ComposableLambdaKt.composableLambdaInstance(-1413501381, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$2$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(4);
                                    }

                                    @Override // kotlin.jvm.functions.Function4
                                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer3, Integer num2) {
                                        invoke(lazyItemScope, num.intValue(), composer3, num2.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(LazyItemScope lazyItemScope, int i11, Composer composer3, int i12) {
                                        int i13;
                                        SelectedRangeInfo selectedRangeInfo;
                                        ComposerKt.sourceInformation(composer3, "C811@35861L2126:DateRangePicker.kt#uh7d8r");
                                        if ((i12 & 6) == 0) {
                                            i13 = (-1) - (((-1) - i12) & ((-1) - (composer3.changed(lazyItemScope) ? 4 : 2)));
                                        } else {
                                            i13 = i12;
                                        }
                                        if ((-1) - (((-1) - i12) | ((-1) - 48)) == 0) {
                                            i13 |= composer3.changed(i11) ? 32 : 16;
                                        }
                                        if ((-1) - (((-1) - i13) | ((-1) - 147)) != 146 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1413501381, i13, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DateRangePicker.kt:810)");
                                            }
                                            final CalendarMonth calendarMonthPlusMonths = calendarModel3.plusMonths(calendarMonth3, i11);
                                            Modifier modifierFillParentMaxWidth$default = LazyItemScope.fillParentMaxWidth$default(lazyItemScope, Modifier.Companion, 0.0f, 1, null);
                                            Long l10 = l8;
                                            Long l11 = l9;
                                            Function1<Long, Unit> function14 = function13;
                                            CalendarDate calendarDate3 = calendarDate2;
                                            final DatePickerFormatter datePickerFormatter4 = datePickerFormatter3;
                                            SelectableDates selectableDates4 = selectableDates3;
                                            final DatePickerColors datePickerColors4 = datePickerColors3;
                                            final List<CustomAccessibilityAction> list2 = list;
                                            CalendarModel calendarModel4 = calendarModel3;
                                            ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer3, 0);
                                            ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierFillParentMaxWidth$default);
                                            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                            if (!(composer3.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer3.startReusableNode();
                                            if (composer3.getInserting()) {
                                                composer3.createNode(constructor);
                                            } else {
                                                composer3.useNode();
                                            }
                                            Composer composerM3671constructorimpl = Updater.m3671constructorimpl(composer3);
                                            Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                                            Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                                            if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(composer3, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                            ComposerKt.sourceInformationMarkerStart(composer3, 1460125673, "C812@36002L5,812@36009L623,812@35932L700,838@37423L546:DateRangePicker.kt#uh7d8r");
                                            TextKt.ProvideTextStyle(TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getRangeSelectionMonthSubheadFont(), composer3, 6), ComposableLambdaKt.rememberComposableLambda(1622100276, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$2$1$1$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                    invoke(composer4, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer4, int i14) {
                                                    ComposerKt.sourceInformation(composer4, "C817@36237L15,821@36475L45,813@36035L575:DateRangePicker.kt#uh7d8r");
                                                    if ((-1) - (((-1) - i14) | ((-1) - 3)) != 2 || !composer4.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(1622100276, i14, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DateRangePicker.kt:813)");
                                                        }
                                                        String monthYear = datePickerFormatter4.formatMonthYear(Long.valueOf(calendarMonthPlusMonths.getStartUtcTimeMillis()), CalendarLocale_androidKt.defaultLocale(composer4, 0));
                                                        if (monthYear == null) {
                                                            monthYear = Global.HYPHEN;
                                                        }
                                                        Modifier modifierPadding = PaddingKt.padding(Modifier.Companion, DateRangePickerKt.getCalendarMonthSubheadPadding());
                                                        ComposerKt.sourceInformationMarkerStart(composer4, -77497871, "CC(remember):DateRangePicker.kt#9igjgp");
                                                        boolean zChangedInstance = composer4.changedInstance(list2);
                                                        final List<CustomAccessibilityAction> list3 = list2;
                                                        Object objRememberedValue5 = composer4.rememberedValue();
                                                        if (zChangedInstance || objRememberedValue5 == Composer.Companion.getEmpty()) {
                                                            objRememberedValue5 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$2$1$1$1$1$1$1
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
                                                                    SemanticsPropertiesKt.setCustomActions(semanticsPropertyReceiver, list3);
                                                                }
                                                            };
                                                            composer4.updateRememberedValue(objRememberedValue5);
                                                        }
                                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                                        TextKt.m2711Text4IGK_g(monthYear, SemanticsModifierKt.semantics$default(modifierPadding, false, (Function1) objRememberedValue5, 1, null), datePickerColors4.m2032getSubheadContentColor0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 0, 0, 131064);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer4.skipToGroupEnd();
                                                }
                                            }, composer3, 54), composer3, 48);
                                            composer3.startReplaceGroup(2125334733);
                                            ComposerKt.sourceInformation(composer3, "827@36822L488");
                                            if (l10 == null || l11 == null) {
                                                selectedRangeInfo = null;
                                            } else {
                                                ComposerKt.sourceInformationMarkerStart(composer3, 2125337741, "CC(remember):DateRangePicker.kt#9igjgp");
                                                boolean zChanged9 = composer3.changed(l10);
                                                boolean zChanged10 = composer3.changed(l11);
                                                boolean z3 = ((zChanged9 ? 1 : 0) + (zChanged10 ? 1 : 0)) - ((zChanged9 ? 1 : 0) & (zChanged10 ? 1 : 0)) == 1;
                                                Object objRememberedValue5 = composer3.rememberedValue();
                                                if (z3 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                                                    objRememberedValue5 = SelectedRangeInfo.Companion.calculateRangeInfo(calendarMonthPlusMonths, calendarModel4.getCanonicalDate(l10.longValue()), calendarModel4.getCanonicalDate(l11.longValue()));
                                                    composer3.updateRememberedValue(objRememberedValue5);
                                                }
                                                selectedRangeInfo = (SelectedRangeInfo) objRememberedValue5;
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                            }
                                            composer3.endReplaceGroup();
                                            DatePickerKt.Month(calendarMonthPlusMonths, function14, calendarDate3.getUtcTimeMillis(), l10, l11, selectedRangeInfo, datePickerFormatter4, selectableDates4, datePickerColors4, composer3, 0);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            composer3.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }), 6, null);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    LazyDslKt.LazyColumn(modifierSemantics$default, lazyListState2, null, false, null, null, null, false, (Function1) objRememberedValue4, composer2, 0, 252);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2140016818, "CC(remember):DateRangePicker.kt#9igjgp");
            int i6 = (-1) - (((-1) - i3) | ((-1) - 14));
            boolean zChangedInstance = ((-1) - (((-1) - (i6 == 4 ? 1 : 0)) & ((-1) - ((i3 + 57344) - (i3 | 57344) != 16384 ? 0 : 1))) == 1) | composerStartRestartGroup.changedInstance(calendarModel) | composerStartRestartGroup.changedInstance(intRange);
            DateRangePickerKt$VerticalMonthsList$2$1 dateRangePickerKt$VerticalMonthsList$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || dateRangePickerKt$VerticalMonthsList$2$1RememberedValue == Composer.Companion.getEmpty()) {
                dateRangePickerKt$VerticalMonthsList$2$1RememberedValue = new DateRangePickerKt$VerticalMonthsList$2$1(lazyListState, function1, calendarModel, intRange, null);
                composerStartRestartGroup.updateRememberedValue(dateRangePickerKt$VerticalMonthsList$2$1RememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            EffectsKt.LaunchedEffect(lazyListState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) dateRangePickerKt$VerticalMonthsList$2$1RememberedValue, composerStartRestartGroup, i6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.VerticalMonthsList.3
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

                public final void invoke(Composer composer2, int i7) {
                    DateRangePickerKt.VerticalMonthsList(lazyListState, l2, l3, function2, function1, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i2) & ((-1) - 1))));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateDateSelection(long j2, Long l2, Long l3, Function2<? super Long, ? super Long, Unit> function2) {
        if ((l2 != null || l3 != null) && (l2 == null || l3 == null)) {
            if (l2 != null && j2 >= l2.longValue()) {
                function2.invoke(l2, Long.valueOf(j2));
                return;
            } else {
                function2.invoke(Long.valueOf(j2), null);
                return;
            }
        }
        function2.invoke(Long.valueOf(j2), null);
    }

    public static final PaddingValues getCalendarMonthSubheadPadding() {
        return CalendarMonthSubheadPadding;
    }

    /* JADX INFO: renamed from: drawRangeBackground-mxwnekA, reason: not valid java name */
    public static final void m2064drawRangeBackgroundmxwnekA(ContentDrawScope contentDrawScope, SelectedRangeInfo selectedRangeInfo, long j2) {
        float fM4006getWidthimpl;
        float f2 = contentDrawScope.mo710toPx0680j_4(DatePickerKt.getRecommendedSizeForAccessibility());
        float f3 = contentDrawScope.mo710toPx0680j_4(DatePickerKt.getRecommendedSizeForAccessibility());
        float f4 = contentDrawScope.mo710toPx0680j_4(DatePickerModalTokens.INSTANCE.m3162getDateStateLayerHeightD9Ej5fM());
        float f5 = 2;
        float f6 = (f3 - f4) / f5;
        float f7 = 7;
        float fM4006getWidthimpl2 = (Size.m4006getWidthimpl(contentDrawScope.mo4734getSizeNHjbRc()) - (f7 * f2)) / f7;
        long jM2489getGridStartCoordinatesnOccac = selectedRangeInfo.m2489getGridStartCoordinatesnOccac();
        int iM6766getXimpl = IntOffset.m6766getXimpl(jM2489getGridStartCoordinatesnOccac);
        int iM6767getYimpl = IntOffset.m6767getYimpl(jM2489getGridStartCoordinatesnOccac);
        long jM2488getGridEndCoordinatesnOccac = selectedRangeInfo.m2488getGridEndCoordinatesnOccac();
        int iM6766getXimpl2 = IntOffset.m6766getXimpl(jM2488getGridEndCoordinatesnOccac);
        int iM6767getYimpl2 = IntOffset.m6767getYimpl(jM2488getGridEndCoordinatesnOccac);
        float f8 = f2 + fM4006getWidthimpl2;
        float f9 = fM4006getWidthimpl2 / f5;
        float fM4006getWidthimpl3 = (iM6766getXimpl * f8) + (selectedRangeInfo.getFirstIsSelectionStart() ? f2 / f5 : 0.0f) + f9;
        float f10 = (iM6767getYimpl * f3) + f6;
        float f11 = iM6766getXimpl2 * f8;
        if (selectedRangeInfo.getLastIsSelectionEnd()) {
            f2 /= f5;
        }
        float fM4006getWidthimpl4 = f11 + f2 + f9;
        float f12 = (iM6767getYimpl2 * f3) + f6;
        boolean z2 = contentDrawScope.getLayoutDirection() == LayoutDirection.Rtl;
        if (z2) {
            fM4006getWidthimpl3 = Size.m4006getWidthimpl(contentDrawScope.mo4734getSizeNHjbRc()) - fM4006getWidthimpl3;
            fM4006getWidthimpl4 = Size.m4006getWidthimpl(contentDrawScope.mo4734getSizeNHjbRc()) - fM4006getWidthimpl4;
        }
        ContentDrawScope contentDrawScope2 = contentDrawScope;
        long jOffset = OffsetKt.Offset(fM4006getWidthimpl3, f10);
        if (iM6767getYimpl == iM6767getYimpl2) {
            fM4006getWidthimpl = fM4006getWidthimpl4 - fM4006getWidthimpl3;
        } else {
            fM4006getWidthimpl = z2 ? -fM4006getWidthimpl3 : Size.m4006getWidthimpl(contentDrawScope.mo4734getSizeNHjbRc()) - fM4006getWidthimpl3;
        }
        DrawScope.m4728drawRectnJ9OG0$default(contentDrawScope2, j2, jOffset, SizeKt.Size(fM4006getWidthimpl, f4), 0.0f, null, null, 0, 120, null);
        if (iM6767getYimpl != iM6767getYimpl2) {
            for (int i2 = (iM6767getYimpl2 - iM6767getYimpl) - 1; i2 > 0; i2--) {
                DrawScope.m4728drawRectnJ9OG0$default(contentDrawScope2, j2, OffsetKt.Offset(0.0f, (i2 * f3) + f10), SizeKt.Size(Size.m4006getWidthimpl(contentDrawScope.mo4734getSizeNHjbRc()), f4), 0.0f, null, null, 0, 120, null);
            }
            long jOffset2 = OffsetKt.Offset(contentDrawScope.getLayoutDirection() != LayoutDirection.Ltr ? Size.m4006getWidthimpl(contentDrawScope.mo4734getSizeNHjbRc()) : 0.0f, f12);
            if (z2) {
                fM4006getWidthimpl4 -= Size.m4006getWidthimpl(contentDrawScope.mo4734getSizeNHjbRc());
            }
            DrawScope.m4728drawRectnJ9OG0$default(contentDrawScope2, j2, jOffset2, SizeKt.Size(fM4006getWidthimpl4, f4), 0.0f, null, null, 0, 120, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<CustomAccessibilityAction> customScrollActions(final LazyListState lazyListState, final CoroutineScope coroutineScope, String str, String str2) {
        return CollectionsKt.listOf((Object[]) new CustomAccessibilityAction[]{new CustomAccessibilityAction(str, new Function0<Boolean>() { // from class: androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollUpAction$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                boolean z2;
                if (lazyListState.getCanScrollBackward()) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(lazyListState, null), 3, null);
                    z2 = true;
                } else {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            }

            /* JADX INFO: renamed from: androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollUpAction$1$1, reason: invalid class name */
            /* JADX INFO: compiled from: DateRangePicker.kt */
            @InterfaceC1492Gx
            @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
            @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOKb\u0001\u0015\u0007t\u0005\u0013\r\fw\u0012\r\u0016\u0011\u001fx#S\u0014'&($#\n\u001b+)'(}!3)006g8)9756 <\u000e1C9@@v\u0005x\u0007", f = "\u0011-?/\u001b)5-*\u0014,%,%1k(0", i = {}, l = {PhotoshopDirectory.TAG_INDEXED_COLOR_TABLE_COUNT}, m = "8>GA>9(KJH>H?", n = {}, s = {})
            static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ LazyListState $state;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(LazyListState lazyListState, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$state = lazyListState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$state, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        LazyListState lazyListState = this.$state;
                        this.label = 1;
                        if (LazyListState.scrollToItem$default(lazyListState, lazyListState.getFirstVisibleItemIndex() - 1, 0, this, 2, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }
        }), new CustomAccessibilityAction(str2, new Function0<Boolean>() { // from class: androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollDownAction$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                boolean z2;
                if (lazyListState.getCanScrollForward()) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(lazyListState, null), 3, null);
                    z2 = true;
                } else {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            }

            /* JADX INFO: renamed from: androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollDownAction$1$1, reason: invalid class name */
            /* JADX INFO: compiled from: DateRangePicker.kt */
            @InterfaceC1492Gx
            @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
            @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOKb\u0001\u0015\u0007t\u0005\u0013\r\fw\u0012\r\u0016\u0011\u001fx#S\u0014'&($#\n\u001b+)'(}!3)006g8)9756\u000f;D<\u00103E;BBx\u0007z\t", f = "\u0011-?/\u001b)5-*\u0014,%,%1k(0", i = {}, l = {PhotoshopDirectory.TAG_URL_LIST}, m = "8>GA>9(KJH>H?", n = {}, s = {})
            static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ LazyListState $state;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(LazyListState lazyListState, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$state = lazyListState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$state, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        LazyListState lazyListState = this.$state;
                        this.label = 1;
                        if (LazyListState.scrollToItem$default(lazyListState, lazyListState.getFirstVisibleItemIndex() + 1, 0, this, 2, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }
        })});
    }

    static {
        float f2 = 64;
        float f3 = 12;
        DateRangePickerTitlePadding = PaddingKt.m1015PaddingValuesa9UjIt4$default(Dp.m6638constructorimpl(f2), 0.0f, Dp.m6638constructorimpl(f3), 0.0f, 10, null);
        DateRangePickerHeadlinePadding = PaddingKt.m1015PaddingValuesa9UjIt4$default(Dp.m6638constructorimpl(f2), 0.0f, Dp.m6638constructorimpl(f3), Dp.m6638constructorimpl(f3), 2, null);
    }
}
