package com.incode.welcome_sdk.commons.utils;

import android.content.Context;
import com.google.common.base.Ascii;
import com.incode.welcome_sdk.IncodeWelcome;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k {
    private static final byte[] $$a = null;
    private static final int $$b = 0;

    /* JADX INFO: renamed from: b */
    private static int f6516b = 0;

    /* JADX INFO: renamed from: c */
    private static int f6517c = 0;

    /* JADX INFO: renamed from: a */
    private final IncodeWelcome.InternalConfig f6518a;

    /* JADX INFO: renamed from: d */
    private final Context f6519d;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0026 -> B:17:0x0011). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void f(int r9, short r10, int r11, java.lang.Object[] r12) {
        /*
            byte[] r8 = com.incode.welcome_sdk.commons.utils.k.$$a
            int r0 = r9 * 2
            int r7 = r0 + 1
            int r0 = r10 + 98
            int r6 = r11 + 4
            byte[] r5 = new byte[r7]
            r4 = 0
            if (r8 != 0) goto L2b
            r2 = r6
            r3 = r4
        L11:
            int r0 = -r0
            int r0 = r0 + r6
            r6 = r2
            r2 = r3
        L15:
            int r3 = r2 + 1
            byte r1 = (byte) r0
            r5[r2] = r1
            int r2 = r6 + 1
            if (r3 != r7) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            r12[r4] = r0
            return
        L26:
            r1 = r8[r2]
            r6 = r0
            r0 = r1
            goto L11
        L2b:
            r2 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.utils.k.f(int, short, int, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{6, Ascii.FS, 8, -86};
        $$b = 241;
    }

    public k(IncodeWelcome.InternalConfig internalConfig, Context context) {
        Intrinsics.checkNotNullParameter(internalConfig, "");
        Intrinsics.checkNotNullParameter(context, "");
        this.f6518a = internalConfig;
        this.f6519d = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:191:0x020b, code lost:
    
        if (r6 == r4) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x020d, code lost:
    
        r3 = com.incode.welcome_sdk.commons.utils.k.f6517c + 53;
        com.incode.welcome_sdk.commons.utils.k.f6516b = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0219, code lost:
    
        if ((r3 % 2) == 0) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x021b, code lost:
    
        r1 = '?';
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x021c, code lost:
    
        if (r1 == '?') goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x021e, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x021f, code lost:
    
        r1 = 66 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0223, code lost:
    
        r1 = 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0232, code lost:
    
        if (r6 == r4) goto L192;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0245  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(kotlin.coroutines.Continuation<? super kotlin.Unit> r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.utils.k.e(kotlin.coroutines.Continuation):java.lang.Object");
    }

    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: a */
        private static int f6520a = 0;

        /* JADX INFO: renamed from: d */
        private static int f6521d = 1;

        /* JADX INFO: renamed from: b */
        int f6522b;

        /* JADX INFO: renamed from: c */
        /* synthetic */ Object f6523c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f6520a + 59;
            f6521d = i3 % 128;
            int i4 = i3 % 2;
            this.f6523c = obj;
            this.f6522b |= Integer.MIN_VALUE;
            Object objE = k.this.e(this);
            int i5 = f6521d + 11;
            f6520a = i5 % 128;
            int i6 = i5 % 2;
            return objE;
        }

        c(Continuation<? super c> continuation) {
            super(continuation);
        }
    }

    static {
        init$0();
        f6516b = 0;
        f6517c = 1;
    }
}
