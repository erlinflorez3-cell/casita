package io.sentry.android.replay;

import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005%4\u0012\u000e\u0007nj?6LeV.Zݷ2\u000f\u0002{<$q$yCQU\"}8\tWȞm̨n`ҙ;C=\u0005V}p,֒Yxk\u0012WlP\u007fW3{\u0001min\u0007N10D2H\n\u0007\u0011\u001aX]>\u000bcI[\u000e\"0n\u0006\u0019h\u001d_\u0015*\"\bN /3\u000b{7<Xnm:]8a\u007fpamd\u0001\u0018[\u000e^V=\f%cTk\u0017ʽߓ\u0015ȏW\r\u000fTaD\u0011E\n?\u000bk5+{h\u0002^N^\u0010\u0014\u001b,e\f\fz\\\u001d[Ĭӥ\fˏ/YkMV\u00196}\u0013}\u0013E\u0012\u0018VBV:E\u001c|\u0007<2+3*öЕ\u0002ެF\n\u0003c<&3\u0006K-?(t_Ŏ?0"}, d2 = {"\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\u007f@\u007f$?ke\u001c@i\u0018.Z1F\u007f\n", "", "u(E", ";UX2j:\u001fW\u0019\u0006y", "\u001aiPCTuEO\"\u0001Dk,}\u0010/c\u000fq\\D\u0001\u001e\u0016\u001d", "5dc\u001aI0>e'_~^3{", "u(;7T=:\u001d z\u0004`u\n\t0l\u007f&\u000b\na\u001b\u0017Nnc", ";UX2j:\u001fW\u0019\u0006y\u001d+|\u0010/g{7{", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "Eh]1b>&O\"z|^9Z\u0010+s\u000e", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "5dc$\\5=]+fvg(~\t<C\u0007$\nN", "u(;7T=:\u001d z\u0004`uZ\u0010+s\u000e}", "Eh]1b>&O\"z|^9Z\u0010+s\u000efz@\b\u0017\u0019C~\u000e", "Eh]1b>&O\"z|^9`\u0012=t{1y@", "5dc$\\5=]+fvg(~\t<I\t6\u000b<\n\u0015\u0017", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "Eh]1b>&O\"z|^9`\u0012=t{1y@?\u0016\u0017No\u00108\u0006%", "AvP=J0GR#\u0011bZ5x\u000b/ra/\u0006=|\u001e~8s\u000eN\u0005", "", "AvP=", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", "Ad]Ae@\u0006O\"}\bh0{P<e\u000b/wTz$\u0017No\nJv"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class WindowManagerSpy {
    public static final WindowManagerSpy INSTANCE = new WindowManagerSpy();
    private static final Lazy windowManagerClass$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<Class<?>>() { // from class: io.sentry.android.replay.WindowManagerSpy$windowManagerClass$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Class<?> invoke() {
            try {
                return Class.forName("android.view.WindowManagerGlobal");
            } catch (Throwable th) {
                return null;
            }
        }
    });
    private static final Lazy windowManagerInstance$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<Object>() { // from class: io.sentry.android.replay.WindowManagerSpy$windowManagerInstance$2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Method method;
            Class windowManagerClass = WindowManagerSpy.INSTANCE.getWindowManagerClass();
            if (windowManagerClass == null || (method = windowManagerClass.getMethod("getInstance", new Class[0])) == null) {
                return null;
            }
            return method.invoke(null, new Object[0]);
        }
    });
    private static final Lazy mViewsField$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<Field>() { // from class: io.sentry.android.replay.WindowManagerSpy$mViewsField$2
        @Override // kotlin.jvm.functions.Function0
        public final Field invoke() throws NoSuchFieldException {
            Class windowManagerClass = WindowManagerSpy.INSTANCE.getWindowManagerClass();
            if (windowManagerClass == null) {
                return null;
            }
            Field declaredField = windowManagerClass.getDeclaredField("mViews");
            declaredField.setAccessible(true);
            return declaredField;
        }
    });

    private WindowManagerSpy() {
    }

    private final Field getMViewsField() {
        return (Field) mViewsField$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> getWindowManagerClass() {
        return (Class) windowManagerClass$delegate.getValue();
    }

    private final Object getWindowManagerInstance() {
        return windowManagerInstance$delegate.getValue();
    }

    public final void swapWindowManagerGlobalMViews(Function1<? super ArrayList<View>, ? extends ArrayList<View>> swap) {
        Field mViewsField;
        Intrinsics.checkNotNullParameter(swap, "swap");
        try {
            Object windowManagerInstance = getWindowManagerInstance();
            if (windowManagerInstance == null || (mViewsField = INSTANCE.getMViewsField()) == null) {
                return;
            }
            Object obj = mViewsField.get(windowManagerInstance);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.util.ArrayList<android.view.View>{ kotlin.collections.TypeAliasesKt.ArrayList<android.view.View> }");
            mViewsField.set(windowManagerInstance, swap.invoke((ArrayList) obj));
        } catch (Throwable th) {
        }
    }
}
