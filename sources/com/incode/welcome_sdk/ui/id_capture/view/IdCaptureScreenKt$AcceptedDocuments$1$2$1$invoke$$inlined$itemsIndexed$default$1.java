package com.incode.welcome_sdk.ui.id_capture.view;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class IdCaptureScreenKt$AcceptedDocuments$1$2$1$invoke$$inlined$itemsIndexed$default$1 extends Lambda implements Function1<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f15282a = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f15283e = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Function2 f15284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private /* synthetic */ List f15285d;

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Object invoke(Integer num) {
        int i2 = 2 % 2;
        int i3 = f15283e + 63;
        f15282a = i3 % 128;
        int i4 = i3 % 2;
        int iIntValue = num.intValue();
        if (i4 != 0) {
            invoke(iIntValue);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object objInvoke = invoke(iIntValue);
        int i5 = f15282a + 115;
        f15283e = i5 % 128;
        int i6 = i5 % 2;
        return objInvoke;
    }

    public final Object invoke(int i2) {
        int i3 = 2 % 2;
        int i4 = f15283e + 123;
        f15282a = i4 % 128;
        if (i4 % 2 != 0) {
            this.f15284c.invoke(Integer.valueOf(i2), this.f15285d.get(i2));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object objInvoke = this.f15284c.invoke(Integer.valueOf(i2), this.f15285d.get(i2));
        int i5 = f15283e + 71;
        f15282a = i5 % 128;
        int i6 = i5 % 2;
        return objInvoke;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdCaptureScreenKt$AcceptedDocuments$1$2$1$invoke$$inlined$itemsIndexed$default$1(Function2 function2, List list) {
        super(1);
        this.f15284c = function2;
        this.f15285d = list;
    }
}
