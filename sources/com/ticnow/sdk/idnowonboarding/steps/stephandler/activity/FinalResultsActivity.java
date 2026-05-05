package com.ticnow.sdk.idnowonboarding.steps.stephandler.activity;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.braze.ui.actions.brazeactions.steps.ContainerStep;
import com.ticnow.sdk.idnowonboarding.R;
import com.ticnow.sdk.idnowonboarding.enrollresult.IDEnrollMap;
import com.ticnow.sdk.idnowonboarding.enrollresult.IDEnrollmentStatus;
import com.ticnow.sdk.idnowonboarding.enrollresult.IDNowEnrollmentResult;
import com.ticnow.sdk.idnowonboarding.interfaces.TicnowActivity;
import com.ticnow.sdk.idnowonboarding.model.data.IDNowOnboardingData;
import com.ticnow.sdk.idnowonboarding.model.step.IDNowStep;
import com.ticnow.sdk.idnowonboarding.model.step.IDStepKind;
import com.ticnow.sdk.idnowonboarding.model.step.IDStepReview;
import com.ticnow.sdk.idnowonboarding.steps.helper.IDStepCellProcessor;
import com.ticnow.sdk.idnowonboarding.steps.helper.IDStepProcessor;
import com.ticnow.sdk.idnowonboarding.steps.stephandler.views.CircleImageView;
import com.ticnow.sdk.idnowonboarding.steps.stephandler.views.ResultStepsView;
import com.ticnow.sdk.idnowsecurity.http.nodes.EnrollPath;
import com.ticnow.sdk.idnowsecurity.http.nodes.KeyValue;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1553lQ;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1633zX;
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
import yg.hg;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message tag had invalid wire type.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidWireType(InvalidProtocolBufferException.java:99)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:268)
    	at kotlin.metadata.internal.protobuf.GeneratedMessageLite.parseUnknownField(GeneratedMessageLite.java:73)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:110)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 4 more
    */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {1, 0, 3}, d1 = {"Яd\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00176Ȑ\u0007\":\u0018\u007fјnjO0LeN2ZS@\u000fs{J$c$\bCCU \u0001*\teNogtSb\u000bQ\u0014\u000e\u0016~o4Icxe܈\u00172XoG\u074cUoS9ht<\u0006(288\u0002\u0005\u0007\u001a2H&v\u0003ŏaÈB0nozUҫQ\u0005(\u0012ND.)6\\\u0016w|H5sHY;\u0013yD^'\u000e[+ZuLd)\u001dv\u0010I\nO}5]?a/\u001fR\nl3E\u007fk\u001dj=&YK$]Dr\u0018\u0016+*}\u000f$rnb\u0013\u0001x\fU-\u0016c\u0014V\u001cX\u0010z*>\u0003\u0004V\u00165zF-H\u00108\u0014A(\u000bUVO0\u0013\t\u0012KmD\u0018=\u007fa-\u0010Ә)Ђe;!\u05cb\b\b\u0013\u00106#/rwſ`\u05f8d\u0015#ƘH]?VX=vT`Բiъ\bpj̣z\u001e>N\u00181\u0012\u0010\\\u0019{ڢgޠ'-sȵ`Fm~\u0013i\tUo\\VKr\u0017$CB\u0019\u001c\\Td3y~aA2!O,T5\ff\"vφ\u0004˶%1\u0018ʚgjoz[n*'5xEl?\u0004\u001ckQ^aJ(Ҷ\u001cуV\u0003\u001c̳Td\u000bntYs\u000e`t6;\u0003bx*\u0010}ZM:\u0015\tŴ}ʬ889ǉt\u0017N\u001e,Ka~\u000f{hs`\u0019bP<\u0005\u007f##\u000bWˍhʼss\u0001̢D~f@;Jq7\u001fEc-9@\u000bC\u001f~\"!\u001eш\u000fܤPl\u001e߯&$.82Ia1M\u0013=\u0001W?j3UN\u0003e\u007fOp6Qۧ\u0006ӛ?t6Ԗ lvOn{jQZ;0\n/\r1-|\u0002\u0010`t|\u001eϑ`ߏ_JQͿ\u001b[BtF\u0006%!$L\u000fzݛ\u0001j"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\f/7x$w[R;v7\u001a\u001egh9\u0014-(L\u0006+XP]@&3vF\u0010\u0019G\u000e\\;\u0014\u0014g\u001d\"}HH#\u0017@\u001f", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0002)Fm#/IA;y}\r\u0019fjC\u0019?*]z8K[b\u0002", "u(E", "\"@6", "", "1ta?X5MA(~\u0006B5{\tB", "", "4`R2I0>e", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\f/7x$w[R;v7\u001a\u001egh9\u0014-=Rv9U\u0016,0iPy=w\u001aV\u0010N\u001c\u0011\u0005k\u0017", "4h]._\u001a<]&\u0003\u0004`", "5dc\u0013\\5:Z\u0007|\u0005k0\u0006\u000b", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u0013\\5:Z\u0007|\u0005k0\u0006\u000b", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "7c=<j\u001aMS$\r", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dw[R;v}\u0002sQkKtr,YL", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", "5dc\u0016W\u0015He\u0007\u000ezi:", "u(;7T=:\u001d)\u000e~euX\u0016<a\u0014\u000f\u007fN\u0010l", "Adc\u0016W\u0015He\u0007\u000ezi:", "uKY.i(\bc(\u0003\u0002(\b\n\u0016+yf,\nOVZ\b", "=mQ<T9=W\"\u0001YZ;x", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwL?Jg}\u0002sQkKpl)Xr4FPW.;N\u00029i", "5dc\u001ca)HO&}~g.[\u0005>a", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)!Pl\u00188\u0004$9b\u007fi?w\u0015.T\r:gC\u001a^L@\"\u0011u\u0016Ws1CYM0eTQ9#\u000e0", "Adc\u001ca)HO&}~g.[\u0005>a", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013! Dy\nIu)>[G(Al\u00165\u0017B7z0gxGJC\u0019M5K\u0001#TKR5^1nL\u0010g\u001e~", "AdT1", "5dc X,=", "Adc X,=", "AsPAh:\u001fW\"\u0003\ta", "5dc g(Mc'_~g0\u000b\f", "Adc g(Mc'_~g0\u000b\f", "AsT=6,EZ{~~`/\f", "", "AsT=A(FS'", "5dc g,I<\u0015\u0007zl", "Adc g,I<\u0015\u0007zl", "CtX1G9:\\'zxm0\u0007\u0012", "5dc\"h0=B&z\u0004l(z\u00183o\t", "Adc\"h0=B&z\u0004l(z\u00183o\t", "0tX9W\u001aMS$e~l;", "", "1n]@b3BR\u0015\u000ezL;|\u0014\u001er{,\u0003", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dw[R;v}\u0002sVp9\u0012P,_z'Y\"", "5d]2e(MSy\u0003\u0004b:\u007fh8r\n/\u0003H\u0001 &4o\u001cL}4", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#})Dw\u001d5ZCI{;-^L@\"\u0011u\fW\u00041NSV,ea_=\"\"a\u001d$", "5d]2e(EA\u0017\t\bb5~", "5dc\u0013T*>7!z|^\u0017x\u00182", "5dc\u0014X5>`\u0015\u0006h\\6\n\r8gp,{R", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\f/7x$w[R;v7\u001a\u001egh9\u0014-=Rv9U\u0016;,jbyL\u0002!Z\u0019\\\u001c\u0011\u0005k\u0017", "=m2?X(MS", "A`e2W\u0010Ga(z\u0004\\,j\u0018+t\u007f", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class FinalResultsActivity extends TicnowActivity {
    private HashMap _$_findViewCache;
    private int currentStepIndex;
    private CircleImageView faceView;
    private final String TAG = "FinalResultsActivity";
    private IDNowOnboardingData onboardingData = new IDNowOnboardingData();
    private ArrayList<IDNowStep> idNowSteps = new ArrayList<>();
    private ArrayList<String> stepNames = new ArrayList<>();
    private String finalScoring = "";
    private String seed = "";
    private String statusFinish = "";
    private String uuidTransaction = "";
    private final float stepCellHeight = 70.0f;

    private final void buildStepList() {
        View viewFindViewById = findViewById(R.id.layoutScrollViewContainer);
        if (viewFindViewById == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        LinearLayout linearLayout = (LinearLayout) viewFindViewById;
        linearLayout.addView(getGeneralScoringView());
        int i2 = 1;
        for (IDNowStep iDNowStep : this.idNowSteps) {
            if (iDNowStep.getStepKind() != IDStepKind.finishEnrollment) {
                FinalResultsActivity finalResultsActivity = this;
                ResultStepsView resultStepsView = new ResultStepsView(finalResultsActivity, null);
                if (iDNowStep.getSelected() || iDNowStep.getError() || !iDNowStep.getSuccess()) {
                    resultStepsView.setEstado(ResultStepsView.STATUS.SUCCESS, this.onboardingData.configuration.customization);
                } else {
                    resultStepsView.setEstado(ResultStepsView.STATUS.SUCCESS, this.onboardingData.configuration.customization);
                }
                resultStepsView.setText(iDNowStep.getStepName());
                resultStepsView.setIndex(i2);
                resultStepsView.setScore(Float.parseFloat(iDNowStep.getStepData().getScore()));
                resultStepsView.setLayoutParams(new ActionBar.LayoutParams(-1, IDStepCellProcessor.Companion.calculateDpHeight(finalResultsActivity, this.stepCellHeight)));
                linearLayout.addView(resultStepsView);
                i2++;
            }
        }
    }

    private final ArrayList<IDStepReview> consolidateStepTrail() {
        ArrayList<IDStepReview> arrayList = new ArrayList<>();
        for (IDNowStep iDNowStep : this.idNowSteps) {
            if (iDNowStep.getStepKind() != IDStepKind.finishEnrollment) {
                arrayList.add(iDNowStep.getStepData());
            }
        }
        return arrayList;
    }

    private final IDNowEnrollmentResult generateFinishEnrollmentResult(String str, String str2) {
        IDEnrollMap iDEnrollMap = new IDEnrollMap();
        String str3 = this.finalScoring;
        if (str3 == null) {
            Intrinsics.throwNpe();
        }
        iDEnrollMap.setGeneralScoring(str3);
        iDEnrollMap.setStepTrail(consolidateStepTrail());
        IDNowEnrollmentResult iDNowEnrollmentResult = new IDNowEnrollmentResult();
        iDNowEnrollmentResult.setEnrollMap(iDEnrollMap);
        if (str2 == null) {
            Intrinsics.throwNpe();
        }
        iDNowEnrollmentResult.setSeed(str2);
        String str4 = this.uuidTransaction;
        if (str4 == null) {
            Intrinsics.throwNpe();
        }
        iDNowEnrollmentResult.setUuidTransaction(str4);
        iDNowEnrollmentResult.setEnrollmentStatus(Intrinsics.areEqual(this.statusFinish, "R") ? IDEnrollmentStatus.R : IDEnrollmentStatus.MR);
        return iDNowEnrollmentResult;
    }

    private final String getFaceImagePath() {
        String value = "";
        for (IDNowStep iDNowStep : this.idNowSteps) {
            if (iDNowStep.getStepKind() == IDStepKind.matchEnrollFaceZoom || iDNowStep.getStepKind() == IDStepKind.matchFaceZoom) {
                for (KeyValue keyValue : iDNowStep.getStepData().getMetadata()) {
                    if (Intrinsics.areEqual(keyValue.getKey(), "ID_FACE_PATH")) {
                        value = keyValue.getValue();
                    }
                }
            }
        }
        return value;
    }

    private final ResultStepsView getGeneralScoringView() {
        FinalResultsActivity finalResultsActivity = this;
        ResultStepsView resultStepsView = new ResultStepsView(finalResultsActivity, null);
        TextView index = (TextView) resultStepsView.findViewById(R.id.stepIndex);
        Intrinsics.checkExpressionValueIsNotNull(index, "index");
        index.setWidth(IDStepCellProcessor.Companion.calculateDpHeight(finalResultsActivity, 132.0f));
        resultStepsView.setEstado(ResultStepsView.STATUS.SELECTED, this.onboardingData.configuration.customization);
        resultStepsView.setText("Score Enrolamiento");
        resultStepsView.setIndexScore();
        String str = this.finalScoring;
        if (str == null) {
            Intrinsics.throwNpe();
        }
        resultStepsView.setScore(Float.parseFloat(str));
        resultStepsView.setLayoutParams(new ActionBar.LayoutParams(-1, IDStepCellProcessor.Companion.calculateDpHeight(finalResultsActivity, this.stepCellHeight)));
        return resultStepsView;
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

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        synchronized (C1553lQ.class) {
            String strOd = C1561oA.od("\u0001m3pT", (short) (C1633zX.Xd() ^ ((1079635125 ^ 1293727523) ^ (-222630144))));
            short sXd = (short) (OY.Xd() ^ ((117954170 ^ 1724480745) ^ 1640935380));
            int[] iArr = new int["\fz".length()];
            QB qb = new QB("\fz");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
                i2++;
            }
            String str = new String(iArr, 0, i2);
            try {
                Class<?> cls = Class.forName(strOd);
                Field field = 0 != 0 ? cls.getField(str) : cls.getDeclaredField(str);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strZd = Wg.Zd("P*\u001c\u0012 ", (short) (C1633zX.Xd() ^ (1821510645 ^ (-1821518687))), (short) (C1633zX.Xd() ^ ((1071701767 ^ 1471692333) ^ (-1750662209))));
                short sXd2 = (short) (OY.Xd() ^ ((1107135268 ^ 714522989) ^ 1802180644));
                int[] iArr2 = new int["3!".length()];
                QB qb2 = new QB("3!");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 + i3));
                    i3++;
                }
                String str2 = new String(iArr2, 0, i3);
                try {
                    Class<?> cls2 = Class.forName(strZd);
                    Field field2 = 0 != 0 ? cls2.getField(str2) : cls2.getDeclaredField(str2);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strVd = Wg.vd("jY\u001d\\>", (short) (C1633zX.Xd() ^ ((17479098 ^ 274662499) ^ (-290842437))));
                    short sXd3 = (short) (OY.Xd() ^ (1758601651 ^ 1758600653));
                    short sXd4 = (short) (OY.Xd() ^ (880214221 ^ 880221982));
                    int[] iArr3 = new int["YM".length()];
                    QB qb3 = new QB("YM");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK(((sXd3 + i4) + xuXd3.CK(iKK3)) - sXd4);
                        i4++;
                    }
                    String str3 = new String(iArr3, 0, i4);
                    try {
                        Class<?> cls3 = Class.forName(strVd);
                        Field field3 = 0 != 0 ? cls3.getField(str3) : cls3.getDeclaredField(str3);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        Class<?> cls4 = Class.forName(hg.Vd("P=\u0003L,", (short) (FB.Xd() ^ ((435961536 ^ 843106177) ^ 733781459)), (short) (FB.Xd() ^ ((1146714322 ^ 1251691495) ^ 247606023))));
                        Class<?>[] clsArr = new Class[0];
                        Object[] objArr = new Object[0];
                        short sXd5 = (short) (C1580rY.Xd() ^ (1656291429 ^ (-1656310034)));
                        int[] iArr4 = new int["2=".length()];
                        QB qb4 = new QB("2=");
                        int i5 = 0;
                        while (qb4.YK()) {
                            int iKK4 = qb4.KK();
                            Xu xuXd4 = Xu.Xd(iKK4);
                            iArr4[i5] = xuXd4.fK(sXd5 + i5 + xuXd4.CK(iKK4));
                            i5++;
                        }
                        Method declaredMethod = cls4.getDeclaredMethod(new String(iArr4, 0, i5), clsArr);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                short sXd6 = (short) (Od.Xd() ^ (2085403027 ^ (-2085394746)));
                                int[] iArr5 = new int["\u000f\u0002\b~\u000b\u0014".length()];
                                QB qb5 = new QB("\u000f\u0002\b~\u000b\u0014");
                                int i6 = 0;
                                while (qb5.YK()) {
                                    int iKK5 = qb5.KK();
                                    Xu xuXd5 = Xu.Xd(iKK5);
                                    iArr5[i6] = xuXd5.fK(xuXd5.CK(iKK5) - (sXd6 ^ i6));
                                    i6++;
                                }
                                Object[] objArr2 = {new String(iArr5, 0, i6)};
                                Method method = Class.forName(C1561oA.Yd("HVM\\ZUQ\u001cR__fXbi$:ggn`tq", (short) (FB.Xd() ^ (2087607982 ^ 2087613185)))).getMethod(Jg.Wd("s\u0011ZiJx<e :\bU\u0014;g\"", (short) (C1499aX.Xd() ^ ((283217619 ^ 36471619) ^ (-315455443))), (short) (C1499aX.Xd() ^ (1392152372 ^ (-1392175897)))), Class.forName(Xg.qd("\u0017\u000f%\u0011^\u001e\u0014\"\u001cc\n,+#)#", (short) (Od.Xd() ^ (130576325 ^ (-130549010))), (short) (Od.Xd() ^ ((976128252 ^ 1794399284) ^ (-1356522235))))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    short sXd7 = (short) (FB.Xd() ^ (1328284476 ^ 1328285605));
                                    short sXd8 = (short) (FB.Xd() ^ (1673281020 ^ 1673281534));
                                    int[] iArr6 = new int["|-&\u0014n".length()];
                                    QB qb6 = new QB("|-&\u0014n");
                                    int i7 = 0;
                                    while (qb6.YK()) {
                                        int iKK6 = qb6.KK();
                                        Xu xuXd6 = Xu.Xd(iKK6);
                                        iArr6[i7] = xuXd6.fK(xuXd6.CK(iKK6) - (C1561oA.Xd[i7 % C1561oA.Xd.length] ^ ((i7 * sXd8) + sXd7)));
                                        i7++;
                                    }
                                    String str4 = new String(iArr6, 0, i7);
                                    short sXd9 = (short) (C1580rY.Xd() ^ ((585087086 ^ 82977827) ^ (-640520036)));
                                    short sXd10 = (short) (C1580rY.Xd() ^ ((325654711 ^ 271198823) ^ (-54736354)));
                                    int[] iArr7 = new int["rC".length()];
                                    QB qb7 = new QB("rC");
                                    int i8 = 0;
                                    while (qb7.YK()) {
                                        int iKK7 = qb7.KK();
                                        Xu xuXd7 = Xu.Xd(iKK7);
                                        iArr7[i8] = xuXd7.fK((C1561oA.Xd[i8 % C1561oA.Xd.length] ^ ((sXd9 + sXd9) + (i8 * sXd10))) + xuXd7.CK(iKK7));
                                        i8++;
                                    }
                                    String str5 = new String(iArr7, 0, i8);
                                    try {
                                        Class<?> cls5 = Class.forName(str4);
                                        Field field4 = 0 != 0 ? cls5.getField(str5) : cls5.getDeclaredField(str5);
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
                    String strWd = Ig.wd("6{T*O", (short) (Od.Xd() ^ ((1539424130 ^ 1557358748) ^ (-118670708))));
                    String strOd2 = EO.Od("k(", (short) (C1633zX.Xd() ^ (1712685848 ^ (-1712712645))));
                    try {
                        Class<?> cls6 = Class.forName(strWd);
                        Field field5 = 0 != 0 ? cls6.getField(strOd2) : cls6.getDeclaredField(strOd2);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strQd = C1561oA.Qd("\u001d\nO\rp", (short) (C1499aX.Xd() ^ ((147979836 ^ 2039549406) ^ (-1900079295))));
                        String strZd2 = C1593ug.zd("\u0010\u0006", (short) (C1499aX.Xd() ^ (2144070308 ^ (-2144064410))), (short) (C1499aX.Xd() ^ ((638613723 ^ 1652004187) ^ (-1147663649))));
                        try {
                            Class<?> cls7 = Class.forName(strQd);
                            Field field6 = 0 != 0 ? cls7.getField(strZd2) : cls7.getDeclaredField(strZd2);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i9 = (293938476 ^ 632842206) ^ 876430009;
                        if (x2 > i9 && x2 < displayMetrics.widthPixels - i9 && y2 > i9 && y2 < displayMetrics.heightPixels - i9) {
                            C1553lQ.vd(motionEvent);
                            C1553lQ.Od(motionEvent);
                        }
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final String getFinalScoring() {
        return this.finalScoring;
    }

    public final ArrayList<IDNowStep> getIdNowSteps() {
        return this.idNowSteps;
    }

    public final IDNowOnboardingData getOnboardingData() {
        return this.onboardingData;
    }

    public final String getSeed() {
        return this.seed;
    }

    public final String getStatusFinish() {
        return this.statusFinish;
    }

    public final ArrayList<String> getStepNames() {
        return this.stepNames;
    }

    public final String getUuidTransaction() {
        return this.uuidTransaction;
    }

    @Override // com.ticnow.sdk.idnowonboarding.interfaces.TicnowActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_final_results);
        setRequestedOrientation(1);
        animate();
        try {
            androidx.appcompat.app.ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar == null) {
                Intrinsics.throwNpe();
            }
            supportActionBar.hide();
        } catch (NullPointerException e2) {
            e2.printStackTrace();
        }
        Serializable serializableExtra = getIntent().getSerializableExtra("onboardingdata");
        if (serializableExtra == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.ticnow.sdk.idnowonboarding.model.data.IDNowOnboardingData");
        }
        this.onboardingData = (IDNowOnboardingData) serializableExtra;
        View viewFindViewById = findViewById(R.id.faceView);
        Intrinsics.checkExpressionValueIsNotNull(viewFindViewById, "findViewById(R.id.faceView)");
        this.faceView = (CircleImageView) viewFindViewById;
        IDStepProcessor.Companion companion = IDStepProcessor.Companion;
        EnrollPath enrollPath = this.onboardingData.enrollDefinition;
        Intrinsics.checkExpressionValueIsNotNull(enrollPath, "onboardingData.enrollDefinition");
        this.stepNames = companion.generateStepDataLabels(enrollPath);
        Serializable serializableExtra2 = getIntent().getSerializableExtra(ContainerStep.STEPS);
        if (serializableExtra2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.ArrayList<com.ticnow.sdk.idnowonboarding.model.step.IDNowStep> /* = java.util.ArrayList<com.ticnow.sdk.idnowonboarding.model.step.IDNowStep> */");
        }
        ArrayList<IDNowStep> arrayList = (ArrayList) serializableExtra2;
        this.idNowSteps = arrayList;
        ((IDNowStep) CollectionsKt.first((List) arrayList)).setSelected(true);
        this.currentStepIndex = 0;
        this.finalScoring = getIntent().getStringExtra("finalScoring");
        this.seed = getIntent().getStringExtra("seed");
        this.statusFinish = getIntent().getStringExtra("status");
        this.uuidTransaction = getIntent().getStringExtra("uuidTransaction");
        Intent intent = new Intent();
        intent.putExtra("enrollmentResult", generateFinishEnrollmentResult(this.finalScoring, this.seed));
        setResult(3000, intent);
        finish();
    }

    public final void setFinalScoring(String str) {
        this.finalScoring = str;
    }

    public final void setIdNowSteps(ArrayList<IDNowStep> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "<set-?>");
        this.idNowSteps = arrayList;
    }

    public final void setOnboardingData(IDNowOnboardingData iDNowOnboardingData) {
        Intrinsics.checkParameterIsNotNull(iDNowOnboardingData, "<set-?>");
        this.onboardingData = iDNowOnboardingData;
    }

    public final void setSeed(String str) {
        this.seed = str;
    }

    public final void setStatusFinish(String str) {
        this.statusFinish = str;
    }

    public final void setStepNames(ArrayList<String> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "<set-?>");
        this.stepNames = arrayList;
    }

    public final void setUuidTransaction(String str) {
        this.uuidTransaction = str;
    }
}
