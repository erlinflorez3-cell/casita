package androidx.compose.foundation.layout;

import android.graphics.Insets;
import android.os.CancellationSignal;
import android.view.View;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Velocity;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Job;
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
/* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яx\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP\u008cZS@\u000fs{:$c$\bCC٥\"}8\tWȞog\u0005JbŏK\u000f\u001c\u0016\u0001j2J]xk\u001b\u0017˰JoM8UoC>htD\u0005(2(:\u0002\u0005\u0017\u001a2H\u0016\u0004\u0003Ca\f\u001aؓHpPR\u0015M\u000b\"\u001a\u0006L&\t\u001ebkT7^Ǎ\u000e:]\"3ipNg\u0003@\u0001[\u000e^TU\u000f\u0007e,.X7c\u00195W\u0011\fj[m\tOuK\f\u0001'U3ʁwWDaH\"#Ig\r\f\u0012V`\u0013qx\fUB\u0016c\u0014V\u001cI\u0010z*,\u0003\u0004V\n5jF-H\u0006P7A\u0018\u000bSnt2bP%\u0013ad;U\u0004AQQ\u001b\u0015h\u0012?'uO{3\"dŃ?ϒ żڍ\u0012b\u001bCb!\u001a?_jUJd\t\bH4Ց/Ċ\u0006*\u0012[\u0010\u0010=().EDgaGP9m\u0018Grr=\u0019)va\u0018jHnA\u001f\u001aEW!\f\tO+\u00194qb\bD\u0011{@\u0005\u000b\f8+ \u000b\u001cl%35fO\u0017\u000e1ܫ\u001cݼ$ÄϬ;[t\u001d\u001c\n\u0002\u0007Ahic>\u0016\u0003z\"oTb3\r\u0017Fa1r\\VVbLxE\u0010{r\u0005R'֮>ڤʬ8.7PjM\u0011\u001c,{Y|7\u0004\u000bl\u001e$l3R'0˜3נ\u007fˆʷtqm3WgE\u00010iYQcMVY0\u000eL|Q;/w\u000e|\u007fLu\u00033*çTݨ°\u001a\u001c?\u000f={[%\rhJ\u0002[d|vs~e\u0012U\u0006-}\u001d{\u0001.\u0016I1\u0005tfx\rgTEA=^;C\u0016(\u0018y\u0010z+Kqy#[l}#\u0007g\u0001f8+\u001ce\u001eߋ\u007fǻݕ\u000173\t5cf\u0006\"9-csh\u001e9Pʯ\u001b֑xe\fϺ4$}ni_H:fV0˝Jѐ(l\u000bܩ\u0019v\u0006\u0016Z\tb\u001c\nǨCяtV@ԇ[E\fv\u001f6\u001dtf]P\u0012\u001e\tJ-\u000e;Jʘ\nљbC-ݎ\u001ebut\u0006K\u000b\u0013Ί\u0013\u0010\u0013֊Ip\u0018.K3'cp\u001dH\u0006\"-\rאGك\t<\u0011ӗ\u00058J\u001e#C\u0003\u0001\\؎\u0007ķJ_\u0017ğ\u0003Q\u0002@n\u000e\u0003~חZN\rݺ]b'B\u000f\u0018_B,{M13qܑX5kѢ\u0019U##)\u0006 \u000et&CD\u0003;Ь,^\tՊ]_Ie\u0010SߧG.unuɑTF{ܱF_"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\b2VBE}\u0018'#hpGoc:]v&5J[6cYPG\u001d\u001bZ\f]/\u0017\u000e/", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WEv3DY|.5z 5T\r$kB-\u0015gO7\u0014m3UT1PUN*kV|Fi", "\u001a`]1e6BRb\u0010~^>Fz3n~2\u000e$\n%\u0017V}iEz-1h\u0002*@K 7\\PEr\u001b\"#waB\u0007p\u0002", "Eh]1b>\"\\'~\nl", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q7LPEo3\u0010\u0019q`C\u0019G5\\v6U\"", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "AhS26(EQ)\u0006vm6\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u00042LC\u0019g;\u001c%o]H\u0011p\u0002", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u0012*G|_\nVBHu8\u001d\u0007lj8\u0011u\u0010W\u0005'VZ$\u0013X[qJ\u001e\u0016YW_/\r\u0017#2(nV\r\u0006\u00045H\u000fEl\u007f\u001f_\f?r{Ld\u0010\u0011z\u001f\u0006J(dU]i\u0003\u0011HAv4t\u001b)\u000b`9:\u0002\u0010x\u0017+oL=\u0014\t)wn[xtqK\u0018\u000e\u0002\"HufPSo\u001fLxp/T\u007f\u0007[\u0011X}9x<\u0018\nm'", "/mX:T;B]\"\\\u0005g;\n\u00136l\u007f5", "\u001a`]1e6BRb\u0010~^>Fz3n~2\u000e$\n%\u0017V}iEz-1h\u0002*@K 7\\PEr;\u001e\">", "/mX:T;B]\"c\u0005[", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014l", "1`]0X3EO(\u0003\u0005g\u001a\u0001\u000b8a\u0007", "\u001a`]1e6BRb\t\t(\nx\u0012-e\u0007/wO\u0005! 5s\u0010Er,\u000b", "1n]A\\5NO(\u0003\u0005g", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e| \u0015Gv\u00158s,57\b)Fq\u001f>IR?u=s", "5dc\u0011X5LW(\u0013", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006U%>g\u0002/KC", "7r2<a;K] \u0006zk\u0019|\u0015?e\u000e7{?", "", ">`aA\\(E1#\b\tn4\b\u00183o\t", "", "5dc \\+>1\u0015\u0006xn3x\u00189r", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y4A}%w;G:k\u0012\u001a\u001cfq@\u0003r6[L", "5dc#\\,P", "u(;.a+K]\u001d}Do0|\u001bxV\u0004(\u000e\u0016", "5dc$\\5=]+b\u0004l,\f\u0017", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y4A}%w)L:x>\"\u0014ZeB\u0006m>2\u007f5G[\\\u0002", "/cYBf;\"\\'~\nl", "", "7mb2g", "/mX:T;B]\"^\u0004],{", "2hb=b:>", "4kX;Z", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9~<}/3]\r4\r", "/uP6_(;Z\u0019", "4kX;Z\bF])\b\n", "Bnf.e+,V#\u0011\u0004", "4kX;ZsAc\r\u0006\tJ\f", "uI5'?2Hb \u0003\u0004(*\u0007\u00169u\u000f,\u0005@\u000f`tQx\u001d@\u007f51h\u0002*@CY\u0015R?Lg}%\u0011qc\u0003p`1Nt6\u001d", "5dc\u000ea0FO(\u0003\u0005g\n\u0007\u0012>r\n/\u0003@\u000e", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "=m2.a*>Z ~y", "1n]Ae6EZ\u0019\f", "=m56a0LV\u0019}", "=m?<f;\u001fZ\u001d\b|", "1n]@h4>R", "=m?<f;\u001fZ\u001d\b|&\u0019qU3Ap\u001c", "uI9\u0019^6MZ\u001d\bD\\6\n\u0013?t\u00041{NJt!P~\u0012E\u0007!D]\b)\r1|3IT75;\u001a\u001ej+#\u0004h,L\u0006|", "=m?<f;,Q&\t\u0002e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "And?V,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WEv3DY|.5z 5T\r$kB-\u0015gO7\u0014m3Ud1WYL,2", "=m?<f;,Q&\t\u0002es[\u001e\u0019Qsrc", "uI9\u0016\u001c\u0011", "=m??X\rEW\"\u0001", "=m??X\rEW\"\u0001BJ\u001e\u0007\u0011zM\n", "uI;8b;EW\"Hxh9\u0007\u0019>i\t(\n\n^! Vs\u0017Lr49c\u0007uzT\u001b*^?\u0005r0'\u00172K6\fc*]L", "=m??X\u001a<`#\u0006\u0002", "=m??X\u001a<`#\u0006\u0002&\u0016\u0012gza].", "uI8u=", "=mA2T+R", "Bx_2f", "", "@d`BX:M/\"\u0003\u0003Z;\u0001\u00138C\n1\u000bM\u000b\u001e\u001eG|", "Aba<_3", "Aba<_3\u001a[#\u000f\u0004m", "Aba<_3\u0006&\u0007RkB;\u0003", "uI5u=", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class WindowInsetsNestedScrollConnection implements NestedScrollConnection, WindowInsetsAnimationControlListener {
    private WindowInsetsAnimationController animationController;
    private Job animationJob;
    private final CancellationSignal cancellationSignal = new CancellationSignal();
    private CancellableContinuation<? super WindowInsetsAnimationController> continuation;
    private final Density density;
    private boolean isControllerRequested;
    private float partialConsumption;
    private final SideCalculator sideCalculator;
    private final View view;
    private final AndroidWindowInsets windowInsets;

    public WindowInsetsNestedScrollConnection(AndroidWindowInsets androidWindowInsets, View view, SideCalculator sideCalculator, Density density) {
        this.windowInsets = androidWindowInsets;
        this.view = view;
        this.sideCalculator = sideCalculator;
        this.density = density;
    }

    public final AndroidWindowInsets getWindowInsets() {
        return this.windowInsets;
    }

    public final View getView() {
        return this.view;
    }

    public final SideCalculator getSideCalculator() {
        return this.sideCalculator;
    }

    public final Density getDensity() {
        return this.density;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestAnimationController() {
        if (this.isControllerRequested) {
            return;
        }
        this.isControllerRequested = true;
        WindowInsetsController windowInsetsController = this.view.getWindowInsetsController();
        if (windowInsetsController != null) {
            windowInsetsController.controlWindowInsetsAnimation(this.windowInsets.getType$foundation_layout_release(), -1L, null, this.cancellationSignal, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getAnimationController(Continuation<? super WindowInsetsAnimationController> continuation) throws Throwable {
        Object result = this.animationController;
        if (result == null) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            this.continuation = cancellableContinuationImpl;
            requestAnimationController();
            result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
        }
        return result;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
    public long mo1094onPreScrollOzD1aCk(long j2, int i2) {
        return m1092scroll8S9VItk(j2, this.sideCalculator.hideMotion(Offset.m3937getXimpl(j2), Offset.m3938getYimpl(j2)));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public long mo820onPostScrollDzOQY0M(long j2, long j3, int i2) {
        return m1092scroll8S9VItk(j3, this.sideCalculator.showMotion(Offset.m3937getXimpl(j3), Offset.m3938getYimpl(j3)));
    }

    /* JADX INFO: renamed from: scroll-8S9VItk, reason: not valid java name */
    private final long m1092scroll8S9VItk(long j2, float f2) {
        Job job = this.animationJob;
        if (job != null) {
            job.cancel((CancellationException) new WindowInsetsAnimationCancelledException());
            this.animationJob = null;
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (f2 != 0.0f) {
            if (this.windowInsets.isVisible() != (f2 > 0.0f) || windowInsetsAnimationController != null) {
                if (windowInsetsAnimationController == null) {
                    this.partialConsumption = 0.0f;
                    requestAnimationController();
                    return this.sideCalculator.mo1044consumedOffsetsMKHz9U(j2);
                }
                int iValueOf = this.sideCalculator.valueOf(windowInsetsAnimationController.getHiddenStateInsets());
                int iValueOf2 = this.sideCalculator.valueOf(windowInsetsAnimationController.getShownStateInsets());
                Insets currentInsets = windowInsetsAnimationController.getCurrentInsets();
                int iValueOf3 = this.sideCalculator.valueOf(currentInsets);
                if (iValueOf3 == (f2 > 0.0f ? iValueOf2 : iValueOf)) {
                    this.partialConsumption = 0.0f;
                    return Offset.Companion.m3953getZeroF1C5BW0();
                }
                float f3 = iValueOf3 + f2 + this.partialConsumption;
                int iCoerceIn = RangesKt.coerceIn(Math.round(f3), iValueOf, iValueOf2);
                this.partialConsumption = f3 - Math.round(f3);
                if (iCoerceIn != iValueOf3) {
                    windowInsetsAnimationController.setInsetsAndAlpha(this.sideCalculator.adjustInsets(currentInsets, iCoerceIn), 1.0f, 0.0f);
                }
                return this.sideCalculator.mo1044consumedOffsetsMKHz9U(j2);
            }
        }
        return Offset.Companion.m3953getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreFling-QWom1Mo, reason: not valid java name */
    public Object mo1093onPreFlingQWom1Mo(long j2, Continuation<? super Velocity> continuation) {
        return m1091flinghuYlsQE(j2, this.sideCalculator.hideMotion(Velocity.m6875getXimpl(j2), Velocity.m6876getYimpl(j2)), false, continuation);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    public Object mo819onPostFlingRZ2iAVY(long j2, long j3, Continuation<? super Velocity> continuation) {
        return m1091flinghuYlsQE(j3, this.sideCalculator.showMotion(Velocity.m6875getXimpl(j3), Velocity.m6876getYimpl(j3)), true, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0162  */
    /* JADX INFO: renamed from: fling-huYlsQE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m1091flinghuYlsQE(long r26, float r28, boolean r29, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.m1091flinghuYlsQE(long, float, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void adjustInsets(float f2) {
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (windowInsetsAnimationController != null) {
            windowInsetsAnimationController.setInsetsAndAlpha(this.sideCalculator.adjustInsets(windowInsetsAnimationController.getCurrentInsets(), Math.round(f2)), 1.0f, 0.0f);
        }
    }

    @Override // android.view.WindowInsetsAnimationControlListener
    public void onReady(WindowInsetsAnimationController windowInsetsAnimationController, int i2) {
        this.animationController = windowInsetsAnimationController;
        this.isControllerRequested = false;
        CancellableContinuation<? super WindowInsetsAnimationController> cancellableContinuation = this.continuation;
        if (cancellableContinuation != null) {
            cancellableContinuation.resume(windowInsetsAnimationController, new Function1<Throwable, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.onReady.1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }
            });
        }
        this.continuation = null;
    }

    public final void dispose() {
        CancellableContinuation<? super WindowInsetsAnimationController> cancellableContinuation = this.continuation;
        if (cancellableContinuation != null) {
            cancellableContinuation.resume((Object) null, new Function1<Throwable, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.dispose.1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }
            });
        }
        Job job = this.animationJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (windowInsetsAnimationController != null) {
            windowInsetsAnimationController.finish(!Intrinsics.areEqual(windowInsetsAnimationController.getCurrentInsets(), windowInsetsAnimationController.getHiddenStateInsets()));
        }
    }

    @Override // android.view.WindowInsetsAnimationControlListener
    public void onFinished(WindowInsetsAnimationController windowInsetsAnimationController) {
        animationEnded();
    }

    @Override // android.view.WindowInsetsAnimationControlListener
    public void onCancelled(WindowInsetsAnimationController windowInsetsAnimationController) {
        animationEnded();
    }

    private final void animationEnded() {
        WindowInsetsAnimationController windowInsetsAnimationController;
        WindowInsetsAnimationController windowInsetsAnimationController2 = this.animationController;
        if (windowInsetsAnimationController2 != null && windowInsetsAnimationController2.isReady() && (windowInsetsAnimationController = this.animationController) != null) {
            windowInsetsAnimationController.finish(this.windowInsets.isVisible());
        }
        this.animationController = null;
        CancellableContinuation<? super WindowInsetsAnimationController> cancellableContinuation = this.continuation;
        if (cancellableContinuation != null) {
            cancellableContinuation.resume((Object) null, new Function1<Throwable, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.animationEnded.1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }
            });
        }
        this.continuation = null;
        Job job = this.animationJob;
        if (job != null) {
            job.cancel((CancellationException) new WindowInsetsAnimationCancelledException());
        }
        this.animationJob = null;
        this.partialConsumption = 0.0f;
        this.isControllerRequested = false;
    }
}
