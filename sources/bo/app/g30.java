package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f707e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f708f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f709g;

    public g30(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7) {
        this.f703a = num;
        this.f704b = num2;
        this.f705c = num3;
        this.f706d = num4;
        this.f707e = num5;
        this.f708f = num6;
        this.f709g = num7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g30)) {
            return false;
        }
        g30 g30Var = (g30) obj;
        return Intrinsics.areEqual(this.f703a, g30Var.f703a) && Intrinsics.areEqual(this.f704b, g30Var.f704b) && Intrinsics.areEqual(this.f705c, g30Var.f705c) && Intrinsics.areEqual(this.f706d, g30Var.f706d) && Intrinsics.areEqual(this.f707e, g30Var.f707e) && Intrinsics.areEqual(this.f708f, g30Var.f708f) && Intrinsics.areEqual(this.f709g, g30Var.f709g);
    }

    public final int hashCode() {
        Integer num = this.f703a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f704b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f705c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f706d;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f707e;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f708f;
        int iHashCode6 = (iHashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.f709g;
        return iHashCode6 + (num7 != null ? num7.hashCode() : 0);
    }

    public final String toString() {
        return "InAppMessageTheme(backgroundColor=" + this.f703a + ", textColor=" + this.f704b + ", closeButtonColor=" + this.f705c + ", iconColor=" + this.f706d + ", iconBackgroundColor=" + this.f707e + ", headerTextColor=" + this.f708f + ", frameColor=" + this.f709g + ')';
    }
}
