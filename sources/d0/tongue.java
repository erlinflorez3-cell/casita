package d0;

import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class tongue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f18423e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f18424f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f18425g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f18426h;

    public tongue(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z2) {
        String str8 = Build.VERSION.RELEASE;
        this.f18419a = str;
        this.f18420b = str2;
        this.f18421c = str3;
        this.f18422d = str4;
        this.f18423e = str5;
        this.f18424f = str6;
        this.f18425g = str7;
        this.f18426h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tongue)) {
            return false;
        }
        tongue tongueVar = (tongue) obj;
        if (!Intrinsics.areEqual(this.f18419a, tongueVar.f18419a)) {
            return false;
        }
        String str = Build.VERSION.RELEASE;
        return Intrinsics.areEqual(str, str) && Intrinsics.areEqual(this.f18420b, tongueVar.f18420b) && Intrinsics.areEqual(this.f18421c, tongueVar.f18421c) && Intrinsics.areEqual(this.f18422d, tongueVar.f18422d) && Intrinsics.areEqual(this.f18423e, tongueVar.f18423e) && Intrinsics.areEqual(this.f18424f, tongueVar.f18424f) && Intrinsics.areEqual("3.22.0", "3.22.0") && Intrinsics.areEqual(this.f18425g, tongueVar.f18425g) && this.f18426h == tongueVar.f18426h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f18426h) + superior.a(this.f18425g, (((this.f18424f.hashCode() + superior.a(this.f18423e, superior.a(this.f18422d, superior.a(this.f18421c, superior.a(this.f18420b, superior.a(Build.VERSION.RELEASE, this.f18419a.hashCode() * 31, 31), 31), 31), 31), 31)) * 31) + 1504107741) * 31, 31);
    }

    public final String toString() {
        return "DeviceInfoResult(model=" + this.f18419a + ", releaseVersion=" + Build.VERSION.RELEASE + ", deviceName=" + this.f18420b + ", deviceId=" + this.f18421c + ", manufacturer=" + this.f18422d + ", serial=" + this.f18423e + ", platform=" + this.f18424f + ", agentVersion=3.22.0, agentConfiguration=" + this.f18425g + ", developerOptionsEnabled=" + this.f18426h + ")";
    }
}
