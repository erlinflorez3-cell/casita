package com.incode.welcome_sdk.data.remote;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class c<T> {

    public static final class e<T> extends c<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f10116b = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f10117e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final T f10118a;

        public e(T t2) {
            super((byte) 0);
            this.f10118a = t2;
        }

        public final T b() {
            int i2 = 2 % 2;
            int i3 = f10117e + 21;
            int i4 = i3 % 128;
            f10116b = i4;
            if (i3 % 2 == 0) {
                throw null;
            }
            T t2 = this.f10118a;
            int i5 = i4 + 57;
            f10117e = i5 % 128;
            if (i5 % 2 == 0) {
                return t2;
            }
            throw null;
        }

        public final boolean equals(Object obj) {
            int i2 = 2 % 2;
            if (this == obj) {
                int i3 = f10116b + 113;
                f10117e = i3 % 128;
                int i4 = i3 % 2;
                return true;
            }
            if (obj instanceof e) {
                return Intrinsics.areEqual(this.f10118a, ((e) obj).f10118a);
            }
            int i5 = f10116b + 35;
            int i6 = i5 % 128;
            f10117e = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 47;
            f10116b = i8 % 128;
            if (i8 % 2 != 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final int hashCode() {
            int i2 = 2 % 2;
            int i3 = f10117e + 35;
            f10116b = i3 % 128;
            int i4 = i3 % 2;
            T t2 = this.f10118a;
            if (t2 == null) {
                return 0;
            }
            int iHashCode = t2.hashCode();
            int i5 = f10116b + 91;
            f10117e = i5 % 128;
            int i6 = i5 % 2;
            return iHashCode;
        }

        public final String toString() {
            int i2 = 2 % 2;
            int i3 = f10116b + 113;
            f10117e = i3 % 128;
            int i4 = i3 % 2;
            String str = "Success(data=" + this.f10118a + ")";
            int i5 = f10117e + 1;
            f10116b = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }
    }

    private c() {
    }

    public static final class a extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f10110b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f10111c = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Exception f10112a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super((byte) 0);
            Intrinsics.checkNotNullParameter(exc, "");
            this.f10112a = exc;
        }

        public final Exception b() {
            int i2 = 2 % 2;
            int i3 = f10111c;
            int i4 = i3 + 125;
            f10110b = i4 % 128;
            int i5 = i4 % 2;
            Exception exc = this.f10112a;
            int i6 = i3 + 93;
            f10110b = i6 % 128;
            if (i6 % 2 == 0) {
                return exc;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean equals(Object obj) {
            int i2 = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            if (Intrinsics.areEqual(this.f10112a, ((a) obj).f10112a)) {
                return true;
            }
            int i3 = f10110b + 87;
            int i4 = i3 % 128;
            f10111c = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 57;
            f10110b = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public final int hashCode() {
            int i2 = 2 % 2;
            int i3 = f10111c + 57;
            f10110b = i3 % 128;
            int i4 = i3 % 2;
            int iHashCode = this.f10112a.hashCode();
            int i5 = f10110b + 41;
            f10111c = i5 % 128;
            int i6 = i5 % 2;
            return iHashCode;
        }

        public final String toString() {
            int i2 = 2 % 2;
            int i3 = f10111c + 53;
            f10110b = i3 % 128;
            if (i3 % 2 != 0) {
                String str = "Error(exception=" + this.f10112a + ")";
                throw null;
            }
            String str2 = "Error(exception=" + this.f10112a + ")";
            int i4 = f10110b + 5;
            f10111c = i4 % 128;
            int i5 = i4 % 2;
            return str2;
        }
    }

    public static final class d extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f10113a = new d();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f10114c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f10115d = 0;

        private d() {
            super((byte) 0);
        }

        static {
            int i2 = f10114c + 41;
            f10115d = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public /* synthetic */ c(byte b2) {
        this();
    }
}
