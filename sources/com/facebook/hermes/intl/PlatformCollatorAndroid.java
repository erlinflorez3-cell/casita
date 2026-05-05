package com.facebook.hermes.intl;

import com.facebook.hermes.intl.IPlatformCollator;
import java.text.RuleBasedCollator;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class PlatformCollatorAndroid implements IPlatformCollator {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private RuleBasedCollator mCollator;
    private LocaleObjectAndroid mLocale;

    /* JADX INFO: renamed from: com.facebook.hermes.intl.PlatformCollatorAndroid$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$hermes$intl$IPlatformCollator$Sensitivity;

        static {
            int[] iArr = new int[IPlatformCollator.Sensitivity.values().length];
            $SwitchMap$com$facebook$hermes$intl$IPlatformCollator$Sensitivity = iArr;
            try {
                iArr[IPlatformCollator.Sensitivity.BASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$hermes$intl$IPlatformCollator$Sensitivity[IPlatformCollator.Sensitivity.ACCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$hermes$intl$IPlatformCollator$Sensitivity[IPlatformCollator.Sensitivity.VARIANT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$facebook$hermes$intl$IPlatformCollator$Sensitivity[IPlatformCollator.Sensitivity.CASE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    PlatformCollatorAndroid() {
    }

    @Override // com.facebook.hermes.intl.IPlatformCollator
    public int compare(String str, String str2) {
        return this.mCollator.compare(str, str2);
    }

    @Override // com.facebook.hermes.intl.IPlatformCollator
    public IPlatformCollator configure(ILocaleObject<?> iLocaleObject) throws JSRangeErrorException {
        LocaleObjectAndroid localeObjectAndroid = (LocaleObjectAndroid) iLocaleObject;
        this.mLocale = localeObjectAndroid;
        this.mCollator = (RuleBasedCollator) RuleBasedCollator.getInstance(localeObjectAndroid.getLocale());
        return this;
    }

    @Override // com.facebook.hermes.intl.IPlatformCollator
    public String[] getAvailableLocales() {
        ArrayList arrayList = new ArrayList();
        for (Locale locale : java.text.Collator.getAvailableLocales()) {
            arrayList.add(locale.toLanguageTag());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // com.facebook.hermes.intl.IPlatformCollator
    public IPlatformCollator.Sensitivity getSensitivity() {
        RuleBasedCollator ruleBasedCollator = this.mCollator;
        if (ruleBasedCollator == null) {
            return IPlatformCollator.Sensitivity.LOCALE;
        }
        int strength = ruleBasedCollator.getStrength();
        return strength == 0 ? IPlatformCollator.Sensitivity.BASE : strength == 1 ? IPlatformCollator.Sensitivity.ACCENT : IPlatformCollator.Sensitivity.VARIANT;
    }

    @Override // com.facebook.hermes.intl.IPlatformCollator
    public IPlatformCollator setCaseFirstAttribute(IPlatformCollator.CaseFirst caseFirst) {
        return this;
    }

    @Override // com.facebook.hermes.intl.IPlatformCollator
    public IPlatformCollator setIgnorePunctuation(boolean z2) {
        return this;
    }

    @Override // com.facebook.hermes.intl.IPlatformCollator
    public IPlatformCollator setNumericAttribute(boolean z2) {
        return this;
    }

    @Override // com.facebook.hermes.intl.IPlatformCollator
    public IPlatformCollator setSensitivity(IPlatformCollator.Sensitivity sensitivity) {
        int i2 = AnonymousClass1.$SwitchMap$com$facebook$hermes$intl$IPlatformCollator$Sensitivity[sensitivity.ordinal()];
        if (i2 == 1) {
            this.mCollator.setStrength(0);
        } else if (i2 == 2) {
            this.mCollator.setStrength(1);
        } else if (i2 == 3) {
            this.mCollator.setStrength(2);
        } else if (i2 == 4) {
            this.mCollator.setStrength(0);
        }
        return this;
    }
}
