package com.incode.welcome_sdk.commons;

import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.ui.camera.CameraXVideoCapturer;
import com.incode.welcome_sdk.ui.camera.videostreaming.OpenTokSessionWrapper;
import com.incode.welcome_sdk.ui.camera.videostreaming.VideoStreamingManager;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: a */
    private static int f5275a = 1;

    /* JADX INFO: renamed from: b */
    private static int f5276b = 0;

    /* JADX INFO: renamed from: c */
    private final IncodeWelcome f5277c;

    /* JADX INFO: renamed from: d */
    private final VideoStreamingManager f5278d;

    public j(IncodeWelcome incodeWelcome, VideoStreamingManager videoStreamingManager) {
        Intrinsics.checkNotNullParameter(incodeWelcome, "");
        Intrinsics.checkNotNullParameter(videoStreamingManager, "");
        this.f5277c = incodeWelcome;
        this.f5278d = videoStreamingManager;
    }

    public static final /* synthetic */ IncodeWelcome a(j jVar) {
        int i2 = 2 % 2;
        int i3 = f5275a + 91;
        int i4 = i3 % 128;
        f5276b = i4;
        int i5 = i3 % 2;
        IncodeWelcome incodeWelcome = jVar.f5277c;
        if (i5 != 0) {
            int i6 = 44 / 0;
        }
        int i7 = i4 + 105;
        f5275a = i7 % 128;
        if (i7 % 2 != 0) {
            return incodeWelcome;
        }
        throw null;
    }

    public static final /* synthetic */ VideoStreamingManager b(j jVar) {
        int i2 = 2 % 2;
        int i3 = f5276b;
        int i4 = i3 + 7;
        f5275a = i4 % 128;
        int i5 = i4 % 2;
        VideoStreamingManager videoStreamingManager = jVar.f5278d;
        int i6 = i3 + 55;
        f5275a = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 12 / 0;
        }
        return videoStreamingManager;
    }

    public static final class a extends Enum<a> {

        /* JADX INFO: renamed from: b */
        private static int f5280b = 0;

        /* JADX INFO: renamed from: c */
        private static final /* synthetic */ a[] f5281c;

        /* JADX INFO: renamed from: g */
        private static int f5284g = 1;

        /* JADX INFO: renamed from: i */
        private static int f5285i = 1;

        /* JADX INFO: renamed from: j */
        private static int f5286j = 0;

        /* JADX INFO: renamed from: d */
        public static final a f5282d = new a("JUST_INITIALIZED", 0);

        /* JADX INFO: renamed from: a */
        public static final a f5279a = new a("ALREADY_INITIALIZED", 1);

        /* JADX INFO: renamed from: e */
        public static final a f5283e = new a("NOT_INITIALIZED", 2);

        private a(String str, int i2) {
            super(str, i2);
        }

        static {
            a[] aVarArrD = d();
            f5281c = aVarArrD;
            EnumEntriesKt.enumEntries(aVarArrD);
            int i2 = f5286j + 47;
            f5284g = i2 % 128;
            int i3 = i2 % 2;
        }

        private static final /* synthetic */ a[] d() {
            int i2 = 2 % 2;
            int i3 = f5285i;
            int i4 = i3 + 111;
            f5280b = i4 % 128;
            int i5 = i4 % 2;
            a[] aVarArr = {f5282d, f5279a, f5283e};
            int i6 = i3 + 79;
            f5280b = i6 % 128;
            if (i6 % 2 == 0) {
                return aVarArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static a valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = f5285i + 21;
            f5280b = i3 % 128;
            int i4 = i3 % 2;
            a aVar = (a) Enum.valueOf(a.class, str);
            if (i4 != 0) {
                int i5 = 93 / 0;
            }
            int i6 = f5280b + 65;
            f5285i = i6 % 128;
            if (i6 % 2 != 0) {
                return aVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static a[] values() {
            int i2 = 2 % 2;
            int i3 = f5280b + 79;
            f5285i = i3 % 128;
            int i4 = i3 % 2;
            a[] aVarArr = (a[]) f5281c.clone();
            int i5 = f5285i + 81;
            f5280b = i5 % 128;
            int i6 = i5 % 2;
            return aVarArr;
        }
    }

    public final boolean c() {
        int i2 = 2 % 2;
        int i3 = f5276b + 47;
        f5275a = i3 % 128;
        if (i3 % 2 == 0) {
            com.incode.welcome_sdk.data.b bVar = this.f5277c.currentStreamFramesModule;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.f5277c.currentStreamFramesModule == null) {
            return false;
        }
        int i4 = f5275a + 23;
        f5276b = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    private final OpenTokSessionWrapper b() {
        int i2 = 2 % 2;
        com.incode.welcome_sdk.data.b bVar = this.f5277c.currentStreamFramesModule;
        Object obj = null;
        if (bVar == null) {
            return null;
        }
        int i3 = f5276b + 53;
        f5275a = i3 % 128;
        if (i3 % 2 == 0) {
            this.f5278d.getOpenTokSession(bVar);
            obj.hashCode();
            throw null;
        }
        OpenTokSessionWrapper openTokSession = this.f5278d.getOpenTokSession(bVar);
        int i4 = f5276b + 69;
        f5275a = i4 % 128;
        int i5 = i4 % 2;
        return openTokSession;
    }

    static final class d extends SuspendLambda implements Function2<FlowCollector<? super a>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: a */
        private static int f5287a = 1;

        /* JADX INFO: renamed from: b */
        private static int f5288b = 0;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ Object f5289c;

        /* JADX INFO: renamed from: d */
        private int f5290d;

        /* JADX WARN: Removed duplicated region for block: B:85:0x00dd  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 296
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.j.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(FlowCollector<? super a> flowCollector, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f5287a + 83;
            f5288b = i3 % 128;
            FlowCollector<? super a> flowCollector2 = flowCollector;
            Continuation<? super Unit> continuation2 = continuation;
            if (i3 % 2 != 0) {
                e(flowCollector2, continuation2);
                throw null;
            }
            Object objE = e(flowCollector2, continuation2);
            int i4 = f5288b + 67;
            f5287a = i4 % 128;
            int i5 = i4 % 2;
            return objE;
        }

        private Object e(FlowCollector<? super a> flowCollector, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f5288b + 99;
            f5287a = i3 % 128;
            int i4 = i3 % 2;
            d dVar = (d) create(flowCollector, continuation);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                dVar.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = dVar.invokeSuspend(unit);
            int i5 = f5287a + 51;
            f5288b = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 9 / 0;
            }
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            d dVar = j.this.new d(continuation);
            dVar.f5289c = obj;
            d dVar2 = dVar;
            int i3 = f5288b + 63;
            f5287a = i3 % 128;
            if (i3 % 2 != 0) {
                return dVar2;
            }
            throw null;
        }

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }
    }

    public final Flow<a> e() {
        int i2 = 2 % 2;
        Flow<a> flow = FlowKt.flow(new d(null));
        int i3 = f5276b + 25;
        f5275a = i3 % 128;
        int i4 = i3 % 2;
        return flow;
    }

    public final void d(CameraXVideoCapturer cameraXVideoCapturer, boolean z2) {
        int i2 = 2 % 2;
        int i3 = f5276b + 99;
        f5275a = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(cameraXVideoCapturer, "");
            b();
            throw null;
        }
        Intrinsics.checkNotNullParameter(cameraXVideoCapturer, "");
        OpenTokSessionWrapper openTokSessionWrapperB = b();
        if (openTokSessionWrapperB != null) {
            int i4 = f5276b + 25;
            f5275a = i4 % 128;
            int i5 = i4 % 2;
            openTokSessionWrapperB.publishToStream(this.f5278d.createPublisher(openTokSessionWrapperB, cameraXVideoCapturer, z2));
        }
    }
}
