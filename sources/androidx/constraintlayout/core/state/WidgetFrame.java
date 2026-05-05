package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLKey;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.state.Transition;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.braze.Constants;
import com.facebook.react.uimanager.ViewProps;
import com.google.common.base.Ascii;
import com.google.firebase.sessions.settings.RemoteSettings;
import io.reactivex.annotations.SchedulerSupport;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes4.dex */
public class WidgetFrame {
    private static final boolean OLD_SYSTEM = true;
    public static float phone_orientation = Float.NaN;
    public float alpha;
    public int bottom;
    public float interpolatedPos;
    public int left;
    public final HashMap<String, CustomVariable> mCustom;
    public String name;
    public float pivotX;
    public float pivotY;
    public int right;
    public float rotationX;
    public float rotationY;
    public float rotationZ;
    public float scaleX;
    public float scaleY;
    public int top;
    public float translationX;
    public float translationY;
    public float translationZ;
    public int visibility;
    public ConstraintWidget widget;

    public void setCustomValue(CustomAttribute customAttribute, float[] fArr) {
    }

    public int width() {
        return Math.max(0, this.right - this.left);
    }

    public int height() {
        return Math.max(0, this.bottom - this.top);
    }

    public WidgetFrame() {
        this.widget = null;
        this.left = 0;
        this.top = 0;
        this.right = 0;
        this.bottom = 0;
        this.pivotX = Float.NaN;
        this.pivotY = Float.NaN;
        this.rotationX = Float.NaN;
        this.rotationY = Float.NaN;
        this.rotationZ = Float.NaN;
        this.translationX = Float.NaN;
        this.translationY = Float.NaN;
        this.translationZ = Float.NaN;
        this.scaleX = Float.NaN;
        this.scaleY = Float.NaN;
        this.alpha = Float.NaN;
        this.interpolatedPos = Float.NaN;
        this.visibility = 0;
        this.mCustom = new HashMap<>();
        this.name = null;
    }

    public WidgetFrame(ConstraintWidget constraintWidget) {
        this.widget = null;
        this.left = 0;
        this.top = 0;
        this.right = 0;
        this.bottom = 0;
        this.pivotX = Float.NaN;
        this.pivotY = Float.NaN;
        this.rotationX = Float.NaN;
        this.rotationY = Float.NaN;
        this.rotationZ = Float.NaN;
        this.translationX = Float.NaN;
        this.translationY = Float.NaN;
        this.translationZ = Float.NaN;
        this.scaleX = Float.NaN;
        this.scaleY = Float.NaN;
        this.alpha = Float.NaN;
        this.interpolatedPos = Float.NaN;
        this.visibility = 0;
        this.mCustom = new HashMap<>();
        this.name = null;
        this.widget = constraintWidget;
    }

    public WidgetFrame(WidgetFrame widgetFrame) {
        this.widget = null;
        this.left = 0;
        this.top = 0;
        this.right = 0;
        this.bottom = 0;
        this.pivotX = Float.NaN;
        this.pivotY = Float.NaN;
        this.rotationX = Float.NaN;
        this.rotationY = Float.NaN;
        this.rotationZ = Float.NaN;
        this.translationX = Float.NaN;
        this.translationY = Float.NaN;
        this.translationZ = Float.NaN;
        this.scaleX = Float.NaN;
        this.scaleY = Float.NaN;
        this.alpha = Float.NaN;
        this.interpolatedPos = Float.NaN;
        this.visibility = 0;
        this.mCustom = new HashMap<>();
        this.name = null;
        this.widget = widgetFrame.widget;
        this.left = widgetFrame.left;
        this.top = widgetFrame.top;
        this.right = widgetFrame.right;
        this.bottom = widgetFrame.bottom;
        updateAttributes(widgetFrame);
    }

    public void updateAttributes(WidgetFrame widgetFrame) {
        this.pivotX = widgetFrame.pivotX;
        this.pivotY = widgetFrame.pivotY;
        this.rotationX = widgetFrame.rotationX;
        this.rotationY = widgetFrame.rotationY;
        this.rotationZ = widgetFrame.rotationZ;
        this.translationX = widgetFrame.translationX;
        this.translationY = widgetFrame.translationY;
        this.translationZ = widgetFrame.translationZ;
        this.scaleX = widgetFrame.scaleX;
        this.scaleY = widgetFrame.scaleY;
        this.alpha = widgetFrame.alpha;
        this.visibility = widgetFrame.visibility;
        this.mCustom.clear();
        if (widgetFrame != null) {
            for (CustomVariable customVariable : widgetFrame.mCustom.values()) {
                this.mCustom.put(customVariable.getName(), customVariable.copy());
            }
        }
    }

    public boolean isDefaultTransform() {
        return Float.isNaN(this.rotationX) && Float.isNaN(this.rotationY) && Float.isNaN(this.rotationZ) && Float.isNaN(this.translationX) && Float.isNaN(this.translationY) && Float.isNaN(this.translationZ) && Float.isNaN(this.scaleX) && Float.isNaN(this.scaleY) && Float.isNaN(this.alpha);
    }

    public static void interpolate(int i2, int i3, WidgetFrame widgetFrame, WidgetFrame widgetFrame2, WidgetFrame widgetFrame3, Transition transition, float f2) {
        float f3;
        int i4;
        int i5;
        float f4 = 100.0f * f2;
        int i6 = (int) f4;
        int i7 = widgetFrame2.left;
        int i8 = widgetFrame2.top;
        int i9 = widgetFrame3.left;
        int i10 = widgetFrame3.top;
        int i11 = widgetFrame2.right - i7;
        int i12 = widgetFrame2.bottom - i8;
        int i13 = widgetFrame3.right - i9;
        int i14 = widgetFrame3.bottom - i10;
        float f5 = widgetFrame2.alpha;
        float f6 = widgetFrame3.alpha;
        if (widgetFrame2.visibility == 8) {
            i7 = (int) (i7 - (i13 / 2.0f));
            i8 = (int) (i8 - (i14 / 2.0f));
            if (Float.isNaN(f5)) {
                i12 = i14;
                i11 = i13;
                f5 = 0.0f;
            } else {
                i11 = i13;
                i12 = i14;
            }
        }
        if (widgetFrame3.visibility == 8) {
            i9 = (int) (i9 - (i11 / 2.0f));
            i10 = (int) (i10 - (i12 / 2.0f));
            i13 = i11;
            i14 = i12;
            if (Float.isNaN(f6)) {
                f6 = 0.0f;
            }
        }
        if (Float.isNaN(f5) && !Float.isNaN(f6)) {
            f5 = 1.0f;
        }
        if (!Float.isNaN(f5) && Float.isNaN(f6)) {
            f6 = 1.0f;
        }
        if (widgetFrame2.visibility == 4) {
            f5 = 0.0f;
        }
        if (widgetFrame3.visibility == 4) {
            f6 = 0.0f;
        }
        if (widgetFrame.widget != null && transition.hasPositionKeyframes()) {
            Transition.KeyPosition keyPositionFindPreviousPosition = transition.findPreviousPosition(widgetFrame.widget.stringId, i6);
            Transition.KeyPosition keyPositionFindNextPosition = transition.findNextPosition(widgetFrame.widget.stringId, i6);
            if (keyPositionFindPreviousPosition == keyPositionFindNextPosition) {
                keyPositionFindNextPosition = null;
            }
            if (keyPositionFindPreviousPosition != null) {
                i7 = (int) (keyPositionFindPreviousPosition.f125x * i2);
                i8 = (int) (keyPositionFindPreviousPosition.f126y * i3);
                i4 = keyPositionFindPreviousPosition.frame;
            } else {
                i4 = 0;
            }
            if (keyPositionFindNextPosition != null) {
                i9 = (int) (keyPositionFindNextPosition.f125x * i2);
                i10 = (int) (keyPositionFindNextPosition.f126y * i3);
                i5 = keyPositionFindNextPosition.frame;
            } else {
                i5 = 100;
            }
            f3 = (f4 - i4) / (i5 - i4);
        } else {
            f3 = f2;
        }
        widgetFrame.widget = widgetFrame2.widget;
        int i15 = (int) (i7 + ((i9 - i7) * f3));
        widgetFrame.left = i15;
        int i16 = (int) (i8 + (f3 * (i10 - i8)));
        widgetFrame.top = i16;
        float f7 = 1.0f - f2;
        widgetFrame.right = i15 + ((int) ((i11 * f7) + (i13 * f2)));
        widgetFrame.bottom = i16 + ((int) ((f7 * i12) + (i14 * f2)));
        widgetFrame.pivotX = interpolate(widgetFrame2.pivotX, widgetFrame3.pivotX, 0.5f, f2);
        widgetFrame.pivotY = interpolate(widgetFrame2.pivotY, widgetFrame3.pivotY, 0.5f, f2);
        widgetFrame.rotationX = interpolate(widgetFrame2.rotationX, widgetFrame3.rotationX, 0.0f, f2);
        widgetFrame.rotationY = interpolate(widgetFrame2.rotationY, widgetFrame3.rotationY, 0.0f, f2);
        widgetFrame.rotationZ = interpolate(widgetFrame2.rotationZ, widgetFrame3.rotationZ, 0.0f, f2);
        widgetFrame.scaleX = interpolate(widgetFrame2.scaleX, widgetFrame3.scaleX, 1.0f, f2);
        widgetFrame.scaleY = interpolate(widgetFrame2.scaleY, widgetFrame3.scaleY, 1.0f, f2);
        widgetFrame.translationX = interpolate(widgetFrame2.translationX, widgetFrame3.translationX, 0.0f, f2);
        widgetFrame.translationY = interpolate(widgetFrame2.translationY, widgetFrame3.translationY, 0.0f, f2);
        widgetFrame.translationZ = interpolate(widgetFrame2.translationZ, widgetFrame3.translationZ, 0.0f, f2);
        widgetFrame.alpha = interpolate(f5, f6, 1.0f, f2);
        Set<String> setKeySet = widgetFrame3.mCustom.keySet();
        widgetFrame.mCustom.clear();
        for (String str : setKeySet) {
            if (widgetFrame2.mCustom.containsKey(str)) {
                CustomVariable customVariable = widgetFrame2.mCustom.get(str);
                CustomVariable customVariable2 = widgetFrame3.mCustom.get(str);
                CustomVariable customVariable3 = new CustomVariable(customVariable);
                widgetFrame.mCustom.put(str, customVariable3);
                if (customVariable.numberOfInterpolatedValues() == 1) {
                    customVariable3.setValue(Float.valueOf(interpolate(customVariable.getValueToInterpolate(), customVariable2.getValueToInterpolate(), 0.0f, f2)));
                } else {
                    int iNumberOfInterpolatedValues = customVariable.numberOfInterpolatedValues();
                    float[] fArr = new float[iNumberOfInterpolatedValues];
                    float[] fArr2 = new float[iNumberOfInterpolatedValues];
                    customVariable.getValuesToInterpolate(fArr);
                    customVariable2.getValuesToInterpolate(fArr2);
                    for (int i17 = 0; i17 < iNumberOfInterpolatedValues; i17++) {
                        fArr[i17] = interpolate(fArr[i17], fArr2[i17], 0.0f, f2);
                        customVariable3.setValue(fArr);
                    }
                }
            }
        }
    }

    private static float interpolate(float f2, float f3, float f4, float f5) {
        boolean zIsNaN = Float.isNaN(f2);
        boolean zIsNaN2 = Float.isNaN(f3);
        if (zIsNaN && zIsNaN2) {
            return Float.NaN;
        }
        if (zIsNaN) {
            f2 = f4;
        }
        if (zIsNaN2) {
            f3 = f4;
        }
        return f2 + (f5 * (f3 - f2));
    }

    public float centerX() {
        return this.left + ((this.right - r1) / 2.0f);
    }

    public float centerY() {
        return this.top + ((this.bottom - r1) / 2.0f);
    }

    public WidgetFrame update() {
        ConstraintWidget constraintWidget = this.widget;
        if (constraintWidget != null) {
            this.left = constraintWidget.getLeft();
            this.top = this.widget.getTop();
            this.right = this.widget.getRight();
            this.bottom = this.widget.getBottom();
            updateAttributes(this.widget.frame);
        }
        return this;
    }

    public WidgetFrame update(ConstraintWidget constraintWidget) {
        if (constraintWidget == null) {
            return this;
        }
        this.widget = constraintWidget;
        update();
        return this;
    }

    public void addCustomColor(String str, int i2) {
        setCustomAttribute(str, TypedValues.Custom.TYPE_COLOR, i2);
    }

    public int getCustomColor(String str) {
        if (this.mCustom.containsKey(str)) {
            return this.mCustom.get(str).getColorValue();
        }
        return -21880;
    }

    public void addCustomFloat(String str, float f2) {
        setCustomAttribute(str, 901, f2);
    }

    public float getCustomFloat(String str) {
        if (this.mCustom.containsKey(str)) {
            return this.mCustom.get(str).getFloatValue();
        }
        return Float.NaN;
    }

    public void setCustomAttribute(String str, int i2, float f2) {
        if (this.mCustom.containsKey(str)) {
            this.mCustom.get(str).setFloatValue(f2);
        } else {
            this.mCustom.put(str, new CustomVariable(str, i2, f2));
        }
    }

    public void setCustomAttribute(String str, int i2, int i3) {
        if (this.mCustom.containsKey(str)) {
            this.mCustom.get(str).setIntValue(i3);
        } else {
            this.mCustom.put(str, new CustomVariable(str, i2, i3));
        }
    }

    public void setCustomAttribute(String str, int i2, boolean z2) {
        if (this.mCustom.containsKey(str)) {
            this.mCustom.get(str).setBooleanValue(z2);
        } else {
            this.mCustom.put(str, new CustomVariable(str, i2, z2));
        }
    }

    public void setCustomAttribute(String str, int i2, String str2) {
        if (this.mCustom.containsKey(str)) {
            this.mCustom.get(str).setStringValue(str2);
        } else {
            this.mCustom.put(str, new CustomVariable(str, i2, str2));
        }
    }

    public CustomVariable getCustomAttribute(String str) {
        return this.mCustom.get(str);
    }

    public Set<String> getCustomAttributeNames() {
        return this.mCustom.keySet();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public boolean setValue(String str, CLElement cLElement) throws CLParsingException {
        str.hashCode();
        byte b2 = -1;
        switch (str.hashCode()) {
            case -1881940865:
                if (str.equals("phone_orientation")) {
                    b2 = 0;
                }
                break;
            case -1383228885:
                if (str.equals(ViewProps.BOTTOM)) {
                    b2 = 1;
                }
                break;
            case -1349088399:
                if (str.equals(SchedulerSupport.CUSTOM)) {
                    b2 = 2;
                }
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    b2 = 3;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    b2 = 4;
                }
                break;
            case -1249320804:
                if (str.equals("rotationZ")) {
                    b2 = 5;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    b2 = 6;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    b2 = 7;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    b2 = 8;
                }
                break;
            case -987906986:
                if (str.equals("pivotX")) {
                    b2 = 9;
                }
                break;
            case -987906985:
                if (str.equals("pivotY")) {
                    b2 = 10;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    b2 = Ascii.VT;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    b2 = Ascii.FF;
                }
                break;
            case 115029:
                if (str.equals("top")) {
                    b2 = Ascii.CR;
                }
                break;
            case 3317767:
                if (str.equals("left")) {
                    b2 = Ascii.SO;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    b2 = Ascii.SI;
                }
                break;
            case 108511772:
                if (str.equals(ViewProps.RIGHT)) {
                    b2 = 16;
                }
                break;
            case 642850769:
                if (str.equals("interpolatedPos")) {
                    b2 = 17;
                }
                break;
        }
        switch (b2) {
            case 0:
                phone_orientation = cLElement.getFloat();
                return true;
            case 1:
                this.bottom = cLElement.getInt();
                return true;
            case 2:
                parseCustom(cLElement);
                return true;
            case 3:
                this.rotationX = cLElement.getFloat();
                return true;
            case 4:
                this.rotationY = cLElement.getFloat();
                return true;
            case 5:
                this.rotationZ = cLElement.getFloat();
                return true;
            case 6:
                this.translationX = cLElement.getFloat();
                return true;
            case 7:
                this.translationY = cLElement.getFloat();
                return true;
            case 8:
                this.translationZ = cLElement.getFloat();
                return true;
            case 9:
                this.pivotX = cLElement.getFloat();
                return true;
            case 10:
                this.pivotY = cLElement.getFloat();
                return true;
            case 11:
                this.scaleX = cLElement.getFloat();
                return true;
            case 12:
                this.scaleY = cLElement.getFloat();
                return true;
            case 13:
                this.top = cLElement.getInt();
                return true;
            case 14:
                this.left = cLElement.getInt();
                return true;
            case 15:
                this.alpha = cLElement.getFloat();
                return true;
            case 16:
                this.right = cLElement.getInt();
                return true;
            case 17:
                this.interpolatedPos = cLElement.getFloat();
                return true;
            default:
                return false;
        }
    }

    public String getId() {
        ConstraintWidget constraintWidget = this.widget;
        if (constraintWidget == null) {
            return "unknown";
        }
        return constraintWidget.stringId;
    }

    void parseCustom(CLElement cLElement) throws CLParsingException {
        CLObject cLObject = (CLObject) cLElement;
        int size = cLObject.size();
        for (int i2 = 0; i2 < size; i2++) {
            CLKey cLKey = (CLKey) cLObject.get(i2);
            cLKey.content();
            CLElement value = cLKey.getValue();
            String strContent = value.content();
            if (strContent.matches("#[0-9a-fA-F]+")) {
                setCustomAttribute(cLKey.content(), TypedValues.Custom.TYPE_COLOR, Integer.parseInt(strContent.substring(1), 16));
            } else if (value instanceof CLNumber) {
                setCustomAttribute(cLKey.content(), 901, value.getFloat());
            } else {
                setCustomAttribute(cLKey.content(), TypedValues.Custom.TYPE_STRING, strContent);
            }
        }
    }

    public StringBuilder serialize(StringBuilder sb) {
        return serialize(sb, false);
    }

    public StringBuilder serialize(StringBuilder sb, boolean z2) {
        sb.append("{\n");
        add(sb, "left", this.left);
        add(sb, "top", this.top);
        add(sb, ViewProps.RIGHT, this.right);
        add(sb, ViewProps.BOTTOM, this.bottom);
        add(sb, "pivotX", this.pivotX);
        add(sb, "pivotY", this.pivotY);
        add(sb, "rotationX", this.rotationX);
        add(sb, "rotationY", this.rotationY);
        add(sb, "rotationZ", this.rotationZ);
        add(sb, "translationX", this.translationX);
        add(sb, "translationY", this.translationY);
        add(sb, "translationZ", this.translationZ);
        add(sb, "scaleX", this.scaleX);
        add(sb, "scaleY", this.scaleY);
        add(sb, "alpha", this.alpha);
        add(sb, "visibility", this.visibility);
        add(sb, "interpolatedPos", this.interpolatedPos);
        if (this.widget != null) {
            for (ConstraintAnchor.Type type : ConstraintAnchor.Type.values()) {
                serializeAnchor(sb, type);
            }
        }
        if (z2) {
            add(sb, "phone_orientation", phone_orientation);
        }
        if (z2) {
            add(sb, "phone_orientation", phone_orientation);
        }
        if (this.mCustom.size() != 0) {
            sb.append("custom : {\n");
            for (String str : this.mCustom.keySet()) {
                CustomVariable customVariable = this.mCustom.get(str);
                sb.append(str);
                sb.append(": ");
                switch (customVariable.getType()) {
                    case 900:
                        sb.append(customVariable.getIntegerValue());
                        sb.append(",\n");
                        break;
                    case 901:
                    case TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                        sb.append(customVariable.getFloatValue());
                        sb.append(",\n");
                        break;
                    case TypedValues.Custom.TYPE_COLOR /* 902 */:
                        sb.append("'");
                        sb.append(CustomVariable.colorString(customVariable.getIntegerValue()));
                        sb.append("',\n");
                        break;
                    case TypedValues.Custom.TYPE_STRING /* 903 */:
                        sb.append("'");
                        sb.append(customVariable.getStringValue());
                        sb.append("',\n");
                        break;
                    case TypedValues.Custom.TYPE_BOOLEAN /* 904 */:
                        sb.append("'");
                        sb.append(customVariable.getBooleanValue());
                        sb.append("',\n");
                        break;
                }
            }
            sb.append("}\n");
        }
        sb.append("}\n");
        return sb;
    }

    private void serializeAnchor(StringBuilder sb, ConstraintAnchor.Type type) {
        ConstraintAnchor anchor = this.widget.getAnchor(type);
        if (anchor != null && anchor.mTarget != null) {
            sb.append("Anchor");
            sb.append(type.name());
            sb.append(": ['");
            String str = anchor.mTarget.getOwner().stringId;
            if (str == null) {
                str = "#PARENT";
            }
            sb.append(str);
            sb.append("', '");
            sb.append(anchor.mTarget.getType().name());
            sb.append("', '");
            sb.append(anchor.mMargin);
            sb.append("'],\n");
        }
    }

    private static void add(StringBuilder sb, String str, int i2) {
        sb.append(str);
        sb.append(": ");
        sb.append(i2);
        sb.append(",\n");
    }

    private static void add(StringBuilder sb, String str, float f2) {
        if (Float.isNaN(f2)) {
            return;
        }
        sb.append(str);
        sb.append(": ");
        sb.append(f2);
        sb.append(",\n");
    }

    void printCustomAttributes() throws Throwable {
        String str;
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder sb = new StringBuilder(Wg.Zd("X\t", (short) (C1580rY.Xd() ^ (-24226)), (short) (C1580rY.Xd() ^ (-30702))));
        short sXd = (short) (Od.Xd() ^ (-14971));
        int[] iArr = new int["_WmY'f\\jd,RtbenXwgjmNvpyr|\u0004".length()];
        QB qb = new QB("_WmY'f\\jd,RtbenXwgjmNvpyr|\u0004");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Wg.vd("NM]0LPJ4P]V", (short) (FB.Xd() ^ 14680)), new Class[0]);
        try {
            method.setAccessible(true);
            StringBuilder sbAppend = sb.append((String) method.invoke(stackTraceElement, objArr)).append(Qg.kd(Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID, (short) (C1633zX.Xd() ^ (-1048)), (short) (C1633zX.Xd() ^ (-22549))));
            Class<?> cls = Class.forName(hg.Vd("\u0013\t\u001d\u0007R\u0010\u0004\u0010\bMq\u0012}~\u0006m\u000bxyzY\u007fw~u}\u0003", (short) (C1633zX.Xd() ^ (-26814)), (short) (C1633zX.Xd() ^ (-28992))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr2 = new Object[0];
            short sXd2 = (short) (C1633zX.Xd() ^ (-14870));
            int[] iArr2 = new int["\t\u0006\u0014j\u0007\u000b\u0001h\u000f\u0006y{\b".length()];
            QB qb2 = new QB("\t\u0006\u0014j\u0007\u000b\u0001h\u000f\u0006y{\b");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(sXd2 + i3 + xuXd2.CK(iKK2));
                i3++;
            }
            Method method2 = cls.getMethod(new String(iArr2, 0, i3), clsArr);
            try {
                method2.setAccessible(true);
                StringBuilder sbAppend2 = sbAppend.append(((Integer) method2.invoke(stackTraceElement, objArr2)).intValue());
                short sXd3 = (short) (FB.Xd() ^ 27003);
                int[] iArr3 = new int["}u".length()];
                QB qb3 = new QB("}u");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd3 ^ i4));
                    i4++;
                }
                StringBuilder sbAppend3 = sbAppend2.append(new String(iArr3, 0, i4));
                Object[] objArr3 = new Object[0];
                Method method3 = Class.forName(C1561oA.Yd("+#9%r2(60w\u001e@.1:$C369\u001aB<E>HO", (short) (FB.Xd() ^ 23245))).getMethod(Xg.qd("\t\b\u0018q\u000b\u001b\u0010\u0018\u000ex\r\u001a\u0013", (short) (OY.Xd() ^ 28140), (short) (OY.Xd() ^ 26405)), new Class[0]);
                try {
                    method3.setAccessible(true);
                    StringBuilder sbAppend4 = new StringBuilder().append(sbAppend3.append((String) method3.invoke(stackTraceElement, objArr3)).toString());
                    String strWd = Jg.Wd("g", (short) (C1499aX.Xd() ^ (-17129)), (short) (C1499aX.Xd() ^ (-32286)));
                    String string = sbAppend4.append(strWd).append(hashCode() % 1000).toString();
                    if (this.widget != null) {
                        str = string + ZO.xd("q", (short) (C1499aX.Xd() ^ (-24286)), (short) (C1499aX.Xd() ^ (-3029))) + (this.widget.hashCode() % 1000) + strWd;
                    } else {
                        str = string + C1626yg.Ud("E!W\b:Y", (short) (OY.Xd() ^ 2329), (short) (OY.Xd() ^ 28367));
                    }
                    HashMap<String, CustomVariable> map = this.mCustom;
                    if (map != null) {
                        Iterator<String> it = map.keySet().iterator();
                        while (it.hasNext()) {
                            System.out.println(str + this.mCustom.get(it.next()).toString());
                        }
                    }
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    void logv(String str) throws Throwable {
        String string;
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder sb = new StringBuilder(C1561oA.yd("PK", (short) (ZN.Xd() ^ 19144)));
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Yd("<4J6\u0004C9GA\t/Q?BK5TDGJ+SMVOY`", (short) (Od.Xd() ^ (-11060)))).getMethod(Xg.qd("76F\u0019=A;%9F?", (short) (OY.Xd() ^ 20295), (short) (OY.Xd() ^ 23980)), new Class[0]);
        try {
            method.setAccessible(true);
            StringBuilder sbAppend = sb.append((String) method.invoke(stackTraceElement, objArr)).append(Jg.Wd("\f", (short) (ZN.Xd() ^ 23675), (short) (ZN.Xd() ^ 21434)));
            short sXd = (short) (C1607wl.Xd() ^ 1612);
            short sXd2 = (short) (C1607wl.Xd() ^ 28700);
            int[] iArr = new int[",b|W\u0003w\u0001\tD7+}&\u007f\u001aE\u0012l[\tbCE(0\u0011o".length()];
            QB qb = new QB(",b|W\u0003w\u0001\tD7+}&\u007f\u001aE\u0012l[\tbCE(0\u0011o");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
                i2++;
            }
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(new String(iArr, 0, i2)).getMethod(C1626yg.Ud("Q^C\u0010\u000b\u007f\u0004\u00024b\u001al\u0013", (short) (C1499aX.Xd() ^ (-24942)), (short) (C1499aX.Xd() ^ (-7342))), new Class[0]);
            try {
                method2.setAccessible(true);
                StringBuilder sbAppend2 = sbAppend.append(((Integer) method2.invoke(stackTraceElement, objArr2)).intValue()).append(Ig.wd("Cv", (short) (OY.Xd() ^ 7559)));
                Class<?> cls = Class.forName(EO.Od("\u0017T9\u0007=(C\u0003Z/P\u0016MOAN9\bT@^Lq\u007f\u0016%K", (short) (Od.Xd() ^ (-13703))));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr3 = new Object[0];
                short sXd3 = (short) (C1580rY.Xd() ^ (-31180));
                int[] iArr2 = new int["PM[3JXKQE.@KB".length()];
                QB qb2 = new QB("PM[3JXKQE.@KB");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(sXd3 + sXd3 + sXd3 + i3 + xuXd2.CK(iKK2));
                    i3++;
                }
                Method method3 = cls.getMethod(new String(iArr2, 0, i3), clsArr);
                try {
                    method3.setAccessible(true);
                    StringBuilder sbAppend3 = new StringBuilder().append(sbAppend2.append((String) method3.invoke(stackTraceElement, objArr3)).toString());
                    String strZd = C1593ug.zd(RemoteSettings.FORWARD_SLASH_STRING, (short) (Od.Xd() ^ (-1518)), (short) (Od.Xd() ^ (-23636)));
                    String string2 = sbAppend3.append(strZd).append(hashCode() % 1000).toString();
                    if (this.widget != null) {
                        StringBuilder sbAppend4 = new StringBuilder().append(string2);
                        short sXd4 = (short) (C1607wl.Xd() ^ 26299);
                        int[] iArr3 = new int["\u0014".length()];
                        QB qb3 = new QB("\u0014");
                        int i4 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i4] = xuXd3.fK(sXd4 + sXd4 + i4 + xuXd3.CK(iKK3));
                            i4++;
                        }
                        string = sbAppend4.append(new String(iArr3, 0, i4)).append(this.widget.hashCode() % 1000).toString();
                    } else {
                        string = string2 + C1561oA.Kd("j\u000b\u0013\u000b\f", (short) (Od.Xd() ^ (-26346)));
                    }
                    System.out.println(string + strZd + str);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }
}
