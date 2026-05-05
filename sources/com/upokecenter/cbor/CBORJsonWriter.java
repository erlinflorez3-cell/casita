package com.upokecenter.cbor;

import com.facebook.hermes.intl.Constants;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class CBORJsonWriter {
    private static final String Hex16 = "0123456789ABCDEF";

    /* JADX INFO: renamed from: com.upokecenter.cbor.CBORJsonWriter$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$upokecenter$cbor$CBORType;

        static {
            int[] iArr = new int[CBORType.values().length];
            $SwitchMap$com$upokecenter$cbor$CBORType = iArr;
            try {
                iArr[CBORType.TextString.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$upokecenter$cbor$CBORType[CBORType.Array.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$upokecenter$cbor$CBORType[CBORType.Map.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$upokecenter$cbor$CBORType[CBORType.Integer.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$upokecenter$cbor$CBORType[CBORType.FloatingPoint.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$upokecenter$cbor$CBORType[CBORType.Boolean.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$upokecenter$cbor$CBORType[CBORType.SimpleValue.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$upokecenter$cbor$CBORType[CBORType.ByteString.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private CBORJsonWriter() {
    }

    private static boolean CheckCircularRef(List<CBORObject> list, CBORObject cBORObject, CBORObject cBORObject2) {
        if (cBORObject2.getType() != CBORType.Array && cBORObject2.getType() != CBORType.Map) {
            return false;
        }
        CBORObject cBORObjectUntag = cBORObject2.Untag();
        if (cBORObject.Untag() == cBORObjectUntag) {
            throw new CBORException("Circular reference in CBOR Object");
        }
        if (list != null) {
            Iterator<CBORObject> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().Untag() == cBORObjectUntag) {
                    throw new CBORException("Circular reference in CBOR Object");
                }
            }
        }
        list.add(cBORObject2);
        return true;
    }

    private static void PopRefIfNeeded(List<CBORObject> list, boolean z2) {
        if (!z2 || list == null) {
            return;
        }
        list.remove(list.size() - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:170:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void WriteJSONStringUnquoted(java.lang.String r12, com.upokecenter.cbor.StringOutput r13, com.upokecenter.cbor.JSONOptions r14) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 547
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.cbor.CBORJsonWriter.WriteJSONStringUnquoted(java.lang.String, com.upokecenter.cbor.StringOutput, com.upokecenter.cbor.JSONOptions):void");
    }

    static void WriteJSONToInternal(CBORObject cBORObject, StringOutput stringOutput, JSONOptions jSONOptions) throws IOException {
        if (cBORObject.getType() == CBORType.Array || cBORObject.getType() == CBORType.Map) {
            WriteJSONToInternal(cBORObject, stringOutput, jSONOptions, new ArrayList());
        } else {
            WriteJSONToInternal(cBORObject, stringOutput, jSONOptions, null);
        }
    }

    static void WriteJSONToInternal(CBORObject cBORObject, StringOutput stringOutput, JSONOptions jSONOptions, List<CBORObject> list) throws IOException {
        String strAsString;
        if (cBORObject.isNumber()) {
            stringOutput.WriteString(CBORNumber.FromCBORObject(cBORObject).ToJSONString());
            return;
        }
        int i2 = 1;
        switch (AnonymousClass1.$SwitchMap$com$upokecenter$cbor$CBORType[cBORObject.getType().ordinal()]) {
            case 1:
                String strAsString2 = cBORObject.AsString();
                if (strAsString2.length() == 0) {
                    stringOutput.WriteString("\"\"");
                    return;
                }
                stringOutput.WriteCodePoint(34);
                WriteJSONStringUnquoted(strAsString2, stringOutput, jSONOptions);
                stringOutput.WriteCodePoint(34);
                return;
            case 2:
                stringOutput.WriteCodePoint(91);
                for (int i3 = 0; i3 < cBORObject.size(); i3++) {
                    if (i3 > 0) {
                        stringOutput.WriteCodePoint(44);
                    }
                    boolean zCheckCircularRef = CheckCircularRef(list, cBORObject, cBORObject.get(i3));
                    WriteJSONToInternal(cBORObject.get(i3), stringOutput, jSONOptions, list);
                    PopRefIfNeeded(list, zCheckCircularRef);
                }
                stringOutput.WriteCodePoint(93);
                return;
            case 3:
                Collection<Map.Entry<CBORObject, CBORObject>> entries = cBORObject.getEntries();
                Iterator<Map.Entry<CBORObject, CBORObject>> it = entries.iterator();
                while (it.hasNext()) {
                    CBORObject key = it.next().getKey();
                    if (key.getType() != CBORType.TextString || key.isTagged()) {
                        HashMap map = new HashMap();
                        for (Map.Entry<CBORObject, CBORObject> entry : entries) {
                            CBORObject key2 = entry.getKey();
                            CBORObject value = entry.getValue();
                            int i4 = AnonymousClass1.$SwitchMap$com$upokecenter$cbor$CBORType[key2.getType().ordinal()];
                            if (i4 == i2) {
                                strAsString = key2.AsString();
                            } else if (i4 == 2 || i4 == 3) {
                                StringBuilder sb = new StringBuilder();
                                StringOutput stringOutput2 = new StringOutput(sb);
                                boolean zCheckCircularRef2 = CheckCircularRef(list, cBORObject, key2);
                                WriteJSONToInternal(key2, stringOutput2, jSONOptions, list);
                                PopRefIfNeeded(list, zCheckCircularRef2);
                                strAsString = sb.toString();
                            } else {
                                strAsString = key2.ToJSONString(jSONOptions);
                            }
                            if (map.containsKey(strAsString)) {
                                throw new CBORException("Duplicate JSON String equivalents of map keys");
                            }
                            map.put(strAsString, value);
                            i2 = 1;
                        }
                        stringOutput.WriteCodePoint(123);
                        boolean z2 = true;
                        for (Map.Entry entry2 : map.entrySet()) {
                            String str = (String) entry2.getKey();
                            CBORObject cBORObject2 = (CBORObject) entry2.getValue();
                            if (!z2) {
                                stringOutput.WriteCodePoint(44);
                            }
                            stringOutput.WriteCodePoint(34);
                            WriteJSONStringUnquoted(str, stringOutput, jSONOptions);
                            stringOutput.WriteCodePoint(34);
                            stringOutput.WriteCodePoint(58);
                            boolean zCheckCircularRef3 = CheckCircularRef(list, cBORObject, cBORObject2);
                            WriteJSONToInternal(cBORObject2, stringOutput, jSONOptions, list);
                            PopRefIfNeeded(list, zCheckCircularRef3);
                            z2 = false;
                        }
                        stringOutput.WriteCodePoint(125);
                        return;
                    }
                }
                stringOutput.WriteCodePoint(123);
                boolean z3 = true;
                for (Map.Entry<CBORObject, CBORObject> entry3 : entries) {
                    CBORObject key3 = entry3.getKey();
                    CBORObject value2 = entry3.getValue();
                    if (!z3) {
                        stringOutput.WriteCodePoint(44);
                    }
                    stringOutput.WriteCodePoint(34);
                    WriteJSONStringUnquoted(key3.AsString(), stringOutput, jSONOptions);
                    stringOutput.WriteCodePoint(34);
                    stringOutput.WriteCodePoint(58);
                    boolean zCheckCircularRef4 = CheckCircularRef(list, cBORObject, value2);
                    WriteJSONToInternal(value2, stringOutput, jSONOptions, list);
                    PopRefIfNeeded(list, zCheckCircularRef4);
                    z3 = false;
                }
                stringOutput.WriteCodePoint(125);
                return;
            case 4:
            case 5:
                stringOutput.WriteString(CBORNumber.FromCBORObject(cBORObject.Untag()).ToJSONString());
                return;
            case 6:
                if (cBORObject.isTrue()) {
                    stringOutput.WriteString("true");
                    return;
                } else {
                    if (cBORObject.isFalse()) {
                        stringOutput.WriteString(Constants.CASEFIRST_FALSE);
                        return;
                    }
                    return;
                }
            case 7:
                stringOutput.WriteString("null");
                return;
            case 8:
                byte[] bArrGetByteString = cBORObject.GetByteString();
                if (bArrGetByteString.length == 0) {
                    stringOutput.WriteString("\"\"");
                    return;
                }
                stringOutput.WriteCodePoint(34);
                if (cBORObject.HasTag(22)) {
                    Base64.WriteBase64(stringOutput, bArrGetByteString, 0, bArrGetByteString.length, true);
                } else if (cBORObject.HasTag(23)) {
                    for (int i5 = 0; i5 < bArrGetByteString.length; i5++) {
                        stringOutput.WriteCodePoint(Hex16.charAt((bArrGetByteString[i5] >> 4) & 15));
                        byte b2 = bArrGetByteString[i5];
                        stringOutput.WriteCodePoint(Hex16.charAt((b2 + Ascii.SI) - (b2 | Ascii.SI)));
                    }
                } else {
                    Base64.WriteBase64URL(stringOutput, bArrGetByteString, 0, bArrGetByteString.length, false);
                }
                stringOutput.WriteCodePoint(34);
                return;
            default:
                throw new IllegalStateException("Unexpected item type");
        }
    }
}
