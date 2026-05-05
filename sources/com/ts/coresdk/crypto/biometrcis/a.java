package com.ts.coresdk.crypto.biometrcis;

import androidx.exifinterface.media.ExifInterface;
import com.dynatrace.android.agent.AdkSettings;
import com.google.firebase.sessions.settings.RemoteSettings;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message tag had invalid wire type.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidWireType(InvalidProtocolBufferException.java:99)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:268)
    	at kotlin.metadata.internal.protobuf.GeneratedMessageLite.parseUnknownField(GeneratedMessageLite.java:73)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:110)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 4 more
    */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u000ePLcz\u0010I\u0006F\u000b6B\u0015\"4\u0012\u000e\u0007njO0Le^.ZS@\u000fs{J$c$\bCCU0}*\teNogtKb\u000bQƤ\fK\u000f̓\\I\u0004\u0014\u0016\u001a\u00137HvG<WzIF!\u0006<\u0007080P\u0012\u0007\u0017\u0019XGǘz|Id\u001a,\u0001Z~>j\u000fc\u0004H\u0011<SvӍ ֔kX>Jr]H0;\u0005oD\\*ۂ/\u0005[\u001cVe9 \u000bv4B"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0014Ky\u0016<\u000623]\fi3C", "", "/E", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc\u0012e9H`\u0001\r|", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", RemoteSettings.FORWARD_SLASH_STRING, AdkSettings.PLATFORM_TYPE_MOBILE, "1", ExifInterface.GPS_MEASUREMENT_2D, ExifInterface.GPS_MEASUREMENT_3D, "4", "5", "6", "7", "8", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0014Ky\u0016<\u000623]\fi3,\u0012\u0004", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0014Ky\u0016<\u000623]\fi3,\u0013\u0004", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0014Ky\u0016<\u000623]\fi3,\u0014\u0004", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0014Ky\u0016<\u000623]\fi3,\u0015\u0004", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0014Ky\u0016<\u000623]\fi3,\u0016\u0004", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0014Ky\u0016<\u000623]\fi3,\u0017\u0004", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0014Ky\u0016<\u000623]\fi3,\u0018\u0004", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0014Ky\u0016<\u000623]\fi3,\u0019\u0004", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0014Ky\u0016<\u000623]\fi3,\u001a\u0004", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0014Ky\u0016<\u000623]\fi3,\u001b\u0004", ">/", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", ""}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public abstract class a {
    private final String aF;

    /* JADX INFO: renamed from: com.ts.coresdk.crypto.biometrcis.a$a, reason: collision with other inner class name */
    public static final class C0319a extends a {
        private final String aG;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0319a(String str) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
            this.aG = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0319a) && Intrinsics.areEqual(getErrorMsg(), ((C0319a) obj).getErrorMsg());
        }

        @Override // com.ts.coresdk.crypto.biometrcis.a
        public String getErrorMsg() {
            return this.aG;
        }

        public int hashCode() {
            return getErrorMsg().hashCode();
        }

        public String toString() {
            return "Canceled(errorMsg=" + getErrorMsg() + ")";
        }
    }

    public static final class b extends a {
        private final String aH;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
            this.aH = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(getErrorMsg(), ((b) obj).getErrorMsg());
        }

        @Override // com.ts.coresdk.crypto.biometrcis.a
        public String getErrorMsg() {
            return this.aH;
        }

        public int hashCode() {
            return getErrorMsg().hashCode();
        }

        public String toString() {
            return "Lockout(errorMsg=" + getErrorMsg() + ")";
        }
    }

    public static final class c extends a {
        private final String aI;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
            this.aI = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.areEqual(getErrorMsg(), ((c) obj).getErrorMsg());
        }

        @Override // com.ts.coresdk.crypto.biometrcis.a
        public String getErrorMsg() {
            return this.aI;
        }

        public int hashCode() {
            return getErrorMsg().hashCode();
        }

        public String toString() {
            return "LockoutPermanent(errorMsg=" + getErrorMsg() + ")";
        }
    }

    public static final class d extends a {
        private final String aJ;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
            this.aJ = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.areEqual(getErrorMsg(), ((d) obj).getErrorMsg());
        }

        @Override // com.ts.coresdk.crypto.biometrcis.a
        public String getErrorMsg() {
            return this.aJ;
        }

        public int hashCode() {
            return getErrorMsg().hashCode();
        }

        public String toString() {
            return "NegativeButton(errorMsg=" + getErrorMsg() + ")";
        }
    }

    public static final class e extends a {
        private final String aK;

        public e(String str) {
            super(str, null);
            this.aK = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.areEqual(getErrorMsg(), ((e) obj).getErrorMsg());
        }

        @Override // com.ts.coresdk.crypto.biometrcis.a
        public String getErrorMsg() {
            return this.aK;
        }

        public int hashCode() {
            if (getErrorMsg() == null) {
                return 0;
            }
            return getErrorMsg().hashCode();
        }

        public String toString() {
            return "NoMatch(errorMsg=" + getErrorMsg() + ")";
        }
    }

    public static final class f extends a {
        private final String aL;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
            this.aL = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && Intrinsics.areEqual(getErrorMsg(), ((f) obj).getErrorMsg());
        }

        @Override // com.ts.coresdk.crypto.biometrcis.a
        public String getErrorMsg() {
            return this.aL;
        }

        public int hashCode() {
            return getErrorMsg().hashCode();
        }

        public String toString() {
            return "NoSpace(errorMsg=" + getErrorMsg() + ")";
        }
    }

    public static final class g extends a {
        private final String aM;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
            this.aM = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && Intrinsics.areEqual(getErrorMsg(), ((g) obj).getErrorMsg());
        }

        @Override // com.ts.coresdk.crypto.biometrcis.a
        public String getErrorMsg() {
            return this.aM;
        }

        public int hashCode() {
            return getErrorMsg().hashCode();
        }

        public String toString() {
            return "TimeOut(errorMsg=" + getErrorMsg() + ")";
        }
    }

    public static final class h extends a {
        private final String aN;

        public h(String str) {
            super(str, null);
            this.aN = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && Intrinsics.areEqual(getErrorMsg(), ((h) obj).getErrorMsg());
        }

        @Override // com.ts.coresdk.crypto.biometrcis.a
        public String getErrorMsg() {
            return this.aN;
        }

        public int hashCode() {
            if (getErrorMsg() == null) {
                return 0;
            }
            return getErrorMsg().hashCode();
        }

        public String toString() {
            return "UnKnown(errorMsg=" + getErrorMsg() + ")";
        }
    }

    public static final class i extends a {
        private final String aO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
            this.aO = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && Intrinsics.areEqual(getErrorMsg(), ((i) obj).getErrorMsg());
        }

        @Override // com.ts.coresdk.crypto.biometrcis.a
        public String getErrorMsg() {
            return this.aO;
        }

        public int hashCode() {
            return getErrorMsg().hashCode();
        }

        public String toString() {
            return "UnableToProcess(errorMsg=" + getErrorMsg() + ")";
        }
    }

    public static final class j extends a {
        private final String aP;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
            this.aP = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && Intrinsics.areEqual(getErrorMsg(), ((j) obj).getErrorMsg());
        }

        @Override // com.ts.coresdk.crypto.biometrcis.a
        public String getErrorMsg() {
            return this.aP;
        }

        public int hashCode() {
            return getErrorMsg().hashCode();
        }

        public String toString() {
            return "UserCanceled(errorMsg=" + getErrorMsg() + ")";
        }
    }

    private a(String str) {
        this.aF = str;
    }

    public /* synthetic */ a(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public String getErrorMsg() {
        return this.aF;
    }
}
