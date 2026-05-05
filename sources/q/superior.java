package q;

import android.app.Application;
import android.media.AudioManager;
import android.telecom.TelecomManager;
import androidx.core.content.ContextCompat;
import o0.tongue;

/* JADX INFO: loaded from: classes2.dex */
public final class superior {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f28243a;

    public superior(Application application) {
        this.f28243a = application;
    }

    public final o0.pair a() {
        if (!h1.pair.a(this.f28243a, "android.permission.READ_PHONE_STATE")) {
            AudioManager audioManager = (AudioManager) ContextCompat.getSystemService(this.f28243a, AudioManager.class);
            if (audioManager == null) {
                return new o0.pair(o0.superior.f27445c, tongue.f27446a);
            }
            int mode = audioManager.getMode();
            return mode == 3 ? new o0.pair(o0.superior.f27443a, tongue.f27447b) : mode == 2 ? new o0.pair(o0.superior.f27443a, tongue.f27448c) : new o0.pair(o0.superior.f27445c, tongue.f27446a);
        }
        o0.superior superiorVar = o0.superior.f27445c;
        AudioManager audioManager2 = (AudioManager) ContextCompat.getSystemService(this.f28243a, AudioManager.class);
        o0.superior superiorVar2 = (audioManager2 == null || audioManager2.getMode() != 3) ? superiorVar : o0.superior.f27443a;
        TelecomManager telecomManager = (TelecomManager) ContextCompat.getSystemService(this.f28243a, TelecomManager.class);
        o0.superior superiorVar3 = telecomManager != null ? telecomManager.isInCall() ? o0.superior.f27443a : o0.superior.f27444b : superiorVar;
        if (superiorVar2 == superiorVar && superiorVar3 == superiorVar) {
            return new o0.pair(superiorVar, tongue.f27446a);
        }
        o0.superior superiorVar4 = o0.superior.f27443a;
        return superiorVar3 == superiorVar4 ? new o0.pair(superiorVar4, tongue.f27448c) : superiorVar2 == superiorVar4 ? new o0.pair(superiorVar4, tongue.f27447b) : new o0.pair(o0.superior.f27444b, tongue.f27446a);
    }
}
