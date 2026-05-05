package com.facebook.react.modules.accessibilityinfo;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.fbreact.specs.NativeAccessibilityInfoSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.module.annotations.ReactModule;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@ReactModule(name = "\u0001\"!\"/.#\u001b!#\u001f)-{ \u0017\u001f")
@Metadata(bv = {}, d1 = {"Яb\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\"2\u0012\u007f\u0007|jAӄLe^.Zݷ2\u000fy\u0005<řc$\bCC٥\"}8\tWNmhvJh\u0011K\u000f\f\u0017\u0001jBI]ތe\u0012\u001d2JģG3[{E9ft>\u0005.6*\u0600\u0002\u0005\u0017\u001a2H\u0016\u0007\u0001HaÈ0]pphQ=M3\u001aJ\u0007kN0^gwRDI\u0005]h1ݭ\u0007iPQoo>\u0013e\rtkW\u0013\u0005y6-V6c.kgK\u001d`uW\u0003m\tm\tvB?+w\u0010\b:f\u001d,\u0015YmSq;,j$i`:>qc,Q^.@w)\u0013SPL\u001c\u0014H`.[1\u0017\f\u001cP\rr\u0002^\u0017\u0016'P\u000e\u001dy6E<079V3f\u007f\u007f\u0002-\u0017E\n(%\u001eQ\u0018\u001f%iq&`C9\u001b\f\u001a7_dUH|! Q6\n~\b\u001a*2G\u000e\u0015w\u0002\u001fT/%er\u007f8iy\u0010o\\g%\u001c\u0011la\u0012jHn>5*\u007f8\u00175rD\u0013\u001c\u001cTb\u0003D\u0011{%\u001b\u0007F\u000e!Ktwj8k\u0010\u0017]v\u0016\u0003M\f!U3taqn\u001a\u0017\u001e9/ACU{\u0012wQ%\u0019\u0016ֽdۖ\\fJͭ\\jj.:6vq`w*ͩ%ۿ\u0015\u0558Cq$ع|='d-H1'\u0019ˉ\tȤcZpɭO`A.\u001biR\u007f_əRʷtooծ\u001a8\u000bl:-o^\fӪ(Ɓ&h<ês\u0019\r\u0002\u0018G\u0016U}\u000eCָwʀ\u007f$.\u001c?_=Lc\u001b\r9J\u0002[V#Ǭq˛Q\u0012/ϕM\u0006\u001dM\u0001.\u0016\u0011AѴ8߯nJWܷg.\u0005q\u000b#6mVכmâ~GkҺ[kL]\u000b\u0007\bQ\u001f8+þuǊ'˽s\"\u0005ކԯGW"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006r#3Y\f.;j\u001a5QROo=\u001f\u001f2=7\u0005c:\\z$KSR;p6{>\u001eyd\r^2\rZ", "\u001ab^:\"-:Q\u0019{\u0005h2F\n,r\u007f$yOJ%\"Gm\u001c\u0006_!D]\u000f \u0013k\u0014.[Q?h8%\u0019wu\u001d\u0010d6<\u0002'E\"", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW#z&5W\u0012\u001e>mu?MLJR8,$hj9\u00149", "1n]AX?M", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3hY+Bt\u001a,IR?u={\u001fqp9\u001ar\u0002", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1W\r{Bx\u001d2K?Jo>'rrjH\u0007v;$:\u0018", "/bR2f:BP\u001d\u0006~m@d\u00058a\u0002(\t", "\u001a`]1e6BRb\u0010~^>F\u0005-c\u007f6\nD}\u001b\u001eK~\"\u0006R#3Y\f.;j\u001a5QROS0'\u0011jaF\\", "/bR2f:BP\u001d\u0006~m@j\t<v\u0004&{\u001e\u0004\u0013 Iot@\u000545b}-", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006r#3Y\f.;j\u001a5QROo=\u001f\u001f2=7\u0005c:\\z$KSR;p6{>\u001eyd\r^2\rCFA lS\u0013\u001d\u0006,W\u0010?e\u0005\u0013\u001a\u001dIXpOg\u0014Eyrx=2jF@c\bVANb7:", "/bR2f:BP\u001d\u0006~m@j\t<v\u0004&{ \n\u0013\u0014No\r", "", "/mX:T;B]\"lxZ3|r,s\u007f5\r@\u000e", "\u001a`]1e6BRb}vm(y\u0005=eI\u0006\u0006I\u0010\u0017 VY\u000bJv2FY\u000bu", "1n]AX5M@\u0019\r\u0005e=|\u0016", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001 &4o\u001cF}65fS", "7rA2W<<S\u0001\t\nb6\u0006h8a|/{?q\u0013\u001eWo", "u(I", "@dR<`4>\\\u0018~yM0\u0005\t9u\u000f", "", "@dSBV,&](\u0003\u0005g\f\u0006\u0005,l\u007f'", "Bnd0[\fQ^ \t\bZ;\u0001\u00138E\t$xG\u0001\u0016", "Bnd0[\fQ^ \t\bZ;\u0001\u00138S\u000f$\u000b@^\u001a\u0013Pq\u000e#z3DY\u0007 D", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006r#3Y\f.;j\u001a5QROo=\u001f\u001f2=7\u0005c:\\z$KSR;p6{>\u001eyd\r^2\rCFA lS&)\u0018*LaNs\b\u0016#\nDnzKD\u001fC\t\u0015SD%qHYF}UPEk*qa", "/m]<h5<Sy\t\b:*z\t=s\u0004%\u007fG\u0005&+", "", ";db@T.>", "", "5dc\u001fX*H[!~\u0004],{w3m\u007f2\fOh\u001b\u001eNs\u001c", "=qX4\\5:Z\b\u0003\u0003^6\r\u0018", "", "AtR0X:L1\u0015\u0006\u0002[(z\u000f", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW\u001ar,<Vy\u001e=C", "7mXA\\(EW.~", "7me._0=O(~", "7r00V,La\u001d{~e0\f\u001d\u001de\r9\u007f>\u0001v Cl\u0015<u", "7rA2W<<S\u0001\t\nb6\u0006h8a|/{?", "7rC<h*A3,\n\u0002h9x\u00183o\t\b\u0005<}\u001e\u0017F", "=m7<f;\u001dS'\u000e\bh@", "=m7<f;)O)\rz", "=m7<f;+S'\u000f\u0003^", "Adc\u000eV*>a'\u0003wb3\u0001\u0018CF\n&\fN", "@dP0g\u001b:U", "CoS.g,\u001a\\\u0018lzg+X\u0007-e\u000e6\u007f=\u0005\u001e\u001bV\u0004{<\u000469W}}:i\u001f0M#Lk=-", "3mP/_,=", "CoS.g,\u001a\\\u0018lzg+i\t.u}(cJ\u0010\u001b!PM\u00118\u007f'59\u000f @|", "CoS.g,\u001a\\\u0018lzg+k\u0013?c\u0003\b\u000fK\b!$C~\u0012F\u007f\u00038U\u0007\"7M'.VR", "\u0011n\\=T5B]\"", " dP0g\b<Q\u0019\r\tb)\u0001\u00103t\u0014\u0016{M\u0012\u001b\u0015GM\u00118\u007f'5@\u0002.Fm\u001f.Z", " dP0g\u001bHc\u0017\u0002Zq7\u0004\u0013<a\u000f,\u0006In&\u0013Vok?r.7Yd$E|\u00167MP", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class AccessibilityInfoModule extends NativeAccessibilityInfoSpec implements LifecycleEventListener {
    private static final String ACCESSIBILITY_SERVICE_EVENT_NAME = "accessibilityServiceDidChange";
    private static final Companion Companion = new Companion(null);
    private static final String REDUCE_MOTION_EVENT_NAME = "reduceMotionDidChange";
    private static final String TOUCH_EXPLORATION_EVENT_NAME = "touchExplorationDidChange";
    private final AccessibilityManager accessibilityManager;
    private final ReactAccessibilityServiceChangeListener accessibilityServiceChangeListener;
    private boolean accessibilityServiceEnabled;
    private final ContentObserver animationScaleObserver;
    private final ContentResolver contentResolver;
    private int recommendedTimeout;
    private boolean reduceMotionEnabled;
    private boolean touchExplorationEnabled;
    private final ReactTouchExplorationStateChangeListener touchExplorationStateChangeListener;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005#2ߝx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԅt\u07beSNo˧?Vh\u000e[\u000f4\u0018O̖~֒Yxe܈_>PsW3{q\u0014ʣ3ҽ:\u0005(݅ś<~"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006r#3Y\f.;j\u001a5QROo=\u001f\u001f2=7\u0005c:\\z$KSR;p6{>\u001eyd\r^2\rC7K,y@@#\u00125\u001f", "", "u(E", "\u000fB2\u0012F\u001a\"0|e^M vv\u000fRp\fY zv\b'X|6_\u0001\u001d9", "", " D3\"6\f8;\u0003m^H\u0015vh Eh\u0017u)\\~v", "\"ND\u0010;&\u001eF\u0004edK\bkl\u0019Ny\bl i\u0006\u00110Ku\u001c", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u0016DLcz\u0004I\u0006>\u000b6Ȑ\u0007\":\u001b\u007fјlʕ;FǏ\u0016H\\Q\u0014-Ƃo{B$$2\u007fDSUH\u007fR\r]Q\u007fg\u001dN!\u001få\u0013\u000b"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006r#3Y\f.;j\u001a5QROo=\u001f\u001f2=7\u0005c:\\z$KSR;p6{>\u001eyd\r^2\rCFA lS\u0013\u001d\u0006,W\u0010?e\u0005\u0013\u001a\u001dIXpOg\u0014Eyrx=2jF@c\bVANb7:", "\u001a`]1e6BRb\u0010~^>F\u0005-c\u007f6\nD}\u001b\u001eK~\"\u0006R#3Y\f.;j\u001a5QROS0'\u0011jaFE?*Lv5UPK0cV\u0002Q\u0002!V\u001dN\t\u0010\u0001bC$UHE.\b5I\u000f\u0011", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n\t!\u0016Wv\u000eJ@!3W}.Eq\u00132TGJ\u007f8'\u0016r+\u0015\u0005a,\\\u0005+DPU0kfVF\u0015\u001cB\u0018M;\u0014\u0005/\u0005\u0015", "=m00V,La\u001d{~e0\f\u001d\u001dt{7{\u001e\u0004\u0013 Io\r", "", "3mP/_,=", "", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private final class ReactAccessibilityServiceChangeListener implements AccessibilityManager.AccessibilityStateChangeListener {
        public ReactAccessibilityServiceChangeListener() {
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public void onAccessibilityStateChanged(boolean z2) {
            AccessibilityInfoModule.this.updateAndSendAccessibilityServiceChangeEvent(z2);
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u0016DLcz\u0004I\u0006>\u000b6Ȑ\u0007\":\u001b\u007fјlʕ;FǏ\u0016H\\Q\u0014-Ƃo{B$$2\u007fDSUH\u007fR\r]Q\u007fg\u001dN!\u001få\u0013\u000b"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006r#3Y\f.;j\u001a5QROo=\u001f\u001f2=7\u0005c:\\z$KSR;p6{>\u001eyd\r^2\rCFA lS&)\u0018*LaNs\b\u0016#\nDnzKD\u001fC\t\u0015SD%qHYF}UPEk*qa", "\u001a`]1e6BRb\u0010~^>F\u0005-c\u007f6\nD}\u001b\u001eK~\"\u0006R#3Y\f.;j\u001a5QROS0'\u0011jaFER6^t*'_Y3f_nL\u0018\u001cc{]'\u001c\u00057D wF7\u0006\f:X\u0002Dh\u000ea", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n\t!\u0016Wv\u000eJ@!3W}.Eq\u00132TGJ\u007f8'\u0016r+\u0015\u0005a,\\\u0005+DPU0kfVF\u0015\u001cB\u0018M;\u0014\u0005/\u0005\u0015", "=mC<h*A3,\n\u0002h9x\u00183o\t\u0016\u000b<\u0010\u0017tJk\u0017>v$", "", "3mP/_,=", "", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private final class ReactTouchExplorationStateChangeListener implements AccessibilityManager.TouchExplorationStateChangeListener {
        public ReactTouchExplorationStateChangeListener() {
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z2) {
            AccessibilityInfoModule.this.updateAndSendTouchExplorationChangeEvent(z2);
        }
    }

    public AccessibilityInfoModule(ReactApplicationContext reactApplicationContext) throws Throwable {
        short sXd = (short) (ZN.Xd() ^ 523);
        int[] iArr = new int["wVW\u0006\u0017N.".length()];
        QB qb = new QB("wVW\u0006\u0017N.");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        Intrinsics.checkNotNullParameter(reactApplicationContext, new String(iArr, 0, i2));
        super(reactApplicationContext);
        final Handler uiThreadHandler = UiThreadUtil.getUiThreadHandler();
        this.animationScaleObserver = new ContentObserver(uiThreadHandler) { // from class: com.facebook.react.modules.accessibilityinfo.AccessibilityInfoModule$animationScaleObserver$1
            @Override // android.database.ContentObserver
            public void onChange(boolean z2) {
                onChange(z2, null);
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z2, Uri uri) {
                if (this.this$0.getReactApplicationContext().hasActiveReactInstance()) {
                    this.this$0.updateAndSendReduceMotionChangeEvent();
                }
            }
        };
        this.touchExplorationStateChangeListener = new ReactTouchExplorationStateChangeListener();
        this.accessibilityServiceChangeListener = new ReactAccessibilityServiceChangeListener();
        Context applicationContext = reactApplicationContext.getApplicationContext();
        String strQd = C1561oA.Qd(":;:;HG<4:<8BF", (short) (C1633zX.Xd() ^ (-501)));
        Class<?> cls = Class.forName(C1593ug.zd("+90?=84~5BBI;EL\u0007\u001dJJQCWT", (short) (C1499aX.Xd() ^ (-7174)), (short) (C1499aX.Xd() ^ (-15505))));
        Class<?>[] clsArr = {Class.forName(C1561oA.od("[QeO\u001bXLXP\u0016:ZWMQI", (short) (ZN.Xd() ^ TypedValues.TransitionType.TYPE_TO)))};
        Object[] objArr = {strQd};
        short sXd2 = (short) (C1633zX.Xd() ^ (-22309));
        int[] iArr2 = new int["UTdDkfhZcJ]kpd_b".length()];
        QB qb2 = new QB("UTdDkfhZcJ]kpd_b");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd2 + sXd2) + i3));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            Object objInvoke = method.invoke(applicationContext, objArr);
            Intrinsics.checkNotNull(objInvoke, Wg.Zd(":\u0014\\/,B\u0012q;\u0011geqGSiQ6\u0007\u0005#pr\u0014^0@V'pBH\u0007]'kp\u0004c+\u0004R\u001fk\u0002\u001ca/,4:\u000eX*\u000b\\\u001dgA\u0016]<\u0014\u001a\u0017\f]2\n\\\"m>\u0014b@\u000f5\u001b|Y2\u0002a", (short) (ZN.Xd() ^ 32451), (short) (ZN.Xd() ^ 14737)));
            AccessibilityManager accessibilityManager = (AccessibilityManager) objInvoke;
            this.accessibilityManager = accessibilityManager;
            ContentResolver contentResolver = getReactApplicationContext().getContentResolver();
            Intrinsics.checkNotNullExpressionValue(contentResolver, C1561oA.Xd("<;K\u001bHHOAKR1ETQOZJX\u000f\u0016\u0017\u0018\u0014", (short) (OY.Xd() ^ 26524)));
            this.contentResolver = contentResolver;
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(Wg.vd("v\u0005{\u000b\t\u0004\u007fJ\u0014\b\u0005\u0018O\u0004\u0007\bjyzqkswu\u0002\b=Qtux\bh_YaecouJ_mahgu", (short) (FB.Xd() ^ 8828))).getMethod(Qg.kd(";D$>C04\u0010B9468&8,1/\u0005-\u001f\u001f( \u001e", (short) (FB.Xd() ^ 4052), (short) (FB.Xd() ^ 10456)), new Class[0]);
            try {
                method2.setAccessible(true);
                this.touchExplorationEnabled = ((Boolean) method2.invoke(accessibilityManager, objArr2)).booleanValue();
                short sXd3 = (short) (ZN.Xd() ^ 4714);
                short sXd4 = (short) (ZN.Xd() ^ 10473);
                int[] iArr3 = new int["(4)62+%m5'\"3h\u001b\u001c\u001b\u001c)(\u001d\u0015\u001b\u001d\u0019#'Zl\u000e\r\u000e\u001b\u001a\u000f\u0007\r\u000f\u000b\u0015\u0019k~\u000b|\u0002~\u000b".length()];
                QB qb3 = new QB("(4)62+%m5'\"3h\u001b\u001c\u001b\u001c)(\u001d\u0015\u001b\u001d\u0019#'Zl\u000e\r\u000e\u001b\u001a\u000f\u0007\r\u000f\u000b\u0015\u0019k~\u000b|\u0002~\u000b");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(sXd3 + i4 + xuXd3.CK(iKK3) + sXd4);
                    i4++;
                }
                Object[] objArr3 = new Object[0];
                Method method3 = Class.forName(new String(iArr3, 0, i4)).getMethod(C1561oA.ud("\u0002\u000b[\u0004uu~vt", (short) (FB.Xd() ^ 10730)), new Class[0]);
                try {
                    method3.setAccessible(true);
                    this.accessibilityServiceEnabled = ((Boolean) method3.invoke(accessibilityManager, objArr3)).booleanValue();
                    this.reduceMotionEnabled = isReduceMotionEnabledValue();
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    private final boolean isReduceMotionEnabledValue() {
        String string = Settings.Global.getString(this.contentResolver, "transition_animation_scale");
        return (string != null ? Float.parseFloat(string) : 1.0f) == 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAndSendAccessibilityServiceChangeEvent(boolean z2) {
        if (this.accessibilityServiceEnabled != z2) {
            this.accessibilityServiceEnabled = z2;
            if (getReactApplicationContextIfActiveOrWarn() != null) {
                getReactApplicationContext().emitDeviceEvent(ACCESSIBILITY_SERVICE_EVENT_NAME, Boolean.valueOf(this.accessibilityServiceEnabled));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAndSendReduceMotionChangeEvent() {
        boolean zIsReduceMotionEnabledValue = isReduceMotionEnabledValue();
        if (this.reduceMotionEnabled != zIsReduceMotionEnabledValue) {
            this.reduceMotionEnabled = zIsReduceMotionEnabledValue;
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
            if (reactApplicationContextIfActiveOrWarn != null) {
                reactApplicationContextIfActiveOrWarn.emitDeviceEvent(REDUCE_MOTION_EVENT_NAME, Boolean.valueOf(this.reduceMotionEnabled));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAndSendTouchExplorationChangeEvent(boolean z2) {
        if (this.touchExplorationEnabled != z2) {
            this.touchExplorationEnabled = z2;
            if (getReactApplicationContextIfActiveOrWarn() != null) {
                getReactApplicationContext().emitDeviceEvent(TOUCH_EXPLORATION_EVENT_NAME, Boolean.valueOf(this.touchExplorationEnabled));
            }
        }
    }

    @Override // com.facebook.fbreact.specs.NativeAccessibilityInfoSpec
    public void announceForAccessibility(String str) throws Throwable {
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null) {
            short sXd = (short) (C1633zX.Xd() ^ (-7301));
            int[] iArr = new int["\u0005\u0013\n\u0019\u0017\u0012\u000eX\"\u0016\u0013&]\u0012\u0015\u0016x\b\t\u007fy\u0002\u0006\u0004\u0010\u0016K_\u0003\u0004\u0007\u0016vmgosq}\u0004Xm{ovu\u0004".length()];
            QB qb = new QB("\u0005\u0013\n\u0019\u0017\u0012\u000eX\"\u0016\u0013&]\u0012\u0015\u0016x\b\t\u007fy\u0002\u0006\u0004\u0010\u0016K_\u0003\u0004\u0007\u0016vmgosq}\u0004Xm{ovu\u0004");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
                i2++;
            }
            Object[] objArr = new Object[0];
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.Yd("\u0016!s\u001e\u0012\u0014\u001f\u0019\u0019", (short) (C1607wl.Xd() ^ 2527)), new Class[0]);
            try {
                method.setAccessible(true);
                if (((Boolean) method.invoke(accessibilityManager, objArr)).booleanValue()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(16384);
                    accessibilityEventObtain.getText().add(str);
                    accessibilityEventObtain.setClassName(Xg.qd("jwv8qmpsq\u007f\u0001}A\u0007zwz\rG\b\u000b\u0001\u0013\u000b\u0005\u0014O\u0004\u0007\b\u000b\u001a\u001b\u0012\f\u0014\u0018\u0016\"(\u0019\u001f\u0018\"au\u0019\u001a\u001d,-$\u001e&*(4:\u000b1*4\u00136,>60", (short) (C1499aX.Xd() ^ (-22795)), (short) (C1499aX.Xd() ^ (-7435))));
                    accessibilityEventObtain.setPackageName(getReactApplicationContext().getPackageName());
                    AccessibilityManager accessibilityManager2 = this.accessibilityManager;
                    Object[] objArr2 = {accessibilityEventObtain};
                    Method method2 = Class.forName(Jg.Wd("\u0012\r42pZ\u0007@J+XZRu)\u0019LHy_\u001a\u0011E2~qWZ>.a_0W>vy(#Y-rm\u0012\u0018GD", (short) (C1607wl.Xd() ^ 10141), (short) (C1607wl.Xd() ^ 27544))).getMethod(C1626yg.Ud("\u0010\u001eP~\u000e\fT7\u0015xEXFS\fY\rN\u0010 Qz", (short) (C1607wl.Xd() ^ 1939), (short) (C1607wl.Xd() ^ 6010)), Class.forName(ZO.xd("\u0019wTUEr}\\t\u0017\u001c}o'\u0007\u001aR9t[Cj\u000bKb\bsL\u0019K\u0001F8\u001bV\u0015k3 \"\u0001e\u0012(8", (short) (C1633zX.Xd() ^ (-11672)), (short) (C1633zX.Xd() ^ (-16759)))));
                    try {
                        method2.setAccessible(true);
                        method2.invoke(accessibilityManager2, objArr2);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
    }

    @Override // com.facebook.fbreact.specs.NativeAccessibilityInfoSpec
    public void getRecommendedTimeoutMillis(double d2, Callback callback) throws Throwable {
        int iIntValue;
        Intrinsics.checkNotNullParameter(callback, Ig.wd("}WWr\u0016_7vB`fvCO;", (short) (C1633zX.Xd() ^ (-1268))));
        if (Build.VERSION.SDK_INT < 29) {
            callback.invoke(Integer.valueOf((int) d2));
            return;
        }
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null) {
            Class<?> cls = Class.forName(EO.Od("wU\u001b\u000f\u001dlAdtxx#%`d\u007f_Q\u001b\u0017g\u0018+.p({@\u000f\u001e:c\u000e')k]4`U#\"\u0002`\u0017\u0007Z", (short) (C1580rY.Xd() ^ (-26257))));
            Class<?>[] clsArr = {Integer.TYPE, Integer.TYPE};
            Object[] objArr = {Integer.valueOf((int) d2), 4};
            short sXd = (short) (C1607wl.Xd() ^ 9048);
            int[] iArr = new int["<9G$63>;:19..,\u001b/2)275\r(*)%.".length()];
            QB qb = new QB("<9G$63>;:19..,\u001b/2)275\r(*)%.");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                iIntValue = ((Integer) method.invoke(accessibilityManager, objArr)).intValue();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } else {
            iIntValue = 0;
        }
        this.recommendedTimeout = iIntValue;
        callback.invoke(Integer.valueOf(iIntValue));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0051  */
    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void initialize() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.accessibilityinfo.AccessibilityInfoModule.initialize():void");
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        getReactApplicationContext().removeLifecycleEventListener(this);
        super.invalidate();
    }

    @Override // com.facebook.fbreact.specs.NativeAccessibilityInfoSpec
    public void isAccessibilityServiceEnabled(Callback successCallback) {
        Intrinsics.checkNotNullParameter(successCallback, "successCallback");
        successCallback.invoke(Boolean.valueOf(this.accessibilityServiceEnabled));
    }

    @Override // com.facebook.fbreact.specs.NativeAccessibilityInfoSpec
    public void isReduceMotionEnabled(Callback successCallback) {
        Intrinsics.checkNotNullParameter(successCallback, "successCallback");
        successCallback.invoke(Boolean.valueOf(this.reduceMotionEnabled));
    }

    @Override // com.facebook.fbreact.specs.NativeAccessibilityInfoSpec
    public void isTouchExplorationEnabled(Callback successCallback) {
        Intrinsics.checkNotNullParameter(successCallback, "successCallback");
        successCallback.invoke(Boolean.valueOf(this.touchExplorationEnabled));
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() throws Throwable {
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null) {
            ReactTouchExplorationStateChangeListener reactTouchExplorationStateChangeListener = this.touchExplorationStateChangeListener;
            Class<?> cls = Class.forName(C1561oA.Xd("?MDSQLH\u0013\\PM`\u0018LOPSbcZT\\`^jp&:]^apqhbjnlx~Shvjqp~", (short) (OY.Xd() ^ 18261)));
            Class<?>[] clsArr = new Class[1];
            short sXd = (short) (C1633zX.Xd() ^ (-31688));
            int[] iArr = new int[".<3B83/y;/,?n#&'BQRI;CGEIO\u0005\u0019458G`WQYUS_e2GUIHGU\bQmtca?slaeiYe[bb`\u0003p\u0005nMsmsmlTjuwi\f\u0004\u0012".length()];
            QB qb = new QB(".<3B83/y;/,?n#&'BQRI;CGEIO\u0005\u0019458G`WQYUS_e2GUIHGU\bQmtca?slaeiYe[bb`\u0003p\u0005nMsmsmlTjuwi\f\u0004\u0012");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            Object[] objArr = {reactTouchExplorationStateChangeListener};
            Method method = cls.getMethod(Qg.kd("VHOPVD2LQ>B\u001ePGBDF4F:?=!A-?/\f0(4,)\u000f+44$,\".", (short) (FB.Xd() ^ 2341), (short) (FB.Xd() ^ 25856)), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(accessibilityManager, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        AccessibilityManager accessibilityManager2 = this.accessibilityManager;
        if (accessibilityManager2 != null) {
            ReactAccessibilityServiceChangeListener reactAccessibilityServiceChangeListener = this.accessibilityServiceChangeListener;
            Class<?> cls2 = Class.forName(hg.Vd("\u0014 \u0015\"\u001e\u0017\u0011Y!\u0013\u000e\u001fT\u0007\b\u0007\b\u0015\u0014\t\u0001\u0007\t\u0005\u000f\u0013FXyxy\u0007\u0006zrxzv\u0001\u0005Wjvhmjv", (short) (C1499aX.Xd() ^ (-31020)), (short) (C1499aX.Xd() ^ (-9928))));
            Class<?>[] clsArr2 = {Class.forName(C1561oA.ud("HTIVRKE\u000eUGBS\t;<;<IH=5;=9CGz\r.-.;:/'-/+59\f\u001f+\u001d\"\u001f+[w\u0019\u0018\u0019&%\u001a\u0012\u0018\u001a\u0016 $|\u001d\t\u001b\u000bg\f\u0004\u0010\b\u0005j\u0007\u0010\u0010\u007f\b}\n", (short) (OY.Xd() ^ 31705)))};
            Object[] objArr2 = {reactAccessibilityServiceChangeListener};
            short sXd2 = (short) (ZN.Xd() ^ 20727);
            int[] iArr2 = new int["WIPQWE APQ^]RJPR^hlEeQcS@d\\h`]C_xxhpfr".length()];
            QB qb2 = new QB("WIPQWE APQ^]RJPR^hlEeQcS@d\\h`]C_xxhpfr");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 ^ i3));
                i3++;
            }
            Method method2 = cls2.getMethod(new String(iArr2, 0, i3), clsArr2);
            try {
                method2.setAccessible(true);
                method2.invoke(accessibilityManager2, objArr2);
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        this.contentResolver.unregisterContentObserver(this.animationScaleObserver);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x016b  */
    @Override // com.facebook.react.bridge.LifecycleEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onHostResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.accessibilityinfo.AccessibilityInfoModule.onHostResume():void");
    }

    @Override // com.facebook.fbreact.specs.NativeAccessibilityInfoSpec
    public void setAccessibilityFocus(double d2) {
    }
}
