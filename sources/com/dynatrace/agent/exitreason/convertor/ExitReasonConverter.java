package com.dynatrace.agent.exitreason.convertor;

import android.app.ApplicationExitInfo;
import com.dynatrace.agent.events.enrichment.EventKeys;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import cz.msebera.android.httpclient.message.TokenParser;
import defpackage.BacktraceFrame;
import defpackage.Cause;
import defpackage.Signal;
import defpackage.Thread;
import defpackage.Tombstone;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.Charsets;
import kotlin.text.HexExtensionsKt;
import kotlin.text.HexFormat;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
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
@Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u000eӵLcz\u0005I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007lkA0ZeP\u008cZS8\u001bs{:$c$\u007fCCU \u0006*\t]pog|Pb\u000bY\u000f\u000e\u0016~m2կkތ\u000e\u0012=1\u0003tУ7Ou=Ga=F\u0013\"J$Nx3\u0004J.V\u0014\u000fzqPR\u0017xP~@j\u000fc\u0004H\u00156B.\u00056\\\u0016S|M5zH6;\u0003\u0018E~+m8\u0015M;O\u0005-\u001b\u0001y A?e@[$٨\u0007\u0007Xg\b\u001fM~U\u0005\u00175O+wv\b:f\b,\u0015YX=c\u00015t\u0007g_:2qO,]^\u001e@w)\n5<2\u00116+V6E\u001a\u0015\u0011T3=\u0005aQh\u0002\rP(z\u00109G)\u000e;C9Io\u0018a\u0004+\\I\u0014\u0005;,K\u0001\u001d$\fX\u001ch-\u001b\u0003\u0001\u00181\u001afK[f\n\bK\u0016\u0004\u001fe2.\u0012D_\u007f]\u0007A4%:O]O\"Ov2NJg\u0005\u001bxh\u0002t\u0019H\t2|-O,\u001f\u000b\tO\u0015\tyXlXZ\u001a\u0014\u001c\u001d1\f +,lyL!S*^Qxi\u0019h\f#M;v9in\u001a(g;n3cl\u0012)\u0012V\u00050W<\u0011\u001f\u001ff\u000ba\u001awt(P=xn\u001e\u0016\u0014D|\u0017Y2\bw*SD1G_[HҺ\"b"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001*\u001bV|\u000e8\u0005/>#{*@~\u0016;\\MH5\u00141\u0019wN9\u0003q6WT1P]N9kR\u007f\u0013", "", "\nh]6g\u0005", "u(E", "1n]CX9M/\"\f", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "/o_9\\*:b\u001d\t\u0004>?\u0001\u0018\u0013n\u00012", "\u001a`]1e6BRbz\u0006iuX\u0014:l\u0004&wO\u0005! '\u0003\u0012KZ.6cS", "1n]CX9M<\u0015\u000e~o,Z\u0016+s\u0003", ">`a@X\u0015:b\u001d\u0010z<9x\u00172", "Bn\\/f;H\\\u0019", "\u001aS^:U:M]\"~P", "3wXA<5?]w~\t\\9\u0001\u0014>i\n1", "", ">`a@X\u0015:b\u001d\u0010z<9x\u00172$}2\u0004:\u007f+ C~\u001b8t%/U\u007f @|\u0010;MJ;gB\u001e", ">tc\u001aX:LO\u001b~", "", "4`[9U(<Y\u0001~\tl(~\t", ">tc \\.GO \\\bZ:\u007fq+m\u007f", ">tc\u0012k*>^(\u0003\u0005g\u001b\u0011\u0014/", ">tc g(<Y\b\fv\\,", ">tc\u001cc;B]\"z\u0002", "9dh", "=oc6b5:Z\nz\u0002n,", "2q^=c,=:#\u0001", "3wc?T*M<\u0015\u000e~o,k\f<e{'\n$\n\u0018!", ";ne2E6Hb\b\u0002\b^({w9T\n3", "", "", "\u001aSW?X(=)", "9dh!b\u0014Hd\u0019", "3wc?T*MB\u001c\fzZ+\u000bl8f\n", "7m_Bg", "5d]2e(MSuz\t^\u0011\u000b\u00138", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ExitReasonConverter {
    private final String extractNativeThreadsInfo(Tombstone tombstone) {
        Map<Integer, Thread> threads = tombstone.getThreads();
        if (threads.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***\n");
        sb.append("ABI: " + tombstone.getArch().name());
        sb.append("\n");
        sb.append("Process uptime: " + tombstone.getProcess_uptime() + 's');
        sb.append("\n");
        if (!tombstone.getCommand_line().isEmpty()) {
            sb.append("Cmdline: " + tombstone.getCommand_line());
            sb.append("\n");
        }
        StringBuilder sbAppend = new StringBuilder("pid: ").append(tombstone.getPid()).append(", tid: ").append(tombstone.getTid()).append(", name: ");
        Thread thread = threads.get(Integer.valueOf(tombstone.getTid()));
        sb.append(sbAppend.append(thread != null ? thread.getName() : null).toString());
        sb.append("\n");
        Signal signal_info = tombstone.getSignal_info();
        if (signal_info != null) {
            sb.append("signal " + signal_info.getNumber() + " (" + signal_info.getName() + "), code " + signal_info.getCode() + " (" + signal_info.getCode_name() + "), fault addr " + HexExtensionsKt.toHexString$default(signal_info.getFault_address(), (HexFormat) null, 1, (Object) null));
            sb.append("\n");
        }
        Iterator<Map.Entry<Integer, Thread>> it = moveRootThreadToTop(MapsKt.toMutableMap(threads), tombstone.getTid()).entrySet().iterator();
        while (it.hasNext()) {
            Thread value = it.next().getValue();
            sb.append(value.getName() + AbstractJsonLexerKt.COLON);
            sb.append("\n");
            int i2 = 0;
            for (Object obj : value.getCurrent_backtrace()) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                BacktraceFrame backtraceFrame = (BacktraceFrame) obj;
                sb.append("      #" + StringsKt.padStart(String.valueOf(i2), 2, '0') + " pc " + HexExtensionsKt.toHexString$default(backtraceFrame.getRel_pc(), (HexFormat) null, 1, (Object) null) + TokenParser.SP + backtraceFrame.getFile_name() + " (" + backtraceFrame.getFunction_name() + '+' + backtraceFrame.getFunction_offset() + ") (BuildId: " + backtraceFrame.getBuild_id() + ')');
                sb.append("\n");
                i2 = i3;
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    private final String extractThreadsInfo(String str) {
        return SequencesKt.joinToString$default(SequencesKt.map(Regex.findAll$default(new Regex("(?ms)^\".*?(?=\\n\\s*(?:DumpLatency|\\s*$))"), str, 0, 2, null), new Function1() { // from class: com.dynatrace.agent.exitreason.convertor.ExitReasonConverter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ExitReasonConverter.extractThreadsInfo$lambda$10((MatchResult) obj);
            }
        }), "\n\n", null, null, 0, null, null, 62, null);
    }

    public static final String extractThreadsInfo$lambda$10(MatchResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getValue();
    }

    private final JSONObject generateBaseJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(EventKeys.Characteristics.HAS_ERROR, true);
        jSONObject.put(EventKeys.ERROR.IS_FATAL, true);
        return jSONObject;
    }

    private final Map<Integer, Thread> moveRootThreadToTop(Map<Integer, Thread> map, int i2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Thread thread = map.get(Integer.valueOf(i2));
        if (thread != null) {
            linkedHashMap.put(Integer.valueOf(i2), thread);
        }
        for (Map.Entry<Integer, Thread> entry : map.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            Thread value = entry.getValue();
            if (iIntValue != i2) {
                linkedHashMap.put(Integer.valueOf(iIntValue), value);
            }
        }
        return linkedHashMap;
    }

    private final void putExceptionType(JSONObject jSONObject, Tombstone tombstone) throws JSONException {
        String abort_message = tombstone.getAbort_message();
        String strSubstringBefore$default = null;
        if (abort_message.length() <= 0 || !StringsKt.startsWith$default(abort_message, "terminating with uncaught exception of type ", false, 2, (Object) null)) {
            abort_message = null;
        }
        if (abort_message != null) {
            String strSubstring = abort_message.substring("terminating with uncaught exception of type ".length());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            if (strSubstring != null) {
                strSubstringBefore$default = StringsKt.substringBefore$default(strSubstring, ": ", (String) null, 2, (Object) null);
            }
        }
        putOptional$default(this, jSONObject, EventKeys.EXCEPTION.TYPE, strSubstringBefore$default, null, 4, null);
    }

    private final void putMessage(JSONObject jSONObject, Tombstone tombstone, String str) throws JSONException {
        String name;
        String name2 = str;
        if (tombstone.getAbort_message().length() > 0) {
            name2 = tombstone.getAbort_message();
        } else if (tombstone.getCauses().isEmpty()) {
            Signal signal_info = tombstone.getSignal_info();
            if (signal_info != null && (name = signal_info.getName()) != null && name.length() > 0) {
                name2 = tombstone.getSignal_info().getName();
            } else if (tombstone.getSignal_info() != null && tombstone.getSignal_info().getNumber() != 0) {
                name2 = "signal " + tombstone.getSignal_info().getNumber();
            }
        } else {
            name2 = CollectionsKt.joinToString$default(tombstone.getCauses(), ". ", null, null, 0, null, new Function1() { // from class: com.dynatrace.agent.exitreason.convertor.ExitReasonConverter$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ExitReasonConverter.putMessage$lambda$4((Cause) obj);
                }
            }, 30, null);
        }
        putOptional$default(this, jSONObject, EventKeys.EXCEPTION.MESSAGE, name2, null, 4, null);
    }

    public static final CharSequence putMessage$lambda$4(Cause cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        return cause.getHuman_readable();
    }

    private final void putOptional(JSONObject jSONObject, String str, String str2, String str3) throws JSONException {
        if (str2 == null) {
            Utility.devLog(OneAgentLoggingKt.TAG_CRASH_TRACKER, str3);
        } else {
            jSONObject.put(str, str2);
        }
    }

    static /* synthetic */ void putOptional$default(ExitReasonConverter exitReasonConverter, JSONObject jSONObject, String str, String str2, String str3, int i2, Object obj) throws JSONException {
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            str3 = "key " + str + " dropped because extracted value is 'null'";
        }
        exitReasonConverter.putOptional(jSONObject, str, str2, str3);
    }

    private final void putSignalCrashName(JSONObject jSONObject, Tombstone tombstone) throws JSONException {
        Signal signal_info = tombstone.getSignal_info();
        String name = null;
        if (signal_info != null) {
            if (signal_info.getName().length() > 0) {
                name = signal_info.getName();
            } else if (signal_info.getNumber() != 0) {
                name = "signal " + signal_info.getNumber();
            }
        }
        putOptional$default(this, jSONObject, EventKeys.EXCEPTION.CRASH_SIGNAL, name, null, 4, null);
    }

    private final void putStackTrace(JSONObject jSONObject, Tombstone tombstone) throws JSONException {
        putOptional(jSONObject, EventKeys.EXCEPTION.STACK_TRACE, extractNativeThreadsInfo(tombstone), "native crash threads cannot be extracted");
    }

    public final JSONObject convertAnr(ApplicationExitInfo applicationExitInfo) throws IOException {
        Intrinsics.checkNotNullParameter(applicationExitInfo, "applicationExitInfo");
        Utility.devLog(OneAgentLoggingKt.TAG_CRASH_TRACKER, "anr " + applicationExitInfo);
        try {
            JSONObject jSONObjectGenerateBaseJson = generateBaseJson();
            jSONObjectGenerateBaseJson.put(EventKeys.Characteristics.HAS_ANR, true);
            if (applicationExitInfo.getDescription() != null) {
                jSONObjectGenerateBaseJson.put(EventKeys.EXCEPTION.MESSAGE, applicationExitInfo.getDescription());
            }
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                Reader inputStreamReader = new InputStreamReader(traceInputStream, Charsets.UTF_8);
                BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                try {
                    String text = TextStreamsKt.readText(bufferedReader);
                    CloseableKt.closeFinally(bufferedReader, null);
                    String strExtractThreadsInfo = extractThreadsInfo(text);
                    if (strExtractThreadsInfo.length() > 0) {
                        jSONObjectGenerateBaseJson.put(EventKeys.EXCEPTION.STACK_TRACE, strExtractThreadsInfo);
                    } else {
                        Utility.devLog(OneAgentLoggingKt.TAG_CRASH_TRACKER, "anr threads don't match pattern");
                    }
                } finally {
                }
            }
            return jSONObjectGenerateBaseJson;
        } catch (JSONException unused) {
            Utility.devLog(OneAgentLoggingKt.TAG_CRASH_TRACKER, "anr event cannot be created");
            return null;
        }
    }

    public final JSONObject convertNativeCrash(ApplicationExitInfo applicationExitInfo) {
        Intrinsics.checkNotNullParameter(applicationExitInfo, "applicationExitInfo");
        Utility.devLog(OneAgentLoggingKt.TAG_CRASH_TRACKER, "native crash " + applicationExitInfo);
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            Tombstone tombstoneDecode = traceInputStream != null ? Tombstone.ADAPTER.decode(traceInputStream) : null;
            if (tombstoneDecode != null) {
                return parseNativeCrash$com_dynatrace_agent_release(tombstoneDecode, applicationExitInfo.getDescription());
            }
            JSONObject jSONObjectGenerateBaseJson = generateBaseJson();
            jSONObjectGenerateBaseJson.put(EventKeys.Characteristics.HAS_CRASH, true);
            putOptional(jSONObjectGenerateBaseJson, EventKeys.EXCEPTION.MESSAGE, applicationExitInfo.getDescription(), "applicationExitInfo.description is null");
            return jSONObjectGenerateBaseJson;
        } catch (Exception unused) {
            Utility.devLog(OneAgentLoggingKt.TAG_CRASH_TRACKER, "native crash event cannot be created");
            return null;
        }
    }

    public final JSONObject parseNativeCrash$com_dynatrace_agent_release(Tombstone tombstone, String str) throws JSONException {
        Intrinsics.checkNotNullParameter(tombstone, "tombstone");
        JSONObject jSONObjectGenerateBaseJson = generateBaseJson();
        jSONObjectGenerateBaseJson.put(EventKeys.Characteristics.HAS_CRASH, true);
        putMessage(jSONObjectGenerateBaseJson, tombstone, str);
        putSignalCrashName(jSONObjectGenerateBaseJson, tombstone);
        putExceptionType(jSONObjectGenerateBaseJson, tombstone);
        putStackTrace(jSONObjectGenerateBaseJson, tombstone);
        return jSONObjectGenerateBaseJson;
    }
}
