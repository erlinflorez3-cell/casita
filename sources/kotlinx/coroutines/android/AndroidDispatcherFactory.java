package kotlinx.coroutines.android;

import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.internal.MainDispatcherFactory;
import yg.C1580rY;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.Qg;
import yg.Wg;
import yg.ZN;
import yg.hg;

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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u0016DLcz\u0005I\u0006F\u000b6Ȑ\u0007\":0\u007fјnjG<L͜P.`Y2\u000fq|:řqҕ\"CiTZ\u0003̀\rQTguo\u0013n\u0019E'\u0006D{\u001b6WY\u0011c\"\u0011BB\u001e>aR6Q\u0002f\u0003<\u001d `)~\u000eU\u0013(2`\u0010%\u0004y b܌2Ϯt>j\u000fS\u000f(\u001dĈB,"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E<\n\u0016$Qs\r\u0006R.4f\b$6L\u001a<X?Ji7\u001e\"I]7\u0016m9bL", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\r1]\u0007~;{!*\\A>kA~\u0011fpC\u0014w\u0002", "\nh]6g\u0005", "u(E", "1qT.g,\u001dW'\nvm*\u007f\t<", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E(|\u001b %y\u001bF\u000749b}~;{!*\\A>kAs", "/k[\u0013T*M]&\u0003zl", "", "6h]AB5\u001e`&\t\b", "", ":nP1C9B]&\u0003\nr", "", "5dc\u0019b(=>&\u0003\u0005k0\f\u001d", "u(8", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eowI\u007f$!Kn"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class AndroidDispatcherFactory implements MainDispatcherFactory {
    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public MainCoroutineDispatcher createDispatcher(List<? extends MainDispatcherFactory> list) throws Throwable {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(Wg.vd("\u0017#\u001c))\" h-0m\u000b104(8", (short) (FB.Xd() ^ 2637))).getDeclaredMethod(Qg.kd("-*8\u0010#*.\u000b-,, ,", (short) (ZN.Xd() ^ 19829), (short) (ZN.Xd() ^ 1355)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            Looper looper = (Looper) declaredMethod.invoke(null, objArr);
            if (looper == null) {
                throw new IllegalStateException(hg.Vd("I\\X\u0012^QX\\\rXZYYMY\u0006NW\u0003PPT~?S=DF::C;", (short) (C1580rY.Xd() ^ (-402)), (short) (C1580rY.Xd() ^ (-31214))));
            }
            return new HandlerContext(HandlerDispatcherKt.asHandler(looper, true), null, 2, 0 == true ? 1 : 0);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public int getLoadPriority() {
        return LockFreeTaskQueueCore.MAX_CAPACITY_MASK;
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public String hintOnError() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }
}
