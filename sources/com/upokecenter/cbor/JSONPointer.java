package com.upokecenter.cbor;

import com.dynatrace.android.agent.Global;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.upokecenter.numbers.EInteger;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class JSONPointer {
    private final boolean isRoot;
    private final CBORObject jsonobj;
    private final String refValue;

    private JSONPointer(CBORObject cBORObject, String str) {
        this(cBORObject, str, false);
    }

    private JSONPointer(CBORObject cBORObject, String str, boolean z2) {
        this.isRoot = z2;
        this.jsonobj = cBORObject;
        this.refValue = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:209:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x00cc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.upokecenter.cbor.JSONPointer FromPointer(com.upokecenter.cbor.CBORObject r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.cbor.JSONPointer.FromPointer(com.upokecenter.cbor.CBORObject, java.lang.String):com.upokecenter.cbor.JSONPointer");
    }

    public static CBORObject GetObject(CBORObject cBORObject, String str, CBORObject cBORObject2) {
        if (cBORObject == null) {
            throw new CBORException("obj");
        }
        if (str == null) {
            return cBORObject2;
        }
        if (str.length() == 0) {
            return cBORObject;
        }
        if (cBORObject.getType() != CBORType.Array && cBORObject.getType() != CBORType.Map) {
            return cBORObject2;
        }
        try {
            CBORObject cBORObjectGetValue = FromPointer(cBORObject, str).GetValue();
            return cBORObjectGetValue == null ? cBORObject2 : cBORObjectGetValue;
        } catch (CBORException unused) {
            return cBORObject2;
        }
    }

    public static Map<String, CBORObject> GetPointersWithKey(CBORObject cBORObject, String str) {
        HashMap map = new HashMap();
        if (cBORObject == null) {
            throw new NullPointerException("root");
        }
        GetPointersWithKey(cBORObject, str, "", map, false);
        return map;
    }

    private static void GetPointersWithKey(CBORObject cBORObject, String str, String str2, Map<String, CBORObject> map, boolean z2) {
        if (cBORObject.getType() != CBORType.Map) {
            if (cBORObject.getType() == CBORType.Array) {
                for (int i2 = 0; i2 < cBORObject.size(); i2++) {
                    GetPointersWithKey(cBORObject.get(i2), str, str2 + RemoteSettings.FORWARD_SLASH_STRING + EInteger.FromInt32(i2).toString(), map, z2);
                }
                return;
            }
            return;
        }
        if (cBORObject.ContainsKey(str)) {
            map.put(str2, cBORObject.get(str));
            if (z2) {
                cBORObject.Remove(CBORObject.FromObject(str));
            }
        }
        for (CBORObject cBORObject2 : cBORObject.getKeys()) {
            GetPointersWithKey(cBORObject.get(cBORObject2), str, str2 + RemoteSettings.FORWARD_SLASH_STRING + Replace(Replace(cBORObject2.AsString(), '~', "~0"), '/', "~1"), map, z2);
        }
    }

    public static Map<String, CBORObject> GetPointersWithKeyAndRemove(CBORObject cBORObject, String str) {
        HashMap map = new HashMap();
        if (cBORObject == null) {
            throw new NullPointerException("root");
        }
        GetPointersWithKey(cBORObject, str, "", map, true);
        return map;
    }

    private static int ReadPositiveInteger(String str, int i2, int[] iArr) {
        iArr[0] = -1;
        if (i2 == str.length()) {
            return i2;
        }
        if (str.length() - 1 == i2 && str.charAt(i2) == '0') {
            iArr[0] = 0;
            return i2 + 1;
        }
        if (str.length() - 1 > i2 && str.charAt(i2) == '0') {
            int i3 = i2 + 1;
            if (str.charAt(i3) != '0') {
                iArr[0] = 0;
                return i3;
            }
        }
        if (str.charAt(i2) == '0') {
            return i2;
        }
        long j2 = 0;
        boolean z2 = false;
        while (i2 < str.length()) {
            int i4 = i2 + 1;
            char cCharAt = str.charAt(i2);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            j2 = (j2 * 10) + ((long) (cCharAt - '0'));
            if (j2 > 2147483647L) {
                return i2;
            }
            z2 = true;
            i2 = i4;
        }
        if (!z2) {
            return i2;
        }
        iArr[0] = (int) j2;
        return i2;
    }

    private static String Replace(String str, char c2, String str2) {
        int i2 = 0;
        while (true) {
            if (i2 >= str.length()) {
                i2 = -1;
                break;
            }
            if (str.charAt(i2) == c2) {
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, i2));
        sb.append(str2);
        while (true) {
            i2++;
            if (i2 >= str.length()) {
                return sb.toString();
            }
            if (str.charAt(i2) == c2) {
                sb.append(str2);
            } else {
                sb.append(str.charAt(i2));
            }
        }
    }

    public boolean Exists() {
        if (this.refValue.length() == 0) {
            return true;
        }
        if (this.jsonobj.getType() != CBORType.Array) {
            return this.jsonobj.getType() == CBORType.Map ? this.jsonobj.ContainsKey(this.refValue) : this.refValue.length() == 0;
        }
        if (this.refValue.equals(Global.HYPHEN)) {
            return false;
        }
        EInteger eIntegerFromString = EInteger.FromString(this.refValue);
        return eIntegerFromString.signum() >= 0 && eIntegerFromString.compareTo(EInteger.FromInt32(this.jsonobj.size())) < 0;
    }

    public int GetIndex() {
        if (this.jsonobj.getType() != CBORType.Array) {
            return -1;
        }
        if (this.refValue.equals(Global.HYPHEN)) {
            return this.jsonobj.size();
        }
        EInteger eIntegerFromString = EInteger.FromString(this.refValue);
        int size = this.jsonobj.size();
        if (eIntegerFromString.signum() >= 0 && eIntegerFromString.compareTo(EInteger.FromInt32(size)) <= 0) {
            return eIntegerFromString.ToInt32Unchecked();
        }
        return -1;
    }

    public String GetKey() {
        return this.refValue;
    }

    public CBORObject GetParent() {
        return this.jsonobj;
    }

    public CBORObject GetValue() {
        if (this.isRoot) {
            return this.jsonobj;
        }
        if (this.jsonobj.getType() == CBORType.Array) {
            int iGetIndex = GetIndex();
            if (iGetIndex < 0 || iGetIndex >= this.jsonobj.size()) {
                return null;
            }
            return this.jsonobj.get(iGetIndex);
        }
        if (this.jsonobj.getType() == CBORType.Map) {
            return this.jsonobj.GetOrDefault(this.refValue, null);
        }
        if (this.refValue.length() == 0) {
            return this.jsonobj;
        }
        return null;
    }
}
