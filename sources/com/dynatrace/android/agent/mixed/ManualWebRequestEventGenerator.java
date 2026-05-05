package com.dynatrace.android.agent.mixed;

import com.dynatrace.agent.events.enrichment.EventKeys;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ManualWebRequestEventGenerator extends BaseWebRequestEventGenerator {
    public ManualWebRequestEventGenerator() {
        super("manual");
    }

    private void handleGeneric(JSONObject jSONObject) throws JSONException {
        jSONObject.put(EventKeys.NETWORK.PROTOCOL_NAME, this.networkProtocolName);
    }

    private void handleHttp(JSONObject jSONObject) throws JSONException {
        jSONObject.put(EventKeys.NETWORK.PROTOCOL_NAME, "http");
        if (this.statusCode >= 400 && this.statusCode <= 599) {
            jSONObject.put("http.response.status_code", this.statusCode);
            jSONObject.put(EventKeys.Characteristics.HAS_ERROR, true);
            jSONObject.put(EventKeys.Characteristics.HAS_FAILED_REQUEST, true);
            if (this.reasonPhrase != null) {
                jSONObject.put(EventKeys.HTTP.RESPONSE_REASON_PHRASE, this.reasonPhrase);
                return;
            }
            return;
        }
        if (this.statusCode < 0 && this.reasonPhrase != null) {
            jSONObject.put(EventKeys.Characteristics.HAS_ERROR, true);
            jSONObject.put(EventKeys.Characteristics.HAS_FAILED_REQUEST, true);
            jSONObject.put(EventKeys.Characteristics.HAS_EXCEPTION, true);
            jSONObject.put(EventKeys.EXCEPTION.MESSAGE, this.reasonPhrase);
            return;
        }
        if (this.statusCode < 0) {
            jSONObject.put("http.response.status_code", 0);
            jSONObject.put(EventKeys.HTTP.RESPONSE_REASON_PHRASE, "");
        } else {
            jSONObject.put("http.response.status_code", this.statusCode);
            if (this.reasonPhrase != null) {
                jSONObject.put(EventKeys.HTTP.RESPONSE_REASON_PHRASE, this.reasonPhrase);
            }
        }
    }

    private void handleWs(JSONObject jSONObject) throws JSONException {
        jSONObject.put(EventKeys.NETWORK.PROTOCOL_NAME, "ws");
        if (this.statusCode == 1000 || this.statusCode == 1001) {
            jSONObject.put(EventKeys.WEBSOCKET.CONNECTION_STATUS_CODE, this.statusCode);
            return;
        }
        if (this.statusCode < 1002 || this.statusCode > 4999) {
            jSONObject.put(EventKeys.Characteristics.HAS_ERROR, true);
            jSONObject.put(EventKeys.Characteristics.HAS_FAILED_REQUEST, true);
        } else {
            jSONObject.put(EventKeys.WEBSOCKET.CONNECTION_STATUS_CODE, this.statusCode);
            jSONObject.put(EventKeys.Characteristics.HAS_ERROR, true);
            jSONObject.put(EventKeys.Characteristics.HAS_FAILED_REQUEST, true);
        }
    }

    @Override // com.dynatrace.android.agent.mixed.BaseWebRequestEventGenerator
    public JSONObject generateRumRequestEvent() {
        return super.generateRumRequestEvent();
    }

    @Override // com.dynatrace.android.agent.mixed.BaseWebRequestEventGenerator
    protected JSONObject populateJson(JSONObject jSONObject) throws JSONException {
        if (this.networkProtocolName.startsWith("http")) {
            handleHttp(jSONObject);
        } else if (this.networkProtocolName.startsWith("ws")) {
            handleWs(jSONObject);
        } else {
            handleGeneric(jSONObject);
        }
        return jSONObject;
    }
}
