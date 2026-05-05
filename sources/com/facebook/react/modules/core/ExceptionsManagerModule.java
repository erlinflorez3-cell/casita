package com.facebook.react.modules.core;

import com.facebook.common.logging.FLog;
import com.facebook.fbreact.specs.NativeExceptionsManagerSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.common.JavascriptException;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.util.ExceptionDataHelper;
import com.facebook.react.util.JSStackTrace;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@ReactModule(name = "\u00057!\",/#(&*\u0003\u0016\"\u0014\u0019\u0016\"")
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":\u0012\u007f\u0007ljA0ZeP.XS2\u000fy\b<řc$\bCC٥\"}0\rWNmkt_pŏs\u000f4\u00159u<Mcxu\u0012=3Բs?AO8CGc\r63$x6\u0001\b\u0013\u00062*v\u0014'~QQ$\u0012^G7N\u001b/[\r2\u00124BP\u0007,e\u007fPLG\u001bgj51\u000e\u0002Dd&\u000e<-Q\u001bSl';\u0005(2sbED-%\u0002\u00077XiH\u001bA\b<3rW-9T\fYLW. E/]\u001aurTjKe).5;gcyT>.\u0006\f\u0014\u000fR\u0003<\u0010WN<?2h\u001e\ra\u0001#WNc\u001a^p\u000eAu\u0007#3\u007fK+g\u001c=Ϣcޅ\u001dN?ަ̅\u00112"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006t/BYG\u007fJk\u00169\\GEtB\u0006\u0011q];\u0007p\u0014Xu7NL$", "\u001ab^:\"-:Q\u0019{\u0005h2F\n,r\u007f$yOJ%\"Gm\u001c\u0006_!D]\u000f \u0017\u0001\u0014.XR?u=,|dj5\tc9<\u0002'E\"", "2de h7I]&\u000ebZ5x\u000b/r", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~]\u0007/7z\u0017*KCI5\u0013\u001e&VqD\u0012m9]^#PHP,i(", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n\u007f\u0017(U\u007f\u0019G\u00012D#\u0002)Fm#/IA;y}|\u0015yOI\u0012n6[\u0006\u000fCUJ.\\_H\u0001\u0005", "2hb:\\:L@\u0019}wh?", "", "@d_<e;\u001ef\u0017~\u0006m0\u0007\u0012", "2`c.", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", "@d_<e;\u001fO(z\u0002>?z\t:t\u00042\u0005", ";db@T.>", "", "AsP0^", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7I#;IW\u0011", "7c3<h)ES", "", "@d_<e;,]\u001a\u000eZq*|\u0014>i\n1", "CoS.g,\u001ef\u0017~\u0006m0\u0007\u0012\u0017e\u000e6wB\u0001", "Bhc9X", "2dc.\\3L", "3wR2c;B]\"by=6\r\u00066e", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public class ExceptionsManagerModule extends NativeExceptionsManagerSpec {
    private final DevSupportManager devSupportManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExceptionsManagerModule(DevSupportManager devSupportManager) {
        super(null);
        Intrinsics.checkNotNullParameter(devSupportManager, "devSupportManager");
        this.devSupportManager = devSupportManager;
    }

    @Override // com.facebook.fbreact.specs.NativeExceptionsManagerSpec
    public void dismissRedbox() {
        if (this.devSupportManager.getDevSupportEnabled()) {
            this.devSupportManager.hideRedboxDialog();
        }
    }

    @Override // com.facebook.fbreact.specs.NativeExceptionsManagerSpec
    public void reportException(ReadableMap data) {
        Intrinsics.checkNotNullParameter(data, "data");
        String string = data.getString("message");
        if (string == null) {
            string = "";
        }
        WritableArray array = data.getArray(StackTraceHelper.STACK_KEY);
        if (array == null) {
            array = Arguments.createArray();
        }
        boolean z2 = data.hasKey(StackTraceHelper.IS_FATAL_KEY) ? data.getBoolean(StackTraceHelper.IS_FATAL_KEY) : false;
        String extraDataAsJson = ExceptionDataHelper.getExtraDataAsJson(data);
        if (z2) {
            Intrinsics.checkNotNull(array);
            JavascriptException javascriptException = new JavascriptException(JSStackTrace.format(string, array));
            javascriptException.setExtraDataAsJson(extraDataAsJson);
            throw javascriptException;
        }
        Intrinsics.checkNotNull(array);
        FLog.e(ReactConstants.TAG, JSStackTrace.format(string, array));
        if (extraDataAsJson != null) {
            FLog.d(ReactConstants.TAG, "extraData: %s", extraDataAsJson);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeExceptionsManagerSpec
    public void reportFatalException(String str, ReadableArray readableArray, double d2) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putString("message", str);
        javaOnlyMap.putArray(StackTraceHelper.STACK_KEY, readableArray);
        javaOnlyMap.putInt("id", (int) d2);
        javaOnlyMap.putBoolean(StackTraceHelper.IS_FATAL_KEY, true);
        reportException(javaOnlyMap);
    }

    @Override // com.facebook.fbreact.specs.NativeExceptionsManagerSpec
    public void reportSoftException(String str, ReadableArray readableArray, double d2) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putString("message", str);
        javaOnlyMap.putArray(StackTraceHelper.STACK_KEY, readableArray);
        javaOnlyMap.putInt("id", (int) d2);
        javaOnlyMap.putBoolean(StackTraceHelper.IS_FATAL_KEY, false);
        reportException(javaOnlyMap);
    }

    @Override // com.facebook.fbreact.specs.NativeExceptionsManagerSpec
    public void updateExceptionMessage(String str, ReadableArray readableArray, double d2) {
        int i2 = (int) d2;
        if (this.devSupportManager.getDevSupportEnabled()) {
            this.devSupportManager.updateJSError(str, readableArray, i2);
        }
    }
}
