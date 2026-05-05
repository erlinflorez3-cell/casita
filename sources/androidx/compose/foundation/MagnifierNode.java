package androidx.compose.foundation;

import android.view.View;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
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
/* JADX INFO: compiled from: Magnifier.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яę\u0014D57\u001eq\u007fZDkt\u001aA\u000e0!.J~8,\u001aw\u001dfrˎ8D{H6Ri*\u0017k\u00124,[:qK;[\u001a\u0006\"\u001fOVgunRҙ\u0013C\u001d\u000b\u001eюr,W^\u0001]\u0018\u000f:B\u0006?;Mu>A`\u000b6\r 8%@y\u001b\u0001\"*N\u0019~zYK\u0014\u00126Ax:h\rU\u0005 \u0018\u000e>6\u0001&\\mW>H\u0003]B/)\u000bqBd'g0\u0003Y\u0015Fj'\u0015Ǹi\u001eA@?ߎ\u001bǬiΈ7R\n>3? =5hU([I\"YfX.\u0017UۚN\u001dr\u0001*t\u0016ab\u001c'YUsM`\u000eV~)\u0001Ɂ@\u0004\u0014\u000e7a4-(o !Cv\u0003SnV\u0012`R\u007f)hL\u0016S\u0005Ĵ/9!nauA\u0019\\A\u0014\u0013\u001d 3\u0001\u001d,kV\u001e`C'jv\u007f6aFCH\\\u0017q=\u001c\u0012\u0001h\b*\u0012?_\u007f]\f!4\u001d%ElQ#Ov\u0012NJg\u0005\u0017xh\u0002|bNF\"|*O*7\u001fjJj\u0005yelXZ!]\"Z\u0007\f\u001e+ \u000b\u000f˶%%\u001ef\u0018nw;e]81uz\u007f_|=&WgjyI\u001aq\u001e4jvBKlf\u0013,~B\u00029!pp(@\u001d\u0003\u0010&\b\u000bbT\u0019@\u0015\n\u001cb8w\u0019%üG\u0011tZA+\u0015\u0010ov\u0014\u0017eC&\u0013iRz\u0019\u0003`\\\u001fv\u0016}ͅ0|f*]X_>19e$x4+)\u0017\u0001\u0004\u007funbFzqטyU\u0002(F\u001eG^G=A\u001d/-@\u0011EEz\u0003\u0016U[#?z+\u0005??v@\u007f\b\u0019\u0004\\dx^gTE5'b\u00018 d.\n\u0012X\tQ{b\u001b]NI!\u000ei>^8+\u00115\u001dS\u0006 &\u000bKECU4ʯvҡڏ\u0019ccA}\u0007Bh\u001d\u007f\re28*\u00168h_8J;fU ~\u0007,2H\u001bBvv \bpez!{ROB\tVfY3/,EM@]\tdtR\u0013\u001e\u0005jn6͋u̎|жۤB$ݱQW\u007fosej&\u001b#\u0018'\u00149~\u0014,=N]ma7M\\֏$ݠE;jŝ\r!2ID<6\u001b\u001aҔuѕ\u0014\u0007\bʋw\u0011\u001dPP\u0013[X\u0014t\u0007}'h\u0013r]`O=WϚ\u001b˵\u001d֭î0\u0004֪Jb7c@'k\u001f\u000f=xr\u001fh+ORy\n)6\u007f\u0019\r[\\qOXԐ\u0010ھ-msƑ\\L&%5J(\u001dIQ?k\r/\r4,̧ZЩz\u0012nŚ\u001fB7\u0013\u0013|<O`ێ\u0017ŸNΓǰa,ٮR\u0006?C('/F/1\u001a \u0004H!X\u0014Z}jW\u0019,)\u0012V\u0002h.\u000e.L?\u0006\u000b \u000b\u0005D'H\u001eqŰϒqїf\u0012\u0011\u0015VS\u0012bbvx9<8VQ\bd\u0010E/gy-9B=*\u001b<\u0019űtǰ\u000ect̙?\u0001\u0019\f~Df{~-~#\u0019)].A_p9?Xޓ\\\u0011\u0006\u001ckҸ+߱\fn1ցgen(y\b{\u000f1hyd2W>\\6\f/{\u0006\u0004X_8\u0017KV{Jz\b\u000bq\u0019ħ\u001a߿n4lÆ$+\u001a8\r\u0001~\u0013\u0019pT-n|=M1\u001f\n$\u001e֣\u0013ʺIU.ϳITEXEp+q.6\u001fC\u000bv\u0003ABD\u001fq.*\u0003ߣRĠ<ԣǔX#މh\u0003.ɔ\u0016XP\u0019D\u0011<\u001c\u0006իDօ=юՃ\u001b:Ǿ7O!\u0011\u000f[P\buJ'P\u000bSYi8FM*\u001bC\u0012B{<\u00047!)?\u0011\u007f\u001b\u0006mi*̂iL-\u0014XʍVԐQo^՟y.O|SV\u001aWFH\u0018Yt8\u0014?;\u007fs8\u001f߮kҀ?ѲڔV\u0003ڲ.8vD1\u000e=\u0011\u0002\u0019DiF\u0004;՞mƍE\u0007\u001cԌ\\@0wz&eOnE\u0019e]S\"\u0004'\b?2EJfބ}̂/Izى\u007ftkI+s2H\t݊B̹KLaآ\u001e/\u0018#q\u000e\u000boW/\u001e]ܹ\r\u0016\fz7ؑ|._%\u0018-jŝJ\u0016"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\r1[\u0007$8q\u0016;6M:k\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u001ec| \r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9oC\u0001\"1`h*Eq%2WL\u0017}0+\u0015Pk8\u000bd0N\u0004\u0010QKN\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9lIr7\u001dc|$8q\u0016;6M:k\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9{<~!>h\u0002\u001eEU -QD?kA\u0007\u001fga\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9w9\u0005%Bj}-\u001fw\u00152NG;x\u001d(\u0014h7", "And?V,\u001cS\"\u000ezk", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", ";`V;\\-BS&\\zg;|\u0016", "=mB6m,\u001cV\u0015\b|^+", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGd)JYS", "", "Hn^:", "", "CrT!X?M2\u0019\u007fvn3\f", "", "Ahi2", "1na;X9+O\u0018\u0003\u000bl", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "3kTCT;B]\"", "1kX=c0GUx\bv[3|\b", ">kPAY6K[\u0001z|g0}\r/r`$yO\u000b$+", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0010<U\r!Az\u001e\u0016IEDo5\"\u0015uB5\u0005r6[\u000b|", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%S\u0007=w%5QL\u0005pE&^iqB\u0005r0X\u007f5\u0011-^5ZavG\u001d]0tT5\u001c\f]JmsU?h\t<R\u007fJl\u000b\u0015$W\u0016zy@e\u0014Q\u0003`K\"\u001eM':T`CJDo4h\u000brfZDB/\u001e\u007f\u0019diZ>\u0013zO v\\\u00031RN\u0015\n9.KuCBGxY=x',,wu!<e\t\u0001[3\u000eC1:mNPx \bb\u0002$,iJ#-\u007f\u001b\u0013@Gs|{\u001c\u0018q-p\u0015\u001e`D;&MapN\u000f\u00143ZL", "/mR5b9)]'\u0003\nb6\u0006l8R\n2\u000b", "5dc\u000ea*A]&i\u0005l0\f\r9nc1hJ\u000b&^(;k\fS\u0017\u007f", "u(9", "/mR5b9)]'\u0003\nb6\u0006l8R\n2\u000b.\u0010\u0013&G", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "5dc\u0010_0I^\u001d\b|>5x\u00066e~", "u(I", "Adc\u0010_0I^\u001d\b|>5x\u00066e~", "uY\u0018#", "5dc\u0010b9GS&kv]0\r\u0017vDS\b\u0001\u0010\u0002~", "u(5", "Adc\u0010b9GS&kv]0\r\u0017v0PzFEze", "uE\u0018#", "\u0014", "2d]@\\;R", "2qPDF0@\\\u0015\u0006Xa(\u0006\u0012/l", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00038U\u0007)7tk", "5dc\u0012_,OO(\u0003\u0005gs[\\\u000fjO)c", "Adc\u0012_,OO(\u0003\u0005gsGY\u00020\u0005\"J", "\nrTA \u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u0015w ;LGDgC\u001e#>", ":`h<h;\u001c]#\fyb5x\u0018/s", "5dc\u0019T@Hc(\\\u0005h9{\r8a\u000f(\n", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n\u001cU\u0012*G|s8WP:o=\u001a$ho\u000f", "Adc\u0019T@Hc(\\\u0005h9{\r8a\u000f(\n", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\f1m\b0FK 8ZB?t0-\u0015v7|w", ":`h<h;\u001c]#\fyb5x\u0018/s>'{G\u0001\u0019\u0013Vo", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", ";`V;\\-BS&", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0010<U\r!Az\u001e\u0016IEDo5\"\u0015u7", "5dc\u001aT.GW\u001a\u0003zk\n|\u0012>e\r", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "Adc\u001aT.GW\u001a\u0003zk\n|\u0012>e\r", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc(", "5dc\u001ca\u001aBh\u0019\\}Z5~\t.", "Adc\u001ca\u001aBh\u0019\\}Z5~\t.", "5dc\u001d_(MT#\f\u0003F(~\u00123f\u0004(\t!|\u0015&Q|\"", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~D\u0005\u001cFn ;U+7m=\"\u0016laFg_*]\u00014[\"", "Adc\u001d_(MT#\f\u0003F(~\u00123f\u0004(\t!|\u0015&Q|\"", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn `y/8w#65?=t8\u001f\u0019hn\u001a\u0003a;X\u0004;\u001d\u0010?", ">qTC\\6Na\u0007\u0003\u0010^", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "5dc \\A>\u001b\u0001r\u000eOxot", "Adc \\A>\u001bxzhE*n\u0007", "uI\u0018#", "\u0018", "5dc b<KQ\u0019\\zg;|\u0016", "Adc b<KQ\u0019\\zg;|\u0016", "And?V,\u001cS\"\u000ezk\u0010\u0006u9o\u000f", "5dc\"f,-S,\u000eY^-x\u00196t", "Adc\"f,-S,\u000eY^-x\u00196t", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "5dc'b6F", "Adc'b6F", "=m0Ag(<V", "=m32g(<V", "=m69b):Z \u0013eh:\u0001\u00183o\t(z", "1n^?W0GO(~\t", "=m>/f,Kd\u0019}g^({\u0017\rh{1}@\u007f", "@dR?X(MS\u0001z|g0}\r/r", "CoS.g,", "CoS.g,\u0006#yIHF\nh", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%S\u0007=w%5QL\u0005pE&^iqB\u0005r0X\u007f5\u0011-^5ZavG\u001d]0nC\u0010meN(*xS>#\u0011uN\u0013C2\u0002\u001c\u001f\fDnzKdY(\n\u001esP-rO%5`CJDo4h\u000brfZDB/\u001e\u007f\u0019diZ>\u0013zO v\\\u00031RN\u0015\n9.KuCBGxY=x',,wu!<e\t\u00018\u001e", "CoS.g,&O\u001b\b~_0|\u0016", "CoS.g,,W.~^_\u0015|\u0007/s\u000e$\tT", "/o_9l\u001a>[\u0015\b\nb*\u000b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ&x>)\u0015upMsc*Nz8GY$", "2qPD", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u0019u=-\u0015qp\u0018\u0014_><t1RL$", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MagnifierNode extends Modifier.Node implements GlobalPositionAwareModifierNode, DrawModifierNode, SemanticsModifierNode, ObserverModifierNode {
    public static final int $stable = 8;
    private State<Offset> anchorPositionInRootState;
    private boolean clippingEnabled;
    private float cornerRadius;
    private Density density;
    private Channel<Unit> drawSignalChannel;
    private float elevation;
    private final MutableState layoutCoordinates$delegate;
    private PlatformMagnifier magnifier;
    private Function1<? super Density, Offset> magnifierCenter;
    private Function1<? super DpSize, Unit> onSizeChanged;
    private PlatformMagnifierFactory platformMagnifierFactory;
    private IntSize previousSize;
    private long size;
    private Function1<? super Density, Offset> sourceCenter;
    private long sourceCenterInRoot;
    private boolean useTextDefault;
    private View view;
    private float zoom;

    public /* synthetic */ MagnifierNode(Function1 function1, Function1 function12, Function1 function13, float f2, boolean z2, long j2, float f3, float f4, boolean z3, PlatformMagnifierFactory platformMagnifierFactory, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, function12, function13, f2, z2, j2, f3, f4, z3, platformMagnifierFactory);
    }

    public final Function1<Density, Offset> getSourceCenter() {
        return this.sourceCenter;
    }

    public final void setSourceCenter(Function1<? super Density, Offset> function1) {
        this.sourceCenter = function1;
    }

    public final Function1<Density, Offset> getMagnifierCenter() {
        return this.magnifierCenter;
    }

    public final void setMagnifierCenter(Function1<? super Density, Offset> function1) {
        this.magnifierCenter = function1;
    }

    public final Function1<DpSize, Unit> getOnSizeChanged() {
        return this.onSizeChanged;
    }

    public final void setOnSizeChanged(Function1<? super DpSize, Unit> function1) {
        this.onSizeChanged = function1;
    }

    public final float getZoom() {
        return this.zoom;
    }

    public final void setZoom(float f2) {
        this.zoom = f2;
    }

    public final boolean getUseTextDefault() {
        return this.useTextDefault;
    }

    public final void setUseTextDefault(boolean z2) {
        this.useTextDefault = z2;
    }

    public /* synthetic */ MagnifierNode(Function1 function1, Function1 function12, Function1 function13, float f2, boolean z2, long j2, float f3, float f4, boolean z3, PlatformMagnifierFactory platformMagnifierFactory, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? null : function12, (i2 & 4) == 0 ? function13 : null, (i2 & 8) != 0 ? Float.NaN : f2, (i2 & 16) != 0 ? false : z2, (i2 + 32) - (i2 | 32) != 0 ? DpSize.Companion.m6745getUnspecifiedMYxV2XQ() : j2, (-1) - (((-1) - i2) | ((-1) - 64)) != 0 ? Dp.Companion.m6658getUnspecifiedD9Ej5fM() : f3, (i2 & 128) != 0 ? Dp.Companion.m6658getUnspecifiedD9Ej5fM() : f4, (i2 + 256) - (i2 | 256) != 0 ? true : z3, (-1) - (((-1) - i2) | ((-1) - 512)) != 0 ? PlatformMagnifierFactory.Companion.getForCurrentPlatform() : platformMagnifierFactory, null);
    }

    /* JADX INFO: renamed from: getSize-MYxV2XQ */
    public final long m633getSizeMYxV2XQ() {
        return this.size;
    }

    /* JADX INFO: renamed from: setSize-EaSLcWc */
    public final void m636setSizeEaSLcWc(long j2) {
        this.size = j2;
    }

    /* JADX INFO: renamed from: getCornerRadius-D9Ej5fM */
    public final float m631getCornerRadiusD9Ej5fM() {
        return this.cornerRadius;
    }

    /* JADX INFO: renamed from: setCornerRadius-0680j_4 */
    public final void m634setCornerRadius0680j_4(float f2) {
        this.cornerRadius = f2;
    }

    /* JADX INFO: renamed from: getElevation-D9Ej5fM */
    public final float m632getElevationD9Ej5fM() {
        return this.elevation;
    }

    /* JADX INFO: renamed from: setElevation-0680j_4 */
    public final void m635setElevation0680j_4(float f2) {
        this.elevation = f2;
    }

    public final boolean getClippingEnabled() {
        return this.clippingEnabled;
    }

    public final void setClippingEnabled(boolean z2) {
        this.clippingEnabled = z2;
    }

    public final PlatformMagnifierFactory getPlatformMagnifierFactory() {
        return this.platformMagnifierFactory;
    }

    public final void setPlatformMagnifierFactory(PlatformMagnifierFactory platformMagnifierFactory) {
        this.platformMagnifierFactory = platformMagnifierFactory;
    }

    private MagnifierNode(Function1<? super Density, Offset> function1, Function1<? super Density, Offset> function12, Function1<? super DpSize, Unit> function13, float f2, boolean z2, long j2, float f3, float f4, boolean z3, PlatformMagnifierFactory platformMagnifierFactory) {
        this.sourceCenter = function1;
        this.magnifierCenter = function12;
        this.onSizeChanged = function13;
        this.zoom = f2;
        this.useTextDefault = z2;
        this.size = j2;
        this.cornerRadius = f3;
        this.elevation = f4;
        this.clippingEnabled = z3;
        this.platformMagnifierFactory = platformMagnifierFactory;
        this.layoutCoordinates$delegate = SnapshotStateKt.mutableStateOf(null, SnapshotStateKt.neverEqualPolicy());
        this.sourceCenterInRoot = Offset.Companion.m3952getUnspecifiedF1C5BW0();
    }

    public final LayoutCoordinates getLayoutCoordinates() {
        return (LayoutCoordinates) this.layoutCoordinates$delegate.getValue();
    }

    private final void setLayoutCoordinates(LayoutCoordinates layoutCoordinates) {
        this.layoutCoordinates$delegate.setValue(layoutCoordinates);
    }

    /* JADX INFO: renamed from: getAnchorPositionInRoot-F1C5BW0 */
    private final long m630getAnchorPositionInRootF1C5BW0() {
        if (this.anchorPositionInRootState == null) {
            this.anchorPositionInRootState = SnapshotStateKt.derivedStateOf(new Function0<Offset>() { // from class: androidx.compose.foundation.MagnifierNode$anchorPositionInRoot$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Offset invoke() {
                    return Offset.m3926boximpl(m638invokeF1C5BW0());
                }

                /* JADX INFO: renamed from: invoke-F1C5BW0, reason: not valid java name */
                public final long m638invokeF1C5BW0() {
                    LayoutCoordinates layoutCoordinates = this.this$0.getLayoutCoordinates();
                    return layoutCoordinates != null ? LayoutCoordinatesKt.positionInRoot(layoutCoordinates) : Offset.Companion.m3952getUnspecifiedF1C5BW0();
                }
            });
        }
        State<Offset> state = this.anchorPositionInRootState;
        return state != null ? state.getValue().m3947unboximpl() : Offset.Companion.m3952getUnspecifiedF1C5BW0();
    }

    /* JADX INFO: renamed from: update-5F03MCQ */
    public final void m637update5F03MCQ(Function1<? super Density, Offset> function1, Function1<? super Density, Offset> function12, float f2, boolean z2, long j2, float f3, float f4, boolean z3, Function1<? super DpSize, Unit> function13, PlatformMagnifierFactory platformMagnifierFactory) {
        float f5 = this.zoom;
        long j3 = this.size;
        float f6 = this.cornerRadius;
        boolean z4 = this.useTextDefault;
        float f7 = this.elevation;
        boolean z5 = this.clippingEnabled;
        PlatformMagnifierFactory platformMagnifierFactory2 = this.platformMagnifierFactory;
        View view = this.view;
        Density density = this.density;
        this.sourceCenter = function1;
        this.magnifierCenter = function12;
        this.zoom = f2;
        this.useTextDefault = z2;
        this.size = j2;
        this.cornerRadius = f3;
        this.elevation = f4;
        this.clippingEnabled = z3;
        this.onSizeChanged = function13;
        this.platformMagnifierFactory = platformMagnifierFactory;
        MagnifierNode magnifierNode = this;
        View viewRequireView = DelegatableNode_androidKt.requireView(magnifierNode);
        Density densityRequireDensity = DelegatableNodeKt.requireDensity(magnifierNode);
        if (this.magnifier != null && ((!Magnifier_androidKt.equalsIncludingNaN(f2, f5) && !platformMagnifierFactory.getCanUpdateZoom()) || !DpSize.m6733equalsimpl0(j2, j3) || !Dp.m6643equalsimpl0(f3, f6) || !Dp.m6643equalsimpl0(f4, f7) || z2 != z4 || z3 != z5 || !Intrinsics.areEqual(platformMagnifierFactory, platformMagnifierFactory2) || !Intrinsics.areEqual(viewRequireView, view) || !Intrinsics.areEqual(densityRequireDensity, density))) {
            recreateMagnifier();
        }
        updateMagnifier();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        onObservedReadsChanged();
        this.drawSignalChannel = ChannelKt.Channel$default(0, null, null, 7, null);
        BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new C04301(null), 3, null);
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.MagnifierNode$onAttach$1 */
    /* JADX INFO: compiled from: Magnifier.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fLl\u0002\t\u0011\r\u000b\u000f\f\u001av\u0019\u000f\u0011P\u001d\u001dp%&\u0014\u0017\u001dYg", f = "\u001a-282.0+7q$0%2.'!i&.", i = {}, l = {380, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class C04301 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C04301(Continuation<? super C04301> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MagnifierNode.this.new C04301(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C04301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0019  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x003b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0039 -> B:34:0x001c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0048 -> B:31:0x0011). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r5.label
                r3 = 2
                r2 = 1
                if (r0 == 0) goto L4b
                if (r0 == r2) goto L30
                if (r0 != r3) goto L4f
                kotlin.ResultKt.throwOnFailure(r6)
            L11:
                androidx.compose.foundation.MagnifierNode r0 = androidx.compose.foundation.MagnifierNode.this
                androidx.compose.foundation.PlatformMagnifier r0 = androidx.compose.foundation.MagnifierNode.access$getMagnifier$p(r0)
                if (r0 == 0) goto L1c
                r0.updateContent()
            L1c:
                androidx.compose.foundation.MagnifierNode r0 = androidx.compose.foundation.MagnifierNode.this
                kotlinx.coroutines.channels.Channel r1 = androidx.compose.foundation.MagnifierNode.access$getDrawSignalChannel$p(r0)
                if (r1 == 0) goto L33
                r0 = r5
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                r5.label = r2
                java.lang.Object r0 = r1.receive(r0)
                if (r0 != r4) goto L33
                return r4
            L30:
                kotlin.ResultKt.throwOnFailure(r6)
            L33:
                androidx.compose.foundation.MagnifierNode r0 = androidx.compose.foundation.MagnifierNode.this
                androidx.compose.foundation.PlatformMagnifier r0 = androidx.compose.foundation.MagnifierNode.access$getMagnifier$p(r0)
                if (r0 == 0) goto L1c
                androidx.compose.foundation.MagnifierNode$onAttach$1$1 r1 = androidx.compose.foundation.MagnifierNode.C04301.C00141.INSTANCE
                kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
                r0 = r5
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                r5.label = r3
                java.lang.Object r0 = androidx.compose.runtime.MonotonicFrameClockKt.withFrameMillis(r1, r0)
                if (r0 != r4) goto L11
                return r4
            L4b:
                kotlin.ResultKt.throwOnFailure(r6)
                goto L1c
            L4f:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MagnifierNode.C04301.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.MagnifierNode$onAttach$1$1 */
        /* JADX INFO: compiled from: Magnifier.android.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,i\bӵLc\u0003\u000bIي>éFB-!\\\u0016\u0006\u0007~jg1\u000bm߬2RY,"}, d2 = {"\n`]<a@F])\rS", "", "7s", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        static final class C00141 extends Lambda implements Function1<Long, Unit> {
            public static final C00141 INSTANCE = ;

            C00141() {
            }

            public final void invoke(long j2) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l2) {
                invoke(l2.longValue());
                return Unit.INSTANCE;
            }
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        PlatformMagnifier platformMagnifier = this.magnifier;
        if (platformMagnifier != null) {
            platformMagnifier.dismiss();
        }
        this.magnifier = null;
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.MagnifierNode$onObservedReadsChanged$1 */
    /* JADX INFO: compiled from: Magnifier.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C04311 extends Lambda implements Function0<Unit> {
        C04311() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
            MagnifierNode.this.updateMagnifier();
        }
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        ObserverModifierNodeKt.observeReads(this, new Function0<Unit>() { // from class: androidx.compose.foundation.MagnifierNode.onObservedReadsChanged.1
            C04311() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2() {
                MagnifierNode.this.updateMagnifier();
            }
        });
    }

    private final void recreateMagnifier() {
        PlatformMagnifier platformMagnifier = this.magnifier;
        if (platformMagnifier != null) {
            platformMagnifier.dismiss();
        }
        View viewRequireView = this.view;
        if (viewRequireView == null) {
            viewRequireView = DelegatableNode_androidKt.requireView(this);
        }
        this.view = viewRequireView;
        Density densityRequireDensity = this.density;
        if (densityRequireDensity == null) {
            densityRequireDensity = DelegatableNodeKt.requireDensity(this);
        }
        this.density = densityRequireDensity;
        this.magnifier = this.platformMagnifierFactory.mo664createnHHXs2Y(viewRequireView, this.useTextDefault, this.size, this.cornerRadius, this.elevation, this.clippingEnabled, densityRequireDensity, this.zoom);
        updateSizeIfNecessary();
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void updateMagnifier() {
        /*
            r6 = this;
            androidx.compose.ui.unit.Density r4 = r6.density
            if (r4 != 0) goto Ld
            r0 = r6
            androidx.compose.ui.node.DelegatableNode r0 = (androidx.compose.ui.node.DelegatableNode) r0
            androidx.compose.ui.unit.Density r4 = androidx.compose.ui.node.DelegatableNodeKt.requireDensity(r0)
            r6.density = r4
        Ld:
            kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.Density, androidx.compose.ui.geometry.Offset> r0 = r6.sourceCenter
            java.lang.Object r0 = r0.invoke(r4)
            androidx.compose.ui.geometry.Offset r0 = (androidx.compose.ui.geometry.Offset) r0
            long r2 = r0.m3947unboximpl()
            boolean r0 = androidx.compose.ui.geometry.OffsetKt.m3956isSpecifiedk4lQ0M(r2)
            if (r0 == 0) goto L7c
            long r0 = r6.m630getAnchorPositionInRootF1C5BW0()
            boolean r0 = androidx.compose.ui.geometry.OffsetKt.m3956isSpecifiedk4lQ0M(r0)
            if (r0 == 0) goto L7c
            long r0 = r6.m630getAnchorPositionInRootF1C5BW0()
            long r0 = androidx.compose.ui.geometry.Offset.m3942plusMKHz9U(r0, r2)
            r6.sourceCenterInRoot = r0
            kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.Density, androidx.compose.ui.geometry.Offset> r0 = r6.magnifierCenter
            if (r0 == 0) goto L75
            java.lang.Object r0 = r0.invoke(r4)
            androidx.compose.ui.geometry.Offset r0 = (androidx.compose.ui.geometry.Offset) r0
            long r0 = r0.m3947unboximpl()
            androidx.compose.ui.geometry.Offset r2 = androidx.compose.ui.geometry.Offset.m3926boximpl(r0)
            long r0 = r2.m3947unboximpl()
            boolean r0 = androidx.compose.ui.geometry.OffsetKt.m3956isSpecifiedk4lQ0M(r0)
            if (r0 == 0) goto L73
        L4f:
            if (r2 == 0) goto L75
            long r2 = r2.m3947unboximpl()
            long r0 = r6.m630getAnchorPositionInRootF1C5BW0()
            long r3 = androidx.compose.ui.geometry.Offset.m3942plusMKHz9U(r0, r2)
        L5d:
            androidx.compose.foundation.PlatformMagnifier r0 = r6.magnifier
            if (r0 != 0) goto L64
            r6.recreateMagnifier()
        L64:
            androidx.compose.foundation.PlatformMagnifier r0 = r6.magnifier
            if (r0 == 0) goto L6f
            long r1 = r6.sourceCenterInRoot
            float r5 = r6.zoom
            r0.mo663updateWko1d7g(r1, r3, r5)
        L6f:
            r6.updateSizeIfNecessary()
            return
        L73:
            r2 = 0
            goto L4f
        L75:
            androidx.compose.ui.geometry.Offset$Companion r0 = androidx.compose.ui.geometry.Offset.Companion
            long r3 = r0.m3952getUnspecifiedF1C5BW0()
            goto L5d
        L7c:
            androidx.compose.ui.geometry.Offset$Companion r0 = androidx.compose.ui.geometry.Offset.Companion
            long r0 = r0.m3952getUnspecifiedF1C5BW0()
            r6.sourceCenterInRoot = r0
            androidx.compose.foundation.PlatformMagnifier r0 = r6.magnifier
            if (r0 == 0) goto L8b
            r0.dismiss()
        L8b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MagnifierNode.updateMagnifier():void");
    }

    private final void updateSizeIfNecessary() {
        Density density;
        PlatformMagnifier platformMagnifier = this.magnifier;
        if (platformMagnifier == null || (density = this.density) == null || IntSize.m6805equalsimpl(platformMagnifier.mo662getSizeYbymL2g(), this.previousSize)) {
            return;
        }
        Function1<? super DpSize, Unit> function1 = this.onSizeChanged;
        if (function1 != null) {
            function1.invoke(DpSize.m6724boximpl(density.mo708toDpSizekrfVVM(IntSizeKt.m6820toSizeozmzZPI(platformMagnifier.mo662getSizeYbymL2g()))));
        }
        this.previousSize = IntSize.m6800boximpl(platformMagnifier.mo662getSizeYbymL2g());
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        Channel<Unit> channel = this.drawSignalChannel;
        if (channel != null) {
            ChannelResult.m10499boximpl(channel.mo10484trySendJP2dKIU(Unit.INSTANCE));
        }
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        setLayoutCoordinates(layoutCoordinates);
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.MagnifierNode$applySemantics$1 */
    /* JADX INFO: compiled from: Magnifier.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!4i\bDJc\u0003İY\u0006^\ntJ֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "7me<^,\u00064d\\J;\u001eG", "u(9"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function0<Offset> {
        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Offset invoke() {
            return Offset.m3926boximpl(m639invokeF1C5BW0());
        }

        /* JADX INFO: renamed from: invoke-F1C5BW0 */
        public final long m639invokeF1C5BW0() {
            return MagnifierNode.this.sourceCenterInRoot;
        }
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(Magnifier_androidKt.getMagnifierPositionInRoot(), new Function0<Offset>() { // from class: androidx.compose.foundation.MagnifierNode.applySemantics.1
            AnonymousClass1() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Offset invoke() {
                return Offset.m3926boximpl(m639invokeF1C5BW0());
            }

            /* JADX INFO: renamed from: invoke-F1C5BW0 */
            public final long m639invokeF1C5BW0() {
                return MagnifierNode.this.sourceCenterInRoot;
            }
        });
    }
}
