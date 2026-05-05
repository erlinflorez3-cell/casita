package io.cobrowse;

import io.cobrowse.Selector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
class SelectorParser {
    private static final String ASSIGNMENT;
    private static final String ATTR;
    private static final String ATTRS;
    private static final String ATTR_KEY = "(?:[a-z][a-z0-9_-]*|\"[a-z][a-z0-9_ -]*\")";
    private static final Pattern AssignmentMatcher;
    private static final String EL;
    private static final String ID = "(?:#[a-z0-9_-]+)";
    private static final Pattern PartMatcher;
    private static final String SELECTOR_PART;
    private static final String TAG = "(?:[_a-z][_a-z0-9]*)";
    private static final String TAG_ID;
    private static final String VALUE = "(?:[a-z0-9_-]+|\"[a-z0-9_ -]+\")";

    static {
        String str = String.format("(?:%s%s)", TAG, ID);
        TAG_ID = str;
        String str2 = String.format("(?:%s|%s|%s)", str, ID, TAG);
        EL = str2;
        String str3 = String.format("(?:%s=%s)", ATTR_KEY, VALUE);
        ASSIGNMENT = str3;
        String str4 = String.format("(?:\\[%s\\])", str3);
        ATTR = str4;
        String str5 = String.format("(?:%s*)", str4);
        ATTRS = str5;
        String str6 = String.format("(%s)?(%s)", str2, str5);
        SELECTOR_PART = str6;
        PartMatcher = Pattern.compile(str6, 2);
        AssignmentMatcher = Pattern.compile(str3, 2);
    }

    SelectorParser() {
    }

    public static Selector parse(String str) {
        Matcher matcher = PartMatcher.matcher(str);
        if (!matcher.replaceAll("").trim().isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        matcher.reset();
        while (matcher.find()) {
            String strGroup = matcher.group();
            if (!strGroup.trim().isEmpty()) {
                Selector.Part part = parsePart(strGroup.trim());
                if (part == null) {
                    return null;
                }
                arrayList.add(part);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Selector(arrayList);
    }

    public static List<Selector> parseAll(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(parse(str));
        }
        return arrayList;
    }

    private static Selector.Part parsePart(String str) {
        Matcher matcher = PartMatcher.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        String strGroup2 = matcher.group(2);
        if (strGroup == null) {
            strGroup = "";
        }
        String[] strArrSplit = strGroup.split("#");
        String str2 = (strArrSplit.length <= 0 || strArrSplit[0].isEmpty()) ? null : strArrSplit[0];
        String str3 = (strArrSplit.length <= 1 || strArrSplit[1].isEmpty()) ? null : strArrSplit[1];
        ArrayList arrayList = new ArrayList();
        if (strGroup2 != null) {
            Matcher matcher2 = AssignmentMatcher.matcher(strGroup2);
            while (matcher2.find()) {
                arrayList.add(matcher2.group());
            }
        }
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String[] strArrSplit2 = ((String) it.next()).split("=", 2);
            map.put(strArrSplit2[0].replaceAll("^\"(.*)\"$", "$1"), strArrSplit2[1].replaceAll("^\"(.*)\"$", "$1"));
        }
        return new Selector.Part(str2, str3, map.isEmpty() ? null : map);
    }
}
