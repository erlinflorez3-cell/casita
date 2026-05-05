package com.valid.emvqr.parser;

import androidx.webkit.ProxyConfig;
import com.valid.emvqr.entities.AbstractMerchantEntity;
import com.valid.emvqr.entities.MerchantAccountInformation;
import com.valid.emvqr.entities.MerchantAccountInformationTemplate;
import com.valid.emvqr.entities.MerchantAdditionalData;
import com.valid.emvqr.entities.MerchantEmvQrEntity;
import com.valid.emvqr.entities.MerchantInformationLanguage;
import com.valid.emvqr.entities.MerchantUnreservedTemplate;
import com.valid.emvqr.entities.PaymentSystemSpecificTemplate;
import com.valid.emvqr.exceptions.DuplicateTagException;
import com.valid.emvqr.exceptions.EmvQrException;
import com.valid.emvqr.exceptions.InvalidCrcException;
import com.valid.emvqr.exceptions.InvalidLengthException;
import com.valid.emvqr.exceptions.MissingCharactersException;
import com.valid.emvqr.qq;
import com.valid.emvqr.utils.ParserUtils;
import java.io.Serializable;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.OY;
import yg.Od;
import yg.Xg;
import yg.ZN;

/* JADX INFO: loaded from: classes5.dex */
public class Parser {
    private static <A extends AbstractMerchantEntity> A a(String str, A a2) throws EmvQrException {
        String tag;
        int i2;
        int i3;
        int length = 0;
        while (length < str.length()) {
            TagLengthValue tagLengthValueT = t(str, length);
            if (Integer.parseInt(C1561oA.yd("\u0006", (short) (ZN.Xd() ^ (ZN.Xd() ^ (1072926319 ^ 209306195))))) != 0) {
                i2 = 4;
                tagLengthValueT = null;
                tag = null;
            } else {
                tag = tagLengthValueT.getTag();
                i2 = 953825208 ^ 953825211;
            }
            if (i2 != 0) {
                i3 = Integer.parseInt(tag);
            } else {
                i3 = 1;
                tag = null;
            }
            z(a2, tag, (!(a2 instanceof MerchantAdditionalData) || i3 < (C1607wl.Xd() ^ (227655709 ^ 1674957813)) || i3 > (Od.Xd() ^ 1207800886)) ? tagLengthValueT.getValue() : f(tag, tagLengthValueT.getValue()));
            length = length + tagLengthValueT.getValue().length() + 4;
        }
        return a2;
    }

    private static MerchantAdditionalData c(String str) throws EmvQrException {
        try {
            return (MerchantAdditionalData) a(str, new MerchantAdditionalData());
        } catch (qq unused) {
            return null;
        }
    }

    private static PaymentSystemSpecificTemplate f(String str, String str2) throws EmvQrException {
        try {
            return (PaymentSystemSpecificTemplate) a(str2, new PaymentSystemSpecificTemplate(str));
        } catch (qq unused) {
            return null;
        }
    }

    private static void f(MerchantAccountInformation merchantAccountInformation, String str, Serializable serializable) throws EmvQrException {
        int i2 = Integer.parseInt(str);
        if (i2 >= (C1499aX.Xd() ^ (-1134257930)) && i2 <= ((1113008258 ^ 1652422951) ^ 539677078)) {
            serializable = n((String) serializable);
        }
        z(merchantAccountInformation, str, serializable);
    }

    private static MerchantEmvQrEntity j(String str) throws EmvQrException {
        String tag;
        int i2;
        int i3;
        Serializable value;
        ParserUtils.notNull(str);
        MerchantEmvQrEntity merchantEmvQrEntity = new MerchantEmvQrEntity();
        int length = 0;
        while (length < str.length()) {
            TagLengthValue tagLengthValueT = t(str, length);
            String strYd = C1561oA.Yd(ProxyConfig.MATCH_ALL_SCHEMES, (short) (C1607wl.Xd() ^ ((636907295 ^ 1818202375) ^ 1235862894)));
            if (Integer.parseInt(strYd) != 0) {
                i2 = 791832100 ^ 791832106;
                tagLengthValueT = null;
                tag = null;
            } else {
                tag = tagLengthValueT.getTag();
                i2 = 11;
            }
            if (i2 != 0) {
                i3 = Integer.parseInt(tag);
            } else {
                i3 = 1;
                tag = null;
            }
            if (i3 < ((625414122 ^ 1822123943) ^ 1239181391) || i3 > ((986453128 ^ 1591482434) ^ 1678773497)) {
                if (i3 == (1667778277 ^ 1667778267)) {
                    value = c(tagLengthValueT.getValue());
                } else if (i3 == ((1193886668 ^ 941540081) ^ 2134344061)) {
                    value = r(tagLengthValueT.getValue());
                } else if (i3 < (1481697788 ^ 1481697708) || i3 > (452541435 ^ 452541336)) {
                    value = tagLengthValueT.getValue();
                } else {
                    z(merchantEmvQrEntity, tag, Integer.parseInt(strYd) == 0 ? w(tagLengthValueT.getTag(), tagLengthValueT.getValue()) : null);
                }
                z(merchantEmvQrEntity, tag, value);
            } else {
                f(merchantEmvQrEntity.getMerchantAccountInformation(), tagLengthValueT.getTag(), tagLengthValueT.getValue());
            }
            length = length + tagLengthValueT.getValue().length() + 4;
        }
        return merchantEmvQrEntity;
    }

    private static MerchantAccountInformationTemplate n(String str) throws EmvQrException {
        try {
            return (MerchantAccountInformationTemplate) a(str, new MerchantAccountInformationTemplate());
        } catch (qq unused) {
            return null;
        }
    }

    public static MerchantEmvQrEntity parseData(String str) throws EmvQrException {
        try {
            MerchantEmvQrEntity merchantEmvQrEntityU = u(str);
            merchantEmvQrEntityU.validate();
            return merchantEmvQrEntityU;
        } catch (qq unused) {
            return null;
        }
    }

    private static MerchantInformationLanguage r(String str) throws EmvQrException {
        try {
            return (MerchantInformationLanguage) a(str, new MerchantInformationLanguage());
        } catch (qq unused) {
            return null;
        }
    }

    private static TagLengthValue t(String str, int i2) throws EmvQrException {
        int i3;
        String strSubstring;
        String strX = x(str, i2, i2 + 2);
        String strQd = Xg.qd("e", (short) (Od.Xd() ^ (OY.Xd() ^ (615364095 ^ (-545694317)))), (short) (Od.Xd() ^ (335682590 ^ (-335698206))));
        if (Integer.parseInt(strQd) == 0) {
            strX = ParserUtils.isValidTagString(strX);
        }
        int i4 = 1;
        String strX2 = null;
        if (Integer.parseInt(strQd) != 0) {
            i3 = 1;
            strSubstring = null;
        } else {
            i3 = i2 + 2;
            strSubstring = str.substring(i3, i2 + 4);
        }
        if (!ParserUtils.isNumeric(strSubstring)) {
            throw new InvalidLengthException(strSubstring);
        }
        int i5 = Integer.parseInt(strSubstring);
        if (Integer.parseInt(strQd) == 0) {
            int i6 = i3 + 2;
            strX2 = x(str, i6, i6 + i5);
            i4 = i5;
        }
        return new TagLengthValue(strX, i4, strX2);
    }

    private static MerchantEmvQrEntity u(String str) throws EmvQrException {
        ParserUtils.notNull(str);
        if (ParserUtils.validateChecksumCRC16(str)) {
            return j(str);
        }
        int length = str.length();
        int iXd = C1499aX.Xd() ^ (-1134257944);
        throw new InvalidCrcException(length > iXd ? str.substring(str.length() - iXd) : null);
    }

    private static MerchantUnreservedTemplate w(String str, String str2) throws EmvQrException {
        try {
            return (MerchantUnreservedTemplate) a(str2, new MerchantUnreservedTemplate(str));
        } catch (qq unused) {
            return null;
        }
    }

    private static String x(String str, int i2, int i3) throws EmvQrException {
        try {
            if (str.length() >= i3) {
                return str.substring(i2, i3);
            }
            throw new MissingCharactersException();
        } catch (qq unused) {
            return null;
        }
    }

    private static <A extends AbstractMerchantEntity> A z(A a2, String str, Serializable serializable) throws EmvQrException {
        try {
            if (!a2.getMap().containsKey(str)) {
                a2.setValue(str, serializable);
                return a2;
            }
            if (a2.getRootTag() != null) {
                throw new DuplicateTagException(str, a2.getRootTag());
            }
            throw new DuplicateTagException(str);
        } catch (qq unused) {
            return null;
        }
    }
}
