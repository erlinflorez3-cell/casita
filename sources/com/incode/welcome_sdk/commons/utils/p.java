package com.incode.welcome_sdk.commons.utils;

import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import com.incode.welcome_sdk.commons.utils.p;
import com.incode.welcome_sdk.ui.camera.video_selfie.DaggerVideoSelfieComponent;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f6573a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f6574b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f6575c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f6576d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f6577e = new c(0);

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f6578a = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f6579d = 0;

        public static /* synthetic */ Object c(int i2, int i3, int i4, Object[] objArr, int i5, int i6, int i7) {
            int i8 = ~i7;
            int i9 = ~(i8 | i4);
            int i10 = ~(i8 | i5);
            int i11 = i9 | i10;
            int i12 = ~i4;
            int i13 = (~((~i5) | i8 | i4)) | (~(i8 | i12 | i5));
            int i14 = i10 | (~(i12 | i7));
            int i15 = i7 + i4 + i3 + ((-1696018712) * i2) + (2108813197 * i6);
            int i16 = i15 * i15;
            int i17 = ((212195308 * i7) - 2121662464) + (1221732374 * i4) + (1009537066 * i11) + (i13 * (-504768533)) + ((-504768533) * i14) + (716963840 * i3) + (39845888 * i2) + (227278848 * i6) + ((-1705377792) * i16);
            int i18 = ((i7 * 362004572) - 1408384217) + (i4 * 362004174) + (i11 * (-398)) + (i13 * 199) + (i14 * 199) + (i3 * 362004373) + (i2 * (-1290304248)) + (i6 * 155295761) + (i16 * (-60686336));
            return i17 + ((i18 * i18) * (-1680474112)) != 1 ? a(objArr) : d(objArr);
        }

        private c() {
        }

        static final class k extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f6620b = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f6621e = 1;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private /* synthetic */ Vibrator f6622c;

            private void e() {
                int i2 = 2 % 2;
                int i3 = f6621e + 19;
                f6620b = i3 % 128;
                if (i3 % 2 == 0) {
                    this.f6622c.vibrate(VibrationEffect.createOneShot(10L, -1));
                } else {
                    this.f6622c.vibrate(VibrationEffect.createOneShot(10L, -1));
                    int i4 = 95 / 0;
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Unit invoke() {
                int i2 = 2 % 2;
                int i3 = f6621e + 91;
                f6620b = i3 % 128;
                int i4 = i3 % 2;
                e();
                Unit unit = Unit.INSTANCE;
                if (i4 == 0) {
                    return unit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            k(Vibrator vibrator) {
                super(0);
                this.f6622c = vibrator;
            }
        }

        static final class a extends Lambda implements Function1<Throwable, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f6580a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f6581b = 1;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f6582c = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f6583d = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final a f6584e = new a();

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                int i2 = 2 % 2;
                int i3 = f6580a + 29;
                f6581b = i3 % 128;
                int i4 = i3 % 2;
                Unit unit = Unit.INSTANCE;
                if (i4 != 0) {
                    return unit;
                }
                throw null;
            }

            static {
                int i2 = f6583d + 125;
                f6582c = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
            }

            a() {
                super(1);
            }
        }

        static final class b extends Lambda implements Function1<Long, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f6585a = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f6586c = 1;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Function0<Unit> f6587b;

            private void a() {
                int i2 = 2 % 2;
                int i3 = f6586c + 39;
                f6585a = i3 % 128;
                if (i3 % 2 != 0) {
                    this.f6587b.invoke();
                    int i4 = 73 / 0;
                } else {
                    this.f6587b.invoke();
                }
                int i5 = f6586c + 53;
                f6585a = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(Long l2) {
                int i2 = 2 % 2;
                int i3 = f6586c + 79;
                f6585a = i3 % 128;
                int i4 = i3 % 2;
                a();
                Unit unit = Unit.INSTANCE;
                if (i4 != 0) {
                    int i5 = 69 / 0;
                }
                return unit;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Function0<Unit> function0) {
                super(1);
                this.f6587b = function0;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(Function1 function1, Object obj) {
            int i2 = 2 % 2;
            int i3 = f6579d + 71;
            f6578a = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(function1, "");
                function1.invoke(obj);
                int i4 = 96 / 0;
            } else {
                Intrinsics.checkNotNullParameter(function1, "");
                function1.invoke(obj);
            }
            int i5 = f6578a + 9;
            f6579d = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(Function1 function1, Object obj) {
            int i2 = 2 % 2;
            int i3 = f6579d + 43;
            f6578a = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            int i5 = f6579d + 17;
            f6578a = i5 % 128;
            int i6 = i5 % 2;
        }

        static final class i extends Lambda implements Function1<Long, Long> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f6614a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f6615b = 1;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private /* synthetic */ Function0<Unit> f6616c;

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Long invoke(Long l2) {
                int i2 = 2 % 2;
                int i3 = f6615b + 83;
                f6614a = i3 % 128;
                int i4 = i3 % 2;
                Long lC = c(l2);
                int i5 = f6615b + 81;
                f6614a = i5 % 128;
                int i6 = i5 % 2;
                return lC;
            }

            private Long c(Long l2) {
                int i2 = 2 % 2;
                int i3 = f6615b + 105;
                f6614a = i3 % 128;
                if (i3 % 2 == 0) {
                    this.f6616c.invoke();
                    return l2;
                }
                this.f6616c.invoke();
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            i(Function0<Unit> function0) {
                super(1);
                this.f6616c = function0;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Long c(Function1 function1, Object obj) {
            Long l2;
            int i2 = 2 % 2;
            int i3 = f6578a + 121;
            f6579d = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(function1, "");
                Intrinsics.checkNotNullParameter(obj, "");
                l2 = (Long) function1.invoke(obj);
                int i4 = 18 / 0;
            } else {
                Intrinsics.checkNotNullParameter(function1, "");
                Intrinsics.checkNotNullParameter(obj, "");
                l2 = (Long) function1.invoke(obj);
            }
            int i5 = f6579d + 45;
            f6578a = i5 % 128;
            if (i5 % 2 != 0) {
                return l2;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        static final class j extends Lambda implements Function1<Long, Long> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f6617d = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f6618e = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Function0<Unit> f6619b;

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Long invoke(Long l2) {
                int i2 = 2 % 2;
                int i3 = f6617d + 117;
                f6618e = i3 % 128;
                Long l3 = l2;
                if (i3 % 2 == 0) {
                    return a(l3);
                }
                a(l3);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private Long a(Long l2) {
                int i2 = 2 % 2;
                int i3 = f6618e + 115;
                f6617d = i3 % 128;
                int i4 = i3 % 2;
                this.f6619b.invoke();
                int i5 = f6617d + 1;
                f6618e = i5 % 128;
                if (i5 % 2 == 0) {
                    return l2;
                }
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(Function0<Unit> function0) {
                super(1);
                this.f6619b = function0;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Long a(Function1 function1, Object obj) {
            int i2 = 2 % 2;
            int i3 = f6578a + 109;
            f6579d = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            Long l2 = (Long) function1.invoke(obj);
            int i5 = f6579d + 99;
            f6578a = i5 % 128;
            if (i5 % 2 != 0) {
                return l2;
            }
            throw null;
        }

        static final class g extends Lambda implements Function1<Throwable, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final g f6604a = new g();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f6605b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f6606c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f6607d = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f6608e = 1;

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                int i2 = 2 % 2;
                int i3 = f6607d + 23;
                f6606c = i3 % 128;
                int i4 = i3 % 2;
                Unit unit = Unit.INSTANCE;
                int i5 = f6606c + 91;
                f6607d = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }

            static {
                int i2 = f6605b + 25;
                f6608e = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 44 / 0;
                }
            }

            g() {
                super(1);
            }
        }

        static final class h extends Lambda implements Function1<Long, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f6609a = 1;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f6610b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final h f6611c = new h();

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f6612d = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f6613e = 1;

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(Long l2) {
                int i2 = 2 % 2;
                int i3 = f6609a + 1;
                f6610b = i3 % 128;
                int i4 = i3 % 2;
                Unit unit = Unit.INSTANCE;
                int i5 = f6609a + 57;
                f6610b = i5 % 128;
                if (i5 % 2 == 0) {
                    return unit;
                }
                throw null;
            }

            static {
                int i2 = f6613e + 73;
                f6612d = i2 % 128;
                int i3 = i2 % 2;
            }

            h() {
                super(1);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(Function1 function1, Object obj) {
            int i2 = 2 % 2;
            int i3 = f6579d + 125;
            f6578a = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            int i5 = f6578a + 103;
            f6579d = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void h(Function1 function1, Object obj) {
            int i2 = 2 % 2;
            int i3 = f6579d + 35;
            f6578a = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            int i5 = f6578a + 109;
            f6579d = i5 % 128;
            int i6 = i5 % 2;
        }

        static final class o extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f6631b = 1;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f6632c = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private /* synthetic */ Vibrator f6633a;

            private void c() {
                int i2 = 2 % 2;
                int i3 = f6631b + 43;
                f6632c = i3 % 128;
                int i4 = i3 % 2;
                this.f6633a.vibrate(10L);
                int i5 = f6631b + 61;
                f6632c = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Unit invoke() {
                int i2 = 2 % 2;
                int i3 = f6632c + 23;
                f6631b = i3 % 128;
                int i4 = i3 % 2;
                c();
                Unit unit = Unit.INSTANCE;
                int i5 = f6632c + 3;
                f6631b = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            o(Vibrator vibrator) {
                super(0);
                this.f6633a = vibrator;
            }
        }

        static final class f extends Lambda implements Function1<Long, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f6601a = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f6602d = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Function0<Unit> f6603b;

            private void e() {
                int i2 = 2 % 2;
                int i3 = f6602d + 67;
                f6601a = i3 % 128;
                int i4 = i3 % 2;
                this.f6603b.invoke();
                int i5 = f6602d + 113;
                f6601a = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 62 / 0;
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(Long l2) {
                int i2 = 2 % 2;
                int i3 = f6602d + 31;
                f6601a = i3 % 128;
                int i4 = i3 % 2;
                e();
                Unit unit = Unit.INSTANCE;
                if (i4 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = f6602d + 107;
                f6601a = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(Function0<Unit> function0) {
                super(1);
                this.f6603b = function0;
            }
        }

        static final class l extends Lambda implements Function1<Throwable, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f6623a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final l f6624b = new l();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f6625c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f6626d = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f6627e = 1;

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                int i2 = 2 % 2;
                int i3 = f6623a + 43;
                f6627e = i3 % 128;
                int i4 = i3 % 2;
                Unit unit = Unit.INSTANCE;
                int i5 = f6623a + 51;
                f6627e = i5 % 128;
                if (i5 % 2 != 0) {
                    return unit;
                }
                throw null;
            }

            static {
                int i2 = f6626d + 35;
                f6625c = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
            }

            l() {
                super(1);
            }
        }

        private static /* synthetic */ Object a(Object[] objArr) {
            Function1 function1 = (Function1) objArr[0];
            Object obj = objArr[1];
            int i2 = 2 % 2;
            int i3 = f6578a + 53;
            f6579d = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            int i5 = f6579d + 15;
            f6578a = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 82 / 0;
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void j(Function1 function1, Object obj) {
            int i2 = 2 % 2;
            int i3 = f6579d + 7;
            f6578a = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            int i5 = f6578a + 33;
            f6579d = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 31 / 0;
            }
        }

        static final class n extends Lambda implements Function1<Long, Long> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f6628a = 1;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f6629b = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private /* synthetic */ Function0<Unit> f6630d;

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Long invoke(Long l2) {
                int i2 = 2 % 2;
                int i3 = f6629b + 117;
                f6628a = i3 % 128;
                int i4 = i3 % 2;
                Long lE = e(l2);
                if (i4 == 0) {
                    int i5 = 93 / 0;
                }
                int i6 = f6628a + 93;
                f6629b = i6 % 128;
                int i7 = i6 % 2;
                return lE;
            }

            private Long e(Long l2) {
                int i2 = 2 % 2;
                int i3 = f6628a + 67;
                f6629b = i3 % 128;
                int i4 = i3 % 2;
                this.f6630d.invoke();
                int i5 = f6628a + 85;
                f6629b = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 23 / 0;
                }
                return l2;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            n(Function0<Unit> function0) {
                super(1);
                this.f6630d = function0;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Long g(Function1 function1, Object obj) {
            int i2 = 2 % 2;
            int i3 = f6578a + 21;
            f6579d = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            Long l2 = (Long) function1.invoke(obj);
            int i5 = f6578a + 73;
            f6579d = i5 % 128;
            int i6 = i5 % 2;
            return l2;
        }

        static final class d extends Lambda implements Function1<Long, Long> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f6593b = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f6594d = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private /* synthetic */ Function0<Unit> f6595a;

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Long invoke(Long l2) {
                int i2 = 2 % 2;
                int i3 = f6593b + 91;
                f6594d = i3 % 128;
                Long l3 = l2;
                if (i3 % 2 != 0) {
                    a(l3);
                    throw null;
                }
                Long lA = a(l3);
                int i4 = f6594d + 89;
                f6593b = i4 % 128;
                int i5 = i4 % 2;
                return lA;
            }

            private Long a(Long l2) {
                int i2 = 2 % 2;
                int i3 = f6594d + 87;
                f6593b = i3 % 128;
                int i4 = i3 % 2;
                this.f6595a.invoke();
                int i5 = f6593b + 33;
                f6594d = i5 % 128;
                if (i5 % 2 == 0) {
                    return l2;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(Function0<Unit> function0) {
                super(1);
                this.f6595a = function0;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Long f(Function1 function1, Object obj) {
            int i2 = 2 % 2;
            int i3 = f6579d + 63;
            f6578a = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            Long l2 = (Long) function1.invoke(obj);
            int i5 = f6578a + 115;
            f6579d = i5 % 128;
            int i6 = i5 % 2;
            return l2;
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.commons.utils.p$c$c, reason: collision with other inner class name */
        static final class C0221c extends Lambda implements Function1<Throwable, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0221c f6588a = new C0221c();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f6589b = 1;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f6590c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f6591d = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f6592e = 1;

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                int i2 = 2 % 2;
                int i3 = f6589b + 29;
                f6590c = i3 % 128;
                int i4 = i3 % 2;
                Unit unit = Unit.INSTANCE;
                int i5 = f6589b + 39;
                f6590c = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }

            static {
                int i2 = f6591d + 7;
                f6592e = i2 % 128;
                int i3 = i2 % 2;
            }

            C0221c() {
                super(1);
            }
        }

        static final class e extends Lambda implements Function1<Long, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f6596a = 1;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final e f6597b = new e();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f6598c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f6599d = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f6600e = 0;

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(Long l2) {
                int i2 = 2 % 2;
                int i3 = f6598c + 23;
                f6599d = i3 % 128;
                int i4 = i3 % 2;
                Unit unit = Unit.INSTANCE;
                int i5 = f6599d + 29;
                f6598c = i5 % 128;
                if (i5 % 2 == 0) {
                    return unit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            static {
                int i2 = f6596a + 7;
                f6600e = i2 % 128;
                if (i2 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            e() {
                super(1);
            }
        }

        private static /* synthetic */ Object d(Object[] objArr) {
            Function1 function1 = (Function1) objArr[0];
            Object obj = objArr[1];
            int i2 = 2 % 2;
            int i3 = f6578a + 17;
            f6579d = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(function1, "");
                function1.invoke(obj);
                return null;
            }
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            int i4 = 97 / 0;
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(Function1 function1, Object obj) {
            int i2 = 2 % 2;
            int i3 = f6578a + 15;
            f6579d = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            int i5 = f6579d + 55;
            f6578a = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        @JvmStatic
        public static void a(Vibrator vibrator, boolean z2) {
            int i2 = 2 % 2;
            int i3 = f6578a + 41;
            f6579d = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(vibrator, "");
                if (Build.VERSION.SDK_INT < 74) {
                    o oVar = new o(vibrator);
                    if (z2) {
                        oVar.invoke();
                        Observable<Long> observableTimer = Observable.timer(150L, TimeUnit.MILLISECONDS);
                        final f fVar = new f(oVar);
                        Consumer<? super Long> consumer = new Consumer() { // from class: com.incode.welcome_sdk.commons.utils.p$c$$ExternalSyntheticLambda10
                            @Override // io.reactivex.functions.Consumer
                            public final void accept(Object obj) {
                                p.c.j(fVar, obj);
                            }
                        };
                        final l lVar = l.f6624b;
                        observableTimer.subscribe(consumer, new Consumer() { // from class: com.incode.welcome_sdk.commons.utils.p$c$$ExternalSyntheticLambda11
                            @Override // io.reactivex.functions.Consumer
                            public final void accept(Object obj) {
                                p.c.i(lVar, obj);
                            }
                        });
                        return;
                    }
                    oVar.invoke();
                    Observable<Long> observableTimer2 = Observable.timer(110L, TimeUnit.MILLISECONDS);
                    final n nVar = new n(oVar);
                    Observable observableDelay = observableTimer2.map(new Function() { // from class: com.incode.welcome_sdk.commons.utils.p$c$$ExternalSyntheticLambda1
                        @Override // io.reactivex.functions.Function
                        public final Object apply(Object obj) {
                            return p.c.g(nVar, obj);
                        }
                    }).delay(110L, TimeUnit.MILLISECONDS);
                    final d dVar = new d(oVar);
                    Observable map = observableDelay.map(new Function() { // from class: com.incode.welcome_sdk.commons.utils.p$c$$ExternalSyntheticLambda2
                        @Override // io.reactivex.functions.Function
                        public final Object apply(Object obj) {
                            return p.c.f(dVar, obj);
                        }
                    });
                    final e eVar = e.f6597b;
                    Consumer consumer2 = new Consumer() { // from class: com.incode.welcome_sdk.commons.utils.p$c$$ExternalSyntheticLambda3
                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            p.c.k(eVar, obj);
                        }
                    };
                    final C0221c c0221c = C0221c.f6588a;
                    map.subscribe(consumer2, new Consumer() { // from class: com.incode.welcome_sdk.commons.utils.p$c$$ExternalSyntheticLambda4
                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            p.c.m(c0221c, obj);
                        }
                    });
                    int i4 = f6578a + 57;
                    f6579d = i4 % 128;
                    int i5 = i4 % 2;
                    return;
                }
            } else {
                Intrinsics.checkNotNullParameter(vibrator, "");
            }
            k kVar = new k(vibrator);
            if (z2) {
                kVar.invoke();
                Observable<Long> observableTimer3 = Observable.timer(150L, TimeUnit.MILLISECONDS);
                final b bVar = new b(kVar);
                Consumer<? super Long> consumer3 = new Consumer() { // from class: com.incode.welcome_sdk.commons.utils.p$c$$ExternalSyntheticLambda0
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        p.c.e(bVar, obj);
                    }
                };
                final a aVar = a.f6584e;
                observableTimer3.subscribe(consumer3, new Consumer() { // from class: com.incode.welcome_sdk.commons.utils.p$c$$ExternalSyntheticLambda5
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        p.c.d(aVar, obj);
                    }
                });
                return;
            }
            kVar.invoke();
            Observable<Long> observableTimer4 = Observable.timer(110L, TimeUnit.MILLISECONDS);
            final i iVar = new i(kVar);
            Observable observableDelay2 = observableTimer4.map(new Function() { // from class: com.incode.welcome_sdk.commons.utils.p$c$$ExternalSyntheticLambda6
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return p.c.c(iVar, obj);
                }
            }).delay(110L, TimeUnit.MILLISECONDS);
            final j jVar = new j(kVar);
            Observable map2 = observableDelay2.map(new Function() { // from class: com.incode.welcome_sdk.commons.utils.p$c$$ExternalSyntheticLambda7
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return p.c.a(jVar, obj);
                }
            });
            final h hVar = h.f6611c;
            Consumer consumer4 = new Consumer() { // from class: com.incode.welcome_sdk.commons.utils.p$c$$ExternalSyntheticLambda8
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    p.c.b(hVar, obj);
                }
            };
            final g gVar = g.f6604a;
            map2.subscribe(consumer4, new Consumer() { // from class: com.incode.welcome_sdk.commons.utils.p$c$$ExternalSyntheticLambda9
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    p.c.h(gVar, obj);
                }
            });
        }

        public /* synthetic */ c(byte b2) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(Function1 function1, Object obj) {
            int iA = DaggerVideoSelfieComponent.Builder.a();
            int iA2 = DaggerVideoSelfieComponent.Builder.a();
            c(DaggerVideoSelfieComponent.Builder.a(), iA2, 957352296, new Object[]{function1, obj}, iA, DaggerVideoSelfieComponent.Builder.a(), -957352295);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(Function1 function1, Object obj) {
            int iA = DaggerVideoSelfieComponent.Builder.a();
            int iA2 = DaggerVideoSelfieComponent.Builder.a();
            c(DaggerVideoSelfieComponent.Builder.a(), iA2, -1786122101, new Object[]{function1, obj}, iA, DaggerVideoSelfieComponent.Builder.a(), 1786122101);
        }
    }

    static {
        int i2 = f6573a + 9;
        f6576d = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @JvmStatic
    public static final void c(Vibrator vibrator, boolean z2) {
        int i2 = 2 % 2;
        int i3 = f6575c + 53;
        f6574b = i3 % 128;
        int i4 = i3 % 2;
        c.a(vibrator, z2);
        int i5 = f6574b + 111;
        f6575c = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
