package com.incode.welcome_sdk.ui.dynamic_forms.view;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class FormsCountrySelectorScreenKt$CountryPickerDialog$2$1$1$1$1$2$invoke$$inlined$items$default$2 extends Lambda implements Function1<Integer, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f13542c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f13543d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private /* synthetic */ List f13544b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private /* synthetic */ Function1 f13545e;

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Object invoke(Integer num) {
        int i2 = 2 % 2;
        int i3 = f13542c + 11;
        f13543d = i3 % 128;
        int i4 = i3 % 2;
        Object objInvoke = invoke(num.intValue());
        int i5 = f13542c + 15;
        f13543d = i5 % 128;
        if (i5 % 2 == 0) {
            return objInvoke;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Object invoke(int i2) {
        int i3 = 2 % 2;
        int i4 = f13542c + 19;
        f13543d = i4 % 128;
        int i5 = i4 % 2;
        Function1 function1 = this.f13545e;
        if (i5 == 0) {
            return function1.invoke(this.f13544b.get(i2));
        }
        int i6 = 24 / 0;
        return function1.invoke(this.f13544b.get(i2));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormsCountrySelectorScreenKt$CountryPickerDialog$2$1$1$1$1$2$invoke$$inlined$items$default$2(Function1 function1, List list) {
        super(1);
        this.f13545e = function1;
        this.f13544b = list;
    }
}
