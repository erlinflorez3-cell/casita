package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.ProgressIndicatorTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.exif.makernotes.LeicaMakernoteDirectory;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.iptc.IptcDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
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
/* JADX INFO: compiled from: ProgressIndicator.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я^\u001d̉=!,n\bӵLc\u000b\u0004Iي8\u000bDB\u0007\"2\u0014\u007f\u0007tpA0JkP.hS2\u000fq\f<$i$yّCU0}*\tUNog\u0005Jb\u000bI\u0010\u000e\u0016\u000fj4I[\u0007e\u0012%2JoU3UoS9ht<\u0012(288\u0002\u0005\u0007(B\u0019\u001e\u001a\u0013Cy0B:N\u0016RX\u001dO\u0015\u001a@\u0005lF1$bg\\]`l\fK_)\tiPv?_^&}\u0013LT57\u000faL.p=;\u00153~\u001b\u0007\u0001\u0005o\tEqK1\u0001'UX\u0010xˇ5ݙÿ\u0018\u00171}\u001b\r\u000b\u0001j(i`:K[Yqph\u00148y\u000b{;;246-N.;A~\b<D%xY@^*vB.$\u0012<\u001d%\u000e]C9Ii\u0002gA\u0019\\b\u0014\u0005;GS\u0007t!i\u0001&`CH\u0005}W1_pUH|\r BҠ\u0003͏Ċ\u0006,\naU2G*\u001fQ/%e\u007fi)'k\u0010o\\g%\u0016\u0011nYi`pX\"\u001d?g0\u000f\fhn|\u0005\u001aS\u001b]ą\u0010۳ɟX\t\u0004;!Tt:JD=\u0010|s\u0019opMk1=/\u0015H\ntq\u000eeav3cz\u0014\u0016gR\u0005>W<\u0011\b\tlHS\u001a\u0006t(P[xp\u0016w\npf\fA_\u0006v̂3ι֞\u001d^\u001b}\u0011TZw\u000b,wZ\u00174/XAI\u001biRs9\u0007V\\~\u0017\u007fxw=-f(-OyM\u0019T~Rn:|11\u0017s.J.QݺK˾טyW\u0002W$RQ\u001c=`+\u000f-Mb\u0006;jdr\u0014P}\u0018-z\u000b!';\u0017?\u0018\u000epp:\t\u0003J}}G(|^\u0001M d.|\u0012L\u0001Gq\u007f#[lr#\t_<\\d\u0015\u0005MKk\u0006ɴ!Ĝީ1E-K$1,u#\u001cui\u001eR*l\u001dK\rk\u0014.s\u0016\u001ea\u007f\u0004bA>Ig&V\"R}3HNj\u00060Z\tb6cNGd~\u0002PM9X.l\r,\u001b\u001dn[h@6\u0003ԧ-ɾͫwE\u0004Ol\u007f=|[\u000e\u007fm\u001co\r\u0015X4\"\u0011\f3~\u0012J<N|\bh\u000f0\u0014\u001b06oL\u0013\u000bB\t2\\D<64sZo\u0006\u001e&\u0018F\u000e8G8HsI\u0003&T'\n\u0007N\u000b`S\u00119*/\u0002?J$xCn\u001d~VV?c`@c\u001f\u0019\u001b\u0019s-%ު/DZya-è\u007fՊ\u0558aEOCDF_W{&\b\ff<-#H\u0018)`i\u0011\u000e\b`d\u0011Urv|v@\u0010\u0003T()\r&\u0015\u000ej3U\u0010ŸNΓƚf/R\u0012\u0006{[R\u000fQ\\)50-iL\u001b;-M-kZ\u001b\u001a-{e{S}6IP-\nt/\bo\u000e\u00153\u000e!@\u0016\u007fBz\u00027@\u0017%˅-\u05fdƶv\f4MD\u0016\u001au\u0010MvY\u001a\u001cQF-+z-ZK\u0017\n:irc|}#\u0003\u0015Z\u0007\u007ft-^H!'{WC^`:\u001f\u007f8X?-D\u001b,\u001fD8z)>R*mԭjχܣ\u0011-538*If`X\u0016\u001f(\u001a4.bM-;\u0005Lnj\u000f\\zio\u000e\r{Xjz\f7<\u0015~v\bA\u0019:F\u0001I|/eBe`ȥF֜ԥ\bGOo/{j\u007f)qJ\u000b\u001eL'\u0015\u0011_zt.)r\u000fx\u007fuSEF\u0003NJ-_${\r\u001b&ynhH\u000e,\u001f9)/\taPDb\u001a*gi3oFW\u0006κ7ۍ˲\u000b\u001b;&_\u001f=^\u000fI\u0019\rm\u001eYkh3gv1|'oIV\u0017?3\u0004}LU\u000b2iX'ec\u00058\u00120W\u0005]\u001e(&\u0007\u007f̢\u001e\u07fbڱ\nw)QS\u0004`Nm0XV\"{,&Xu\u001fH1o\u0005x\"3\\m&C|[\u0010\u0005\bzå\u0018ܒĎ./r[S#\u0001.\u0019\u001b%EB[7\u0006WrG\u0001\u001e\u001d\n@YH#Q=+u<Ar4>@\nNyui\n.\u0014|*T\u0012;1m͢^ݐ١\u0016\u000f\u0013[\u0006\u0004j\u001d\u000e95\u0018Uo\u001fFd\u001c)QO0#@=#\u000f2P6#\u0006D1x\u001b\u0010Lb`C\u0012cK\u0002i_\u0012\u0005%Q!\u001f+=\u0006S81G̝TߎٌA;9d{%pqs8\u001dUOo\r+C?\u001b/<$n>H)\t\n\u001c#|H>C)H6\u0016H0^y/^Q\b\u0019\u001cM<\u0006\u0019s+Jbe\t+\u0011Ԯ6ǚּVW)\f\u0007a#\u001cOÈ+\u000bLR\u0010ުuѴ\u00111Fϐ(hWU\u0015mw\u0011YʴLħ3\u0006Gća_zX}?GZ\u0016ָ\u000eԯ+,\u000e\u00132h\u007f\u0015o\u00120d#XD]AHyag\u07b2\u0015ً\u0013z|ޛN\u0018F^\u001e=4\u00199ɒ\bņc@4Ȩ\u0011\u0015UY\u0003{XfFјvʡQE3ܲ9J?|)c}gj\u05ec$Ƥ\\>\u001fϪFL!\u000e2\u001dTiRŞ{݉\u001bUkݗ\u000b\u007fbm)Ybl\u0007ٜ{ܛjdF͔^HVz1f}\u0006qЭ\u0017С\r`xֳa\u001cp{D'dPAߛSΞOa\u001f֏WP\u00053\u007f3h38ͬUՈ)GRԑ.vo\n-{\f2\rŪB۱\u0001\u0015\r¿\u0007~\u0012\u007f\u001dM^\fB\u0378\u0005ծ^@$ޏz;{| *<\u000fS۔.͗WZYu-x|\u0001)3(FwMU7+\u0003G?^ȐOĎ~v`\\34\u0014\b%)P\u0001UxO\f\u00143\u0006p&̧0Г-}qʰ@\u0019y+\u001ccx+&م5ˆa.Uǿ'eJsY\u00028*\u007fͦZƜ+\u0002Pϵj>0>\u0019\u000fd !գAޓ)\tm\u05c8O\u0001\u0004*Jml{=ʞ:ӁE=]һ\u001fQ;L\n\byJDȝ-Ú\u0012I\u001eΚoX{\u0014s=\u0003\u001e\tΑBʢ5\u0010{ԛ{N%\u0017 bbs\u0011ߞ\u001aȂ\u0018jSә:ft\u000f\u0005v~bfü\u0018Ȍ\u0018\u0005FثI1NFw`\u0016\u0003\u0012˃rǛ;SMd\u0019J14nTV\u0012=G/Я`ܝ\u0006\u0005S֪·\u0016>M{FѼ1\n\u0003߮g2"}, d2 = {"\u0010`b2E6MO(\u0003\u0005g\b\u0006\u000b6e", "", "\u0011ha0h3:`xz\tb5~", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG}Gj\u001a,*CPo4+tdo=\u0010e\u0002", "\u0011ha0h3:`|\byb*x\u00189r^,wH\u0001&\u0017T", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "5dc\u0010\\9<c z\bB5{\r-a\u000f2\t\u001f\u0005\u0013\u001fG~\u000eI", "u(5", "\u0014", "\u0014ha@g\u0013B\\\u0019azZ+[\t6a\u0014", "", "\u0014ha@g\u0013B\\\u0019azZ+[\u0019<a\u000f,\u0006I", "\u0014ha@g\u0013B\\\u0019azZ+\\\u0005=i\t*", "\u0014ha@g\u0013B\\\u0019mvb3[\t6a\u0014", "\u0014ha@g\u0013B\\\u0019mvb3[\u0019<a\u000f,\u0006I", "\u0014ha@g\u0013B\\\u0019mvb3\\\u0005=i\t*", "\u0016dP145=B\u0015\u0003\u0002:5\u0001\u0011+t\u00042\u0005\u001f\u0011$\u0013Vs\u0018E", "\u0016dP145=B\u0015\u0003\u0002=,\u0004\u0005CD\u00105wO\u0005! ", "\u0017mR?X(LS\u0007~\u0003Z5\f\r-s\\2\fI\u007f%", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "\u0018t\\=E6MO(\u0003\u0005g\b\u0006\u000b6e", "\u001ah]2T9\u001a\\\u001d\u0007vm0\u0007\u0012\u000eu\r$\u000bD\u000b ", "\u001ah]2T9\"\\\u0018\u0003xZ;\u0007\u0016\u0012e\u0004*~O", "5dc\u0019\\5>O&b\u0004]0z\u0005>o\r\u000b{D\u0003\u001a&", "\u001ah]2T9\"\\\u0018\u0003xZ;\u0007\u0016!i~7~", "5dc\u0019\\5>O&b\u0004]0z\u0005>o\r\u001a\u007f?\u0010\u001a", " nc.g0H\\t\b|e,f\n0s\u007f7", " nc.g0H\\w\u000f\bZ;\u0001\u00138", " nc.g0H\\'izk\n\u0011\u00076e", "!dR<a+%W\"~]^({g/l{<", "!dR<a+%W\"~]^({g?r{7\u007fJ\n", "!dR<a+%W\"~]^({h+s\u00041}", "!dR<a+%W\"~iZ0\u0004g/l{<", "!dR<a+%W\"~iZ0\u0004g?r{7\u007fJ\n", "!dR<a+%W\"~iZ0\u0004h+s\u00041}", "!d\\.a;BQ'[\u0005n5{\u0017\u001aa~'\u007fI\u0003", "!sP?g\bGU ~d_-\u000b\t>", "\u0011ha0h3:`\u0004\f\u0005`9|\u0017=I\t'\u007f>|&!T", "", ">q^4e,La", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", ";nS6Y0>`", "1n[<e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "Asa<^,0W\u0018\u000e}", "BqP0^\nHZ#\f", "Asa<^,\u001cO$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#h\u000b*=ms*X\u0019", "\u0011ha0h3:`\u0004\f\u0005`9|\u0017=I\t'\u007f>|&!T7l,y\u0012\u001c6e", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu^zp/VM0]VrJiv;r2\u0012\t\u000eXN.rCJh\u00066Q\rEv\u0001U#\u001e>ytJVY%\u0004\u001d\u0001K7hS/C]\u000b2", "5`_ \\A>", "\u0011ha0h3:`\u0004\f\u0005`9|\u0017=I\t'\u007f>|&!T7qPeuJ`q", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu^zp/VM0]VrJiv;r2\fs\u0001b@1xH62Q*S\nFr\u000f\f_\u001bEs\u007fF^\u0010\u0011W\u001f}L3vFf5]+\u00056", "\u0011ha0h3:`\u0004\f\u0005`9|\u0017=I\t'\u007f>|&!T7\n$>#@$i", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b>^\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu[\u00070VPV,&0|E\u001f\u001ch\u000e[\u0001ph\u001d2", "\u0011ha0h3:`\u0004\f\u0005`9|\u0017=I\t'\u007f>|&!T7tOXv\u0012-\u0010", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b>^\u0005\u001bT\u00127LPEo31^fkA\u0012m:N@4WU]0dR<\u001b\u001e\u001ae\u0018\\+\u001aZ=%g_", "\u0011ha0h3:`\u0004\f\u0005`9|\u0017=I\t'\u007f>|&!T7u\u0019\u0005p\bba", "uE;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`~Qn\u0012=z%B/b\u0001\u001ei\u001f-ZM?jGg\u0013riD\u0011q,\u0018\u00047P[R4\\\u001cPG\u001c\u001dd\u001cN8bh=\u0005\u0015", "uE;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`~Qn\u0012=z%B/b\u0001\u001cQ|*VBHu8\u001d(2_C\u000fn6\\vpT\\W;`Zr\u0007q\u001cb\u0019X9\r\u0012/%\b25", "\u001ah]2T9)`#\u0001\b^:\u000bl8d\u0004&wO\u000b$", "\u001ah]2T9)`#\u0001\b^:\u000bl8d\u0004&wO\u000b$^A?\u000e*cl\u0015", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu^zp/VM0]VrJiv?q5'\u0016\u0004fK(mW\u0001\u001d\u00124T\fIhJ\u0019&\u0017DnxB mQ\u0002 \u007fO)u\u001c=C=8", "2qPDF;H^|\byb*x\u00189r", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003fkD\u00079", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "\u001ah]2T9)`#\u0001\b^:\u000bl8d\u0004&wO\u000b$^)T\u000b+yt%", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu^zp/VM0]VrJiv?q/\u0012\u0013\u000fhH(w\u000e<0\u0010uJ\u0012Df\u0010\u0010 \u0017C4QR_\u000eV}\u001f~\r~OBb^\u0007QEDusb\u0016g(fH:m!\u0002\"*lX.SY]\u0019}\\\bgt\u001d|^{\u0015", "\u001ah]2T9)`#\u0001\b^:\u000bl8d\u0004&wO\u000b$^4SyF\u00018;", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b>b\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu[\u00070VPV,&0|E\u001f\u001ch\u000e[\u0001ph\u001d2", "\u001ah]2T9)`#\u0001\b^:\u000bl8d\u0004&wO\u000b$^\u0014m\u0002\u0019W\u0019)", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b>b\u0004\u001ei\u001f-ZM?jGg\u0013riD\u0011q,\u0018\u00047P[R4\\\u001cPG\u001c\u001dd\u001cN8bh=\u0005\u0015", "\u001ah]2T9)`#\u0001\b^:\u000bl8d\u0004&wO\u000b$^TS\u001bA\t8?", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b>b\u0004\u0018T\u00127LPEo31^fkA\u0012m:N@4WU]0dR<\u001b\u001e\u001ae\u0018\\+\u001aZ=%g_", "\u001ah]2T9)`#\u0001\b^:\u000bl8d\u0004&wO\u000b$^Gkl\"J\u0016\u001d", "uE;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`~Qn\u0012=z%B/b\u0005\u001ei\u001f-ZM?jGg\u0013riD\u0011q,\u0018\u00047P[R4\\\u001cPG\u001c\u001dd\u001cN8bh=\u0005\u0015", "uE;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`~Qn\u0012=z%B/b\u0005\u001bT\u00127LPEo31^fkA\u0012m:N@4WU]0dR<\u001b\u001e\u001ae\u0018\\+\u001aZ=%g_", "2qPD60KQ)\u0006vk\u0010\u0006\b3c{7\u0006M", "AsP?g\bGU ~", "AvT2c", "Asa<^,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r)zA(\u001bh7", "2qPD60KQ)\u0006vk\u0010\u0006\b3c{7\u0006MHec3T\u0013\u000et", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~X\u000b\u001cI{\u00148XC\u0005JA\u001a'V_C\u0012c\u0002/W\f.HW+i\\v<'[X\u0018V6\u0017\u0013Y\u000b4r\u000e9,\u00047L\u00069vJ\u000b#\nGxnLa\u0010\u0011g$\u0003K/h\u001c\u001dP", "2qPD60KQ)\u0006vk\u0010\u0006\b3c{7\u0006Mo$\u0013Eu", "2qPD60KQ)\u0006vk\u0010\u0006\b3c{7\u0006Mo$\u0013EuU9\tq\u0007Bj\u0010", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~X\u000b\u001cI{\u00148XC\u0005JA\u001a'V_C\u0012c\u00023]#PK[6`Q\u0006\u0007\u0012\u001cb\u0019X9\rNiEmpQ3*\u000b0G\u0010\u0005g\u000e\b(\u001c3t{B }V\u0007\u001f{A~,7", "2qPD7,MS&\u0007~g(\f\t\ri\r&\fG|$zPn\u0012:r4?f", "2qPD7,MS&\u0007~g(\f\t\ri\r&\fG|$zPn\u0012:r4?fEn\u0004Yz3\u001fA", "2qPD<5=S(~\bf0\u0006\u0005>e],\t>\u0011\u001e\u0013TS\u0017;z#1h\b-", "2qPD<5=S(~\bf0\u0006\u0005>e],\t>\u0011\u001e\u0013TS\u0017;z#1h\b-~p#3N20O", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~X\u000b\u001cI{\u00148XC\u0005JA\u001a'V_C\u0012c\u0002/W\b,3J5[_|A\u0013%$\fX3\u0018\u000fgAm~H\u0001!\u0015(T\u0005?f\u000fU\u0015\u001b1|~@`\u001bGC\u0003\u0005N3nF/#j", "2qPD?0GS\u0015\f^g+\u0001\u0007+t\n5", "AsP?g\rKO\u0017\u000e~h5", "3mS\u0013e(<b\u001d\t\u0004", "2qPD?0GS\u0015\f^g+\u0001\u0007+t\n5CLt|\u0006I:\u0010", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~X\u000b\u001cI{\u00148XC\u0005JA\u001a'V_C\u0012c\u0002/W\f(0\u0012\u001d", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ProgressIndicatorKt {
    private static final float BaseRotationAngle = 286.0f;
    private static final CubicBezierEasing CircularEasing;
    private static final float CircularIndicatorDiameter;
    private static final int FirstLineHeadDelay = 0;
    private static final int FirstLineHeadDuration = 750;
    private static final CubicBezierEasing FirstLineHeadEasing;
    private static final int FirstLineTailDelay = 333;
    private static final int FirstLineTailDuration = 850;
    private static final CubicBezierEasing FirstLineTailEasing;
    private static final int HeadAndTailAnimationDuration = 666;
    private static final int HeadAndTailDelayDuration = 666;
    private static final Modifier IncreaseSemanticsBounds;
    private static final float JumpRotationAngle = 290.0f;
    private static final int LinearAnimationDuration = 1800;
    private static final float LinearIndicatorHeight;
    private static final float LinearIndicatorWidth;
    private static final float RotationAngleOffset = 216.0f;
    private static final int RotationDuration = 1332;
    private static final int RotationsPerCycle = 5;
    private static final int SecondLineHeadDelay = 1000;
    private static final int SecondLineHeadDuration = 567;
    private static final CubicBezierEasing SecondLineHeadEasing;
    private static final int SecondLineTailDelay = 1267;
    private static final int SecondLineTailDuration = 533;
    private static final CubicBezierEasing SecondLineTailEasing;
    private static final float SemanticsBoundsPadding;
    private static final float StartAngleOffset = -90.0f;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0018Y\u0001t\u0006|\u001a\u0017g]-\r\\$-R\u001c`\u0011(\u0019( S\u0002K\u0002*N{%v[U~GM\u001ciGJ]3>$Wcl6gX$sB=\u0015\r[#V\u001bBs\u0015w\u0011/7\bP\u0005|`;s\u0005V\u0015@\r1@78etNf\u0005|\u007f)x#X\u001f8q\u001c\"\u001bEW\u0012_.Lvm\n.eUJ\u0016oPD0^K7.9h8W\u0010\u0017\tEmz-W\u0017Y\u000f'#\u0011A\ff", replaceWith = @ReplaceWith(expression = "LinearProgressIndicator(progress, modifier, color, trackColor, strokeCap, gapSize, drawStopIndicator)", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: LinearProgressIndicator-_5eSR-E */
    public static final /* synthetic */ void m2392LinearProgressIndicator_5eSRE(final Function0 function0, Modifier modifier, long j2, long j3, int i2, Composer composer, final int i3, final int i4) {
        int i5;
        int iM2380getLinearStrokeCapKaPHkGw = i2;
        long linearTrackColor = j3;
        long linearColor = j2;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1796992155);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LinearProgressIndicator)P(2,1,0:c#ui.graphics.Color,4:c#ui.graphics.Color,3:c#ui.graphics.StrokeCap)96@4380L11,97@4443L16,100@4539L192:ProgressIndicator.kt#uh7d8r");
        if ((i4 & 1) != 0) {
            i5 = (i3 + 6) - (i3 & 6);
        } else if ((i3 + 6) - (i3 | 6) == 0) {
            i5 = (-1) - (((-1) - (composerStartRestartGroup.changedInstance(function0) ? 4 : 2)) & ((-1) - i3));
        } else {
            i5 = i3;
        }
        int i6 = (-1) - (((-1) - i4) | ((-1) - 2));
        if (i6 != 0) {
            i5 |= 48;
        } else if ((-1) - (((-1) - i3) | ((-1) - 48)) == 0) {
            int i7 = composerStartRestartGroup.changed(companion) ? 32 : 16;
            i5 = (i5 + i7) - (i5 & i7);
        }
        if ((i3 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i3 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (((i4 & 4) == 0 && composerStartRestartGroup.changed(linearColor)) ? 256 : 128)));
        }
        if ((-1) - (((-1) - i3) | ((-1) - 3072)) == 0) {
            int i8 = ((-1) - (((-1) - i4) | ((-1) - 8)) == 0 && composerStartRestartGroup.changed(linearTrackColor)) ? 2048 : 1024;
            i5 = (i5 + i8) - (i5 & i8);
        }
        int i9 = (-1) - (((-1) - i4) | ((-1) - 16));
        if (i9 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 24576));
        } else if ((-1) - (((-1) - i3) | ((-1) - 24576)) == 0) {
            int i10 = composerStartRestartGroup.changed(iM2380getLinearStrokeCapKaPHkGw) ? 16384 : 8192;
            i5 = (i5 + i10) - (i5 & i10);
        }
        if ((i5 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((-1) - (((-1) - i3) | ((-1) - 1)) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i6 != 0) {
                    companion = Modifier.Companion;
                }
                if ((i4 & 4) != 0) {
                    linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-897)));
                }
                if ((i4 + 8) - (i4 | 8) != 0) {
                    linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                    i5 &= -7169;
                }
                if (i9 != 0) {
                    iM2380getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2380getLinearStrokeCapKaPHkGw();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i4 + 4) - (i4 | 4) != 0) {
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-897)));
                }
                if ((i4 & 8) != 0) {
                    i5 &= -7169;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1796992155, i5, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:99)");
            }
            float fM2379getLinearIndicatorTrackGapSizeD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2379getLinearIndicatorTrackGapSizeD9Ej5fM();
            int i11 = (i5 + 14) - (14 | i5);
            int i12 = (i11 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i11 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
            int i13 = 112 & i5;
            int i14 = (i12 + i13) - (i12 & i13);
            int i15 = 896 & i5;
            int i16 = ((i14 + i15) - (i14 & i15)) | ((i5 + 7168) - (7168 | i5));
            int i17 = i5 & 57344;
            m2389LinearProgressIndicatorGJbTh5U(function0, companion, linearColor, linearTrackColor, iM2380getLinearStrokeCapKaPHkGw, fM2379getLinearIndicatorTrackGapSizeD9Ej5fM, null, composerStartRestartGroup, (i16 + i17) - (i16 & i17), 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final long j4 = linearColor;
            final long j5 = linearTrackColor;
            final int i18 = iM2380getLinearStrokeCapKaPHkGw;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i19) {
                    ProgressIndicatorKt.m2392LinearProgressIndicator_5eSRE(function0, modifier2, j4, j5, i18, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                }
            });
        }
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
    /* JADX INFO: renamed from: LinearProgressIndicator-GJbTh5U */
    public static final void m2389LinearProgressIndicatorGJbTh5U(final Function0<Float> function0, Modifier modifier, long j2, long j3, int i2, float f2, Function1<? super DrawScope, Unit> function1, Composer composer, final int i3, final int i4) {
        int i5;
        Function1<? super DrawScope, Unit> function12 = function1;
        long linearTrackColor = j3;
        float fM2379getLinearIndicatorTrackGapSizeD9Ej5fM = f2;
        final long linearColor = j2;
        final int iM2380getLinearStrokeCapKaPHkGw = i2;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-339970038);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LinearProgressIndicator)P(4,3,0:c#ui.graphics.Color,6:c#ui.graphics.Color,5:c#ui.graphics.StrokeCap,2:c#ui.unit.Dp)140@6419L11,141@6482L16,144@6689L214,153@6935L31,157@7087L102,161@7259L806,154@6971L1094:ProgressIndicator.kt#uh7d8r");
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((-1) - (((-1) - i3) | ((-1) - 6)) == 0) {
            int i6 = composerStartRestartGroup.changedInstance(function0) ? 4 : 2;
            i5 = (i6 + i3) - (i6 & i3);
        } else {
            i5 = i3;
        }
        int i7 = i4 & 2;
        if (i7 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            int i8 = composerStartRestartGroup.changed(companion) ? 32 : 16;
            i5 = (i5 + i8) - (i5 & i8);
        }
        if ((i3 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i3 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (((i4 & 4) == 0 && composerStartRestartGroup.changed(linearColor)) ? 256 : 128)));
        }
        if ((i3 + 3072) - (i3 | 3072) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (((i4 + 8) - (i4 | 8) == 0 && composerStartRestartGroup.changed(linearTrackColor)) ? 2048 : 1024)));
        }
        int i9 = i4 & 16;
        if (i9 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 24576));
        } else if ((-1) - (((-1) - i3) | ((-1) - 24576)) == 0) {
            int i10 = composerStartRestartGroup.changed(iM2380getLinearStrokeCapKaPHkGw) ? 16384 : 8192;
            i5 = (i5 + i10) - (i5 & i10);
        }
        int i11 = (i4 + 32) - (i4 | 32);
        if (i11 != 0) {
            i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((-1) - (((-1) - i3) | ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE)) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(fM2379getLinearIndicatorTrackGapSizeD9Ej5fM) ? 131072 : 65536)));
        }
        if ((i3 + 1572864) - (i3 | 1572864) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (((i4 & 64) == 0 && composerStartRestartGroup.changedInstance(function12)) ? 1048576 : 524288)));
        }
        if ((i5 + 599187) - (599187 | i5) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i3 + 1) - (i3 | 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i7 != 0) {
                    companion = Modifier.Companion;
                }
                if ((-1) - (((-1) - i4) | ((-1) - 4)) != 0) {
                    linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                    i5 = (i5 - 897) - (i5 | (-897));
                }
                if ((i4 + 8) - (i4 | 8) != 0) {
                    linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                    i5 &= -7169;
                }
                if (i9 != 0) {
                    iM2380getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2380getLinearStrokeCapKaPHkGw();
                }
                if (i11 != 0) {
                    fM2379getLinearIndicatorTrackGapSizeD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2379getLinearIndicatorTrackGapSizeD9Ej5fM();
                }
                if ((i4 + 64) - (i4 | 64) != 0) {
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1144997616, "CC(remember):ProgressIndicator.kt#9igjgp");
                    boolean z2 = (((((i5 + 896) - (896 | i5)) ^ BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) > 256 && composerStartRestartGroup.changed(linearColor)) || (i5 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (384 | i5) == 256) | ((-1) - (((-1) - 57344) | ((-1) - i5)) == 16384);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z2 || objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                invoke2(drawScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(DrawScope drawScope) {
                                ProgressIndicatorDefaults.INSTANCE.m2374drawStopIndicatorEgI2THU(drawScope, ProgressIndicatorDefaults.INSTANCE.m2381getLinearTrackStopIndicatorSizeD9Ej5fM(), linearColor, iM2380getLinearStrokeCapKaPHkGw);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    function12 = (Function1) objRememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-3670017)));
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i4 & 4) != 0) {
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-897)));
                }
                if ((i4 & 8) != 0) {
                    i5 &= -7169;
                }
                if ((-1) - (((-1) - i4) | ((-1) - 64)) != 0) {
                    i5 &= -3670017;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-339970038, i5, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:152)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1145005305, "CC(remember):ProgressIndicator.kt#9igjgp");
            boolean z3 = (i5 + 14) - (14 | i5) == 4;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$coercedProgress$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Float invoke() {
                        return Float.valueOf(RangesKt.coerceIn(function0.invoke().floatValue(), 0.0f, 1.0f));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final Function0 function02 = (Function0) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierThen = companion.then(IncreaseSemanticsBounds);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1145010240, "CC(remember):ProgressIndicator.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(function02);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$3$1
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
                        SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(function02.invoke().floatValue(), RangesKt.rangeTo(0.0f, 1.0f), 0, 4, null));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierM1065sizeVpY3zN4 = SizeKt.m1065sizeVpY3zN4(SemanticsModifierKt.semantics(modifierThen, true, (Function1) objRememberedValue3), LinearIndicatorWidth, LinearIndicatorHeight);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1145016448, "CC(remember):ProgressIndicator.kt#9igjgp");
            int i12 = (-1) - (((-1) - ((-1) - (((-1) - ((((-1) - (((-1) - ((-1) - (((-1) - 57344) | ((-1) - i5)) == 16384 ? 1 : 0)) & ((-1) - ((-1) - (((-1) - 458752) | ((-1) - i5)) == 131072 ? 1 : 0)))) | (composerStartRestartGroup.changed(function02) ? 1 : 0)) | ((((((i5 + 7168) - (7168 | i5)) ^ 3072) <= 2048 || !composerStartRestartGroup.changed(linearTrackColor)) && (3072 & i5) != 2048) ? 0 : 1))) & ((-1) - ((((((-1) - (((-1) - i5) | ((-1) - 896))) ^ BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) <= 256 || !composerStartRestartGroup.changed(linearColor)) && (384 & i5) != 256) ? 0 : 1))))) & ((-1) - ((((((3670016 + i5) - (3670016 | i5)) ^ 1572864) <= 1048576 || !composerStartRestartGroup.changed(function12)) && (-1) - (((-1) - i5) | ((-1) - 1572864)) != 1048576) ? 0 : 1)));
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (i12 != 0 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                final int i13 = iM2380getLinearStrokeCapKaPHkGw;
                final float f3 = fM2379getLinearIndicatorTrackGapSizeD9Ej5fM;
                final long j4 = linearTrackColor;
                final long j5 = linearColor;
                final Function1<? super DrawScope, Unit> function13 = function12;
                objRememberedValue4 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$4$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        float fM6638constructorimpl;
                        float fM4003getHeightimpl = Size.m4003getHeightimpl(drawScope.mo4734getSizeNHjbRc());
                        if (StrokeCap.m4527equalsimpl0(i13, StrokeCap.Companion.m4531getButtKaPHkGw()) || Size.m4003getHeightimpl(drawScope.mo4734getSizeNHjbRc()) > Size.m4006getWidthimpl(drawScope.mo4734getSizeNHjbRc())) {
                            fM6638constructorimpl = f3;
                        } else {
                            fM6638constructorimpl = Dp.m6638constructorimpl(f3 + drawScope.mo706toDpu2uoSUM(fM4003getHeightimpl));
                        }
                        float f4 = fM6638constructorimpl / drawScope.mo706toDpu2uoSUM(Size.m4006getWidthimpl(drawScope.mo4734getSizeNHjbRc()));
                        float fFloatValue = function02.invoke().floatValue();
                        float fMin = fFloatValue + Math.min(fFloatValue, f4);
                        if (fMin <= 1.0f) {
                            ProgressIndicatorKt.m2404drawLinearIndicatorqYKTg0g(drawScope, fMin, 1.0f, j4, fM4003getHeightimpl, i13);
                        }
                        ProgressIndicatorKt.m2404drawLinearIndicatorqYKTg0g(drawScope, 0.0f, fFloatValue, j5, fM4003getHeightimpl, i13);
                        function13.invoke(drawScope);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            CanvasKt.Canvas(modifierM1065sizeVpY3zN4, (Function1) objRememberedValue4, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i14 = iM2380getLinearStrokeCapKaPHkGw;
            final float f4 = fM2379getLinearIndicatorTrackGapSizeD9Ej5fM;
            final Function1<? super DrawScope, Unit> function14 = function12;
            final long j6 = linearColor;
            final long j7 = linearTrackColor;
            final Modifier modifier2 = companion;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$5
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
                    ProgressIndicatorKt.m2389LinearProgressIndicatorGJbTh5U(function0, modifier2, j6, j7, i14, f4, function14, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i3) & ((-1) - 1))), i4);
                }
            });
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0018Y\u0001t\u0006|\u001a\u0017g]-\r\\$-R\u001c`\u0011(\u0019( S\u0002K\u0002*N{%v[U~GM((LK#r:}[Sz%q1IiCH\u0017\u001eT\u001dR\u001c\u000b9m{\u001at8.;\u0010\u000bd4\r\u000f[xM~J1)Eb\u0002.T)~\b%uaS\u001ee\u0007*,JMaQ2$QKt\r\u001ceUC[\u001d[C!eBA\u00048 5\u001d\b\u0006\u001a8s}", replaceWith = @ReplaceWith(expression = "LinearProgressIndicator(modifier, color, trackColor, strokeCap, gapSize)", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: LinearProgressIndicator-2cYBFYY */
    public static final /* synthetic */ void m2388LinearProgressIndicator2cYBFYY(Modifier modifier, long j2, long j3, int i2, Composer composer, final int i3, final int i4) {
        int i5;
        long linearTrackColor = j3;
        long linearColor = j2;
        int iM2380getLinearStrokeCapKaPHkGw = i2;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-476865359);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LinearProgressIndicator)P(1,0:c#ui.graphics.Color,3:c#ui.graphics.Color,2:c#ui.graphics.StrokeCap)214@9497L11,215@9560L16,218@9656L175:ProgressIndicator.kt#uh7d8r");
        int i6 = (-1) - (((-1) - i4) | ((-1) - 1));
        if (i6 != 0) {
            i5 = (i3 + 6) - (i3 & 6);
        } else if ((-1) - (((-1) - i3) | ((-1) - 6)) == 0) {
            int i7 = composerStartRestartGroup.changed(companion) ? 4 : 2;
            i5 = (i7 + i3) - (i7 & i3);
        } else {
            i5 = i3;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 48)) == 0) {
            i5 |= ((i4 & 2) == 0 && composerStartRestartGroup.changed(linearColor)) ? 32 : 16;
        }
        if ((i3 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i3 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i5 |= ((-1) - (((-1) - i4) | ((-1) - 4)) == 0 && composerStartRestartGroup.changed(linearTrackColor)) ? 256 : 128;
        }
        int i8 = i4 & 8;
        if (i8 != 0) {
            i5 = (i5 + 3072) - (i5 & 3072);
        } else if ((-1) - (((-1) - i3) | ((-1) - 3072)) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(iM2380getLinearStrokeCapKaPHkGw) ? 2048 : 1024)));
        }
        if ((i5 + 1171) - (1171 | i5) != 1170 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i3 + 1) - (i3 | 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i6 != 0) {
                    companion = Modifier.Companion;
                }
                if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
                    linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                    i5 &= -113;
                }
                if ((-1) - (((-1) - i4) | ((-1) - 4)) != 0) {
                    linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-897)));
                }
                if (i8 != 0) {
                    iM2380getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2380getLinearStrokeCapKaPHkGw();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
                    i5 &= -113;
                }
                if ((-1) - (((-1) - i4) | ((-1) - 4)) != 0) {
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-897)));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-476865359, i5, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:217)");
            }
            float fM2379getLinearIndicatorTrackGapSizeD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2379getLinearIndicatorTrackGapSizeD9Ej5fM();
            int i9 = (i5 & 14) | 24576 | ((-1) - (((-1) - i5) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)));
            int i10 = (-1) - (((-1) - i5) | ((-1) - 896));
            m2394LinearProgressIndicatorrIrjwxo(companion, linearColor, linearTrackColor, iM2380getLinearStrokeCapKaPHkGw, fM2379getLinearIndicatorTrackGapSizeD9Ej5fM, composerStartRestartGroup, ((i9 + i10) - (i9 & i10)) | (i5 & 7168), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final long j4 = linearColor;
            final long j5 = linearTrackColor;
            final int i11 = iM2380getLinearStrokeCapKaPHkGw;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i12) {
                    Modifier modifier3 = modifier2;
                    long j6 = j4;
                    long j7 = j5;
                    int i13 = i11;
                    int i14 = i3;
                    ProgressIndicatorKt.m2388LinearProgressIndicator2cYBFYY(modifier3, j6, j7, i13, composer2, RecomposeScopeImplKt.updateChangedFlags((i14 + 1) - (i14 & 1)), i4);
                }
            });
        }
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
    /* JADX INFO: renamed from: LinearProgressIndicator-rIrjwxo */
    public static final void m2394LinearProgressIndicatorrIrjwxo(Modifier modifier, long j2, long j3, int i2, float f2, Composer composer, final int i3, final int i4) {
        int i5;
        final int iM2380getLinearStrokeCapKaPHkGw = i2;
        float fM2379getLinearIndicatorTrackGapSizeD9Ej5fM = f2;
        long linearColor = j2;
        long linearTrackColor = j3;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(567589233);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LinearProgressIndicator)P(2,0:c#ui.graphics.Color,4:c#ui.graphics.Color,3:c#ui.graphics.StrokeCap,1:c#ui.unit.Dp)249@11000L11,250@11063L16,254@11257L28,259@11547L396,272@11995L396,285@12444L400,298@12897L400,315@13472L1839,310@13302L2009:ProgressIndicator.kt#uh7d8r");
        int i6 = (i4 + 1) - (i4 | 1);
        if (i6 != 0) {
            i5 = (i3 + 6) - (i3 & 6);
        } else if ((i3 + 6) - (i3 | 6) == 0) {
            i5 = (composerStartRestartGroup.changed(companion) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= ((-1) - (((-1) - i4) | ((-1) - 2)) == 0 && composerStartRestartGroup.changed(linearColor)) ? 32 : 16;
        }
        if ((-1) - (((-1) - i3) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i5 |= ((i4 & 4) == 0 && composerStartRestartGroup.changed(linearTrackColor)) ? 256 : 128;
        }
        int i7 = (i4 + 8) - (i4 | 8);
        if (i7 != 0) {
            i5 |= 3072;
        } else if ((i3 + 3072) - (i3 | 3072) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(iM2380getLinearStrokeCapKaPHkGw) ? 2048 : 1024)));
        }
        int i8 = i4 & 16;
        if (i8 != 0) {
            i5 |= 24576;
        } else if ((i3 & 24576) == 0) {
            i5 |= composerStartRestartGroup.changed(fM2379getLinearIndicatorTrackGapSizeD9Ej5fM) ? 16384 : 8192;
        }
        if ((i5 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((-1) - (((-1) - i3) | ((-1) - 1)) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i6 != 0) {
                    companion = Modifier.Companion;
                }
                if ((i4 & 2) != 0) {
                    linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                    i5 = (i5 - 113) - (i5 | (-113));
                }
                if ((-1) - (((-1) - i4) | ((-1) - 4)) != 0) {
                    linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                    i5 = (i5 - 897) - (i5 | (-897));
                }
                if (i7 != 0) {
                    iM2380getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2380getLinearStrokeCapKaPHkGw();
                }
                if (i8 != 0) {
                    fM2379getLinearIndicatorTrackGapSizeD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2379getLinearIndicatorTrackGapSizeD9Ej5fM();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
                    i5 &= -113;
                }
                if ((i4 + 4) - (i4 | 4) != 0) {
                    i5 &= -897;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(567589233, i5, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:253)");
            }
            InfiniteTransition infiniteTransitionRememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
            InfiniteRepeatableSpec infiniteRepeatableSpecM476infiniteRepeatable9IiC70o$default = AnimationSpecKt.m476infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    keyframesSpecConfig.setDurationMillis(1800);
                    keyframesSpecConfig.using(keyframesSpecConfig.at(Float.valueOf(0.0f), 0), ProgressIndicatorKt.FirstLineHeadEasing);
                    keyframesSpecConfig.at(Float.valueOf(1.0f), 750);
                }
            }), null, 0L, 6, null);
            int i9 = InfiniteTransition.$stable;
            final State<Float> stateAnimateFloat = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 1.0f, infiniteRepeatableSpecM476infiniteRepeatable9IiC70o$default, null, composerStartRestartGroup, (-1) - (((-1) - ((i9 + 432) - (i9 & 432))) & ((-1) - (InfiniteRepeatableSpec.$stable << 9))), 8);
            InfiniteRepeatableSpec infiniteRepeatableSpecM476infiniteRepeatable9IiC70o$default2 = AnimationSpecKt.m476infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    keyframesSpecConfig.setDurationMillis(1800);
                    keyframesSpecConfig.using(keyframesSpecConfig.at(Float.valueOf(0.0f), 333), ProgressIndicatorKt.FirstLineTailEasing);
                    keyframesSpecConfig.at(Float.valueOf(1.0f), 1183);
                }
            }), null, 0L, 6, null);
            int i10 = InfiniteTransition.$stable;
            int i11 = (i10 + 432) - (i10 & 432);
            int i12 = InfiniteRepeatableSpec.$stable << 9;
            final State<Float> stateAnimateFloat2 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 1.0f, infiniteRepeatableSpecM476infiniteRepeatable9IiC70o$default2, null, composerStartRestartGroup, (i11 + i12) - (i11 & i12), 8);
            InfiniteRepeatableSpec infiniteRepeatableSpecM476infiniteRepeatable9IiC70o$default3 = AnimationSpecKt.m476infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    keyframesSpecConfig.setDurationMillis(1800);
                    keyframesSpecConfig.using(keyframesSpecConfig.at(Float.valueOf(0.0f), 1000), ProgressIndicatorKt.SecondLineHeadEasing);
                    keyframesSpecConfig.at(Float.valueOf(1.0f), 1567);
                }
            }), null, 0L, 6, null);
            int i13 = InfiniteTransition.$stable;
            int i14 = (i13 + 432) - (i13 & 432);
            int i15 = InfiniteRepeatableSpec.$stable << 9;
            final State<Float> stateAnimateFloat3 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 1.0f, infiniteRepeatableSpecM476infiniteRepeatable9IiC70o$default3, null, composerStartRestartGroup, (i14 + i15) - (i14 & i15), 8);
            final State<Float> stateAnimateFloat4 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m476infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    keyframesSpecConfig.setDurationMillis(1800);
                    keyframesSpecConfig.using(keyframesSpecConfig.at(Float.valueOf(0.0f), 1267), ProgressIndicatorKt.SecondLineTailEasing);
                    keyframesSpecConfig.at(Float.valueOf(1.0f), 1800);
                }
            }), null, 0L, 6, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
            Modifier modifierM1065sizeVpY3zN4 = SizeKt.m1065sizeVpY3zN4(ProgressSemanticsKt.progressSemantics(companion.then(IncreaseSemanticsBounds)), LinearIndicatorWidth, LinearIndicatorHeight);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1145216297, "CC(remember):ProgressIndicator.kt#9igjgp");
            int i16 = (i5 & 7168) == 2048 ? 1 : 0;
            int i17 = (57344 & i5) == 16384 ? 1 : 0;
            int i18 = (-1) - (((-1) - ((i16 + i17) - (i16 & i17))) & ((-1) - (composerStartRestartGroup.changed(stateAnimateFloat) ? 1 : 0)));
            int i19 = (((((i5 + 896) - (896 | i5)) ^ BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) <= 256 || !composerStartRestartGroup.changed(linearTrackColor)) && (384 & i5) != 256) ? 0 : 1;
            int i20 = ((-1) - (((-1) - ((i18 + i19) - (i18 & i19))) & ((-1) - (composerStartRestartGroup.changed(stateAnimateFloat2) ? 1 : 0)))) | (((((112 & i5) ^ 48) <= 32 || !composerStartRestartGroup.changed(linearColor)) && (i5 & 48) != 32) ? 0 : 1);
            boolean zChanged = composerStartRestartGroup.changed(stateAnimateFloat3);
            int i21 = ((i20 + (zChanged ? 1 : 0)) - (i20 & (zChanged ? 1 : 0))) | (composerStartRestartGroup.changed(stateAnimateFloat4) ? 1 : 0);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i21 != 0 || objRememberedValue == Composer.Companion.getEmpty()) {
                final long j4 = linearColor;
                final long j5 = linearTrackColor;
                final float f3 = fM2379getLinearIndicatorTrackGapSizeD9Ej5fM;
                iM2380getLinearStrokeCapKaPHkGw = iM2380getLinearStrokeCapKaPHkGw;
                objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$7$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        float fM6638constructorimpl;
                        float fFloatValue;
                        float fFloatValue2;
                        float fFloatValue3;
                        float fM4003getHeightimpl = Size.m4003getHeightimpl(drawScope.mo4734getSizeNHjbRc());
                        if (StrokeCap.m4527equalsimpl0(iM2380getLinearStrokeCapKaPHkGw, StrokeCap.Companion.m4531getButtKaPHkGw()) || Size.m4003getHeightimpl(drawScope.mo4734getSizeNHjbRc()) > Size.m4006getWidthimpl(drawScope.mo4734getSizeNHjbRc())) {
                            fM6638constructorimpl = f3;
                        } else {
                            fM6638constructorimpl = Dp.m6638constructorimpl(f3 + drawScope.mo706toDpu2uoSUM(fM4003getHeightimpl));
                        }
                        float f4 = fM6638constructorimpl / drawScope.mo706toDpu2uoSUM(Size.m4006getWidthimpl(drawScope.mo4734getSizeNHjbRc()));
                        if (stateAnimateFloat.getValue().floatValue() < 1.0f - f4) {
                            if (stateAnimateFloat.getValue().floatValue() > 0.0f) {
                                fFloatValue3 = stateAnimateFloat.getValue().floatValue() + f4;
                            } else {
                                fFloatValue3 = 0.0f;
                            }
                            ProgressIndicatorKt.m2404drawLinearIndicatorqYKTg0g(drawScope, fFloatValue3, 1.0f, j5, fM4003getHeightimpl, iM2380getLinearStrokeCapKaPHkGw);
                        }
                        if (stateAnimateFloat.getValue().floatValue() - stateAnimateFloat2.getValue().floatValue() > 0.0f) {
                            ProgressIndicatorKt.m2404drawLinearIndicatorqYKTg0g(drawScope, stateAnimateFloat.getValue().floatValue(), stateAnimateFloat2.getValue().floatValue(), j4, fM4003getHeightimpl, iM2380getLinearStrokeCapKaPHkGw);
                        }
                        if (stateAnimateFloat2.getValue().floatValue() > f4) {
                            if (stateAnimateFloat3.getValue().floatValue() > 0.0f) {
                                fFloatValue = stateAnimateFloat3.getValue().floatValue() + f4;
                            } else {
                                fFloatValue = 0.0f;
                            }
                            if (stateAnimateFloat2.getValue().floatValue() < 1.0f) {
                                fFloatValue2 = stateAnimateFloat2.getValue().floatValue() - f4;
                            } else {
                                fFloatValue2 = 1.0f;
                            }
                            ProgressIndicatorKt.m2404drawLinearIndicatorqYKTg0g(drawScope, fFloatValue, fFloatValue2, j5, fM4003getHeightimpl, iM2380getLinearStrokeCapKaPHkGw);
                        }
                        if (stateAnimateFloat3.getValue().floatValue() - stateAnimateFloat4.getValue().floatValue() > 0.0f) {
                            ProgressIndicatorKt.m2404drawLinearIndicatorqYKTg0g(drawScope, stateAnimateFloat3.getValue().floatValue(), stateAnimateFloat4.getValue().floatValue(), j4, fM4003getHeightimpl, iM2380getLinearStrokeCapKaPHkGw);
                        }
                        if (stateAnimateFloat4.getValue().floatValue() > f4) {
                            ProgressIndicatorKt.m2404drawLinearIndicatorqYKTg0g(drawScope, 0.0f, stateAnimateFloat4.getValue().floatValue() < 1.0f ? stateAnimateFloat4.getValue().floatValue() - f4 : 1.0f, j5, fM4003getHeightimpl, iM2380getLinearStrokeCapKaPHkGw);
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            CanvasKt.Canvas(modifierM1065sizeVpY3zN4, (Function1) objRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final long j6 = linearColor;
            final long j7 = linearTrackColor;
            final int i22 = iM2380getLinearStrokeCapKaPHkGw;
            final float f4 = fM2379getLinearIndicatorTrackGapSizeD9Ej5fM;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$8
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i23) {
                    ProgressIndicatorKt.m2394LinearProgressIndicatorrIrjwxo(modifier2, j6, j7, i22, f4, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i3) & ((-1) - 1))), i4);
                }
            });
        }
    }

    @Deprecated(message = "\u0018Y\u0001t\u0006|\u001a\u0017g]-\r\\$-R\u001c`\u0011(\u0019( S\u0002K\u0002*N\u00056uo^iU`\\(:Y]4y\u001eWY{&Y", replaceWith = @ReplaceWith(expression = "LinearProgressIndicator(\nprogress = { progress },\nmodifier = modifier,\ncolor = color,\ntrackColor = trackColor,\nstrokeCap = strokeCap,\n)", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: LinearProgressIndicator-_5eSR-E */
    public static final void m2391LinearProgressIndicator_5eSRE(final float f2, Modifier modifier, long j2, long j3, int i2, Composer composer, final int i3, final int i4) {
        int i5;
        int iM2380getLinearStrokeCapKaPHkGw = i2;
        long linearColor = j2;
        long linearTrackColor = j3;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(905419617);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LinearProgressIndicator)P(2,1,0:c#ui.graphics.Color,4:c#ui.graphics.Color,3:c#ui.graphics.StrokeCap)385@15871L11,386@15934L16,390@16074L12,389@16030L179:ProgressIndicator.kt#uh7d8r");
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(f2) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i6 = (i4 + 2) - (i4 | 2);
        if (i6 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 48));
        } else if ((-1) - (((-1) - i3) | ((-1) - 48)) == 0) {
            int i7 = composerStartRestartGroup.changed(companion) ? 32 : 16;
            i5 = (i5 + i7) - (i5 & i7);
        }
        if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i5 |= ((-1) - (((-1) - i4) | ((-1) - 4)) == 0 && composerStartRestartGroup.changed(linearColor)) ? 256 : 128;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 3072)) == 0) {
            int i8 = ((i4 + 8) - (i4 | 8) == 0 && composerStartRestartGroup.changed(linearTrackColor)) ? 2048 : 1024;
            i5 = (i5 + i8) - (i5 & i8);
        }
        int i9 = (i4 + 16) - (i4 | 16);
        if (i9 != 0) {
            i5 |= 24576;
        } else if ((i3 & 24576) == 0) {
            i5 |= composerStartRestartGroup.changed(iM2380getLinearStrokeCapKaPHkGw) ? 16384 : 8192;
        }
        if ((i5 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((-1) - (((-1) - i3) | ((-1) - 1)) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i6 != 0) {
                    companion = Modifier.Companion;
                }
                if ((-1) - (((-1) - i4) | ((-1) - 4)) != 0) {
                    linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-897)));
                }
                if ((i4 & 8) != 0) {
                    linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                    i5 = (i5 - 7169) - (i5 | (-7169));
                }
                if (i9 != 0) {
                    iM2380getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2380getLinearStrokeCapKaPHkGw();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i4 + 4) - (i4 | 4) != 0) {
                    i5 &= -897;
                }
                if ((i4 + 8) - (i4 | 8) != 0) {
                    i5 &= -7169;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(905419617, i5, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:389)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1145297734, "CC(remember):ProgressIndicator.kt#9igjgp");
            boolean z2 = (14 & i5) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$9$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Float invoke() {
                        return Float.valueOf(f2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            m2389LinearProgressIndicatorGJbTh5U((Function0) objRememberedValue, companion, linearColor, linearTrackColor, iM2380getLinearStrokeCapKaPHkGw, 0.0f, null, composerStartRestartGroup, (i5 + 65520) - (i5 | 65520), 96);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final long j4 = linearColor;
            final long j5 = linearTrackColor;
            final int i10 = iM2380getLinearStrokeCapKaPHkGw;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$10
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i11) {
                    float f3 = f2;
                    Modifier modifier3 = modifier2;
                    long j6 = j4;
                    long j7 = j5;
                    int i12 = i10;
                    int i13 = i3;
                    ProgressIndicatorKt.m2391LinearProgressIndicator_5eSRE(f3, modifier3, j6, j7, i12, composer2, RecomposeScopeImplKt.updateChangedFlags((i13 + 1) - (i13 & 1)), i4);
                }
            });
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0010G\u0005C\u0006u\u001ee]Kg\u0001_'kPeZ\n9\u001e(\u000fa\u0004Vo~Wv-rq`}")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: LinearProgressIndicator-eaDK9VM */
    public static final /* synthetic */ void m2393LinearProgressIndicatoreaDK9VM(final float f2, Modifier modifier, long j2, long j3, Composer composer, final int i2, final int i3) {
        int i4;
        long linearTrackColor = j3;
        long linearColor = j2;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-372717133);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LinearProgressIndicator)P(2,1,0:c#ui.graphics.Color,3:c#ui.graphics.Color)403@16462L11,404@16525L16,406@16551L164:ProgressIndicator.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = (i2 + 6) - (i2 & 6);
        } else if ((i2 + 6) - (i2 | 6) == 0) {
            i4 = (composerStartRestartGroup.changed(f2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            i4 |= composerStartRestartGroup.changed(companion) ? 32 : 16;
        }
        if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((-1) - (((-1) - i3) | ((-1) - 4)) == 0 && composerStartRestartGroup.changed(linearColor)) ? 256 : 128)));
        }
        if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            int i6 = ((-1) - (((-1) - i3) | ((-1) - 8)) == 0 && composerStartRestartGroup.changed(linearTrackColor)) ? 2048 : 1024;
            i4 = (i4 + i6) - (i4 & i6);
        }
        if ((i4 + 1171) - (1171 | i4) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((-1) - (((-1) - i2) | ((-1) - 1)) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
                    linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                    i4 = (i4 - 897) - (i4 | (-897));
                }
                if ((i3 & 8) != 0) {
                    linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                    i4 &= -7169;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    i4 &= -7169;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-372717133, i4, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:406)");
            }
            int i7 = (i4 & 14) | 24576;
            int i8 = 112 & i4;
            m2391LinearProgressIndicator_5eSRE(f2, companion, linearColor, linearTrackColor, ProgressIndicatorDefaults.INSTANCE.m2380getLinearStrokeCapKaPHkGw(), composerStartRestartGroup, ((-1) - (((-1) - ((i7 + i8) - (i7 & i8))) & ((-1) - ((-1) - (((-1) - i4) | ((-1) - 896)))))) | ((-1) - (((-1) - i4) | ((-1) - 7168))), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final long j4 = linearColor;
            final long j5 = linearTrackColor;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$11
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
                    ProgressIndicatorKt.m2393LinearProgressIndicatoreaDK9VM(f2, modifier2, j4, j5, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0010G\u0005C\u0006u\u001ee]Kg\u0001_'kPeZ\n9\u001e(\u000fa\u0004Vo~Wv-rq`}")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: LinearProgressIndicator-RIQooxk */
    public static final /* synthetic */ void m2390LinearProgressIndicatorRIQooxk(Modifier modifier, long j2, long j3, Composer composer, final int i2, final int i3) {
        int i4;
        long linearTrackColor = j3;
        long linearColor = j2;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(585576195);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LinearProgressIndicator)P(1,0:c#ui.graphics.Color,2:c#ui.graphics.Color)418@16922L11,419@16985L16,421@17011L146:ProgressIndicator.kt#uh7d8r");
        int i5 = (-1) - (((-1) - i3) | ((-1) - 1));
        if (i5 != 0) {
            i4 = (-1) - (((-1) - i2) & ((-1) - 6));
        } else if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            int i6 = composerStartRestartGroup.changed(companion) ? 4 : 2;
            i4 = (i6 + i2) - (i6 & i2);
        } else {
            i4 = i2;
        }
        if ((i2 + 48) - (i2 | 48) == 0) {
            i4 |= ((i3 & 2) == 0 && composerStartRestartGroup.changed(linearColor)) ? 32 : 16;
        }
        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((i3 & 4) == 0 && composerStartRestartGroup.changed(linearTrackColor)) ? 256 : 128)));
        }
        if ((i4 + 147) - (147 | i4) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 + 1) - (i2 | 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
                    linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                    i4 &= -113;
                }
                if ((i3 & 4) != 0) {
                    linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                    i4 &= -897;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 & 2) != 0) {
                    i4 = (i4 - 113) - (i4 | (-113));
                }
                if ((i3 & 4) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-897)));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(585576195, i4, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:421)");
            }
            int i7 = (-1) - (((-1) - (i4 & 14)) & ((-1) - 3072));
            int i8 = 112 & i4;
            m2394LinearProgressIndicatorrIrjwxo(companion, linearColor, linearTrackColor, ProgressIndicatorDefaults.INSTANCE.m2380getLinearStrokeCapKaPHkGw(), 0.0f, composerStartRestartGroup, (-1) - (((-1) - ((i7 + i8) - (i7 & i8))) & ((-1) - (i4 & 896))), 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final long j4 = linearColor;
            final long j5 = linearTrackColor;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$12
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
                    ProgressIndicatorKt.m2390LinearProgressIndicatorRIQooxk(modifier2, j4, j5, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }

    /* JADX INFO: renamed from: drawLinearIndicator-qYKTg0g */
    public static final void m2404drawLinearIndicatorqYKTg0g(DrawScope drawScope, float f2, float f3, long j2, float f4, int i2) {
        float fM4006getWidthimpl = Size.m4006getWidthimpl(drawScope.mo4734getSizeNHjbRc());
        float fM4003getHeightimpl = Size.m4003getHeightimpl(drawScope.mo4734getSizeNHjbRc());
        float f5 = 2;
        float f6 = fM4003getHeightimpl / f5;
        boolean z2 = drawScope.getLayoutDirection() == LayoutDirection.Ltr;
        float f7 = (z2 ? f2 : 1.0f - f3) * fM4006getWidthimpl;
        float f8 = (z2 ? f3 : 1.0f - f2) * fM4006getWidthimpl;
        if (StrokeCap.m4527equalsimpl0(i2, StrokeCap.Companion.m4531getButtKaPHkGw()) || fM4003getHeightimpl > fM4006getWidthimpl) {
            DrawScope.m4720drawLineNGM6Ib0$default(drawScope, j2, OffsetKt.Offset(f7, f6), OffsetKt.Offset(f8, f6), f4, 0, null, 0.0f, null, 0, 496, null);
            return;
        }
        float f9 = f4 / f5;
        ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo = RangesKt.rangeTo(f9, fM4006getWidthimpl - f9);
        float fFloatValue = ((Number) RangesKt.coerceIn(Float.valueOf(f7), closedFloatingPointRangeRangeTo)).floatValue();
        float fFloatValue2 = ((Number) RangesKt.coerceIn(Float.valueOf(f8), closedFloatingPointRangeRangeTo)).floatValue();
        if (Math.abs(f3 - f2) > 0.0f) {
            DrawScope.m4720drawLineNGM6Ib0$default(drawScope, j2, OffsetKt.Offset(fFloatValue, f6), OffsetKt.Offset(fFloatValue2, f6), f4, i2, null, 0.0f, null, 0, 480, null);
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0018Y\u0001t\u0006|\u001a\u0017g]-\r\\$-R\u001c`\u0011(\u0019( S\u0002K\u0002*N{%v[U~GM((LK#r:}[Sz%q+DwAI\u001e\rY\u0004V*}F\u0007\u0006\u001fXE T\u0001|q1\u001anI\u001dO\u0007F.g@a/Cb3.\u0010/54I#:\u000e-\u001aJMZ\u0017_/P<{\u0004&;TzXbS22XHD", replaceWith = @ReplaceWith(expression = "CircularProgressIndicator(progress, modifier, color, strokeWidth, trackColor, strokeCap, gapSize)", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: CircularProgressIndicator-DUhRLBM */
    public static final /* synthetic */ void m2383CircularProgressIndicatorDUhRLBM(final Function0 function0, Modifier modifier, long j2, float f2, long j3, int i2, Composer composer, final int i3, final int i4) {
        int i5;
        Modifier.Companion companion = modifier;
        long circularDeterminateTrackColor = j3;
        int iM2375getCircularDeterminateStrokeCapKaPHkGw = i2;
        long circularColor = j2;
        float fM2378getCircularStrokeWidthD9Ej5fM = f2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-761680467);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(CircularProgressIndicator)P(2,1,0:c#ui.graphics.Color,4:c#ui.unit.Dp,5:c#ui.graphics.Color,3:c#ui.graphics.StrokeCap)529@21735L13,531@21869L29,534@21991L217:ProgressIndicator.kt#uh7d8r");
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((-1) - (((-1) - i3) | ((-1) - 6)) == 0) {
            int i6 = composerStartRestartGroup.changedInstance(function0) ? 4 : 2;
            i5 = (i6 + i3) - (i6 & i3);
        } else {
            i5 = i3;
        }
        int i7 = (i4 + 2) - (i4 | 2);
        if (i7 != 0) {
            i5 |= 48;
        } else if ((i3 + 48) - (i3 | 48) == 0) {
            int i8 = composerStartRestartGroup.changed(companion) ? 32 : 16;
            i5 = (i5 + i8) - (i5 & i8);
        }
        if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (((i4 + 4) - (i4 | 4) == 0 && composerStartRestartGroup.changed(circularColor)) ? 256 : 128)));
        }
        int i9 = (-1) - (((-1) - i4) | ((-1) - 8));
        if (i9 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 3072));
        } else if ((-1) - (((-1) - i3) | ((-1) - 3072)) == 0) {
            int i10 = composerStartRestartGroup.changed(fM2378getCircularStrokeWidthD9Ej5fM) ? 2048 : 1024;
            i5 = (i5 + i10) - (i5 & i10);
        }
        if ((i3 + 24576) - (i3 | 24576) == 0) {
            int i11 = ((i4 & 16) == 0 && composerStartRestartGroup.changed(circularDeterminateTrackColor)) ? 16384 : 8192;
            i5 = (i5 + i11) - (i5 & i11);
        }
        int i12 = (i4 + 32) - (i4 | 32);
        if (i12 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE));
        } else if ((ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE + i3) - (196608 | i3) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(iM2375getCircularDeterminateStrokeCapKaPHkGw) ? 131072 : 65536)));
        }
        if ((74899 & i5) != 74898 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i3 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i7 != 0) {
                    companion = Modifier.Companion;
                }
                if ((i4 + 4) - (i4 | 4) != 0) {
                    circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                    i5 = (i5 - 897) - (i5 | (-897));
                }
                if (i9 != 0) {
                    fM2378getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2378getCircularStrokeWidthD9Ej5fM();
                }
                if ((i4 + 16) - (i4 | 16) != 0) {
                    circularDeterminateTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularDeterminateTrackColor(composerStartRestartGroup, 6);
                    i5 = (i5 - 57345) - (i5 | (-57345));
                }
                if (i12 != 0) {
                    iM2375getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2375getCircularDeterminateStrokeCapKaPHkGw();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i4 & 4) != 0) {
                    i5 &= -897;
                }
                if ((i4 & 16) != 0) {
                    i5 &= -57345;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-761680467, i5, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:533)");
            }
            float fM2377getCircularIndicatorTrackGapSizeD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2377getCircularIndicatorTrackGapSizeD9Ej5fM();
            int i13 = (-1) - (((-1) - i5) | ((-1) - 14));
            int i14 = (i13 + 1572864) - (i13 & 1572864);
            int i15 = (i5 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (112 | i5);
            int i16 = (-1) - (((-1) - (((i14 + i15) - (i14 & i15)) | ((-1) - (((-1) - i5) | ((-1) - 896))))) & ((-1) - ((-1) - (((-1) - i5) | ((-1) - 7168)))));
            int i17 = 57344 & i5;
            int i18 = (i16 + i17) - (i16 & i17);
            int i19 = (i5 + 458752) - (i5 | 458752);
            long j4 = circularColor;
            Modifier modifier2 = companion;
            m2384CircularProgressIndicatorIyT6zlY(function0, modifier2, j4, fM2378getCircularStrokeWidthD9Ej5fM, circularDeterminateTrackColor, iM2375getCircularDeterminateStrokeCapKaPHkGw, fM2377getCircularIndicatorTrackGapSizeD9Ej5fM, composerStartRestartGroup, (i18 + i19) - (i18 & i19), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier3 = companion;
            final long j5 = circularColor;
            final float f3 = fM2378getCircularStrokeWidthD9Ej5fM;
            final long j6 = circularDeterminateTrackColor;
            final int i20 = iM2375getCircularDeterminateStrokeCapKaPHkGw;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i21) {
                    ProgressIndicatorKt.m2383CircularProgressIndicatorDUhRLBM(function0, modifier3, j5, f3, j6, i20, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                }
            });
        }
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
    /* JADX INFO: renamed from: CircularProgressIndicator-IyT6zlY */
    public static final void m2384CircularProgressIndicatorIyT6zlY(final Function0<Float> function0, Modifier modifier, long j2, float f2, long j3, int i2, float f3, Composer composer, final int i3, final int i4) {
        int i5;
        float fM2377getCircularIndicatorTrackGapSizeD9Ej5fM = f3;
        long circularDeterminateTrackColor = j3;
        float fM2378getCircularStrokeWidthD9Ej5fM = f2;
        Modifier.Companion companion = modifier;
        int iM2375getCircularDeterminateStrokeCapKaPHkGw = i2;
        long circularColor = j2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1798883595);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(CircularProgressIndicator)P(3,2,0:c#ui.graphics.Color,5:c#ui.unit.Dp,6:c#ui.graphics.Color,4:c#ui.graphics.StrokeCap,1:c#ui.unit.Dp)575@23884L13,577@24018L29,581@24237L31,*582@24304L7,585@24446L102,589@24600L709,583@24373L936:ProgressIndicator.kt#uh7d8r");
        if ((i4 & 1) != 0) {
            i5 = (i3 + 6) - (i3 & 6);
        } else if ((i3 + 6) - (i3 | 6) == 0) {
            i5 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i6 = (-1) - (((-1) - i4) | ((-1) - 2));
        if (i6 != 0) {
            i5 = (i5 + 48) - (i5 & 48);
        } else if ((-1) - (((-1) - i3) | ((-1) - 48)) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(companion) ? 32 : 16)));
        }
        if ((i3 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i3 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i7 = ((-1) - (((-1) - i4) | ((-1) - 4)) == 0 && composerStartRestartGroup.changed(circularColor)) ? 256 : 128;
            i5 = (i5 + i7) - (i5 & i7);
        }
        int i8 = (i4 + 8) - (i4 | 8);
        if (i8 != 0) {
            i5 |= 3072;
        } else if ((i3 + 3072) - (i3 | 3072) == 0) {
            i5 |= composerStartRestartGroup.changed(fM2378getCircularStrokeWidthD9Ej5fM) ? 2048 : 1024;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 24576)) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (((i4 & 16) == 0 && composerStartRestartGroup.changed(circularDeterminateTrackColor)) ? 16384 : 8192)));
        }
        int i9 = i4 & 32;
        if (i9 != 0) {
            i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i5 |= composerStartRestartGroup.changed(iM2375getCircularDeterminateStrokeCapKaPHkGw) ? 131072 : 65536;
        }
        int i10 = (i4 + 64) - (i4 | 64);
        if (i10 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 1572864));
        } else if ((i3 & 1572864) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(fM2377getCircularIndicatorTrackGapSizeD9Ej5fM) ? 1048576 : 524288)));
        }
        if ((i5 + 599187) - (599187 | i5) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i3 + 1) - (i3 | 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i6 != 0) {
                    companion = Modifier.Companion;
                }
                if ((i4 & 4) != 0) {
                    circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                    i5 &= -897;
                }
                if (i8 != 0) {
                    fM2378getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2378getCircularStrokeWidthD9Ej5fM();
                }
                if ((i4 & 16) != 0) {
                    circularDeterminateTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularDeterminateTrackColor(composerStartRestartGroup, 6);
                    i5 &= -57345;
                }
                if (i9 != 0) {
                    iM2375getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2375getCircularDeterminateStrokeCapKaPHkGw();
                }
                if (i10 != 0) {
                    fM2377getCircularIndicatorTrackGapSizeD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2377getCircularIndicatorTrackGapSizeD9Ej5fM();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i4 & 4) != 0) {
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-897)));
                }
                if ((i4 + 16) - (i4 | 16) != 0) {
                    i5 = (i5 - 57345) - (i5 | (-57345));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1798883595, i5, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:580)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -291619137, "CC(remember):ProgressIndicator.kt#9igjgp");
            boolean z2 = (i5 + 14) - (14 | i5) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$coercedProgress$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Float invoke() {
                        return Float.valueOf(RangesKt.coerceIn(function0.invoke().floatValue(), 0.0f, 1.0f));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final Function0 function02 = (Function0) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final Stroke stroke = new Stroke(((Density) objConsume).mo710toPx0680j_4(fM2378getCircularStrokeWidthD9Ej5fM), 0.0f, iM2375getCircularDeterminateStrokeCapKaPHkGw, 0, null, 26, null);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -291612378, "CC(remember):ProgressIndicator.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(function02);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$2$1
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
                        SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(function02.invoke().floatValue(), RangesKt.rangeTo(0.0f, 1.0f), 0, 4, null));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierM1063size3ABfNKs = SizeKt.m1063size3ABfNKs(SemanticsModifierKt.semantics(companion, true, (Function1) objRememberedValue2), CircularIndicatorDiameter);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -291606843, "CC(remember):ProgressIndicator.kt#9igjgp");
            int i11 = (composerStartRestartGroup.changed(function02) ? 1 : 0) | ((458752 & i5) == 131072 ? 1 : 0);
            int i12 = (3670016 & i5) == 1048576 ? 1 : 0;
            int i13 = ((i11 + i12) - (i11 & i12)) | ((i5 & 7168) == 2048 ? 1 : 0) | ((((((57344 + i5) - (57344 | i5)) ^ 24576) <= 16384 || !composerStartRestartGroup.changed(circularDeterminateTrackColor)) && (i5 + 24576) - (24576 | i5) != 16384) ? 0 : 1);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(stroke);
            boolean z3 = ((i13 + (zChangedInstance ? 1 : 0)) - (i13 & (zChangedInstance ? 1 : 0)) == 1) | (((((-1) - (((-1) - i5) | ((-1) - 896))) ^ BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) > 256 && composerStartRestartGroup.changed(circularColor)) || (-1) - (((-1) - i5) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 256);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                final int i14 = iM2375getCircularDeterminateStrokeCapKaPHkGw;
                final float f4 = fM2377getCircularIndicatorTrackGapSizeD9Ej5fM;
                final float f5 = fM2378getCircularStrokeWidthD9Ej5fM;
                final long j4 = circularDeterminateTrackColor;
                final long j5 = circularColor;
                objRememberedValue3 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        float fM6638constructorimpl;
                        float fFloatValue = function02.invoke().floatValue() * 360.0f;
                        if (StrokeCap.m4527equalsimpl0(i14, StrokeCap.Companion.m4531getButtKaPHkGw()) || Size.m4003getHeightimpl(drawScope.mo4734getSizeNHjbRc()) > Size.m4006getWidthimpl(drawScope.mo4734getSizeNHjbRc())) {
                            fM6638constructorimpl = f4;
                        } else {
                            fM6638constructorimpl = Dp.m6638constructorimpl(f4 + f5);
                        }
                        float f6 = (fM6638constructorimpl / ((float) (((double) drawScope.mo706toDpu2uoSUM(Size.m4006getWidthimpl(drawScope.mo4734getSizeNHjbRc()))) * 3.141592653589793d))) * 360.0f;
                        ProgressIndicatorKt.m2400drawCircularIndicator42QJj7c(drawScope, 270.0f + fFloatValue + Math.min(fFloatValue, f6), (360.0f - fFloatValue) - (Math.min(fFloatValue, f6) * 2), j4, stroke);
                        ProgressIndicatorKt.m2402drawDeterminateCircularIndicator42QJj7c(drawScope, 270.0f, fFloatValue, j5, stroke);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            CanvasKt.Canvas(modifierM1063size3ABfNKs, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i15 = iM2375getCircularDeterminateStrokeCapKaPHkGw;
            final float f6 = fM2377getCircularIndicatorTrackGapSizeD9Ej5fM;
            final long j6 = circularDeterminateTrackColor;
            final long j7 = circularColor;
            final float f7 = fM2378getCircularStrokeWidthD9Ej5fM;
            final Modifier modifier2 = companion;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i16) {
                    ProgressIndicatorKt.m2384CircularProgressIndicatorIyT6zlY(function0, modifier2, j7, f7, j6, i15, f6, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i3) & ((-1) - 1))), i4);
                }
            });
        }
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
    /* JADX INFO: renamed from: CircularProgressIndicator-LxG7B9w */
    public static final void m2385CircularProgressIndicatorLxG7B9w(Modifier modifier, long j2, float f2, long j3, int i2, Composer composer, final int i3, final int i4) {
        int i5;
        Composer composer2;
        float fM2378getCircularStrokeWidthD9Ej5fM = f2;
        int iM2376getCircularIndeterminateStrokeCapKaPHkGw = i2;
        long circularColor = j2;
        long circularIndeterminateTrackColor = j3;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-115871647);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(CircularProgressIndicator)P(1,0:c#ui.graphics.Color,3:c#ui.unit.Dp,4:c#ui.graphics.Color,2:c#ui.graphics.StrokeCap)633@26429L13,635@26563L31,*638@26720L7,640@26807L28,643@26972L350,657@27444L208,666@27777L422,679@28240L431,691@28745L628,691@28676L697:ProgressIndicator.kt#uh7d8r");
        int i6 = (i4 + 1) - (i4 | 1);
        if (i6 != 0) {
            i5 = (i3 + 6) - (i3 & 6);
        } else if ((i3 + 6) - (i3 | 6) == 0) {
            i5 = (composerStartRestartGroup.changed(companion) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 + 48) - (i3 | 48) == 0) {
            i5 |= ((-1) - (((-1) - i4) | ((-1) - 2)) == 0 && composerStartRestartGroup.changed(circularColor)) ? 32 : 16;
        }
        int i7 = (i4 + 4) - (i4 | 4);
        if (i7 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((i3 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i3 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(fM2378getCircularStrokeWidthD9Ej5fM) ? 256 : 128)));
        }
        if ((-1) - (((-1) - i3) | ((-1) - 3072)) == 0) {
            i5 |= ((i4 + 8) - (i4 | 8) == 0 && composerStartRestartGroup.changed(circularIndeterminateTrackColor)) ? 2048 : 1024;
        }
        int i8 = (i4 + 16) - (i4 | 16);
        if (i8 != 0) {
            i5 = (i5 + 24576) - (i5 & 24576);
            composer2 = composerStartRestartGroup;
        } else {
            composer2 = composerStartRestartGroup;
            if ((-1) - (((-1) - i3) | ((-1) - 24576)) == 0) {
                Composer composer3 = composerStartRestartGroup;
                i5 |= composer3.changed(iM2376getCircularIndeterminateStrokeCapKaPHkGw) ? 16384 : 8192;
                composer2 = composer3;
            }
        }
        if ((-1) - (((-1) - i5) | ((-1) - 9363)) == 9362 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            composer2.startDefaults();
            if ((i3 & 1) == 0 || composer2.getDefaultsInvalid()) {
                if (i6 != 0) {
                    companion = Modifier.Companion;
                }
                if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
                    circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composer2, 6);
                    i5 = (i5 - 113) - (i5 | (-113));
                }
                if (i7 != 0) {
                    fM2378getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2378getCircularStrokeWidthD9Ej5fM();
                }
                if ((i4 & 8) != 0) {
                    circularIndeterminateTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularIndeterminateTrackColor(composer2, 6);
                    i5 &= -7169;
                }
                if (i8 != 0) {
                    iM2376getCircularIndeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2376getCircularIndeterminateStrokeCapKaPHkGw();
                }
            } else {
                composer2.skipToGroupEnd();
                if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
                    i5 &= -113;
                }
                if ((i4 + 8) - (i4 | 8) != 0) {
                    i5 = (i5 - 7169) - (i5 | (-7169));
                }
            }
            composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-115871647, i5, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:637)");
            }
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composer2.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            iM2376getCircularIndeterminateStrokeCapKaPHkGw = iM2376getCircularIndeterminateStrokeCapKaPHkGw;
            final Stroke stroke = new Stroke(((Density) objConsume).mo710toPx0680j_4(fM2378getCircularStrokeWidthD9Ej5fM), 0.0f, iM2376getCircularIndeterminateStrokeCapKaPHkGw, 0, null, 26, null);
            InfiniteTransition infiniteTransitionRememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition(null, composer2, 0, 1);
            TwoWayConverter<Integer, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE);
            InfiniteRepeatableSpec infiniteRepeatableSpecM476infiniteRepeatable9IiC70o$default = AnimationSpecKt.m476infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null);
            int i9 = InfiniteTransition.$stable;
            int i10 = 1;
            final State stateAnimateValue = InfiniteTransitionKt.animateValue(infiniteTransitionRememberInfiniteTransition, 0, 5, vectorConverter, infiniteRepeatableSpecM476infiniteRepeatable9IiC70o$default, null, composer2, (-1) - (((-1) - ((i9 + 432) - (i9 & 432))) & ((-1) - (InfiniteRepeatableSpec.$stable << 12))), 16);
            InfiniteRepeatableSpec infiniteRepeatableSpecM476infiniteRepeatable9IiC70o$default2 = AnimationSpecKt.m476infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(RotationDuration, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null);
            int i11 = InfiniteTransition.$stable | 432;
            int i12 = InfiniteRepeatableSpec.$stable << 9;
            final State<Float> stateAnimateFloat = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, BaseRotationAngle, infiniteRepeatableSpecM476infiniteRepeatable9IiC70o$default2, null, composer2, (i11 + i12) - (i11 & i12), 8);
            InfiniteRepeatableSpec infiniteRepeatableSpecM476infiniteRepeatable9IiC70o$default3 = AnimationSpecKt.m476infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$endAngle$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    keyframesSpecConfig.setDurationMillis(1332);
                    keyframesSpecConfig.using(keyframesSpecConfig.at(Float.valueOf(0.0f), 0), ProgressIndicatorKt.CircularEasing);
                    keyframesSpecConfig.at(Float.valueOf(290.0f), IptcDirectory.TAG_AUDIO_OUTCUE);
                }
            }), null, 0L, 6, null);
            int i13 = InfiniteTransition.$stable | 432;
            int i14 = InfiniteRepeatableSpec.$stable << 9;
            final State<Float> stateAnimateFloat2 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, JumpRotationAngle, infiniteRepeatableSpecM476infiniteRepeatable9IiC70o$default3, null, composer2, (i13 + i14) - (i13 & i14), 8);
            InfiniteRepeatableSpec infiniteRepeatableSpecM476infiniteRepeatable9IiC70o$default4 = AnimationSpecKt.m476infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$startAngle$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    keyframesSpecConfig.setDurationMillis(1332);
                    keyframesSpecConfig.using(keyframesSpecConfig.at(Float.valueOf(0.0f), IptcDirectory.TAG_AUDIO_OUTCUE), ProgressIndicatorKt.CircularEasing);
                    keyframesSpecConfig.at(Float.valueOf(290.0f), keyframesSpecConfig.getDurationMillis());
                }
            }), null, 0L, 6, null);
            int i15 = (-1) - (((-1) - InfiniteTransition.$stable) & ((-1) - 432));
            int i16 = InfiniteRepeatableSpec.$stable << 9;
            final State<Float> stateAnimateFloat3 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, JumpRotationAngle, infiniteRepeatableSpecM476infiniteRepeatable9IiC70o$default4, null, composer2, (i15 + i16) - (i15 & i16), 8);
            Modifier modifierM1063size3ABfNKs = SizeKt.m1063size3ABfNKs(ProgressSemanticsKt.progressSemantics(companion), CircularIndicatorDiameter);
            ComposerKt.sourceInformationMarkerStart(composer2, -291474284, "CC(remember):ProgressIndicator.kt#9igjgp");
            int i17 = i5;
            int i18 = (-1) - (((-1) - ((((((i17 + 7168) - (i17 | 7168)) ^ 3072) <= 2048 || !composer2.changed(circularIndeterminateTrackColor)) && (3072 & i5) != 2048) ? 0 : 1)) & ((-1) - (composer2.changedInstance(stroke) ? 1 : 0)));
            boolean zChanged = composer2.changed(stateAnimateValue);
            int i19 = (-1) - (((-1) - (((-1) - (((-1) - ((i18 + (zChanged ? 1 : 0)) - (i18 & (zChanged ? 1 : 0)))) & ((-1) - (composer2.changed(stateAnimateFloat2) ? 1 : 0)))) | (composer2.changed(stateAnimateFloat3) ? 1 : 0))) & ((-1) - (composer2.changed(stateAnimateFloat) ? 1 : 0)));
            int i20 = (-1) - (((-1) - i5) | ((-1) - 896)) == 256 ? 1 : 0;
            int i21 = (i19 + i20) - (i19 & i20);
            if (((((-1) - (((-1) - i5) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))) ^ 48) <= 32 || !composer2.changed(circularColor)) && (-1) - (((-1) - i5) | ((-1) - 48)) != 32) {
                i10 = 0;
            }
            int i22 = (-1) - (((-1) - i21) & ((-1) - i10));
            Object objRememberedValue = composer2.rememberedValue();
            if (i22 != 0 || objRememberedValue == Composer.Companion.getEmpty()) {
                final long j4 = circularIndeterminateTrackColor;
                final float f3 = fM2378getCircularStrokeWidthD9Ej5fM;
                final long j5 = circularColor;
                objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$5$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        ProgressIndicatorKt.m2401drawCircularIndicatorTrackbw27NRU(drawScope, j4, stroke);
                        ProgressIndicatorKt.m2403drawIndeterminateCircularIndicatorhrjfTZI(drawScope, stateAnimateFloat3.getValue().floatValue() + (((stateAnimateValue.getValue().floatValue() * 216.0f) % 360.0f) - 90.0f) + stateAnimateFloat.getValue().floatValue(), f3, Math.abs(stateAnimateFloat2.getValue().floatValue() - stateAnimateFloat3.getValue().floatValue()), j5, stroke);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            CanvasKt.Canvas(modifierM1063size3ABfNKs, (Function1) objRememberedValue, composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final long j6 = circularColor;
            final float f4 = fM2378getCircularStrokeWidthD9Ej5fM;
            final long j7 = circularIndeterminateTrackColor;
            final int i23 = iM2376getCircularIndeterminateStrokeCapKaPHkGw;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                    invoke(composer4, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer4, int i24) {
                    ProgressIndicatorKt.m2385CircularProgressIndicatorLxG7B9w(modifier2, j6, f4, j7, i23, composer4, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i3) & ((-1) - 1))), i4);
                }
            });
        }
    }

    @Deprecated(message = "\u0018Y\u0001t\u0006|\u001a\u0017g]-\r\\$-R\u001c`\u0011(\u0019( S\u0002K\u0002*N\u00056uo^iU`\\(:Y]4y\u001eWY{&Y", replaceWith = @ReplaceWith(expression = "CircularProgressIndicator(\nprogress = { progress },\nmodifier = modifier,\ncolor = color,\nstrokeWidth = strokeWidth,\ntrackColor = trackColor,\nstrokeCap = strokeCap,\n)", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: CircularProgressIndicator-DUhRLBM */
    public static final void m2382CircularProgressIndicatorDUhRLBM(final float f2, Modifier modifier, long j2, float f3, long j3, int i2, Composer composer, final int i3, final int i4) {
        int i5;
        long circularTrackColor = j3;
        float fM2378getCircularStrokeWidthD9Ej5fM = f3;
        Modifier.Companion companion = modifier;
        int iM2375getCircularDeterminateStrokeCapKaPHkGw = i2;
        long circularColor = j2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1472321743);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(CircularProgressIndicator)P(2,1,0:c#ui.graphics.Color,4:c#ui.unit.Dp,5:c#ui.graphics.Color,3:c#ui.graphics.StrokeCap)730@30011L13,732@30145L18,736@30302L12,735@30256L216:ProgressIndicator.kt#uh7d8r");
        if ((-1) - (((-1) - i4) | ((-1) - 1)) != 0) {
            i5 = (-1) - (((-1) - i3) & ((-1) - 6));
        } else if ((-1) - (((-1) - i3) | ((-1) - 6)) == 0) {
            int i6 = composerStartRestartGroup.changed(f2) ? 4 : 2;
            i5 = (i6 + i3) - (i6 & i3);
        } else {
            i5 = i3;
        }
        int i7 = (-1) - (((-1) - i4) | ((-1) - 2));
        if (i7 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 48));
        } else if ((i3 + 48) - (i3 | 48) == 0) {
            int i8 = composerStartRestartGroup.changed(companion) ? 32 : 16;
            i5 = (i5 + i8) - (i5 & i8);
        }
        if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i9 = ((i4 & 4) == 0 && composerStartRestartGroup.changed(circularColor)) ? 256 : 128;
            i5 = (i5 + i9) - (i5 & i9);
        }
        int i10 = (-1) - (((-1) - i4) | ((-1) - 8));
        if (i10 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 3072));
        } else if ((i3 + 3072) - (i3 | 3072) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(fM2378getCircularStrokeWidthD9Ej5fM) ? 2048 : 1024)));
        }
        if ((i3 & 24576) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (((-1) - (((-1) - i4) | ((-1) - 16)) == 0 && composerStartRestartGroup.changed(circularTrackColor)) ? 16384 : 8192)));
        }
        int i11 = i4 & 32;
        if (i11 != 0) {
            i5 = (i5 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        } else if ((ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE + i3) - (196608 | i3) == 0) {
            int i12 = composerStartRestartGroup.changed(iM2375getCircularDeterminateStrokeCapKaPHkGw) ? 131072 : 65536;
            i5 = (i5 + i12) - (i5 & i12);
        }
        if ((-1) - (((-1) - i5) | ((-1) - 74899)) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i3 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i7 != 0) {
                    companion = Modifier.Companion;
                }
                if ((i4 + 4) - (i4 | 4) != 0) {
                    circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                    i5 &= -897;
                }
                if (i10 != 0) {
                    fM2378getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2378getCircularStrokeWidthD9Ej5fM();
                }
                if ((i4 & 16) != 0) {
                    circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                    i5 &= -57345;
                }
                if (i11 != 0) {
                    iM2375getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2375getCircularDeterminateStrokeCapKaPHkGw();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((-1) - (((-1) - i4) | ((-1) - 4)) != 0) {
                    i5 = (i5 - 897) - (i5 | (-897));
                }
                if ((-1) - (((-1) - i4) | ((-1) - 16)) != 0) {
                    i5 &= -57345;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1472321743, i5, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:735)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -291425076, "CC(remember):ProgressIndicator.kt#9igjgp");
            boolean z2 = (i5 + 14) - (14 | i5) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$7$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Float invoke() {
                        return Float.valueOf(f2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            long j4 = circularColor;
            Modifier modifier2 = companion;
            m2384CircularProgressIndicatorIyT6zlY((Function0) objRememberedValue, modifier2, j4, fM2378getCircularStrokeWidthD9Ej5fM, circularTrackColor, iM2375getCircularDeterminateStrokeCapKaPHkGw, 0.0f, composerStartRestartGroup, (i5 + 524272) - (i5 | 524272), 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier3 = companion;
            final long j5 = circularColor;
            final float f4 = fM2378getCircularStrokeWidthD9Ej5fM;
            final long j6 = circularTrackColor;
            final int i13 = iM2375getCircularDeterminateStrokeCapKaPHkGw;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$8
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i14) {
                    ProgressIndicatorKt.m2382CircularProgressIndicatorDUhRLBM(f2, modifier3, j5, f4, j6, i13, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i3) & ((-1) - 1))), i4);
                }
            });
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0010G\u0005C\u0006u\u001ee]Kg\u0001_'kPeZ\n9\u001e(\u000fa\u0004Vo~Wv-rq`}")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: CircularProgressIndicator-MBs18nI */
    public static final /* synthetic */ void m2386CircularProgressIndicatorMBs18nI(final float f2, Modifier modifier, long j2, float f3, Composer composer, final int i2, final int i3) {
        int i4;
        float fM2378getCircularStrokeWidthD9Ej5fM = f3;
        long circularColor = j2;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(402841196);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(CircularProgressIndicator)P(2,1,0:c#ui.graphics.Color,3:c#ui.unit.Dp)750@30727L13,758@30964L18,753@30818L247:ProgressIndicator.kt#uh7d8r");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            i4 = (-1) - (((-1) - i2) & ((-1) - 6));
        } else if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            int i5 = composerStartRestartGroup.changed(f2) ? 4 : 2;
            i4 = (i5 + i2) - (i5 & i2);
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 = (i4 + 48) - (i4 & 48);
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(companion) ? 32 : 16;
        }
        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i7 = ((i3 + 4) - (i3 | 4) == 0 && composerStartRestartGroup.changed(circularColor)) ? 256 : 128;
            i4 = (i4 + i7) - (i4 & i7);
        }
        int i8 = i3 & 8;
        if (i8 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 3072));
        } else if ((i2 & 3072) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(fM2378getCircularStrokeWidthD9Ej5fM) ? 2048 : 1024)));
        }
        if ((i4 + 1171) - (1171 | i4) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i6 != 0) {
                    companion = Modifier.Companion;
                }
                if ((i3 + 4) - (i3 | 4) != 0) {
                    circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                    i4 &= -897;
                }
                if (i8 != 0) {
                    fM2378getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2378getCircularStrokeWidthD9Ej5fM();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 & 4) != 0) {
                    i4 = (i4 - 897) - (i4 | (-897));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(402841196, i4, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:753)");
            }
            long circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
            int iM2375getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2375getCircularDeterminateStrokeCapKaPHkGw();
            int i9 = ((-1) - (((-1) - i4) | ((-1) - 14))) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | ((-1) - (((-1) - i4) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)));
            int i10 = (i4 + 896) - (896 | i4);
            int i11 = (i9 + i10) - (i9 & i10);
            int i12 = (-1) - (((-1) - i4) | ((-1) - 7168));
            m2382CircularProgressIndicatorDUhRLBM(f2, companion, circularColor, fM2378getCircularStrokeWidthD9Ej5fM, circularTrackColor, iM2375getCircularDeterminateStrokeCapKaPHkGw, composerStartRestartGroup, (i11 + i12) - (i11 & i12), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final long j3 = circularColor;
            final float f4 = fM2378getCircularStrokeWidthD9Ej5fM;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$9
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i13) {
                    ProgressIndicatorKt.m2386CircularProgressIndicatorMBs18nI(f2, modifier2, j3, f4, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i2) & ((-1) - 1))), i3);
                }
            });
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0010G\u0005C\u0006u\u001ee]Kg\u0001_'kPeZ\n9\u001e(\u000fa\u0004Vo~Wv-rq`}")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: CircularProgressIndicator-aM-cp0Q */
    public static final /* synthetic */ void m2387CircularProgressIndicatoraMcp0Q(Modifier modifier, long j2, float f2, Composer composer, final int i2, final int i3) {
        int i4;
        long circularColor = j2;
        float fM2378getCircularStrokeWidthD9Ej5fM = f2;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(947193756);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(CircularProgressIndicator)P(1,0:c#ui.graphics.Color,2:c#ui.unit.Dp)767@31299L13,774@31518L18,770@31390L231:ProgressIndicator.kt#uh7d8r");
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = (-1) - (((-1) - i2) & ((-1) - 6));
        } else if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            int i6 = composerStartRestartGroup.changed(companion) ? 4 : 2;
            i4 = (i6 + i2) - (i6 & i2);
        } else {
            i4 = i2;
        }
        if ((i2 + 48) - (i2 | 48) == 0) {
            i4 |= ((i3 + 2) - (i3 | 2) == 0 && composerStartRestartGroup.changed(circularColor)) ? 32 : 16;
        }
        int i7 = (-1) - (((-1) - i3) | ((-1) - 4));
        if (i7 != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i4 |= composerStartRestartGroup.changed(fM2378getCircularStrokeWidthD9Ej5fM) ? 256 : 128;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 147)) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((-1) - (((-1) - i2) | ((-1) - 1)) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if ((i3 & 2) != 0) {
                    circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                    i4 &= -113;
                }
                if (i7 != 0) {
                    fM2378getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2378getCircularStrokeWidthD9Ej5fM();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
                    i4 &= -113;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(947193756, i4, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:770)");
            }
            m2385CircularProgressIndicatorLxG7B9w(companion, circularColor, fM2378getCircularStrokeWidthD9Ej5fM, ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6), ProgressIndicatorDefaults.INSTANCE.m2376getCircularIndeterminateStrokeCapKaPHkGw(), composerStartRestartGroup, ((-1) - (((-1) - ((-1) - (((-1) - ((-1) - (((-1) - i4) | ((-1) - 14)))) & ((-1) - 24576)))) & ((-1) - (112 & i4)))) | (i4 & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final long j3 = circularColor;
            final float f3 = fM2378getCircularStrokeWidthD9Ej5fM;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$10
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i8) {
                    Modifier modifier3 = modifier2;
                    long j4 = j3;
                    float f4 = f3;
                    int i9 = i2;
                    ProgressIndicatorKt.m2387CircularProgressIndicatoraMcp0Q(modifier3, j4, f4, composer2, RecomposeScopeImplKt.updateChangedFlags((i9 + 1) - (i9 & 1)), i3);
                }
            });
        }
    }

    /* JADX INFO: renamed from: drawCircularIndicator-42QJj7c */
    public static final void m2400drawCircularIndicator42QJj7c(DrawScope drawScope, float f2, float f3, long j2, Stroke stroke) {
        float f4 = 2;
        float width = stroke.getWidth() / f4;
        float fM4006getWidthimpl = Size.m4006getWidthimpl(drawScope.mo4734getSizeNHjbRc()) - (f4 * width);
        DrawScope.m4713drawArcyD3GUKo$default(drawScope, j2, f2, f3, false, OffsetKt.Offset(width, width), androidx.compose.ui.geometry.SizeKt.Size(fM4006getWidthimpl, fM4006getWidthimpl), 0.0f, stroke, null, 0, LeicaMakernoteDirectory.TAG_IMAGE_ID_NUMBER, null);
    }

    /* JADX INFO: renamed from: drawCircularIndicatorTrack-bw27NRU */
    public static final void m2401drawCircularIndicatorTrackbw27NRU(DrawScope drawScope, long j2, Stroke stroke) {
        m2400drawCircularIndicator42QJj7c(drawScope, 0.0f, 360.0f, j2, stroke);
    }

    /* JADX INFO: renamed from: drawDeterminateCircularIndicator-42QJj7c */
    public static final void m2402drawDeterminateCircularIndicator42QJj7c(DrawScope drawScope, float f2, float f3, long j2, Stroke stroke) {
        m2400drawCircularIndicator42QJj7c(drawScope, f2, f3, j2, stroke);
    }

    /* JADX INFO: renamed from: drawIndeterminateCircularIndicator-hrjfTZI */
    public static final void m2403drawIndeterminateCircularIndicatorhrjfTZI(DrawScope drawScope, float f2, float f3, float f4, long j2, Stroke stroke) {
        m2400drawCircularIndicator42QJj7c(drawScope, f2 + (StrokeCap.m4527equalsimpl0(stroke.m4803getCapKaPHkGw(), StrokeCap.Companion.m4531getButtKaPHkGw()) ? 0.0f : ((f3 / Dp.m6638constructorimpl(CircularIndicatorDiameter / 2)) * 57.29578f) / 2.0f), Math.max(f4, 0.1f), j2, stroke);
    }

    public static final float getLinearIndicatorWidth() {
        return LinearIndicatorWidth;
    }

    public static final float getLinearIndicatorHeight() {
        return LinearIndicatorHeight;
    }

    public static final float getCircularIndicatorDiameter() {
        return CircularIndicatorDiameter;
    }

    static {
        float fM6638constructorimpl = Dp.m6638constructorimpl(10);
        SemanticsBoundsPadding = fM6638constructorimpl;
        IncreaseSemanticsBounds = PaddingKt.m1020paddingVpY3zN4$default(SemanticsModifierKt.semantics(LayoutModifierKt.layout(Modifier.Companion, new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.material3.ProgressIndicatorKt$IncreaseSemanticsBounds$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                return m2405invoke3p2s80s(measureScope, measurable, constraints.m6597unboximpl());
            }

            /* JADX INFO: renamed from: invoke-3p2s80s, reason: not valid java name */
            public final MeasureResult m2405invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
                final int i2 = measureScope.mo704roundToPx0680j_4(ProgressIndicatorKt.SemanticsBoundsPadding);
                int i3 = i2 * 2;
                final Placeable placeableMo5514measureBRTryo0 = measurable.mo5514measureBRTryo0(ConstraintsKt.m6610offsetNN6EwU(j2, 0, i3));
                return MeasureScope.layout$default(measureScope, placeableMo5514measureBRTryo0.getWidth(), placeableMo5514measureBRTryo0.getHeight() - i3, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$IncreaseSemanticsBounds$1.1
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
                        Placeable.PlacementScope.place$default(placementScope, placeableMo5514measureBRTryo0, 0, -i2, 0.0f, 4, null);
                    }
                }, 4, null);
            }
        }), true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$IncreaseSemanticsBounds$2
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }
        }), 0.0f, fM6638constructorimpl, 1, null);
        LinearIndicatorWidth = Dp.m6638constructorimpl(240);
        LinearIndicatorHeight = ProgressIndicatorTokens.INSTANCE.m3486getTrackThicknessD9Ej5fM();
        CircularIndicatorDiameter = Dp.m6638constructorimpl(ProgressIndicatorTokens.INSTANCE.m3483getSizeD9Ej5fM() - Dp.m6638constructorimpl(ProgressIndicatorTokens.INSTANCE.m3486getTrackThicknessD9Ej5fM() * 2));
        FirstLineHeadEasing = new CubicBezierEasing(0.2f, 0.0f, 0.8f, 1.0f);
        FirstLineTailEasing = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);
        SecondLineHeadEasing = new CubicBezierEasing(0.0f, 0.0f, 0.65f, 1.0f);
        SecondLineTailEasing = new CubicBezierEasing(0.1f, 0.0f, 0.45f, 1.0f);
        CircularEasing = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);
    }
}
