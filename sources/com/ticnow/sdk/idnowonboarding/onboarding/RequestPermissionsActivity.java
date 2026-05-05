package com.ticnow.sdk.idnowonboarding.onboarding;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import androidx.appcompat.app.ActionBar;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentManager;
import com.dynatrace.android.callback.Callback;
import com.ticnow.sdk.idnowonboarding.R;
import com.ticnow.sdk.idnowonboarding.connectivity.IdNowConnectionChecker;
import com.ticnow.sdk.idnowonboarding.dialog.Dialog;
import com.ticnow.sdk.idnowonboarding.interfaces.TicnowActivity;
import com.ticnow.sdk.idnowonboarding.steps.response.IDStepResponseCodes;
import io.sentry.protocol.SentryStackFrame;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1553lQ;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.CX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {1, 0, 3}, d1 = {"Яb\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00176Ȑ\u0007\"B\u0012\u007fјnjG9LeN7ZS@\u000fs{:$c$\bCCU }*\t]To˧vJp\u000bKƤ\u000e\u0016\u0007j4I[ze\u0012%2JoE4UoKHhҚ>\u0005.E*8\u007f\u0006\t\u001a@H\u0018͌\u0011ŏ{\f@/\u0001sĐV\r[\u0005b\u0018\u0014Y8\u0001Lx.S~NzzR/Q\t0B\u0017-mN\u0015M;b\u001b;U\u0007o=C@eQE+a#\u001fTq>1`8OM\u00145ICI\"sf\\\u000e7-+}%\u000e~4\u0001\u001dYp\u0010-*_cyR<M(~\n3T\u0004<-m\\Ͷ1\u001at0VC\u0003\u001ck@~\u001e\u000fH\u000e%y8-$.^q9kr_bS\u0019|9R˟O̷'\u0001vď,`\u001cc-\u001b\u0003{(Ļ}͘AHVˣ*U{\t\tb00ZΉSĬ3\b\u0019ф/'=bG+Am\bQRqG\u001dnski\u0001N\u0017̕zގ;6\u0011ȱrFj\u0011yXtZ2\u001e[&%\u001f\f\u0016+ \u000b}\u0013Ơ1ŎR[pȉ\u0003Oc\u001937\u00079_~y\u0018(ElDMQ\u0012\"8ׯ#݀C<jڳ)rPf$Z\u000b:xøtн\u0014w\u0004ͩ\u001f\u0018!FWqJI\u0003վEÅ\u0019H\u000bٜ\u0013M\u000b\u001fwZ\u0017%Uԡ_ʗ\u0007i,ڏY\r^s\to\u0016\u0011 ؖ?˃&-Iٛ\u0006%4n:hb\u0017yȗ+\u0381\u0004GoնܪP\u0019"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\b)4w\u0012;LGDm}\u000b\u0015tq9\u0015r\u0017N\u0004/KZ\\0f[\u0001\u0019\u0012!^\u001fR:!Z", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0002)Fm#/IA;y}\r\u0019fjC\u0019?*]z8K[b\u0002", "u(E", "\"@6", "", "0tcAb5\u001c]\"\u000e~g<|", "\u001a`]1e6BRb\u0011~].|\u0018xB\u00107\u000bJ\nl", "1gT0^w", "", "5dc\u0010[,<Yd", "u(I", "Adc\u0010[,<Yd", "uY\u0018#", "1gT0^x", "5dc\u0010[,<Ye", "Adc\u0010[,<Ye", "1gT0^y", "5dc\u0010[,<Yf", "Adc\u0010[,<Yf", "1gT0^\tHf\u0004~\bf0\u000b\u00173o\t", "\u001a`]1e6BRb\u0011~].|\u0018xC\u0003(yF]!*\u001d", "1gT0^\tHf\u0004~\bf0\u000b\u00173o\tt", "7lP4X\u001dBS+[v\\2", "\u001a`]1e6BRb\u0011~].|\u0018xI\b$}@q\u001b\u0017YE", "7lP4X\u001dBS+\\\u0002h:|", ">da:\\:LW#\bg^8\r\t=t]2z@", "", "AgP?X+", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\b)4w\u0012;LGDm}\f\u0018dn9\u0006N9Nw'TLW*\\(", "1gT0^\nAS\u0017\u0005Wh?|\u0017", "", "1gT0^\u0017>`!\u0003\tl0\u0007\u0012=", "=m1.V2)`\u0019\r\t^+", "=m2?X(MS", "A`e2W\u0010Ga(z\u0004\\,j\u0018+t\u007f", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "=mA2d<>a(izk4\u0001\u0017=i\n1\n-\u0001%'N~", "@d`BX:M1#}z", ">da:\\:LW#\b\t", "", "5qP;g\u0019>a)\u0006\nl", "", "uHJ\u0019](OOb\u0006vg.Fv>r\u00041}\u0016vzZ8", "AsP?g\u0010Ga(z\u0002e,{d:p^(\u000b<\u0005\u001e%#m\u001d@\b)Dm", "1n]AX?M", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class RequestPermissionsActivity extends TicnowActivity {
    private HashMap _$_findViewCache;
    private Button buttonContinue;
    private boolean check1;
    private boolean check2;
    private boolean check3;
    private CheckBox checkBoxPermission;
    private CheckBox checkBoxPermission2;
    private ImageView imageViewBack;
    private ImageView imageViewClose;
    private SharedPreference shared;
    private final String TAG = "RequestPermissionsActivity";
    private final int permissionRequestCode = 1009;

    public static final /* synthetic */ Button access$getButtonContinue$p(RequestPermissionsActivity requestPermissionsActivity) {
        Button button = requestPermissionsActivity.buttonContinue;
        if (button == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonContinue");
        }
        return button;
    }

    public static final /* synthetic */ CheckBox access$getCheckBoxPermission$p(RequestPermissionsActivity requestPermissionsActivity) {
        CheckBox checkBox = requestPermissionsActivity.checkBoxPermission;
        if (checkBox == null) {
            Intrinsics.throwUninitializedPropertyAccessException("checkBoxPermission");
        }
        return checkBox;
    }

    public static final /* synthetic */ CheckBox access$getCheckBoxPermission2$p(RequestPermissionsActivity requestPermissionsActivity) {
        CheckBox checkBox = requestPermissionsActivity.checkBoxPermission2;
        if (checkBox == null) {
            Intrinsics.throwUninitializedPropertyAccessException("checkBoxPermission2");
        }
        return checkBox;
    }

    public static final /* synthetic */ SharedPreference access$getShared$p(RequestPermissionsActivity requestPermissionsActivity) {
        SharedPreference sharedPreference = requestPermissionsActivity.shared;
        if (sharedPreference == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shared");
        }
        return sharedPreference;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean checkPermissions() {
        RequestPermissionsActivity requestPermissionsActivity = this;
        if (ActivityCompat.checkSelfPermission(requestPermissionsActivity, "android.permission.ACCESS_FINE_LOCATION") != 0 || ActivityCompat.checkSelfPermission(requestPermissionsActivity, "android.permission.ACCESS_COARSE_LOCATION") != 0 || ActivityCompat.checkSelfPermission(requestPermissionsActivity, "android.permission.CAMERA") != 0 || ActivityCompat.checkSelfPermission(requestPermissionsActivity, "android.permission.WRITE_EXTERNAL_STORAGE") != 0 || ActivityCompat.checkSelfPermission(requestPermissionsActivity, "android.permission.READ_EXTERNAL_STORAGE") != 0) {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, this.permissionRequestCode);
            return false;
        }
        SharedPreference sharedPreference = this.shared;
        if (sharedPreference == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shared");
        }
        sharedPreference.save("permission", true);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startInstalledAppDetailsActivity(Activity activity) throws Exception {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts(SentryStackFrame.JsonKeys.PACKAGE, getPackageName(), null));
        CX.ud();
        startActivity(intent);
    }

    @Override // com.ticnow.sdk.idnowonboarding.interfaces.TicnowActivity
    public void _$_clearFindViewByIdCache() {
        HashMap map = this._$_findViewCache;
        if (map != null) {
            map.clear();
        }
    }

    @Override // com.ticnow.sdk.idnowonboarding.interfaces.TicnowActivity
    public View _$_findCachedViewById(int i2) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i2);
        this._$_findViewCache.put(Integer.valueOf(i2), viewFindViewById);
        return viewFindViewById;
    }

    public final void checkCheckBoxes() {
        CheckBox checkBox = this.checkBoxPermission;
        if (checkBox == null) {
            Intrinsics.throwUninitializedPropertyAccessException("checkBoxPermission");
        }
        if (checkBox.isChecked()) {
            CheckBox checkBox2 = this.checkBoxPermission2;
            if (checkBox2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("checkBoxPermission2");
            }
            if (checkBox2.isChecked()) {
                Button button = this.buttonContinue;
                if (button == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("buttonContinue");
                }
                button.setEnabled(true);
                checkPermissions();
                return;
            }
        }
        Button button2 = this.buttonContinue;
        if (button2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonContinue");
        }
        button2.setEnabled(false);
        SharedPreference sharedPreference = this.shared;
        if (sharedPreference == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shared");
        }
        sharedPreference.save("permission", false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        synchronized (C1553lQ.class) {
            String strKd = Qg.kd("G4y7\u001b", (short) (FB.Xd() ^ ((565137077 ^ 2008483386) ^ 1444421255)), (short) (FB.Xd() ^ ((1441115281 ^ 840679755) ^ 1744708679)));
            String strVd = hg.Vd("\u0007s", (short) (FB.Xd() ^ ((1356315239 ^ 1646597721) ^ 854754343)), (short) (FB.Xd() ^ ((371142143 ^ 1872258513) ^ 2038916396)));
            try {
                Class<?> cls = Class.forName(strKd);
                Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strUd = C1561oA.ud("!\u000eS\u0011t", (short) (C1499aX.Xd() ^ (1740991130 ^ (-1740967644))));
                String strYd = C1561oA.yd("SA", (short) (ZN.Xd() ^ (49575591 ^ 49575691)));
                try {
                    Class<?> cls2 = Class.forName(strUd);
                    Field field2 = 0 != 0 ? cls2.getField(strYd) : cls2.getDeclaredField(strYd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strYd2 = C1561oA.Yd("SB\nI/", (short) (OY.Xd() ^ ((1416545381 ^ 281913660) ^ 1151552216)));
                    short sXd = (short) (Od.Xd() ^ (1840354071 ^ (-1840372520)));
                    short sXd2 = (short) (Od.Xd() ^ ((1549339956 ^ 254660790) ^ (-1400161198)));
                    int[] iArr = new int["_U".length()];
                    QB qb = new QB("_U");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
                        i2++;
                    }
                    String str = new String(iArr, 0, i2);
                    try {
                        Class<?> cls3 = Class.forName(strYd2);
                        Field field3 = 0 != 0 ? cls3.getField(str) : cls3.getDeclaredField(str);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        Object[] objArr = new Object[0];
                        Method declaredMethod = Class.forName(Jg.Wd("ubBb3", (short) (ZN.Xd() ^ ((765749251 ^ 1087601236) ^ 1836530166)), (short) (ZN.Xd() ^ (2000937629 ^ 2000923401)))).getDeclaredMethod(ZO.xd("u>", (short) (C1499aX.Xd() ^ ((1174449712 ^ 1015338624) ^ (-2055491164))), (short) (C1499aX.Xd() ^ (357857107 ^ (-357826828)))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                short sXd3 = (short) (OY.Xd() ^ ((1582351097 ^ 760892238) ^ 1930087340));
                                short sXd4 = (short) (OY.Xd() ^ ((1539671558 ^ 161524307) ^ 1382380416));
                                int[] iArr2 = new int["c\u0012V\u000el\u0015".length()];
                                QB qb2 = new QB("c\u0012V\u000el\u0015");
                                int i3 = 0;
                                while (qb2.YK()) {
                                    int iKK2 = qb2.KK();
                                    Xu xuXd2 = Xu.Xd(iKK2);
                                    iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + (i3 * sXd4))) + xuXd2.CK(iKK2));
                                    i3++;
                                }
                                Object[] objArr2 = {new String(iArr2, 0, i3)};
                                Method method = Class.forName(Ig.wd("/\u0011\u0017FY\u000fg'\n'*P\u000f \f`MY.\u001eL)9", (short) (C1607wl.Xd() ^ ((1470129690 ^ 1893715150) ^ 662682185)))).getMethod(C1561oA.Qd("\b\u0005\u0013p\u0016\u000f\u000f~\u0006j{\b\u000b|uv", (short) (C1499aX.Xd() ^ ((2071348220 ^ 1717559599) ^ (-489275156)))), Class.forName(EO.Od("Dch:\u0010+2a)Bcd-4#\u0001", (short) (Od.Xd() ^ (1258952809 ^ (-1258949476))))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strZd = C1593ug.zd("L;\u0003B(", (short) (C1499aX.Xd() ^ (519607701 ^ (-519625298))), (short) (C1499aX.Xd() ^ ((888889609 ^ 1180154437) ^ (-1923936465))));
                                    String strOd = C1561oA.od("`T", (short) (C1580rY.Xd() ^ ((2012897746 ^ 471092879) ^ (-1810772466))));
                                    try {
                                        Class<?> cls4 = Class.forName(strZd);
                                        Field field4 = 0 != 0 ? cls4.getField(strOd) : cls4.getDeclaredField(strOd);
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
                    String strKd2 = C1561oA.Kd("\u0016\u0005L\fq", (short) (C1633zX.Xd() ^ (1638007650 ^ (-1638038403))));
                    short sXd5 = (short) (Od.Xd() ^ (1044995641 ^ (-1045001525)));
                    short sXd6 = (short) (Od.Xd() ^ (412497793 ^ (-412510568)));
                    int[] iArr3 = new int["F\f".length()];
                    QB qb3 = new QB("F\f");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK(((i4 * sXd6) ^ sXd5) + xuXd3.CK(iKK3));
                        i4++;
                    }
                    String str2 = new String(iArr3, 0, i4);
                    try {
                        Class<?> cls5 = Class.forName(strKd2);
                        Field field5 = 0 != 0 ? cls5.getField(str2) : cls5.getDeclaredField(str2);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strXd = C1561oA.Xd("F5|<\"", (short) (FB.Xd() ^ (1155372328 ^ 1155379373)));
                        String strVd2 = Wg.vd(";/", (short) (C1633zX.Xd() ^ ((1133833993 ^ 1770363094) ^ (-705768234))));
                        try {
                            Class<?> cls6 = Class.forName(strXd);
                            Field field6 = 0 != 0 ? cls6.getField(strVd2) : cls6.getDeclaredField(strVd2);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i5 = (1325324606 ^ 394389554) ^ 1501507911;
                        if (x2 > i5 && x2 < displayMetrics.widthPixels - i5 && y2 > i5 && y2 < displayMetrics.heightPixels - i5) {
                            C1553lQ.vd(motionEvent);
                            C1553lQ.Od(motionEvent);
                        }
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean getCheck1() {
        return this.check1;
    }

    public final boolean getCheck2() {
        return this.check2;
    }

    public final boolean getCheck3() {
        return this.check3;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        SharedPreference sharedPreference = this.shared;
        if (sharedPreference == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shared");
        }
        sharedPreference.save("permission", false);
        setResult(IDStepResponseCodes.STEP_RESULT_PERMISSION_NOT_MET, new Intent());
        finish();
    }

    @Override // com.ticnow.sdk.idnowonboarding.interfaces.TicnowActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(8192, 8192);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.hide();
        }
        setContentView(R.layout.activity_request_permissions);
        setRequestedOrientation(1);
        animate();
        RequestPermissionsActivity requestPermissionsActivity = this;
        this.shared = new SharedPreference(requestPermissionsActivity);
        View viewFindViewById = findViewById(R.id.imageViewBack);
        Intrinsics.checkExpressionValueIsNotNull(viewFindViewById, "findViewById(R.id.imageViewBack)");
        ImageView imageView = (ImageView) viewFindViewById;
        this.imageViewBack = imageView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageViewBack");
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.onboarding.RequestPermissionsActivity.onCreate.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Callback.onClick_enter(view);
                try {
                    RequestPermissionsActivity.this.setResult(IDStepResponseCodes.STEP_RESULT_PERMISSION_NOT_MET, new Intent());
                    RequestPermissionsActivity.this.finish();
                } finally {
                    Callback.onClick_exit();
                }
            }
        });
        View viewFindViewById2 = findViewById(R.id.imageViewClose);
        Intrinsics.checkExpressionValueIsNotNull(viewFindViewById2, "findViewById(R.id.imageViewClose)");
        ImageView imageView2 = (ImageView) viewFindViewById2;
        this.imageViewClose = imageView2;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageViewClose");
        }
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.onboarding.RequestPermissionsActivity.onCreate.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Callback.onClick_enter(view);
                try {
                    Dialog.INSTANCE.show(RequestPermissionsActivity.this.getSupportFragmentManager(), RequestPermissionsActivity.this, "", "¿Desea cerrar sesión?", "Aceptar", new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.onboarding.RequestPermissionsActivity.onCreate.2.1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            Callback.onClick_enter(view2);
                            try {
                                RequestPermissionsActivity.access$getShared$p(RequestPermissionsActivity.this).save("permission", false);
                                RequestPermissionsActivity.this.setResult(IDStepResponseCodes.STEP_RESULT_USER_CANCELLED_ONBOARDING, new Intent());
                                RequestPermissionsActivity.this.finish();
                            } finally {
                                Callback.onClick_exit();
                            }
                        }
                    }, "Cancelar", new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.onboarding.RequestPermissionsActivity.onCreate.2.2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            Callback.onClick_enter(view2);
                            try {
                            } finally {
                                Callback.onClick_exit();
                            }
                        }
                    }, new DialogInterface.OnDismissListener() { // from class: com.ticnow.sdk.idnowonboarding.onboarding.RequestPermissionsActivity.onCreate.2.3
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                        }
                    });
                } finally {
                    Callback.onClick_exit();
                }
            }
        });
        View viewFindViewById3 = findViewById(R.id.checkBoxPermission);
        Intrinsics.checkExpressionValueIsNotNull(viewFindViewById3, "findViewById(R.id.checkBoxPermission)");
        CheckBox checkBox = (CheckBox) viewFindViewById3;
        this.checkBoxPermission = checkBox;
        if (checkBox == null) {
            Intrinsics.throwUninitializedPropertyAccessException("checkBoxPermission");
        }
        checkBox.setOnClickListener(new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.onboarding.RequestPermissionsActivity.onCreate.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Callback.onClick_enter(view);
                try {
                    RequestPermissionsActivity.access$getCheckBoxPermission$p(RequestPermissionsActivity.this).setEnabled(false);
                    RequestPermissionsActivity.this.checkCheckBoxes();
                } finally {
                    Callback.onClick_exit();
                }
            }
        });
        View viewFindViewById4 = findViewById(R.id.checkBoxPermission2);
        Intrinsics.checkExpressionValueIsNotNull(viewFindViewById4, "findViewById(R.id.checkBoxPermission2)");
        CheckBox checkBox2 = (CheckBox) viewFindViewById4;
        this.checkBoxPermission2 = checkBox2;
        if (checkBox2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("checkBoxPermission2");
        }
        checkBox2.setOnClickListener(new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.onboarding.RequestPermissionsActivity.onCreate.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Callback.onClick_enter(view);
                try {
                    RequestPermissionsActivity.access$getCheckBoxPermission2$p(RequestPermissionsActivity.this).setEnabled(false);
                    RequestPermissionsActivity.this.checkCheckBoxes();
                } finally {
                    Callback.onClick_exit();
                }
            }
        });
        View viewFindViewById5 = findViewById(R.id.buttonContinue);
        Intrinsics.checkExpressionValueIsNotNull(viewFindViewById5, "findViewById(R.id.buttonContinue)");
        Button button = (Button) viewFindViewById5;
        this.buttonContinue = button;
        if (button == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonContinue");
        }
        button.setEnabled(false);
        Button button2 = this.buttonContinue;
        if (button2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buttonContinue");
        }
        button2.setOnClickListener(new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.onboarding.RequestPermissionsActivity.onCreate.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Callback.onClick_enter(view);
                try {
                    if (RequestPermissionsActivity.this.checkPermissions()) {
                        RequestPermissionsActivity.access$getButtonContinue$p(RequestPermissionsActivity.this).setEnabled(false);
                        RequestPermissionsActivity.this.setResult(IDStepResponseCodes.STEP_RESULT_PERMISSION_OK, new Intent());
                        RequestPermissionsActivity.this.finish();
                    }
                } finally {
                    Callback.onClick_exit();
                }
            }
        });
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "supportFragmentManager");
        new IdNowConnectionChecker(requestPermissionsActivity, supportFragmentManager).check();
        checkCheckBoxes();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i2, String[] permissions, int[] grantResults) {
        Intrinsics.checkParameterIsNotNull(permissions, "permissions");
        Intrinsics.checkParameterIsNotNull(grantResults, "grantResults");
        if (i2 == this.permissionRequestCode) {
            if (grantResults.length == 0) {
                setResult(IDStepResponseCodes.STEP_RESULT_PERMISSION_NOT_MET, new Intent());
                finish();
                return;
            }
            int i3 = 0;
            for (int i4 : grantResults) {
                if (!shouldShowRequestPermissionRationale(permissions[i3]) && i4 != 0) {
                    Button button = this.buttonContinue;
                    if (button == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("buttonContinue");
                    }
                    button.setEnabled(true);
                    Dialog.INSTANCE.show(getSupportFragmentManager(), this, "Permisos Denegados", "Uno o varios permisos fueron denegados de manera definitiva, recuerde que estos permisos son importantes para el funcionamiento de la aplicación, si desea habilitar los permisos, debe otorgar el acceso en los Ajustes de esta aplicación -> Accesos", "Abrir Ajustes", new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.onboarding.RequestPermissionsActivity.onRequestPermissionsResult.1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Callback.onClick_enter(view);
                            try {
                                RequestPermissionsActivity requestPermissionsActivity = RequestPermissionsActivity.this;
                                requestPermissionsActivity.startInstalledAppDetailsActivity(requestPermissionsActivity);
                            } finally {
                                Callback.onClick_exit();
                            }
                        }
                    }, "Salir", new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.onboarding.RequestPermissionsActivity.onRequestPermissionsResult.2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Callback.onClick_enter(view);
                            try {
                            } finally {
                                Callback.onClick_exit();
                            }
                        }
                    }, new DialogInterface.OnDismissListener() { // from class: com.ticnow.sdk.idnowonboarding.onboarding.RequestPermissionsActivity.onRequestPermissionsResult.3
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            RequestPermissionsActivity.this.setCheck3(false);
                            RequestPermissionsActivity.this.setResult(IDStepResponseCodes.STEP_RESULT_PERMISSION_NOT_MET, new Intent());
                            RequestPermissionsActivity.this.finish();
                        }
                    });
                    return;
                }
                if (i4 != 0) {
                    Button button2 = this.buttonContinue;
                    if (button2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("buttonContinue");
                    }
                    button2.setEnabled(true);
                    Dialog.INSTANCE.show(getSupportFragmentManager(), this, "Permisos Denegados", "Uno o varios permisos fueron denegados, recuerde que estos permisos son importantes para el funcionamiento de la aplicación, desea otorgar los permisos?", "Aceptar", new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.onboarding.RequestPermissionsActivity.onRequestPermissionsResult.4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Callback.onClick_enter(view);
                            try {
                                RequestPermissionsActivity.this.checkPermissions();
                            } finally {
                                Callback.onClick_exit();
                            }
                        }
                    }, "Salir", new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.onboarding.RequestPermissionsActivity.onRequestPermissionsResult.5
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Callback.onClick_enter(view);
                            try {
                            } finally {
                                Callback.onClick_exit();
                            }
                        }
                    }, new DialogInterface.OnDismissListener() { // from class: com.ticnow.sdk.idnowonboarding.onboarding.RequestPermissionsActivity.onRequestPermissionsResult.6
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            RequestPermissionsActivity.this.setResult(IDStepResponseCodes.STEP_RESULT_PERMISSION_NOT_MET, new Intent());
                            RequestPermissionsActivity.this.finish();
                        }
                    });
                    return;
                }
                SharedPreference sharedPreference = this.shared;
                if (sharedPreference == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("shared");
                }
                sharedPreference.save("permission", true);
                i3++;
            }
            checkCheckBoxes();
        }
    }

    public final void setCheck1(boolean z2) {
        this.check1 = z2;
    }

    public final void setCheck2(boolean z2) {
        this.check2 = z2;
    }

    public final void setCheck3(boolean z2) {
        this.check3 = z2;
    }
}
