package com.upokecenter.cbor;

import androidx.compose.ui.layout.LayoutKt;
import com.drew.metadata.exif.makernotes.CanonMakernoteDirectory;
import com.facebook.hermes.intl.Constants;
import com.facebook.imageutils.JfifUtil;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.upokecenter.numbers.EDecimal;
import com.upokecenter.numbers.EFloat;
import com.upokecenter.numbers.EInteger;
import com.upokecenter.numbers.ERational;
import com.upokecenter.util.DataUtilities;
import io.sentry.rrweb.RRWebOptionsEvent;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import okhttp3.internal.ws.WebSocketProtocol;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public final class CBORObject implements Comparable<CBORObject> {
    private static final int CBORObjectTypeArray = 4;
    private static final int CBORObjectTypeByteString = 2;
    private static final int CBORObjectTypeDouble = 8;
    private static final int CBORObjectTypeEInteger = 1;
    private static final int CBORObjectTypeInteger = 0;
    private static final int CBORObjectTypeMap = 5;
    private static final int CBORObjectTypeSimpleValue = 7;
    private static final int CBORObjectTypeTagged = 6;
    private static final int CBORObjectTypeTextString = 3;
    private static final int CBORObjectTypeTextStringAscii = 10;
    private static final int CBORObjectTypeTextStringUtf8 = 9;
    private static final int StreamedStringBufferLength = 4096;
    private final Object itemValue;
    private final int itemtypeValue;
    private final int tagHigh;
    private final int tagLow;
    public static final CBORObject False = ConstructSimpleValue(20);
    public static final CBORObject NaN = FromObject(Double.NaN);
    public static final CBORObject NegativeInfinity = FromObject(Double.NEGATIVE_INFINITY);
    public static final CBORObject Null = ConstructSimpleValue(22);
    public static final CBORObject PositiveInfinity = FromObject(Double.POSITIVE_INFINITY);
    public static final CBORObject True = ConstructSimpleValue(21);
    public static final CBORObject Undefined = ConstructSimpleValue(23);
    public static final CBORObject Zero = ConstructIntegerValue(0);
    private static final EInteger UInt64MaxValue = EInteger.FromInt32(1).ShiftLeft(64).Subtract(EInteger.FromInt64(1));
    private static final EInteger[] ValueEmptyTags = new EInteger[0];
    private static final int[] ValueExpectedLengths = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 5, 9, -1, -1, -1, -1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 5, 9, -1, -1, -1, -1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, -1, -1, -1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 5, 9, -1, -1, -1, -1};
    private static final byte[] ValueFalseBytes = {102, 97, 108, 115, 101};
    private static final byte[] ValueNullBytes = {110, 117, 108, 108};
    private static final byte[] ValueTrueBytes = {116, 114, 117, 101};
    private static final CBORObject[] FixedObjects = InitializeFixedObjects();
    private static final CBOREncodeOptions AllowEmptyOptions = new CBOREncodeOptions("allowempty=1");

    /* JADX INFO: renamed from: com.upokecenter.cbor.CBORObject$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$upokecenter$cbor$CBORType;

        static {
            int[] iArr = new int[CBORType.values().length];
            $SwitchMap$com$upokecenter$cbor$CBORType = iArr;
            try {
                iArr[CBORType.Integer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$upokecenter$cbor$CBORType[CBORType.FloatingPoint.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$upokecenter$cbor$CBORType[CBORType.Array.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$upokecenter$cbor$CBORType[CBORType.Map.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$upokecenter$cbor$CBORType[CBORType.TextString.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$upokecenter$cbor$CBORType[CBORType.ByteString.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$upokecenter$cbor$CBORType[CBORType.Boolean.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$upokecenter$cbor$CBORType[CBORType.SimpleValue.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    CBORObject(int i2, Object obj) {
        this.itemtypeValue = i2;
        this.itemValue = obj;
        this.tagLow = 0;
        this.tagHigh = 0;
    }

    CBORObject(CBORObject cBORObject, int i2, int i3) {
        this.itemtypeValue = 6;
        this.itemValue = cBORObject;
        this.tagLow = i2;
        this.tagHigh = i3;
    }

    @Deprecated
    public static CBORObject Addition(CBORObject cBORObject, CBORObject cBORObject2) {
        if (cBORObject == null) {
            throw new NullPointerException("first");
        }
        if (cBORObject2 == null) {
            throw new NullPointerException("second");
        }
        CBORNumber cBORNumberFromCBORObject = CBORNumber.FromCBORObject(cBORObject);
        if (cBORNumberFromCBORObject == null) {
            throw new IllegalArgumentException("firstdoes not represent a number");
        }
        CBORNumber cBORNumberFromCBORObject2 = CBORNumber.FromCBORObject(cBORObject2);
        if (cBORNumberFromCBORObject2 != null) {
            return cBORNumberFromCBORObject.Add(cBORNumberFromCBORObject2).ToCBORObject();
        }
        throw new IllegalArgumentException("seconddoes not represent a number");
    }

    private int AsInt32(int i2, int i3) {
        CBORNumber cBORNumberFromCBORObject = CBORNumber.FromCBORObject(this);
        if (cBORNumberFromCBORObject != null) {
            return cBORNumberFromCBORObject.GetNumberInterface().AsInt32(cBORNumberFromCBORObject.GetValue(), i2, i3);
        }
        throw new IllegalStateException("not a number type");
    }

    private List<CBORObject> AsList() {
        return (List) getThisItem();
    }

    private Map<CBORObject, CBORObject> AsMap() {
        return (Map) getThisItem();
    }

    private static boolean CBORArrayEquals(List<CBORObject> list, List<CBORObject> list2) {
        int size;
        if (list == null) {
            return list2 == null;
        }
        if (list2 == null || (size = list.size()) != list2.size()) {
            return false;
        }
        for (int i2 = 0; i2 < size; i2++) {
            CBORObject cBORObject = list.get(i2);
            CBORObject cBORObject2 = list2.get(i2);
            if (cBORObject == null) {
                if (cBORObject2 != null) {
                    return false;
                }
            } else {
                if (!cBORObject.equals(cBORObject2)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static int CBORArrayHashCode(List<CBORObject> list) {
        if (list == null) {
            return 0;
        }
        int size = list.size();
        int iHashCode = 589 + size;
        for (int i2 = 0; i2 < size; i2++) {
            iHashCode = (iHashCode * 31) + list.get(i2).hashCode();
        }
        return iHashCode;
    }

    private static boolean CBORMapEquals(Map<CBORObject, CBORObject> map, Map<CBORObject, CBORObject> map2) {
        if (map == null) {
            return map2 == null;
        }
        if (map2 == null || map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<CBORObject, CBORObject> entry : map.entrySet()) {
            CBORObject cBORObject = map2.get(entry.getKey());
            if (cBORObject == null ? map2.containsKey(entry.getKey()) : true) {
                CBORObject value = entry.getValue();
                if (value == null) {
                    if (cBORObject == null) {
                    }
                } else if (!value.equals(cBORObject)) {
                }
            }
            return false;
        }
        return true;
    }

    private static int CBORMapHashCode(Map<CBORObject, CBORObject> map) {
        return map.size() * 19;
    }

    private long CalcEncodedSize(int i2) {
        long jGetUtf8Length;
        int length;
        if (i2 > 1000) {
            throw new CBORException("Too deeply nested");
        }
        long jIntegerByteLength = 0;
        CBORObject cBORObjectUntagOne = this;
        while (cBORObjectUntagOne.isTagged()) {
            EInteger mostOuterTag = cBORObjectUntagOne.getMostOuterTag();
            jIntegerByteLength = mostOuterTag.CanFitInInt64() ? jIntegerByteLength + ((long) IntegerByteLength(mostOuterTag.ToInt64Checked())) : jIntegerByteLength + 9;
            cBORObjectUntagOne = cBORObjectUntagOne.UntagOne();
        }
        if (cBORObjectUntagOne.getItemType() == 9) {
            byte[] bArr = (byte[]) getThisItem();
            jIntegerByteLength += (long) IntegerByteLength(bArr.length);
            length = bArr.length;
        } else if (cBORObjectUntagOne.getItemType() == 10) {
            String str = (String) getThisItem();
            jIntegerByteLength += (long) IntegerByteLength(str.length());
            length = str.length();
        } else {
            switch (AnonymousClass1.$SwitchMap$com$upokecenter$cbor$CBORType[cBORObjectUntagOne.getType().ordinal()]) {
                case 1:
                    if (!cBORObjectUntagOne.CanValueFitInInt64()) {
                        return jIntegerByteLength + 9;
                    }
                    length = IntegerByteLength(cBORObjectUntagOne.AsInt64Value());
                    break;
                    break;
                case 2:
                    long jAsDoubleBits = cBORObjectUntagOne.AsDoubleBits();
                    if (CBORUtilities.DoubleToHalfPrecisionIfSameValue(jAsDoubleBits) == -1) {
                        return CBORUtilities.DoubleRetainsSameValueInSingle(jAsDoubleBits) ? jIntegerByteLength + 5 : jIntegerByteLength + 9;
                    }
                    jGetUtf8Length = 3;
                    return jIntegerByteLength + jGetUtf8Length;
                case 3:
                    long jIntegerByteLength2 = jIntegerByteLength + ((long) IntegerByteLength(cBORObjectUntagOne.size()));
                    for (int i3 = 0; i3 < cBORObjectUntagOne.size(); i3++) {
                        jIntegerByteLength2 += cBORObjectUntagOne.get(i3).CalcEncodedSize(i2 + 1);
                    }
                    return jIntegerByteLength2;
                case 4:
                    Collection<Map.Entry<CBORObject, CBORObject>> entries = getEntries();
                    long jIntegerByteLength3 = jIntegerByteLength + ((long) IntegerByteLength(entries.size()));
                    try {
                        for (Map.Entry<CBORObject, CBORObject> entry : entries) {
                            int i4 = i2 + 1;
                            jIntegerByteLength3 = jIntegerByteLength3 + entry.getKey().CalcEncodedSize(i4) + entry.getValue().CalcEncodedSize(i4);
                            break;
                        }
                        return jIntegerByteLength3;
                    } catch (IllegalArgumentException e2) {
                        throw new CBORException(e2.getMessage(), e2);
                    } catch (IllegalStateException e3) {
                        throw new CBORException(e3.getMessage(), e3);
                    }
                case 5:
                    jGetUtf8Length = DataUtilities.GetUtf8Length(AsString(), false);
                    jIntegerByteLength += (long) IntegerByteLength(jGetUtf8Length);
                    return jIntegerByteLength + jGetUtf8Length;
                case 6:
                    byte[] bArrGetByteString = cBORObjectUntagOne.GetByteString();
                    jIntegerByteLength += (long) IntegerByteLength(bArrGetByteString.length);
                    length = bArrGetByteString.length;
                    break;
                case 7:
                    jGetUtf8Length = 1;
                    return jIntegerByteLength + jGetUtf8Length;
                case 8:
                    jGetUtf8Length = cBORObjectUntagOne.getSimpleValue() >= 24 ? 2 : 1;
                    return jIntegerByteLength + jGetUtf8Length;
                default:
                    throw new IllegalStateException();
            }
        }
        jGetUtf8Length = length;
        return jIntegerByteLength + jGetUtf8Length;
    }

    private static void CheckCBORLength(int i2, int i3) {
        if (i3 < i2) {
            throw new CBORException("Premature end of data");
        }
        if (i3 > i2) {
            throw new CBORException("Too many bytes. There is data beyond the decoded CBOR Object.");
        }
    }

    private static void CheckCBORLength(long j2, long j3) {
        if (j3 < j2) {
            throw new CBORException("Premature end of data");
        }
        if (j3 > j2) {
            throw new CBORException("Too many bytes. There is data beyond the decoded CBOR Object.");
        }
    }

    private static String Chop(String str) {
        return str.substring(0, Math.min(100, str.length()));
    }

    private static CBORObject ConstructIntegerValue(int i2) {
        return new CBORObject(0, Long.valueOf(i2));
    }

    private static CBORObject ConstructSimpleValue(int i2) {
        return new CBORObject(7, Integer.valueOf(i2));
    }

    public static CBORObject DecodeFromBytes(byte[] bArr) {
        return DecodeFromBytes(bArr, CBOREncodeOptions.Default);
    }

    public static CBORObject DecodeFromBytes(byte[] bArr, CBOREncodeOptions cBOREncodeOptions) throws Throwable {
        String strGetOptimizedStringIfShortAscii;
        if (cBOREncodeOptions == null) {
            throw new NullPointerException(RRWebOptionsEvent.EVENT_TAG);
        }
        if (bArr == null) {
            throw new NullPointerException("data");
        }
        ByteArrayInputStream byteArrayInputStream = null;
        if (bArr.length == 0) {
            if (cBOREncodeOptions.getAllowEmpty()) {
                return null;
            }
            throw new CBORException("data is empty.");
        }
        byte b2 = bArr[0];
        int i2 = (b2 + 255) - (b2 | 255);
        int i3 = ValueExpectedLengths[i2];
        if (i3 == -1) {
            throw new CBORException("Unexpected data encountered");
        }
        if (i3 != 0) {
            CheckCBORLength(i3, bArr.length);
            if (!cBOREncodeOptions.getCtap2Canonical() || ((i2 >= 0 && i2 < 24) || (i2 >= 32 && i2 < 56))) {
                return GetFixedLengthObject(i2, bArr);
            }
        }
        if (i2 == 192 && !cBOREncodeOptions.getCtap2Canonical() && (strGetOptimizedStringIfShortAscii = GetOptimizedStringIfShortAscii(bArr, 1)) != null) {
            return new CBORObject(FromObject(strGetOptimizedStringIfShortAscii), 0, 0);
        }
        try {
            ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArr);
            try {
                int iAvailable = byteArrayInputStream2.available();
                CBORObject cBORObjectRead = Read(byteArrayInputStream2, cBOREncodeOptions);
                CheckCBORLength(bArr.length, iAvailable - byteArrayInputStream2.available());
                try {
                    byteArrayInputStream2.close();
                } catch (IOException unused) {
                }
                return cBORObjectRead;
            } catch (Throwable th) {
                th = th;
                byteArrayInputStream = byteArrayInputStream2;
                if (byteArrayInputStream != null) {
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static <T> T DecodeObjectFromBytes(byte[] bArr, CBOREncodeOptions cBOREncodeOptions, Type type) {
        return (T) DecodeFromBytes(bArr, cBOREncodeOptions).ToObject(type);
    }

    public static <T> T DecodeObjectFromBytes(byte[] bArr, CBOREncodeOptions cBOREncodeOptions, Type type, CBORTypeMapper cBORTypeMapper, PODOptions pODOptions) {
        if (pODOptions == null) {
            throw new NullPointerException("pod");
        }
        if (cBOREncodeOptions != null) {
            return (T) DecodeFromBytes(bArr, cBOREncodeOptions).ToObject(type, cBORTypeMapper, pODOptions);
        }
        throw new NullPointerException("enc");
    }

    public static <T> T DecodeObjectFromBytes(byte[] bArr, Type type) {
        return (T) DecodeObjectFromBytes(bArr, CBOREncodeOptions.Default, type);
    }

    public static <T> T DecodeObjectFromBytes(byte[] bArr, Type type, CBORTypeMapper cBORTypeMapper, PODOptions pODOptions) {
        return (T) DecodeObjectFromBytes(bArr, CBOREncodeOptions.Default, type, cBORTypeMapper, pODOptions);
    }

    public static CBORObject[] DecodeSequenceFromBytes(byte[] bArr) {
        return DecodeSequenceFromBytes(bArr, AllowEmptyOptions);
    }

    public static CBORObject[] DecodeSequenceFromBytes(byte[] bArr, CBOREncodeOptions cBOREncodeOptions) throws Throwable {
        if (bArr == null) {
            throw new NullPointerException("data");
        }
        if (cBOREncodeOptions == null) {
            throw new NullPointerException(RRWebOptionsEvent.EVENT_TAG);
        }
        if (bArr.length == 0) {
            return new CBORObject[0];
        }
        if (!cBOREncodeOptions.getAllowEmpty()) {
            cBOREncodeOptions = new CBOREncodeOptions(cBOREncodeOptions.toString() + ";allowempty=1");
        }
        ArrayList arrayList = new ArrayList();
        ByteArrayInputStream byteArrayInputStream = null;
        try {
            ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArr);
            while (true) {
                try {
                    CBORObject cBORObjectRead = Read(byteArrayInputStream2, cBOREncodeOptions);
                    if (cBORObjectRead == null) {
                        break;
                    }
                    arrayList.add(cBORObjectRead);
                } catch (Throwable th) {
                    th = th;
                    byteArrayInputStream = byteArrayInputStream2;
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                    throw th;
                }
            }
            try {
                byteArrayInputStream2.close();
            } catch (IOException unused2) {
            }
            return (CBORObject[]) arrayList.toArray(new CBORObject[0]);
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Deprecated
    public static CBORObject Divide(CBORObject cBORObject, CBORObject cBORObject2) {
        if (cBORObject == null) {
            throw new NullPointerException("first");
        }
        if (cBORObject2 == null) {
            throw new NullPointerException("second");
        }
        CBORNumber cBORNumberFromCBORObject = CBORNumber.FromCBORObject(cBORObject);
        if (cBORNumberFromCBORObject == null) {
            throw new IllegalArgumentException("firstdoes not represent a number");
        }
        CBORNumber cBORNumberFromCBORObject2 = CBORNumber.FromCBORObject(cBORObject2);
        if (cBORNumberFromCBORObject2 != null) {
            return cBORNumberFromCBORObject.Divide(cBORNumberFromCBORObject2).ToCBORObject();
        }
        throw new IllegalArgumentException("seconddoes not represent a number");
    }

    private static byte[] EIntegerBytes(EInteger eInteger) {
        if (eInteger.isZero()) {
            return new byte[]{0};
        }
        if (eInteger.signum() < 0) {
            eInteger = eInteger.Add(1).Negate();
        }
        byte[] bArrToBytes = eInteger.ToBytes(false);
        int i2 = 0;
        while (i2 < bArrToBytes.length && bArrToBytes[i2] == 0) {
            i2++;
        }
        if (i2 <= 0) {
            return bArrToBytes;
        }
        int length = bArrToBytes.length - i2;
        byte[] bArr = new byte[length];
        System.arraycopy(bArrToBytes, i2, bArr, 0, length);
        return bArr;
    }

    private static String ExtendedToString(EFloat eFloat) {
        return (!eFloat.isFinite() || (eFloat.getExponent().compareTo(EInteger.FromInt64(2500L)) <= 0 && eFloat.getExponent().compareTo(EInteger.FromInt64(-2500L)) >= 0)) ? eFloat.toString() : eFloat.getMantissa() + "p" + eFloat.getExponent();
    }

    static CBORObject FromArrayBackedObject(CBORObject[] cBORObjectArr) {
        return cBORObjectArr == null ? Null : new CBORObject(4, PropertyMap.ListFromArray(cBORObjectArr));
    }

    public static CBORObject FromFloatingPointBits(long j2, int i2) {
        if (i2 == 2) {
            return new CBORObject(8, Long.valueOf(CBORUtilities.HalfToDoublePrecision((int) (j2 & WebSocketProtocol.PAYLOAD_SHORT_MAX))));
        }
        if (i2 == 4) {
            return new CBORObject(8, Long.valueOf(CBORUtilities.SingleToDoublePrecision((int) (j2 & 4294967295L))));
        }
        if (i2 == 8) {
            return new CBORObject(8, Long.valueOf(j2));
        }
        throw new IllegalArgumentException("byteCount");
    }

    public static CBORObject FromJSONBytes(byte[] bArr) {
        return FromJSONBytes(bArr, JSONOptions.Default);
    }

    public static CBORObject FromJSONBytes(byte[] bArr, int i2, int i3) {
        return FromJSONBytes(bArr, i2, i3, JSONOptions.Default);
    }

    public static CBORObject FromJSONBytes(byte[] bArr, int i2, int i3, JSONOptions jSONOptions) throws Throwable {
        if (bArr == null) {
            throw new NullPointerException("bytes");
        }
        if (jSONOptions == null) {
            throw new NullPointerException("jsonoptions");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("offset (" + i2 + ") is not greater or equal to 0");
        }
        if (i2 > bArr.length) {
            throw new IllegalArgumentException("offset (" + i2 + ") is not less or equal to " + bArr.length);
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("count (" + i3 + ") is not greater or equal to 0");
        }
        if (i3 > bArr.length) {
            throw new IllegalArgumentException("count (" + i3 + ") is not less or equal to " + bArr.length);
        }
        if (bArr.length - i2 < i3) {
            throw new IllegalArgumentException("bytes's length minus " + i2 + " (" + (bArr.length - i2) + ") is not greater or equal to " + i3);
        }
        if (i3 == 0) {
            throw new CBORException("Byte array is empty");
        }
        byte b2 = bArr[i2];
        if (b2 >= 1 && b2 <= 127 && i3 >= 2 && bArr[i2 + 1] != 0) {
            return CBORJson2.ParseJSONValue(bArr, i2, i3 + i2, jSONOptions);
        }
        ByteArrayInputStream byteArrayInputStream = null;
        try {
            ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArr, i2, i3);
            try {
                CBORObject cBORObjectReadJSON = ReadJSON(byteArrayInputStream2, jSONOptions);
                try {
                    byteArrayInputStream2.close();
                } catch (IOException unused) {
                }
                return cBORObjectReadJSON;
            } catch (Throwable th) {
                th = th;
                byteArrayInputStream = byteArrayInputStream2;
                if (byteArrayInputStream != null) {
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                try {
                    throw th;
                } catch (IOException e2) {
                    throw new CBORException(e2.getMessage(), e2);
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static CBORObject FromJSONBytes(byte[] bArr, JSONOptions jSONOptions) {
        if (bArr == null) {
            throw new NullPointerException("bytes");
        }
        if (jSONOptions == null) {
            throw new NullPointerException("jsonoptions");
        }
        if (bArr.length != 0) {
            return FromJSONBytes(bArr, 0, bArr.length, jSONOptions);
        }
        throw new CBORException("Byte array is empty");
    }

    public static CBORObject[] FromJSONSequenceBytes(byte[] bArr) {
        return FromJSONSequenceBytes(bArr, JSONOptions.Default);
    }

    public static CBORObject[] FromJSONSequenceBytes(byte[] bArr, JSONOptions jSONOptions) throws Throwable {
        if (bArr == null) {
            throw new NullPointerException("data");
        }
        if (jSONOptions == null) {
            throw new NullPointerException(RRWebOptionsEvent.EVENT_TAG);
        }
        ByteArrayInputStream byteArrayInputStream = null;
        try {
            ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArr);
            try {
                CBORObject[] cBORObjectArrReadJSONSequence = ReadJSONSequence(byteArrayInputStream2, jSONOptions);
                try {
                    byteArrayInputStream2.close();
                } catch (IOException unused) {
                }
                return cBORObjectArrReadJSONSequence;
            } catch (Throwable th) {
                th = th;
                byteArrayInputStream = byteArrayInputStream2;
                if (byteArrayInputStream != null) {
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                try {
                    throw th;
                } catch (IOException e2) {
                    throw new CBORException(e2.getMessage(), e2);
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static CBORObject FromJSONString(String str) {
        return FromJSONString(str, JSONOptions.Default);
    }

    public static CBORObject FromJSONString(String str, int i2, int i3) {
        if (str != null) {
            return FromJSONString(str, i2, i3, JSONOptions.Default);
        }
        throw new NullPointerException("str");
    }

    public static CBORObject FromJSONString(String str, int i2, int i3, JSONOptions jSONOptions) {
        if (str == null) {
            throw new NullPointerException("str");
        }
        if (jSONOptions == null) {
            throw new NullPointerException("jsonoptions");
        }
        if (i3 > 0 && str.charAt(i2) == 65279) {
            throw new CBORException("JSON Object began with a byte order mark (U+FEFF) (offset 0)");
        }
        if (i3 != 0) {
            return CBORJson3.ParseJSONValue(str, i2, i3 + i2, jSONOptions);
        }
        throw new CBORException("String is empty");
    }

    @Deprecated
    public static CBORObject FromJSONString(String str, CBOREncodeOptions cBOREncodeOptions) {
        if (str == null) {
            throw new NullPointerException("str");
        }
        if (cBOREncodeOptions != null) {
            return FromJSONString(str, new JSONOptions(cBOREncodeOptions.getAllowDuplicateKeys() ? "allowduplicatekeys=1" : "allowduplicatekeys=0"));
        }
        throw new NullPointerException(RRWebOptionsEvent.EVENT_TAG);
    }

    public static CBORObject FromJSONString(String str, JSONOptions jSONOptions) {
        if (str == null) {
            throw new NullPointerException("str");
        }
        if (jSONOptions != null) {
            return FromJSONString(str, 0, str.length(), jSONOptions);
        }
        throw new NullPointerException("jsonoptions");
    }

    public static CBORObject FromObject(byte b2) {
        return FromObject((-1) - (((-1) - b2) | ((-1) - 255)));
    }

    public static CBORObject FromObject(double d2) {
        return new CBORObject(8, Long.valueOf(CBORUtilities.DoubleToInt64Bits(d2)));
    }

    public static CBORObject FromObject(float f2) {
        return new CBORObject(8, Long.valueOf(CBORUtilities.SingleToDoublePrecision(CBORUtilities.SingleToInt32Bits(f2))));
    }

    public static CBORObject FromObject(int i2) {
        return (i2 < 0 || i2 >= 24) ? (i2 < -24 || i2 >= 0) ? FromObject(i2) : FixedObjects[32 - (i2 + 1)] : FixedObjects[i2];
    }

    public static CBORObject FromObject(long j2) {
        return (j2 < 0 || j2 >= 24) ? (j2 < -24 || j2 >= 0) ? new CBORObject(0, Long.valueOf(j2)) : FixedObjects[32 - ((int) (j2 + 1))] : FixedObjects[(int) j2];
    }

    public static CBORObject FromObject(CBORObject cBORObject) {
        return cBORObject == null ? Null : cBORObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean, int] */
    public static CBORObject FromObject(EDecimal eDecimal) {
        CBORObject cBORObjectNewArray;
        int i2;
        if (eDecimal == null) {
            return Null;
        }
        if (eDecimal.IsInfinity() || eDecimal.IsNaN() || (eDecimal.isNegative() && eDecimal.isZero())) {
            ?? IsNegative = eDecimal.isNegative();
            int i3 = IsNegative;
            if (eDecimal.IsInfinity()) {
                i3 = IsNegative + 2;
            }
            int i4 = i3;
            if (eDecimal.IsQuietNaN()) {
                i4 = i3 + 4;
            }
            int i5 = i4;
            if (eDecimal.IsSignalingNaN()) {
                i5 = i4 + 6;
            }
            cBORObjectNewArray = NewArray(FromObject(eDecimal.getExponent()), FromObject(eDecimal.getUnsignedMantissa()), FromObject(i5));
            i2 = 268;
        } else {
            EInteger exponent = eDecimal.getExponent();
            if (exponent.CanFitInInt64()) {
                cBORObjectNewArray = NewArray(FromObject(exponent.ToInt64Checked()), FromObject(eDecimal.getMantissa()));
            } else {
                i2 = exponent.GetSignedBitLengthAsInt64() > 64 ? 264 : 4;
                cBORObjectNewArray = NewArray(FromObject(exponent), FromObject(eDecimal.getMantissa()));
            }
        }
        return cBORObjectNewArray.WithTag(i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean, int] */
    public static CBORObject FromObject(EFloat eFloat) {
        CBORObject cBORObjectNewArray;
        int i2;
        if (eFloat == null) {
            return Null;
        }
        if (eFloat.IsInfinity() || eFloat.IsNaN() || (eFloat.isNegative() && eFloat.isZero())) {
            ?? IsNegative = eFloat.isNegative();
            int i3 = IsNegative;
            if (eFloat.IsInfinity()) {
                i3 = IsNegative + 2;
            }
            int i4 = i3;
            if (eFloat.IsQuietNaN()) {
                i4 = i3 + 4;
            }
            int i5 = i4;
            if (eFloat.IsSignalingNaN()) {
                i5 = i4 + 6;
            }
            cBORObjectNewArray = NewArray(FromObject(eFloat.getExponent()), FromObject(eFloat.getUnsignedMantissa()), FromObject(i5));
            i2 = 269;
        } else {
            EInteger exponent = eFloat.getExponent();
            if (exponent.CanFitInInt64()) {
                cBORObjectNewArray = NewArray(FromObject(exponent.ToInt64Checked()), FromObject(eFloat.getMantissa()));
            } else {
                i2 = exponent.GetSignedBitLengthAsInt64() > 64 ? 265 : 5;
                cBORObjectNewArray = NewArray(FromObject(exponent), FromObject(eFloat.getMantissa()));
            }
        }
        return cBORObjectNewArray.WithTag(i2);
    }

    public static CBORObject FromObject(EInteger eInteger) {
        if (eInteger == null) {
            return Null;
        }
        if (eInteger.CanFitInInt64()) {
            return FromObject(eInteger.ToInt64Checked());
        }
        if (eInteger.GetSignedBitLengthAsEInteger().compareTo(64) <= 0) {
            return new CBORObject(1, eInteger);
        }
        return FromObjectAndTag(EIntegerBytes(eInteger), eInteger.signum() < 0 ? 3 : 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean, int] */
    public static CBORObject FromObject(ERational eRational) {
        CBORObject cBORObjectNewArray;
        int i2;
        if (eRational == null) {
            return Null;
        }
        if (eRational.IsInfinity() || eRational.IsNaN() || (eRational.isNegative() && eRational.isZero())) {
            ?? IsNegative = eRational.isNegative();
            int i3 = IsNegative;
            if (eRational.IsInfinity()) {
                i3 = IsNegative + 2;
            }
            int i4 = i3;
            if (eRational.IsQuietNaN()) {
                i4 = i3 + 4;
            }
            int i5 = i4;
            if (eRational.IsSignalingNaN()) {
                i5 = i4 + 6;
            }
            cBORObjectNewArray = NewArray(FromObject(eRational.getUnsignedNumerator()), FromObject(eRational.getDenominator()), FromObject(i5));
            i2 = 270;
        } else {
            cBORObjectNewArray = NewArray(FromObject(eRational.getNumerator()), FromObject(eRational.getDenominator()));
            i2 = 30;
        }
        return cBORObjectNewArray.WithTag(i2);
    }

    public static CBORObject FromObject(Object obj) {
        return FromObject(obj, PODOptions.Default);
    }

    public static CBORObject FromObject(Object obj, CBORTypeMapper cBORTypeMapper) {
        if (cBORTypeMapper != null) {
            return FromObject(obj, PODOptions.Default, cBORTypeMapper, 0);
        }
        throw new NullPointerException("mapper");
    }

    public static CBORObject FromObject(Object obj, CBORTypeMapper cBORTypeMapper, PODOptions pODOptions) {
        if (cBORTypeMapper != null) {
            return FromObject(obj, pODOptions, cBORTypeMapper, 0);
        }
        throw new NullPointerException("mapper");
    }

    public static CBORObject FromObject(Object obj, PODOptions pODOptions) {
        return FromObject(obj, pODOptions, null, 0);
    }

    static CBORObject FromObject(Object obj, PODOptions pODOptions, CBORTypeMapper cBORTypeMapper, int i2) {
        CBORObject cBORObjectConvertWithConverter;
        if (pODOptions == null) {
            throw new NullPointerException(RRWebOptionsEvent.EVENT_TAG);
        }
        if (i2 >= 100) {
            throw new CBORException("Nesting depth too high");
        }
        if (obj == null) {
            return Null;
        }
        if (obj instanceof CBORObject) {
            return FromObject((CBORObject) obj);
        }
        if (cBORTypeMapper != null && (cBORObjectConvertWithConverter = cBORTypeMapper.ConvertWithConverter(obj)) != null) {
            return cBORObjectConvertWithConverter;
        }
        if (obj instanceof String) {
            return FromObject((String) obj);
        }
        if (obj instanceof Integer) {
            return FromObject(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            return FromObject(((Long) obj).longValue());
        }
        EInteger eInteger = obj instanceof EInteger ? (EInteger) obj : null;
        if (eInteger != null) {
            return FromObject(eInteger);
        }
        EDecimal eDecimal = obj instanceof EDecimal ? (EDecimal) obj : null;
        if (eDecimal != null) {
            return FromObject(eDecimal);
        }
        EFloat eFloat = obj instanceof EFloat ? (EFloat) obj : null;
        if (eFloat != null) {
            return FromObject(eFloat);
        }
        ERational eRational = obj instanceof ERational ? (ERational) obj : null;
        if (eRational != null) {
            return FromObject(eRational);
        }
        if (obj instanceof Short) {
            return FromObject(((Short) obj).shortValue());
        }
        if (obj instanceof Character) {
            return FromObject((int) ((Character) obj).charValue());
        }
        if (obj instanceof Boolean) {
            return FromObject(((Boolean) obj).booleanValue());
        }
        if (obj instanceof Byte) {
            return FromObject(((Byte) obj).byteValue());
        }
        if (obj instanceof Float) {
            return FromObject(((Float) obj).floatValue());
        }
        if (obj instanceof Double) {
            return FromObject(((Double) obj).doubleValue());
        }
        byte[] bArr = obj instanceof byte[] ? (byte[]) obj : null;
        if (bArr != null) {
            return FromObject(bArr);
        }
        if (obj instanceof Map) {
            CBORObject cBORObjectNewMap = NewMap();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                int i3 = i2 + 1;
                cBORObjectNewMap.set(FromObject(entry.getKey(), pODOptions, cBORTypeMapper, i3), FromObject(entry.getValue(), pODOptions, cBORTypeMapper, i3));
            }
            return cBORObjectNewMap;
        }
        if (obj.getClass().isArray()) {
            return PropertyMap.FromArray(obj, pODOptions, cBORTypeMapper, i2);
        }
        if (obj instanceof Iterable) {
            CBORObject cBORObjectNewArray = NewArray();
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                cBORObjectNewArray.Add(FromObject(it.next(), pODOptions, cBORTypeMapper, i2 + 1));
            }
            return cBORObjectNewArray;
        }
        if (obj instanceof Enum) {
            return FromObject(PropertyMap.EnumToObjectAsInteger((Enum) obj));
        }
        if (obj instanceof Date) {
            return new CBORDateConverter().ToCBORObject((Date) obj);
        }
        if (obj instanceof URI) {
            return new CBORUriConverter().ToCBORObject((URI) obj);
        }
        if (obj instanceof UUID) {
            return new CBORUuidConverter().ToCBORObject((UUID) obj);
        }
        CBORObject cBORObjectFromObjectOther = PropertyMap.FromObjectOther(obj);
        if (cBORObjectFromObjectOther != null) {
            return cBORObjectFromObjectOther;
        }
        CBORObject cBORObjectNewMap2 = NewMap();
        for (Map.Entry<String, Object> entry2 : PropertyMap.GetProperties(obj, pODOptions.getUseCamelCase())) {
            cBORObjectNewMap2.set(entry2.getKey(), FromObject(entry2.getValue(), pODOptions, cBORTypeMapper, i2 + 1));
        }
        return cBORObjectNewMap2;
    }

    public static CBORObject FromObject(String str) {
        if (str == null) {
            return Null;
        }
        if (str.length() == 0) {
            return GetFixedObject(96);
        }
        long jGetUtf8Length = DataUtilities.GetUtf8Length(str, false);
        if (jGetUtf8Length >= 0) {
            return new CBORObject(((long) str.length()) == jGetUtf8Length ? 10 : 3, str);
        }
        throw new IllegalArgumentException("String contains an unpaired surrogate code point.");
    }

    public static CBORObject FromObject(short s2) {
        return (s2 < 0 || s2 >= 24) ? (s2 < -24 || s2 >= 0) ? FromObject(s2) : FixedObjects[32 - (s2 + 1)] : FixedObjects[s2];
    }

    public static CBORObject FromObject(boolean z2) {
        return z2 ? True : False;
    }

    public static CBORObject FromObject(byte[] bArr) {
        if (bArr == null) {
            return Null;
        }
        System.arraycopy(bArr, 0, new byte[bArr.length], 0, bArr.length);
        return new CBORObject(2, bArr);
    }

    public static CBORObject FromObject(int[] iArr) {
        if (iArr == null) {
            return Null;
        }
        ArrayList arrayList = new ArrayList(iArr.length == Integer.MAX_VALUE ? iArr.length : iArr.length + 1);
        for (int i2 : iArr) {
            arrayList.add(FromObject(i2));
        }
        return new CBORObject(4, arrayList);
    }

    public static CBORObject FromObject(long[] jArr) {
        if (jArr == null) {
            return Null;
        }
        ArrayList arrayList = new ArrayList(jArr.length == Integer.MAX_VALUE ? jArr.length : jArr.length + 1);
        for (long j2 : jArr) {
            arrayList.add(FromObject(j2));
        }
        return new CBORObject(4, arrayList);
    }

    public static CBORObject FromObject(CBORObject[] cBORObjectArr) {
        if (cBORObjectArr == null) {
            return Null;
        }
        ArrayList arrayList = new ArrayList();
        for (CBORObject cBORObject : cBORObjectArr) {
            arrayList.add(cBORObject);
        }
        return new CBORObject(4, arrayList);
    }

    public static CBORObject FromObjectAndTag(Object obj, int i2) {
        if (i2 >= 0) {
            return FromObject(obj).WithTag(i2);
        }
        throw new IllegalArgumentException("smallTag(" + i2 + ") is less than 0");
    }

    public static CBORObject FromObjectAndTag(Object obj, EInteger eInteger) {
        if (eInteger == null) {
            throw new NullPointerException("bigintTag");
        }
        if (eInteger.signum() < 0) {
            throw new IllegalArgumentException("tagEInt's sign(" + eInteger.signum() + ") is less than 0");
        }
        if (eInteger.compareTo(UInt64MaxValue) <= 0) {
            return FromObject(obj).WithTag(eInteger);
        }
        throw new IllegalArgumentException("tag more than 18446744073709551615 (" + eInteger + ")");
    }

    static CBORObject FromRaw(String str) {
        return new CBORObject(3, str);
    }

    static CBORObject FromRaw(List<CBORObject> list) {
        return new CBORObject(4, list);
    }

    static CBORObject FromRaw(Map<CBORObject, CBORObject> map) {
        return new CBORObject(5, map);
    }

    static CBORObject FromRaw(byte[] bArr) {
        return new CBORObject(2, bArr);
    }

    static CBORObject FromRawUtf8(byte[] bArr) {
        return new CBORObject(9, bArr);
    }

    public static CBORObject FromSimpleValue(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("simpleValue(" + i2 + ") is less than 0");
        }
        if (i2 > 255) {
            throw new IllegalArgumentException("simpleValue(" + i2 + ") is more than 255");
        }
        if (i2 < 24 || i2 >= 32) {
            return i2 < 32 ? FixedObjects[i2 + CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY] : new CBORObject(7, Integer.valueOf(i2));
        }
        throw new IllegalArgumentException("Simple value is from 24 to 31: " + i2);
    }

    private static byte[] GetDoubleBytes(long j2, int i2) {
        int iDoubleToHalfPrecisionIfSameValue = CBORUtilities.DoubleToHalfPrecisionIfSameValue(j2);
        if (iDoubleToHalfPrecisionIfSameValue != -1) {
            if (i2 != 0) {
                return new byte[]{(byte) i2, -7, (byte) ((-1) - (((-1) - (iDoubleToHalfPrecisionIfSameValue >> 8)) | ((-1) - 255))), (byte) ((-1) - (((-1) - iDoubleToHalfPrecisionIfSameValue) | ((-1) - 255)))};
            }
            int i3 = iDoubleToHalfPrecisionIfSameValue >> 8;
            return new byte[]{-7, (byte) ((i3 + 255) - (i3 | 255)), (byte) ((-1) - (((-1) - iDoubleToHalfPrecisionIfSameValue) | ((-1) - 255)))};
        }
        if (!CBORUtilities.DoubleRetainsSameValueInSingle(j2)) {
            return GetDoubleBytes64(j2, i2);
        }
        int iDoubleToRoundedSinglePrecision = CBORUtilities.DoubleToRoundedSinglePrecision(j2);
        if (i2 == 0) {
            int i4 = iDoubleToRoundedSinglePrecision >> 16;
            return new byte[]{-6, (byte) ((-1) - (((-1) - (iDoubleToRoundedSinglePrecision >> 24)) | ((-1) - 255))), (byte) ((i4 + 255) - (i4 | 255)), (byte) ((-1) - (((-1) - (iDoubleToRoundedSinglePrecision >> 8)) | ((-1) - 255))), (byte) (iDoubleToRoundedSinglePrecision & 255)};
        }
        int i5 = iDoubleToRoundedSinglePrecision >> 16;
        int i6 = iDoubleToRoundedSinglePrecision >> 8;
        return new byte[]{(byte) i2, -6, (byte) ((iDoubleToRoundedSinglePrecision >> 24) & 255), (byte) ((i5 + 255) - (i5 | 255)), (byte) ((i6 + 255) - (i6 | 255)), (byte) ((-1) - (((-1) - iDoubleToRoundedSinglePrecision) | ((-1) - 255)))};
    }

    private static byte[] GetDoubleBytes64(long j2, int i2) {
        if (i2 != 0) {
            long j3 = j2 >> 56;
            long j4 = j2 >> 48;
            long j5 = j2 >> 40;
            long j6 = j2 >> 24;
            return new byte[]{(byte) i2, -5, (byte) ((j3 + 255) - (j3 | 255)), (byte) ((j4 + 255) - (j4 | 255)), (byte) ((j5 + 255) - (j5 | 255)), (byte) ((j2 >> 32) & 255), (byte) ((j6 + 255) - (j6 | 255)), (byte) ((-1) - (((-1) - (j2 >> 16)) | ((-1) - 255))), (byte) ((j2 >> 8) & 255), (byte) (j2 & 255)};
        }
        long j7 = j2 >> 48;
        long j8 = j2 >> 40;
        long j9 = j2 >> 32;
        long j10 = j2 >> 24;
        return new byte[]{-5, (byte) ((j2 >> 56) & 255), (byte) ((j7 + 255) - (j7 | 255)), (byte) ((j8 + 255) - (j8 | 255)), (byte) ((j9 + 255) - (j9 | 255)), (byte) ((j10 + 255) - (j10 | 255)), (byte) ((j2 >> 16) & 255), (byte) ((j2 >> 8) & 255), (byte) ((-1) - (((-1) - j2) | ((-1) - 255)))};
    }

    static int GetExpectedLength(int i2) {
        return ValueExpectedLengths[i2];
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static com.upokecenter.cbor.CBORObject GetFixedLengthObject(int r20, byte[] r21) {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.cbor.CBORObject.GetFixedLengthObject(int, byte[]):com.upokecenter.cbor.CBORObject");
    }

    static CBORObject GetFixedObject(int i2) {
        return FixedObjects[i2];
    }

    private static byte[] GetOptimizedBytesIfShortAscii(String str, int i2) {
        int i3;
        int i4;
        if (str.length() > 255) {
            return null;
        }
        int length = str.length();
        int i5 = length < 24 ? 1 : 2;
        if (i2 >= 0) {
            i5++;
        }
        byte[] bArr = new byte[i5 + length];
        if (i2 >= 0) {
            bArr[0] = (byte) i2;
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (length < 24) {
            bArr[i3] = (byte) (str.length() + 96);
            i4 = i3 + 1;
        } else {
            bArr[i3] = 120;
            bArr[i3 + 1] = (byte) str.length();
            i4 = i3 + 2;
        }
        for (int i6 = 0; i6 < str.length(); i6++) {
            char cCharAt = str.charAt(i6);
            if (cCharAt >= 128) {
                return null;
            }
            bArr[i6 + i4] = (byte) cCharAt;
        }
        return bArr;
    }

    private static String GetOptimizedStringIfShortAscii(byte[] bArr, int i2) {
        int length = bArr.length;
        if (length > i2) {
            int i3 = bArr[i2];
            int i4 = (i3 + 255) - (i3 | 255);
            if (i4 >= 96 && i4 < 120) {
                int i5 = i2 + 1;
                CheckCBORLength((i4 - 96) + i5, length);
                for (int i6 = i5; i6 < length; i6++) {
                    byte b2 = bArr[i6];
                    if ((b2 - 128) - (b2 | (-128)) != 0) {
                        return null;
                    }
                }
                char[] cArr = new char[length - i5];
                for (int i7 = i5; i7 < length; i7++) {
                    cArr[i7 - i5] = (char) ((-1) - (((-1) - bArr[i7]) | ((-1) - 255)));
                }
                return new String(cArr);
            }
        }
        return null;
    }

    private static byte[] GetPositiveInt64Bytes(int i2, long j2) {
        if (j2 < 0) {
            throw new IllegalArgumentException("value(" + j2 + ") is less than 0");
        }
        if (j2 < 24) {
            return new byte[]{(byte) ((-1) - (((-1) - ((byte) j2)) & ((-1) - ((byte) (i2 << 5)))))};
        }
        if (j2 <= 255) {
            return new byte[]{(byte) ((-1) - (((-1) - (i2 << 5)) & ((-1) - 24))), (byte) ((j2 + 255) - (j2 | 255))};
        }
        if (j2 <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            int i3 = i2 << 5;
            return new byte[]{(byte) ((i3 + 25) - (i3 & 25)), (byte) ((j2 >> 8) & 255), (byte) ((j2 + 255) - (j2 | 255))};
        }
        if (j2 <= 4294967295L) {
            return new byte[]{(byte) ((i2 << 5) | 26), (byte) ((-1) - (((-1) - (j2 >> 24)) | ((-1) - 255))), (byte) ((j2 >> 16) & 255), (byte) ((j2 >> 8) & 255), (byte) ((j2 + 255) - (j2 | 255))};
        }
        int i4 = i2 << 5;
        long j3 = j2 >> 8;
        return new byte[]{(byte) ((i4 + 27) - (i4 & 27)), (byte) ((j2 >> 56) & 255), (byte) ((-1) - (((-1) - (j2 >> 48)) | ((-1) - 255))), (byte) ((-1) - (((-1) - (j2 >> 40)) | ((-1) - 255))), (byte) ((-1) - (((-1) - (j2 >> 32)) | ((-1) - 255))), (byte) ((j2 >> 24) & 255), (byte) ((-1) - (((-1) - (j2 >> 16)) | ((-1) - 255))), (byte) ((j3 + 255) - (j3 | 255)), (byte) (j2 & 255)};
    }

    private static byte[] GetPositiveIntBytes(int i2, int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException("value(" + i3 + ") is less than 0");
        }
        if (i3 < 24) {
            return new byte[]{(byte) (((byte) (i2 << 5)) | ((byte) i3))};
        }
        if (i3 <= 255) {
            int i4 = i2 << 5;
            return new byte[]{(byte) ((i4 + 24) - (i4 & 24)), (byte) ((-1) - (((-1) - i3) | ((-1) - 255)))};
        }
        if (i3 <= 65535) {
            return new byte[]{(byte) ((-1) - (((-1) - (i2 << 5)) & ((-1) - 25))), (byte) ((-1) - (((-1) - (i3 >> 8)) | ((-1) - 255))), (byte) ((-1) - (((-1) - i3) | ((-1) - 255)))};
        }
        int i5 = i3 >> 16;
        return new byte[]{(byte) ((i2 << 5) | 26), (byte) ((-1) - (((-1) - (i3 >> 24)) | ((-1) - 255))), (byte) ((i5 + 255) - (i5 | 255)), (byte) ((-1) - (((-1) - (i3 >> 8)) | ((-1) - 255))), (byte) ((-1) - (((-1) - i3) | ((-1) - 255)))};
    }

    private static CBORObject[] InitializeFixedObjects() {
        CBORObject[] cBORObjectArr = new CBORObject[256];
        for (int i2 = 0; i2 < 24; i2++) {
            cBORObjectArr[i2] = new CBORObject(0, Long.valueOf(i2));
        }
        for (int i3 = 32; i3 < 56; i3++) {
            cBORObjectArr[i3] = new CBORObject(0, Long.valueOf((-1) - (i3 - 32)));
        }
        cBORObjectArr[96] = new CBORObject(3, "");
        for (int i4 = CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY; i4 < 248; i4++) {
            cBORObjectArr[i4] = new CBORObject(7, Integer.valueOf(i4 - 224));
        }
        return cBORObjectArr;
    }

    private static int IntegerByteLength(int i2) {
        if (i2 < 0) {
            i2 = -(i2 + 1);
        }
        if (i2 > 65535) {
            return 5;
        }
        if (i2 > 255) {
            return 3;
        }
        return i2 > 23 ? 2 : 1;
    }

    private static int IntegerByteLength(long j2) {
        if (j2 < 0) {
            j2 = -(j2 + 1);
        }
        if (j2 > 4294967295L) {
            return 9;
        }
        if (j2 > WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            return 5;
        }
        if (j2 > 255) {
            return 3;
        }
        return j2 > 23 ? 2 : 1;
    }

    private static int ListCompare(List<CBORObject> list, List<CBORObject> list2) {
        if (list == null) {
            return list2 == null ? 0 : -1;
        }
        if (list2 == null) {
            return 1;
        }
        int size = list.size();
        int size2 = list2.size();
        if (size != size2) {
            return size < size2 ? -1 : 1;
        }
        for (int i2 = 0; i2 < size; i2++) {
            int iCompareTo = list.get(i2).compareTo(list2.get(i2));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return 0;
    }

    private static EInteger LowHighToEInteger(int i2, int i3) {
        if (i3 == 0) {
            if (i2 == 0) {
                return EInteger.FromInt32(0);
            }
            int i4 = i2 >> 16;
            byte b2 = (byte) ((i4 + 255) - (i4 | 255));
            return EInteger.FromBytes(new byte[]{(byte) ((-1) - (((-1) - i2) | ((-1) - 255))), (byte) ((-1) - (((-1) - (i2 >> 8)) | ((-1) - 255))), b2, (byte) ((i2 >> 24) & 255), 0}, true);
        }
        int i5 = i3 >> 16;
        byte b3 = (byte) ((i5 + 255) - (i5 | 255));
        int i6 = i3 >> 8;
        byte b4 = (byte) ((i6 + 255) - (i6 | 255));
        int i7 = i2 >> 8;
        byte b5 = (byte) ((i7 + 255) - (i7 | 255));
        return EInteger.FromBytes(new byte[]{(byte) ((-1) - (((-1) - i2) | ((-1) - 255))), b5, (byte) ((i2 >> 16) & 255), (byte) ((-1) - (((-1) - (i2 >> 24)) | ((-1) - 255))), (byte) ((i3 + 255) - (i3 | 255)), b4, b3, (byte) ((-1) - (((-1) - (i3 >> 24)) | ((-1) - 255))), 0}, true);
    }

    private static int MapCompare(Map<CBORObject, CBORObject> map, Map<CBORObject, CBORObject> map2) {
        if (map == null) {
            return map2 == null ? 0 : -1;
        }
        if (map2 == null) {
            return 1;
        }
        if (map == map2) {
            return 0;
        }
        int size = map.size();
        int size2 = map2.size();
        if (size == 0 && size2 == 0) {
            return 0;
        }
        if (size == 0) {
            return -1;
        }
        if (size2 == 0) {
            return 1;
        }
        if (size != size2) {
            return size < size2 ? -1 : 1;
        }
        ArrayList arrayList = new ArrayList(PropertyMap.GetSortedKeys(map));
        ArrayList arrayList2 = new ArrayList(PropertyMap.GetSortedKeys(map2));
        int size3 = arrayList.size();
        arrayList2.size();
        for (int i2 = 0; i2 < size3; i2++) {
            CBORObject cBORObject = (CBORObject) arrayList.get(i2);
            CBORObject cBORObject2 = (CBORObject) arrayList2.get(i2);
            if (cBORObject == null) {
                return -1;
            }
            int iCompareTo = cBORObject.compareTo(cBORObject2);
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            int iCompareTo2 = map.get(cBORObject).compareTo(map2.get(cBORObject2));
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
        }
        return 0;
    }

    @Deprecated
    public static CBORObject Multiply(CBORObject cBORObject, CBORObject cBORObject2) {
        if (cBORObject == null) {
            throw new NullPointerException("first");
        }
        if (cBORObject2 == null) {
            throw new NullPointerException("second");
        }
        CBORNumber cBORNumberFromCBORObject = CBORNumber.FromCBORObject(cBORObject);
        if (cBORNumberFromCBORObject == null) {
            throw new IllegalArgumentException("firstdoes not represent a number");
        }
        CBORNumber cBORNumberFromCBORObject2 = CBORNumber.FromCBORObject(cBORObject2);
        if (cBORNumberFromCBORObject2 != null) {
            return cBORNumberFromCBORObject.Multiply(cBORNumberFromCBORObject2).ToCBORObject();
        }
        throw new IllegalArgumentException("seconddoes not represent a number");
    }

    public static CBORObject NewArray() {
        return new CBORObject(4, new ArrayList());
    }

    static CBORObject NewArray(CBORObject cBORObject, CBORObject cBORObject2) {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(cBORObject);
        arrayList.add(cBORObject2);
        return new CBORObject(4, arrayList);
    }

    static CBORObject NewArray(CBORObject cBORObject, CBORObject cBORObject2, CBORObject cBORObject3) {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(cBORObject);
        arrayList.add(cBORObject2);
        arrayList.add(cBORObject3);
        return new CBORObject(4, arrayList);
    }

    public static CBORObject NewMap() {
        return new CBORObject(5, new TreeMap());
    }

    public static CBORObject NewOrderedMap() {
        return new CBORObject(5, PropertyMap.NewOrderedDict());
    }

    private static List<Object> PushObject(List<Object> list, Object obj, Object obj2) {
        if (list == null) {
            list = new ArrayList<>(4);
            list.add(obj);
        }
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            if (it.next() == obj2) {
                throw new IllegalArgumentException("Circular reference in data structure");
            }
        }
        list.add(obj2);
        return list;
    }

    public static CBORObject Read(InputStream inputStream) {
        if (inputStream == null) {
            throw new NullPointerException("stream");
        }
        try {
            return new CBORReader(inputStream).Read();
        } catch (IOException e2) {
            throw new CBORException("I/O error occurred.", e2);
        }
    }

    public static CBORObject Read(InputStream inputStream, CBOREncodeOptions cBOREncodeOptions) {
        if (cBOREncodeOptions == null) {
            throw new NullPointerException(RRWebOptionsEvent.EVENT_TAG);
        }
        try {
            return new CBORReader(inputStream, cBOREncodeOptions).Read();
        } catch (IOException e2) {
            throw new CBORException("I/O error occurred.", e2);
        }
    }

    public static CBORObject ReadJSON(InputStream inputStream) throws IOException {
        return ReadJSON(inputStream, JSONOptions.Default);
    }

    @Deprecated
    public static CBORObject ReadJSON(InputStream inputStream, CBOREncodeOptions cBOREncodeOptions) throws IOException {
        if (inputStream == null) {
            throw new NullPointerException("stream");
        }
        if (cBOREncodeOptions != null) {
            return ReadJSON(inputStream, new JSONOptions(cBOREncodeOptions.getAllowDuplicateKeys() ? "allowduplicatekeys=1" : "allowduplicatekeys=0"));
        }
        throw new NullPointerException(RRWebOptionsEvent.EVENT_TAG);
    }

    public static CBORObject ReadJSON(InputStream inputStream, JSONOptions jSONOptions) throws IOException {
        if (inputStream == null) {
            throw new NullPointerException("stream");
        }
        if (jSONOptions == null) {
            throw new NullPointerException("jsonoptions");
        }
        CharacterInputWithCount characterInputWithCount = new CharacterInputWithCount(new CharacterReader(inputStream, 2, true));
        try {
            int[] iArr = new int[1];
            CBORObject cBORObjectParseJSONValue = CBORJson.ParseJSONValue(characterInputWithCount, jSONOptions, iArr);
            if (iArr[0] != -1) {
                characterInputWithCount.RaiseError("End of data stream not reached");
            }
            return cBORObjectParseJSONValue;
        } catch (CBORException e2) {
            IOException iOException = e2.getCause() instanceof IOException ? (IOException) e2.getCause() : null;
            if (iOException != null) {
                throw iOException;
            }
            throw e2;
        }
    }

    public static CBORObject[] ReadJSONSequence(InputStream inputStream) throws IOException {
        return ReadJSONSequence(inputStream, JSONOptions.Default);
    }

    public static CBORObject[] ReadJSONSequence(InputStream inputStream, JSONOptions jSONOptions) throws IOException {
        if (inputStream == null) {
            throw new NullPointerException("stream");
        }
        if (jSONOptions == null) {
            throw new NullPointerException("jsonoptions");
        }
        CharacterInputWithCount characterInputWithCount = new CharacterInputWithCount(new CharacterReader(inputStream, 0, true, true));
        try {
            int[] iArr = new int[1];
            CBORObject[] cBORObjectArrParseJSONSequence = CBORJson.ParseJSONSequence(characterInputWithCount, jSONOptions, iArr);
            if (iArr[0] != -1) {
                characterInputWithCount.RaiseError("End of data stream not reached");
            }
            return cBORObjectArrParseJSONSequence;
        } catch (CBORException e2) {
            IOException iOException = e2.getCause() instanceof IOException ? (IOException) e2.getCause() : null;
            if (iOException != null) {
                throw iOException;
            }
            throw e2;
        }
    }

    public static CBORObject[] ReadSequence(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            throw new NullPointerException("stream");
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            CBORObject cBORObjectRead = Read(inputStream, AllowEmptyOptions);
            if (cBORObjectRead == null) {
                return (CBORObject[]) arrayList.toArray(new CBORObject[0]);
            }
            arrayList.add(cBORObjectRead);
        }
    }

    public static CBORObject[] ReadSequence(InputStream inputStream, CBOREncodeOptions cBOREncodeOptions) throws IOException {
        if (inputStream == null) {
            throw new NullPointerException("stream");
        }
        if (cBOREncodeOptions == null) {
            throw new NullPointerException(RRWebOptionsEvent.EVENT_TAG);
        }
        if (!cBOREncodeOptions.getAllowEmpty()) {
            cBOREncodeOptions = new CBOREncodeOptions(cBOREncodeOptions.toString() + ";allowempty=1");
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            CBORObject cBORObjectRead = Read(inputStream, cBOREncodeOptions);
            if (cBORObjectRead == null) {
                return (CBORObject[]) arrayList.toArray(new CBORObject[0]);
            }
            arrayList.add(cBORObjectRead);
        }
    }

    @Deprecated
    public static CBORObject Remainder(CBORObject cBORObject, CBORObject cBORObject2) {
        if (cBORObject == null) {
            throw new NullPointerException("first");
        }
        if (cBORObject2 == null) {
            throw new NullPointerException("second");
        }
        CBORNumber cBORNumberFromCBORObject = CBORNumber.FromCBORObject(cBORObject);
        if (cBORNumberFromCBORObject == null) {
            throw new IllegalArgumentException("firstdoes not represent a number");
        }
        CBORNumber cBORNumberFromCBORObject2 = CBORNumber.FromCBORObject(cBORObject2);
        if (cBORNumberFromCBORObject2 != null) {
            return cBORNumberFromCBORObject.Remainder(cBORNumberFromCBORObject2).ToCBORObject();
        }
        throw new IllegalArgumentException("seconddoes not represent a number");
    }

    private static byte[] SerializeUtf8(byte[] bArr) {
        if (bArr.length < 24) {
            byte[] bArr2 = new byte[bArr.length + 1];
            bArr2[0] = (byte) (bArr.length | 96);
            System.arraycopy(bArr, 0, bArr2, 1, bArr.length);
            return bArr2;
        }
        if (bArr.length <= 255) {
            byte[] bArr3 = new byte[bArr.length + 2];
            bArr3[0] = 120;
            bArr3[1] = (byte) bArr.length;
            System.arraycopy(bArr, 0, bArr3, 2, bArr.length);
            return bArr3;
        }
        if (bArr.length > WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            byte[] bArrGetPositiveInt64Bytes = GetPositiveInt64Bytes(3, bArr.length);
            byte[] bArr4 = new byte[bArr.length + bArrGetPositiveInt64Bytes.length];
            System.arraycopy(bArrGetPositiveInt64Bytes, 0, bArr4, 0, bArrGetPositiveInt64Bytes.length);
            System.arraycopy(bArr, 0, bArr4, bArrGetPositiveInt64Bytes.length, bArr.length);
            return bArr4;
        }
        byte[] bArr5 = new byte[bArr.length + 3];
        bArr5[0] = 121;
        bArr5[1] = (byte) ((bArr.length >> 8) & 255);
        bArr5[2] = (byte) (bArr.length & 255);
        System.arraycopy(bArr, 0, bArr5, 3, bArr.length);
        return bArr5;
    }

    private static boolean StringEquals(String str, String str2) {
        if (str == str2) {
            return true;
        }
        if (str.length() != str2.length()) {
            return false;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != str2.charAt(i2)) {
                return false;
            }
        }
        return true;
    }

    @Deprecated
    public static CBORObject Subtract(CBORObject cBORObject, CBORObject cBORObject2) {
        if (cBORObject == null) {
            throw new NullPointerException("first");
        }
        if (cBORObject2 == null) {
            throw new NullPointerException("second");
        }
        CBORNumber cBORNumberFromCBORObject = CBORNumber.FromCBORObject(cBORObject);
        if (cBORNumberFromCBORObject == null) {
            throw new IllegalArgumentException("firstdoes not represent a number");
        }
        CBORNumber cBORNumberFromCBORObject2 = CBORNumber.FromCBORObject(cBORObject2);
        if (cBORNumberFromCBORObject2 != null) {
            return cBORNumberFromCBORObject.Subtract(cBORNumberFromCBORObject2).ToCBORObject();
        }
        throw new IllegalArgumentException("seconddoes not represent a number");
    }

    private static int TagsCompare(EInteger[] eIntegerArr, EInteger[] eIntegerArr2) {
        if (eIntegerArr == null) {
            return eIntegerArr2 == null ? 0 : -1;
        }
        if (eIntegerArr2 == null) {
            return 1;
        }
        int length = eIntegerArr.length;
        int length2 = eIntegerArr2.length;
        int iMin = Math.min(length, length2);
        for (int i2 = 0; i2 < iMin; i2++) {
            int iCompareTo = eIntegerArr[i2].compareTo(eIntegerArr2[i2]);
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        if (length != length2) {
            return length < length2 ? -1 : 1;
        }
        return 0;
    }

    public static void Write(byte b2, OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            throw new NullPointerException("stream");
        }
        if ((b2 + 255) - (255 | b2) < 24) {
            outputStream.write(b2);
        } else {
            outputStream.write(24);
            outputStream.write(b2);
        }
    }

    public static void Write(double d2, OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            throw new NullPointerException("stream");
        }
        WriteFloatingPointBits(outputStream, CBORUtilities.DoubleToInt64Bits(d2), 8, true);
    }

    public static void Write(float f2, OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            throw new NullPointerException("stream");
        }
        WriteFloatingPointBits(outputStream, CBORUtilities.SingleToInt32Bits(f2), 4, true);
    }

    public static void Write(int i2, OutputStream outputStream) throws IOException {
        int i3;
        if (outputStream == null) {
            throw new NullPointerException("stream");
        }
        if (i2 < 0) {
            i2 = -(i2 + 1);
            i3 = 32;
        } else {
            i3 = 0;
        }
        if (i2 < 24) {
            outputStream.write((byte) ((-1) - (((-1) - i2) & ((-1) - i3))));
            return;
        }
        if (i2 <= 255) {
            outputStream.write(new byte[]{(byte) ((i3 + 24) - (i3 & 24)), (byte) ((-1) - (((-1) - i2) | ((-1) - 255)))}, 0, 2);
        } else if (i2 <= 65535) {
            outputStream.write(new byte[]{(byte) ((i3 + 25) - (i3 & 25)), (byte) ((i2 >> 8) & 255), (byte) ((i2 + 255) - (i2 | 255))}, 0, 3);
        } else {
            int i4 = i2 >> 8;
            outputStream.write(new byte[]{(byte) (i3 | 26), (byte) ((-1) - (((-1) - (i2 >> 24)) | ((-1) - 255))), (byte) ((-1) - (((-1) - (i2 >> 16)) | ((-1) - 255))), (byte) ((i4 + 255) - (i4 | 255)), (byte) ((i2 + 255) - (i2 | 255))}, 0, 5);
        }
    }

    public static void Write(long j2, OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            throw new NullPointerException("stream");
        }
        if (j2 >= 0) {
            WritePositiveInt64(0, j2, outputStream);
        } else {
            WritePositiveInt64(1, -(j2 + 1), outputStream);
        }
    }

    public static void Write(CBORObject cBORObject, OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            throw new NullPointerException("stream");
        }
        if (cBORObject == null) {
            outputStream.write(246);
        } else {
            cBORObject.WriteTo(outputStream);
        }
    }

    public static void Write(EDecimal eDecimal, OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            throw new NullPointerException("stream");
        }
        if (eDecimal == null) {
            outputStream.write(246);
            return;
        }
        if (!eDecimal.isFinite() || (eDecimal.isNegative() && eDecimal.isZero())) {
            Write(FromObject(eDecimal), outputStream);
            return;
        }
        EInteger exponent = eDecimal.getExponent();
        if (!exponent.CanFitInInt64() && exponent.GetSignedBitLengthAsInt64() > 64) {
            outputStream.write(217);
            outputStream.write(1);
            outputStream.write(8);
            outputStream.write(130);
        } else {
            outputStream.write(196);
            outputStream.write(130);
        }
        Write(exponent, outputStream);
        Write(eDecimal.getMantissa(), outputStream);
    }

    public static void Write(EFloat eFloat, OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            throw new NullPointerException("stream");
        }
        if (eFloat == null) {
            outputStream.write(246);
            return;
        }
        if ((eFloat.isZero() && eFloat.isNegative()) || eFloat.IsInfinity() || eFloat.IsNaN()) {
            Write(FromObject(eFloat), outputStream);
            return;
        }
        EInteger exponent = eFloat.getExponent();
        if (!exponent.CanFitInInt64() && exponent.GetSignedBitLengthAsInt64() > 64) {
            outputStream.write(217);
            outputStream.write(1);
            outputStream.write(9);
            outputStream.write(130);
        } else {
            outputStream.write(197);
            outputStream.write(130);
        }
        Write(eFloat.getExponent(), outputStream);
        Write(eFloat.getMantissa(), outputStream);
    }

    public static void Write(EInteger eInteger, OutputStream outputStream) throws IOException {
        int i2;
        if (outputStream == null) {
            throw new NullPointerException("stream");
        }
        if (eInteger == null) {
            outputStream.write(246);
            return;
        }
        if (eInteger.signum() < 0) {
            eInteger = eInteger.Add(EInteger.FromInt32(1)).Negate();
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (eInteger.CanFitInInt64()) {
            WritePositiveInt64(i2, eInteger.ToInt64Checked(), outputStream);
            return;
        }
        byte[] bArrToBytes = eInteger.ToBytes(true);
        int length = bArrToBytes.length;
        while (length > 0 && bArrToBytes[length - 1] == 0) {
            length--;
        }
        if (length != 0) {
            int i3 = length >> 1;
            int i4 = length - 1;
            int i5 = 0;
            while (i5 < i3) {
                byte b2 = bArrToBytes[i5];
                bArrToBytes[i5] = bArrToBytes[i4];
                bArrToBytes[i4] = b2;
                i5++;
                i4--;
            }
        }
        switch (length) {
            case 0:
                outputStream.write((byte) (i2 << 5));
                return;
            case 1:
                WritePositiveInt(i2, (-1) - (((-1) - bArrToBytes[0]) | ((-1) - 255)), outputStream);
                return;
            case 2:
                outputStream.write((byte) ((i2 << 5) | 25));
                outputStream.write(bArrToBytes, 0, length);
                return;
            case 3:
                outputStream.write((byte) ((i2 << 5) | 26));
                outputStream.write(0);
                outputStream.write(bArrToBytes, 0, length);
                return;
            case 4:
                int i6 = i2 << 5;
                outputStream.write((byte) ((i6 + 26) - (i6 & 26)));
                outputStream.write(bArrToBytes, 0, length);
                return;
            case 5:
                outputStream.write((byte) ((i2 << 5) | 27));
                outputStream.write(0);
                outputStream.write(0);
                outputStream.write(0);
                outputStream.write(bArrToBytes, 0, length);
                return;
            case 6:
                outputStream.write((byte) ((-1) - (((-1) - (i2 << 5)) & ((-1) - 27))));
                outputStream.write(0);
                outputStream.write(0);
                outputStream.write(bArrToBytes, 0, length);
                return;
            case 7:
                outputStream.write((byte) ((-1) - (((-1) - (i2 << 5)) & ((-1) - 27))));
                outputStream.write(0);
                outputStream.write(bArrToBytes, 0, length);
                return;
            case 8:
                outputStream.write((byte) ((-1) - (((-1) - (i2 << 5)) & ((-1) - 27))));
                outputStream.write(bArrToBytes, 0, length);
                return;
            default:
                outputStream.write(i2 == 0 ? -62 : -61);
                WritePositiveInt(2, length, outputStream);
                outputStream.write(bArrToBytes, 0, length);
                return;
        }
    }

    public static void Write(ERational eRational, OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            throw new NullPointerException("stream");
        }
        if (eRational == null) {
            outputStream.write(246);
            return;
        }
        if (!eRational.isFinite() || (eRational.isNegative() && eRational.isZero())) {
            Write(FromObject(eRational), outputStream);
            return;
        }
        outputStream.write(JfifUtil.MARKER_SOI);
        outputStream.write(30);
        outputStream.write(130);
        Write(eRational.getNumerator(), outputStream);
        Write(eRational.getDenominator(), outputStream);
    }

    public static void Write(Object obj, OutputStream outputStream) throws IOException {
        Write(obj, outputStream, CBOREncodeOptions.Default);
    }

    public static void Write(Object obj, OutputStream outputStream, CBOREncodeOptions cBOREncodeOptions) throws IOException {
        if (cBOREncodeOptions == null) {
            throw new NullPointerException(RRWebOptionsEvent.EVENT_TAG);
        }
        if (outputStream == null) {
            throw new NullPointerException("output");
        }
        if (obj == null) {
            outputStream.write(246);
            return;
        }
        if (cBOREncodeOptions.getCtap2Canonical()) {
            FromObject(obj).WriteTo(outputStream, cBOREncodeOptions);
            return;
        }
        byte[] bArr = obj instanceof byte[] ? (byte[]) obj : null;
        if (bArr != null) {
            WritePositiveInt(3, bArr.length, outputStream);
            outputStream.write(bArr, 0, bArr.length);
        } else if (obj instanceof List) {
            WriteObjectArray((List) obj, outputStream, cBOREncodeOptions);
        } else if (obj instanceof Map) {
            WriteObjectMap((Map) obj, outputStream, cBOREncodeOptions);
        } else {
            FromObject(obj).WriteTo(outputStream, cBOREncodeOptions);
        }
    }

    public static void Write(String str, OutputStream outputStream) throws IOException {
        Write(str, outputStream, CBOREncodeOptions.Default);
    }

    public static void Write(String str, OutputStream outputStream, CBOREncodeOptions cBOREncodeOptions) throws IOException {
        if (outputStream == null) {
            throw new NullPointerException("stream");
        }
        if (cBOREncodeOptions == null) {
            throw new NullPointerException(RRWebOptionsEvent.EVENT_TAG);
        }
        if (str == null) {
            outputStream.write(246);
        } else if (cBOREncodeOptions.getUseIndefLengthStrings() && !cBOREncodeOptions.getCtap2Canonical()) {
            WriteStreamedString(str, outputStream);
        } else {
            WritePositiveInt64(3, DataUtilities.GetUtf8Length(str, true), outputStream);
            DataUtilities.WriteUtf8(str, outputStream, true);
        }
    }

    public static void Write(short s2, OutputStream outputStream) throws IOException {
        Write(s2, outputStream);
    }

    public static void Write(boolean z2, OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            throw new NullPointerException("stream");
        }
        outputStream.write(z2 ? -11 : -12);
    }

    private static List<Object> WriteChildObject(Object obj, CBORObject cBORObject, OutputStream outputStream, List<Object> list, CBOREncodeOptions cBOREncodeOptions) throws IOException {
        if (cBORObject == null) {
            outputStream.write(246);
            return list;
        }
        int itemType = cBORObject.getItemType();
        if (itemType == 4) {
            List<Object> listPushObject = PushObject(list, obj, cBORObject.getThisItem());
            cBORObject.WriteTags(outputStream);
            WriteObjectArray(cBORObject.AsList(), outputStream, listPushObject, cBOREncodeOptions);
            listPushObject.remove(listPushObject.size() - 1);
            return listPushObject;
        }
        if (itemType != 5) {
            cBORObject.WriteTo(outputStream, cBOREncodeOptions);
            return list;
        }
        List<Object> listPushObject2 = PushObject(list, obj, cBORObject.getThisItem());
        cBORObject.WriteTags(outputStream);
        WriteObjectMap(cBORObject.AsMap(), outputStream, listPushObject2, cBOREncodeOptions);
        listPushObject2.remove(listPushObject2.size() - 1);
        return listPushObject2;
    }

    public static int WriteFloatingPointBits(OutputStream outputStream, long j2, int i2) throws IOException {
        return WriteFloatingPointBits(outputStream, j2, i2, false);
    }

    public static int WriteFloatingPointBits(OutputStream outputStream, long j2, int i2, boolean z2) throws IOException {
        int iSingleToHalfPrecisionIfSameValue;
        if (outputStream == null) {
            throw new NullPointerException("outputStream");
        }
        if (z2) {
            if (i2 == 8) {
                int iDoubleToHalfPrecisionIfSameValue = CBORUtilities.DoubleToHalfPrecisionIfSameValue(j2);
                if (iDoubleToHalfPrecisionIfSameValue != -1) {
                    return WriteFloatingPointBits(outputStream, iDoubleToHalfPrecisionIfSameValue, 2, false);
                }
                if (CBORUtilities.DoubleRetainsSameValueInSingle(j2)) {
                    return WriteFloatingPointBits(outputStream, CBORUtilities.DoubleToRoundedSinglePrecision(j2), 4, false);
                }
            } else if (i2 == 4 && (iSingleToHalfPrecisionIfSameValue = CBORUtilities.SingleToHalfPrecisionIfSameValue(j2)) != -1) {
                return WriteFloatingPointBits(outputStream, iSingleToHalfPrecisionIfSameValue, 2, false);
            }
        }
        if (i2 == 2) {
            outputStream.write(new byte[]{-7, (byte) ((-1) - (((-1) - (j2 >> 8)) | ((-1) - 255))), (byte) ((j2 + 255) - (j2 | 255))}, 0, 3);
            return 3;
        }
        if (i2 != 4) {
            if (i2 != 8) {
                throw new IllegalArgumentException("byteCount");
            }
            long j3 = j2 >> 56;
            outputStream.write(new byte[]{-5, (byte) ((j3 + 255) - (j3 | 255)), (byte) ((j2 >> 48) & 255), (byte) ((-1) - (((-1) - (j2 >> 40)) | ((-1) - 255))), (byte) ((-1) - (((-1) - (j2 >> 32)) | ((-1) - 255))), (byte) ((-1) - (((-1) - (j2 >> 24)) | ((-1) - 255))), (byte) ((j2 >> 16) & 255), (byte) ((j2 >> 8) & 255), (byte) ((j2 + 255) - (j2 | 255))}, 0, 9);
            return 9;
        }
        long j4 = j2 >> 24;
        byte b2 = (byte) ((j4 + 255) - (j4 | 255));
        long j5 = j2 >> 16;
        byte b3 = (byte) ((j5 + 255) - (j5 | 255));
        long j6 = j2 >> 8;
        outputStream.write(new byte[]{-6, b2, b3, (byte) ((j6 + 255) - (j6 | 255)), (byte) (j2 & 255)}, 0, 5);
        return 5;
    }

    public static int WriteFloatingPointValue(OutputStream outputStream, double d2, int i2) throws IOException {
        if (outputStream == null) {
            throw new NullPointerException("outputStream");
        }
        if (i2 == 2) {
            return WriteFloatingPointBits(outputStream, (-1) - (((-1) - ((long) CBORUtilities.DoubleToRoundedHalfPrecision(CBORUtilities.DoubleToInt64Bits(d2)))) | ((-1) - WebSocketProtocol.PAYLOAD_SHORT_MAX)), 2);
        }
        if (i2 == 4) {
            return WriteFloatingPointBits(outputStream, (-1) - (((-1) - ((long) CBORUtilities.DoubleToRoundedSinglePrecision(CBORUtilities.DoubleToInt64Bits(d2)))) | ((-1) - 4294967295L)), 4);
        }
        if (i2 == 8) {
            return WriteFloatingPointBits(outputStream, CBORUtilities.DoubleToInt64Bits(d2), 8);
        }
        throw new IllegalArgumentException("byteCount");
    }

    public static int WriteFloatingPointValue(OutputStream outputStream, float f2, int i2) throws IOException {
        if (outputStream == null) {
            throw new NullPointerException("outputStream");
        }
        if (i2 == 2) {
            return WriteFloatingPointBits(outputStream, (-1) - (((-1) - CBORUtilities.SingleToRoundedHalfPrecision(Float.floatToRawIntBits(f2))) | ((-1) - 65535)), 2);
        }
        if (i2 == 4) {
            long jFloatToRawIntBits = Float.floatToRawIntBits(f2);
            return WriteFloatingPointBits(outputStream, (jFloatToRawIntBits + 4294967295L) - (jFloatToRawIntBits | 4294967295L), 4);
        }
        if (i2 == 8) {
            return WriteFloatingPointBits(outputStream, CBORUtilities.SingleToDoublePrecision(Float.floatToRawIntBits(f2)), 8);
        }
        throw new IllegalArgumentException("byteCount");
    }

    public static void WriteJSON(Object obj, OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            throw new NullPointerException("outputStream");
        }
        if (obj == null) {
            byte[] bArr = ValueNullBytes;
            outputStream.write(bArr, 0, bArr.length);
        } else if (!(obj instanceof Boolean)) {
            FromObject(obj).WriteJSONTo(outputStream);
        } else if (((Boolean) obj).booleanValue()) {
            byte[] bArr2 = ValueTrueBytes;
            outputStream.write(bArr2, 0, bArr2.length);
        } else {
            byte[] bArr3 = ValueFalseBytes;
            outputStream.write(bArr3, 0, bArr3.length);
        }
    }

    private static void WriteObjectArray(List<CBORObject> list, OutputStream outputStream, CBOREncodeOptions cBOREncodeOptions) throws IOException {
        WriteObjectArray(list, outputStream, null, cBOREncodeOptions);
    }

    private static void WriteObjectArray(List<CBORObject> list, OutputStream outputStream, List<Object> list2, CBOREncodeOptions cBOREncodeOptions) throws IOException {
        WritePositiveInt(4, list.size(), outputStream);
        Iterator<CBORObject> it = list.iterator();
        while (it.hasNext()) {
            list2 = WriteChildObject(list, it.next(), outputStream, list2, cBOREncodeOptions);
        }
    }

    private static void WriteObjectMap(Map<CBORObject, CBORObject> map, OutputStream outputStream, CBOREncodeOptions cBOREncodeOptions) throws IOException {
        WriteObjectMap(map, outputStream, null, cBOREncodeOptions);
    }

    private static void WriteObjectMap(Map<CBORObject, CBORObject> map, OutputStream outputStream, List<Object> list, CBOREncodeOptions cBOREncodeOptions) throws IOException {
        WritePositiveInt(5, map.size(), outputStream);
        for (Map.Entry<CBORObject, CBORObject> entry : map.entrySet()) {
            list = WriteChildObject(map, entry.getValue(), outputStream, WriteChildObject(map, entry.getKey(), outputStream, list, cBOREncodeOptions), cBOREncodeOptions);
        }
    }

    private static int WritePositiveInt(int i2, int i3, OutputStream outputStream) throws IOException {
        byte[] bArrGetPositiveIntBytes = GetPositiveIntBytes(i2, i3);
        outputStream.write(bArrGetPositiveIntBytes, 0, bArrGetPositiveIntBytes.length);
        return bArrGetPositiveIntBytes.length;
    }

    private static int WritePositiveInt64(int i2, long j2, OutputStream outputStream) throws IOException {
        byte[] bArrGetPositiveInt64Bytes = GetPositiveInt64Bytes(i2, j2);
        outputStream.write(bArrGetPositiveInt64Bytes, 0, bArrGetPositiveInt64Bytes.length);
        return bArrGetPositiveInt64Bytes.length;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void WriteStreamedString(java.lang.String r15, java.io.OutputStream r16) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.cbor.CBORObject.WriteStreamedString(java.lang.String, java.io.OutputStream):void");
    }

    private void WriteTags(OutputStream outputStream) throws IOException {
        for (CBORObject cBORObject = this; cBORObject.isTagged(); cBORObject = (CBORObject) cBORObject.itemValue) {
            int i2 = cBORObject.tagLow;
            int i3 = cBORObject.tagHigh;
            if (i3 == 0 && (i2 >> 16) == 0) {
                WritePositiveInt(6, i2, outputStream);
            } else if (i3 == 0) {
                long j2 = i2;
                WritePositiveInt64(6, (j2 + 4294967295L) - (j2 | 4294967295L), outputStream);
            } else {
                int i4 = i3 >> 16;
                if (i4 == 0) {
                    long j3 = i2;
                    long j4 = (j3 + 4294967295L) - (j3 | 4294967295L);
                    long j5 = (((long) i3) & 4294967295L) << 32;
                    WritePositiveInt64(6, (j5 + j4) - (j5 & j4), outputStream);
                } else {
                    byte b2 = (byte) (i4 & 255);
                    int i5 = i3 >> 8;
                    int i6 = i2 >> 16;
                    outputStream.write(new byte[]{MessagePack.Code.STR32, (byte) ((-1) - (((-1) - (i3 >> 24)) | ((-1) - 255))), b2, (byte) ((i5 + 255) - (i5 | 255)), (byte) (i3 & 255), (byte) ((-1) - (((-1) - (i2 >> 24)) | ((-1) - 255))), (byte) ((i6 + 255) - (i6 | 255)), (byte) ((-1) - (((-1) - (i2 >> 8)) | ((-1) - 255))), (byte) (i2 & 255)}, 0, 9);
                }
            }
        }
    }

    public static int WriteValue(OutputStream outputStream, int i2, int i3) throws IOException {
        if (outputStream == null) {
            throw new NullPointerException("outputStream");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("majorType(" + i2 + ") is less than 0");
        }
        if (i2 > 7) {
            throw new IllegalArgumentException("majorType(" + i2 + ") is more than 7");
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("value(" + i3 + ") is less than 0");
        }
        if (i2 != 7) {
            return WritePositiveInt(i2, i3, outputStream);
        }
        if (i3 > 255) {
            throw new IllegalArgumentException("value(" + i3 + ") is more than 255");
        }
        if (i3 <= 23) {
            outputStream.write((byte) (i3 + CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY));
            return 1;
        }
        if (i3 < 32) {
            throw new IllegalArgumentException("value is from 24 to 31 and major type is 7");
        }
        outputStream.write(-8);
        outputStream.write((byte) i3);
        return 2;
    }

    public static int WriteValue(OutputStream outputStream, int i2, long j2) throws IOException {
        if (outputStream == null) {
            throw new NullPointerException("outputStream");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("majorType(" + i2 + ") is less than 0");
        }
        if (i2 > 7) {
            throw new IllegalArgumentException("majorType(" + i2 + ") is more than 7");
        }
        if (j2 < 0) {
            throw new IllegalArgumentException("value(" + j2 + ") is less than 0");
        }
        if (i2 != 7) {
            return WritePositiveInt64(i2, j2, outputStream);
        }
        if (j2 > 255) {
            throw new IllegalArgumentException("value(" + j2 + ") is more than 255");
        }
        if (j2 <= 23) {
            outputStream.write((byte) (((int) j2) + CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY));
            return 1;
        }
        if (j2 < 32) {
            throw new IllegalArgumentException("value is from 24 to 31 and major type is 7");
        }
        outputStream.write(-8);
        outputStream.write((byte) j2);
        return 2;
    }

    public static int WriteValue(OutputStream outputStream, int i2, EInteger eInteger) throws IOException {
        if (outputStream == null) {
            throw new NullPointerException("outputStream");
        }
        if (eInteger == null) {
            throw new NullPointerException("bigintValue");
        }
        if (eInteger.signum() < 0) {
            throw new IllegalArgumentException("tagEInt's sign(" + eInteger.signum() + ") is less than 0");
        }
        if (eInteger.compareTo(UInt64MaxValue) > 0) {
            throw new IllegalArgumentException("tag more than 18446744073709551615 (" + eInteger + ")");
        }
        if (eInteger.CanFitInInt64()) {
            return WriteValue(outputStream, i2, eInteger.ToInt64Checked());
        }
        long jToInt64Unchecked = eInteger.ToInt64Unchecked();
        long j2 = jToInt64Unchecked >> 56;
        int i3 = (int) ((j2 + 255) - (j2 | 255));
        if (i2 < 0) {
            throw new IllegalArgumentException("majorType(" + i2 + ") is less than 0");
        }
        if (i2 > 7) {
            throw new IllegalArgumentException("majorType(" + i2 + ") is more than 7");
        }
        if (i2 == 7) {
            throw new IllegalArgumentException("majorType is 7 and value is greater than 255");
        }
        long j3 = jToInt64Unchecked >> 32;
        outputStream.write(new byte[]{(byte) ((i2 << 5) | 27), (byte) i3, (byte) ((jToInt64Unchecked >> 48) & 255), (byte) ((-1) - (((-1) - (jToInt64Unchecked >> 40)) | ((-1) - 255))), (byte) ((j3 + 255) - (j3 | 255)), (byte) ((jToInt64Unchecked >> 24) & 255), (byte) ((jToInt64Unchecked >> 16) & 255), (byte) ((jToInt64Unchecked >> 8) & 255), (byte) ((jToInt64Unchecked + 255) - (jToInt64Unchecked | 255))}, 0, 9);
        return 9;
    }

    private final int getItemType() {
        CBORObject cBORObject = this;
        while (true) {
            int i2 = cBORObject.itemtypeValue;
            if (i2 != 6) {
                return i2;
            }
            cBORObject = (CBORObject) cBORObject.itemValue;
        }
    }

    private final Object getThisItem() {
        CBORObject cBORObject = this;
        while (cBORObject.itemtypeValue == 6) {
            cBORObject = (CBORObject) cBORObject.itemValue;
        }
        return cBORObject.itemValue;
    }

    @Deprecated
    public CBORObject Abs() {
        CBORNumber cBORNumberFromCBORObject = CBORNumber.FromCBORObject(this);
        if (cBORNumberFromCBORObject == null) {
            throw new IllegalStateException("This Object is not a number.");
        }
        Object objGetValue = cBORNumberFromCBORObject.GetValue();
        Object objAbs = cBORNumberFromCBORObject.GetNumberInterface().Abs(objGetValue);
        if (objGetValue == objAbs) {
            return this;
        }
        if (objAbs instanceof EDecimal) {
            return FromObject((EDecimal) objAbs);
        }
        if (objAbs instanceof EInteger) {
            return FromObject((EInteger) objAbs);
        }
        if (objAbs instanceof EFloat) {
            return FromObject((EFloat) objAbs);
        }
        ERational eRational = objAbs instanceof ERational ? (ERational) objAbs : null;
        return eRational != null ? FromObject(eRational) : objGetValue == objAbs ? this : FromObject(objAbs);
    }

    public CBORObject Add(CBORObject cBORObject) {
        if (getType() != CBORType.Array) {
            throw new IllegalStateException("Not an array");
        }
        AsList().add(cBORObject);
        return this;
    }

    public CBORObject Add(Object obj) {
        if (getType() != CBORType.Array) {
            throw new IllegalStateException("Not an array");
        }
        AsList().add(FromObject(obj));
        return this;
    }

    public CBORObject Add(Object obj, Object obj2) {
        CBORObject cBORObjectFromObject;
        CBORObject cBORObjectFromObject2;
        if (getType() != CBORType.Map) {
            throw new IllegalStateException("Not a map");
        }
        if (obj == null) {
            cBORObjectFromObject = Null;
        } else {
            cBORObjectFromObject = obj instanceof CBORObject ? (CBORObject) obj : null;
            if (cBORObjectFromObject == null) {
                cBORObjectFromObject = FromObject(obj);
            }
        }
        if (obj2 == null) {
            cBORObjectFromObject2 = Null;
        } else {
            cBORObjectFromObject2 = obj2 instanceof CBORObject ? (CBORObject) obj2 : null;
            if (cBORObjectFromObject2 == null) {
                cBORObjectFromObject2 = FromObject(obj2);
            }
        }
        Map<CBORObject, CBORObject> mapAsMap = AsMap();
        if (mapAsMap.containsKey(cBORObjectFromObject)) {
            throw new IllegalArgumentException("Key already exists");
        }
        mapAsMap.put(cBORObjectFromObject, cBORObjectFromObject2);
        return this;
    }

    public CBORObject ApplyJSONPatch(CBORObject cBORObject) {
        return JSONPatch.Patch(this, cBORObject);
    }

    public boolean AsBoolean() {
        return (isFalse() || isNull() || isUndefined()) ? false : true;
    }

    @Deprecated
    public byte AsByte() {
        return (byte) AsInt32(0, 255);
    }

    byte AsByteLegacy() {
        return (byte) AsInt32(0, 255);
    }

    public double AsDouble() {
        CBORNumber cBORNumberFromCBORObject = CBORNumber.FromCBORObject(this);
        if (cBORNumberFromCBORObject != null) {
            return cBORNumberFromCBORObject.GetNumberInterface().AsDouble(cBORNumberFromCBORObject.GetValue());
        }
        throw new IllegalStateException("Not a number type");
    }

    public long AsDoubleBits() {
        if (AnonymousClass1.$SwitchMap$com$upokecenter$cbor$CBORType[getType().ordinal()] == 2) {
            return ((Long) getThisItem()).longValue();
        }
        throw new IllegalStateException("Not a floating-point type");
    }

    public double AsDoubleValue() {
        if (AnonymousClass1.$SwitchMap$com$upokecenter$cbor$CBORType[getType().ordinal()] == 2) {
            return CBORUtilities.Int64BitsToDouble(((Long) getThisItem()).longValue());
        }
        throw new IllegalStateException("Not a floating-point type");
    }

    @Deprecated
    public EDecimal AsEDecimal() {
        return (EDecimal) ToObject(EDecimal.class);
    }

    @Deprecated
    public EFloat AsEFloat() {
        return (EFloat) ToObject(EFloat.class);
    }

    @Deprecated
    public EInteger AsEInteger() {
        return (EInteger) ToObject(EInteger.class);
    }

    public EInteger AsEIntegerValue() {
        int itemType = getItemType();
        if (itemType == 0) {
            return EInteger.FromInt64(((Long) getThisItem()).longValue());
        }
        if (itemType == 1) {
            return (EInteger) getThisItem();
        }
        throw new IllegalStateException("Not an integer type");
    }

    @Deprecated
    public ERational AsERational() {
        return (ERational) ToObject(ERational.class);
    }

    @Deprecated
    public short AsInt16() {
        return (short) AsInt32(-32768, LayoutKt.LargeDimension);
    }

    public int AsInt32() {
        return AsInt32(Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public int AsInt32Value() {
        int itemType = getItemType();
        if (itemType != 0) {
            if (itemType == 1) {
                return ((EInteger) getThisItem()).ToInt32Checked();
            }
            throw new IllegalStateException("Not an integer type");
        }
        long jLongValue = ((Long) getThisItem()).longValue();
        if (jLongValue < -2147483648L || jLongValue > 2147483647L) {
            throw new ArithmeticException();
        }
        return (int) jLongValue;
    }

    @Deprecated
    public long AsInt64() {
        CBORNumber cBORNumberAsNumber = AsNumber();
        return cBORNumberAsNumber.GetNumberInterface().AsInt64(cBORNumberAsNumber.GetValue());
    }

    public long AsInt64Value() {
        int itemType = getItemType();
        if (itemType == 0) {
            return ((Long) getThisItem()).longValue();
        }
        if (itemType == 1) {
            return ((EInteger) getThisItem()).ToInt64Checked();
        }
        throw new IllegalStateException("Not an integer type");
    }

    public CBORNumber AsNumber() {
        CBORNumber cBORNumberFromCBORObject = CBORNumber.FromCBORObject(this);
        if (cBORNumberFromCBORObject != null) {
            return cBORNumberFromCBORObject;
        }
        throw new IllegalStateException("Not a number type");
    }

    public float AsSingle() {
        CBORNumber cBORNumberAsNumber = AsNumber();
        return cBORNumberAsNumber.GetNumberInterface().AsSingle(cBORNumberAsNumber.GetValue());
    }

    public String AsString() {
        int itemType = getItemType();
        if (itemType != 3) {
            if (itemType == 9) {
                return DataUtilities.GetUtf8String((byte[]) getThisItem(), false);
            }
            if (itemType != 10) {
                throw new IllegalStateException("Not a text String type");
            }
        }
        return (String) getThisItem();
    }

    public CBORObject AtJSONPointer(String str) {
        CBORObject cBORObjectAtJSONPointer = AtJSONPointer(str, null);
        if (cBORObjectAtJSONPointer != null) {
            return cBORObjectAtJSONPointer;
        }
        throw new CBORException("Invalid JSON pointer");
    }

    public CBORObject AtJSONPointer(String str, CBORObject cBORObject) {
        return JSONPointer.GetObject(this, str, null);
    }

    public long CalcEncodedSize() {
        return CalcEncodedSize(0);
    }

    @Deprecated
    public boolean CanFitInDouble() {
        CBORNumber cBORNumberFromCBORObject = CBORNumber.FromCBORObject(this);
        return cBORNumberFromCBORObject != null && cBORNumberFromCBORObject.GetNumberInterface().CanFitInDouble(cBORNumberFromCBORObject.GetValue());
    }

    @Deprecated
    public boolean CanFitInInt32() {
        if (!CanFitInInt64()) {
            return false;
        }
        long jAsInt64 = AsInt64();
        return jAsInt64 >= -2147483648L && jAsInt64 <= 2147483647L;
    }

    @Deprecated
    public boolean CanFitInInt64() {
        CBORNumber cBORNumberFromCBORObject = CBORNumber.FromCBORObject(this);
        return cBORNumberFromCBORObject != null && cBORNumberFromCBORObject.GetNumberInterface().CanFitInInt64(cBORNumberFromCBORObject.GetValue());
    }

    @Deprecated
    public boolean CanFitInSingle() {
        CBORNumber cBORNumberFromCBORObject = CBORNumber.FromCBORObject(this);
        return cBORNumberFromCBORObject != null && cBORNumberFromCBORObject.GetNumberInterface().CanFitInSingle(cBORNumberFromCBORObject.GetValue());
    }

    @Deprecated
    public boolean CanTruncatedIntFitInInt32() {
        CBORNumber cBORNumberFromCBORObject = CBORNumber.FromCBORObject(this);
        return cBORNumberFromCBORObject != null && cBORNumberFromCBORObject.GetNumberInterface().CanTruncatedIntFitInInt32(cBORNumberFromCBORObject.GetValue());
    }

    @Deprecated
    public boolean CanTruncatedIntFitInInt64() {
        CBORNumber cBORNumberFromCBORObject = CBORNumber.FromCBORObject(this);
        return cBORNumberFromCBORObject != null && cBORNumberFromCBORObject.GetNumberInterface().CanTruncatedIntFitInInt64(cBORNumberFromCBORObject.GetValue());
    }

    public boolean CanValueFitInInt32() {
        int itemType = getItemType();
        if (itemType == 0) {
            long jLongValue = ((Long) getThisItem()).longValue();
            return jLongValue >= -2147483648L && jLongValue <= 2147483647L;
        }
        if (itemType != 1) {
            return false;
        }
        return ((EInteger) getThisItem()).CanFitInInt32();
    }

    public boolean CanValueFitInInt64() {
        int itemType = getItemType();
        if (itemType == 0) {
            return true;
        }
        if (itemType != 1) {
            return false;
        }
        return ((EInteger) getThisItem()).CanFitInInt64();
    }

    public void Clear() {
        if (getType() == CBORType.Array) {
            AsList().clear();
        } else {
            if (getType() != CBORType.Map) {
                throw new IllegalStateException("Not a map or array");
            }
            AsMap().clear();
        }
    }

    public int CompareToIgnoreTags(CBORObject cBORObject) {
        if (cBORObject == null) {
            return 1;
        }
        if (this == cBORObject) {
            return 0;
        }
        return Untag().compareTo(cBORObject.Untag());
    }

    public boolean ContainsKey(CBORObject cBORObject) {
        if (cBORObject == null) {
            cBORObject = Null;
        }
        if (getType() == CBORType.Map) {
            return AsMap().containsKey(cBORObject);
        }
        return false;
    }

    public boolean ContainsKey(Object obj) {
        if (getType() == CBORType.Map) {
            return ContainsKey(FromObject(obj));
        }
        return false;
    }

    public boolean ContainsKey(String str) {
        if (getType() == CBORType.Map) {
            return AsMap().containsKey(str == null ? Null : FromObject(str));
        }
        return false;
    }

    public byte[] EncodeToBytes() {
        return EncodeToBytes(CBOREncodeOptions.Default);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte[] EncodeToBytes(com.upokecenter.cbor.CBOREncodeOptions r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.cbor.CBORObject.EncodeToBytes(com.upokecenter.cbor.CBOREncodeOptions):byte[]");
    }

    public EInteger[] GetAllTags() {
        if (!isTagged()) {
            return ValueEmptyTags;
        }
        if (!isTagged()) {
            return new EInteger[]{LowHighToEInteger(this.tagLow, this.tagHigh)};
        }
        ArrayList arrayList = new ArrayList();
        for (CBORObject cBORObject = this; cBORObject.isTagged(); cBORObject = (CBORObject) cBORObject.itemValue) {
            arrayList.add(LowHighToEInteger(cBORObject.tagLow, cBORObject.tagHigh));
        }
        return (EInteger[]) arrayList.toArray(new EInteger[0]);
    }

    public byte[] GetByteString() {
        if (getItemType() == 2) {
            return (byte[]) getThisItem();
        }
        throw new IllegalStateException("Not a byte String");
    }

    public CBORObject GetOrDefault(Object obj, CBORObject cBORObject) {
        int iToInt32Checked;
        if (getType() != CBORType.Array) {
            return getType() == CBORType.Map ? (CBORObject) PropertyMap.GetOrDefault(AsMap(), FromObject(obj), cBORObject) : cBORObject;
        }
        if (obj instanceof Integer) {
            iToInt32Checked = ((Integer) obj).intValue();
        } else {
            CBORObject cBORObjectFromObject = FromObject(obj);
            if (!cBORObjectFromObject.isNumber() || !cBORObjectFromObject.AsNumber().CanFitInInt32()) {
                return cBORObject;
            }
            iToInt32Checked = cBORObjectFromObject.AsNumber().ToInt32Checked();
        }
        List<CBORObject> listAsList = AsList();
        return (iToInt32Checked < 0 || iToInt32Checked >= listAsList.size()) ? cBORObject : listAsList.get(iToInt32Checked);
    }

    public boolean HasMostInnerTag(int i2) {
        if (i2 >= 0) {
            return isTagged() && HasMostInnerTag(EInteger.FromInt32(i2));
        }
        throw new IllegalArgumentException("tagValue(" + i2 + ") is less than 0");
    }

    public boolean HasMostInnerTag(EInteger eInteger) {
        if (eInteger == null) {
            throw new NullPointerException("bigTagValue");
        }
        if (eInteger.signum() < 0) {
            throw new IllegalArgumentException("bigTagValue(" + eInteger + ") is less than 0");
        }
        if (isTagged()) {
            return getMostInnerTag().equals(eInteger);
        }
        return false;
    }

    public boolean HasMostOuterTag(int i2) {
        if (i2 >= 0) {
            return isTagged() && this.tagHigh == 0 && this.tagLow == i2;
        }
        throw new IllegalArgumentException("tagValue(" + i2 + ") is less than 0");
    }

    public boolean HasMostOuterTag(EInteger eInteger) {
        if (eInteger == null) {
            throw new NullPointerException("bigTagValue");
        }
        if (eInteger.signum() < 0) {
            throw new IllegalArgumentException("bigTagValue(" + eInteger + ") is less than 0");
        }
        if (isTagged()) {
            return getMostOuterTag().equals(eInteger);
        }
        return false;
    }

    public boolean HasOneTag() {
        return isTagged() && !((CBORObject) this.itemValue).isTagged();
    }

    public boolean HasOneTag(int i2) {
        return HasOneTag() && HasMostOuterTag(i2);
    }

    public boolean HasOneTag(EInteger eInteger) {
        return HasOneTag() && HasMostOuterTag(eInteger);
    }

    public boolean HasTag(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("tagValue(" + i2 + ") is less than 0");
        }
        for (CBORObject cBORObject = this; cBORObject.isTagged(); cBORObject = (CBORObject) cBORObject.itemValue) {
            if (cBORObject.tagHigh == 0 && i2 == cBORObject.tagLow) {
                return true;
            }
        }
        return false;
    }

    public boolean HasTag(EInteger eInteger) {
        if (eInteger == null) {
            throw new NullPointerException("bigTagValue");
        }
        if (eInteger.signum() < 0) {
            throw new IllegalArgumentException("doesn't satisfy bigTagValue.signum()>= 0");
        }
        for (EInteger eInteger2 : GetAllTags()) {
            if (eInteger.equals(eInteger2)) {
                return true;
            }
        }
        return false;
    }

    public CBORObject Insert(int i2, Object obj) {
        CBORObject cBORObjectFromObject;
        if (getType() != CBORType.Array) {
            throw new IllegalStateException("Not an array");
        }
        List<CBORObject> listAsList = AsList();
        if (i2 < 0 || i2 > listAsList.size()) {
            throw new IllegalArgumentException(FirebaseAnalytics.Param.INDEX);
        }
        if (obj == null) {
            cBORObjectFromObject = Null;
        } else {
            cBORObjectFromObject = obj instanceof CBORObject ? (CBORObject) obj : null;
            if (cBORObjectFromObject == null) {
                cBORObjectFromObject = FromObject(obj);
            }
        }
        listAsList.add(i2, cBORObjectFromObject);
        return this;
    }

    @Deprecated
    public boolean IsInfinity() {
        return isNumber() && AsNumber().IsInfinity();
    }

    @Deprecated
    public boolean IsNaN() {
        return isNumber() && AsNumber().IsNaN();
    }

    @Deprecated
    public boolean IsNegativeInfinity() {
        CBORNumber cBORNumberFromCBORObject = CBORNumber.FromCBORObject(this);
        return cBORNumberFromCBORObject != null && cBORNumberFromCBORObject.GetNumberInterface().IsNegativeInfinity(cBORNumberFromCBORObject.GetValue());
    }

    @Deprecated
    public boolean IsPositiveInfinity() {
        CBORNumber cBORNumberFromCBORObject = CBORNumber.FromCBORObject(this);
        return cBORNumberFromCBORObject != null && cBORNumberFromCBORObject.GetNumberInterface().IsPositiveInfinity(cBORNumberFromCBORObject.GetValue());
    }

    @Deprecated
    public CBORObject Negate() {
        CBORNumber cBORNumberFromCBORObject = CBORNumber.FromCBORObject(this);
        if (cBORNumberFromCBORObject == null) {
            throw new IllegalStateException("This Object is not a number.");
        }
        Object objNegate = cBORNumberFromCBORObject.GetNumberInterface().Negate(cBORNumberFromCBORObject.GetValue());
        if (objNegate instanceof EDecimal) {
            return FromObject((EDecimal) objNegate);
        }
        if (objNegate instanceof EInteger) {
            return FromObject((EInteger) objNegate);
        }
        if (objNegate instanceof EFloat) {
            return FromObject((EFloat) objNegate);
        }
        ERational eRational = objNegate instanceof ERational ? (ERational) objNegate : null;
        return eRational != null ? FromObject(eRational) : FromObject(objNegate);
    }

    public boolean Remove(CBORObject cBORObject) {
        if (cBORObject == null) {
            throw new NullPointerException("obj");
        }
        if (getType() != CBORType.Map) {
            if (getType() == CBORType.Array) {
                return AsList().remove(cBORObject);
            }
            throw new IllegalStateException("Not a map or array");
        }
        Map<CBORObject, CBORObject> mapAsMap = AsMap();
        if (!mapAsMap.containsKey(cBORObject)) {
            return false;
        }
        mapAsMap.remove(cBORObject);
        return true;
    }

    public boolean Remove(Object obj) {
        return Remove(FromObject(obj));
    }

    public boolean RemoveAt(int i2) {
        if (getItemType() != 4) {
            throw new IllegalStateException("Not an array");
        }
        if (i2 < 0 || i2 >= size()) {
            return false;
        }
        AsList().remove(i2);
        return true;
    }

    public CBORObject Set(Object obj, Object obj2) {
        CBORObject cBORObjectFromObject;
        CBORObject cBORObjectFromObject2;
        if (getType() == CBORType.Map) {
            if (obj == null) {
                cBORObjectFromObject2 = Null;
            } else {
                cBORObjectFromObject2 = obj instanceof CBORObject ? (CBORObject) obj : null;
                if (cBORObjectFromObject2 == null) {
                    cBORObjectFromObject2 = FromObject(obj);
                }
            }
            if (obj2 == null) {
                cBORObjectFromObject = Null;
            } else {
                cBORObjectFromObject = obj2 instanceof CBORObject ? (CBORObject) obj2 : null;
                if (cBORObjectFromObject == null) {
                    cBORObjectFromObject = FromObject(obj2);
                }
            }
            Map<CBORObject, CBORObject> mapAsMap = AsMap();
            if (mapAsMap.containsKey(cBORObjectFromObject2)) {
                mapAsMap.put(cBORObjectFromObject2, cBORObjectFromObject);
            } else {
                mapAsMap.put(cBORObjectFromObject2, cBORObjectFromObject);
            }
        } else {
            if (getType() != CBORType.Array) {
                throw new IllegalStateException("Not a map or array");
            }
            if (!(obj instanceof Integer)) {
                throw new IllegalArgumentException("Is an array, but key is not int");
            }
            List<CBORObject> listAsList = AsList();
            int iIntValue = ((Integer) obj).intValue();
            if (iIntValue < 0 || iIntValue >= size()) {
                throw new IllegalArgumentException("key");
            }
            if (obj2 == null) {
                cBORObjectFromObject = Null;
            } else {
                cBORObjectFromObject = obj2 instanceof CBORObject ? (CBORObject) obj2 : null;
                if (cBORObjectFromObject == null) {
                    cBORObjectFromObject = FromObject(obj2);
                }
            }
            listAsList.set(iIntValue, cBORObjectFromObject);
        }
        return this;
    }

    public byte[] ToJSONBytes() {
        return ToJSONBytes(JSONOptions.Default);
    }

    public byte[] ToJSONBytes(JSONOptions jSONOptions) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        if (jSONOptions == null) {
            throw new NullPointerException("jsonoptions");
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                WriteJSONTo(byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    byteArrayOutputStream.close();
                } catch (IOException unused) {
                }
                return byteArray;
            } catch (Throwable th) {
                th = th;
                if (byteArrayOutputStream != null) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                try {
                    throw th;
                } catch (IOException e2) {
                    throw new CBORException(e2.getMessage(), e2);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream = null;
        }
    }

    public String ToJSONString() {
        return ToJSONString(JSONOptions.Default);
    }

    public String ToJSONString(JSONOptions jSONOptions) {
        if (jSONOptions == null) {
            throw new NullPointerException(RRWebOptionsEvent.EVENT_TAG);
        }
        int i2 = AnonymousClass1.$SwitchMap$com$upokecenter$cbor$CBORType[getType().ordinal()];
        if (i2 == 1) {
            return AsEIntegerValue().toString();
        }
        if (i2 == 2) {
            long jAsDoubleBits = AsDoubleBits();
            return CBORUtilities.DoubleBitsFinite(jAsDoubleBits) ? CBORUtilities.DoubleBitsToString(jAsDoubleBits) : "null";
        }
        if (i2 == 7 || i2 == 8) {
            return isTrue() ? "true" : isFalse() ? Constants.CASEFIRST_FALSE : "null";
        }
        StringBuilder sb = new StringBuilder();
        try {
            CBORJsonWriter.WriteJSONToInternal(this, new StringOutput(sb), jSONOptions);
            return sb.toString();
        } catch (IOException e2) {
            throw new IllegalStateException("Internal error", e2);
        }
    }

    public <T> T ToObject(Type type) {
        return (T) ToObject(type, null, null, 0);
    }

    public <T> T ToObject(Type type, CBORTypeMapper cBORTypeMapper) {
        if (cBORTypeMapper != null) {
            return (T) ToObject(type, cBORTypeMapper, null, 0);
        }
        throw new NullPointerException("mapper");
    }

    public <T> T ToObject(Type type, CBORTypeMapper cBORTypeMapper, PODOptions pODOptions) {
        if (pODOptions != null) {
            return (T) ToObject(type, cBORTypeMapper, pODOptions, 0);
        }
        throw new NullPointerException(RRWebOptionsEvent.EVENT_TAG);
    }

    /* JADX WARN: Multi-variable type inference failed */
    <T> T ToObject(Type type, CBORTypeMapper cBORTypeMapper, PODOptions pODOptions, int i2) {
        T t2;
        int i3 = i2 + 1;
        if (i3 > 100) {
            throw new CBORException("Depth level too high");
        }
        if (type == null) {
            throw new NullPointerException("t");
        }
        if (type.equals(CBORObject.class)) {
            return this;
        }
        if (isNull()) {
            return null;
        }
        if (cBORTypeMapper != null && (t2 = (T) cBORTypeMapper.ConvertBackWithConverter(this, type)) != null) {
            return t2;
        }
        if (type.equals(Object.class)) {
            return this;
        }
        if (type.equals(EDecimal.class)) {
            CBORNumber cBORNumberAsNumber = AsNumber();
            return (T) cBORNumberAsNumber.GetNumberInterface().AsEDecimal(cBORNumberAsNumber.GetValue());
        }
        if (type.equals(EFloat.class)) {
            CBORNumber cBORNumberFromCBORObject = CBORNumber.FromCBORObject(this);
            if (cBORNumberFromCBORObject != null) {
                return (T) cBORNumberFromCBORObject.GetNumberInterface().AsEFloat(cBORNumberFromCBORObject.GetValue());
            }
            throw new IllegalStateException("Not a number type");
        }
        if (type.equals(EInteger.class)) {
            CBORNumber cBORNumberFromCBORObject2 = CBORNumber.FromCBORObject(this);
            if (cBORNumberFromCBORObject2 != null) {
                return (T) cBORNumberFromCBORObject2.GetNumberInterface().AsEInteger(cBORNumberFromCBORObject2.GetValue());
            }
            throw new IllegalStateException("Not a number type");
        }
        if (!type.equals(ERational.class)) {
            return type.equals(String.class) ? (T) AsString() : (T) PropertyMap.TypeToObject(this, type, cBORTypeMapper, pODOptions, i3);
        }
        if (HasMostInnerTag(30) && size() != 2) {
            return (T) ERational.Create((EInteger) get(0).ToObject(EInteger.class), (EInteger) get(1).ToObject(EInteger.class));
        }
        CBORNumber cBORNumberFromCBORObject3 = CBORNumber.FromCBORObject(this);
        if (cBORNumberFromCBORObject3 != null) {
            return (T) cBORNumberFromCBORObject3.GetNumberInterface().AsERational(cBORNumberFromCBORObject3.GetValue());
        }
        throw new IllegalStateException("Not a number type");
    }

    public <T> T ToObject(Type type, PODOptions pODOptions) {
        if (pODOptions != null) {
            return (T) ToObject(type, null, pODOptions, 0);
        }
        throw new NullPointerException(RRWebOptionsEvent.EVENT_TAG);
    }

    public CBORObject Untag() {
        CBORObject cBORObject = this;
        while (cBORObject.itemtypeValue == 6) {
            cBORObject = (CBORObject) cBORObject.itemValue;
        }
        return cBORObject;
    }

    public CBORObject UntagOne() {
        return this.itemtypeValue == 6 ? (CBORObject) this.itemValue : this;
    }

    public CBORObject WithTag(int i2) {
        if (i2 >= 0) {
            return new CBORObject(this, i2, 0);
        }
        throw new IllegalArgumentException("smallTag(" + i2 + ") is less than 0");
    }

    public CBORObject WithTag(EInteger eInteger) {
        int i2;
        if (eInteger == null) {
            throw new NullPointerException("bigintTag");
        }
        if (eInteger.signum() < 0) {
            throw new IllegalArgumentException("tagEInt's sign(" + eInteger.signum() + ") is less than 0");
        }
        if (eInteger.CanFitInInt32()) {
            return WithTag(eInteger.ToInt32Checked());
        }
        if (eInteger.compareTo(UInt64MaxValue) > 0) {
            throw new IllegalArgumentException("tag more than 18446744073709551615 (" + eInteger + ")");
        }
        byte[] bArrToBytes = eInteger.ToBytes(true);
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i4 >= Math.min(4, bArrToBytes.length)) {
                break;
            }
            i5 = (-1) - (((-1) - i5) & ((-1) - ((bArrToBytes[i4] & 255) << (i4 * 8))));
            i4++;
        }
        for (i2 = 4; i2 < Math.min(8, bArrToBytes.length); i2++) {
            byte b2 = bArrToBytes[i2];
            i3 |= ((b2 + 255) - (b2 | 255)) << (i2 * 8);
        }
        return new CBORObject(this, i5, i3);
    }

    public void WriteJSONTo(OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            throw new NullPointerException("outputStream");
        }
        CBORJsonWriter.WriteJSONToInternal(this, new StringOutput(outputStream), JSONOptions.Default);
    }

    public void WriteJSONTo(OutputStream outputStream, JSONOptions jSONOptions) throws IOException {
        if (outputStream == null) {
            throw new NullPointerException("outputStream");
        }
        if (jSONOptions == null) {
            throw new NullPointerException(RRWebOptionsEvent.EVENT_TAG);
        }
        CBORJsonWriter.WriteJSONToInternal(this, new StringOutput(outputStream), jSONOptions);
    }

    public void WriteTo(OutputStream outputStream) throws IOException {
        WriteTo(outputStream, CBOREncodeOptions.Default);
    }

    public void WriteTo(OutputStream outputStream, CBOREncodeOptions cBOREncodeOptions) throws IOException {
        if (outputStream == null) {
            throw new NullPointerException("stream");
        }
        if (cBOREncodeOptions == null) {
            throw new NullPointerException(RRWebOptionsEvent.EVENT_TAG);
        }
        if (cBOREncodeOptions.getCtap2Canonical()) {
            byte[] bArrCtapCanonicalEncode = CBORCanonical.CtapCanonicalEncode(this);
            outputStream.write(bArrCtapCanonicalEncode, 0, bArrCtapCanonicalEncode.length);
            return;
        }
        WriteTags(outputStream);
        switch (getItemType()) {
            case 0:
                Write(((Long) getThisItem()).longValue(), outputStream);
                return;
            case 1:
                Write((EInteger) getThisItem(), outputStream);
                return;
            case 2:
            case 9:
                byte[] bArr = (byte[]) getThisItem();
                WritePositiveInt(getType() == CBORType.ByteString ? 2 : 3, bArr.length, outputStream);
                outputStream.write(bArr, 0, bArr.length);
                return;
            case 3:
            case 10:
                Write((String) getThisItem(), outputStream, cBOREncodeOptions);
                return;
            case 4:
                WriteObjectArray(AsList(), outputStream, cBOREncodeOptions);
                return;
            case 5:
                WriteObjectMap(AsMap(), outputStream, cBOREncodeOptions);
                return;
            case 6:
            default:
                throw new IllegalArgumentException("Unexpected data type");
            case 7:
                int simpleValue = getSimpleValue();
                if (simpleValue < 24) {
                    outputStream.write((byte) (simpleValue + CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY));
                    return;
                } else {
                    outputStream.write(248);
                    outputStream.write((byte) simpleValue);
                    return;
                }
            case 8:
                WriteFloatingPointBits(outputStream, AsDoubleBits(), 8, !cBOREncodeOptions.getFloat64());
                return;
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(CBORObject cBORObject) {
        int iCompareUtf16Utf8LengthFirst;
        if (cBORObject == null) {
            return 1;
        }
        if (this == cBORObject) {
            return 0;
        }
        int i2 = this.itemtypeValue;
        int i3 = cBORObject.itemtypeValue;
        Object obj = this.itemValue;
        Object obj2 = cBORObject.itemValue;
        if (i2 != i3) {
            if ((i3 == 0 && i2 == 1) || (i2 == 0 && i3 == 1)) {
                return CBORUtilities.ByteArrayCompare(EncodeToBytes(), cBORObject.EncodeToBytes());
            }
            if ((i3 == 3 || i3 == 10) && i2 == 9) {
                iCompareUtf16Utf8LengthFirst = CBORUtilities.CompareUtf16Utf8LengthFirst((String) obj2, (byte[]) obj);
            } else {
                if ((i2 == 3 || i2 == 10) && i3 == 9) {
                    return CBORUtilities.CompareUtf16Utf8LengthFirst((String) obj, (byte[]) obj2);
                }
                if ((i2 == 3 && i3 == 10) || (i3 == 3 && i2 == 10)) {
                    iCompareUtf16Utf8LengthFirst = CBORUtilities.CompareStringsAsUtf8LengthFirst((String) obj2, (String) obj);
                } else {
                    if ((i2 == 3 || i2 == 10) && i3 == 9) {
                        return CBORUtilities.CompareUtf16Utf8LengthFirst((String) obj, (byte[]) obj2);
                    }
                    if (i2 == 9 || i2 == 10) {
                        i2 = 3;
                    }
                    if (i3 == 9 || i3 == 10) {
                        i3 = 3;
                    }
                    if (i2 >= i3) {
                        return 1;
                    }
                }
            }
            return -iCompareUtf16Utf8LengthFirst;
        }
        switch (i2) {
            case 0:
                long jLongValue = ((Long) obj).longValue();
                long jLongValue2 = ((Long) obj2).longValue();
                if (jLongValue >= 0 && jLongValue2 >= 0) {
                    if (jLongValue != jLongValue2) {
                        if (jLongValue >= jLongValue2) {
                            return 1;
                        }
                    }
                    return 0;
                }
                if (jLongValue <= 0 && jLongValue2 <= 0) {
                    if (jLongValue != jLongValue2) {
                        if (jLongValue < jLongValue2) {
                            return 1;
                        }
                    }
                    return 0;
                }
                if (jLongValue < 0 && jLongValue2 >= 0) {
                    return 1;
                }
                break;
            case 1:
                return CBORUtilities.ByteArrayCompare(EncodeToBytes(), cBORObject.EncodeToBytes());
            case 2:
            case 9:
                return CBORUtilities.ByteArrayCompareLengthFirst((byte[]) obj, (byte[]) obj2);
            case 3:
                return CBORUtilities.CompareStringsAsUtf8LengthFirst((String) obj, (String) obj2);
            case 4:
                return ListCompare((ArrayList) obj, (ArrayList) obj2);
            case 5:
                return MapCompare((Map) obj, (Map) obj2);
            case 6:
                int iCompareTo = getMostOuterTag().compareTo(cBORObject.getMostOuterTag());
                return iCompareTo == 0 ? ((CBORObject) obj).compareTo((CBORObject) obj2) : iCompareTo;
            case 7:
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                if (iIntValue != iIntValue2) {
                    if (iIntValue >= iIntValue2) {
                        return 1;
                    }
                }
                return 0;
            case 8:
                return CBORUtilities.ByteArrayCompare(GetDoubleBytes(AsDoubleBits(), 0), GetDoubleBytes(cBORObject.AsDoubleBits(), 0));
            case 10:
                String str = (String) obj;
                String str2 = (String) obj2;
                int length = str.length();
                int length2 = str2.length();
                if (length >= length2) {
                    if (length > length2) {
                        return 1;
                    }
                    return str.compareTo(str2);
                }
                break;
            default:
                throw new IllegalStateException("Unexpected data type");
        }
        return -1;
    }

    public boolean equals(CBORObject cBORObject) {
        if (!(cBORObject instanceof CBORObject)) {
            cBORObject = null;
        }
        if (cBORObject == null) {
            return false;
        }
        if (this == cBORObject) {
            return true;
        }
        int i2 = this.itemtypeValue;
        if ((i2 == 3 || i2 == 10) && cBORObject.itemtypeValue == 9) {
            return CBORUtilities.StringEqualsUtf8((String) this.itemValue, (byte[]) cBORObject.itemValue);
        }
        int i3 = cBORObject.itemtypeValue;
        if ((i3 == 3 || i3 == 10) && i2 == 9) {
            return CBORUtilities.StringEqualsUtf8((String) cBORObject.itemValue, (byte[]) this.itemValue);
        }
        if ((i3 == 3 && i2 == 10) || (i2 == 3 && i3 == 10)) {
            Object obj = this.itemValue;
            Object obj2 = cBORObject.itemValue;
            return obj == null ? obj2 == null : obj.equals(obj2);
        }
        if (i2 != i3) {
            return false;
        }
        if (i2 != 2) {
            if (i2 == 4) {
                List<CBORObject> listAsList = AsList();
                Object obj3 = cBORObject.itemValue;
                return CBORArrayEquals(listAsList, obj3 instanceof List ? (List) obj3 : null);
            }
            if (i2 == 5) {
                Object obj4 = cBORObject.itemValue;
                return CBORMapEquals(AsMap(), obj4 instanceof Map ? (Map) obj4 : null);
            }
            if (i2 == 6) {
                if (this.tagLow != cBORObject.tagLow || this.tagHigh != cBORObject.tagHigh) {
                    return false;
                }
                Object obj5 = this.itemValue;
                Object obj6 = cBORObject.itemValue;
                if (obj5 == null) {
                    if (obj6 != null) {
                        return false;
                    }
                } else if (!obj5.equals(obj6)) {
                    return false;
                }
                return true;
            }
            if (i2 == 8) {
                return AsDoubleBits() == cBORObject.AsDoubleBits();
            }
            if (i2 != 9) {
                Object obj7 = this.itemValue;
                Object obj8 = cBORObject.itemValue;
                return obj7 == null ? obj8 == null : obj7.equals(obj8);
            }
        }
        byte[] bArr = (byte[]) this.itemValue;
        Object obj9 = cBORObject.itemValue;
        return CBORUtilities.ByteArrayEquals(bArr, obj9 instanceof byte[] ? (byte[]) obj9 : null);
    }

    public boolean equals(Object obj) {
        return equals(obj instanceof CBORObject ? (CBORObject) obj : null);
    }

    public CBORObject get(int i2) {
        if (getType() == CBORType.Array) {
            List<CBORObject> listAsList = AsList();
            if (i2 < 0 || i2 >= listAsList.size()) {
                throw new IllegalArgumentException(FirebaseAnalytics.Param.INDEX);
            }
            return listAsList.get(i2);
        }
        if (getType() != CBORType.Map) {
            throw new IllegalStateException("Not an array or map");
        }
        Map<CBORObject, CBORObject> mapAsMap = AsMap();
        CBORObject cBORObjectFromObject = FromObject(i2);
        if (mapAsMap.containsKey(cBORObjectFromObject)) {
            return mapAsMap.get(cBORObjectFromObject);
        }
        return null;
    }

    public CBORObject get(CBORObject cBORObject) {
        if (cBORObject == null) {
            throw new NullPointerException("key");
        }
        if (getType() == CBORType.Map) {
            Map<CBORObject, CBORObject> mapAsMap = AsMap();
            if (mapAsMap.containsKey(cBORObject)) {
                return mapAsMap.get(cBORObject);
            }
            return null;
        }
        if (getType() != CBORType.Array) {
            throw new IllegalStateException("Not an array or map");
        }
        if (!cBORObject.isNumber() || !cBORObject.AsNumber().IsInteger()) {
            throw new IllegalArgumentException("Not an integer");
        }
        if (!cBORObject.AsNumber().CanFitInInt32()) {
            throw new IllegalArgumentException("key");
        }
        List<CBORObject> listAsList = AsList();
        int iToInt32Checked = cBORObject.AsNumber().ToInt32Checked();
        if (iToInt32Checked < 0 || iToInt32Checked >= listAsList.size()) {
            throw new IllegalArgumentException("key");
        }
        return listAsList.get(iToInt32Checked);
    }

    public CBORObject get(String str) {
        if (str != null) {
            return get(FromObject(str));
        }
        throw new NullPointerException("key");
    }

    public final Collection<Map.Entry<CBORObject, CBORObject>> getEntries() {
        if (getType() == CBORType.Map) {
            return PropertyMap.GetEntries(AsMap());
        }
        throw new IllegalStateException("Not a map");
    }

    public final Collection<CBORObject> getKeys() {
        if (getType() == CBORType.Map) {
            return AsMap().keySet();
        }
        throw new IllegalStateException("Not a map");
    }

    public final EInteger getMostInnerTag() {
        int i2;
        if (!isTagged()) {
            return EInteger.FromInt32(-1);
        }
        CBORObject cBORObject = this;
        for (CBORObject cBORObject2 = (CBORObject) this.itemValue; cBORObject2.isTagged(); cBORObject2 = (CBORObject) cBORObject2.itemValue) {
            cBORObject = cBORObject2;
        }
        int i3 = cBORObject.tagHigh;
        return (i3 != 0 || (i2 = cBORObject.tagLow) < 0 || i2 >= 65536) ? LowHighToEInteger(cBORObject.tagLow, i3) : EInteger.FromInt64(i2);
    }

    public final EInteger getMostOuterTag() {
        int i2;
        if (!isTagged()) {
            return EInteger.FromInt32(-1);
        }
        int i3 = this.tagHigh;
        return (i3 != 0 || (i2 = this.tagLow) < 0 || i2 >= 65536) ? LowHighToEInteger(this.tagLow, i3) : EInteger.FromInt32(i2);
    }

    public final int getSimpleValue() {
        if (getItemType() == 7) {
            return ((Integer) getThisItem()).intValue();
        }
        return -1;
    }

    public final int getTagCount() {
        int i2 = 0;
        for (CBORObject cBORObject = this; cBORObject.isTagged(); cBORObject = (CBORObject) cBORObject.itemValue) {
            i2++;
        }
        return i2;
    }

    public final CBORType getType() {
        switch (getItemType()) {
            case 0:
            case 1:
                return CBORType.Integer;
            case 2:
                return CBORType.ByteString;
            case 3:
            case 9:
            case 10:
                return CBORType.TextString;
            case 4:
                return CBORType.Array;
            case 5:
                return CBORType.Map;
            case 6:
            default:
                throw new IllegalStateException("Unexpected data type");
            case 7:
                return (((Integer) getThisItem()).intValue() == 21 || ((Integer) getThisItem()).intValue() == 20) ? CBORType.Boolean : CBORType.SimpleValue;
            case 8:
                return CBORType.FloatingPoint;
        }
    }

    public final Collection<CBORObject> getValues() {
        if (getType() == CBORType.Map) {
            return AsMap().values();
        }
        if (getType() == CBORType.Array) {
            return Collections.unmodifiableList(AsList());
        }
        throw new IllegalStateException("Not a map or array");
    }

    public int hashCode() {
        long jLongValue;
        int iUtf8HashCode;
        Object obj = this.itemValue;
        if (obj == null) {
            return 651869431;
        }
        int i2 = this.itemtypeValue;
        if (i2 != 0) {
            switch (i2) {
                case 2:
                    iUtf8HashCode = CBORUtilities.ByteArrayHashCode(GetByteString());
                    break;
                case 3:
                case 10:
                    iUtf8HashCode = CBORUtilities.StringHashCode((String) obj);
                    break;
                case 4:
                    iUtf8HashCode = CBORArrayHashCode(AsList());
                    break;
                case 5:
                    iUtf8HashCode = CBORMapHashCode(AsMap());
                    break;
                case 6:
                    iUtf8HashCode = (obj.hashCode() * 651869483) + this.tagLow + this.tagHigh;
                    break;
                case 7:
                    iUtf8HashCode = ((Integer) obj).intValue();
                    break;
                case 8:
                    jLongValue = AsDoubleBits();
                    break;
                case 9:
                    iUtf8HashCode = CBORUtilities.Utf8HashCode((byte[]) obj);
                    break;
                default:
                    iUtf8HashCode = obj.hashCode();
                    break;
            }
            return 651869431 + (iUtf8HashCode * 651869479);
        }
        jLongValue = ((Long) obj).longValue();
        iUtf8HashCode = (int) ((-1) - (((-1) - (jLongValue >> 32)) & ((-1) - jLongValue)));
        return 651869431 + (iUtf8HashCode * 651869479);
    }

    public final boolean isFalse() {
        return getItemType() == 7 && ((Integer) getThisItem()).intValue() == 20;
    }

    @Deprecated
    public final boolean isFinite() {
        if (!isNumber()) {
            return false;
        }
        CBORNumber cBORNumberAsNumber = AsNumber();
        return (cBORNumberAsNumber.IsInfinity() || cBORNumberAsNumber.IsNaN()) ? false : true;
    }

    @Deprecated
    public final boolean isIntegral() {
        CBORNumber cBORNumberFromCBORObject = CBORNumber.FromCBORObject(this);
        return cBORNumberFromCBORObject != null && cBORNumberFromCBORObject.GetNumberInterface().IsIntegral(cBORNumberFromCBORObject.GetValue());
    }

    @Deprecated
    public final boolean isNegative() {
        CBORNumber cBORNumberFromCBORObject = CBORNumber.FromCBORObject(this);
        return cBORNumberFromCBORObject != null && cBORNumberFromCBORObject.GetNumberInterface().IsNegative(cBORNumberFromCBORObject.GetValue());
    }

    public final boolean isNull() {
        return getItemType() == 7 && ((Integer) getThisItem()).intValue() == 22;
    }

    public final boolean isNumber() {
        return CBORNumber.IsNumber(this);
    }

    public final boolean isTagged() {
        return this.itemtypeValue == 6;
    }

    public final boolean isTrue() {
        return getItemType() == 7 && ((Integer) getThisItem()).intValue() == 21;
    }

    public final boolean isUndefined() {
        return getItemType() == 7 && ((Integer) getThisItem()).intValue() == 23;
    }

    @Deprecated
    public final boolean isZero() {
        CBORNumber cBORNumberFromCBORObject = CBORNumber.FromCBORObject(this);
        return cBORNumberFromCBORObject != null && cBORNumberFromCBORObject.GetNumberInterface().IsNumberZero(cBORNumberFromCBORObject.GetValue());
    }

    public void set(int i2, CBORObject cBORObject) {
        if (getType() != CBORType.Array) {
            if (getType() != CBORType.Map) {
                throw new IllegalStateException("Not an array or map");
            }
            AsMap().put(FromObject(i2), cBORObject);
        } else {
            if (cBORObject == null) {
                throw new NullPointerException("value");
            }
            List<CBORObject> listAsList = AsList();
            if (i2 < 0 || i2 >= listAsList.size()) {
                throw new IllegalArgumentException(FirebaseAnalytics.Param.INDEX);
            }
            listAsList.set(i2, cBORObject);
        }
    }

    public void set(CBORObject cBORObject, CBORObject cBORObject2) {
        if (cBORObject == null) {
            throw new NullPointerException("key");
        }
        if (cBORObject2 == null) {
            throw new NullPointerException("value");
        }
        if (getType() == CBORType.Map) {
            AsMap().put(cBORObject, cBORObject2);
            return;
        }
        if (getType() != CBORType.Array) {
            throw new IllegalStateException("Not an array or map");
        }
        if (!cBORObject.isNumber() || !cBORObject.AsNumber().IsInteger()) {
            throw new IllegalArgumentException("Not an integer");
        }
        if (!cBORObject.AsNumber().CanFitInInt32()) {
            throw new IllegalArgumentException("key");
        }
        List<CBORObject> listAsList = AsList();
        int iToInt32Checked = cBORObject.AsNumber().ToInt32Checked();
        if (iToInt32Checked < 0 || iToInt32Checked >= listAsList.size()) {
            throw new IllegalArgumentException("key");
        }
        listAsList.set(iToInt32Checked, cBORObject2);
    }

    public void set(String str, CBORObject cBORObject) {
        if (str == null) {
            throw new NullPointerException("key");
        }
        if (cBORObject == null) {
            throw new NullPointerException("value");
        }
        CBORObject cBORObjectFromObject = FromObject(str);
        if (getType() != CBORType.Map) {
            throw new IllegalStateException("Not a map");
        }
        AsMap().put(cBORObjectFromObject, cBORObject);
    }

    @Deprecated
    public final int signum() {
        CBORNumber cBORNumberFromCBORObject = CBORNumber.FromCBORObject(this);
        if (cBORNumberFromCBORObject == null || cBORNumberFromCBORObject.IsNaN()) {
            throw new IllegalStateException("This Object is not a number.");
        }
        return cBORNumberFromCBORObject.GetNumberInterface().Sign(cBORNumberFromCBORObject.GetValue());
    }

    public final int size() {
        if (getType() == CBORType.Array) {
            return AsList().size();
        }
        if (getType() == CBORType.Map) {
            return AsMap().size();
        }
        return 0;
    }

    public String toString() {
        return CBORDataUtilities.ToStringHelper(this, 0);
    }
}
