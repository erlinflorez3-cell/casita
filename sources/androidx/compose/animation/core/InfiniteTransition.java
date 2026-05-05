package androidx.compose.animation.core;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: InfiniteTransition.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4B\u0007\"B\u0012\u007f\u0007|jAӄLeVLZS0\u0010s{B-c$wNCU(\u0005*ޛWNugvJ`\u0014I\u0014\u001cǝ)jZH\u000ew\u0003R\u001c8ԏ\u007fCAM\b=gaҽ:\u0005.4jW\b\u001f\u0019\u001aXc@\u0007\t_c\u0018\"0FqJR\u0013N3\u001fb\u0006lĨGȦ֔kN<e5kHM;\u0003\u0018]~+mO\u0015M;_\u001b'U\u0016o>C@ePE5a\u001f\u001f^k?\t@\u0002=\u000biU,{I\"Ɏ|ݙÿ\u0018\u00151pUj\u0001Ht\u0005\u007f{R&˦SeQs\u001cLH\u0019\n\u0010T\u0016\u001e\u00147T>- g\u0018\u000e9u!X\u0011P0މp\u0004Qʫ8а)\u007f;ٿ\n<tWyM)\\G\b\u0015\r$$\u0011n'\\\u0003\u00131\u0015IƘ&Xg\u0016͘ALf\f_E{\rA\f\u00106\u001c0u\u000b_\u007f\u001f8/%efoc_,X҉ׂgЛ\tppUobVQ:p\u001cC8\u0016,\\Jr\u0013z!cf,)MJUΘ\u0002\u000e\u001b\u05fetyB33#\u001fxv}\u0003M\f\u0015U3tAqn\u001a\u0019\u000ey\u001ds\fȤҾ\u0010уV\u0007\u001cABy\u0013i~DY!hiH$8^x\u001fH\bRf$\u0013`XHʌ@Ϝ5\u0019déȦ\u0007D"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u0004@n\u001a7QR;ZA\u001a\u001eveH\u000bm5$", "", ":`Q2_", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "-`]6`(MW#\b\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\fF},5W\r$Av_\u0016]R7h;\u001e\u0006h_H\u0011p\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u0004@n\u001a7QR;ZA\u001a\u001eveH\u000bm5\re4CU\\0kV|Fo\u001b^\u0016J:\u0011\u000fb/3jS7t", "/mX:T;B]\"\r", "", "5dc\u000ea0FO(\u0003\u0005g:", "u(;7T=:\u001d)\u000e~euc\r=tU", "\nrTA \u0006\u0017", "", "7rABa5B\\\u001b", "u(I", "Adc\u001fh5GW\"\u0001", "uY\u0018#", "7rABa5B\\\u001b=y^3|\u000b+t\u007f", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "5dc\u0019T)>Z", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "@dU?X:A1\u001c\u0003\u0002]\u0015|\t.e~", "5dc\u001fX-KS'\u0002Xa0\u0004\b\u0018e\u007f'{?", "Adc\u001fX-KS'\u0002Xa0\u0004\b\u0018e\u007f'{?", "@dU?X:A1\u001c\u0003\u0002]\u0015|\t.e~fz@\b\u0017\u0019C~\u000e", "AsP?g\u001bB[\u0019gvg6\u000b", "", "/cS\u000ea0FO(\u0003\u0005g", "", "/mX:T;B]\"", "/cS\u000ea0FO(\u0003\u0005gjx\u00123m{7\u007fJ\n\u0011\u0015Q|\u000e6\u0004%<Yy.7", "=m5?T4>", ">kPFG0FS\u0002z\u0004h:", "@d\\<i,\u001a\\\u001d\u0007vm0\u0007\u0012", "@d\\<i,\u001a\\\u001d\u0007vm0\u0007\u0012ma\t,\u0004<\u0010\u001b!Pi\fF\u0004%/f}'7i$.", "@t]", "@t]pT5B[\u0015\u000e~h5v\u00079r\u007f\"\t@\b\u0017\u0013Uo", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq>", "\"qP;f0MW#\bVg0\u0005\u0005>i\n1iO|&\u0017", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class InfiniteTransition {
    public static final int $stable = 8;
    private final String label;
    private final MutableVector<TransitionAnimationState<?, ?>> _animations = new MutableVector<>(new TransitionAnimationState[16], 0);
    private final MutableState refreshChildNeeded$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    private long startTimeNanos = Long.MIN_VALUE;
    private final MutableState isRunning$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);

    public InfiniteTransition(String str) {
        this.label = str;
    }

    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: compiled from: InfiniteTransition.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&i\u0006DLc\u000b\u0004I\u0006F\u000b6B\u0005#4\u0012\u000e\u0007nʑA0ZeP\u008cZS8\u001bs{:$c$\bCCU \t*\t]WogtOb\u000bQ\u0016\u000e\u0016~s4Icxe\u0012\u0015:HĪAIݹ\u0018??ś\u00035-&8!Fy-\u0001H+x\u0016\u0007|SKR\u0011^B1yX҈]\t(\u0015\u001e>Vҵ.`uRNH#җJ?1\b\u0002N^)o03ձ\u001dHd'Cu\u0010$;JE<-+c\u0005\u0017R\u0012Ϊ1G\u0002A\u0013q?'YSָ[6f\u000b\\(9}%]!U\r\t_\u0011$'Yr*֟ח\u0012(},D\u0018J6&\u0006UwtƦբj\b\u0014f=}ath\u0002\rqFЭˋ:\u0017+5{VGQ~Q\u0010jIRE~\u001d\rTŀ1r/_l\u000e\u0017ٽK^\u0006XIWP?XN@ԯkuJ͏Ċ\u0006,\ngU8\u007f6\u001f</1G]I#Wǽ\u0012JTg-\u0004\u000fu\u0004y`TX.~\u0018G*?ȱjFt\u0005\"O\u0003ejO$Ƀ`Θ\u0002\u0014\u001b\u05fetyB03 nQnzx_.236~=ip{\u000e\u000eު\r;e[q\u001cyX\u0007\u0016O<\u0019ڳ\u0007n\u0001\u0014bȞh͈&8PК(y\u0002W\\ cLMt44bջo£!Ƞ\u0007,JA\u000b\"w\\n%\rjS&\t\u00012\rY\u0019^v\to\u0016\u0014 ؔ\t˃&9IٛM\u001b,q0\u0006T~)%\r\u0013PVuU_L\u001b \u0091Y\u0002(چ2;WOK4_\u000b7T\u001a-soIϏ]̊\u0016'\u0003۠J\u001bI\rFg6\u0006GݝlʧNO\\ϟr\u0011lv;\b\u001bрPӔRیKq\\\u000biWat\t~JdX~\u000bE,=Q\u000b0\u0002M9S)-\u0016.ҡ?\u0017q] n\\\u007fˏ\u0013,|Ё\u001c.i=}\u000b\"\u0007@dPI\u0010˚n&2x\u001bB~۳.\\\u0001W\u000bٖΘHыh\u0001^:S7=+~\t27~l{<\u0019\u001b\fLˆcc"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u0004@n\u001a7QR;ZA\u001a\u001eveH\u000bm5\re4CU\\0kV|Fo\u001b^\u0016J:\u0011\u000fb/3jS7t", "\"", "$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "7mXA\\(ED\u0015\u0006\u000b^", "B`a4X;/O \u000fz", "Bx_266Gd\u0019\f\n^9", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fIw\b*a!EtE\u001e\"waF\\", "/mX:T;B]\"l\u0006^*", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\")\u0015f7", ":`Q2_", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u001bv\u00172VGJk#+\u0011qo=\u0016g6WL\u000eLH_(&YnF\u0016[D\u000bS+\u000b\u0014/()jU3h\u000f(R\u0004\u0005R}\u0011\u0016\fD@W>_\u000fT\u0004\u0019tTrfPaj\u0004UA\u000f^3h\u0014[,`DCm\u0012{&\u001b2?@\u0014mO%P\\\u0003xgT(zEy%idERyY;\bp\u001dU\u0004\u0003\u001c@X>'}1\f09:n\u000e\u0015e\"K^Bp5`I#5:F\u001c-VcsB%\u0013d0]Q\u0015^>3bStpL\u0018\t3ZL", "\nrTA \u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000f3z\u0018.\\ 7y4\u001dpqeA\u0003r0X\u007f|", "/mX:T;B]\"", "5dc\u000ea0FO(\u0003\u0005g", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001\\\u0012;OCJH0,\u0015g=B\u000bk(]z1P\"", "Adc\u000ea0FO(\u0003\u0005gjx\u00123m{7\u007fJ\n\u0011\u0015Q|\u000e6\u0004%<Yy.7", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i&i#0MR\u0018gB\u001e\u0014Dj=\u000f_;R\u00010\u001d\u0010?", "5dc\u000ea0FO(\u0003\u0005g\u001a\b\t-", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001I\u001f2U?Jo>'\u0003sa7\\", "5dc\u0016a0MW\u0015\u0006kZ3\r\tma\t,\u0004<\u0010\u001b!Pi\fF\u0004%/f}'7i$.", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "Adc\u0016a0MW\u0015\u0006kZ3\r\tma\t,\u0004<\u0010\u001b!Pi\fF\u0004%/f}'7i$.", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", "7r56a0LV\u0019}", "", "7r56a0LV\u0019}9Z5\u0001\u0011+t\u00042\u0005:~!$Gi\u001b<}%1g}", "u(I", "Adc\u0013\\5Ba\u001c~y\u001d(\u0006\r7a\u000f,\u0006Iz\u0015!To\bIv,5U\f ", "uY\u0018#", "5dc\u0019T)>Z", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", ">kPFG0FS\u0002z\u0004h:f\n0s\u007f7", "", "AsP?g\u0016GB\u001c~c^?\fi<a\b(", "5dc!T9@S(ove<|G+n\u00040wO\u0005! Am\u0018Iv\u001fBY\u0005 3{\u0016", "Adc!T9@S(ove<|G+n\u00040wO\u0005! Am\u0018Iv\u001fBY\u0005 3{\u0016", "5dc!l7>1#\b\f^9\f\t<", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001\\(8??OI>'&hnH\u0007p\u0002", "D`[BX", "5dc#T3NS", "Adc#T3NSWz\u0004b4x\u00183o\t\"yJ\u000e\u0017\u0011To\u0015<r35", "D`[BXj=S ~|Z;|", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "=m?9T@-W!~Xa(\u0006\u000b/d", "", ">kPFG0FS\u0002z\u0004h:", "=m?9T@-W!~Xa(\u0006\u000b/d>$\u0005D\t\u0013&Ky\u00176t/BYw-7t\u0016*[C", "@db2g", "@db2gj:\\\u001d\u0007vm0\u0007\u0012)c\n5{:\u000e\u0017\u001eGk\u001c<", "AjX=G6\u001e\\\u0018", "AjX=G6\u001e\\\u0018=vg0\u0005\u0005>i\n1u>\u000b$\u0017A|\u000eCv!CY", "CoS.g,/O \u000fzl", "CoS.g,/O \u000fzljx\u00123m{7\u007fJ\n\u0011\u0015Q|\u000e6\u0004%<Yy.7", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|k\u0015IL:x>\"\u0014{+7\u0011k7X\u0005'\u0011HW0dN\u0002A\u001e\u001b$\fX8\rN5J(v@F#\u001257\r;fVO\u0007", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public final class TransitionAnimationState<T, V extends AnimationVector> implements State<T> {
        private TargetBasedAnimation<T, V> animation;
        private AnimationSpec<T> animationSpec;
        private T initialValue;
        private boolean isFinished;
        private final String label;
        private long playTimeNanosOffset;
        private boolean startOnTheNextFrame;
        private T targetValue;
        private final TwoWayConverter<T, V> typeConverter;
        private final MutableState value$delegate;

        public TransitionAnimationState(T t2, T t3, TwoWayConverter<T, V> twoWayConverter, AnimationSpec<T> animationSpec, String str) {
            this.initialValue = t2;
            this.targetValue = t3;
            this.typeConverter = twoWayConverter;
            this.label = str;
            this.value$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t2, null, 2, null);
            this.animationSpec = animationSpec;
            this.animation = new TargetBasedAnimation<>(this.animationSpec, twoWayConverter, this.initialValue, this.targetValue, (AnimationVector) null, 16, (DefaultConstructorMarker) null);
        }

        public final T getInitialValue$animation_core_release() {
            return this.initialValue;
        }

        public final void setInitialValue$animation_core_release(T t2) {
            this.initialValue = t2;
        }

        public final T getTargetValue$animation_core_release() {
            return this.targetValue;
        }

        public final void setTargetValue$animation_core_release(T t2) {
            this.targetValue = t2;
        }

        public final TwoWayConverter<T, V> getTypeConverter() {
            return this.typeConverter;
        }

        public final String getLabel() {
            return this.label;
        }

        @Override // androidx.compose.runtime.State
        public T getValue() {
            return this.value$delegate.getValue();
        }

        public void setValue$animation_core_release(T t2) {
            this.value$delegate.setValue(t2);
        }

        public final AnimationSpec<T> getAnimationSpec() {
            return this.animationSpec;
        }

        public final TargetBasedAnimation<T, V> getAnimation() {
            return this.animation;
        }

        public final void setAnimation$animation_core_release(TargetBasedAnimation<T, V> targetBasedAnimation) {
            this.animation = targetBasedAnimation;
        }

        public final boolean isFinished$animation_core_release() {
            return this.isFinished;
        }

        public final void setFinished$animation_core_release(boolean z2) {
            this.isFinished = z2;
        }

        public final void updateValues$animation_core_release(T t2, T t3, AnimationSpec<T> animationSpec) {
            this.initialValue = t2;
            this.targetValue = t3;
            this.animationSpec = animationSpec;
            this.animation = new TargetBasedAnimation<>(animationSpec, this.typeConverter, t2, t3, (AnimationVector) null, 16, (DefaultConstructorMarker) null);
            InfiniteTransition.this.setRefreshChildNeeded(true);
            this.isFinished = false;
            this.startOnTheNextFrame = true;
        }

        public final void onPlayTimeChanged$animation_core_release(long j2) {
            InfiniteTransition.this.setRefreshChildNeeded(false);
            if (this.startOnTheNextFrame) {
                this.startOnTheNextFrame = false;
                this.playTimeNanosOffset = j2;
            }
            long j3 = j2 - this.playTimeNanosOffset;
            setValue$animation_core_release(this.animation.getValueFromNanos(j3));
            this.isFinished = this.animation.isFinishedFromNanos(j3);
        }

        public final void skipToEnd$animation_core_release() {
            setValue$animation_core_release(this.animation.getTargetValue());
            this.startOnTheNextFrame = true;
        }

        public final void reset$animation_core_release() {
            this.startOnTheNextFrame = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getRefreshChildNeeded() {
        return ((Boolean) this.refreshChildNeeded$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRefreshChildNeeded(boolean z2) {
        this.refreshChildNeeded$delegate.setValue(Boolean.valueOf(z2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean isRunning() {
        return ((Boolean) this.isRunning$delegate.getValue()).booleanValue();
    }

    private final void setRunning(boolean z2) {
        this.isRunning$delegate.setValue(Boolean.valueOf(z2));
    }

    public final List<TransitionAnimationState<?, ?>> getAnimations() {
        return this._animations.asMutableList();
    }

    public final void addAnimation$animation_core_release(TransitionAnimationState<?, ?> transitionAnimationState) {
        this._animations.add(transitionAnimationState);
        setRefreshChildNeeded(true);
    }

    public final void removeAnimation$animation_core_release(TransitionAnimationState<?, ?> transitionAnimationState) {
        this._animations.remove(transitionAnimationState);
    }

    public final void run$animation_core_release(Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-318043801);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(run)172@7001L67:InfiniteTransition.kt#pdpnli");
        if ((i2 + 6) - (6 | i2) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((3 & i3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-318043801, i3, -1, "androidx.compose.animation.core.InfiniteTransition.run (InfiniteTransition.kt:171)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 748212685, "CC(remember):InfiniteTransition.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (isRunning() || getRefreshChildNeeded()) {
                composerStartRestartGroup.startReplaceGroup(1719915818);
                ComposerKt.sourceInformation(composerStartRestartGroup, "176@7149L1537,176@7128L1558");
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 748218891, "CC(remember):InfiniteTransition.kt#9igjgp");
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
                InfiniteTransition$run$1$1 infiniteTransition$run$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || infiniteTransition$run$1$1RememberedValue == Composer.Companion.getEmpty()) {
                    infiniteTransition$run$1$1RememberedValue = new InfiniteTransition$run$1$1(mutableState, this, null);
                    composerStartRestartGroup.updateRememberedValue(infiniteTransition$run$1$1RememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                EffectsKt.LaunchedEffect(this, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) infiniteTransition$run$1$1RememberedValue, composerStartRestartGroup, (i3 + 14) - (i3 | 14));
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1721436120);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.core.InfiniteTransition$run$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    InfiniteTransition infiniteTransition = this.$tmp2_rcvr;
                    int i5 = i2;
                    infiniteTransition.run$animation_core_release(composer2, RecomposeScopeImplKt.updateChangedFlags((i5 + 1) - (i5 & 1)));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFrame(long j2) {
        MutableVector<TransitionAnimationState<?, ?>> mutableVector = this._animations;
        int size = mutableVector.getSize();
        boolean z2 = true;
        if (size > 0) {
            TransitionAnimationState<?, ?>[] content = mutableVector.getContent();
            int i2 = 0;
            do {
                TransitionAnimationState<?, ?> transitionAnimationState = content[i2];
                if (!transitionAnimationState.isFinished$animation_core_release()) {
                    transitionAnimationState.onPlayTimeChanged$animation_core_release(j2);
                }
                if (!transitionAnimationState.isFinished$animation_core_release()) {
                    z2 = false;
                }
                i2++;
            } while (i2 < size);
        }
        setRunning(!z2);
    }
}
