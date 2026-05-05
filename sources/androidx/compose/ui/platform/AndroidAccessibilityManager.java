package androidx.compose.ui.platform;

import android.content.Context;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Wg;
import yg.ZN;

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
/* JADX INFO: compiled from: AndroidAccessibilityManager.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007fјnjG7LeN.ZS8\u0018s{:&aҕ\bّYaJ}P\b\bMs(yZ^\u0019C'\u0006Dy̶0Icz&8\u001d7Zom9}sK@xtd\u000bP60@\u0012\u0005/#ZL\u001e\u0001\u0013Cy\u0015B4N{RR;VK.b\u0012L#\u0019\u001e\u000bk%ȧJǰa:7݊ɮmO"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011b|-Aq\u0015\nKA;yB\"\u0012lh=\u0016w\u0014J\u007f#IL[\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011W{ E{\u001a+QJ?zH\u0006\u0011q];\u0007p\u0002", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", "/bR2f:BP\u001d\u0006~m@d\u00058a\u0002(\t", "\u001a`]1e6BRb\u0010~^>F\u0005-c\u007f6\nD}\u001b\u001eK~\"\u0006R#3Y\f.;j\u001a5QROS0'\u0011jaF\\", "1`[0h3:b\u0019kz\\6\u0005\u0011/n~(z/\u0005\u001f\u0017Q\u007f\u001d$z,<]\f", "", "=qX4\\5:Z\b\u0003\u0003^6\r\u0018\u0017i\u0007/\u007fN", "1n]AT0Ga||\u0005g:", "", "1n]AT0Ga\b~\u000em", "1n]AT0Gav\t\u0004m9\u0007\u0010=", "\u0011n\\=T5B]\"", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AndroidAccessibilityManager implements AccessibilityManager {

    @Deprecated
    public static final int FlagContentControls = 4;

    @Deprecated
    public static final int FlagContentIcons = 1;

    @Deprecated
    public static final int FlagContentText = 2;
    private final android.view.accessibility.AccessibilityManager accessibilityManager;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: AndroidAccessibilityManager.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005#2ߝx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԉt\u07beSNo˧?Vh\u000e[\u000f4\u0018O̚~֒Yxe܈_>PsW3{q\u0014ʧ3ҽ:\u0005(݅ś<~"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011b|-Aq\u0015\nKA;yB\"\u0012lh=\u0016w\u0014J\u007f#IL[j:\\zH\u0010\u001b^\u0018W\u0001", "", "u(E", "\u0014kP466Gb\u0019\b\n<6\u0006\u0018<o\u00076", "", "\u0014kP466Gb\u0019\b\nB*\u0007\u0012=", "\u0014kP466Gb\u0019\b\nM,\u0010\u0018", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AndroidAccessibilityManager(Context context) throws Throwable {
        Object[] objArr = {C1561oA.Qd("LMLMZYNFLNJTX", (short) (C1499aX.Xd() ^ (-3133)))};
        Method method = Class.forName(C1593ug.zd("hvm|zuq<r\u007f\u007f\u0007x\u0003\nDZ\b\b\u000f\u0001\u0015\u0012", (short) (C1580rY.Xd() ^ (-24737)), (short) (C1580rY.Xd() ^ (-14364)))).getMethod(C1561oA.Kd("\u001e\u001d-\r4/1#,\u0013&49-(+", (short) (C1580rY.Xd() ^ (-7964))), Class.forName(C1561oA.od("+!5\u001fj(\u001c( e\n*'\u001d!\u0019", (short) (C1499aX.Xd() ^ (-22128)))));
        try {
            method.setAccessible(true);
            Object objInvoke = method.invoke(context, objArr);
            Intrinsics.checkNotNull(objInvoke, Wg.Zd("}U9-MpNKH-\u000f\u001cNRl\u0011ypmy.\u00174vd7a\u0013\u000bq>f8\u001e\u0005Js6\u001f\nsNH$J\u0007UUTZ~a^T/ \u0005ne9\"\u001f\u00105(+'\r\bk>80\u0013l\\\\!\u0015\u0003eYC5", (short) (OY.Xd() ^ 21457), (short) (OY.Xd() ^ 3765)));
            this.accessibilityManager = (android.view.accessibility.AccessibilityManager) objInvoke;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.compose.ui.platform.AccessibilityManager
    public long calculateRecommendedTimeoutMillis(long j2, boolean z2, boolean z3, boolean z4) throws Throwable {
        int i2 = z2;
        if (j2 >= 2147483647L) {
            return j2;
        }
        if (z3) {
            i2 = (-1) - (((-1) - z2) & ((-1) - 2));
        }
        if (z4) {
            i2 = (i2 == true ? 1 : 0) | 4;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int recommendedTimeoutMillis = Api29Impl.INSTANCE.getRecommendedTimeoutMillis(this.accessibilityManager, (int) j2, i2);
            if (recommendedTimeoutMillis != Integer.MAX_VALUE) {
                return recommendedTimeoutMillis;
            }
        } else if (z4) {
            android.view.accessibility.AccessibilityManager accessibilityManager = this.accessibilityManager;
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.Xd("-;2A?:6\u0001J>;N\u0006:=>APQHBJNLX^\u0014(KLO^_VPX\\ZflAVdX_^l", (short) (C1499aX.Xd() ^ (-28457)))).getMethod(Wg.vd("KT4N[HL(bYTV`N`Ta_5]WW`X^", (short) (ZN.Xd() ^ 3660)), new Class[0]);
            try {
                method.setAccessible(true);
                if (!((Boolean) method.invoke(accessibilityManager, objArr)).booleanValue()) {
                    return j2;
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } else {
            return j2;
        }
        return Long.MAX_VALUE;
    }
}
