package com.incode.camera.analysis;

import androidx.core.app.NotificationCompat;
import io.sentry.SentryEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\b \u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0004\b\u0001\u0010\u00032\u00020\u0002:\u0001\rB\u0005¢\u0006\u0002\u0010\u0004J1\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\u0007\u001a\u00028\u00002\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH&¢\u0006\u0002\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/incode/camera/analysis/Stage;", "Input", "", "Event", "()V", "perform", "Lcom/incode/camera/analysis/Stage$Result;", "input", SentryEvent.JsonKeys.LOGGER, "Lkotlin/Function1;", "", "", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lcom/incode/camera/analysis/Stage$Result;", "Result", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class Stage<Input, Event> {
    public abstract Result<Event> perform(Input input, Function1<? super String, Unit> logger);

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002:\u0002\f\rB\u001b\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0002¢\u0006\u0002\u0010\u0006R\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/incode/camera/analysis/Stage$Result;", "Event", "", "proceed", "", NotificationCompat.CATEGORY_EVENT, "(ZLjava/lang/Object;)V", "getEvent", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getProceed", "()Z", "Abort", "Proceed", "Lcom/incode/camera/analysis/Stage$Result$Abort;", "Lcom/incode/camera/analysis/Stage$Result$Proceed;", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Result<Event> {
        private static int CameraConstants = 0;
        private static int ProcessCameraProviderExtensionsKt = 1;
        private final boolean IncodeCamera;
        private final Event getAvailableCameraInternals;

        private Result(boolean z2, Event event) {
            this.IncodeCamera = z2;
            this.getAvailableCameraInternals = event;
        }

        public /* synthetic */ Result(boolean z2, Object obj, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(z2, (i2 & 2) != 0 ? null : obj, null);
        }

        public final boolean getProceed() {
            int i2 = 2 % 2;
            int i3 = ProcessCameraProviderExtensionsKt + 19;
            int i4 = i3 % 128;
            CameraConstants = i4;
            int i5 = i3 % 2;
            boolean z2 = this.IncodeCamera;
            int i6 = i4 + 1;
            ProcessCameraProviderExtensionsKt = i6 % 128;
            int i7 = i6 % 2;
            return z2;
        }

        public final Event getEvent() {
            Event event;
            int i2 = 2 % 2;
            int i3 = CameraConstants;
            int i4 = i3 + 87;
            ProcessCameraProviderExtensionsKt = i4 % 128;
            if (i4 % 2 == 0) {
                event = this.getAvailableCameraInternals;
                int i5 = 25 / 0;
            } else {
                event = this.getAvailableCameraInternals;
            }
            int i6 = i3 + 101;
            ProcessCameraProviderExtensionsKt = i6 % 128;
            int i7 = i6 % 2;
            return event;
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0003\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/incode/camera/analysis/Stage$Result$Proceed;", "Event", "Lcom/incode/camera/analysis/Stage$Result;", NotificationCompat.CATEGORY_EVENT, "(Ljava/lang/Object;)V", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Proceed<Event> extends Result<Event> {
            public Proceed(Event event) {
                super(true, event, null);
            }

            public /* synthetic */ Proceed(Object obj, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? null : obj);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public Proceed() {
                DefaultConstructorMarker defaultConstructorMarker = null;
                this(defaultConstructorMarker, 1, defaultConstructorMarker);
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0003\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/incode/camera/analysis/Stage$Result$Abort;", "Event", "Lcom/incode/camera/analysis/Stage$Result;", NotificationCompat.CATEGORY_EVENT, "(Ljava/lang/Object;)V", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Abort<Event> extends Result<Event> {
            public Abort(Event event) {
                super(false, event, null);
            }
        }

        public /* synthetic */ Result(boolean z2, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
            this(z2, obj);
        }
    }
}
