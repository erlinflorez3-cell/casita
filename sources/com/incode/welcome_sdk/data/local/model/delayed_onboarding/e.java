package com.incode.welcome_sdk.data.local.model.delayed_onboarding;

import com.incode.welcome_sdk.data.local.model.delayed_onboarding.e;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public interface e<SyncResult> {
    Completable b();

    Completable b(SyncResult syncresult);

    boolean d();

    Single<? extends SyncResult> e();

    /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.model.delayed_onboarding.e$e */
    public static final class C0231e {

        /* JADX INFO: renamed from: d */
        private static int f8826d = 0;

        /* JADX INFO: renamed from: e */
        private static int f8827e = 1;

        /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.model.delayed_onboarding.e$e$d */
        static final class d extends Lambda implements Function1<SyncResult, CompletableSource> {

            /* JADX INFO: renamed from: c */
            private static int f8828c = 0;

            /* JADX INFO: renamed from: e */
            private static int f8829e = 1;

            /* JADX INFO: renamed from: a */
            private /* synthetic */ e<SyncResult> f8830a;

            private CompletableSource c(SyncResult syncresult) {
                int i2 = 2 % 2;
                int i3 = f8828c + 105;
                f8829e = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(syncresult, "");
                    return this.f8830a.b(syncresult);
                }
                Intrinsics.checkNotNullParameter(syncresult, "");
                int i4 = 85 / 0;
                return this.f8830a.b(syncresult);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ CompletableSource invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = f8828c + 99;
                f8829e = i3 % 128;
                int i4 = i3 % 2;
                CompletableSource completableSourceC = c(obj);
                int i5 = f8829e + 37;
                f8828c = i5 % 128;
                if (i5 % 2 == 0) {
                    return completableSourceC;
                }
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(e<SyncResult> eVar) {
                super(1);
                this.f8830a = eVar;
            }
        }

        public static <SyncResult> Completable c(e<SyncResult> eVar) {
            Completable completableComplete;
            int i2 = 2 % 2;
            int i3 = f8827e + 91;
            f8826d = i3 % 128;
            int i4 = i3 % 2;
            if (eVar.d()) {
                int i5 = f8827e + 107;
                f8826d = i5 % 128;
                if (i5 % 2 != 0) {
                    Completable.complete();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                completableComplete = Completable.complete();
            } else {
                Single<? extends SyncResult> singleE = eVar.e();
                final d dVar = new d(eVar);
                completableComplete = singleE.flatMapCompletable(new Function() { // from class: com.incode.welcome_sdk.data.local.model.delayed_onboarding.e$e$$ExternalSyntheticLambda0
                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj2) {
                        return e.C0231e.e(dVar, obj2);
                    }
                });
                int i6 = f8826d + 61;
                f8827e = i6 % 128;
                int i7 = i6 % 2;
            }
            Intrinsics.checkNotNull(completableComplete);
            return completableComplete;
        }

        public static CompletableSource e(Function1 function1, Object obj) {
            int i2 = 2 % 2;
            int i3 = f8826d + 49;
            f8827e = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            CompletableSource completableSource = (CompletableSource) function1.invoke(obj);
            int i5 = f8827e + 53;
            f8826d = i5 % 128;
            if (i5 % 2 == 0) {
                return completableSource;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }
}
