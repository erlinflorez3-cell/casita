package androidx.camera.core.processing.util;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.processing.ShaderProvider;
import androidx.core.util.Preconditions;
import com.drew.metadata.exif.makernotes.FujifilmMakernoteDirectory;
import com.dynatrace.android.agent.Global;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class GLUtils {
    public static final String BLANK_FRAGMENT_SHADER = "precision mediump float;\nuniform float uAlphaScale;\nvoid main() {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, uAlphaScale);\n}\n";
    public static final String BLANK_VERTEX_SHADER = "uniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n}\n";
    public static final int PIXEL_STRIDE = 4;
    public static final int SIZEOF_FLOAT = 4;
    public static final String TAG = "GLUtils";
    public static final FloatBuffer TEX_BUF;
    public static final float[] TEX_COORDS;
    public static final String VAR_TEXTURE = "sTexture";
    public static final String VERSION_UNKNOWN = "0.0";
    public static final FloatBuffer VERTEX_BUF;
    public static final float[] VERTEX_COORDS;
    public static final int[] EMPTY_ATTRIBS = {12344};
    public static final int EGL_GL_COLORSPACE_KHR = 12445;
    public static final int EGL_GL_COLORSPACE_BT2020_HLG_EXT = 13632;
    public static final int[] HLG_SURFACE_ATTRIBS = {EGL_GL_COLORSPACE_KHR, EGL_GL_COLORSPACE_BT2020_HLG_EXT, 12344};
    public static final String VAR_TEXTURE_COORD = "vTextureCoord";
    public static final String DEFAULT_VERTEX_SHADER = String.format(Locale.US, "uniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 %s;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n    %s = (uTexMatrix * aTextureCoord).xy;\n}\n", VAR_TEXTURE_COORD, VAR_TEXTURE_COORD);
    public static final String HDR_VERTEX_SHADER = String.format(Locale.US, "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nout vec2 %s;\nvoid main() {\n  gl_Position = uTransMatrix * aPosition;\n  %s = (uTexMatrix * aTextureCoord).xy;\n}\n", VAR_TEXTURE_COORD, VAR_TEXTURE_COORD);
    private static final ShaderProvider SHADER_PROVIDER_DEFAULT = new ShaderProvider() { // from class: androidx.camera.core.processing.util.GLUtils.1
        @Override // androidx.camera.core.processing.ShaderProvider
        public String createFragmentShader(String str, String str2) {
            return String.format(Locale.US, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 %s;\nuniform samplerExternalOES %s;\nuniform float uAlphaScale;\nvoid main() {\n    vec4 src = texture2D(%s, %s);\n    gl_FragColor = vec4(src.rgb, src.a * uAlphaScale);\n}\n", str2, str, str, str2);
        }
    };
    private static final ShaderProvider SHADER_PROVIDER_HDR_DEFAULT = new ShaderProvider() { // from class: androidx.camera.core.processing.util.GLUtils.2
        @Override // androidx.camera.core.processing.ShaderProvider
        public String createFragmentShader(String str, String str2) {
            return String.format(Locale.US, "#version 300 es\n#extension GL_OES_EGL_image_external_essl3 : require\nprecision mediump float;\nuniform samplerExternalOES %s;\nuniform float uAlphaScale;\nin vec2 %s;\nout vec4 outColor;\n\nvoid main() {\n  vec4 src = texture(%s, %s);\n  outColor = vec4(src.rgb, src.a * uAlphaScale);\n}", str, str2, str, str2);
        }
    };
    private static final ShaderProvider SHADER_PROVIDER_HDR_YUV = new ShaderProvider() { // from class: androidx.camera.core.processing.util.GLUtils.3
        @Override // androidx.camera.core.processing.ShaderProvider
        public String createFragmentShader(String str, String str2) {
            return String.format(Locale.US, "#version 300 es\n#extension GL_EXT_YUV_target : require\nprecision mediump float;\nuniform __samplerExternal2DY2YEXT %s;\nuniform float uAlphaScale;\nin vec2 %s;\nout vec4 outColor;\n\nvec3 yuvToRgb(vec3 yuv) {\n  const vec3 yuvOffset = vec3(0.0625, 0.5, 0.5);\n  const mat3 yuvToRgbColorMat = mat3(\n    1.1689f, 1.1689f, 1.1689f,\n    0.0000f, -0.1881f, 2.1502f,\n    1.6853f, -0.6530f, 0.0000f\n  );\n  return clamp(yuvToRgbColorMat * (yuv - yuvOffset), 0.0, 1.0);\n}\n\nvoid main() {\n  vec3 srcYuv = texture(%s, %s).xyz;\n  vec3 srcRgb = yuvToRgb(srcYuv);\n  outColor = vec4(srcRgb, uAlphaScale);\n}", str, str2, str, str2);
        }
    };
    public static final OutputSurface NO_OUTPUT_SURFACE = OutputSurface.of(EGL14.EGL_NO_SURFACE, 0, 0);

    public enum InputFormat {
        UNKNOWN,
        DEFAULT,
        YUV
    }

    static {
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        VERTEX_COORDS = fArr;
        VERTEX_BUF = createFloatBuffer(fArr);
        float[] fArr2 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        TEX_COORDS = fArr2;
        TEX_BUF = createFloatBuffer(fArr2);
    }

    private GLUtils() {
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class Program2D {
        protected int mProgramHandle;
        protected int mTransMatrixLoc = -1;
        protected int mAlphaScaleLoc = -1;
        protected int mPositionLoc = -1;

        /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x007f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        protected Program2D(java.lang.String r10, java.lang.String r11) throws java.lang.Throwable {
            /*
                r9 = this;
                java.lang.String r1 = "glAttachShader"
                java.lang.String r8 = "Could not link program: "
                r9.<init>()
                r5 = -1
                r9.mTransMatrixLoc = r5
                r9.mAlphaScaleLoc = r5
                r9.mPositionLoc = r5
                r0 = 35633(0x8b31, float:4.9932E-41)
                int r6 = androidx.camera.core.processing.util.GLUtils.loadShader(r0, r10)     // Catch: java.lang.IllegalStateException -> L68 java.lang.IllegalArgumentException -> L6a
                r0 = 35632(0x8b30, float:4.9931E-41)
                int r7 = androidx.camera.core.processing.util.GLUtils.loadShader(r0, r11)     // Catch: java.lang.IllegalStateException -> L66 java.lang.IllegalArgumentException -> L6e
                int r4 = android.opengl.GLES20.glCreateProgram()     // Catch: java.lang.IllegalStateException -> L61 java.lang.IllegalArgumentException -> L63
                java.lang.String r0 = "glCreateProgram"
                androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow(r0)     // Catch: java.lang.IllegalStateException -> L5f java.lang.IllegalArgumentException -> L72
                android.opengl.GLES20.glAttachShader(r4, r6)     // Catch: java.lang.IllegalStateException -> L5f java.lang.IllegalArgumentException -> L72
                androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow(r1)     // Catch: java.lang.IllegalStateException -> L5f java.lang.IllegalArgumentException -> L72
                android.opengl.GLES20.glAttachShader(r4, r7)     // Catch: java.lang.IllegalStateException -> L5f java.lang.IllegalArgumentException -> L72
                androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow(r1)     // Catch: java.lang.IllegalStateException -> L5f java.lang.IllegalArgumentException -> L72
                android.opengl.GLES20.glLinkProgram(r4)     // Catch: java.lang.IllegalStateException -> L5f java.lang.IllegalArgumentException -> L72
                r3 = 1
                int[] r2 = new int[r3]     // Catch: java.lang.IllegalStateException -> L5f java.lang.IllegalArgumentException -> L72
                r1 = 35714(0x8b82, float:5.0046E-41)
                r0 = 0
                android.opengl.GLES20.glGetProgramiv(r4, r1, r2, r0)     // Catch: java.lang.IllegalStateException -> L5f java.lang.IllegalArgumentException -> L72
                r0 = r2[r0]     // Catch: java.lang.IllegalStateException -> L5f java.lang.IllegalArgumentException -> L72
                if (r0 != r3) goto L48
                r9.mProgramHandle = r4     // Catch: java.lang.IllegalStateException -> L5f java.lang.IllegalArgumentException -> L72
                r9.loadLocations()
                return
            L48:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.IllegalStateException -> L5f java.lang.IllegalArgumentException -> L72
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.IllegalStateException -> L5f java.lang.IllegalArgumentException -> L72
                r1.<init>(r8)     // Catch: java.lang.IllegalStateException -> L5f java.lang.IllegalArgumentException -> L72
                java.lang.String r0 = android.opengl.GLES20.glGetProgramInfoLog(r4)     // Catch: java.lang.IllegalStateException -> L5f java.lang.IllegalArgumentException -> L72
                java.lang.StringBuilder r0 = r1.append(r0)     // Catch: java.lang.IllegalStateException -> L5f java.lang.IllegalArgumentException -> L72
                java.lang.String r0 = r0.toString()     // Catch: java.lang.IllegalStateException -> L5f java.lang.IllegalArgumentException -> L72
                r2.<init>(r0)     // Catch: java.lang.IllegalStateException -> L5f java.lang.IllegalArgumentException -> L72
                throw r2     // Catch: java.lang.IllegalStateException -> L5f java.lang.IllegalArgumentException -> L72
            L5f:
                r0 = move-exception
                goto L73
            L61:
                r0 = move-exception
                goto L64
            L63:
                r0 = move-exception
            L64:
                r4 = r5
                goto L73
            L66:
                r0 = move-exception
                goto L6f
            L68:
                r0 = move-exception
                goto L6b
            L6a:
                r0 = move-exception
            L6b:
                r6 = r5
                r7 = r6
                goto L70
            L6e:
                r0 = move-exception
            L6f:
                r7 = r5
            L70:
                r4 = r7
                goto L73
            L72:
                r0 = move-exception
            L73:
                if (r6 == r5) goto L78
                android.opengl.GLES20.glDeleteShader(r6)
            L78:
                if (r7 == r5) goto L7d
                android.opengl.GLES20.glDeleteShader(r7)
            L7d:
                if (r4 == r5) goto L82
                android.opengl.GLES20.glDeleteProgram(r4)
            L82:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.processing.util.GLUtils.Program2D.<init>(java.lang.String, java.lang.String):void");
        }

        public void use() {
            GLES20.glUseProgram(this.mProgramHandle);
            GLUtils.checkGlErrorOrThrow("glUseProgram");
            GLES20.glEnableVertexAttribArray(this.mPositionLoc);
            GLUtils.checkGlErrorOrThrow("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(this.mPositionLoc, 2, FujifilmMakernoteDirectory.TAG_MAX_APERTURE_AT_MIN_FOCAL, false, 0, (Buffer) GLUtils.VERTEX_BUF);
            GLUtils.checkGlErrorOrThrow("glVertexAttribPointer");
            updateTransformMatrix(GLUtils.create4x4IdentityMatrix());
            updateAlpha(1.0f);
        }

        public void updateTransformMatrix(float[] fArr) {
            GLES20.glUniformMatrix4fv(this.mTransMatrixLoc, 1, false, fArr, 0);
            GLUtils.checkGlErrorOrThrow("glUniformMatrix4fv");
        }

        public void updateAlpha(float f2) {
            GLES20.glUniform1f(this.mAlphaScaleLoc, f2);
            GLUtils.checkGlErrorOrThrow("glUniform1f");
        }

        public void delete() {
            GLES20.glDeleteProgram(this.mProgramHandle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void loadLocations() {
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.mProgramHandle, "aPosition");
            this.mPositionLoc = iGlGetAttribLocation;
            GLUtils.checkLocationOrThrow(iGlGetAttribLocation, "aPosition");
            int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.mProgramHandle, "uTransMatrix");
            this.mTransMatrixLoc = iGlGetUniformLocation;
            GLUtils.checkLocationOrThrow(iGlGetUniformLocation, "uTransMatrix");
            int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(this.mProgramHandle, "uAlphaScale");
            this.mAlphaScaleLoc = iGlGetUniformLocation2;
            GLUtils.checkLocationOrThrow(iGlGetUniformLocation2, "uAlphaScale");
        }
    }

    public static class SamplerShaderProgram extends Program2D {
        private int mSamplerLoc;
        private int mTexCoordLoc;
        private int mTexMatrixLoc;

        public SamplerShaderProgram(DynamicRange dynamicRange, InputFormat inputFormat) {
            this(dynamicRange, resolveDefaultShaderProvider(dynamicRange, inputFormat));
        }

        public SamplerShaderProgram(DynamicRange dynamicRange, ShaderProvider shaderProvider) {
            super(dynamicRange.is10BitHdr() ? GLUtils.HDR_VERTEX_SHADER : GLUtils.DEFAULT_VERTEX_SHADER, GLUtils.getFragmentShaderSource(shaderProvider));
            this.mSamplerLoc = -1;
            this.mTexMatrixLoc = -1;
            this.mTexCoordLoc = -1;
            loadLocations();
        }

        @Override // androidx.camera.core.processing.util.GLUtils.Program2D
        public void use() {
            super.use();
            GLES20.glUniform1i(this.mSamplerLoc, 0);
            GLES20.glEnableVertexAttribArray(this.mTexCoordLoc);
            GLUtils.checkGlErrorOrThrow("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(this.mTexCoordLoc, 2, FujifilmMakernoteDirectory.TAG_MAX_APERTURE_AT_MIN_FOCAL, false, 0, (Buffer) GLUtils.TEX_BUF);
            GLUtils.checkGlErrorOrThrow("glVertexAttribPointer");
        }

        public void updateTextureMatrix(float[] fArr) {
            GLES20.glUniformMatrix4fv(this.mTexMatrixLoc, 1, false, fArr, 0);
            GLUtils.checkGlErrorOrThrow("glUniformMatrix4fv");
        }

        private void loadLocations() {
            loadLocations();
            int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.mProgramHandle, GLUtils.VAR_TEXTURE);
            this.mSamplerLoc = iGlGetUniformLocation;
            GLUtils.checkLocationOrThrow(iGlGetUniformLocation, GLUtils.VAR_TEXTURE);
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.mProgramHandle, "aTextureCoord");
            this.mTexCoordLoc = iGlGetAttribLocation;
            GLUtils.checkLocationOrThrow(iGlGetAttribLocation, "aTextureCoord");
            int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(this.mProgramHandle, "uTexMatrix");
            this.mTexMatrixLoc = iGlGetUniformLocation2;
            GLUtils.checkLocationOrThrow(iGlGetUniformLocation2, "uTexMatrix");
        }

        private static ShaderProvider resolveDefaultShaderProvider(DynamicRange dynamicRange, InputFormat inputFormat) {
            if (!dynamicRange.is10BitHdr()) {
                return GLUtils.SHADER_PROVIDER_DEFAULT;
            }
            Preconditions.checkArgument(inputFormat != InputFormat.UNKNOWN, "No default sampler shader available for" + inputFormat);
            return inputFormat == InputFormat.YUV ? GLUtils.SHADER_PROVIDER_HDR_YUV : GLUtils.SHADER_PROVIDER_HDR_DEFAULT;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class BlankShaderProgram extends Program2D {
        public BlankShaderProgram() {
            super(GLUtils.BLANK_VERTEX_SHADER, GLUtils.BLANK_FRAGMENT_SHADER);
        }
    }

    public static EGLSurface createWindowSurface(EGLDisplay eGLDisplay, EGLConfig eGLConfig, Surface surface, int[] iArr) {
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, iArr, 0);
        checkEglErrorOrThrow("eglCreateWindowSurface");
        if (eGLSurfaceEglCreateWindowSurface != null) {
            return eGLSurfaceEglCreateWindowSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    public static int loadShader(int i2, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        checkGlErrorOrThrow("glCreateShader type=" + i2);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        Logger.w(TAG, "Could not compile shader: " + str);
        GLES20.glDeleteShader(iGlCreateShader);
        throw new IllegalStateException("Could not compile shader type " + i2 + Global.COLON + GLES20.glGetShaderInfoLog(iGlCreateShader));
    }

    public static int querySurface(EGLDisplay eGLDisplay, EGLSurface eGLSurface, int i2) {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(eGLDisplay, eGLSurface, i2, iArr, 0);
        return iArr[0];
    }

    public static Size getSurfaceSize(EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
        return new Size(querySurface(eGLDisplay, eGLSurface, 12375), querySurface(eGLDisplay, eGLSurface, 12374));
    }

    public static FloatBuffer createFloatBuffer(float[] fArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        return floatBufferAsFloatBuffer;
    }

    public static EGLSurface createPBufferSurface(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i2, int i3) {
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, i2, 12374, i3, 12344}, 0);
        checkEglErrorOrThrow("eglCreatePbufferSurface");
        if (eGLSurfaceEglCreatePbufferSurface != null) {
            return eGLSurfaceEglCreatePbufferSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    public static Map<InputFormat, Program2D> createPrograms(DynamicRange dynamicRange, Map<InputFormat, ShaderProvider> map) {
        Object samplerShaderProgram;
        HashMap map2 = new HashMap();
        InputFormat[] inputFormatArrValues = InputFormat.values();
        int length = inputFormatArrValues.length;
        for (int i2 = 0; i2 < length; i2++) {
            InputFormat inputFormat = inputFormatArrValues[i2];
            ShaderProvider shaderProvider = map.get(inputFormat);
            if (shaderProvider != null) {
                samplerShaderProgram = new SamplerShaderProgram(dynamicRange, shaderProvider);
            } else if (inputFormat == InputFormat.YUV || inputFormat == InputFormat.DEFAULT) {
                samplerShaderProgram = new SamplerShaderProgram(dynamicRange, inputFormat);
            } else {
                Preconditions.checkState(inputFormat == InputFormat.UNKNOWN, "Unhandled input format: " + inputFormat);
                if (dynamicRange.is10BitHdr()) {
                    samplerShaderProgram = new BlankShaderProgram();
                } else {
                    ShaderProvider shaderProvider2 = map.get(InputFormat.DEFAULT);
                    if (shaderProvider2 != null) {
                        samplerShaderProgram = new SamplerShaderProgram(dynamicRange, shaderProvider2);
                    } else {
                        samplerShaderProgram = new SamplerShaderProgram(dynamicRange, InputFormat.DEFAULT);
                    }
                }
            }
            String str = "Shader program for input format " + inputFormat + " created: " + samplerShaderProgram;
            map2.put(inputFormat, samplerShaderProgram);
        }
        return map2;
    }

    public static int createTexture() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        checkGlErrorOrThrow("glGenTextures");
        int i2 = iArr[0];
        GLES20.glBindTexture(36197, i2);
        checkGlErrorOrThrow("glBindTexture " + i2);
        GLES20.glTexParameteri(36197, 10241, 9728);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        checkGlErrorOrThrow("glTexParameter");
        return i2;
    }

    public static float[] create4x4IdentityMatrix() {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        return fArr;
    }

    public static void checkLocationOrThrow(int i2, String str) {
        if (i2 < 0) {
            throw new IllegalStateException("Unable to locate '" + str + "' in program");
        }
    }

    public static void checkEglErrorOrThrow(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError != 12288) {
            throw new IllegalStateException(str + ": EGL error: 0x" + Integer.toHexString(iEglGetError));
        }
    }

    public static void checkGlErrorOrThrow(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            throw new IllegalStateException(str + ": GL error 0x" + Integer.toHexString(iGlGetError));
        }
    }

    public static void checkEglErrorOrLog(String str) {
        try {
            checkEglErrorOrThrow(str);
        } catch (IllegalStateException e2) {
            Logger.e(TAG, e2.toString(), e2);
        }
    }

    public static void checkInitializedOrThrow(AtomicBoolean atomicBoolean, boolean z2) {
        String str;
        boolean z3 = z2 == atomicBoolean.get();
        if (z2) {
            str = "OpenGlRenderer is not initialized";
        } else {
            str = "OpenGlRenderer is already initialized";
        }
        Preconditions.checkState(z3, str);
    }

    public static void checkGlThreadOrThrow(Thread thread) {
        Preconditions.checkState(thread == Thread.currentThread(), "Method call must be called on the GL thread.");
    }

    public static String getGlVersionNumber() {
        Matcher matcher = Pattern.compile("OpenGL ES ([0-9]+)\\.([0-9]+).*").matcher(GLES20.glGetString(7938));
        if (matcher.find()) {
            return ((String) Preconditions.checkNotNull(matcher.group(1))) + "." + ((String) Preconditions.checkNotNull(matcher.group(2)));
        }
        return "0.0";
    }

    public static int[] chooseSurfaceAttrib(String str, DynamicRange dynamicRange) {
        int[] iArr = EMPTY_ATTRIBS;
        if (dynamicRange.getEncoding() == 3) {
            if (str.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
                return HLG_SURFACE_ATTRIBS;
            }
            Logger.w(TAG, "Dynamic range uses HLG encoding, but device does not support EGL_EXT_gl_colorspace_bt2020_hlg.Fallback to default colorspace.");
            return iArr;
        }
        return iArr;
    }

    public static int generateFbo() {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        checkGlErrorOrThrow("glGenFramebuffers");
        return iArr[0];
    }

    public static int generateTexture() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        checkGlErrorOrThrow("glGenTextures");
        return iArr[0];
    }

    public static void deleteTexture(int i2) {
        GLES20.glDeleteTextures(1, new int[]{i2}, 0);
        checkGlErrorOrThrow("glDeleteTextures");
    }

    public static void deleteFbo(int i2) {
        GLES20.glDeleteFramebuffers(1, new int[]{i2}, 0);
        checkGlErrorOrThrow("glDeleteFramebuffers");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getFragmentShaderSource(ShaderProvider shaderProvider) {
        try {
            String strCreateFragmentShader = shaderProvider.createFragmentShader(VAR_TEXTURE, VAR_TEXTURE_COORD);
            if (strCreateFragmentShader != null && strCreateFragmentShader.contains(VAR_TEXTURE_COORD) && strCreateFragmentShader.contains(VAR_TEXTURE)) {
                return strCreateFragmentShader;
            }
            throw new IllegalArgumentException("Invalid fragment shader");
        } catch (Throwable th) {
            if (th instanceof IllegalArgumentException) {
                throw th;
            }
            throw new IllegalArgumentException("Unable retrieve fragment shader source", th);
        }
    }
}
