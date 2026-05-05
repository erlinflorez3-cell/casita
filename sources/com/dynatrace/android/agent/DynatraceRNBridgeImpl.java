package com.dynatrace.android.agent;

import android.location.Location;
import com.biocatch.android.commonsdk.configuration.ConfigurationFields;
import com.dynatrace.android.agent.conf.DataCollectionLevel;
import com.dynatrace.android.agent.conf.DynatraceConfigurationBuilder;
import com.dynatrace.android.agent.conf.UserPrivacyOptions;
import com.dynatrace.android.agent.crash.PlatformType;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableMap;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
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
@Metadata(bv = {}, d1 = {"Яx\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njO0LeV:ZS@\u000fs{J$cҕyCIw\"Ԃ*\teNo˧vJh\u000bK\u000f\f\u0017\u0001jBI]xc\u001d\u00172XoG3SrE9vt>\u0005&8*8\b\u000e\t\u001a0I\u0018v\tGS\f\u0018:HpHX\u0015M\u000b5\u001a\u0006L'\t\u001ebgdȤxl\f9o6\u0013mPN?_^}]\u0011TV?\r%dӿ/@E9]1a\u0011\u001fR\nN3C\u007fM\u001dhU.s_\u0002hNX.#E/]\u001furTo5Wn ?-ebyWV>\u0006\u0010\u0014\rj\u0013>\n5^F-Hm8\u0014A\t\u000bUVO0e\u000b\u000e\txN\u0017S\u000fc1G/~Sw:GU\u007f\u001a\u0013%6#/}Q_b'x\u0015I[(U?gX=vU:_K\u0002\u001crx\u0001X\u000bxe\u000eI\u0014\u0011\\&U;iR;!\u001a\txHu\r\u001d`\u0017Z\u001aXVT:p,6X\u0010T\u0001R\u007f\u001dk~c\t0\u001ff4T5\u00058\u0017.r\u0010<O,@R]\u0005\u0002j{d:+=zO[\u0005j<^\u0002lARic>p\u0003|\"STd\u001bW\u0015I\u001c hz@\"`W\u001b\u0014\u0006\u001b\\N:&bC\u007f<L,_:%!V%6Bo\f9ch\b(~\u0003Fl\u0013wG\r\u000b\u0017O\u000bx k\u0007_D|\u000f)sA\u001aE'Jm.x6\r#5\u0006\u0004\u0002WgzFzw^\fc!8\u0016HH\u00025K''\u0001?104uP\u0001\fiM@NC\u0019\b7Sh\\v8n~BxjxV\u0005\u001b0 vrQ\u000f\u0015\u0004\b\b^zu\u000b\u001d!ihar1hlTF\u0011\u001d!4$/vR\u0001CS['K=@*=@y]\u0018~^}p;>t\u0014\u000b\\i$\u0004zSs1i?\u0012o\rk:$\u001b\u0012rNx\f D\u001f3;:xEr\u0017n8{2w\u001ct5D\r\u001fe\f>!\u0006\u00164\\fZwQ-,^qUASa{\u0006oa[9QW \u0019-In@+m$dpz\t^\r$\u001cDWSb3CO$|8J:#C\u0003x6\u0014\t3^_=Kzp\u0002pn\u000e\u0003\b\rZV;xE\u000f(Z\u0005\rFK\u001e'<a\t{~l/\u001291W+B3j}/\u0017+9Xl;1'\u0007\bSkk}a\u0002d\u0013w-{'\b\ff\u001f-!P139\u007f\u0018\u0010z>\u001b#U\u0013\u0003\u0015| zjP8(-\u0002E<JG'\u000bG^#spcdN&>s\u001e\u000fU\\)5\u0013-gTRE\u0006c4mMxL?{\u0006Zk\u0004\u001648)\u001asOc 4tIu\u001bh%\"\u001ap\u0018!\u0013~'42X+\u000b\n\\\u000ffS\u0010s\u001a\u0013\r\u001b\u001c}/T?-\u0003\u0005pR1\u0017\u0018&\u0005c\u001dd;\u0007tgny\u001d4\u0001!\u0017ge.A\u001a\u000b@\u001fg8Z'~B\u001cn=DKz)>^\u0014l~'g[;2_o8zI0\u0001%.%\b\n\u001c,j'CB\u001fsL)!\\\u001bQ\b\u0012l&@d#\u0013Y\u0018\u000b\u0018`^?\u001adJ\u0001Z|/eZOa\u001b[x\t\u001aDw-iW`\u000537`\u001a ,\u0005L\u001b:\u0011{0.P\"\u000b\u007f\u00163]Jby2'\b+\u001ej\u0011:cGNA63Y4\u001fur8NM\r\u001e*Qi3o A\u0005#\u007f\u001eo5 en_\u0010=*/\u00041\u0013M\u000eImPreykM\u001d83W\u0015JU9s\u0016?\f0lz\u0003[\u0003n\u000f\u0010?y;S2\u0012WV~8&l<\u0014@;\u007fs@x0m(XX\nV29Z<|X;I\u0003w\"\u0011t\u007f&@|[\u0010Cq~\"f\\>X]\u001d\rSa\u0001{!C;L\\M\u001dTA3E\f@S\u007f\u0010CI!T_bkP+u\u001a9`h~\u0018U\u0011q*4<BXq<\u0003m\u007f\u0014@< _%\u0004&e\u0003f\u000et5\u001a=J%M~l\u0007!Yb9p?*lBZ\u000e!\u0005D5\u000f\u0017J\u0014X5-\u0013aV$GUgn}7\u001c?nU\n3\u000e\u0003Gm|:dK\u0010K\u000b\u001cY\t9su\u001dUOR-A#W\u0003+\\V\u0007D(\u0003p\b$D\u0013O@H\u0007m@m^7xT\r4[]/+gcco}~`qgariC9mm\u0001\\S1\u0007+\u001b\u0010o C\u000f,/Q2Q5=5LX \\w\\E$Wm\u001bax0_\fM\bYM\u0003U\u0014FI[M($ U+6\u00172>\u007f\u0013\u0018ORc\u0011)NVWO{]\u001fEZj=Z%\u0010<lPU4\u001dV\u001dp\u001eM;\u000eC\u0003ȫrŇKOrɸz\u0012}k\ry]G;uGEAu!ee^Bv\u007fbAL'Y6@A\t*!6c\u0012GW8u^:ݚlԷX`\u0019מ\u0005\u0004>n\u0012~vfNclCXn)f}\u0005I\\\u001bЁ\u000bɅtHIŖ3x:'NH\u0019\u001aW;Mڼ\u001b\u0014?ݮGKu?R>q$c]SNZ\b\u001ej\u0010\u0005C\u0002F?F\u000f\u007f,+\u001c\u0015@vr2ycV\u0007ʝmΘ6Fbݰ̡1<"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0013Io\u0017K@\u0004Iby/Di\u0014.:,\u0018x8\u001d\u0017hEA\u0012j\u0002", "", "@dP0g\bI^ \u0003xZ;\u0001\u00138C\n1\u000b@\u0014&", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3hY+Bt\u001a,IR?u={\u001fqp9\u001ar\u0002", "-h]AX9GO ", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0013Io\u0017K@\u0004Iby/Di\u0014.1LJkA'\u0011oIC\u0006s3NL", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1W\r{Bx\u001d2K?Jo>'rrjH\u0007v;$]%QT\u0018+p[nL!\u000eX\u000e\u0018'\u0016\u0004fK(m\u000e3!\b5XK\u001a|\n\b%\u001b1hp&_\u001fG\u0007\u001eqH\u0011rEify\u001d\u00056", "/bc6b5L", "\u001aiPCTuNb\u001d\u0006DA(\u000b\f\u0017a\u000b}", "", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0013Io\u0017K@\u0004$LY\u001eFq 7#", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E#|%\u001a/k\u0019\u0012", "1n]@g(Gb'", "", "EdQ!\\4B\\\u001b\r", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0013Io\u0017K@\u00175Vj C}\u0016<\\2?s8'\u0017>", "/cS\u0019\\:MS\"~\b", "", "3uT;g\u0015:[\u0019", "/o_9l\u001cLS&i\bb=x\u0007CO\u000b7\u007fJ\n%", "CrT?C9Bd\u0015|\u000fH7\f\r9n\u000e", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", ">kPAY6K[", "1`]0X3\u001aQ(\u0003\u0005g", "9dh", "3mS#\\:Bb", "3mc2e\b<b\u001d\t\u0004", "<`\\2", "3mc2e\u0014:\\)z\u0002:*\f\r9n", "3mc2e\u0014:\\)z\u0002:*\f\r9nq,\u000bCk\u0013$Gx\u001d", ">`a2a;$S-", "4kd@[\fOS\"\u000e\t", "4naDT9=/$\nhm(\n\u0018\u000fv\u007f1\u000b", "/sc?\\)Nb\u0019\r", "/o_ g(Kb~~\u000fl", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7I#;IW\u0011", "4naDT9=3*~\u0004m", "5dc\u000eV;B]\"", "5dc\u0010b5Lb\u0015\b\nl", "5dc\u0011T;:1#\u0006\u0002^*\f\r9nf(\r@\b", ">q^:\\:>", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW'\u0004/=]\f \r", "5dc\u001fX8NS'\u000eiZ.", "Cq[", "5dc\"f,K>&\u0003\fZ*\u0011r:t\u00042\u0005N", "7cT;g0?g\t\rzk", "CrT?", "7r2?T:A@\u0019\n\u0005k;\u0001\u00121O\u000b7{?d ", ":dPCX\b<b\u001d\t\u0004", ":dPCX", "", "<df\u000eV;B]\"", "@d\\<i,%W'\u000ezg,\n\u0017", "1nd;g", "", "@d_<e;\u001c`\u0015\r}", "3qa<e\u0015:[\u0019", "@dP@b5", "AsP0^;KO\u0017~", "7rA2T3\u001e`&\t\b", "@d_<e;\u001d]){\u0002^\u001dx\u0010?ec1W>\u0010\u001b!P", "/bc6b5$S-", "D`[BX", "@d_<e;\u001e`&\t\b", "3qa<e\u001d:Z)~", "@d_<e;\u001e`&\t\bB5X\u0007>i\n1", "3qa<e\nHR\u0019", "", "@d_<e;\u001e`&\t\bP0\f\f9u\u000f\u0016\u000b<~\u001d&Tk\f<", "@d_<e;\u001ed\u0019\b\nB5X\u0007>i\n1", "@d_<e;\"\\(ove<|l8A}7\u007fJ\n", "@d_<e;,b&\u0003\u0004`\u001dx\u0010?ec1W>\u0010\u001b!P", "@d_<e;/O \u000fz", "D`[BX\u0015:[\u0019", "Ad]150S3*~\u0004m", "Bx_2", "Adc\u000fX(<]\"azZ+|\u0016=", "6dP1X9L", "Adc\u0010e(LV\u0006~\u0006h9\f\r8gi3\u000b@\u007fz ", "1qP@[\u0019>^#\f\nb5~", "Adc\u0011T;:1#\u0006\u0002^*\f\r9nf(\r@\b", "1n[9X*MW#\ba^=|\u0010", "Adc\u0014C\u001a%]\u0017z\nb6\u0006", ":`c", ":mV", "Ag^B_+0]&\u0005dg\b\u0006\b<o\u0004'", "AsP?g", "1n]3\\.N`\u0015\u000e~h5", "AsP?g\u001dBS+", "AsP?g\u001e>P\u0006~\u0007n,\u000b\u0018\u001ei\b,\u0005B", "@d`BX:MB\u0015\u0001", "As^=I0>e", "As^=J,;@\u0019\u000b\u000b^:\fw3m\u00041}", "@db=b5LSv\ty^", "@db=b5LS\u0001~\tl(~\t", "As^=J,;@\u0019\u000b\u000b^:\fw3m\u00041}2\u0005&\u001a5s#<", "@d`BX:MA\u001d\u0014z", "", "@db=b5LS\u0007\u0003\u0010^", "2x].g9:Q\u0019x\b^(z\u0018vn{7\u007fQ\u0001^\"N\u007f\u0010@\u007f\u001fBY\u0005 3{\u0016"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class DynatraceRNBridgeImpl {
    private final DynatraceInternalModule _internal;
    private final HashMap<String, DTXAction> actions;
    private final Map<String, String> constants;
    private final ReactApplicationContext reactApplicationContext;
    private final HashMap<String, WebRequestTiming> webTimings;

    public DynatraceRNBridgeImpl(ReactApplicationContext reactApplicationContext, DynatraceInternalModule _internal) {
        Intrinsics.checkNotNullParameter(reactApplicationContext, "reactApplicationContext");
        Intrinsics.checkNotNullParameter(_internal, "_internal");
        this.reactApplicationContext = reactApplicationContext;
        this._internal = _internal;
        this.webTimings = new HashMap<>();
        this.actions = new HashMap<>();
        this.constants = MapsKt.mapOf(TuplesKt.to("PLATFORM_ANDROID", "android"), TuplesKt.to("PLATFORM_IOS", "ios"), TuplesKt.to("DATA_COLLECTION_OFF", "OFF"), TuplesKt.to("DATA_COLLECTION_PERFORMANCE", "PERFORMANCE"), TuplesKt.to("DATA_COLLECTION_USERBEHAVIOR", "USER_BEHAVIOR"));
    }

    private final DTXAction getAction(String str) {
        return this.actions.get(str);
    }

    private final void newAction(String str, String str2) {
        this.actions.put(str2, this._internal.enterAction(str));
    }

    private final boolean shouldWorkOnAndroid(String str) {
        return str == null || Intrinsics.areEqual(str, "android") || Intrinsics.areEqual(str, "");
    }

    public final void addListener(String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
    }

    public final void applyUserPrivacyOptions(ReadableMap userPrivacyOptions, String str) {
        Intrinsics.checkNotNullParameter(userPrivacyOptions, "userPrivacyOptions");
        if (shouldWorkOnAndroid(str)) {
            UserPrivacyOptions.Builder builder = UserPrivacyOptions.builder();
            builder.withCrashReportingOptedIn(userPrivacyOptions.getBoolean("_crashReportingOptedIn"));
            String string = userPrivacyOptions.getString("_dataCollectionLevel");
            Intrinsics.checkNotNull(string);
            builder.withDataCollectionLevel(DataCollectionLevel.valueOf(string));
            Dynatrace.applyUserPrivacyOptions(builder.build());
        }
    }

    public final void cancelAction(String key, String str) {
        DTXAction action;
        Intrinsics.checkNotNullParameter(key, "key");
        if (!shouldWorkOnAndroid(str) || (action = getAction(key)) == null) {
            return;
        }
        action.cancel();
        this.actions.remove(key);
    }

    public final void endVisit(String str) {
        if (shouldWorkOnAndroid(str)) {
            Dynatrace.endVisit();
        }
    }

    public final void enterAction(String name, String key, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(key, "key");
        if (shouldWorkOnAndroid(str)) {
            newAction(name, key);
        }
    }

    public final void enterManualAction(String name, String key, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(key, "key");
        if (shouldWorkOnAndroid(str)) {
            this.actions.put(key, Dynatrace.enterAction(name));
        }
    }

    public final void enterManualActionWithParent(String name, String key, String parentKey, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(parentKey, "parentKey");
        if (shouldWorkOnAndroid(str)) {
            DTXAction dTXAction = this.actions.get(parentKey);
            if (dTXAction != null) {
                this.actions.put(key, Dynatrace.enterAction(name, dTXAction));
            } else {
                enterManualAction(name, key, str);
            }
        }
    }

    public final void flushEvents(String str) {
        if (shouldWorkOnAndroid(str)) {
            Dynatrace.flushEvents();
        }
    }

    public final void forwardAppStartEvent(ReadableMap attributes, ReadableArray appStartKeys) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(appStartKeys, "appStartKeys");
        JSONObject jSONObject = new JSONObject(DynatraceUtils.INSTANCE.toHashMap(attributes));
        ArrayList<Object> arrayList = appStartKeys.toArrayList();
        Intrinsics.checkNotNull(arrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
        HybridBridge.forwardAppStartEvent(jSONObject, arrayList);
    }

    public final void forwardEvent(ReadableMap attributes) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        HybridBridge.forwardEvent(new JSONObject(DynatraceUtils.INSTANCE.toHashMap(attributes)));
    }

    public final Map<String, Object> getConstants() {
        return this.constants;
    }

    public final void getDataCollectionLevel(String str, Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (shouldWorkOnAndroid(str)) {
            promise.resolve(Dynatrace.getDataCollectionLevel().name());
        }
    }

    public final void getRequestTag(String key, String url, Promise promise) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(promise, "promise");
        DTXAction action = getAction(key);
        if (action == null) {
            promise.resolve(Dynatrace.getRequestTag());
        } else {
            promise.resolve(action.getRequestTag());
        }
    }

    public final void getUserPrivacyOptions(String str, Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (shouldWorkOnAndroid(str)) {
            UserPrivacyOptions userPrivacyOptions = Dynatrace.getUserPrivacyOptions();
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("dataCollectionLevel", userPrivacyOptions.getDataCollectionLevel().name());
            writableMapCreateMap.putBoolean("crashReportingOptedIn", userPrivacyOptions.isCrashReportingOptedIn());
            promise.resolve(writableMapCreateMap);
        }
    }

    public final void identifyUser(String user, String str) {
        Intrinsics.checkNotNullParameter(user, "user");
        if (shouldWorkOnAndroid(str)) {
            Dynatrace.identifyUser(user);
        }
    }

    public final void isCrashReportingOptedIn(String str, Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (shouldWorkOnAndroid(str)) {
            promise.resolve(Boolean.valueOf(Dynatrace.isCrashReportingOptedIn()));
        }
    }

    public final void leaveAction(String key, boolean z2, String str) {
        DTXAction action;
        Intrinsics.checkNotNullParameter(key, "key");
        if (!shouldWorkOnAndroid(str) || (action = getAction(key)) == null) {
            return;
        }
        if (action instanceof DTXAutoAction) {
            ((DTXAutoAction) action).startTimer();
        } else {
            action.leaveAction();
        }
        this.actions.remove(key);
    }

    public final void removeListeners(double d2) {
    }

    public final void reportCrash(String errorName, String reason, String stacktrace, boolean z2, String str) {
        Intrinsics.checkNotNullParameter(errorName, "errorName");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(stacktrace, "stacktrace");
        if (shouldWorkOnAndroid(str)) {
            Dynatrace.reportCrash(z2 ? PlatformType.JAVA_SCRIPT : PlatformType.CUSTOM, errorName, reason, stacktrace);
            Dynatrace.createNewSession();
        }
    }

    public final void reportDoubleValueInAction(String actionKey, String name, double d2, String str) {
        DTXAction action;
        Intrinsics.checkNotNullParameter(actionKey, "actionKey");
        Intrinsics.checkNotNullParameter(name, "name");
        if (!shouldWorkOnAndroid(str) || (action = getAction(actionKey)) == null) {
            return;
        }
        action.reportValue(name, d2);
    }

    public final void reportError(String errorName, String errorValue, String reason, String stacktrace, String str) {
        Intrinsics.checkNotNullParameter(errorName, "errorName");
        Intrinsics.checkNotNullParameter(errorValue, "errorValue");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(stacktrace, "stacktrace");
        if (shouldWorkOnAndroid(str)) {
            Dynatrace.reportError(PlatformType.CUSTOM, errorName, errorValue, reason, stacktrace);
        }
    }

    public final void reportErrorInAction(String key, String errorName, int i2, String str) {
        DTXAction action;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(errorName, "errorName");
        if (!shouldWorkOnAndroid(str) || (action = getAction(key)) == null) {
            return;
        }
        action.reportError(errorName, i2);
    }

    public final void reportErrorWithoutStacktrace(String errorName, int i2, String str) {
        Intrinsics.checkNotNullParameter(errorName, "errorName");
        if (shouldWorkOnAndroid(str)) {
            Dynatrace.internalReportError(errorName, i2);
        }
    }

    public final void reportEventInAction(String actionKey, String name, String str) {
        DTXAction action;
        Intrinsics.checkNotNullParameter(actionKey, "actionKey");
        Intrinsics.checkNotNullParameter(name, "name");
        if (!shouldWorkOnAndroid(str) || (action = getAction(actionKey)) == null) {
            return;
        }
        action.reportEvent(name);
    }

    public final void reportIntValueInAction(String actionKey, String name, int i2, String str) {
        DTXAction action;
        Intrinsics.checkNotNullParameter(actionKey, "actionKey");
        Intrinsics.checkNotNullParameter(name, "name");
        if (!shouldWorkOnAndroid(str) || (action = getAction(actionKey)) == null) {
            return;
        }
        action.reportValue(name, i2);
    }

    public final void reportStringValueInAction(String actionKey, String name, String value, String str) {
        DTXAction action;
        Intrinsics.checkNotNullParameter(actionKey, "actionKey");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!shouldWorkOnAndroid(str) || (action = getAction(actionKey)) == null) {
            return;
        }
        action.reportValue(name, value);
    }

    public final void reportValue(String key, String valueName, String value, String str) {
        DTXAction action;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(valueName, "valueName");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!shouldWorkOnAndroid(str) || (action = getAction(key)) == null) {
            return;
        }
        action.reportValue(valueName, value);
    }

    public final void sendBizEvent(String type, ReadableMap attributes, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        if (shouldWorkOnAndroid(str)) {
            Dynatrace.sendBizEvent(type, new JSONObject(DynatraceUtils.INSTANCE.toHashMap(attributes)));
        }
    }

    public final void setBeaconHeaders(ReadableMap readableMap, String str) {
        if (shouldWorkOnAndroid(str)) {
            if (readableMap == null) {
                Dynatrace.setBeaconHeaders(null);
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                linkedHashMap.put(strNextKey, readableMap.getString(strNextKey));
            }
            Dynatrace.setBeaconHeaders(linkedHashMap);
        }
    }

    public final void setCrashReportingOptedIn(boolean z2, String str) {
        if (shouldWorkOnAndroid(str)) {
            Dynatrace.setCrashReportingOptedIn(z2);
        }
    }

    public final void setDataCollectionLevel(String collectionLevel, String str) {
        Intrinsics.checkNotNullParameter(collectionLevel, "collectionLevel");
        if (shouldWorkOnAndroid(str)) {
            Dynatrace.setDataCollectionLevel(DataCollectionLevel.valueOf(collectionLevel));
        }
    }

    public final void setGPSLocation(double d2, double d3, String str) {
        if (shouldWorkOnAndroid(str)) {
            Location location = new Location("");
            location.setLatitude(d2);
            location.setLongitude(d3);
            Dynatrace.setGpsLocation(location);
        }
    }

    public final void start(ReadableMap readableMap, Promise promise) throws Throwable {
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (readableMap == null) {
            promise.resolve(false);
            return;
        }
        if (readableMap.getString("applicationId") == null || readableMap.getString("beaconUrl") == null) {
            promise.resolve(false);
            return;
        }
        DynatraceConfigurationBuilder dynatraceConfigurationBuilder = new DynatraceConfigurationBuilder(readableMap.getString("applicationId"), readableMap.getString("beaconUrl"));
        dynatraceConfigurationBuilder.withUserOptIn(readableMap.getBoolean("userOptIn"));
        dynatraceConfigurationBuilder.withCrashReporting(readableMap.getBoolean("reportCrash"));
        dynatraceConfigurationBuilder.withDebugLogging(readableMap.getInt(ConfigurationFields.logLevel) == 0);
        Dynatrace.startup(this.reactApplicationContext, dynatraceConfigurationBuilder.buildConfiguration());
        promise.resolve(true);
    }

    public final void startView(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Dynatrace.startView(name);
    }

    public final void startWebRequestTiming(String str, String url) {
        WebRequestTiming webRequestTiming;
        Intrinsics.checkNotNullParameter(url, "url");
        if (str == null || (webRequestTiming = Dynatrace.getWebRequestTiming(str)) == null) {
            return;
        }
        this.webTimings.put(str, webRequestTiming);
        webRequestTiming.startWebRequestTiming();
    }

    public final void stopView() {
        Dynatrace.stopView();
    }

    public final void stopWebRequestTiming(String str, String url, int i2, String responseMessage) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(responseMessage, "responseMessage");
        stopWebRequestTimingWithSize(str, url, i2, responseMessage, -1L, -1L);
    }

    public final void stopWebRequestTimingWithSize(String str, String url, int i2, String responseMessage, long j2, long j3) {
        WebRequestTiming webRequestTiming;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(responseMessage, "responseMessage");
        if (str == null || (webRequestTiming = this.webTimings.get(str)) == null) {
            return;
        }
        try {
            webRequestTiming.stopWebRequestTiming(new URI(url), i2, responseMessage, j2, j3);
            this.webTimings.remove(str);
        } catch (URISyntaxException unused) {
        }
    }
}
