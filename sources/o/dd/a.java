package o.dd;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.common.base.Ascii;
import fr.antelop.exposed.AntelopLifecycleJobService;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import o.a.k;
import o.dd.b;
import o.ea.f;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f22796a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char[] f22797b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f22798c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f22799d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f22800e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f22801f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f22802h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f22803j = 0;

    public static class d extends Worker {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;
        private static final String TAG;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static long f22804a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f22805b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f22806c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f22807d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f22808e = 0;
        private b lifecycleJob;
        private ListenableWorker.Result lockResult;
        final Object syncObject;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0015). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(byte r8, byte r9, int r10) {
            /*
                byte[] r7 = o.dd.a.d.$$a
                int r0 = r9 * 4
                int r6 = 4 - r0
                int r5 = r8 * 3
                int r1 = r5 + 1
                int r0 = r10 * 7
                int r0 = 114 - r0
                byte[] r4 = new byte[r1]
                r3 = 0
                if (r7 != 0) goto L29
                r2 = r3
                r1 = r6
            L15:
                int r6 = r6 + 1
                int r0 = r0 + r1
            L18:
                r1 = r0
                byte r0 = (byte) r1
                r4[r2] = r0
                if (r2 != r5) goto L24
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                return r0
            L24:
                int r2 = r2 + 1
                r0 = r7[r6]
                goto L15
            L29:
                r2 = r3
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: o.dd.a.d.$$c(byte, byte, int):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f22806c = 0;
            f22808e = 1;
            f22807d = 0;
            f22805b = 1;
            d();
            Object[] objArr = new Object[1];
            f("ꆨ\ue7c7ꇬ\uddb1㎨䟢\udb0f䦝엽畗澾\ue39e煙\ued0a睳\u0be5ᤵᕓỎሯÒ㳫⚜㩬⢡␦칤䊇퀒䰱혊唿ﯚ玅ﷱ絣\ue3ab鯘蕋薄譫茚괩귗댢ꪺ듟됅媉", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr);
            TAG = ((String) objArr[0]).intern();
            int i2 = f22806c + 23;
            f22808e = i2 % 128;
            int i3 = i2 % 2;
        }

        public d(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
            this.syncObject = new Object();
        }

        static void d() {
            f22804a = -1982394611035690903L;
        }

        private static void f(String str, int i2, Object[] objArr) throws Throwable {
            Object charArray;
            String str2 = str;
            int i3 = 2 % 2;
            if (str2 != null) {
                int i4 = $10 + 117;
                $11 = i4 % 128;
                if (i4 % 2 == 0) {
                    str2.toCharArray();
                    throw null;
                }
                charArray = str2.toCharArray();
            } else {
                charArray = str2;
            }
            k kVar = new k();
            char[] cArrC = k.c(f22804a ^ (-5882309809461882246L), (char[]) charArray, i2);
            int i5 = 4;
            kVar.f19939c = 4;
            while (kVar.f19939c < cArrC.length) {
                int i6 = $10 + 71;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                kVar.f19938a = kVar.f19939c - i5;
                int i8 = kVar.f19939c;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % i5]), Long.valueOf(kVar.f19938a), Long.valueOf(f22804a)};
                    Object objA = o.d.d.a(-1093976004);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(TextUtils.lastIndexOf("", '0', 0, 0) + 230, (char) (Color.argb(0, 0, 0, 0) + 51004), Gravity.getAbsoluteGravity(0, 0) + 9, 1749983833, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrC[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {kVar, kVar};
                    Object objA2 = o.d.d.a(-912105096);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a(674 - TextUtils.lastIndexOf("", '0'), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 12 - KeyEvent.getDeadChar(0, 0), 522683165, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA2).invoke(null, objArr3);
                    i5 = 4;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            String str3 = new String(cArrC, 4, cArrC.length - 4);
            int i9 = $11 + 41;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            objArr[0] = str3;
        }

        static void init$0() {
            $$a = new byte[]{93, 121, -117, 60};
            $$b = 27;
        }

        protected final Object clone() throws CloneNotSupportedException {
            int i2 = 2 % 2;
            throw new CloneNotSupportedException();
        }

        @Override // androidx.work.Worker
        public ListenableWorker.Result doWork() throws Throwable {
            ListenableWorker.Result result;
            Data inputData = getInputData();
            Object[] objArr = new Object[1];
            f("\ue3fa嚧\ue399泜ꥏ\udd0c褶\u0bdd璭❬\uf54d농㌃屸\ued94姰孻ꐣ萶䀐䊭趁뱍桼櫶镍", 1 - TextUtils.indexOf("", ""), objArr);
            final o.az.a aVarC = o.az.a.c(inputData.getString(((String) objArr[0]).intern()));
            if (aVarC == null) {
                if (f.a()) {
                    Object[] objArr2 = new Object[1];
                    f("ꆨ\ue7c7ꇬ\uddb1㎨䟢\udb0f䦝엽畗澾\ue39e煙\ued0a睳\u0be5ᤵᕓỎሯÒ㳫⚜㩬⢡␦칤䊇퀒䰱혊唿ﯚ玅ﷱ絣\ue3ab鯘蕋薄譫茚괩귗댢ꪺ듟됅媉", TextUtils.getTrimmedLength("") + 1, objArr2);
                    String strIntern = ((String) objArr2[0]).intern();
                    Object[] objArr3 = new Object[1];
                    f("弹峗彊暰꧴\uddb3픕뜁统筞\uf5e9\ueda9迊噜\ued67֯\ue79e깈蒛ᰠ﹢螴볗㑇혡鼹吢䲎⻑\uf761䱿嬬՞좑枩獶ᵹ⃐Ἃ讷痰㡈㝈ꏔ䶵ᇼ⺌먀ꐈ槮웺", TextUtils.getOffsetAfter("", 0) + 1, objArr3);
                    f.d(strIntern, ((String) objArr3[0]).intern());
                }
                return ListenableWorker.Result.failure();
            }
            Data inputData2 = getInputData();
            Object[] objArr4 = new Object[1];
            f("枬ℰ柏ᭋ蠊ﱉ쇰辋̺澪퐈屢띕⯯쳑ᄶ\udf2d펴ꕳࣖ웻猪鴈₱\ueeb9\ue2d8痏塺ᘖ", 1 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr4);
            g gVarD = g.d(inputData2.getString(((String) objArr4[0]).intern()));
            if (gVarD == null) {
                if (f.a()) {
                    Object[] objArr5 = new Object[1];
                    f("ꆨ\ue7c7ꇬ\uddb1㎨䟢\udb0f䦝엽畗澾\ue39e煙\ued0a睳\u0be5ᤵᕓỎሯÒ㳫⚜㩬⢡␦칤䊇퀒䰱혊唿ﯚ玅ﷱ絣\ue3ab鯘蕋薄譫茚괩귗댢ꪺ듟됅媉", 1 - (ViewConfiguration.getScrollBarSize() >> 8), objArr5);
                    String strIntern2 = ((String) objArr5[0]).intern();
                    Object[] objArr6 = new Object[1];
                    f("趵篂跆䆥裺ﲽ뉹斍姊ᰲ퓧諅嵆煉챩拃㔝襜ꖖ筊⳦ꃸ鷏匷Ҭ롭甲⯨ﰟ퀹浠㱁\ud7c8\uef82䚧ᐚ쾧ޑ㸒\uecc4ꝭὝᙎ쒸鼸㚧ྀ", View.combineMeasuredStates(0, 0) + 1, objArr6);
                    f.d(strIntern2, ((String) objArr6[0]).intern());
                }
                return ListenableWorker.Result.failure();
            }
            Data inputData3 = getInputData();
            Object[] objArr7 = new Object[1];
            f("嵓仫崰璐䅆㔅嫼땴泡\uf4a6ᵄ扇趪䐴֝診\ue5d2뱯氿鏚ﰄ闍呙뮫", 1 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr7);
            String string = inputData3.getString(((String) objArr7[0]).intern());
            if (string == null) {
                if (f.a()) {
                    Object[] objArr8 = new Object[1];
                    f("ꆨ\ue7c7ꇬ\uddb1㎨䟢\udb0f䦝엽畗澾\ue39e煙\ued0a睳\u0be5ᤵᕓỎሯÒ㳫⚜㩬⢡␦칤䊇퀒䰱혊唿ﯚ玅ﷱ絣\ue3ab鯘蕋薄譫茚괩귗댢ꪺ듟됅媉", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr8);
                    String strIntern3 = ((String) objArr8[0]).intern();
                    Object[] objArr9 = new Object[1];
                    f("ꚺ\ue789ꛉ\uddee䘌㉋趪亂얁⏡ᨑ딖癉\ued02ʟ崐Ḕᔑ此䓜߃㲎卺泦⾩⑲뮎ᐲ휝䰧ꎌ΄", 1 - View.getDefaultSize(0, 0), objArr9);
                    f.d(strIntern3, ((String) objArr9[0]).intern());
                }
                return ListenableWorker.Result.failure();
            }
            o.dc.d.a().c(getApplicationContext(), aVarC, gVarD);
            if (f.a()) {
                Object[] objArr10 = new Object[1];
                f("ꆨ\ue7c7ꇬ\uddb1㎨䟢\udb0f䦝엽畗澾\ue39e煙\ued0a睳\u0be5ᤵᕓỎሯÒ㳫⚜㩬⢡␦칤䊇퀒䰱혊唿ﯚ玅ﷱ絣\ue3ab鯘蕋薄譫茚괩귗댢ꪺ듟됅媉", TextUtils.getOffsetBefore("", 0) + 1, objArr10);
                String strIntern4 = ((String) objArr10[0]).intern();
                Object[] objArr11 = new Object[1];
                f("择⃒抚᪵\ue7fb鎼댆諑˚ᵍ믦论눚⩙ꍨ掼\uda7e퉑쪐稢쎭ﯸ\uf2c3剃\uebb5\ue333ᨼ⪏ጁ譣ɺ㴮", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr11);
                f.c(strIntern4, ((String) objArr11[0]).intern());
            }
            new b(getApplicationContext(), new b.c() { // from class: o.dd.a$d$$ExternalSyntheticLambda0
                @Override // o.dd.b.c
                public final void onJobEnd(o.bg.c cVar, b bVar, o.by.g gVar) {
                    this.f$0.m10628lambda$doWork$0$odda$d(aVarC, cVar, bVar, gVar);
                }
            }, aVarC, string, gVarD).c();
            synchronized (this.syncObject) {
                try {
                    this.syncObject.wait();
                    result = this.lockResult;
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                    return ListenableWorker.Result.failure();
                }
            }
            return result;
        }

        public final boolean equals(Object obj) {
            int i2 = 2 % 2;
            int i3 = f22805b + 57;
            f22807d = i3 % 128;
            Object obj2 = null;
            if (i3 % 2 != 0) {
                super.equals(obj);
                throw null;
            }
            boolean zEquals = super.equals(obj);
            int i4 = f22807d + 19;
            f22805b = i4 % 128;
            if (i4 % 2 != 0) {
                return zEquals;
            }
            obj2.hashCode();
            throw null;
        }

        protected final void finalize() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f22807d + 69;
            f22805b = i3 % 128;
            if (i3 % 2 == 0) {
                super.finalize();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            super.finalize();
            int i4 = f22807d + 83;
            f22805b = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 86 / 0;
            }
        }

        public int hashCode() {
            int i2 = 2 % 2;
            int i3 = f22807d + 61;
            f22805b = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                super.hashCode();
                obj.hashCode();
                throw null;
            }
            int iHashCode = super.hashCode();
            int i4 = f22805b + 5;
            f22807d = i4 % 128;
            if (i4 % 2 == 0) {
                return iHashCode;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: lambda$doWork$0$o-dd-a$d, reason: not valid java name */
        /* synthetic */ void m10628lambda$doWork$0$odda$d(o.az.a aVar, o.bg.c cVar, b bVar, o.by.g gVar) {
            synchronized (this.syncObject) {
                if (o.dc.d.a().e(getApplicationContext(), cVar, aVar, true, gVar)) {
                    this.lockResult = ListenableWorker.Result.retry();
                } else {
                    this.lockResult = ListenableWorker.Result.success();
                }
                this.syncObject.notifyAll();
            }
        }

        @Override // androidx.work.ListenableWorker
        public synchronized void onStopped() {
            int i2 = 2 % 2;
            int i3 = f22807d;
            int i4 = i3 + 5;
            f22805b = i4 % 128;
            int i5 = i4 % 2;
            if (this.lifecycleJob != null) {
                int i6 = i3 + 29;
                f22805b = i6 % 128;
                if (i6 % 2 == 0) {
                    f.a();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (f.a()) {
                    Object[] objArr = new Object[1];
                    f("ꆨ\ue7c7ꇬ\uddb1㎨䟢\udb0f䦝엽畗澾\ue39e煙\ued0a睳\u0be5ᤵᕓỎሯÒ㳫⚜㩬⢡␦칤䊇퀒䰱혊唿ﯚ玅ﷱ絣\ue3ab鯘蕋薄譫茚괩귗댢ꪺ듟됅媉", 1 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr);
                    String strIntern = ((String) objArr[0]).intern();
                    Object[] objArr2 = new Object[1];
                    f("뾆龽뿩ꗀ旖ᆣ\uf451垥붒娜㧔쳼潺锶ⅅ⓭܋洤䢨㵤Ễ䒌烵ᔅ㚎屛頚淎칮㐌聗穿", 1 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr2);
                    f.c(strIntern, ((String) objArr2[0]).intern());
                }
                this.lifecycleJob.a();
                int i7 = 2 % 2;
            }
        }

        public final String toString() {
            int i2 = 2 % 2;
            int i3 = f22805b + 13;
            f22807d = i3 % 128;
            int i4 = i3 % 2;
            String string = super.toString();
            int i5 = f22807d + 115;
            f22805b = i5 % 128;
            if (i5 % 2 != 0) {
                return string;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r8, byte r9, byte r10) {
        /*
            int r8 = r8 * 3
            int r1 = r8 + 1
            byte[] r7 = o.dd.a.$$a
            int r0 = r10 * 2
            int r2 = 3 - r0
            int r0 = r9 * 6
            int r0 = r0 + 67
            byte[] r6 = new byte[r1]
            r5 = 0
            if (r7 != 0) goto L2b
            r4 = r5
            r3 = r8
        L15:
            int r0 = -r0
            int r0 = r0 + r3
        L17:
            int r2 = r2 + 1
            byte r1 = (byte) r0
            r6[r4] = r1
            if (r4 != r8) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L24:
            r1 = r7[r2]
            int r4 = r4 + 1
            r3 = r0
            r0 = r1
            goto L15
        L2b:
            r4 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dd.a.$$c(byte, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22802h = 0;
        f22801f = 1;
        f22800e = 0;
        f22803j = 1;
        e();
        ExpandableListView.getPackedPositionGroup(0L);
        Drawable.resolveOpacity(0, 0);
        Drawable.resolveOpacity(0, 0);
        ExpandableListView.getPackedPositionForGroup(0);
        ViewConfiguration.getScrollDefaultDelay();
        int i2 = f22801f + 115;
        f22802h = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void c(Context context) {
        WorkManager workManager;
        Object obj;
        int i2 = 2 % 2;
        int i3 = f22803j + 67;
        f22800e = i3 % 128;
        if (i3 % 2 != 0) {
            workManager = WorkManager.getInstance(context);
            Object[] objArr = new Object[1];
            g(37 % TextUtils.indexOf("", "", 1, 0), null, null, "\u0098\u0097\u0096\u0083\u0093\u0081\u008e\u0081\u0083\u0095\u0090\u0093¢\u0086\u0097\u0093\u0083\u0089\u009b\u0088¢\u008f\u0095", objArr);
            obj = objArr[0];
        } else {
            workManager = WorkManager.getInstance(context);
            Object[] objArr2 = new Object[1];
            g(TextUtils.indexOf("", "", 0, 0) + 127, null, null, "\u0098\u0097\u0096\u0083\u0093\u0081\u008e\u0081\u0083\u0095\u0090\u0093¢\u0086\u0097\u0093\u0083\u0089\u009b\u0088¢\u008f\u0095", objArr2);
            obj = objArr2[0];
        }
        workManager.cancelUniqueWork(((String) obj).intern());
        int i4 = f22803j + 71;
        f22800e = i4 % 128;
        int i5 = i4 % 2;
    }

    public static boolean d(Context context, c cVar, String str) {
        int i2 = 2 % 2;
        Data.Builder builder = new Data.Builder();
        Object[] objArr = new Object[1];
        g(ExpandableListView.getPackedPositionChild(0L) + 128, null, null, "\u0083\u0086\u008e\u008d\u0083\u008c\u0088\u008b\u008b\u0083\u008a\u0083\u0089\u0088\u0087\u0086\u0085\u0084\u0081\u0083\u0082\u0081", objArr);
        Data.Builder builderPutString = builder.putString(((String) objArr[0]).intern(), cVar.e().toString());
        Object[] objArr2 = new Object[1];
        g(((Process.getThreadPriority(0) + 20) >> 6) + 127, null, null, "\u008f\u0083\u008c\u008c\u0090\u008f\u008d\u0083\u008c\u0088\u008b\u008b\u0083\u008a\u0083\u0089\u0088\u0087\u0086\u0085\u0084\u0081\u0083\u0082\u0081", objArr2);
        Data.Builder builderPutString2 = builderPutString.putString(((String) objArr2[0]).intern(), cVar.d().toString());
        Object[] objArr3 = new Object[1];
        g(126 - TextUtils.lastIndexOf("", '0'), null, null, "\u0087\u0091\u0083\u008c\u0088\u008b\u008b\u0083\u008a\u0083\u0089\u0088\u0087\u0086\u0085\u0084\u0081\u0083\u0082\u0081", objArr3);
        OneTimeWorkRequest.Builder backoffCriteria = new OneTimeWorkRequest.Builder(AntelopLifecycleJobService.class).setConstraints(new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build()).setInputData(builderPutString2.putString(((String) objArr3[0]).intern(), str).build()).setBackoffCriteria(cVar.a().c(), cVar.a().a(), TimeUnit.SECONDS);
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(13, 5);
        Date time = calendar.getTime();
        Date dateC = cVar.c();
        if (dateC.before(time)) {
            backoffCriteria.setInitialDelay(0L, TimeUnit.SECONDS);
            if (f.a()) {
                int i3 = f22800e + 91;
                f22803j = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr4 = new Object[1];
                g((ViewConfiguration.getPressedStateDuration() >> 16) + 127, null, null, "\u008f\u0083\u009b\u009b\u009a\u0099\u0098\u0097\u0096\u0083\u0093\u0081\u008e\u0081\u0083\u0095\u0090\u0094\u0087\u0083\u008e\u0088\u0093\u0083\u0092", objArr4);
                String strIntern = ((String) objArr4[0]).intern();
                Object[] objArr5 = new Object[1];
                g(View.MeasureSpec.makeMeasureSpec(0, 0) + 127, null, null, "\u009e\u0097\u009b\u009c\u0089\u008f\u0088\u0089\u008b\u009c\u0097\u0089\u009c\u0087\u0083\u0093\u009a\u0087\u0083\u0082\u0081\u008b\u009c\u008b\u0090\u009c\u0098\u0097\u0096\u0089\u008f\u0088\u0089\u008b\u009c\u009d\u009c\u0098\u0097\u0096\u0089\u008f\u0088\u0089\u008b", objArr5);
                f.c(strIntern, ((String) objArr5[0]).intern());
                int i5 = f22803j + 37;
                f22800e = i5 % 128;
                int i6 = i5 % 2;
            }
        } else {
            int time2 = (int) (dateC.getTime() - date.getTime());
            backoffCriteria.setInitialDelay(time2, TimeUnit.MILLISECONDS);
            if (f.a()) {
                Object[] objArr6 = new Object[1];
                g((ViewConfiguration.getDoubleTapTimeout() >> 16) + 127, null, null, "\u008f\u0083\u009b\u009b\u009a\u0099\u0098\u0097\u0096\u0083\u0093\u0081\u008e\u0081\u0083\u0095\u0090\u0094\u0087\u0083\u008e\u0088\u0093\u0083\u0092", objArr6);
                String strIntern2 = ((String) objArr6[0]).intern();
                Locale localeD = o.ea.g.d();
                Object[] objArr7 = new Object[1];
                g(127 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), null, null, "\u008b\u0087\u009b\u0097\u0081\u0083\u008b\u009c\u0087 \u009c\u009b\u0090\u009c\u0089\u008f\u0088\u0089\u008b\u009c\u0097\u0089\u009c\u0087\u0083\u0093\u009a\u0087\u0083\u0082\u0081\u008b\u009c\u008b\u0090\u009c\u0098\u0097\u009f\u009c\u009d\u009c\u0098\u0097\u0096\u0089\u008f\u0088\u0089\u008b", objArr7);
                f.c(strIntern2, String.format(localeD, ((String) objArr7[0]).intern(), Integer.valueOf(time2 / 1000)));
            }
        }
        OneTimeWorkRequest oneTimeWorkRequestBuild = backoffCriteria.build();
        if (f.a()) {
            Object[] objArr8 = new Object[1];
            g(TextUtils.indexOf("", "", 0) + 127, null, null, "\u008f\u0083\u009b\u009b\u009a\u0099\u0098\u0097\u0096\u0083\u0093\u0081\u008e\u0081\u0083\u0095\u0090\u0094\u0087\u0083\u008e\u0088\u0093\u0083\u0092", objArr8);
            String strIntern3 = ((String) objArr8[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr9 = new Object[1];
            g(Gravity.getAbsoluteGravity(0, 0) + 127, null, null, "\u009c¡\u009c\u008b\u0090\u009c\u0087\u0090\u009a\u009a\u009c\u0098\u0097\u009f\u009c\u009d\u009c\u0098\u0097\u0096\u0089\u008f\u0088\u0089\u008b", objArr9);
            f.c(strIntern3, sb.append(((String) objArr9[0]).intern()).append(oneTimeWorkRequestBuild.getId()).toString());
        }
        WorkManager workManager = WorkManager.getInstance(context);
        Object[] objArr10 = new Object[1];
        g(128 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), null, null, "\u0098\u0097\u0096\u0083\u0093\u0081\u008e\u0081\u0083\u0095\u0090\u0093¢\u0086\u0097\u0093\u0083\u0089\u009b\u0088¢\u008f\u0095", objArr10);
        workManager.enqueueUniqueWork(((String) objArr10[0]).intern(), ExistingWorkPolicy.REPLACE, oneTimeWorkRequestBuild);
        return true;
    }

    static void e() {
        f22797b = new char[]{2068, 2065, 2066, 2076, 2082, 2073, 2069, 2070, 2053, 2106, 2052, 2064, 2085, 2062, 2055, 2078, 2110, 2101, 2077, 2109, 2067, 2111, 2072, 2071, 2087, 2050, 2075, 2153, 2138, 2048, 2079, 2130, 2127, 2139};
        f22796a = 2040400265;
        f22799d = true;
        f22798c = true;
    }

    private static void g(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
        String str3 = str;
        String str4 = str2;
        int i3 = 2 % 2;
        Object obj = str4;
        if (str4 != null) {
            byte[] bytes = str4.getBytes("ISO-8859-1");
            int i4 = $11 + 13;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            obj = bytes;
        }
        byte[] bArr = (byte[]) obj;
        Object obj2 = null;
        Object charArray = str3;
        if (str3 != null) {
            int i6 = $11 + 69;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                str3.toCharArray();
                obj2.hashCode();
                throw null;
            }
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        o.a.f fVar = new o.a.f();
        char[] cArr2 = f22797b;
        int i7 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                    Object objA = o.d.d.a(1618406102);
                    if (objA == null) {
                        byte b2 = (byte) i7;
                        byte b3 = b2;
                        objA = o.d.d.a(593 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (TextUtils.getOffsetBefore("", i7) + 13181), Color.argb(i7, i7, i7, i7) + 11, -1225586509, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i8++;
                    i7 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(f22796a)};
        Object objA2 = o.d.d.a(-1503702982);
        if (objA2 == null) {
            objA2 = o.d.d.a(Color.green(0) + 32, (char) (ImageFormat.getBitsPerPixel(0) + 1), 10 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1893380703, false, "F", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
        if (f22798c) {
            fVar.f19923e = bArr.length;
            char[] cArr4 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                cArr4[fVar.f19922a] = (char) (cArr2[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                Object[] objArr4 = {fVar, fVar};
                Object objA3 = o.d.d.a(1540807955);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 1);
                    objA3 = o.d.d.a(457 - MotionEvent.axisFromString(""), (char) ((-1) - TextUtils.lastIndexOf("", '0')), 11 - (Process.myPid() >> 22), -1923924106, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (f22799d) {
            int i9 = $11 + 117;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            fVar.f19923e = cArr.length;
            char[] cArr5 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                int i11 = $10 + 45;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                cArr5[fVar.f19922a] = (char) (cArr2[cArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                Object[] objArr5 = {fVar, fVar};
                Object objA4 = o.d.d.a(1540807955);
                if (objA4 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 1);
                    objA4 = o.d.d.a(458 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 10, -1923924106, false, $$c(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i13 = 0;
        fVar.f19923e = iArr.length;
        char[] cArr6 = new char[fVar.f19923e];
        while (true) {
            fVar.f19922a = i13;
            if (fVar.f19922a >= fVar.f19923e) {
                objArr[0] = new String(cArr6);
                return;
            }
            int i14 = $10 + 101;
            $11 = i14 % 128;
            if (i14 % 2 == 0) {
                cArr6[fVar.f19922a] = (char) (cArr2[iArr[(fVar.f19923e % 1) << fVar.f19922a] >> i2] / iIntValue);
                i13 = fVar.f19922a - 1;
            } else {
                cArr6[fVar.f19922a] = (char) (cArr2[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                i13 = fVar.f19922a + 1;
            }
        }
    }

    static void init$0() {
        $$a = new byte[]{67, Ascii.SI, 99, -76};
        $$b = 144;
    }
}
