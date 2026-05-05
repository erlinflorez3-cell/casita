package com.incode.welcome_sdk.data.local;

import android.content.SharedPreferences;
import com.incode.welcome_sdk.commons.utils.ae;
import com.incode.welcome_sdk.ui.dynamic_forms.view.FormsSelectInputScreenKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class k {

    /* JADX INFO: renamed from: a */
    private static int f8609a = 0;

    /* JADX INFO: renamed from: b */
    private static int f8610b = 0;

    /* JADX INFO: renamed from: c */
    private static int f8611c = 1;

    /* JADX INFO: renamed from: d */
    private static SharedPreferences f8612d = null;

    /* JADX INFO: renamed from: e */
    public static final k f8613e = new k();

    /* JADX INFO: renamed from: f */
    private static int f8614f = 1;

    private k() {
    }

    @JvmStatic
    public static final void e(SharedPreferences sharedPreferences) {
        int i2 = 2 % 2;
        int i3 = f8609a + 27;
        f8611c = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(sharedPreferences, "");
            f8612d = sharedPreferences;
        } else {
            Intrinsics.checkNotNullParameter(sharedPreferences, "");
            f8612d = sharedPreferences;
            int i4 = 30 / 0;
        }
    }

    public static String e() {
        int i2 = 2 % 2;
        int i3 = f8609a + 115;
        f8611c = i3 % 128;
        Object obj = null;
        try {
            if (i3 % 2 != 0) {
                SharedPreferences sharedPreferences = f8612d;
                if (sharedPreferences == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    sharedPreferences = null;
                }
                String string = sharedPreferences.getString(ae.b("prefsToken"), null);
                if (string == null) {
                    int i4 = f8609a + 71;
                    f8611c = i4 % 128;
                    int i5 = i4 % 2;
                    return null;
                }
                String strSubstring = string.substring(1, string.length() - 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                List listSplit$default = StringsKt.split$default((CharSequence) strSubstring, new String[]{", "}, false, 0, 6, (Object) null);
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
                Iterator it = listSplit$default.iterator();
                while (it.hasNext()) {
                    int i6 = f8609a + 59;
                    f8611c = i6 % 128;
                    int i7 = i6 % 2;
                    arrayList.add(Byte.valueOf(Byte.parseByte((String) it.next())));
                }
                return ae.d(CollectionsKt.toByteArray(arrayList), ae.b());
            }
            obj.hashCode();
            throw null;
        } catch (Exception e2) {
            Timber.Forest.e(e2);
            return null;
        }
    }

    public static void c(String str) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            boolean z2 = false;
            if (str.length() > 0) {
                int i3 = f8609a + 93;
                f8611c = i3 % 128;
                if (i3 % 2 != 0) {
                    z2 = true;
                }
            }
            SharedPreferences sharedPreferences = null;
            if (!z2) {
                SharedPreferences sharedPreferences2 = f8612d;
                if (sharedPreferences2 == null) {
                    int i4 = f8609a + 67;
                    f8611c = i4 % 128;
                    int i5 = i4 % 2;
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    sharedPreferences = sharedPreferences2;
                }
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putString(ae.b("prefsToken"), str);
                editorEdit.apply();
                int i6 = f8611c + 85;
                f8609a = i6 % 128;
                int i7 = i6 % 2;
                return;
            }
            Object[] objArr = {str, ae.b()};
            String string = Arrays.toString((byte[]) ae.b(FormsSelectInputScreenKt.h.b(), FormsSelectInputScreenKt.h.b(), FormsSelectInputScreenKt.h.b(), FormsSelectInputScreenKt.h.b(), 1880353, -1880352, objArr));
            SharedPreferences sharedPreferences3 = f8612d;
            if (sharedPreferences3 == null) {
                int i8 = f8609a + 125;
                f8611c = i8 % 128;
                if (i8 % 2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i9 = f8609a + 39;
                f8611c = i9 % 128;
                int i10 = i9 % 2;
            } else {
                sharedPreferences = sharedPreferences3;
            }
            SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
            editorEdit2.putString(ae.b("prefsToken"), string);
            editorEdit2.apply();
        } catch (Exception e2) {
            Timber.Forest.e(e2);
        }
    }

    public static String d() {
        int i2 = 2 % 2;
        int i3 = f8609a + 101;
        int i4 = i3 % 128;
        f8611c = i4;
        int i5 = i3 % 2;
        SharedPreferences sharedPreferences = f8612d;
        if (sharedPreferences == null) {
            int i6 = i4 + 35;
            f8609a = i6 % 128;
            int i7 = i6 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i7 != 0) {
                int i8 = 31 / 0;
            }
            sharedPreferences = null;
        }
        String string = sharedPreferences.getString("prefsInterviewId", null);
        int i9 = f8611c + 57;
        f8609a = i9 % 128;
        int i10 = i9 % 2;
        return string;
    }

    public static void d(String str) {
        int i2 = 2 % 2;
        int i3 = f8611c + 69;
        f8609a = i3 % 128;
        SharedPreferences sharedPreferences = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        SharedPreferences sharedPreferences2 = f8612d;
        if (sharedPreferences2 == null) {
            int i4 = f8611c + 37;
            f8609a = i4 % 128;
            if (i4 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            sharedPreferences = sharedPreferences2;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString("prefsInterviewId", str);
        editorEdit.apply();
        int i5 = f8609a + 11;
        f8611c = i5 % 128;
        int i6 = i5 % 2;
    }

    static {
        int i2 = f8610b + 81;
        f8614f = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 77 / 0;
        }
    }
}
