package bo.app;

import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.JsonUtils;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class u40 {

    /* JADX INFO: renamed from: a */
    public final Integer f1911a;

    /* JADX INFO: renamed from: b */
    public final Integer f1912b;

    /* JADX INFO: renamed from: c */
    public final Integer f1913c;

    public u40(Integer num, Integer num2, Integer num3) {
        this.f1911a = num;
        this.f1912b = num2;
        this.f1913c = num3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u40(JSONObject buttonThemeJson) {
        this(JsonUtils.getColorIntegerOrNull(buttonThemeJson, InAppMessageBase.BG_COLOR), JsonUtils.getColorIntegerOrNull(buttonThemeJson, InAppMessageBase.MESSAGE_TEXT_COLOR), JsonUtils.getColorIntegerOrNull(buttonThemeJson, "border_color"));
        Intrinsics.checkNotNullParameter(buttonThemeJson, "buttonThemeJson");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u40)) {
            return false;
        }
        u40 u40Var = (u40) obj;
        return Intrinsics.areEqual(this.f1911a, u40Var.f1911a) && Intrinsics.areEqual(this.f1912b, u40Var.f1912b) && Intrinsics.areEqual(this.f1913c, u40Var.f1913c);
    }

    public final int hashCode() {
        Integer num = this.f1911a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f1912b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f1913c;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return "MessageButtonTheme(backgroundColor=" + this.f1911a + ", textColor=" + this.f1912b + ", borderColor=" + this.f1913c + ')';
    }
}
