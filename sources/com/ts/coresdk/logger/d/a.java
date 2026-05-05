package com.ts.coresdk.logger.d;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.dynatrace.android.agent.AdkSettings;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.ts.coresdk.ITSModuleInfo;
import com.ts.coresdk.JsonStringConvertor;
import com.ts.coresdk.logger.b.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.NotImplementedError;
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
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&˛\bDZc|\u0004G\u00078\u000bDB\u0007Ӭ4\u0012\u000e\u0007nj?1Le^.XX@ş\nzd$\n.*C:XZ\u00132\r]S\u007fg\u001dNj\u000fQ\u0016\u001e\u0016'p߽MW~e \u0018zO}@KM\u001e=\u007fuҽ:\u0007&30:"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxl\n*}@\u000e`\u0016\u0011kc", RemoteSettings.FORWARD_SLASH_STRING, "\u001a`]1e6BR,H\rh9\u0003R\u0016i\u000e7{I|\u0014\u001eGa\u0018I|%B\u0018j E}\u001d=#", "2nF<e2", "u(;.a+K]\u001d}\u000e(>\u0007\u00165/f,\nO\u0001 \u0013Dv\u000e.\u00012;Y\u000b^$m$>TR\u0011", AdkSettings.PLATFORM_TYPE_MOBILE, "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", ">/", "\u001a`]1e6BR,H\rh9\u0003R!o\r.{Mk\u0013$Cw\u000eKv2C/", ">0", "\nh]6g\u0005", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt8\u007f$Bc\u0002\u001fJ7(8ZI\u0005]>+\u001bhn$\u0003p(Vv6GY\\\u0002 C", "\u001a`]1e6BR,H\rh9\u0003R!o\r.{MV"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class a extends Worker {

    /* JADX INFO: renamed from: a */
    public static final C0322a f18282a = new C0322a(null);

    /* JADX INFO: renamed from: com.ts.coresdk.logger.d.a$a */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u0006DLc\u0003İGّ1!Ǟr~P-R~\rfʴ=2JdV."}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxl\n*}@\u000e`\u0016\u0011kL8L", "\nh]6g\u0005", "u(E", ""}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class C0322a {
        private C0322a() {
        }

        public /* synthetic */ C0322a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static final class b implements ITSModuleInfo {

        /* JADX INFO: renamed from: cl */
        private final String f18283cl;
        private final List<String> cm;
        private final String cn;

        /* JADX INFO: renamed from: co */
        private final String f18284co;

        public b(String str, List<String> list, String str2, String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.f18283cl = str;
            this.cm = list;
            this.cn = str2;
            this.f18284co = str3;
        }

        @Override // com.ts.coresdk.ITSModuleInfo
        public List<String> endpointIgnoreList(Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return this.cm;
        }

        @Override // com.ts.coresdk.ITSModuleInfo
        public boolean isLoggerEnabled(Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return false;
        }

        @Override // com.ts.coresdk.ITSModuleInfo
        public String subSystemName() {
            return this.f18283cl;
        }

        @Override // com.ts.coresdk.ITSModuleInfo
        public String tenantID() {
            return this.cn;
        }

        @Override // com.ts.coresdk.ITSModuleInfo
        public String version() {
            throw new NotImplementedError("An operation is not implemented: Not yet implemented");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(workerParameters, "");
    }

    @Override // androidx.work.Worker
    public ListenableWorker.Result doWork() {
        JsonArray jsonArrayA;
        Object objFromJson;
        String string = getInputData().getString("modulesInfo");
        if (string != null && (jsonArrayA = com.ts.coresdk.b.a(string)) != null) {
            for (JsonElement jsonElement : jsonArrayA) {
                JsonStringConvertor jsonStringConvertor = JsonStringConvertor.INSTANCE;
                String asString = jsonElement.getAsString();
                Intrinsics.checkNotNullExpressionValue(asString, "");
                try {
                    objFromJson = new Gson().fromJson(asString, (Class<Object>) com.ts.coresdk.controllers.a.class);
                } catch (Throwable unused) {
                    objFromJson = null;
                }
                com.ts.coresdk.controllers.a aVar = (com.ts.coresdk.controllers.a) objFromJson;
                if (aVar != null) {
                    a.C0321a c0321a = com.ts.coresdk.logger.b.a.f18281a;
                    Context applicationContext = getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "");
                    c0321a.e(applicationContext).b(new b(aVar.a(), aVar.b(), aVar.c(), aVar.d()));
                }
            }
        }
        ListenableWorker.Result resultSuccess = ListenableWorker.Result.success();
        Intrinsics.checkNotNullExpressionValue(resultSuccess, "");
        return resultSuccess;
    }
}
