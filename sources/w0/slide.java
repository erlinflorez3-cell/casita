package w0;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes2.dex */
public final class slide implements gregarious {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f28398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f28399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f28400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ HashMap f28401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f28402e;

    public slide(Ref.ObjectRef objectRef, Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, HashMap map, Ref.ObjectRef objectRef2) {
        this.f28398a = objectRef;
        this.f28399b = booleanRef;
        this.f28400c = booleanRef2;
        this.f28401d = map;
        this.f28402e = objectRef2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, byte[]] */
    public final void a(String str, Charset charset) {
        this.f28402e.element = str.getBytes(charset);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, byte[]] */
    public final void a(byte[] bArr) {
        this.f28402e.element = Arrays.copyOf(bArr, bArr.length);
    }
}
