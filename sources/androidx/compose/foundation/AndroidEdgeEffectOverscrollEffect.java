package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	... 4 more
    */
/* JADX INFO: compiled from: AndroidOverscroll.android.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я|\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njO0LeN.ZS@\u000fsڔ<$q$yCAV\"}0\u0012WNmmvJp\u000bKƤ\u000e\u0016\u000fj4կ]xs\u0012\u00172PoG3SsE9vt>ӌ(288\u0002\u0005\u0017\u001a2H\u001e͌\u0003CQ\u000f\u001a0VpBĥ\u0015M\u001b\u001a\u001a\u0006D&\t\u001ejlV6N|cŽE݊3ipMgr@\u0001[\r^TU\u000e\u0007e,-X7c\u0018ȏW\u0003\u0015V$E\u0011`\n=3\u0006m's\u0007\u0002yNX.1E/]0urT\u00015qn1?GUb[R\u001e(&\u001f\f\u0015L\n\u001e\b7H\\QH\u000e\u0018\u0012Cv\tRnx0\u0005\tȬ9̡5ЍӾ\u000451b)\u0011\u001a\u0016IDf7*\u001f=\"1-\u0007!\nn>d#Hlw\u007f_\u0002PKwf\u0016i?}\u0004\u001f|\u0012,\u00140u\u001a],WBш$ڛ٦=%'\u001d\u0010z\rz\u00058xh\u0002\u0004\u0019̲ڐ!mߤ6ѧÁ\u0010\\J\u0019\u0013!\u0019_fb)MJqMâݔ\u0017 b/\u000593HfO\u0017#\u001bQkD=/\u0015Q nā\rãߍb5;\rqL*j\u0005QW<\u0011>\tjP\u000e$Z\u000bBh2̄iݘȑ\u007fFTJ!n\b\n*sD1G\u0016EL\u0011XZA+#&ZՉ\u000fзՁ7&\t*21Q\u0019^\u001e\to\u00162y0\u000b\u001b:-ok{\u0019ƘTȨמ8~)I\r0H_u\u0010_L\u001b%&Y\nL.\u001agku=Ҙ\u000eȯȞ6\u00043\nZ8.W[X?z+\tU;1FuO\u0003pZ}\u001bN]\u001d/\"%d9ּСcр\u05fbeH\u0001\u0011q\u001f[oLN\u000b\u0003\bB%˾\tŷ\u001eǇߋ\u007fnݕ\u000175C5$f\u0004\"7-a\frFІ{ˏ\u0013&|ЁT>q \bb\u007fh\tօ:ա]\u0005FЭ<n\tNVwH*P\u0017L\raWwЬ/މ\u000fԉ\u0017ɣ\u0002x\u000fԭ\u001dr\\kH$\b\u007f:@m=\u0014E\u0004(lXu#[i\u007fm\u001cZ\u0013_!ؑ\fν\u007f5\u0007\u0014\"S.i(v\u0017G\u001eu.5oS9ŠH˸#҉˯;\u0007դGTqв`\u000f\u000e_w\u0011-1p\u000e\u0012ٜ\u001a\u0603wִȀG\u0004ޝI`)ơQ\u0017\u001dN6~E3\u0015mtq]\u007f\tܭU\u009b\r!rʪ\u0017h+IRs\n'6x\u0019\u000bsl\u001a̵\u000e\u0530\bG1Ԗ£o\u0015@\u001b\u0003ܪ^F\u001aAQ\u0017~ۤ4*"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0001>X\u000b*;lu-OC\u001bl5\u001e\u0013wKJ\u0007p:L\u00041NS.-]RpLi", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u000fFY\u000b.5z 5T#<l4\u001c$>", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "=uT?f*K] \u0006Xh5}\r1", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u000fFY\u000b.5z 5T!Et5\"\u0017xn5\u0016g6WL", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt8\u007f$Bc\u0002\u001fJ7\u00148UNEy4g\u0016rqB\u0006_;R\u00010\u00116_,i`pJ\u001e\u0019akX4\u000e\t[Q1jS;)\u0011\u0002\rr", "1n]AT0GS&l~s,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "\u0018", "3cV28-?S\u0017\u000elk(\b\u0014/r", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u00054[}\u007f8n\u0016,\\5Hg?)\u0015u7", "3eU2V;&]\u0018\u0003{b,\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "5dc\u0012Y->Q(f\u0005]0}\r/r", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`~Qn\u0012=z%B/", "7me._0=O(\u0003\u0005g\f\u0006\u0005,l\u007f'", "", "5dc\u0016a=:Z\u001d}vm0\u0007\u0012\u000fn{%\u0003@\u007fU\u0018Q\u007f\u0017;r49c\u0007\u001aDm\u001d.IQ;*0'\u001erp5\u0016g6W\u0005", "u(E", "5dc\u0016a=:Z\u001d}vm0\u0007\u0012\u000fn{%\u0003@\u007fU\u0018Q\u007f\u0017;r49c\u0007\u001aDm\u001d.IQ;", "u(I", "Adc\u0016a=:Z\u001d}vm0\u0007\u0012\u000fn{%\u0003@\u007fU\u0018Q\u007f\u0017;r49c\u0007\u001aDm\u001d.IQ;", "uY\u0018#", "7r8;C9HU&~\tl", ">nX;g,K7\u0018", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018\u001dj", ">nX;g,K>#\r~m0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "@dS?T>,W\u001b\bve", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "", "5dc\u001fX+KO+l~`5x\u0010mf\n8\u0005?|&\u001bQx\bIv,5U\f ", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006^5DUz'7[%*\\C\u0011", "Aba<_3\u001cg\u0017\u0006zB5g\u00169g\r(\nN", "/mX:T;>B#kze,x\u0017/", "/o_9l\u001bH4 \u0003\u0004`", "Dd[<V0Mg", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9~<}/3]\r4\r", ">da3b9F4 \u0003\u0004`", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "/o_9l\u001bH4 \u0003\u0004`sYp\u001cWN(g", "uI;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bJu\u001es =TGD52(\"rqH\u000bl,\\@\u0005QU]0ebnL\u0018\u001ccc\u0012\u0012\u0012\u0001j=mu@@!Q\u0016F\u0007;f\u0010a", "/o_9l\u001bHA\u0017\f\u0005e3", "2d[AT", "And?V,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WEv3DY|.5z 5T\r$kB-\u0015gO7\u0014m3Ud1WYL,2", ">da3b9FA\u0017\f\u0005e3", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "/o_9l\u001bHA\u0017\f\u0005e3Du2a\u0006%\u0011\u000b", "uI8\u0019^6MZ\u001d\bDc=\u0005R0u\t&\u000bD\u000b %\u0011P\u001eEt49c\u0007k\r1z", "2hb=_(<S!~\u0004m", "2hb=_(<S!~\u0004ms]T\r5\\\u001aF~\u0002!'Pn\nKz/>S\u000b >m\u0012<M", "u(9", "7me._0=O(~do,\n\u0017-r\n/\u0003", "7me._0=O(~do,\n\u0017-r\n/\u0003~\u0002!'Pn\nKz/>S\u000b >m\u0012<M", ">t[956Mb#\u0007", "", "Aba<_3", ">t[956Mb#\u0007BdsK\u0010\u001b0g", "uI\u0018\u0013", ">t[9?,?b", ">t[9?,?b`\u0005B-3hS\u0017", ">t[9E0@V(", ">t[9E0@V(F\u0001&z\u0004tyM", ">t[9G6I", ">t[9G6I\u001b\u001fFIe\u0018Gp", "@d[2T:>=$\n\u0005l0\f\t\u0019v\u007f5\n>\u000e!\u001eN", "@d[2T:>=$\n\u0005l0\f\t\u0019v\u007f5\n>\u000e!\u001eN7\u0014\u0004E,!$e", "uI\u0018'", "As^=B=>`'|\bh3\u0004d8i\b$\u000bD\u000b ", "CoS.g,,W.~", "Ahi2", "CoS.g,,W.~Bn=\u0011|\rj\u0006f|J\u0011 \u0016C~\u0012F\u007f\u001fBY\u0005 3{\u0016", "uI\u0018#", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AndroidEdgeEffectOverscrollEffect implements OverscrollEffect {
    public static final int $stable = 0;
    private long containerSize;
    private final EdgeEffectWrapper edgeEffectWrapper;
    private final Modifier effectModifier;
    private boolean invalidationEnabled;
    private PointerId pointerId;
    private Offset pointerPosition;
    private final MutableState<Unit> redrawSignal;
    private boolean scrollCycleInProgress;

    public static /* synthetic */ void getInvalidationEnabled$foundation_release$annotations() {
    }

    public AndroidEdgeEffectOverscrollEffect(Context context, OverscrollConfiguration overscrollConfiguration) {
        Modifier drawGlowOverscrollModifier;
        EdgeEffectWrapper edgeEffectWrapper = new EdgeEffectWrapper(context, ColorKt.m4232toArgb8_81llA(overscrollConfiguration.m661getGlowColor0d7_KjU()));
        this.edgeEffectWrapper = edgeEffectWrapper;
        this.redrawSignal = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
        this.invalidationEnabled = true;
        this.containerSize = Size.Companion.m4015getZeroNHjbRc();
        Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, Unit.INSTANCE, new AndroidEdgeEffectOverscrollEffect$effectModifier$1(this, null));
        if (Build.VERSION.SDK_INT >= 31) {
            drawGlowOverscrollModifier = new DrawStretchOverscrollModifier(this, edgeEffectWrapper, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$special$$inlined$debugInspectorInfo$1
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
                    inspectorInfo.setName("overscroll");
                    inspectorInfo.setValue(this.this$0);
                }
            } : InspectableValueKt.getNoInspectorInfo());
        } else {
            drawGlowOverscrollModifier = new DrawGlowOverscrollModifier(this, edgeEffectWrapper, overscrollConfiguration, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$special$$inlined$debugInspectorInfo$2
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
                    inspectorInfo.setName("overscroll");
                    inspectorInfo.setValue(this.this$0);
                }
            } : InspectableValueKt.getNoInspectorInfo());
        }
        this.effectModifier = modifierPointerInput.then(drawGlowOverscrollModifier);
    }

    public final MutableState<Unit> getRedrawSignal$foundation_release() {
        return this.redrawSignal;
    }

    public final boolean getInvalidationEnabled$foundation_release() {
        return this.invalidationEnabled;
    }

    public final void setInvalidationEnabled$foundation_release(boolean z2) {
        this.invalidationEnabled = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009e  */
    @Override // androidx.compose.foundation.OverscrollEffect
    /* JADX INFO: renamed from: applyToScroll-Rhakbz0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo555applyToScrollRhakbz0(long r13, int r15, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, androidx.compose.ui.geometry.Offset> r16) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.mo555applyToScrollRhakbz0(long, int, kotlin.jvm.functions.Function1):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ab  */
    @Override // androidx.compose.foundation.OverscrollEffect
    /* JADX INFO: renamed from: applyToFling-BMRW4eQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo554applyToFlingBMRW4eQ(long r9, kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Velocity, ? super kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity>, ? extends java.lang.Object> r11, kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.mo554applyToFlingBMRW4eQ(long, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public boolean isInProgress() {
        EdgeEffectWrapper edgeEffectWrapper = this.edgeEffectWrapper;
        EdgeEffect edgeEffect = edgeEffectWrapper.topEffect;
        if (edgeEffect != null && EdgeEffectCompat.INSTANCE.getDistanceCompat(edgeEffect) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect2 = edgeEffectWrapper.bottomEffect;
        if (edgeEffect2 != null && EdgeEffectCompat.INSTANCE.getDistanceCompat(edgeEffect2) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect3 = edgeEffectWrapper.leftEffect;
        if (edgeEffect3 != null && EdgeEffectCompat.INSTANCE.getDistanceCompat(edgeEffect3) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect4 = edgeEffectWrapper.rightEffect;
        return (edgeEffect4 == null || EdgeEffectCompat.INSTANCE.getDistanceCompat(edgeEffect4) == 0.0f) ? false : true;
    }

    private final boolean stopOverscrollAnimation() {
        boolean z2;
        if (this.edgeEffectWrapper.isLeftStretched()) {
            m550pullLeftk4lQ0M(Offset.Companion.m3953getZeroF1C5BW0());
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.edgeEffectWrapper.isRightStretched()) {
            m551pullRightk4lQ0M(Offset.Companion.m3953getZeroF1C5BW0());
            z2 = true;
        }
        if (this.edgeEffectWrapper.isTopStretched()) {
            m552pullTopk4lQ0M(Offset.Companion.m3953getZeroF1C5BW0());
            z2 = true;
        }
        if (!this.edgeEffectWrapper.isBottomStretched()) {
            return z2;
        }
        m549pullBottomk4lQ0M(Offset.Companion.m3953getZeroF1C5BW0());
        return true;
    }

    /* JADX INFO: renamed from: updateSize-uvyYCjk$foundation_release, reason: not valid java name */
    public final void m557updateSizeuvyYCjk$foundation_release(long j2) {
        boolean zM4002equalsimpl0 = Size.m4002equalsimpl0(this.containerSize, Size.Companion.m4015getZeroNHjbRc());
        boolean zM4002equalsimpl02 = Size.m4002equalsimpl0(j2, this.containerSize);
        this.containerSize = j2;
        if (!zM4002equalsimpl02) {
            this.edgeEffectWrapper.m628setSizeozmzZPI(IntSizeKt.IntSize(MathKt.roundToInt(Size.m4006getWidthimpl(j2)), MathKt.roundToInt(Size.m4003getHeightimpl(j2))));
        }
        if (zM4002equalsimpl0 || zM4002equalsimpl02) {
            return;
        }
        invalidateOverscroll$foundation_release();
        animateToRelease();
    }

    /* JADX INFO: renamed from: displacement-F1C5BW0$foundation_release, reason: not valid java name */
    public final long m556displacementF1C5BW0$foundation_release() {
        Offset offset = this.pointerPosition;
        long jM3947unboximpl = offset != null ? offset.m3947unboximpl() : SizeKt.m4016getCenteruvyYCjk(this.containerSize);
        return OffsetKt.Offset(Offset.m3937getXimpl(jM3947unboximpl) / Size.m4006getWidthimpl(this.containerSize), Offset.m3938getYimpl(jM3947unboximpl) / Size.m4003getHeightimpl(this.containerSize));
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public Modifier getEffectModifier() {
        return this.effectModifier;
    }

    public final void invalidateOverscroll$foundation_release() {
        if (this.invalidationEnabled) {
            this.redrawSignal.setValue(Unit.INSTANCE);
        }
    }

    private final void animateToRelease() {
        boolean zIsFinished;
        EdgeEffectWrapper edgeEffectWrapper = this.edgeEffectWrapper;
        EdgeEffect edgeEffect = edgeEffectWrapper.topEffect;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = edgeEffect.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = edgeEffectWrapper.bottomEffect;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished = edgeEffect2.isFinished() || zIsFinished;
        }
        EdgeEffect edgeEffect3 = edgeEffectWrapper.leftEffect;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished = edgeEffect3.isFinished() || zIsFinished;
        }
        EdgeEffect edgeEffect4 = edgeEffectWrapper.rightEffect;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished = edgeEffect4.isFinished() || zIsFinished;
        }
        if (zIsFinished) {
            invalidateOverscroll$foundation_release();
        }
    }

    /* JADX INFO: renamed from: releaseOppositeOverscroll-k-4lQ0M, reason: not valid java name */
    private final boolean m553releaseOppositeOverscrollk4lQ0M(long j2) {
        boolean z2;
        boolean z3 = true;
        if (this.edgeEffectWrapper.isLeftAnimating() && Offset.m3937getXimpl(j2) < 0.0f) {
            EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.edgeEffectWrapper.getOrCreateLeftEffect(), Offset.m3937getXimpl(j2));
            z2 = !this.edgeEffectWrapper.isLeftAnimating();
        } else {
            z2 = false;
        }
        if (this.edgeEffectWrapper.isRightAnimating() && Offset.m3937getXimpl(j2) > 0.0f) {
            EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.edgeEffectWrapper.getOrCreateRightEffect(), Offset.m3937getXimpl(j2));
            z2 = z2 || !this.edgeEffectWrapper.isRightAnimating();
        }
        if (this.edgeEffectWrapper.isTopAnimating() && Offset.m3938getYimpl(j2) < 0.0f) {
            EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.edgeEffectWrapper.getOrCreateTopEffect(), Offset.m3938getYimpl(j2));
            z2 = z2 || !this.edgeEffectWrapper.isTopAnimating();
        }
        if (!this.edgeEffectWrapper.isBottomAnimating() || Offset.m3938getYimpl(j2) <= 0.0f) {
            return z2;
        }
        EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.edgeEffectWrapper.getOrCreateBottomEffect(), Offset.m3938getYimpl(j2));
        if (!z2 && this.edgeEffectWrapper.isBottomAnimating()) {
            z3 = false;
        }
        return z3;
    }

    /* JADX INFO: renamed from: pullTop-k-4lQ0M, reason: not valid java name */
    private final float m552pullTopk4lQ0M(long j2) {
        float fM3937getXimpl = Offset.m3937getXimpl(m556displacementF1C5BW0$foundation_release());
        float fM3938getYimpl = Offset.m3938getYimpl(j2) / Size.m4003getHeightimpl(this.containerSize);
        EdgeEffect orCreateTopEffect = this.edgeEffectWrapper.getOrCreateTopEffect();
        return EdgeEffectCompat.INSTANCE.getDistanceCompat(orCreateTopEffect) == 0.0f ? EdgeEffectCompat.INSTANCE.onPullDistanceCompat(orCreateTopEffect, fM3938getYimpl, fM3937getXimpl) * Size.m4003getHeightimpl(this.containerSize) : Offset.m3938getYimpl(j2);
    }

    /* JADX INFO: renamed from: pullBottom-k-4lQ0M, reason: not valid java name */
    private final float m549pullBottomk4lQ0M(long j2) {
        float fM3937getXimpl = Offset.m3937getXimpl(m556displacementF1C5BW0$foundation_release());
        float fM3938getYimpl = Offset.m3938getYimpl(j2) / Size.m4003getHeightimpl(this.containerSize);
        EdgeEffect orCreateBottomEffect = this.edgeEffectWrapper.getOrCreateBottomEffect();
        return EdgeEffectCompat.INSTANCE.getDistanceCompat(orCreateBottomEffect) == 0.0f ? (-EdgeEffectCompat.INSTANCE.onPullDistanceCompat(orCreateBottomEffect, -fM3938getYimpl, 1 - fM3937getXimpl)) * Size.m4003getHeightimpl(this.containerSize) : Offset.m3938getYimpl(j2);
    }

    /* JADX INFO: renamed from: pullLeft-k-4lQ0M, reason: not valid java name */
    private final float m550pullLeftk4lQ0M(long j2) {
        float fM3938getYimpl = Offset.m3938getYimpl(m556displacementF1C5BW0$foundation_release());
        float fM3937getXimpl = Offset.m3937getXimpl(j2) / Size.m4006getWidthimpl(this.containerSize);
        EdgeEffect orCreateLeftEffect = this.edgeEffectWrapper.getOrCreateLeftEffect();
        return EdgeEffectCompat.INSTANCE.getDistanceCompat(orCreateLeftEffect) == 0.0f ? EdgeEffectCompat.INSTANCE.onPullDistanceCompat(orCreateLeftEffect, fM3937getXimpl, 1 - fM3938getYimpl) * Size.m4006getWidthimpl(this.containerSize) : Offset.m3937getXimpl(j2);
    }

    /* JADX INFO: renamed from: pullRight-k-4lQ0M, reason: not valid java name */
    private final float m551pullRightk4lQ0M(long j2) {
        float fM3938getYimpl = Offset.m3938getYimpl(m556displacementF1C5BW0$foundation_release());
        float fM3937getXimpl = Offset.m3937getXimpl(j2) / Size.m4006getWidthimpl(this.containerSize);
        EdgeEffect orCreateRightEffect = this.edgeEffectWrapper.getOrCreateRightEffect();
        return EdgeEffectCompat.INSTANCE.getDistanceCompat(orCreateRightEffect) == 0.0f ? (-EdgeEffectCompat.INSTANCE.onPullDistanceCompat(orCreateRightEffect, -fM3937getXimpl, fM3938getYimpl)) * Size.m4006getWidthimpl(this.containerSize) : Offset.m3937getXimpl(j2);
    }
}
