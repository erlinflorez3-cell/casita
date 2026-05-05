package com.incode.welcome_sdk.data.remote.beans;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.autofill.HintConstants;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.incode.welcome_sdk.commons.utils.StringUtils;
import io.sentry.protocol.Geo;
import io.sentry.protocol.SentryThread;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class ResponseOCRData implements IResponseDocumentScan {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f9157a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f9158b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f9159c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char[] f9160d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f9161e = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f9162j = 0;
    private String address;
    private e addressFields;
    private e addressFieldsFromStatement;
    private String birthDate;
    private String cic;
    private String claveDeElector;
    private String curp;
    private String documentType;
    private int expirationDate;
    private Map<String, Object> extendedOcrJsonData;
    private String firstName;
    private String fullName;
    private String gender;
    private String givenNameMrz;
    private int issueDate;
    private String issuingCountry;
    private String lastName;
    private String lastNameMrz;
    private String middleName;
    private int notExtracted;
    private List<String> notExtractedDetails;
    private String numeroEmisionCredencial;
    private String ocr;
    private String poaName;
    private int registrationDate;
    private String typeOfId;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r8, short r9, short r10) {
        /*
            int r0 = r8 * 3
            int r8 = 1 - r0
            byte[] r7 = com.incode.welcome_sdk.data.remote.beans.ResponseOCRData.$$a
            int r0 = r9 * 50
            int r6 = 122 - r0
            int r5 = r10 + 4
            byte[] r4 = new byte[r8]
            r3 = 0
            if (r7 != 0) goto L28
            r0 = r8
            r2 = r3
        L13:
            int r0 = -r0
            int r6 = r6 + r0
            r1 = r2
        L16:
            int r5 = r5 + 1
            int r2 = r1 + 1
            byte r0 = (byte) r6
            r4[r1] = r0
            if (r2 != r8) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L25:
            r0 = r7[r5]
            goto L13
        L28:
            r1 = r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.remote.beans.ResponseOCRData.$$c(byte, short, short):java.lang.String");
    }

    static void init$0() {
        $$a = new byte[]{103, -8, -85, 41};
        $$b = 230;
    }

    public static class e {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f9163g = 1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f9164i = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f9165a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f9166b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f9167c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f9168d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f9169e;

        public e(String str, String str2, String str3, String str4, String str5) {
            this.f9165a = str;
            this.f9169e = str2;
            this.f9167c = str3;
            this.f9166b = str4;
            this.f9168d = str5;
        }

        public final String c() {
            int i2 = 2 % 2;
            int i3 = f9164i + 91;
            int i4 = i3 % 128;
            f9163g = i4;
            int i5 = i3 % 2;
            String str = this.f9165a;
            int i6 = i4 + 97;
            f9164i = i6 % 128;
            if (i6 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public final String e() {
            int i2 = 2 % 2;
            int i3 = f9164i + 19;
            f9163g = i3 % 128;
            if (i3 % 2 != 0) {
                return this.f9169e;
            }
            int i4 = 2 / 0;
            return this.f9169e;
        }

        public final String d() {
            int i2 = 2 % 2;
            int i3 = f9164i + 101;
            int i4 = i3 % 128;
            f9163g = i4;
            int i5 = i3 % 2;
            String str = this.f9167c;
            int i6 = i4 + 67;
            f9164i = i6 % 128;
            int i7 = i6 % 2;
            return str;
        }

        public final String a() {
            String str;
            int i2 = 2 % 2;
            int i3 = f9164i;
            int i4 = i3 + 105;
            f9163g = i4 % 128;
            if (i4 % 2 == 0) {
                str = this.f9166b;
                int i5 = 37 / 0;
            } else {
                str = this.f9166b;
            }
            int i6 = i3 + 29;
            f9163g = i6 % 128;
            if (i6 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public final String b() {
            int i2 = 2 % 2;
            int i3 = f9163g;
            int i4 = i3 + 1;
            f9164i = i4 % 128;
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.f9168d;
            int i5 = i3 + 45;
            f9164i = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 89 / 0;
            }
            return str;
        }

        public String toString() {
            int i2 = 2 % 2;
            String string = new StringBuilder("ResponseAddressData{street='").append(this.f9165a).append("', colony='").append(this.f9169e).append("', postalCode='").append(this.f9167c).append("', city='").append(this.f9166b).append("', state='").append(this.f9168d).append("'}").toString();
            int i3 = f9163g + 37;
            f9164i = i3 % 128;
            int i4 = i3 % 2;
            return string;
        }
    }

    public ResponseOCRData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i2, int i3, int i4, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, int i5, List<String> list, e eVar, e eVar2, Map<String, Object> map) {
        Map<String, Object> map2 = map;
        this.birthDate = str;
        this.fullName = str2;
        this.firstName = str3;
        this.givenNameMrz = str4;
        this.middleName = str5;
        this.lastName = str6;
        this.lastNameMrz = str7;
        this.address = str8;
        this.gender = str9;
        this.registrationDate = i2;
        this.issueDate = i3;
        this.expirationDate = i4;
        this.claveDeElector = str10;
        this.curp = str11;
        this.numeroEmisionCredencial = str12;
        this.cic = str13;
        this.ocr = str14;
        this.issuingCountry = str15;
        this.documentType = str16;
        this.poaName = str17;
        this.typeOfId = str18;
        this.notExtracted = i5;
        this.notExtractedDetails = list;
        this.addressFields = eVar;
        this.addressFieldsFromStatement = eVar2;
        this.extendedOcrJsonData = map2 == null ? new HashMap<>() : map2;
    }

    public String getBirthDate() {
        int i2 = 2 % 2;
        int i3 = f9161e + 73;
        f9162j = i3 % 128;
        int i4 = i3 % 2;
        String str = this.birthDate;
        if (i4 == 0) {
            int i5 = 20 / 0;
        }
        return str;
    }

    public String getFullName() {
        int i2 = 2 % 2;
        int i3 = f9161e + 69;
        int i4 = i3 % 128;
        f9162j = i4;
        int i5 = i3 % 2;
        String str = this.fullName;
        int i6 = i4 + 9;
        f9161e = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public String getFirstName() {
        int i2 = 2 % 2;
        int i3 = f9161e + 111;
        int i4 = i3 % 128;
        f9162j = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.firstName;
        int i5 = i4 + 93;
        f9161e = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String getGivenNameMrz() {
        int i2 = 2 % 2;
        int i3 = f9162j + 97;
        f9161e = i3 % 128;
        int i4 = i3 % 2;
        String str = this.givenNameMrz;
        if (i4 != 0) {
            int i5 = 39 / 0;
        }
        return str;
    }

    public String getMiddleName() {
        int i2 = 2 % 2;
        int i3 = f9162j + 39;
        f9161e = i3 % 128;
        if (i3 % 2 == 0) {
            return this.middleName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getLastName() {
        int i2 = 2 % 2;
        int i3 = f9161e + 81;
        int i4 = i3 % 128;
        f9162j = i4;
        int i5 = i3 % 2;
        String str = this.lastName;
        int i6 = i4 + 19;
        f9161e = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public String getLastNameMrz() {
        int i2 = 2 % 2;
        int i3 = f9162j;
        int i4 = i3 + 7;
        f9161e = i4 % 128;
        int i5 = i4 % 2;
        String str = this.lastNameMrz;
        int i6 = i3 + 5;
        f9161e = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getAddress() {
        int i2 = 2 % 2;
        int i3 = f9162j + 35;
        f9161e = i3 % 128;
        int i4 = i3 % 2;
        String str = this.address;
        if (i4 != 0) {
            int i5 = 45 / 0;
        }
        return str;
    }

    public String getGender() {
        int i2 = 2 % 2;
        int i3 = f9161e + 117;
        f9162j = i3 % 128;
        if (i3 % 2 != 0) {
            return this.gender;
        }
        throw null;
    }

    public int getRegistrationDate() {
        int i2;
        int i3 = 2 % 2;
        int i4 = f9161e;
        int i5 = i4 + 19;
        f9162j = i5 % 128;
        if (i5 % 2 == 0) {
            i2 = this.registrationDate;
            int i6 = 66 / 0;
        } else {
            i2 = this.registrationDate;
        }
        int i7 = i4 + 113;
        f9162j = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 56 / 0;
        }
        return i2;
    }

    private static void f(String str, String str2, int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3;
        char[] cArr;
        String str3 = str;
        String str4 = str2;
        int i4 = 2 % 2;
        Object charArray = str4;
        if (str4 != null) {
            charArray = str4.toCharArray();
        }
        char[] cArr2 = (char[]) charArray;
        Object obj = str3;
        if (str3 != null) {
            int i5 = $10 + 11;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                str3.getBytes("ISO-8859-1");
                throw null;
            }
            byte[] bytes = str3.getBytes("ISO-8859-1");
            int i6 = $10 + 43;
            $11 = i6 % 128;
            obj = bytes;
            if (i6 % 2 == 0) {
                int i7 = 3 / 5;
                obj = bytes;
            }
        }
        byte[] bArr = (byte[]) obj;
        com.c.a.i iVar = new com.c.a.i();
        char[] cArr3 = f9160d;
        int i8 = 0;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i9])};
                    Object objC = com.c.a.e.e.c(936178174);
                    if (objC == null) {
                        byte b2 = (byte) i8;
                        byte b3 = b2;
                        objC = com.c.a.e.e.e((char) TextUtils.indexOf("", "", i8), 20 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (Process.myTid() >> 22) + 846, 928445319, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr4[i9] = ((Character) ((Method) objC).invoke(null, objArr2)).charValue();
                    i9++;
                    i8 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        Object[] objArr3 = {Integer.valueOf(f9157a)};
        Object objC2 = com.c.a.e.e.c(-1774242729);
        if (objC2 == null) {
            objC2 = com.c.a.e.e.e((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 35038), 16 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1361 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -1767557586, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objC2).invoke(null, objArr3)).intValue();
        if (!(!f9159c)) {
            iVar.f2754b = bArr.length;
            char[] cArr5 = new char[iVar.f2754b];
            iVar.f2755c = 0;
            while (iVar.f2755c < iVar.f2754b) {
                int i10 = $10 + 125;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    cArr5[iVar.f2755c] = (char) (cArr3[bArr[iVar.f2754b + iVar.f2755c] << i2] >>> iIntValue);
                    Object[] objArr4 = {iVar, iVar};
                    Object objC3 = com.c.a.e.e.c(-1471606930);
                    if (objC3 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 1);
                        objC3 = com.c.a.e.e.e((char) (49813 - (ViewConfiguration.getTouchSlop() >> 8)), TextUtils.indexOf("", "", 0) + 20, 1342 - (ViewConfiguration.getScrollBarSize() >> 8), -1462563561, false, $$c(b4, b5, (byte) (-b5)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objC3).invoke(null, objArr4);
                } else {
                    cArr5[iVar.f2755c] = (char) (cArr3[bArr[(iVar.f2754b - 1) - iVar.f2755c] + i2] - iIntValue);
                    Object[] objArr5 = {iVar, iVar};
                    Object objC4 = com.c.a.e.e.c(-1471606930);
                    if (objC4 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 + 1);
                        objC4 = com.c.a.e.e.e((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 49812), (ViewConfiguration.getFadingEdgeLength() >> 16) + 20, 1342 - Color.blue(0), -1462563561, false, $$c(b6, b7, (byte) (-b7)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objC4).invoke(null, objArr5);
                }
            }
            objArr[0] = new String(cArr5);
            return;
        }
        if (f9158b) {
            int i11 = $11 + 69;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                iVar.f2754b = cArr2.length;
                cArr = new char[iVar.f2754b];
                i3 = 0;
            } else {
                i3 = 0;
                iVar.f2754b = cArr2.length;
                cArr = new char[iVar.f2754b];
            }
            iVar.f2755c = i3;
            while (iVar.f2755c < iVar.f2754b) {
                cArr[iVar.f2755c] = (char) (cArr3[cArr2[(iVar.f2754b - 1) - iVar.f2755c] - i2] - iIntValue);
                Object[] objArr6 = {iVar, iVar};
                Object objC5 = com.c.a.e.e.c(-1471606930);
                if (objC5 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = (byte) (b8 + 1);
                    objC5 = com.c.a.e.e.e((char) (49812 - Process.getGidForName("")), (ViewConfiguration.getLongPressTimeout() >> 16) + 20, KeyEvent.normalizeMetaState(0) + 1342, -1462563561, false, $$c(b8, b9, (byte) (-b9)), new Class[]{Object.class, Object.class});
                }
                ((Method) objC5).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr);
            return;
        }
        int i12 = 0;
        iVar.f2754b = iArr.length;
        char[] cArr6 = new char[iVar.f2754b];
        while (true) {
            iVar.f2755c = i12;
            if (iVar.f2755c >= iVar.f2754b) {
                objArr[0] = new String(cArr6);
                return;
            }
            int i13 = $11 + 19;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            cArr6[iVar.f2755c] = (char) (cArr3[iArr[(iVar.f2754b - 1) - iVar.f2755c] - i2] - iIntValue);
            i12 = iVar.f2755c + 1;
        }
    }

    public int getIssueDate() {
        int i2;
        int i3 = 2 % 2;
        int i4 = f9161e;
        int i5 = i4 + 117;
        f9162j = i5 % 128;
        if (i5 % 2 == 0) {
            i2 = this.issueDate;
            int i6 = 28 / 0;
        } else {
            i2 = this.issueDate;
        }
        int i7 = i4 + 45;
        f9162j = i7 % 128;
        if (i7 % 2 != 0) {
            return i2;
        }
        throw null;
    }

    public int getExpirationDate() {
        int i2 = 2 % 2;
        int i3 = f9161e + 35;
        f9162j = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.expirationDate;
        if (i4 == 0) {
            int i6 = 19 / 0;
        }
        return i5;
    }

    public String getClaveDeElector() {
        int i2 = 2 % 2;
        int i3 = f9162j + 11;
        int i4 = i3 % 128;
        f9161e = i4;
        int i5 = i3 % 2;
        String str = this.claveDeElector;
        int i6 = i4 + 67;
        f9162j = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public String getCurp() {
        int i2 = 2 % 2;
        int i3 = f9161e;
        int i4 = i3 + 55;
        f9162j = i4 % 128;
        int i5 = i4 % 2;
        String str = this.curp;
        int i6 = i3 + 109;
        f9162j = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public String getNumeroEmisionCredencial() {
        int i2 = 2 % 2;
        int i3 = f9162j + 45;
        f9161e = i3 % 128;
        int i4 = i3 % 2;
        String str = this.numeroEmisionCredencial;
        if (i4 != 0) {
            int i5 = 28 / 0;
        }
        return str;
    }

    public String getCic() {
        int i2 = 2 % 2;
        int i3 = f9162j + 27;
        int i4 = i3 % 128;
        f9161e = i4;
        int i5 = i3 % 2;
        String str = this.cic;
        int i6 = i4 + 13;
        f9162j = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 61 / 0;
        }
        return str;
    }

    public String getOcr() {
        String str;
        int i2 = 2 % 2;
        int i3 = f9161e + 67;
        int i4 = i3 % 128;
        f9162j = i4;
        if (i3 % 2 == 0) {
            str = this.ocr;
            int i5 = 83 / 0;
        } else {
            str = this.ocr;
        }
        int i6 = i4 + 97;
        f9161e = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getIssuingCountry() {
        int i2 = 2 % 2;
        int i3 = f9162j + 23;
        f9161e = i3 % 128;
        if (i3 % 2 == 0) {
            return this.issuingCountry;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getDocumentType() {
        int i2 = 2 % 2;
        int i3 = f9161e + 113;
        int i4 = i3 % 128;
        f9162j = i4;
        int i5 = i3 % 2;
        String str = this.documentType;
        int i6 = i4 + 91;
        f9161e = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getPoaName() {
        int i2 = 2 % 2;
        int i3 = f9161e + 109;
        int i4 = i3 % 128;
        f9162j = i4;
        int i5 = i3 % 2;
        String str = this.poaName;
        int i6 = i4 + 123;
        f9161e = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public String getTypeOfId() {
        int i2 = 2 % 2;
        int i3 = f9162j + 1;
        int i4 = i3 % 128;
        f9161e = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.typeOfId;
        int i5 = i4 + 51;
        f9162j = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public int getNotExtracted() {
        int i2 = 2 % 2;
        int i3 = f9161e + 55;
        f9162j = i3 % 128;
        if (i3 % 2 != 0) {
            return this.notExtracted;
        }
        throw null;
    }

    public List<String> getNotExtractedDetails() {
        List<String> list;
        int i2 = 2 % 2;
        int i3 = f9162j;
        int i4 = i3 + 75;
        f9161e = i4 % 128;
        if (i4 % 2 != 0) {
            list = this.notExtractedDetails;
            int i5 = 7 / 0;
        } else {
            list = this.notExtractedDetails;
        }
        int i6 = i3 + 89;
        f9161e = i6 % 128;
        int i7 = i6 % 2;
        return list;
    }

    public e getAddressFields() {
        int i2 = 2 % 2;
        int i3 = f9161e + 59;
        f9162j = i3 % 128;
        if (i3 % 2 != 0) {
            return this.addressFields;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public e getAddressFieldsFromStatement() {
        int i2 = 2 % 2;
        int i3 = f9162j + 99;
        int i4 = i3 % 128;
        f9161e = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        e eVar = this.addressFieldsFromStatement;
        int i5 = i4 + 9;
        f9162j = i5 % 128;
        int i6 = i5 % 2;
        return eVar;
    }

    public Map<String, Object> getExtendedOcrJsonData() {
        int i2 = 2 % 2;
        int i3 = f9162j + 31;
        int i4 = i3 % 128;
        f9161e = i4;
        int i5 = i3 % 2;
        Map<String, Object> map = this.extendedOcrJsonData;
        int i6 = i4 + 93;
        f9162j = i6 % 128;
        if (i6 % 2 != 0) {
            return map;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i2 = 2 % 2;
        String string = new StringBuilder("ResponseOCRData{birthDate='").append(this.birthDate).append("', fullName='").append(this.fullName).append("', firstName='").append(this.firstName).append("', middleName='").append(this.middleName).append("', lastName='").append(this.lastName).append("', address='").append(this.address).append("', gender='").append(this.gender).append("', registrationDate=").append(this.registrationDate).append(", issueDate=").append(this.issueDate).append(", expirationDate=").append(this.expirationDate).append(", claveDeElector='").append(this.claveDeElector).append("', curp='").append(this.curp).append("', numeroEmisionCredencial='").append(this.numeroEmisionCredencial).append("', cic='").append(this.cic).append("', ocr='").append(this.ocr).append("', issuingCountry='").append(this.issuingCountry).append("', documentType='").append(this.documentType).append("', poaName='").append(this.poaName).append("', notExtracted=").append(this.notExtracted).append(", notExtractedDetails=").append(this.notExtractedDetails).append(", addressFields=").append(this.addressFields).append(", addressFieldsFromStatement=").append(this.addressFieldsFromStatement).append(", extendedOcrJsonData=").append(this.extendedOcrJsonData).append(AbstractJsonLexerKt.END_OBJ).toString();
        int i3 = f9161e + 49;
        f9162j = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 68 / 0;
        }
        return string;
    }

    public static ResponseOCRData parse(ResponseBody responseBody) throws Throwable {
        String strCapitalizeAllWords;
        String strCapitalizeAllWords2;
        String strCapitalizeAllWords3;
        String strCapitalizeAllWords4;
        String strCapitalizeAllWords5;
        String strCapitalizeAllWords6;
        String strOptString;
        String strOptString2;
        String strOptString3;
        String strOptString4;
        String strOptString5;
        String strOptString6;
        String strOptString7;
        String strOptString8;
        String strOptString9;
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject(responseBody.string());
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("name");
        String strOptString10 = "";
        if (jSONObjectOptJSONObject != null) {
            int i3 = f9161e + 3;
            f9162j = i3 % 128;
            int i4 = i3 % 2;
            strCapitalizeAllWords = StringUtils.capitalizeAllWords(jSONObjectOptJSONObject.optString("fullName"));
            strCapitalizeAllWords2 = StringUtils.capitalizeAllWords(jSONObjectOptJSONObject.optString("firstName"));
            strCapitalizeAllWords3 = StringUtils.capitalizeAllWords(jSONObjectOptJSONObject.optString("givenNameMrz"));
            strCapitalizeAllWords4 = StringUtils.capitalizeAllWords(jSONObjectOptJSONObject.optString("maternalLastName"));
            strCapitalizeAllWords5 = StringUtils.capitalizeAllWords(jSONObjectOptJSONObject.optString("paternalLastName"));
            strCapitalizeAllWords6 = StringUtils.capitalizeAllWords(jSONObjectOptJSONObject.optString("lastNameMrz"));
            int i5 = f9162j + 35;
            f9161e = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 % 4;
            }
        } else {
            strCapitalizeAllWords = "";
            strCapitalizeAllWords2 = strCapitalizeAllWords;
            strCapitalizeAllWords3 = strCapitalizeAllWords2;
            strCapitalizeAllWords4 = strCapitalizeAllWords3;
            strCapitalizeAllWords5 = strCapitalizeAllWords4;
            strCapitalizeAllWords6 = strCapitalizeAllWords5;
        }
        String strOptString11 = jSONObject.optString("birthDate");
        Object[] objArr = new Object[1];
        f("\u0085\u0085\u0084\u0083\u0082\u0082\u0081", null, null, 127 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr);
        int i7 = 0;
        String strOptString12 = jSONObject.optString(((String) objArr[0]).intern());
        String strOptString13 = jSONObject.optString(HintConstants.AUTOFILL_HINT_GENDER);
        int iOptInt = jSONObject.optInt("registrationDate");
        int iOptInt2 = jSONObject.optInt("issueDate");
        int iOptInt3 = jSONObject.optInt("expirationDate");
        String strOptString14 = jSONObject.optString("claveDeElector");
        String strOptString15 = jSONObject.optString("curp");
        String strOptString16 = jSONObject.optString("numeroEmisionCredencial");
        String strOptString17 = jSONObject.optString("cic");
        String strOptString18 = jSONObject.optString(OptionalModuleUtils.OCR);
        String strOptString19 = jSONObject.optString("issuingCountry");
        String strOptString20 = jSONObject.optString("documentType");
        String strOptString21 = jSONObject.optString("poaName");
        String strOptString22 = jSONObject.optString("typeOfId");
        int iOptInt4 = jSONObject.optInt("notExtracted");
        JSONArray jSONArrayB = com.incode.welcome_sdk.commons.extensions.i.b(jSONObject, "notExtractedDetails");
        ArrayList arrayList = new ArrayList(jSONArrayB.length());
        int i8 = f9162j + 41;
        f9161e = i8 % 128;
        int i9 = i8 % 2;
        while (i7 < jSONArrayB.length()) {
            int i10 = f9162j + 121;
            f9161e = i10 % 128;
            if (i10 % 2 != 0) {
                arrayList.add(jSONArrayB.getString(i7));
                i7 += 84;
            } else {
                arrayList.add(jSONArrayB.getString(i7));
                i7++;
            }
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("addressFields");
        if (jSONObjectOptJSONObject2 != null) {
            strOptString = jSONObjectOptJSONObject2.optString("street");
            strOptString2 = jSONObjectOptJSONObject2.optString("colony");
            strOptString3 = jSONObjectOptJSONObject2.optString(HintConstants.AUTOFILL_HINT_POSTAL_CODE);
            strOptString4 = jSONObjectOptJSONObject2.optString(Geo.JsonKeys.CITY);
            strOptString5 = jSONObjectOptJSONObject2.optString(SentryThread.JsonKeys.STATE);
        } else {
            strOptString = "";
            strOptString2 = strOptString;
            strOptString3 = strOptString2;
            strOptString4 = strOptString3;
            strOptString5 = strOptString4;
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("addressFieldsFromStatement");
        if (jSONObjectOptJSONObject3 != null) {
            strOptString10 = jSONObjectOptJSONObject3.optString("street");
            strOptString6 = jSONObjectOptJSONObject3.optString("colony");
            strOptString7 = jSONObjectOptJSONObject3.optString(HintConstants.AUTOFILL_HINT_POSTAL_CODE);
            strOptString8 = jSONObjectOptJSONObject3.optString(Geo.JsonKeys.CITY);
            strOptString9 = jSONObjectOptJSONObject3.optString(SentryThread.JsonKeys.STATE);
        } else {
            strOptString6 = "";
            strOptString7 = strOptString6;
            strOptString8 = strOptString7;
            strOptString9 = strOptString8;
        }
        return new ResponseOCRData(strOptString11, strCapitalizeAllWords, strCapitalizeAllWords2, strCapitalizeAllWords3, strCapitalizeAllWords4, strCapitalizeAllWords5, strCapitalizeAllWords6, strOptString12, strOptString13, iOptInt, iOptInt2, iOptInt3, strOptString14, strOptString15, strOptString16, strOptString17, strOptString18, strOptString19, strOptString20, strOptString21, strOptString22, iOptInt4, arrayList, new e(strOptString, strOptString2, strOptString3, strOptString4, strOptString5), new e(strOptString10, strOptString6, strOptString7, strOptString8, strOptString9), com.incode.welcome_sdk.commons.utils.u.c(jSONObject));
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f9161e = 0;
        f9162j = 1;
        f9160d = new char[]{64465, 64476, 64494, 64477, 64495};
        f9157a = -1867973776;
        f9158b = true;
        f9159c = true;
    }
}
