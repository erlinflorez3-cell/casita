package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.graphics.Matrix;
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
/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":%\u007f\u0007ljA0ReP\u008cZS@\u000fs{:)c$\bCCU \u007f*\t]SogtL`\u000bYƤ6\u0016'ilTe|k\u0012'2ppУ7M}?\u0002\u0001\u0003<\u001d `)h}\u0013\t2*v\u0019'~QU$\u0012^A7Nƞ\f˟ŋ\u001e\u0014\fI.\rf|u[NH\u001bdj31\u000b\u0002B|0\u00104\u000bW%F\u0003(SvӦ\u001dѨË;7\u001b3a\u000fOniN\u001b? D-hU([M\u0002gNX.%[+Ͷ\fƞę*^\u000bcn\u001foO]wcP</ z*\u000el\b\u001c\u001b?H\\CJj\u0016%Kt!i\u0007Pڕ]ۍȸ~c</3\u0019\u00047G\u001e~Q\u0010?o\u05ce9߉\t\r&ŀQ\u0003/[l\u000e\u000f\u0016qƛyϼ0҅ή<Gݳ\u000e[Em\u0012uê\u00023\f3MīK*\u00106\u0017+V٬=="}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0013U\u0005\u001eGt\u0012=M+7zA\"(Wk+\u000bl+X\t\u0003RP\u001bw2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0013U\u0005\u001eGt\u0012=M+7zA\"(Wk+\u000bl+X\t|", "Bl_\u001aT;KW,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001dU\r-;\u0001k", "uZ5\u0019^6MZ\u001d\bDc=\u0005R3n\u000f(\tI|\u001e`&o\u000f8\u0007,D7\b)E|#>KREx\u001c\u001a\"naF\\'\u001d", "Bl_\u0019b*:b\u001d\t\u0004", "", ")E", "1`[0h3:b\u0019fvm9\u0001\u001c\u001eoq,\u0005?\u000b)", "", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", ";`c?\\?", "1`[0h3:b\u0019fvm9\u0001\u001c\u001eoq,\u0005?\u000b)^'V`\u0019e)\b", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q6aZ\b", "BqP;f-H`!fvm9\u0001\u001c\u001eoq,\u0005?\u000b)", "BqP;f-H`!fvm9\u0001\u001c\u001eoq,\u0005?\u000b)^'V`\u0019e)\b", ">qT\u0010b5<O(", "=sW2e", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0010wO\u000e\u001b*\u001d", ">qT\u0010b5<O(F\nNsp\u000e\u0012k", "uZ5\u0019T5=`#\u0003y(.\n\u0005:h\u0004&\n\nh\u0013&Ts!\u0012:\u0016", ">qT!e(Ga z\n^", "F", "", "G", ">qT!e(Ga z\n^sJ{\u000e1]\u0011c", "uZ5\u00139o/", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class CalculateMatrixToWindowApi21 implements CalculateMatrixToWindow {
    private final int[] tmpLocation;
    private final float[] tmpMatrix;

    public /* synthetic */ CalculateMatrixToWindowApi21(float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(fArr);
    }

    private CalculateMatrixToWindowApi21(float[] fArr) {
        this.tmpMatrix = fArr;
        this.tmpLocation = new int[2];
    }

    @Override // androidx.compose.ui.platform.CalculateMatrixToWindow
    /* JADX INFO: renamed from: calculateMatrixToWindow-EL8BTi8 */
    public void mo5853calculateMatrixToWindowEL8BTi8(View view, float[] fArr) {
        Matrix.m4418resetimpl(fArr);
        m5856transformMatrixToWindowEL8BTi8(view, fArr);
    }

    /* JADX INFO: renamed from: transformMatrixToWindow-EL8BTi8, reason: not valid java name */
    private final void m5856transformMatrixToWindowEL8BTi8(View view, float[] fArr) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            m5856transformMatrixToWindowEL8BTi8((View) parent, fArr);
            m5855preTranslate3XD1CNM(fArr, -view.getScrollX(), -view.getScrollY());
            m5855preTranslate3XD1CNM(fArr, view.getLeft(), view.getTop());
        } else {
            view.getLocationInWindow(this.tmpLocation);
            m5855preTranslate3XD1CNM(fArr, -view.getScrollX(), -view.getScrollY());
            m5855preTranslate3XD1CNM(fArr, r2[0], r2[1]);
        }
        android.graphics.Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        m5854preConcattUYjHk(fArr, matrix);
    }

    /* JADX INFO: renamed from: preConcat-tU-YjHk, reason: not valid java name */
    private final void m5854preConcattUYjHk(float[] fArr, android.graphics.Matrix matrix) {
        AndroidMatrixConversions_androidKt.m4049setFromtUYjHk(this.tmpMatrix, matrix);
        AndroidComposeView_androidKt.m5851preTransformJiSxe2E(fArr, this.tmpMatrix);
    }

    /* JADX INFO: renamed from: preTranslate-3XD1CNM, reason: not valid java name */
    private final void m5855preTranslate3XD1CNM(float[] fArr, float f2, float f3) {
        AndroidComposeView_androidKt.m5852preTranslatecG2Xzmc(fArr, f2, f3, this.tmpMatrix);
    }
}
