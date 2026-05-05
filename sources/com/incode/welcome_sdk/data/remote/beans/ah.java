package com.incode.welcome_sdk.data.remote.beans;

import com.incode.welcome_sdk.data.remote.beans.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class ah {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f9246a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f9247b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f9248d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f9249e = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<j> f9250c;

    public ah(List<j> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.f9250c = list;
    }

    public final List<j> d() {
        int i2 = 2 % 2;
        int i3 = f9246a;
        int i4 = i3 + 1;
        f9248d = i4 % 128;
        int i5 = i4 % 2;
        List<j> list = this.f9250c;
        int i6 = i3 + 81;
        f9248d = i6 % 128;
        int i7 = i6 % 2;
        return list;
    }

    public static final class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f9251b = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f9252d = 0;

        private e() {
        }

        @JvmStatic
        public static ah e(ResponseBody responseBody) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(responseBody, "");
            JSONArray jSONArrayB = com.incode.welcome_sdk.commons.extensions.i.b(new JSONObject(responseBody.string()), "kyb");
            IntRange intRangeUntil = RangesKt.until(0, jSONArrayB.length());
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
            Iterator<Integer> it = intRangeUntil.iterator();
            while (true) {
                Object obj = null;
                if (!it.hasNext()) {
                    j.c cVar = j.f9690c;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        int i3 = f9252d + 7;
                        f9251b = i3 % 128;
                        if (i3 % 2 == 0) {
                            arrayList2.add(j.c.a((JSONObject) it2.next()));
                            obj.hashCode();
                            throw null;
                        }
                        arrayList2.add(j.c.a((JSONObject) it2.next()));
                    }
                    return new ah(arrayList2);
                }
                int i4 = f9252d + 71;
                f9251b = i4 % 128;
                if (i4 % 2 == 0) {
                    arrayList.add(jSONArrayB.getJSONObject(((IntIterator) it).nextInt()));
                    throw null;
                }
                arrayList.add(jSONArrayB.getJSONObject(((IntIterator) it).nextInt()));
            }
        }

        public /* synthetic */ e(byte b2) {
            this();
        }
    }

    static {
        new e((byte) 0);
        int i2 = f9247b + 15;
        f9249e = i2 % 128;
        int i3 = i2 % 2;
    }

    @JvmStatic
    public static final ah b(ResponseBody responseBody) {
        int i2 = 2 % 2;
        int i3 = f9246a + 87;
        f9248d = i3 % 128;
        if (i3 % 2 == 0) {
            return e.e(responseBody);
        }
        e.e(responseBody);
        throw null;
    }
}
