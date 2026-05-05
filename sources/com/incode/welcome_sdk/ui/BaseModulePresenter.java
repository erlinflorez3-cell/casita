package com.incode.welcome_sdk.ui;

import com.google.common.base.Ascii;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.b;
import com.incode.welcome_sdk.commons.exceptions.DeviceEnvironmentException;
import com.incode.welcome_sdk.results.BaseResult;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.subjects.Subject;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseModulePresenter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;

    /* JADX INFO: renamed from: c */
    private static int f10810c = 0;

    /* JADX INFO: renamed from: d */
    private static int f10811d = 0;

    /* JADX INFO: renamed from: a */
    private IncodeWelcome f10812a;

    /* JADX INFO: renamed from: b */
    private final BaseView f10813b;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0026 -> B:17:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void as(byte r9, short r10, short r11, java.lang.Object[] r12) {
        /*
            byte[] r8 = com.incode.welcome_sdk.ui.BaseModulePresenter.$$a
            int r0 = r9 * 2
            int r7 = 1 - r0
            int r6 = 99 - r10
            int r0 = r11 * 2
            int r5 = 4 - r0
            byte[] r4 = new byte[r7]
            r3 = 0
            if (r8 != 0) goto L29
            r0 = r5
            r2 = r3
        L13:
            int r5 = r5 + 1
            int r6 = r6 + r0
            r1 = r2
        L17:
            int r2 = r1 + 1
            byte r0 = (byte) r6
            r4[r1] = r0
            if (r2 != r7) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r12[r3] = r0
            return
        L26:
            r0 = r8[r5]
            goto L13
        L29:
            r1 = r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.BaseModulePresenter.as(byte, short, short, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{Ascii.SYN, 117, 37, -99};
        $$b = 63;
    }

    public BaseModulePresenter(BaseView baseView) {
        Intrinsics.checkNotNullParameter(baseView, "");
        this.f10813b = baseView;
    }

    public final BaseView getMView() {
        int i2 = 2 % 2;
        int i3 = f10810c;
        int i4 = i3 + 3;
        f10811d = i4 % 128;
        int i5 = i4 % 2;
        BaseView baseView = this.f10813b;
        int i6 = i3 + 125;
        f10811d = i6 % 128;
        int i7 = i6 % 2;
        return baseView;
    }

    public final IncodeWelcome getIwTestInstance() {
        int i2 = 2 % 2;
        int i3 = f10811d + 13;
        f10810c = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f10812a;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setIwTestInstance(IncodeWelcome incodeWelcome) {
        int i2 = 2 % 2;
        int i3 = f10811d;
        int i4 = i3 + 9;
        f10810c = i4 % 128;
        int i5 = i4 % 2;
        this.f10812a = incodeWelcome;
        int i6 = i3 + 105;
        f10810c = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void error(Throwable th) {
        int i2 = 2 % 2;
        int i3 = f10810c + 125;
        f10811d = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(th, "");
            IncodeWelcome.Companion.getInstance().onError(th);
            this.f10813b.closeScreen();
            throw null;
        }
        Intrinsics.checkNotNullParameter(th, "");
        IncodeWelcome.Companion.getInstance().onError(th);
        this.f10813b.closeScreen();
        int i4 = f10810c + 91;
        f10811d = i4 % 128;
        int i5 = i4 % 2;
    }

    public <R extends BaseResult> void publishResult(Subject<R> subject, R r2) {
        int i2 = 2 % 2;
        int i3 = f10810c + 83;
        f10811d = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(subject, "");
            Intrinsics.checkNotNullParameter(r2, "");
            c(subject, r2);
        } else {
            Intrinsics.checkNotNullParameter(subject, "");
            Intrinsics.checkNotNullParameter(r2, "");
            c(subject, r2);
            int i4 = 19 / 0;
        }
    }

    public <R extends BaseResult> void publishResultOnModuleBus(R r2) {
        int i2 = 2 % 2;
        int i3 = f10811d + 47;
        f10810c = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(r2, "");
            e(r2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(r2, "");
        e(r2);
        int i4 = f10811d + 107;
        f10810c = i4 % 128;
        int i5 = i4 % 2;
    }

    private final IncodeWelcome d() {
        int i2 = 2 % 2;
        int i3 = f10811d + 101;
        f10810c = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        IncodeWelcome companion = this.f10812a;
        if (companion == null) {
            companion = IncodeWelcome.Companion.getInstance();
        }
        int i4 = f10811d + 117;
        f10810c = i4 % 128;
        int i5 = i4 % 2;
        return companion;
    }

    private final <R extends BaseResult> void c(Subject<R> subject, R r2) {
        int i2 = 2 % 2;
        int i3 = f10811d + 17;
        f10810c = i3 % 128;
        int i4 = i3 % 2;
        subject.onNext(r2);
        this.f10813b.closeScreen();
        int i5 = f10811d + 27;
        f10810c = i5 % 128;
        int i6 = i5 % 2;
    }

    private final <R extends BaseResult> void e(R r2) {
        int i2 = 2 % 2;
        int i3 = f10810c + 5;
        f10811d = i3 % 128;
        if (i3 % 2 != 0) {
            b.publish(r2);
            this.f10813b.closeScreen();
            int i4 = 75 / 0;
        } else {
            b.publish(r2);
            this.f10813b.closeScreen();
        }
        int i5 = f10811d + 39;
        f10810c = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.reactivex.Single<java.lang.Boolean> isDeviceEnvironmentSafe(boolean r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 613
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.BaseModulePresenter.isDeviceEnvironmentSafe(boolean):io.reactivex.Single");
    }

    static final class a extends Lambda implements Function1<Boolean, SingleSource<? extends Boolean>> {

        /* JADX INFO: renamed from: a */
        private static int f10814a = 0;

        /* JADX INFO: renamed from: b */
        public static final a f10815b = new a();

        /* JADX INFO: renamed from: c */
        private static int f10816c = 1;

        /* JADX INFO: renamed from: d */
        private static int f10817d = 1;

        /* JADX INFO: renamed from: e */
        private static int f10818e = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ SingleSource<? extends Boolean> invoke(Boolean bool) {
            int i2 = 2 % 2;
            int i3 = f10816c + 45;
            f10818e = i3 % 128;
            int i4 = i3 % 2;
            SingleSource<? extends Boolean> singleSourceA = a(bool);
            int i5 = f10818e + 125;
            f10816c = i5 % 128;
            if (i5 % 2 != 0) {
                return singleSourceA;
            }
            throw null;
        }

        private static SingleSource<? extends Boolean> a(Boolean bool) {
            Single singleJust;
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(bool, "");
            if (bool.booleanValue()) {
                singleJust = Single.error(new DeviceEnvironmentException("Root access detected. Rooted devices aren't supported outside of test mode!"));
                int i3 = f10816c + 13;
                f10818e = i3 % 128;
                int i4 = i3 % 2;
            } else {
                singleJust = Single.just(Boolean.TRUE);
            }
            Single single = singleJust;
            int i5 = f10816c + 117;
            f10818e = i5 % 128;
            if (i5 % 2 == 0) {
                return single;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            int i2 = f10817d + 67;
            f10814a = i2 % 128;
            int i3 = i2 % 2;
        }

        a() {
            super(1);
        }
    }

    public static final SingleSource e(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f10810c + 95;
        f10811d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        SingleSource singleSource = (SingleSource) function1.invoke(obj);
        int i5 = f10810c + 33;
        f10811d = i5 % 128;
        int i6 = i5 % 2;
        return singleSource;
    }

    static {
        init$0();
        f10811d = 0;
        f10810c = 1;
    }

    public static /* synthetic */ void getIwTestInstance$annotations() {
        int i2 = 2 % 2;
        int i3 = f10811d + 39;
        f10810c = i3 % 128;
        int i4 = i3 % 2;
    }
}
