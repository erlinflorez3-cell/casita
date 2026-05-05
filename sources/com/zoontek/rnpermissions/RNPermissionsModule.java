package com.zoontek.rnpermissions;

import android.util.SparseArray;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.PermissionListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

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
@ReactModule(name = "\u0012\r\u000e\".(#,+ %#'")
@Metadata(bv = {}, d1 = {"ЯX\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\"2\u0012\u007f\u0007|jA0ZeP\u008cZS8\u000fsڔ<$q$yCAV\"}0\u0015WNmhvJp\u000bK\u000f\f\u0017\u0001j:R]ތe\u0012\u001d8JoMBUڎE9n\b>\u0005&<(=\u0010ڎ1\u001aXG@v)C\f\u0019\"6NqRT#L3\u001cŪ\n>.\u0004fjuUNH\u001bej31\f\u0002B|1&5E[\u001bQl';~\u0012\"9IO5C/\u001a\bOhiK\u001b? E5l54CI\"ef\\\u000e\u001d-+}\u0017$wnj\u0013`x\fU3\u007fgYY&(&\u0005B\u0012\u0005\u001a\u001c\u0016?H\\5Jj\u0016\u001fKt!epT\u0010gZ\u007f)k|\u001cm\u000eA>Q\u001b\u0015Y\u0012?'WO{3\u0017d(It/ol\u000e\u000f#ah@z?fX=vd:]K\u0005\u001cp\u0011\u001aZ\u000e>X\u00185\f\u0013>\u0017SE\nRS%y\u001c`D\u0016\u0012KtĈWi`d\t0|3O*7\u0014\u000bHr\u000e\u0004P\u0003br\u0016\u00164b%\u0016\bA(\r}J@=\u0012dN\u0017w\u001bQk\u0013=/\u0015A s4$eYv3cY\u0014\u0014o_\u000f\u0014mJ\u0013\tfoZS:d#-jHV\f(w*L~\u0010!TWqJB\\5'e-H1(\tFE\u001fm}\u0001\u0010-\\c(\u0011z<t7\u0013\u0001`~x\u007fxw6CejCOuM\u0019T]RlB\";\u0007-\u00060KuU_L\u001b <ZD6$@QQ]EC\u0013\r6J\u0002[S|vsZe\u0012U\u0005C~_Mv2\u007f\u000ezr<`\u0019P}YmǴx݈v#\u0010ۭѩ}\t"}, d2 = {"\u001ab^:\"AH]\"\u000ezdu\n\u0012:e\r0\u007fN\u000f\u001b!P}W)_\u00105f\u0006$E{\u001a8VQ#u3.\u001ch7", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3h[*@|\u0016A\\ 7y4\u0003\u0011y]!\u0011b<Uv|", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006t/BYG\u000b7z\u001e2[Q?u=\u0005\u0019vp9\u0010c9$", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3hY+Bt\u001a,IR?u={\u001fqp9\u001ar\u0002", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1W\r{Bx\u001d2K?Jo>'rrjH\u0007v;$:\u0018", "1`[9U(<Y'", "\u001a`]1e6BRb\u000f\nb3Fv:a\r6{\u001c\u000e$\u0013[E", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW\u001ar,<Vy\u001e=C", "1`] V/>R)\u0006z>?x\u0007>A\u0007$\tH\u000f", "", ">q^:\\:>", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW'\u0004/=]\f \r", "1`]\"f,\u001fc \u0006h\\9|\t8I\t7{I\u0010", "1gT0^", ">da:\\:LW#\b", "", "1gT0^\u0013HQ\u0015\u000e~h5X\u0007-u\r$yT", "1gT0^\u0014NZ(\u0003\u0006e,", ">da:\\:LW#\b\t", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7I#;IW\u0011", "1gT0^\u0015Hb\u001d\u007f~\\(\f\r9n\u000e", "5dc\u001bT4>", "=mA2d<>a(izk4\u0001\u0017=i\n1\n-\u0001%'N~", "", "@d`BX:M1#}z", "", "", "5qP;g\u0019>a)\u0006\nl", "", "uHJ\u0019](OOb\u0006vg.Fv>r\u00041}\u0016vzZ<", "=oT;C/Hb#i~\\2|\u0016", "=oT;F,Mb\u001d\b|l", "Bx_2", "@d`BX:M", "@d`BX:M:#|vm0\u0007\u0012\u000bc}8\t<~+", ">ta=b:>9\u0019\u0013", "@d`BX:M;)\u0006\nb7\u0004\t", "@d`BX:M<#\u000e~_0z\u0005>i\n1\n", "=oc6b5L", "Ag^B_+,V#\u0011g^8\r\t=tl$\u000bD\u000b \u0013No", "@dP0gsGO(\u0003\f^s\b\t<m\u00046\nD\u000b %A|\u000eCv!CY"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class RNPermissionsModule extends ReactContextBaseJavaModule implements PermissionListener {
    private final SparseArray<Callback> callbacks;

    public RNPermissionsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.callbacks = new SparseArray<>();
    }

    @ReactMethod
    public final void canScheduleExactAlarms(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        RNPermissionsModuleImpl rNPermissionsModuleImpl = RNPermissionsModuleImpl.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        rNPermissionsModuleImpl.canScheduleExactAlarms(reactApplicationContext, promise);
    }

    @ReactMethod
    public final void canUseFullScreenIntent(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        RNPermissionsModuleImpl rNPermissionsModuleImpl = RNPermissionsModuleImpl.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        rNPermissionsModuleImpl.canUseFullScreenIntent(reactApplicationContext, promise);
    }

    @ReactMethod
    public final void check(String permission, Promise promise) throws Throwable {
        Intrinsics.checkNotNullParameter(permission, "permission");
        Intrinsics.checkNotNullParameter(promise, "promise");
        RNPermissionsModuleImpl rNPermissionsModuleImpl = RNPermissionsModuleImpl.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        rNPermissionsModuleImpl.check(reactApplicationContext, permission, promise);
    }

    @ReactMethod
    public final void checkLocationAccuracy(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        RNPermissionsModuleImpl.INSTANCE.checkLocationAccuracy(promise);
    }

    @ReactMethod
    public final void checkMultiple(ReadableArray permissions, Promise promise) throws Throwable {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(promise, "promise");
        RNPermissionsModuleImpl rNPermissionsModuleImpl = RNPermissionsModuleImpl.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        rNPermissionsModuleImpl.checkMultiple(reactApplicationContext, permissions, promise);
    }

    @ReactMethod
    public final void checkNotifications(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        RNPermissionsModuleImpl rNPermissionsModuleImpl = RNPermissionsModuleImpl.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        rNPermissionsModuleImpl.checkNotifications(reactApplicationContext, promise);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return RNPermissionsModuleImpl.NAME;
    }

    @Override // com.facebook.react.modules.core.PermissionListener
    public boolean onRequestPermissionsResult(int i2, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        RNPermissionsModuleImpl rNPermissionsModuleImpl = RNPermissionsModuleImpl.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        return rNPermissionsModuleImpl.onRequestPermissionsResult(reactApplicationContext, this.callbacks, i2, grantResults);
    }

    @ReactMethod
    public final void openPhotoPicker(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        RNPermissionsModuleImpl.INSTANCE.openPhotoPicker(promise);
    }

    @ReactMethod
    public final void openSettings(String str, Promise promise) throws Exception {
        Intrinsics.checkNotNullParameter(promise, "promise");
        RNPermissionsModuleImpl rNPermissionsModuleImpl = RNPermissionsModuleImpl.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        rNPermissionsModuleImpl.openSettings(reactApplicationContext, str, promise);
    }

    @ReactMethod
    public final void request(String permission, Promise promise) throws Throwable {
        Intrinsics.checkNotNullParameter(permission, "permission");
        Intrinsics.checkNotNullParameter(promise, "promise");
        RNPermissionsModuleImpl rNPermissionsModuleImpl = RNPermissionsModuleImpl.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        rNPermissionsModuleImpl.request(reactApplicationContext, this, this.callbacks, permission, promise);
    }

    @ReactMethod
    public final void requestLocationAccuracy(String purposeKey, Promise promise) {
        Intrinsics.checkNotNullParameter(purposeKey, "purposeKey");
        Intrinsics.checkNotNullParameter(promise, "promise");
        RNPermissionsModuleImpl.INSTANCE.requestLocationAccuracy(promise);
    }

    @ReactMethod
    public final void requestMultiple(ReadableArray permissions, Promise promise) throws Throwable {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(promise, "promise");
        RNPermissionsModuleImpl rNPermissionsModuleImpl = RNPermissionsModuleImpl.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        rNPermissionsModuleImpl.requestMultiple(reactApplicationContext, this, this.callbacks, permissions, promise);
    }

    @ReactMethod
    public final void requestNotifications(ReadableArray options, Promise promise) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(promise, "promise");
        RNPermissionsModuleImpl rNPermissionsModuleImpl = RNPermissionsModuleImpl.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        rNPermissionsModuleImpl.requestNotifications(reactApplicationContext, promise);
    }

    @ReactMethod
    public final void shouldShowRequestRationale(String permission, Promise promise) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        Intrinsics.checkNotNullParameter(promise, "promise");
        RNPermissionsModuleImpl rNPermissionsModuleImpl = RNPermissionsModuleImpl.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        rNPermissionsModuleImpl.shouldShowRequestRationale(reactApplicationContext, permission, promise);
    }
}
