package g0;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class pair {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f19664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f19666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f19667d;

    public pair(ArrayList arrayList, String str, ArrayList arrayList2, String str2) {
        this.f19664a = arrayList;
        this.f19665b = str;
        this.f19666c = arrayList2;
        this.f19667d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pair)) {
            return false;
        }
        pair pairVar = (pair) obj;
        return Intrinsics.areEqual(this.f19664a, pairVar.f19664a) && Intrinsics.areEqual(this.f19665b, pairVar.f19665b) && Intrinsics.areEqual(this.f19666c, pairVar.f19666c) && Intrinsics.areEqual(this.f19667d, pairVar.f19667d);
    }

    public final int hashCode() {
        return this.f19667d.hashCode() + ((this.f19666c.hashCode() + d0.superior.a(this.f19665b, this.f19664a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "AdvancedEmulatorInfo(emulatorFolders=" + this.f19664a + ", operatorName=" + this.f19665b + ", qemuDriver=" + this.f19666c + ", networkInterface=" + this.f19667d + ")";
    }
}
