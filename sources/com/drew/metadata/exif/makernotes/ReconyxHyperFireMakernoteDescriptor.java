package com.drew.metadata.exif.makernotes;

import com.drew.metadata.StringValue;
import com.drew.metadata.TagDescriptor;
import com.google.android.material.timepicker.TimeModel;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes3.dex */
public class ReconyxHyperFireMakernoteDescriptor extends TagDescriptor<ReconyxHyperFireMakernoteDirectory> {
    public ReconyxHyperFireMakernoteDescriptor(ReconyxHyperFireMakernoteDirectory reconyxHyperFireMakernoteDirectory) {
        super(reconyxHyperFireMakernoteDirectory);
    }

    @Override // com.drew.metadata.TagDescriptor
    public String getDescription(int i2) {
        switch (i2) {
            case 0:
                return String.format(TimeModel.NUMBER_FORMAT, ((ReconyxHyperFireMakernoteDirectory) this._directory).getInteger(i2));
            case 2:
                return ((ReconyxHyperFireMakernoteDirectory) this._directory).getString(i2);
            case 12:
                return ((ReconyxHyperFireMakernoteDirectory) this._directory).getString(i2);
            case 14:
                int[] intArray = ((ReconyxHyperFireMakernoteDirectory) this._directory).getIntArray(i2);
                if (intArray == null) {
                    return null;
                }
                return String.format("%d/%d", Integer.valueOf(intArray[0]), Integer.valueOf(intArray[1]));
            case 18:
                return String.format(TimeModel.NUMBER_FORMAT, ((ReconyxHyperFireMakernoteDirectory) this._directory).getInteger(i2));
            case 22:
                String string = ((ReconyxHyperFireMakernoteDirectory) this._directory).getString(i2);
                try {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
                    return simpleDateFormat.format(simpleDateFormat.parse(string));
                } catch (ParseException unused) {
                    return null;
                }
            case 36:
                return getIndexedDescription(i2, "New", "Waxing Crescent", "First Quarter", "Waxing Gibbous", "Full", "Waning Gibbous", "Last Quarter", "Waning Crescent");
            case 38:
            case 40:
                return String.format(TimeModel.NUMBER_FORMAT, ((ReconyxHyperFireMakernoteDirectory) this._directory).getInteger(i2));
            case 42:
                StringValue stringValue = ((ReconyxHyperFireMakernoteDirectory) this._directory).getStringValue(i2);
                if (stringValue == null) {
                    return null;
                }
                return stringValue.toString();
            case 72:
            case 74:
            case 76:
            case 78:
                return String.format(TimeModel.NUMBER_FORMAT, ((ReconyxHyperFireMakernoteDirectory) this._directory).getInteger(i2));
            case 80:
                return getIndexedDescription(i2, "Off", "On");
            case 82:
                return String.format(TimeModel.NUMBER_FORMAT, ((ReconyxHyperFireMakernoteDirectory) this._directory).getInteger(i2));
            case 84:
                Double doubleObject = ((ReconyxHyperFireMakernoteDirectory) this._directory).getDoubleObject(i2);
                DecimalFormat decimalFormat = new DecimalFormat("0.000");
                if (doubleObject == null) {
                    return null;
                }
                return decimalFormat.format(doubleObject);
            case 86:
                return ((ReconyxHyperFireMakernoteDirectory) this._directory).getString(i2);
            default:
                return super.getDescription(i2);
        }
    }
}
