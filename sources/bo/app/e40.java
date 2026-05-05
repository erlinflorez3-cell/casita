package bo.app;

import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class e40 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONObject f541a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e40(JSONObject jSONObject) {
        super(1);
        this.f541a = jSONObject;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object objOpt = this.f541a.opt((String) obj);
        Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
        return Boolean.valueOf(objOpt instanceof Object);
    }
}
