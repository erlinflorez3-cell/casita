package com.incode.welcome_sdk.commons;

import android.content.Context;
import android.os.SystemClock;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: a */
    public static int f5154a = 0;

    /* JADX INFO: renamed from: d */
    public static int f5155d = 0;

    /* JADX INFO: renamed from: e */
    private static int f5156e = 0;

    /* JADX INFO: renamed from: i */
    private static int f5157i = 1;

    /* JADX INFO: renamed from: b */
    private final IncodeWelcomeRepository f5158b;

    /* JADX INFO: renamed from: c */
    private final Context f5159c;

    public h(Context context, IncodeWelcomeRepository incodeWelcomeRepository) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        this.f5159c = context;
        this.f5158b = incodeWelcomeRepository;
    }

    public static final class c extends Enum<c> {

        /* JADX INFO: renamed from: a */
        private static final /* synthetic */ c[] f5160a;

        /* JADX INFO: renamed from: b */
        private static int f5161b = 0;

        /* JADX INFO: renamed from: c */
        private static int f5162c = 1;

        /* JADX INFO: renamed from: d */
        public static final c f5163d = new c("Camera", "android.permission.CAMERA");

        /* JADX INFO: renamed from: f */
        private static int f5164f = 1;

        /* JADX INFO: renamed from: i */
        private static int f5165i = 0;

        /* JADX INFO: renamed from: e */
        private final String f5166e;

        private c(String str, String str2) {
            super(str, 0);
            this.f5166e = str2;
        }

        public final String d() {
            int i2 = 2 % 2;
            int i3 = f5161b + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            int i4 = i3 % 128;
            f5162c = i4;
            int i5 = i3 % 2;
            String str = this.f5166e;
            int i6 = i4 + 111;
            f5161b = i6 % 128;
            int i7 = i6 % 2;
            return str;
        }

        static {
            c[] cVarArrC = c();
            f5160a = cVarArrC;
            EnumEntriesKt.enumEntries(cVarArrC);
            int i2 = f5164f + 51;
            f5165i = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final /* synthetic */ c[] c() {
            int i2 = 2 % 2;
            int i3 = f5162c;
            int i4 = i3 + 75;
            f5161b = i4 % 128;
            int i5 = i4 % 2;
            c[] cVarArr = {f5163d};
            int i6 = i3 + 31;
            f5161b = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 3 / 0;
            }
            return cVarArr;
        }

        public static c valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = f5162c + 21;
            f5161b = i3 % 128;
            int i4 = i3 % 2;
            c cVar = (c) Enum.valueOf(c.class, str);
            if (i4 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = f5162c + 115;
            f5161b = i5 % 128;
            int i6 = i5 % 2;
            return cVar;
        }

        public static c[] values() {
            int i2 = 2 % 2;
            int i3 = f5161b + 57;
            f5162c = i3 % 128;
            int i4 = i3 % 2;
            c[] cVarArr = (c[]) f5160a.clone();
            int i5 = f5161b + 7;
            f5162c = i5 % 128;
            int i6 = i5 % 2;
            return cVarArr;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0021, code lost:
    
        if (androidx.core.content.ContextCompat.checkSelfPermission(r5.f5159c, r6.d()) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0023, code lost:
    
        r2 = com.incode.welcome_sdk.commons.h.f5156e + 45;
        com.incode.welcome_sdk.commons.h.f5157i = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002d, code lost:
    
        if ((r2 % 2) != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002f, code lost:
    
        r0 = 92 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0032, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0040, code lost:
    
        if (androidx.core.content.ContextCompat.checkSelfPermission(r5.f5159c, r6.d()) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0043, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(com.incode.welcome_sdk.commons.h.c r6) {
        /*
            r5 = this;
            r4 = 2
            int r0 = r4 % r4
            int r0 = com.incode.welcome_sdk.commons.h.f5157i
            int r1 = r0 + 65
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.h.f5156e = r0
            int r1 = r1 % r4
            java.lang.String r0 = ""
            r3 = 0
            if (r1 == 0) goto L33
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            android.content.Context r1 = r5.f5159c
            java.lang.String r0 = r6.d()
            int r1 = androidx.core.content.ContextCompat.checkSelfPermission(r1, r0)
            r0 = 47
            int r0 = r0 / r3
            if (r1 != 0) goto L43
        L23:
            int r0 = com.incode.welcome_sdk.commons.h.f5156e
            int r2 = r0 + 45
            int r0 = r2 % 128
            com.incode.welcome_sdk.commons.h.f5157i = r0
            int r2 = r2 % r4
            r1 = 1
            if (r2 != 0) goto L32
            r0 = 92
            int r0 = r0 / r3
        L32:
            return r1
        L33:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            android.content.Context r1 = r5.f5159c
            java.lang.String r0 = r6.d()
            int r0 = androidx.core.content.ContextCompat.checkSelfPermission(r1, r0)
            if (r0 != 0) goto L43
            goto L23
        L43:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.h.e(com.incode.welcome_sdk.commons.h$c):boolean");
    }

    public final boolean a() {
        int i2 = 2 % 2;
        if (!e(c.f5163d)) {
            int i3 = f5157i + 97;
            f5156e = i3 % 128;
            if (i3 % 2 != 0) {
                b();
                throw null;
            }
            if (!(!b())) {
                return true;
            }
        }
        int i4 = f5156e + 109;
        f5157i = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    private final boolean b() {
        int i2 = 2 % 2;
        int i3 = f5156e + 27;
        f5157i = i3 % 128;
        int i4 = i3 % 2;
        IncodeWelcomeRepository incodeWelcomeRepository = this.f5158b;
        if (i4 != 0) {
            return incodeWelcomeRepository.isCameraPermissionRequested();
        }
        incodeWelcomeRepository.isCameraPermissionRequested();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void c() {
        int i2 = 2 % 2;
        int i3 = f5156e + 83;
        f5157i = i3 % 128;
        int i4 = i3 % 2;
        this.f5158b.setCameraPermissionRequested(true);
        int i5 = f5157i + 67;
        f5156e = i5 % 128;
        int i6 = i5 % 2;
    }

    public static int e() {
        int i2 = f5154a;
        int i3 = i2 % 7835262;
        f5154a = i2 + 1;
        if (i3 != 0) {
            return f5155d;
        }
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        f5155d = iUptimeMillis;
        return iUptimeMillis;
    }
}
