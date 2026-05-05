package com.ts.coresdk.crypto.biometrcis;

import android.content.Context;
import androidx.biometric.BiometricManager;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.EO;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0018\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4D\u0007\":ߚ}ҟf\u0001ˎ`D\u0014NfQUj\u0016q{Č(]*uQ@\u001e/\f$!O|h\u0018rXZ#C=\u0005\\}̶0K[zk\u0015"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0014Ky\u0016<\u000623]\fi6C", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", ">/", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0014Ky\u0016<\u000623]\fi6,\u0012\u0004", RemoteSettings.FORWARD_SLASH_STRING, "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ#t/=#\r.\u0001k ;MQ:q}\u001c\"|lH\u0011-)R\u0001/G[[*``<<R\u000e0", "\nh]6g\u0005", "u(E", ""}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class d {
    public static final d INSTANCE = new d();

    public interface a {

        /* JADX INFO: renamed from: com.ts.coresdk.crypto.biometrcis.d$a$a, reason: collision with other inner class name */
        public static final class C0320a implements a {
            private final com.ts.coresdk.crypto.biometrcis.b bc;

            public C0320a(com.ts.coresdk.crypto.biometrcis.b bVar) {
                Intrinsics.checkNotNullParameter(bVar, "");
                this.bc = bVar;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0320a) && this.bc == ((C0320a) obj).bc;
            }

            public int hashCode() {
                return this.bc.hashCode();
            }

            public final com.ts.coresdk.crypto.biometrcis.b k() {
                return this.bc;
            }

            public String toString() {
                return "Failure(error=" + this.bc + ")";
            }
        }

        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u0006DLc\u000b\u0004Gڑ0!Ǟr~P-R~\rfʴ=2JdV."}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0014Ky\u0016<\u000623]\fi6,\u0012lJ\u0019", "\nh]6g\u0005", "u(E", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0014Ky\u0016<\u000623]\fi6,\u0012\u0004"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
        public static final class b implements a {
            public static final b INSTANCE = new b();

            private b() {
            }
        }
    }

    private d() {
    }

    public final a a(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        Object[] objArr = new Object[0];
        Method method = Class.forName(EO.Od("Z6{c2Yzm\u0003\u001c\u0017A}\u0007\u0017sVj3\u00033\f4", (short) (C1580rY.Xd() ^ (-20243)))).getMethod(C1561oA.Qd("96D\u0010>=84-*<053\u0007205%72", (short) (C1633zX.Xd() ^ (-21553))), new Class[0]);
        try {
            method.setAccessible(true);
            int iCanAuthenticate = BiometricManager.from((Context) method.invoke(context, objArr)).canAuthenticate(15);
            return iCanAuthenticate != -2 ? iCanAuthenticate != -1 ? iCanAuthenticate != 0 ? iCanAuthenticate != 1 ? iCanAuthenticate != 11 ? iCanAuthenticate != 12 ? iCanAuthenticate != 15 ? new a.C0320a(b.BIOMETRIC_ERROR_UNSUPPORTED) : new a.C0320a(b.BIOMETRIC_ERROR_SECURITY_UPDATE_REQUIRED) : new a.C0320a(b.BIOMETRIC_ERROR_NO_HARDWARE) : new a.C0320a(b.BIOMETRIC_ERROR_NONE_ENROLLED) : new a.C0320a(b.BIOMETRIC_ERROR_HW_UNAVAILABLE) : a.b.INSTANCE : new a.C0320a(b.BIOMETRIC_STATUS_UNKNOWN) : new a.C0320a(b.BIOMETRIC_ERROR_UNSUPPORTED);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
