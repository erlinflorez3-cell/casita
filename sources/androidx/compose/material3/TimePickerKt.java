package androidx.compose.material3;

import androidx.collection.IntList;
import androidx.collection.IntListKt;
import androidx.collection.MutableIntList;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.TimeInputTokens;
import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.iptc.IptcDirectory;
import com.dynatrace.android.agent.Global;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
import kotlin.text.CharsKt;
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
/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яŉ\u0014D߬)\u001e\u007f\u007fLDiv\fA\u001c0\u0013ǞJ~01\u001aw\rmr9>HmH4V[*\u001dq\u00044:[,qI<]\u001a\u0014\"\u0011OdgonP[\u0013C\u001d\u0006\u001eюr,_U\u0001]\u0018\u000f:B\u0006?;M\u0006=A`z9\r H\"@y\u000b\u0002\"*V\u0019~zIV\u0014\u0012F@xíZ\rc\u0005\"\u0012\fD(\u00014\\oN<Mt]P/+ɅqBd'gܞ\u0005M#F\\܋\u0015vw\u001e3¨?5+%[\u0003\rYc?\u0019?y=\u001bh/'1T{WDd\b\u0014\u001b2W\rsr.\\\u000bVh\f=+WcQX\u0016(\u000ez\u0004ȞT9\u001c&?H\\NJl\u000e\u000eA\u0017\u000bSns2bP$\u0013ad\u0016U\u000fAPQ&vSq;Goe\"˿\u0011\u001e)(5\"ǵSו\u05ce\u0019\u001dZ _Zi[Krf\n\b^\u001e\b~\u000e\u001a*2Hw\u0004=().ER}\\ޠ'!y0`gu&\u001d`\u0017t\u001aVVk:nDTZ\r\u001a\u0007\\d3\u0019\u0001Xf\\)MJ\u0006M|ݔ\u0017 j*TL3CfO\u0017\u000b\u001bQk,=/\u0015Z\nry9o9\rPeUqDyR%+o@p5pfp\u0005R[څ,\"@}\u0003#\u00062\\N:4bC\u007f>L,_<#\u0016Ƞ\u0007\u001ePx\u0015$m\u0013\u0001\u0010-uc(\u0011\u0015<t7\u0019\u0001`~\u001c\u007fxwYCaĘ1A_c1Ic[\u00014+D7\u0003\u0002\"_gzj|p$!m{N.J=_[U\u0013=,o3ī1EZ-}\u0001[M?z+\u001b??vY\u007f\b\u0019\u000e\\fpJ]v/\"%\u0002#)\u000ed\u000e&yF)t\u0014X\u0019\fVI!4 ;ҡ<|\u0013[6`\u000f-:|cNs++8\u0010\u0014]8\u0012aw\u001bFy\u0011'Vxs0DcD\u001d\u0013UkpS8w\u0019/B0d\u0005\u0003p\n\u001b{\u0016\u0005!4;t\u000fBяtVF\u0011#V\f+\u001f,;\u0012\u0007_H>\b}bF\u00100yC\f6vCS4}Ymm{wt\u000bx<P\u0010֭5n aUCd\u001ez\t^'$\u001cDcSb3_9(BXT\b9p\u0005m\u0014;\u0013\u007ftwU\u0018ЋFsI\u001e&\u000b\u0007%nH3\u0002ud/U\u0019~=KN~;1\u0013\u0010^T]\u0007b\u0007Y\u001d\u0017G\u0003O-\u0014U1JTGd@X/U\fbǖH\u0379\u0530\bI/9y<$V&J5BF3iU\u001f.\u000f0\r\"\u0006h\\4\u000f\u0012\u0015i~&7O\u0013|<mP\u0014#y]D\bb[m~{Ee2\u0001EgY\u000b\u001a1{FI\u007f6E;\u0011av$)\fW\u0002\u000e\u000e\n0 U%#u\r[\u001c\u0012\"]IRFu$8\u001a\tA'P\n4J\u0003J\".6\u000f\u007f\b9\u0002!8qk&{p+9\u0019\u001eBy\u0016?\u000bˡk̙߾Y\r\tB?3\u0012';.5\tUn^\u0017f|R\u0011\u0002C\t\u0015\u000eH-&MM8f7;gc\u0017\t\u001cSibC/\u001a\u0001\u00125>~6}M'<\u0005חSӏנ?XS\u001drht<P8&^\u0019I\u0015x\u001a\u000b,|-y\u000f\u0015!\u0017^rL&_A'\u0003s\u0013Wb\u0017\u0004sjTGaVMGO29\u001dX\u0011\u001f(Rx\u0005\u0002:B7W\u0010i<-tuknž]$s\f݁*KK\u001e\t\tЗ\u0015\u000e\u001f\u0016rS.&t\u001aJ\\\u00027OD)\u0001CP6s\u0015EMj\u007f\u0001k+ʫ\u0001\u0001\u001bm\u0012Ty#\f7!D_\u0013}=ofiHeiZR$\u0002\u0014b/Qq\u0003'aZv{Fɭ}UN:\"N2\u000e\u001euQ!u5VUw\\ns$]\n&8X\u0007DQj\u001d~y\n:\u00160s\u0013\t\u00128O+,\u0019rop,ď\u000bE[%\u0012!Rw]\u0014e\u00156-A\u0003\u0015\u0010}wp/W_e/\u000bc\u0003\u0013\f*H y6(Mp]8tE\u0012\u0003i\u001bn{Aw\u0010f\u0018=\u0011\u0012hIR\u000f\u0017\u0011!&\u0019cvtM#xeip}X\u000fRR^F\u001a`\u001e\u0016\\\u001fG\u0006\f\u001bx\u0015AdwwO<*V*8c\u0010ټ$̵ɚklM5chpfG+#mxpekb\u0005cocdY,0p1.U&V\u001aXo6\u0014KdV`\\xrY45߳4P\rS[<\u000f\u00167=\u00046\u0016\u0003@8O[\u0013g[;e\u001ajUQE)\u0006\u0011DY\u0019A]NWG-;s;\u0004n\u007f\u0016XaU+\u0005y0\u0011^b=?\u0018O?o\u001eгZpE\u0017gF\u0005ǌ\u001f7&\f\u0019J\u0017w\u0015y\u000eP\u00011!|V̰GÁá\u0015jHت\u000e\tǡ\u000bF'F˕\u0005U\u0006?\u0006D5i\u0003p0<\u001c!G}\b,.s\u001c~t\bz\f+\u000eSLѽp)c}\u0001<n\u007ft\tB%D>@A\bJ!4M\u0014HW6GZqݝi\fT\u000f\u0017\n:yƅc\u0012s\u0015ͫ=*>ΚGԯæjS\u0004ܷPRЈ\bx4Vű\u000fzlZH^H\u001961\u0005YN/\u0014eJ''u\u001fR\"\u0010(\u0004b3ϙI\u001e\u000e\u0019g(\u0019\n\u000eK6;!\\\u0003#Ѧ=~s2ȧ\u0004\u0014۽BЈ.Ȋծ^D\"ޛY5шg >\u001c۶{\u001d,\u001dvzQ$B#i\rԋ\u001d2A\u0006j\u000e\"3\u0011'ڽ 2{WQяZ\u05f9)0\u0004\u0006-\u0012b\nCmYs*2.ŶQ͇a 1}ww@\u001by\u0014\u001ccx\"&مdˆa0Uw\u0015Y\\eO\u0005\"\"W(^ż)݀L4RޞB/\u000f\u0014N\u0018xlEݳw߲i\f7۲\u0016\u001a@tVs\u0015c>ҡ\u0014ȒY]\u0007ЧM;\u007f\u0010cI\u001c\u0003\u0002º\u0010ʋ\u001a:Wع\u000e\u0004iFl\u0016`\u0006Fʂ3֬wbcB%w(pBuR{u\u0002jӶMӼ\u001e\\nnzvpo\u001eH.\rB\u0004\u0015خ+ʤD'g`u\u007f[\u0015~)OQshaӁ\u0013܃d2Fҁ/Vfs&\u001b0\u0004\"֭\u001cӔ=G\u0001@Y\u0015{\u0012uqi\"\u0016GBԴ1ޣ{\u0018>\u001d\u000e5Y\u0019\u0002_v5\u0016n_\u0530uǢ+nWȫ\u0012<@XuZN52א`ϘjLX֊a\u0013z@\u000fv!\u001d\u0016ʒTȪI\"%ۻ\u0006%u\u0018Nlic?Ʋ7Ҧ\"ncЉG>\f\u001a9\u0013o\u001el̹&Ԃ\u0004vc4]u!NV($\u001aq-^ä\u0007\u0087P\u0007=\nO1_i~/Cw\u000euj\u0005;=WfaĜ*ߜp\u0017\b\u0017.;Q-\u00171{$(\u001cwA1-\u007f\u00141X\tԄ\"ڹ\u0014C\"\u0015h|\u0006\u001f̆I58v\u000fۭh\u001c|ҭnйičb\u0019]Ӟ;u~&g\u001c̹Ԫ&\u0380?\u001dpǝC?[V\u0017mҩٻ\u001fۭ(;\u001aɫ/3\\\u0017PFٛǧb۲d>|ρWX6YŇ\u007f|ݳ˟\t֒a5\"ŬXmG\u0013ݷeM\u0602غ\u0012"}, d2 = {"\u0011k^0^\u000bBa$\u0006vr\t\u0007\u0018>o\b\u0010wM\u0003\u001b ", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "\u0014", "\u0011k^0^\r:Q\u0019[\u0005m;\u0007\u0011\u0017a\r*\u007fI", "\u0012hb=_(RA\u0019\nvk(\f\u0013<W\u0004'\u000bC", "\u0013wc?T\u000fHc&\r", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nd &.s\u001cKL", "\u0014t[960KQ ~", "", "\u0016`[360KQ ~", "\u0016nd?f", "\u0017m]2e\nB`\u0017\u0006zK({\r?s", "\u001b`g\u0011\\:MO\"|z", "\u001bh]6`<F7\"\u000ezk(z\u00183v\u007f\u0016\u007fU\u0001", "\u001bh]Bg,L", "\u001dtc2e\nB`\u0017\u0006zL0\u0012\t\u001ca~,\fN", "\u001eda6b+-]\u001b\u0001\u0002^\u0014x\u00161i\t", "\u001ftP?g,K1\u001d\fxe,", "", " `S6T5L>\u0019\f]h<\n", " `S6T5L>\u0019\fbb5\r\u0018/", "!d_.e(M]&s^g+|\u001c", "!t_=b9M:\u0015{ze\u001b\u0007\u0014", "\"h\\2<5Ic([\u0005m;\u0007\u0011\u001aa~'\u007fI\u0003", "6nd?96K2\u001d\r\u0006e(\u0011", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e)=Yh$5s\u0016;;R7z4s", "5dc\u0015b<K4#\fYb:\b\u0010+y", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u00149a}\u000b;k\u001c.Z1JgC\u001ej,E", "Ad[2V;H`\u0004\t\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lG`&6g}/\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006R.1`\b\"&q\u001e.8G9q4+\u0003w]H\u00079", "5dc X3>Q(\t\bI6\u000b", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0001>U\u0005*9\\\u001a6M.?i:\u001e\"Vp5\u0016c\u0002\u0012[", "\u0011ha0h3:`\u007fz\u000fh<\f", "", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "@`S6h:", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "\u0011ha0h3:`\u007fz\u000fh<\fP?F~\u0013y$l", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b:d&A|\u001d2V\r@|<g\u0016xj7\u0016g6W\u0005p(\\W*kV|F`gA\nW*\u001a\u000f]@78BA'\u00136W\u0002\u0005u\u0011\u0015%\u0012=j: `\u0018R\u0004#uN~L*\u001dP", "\u0011k^0^\u000bBa$\u0006vr\u0015\r\u0011,e\r6", "AsPAX", "1n[<e:", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e)=Yh$5s\u0016;+MBuA,j", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u00149a}\u000b;k\u001c.Z1JgC\u001ejO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\u001aV\u001dN8\u0011\u0001`\u000fm]H?\u001fr0G\b;u^\u0016\u001d\u0018BxF)R\u0019F\u0007\u001fy@<2Dcg\u0005QOE,7t\u0015n!d:\u0004\u0002\u001ey$%vP;__\u0017\u0002", "\u0011k^0^\r:Q\u0019", "/tc<F>Bb\u0017\u0002ih\u0014\u0001\u0012?t\u007f", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0001>U\u0005*9\\\u001a6M.?i:\u001e\"Vp5\u0016c\u00025r0FYX0[e<;\u001e\u001ae\u0018\\+V\rUP${H3&Uu8\u0006Chk\u0010\u0014\u00145wNL]\u001aT\bjj(%qEfi}FT\u000f`4l\u0017i+\\\u0004G4\u001d\u0001\u001d#h\u001a\f\u0014\u0004^\u001b\u0001R\u0007=K\u000b\n", "\u0011k^0^\u001b>f(", "D`[BX", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@y)6z 2LV\u0005i>& ro9Pk(]v4KHUy&.{9\u001b\u001c\\|R3\ro]?*nQ%.\u0004;IW\u001f]g\b\u001f\rBttAiYE\u0004\u001d\u0001K7h\u0010fo\u0003VEMbsB\u0016g(fH:1iU\\\f", "\u0012hb=_(RA\u0019\nvk(\f\u0013<", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@y)6z 2LV\u0005i>& ro9Pp<W\u0006+OL\u0018\nfZ}G\"\u0012gc2n}", "\u0016na6m6Gb\u0015\u0006Xe6z\u000f\u000ei\u000e3\u0003<\u0015", "\u0016na6m6Gb\u0015\u0006e^9\u0001\u0013.T\n*}G\u0001", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@y)6z 2LV\u0005i>& ro9Pk(]v4KHUy&AvE\u0014|^\fT+\u001arh=3n\u001a\u001e\u001b\u0011+V\f?g\u0014U\u0014\u0018=uzPVYOu$uN-dM')hKIEM.b\u0012_*:DA.!\u007fn\u0002dY-\u0017\u0006W\u0010\u0006\u001cwqoR#\t8mK}dUIwU\u0006R1'V\u0006\u0006\u0012?.Xne", "\u0016na6m6Gb\u0015\u0006ib4|s3c\u0006(\t", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0001>U\u0005*9\\\u001a6M.?i:\u001e\"Vp5\u0016c\u00025r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0015]\u000b\fxC; \f,VW\"d\n\u000b#\u00189i\u0004\fT\u001aO\u0005\u001f\u0004ArpBh_\u0007K=L0sS\u0010g\u001dG>8*\u0014~v%oZ;\u0018QHwn[xtqK\u0018\u000e\u0002\"HufPSo\u001fI\u00050.O\u0004w[\u0010b|6~;\u0004A\u007f\u001aHH<", "\u001eda6b+-]\u001b\u0001\u0002^\u0010\u0005\u00146", ";dP@h9>>#\u0006~\\@", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7X 5QAOA", "AsP?g\u001aAO$~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "3mS [(IS", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@y)6z 2LV\u0005i>& ro9Pk(]v4KHUy&AvE\u0014|^\fT+\u001arh=3n\u001a\u001e\u001b\u0011+V\f?g\u0014U\u0014\u0018=uzPVYOu$uN-dM')hKIEM.b\u0012_*:DA.!\u007fn\u0002dY-\u0017\u0006W\u0010\u0006\u001cwqoR#\t8mNq%MA\u0004_L\u0004p\u0007Kw\u0006\"?X_5{1\u0002H\u007f\u001d`\u000eJt\"B]\f^*fI20D<\\OO-wy:\u0019k#_\u0016WP8-$e;JD\u0018\u0006j!_4t)~AZ\u0011HWo^7JHDhu \f\u000b\"{/7F\u0017_\u0001oW@+^\u001e\r\u0007e+e, Ed\u0019v*)D]\u001c\u0018l@\fE7M\u001d{R\u001emXH?\u001b`", "\"h\\2<5Ic(", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u00149a}\u000b;k\u001c.Z1JgC\u001ejO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\"^W65\f\tZE${\u001a\u001e\u001b\u0011+V\f?g\u0014U\u0014\u0018=uzPVYOu$uN-dM')hKIEM.b\u0012_*:DA.!\u007fn\u0002dY-\u0017\u0006W\u0010\u0006\u001cwqoR#\t8mK}dUIwU\u0006R1'V\u0006\u0006\u0012?.X\u000f8\u001e", "\"h\\2<5Ic(b\u0003i3", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@y)6z 2LV\u0005i>& ro9Pk(]v4KHUy&AvE\u0014|^\fT+\u001abcH.{R\r\u0006\u00045H\u000fEl\u007f\u001f_\f?r{Ld\u0010\u0011\u0002\u0011\u0005A6lB`-C6EMb\u0015h\ne\u001di(I #qn\u0002dY-\u0017\u0006W\u0010\u0006\u001cwqoR#\t8mK}dUIwU\u0006R1'V\u0006\u0006\u0012?.Xne", "\"h\\2C0<Y\u0019\f", ":`h<h;-g$~", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e)=Yh$5s\u0016;4?OuD-\u0004|l9\\", "\"h\\2C0<Y\u0019\fBf\u001bPe@qk", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u00149a}\u000b;k\u001c.Z1JgC\u001ejO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\"^W65\f\tZE${\u001a\u001e\u001b\u0011+V\f?g\u0014U\u0014\u0018=uzPVYOu$uN-dM')hKIEM.b\u0012_*:DA.!\u007fn~OL7\t\t]\u0015qeCeqO$\u0005F$\bzkOTs]<>\u0005)S\u0007\u0002 2eJ\u000fXpt", "\"h\\2C0<Y\u0019\fhm(\f\t", "7mXA\\(E6#\u000f\b", "7mXA\\(E;\u001d\b\u000bm,", "7r!\u0001;6N`", "\"h\\2C0<Y\u0019\fi^?\fi3e\u0007'", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#l J|v2MJ:\\0%%h7", "=mE._<>1\u001cz\u0004`,", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "Ad[2V;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e)=Yh$5s\u0016;;CBk2-\u0019rj!\u0011b,$", "9dh/b(KR\u0003\n\nb6\u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri\u001dm*+W?Hj\u001e)$lkB\u00159", "9dh/b(KRt|\nb6\u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri\u001dm*+W?Hj\u0010\u001c$lkB\u00159", "\"h\\2C0<Y\u0019\fi^?\fi3e\u0007'C\f\u0012}\u0001D}\u0014", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@y)6z 2LV\u0005i>& ro9Ps0\u0018\u0006'Z[\u00180e]\u0003L]\u0001Z!]\f\u0011\u0005`@\u0015jKG\u001f]\u0013O\fJo\u0005\u0015_\u0013Fr:Cf\u0019E\t\u0019\u007fJ72'ihwVEOku:r[&[GD(\u0013\u0005b\u0019rX9\u0014\nSZzN\tgtK\u0015\u0002\u0006m-qcF0sSBt4\rZw\u0007\u0012\b<['},\u0011>.5wNIq Ih\u0007\u0015u]K7/58\"CUl?{>!whG\b\"_?-&dOnW\u0013\u0011f%1\u001c]h\u007fD\\\n=\\9\u00131N\nLiy^\n\u00114vdER\u001f^\nc\u007fD5nZh\u0003z\u0015&*#<5\rw.i@[hodA\u000b\tcG\u0014\u0004\u0012\u000ewS}eeom>t I.7GCD\u001c2s\u0018\u0016\u001f\u0005\t\u0005\u001d\u0001GL\u0001@ 3z$UAam9\u000fffk\u0017q@');1K_Pwm{/\u0015Gkr\u0005 gL8\u000f\t%-.\u0013", "\"h\\2F,ES\u0017\u000e\u0005k", "\"h\\2F,ES\u0017\u000e\u0005ksjd8M\u007f\u000ek", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b=d\u001c@l#8QBN52(\u001dskG\u0007-4J\u0006'TPJ3*\u001caA\u001c\u0012E\u0012L1\r\u0012GP }D\r\u0003n(R\u0001Hr\u0005\u000b)W3txM`\u001eGC\u001dqP)uJUfG\u00110Ij*O\u0010]#\\G\u0018.\u001b{&)>7*\u0013z`\u001bvQ\r1eQ!\u0006B2>7hVN~YDtp|U\u0004\u0003\u001c@X\u0002\u0001Xpt", "\"nV4_,\"b\u0019\u0007", "1gT0^,=", "AgP=X", "=m29\\*D", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u00038_19u?\u001ej", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uY;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#k#3x\u0016\u00044IEz;\"\u001e2fJ\u000f--^\u007f%VPX5j\u001cSM\u001d\u0010i\u0012X4WZ@=-mQA#\u0007?\u0013\u007fEp\f\u0016$\u000e~rlQV\u001dKu\u001cC\u000b\u0018lNYJ}EGEo\bn\u0013i*j\u0010!*\u001e\u0001 \u001fq\u001a3\u001b\u0004\u001d\u0012\u0003[wvkQ\"\t\u0002\u0005NvYUIy^\nJ\u000e\u001bTz\u0005\u001c6W\btr7\f?4DdNXw!Mb\u0001\u0015u:K/1@J\u0013L!G9]", "$daA\\*:Zv\u0006\u0005\\2[\r=p\u0007$\u0010", "$daA\\*:Z\u0004~\bb6{w9g\u0002/{", "$daA\\*:Z\b\u0003\u0003^\u0017\u0001\u00075e\r", "/sP;", "G", "F", "2hbA", "F0", "G0", "F1", "G1", "<t\\/X9\u001c]\"\u000ezg;[\t=c\r,\u0007O\u0005! ", "", "<t\\/X9", "<t\\/X9\u001c]\"\u000ezg;[\t=c\r,\u0007O\u0005! \u000fn{Nj$#(", "uHI\u0016?(GR&\t~]?F\u00079m\u000b2\n@J$'P~\u0012Dvn\u0013c\u0006+A{\u0016;#'~R9\u001a&d+@\u0003l.\u0018d6TPW.2", "@d\\2`)>`\b\u0003\u0003^\u0017\u0001\u00075e\r\u0016\u000b<\u0010\u0017", "uH8'?(GR&\t~]?F\u00079m\u000b2\n@J$'P~\u0012Dvn\u0013c\u0006+A{\u0016;#'\u001f/\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001cz9#\u0012g\u0012J2ZNHE,n/;\u001d\u000e,VoJd\u0010\fk", "Bh\\2<5Ic(h\u0004</x\u00121e", ">qTCI(Ec\u0019", ";`g", "=m=2j\u001d:Z)~", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "Bh\\2<5Ic(h\u0004</x\u00121eG=M3\u0012'\u00023", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDn$]\u0006 \"q\u00144MP)z0-\u0015>H5\u0010b9Xz&Z\u0016L6d]|K\u0014[j\u0012\u0018:\r\u0018h\u000b(wOG.Q\u001bI\u0015JI\u0005\f\u001d\r&fwRVe.u\u001etN3lEl)wQIPl8dUo!&I:7#;\u001d$s`=SjS$\u00023}gnF\nv?4>C?-KydCx0hP\r\u007f[3h})\u00041\u000e=8\u007fE\u0015Te'Bh\u0002`\u0002 2", "2qPDF,ES\u0017\u000e\u0005k", ";ne2F,ES\u0017\u000e\u0005k", ";`g\u0011\\:M", "1d]AX9", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", ";ne2F,ES\u0017\u000e\u0005ks{V,8j;\u0006", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u00149a}\u000b;k\u001c.Z1JgC\u001ejIB\u001ak'\u001d", "=mC.c", "=mC.csK=+|h;6", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0001>U\u0005*9\\\u001a6M.?i:\u001e\"Vp5\u0016c\u0002/W\b<152fayA\u001d[X\u0018[5\u001d\u0014]J$|\u000e\u0015)\u0011;M\u000bKd\u0010\u0010 \u0017\u000b.WGR!CC\u001cqJ+20VdyEP\u001b", "Dhb6U3>", ";`c2e0:Zfx\b^3|\u0005=e", "/0 FF,Kd\u001d|zl\f\u0006\u0005,l\u007f'", "6nd?I(Ec\u0019", ";h]Bg,/O \u000fz", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", ">`a2a;\u001cS\"\u000ezk"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TimePickerKt {
    private static final float ClockFaceBottomMargin;
    private static final float DisplaySeparatorWidth;
    private static final IntList ExtraHours;
    private static final float FullCircle = 6.2831855f;
    private static final float HalfCircle = 3.1415927f;
    private static final IntList Hours;
    private static final float PeriodToggleMargin;
    private static final double QuarterCircle = 1.5707963267948966d;
    private static final float RadiansPerHour = 0.5235988f;
    private static final float RadiansPerMinute = 0.10471976f;
    private static final float SeparatorZIndex = 2.0f;
    private static final float TimeInputBottomPadding;
    private static final float OuterCircleSizeRadius = Dp.m6638constructorimpl(101);
    private static final float InnerCircleRadius = Dp.m6638constructorimpl(69);
    private static final float ClockDisplayBottomMargin = Dp.m6638constructorimpl(36);
    private static final float SupportLabelTop = Dp.m6638constructorimpl(7);
    private static final float MaxDistance = Dp.m6638constructorimpl(74);
    private static final float MinimumInteractiveSize = Dp.m6638constructorimpl(48);
    private static final IntList Minutes = IntListKt.intListOf(0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55);

    /* JADX INFO: renamed from: androidx.compose.material3.TimePickerKt$ClockDisplayNumbers$2 */
    /* JADX INFO: compiled from: TimePicker.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TimePickerColors $colors;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(TimePickerColors timePickerColors, int i2) {
            super(2);
            timePickerColors = timePickerColors;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            TimePickerState timePickerState = timePickerState;
            TimePickerColors timePickerColors = timePickerColors;
            int i3 = i;
            TimePickerKt.ClockDisplayNumbers(timePickerState, timePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags((i3 + 1) - (i3 & 1)));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.TimePickerKt$ClockFace$2 */
    /* JADX INFO: compiled from: TimePicker.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C07002 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ boolean $autoSwitchToMinute;
        final /* synthetic */ TimePickerColors $colors;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07002(TimePickerColors timePickerColors, boolean z2, int i2) {
            super(2);
            timePickerColors = timePickerColors;
            z = z2;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            TimePickerKt.ClockFace(analogTimePickerState, timePickerColors, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.TimePickerKt$ClockText$4 */
    /* JADX INFO: compiled from: TimePicker.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass4 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ boolean $autoSwitchToMinute;
        final /* synthetic */ AnalogTimePickerState $state;
        final /* synthetic */ int $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(AnalogTimePickerState analogTimePickerState, int i2, boolean z2, int i3) {
            super(2);
            analogTimePickerState = analogTimePickerState;
            i = i2;
            z = z2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            TimePickerKt.ClockText(modifier, analogTimePickerState, i, z, composer, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.TimePickerKt$DisplaySeparator$3 */
    /* JADX INFO: compiled from: TimePicker.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass3 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(int i2) {
            super(2);
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            TimePickerKt.DisplaySeparator(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.TimePickerKt$HorizontalClockDisplay$2 */
    /* JADX INFO: compiled from: TimePicker.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C07022 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TimePickerColors $colors;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07022(TimePickerColors timePickerColors, int i2) {
            super(2);
            timePickerColors = timePickerColors;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            TimePickerKt.HorizontalClockDisplay(timePickerState, timePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.TimePickerKt$HorizontalPeriodToggle$1 */
    /* JADX INFO: compiled from: TimePicker.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C07031 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TimePickerColors $colors;
        final /* synthetic */ TimePickerState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07031(TimePickerState timePickerState, TimePickerColors timePickerColors, int i2) {
            super(2);
            timePickerState = timePickerState;
            timePickerColors = timePickerColors;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            Modifier modifier = modifier;
            TimePickerState timePickerState = timePickerState;
            TimePickerColors timePickerColors = timePickerColors;
            int i3 = i;
            TimePickerKt.HorizontalPeriodToggle(modifier, timePickerState, timePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags((i3 + 1) - (i3 & 1)));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.TimePickerKt$HorizontalTimePicker$2 */
    /* JADX INFO: compiled from: TimePicker.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C07042 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ boolean $autoSwitchToMinute;
        final /* synthetic */ TimePickerColors $colors;
        final /* synthetic */ Modifier $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07042(Modifier modifier, TimePickerColors timePickerColors, boolean z2, int i2, int i3) {
            super(2);
            modifier = modifier;
            timePickerColors = timePickerColors;
            z = z2;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            TimePickerKt.HorizontalTimePicker(analogTimePickerState, modifier, timePickerColors, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.TimePickerKt$PeriodToggleImpl$3 */
    /* JADX INFO: compiled from: TimePicker.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C07053 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TimePickerColors $colors;
        final /* synthetic */ Shape $endShape;
        final /* synthetic */ MeasurePolicy $measurePolicy;
        final /* synthetic */ Shape $startShape;
        final /* synthetic */ TimePickerState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07053(TimePickerState timePickerState, TimePickerColors timePickerColors, MeasurePolicy measurePolicy, Shape shape, Shape shape2, int i2) {
            super(2);
            timePickerState = timePickerState;
            timePickerColors = timePickerColors;
            measurePolicy = measurePolicy;
            shape = shape;
            shape = shape2;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            TimePickerKt.PeriodToggleImpl(modifier, timePickerState, timePickerColors, measurePolicy, shape, shape, composer, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.TimePickerKt$TimeInput$1 */
    /* JADX INFO: compiled from: TimePicker.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C07061 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ TimePickerColors $colors;
        final /* synthetic */ Modifier $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07061(Modifier modifier, TimePickerColors timePickerColors, int i2, int i3) {
            super(2);
            modifier = modifier;
            timePickerColors = timePickerColors;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            TimePickerState timePickerState = timePickerState;
            Modifier modifier = modifier;
            TimePickerColors timePickerColors = timePickerColors;
            int i3 = i;
            TimePickerKt.TimeInput(timePickerState, modifier, timePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags((i3 + 1) - (i3 & 1)), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.TimePickerKt$TimeInputImpl$2 */
    /* JADX INFO: compiled from: TimePicker.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C07072 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TimePickerColors $colors;
        final /* synthetic */ TimePickerState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07072(TimePickerColors timePickerColors, TimePickerState timePickerState, int i2) {
            super(2);
            timePickerColors = timePickerColors;
            timePickerState = timePickerState;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            TimePickerKt.TimeInputImpl(modifier, timePickerColors, timePickerState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.TimePickerKt$ToggleItem$2 */
    /* JADX INFO: compiled from: TimePicker.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C07082 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ boolean $checked;
        final /* synthetic */ TimePickerColors $colors;
        final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;
        final /* synthetic */ Function0<Unit> $onClick;
        final /* synthetic */ Shape $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C07082(boolean z2, Shape shape, Function0<Unit> function0, TimePickerColors timePickerColors, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, int i2) {
            super(2);
            z = z2;
            shape = shape;
            function0 = function0;
            timePickerColors = timePickerColors;
            function3 = function3;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            TimePickerKt.ToggleItem(z, shape, function0, timePickerColors, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.TimePickerKt$VerticalClockDisplay$2 */
    /* JADX INFO: compiled from: TimePicker.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C07092 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TimePickerColors $colors;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07092(TimePickerColors timePickerColors, int i2) {
            super(2);
            timePickerColors = timePickerColors;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            TimePickerKt.VerticalClockDisplay(timePickerState, timePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.TimePickerKt$VerticalPeriodToggle$1 */
    /* JADX INFO: compiled from: TimePicker.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C07101 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TimePickerColors $colors;
        final /* synthetic */ TimePickerState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07101(TimePickerState timePickerState, TimePickerColors timePickerColors, int i2) {
            super(2);
            timePickerState = timePickerState;
            timePickerColors = timePickerColors;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            Modifier modifier = modifier;
            TimePickerState timePickerState = timePickerState;
            TimePickerColors timePickerColors = timePickerColors;
            int i3 = i;
            TimePickerKt.VerticalPeriodToggle(modifier, timePickerState, timePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags((i3 + 1) - (i3 & 1)));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.TimePickerKt$VerticalTimePicker$3 */
    /* JADX INFO: compiled from: TimePicker.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C07123 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ boolean $autoSwitchToMinute;
        final /* synthetic */ TimePickerColors $colors;
        final /* synthetic */ Modifier $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07123(Modifier modifier, TimePickerColors timePickerColors, boolean z2, int i2, int i3) {
            super(2);
            modifier = modifier;
            timePickerColors = timePickerColors;
            z = z2;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            TimePickerKt.VerticalTimePicker(analogTimePickerState, modifier, timePickerColors, z, composer, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0157  */
    /* JADX INFO: renamed from: TimePicker-mT9BvqQ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m2738TimePickermT9BvqQ(final androidx.compose.material3.TimePickerState r17, androidx.compose.ui.Modifier r18, androidx.compose.material3.TimePickerColors r19, int r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.m2738TimePickermT9BvqQ(androidx.compose.material3.TimePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.TimePickerColors, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void TimeInput(androidx.compose.material3.TimePickerState r12, androidx.compose.ui.Modifier r13, androidx.compose.material3.TimePickerColors r14, androidx.compose.runtime.Composer r15, int r16, int r17) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.TimeInput(androidx.compose.material3.TimePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.TimePickerColors, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final TimePickerState rememberTimePickerState(final int i2, final int i3, final boolean z2, Composer composer, int i4, int i5) {
        ComposerKt.sourceInformationMarkerStart(composer, 1237715277, "C(rememberTimePickerState)572@28878L14,575@29014L185,575@28960L239:TimePicker.kt#uh7d8r");
        if ((i5 + 1) - (i5 | 1) != 0) {
            i2 = 0;
        }
        if ((i5 + 2) - (i5 | 2) != 0) {
            i3 = 0;
        }
        if ((i5 & 4) != 0) {
            z2 = TimeFormat_androidKt.is24HourFormat(composer, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1237715277, i4, -1, "androidx.compose.material3.rememberTimePickerState (TimePicker.kt:573)");
        }
        Object[] objArr = new Object[0];
        Saver<TimePickerStateImpl, ?> Saver = TimePickerStateImpl.Companion.Saver();
        ComposerKt.sourceInformationMarkerStart(composer, -1964549601, "CC(remember):TimePicker.kt#9igjgp");
        int i6 = (-1) - (((-1) - ((-1) - (((-1) - ((((((i4 + 14) - (14 | i4)) ^ 6) <= 4 || !composer.changed(i2)) && (-1) - (((-1) - i4) | ((-1) - 6)) != 4) ? 0 : 1)) & ((-1) - ((((((i4 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (112 | i4)) ^ 48) <= 32 || !composer.changed(i3)) && (i4 + 48) - (48 | i4) != 32) ? 0 : 1))))) & ((-1) - ((((((-1) - (((-1) - i4) | ((-1) - 896))) ^ BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) > 256 && composer.changed(z2)) || (i4 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i4 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 256) ? 1 : 0)));
        Object objRememberedValue = composer.rememberedValue();
        if (i6 != 0 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = (Function0) new Function0<TimePickerStateImpl>() { // from class: androidx.compose.material3.TimePickerKt$rememberTimePickerState$state$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final TimePickerStateImpl invoke() {
                    return new TimePickerStateImpl(i2, i3, z2);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        TimePickerStateImpl timePickerStateImpl = (TimePickerStateImpl) RememberSaveableKt.m3764rememberSaveable(objArr, (Saver) Saver, (String) null, (Function0) objRememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return timePickerStateImpl;
    }

    public static final TimePickerState TimePickerState(int i2, int i3, boolean z2) {
        return new TimePickerStateImpl(i2, i3, z2);
    }

    public static final int getHourForDisplay(TimePickerState timePickerState) {
        if (timePickerState.is24hour()) {
            return timePickerState.getHour() % 24;
        }
        if (timePickerState.getHour() % 12 == 0) {
            return 12;
        }
        return timePickerState.isAfternoon() ? timePickerState.getHour() - 12 : timePickerState.getHour();
    }

    /* JADX INFO: renamed from: moveSelector-d3b8Pxo */
    public static final void m2747moveSelectord3b8Pxo(TimePickerState timePickerState, float f2, float f3, float f4, long j2) {
        if (TimePickerSelectionMode.m2765equalsimpl0(timePickerState.mo1776getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m2769getHouryecRtBI()) && timePickerState.is24hour()) {
            timePickerState.setAfternoon(dist(f2, f3, IntOffset.m6766getXimpl(j2), IntOffset.m6767getYimpl(j2)) < f4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c4  */
    /* JADX INFO: renamed from: onTap-rOwcSBo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m2749onTaprOwcSBo(androidx.compose.material3.AnalogTimePickerState r15, float r16, float r17, float r18, boolean r19, long r20, kotlin.coroutines.Continuation<? super kotlin.Unit> r22) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.m2749onTaprOwcSBo(androidx.compose.material3.AnalogTimePickerState, float, float, float, boolean, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final long getSelectorPos(AnalogTimePickerState analogTimePickerState) {
        float f2;
        float f3 = 2;
        float fM6638constructorimpl = Dp.m6638constructorimpl(TimePickerTokens.INSTANCE.m3559getClockDialSelectorHandleContainerSizeD9Ej5fM() / f3);
        if (analogTimePickerState.is24hour() && analogTimePickerState.isAfternoon() && TimePickerSelectionMode.m2765equalsimpl0(analogTimePickerState.mo1776getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m2769getHouryecRtBI())) {
            f2 = InnerCircleRadius;
        } else {
            f2 = OuterCircleSizeRadius;
        }
        float fM6638constructorimpl2 = Dp.m6638constructorimpl(Dp.m6638constructorimpl(f2 - fM6638constructorimpl) + fM6638constructorimpl);
        return DpKt.m6659DpOffsetYgX7TsA(Dp.m6638constructorimpl(Dp.m6638constructorimpl(((float) Math.cos(analogTimePickerState.getCurrentAngle())) * fM6638constructorimpl2) + Dp.m6638constructorimpl(TimePickerTokens.INSTANCE.m3557getClockDialContainerSizeD9Ej5fM() / f3)), Dp.m6638constructorimpl(Dp.m6638constructorimpl(fM6638constructorimpl2 * ((float) Math.sin(analogTimePickerState.getCurrentAngle()))) + Dp.m6638constructorimpl(TimePickerTokens.INSTANCE.m3557getClockDialContainerSizeD9Ej5fM() / f3)));
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void VerticalTimePicker(androidx.compose.material3.AnalogTimePickerState r13, androidx.compose.ui.Modifier r14, androidx.compose.material3.TimePickerColors r15, boolean r16, androidx.compose.runtime.Composer r17, int r18, int r19) {
        /*
            Method dump skipped, instruction units count: 557
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.VerticalTimePicker(androidx.compose.material3.AnalogTimePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.TimePickerColors, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: renamed from: androidx.compose.material3.TimePickerKt$VerticalTimePicker$1 */
    /* JADX INFO: compiled from: TimePicker.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bDZc|İOيH\u000b\\A'\"Z\u0012>\u000f¡n96E"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ&x>)\u0015upMsc*Nz8GY$", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C07111 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
        public static final C07111 INSTANCE = ;

        C07111() {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            invoke2(semanticsPropertyReceiver);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
        }
    }

    public static final void HorizontalTimePicker(AnalogTimePickerState analogTimePickerState, Modifier modifier, TimePickerColors timePickerColors, boolean z2, Composer composer, int i2, int i3) {
        int i4;
        TimePickerColors timePickerColorsColors = timePickerColors;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(1432307537);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(HorizontalTimePicker)P(3,2,1)945@40787L8,948@40837L309:TimePicker.kt#uh7d8r");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            i4 = (-1) - (((-1) - i2) & ((-1) - 6));
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(analogTimePickerState) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = (-1) - (((-1) - i3) | ((-1) - 2));
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            int i6 = composerStartRestartGroup.changed(companion) ? 32 : 16;
            i4 = (i4 + i6) - (i4 & i6);
        }
        if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 |= ((i3 & 4) == 0 && composerStartRestartGroup.changed(timePickerColorsColors)) ? 256 : 128;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 3072));
        } else if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            int i7 = composerStartRestartGroup.changed(z2) ? 2048 : 1024;
            i4 = (i4 + i7) - (i4 & i7);
        }
        if ((i4 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i2 + 1) - (i2 | 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if ((i3 & 4) != 0) {
                    timePickerColorsColors = TimePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                    i4 = (i4 - 897) - (i4 | (-897));
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 + 4) - (i3 | 4) != 0) {
                    i4 &= -897;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1432307537, i4, -1, "androidx.compose.material3.HorizontalTimePicker (TimePicker.kt:947)");
            }
            Modifier modifierM1022paddingqDBjuR0$default = PaddingKt.m1022paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, ClockFaceBottomMargin, 7, null);
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1022paddingqDBjuR0$default);
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
            Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407918630, "C100@5047L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 157723300, "C952@40982L37,953@41028L59,954@41096L44:TimePicker.kt#uh7d8r");
            int i8 = i4 >> 3;
            int i9 = (i4 & 14) | ((i8 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (112 | i8));
            HorizontalClockDisplay(analogTimePickerState, timePickerColorsColors, composerStartRestartGroup, i9);
            SpacerKt.Spacer(SizeKt.m1068width3ABfNKs(Modifier.Companion, ClockDisplayBottomMargin), composerStartRestartGroup, 6);
            ClockFace(analogTimePickerState, timePickerColorsColors, z2, composerStartRestartGroup, (-1) - (((-1) - ((i8 + 896) - (i8 | 896))) & ((-1) - i9)));
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.HorizontalTimePicker.2
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ boolean $autoSwitchToMinute;
                final /* synthetic */ TimePickerColors $colors;
                final /* synthetic */ Modifier $modifier;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C07042(Modifier companion2, TimePickerColors timePickerColorsColors2, boolean z22, int i22, int i32) {
                    super(2);
                    modifier = companion2;
                    timePickerColors = timePickerColorsColors2;
                    z = z22;
                    i = i22;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    TimePickerKt.HorizontalTimePicker(analogTimePickerState, modifier, timePickerColors, z, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                }
            });
        }
    }

    public static final void TimeInputImpl(Modifier modifier, final TimePickerColors timePickerColors, final TimePickerState timePickerState, Composer composer, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-475657989);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TimeInputImpl)P(1)965@41356L112,965@41304L164,969@41552L104,969@41500L156,972@41661L4502:TimePicker.kt#uh7d8r");
        Modifier modifier2 = modifier;
        if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            int i4 = composerStartRestartGroup.changed(modifier2) ? 4 : 2;
            i3 = (i4 + i2) - (i4 & i2);
        } else {
            i3 = i2;
        }
        if ((i2 + 48) - (48 | i2) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changed(timePickerColors) ? 32 : 16)));
        }
        if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i3 |= (i2 + 512) - (512 | i2) == 0 ? composerStartRestartGroup.changed(timePickerState) : composerStartRestartGroup.changedInstance(timePickerState) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-475657989, i3, -1, "androidx.compose.material3.TimeInputImpl (TimePicker.kt:963)");
            }
            boolean z2 = false;
            Object[] objArr = new Object[0];
            Saver<TextFieldValue, Object> saver = TextFieldValue.Companion.getSaver();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 339122986, "CC(remember):TimePicker.kt#9igjgp");
            int i5 = (i3 + 896) - (896 | i3);
            boolean z3 = true;
            if (i5 != 256 && ((512 & i3) == 0 || !composerStartRestartGroup.changedInstance(timePickerState))) {
                z3 = false;
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (Function0) new Function0<MutableState<TextFieldValue>>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$hourValue$2$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final MutableState<TextFieldValue> invoke() {
                        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(CalendarLocale_jvmKt.toLocalString$default(TimePickerKt.getHourForDisplay(timePickerState), 2, 0, false, 6, null), 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final MutableState mutableStateRememberSaveable = RememberSaveableKt.rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 0, 4);
            Object[] objArr2 = new Object[0];
            Saver<TextFieldValue, Object> saver2 = TextFieldValue.Companion.getSaver();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 339129250, "CC(remember):TimePicker.kt#9igjgp");
            if (i5 == 256 || ((i3 + 512) - (512 | i3) != 0 && composerStartRestartGroup.changedInstance(timePickerState))) {
                z2 = true;
            }
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = (Function0) new Function0<MutableState<TextFieldValue>>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$minuteValue$2$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final MutableState<TextFieldValue> invoke() {
                        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(CalendarLocale_jvmKt.toLocalString$default(timePickerState.getMinute(), 2, 0, false, 6, null), 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final MutableState mutableStateRememberSaveable2 = RememberSaveableKt.rememberSaveable(objArr2, (Saver) saver2, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 4);
            modifier2 = modifier2;
            Modifier modifierM1022paddingqDBjuR0$default = PaddingKt.m1022paddingqDBjuR0$default(modifier2, 0.0f, 0.0f, 0.0f, TimeInputBottomPadding, 7, null);
            Alignment.Vertical top = Alignment.Companion.getTop();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), top, composerStartRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1022paddingqDBjuR0$default);
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
            Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407918630, "C100@5047L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1328966913, "C977@41861L5,986@42225L3553,982@42004L3774:TimePicker.kt#uh7d8r");
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{TextKt.getLocalTextStyle().provides(TextStyle.m6136copyp1EtxEg$default(TypographyKt.getValue(TimeInputTokens.INSTANCE.getTimeFieldLabelTextFont(), composerStartRestartGroup, 6), timePickerColors.m2734timeSelectorContentColorvNxB06k$material3_release(true), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.Companion.m6527getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744446, null)), CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.rememberComposableLambda(1306700887, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    ComposerKt.sourceInformation(composer2, "C987@42239L3529:TimePicker.kt#uh7d8r");
                    if ((i6 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1306700887, i6, -1, "androidx.compose.material3.TimeInputImpl.<anonymous>.<anonymous> (TimePicker.kt:987)");
                    }
                    final MutableState<TextFieldValue> mutableState = mutableStateRememberSaveable;
                    final TimePickerState timePickerState2 = timePickerState;
                    TimePickerColors timePickerColors2 = timePickerColors;
                    final MutableState<TextFieldValue> mutableState2 = mutableStateRememberSaveable2;
                    ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                    Modifier.Companion companion = Modifier.Companion;
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composer2, 0);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, companion);
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
                    Updater.m3678setimpl(composerM3671constructorimpl2, measurePolicyRowMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m3678setimpl(composerM3671constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                    if (composerM3671constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM3671constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM3671constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m3678setimpl(composerM3671constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, -227350393, "C990@42357L529,1004@42963L451,1024@43854L52,988@42261L1727,1028@44005L123,1033@44248L422,1045@44749L429,1065@45620L52,1031@44145L1609:TimePicker.kt#uh7d8r");
                    Modifier.Companion companion2 = Modifier.Companion;
                    ComposerKt.sourceInformationMarkerStart(composer2, -284428440, "CC(remember):TimePicker.kt#9igjgp");
                    boolean z4 = (-1) - (((-1) - (composer2.changed(mutableState) ? 1 : 0)) & ((-1) - (composer2.changedInstance(timePickerState2) ? 1 : 0))) == 1;
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (z4 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                        objRememberedValue3 = (Function1) new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                                return m2751invokeZmokQxo(keyEvent.m5232unboximpl());
                            }

                            /* JADX INFO: renamed from: invoke-ZmokQxo, reason: not valid java name */
                            public final Boolean m2751invokeZmokQxo(android.view.KeyEvent keyEvent) {
                                int iM5245getUtf16CodePointZmokQxo = KeyEvent_androidKt.m5245getUtf16CodePointZmokQxo(keyEvent);
                                if (48 <= iM5245getUtf16CodePointZmokQxo && iM5245getUtf16CodePointZmokQxo < 58 && TextRange.m6123getStartimpl(TimePickerKt.TimeInputImpl$lambda$6(mutableState).m6370getSelectiond9O1mEE()) == 2 && TimePickerKt.TimeInputImpl$lambda$6(mutableState).getText().length() == 2) {
                                    timePickerState2.mo1777setSelection6_8s6DQ(TimePickerSelectionMode.Companion.m2770getMinuteyecRtBI());
                                }
                                return false;
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    Modifier modifierOnKeyEvent = KeyInputModifierKt.onKeyEvent(companion2, (Function1) objRememberedValue3);
                    TextFieldValue textFieldValueTimeInputImpl$lambda$6 = TimePickerKt.TimeInputImpl$lambda$6(mutableState);
                    ComposerKt.sourceInformationMarkerStart(composer2, -284409126, "CC(remember):TimePicker.kt#9igjgp");
                    boolean zChangedInstance = composer2.changedInstance(timePickerState2);
                    boolean zChanged = composer2.changed(mutableState);
                    boolean z5 = ((zChangedInstance ? 1 : 0) + (zChanged ? 1 : 0)) - ((zChangedInstance ? 1 : 0) & (zChanged ? 1 : 0)) == 1;
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (z5 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                        objRememberedValue4 = (Function1) new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                                invoke2(textFieldValue);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(TextFieldValue textFieldValue) {
                                int iM2769getHouryecRtBI = TimePickerSelectionMode.Companion.m2769getHouryecRtBI();
                                TimePickerState timePickerState3 = timePickerState2;
                                TextFieldValue textFieldValueTimeInputImpl$lambda$62 = TimePickerKt.TimeInputImpl$lambda$6(mutableState);
                                int i7 = timePickerState2.is24hour() ? 23 : 12;
                                final MutableState<TextFieldValue> mutableState3 = mutableState;
                                TimePickerKt.m2750timeInputOnChangez7XvuPQ(iM2769getHouryecRtBI, timePickerState3, textFieldValue, textFieldValueTimeInputImpl$lambda$62, i7, new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$2$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                                        invoke2(textFieldValue2);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(TextFieldValue textFieldValue2) {
                                        mutableState3.setValue(textFieldValue2);
                                    }
                                });
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    Function1 function1 = (Function1) objRememberedValue4;
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    int iM2769getHouryecRtBI = TimePickerSelectionMode.Companion.m2769getHouryecRtBI();
                    KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, KeyboardType.Companion.m6358getNumberPjHm6EE(), ImeAction.Companion.m6304getNexteUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 115, (DefaultConstructorMarker) null);
                    ComposerKt.sourceInformationMarkerStart(composer2, -284381013, "CC(remember):TimePicker.kt#9igjgp");
                    boolean zChangedInstance2 = composer2.changedInstance(timePickerState2);
                    Object objRememberedValue5 = composer2.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                        objRememberedValue5 = (Function1) new Function1<KeyboardActionScope, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$3$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(KeyboardActionScope keyboardActionScope) {
                                invoke2(keyboardActionScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(KeyboardActionScope keyboardActionScope) {
                                timePickerState2.mo1777setSelection6_8s6DQ(TimePickerSelectionMode.Companion.m2770getMinuteyecRtBI());
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue5);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    TimePickerKt.m2739TimePickerTextField1vLObsk(modifierOnKeyEvent, textFieldValueTimeInputImpl$lambda$6, function1, timePickerState2, iM2769getHouryecRtBI, keyboardOptions, new KeyboardActions(null, null, (Function1) objRememberedValue5, null, null, null, 59, null), timePickerColors2, composer2, 24576, 0);
                    TimePickerKt.DisplaySeparator(SizeKt.m1065sizeVpY3zN4(Modifier.Companion, TimePickerKt.DisplaySeparatorWidth, TimeInputTokens.INSTANCE.m3551getPeriodSelectorContainerHeightD9Ej5fM()), composer2, 6);
                    Modifier.Companion companion3 = Modifier.Companion;
                    ComposerKt.sourceInformationMarkerStart(composer2, -284368035, "CC(remember):TimePicker.kt#9igjgp");
                    boolean zChanged2 = composer2.changed(mutableState2);
                    boolean zChangedInstance3 = composer2.changedInstance(timePickerState2);
                    boolean z6 = ((zChanged2 ? 1 : 0) + (zChangedInstance3 ? 1 : 0)) - ((zChanged2 ? 1 : 0) & (zChangedInstance3 ? 1 : 0)) == 1;
                    Object objRememberedValue6 = composer2.rememberedValue();
                    if (z6 || objRememberedValue6 == Composer.Companion.getEmpty()) {
                        objRememberedValue6 = (Function1) new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                                return m2752invokeZmokQxo(keyEvent.m5232unboximpl());
                            }

                            /* JADX INFO: renamed from: invoke-ZmokQxo, reason: not valid java name */
                            public final Boolean m2752invokeZmokQxo(android.view.KeyEvent keyEvent) {
                                boolean z7 = KeyEvent_androidKt.m5245getUtf16CodePointZmokQxo(keyEvent) == 0 && TextRange.m6123getStartimpl(TimePickerKt.TimeInputImpl$lambda$9(mutableState2).m6370getSelectiond9O1mEE()) == 0;
                                if (z7) {
                                    timePickerState2.mo1777setSelection6_8s6DQ(TimePickerSelectionMode.Companion.m2769getHouryecRtBI());
                                }
                                return Boolean.valueOf(z7);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue6);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    Modifier modifierOnPreviewKeyEvent = KeyInputModifierKt.onPreviewKeyEvent(companion3, (Function1) objRememberedValue6);
                    TextFieldValue textFieldValueTimeInputImpl$lambda$9 = TimePickerKt.TimeInputImpl$lambda$9(mutableState2);
                    ComposerKt.sourceInformationMarkerStart(composer2, -284351996, "CC(remember):TimePicker.kt#9igjgp");
                    boolean zChangedInstance4 = composer2.changedInstance(timePickerState2);
                    boolean zChanged3 = composer2.changed(mutableState2);
                    boolean z7 = ((zChangedInstance4 ? 1 : 0) + (zChanged3 ? 1 : 0)) - ((zChangedInstance4 ? 1 : 0) & (zChanged3 ? 1 : 0)) == 1;
                    Object objRememberedValue7 = composer2.rememberedValue();
                    if (z7 || objRememberedValue7 == Composer.Companion.getEmpty()) {
                        objRememberedValue7 = (Function1) new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                                invoke2(textFieldValue);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(TextFieldValue textFieldValue) {
                                int iM2770getMinuteyecRtBI = TimePickerSelectionMode.Companion.m2770getMinuteyecRtBI();
                                TimePickerState timePickerState3 = timePickerState2;
                                TextFieldValue textFieldValueTimeInputImpl$lambda$92 = TimePickerKt.TimeInputImpl$lambda$9(mutableState2);
                                final MutableState<TextFieldValue> mutableState3 = mutableState2;
                                TimePickerKt.m2750timeInputOnChangez7XvuPQ(iM2770getMinuteyecRtBI, timePickerState3, textFieldValue, textFieldValueTimeInputImpl$lambda$92, 59, new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$5$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                                        invoke2(textFieldValue2);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(TextFieldValue textFieldValue2) {
                                        mutableState3.setValue(textFieldValue2);
                                    }
                                });
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue7);
                    }
                    Function1 function12 = (Function1) objRememberedValue7;
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    int iM2770getMinuteyecRtBI = TimePickerSelectionMode.Companion.m2770getMinuteyecRtBI();
                    KeyboardOptions keyboardOptions2 = new KeyboardOptions(0, (Boolean) null, KeyboardType.Companion.m6358getNumberPjHm6EE(), ImeAction.Companion.m6302getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 115, (DefaultConstructorMarker) null);
                    ComposerKt.sourceInformationMarkerStart(composer2, -284324501, "CC(remember):TimePicker.kt#9igjgp");
                    boolean zChangedInstance5 = composer2.changedInstance(timePickerState2);
                    Object objRememberedValue8 = composer2.rememberedValue();
                    if (zChangedInstance5 || objRememberedValue8 == Composer.Companion.getEmpty()) {
                        objRememberedValue8 = (Function1) new Function1<KeyboardActionScope, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$6$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(KeyboardActionScope keyboardActionScope) {
                                invoke2(keyboardActionScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(KeyboardActionScope keyboardActionScope) {
                                timePickerState2.mo1777setSelection6_8s6DQ(TimePickerSelectionMode.Companion.m2770getMinuteyecRtBI());
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue8);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    TimePickerKt.m2739TimePickerTextField1vLObsk(modifierOnPreviewKeyEvent, textFieldValueTimeInputImpl$lambda$9, function12, timePickerState2, iM2770getMinuteyecRtBI, keyboardOptions2, new KeyboardActions(null, null, (Function1) objRememberedValue8, null, null, null, 59, null), timePickerColors2, composer2, 24576, 0);
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
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (-1) - (((-1) - ProvidedValue.$stable) & ((-1) - 48)));
            composerStartRestartGroup.startReplaceGroup(511443242);
            ComposerKt.sourceInformation(composerStartRestartGroup, "1073@45823L324");
            if (!timePickerState.is24hour()) {
                Modifier modifierM1022paddingqDBjuR0$default2 = PaddingKt.m1022paddingqDBjuR0$default(Modifier.Companion, PeriodToggleMargin, 0.0f, 0.0f, 0.0f, 14, null);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1022paddingqDBjuR0$default2);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3671constructorimpl2 = Updater.m3671constructorimpl(composerStartRestartGroup);
                Updater.m3678setimpl(composerM3671constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m3678setimpl(composerM3671constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composerM3671constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM3671constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM3671constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m3678setimpl(composerM3671constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -415465671, "C1074@45891L242:TimePicker.kt#uh7d8r");
                Modifier modifierM1065sizeVpY3zN4 = SizeKt.m1065sizeVpY3zN4(Modifier.Companion, TimeInputTokens.INSTANCE.m3552getPeriodSelectorContainerWidthD9Ej5fM(), TimeInputTokens.INSTANCE.m3551getPeriodSelectorContainerHeightD9Ej5fM());
                int i6 = 6 | ((-1) - (((-1) - (i3 >> 3)) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)));
                int i7 = (-1) - (((-1) - (i3 << 3)) | ((-1) - 896));
                VerticalPeriodToggle(modifierM1065sizeVpY3zN4, timePickerState, timePickerColors, composerStartRestartGroup, (i6 + i7) - (i6 & i7));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceGroup();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.TimeInputImpl.2
                final /* synthetic */ int $$changed;
                final /* synthetic */ TimePickerColors $colors;
                final /* synthetic */ TimePickerState $state;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C07072(final TimePickerColors timePickerColors2, final TimePickerState timePickerState2, int i22) {
                    super(2);
                    timePickerColors = timePickerColors2;
                    timePickerState = timePickerState2;
                    i = i22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    TimePickerKt.TimeInputImpl(modifier, timePickerColors, timePickerState, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final TextFieldValue TimeInputImpl$lambda$6(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    public static final TextFieldValue TimeInputImpl$lambda$9(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    public static final void HorizontalClockDisplay(TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(755539561);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(HorizontalClockDisplay)P(1)1087@46270L590:TimePicker.kt#uh7d8r");
        if ((6 & i2) == 0) {
            int i4 = (-1) - (((-1) - i2) | ((-1) - 8)) == 0 ? composerStartRestartGroup.changed(timePickerState) : composerStartRestartGroup.changedInstance(timePickerState) ? 4 : 2;
            i3 = (i4 + i2) - (i4 & i2);
        } else {
            i3 = i2;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changed(timePickerColors) ? 32 : 16)));
        }
        if ((-1) - (((-1) - i3) | ((-1) - 19)) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(755539561, i3, -1, "androidx.compose.material3.HorizontalClockDisplay (TimePicker.kt:1086)");
            }
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, Alignment.Companion.getStart(), composerStartRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1556019140, "C1088@46329L34:TimePicker.kt#uh7d8r");
            ClockDisplayNumbers(timePickerState, timePickerColors, composerStartRestartGroup, 126 & i3);
            composerStartRestartGroup.startReplaceGroup(919638492);
            ComposerKt.sourceInformation(composerStartRestartGroup, "1090@46407L437");
            if (!timePickerState.is24hour()) {
                Modifier modifierM1022paddingqDBjuR0$default = PaddingKt.m1022paddingqDBjuR0$default(Modifier.Companion, 0.0f, PeriodToggleMargin, 0.0f, 0.0f, 13, null);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1022paddingqDBjuR0$default);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3671constructorimpl2 = Updater.m3671constructorimpl(composerStartRestartGroup);
                Updater.m3678setimpl(composerM3671constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m3678setimpl(composerM3671constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composerM3671constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM3671constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM3671constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m3678setimpl(composerM3671constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -743649264, "C1091@46484L346:TimePicker.kt#uh7d8r");
                Modifier modifierM1065sizeVpY3zN4 = SizeKt.m1065sizeVpY3zN4(Modifier.Companion, TimePickerTokens.INSTANCE.m3563getPeriodSelectorHorizontalContainerWidthD9Ej5fM(), TimePickerTokens.INSTANCE.m3562getPeriodSelectorHorizontalContainerHeightD9Ej5fM());
                int i5 = i3 << 3;
                int i6 = (-1) - (((-1) - i5) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION));
                int i7 = (i6 + 6) - (i6 & 6);
                int i8 = (i5 + 896) - (i5 | 896);
                HorizontalPeriodToggle(modifierM1065sizeVpY3zN4, timePickerState, timePickerColors, composerStartRestartGroup, (i8 + i7) - (i8 & i7));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.HorizontalClockDisplay.2
                final /* synthetic */ int $$changed;
                final /* synthetic */ TimePickerColors $colors;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C07022(TimePickerColors timePickerColors2, int i22) {
                    super(2);
                    timePickerColors = timePickerColors2;
                    i = i22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    TimePickerKt.HorizontalClockDisplay(timePickerState, timePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))));
                }
            });
        }
    }

    public static final void VerticalClockDisplay(TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(2054675515);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(VerticalClockDisplay)P(1)1107@46965L585:TimePicker.kt#uh7d8r");
        if ((i2 + 6) - (6 | i2) == 0) {
            int i4 = (-1) - (((-1) - i2) | ((-1) - 8)) == 0 ? composerStartRestartGroup.changed(timePickerState) : composerStartRestartGroup.changedInstance(timePickerState) ? 4 : 2;
            i3 = (i4 + i2) - (i4 & i2);
        } else {
            i3 = i2;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            int i5 = composerStartRestartGroup.changed(timePickerColors) ? 32 : 16;
            i3 = (i3 + i5) - (i3 & i5);
        }
        if ((-1) - (((-1) - i3) | ((-1) - 19)) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2054675515, i3, -1, "androidx.compose.material3.VerticalClockDisplay (TimePicker.kt:1106)");
            }
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, Alignment.Companion.getTop(), composerStartRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407918630, "C100@5047L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -519240274, "C1108@47023L34:TimePicker.kt#uh7d8r");
            ClockDisplayNumbers(timePickerState, timePickerColors, composerStartRestartGroup, (-1) - (((-1) - i3) | ((-1) - 126)));
            composerStartRestartGroup.startReplaceGroup(-709485014);
            ComposerKt.sourceInformation(composerStartRestartGroup, "1110@47101L433");
            if (!timePickerState.is24hour()) {
                Modifier modifierM1022paddingqDBjuR0$default = PaddingKt.m1022paddingqDBjuR0$default(Modifier.Companion, PeriodToggleMargin, 0.0f, 0.0f, 0.0f, 14, null);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1022paddingqDBjuR0$default);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3671constructorimpl2 = Updater.m3671constructorimpl(composerStartRestartGroup);
                Updater.m3678setimpl(composerM3671constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m3678setimpl(composerM3671constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composerM3671constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM3671constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM3671constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m3678setimpl(composerM3671constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 204292100, "C1111@47180L340:TimePicker.kt#uh7d8r");
                int i6 = i3 << 3;
                VerticalPeriodToggle(SizeKt.m1065sizeVpY3zN4(Modifier.Companion, TimePickerTokens.INSTANCE.m3566getPeriodSelectorVerticalContainerWidthD9Ej5fM(), TimePickerTokens.INSTANCE.m3565getPeriodSelectorVerticalContainerHeightD9Ej5fM()), timePickerState, timePickerColors, composerStartRestartGroup, (-1) - (((-1) - ((-1) - (((-1) - i6) | ((-1) - 896)))) & ((-1) - ((-1) - (((-1) - ((-1) - (((-1) - i6) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)))) & ((-1) - 6))))));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.VerticalClockDisplay.2
                final /* synthetic */ int $$changed;
                final /* synthetic */ TimePickerColors $colors;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C07092(TimePickerColors timePickerColors2, int i22) {
                    super(2);
                    timePickerColors = timePickerColors2;
                    i = i22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    TimePickerKt.VerticalClockDisplay(timePickerState, timePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void ClockDisplayNumbers(TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-934561141);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ClockDisplayNumbers)P(1)1128@47738L5,1131@47873L775,1127@47654L994:TimePicker.kt#uh7d8r");
        if ((6 & i2) == 0) {
            int i4 = (8 & i2) == 0 ? composerStartRestartGroup.changed(timePickerState) : composerStartRestartGroup.changedInstance(timePickerState) ? 4 : 2;
            i3 = (i4 + i2) - (i4 & i2);
        } else {
            i3 = i2;
        }
        if ((i2 + 48) - (48 | i2) == 0) {
            i3 |= composerStartRestartGroup.changed(timePickerColors) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-934561141, i3, -1, "androidx.compose.material3.ClockDisplayNumbers (TimePicker.kt:1126)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{TextKt.getLocalTextStyle().provides(TypographyKt.getValue(TimePickerTokens.INSTANCE.getTimeSelectorLabelTextFont(), composerStartRestartGroup, 6)), CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.rememberComposableLambda(-477913269, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ClockDisplayNumbers.1
                final /* synthetic */ TimePickerColors $colors;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(TimePickerColors timePickerColors2) {
                    super(2);
                    timePickerColors = timePickerColors2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    ComposerKt.sourceInformation(composer2, "C1132@47883L759:TimePicker.kt#uh7d8r");
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-477913269, i5, -1, "androidx.compose.material3.ClockDisplayNumbers.<anonymous> (TimePicker.kt:1132)");
                    }
                    TimePickerState timePickerState2 = timePickerState;
                    TimePickerColors timePickerColors2 = timePickerColors;
                    ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                    Modifier.Companion companion = Modifier.Companion;
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composer2, 0);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, companion);
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
                    Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                    if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, 599195447, "C1133@47901L294,1140@48208L123,1143@48344L288:TimePicker.kt#uh7d8r");
                    TimePickerKt.m2740TimeSelectorSAnMeKU(SizeKt.m1065sizeVpY3zN4(Modifier.Companion, TimePickerTokens.INSTANCE.m3569getTimeSelectorContainerWidthD9Ej5fM(), TimePickerTokens.INSTANCE.m3568getTimeSelectorContainerHeightD9Ej5fM()), TimePickerKt.getHourForDisplay(timePickerState2), timePickerState2, TimePickerSelectionMode.Companion.m2769getHouryecRtBI(), timePickerColors2, composer2, 3078);
                    TimePickerKt.DisplaySeparator(SizeKt.m1065sizeVpY3zN4(Modifier.Companion, TimePickerKt.DisplaySeparatorWidth, TimePickerTokens.INSTANCE.m3565getPeriodSelectorVerticalContainerHeightD9Ej5fM()), composer2, 6);
                    TimePickerKt.m2740TimeSelectorSAnMeKU(SizeKt.m1065sizeVpY3zN4(Modifier.Companion, TimePickerTokens.INSTANCE.m3569getTimeSelectorContainerWidthD9Ej5fM(), TimePickerTokens.INSTANCE.m3568getTimeSelectorContainerHeightD9Ej5fM()), timePickerState2.getMinute(), timePickerState2, TimePickerSelectionMode.Companion.m2770getMinuteyecRtBI(), timePickerColors2, composer2, 3078);
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
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ClockDisplayNumbers.2
                final /* synthetic */ int $$changed;
                final /* synthetic */ TimePickerColors $colors;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(TimePickerColors timePickerColors2, int i22) {
                    super(2);
                    timePickerColors = timePickerColors2;
                    i = i22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    TimePickerState timePickerState2 = timePickerState;
                    TimePickerColors timePickerColors2 = timePickerColors;
                    int i32 = i;
                    TimePickerKt.ClockDisplayNumbers(timePickerState2, timePickerColors2, composer2, RecomposeScopeImplKt.updateChangedFlags((i32 + 1) - (i32 & 1)));
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.TimePickerKt$ClockDisplayNumbers$1 */
    /* JADX INFO: compiled from: TimePicker.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJc\u0003İY\u0006^\ntK֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq>"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ TimePickerColors $colors;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TimePickerColors timePickerColors2) {
            super(2);
            timePickerColors = timePickerColors2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
            invoke(composer2, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer2, int i5) {
            ComposerKt.sourceInformation(composer2, "C1132@47883L759:TimePicker.kt#uh7d8r");
            if ((i5 & 3) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-477913269, i5, -1, "androidx.compose.material3.ClockDisplayNumbers.<anonymous> (TimePicker.kt:1132)");
            }
            TimePickerState timePickerState2 = timePickerState;
            TimePickerColors timePickerColors2 = timePickerColors;
            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composer2, 0);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, companion);
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
            Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -407918630, "C100@5047L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, 599195447, "C1133@47901L294,1140@48208L123,1143@48344L288:TimePicker.kt#uh7d8r");
            TimePickerKt.m2740TimeSelectorSAnMeKU(SizeKt.m1065sizeVpY3zN4(Modifier.Companion, TimePickerTokens.INSTANCE.m3569getTimeSelectorContainerWidthD9Ej5fM(), TimePickerTokens.INSTANCE.m3568getTimeSelectorContainerHeightD9Ej5fM()), TimePickerKt.getHourForDisplay(timePickerState2), timePickerState2, TimePickerSelectionMode.Companion.m2769getHouryecRtBI(), timePickerColors2, composer2, 3078);
            TimePickerKt.DisplaySeparator(SizeKt.m1065sizeVpY3zN4(Modifier.Companion, TimePickerKt.DisplaySeparatorWidth, TimePickerTokens.INSTANCE.m3565getPeriodSelectorVerticalContainerHeightD9Ej5fM()), composer2, 6);
            TimePickerKt.m2740TimeSelectorSAnMeKU(SizeKt.m1065sizeVpY3zN4(Modifier.Companion, TimePickerTokens.INSTANCE.m3569getTimeSelectorContainerWidthD9Ej5fM(), TimePickerTokens.INSTANCE.m3568getTimeSelectorContainerHeightD9Ej5fM()), timePickerState2.getMinute(), timePickerState2, TimePickerSelectionMode.Companion.m2770getMinuteyecRtBI(), timePickerColors2, composer2, 3078);
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

    public static final void HorizontalPeriodToggle(Modifier modifier, TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1261215927);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(HorizontalPeriodToggle)P(1,2)1160@48810L1014,1188@49871L5,1190@49902L206:TimePicker.kt#uh7d8r");
        if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            i3 = (-1) - (((-1) - (composerStartRestartGroup.changed(modifier) ? 4 : 2)) & ((-1) - i2));
        } else {
            i3 = i2;
        }
        if ((48 & i2) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - ((-1) - (((-1) - i2) | ((-1) - 64)) == 0 ? composerStartRestartGroup.changed(timePickerState) : composerStartRestartGroup.changedInstance(timePickerState) ? 32 : 16)));
        }
        if ((384 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(timePickerColors) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1261215927, i3, -1, "androidx.compose.material3.HorizontalPeriodToggle (TimePicker.kt:1159)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2071625362, "CC(remember):TimePicker.kt#9igjgp");
            TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1 timePickerKt$HorizontalPeriodToggle$measurePolicy$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (timePickerKt$HorizontalPeriodToggle$measurePolicy$1$1RememberedValue == Composer.Companion.getEmpty()) {
                timePickerKt$HorizontalPeriodToggle$measurePolicy$1$1RememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* JADX INFO: renamed from: measure-3p2s80s */
                    public final MeasureResult mo375measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
                        int size = list.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            Measurable measurable = list.get(i4);
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "Spacer")) {
                                final Placeable placeableMo5514measureBRTryo0 = measurable.mo5514measureBRTryo0(Constraints.m6582copyZbe2FdA$default(j2, 0, measureScope.mo704roundToPx0680j_4(TimePickerTokens.INSTANCE.m3564getPeriodSelectorOutlineWidthD9Ej5fM()), 0, 0, 12, null));
                                ArrayList arrayList = new ArrayList(list.size());
                                int size2 = list.size();
                                for (int i5 = 0; i5 < size2; i5++) {
                                    Measurable measurable2 = list.get(i5);
                                    if (!Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "Spacer")) {
                                        arrayList.add(measurable2);
                                    }
                                }
                                ArrayList arrayList2 = arrayList;
                                ArrayList arrayList3 = new ArrayList(arrayList2.size());
                                int size3 = arrayList2.size();
                                for (int i6 = 0; i6 < size3; i6++) {
                                    arrayList3.add(((Measurable) arrayList2.get(i6)).mo5514measureBRTryo0(Constraints.m6582copyZbe2FdA$default(j2, 0, Constraints.m6591getMaxWidthimpl(j2) / 2, 0, 0, 12, null)));
                                }
                                final ArrayList arrayList4 = arrayList3;
                                return MeasureScope.layout$default(measureScope, Constraints.m6591getMaxWidthimpl(j2), Constraints.m6590getMaxHeightimpl(j2), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1.1
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
                                        Placeable.PlacementScope.place$default(placementScope, arrayList4.get(0), 0, 0, 0.0f, 4, null);
                                        Placeable.PlacementScope.place$default(placementScope, arrayList4.get(1), arrayList4.get(0).getWidth(), 0, 0.0f, 4, null);
                                        Placeable.PlacementScope.place$default(placementScope, placeableMo5514measureBRTryo0, arrayList4.get(0).getWidth() - (placeableMo5514measureBRTryo0.getWidth() / 2), 0, 0.0f, 4, null);
                                    }
                                }, 4, null);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                composerStartRestartGroup.updateRememberedValue(timePickerKt$HorizontalPeriodToggle$measurePolicy$1$1RememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Shape value = ShapesKt.getValue(TimePickerTokens.INSTANCE.getPeriodSelectorContainerShape(), composerStartRestartGroup, 6);
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            CornerBasedShape cornerBasedShape = (CornerBasedShape) value;
            int i4 = i3 & 14;
            int i5 = (-1) - (((-1) - ((i4 + 3072) - (i4 & 3072))) & ((-1) - (112 & i3)));
            int i6 = (i3 + 896) - (i3 | 896);
            PeriodToggleImpl(modifier, timePickerState, timePickerColors, (MeasurePolicy) timePickerKt$HorizontalPeriodToggle$measurePolicy$1$1RememberedValue, ShapesKt.start(cornerBasedShape), ShapesKt.end(cornerBasedShape), composerStartRestartGroup, (i5 + i6) - (i5 & i6));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.HorizontalPeriodToggle.1
                final /* synthetic */ int $$changed;
                final /* synthetic */ TimePickerColors $colors;
                final /* synthetic */ TimePickerState $state;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C07031(TimePickerState timePickerState2, TimePickerColors timePickerColors2, int i22) {
                    super(2);
                    timePickerState = timePickerState2;
                    timePickerColors = timePickerColors2;
                    i = i22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    Modifier modifier2 = modifier;
                    TimePickerState timePickerState2 = timePickerState;
                    TimePickerColors timePickerColors2 = timePickerColors;
                    int i32 = i;
                    TimePickerKt.HorizontalPeriodToggle(modifier2, timePickerState2, timePickerColors2, composer2, RecomposeScopeImplKt.updateChangedFlags((i32 + 1) - (i32 & 1)));
                }
            });
        }
    }

    public static final void VerticalPeriodToggle(Modifier modifier, TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1898918107);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(VerticalPeriodToggle)P(1,2)1206@50268L1021,1234@51336L5,1236@51367L207:TimePicker.kt#uh7d8r");
        if ((i2 + 6) - (6 | i2) == 0) {
            i3 = (-1) - (((-1) - (composerStartRestartGroup.changed(modifier) ? 4 : 2)) & ((-1) - i2));
        } else {
            i3 = i2;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            i3 |= (64 & i2) == 0 ? composerStartRestartGroup.changed(timePickerState) : composerStartRestartGroup.changedInstance(timePickerState) ? 32 : 16;
        }
        if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            int i4 = composerStartRestartGroup.changed(timePickerColors) ? 256 : 128;
            i3 = (i3 + i4) - (i3 & i4);
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1898918107, i3, -1, "androidx.compose.material3.VerticalPeriodToggle (TimePicker.kt:1205)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1491514731, "CC(remember):TimePicker.kt#9igjgp");
            TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1 timePickerKt$VerticalPeriodToggle$measurePolicy$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (timePickerKt$VerticalPeriodToggle$measurePolicy$1$1RememberedValue == Composer.Companion.getEmpty()) {
                timePickerKt$VerticalPeriodToggle$measurePolicy$1$1RememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* JADX INFO: renamed from: measure-3p2s80s */
                    public final MeasureResult mo375measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
                        int size = list.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            Measurable measurable = list.get(i5);
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "Spacer")) {
                                final Placeable placeableMo5514measureBRTryo0 = measurable.mo5514measureBRTryo0(Constraints.m6582copyZbe2FdA$default(j2, 0, 0, 0, measureScope.mo704roundToPx0680j_4(TimePickerTokens.INSTANCE.m3564getPeriodSelectorOutlineWidthD9Ej5fM()), 3, null));
                                ArrayList arrayList = new ArrayList(list.size());
                                int size2 = list.size();
                                for (int i6 = 0; i6 < size2; i6++) {
                                    Measurable measurable2 = list.get(i6);
                                    if (!Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "Spacer")) {
                                        arrayList.add(measurable2);
                                    }
                                }
                                ArrayList arrayList2 = arrayList;
                                ArrayList arrayList3 = new ArrayList(arrayList2.size());
                                int size3 = arrayList2.size();
                                for (int i7 = 0; i7 < size3; i7++) {
                                    arrayList3.add(((Measurable) arrayList2.get(i7)).mo5514measureBRTryo0(Constraints.m6582copyZbe2FdA$default(j2, 0, 0, 0, Constraints.m6590getMaxHeightimpl(j2) / 2, 3, null)));
                                }
                                final ArrayList arrayList4 = arrayList3;
                                return MeasureScope.layout$default(measureScope, Constraints.m6591getMaxWidthimpl(j2), Constraints.m6590getMaxHeightimpl(j2), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1.1
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
                                        Placeable.PlacementScope.place$default(placementScope, arrayList4.get(0), 0, 0, 0.0f, 4, null);
                                        Placeable.PlacementScope.place$default(placementScope, arrayList4.get(1), 0, arrayList4.get(0).getHeight(), 0.0f, 4, null);
                                        Placeable.PlacementScope.place$default(placementScope, placeableMo5514measureBRTryo0, 0, arrayList4.get(0).getHeight() - (placeableMo5514measureBRTryo0.getHeight() / 2), 0.0f, 4, null);
                                    }
                                }, 4, null);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                composerStartRestartGroup.updateRememberedValue(timePickerKt$VerticalPeriodToggle$measurePolicy$1$1RememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Shape value = ShapesKt.getValue(TimePickerTokens.INSTANCE.getPeriodSelectorContainerShape(), composerStartRestartGroup, 6);
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            CornerBasedShape cornerBasedShape = (CornerBasedShape) value;
            CornerBasedShape pVar = ShapesKt.top(cornerBasedShape);
            CornerBasedShape cornerBasedShapeBottom = ShapesKt.bottom(cornerBasedShape);
            int i5 = i3 & 14;
            int i6 = (i5 + 3072) - (i5 & 3072);
            int i7 = (-1) - (((-1) - i3) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION));
            PeriodToggleImpl(modifier, timePickerState, timePickerColors, (MeasurePolicy) timePickerKt$VerticalPeriodToggle$measurePolicy$1$1RememberedValue, pVar, cornerBasedShapeBottom, composerStartRestartGroup, ((i6 + i7) - (i6 & i7)) | ((-1) - (((-1) - i3) | ((-1) - 896))));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.VerticalPeriodToggle.1
                final /* synthetic */ int $$changed;
                final /* synthetic */ TimePickerColors $colors;
                final /* synthetic */ TimePickerState $state;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C07101(TimePickerState timePickerState2, TimePickerColors timePickerColors2, int i22) {
                    super(2);
                    timePickerState = timePickerState2;
                    timePickerColors = timePickerColors2;
                    i = i22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    Modifier modifier2 = modifier;
                    TimePickerState timePickerState2 = timePickerState;
                    TimePickerColors timePickerColors2 = timePickerColors;
                    int i32 = i;
                    TimePickerKt.VerticalPeriodToggle(modifier2, timePickerState2, timePickerColors2, composer2, RecomposeScopeImplKt.updateChangedFlags((i32 + 1) - (i32 & 1)));
                }
            });
        }
    }

    public static final void PeriodToggleImpl(Modifier modifier, final TimePickerState timePickerState, TimePickerColors timePickerColors, MeasurePolicy measurePolicy, Shape shape, Shape shape2, Composer composer, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1374241901);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(PeriodToggleImpl)P(3,5!1,2,4)1258@51953L5,1259@52008L41,1263@52129L128,1260@52054L1189:TimePicker.kt#uh7d8r");
        if ((i2 + 6) - (i2 | 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - ((i2 + 64) - (i2 | 64) == 0 ? composerStartRestartGroup.changed(timePickerState) : composerStartRestartGroup.changedInstance(timePickerState) ? 32 : 16)));
        }
        if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i3 |= composerStartRestartGroup.changed(timePickerColors) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changed(measurePolicy) ? 2048 : 1024)));
        }
        if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            int i4 = composerStartRestartGroup.changed(shape) ? 16384 : 8192;
            i3 = (i3 + i4) - (i3 & i4);
        }
        if ((196608 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(shape2) ? 131072 : 65536;
        }
        if ((74899 + i3) - (74899 | i3) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1374241901, i3, -1, "androidx.compose.material3.PeriodToggleImpl (TimePicker.kt:1254)");
            }
            BorderStroke borderStrokeM600BorderStrokecXLIe8U = BorderStrokeKt.m600BorderStrokecXLIe8U(TimePickerTokens.INSTANCE.m3564getPeriodSelectorOutlineWidthD9Ej5fM(), timePickerColors.m2721getPeriodSelectorBorderColor0d7_KjU());
            Shape value = ShapesKt.getValue(TimePickerTokens.INSTANCE.getPeriodSelectorContainerShape(), composerStartRestartGroup, 6);
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            CornerBasedShape cornerBasedShape = (CornerBasedShape) value;
            Strings.Companion companion = Strings.Companion;
            final String strM2993getString2EP1pXo = Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(R.string.m3c_time_picker_period_toggle_description), composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2132305224, "CC(remember):TimePicker.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(strM2993getString2EP1pXo);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$PeriodToggleImpl$1$1
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
                        SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM2993getString2EP1pXo);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierBorder = BorderKt.border(SelectableGroupKt.selectableGroup(SemanticsModifierKt.semantics$default(modifier, false, (Function1) objRememberedValue, 1, null)), borderStrokeM600BorderStrokecXLIe8U, cornerBasedShape);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBorder);
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
            Updater.m3678setimpl(composerM3671constructorimpl, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 822309452, "C1274@52547L29,1271@52427L283,1279@52723L219,1288@53072L28,1285@52955L272:TimePicker.kt#uh7d8r");
            boolean z2 = true;
            boolean z3 = !timePickerState.isAfternoon();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -250565484, "CC(remember):TimePicker.kt#9igjgp");
            int i5 = i3 & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION;
            if (i5 != 32 && ((64 & i3) == 0 || !composerStartRestartGroup.changedInstance(timePickerState))) {
                z2 = false;
            }
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.TimePickerKt$PeriodToggleImpl$2$1$1
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
                        timePickerState.setAfternoon(false);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            int i6 = i3 >> 9;
            int i7 = (i3 << 3) & 7168;
            boolean z4 = true;
            ToggleItem(z3, shape, (Function0) objRememberedValue2, timePickerColors, ComposableSingletons$TimePickerKt.INSTANCE.m2007getLambda1$material3_release(), composerStartRestartGroup, (-1) - (((-1) - (((i6 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i6 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)) | 24576)) & ((-1) - i7)));
            SpacerKt.Spacer(BackgroundKt.m573backgroundbw27NRU$default(SizeKt.fillMaxSize$default(ZIndexModifierKt.zIndex(LayoutIdKt.layoutId(Modifier.Companion, "Spacer"), 2.0f), 0.0f, 1, null), timePickerColors.m2721getPeriodSelectorBorderColor0d7_KjU(), null, 2, null), composerStartRestartGroup, 0);
            boolean zIsAfternoon = timePickerState.isAfternoon();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -250548685, "CC(remember):TimePicker.kt#9igjgp");
            if (i5 != 32 && ((-1) - (((-1) - i3) | ((-1) - 64)) == 0 || !composerStartRestartGroup.changedInstance(timePickerState))) {
                z4 = false;
            }
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.TimePickerKt$PeriodToggleImpl$2$2$1
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
                        timePickerState.setAfternoon(true);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            int i8 = i3 >> 12;
            ToggleItem(zIsAfternoon, shape2, (Function0) objRememberedValue3, timePickerColors, ComposableSingletons$TimePickerKt.INSTANCE.m2008getLambda2$material3_release(), composerStartRestartGroup, (-1) - (((-1) - ((-1) - (((-1) - ((i8 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i8 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))) & ((-1) - 24576)))) & ((-1) - i7)));
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.PeriodToggleImpl.3
                final /* synthetic */ int $$changed;
                final /* synthetic */ TimePickerColors $colors;
                final /* synthetic */ Shape $endShape;
                final /* synthetic */ MeasurePolicy $measurePolicy;
                final /* synthetic */ Shape $startShape;
                final /* synthetic */ TimePickerState $state;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C07053(final TimePickerState timePickerState2, TimePickerColors timePickerColors2, MeasurePolicy measurePolicy2, Shape shape3, Shape shape22, int i22) {
                    super(2);
                    timePickerState = timePickerState2;
                    timePickerColors = timePickerColors2;
                    measurePolicy = measurePolicy2;
                    shape = shape3;
                    shape = shape22;
                    i = i22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    TimePickerKt.PeriodToggleImpl(modifier, timePickerState, timePickerColors, measurePolicy, shape, shape, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))));
                }
            });
        }
    }

    public static final void ToggleItem(final boolean z2, Shape shape, Function0<Unit> function0, TimePickerColors timePickerColors, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1937408098);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ToggleItem)P(!1,4,3)1310@53677L22,1316@53868L124,1308@53569L429:TimePicker.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            int i4 = composerStartRestartGroup.changed(z2) ? 4 : 2;
            i3 = (i4 + i2) - (i4 & i2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changed(shape) ? 32 : 16)));
        }
        if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i5 = composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
            i3 = (i3 + i5) - (i3 & i5);
        }
        if ((i2 + 3072) - (i2 | 3072) == 0) {
            int i6 = composerStartRestartGroup.changed(timePickerColors) ? 2048 : 1024;
            i3 = (i3 + i6) - (i3 & i6);
        }
        if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            int i7 = composerStartRestartGroup.changedInstance(function3) ? 16384 : 8192;
            i3 = (i3 + i7) - (i3 & i7);
        }
        if ((i3 + 9363) - (9363 | i3) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1937408098, i3, -1, "androidx.compose.material3.ToggleItem (TimePicker.kt:1304)");
            }
            long jM2732periodSelectorContentColorvNxB06k$material3_release = timePickerColors.m2732periodSelectorContentColorvNxB06k$material3_release(z2);
            long jM2731periodSelectorContainerColorvNxB06k$material3_release = timePickerColors.m2731periodSelectorContainerColorvNxB06k$material3_release(z2);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(ZIndexModifierKt.zIndex(Modifier.Companion, z2 ? 0.0f : 1.0f), 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -857429536, "CC(remember):TimePicker.kt#9igjgp");
            boolean z3 = (i3 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ToggleItem$1$1
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
                        SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver, z2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            int i8 = (i3 >> 6) & 14;
            int i9 = i3 << 6;
            ButtonKt.TextButton(function0, SemanticsModifierKt.semantics$default(modifierFillMaxSize$default, false, (Function1) objRememberedValue, 1, null), false, shape, ButtonDefaults.INSTANCE.m1837textButtonColorsro_MJ88(jM2731periodSelectorContainerColorvNxB06k$material3_release, jM2732periodSelectorContentColorvNxB06k$material3_release, 0L, 0L, composerStartRestartGroup, 24576, 12), null, null, PaddingKt.m1011PaddingValues0680j_4(Dp.m6638constructorimpl(0)), null, function3, composerStartRestartGroup, ((i8 + 12582912) - (i8 & 12582912)) | ((i9 + 7168) - (i9 | 7168)) | ((-1) - (((-1) - (i3 << 15)) | ((-1) - 1879048192))), IptcDirectory.TAG_UNIQUE_OBJECT_NAME);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ToggleItem.2
                final /* synthetic */ int $$changed;
                final /* synthetic */ boolean $checked;
                final /* synthetic */ TimePickerColors $colors;
                final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;
                final /* synthetic */ Function0<Unit> $onClick;
                final /* synthetic */ Shape $shape;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C07082(final boolean z22, Shape shape2, Function0<Unit> function02, TimePickerColors timePickerColors2, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32, int i22) {
                    super(2);
                    z = z22;
                    shape = shape2;
                    function0 = function02;
                    timePickerColors = timePickerColors2;
                    function3 = function32;
                    i = i22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    TimePickerKt.ToggleItem(z, shape, function0, timePickerColors, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void DisplaySeparator(Modifier modifier, Composer composer, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(2100674302);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(DisplaySeparator)1326@54104L7,1335@54375L172:TimePicker.kt#uh7d8r");
        if ((i2 + 6) - (6 | i2) == 0) {
            i3 = (-1) - (((-1) - (composerStartRestartGroup.changed(modifier) ? 4 : 2)) & ((-1) - i2));
        } else {
            i3 = i2;
        }
        if ((3 & i3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2100674302, i3, -1, "androidx.compose.material3.DisplaySeparator (TimePicker.kt:1324)");
            }
            ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localTextStyle);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            TextStyle textStyleM6136copyp1EtxEg$default = TextStyle.m6136copyp1EtxEg$default((TextStyle) objConsume, 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.Companion.m6527getCentere0LSkKk(), 0, 0L, null, null, new LineHeightStyle(LineHeightStyle.Alignment.Companion.m6504getCenterPIaL0Z0(), LineHeightStyle.Trim.Companion.m6516getBothEVpEnUU(), null), 0, 0, null, 15695871, null);
            Modifier modifierClearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(modifier, C07011.INSTANCE);
            Alignment center = Alignment.Companion.getCenter();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierClearAndSetSemantics);
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
            Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -789568360, "C1336@54520L5,1336@54471L70:TimePicker.kt#uh7d8r");
            TextKt.m2711Text4IGK_g(Global.COLON, (Modifier) null, ColorSchemeKt.getValue(TimeInputTokens.INSTANCE.getTimeFieldSeparatorColor(), composerStartRestartGroup, 6), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleM6136copyp1EtxEg$default, composerStartRestartGroup, 6, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.DisplaySeparator.3
                final /* synthetic */ int $$changed;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(int i22) {
                    super(2);
                    i = i22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    TimePickerKt.DisplaySeparator(modifier, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.TimePickerKt$DisplaySeparator$1 */
    /* JADX INFO: compiled from: TimePicker.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bDZc|İOيH\u000b\\A'\"Z\u0012>\u000f¡n96E"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ&x>)\u0015upMsc*Nz8GY$", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C07011 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
        public static final C07011 INSTANCE = ;

        C07011() {
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            invoke2(semanticsPropertyReceiver);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: TimeSelector-SAnMeKU */
    public static final void m2740TimeSelectorSAnMeKU(final Modifier modifier, final int i2, final TimePickerState timePickerState, final int i3, final TimePickerColors timePickerColors, Composer composer, final int i4) {
        int i5;
        int iM2923constructorimpl;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1148055889);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TimeSelector)P(1,4,3,2:c#material3.TimePickerSelectionMode)1351@54864L214,1363@55302L124,1373@55637L5,1367@55446L117,1375@55682L497,1361@55218L961:TimePicker.kt#uh7d8r");
        if ((i4 + 6) - (i4 | 6) == 0) {
            i5 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 + 48) - (i4 | 48) == 0) {
            int i6 = composerStartRestartGroup.changed(i2) ? 32 : 16;
            i5 = (i5 + i6) - (i5 & i6);
        }
        if ((i4 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i4 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - ((-1) - (((-1) - i4) | ((-1) - 512)) == 0 ? composerStartRestartGroup.changed(timePickerState) : composerStartRestartGroup.changedInstance(timePickerState) ? 256 : 128)));
        }
        if ((i4 & 3072) == 0) {
            i5 |= composerStartRestartGroup.changed(i3) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(timePickerColors) ? 16384 : 8192)));
        }
        if ((i5 + 9363) - (9363 | i5) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1148055889, i5, -1, "androidx.compose.material3.TimeSelector (TimePicker.kt:1348)");
            }
            boolean zM2765equalsimpl0 = TimePickerSelectionMode.m2765equalsimpl0(timePickerState.mo1776getSelectionyecRtBI(), i3);
            if (TimePickerSelectionMode.m2765equalsimpl0(i3, TimePickerSelectionMode.Companion.m2769getHouryecRtBI())) {
                Strings.Companion companion = Strings.Companion;
                iM2923constructorimpl = Strings.m2923constructorimpl(R.string.m3c_time_picker_hour_selection);
            } else {
                Strings.Companion companion2 = Strings.Companion;
                iM2923constructorimpl = Strings.m2923constructorimpl(R.string.m3c_time_picker_minute_selection);
            }
            final String strM2993getString2EP1pXo = Strings_androidKt.m2993getString2EP1pXo(iM2923constructorimpl, composerStartRestartGroup, 0);
            long jM2733timeSelectorContainerColorvNxB06k$material3_release = timePickerColors.m2733timeSelectorContainerColorvNxB06k$material3_release(zM2765equalsimpl0);
            final long jM2734timeSelectorContentColorvNxB06k$material3_release = timePickerColors.m2734timeSelectorContentColorvNxB06k$material3_release(zM2765equalsimpl0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1840519339, "CC(remember):TimePicker.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(strM2993getString2EP1pXo);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$1$1
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
                        SemanticsPropertiesKt.m5952setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m5937getRadioButtono7Vup1c());
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM2993getString2EP1pXo);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierSemantics = SemanticsModifierKt.semantics(modifier, true, (Function1) objRememberedValue);
            Shape value = ShapesKt.getValue(TimePickerTokens.INSTANCE.getTimeSelectorContainerShape(), composerStartRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1840523940, "CC(remember):TimePicker.kt#9igjgp");
            int i7 = (7168 & i5) == 2048 ? 1 : 0;
            int i8 = ((i5 + 896) - (896 | i5) == 256 || ((-1) - (((-1) - i5) | ((-1) - 512)) != 0 && composerStartRestartGroup.changedInstance(timePickerState))) ? 1 : 0;
            boolean z2 = (i7 + i8) - (i7 & i8) == 1;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$2$1
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
                        if (TimePickerSelectionMode.m2765equalsimpl0(i3, timePickerState.mo1776getSelectionyecRtBI())) {
                            return;
                        }
                        timePickerState.mo1777setSelection6_8s6DQ(i3);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            SurfaceKt.m2562Surfaced85dljk(zM2765equalsimpl0, (Function0<Unit>) objRememberedValue2, modifierSemantics, false, value, jM2733timeSelectorContainerColorvNxB06k$material3_release, 0L, 0.0f, 0.0f, (BorderStroke) null, (MutableInteractionSource) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-1477282471, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i9) {
                    ComposerKt.sourceInformation(composer2, "C1377@55734L152,1383@55896L277:TimePicker.kt#uh7d8r");
                    if ((i9 + 3) - (3 | i9) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1477282471, i9, -1, "androidx.compose.material3.TimeSelector.<anonymous> (TimePicker.kt:1376)");
                        }
                        final String strM2748numberContentDescriptiondSwYdS4 = TimePickerKt.m2748numberContentDescriptiondSwYdS4(i3, timePickerState.is24hour(), i2, composer2, 0);
                        Alignment center = Alignment.Companion.getCenter();
                        int i10 = i2;
                        long j2 = jM2734timeSelectorContentColorvNxB06k$material3_release;
                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        Modifier.Companion companion3 = Modifier.Companion;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, companion3);
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
                        ComposerKt.sourceInformationMarkerStart(composer2, 396102018, "C1385@56003L48,1384@55951L212:TimePicker.kt#uh7d8r");
                        Modifier.Companion companion4 = Modifier.Companion;
                        ComposerKt.sourceInformationMarkerStart(composer2, 705515645, "CC(remember):TimePicker.kt#9igjgp");
                        boolean zChanged2 = composer2.changed(strM2748numberContentDescriptiondSwYdS4);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                            objRememberedValue3 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$3$1$1$1
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
                                    SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM2748numberContentDescriptiondSwYdS4);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        TextKt.m2711Text4IGK_g(CalendarLocale_jvmKt.toLocalString$default(i10, 2, 0, false, 6, null), SemanticsModifierKt.semantics$default(companion4, false, (Function1) objRememberedValue3, 1, null), j2, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131064);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
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
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 0, 48, 1992);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i9) {
                    TimePickerKt.m2740TimeSelectorSAnMeKU(modifier, i2, timePickerState, i3, timePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i4 | 1));
                }
            });
        }
    }

    public static final void ClockFace(AnalogTimePickerState analogTimePickerState, TimePickerColors timePickerColors, boolean z2, Composer composer, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1170157036);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ClockFace)P(2,1)1521@60272L2018,1513@59878L2412:TimePicker.kt#uh7d8r");
        if ((6 & i2) == 0) {
            i3 = (-1) - (((-1) - (composerStartRestartGroup.changedInstance(analogTimePickerState) ? 4 : 2)) & ((-1) - i2));
        } else {
            i3 = i2;
        }
        if ((48 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(timePickerColors) ? 32 : 16;
        }
        if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (384 | i2) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i3 + 147) - (147 | i3) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1170157036, i3, -1, "androidx.compose.material3.ClockFace (TimePicker.kt:1512)");
            }
            CrossfadeKt.Crossfade(analogTimePickerState.getClockFaceValues(), drawSelector(SizeKt.m1063size3ABfNKs(BackgroundKt.m572backgroundbw27NRU(Modifier.Companion, timePickerColors.m2717getClockDialColor0d7_KjU(), RoundedCornerShapeKt.getCircleShape()).then(new ClockDialModifier(analogTimePickerState, z2, analogTimePickerState.mo1776getSelectionyecRtBI(), null)), TimePickerTokens.INSTANCE.m3557getClockDialContainerSizeD9Ej5fM()), analogTimePickerState, timePickerColors), AnimationSpecKt.tween$default(200, 0, null, 6, null), (String) null, ComposableLambdaKt.rememberComposableLambda(-1022006568, true, new Function3<IntList, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.1
                final /* synthetic */ boolean $autoSwitchToMinute;
                final /* synthetic */ AnalogTimePickerState $state;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C06991(AnalogTimePickerState analogTimePickerState2, boolean z22) {
                    super(3);
                    analogTimePickerState = analogTimePickerState2;
                    z = z22;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(IntList intList, Composer composer2, Integer num) {
                    invoke(intList, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: androidx.compose.material3.TimePickerKt$ClockFace$1$1 */
                /* JADX INFO: compiled from: TimePicker.kt */
                /* JADX INFO: loaded from: classes2.dex */
                @InterfaceC1492Gx
                @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bDZc|İOيH\u000b\\A'\"Z\u0012>\u000f¡n96E"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ&x>)\u0015upMsc*Nz8GY$", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
                static final class C00991 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
                    public static final C00991 INSTANCE = ;

                    C00991() {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.selectableGroup(semanticsPropertyReceiver);
                    }
                }

                public final void invoke(IntList intList, Composer composer2, int i4) {
                    ComposerKt.sourceInformation(composer2, "C1525@60456L1828,1522@60292L1992:TimePicker.kt#uh7d8r");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1022006568, i4, -1, "androidx.compose.material3.ClockFace.<anonymous> (TimePicker.kt:1522)");
                    }
                    TimePickerKt.m2737CircularLayoutuFdPcIQ(SemanticsModifierKt.semantics$default(SizeKt.m1063size3ABfNKs(Modifier.Companion, TimePickerTokens.INSTANCE.m3557getClockDialContainerSizeD9Ej5fM()), false, C00991.INSTANCE, 1, null), TimePickerKt.OuterCircleSizeRadius, ComposableLambdaKt.rememberComposableLambda(-320307952, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.1.2
                        final /* synthetic */ boolean $autoSwitchToMinute;
                        final /* synthetic */ IntList $screen;
                        final /* synthetic */ AnalogTimePickerState $state;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass2(IntList intList2, AnalogTimePickerState analogTimePickerState2, boolean z3) {
                            super(2);
                            intList = intList2;
                            analogTimePickerState = analogTimePickerState2;
                            z = z3;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i5) {
                            ComposerKt.sourceInformation(composer3, "C1528@60589L1685,1526@60470L1804:TimePicker.kt#uh7d8r");
                            if ((i5 & 3) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-320307952, i5, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous> (TimePicker.kt:1526)");
                                }
                                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4168boximpl(timePickerColors.m2715clockDialContentColorvNxB06k$material3_release(false))), ComposableLambdaKt.rememberComposableLambda(1992872400, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.1.2.1
                                    final /* synthetic */ boolean $autoSwitchToMinute;
                                    final /* synthetic */ AnalogTimePickerState $state;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    C01001(AnalogTimePickerState analogTimePickerState2, boolean z3) {
                                        super(2);
                                        analogTimePickerState = analogTimePickerState2;
                                        z = z3;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i6) {
                                        int i7;
                                        ComposerKt.sourceInformation(composer4, "C1551@61690L552,1545@61343L899:TimePicker.kt#uh7d8r");
                                        if ((-1) - (((-1) - i6) | ((-1) - 3)) != 2 || !composer4.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1992872400, i6, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1529)");
                                            }
                                            composer4.startReplaceGroup(1547046870);
                                            ComposerKt.sourceInformation(composer4, "*1537@61008L36,1536@60943L271");
                                            int size = intList.getSize();
                                            AnalogTimePickerState analogTimePickerState2 = analogTimePickerState;
                                            IntList intList2 = intList;
                                            boolean z3 = z;
                                            for (final int i8 = 0; i8 < size; i8++) {
                                                if (!analogTimePickerState2.is24hour() || TimePickerSelectionMode.m2765equalsimpl0(analogTimePickerState2.mo1776getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m2770getMinuteyecRtBI())) {
                                                    i7 = intList2.get(i8);
                                                } else {
                                                    i7 = intList2.get(i8) % 12;
                                                }
                                                Modifier.Companion companion = Modifier.Companion;
                                                ComposerKt.sourceInformationMarkerStart(composer4, 707420712, "CC(remember):TimePicker.kt#9igjgp");
                                                boolean zChanged = composer4.changed(i8);
                                                Object objRememberedValue = composer4.rememberedValue();
                                                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                                                    objRememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1$1$1$1
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
                                                            SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, i8);
                                                        }
                                                    };
                                                    composer4.updateRememberedValue(objRememberedValue);
                                                }
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion, false, (Function1) objRememberedValue, 1, null), analogTimePickerState2, i7, z3, composer4, 0);
                                            }
                                            composer4.endReplaceGroup();
                                            if (TimePickerSelectionMode.m2765equalsimpl0(analogTimePickerState.mo1776getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m2769getHouryecRtBI()) && analogTimePickerState.is24hour()) {
                                                TimePickerKt.m2737CircularLayoutuFdPcIQ(BackgroundKt.m572backgroundbw27NRU(SizeKt.m1063size3ABfNKs(LayoutIdKt.layoutId(Modifier.Companion, LayoutId.InnerCircle), TimePickerTokens.INSTANCE.m3557getClockDialContainerSizeD9Ej5fM()), Color.Companion.m4213getTransparent0d7_KjU(), RoundedCornerShapeKt.getCircleShape()), TimePickerKt.InnerCircleRadius, ComposableLambdaKt.rememberComposableLambda(-205464413, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.1.2.1.2
                                                    final /* synthetic */ boolean $autoSwitchToMinute;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    C01012(boolean z4) {
                                                        super(2);
                                                        z = z4;
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                        invoke(composer5, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Composer composer5, int i9) {
                                                        ComposerKt.sourceInformation(composer5, "C*1556@61951L41,1554@61842L352:TimePicker.kt#uh7d8r");
                                                        if ((i9 & 3) != 2 || !composer5.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-205464413, i9, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1552)");
                                                            }
                                                            int size2 = TimePickerKt.ExtraHours.getSize();
                                                            AnalogTimePickerState analogTimePickerState3 = analogTimePickerState;
                                                            boolean z4 = z;
                                                            for (final int i10 = 0; i10 < size2; i10++) {
                                                                int i11 = TimePickerKt.ExtraHours.get(i10);
                                                                Modifier.Companion companion2 = Modifier.Companion;
                                                                ComposerKt.sourceInformationMarkerStart(composer5, 1677472780, "CC(remember):TimePicker.kt#9igjgp");
                                                                boolean zChanged2 = composer5.changed(i10);
                                                                Object objRememberedValue2 = composer5.rememberedValue();
                                                                if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                                                                    objRememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1$2$1$1$1
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
                                                                            SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 12 + i10);
                                                                        }
                                                                    };
                                                                    composer5.updateRememberedValue(objRememberedValue2);
                                                                }
                                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion2, false, (Function1) objRememberedValue2, 1, null), analogTimePickerState3, i11, z4, composer5, 0);
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        composer5.skipToGroupEnd();
                                                    }
                                                }, composer4, 54), composer4, 432, 0);
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }

                                    /* JADX INFO: renamed from: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1$2 */
                                    /* JADX INFO: compiled from: TimePicker.kt */
                                    @InterfaceC1492Gx
                                    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJc\u0003İY\u0006^\ntK֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq>"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
                                    static final class C01012 extends Lambda implements Function2<Composer, Integer, Unit> {
                                        final /* synthetic */ boolean $autoSwitchToMinute;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        C01012(boolean z4) {
                                            super(2);
                                            z = z4;
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                            invoke(composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer5, int i9) {
                                            ComposerKt.sourceInformation(composer5, "C*1556@61951L41,1554@61842L352:TimePicker.kt#uh7d8r");
                                            if ((i9 & 3) != 2 || !composer5.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-205464413, i9, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1552)");
                                                }
                                                int size2 = TimePickerKt.ExtraHours.getSize();
                                                AnalogTimePickerState analogTimePickerState3 = analogTimePickerState;
                                                boolean z4 = z;
                                                for (final int i10 = 0; i10 < size2; i10++) {
                                                    int i11 = TimePickerKt.ExtraHours.get(i10);
                                                    Modifier.Companion companion2 = Modifier.Companion;
                                                    ComposerKt.sourceInformationMarkerStart(composer5, 1677472780, "CC(remember):TimePicker.kt#9igjgp");
                                                    boolean zChanged2 = composer5.changed(i10);
                                                    Object objRememberedValue2 = composer5.rememberedValue();
                                                    if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                                                        objRememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1$2$1$1$1
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
                                                                SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 12 + i10);
                                                            }
                                                        };
                                                        composer5.updateRememberedValue(objRememberedValue2);
                                                    }
                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                    TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion2, false, (Function1) objRememberedValue2, 1, null), analogTimePickerState3, i11, z4, composer5, 0);
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer5.skipToGroupEnd();
                                        }
                                    }
                                }, composer3, 54), composer3, (-1) - (((-1) - ProvidedValue.$stable) & ((-1) - 48)));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }

                        /* JADX INFO: renamed from: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1 */
                        /* JADX INFO: compiled from: TimePicker.kt */
                        @InterfaceC1492Gx
                        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJc\u0003İY\u0006^\ntK֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq>"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
                        static final class C01001 extends Lambda implements Function2<Composer, Integer, Unit> {
                            final /* synthetic */ boolean $autoSwitchToMinute;
                            final /* synthetic */ AnalogTimePickerState $state;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C01001(AnalogTimePickerState analogTimePickerState2, boolean z3) {
                                super(2);
                                analogTimePickerState = analogTimePickerState2;
                                z = z3;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i6) {
                                int i7;
                                ComposerKt.sourceInformation(composer4, "C1551@61690L552,1545@61343L899:TimePicker.kt#uh7d8r");
                                if ((-1) - (((-1) - i6) | ((-1) - 3)) != 2 || !composer4.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1992872400, i6, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1529)");
                                    }
                                    composer4.startReplaceGroup(1547046870);
                                    ComposerKt.sourceInformation(composer4, "*1537@61008L36,1536@60943L271");
                                    int size = intList.getSize();
                                    AnalogTimePickerState analogTimePickerState2 = analogTimePickerState;
                                    IntList intList2 = intList;
                                    boolean z3 = z;
                                    for (final int i8 = 0; i8 < size; i8++) {
                                        if (!analogTimePickerState2.is24hour() || TimePickerSelectionMode.m2765equalsimpl0(analogTimePickerState2.mo1776getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m2770getMinuteyecRtBI())) {
                                            i7 = intList2.get(i8);
                                        } else {
                                            i7 = intList2.get(i8) % 12;
                                        }
                                        Modifier.Companion companion = Modifier.Companion;
                                        ComposerKt.sourceInformationMarkerStart(composer4, 707420712, "CC(remember):TimePicker.kt#9igjgp");
                                        boolean zChanged = composer4.changed(i8);
                                        Object objRememberedValue = composer4.rememberedValue();
                                        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                                            objRememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1$1$1$1
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
                                                    SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, i8);
                                                }
                                            };
                                            composer4.updateRememberedValue(objRememberedValue);
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion, false, (Function1) objRememberedValue, 1, null), analogTimePickerState2, i7, z3, composer4, 0);
                                    }
                                    composer4.endReplaceGroup();
                                    if (TimePickerSelectionMode.m2765equalsimpl0(analogTimePickerState.mo1776getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m2769getHouryecRtBI()) && analogTimePickerState.is24hour()) {
                                        TimePickerKt.m2737CircularLayoutuFdPcIQ(BackgroundKt.m572backgroundbw27NRU(SizeKt.m1063size3ABfNKs(LayoutIdKt.layoutId(Modifier.Companion, LayoutId.InnerCircle), TimePickerTokens.INSTANCE.m3557getClockDialContainerSizeD9Ej5fM()), Color.Companion.m4213getTransparent0d7_KjU(), RoundedCornerShapeKt.getCircleShape()), TimePickerKt.InnerCircleRadius, ComposableLambdaKt.rememberComposableLambda(-205464413, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.1.2.1.2
                                            final /* synthetic */ boolean $autoSwitchToMinute;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            C01012(boolean z4) {
                                                super(2);
                                                z = z4;
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                invoke(composer5, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer5, int i9) {
                                                ComposerKt.sourceInformation(composer5, "C*1556@61951L41,1554@61842L352:TimePicker.kt#uh7d8r");
                                                if ((i9 & 3) != 2 || !composer5.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-205464413, i9, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1552)");
                                                    }
                                                    int size2 = TimePickerKt.ExtraHours.getSize();
                                                    AnalogTimePickerState analogTimePickerState3 = analogTimePickerState;
                                                    boolean z4 = z;
                                                    for (final int i10 = 0; i10 < size2; i10++) {
                                                        int i11 = TimePickerKt.ExtraHours.get(i10);
                                                        Modifier.Companion companion2 = Modifier.Companion;
                                                        ComposerKt.sourceInformationMarkerStart(composer5, 1677472780, "CC(remember):TimePicker.kt#9igjgp");
                                                        boolean zChanged2 = composer5.changed(i10);
                                                        Object objRememberedValue2 = composer5.rememberedValue();
                                                        if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                                                            objRememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1$2$1$1$1
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
                                                                    SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 12 + i10);
                                                                }
                                                            };
                                                            composer5.updateRememberedValue(objRememberedValue2);
                                                        }
                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                        TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion2, false, (Function1) objRememberedValue2, 1, null), analogTimePickerState3, i11, z4, composer5, 0);
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer5.skipToGroupEnd();
                                            }
                                        }, composer4, 54), composer4, 432, 0);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }

                            /* JADX INFO: renamed from: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1$2 */
                            /* JADX INFO: compiled from: TimePicker.kt */
                            @InterfaceC1492Gx
                            @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJc\u0003İY\u0006^\ntK֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq>"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
                            static final class C01012 extends Lambda implements Function2<Composer, Integer, Unit> {
                                final /* synthetic */ boolean $autoSwitchToMinute;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                C01012(boolean z4) {
                                    super(2);
                                    z = z4;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                    invoke(composer5, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer5, int i9) {
                                    ComposerKt.sourceInformation(composer5, "C*1556@61951L41,1554@61842L352:TimePicker.kt#uh7d8r");
                                    if ((i9 & 3) != 2 || !composer5.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-205464413, i9, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1552)");
                                        }
                                        int size2 = TimePickerKt.ExtraHours.getSize();
                                        AnalogTimePickerState analogTimePickerState3 = analogTimePickerState;
                                        boolean z4 = z;
                                        for (final int i10 = 0; i10 < size2; i10++) {
                                            int i11 = TimePickerKt.ExtraHours.get(i10);
                                            Modifier.Companion companion2 = Modifier.Companion;
                                            ComposerKt.sourceInformationMarkerStart(composer5, 1677472780, "CC(remember):TimePicker.kt#9igjgp");
                                            boolean zChanged2 = composer5.changed(i10);
                                            Object objRememberedValue2 = composer5.rememberedValue();
                                            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                                                objRememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1$2$1$1$1
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
                                                        SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 12 + i10);
                                                    }
                                                };
                                                composer5.updateRememberedValue(objRememberedValue2);
                                            }
                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                            TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion2, false, (Function1) objRememberedValue2, 1, null), analogTimePickerState3, i11, z4, composer5, 0);
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer5.skipToGroupEnd();
                                }
                            }
                        }
                    }, composer2, 54), composer2, 432, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* JADX INFO: renamed from: androidx.compose.material3.TimePickerKt$ClockFace$1$2 */
                /* JADX INFO: compiled from: TimePicker.kt */
                @InterfaceC1492Gx
                @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJc\u0003İY\u0006^\ntK֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq>"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
                static final class AnonymousClass2 extends Lambda implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ boolean $autoSwitchToMinute;
                    final /* synthetic */ IntList $screen;
                    final /* synthetic */ AnalogTimePickerState $state;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass2(IntList intList2, AnalogTimePickerState analogTimePickerState2, boolean z3) {
                        super(2);
                        intList = intList2;
                        analogTimePickerState = analogTimePickerState2;
                        z = z3;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        ComposerKt.sourceInformation(composer3, "C1528@60589L1685,1526@60470L1804:TimePicker.kt#uh7d8r");
                        if ((i5 & 3) != 2 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-320307952, i5, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous> (TimePicker.kt:1526)");
                            }
                            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4168boximpl(timePickerColors.m2715clockDialContentColorvNxB06k$material3_release(false))), ComposableLambdaKt.rememberComposableLambda(1992872400, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.1.2.1
                                final /* synthetic */ boolean $autoSwitchToMinute;
                                final /* synthetic */ AnalogTimePickerState $state;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                C01001(AnalogTimePickerState analogTimePickerState2, boolean z3) {
                                    super(2);
                                    analogTimePickerState = analogTimePickerState2;
                                    z = z3;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i6) {
                                    int i7;
                                    ComposerKt.sourceInformation(composer4, "C1551@61690L552,1545@61343L899:TimePicker.kt#uh7d8r");
                                    if ((-1) - (((-1) - i6) | ((-1) - 3)) != 2 || !composer4.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1992872400, i6, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1529)");
                                        }
                                        composer4.startReplaceGroup(1547046870);
                                        ComposerKt.sourceInformation(composer4, "*1537@61008L36,1536@60943L271");
                                        int size = intList.getSize();
                                        AnalogTimePickerState analogTimePickerState2 = analogTimePickerState;
                                        IntList intList2 = intList;
                                        boolean z3 = z;
                                        for (final int i8 = 0; i8 < size; i8++) {
                                            if (!analogTimePickerState2.is24hour() || TimePickerSelectionMode.m2765equalsimpl0(analogTimePickerState2.mo1776getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m2770getMinuteyecRtBI())) {
                                                i7 = intList2.get(i8);
                                            } else {
                                                i7 = intList2.get(i8) % 12;
                                            }
                                            Modifier.Companion companion = Modifier.Companion;
                                            ComposerKt.sourceInformationMarkerStart(composer4, 707420712, "CC(remember):TimePicker.kt#9igjgp");
                                            boolean zChanged = composer4.changed(i8);
                                            Object objRememberedValue = composer4.rememberedValue();
                                            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                                                objRememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1$1$1$1
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
                                                        SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, i8);
                                                    }
                                                };
                                                composer4.updateRememberedValue(objRememberedValue);
                                            }
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion, false, (Function1) objRememberedValue, 1, null), analogTimePickerState2, i7, z3, composer4, 0);
                                        }
                                        composer4.endReplaceGroup();
                                        if (TimePickerSelectionMode.m2765equalsimpl0(analogTimePickerState.mo1776getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m2769getHouryecRtBI()) && analogTimePickerState.is24hour()) {
                                            TimePickerKt.m2737CircularLayoutuFdPcIQ(BackgroundKt.m572backgroundbw27NRU(SizeKt.m1063size3ABfNKs(LayoutIdKt.layoutId(Modifier.Companion, LayoutId.InnerCircle), TimePickerTokens.INSTANCE.m3557getClockDialContainerSizeD9Ej5fM()), Color.Companion.m4213getTransparent0d7_KjU(), RoundedCornerShapeKt.getCircleShape()), TimePickerKt.InnerCircleRadius, ComposableLambdaKt.rememberComposableLambda(-205464413, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.1.2.1.2
                                                final /* synthetic */ boolean $autoSwitchToMinute;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                C01012(boolean z4) {
                                                    super(2);
                                                    z = z4;
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                    invoke(composer5, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer5, int i9) {
                                                    ComposerKt.sourceInformation(composer5, "C*1556@61951L41,1554@61842L352:TimePicker.kt#uh7d8r");
                                                    if ((i9 & 3) != 2 || !composer5.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-205464413, i9, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1552)");
                                                        }
                                                        int size2 = TimePickerKt.ExtraHours.getSize();
                                                        AnalogTimePickerState analogTimePickerState3 = analogTimePickerState;
                                                        boolean z4 = z;
                                                        for (final int i10 = 0; i10 < size2; i10++) {
                                                            int i11 = TimePickerKt.ExtraHours.get(i10);
                                                            Modifier.Companion companion2 = Modifier.Companion;
                                                            ComposerKt.sourceInformationMarkerStart(composer5, 1677472780, "CC(remember):TimePicker.kt#9igjgp");
                                                            boolean zChanged2 = composer5.changed(i10);
                                                            Object objRememberedValue2 = composer5.rememberedValue();
                                                            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                                                                objRememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1$2$1$1$1
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
                                                                        SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 12 + i10);
                                                                    }
                                                                };
                                                                composer5.updateRememberedValue(objRememberedValue2);
                                                            }
                                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                                            TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion2, false, (Function1) objRememberedValue2, 1, null), analogTimePickerState3, i11, z4, composer5, 0);
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer5.skipToGroupEnd();
                                                }
                                            }, composer4, 54), composer4, 432, 0);
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }

                                /* JADX INFO: renamed from: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1$2 */
                                /* JADX INFO: compiled from: TimePicker.kt */
                                @InterfaceC1492Gx
                                @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJc\u0003İY\u0006^\ntK֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq>"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
                                static final class C01012 extends Lambda implements Function2<Composer, Integer, Unit> {
                                    final /* synthetic */ boolean $autoSwitchToMinute;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    C01012(boolean z4) {
                                        super(2);
                                        z = z4;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        invoke(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer5, int i9) {
                                        ComposerKt.sourceInformation(composer5, "C*1556@61951L41,1554@61842L352:TimePicker.kt#uh7d8r");
                                        if ((i9 & 3) != 2 || !composer5.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-205464413, i9, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1552)");
                                            }
                                            int size2 = TimePickerKt.ExtraHours.getSize();
                                            AnalogTimePickerState analogTimePickerState3 = analogTimePickerState;
                                            boolean z4 = z;
                                            for (final int i10 = 0; i10 < size2; i10++) {
                                                int i11 = TimePickerKt.ExtraHours.get(i10);
                                                Modifier.Companion companion2 = Modifier.Companion;
                                                ComposerKt.sourceInformationMarkerStart(composer5, 1677472780, "CC(remember):TimePicker.kt#9igjgp");
                                                boolean zChanged2 = composer5.changed(i10);
                                                Object objRememberedValue2 = composer5.rememberedValue();
                                                if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                                                    objRememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1$2$1$1$1
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
                                                            SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 12 + i10);
                                                        }
                                                    };
                                                    composer5.updateRememberedValue(objRememberedValue2);
                                                }
                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion2, false, (Function1) objRememberedValue2, 1, null), analogTimePickerState3, i11, z4, composer5, 0);
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer5.skipToGroupEnd();
                                    }
                                }
                            }, composer3, 54), composer3, (-1) - (((-1) - ProvidedValue.$stable) & ((-1) - 48)));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }

                    /* JADX INFO: renamed from: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1 */
                    /* JADX INFO: compiled from: TimePicker.kt */
                    @InterfaceC1492Gx
                    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJc\u0003İY\u0006^\ntK֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq>"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
                    static final class C01001 extends Lambda implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ boolean $autoSwitchToMinute;
                        final /* synthetic */ AnalogTimePickerState $state;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C01001(AnalogTimePickerState analogTimePickerState2, boolean z3) {
                            super(2);
                            analogTimePickerState = analogTimePickerState2;
                            z = z3;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i6) {
                            int i7;
                            ComposerKt.sourceInformation(composer4, "C1551@61690L552,1545@61343L899:TimePicker.kt#uh7d8r");
                            if ((-1) - (((-1) - i6) | ((-1) - 3)) != 2 || !composer4.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1992872400, i6, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1529)");
                                }
                                composer4.startReplaceGroup(1547046870);
                                ComposerKt.sourceInformation(composer4, "*1537@61008L36,1536@60943L271");
                                int size = intList.getSize();
                                AnalogTimePickerState analogTimePickerState2 = analogTimePickerState;
                                IntList intList2 = intList;
                                boolean z3 = z;
                                for (final int i8 = 0; i8 < size; i8++) {
                                    if (!analogTimePickerState2.is24hour() || TimePickerSelectionMode.m2765equalsimpl0(analogTimePickerState2.mo1776getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m2770getMinuteyecRtBI())) {
                                        i7 = intList2.get(i8);
                                    } else {
                                        i7 = intList2.get(i8) % 12;
                                    }
                                    Modifier.Companion companion = Modifier.Companion;
                                    ComposerKt.sourceInformationMarkerStart(composer4, 707420712, "CC(remember):TimePicker.kt#9igjgp");
                                    boolean zChanged = composer4.changed(i8);
                                    Object objRememberedValue = composer4.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                                        objRememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1$1$1$1
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
                                                SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, i8);
                                            }
                                        };
                                        composer4.updateRememberedValue(objRememberedValue);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion, false, (Function1) objRememberedValue, 1, null), analogTimePickerState2, i7, z3, composer4, 0);
                                }
                                composer4.endReplaceGroup();
                                if (TimePickerSelectionMode.m2765equalsimpl0(analogTimePickerState.mo1776getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m2769getHouryecRtBI()) && analogTimePickerState.is24hour()) {
                                    TimePickerKt.m2737CircularLayoutuFdPcIQ(BackgroundKt.m572backgroundbw27NRU(SizeKt.m1063size3ABfNKs(LayoutIdKt.layoutId(Modifier.Companion, LayoutId.InnerCircle), TimePickerTokens.INSTANCE.m3557getClockDialContainerSizeD9Ej5fM()), Color.Companion.m4213getTransparent0d7_KjU(), RoundedCornerShapeKt.getCircleShape()), TimePickerKt.InnerCircleRadius, ComposableLambdaKt.rememberComposableLambda(-205464413, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.1.2.1.2
                                        final /* synthetic */ boolean $autoSwitchToMinute;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        C01012(boolean z4) {
                                            super(2);
                                            z = z4;
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                            invoke(composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer5, int i9) {
                                            ComposerKt.sourceInformation(composer5, "C*1556@61951L41,1554@61842L352:TimePicker.kt#uh7d8r");
                                            if ((i9 & 3) != 2 || !composer5.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-205464413, i9, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1552)");
                                                }
                                                int size2 = TimePickerKt.ExtraHours.getSize();
                                                AnalogTimePickerState analogTimePickerState3 = analogTimePickerState;
                                                boolean z4 = z;
                                                for (final int i10 = 0; i10 < size2; i10++) {
                                                    int i11 = TimePickerKt.ExtraHours.get(i10);
                                                    Modifier.Companion companion2 = Modifier.Companion;
                                                    ComposerKt.sourceInformationMarkerStart(composer5, 1677472780, "CC(remember):TimePicker.kt#9igjgp");
                                                    boolean zChanged2 = composer5.changed(i10);
                                                    Object objRememberedValue2 = composer5.rememberedValue();
                                                    if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                                                        objRememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1$2$1$1$1
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
                                                                SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 12 + i10);
                                                            }
                                                        };
                                                        composer5.updateRememberedValue(objRememberedValue2);
                                                    }
                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                    TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion2, false, (Function1) objRememberedValue2, 1, null), analogTimePickerState3, i11, z4, composer5, 0);
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer5.skipToGroupEnd();
                                        }
                                    }, composer4, 54), composer4, 432, 0);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer4.skipToGroupEnd();
                        }

                        /* JADX INFO: renamed from: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1$2 */
                        /* JADX INFO: compiled from: TimePicker.kt */
                        @InterfaceC1492Gx
                        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJc\u0003İY\u0006^\ntK֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq>"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
                        static final class C01012 extends Lambda implements Function2<Composer, Integer, Unit> {
                            final /* synthetic */ boolean $autoSwitchToMinute;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C01012(boolean z4) {
                                super(2);
                                z = z4;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                invoke(composer5, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer5, int i9) {
                                ComposerKt.sourceInformation(composer5, "C*1556@61951L41,1554@61842L352:TimePicker.kt#uh7d8r");
                                if ((i9 & 3) != 2 || !composer5.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-205464413, i9, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1552)");
                                    }
                                    int size2 = TimePickerKt.ExtraHours.getSize();
                                    AnalogTimePickerState analogTimePickerState3 = analogTimePickerState;
                                    boolean z4 = z;
                                    for (final int i10 = 0; i10 < size2; i10++) {
                                        int i11 = TimePickerKt.ExtraHours.get(i10);
                                        Modifier.Companion companion2 = Modifier.Companion;
                                        ComposerKt.sourceInformationMarkerStart(composer5, 1677472780, "CC(remember):TimePicker.kt#9igjgp");
                                        boolean zChanged2 = composer5.changed(i10);
                                        Object objRememberedValue2 = composer5.rememberedValue();
                                        if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                                            objRememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1$2$1$1$1
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
                                                    SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 12 + i10);
                                                }
                                            };
                                            composer5.updateRememberedValue(objRememberedValue2);
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                        TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion2, false, (Function1) objRememberedValue2, 1, null), analogTimePickerState3, i11, z4, composer5, 0);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer5.skipToGroupEnd();
                            }
                        }
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 24960, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.2
                final /* synthetic */ int $$changed;
                final /* synthetic */ boolean $autoSwitchToMinute;
                final /* synthetic */ TimePickerColors $colors;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C07002(TimePickerColors timePickerColors2, boolean z22, int i22) {
                    super(2);
                    timePickerColors = timePickerColors2;
                    z = z22;
                    i = i22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    TimePickerKt.ClockFace(analogTimePickerState, timePickerColors, z, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.TimePickerKt$ClockFace$1 */
    /* JADX INFO: compiled from: TimePicker.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,i\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u000btjQ0rf\u000f7ʂW,\u0015m\n7"}, d2 = {"\n`]<a@F])\rS", "", "Aba2X5", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nd &.s\u001cKL", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJz VV\u0012J\u0006z\u001cU\u0007\u001fDw\u001a-`\r9u<)\u001fva\u0003\u0014s5]z/G\u0016,6d]|K\u0014\u001f0q\u0012\u001c"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06991 extends Lambda implements Function3<IntList, Composer, Integer, Unit> {
        final /* synthetic */ boolean $autoSwitchToMinute;
        final /* synthetic */ AnalogTimePickerState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06991(AnalogTimePickerState analogTimePickerState2, boolean z22) {
            super(3);
            analogTimePickerState = analogTimePickerState2;
            z = z22;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(IntList intList, Composer composer2, Integer num) {
            invoke(intList, composer2, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: androidx.compose.material3.TimePickerKt$ClockFace$1$1 */
        /*  JADX ERROR: Failed to generate init code
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0002: CONSTRUCTOR  A[DECLARE_VAR, DONT_GENERATE, MD:():void (m), REMOVE, WRAPPED] call: androidx.compose.material3.TimePickerKt.ClockFace.1.1.<init>():void type: CONSTRUCTOR in method: androidx.compose.material3.TimePickerKt.ClockFace.1.1.<clinit>():void, file: classes2.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.ClassGen.addInsnBody(ClassGen.java:549)
            	at jadx.core.codegen.ClassGen.addField(ClassGen.java:455)
            	at jadx.core.codegen.ClassGen.addFields(ClassGen.java:422)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:287)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
            	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:312)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
            	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:845)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:305)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:284)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:412)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:303)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
            	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
            	at jadx.core.ProcessClass.process(ProcessClass.java:88)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
            Caused by: jadx.core.utils.exceptions.CodegenException: Anonymous inner class unlimited recursion detected. Convert class to inner: androidx.compose.material3.TimePickerKt.ClockFace.1.1
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:813)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:286)
            	... 78 more
            */
        /* JADX INFO: compiled from: TimePicker.kt */
        /* JADX INFO: loaded from: classes2.dex */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bDZc|İOيH\u000b\\A'\"Z\u0012>\u000f¡n96E"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ&x>)\u0015upMsc*Nz8GY$", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        static final class C00991 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
            public static final C00991 INSTANCE = new C00991();

            C00991() {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                SemanticsPropertiesKt.selectableGroup(semanticsPropertyReceiver);
            }
        }

        public final void invoke(IntList intList2, Composer composer2, int i4) {
            ComposerKt.sourceInformation(composer2, "C1525@60456L1828,1522@60292L1992:TimePicker.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1022006568, i4, -1, "androidx.compose.material3.ClockFace.<anonymous> (TimePicker.kt:1522)");
            }
            TimePickerKt.m2737CircularLayoutuFdPcIQ(SemanticsModifierKt.semantics$default(SizeKt.m1063size3ABfNKs(Modifier.Companion, TimePickerTokens.INSTANCE.m3557getClockDialContainerSizeD9Ej5fM()), false, C00991.INSTANCE, 1, null), TimePickerKt.OuterCircleSizeRadius, ComposableLambdaKt.rememberComposableLambda(-320307952, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.1.2
                final /* synthetic */ boolean $autoSwitchToMinute;
                final /* synthetic */ IntList $screen;
                final /* synthetic */ AnalogTimePickerState $state;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(IntList intList22, AnalogTimePickerState analogTimePickerState2, boolean z3) {
                    super(2);
                    intList = intList22;
                    analogTimePickerState = analogTimePickerState2;
                    z = z3;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    ComposerKt.sourceInformation(composer3, "C1528@60589L1685,1526@60470L1804:TimePicker.kt#uh7d8r");
                    if ((i5 & 3) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-320307952, i5, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous> (TimePicker.kt:1526)");
                        }
                        CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4168boximpl(timePickerColors.m2715clockDialContentColorvNxB06k$material3_release(false))), ComposableLambdaKt.rememberComposableLambda(1992872400, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.1.2.1
                            final /* synthetic */ boolean $autoSwitchToMinute;
                            final /* synthetic */ AnalogTimePickerState $state;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C01001(AnalogTimePickerState analogTimePickerState2, boolean z3) {
                                super(2);
                                analogTimePickerState = analogTimePickerState2;
                                z = z3;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i6) {
                                int i7;
                                ComposerKt.sourceInformation(composer4, "C1551@61690L552,1545@61343L899:TimePicker.kt#uh7d8r");
                                if ((-1) - (((-1) - i6) | ((-1) - 3)) != 2 || !composer4.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1992872400, i6, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1529)");
                                    }
                                    composer4.startReplaceGroup(1547046870);
                                    ComposerKt.sourceInformation(composer4, "*1537@61008L36,1536@60943L271");
                                    int size = intList.getSize();
                                    AnalogTimePickerState analogTimePickerState2 = analogTimePickerState;
                                    IntList intList22 = intList;
                                    boolean z3 = z;
                                    for (final int i8 = 0; i8 < size; i8++) {
                                        if (!analogTimePickerState2.is24hour() || TimePickerSelectionMode.m2765equalsimpl0(analogTimePickerState2.mo1776getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m2770getMinuteyecRtBI())) {
                                            i7 = intList22.get(i8);
                                        } else {
                                            i7 = intList22.get(i8) % 12;
                                        }
                                        Modifier.Companion companion = Modifier.Companion;
                                        ComposerKt.sourceInformationMarkerStart(composer4, 707420712, "CC(remember):TimePicker.kt#9igjgp");
                                        boolean zChanged = composer4.changed(i8);
                                        Object objRememberedValue = composer4.rememberedValue();
                                        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                                            objRememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1$1$1$1
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
                                                    SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, i8);
                                                }
                                            };
                                            composer4.updateRememberedValue(objRememberedValue);
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion, false, (Function1) objRememberedValue, 1, null), analogTimePickerState2, i7, z3, composer4, 0);
                                    }
                                    composer4.endReplaceGroup();
                                    if (TimePickerSelectionMode.m2765equalsimpl0(analogTimePickerState.mo1776getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m2769getHouryecRtBI()) && analogTimePickerState.is24hour()) {
                                        TimePickerKt.m2737CircularLayoutuFdPcIQ(BackgroundKt.m572backgroundbw27NRU(SizeKt.m1063size3ABfNKs(LayoutIdKt.layoutId(Modifier.Companion, LayoutId.InnerCircle), TimePickerTokens.INSTANCE.m3557getClockDialContainerSizeD9Ej5fM()), Color.Companion.m4213getTransparent0d7_KjU(), RoundedCornerShapeKt.getCircleShape()), TimePickerKt.InnerCircleRadius, ComposableLambdaKt.rememberComposableLambda(-205464413, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.1.2.1.2
                                            final /* synthetic */ boolean $autoSwitchToMinute;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            C01012(boolean z4) {
                                                super(2);
                                                z = z4;
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                invoke(composer5, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer5, int i9) {
                                                ComposerKt.sourceInformation(composer5, "C*1556@61951L41,1554@61842L352:TimePicker.kt#uh7d8r");
                                                if ((i9 & 3) != 2 || !composer5.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-205464413, i9, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1552)");
                                                    }
                                                    int size2 = TimePickerKt.ExtraHours.getSize();
                                                    AnalogTimePickerState analogTimePickerState3 = analogTimePickerState;
                                                    boolean z4 = z;
                                                    for (final int i10 = 0; i10 < size2; i10++) {
                                                        int i11 = TimePickerKt.ExtraHours.get(i10);
                                                        Modifier.Companion companion2 = Modifier.Companion;
                                                        ComposerKt.sourceInformationMarkerStart(composer5, 1677472780, "CC(remember):TimePicker.kt#9igjgp");
                                                        boolean zChanged2 = composer5.changed(i10);
                                                        Object objRememberedValue2 = composer5.rememberedValue();
                                                        if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                                                            objRememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1$2$1$1$1
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
                                                                    SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 12 + i10);
                                                                }
                                                            };
                                                            composer5.updateRememberedValue(objRememberedValue2);
                                                        }
                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                        TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion2, false, (Function1) objRememberedValue2, 1, null), analogTimePickerState3, i11, z4, composer5, 0);
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer5.skipToGroupEnd();
                                            }
                                        }, composer4, 54), composer4, 432, 0);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }

                            /* JADX INFO: renamed from: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1$2 */
                            /* JADX INFO: compiled from: TimePicker.kt */
                            @InterfaceC1492Gx
                            @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJc\u0003İY\u0006^\ntK֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq>"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
                            static final class C01012 extends Lambda implements Function2<Composer, Integer, Unit> {
                                final /* synthetic */ boolean $autoSwitchToMinute;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                C01012(boolean z4) {
                                    super(2);
                                    z = z4;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                    invoke(composer5, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer5, int i9) {
                                    ComposerKt.sourceInformation(composer5, "C*1556@61951L41,1554@61842L352:TimePicker.kt#uh7d8r");
                                    if ((i9 & 3) != 2 || !composer5.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-205464413, i9, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1552)");
                                        }
                                        int size2 = TimePickerKt.ExtraHours.getSize();
                                        AnalogTimePickerState analogTimePickerState3 = analogTimePickerState;
                                        boolean z4 = z;
                                        for (final int i10 = 0; i10 < size2; i10++) {
                                            int i11 = TimePickerKt.ExtraHours.get(i10);
                                            Modifier.Companion companion2 = Modifier.Companion;
                                            ComposerKt.sourceInformationMarkerStart(composer5, 1677472780, "CC(remember):TimePicker.kt#9igjgp");
                                            boolean zChanged2 = composer5.changed(i10);
                                            Object objRememberedValue2 = composer5.rememberedValue();
                                            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                                                objRememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1$2$1$1$1
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
                                                        SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 12 + i10);
                                                    }
                                                };
                                                composer5.updateRememberedValue(objRememberedValue2);
                                            }
                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                            TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion2, false, (Function1) objRememberedValue2, 1, null), analogTimePickerState3, i11, z4, composer5, 0);
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer5.skipToGroupEnd();
                                }
                            }
                        }, composer3, 54), composer3, (-1) - (((-1) - ProvidedValue.$stable) & ((-1) - 48)));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }

                /* JADX INFO: renamed from: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1 */
                /* JADX INFO: compiled from: TimePicker.kt */
                @InterfaceC1492Gx
                @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJc\u0003İY\u0006^\ntK֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq>"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
                static final class C01001 extends Lambda implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ boolean $autoSwitchToMinute;
                    final /* synthetic */ AnalogTimePickerState $state;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C01001(AnalogTimePickerState analogTimePickerState2, boolean z3) {
                        super(2);
                        analogTimePickerState = analogTimePickerState2;
                        z = z3;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                        invoke(composer4, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer4, int i6) {
                        int i7;
                        ComposerKt.sourceInformation(composer4, "C1551@61690L552,1545@61343L899:TimePicker.kt#uh7d8r");
                        if ((-1) - (((-1) - i6) | ((-1) - 3)) != 2 || !composer4.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1992872400, i6, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1529)");
                            }
                            composer4.startReplaceGroup(1547046870);
                            ComposerKt.sourceInformation(composer4, "*1537@61008L36,1536@60943L271");
                            int size = intList.getSize();
                            AnalogTimePickerState analogTimePickerState2 = analogTimePickerState;
                            IntList intList22 = intList;
                            boolean z3 = z;
                            for (final int i8 = 0; i8 < size; i8++) {
                                if (!analogTimePickerState2.is24hour() || TimePickerSelectionMode.m2765equalsimpl0(analogTimePickerState2.mo1776getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m2770getMinuteyecRtBI())) {
                                    i7 = intList22.get(i8);
                                } else {
                                    i7 = intList22.get(i8) % 12;
                                }
                                Modifier.Companion companion = Modifier.Companion;
                                ComposerKt.sourceInformationMarkerStart(composer4, 707420712, "CC(remember):TimePicker.kt#9igjgp");
                                boolean zChanged = composer4.changed(i8);
                                Object objRememberedValue = composer4.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                                    objRememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1$1$1$1
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
                                            SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, i8);
                                        }
                                    };
                                    composer4.updateRememberedValue(objRememberedValue);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion, false, (Function1) objRememberedValue, 1, null), analogTimePickerState2, i7, z3, composer4, 0);
                            }
                            composer4.endReplaceGroup();
                            if (TimePickerSelectionMode.m2765equalsimpl0(analogTimePickerState.mo1776getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m2769getHouryecRtBI()) && analogTimePickerState.is24hour()) {
                                TimePickerKt.m2737CircularLayoutuFdPcIQ(BackgroundKt.m572backgroundbw27NRU(SizeKt.m1063size3ABfNKs(LayoutIdKt.layoutId(Modifier.Companion, LayoutId.InnerCircle), TimePickerTokens.INSTANCE.m3557getClockDialContainerSizeD9Ej5fM()), Color.Companion.m4213getTransparent0d7_KjU(), RoundedCornerShapeKt.getCircleShape()), TimePickerKt.InnerCircleRadius, ComposableLambdaKt.rememberComposableLambda(-205464413, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.1.2.1.2
                                    final /* synthetic */ boolean $autoSwitchToMinute;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    C01012(boolean z4) {
                                        super(2);
                                        z = z4;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        invoke(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer5, int i9) {
                                        ComposerKt.sourceInformation(composer5, "C*1556@61951L41,1554@61842L352:TimePicker.kt#uh7d8r");
                                        if ((i9 & 3) != 2 || !composer5.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-205464413, i9, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1552)");
                                            }
                                            int size2 = TimePickerKt.ExtraHours.getSize();
                                            AnalogTimePickerState analogTimePickerState3 = analogTimePickerState;
                                            boolean z4 = z;
                                            for (final int i10 = 0; i10 < size2; i10++) {
                                                int i11 = TimePickerKt.ExtraHours.get(i10);
                                                Modifier.Companion companion2 = Modifier.Companion;
                                                ComposerKt.sourceInformationMarkerStart(composer5, 1677472780, "CC(remember):TimePicker.kt#9igjgp");
                                                boolean zChanged2 = composer5.changed(i10);
                                                Object objRememberedValue2 = composer5.rememberedValue();
                                                if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                                                    objRememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1$2$1$1$1
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
                                                            SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 12 + i10);
                                                        }
                                                    };
                                                    composer5.updateRememberedValue(objRememberedValue2);
                                                }
                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion2, false, (Function1) objRememberedValue2, 1, null), analogTimePickerState3, i11, z4, composer5, 0);
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer5.skipToGroupEnd();
                                    }
                                }, composer4, 54), composer4, 432, 0);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer4.skipToGroupEnd();
                    }

                    /* JADX INFO: renamed from: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1$2 */
                    /* JADX INFO: compiled from: TimePicker.kt */
                    @InterfaceC1492Gx
                    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJc\u0003İY\u0006^\ntK֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq>"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
                    static final class C01012 extends Lambda implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ boolean $autoSwitchToMinute;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C01012(boolean z4) {
                            super(2);
                            z = z4;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                            invoke(composer5, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer5, int i9) {
                            ComposerKt.sourceInformation(composer5, "C*1556@61951L41,1554@61842L352:TimePicker.kt#uh7d8r");
                            if ((i9 & 3) != 2 || !composer5.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-205464413, i9, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1552)");
                                }
                                int size2 = TimePickerKt.ExtraHours.getSize();
                                AnalogTimePickerState analogTimePickerState3 = analogTimePickerState;
                                boolean z4 = z;
                                for (final int i10 = 0; i10 < size2; i10++) {
                                    int i11 = TimePickerKt.ExtraHours.get(i10);
                                    Modifier.Companion companion2 = Modifier.Companion;
                                    ComposerKt.sourceInformationMarkerStart(composer5, 1677472780, "CC(remember):TimePicker.kt#9igjgp");
                                    boolean zChanged2 = composer5.changed(i10);
                                    Object objRememberedValue2 = composer5.rememberedValue();
                                    if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                                        objRememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1$2$1$1$1
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
                                                SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 12 + i10);
                                            }
                                        };
                                        composer5.updateRememberedValue(objRememberedValue2);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                    TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion2, false, (Function1) objRememberedValue2, 1, null), analogTimePickerState3, i11, z4, composer5, 0);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer5.skipToGroupEnd();
                        }
                    }
                }
            }, composer2, 54), composer2, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: renamed from: androidx.compose.material3.TimePickerKt$ClockFace$1$2 */
        /* JADX INFO: compiled from: TimePicker.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJc\u0003İY\u0006^\ntK֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq>"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        static final class AnonymousClass2 extends Lambda implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ boolean $autoSwitchToMinute;
            final /* synthetic */ IntList $screen;
            final /* synthetic */ AnalogTimePickerState $state;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(IntList intList22, AnalogTimePickerState analogTimePickerState2, boolean z3) {
                super(2);
                intList = intList22;
                analogTimePickerState = analogTimePickerState2;
                z = z3;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i5) {
                ComposerKt.sourceInformation(composer3, "C1528@60589L1685,1526@60470L1804:TimePicker.kt#uh7d8r");
                if ((i5 & 3) != 2 || !composer3.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-320307952, i5, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous> (TimePicker.kt:1526)");
                    }
                    CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4168boximpl(timePickerColors.m2715clockDialContentColorvNxB06k$material3_release(false))), ComposableLambdaKt.rememberComposableLambda(1992872400, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.1.2.1
                        final /* synthetic */ boolean $autoSwitchToMinute;
                        final /* synthetic */ AnalogTimePickerState $state;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C01001(AnalogTimePickerState analogTimePickerState2, boolean z3) {
                            super(2);
                            analogTimePickerState = analogTimePickerState2;
                            z = z3;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i6) {
                            int i7;
                            ComposerKt.sourceInformation(composer4, "C1551@61690L552,1545@61343L899:TimePicker.kt#uh7d8r");
                            if ((-1) - (((-1) - i6) | ((-1) - 3)) != 2 || !composer4.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1992872400, i6, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1529)");
                                }
                                composer4.startReplaceGroup(1547046870);
                                ComposerKt.sourceInformation(composer4, "*1537@61008L36,1536@60943L271");
                                int size = intList.getSize();
                                AnalogTimePickerState analogTimePickerState2 = analogTimePickerState;
                                IntList intList22 = intList;
                                boolean z3 = z;
                                for (final int i8 = 0; i8 < size; i8++) {
                                    if (!analogTimePickerState2.is24hour() || TimePickerSelectionMode.m2765equalsimpl0(analogTimePickerState2.mo1776getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m2770getMinuteyecRtBI())) {
                                        i7 = intList22.get(i8);
                                    } else {
                                        i7 = intList22.get(i8) % 12;
                                    }
                                    Modifier.Companion companion = Modifier.Companion;
                                    ComposerKt.sourceInformationMarkerStart(composer4, 707420712, "CC(remember):TimePicker.kt#9igjgp");
                                    boolean zChanged = composer4.changed(i8);
                                    Object objRememberedValue = composer4.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                                        objRememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1$1$1$1
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
                                                SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, i8);
                                            }
                                        };
                                        composer4.updateRememberedValue(objRememberedValue);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion, false, (Function1) objRememberedValue, 1, null), analogTimePickerState2, i7, z3, composer4, 0);
                                }
                                composer4.endReplaceGroup();
                                if (TimePickerSelectionMode.m2765equalsimpl0(analogTimePickerState.mo1776getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m2769getHouryecRtBI()) && analogTimePickerState.is24hour()) {
                                    TimePickerKt.m2737CircularLayoutuFdPcIQ(BackgroundKt.m572backgroundbw27NRU(SizeKt.m1063size3ABfNKs(LayoutIdKt.layoutId(Modifier.Companion, LayoutId.InnerCircle), TimePickerTokens.INSTANCE.m3557getClockDialContainerSizeD9Ej5fM()), Color.Companion.m4213getTransparent0d7_KjU(), RoundedCornerShapeKt.getCircleShape()), TimePickerKt.InnerCircleRadius, ComposableLambdaKt.rememberComposableLambda(-205464413, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.1.2.1.2
                                        final /* synthetic */ boolean $autoSwitchToMinute;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        C01012(boolean z4) {
                                            super(2);
                                            z = z4;
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                            invoke(composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer5, int i9) {
                                            ComposerKt.sourceInformation(composer5, "C*1556@61951L41,1554@61842L352:TimePicker.kt#uh7d8r");
                                            if ((i9 & 3) != 2 || !composer5.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-205464413, i9, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1552)");
                                                }
                                                int size2 = TimePickerKt.ExtraHours.getSize();
                                                AnalogTimePickerState analogTimePickerState3 = analogTimePickerState;
                                                boolean z4 = z;
                                                for (final int i10 = 0; i10 < size2; i10++) {
                                                    int i11 = TimePickerKt.ExtraHours.get(i10);
                                                    Modifier.Companion companion2 = Modifier.Companion;
                                                    ComposerKt.sourceInformationMarkerStart(composer5, 1677472780, "CC(remember):TimePicker.kt#9igjgp");
                                                    boolean zChanged2 = composer5.changed(i10);
                                                    Object objRememberedValue2 = composer5.rememberedValue();
                                                    if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                                                        objRememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1$2$1$1$1
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
                                                                SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 12 + i10);
                                                            }
                                                        };
                                                        composer5.updateRememberedValue(objRememberedValue2);
                                                    }
                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                    TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion2, false, (Function1) objRememberedValue2, 1, null), analogTimePickerState3, i11, z4, composer5, 0);
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer5.skipToGroupEnd();
                                        }
                                    }, composer4, 54), composer4, 432, 0);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer4.skipToGroupEnd();
                        }

                        /* JADX INFO: renamed from: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1$2 */
                        /* JADX INFO: compiled from: TimePicker.kt */
                        @InterfaceC1492Gx
                        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJc\u0003İY\u0006^\ntK֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq>"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
                        static final class C01012 extends Lambda implements Function2<Composer, Integer, Unit> {
                            final /* synthetic */ boolean $autoSwitchToMinute;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C01012(boolean z4) {
                                super(2);
                                z = z4;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                invoke(composer5, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer5, int i9) {
                                ComposerKt.sourceInformation(composer5, "C*1556@61951L41,1554@61842L352:TimePicker.kt#uh7d8r");
                                if ((i9 & 3) != 2 || !composer5.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-205464413, i9, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1552)");
                                    }
                                    int size2 = TimePickerKt.ExtraHours.getSize();
                                    AnalogTimePickerState analogTimePickerState3 = analogTimePickerState;
                                    boolean z4 = z;
                                    for (final int i10 = 0; i10 < size2; i10++) {
                                        int i11 = TimePickerKt.ExtraHours.get(i10);
                                        Modifier.Companion companion2 = Modifier.Companion;
                                        ComposerKt.sourceInformationMarkerStart(composer5, 1677472780, "CC(remember):TimePicker.kt#9igjgp");
                                        boolean zChanged2 = composer5.changed(i10);
                                        Object objRememberedValue2 = composer5.rememberedValue();
                                        if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                                            objRememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1$2$1$1$1
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
                                                    SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 12 + i10);
                                                }
                                            };
                                            composer5.updateRememberedValue(objRememberedValue2);
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                        TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion2, false, (Function1) objRememberedValue2, 1, null), analogTimePickerState3, i11, z4, composer5, 0);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer5.skipToGroupEnd();
                            }
                        }
                    }, composer3, 54), composer3, (-1) - (((-1) - ProvidedValue.$stable) & ((-1) - 48)));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer3.skipToGroupEnd();
            }

            /* JADX INFO: renamed from: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1 */
            /* JADX INFO: compiled from: TimePicker.kt */
            @InterfaceC1492Gx
            @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJc\u0003İY\u0006^\ntK֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq>"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
            static final class C01001 extends Lambda implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ boolean $autoSwitchToMinute;
                final /* synthetic */ AnalogTimePickerState $state;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C01001(AnalogTimePickerState analogTimePickerState2, boolean z3) {
                    super(2);
                    analogTimePickerState = analogTimePickerState2;
                    z = z3;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                    invoke(composer4, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer4, int i6) {
                    int i7;
                    ComposerKt.sourceInformation(composer4, "C1551@61690L552,1545@61343L899:TimePicker.kt#uh7d8r");
                    if ((-1) - (((-1) - i6) | ((-1) - 3)) != 2 || !composer4.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1992872400, i6, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1529)");
                        }
                        composer4.startReplaceGroup(1547046870);
                        ComposerKt.sourceInformation(composer4, "*1537@61008L36,1536@60943L271");
                        int size = intList.getSize();
                        AnalogTimePickerState analogTimePickerState2 = analogTimePickerState;
                        IntList intList22 = intList;
                        boolean z3 = z;
                        for (final int i8 = 0; i8 < size; i8++) {
                            if (!analogTimePickerState2.is24hour() || TimePickerSelectionMode.m2765equalsimpl0(analogTimePickerState2.mo1776getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m2770getMinuteyecRtBI())) {
                                i7 = intList22.get(i8);
                            } else {
                                i7 = intList22.get(i8) % 12;
                            }
                            Modifier.Companion companion = Modifier.Companion;
                            ComposerKt.sourceInformationMarkerStart(composer4, 707420712, "CC(remember):TimePicker.kt#9igjgp");
                            boolean zChanged = composer4.changed(i8);
                            Object objRememberedValue = composer4.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                                objRememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1$1$1$1
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
                                        SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, i8);
                                    }
                                };
                                composer4.updateRememberedValue(objRememberedValue);
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion, false, (Function1) objRememberedValue, 1, null), analogTimePickerState2, i7, z3, composer4, 0);
                        }
                        composer4.endReplaceGroup();
                        if (TimePickerSelectionMode.m2765equalsimpl0(analogTimePickerState.mo1776getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m2769getHouryecRtBI()) && analogTimePickerState.is24hour()) {
                            TimePickerKt.m2737CircularLayoutuFdPcIQ(BackgroundKt.m572backgroundbw27NRU(SizeKt.m1063size3ABfNKs(LayoutIdKt.layoutId(Modifier.Companion, LayoutId.InnerCircle), TimePickerTokens.INSTANCE.m3557getClockDialContainerSizeD9Ej5fM()), Color.Companion.m4213getTransparent0d7_KjU(), RoundedCornerShapeKt.getCircleShape()), TimePickerKt.InnerCircleRadius, ComposableLambdaKt.rememberComposableLambda(-205464413, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.1.2.1.2
                                final /* synthetic */ boolean $autoSwitchToMinute;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                C01012(boolean z4) {
                                    super(2);
                                    z = z4;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                    invoke(composer5, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer5, int i9) {
                                    ComposerKt.sourceInformation(composer5, "C*1556@61951L41,1554@61842L352:TimePicker.kt#uh7d8r");
                                    if ((i9 & 3) != 2 || !composer5.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-205464413, i9, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1552)");
                                        }
                                        int size2 = TimePickerKt.ExtraHours.getSize();
                                        AnalogTimePickerState analogTimePickerState3 = analogTimePickerState;
                                        boolean z4 = z;
                                        for (final int i10 = 0; i10 < size2; i10++) {
                                            int i11 = TimePickerKt.ExtraHours.get(i10);
                                            Modifier.Companion companion2 = Modifier.Companion;
                                            ComposerKt.sourceInformationMarkerStart(composer5, 1677472780, "CC(remember):TimePicker.kt#9igjgp");
                                            boolean zChanged2 = composer5.changed(i10);
                                            Object objRememberedValue2 = composer5.rememberedValue();
                                            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                                                objRememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1$2$1$1$1
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
                                                        SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 12 + i10);
                                                    }
                                                };
                                                composer5.updateRememberedValue(objRememberedValue2);
                                            }
                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                            TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion2, false, (Function1) objRememberedValue2, 1, null), analogTimePickerState3, i11, z4, composer5, 0);
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer5.skipToGroupEnd();
                                }
                            }, composer4, 54), composer4, 432, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer4.skipToGroupEnd();
                }

                /* JADX INFO: renamed from: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1$2 */
                /* JADX INFO: compiled from: TimePicker.kt */
                @InterfaceC1492Gx
                @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJc\u0003İY\u0006^\ntK֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq>"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
                static final class C01012 extends Lambda implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ boolean $autoSwitchToMinute;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C01012(boolean z4) {
                        super(2);
                        z = z4;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                        invoke(composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer5, int i9) {
                        ComposerKt.sourceInformation(composer5, "C*1556@61951L41,1554@61842L352:TimePicker.kt#uh7d8r");
                        if ((i9 & 3) != 2 || !composer5.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-205464413, i9, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1552)");
                            }
                            int size2 = TimePickerKt.ExtraHours.getSize();
                            AnalogTimePickerState analogTimePickerState3 = analogTimePickerState;
                            boolean z4 = z;
                            for (final int i10 = 0; i10 < size2; i10++) {
                                int i11 = TimePickerKt.ExtraHours.get(i10);
                                Modifier.Companion companion2 = Modifier.Companion;
                                ComposerKt.sourceInformationMarkerStart(composer5, 1677472780, "CC(remember):TimePicker.kt#9igjgp");
                                boolean zChanged2 = composer5.changed(i10);
                                Object objRememberedValue2 = composer5.rememberedValue();
                                if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                                    objRememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1$2$1$1$1
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
                                            SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 12 + i10);
                                        }
                                    };
                                    composer5.updateRememberedValue(objRememberedValue2);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                TimePickerKt.ClockText(SemanticsModifierKt.semantics$default(companion2, false, (Function1) objRememberedValue2, 1, null), analogTimePickerState3, i11, z4, composer5, 0);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer5.skipToGroupEnd();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.TimePickerKt$drawSelector$1 */
    /* JADX INFO: compiled from: TimePicker.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bDZc|İOيH\u000b\\A'\"Z\u0012>\u000f¡n96E"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u0019u=-\u0015qp\u0018\u0014_><t1RL$", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C07131 extends Lambda implements Function1<ContentDrawScope, Unit> {
        final /* synthetic */ TimePickerColors $colors;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07131(TimePickerColors timePickerColors) {
            super(1);
            timePickerColors = timePickerColors;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
            invoke2(contentDrawScope);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(ContentDrawScope contentDrawScope) {
            long jOffset = OffsetKt.Offset(contentDrawScope.mo710toPx0680j_4(DpOffset.m6699getXD9Ej5fM(TimePickerKt.getSelectorPos(analogTimePickerState))), contentDrawScope.mo710toPx0680j_4(DpOffset.m6701getYD9Ej5fM(TimePickerKt.getSelectorPos(analogTimePickerState))));
            float f2 = 2;
            float f3 = contentDrawScope.mo710toPx0680j_4(TimePickerTokens.INSTANCE.m3559getClockDialSelectorHandleContainerSizeD9Ej5fM()) / f2;
            long jM2726getSelectorColor0d7_KjU = timePickerColors.m2726getSelectorColor0d7_KjU();
            ContentDrawScope contentDrawScope2 = contentDrawScope;
            DrawScope.m4715drawCircleVaOC9Bg$default(contentDrawScope2, Color.Companion.m4204getBlack0d7_KjU(), f3, jOffset, 0.0f, null, null, BlendMode.Companion.m4093getClear0nO6VwU(), 56, null);
            contentDrawScope.drawContent();
            DrawScope.m4715drawCircleVaOC9Bg$default(contentDrawScope2, jM2726getSelectorColor0d7_KjU, f3, jOffset, 0.0f, null, null, BlendMode.Companion.m4121getXor0nO6VwU(), 56, null);
            DrawScope.m4720drawLineNGM6Ib0$default(contentDrawScope2, jM2726getSelectorColor0d7_KjU, androidx.compose.ui.geometry.SizeKt.m4016getCenteruvyYCjk(contentDrawScope.mo4734getSizeNHjbRc()), Offset.m3941minusMKHz9U(jOffset, OffsetKt.Offset(((float) Math.cos(analogTimePickerState.getCurrentAngle())) * f3, ((float) Math.sin(analogTimePickerState.getCurrentAngle())) * f3)), contentDrawScope.mo710toPx0680j_4(TimePickerTokens.INSTANCE.m3560getClockDialSelectorTrackContainerWidthD9Ej5fM()), 0, null, 0.0f, null, BlendMode.Companion.m4120getSrcOver0nO6VwU(), 240, null);
            DrawScope.m4715drawCircleVaOC9Bg$default(contentDrawScope2, jM2726getSelectorColor0d7_KjU, contentDrawScope.mo710toPx0680j_4(TimePickerTokens.INSTANCE.m3558getClockDialSelectorCenterContainerSizeD9Ej5fM()) / f2, androidx.compose.ui.geometry.SizeKt.m4016getCenteruvyYCjk(contentDrawScope.mo4734getSizeNHjbRc()), 0.0f, null, null, 0, 120, null);
            DrawScope.m4715drawCircleVaOC9Bg$default(contentDrawScope2, timePickerColors.m2715clockDialContentColorvNxB06k$material3_release(true), f3, jOffset, 0.0f, null, null, BlendMode.Companion.m4103getDstOver0nO6VwU(), 56, null);
        }
    }

    private static final Modifier drawSelector(Modifier modifier, AnalogTimePickerState analogTimePickerState, TimePickerColors timePickerColors) {
        return DrawModifierKt.drawWithContent(modifier, new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material3.TimePickerKt.drawSelector.1
            final /* synthetic */ TimePickerColors $colors;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C07131(TimePickerColors timePickerColors2) {
                super(1);
                timePickerColors = timePickerColors2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(ContentDrawScope contentDrawScope) {
                long jOffset = OffsetKt.Offset(contentDrawScope.mo710toPx0680j_4(DpOffset.m6699getXD9Ej5fM(TimePickerKt.getSelectorPos(analogTimePickerState))), contentDrawScope.mo710toPx0680j_4(DpOffset.m6701getYD9Ej5fM(TimePickerKt.getSelectorPos(analogTimePickerState))));
                float f2 = 2;
                float f3 = contentDrawScope.mo710toPx0680j_4(TimePickerTokens.INSTANCE.m3559getClockDialSelectorHandleContainerSizeD9Ej5fM()) / f2;
                long jM2726getSelectorColor0d7_KjU = timePickerColors.m2726getSelectorColor0d7_KjU();
                ContentDrawScope contentDrawScope2 = contentDrawScope;
                DrawScope.m4715drawCircleVaOC9Bg$default(contentDrawScope2, Color.Companion.m4204getBlack0d7_KjU(), f3, jOffset, 0.0f, null, null, BlendMode.Companion.m4093getClear0nO6VwU(), 56, null);
                contentDrawScope.drawContent();
                DrawScope.m4715drawCircleVaOC9Bg$default(contentDrawScope2, jM2726getSelectorColor0d7_KjU, f3, jOffset, 0.0f, null, null, BlendMode.Companion.m4121getXor0nO6VwU(), 56, null);
                DrawScope.m4720drawLineNGM6Ib0$default(contentDrawScope2, jM2726getSelectorColor0d7_KjU, androidx.compose.ui.geometry.SizeKt.m4016getCenteruvyYCjk(contentDrawScope.mo4734getSizeNHjbRc()), Offset.m3941minusMKHz9U(jOffset, OffsetKt.Offset(((float) Math.cos(analogTimePickerState.getCurrentAngle())) * f3, ((float) Math.sin(analogTimePickerState.getCurrentAngle())) * f3)), contentDrawScope.mo710toPx0680j_4(TimePickerTokens.INSTANCE.m3560getClockDialSelectorTrackContainerWidthD9Ej5fM()), 0, null, 0.0f, null, BlendMode.Companion.m4120getSrcOver0nO6VwU(), 240, null);
                DrawScope.m4715drawCircleVaOC9Bg$default(contentDrawScope2, jM2726getSelectorColor0d7_KjU, contentDrawScope.mo710toPx0680j_4(TimePickerTokens.INSTANCE.m3558getClockDialSelectorCenterContainerSizeD9Ej5fM()) / f2, androidx.compose.ui.geometry.SizeKt.m4016getCenteruvyYCjk(contentDrawScope.mo4734getSizeNHjbRc()), 0.0f, null, null, 0, 120, null);
                DrawScope.m4715drawCircleVaOC9Bg$default(contentDrawScope2, timePickerColors.m2715clockDialContentColorvNxB06k$material3_release(true), f3, jOffset, 0.0f, null, null, BlendMode.Companion.m4103getDstOver0nO6VwU(), 56, null);
            }
        });
    }

    public static final void ClockText(Modifier modifier, final AnalogTimePickerState analogTimePickerState, int i2, final boolean z2, Composer composer, int i3) {
        int i4;
        boolean z3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-206784607);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ClockText)P(1,2,3)1639@64421L5,*1640@64463L7,1641@64513L40,1642@64578L43,1643@64638L24,1645@64700L142,1665@65318L163,1670@65563L503,1659@65093L1182:TimePicker.kt#uh7d8r");
        if ((i3 + 6) - (i3 | 6) == 0) {
            i4 = (-1) - (((-1) - (composerStartRestartGroup.changed(modifier) ? 4 : 2)) & ((-1) - i3));
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            int i5 = composerStartRestartGroup.changedInstance(analogTimePickerState) ? 32 : 16;
            i4 = (i4 + i5) - (i4 & i5);
        }
        if ((-1) - (((-1) - i3) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i4 |= composerStartRestartGroup.changed(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            int i6 = composerStartRestartGroup.changed(z2) ? 2048 : 1024;
            i4 = (i4 + i6) - (i4 & i6);
        }
        if ((i4 + 1171) - (1171 | i4) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-206784607, i4, -1, "androidx.compose.material3.ClockText (TimePicker.kt:1638)");
            }
            TextStyle value = TypographyKt.getValue(TimePickerTokens.INSTANCE.getClockDialLabelTextFont(), composerStartRestartGroup, 6);
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final float fMo710toPx0680j_4 = ((Density) objConsume).mo710toPx0680j_4(MaxDistance);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 297230880, "CC(remember):TimePicker.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m3926boximpl(Offset.Companion.m3953getZeroF1C5BW0()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 297232963, "CC(remember):TimePicker.kt#9igjgp");
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntOffset.m6757boximpl(IntOffset.Companion.m6776getZeronOccac()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final MutableState mutableState2 = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954363344, "CC(remember):Effects.kt#9igjgp");
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue3).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final String strM2748numberContentDescriptiondSwYdS4 = m2748numberContentDescriptiondSwYdS4(analogTimePickerState.mo1776getSelectionyecRtBI(), analogTimePickerState.is24hour(), i2, composerStartRestartGroup, (i4 + 896) - (896 | i4));
            String localString$default = CalendarLocale_jvmKt.toLocalString$default(i2, 0, 0, false, 7, null);
            boolean zAreEqual = TimePickerSelectionMode.m2765equalsimpl0(analogTimePickerState.mo1776getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m2770getMinuteyecRtBI()) ? Intrinsics.areEqual(CalendarLocale_jvmKt.toLocalString$default(analogTimePickerState.getMinute(), 0, 0, false, 7, null), localString$default) : Intrinsics.areEqual(CalendarLocale_jvmKt.toLocalString$default(analogTimePickerState.getHour(), 0, 0, false, 7, null), localString$default);
            Alignment center = Alignment.Companion.getCenter();
            Modifier modifierM1063size3ABfNKs = SizeKt.m1063size3ABfNKs(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier), MinimumInteractiveSize);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 297256763, "CC(remember):TimePicker.kt#9igjgp");
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = (Function1) new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockText$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                        invoke2(layoutCoordinates);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(LayoutCoordinates layoutCoordinates) {
                        MutableState<IntOffset> mutableState3 = mutableState2;
                        LayoutCoordinates parentCoordinates = layoutCoordinates.getParentCoordinates();
                        TimePickerKt.ClockText$lambda$33(mutableState3, parentCoordinates != null ? IntSizeKt.m6814getCenterozmzZPI(parentCoordinates.mo5522getSizeYbymL2g()) : IntOffset.Companion.m6776getZeronOccac());
                        TimePickerKt.ClockText$lambda$30(mutableState, LayoutCoordinatesKt.boundsInParent(layoutCoordinates).m3967getCenterF1C5BW0());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierFocusable$default = FocusableKt.focusable$default(OnGloballyPositionedModifierKt.onGloballyPositioned(modifierM1063size3ABfNKs, (Function1) objRememberedValue4), false, null, 3, null);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 297264943, "CC(remember):TimePicker.kt#9igjgp");
            boolean zChanged = ((-1) - (((-1) - ((composerStartRestartGroup.changedInstance(coroutineScope) ? 1 : 0) | (composerStartRestartGroup.changedInstance(analogTimePickerState) ? 1 : 0))) & ((-1) - (composerStartRestartGroup.changed(fMo710toPx0680j_4) ? 1 : 0))) == 1) | ((i4 & 7168) == 2048) | composerStartRestartGroup.changed(zAreEqual);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue5 == Composer.Companion.getEmpty()) {
                z3 = true;
                final boolean z4 = zAreEqual;
                objRememberedValue5 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockText$2$1
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
                        final CoroutineScope coroutineScope2 = coroutineScope;
                        final AnalogTimePickerState analogTimePickerState2 = analogTimePickerState;
                        final float f2 = fMo710toPx0680j_4;
                        final boolean z5 = z2;
                        final MutableState<Offset> mutableState3 = mutableState;
                        final MutableState<IntOffset> mutableState4 = mutableState2;
                        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material3.TimePickerKt$ClockText$2$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX INFO: renamed from: androidx.compose.material3.TimePickerKt$ClockText$2$1$1$1, reason: invalid class name and collision with other inner class name */
                            /* JADX INFO: compiled from: TimePicker.kt */
                            @InterfaceC1492Gx
                            @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
                            @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOKr\t\u000e\u0007r\r\b\u0011\f\u001as\u001eNn\u0019\u001d\u0012\u001b\u0005\u0017+(XgZh\\j^l", f = "!58/\u00191*1*6p-5", i = {}, l = {1674}, m = "8>GA>9(KJH>H?", n = {}, s = {})
                            static final class C01021 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ boolean $autoSwitchToMinute;
                                final /* synthetic */ MutableState<Offset> $center$delegate;
                                final /* synthetic */ float $maxDist;
                                final /* synthetic */ MutableState<IntOffset> $parentCenter$delegate;
                                final /* synthetic */ AnalogTimePickerState $state;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                C01021(AnalogTimePickerState analogTimePickerState, float f2, boolean z2, MutableState<Offset> mutableState, MutableState<IntOffset> mutableState2, Continuation<? super C01021> continuation) {
                                    super(2, continuation);
                                    this.$state = analogTimePickerState;
                                    this.$maxDist = f2;
                                    this.$autoSwitchToMinute = z2;
                                    this.$center$delegate = mutableState;
                                    this.$parentCenter$delegate = mutableState2;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new C01021(this.$state, this.$maxDist, this.$autoSwitchToMinute, this.$center$delegate, this.$parentCenter$delegate, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return ((C01021) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i2 = this.label;
                                    if (i2 == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        this.label = 1;
                                        if (TimePickerKt.m2749onTaprOwcSBo(this.$state, Offset.m3937getXimpl(TimePickerKt.ClockText$lambda$29(this.$center$delegate)), Offset.m3938getYimpl(TimePickerKt.ClockText$lambda$29(this.$center$delegate)), this.$maxDist, this.$autoSwitchToMinute, TimePickerKt.ClockText$lambda$32(this.$parentCenter$delegate), this) == coroutine_suspended) {
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

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Boolean invoke() {
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new C01021(analogTimePickerState2, f2, z5, mutableState3, mutableState4, null), 3, null);
                                return true;
                            }
                        }, 1, null);
                        SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver, z4);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            } else {
                z3 = true;
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierSemantics = SemanticsModifierKt.semantics(modifierFocusable$default, z3, (Function1) objRememberedValue5);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierSemantics);
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
            Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1481062706, "C1688@66158L48,1686@66083L186:TimePicker.kt#uh7d8r");
            Modifier.Companion companion = Modifier.Companion;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 879062471, "CC(remember):TimePicker.kt#9igjgp");
            boolean zChanged2 = composerStartRestartGroup.changed(strM2748numberContentDescriptiondSwYdS4);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue6 == Composer.Companion.getEmpty()) {
                objRememberedValue6 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockText$3$1$1
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
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM2748numberContentDescriptiondSwYdS4);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            TextKt.m2711Text4IGK_g(localString$default, SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) objRememberedValue6), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, value, composerStartRestartGroup, 0, 0, 65532);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ClockText.4
                final /* synthetic */ int $$changed;
                final /* synthetic */ boolean $autoSwitchToMinute;
                final /* synthetic */ AnalogTimePickerState $state;
                final /* synthetic */ int $value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass4(final AnalogTimePickerState analogTimePickerState2, int i22, final boolean z22, int i32) {
                    super(2);
                    analogTimePickerState = analogTimePickerState2;
                    i = i22;
                    z = z22;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    TimePickerKt.ClockText(modifier, analogTimePickerState, i, z, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))));
                }
            });
        }
    }

    public static final long ClockText$lambda$29(MutableState<Offset> mutableState) {
        return mutableState.getValue().m3947unboximpl();
    }

    public static final void ClockText$lambda$30(MutableState<Offset> mutableState, long j2) {
        mutableState.setValue(Offset.m3926boximpl(j2));
    }

    public static final long ClockText$lambda$32(MutableState<IntOffset> mutableState) {
        return mutableState.getValue().m6775unboximpl();
    }

    public static final void ClockText$lambda$33(MutableState<IntOffset> mutableState, long j2) {
        mutableState.setValue(IntOffset.m6757boximpl(j2));
    }

    /* JADX INFO: renamed from: timeInputOnChange-z7XvuPQ */
    public static final void m2750timeInputOnChangez7XvuPQ(int i2, TimePickerState timePickerState, TextFieldValue textFieldValue, TextFieldValue textFieldValue2, int i3, Function1<? super TextFieldValue, Unit> function1) {
        int iDigitToInt;
        TextFieldValue textFieldValueM6366copy3r_uNRQ$default = textFieldValue;
        if (Intrinsics.areEqual(textFieldValueM6366copy3r_uNRQ$default.getText(), textFieldValue2.getText())) {
            function1.invoke(textFieldValueM6366copy3r_uNRQ$default);
            return;
        }
        if (textFieldValueM6366copy3r_uNRQ$default.getText().length() == 0) {
            if (TimePickerSelectionMode.m2765equalsimpl0(i2, TimePickerSelectionMode.Companion.m2769getHouryecRtBI())) {
                timePickerState.setHour(0);
            } else {
                timePickerState.setMinute(0);
            }
            function1.invoke(TextFieldValue.m6366copy3r_uNRQ$default(textFieldValueM6366copy3r_uNRQ$default, "", 0L, (TextRange) null, 6, (Object) null));
            return;
        }
        try {
            if (textFieldValueM6366copy3r_uNRQ$default.getText().length() == 3 && TextRange.m6123getStartimpl(textFieldValueM6366copy3r_uNRQ$default.m6370getSelectiond9O1mEE()) == 1) {
                iDigitToInt = CharsKt.digitToInt(textFieldValueM6366copy3r_uNRQ$default.getText().charAt(0));
            } else {
                iDigitToInt = Integer.parseInt(textFieldValueM6366copy3r_uNRQ$default.getText());
            }
            if (iDigitToInt <= i3) {
                if (TimePickerSelectionMode.m2765equalsimpl0(i2, TimePickerSelectionMode.Companion.m2769getHouryecRtBI())) {
                    timePickerState.setHour(iDigitToInt);
                    if (iDigitToInt > 1 && !timePickerState.is24hour()) {
                        timePickerState.mo1777setSelection6_8s6DQ(TimePickerSelectionMode.Companion.m2770getMinuteyecRtBI());
                    }
                } else {
                    timePickerState.setMinute(iDigitToInt);
                }
                if (textFieldValueM6366copy3r_uNRQ$default.getText().length() > 2) {
                    textFieldValueM6366copy3r_uNRQ$default = TextFieldValue.m6366copy3r_uNRQ$default(textFieldValueM6366copy3r_uNRQ$default, String.valueOf(textFieldValueM6366copy3r_uNRQ$default.getText().charAt(0)), 0L, (TextRange) null, 6, (Object) null);
                }
                function1.invoke(textFieldValueM6366copy3r_uNRQ$default);
            }
        } catch (NumberFormatException | IllegalArgumentException unused) {
        }
    }

    /* JADX WARN: Type inference failed for: r2v117 */
    /* JADX WARN: Type inference failed for: r2v118, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v148 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: TimePickerTextField-1vLObsk */
    public static final void m2739TimePickerTextField1vLObsk(final Modifier modifier, final TextFieldValue textFieldValue, final Function1<? super TextFieldValue, Unit> function1, final TimePickerState timePickerState, final int i2, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, final TimePickerColors timePickerColors, Composer composer, final int i3, final int i4) {
        int i5;
        ?? r2;
        int iM2923constructorimpl;
        int iM2923constructorimpl2;
        KeyboardActions keyboardActions2 = keyboardActions;
        KeyboardOptions keyboardOptions2 = keyboardOptions;
        Composer composerStartRestartGroup = composer.startRestartGroup(1299172990);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TimePickerTextField)P(3,7,4,6,5:c#material3.TimePickerSelectionMode,2,1)1762@68219L39,1763@68284L29,1765@68374L243,1771@68670L3410,1857@72118L103,1857@72086L135:TimePicker.kt#uh7d8r");
        if ((i4 + 1) - (i4 | 1) != 0) {
            i5 = (i3 + 6) - (i3 & 6);
        } else if ((-1) - (((-1) - i3) | ((-1) - 6)) == 0) {
            i5 = (-1) - (((-1) - (composerStartRestartGroup.changed(modifier) ? 4 : 2)) & ((-1) - i3));
        } else {
            i5 = i3;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
            i5 = (i5 + 48) - (i5 & 48);
        } else if ((i3 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(textFieldValue) ? 32 : 16;
        }
        if ((i4 + 4) - (i4 | 4) != 0) {
            i5 = (i5 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i5 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 8)) != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 3072));
        } else if ((i3 & 3072) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - ((i3 + 4096) - (i3 | 4096) == 0 ? composerStartRestartGroup.changed(timePickerState) : composerStartRestartGroup.changedInstance(timePickerState) ? 2048 : 1024)));
        }
        if ((i4 & 16) != 0) {
            i5 |= 24576;
        } else if ((i3 + 24576) - (i3 | 24576) == 0) {
            i5 |= composerStartRestartGroup.changed(i2) ? 16384 : 8192;
        }
        int i6 = i4 & 32;
        if (i6 != 0) {
            i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE + i3) - (196608 | i3) == 0) {
            i5 |= composerStartRestartGroup.changed(keyboardOptions2) ? 131072 : 65536;
        }
        int i7 = (i4 + 64) - (i4 | 64);
        if (i7 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 1572864));
        } else if ((i3 & 1572864) == 0) {
            i5 |= composerStartRestartGroup.changed(keyboardActions2) ? 1048576 : 524288;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 128)) != 0) {
            i5 = (i5 + 12582912) - (i5 & 12582912);
        } else if ((i3 & 12582912) == 0) {
            int i8 = composerStartRestartGroup.changed(timePickerColors) ? 8388608 : 4194304;
            i5 = (i5 + i8) - (i5 & i8);
        }
        if ((-1) - (((-1) - 4793491) | ((-1) - i5)) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i6 != 0) {
                keyboardOptions2 = KeyboardOptions.Companion.getDefault();
            }
            if (i7 != 0) {
                keyboardActions2 = KeyboardActions.Companion.getDefault();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1299172990, i5, -1, "androidx.compose.material3.TimePickerTextField (TimePicker.kt:1761)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 882970966, "CC(remember):TimePicker.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 882973036, "CC(remember):TimePicker.kt#9igjgp");
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new FocusRequester();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            FocusRequester focusRequester = (FocusRequester) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final TextFieldColors textFieldColorsM2361colors0hiis_0 = OutlinedTextFieldDefaults.INSTANCE.m2361colors0hiis_0(timePickerColors.m2734timeSelectorContentColorvNxB06k$material3_release(true), 0L, 0L, 0L, timePickerColors.m2733timeSelectorContainerColorvNxB06k$material3_release(true), timePickerColors.m2733timeSelectorContainerColorvNxB06k$material3_release(true), 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, 3072, 2147483598, 4095);
            boolean zM2765equalsimpl0 = TimePickerSelectionMode.m2765equalsimpl0(i2, timePickerState.mo1776getSelectionyecRtBI());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            composerStartRestartGroup = composerStartRestartGroup;
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
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
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2071429233, "C1788@69244L240,1796@69494L2047,1845@71677L244,1852@71988L5,1853@72059L5,1842@71551L523:TimePicker.kt#uh7d8r");
            composerStartRestartGroup.startReplaceGroup(2011386807);
            ComposerKt.sourceInformation(composerStartRestartGroup, "1773@68737L450");
            if (zM2765equalsimpl0) {
                r2 = 1;
            } else {
                int i9 = i5 >> 3;
                int i10 = (-1) - (((-1) - ((-1) - (((-1) - i9) | ((-1) - 896)))) & ((-1) - 6));
                int i11 = i9 & 7168;
                r2 = 1;
                m2740TimeSelectorSAnMeKU(SizeKt.m1065sizeVpY3zN4(Modifier.Companion, TimeInputTokens.INSTANCE.m3555getTimeFieldContainerWidthD9Ej5fM(), TimeInputTokens.INSTANCE.m3554getTimeFieldContainerHeightD9Ej5fM()), TimePickerSelectionMode.m2765equalsimpl0(i2, TimePickerSelectionMode.Companion.m2769getHouryecRtBI()) ? getHourForDisplay(timePickerState) : timePickerState.getMinute(), timePickerState, i2, timePickerColors, composerStartRestartGroup, ((i11 + i10) - (i11 & i10)) | ((-1) - (((-1) - (i5 >> 9)) | ((-1) - 57344))));
            }
            composerStartRestartGroup.endReplaceGroup();
            if (TimePickerSelectionMode.m2765equalsimpl0(i2, TimePickerSelectionMode.Companion.m2770getMinuteyecRtBI())) {
                Strings.Companion companion = Strings.Companion;
                iM2923constructorimpl = Strings.m2923constructorimpl(R.string.m3c_time_picker_minute_text_field);
            } else {
                Strings.Companion companion2 = Strings.Companion;
                iM2923constructorimpl = Strings.m2923constructorimpl(R.string.m3c_time_picker_hour_text_field);
            }
            final String strM2993getString2EP1pXo = Strings_androidKt.m2993getString2EP1pXo(iM2923constructorimpl, composerStartRestartGroup, 0);
            Modifier modifierVisible = visible(Modifier.Companion, zM2765equalsimpl0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVisible);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3671constructorimpl2 = Updater.m3671constructorimpl(composerStartRestartGroup);
            Updater.m3678setimpl(composerM3671constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM3671constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM3671constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m3678setimpl(composerM3671constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1024044049, "C1803@69837L48,1807@70087L7,1814@70388L11,1815@70456L11,1819@70616L915,1797@69540L1991:TimePicker.kt#uh7d8r");
            Modifier modifierM1065sizeVpY3zN4 = SizeKt.m1065sizeVpY3zN4(FocusRequesterModifierKt.focusRequester(Modifier.Companion, focusRequester), TimeInputTokens.INSTANCE.m3555getTimeFieldContainerWidthD9Ej5fM(), TimeInputTokens.INSTANCE.m3554getTimeFieldContainerHeightD9Ej5fM());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1002857443, "CC(remember):TimePicker.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(strM2993getString2EP1pXo);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimePickerTextField$1$1$1$1
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
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM2993getString2EP1pXo);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierM1065sizeVpY3zN4, false, (Function1) objRememberedValue3, r2, null);
            ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localTextStyle);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Brush.Companion companion3 = Brush.Companion;
            Pair[] pairArr = new Pair[6];
            pairArr[0] = TuplesKt.to(Float.valueOf(0.0f), Color.m4168boximpl(Color.Companion.m4213getTransparent0d7_KjU()));
            pairArr[r2] = TuplesKt.to(Float.valueOf(0.1f), Color.m4168boximpl(Color.Companion.m4213getTransparent0d7_KjU()));
            pairArr[2] = TuplesKt.to(Float.valueOf(0.1f), Color.m4168boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m1928getPrimary0d7_KjU()));
            pairArr[3] = TuplesKt.to(Float.valueOf(0.9f), Color.m4168boximpl(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m1928getPrimary0d7_KjU()));
            pairArr[4] = TuplesKt.to(Float.valueOf(0.9f), Color.m4168boximpl(Color.Companion.m4213getTransparent0d7_KjU()));
            pairArr[5] = TuplesKt.to(Float.valueOf(1.0f), Color.m4168boximpl(Color.Companion.m4213getTransparent0d7_KjU()));
            Brush brushM4136verticalGradient8A3gB4$default = Brush.Companion.m4136verticalGradient8A3gB4$default(companion3, pairArr, 0.0f, 0.0f, 0, 14, (Object) null);
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(825138052, r2, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimePickerTextField$1$1$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer2, Integer num) {
                    invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Function2<? super Composer, ? super Integer, Unit> function2, Composer composer2, int i12) {
                    int i13 = i12;
                    ComposerKt.sourceInformation(composer2, "C1829@71096L403,1820@70660L857:TimePicker.kt#uh7d8r");
                    if ((i13 + 6) - (6 | i13) == 0) {
                        i13 |= composer2.changedInstance(function2) ? 4 : 2;
                    }
                    if ((i13 + 19) - (19 | i13) != 18 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(825138052, i13, -1, "androidx.compose.material3.TimePickerTextField.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1820)");
                        }
                        OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.INSTANCE;
                        String text = textFieldValue.getText();
                        VisualTransformation none = VisualTransformation.Companion.getNone();
                        PaddingValues paddingValuesM1011PaddingValues0680j_4 = PaddingKt.m1011PaddingValues0680j_4(Dp.m6638constructorimpl(0));
                        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                        TextFieldColors textFieldColors = textFieldColorsM2361colors0hiis_0;
                        final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
                        final TextFieldColors textFieldColors2 = textFieldColorsM2361colors0hiis_0;
                        ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-833003881, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimePickerTextField$1$1$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i14) {
                                ComposerKt.sourceInformation(composer3, "C1834@71391L5,1830@71148L329:TimePicker.kt#uh7d8r");
                                if ((i14 + 3) - (3 | i14) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-833003881, i14, -1, "androidx.compose.material3.TimePickerTextField.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1830)");
                                    }
                                    OutlinedTextFieldDefaults.INSTANCE.m2359Container4EFweAY(true, false, mutableInteractionSource3, null, textFieldColors2, ShapesKt.getValue(TimeInputTokens.INSTANCE.getTimeFieldContainerShape(), composer3, 6), 0.0f, 0.0f, composer3, 100663734, 200);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }, composer2, 54);
                        int i14 = i13 << 3;
                        int i15 = (i14 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i14 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION);
                        outlinedTextFieldDefaults.DecorationBox(text, function2, true, true, none, mutableInteractionSource2, false, null, null, null, null, null, null, null, textFieldColors, paddingValuesM1011PaddingValues0680j_4, composableLambdaRememberComposableLambda2, composer2, (i15 + 224640) - (i15 & 224640), 14352384, 16320);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54);
            int i12 = i5 >> 3;
            int i13 = (-1) - (((-1) - (i12 & 14)) & ((-1) - 100666368));
            int i14 = (i12 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i12 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION);
            int i15 = i5 << 3;
            BasicTextFieldKt.BasicTextField(textFieldValue, function1, modifierSemantics$default, true, false, (TextStyle) objConsume, keyboardOptions2, keyboardActions2, true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource, brushM4136verticalGradient8A3gB4$default, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) composableLambdaRememberComposableLambda, composerStartRestartGroup, (-1) - (((-1) - ((-1) - (((-1) - ((i14 + i13) - (i14 & i13))) & ((-1) - (3670016 & i15))))) & ((-1) - ((i15 + 29360128) - (i15 | 29360128)))), 199680, 7696);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierClearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(androidx.compose.foundation.layout.OffsetKt.m979offsetVpY3zN4$default(Modifier.Companion, 0.0f, SupportLabelTop, r2, null), new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimePickerTextField$1$2
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }
            });
            if (TimePickerSelectionMode.m2765equalsimpl0(i2, TimePickerSelectionMode.Companion.m2769getHouryecRtBI())) {
                Strings.Companion companion4 = Strings.Companion;
                iM2923constructorimpl2 = Strings.m2923constructorimpl(R.string.m3c_time_picker_hour);
            } else {
                Strings.Companion companion5 = Strings.Companion;
                iM2923constructorimpl2 = Strings.m2923constructorimpl(R.string.m3c_time_picker_minute);
            }
            TextKt.m2711Text4IGK_g(Strings_androidKt.m2993getString2EP1pXo(iM2923constructorimpl2, composerStartRestartGroup, 0), modifierClearAndSetSemantics, ColorSchemeKt.getValue(TimeInputTokens.INSTANCE.getTimeFieldSupportingTextColor(), composerStartRestartGroup, 6), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyKt.getValue(TimeInputTokens.INSTANCE.getTimeFieldSupportingTextFont(), composerStartRestartGroup, 6), composerStartRestartGroup, 0, 0, 65528);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            TimePickerSelectionMode timePickerSelectionModeM2762boximpl = TimePickerSelectionMode.m2762boximpl(timePickerState.mo1776getSelectionyecRtBI());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 883095798, "CC(remember):TimePicker.kt#9igjgp");
            int i16 = (-1) - (((-1) - ((i5 + 57344) - (i5 | 57344) == 16384 ? 1 : 0)) & ((-1) - (((-1) - (((-1) - i5) | ((-1) - 7168)) == 2048 || ((-1) - (((-1) - i5) | ((-1) - 4096)) != 0 && composerStartRestartGroup.changedInstance(timePickerState))) ? 1 : 0)));
            TimePickerKt$TimePickerTextField$2$1 timePickerKt$TimePickerTextField$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (i16 != 0 || timePickerKt$TimePickerTextField$2$1RememberedValue == Composer.Companion.getEmpty()) {
                timePickerKt$TimePickerTextField$2$1RememberedValue = new TimePickerKt$TimePickerTextField$2$1(timePickerState, i2, focusRequester, null);
                composerStartRestartGroup.updateRememberedValue(timePickerKt$TimePickerTextField$2$1RememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            EffectsKt.LaunchedEffect(timePickerSelectionModeM2762boximpl, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) timePickerKt$TimePickerTextField$2$1RememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final KeyboardOptions keyboardOptions3 = keyboardOptions2;
            final KeyboardActions keyboardActions3 = keyboardActions2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimePickerTextField$3
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
                    TimePickerKt.m2739TimePickerTextField1vLObsk(modifier, textFieldValue, function1, timePickerState, i2, keyboardOptions3, keyboardActions3, timePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i3) & ((-1) - 1))), i4);
                }
            });
        }
    }

    /* JADX INFO: renamed from: CircularLayout-uFdPcIQ */
    public static final void m2737CircularLayoutuFdPcIQ(Modifier modifier, final float f2, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i2, final int i3) {
        int i4;
        final Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(1548175696);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(CircularLayout)P(1,2:c#ui.unit.Dp)1871@72466L1666,1871@72419L1713:TimePicker.kt#uh7d8r");
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((6 & i2) == 0) {
            int i6 = composerStartRestartGroup.changed(companion) ? 4 : 2;
            i4 = (i6 + i2) - (i6 & i2);
        } else {
            i4 = i2;
        }
        if ((2 & i3) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 48));
        } else if ((i2 + 48) - (48 | i2) == 0) {
            i4 |= composerStartRestartGroup.changed(f2) ? 32 : 16;
        }
        if ((4 & i3) != 0) {
            i4 = (i4 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i4 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (384 | i2) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function2) ? 256 : 128)));
        }
        if ((i4 + 147) - (147 | i4) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i5 != 0) {
                companion = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1548175696, i4, -1, "androidx.compose.material3.CircularLayout (TimePicker.kt:1870)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -328610546, "CC(remember):TimePicker.kt#9igjgp");
            boolean z2 = (-1) - (((-1) - i4) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)) == 32;
            MeasurePolicy measurePolicyRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || measurePolicyRememberedValue == Composer.Companion.getEmpty()) {
                measurePolicyRememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.TimePickerKt$CircularLayout$1$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* JADX INFO: renamed from: measure-3p2s80s */
                    public final MeasureResult mo375measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, final long j2) {
                        Measurable measurable;
                        Measurable measurable2;
                        final float f3 = measureScope.mo710toPx0680j_4(f2);
                        long jM6582copyZbe2FdA$default = Constraints.m6582copyZbe2FdA$default(j2, 0, 0, 0, 0, 10, null);
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        int i7 = 0;
                        for (int i8 = 0; i8 < size; i8++) {
                            Measurable measurable3 = list.get(i8);
                            Measurable measurable4 = measurable3;
                            if (LayoutIdKt.getLayoutId(measurable4) != LayoutId.Selector && LayoutIdKt.getLayoutId(measurable4) != LayoutId.InnerCircle) {
                                arrayList.add(measurable3);
                            }
                        }
                        ArrayList arrayList2 = arrayList;
                        ArrayList arrayList3 = new ArrayList(arrayList2.size());
                        int size2 = arrayList2.size();
                        for (int i9 = 0; i9 < size2; i9++) {
                            arrayList3.add(((Measurable) arrayList2.get(i9)).mo5514measureBRTryo0(jM6582copyZbe2FdA$default));
                        }
                        final ArrayList arrayList4 = arrayList3;
                        int size3 = list.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 >= size3) {
                                measurable = null;
                                break;
                            }
                            measurable = list.get(i10);
                            if (LayoutIdKt.getLayoutId(measurable) == LayoutId.Selector) {
                                break;
                            }
                            i10++;
                        }
                        Measurable measurable5 = measurable;
                        int size4 = list.size();
                        while (true) {
                            if (i7 >= size4) {
                                measurable2 = null;
                                break;
                            }
                            measurable2 = list.get(i7);
                            if (LayoutIdKt.getLayoutId(measurable2) == LayoutId.InnerCircle) {
                                break;
                            }
                            i7++;
                        }
                        Measurable measurable6 = measurable2;
                        final float size5 = 6.2831855f / arrayList4.size();
                        final Placeable placeableMo5514measureBRTryo0 = measurable5 != null ? measurable5.mo5514measureBRTryo0(jM6582copyZbe2FdA$default) : null;
                        final Placeable placeableMo5514measureBRTryo02 = measurable6 != null ? measurable6.mo5514measureBRTryo0(jM6582copyZbe2FdA$default) : null;
                        return MeasureScope.layout$default(measureScope, Constraints.m6593getMinWidthimpl(j2), Constraints.m6592getMinHeightimpl(j2), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TimePickerKt$CircularLayout$1$1.1
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
                                Placeable placeable = placeableMo5514measureBRTryo0;
                                if (placeable != null) {
                                    Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
                                }
                                List<Placeable> list2 = arrayList4;
                                long j3 = j2;
                                float f4 = f3;
                                float f5 = size5;
                                int size6 = list2.size();
                                for (int i11 = 0; i11 < size6; i11++) {
                                    Placeable placeable2 = list2.get(i11);
                                    double d2 = f4;
                                    double d3 = ((double) (i11 * f5)) - 1.5707963267948966d;
                                    Placeable.PlacementScope.place$default(placementScope, placeable2, MathKt.roundToInt((Math.cos(d3) * d2) + ((double) ((Constraints.m6591getMaxWidthimpl(j3) / 2) - (placeable2.getWidth() / 2)))), MathKt.roundToInt((d2 * Math.sin(d3)) + ((double) ((Constraints.m6590getMaxHeightimpl(j3) / 2) - (placeable2.getHeight() / 2)))), 0.0f, 4, null);
                                }
                                Placeable placeable3 = placeableMo5514measureBRTryo02;
                                if (placeable3 != null) {
                                    Placeable.PlacementScope.place$default(placementScope, placeable3, (Constraints.m6593getMinWidthimpl(j2) - placeableMo5514measureBRTryo02.getWidth()) / 2, (Constraints.m6592getMinHeightimpl(j2) - placeableMo5514measureBRTryo02.getHeight()) / 2, 0.0f, 4, null);
                                }
                            }
                        }, 4, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(measurePolicyRememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) measurePolicyRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            int i7 = (-1) - (((-1) - (i4 >> 6)) | ((-1) - 14));
            int i8 = (i4 << 3) & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION;
            int i9 = (i7 + i8) - (i7 & i8);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            int i10 = i9 << 6;
            int i11 = (i10 + 896) - (i10 | 896);
            int i12 = (i11 + 6) - (i11 & 6);
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
            Updater.m3678setimpl(composerM3671constructorimpl, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            int i13 = i12 >> 6;
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i13 + 14) - (i13 | 14)));
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$CircularLayout$2
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
                    TimePickerKt.m2737CircularLayoutuFdPcIQ(companion, f2, function2, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i2) & ((-1) - 1))), i3);
                }
            });
        }
    }

    /* JADX INFO: renamed from: numberContentDescription-dSwYdS4 */
    public static final String m2748numberContentDescriptiondSwYdS4(int i2, boolean z2, int i3, Composer composer, int i4) {
        int iM2923constructorimpl;
        ComposerKt.sourceInformationMarkerStart(composer, 194237364, "C(numberContentDescription)P(2:c#material3.TimePickerSelectionMode)1924@74567L21:TimePicker.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(194237364, i4, -1, "androidx.compose.material3.numberContentDescription (TimePicker.kt:1914)");
        }
        if (TimePickerSelectionMode.m2765equalsimpl0(i2, TimePickerSelectionMode.Companion.m2770getMinuteyecRtBI())) {
            Strings.Companion companion = Strings.Companion;
            iM2923constructorimpl = Strings.m2923constructorimpl(R.string.m3c_time_picker_minute_suffix);
        } else if (z2) {
            Strings.Companion companion2 = Strings.Companion;
            iM2923constructorimpl = Strings.m2923constructorimpl(R.string.m3c_time_picker_hour_24h_suffix);
        } else {
            Strings.Companion companion3 = Strings.Companion;
            iM2923constructorimpl = Strings.m2923constructorimpl(R.string.m3c_time_picker_hour_suffix);
        }
        String strM2994getStringqBjtwXw = Strings_androidKt.m2994getStringqBjtwXw(iM2923constructorimpl, new Object[]{Integer.valueOf(i3)}, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return strM2994getStringqBjtwXw;
    }

    private static final float dist(float f2, float f3, int i2, int i3) {
        return (float) Math.hypot(i2 - f2, i3 - f3);
    }

    public static final float atan(float f2, float f3) {
        float fAtan2 = ((float) Math.atan2(f2, f3)) - 1.5707964f;
        return fAtan2 < 0.0f ? fAtan2 + FullCircle : fAtan2;
    }

    private static final Modifier visible(Modifier modifier, final boolean z2) {
        return modifier.then(new VisibleModifier(z2, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material3.TimePickerKt$visible$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName(ViewProps.VISIBLE);
                inspectorInfo.getProperties().set(ViewProps.VISIBLE, Boolean.valueOf(z2));
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    private static final boolean TimePicker_mT9BvqQ$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    static {
        float f2 = 24;
        ClockFaceBottomMargin = Dp.m6638constructorimpl(f2);
        DisplaySeparatorWidth = Dp.m6638constructorimpl(f2);
        TimeInputBottomPadding = Dp.m6638constructorimpl(f2);
        IntList intListIntListOf = IntListKt.intListOf(12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        Hours = intListIntListOf;
        MutableIntList mutableIntList = new MutableIntList(intListIntListOf.getSize());
        int[] iArr = intListIntListOf.content;
        int i2 = intListIntListOf._size;
        for (int i3 = 0; i3 < i2; i3++) {
            mutableIntList.add((iArr[i3] % 12) + 12);
        }
        ExtraHours = mutableIntList;
        PeriodToggleMargin = Dp.m6638constructorimpl(12);
    }
}
