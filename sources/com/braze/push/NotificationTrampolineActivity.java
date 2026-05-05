package com.braze.push;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.WindowManager;
import com.braze.BrazeInternal;
import com.braze.Constants;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.push.BrazePushReceiver;
import com.braze.support.BrazeLogger;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import yg.C1499aX;
import yg.C1553lQ;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u0016DLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007f\u0007lkOӄtev-\u0013V֖\u0013k\n4lk2r[;\u0004\u001c.(\u0017Rfi}mx^QUW\f$}\u0003,wW?oZ\u0015@H\b?aO6Oˉd{"}, d2 = {"\u001ab^:\")KO.~Di<\u000b\fxN\n7\u007fA\u0005\u0015\u0013Vs\u0018Ee21a\t*>q\u001f.)AJoE\"$|7", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "u(E", "=m2?X(MS", "", "A`e2W\u0010Ga(z\u0004\\,j\u0018+t\u007f", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "=m?.h:>", "=mA2f<FS", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class NotificationTrampolineActivity extends Activity {

    /* JADX INFO: renamed from: com.braze.push.NotificationTrampolineActivity$onCreate$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function0<String> {
        public static final AnonymousClass1 INSTANCE = ;

        AnonymousClass1() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "NotificationTrampolineActivity created";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.NotificationTrampolineActivity$onPause$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09571 extends Lambda implements Function0<String> {
        public static final C09571 INSTANCE = ;

        C09571() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Notification trampoline activity paused and finishing";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.NotificationTrampolineActivity$onResume$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C09581 extends Lambda implements Function0<String> {
        public static final C09581 INSTANCE = ;

        C09581() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Notification trampoline activity received null intent. Doing nothing.";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.NotificationTrampolineActivity$onResume$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function0<String> {
        public static final AnonymousClass2 INSTANCE = ;

        AnonymousClass2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Notification trampoline activity received intent with null action. Doing nothing.";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.NotificationTrampolineActivity$onResume$3 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass3 extends Lambda implements Function0<String> {
        final /* synthetic */ Intent $receivedIntent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(Intent intent) {
            super(0);
            intent = intent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Notification trampoline activity received intent: " + intent;
        }
    }

    /* JADX INFO: renamed from: com.braze.push.NotificationTrampolineActivity$onResume$5 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass5 extends Lambda implements Function0<String> {
        public static final AnonymousClass5 INSTANCE = ;

        AnonymousClass5() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Failed to route intent to notification receiver";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.NotificationTrampolineActivity$onResume$6 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass6 extends Lambda implements Function0<String> {
        public static final AnonymousClass6 INSTANCE = ;

        AnonymousClass6() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Notification trampoline activity finished processing. Delaying before finishing activity.";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.NotificationTrampolineActivity$onResume$7 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!,i\u000eӵ\\c#\u0003\bٕn"}, d2 = {"\n`]<a@F])\rS", ""}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass7 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.braze.push.NotificationTrampolineActivity$onResume$7$1 */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        static final class AnonymousClass1 extends Lambda implements Function0<String> {
            public static final AnonymousClass1 INSTANCE = ;

            AnonymousClass1() {
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Delay complete. Finishing Notification trampoline activity now";
            }
        }

        AnonymousClass7(Continuation<? super AnonymousClass7> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return NotificationTrampolineActivity.this.new AnonymousClass7(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((AnonymousClass7) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) NotificationTrampolineActivity.this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) AnonymousClass1.INSTANCE, 6, (Object) null);
            NotificationTrampolineActivity.this.finish();
            return Unit.INSTANCE;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        synchronized (C1553lQ.class) {
            String strVd = hg.Vd("\\I\u000fL0", (short) (C1499aX.Xd() ^ (2078674417 ^ (-2078676775))), (short) (C1499aX.Xd() ^ (403258084 ^ (-403272181))));
            String strUd = C1561oA.ud("_L", (short) (C1607wl.Xd() ^ (1205369441 ^ 1205360172)));
            try {
                Class<?> cls = Class.forName(strVd);
                Field field = 0 != 0 ? cls.getField(strUd) : cls.getDeclaredField(strUd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                short sXd = (short) (Od.Xd() ^ ((1664839704 ^ 1197321253) ^ (-610722169)));
                int[] iArr = new int["\u0018\u0005J\bk".length()];
                QB qb = new QB("\u0018\u0005J\bk");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
                    i2++;
                }
                String str = new String(iArr, 0, i2);
                String strYd = C1561oA.Yd("1\u001f", (short) (ZN.Xd() ^ (351292279 ^ 351286923)));
                try {
                    Class<?> cls2 = Class.forName(str);
                    Field field2 = 0 != 0 ? cls2.getField(strYd) : cls2.getDeclaredField(strYd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strQd = Xg.qd("_N\u0016U;", (short) (ZN.Xd() ^ (1676049407 ^ 1676018859)), (short) (ZN.Xd() ^ ((1852405398 ^ 1133154221) ^ 769915405)));
                    String strWd = Jg.Wd(">L", (short) (OY.Xd() ^ ((1104467231 ^ 1592132193) ^ 523431423)), (short) (OY.Xd() ^ ((1395350720 ^ 1897063252) ^ 574223377)));
                    try {
                        Class<?> cls3 = Class.forName(strQd);
                        Field field3 = 0 != 0 ? cls3.getField(strWd) : cls3.getDeclaredField(strWd);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        Object[] objArr = new Object[0];
                        Method declaredMethod = Class.forName(ZO.xd("\u001c\u0015\u000f<:", (short) (C1580rY.Xd() ^ ((1458849142 ^ 1855710355) ^ (-946848720))), (short) (C1580rY.Xd() ^ ((1345614964 ^ 676445327) ^ (-2019942994))))).getDeclaredMethod(C1626yg.Ud("\u000b=", (short) (OY.Xd() ^ (1099225323 ^ 1099226568)), (short) (OY.Xd() ^ (1906999449 ^ 1907013601))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                String strWd2 = Ig.wd("p4\u0005]7q", (short) (OY.Xd() ^ ((101865383 ^ 1036282933) ^ 1003885648)));
                                Class<?> cls4 = Class.forName(EO.Od("l \ny w\u0011ctNM3s\tt\u000eH\tAAm:\u0016", (short) (ZN.Xd() ^ (73286704 ^ 73279169))));
                                Class<?>[] clsArr = {Class.forName(C1561oA.Qd("si}g3pdph.Rroeia", (short) (FB.Xd() ^ ((2026669939 ^ 888548499) ^ 1278912883))))};
                                Object[] objArr2 = {strWd2};
                                short sXd2 = (short) (Od.Xd() ^ ((423547804 ^ 1946304805) ^ (-1832691898)));
                                short sXd3 = (short) (Od.Xd() ^ ((1528691841 ^ 374941240) ^ (-1296343536)));
                                int[] iArr2 = new int["TScCjegYbI\\joc^a".length()];
                                QB qb2 = new QB("TScCjegYbI\\joc^a");
                                int i3 = 0;
                                while (qb2.YK()) {
                                    int iKK2 = qb2.KK();
                                    Xu xuXd2 = Xu.Xd(iKK2);
                                    iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) - sXd3);
                                    i3++;
                                }
                                Method method = cls4.getMethod(new String(iArr2, 0, i3), clsArr);
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strOd = C1561oA.od("?,q/\u0013", (short) (C1607wl.Xd() ^ ((161736140 ^ 2066699031) ^ 1921838982)));
                                    short sXd4 = (short) (C1607wl.Xd() ^ (509684037 ^ 509690141));
                                    int[] iArr3 = new int["e[".length()];
                                    QB qb3 = new QB("e[");
                                    int i4 = 0;
                                    while (qb3.YK()) {
                                        int iKK3 = qb3.KK();
                                        Xu xuXd3 = Xu.Xd(iKK3);
                                        iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - ((sXd4 + sXd4) + i4));
                                        i4++;
                                    }
                                    String str2 = new String(iArr3, 0, i4);
                                    try {
                                        Class<?> cls5 = Class.forName(strOd);
                                        Field field4 = 0 != 0 ? cls5.getField(str2) : cls5.getDeclaredField(str2);
                                        field4.setAccessible(true);
                                        field4.set(null, windowManager);
                                    } catch (Throwable th4) {
                                    }
                                } catch (InvocationTargetException e2) {
                                    throw e2.getCause();
                                }
                            }
                        } catch (InvocationTargetException e3) {
                            throw e3.getCause();
                        }
                    }
                    String strZd = Wg.Zd("W\u001fK\u0013]", (short) (C1580rY.Xd() ^ ((1336002640 ^ 626724540) ^ (-1794825461))), (short) (C1580rY.Xd() ^ ((545748412 ^ 290734016) ^ (-835938610))));
                    String strXd = C1561oA.Xd("\u000f\u0005", (short) (FB.Xd() ^ ((425949447 ^ 435461297) ^ 9941282)));
                    try {
                        Class<?> cls6 = Class.forName(strZd);
                        Field field5 = 0 != 0 ? cls6.getField(strXd) : cls6.getDeclaredField(strXd);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strVd2 = Wg.vd("N;\u0001>\"", (short) (ZN.Xd() ^ ((40978181 ^ 1010025518) ^ 1044569395)));
                        short sXd5 = (short) (C1607wl.Xd() ^ ((1764341143 ^ 1411159167) ^ 1026899926));
                        short sXd6 = (short) (C1607wl.Xd() ^ (389637298 ^ 389616595));
                        int[] iArr4 = new int["ui".length()];
                        QB qb4 = new QB("ui");
                        int i5 = 0;
                        while (qb4.YK()) {
                            int iKK4 = qb4.KK();
                            Xu xuXd4 = Xu.Xd(iKK4);
                            iArr4[i5] = xuXd4.fK(((sXd5 + i5) + xuXd4.CK(iKK4)) - sXd6);
                            i5++;
                        }
                        String str3 = new String(iArr4, 0, i5);
                        try {
                            Class<?> cls7 = Class.forName(strVd2);
                            Field field6 = 0 != 0 ? cls7.getField(str3) : cls7.getDeclaredField(str3);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i6 = (1414573661 ^ 1599749751) ^ 185241697;
                        if (x2 > i6 && x2 < displayMetrics.widthPixels - i6 && y2 > i6 && y2 < displayMetrics.heightPixels - i6) {
                            C1553lQ.vd(motionEvent);
                            C1553lQ.Od(motionEvent);
                        }
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (BrazeInternal.INSTANCE.getConfigurationProvider(this).getShouldUseWindowFlagSecureInActivities()) {
            getWindow().setFlags(8192, 8192);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) AnonymousClass1.INSTANCE, 6, (Object) null);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) C09571.INSTANCE, 6, (Object) null);
        finish();
    }

    @Override // android.app.Activity
    protected void onResume() throws Throwable {
        Intent intent;
        super.onResume();
        try {
            intent = getIntent();
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) AnonymousClass5.INSTANCE, 4, (Object) null);
        }
        if (intent == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C09581.INSTANCE, 7, (Object) null);
            finish();
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) AnonymousClass2.INSTANCE, 7, (Object) null);
            finish();
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.NotificationTrampolineActivity.onResume.3
            final /* synthetic */ Intent $receivedIntent;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(Intent intent2) {
                super(0);
                intent = intent2;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Notification trampoline activity received intent: " + intent;
            }
        }, 6, (Object) null);
        Intent intent2 = new Intent(action).setClass(this, BrazeNotificationUtils.getNotificationReceiverClass());
        Intrinsics.checkNotNullExpressionValue(intent2, "Intent(action).setClass(…otificationReceiverClass)");
        Bundle extras = intent2.getExtras();
        if (extras != null) {
            intent2.putExtras(extras);
        }
        if (Constants.isAmazonDevice()) {
            BrazePushReceiver.Companion.handleReceivedIntent$default(BrazePushReceiver.Companion, this, intent2, false, 4, null);
        } else {
            BrazePushReceiver.Companion.handleReceivedIntent(this, intent2, false);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) AnonymousClass6.INSTANCE, 6, (Object) null);
        BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, (Number) 200, null, new AnonymousClass7(null), 2, null);
    }
}
