package com.facebook.react.modules.permissions;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.util.SparseArray;
import com.facebook.common.logging.FLog;
import com.facebook.fbreact.specs.NativePermissionsAndroidSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.PermissionAwareActivity;
import com.facebook.react.modules.core.PermissionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
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
import yg.Xu;
import yg.ZN;
import yg.ZO;

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
@ReactModule(name = "\u0010$0*%.-\"'%)u\"\u0017$ \u0019\u0013")
@Metadata(bv = {}, d1 = {"Яb\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\"2\u0012\u007f\u0007tvA0JfP.hS2\u000f\u0002{<řc$\bCCU ~*\t]To˧vJh\u000bK\u000f\f\u0016\u0001jBI]ތe\u0012\u001d;JģG3[~EʠhtD\u0018(2(8\u0002\u0005\u0017\u001a2H\u0016x\u0001HaÈ0QpphQ=M3\u001aJ\u0005_`\u000e.buONJ\u0003\\h1ݭ\u0007iPQou>\u000ee\rtfW\u0011\u0005t6+n<e\u00193g\u001b\u0007\u0001p\u0006\u0017\b\u001bK\u001b\u0001'UByweEp\u007fB%[Y\u001bu\u000b,l\u0007a`:,Yh\u0014O^(@w)\u0017SPǬ\u0012\u00065dvC(\u0004 \u000ea\u0007#WNh\u001a^p\u001e+eD+=\u007fa@\u007f//goZ1Ne\u000e5\u0011,6\u0019nO`\u0005\u0012n)3T&fwe\tSVn\"Yk\u007f4tp\u0015B\u0004^L03\n%F\u0017SL\"Ms-y\u0006`D\u0016{[\u009e+רmRPؗrz$=B\t:_\u001bߢG\u07fbTT`\u008caY*[\u001f}6\u0018vς:˶%%\u0018ʚ zwrec\u001a'?fec\u001dtdæ;ӷ75Yү`s`\u0002,?jn;\u0019=̾U۱^`@$8Ux\u001eH\bR]$\u0013`OHʌ@Ϝ5\u0019déȦ\u0007@"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006\u0002%Ba\u0002.Eq 7[\r&kA&\u0019vo=\u0011l:6\u0001&WSN\u0002", "\u001ab^:\"-:Q\u0019{\u0005h2F\n,r\u007f$yOJ%\"Gm\u001c\u0006_!D]\u000f \"m#6QQIo>'#Dj8\u0014m0Md2GJ$", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006t/BYG\u000b7z\u001e2[Q?u=\u0005\u0019vp9\u0010c9$", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3hY+Bt\u001a,IR?u={\u001fqp9\u001ar\u0002", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1W\r{Bx\u001d2K?Jo>'rrjH\u0007v;$:\u0018", "\u0012D=\u00168\u000b", "", "\u0015Q0\u001bG\f\u001d", "\u001cDE\u0012E&\u001aA~xV@\b`q", "1`[9U(<Y'", "\u001a`]1e6BRb\u000f\nb3Fv:a\r6{\u001c\u000e$\u0013[E", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW\u001ar,<Vy\u001e=C", ">da:\\:LW#\bVp(\n\t\u000bc\u000f,\rD\u0010+", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006t/BYG\u000b7z\u001e2[Q?u=y'dn9ba;R\b+V`$", "5dc\u001dX9FW'\r~h5X\u001b+r\u007f\u0004yO\u0005(\u001bV\u0004", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ\u001f!F\u007f\u0015<\u0005n3c\u000b \u0001X\u0016;UGIy8(\u001eDs5\u0014c\bL\u0006+XP]@2", "@d`BX:M1#}z", "", "1gT0^\u0017>`!\u0003\tl0\u0007\u0012", "", ">da:\\:LW#\b", ">q^:\\:>", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW'\u0004/=]\f \r", "=mA2d<>a(izk4\u0001\u0017=i\n1\n-\u0001%'N~", "", ">da:\\:LW#\b\t", "", "5qP;g\u0019>a)\u0006\nl", "", "uHJ\u0019](OOb\u0006vg.Fv>r\u00041}\u0016vzZ<", "@d`BX:M;)\u0006\nb7\u0004\t\u001ae\r0\u007fN\u000f\u001b!P}", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7I#;IW\u0011", "@d`BX:M>\u0019\f\u0003b:\u000b\r9n", "Ag^B_+,V#\u0011g^8\r\t=tj(\tH\u0005%%Ky\u0017)r49c\u0007\u001c>m", "\u0011n\\=T5B]\"", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class PermissionsModule extends NativePermissionsAndroidSpec implements PermissionListener {
    private static final Companion Companion = new Companion(null);
    private static final String ERROR_INVALID_ACTIVITY = "E_INVALID_ACTIVITY";
    private final String DENIED;
    private final String GRANTED;
    private final String NEVER_ASK_AGAIN;
    private final SparseArray<Callback> callbacks;
    private int requestCode;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0005ӯ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٨lԥ&\tWȞ˝kq"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006\u0002%Ba\u0002.Eq 7[\r&kA&\u0019vo=\u0011l:6\u0001&WSNj:\\zH\u0010\u001b^\u0018W\u0001", "", "u(E", "\u0013QA\u001cE&\"<\nZaB\u000bvd\rTc\u0019_/t", "", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public PermissionsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.callbacks = new SparseArray<>();
        this.GRANTED = "granted";
        this.DENIED = "denied";
        this.NEVER_ASK_AGAIN = "never_ask_again";
    }

    private final PermissionAwareActivity getPermissionAwareActivity() {
        ComponentCallbacks2 currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.".toString());
        }
        if (currentActivity instanceof PermissionAwareActivity) {
            return (PermissionAwareActivity) currentActivity;
        }
        throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.".toString());
    }

    @Override // com.facebook.fbreact.specs.NativePermissionsAndroidSpec
    public void checkPermission(String str, Promise promise) {
        Intrinsics.checkNotNullParameter(str, C1561oA.ud("1%1+&/.#(&", (short) (C1633zX.Xd() ^ (-14514))));
        Intrinsics.checkNotNullParameter(promise, C1561oA.yd("BECB7B5", (short) (OY.Xd() ^ 596)));
        Context baseContext = getReactApplicationContext().getBaseContext();
        Class<?> cls = Class.forName(C1561oA.Yd("{\n\u0001\u0010\u000e\t\u0005O\u0006\u0013\u0013\u001a\f\u0016\u001dWm\u001b\u001b\"\u0014(%", (short) (C1633zX.Xd() ^ (-16852))));
        Class<?>[] clsArr = new Class[1];
        short sXd = (short) (FB.Xd() ^ 28398);
        short sXd2 = (short) (FB.Xd() ^ 28614);
        int[] iArr = new int["TLbN\u001c[Q_Y!Gih`f`".length()];
        QB qb = new QB("TLbN\u001c[Q_Y!Gih`f`");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        Object[] objArr = {str};
        Method method = cls.getMethod(Jg.Wd("\u0004,\u000fka&\u001e\u0004k:-!\u0002bJpL7\u001c", (short) (OY.Xd() ^ 9899), (short) (OY.Xd() ^ 13833)), clsArr);
        try {
            method.setAccessible(true);
            promise.resolve(Boolean.valueOf(((Integer) method.invoke(baseContext, objArr)).intValue() == 0));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.facebook.react.modules.core.PermissionListener
    public boolean onRequestPermissionsResult(int i2, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        try {
            Callback callback = this.callbacks.get(i2);
            if (callback != null) {
                callback.invoke(grantResults, getPermissionAwareActivity());
                this.callbacks.remove(i2);
            } else {
                FLog.w("PermissionsModule", "Unable to find callback with requestCode %d", Integer.valueOf(i2));
            }
            return this.callbacks.size() == 0;
        } catch (IllegalStateException e2) {
            FLog.e("PermissionsModule", e2, "Unexpected invocation of `onRequestPermissionsResult` with invalid current activity", new Object[0]);
            return false;
        }
    }

    @Override // com.facebook.fbreact.specs.NativePermissionsAndroidSpec
    public void requestMultiplePermissions(ReadableArray readableArray, final Promise promise) {
        Intrinsics.checkNotNullParameter(readableArray, ZO.xd("Z\u0003HbH\ndGy)8", (short) (OY.Xd() ^ 9211), (short) (OY.Xd() ^ 26711)));
        Intrinsics.checkNotNullParameter(promise, C1626yg.Ud("WE\"\u0007QJD", (short) (C1633zX.Xd() ^ (-19290)), (short) (C1633zX.Xd() ^ (-27412))));
        final WritableNativeMap writableNativeMap = new WritableNativeMap();
        final ArrayList arrayList = new ArrayList();
        Context baseContext = getReactApplicationContext().getBaseContext();
        int size = readableArray.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            String string = readableArray.getString(i3);
            Class<?> cls = Class.forName(Ig.wd(";\u0011\u0019JW\u0005O\u0019s30Xv\u0012\u0014r_m4}4\u0017)", (short) (C1633zX.Xd() ^ (-12024))));
            Class<?>[] clsArr = {Class.forName(EO.Od("QwnA\u000e\u0002\u000bWs.IP}v\u001cz", (short) (C1499aX.Xd() ^ (-26069))))};
            Object[] objArr = {string};
            short sXd = (short) (ZN.Xd() ^ 14529);
            int[] iArr = new int["+/+(/\u0016'-&\u000f#/)$-,!&$".length()];
            QB qb = new QB("+/+(/\u0016'-&\u000f#/)$-,!&$");
            int i4 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i4] = xuXd.fK(sXd + sXd + sXd + i4 + xuXd.CK(iKK));
                i4++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i4), clsArr);
            try {
                method.setAccessible(true);
                if (((Integer) method.invoke(baseContext, objArr)).intValue() == 0) {
                    writableNativeMap.putString(string, this.GRANTED);
                    i2++;
                } else {
                    arrayList.add(string);
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        if (readableArray.size() == i2) {
            promise.resolve(writableNativeMap);
            return;
        }
        try {
            PermissionAwareActivity permissionAwareActivity = getPermissionAwareActivity();
            this.callbacks.put(this.requestCode, new Callback() { // from class: com.facebook.react.modules.permissions.PermissionsModule.requestMultiplePermissions.1
                @Override // com.facebook.react.bridge.Callback
                public void invoke(Object... args) {
                    Intrinsics.checkNotNullParameter(args, "args");
                    Object obj = args[0];
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.IntArray");
                    int[] iArr2 = (int[]) obj;
                    Object obj2 = args[1];
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.facebook.react.modules.core.PermissionAwareActivity");
                    PermissionAwareActivity permissionAwareActivity2 = (PermissionAwareActivity) obj2;
                    int size2 = arrayList.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        String str = arrayList.get(i5);
                        Intrinsics.checkNotNullExpressionValue(str, "get(...)");
                        String str2 = str;
                        if (iArr2.length > 0 && iArr2[i5] == 0) {
                            writableNativeMap.putString(str2, this.GRANTED);
                        } else if (permissionAwareActivity2.shouldShowRequestPermissionRationale(str2)) {
                            writableNativeMap.putString(str2, this.DENIED);
                        } else {
                            writableNativeMap.putString(str2, this.NEVER_ASK_AGAIN);
                        }
                    }
                    promise.resolve(writableNativeMap);
                }
            });
            permissionAwareActivity.requestPermissions((String[]) arrayList.toArray(new String[0]), this.requestCode, this);
            this.requestCode++;
        } catch (IllegalStateException e3) {
            short sXd2 = (short) (C1607wl.Xd() ^ 19184);
            short sXd3 = (short) (C1607wl.Xd() ^ 25019);
            int[] iArr2 = new int["j\u0006pv\u007fkwuq\u000eps\u0006{\n}\n\u0010".length()];
            QB qb2 = new QB("j\u0006pv\u007fkwuq\u000eps\u0006{\n}\n\u0010");
            int i5 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i5] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i5)) - sXd3);
                i5++;
            }
            promise.reject(new String(iArr2, 0, i5), e3);
        }
    }

    @Override // com.facebook.fbreact.specs.NativePermissionsAndroidSpec
    public void requestPermission(final String str, final Promise promise) throws Throwable {
        Intrinsics.checkNotNullParameter(str, C1561oA.od("9-93.76+0.", (short) (FB.Xd() ^ 32520)));
        short sXd = (short) (C1580rY.Xd() ^ (-17650));
        int[] iArr = new int["\u0015\u0018\u0016\u0015\u0012\u001d\u0010".length()];
        QB qb = new QB("\u0015\u0018\u0016\u0015\u0012\u001d\u0010");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        Intrinsics.checkNotNullParameter(promise, new String(iArr, 0, i2));
        Context baseContext = getReactApplicationContext().getBaseContext();
        Object[] objArr = {str};
        Method method = Class.forName(Wg.Zd("\u000fI9\u0014\f<#([05hW\u001b*\u001a)\u0007\u007f\u001cES\u007f", (short) (OY.Xd() ^ 17887), (short) (OY.Xd() ^ 24709))).getMethod(Wg.vd("=AA>A(=C8!9E;6CB38:", (short) (Od.Xd() ^ (-14889))), Class.forName(C1561oA.Xd("og}i7vlzt<b\u0005\u0004{\u0002{", (short) (Od.Xd() ^ (-28901)))));
        try {
            method.setAccessible(true);
            if (((Integer) method.invoke(baseContext, objArr)).intValue() == 0) {
                promise.resolve(this.GRANTED);
                return;
            }
            try {
                PermissionAwareActivity permissionAwareActivity = getPermissionAwareActivity();
                this.callbacks.put(this.requestCode, new Callback() { // from class: com.facebook.react.modules.permissions.PermissionsModule.requestPermission.1
                    @Override // com.facebook.react.bridge.Callback
                    public void invoke(Object... args) {
                        Intrinsics.checkNotNullParameter(args, "args");
                        Object obj = args[0];
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.IntArray");
                        int[] iArr2 = (int[]) obj;
                        if (iArr2.length > 0 && iArr2[0] == 0) {
                            promise.resolve(this.GRANTED);
                            return;
                        }
                        Object obj2 = args[1];
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.facebook.react.modules.core.PermissionAwareActivity");
                        if (((PermissionAwareActivity) obj2).shouldShowRequestPermissionRationale(str)) {
                            promise.resolve(this.DENIED);
                        } else {
                            promise.resolve(this.NEVER_ASK_AGAIN);
                        }
                    }
                });
                permissionAwareActivity.requestPermissions(new String[]{str}, this.requestCode, this);
                this.requestCode++;
            } catch (IllegalStateException e2) {
                promise.reject(Qg.kd("RkTX_ISOIcDEUIUGQU", (short) (OY.Xd() ^ 31628), (short) (OY.Xd() ^ 18608)), e2);
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @Override // com.facebook.fbreact.specs.NativePermissionsAndroidSpec
    public void shouldShowRequestPermissionRationale(String permission, Promise promise) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        Intrinsics.checkNotNullParameter(promise, "promise");
        try {
            promise.resolve(Boolean.valueOf(getPermissionAwareActivity().shouldShowRequestPermissionRationale(permission)));
        } catch (IllegalStateException e2) {
            promise.reject(ERROR_INVALID_ACTIVITY, e2);
        }
    }
}
