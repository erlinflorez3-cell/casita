package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
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
/* JADX INFO: compiled from: CursorAnchorInfoController.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я^\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.ZS0\u000fs{J$cҕyCQU\"Ԃ*\t]WogtMb\u000bY\u000f\u000e\u0016~k4Ikxe܈\u00172XoG\u074cUoK9ht<\u0006(20>\u0002\u0005\u0007\u001a0Ϻ&͌+Cy\u000bRSPtHR%M3\u001b\"\nL\"\u0019\u001e\u000bj^:Vpu:](\u0013mPT?_^\u0004֔\u0011Fb/U~o7CBM4C?\u001a\u0003O\tiZ\u001b? Y5l5DCI\"ef\\\u000e2-+}\u001b\u000ev4m\u001dQ\u000f\u001aW/]rcP<6(~\n\u001dT\u0004<\u0014WL<?2f6\u001cyt;_Nk\u001a^p\u001c+eD6=\u007faK\u0002!try;Gj}{U\u0019,,\u0019nOe+טbڠ\u001fT\u007f\u0383\u0002]NH`N8e\u0014Ъ\u0006Ͳf\u00022ʶ\u0001S\u000e3\u0014\u0011\\\u001c{ڞ]ޠ'!sȵ\u0019Pu\u0004\u001d`\u0017a@ɰTغ&n\u001eճz\u0015\u001ai\\d3y'Ӽd¯\u0015M$\u0381W\n\u0016#8\\&Jwغ\u001cʽShqҔ\u001ei\u00186GfegE\u008b\u001aĆ=^;̐\"o\u001esjvBM\u0013ϸ\u0011ֽjB[ێ+p65JH\u0019$NӾFā\u000bƎ֮>pʬ8.9\u0019j*\u0019\u000f,XY|7m1ӓ\u001cњX3,Ѱ:2\u0003 \u0019Rro\u001e\u007fO̥8ʬd\"5ۋ\"A',m\"\u0017;Sɀ\tҋw\u007fOх\u001dSZl.u\u0004|vډ\u001c\u07fcU/EП_\u000b74\u001a-sOIϏS̊\u0016'\u0003۠ȭ\u000fDp1mů\u0007\u001f+hjPnݠ\u001bD"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PA<[\u00051T(W*_\\\u007f!\u001d\u0013dkX4\u001c\u0012cH+nQ\r", "", "BdgA90>Z\u0018l\nZ;|", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR9J\u007f5HV[4\\Qa='!;\u0012N2\frh=3n\u001a", "BdgA?(R])\u000ehm(\f\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR,a\u0006\u000eC`X<k@\u00029#\u00120", "1n\\=b:>7!\u0007", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PA6V\u00021UL25gb\u0002%\u0014!]\u0018M\u0013\t\u000eUC${\u001a", ";n]6g6KA\u0017\t\u0006^", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001q\u001f9]R\u0005o=-\u0015uj5\u000e-\u001b[r0UMX9dRq,\u0014%inR+\u0014\u0004GP }D\r\u0006\u00045H\u000fEl\u007f\u001f_\f?r{Ld\u0010\u0011z\u001f\u0006J(dU]i\u0003\u0011PEu9.\u0010h(lI\u0004(\u001d\u0001\u0019(qL5SjS$\u00029u{qW(hG Mm1-AxTI~+\u001e^Eu\u001c:c~9tv\u0005>:?c\u0001Zk\"G(\b\u0015?k\u000b+/AL\"\tOl\u0005lK\u0017d&+e\u0018j@;'eIlS\u001f\u0016E\u0017j8k^h3[\u0002@I|j\u000eL\tQb}\u001e\u001cP\"wrSS*X\n\u001a~\u000e\u007fi\u001e\r\u0013u\u001c%.\u0004;c\u001ah\u007f#(", "/mS?b0=;\u0015\u000e\bb?", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0010wO\u000e\u001b*\u001d", "0tX9W,K", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9kL\u00043?fY)5p ;1L<urz%lh8\u0007p\u0002", "6`b\u001dX5=W\"\u0001^f4|\b3a\u000f(h@\r'\u0017U~", "", "7mR9h+>1\u001cz\bZ*\f\t<B\n8\u0005?\u000f", "7mR9h+>3\u0018\u0003\nh9Y\u0013?n~6", "7mR9h+>7\"\rzk;\u0001\u00138M{5\u0002@\u000e", "7mR9h+>:\u001d\bz;6\r\u0012.s", ";`c?\\?", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001dU\r-;\u0001k", ")E", ";n]6g6K3\"zwe,{", ";n]6g6K8#{", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014l", "1`[0h3:b\u0019\\\u000bk:\u0007\u0016\u000bn}+\u0006Md \u0018Q", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9kL\u00043?fY)5p ;1L<u\n", "@d`BX:MC$}vm,\u000b", "", "7l\\2W0:b\u0019", ";n]6g6K", "1ta@b9.^\u0018z\n^\u0014\u0007\b/", "", "AsP?g\u0016KA(\t\u0006F6\u0006\r>o\r,\u0005B", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class CursorAnchorInfoController {
    public static final int $stable = 8;
    private final ComposeInputMethodManager composeImm;
    private boolean hasPendingImmediateRequest;
    private boolean includeCharacterBounds;
    private boolean includeEditorBounds;
    private boolean includeInsertionMarker;
    private boolean includeLineBounds;
    private boolean monitorEnabled;
    private Job monitorJob;
    private final CoroutineScope monitorScope;
    private final TransformedTextFieldState textFieldState;
    private final TextLayoutState textLayoutState;
    private final CursorAnchorInfo.Builder builder = new CursorAnchorInfo.Builder();
    private final float[] matrix = Matrix.m4409constructorimpl$default(null, 1, null);
    private final android.graphics.Matrix androidMatrix = new android.graphics.Matrix();

    public CursorAnchorInfoController(TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, ComposeInputMethodManager composeInputMethodManager, CoroutineScope coroutineScope) {
        this.textFieldState = transformedTextFieldState;
        this.textLayoutState = textLayoutState;
        this.composeImm = composeInputMethodManager;
        this.monitorScope = coroutineScope;
    }

    public final void requestUpdates(int i2) {
        boolean z2;
        boolean z3;
        boolean z4 = false;
        boolean z5 = true;
        boolean z6 = (i2 + 1) - (1 | i2) != 0;
        boolean z7 = (-1) - (((-1) - i2) | ((-1) - 2)) != 0;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z8 = (16 & i2) != 0;
            z3 = (8 & i2) != 0;
            z2 = (-1) - (((-1) - i2) | ((-1) - 4)) != 0;
            if (Build.VERSION.SDK_INT >= 34 && (-1) - (((-1) - i2) | ((-1) - 32)) != 0) {
                z4 = true;
            }
            if (z8 || z3 || z2 || z4) {
                z5 = z8;
            } else if (Build.VERSION.SDK_INT >= 34) {
                z3 = true;
                z2 = true;
                z4 = true;
            } else {
                z3 = true;
                z2 = true;
            }
        } else {
            z2 = false;
            z4 = false;
            z3 = true;
        }
        requestUpdates(z6, z7, z5, z3, z2, z4);
    }

    private final void requestUpdates(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.includeInsertionMarker = z4;
        this.includeCharacterBounds = z5;
        this.includeEditorBounds = z6;
        this.includeLineBounds = z7;
        if (z2) {
            this.hasPendingImmediateRequest = true;
            CursorAnchorInfo cursorAnchorInfoCalculateCursorAnchorInfo = calculateCursorAnchorInfo();
            if (cursorAnchorInfoCalculateCursorAnchorInfo != null) {
                this.composeImm.updateCursorAnchorInfo(cursorAnchorInfoCalculateCursorAnchorInfo);
            }
        }
        this.monitorEnabled = z3;
        startOrStopMonitoring();
    }

    private final void startOrStopMonitoring() {
        if (this.monitorEnabled) {
            Job job = this.monitorJob;
            if (job == null || !job.isActive()) {
                this.monitorJob = BuildersKt__Builders_commonKt.launch$default(this.monitorScope, null, CoroutineStart.UNDISPATCHED, new AnonymousClass1(null), 1, null);
                return;
            }
            return;
        }
        Job job2 = this.monitorJob;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        this.monitorJob = null;
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.CursorAnchorInfoController$startOrStopMonitoring$1, reason: invalid class name */
    /* JADX INFO: compiled from: CursorAnchorInfoController.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0014\u0006\u001a\u0017Q\u000e\u0014\u0017\u001d\u001dW\u0014\u001a!\u0013!\u001e\u0012\u001e`v*(*'+z)\u001f%-1\t/(2\u000744;:8671?qBD2DG#G)KGI'JJFRNRJPJ\b\u0016", f = "\u0010A==8:\b4(,24\n.%-\u007f+).+'#\"\u001a&`\u0013\u001f\u0014!\u001d\u0016\u0010X\u0015\u001d", i = {}, l = {155}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CursorAnchorInfoController.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                final CursorAnchorInfoController cursorAnchorInfoController = CursorAnchorInfoController.this;
                Flow flowFilterNotNull = FlowKt.filterNotNull(FlowKt.drop(SnapshotStateKt.snapshotFlow(new Function0<CursorAnchorInfo>() { // from class: androidx.compose.foundation.text.input.internal.CursorAnchorInfoController.startOrStopMonitoring.1.1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final CursorAnchorInfo invoke() {
                        return cursorAnchorInfoController.calculateCursorAnchorInfo();
                    }
                }), 1));
                final CursorAnchorInfoController cursorAnchorInfoController2 = CursorAnchorInfoController.this;
                this.label = 1;
                if (flowFilterNotNull.collect(new FlowCollector() { // from class: androidx.compose.foundation.text.input.internal.CursorAnchorInfoController.startOrStopMonitoring.1.2
                    public final Object emit(CursorAnchorInfo cursorAnchorInfo, Continuation<? super Unit> continuation) {
                        cursorAnchorInfoController2.composeImm.updateCursorAnchorInfo(cursorAnchorInfo);
                        return Unit.INSTANCE;
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((CursorAnchorInfo) obj2, (Continuation<? super Unit>) continuation);
                    }
                }, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final CursorAnchorInfo calculateCursorAnchorInfo() {
        LayoutCoordinates coreNodeCoordinates;
        LayoutCoordinates decoratorNodeCoordinates;
        TextLayoutResult layoutResult;
        LayoutCoordinates textLayoutNodeCoordinates = this.textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates != null) {
            if (!textLayoutNodeCoordinates.isAttached()) {
                textLayoutNodeCoordinates = null;
            }
            if (textLayoutNodeCoordinates != null && (coreNodeCoordinates = this.textLayoutState.getCoreNodeCoordinates()) != null) {
                if (!coreNodeCoordinates.isAttached()) {
                    coreNodeCoordinates = null;
                }
                if (coreNodeCoordinates != null && (decoratorNodeCoordinates = this.textLayoutState.getDecoratorNodeCoordinates()) != null) {
                    if (!decoratorNodeCoordinates.isAttached()) {
                        decoratorNodeCoordinates = null;
                    }
                    if (decoratorNodeCoordinates == null || (layoutResult = this.textLayoutState.getLayoutResult()) == null) {
                        return null;
                    }
                    TextFieldCharSequence visualText = this.textFieldState.getVisualText();
                    Matrix.m4418resetimpl(this.matrix);
                    textLayoutNodeCoordinates.mo5530transformToScreen58bKbWc(this.matrix);
                    AndroidMatrixConversions_androidKt.m4048setFromEL8BTi8(this.androidMatrix, this.matrix);
                    return CursorAnchorInfoBuilder_androidKt.m1477buildvxqZcH0(this.builder, visualText, visualText.m1446getSelectiond9O1mEE(), visualText.m1445getCompositionMzsxiRA(), layoutResult, this.androidMatrix, SelectionManagerKt.visibleBounds(coreNodeCoordinates).m3974translatek4lQ0M(textLayoutNodeCoordinates.mo5523localPositionOfR5De75A(coreNodeCoordinates, Offset.Companion.m3953getZeroF1C5BW0())), SelectionManagerKt.visibleBounds(decoratorNodeCoordinates).m3974translatek4lQ0M(textLayoutNodeCoordinates.mo5523localPositionOfR5De75A(decoratorNodeCoordinates, Offset.Companion.m3953getZeroF1C5BW0())), this.includeInsertionMarker, this.includeCharacterBounds, this.includeEditorBounds, this.includeLineBounds);
                }
            }
        }
        return null;
    }
}
