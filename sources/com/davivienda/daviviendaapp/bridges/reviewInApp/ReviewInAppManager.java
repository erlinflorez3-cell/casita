package com.davivienda.daviviendaapp.bridges.reviewInApp;

import android.app.Activity;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewException;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007lmA0RqP\u008cZS8\u000fsڔJř\f$ B{`*\u00020\tgN\u0016hĔNZ\u0019EW\f$\u0002\u0003,w_?qZ\u001d@M\b?aY AGc\r63$x'\t\u0012\u0013\u00042*v\u0014M٠oƚ\u0010\u001e8ϋ\t<X\u0012[\u000b:\u0014\fE.\tnhuNNH\u001b^\u0011ǅ%ɨmBVϋۨ4\n"}, d2 = {"\u001ab^:\"+:d\u001d\u0010~^5{\u0005xd{9\u007fQ\u0005\u0017 Fk\nG\u0002n2f\u0002\u001f9m$wZCLo40xq=D\u0012-\u0019N\b+G^258]}%\u0010\u001bV\u0010N8b", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3h[*@|\u0016A\\ 7y4\u0003\u0011y]!\u0011b<Uv|", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3hY+Bt\u001a,IR?u={\u001fqp9\u001ar\u0002", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1W\r{Bx\u001d2K?Jo>'rrjH\u0007v;$:\u0018", "1`[95(<Y", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW\u001ar,<Vy\u001e=C", "5dc\u0010T3E0\u0015|\u0001", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ\u0014$Kn\u0010<@\u00031`\u0005\u001d3k\u001c\u0004", "Adc\u0010T3E0\u0015|\u0001", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006T!<`z\u001c5skq>", "5dc\u001bT4>", "", "7mXAE,OW\u0019\u0011^g\b\b\u0014", "", "/o_,e,ES\u0015\rz"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ReviewInAppManager extends ReactContextBaseJavaModule {
    public Callback callBack;
    private final ReactApplicationContext reactContext;

    public static /* synthetic */ void $r8$lambda$o8u7IGqUcKhGw4qBml_BavIXEEQ(ReviewManager reviewManager, ReviewInAppManager reviewInAppManager, Task task) throws Throwable {
        Class<?> cls = Class.forName(C1561oA.od("OZW\u0017LH\\NZLGOD@\fA=QCOA<D954BA}1@602/<u9+;-(9\n.\u007f.-i\r\u001f/!\u001c-}\"s\"!|\u0010\u001c\u000e\u0013\u0010\u001c", (short) (C1580rY.Xd() ^ ((1027236248 ^ 764491015) ^ (-279671842)))));
        Class<?>[] clsArr = new Class[FB.Xd() ^ 1609527088];
        clsArr[0] = Class.forName(C1561oA.Kd("\u0011\u001e\u001d^\u0019\"#\u001c\"\u001ce\u001a(\u001f.,'#m1.$=r)6:.w=1C74G~$8J>;N%:H<CBP", (short) (FB.Xd() ^ ((1702002670 ^ 214378148) ^ 1773469712))));
        clsArr[1] = Class.forName(Wg.Zd("+!^\u0012&fz?\f\u0002[\u0018\rs{)@\\Jm[^\"nf1\u001f\u0012\u000e%4]w=y\u001b\u0014\u001f1x&I\u0016\u001e>waX1_m\u0016\u0007\u00067z\u001f\u0015B51KW}\"f/", (short) (C1580rY.Xd() ^ (C1633zX.Xd() ^ (1080301685 ^ 875888826))), (short) (C1580rY.Xd() ^ (1463247663 ^ (-1463222856)))));
        clsArr[(1285996736 ^ 454255397) ^ 1471521767] = Class.forName(C1561oA.Xd("IVU\u0017QZ[TZT\u001eR`Wfd_[&`gn*q_rkt0Wexq", (short) (C1499aX.Xd() ^ (OY.Xd() ^ (-69927793)))));
        Object[] objArr = new Object[C1607wl.Xd() ^ (918929143 ^ 1484893486)];
        objArr[0] = reviewManager;
        objArr[1] = reviewInAppManager;
        objArr[ZN.Xd() ^ 864698098] = task;
        Method declaredMethod = cls.getDeclaredMethod(Wg.vd("/31;\u0014&:,#4\t-z),^B6E962w\u0003", (short) (C1633zX.Xd() ^ (724485800 ^ (-724484591)))), clsArr);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewInAppManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Intrinsics.checkNotNullParameter(reactApplicationContext, Qg.kd("pb]^n<gejZlg", (short) (FB.Xd() ^ (304174046 ^ 304166763)), (short) (FB.Xd() ^ (1210168707 ^ 1210178344))));
        this.reactContext = reactApplicationContext;
    }

    private static final void initReviewInApp$lambda$0(ReviewManager reviewManager, ReviewInAppManager reviewInAppManager, Task task) {
        Intrinsics.checkNotNullParameter(reviewManager, hg.Vd("\u001fgZfX]Zf", (short) (C1499aX.Xd() ^ (C1499aX.Xd() ^ 1134253538)), (short) (C1499aX.Xd() ^ (368499829 ^ (-368499031)))));
        Intrinsics.checkNotNullParameter(reviewInAppManager, C1561oA.ud("'\u001a\u001a#R]", (short) (OY.Xd() ^ ((340760063 ^ 232828598) ^ 430902380))));
        Intrinsics.checkNotNullParameter(task, C1561oA.yd("M;JC", (short) (C1580rY.Xd() ^ (C1580rY.Xd() ^ 831063374))));
        if (task.isSuccessful()) {
            ReviewInfo reviewInfo = (ReviewInfo) task.getResult();
            Activity currentActivity = reviewInAppManager.getCurrentActivity();
            Intrinsics.checkNotNull(currentActivity);
            reviewManager.launchReviewFlow(currentActivity, reviewInfo);
            return;
        }
        Exception exception = task.getException();
        Intrinsics.checkNotNull(exception, C1561oA.Yd(".6./c('568>j.2m21DFrHDuEGG\u0007IQIJ~TZRH\u0004HUT\u0016PYZSYS\u001dQ_Vec^Z%he[t*`mqe/thznk~6[o\u0002ur\u0006T\ttw\u0004\t~\u0006\u0006", (short) (Od.Xd() ^ (1376247647 ^ (-1376247094)))));
        ((ReviewException) exception).getErrorCode();
    }

    public final Callback getCallBack() {
        Callback callback = this.callBack;
        if (callback != null) {
            return callback;
        }
        Intrinsics.throwUninitializedPropertyAccessException(Xg.qd("32>?\u001669B", (short) (ZN.Xd() ^ (C1580rY.Xd() ^ (1987684962 ^ (-1206945541)))), (short) (ZN.Xd() ^ (FB.Xd() ^ (701873248 ^ 1983553276)))));
        return null;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        int iXd = Od.Xd() ^ (-1207825140);
        return Jg.Wd("\u0001tobD>Q^\u0017G+mA8\u000b\u0017|j", (short) (C1580rY.Xd() ^ ((932249538 ^ 685496929) ^ (-525027075))), (short) (C1580rY.Xd() ^ iXd));
    }

    @ReactMethod
    public final void initReviewInApp(Callback callback) throws Throwable {
        int iXd = Od.Xd() ^ (329518264 ^ (-1415158036));
        Intrinsics.checkNotNullParameter(callback, ZO.xd(".\u0012\tym,\n]", (short) (C1633zX.Xd() ^ ((1445109863 ^ 1697847303) ^ (-856802756))), (short) (C1633zX.Xd() ^ iXd)));
        final ReviewManager reviewManagerCreate = ReviewManagerFactory.create(this.reactContext);
        int iXd2 = ZN.Xd() ^ (1975653619 ^ (-1179145357));
        short sXd = (short) (C1580rY.Xd() ^ (358567526 ^ (-358559998)));
        short sXd2 = (short) (C1580rY.Xd() ^ iXd2);
        int[] iArr = new int[",%Crvt\u000bau\rc".length()];
        QB qb = new QB(",%Crvt\u000bau\rc");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        Intrinsics.checkNotNullExpressionValue(reviewManagerCreate, new String(iArr, 0, i2));
        Task<ReviewInfo> taskRequestReviewFlow = reviewManagerCreate.requestReviewFlow();
        Intrinsics.checkNotNullExpressionValue(taskRequestReviewFlow, Ig.wd(")N\r)p!FL\u0014\u0016\u0007h'w:$R\u0019W/s+", (short) (C1580rY.Xd() ^ (FB.Xd() ^ (1853622587 ^ (-831750030))))));
        taskRequestReviewFlow.addOnCompleteListener(new OnCompleteListener() { // from class: com.davivienda.daviviendaapp.bridges.reviewInApp.ReviewInAppManager$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) throws Throwable {
                ReviewInAppManager.$r8$lambda$o8u7IGqUcKhGw4qBml_BavIXEEQ(reviewManagerCreate, this, task);
            }
        });
    }

    public final void setCallBack(Callback callback) {
        Intrinsics.checkNotNullParameter(callback, EO.Od("lKo&7\u0017a", (short) (ZN.Xd() ^ ((1344092237 ^ 646248369) ^ 1989786073))));
        this.callBack = callback;
    }
}
