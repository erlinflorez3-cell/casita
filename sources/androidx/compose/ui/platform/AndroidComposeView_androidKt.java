package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat;
import androidx.compose.ui.platform.coreshims.ViewCompatShims;
import androidx.compose.ui.text.input.PlatformTextInputService;
import kotlin.Metadata;
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
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯD\u001d̉=!,p\bӵLc\u000b\u0004I\u0006F\u000b6B\u0005%4\u0012\u0006\fnʑA0ZeP\u008cZS8\u0015s{:'c$\u007fLCU0}*\tUNog\u0005JbŏK\u000f\u0014\u0016\u0001j2Pm)k\u0019'2pwo7[xU9\u000f~f\t.=:8(\u00111\u001e8U(v)M{\u0010 >Xph^SMơ\u0019ŇĂB\"\u0007-jwfHV}u:]5+ipaWc>\u0011e\rtgm\r\u000fm,@X9K\u0014Si+\u0007\u0001n\u0006\u0003W\u000eK\u001c\u0001'UCqs\u0006@\t\u0004\")CO;g9&ڑ\u0004ĩԃ\u0010)1hqeh:6\u0013\u0013{;T,\u000e41x2;6~\b<;%va]h\u0002\rJ0~oT/%.=q9Վeϟň?\u001bTV\n%-*1Ч\u0007!\nSd֮gôXwYĸqdKHf\u0016i?}\u0004\u001fd\u0012,\u00140u\u0002]|gх#É;gA\u05fa9m\bKRk\u0017\u0007fmaoɰHE*q\u001c֕F7\u000bʗH\u0006"}, d2 = {"\u001dM4,9\u0019\u001a;xxF+vvk\u000fRn\u001du$i\u0011~+Vt d\u0005\u0013Cf~%", "", ">kPAY6K[\b~\u000em\u0010\u0006\u0014?tm(\tQ\u0005\u0015\u0017+x\u001d<\u0004#5d\r*D", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#h'3|\u00178ZK*kG-xqlI\u0016Q,[\b+EL$", "5dc\u001d_(MT#\f\u0003M,\u0010\u0018\u0013n\u000b8\u000b.\u0001$(Km\u000e \u007f45f{ B| ;", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "Adc\u001d_(MT#\f\u0003M,\u0010\u0018\u0013n\u000b8\u000b.\u0001$(Km\u000e \u007f45f{ B| ;", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc(", "2nc", "", ";0", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001dU\r-;\u0001k", "@nf", "", ";1", "1n[B`5", "2ncyc~\u0012ci\n\u0001", "uZ5\u0016N\r\"\u0017y", "1n]AT0Gaw~\t\\,\u0006\b+n\u000f", "", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "=sW2e", "5dc\u0010b5MS\"\u000eXZ7\f\u0019<em(\nN\u0005! %y\u0016Gr4", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n3c\u000b Ep\u001a6[\r\u0019u=-\u0015qp\u0017\u0003n;^\u0004'5L\\:`\\{\u001b\u001e\u001ae\n]\u0001", ">qT!e(Ga\u001a\t\bf", "", ">qT!e(Ga\u001a\t\bfsa\r\u001dx\u007ft[", "uZ5(9o/", ">qT!e(Ga z\n^", "F", "G", "Bl_\u001aT;KW,", ">qT!e(Ga z\n^szj{X\u00150y", "uZ5\u00139\"\u001f\u0017\n", "ChN?X3>O'~"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AndroidComposeView_androidKt {
    private static final long ONE_FRAME_120_HERTZ_IN_MILLISECONDS = 8;
    private static Function1<? super PlatformTextInputService, ? extends PlatformTextInputService> platformTextInputServiceInterceptor = new Function1<PlatformTextInputService, PlatformTextInputService>() { // from class: androidx.compose.ui.platform.AndroidComposeView_androidKt$platformTextInputServiceInterceptor$1
        @Override // kotlin.jvm.functions.Function1
        public final PlatformTextInputService invoke(PlatformTextInputService platformTextInputService) {
            return platformTextInputService;
        }
    };

    public static final Function1<PlatformTextInputService, PlatformTextInputService> getPlatformTextInputServiceInterceptor() {
        return platformTextInputServiceInterceptor;
    }

    public static final void setPlatformTextInputServiceInterceptor(Function1<? super PlatformTextInputService, ? extends PlatformTextInputService> function1) {
        platformTextInputServiceInterceptor = function1;
    }

    /* JADX INFO: renamed from: preTransform-JiSxe2E */
    public static final void m5851preTransformJiSxe2E(float[] fArr, float[] fArr2) {
        float fM5850dotp89u6pk = m5850dotp89u6pk(fArr2, 0, fArr, 0);
        float fM5850dotp89u6pk2 = m5850dotp89u6pk(fArr2, 0, fArr, 1);
        float fM5850dotp89u6pk3 = m5850dotp89u6pk(fArr2, 0, fArr, 2);
        float fM5850dotp89u6pk4 = m5850dotp89u6pk(fArr2, 0, fArr, 3);
        float fM5850dotp89u6pk5 = m5850dotp89u6pk(fArr2, 1, fArr, 0);
        float fM5850dotp89u6pk6 = m5850dotp89u6pk(fArr2, 1, fArr, 1);
        float fM5850dotp89u6pk7 = m5850dotp89u6pk(fArr2, 1, fArr, 2);
        float fM5850dotp89u6pk8 = m5850dotp89u6pk(fArr2, 1, fArr, 3);
        float fM5850dotp89u6pk9 = m5850dotp89u6pk(fArr2, 2, fArr, 0);
        float fM5850dotp89u6pk10 = m5850dotp89u6pk(fArr2, 2, fArr, 1);
        float fM5850dotp89u6pk11 = m5850dotp89u6pk(fArr2, 2, fArr, 2);
        float fM5850dotp89u6pk12 = m5850dotp89u6pk(fArr2, 2, fArr, 3);
        float fM5850dotp89u6pk13 = m5850dotp89u6pk(fArr2, 3, fArr, 0);
        float fM5850dotp89u6pk14 = m5850dotp89u6pk(fArr2, 3, fArr, 1);
        float fM5850dotp89u6pk15 = m5850dotp89u6pk(fArr2, 3, fArr, 2);
        float fM5850dotp89u6pk16 = m5850dotp89u6pk(fArr2, 3, fArr, 3);
        fArr[0] = fM5850dotp89u6pk;
        fArr[1] = fM5850dotp89u6pk2;
        fArr[2] = fM5850dotp89u6pk3;
        fArr[3] = fM5850dotp89u6pk4;
        fArr[4] = fM5850dotp89u6pk5;
        fArr[5] = fM5850dotp89u6pk6;
        fArr[6] = fM5850dotp89u6pk7;
        fArr[7] = fM5850dotp89u6pk8;
        fArr[8] = fM5850dotp89u6pk9;
        fArr[9] = fM5850dotp89u6pk10;
        fArr[10] = fM5850dotp89u6pk11;
        fArr[11] = fM5850dotp89u6pk12;
        fArr[12] = fM5850dotp89u6pk13;
        fArr[13] = fM5850dotp89u6pk14;
        fArr[14] = fM5850dotp89u6pk15;
        fArr[15] = fM5850dotp89u6pk16;
    }

    /* JADX INFO: renamed from: preTranslate-cG2Xzmc */
    public static final void m5852preTranslatecG2Xzmc(float[] fArr, float f2, float f3, float[] fArr2) {
        Matrix.m4418resetimpl(fArr2);
        Matrix.m4429translateimpl$default(fArr2, f2, f3, 0.0f, 4, null);
        m5851preTransformJiSxe2E(fArr, fArr2);
    }

    public static final boolean containsDescendant(View view, View view2) {
        if (Intrinsics.areEqual(view2, view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    public static final ContentCaptureSessionCompat getContentCaptureSessionCompat(View view) {
        ViewCompatShims.setImportantForContentCapture(view, 1);
        return ViewCompatShims.getContentCaptureSession(view);
    }

    /* JADX INFO: renamed from: dot-p89u6pk */
    private static final float m5850dotp89u6pk(float[] fArr, int i2, float[] fArr2, int i3) {
        int i4 = i2 * 4;
        return (fArr[i4] * fArr2[i3]) + (fArr[i4 + 1] * fArr2[4 + i3]) + (fArr[i4 + 2] * fArr2[8 + i3]) + (fArr[i4 + 3] * fArr2[12 + i3]);
    }
}
