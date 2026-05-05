package com.incode.welcome_sdk.commons;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface k {

    public static final class e implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f5295a = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f5296d = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.incode.welcome_sdk.modules.g f5297b;

        public e(com.incode.welcome_sdk.modules.g gVar) {
            Intrinsics.checkNotNullParameter(gVar, "");
            this.f5297b = gVar;
        }

        public final boolean equals(Object obj) {
            int i2 = 2 % 2;
            int i3 = f5296d;
            int i4 = i3 + 33;
            int i5 = i4 % 128;
            f5295a = i5;
            int i6 = i4 % 2;
            if (this == obj) {
                int i7 = i5 + 41;
                f5296d = i7 % 128;
                int i8 = i7 % 2;
                return true;
            }
            if (!(obj instanceof e)) {
                int i9 = i5 + 11;
                f5296d = i9 % 128;
                int i10 = i9 % 2;
                return false;
            }
            if (this.f5297b == ((e) obj).f5297b) {
                return true;
            }
            int i11 = i3 + 91;
            f5295a = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }

        public final int hashCode() {
            int i2 = 2 % 2;
            int i3 = f5296d + 37;
            f5295a = i3 % 128;
            int i4 = i3 % 2;
            int iHashCode = this.f5297b.hashCode();
            int i5 = f5295a + 41;
            f5296d = i5 % 128;
            if (i5 % 2 == 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String toString() {
            int i2 = 2 % 2;
            int i3 = f5295a + 117;
            f5296d = i3 % 128;
            if (i3 % 2 != 0) {
                String str = "VideoRecordingStarted(module=" + this.f5297b + ")";
                throw null;
            }
            String str2 = "VideoRecordingStarted(module=" + this.f5297b + ")";
            int i4 = f5295a + 63;
            f5296d = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 78 / 0;
            }
            return str2;
        }
    }

    public static final class d implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f5292a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f5293b = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final com.incode.welcome_sdk.modules.g f5294d;

        public d(com.incode.welcome_sdk.modules.g gVar) {
            Intrinsics.checkNotNullParameter(gVar, "");
            this.f5294d = gVar;
        }

        public final boolean equals(Object obj) {
            int i2 = 2 % 2;
            int i3 = f5292a;
            int i4 = i3 + 71;
            f5293b = i4 % 128;
            Object obj2 = null;
            if (i4 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                return this.f5294d == ((d) obj).f5294d;
            }
            int i5 = i3 + 125;
            f5293b = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i3 + 113;
            f5293b = i7 % 128;
            if (i7 % 2 != 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }

        public final int hashCode() {
            int i2 = 2 % 2;
            int i3 = f5292a + 27;
            f5293b = i3 % 128;
            int i4 = i3 % 2;
            com.incode.welcome_sdk.modules.g gVar = this.f5294d;
            if (i4 != 0) {
                return gVar.hashCode();
            }
            gVar.hashCode();
            throw null;
        }

        public final String toString() {
            int i2 = 2 % 2;
            int i3 = f5292a + 13;
            f5293b = i3 % 128;
            if (i3 % 2 == 0) {
                String str = "VideoRecordingUploadStarted(module=" + this.f5294d + ")";
                throw null;
            }
            String str2 = "VideoRecordingUploadStarted(module=" + this.f5294d + ")";
            int i4 = f5292a + 63;
            f5293b = i4 % 128;
            int i5 = i4 % 2;
            return str2;
        }
    }
}
