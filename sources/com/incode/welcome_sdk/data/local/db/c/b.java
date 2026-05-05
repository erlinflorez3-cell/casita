package com.incode.welcome_sdk.data.local.db.c;

import com.incode.welcome_sdk.data.local.FaceInfo;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface b {
    Maybe<String> a(String str);

    Maybe<List<FaceInfo>> b();

    Completable d();

    Completable d(FaceInfo faceInfo);

    Maybe<List<FaceInfo>> d(String str);

    Completable e();

    Completable e(String str);

    Completable e(List<FaceInfo> list);
}
