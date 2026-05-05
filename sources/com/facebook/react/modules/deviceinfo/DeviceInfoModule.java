package com.facebook.react.modules.deviceinfo;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.facebook.fbreact.specs.NativeDeviceInfoSpec;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.DisplayMetricsHolder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.QB;
import yg.Xu;

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
@ReactModule(name = "\u0004$4&\u001f \u0003'\u001e&")
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\"2\u0012\u007f\u0007|jA0JeP.`X2şs{J$c$wCCU(}*ޛWNu\nvJh\u0017K\u000f\u0014ǝ\u0001j2L[}s܈?2pno3{o}Ff\tF\t.3:8(\u0007в\u001e*V\u00137\bI_\u001c\u0016>D\t:\u0001\u0012̂\t\u001a \f\u0007$\u000f*tg|C\u0011~kHG/\u0013kRNUo@~]\rteU\u001c=uf1NIM\u0015S`I\u001b\u001baM\u0016Wqk\u0012/;o1W\bo6\u0007\rZ)sU\u001br\u000b&\u000b\u0012\u0018t\\39V{K~\u0016~¾\u0007ԫ\u0011<\f\u05faV5V7E\u001c|\u0007<=KɄ_ĖT\u0002fۍP\toA/'\u00162Y;qƛ]ň?\u0019Vљߏ\t#"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006u%F]{ ;v\u00178\u0017\";|8\u001c\u0015Lj:\u0011K6M\u0007.G\"", "\u001ab^:\"-:Q\u0019{\u0005h2F\n,r\u007f$yOJ%\"Gm\u001c\u0006_!D]\u000f \u0016m'2KC\u001ft5(\u0003sa7\\", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW#z&5W\u0012\u001e>mu?MLJR8,$hj9\u00149", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3hY+Bt\u001a,IR?u={\u001fqp9\u001ar\u0002", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1W\r{Bx\u001d2K?Jo>'rrjH\u0007v;$:\u0018", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", "4n]AF*:Z\u0019", "", ">qTC\\6Naw\u0003\ti3x\u001d\u0017e\u000f5\u007f>\u000f", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", "@dP0g\bI^ \u0003xZ;\u0001\u00138C\n1\u000b@\u0014&", "3lXAH7=O(~Yb4|\u0012=i\n1\n \u0012\u0017 V", "", "5dc!l7>Rx\u0012\u0006h9\f\t.C\n1\nO| &U", "", "", "", "7me._0=O(~", "=m7<f;\u001dS'\u000e\bh@", "=m7<f;)O)\rz", "=m7<f;+S'\u000f\u0003^", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class DeviceInfoModule extends NativeDeviceInfoSpec implements LifecycleEventListener {
    private float fontScale;
    private ReadableMap previousDisplayMetrics;
    private ReactApplicationContext reactApplicationContext;

    public DeviceInfoModule(Context context) throws Throwable {
        short sXd = (short) (FB.Xd() ^ 23987);
        short sXd2 = (short) (FB.Xd() ^ 3989);
        int[] iArr = new int["2??F8LI".length()];
        QB qb = new QB("2??F8LI");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        Intrinsics.checkNotNullParameter(context, new String(iArr, 0, i2));
        super(null);
        this.reactApplicationContext = null;
        DisplayMetricsHolder.initDisplayMetricsIfNotInitialized(context);
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.od(".:/<81+s(316&.3k\u007f+).\u001e0+", (short) (C1607wl.Xd() ^ 866))).getMethod(C1561oA.Kd("~}\u000el\u0001\u0010\r\u0014\u0012\u0004\u0007\u0016", (short) (C1580rY.Xd() ^ (-10317))), new Class[0]);
        try {
            method.setAccessible(true);
            this.fontScale = ((Resources) method.invoke(context, objArr)).getConfiguration().fontScale;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceInfoModule(ReactApplicationContext reactContext) throws Throwable {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        DisplayMetricsHolder.initDisplayMetricsIfNotInitialized(reactContext);
        this.fontScale = reactContext.getResources().getConfiguration().fontScale;
        reactContext.addLifecycleEventListener(this);
        this.reactApplicationContext = reactContext;
    }

    public final void emitUpdateDimensionsEvent() {
        ReactApplicationContext reactApplicationContext = this.reactApplicationContext;
        if (reactApplicationContext != null) {
            if (!reactApplicationContext.hasActiveReactInstance()) {
                ReactSoftExceptionLogger.logSoftException(NativeDeviceInfoSpec.NAME, new ReactNoCrashSoftException("No active CatalystInstance, cannot emitUpdateDimensionsEvent"));
                return;
            }
            WritableMap displayMetricsWritableMap = DisplayMetricsHolder.getDisplayMetricsWritableMap(this.fontScale);
            ReadableMap readableMap = this.previousDisplayMetrics;
            if (readableMap == null) {
                this.previousDisplayMetrics = displayMetricsWritableMap.copy();
            } else {
                if (Intrinsics.areEqual(displayMetricsWritableMap, readableMap)) {
                    return;
                }
                this.previousDisplayMetrics = displayMetricsWritableMap.copy();
                reactApplicationContext.emitDeviceEvent("didUpdateDimensions", displayMetricsWritableMap);
            }
        }
    }

    @Override // com.facebook.fbreact.specs.NativeDeviceInfoSpec
    public Map<String, Object> getTypedExportedConstants() {
        WritableMap displayMetricsWritableMap = DisplayMetricsHolder.getDisplayMetricsWritableMap(this.fontScale);
        this.previousDisplayMetrics = displayMetricsWritableMap.copy();
        return MapsKt.mapOf(TuplesKt.to("Dimensions", displayMetricsWritableMap.toHashMap()));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        super.invalidate();
        ReactApplicationContext reactApplicationContext = this.reactApplicationContext;
        if (reactApplicationContext != null) {
            reactApplicationContext.removeLifecycleEventListener(this);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        Resources resources;
        Configuration configuration;
        ReactApplicationContext reactApplicationContext = this.reactApplicationContext;
        Float fValueOf = (reactApplicationContext == null || (resources = reactApplicationContext.getResources()) == null || (configuration = resources.getConfiguration()) == null) ? null : Float.valueOf(configuration.fontScale);
        if (fValueOf == null || Intrinsics.areEqual(fValueOf, this.fontScale)) {
            return;
        }
        this.fontScale = fValueOf.floatValue();
        emitUpdateDimensionsEvent();
    }
}
