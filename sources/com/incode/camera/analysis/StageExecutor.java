package com.incode.camera.analysis;

import com.incode.camera.analysis.AnalysisEvent;
import com.incode.camera.analysis.Stage;
import io.sentry.SentryEvent;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0002B-\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t0\b¢\u0006\u0002\u0010\nJ#\u0010\u0011\u001a\u00028\u00012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013¢\u0006\u0002\u0010\u0016J\u001f\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0002\u0010\u0018R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u00028\u0000X\u0080.¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/incode/camera/analysis/StageExecutor;", "Input", "", "Event", "Lcom/incode/camera/analysis/AnalysisEvent;", "eventsBus", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "stages", "", "Lcom/incode/camera/analysis/Stage;", "(Lkotlinx/coroutines/flow/MutableSharedFlow;Ljava/util/List;)V", "input", "getInput$core_light_release", "()Ljava/lang/Object;", "setInput$core_light_release", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "execute", SentryEvent.JsonKeys.LOGGER, "Lkotlin/Function1;", "", "", "(Lkotlin/jvm/functions/Function1;)Lcom/incode/camera/analysis/AnalysisEvent;", "withInput", "(Ljava/lang/Object;)Lcom/incode/camera/analysis/StageExecutor;", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class StageExecutor<Input, Event extends AnalysisEvent> {
    private static int IncodeCamera = 1;
    private static int getAvailableCameraInternals = 0;
    private final MutableSharedFlow<Event> CameraConstants;
    private final List<Stage<Input, Event>> ProcessCameraProviderExtensionsKt;
    public Input input;

    /* JADX WARN: Multi-variable type inference failed */
    public StageExecutor(MutableSharedFlow<Event> mutableSharedFlow, List<? extends Stage<Input, Event>> list) {
        Intrinsics.checkNotNullParameter(mutableSharedFlow, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.CameraConstants = mutableSharedFlow;
        this.ProcessCameraProviderExtensionsKt = list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        return (Input) kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r2 != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        r1 = r3 + 67;
        com.incode.camera.analysis.StageExecutor.IncodeCamera = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        if (r2 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final Input getInput$core_light_release() {
        /*
            r5 = this;
            r4 = 2
            int r0 = r4 % r4
            int r3 = com.incode.camera.analysis.StageExecutor.getAvailableCameraInternals
            int r1 = r3 + 75
            int r0 = r1 % 128
            com.incode.camera.analysis.StageExecutor.IncodeCamera = r0
            int r1 = r1 % r4
            if (r1 != 0) goto L1e
            Input r2 = r5.input
            r0 = 78
            int r0 = r0 / 0
            if (r2 == 0) goto L23
        L16:
            int r1 = r3 + 67
            int r0 = r1 % 128
            com.incode.camera.analysis.StageExecutor.IncodeCamera = r0
            int r1 = r1 % r4
            return r2
        L1e:
            Input r2 = r5.input
            if (r2 == 0) goto L23
            goto L16
        L23:
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.camera.analysis.StageExecutor.getInput$core_light_release():java.lang.Object");
    }

    public final void setInput$core_light_release(Input input) {
        int i2 = 2 % 2;
        int i3 = IncodeCamera + 95;
        getAvailableCameraInternals = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(input, "");
            this.input = input;
        } else {
            Intrinsics.checkNotNullParameter(input, "");
            this.input = input;
            throw null;
        }
    }

    public final StageExecutor<Input, Event> withInput(Input input) {
        int i2 = 2 % 2;
        int i3 = getAvailableCameraInternals + 105;
        IncodeCamera = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(input, "");
            setInput$core_light_release(input);
            throw null;
        }
        Intrinsics.checkNotNullParameter(input, "");
        setInput$core_light_release(input);
        int i4 = IncodeCamera + 109;
        getAvailableCameraInternals = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnalysisEvent execute$default(StageExecutor stageExecutor, Function1 function1, int i2, Object obj) {
        int i3 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execute");
        }
        if ((i2 & 1) != 0) {
            int i4 = IncodeCamera + 33;
            getAvailableCameraInternals = i4 % 128;
            int i5 = i4 % 2;
            function1 = null;
        }
        AnalysisEvent analysisEventExecute = stageExecutor.execute(function1);
        int i6 = getAvailableCameraInternals + 125;
        IncodeCamera = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 87 / 0;
        }
        return analysisEventExecute;
    }

    public final Event execute(Function1<? super String, Unit> logger) {
        int i2 = 2 % 2;
        int i3 = IncodeCamera + 57;
        getAvailableCameraInternals = i3 % 128;
        int i4 = i3 % 2;
        if (this.input == null) {
            throw new IllegalArgumentException("Input is required, check if you called withInput method.".toString());
        }
        if (!(!this.ProcessCameraProviderExtensionsKt.isEmpty())) {
            throw new IllegalArgumentException("At least one stage should be provided.".toString());
        }
        Iterator<Stage<Input, Event>> it = this.ProcessCameraProviderExtensionsKt.iterator();
        Event event = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int i5 = IncodeCamera + 39;
            getAvailableCameraInternals = i5 % 128;
            int i6 = i5 % 2;
            Stage<Input, Event> next = it.next();
            if (logger != null) {
                int i7 = getAvailableCameraInternals + 89;
                IncodeCamera = i7 % 128;
                if (i7 % 2 == 0) {
                    logger.invoke("Stage: " + Reflection.getOrCreateKotlinClass(next.getClass()).getSimpleName());
                    throw null;
                }
                logger.invoke("Stage: " + Reflection.getOrCreateKotlinClass(next.getClass()).getSimpleName());
            }
            Stage.Result<Event> resultPerform = next.perform(getInput$core_light_release(), logger);
            Event event2 = resultPerform.getEvent();
            if (event2 != null) {
                int i8 = IncodeCamera + 77;
                getAvailableCameraInternals = i8 % 128;
                if (i8 % 2 != 0) {
                    this.CameraConstants.tryEmit(event2);
                    int i9 = 39 / 0;
                } else {
                    this.CameraConstants.tryEmit(event2);
                }
                event = event2;
            }
            if (!resultPerform.getProceed()) {
                if (logger != null) {
                    logger.invoke("----- Aborted -----");
                }
            }
        }
        if (event == null) {
            throw new IllegalArgumentException("Final event must not be null.".toString());
        }
        Intrinsics.checkNotNull(event);
        return event;
    }
}
