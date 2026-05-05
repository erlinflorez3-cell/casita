package com.google.android.material.color.utilities;

import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Function;

/* JADX INFO: loaded from: classes8.dex */
public final class DynamicColor {
    public final Function<DynamicScheme, DynamicColor> background;
    public final ContrastCurve contrastCurve;
    private final HashMap<DynamicScheme, Hct> hctCache;
    public final boolean isBackground;
    public final String name;
    public final Function<DynamicScheme, Double> opacity;
    public final Function<DynamicScheme, TonalPalette> palette;
    public final Function<DynamicScheme, DynamicColor> secondBackground;
    public final Function<DynamicScheme, Double> tone;
    public final Function<DynamicScheme, ToneDeltaPair> toneDeltaPair;

    public DynamicColor(String str, Function<DynamicScheme, TonalPalette> function, Function<DynamicScheme, Double> function2, boolean z2, Function<DynamicScheme, DynamicColor> function3, Function<DynamicScheme, DynamicColor> function4, ContrastCurve contrastCurve, Function<DynamicScheme, ToneDeltaPair> function5) {
        this.hctCache = new HashMap<>();
        this.name = str;
        this.palette = function;
        this.tone = function2;
        this.isBackground = z2;
        this.background = function3;
        this.secondBackground = function4;
        this.contrastCurve = contrastCurve;
        this.toneDeltaPair = function5;
        this.opacity = null;
    }

    public DynamicColor(String str, Function<DynamicScheme, TonalPalette> function, Function<DynamicScheme, Double> function2, boolean z2, Function<DynamicScheme, DynamicColor> function3, Function<DynamicScheme, DynamicColor> function4, ContrastCurve contrastCurve, Function<DynamicScheme, ToneDeltaPair> function5, Function<DynamicScheme, Double> function6) {
        this.hctCache = new HashMap<>();
        this.name = str;
        this.palette = function;
        this.tone = function2;
        this.isBackground = z2;
        this.background = function3;
        this.secondBackground = function4;
        this.contrastCurve = contrastCurve;
        this.toneDeltaPair = function5;
        this.opacity = function6;
    }

    public static double enableLightForeground(double d2) {
        if (!tonePrefersLightForeground(d2) || toneAllowsLightForeground(d2)) {
            return d2;
        }
        return 49.0d;
    }

    public static double foregroundTone(double d2, double d3) {
        double dLighterUnsafe = Contrast.lighterUnsafe(d2, d3);
        double dDarkerUnsafe = Contrast.darkerUnsafe(d2, d3);
        double dRatioOfTones = Contrast.ratioOfTones(dLighterUnsafe, d2);
        double dRatioOfTones2 = Contrast.ratioOfTones(dDarkerUnsafe, d2);
        if (tonePrefersLightForeground(d2)) {
            return (dRatioOfTones >= d3 || dRatioOfTones >= dRatioOfTones2 || ((Math.abs(dRatioOfTones - dRatioOfTones2) > 0.1d ? 1 : (Math.abs(dRatioOfTones - dRatioOfTones2) == 0.1d ? 0 : -1)) < 0 && (dRatioOfTones > d3 ? 1 : (dRatioOfTones == d3 ? 0 : -1)) < 0 && (dRatioOfTones2 > d3 ? 1 : (dRatioOfTones2 == d3 ? 0 : -1)) < 0)) ? dLighterUnsafe : dDarkerUnsafe;
        }
        return (dRatioOfTones2 >= d3 || dRatioOfTones2 >= dRatioOfTones) ? dDarkerUnsafe : dLighterUnsafe;
    }

    public static DynamicColor fromArgb(String str, int i2) {
        final Hct hctFromInt = Hct.fromInt(i2);
        final TonalPalette tonalPaletteFromInt = TonalPalette.fromInt(i2);
        return fromPalette(str, new Function() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return DynamicColor.lambda$fromArgb$0(tonalPaletteFromInt, (DynamicScheme) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.DynamicColor$$ExternalSyntheticLambda1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(hctFromInt.getTone());
            }
        });
    }

    public static DynamicColor fromPalette(String str, Function<DynamicScheme, TonalPalette> function, Function<DynamicScheme, Double> function2) {
        return new DynamicColor(str, function, function2, false, null, null, null, null);
    }

    public static DynamicColor fromPalette(String str, Function<DynamicScheme, TonalPalette> function, Function<DynamicScheme, Double> function2, boolean z2) {
        return new DynamicColor(str, function, function2, z2, null, null, null, null);
    }

    static /* synthetic */ TonalPalette lambda$fromArgb$0(TonalPalette tonalPalette, DynamicScheme dynamicScheme) {
        return tonalPalette;
    }

    public static boolean toneAllowsLightForeground(double d2) {
        return Math.round(d2) <= 49;
    }

    public static boolean tonePrefersLightForeground(double d2) {
        return Math.round(d2) < 60;
    }

    public int getArgb(DynamicScheme dynamicScheme) {
        int i2 = getHct(dynamicScheme).toInt();
        Function<DynamicScheme, Double> function = this.opacity;
        if (function == null) {
            return i2;
        }
        return (MathUtils.clampInt(0, 255, (int) Math.round(function.apply(dynamicScheme).doubleValue() * 255.0d)) << 24) | (i2 & ViewCompat.MEASURED_SIZE_MASK);
    }

    public Hct getHct(DynamicScheme dynamicScheme) {
        Hct hct = this.hctCache.get(dynamicScheme);
        if (hct != null) {
            return hct;
        }
        Hct hct2 = this.palette.apply(dynamicScheme).getHct(getTone(dynamicScheme));
        if (this.hctCache.size() > 4) {
            this.hctCache.clear();
        }
        this.hctCache.put(dynamicScheme, hct2);
        return hct2;
    }

    public double getTone(DynamicScheme dynamicScheme) {
        boolean z2 = dynamicScheme.contrastLevel < 0.0d;
        Function<DynamicScheme, ToneDeltaPair> function = this.toneDeltaPair;
        if (function == null) {
            double dDoubleValue = this.tone.apply(dynamicScheme).doubleValue();
            Function<DynamicScheme, DynamicColor> function2 = this.background;
            if (function2 == null) {
                return dDoubleValue;
            }
            double tone = function2.apply(dynamicScheme).getTone(dynamicScheme);
            double contrast = this.contrastCurve.getContrast(dynamicScheme.contrastLevel);
            if (Contrast.ratioOfTones(tone, dDoubleValue) < contrast) {
                dDoubleValue = foregroundTone(tone, contrast);
            }
            if (z2) {
                dDoubleValue = foregroundTone(tone, contrast);
            }
            if (this.isBackground && 50.0d <= dDoubleValue && dDoubleValue < 60.0d) {
                dDoubleValue = 49.0d;
                if (Contrast.ratioOfTones(49.0d, tone) < contrast) {
                    dDoubleValue = 60.0d;
                }
            }
            if (this.secondBackground == null) {
                return dDoubleValue;
            }
            double tone2 = this.background.apply(dynamicScheme).getTone(dynamicScheme);
            double tone3 = this.secondBackground.apply(dynamicScheme).getTone(dynamicScheme);
            double dMax = Math.max(tone2, tone3);
            double dMin = Math.min(tone2, tone3);
            if (Contrast.ratioOfTones(dMax, dDoubleValue) >= contrast && Contrast.ratioOfTones(dMin, dDoubleValue) >= contrast) {
                return dDoubleValue;
            }
            double dLighter = Contrast.lighter(dMax, contrast);
            double dDarker = Contrast.darker(dMin, contrast);
            ArrayList arrayList = new ArrayList();
            if (dLighter != -1.0d) {
                arrayList.add(Double.valueOf(dLighter));
            }
            if (dDarker != -1.0d) {
                arrayList.add(Double.valueOf(dDarker));
            }
            if (tonePrefersLightForeground(tone2) || tonePrefersLightForeground(tone3)) {
                if (dLighter == -1.0d) {
                    return 100.0d;
                }
                return dLighter;
            }
            if (arrayList.size() == 1) {
                return ((Double) arrayList.get(0)).doubleValue();
            }
            if (dDarker == -1.0d) {
                return 0.0d;
            }
            return dDarker;
        }
        ToneDeltaPair toneDeltaPairApply = function.apply(dynamicScheme);
        DynamicColor roleA = toneDeltaPairApply.getRoleA();
        DynamicColor roleB = toneDeltaPairApply.getRoleB();
        double delta = toneDeltaPairApply.getDelta();
        TonePolarity polarity = toneDeltaPairApply.getPolarity();
        boolean stayTogether = toneDeltaPairApply.getStayTogether();
        double tone4 = this.background.apply(dynamicScheme).getTone(dynamicScheme);
        boolean z3 = polarity == TonePolarity.NEARER || (polarity == TonePolarity.LIGHTER && !dynamicScheme.isDark) || (polarity == TonePolarity.DARKER && dynamicScheme.isDark);
        DynamicColor dynamicColor = z3 ? roleA : roleB;
        if (!z3) {
            roleB = roleA;
        }
        boolean zEquals = this.name.equals(dynamicColor.name);
        double d2 = dynamicScheme.isDark ? 1.0d : -1.0d;
        double contrast2 = dynamicColor.contrastCurve.getContrast(dynamicScheme.contrastLevel);
        double contrast3 = roleB.contrastCurve.getContrast(dynamicScheme.contrastLevel);
        double dDoubleValue2 = dynamicColor.tone.apply(dynamicScheme).doubleValue();
        if (Contrast.ratioOfTones(tone4, dDoubleValue2) < contrast2) {
            dDoubleValue2 = foregroundTone(tone4, contrast2);
        }
        double dDoubleValue3 = roleB.tone.apply(dynamicScheme).doubleValue();
        if (Contrast.ratioOfTones(tone4, dDoubleValue3) < contrast3) {
            dDoubleValue3 = foregroundTone(tone4, contrast3);
        }
        if (z2) {
            dDoubleValue2 = foregroundTone(tone4, contrast2);
            dDoubleValue3 = foregroundTone(tone4, contrast3);
        }
        if ((dDoubleValue3 - dDoubleValue2) * d2 < delta) {
            double d3 = delta * d2;
            dDoubleValue3 = MathUtils.clampDouble(0.0d, 100.0d, dDoubleValue2 + d3);
            if ((dDoubleValue3 - dDoubleValue2) * d2 < delta) {
                dDoubleValue2 = MathUtils.clampDouble(0.0d, 100.0d, dDoubleValue3 - d3);
            }
        }
        if (50.0d > dDoubleValue2 || dDoubleValue2 >= 60.0d) {
            if (50.0d <= dDoubleValue3 && dDoubleValue3 < 60.0d) {
                if (!stayTogether) {
                    dDoubleValue3 = d2 > 0.0d ? 60.0d : 49.0d;
                } else if (d2 > 0.0d) {
                    dDoubleValue3 = Math.max(dDoubleValue3, (delta * d2) + 60.0d);
                    dDoubleValue2 = 60.0d;
                } else {
                    dDoubleValue3 = Math.min(dDoubleValue3, (delta * d2) + 49.0d);
                    dDoubleValue2 = 49.0d;
                }
            }
        } else if (d2 > 0.0d) {
            dDoubleValue3 = Math.max(dDoubleValue3, (delta * d2) + 60.0d);
            dDoubleValue2 = 60.0d;
        } else {
            dDoubleValue3 = Math.min(dDoubleValue3, (delta * d2) + 49.0d);
            dDoubleValue2 = 49.0d;
        }
        return zEquals ? dDoubleValue2 : dDoubleValue3;
    }
}
