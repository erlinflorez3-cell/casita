package com.incode.welcome_sdk.commons.utils;

import android.content.Context;
import android.os.Process;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.c.a.e.b.kR27496$d;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import com.incode.welcome_sdk.commons.utils.m;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import java.lang.reflect.Method;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f6536a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f6537b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f6538c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f6539d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f6540e = 1;

    private m() {
    }

    public static final class a<T> implements SingleOnSubscribe {
        private static final byte[] $$a = null;
        private static final int $$b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f6541a = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f6542c = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Context f6543b;

        /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:5:0x0016). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void d(short r8, short r9, int r10, java.lang.Object[] r11) {
            /*
                int r0 = r8 * 4
                int r8 = 101 - r0
                int r0 = r10 * 2
                int r7 = 1 - r0
                int r0 = r9 * 2
                int r0 = 3 - r0
                byte[] r6 = com.incode.welcome_sdk.commons.utils.m.a.$$a
                byte[] r5 = new byte[r7]
                r4 = 0
                if (r6 != 0) goto L2d
                r1 = r0
                r8 = r7
                r3 = r4
            L16:
                int r8 = r8 + r0
                r0 = r1
                r2 = r3
            L19:
                int r1 = r0 + 1
                int r3 = r2 + 1
                byte r0 = (byte) r8
                r5[r2] = r0
                if (r3 != r7) goto L2a
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                r11[r4] = r0
                return
            L2a:
                r0 = r6[r1]
                goto L16
            L2d:
                r2 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.utils.m.a.d(short, short, int, java.lang.Object[]):void");
        }

        static void init$0() {
            $$a = new byte[]{Ascii.SYN, -75, -19, MessagePack.Code.UINT64};
            $$b = 103;
        }

        @Override // io.reactivex.SingleOnSubscribe
        public final void subscribe(final SingleEmitter<Boolean> singleEmitter) throws Throwable {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(singleEmitter, "");
            try {
                Object[] objArr = {this.f6543b, 1, new kR27496$d() { // from class: com.incode.welcome_sdk.commons.utils.m.a.4

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private static int f6544a = 1;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private static int f6545c = 0;

                    @Override // com.c.a.e.b.kR27496$d
                    public final void onRootDetectionResultReceived(int i3, int i4) {
                        int i5 = 2 % 2;
                        SingleEmitter<Boolean> singleEmitter2 = singleEmitter;
                        if (i3 != i4) {
                            int i6 = f6545c + 83;
                            int i7 = i6 % 128;
                            f6544a = i7;
                            z = i6 % 2 != 0;
                            int i8 = i7 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                            f6545c = i8 % 128;
                            int i9 = i8 % 2;
                        }
                        singleEmitter2.onSuccess(Boolean.valueOf(z));
                    }
                }};
                Object objC = com.c.a.e.e.c(1295328932);
                if (objC == null) {
                    char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int gidForName = Process.getGidForName("") + 20;
                    int i3 = 427 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    Object[] objArr2 = new Object[1];
                    d(b2, b3, b3, objArr2);
                    objC = com.c.a.e.e.e(fadingEdgeLength, gidForName, i3, 1303323869, false, (String) objArr2[0], new Class[]{Context.class, Integer.TYPE, kR27496$d.class});
                }
                ((Method) objC).invoke(null, objArr);
                int i4 = f6541a + 31;
                f6542c = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        static {
            init$0();
            f6542c = 0;
            f6541a = 1;
        }

        public a(Context context) {
            this.f6543b = context;
        }
    }

    static final class e extends SuspendLambda implements Function2<ProducerScope<? super Boolean>, Continuation<? super Unit>, Object> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f6547b = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f6548e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ Context f6549a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f6550c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f6551d;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:5:0x0016). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void f(byte r7, int r8, int r9, java.lang.Object[] r10) {
            /*
                int r0 = r8 * 4
                int r8 = r0 + 1
                int r0 = r7 * 2
                int r7 = 4 - r0
                int r0 = r9 * 3
                int r6 = 101 - r0
                byte[] r5 = com.incode.welcome_sdk.commons.utils.m.e.$$a
                byte[] r4 = new byte[r8]
                r3 = 0
                if (r5 != 0) goto L2c
                r0 = r6
                r2 = r3
                r6 = r8
            L16:
                int r6 = r6 + r0
                int r7 = r7 + 1
                r1 = r2
            L1a:
                byte r0 = (byte) r6
                int r2 = r1 + 1
                r4[r1] = r0
                if (r2 != r8) goto L29
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                r10[r3] = r0
                return
            L29:
                r0 = r5[r7]
                goto L16
            L2c:
                r1 = r3
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.utils.m.e.f(byte, int, int, java.lang.Object[]):void");
        }

        static void init$0() {
            $$a = new byte[]{Ascii.US, Ascii.FS, -113, 86};
            $$b = 67;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i2 = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.f6550c;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                final ProducerScope producerScope = (ProducerScope) this.f6551d;
                try {
                    Object[] objArr = {this.f6549a, 1, new kR27496$d() { // from class: com.incode.welcome_sdk.commons.utils.m$e$$ExternalSyntheticLambda0
                        @Override // com.c.a.e.b.kR27496$d
                        public final void onRootDetectionResultReceived(int i4, int i5) {
                            m.e.e(producerScope, i4, i5);
                        }
                    }};
                    Object objC = com.c.a.e.e.c(1295328932);
                    if (objC == null) {
                        char size = (char) View.MeasureSpec.getSize(0);
                        int maximumFlingVelocity = 19 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int size2 = View.MeasureSpec.getSize(0) + 428;
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        Object[] objArr2 = new Object[1];
                        f(b2, b3, b3, objArr2);
                        objC = com.c.a.e.e.e(size, maximumFlingVelocity, size2, 1303323869, false, (String) objArr2[0], new Class[]{Context.class, Integer.TYPE, kR27496$d.class});
                    }
                    Object obj2 = null;
                    ((Method) objC).invoke(null, objArr);
                    this.f6550c = 1;
                    if (ProduceKt.awaitClose$default(producerScope, null, this, 1, null) == coroutine_suspended) {
                        int i4 = f6548e;
                        int i5 = i4 + 117;
                        f6547b = i5 % 128;
                        int i6 = i5 % 2;
                        int i7 = i4 + 31;
                        f6547b = i7 % 128;
                        if (i7 % 2 != 0) {
                            return coroutine_suspended;
                        }
                        obj2.hashCode();
                        throw null;
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(ProducerScope producerScope, int i2, int i3) {
            int i4 = 2 % 2;
            int i5 = f6548e + 111;
            f6547b = i5 % 128;
            Object obj = null;
            if (i5 % 2 != 0) {
                producerScope.mo10484trySendJP2dKIU(Boolean.valueOf(i2 != i3));
                SendChannel.DefaultImpls.close$default(producerScope, null, 1, null);
                int i6 = f6548e + 47;
                f6547b = i6 % 128;
                int i7 = i6 % 2;
                return;
            }
            obj.hashCode();
            throw null;
        }

        static {
            init$0();
            f6548e = 0;
            f6547b = 1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(ProducerScope<? super Boolean> producerScope, Continuation<? super Unit> continuation) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f6547b + 45;
            f6548e = i3 % 128;
            int i4 = i3 % 2;
            Object objE = e(producerScope, continuation);
            int i5 = f6547b + 5;
            f6548e = i5 % 128;
            int i6 = i5 % 2;
            return objE;
        }

        private Object e(ProducerScope<? super Boolean> producerScope, Continuation<? super Unit> continuation) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f6548e + 11;
            f6547b = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((e) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i5 = f6547b + 47;
            f6548e = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            e eVar = new e(this.f6549a, continuation);
            eVar.f6551d = obj;
            e eVar2 = eVar;
            int i3 = f6547b + 41;
            f6548e = i3 % 128;
            int i4 = i3 % 2;
            return eVar2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Context context, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f6549a = context;
        }
    }

    @JvmStatic
    public static final Flow<Boolean> e(Context context) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Flow<Boolean> flowCallbackFlow = FlowKt.callbackFlow(new e(context, null));
        int i3 = f6540e + 47;
        f6539d = i3 % 128;
        int i4 = i3 % 2;
        return flowCallbackFlow;
    }

    static {
        int i2 = f6537b + 67;
        f6538c = i2 % 128;
        int i3 = i2 % 2;
    }
}
