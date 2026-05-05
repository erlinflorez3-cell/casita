package bo.app;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.TrafficStats;
import android.widget.ImageView;
import com.braze.Constants;
import com.braze.R;
import com.braze.enums.BrazeViewBounds;
import com.braze.images.DefaultBrazeImageLoader;
import com.braze.support.BrazeLogger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* JADX INFO: loaded from: classes4.dex */
public final class dq extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bitmap f508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DefaultBrazeImageLoader f510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ BrazeViewBounds f513f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ImageView f514g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq(DefaultBrazeImageLoader defaultBrazeImageLoader, Context context, String str, BrazeViewBounds brazeViewBounds, ImageView imageView, Continuation continuation) {
        super(2, continuation);
        this.f510c = defaultBrazeImageLoader;
        this.f511d = context;
        this.f512e = str;
        this.f513f = brazeViewBounds;
        this.f514g = imageView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new dq(this.f510c, this.f511d, this.f512e, this.f513f, this.f514g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((dq) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmapFromUrl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f509b;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            TrafficStats.setThreadStatsTag(Constants.TRAFFIC_STATS_THREAD_TAG);
            bitmapFromUrl = this.f510c.getBitmapFromUrl(this.f511d, this.f512e, this.f513f);
            if (bitmapFromUrl == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DefaultBrazeImageLoader.TAG, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new aq(this.f512e), 14, (Object) null);
            } else {
                String str = this.f512e;
                Object tag = this.f514g.getTag(R.string.com_braze_image_lru_cache_image_url_key);
                Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.String");
                if (Intrinsics.areEqual(str, (String) tag)) {
                    MainCoroutineDispatcher main = Dispatchers.getMain();
                    bq bqVar = new bq(this.f514g, bitmapFromUrl, null);
                    this.f508a = bitmapFromUrl;
                    this.f509b = 1;
                    if (BuildersKt.withContext(main, bqVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bitmapFromUrl = this.f508a;
        ResultKt.throwOnFailure(obj);
        BrazeViewBounds brazeViewBounds = this.f513f;
        ImageView imageView = this.f514g;
        imageView.addOnLayoutChangeListener(new cq(brazeViewBounds, imageView, bitmapFromUrl));
        return Unit.INSTANCE;
    }
}
