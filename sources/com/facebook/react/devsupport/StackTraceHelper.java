package com.facebook.react.devsupport;

import com.dynatrace.android.agent.Global;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.devsupport.interfaces.StackFrame;
import com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
public class StackTraceHelper {
    public static final String COLUMN_KEY = "column";
    public static final String FILE_KEY = "file";
    public static final String ID_KEY = "id";
    public static final String IS_FATAL_KEY = "isFatal";
    public static final String LINE_NUMBER_KEY = "lineNumber";
    public static final String MESSAGE_KEY = "message";
    public static final String METHOD_NAME_KEY = "methodName";
    private static final Pattern STACK_FRAME_PATTERN1 = Pattern.compile("^(?:(.*?)@)?(.*?)\\:([0-9]+)\\:([0-9]+)$");
    private static final Pattern STACK_FRAME_PATTERN2 = Pattern.compile("\\s*(?:at)\\s*(.+?)\\s*[@(](.*):([0-9]+):([0-9]+)[)]$");
    public static final String STACK_KEY = "stack";

    public static class StackFrameImpl implements StackFrame {
        private final int mColumn;
        private final String mFile;
        private final String mFileName;
        private final boolean mIsCollapsed;
        private final int mLine;
        private final String mMethod;

        private StackFrameImpl(String str, String str2, int i2, int i3) {
            this(str, str2, i2, i3, false);
        }

        /* synthetic */ StackFrameImpl(String str, String str2, int i2, int i3, StackFrameImplIA stackFrameImplIA) {
            this(str, str2, i2, i3);
        }

        private StackFrameImpl(String str, String str2, int i2, int i3, boolean z2) {
            this.mFile = str;
            this.mMethod = str2;
            this.mLine = i2;
            this.mColumn = i3;
            this.mFileName = str != null ? new File(str).getName() : "";
            this.mIsCollapsed = z2;
        }

        /* synthetic */ StackFrameImpl(String str, String str2, int i2, int i3, boolean z2, StackFrameImplIA stackFrameImplIA) {
            this(str, str2, i2, i3, z2);
        }

        private StackFrameImpl(String str, String str2, String str3, int i2, int i3) {
            this.mFile = str;
            this.mFileName = str2;
            this.mMethod = str3;
            this.mLine = i2;
            this.mColumn = i3;
            this.mIsCollapsed = false;
        }

        /* synthetic */ StackFrameImpl(String str, String str2, String str3, int i2, int i3, StackFrameImplIA stackFrameImplIA) {
            this(str, str2, str3, i2, i3);
        }

        @Override // com.facebook.react.devsupport.interfaces.StackFrame
        public int getColumn() {
            return this.mColumn;
        }

        @Override // com.facebook.react.devsupport.interfaces.StackFrame
        public String getFile() {
            return this.mFile;
        }

        @Override // com.facebook.react.devsupport.interfaces.StackFrame
        public String getFileName() {
            return this.mFileName;
        }

        @Override // com.facebook.react.devsupport.interfaces.StackFrame
        public int getLine() {
            return this.mLine;
        }

        @Override // com.facebook.react.devsupport.interfaces.StackFrame
        public String getMethod() {
            return this.mMethod;
        }

        @Override // com.facebook.react.devsupport.interfaces.StackFrame
        public boolean isCollapsed() {
            return this.mIsCollapsed;
        }

        @Override // com.facebook.react.devsupport.interfaces.StackFrame
        public JSONObject toJSON() {
            return new JSONObject(MapBuilder.of("file", getFile(), "methodName", getMethod(), "lineNumber", Integer.valueOf(getLine()), "column", Integer.valueOf(getColumn()), "collapse", Boolean.valueOf(isCollapsed())));
        }
    }

    public static StackFrame[] convertJavaStackTrace(Throwable th) throws Throwable {
        StackTraceElement[] stackTrace = th.getStackTrace();
        StackFrame[] stackFrameArr = new StackFrame[stackTrace.length];
        for (int i2 = 0; i2 < stackTrace.length; i2++) {
            StackTraceElement stackTraceElement = stackTrace[i2];
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1593ug.zd("[SiU#bXf`(Np^ajTscfiJrlunx\u007f", (short) (C1633zX.Xd() ^ (-10939)), (short) (C1633zX.Xd() ^ (-9994)))).getMethod(C1561oA.od("UR`.VJ[Z4FQH", (short) (C1580rY.Xd() ^ (-18431))), new Class[0]);
            try {
                method.setAccessible(true);
                String str = (String) method.invoke(stackTraceElement, objArr);
                StackTraceElement stackTraceElement2 = stackTrace[i2];
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(C1561oA.Kd("@8N:\bG=KE\r3UCFO9XHKN/WQZS]d", (short) (OY.Xd() ^ 22689))).getMethod(Wg.Zd("|=gD\u0002R$Y\u0010v9", (short) (FB.Xd() ^ 17084), (short) (FB.Xd() ^ 14986)), new Class[0]);
                try {
                    method2.setAccessible(true);
                    String str2 = (String) method2.invoke(stackTraceElement2, objArr2);
                    StackTraceElement stackTraceElement3 = stackTrace[i2];
                    Class<?> cls = Class.forName(C1561oA.Xd("91G3\u0001@6D>\u0006,N<?H2QADG(PJSLV]", (short) (C1607wl.Xd() ^ 14046)));
                    Class<?>[] clsArr = new Class[0];
                    Object[] objArr3 = new Object[0];
                    short sXd = (short) (C1580rY.Xd() ^ (-22356));
                    int[] iArr = new int["\u0013\u0012\u001ew\u0015%\u0016\u001e\u0018\u0003\u0013 \u001d".length()];
                    QB qb = new QB("\u0013\u0012\u001ew\u0015%\u0016\u001e\u0018\u0003\u0013 \u001d");
                    int i3 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i3] = xuXd.fK((sXd ^ i3) + xuXd.CK(iKK));
                        i3++;
                    }
                    Method method3 = cls.getMethod(new String(iArr, 0, i3), clsArr);
                    try {
                        method3.setAccessible(true);
                        String str3 = (String) method3.invoke(stackTraceElement3, objArr3);
                        StackTraceElement stackTraceElement4 = stackTrace[i2];
                        short sXd2 = (short) (Od.Xd() ^ (-5039));
                        short sXd3 = (short) (Od.Xd() ^ (-8395));
                        int[] iArr2 = new int["lbv`,i]ia'KkWX_GdRST3YQXOW\\".length()];
                        QB qb2 = new QB("lbv`,i]ia'KkWX_GdRST3YQXOW\\");
                        int i4 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i4] = xuXd2.fK(((sXd2 + i4) + xuXd2.CK(iKK2)) - sXd3);
                            i4++;
                        }
                        Object[] objArr4 = new Object[0];
                        Method method4 = Class.forName(new String(iArr2, 0, i4)).getMethod(hg.Vd("UR`7SWM5[RFHT", (short) (C1607wl.Xd() ^ 29188), (short) (C1607wl.Xd() ^ 30328)), new Class[0]);
                        try {
                            method4.setAccessible(true);
                            stackFrameArr[i2] = new StackFrameImpl(str, str2, str3, ((Integer) method4.invoke(stackTraceElement4, objArr4)).intValue(), -1);
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        }
        return stackFrameArr;
    }

    public static StackFrame[] convertJsStackTrace(ReadableArray readableArray) {
        int size = readableArray != null ? readableArray.size() : 0;
        StackFrame[] stackFrameArr = new StackFrame[size];
        for (int i2 = 0; i2 < size; i2++) {
            ReadableType type = readableArray.getType(i2);
            if (type == ReadableType.Map) {
                ReadableMap map = readableArray.getMap(i2);
                String string = map.getString("methodName");
                String string2 = map.getString("file");
                boolean z2 = map.hasKey("collapse") && !map.isNull("collapse") && map.getBoolean("collapse");
                int i3 = -1;
                int i4 = (!map.hasKey("lineNumber") || map.isNull("lineNumber")) ? -1 : map.getInt("lineNumber");
                if (map.hasKey("column") && !map.isNull("column")) {
                    i3 = map.getInt("column");
                }
                stackFrameArr[i2] = new StackFrameImpl(string2, string, i4, i3, z2);
            } else if (type == ReadableType.String) {
                stackFrameArr[i2] = new StackFrameImpl((String) null, readableArray.getString(i2), -1, -1);
            }
        }
        return stackFrameArr;
    }

    public static StackFrame[] convertJsStackTrace(String str) {
        String[] strArrSplit = str.split("\n");
        StackFrame[] stackFrameArr = new StackFrame[strArrSplit.length];
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            Matcher matcher = STACK_FRAME_PATTERN1.matcher(strArrSplit[i2]);
            Matcher matcher2 = STACK_FRAME_PATTERN2.matcher(strArrSplit[i2]);
            if (matcher2.find()) {
                matcher = matcher2;
            } else {
                if (!matcher.find()) {
                    stackFrameArr[i2] = new StackFrameImpl((String) null, strArrSplit[i2], -1, -1);
                }
            }
            stackFrameArr[i2] = new StackFrameImpl(matcher.group(2), matcher.group(1) == null ? "(unknown)" : matcher.group(1), Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)));
        }
        return stackFrameArr;
    }

    public static StackFrame[] convertJsStackTrace(JSONArray jSONArray) {
        int length = jSONArray != null ? jSONArray.length() : 0;
        StackFrame[] stackFrameArr = new StackFrame[length];
        for (int i2 = 0; i2 < length; i2++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                String string = jSONObject.getString("methodName");
                String string2 = jSONObject.getString("file");
                int i3 = -1;
                int i4 = (!jSONObject.has("lineNumber") || jSONObject.isNull("lineNumber")) ? -1 : jSONObject.getInt("lineNumber");
                if (jSONObject.has("column") && !jSONObject.isNull("column")) {
                    i3 = jSONObject.getInt("column");
                }
                stackFrameArr[i2] = new StackFrameImpl(string2, string, i4, i3, jSONObject.has("collapse") && !jSONObject.isNull("collapse") && jSONObject.getBoolean("collapse"));
            } catch (JSONException e2) {
                throw new RuntimeException(e2);
            }
        }
        return stackFrameArr;
    }

    public static JavaOnlyMap convertParsedError(ReactJsExceptionHandler.ParsedError parsedError) {
        List<ReactJsExceptionHandler.ParsedError.StackFrame> frames = parsedError.getFrames();
        ArrayList arrayList = new ArrayList();
        for (ReactJsExceptionHandler.ParsedError.StackFrame stackFrame : frames) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            javaOnlyMap.putDouble("column", stackFrame.getColumnNumber());
            javaOnlyMap.putDouble("lineNumber", stackFrame.getLineNumber());
            javaOnlyMap.putString("file", stackFrame.getFileName());
            javaOnlyMap.putString("methodName", stackFrame.getMethodName());
            arrayList.add(javaOnlyMap);
        }
        JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
        javaOnlyMap2.putString("message", parsedError.getMessage());
        javaOnlyMap2.putArray(STACK_KEY, JavaOnlyArray.from(arrayList));
        javaOnlyMap2.putInt("id", parsedError.getExceptionId());
        javaOnlyMap2.putBoolean(IS_FATAL_KEY, parsedError.isFatal());
        return javaOnlyMap2;
    }

    public static String formatFrameSource(StackFrame stackFrame) {
        StringBuilder sb = new StringBuilder();
        sb.append(stackFrame.getFileName());
        int line = stackFrame.getLine();
        if (line > 0) {
            sb.append(Global.COLON).append(line);
            int column = stackFrame.getColumn();
            if (column > 0) {
                sb.append(Global.COLON).append(column);
            }
        }
        return sb.toString();
    }

    public static String formatStackTrace(String str, StackFrame[] stackFrameArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(str).append("\n");
        for (StackFrame stackFrame : stackFrameArr) {
            sb.append(stackFrame.getMethod()).append("\n    ").append(formatFrameSource(stackFrame)).append("\n");
        }
        return sb.toString();
    }
}
