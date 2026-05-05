package com.facebook.react.devsupport;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.EditText;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.InterfaceC1492Gx;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.hg;

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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00146B\u0005\"4\u0012\u0006\rnʑA0ZeP.XS@ş\n\u0004d$\n#*BC\u0016\u001dԥ&\t]N0}|Mr\u000bq\u00116\u001a\u0007nDI\u0004}\u000e\u0018\u001d8ZqU2{v\u000eEnuN\u0005N4x\u0603\u0006ڱ\u0005\u001a2ϺǞz\u0004"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~8\b04t\u0016\u001dIN(k;(\u0011gN9\u0005m.Wz<GY$", "", "u(E", "2nA2Y9>a\u001c", "", "2hS\u0011b<;Z\u0019mvi\u0019", "9dh\u0010b+>", "", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "\u0011n\\=T5B]\"", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class DoubleTapReloadRecognizer {
    private static final Companion Companion = new Companion(null);
    private static final long DOUBLE_TAP_DELAY = 200;
    private boolean doRefresh;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00126Ȑ\u0005ӯ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٨lԥ&\tWȞ˝kq"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~8\b04t\u0016\u001dIN(k;(\u0011gN9\u0005m.Wz<GY\r\nfZ}9\u001d\u0016d\u0017$", "", "u(E", "\u0012ND\u000f?\f8Btit=\fcd#", "", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void didDoubleTapR$lambda$0(DoubleTapReloadRecognizer this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.doRefresh = false;
    }

    public final boolean didDoubleTapR(int i2, View view) throws Throwable {
        if (i2 == 46 && !(view instanceof EditText)) {
            if (this.doRefresh) {
                this.doRefresh = false;
                return true;
            }
            this.doRefresh = true;
            Class<?> cls = Class.forName(Wg.vd("\u0002\u000e\u0003\u0010\f\u0005~G\b\u000bDa\u0004\u0003\u0003v\u0003", (short) (C1580rY.Xd() ^ (-31519))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (C1607wl.Xd() ^ 2109);
            short sXd2 = (short) (C1607wl.Xd() ^ 12385);
            int[] iArr = new int["KHV.AHL)KJJ>J".length()];
            QB qb = new QB("KHV.AHL)KJJ>J");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(((sXd + i3) + xuXd.CK(iKK)) - sXd2);
                i3++;
            }
            Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i3), clsArr);
            try {
                declaredMethod.setAccessible(true);
                Handler handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
                Runnable runnable = new Runnable() { // from class: com.facebook.react.devsupport.DoubleTapReloadRecognizer$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        DoubleTapReloadRecognizer.didDoubleTapR$lambda$0(this.f$0);
                    }
                };
                Class<?> cls2 = Class.forName(hg.Vd("q}r\u007f{tn7wz4Meqfmeq", (short) (C1580rY.Xd() ^ (-10871)), (short) (C1580rY.Xd() ^ (-21091))));
                Class<?>[] clsArr2 = {Class.forName(C1561oA.ud("I?S=\tF:F>\u0004'IA@22;3", (short) (C1499aX.Xd() ^ (-22445)))), Long.TYPE};
                Object[] objArr2 = {runnable, Long.valueOf(DOUBLE_TAP_DELAY)};
                Method method = cls2.getMethod(C1561oA.yd("\u0018\u0018\u001d\u001fg\n\u0012\b\u0019\u0006\u0006", (short) (C1607wl.Xd() ^ 3766)), clsArr2);
                try {
                    method.setAccessible(true);
                    method.invoke(handler, objArr2);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        return false;
    }
}
