package fr.antelop.sdk.authentication;

import android.os.Process;
import android.os.SystemClock;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.ea.m;
import o.m.f;
import o.p.b;

/* JADX INFO: loaded from: classes5.dex */
public final class CustomerAuthenticationPattern {
    public static final String LOW = "low";
    public static final String MEDIUM = "medium";
    public static final String NO_AUTHENTICATION = "no_authentication";
    public static final String STRONG = "strong";
    private final b authenticationPattern;

    public CustomerAuthenticationPattern(b bVar) {
        this.authenticationPattern = bVar;
    }

    public final String getName() {
        return this.authenticationPattern.b();
    }

    public final CustomerAuthenticationMethodType[] getStep(int i2) {
        Object[] objArr = {CustomerAuthenticationMethodType.class, this.authenticationPattern.b(i2)};
        int i3 = m.f23565f * (-1519886034);
        m.f23565f = i3;
        return (CustomerAuthenticationMethodType[]) ((Object[]) m.c(objArr, (int) SystemClock.elapsedRealtime(), (int) Runtime.getRuntime().maxMemory(), -1364214447, i3, 1364214450, (int) Process.getElapsedCpuTime()));
    }

    public final int getStepCount() {
        Object[] objArr = {this.authenticationPattern};
        int i2 = b.f26681e * 372422417;
        b.f26681e = i2;
        int i3 = b.f26680d * 1240573401;
        b.f26680d = i3;
        return ((Integer) b.a(-927348846, Process.myPid(), 927348846, Process.myUid(), i3, i2, objArr)).intValue();
    }

    public final boolean isReady() {
        return this.authenticationPattern.b((f) null);
    }

    public final String toString() {
        return new StringBuilder("CustomerAuthenticationPattern{name='").append(getName()).append("', stepCount=").append(getStepCount()).append(AbstractJsonLexerKt.END_OBJ).toString();
    }
}
