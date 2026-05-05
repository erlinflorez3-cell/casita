package com.incode.welcome_sdk.commons;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f4775a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f4776b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f4777c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f4778d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Set<? extends c> f4779e = null;

    private d() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f4780a = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ c[] f4782c;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f4785f = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f4786i = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f4787j = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f4783d = new c("ID_CAPTURE_V1", 0);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f4784e = new c("ID_CAPTURE_V2", 1);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f4781b = new c("ID_CAPTURE_BARCODE_AND_TEXT_READABILITY", 2);

        private c(String str, int i2) {
        }

        static {
            c[] cVarArrB = b();
            f4782c = cVarArrB;
            EnumEntriesKt.enumEntries(cVarArrB);
            int i2 = f4787j + 77;
            f4785f = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }

        private static final /* synthetic */ c[] b() {
            c[] cVarArr;
            int i2 = 2 % 2;
            int i3 = f4780a;
            int i4 = i3 + 85;
            f4786i = i4 % 128;
            if (i4 % 2 == 0) {
                cVarArr = new c[5];
                cVarArr[1] = f4783d;
                cVarArr[1] = f4784e;
                cVarArr[5] = f4781b;
            } else {
                cVarArr = new c[]{f4783d, f4784e, f4781b};
            }
            int i5 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f4786i = i5 % 128;
            int i6 = i5 % 2;
            return cVarArr;
        }

        public static c valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = f4780a + 93;
            f4786i = i3 % 128;
            int i4 = i3 % 2;
            c cVar = (c) Enum.valueOf(c.class, str);
            int i5 = f4786i + 63;
            f4780a = i5 % 128;
            int i6 = i5 % 2;
            return cVar;
        }

        public static c[] values() {
            int i2 = 2 % 2;
            int i3 = f4780a + 63;
            f4786i = i3 % 128;
            int i4 = i3 % 2;
            c[] cVarArr = f4782c;
            if (i4 != 0) {
                return (c[]) cVarArr.clone();
            }
            c[] cVarArr2 = (c[]) cVarArr.clone();
            int i5 = 6 / 0;
            return cVarArr2;
        }
    }

    private static void d() {
        Set<? extends c> setEmptySet;
        int i2 = 2 % 2;
        try {
            List listSplit$default = StringsKt.split$default((CharSequence) "", new String[]{","}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
            Iterator it = listSplit$default.iterator();
            while (!(!it.hasNext())) {
                int i3 = f4777c + 35;
                f4778d = i3 % 128;
                int i4 = i3 % 2;
                arrayList.add(c.valueOf(StringsKt.trim((CharSequence) it.next()).toString()));
                int i5 = f4777c + 69;
                f4778d = i5 % 128;
                int i6 = i5 % 2;
            }
            setEmptySet = CollectionsKt.toSet(arrayList);
        } catch (Exception unused) {
            setEmptySet = SetsKt.emptySet();
        }
        f4779e = setEmptySet;
        int i7 = f4777c + 51;
        f4778d = i7 % 128;
        int i8 = i7 % 2;
    }

    @JvmStatic
    public static final boolean e(c cVar) {
        int i2 = 2 % 2;
        int i3 = f4778d + 9;
        f4777c = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(cVar, "");
        if (f4779e == null) {
            d();
        }
        Set<? extends c> set = f4779e;
        if (set != null) {
            return set.contains(cVar);
        }
        int i5 = f4778d + 5;
        f4777c = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    static {
        new d();
        int i2 = f4776b + 27;
        f4775a = i2 % 128;
        int i3 = i2 % 2;
    }
}
