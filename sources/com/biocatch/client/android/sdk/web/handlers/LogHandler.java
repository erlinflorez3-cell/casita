package com.biocatch.client.android.sdk.web.handlers;

import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.biocatch.android.commonsdk.core.performance.PerfCounterEntryFactory;
import com.biocatch.android.commonsdk.logging.ELogLevel;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.android.commonsdk.wrappers.JsonFactory;
import com.npmdavi.davinotification.Constant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
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
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0JeP.`_2\u000fq|<$i$yّCU0}*\tUPog\u0005Jb\u000bI\u000f\fǝ\u000f̓\\I\u0004w\u001e-\u001f6PoW3{pM=nvN\u0005N52<\b\t\u0019\u001aXMǘzzQQT >K\t:\u0001\u0019}\t(\u001f\u001e>N\u000fd\\0\\DW\u0005]h;S\u0007wRf'\u000e>CMU`b8%v\u0010*[FEG-'i\u00025e\fE\u0011S\n?\u001bgU/q]DcD\\\u0018\u0014C0&\u0558_ę*\\\rĩ1\u00185+gcyQdߍyߡ\u007f\rDǉ^\u00185OF-Hn>b\nϖtՂDT\u001a`H\t\tk\u0007#3\u0002K+g\u001e=Ϣcޅ\u001dN?ަ̅\u00113"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G27j_1IL:r4+#2HC\tF(Wu.GY$", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G27j_1IL:r4+#2S9\u0004T0N\t\nCUM3\\_H", ":nV", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\u0005*9o\u001a7O\r\"u6s", ">da366N\\(~\b?(z\u00189r\u0014", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_9MP<uA&\u0011q_9PN,[w\u0005Q\\W;\\_RF#\u001fnnJ)\u001c\u000ffUy", "8r^;9(<b#\f\u000f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\u0010-3x!.ZQ\u0005PB(\u001eI]7\u0016m9bL", "uKR<`u;W#|vm*\u007fR+n~5\u0006D\u007f`\u0015Qw\u0016F\u007f34_G'Ao\u00182VE\u0005R> jO_C\u000f-)R\u0001%C[L/&N{<!\u001c^\r\u0018)\u0017\raK-|C=h\u00066V\u0002\u0005s\u0001\u0019\u0017\u0018BrlKT\u0010\u0011d\u0015\u0003B\u0007rVbnyT!Nq7xl[\u001bkDG8iX\u0017%p\u001a+\u000e\u0006Q\r\u0002P|1cP\u0018\bB(=7YPMw_E\u0003&%\u0015\u000e\u0005\u000e=ct8\u0003vhB4?E\u0001Iv\"KrNX\u001d", "<`\\2", "", "5dc\u001bT4>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "/cS\u0019b.\u001e\\(\f\u000f", "", "3mc?l", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "/cS\u001dX9?1#\u000f\u0004m,\nh8t\r<", "2`c.", "6`]1_,&S'\rv`,", "EdQ#\\,P", "\u001a`]1e6BRb\u0011z[2\u0001\u0018xW\u007f%lD\u0001)l", ";db@T.>2\u0015\u000ev", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class LogHandler implements WebViewHandler {
    private final JsonFactory jsonFactory;
    private final Log log;
    private final PerfCounterEntryFactory perfCounterFactory;

    public LogHandler(Log log, PerfCounterEntryFactory perfCounterFactory, JsonFactory jsonFactory) {
        Intrinsics.checkNotNullParameter(log, "log");
        Intrinsics.checkNotNullParameter(perfCounterFactory, "perfCounterFactory");
        Intrinsics.checkNotNullParameter(jsonFactory, "jsonFactory");
        this.log = log;
        this.perfCounterFactory = perfCounterFactory;
        this.jsonFactory = jsonFactory;
    }

    private final void addLogEntry(JSONObject jSONObject) throws JSONException {
        if (!jSONObject.has("level") || !jSONObject.has(NotificationCompat.CATEGORY_MESSAGE) || !jSONObject.has("url")) {
            this.log.warning("web log message missing parameters: " + jSONObject);
            return;
        }
        this.log.newEntry(ELogLevel.Companion.getLevel(jSONObject.getInt("level")), jSONObject.getString(NotificationCompat.CATEGORY_MESSAGE), jSONObject.getString("url"));
    }

    private final void addPerfCounterEntry(JSONObject jSONObject) throws JSONException {
        if (!jSONObject.has("name") || !jSONObject.has("orig") || !jSONObject.has("val")) {
            this.log.warning("web perfCounter message missing parameters: " + jSONObject);
            return;
        }
        this.log.logPerfCounter(this.perfCounterFactory.getPerfCounterEntry(jSONObject.getString("name"), jSONObject.getDouble("val"), jSONObject.getString("orig")));
    }

    @Override // com.biocatch.client.android.sdk.web.handlers.WebViewHandler
    public String getName() {
        return "logPerfSlave";
    }

    @Override // com.biocatch.client.android.sdk.web.handlers.WebViewHandler
    public void handleMessage(WebView webView, String str) {
        Log log;
        String str2;
        if (str == null) {
            this.log.error("Received a log message with no log data, from slave js.");
            return;
        }
        try {
            JSONObject json = this.jsonFactory.parseJson(str);
            if (json.has("eventName") && json.has("data")) {
                JSONObject data = json.getJSONObject("data");
                String string = json.getString("eventName");
                if (Intrinsics.areEqual(string, Constant.NOTIFICATION_DETAILS_LOG)) {
                    Intrinsics.checkNotNullExpressionValue(data, "data");
                    addLogEntry(data);
                    return;
                } else if (Intrinsics.areEqual(string, "perf")) {
                    Intrinsics.checkNotNullExpressionValue(data, "data");
                    addPerfCounterEntry(data);
                    return;
                } else {
                    log = this.log;
                    str2 = "WebView log message with unknown or without eventName field";
                }
            } else {
                log = this.log;
                str2 = "web log message missing parameters: " + json;
            }
            log.warning(str2);
        } catch (JSONException e2) {
            this.log.error("error parsing log message from WebView", e2);
        }
    }
}
