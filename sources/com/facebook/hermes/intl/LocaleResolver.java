package com.facebook.hermes.intl;

import com.facebook.hermes.intl.LocaleMatcher;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class LocaleResolver {
    public static HashMap<String, Object> resolveLocale(List<String> list, Object obj, List<String> list2) throws JSRangeErrorException {
        HashMap<String, Object> map = new HashMap<>();
        LocaleMatcher.LocaleMatchResult localeMatchResultLookupMatch = JSObjects.getJavaString(JSObjects.Get(obj, Constants.LOCALEMATCHER)).equals(Constants.LOCALEMATCHER_LOOKUP) ? LocaleMatcher.lookupMatch((String[]) list.toArray(new String[list.size()])) : LocaleMatcher.bestFitMatch((String[]) list.toArray(new String[list.size()]));
        HashSet<String> hashSet = new HashSet();
        for (String str : list2) {
            Object objNull = JSObjects.Null();
            Object obj2 = objNull;
            if (!localeMatchResultLookupMatch.extensions.isEmpty()) {
                obj2 = objNull;
                if (localeMatchResultLookupMatch.extensions.containsKey(str)) {
                    String str2 = localeMatchResultLookupMatch.extensions.get(str);
                    boolean zIsEmpty = str2.isEmpty();
                    Object objNewString = str2;
                    if (zIsEmpty) {
                        objNewString = JSObjects.newString("true");
                    }
                    hashSet.add(str);
                    obj2 = objNewString;
                }
            }
            Object obj3 = obj2;
            if (JSObjects.getJavaMap(obj).containsKey(str)) {
                Object objGet = JSObjects.Get(obj, str);
                boolean zIsString = JSObjects.isString(objGet);
                Object objNewBoolean = objGet;
                if (zIsString) {
                    boolean zIsEmpty2 = JSObjects.getJavaString(objGet).isEmpty();
                    objNewBoolean = objGet;
                    if (zIsEmpty2) {
                        objNewBoolean = JSObjects.newBoolean(true);
                    }
                }
                obj3 = obj2;
                if (!JSObjects.isUndefined(objNewBoolean)) {
                    boolean zEquals = objNewBoolean.equals(obj2);
                    obj3 = obj2;
                    if (!zEquals) {
                        hashSet.remove(str);
                        obj3 = objNewBoolean;
                    }
                }
            }
            boolean zIsNull = JSObjects.isNull(obj3);
            Object objResolveKnownAliases = obj3;
            if (!zIsNull) {
                objResolveKnownAliases = UnicodeExtensionKeys.resolveKnownAliases(str, obj3);
            }
            if (!JSObjects.isString(objResolveKnownAliases) || UnicodeExtensionKeys.isValidKeyword(str, JSObjects.getJavaString(objResolveKnownAliases), localeMatchResultLookupMatch.matchedLocale)) {
                map.put(str, objResolveKnownAliases);
            } else {
                map.put(str, JSObjects.Null());
            }
        }
        for (String str3 : hashSet) {
            ArrayList<String> arrayList = new ArrayList<>();
            String javaString = JSObjects.getJavaString(UnicodeExtensionKeys.resolveKnownAliases(str3, JSObjects.newString(localeMatchResultLookupMatch.extensions.get(str3))));
            if (!JSObjects.isString(javaString) || UnicodeExtensionKeys.isValidKeyword(str3, JSObjects.getJavaString(javaString), localeMatchResultLookupMatch.matchedLocale)) {
                arrayList.add(javaString);
                localeMatchResultLookupMatch.matchedLocale.setUnicodeExtensions(str3, arrayList);
            }
        }
        map.put("locale", localeMatchResultLookupMatch.matchedLocale);
        return map;
    }
}
