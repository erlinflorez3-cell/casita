package com.drew.metadata.exif.makernotes;

import com.drew.metadata.StringValue;
import com.drew.metadata.TagDescriptor;
import com.google.android.material.timepicker.TimeModel;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes3.dex */
public class ReconyxUltraFireMakernoteDescriptor extends TagDescriptor<ReconyxUltraFireMakernoteDirectory> {
    public ReconyxUltraFireMakernoteDescriptor(ReconyxUltraFireMakernoteDirectory reconyxUltraFireMakernoteDirectory) {
        super(reconyxUltraFireMakernoteDirectory);
    }

    @Override // com.drew.metadata.TagDescriptor
    public String getDescription(int i2) {
        switch (i2) {
            case 0:
                return ((ReconyxUltraFireMakernoteDirectory) this._directory).getString(i2);
            case 10:
                return String.format("0x%08X", ((ReconyxUltraFireMakernoteDirectory) this._directory).getInteger(i2));
            case 14:
                return String.format(TimeModel.NUMBER_FORMAT, ((ReconyxUltraFireMakernoteDirectory) this._directory).getInteger(i2));
            case 18:
                return String.format("0x%08X", ((ReconyxUltraFireMakernoteDirectory) this._directory).getInteger(i2));
            case 22:
                return String.format(TimeModel.NUMBER_FORMAT, ((ReconyxUltraFireMakernoteDirectory) this._directory).getInteger(i2));
            case 24:
            case 31:
            case 38:
            case 45:
            case 52:
                return ((ReconyxUltraFireMakernoteDirectory) this._directory).getString(i2);
            case 53:
                int[] intArray = ((ReconyxUltraFireMakernoteDirectory) this._directory).getIntArray(i2);
                if (intArray == null) {
                    return null;
                }
                return String.format("%d/%d", Integer.valueOf(intArray[0]), Integer.valueOf(intArray[1]));
            case 55:
                return String.format(TimeModel.NUMBER_FORMAT, ((ReconyxUltraFireMakernoteDirectory) this._directory).getInteger(i2));
            case 59:
                String string = ((ReconyxUltraFireMakernoteDirectory) this._directory).getString(i2);
                try {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
                    return simpleDateFormat.format(simpleDateFormat.parse(string));
                } catch (ParseException unused) {
                    return null;
                }
            case 67:
                return getIndexedDescription(i2, "New", "Waxing Crescent", "First Quarter", "Waxing Gibbous", "Full", "Waning Gibbous", "Last Quarter", "Waning Crescent");
            case 68:
            case 70:
                return String.format(TimeModel.NUMBER_FORMAT, ((ReconyxUltraFireMakernoteDirectory) this._directory).getInteger(i2));
            case 72:
                return getIndexedDescription(i2, "Off", "On");
            case 73:
                Double doubleObject = ((ReconyxUltraFireMakernoteDirectory) this._directory).getDoubleObject(i2);
                DecimalFormat decimalFormat = new DecimalFormat("0.000");
                if (doubleObject == null) {
                    return null;
                }
                return decimalFormat.format(doubleObject);
            case 75:
                StringValue stringValue = ((ReconyxUltraFireMakernoteDirectory) this._directory).getStringValue(i2);
                if (stringValue == null) {
                    return null;
                }
                return stringValue.toString();
            case 80:
                return ((ReconyxUltraFireMakernoteDirectory) this._directory).getString(i2);
            default:
                return super.getDescription(i2);
        }
    }
}
