package androidx.compose.ui.focus;

import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: FocusInteropUtils.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d̉=!4i\bӵLc\u0003\nIي8\u000bDB\u0007\"2\u0012\u007f\u0007|jA0ZeP\u008cZS8\u0018s{:$c$\bCCU \u0001:\u0019]Ȟ\u007fi\u0005I\t\ns\u0013\u0014\u0016\u0011jZJ\u001cތu\"\u001d4ZqU2{rm=nxN\u0005N3h\u0600\u0012\u000f\u000f\u001fBH>|#Cy\u0013XؓX\u0014HZ%M3#:\u0006l'1$jqf8^k\f;_)\u0011tZP=^^\t\u0014εТX'\u001b\u0004y49NO7+$\u0002\u0004/R\n>Iӊҵ<ݛص+)1X\u0002g̯X\u0005\u001c\u00181̟)\fq͏`\u0016"}, d2 = {"Bn5<V<L2\u001d\fz\\;\u0001\u00138", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Eg\\$Dm\u0014=QMDA", "/mS?b0=2\u001d\fz\\;\u0001\u00138", "", "Bn;.l6Nbw\u0003\b^*\f\r9n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "/mS?b0=:\u0015\u0013\u0005n;[\r<e}7\u007fJ\n", "1`[0h3:b\u0019[\u0005n5{\r8gl(yO", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "@d`BX:M7\"\u000ezk6\bi9c\u00106", "", "2ha2V;B]\"", "@dRA", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{>\u0010l", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q'\u0006\u0013(C9\u00158\u007f'~=\u0007/7o\u0016;#*7t3+\u001fl`\u0003\tp(Yy+EZ\u0018\u0019\\P\u0002\u0013W\u0007", "Bn0;W9HW\u0018_\u0005\\<\u000bg3r\u007f&\u000bD\u000b ", "Bn0;W9HW\u0018_\u0005\\<\u000bg3r\u007f&\u000bD\u000b ^\u0015O{\u001d|\u000f\b", "uH\u0018\u0019](OOb\u0006vg.Fl8t\u007f*{MV", "ChN?X3>O'~"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class FocusInteropUtils_androidKt {
    public static final FocusDirection toFocusDirection(int i2) {
        if (i2 == 1) {
            return FocusDirection.m3846boximpl(FocusDirection.Companion.m3860getPreviousdhqQ8s());
        }
        if (i2 == 2) {
            return FocusDirection.m3846boximpl(FocusDirection.Companion.m3859getNextdhqQ8s());
        }
        if (i2 == 17) {
            return FocusDirection.m3846boximpl(FocusDirection.Companion.m3858getLeftdhqQ8s());
        }
        if (i2 == 33) {
            return FocusDirection.m3846boximpl(FocusDirection.Companion.m3862getUpdhqQ8s());
        }
        if (i2 == 66) {
            return FocusDirection.m3846boximpl(FocusDirection.Companion.m3861getRightdhqQ8s());
        }
        if (i2 != 130) {
            return null;
        }
        return FocusDirection.m3846boximpl(FocusDirection.Companion.m3855getDowndhqQ8s());
    }

    /* JADX INFO: renamed from: toAndroidFocusDirection-3ESFkO8 */
    public static final Integer m3863toAndroidFocusDirection3ESFkO8(int i2) {
        if (FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3862getUpdhqQ8s())) {
            return 33;
        }
        if (FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3855getDowndhqQ8s())) {
            return 130;
        }
        if (FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3858getLeftdhqQ8s())) {
            return 17;
        }
        if (FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3861getRightdhqQ8s())) {
            return 66;
        }
        if (FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3859getNextdhqQ8s())) {
            return 2;
        }
        return FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3860getPreviousdhqQ8s()) ? 1 : null;
    }

    public static final LayoutDirection toLayoutDirection(int i2) {
        if (i2 == 0) {
            return LayoutDirection.Ltr;
        }
        if (i2 != 1) {
            return null;
        }
        return LayoutDirection.Rtl;
    }

    public static final Rect calculateBoundingRect(View view) {
        int[] tempCoordinates = FocusInteropUtils.Companion.getTempCoordinates();
        view.getLocationInWindow(tempCoordinates);
        int i2 = tempCoordinates[0];
        return new Rect(i2, tempCoordinates[1], i2 + view.getWidth(), tempCoordinates[1] + view.getHeight());
    }

    public static final boolean requestInteropFocus(View view, Integer num, android.graphics.Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if ((!viewGroup.isFocusable() || view.hasFocus()) && !(view instanceof AndroidComposeView)) {
            if (rect != null) {
                View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
                return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : view.requestFocus(num.intValue(), rect);
            }
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, view.hasFocus() ? view.findFocus() : null, num.intValue());
            return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
        }
        return view.requestFocus(num.intValue(), rect);
    }
}
