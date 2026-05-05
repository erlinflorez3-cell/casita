package com.dynatrace.agent.events.error;

import com.dynatrace.agent.events.EventFieldsProvider;
import com.dynatrace.agent.events.enrichment.EventKeys;
import com.dynatrace.agent.events.enrichment.JsonObjectExtensionsKt;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ErrorEvent {
    private static final int MAX_SIZE_OF_EXCEPTION_MESSAGE_IN_BYTES = 24000;
    private static final int MAX_SIZE_OF_STACK_TRACE_IN_BYTES = 224000;

    public static class ExceptionInfo {
        private String className;
        private String message;
        private String stacktrace;

        public ExceptionInfo(String className, String message, String stacktrace) {
            this.className = className;
            this.message = message;
            this.stacktrace = stacktrace;
        }

        public String getClassName() {
            return this.className;
        }

        public String getMessage() {
            return this.message;
        }

        public String getStacktrace() {
            return this.stacktrace;
        }
    }

    public static JSONObject crashEvent(Throwable throwable) {
        try {
            JSONObject jSONObjectGenerateBaseErrorEvent = generateBaseErrorEvent(throwable, false);
            jSONObjectGenerateBaseErrorEvent.put(EventKeys.Characteristics.HAS_CRASH, true);
            jSONObjectGenerateBaseErrorEvent.put(EventKeys.ERROR.IS_FATAL, true);
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "crash event: " + jSONObjectGenerateBaseErrorEvent);
            return jSONObjectGenerateBaseErrorEvent;
        } catch (JSONException unused) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "crash event can't be generated");
            return null;
        }
    }

    public static JSONObject errorExceptionEvent(Throwable throwable, String name, boolean isLegacyApiReported) {
        try {
            JSONObject jSONObjectGenerateBaseErrorEvent = generateBaseErrorEvent(throwable, true);
            jSONObjectGenerateBaseErrorEvent.put(EventKeys.ERROR.NAME, name);
            jSONObjectGenerateBaseErrorEvent.put(EventKeys.ERROR.HAS_CUSTOM_NAME, true);
            jSONObjectGenerateBaseErrorEvent.put(EventKeys.Characteristics.HAS_EXCEPTION, true);
            if (isLegacyApiReported) {
                jSONObjectGenerateBaseErrorEvent.put(EventKeys.DT.SUPPORT.LEGACY_API_REPORTED, true);
            }
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "error event: " + jSONObjectGenerateBaseErrorEvent);
            return jSONObjectGenerateBaseErrorEvent;
        } catch (JSONException unused) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "error event can't be generated");
            return null;
        }
    }

    public static ExceptionEventContent exceptionEvent(Throwable throwable, EventFieldsProvider fieldsProvider) {
        try {
            return unsafeExceptionEvent(throwable, fieldsProvider);
        } catch (JSONException unused) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "exception event can't be generated");
            return null;
        }
    }

    private static JSONObject generateBaseErrorEvent(Throwable throwable, boolean shouldSanitize) throws JSONException {
        ExceptionInfo throwable2 = shouldSanitize ? parseThrowable(throwable, MAX_SIZE_OF_STACK_TRACE_IN_BYTES, MAX_SIZE_OF_EXCEPTION_MESSAGE_IN_BYTES) : parseThrowable(throwable);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(EventKeys.Characteristics.HAS_ERROR, true);
        if (throwable2.getMessage() != null) {
            jSONObject.put(EventKeys.EXCEPTION.MESSAGE, throwable2.getMessage());
        }
        if (throwable2.getClassName() != null) {
            jSONObject.put(EventKeys.EXCEPTION.TYPE, throwable2.getClassName());
        }
        if (throwable2.getStacktrace() != null) {
            jSONObject.put(EventKeys.EXCEPTION.STACK_TRACE, throwable2.getStacktrace());
        }
        return jSONObject;
    }

    public static JSONObject generateErrorEvent(String name, int errorCode, boolean isLegacyApiCall) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(EventKeys.ERROR.NAME, name);
            jSONObject.put(EventKeys.ERROR.HAS_CUSTOM_NAME, true);
            jSONObject.put(EventKeys.Characteristics.HAS_ERROR, true);
            jSONObject.put(EventKeys.ERROR.CODE, errorCode);
            if (isLegacyApiCall) {
                jSONObject.put(EventKeys.DT.SUPPORT.LEGACY_API_REPORTED, true);
            }
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "error code event: " + jSONObject);
            return jSONObject;
        } catch (JSONException unused) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "error code event can't be generated");
            return null;
        }
    }

    public static ExceptionInfo parseThrowable(Throwable throwable) {
        StringWriter stringWriter = new StringWriter();
        throwable.printStackTrace(new PrintWriter(stringWriter));
        return new ExceptionInfo(throwable.getClass().getName(), throwable.getMessage(), stringWriter.toString());
    }

    public static ExceptionInfo parseThrowable(Throwable throwable, int maxStackTraceSizeInBytes, int maxMessageSizeInBytes) {
        StringWriter stringWriter = new StringWriter();
        throwable.printStackTrace(new PrintWriter(stringWriter));
        return new ExceptionInfo(throwable.getClass().getName(), throwable.getMessage() != null ? sanitizeThrowableMessage(throwable.getMessage(), maxMessageSizeInBytes) : null, throwable.getStackTrace().length > 0 ? sanitizeStackTrace(stringWriter.toString(), maxStackTraceSizeInBytes) : null);
    }

    private static String sanitizeStackTrace(String stackTrace, int maxSizeInBytes) {
        return stackTrace.getBytes().length > maxSizeInBytes ? truncateAtLineBoundary(stackTrace, maxSizeInBytes) : stackTrace;
    }

    private static String sanitizeThrowableMessage(String message, int maxSizeInBytes) {
        byte[] bytes = message.getBytes();
        return bytes.length <= maxSizeInBytes ? message : new String(bytes, 0, maxSizeInBytes).concat("...");
    }

    private static String truncateAtLineBoundary(String str, int maxSizeInBytes) {
        StringBuilder sb = new StringBuilder();
        int length = 0;
        for (String str2 : str.split("\n")) {
            length += str2.getBytes(StandardCharsets.UTF_8).length + 1;
            if (length > maxSizeInBytes) {
                sb.append("...");
                return sb.toString();
            }
            sb.append(str2).append("\n");
        }
        sb.append("...");
        return sb.toString();
    }

    private static ExceptionEventContent unsafeExceptionEvent(Throwable throwable, EventFieldsProvider fieldsProvider) throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject = fieldsProvider != null ? validateFieldsProvider(fieldsProvider) : new JSONObject();
        } catch (Exception unused) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "exception event with problems in EventFieldsProvider");
            jSONObject2.put(EventKeys.DT.SUPPORT.API_HAS_ENRICH_EXCEPTION, true);
            jSONObject = new JSONObject();
        }
        ExceptionInfo throwable2 = parseThrowable(throwable, MAX_SIZE_OF_STACK_TRACE_IN_BYTES, MAX_SIZE_OF_EXCEPTION_MESSAGE_IN_BYTES);
        jSONObject2.put(EventKeys.Characteristics.HAS_ERROR, true);
        if (throwable2.getMessage() != null) {
            jSONObject2.put(EventKeys.EXCEPTION.MESSAGE, throwable2.getMessage());
        }
        if (throwable2.getClassName() != null) {
            jSONObject2.put(EventKeys.EXCEPTION.TYPE, throwable2.getClassName());
        }
        if (throwable2.getStacktrace() != null) {
            jSONObject2.put(EventKeys.EXCEPTION.STACK_TRACE, throwable2.getStacktrace());
        }
        jSONObject2.put(EventKeys.Characteristics.HAS_EXCEPTION, true);
        Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "exception event: " + jSONObject2);
        return new ExceptionEventContent(jSONObject2, jSONObject);
    }

    private static JSONObject validateFieldsProvider(EventFieldsProvider fieldsProvider) throws Exception {
        JSONObject jSONObject = fieldsProvider.get();
        return jSONObject == null ? new JSONObject() : JsonObjectExtensionsKt.deepCopy(jSONObject);
    }
}
