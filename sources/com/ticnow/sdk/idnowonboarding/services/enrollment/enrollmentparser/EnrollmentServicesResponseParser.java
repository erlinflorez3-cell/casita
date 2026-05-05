package com.ticnow.sdk.idnowonboarding.services.enrollment.enrollmentparser;

import android.app.Activity;
import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ticnow.sdk.idnowsecurity.http.nodes.EnrollDefinition;
import com.ticnow.sdk.idnowsecurity.http.nodes.EnrollPath;
import com.ticnow.sdk.idnowsecurity.http.nodes.KeyValue;
import com.ticnow.sdk.idnowsecurity.http.nodes.MethodEnroll;
import com.ticnow.sdk.idnowsecurity.http.response.FinishEnrollmentResponse;
import com.ticnow.sdk.idnowsecurity.http.response.InitEnrollmentResponse;
import com.ticnow.sdk.idnowsecurity.http.response.RegisterPathResponse;
import io.sentry.ProfilingTraceData;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class EnrollmentServicesResponseParser {
    public static FinishEnrollmentResponse getFinishEnrollmentResponse(String str) {
        FinishEnrollmentResponse finishEnrollmentResponse = new FinishEnrollmentResponse();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.isNull("code")) {
                finishEnrollmentResponse.setCode("500");
            } else {
                finishEnrollmentResponse.setCode(jSONObject.getString("code"));
            }
            if (jSONObject.isNull("description")) {
                finishEnrollmentResponse.setDescriptionStr("General Error");
            } else {
                finishEnrollmentResponse.setDescriptionStr(jSONObject.getString("description"));
            }
            if (jSONObject.isNull("serverEnrollmentoKey2")) {
                finishEnrollmentResponse.setServerEnrollmentKey2("");
            } else {
                finishEnrollmentResponse.setServerEnrollmentKey2(jSONObject.getString("serverEnrollmentoKey2"));
            }
            if (jSONObject.isNull("seed")) {
                finishEnrollmentResponse.setSeed("");
            } else {
                finishEnrollmentResponse.setSeed(jSONObject.getString("seed"));
            }
            if (jSONObject.isNull("finalScoring")) {
                finishEnrollmentResponse.setFinalScoring("");
            } else {
                finishEnrollmentResponse.setFinalScoring(jSONObject.getString("finalScoring"));
            }
            return finishEnrollmentResponse;
        } catch (Throwable unused) {
            finishEnrollmentResponse.setCode("500");
            finishEnrollmentResponse.setDescriptionStr("General Error");
            finishEnrollmentResponse.setServerEnrollmentKey2("");
            finishEnrollmentResponse.setSeed("");
            finishEnrollmentResponse.setFinalScoring("");
            return finishEnrollmentResponse;
        }
    }

    public static InitEnrollmentResponse getInitEnrollmentResponse(String str, Context context, Activity activity) {
        InitEnrollmentResponse initEnrollmentResponse = new InitEnrollmentResponse();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.isNull("code")) {
                initEnrollmentResponse.setCode("500");
            } else {
                initEnrollmentResponse.setCode(jSONObject.getString("code"));
            }
            if (jSONObject.isNull("description")) {
                initEnrollmentResponse.setDescriptionStr("General Error");
            } else {
                initEnrollmentResponse.setDescriptionStr(jSONObject.getString("description"));
            }
            if (jSONObject.isNull("serverEnrollmentKey")) {
                initEnrollmentResponse.setServerEnrollmentKey("");
            } else {
                initEnrollmentResponse.setServerEnrollmentKey(jSONObject.getString("serverEnrollmentKey"));
            }
            if (jSONObject.isNull("uuidTransaction")) {
                initEnrollmentResponse.setUuidTransaction("");
            } else {
                initEnrollmentResponse.setUuidTransaction(jSONObject.getString("uuidTransaction"));
            }
            if (!jSONObject.isNull("enviromentsParams")) {
                ArrayList<KeyValue> arrayList = new ArrayList<>();
                JSONArray jSONArray = new JSONArray(jSONObject.getString("enviromentsParams"));
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                    KeyValue keyValue = new KeyValue();
                    keyValue.setKey(jSONObject2.getString("key"));
                    keyValue.setValue(jSONObject2.getString("value"));
                    arrayList.add(keyValue);
                }
                initEnrollmentResponse.setEnvironmentsParams(arrayList);
            }
            return initEnrollmentResponse;
        } catch (Throwable unused) {
            initEnrollmentResponse.setCode("500");
            initEnrollmentResponse.setDescriptionStr("General Error");
            initEnrollmentResponse.setServerEnrollmentKey("");
            initEnrollmentResponse.setUuidTransaction("");
            return initEnrollmentResponse;
        }
    }

    public static RegisterPathResponse getRegisterPathResponse(String str) {
        RegisterPathResponse registerPathResponse = new RegisterPathResponse();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.isNull("code")) {
                registerPathResponse.setCode("500");
            } else {
                registerPathResponse.setCode(jSONObject.getString("code"));
            }
            if (jSONObject.isNull("description")) {
                registerPathResponse.setDescriptionStr("General Error");
            } else {
                registerPathResponse.setDescriptionStr(jSONObject.getString("description"));
            }
            if (jSONObject.isNull("enrollDefinition")) {
                registerPathResponse.setEnrollDefinition(new EnrollDefinition());
            } else {
                EnrollDefinition enrollDefinition = new EnrollDefinition();
                JSONObject jSONObject2 = new JSONObject(jSONObject.getString("enrollDefinition"));
                String string = Integer.toString(jSONObject2.getInt("id"));
                String string2 = Integer.toString(jSONObject2.getInt("definitionWorkflowId"));
                String string3 = Integer.toString(jSONObject2.getInt("minScore"));
                String string4 = Integer.toString(jSONObject2.getInt("userCreation"));
                String string5 = Integer.toString(jSONObject2.getInt("quickEnrollment"));
                String string6 = Integer.toString(jSONObject2.getInt("blockDevice"));
                String string7 = Integer.toString(jSONObject2.getInt("multiDevice"));
                String string8 = Integer.toString(jSONObject2.getInt("postUserCreation"));
                try {
                    String string9 = Integer.toString(jSONObject2.getInt(ProfilingTraceData.TRUNCATION_REASON_TIMEOUT));
                    String string10 = Integer.toString(jSONObject2.getInt("enrollDefinitionInstitution"));
                    String string11 = Integer.toString(jSONObject2.getInt("segmenId"));
                    String string12 = Integer.toString(jSONObject2.getInt("notifyOkEnroll"));
                    String string13 = Integer.toString(jSONObject2.getInt("notifyEnroll"));
                    String string14 = jSONObject2.getString("definitionName");
                    String string15 = jSONObject2.getString("enrollmentType");
                    enrollDefinition.setDefinitionWorkflowId(string2);
                    enrollDefinition.setEnrollDefinitionInstitution(string10);
                    enrollDefinition.setSegmenId(string11);
                    enrollDefinition.setNotifyOkEnroll(string12);
                    enrollDefinition.setBlockDevice(string6);
                    enrollDefinition.setDefinitionName(string14);
                    enrollDefinition.setEnrollmentType(string15);
                    enrollDefinition.setId(string);
                    enrollDefinition.setMinScore(string3);
                    enrollDefinition.setMultiDevice(string7);
                    enrollDefinition.setNotifyEnroll(string13);
                    enrollDefinition.setPostUserCreation(string8);
                    enrollDefinition.setQuickEnrollment(string5);
                    enrollDefinition.setTimeout(string9);
                    enrollDefinition.setUserCreation(string4);
                    JSONObject jSONObject3 = new JSONObject(jSONObject2.getString("definitionWorkflow"));
                    JSONObject jSONObject4 = new JSONObject(jSONObject3.getString("nextAction"));
                    ArrayList arrayList = new ArrayList();
                    boolean z2 = false;
                    while (!z2) {
                        try {
                            EnrollPath enrollPath = new EnrollPath();
                            EnrollPath enrollPath2 = new EnrollPath();
                            EnrollPath enrollPath3 = new EnrollPath();
                            String strValueOf = String.valueOf(jSONObject3.getBoolean("ponderateResult"));
                            String strValueOf2 = String.valueOf(jSONObject3.getBoolean("required"));
                            String string16 = Integer.toString(jSONObject3.getInt("enrollDefinitionId"));
                            String string17 = Integer.toString(jSONObject3.getInt("id"));
                            String string18 = Integer.toString(jSONObject3.getInt("maxReintent"));
                            String string19 = Integer.toString(jSONObject3.getInt("minScore"));
                            String string20 = Integer.toString(jSONObject3.getInt("nextActionId"));
                            String string21 = Integer.toString(jSONObject3.getInt("optionalStepId"));
                            String string22 = Integer.toString(jSONObject3.getInt("ponderatePercent"));
                            String string23 = Integer.toString(jSONObject3.getInt("reintent"));
                            String string24 = Integer.toString(jSONObject3.getInt(FirebaseAnalytics.Param.SCORE));
                            String string25 = Integer.toString(jSONObject3.getInt("step"));
                            String string26 = jSONObject3.getString("status");
                            enrollPath3.setEnrollDefinitionId(string16);
                            enrollPath3.setId(string17);
                            enrollPath3.setMaxReintent(string18);
                            enrollPath3.setMinScore(string19);
                            enrollPath3.setNextActionId(string20);
                            enrollPath3.setOptionalStepId(string21);
                            enrollPath3.setPonderateResult(strValueOf);
                            enrollPath3.setReintent(string23);
                            enrollPath3.setRequired(strValueOf2);
                            enrollPath3.setScore(string24);
                            enrollPath3.setStatus(string26);
                            enrollPath3.setStep(string25);
                            enrollPath3.setStepOnFail(enrollPath);
                            enrollPath3.setOptionalStep(enrollPath2);
                            enrollPath3.setPonderatePercent(string22);
                            MethodEnroll methodEnroll = new MethodEnroll();
                            JSONObject jSONObject5 = new JSONObject(jSONObject3.getString("type"));
                            String string27 = Integer.toString(jSONObject5.getInt("id"));
                            String string28 = Integer.toString(jSONObject5.getInt("internal"));
                            String string29 = jSONObject5.getString("name");
                            String string30 = jSONObject5.getString("pathBackend");
                            String string31 = jSONObject5.getString("type");
                            methodEnroll.setId(string27);
                            methodEnroll.setInternalStr(string28);
                            methodEnroll.setName(string29);
                            methodEnroll.setPathBackend(string30);
                            methodEnroll.setType(string31);
                            enrollPath3.setType(methodEnroll);
                            arrayList.add(enrollPath3);
                            if (jSONObject4 != null) {
                                try {
                                    jSONObject4 = new JSONObject(jSONObject3.getString("nextAction"));
                                    jSONObject3 = new JSONObject(jSONObject3.getString("nextAction"));
                                } catch (JSONException unused) {
                                    jSONObject4 = null;
                                }
                            } else {
                                z2 = true;
                            }
                        } catch (Throwable unused2) {
                            registerPathResponse.setCode("500");
                            registerPathResponse.setDescriptionStr("General Error");
                            return registerPathResponse;
                        }
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (size == 0) {
                            enrollDefinition.setDefinitionWorkflow((EnrollPath) arrayList.get(size));
                            registerPathResponse.setEnrollDefinition(enrollDefinition);
                        } else {
                            ((EnrollPath) arrayList.get(size - 1)).setNextAction((EnrollPath) arrayList.get(size));
                        }
                    }
                } catch (Throwable unused3) {
                }
            }
            return registerPathResponse;
        } catch (Throwable unused4) {
        }
    }
}
