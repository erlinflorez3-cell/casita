package org.koin.mp;

import androidx.exifinterface.media.ExifInterface;
import com.drew.metadata.iptc.IptcDirectory;
import com.dynatrace.android.agent.Global;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import org.koin.core.context.GlobalContext;
import org.koin.core.context.KoinContext;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;
import org.koin.core.logger.PrintLogger;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.ZO;

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
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯV\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.hS2şs{B0c$wCCU0}*\tUNog\u0005Jb\u000bY\u000f\u000eǝ\u0001j:l]xc\u0015\u00172XoG\u074cUoS9ht<\u0005&ތ\"Nц5\u0001H)\t\u0015|zŲO\f 0\ttHS%M3\u001cZ\nL#\u0019\u001e\u000bk\u0017DVqu:])3oHN5fH|{\u0015\u000fX5\u0016\u000faL5\tGC =S1\u0011\u0003cM\u000fWuM\u0005n(U8\u0012\u0004eDp\u007fB\u001f[W\u001bl\u000b*\u000b\u0015:`j8skq]h\u001a8y\u000b{SP\u0014\u0010\u0016'\u000fC[-\u0007\n\u0014ޗ\u0003\u0007sBV\u0001lWH$oL/%FJK;!Ƙ_xk!\\O\u0014\t;\u001d\f\u0001M:\f^\u001cz-!dya1\u0018Wkcݳ\u000eYK\nշt\u007f"}, d2 = {"\u001ana4\"2HW\"H\u0003iub\u00133nj/wO\u0002!$O^\u0018F}3\u000b", "", "u(E", "2dU.h3M1#\b\n^?\f", "\u001ana4\"2HW\"Hxh9|R-o\t7{S\u0010`|Qs\u0017\u001a\u0001.DY\u0011/\r", "2dU.h3M:\u0015\u0014\u000fF6{\t", "\u001aj^A_0G\u001d\u007fz\u0010r\u001b\u007f\u0016/a~\u0016wA\u0001&+/y\r<L", "2dU.h3M:#\u0001|^9", "\u001ana4\"2HW\"Hxh9|R6o\u0002*{MJ}!Iq\u000eIL", ":de2_", "\u001ana4\"2HW\"Hxh9|R6o\u0002*{MJ}\u0017Xo\u0015\u0012", "5d]2e(MS|}", "", "5dc\u0010_(La\u0002z\u0003^", "9B[.f:", "\u001aj^A_0G\u001d&~{e,z\u0018xK]/wN\u000fl", "5dc g(<Y\b\fv\\,", ExifInterface.GPS_MEASUREMENT_3D, "\u001aiPCTuEO\"\u0001D>?z\t:t\u00042\u0005\u0016", "\u001aj^A_0G\u001dx\u0012x^7\f\r9nU", "A`U2;(LV\u0001z\u0006", "", "\u0019", "$", "Ax]0[9H\\\u001d\u0014z]", Global.BLANK, ":nR8", "\u001ana4\"2HW\"H\u0003iuc\u0013-k{%\u0003@V", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u0010.\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", "9nX; *H`\u0019"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class KoinPlatformTools {
    public static final KoinPlatformTools INSTANCE = new KoinPlatformTools();

    private KoinPlatformTools() {
    }

    public static /* synthetic */ Logger defaultLogger$default(KoinPlatformTools koinPlatformTools, Level level, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            level = Level.INFO;
        }
        return koinPlatformTools.defaultLogger(level);
    }

    public final KoinContext defaultContext() {
        return GlobalContext.INSTANCE;
    }

    public final LazyThreadSafetyMode defaultLazyMode() {
        return LazyThreadSafetyMode.SYNCHRONIZED;
    }

    public final Logger defaultLogger(Level level) {
        Intrinsics.checkNotNullParameter(level, "level");
        return new PrintLogger(level);
    }

    public final String generateId() {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final String getClassName(KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        String name = JvmClassMappingKt.getJavaClass((KClass) kClass).getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }

    public final String getStackTrace(Exception exc) throws Throwable {
        Intrinsics.checkNotNullParameter(exc, ZO.xd("\f", (short) (C1580rY.Xd() ^ (-616)), (short) (C1580rY.Xd() ^ (-18630))));
        StringBuilder sbAppend = new StringBuilder().append(exc);
        short sXd = (short) (Od.Xd() ^ (-7866));
        short sXd2 = (short) (Od.Xd() ^ (-16982));
        int[] iArr = new int["\fe".length()];
        QB qb = new QB("\fe");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        StringBuilder sbAppend2 = sbAppend.append(str);
        StackTraceElement[] stackTrace = exc.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, Ig.wd(" m\u000f\u0005~/\u0015d#P=e5y[\u0001H9", (short) (ZN.Xd() ^ 19259)));
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTrace) {
            StackTraceElement stackTraceElement2 = stackTraceElement;
            Object[] objArr = new Object[0];
            Method method = Class.forName(EO.Od("p2YlaL\u00131u\n/0ljX!\u0015o;'B3{\u0002uL6", (short) (C1633zX.Xd() ^ (-6858)))).getMethod(C1561oA.Qd("qn|JrfwvPbmd", (short) (Od.Xd() ^ (-15953))), new Class[0]);
            try {
                method.setAccessible(true);
                String str2 = (String) method.invoke(stackTraceElement2, objArr);
                Intrinsics.checkNotNullExpressionValue(str2, C1593ug.zd("a`p@j`stPdqj.5673", (short) (FB.Xd() ^ IptcDirectory.TAG_COPYRIGHT_NOTICE), (short) (FB.Xd() ^ 11618)));
                String str3 = str2;
                short sXd3 = (short) (C1633zX.Xd() ^ (-21848));
                int[] iArr2 = new int["fg_\u001eaSSXPM]".length()];
                QB qb2 = new QB("fg_\u001eaSSXPM]");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(sXd3 + sXd3 + i3 + xuXd2.CK(iKK2));
                    i3++;
                }
                if (StringsKt.contains$default((CharSequence) str3, (CharSequence) new String(iArr2, 0, i3), false, 2, (Object) null)) {
                    break;
                }
                arrayList.add(stackTraceElement);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        return sbAppend2.append(CollectionsKt.joinToString$default(arrayList, str, null, null, 0, null, null, 62, null)).toString();
    }

    public final <K, V> Map<K, V> safeHashMap() {
        return new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: synchronized */
    public final <R> R m10850synchronized(Object lock, Function0<? extends R> block) {
        R rInvoke;
        Intrinsics.checkNotNullParameter(lock, "lock");
        Intrinsics.checkNotNullParameter(block, "block");
        synchronized (lock) {
            rInvoke = block.invoke();
        }
        return rInvoke;
    }
}
