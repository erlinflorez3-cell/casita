package com.facebook.react.util;

import androidx.exifinterface.media.ExifInterface;
import com.dynatrace.android.agent.Global;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.ReactConstants;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.npmdavi.davinotification.Constant;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005&4\u0012\u0006\u0007nʑA0RqP.XS2\u000f\u0002{<$a)wژ;kڼ.\"7N\u000flmnН^\u000bQ\u000fN$\u0007rDI\u0004\u0002\u000e\u0016\u001d<Zom>\u0014t\u0006Qn\u0001N\u0005N;R>\b\u0012\u0019\u001c@G>\u0005+GY\u0016*0n{\u0001WU[\u0013&*\u0006l)1\"jqf6vw$?w1\u0011xZNUh`\u0001[\u0017^TU\u0018=ff9NGM\u0015S^3\u000b`lW\u0003ms\u0004\u00051I5=as\u0006?\t\u0006\"\"CQ#\\!4\r\u000b_j$)AN\u0012V\u0001\u00126\t\u0013{;>J\u000eN5VAE\u001a\u0015\u0011>7\u0003|k@~\r%GH\u0013oJ/%.<[?)sicQ\u0018|E,\t\u001b(;\u0001\u001d,\"Y^l#\u001clw\u007f3(̼\u0010˓R\naƝ>\u0010~e\u001a*22\u001eĐ\u0002ɨ\u0015.\u001f¦\bgG'9k0J\u001bϠIݶdh[֟#TN'\u0007\u0016e,_ȸ-ֈh\u0005s¬%d:\u0017e\u001c\u0003\tTܸeء`wDƙu\u001c\\V\u0001i\u0019O4܊wçj7aʤ±\u0012l"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0010\u001b\u001e\u0011\\v#\u0001'\u000b", "", "u(E", "\u000fCE\u00166\f", "", "\u0013QA\u001cE", "\u001aN6", "\u001bH=\u0016@\u001c&M\u007f^k>\u0013vi\u0019Ry\u0018_", "\"Q0\u00108", "%@A\u001b", RemoteSettings.FORWARD_SLASH_STRING, "", ";db@T.>", "", ExifInterface.GPS_MEASUREMENT_3D, "1n]AX?M", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3h[*@|\u0016A\\\u0019", Global.COLON, ":de2_\u001bHA(\f~g.", ":de2_", ":nV\u0016a;>`\"z\u0002", "B", ExifInterface.LONGITUDE_EAST, " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class RNLog {
    public static final int ADVICE = 4;
    public static final int ERROR = 6;
    public static final RNLog INSTANCE = new RNLog();
    public static final int LOG = 2;
    public static final int MINIMUM_LEVEL_FOR_UI = 5;
    public static final int TRACE = 3;
    public static final int WARN = 5;

    private RNLog() {
    }

    @JvmStatic
    public static final void a(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        FLog.w(ReactConstants.TAG, "(ADVICE)" + message);
    }

    @JvmStatic
    public static final void e(ReactContext reactContext, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        INSTANCE.logInternal(reactContext, message, 6);
        FLog.e(ReactConstants.TAG, message);
    }

    @JvmStatic
    public static final void e(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        FLog.e(ReactConstants.TAG, message);
    }

    @JvmStatic
    public static final void l(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        FLog.i(ReactConstants.TAG, message);
    }

    private final String levelToString(int i2) {
        return (i2 == 2 || i2 == 3) ? Constant.NOTIFICATION_DETAILS_LOG : (i2 == 4 || i2 == 5) ? "warn" : i2 != 6 ? "none" : "error";
    }

    private final void logInternal(ReactContext reactContext, String str, int i2) {
        if (i2 < 5 || reactContext == null || !reactContext.hasActiveReactInstance() || str == null) {
            return;
        }
        ((RCTLog) reactContext.getJSModule(RCTLog.class)).logIfNoNativeHook(levelToString(i2), str);
    }

    @JvmStatic
    public static final void t(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        FLog.i(ReactConstants.TAG, message);
    }

    @JvmStatic
    public static final void w(ReactContext reactContext, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        INSTANCE.logInternal(reactContext, message, 5);
        FLog.w(ReactConstants.TAG, message);
    }
}
