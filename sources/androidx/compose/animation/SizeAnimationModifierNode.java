package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: compiled from: AnimationModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯZ\u001d<K!&i\u0016DLш|\u0004W\u00068\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP.hS2\u000fq|<$i$yCAY\"}8\tWNmuvJp\u000bK\u000f\f\u0019\u0001j:R]xc\u001b\u00172XoG3coEʠhtL\u0005(2(;\u007f\u0005\u0017ɝZH>u3B\bLi@J~:j\u0013]\u0007*\u00124@N\u0002.bmNDK\u0005]h33;oB\\,wb\r^\u001dU\u0003)˼zk$2P=;\u001d5U\t\rxdO\u0014O\u0001k\u0007ص+11P\u0004]<`\u0010\u0016\u001b1u\u0017mt6\\3\\v\u000bU1յgK^\u001ap\u000e\t'%<2\u00106+VZE\u001a\u0015\nս2οɤWBV/lpH\u0001oe/%.>qMcl_\u0012S\u0019|BB\u0019U612\u0007!\nw>d#Mlw\u007fT\u0018@عGݐ̆]?s7~\u0011JN\u0012d_\u007f]19.E[g_GZ9k0\u0001tk\u0005>xh\u0002\r\u0019\\ڐ!Âގ;,\u000fFh\u007f5\u001dySlXZ\u0015$Ƀ`Θ\u0002\u0014\u001b\u05fetyB.3\u001enQnxx].73B~9om\u001a \b?lDMSy\u000f\u0010d-X}\u00019ں֩f͞W\u001cb^.:@a\u0003\u0012}\u0010Rc,\u00158U\u007f3\u0005J?\u0019t\u001bX\u0005.Bo~7`1ӗ\u001cњX?,Ѱ\u0002&z#\u000fk|ru\u0004\u0007f|Gn'EsaF)5\u0004$מ8\u0007)\u000e\u000fy\u0006OwNMR\u0013\u001f\u0006f\f/D\u001c\u07fcU9C\u001a\u001f\u0005/:\u0012/KR\u0019oaO\"')\b\u0010\u000ein\u0005ԝ\u0014ϡt8hʄbQZ50\u0016~t)(r!J\u0006T\u001f_c\u0003.\fBW\u0015\u001bYjqv=[ȗ*ߋ\u007fǻޫ{4ԩG/%\u0016\u0006;O\u0017g\u0003w\u0016~\u0006p7>t\u0014-\u0003Ϧ\"̔fQeЦ\fLW\u0004\u0017>P&CÚNَi̫\u06ddA\bΌ\u00115PAr\u0018ތ8V\u00132\u0004֧#Z\fxVaYݍs;"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d)JYY);u\u0012=QMDS>\u001d\u0019ie9\u0014L6Mv|", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006]!Ic\u000e/\u001fw\u00152NG;x\u001d(\u0014hS=\u0016f\u0017J\u000556O[6lTu!\u001d!g\u0012W9\u0011\u0003g\u0017", "/mX:T;B]\"l\u0006^*", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\")\u0015f7", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "/kX4a4>\\(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4\u000b", ":hbAX5>`", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "AsP?g\u001aBh\u0019", "3mS \\A>", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u0013v\u001a6IR?u=\f h_\u000fm_5M\u00041KKauZ\\zH\u001e ZW^/V``E&wL7(\u0017\u00020\bEw\b\u0010\u001fW:{x\fW Pw$yK2v\u0010:o\u0003EPIl31a#\u000e", "5dc\u000e_0@\\!~\u0004m", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`rNs\u0010E~%>hS", "Adc\u000e_0@\\!~\u0004m", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJr\u001eKq\u0017Dv.D/A\u0011", "\nrTA \u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d)JYY);u\u0012=QMDS>\u001d\u0019ie9\u0014L6Mve#UR4;N\u00029i", "/mX:7(MO", "5dc\u000ea0F2\u0015\u000ev", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn#]\u0013 \u0013v\u001a6IR?u=\u0006\u001fge:\u000bc97\u0001&G\u000b*5`ZQ9#\u000e0", "Adc\u000ea0F2\u0015\u000ev", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@\u00139n}{@q\u001e*\\GEt\u001c(\u0014lb=\u0007p\u0015Xu'\u0006(W0d1nL\u0010g\u001e~", "/mX:7(MOW}ze,~\u0005>e", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "5dc\u000ea0FO(\u0003\u0005g\u001a\b\t-", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001I\u001f2U?Jo>'\u0003sa7\\", "Adc\u000ea0FO(\u0003\u0005g\u001a\b\t-", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u0013v\u001a6IR?u=\f h_\u000fJT", "5dc\u0019\\:MS\"~\b", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bJu", "Adc\u0019\\:MS\"~\b", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&Sc(", "D`[BX", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ":n^8T/>O\u0018\\\u0005g:\f\u0016+i\t7\n", "Adc\u0019b6DO\u001c~v]\n\u0007\u0012=t\r$\u007fI\u0010%^$\\|I\u000b/\u007f", "uI\u0018#", "\u0018", ":n^8T/>O\u0018\\\u0005g:\f\u0016+i\t7\n\u001c\u0012\u0013\u001bNk\u000bCv", "", ":n^8T/>O\u0018l~s,", "/mX:T;>B#", "B`a4X;,W.~", "/mX:T;>B#F\u0003s\u0019[\u000e\u000f0", "uI\u0018\u0017", "=m0Ag(<V", "=mA2f,M", "B`a4X;\u001c]\"\r\nk(\u0001\u0012>s", "2dU.h3M", "B`a4X;\u001c]\"\r\nk(\u0001\u0012>sG\u001d{Ui\u0001e/", ";dP@h9>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7[\u00148XC\u0011", ";dP@h9:P ~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-3j\u001d.#", "1n]@g9:W\"\u000e\t", ";dP@h9>\u001bf\nGl~G\u0017", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\r5U\f0Dm\u0004,WN;A\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001c\u0003A]\u0019V\"X;\u001cNAA |TD\u001b\u00053IW ,g\b\u001f\rBttAiYE\u0004\u001d\u0001K7h\u0010icCN=Yl:sUG\u001dXHJ1\u0014^\u0019)xW=_", "\u000fmX:7(MO", "/mX:T;B]\"x\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class SizeAnimationModifierNode extends LayoutModifierNodeWithPassThroughIntrinsics {
    private Alignment alignment;
    private final MutableState animData$delegate;
    private AnimationSpec<IntSize> animationSpec;
    private Function2<? super IntSize, ? super IntSize, Unit> listener;
    private long lookaheadConstraints;
    private boolean lookaheadConstraintsAvailable;
    private long lookaheadSize;

    public final AnimationSpec<IntSize> getAnimationSpec() {
        return this.animationSpec;
    }

    public final void setAnimationSpec(AnimationSpec<IntSize> animationSpec) {
        this.animationSpec = animationSpec;
    }

    public /* synthetic */ SizeAnimationModifierNode(AnimationSpec animationSpec, Alignment alignment, Function2 function2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(animationSpec, (2 & i2) != 0 ? Alignment.Companion.getTopStart() : alignment, (i2 & 4) != 0 ? null : function2);
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    public final Function2<IntSize, IntSize, Unit> getListener() {
        return this.listener;
    }

    public final void setListener(Function2<? super IntSize, ? super IntSize, Unit> function2) {
        this.listener = function2;
    }

    public SizeAnimationModifierNode(AnimationSpec<IntSize> animationSpec, Alignment alignment, Function2<? super IntSize, ? super IntSize, Unit> function2) {
        this.animationSpec = animationSpec;
        this.alignment = alignment;
        this.listener = function2;
        this.lookaheadSize = AnimationModifierKt.getInvalidSize();
        this.lookaheadConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
        this.animData$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    /* JADX INFO: renamed from: setLookaheadConstraints-BRTryo0, reason: not valid java name */
    private final void m452setLookaheadConstraintsBRTryo0(long j2) {
        this.lookaheadConstraints = j2;
        this.lookaheadConstraintsAvailable = true;
    }

    /* JADX INFO: renamed from: targetConstraints-ZezNO4M, reason: not valid java name */
    private final long m453targetConstraintsZezNO4M(long j2) {
        return this.lookaheadConstraintsAvailable ? this.lookaheadConstraints : j2;
    }

    /* JADX INFO: compiled from: AnimationModifier.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000bDB\u0007\"B\u0012\u007f\u0007lxA0RnP.XS2\u000fy\u0002<řc$\u007fOC٥ Ԋ(\u001fѧ~g\u0016m\u000by\u001bS\u001d\u0006.\u0005z.YU'_\"\u0011BB\u001eBaN\u007fAGd\r63\"ݨ&8\b\nI-8U(\u0003\u000bE[\f@2PrJR;P3\u001bXĦ?h\u0015,j\u007fNdJ3Ӟ;Ȼ\"\u0002\u07bcA÷Ϯc2\u0003\\\u001bO\u001dX\u001b\u0007y\u001eY¨gG\u001b%a\u0003\u001f^kA\u0013? ?\u0015j7'YL\"Xf^\u0006\u0014#/g\r\ftlٟ\u0004Ƣ_ϯˏ/Qi\\^ p\t\t\u000f%<2\"6-VCE\u001c|\u0007<2;ʘT\tW\u0010tZ\u007f)x|Ѥ$H:9Q3f\u007fz\u0002СM\b\u0017\u0013\r6/\u0011p1[\u0003\u0010p\u0017+T&T_R͘ANVˣq?s\n~iRJ\u00124_\u007f]}gы#ğ6ك߶\" Ƞ\u0006VLg\u0005\u0011xjYq`Q`$t E5¡\fcLg\u000bߺl\u0003W4\u0011S;Ϊ\u000b\u0018"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d)JYY);u\u0012=QMDS>\u001d\u0019ie9\u0014L6Mve#UR4;N\u00029i", "", "/mX:", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\?8r4s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkFSB\u0002", "AsP?g\u001aBh\u0019", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u0013v\u001a6IR7h;\u001ejMH?\u0011r3R\u007fpL]Vu`[\u0002=!\u001bV\u0015\u0018\n\r\u0006UQ+}\"A(\u0016;V\u00129w\u000b\u0019}\nBppO,S8", "5dc\u000ea0F", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001I\u001f2U?Jg1%\u0015>", "5dc g(Kb\u0007\u0003\u0010^sp\u0006Cmft}", "u(9", "Adc g(Kb\u0007\u0003\u0010^s\u0007\u001e7zt\u0013_", "uI\u0018#", "\u0018", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(KBR)\u0011\u0011\u00162\u0002", "1n_F", "1n_F \u0016\tY\u0001\ft\\", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u0013v\u001a6IR7h;\u001ejM% \u0003l+[\u0001+F_\u0018*fZ}G\"\u0012$\nW/\u0015\u0001hE.w\u000e%#\u001d,%\u000b?p|\u001b\u001a\u0018>RzAZ\u0011Ky\"^K(h\u00055h}O Aq&:", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "/mX:T;B]\"x\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AnimData {
        public static final int $stable = 8;
        private final Animatable<IntSize, AnimationVector2D> anim;
        private long startSize;

        public /* synthetic */ AnimData(Animatable animatable, long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(animatable, j2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: copy-O0kMr_c$default, reason: not valid java name */
        public static /* synthetic */ AnimData m455copyO0kMr_c$default(AnimData animData, Animatable animatable, long j2, int i2, Object obj) {
            if ((1 & i2) != 0) {
                animatable = animData.anim;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
                j2 = animData.startSize;
            }
            return animData.m457copyO0kMr_c(animatable, j2);
        }

        public final Animatable<IntSize, AnimationVector2D> component1() {
            return this.anim;
        }

        /* JADX INFO: renamed from: component2-YbymL2g, reason: not valid java name */
        public final long m456component2YbymL2g() {
            return this.startSize;
        }

        /* JADX INFO: renamed from: copy-O0kMr_c, reason: not valid java name */
        public final AnimData m457copyO0kMr_c(Animatable<IntSize, AnimationVector2D> animatable, long j2) {
            return new AnimData(animatable, j2, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnimData)) {
                return false;
            }
            AnimData animData = (AnimData) obj;
            return Intrinsics.areEqual(this.anim, animData.anim) && IntSize.m6806equalsimpl0(this.startSize, animData.startSize);
        }

        public int hashCode() {
            return (this.anim.hashCode() * 31) + IntSize.m6809hashCodeimpl(this.startSize);
        }

        public String toString() {
            return "AnimData(anim=" + this.anim + ", startSize=" + ((Object) IntSize.m6811toStringimpl(this.startSize)) + ')';
        }

        private AnimData(Animatable<IntSize, AnimationVector2D> animatable, long j2) {
            this.anim = animatable;
            this.startSize = j2;
        }

        public final Animatable<IntSize, AnimationVector2D> getAnim() {
            return this.anim;
        }

        /* JADX INFO: renamed from: getStartSize-YbymL2g, reason: not valid java name */
        public final long m458getStartSizeYbymL2g() {
            return this.startSize;
        }

        /* JADX INFO: renamed from: setStartSize-ozmzZPI, reason: not valid java name */
        public final void m459setStartSizeozmzZPI(long j2) {
            this.startSize = j2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AnimData getAnimData() {
        return (AnimData) this.animData$delegate.getValue();
    }

    public final void setAnimData(AnimData animData) {
        this.animData$delegate.setValue(animData);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onReset() {
        super.onReset();
        setAnimData(null);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        super.onAttach();
        this.lookaheadSize = AnimationModifierKt.getInvalidSize();
        this.lookaheadConstraintsAvailable = false;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo428measure3p2s80s(final MeasureScope measureScope, Measurable measurable, long j2) {
        final Placeable placeableMo5514measureBRTryo0;
        long jM6605constrain4WqzIAM;
        if (measureScope.isLookingAhead()) {
            m452setLookaheadConstraintsBRTryo0(j2);
            placeableMo5514measureBRTryo0 = measurable.mo5514measureBRTryo0(j2);
        } else {
            placeableMo5514measureBRTryo0 = measurable.mo5514measureBRTryo0(m453targetConstraintsZezNO4M(j2));
        }
        final long jIntSize = IntSizeKt.IntSize(placeableMo5514measureBRTryo0.getWidth(), placeableMo5514measureBRTryo0.getHeight());
        if (measureScope.isLookingAhead()) {
            this.lookaheadSize = jIntSize;
            jM6605constrain4WqzIAM = jIntSize;
        } else {
            jM6605constrain4WqzIAM = ConstraintsKt.m6605constrain4WqzIAM(j2, m454animateTomzRDjE0(AnimationModifierKt.m405isValidozmzZPI(this.lookaheadSize) ? this.lookaheadSize : jIntSize));
        }
        final int iM6808getWidthimpl = IntSize.m6808getWidthimpl(jM6605constrain4WqzIAM);
        final int iM6807getHeightimpl = IntSize.m6807getHeightimpl(jM6605constrain4WqzIAM);
        return MeasureScope.layout$default(measureScope, iM6808getWidthimpl, iM6807getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.SizeAnimationModifierNode$measure$2
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
                Placeable.PlacementScope.m5578place70tqf50$default(placementScope, placeableMo5514measureBRTryo0, this.this$0.getAlignment().mo3783alignKFBX0sM(jIntSize, IntSizeKt.IntSize(iM6808getWidthimpl, iM6807getHeightimpl), measureScope.getLayoutDirection()), 0.0f, 2, null);
            }
        }, 4, null);
    }

    /* JADX INFO: renamed from: animateTo-mzRDjE0, reason: not valid java name */
    public final long m454animateTomzRDjE0(long j2) {
        AnimData animData = getAnimData();
        if (animData != null) {
            boolean z2 = (IntSize.m6806equalsimpl0(j2, animData.getAnim().getValue().m6812unboximpl()) || animData.getAnim().isRunning()) ? false : true;
            if (!IntSize.m6806equalsimpl0(j2, animData.getAnim().getTargetValue().m6812unboximpl()) || z2) {
                animData.m459setStartSizeozmzZPI(animData.getAnim().getValue().m6812unboximpl());
                BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new SizeAnimationModifierNode$animateTo$data$1$1(animData, j2, this, null), 3, null);
            }
        } else {
            animData = new AnimData(new Animatable(IntSize.m6800boximpl(j2), VectorConvertersKt.getVectorConverter(IntSize.Companion), IntSize.m6800boximpl(IntSizeKt.IntSize(1, 1)), null, 8, null), j2, null);
        }
        setAnimData(animData);
        return animData.getAnim().getValue().m6812unboximpl();
    }
}
