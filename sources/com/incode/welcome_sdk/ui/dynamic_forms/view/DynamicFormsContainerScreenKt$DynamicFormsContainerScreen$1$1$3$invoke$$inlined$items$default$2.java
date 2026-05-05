package com.incode.welcome_sdk.ui.dynamic_forms.view;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class DynamicFormsContainerScreenKt$DynamicFormsContainerScreen$1$1$3$invoke$$inlined$items$default$2 extends Lambda implements Function1<Integer, Object> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f13467d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f13468e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private /* synthetic */ Function1 f13469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ List f13470c;

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Object invoke(Integer num) {
        int i2 = 2 % 2;
        int i3 = f13467d + 17;
        f13468e = i3 % 128;
        int i4 = i3 % 2;
        int iIntValue = num.intValue();
        if (i4 == 0) {
            return invoke(iIntValue);
        }
        invoke(iIntValue);
        throw null;
    }

    public final Object invoke(int i2) {
        int i3 = 2 % 2;
        int i4 = f13467d + 73;
        f13468e = i4 % 128;
        int i5 = i4 % 2;
        Object objInvoke = this.f13469b.invoke(this.f13470c.get(i2));
        int i6 = f13468e + 89;
        f13467d = i6 % 128;
        if (i6 % 2 != 0) {
            return objInvoke;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicFormsContainerScreenKt$DynamicFormsContainerScreen$1$1$3$invoke$$inlined$items$default$2(Function1 function1, List list) {
        super(1);
        this.f13469b = function1;
        this.f13470c = list;
    }
}
