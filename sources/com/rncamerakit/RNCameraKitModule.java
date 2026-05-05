package com.rncamerakit;

import android.view.View;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.uimanager.UIManagerHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":\u0012\u007fјnjO0L͜P.`W2şs{J$c$wDCU( *\t]Zog|Ϻb\u000bI\u0011\u001cǝ\u0017}\\I\u0004w\u0016\u0011\"rM\u007fCAM\b=gaҽ:\u0005.4j_\b\b\u0019\u001aXL@|\tHc\u000e(/nvjX\u001bT\u001d\u001c(\u0005l(1\"jpf6vv$?ǥ'\u0003wM\u00175m<\u0015M;J\u0005-\u001b\u007fy A?e?]7a\u0010\u001f^kA\u0013? L\u0015j7'YY\"e|lH\u001a#<g\r\f\u0002lpM_n\u001e?+}g{V\u001c1\u0010|\u0012\fj\u000e^\u00125HF-Hg^ԇ5ϢvSHАمbV"}, d2 = {"\u001ab^:\"9GQ\u0015\u0007zk(\u0003\r>/l\u0011Y<\t\u0017$CU\u0012K^/4i\u0005 \r", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3h[*@|\u0016A\\ 7y4\u0003\u0011y]!\u0011b<Uv|", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3hY+Bt\u001a,IR?u={\u001fqp9\u001ar\u0002", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1W\r{Bx\u001d2K?Jo>'rrjH\u0007v;$:\u0018", "1`_Ah9>", "", "=oc6b5L", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", "B`V", "", ">q^:\\:>", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW'\u0004/=]\f \r", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1Xy\u001d>m}*X\u0019\"p0/\u00112h5\u0010eu-\u00017DSN\u0002CP|E]\u0013V\fN(\u0017\u000f_\u000b1n@5.Q)V\u0006:j\u0001U\u0001\u001b?rtPVe\u000bj", "1gT0^\u000b>d\u001d|z<(\u0005\t<a[8\u000bC\u000b$\u001b\\k\u001d@\u0001.#hy/G{", "5dc\u0010b5Lb\u0015\b\nl", "", "", "", "5dc\u001bT4>", "@d`BX:M2\u0019\u0010~\\,Z\u00057e\r$WP\u0010\u001a!Ts#8\u0006)?b", "\u0011n\\=T5B]\"", "@dP0gsGO(\u0003\f^sz\u00057e\r$CF\u0005&\u0011To\u0015<r35"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class RNCameraKitModule extends ReactContextBaseJavaModule {
    public static final Companion Companion = new Companion(null);
    public static final int LANDSCAPE_LEFT = 1;
    public static final int LANDSCAPE_RIGHT = 3;
    public static final int PORTRAIT = 0;
    public static final int PORTRAIT_UPSIDE_DOWN = 2;
    public static final String REACT_CLASS = "RNCameraKitModule";
    private final ReactApplicationContext reactContext;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005$4\u0012\u0006\u0013nʑ?ӋE{߉^R\u0002)Op\u00024ż_$\u007fC\fa(~:\t}P>ˮAН^\u000bKƤV\"\u0007mDI\u0004z4\u070fa̓FoG\u074c\u001e{K=xtd\u0007v\u074ctأ}\u0005\tɝzT\u001e{\u0013Cy\u000ehؚ\u0013¤>R\u0015˟U& \fV /%3ɨ!ɇLleŽǫ'\u000b"}, d2 = {"\u001ab^:\"9GQ\u0015\u0007zk(\u0003\r>/l\u0011Y<\t\u0017$CU\u0012K^/4i\u0005 uK 6X?Do>'j", "", "u(E", "\u001a@=\u0011F\n\u001a>xxa>\rk", "", "\u001a@=\u0011F\n\u001a>xxgB\u000e_w", "\u001eNA!E\b\"B", "\u001eNA!E\b\"B\u0013neL\u0010[h)Di\u001ad", " D0\u0010G&\u001c:tlh", "", "@dP0gsGO(\u0003\f^sz\u00057e\r$CF\u0005&\u0011To\u0015<r35"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNCameraKitModule(ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void capture$lambda$2(UIManager uIManager, Integer num, ReadableMap readableMap, Promise promise) throws Throwable {
        Intrinsics.checkNotNullParameter(promise, "$promise");
        View viewResolveView = uIManager != null ? uIManager.resolveView(num.intValue()) : null;
        Intrinsics.checkNotNull(viewResolveView, "null cannot be cast to non-null type com.rncamerakit.CKCamera");
        CKCamera cKCamera = (CKCamera) viewResolveView;
        HashMap<String, Object> hashMap = readableMap.toHashMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(hashMap.size()));
        Iterator<T> it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof ReadableMap) {
                value = ((ReadableMap) value).toHashMap();
            } else if (value instanceof ReadableArray) {
                value = ((ReadableArray) value).toArrayList();
            }
            linkedHashMap.put(key, value);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String str = (String) entry2.getKey();
            Object value2 = entry2.getValue();
            Pair pair = value2 != null ? TuplesKt.to(str, value2) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        cKCamera.capture(MapsKt.toMap(arrayList), promise);
    }

    @ReactMethod
    public final void capture(final ReadableMap readableMap, Double d2, final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        final Integer numValueOf = d2 != null ? Integer.valueOf((int) d2.doubleValue()) : null;
        if (numValueOf == null || readableMap == null) {
            promise.reject("E_CAPTURE_FAILED", "options or/and tag arguments are null, options: " + readableMap + ", tag: " + numValueOf);
        } else {
            final UIManager uIManagerForReactTag = UIManagerHelper.getUIManagerForReactTag(this.reactContext, numValueOf.intValue());
            this.reactContext.runOnUiQueueThread(new Runnable() { // from class: com.rncamerakit.RNCameraKitModule$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    RNCameraKitModule.capture$lambda$2(uIManagerForReactTag, numValueOf, readableMap, promise);
                }
            });
        }
    }

    public final void checkDeviceCameraAuthorizationStatus(Promise promise) {
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return MapsKt.hashMapOf(TuplesKt.to("PORTRAIT", 0), TuplesKt.to("PORTRAIT_UPSIDE_DOWN", 2), TuplesKt.to("LANDSCAPE_LEFT", 1), TuplesKt.to("LANDSCAPE_RIGHT", 3));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    public final void requestDeviceCameraAuthorization(Promise promise) {
    }
}
