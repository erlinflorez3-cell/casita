package com.google.firebase.sessions;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: loaded from: classes7.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4G\u0005ӬBߚ\u0016\u000e\u0017jg/|dOngY*\u001fo\n4<[RrS?c\u001c\u0016\"7PɁkg|M+\u001aQ\u0011\u001e\u0016'k߽M[\u0001ز*\u00118F}D\u0004\\}=Q`#7ӯ$8*\u0600\u0012\u0007\u0007 8MǞz\u0003"}, d2 = {"\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005n\u0019b\f/3t\u001d*\\GEt\u0018\u001dj", "", "4hS", "", "/tc5G6DS\"", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@okq>", "5dc\u000eh;AB#\u0005zg", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0013\\+", "\u0011n\\=T5B]\"", "1n\\zZ6HU ~C_0\n\t,a\u000e(CA\u0005$\u0017Dk\u001c<>35g\f$Av$"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class InstallationId {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "InstallationId";
    private final String authToken;
    private final String fid;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0007\"B\u0012\u007fјnjO0LeN.Xݾ+%ӆ,4RZdvI;ڈ\u001e}0\t\u0018euj\u0007J\t\u000fs\u0013\u0014\u001b\u0011jZO\u001cޓ\u001cށ\u000e˰Բs?AT@IGa\r63\"\tĵ\u000bѩ\t\u0001\"ݒϽ\u0010x\u0003CQ#ܞ4H"}, d2 = {"\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005n\u0019b\f/3t\u001d*\\GEt\u0018\u001dSFkA\u0012_5R\u00010\u001d", "", "u(E", "\"@6", "", "1qT.g,", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005n\u0019b\f/3t\u001d*\\GEt\u0018\u001dj", "4ha2U(LS|\b\tm(\u0004\u0010+t\u00042\u0005N", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u0005 %Vk\u0015Cr49c\u0007.\u0001N\u001a;M@7y4\u0002\u001evp5\u000ej(]z1PZ*7`(", "uKR<`u@]#\u0001\u0002^u}\r<e|$\n@J\u001b U~\nC}!D]\b)E7v2ZC8gB\u001exqoH\u0003j3J\u0006+QU\\\bgVH$\u001a\u001ci\u0015R4V\u0003cN.~S;(\b:\u0013_Eq\u0010\u0010\u001f\u001e1ytL_e\u000b`\u001aqR%2MUh{\u0011+Bg*b\u001b5", "1n\\zZ6HU ~C_0\n\t,a\u000e(CA\u0005$\u0017Dk\u001c<>35g\f$Av$"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v10 */
        /* JADX WARN: Type inference failed for: r2v11 */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v9 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object create(com.google.firebase.installations.FirebaseInstallationsApi r9, kotlin.coroutines.Continuation<? super com.google.firebase.sessions.InstallationId> r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof com.google.firebase.sessions.InstallationId$Companion$create$1
                if (r0 == 0) goto L32
                r5 = r10
                com.google.firebase.sessions.InstallationId$Companion$create$1 r5 = (com.google.firebase.sessions.InstallationId$Companion$create$1) r5
                int r0 = r5.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                int r1 = (-1) - r0
                int r0 = (-1) - r2
                r1 = r1 | r0
                int r0 = (-1) - r1
                if (r0 == 0) goto L32
                int r0 = r5.label
                int r0 = r0 - r2
                r5.label = r0
            L19:
                java.lang.Object r7 = r5.result
                java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.label
                java.lang.String r3 = ""
                java.lang.String r0 = "InstallationId"
                r4 = 2
                r2 = 1
                if (r1 == 0) goto L45
                if (r1 == r2) goto L40
                if (r1 != r4) goto L38
                java.lang.Object r2 = r5.L$0
                java.lang.String r2 = (java.lang.String) r2
                goto L86
            L32:
                com.google.firebase.sessions.InstallationId$Companion$create$1 r5 = new com.google.firebase.sessions.InstallationId$Companion$create$1
                r5.<init>(r8, r10)
                goto L19
            L38:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            L40:
                java.lang.Object r9 = r5.L$0
                com.google.firebase.installations.FirebaseInstallationsApi r9 = (com.google.firebase.installations.FirebaseInstallationsApi) r9
                goto L5d
            L45:
                kotlin.ResultKt.throwOnFailure(r7)
                r0 = 0
                com.google.android.gms.tasks.Task r1 = r9.getToken(r0)     // Catch: java.lang.Exception -> L6c
                java.lang.String r0 = "firebaseInstallations.getToken(false)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)     // Catch: java.lang.Exception -> L6c
                r5.L$0 = r9     // Catch: java.lang.Exception -> L6c
                r5.label = r2     // Catch: java.lang.Exception -> L6c
                java.lang.Object r7 = kotlinx.coroutines.tasks.TasksKt.await(r1, r5)     // Catch: java.lang.Exception -> L6c
                if (r7 != r6) goto L60
                return r6
            L5d:
                kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Exception -> L6c
            L60:
                com.google.firebase.installations.InstallationTokenResult r7 = (com.google.firebase.installations.InstallationTokenResult) r7     // Catch: java.lang.Exception -> L6c
                java.lang.String r2 = r7.getToken()     // Catch: java.lang.Exception -> L6c
                java.lang.String r0 = "{\n          firebaseInst…).await().token\n        }"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)     // Catch: java.lang.Exception -> L6c
                goto L72
            L6c:
                r1 = move-exception
                java.lang.String r0 = "Error getting authentication token."
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r2 = r3
            L72:
                com.google.android.gms.tasks.Task r1 = r9.getId()     // Catch: java.lang.Exception -> L92
                java.lang.String r0 = "firebaseInstallations.id"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)     // Catch: java.lang.Exception -> L92
                r5.L$0 = r2     // Catch: java.lang.Exception -> L92
                r5.label = r4     // Catch: java.lang.Exception -> L92
                java.lang.Object r7 = kotlinx.coroutines.tasks.TasksKt.await(r1, r5)     // Catch: java.lang.Exception -> L92
                if (r7 != r6) goto L89
                return r6
            L86:
                kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Exception -> L92
            L89:
                java.lang.String r0 = "{\n          firebaseInst…ions.id.await()\n        }"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)     // Catch: java.lang.Exception -> L92
                java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L92
                r3 = r7
                goto L97
            L92:
                r1 = move-exception
                java.lang.String r0 = "Error getting Firebase installation id ."
                java.lang.Throwable r1 = (java.lang.Throwable) r1
            L97:
                com.google.firebase.sessions.InstallationId r1 = new com.google.firebase.sessions.InstallationId
                r0 = 0
                r1.<init>(r3, r2, r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.InstallationId.Companion.create(com.google.firebase.installations.FirebaseInstallationsApi, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    private InstallationId(String str, String str2) {
        this.fid = str;
        this.authToken = str2;
    }

    public /* synthetic */ InstallationId(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    public final String getAuthToken() {
        return this.authToken;
    }

    public final String getFid() {
        return this.fid;
    }
}
