package com.ts.coresdk.db;

import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.Global;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.C1580rY;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.QB;
import yg.Xg;
import yg.Xu;
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
@Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&˛\bDZc|\u0004G\b8\u000bDB\u0005ABߚ\u0016\u0006\u0017jg5|dGnWޚ.\u0011q~B($1\u007fDSUH}h.ҊRimoX\\"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxd|qY\u001f|&\u0013Dk\u001c<L", RemoteSettings.FORWARD_SLASH_STRING, "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxl\n*}@\u000e`\u0016D9\n\u0012", Global.COLON, "u(;0b4\bb'Hxh9|\u0017.kI/\u0006B\u0003\u0017$\u0011n\u000b\u0006rz", "\nh]6g\u0005", "u(E", "\u001a`]1e6BR,H\bh6\u0005R\u001co\n0Z<\u0010\u0013\u0014C}\u000e\u0012"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public abstract class CDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f18279a = new a(null);
    private static volatile CDatabase bt = null;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u0016DLcz\u0005I\u0006F\u000b6B\u0005%4\u0012\u0006јlʘ:FǏ\u0016H\\[\u00141\u0015kڷ8&a+\u007fK\u0004j(\u0003:\t}M\u0018k|Nr\u000bq\u0012L\u001bѱn.OZ\u0007cb%@D\bAIL\u001e<o`36[ڗ>ŕ<}\r\u0003 *V\u0011"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxd|qY\u001f|&\u0013Dk\u001c<5!\u000b", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxd|qY\u001f|&\u0013Dk\u001c<L", "0s", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxd|qY\u001f|&\u0013Dk\u001c<L", RemoteSettings.FORWARD_SLASH_STRING, "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", ">/", AdkSettings.PLATFORM_TYPE_MOBILE, "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ#t/=#\r.\u0001k ;MQ:q}\u001d\u00122?\u0018\u0003r(Kr5G\"", "\nh]6g\u0005", "u(E", ""}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CDatabase b(Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            CDatabase cDatabase = CDatabase.bt;
            if (cDatabase == null) {
                synchronized (this) {
                    Class<?> cls = Class.forName(Xg.qd("}\f\u0003\u0012\u0010\u000b\u0007Q\b\u0015\u0015\u001c\u000e\u0018\u001fYo\u001d\u001d$\u0016*'", (short) (OY.Xd() ^ 14727), (short) (OY.Xd() ^ 12586)));
                    Class<?>[] clsArr = new Class[0];
                    Object[] objArr = new Object[0];
                    short sXd = (short) (C1580rY.Xd() ^ (-10715));
                    short sXd2 = (short) (C1580rY.Xd() ^ (-9150));
                    int[] iArr = new int["(a\u001d'\u00038h\u0013Gz:k'ZlE\u007f2P I".length()];
                    QB qb = new QB("(a\u001d'\u00038h\u0013Gz:k'ZlE\u007f2P I");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
                        i2++;
                    }
                    Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
                    try {
                        method.setAccessible(true);
                        RoomDatabase roomDatabaseBuild = Room.databaseBuilder((Context) method.invoke(context, objArr), CDatabase.class, ZO.xd("0QUV]\u001ep\u000ff1\t}U\u000e0j", (short) (FB.Xd() ^ 25005), (short) (FB.Xd() ^ 10729))).fallbackToDestructiveMigration().build();
                        Intrinsics.checkNotNullExpressionValue(roomDatabaseBuild, "");
                        cDatabase = (CDatabase) roomDatabaseBuild;
                        a aVar = CDatabase.f18279a;
                        CDatabase.bt = cDatabase;
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
            }
            return cDatabase;
        }
    }

    public abstract com.ts.coresdk.logger.db.a l();
}
