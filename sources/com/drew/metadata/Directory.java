package com.drew.metadata;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.drew.lang.Rational;
import com.dynatrace.android.agent.AdkSettings;
import cz.msebera.android.httpclient.message.TokenParser;
import io.sentry.profilemeasurements.ProfileMeasurement;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Directory {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String _floatFormatPattern = "0.###";
    protected TagDescriptor<?> _descriptor;
    private Directory _parent;
    protected final Map<Integer, Object> _tagMap = new HashMap();
    protected final Collection<Tag> _definedTagList = new ArrayList();
    private final Collection<String> _errorList = new ArrayList(4);

    protected Directory() {
    }

    public void addError(String str) {
        this._errorList.add(str);
    }

    public boolean containsTag(int i2) {
        return this._tagMap.containsKey(Integer.valueOf(i2));
    }

    public boolean getBoolean(int i2) throws MetadataException {
        Boolean booleanObject = getBooleanObject(i2);
        if (booleanObject != null) {
            return booleanObject.booleanValue();
        }
        Object object = getObject(i2);
        if (object == null) {
            throw new MetadataException("Tag '" + getTagName(i2) + "' has not been set -- check using containsTag() first");
        }
        throw new MetadataException("Tag '" + i2 + "' cannot be converted to a boolean.  It is of type '" + object.getClass() + "'.");
    }

    public Boolean getBooleanObject(int i2) {
        Object object = getObject(i2);
        if (object == null) {
            return null;
        }
        if (object instanceof Boolean) {
            return (Boolean) object;
        }
        if ((object instanceof String) || (object instanceof StringValue)) {
            try {
                return Boolean.valueOf(Boolean.getBoolean(object.toString()));
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        if (object instanceof Number) {
            return Boolean.valueOf(((Number) object).doubleValue() != 0.0d);
        }
        return null;
    }

    public byte[] getByteArray(int i2) {
        Object object = getObject(i2);
        if (object == null) {
            return null;
        }
        if (object instanceof StringValue) {
            return ((StringValue) object).getBytes();
        }
        int i3 = 0;
        if (object instanceof Rational[]) {
            Rational[] rationalArr = (Rational[]) object;
            int length = rationalArr.length;
            byte[] bArr = new byte[length];
            while (i3 < length) {
                bArr[i3] = rationalArr[i3].byteValue();
                i3++;
            }
            return bArr;
        }
        if (object instanceof byte[]) {
            return (byte[]) object;
        }
        if (object instanceof int[]) {
            int[] iArr = (int[]) object;
            byte[] bArr2 = new byte[iArr.length];
            while (i3 < iArr.length) {
                bArr2[i3] = (byte) iArr[i3];
                i3++;
            }
            return bArr2;
        }
        if (object instanceof short[]) {
            short[] sArr = (short[]) object;
            byte[] bArr3 = new byte[sArr.length];
            while (i3 < sArr.length) {
                bArr3[i3] = (byte) sArr[i3];
                i3++;
            }
            return bArr3;
        }
        if (!(object instanceof CharSequence)) {
            if (object instanceof Integer) {
                return new byte[]{((Integer) object).byteValue()};
            }
            return null;
        }
        CharSequence charSequence = (CharSequence) object;
        byte[] bArr4 = new byte[charSequence.length()];
        while (i3 < charSequence.length()) {
            bArr4[i3] = (byte) charSequence.charAt(i3);
            i3++;
        }
        return bArr4;
    }

    public Date getDate(int i2) {
        return getDate(i2, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.Calendar] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.Date] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.Date] */
    /* JADX WARN: Type inference failed for: r5v7 */
    public Date getDate(int i2, String str, TimeZone timeZone) {
        ?? r5;
        Object object = getObject(i2);
        if (object instanceof Date) {
            return (Date) object;
        }
        if ((object instanceof String) || (object instanceof StringValue)) {
            r5 = new String[]{"yyyy:MM:dd HH:mm:ss", "yyyy:MM:dd HH:mm", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm", "yyyy.MM.dd HH:mm:ss", "yyyy.MM.dd HH:mm", "yyyy-MM-dd'T'HH:mm:ss", "yyyy-MM-dd'T'HH:mm", "yyyy-MM-dd", "yyyy-MM", "yyyyMMdd", "yyyy"};
            String string = object.toString();
            Matcher matcher = Pattern.compile("(\\d\\d:\\d\\d:\\d\\d)(\\.\\d+)").matcher(string);
            if (matcher.find()) {
                str = matcher.group(2).substring(1);
                string = matcher.replaceAll("$1");
            }
            Matcher matcher2 = Pattern.compile("(Z|[+-]\\d\\d:\\d\\d|[+-]\\d\\d\\d\\d)$").matcher(string);
            if (matcher2.find()) {
                timeZone = TimeZone.getTimeZone("GMT" + matcher2.group().replaceAll("Z", ""));
                string = matcher2.replaceAll("");
            }
            for (int i3 = 0; i3 < 12; i3++) {
                try {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(r5[i3]);
                    if (timeZone != null) {
                        simpleDateFormat.setTimeZone(timeZone);
                    } else {
                        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
                    }
                    r5 = simpleDateFormat.parse(string);
                    break;
                } catch (ParseException unused) {
                }
            }
            r5 = 0;
        } else {
            r5 = 0;
        }
        if (r5 == 0) {
            return null;
        }
        if (str == null) {
            return r5;
        }
        try {
            int i4 = (int) (Double.parseDouble("." + str) * 1000.0d);
            if (i4 < 0 || i4 >= 1000) {
                return r5;
            }
            ?? calendar = Calendar.getInstance();
            calendar.setTime(r5);
            calendar.set(14, i4);
            return calendar.getTime();
        } catch (NumberFormatException unused2) {
            return r5;
        }
    }

    public Date getDate(int i2, TimeZone timeZone) {
        return getDate(i2, null, timeZone);
    }

    public String getDescription(int i2) {
        return this._descriptor.getDescription(i2);
    }

    public double getDouble(int i2) throws MetadataException {
        Double doubleObject = getDoubleObject(i2);
        if (doubleObject != null) {
            return doubleObject.doubleValue();
        }
        Object object = getObject(i2);
        if (object == null) {
            throw new MetadataException("Tag '" + getTagName(i2) + "' has not been set -- check using containsTag() first");
        }
        throw new MetadataException("Tag '" + i2 + "' cannot be converted to a double.  It is of type '" + object.getClass() + "'.");
    }

    public Double getDoubleObject(int i2) {
        Object object = getObject(i2);
        if (object == null) {
            return null;
        }
        if ((object instanceof String) || (object instanceof StringValue)) {
            try {
                return Double.valueOf(Double.parseDouble(object.toString()));
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        if (object instanceof Number) {
            return Double.valueOf(((Number) object).doubleValue());
        }
        return null;
    }

    public int getErrorCount() {
        return this._errorList.size();
    }

    public Iterable<String> getErrors() {
        return Collections.unmodifiableCollection(this._errorList);
    }

    public float getFloat(int i2) throws MetadataException {
        Float floatObject = getFloatObject(i2);
        if (floatObject != null) {
            return floatObject.floatValue();
        }
        Object object = getObject(i2);
        if (object == null) {
            throw new MetadataException("Tag '" + getTagName(i2) + "' has not been set -- check using containsTag() first");
        }
        throw new MetadataException("Tag '" + i2 + "' cannot be converted to a float.  It is of type '" + object.getClass() + "'.");
    }

    public Float getFloatObject(int i2) {
        Object object = getObject(i2);
        if (object == null) {
            return null;
        }
        if ((object instanceof String) || (object instanceof StringValue)) {
            try {
                return Float.valueOf(Float.parseFloat(object.toString()));
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        if (object instanceof Number) {
            return Float.valueOf(((Number) object).floatValue());
        }
        return null;
    }

    public int getInt(int i2) throws MetadataException {
        Integer integer = getInteger(i2);
        if (integer != null) {
            return integer.intValue();
        }
        Object object = getObject(i2);
        if (object == null) {
            throw new MetadataException("Tag '" + getTagName(i2) + "' has not been set -- check using containsTag() first");
        }
        throw new MetadataException("Tag '" + i2 + "' cannot be converted to int.  It is of type '" + object.getClass() + "'.");
    }

    public int[] getIntArray(int i2) {
        Object object = getObject(i2);
        if (object == null) {
            return null;
        }
        if (object instanceof int[]) {
            return (int[]) object;
        }
        int i3 = 0;
        if (object instanceof Rational[]) {
            Rational[] rationalArr = (Rational[]) object;
            int length = rationalArr.length;
            int[] iArr = new int[length];
            while (i3 < length) {
                iArr[i3] = rationalArr[i3].intValue();
                i3++;
            }
            return iArr;
        }
        if (object instanceof short[]) {
            short[] sArr = (short[]) object;
            int[] iArr2 = new int[sArr.length];
            while (i3 < sArr.length) {
                iArr2[i3] = sArr[i3];
                i3++;
            }
            return iArr2;
        }
        if (object instanceof byte[]) {
            byte[] bArr = (byte[]) object;
            int[] iArr3 = new int[bArr.length];
            while (i3 < bArr.length) {
                iArr3[i3] = bArr[i3];
                i3++;
            }
            return iArr3;
        }
        if (!(object instanceof CharSequence)) {
            if (object instanceof Integer) {
                return new int[]{((Integer) object).intValue()};
            }
            return null;
        }
        CharSequence charSequence = (CharSequence) object;
        int[] iArr4 = new int[charSequence.length()];
        while (i3 < charSequence.length()) {
            iArr4[i3] = charSequence.charAt(i3);
            i3++;
        }
        return iArr4;
    }

    public Integer getInteger(int i2) {
        Object object = getObject(i2);
        if (object == null) {
            return null;
        }
        if (object instanceof Number) {
            return Integer.valueOf(((Number) object).intValue());
        }
        if ((object instanceof String) || (object instanceof StringValue)) {
            try {
                return Integer.valueOf(Integer.parseInt(object.toString()));
            } catch (NumberFormatException unused) {
                byte[] bytes = object.toString().getBytes();
                long j2 = 0;
                for (byte b2 : bytes) {
                    j2 = (j2 << 8) + ((long) (b2 & 255));
                }
                return Integer.valueOf((int) j2);
            }
        }
        if (object instanceof Rational[]) {
            Rational[] rationalArr = (Rational[]) object;
            if (rationalArr.length == 1) {
                return Integer.valueOf(rationalArr[0].intValue());
            }
        } else if (object instanceof byte[]) {
            byte[] bArr = (byte[]) object;
            if (bArr.length == 1) {
                return Integer.valueOf(bArr[0]);
            }
        } else if (object instanceof int[]) {
            int[] iArr = (int[]) object;
            if (iArr.length == 1) {
                return Integer.valueOf(iArr[0]);
            }
        } else if (object instanceof short[]) {
            short[] sArr = (short[]) object;
            if (sArr.length == 1) {
                return Integer.valueOf(sArr[0]);
            }
        }
        return null;
    }

    public long getLong(int i2) throws MetadataException {
        Long longObject = getLongObject(i2);
        if (longObject != null) {
            return longObject.longValue();
        }
        Object object = getObject(i2);
        if (object == null) {
            throw new MetadataException("Tag '" + getTagName(i2) + "' has not been set -- check using containsTag() first");
        }
        throw new MetadataException("Tag '" + i2 + "' cannot be converted to a long.  It is of type '" + object.getClass() + "'.");
    }

    public Long getLongObject(int i2) {
        Object object = getObject(i2);
        if (object == null) {
            return null;
        }
        if (object instanceof Number) {
            return Long.valueOf(((Number) object).longValue());
        }
        if ((object instanceof String) || (object instanceof StringValue)) {
            try {
                return Long.valueOf(Long.parseLong(object.toString()));
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        if (object instanceof Rational[]) {
            Rational[] rationalArr = (Rational[]) object;
            if (rationalArr.length == 1) {
                return Long.valueOf(rationalArr[0].longValue());
            }
        } else if (object instanceof byte[]) {
            if (((byte[]) object).length == 1) {
                return Long.valueOf(r4[0]);
            }
        } else if (object instanceof int[]) {
            if (((int[]) object).length == 1) {
                return Long.valueOf(r4[0]);
            }
        } else if (object instanceof short[]) {
            if (((short[]) object).length == 1) {
                return Long.valueOf(r4[0]);
            }
        }
        return null;
    }

    public abstract String getName();

    public Object getObject(int i2) {
        return this._tagMap.get(Integer.valueOf(i2));
    }

    public Directory getParent() {
        return this._parent;
    }

    public Rational getRational(int i2) {
        Object object = getObject(i2);
        if (object == null) {
            return null;
        }
        if (object instanceof Rational) {
            return (Rational) object;
        }
        if (object instanceof Integer) {
            return new Rational(((Integer) object).intValue(), 1L);
        }
        if (object instanceof Long) {
            return new Rational(((Long) object).longValue(), 1L);
        }
        return null;
    }

    public Rational[] getRationalArray(int i2) {
        Object object = getObject(i2);
        if (object != null && (object instanceof Rational[])) {
            return (Rational[]) object;
        }
        return null;
    }

    public String getString(int i2) {
        Object object = getObject(i2);
        if (object == null) {
            return null;
        }
        if (object instanceof Rational) {
            return ((Rational) object).toSimpleString(true);
        }
        if (!object.getClass().isArray()) {
            return object instanceof Double ? new DecimalFormat(_floatFormatPattern).format(((Double) object).doubleValue()) : object instanceof Float ? new DecimalFormat(_floatFormatPattern).format(((Float) object).floatValue()) : object.toString();
        }
        int length = Array.getLength(object);
        Class<?> componentType = object.getClass().getComponentType();
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        if (Object.class.isAssignableFrom(componentType)) {
            while (i3 < length) {
                if (i3 != 0) {
                    sb.append(TokenParser.SP);
                }
                sb.append(Array.get(object, i3).toString());
                i3++;
            }
        } else if (componentType.getName().equals("int")) {
            while (i3 < length) {
                if (i3 != 0) {
                    sb.append(TokenParser.SP);
                }
                sb.append(Array.getInt(object, i3));
                i3++;
            }
        } else if (componentType.getName().equals("short")) {
            while (i3 < length) {
                if (i3 != 0) {
                    sb.append(TokenParser.SP);
                }
                sb.append((int) Array.getShort(object, i3));
                i3++;
            }
        } else if (componentType.getName().equals("long")) {
            while (i3 < length) {
                if (i3 != 0) {
                    sb.append(TokenParser.SP);
                }
                sb.append(Array.getLong(object, i3));
                i3++;
            }
        } else if (componentType.getName().equals(TypedValues.Custom.S_FLOAT)) {
            DecimalFormat decimalFormat = new DecimalFormat(_floatFormatPattern);
            while (i3 < length) {
                if (i3 != 0) {
                    sb.append(TokenParser.SP);
                }
                String str = decimalFormat.format(Array.getFloat(object, i3));
                if (str.equals("-0")) {
                    str = AdkSettings.PLATFORM_TYPE_MOBILE;
                }
                sb.append(str);
                i3++;
            }
        } else if (componentType.getName().equals("double")) {
            DecimalFormat decimalFormat2 = new DecimalFormat(_floatFormatPattern);
            while (i3 < length) {
                if (i3 != 0) {
                    sb.append(TokenParser.SP);
                }
                String str2 = decimalFormat2.format(Array.getDouble(object, i3));
                if (str2.equals("-0")) {
                    str2 = AdkSettings.PLATFORM_TYPE_MOBILE;
                }
                sb.append(str2);
                i3++;
            }
        } else if (componentType.getName().equals(ProfileMeasurement.UNIT_BYTES)) {
            while (i3 < length) {
                if (i3 != 0) {
                    sb.append(TokenParser.SP);
                }
                sb.append(Array.getByte(object, i3) & 255);
                i3++;
            }
        } else {
            addError("Unexpected array component type: " + componentType.getName());
        }
        return sb.toString();
    }

    public String getString(int i2, String str) {
        byte[] byteArray = getByteArray(i2);
        if (byteArray == null) {
            return null;
        }
        try {
            return new String(byteArray, str);
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public String[] getStringArray(int i2) {
        Object object = getObject(i2);
        if (object == null) {
            return null;
        }
        if (object instanceof String[]) {
            return (String[]) object;
        }
        int i3 = 0;
        if (object instanceof String) {
            return new String[]{(String) object};
        }
        if (object instanceof StringValue) {
            return new String[]{object.toString()};
        }
        if (object instanceof StringValue[]) {
            StringValue[] stringValueArr = (StringValue[]) object;
            int length = stringValueArr.length;
            String[] strArr = new String[length];
            while (i3 < length) {
                strArr[i3] = stringValueArr[i3].toString();
                i3++;
            }
            return strArr;
        }
        if (object instanceof int[]) {
            int[] iArr = (int[]) object;
            int length2 = iArr.length;
            String[] strArr2 = new String[length2];
            while (i3 < length2) {
                strArr2[i3] = Integer.toString(iArr[i3]);
                i3++;
            }
            return strArr2;
        }
        if (object instanceof byte[]) {
            byte[] bArr = (byte[]) object;
            int length3 = bArr.length;
            String[] strArr3 = new String[length3];
            while (i3 < length3) {
                strArr3[i3] = Byte.toString(bArr[i3]);
                i3++;
            }
            return strArr3;
        }
        if (!(object instanceof Rational[])) {
            return null;
        }
        Rational[] rationalArr = (Rational[]) object;
        int length4 = rationalArr.length;
        String[] strArr4 = new String[length4];
        for (int i4 = 0; i4 < length4; i4++) {
            strArr4[i4] = rationalArr[i4].toSimpleString(false);
        }
        return strArr4;
    }

    public StringValue getStringValue(int i2) {
        Object object = getObject(i2);
        if (object instanceof StringValue) {
            return (StringValue) object;
        }
        return null;
    }

    public StringValue[] getStringValueArray(int i2) {
        Object object = getObject(i2);
        if (object == null) {
            return null;
        }
        if (object instanceof StringValue[]) {
            return (StringValue[]) object;
        }
        if (object instanceof StringValue) {
            return new StringValue[]{(StringValue) object};
        }
        return null;
    }

    public int getTagCount() {
        return this._definedTagList.size();
    }

    public String getTagName(int i2) {
        HashMap<Integer, String> tagNameMap = getTagNameMap();
        if (tagNameMap.containsKey(Integer.valueOf(i2))) {
            return tagNameMap.get(Integer.valueOf(i2));
        }
        String hexString = Integer.toHexString(i2);
        while (hexString.length() < 4) {
            hexString = AdkSettings.PLATFORM_TYPE_MOBILE + hexString;
        }
        return "Unknown tag (0x" + hexString + ")";
    }

    protected abstract HashMap<Integer, String> getTagNameMap();

    public Collection<Tag> getTags() {
        return Collections.unmodifiableCollection(this._definedTagList);
    }

    public boolean hasErrors() {
        return this._errorList.size() > 0;
    }

    public boolean hasTagName(int i2) {
        return getTagNameMap().containsKey(Integer.valueOf(i2));
    }

    public boolean isEmpty() {
        return this._errorList.isEmpty() && this._definedTagList.isEmpty();
    }

    public void setBoolean(int i2, boolean z2) {
        setObject(i2, Boolean.valueOf(z2));
    }

    public void setByteArray(int i2, byte[] bArr) {
        setObjectArray(i2, bArr);
    }

    public void setDate(int i2, Date date) {
        setObject(i2, date);
    }

    public void setDescriptor(TagDescriptor<?> tagDescriptor) {
        if (tagDescriptor == null) {
            throw new NullPointerException("cannot set a null descriptor");
        }
        this._descriptor = tagDescriptor;
    }

    public void setDouble(int i2, double d2) {
        setObject(i2, Double.valueOf(d2));
    }

    public void setDoubleArray(int i2, double[] dArr) {
        setObjectArray(i2, dArr);
    }

    public void setFloat(int i2, float f2) {
        setObject(i2, Float.valueOf(f2));
    }

    public void setFloatArray(int i2, float[] fArr) {
        setObjectArray(i2, fArr);
    }

    public void setInt(int i2, int i3) {
        setObject(i2, Integer.valueOf(i3));
    }

    public void setIntArray(int i2, int[] iArr) {
        setObjectArray(i2, iArr);
    }

    public void setLong(int i2, long j2) {
        setObject(i2, Long.valueOf(j2));
    }

    public void setObject(int i2, Object obj) {
        if (obj == null) {
            throw new NullPointerException("cannot set a null object");
        }
        if (!this._tagMap.containsKey(Integer.valueOf(i2))) {
            this._definedTagList.add(new Tag(i2, this));
        }
        this._tagMap.put(Integer.valueOf(i2), obj);
    }

    public void setObjectArray(int i2, Object obj) {
        setObject(i2, obj);
    }

    public void setParent(Directory directory) {
        this._parent = directory;
    }

    public void setRational(int i2, Rational rational) {
        setObject(i2, rational);
    }

    public void setRationalArray(int i2, Rational[] rationalArr) {
        setObjectArray(i2, rationalArr);
    }

    public void setString(int i2, String str) {
        if (str == null) {
            throw new NullPointerException("cannot set a null String");
        }
        setObject(i2, str);
    }

    public void setStringArray(int i2, String[] strArr) {
        setObjectArray(i2, strArr);
    }

    public void setStringValue(int i2, StringValue stringValue) {
        if (stringValue == null) {
            throw new NullPointerException("cannot set a null StringValue");
        }
        setObject(i2, stringValue);
    }

    public void setStringValueArray(int i2, StringValue[] stringValueArr) {
        setObjectArray(i2, stringValueArr);
    }

    public String toString() {
        return String.format("%s Directory (%d %s)", getName(), Integer.valueOf(this._tagMap.size()), this._tagMap.size() == 1 ? "tag" : "tags");
    }
}
