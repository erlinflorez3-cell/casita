package com.dynatrace.agent.events.enrichment.sanitation;

import com.dynatrace.agent.communication.protocol.EventRequestEnvelope;
import com.dynatrace.agent.events.enrichment.EventKeys;
import com.dynatrace.agent.events.enrichment.JsonObjectExtensionsKt;
import com.dynatrace.agent.storage.preference.ServerConfigurationV4;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
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
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я.\u001d̉=!,i\bӵLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007njG6Le^.ZS0\u000fs{B0c$wES\"(Ԃ:\t}M\u0018k|Jr\u000bq\u00106\u001a\u0007lDI\u0004{\u000eF\u001d6Z OD]~k?žx@\u000b'B(>\u0002\u0015\u0003 0n\u0019\u0007\fSZ:\u001cضDz@Y\u001dS\u000b\"\"\bD&')li^6vk\f?Gq\u0011uZNU^`\u0001[\r^TU\u000e'e,-X7c\u0018U\b\u0011\u000bj\fO\u0014O\u0001k\u000bص+11P\u0004]<`\u0010\u0016\u001b1u\u0016m\u00046k3[ԃ\u001011VsQV\u00168y\u0001\u00023I\u0014\u0010\u0016'v-[\u001f-\bԭ7\u0003"}, d2 = {">da3b9FA\u001d\u0014zL(\u0006\r>a\u000f,\u0006I", "", "4h]._\fOS\"\u000e_l6\u0006", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "1n]3\\.", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@0BY~ Dm\u001f,M\r)kA/\u0015u?C\u0010d0P\u00074C[R6eCA\u0013", "=mB.a0MW.~y>=|\u0012>", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "3uT;g\u001aBh\u0019", "", "3uT;g\u0011L]\"Z\tL;\n\r8g", "6`]1_,\u001c`\u0015\r}H9\\\u0016<o\r\b\r@\n&", "8r^;F;KW\"\u0001", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class EventSizeSanitizerKt {
    private static final void handleCrashOrErrorEvent(JSONObject jSONObject, ServerConfigurationV4 serverConfigurationV4, Function2<? super Integer, ? super String, Unit> function2) throws JSONException {
        String strSubSequence;
        int maxBeaconSizeKib = (serverConfigurationV4.getMaxBeaconSizeKib() * 1024) - EventRequestEnvelope.INSTANCE.calculateEnvelopeSize(1);
        if (jSONObject.has(EventKeys.EXCEPTION.MESSAGE)) {
            String string = jSONObject.getString(EventKeys.EXCEPTION.MESSAGE);
            if (string.length() > 5000) {
                Intrinsics.checkNotNull(string);
                jSONObject.put(EventKeys.EXCEPTION.MESSAGE, StringsKt.take(string, 5000));
                Utility.devLog(OneAgentLoggingKt.TAG_EVENT_DISPATCHING, "trimmed exception message to 5000 characters");
            }
        }
        String string2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        byte[] bytes = string2.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        int length = bytes.length;
        if (!jSONObject.has(EventKeys.EXCEPTION.STACK_TRACE)) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_DISPATCHING, "encountered crash/anr event without stacktrace, dropping event");
            return;
        }
        if (length <= maxBeaconSizeKib) {
            function2.invoke(Integer.valueOf(length), string2);
            return;
        }
        int i2 = length - maxBeaconSizeKib;
        String string3 = jSONObject.getString(EventKeys.EXCEPTION.STACK_TRACE);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        byte[] bytes2 = string3.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
        int length2 = bytes2.length;
        String str = new String(ArraysKt.copyOfRange(bytes2, 0, length2 - i2), Charsets.UTF_8);
        int length3 = str.length() - 1;
        if (length3 >= 0) {
            while (true) {
                int i3 = length3 - 1;
                if (str.charAt(length3) != 65533) {
                    strSubSequence = str.subSequence(0, length3 + 1);
                    break;
                } else if (i3 < 0) {
                    break;
                } else {
                    length3 = i3;
                }
            }
        }
        String string4 = strSubSequence.toString();
        jSONObject.put(EventKeys.EXCEPTION.STACK_TRACE, string4);
        StringBuilder sb = new StringBuilder("trimmed stacktrace to a length of ");
        byte[] bytes3 = string4.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes3, "getBytes(...)");
        Utility.devLog(OneAgentLoggingKt.TAG_EVENT_DISPATCHING, sb.append(bytes3.length).append(" bytes (original: ").append(length2).append(" bytes)").toString());
        String string5 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
        byte[] bytes4 = string5.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes4, "getBytes(...)");
        function2.invoke(Integer.valueOf(bytes4.length), string5);
    }

    public static final void performSizeSanitation(JSONObject finalEventJson, ServerConfigurationV4 config, Function2<? super Integer, ? super String, Unit> onSanitizedEvent) throws JSONException {
        Intrinsics.checkNotNullParameter(finalEventJson, "finalEventJson");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(onSanitizedEvent, "onSanitizedEvent");
        if (JsonObjectExtensionsKt.hasCharacteristic(finalEventJson, EventKeys.Characteristics.HAS_CRASH) || JsonObjectExtensionsKt.hasCharacteristic(finalEventJson, EventKeys.Characteristics.HAS_ANR)) {
            handleCrashOrErrorEvent(finalEventJson, config, onSanitizedEvent);
            return;
        }
        String string = finalEventJson.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        byte[] bytes = string.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        int length = bytes.length;
        long maxEventSizeKib = ((long) config.getMaxEventSizeKib()) * 1024;
        if (length <= maxEventSizeKib) {
            onSanitizedEvent.invoke(Integer.valueOf(length), string);
        } else {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_DISPATCHING, "event is dropped because it is too big: " + length + " bytes (max: " + maxEventSizeKib + " bytes)");
        }
    }
}
