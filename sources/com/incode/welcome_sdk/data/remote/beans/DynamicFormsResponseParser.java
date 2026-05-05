package com.incode.welcome_sdk.data.remote.beans;

import com.incode.welcome_sdk.modules.DynamicForms;
import io.sentry.rrweb.RRWebOptionsEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class DynamicFormsResponseParser {
    public static final int $stable = 0;
    public static final e Companion = new e(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f9069a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f9070b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f9071c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f9072d = 1;

    public static final class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f9073b = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f9074e = 1;

        private e() {
        }

        @JvmStatic
        public static List<DynamicForms.Screen> b(JSONArray jSONArray) {
            ArrayList arrayListEmptyList;
            int i2 = 2;
            int i3 = 2 % 2;
            Intrinsics.checkNotNullParameter(jSONArray, "");
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            int i4 = f9074e + 69;
            f9073b = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 0;
            int i7 = 0;
            while (i7 < length) {
                JSONObject jSONObject = jSONArray.getJSONObject(i7);
                String strOptString = jSONObject.optString("title");
                boolean zOptBoolean = jSONObject.optBoolean("hideTitle");
                ArrayList arrayList2 = new ArrayList();
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("questions");
                if (jSONArrayOptJSONArray != null) {
                    int i8 = f9073b + 57;
                    f9074e = i8 % 128;
                    int i9 = i8 % i2;
                    int length2 = jSONArrayOptJSONArray.length();
                    int i10 = i6;
                    while (i10 < length2) {
                        int i11 = f9073b + 55;
                        f9074e = i11 % 128;
                        if (i11 % i2 == 0) {
                            JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i10);
                            DynamicForms.InputType.c cVar = DynamicForms.InputType.Companion;
                            DynamicForms.InputType.c.d(jSONObject2.optString("inputType"));
                            throw null;
                        }
                        JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i10);
                        DynamicForms.InputType.c cVar2 = DynamicForms.InputType.Companion;
                        DynamicForms.InputType inputTypeD = DynamicForms.InputType.c.d(jSONObject3.optString("inputType"));
                        if (inputTypeD != null) {
                            int i12 = f9074e + 95;
                            f9073b = i12 % 128;
                            int i13 = i12 % i2;
                            DynamicForms.PredefinedInputType.b bVar = DynamicForms.PredefinedInputType.Companion;
                            DynamicForms.PredefinedInputType predefinedInputTypeB = DynamicForms.PredefinedInputType.b.b(jSONObject3.optString("predefinedQuestionType"));
                            JSONArray jSONArrayOptJSONArray2 = jSONObject3.optJSONArray(RRWebOptionsEvent.EVENT_TAG);
                            if (jSONArrayOptJSONArray2 != null) {
                                Intrinsics.checkNotNull(jSONArrayOptJSONArray2);
                                IntRange intRangeUntil = RangesKt.until(i6, jSONArrayOptJSONArray2.length());
                                ArrayList arrayList3 = new ArrayList();
                                Iterator<Integer> it = intRangeUntil.iterator();
                                while (it.hasNext()) {
                                    String strOptString2 = jSONArrayOptJSONArray2.optString(((IntIterator) it).nextInt(), "");
                                    if (strOptString2 != null) {
                                        int i14 = f9073b + 45;
                                        f9074e = i14 % 128;
                                        if (i14 % 2 == 0) {
                                            arrayList3.add(strOptString2);
                                            Object obj = null;
                                            obj.hashCode();
                                            throw null;
                                        }
                                        arrayList3.add(strOptString2);
                                    }
                                }
                                arrayListEmptyList = arrayList3;
                            } else {
                                arrayListEmptyList = CollectionsKt.emptyList();
                            }
                            String strOptString3 = jSONObject3.optString("questionId");
                            Intrinsics.checkNotNullExpressionValue(strOptString3, "");
                            String strOptString4 = jSONObject3.optString("question");
                            Intrinsics.checkNotNullExpressionValue(strOptString4, "");
                            arrayList2.add(new DynamicForms.Screen.Question(strOptString3, strOptString4, inputTypeD, predefinedInputTypeB, arrayListEmptyList));
                        }
                        i10++;
                        i2 = 2;
                        i6 = 0;
                    }
                    int i15 = f9073b + 73;
                    f9074e = i15 % 128;
                    i2 = 2;
                    int i16 = i15 % 2;
                }
                arrayList.add(new DynamicForms.Screen(strOptString, zOptBoolean, arrayList2));
                i7++;
                i6 = 0;
            }
            return arrayList;
        }

        public /* synthetic */ e(byte b2) {
            this();
        }
    }

    static {
        int i2 = f9069a + 37;
        f9072d = i2 % 128;
        int i3 = i2 % 2;
    }

    @JvmStatic
    public static final List<DynamicForms.Screen> parseDynamicFormsJsonArray(JSONArray jSONArray) {
        int i2 = 2 % 2;
        int i3 = f9070b + 73;
        f9071c = i3 % 128;
        int i4 = i3 % 2;
        List<DynamicForms.Screen> listB = e.b(jSONArray);
        if (i4 != 0) {
            int i5 = 24 / 0;
        }
        return listB;
    }
}
