package com.dynatrace.android.agent;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.Map;
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
@Metadata(bv = {}, d1 = {"Яj\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njO0L͜P.`S2şs{B0c$wCCU0}*\tUYog\u0005Jb\u000bI\u000f\u000e\u0016\u0007\r4Icތe\u0012\u00152JoU3UoC@htD\u000e(2(8\u0002\u0005\u000f\u001e2H\u0016\u0001\u0003CY\u0012\u001a0F\u000ePĥ=M3\u0019R\u0019N$\u000f\u001etg|7Xpk<G#1lŌR'm4E[\u001bMl';~\u0012\"9IO5C/\u001a\bOjiJ\u001b? E5l53CI\"df^\u000e\"--e\f\f|laMin\u001b?+}k{T\u001c8\u0010z*\u0017l\n\u001c\u0014?JD,HpN\u0013{\u0005\u0001dXP0fr\u0006\toN\u0019;~a5\u007f /qoM1Ne\u00045\u0011,6\u0019nOe\u0005\u0012n%3T&[aWNK`P XkwJu+\"8\u0018HG.7,\u0015<*=7\nCS%y\u0012`D\u0016\u00015fva\u0002T^?Px\\<r1\u001ao\\d3s\u0001Xf?)MJ^7\u0002\u0016#8\\&FQ)\u001edgh\u0018t}c\u00183GhMX\u001duT\\\u0002nALic>i\u0003|\"MTd\u001bW\u0015L\u001a\u0011#r6:JH\u0019\u0018(\u007fRg$\u0013`L\" BFI\u0019\u000b0\u000f\bfPO\u0019!_\tp@\u0003bL<\u0003\u00181;\u000eIdj\u000e\bu\tK<|\u000f,=Ca5GEk!\u0017RC7O\u0017\u0002 _gzO|r$\u0004m}6\u0015HC\u00023K4'~WTH2\u000eR\u0001\tiM@1A\u0011B-I\rFg6r!0nzbO\u0003!Rzl\u0018;\b\u0013\n*eT\u001c_c\u0003-\"C\u0012\u000b\u0011\u007fTNf\u00055%,3\u0019q8{c7s++7\u0010\u0014]7(b2\b<!z\u000fT|\u0016\b:\f.o\u0011[\u000e8IFa[\u0015=P.3\b\u000b`x! B7<=9VO|rl7{\u0015_\u0002t(D\r\u001fx\"?[\u0010\f^F_X{s\u0002\"n[%?W\u0004k{\u0019c\\9v?\u0010\u0019\nIp(\u001bk*\u001d\\+\u0017>3\f\u0018dIkf\u0013j!$b[\u0003\rSsb\u001a\u001e\u0010)\bvc\u001dHJB\"E\u0007\u0012b+tVv\u000f\u0011InTB\u0001-\u0019c\"\u0007iI\u0005\u001cr\u00055q@\u0019U3\bIt\u0016\u0004/M9yl9I0\t\u0005\u0019{uCw\ff\bU<\u0006k\u001e\u0016h\u001c\u000bTZ\u0018Ih\u0002\u0017m\u0005H`!T\u0013X+{Z\u0017`\u0007:)-\u0003-\u0012J;'\u000bGY#spfdN&As\u001e\u000fI\\)5\u0016-gTNE\u0006c7mOx\"?}mRi\bN%hO\u0012/9\\\u0006\u0016\u0017\u000ek+R\u0016  \u0013\u0006\u0017Dh 28zx\u0001EF\bd\f29\u0010!v[\u0002vOJm05&P\t\u0001x8k\u001dg|\u0007#\u0003\u0015;\u0007}|hh\u001d7c}4!fr<'RNbW\u0005\\54]N\b\u00111@Sq\u001f\tk}e=/=~Ba_:\u0003$\f-\u0012w\u001a)\u00032[@\u001fuL$!\\\u001bJ\b\u0012l!@d#\u0016Y\u0018\u000b\u0012`^?\u001ddJ\u0001U|/eUOa\u001bUx\t\u001aDw0g6\u001bg)wJ\u000b\u001e0'\u0015\u0011pzt.4r\r\u0001\u0013\u007f,[P\u0005A(^q$\u001cn3,YSPD\u001e+?\u0018W4#`.\u007ft\u001aJC\u00027O))\u0001CB6s\u0015[Mj\u007f]U.\u000f4\u0019\rm\u0004aqH\u0002Ot9.=ya\\/[3x}LU\u00142iXCec\u0005\u0019\u00120WN]\u001e(bp\u0006\u0018-<&\u001ctQ\n\f6\u0011Dm\"XV\"_4,8|\u0007F9F\u001b\u0006$\u0010:w0uzZ\u0010>\b\u007f\\1R\u0006B-\u001b\u000fuQvB#D;qD=\u001d\u0014A5-{>Y8Esa\u0001\u0017G\\\fDCw\u0012\u0005Jad\u0004wFg8\u001e/(S\u0012t1r\u001a\u007f\u001e\u0004*\r;\f(5`-\u0018`KGWO\u0005\u0014N\\'|qh\u0019N'&t-p\u0016Q\u000b^DVe\u001a}xhE\u0017A\u0017\fAu\u001f\u0007\u007f/>)[S(kl3UM&\nXkAc\u000f{]p5\u0014fKZicr|-\u007f\u00193^Md\u00112,n\u0005<O\u0015L\u001ei\u0011DVwv5xV\r.[]/$eB\u001e=sSJbec\u0015\u00179\nophTQ7)\u0006\u00115Y\u0019A\u0015NWG\b;s;mn\u007f\u00163aU+w\u0010\u0015K\u001aXxG\u0006m7qQz)}A/Vm\t<$5I\u001e\u0013Rl\u0018\u0017wc:_1\tfZ7\u001fcY?prn\u001dS\r\f\\;hY\u0014\u0017\u001e\u0011\u0011K{@(^:\t\t\tuW\u001b\u007f8\u0017\bf#c}I9(1>_{Ag]\u0013,n\u007ff\u001fCgc4E+\u0002H#|ɂ}ž-0\u001fƉ۩qF"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0013Io\u0017K@\u0004Iby/Di\u0014.:,\u0018x8\u001d\u0017h7", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3h[*@|\u0016A\\ 7y4\u0003\u0011y]!\u0011b<Uv|", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3hY+Bt\u001a,IR?u={\u001fqp9\u001ar\u0002", "7mc2e5:Z\u0001\tyn3|", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0013Io\u0017K@\u0004Iby/Di\u0014.1LJkA'\u0011oIC\u0006s3NL", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1W\r{Bx\u001d2K?Jo>'rrjH\u0007v;$]%QT\u0018+p[nL!\u000eX\u000e\u0018'\u0016\u0004fK(m\u000e3!\b5XK\u001a|\n\b%\u001b1hp&_\u001fG\u0007\u001eqH\u0011rEify\u001d\u00056", "7l_9", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0013Io\u0017K@\u0004Iby/Di\u0014.:,\u0018x8\u001d\u0017hEA\u0012j\u0002", "/cS\u0019\\:MS\"~\b", "", "3uT;g\u0015:[\u0019", "", "/o_9l\u001cLS&i\bb=x\u0007CO\u000b7\u007fJ\n%", "CrT?C9Bd\u0015|\u000fH7\f\r9n\u000e", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", ">kPAY6K[", "1`]0X3\u001aQ(\u0003\u0005g", "9dh", "3mS#\\:Bb", "3mc2e\b<b\u001d\t\u0004", "<`\\2", "3mc2e\u0014:\\)z\u0002:*\f\r9n", "3mc2e\u0014:\\)z\u0002:*\f\r9nq,\u000bCk\u0013$Gx\u001d", ">`a2a;$S-", "4kd@[\fOS\"\u000e\t", "4naDT9=/$\nhm(\n\u0018\u000fv\u007f1\u000b", "/sc?\\)Nb\u0019\r", "/o_ g(Kb~~\u000fl", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7I#;IW\u0011", "4naDT9=3*~\u0004m", "5dc\u0010b5Lb\u0015\b\nl", "", "", "5dc\u0011T;:1#\u0006\u0002^*\f\r9nf(\r@\b", ">q^:\\:>", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW'\u0004/=]\f \r", "5dc\u001bT4>", "5dc\u001fX8NS'\u000eiZ.", "Cq[", "5dc\"f,K>&\u0003\fZ*\u0011r:t\u00042\u0005N", "7cT;g0?g\t\rzk", "CrT?", "7r2?T:A@\u0019\n\u0005k;\u0001\u00121O\u000b7{?d ", ":dPCX\b<b\u001d\t\u0004", ":dPCX", "", "@d\\<i,%W'\u000ezg,\n\u0017", "1nd;g", "", "@d_<e;\u001c`\u0015\r}", "3qa<e\u0015:[\u0019", "@dP@b5", "AsP0^;KO\u0017~", "7rA2T3\u001e`&\t\b", "@d_<e;\u001d]){\u0002^\u001dx\u0010?ec1W>\u0010\u001b!P", "/bc6b5$S-", "D`[BX", "@d_<e;\u001e`&\t\b", "3qa<e\u001d:Z)~", "@d_<e;\u001e`&\t\bB5X\u0007>i\n1", "3qa<e\nHR\u0019", "", "@d_<e;\u001e`&\t\bP0\f\f9u\u000f\u0016\u000b<~\u001d&Tk\f<", "@d_<e;\u001ed\u0019\b\nB5X\u0007>i\n1", "@d_<e;\"\\(ove<|l8A}7\u007fJ\n", "@d_<e;,b&\u0003\u0004`\u001dx\u0010?ec1W>\u0010\u001b!P", "@d_<e;/O \u000fz", "D`[BX\u0015:[\u0019", "Ad]150S3*~\u0004m", "Bx_2", "Adc\u000fX(<]\"azZ+|\u0016=", "6dP1X9L", "Adc\u0010e(LV\u0006~\u0006h9\f\r8gi3\u000b@\u007fz ", "1qP@[\u0019>^#\f\nb5~", "Adc\u0011T;:1#\u0006\u0002^*\f\r9nf(\r@\b", "1n[9X*MW#\ba^=|\u0010", "Adc\u0014C\u001a%]\u0017z\nb6\u0006", ":`c6g<=S", ":n]4\\;NR\u0019", "AsP?g", "1n]3\\.N`\u0015\u000e~h5", "AsP?g\u001dBS+", "AsP?g\u001e>P\u0006~\u0007n,\u000b\u0018\u001ei\b,\u0005B", "@d`BX:MB\u0015\u0001", "As^=I0>e", "As^=J,;@\u0019\u000b\u000b^:\fw3m\u00041}", "@db=b5LSv\ty^", "@db=b5LS\u0001~\tl(~\t", "As^=J,;@\u0019\u000b\u000b^:\fw3m\u00041}2\u0005&\u001a5s#<", "@d`BX:MA\u001d\u0014z", "@db=b5LS\u0007\u0003\u0010^", "As^?X\nKO'\u0002", "2x].g9:Q\u0019x\b^(z\u0018vn{7\u007fQ\u0001^\"N\u007f\u0010@\u007f\u001fBY\u0005 3{\u0016"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class DynatraceRNBridge extends ReactContextBaseJavaModule {
    private final DynatraceRNBridgeImpl impl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynatraceRNBridge(ReactApplicationContext reactContext, DynatraceInternalModule internalModule) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(internalModule, "internalModule");
        this.impl = new DynatraceRNBridgeImpl(reactContext, internalModule);
    }

    @ReactMethod
    public final void addListener(String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        this.impl.addListener(eventName);
    }

    @ReactMethod
    public final void applyUserPrivacyOptions(ReadableMap userPrivacyOptions, String str) {
        Intrinsics.checkNotNullParameter(userPrivacyOptions, "userPrivacyOptions");
        this.impl.applyUserPrivacyOptions(userPrivacyOptions, str);
    }

    @ReactMethod
    public final void cancelAction(String key, String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.impl.cancelAction(key, str);
    }

    @ReactMethod
    public final void endVisit(String str) {
        this.impl.endVisit(str);
    }

    @ReactMethod
    public final void enterAction(String name, String key, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(key, "key");
        this.impl.enterAction(name, key, str);
    }

    @ReactMethod
    public final void enterManualAction(String name, String key, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(key, "key");
        this.impl.enterManualAction(name, key, str);
    }

    @ReactMethod
    public final void enterManualActionWithParent(String name, String key, String parentKey, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(parentKey, "parentKey");
        this.impl.enterManualActionWithParent(name, key, parentKey, str);
    }

    @ReactMethod
    public final void flushEvents(String str) {
        this.impl.flushEvents(str);
    }

    @ReactMethod
    public final void forwardAppStartEvent(ReadableMap attributes, ReadableArray appStartKeys) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(appStartKeys, "appStartKeys");
        this.impl.forwardAppStartEvent(attributes, appStartKeys);
    }

    @ReactMethod
    public final void forwardEvent(ReadableMap attributes) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.impl.forwardEvent(attributes);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return this.impl.getConstants();
    }

    @ReactMethod
    public final void getDataCollectionLevel(String str, Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.getDataCollectionLevel(str, promise);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return DynatraceRNBridgeImplKt.BRIDGE_NAME;
    }

    @ReactMethod
    public final void getRequestTag(String key, String url, Promise promise) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.getRequestTag(key, url, promise);
    }

    @ReactMethod
    public final void getUserPrivacyOptions(String str, Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.getUserPrivacyOptions(str, promise);
    }

    @ReactMethod
    public final void identifyUser(String user, String str) {
        Intrinsics.checkNotNullParameter(user, "user");
        this.impl.identifyUser(user, str);
    }

    @ReactMethod
    public final void isCrashReportingOptedIn(String str, Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.isCrashReportingOptedIn(str, promise);
    }

    @ReactMethod
    public final void leaveAction(String key, boolean z2, String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.impl.leaveAction(key, z2, str);
    }

    @ReactMethod
    public final void removeListeners(double d2) {
        this.impl.removeListeners(d2);
    }

    @ReactMethod
    public final void reportCrash(String errorName, String reason, String stacktrace, boolean z2, String str) {
        Intrinsics.checkNotNullParameter(errorName, "errorName");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(stacktrace, "stacktrace");
        this.impl.reportCrash(errorName, reason, stacktrace, z2, str);
    }

    @ReactMethod
    public final void reportDoubleValueInAction(String actionKey, String name, double d2, String str) {
        Intrinsics.checkNotNullParameter(actionKey, "actionKey");
        Intrinsics.checkNotNullParameter(name, "name");
        this.impl.reportDoubleValueInAction(actionKey, name, d2, str);
    }

    @ReactMethod
    public final void reportError(String errorName, String errorValue, String reason, String stacktrace, String str) {
        Intrinsics.checkNotNullParameter(errorName, "errorName");
        Intrinsics.checkNotNullParameter(errorValue, "errorValue");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(stacktrace, "stacktrace");
        this.impl.reportError(errorName, errorValue, reason, stacktrace, str);
    }

    @ReactMethod
    public final void reportErrorInAction(String key, String errorName, int i2, String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(errorName, "errorName");
        this.impl.reportErrorInAction(key, errorName, i2, str);
    }

    @ReactMethod
    public final void reportErrorWithoutStacktrace(String errorName, int i2, String str) {
        Intrinsics.checkNotNullParameter(errorName, "errorName");
        this.impl.reportErrorWithoutStacktrace(errorName, i2, str);
    }

    @ReactMethod
    public final void reportEventInAction(String actionKey, String name, String str) {
        Intrinsics.checkNotNullParameter(actionKey, "actionKey");
        Intrinsics.checkNotNullParameter(name, "name");
        this.impl.reportEventInAction(actionKey, name, str);
    }

    @ReactMethod
    public final void reportIntValueInAction(String actionKey, String name, int i2, String str) {
        Intrinsics.checkNotNullParameter(actionKey, "actionKey");
        Intrinsics.checkNotNullParameter(name, "name");
        this.impl.reportIntValueInAction(actionKey, name, i2, str);
    }

    @ReactMethod
    public final void reportStringValueInAction(String actionKey, String name, String value, String str) {
        Intrinsics.checkNotNullParameter(actionKey, "actionKey");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.impl.reportStringValueInAction(actionKey, name, value, str);
    }

    @ReactMethod
    public final void reportValue(String key, String valueName, String value, String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(valueName, "valueName");
        Intrinsics.checkNotNullParameter(value, "value");
        this.impl.reportValue(key, valueName, value, str);
    }

    @ReactMethod
    public final void sendBizEvent(String type, ReadableMap attributes, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.impl.sendBizEvent(type, attributes, str);
    }

    @ReactMethod
    public final void setBeaconHeaders(ReadableMap readableMap, String str) {
        this.impl.setBeaconHeaders(readableMap, str);
    }

    @ReactMethod
    public final void setCrashReportingOptedIn(boolean z2, String str) {
        this.impl.setCrashReportingOptedIn(z2, str);
    }

    @ReactMethod
    public final void setDataCollectionLevel(String collectionLevel, String str) {
        Intrinsics.checkNotNullParameter(collectionLevel, "collectionLevel");
        this.impl.setDataCollectionLevel(collectionLevel, str);
    }

    @ReactMethod
    public final void setGPSLocation(double d2, double d3, String str) {
        this.impl.setGPSLocation(d2, d3, str);
    }

    @ReactMethod
    public final void start(ReadableMap configuration, Promise promise) throws Throwable {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.impl.start(configuration, promise);
    }

    @ReactMethod
    public final void startView(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.impl.startView(name);
    }

    @ReactMethod
    public final void startWebRequestTiming(String str, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.impl.startWebRequestTiming(str, url);
    }

    @ReactMethod
    public final void stopView() {
        this.impl.stopView();
    }

    @ReactMethod
    public final void stopWebRequestTiming(String str, String url, int i2, String responseMessage) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(responseMessage, "responseMessage");
        this.impl.stopWebRequestTiming(str, url, i2, responseMessage);
    }

    @ReactMethod
    public final void stopWebRequestTimingWithSize(String str, String url, int i2, String responseMessage, double d2, double d3) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(responseMessage, "responseMessage");
        this.impl.stopWebRequestTimingWithSize(str, url, i2, responseMessage, (long) d2, (long) d3);
    }

    @ReactMethod
    public final void storeCrash(String errorName, String reason, String stacktrace) {
        Intrinsics.checkNotNullParameter(errorName, "errorName");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(stacktrace, "stacktrace");
    }
}
