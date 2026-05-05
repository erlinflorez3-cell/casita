package androidx.compose.material3;

import android.content.res.Configuration;
import androidx.activity.BackEventCompat;
import androidx.activity.compose.BackHandlerKt;
import androidx.activity.compose.PredictiveBackHandlerKt;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.shape.GenericShape;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.material3.internal.MutableWindowInsets;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.dynatrace.android.agent.conf.SessionSplitConfiguration;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.truncatedMessage(InvalidProtocolBufferException.java:70)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readRawBytesSlowPath(CodedInputStream.java:1250)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readBytes(CodedInputStream.java:529)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:244)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: SearchBar.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯŅ\u0014D߬)\u001ew\u0006LDit\fA\u001c0\u0013ǞJ~8,\u001aw\u0015krˎ8D{H6RY.\u0017k\u00124,Ӌ,qY;]\u001a\u0004\"\u0011OdgonP\\\u0013C\u001d\u0012\u001exp:QU\u000f]\u001aƁ:B}?;ݹw=O`|6\u001b :Ĳ@y\u0013\n\"ݒP\u0010\rzKŷ\u0014\u0012F@xíZ\rc\u0005\"Ň\u000e>6\u0001&\\mO>H\u0003]B/9\u0003qBT1g0\u0013M\u0015FZ)\u0015vw\u001e3@=9\u001d%i\u0003\u000fRq?\u000bӊy=\u001bh/ݐ3I\nW>X\u0016\u0014\u001d+U\u0015er<\\\rQf\f/+ecSP\u00141\u0010ߐz\u001bf\u001c\u000e4Rx=;F~\u0013\u001e5\u0005r\u0002k~/ެF\u007f\u0001\u0010f\u001b3/K+gK\u0017aol1ZG}\u0015\rLS\u0011p1[\u00039\u000fGKZ}Q?\u0005X=v\u0003:_Cm\u0012&z\u0002X:`M\u0006/\nHF\u0017So\f?)!y;`D\u0016\n5fnSw\r`@P\u0002FQ8D$pTf\u0015k~\u0011h.!MJ\u007f50ݔ\u0017 b&˶%%\u0016\f\u0016mʂiܔύ\u000e'5%E\u0019\u0007\u0092\u000eecv3c|\u0014\u0014o\u0013\u000f\u0014mT\u0013\u0015f(Z_\u001c\\l(PJXl w*o|>CBM44@<3)\\C`\u0013 RA+4\u000e\r\u0019\u0014\r\u0018K$1\u001aT\u0005\u0017Ehh\u0001qwxw\\\rb2-o|cKV[(hB0;\u0007-(0MmLU\u0012\u0005\u0016$\u0006,3\u001c\u001aG\u0018GJ#\u0011\u000f)`-CDz ϯUM\u0018U+\u0010\u007f\u000fI0Ft\u0018l\u0001,\u000f\u0016`N\u0003DȔz^xQ8w\u0006yo\u000f\u0013TsV\u001b[lt\t\u0002\biҡ<|\u000bMN+\u0007o02M-q]M\u001c}\u0014=Ly]\u0018(^\u007fh\u000f4.}\u0004ZvFuhQklS8wl/F($zLZJ\u0001v6\r9N\u001bn`Wtrf8{G?\u007fv\u0007Z8\u001f\tݍ>\u0013u,ӑ2_01\n\u0003ү]ƹѼ\u0015OY3{:cŨ\nX\\\"\u000b*\\\u001f!*i8agd\u001904\u001fFcװ?b\u000bj9(B[T\b9s\u0005y\u0014A\u0013\fVa\u001f\u0017`r\u0004=f\u000e\u0003$\u000b\tx\u000bfEnTB\u0001-Cc$~5?:\u0006F\u0003e\u00148\u0007S+@3j}7\u0017+1Dbr3(\u0007\u0014;KcCW<N\u0004u<\u001equ\fFf\u0015\u001dpgKS_Lw\r@`\u001bU\u0013\u000btx\"f\u0001yP[Ή~|\u0014j\u009f\u0013\u000b\u001f\r9tݧ,ًϸ{9Ij\u000fh\\͜\u0007\u001aJ{FIX69;}ajB?,ga|\u0016\u00140\"7\u0004#9lY\u001ef8\tIlF\u0002$%\u001a\u0015#R0\u0004\\b\u0005t\u001a.6a}4c\u0006!\"qk&Qp791\u001eN[j\t\n\u0012\u001dspe\u000b1\u0012_\t*t3P+<?M\\G\t`@\u0011aep\u0011.DE9%6\u0016)A\u001d_exp\u001azq\fY\\֗.a7^\u00031\u0004\u001f\b=\u001c7d*%;\u0005xTc7\n\u05cfFW\u0014\r\u001b;jt\u001aq,\n\u000fJn\u0011A_\\qL\u0012Ԙ;\u0019%\n=Mf\u0007\u0012za&Og\u0003E!7@B\b(%I3@ht\u000ecZ\t!\u0013\u001823Fbw2'\b7\u001ej\t&Y\u0014PB6{A\u0016\u0017/h\u00028@r\u0019J\u0006\u0002MOT)\u0017%:\u0016o5UElaSSU//Ӹ\u0011?\u007f_ˬ>s=0i4ߢnߦ˓j=+\bs ?ۀ\u0001s\u001f\u0017M\u0012\u0002?q:\u001fMQ.{e@.\u000f/&4\u0006$z.\u001caL88t@\u0005M\b\u00104\u0005NvT'Wn\u000fr8\t\u0018s$pi?LI\u000b\u0018)FT)[I5!}n\u007f\u000bR@]\u0014eC68AC\u0015\u001b_sP+w\u001e{\\ۺa<\u0019\"4@8aD/_@\b`63\u0018Tq\"\u0003m\u007f\u0018@>\u0018\r\u001b=\u00101\u0001s0f#\u00185\u0006\u000fFdo)SGb\u0019\u000f'$\r}r&\u0019A.DX\u0019\u0012}x\u001d%\u0015CG\"luD\u0382\u007f!#?ئ)\u0006+%1F̝TߎٌA;9i{*p˗djem!y\u0010[%\u000e@C:WXN\u001aX]\u0016\u0010UdvgrOt,{\tH0~X\u000bOk[4'MY%g\u00151\u0011\u0014\n@A7E5\u0007Ze'=z\u0018\u0002>\u001eGn;\"alJ#\"AaB\nVtI\u0004L\u001eX\u001e/yU11\u0016?]ly\u001aʂi?\u001f\u0006o\u000e\u001a\u0002?/\u0016\u00154b\u0016>\u0018;ݤc\u0003Rd\u0007:V\u0007q\u001evDz\u000f) \"-:e˴\n=\f?)\u001dް?_N\u000fF\u0011\u0017+gj*/\u0016utRqO[*$un5\u007fu{O\u000e\u0019\u001fUj1V\u0017\u0006+\u0007\u0013\u001a\\+\fy{v(`\u001bcJ\u0006j\"<\u0011\u0015g\u001d\u00040\u0013x#lr\u001c{@RG\u001bu\u0017S\f\u0005iD\u0011s\u0011tV&(b\u001b1W:VV1\u0001/P(\u0017؈6ݮՇ'i9'0O: k\u0014_J4\r\u001be\u0006{\u0014]a\u001e=s:e-\u0005le#\nzbe2\u001aj]\u000fv`NvE\\=l\u0017dZ\u0012\u001al\u001d,\u001dR\u0003U\u0004\u0010\u000bd-\"N\u001eOCQGO\u0018I\u0019ܶ\u0007ȏï\\|tJj\u0018N\b\u0014ƨ*B*4C͍Fڥ7WyغTi,)\u0016i&\u001fc܁d˲gJ+ӻ\nn\u001f^FM&\t0߮[Ξ\u0006\n*ʶD\u001a#*\u001aNDLB\"Q\u0006=:nɚhó|%\u0011½,A\u0003{&8}@\u0004f\fnbE\u0014ω_̆I-7ʗ(WWu\u0017+u\r ۂ\r÷Pm}؉]`$;\u001fo23fӐbݖF\u0017\u007fÏ\u0003FyD\u0014M\u0013\u0016zK\\\u001f\tjEԯx˙e\u0010Eө-&\u0013I\f/3B5_\u000fn.?_ސ\u001fϠUElϕd#6lJD\"\u0011XX\u0015\u0013I\u0006[ĎfΧ\u001a9M\u07be`W#h\u001cg\u0012_x٬J̉,/\u0012ϔ6B+\u000fM9;\u0004'Ҷ7ڞb\t]˰.3|` q^7\u001eɷ-ʬ3[\u0010͛jzZb%A5\u007f\u0005֗x݆\u001bG\u001d\u00028[:\u001fIy'|%BzRuh\u0002|QʌAǽ_'8۸&-!Z7\u0016<<^ؖGܒ8O}Ö`T!&2C\\ jս8օ\t5\u0012ўQSa\f1+&r5Ƞ\u0007ʻ))0\u000b&>qn\u0019\f#EBQ!\u00153m7#rЧ'ï1S~z(H0.c/W\nAu5ݡ\u0002̦M28s\u0017cl\u0002\fN\u0003o\u0019\u000b5ƄQӱ@e\u0007wD[@\u0012,sI)\u0003hRIs(r\u001cdٯq\u06dd(2\u0014əP)j\f\u0016o%e9ۂbνr7`@CAC\u000f4%\u0019\tQp\u0002¯@ЀYHl\u000ft\rpO \u0004\r>\u0018\u0002^ӕoύ\nKmڶ<MW 9kbSxţdǠ(m\u0014\rZfE\u001c<\u0007J7YH)\u001cH~E:\u0017ՓvӀ3F\u0019ۋшp6:Leͥ;Z]اt_ۣ3X`6en]Jm\u07bc͔aˢ'Ss\u00184E\u0016m ťޔ\r"}, d2 = {"\u000fmX:T;B]\"]ze(\u0011p3l\u0007,\n", "", "\u000fmX:T;B]\"^\u0004m,\ng?r{7\u007fJ\n~\u001bNv\u0012J", "\u000fmX:T;B]\"^\u0004m,\nh+s\u00041}", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG}Gj\u001a,*CPo4+tdo=\u0010e\u0002", "\u000fmX:T;B]\"^\u0004m,\ni6o{7iK\u0001\u0015", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u0001;v\u001a=M\u001fDo<\u001a$lkBtn,LL", "", "\u000fmX:T;B]\"^\u0004m,\nv3z\u007f\u0016\u0007@~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "\u000fmX:T;B]\"^\u000eb;[\u0019<a\u000f,\u0006Ih\u001b\u001eNs\u001c", "\u000fmX:T;B]\"^\u000eb;\\\u0005=i\t*", "\u000fmX:T;B]\"^\u000eb;]\u00109a\u000f\u0016\u0007@~", "\u000fmX:T;B]\"^\u000eb;j\rDem3{>", "\u000fmX:T;B]\"i\b^+\u0001\u0007>i\u0011(X<~\u001dvZs\u001d\u001d}/1hk+7k", "\u0012nR8X+\u001e\\(~\bM9x\u0012=i\u000f,\u0006I", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006V.DY\u000b\u000fDi\u001f<QR?u=s", "\u0012nR8X+\u001ef\u001d\u000eik(\u0006\u00173t\u00042\u0005", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006V89hl-3v$2\\GEt\n", "\u0012nR8X+\u001ef$z\u0004],{w+b\u0007(c<\u0014y\u0017Kq\u0011Kd#BY})$i%2W", "\u0012nR8X+\u001ef$z\u0004],{w+b\u0007(cD\ny\u0017Kq\u0011K", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "5dc\u0011b*DS\u0018^\u000ei(\u0006\b/dn$xG\u0001~\u001bPR\u000e@x(D", "u(5", "\u0014", "\u001a`h<h;\"R|\b\u0006n;]\r/l~", "", "\u001a`h<h;\"R\u0007~vk*\u007ff9n\u000f(\u0005O", "\u001a`h<h;\"R\u0007\u000f\b_(z\t", "!dP?V/\u001bO&\\\u0005k5|\u0016\u001ca~,\fN", "5dc X(KQ\u001c[vk\n\u0007\u00168e\r\u0015w?\u0005'%\u0006k\u0017E\u000141h\u0002*@{", "u(E", "!dP?V/\u001bO&bxh5f\n0s\u007f7n", "!dP?V/\u001bO&fvq\u001e\u0001\b>h", "!dP?V/\u001bO&f~g\u001e\u0001\b>h", "5dc X(KQ\u001c[vk\u0014\u0001\u0012!i~7~", "!dP?V/\u001bO&i\b^+\u0001\u0007>i\u0011(X<~\u001d~C\u0003w=w35hp\r3|\u001a8", "!dP?V/\u001bO&i\b^+\u0001\u0007>i\u0011(X<~\u001d~C\u0003w=w35hq", "!dP?V/\u001bO&i\b^+\u0001\u0007>i\u0011(X<~\u001d~Kxu8\u0004'9b", "!dP?V/\u001bO&i\b^+\u0001\u0007>i\u0011(X<~\u001d~Kx{:r,5", "!dP?V/\u001bO&ozk;\u0001\u0007+lj$z?\u0005 \u0019", "5dc X(KQ\u001c[vk\u001d|\u0016>i}$\u0003+|\u0016\u0016Kx\u0010", "#mb=X*BT\u001d~yM,\u0010\u0018\u0010i\u007f/z\u001e\u000b\u001e!T}", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e%Hh^$7t\u0015\fWJExBs", "\u0012nR8X+,S\u0015\fxa\tx\u0016", "", "7m_Bg\rBS }", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "3w_.a+>R", "", "=m4Ec(GR\u0019}Xa(\u0006\u000b/", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "AgP=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "1n[<e:", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d%1f{#\u0014i#\fWJExBs", "Bn]._\fES*z\nb6\u0006", "AgP1b>\u001eZ\u0019\u0010vm0\u0007\u0012", "1n]AX5M", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s8TSCt\"\u001c\u001fsa\u000f", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "\u0012nR8X+,S\u0015\fxa\tx\u0016vEk\u0006F!\\i", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&S\u0015\u001es =TGD59/\u001d2bI\u0010a;R\u00010U\u0016/<eP\u0002A\u001e\u001b&c5'\u0016\u0004fK(mW\u0001\u001d\u00124T\fIhJ\u001c\u001aW\u001dtoFW\u0014G\u0007j\\=2gSccxZ\u000bCl2o\u0016m\u001d&J>m\u0016~\u0015&kT,\u0018EA\u0014n]y=NC\"yE.Bln\u0010Cy]G~5\u001f\u0015\u0004s!2ex'{zM\"*2q\u0003ND\u0014K<\u0003\u001c6iO|\u0007\u0017#\u0019IZjyu\b\u0013y'+\t\u001ek3@\u001donq\u0012o\u0017f\u0015j9khN\r9\u0002GH|\u001f+E\u0012\fY\u0004\u001d\u0014\u00112m/VS$c\u0005\"p\u000e\u007fi\u0019\u000e\rt\u0018)\u0004y!\u001d\u007f", "?tT?l", "=m@BX9R1\u001cz\u0004`,", "=mB2T9<V", "/bc6i,", "=m00g0OSv\u0002vg.|", "3mP/_,=", ">kP0X/HZ\u0018~\b", ":dP1\\5@7\u0017\t\u0004", "BqP6_0GU||\u0005g", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005SD-\u0011eh9jl;N\u0004#E[R6e@|M!\u0010Zc", "\u0012nR8X+,S\u0015\fxa\tx\u0016veq\u0017xEq\u0019", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u0010/\u00025|1VSR5&W\u0004E]\u0013j\u0017L:\u0011\u000fbOmOT@\u001d\u00170S\u000b\u0007>ur\u001c\u0018DqtK \u0015X\u0002^vQ2fU]i\u0003U\u000b&r3b\u001bc'e\u0006\u0010\u000b\u0010z\u0018(rT-\u001dEQ\u001bz]\u0004ug\u0011)~\u0002\fHl_GIob\u0012i\u000e%U\u000b~\u0016;\"y<|v\u0005D34s\tUp&\b?\t\u001e*kE1/\u0003\u0012yEUr|pGWm0iQ\u000fr>/(iolVXgm YDei\n\u0004(lDS~\u001c+OHGl\u0002^\n\u0017-ktMM$bJz\u0001M n\u0015\r\f3m\u0003*\u001f<f\u0019l)r\u0001K\u001d\u0011sB\u001a{#S\u0019:J\u001diVu_U}m${\rT!\t28\u007fQPy\u0014\u0015GJ\t\t%~sPy\u007f\u001b!4=f<^g|TUS\u001e&e;x\u001b:\u000f\fYJ{lM\bud\nq{\"gB7\u0015|?Sr-FqKN=db\u0019+I$3j}_Fd\u00035Wj\f\u000f\b5\u0002\\\u0004<5qD&g~8u\f\u0019\u0006m,3%\nFX&Z\u0011n\u001e/ \bj6\t\u0019kKy\u001d\u0016\u00029L8]L\u0001(AQ^d\u000f0g;\u0004l\bP\b\u001dJ\u0011\u0013\u0012T\u00062\u000f\u0019e\u001e\u0005\u0002zNxna+\u001bx^?_,E\u001dC*(\u0001b\u001bYOf\u0018U", "!dP?V/\u001bO&", "Eh]1b>\"\\'~\nl", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\b2VBE}\u0018'#hpG\\", "!dP?V/\u001bO&Fn2xc\u000f$I", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&S\u0015\u001es =TGD59/\u001d2bI\u0010a;R\u00010U\u0016/<eP\u0002A\u001e\u001b&c5'\u0016\u0004fK(mW\u0001\u001d\u00124T\fIhJ\u001c\u001aW\u001dtoFW\u0014G\u0007j\\=2gSccxZ\u000bCl2o\u0016m\u001d&J>m\u0016~\u0015&kT,\u0018EA\u0014n]y=NC\"yE.Bln\u0010Cy]G~5\u001f\u0015\u0004s!2ex'{zM\"*2q\u0003ND\u0014K<\u0003\u001c6iO|\u0007\u0017#\u000fHJp\u007fp=!2\u001dk\u0010\u0019lC1bfosQ\u000e\u0003l\u001be>+f|K\\\u0016M\u0013a\u00190E\tT?\u0003#\t\u00162CLOM*[\u0005#:I3gZ\u0004\u0013o\u0016+2 FgXI:h5\\\u0017\u0013q\u0006abUL\u0014}R\u0014l^<Yaw/@\u0007\u0011\u0013.CTKzZC9m <\f\u0015\r\u001d\u0001?&]y\u0004", "!dP?V/\u001bO&Fln L\b\u0003Q", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u0010/\u00025|1VSR5&W\u0004E]\u0013j\u0017L:\u0011\u000fbOmOT@\u001d\u00170S\u000b\u0007>ur\u001c\u0018DqtK \u0015X\u0002^vQ2fU]i\u0003U\u000b&r3b\u001bc'e\u0006\u0010\u000b\u0010z\u0018(rT-\u001dEQ\u001bz]\u0004ug\u0011)~\u0002\fHl_GIob\u0012i\u000e%U\u000b~\u0016;\"y<|v\u0005D34s\tUp&\b?\t\u001e*kE1/\u0003\u0012yEUr|pGWm0iQ\u000fr>/(iolVXgm YDei\n\u0004(lDS~\u001c+OHGl\u0002^\n\u0017-ktMM$bJz\u0001M n\u0015\r\f3m\u0003*\u001f<f\u0019l)r\u0001K\u001d\u0011sB\u001a{#S\u0019:J\u001diVu_U}m${\rT!\t28\u007fQPy\u0014\u0015GJ\t\t%~sPy\u007f\u001b!4=f<^g|TUS\u001e&e;x\u001b:\u000f\fYJ{lM\bud\nq{\"gB7\u0015|?Sr-FqKN=db\u0019+I$3j}_IW\b?Z}Wq\b4w\u001d.\u0010/\u0004G.up\u0016b\u0015\u000b\u0017y!..JVX\u001eX\u001d|H\u0012\u001b\bk8\u0004\f1Jr\u001e\u0016\u00052R:[Dt.7\u0012\u0007\u001emBg3vj:^*0A\u001f\u0002\u0006_\u000b)N\te&\u0007ul$\u0016g[1\u0013x_\t\u001b_C^90#~dI\u007ft\u0011\u001eE\u001a\n*%\u007fCw@d#0ct*;z+|\u0011ew~,F\u001a(\u001d\u000b+>\u007fl,\u00061D||]\u000e\u001e+F\u0007^* \u0016\u000f", "!dP?V/\u001bO&b\u0003i3", "/mX:T;B]\"i\bh.\n\t=s", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\?8r4s", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkFRB\u0002", "4h]._\t:Q\u001fi\bh.\n\t=s", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u0001>w\u0012=;R7z4s", "4ha@g\t:Q\u001f^\f^5\f", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014qX<~\u001dvXo\u0017KT/=dy/\r", "1ta?X5M0\u0015|\u0001>=|\u0012>", "!dP?V/\u001bO&b\u0003i3D\u000ezjf\u0004\u0010,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u0013v\u001a6IR7h;\u001ejO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\u001fj\u0017]/\u0015\u0005#)4}@4&\b\rP\f7wn\u001b\u0012\u001d5@W>_\u000fT\u0004\u0019tTrfPaj\u0004UA\u000fo:m\u001bc%\\\u0004\"4#m\u0016\"h>=\u0006\u000bSfYN\u0003ftQ\u001dyKm<wcQO}U\u0006\u00027(Z\u007f\u007f\u0012{@\u0005:p*\u000b4\u0018E`\u0014K=~:gw\"6`@:o4F\u001bJUqu6N\u00122\u0007k\u0007\u0012c91&;LiR\u001e\u000ea %:rgJ8b\u000f<Xs\u001f0TH#k\u0003\u0013\u0018\u000b.v2\u001f*\u0017]\u007f'zH!rZ\u0001\rn#&<\u0016\u0007i\u00132,l3X\u0016\rfFUi\\? p\u001eviTqhas#IB\u000fS)>UJv\u001cKk\u001f\u0016A\u0005\u0007\u0006j=WBuC\u0011(\u00029f\u0016lg9\u0018u)\u0003yN4%\u001e:;\u0006QS8\\\u0002/ \b\u001chF\u0016gNA\u0001/PMt+\u0006jG\u0019FjaY\u001eQ\u001e.j\u0007yKisDXDt\u0006\u000e:\u007f\u0017%u+\u0007Ohh+8d\u001b\u0010\u0014x+x{\u0011aL%Q\u001dw\u0016\u001e\u0001yd.\u0012\u001a&E{^J\u000b1ND\\H@,C\u0011\rX\u000e2\"\u0015\u0004kE\u0005/!Ngik4J\u0010", "!dP?V/\u001bO&evr6\r\u0018", "Ata3T*>", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u0013v\u001a6IR7h;\u001ejO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\u001fj\u0017]/\u0015\u0005#)4}@4&\b\rP\f7wn\u001b\u0012\u001d5@W>_\u000fT\u0004\u0019tTrfPaj\u0004UA\u000fo:m\u001bc%\\\u0004\"4#m\u0016\"h>=\u0006\u000bSfYN\u0003ftQ\u001dyKm<wcQO}U\u0006\u00027(Z\u007f\u007f\u0012{@\u0005:p*\u000b4\u0018E`\u0014K=~:gw\"6`@:o4F\u001bJUqu6N\u00122\u0007k\u0007\u0012c91&;L_Q\u000e\u0014g\u001bZH+]\u000b?]\u0010LI9\u00161V\bAW\t\u0019\u0013\u0010mta]M+cJ\ftM!i#f\ft\u0018+<k$_\u0019w1c@\u0017\u0018\u001ap\u0002\r\fbA$tR\u0019{\u0015Sk`m3:\u0003\u001a\u0016v\u001aQF\u0006YGxY\u001bE\tT\u007f-|gQ}@\u001c3n\u001eiA`o3\u0015p w\u007fmB+&1:KWQv(x7\u001e{\u001dl\u0007\u001ek\b\u0019\u0012<?Xn,E0!k8cQ\u001d6Q\u0014B*r Jf}CJ8\u001b\u0010\r:|\u001b\u001cu\u0004\u007fO*q)/saoM`", "1`[0h3:b\u0019i\b^+\u0001\u0007>i\u0011(X<~\u001d~Wv\u001d@\u0002,9Y\u000b", ">q^4e,La", "1`[0h3:b\u0019i\b^+\u0001\u0007>i\u0011(X<~\u001d\u0001Hp\u001c<\u0006\u0018", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ";h]\u001aT9@W\"", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", ">qT1\\*MW*~WZ*\u0003p?l\u000f,\u0007G\u0005\u0017$", "1`[0h3:b\u0019i\b^+\u0001\u0007>i\u0011(X<~\u001d\u0001Hp\u001c<\u0006\u0018|fg1IU\t|", "uI8\u0019T5=`#\u0003yqux\u0007>i\u0011,\u000bTJs\u0013EumMv.D7\b(Bi%\u00044?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016^0&b{A#[A\nb5\u001d\u00148E1nBF#\u00125\u001fb\u001c,d", "1`[0h3:b\u0019i\b^+\u0001\u0007>i\u0011(X<~\u001d\u0001Hp\u001c<\u0006\u0019", "6dX4[;", ";`g\u001cY-LS(r", "1`[0h3:b\u0019i\b^+\u0001\u0007>i\u0011(X<~\u001d\u0001Hp\u001c<\u0006\u0019|X\u0013*\u000b:\u0002x", "uI8\u0019T5=`#\u0003yqux\u0007>i\u0011,\u000bTJs\u0013EumMv.D7\b(Bi%\u00044?DjA(\u0019gt\u0003\u0003a;R\b+V`\u0018\tXPx\u001d%\u0012c\u001d,5\u0015\u0010UPyR(\u0018bk", ";`c2e0:Zfx\b^3|\u0005=e", "CrT\u0013h3EA\u0017\fz^5j\f+p\u007f", "Ag^D66Gb\u0019\b\n"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SearchBar_androidKt {
    private static final int AnimationDelayMillis = 100;
    private static final int AnimationEnterDurationMillis = 600;
    private static final CubicBezierEasing AnimationEnterEasing;
    private static final FiniteAnimationSpec<Float> AnimationEnterFloatSpec;
    private static final FiniteAnimationSpec<IntSize> AnimationEnterSizeSpec;
    private static final int AnimationExitDurationMillis = 350;
    private static final CubicBezierEasing AnimationExitEasing;
    private static final FiniteAnimationSpec<Float> AnimationExitFloatSpec;
    private static final FiniteAnimationSpec<IntSize> AnimationExitSizeSpec;
    private static final FiniteAnimationSpec<Float> AnimationPredictiveBackExitFloatSpec;
    private static final EnterTransition DockedEnterTransition;
    private static final ExitTransition DockedExitTransition;
    private static final float DockedExpandedTableMaxHeightScreenRatio = 0.6666667f;
    private static final String LayoutIdInputField = "InputField";
    private static final String LayoutIdSearchContent = "Content";
    private static final String LayoutIdSurface = "Surface";
    private static final float SearchBarPredictiveBackMaxOffsetXRatio = 0.05f;
    private static final float SearchBarPredictiveBackMinMargin;
    private static final float SearchBarPredictiveBackMinScale = 0.9f;
    private static final float SearchBarVerticalPadding;
    private static final TextFieldColors UnspecifiedTextFieldColors = new TextFieldColors(Color.Companion.m4214getUnspecified0d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU(), new TextSelectionColors(Color.Companion.m4214getUnspecified0d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU(), null), Color.Companion.m4214getUnspecified0d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU(), null);
    private static final float SearchBarCornerRadius = Dp.m6638constructorimpl(SearchBarDefaults.INSTANCE.m2436getInputFieldHeightD9Ej5fM() / 2);
    private static final float DockedExpandedTableMinHeight = Dp.m6638constructorimpl(240);
    private static final float SearchBarMinWidth = Dp.m6638constructorimpl(SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS);
    private static final float SearchBarMaxWidth = Dp.m6638constructorimpl(720);
    private static final float SearchBarIconOffsetX = Dp.m6638constructorimpl(4);
    private static final float SearchBarPredictiveBackMaxOffsetY = Dp.m6638constructorimpl(24);

    private static /* synthetic */ void getSearchBarCornerRadius$annotations() {
    }

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
    /* JADX INFO: renamed from: SearchBar-Y92LkZI, reason: not valid java name */
    public static final void m2444SearchBarY92LkZI(final Function2<? super Composer, ? super Integer, Unit> function2, final boolean z2, final Function1<? super Boolean, Unit> function1, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f2, float f3, WindowInsets windowInsets, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        float fM2438getTonalElevationD9Ej5fM = f2;
        WindowInsets windowInsets2 = windowInsets;
        float fM2437getShadowElevationD9Ej5fM = f3;
        SearchBarColors searchBarColorsM2434colorsdgg9oW8 = searchBarColors;
        Shape inputFieldShape = shape;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(1444649673);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SearchBar)P(3,2,5,4,7!1,8:c#ui.unit.Dp,6:c#ui.unit.Dp,9)171@8255L15,172@8320L8,175@8501L12,178@8596L64,179@8689L43,180@8758L51,181@8837L51,183@8919L638,183@8894L663,199@9582L27,200@9656L1062,200@9614L1104,226@10724L458:SearchBar.android.kt#uh7d8r");
        if ((i3 + 1) - (i3 | 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 48));
        } else if ((i2 + 48) - (i2 | 48) == 0) {
            i4 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i6 = i3 & 8;
        if (i6 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 3072));
        } else if ((i2 + 3072) - (i2 | 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(companion) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((i3 + 16) - (i3 | 16) == 0 && composerStartRestartGroup.changed(inputFieldShape)) ? 16384 : 8192)));
        }
        if ((ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE + i2) - (196608 | i2) == 0) {
            int i7 = ((-1) - (((-1) - i3) | ((-1) - 32)) == 0 && composerStartRestartGroup.changed(searchBarColorsM2434colorsdgg9oW8)) ? 131072 : 65536;
            i4 = (i4 + i7) - (i4 & i7);
        }
        int i8 = i3 & 64;
        if (i8 != 0) {
            i4 = (i4 + 1572864) - (i4 & 1572864);
        } else if ((-1) - (((-1) - 1572864) | ((-1) - i2)) == 0) {
            int i9 = composerStartRestartGroup.changed(fM2438getTonalElevationD9Ej5fM) ? 1048576 : 524288;
            i4 = (i4 + i9) - (i4 & i9);
        }
        int i10 = (-1) - (((-1) - i3) | ((-1) - 128));
        if (i10 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 12582912));
        } else if ((i2 & 12582912) == 0) {
            i4 |= composerStartRestartGroup.changed(fM2437getShadowElevationD9Ej5fM) ? 8388608 : 4194304;
        }
        if ((i2 + 100663296) - (i2 | 100663296) == 0) {
            int i11 = ((-1) - (((-1) - i3) | ((-1) - 256)) == 0 && composerStartRestartGroup.changed(windowInsets2)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            i4 = (i4 + i11) - (i4 & i11);
        }
        if ((-1) - (((-1) - i3) | ((-1) - 512)) != 0) {
            i4 |= 805306368;
        } else if ((-1) - (((-1) - i2) | ((-1) - 805306368)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function3) ? 536870912 : 268435456)));
        }
        if ((-1) - (((-1) - i4) | ((-1) - 306783379)) == 306783378 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i6 != 0) {
                    companion = Modifier.Companion;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
                    inputFieldShape = SearchBarDefaults.INSTANCE.getInputFieldShape(composerStartRestartGroup, 6);
                    i4 &= -57345;
                }
                if ((i3 & 32) != 0) {
                    searchBarColorsM2434colorsdgg9oW8 = SearchBarDefaults.INSTANCE.m2434colorsdgg9oW8(0L, 0L, composerStartRestartGroup, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 3);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-458753)));
                }
                if (i8 != 0) {
                    fM2438getTonalElevationD9Ej5fM = SearchBarDefaults.INSTANCE.m2438getTonalElevationD9Ej5fM();
                }
                if (i10 != 0) {
                    fM2437getShadowElevationD9Ej5fM = SearchBarDefaults.INSTANCE.m2437getShadowElevationD9Ej5fM();
                }
                if ((-1) - (((-1) - i3) | ((-1) - 256)) != 0) {
                    windowInsets2 = SearchBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    i5 = (i4 - 234881025) - (i4 | (-234881025));
                } else {
                    i5 = i4;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-57345)));
                }
                if ((i3 + 32) - (i3 | 32) != 0) {
                    i4 = (i4 - 458753) - (i4 | (-458753));
                }
                if ((-1) - (((-1) - i3) | ((-1) - 256)) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-234881025)));
                }
                i5 = i4;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1444649673, i5, -1, "androidx.compose.material3.SearchBar (SearchBar.android.kt:177)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 626005896, "CC(remember):SearchBar.android.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = AnimatableKt.Animatable$default(z2 ? 1.0f : 0.0f, 0.0f, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Animatable animatable = (Animatable) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 626008851, "CC(remember):SearchBar.android.kt#9igjgp");
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(Float.NaN);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableFloatState mutableFloatState = (MutableFloatState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 626011067, "CC(remember):SearchBar.android.kt#9igjgp");
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            MutableState mutableState = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 626013595, "CC(remember):SearchBar.android.kt#9igjgp");
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Boolean boolValueOf = Boolean.valueOf(z2);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 626016806, "CC(remember):SearchBar.android.kt#9igjgp");
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(animatable);
            int i12 = (i5 & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) == 32 ? 1 : 0;
            int i13 = ((zChangedInstance ? 1 : 0) + i12) - ((zChangedInstance ? 1 : 0) & i12);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (i13 != 0 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                objRememberedValue5 = (Function2) new SearchBar_androidKt$SearchBar$1$1(animatable, z2, mutableFloatState, mutableState, mutableState2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            int i14 = (-1) - (((-1) - (i5 >> 3)) | ((-1) - 14));
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, i14);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 626037411, "CC(remember):SearchBar.android.kt#9igjgp");
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == Composer.Companion.getEmpty()) {
                objRememberedValue6 = new MutatorMutex();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            MutatorMutex mutatorMutex = (MutatorMutex) objRememberedValue6;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 626040814, "CC(remember):SearchBar.android.kt#9igjgp");
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(animatable) | ((i5 + 896) - (896 | i5) == 256);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue7 == Composer.Companion.getEmpty()) {
                objRememberedValue7 = (Function2) new SearchBar_androidKt$SearchBar$2$1(mutatorMutex, mutableFloatState, animatable, function1, mutableState, mutableState2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            PredictiveBackHandlerKt.PredictiveBackHandler(z2, (Function2) objRememberedValue7, composerStartRestartGroup, i14, 0);
            int i15 = Animatable.$stable | 3504;
            int i16 = (-1) - (((-1) - (i5 << 3)) | ((-1) - 57344));
            int i17 = (i15 + i16) - (i15 & i16);
            int i18 = i5 << 15;
            int i19 = (i18 + 458752) - (i18 | 458752);
            int i20 = (i17 + i19) - (i17 & i19);
            int i21 = i5 << 6;
            int i22 = (3670016 + i21) - (3670016 | i21);
            int i23 = (-1) - (((-1) - ((i20 + i22) - (i20 & i22))) & ((-1) - ((29360128 + i21) - (29360128 | i21))));
            int i24 = (234881024 + i21) - (234881024 | i21);
            int i25 = i5 >> 24;
            m2445SearchBarImplj1jLAyQ(animatable, mutableFloatState, mutableState, mutableState2, companion, function2, inputFieldShape, searchBarColorsM2434colorsdgg9oW8, fM2438getTonalElevationD9Ej5fM, fM2437getShadowElevationD9Ej5fM, windowInsets2, function3, composerStartRestartGroup, (-1) - (((-1) - ((i23 + i24) - (i23 & i24))) & ((-1) - ((i21 + 1879048192) - (i21 | 1879048192)))), (i25 + 126) - (i25 | 126), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final Shape shape2 = inputFieldShape;
            final SearchBarColors searchBarColors2 = searchBarColorsM2434colorsdgg9oW8;
            final float f4 = fM2438getTonalElevationD9Ej5fM;
            final float f5 = fM2437getShadowElevationD9Ej5fM;
            final WindowInsets windowInsets3 = windowInsets2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBar$3
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

                public final void invoke(Composer composer2, int i26) {
                    SearchBar_androidKt.m2444SearchBarY92LkZI(function2, z2, function1, modifier2, shape2, searchBarColors2, f4, f5, windowInsets3, function3, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i2) & ((-1) - 1))), i3);
                }
            });
        }
    }

    /* JADX INFO: renamed from: DockedSearchBar-EQC0FA8, reason: not valid java name */
    public static final void m2441DockedSearchBarEQC0FA8(final Function2<? super Composer, ? super Integer, Unit> function2, final boolean z2, final Function1<? super Boolean, Unit> function1, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f2, float f3, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier.Companion companion = modifier;
        float fM2437getShadowElevationD9Ej5fM = f3;
        float fM2438getTonalElevationD9Ej5fM = f2;
        final SearchBarColors searchBarColorsM2434colorsdgg9oW8 = searchBarColors;
        Shape dockedShape = shape;
        Composer composerStartRestartGroup = composer.startRestartGroup(1209217899);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(DockedSearchBar)P(3,2,5,4,7!1,8:c#ui.unit.Dp,6:c#ui.unit.Dp)287@13410L11,288@13471L8,296@13752L38,300@13946L831,293@13658L1119,325@14815L27,325@14783L59:SearchBar.android.kt#uh7d8r");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            i4 = (-1) - (((-1) - i2) & ((-1) - 6));
        } else if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            int i5 = composerStartRestartGroup.changedInstance(function2) ? 4 : 2;
            i4 = (i5 + i2) - (i5 & i2);
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 48));
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            i4 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i6 = composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
            i4 = (i4 + i6) - (i4 & i6);
        }
        int i7 = (-1) - (((-1) - i3) | ((-1) - 8));
        if (i7 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 3072));
        } else if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(companion) ? 2048 : 1024;
        }
        if ((i2 + 24576) - (i2 | 24576) == 0) {
            i4 |= ((i3 & 16) == 0 && composerStartRestartGroup.changed(dockedShape)) ? 16384 : 8192;
        }
        if ((-1) - (((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ((-1) - i2)) == 0) {
            i4 |= ((-1) - (((-1) - i3) | ((-1) - 32)) == 0 && composerStartRestartGroup.changed(searchBarColorsM2434colorsdgg9oW8)) ? 131072 : 65536;
        }
        int i8 = (i3 + 64) - (i3 | 64);
        if (i8 != 0) {
            i4 |= 1572864;
        } else if ((1572864 + i2) - (1572864 | i2) == 0) {
            i4 |= composerStartRestartGroup.changed(fM2438getTonalElevationD9Ej5fM) ? 1048576 : 524288;
        }
        int i9 = (i3 + 128) - (i3 | 128);
        if (i9 != 0) {
            i4 = (i4 + 12582912) - (i4 & 12582912);
        } else if ((-1) - (((-1) - i2) | ((-1) - 12582912)) == 0) {
            int i10 = composerStartRestartGroup.changed(fM2437getShadowElevationD9Ej5fM) ? 8388608 : 4194304;
            i4 = (i4 + i10) - (i4 & i10);
        }
        if ((i3 + 256) - (i3 | 256) != 0) {
            i4 = (i4 + 100663296) - (i4 & 100663296);
        } else if ((-1) - (((-1) - i2) | ((-1) - 100663296)) == 0) {
            int i11 = composerStartRestartGroup.changedInstance(function3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            i4 = (i4 + i11) - (i4 & i11);
        }
        if ((38347923 + i4) - (38347923 | i4) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 + 1) - (i2 | 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i7 != 0) {
                    companion = Modifier.Companion;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
                    dockedShape = SearchBarDefaults.INSTANCE.getDockedShape(composerStartRestartGroup, 6);
                    i4 = (i4 - 57345) - (i4 | (-57345));
                }
                if ((-1) - (((-1) - i3) | ((-1) - 32)) != 0) {
                    searchBarColorsM2434colorsdgg9oW8 = SearchBarDefaults.INSTANCE.m2434colorsdgg9oW8(0L, 0L, composerStartRestartGroup, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 3);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-458753)));
                }
                if (i8 != 0) {
                    fM2438getTonalElevationD9Ej5fM = SearchBarDefaults.INSTANCE.m2438getTonalElevationD9Ej5fM();
                }
                if (i9 != 0) {
                    fM2437getShadowElevationD9Ej5fM = SearchBarDefaults.INSTANCE.m2437getShadowElevationD9Ej5fM();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
                    i4 &= -57345;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 32)) != 0) {
                    i4 &= -458753;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1209217899, i4, -1, "androidx.compose.material3.DockedSearchBar (SearchBar.android.kt:292)");
            }
            long jM2430getContainerColor0d7_KjU = searchBarColorsM2434colorsdgg9oW8.m2430getContainerColor0d7_KjU();
            long jM1947contentColorForek8zF_U = ColorSchemeKt.m1947contentColorForek8zF_U(searchBarColorsM2434colorsdgg9oW8.m2430getContainerColor0d7_KjU(), composerStartRestartGroup, 0);
            Modifier modifierM1068width3ABfNKs = SizeKt.m1068width3ABfNKs(ZIndexModifierKt.zIndex(companion, 1.0f), SearchBarMinWidth);
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(878471280, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$DockedSearchBar$1
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
                    ComposerKt.sourceInformation(composer2, "C301@13956L815:SearchBar.android.kt#uh7d8r");
                    if ((-1) - (((-1) - i12) | ((-1) - 3)) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(878471280, i12, -1, "androidx.compose.material3.DockedSearchBar.<anonymous> (SearchBar.android.kt:301)");
                    }
                    Function2<Composer, Integer, Unit> function22 = function2;
                    boolean z3 = z2;
                    final SearchBarColors searchBarColors2 = searchBarColorsM2434colorsdgg9oW8;
                    final Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                    ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                    Modifier.Companion companion2 = Modifier.Companion;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer2, 0);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, companion2);
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
                    Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                    if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, 1812191551, "C302@13977L12,308@14165L596,304@14003L758:SearchBar.android.kt#uh7d8r");
                    function22.invoke(composer2, 0);
                    AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, z3, (Modifier) null, SearchBar_androidKt.DockedEnterTransition, SearchBar_androidKt.DockedExitTransition, (String) null, ComposableLambdaKt.rememberComposableLambda(-1743690306, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$DockedSearchBar$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) {
                            invoke(animatedVisibilityScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, int i13) {
                            ComposerKt.sourceInformation(composer3, "C*309@14221L7,311@14299L125,315@14477L76,317@14571L176:SearchBar.android.kt#uh7d8r");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1743690306, i13, -1, "androidx.compose.material3.DockedSearchBar.<anonymous>.<anonymous>.<anonymous> (SearchBar.android.kt:309)");
                            }
                            ProvidableCompositionLocal<Configuration> localConfiguration = AndroidCompositionLocals_androidKt.getLocalConfiguration();
                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object objConsume = composer3.consume(localConfiguration);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            float fM6638constructorimpl = Dp.m6638constructorimpl(((Configuration) objConsume).screenHeightDp);
                            ComposerKt.sourceInformationMarkerStart(composer3, 1708554480, "CC(remember):SearchBar.android.kt#9igjgp");
                            boolean zChanged = composer3.changed(fM6638constructorimpl);
                            Object objRememberedValue = composer3.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                                objRememberedValue = Dp.m6636boximpl(Dp.m6638constructorimpl(fM6638constructorimpl * 0.6666667f));
                                composer3.updateRememberedValue(objRememberedValue);
                            }
                            float fM6652unboximpl = ((Dp) objRememberedValue).m6652unboximpl();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerStart(composer3, 1708560127, "CC(remember):SearchBar.android.kt#9igjgp");
                            boolean zChanged2 = composer3.changed(fM6652unboximpl);
                            Object objRememberedValue2 = composer3.rememberedValue();
                            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                                objRememberedValue2 = Dp.m6636boximpl(((Dp) RangesKt.coerceAtMost(Dp.m6636boximpl(SearchBar_androidKt.getDockedExpandedTableMinHeight()), Dp.m6636boximpl(fM6652unboximpl))).m6652unboximpl());
                                composer3.updateRememberedValue(objRememberedValue2);
                            }
                            float fM6652unboximpl2 = ((Dp) objRememberedValue2).m6652unboximpl();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            Modifier modifierM1050heightInVpY3zN4 = SizeKt.m1050heightInVpY3zN4(Modifier.Companion, fM6652unboximpl2, fM6652unboximpl);
                            SearchBarColors searchBarColors3 = searchBarColors2;
                            Function3<ColumnScope, Composer, Integer, Unit> function33 = function32;
                            ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer3, 0);
                            ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierM1050heightInVpY3zN4);
                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor2);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM3671constructorimpl2 = Updater.m3671constructorimpl(composer3);
                            Updater.m3678setimpl(composerM3671constructorimpl2, measurePolicyColumnMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                            Updater.m3678setimpl(composerM3671constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                            if (composerM3671constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM3671constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM3671constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m3678setimpl(composerM3671constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer3, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer3, 697724229, "C318@14653L46,319@14720L9:SearchBar.android.kt#uh7d8r");
                            DividerKt.m2090HorizontalDivider9IZ8Weo(null, 0.0f, searchBarColors3.m2431getDividerColor0d7_KjU(), composer3, 0, 3);
                            function33.invoke(columnScopeInstance2, composer3, 6);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 1600518, 18);
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
            int i12 = i4 >> 6;
            int i13 = ((-1) - (((-1) - (i4 >> 9)) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))) | 12582912 | (57344 & i12);
            int i14 = (-1) - (((-1) - i12) | ((-1) - 458752));
            SurfaceKt.m2561SurfaceT9BRK9s(modifierM1068width3ABfNKs, dockedShape, jM2430getContainerColor0d7_KjU, jM1947contentColorForek8zF_U, fM2438getTonalElevationD9Ej5fM, fM2437getShadowElevationD9Ej5fM, null, composableLambdaRememberComposableLambda, composerStartRestartGroup, (i13 + i14) - (i13 & i14), 64);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -994322031, "CC(remember):SearchBar.android.kt#9igjgp");
            boolean z3 = (i4 & 896) == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$DockedSearchBar$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
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
                        function1.invoke(false);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            int i15 = i4 >> 3;
            BackHandlerKt.BackHandler(z2, (Function0) objRememberedValue, composerStartRestartGroup, (i15 + 14) - (i15 | 14), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final float f4 = fM2438getTonalElevationD9Ej5fM;
            final float f5 = fM2437getShadowElevationD9Ej5fM;
            final Modifier modifier2 = companion;
            final Shape shape2 = dockedShape;
            final SearchBarColors searchBarColors2 = searchBarColorsM2434colorsdgg9oW8;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$DockedSearchBar$3
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
                    Function2<Composer, Integer, Unit> function22 = function2;
                    boolean z4 = z2;
                    Function1<Boolean, Unit> function12 = function1;
                    Modifier modifier3 = modifier2;
                    Shape shape3 = shape2;
                    SearchBarColors searchBarColors3 = searchBarColors2;
                    float f6 = f4;
                    float f7 = f5;
                    Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                    int i17 = i2;
                    SearchBar_androidKt.m2441DockedSearchBarEQC0FA8(function22, z4, function12, modifier3, shape3, searchBarColors3, f6, f7, function32, composer2, RecomposeScopeImplKt.updateChangedFlags((i17 + 1) - (i17 & 1)), i3);
                }
            });
        }
    }

    @Deprecated(message = "\u0018Y\u0001t\u0001\u000b\u001aidV)~\u0010,4W_TH;\u0006s\u0011e6O|zc\t\nomXh\u0002No(:\u0006.4L\u0013cQ\u000e'j", replaceWith = @ReplaceWith(expression = "SearchBar(\n    inputField = {\n        SearchBarDefaults.InputField(\n            query = query,\n            onQueryChange = onQueryChange,\n            onSearch = onSearch,\n            expanded = active,\n            onExpandedChange = onActiveChange,\n            enabled = enabled,\n            placeholder = placeholder,\n            leadingIcon = leadingIcon,\n            trailingIcon = trailingIcon,\n            colors = colors.inputFieldColors,\n            interactionSource = interactionSource,\n        )\n    },\n    expanded = active,\n    onExpandedChange = onActiveChange,\n    modifier = modifier,\n    shape = shape,\n    colors = colors,\n    tonalElevation = tonalElevation,\n    shadowElevation = shadowElevation,\n    windowInsets = windowInsets,\n    content = content,\n)", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: SearchBar-WuY5d9Q, reason: not valid java name */
    public static final void m2443SearchBarWuY5d9Q(final String str, final Function1<? super String, Unit> function1, final Function1<? super String, Unit> function12, boolean z2, Function1<? super Boolean, Unit> function13, Modifier modifier, boolean z3, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Shape shape, SearchBarColors searchBarColors, float f2, float f3, WindowInsets windowInsets, MutableInteractionSource mutableInteractionSource, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        final boolean z4;
        final MutableInteractionSource mutableInteractionSource2;
        WindowInsets windowInsets2 = windowInsets;
        float fM2437getShadowElevationD9Ej5fM = f3;
        float fM2438getTonalElevationD9Ej5fM = f2;
        SearchBarColors searchBarColorsM2434colorsdgg9oW8 = searchBarColors;
        Function2<? super Composer, ? super Integer, Unit> function24 = function23;
        Function2<? super Composer, ? super Integer, Unit> function25 = function22;
        Function2<? super Composer, ? super Integer, Unit> function26 = function2;
        Shape inputFieldShape = shape;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(1001512593);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SearchBar)P(11,8,9!1,7,6,3,10,5,15,13!1,14:c#ui.unit.Dp,12:c#ui.unit.Dp,16,4)737@34012L15,738@34077L8,741@34258L12,746@34418L591,745@34386L925:SearchBar.android.kt#uh7d8r");
        if ((-1) - (((-1) - i4) | ((-1) - 1)) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
            i5 |= 48;
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changedInstance(function1) ? 32 : 16)));
        }
        if ((i4 + 4) - (i4 | 4) != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        final boolean z5 = z2;
        if ((-1) - (((-1) - i4) | ((-1) - 8)) != 0) {
            i5 |= 3072;
        } else if ((i2 + 3072) - (i2 | 3072) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(z5) ? 2048 : 1024)));
        }
        int i7 = 8192;
        final Function1<? super Boolean, Unit> function14 = function13;
        if ((i4 + 16) - (i4 | 16) != 0) {
            i5 |= 24576;
        } else if ((i2 + 24576) - (i2 | 24576) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function14) ? 16384 : 8192;
        }
        int i8 = (-1) - (((-1) - i4) | ((-1) - 32));
        if (i8 != 0) {
            i5 = (i5 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        } else if ((-1) - (((-1) - i2) | ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE)) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(companion) ? 131072 : 65536)));
        }
        int i9 = i4 & 64;
        if (i9 != 0) {
            i5 |= 1572864;
        } else if ((-1) - (((-1) - i2) | ((-1) - 1572864)) == 0) {
            i5 |= composerStartRestartGroup.changed(z3) ? 1048576 : 524288;
        }
        int i10 = i4 & 128;
        if (i10 != 0) {
            i5 = (i5 + 12582912) - (i5 & 12582912);
        } else if ((i2 + 12582912) - (i2 | 12582912) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function26) ? 8388608 : 4194304;
        }
        int i11 = (i4 + 256) - (i4 | 256);
        if (i11 != 0) {
            i5 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function25) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        int i12 = (-1) - (((-1) - i4) | ((-1) - 512));
        if (i12 != 0) {
            i5 = (i5 + 805306368) - (i5 & 805306368);
        } else if ((-1) - (((-1) - i2) | ((-1) - 805306368)) == 0) {
            int i13 = composerStartRestartGroup.changedInstance(function24) ? 536870912 : 268435456;
            i5 = (i5 + i13) - (i5 & i13);
        }
        if ((i3 + 6) - (i3 | 6) == 0) {
            i6 = (-1) - (((-1) - i3) & ((-1) - (((i4 + 1024) - (i4 | 1024) == 0 && composerStartRestartGroup.changed(inputFieldShape)) ? 4 : 2)));
        } else {
            i6 = i3;
        }
        if ((i3 + 48) - (i3 | 48) == 0) {
            int i14 = ((i4 + 2048) - (i4 | 2048) == 0 && composerStartRestartGroup.changed(searchBarColorsM2434colorsdgg9oW8)) ? 32 : 16;
            i6 = (i6 + i14) - (i6 & i14);
        }
        int i15 = (i4 + 4096) - (i4 | 4096);
        if (i15 != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((-1) - (((-1) - i3) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i6 |= composerStartRestartGroup.changed(fM2438getTonalElevationD9Ej5fM) ? 256 : 128;
        }
        int i16 = (i4 + 8192) - (i4 | 8192);
        if (i16 != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - 3072));
        } else if ((i3 & 3072) == 0) {
            int i17 = composerStartRestartGroup.changed(fM2437getShadowElevationD9Ej5fM) ? 2048 : 1024;
            i6 = (i6 + i17) - (i6 & i17);
        }
        if ((i3 & 24576) == 0) {
            if ((-1) - (((-1) - i4) | ((-1) - 16384)) == 0 && composerStartRestartGroup.changed(windowInsets2)) {
                i7 = 16384;
            }
            i6 |= i7;
        }
        int i18 = (-1) - (((-1) - i4) | ((-1) - 32768));
        if (i18 != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE));
        } else if ((i3 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i3 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changed(mutableInteractionSource) ? 131072 : 65536)));
        }
        if ((-1) - (((-1) - i4) | ((-1) - 65536)) != 0) {
            i6 = (i6 + 1572864) - (i6 & 1572864);
        } else if ((i3 & 1572864) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(function3) ? 1048576 : 524288;
        }
        if ((i5 + 306783379) - (306783379 | i5) == 306783378 && (599187 & i6) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            mutableInteractionSource2 = mutableInteractionSource;
            z4 = z3;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((-1) - (((-1) - i2) | ((-1) - 1)) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i8 != 0) {
                    companion = Modifier.Companion;
                }
                z4 = i9 == 0 ? z3 : true;
                mutableInteractionSource2 = null;
                if (i10 != 0) {
                    function26 = null;
                }
                if (i11 != 0) {
                    function25 = null;
                }
                if (i12 != 0) {
                    function24 = null;
                }
                if ((i4 & 1024) != 0) {
                    inputFieldShape = SearchBarDefaults.INSTANCE.getInputFieldShape(composerStartRestartGroup, 6);
                    i6 = (i6 - 15) - (i6 | (-15));
                }
                if ((i4 + 2048) - (i4 | 2048) != 0) {
                    searchBarColorsM2434colorsdgg9oW8 = SearchBarDefaults.INSTANCE.m2434colorsdgg9oW8(0L, 0L, composerStartRestartGroup, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 3);
                    i6 &= -113;
                }
                if (i15 != 0) {
                    fM2438getTonalElevationD9Ej5fM = SearchBarDefaults.INSTANCE.m2438getTonalElevationD9Ej5fM();
                }
                if (i16 != 0) {
                    fM2437getShadowElevationD9Ej5fM = SearchBarDefaults.INSTANCE.m2437getShadowElevationD9Ej5fM();
                }
                if ((-1) - (((-1) - i4) | ((-1) - 16384)) != 0) {
                    windowInsets2 = SearchBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    i6 = (-1) - (((-1) - i6) | ((-1) - (-57345)));
                }
                if (i18 == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((-1) - (((-1) - i4) | ((-1) - 1024)) != 0) {
                    i6 = (i6 - 15) - (i6 | (-15));
                }
                if ((i4 & 2048) != 0) {
                    i6 &= -113;
                }
                if ((i4 & 16384) != 0) {
                    i6 = (i6 - 57345) - (i6 | (-57345));
                }
                mutableInteractionSource2 = mutableInteractionSource;
                z4 = z3;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1001512593, i5, i6, "androidx.compose.material3.SearchBar (SearchBar.android.kt:745)");
            }
            final SearchBarColors searchBarColors2 = searchBarColorsM2434colorsdgg9oW8;
            final Function2<? super Composer, ? super Integer, Unit> function27 = function26;
            final Function2<? super Composer, ? super Integer, Unit> function28 = function25;
            final Function2<? super Composer, ? super Integer, Unit> function29 = function24;
            final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1158111311, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBar$4
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
                    ComposerKt.sourceInformation(composer2, "C747@34450L549:SearchBar.android.kt#uh7d8r");
                    if ((i19 + 3) - (3 | i19) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1158111311, i19, -1, "androidx.compose.material3.SearchBar.<anonymous> (SearchBar.android.kt:747)");
                        }
                        SearchBarDefaults.INSTANCE.InputField(str, function1, function12, z5, function14, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), z4, function27, function28, function29, searchBarColors2.getInputFieldColors(), mutableInteractionSource3, composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54);
            int i19 = i5 >> 6;
            int i20 = 112 & i19;
            int i21 = ((-1) - (((-1) - ((6 + i20) - (6 & i20))) & ((-1) - ((-1) - (((-1) - i19) | ((-1) - 896)))))) | ((i19 + 7168) - (i19 | 7168));
            int i22 = i6 << 12;
            int i23 = i21 | ((-1) - (((-1) - 57344) | ((-1) - i22)));
            int i24 = (458752 + i22) - (458752 | i22);
            int i25 = (i23 + i24) - (i23 & i24);
            int i26 = (-1) - (((-1) - 3670016) | ((-1) - i22));
            int i27 = (-1) - (((-1) - (((i25 + i26) - (i25 & i26)) | (29360128 & i22))) & ((-1) - (i22 & 234881024)));
            int i28 = (-1) - (((-1) - (i6 << 9)) | ((-1) - 1879048192));
            z5 = z5;
            function14 = function14;
            m2444SearchBarY92LkZI(composableLambdaRememberComposableLambda, z5, function14, companion, inputFieldShape, searchBarColorsM2434colorsdgg9oW8, fM2438getTonalElevationD9Ej5fM, fM2437getShadowElevationD9Ej5fM, windowInsets2, function3, composerStartRestartGroup, (i27 + i28) - (i27 & i28), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final boolean z6 = z5;
            final Function1<? super Boolean, Unit> function15 = function14;
            final Modifier modifier2 = companion;
            final Function2<? super Composer, ? super Integer, Unit> function210 = function26;
            final Function2<? super Composer, ? super Integer, Unit> function211 = function25;
            final Function2<? super Composer, ? super Integer, Unit> function212 = function24;
            final Shape shape2 = inputFieldShape;
            final SearchBarColors searchBarColors3 = searchBarColorsM2434colorsdgg9oW8;
            final float f4 = fM2438getTonalElevationD9Ej5fM;
            final float f5 = fM2437getShadowElevationD9Ej5fM;
            final WindowInsets windowInsets3 = windowInsets2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBar$5
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

                public final void invoke(Composer composer2, int i29) {
                    SearchBar_androidKt.m2443SearchBarWuY5d9Q(str, function1, function12, z6, function15, modifier2, z4, function210, function211, function212, shape2, searchBarColors3, f4, f5, windowInsets3, mutableInteractionSource2, function3, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i2) & ((-1) - 1))), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                }
            });
        }
    }

    @Deprecated(message = "\u0018Y\u0001t\u0001\u000b\u001aidV)~\u0010,4W_TH;\u0006s\u0011e6O|zc\t\nomXh\u0002No(:\u0006.4L\u0013cQ\u000e'j", replaceWith = @ReplaceWith(expression = "DockedSearchBar(\n    inputField = {\n        SearchBarDefaults.InputField(\n            query = query,\n            onQueryChange = onQueryChange,\n            onSearch = onSearch,\n            expanded = active,\n            onExpandedChange = onActiveChange,\n            enabled = enabled,\n            placeholder = placeholder,\n            leadingIcon = leadingIcon,\n            trailingIcon = trailingIcon,\n            colors = colors.inputFieldColors,\n            interactionSource = interactionSource,\n        )\n    },\n    expanded = active,\n    onExpandedChange = onActiveChange,\n    modifier = modifier,\n    shape = shape,\n    colors = colors,\n    tonalElevation = tonalElevation,\n    shadowElevation = shadowElevation,\n    content = content,\n)", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: DockedSearchBar-eWTbjVg, reason: not valid java name */
    public static final void m2442DockedSearchBareWTbjVg(final String str, final Function1<? super String, Unit> function1, final Function1<? super String, Unit> function12, final boolean z2, final Function1<? super Boolean, Unit> function13, Modifier modifier, boolean z3, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Shape shape, SearchBarColors searchBarColors, float f2, float f3, MutableInteractionSource mutableInteractionSource, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        final boolean z4;
        final MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        float fM2437getShadowElevationD9Ej5fM = f3;
        float fM2438getTonalElevationD9Ej5fM = f2;
        SearchBarColors searchBarColorsM2434colorsdgg9oW8 = searchBarColors;
        Function2<? super Composer, ? super Integer, Unit> function24 = function23;
        Function2<? super Composer, ? super Integer, Unit> function25 = function22;
        Function2<? super Composer, ? super Integer, Unit> function26 = function2;
        Shape dockedShape = shape;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(1299054533);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(DockedSearchBar)P(11,8,9!1,7,6,3,10,5,15,13!1,14:c#ui.unit.Dp,12:c#ui.unit.Dp,4)818@37222L11,819@37283L8,826@37565L591,825@37527L894:SearchBar.android.kt#uh7d8r");
        if ((-1) - (((-1) - i4) | ((-1) - 1)) != 0) {
            i5 = (i2 + 6) - (i2 & 6);
        } else if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            int i7 = composerStartRestartGroup.changed(str) ? 4 : 2;
            i5 = (i7 + i2) - (i7 & i2);
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 8)) != 0) {
            i5 |= 3072;
        } else if ((i2 + 3072) - (i2 | 3072) == 0) {
            i5 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i4 + 16) - (i4 | 16) != 0) {
            i5 = (i5 + 24576) - (i5 & 24576);
        } else if ((i2 & 24576) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changedInstance(function13) ? 16384 : 8192)));
        }
        int i8 = i4 & 32;
        if (i8 != 0) {
            i5 = (i5 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        } else if ((i2 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i2 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i5 |= composerStartRestartGroup.changed(companion) ? 131072 : 65536;
        }
        int i9 = (i4 + 64) - (i4 | 64);
        if (i9 != 0) {
            i5 |= 1572864;
        } else if ((i2 + 1572864) - (i2 | 1572864) == 0) {
            int i10 = composerStartRestartGroup.changed(z3) ? 1048576 : 524288;
            i5 = (i5 + i10) - (i5 & i10);
        }
        int i11 = (i4 + 128) - (i4 | 128);
        if (i11 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 12582912));
        } else if ((i2 & 12582912) == 0) {
            int i12 = composerStartRestartGroup.changedInstance(function26) ? 8388608 : 4194304;
            i5 = (i5 + i12) - (i5 & i12);
        }
        int i13 = i4 & 256;
        if (i13 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 100663296));
        } else if ((i2 & 100663296) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function25) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        int i14 = i4 & 512;
        if (i14 != 0) {
            i5 |= 805306368;
        } else if ((i2 + 805306368) - (i2 | 805306368) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function24) ? 536870912 : 268435456;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 6)) == 0) {
            int i15 = ((-1) - (((-1) - i4) | ((-1) - 1024)) == 0 && composerStartRestartGroup.changed(dockedShape)) ? 4 : 2;
            i6 = (i3 + i15) - (i3 & i15);
        } else {
            i6 = i3;
        }
        if ((i3 + 48) - (i3 | 48) == 0) {
            i6 |= ((i4 + 2048) - (i4 | 2048) == 0 && composerStartRestartGroup.changed(searchBarColorsM2434colorsdgg9oW8)) ? 32 : 16;
        }
        int i16 = i4 & 4096;
        if (i16 != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((i3 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i3 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i6 |= composerStartRestartGroup.changed(fM2438getTonalElevationD9Ej5fM) ? 256 : 128;
        }
        int i17 = (-1) - (((-1) - i4) | ((-1) - 8192));
        if (i17 != 0) {
            i6 = (i6 + 3072) - (i6 & 3072);
        } else if ((i3 & 3072) == 0) {
            i6 |= composerStartRestartGroup.changed(fM2437getShadowElevationD9Ej5fM) ? 2048 : 1024;
        }
        int i18 = (i4 + 16384) - (i4 | 16384);
        if (i18 != 0) {
            i6 |= 24576;
        } else if ((-1) - (((-1) - i3) | ((-1) - 24576)) == 0) {
            int i19 = composerStartRestartGroup.changed(mutableInteractionSource) ? 16384 : 8192;
            i6 = (i6 + i19) - (i6 & i19);
        }
        if ((-1) - (((-1) - i4) | ((-1) - 32768)) != 0) {
            i6 = (i6 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i6 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            int i20 = composerStartRestartGroup.changedInstance(function3) ? 131072 : 65536;
            i6 = (i6 + i20) - (i6 & i20);
        }
        if ((i5 & 306783379) == 306783378 && (74899 + i6) - (74899 | i6) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            mutableInteractionSource2 = mutableInteractionSource;
            z4 = z3;
            composer2 = composerStartRestartGroup;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((-1) - (((-1) - i2) | ((-1) - 1)) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i8 != 0) {
                    companion = Modifier.Companion;
                }
                z4 = i9 == 0 ? z3 : true;
                mutableInteractionSource2 = null;
                if (i11 != 0) {
                    function26 = null;
                }
                if (i13 != 0) {
                    function25 = null;
                }
                if (i14 != 0) {
                    function24 = null;
                }
                if ((i4 & 1024) != 0) {
                    dockedShape = SearchBarDefaults.INSTANCE.getDockedShape(composerStartRestartGroup, 6);
                    i6 &= -15;
                }
                if ((-1) - (((-1) - i4) | ((-1) - 2048)) != 0) {
                    searchBarColorsM2434colorsdgg9oW8 = SearchBarDefaults.INSTANCE.m2434colorsdgg9oW8(0L, 0L, composerStartRestartGroup, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 3);
                    i6 = (i6 - 113) - (i6 | (-113));
                }
                if (i16 != 0) {
                    fM2438getTonalElevationD9Ej5fM = SearchBarDefaults.INSTANCE.m2438getTonalElevationD9Ej5fM();
                }
                if (i17 != 0) {
                    fM2437getShadowElevationD9Ej5fM = SearchBarDefaults.INSTANCE.m2437getShadowElevationD9Ej5fM();
                }
                if (i18 == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i4 + 1024) - (i4 | 1024) != 0) {
                    i6 = (-1) - (((-1) - i6) | ((-1) - (-15)));
                }
                if ((-1) - (((-1) - i4) | ((-1) - 2048)) != 0) {
                    i6 &= -113;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                z4 = z3;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1299054533, i5, i6, "androidx.compose.material3.DockedSearchBar (SearchBar.android.kt:825)");
            }
            final SearchBarColors searchBarColors2 = searchBarColorsM2434colorsdgg9oW8;
            final Function2<? super Composer, ? super Integer, Unit> function27 = function26;
            final Function2<? super Composer, ? super Integer, Unit> function28 = function25;
            final Function2<? super Composer, ? super Integer, Unit> function29 = function24;
            final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-303118761, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$DockedSearchBar$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i21) {
                    ComposerKt.sourceInformation(composer3, "C827@37597L549:SearchBar.android.kt#uh7d8r");
                    if ((i21 + 3) - (3 | i21) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-303118761, i21, -1, "androidx.compose.material3.DockedSearchBar.<anonymous> (SearchBar.android.kt:827)");
                        }
                        SearchBarDefaults.INSTANCE.InputField(str, function1, function12, z2, function13, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), z4, function27, function28, function29, searchBarColors2.getInputFieldColors(), mutableInteractionSource3, composer3, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54);
            int i21 = i5 >> 6;
            int i22 = (-1) - (((-1) - ((-1) - (((-1) - i21) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)))) & ((-1) - 6));
            int i23 = (-1) - (((-1) - i21) | ((-1) - 896));
            int i24 = i6 << 12;
            int i25 = (-1) - (((-1) - ((-1) - (((-1) - ((((-1) - (((-1) - i21) | ((-1) - 7168))) | ((i22 + i23) - (i22 & i23))) | (57344 & i24))) & ((-1) - ((-1) - (((-1) - 458752) | ((-1) - i24))))))) & ((-1) - ((3670016 + i24) - (3670016 | i24))));
            int i26 = (i24 + 29360128) - (i24 | 29360128);
            int i27 = (-1) - (((-1) - ((i25 + i26) - (i25 & i26))) & ((-1) - ((-1) - (((-1) - (i6 << 9)) | ((-1) - 234881024)))));
            composer2 = composerStartRestartGroup;
            m2441DockedSearchBarEQC0FA8(composableLambdaRememberComposableLambda, z2, function13, companion, dockedShape, searchBarColorsM2434colorsdgg9oW8, fM2438getTonalElevationD9Ej5fM, fM2437getShadowElevationD9Ej5fM, function3, composerStartRestartGroup, i27, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final Function2<? super Composer, ? super Integer, Unit> function210 = function26;
            final Function2<? super Composer, ? super Integer, Unit> function211 = function25;
            final Function2<? super Composer, ? super Integer, Unit> function212 = function24;
            final Shape shape2 = dockedShape;
            final SearchBarColors searchBarColors3 = searchBarColorsM2434colorsdgg9oW8;
            final float f4 = fM2438getTonalElevationD9Ej5fM;
            final float f5 = fM2437getShadowElevationD9Ej5fM;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$DockedSearchBar$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i28) {
                    SearchBar_androidKt.m2442DockedSearchBareWTbjVg(str, function1, function12, z2, function13, modifier2, z4, function210, function211, function212, shape2, searchBarColors3, f4, f5, mutableInteractionSource2, function3, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                }
            });
        }
    }

    /* JADX INFO: renamed from: SearchBarImpl-j1jLAyQ, reason: not valid java name */
    public static final void m2445SearchBarImplj1jLAyQ(final Animatable<Float, AnimationVector1D> animatable, MutableFloatState mutableFloatState, MutableState<BackEventCompat> mutableState, MutableState<BackEventCompat> mutableState2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Shape shape, SearchBarColors searchBarColors, float f2, float f3, WindowInsets windowInsets, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        WindowInsets windowInsets2 = windowInsets;
        final float fM2438getTonalElevationD9Ej5fM = f2;
        final SearchBarColors searchBarColorsM2434colorsdgg9oW8 = searchBarColors;
        Shape inputFieldShape = shape;
        final float fM2437getShadowElevationD9Ej5fM = f3;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-440333505);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SearchBarImpl)P(!1,4,5,3,7,6,9!1,10:c#ui.unit.Dp,8:c#ui.unit.Dp,11)861@38824L15,862@38889L8,865@39070L12,868@39168L7,870@39228L15,871@39295L15,872@39341L101,876@39475L666,892@40180L333,903@40538L99,916@40970L362:SearchBar.android.kt#uh7d8r");
        if ((i4 & 1) != 0) {
            i5 = (i2 + 6) - (i2 & 6);
        } else if ((i2 & 6) == 0) {
            i5 = ((i2 & 8) == 0 ? composerStartRestartGroup.changed(animatable) : composerStartRestartGroup.changedInstance(animatable) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        MutableFloatState mutableFloatState2 = mutableFloatState;
        if ((i4 + 2) - (i4 | 2) != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 48));
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            int i8 = composerStartRestartGroup.changed(mutableFloatState2) ? 32 : 16;
            i5 = (i5 + i8) - (i5 & i8);
        }
        MutableState<BackEventCompat> mutableState3 = mutableState;
        if ((-1) - (((-1) - i4) | ((-1) - 4)) != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i9 = composerStartRestartGroup.changed(mutableState3) ? 256 : 128;
            i5 = (i5 + i9) - (i5 & i9);
        }
        MutableState<BackEventCompat> mutableState4 = mutableState2;
        if ((-1) - (((-1) - i4) | ((-1) - 8)) != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 3072));
        } else if ((i2 + 3072) - (i2 | 3072) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(mutableState4) ? 2048 : 1024)));
        }
        int i10 = (-1) - (((-1) - i4) | ((-1) - 16));
        if (i10 != 0) {
            i5 |= 24576;
        } else if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            int i11 = composerStartRestartGroup.changed(companion) ? 16384 : 8192;
            i5 = (i5 + i11) - (i5 & i11);
        }
        Function2<? super Composer, ? super Integer, Unit> function22 = function2;
        if ((-1) - (((-1) - i4) | ((-1) - 32)) != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE));
        } else if ((i2 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i2 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function22) ? 131072 : 65536;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 1572864)) == 0) {
            int i12 = ((-1) - (((-1) - i4) | ((-1) - 64)) == 0 && composerStartRestartGroup.changed(inputFieldShape)) ? 1048576 : 524288;
            i5 = (i5 + i12) - (i5 & i12);
        }
        if ((i2 & 12582912) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (((-1) - (((-1) - i4) | ((-1) - 128)) == 0 && composerStartRestartGroup.changed(searchBarColorsM2434colorsdgg9oW8)) ? 8388608 : 4194304)));
        }
        int i13 = (i4 + 256) - (i4 | 256);
        if (i13 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 100663296));
        } else if ((i2 & 100663296) == 0) {
            i5 |= composerStartRestartGroup.changed(fM2438getTonalElevationD9Ej5fM) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        int i14 = i4 & 512;
        if (i14 != 0) {
            i5 = (i5 + 805306368) - (i5 & 805306368);
        } else if ((i2 + 805306368) - (i2 | 805306368) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(fM2437getShadowElevationD9Ej5fM) ? 536870912 : 268435456)));
        }
        if ((i3 + 6) - (i3 | 6) == 0) {
            int i15 = ((i4 & 1024) == 0 && composerStartRestartGroup.changed(windowInsets2)) ? 4 : 2;
            i6 = (i3 + i15) - (i3 & i15);
        } else {
            i6 = i3;
        }
        if ((i4 + 2048) - (i4 | 2048) != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - 48));
        } else if ((i3 + 48) - (i3 | 48) == 0) {
            int i16 = composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
            i6 = (i6 + i16) - (i6 & i16);
        }
        if ((306783379 + i5) - (306783379 | i5) == 306783378 && (i6 + 19) - (19 | i6) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i10 != 0) {
                    companion = Modifier.Companion;
                }
                if ((i4 + 64) - (i4 | 64) != 0) {
                    inputFieldShape = SearchBarDefaults.INSTANCE.getInputFieldShape(composerStartRestartGroup, 6);
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-3670017)));
                }
                if ((i4 + 128) - (i4 | 128) != 0) {
                    searchBarColorsM2434colorsdgg9oW8 = SearchBarDefaults.INSTANCE.m2434colorsdgg9oW8(0L, 0L, composerStartRestartGroup, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 3);
                    i7 = (i5 - 29360129) - (i5 | (-29360129));
                } else {
                    i7 = i5;
                }
                if (i13 != 0) {
                    fM2438getTonalElevationD9Ej5fM = SearchBarDefaults.INSTANCE.m2438getTonalElevationD9Ej5fM();
                }
                if (i14 != 0) {
                    fM2437getShadowElevationD9Ej5fM = SearchBarDefaults.INSTANCE.m2437getShadowElevationD9Ej5fM();
                }
                if ((-1) - (((-1) - i4) | ((-1) - 1024)) != 0) {
                    windowInsets2 = SearchBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    i6 &= -15;
                    i5 = i7;
                } else {
                    i5 = i7;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((-1) - (((-1) - i4) | ((-1) - 64)) != 0) {
                    i5 &= -3670017;
                }
                if ((-1) - (((-1) - i4) | ((-1) - 128)) != 0) {
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-29360129)));
                }
                if ((i4 + 1024) - (i4 | 1024) != 0) {
                    i6 = (i6 - 15) - (i6 | (-15));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-440333505, i5, i6, "androidx.compose.material3.SearchBarImpl (SearchBar.android.kt:867)");
            }
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final Density density = (Density) objConsume;
            Shape inputFieldShape2 = SearchBarDefaults.INSTANCE.getInputFieldShape(composerStartRestartGroup, 6);
            Shape fullScreenShape = SearchBarDefaults.INSTANCE.getFullScreenShape(composerStartRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1567245043, "CC(remember):SearchBar.android.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0<Boolean>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarImpl$useFullScreenShape$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean invoke() {
                        return Boolean.valueOf(animatable.getValue().floatValue() == 1.0f);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            State state = (State) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            boolean zSearchBarImpl_j1jLAyQ$lambda$9 = SearchBarImpl_j1jLAyQ$lambda$9(state);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1567240190, "CC(remember):SearchBar.android.kt#9igjgp");
            int i17 = (-1) - (((-1) - (composerStartRestartGroup.changed(zSearchBarImpl_j1jLAyQ$lambda$9) ? 1 : 0)) & ((-1) - ((((((3670016 + i5) - (3670016 | i5)) ^ 1572864) <= 1048576 || !composerStartRestartGroup.changed(inputFieldShape)) && (i5 & 1572864) != 1048576) ? 0 : 1)));
            GenericShape genericShapeRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i17 != 0 || genericShapeRememberedValue == Composer.Companion.getEmpty()) {
                genericShapeRememberedValue = Intrinsics.areEqual(inputFieldShape, inputFieldShape2) ? new GenericShape(new Function3<Path, Size, LayoutDirection, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarImpl$animatedShape$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Path path, Size size, LayoutDirection layoutDirection) {
                        m2450invoke12SF9DM(path, size.m4011unboximpl(), layoutDirection);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke-12SF9DM, reason: not valid java name */
                    public final void m2450invoke12SF9DM(Path path, long j2, LayoutDirection layoutDirection) {
                        Path.addRoundRect$default(path, RoundRectKt.m3992RoundRectsniSvfs(androidx.compose.ui.geometry.SizeKt.m4027toRectuvyYCjk(j2), CornerRadiusKt.CornerRadius$default(density.mo710toPx0680j_4(Dp.m6638constructorimpl(SearchBar_androidKt.SearchBarCornerRadius * (1 - animatable.getValue().floatValue()))), 0.0f, 2, null)), null, 2, null);
                    }
                }) : SearchBarImpl_j1jLAyQ$lambda$9(state) ? fullScreenShape : inputFieldShape;
                composerStartRestartGroup.updateRememberedValue(genericShapeRememberedValue);
            }
            final Shape shape2 = (Shape) genericShapeRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-170534294, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarImpl$surface$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i18) {
                    ComposerKt.sourceInformation(composer2, "C896@40320L38,893@40194L309:SearchBar.android.kt#uh7d8r");
                    if ((i18 + 3) - (3 | i18) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-170534294, i18, -1, "androidx.compose.material3.SearchBarImpl.<anonymous> (SearchBar.android.kt:893)");
                        }
                        SurfaceKt.m2561SurfaceT9BRK9s(null, shape2, searchBarColorsM2434colorsdgg9oW8.m2430getContainerColor0d7_KjU(), ColorSchemeKt.m1947contentColorForek8zF_U(searchBarColorsM2434colorsdgg9oW8.m2430getContainerColor0d7_KjU(), composer2, 0), fM2438getTonalElevationD9Ej5fM, fM2437getShadowElevationD9Ej5fM, null, ComposableSingletons$SearchBar_androidKt.INSTANCE.m1996getLambda2$material3_release(), composer2, 12582912, 65);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1567206741, "CC(remember):SearchBar.android.kt#9igjgp");
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0<Boolean>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarImpl$showContent$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean invoke() {
                        return Boolean.valueOf(animatable.getValue().floatValue() > 0.0f);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.startReplaceGroup(-1567201454);
            ComposerKt.sourceInformation(composerStartRestartGroup, "908@40729L215");
            ComposableLambda composableLambdaRememberComposableLambda2 = SearchBarImpl_j1jLAyQ$lambda$12((State) objRememberedValue2) ? ComposableLambdaKt.rememberComposableLambda(147843820, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarImpl$wrappedContent$1
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
                    ComposerKt.sourceInformation(composer2, "C909@40777L35,909@40747L183:SearchBar.android.kt#uh7d8r");
                    if ((i18 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(147843820, i18, -1, "androidx.compose.material3.SearchBarImpl.<anonymous> (SearchBar.android.kt:909)");
                    }
                    Modifier.Companion companion2 = Modifier.Companion;
                    ComposerKt.sourceInformationMarkerStart(composer2, -502962614, "CC(remember):SearchBar.android.kt#9igjgp");
                    boolean zChangedInstance = composer2.changedInstance(animatable);
                    final Animatable<Float, AnimationVector1D> animatable2 = animatable;
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue3 == Composer.Companion.getEmpty()) {
                        objRememberedValue3 = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarImpl$wrappedContent$1$1$1
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
                                graphicsLayerScope.setAlpha(animatable2.getValue().floatValue());
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion2, (Function1) objRememberedValue3);
                    SearchBarColors searchBarColors2 = searchBarColorsM2434colorsdgg9oW8;
                    Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                    ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer2, 0);
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
                    Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                    if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, 1608207601, "C910@40836L46,911@40903L9:SearchBar.android.kt#uh7d8r");
                    DividerKt.m2090HorizontalDivider9IZ8Weo(null, 0.0f, searchBarColors2.m2431getDividerColor0d7_KjU(), composer2, 0, 3);
                    function32.invoke(columnScopeInstance, composer2, 6);
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
            }, composerStartRestartGroup, 54) : null;
            composerStartRestartGroup.endReplaceGroup();
            int i18 = Animatable.$stable | 12582912 | ((i5 + 14) - (14 | i5));
            int i19 = (i5 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (112 | i5);
            int i20 = (i18 + i19) - (i18 & i19);
            int i21 = (i5 + 896) - (896 | i5);
            int i22 = ((i20 + i21) - (i20 & i21)) | ((i5 + 7168) - (7168 | i5));
            int i23 = (-1) - (((-1) - 57344) | ((-1) - i5));
            int i24 = i6 << 15;
            int i25 = ((i22 + i23) - (i22 & i23)) | ((i24 + 458752) - (i24 | 458752));
            int i26 = i5 << 3;
            function22 = function22;
            mutableFloatState2 = mutableFloatState2;
            mutableState3 = mutableState3;
            mutableState4 = mutableState4;
            SearchBarLayout(animatable, mutableFloatState2, mutableState3, mutableState4, companion, windowInsets2, function22, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, composerStartRestartGroup, (-1) - (((-1) - i25) & ((-1) - ((i26 + 3670016) - (i26 | 3670016)))));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final Function2<? super Composer, ? super Integer, Unit> function23 = function22;
            final Shape shape3 = inputFieldShape;
            final SearchBarColors searchBarColors2 = searchBarColorsM2434colorsdgg9oW8;
            final float f4 = fM2438getTonalElevationD9Ej5fM;
            final float f5 = fM2437getShadowElevationD9Ej5fM;
            final WindowInsets windowInsets3 = windowInsets2;
            final MutableFloatState mutableFloatState3 = mutableFloatState2;
            final MutableState<BackEventCompat> mutableState5 = mutableState3;
            final MutableState<BackEventCompat> mutableState6 = mutableState4;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarImpl$1
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

                public final void invoke(Composer composer2, int i27) {
                    Animatable<Float, AnimationVector1D> animatable2 = animatable;
                    MutableFloatState mutableFloatState4 = mutableFloatState3;
                    MutableState<BackEventCompat> mutableState7 = mutableState5;
                    MutableState<BackEventCompat> mutableState8 = mutableState6;
                    Modifier modifier3 = modifier2;
                    Function2<Composer, Integer, Unit> function24 = function23;
                    Shape shape4 = shape3;
                    SearchBarColors searchBarColors3 = searchBarColors2;
                    float f6 = f4;
                    float f7 = f5;
                    WindowInsets windowInsets4 = windowInsets3;
                    Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                    int i28 = i2;
                    SearchBar_androidKt.m2445SearchBarImplj1jLAyQ(animatable2, mutableFloatState4, mutableState7, mutableState8, modifier3, function24, shape4, searchBarColors3, f6, f7, windowInsets4, function32, composer2, RecomposeScopeImplKt.updateChangedFlags((i28 + 1) - (i28 & 1)), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SearchBarLayout(final Animatable<Float, AnimationVector1D> animatable, MutableFloatState mutableFloatState, MutableState<BackEventCompat> mutableState, MutableState<BackEventCompat> mutableState2, final Modifier modifier, final WindowInsets windowInsets, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(70029564);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SearchBarLayout)P(!1,3,4,2,6,8,5,7)945@42029L34,950@42191L120,965@42827L5009,946@42068L5768:SearchBar.android.kt#uh7d8r");
        if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            i3 = ((i2 & 8) == 0 ? composerStartRestartGroup.changed(animatable) : composerStartRestartGroup.changedInstance(animatable) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        final MutableFloatState mutableFloatState2 = mutableFloatState;
        if ((i2 & 48) == 0) {
            int i4 = composerStartRestartGroup.changed(mutableFloatState2) ? 32 : 16;
            i3 = (i3 + i4) - (i3 & i4);
        }
        final MutableState<BackEventCompat> mutableState3 = mutableState;
        if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changed(mutableState3) ? 256 : 128)));
        }
        final MutableState<BackEventCompat> mutableState4 = mutableState2;
        if ((i2 & 3072) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changed(mutableState4) ? 2048 : 1024)));
        }
        if ((i2 & 24576) == 0) {
            int i5 = composerStartRestartGroup.changed(modifier) ? 16384 : 8192;
            i3 = (i3 + i5) - (i3 & i5);
        }
        if ((196608 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(windowInsets) ? 131072 : 65536;
        }
        if ((1572864 + i2) - (1572864 | i2) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changedInstance(function2) ? 1048576 : 524288)));
        }
        if ((12582912 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function23) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((-1) - (((-1) - 38347923) | ((-1) - i3)) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(70029564, i3, -1, "androidx.compose.material3.SearchBarLayout (SearchBar.android.kt:941)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -660147884, "CC(remember):SearchBar.android.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new MutableWindowInsets(null, 1, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableWindowInsets mutableWindowInsets = (MutableWindowInsets) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierZIndex = ZIndexModifierKt.zIndex(modifier, 1.0f);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -660142614, "CC(remember):SearchBar.android.kt#9igjgp");
            boolean z2 = (-1) - (((-1) - 458752) | ((-1) - i3)) == 131072;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = (Function1) new Function1<WindowInsets, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarLayout$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(WindowInsets windowInsets2) {
                        invoke2(windowInsets2);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(WindowInsets windowInsets2) {
                        mutableWindowInsets.setInsets(WindowInsetsKt.exclude(windowInsets, windowInsets2));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierConsumeWindowInsets = WindowInsetsPaddingKt.consumeWindowInsets(WindowInsetsPaddingKt.onConsumedWindowInsetsChanged(modifierZIndex, (Function1) objRememberedValue2), windowInsets);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -660117373, "CC(remember):SearchBar.android.kt#9igjgp");
            int i6 = (-1) - (((-1) - (((-1) - (((-1) - (((-1) - (((-1) - i3) | ((-1) - 14)) == 4 || ((-1) - (((-1) - i3) | ((-1) - 8)) != 0 && composerStartRestartGroup.changedInstance(animatable))) ? 1 : 0)) & ((-1) - ((i3 + 7168) - (7168 | i3) == 2048 ? 1 : 0)))) | ((i3 & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) == 32 ? 1 : 0))) & ((-1) - ((i3 + 896) - (896 | i3) == 256 ? 1 : 0)));
            MeasurePolicy measurePolicyRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i6 != 0 || measurePolicyRememberedValue == Composer.Companion.getEmpty()) {
                mutableState4 = mutableState4;
                mutableFloatState2 = mutableFloatState2;
                mutableState3 = mutableState3;
                measurePolicyRememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarLayout$2$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* JADX INFO: renamed from: measure-3p2s80s */
                    public final MeasureResult mo375measure3p2s80s(final MeasureScope measureScope, List<? extends Measurable> list, final long j2) {
                        Measurable measurable;
                        final Placeable placeableMo5514measureBRTryo0;
                        int i7;
                        int iM6590getMaxHeightimpl;
                        final float fFloatValue = animatable.getValue().floatValue();
                        int size = list.size();
                        for (int i8 = 0; i8 < size; i8++) {
                            Measurable measurable2 = list.get(i8);
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "InputField")) {
                                int size2 = list.size();
                                for (int i9 = 0; i9 < size2; i9++) {
                                    Measurable measurable3 = list.get(i9);
                                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable3), "Surface")) {
                                        int size3 = list.size();
                                        int i10 = 0;
                                        while (true) {
                                            if (i10 >= size3) {
                                                measurable = null;
                                                break;
                                            }
                                            measurable = list.get(i10);
                                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "Content")) {
                                                break;
                                            }
                                            i10++;
                                        }
                                        Measurable measurable4 = measurable;
                                        final int top = mutableWindowInsets.getTop(measureScope) + measureScope.mo704roundToPx0680j_4(SearchBar_androidKt.getSearchBarVerticalPadding());
                                        int i11 = measureScope.mo704roundToPx0680j_4(SearchBar_androidKt.getSearchBarVerticalPadding());
                                        int iM6608constrainWidthK40F9xA = ConstraintsKt.m6608constrainWidthK40F9xA(j2, measurable2.maxIntrinsicWidth(Constraints.m6590getMaxHeightimpl(j2)));
                                        int iM6607constrainHeightK40F9xA = ConstraintsKt.m6607constrainHeightK40F9xA(j2, measurable2.minIntrinsicHeight(Constraints.m6591getMaxWidthimpl(j2)));
                                        int iRoundToInt = MathKt.roundToInt(Constraints.m6591getMaxWidthimpl(j2) * 0.9f);
                                        int iRoundToInt2 = MathKt.roundToInt(Constraints.m6590getMaxHeightimpl(j2) * 0.9f);
                                        final float fCalculatePredictiveBackMultiplier = SearchBar_androidKt.calculatePredictiveBackMultiplier(mutableState4.getValue(), fFloatValue, mutableFloatState2.getFloatValue());
                                        int iLerp = MathHelpersKt.lerp(iM6608constrainWidthK40F9xA, iRoundToInt, fCalculatePredictiveBackMultiplier);
                                        int i12 = top + iM6607constrainHeightK40F9xA;
                                        int iLerp2 = MathHelpersKt.lerp(i12, iRoundToInt2, fCalculatePredictiveBackMultiplier);
                                        int iM6591getMaxWidthimpl = Constraints.m6591getMaxWidthimpl(j2);
                                        int iM6590getMaxHeightimpl2 = Constraints.m6590getMaxHeightimpl(j2);
                                        int iLerp3 = MathHelpersKt.lerp(iLerp, iM6591getMaxWidthimpl, fFloatValue);
                                        final int iLerp4 = MathHelpersKt.lerp(iLerp2, iM6590getMaxHeightimpl2, fFloatValue);
                                        final int iLerp5 = MathHelpersKt.lerp(top, 0, fFloatValue);
                                        final int iLerp6 = MathHelpersKt.lerp(0, i11, fFloatValue);
                                        final Placeable placeableMo5514measureBRTryo02 = measurable2.mo5514measureBRTryo0(ConstraintsKt.Constraints(iLerp3, iM6591getMaxWidthimpl, iM6607constrainHeightK40F9xA, iM6607constrainHeightK40F9xA));
                                        int width = placeableMo5514measureBRTryo02.getWidth();
                                        final Placeable placeableMo5514measureBRTryo03 = measurable3.mo5514measureBRTryo0(Constraints.Companion.m6601fixedJhjzzOo(width, iLerp4 - iLerp5));
                                        if (measurable4 == null) {
                                            placeableMo5514measureBRTryo0 = null;
                                        } else {
                                            if (Constraints.m6586getHasBoundedHeightimpl(j2)) {
                                                i7 = 0;
                                                iM6590getMaxHeightimpl = RangesKt.coerceAtLeast(Constraints.m6590getMaxHeightimpl(j2) - (i12 + i11), 0);
                                            } else {
                                                i7 = 0;
                                                iM6590getMaxHeightimpl = Constraints.m6590getMaxHeightimpl(j2);
                                            }
                                            placeableMo5514measureBRTryo0 = measurable4.mo5514measureBRTryo0(ConstraintsKt.Constraints(width, width, i7, iM6590getMaxHeightimpl));
                                        }
                                        final MutableState<BackEventCompat> mutableState5 = mutableState4;
                                        final MutableState<BackEventCompat> mutableState6 = mutableState3;
                                        return MeasureScope.layout$default(measureScope, width, iLerp4, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarLayout$2$1.1
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
                                                int i13 = measureScope.mo704roundToPx0680j_4(SearchBar_androidKt.SearchBarPredictiveBackMinMargin);
                                                int iM2448calculatePredictiveBackOffsetXrOvwMX4 = SearchBar_androidKt.m2448calculatePredictiveBackOffsetXrOvwMX4(j2, i13, mutableState5.getValue(), measureScope.getLayoutDirection(), fFloatValue, fCalculatePredictiveBackMultiplier);
                                                int iM2449calculatePredictiveBackOffsetYdzo92Q0 = SearchBar_androidKt.m2449calculatePredictiveBackOffsetYdzo92Q0(j2, i13, mutableState5.getValue(), mutableState6.getValue(), iLerp4, measureScope.mo704roundToPx0680j_4(SearchBar_androidKt.SearchBarPredictiveBackMaxOffsetY), fCalculatePredictiveBackMultiplier);
                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo5514measureBRTryo03, iM2448calculatePredictiveBackOffsetXrOvwMX4, iM2449calculatePredictiveBackOffsetYdzo92Q0 + iLerp5, 0.0f, 4, null);
                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo5514measureBRTryo02, iM2448calculatePredictiveBackOffsetXrOvwMX4, iM2449calculatePredictiveBackOffsetYdzo92Q0 + top, 0.0f, 4, null);
                                                Placeable placeable = placeableMo5514measureBRTryo0;
                                                if (placeable != null) {
                                                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable, iM2448calculatePredictiveBackOffsetXrOvwMX4, iM2449calculatePredictiveBackOffsetYdzo92Q0 + top + placeableMo5514measureBRTryo02.getHeight() + iLerp6, 0.0f, 4, null);
                                                }
                                            }
                                        }, 4, null);
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                composerStartRestartGroup.updateRememberedValue(measurePolicyRememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) measurePolicyRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierConsumeWindowInsets);
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
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 36789781, "C955@42396L85,956@42494L119:SearchBar.android.kt#uh7d8r");
            Modifier modifierLayoutId = LayoutIdKt.layoutId(Modifier.Companion, LayoutIdSurface);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId);
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
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1442016074, "C955@42470L9:SearchBar.android.kt#uh7d8r");
            function22.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 21) & 14));
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierLayoutId2 = LayoutIdKt.layoutId(Modifier.Companion, LayoutIdInputField);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId2);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3671constructorimpl3 = Updater.m3671constructorimpl(composerStartRestartGroup);
            Updater.m3678setimpl(composerM3671constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM3671constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM3671constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m3678setimpl(composerM3671constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1442132231, "C957@42587L12:SearchBar.android.kt#uh7d8r");
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 18) & 14));
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.startReplaceGroup(-1107184481);
            ComposerKt.sourceInformation(composerStartRestartGroup, "*960@42668L127");
            if (function23 != null) {
                Modifier modifierLayoutId3 = LayoutIdKt.layoutId(Modifier.Companion, LayoutIdSearchContent);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId3);
                Function0<ComposeUiNode> constructor4 = ComposeUiNode.Companion.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor4);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3671constructorimpl4 = Updater.m3671constructorimpl(composerStartRestartGroup);
                Updater.m3678setimpl(composerM3671constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m3678setimpl(composerM3671constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composerM3671constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    composerM3671constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    composerM3671constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.m3678setimpl(composerM3671constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1302856683, "C961@42768L9:SearchBar.android.kt#uh7d8r");
                function23.invoke(composerStartRestartGroup, 0);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                Unit unit = Unit.INSTANCE;
                Unit unit2 = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceGroup();
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
            final MutableFloatState mutableFloatState3 = mutableFloatState2;
            final MutableState<BackEventCompat> mutableState5 = mutableState3;
            final MutableState<BackEventCompat> mutableState6 = mutableState4;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt.SearchBarLayout.4
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
                    SearchBar_androidKt.SearchBarLayout(animatable, mutableFloatState3, mutableState5, mutableState6, modifier, windowInsets, function2, function22, function23, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculatePredictiveBackMultiplier(BackEventCompat backEventCompat, float f2, float f3) {
        if (backEventCompat == null) {
            return 0.0f;
        }
        if (Float.isNaN(f3)) {
            return 1.0f;
        }
        if (f3 <= 0.0f) {
            return 0.0f;
        }
        return f2 / f3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: calculatePredictiveBackOffsetX-rOvwMX4, reason: not valid java name */
    public static final int m2448calculatePredictiveBackOffsetXrOvwMX4(long j2, int i2, BackEventCompat backEventCompat, LayoutDirection layoutDirection, float f2, float f3) {
        if (backEventCompat == null || f3 == 0.0f) {
            return 0;
        }
        return MathKt.roundToInt(((Constraints.m6591getMaxWidthimpl(j2) * 0.05f) - i2) * (1 - f2) * f3 * (backEventCompat.getSwipeEdge() == 0 ? 1 : -1) * (layoutDirection == LayoutDirection.Ltr ? 1 : -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: calculatePredictiveBackOffsetY-dzo92Q0, reason: not valid java name */
    public static final int m2449calculatePredictiveBackOffsetYdzo92Q0(long j2, int i2, BackEventCompat backEventCompat, BackEventCompat backEventCompat2, int i3, int i4, float f2) {
        if (backEventCompat2 == null || backEventCompat == null || f2 == 0.0f) {
            return 0;
        }
        int iMin = Math.min(Math.max(0, ((Constraints.m6590getMaxHeightimpl(j2) - i3) / 2) - i2), i4);
        float touchY = backEventCompat.getTouchY() - backEventCompat2.getTouchY();
        float fAbs = Math.abs(touchY) / Constraints.m6590getMaxHeightimpl(j2);
        return MathKt.roundToInt(MathHelpersKt.lerp(0, iMin, fAbs) * f2 * Math.signum(touchY));
    }

    static {
        float f2 = 8;
        SearchBarVerticalPadding = Dp.m6638constructorimpl(f2);
        SearchBarPredictiveBackMinMargin = Dp.m6638constructorimpl(f2);
        CubicBezierEasing easingEmphasizedDecelerateCubicBezier = MotionTokens.INSTANCE.getEasingEmphasizedDecelerateCubicBezier();
        AnimationEnterEasing = easingEmphasizedDecelerateCubicBezier;
        CubicBezierEasing cubicBezierEasing = new CubicBezierEasing(0.0f, 1.0f, 0.0f, 1.0f);
        AnimationExitEasing = cubicBezierEasing;
        TweenSpec tweenSpecTween = AnimationSpecKt.tween(600, 100, easingEmphasizedDecelerateCubicBezier);
        AnimationEnterFloatSpec = tweenSpecTween;
        TweenSpec tweenSpecTween2 = AnimationSpecKt.tween(AnimationExitDurationMillis, 100, cubicBezierEasing);
        AnimationExitFloatSpec = tweenSpecTween2;
        AnimationPredictiveBackExitFloatSpec = AnimationSpecKt.tween$default(AnimationExitDurationMillis, 0, cubicBezierEasing, 2, null);
        TweenSpec tweenSpecTween3 = AnimationSpecKt.tween(600, 100, easingEmphasizedDecelerateCubicBezier);
        AnimationEnterSizeSpec = tweenSpecTween3;
        TweenSpec tweenSpecTween4 = AnimationSpecKt.tween(AnimationExitDurationMillis, 100, cubicBezierEasing);
        AnimationExitSizeSpec = tweenSpecTween4;
        DockedEnterTransition = EnterExitTransitionKt.fadeIn$default(tweenSpecTween, 0.0f, 2, null).plus(EnterExitTransitionKt.expandVertically$default(tweenSpecTween3, null, false, null, 14, null));
        DockedExitTransition = EnterExitTransitionKt.fadeOut$default(tweenSpecTween2, 0.0f, 2, null).plus(EnterExitTransitionKt.shrinkVertically$default(tweenSpecTween4, null, false, null, 14, null));
    }

    public static final float getDockedExpandedTableMinHeight() {
        return DockedExpandedTableMinHeight;
    }

    public static final float getSearchBarMinWidth() {
        return SearchBarMinWidth;
    }

    public static final float getSearchBarVerticalPadding() {
        return SearchBarVerticalPadding;
    }

    private static final boolean SearchBarImpl_j1jLAyQ$lambda$9(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean SearchBarImpl_j1jLAyQ$lambda$12(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
