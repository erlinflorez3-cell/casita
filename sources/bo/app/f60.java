package bo.app;

import com.braze.enums.BrazeDateFormat;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import java.util.Date;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class f60 implements n00 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f614e = BrazeLogger.getBrazeLogTag((Class<?>) f60.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g60 f615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f618d;

    public f60(g60 g60Var, String str, int i2) {
        this.f615a = g60Var;
        this.f616b = str;
        this.f617c = i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f60(JSONObject jSONObject) {
        g60 g60Var = (g60) JsonUtils.optEnum(jSONObject, "property_type", g60.class, g60.UNKNOWN);
        this(g60Var, jSONObject.getString("property_key"), jSONObject.getInt("comparator"));
        if (jSONObject.has("property_value")) {
            if (g60Var.equals(g60.STRING)) {
                this.f618d = jSONObject.getString("property_value");
                return;
            }
            if (g60Var.equals(g60.BOOLEAN)) {
                this.f618d = Boolean.valueOf(jSONObject.getBoolean("property_value"));
            } else if (g60Var.equals(g60.NUMBER)) {
                this.f618d = Double.valueOf(jSONObject.getDouble("property_value"));
            } else if (g60Var.equals(g60.DATE)) {
                this.f618d = Long.valueOf(jSONObject.getLong("property_value"));
            }
        }
    }

    @Override // bo.app.n00
    public final boolean a(g10 g10Var) {
        Object objOpt;
        if (!(g10Var instanceof i10)) {
            return false;
        }
        BrazeProperties brazeProperties = ((ye0) ((i10) g10Var)).f2303e;
        Date date = null;
        if (brazeProperties != null) {
            try {
                objOpt = brazeProperties.forJsonPut().opt(this.f616b);
            } catch (Exception e2) {
                BrazeLogger.e(f614e, "Caught exception checking property filter condition.", e2);
                return false;
            }
        } else {
            objOpt = null;
        }
        if (objOpt == null) {
            int i2 = this.f617c;
            return i2 == 12 || i2 == 17 || i2 == 2;
        }
        int i3 = this.f617c;
        if (i3 == 11) {
            return true;
        }
        if (i3 == 12) {
            return false;
        }
        int iOrdinal = this.f615a.ordinal();
        if (iOrdinal == 0) {
            return a(objOpt);
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    return false;
                }
                if (!(objOpt instanceof Boolean)) {
                    return this.f617c == 2;
                }
                int i4 = this.f617c;
                if (i4 == 1) {
                    return objOpt.equals(this.f618d);
                }
                if (i4 != 2) {
                    return false;
                }
                return !objOpt.equals(this.f618d);
            }
            if ((objOpt instanceof Integer) || (objOpt instanceof Double)) {
                double dDoubleValue = ((Number) objOpt).doubleValue();
                double dDoubleValue2 = ((Number) this.f618d).doubleValue();
                int i5 = this.f617c;
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 != 3) {
                            if (i5 != 5 || dDoubleValue >= dDoubleValue2) {
                                return false;
                            }
                        } else if (dDoubleValue <= dDoubleValue2) {
                            return false;
                        }
                    } else if (dDoubleValue == dDoubleValue2) {
                        return false;
                    }
                } else if (dDoubleValue != dDoubleValue2) {
                    return false;
                }
            } else if (this.f617c != 2) {
                return false;
            }
            return true;
        }
        long j2 = ((we0) g10Var).f2139a;
        if (objOpt instanceof String) {
            try {
                date = DateTimeUtils.parseDate((String) objOpt, BrazeDateFormat.LONG);
            } catch (Exception e3) {
                BrazeLogger.e(f614e, "Caught exception trying to parse date in compareTimestamps", e3);
            }
        }
        if (date != null) {
            long timeFromEpochInSeconds = DateTimeUtils.getTimeFromEpochInSeconds(date);
            long jLongValue = ((Number) this.f618d).longValue();
            int i6 = this.f617c;
            if (i6 != 15) {
                if (i6 != 16) {
                    switch (i6) {
                        case 1:
                            if (timeFromEpochInSeconds != jLongValue) {
                                return false;
                            }
                            break;
                            break;
                        case 2:
                            if (timeFromEpochInSeconds == jLongValue) {
                                return false;
                            }
                            break;
                            break;
                        case 3:
                            if (timeFromEpochInSeconds <= jLongValue) {
                                return false;
                            }
                            break;
                            break;
                        case 4:
                            if (timeFromEpochInSeconds < j2 - jLongValue) {
                                return false;
                            }
                            break;
                            break;
                        case 5:
                            if (timeFromEpochInSeconds >= jLongValue) {
                                return false;
                            }
                            break;
                            break;
                        case 6:
                            if (timeFromEpochInSeconds > j2 - jLongValue) {
                                return false;
                            }
                            break;
                        default:
                            return false;
                    }
                } else if (timeFromEpochInSeconds <= j2 + jLongValue) {
                    return false;
                }
            } else if (timeFromEpochInSeconds >= j2 + jLongValue) {
                return false;
            }
        } else if (this.f617c != 2) {
            return false;
        }
        return true;
    }

    public final boolean a(Object obj) {
        if (!(obj instanceof String)) {
            int i2 = this.f617c;
            return i2 == 2 || i2 == 17;
        }
        int i3 = this.f617c;
        if (i3 == 1) {
            return obj.equals(this.f618d);
        }
        if (i3 == 2) {
            return !obj.equals(this.f618d);
        }
        if (i3 == 10) {
            return Pattern.compile((String) this.f618d, 2).matcher((String) obj).find();
        }
        if (i3 != 17) {
            return false;
        }
        return !Pattern.compile((String) this.f618d, 2).matcher((String) obj).find();
    }

    @Override // com.braze.models.IPutIntoJson
    public final Object forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!this.f615a.equals(g60.UNKNOWN)) {
                jSONObject.put("property_type", this.f615a.toString());
            }
            jSONObject.put("property_key", this.f616b);
            jSONObject.put("comparator", this.f617c);
            jSONObject.put("property_value", this.f618d);
        } catch (JSONException e2) {
            BrazeLogger.e(f614e, "Caught exception creating property filter Json.", e2);
        }
        return jSONObject;
    }
}
