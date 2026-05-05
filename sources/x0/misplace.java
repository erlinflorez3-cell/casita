package x0;

import com.google.protobuf.Internal;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import y0.absolute;
import y0.professor;
import y0.survey;

/* JADX INFO: loaded from: classes2.dex */
public final class misplace extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte[] f28448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ abundant f28449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k0.pair f28450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ absolute f28451d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public misplace(byte[] bArr, abundant abundantVar, k0.pair pairVar, absolute absoluteVar) {
        super(1);
        this.f28448a = bArr;
        this.f28449b = abundantVar;
        this.f28450c = pairVar;
        this.f28451d = absoluteVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, w0.misplace] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        w0.slide slideVar = (w0.slide) ((w0.gregarious) obj);
        slideVar.f28398a.element = w0.misplace.f28394b;
        Ref.BooleanRef booleanRef = slideVar.f28399b;
        booleanRef.element = booleanRef.element;
        slideVar.a(this.f28448a);
        slideVar.f28401d.put("x-ma-hostname", String.valueOf(this.f28449b.f28424c));
        slideVar.f28401d.put("x-ma-sid", String.valueOf(this.f28450c.f19829a));
        slideVar.f28401d.put("x-ma-bid", String.valueOf(this.f28450c.f19832d));
        slideVar.f28401d.put("x-ma-did", String.valueOf(this.f28450c.f19833e));
        slideVar.f28401d.put("Content-Encoding", "gzip");
        slideVar.f28401d.put("Content-Type", "application/octet-stream");
        Iterator<E> it = this.f28451d.b().iterator();
        String strC = "";
        while (it.hasNext()) {
            professor professorVarA = ((survey) it.next()).a();
            strC = professorVarA != null ? professorVarA.c() : null;
            if (strC == null) {
                strC = "";
            }
            if (!StringsKt.isBlank(strC)) {
                break;
            }
        }
        if (!this.f28451d.b().isEmpty()) {
            Internal.ProtobufList<survey> protobufListB = this.f28451d.b();
            if ((protobufListB instanceof Collection) && protobufListB.isEmpty()) {
                slideVar.f28401d.put("User-Agent", strC);
            } else {
                for (survey surveyVar : protobufListB) {
                    if (!surveyVar.c() && !surveyVar.b()) {
                        break;
                    }
                }
                slideVar.f28401d.put("User-Agent", strC);
            }
        }
        if (this.f28450c.f19830b.length() > 0) {
            k0.pair pairVar = this.f28450c;
            if (!Intrinsics.areEqual(pairVar.f19830b, pairVar.f19831c)) {
                slideVar.f28401d.put("x-ma-pid", String.valueOf(this.f28450c.f19830b));
            }
        }
        if (!Intrinsics.areEqual(this.f28449b.f28425d, "")) {
            slideVar.f28401d.put("x-integration-token", String.valueOf(this.f28449b.f28425d));
        }
        return Unit.INSTANCE;
    }
}
