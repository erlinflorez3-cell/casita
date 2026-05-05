package com.incode.welcome_sdk.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class DeviceFingerprint {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f7456a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f7457b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f7458c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f7459d = 0;
    private String data;
    private String deviceModel;
    private String deviceType;
    private String hash;
    private String ip;
    private int osVersion;
    private String sdkVersion;

    public DeviceFingerprint(String str, String str2, String str3, String str4, String str5, int i2, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.data = str;
        this.deviceType = str2;
        this.deviceModel = str3;
        this.hash = str4;
        this.ip = str5;
        this.osVersion = i2;
        this.sdkVersion = str6;
    }

    public /* synthetic */ DeviceFingerprint(String str, String str2, String str3, String str4, String str5, int i2, String str6, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? "" : str4, (i3 & 16) != 0 ? "" : str5, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) == 0 ? str6 : "");
    }

    public final String getData() {
        String str;
        int i2 = 2 % 2;
        int i3 = f7456a;
        int i4 = i3 + 63;
        f7458c = i4 % 128;
        if (i4 % 2 != 0) {
            str = this.data;
            int i5 = 15 / 0;
        } else {
            str = this.data;
        }
        int i6 = i3 + 11;
        f7458c = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final void setData(String str) {
        int i2 = 2 % 2;
        int i3 = f7458c + 79;
        f7456a = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.data = str;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.data = str;
        int i4 = f7456a + 53;
        f7458c = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String getDeviceType() {
        int i2 = 2 % 2;
        int i3 = f7456a;
        int i4 = i3 + 99;
        f7458c = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.deviceType;
        int i5 = i3 + 93;
        f7458c = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final void setDeviceType(String str) {
        int i2 = 2 % 2;
        int i3 = f7458c + 93;
        f7456a = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.deviceType = str;
        int i5 = f7458c + 23;
        f7456a = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getDeviceModel() {
        String str;
        int i2 = 2 % 2;
        int i3 = f7458c + 43;
        int i4 = i3 % 128;
        f7456a = i4;
        if (i3 % 2 == 0) {
            str = this.deviceModel;
            int i5 = 16 / 0;
        } else {
            str = this.deviceModel;
        }
        int i6 = i4 + 101;
        f7458c = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final void setDeviceModel(String str) {
        int i2 = 2 % 2;
        int i3 = f7458c + 73;
        f7456a = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.deviceModel = str;
        int i5 = f7456a + 1;
        f7458c = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getHash() {
        int i2 = 2 % 2;
        int i3 = f7456a;
        int i4 = i3 + 19;
        f7458c = i4 % 128;
        int i5 = i4 % 2;
        String str = this.hash;
        int i6 = i3 + 69;
        f7458c = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setHash(String str) {
        int i2 = 2 % 2;
        int i3 = f7456a + 109;
        f7458c = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.hash = str;
        int i5 = f7458c + 17;
        f7456a = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getIp() {
        int i2 = 2 % 2;
        int i3 = f7458c + 43;
        int i4 = i3 % 128;
        f7456a = i4;
        int i5 = i3 % 2;
        String str = this.ip;
        int i6 = i4 + 87;
        f7458c = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 96 / 0;
        }
        return str;
    }

    public final void setIp(String str) {
        int i2 = 2 % 2;
        int i3 = f7458c + 97;
        f7456a = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.ip = str;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.ip = str;
            int i4 = 7 / 0;
        }
    }

    public final int getOsVersion() {
        int i2 = 2 % 2;
        int i3 = f7456a;
        int i4 = i3 + 63;
        f7458c = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            throw null;
        }
        int i5 = this.osVersion;
        int i6 = i3 + 89;
        f7458c = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        obj.hashCode();
        throw null;
    }

    public final void setOsVersion(int i2) {
        int i3 = 2 % 2;
        int i4 = f7458c + 93;
        f7456a = i4 % 128;
        int i5 = i4 % 2;
        this.osVersion = i2;
        if (i5 == 0) {
            throw null;
        }
    }

    public final String getSdkVersion() {
        int i2 = 2 % 2;
        int i3 = f7458c + 81;
        f7456a = i3 % 128;
        if (i3 % 2 != 0) {
            return this.sdkVersion;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setSdkVersion(String str) {
        int i2 = 2 % 2;
        int i3 = f7458c + 109;
        f7456a = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.sdkVersion = str;
        int i5 = f7458c + 83;
        f7456a = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final String toJson() throws JSONException {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("data", this.data);
        jSONObject.put("deviceModel", this.deviceModel);
        jSONObject.put("deviceType", this.deviceType);
        jSONObject.put("hash", this.hash);
        jSONObject.put("ip", this.ip);
        jSONObject.put("osVersion", this.osVersion);
        jSONObject.put("sdkVersion", this.sdkVersion);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i3 = f7458c + 45;
        f7456a = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 98 / 0;
        }
        return string;
    }

    static {
        int i2 = 1 + 111;
        f7459d = i2 % 128;
        int i3 = i2 % 2;
    }

    public DeviceFingerprint() {
        this(null, null, null, null, null, 0, null, 127, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r7 instanceof com.incode.welcome_sdk.data.DeviceFingerprint) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r1 = r2 + 9;
        com.incode.welcome_sdk.data.DeviceFingerprint.f7456a = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r7 = (com.incode.welcome_sdk.data.DeviceFingerprint) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.data, r7.data) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.deviceType, r7.deviceType) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.deviceModel, r7.deviceModel) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.hash, r7.hash) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.ip, r7.ip) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        if (r6.osVersion == r7.osVersion) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        r1 = com.incode.welcome_sdk.data.DeviceFingerprint.f7458c + 115;
        com.incode.welcome_sdk.data.DeviceFingerprint.f7456a = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.sdkVersion, r7.sdkVersion) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
    
        r2 = com.incode.welcome_sdk.data.DeviceFingerprint.f7456a;
        r1 = r2 + 125;
        com.incode.welcome_sdk.data.DeviceFingerprint.f7458c = r1 % 128;
        r1 = r1 % 2;
        r1 = r2 + 7;
        com.incode.welcome_sdk.data.DeviceFingerprint.f7458c = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0087, code lost:
    
        if ((r1 % 2) == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0089, code lost:
    
        r0 = 64 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008d, code lost:
    
        r1 = com.incode.welcome_sdk.data.DeviceFingerprint.f7458c + 19;
        com.incode.welcome_sdk.data.DeviceFingerprint.f7456a = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0096, code lost:
    
        if ((r1 % 2) == 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0098, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0099, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009b, code lost:
    
        r1 = com.incode.welcome_sdk.data.DeviceFingerprint.f7458c + 9;
        r0 = r1 % 128;
        com.incode.welcome_sdk.data.DeviceFingerprint.f7456a = r0;
        r1 = r1 % 2;
        r1 = r0 + 37;
        com.incode.welcome_sdk.data.DeviceFingerprint.f7458c = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ab, code lost:
    
        if ((r1 % 2) != 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ad, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ae, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r6 == r7) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r6 == r7) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r5 = 2
            int r0 = r5 % r5
            int r2 = com.incode.welcome_sdk.data.DeviceFingerprint.f7458c
            int r1 = r2 + 13
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.DeviceFingerprint.f7456a = r0
            int r1 = r1 % r5
            r4 = 1
            r3 = 0
            if (r1 != 0) goto L16
            r0 = 80
            int r0 = r0 / r3
            if (r6 != r7) goto L19
        L15:
            return r4
        L16:
            if (r6 != r7) goto L19
            goto L15
        L19:
            boolean r0 = r7 instanceof com.incode.welcome_sdk.data.DeviceFingerprint
            if (r0 != 0) goto L25
            int r1 = r2 + 9
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.DeviceFingerprint.f7456a = r0
            int r1 = r1 % r5
            return r3
        L25:
            com.incode.welcome_sdk.data.DeviceFingerprint r7 = (com.incode.welcome_sdk.data.DeviceFingerprint) r7
            java.lang.String r1 = r6.data
            java.lang.String r0 = r7.data
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 != 0) goto L32
            return r3
        L32:
            java.lang.String r1 = r6.deviceType
            java.lang.String r0 = r7.deviceType
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            r2 = 0
            if (r0 == 0) goto L9b
            java.lang.String r1 = r6.deviceModel
            java.lang.String r0 = r7.deviceModel
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 != 0) goto L48
            return r3
        L48:
            java.lang.String r1 = r6.hash
            java.lang.String r0 = r7.hash
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 == 0) goto L9a
            java.lang.String r1 = r6.ip
            java.lang.String r0 = r7.ip
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 != 0) goto L5d
            return r3
        L5d:
            int r1 = r6.osVersion
            int r0 = r7.osVersion
            if (r1 == r0) goto L6d
            int r0 = com.incode.welcome_sdk.data.DeviceFingerprint.f7458c
            int r1 = r0 + 115
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.DeviceFingerprint.f7456a = r0
            int r1 = r1 % r5
            return r3
        L6d:
            java.lang.String r1 = r6.sdkVersion
            java.lang.String r0 = r7.sdkVersion
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 != 0) goto L8d
            int r2 = com.incode.welcome_sdk.data.DeviceFingerprint.f7456a
            int r1 = r2 + 125
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.DeviceFingerprint.f7458c = r0
            int r1 = r1 % r5
            int r1 = r2 + 7
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.DeviceFingerprint.f7458c = r0
            int r1 = r1 % r5
            if (r1 == 0) goto L8c
            r0 = 64
            int r0 = r0 / r3
        L8c:
            return r3
        L8d:
            int r0 = com.incode.welcome_sdk.data.DeviceFingerprint.f7458c
            int r1 = r0 + 19
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.DeviceFingerprint.f7456a = r0
            int r1 = r1 % r5
            if (r1 == 0) goto L99
            return r4
        L99:
            throw r2
        L9a:
            return r3
        L9b:
            int r0 = com.incode.welcome_sdk.data.DeviceFingerprint.f7458c
            int r1 = r0 + 9
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.DeviceFingerprint.f7456a = r0
            int r1 = r1 % r5
            int r1 = r0 + 37
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.DeviceFingerprint.f7458c = r0
            int r1 = r1 % r5
            if (r1 != 0) goto Lae
            return r3
        Lae:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.DeviceFingerprint.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f7458c + 109;
        f7456a = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = (((((((((((this.data.hashCode() * 31) + this.deviceType.hashCode()) * 31) + this.deviceModel.hashCode()) * 31) + this.hash.hashCode()) * 31) + this.ip.hashCode()) * 31) + Integer.hashCode(this.osVersion)) * 31) + this.sdkVersion.hashCode();
        int i5 = f7458c + 65;
        f7456a = i5 % 128;
        if (i5 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f7456a + 3;
        f7458c = i3 % 128;
        if (i3 % 2 != 0) {
            String str = "DeviceFingerprint(data=" + this.data + ", deviceType=" + this.deviceType + ", deviceModel=" + this.deviceModel + ", hash=" + this.hash + ", ip=" + this.ip + ", osVersion=" + this.osVersion + ", sdkVersion=" + this.sdkVersion + ")";
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str2 = "DeviceFingerprint(data=" + this.data + ", deviceType=" + this.deviceType + ", deviceModel=" + this.deviceModel + ", hash=" + this.hash + ", ip=" + this.ip + ", osVersion=" + this.osVersion + ", sdkVersion=" + this.sdkVersion + ")";
        int i4 = f7458c + 21;
        f7456a = i4 % 128;
        int i5 = i4 % 2;
        return str2;
    }

    public static /* synthetic */ DeviceFingerprint copy$default(DeviceFingerprint deviceFingerprint, String str, String str2, String str3, String str4, String str5, int i2, String str6, int i3, Object obj) {
        int i4 = 2 % 2;
        if ((i3 & 1) != 0) {
            str = deviceFingerprint.data;
        }
        if ((i3 & 2) != 0) {
            str2 = deviceFingerprint.deviceType;
        }
        if ((i3 & 4) != 0) {
            str3 = deviceFingerprint.deviceModel;
        }
        if ((i3 & 8) != 0) {
            int i5 = f7456a + 43;
            f7458c = i5 % 128;
            int i6 = i5 % 2;
            str4 = deviceFingerprint.hash;
        }
        Object obj2 = null;
        if ((i3 & 16) != 0) {
            int i7 = f7458c + 69;
            f7456a = i7 % 128;
            if (i7 % 2 == 0) {
                String str7 = deviceFingerprint.ip;
                throw null;
            }
            str5 = deviceFingerprint.ip;
        }
        if ((i3 & 32) != 0) {
            int i8 = f7456a + 123;
            f7458c = i8 % 128;
            int i9 = i8 % 2;
            i2 = deviceFingerprint.osVersion;
        }
        if ((i3 & 64) != 0) {
            int i10 = f7458c + 71;
            f7456a = i10 % 128;
            if (i10 % 2 == 0) {
                String str8 = deviceFingerprint.sdkVersion;
                obj2.hashCode();
                throw null;
            }
            str6 = deviceFingerprint.sdkVersion;
        }
        return deviceFingerprint.copy(str, str2, str3, str4, str5, i2, str6);
    }

    public final DeviceFingerprint copy(String str, String str2, String str3, String str4, String str5, int i2, String str6) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        DeviceFingerprint deviceFingerprint = new DeviceFingerprint(str, str2, str3, str4, str5, i2, str6);
        int i4 = f7458c + 17;
        f7456a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 62 / 0;
        }
        return deviceFingerprint;
    }

    public final String component7() {
        int i2 = 2 % 2;
        int i3 = f7456a + 29;
        f7458c = i3 % 128;
        if (i3 % 2 == 0) {
            return this.sdkVersion;
        }
        throw null;
    }

    public final int component6() {
        int i2 = 2 % 2;
        int i3 = f7456a + 37;
        int i4 = i3 % 128;
        f7458c = i4;
        int i5 = i3 % 2;
        int i6 = this.osVersion;
        int i7 = i4 + 73;
        f7456a = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public final String component5() {
        int i2 = 2 % 2;
        int i3 = f7458c + 101;
        f7456a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ip;
        if (i4 == 0) {
            int i5 = 95 / 0;
        }
        return str;
    }

    public final String component4() {
        int i2 = 2 % 2;
        int i3 = f7456a;
        int i4 = i3 + 83;
        f7458c = i4 % 128;
        int i5 = i4 % 2;
        String str = this.hash;
        int i6 = i3 + 71;
        f7458c = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String component3() {
        int i2 = 2 % 2;
        int i3 = f7456a;
        int i4 = i3 + 101;
        f7458c = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.deviceModel;
        int i5 = i3 + 45;
        f7458c = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 53 / 0;
        }
        return str;
    }

    public final String component2() {
        int i2 = 2 % 2;
        int i3 = f7456a + 67;
        int i4 = i3 % 128;
        f7458c = i4;
        int i5 = i3 % 2;
        String str = this.deviceType;
        int i6 = i4 + 65;
        f7456a = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component1() {
        int i2 = 2 % 2;
        int i3 = f7458c + 89;
        int i4 = i3 % 128;
        f7456a = i4;
        int i5 = i3 % 2;
        String str = this.data;
        int i6 = i4 + 89;
        f7458c = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
