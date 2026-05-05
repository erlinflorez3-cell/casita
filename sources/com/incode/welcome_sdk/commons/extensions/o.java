package com.incode.welcome_sdk.commons.extensions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class o {

    /* JADX INFO: renamed from: b */
    private static int f5140b = 0;

    /* JADX INFO: renamed from: e */
    private static int f5141e = 1;

    /* JADX WARN: Removed duplicated region for block: B:23:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit a(java.lang.String r4, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r5) {
        /*
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.commons.extensions.o.f5141e
            int r1 = r0 + 1
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.extensions.o.f5140b = r0
            int r1 = r1 % r3
            r2 = 0
            java.lang.String r0 = ""
            if (r1 == 0) goto L3f
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 46
            int r0 = r0 / 0
            if (r4 == 0) goto L45
        L1a:
            int r0 = com.incode.welcome_sdk.commons.extensions.o.f5141e
            int r1 = r0 + 45
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.extensions.o.f5140b = r0
            int r1 = r1 % r3
            r0 = r4
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 != 0) goto L3d
            int r0 = com.incode.welcome_sdk.commons.extensions.o.f5140b
            int r1 = r0 + 101
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.extensions.o.f5141e = r0
            int r1 = r1 % r3
        L35:
            if (r4 == 0) goto L45
            r5.invoke(r4)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L3d:
            r4 = r2
            goto L35
        L3f:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            if (r4 == 0) goto L45
            goto L1a
        L45:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.extensions.o.a(java.lang.String, kotlin.jvm.functions.Function1):kotlin.Unit");
    }

    public static final byte[] d(String str) {
        String str2;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        List<String> listChunked = StringsKt.chunked(str, 2);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listChunked, 10));
        Iterator<T> it = listChunked.iterator();
        int i4 = f5141e + 125;
        f5140b = i4 % 128;
        int i5 = i4 % 2;
        while (it.hasNext()) {
            int i6 = f5141e + 45;
            f5140b = i6 % 128;
            if (i6 % 2 != 0) {
                str2 = (String) it.next();
                i2 = 89;
            } else {
                str2 = (String) it.next();
                i2 = 16;
            }
            arrayList.add(Byte.valueOf((byte) Integer.parseInt(str2, CharsKt.checkRadix(i2))));
        }
        return CollectionsKt.toByteArray(arrayList);
    }
}
