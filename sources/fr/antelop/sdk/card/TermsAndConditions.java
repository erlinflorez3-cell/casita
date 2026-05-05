package fr.antelop.sdk.card;

import android.content.Context;
import android.graphics.ImageFormat;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import fr.antelop.sdk.AntelopCallback;
import fr.antelop.sdk.AntelopError;
import fr.antelop.sdk.util.OperationCallback;
import java.lang.reflect.Method;
import java.net.URI;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.a.q;
import o.ep.d;
import o.ep.f;

/* JADX INFO: loaded from: classes5.dex */
public final class TermsAndConditions {
    private final d card;
    private final FileType fileType;
    private final String sourceId;
    private final URI uri;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class FileType {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;
        private static final /* synthetic */ FileType[] $VALUES;
        public static final FileType HTML;
        public static final FileType JPG;
        public static final FileType OTHER;
        public static final FileType PDF;
        public static final FileType PNG;
        public static final FileType TEXT;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f18950a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static long f18951b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f18952c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f18953d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f18954e = 0;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:5:0x0014). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(byte r5, short r6, short r7) {
            /*
                int r0 = r7 * 7
                int r7 = r0 + 71
                int r6 = r6 + 4
                int r5 = r5 * 3
                int r0 = r5 + 1
                byte[] r4 = fr.antelop.sdk.card.TermsAndConditions.FileType.$$a
                byte[] r3 = new byte[r0]
                r2 = 0
                if (r4 != 0) goto L27
                r0 = r7
                r1 = r2
                r7 = r5
            L14:
                int r7 = r7 + r0
            L15:
                byte r0 = (byte) r7
                r3[r1] = r0
                if (r1 != r5) goto L20
                java.lang.String r0 = new java.lang.String
                r0.<init>(r3, r2)
                return r0
            L20:
                int r6 = r6 + 1
                r0 = r4[r6]
                int r1 = r1 + 1
                goto L14
            L27:
                r1 = r2
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.card.TermsAndConditions.FileType.$$c(byte, short, short):java.lang.String");
        }

        private static /* synthetic */ FileType[] $values() {
            int i2 = 2 % 2;
            int i3 = f18952c + 25;
            int i4 = i3 % 128;
            f18953d = i4;
            int i5 = i3 % 2;
            FileType[] fileTypeArr = {HTML, PDF, JPG, PNG, TEXT, OTHER};
            int i6 = i4 + 91;
            f18952c = i6 % 128;
            int i7 = i6 % 2;
            return fileTypeArr;
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f18954e = 0;
            f18950a = 1;
            f18952c = 0;
            f18953d = 1;
            a();
            HTML = new FileType("HTML", 0);
            PDF = new FileType("PDF", 1);
            JPG = new FileType("JPG", 2);
            PNG = new FileType("PNG", 3);
            TEXT = new FileType("TEXT", 4);
            Object[] objArr = new Object[1];
            f("嘀뿌薩\ueb8f\uf141", View.resolveSizeAndState(0, 0, 0) + 59863, objArr);
            OTHER = new FileType(((String) objArr[0]).intern(), 5);
            $VALUES = $values();
            int i2 = f18950a + 83;
            f18954e = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }

        private FileType(String str, int i2) {
        }

        static void a() {
            f18951b = -5778743814600107264L;
        }

        public static FileType extractFromExtensionFile(String str) {
            int i2 = 2 % 2;
            if (str == null) {
                return OTHER;
            }
            if (str.equalsIgnoreCase("html")) {
                return HTML;
            }
            if (str.equalsIgnoreCase("pdf")) {
                return PDF;
            }
            if (!str.equalsIgnoreCase("jpg")) {
                if (str.equalsIgnoreCase("png")) {
                    return PNG;
                }
                if (!str.equalsIgnoreCase("txt")) {
                    return OTHER;
                }
                int i3 = f18953d + 59;
                f18952c = i3 % 128;
                if (i3 % 2 == 0) {
                    return TEXT;
                }
                throw null;
            }
            int i4 = f18953d + 125;
            int i5 = i4 % 128;
            f18952c = i5;
            if (i4 % 2 != 0) {
                throw null;
            }
            FileType fileType = JPG;
            int i6 = i5 + 53;
            f18953d = i6 % 128;
            int i7 = i6 % 2;
            return fileType;
        }

        private static void f(String str, int i2, Object[] objArr) throws Throwable {
            Object charArray;
            String str2 = str;
            int i3 = 2 % 2;
            int i4 = $10 + 47;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 22 / 0;
                charArray = str2 != null ? str2.toCharArray() : str2;
            } else {
                if (str2 != null) {
                }
            }
            char[] cArr = (char[]) charArray;
            q qVar = new q();
            qVar.f19949d = i2;
            int length = cArr.length;
            long[] jArr = new long[length];
            qVar.f19948a = 0;
            while (qVar.f19948a < cArr.length) {
                int i6 = $10 + 53;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                int i8 = qVar.f19948a;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                    Object objA = o.d.d.a(-1011865131);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 - 1);
                        objA = o.d.d.a(731 - ExpandableListView.getPackedPositionType(0L), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 7932), 11 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 355847088, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i8] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() ^ (f18951b ^ 4743694005979712847L);
                    Object[] objArr3 = {qVar, qVar};
                    Object objA2 = o.d.d.a(1452497747);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 - 1);
                        objA2 = o.d.d.a(837 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (27279 - TextUtils.indexOf("", "", 0, 0)), 10 - ImageFormat.getBitsPerPixel(0), -2145994442, false, $$c(b4, b5, (byte) (-b5)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr2 = new char[length];
            qVar.f19948a = 0;
            while (qVar.f19948a < cArr.length) {
                int i9 = $11 + 121;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
                    Object[] objArr4 = {qVar, qVar};
                    Object objA3 = o.d.d.a(1452497747);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 - 1);
                        objA3 = o.d.d.a(836 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 27279), ((Process.getThreadPriority(0) + 20) >> 6) + 11, -2145994442, false, $$c(b6, b7, (byte) (-b7)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                    throw null;
                }
                cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
                Object[] objArr5 = {qVar, qVar};
                Object objA4 = o.d.d.a(1452497747);
                if (objA4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = (byte) (b8 - 1);
                    objA4 = o.d.d.a(ExpandableListView.getPackedPositionChild(0L) + 837, (char) (27278 - TextUtils.lastIndexOf("", '0', 0)), 11 - KeyEvent.getDeadChar(0, 0), -2145994442, false, $$c(b8, b9, (byte) (-b9)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr2);
        }

        static void init$0() {
            $$a = new byte[]{120, -15, 89, -97};
            $$b = 107;
        }

        public static FileType valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = f18953d + 57;
            f18952c = i3 % 128;
            int i4 = i3 % 2;
            FileType fileType = (FileType) Enum.valueOf(FileType.class, str);
            if (i4 != 0) {
                int i5 = 64 / 0;
            }
            int i6 = f18953d + 19;
            f18952c = i6 % 128;
            int i7 = i6 % 2;
            return fileType;
        }

        public static FileType[] values() {
            int i2 = 2 % 2;
            int i3 = f18952c + 125;
            f18953d = i3 % 128;
            int i4 = i3 % 2;
            FileType[] fileTypeArr = (FileType[]) $VALUES.clone();
            int i5 = f18953d + 23;
            f18952c = i5 % 128;
            int i6 = i5 % 2;
            return fileTypeArr;
        }
    }

    public TermsAndConditions(String str, URI uri, FileType fileType, d dVar) {
        this.sourceId = str;
        this.uri = uri;
        this.fileType = fileType;
        this.card = dVar;
    }

    @Deprecated
    public final void approve(Context context, final AntelopCallback antelopCallback) throws Throwable {
        Object[] objArr = {this.card, context, true, new OperationCallback<Void>() { // from class: fr.antelop.sdk.card.TermsAndConditions.1
            @Override // fr.antelop.sdk.util.OperationCallback
            public void onError(AntelopError antelopError) {
                antelopCallback.onError(antelopError);
            }

            @Override // fr.antelop.sdk.util.OperationCallback
            public void onSuccess(Void r2) {
                antelopCallback.onSuccess();
            }
        }};
        int i2 = d.f24452d * (-1246855258);
        d.f24452d = i2;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        int i3 = d.f24449a * (-1196439380);
        d.f24449a = i3;
        d.e(1880222667, -1880222667, objArr, iMyPid, iMyUid, i3, i2);
    }

    public final void approve(Context context, OperationCallback<Void> operationCallback) throws Throwable {
        Object[] objArr = {this.card, context, true, operationCallback};
        int i2 = d.f24452d * (-1246855258);
        d.f24452d = i2;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        int i3 = d.f24449a * (-1196439380);
        d.f24449a = i3;
        d.e(1880222667, -1880222667, objArr, iMyPid, iMyUid, i3, i2);
    }

    @Deprecated
    public final void decline(Context context, final AntelopCallback antelopCallback) throws Throwable {
        Object[] objArr = {this.card, context, false, new OperationCallback<Void>() { // from class: fr.antelop.sdk.card.TermsAndConditions.2
            @Override // fr.antelop.sdk.util.OperationCallback
            public void onError(AntelopError antelopError) {
                antelopCallback.onError(antelopError);
            }

            @Override // fr.antelop.sdk.util.OperationCallback
            public void onSuccess(Void r2) {
                antelopCallback.onSuccess();
            }
        }};
        int i2 = d.f24452d * (-1246855258);
        d.f24452d = i2;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        int i3 = d.f24449a * (-1196439380);
        d.f24449a = i3;
        d.e(1880222667, -1880222667, objArr, iMyPid, iMyUid, i3, i2);
    }

    public final void decline(Context context, OperationCallback<Void> operationCallback) throws Throwable {
        Object[] objArr = {this.card, context, false, operationCallback};
        int i2 = d.f24452d * (-1246855258);
        d.f24452d = i2;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        int i3 = d.f24449a * (-1196439380);
        d.f24449a = i3;
        d.e(1880222667, -1880222667, objArr, iMyPid, iMyUid, i3, i2);
    }

    public final FileType getFileType() {
        return this.fileType;
    }

    public final String getSourceId() {
        return this.sourceId;
    }

    public final URI getUri() {
        return this.uri;
    }

    public final boolean requireApproval() {
        Object[] objArr = {this.card};
        int i2 = d.f24455g * 1257510192;
        d.f24455g = i2;
        int i3 = d.f24458j * (-785443339);
        d.f24458j = i3;
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i4 = d.f24463o * (-1273864872);
        d.f24463o = i4;
        return Objects.equals((f) d.e(1155975806, -1155975801, objArr, i3, iFreeMemory, i4, i2), f.f24511c);
    }

    public final String toString() {
        return new StringBuilder("TermsAndConditions{sourceId='").append(this.sourceId).append("', uri=").append(this.uri).append(", sourceType=").append(this.fileType).append(", requireApproval=").append(requireApproval()).append(AbstractJsonLexerKt.END_OBJ).toString();
    }
}
