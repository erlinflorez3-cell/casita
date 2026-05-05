package com.facebook.react.bridge;

import com.dynatrace.android.agent.Global;
import com.facebook.debug.holder.PrinterHolder;
import com.facebook.debug.tags.ReactDebugOverlayTags;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.bridge.JavaModuleWrapper;
import com.facebook.systrace.SystraceMessage;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
class JavaMethodWrapper implements JavaModuleWrapper.NativeMethod {
    private ArgumentExtractor[] mArgumentExtractors;
    private Object[] mArguments;
    private boolean mArgumentsProcessed = false;
    private int mJSArgumentsNeeded;
    private final Method mMethod;
    private final JavaModuleWrapper mModuleWrapper;
    private final int mParamLength;
    private final Class[] mParameterTypes;
    private String mSignature;
    private String mType;
    private static final ArgumentExtractor<Boolean> ARGUMENT_EXTRACTOR_BOOLEAN = new ArgumentExtractor<Boolean>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.1
        AnonymousClass1() {
        }

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Boolean extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i2) {
            return Boolean.valueOf(readableArray.getBoolean(i2));
        }
    };
    private static final ArgumentExtractor<Double> ARGUMENT_EXTRACTOR_DOUBLE = new ArgumentExtractor<Double>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.2
        AnonymousClass2() {
        }

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Double extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i2) {
            return Double.valueOf(readableArray.getDouble(i2));
        }
    };
    private static final ArgumentExtractor<Float> ARGUMENT_EXTRACTOR_FLOAT = new ArgumentExtractor<Float>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.3
        AnonymousClass3() {
        }

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Float extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i2) {
            return Float.valueOf((float) readableArray.getDouble(i2));
        }
    };
    private static final ArgumentExtractor<Integer> ARGUMENT_EXTRACTOR_INTEGER = new ArgumentExtractor<Integer>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.4
        AnonymousClass4() {
        }

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Integer extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i2) {
            return Integer.valueOf((int) readableArray.getDouble(i2));
        }
    };
    private static final ArgumentExtractor<String> ARGUMENT_EXTRACTOR_STRING = new ArgumentExtractor<String>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.5
        AnonymousClass5() {
        }

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public String extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i2) {
            return readableArray.getString(i2);
        }
    };
    private static final ArgumentExtractor<ReadableArray> ARGUMENT_EXTRACTOR_ARRAY = new ArgumentExtractor<ReadableArray>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.6
        AnonymousClass6() {
        }

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public ReadableArray extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i2) {
            return readableArray.getArray(i2);
        }
    };
    private static final ArgumentExtractor<Dynamic> ARGUMENT_EXTRACTOR_DYNAMIC = new ArgumentExtractor<Dynamic>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.7
        AnonymousClass7() {
        }

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Dynamic extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i2) {
            return DynamicFromArray.create(readableArray, i2);
        }
    };
    private static final ArgumentExtractor<ReadableMap> ARGUMENT_EXTRACTOR_MAP = new ArgumentExtractor<ReadableMap>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.8
        AnonymousClass8() {
        }

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public ReadableMap extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i2) {
            return readableArray.getMap(i2);
        }
    };
    private static final ArgumentExtractor<Callback> ARGUMENT_EXTRACTOR_CALLBACK = new ArgumentExtractor<Callback>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.9
        AnonymousClass9() {
        }

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Callback extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i2) {
            if (readableArray.isNull(i2)) {
                return null;
            }
            return new CallbackImpl(jSInstance, (int) readableArray.getDouble(i2));
        }
    };
    private static final ArgumentExtractor<Promise> ARGUMENT_EXTRACTOR_PROMISE = new ArgumentExtractor<Promise>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.10
        AnonymousClass10() {
        }

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Promise extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i2) {
            return new PromiseImpl((Callback) JavaMethodWrapper.ARGUMENT_EXTRACTOR_CALLBACK.extractArgument(jSInstance, readableArray, i2), (Callback) JavaMethodWrapper.ARGUMENT_EXTRACTOR_CALLBACK.extractArgument(jSInstance, readableArray, i2 + 1));
        }

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public int getJSArgumentsNeeded() {
            return 2;
        }
    };
    private static final boolean DEBUG = PrinterHolder.getPrinter().shouldDisplayLogMessage(ReactDebugOverlayTags.BRIDGE_CALLS);

    /* JADX INFO: renamed from: com.facebook.react.bridge.JavaMethodWrapper$1 */
    class AnonymousClass1 extends ArgumentExtractor<Boolean> {
        AnonymousClass1() {
        }

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Boolean extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i2) {
            return Boolean.valueOf(readableArray.getBoolean(i2));
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.bridge.JavaMethodWrapper$10 */
    class AnonymousClass10 extends ArgumentExtractor<Promise> {
        AnonymousClass10() {
        }

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Promise extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i2) {
            return new PromiseImpl((Callback) JavaMethodWrapper.ARGUMENT_EXTRACTOR_CALLBACK.extractArgument(jSInstance, readableArray, i2), (Callback) JavaMethodWrapper.ARGUMENT_EXTRACTOR_CALLBACK.extractArgument(jSInstance, readableArray, i2 + 1));
        }

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public int getJSArgumentsNeeded() {
            return 2;
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.bridge.JavaMethodWrapper$2 */
    class AnonymousClass2 extends ArgumentExtractor<Double> {
        AnonymousClass2() {
        }

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Double extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i2) {
            return Double.valueOf(readableArray.getDouble(i2));
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.bridge.JavaMethodWrapper$3 */
    class AnonymousClass3 extends ArgumentExtractor<Float> {
        AnonymousClass3() {
        }

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Float extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i2) {
            return Float.valueOf((float) readableArray.getDouble(i2));
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.bridge.JavaMethodWrapper$4 */
    class AnonymousClass4 extends ArgumentExtractor<Integer> {
        AnonymousClass4() {
        }

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Integer extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i2) {
            return Integer.valueOf((int) readableArray.getDouble(i2));
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.bridge.JavaMethodWrapper$5 */
    class AnonymousClass5 extends ArgumentExtractor<String> {
        AnonymousClass5() {
        }

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public String extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i2) {
            return readableArray.getString(i2);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.bridge.JavaMethodWrapper$6 */
    class AnonymousClass6 extends ArgumentExtractor<ReadableArray> {
        AnonymousClass6() {
        }

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public ReadableArray extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i2) {
            return readableArray.getArray(i2);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.bridge.JavaMethodWrapper$7 */
    class AnonymousClass7 extends ArgumentExtractor<Dynamic> {
        AnonymousClass7() {
        }

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Dynamic extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i2) {
            return DynamicFromArray.create(readableArray, i2);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.bridge.JavaMethodWrapper$8 */
    class AnonymousClass8 extends ArgumentExtractor<ReadableMap> {
        AnonymousClass8() {
        }

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public ReadableMap extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i2) {
            return readableArray.getMap(i2);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.bridge.JavaMethodWrapper$9 */
    class AnonymousClass9 extends ArgumentExtractor<Callback> {
        AnonymousClass9() {
        }

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Callback extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i2) {
            if (readableArray.isNull(i2)) {
                return null;
            }
            return new CallbackImpl(jSInstance, (int) readableArray.getDouble(i2));
        }
    }

    private static abstract class ArgumentExtractor<T> {
        private ArgumentExtractor() {
        }

        /* synthetic */ ArgumentExtractor(ArgumentExtractorIA argumentExtractorIA) {
            this();
        }

        public abstract T extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i2);

        public int getJSArgumentsNeeded() {
            return 1;
        }
    }

    public JavaMethodWrapper(JavaModuleWrapper javaModuleWrapper, Method method, boolean z2) {
        this.mType = BaseJavaModule.METHOD_TYPE_ASYNC;
        this.mModuleWrapper = javaModuleWrapper;
        this.mMethod = method;
        method.setAccessible(true);
        Class<?>[] parameterTypes = method.getParameterTypes();
        this.mParameterTypes = parameterTypes;
        int length = parameterTypes.length;
        this.mParamLength = length;
        if (z2) {
            this.mType = BaseJavaModule.METHOD_TYPE_SYNC;
        } else {
            if (length <= 0 || parameterTypes[length - 1] != Promise.class) {
                return;
            }
            this.mType = BaseJavaModule.METHOD_TYPE_PROMISE;
        }
    }

    private ArgumentExtractor[] buildArgumentExtractors(Class[] clsArr) {
        ArgumentExtractor[] argumentExtractorArr = new ArgumentExtractor[clsArr.length];
        int jSArgumentsNeeded = 0;
        while (jSArgumentsNeeded < clsArr.length) {
            Class cls = clsArr[jSArgumentsNeeded];
            if (cls == Boolean.class || cls == Boolean.TYPE) {
                argumentExtractorArr[jSArgumentsNeeded] = ARGUMENT_EXTRACTOR_BOOLEAN;
            } else if (cls == Integer.class || cls == Integer.TYPE) {
                argumentExtractorArr[jSArgumentsNeeded] = ARGUMENT_EXTRACTOR_INTEGER;
            } else if (cls == Double.class || cls == Double.TYPE) {
                argumentExtractorArr[jSArgumentsNeeded] = ARGUMENT_EXTRACTOR_DOUBLE;
            } else if (cls == Float.class || cls == Float.TYPE) {
                argumentExtractorArr[jSArgumentsNeeded] = ARGUMENT_EXTRACTOR_FLOAT;
            } else if (cls == String.class) {
                argumentExtractorArr[jSArgumentsNeeded] = ARGUMENT_EXTRACTOR_STRING;
            } else if (cls == Callback.class) {
                argumentExtractorArr[jSArgumentsNeeded] = ARGUMENT_EXTRACTOR_CALLBACK;
            } else if (cls == Promise.class) {
                argumentExtractorArr[jSArgumentsNeeded] = ARGUMENT_EXTRACTOR_PROMISE;
                Assertions.assertCondition(jSArgumentsNeeded == clsArr.length - 1, "Promise must be used as last parameter only");
            } else if (cls == ReadableMap.class) {
                argumentExtractorArr[jSArgumentsNeeded] = ARGUMENT_EXTRACTOR_MAP;
            } else if (cls == ReadableArray.class) {
                argumentExtractorArr[jSArgumentsNeeded] = ARGUMENT_EXTRACTOR_ARRAY;
            } else {
                if (cls != Dynamic.class) {
                    throw new RuntimeException("Got unknown argument class: " + cls.getSimpleName());
                }
                argumentExtractorArr[jSArgumentsNeeded] = ARGUMENT_EXTRACTOR_DYNAMIC;
            }
            jSArgumentsNeeded += argumentExtractorArr[jSArgumentsNeeded].getJSArgumentsNeeded();
        }
        return argumentExtractorArr;
    }

    private String buildSignature(Method method, Class[] clsArr, boolean z2) {
        StringBuilder sb = new StringBuilder(clsArr.length + 2);
        if (z2) {
            sb.append(returnTypeToChar(method.getReturnType()));
            sb.append('.');
        } else {
            sb.append("v.");
        }
        int i2 = 0;
        while (i2 < clsArr.length) {
            Class cls = clsArr[i2];
            if (cls == Promise.class) {
                Assertions.assertCondition(i2 == clsArr.length - 1, "Promise must be used as last parameter only");
            }
            sb.append(paramTypeToChar(cls));
            i2++;
        }
        return sb.toString();
    }

    private int calculateJSArgumentsNeeded() {
        int jSArgumentsNeeded = 0;
        for (ArgumentExtractor argumentExtractor : (ArgumentExtractor[]) Assertions.assertNotNull(this.mArgumentExtractors)) {
            jSArgumentsNeeded += argumentExtractor.getJSArgumentsNeeded();
        }
        return jSArgumentsNeeded;
    }

    private static char commonTypeToChar(Class cls) {
        if (cls == Boolean.TYPE) {
            return 'z';
        }
        if (cls == Boolean.class) {
            return 'Z';
        }
        if (cls == Integer.TYPE) {
            return 'i';
        }
        if (cls == Integer.class) {
            return 'I';
        }
        if (cls == Double.TYPE) {
            return 'd';
        }
        if (cls == Double.class) {
            return 'D';
        }
        if (cls == Float.TYPE) {
            return 'f';
        }
        if (cls == Float.class) {
            return 'F';
        }
        return cls == String.class ? 'S' : (char) 0;
    }

    private static String createInvokeExceptionMessage(String str) {
        return "Could not invoke " + str;
    }

    private String getAffectedRange(int i2, int i3) {
        return i3 > 1 ? "" + i2 + Global.HYPHEN + ((i2 + i3) - 1) : "" + i2;
    }

    private static char paramTypeToChar(Class cls) {
        char cCommonTypeToChar = commonTypeToChar(cls);
        if (cCommonTypeToChar != 0) {
            return cCommonTypeToChar;
        }
        if (cls == Callback.class) {
            return 'X';
        }
        if (cls == Promise.class) {
            return 'P';
        }
        if (cls == ReadableMap.class) {
            return 'M';
        }
        if (cls == ReadableArray.class) {
            return 'A';
        }
        if (cls == Dynamic.class) {
            return 'Y';
        }
        throw new RuntimeException("Got unknown param class: " + cls.getSimpleName());
    }

    private void processArguments() {
        if (this.mArgumentsProcessed) {
            return;
        }
        SystraceMessage.beginSection(0L, "processArguments").arg("method", this.mModuleWrapper.getName() + "." + this.mMethod.getName()).flush();
        try {
            this.mArgumentsProcessed = true;
            this.mArgumentExtractors = buildArgumentExtractors(this.mParameterTypes);
            this.mSignature = buildSignature(this.mMethod, this.mParameterTypes, this.mType.equals(BaseJavaModule.METHOD_TYPE_SYNC));
            this.mArguments = new Object[this.mParameterTypes.length];
            this.mJSArgumentsNeeded = calculateJSArgumentsNeeded();
        } finally {
            SystraceMessage.endSection(0L).flush();
        }
    }

    private static char returnTypeToChar(Class cls) {
        char cCommonTypeToChar = commonTypeToChar(cls);
        if (cCommonTypeToChar != 0) {
            return cCommonTypeToChar;
        }
        if (cls == Void.TYPE) {
            return 'v';
        }
        if (cls == WritableMap.class) {
            return 'M';
        }
        if (cls == WritableArray.class) {
            return 'A';
        }
        throw new RuntimeException("Got unknown return class: " + cls.getSimpleName());
    }

    public Method getMethod() {
        return this.mMethod;
    }

    public String getSignature() {
        if (!this.mArgumentsProcessed) {
            processArguments();
        }
        return (String) Assertions.assertNotNull(this.mSignature);
    }

    @Override // com.facebook.react.bridge.JavaModuleWrapper.NativeMethod
    public String getType() {
        return this.mType;
    }

    @Override // com.facebook.react.bridge.JavaModuleWrapper.NativeMethod
    public void invoke(JSInstance jSInstance, ReadableArray readableArray) {
        String str = this.mModuleWrapper.getName() + Ig.wd("l", (short) (ZN.Xd() ^ 30038)) + this.mMethod.getName();
        SystraceMessage.beginSection(0L, EO.Od("\u007fL[\u0002q-$\u0002 d0'mXPN#\u0001O\f", (short) (C1499aX.Xd() ^ (-15785)))).arg(C1561oA.Qd("\n\u0001\u000f\u0002\b{", (short) (Od.Xd() ^ (-5901))), str).flush();
        if (DEBUG) {
            PrinterHolder.getPrinter().logMessage(ReactDebugOverlayTags.BRIDGE_CALLS, C1593ug.zd("0:\u0015'4LbN(\u000f\u0015d \u0018g\u001d\u001f", (short) (C1607wl.Xd() ^ 24998), (short) (C1607wl.Xd() ^ 11615)), this.mModuleWrapper.getName(), this.mMethod.getName());
        }
        try {
            if (!this.mArgumentsProcessed) {
                processArguments();
            }
            if (this.mArguments == null || this.mArgumentExtractors == null) {
                String strKd = Qg.kd("QRNABON\u001bK?LC:BGEp60791/", (short) (FB.Xd() ^ 1168), (short) (FB.Xd() ^ 2493));
                Class<?> cls = Class.forName(hg.Vd(")\u001f3\u001dh&\u001a&\u001ecy&%!#", (short) (FB.Xd() ^ 28112), (short) (FB.Xd() ^ 19618)));
                Class<?>[] clsArr = new Class[1];
                clsArr[0] = Class.forName(C1561oA.ud("I?S=\tF:F>\u0004(HE;?7", (short) (C1633zX.Xd() ^ (-14936))));
                Object[] objArr = {strKd};
                Constructor<?> constructor = cls.getConstructor(clsArr);
                try {
                    constructor.setAccessible(true);
                    throw ((Error) constructor.newInstance(objArr));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            if (this.mJSArgumentsNeeded != readableArray.size()) {
                StringBuilder sbAppend = new StringBuilder().append(str).append(C1561oA.Xd(",t}\u00040", (short) (FB.Xd() ^ 8090))).append(readableArray.size());
                short sXd = (short) (C1607wl.Xd() ^ 30651);
                int[] iArr = new int["t7E;F?4>AAvk.B7-(:((`".length()];
                QB qb = new QB("t7E;F?4>AAvk.B7-(:((`");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                    i2++;
                }
                throw new NativeArgumentsParseException(sbAppend.append(new String(iArr, 0, i2)).append(this.mJSArgumentsNeeded).toString());
            }
            int i3 = 0;
            int jSArgumentsNeeded = 0;
            while (true) {
                try {
                    ArgumentExtractor[] argumentExtractorArr = this.mArgumentExtractors;
                    if (i3 >= argumentExtractorArr.length) {
                        try {
                            this.mMethod.invoke(this.mModuleWrapper.getModule(), this.mArguments);
                            return;
                        } catch (IllegalAccessException e3) {
                            e = e3;
                            throw new RuntimeException(createInvokeExceptionMessage(str), e);
                        } catch (IllegalArgumentException e4) {
                            e = e4;
                            throw new RuntimeException(createInvokeExceptionMessage(str), e);
                        } catch (InvocationTargetException e5) {
                            if (!(e5.getCause() instanceof RuntimeException)) {
                                throw new RuntimeException(createInvokeExceptionMessage(str), e5);
                            }
                            throw ((RuntimeException) e5.getCause());
                        }
                    }
                    this.mArguments[i3] = argumentExtractorArr[i3].extractArgument(jSInstance, readableArray, jSArgumentsNeeded);
                    jSArgumentsNeeded += this.mArgumentExtractors[i3].getJSArgumentsNeeded();
                    i3++;
                } catch (UnexpectedNativeTypeException | NullPointerException e6) {
                    StringBuilder sbAppend2 = new StringBuilder().append(e6.getMessage()).append(C1561oA.od("\")cnlppmo\\l`d\\\u0014TdXe\\S[`^\nOWY\u0006", (short) (OY.Xd() ^ 15739))).append(str);
                    short sXd2 = (short) (Od.Xd() ^ (-1515));
                    int[] iArr2 = new int["\\\u001f3_\"4*92+5<h3902Fn".length()];
                    QB qb2 = new QB("\\\u001f3_\"4*92+5<h3902Fn");
                    int i4 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd2 + sXd2) + i4));
                        i4++;
                    }
                    throw new NativeArgumentsParseException(sbAppend2.append(new String(iArr2, 0, i4)).append(getAffectedRange(jSArgumentsNeeded, this.mArgumentExtractors[i3].getJSArgumentsNeeded())).append(Wg.Zd("$", (short) (FB.Xd() ^ 15724), (short) (FB.Xd() ^ 2760))).toString(), e6);
                }
            }
        } finally {
        }
        SystraceMessage.endSection(0L).flush();
    }
}
