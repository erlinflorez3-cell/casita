package androidx.compose.animation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
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
/* JADX INFO: compiled from: SharedTransitionScope.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яč\u0014D57\u001eq\u007fZDkŞ\fA\u00149\u0013.H~*,(w\u000f߿r9FDm߉6Ri*\u0017ӆ\u000442Ӌ,qI;]\u001a\u0014\"\u0011ѧVg}nRҙ\u0013C%\u0006\u001eюr,_U\u0001ز\u001a\u000fHBwЀ;M\u0006=Aś|6\u0013%:Ĳ@y\u001b\u0001\"*^\u0010~zYK\u0014\u0012F@x:X\u000eU\u00050\u0012\u000e>&\u0002&\\}N>ԟt]P/+ɅqBd'g0\u0003U\u0013,j܋=v\u0010\u001dcB:fGX\u001c\u0011\u0015Us?1C\"A\u0013m?'YO:{~k\u000e\u001b-+}\u0015\u000ev4e\u001dQ\u000f\u0016mPյgK^\u0019p\u0012\t\b%<2\u001b6-N.;(~\b<B%xY@^\u0012vB.\f(K_?\u000eEC9Iy\u0002gA\u0019\\E\u0014\u0005;-S\u0007t!id&`C,\u001b\r\u001as_TUH|\u001f\u0002=\u001c\u0019!n\b*\u0012F_\u0006?}!.E&eri)'k\u0010`\\g%\u001e\u0011\u0003Yi`bX6~\u0018G*7(jFt\u0005\u001amd\\<\u0013c\u001b\u0003%,#YD%bJ@=\u0010|d\u0011i\u0019b\u000e\u000e3O~7\bv\u001c\u0012eZv3cs\u0014\u0016gR\u00057W<\u0011\u0012\tlHS\u001a~t(PExp\u0016w\nif\fAXow\"4:X1\\Cp3$HA\u000b2wZ\u0017:/Z9$\u0011\u0015<t7\u0002\u0001bvou\u0011a,+yR3GQC3>UPlz!kS\r \u0018G\u0016aoL\u001b+&Y\nM.\u001agY_A!0\u0017)`$]KRrsve\u0012U!-\u007f\u0015;vW\u007f\b\u0019\u001b\\fpJ]\u007f/\"%_#)\u000ed\u000e\u0012yF)`\u0014Z\u0011[Lc\u000b\u0003\b@\u0015\\EQ-L=\u0001\u001e7%5[XW!$\u0018,/Ci\u000em}]\u0012b='%k\n,q;\bb\u007f\u0004bA>Ig(V\"R\u00173HNj\u00063Z\tb\u000ecNGd~nPM9H.l\r,\u001b\u000bn[h\u00176\"|8mZ\fC,)\u0007CS&\u0014w8}{Kt\u000bx\u0010`ρ}ϥr\u00164?&Vedط/ү֏\u0018:I=h$j\bԀ8`҅\f\n"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d(1f}\u001f&z\u00127[GJo>'\u0003fkD\u00079", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]/?_y#7i\u0015\u001cKMFk\n", "7rC?T5LW(\u0003\u0005g\bz\u00183v\u007f", "", "u(I", "\u001duT?_(R1 \u0003\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d(1f}\u001f&z\u00127[GJo>'\u0003fkD\u0007\"\u0016_v4NHb\ncV}\u0013", "1kX=F/:^\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "@d\\2`)>`\u0007\u0002vk,{f9n\u000f(\u0005On&\u0013Vo", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d(1f}\u001f&z\u00127[GJo>'\u0003fkD\u0007\"\u001aQr4GK,6earF#\u007fi\n]+b", "9dh", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}b<\n\u0016$Qs\rO@#?a\t*Em_;]LJo<\u001e^FkA\u0012m:N\u0004|+\u00105(eQ\u007fG\u0018\u0011mWL5\u0015\u0010cO$8@@#\u0010(X\u0006EqJy\u0019\nBjo1c\fP\b\u0019\u0005E3q4Wi\u0005G\u007f3e&q\f^zfCI$\u001d\u0001\u0007*d_._", "AbP9X\u0010GA\u001cz\b^+Z\u00138t\u007f1\u000b/\u000bs!Wx\rJ", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006V.DY\u000b\u000fDi\u001f<QR?u=s", "1n]AX5MA\u0017z\u0002^", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006T/>h})F[\u0014*TC\u0011", "/kX4a4>\\(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4\u000b", "AbP9X\u0016Nb\u0007\u0002vk,{f9n\u000f(\u0005Oo!sQ\u007f\u0017;\u0005", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006V89hl-3v$2\\GEt\n", "@d]1X9\"\\\u0007\u0002vk,{w<a\t6\u007fO\u0005! 5m\u0018Gv\u000fFY\u000b'3\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "@d]1X9\"\\\u0003\u0010zk3x\u001d", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "HH]1X?\"\\\u0003\u0010zk3x\u001d", "", "1kX=<5(d\u0019\f\u0002Z@[\u0019<i\t*jM| %K~\u0012F\u007f", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\r", "AgP?X+\u001b])\byl", "AgP?X+\u001c]\"\u000ezg;j\u0018+t\u007f", "/mX:T;>R\n\u0003\tb)\u0001\u00103t\u0014\u0016yJ\f\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006R.9ay/7l\u00072[G8o;\"$|O7\u0011n,$", "3mc2e", "3wXA", "0nd;W:-`\u0015\b\t_6\n\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006S/Eb|.&z\u00127[DEx<s", "@db6m,&]\u0018~", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d(1f}\u001f&z\u00127[GJo>'\u0003fkD\u0007\"\u0019N\u0005+\\L66[RH", ">kP0X\u000fHZ\u0018~\bL0\u0012\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d(1f}\u001f&z\u00127[GJo>'\u0003fkD\u0007\"\u0017Ur%G/X3[R\u007f+\u0018'Zc", "@d]1X9\"\\\u0003\u0010zk3x\u001d\u000eu\r,\u0005Bo$\u0013P}\u0012Kz/>", "AgP?X+\u001eZ\u0019\u0007zg;", "AsPAX", "AgP?X+\u001eZ\u0019\u0007zg;n\r>h]$\u0003G\u0001$~Cx\n>v$&]\f$4q\u001d2\\W", "Dhb6U3>", "AjX=G6%]#\u0005va,x\b\u001di\u0015(", "\u001ekP0X\u000fHZ\u0018~\bL0\u0012\t", " db6m,&]\u0018~", "!gP?X+\u001c]\"\u000ezg;j\u0018+t\u007f", "/mX:T;B]\"x\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface SharedTransitionScope extends LookaheadScope {

    /* JADX INFO: compiled from: SharedTransitionScope.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<řa\t\bّkUH|j1]N\u007fi\u0005I\t\fs\u0013\u0014\u0018\u0011jZL\u0006|k\u0016'2pto7[uU9\u000f{f\t.::8(\u000eG>ߋGƵ͏zGS\u000e\u0018OnoĖV\u0017̠\t\u0019"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d(1f}\u001f&z\u00127[GJo>'\u0003fkD\u0007\"\u0016_v4NHb\ncV}\u0013", "", "5dc\u0010_0I>\u0015\u000e}", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\r", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d(1f}\u001f&z\u00127[GJo>'\u0003fkD\u0007\"\u001aQr4GK,6earF#\u007fi\n]+b", "0nd;W:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "/mX:T;B]\"x\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface OverlayClip {
        Path getClipPath(SharedContentState sharedContentState, Rect rect, LayoutDirection layoutDirection, Density density);
    }

    OverlayClip OverlayClip(Shape shape);

    boolean isTransitionActive();

    SharedContentState rememberSharedContentState(Object obj, Composer composer, int i2);

    Modifier renderInSharedTransitionScopeOverlay(Modifier modifier, Function0<Boolean> function0, float f2, Function2<? super LayoutDirection, ? super Density, ? extends Path> function2);

    Modifier sharedBounds(Modifier modifier, SharedContentState sharedContentState, AnimatedVisibilityScope animatedVisibilityScope, EnterTransition enterTransition, ExitTransition exitTransition, BoundsTransform boundsTransform, ResizeMode resizeMode, PlaceHolderSize placeHolderSize, boolean z2, float f2, OverlayClip overlayClip);

    Modifier sharedElement(Modifier modifier, SharedContentState sharedContentState, AnimatedVisibilityScope animatedVisibilityScope, BoundsTransform boundsTransform, PlaceHolderSize placeHolderSize, boolean z2, float f2, OverlayClip overlayClip);

    Modifier sharedElementWithCallerManagedVisibility(Modifier modifier, SharedContentState sharedContentState, boolean z2, BoundsTransform boundsTransform, PlaceHolderSize placeHolderSize, boolean z3, float f2, OverlayClip overlayClip);

    Modifier skipToLookaheadSize(Modifier modifier);

    /* JADX INFO: compiled from: SharedTransitionScope.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4F\u0005Փܦ\u0011\u000eј\u0005pi0rd\u0001-X\u001cJ\u001dk\u00144R\\TuQ=m\u001a,#9S\\j\u007fnx[Qgȝ\u0005ǝѱn.OY\u0007bށ\u000e1ԒoJ;PuޫU\u000fs>\u0007&QP7ѯ\t\bʞ.G"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d(1f}\u001f&z\u00127[GJo>'\u0003fkD\u0007\"\u0017Ur%G/X3[R\u007f+\u0018'Zc", "", "1`[0h3:b\u0019l~s,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "1n]AX5MA\u001d\u0014z", "/mX:T;>R\u0007\u0003\u0010^", "1`[0h3:b\u0019l~s,DmCjl\u0018u ", "uI9u=", "\u0011n\\=T5B]\"", "/mX:T;B]\"x\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface PlaceHolderSize {
        public static final Companion Companion = Companion.$$INSTANCE;

        /* JADX INFO: renamed from: calculateSize-JyjRU_E, reason: not valid java name */
        long mo445calculateSizeJyjRU_E(long j2, long j3);

        /* JADX INFO: compiled from: SharedTransitionScope.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005%2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00053i%\nCiW۟\u0002(\u0011ѧfimqX^[R\u001d\u000b.x\u0019.֒Y~e܈'4HuM7ޢsD"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d(1f}\u001f&z\u00127[GJo>'\u0003fkD\u0007\"\u0017Ur%G/X3[R\u007f+\u0018'ZL,5\u0015\u0010UJ(xM\r", "", "u(E", "/mX:T;>R\u0007\u0003\u0010^", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d(1f}\u001f&z\u00127[GJo>'\u0003fkD\u0007\"\u0017Ur%G/X3[R\u007f+\u0018'Zc", "5dc\u000ea0FO(~yL0\u0012\t", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn#\\y-7l\u0005;ILIoC\"\u001fqO7\u0011n,\ra.CJN\u000ffYq=!\u007f^#N\u0001", "1n]AX5MA\u001d\u0014z", "5dc\u0010b5MS\"\u000ehbA|", "/mX:T;B]\"x\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            private static final PlaceHolderSize animatedSize = new PlaceHolderSize() { // from class: androidx.compose.animation.SharedTransitionScope$PlaceHolderSize$Companion$animatedSize$1
                @Override // androidx.compose.animation.SharedTransitionScope.PlaceHolderSize
                /* JADX INFO: renamed from: calculateSize-JyjRU_E */
                public final long mo445calculateSizeJyjRU_E(long j2, long j3) {
                    return j3;
                }
            };
            private static final PlaceHolderSize contentSize = new PlaceHolderSize() { // from class: androidx.compose.animation.SharedTransitionScope$PlaceHolderSize$Companion$contentSize$1
                @Override // androidx.compose.animation.SharedTransitionScope.PlaceHolderSize
                /* JADX INFO: renamed from: calculateSize-JyjRU_E */
                public final long mo445calculateSizeJyjRU_E(long j2, long j3) {
                    return j2;
                }
            };

            private Companion() {
            }

            public final PlaceHolderSize getAnimatedSize() {
                return animatedSize;
            }

            public final PlaceHolderSize getContentSize() {
                return contentSize;
            }
        }
    }

    /* JADX INFO: compiled from: SharedTransitionScope.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000bDB\u0007Ӭ2\u0007\u000eј\u0005ji0rd\u0001-Rݺ)\u000fl}Ţ#ӋҘqGCW \u001dP\bҐRj̨rI"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d(1f}\u001f&z\u00127[GJo>'\u0003fkD\u0007\"\u0019N\u0005+\\L66[RH", "", "\u0011n\\=T5B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006c%=Yy.Gz\u0016\u0012UNBA", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d#1`}\u000fAJ >VBIO<)\u001c>", "/mX:T;B]\"x\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface ResizeMode {
        public static final Companion Companion = Companion.$$INSTANCE;

        /* JADX INFO: compiled from: SharedTransitionScope.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005$4\u0012\u000e\u0007nʑA0ZeP\u008cXݾ+%ӆ,4RZdvI;ڈ\u001e}0\t\u0018ful\u0007J\t\rs\u0015\f\u0016\u0007pDI\u0004\u007f\u000e\u0018\u00152PwW3{x\u000eHnuN\u0005N4ŕ<\u007f\rЏ2,N\u0013\u0005~ŸO\u0016"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d(1f}\u001f&z\u00127[GJo>'\u0003fkD\u0007\"\u0019N\u0005+\\L66[R1\u001b\u001e\u001ae\nW/\u0017\u000e/", "", "u(E", " d\\2T:N`\u0019m\u0005;6\r\u0012.s", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d(1f}\u001f&z\u00127[GJo>'\u0003fkD\u0007\"\u0019N\u0005+\\L66[RH", "5dc\u001fX4>O'\u000f\b^\u001b\u0007e9u\t'\n", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn#\\y-7l\u0005;ILIoC\"\u001fqO7\u0011n,\rc'UPc,D\\q=i", "!bP9X\u001bH0#\u000f\u0004]:", "1n]AX5MA\u0017z\u0002^", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006T/>h})F[\u0014*TC\u0011", "/kX4a4>\\(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4\u000b", "/mX:T;B]\"x\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            private static final ResizeMode RemeasureToBounds = RemeasureImpl.INSTANCE;

            private Companion() {
            }

            public final ResizeMode getRemeasureToBounds() {
                return RemeasureToBounds;
            }

            public static /* synthetic */ ResizeMode ScaleToBounds$default(Companion companion, ContentScale contentScale, Alignment alignment, int i2, Object obj) {
                if ((i2 + 1) - (1 | i2) != 0) {
                    contentScale = ContentScale.Companion.getFillWidth();
                }
                if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
                    alignment = Alignment.Companion.getCenter();
                }
                return companion.ScaleToBounds(contentScale, alignment);
            }

            public final ResizeMode ScaleToBounds(ContentScale contentScale, Alignment alignment) {
                return SharedTransitionScopeKt.ScaleToBoundsCached(contentScale, alignment);
            }
        }
    }

    static /* synthetic */ EnterTransition scaleInSharedContentToBounds$default(SharedTransitionScope sharedTransitionScope, ContentScale contentScale, Alignment alignment, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scaleInSharedContentToBounds");
        }
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            contentScale = ContentScale.Companion.getFit();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            alignment = Alignment.Companion.getCenter();
        }
        return sharedTransitionScope.scaleInSharedContentToBounds(contentScale, alignment);
    }

    @Deprecated(message = "\u0017N\u0005H1Y#k]Y\u001c\rQ#?WpU\u00185Dp\re6Hso\\4(kx^iENpm=\u0014]#F\u0017W_~ajMKq?7\u0017K[\u001cIZ\fG\u0003y\u0011/N%_\u0006;o'\u001b\u0005b\u0015,\nE3g\u000e\u0013b>T(so/W1Y\u001e*\u0012bbX\u0007\u001bQ)-}Jm{)+E\u001derY5/\u000fMA.&c;!\u0005\u001b\tnxs\u001d\u0004jZ\u000b+'GL\f!~\u0006Y,-\u000e(uPee1 <")
    @InterfaceC1492Gx
    default EnterTransition scaleInSharedContentToBounds(ContentScale contentScale, Alignment alignment) {
        return EnterExitTransitionKt.withEffect(EnterTransition.Companion.getNone(), new ContentScaleTransitionEffect(contentScale, alignment));
    }

    static /* synthetic */ ExitTransition scaleOutSharedContentToBounds$default(SharedTransitionScope sharedTransitionScope, ContentScale contentScale, Alignment alignment, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scaleOutSharedContentToBounds");
        }
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            contentScale = ContentScale.Companion.getFit();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            alignment = Alignment.Companion.getCenter();
        }
        return sharedTransitionScope.scaleOutSharedContentToBounds(contentScale, alignment);
    }

    @Deprecated(message = "\u0017N\u0005H1Y-`l;:{^(5be[\u0017f\ri\u001f\u0012xKsx\u000ex)vzQgCaal\u0007\u0006]#F\u0017W_~ajMKq?7\u0017K[\u001cIZ\fG\u0003y\u0011/N%_\u0006;o'\u001b\u0005b\u0015,\nE3g\u000e\u0013b>T(so/W1Y\u001e*\u0012bbX\u0007\u001bQ)-}Jm{)+E\u001derY5/\u000fMA.&c;!\u0005\u001b\tnxs\u001d\u0004jZ\u000b+'GL\f!~\u0006Y,-\u000e(uPee1 <")
    @InterfaceC1492Gx
    default ExitTransition scaleOutSharedContentToBounds(ContentScale contentScale, Alignment alignment) {
        return EnterExitTransitionKt.withEffect(ExitTransition.Companion.getNone(), new ContentScaleTransitionEffect(contentScale, alignment));
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Modifier renderInSharedTransitionScopeOverlay$default(SharedTransitionScope sharedTransitionScope, Modifier modifier, Function0 function0, float f2, Function2 function2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderInSharedTransitionScopeOverlay");
        }
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            function0 = new Function0<Boolean>() { // from class: androidx.compose.animation.SharedTransitionScope.renderInSharedTransitionScopeOverlay.1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    return Boolean.valueOf(SharedTransitionScope.this.isTransitionActive());
                }
            };
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            f2 = 0.0f;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            function2 = SharedTransitionScopeKt.DefaultClipInOverlayDuringTransition;
        }
        return sharedTransitionScope.renderInSharedTransitionScopeOverlay(modifier, function0, f2, function2);
    }

    static /* synthetic */ Modifier sharedElement$default(SharedTransitionScope sharedTransitionScope, Modifier modifier, SharedContentState sharedContentState, AnimatedVisibilityScope animatedVisibilityScope, BoundsTransform boundsTransform, PlaceHolderSize placeHolderSize, boolean z2, float f2, OverlayClip overlayClip, int i2, Object obj) {
        if (obj == null) {
            if ((4 & i2) != 0) {
                boundsTransform = SharedTransitionScopeKt.DefaultBoundsTransform;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
                placeHolderSize = PlaceHolderSize.Companion.getContentSize();
            }
            if ((-1) - (((-1) - i2) | ((-1) - 16)) != 0) {
                z2 = true;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 32)) != 0) {
                f2 = 0.0f;
            }
            if ((i2 + 64) - (i2 | 64) != 0) {
                overlayClip = SharedTransitionScopeKt.ParentClip;
            }
            return sharedTransitionScope.sharedElement(modifier, sharedContentState, animatedVisibilityScope, boundsTransform, placeHolderSize, z2, f2, overlayClip);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sharedElement");
    }

    static /* synthetic */ Modifier sharedBounds$default(SharedTransitionScope sharedTransitionScope, Modifier modifier, SharedContentState sharedContentState, AnimatedVisibilityScope animatedVisibilityScope, EnterTransition enterTransition, ExitTransition exitTransition, BoundsTransform boundsTransform, ResizeMode resizeMode, PlaceHolderSize placeHolderSize, boolean z2, float f2, OverlayClip overlayClip, int i2, Object obj) {
        boolean z3 = z2;
        PlaceHolderSize contentSize = placeHolderSize;
        ResizeMode resizeModeScaleToBounds = resizeMode;
        BoundsTransform boundsTransform2 = boundsTransform;
        OverlayClip overlayClip2 = overlayClip;
        ExitTransition exitTransitionFadeOut$default = exitTransition;
        EnterTransition enterTransitionFadeIn$default = enterTransition;
        if (obj == null) {
            if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
                enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null);
            }
            if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
                exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null);
            }
            if ((i2 & 16) != 0) {
                boundsTransform2 = SharedTransitionScopeKt.DefaultBoundsTransform;
            }
            if ((i2 & 32) != 0) {
                resizeModeScaleToBounds = ResizeMode.Companion.ScaleToBounds(ContentScale.Companion.getFillWidth(), Alignment.Companion.getCenter());
            }
            if ((-1) - (((-1) - i2) | ((-1) - 64)) != 0) {
                contentSize = PlaceHolderSize.Companion.getContentSize();
            }
            if ((i2 + 128) - (i2 | 128) != 0) {
                z3 = true;
            }
            float f3 = (i2 & 256) == 0 ? f2 : 0.0f;
            if ((-1) - (((-1) - i2) | ((-1) - 512)) != 0) {
                overlayClip2 = SharedTransitionScopeKt.ParentClip;
            }
            return sharedTransitionScope.sharedBounds(modifier, sharedContentState, animatedVisibilityScope, enterTransitionFadeIn$default, exitTransitionFadeOut$default, boundsTransform2, resizeModeScaleToBounds, contentSize, z3, f3, overlayClip2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sharedBounds");
    }

    static /* synthetic */ Modifier sharedElementWithCallerManagedVisibility$default(SharedTransitionScope sharedTransitionScope, Modifier modifier, SharedContentState sharedContentState, boolean z2, BoundsTransform boundsTransform, PlaceHolderSize placeHolderSize, boolean z3, float f2, OverlayClip overlayClip, int i2, Object obj) {
        if (obj == null) {
            if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
                boundsTransform = SharedTransitionScopeKt.DefaultBoundsTransform;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
                placeHolderSize = PlaceHolderSize.Companion.getContentSize();
            }
            if ((-1) - (((-1) - i2) | ((-1) - 16)) != 0) {
                z3 = true;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 32)) != 0) {
                f2 = 0.0f;
            }
            if ((i2 & 64) != 0) {
                overlayClip = SharedTransitionScopeKt.ParentClip;
            }
            return sharedTransitionScope.sharedElementWithCallerManagedVisibility(modifier, sharedContentState, z2, boundsTransform, placeHolderSize, z3, f2, overlayClip);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sharedElementWithCallerManagedVisibility");
    }

    /* JADX INFO: compiled from: SharedTransitionScope.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000eӵLcz\u0005I\u0006F\u000b6B\u0005#4\u0012\u000e\u0007nj?6LeV7ZS0\u0016q\u0001Jř\f$ B{b Ԃ2\r]N\u007fg\u001dIҼ\u000fC\u001d\u0007f\nx.aW\u000f\\@\u0012h\u0007ņC7eqC=ny\u00072.:::\u0010\u0004/!ZN\u001e|\u0013Ea\u000b@7v/x\u0011cˠķ\u001aŪ\nN(\u0003$iu\\NJrfH9C\u0005oM\\30?\u000b\\%F\u00037C;Ґ\"/X9;$3dS\u0016`[W\u0003mpݘ\tn/ݐCKyiDkP&#?g\r\fy\\\u001d[ĬbВ+/geQe\u001c2H\f\n#T\u0006$\u0005UΞdqբj\f&5z\naXй\u0006w"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d(1f}\u001f&z\u00127[GJo>'\u0003fkD\u0007\"\u001aQr4GK,6earF#\u007fi\n]+b", "", "9dh", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "1kX=C(MV|\bdo,\n\u0010+y", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\r", "5dc\u0010_0I>\u0015\u000e}B5f\u001a/r\u0007$\u0010", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#h\u001cFpk", "\nrTA \u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d(1f}\u001f\u0017t\u00166MLJO=-\u0015uj5\u000eQ;J\u0006'\u001d", "7mc2e5:Z\u0007\u000evm,", "5dc\u0016a;>`\"z\u0002L;x\u0018/${1\u007fH|&\u001bQx\bIv,5U\f ", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn#\\y-7lu5MK;tC\u0002\u001ewaF\u0010_3<\u0006#VL$", "Adc\u0016a;>`\"z\u0002L;x\u0018/${1\u007fH|&\u001bQx\bIv,5U\f ", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@\u00138U\u000b 6M\u001d.UCDz\u0018'$hnB\u0003j\u001a]r6G\"\u0012\u001d", "7mc2e5:Z\u0007\u000evm,;\b/l\u007f*wO\u0001", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "7r<.g*A4#\u000f\u0004]", "", "u(I", "5dc\u0018X@", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "<n]\u001bh3E7\"\u000ezk5x\u0010\u001dt{7{", "5dc\u001bb5'c \u0006^g;|\u00168a\u0007\u0016\u000b<\u0010\u0017", ">`a2a;,V\u0015\fz]\n\u0007\u0012>e\t7iO|&\u0017", "5dc\u001dT9>\\(l}Z9|\b\ro\t7{I\u0010\u0005&C~\u000e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn#\\y-7l\u0005;ILIoC\"\u001fqO7\u0011n,\rd*CYN+:\\{L\u0014\u001bi{]'\u001c\u0005/", "/mX:T;B]\"x\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class SharedContentState {
        public static final int $stable = 8;
        private final MutableState internalState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        private final Object key;

        public SharedContentState(Object obj) {
            this.key = obj;
        }

        public final Object getKey() {
            return this.key;
        }

        public final boolean isMatchFound() {
            SharedElement sharedElement;
            SharedElementInternalState internalState$animation_release = getInternalState$animation_release();
            if (internalState$animation_release == null || (sharedElement = internalState$animation_release.getSharedElement()) == null) {
                return false;
            }
            return sharedElement.getFoundMatch();
        }

        public final Path getClipPathInOverlay() {
            return getNonNullInternalState().getClipPathInOverlay$animation_release();
        }

        public final SharedContentState getParentSharedContentState() {
            SharedElementInternalState parentState = getNonNullInternalState().getParentState();
            if (parentState != null) {
                return parentState.getUserState();
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final SharedElementInternalState getInternalState$animation_release() {
            return (SharedElementInternalState) this.internalState$delegate.getValue();
        }

        public final void setInternalState$animation_release(SharedElementInternalState sharedElementInternalState) {
            this.internalState$delegate.setValue(sharedElementInternalState);
        }

        private final SharedElementInternalState getNonNullInternalState() {
            SharedElementInternalState internalState$animation_release = getInternalState$animation_release();
            if (internalState$animation_release != null) {
                return internalState$animation_release;
            }
            throw new IllegalArgumentException("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not bee initialized.".toString());
        }
    }
}
