package bo.app;

import com.braze.enums.inappmessage.ClickAction;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class n10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f1331a;

    static {
        int[] iArr = new int[ClickAction.values().length];
        try {
            iArr[ClickAction.URI.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f1331a = iArr;
    }
}
