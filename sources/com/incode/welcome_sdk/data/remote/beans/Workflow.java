package com.incode.welcome_sdk.data.remote.beans;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class Workflow {
    public static final int $stable = 0;
    public static final a Companion = new a(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f9182b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f9183c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f9184d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f9185e = 1;
    private final boolean active;
    private final int createdAt;
    private final String id;
    private final String name;
    private final int numberOfSessions;
    private final String rootNode;

    public Workflow(String str, int i2, String str2, int i3, String str3, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.id = str;
        this.createdAt = i2;
        this.name = str2;
        this.numberOfSessions = i3;
        this.rootNode = str3;
        this.active = z2;
    }

    public final String getId() {
        int i2 = 2 % 2;
        int i3 = f9185e + 1;
        int i4 = i3 % 128;
        f9184d = i4;
        int i5 = i3 % 2;
        String str = this.id;
        int i6 = i4 + 15;
        f9185e = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 86 / 0;
        }
        return str;
    }

    public final int getCreatedAt() {
        int i2 = 2 % 2;
        int i3 = f9185e + 53;
        int i4 = i3 % 128;
        f9184d = i4;
        int i5 = i3 % 2;
        int i6 = this.createdAt;
        int i7 = i4 + 117;
        f9185e = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public final String getName() {
        int i2 = 2 % 2;
        int i3 = f9184d;
        int i4 = i3 + 65;
        f9185e = i4 % 128;
        int i5 = i4 % 2;
        String str = this.name;
        int i6 = i3 + 121;
        f9185e = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 30 / 0;
        }
        return str;
    }

    public final int getNumberOfSessions() {
        int i2 = 2 % 2;
        int i3 = f9184d + 45;
        int i4 = i3 % 128;
        f9185e = i4;
        int i5 = i3 % 2;
        int i6 = this.numberOfSessions;
        int i7 = i4 + 53;
        f9184d = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 59 / 0;
        }
        return i6;
    }

    public final String getRootNode() {
        int i2 = 2 % 2;
        int i3 = f9185e;
        int i4 = i3 + 23;
        f9184d = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.rootNode;
        int i5 = i3 + 57;
        f9184d = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean getActive() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f9185e + 35;
        int i4 = i3 % 128;
        f9184d = i4;
        if (i3 % 2 != 0) {
            z2 = this.active;
            int i5 = 92 / 0;
        } else {
            z2 = this.active;
        }
        int i6 = i4 + 77;
        f9185e = i6 % 128;
        if (i6 % 2 != 0) {
            return z2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f9186b = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f9187e = 1;

        private a() {
        }

        @JvmStatic
        public static List<Workflow> b(ResponseBody responseBody) throws JSONException, IOException {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(responseBody, "");
            JSONArray jSONArray = new JSONObject(responseBody.string()).getJSONArray("workflows");
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i3 = 0; i3 < length; i3++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i3);
                boolean z2 = jSONObject.getBoolean("active");
                String strOptString = jSONObject.optString("id", "");
                int iOptInt = jSONObject.optInt("createdAt");
                String strOptString2 = jSONObject.optString("name", "");
                int iOptInt2 = jSONObject.optInt("numberOfSessions");
                String strOptString3 = jSONObject.optString("rootNode", "");
                Intrinsics.checkNotNull(strOptString);
                Intrinsics.checkNotNull(strOptString2);
                Intrinsics.checkNotNull(strOptString3);
                arrayList.add(new Workflow(strOptString, iOptInt, strOptString2, iOptInt2, strOptString3, z2));
            }
            int i4 = f9187e + 63;
            f9186b = i4 % 128;
            if (i4 % 2 == 0) {
                return arrayList;
            }
            throw null;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        int i2 = f9183c + 85;
        f9182b = i2 % 128;
        int i3 = i2 % 2;
    }

    @JvmStatic
    public static final List<Workflow> parse(ResponseBody responseBody) throws JSONException, IOException {
        int i2 = 2 % 2;
        int i3 = f9184d + 103;
        f9185e = i3 % 128;
        int i4 = i3 % 2;
        List<Workflow> listB = a.b(responseBody);
        int i5 = f9184d + 17;
        f9185e = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 96 / 0;
        }
        return listB;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f9184d + 7;
        f9185e = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Workflow)) {
            return false;
        }
        Workflow workflow = (Workflow) obj;
        if (!Intrinsics.areEqual(this.id, workflow.id)) {
            return false;
        }
        if (this.createdAt != workflow.createdAt) {
            int i4 = f9185e + 3;
            f9184d = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.name, workflow.name)) {
            return false;
        }
        if (this.numberOfSessions != workflow.numberOfSessions) {
            int i6 = f9185e + 53;
            f9184d = i6 % 128;
            return i6 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.rootNode, workflow.rootNode)) {
            return this.active == workflow.active;
        }
        int i7 = f9185e + 11;
        f9184d = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f9185e + 65;
        f9184d = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = (((((((((this.id.hashCode() * 31) + Integer.hashCode(this.createdAt)) * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.numberOfSessions)) * 31) + this.rootNode.hashCode()) * 31) + Boolean.hashCode(this.active);
        int i5 = f9185e + 93;
        f9184d = i5 % 128;
        int i6 = i5 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f9185e + 33;
        f9184d = i3 % 128;
        int i4 = i3 % 2;
        String str = "Workflow(id=" + this.id + ", createdAt=" + this.createdAt + ", name=" + this.name + ", numberOfSessions=" + this.numberOfSessions + ", rootNode=" + this.rootNode + ", active=" + this.active + ")";
        int i5 = f9184d + 41;
        f9185e = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static /* synthetic */ Workflow copy$default(Workflow workflow, String str, int i2, String str2, int i3, String str3, boolean z2, int i4, Object obj) {
        int i5 = 2 % 2;
        if ((i4 & 1) != 0) {
            str = workflow.id;
        }
        if ((i4 & 2) != 0) {
            i2 = workflow.createdAt;
        }
        if ((i4 & 4) != 0) {
            str2 = workflow.name;
        }
        if ((i4 & 8) != 0) {
            int i6 = f9184d + 45;
            f9185e = i6 % 128;
            int i7 = i6 % 2;
            i3 = workflow.numberOfSessions;
        }
        if ((i4 & 16) != 0) {
            str3 = workflow.rootNode;
        }
        if ((i4 & 32) != 0) {
            int i8 = f9184d + 19;
            int i9 = i8 % 128;
            f9185e = i9;
            if (i8 % 2 == 0) {
                z2 = workflow.active;
                int i10 = 56 / 0;
            } else {
                z2 = workflow.active;
            }
            int i11 = i9 + 51;
            f9184d = i11 % 128;
            int i12 = i11 % 2;
        }
        return workflow.copy(str, i2, str2, i3, str3, z2);
    }

    public final Workflow copy(String str, int i2, String str2, int i3, String str3, boolean z2) {
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Workflow workflow = new Workflow(str, i2, str2, i3, str3, z2);
        int i5 = f9184d + 81;
        f9185e = i5 % 128;
        int i6 = i5 % 2;
        return workflow;
    }

    public final boolean component6() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f9184d + 13;
        int i4 = i3 % 128;
        f9185e = i4;
        if (i3 % 2 == 0) {
            z2 = this.active;
            int i5 = 84 / 0;
        } else {
            z2 = this.active;
        }
        int i6 = i4 + 15;
        f9184d = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final String component5() {
        int i2 = 2 % 2;
        int i3 = f9184d + 33;
        f9185e = i3 % 128;
        int i4 = i3 % 2;
        String str = this.rootNode;
        if (i4 == 0) {
            int i5 = 4 / 0;
        }
        return str;
    }

    public final int component4() {
        int i2 = 2 % 2;
        int i3 = f9185e + 111;
        int i4 = i3 % 128;
        f9184d = i4;
        int i5 = i3 % 2;
        int i6 = this.numberOfSessions;
        int i7 = i4 + 25;
        f9185e = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public final String component3() {
        int i2 = 2 % 2;
        int i3 = f9185e + 43;
        f9184d = i3 % 128;
        if (i3 % 2 == 0) {
            return this.name;
        }
        throw null;
    }

    public final int component2() {
        int i2 = 2 % 2;
        int i3 = f9184d;
        int i4 = i3 + 89;
        f9185e = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.createdAt;
        int i7 = i3 + 103;
        f9185e = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public final String component1() {
        int i2 = 2 % 2;
        int i3 = f9185e;
        int i4 = i3 + 65;
        f9184d = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.id;
        int i5 = i3 + 67;
        f9184d = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }
}
