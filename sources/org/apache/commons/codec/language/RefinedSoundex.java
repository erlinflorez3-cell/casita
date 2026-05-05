package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

/* JADX INFO: loaded from: classes6.dex */
public class RefinedSoundex implements StringEncoder {
    private final char[] soundexMapping;
    public static final String US_ENGLISH_MAPPING_STRING = "01360240043788015936020505";
    private static final char[] US_ENGLISH_MAPPING = US_ENGLISH_MAPPING_STRING.toCharArray();
    public static final RefinedSoundex US_ENGLISH = new RefinedSoundex();

    public RefinedSoundex() {
        this.soundexMapping = US_ENGLISH_MAPPING;
    }

    public RefinedSoundex(String str) {
        this.soundexMapping = str.toCharArray();
    }

    public RefinedSoundex(char[] cArr) {
        this.soundexMapping = (char[]) cArr.clone();
    }

    public int difference(String str, String str2) throws EncoderException {
        return SoundexUtils.difference(this, str, str2);
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return soundex((String) obj);
        }
        throw new EncoderException("Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        return soundex(str);
    }

    char getMappingCode(char c2) {
        int upperCase;
        if (Character.isLetter(c2) && Character.toUpperCase(c2) - 'A' >= 0) {
            char[] cArr = this.soundexMapping;
            if (upperCase < cArr.length) {
                return cArr[upperCase];
            }
        }
        return (char) 0;
    }

    public String soundex(String str) {
        if (str == null) {
            return null;
        }
        String strClean = SoundexUtils.clean(str);
        if (strClean.isEmpty()) {
            return strClean;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(strClean.charAt(0));
        char c2 = '*';
        for (int i2 = 0; i2 < strClean.length(); i2++) {
            char mappingCode = getMappingCode(strClean.charAt(i2));
            if (mappingCode != c2) {
                if (mappingCode != 0) {
                    sb.append(mappingCode);
                }
                c2 = mappingCode;
            }
        }
        return sb.toString();
    }
}
