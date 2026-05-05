package org.springframework.util;

import com.dynatrace.android.agent.Global;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Properties;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class StringUtils {
    private static final String CURRENT_PATH = ".";
    private static final char EXTENSION_SEPARATOR = '.';
    private static final String FOLDER_SEPARATOR = "/";
    private static final String TOP_PATH = "..";
    private static final String WINDOWS_FOLDER_SEPARATOR = "\\";

    public static String[] addStringToArray(String[] strArr, String str) {
        if (ObjectUtils.isEmpty(strArr)) {
            return new String[]{str};
        }
        String[] strArr2 = new String[strArr.length + 1];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[strArr.length] = str;
        return strArr2;
    }

    public static String applyRelativePath(String str, String str2) {
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            return str2;
        }
        String strSubstring = str.substring(0, iLastIndexOf);
        if (!str2.startsWith("/")) {
            strSubstring = strSubstring + "/";
        }
        return strSubstring + str2;
    }

    public static String arrayToCommaDelimitedString(Object[] objArr) {
        return arrayToDelimitedString(objArr, ",");
    }

    public static String arrayToDelimitedString(Object[] objArr, String str) {
        if (ObjectUtils.isEmpty(objArr)) {
            return "";
        }
        if (objArr.length == 1) {
            return ObjectUtils.nullSafeToString(objArr[0]);
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < objArr.length; i2++) {
            if (i2 > 0) {
                sb.append(str);
            }
            sb.append(objArr[i2]);
        }
        return sb.toString();
    }

    public static String capitalize(String str) {
        return changeFirstCharacterCase(str, true);
    }

    private static String changeFirstCharacterCase(String str, boolean z2) {
        if (str == null || str.length() == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        if (z2) {
            sb.append(Character.toUpperCase(str.charAt(0)));
        } else {
            sb.append(Character.toLowerCase(str.charAt(0)));
        }
        sb.append(str.substring(1));
        return sb.toString();
    }

    public static String cleanPath(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = replace(str, WINDOWS_FOLDER_SEPARATOR, "/");
        int iIndexOf = strReplace.indexOf(Global.COLON);
        String str2 = "";
        if (iIndexOf != -1) {
            int i2 = iIndexOf + 1;
            String strSubstring = strReplace.substring(0, i2);
            if (!strSubstring.contains("/")) {
                strReplace = strReplace.substring(i2);
                str2 = strSubstring;
            }
        }
        if (strReplace.startsWith("/")) {
            str2 = str2 + "/";
            strReplace = strReplace.substring(1);
        }
        String[] strArrDelimitedListToStringArray = delimitedListToStringArray(strReplace, "/");
        LinkedList linkedList = new LinkedList();
        int i3 = 0;
        for (int length = strArrDelimitedListToStringArray.length - 1; length >= 0; length--) {
            String str3 = strArrDelimitedListToStringArray[length];
            if (!CURRENT_PATH.equals(str3)) {
                if (TOP_PATH.equals(str3)) {
                    i3++;
                } else if (i3 > 0) {
                    i3--;
                } else {
                    linkedList.add(0, str3);
                }
            }
        }
        for (int i4 = 0; i4 < i3; i4++) {
            linkedList.add(0, TOP_PATH);
        }
        return str2 + collectionToDelimitedString(linkedList, "/");
    }

    public static String collectionToCommaDelimitedString(Collection<?> collection) {
        return collectionToDelimitedString(collection, ",");
    }

    public static String collectionToDelimitedString(Collection<?> collection, String str) {
        return collectionToDelimitedString(collection, str, "", "");
    }

    public static String collectionToDelimitedString(Collection<?> collection, String str, String str2, String str3) {
        if (CollectionUtils.isEmpty(collection)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            sb.append(str2).append(it.next()).append(str3);
            if (it.hasNext()) {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public static Set<String> commaDelimitedListToSet(String str) {
        TreeSet treeSet = new TreeSet();
        for (String str2 : commaDelimitedListToStringArray(str)) {
            treeSet.add(str2);
        }
        return treeSet;
    }

    public static String[] commaDelimitedListToStringArray(String str) {
        return delimitedListToStringArray(str, ",");
    }

    public static String[] concatenateStringArrays(String[] strArr, String[] strArr2) {
        if (ObjectUtils.isEmpty(strArr)) {
            return strArr2;
        }
        if (ObjectUtils.isEmpty(strArr2)) {
            return strArr;
        }
        String[] strArr3 = new String[strArr.length + strArr2.length];
        System.arraycopy(strArr, 0, strArr3, 0, strArr.length);
        System.arraycopy(strArr2, 0, strArr3, strArr.length, strArr2.length);
        return strArr3;
    }

    public static boolean containsWhitespace(CharSequence charSequence) {
        if (!hasLength(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (Character.isWhitespace(charSequence.charAt(i2))) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsWhitespace(String str) {
        return containsWhitespace((CharSequence) str);
    }

    public static int countOccurrencesOf(String str, String str2) {
        int length = 0;
        if (str == null || str2 == null || str.length() == 0 || str2.length() == 0) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            int iIndexOf = str.indexOf(str2, length);
            if (iIndexOf == -1) {
                return i2;
            }
            i2++;
            length = iIndexOf + str2.length();
        }
    }

    public static String delete(String str, String str2) {
        return replace(str, str2, "");
    }

    public static String deleteAny(String str, String str2) {
        if (!hasLength(str) || !hasLength(str2)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (str2.indexOf(cCharAt) == -1) {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    public static String[] delimitedListToStringArray(String str, String str2) {
        return delimitedListToStringArray(str, str2, null);
    }

    public static String[] delimitedListToStringArray(String str, String str2, String str3) {
        int length = 0;
        if (str == null) {
            return new String[0];
        }
        if (str2 == null) {
            return new String[]{str};
        }
        ArrayList arrayList = new ArrayList();
        if ("".equals(str2)) {
            while (length < str.length()) {
                int i2 = length + 1;
                arrayList.add(deleteAny(str.substring(length, i2), str3));
                length = i2;
            }
        } else {
            while (true) {
                int iIndexOf = str.indexOf(str2, length);
                if (iIndexOf == -1) {
                    break;
                }
                arrayList.add(deleteAny(str.substring(length, iIndexOf), str3));
                length = str2.length() + iIndexOf;
            }
            if (str.length() > 0 && length <= str.length()) {
                arrayList.add(deleteAny(str.substring(length), str3));
            }
        }
        return toStringArray(arrayList);
    }

    public static boolean endsWithIgnoreCase(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        if (str.endsWith(str2)) {
            return true;
        }
        if (str.length() < str2.length()) {
            return false;
        }
        return str.substring(str.length() - str2.length()).toLowerCase().equals(str2.toLowerCase());
    }

    public static String getFilename(String str) {
        if (str == null) {
            return null;
        }
        int iLastIndexOf = str.lastIndexOf("/");
        return iLastIndexOf != -1 ? str.substring(iLastIndexOf + 1) : str;
    }

    public static String getFilenameExtension(String str) {
        int iLastIndexOf;
        if (str == null || (iLastIndexOf = str.lastIndexOf(46)) == -1 || str.lastIndexOf("/") > iLastIndexOf) {
            return null;
        }
        return str.substring(iLastIndexOf + 1);
    }

    public static boolean hasLength(CharSequence charSequence) {
        return charSequence != null && charSequence.length() > 0;
    }

    public static boolean hasLength(String str) {
        return hasLength((CharSequence) str);
    }

    public static boolean hasText(CharSequence charSequence) {
        if (!hasLength(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (!Character.isWhitespace(charSequence.charAt(i2))) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasText(String str) {
        return hasText((CharSequence) str);
    }

    public static boolean isEmpty(Object obj) {
        return obj == null || "".equals(obj);
    }

    public static String[] mergeStringArrays(String[] strArr, String[] strArr2) {
        if (ObjectUtils.isEmpty(strArr)) {
            return strArr2;
        }
        if (ObjectUtils.isEmpty(strArr2)) {
            return strArr;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(strArr));
        for (String str : strArr2) {
            if (!arrayList.contains(str)) {
                arrayList.add(str);
            }
        }
        return toStringArray(arrayList);
    }

    public static Locale parseLocaleString(String str) {
        String[] strArr = tokenizeToStringArray(str, "_ ", false, false);
        String strTrimLeadingWhitespace = "";
        String str2 = strArr.length > 0 ? strArr[0] : "";
        String str3 = strArr.length > 1 ? strArr[1] : "";
        validateLocalePart(str2);
        validateLocalePart(str3);
        if (strArr.length > 2) {
            strTrimLeadingWhitespace = trimLeadingWhitespace(str.substring(str.indexOf(str3, str2.length()) + str3.length()));
            if (strTrimLeadingWhitespace.startsWith(Global.UNDERSCORE)) {
                strTrimLeadingWhitespace = trimLeadingCharacter(strTrimLeadingWhitespace, '_');
            }
        }
        if (str2.length() > 0) {
            return new Locale(str2, str3, strTrimLeadingWhitespace);
        }
        return null;
    }

    public static boolean pathEquals(String str, String str2) {
        return cleanPath(str).equals(cleanPath(str2));
    }

    public static String quote(String str) {
        if (str != null) {
            return "'" + str + "'";
        }
        return null;
    }

    public static Object quoteIfString(Object obj) {
        return obj instanceof String ? quote((String) obj) : obj;
    }

    public static String[] removeDuplicateStrings(String[] strArr) {
        if (ObjectUtils.isEmpty(strArr)) {
            return strArr;
        }
        TreeSet treeSet = new TreeSet();
        for (String str : strArr) {
            treeSet.add(str);
        }
        return toStringArray(treeSet);
    }

    public static String replace(String str, String str2, String str3) {
        if (!hasLength(str) || !hasLength(str2) || str3 == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        int iIndexOf = str.indexOf(str2);
        int length = str2.length();
        int i2 = 0;
        while (iIndexOf >= 0) {
            sb.append(str.substring(i2, iIndexOf));
            sb.append(str3);
            i2 = iIndexOf + length;
            iIndexOf = str.indexOf(str2, i2);
        }
        sb.append(str.substring(i2));
        return sb.toString();
    }

    public static String[] sortStringArray(String[] strArr) {
        if (ObjectUtils.isEmpty(strArr)) {
            return new String[0];
        }
        Arrays.sort(strArr);
        return strArr;
    }

    public static String[] split(String str, String str2) {
        int iIndexOf;
        if (hasLength(str) && hasLength(str2) && (iIndexOf = str.indexOf(str2)) >= 0) {
            return new String[]{str.substring(0, iIndexOf), str.substring(iIndexOf + str2.length())};
        }
        return null;
    }

    public static Properties splitArrayElementsIntoProperties(String[] strArr, String str) {
        return splitArrayElementsIntoProperties(strArr, str, null);
    }

    public static Properties splitArrayElementsIntoProperties(String[] strArr, String str, String str2) {
        if (ObjectUtils.isEmpty(strArr)) {
            return null;
        }
        Properties properties = new Properties();
        for (String strDeleteAny : strArr) {
            if (str2 != null) {
                strDeleteAny = deleteAny(strDeleteAny, str2);
            }
            String[] strArrSplit = split(strDeleteAny, str);
            if (strArrSplit != null) {
                properties.setProperty(strArrSplit[0].trim(), strArrSplit[1].trim());
            }
        }
        return properties;
    }

    public static boolean startsWithIgnoreCase(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        if (str.startsWith(str2)) {
            return true;
        }
        if (str.length() < str2.length()) {
            return false;
        }
        return str.substring(0, str2.length()).toLowerCase().equals(str2.toLowerCase());
    }

    public static String stripFilenameExtension(String str) {
        if (str == null) {
            return null;
        }
        int iLastIndexOf = str.lastIndexOf(46);
        return (iLastIndexOf != -1 && str.lastIndexOf("/") <= iLastIndexOf) ? str.substring(0, iLastIndexOf) : str;
    }

    public static boolean substringMatch(CharSequence charSequence, int i2, CharSequence charSequence2) {
        for (int i3 = 0; i3 < charSequence2.length(); i3++) {
            int i4 = i2 + i3;
            if (i4 >= charSequence.length() || charSequence.charAt(i4) != charSequence2.charAt(i3)) {
                return false;
            }
        }
        return true;
    }

    public static String toLanguageTag(Locale locale) {
        return locale.getLanguage() + (hasText(locale.getCountry()) ? Global.HYPHEN + locale.getCountry() : "");
    }

    public static String[] toStringArray(Collection<String> collection) {
        if (collection == null) {
            return null;
        }
        return (String[]) collection.toArray(new String[collection.size()]);
    }

    public static String[] toStringArray(Enumeration<String> enumeration) {
        if (enumeration == null) {
            return null;
        }
        ArrayList list = Collections.list(enumeration);
        return (String[]) list.toArray(new String[list.size()]);
    }

    public static String[] tokenizeToStringArray(String str, String str2) {
        return tokenizeToStringArray(str, str2, true, true);
    }

    public static String[] tokenizeToStringArray(String str, String str2, boolean z2, boolean z3) {
        if (str == null) {
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, str2);
        ArrayList arrayList = new ArrayList();
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            if (z2) {
                strNextToken = strNextToken.trim();
            }
            if (!z3 || strNextToken.length() > 0) {
                arrayList.add(strNextToken);
            }
        }
        return toStringArray(arrayList);
    }

    public static String trimAllWhitespace(String str) {
        if (!hasLength(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        int i2 = 0;
        while (sb.length() > i2) {
            if (Character.isWhitespace(sb.charAt(i2))) {
                sb.deleteCharAt(i2);
            } else {
                i2++;
            }
        }
        return sb.toString();
    }

    public static String[] trimArrayElements(String[] strArr) {
        if (ObjectUtils.isEmpty(strArr)) {
            return new String[0];
        }
        String[] strArr2 = new String[strArr.length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String str = strArr[i2];
            strArr2[i2] = str != null ? str.trim() : null;
        }
        return strArr2;
    }

    public static String trimLeadingCharacter(String str, char c2) {
        if (!hasLength(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        while (sb.length() > 0 && sb.charAt(0) == c2) {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }

    public static String trimLeadingWhitespace(String str) {
        if (!hasLength(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        while (sb.length() > 0 && Character.isWhitespace(sb.charAt(0))) {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }

    public static String trimTrailingCharacter(String str, char c2) {
        if (!hasLength(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        while (sb.length() > 0 && sb.charAt(sb.length() - 1) == c2) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public static String trimTrailingWhitespace(String str) {
        if (!hasLength(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        while (sb.length() > 0 && Character.isWhitespace(sb.charAt(sb.length() - 1))) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public static String trimWhitespace(String str) {
        if (!hasLength(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        while (sb.length() > 0 && Character.isWhitespace(sb.charAt(0))) {
            sb.deleteCharAt(0);
        }
        while (sb.length() > 0 && Character.isWhitespace(sb.charAt(sb.length() - 1))) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public static String uncapitalize(String str) {
        return changeFirstCharacterCase(str, false);
    }

    public static String unqualify(String str) {
        return unqualify(str, EXTENSION_SEPARATOR);
    }

    public static String unqualify(String str, char c2) {
        return str.substring(str.lastIndexOf(c2) + 1);
    }

    private static void validateLocalePart(String str) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != '_' && cCharAt != ' ' && !Character.isLetterOrDigit(cCharAt)) {
                throw new IllegalArgumentException("Locale part \"" + str + "\" contains invalid characters");
            }
        }
    }
}
