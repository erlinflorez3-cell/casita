package org.apache.commons.codec.language;

import androidx.exifinterface.media.ExifInterface;
import cz.msebera.android.httpclient.message.TokenParser;
import java.util.Locale;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

/* JADX INFO: loaded from: classes6.dex */
public class MatchRatingApproachEncoder implements StringEncoder {
    private static final String[] DOUBLE_CONSONANT = {"BB", "CC", "DD", "FF", "GG", "HH", "JJ", "KK", "LL", "MM", "NN", "PP", "QQ", "RR", "SS", "TT", "VV", "WW", "XX", "YY", "ZZ"};
    private static final String EMPTY = "";
    private static final String PLAIN_ASCII = "AaEeIiOoUuAaEeIiOoUuYyAaEeIiOoUuYyAaOoNnAaEeIiOoUuYyAaCcOoUu";
    private static final String SPACE = " ";
    private static final String UNICODE = "ÀàÈèÌìÒòÙùÁáÉéÍíÓóÚúÝýÂâÊêÎîÔôÛûŶŷÃãÕõÑñÄäËëÏïÖöÜüŸÿÅåÇçŐőŰű";

    String cleanName(String str) {
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        String[] strArr = {"\\-", "[&]", "\\'", "\\.", "[\\,]"};
        for (int i2 = 0; i2 < 5; i2++) {
            upperCase = upperCase.replaceAll(strArr[i2], "");
        }
        return removeAccents(upperCase).replaceAll("\\s+", "");
    }

    @Override // org.apache.commons.codec.Encoder
    public final Object encode(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return encode((String) obj);
        }
        throw new EncoderException("Parameter supplied to Match Rating Approach encoder is not of type java.lang.String");
    }

    @Override // org.apache.commons.codec.StringEncoder
    public final String encode(String str) {
        if (str != null && !"".equalsIgnoreCase(str) && !" ".equalsIgnoreCase(str) && str.length() != 1) {
            String strCleanName = cleanName(str);
            if (!" ".equals(strCleanName) && !strCleanName.isEmpty()) {
                String strRemoveVowels = removeVowels(strCleanName);
                if (!" ".equals(strRemoveVowels) && !strRemoveVowels.isEmpty()) {
                    return getFirst3Last3(removeDoubleConsonants(strRemoveVowels));
                }
            }
        }
        return "";
    }

    String getFirst3Last3(String str) {
        int length = str.length();
        if (length <= 6) {
            return str;
        }
        return str.substring(0, 3) + str.substring(length - 3, length);
    }

    int getMinRating(int i2) {
        if (i2 <= 4) {
            return 5;
        }
        if (i2 <= 7) {
            return 4;
        }
        if (i2 <= 11) {
            return 3;
        }
        return i2 == 12 ? 2 : 1;
    }

    public boolean isEncodeEquals(String str, String str2) {
        if (str == null || "".equalsIgnoreCase(str) || " ".equalsIgnoreCase(str) || str2 == null || "".equalsIgnoreCase(str2) || " ".equalsIgnoreCase(str2) || str.length() == 1 || str2.length() == 1) {
            return false;
        }
        if (str.equalsIgnoreCase(str2)) {
            return true;
        }
        String strCleanName = cleanName(str);
        String strCleanName2 = cleanName(str2);
        String strRemoveVowels = removeVowels(strCleanName);
        String strRemoveVowels2 = removeVowels(strCleanName2);
        String strRemoveDoubleConsonants = removeDoubleConsonants(strRemoveVowels);
        String strRemoveDoubleConsonants2 = removeDoubleConsonants(strRemoveVowels2);
        String first3Last3 = getFirst3Last3(strRemoveDoubleConsonants);
        String first3Last32 = getFirst3Last3(strRemoveDoubleConsonants2);
        if (Math.abs(first3Last3.length() - first3Last32.length()) >= 3) {
            return false;
        }
        return leftToRightThenRightToLeftProcessing(first3Last3, first3Last32) >= getMinRating(Math.abs(first3Last3.length() + first3Last32.length()));
    }

    boolean isVowel(String str) {
        return str.equalsIgnoreCase(ExifInterface.LONGITUDE_EAST) || str.equalsIgnoreCase(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS) || str.equalsIgnoreCase("O") || str.equalsIgnoreCase("I") || str.equalsIgnoreCase("U");
    }

    int leftToRightThenRightToLeftProcessing(String str, String str2) {
        char[] charArray = str.toCharArray();
        char[] charArray2 = str2.toCharArray();
        int length = str.length() - 1;
        int length2 = str2.length() - 1;
        int i2 = 0;
        while (i2 < charArray.length && i2 <= length2) {
            int i3 = i2 + 1;
            String strSubstring = str.substring(i2, i3);
            int i4 = length - i2;
            String strSubstring2 = str.substring(i4, i4 + 1);
            String strSubstring3 = str2.substring(i2, i3);
            int i5 = length2 - i2;
            String strSubstring4 = str2.substring(i5, i5 + 1);
            if (strSubstring.equals(strSubstring3)) {
                charArray[i2] = TokenParser.SP;
                charArray2[i2] = TokenParser.SP;
            }
            if (strSubstring2.equals(strSubstring4)) {
                charArray[i4] = TokenParser.SP;
                charArray2[i5] = TokenParser.SP;
            }
            i2 = i3;
        }
        String strReplaceAll = new String(charArray).replaceAll("\\s+", "");
        String strReplaceAll2 = new String(charArray2).replaceAll("\\s+", "");
        return strReplaceAll.length() > strReplaceAll2.length() ? Math.abs(6 - strReplaceAll.length()) : Math.abs(6 - strReplaceAll2.length());
    }

    String removeAccents(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            int iIndexOf = UNICODE.indexOf(cCharAt);
            if (iIndexOf > -1) {
                sb.append(PLAIN_ASCII.charAt(iIndexOf));
            } else {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    String removeDoubleConsonants(String str) {
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        for (String str2 : DOUBLE_CONSONANT) {
            if (upperCase.contains(str2)) {
                upperCase = upperCase.replace(str2, str2.substring(0, 1));
            }
        }
        return upperCase;
    }

    String removeVowels(String str) {
        String strSubstring = str.substring(0, 1);
        String strReplaceAll = str.replace(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "").replace(ExifInterface.LONGITUDE_EAST, "").replace("I", "").replace("O", "").replace("U", "").replaceAll("\\s{2,}\\b", " ");
        return isVowel(strSubstring) ? strSubstring + strReplaceAll : strReplaceAll;
    }
}
