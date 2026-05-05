package com.ts.coresdk.logger.b;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.dynatrace.android.agent.AdkSettings;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ts.coresdk.ITSModuleInfo;
import com.ts.coresdk.controllers.TSDataSyncServerController;
import com.ts.coresdk.controllers.TSSendDataWorkerInfo;
import com.ts.coresdk.logger.db.TSLogEntity;
import com.ts.coresdk.logger.db.d;
import com.ts.coresdk.logger.network.TSLogServerProvider;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.C1580rY;
import yg.C1626yg;
import yg.InterfaceC1492Gx;
import yg.ZN;
import yg.ZO;

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
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&˛\bDZc|\u0004W\u00068\u000bDB\u0007\"2\u0012\u007f\u0007|jA0JeP.`S2\u000fq|<$q$yCAU\"}0ޛUȞ}˧\rI\u000b\u000bq\u001e>\u0015w+;OU\ta \u0015JB\u001eKݯQqCFn\u0003~ .1:8(\r1\u001e8N(v)H{\u0010 7XphSҫQ\u0007 \u0011\u0014Gh\u0014,f\u007fNdP\u001daH5;\u0003\u0018GĚ+a6\u0007[\u0018\u0017r5\f\u000fm.-P7c\u00165U\u0013\u0007\u0001]m\u0003uq\u0014ݟjҊ+/Qu]9f\u0004"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxl\n*}@\u000e`\u0014\u0011kc", RemoteSettings.FORWARD_SLASH_STRING, "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\n1\u000bM\u000b\u001e\u001eG|\u001c\u0006e\u0013\u0014U\r\u001c%\u0002\u001f,;CH|4+rrjH\u0014m3Uv4\u001d", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxl\n*}@\u000e`\u0016D9|*]/79\u0007/;|*\u0004", "\u001aiPCTuEO\"\u0001DO6\u0001\b\u0005", "0W", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\n1\u000bM\u000b\u001e\u001eG|\u001c\u0006e\u0013\u0014U\r\u001c%\u0002\u001f,;CH|4+rrjH\u0014m3Uv4\u001d", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxIn\u0016cJ\u007f'\u001eGS\u0017=\u0001z", ">/", ">0", "", "uKR<`uMab|\u0005k,\u000b\b5/c\u0017i(\u000b\u0016'NoqEw/\u000b@{*?7%<\u0017AEx4,\u0014n+@\u0011e.N\u0004pFI\u0018\u001bJ9|?s\u001bi\u0012]?bHJ", AdkSettings.PLATFORM_TYPE_MOBILE, "uKR<`uMab|\u0005k,\u000b\b5/c\u0017i(\u000b\u0016'NoqEw/\u000b\u001dn", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "\nh]6g\u0005", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", ""}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0321a f18281a = new C0321a(null);
    private static volatile a bY = null;
    private final TSDataSyncServerController<TSLogEntity, Void> bX;

    /* JADX INFO: renamed from: com.ts.coresdk.logger.b.a$a, reason: collision with other inner class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u0016DLcz\u0005I\u0006F\u000b6B\u0005%4\u0012\u0006јlʘ:FǏ\u0016H\\[\u00141\u0015kڷ8&a+\u007fK\u0004j(\u0003:\t}M\u0018k|Nr\u000bq\u0012L\u001bѱn.OZ\u0007cb%@D\bAIL\u001e<o`36[ڗ>ŕ<}\r\u0003 *V\u0011"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxl\n*}@\u000e`\u0014\u0011kL8L", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxl\n*}@\u000e`\u0014\u0011kc", "0X", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxl\n*}@\u000e`\u0014\u0011kc", RemoteSettings.FORWARD_SLASH_STRING, "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", ">/", ExifInterface.GPS_MEASUREMENT_3D, "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ#t/=#\r.\u0001k ;MQ:q}%\u001fjc9\u0014-)\u0018r|", "\nh]6g\u0005", "u(E", ""}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class C0321a {
        private C0321a() {
        }

        public /* synthetic */ C0321a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final a e(Context context) {
            a aVar;
            Intrinsics.checkNotNullParameter(context, "");
            if (a.bY != null) {
                a aVar2 = a.bY;
                Intrinsics.checkNotNull(aVar2);
                return aVar2;
            }
            synchronized (this) {
                if (a.bY == null) {
                    C0321a c0321a = a.f18281a;
                    Object[] objArr = new Object[0];
                    Method method = Class.forName(ZO.xd("]2n4[m9iFO\u0005dZDVvt%\u0017-L5t", (short) (ZN.Xd() ^ 20843), (short) (ZN.Xd() ^ 17260))).getMethod(C1626yg.Ud("NZrEL\u0015\u0019$o:)\u001f\u0019\u001f\u001f\u007fmG\u0012:K", (short) (C1580rY.Xd() ^ (-5028)), (short) (C1580rY.Xd() ^ (-12875))), new Class[0]);
                    try {
                        method.setAccessible(true);
                        Context context2 = (Context) method.invoke(context, objArr);
                        Intrinsics.checkNotNullExpressionValue(context2, "");
                        a.bY = new a(context2, null);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                aVar = a.bY;
                Intrinsics.checkNotNull(aVar);
            }
            return aVar;
        }
    }

    private a(Context context) {
        this.bX = new TSDataSyncServerController<>(context, new d(context), new TSLogServerProvider(context), 100, 15000L, new TSSendDataWorkerInfo(com.ts.coresdk.logger.d.a.class, "modulesInfo"));
    }

    public /* synthetic */ a(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    public final void a(ITSModuleInfo iTSModuleInfo, TSLogEntity tSLogEntity) {
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        Intrinsics.checkNotNullParameter(tSLogEntity, "");
        this.bX.addData(tSLogEntity, iTSModuleInfo);
    }

    public final void b(ITSModuleInfo iTSModuleInfo) {
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        this.bX.triggerData(null, null, iTSModuleInfo);
    }
}
