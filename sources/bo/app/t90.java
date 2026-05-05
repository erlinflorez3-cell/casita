package bo.app;

import com.braze.Constants;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
import com.npmdavi.davinotification.Constant;
import cz.msebera.android.httpclient.message.TokenParser;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t90 extends FunctionReferenceImpl implements Function4 {
    public t90(Object obj) {
        super(4, obj, w90.class, Constant.NOTIFICATION_DETAILS_LOG, "log$android_sdk_base_release(Ljava/lang/String;Lcom/braze/support/BrazeLogger$Priority;Ljava/lang/String;Ljava/lang/Throwable;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        String tag = (String) obj;
        BrazeLogger.Priority priority = (BrazeLogger.Priority) obj2;
        String message = (String) obj3;
        Object obj5 = (Throwable) obj4;
        Intrinsics.checkNotNullParameter(tag, "p0");
        Intrinsics.checkNotNullParameter(priority, "p1");
        Intrinsics.checkNotNullParameter(message, "p2");
        w90 w90Var = (w90) this.receiver;
        w90Var.getClass();
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(message, "message");
        if (w90Var.f2116c.f1655a && !StringsKt.contains$default((CharSequence) message, (CharSequence) Constants.LOG_TAG_PREFIX, false, 2, (Object) null)) {
            StringBuilder sbAppend = new StringBuilder().append(priority).append(TokenParser.SP).append(tag).append(": ").append(message).append(TokenParser.SP);
            String str = "";
            if (obj5 == null) {
                obj5 = "";
            }
            for (String str2 : StringsKt.split$default((CharSequence) sbAppend.append(obj5).toString(), new String[]{"\n"}, false, 0, 6, (Object) null)) {
                if (str2.length() + str.length() > w90Var.f2116c.f1660f) {
                    w90Var.a(priority + ": " + str);
                    str = str2;
                } else {
                    str = str + '\n' + str2;
                }
            }
            if (str.length() > 0) {
                w90Var.a(str);
            }
            BuildersKt__Builders_commonKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new v90(w90Var, null), 3, null);
        }
        return Unit.INSTANCE;
    }
}
