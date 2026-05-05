package androidx.compose.foundation.gestures;

import androidx.collection.MutableObjectFloatMap;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputChange;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
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
/* JADX INFO: compiled from: AnchoredDraggable.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яċ\u0014D߬)\u001e\u007f\u007fLDyt\fA\u00149\u0013.H~*,(w\u000f߿r9>Ǐm߉6Ri*\u0017k\n4,[:qK;[\u001a\u0006\"\u001fOVguzRҙ\u0013C%\u0006\u001exp.QU\u000f]\u001a\u000fHBw?9Mw=O`|Ȃ\r H\"@ц\r\u00010*P\u0010|zKK\"\u00128ϋx:h\rU\u0005 \u0016\u000e>.\u0006&ձoNLHt]@6+\u0003\u007fBV'e1\u0015\u0003\u001bIl-\u001dxq\u001eqEe95+YΈ\u0015W\u0004?1E\"X\u0013o?>;Q\u0004]FZ\u0010\u0014[0}\u0015mt6\\3Z\u000f\u000bˏ/OiU\u0017\u0013@\r\t\u0007%<2\u001761V:E v\n\u001e3#\u0001\u0002M\u0017؟dZ\u0012\tpN\u001d5\u0002C+\u007f \u0015a\u0002=\u001f\u05cbE\u0001K\r6g\u000f\u007f9[\u0003\u0017\u0001\u0017!Ƙ\u0006ca[NP`T\u001a[MmJ\u0003\u0011\u000fZ$>[\u0018K\u0002\u0010>\u001957\"K3){\bXFwv3i\u0017iyVXB8mD=X\u001eRɱ\u0003\u0081\tk^kp~\u001fe4T5\u0017(\u0015&ο\u0006AI%>g\u007frw\u0005ec\u001a'?f}^\u001d\u0007>[GzK5\u007f\u0001@gXv\"]Tb3Y\u0017JY\fh{@$HG\u00190(\u0004JN\u001a4JA\b\u001bbNa\u001fb\u0015V&6Bo}OdrC\u001e\u0017l3R\u001c\n&zէ\u000fU\u0005p\u001e\u0001)S:\u0017x(=Ca5_+\u0004=\u00198\u000bG\u001f~\"\u0001wkZcdlD\u0013\u0006\u0002&\u0016(Wi/k\u0014?\u0007/2\u0010L]N\td\u007fmB/\u0001|\b0SjDf6\r!2fjXrl\u0017Pw%w;,r%\u0012at\u0004geZެiCqx\u0013[LN~\u00023:N)\u000f\u0016:|{2\nڷ[ə{\u0014=<y w\u0015Fy\u0011\u0018Fvkֽ:h>urSm2\u0002=wt/B0L\u0005\u0003pq\u001b{\u0016l!4;^xKr\u001dn>]\r?}-\fZ\u0011!Zig+oD9tʁhϵG}\"\r[Q\u001f|kg\u001c\u0017k^\u0011ͧ\u001d\u000f3\u0002Ap\"\u001c\u0004%\u0005r\u0013\r>,\f\u0018|Fkf\u0013d!$bU\u0003ޒIͲXi\u0014@\u0013\u0012T\u0011'\u0017`k\u001c;\u00057\u0005|j\t`\u0005\u000fn'!B\u0017\rBK\u001e'^Q\u0007sۮbc\f8\u0011U-\ta\u001f}4-%CZbo3(\u0007*+GcŝW6^\nW+}k6@fMC\u001dZ<)pi\u0011\u000e\u007fP`\u0011ٝrS\r|\"hbNh.-\u0016-\u0012J0'\u000b_T9ſ!υPN\u0006^c2\u000fҿ\\5\u0017\u000e\rct\u001b=\bE-kJ\u0019\u0013}ضYĺ?}\u0010¶@3\u0012v9\\\u0006\u000f=ō0Ό>\u0016yдȱ\u0006A"}, d2 = {"\u000fkf.l:\u001d`\u0015\u0001", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp\u0017\n_5Pv|", "", "\u0012D1\":", "\u0012qP4Z(;Z\u0019Z\u0004\\/\u0007\u0016=", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,P7m6\u001a\u0012oa\u0015\u0010a/X\u00045\u001d", "\"", "", "0tX9W,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,P7m6\u001a\u0012oa\u0015\u0010a/X\u00045%VW-`TH", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "2dQBZ\u0013HU", "5d]2e(MS\u0001\r|", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "3l_Al\u000bKO\u001b\u0001v[3|d8c\u00032\tN", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w5?FJA\u001a\u0017j]6\u000ec\bWt*QY\\\u0002", "@dbAT9MO\u0016\u0006z", "\u0017", "7m_Bg:", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u0007=w%5QL\u0005pE&^iqB\u0005r0X\u007f5\u0011-^5ZavG\u001d^0tT5\u001c\f]JmlND)\u0018;M\u000b;vJi \u0017DnyRR\u001fK\u0004\u001eK\u0005\u0010mBj[CN=NdsN\td\u001dZI\u0010", "/mR5b9>Rw\fv`.x\u00066e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w)L9n>+\u0015g@F\u0003e.Js.G:](kRH", "=qX2a;:b\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w7P?k=-\u0011weC\u00109", "3mP/_,=", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005SD-\u0011eh9jl;N\u0004#E[R6e@|M!\u0010Zc", "=uT?f*K] \u0006Z_-|\u0007>", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u000fFY\u000b.5z 5T#<l4\u001c$>", "AsP?g\u000bKO\u001bb\u0003f,{\r+t\u007f/\u0010", "@de2e:>2\u001d\fz\\;\u0001\u00138", "/mX:T;>B#", "B`a4X;/O \u000fz", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn7Y\f/Gz\u0016<\u0017\u001fDi7(\"h`\u0018\u0014_.Pr$NL<;Xar\u0013z\u0017V\u001fJt\u0014\u0001bCmXA<\u001f\u0006;\u001fhAr\u0010\u0013\u001a\u0017~hzO` V}\u001euOrFPbn}PQAq.n\u00155`C?65\u0010; \u0017qRwsxX\u0011paO", "Dd[<V0Mg", "", "/mR5b9>Rw\fv`\u001az\u0013:e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w)L9n>+\u0015g@F\u0003e\u001aL\u00012G\"", "/mR5b9L", ":`c2f;-O&\u0001zm", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn7Y\f/Gz\u0016<\u0017\u001fDi7(\"h`\u0018\u0014_.Pr$NL<;Xar\u0013txV\u0017M8\u0017\tXTmlN?*\u0012:IK<r\u0011\u0015\u0015\nDnzK \u0012G\b$\u0006N)v\u00105hwJKRb)C\u0019[\u001fJ8D/\u0014G\u007f\u0017qO;\u0014\u007fR$<P\u0004orQ'z\u0002%H}dEA~YF}p!K\n\u0007\"?X\u0003tS:\u007f6,2a\fKC!<a\u0003\":2(,\"G8\\FGlw6(\u000bm\u001f_\u0017cI;;(lil\u0012\r\u0011j!kDeh\u0001E\u001ccHR~\u00190VzQ_\u0004\u001e^J\u000braZ?d[|#r\u000e\f\\\u0016\u0003\u0001um", "/mX:T;>B#p~m/[\t-a\u0014", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn7Y\f/Gz\u0016<\u0017\u001fDi7(\"h`\u0018\u0014_.Pr$NL<;Xar\u0013z\u0017V\u001fJt\u0014\u0001bCmXA<\u001f\u0006;\u001fb\"n\u000b\u001b\u001d\u0012>4nLc\u001aW\t\u0019~A72$ch\tKJU^9h\u0016hr !? %mb\"dY0SeP\u0016rP\t=", "1nT?V,-]\bz\b`,\f", "B`a4X;", ";`g#T3NS\u0003\fcZ\u0015", "\u0019", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nj\u0014\u001cGm\u001d\u001d}/1he\u001cBC", ";h]#T3NS\u0003\fcZ\u0015", "AmP=G6", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AnchoredDraggableKt {
    private static final Function1<PointerInputChange, Boolean> AlwaysDrag = new Function1<PointerInputChange, Boolean>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$AlwaysDrag$1
        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(PointerInputChange pointerInputChange) {
            return true;
        }
    };
    private static final boolean DEBUG = false;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1, reason: invalid class name */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aUi\u0018\u000e\u0014\u001c \u0014\u0014t$\u0014\u001b\u001c\u0017\u0019$\u001e\u0005/", f = "\u000e:.28:,*\t6$)(!!*\"i&.", i = {0, 0}, l = {PhotoshopDirectory.TAG_GLOBAL_ALTITUDE}, m = "0>:?4H:*F/BNC BA@Y", n = {"a[oG[dKU=0K6F=(:,", "e[nUU_V`"}, s = {"xQ^", "rQ^"})
    static final class AnonymousClass1<T> extends ContinuationImpl {
        float F$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return AnchoredDraggableKt.animateToWithDecay(null, null, 0.0f, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aUi\u0018\u000e\u0014\u001c \u0014\u0014t$\u0014\u001b\u001c\u0017\u0019$\u001e\u0005/", f = "\u000e:.28:,*\t6$)(!!*\"i&.", i = {}, l = {1111}, m = "A5DF4FI79D>", n = {}, s = {})
    static final class C04371<I> extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C04371(Continuation<? super C04371> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AnchoredDraggableKt.restartable(null, null, this);
        }
    }

    private static final void debugLog(Function0<String> function0) {
    }

    public static /* synthetic */ Modifier anchoredDraggable$default(Modifier modifier, AnchoredDraggableState anchoredDraggableState, boolean z2, Orientation orientation, boolean z3, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, boolean z4, int i2, Object obj) {
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        boolean zIsAnimationRunning = z4;
        boolean z5 = z3;
        if ((i2 + 8) - (i2 | 8) != 0) {
            z5 = true;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 16)) != 0) {
            mutableInteractionSource2 = null;
        }
        OverscrollEffect overscrollEffect2 = (i2 + 32) - (i2 | 32) == 0 ? overscrollEffect : null;
        if ((i2 & 64) != 0) {
            zIsAnimationRunning = anchoredDraggableState.isAnimationRunning();
        }
        return anchoredDraggable(modifier, anchoredDraggableState, z2, orientation, z5, mutableInteractionSource2, overscrollEffect2, zIsAnimationRunning);
    }

    public static final <T> Modifier anchoredDraggable(Modifier modifier, AnchoredDraggableState<T> anchoredDraggableState, boolean z2, Orientation orientation, boolean z3, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, boolean z4) {
        return modifier.then(new AnchoredDraggableElement(anchoredDraggableState, orientation, z3, Boolean.valueOf(z2), mutableInteractionSource, z4, overscrollEffect));
    }

    public static /* synthetic */ Modifier anchoredDraggable$default(Modifier modifier, AnchoredDraggableState anchoredDraggableState, Orientation orientation, boolean z2, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, boolean z3, int i2, Object obj) {
        boolean zIsAnimationRunning = z3;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        boolean z4 = z2;
        if ((4 & i2) != 0) {
            z4 = true;
        }
        if ((i2 + 8) - (8 | i2) != 0) {
            mutableInteractionSource2 = null;
        }
        OverscrollEffect overscrollEffect2 = (16 & i2) == 0 ? overscrollEffect : null;
        if ((-1) - (((-1) - i2) | ((-1) - 32)) != 0) {
            zIsAnimationRunning = anchoredDraggableState.isAnimationRunning();
        }
        return anchoredDraggable(modifier, anchoredDraggableState, orientation, z4, mutableInteractionSource2, overscrollEffect2, zIsAnimationRunning);
    }

    public static final <T> Modifier anchoredDraggable(Modifier modifier, AnchoredDraggableState<T> anchoredDraggableState, Orientation orientation, boolean z2, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, boolean z3) {
        return modifier.then(new AnchoredDraggableElement(anchoredDraggableState, orientation, z2, null, mutableInteractionSource, z3, overscrollEffect));
    }

    public static final <T> DraggableAnchors<T> DraggableAnchors(Function1<? super DraggableAnchorsConfig<T>, Unit> function1) {
        DraggableAnchorsConfig draggableAnchorsConfig = new DraggableAnchorsConfig();
        function1.invoke(draggableAnchorsConfig);
        return new MapDraggableAnchors(draggableAnchorsConfig.getAnchors$foundation_release());
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$snapTo$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!,i\bӵLc\u000b\u0004Iي8\u000bDB\u0007Ӭ:ߚ\u0010\u0007\u0015iY2J͜V.zSX\u0010\u001c\u0006B&s*\u0002EKU`}P\f\u007fRuk\u0007J!\u000b\nƯD"}, d2 = {"\n`]<a@F])\rS", "", "\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w)L9n>+\u0015g@F\u0003e\u001aL\u00012G\"", "/mR5b9L", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,P7m6\u001a\u0012oa\u0015\u0010a/X\u00045\u001d", ":`c2f;-O&\u0001zm"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aUi\u0018\u000e\u0014\u001c \u0014\u0014t$\u0014\u001b\u001c\u0017\u0019$\u001e\u0005/_0, 0\u00151fu", f = "\u000e:.28:,*\t6$)(!!*\"i&.", i = {}, l = {}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class C04392<T> extends SuspendLambda implements Function4<AnchoredDragScope, DraggableAnchors<T>, T, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        C04392(Continuation<? super C04392> continuation) {
            super(4, continuation);
        }

        @Override // kotlin.jvm.functions.Function4
        public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, T t2, Continuation<? super Unit> continuation) {
            C04392 c04392 = new C04392(continuation);
            c04392.L$0 = anchoredDragScope;
            c04392.L$1 = draggableAnchors;
            c04392.L$2 = t2;
            return c04392.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
            float fPositionOf = ((DraggableAnchors) this.L$1).positionOf(this.L$2);
            if (!Float.isNaN(fPositionOf)) {
                AnchoredDragScope.dragTo$default(anchoredDragScope, fPositionOf, 0.0f, 2, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final <T> Object snapTo(AnchoredDraggableState<T> anchoredDraggableState, T t2, Continuation<? super Unit> continuation) {
        Object objAnchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState, t2, null, new C04392(null), continuation, 2, null);
        return objAnchoredDrag$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnchoredDrag$default : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Object animateTo(AnchoredDraggableState<T> anchoredDraggableState, float f2, final AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, T t2, Continuation<? super Unit> continuation) {
        Object objAnimate;
        float fPositionOf = draggableAnchors.positionOf(t2);
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        floatRef.element = Float.isNaN(anchoredDraggableState.getOffset()) ? 0.0f : anchoredDraggableState.getOffset();
        return (Float.isNaN(fPositionOf) || floatRef.element == fPositionOf || (objAnimate = SuspendAnimationKt.animate(floatRef.element, fPositionOf, f2, anchoredDraggableState.getSnapAnimationSpec(), new Function2<Float, Float, Unit>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$animateTo$2$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Float f3, Float f4) {
                invoke(f3.floatValue(), f4.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(float f3, float f4) {
                anchoredDragScope.dragTo(f3, f4);
                floatRef.element = f3;
            }
        }, continuation)) != IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? Unit.INSTANCE : objAnimate;
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$animateTo$4, reason: invalid class name */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!,i\bӵLc\u000b\u0004Iي8\u000bDB\u0007Ӭ:ߚ\u0010\u0007\u0015iY2J͜V.zSX\u0010\u001c\u0006B&s*\u0002EKU`}P\f\u007fRuk\u0007J!\u000b\nƯD"}, d2 = {"\n`]<a@F])\rS", "", "\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w)L9n>+\u0015g@F\u0003e\u001aL\u00012G\"", "/mR5b9L", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,P7m6\u001a\u0012oa\u0015\u0010a/X\u00045\u001d", ":`c2f;-O&\u0001zm"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aUi\u0018\u000e\u0014\u001c \u0014\u0014t$\u0014\u001b\u001c\u0017\u0019$\u001e\u0005/_\u001e,(-\"6(\u00184iz", f = "\u000e:.28:,*\t6$)(!!*\"i&.", i = {}, l = {PhotoshopDirectory.TAG_QUICK_MASK_INFORMATION}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class AnonymousClass4<T> extends SuspendLambda implements Function4<AnchoredDragScope, DraggableAnchors<T>, T, Continuation<? super Unit>, Object> {
        final /* synthetic */ AnchoredDraggableState<T> $this_animateTo;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(AnchoredDraggableState<T> anchoredDraggableState, Continuation<? super AnonymousClass4> continuation) {
            super(4, continuation);
            this.$this_animateTo = anchoredDraggableState;
        }

        @Override // kotlin.jvm.functions.Function4
        public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, T t2, Continuation<? super Unit> continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$this_animateTo, continuation);
            anonymousClass4.L$0 = anchoredDragScope;
            anonymousClass4.L$1 = draggableAnchors;
            anonymousClass4.L$2 = t2;
            return anonymousClass4.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
                DraggableAnchors draggableAnchors = (DraggableAnchors) this.L$1;
                Object obj2 = this.L$2;
                AnchoredDraggableState<T> anchoredDraggableState = this.$this_animateTo;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (AnchoredDraggableKt.animateTo(anchoredDraggableState, anchoredDraggableState.getLastVelocity(), anchoredDragScope, draggableAnchors, obj2, this) == coroutine_suspended) {
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

    public static final <T> Object animateTo(AnchoredDraggableState<T> anchoredDraggableState, T t2, Continuation<? super Unit> continuation) {
        Object objAnchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState, t2, null, new AnonymousClass4(anchoredDraggableState, null), continuation, 2, null);
        return objAnchoredDrag$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnchoredDrag$default : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object animateToWithDecay(androidx.compose.foundation.gestures.AnchoredDraggableState<T> r9, T r10, float r11, kotlin.coroutines.Continuation<? super java.lang.Float> r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.foundation.gestures.AnchoredDraggableKt.AnonymousClass1
            if (r0 == 0) goto L5b
            r7 = r12
            androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1 r7 = (androidx.compose.foundation.gestures.AnchoredDraggableKt.AnonymousClass1) r7
            int r0 = r7.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = (-1) - r0
            int r0 = (-1) - r2
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L5b
            int r0 = r7.label
            int r0 = r0 - r2
            r7.label = r0
        L19:
            java.lang.Object r3 = r7.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.label
            r0 = 1
            if (r1 == 0) goto L37
            if (r1 != r0) goto L61
            float r11 = r7.F$0
            java.lang.Object r1 = r7.L$0
            kotlin.jvm.internal.Ref$FloatRef r1 = (kotlin.jvm.internal.Ref.FloatRef) r1
            kotlin.ResultKt.throwOnFailure(r3)
        L2f:
            float r0 = r1.element
            float r11 = r11 - r0
            java.lang.Float r0 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r11)
            return r0
        L37:
            kotlin.ResultKt.throwOnFailure(r3)
            kotlin.jvm.internal.Ref$FloatRef r1 = new kotlin.jvm.internal.Ref$FloatRef
            r1.<init>()
            r1.element = r11
            androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2 r6 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2
            r5 = 0
            r3 = r9
            r6.<init>(r3, r11, r1, r5)
            kotlin.jvm.functions.Function4 r6 = (kotlin.jvm.functions.Function4) r6
            r7.L$0 = r1
            r7.F$0 = r11
            r7.label = r0
            r8 = 2
            r9 = 0
            r4 = r10
            java.lang.Object r0 = androidx.compose.foundation.gestures.AnchoredDraggableState.anchoredDrag$default(r3, r4, r5, r6, r7, r8, r9)
            if (r0 != r2) goto L5a
            return r2
        L5a:
            goto L2f
        L5b:
            androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1 r7 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1
            r7.<init>(r12)
            goto L19
        L61:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableKt.animateToWithDecay(androidx.compose.foundation.gestures.AnchoredDraggableState, java.lang.Object, float, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2, reason: invalid class name */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!,i\bӵLc\u000b\u0004Iي8\u000bDB\u0007Ӭ:ߚ\u0010\u0007\u0015iY2J͜V.zSX\u0010\u001c\u0006B&s*\u0002EKU`}P\f\u007fRuk\u0007J!\u000b\nƯD"}, d2 = {"\n`]<a@F])\rS", "", "\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w)L9n>+\u0015g@F\u0003e\u001aL\u00012G\"", "/mR5b9L", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,P7m6\u001a\u0012oa\u0015\u0010a/X\u00045\u001d", ":`c2f;-O&\u0001zm"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aUi\u0018\u000e\u0014\u001c \u0014\u0014t$\u0014\u001b\u001c\u0017\u0019$\u001e\u0005/_\u001e,(-\"6(\u00184\u001d0<1\u000e0/.Gr\u0002", f = "\u000e:.28:,*\t6$)(!!*\"i&.", i = {}, l = {PhotoshopDirectory.TAG_EXIF_DATA_3, PhotoshopDirectory.TAG_DISPLAY_INFO, 1092}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class AnonymousClass2<T> extends SuspendLambda implements Function4<AnchoredDragScope, DraggableAnchors<T>, T, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.FloatRef $remainingVelocity;
        final /* synthetic */ AnchoredDraggableState<T> $this_animateToWithDecay;
        final /* synthetic */ float $velocity;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AnchoredDraggableState<T> anchoredDraggableState, float f2, Ref.FloatRef floatRef, Continuation<? super AnonymousClass2> continuation) {
            super(4, continuation);
            this.$this_animateToWithDecay = anchoredDraggableState;
            this.$velocity = f2;
            this.$remainingVelocity = floatRef;
        }

        @Override // kotlin.jvm.functions.Function4
        public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, T t2, Continuation<? super Unit> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_animateToWithDecay, this.$velocity, this.$remainingVelocity, continuation);
            anonymousClass2.L$0 = anchoredDragScope;
            anonymousClass2.L$1 = draggableAnchors;
            anonymousClass2.L$2 = t2;
            return anonymousClass2.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                final AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
                DraggableAnchors draggableAnchors = (DraggableAnchors) this.L$1;
                Object obj2 = this.L$2;
                final float fPositionOf = draggableAnchors.positionOf(obj2);
                if (!Float.isNaN(fPositionOf)) {
                    final Ref.FloatRef floatRef = new Ref.FloatRef();
                    floatRef.element = Float.isNaN(this.$this_animateToWithDecay.getOffset()) ? 0.0f : this.$this_animateToWithDecay.getOffset();
                    if (floatRef.element != fPositionOf) {
                        if (this.$velocity * (fPositionOf - floatRef.element) < 0.0f || this.$velocity == 0.0f) {
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 1;
                            if (AnchoredDraggableKt.animateTo(this.$this_animateToWithDecay, this.$velocity, anchoredDragScope, draggableAnchors, obj2, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            this.$remainingVelocity.element = 0.0f;
                        } else {
                            float fCalculateTargetValue = DecayAnimationSpecKt.calculateTargetValue(this.$this_animateToWithDecay.getDecayAnimationSpec(), floatRef.element, this.$velocity);
                            float f2 = this.$velocity;
                            if (f2 <= 0.0f ? fCalculateTargetValue > fPositionOf : fCalculateTargetValue < fPositionOf) {
                                this.L$0 = null;
                                this.L$1 = null;
                                this.label = 3;
                                if (AnchoredDraggableKt.animateTo(this.$this_animateToWithDecay, f2, anchoredDragScope, draggableAnchors, obj2, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                this.$remainingVelocity.element = 0.0f;
                            } else {
                                AnimationState animationStateAnimationState$default = AnimationStateKt.AnimationState$default(floatRef.element, this.$velocity, 0L, 0L, false, 28, null);
                                DecayAnimationSpec<Float> decayAnimationSpec = this.$this_animateToWithDecay.getDecayAnimationSpec();
                                final Ref.FloatRef floatRef2 = this.$remainingVelocity;
                                this.L$0 = null;
                                this.L$1 = null;
                                this.label = 2;
                                if (SuspendAnimationKt.animateDecay$default(animationStateAnimationState$default, decayAnimationSpec, false, new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt.animateToWithDecay.2.3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                                        invoke2(animationScope);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(AnimationScope<Float, AnimationVector1D> animationScope) {
                                        if (Math.abs(animationScope.getValue().floatValue()) >= Math.abs(fPositionOf)) {
                                            float fCoerceToTarget = AnchoredDraggableKt.coerceToTarget(animationScope.getValue().floatValue(), fPositionOf);
                                            anchoredDragScope.dragTo(fCoerceToTarget, animationScope.getVelocity().floatValue());
                                            floatRef2.element = Float.isNaN(animationScope.getVelocity().floatValue()) ? 0.0f : animationScope.getVelocity().floatValue();
                                            floatRef.element = fCoerceToTarget;
                                            animationScope.cancelAnimation();
                                            return;
                                        }
                                        anchoredDragScope.dragTo(animationScope.getValue().floatValue(), animationScope.getVelocity().floatValue());
                                        floatRef2.element = animationScope.getVelocity().floatValue();
                                        floatRef.element = animationScope.getValue().floatValue();
                                    }
                                }, this, 2, null) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        }
                    }
                }
            } else if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
                this.$remainingVelocity.element = 0.0f;
            } else if (i2 == 2) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$remainingVelocity.element = 0.0f;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float coerceToTarget(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        return f3 > 0.0f ? RangesKt.coerceAtMost(f2, f3) : RangesKt.coerceAtLeast(f2, f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <I> java.lang.Object restartable(kotlin.jvm.functions.Function0<? extends I> r5, kotlin.jvm.functions.Function2<? super I, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.AnchoredDraggableKt.C04371
            if (r0 == 0) goto L24
            r4 = r7
            androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1 r4 = (androidx.compose.foundation.gestures.AnchoredDraggableKt.C04371) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2 + r1
            r2 = r2 | r1
            int r0 = r0 - r2
            if (r0 == 0) goto L24
            int r0 = r4.label
            int r0 = r0 - r1
            r4.label = r0
        L16:
            java.lang.Object r1 = r4.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L36
            if (r0 != r2) goto L2e
            goto L2a
        L24:
            androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1 r4 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1
            r4.<init>(r7)
            goto L16
        L2a:
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L4a
            goto L4a
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L36:
            kotlin.ResultKt.throwOnFailure(r1)
            androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2 r1 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L4a
            r0 = 0
            r1.<init>(r5, r6, r0)     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L4a
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L4a
            r4.label = r2     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L4a
            java.lang.Object r0 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r1, r4)     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L4a
            if (r0 != r3) goto L4a
            return r3
        L4a:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableKt.restartable(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bӵLc\u000b\u0004OيH\u000b\\A\u001f$2ߚ\u0006\u0007\u000fjg1\u000bͧ\u0007"}, d2 = {"\n`]<a@F])\rS", "", "\u0017", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aUi\u0018\u000e\u0014\u001c \u0014\u0014t$\u0014\u001b\u001c\u0017\u0019$\u001e\u0005/_/#24\"47%'2,kz", f = "\u000e:.28:,*\t6$)(!!*\"i&.", i = {}, l = {1114}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class C04382 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<I, Continuation<? super Unit>, Object> $block;
        final /* synthetic */ Function0<I> $inputs;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C04382(Function0<? extends I> function0, Function2<? super I, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C04382> continuation) {
            super(2, continuation);
            this.$inputs = function0;
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C04382 c04382 = new C04382(this.$inputs, this.$block, continuation);
            c04382.L$0 = obj;
            return c04382;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C04382) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                this.label = 1;
                if (SnapshotStateKt.snapshotFlow(this.$inputs).collect(new AnonymousClass1(objectRef, coroutineScope, this.$block), this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: AnchoredDraggable.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJe\u0003İY\u0006^\nND\u0005Ӭ:\u0012(\u000btkQ0\u000be\u000f\u0097\u0011ޚ.\u0011q}B'"}, d2 = {"\n`]<a@F])\rS", "", "\u0017", ":`c2f;\"\\$\u000f\nl", "3lXA", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxW:\u00012?i\r$@m$w+MDz8'%dp=\u0011l\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        static final class AnonymousClass1<T> implements FlowCollector {
            final /* synthetic */ CoroutineScope $$this$coroutineScope;
            final /* synthetic */ Function2<I, Continuation<? super Unit>, Object> $block;
            final /* synthetic */ Ref.ObjectRef<Job> $previousDrag;

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(Ref.ObjectRef<Job> objectRef, CoroutineScope coroutineScope, Function2<? super I, ? super Continuation<? super Unit>, ? extends Object> function2) {
                this.$previousDrag = objectRef;
                this.$$this$coroutineScope = coroutineScope;
                this.$block = function2;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(I r11, kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
                /*
                    r10 = this;
                    boolean r0 = r12 instanceof androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1
                    if (r0 == 0) goto L74
                    r4 = r12
                    androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1 r4 = (androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1) r4
                    int r2 = r4.label
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    int r0 = r2 + r1
                    r2 = r2 | r1
                    int r0 = r0 - r2
                    if (r0 == 0) goto L74
                    int r0 = r4.label
                    int r0 = r0 - r1
                    r4.label = r0
                L16:
                    java.lang.Object r1 = r4.result
                    java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r0 = r4.label
                    r2 = 1
                    if (r0 == 0) goto L4e
                    if (r0 != r2) goto L7a
                    java.lang.Object r0 = r4.L$2
                    kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
                    java.lang.Object r11 = r4.L$1
                    java.lang.Object r0 = r4.L$0
                    androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1 r0 = (androidx.compose.foundation.gestures.AnchoredDraggableKt.C04382.AnonymousClass1) r0
                    kotlin.ResultKt.throwOnFailure(r1)
                L30:
                    kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.Job> r3 = r0.$previousDrag
                    kotlinx.coroutines.CoroutineScope r4 = r0.$$this$coroutineScope
                    kotlinx.coroutines.CoroutineStart r6 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
                    androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2 r7 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2
                    kotlin.jvm.functions.Function2<I, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r2 = r0.$block
                    kotlinx.coroutines.CoroutineScope r1 = r0.$$this$coroutineScope
                    r0 = 0
                    r7.<init>(r2, r11, r1, r0)
                    kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
                    r8 = 1
                    r9 = 0
                    r5 = 0
                    kotlinx.coroutines.Job r0 = kotlinx.coroutines.BuildersKt.launch$default(r4, r5, r6, r7, r8, r9)
                    r3.element = r0
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                L4e:
                    kotlin.ResultKt.throwOnFailure(r1)
                    kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.Job> r0 = r10.$previousDrag
                    T r1 = r0.element
                    kotlinx.coroutines.Job r1 = (kotlinx.coroutines.Job) r1
                    if (r1 == 0) goto L72
                    androidx.compose.foundation.gestures.AnchoredDragFinishedSignal r0 = new androidx.compose.foundation.gestures.AnchoredDragFinishedSignal
                    r0.<init>()
                    java.util.concurrent.CancellationException r0 = (java.util.concurrent.CancellationException) r0
                    r1.cancel(r0)
                    r4.L$0 = r10
                    r4.L$1 = r11
                    r4.L$2 = r1
                    r4.label = r2
                    java.lang.Object r0 = r1.join(r4)
                    if (r0 != r3) goto L72
                    return r3
                L72:
                    r0 = r10
                    goto L30
                L74:
                    androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1 r4 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1
                    r4.<init>(r10, r12)
                    goto L16
                L7a:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r0)
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableKt.C04382.AnonymousClass1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: AnchoredDraggable.kt */
            @InterfaceC1492Gx
            @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bӵLc\u000b\u0004OيH\u000b\\A\u001f$2ߚ\u0006\u0007\u000fjg1\u000bͧ\u0007"}, d2 = {"\n`]<a@F])\rS", "", "\u0017", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
            @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aUi\u0018\u000e\u0014\u001c \u0014\u0014t$\u0014\u001b\u001c\u0017\u0019$\u001e\u0005/_/#24\"47%'2,kzm{o~", f = "\u000e:.28:,*\t6$)(!!*\"i&.", i = {}, l = {1120}, m = "8>GA>9(KJH>H?", n = {}, s = {})
            static final class C00182 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ CoroutineScope $$this$coroutineScope;
                final /* synthetic */ Function2<I, Continuation<? super Unit>, Object> $block;
                final /* synthetic */ I $latestInputs;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C00182(Function2<? super I, ? super Continuation<? super Unit>, ? extends Object> function2, I i2, CoroutineScope coroutineScope, Continuation<? super C00182> continuation) {
                    super(2, continuation);
                    this.$block = function2;
                    this.$latestInputs = i2;
                    this.$$this$coroutineScope = coroutineScope;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C00182(this.$block, this.$latestInputs, this.$$this$coroutineScope, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C00182) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        Function2<I, Continuation<? super Unit>, Object> function2 = this.$block;
                        I i3 = this.$latestInputs;
                        this.label = 1;
                        if (function2.invoke(i3, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    CoroutineScopeKt.cancel(this.$$this$coroutineScope, new AnchoredDragFinishedSignal());
                    return Unit.INSTANCE;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> MapDraggableAnchors<T> emptyDraggableAnchors() {
        return new MapDraggableAnchors<>(new MutableObjectFloatMap(0, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c A[PHI: r17
  0x005c: PHI (r17v4 float) = (r17v3 float), (r17v5 float) binds: [B:10:0x0030, B:19:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <K> float minValueOrNaN(androidx.collection.ObjectFloatMap<K> r17) {
        /*
            r2 = r17
            int r1 = r2.getSize()
            r0 = 1
            if (r1 != r0) goto Lc
            r0 = 2143289344(0x7fc00000, float:NaN)
            return r0
        Lc:
            float[] r11 = r2.values
            long[] r10 = r2.metadata
            int r0 = r10.length
            int r9 = r0 + (-2)
            r17 = 2139095040(0x7f800000, float:Infinity)
            if (r9 < 0) goto L61
            r16 = 0
            r8 = r16
        L1b:
            r3 = r10[r8]
            long r0 = ~r3
            r2 = 7
            long r0 = r0 << r2
            long r0 = r0 & r3
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r12 = -1
            long r5 = r12 - r0
            long r0 = r12 - r14
            long r5 = r5 | r0
            long r12 = r12 - r5
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 == 0) goto L5c
            int r0 = r8 - r9
            int r0 = ~r0
            int r0 = r0 >>> 31
            r7 = 8
            int r6 = 8 - r0
            r5 = r16
        L3d:
            if (r5 >= r6) goto L5a
            r0 = 255(0xff, double:1.26E-321)
            long r12 = r0 + r3
            long r0 = r0 | r3
            long r12 = r12 - r0
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 >= 0) goto L56
            int r0 = r8 << 3
            int r0 = r0 + r5
            r1 = r11[r0]
            int r0 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r0 > 0) goto L56
            r17 = r1
        L56:
            long r3 = r3 >> r7
            int r5 = r5 + 1
            goto L3d
        L5a:
            if (r6 != r7) goto L61
        L5c:
            if (r8 == r9) goto L61
            int r8 = r8 + 1
            goto L1b
        L61:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableKt.minValueOrNaN(androidx.collection.ObjectFloatMap):float");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052 A[PHI: r15
  0x0052: PHI (r15v4 float) = (r15v3 float), (r15v5 float) binds: [B:10:0x002b, B:19:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <K> float maxValueOrNaN(androidx.collection.ObjectFloatMap<K> r15) {
        /*
            int r1 = r15.getSize()
            r0 = 1
            if (r1 != r0) goto La
            r0 = 2143289344(0x7fc00000, float:NaN)
            return r0
        La:
            float[] r11 = r15.values
            long[] r10 = r15.metadata
            int r0 = r10.length
            int r9 = r0 + (-2)
            r15 = -8388608(0xffffffffff800000, float:-Infinity)
            if (r9 < 0) goto L57
            r14 = 0
            r8 = r14
        L17:
            r3 = r10[r8]
            long r0 = ~r3
            r2 = 7
            long r0 = r0 << r2
            long r12 = r0 + r3
            long r0 = r0 | r3
            long r12 = r12 - r0
            r5 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r1 = r12 + r5
            long r12 = r12 | r5
            long r1 = r1 - r12
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L52
            int r0 = r8 - r9
            int r0 = ~r0
            int r0 = r0 >>> 31
            r7 = 8
            int r6 = 8 - r0
            r5 = r14
        L37:
            if (r5 >= r6) goto L50
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r3
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 >= 0) goto L4c
            int r0 = r8 << 3
            int r0 = r0 + r5
            r1 = r11[r0]
            int r0 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r0 < 0) goto L4c
            r15 = r1
        L4c:
            long r3 = r3 >> r7
            int r5 = r5 + 1
            goto L37
        L50:
            if (r6 != r7) goto L57
        L52:
            if (r8 == r9) goto L57
            int r8 = r8 + 1
            goto L17
        L57:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableKt.maxValueOrNaN(androidx.collection.ObjectFloatMap):float");
    }
}
