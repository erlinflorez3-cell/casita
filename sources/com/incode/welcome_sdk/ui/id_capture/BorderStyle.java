package com.incode.welcome_sdk.ui.id_capture;

import androidx.compose.ui.graphics.Color;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BorderStyle {

    public static final class Solid extends BorderStyle {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f14572c = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f14573e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f14574a;

        private Solid(long j2) {
            super(null);
            this.f14574a = j2;
        }

        /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
        public final long m8482getColor0d7_KjU() {
            int i2 = 2 % 2;
            int i3 = f14572c;
            int i4 = i3 + 63;
            f14573e = i4 % 128;
            int i5 = i4 % 2;
            long j2 = this.f14574a;
            int i6 = i3 + 113;
            f14573e = i6 % 128;
            int i7 = i6 % 2;
            return j2;
        }

        public /* synthetic */ Solid(long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j2);
        }

        public final boolean equals(Object obj) {
            int i2 = 2 % 2;
            int i3 = f14572c + 87;
            f14573e = i3 % 128;
            int i4 = i3 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Solid)) {
                return false;
            }
            if (Color.m4179equalsimpl0(this.f14574a, ((Solid) obj).f14574a)) {
                int i5 = f14572c + 97;
                f14573e = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            int i7 = f14572c + 9;
            f14573e = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public final int hashCode() {
            int i2 = 2 % 2;
            int i3 = f14572c + 55;
            f14573e = i3 % 128;
            if (i3 % 2 == 0) {
                return Color.m4185hashCodeimpl(this.f14574a);
            }
            Color.m4185hashCodeimpl(this.f14574a);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String toString() {
            int i2 = 2 % 2;
            int i3 = f14573e + 51;
            f14572c = i3 % 128;
            int i4 = i3 % 2;
            String str = "Solid(color=" + Color.m4186toStringimpl(this.f14574a) + ")";
            int i5 = f14573e + 107;
            f14572c = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: copy-8_81llA$default, reason: not valid java name */
        public static /* synthetic */ Solid m8479copy8_81llA$default(Solid solid, long j2, int i2, Object obj) {
            int i3 = 2 % 2;
            int i4 = f14573e;
            int i5 = i4 + 1;
            f14572c = i5 % 128;
            int i6 = i5 % 2;
            if ((i2 & 1) != 0) {
                int i7 = i4 + 61;
                f14572c = i7 % 128;
                if (i7 % 2 == 0) {
                    long j3 = solid.f14574a;
                    throw null;
                }
                j2 = solid.f14574a;
            }
            return solid.m8481copy8_81llA(j2);
        }

        /* JADX INFO: renamed from: copy-8_81llA, reason: not valid java name */
        public final Solid m8481copy8_81llA(long j2) {
            int i2 = 2 % 2;
            Solid solid = new Solid(j2, null);
            int i3 = f14573e + 121;
            f14572c = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 16 / 0;
            }
            return solid;
        }

        /* JADX INFO: renamed from: component1-0d7_KjU, reason: not valid java name */
        public final long m8480component10d7_KjU() {
            int i2 = 2 % 2;
            int i3 = f14573e;
            int i4 = i3 + 17;
            f14572c = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            long j2 = this.f14574a;
            int i5 = i3 + 9;
            f14572c = i5 % 128;
            if (i5 % 2 != 0) {
                return j2;
            }
            obj.hashCode();
            throw null;
        }
    }

    private BorderStyle() {
    }

    public static final class Gradient extends BorderStyle {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f14568b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f14569c = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f14570a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f14571d;

        private Gradient(long j2, long j3) {
            super(null);
            this.f14571d = j2;
            this.f14570a = j3;
        }

        /* JADX INFO: renamed from: getEndColor-0d7_KjU, reason: not valid java name */
        public final long m8477getEndColor0d7_KjU() {
            int i2 = 2 % 2;
            int i3 = f14569c + 55;
            int i4 = i3 % 128;
            f14568b = i4;
            int i5 = i3 % 2;
            long j2 = this.f14570a;
            int i6 = i4 + 29;
            f14569c = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 79 / 0;
            }
            return j2;
        }

        /* JADX INFO: renamed from: getStartColor-0d7_KjU, reason: not valid java name */
        public final long m8478getStartColor0d7_KjU() {
            int i2 = 2 % 2;
            int i3 = f14568b + 79;
            int i4 = i3 % 128;
            f14569c = i4;
            int i5 = i3 % 2;
            long j2 = this.f14571d;
            int i6 = i4 + 29;
            f14568b = i6 % 128;
            if (i6 % 2 == 0) {
                return j2;
            }
            throw null;
        }

        public /* synthetic */ Gradient(long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
            this(j2, j3);
        }

        public final boolean equals(Object obj) {
            int i2 = 2 % 2;
            int i3 = f14568b;
            int i4 = i3 + 59;
            f14569c = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Gradient)) {
                int i5 = i3 + 87;
                f14569c = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            Gradient gradient = (Gradient) obj;
            if (Color.m4179equalsimpl0(this.f14571d, gradient.f14571d)) {
                return Color.m4179equalsimpl0(this.f14570a, gradient.f14570a);
            }
            int i7 = f14569c + 23;
            f14568b = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public final int hashCode() {
            int i2 = 2 % 2;
            int i3 = f14569c + 105;
            f14568b = i3 % 128;
            int i4 = i3 % 2;
            int iM4185hashCodeimpl = (Color.m4185hashCodeimpl(this.f14571d) * 31) + Color.m4185hashCodeimpl(this.f14570a);
            int i5 = f14569c + 71;
            f14568b = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 43 / 0;
            }
            return iM4185hashCodeimpl;
        }

        public final String toString() {
            int i2 = 2 % 2;
            int i3 = f14569c + 37;
            f14568b = i3 % 128;
            int i4 = i3 % 2;
            String str = "Gradient(startColor=" + Color.m4186toStringimpl(this.f14571d) + ", endColor=" + Color.m4186toStringimpl(this.f14570a) + ")";
            int i5 = f14569c + 101;
            f14568b = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        /* JADX INFO: renamed from: copy--OWjLjI$default, reason: not valid java name */
        public static /* synthetic */ Gradient m8473copyOWjLjI$default(Gradient gradient, long j2, long j3, int i2, Object obj) {
            int i3 = 2 % 2;
            if ((i2 & 1) != 0) {
                j2 = gradient.f14571d;
                int i4 = f14569c + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f14568b = i4 % 128;
                int i5 = i4 % 2;
            }
            if ((i2 & 2) != 0) {
                int i6 = f14569c + 109;
                f14568b = i6 % 128;
                if (i6 % 2 != 0) {
                    long j4 = gradient.f14570a;
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                j3 = gradient.f14570a;
            }
            return gradient.m8476copyOWjLjI(j2, j3);
        }

        /* JADX INFO: renamed from: copy--OWjLjI, reason: not valid java name */
        public final Gradient m8476copyOWjLjI(long j2, long j3) {
            int i2 = 2 % 2;
            Gradient gradient = new Gradient(j2, j3, null);
            int i3 = f14568b + 73;
            f14569c = i3 % 128;
            if (i3 % 2 != 0) {
                return gradient;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: component2-0d7_KjU, reason: not valid java name */
        public final long m8475component20d7_KjU() {
            int i2 = 2 % 2;
            int i3 = f14569c;
            int i4 = i3 + 105;
            f14568b = i4 % 128;
            int i5 = i4 % 2;
            long j2 = this.f14570a;
            int i6 = i3 + 123;
            f14568b = i6 % 128;
            int i7 = i6 % 2;
            return j2;
        }

        /* JADX INFO: renamed from: component1-0d7_KjU, reason: not valid java name */
        public final long m8474component10d7_KjU() {
            int i2 = 2 % 2;
            int i3 = f14569c + 85;
            int i4 = i3 % 128;
            f14568b = i4;
            int i5 = i3 % 2;
            long j2 = this.f14571d;
            if (i5 != 0) {
                int i6 = 89 / 0;
            }
            int i7 = i4 + 13;
            f14569c = i7 % 128;
            int i8 = i7 % 2;
            return j2;
        }
    }

    public /* synthetic */ BorderStyle(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
