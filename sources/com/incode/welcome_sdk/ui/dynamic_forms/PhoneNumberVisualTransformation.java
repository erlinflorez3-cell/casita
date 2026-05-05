package com.incode.welcome_sdk.ui.dynamic_forms;

import android.telephony.PhoneNumberUtils;
import android.text.Selection;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import io.michaelrocks.libphonenumber.android.AsYouTypeFormatter;
import io.michaelrocks.libphonenumber.android.PhoneNumberUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes5.dex */
public final class PhoneNumberVisualTransformation implements VisualTransformation {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f13274d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f13275e = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AsYouTypeFormatter f13276c;

    public PhoneNumberVisualTransformation(String str, PhoneNumberUtil phoneNumberUtil) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(phoneNumberUtil, "");
        this.f13276c = phoneNumberUtil.getAsYouTypeFormatter(str);
    }

    public /* synthetic */ PhoneNumberVisualTransformation(String str, PhoneNumberUtil phoneNumberUtil, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, phoneNumberUtil);
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public final TransformedText filter(AnnotatedString annotatedString) {
        Intrinsics.checkNotNullParameter(annotatedString, "");
        AnnotatedString annotatedString2 = annotatedString;
        final a aVarD = d(annotatedString2, Selection.getSelectionEnd(annotatedString2));
        String strD = aVarD.d();
        return new TransformedText(new AnnotatedString(strD != null ? strD : "", null, null, 6, null), new OffsetMapping() { // from class: com.incode.welcome_sdk.ui.dynamic_forms.PhoneNumberVisualTransformation.filter.1

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f13282c = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f13283e = 1;

            @Override // androidx.compose.ui.text.input.OffsetMapping
            public final int originalToTransformed(int i2) {
                int i3 = 2 % 2;
                int i4 = f13283e + 121;
                f13282c = i4 % 128;
                int i5 = i4 % 2;
                List<Integer> listE = aVarD.e();
                if (i5 == 0) {
                    return listE.get(RangesKt.coerceIn(i2, (ClosedRange<Integer>) CollectionsKt.getIndices(aVarD.e()))).intValue();
                }
                listE.get(RangesKt.coerceIn(i2, (ClosedRange<Integer>) CollectionsKt.getIndices(aVarD.e()))).intValue();
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // androidx.compose.ui.text.input.OffsetMapping
            public final int transformedToOriginal(int i2) {
                int i3 = 2 % 2;
                int i4 = f13282c + 15;
                f13283e = i4 % 128;
                int i5 = i4 % 2;
                List<Integer> listB = aVarD.b();
                if (i5 != 0) {
                    return listB.get(RangesKt.coerceIn(i2, (ClosedRange<Integer>) CollectionsKt.getIndices(aVarD.b()))).intValue();
                }
                listB.get(RangesKt.coerceIn(i2, (ClosedRange<Integer>) CollectionsKt.getIndices(aVarD.b()))).intValue();
                throw null;
            }
        });
    }

    private final a d(CharSequence charSequence, int i2) {
        int iIntValue;
        int i3 = 2 % 2;
        this.f13276c.clear();
        int i4 = i2 - 1;
        String strC = null;
        int i5 = 0;
        char c2 = 0;
        int i6 = 0;
        boolean z2 = false;
        while (i5 < charSequence.length()) {
            char cCharAt = charSequence.charAt(i5);
            int i7 = i6 + 1;
            if (PhoneNumberUtils.isNonSeparator(cCharAt)) {
                if (c2 != 0) {
                    strC = c(c2, z2);
                    z2 = false;
                }
                c2 = cCharAt;
            }
            if (i6 == i4) {
                z2 = true;
            }
            i5++;
            i6 = i7;
        }
        if (c2 != 0) {
            strC = c(c2, z2);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (strC != null) {
            int i8 = f13275e + 121;
            f13274d = i8 % 128;
            String str = i8 % 2 != 0 ? strC : strC;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            while (i9 < str.length()) {
                int i12 = i10 + 1;
                if (!PhoneNumberUtils.isNonSeparator(str.charAt(i9))) {
                    i11++;
                } else {
                    arrayList.add(Integer.valueOf(i10));
                    int i13 = f13274d + 79;
                    f13275e = i13 % 128;
                    int i14 = i13 % 2;
                }
                arrayList2.add(Integer.valueOf(i10 - i11));
                i9++;
                i10 = i12;
            }
        }
        Integer num = (Integer) CollectionsKt.maxOrNull((Iterable) arrayList);
        if (num != null) {
            int i15 = f13275e + 69;
            f13274d = i15 % 128;
            int i16 = i15 % 2;
            iIntValue = num.intValue() + 1;
        } else {
            int i17 = f13275e + 107;
            f13274d = i17 % 128;
            int i18 = i17 % 2;
            iIntValue = 0;
        }
        arrayList.add(Integer.valueOf(iIntValue));
        Integer num2 = (Integer) CollectionsKt.maxOrNull((Iterable) arrayList2);
        arrayList2.add(Integer.valueOf(num2 != null ? num2.intValue() + 1 : 0));
        return new a(strC, arrayList, arrayList2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r2 = r4.f13276c.inputDigit(r5);
        r1 = com.incode.welcome_sdk.ui.dynamic_forms.PhoneNumberVisualTransformation.f13274d + 89;
        com.incode.welcome_sdk.ui.dynamic_forms.PhoneNumberVisualTransformation.f13275e = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r6 != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        return r4.f13276c.inputDigitAndRememberPosition(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r6 != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String c(char r5, boolean r6) {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.ui.dynamic_forms.PhoneNumberVisualTransformation.f13274d
            int r1 = r0 + 69
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.dynamic_forms.PhoneNumberVisualTransformation.f13275e = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L1b
            r0 = 60
            int r0 = r0 / 0
            if (r6 == 0) goto L1e
        L14:
            io.michaelrocks.libphonenumber.android.AsYouTypeFormatter r0 = r4.f13276c
            java.lang.String r0 = r0.inputDigitAndRememberPosition(r5)
            return r0
        L1b:
            if (r6 == 0) goto L1e
            goto L14
        L1e:
            io.michaelrocks.libphonenumber.android.AsYouTypeFormatter r0 = r4.f13276c
            java.lang.String r2 = r0.inputDigit(r5)
            int r0 = com.incode.welcome_sdk.ui.dynamic_forms.PhoneNumberVisualTransformation.f13274d
            int r1 = r0 + 89
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.dynamic_forms.PhoneNumberVisualTransformation.f13275e = r0
            int r1 = r1 % r3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.dynamic_forms.PhoneNumberVisualTransformation.c(char, boolean):java.lang.String");
    }

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f13277a = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f13278e = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<Integer> f13279b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<Integer> f13280c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f13281d;

        public a(String str, List<Integer> list, List<Integer> list2) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            this.f13281d = str;
            this.f13280c = list;
            this.f13279b = list2;
        }

        public final String d() {
            String str;
            int i2 = 2 % 2;
            int i3 = f13277a + 69;
            int i4 = i3 % 128;
            f13278e = i4;
            if (i3 % 2 == 0) {
                str = this.f13281d;
                int i5 = 39 / 0;
            } else {
                str = this.f13281d;
            }
            int i6 = i4 + 121;
            f13277a = i6 % 128;
            if (i6 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final List<Integer> e() {
            int i2 = 2 % 2;
            int i3 = f13278e + 57;
            f13277a = i3 % 128;
            if (i3 % 2 == 0) {
                return this.f13280c;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final List<Integer> b() {
            int i2 = 2 % 2;
            int i3 = f13278e + 7;
            int i4 = i3 % 128;
            f13277a = i4;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            List<Integer> list = this.f13279b;
            int i5 = i4 + 43;
            f13278e = i5 % 128;
            int i6 = i5 % 2;
            return list;
        }

        public final boolean equals(Object obj) {
            int i2 = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                int i3 = f13278e + 111;
                f13277a = i3 % 128;
                return i3 % 2 != 0;
            }
            a aVar = (a) obj;
            if (!Intrinsics.areEqual(this.f13281d, aVar.f13281d) || !Intrinsics.areEqual(this.f13280c, aVar.f13280c)) {
                return false;
            }
            if (Intrinsics.areEqual(this.f13279b, aVar.f13279b)) {
                int i4 = f13277a + 117;
                f13278e = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
            int i6 = f13278e + 3;
            f13277a = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public final int hashCode() {
            int iHashCode;
            int i2 = 2 % 2;
            int i3 = f13277a;
            int i4 = i3 + 33;
            f13278e = i4 % 128;
            int i5 = i4 % 2;
            String str = this.f13281d;
            if (str == null) {
                int i6 = i3 + 75;
                f13278e = i6 % 128;
                iHashCode = i6 % 2 == 0 ? 1 : 0;
            } else {
                iHashCode = str.hashCode();
            }
            return (((iHashCode * 31) + this.f13280c.hashCode()) * 31) + this.f13279b.hashCode();
        }

        public final String toString() {
            int i2 = 2 % 2;
            int i3 = f13278e + 117;
            f13277a = i3 % 128;
            int i4 = i3 % 2;
            String str = "Transformation(formatted=" + this.f13281d + ", originalToTransformed=" + this.f13280c + ", transformedToOriginal=" + this.f13279b + ")";
            int i5 = f13277a + 47;
            f13278e = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }
    }
}
