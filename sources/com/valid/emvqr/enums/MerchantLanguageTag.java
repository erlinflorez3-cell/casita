package com.valid.emvqr.enums;

import com.valid.emvqr.a4;
import com.valid.emvqr.qb;
import com.valid.emvqr.xk;
import java.util.regex.Pattern;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Jg;
import yg.Od;
import yg.Qg;
import yg.Xg;
import yg.ZO;
import yg.hg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
/* JADX INFO: loaded from: classes5.dex */
public final class MerchantLanguageTag implements Tag {
    public static final MerchantLanguageTag TAG_00_LANGUAGE_PREFERENCE;
    public static final MerchantLanguageTag TAG_01_ALTERNATE_MERCHANT_NAME;
    public static final MerchantLanguageTag TAG_02_ALTERNATE_MERCHANT_CITY;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ MerchantLanguageTag[] f18310e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f18311c;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f18312o;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Pattern f18313x;

    static {
        try {
            int i2 = (924347702 ^ 1915418119) ^ 1160944439;
            int i3 = (1347240019 ^ 818872926) ^ 1619149321;
            MerchantLanguageTag merchantLanguageTag = new MerchantLanguageTag(a4.indexOf(i2, Qg.kd("TYM\u000bph\u001d\u0014\u001f\u001e\r\u0015__SSPJKB;J\u0013\u0012|t", (short) (Od.Xd() ^ ((831695530 ^ 2105477440) ^ (-1290656987))), (short) (Od.Xd() ^ ((1153241893 ^ 1366438147) ^ (-365903855))))), 0, a4.indexOf(i2, hg.Vd("=U", (short) (FB.Xd() ^ (1633599157 ^ 1633596709)), (short) (FB.Xd() ^ (661333017 ^ 661352324)))), qb.substring(C1561oA.ud("v\u001dU\fB'\u0012*)M\u0007K\t", (short) (C1580rY.Xd() ^ ((1819059157 ^ 289359933) ^ (-2102638245)))), i3), true);
            TAG_00_LANGUAGE_PREFERENCE = merchantLanguageTag;
            MerchantLanguageTag merchantLanguageTag2 = new MerchantLanguageTag(qb.substring(C1561oA.yd("\u0007\u001a\u001c\b[Z\f\u0006\u000f\u0015\n\u0013\u0015\u001a\u0003\u001a\u001c\u000e\u001a#Ӯ\u0011f_W`ufV^", (short) (C1499aX.Xd() ^ (1411976855 ^ (-1411998305)))), 1), 1, qb.substring(C1561oA.Yd("]\u001b", (short) (C1499aX.Xd() ^ ((1510279815 ^ 1534129562) ^ (-24496228)))), (1952155038 ^ 1271470560) ^ 1066572924), a4.indexOf(i3, Xg.qd("6\faWdh_+l", (short) (C1607wl.Xd() ^ (996824810 ^ 996804029)), (short) (C1607wl.Xd() ^ ((1077118338 ^ 1580717057) ^ 503592930)))), true);
            TAG_01_ALTERNATE_MERCHANT_NAME = merchantLanguageTag2;
            int i4 = (642485307 ^ 481172395) ^ 988125077;
            MerchantLanguageTag merchantLanguageTag3 = new MerchantLanguageTag(a4.indexOf(i4, Jg.Wd("T\u0016\b\"\bv\ræS0\u0013\u001d/%\u0011p\u0003g[E\u001cdCI!\u000b~WK/", (short) (C1499aX.Xd() ^ ((674468863 ^ 995857325) ^ (-325598615))), (short) (C1499aX.Xd() ^ ((817376193 ^ 1126054198) ^ (-1940262588))))), (1430666357 ^ 1383406394) ^ 120792909, a4.indexOf(1, ZO.xd("\u00131", (short) (C1633zX.Xd() ^ (1389445454 ^ (-1389429996))), (short) (C1633zX.Xd() ^ (545205854 ^ (-545198321))))), qb.substring(C1626yg.Ud("OP5tO}\u001elt", (short) (C1580rY.Xd() ^ (1091129879 ^ (-1091138729))), (short) (C1580rY.Xd() ^ (1772127044 ^ (-1772126249)))), i4), false);
            TAG_02_ALTERNATE_MERCHANT_CITY = merchantLanguageTag3;
            f18310e = new MerchantLanguageTag[]{merchantLanguageTag, merchantLanguageTag2, merchantLanguageTag3};
        } catch (xk unused) {
        }
    }

    private MerchantLanguageTag(String str, int i2, String str2, String str3, boolean z2) {
        this.f18312o = str2;
        this.f18311c = z2;
        if (str3 != null) {
            this.f18313x = Pattern.compile(str3);
        }
    }

    public static MerchantLanguageTag valueOf(String str) {
        try {
            return (MerchantLanguageTag) Enum.valueOf(MerchantLanguageTag.class, str);
        } catch (xk unused) {
            return null;
        }
    }

    public static MerchantLanguageTag[] values() {
        try {
            return (MerchantLanguageTag[]) f18310e.clone();
        } catch (xk unused) {
            return null;
        }
    }

    @Override // com.valid.emvqr.enums.Tag
    public Pattern getPattern() {
        return this.f18313x;
    }

    @Override // com.valid.emvqr.enums.Tag
    public String getTag() {
        return this.f18312o;
    }

    @Override // com.valid.emvqr.enums.Tag
    public boolean isMandatory() {
        return this.f18311c;
    }
}
