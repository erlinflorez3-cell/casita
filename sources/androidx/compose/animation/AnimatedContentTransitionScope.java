package androidx.compose.animation;

import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: AnimatedContent.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯZ\u001d<K!&˛\bDZc|İI\u0006F\u000b6B\u0005#4\u0012\u000e\u0007njO0LeN/ZS@\u000fsڔ<$q$yّCU0}*\teNo˧vJp\u000bK\u000f\u0014\u001c\u0001jBI]xc\u0019\u00172XoG\u074cUoS9hҚ>\u000562*\u0600\u007fy\u0017ɝRJ\u0016͌\tB{\u0012\"2Pp\u0001Q;M=\u00193N\f.\u000b6\\\u0016YfLziR/Q\u0010\u001aNT'm>\u0015S\u001dHd';\u0007\u0010-[a=5#6k\u001e\u0017ckN1RџA\u000fn;71O\tg8^\u0006:+;Q\u001d]!9\u000b\u0017\u0018\u0005Ѩ&˃յgMV%6\u0010CI\u001bU\u001c\u000e4-x2;&~\b<@%~Y@^\u0010vH\u0010|q6E5.B[Z!f_{S4^H\f\u0014;1ţ\u0005x'od\u0014f*+V}WWgP?XN8lk\u007fJ\u0015Š\u0001Ï˙4I\u0006J\n-v,3Ts9Q?\u0014\u0002vb\u0018|\u0013\u007f\u0001U\u007fQv`hé\u0018\b:\u0017\rrD\u0013\u0007BÓVг0\u0015e\u001eZ\n\f\fc6j|T!S\u0016vO\u0017p!\"4ܚ'çj;qpq\u0016eBӗ24sԨ\u000f`ׯv\u001fG?hەt\u0015A[\u000e`{V!ĞL\u000eޙ{z"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006R.9ay/7ls8VR;tC\r\"djG\u000br0X\u007f\u0015EVY,2", "!", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fDi\u001f<QR?u=\\\u0003hcA\u0007l;$", "1n]AX5M/ \u0003|g4|\u0012>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4\u000b", "5dc\u0010b5MS\"\u000eVe0~\u00127e\t7", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`rNs\u0010E~%>hS", "\u0019dT=H5MW m\bZ5\u000b\r>i\n1\n!\u0005 \u001bUr\u000e;", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006V89hl-3v$2\\GEt\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006V89hl-3v$2\\GEtr{\u001fpl5\u0010g6WL", "5dc\u0018X,IC\"\u000e~e\u001b\n\u00058s\u00047\u007fJ\n%wKx\u0012Jy%4", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@\u0005H]\r\u000fDi\u001f<QR?u=\\rriD\u0003l0X\u007f|\u000b3J5[_|A\u0013%$\fX3\u0018\u000fgAmjM;'\u0004;M\fD2`\u001f\u001a\u001d$wlKd\u0014V}\u001f~\u0017", "AkX1X\u0010Gb#\\\u0005g;x\r8e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006V.DY\u000b\u000fDi\u001f<QR?u=s", "Bnf.e+L", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006R.9ay/7ls8VR;tC\r\"djG\u000br0X\u007f\u0015EVY,\u001b@yA\u0013\u00129\u0012[+\u000b\u0014]K-D", "/mX:T;B]\"l\u0006^*", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u0001;v\u001a=M\u001fDo<\u001a$lkBtn,LL", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "7mXA\\(E=\u001a\u007f\t^;", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "=eU@X;\u001f]&_\u000be3j\u00103d\u007f", "AkX1X\u0010Gb#\\\u0005g;x\r8e\ro\u0004*\u0004si2_", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001N\u001a7QR;G=\"\u001ddp=\u0011l\u001aYv%\u001d3T6kYvF]\u0017k\u0016\u0018,\u001d\u000eWP(xMEhh<R\u007fJl\u000b\u0015acxQlKU\u001dQ}\u0014\t\u000b'rNdi\bG\u000bAk.l\bn!fC\u0004\u0004\u001d\u0001\u0019(W]*\u0013\nW v\\\u0003=", "AkX1X\u0016Nb\u0003\u007fXh5\f\u00053n\u007f5", "B`a4X;(T\u001a\rzm", "AkX1X\u0016Nb\u0003\u007fXh5\f\u00053n\u007f5CHj\u001as\u001aZ}", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001N\u001a7QR;G=\"\u001ddp=\u0011l\u001aYv%\u001d3T6kYvF]\u0017k\u0016\u0018,\u001d\u000eWP(xMEhh<R\u007fJl\u000b\u0015acxQlKU\u001dQ}\u0014\t\u000b'rNdi\bG\u000bAk.l\bn!fC\u0004\u0004'u(\nuL7\u0018\u007fb\u0015|[O", "CrX;Z", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006T/>h})F\\#*VQ<uA&j", "Ahi2G9:\\'\u007f\u0005k4", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d)JYl-3v$/WPCA", "!kX1X\u000bB`\u0019|\nb6\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006R.9ay/7ls8VR;tC\r\"djG\u000br0X\u007f\u0015EVY,@Z}Di", "/mX:T;B]\"x\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface AnimatedContentTransitionScope<S> extends Transition.Segment<S> {
    Alignment getContentAlignment();

    /* JADX INFO: renamed from: slideIntoContainer-mOhB8PU, reason: not valid java name */
    EnterTransition mo378slideIntoContainermOhB8PU(int i2, FiniteAnimationSpec<IntOffset> finiteAnimationSpec, Function1<? super Integer, Integer> function1);

    /* JADX INFO: renamed from: slideOutOfContainer-mOhB8PU, reason: not valid java name */
    ExitTransition mo379slideOutOfContainermOhB8PU(int i2, FiniteAnimationSpec<IntOffset> finiteAnimationSpec, Function1<? super Integer, Integer> function1);

    ContentTransform using(ContentTransform contentTransform, SizeTransform sizeTransform);

    /* JADX INFO: compiled from: AnimatedContent.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4C\u0007\":\u001b\u007f\u0007lnA0RqP.XU0ŧ*\u0012éBjTqq:\u000e\u0019\rb\u0018UȞwk|Jr\u000bq\u0010و\u001azp.WXAu \u0013JB\u001eDcS}CQb\u000b53\u001fxƉ9ѩ\t\u0003 1V\u0018?\tQT$\u0012^A7ńQҫQ\u0007 \u001c\u0014Ah\u000e,g\u007fNdT3qƠ3%\tvP\\wk>|e\rtU}˜xҐ\"+Hʺߗ\u0014%٘\u0002\u0007\u0001\\ϓ\u0007O"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006R.9ay/7ls8VR;tC\r\"djG\u000br0X\u007f\u0015EVY,\u001b@yA\u0013\u00129\u0012[+\u000b\u0014]K-D", "", "D`[BX", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uH\u0018\u0016", "3pd._:", "", "=sW2e", "3pd._:\u0006W!\n\u0002", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "6`b566=S", "6`b566=S`\u0003\u0003i3", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uH\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "\u0011n\\=T5B]\"", "/mX:T;B]\"x\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @JvmInline
    public static final class SlideDirection {
        private final int value;
        public static final Companion Companion = new Companion(null);
        private static final int Left = m381constructorimpl(0);
        private static final int Right = m381constructorimpl(1);
        private static final int Up = m381constructorimpl(2);
        private static final int Down = m381constructorimpl(3);
        private static final int Start = m381constructorimpl(4);
        private static final int End = m381constructorimpl(5);

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ SlideDirection m380boximpl(int i2) {
            return new SlideDirection(i2);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static int m381constructorimpl(int i2) {
            return i2;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m382equalsimpl(int i2, Object obj) {
            return (obj instanceof SlideDirection) && i2 == ((SlideDirection) obj).m386unboximpl();
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m383equalsimpl0(int i2, int i3) {
            return i2 == i3;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m384hashCodeimpl(int i2) {
            return Integer.hashCode(i2);
        }

        public boolean equals(Object obj) {
            return m382equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m384hashCodeimpl(this.value);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m386unboximpl() {
            return this.value;
        }

        /* JADX INFO: compiled from: AnimatedContent.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005.2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u0005;i%\nCiWܵ|̝\u0093NM˗kvRZ\u0019H'\b\u001c{x0\u001al\u0007c*\u000f`DƜ>\u074c߲n<˃d|>\u0005.7::\u007f\f\u000f\u001ez_\u001e~\u0013Cy\u000eݮ/ϋú9QҫQ\r\"\u0012\u0014C8\u0003$euR\u0007_zgR/Q\u0005\u07bcA÷ф^/ƊQ\u0015NT5\u0012\u000fc$6N;\u0006,3_\u001b\u0007\u0001]У\u0002ӊҵ<\u0004ص+/3I\u0002\\NZ\u0006!#/ $k\u0001>\\3Sՙ\u000bʬ̼NbׂT\u00160w\t\u0001%>\n\u001d\u0014+Ρ.6\"i\u000eԦO#q[@V!\u07b2F\u0010"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006R.9ay/7ls8VR;tC\r\"djG\u000br0X\u007f\u0015EVY,\u001b@yA\u0013\u00129\u0012[+\u000b\u0014]K--\"A'\u0013(R\u0006EqV", "", "u(E", "\u0012nf;", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006R.9ay/7ls8VR;tC\r\"djG\u000br0X\u007f\u0015EVY,\u001b@yA\u0013\u00129\u0012[+\u000b\u0014]K-D", "5dc\u0011b>G\u001bwd\u0010]@\b\u001b", "u(8", "\u0017", "\u0013mS", "5dc\u0012a+\u00062~\u0014yr7\u000f", "\u001adUA", "5dc\u0019X-M\u001bwd\u0010]@\b\u001b", " hV5g", "5dc\u001f\\.Ab`]`s+\u0011\u0014A", "!sP?g", "5dc g(Kb`]`s+\u0011\u0014A", "#o", "5dc\"cs\u001d9.}\u000fi>", "/mX:T;B]\"x\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* JADX INFO: renamed from: getLeft-DKzdypw, reason: not valid java name */
            public final int m389getLeftDKzdypw() {
                return SlideDirection.Left;
            }

            /* JADX INFO: renamed from: getRight-DKzdypw, reason: not valid java name */
            public final int m390getRightDKzdypw() {
                return SlideDirection.Right;
            }

            /* JADX INFO: renamed from: getUp-DKzdypw, reason: not valid java name */
            public final int m392getUpDKzdypw() {
                return SlideDirection.Up;
            }

            /* JADX INFO: renamed from: getDown-DKzdypw, reason: not valid java name */
            public final int m387getDownDKzdypw() {
                return SlideDirection.Down;
            }

            /* JADX INFO: renamed from: getStart-DKzdypw, reason: not valid java name */
            public final int m391getStartDKzdypw() {
                return SlideDirection.Start;
            }

            /* JADX INFO: renamed from: getEnd-DKzdypw, reason: not valid java name */
            public final int m388getEndDKzdypw() {
                return SlideDirection.End;
            }
        }

        private /* synthetic */ SlideDirection(int i2) {
            this.value = i2;
        }

        public String toString() {
            return m385toStringimpl(this.value);
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m385toStringimpl(int i2) {
            return m383equalsimpl0(i2, Left) ? "Left" : m383equalsimpl0(i2, Right) ? "Right" : m383equalsimpl0(i2, Up) ? "Up" : m383equalsimpl0(i2, Down) ? "Down" : m383equalsimpl0(i2, Start) ? "Start" : m383equalsimpl0(i2, End) ? "End" : "Invalid";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: slideIntoContainer-mOhB8PU$default, reason: not valid java name */
    static /* synthetic */ EnterTransition m376slideIntoContainermOhB8PU$default(AnimatedContentTransitionScope animatedContentTransitionScope, int i2, FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: slideIntoContainer-mOhB8PU");
        }
        if ((i3 + 2) - (2 | i3) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m6757boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 3, null);
        }
        if ((i3 & 4) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentTransitionScope$slideIntoContainer$1
                public final Integer invoke(int i4) {
                    return Integer.valueOf(i4);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return animatedContentTransitionScope.mo378slideIntoContainermOhB8PU(i2, finiteAnimationSpec, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: slideOutOfContainer-mOhB8PU$default, reason: not valid java name */
    static /* synthetic */ ExitTransition m377slideOutOfContainermOhB8PU$default(AnimatedContentTransitionScope animatedContentTransitionScope, int i2, FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: slideOutOfContainer-mOhB8PU");
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m6757boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 3, null);
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentTransitionScope$slideOutOfContainer$1
                public final Integer invoke(int i4) {
                    return Integer.valueOf(i4);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return animatedContentTransitionScope.mo379slideOutOfContainermOhB8PU(i2, finiteAnimationSpec, function1);
    }

    default ExitTransition getKeepUntilTransitionsFinished(ExitTransition.Companion companion) {
        return companion.getKeepUntilTransitionsFinished$animation_release();
    }
}
