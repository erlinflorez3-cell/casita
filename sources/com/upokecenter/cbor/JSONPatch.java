package com.upokecenter.cbor;

import com.dynatrace.android.agent.Global;
import com.google.android.gms.analytics.ecommerce.ProductAction;

/* JADX INFO: loaded from: classes5.dex */
final class JSONPatch {

    /* JADX INFO: renamed from: com.upokecenter.cbor.JSONPatch$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$upokecenter$cbor$CBORType;

        static {
            int[] iArr = new int[CBORType.values().length];
            $SwitchMap$com$upokecenter$cbor$CBORType = iArr;
            try {
                iArr[CBORType.ByteString.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$upokecenter$cbor$CBORType[CBORType.Map.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$upokecenter$cbor$CBORType[CBORType.Array.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private JSONPatch() {
    }

    private static CBORObject AddOperation(CBORObject cBORObject, String str, String str2, CBORObject cBORObject2) {
        if (str2 == null) {
            throw new CBORException("Patch " + str);
        }
        if (str2.length() == 0) {
            return cBORObject2;
        }
        JSONPointer jSONPointerFromPointer = JSONPointer.FromPointer(cBORObject, str2);
        CBORObject cBORObjectGetParent = jSONPointerFromPointer.GetParent();
        if (jSONPointerFromPointer.GetParent().getType() != CBORType.Array) {
            if (jSONPointerFromPointer.GetParent().getType() != CBORType.Map) {
                throw new CBORException("Patch " + str + " path");
            }
            cBORObjectGetParent.Set(jSONPointerFromPointer.GetKey(), cBORObject2);
            return cBORObject;
        }
        int iGetIndex = jSONPointerFromPointer.GetIndex();
        if (iGetIndex < 0) {
            throw new CBORException("Patch " + str + " path");
        }
        cBORObjectGetParent.Insert(iGetIndex, cBORObject2);
        return cBORObject;
    }

    private static CBORObject CloneCbor(CBORObject cBORObject) {
        int i2 = AnonymousClass1.$SwitchMap$com$upokecenter$cbor$CBORType[cBORObject.getType().ordinal()];
        return (i2 == 1 || i2 == 2 || i2 == 3) ? CBORObject.DecodeFromBytes(cBORObject.EncodeToBytes()) : cBORObject;
    }

    private static String GetString(CBORObject cBORObject, String str) {
        CBORObject cBORObjectGetOrDefault = cBORObject.GetOrDefault(str, null);
        if (cBORObjectGetOrDefault == null) {
            throw new CBORException(str + " not found");
        }
        if (cBORObjectGetOrDefault.getType() == CBORType.TextString) {
            return cBORObjectGetOrDefault.AsString();
        }
        throw new CBORException("Not a text String type");
    }

    public static CBORObject Patch(CBORObject cBORObject, CBORObject cBORObject2) {
        if (cBORObject == null) {
            throw new CBORException("Object is null");
        }
        if (cBORObject2 == null) {
            throw new CBORException("patch is null");
        }
        if (cBORObject2.getType() != CBORType.Array) {
            throw new CBORException("patch is not an array");
        }
        CBORObject cBORObjectCloneCbor = CloneCbor(cBORObject);
        for (int i2 = 0; i2 < cBORObject2.size(); i2++) {
            CBORObject cBORObject3 = cBORObject2.get(i2);
            String strGetString = GetString(cBORObject3, "op");
            if (ProductAction.ACTION_ADD.equals(strGetString)) {
                if (cBORObject3.GetOrDefault("value", null) == null) {
                    throw new CBORException("Patch " + strGetString + " value");
                }
                cBORObjectCloneCbor = AddOperation(cBORObjectCloneCbor, strGetString, GetString(cBORObject3, "path"), cBORObject3.get("value"));
            } else if ("replace".equals(strGetString)) {
                CBORObject cBORObjectGetOrDefault = cBORObject3.GetOrDefault("value", null);
                if (cBORObjectGetOrDefault == null) {
                    throw new CBORException("Patch " + strGetString + " value");
                }
                cBORObjectCloneCbor = ReplaceOperation(cBORObjectCloneCbor, strGetString, GetString(cBORObject3, "path"), CloneCbor(cBORObjectGetOrDefault));
            } else if (ProductAction.ACTION_REMOVE.equals(strGetString)) {
                String strGetString2 = GetString(cBORObject3, "path");
                if (strGetString2 == null) {
                    throw new CBORException("Patch " + strGetString + " path");
                }
                if (strGetString2.length() == 0) {
                    cBORObjectCloneCbor = null;
                } else {
                    RemoveOperation(cBORObjectCloneCbor, strGetString, GetString(cBORObject3, "path"));
                }
            } else if ("move".equals(strGetString)) {
                String strGetString3 = GetString(cBORObject3, "path");
                if (strGetString3 == null) {
                    throw new CBORException("Patch " + strGetString + " path");
                }
                String strGetString4 = GetString(cBORObject3, "from");
                if (strGetString4 == null) {
                    throw new CBORException("Patch " + strGetString + " from");
                }
                if (strGetString3.equals(strGetString4) && JSONPointer.FromPointer(cBORObjectCloneCbor, strGetString3).Exists()) {
                    return cBORObjectCloneCbor;
                }
                cBORObjectCloneCbor = AddOperation(cBORObjectCloneCbor, strGetString, strGetString3, CloneCbor(RemoveOperation(cBORObjectCloneCbor, strGetString, strGetString4)));
            } else if ("copy".equals(strGetString)) {
                String strGetString5 = GetString(cBORObject3, "path");
                String strGetString6 = GetString(cBORObject3, "from");
                if (strGetString5 == null) {
                    throw new CBORException("Patch " + strGetString + " path");
                }
                if (strGetString6 == null) {
                    throw new CBORException("Patch " + strGetString + " from");
                }
                JSONPointer jSONPointerFromPointer = JSONPointer.FromPointer(cBORObjectCloneCbor, strGetString6);
                if (!jSONPointerFromPointer.Exists()) {
                    throw new CBORException("Patch " + strGetString + Global.BLANK + strGetString6);
                }
                cBORObjectCloneCbor = AddOperation(cBORObjectCloneCbor, strGetString, strGetString5, CloneCbor(jSONPointerFromPointer.GetValue()));
            } else {
                if (!"test".equals(strGetString)) {
                    throw new CBORException("Unrecognized op");
                }
                String strGetString7 = GetString(cBORObject3, "path");
                if (strGetString7 == null) {
                    throw new CBORException("Patch " + strGetString + " path");
                }
                if (!cBORObject3.ContainsKey("value")) {
                    throw new CBORException("Patch " + strGetString + " value");
                }
                CBORObject cBORObject4 = cBORObject3.get("value");
                JSONPointer jSONPointerFromPointer2 = JSONPointer.FromPointer(cBORObjectCloneCbor, strGetString7);
                if (!jSONPointerFromPointer2.Exists()) {
                    throw new CBORException("Patch " + strGetString + Global.BLANK + strGetString7);
                }
                CBORObject cBORObjectGetValue = jSONPointerFromPointer2.GetValue();
                if (cBORObjectGetValue == null) {
                    if (cBORObject4 != null) {
                        throw new CBORException("Patch " + strGetString);
                    }
                } else if (!cBORObjectGetValue.equals((Object) cBORObject4)) {
                    throw new CBORException("Patch " + strGetString);
                }
            }
        }
        return cBORObjectCloneCbor == null ? CBORObject.Null : cBORObjectCloneCbor;
    }

    private static CBORObject RemoveOperation(CBORObject cBORObject, String str, String str2) {
        if (str2 == null) {
            throw new CBORException("Patch " + str);
        }
        if (str2.length() == 0) {
            return cBORObject;
        }
        JSONPointer jSONPointerFromPointer = JSONPointer.FromPointer(cBORObject, str2);
        if (!jSONPointerFromPointer.Exists()) {
            throw new CBORException("Patch " + str + Global.BLANK + str2);
        }
        CBORObject cBORObjectGetValue = jSONPointerFromPointer.GetValue();
        if (jSONPointerFromPointer.GetParent().getType() == CBORType.Array) {
            jSONPointerFromPointer.GetParent().RemoveAt(jSONPointerFromPointer.GetIndex());
        } else if (jSONPointerFromPointer.GetParent().getType() == CBORType.Map) {
            jSONPointerFromPointer.GetParent().Remove(CBORObject.FromObject(jSONPointerFromPointer.GetKey()));
        }
        return cBORObjectGetValue;
    }

    private static CBORObject ReplaceOperation(CBORObject cBORObject, String str, String str2, CBORObject cBORObject2) {
        if (str2 == null) {
            throw new CBORException("Patch " + str);
        }
        if (str2.length() == 0) {
            return cBORObject2;
        }
        JSONPointer jSONPointerFromPointer = JSONPointer.FromPointer(cBORObject, str2);
        if (!jSONPointerFromPointer.Exists()) {
            throw new CBORException("Patch " + str + Global.BLANK + str2);
        }
        if (jSONPointerFromPointer.GetParent().getType() == CBORType.Array) {
            int iGetIndex = jSONPointerFromPointer.GetIndex();
            if (iGetIndex < 0) {
                throw new CBORException("Patch " + str + " path");
            }
            jSONPointerFromPointer.GetParent().Set(Integer.valueOf(iGetIndex), cBORObject2);
            return cBORObject;
        }
        if (jSONPointerFromPointer.GetParent().getType() != CBORType.Map) {
            throw new CBORException("Patch " + str + " path");
        }
        jSONPointerFromPointer.GetParent().Set(jSONPointerFromPointer.GetKey(), cBORObject2);
        return cBORObject;
    }
}
