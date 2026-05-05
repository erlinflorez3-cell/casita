package fr.antelop.sdk.settings;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletSettingsValue<T> {
    private final WalletSettingsRights rights;
    private final T value;

    public WalletSettingsValue(T t2, WalletSettingsRights walletSettingsRights) {
        this.value = t2;
        this.rights = walletSettingsRights;
    }

    public final WalletSettingsRights getRights() {
        return this.rights;
    }

    public final T getValue() {
        return this.value;
    }

    public final String toString() {
        return new StringBuilder("WalletSettingsValue{value=").append(this.value).append(", rights=").append(this.rights).append(AbstractJsonLexerKt.END_OBJ).toString();
    }
}
