package com.valid.emvqr.entities;

import com.valid.emvqr.a4;
import com.valid.emvqr.enums.Tag;
import com.valid.emvqr.exceptions.EmvQrException;
import com.valid.emvqr.exceptions.InvalidValueException;
import com.valid.emvqr.exceptions.MissingTagException;
import com.valid.emvqr.yx;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.FB;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractMerchantEntity<T extends Tag> implements Serializable {

    /* JADX INFO: renamed from: d */
    private Map<String, Serializable> f18293d;

    /* JADX INFO: renamed from: i */
    private Tag[] f18294i;

    /* JADX INFO: renamed from: v */
    private Pattern f18295v;

    /* JADX INFO: renamed from: z */
    private String f18296z;

    public AbstractMerchantEntity(Class<T> cls, String str) {
        this.f18295v = null;
        this.f18296z = null;
        this.f18293d = new HashMap();
        this.f18294i = cls.getEnumConstants();
        if (str.isEmpty()) {
            return;
        }
        this.f18295v = Pattern.compile(str);
    }

    public AbstractMerchantEntity(Class<T> cls, String str, String str2) {
        this(cls, str);
        this.f18296z = str2;
    }

    private final void q(Tag tag) throws EmvQrException {
        try {
            if (tag.isMandatory()) {
                if (!(this instanceof MerchantEmvQrEntity)) {
                    throw new MissingTagException(tag, this.f18296z);
                }
                throw new MissingTagException(tag);
            }
        } catch (yx unused) {
        }
    }

    private final void w(Tag tag, Serializable serializable) throws EmvQrException {
        try {
            if (serializable instanceof AbstractMerchantEntity) {
                ((AbstractMerchantEntity) serializable).validate();
            }
            String strValueOf = String.valueOf(serializable);
            if (tag.getPattern() == null || tag.getPattern().matcher(strValueOf).matches()) {
                return;
            }
            if (this.f18296z == null) {
                throw new InvalidValueException(tag, strValueOf);
            }
            throw new InvalidValueException(this.f18296z, tag, strValueOf);
        } catch (yx unused) {
        }
    }

    public Tag[] getAllTags() {
        try {
            return (Tag[]) this.f18294i.clone();
        } catch (yx unused) {
            return null;
        }
    }

    public Map<String, Serializable> getMap() {
        return this.f18293d;
    }

    public Pattern getPattern() {
        return this.f18295v;
    }

    public String getRootTag() {
        return this.f18296z;
    }

    public Serializable getValueFromTag(String str) {
        try {
            return this.f18293d.get(str);
        } catch (yx unused) {
            return null;
        }
    }

    public final Map<String, PaymentSystemSpecificTemplate> n(String str, String str2) {
        HashMap map = new HashMap();
        for (int i2 = Integer.parseInt(str); i2 <= Integer.parseInt(str2); i2++) {
            String strValueOf = String.valueOf(i2);
            if (strValueOf.length() == 1) {
                strValueOf = hg.Vd("l", (short) (FB.Xd() ^ (937196502 ^ 937192397)), (short) (FB.Xd() ^ ((1306381399 ^ 138171978) ^ 1172406789))).concat(strValueOf);
            }
            if (getMap().containsKey(strValueOf)) {
                map.put(strValueOf, (PaymentSystemSpecificTemplate) getMap().get(strValueOf));
            }
        }
        return map;
    }

    public final Map<String, MerchantAccountInformationTemplate> o(String str, String str2) {
        HashMap map = new HashMap();
        for (int i2 = Integer.parseInt(str); i2 <= Integer.parseInt(str2); i2++) {
            String strValueOf = String.valueOf(i2);
            if (strValueOf.length() == 1) {
                strValueOf = C1561oA.ud("\u0015", (short) (ZN.Xd() ^ (ZN.Xd() ^ 864711348))).concat(strValueOf);
            }
            if (getMap().containsKey(strValueOf)) {
                map.put(strValueOf, (MerchantAccountInformationTemplate) getMap().get(strValueOf));
            }
        }
        return map;
    }

    public void setValue(String str, Serializable serializable) {
        try {
            this.f18293d.put(str, serializable);
        } catch (yx unused) {
        }
    }

    public final String v(Tag tag) {
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        int i6;
        String strValueOf = String.valueOf(this.f18293d.get(tag.getTag()));
        if (strValueOf == null) {
            return null;
        }
        String strYd = C1561oA.yd("F", (short) (C1607wl.Xd() ^ (1321212041 ^ 1321227785)));
        int i7 = Integer.parseInt(strYd);
        int i8 = 4;
        String strYd2 = C1561oA.Yd("H", (short) (ZN.Xd() ^ (FB.Xd() ^ 1609507975)));
        int i9 = 1;
        if (i7 != 0) {
            str = strYd;
            i3 = 4;
            i2 = 1;
        } else {
            i2 = 28;
            i3 = 10;
            str = strYd2;
        }
        int i10 = 0;
        if (i3 != 0) {
            i2 += i2 + i2;
            str = strYd;
            i4 = 0;
        } else {
            i4 = i3 + 11;
        }
        if (Integer.parseInt(str) != 0) {
            i6 = i4 + 13;
            i5 = 1;
            i8 = 1;
            strYd2 = str;
        } else {
            i5 = i2 + 14;
            i6 = i4 + 15;
            i9 = 4;
        }
        if (i6 != 0) {
            i5 += i8 + i9;
            i10 = 978858342 ^ 978858337;
        } else {
            strYd = strYd2;
        }
        if (Integer.parseInt(strYd) == 0) {
            i5 /= i10 << 2;
        }
        if (a4.indexOf(i5, Xg.qd("! \u0013\\", (short) (C1499aX.Xd() ^ (Od.Xd() ^ (-1207803265))), (short) (C1499aX.Xd() ^ (1123877606 ^ (-1123901178))))).equals(strValueOf)) {
            return null;
        }
        return strValueOf;
    }

    public void validate() throws EmvQrException {
        Map<String, Serializable> map;
        String tag;
        for (Tag tag2 : this.f18294i) {
            if (Integer.parseInt(Jg.Wd("u", (short) (Od.Xd() ^ (620284701 ^ (-620278038))), (short) (Od.Xd() ^ (ZN.Xd() ^ (2030207106 ^ (-1250484112)))))) != 0) {
                map = null;
                tag = null;
            } else {
                map = this.f18293d;
                tag = tag2.getTag();
            }
            Serializable serializable = map.get(tag);
            if (serializable == null) {
                q(tag2);
            } else {
                w(tag2, serializable);
            }
        }
    }

    public final Map<String, MerchantUnreservedTemplate> x(String str, String str2) {
        HashMap map = new HashMap();
        for (int i2 = Integer.parseInt(str); i2 <= Integer.parseInt(str2); i2++) {
            String strValueOf = String.valueOf(i2);
            if (strValueOf.length() == 1) {
                strValueOf = ZO.xd("m", (short) (Od.Xd() ^ (1917302241 ^ (-1917306318))), (short) (Od.Xd() ^ ((1272455063 ^ 1676196862) ^ (-674287376)))).concat(strValueOf);
            }
            if (getMap().containsKey(strValueOf)) {
                map.put(strValueOf, (MerchantUnreservedTemplate) getMap().get(strValueOf));
            }
        }
        return map;
    }

    public final Map<String, String> y(String str, String str2) {
        HashMap map = new HashMap();
        for (int i2 = Integer.parseInt(str); i2 <= Integer.parseInt(str2); i2++) {
            String strValueOf = String.valueOf(i2);
            if (strValueOf.length() == 1) {
                short sXd = (short) (C1607wl.Xd() ^ (C1499aX.Xd() ^ (717397994 ^ (-1767475326))));
                short sXd2 = (short) (C1607wl.Xd() ^ ((1292124660 ^ 2103750260) ^ 811654433));
                int[] iArr = new int["c".length()];
                QB qb = new QB("c");
                int i3 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i3] = xuXd.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i3 * sXd2))) + xuXd.CK(iKK));
                    i3++;
                }
                strValueOf = new String(iArr, 0, i3).concat(strValueOf);
            }
            if (getMap().containsKey(strValueOf)) {
                map.put(strValueOf, (String) getMap().get(strValueOf));
            }
        }
        return map;
    }
}
