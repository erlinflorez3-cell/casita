package t;

import java.util.HashMap;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import x0.abundant;

/* JADX INFO: loaded from: classes2.dex */
public final class misplace {

    /* JADX INFO: renamed from: a */
    public final abundant f28311a;

    /* JADX INFO: renamed from: b */
    public final v0.civilian f28312b;

    /* JADX INFO: renamed from: c */
    public final CoroutineScope f28313c;

    /* JADX INFO: renamed from: d */
    public final Mutex f28314d = MutexKt.Mutex$default(false, 1, null);

    /* JADX INFO: renamed from: e */
    public HashMap f28315e = new HashMap();

    /* JADX INFO: renamed from: f */
    public Job f28316f;

    public misplace(abundant abundantVar, v0.civilian civilianVar, CoroutineScope coroutineScope) {
        this.f28311a = abundantVar;
        this.f28312b = civilianVar;
        this.f28313c = coroutineScope;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x009a A[PHI: r2 r3 r4 r5 r7 r11 r12 r17
  0x009a: PHI (r2v11 java.lang.Object) = (r2v1 java.lang.Object), (r2v12 java.lang.Object) binds: [B:121:0x0082, B:119:0x007f] A[DONT_GENERATE, DONT_INLINE]
  0x009a: PHI (r3v15 int) = (r3v4 int), (r3v16 int) binds: [B:121:0x0082, B:119:0x007f] A[DONT_GENERATE, DONT_INLINE]
  0x009a: PHI (r4v16 y0.loss) = (r4v7 y0.loss), (r4v17 y0.loss) binds: [B:121:0x0082, B:119:0x007f] A[DONT_GENERATE, DONT_INLINE]
  0x009a: PHI (r5v20 t.misplace) = (r5v8 t.misplace), (r5v21 t.misplace) binds: [B:121:0x0082, B:119:0x007f] A[DONT_GENERATE, DONT_INLINE]
  0x009a: PHI (r7v13 t.tongue) = (r7v4 t.tongue), (r7v14 t.tongue) binds: [B:121:0x0082, B:119:0x007f] A[DONT_GENERATE, DONT_INLINE]
  0x009a: PHI (r11v15 java.util.Iterator) = (r11v5 java.util.Iterator), (r11v16 java.util.Iterator) binds: [B:121:0x0082, B:119:0x007f] A[DONT_GENERATE, DONT_INLINE]
  0x009a: PHI (r12v14 java.util.Iterator) = (r12v4 java.util.Iterator), (r12v15 java.util.Iterator) binds: [B:121:0x0082, B:119:0x007f] A[DONT_GENERATE, DONT_INLINE]
  0x009a: PHI (r17v18 t.misplace) = (r17v6 t.misplace), (r17v19 t.misplace) binds: [B:121:0x0082, B:119:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00e9 A[PHI: r2 r3 r4 r5 r6 r7 r11 r12 r17
  0x00e9: PHI (r2v6 java.lang.Object) = (r2v0 java.lang.Object), (r2v11 java.lang.Object) binds: [B:126:0x00ca, B:123:0x00c6] A[DONT_GENERATE, DONT_INLINE]
  0x00e9: PHI (r3v14 int) = (r3v3 int), (r3v15 int) binds: [B:126:0x00ca, B:123:0x00c6] A[DONT_GENERATE, DONT_INLINE]
  0x00e9: PHI (r4v15 y0.loss) = (r4v5 y0.loss), (r4v16 y0.loss) binds: [B:126:0x00ca, B:123:0x00c6] A[DONT_GENERATE, DONT_INLINE]
  0x00e9: PHI (r5v19 t.misplace) = (r5v6 t.misplace), (r5v20 t.misplace) binds: [B:126:0x00ca, B:123:0x00c6] A[DONT_GENERATE, DONT_INLINE]
  0x00e9: PHI (r6v9 java.lang.Object) = (r6v3 java.lang.Object), (r6v14 java.lang.Object) binds: [B:126:0x00ca, B:123:0x00c6] A[DONT_GENERATE, DONT_INLINE]
  0x00e9: PHI (r7v12 t.tongue) = (r7v3 t.tongue), (r7v13 t.tongue) binds: [B:126:0x00ca, B:123:0x00c6] A[DONT_GENERATE, DONT_INLINE]
  0x00e9: PHI (r11v14 java.util.Iterator) = (r11v4 java.util.Iterator), (r11v15 java.util.Iterator) binds: [B:126:0x00ca, B:123:0x00c6] A[DONT_GENERATE, DONT_INLINE]
  0x00e9: PHI (r12v13 java.util.Iterator) = (r12v3 java.util.Iterator), (r12v14 java.util.Iterator) binds: [B:126:0x00ca, B:123:0x00c6] A[DONT_GENERATE, DONT_INLINE]
  0x00e9: PHI (r17v17 t.misplace) = (r17v5 t.misplace), (r17v18 t.misplace) binds: [B:126:0x00ca, B:123:0x00c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0249 A[PHI: r3 r4 r5 r6 r7 r11 r12 r13 r14 r17
  0x0249: PHI (r3v6 d0.pair) = (r3v1 d0.pair), (r3v7 d0.pair) binds: [B:170:0x022c, B:168:0x0228] A[DONT_GENERATE, DONT_INLINE]
  0x0249: PHI (r4v9 java.util.Iterator) = (r4v2 java.util.Iterator), (r4v10 java.util.Iterator) binds: [B:170:0x022c, B:168:0x0228] A[DONT_GENERATE, DONT_INLINE]
  0x0249: PHI (r5v12 int) = (r5v1 int), (r5v13 int) binds: [B:170:0x022c, B:168:0x0228] A[DONT_GENERATE, DONT_INLINE]
  0x0249: PHI (r6v5 t.misplace) = (r6v1 t.misplace), (r6v6 t.misplace) binds: [B:170:0x022c, B:168:0x0228] A[DONT_GENERATE, DONT_INLINE]
  0x0249: PHI (r7v6 t.tongue) = (r7v1 t.tongue), (r7v7 t.tongue) binds: [B:170:0x022c, B:168:0x0228] A[DONT_GENERATE, DONT_INLINE]
  0x0249: PHI (r11v8 java.util.Iterator) = (r11v1 java.util.Iterator), (r11v9 java.util.Iterator) binds: [B:170:0x022c, B:168:0x0228] A[DONT_GENERATE, DONT_INLINE]
  0x0249: PHI (r12v7 java.util.Iterator) = (r12v1 java.util.Iterator), (r12v8 java.util.Iterator) binds: [B:170:0x022c, B:168:0x0228] A[DONT_GENERATE, DONT_INLINE]
  0x0249: PHI (r13v7 java.util.Iterator) = (r13v3 java.util.Iterator), (r13v8 java.util.Iterator) binds: [B:170:0x022c, B:168:0x0228] A[DONT_GENERATE, DONT_INLINE]
  0x0249: PHI (r14v7 k0.pair) = (r14v3 k0.pair), (r14v8 k0.pair) binds: [B:170:0x022c, B:168:0x0228] A[DONT_GENERATE, DONT_INLINE]
  0x0249: PHI (r17v10 t.misplace) = (r17v3 t.misplace), (r17v11 t.misplace) binds: [B:170:0x022c, B:168:0x0228] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x028e A[PHI: r1 r3 r4 r5 r6 r7 r11 r12 r13 r14 r17
  0x028e: PHI (r1v4 java.lang.Object) = (r1v2 java.lang.Object), (r1v11 java.lang.Object) binds: [B:174:0x026b, B:172:0x0268] A[DONT_GENERATE, DONT_INLINE]
  0x028e: PHI (r3v5 d0.pair) = (r3v0 d0.pair), (r3v6 d0.pair) binds: [B:174:0x026b, B:172:0x0268] A[DONT_GENERATE, DONT_INLINE]
  0x028e: PHI (r4v8 java.util.Iterator) = (r4v1 java.util.Iterator), (r4v9 java.util.Iterator) binds: [B:174:0x026b, B:172:0x0268] A[DONT_GENERATE, DONT_INLINE]
  0x028e: PHI (r5v9 int) = (r5v0 int), (r5v12 int) binds: [B:174:0x026b, B:172:0x0268] A[DONT_GENERATE, DONT_INLINE]
  0x028e: PHI (r6v4 t.misplace) = (r6v0 t.misplace), (r6v5 t.misplace) binds: [B:174:0x026b, B:172:0x0268] A[DONT_GENERATE, DONT_INLINE]
  0x028e: PHI (r7v5 t.tongue) = (r7v0 t.tongue), (r7v6 t.tongue) binds: [B:174:0x026b, B:172:0x0268] A[DONT_GENERATE, DONT_INLINE]
  0x028e: PHI (r11v7 java.util.Iterator) = (r11v0 java.util.Iterator), (r11v8 java.util.Iterator) binds: [B:174:0x026b, B:172:0x0268] A[DONT_GENERATE, DONT_INLINE]
  0x028e: PHI (r12v6 java.util.Iterator) = (r12v0 java.util.Iterator), (r12v7 java.util.Iterator) binds: [B:174:0x026b, B:172:0x0268] A[DONT_GENERATE, DONT_INLINE]
  0x028e: PHI (r13v6 java.util.Iterator) = (r13v1 java.util.Iterator), (r13v7 java.util.Iterator) binds: [B:174:0x026b, B:172:0x0268] A[DONT_GENERATE, DONT_INLINE]
  0x028e: PHI (r14v6 k0.pair) = (r14v1 k0.pair), (r14v7 k0.pair) binds: [B:174:0x026b, B:172:0x0268] A[DONT_GENERATE, DONT_INLINE]
  0x028e: PHI (r17v8 t.misplace) = (r17v2 t.misplace), (r17v10 t.misplace) binds: [B:174:0x026b, B:172:0x0268] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x033d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:139:0x013a -> B:117:0x0058). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:144:0x0151 -> B:145:0x015f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:188:0x02e4 -> B:162:0x01d0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:189:0x02ea -> B:148:0x0171). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:202:0x0332 -> B:140:0x013d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:203:0x0336 -> B:118:0x005f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.util.HashMap r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            Method dump skipped, instruction units count: 850
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.misplace.a(java.util.HashMap, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void a(k0.pair pairVar, m0.civilian civilianVar) {
        BuildersKt__Builders_commonKt.launch$default(this.f28313c, null, null, new apparatus(this, pairVar, civilianVar, null), 3, null);
    }
}
