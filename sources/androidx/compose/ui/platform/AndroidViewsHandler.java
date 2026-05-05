package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.Global;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: AndroidViewsHandler.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яf\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007|jA0ZeP.hS2\u000fq~<$i$yّCU0}*ޛWNupvϺb\u000bY\u000f\u000e\u0016~k4Icwe܈\u00172P\u0003G\u074cUoS9ht<\u0005(288\u0002\u0005\u0007\u001c2H\u001e|\u0003CQ\u0013\u0018ؓV\u0081jR;LE%\"\nL \u0019\u001e\u000bhߑ:Hz_\u0003=1\u000f\u0002B|4\u00104\u000b[%F\u00036S\t*.9PO5C6\u0004\t\u0015dsA\u0019> PK|o;9]\fWde0\u0018#@g\r\fwV`\u0013_x\fU:\u0018\u007fYf&*\u000ey*$l\n\u001c\u001e?JD,H\u007f8\u0014A\u000f\u000bUVO0y\t\u0014CwD3=\u007fa8i\u001ftny;Glg\u007f\u0013,6#/\rgp\u001d<n53T&^aUN^`N8jmq\u0012\u0013z\u0002X'`K\u000eS\u0014\u0011\\:U;i^;!\u001a%xHu\u001d\u001d`\u0017v0d\u0011V0\u0016.7X\u0016<^R\r\u001dk~w\t0\u001fv4T5!N%hb\u0006f9%>[\u0016}2p[\t\"%]w}m?\u0017\u001cZQzC7ac>fbx$?jh3\\ONc\u000ej\\V'BJz\u0010&\u0002#Uܟ\u00178Gڤ4629'ees\u0011(Z]\r\u000boZ\u0017\u0016\u000fVC$1nRxq\r`^\u0001o\u0016~Y.\r`P2 Xڤ\u001d,]Ȩ\u00016\u0003.\u0015\b·\u0004s"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011b|-Aq\u0015\u001fQCMy\u0017\u001a\u001egh9\u00149", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"l", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", "6n[1X9-]\u007fz\u000fh<\fq9d\u007f", "\u001aiPCTuNb\u001d\u0006DA(\u000b\f\u0017a\u000b}", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0012\u001b\u0017Ys\u0017Kv2?dG{@l#8QB,o40wrh8\u0007p\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6mk", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E#|%\u001a/k\u0019\u0012", "5dc\u0015b3=S&m\u0005E(\u0011\u0013?th2z@", "u(;7T=:\u001d)\u000e~eu_\u0005=hg$\u0007\u0016", ":`h<h;']\u0018~ih\u000f\u0007\u0010.e\r", "5dc\u0019T@Hc(g\u0005],k\u0013\u0012o\u0007'{M", "2hb=T;<Vw\fvp", "", "1`]CT:", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0006wI\u0012\u0013%\u001d", "2hb=T;<V\b\t\u000b\\/\\\u001a/n\u000f", "", "3u", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "2qPDI0>e", "DhTD", "7me._0=O(~Xa0\u0004\b\u0013nj$\t@\n&", "", ":nR.g0H\\", "", "2haAl", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{>\u0010l", "=m32f*>\\\u0018z\u0004m\u0010\u0006\u001a+l\u0004'wO\u0001\u0016", "1gX9W", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "B`a4X;", "=m;.l6Nb", "1gP;Z,=", Global.COLON, "", "B", "@", AdkSettings.PLATFORM_TYPE_MOBILE, "=m<2T:N`\u0019", "EhSA[\u0014>O'\u000f\b^\u001a\b\t-", "6dX4[;&S\u0015\r\u000bk,j\u0014/c", "@d`BX:M:\u0015\u0013\u0005n;", "Ag^B_+\u001dS z\u000f</\u0001\u0010.P\r(\nN\u0001\u0016\u0005Vk\u001d<", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AndroidViewsHandler extends ViewGroup {
    public static final int $stable = 8;
    private final HashMap<AndroidViewHolder, LayoutNode> holderToLayoutNode;
    private final HashMap<LayoutNode, AndroidViewHolder> layoutNodeToHolder;

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public Void invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public AndroidViewsHandler(Context context) {
        super(context);
        setClipChildren(false);
        this.holderToLayoutNode = new HashMap<>();
        this.layoutNodeToHolder = new HashMap<>();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return (ViewParent) invalidateChildInParent(iArr, rect);
    }

    public final HashMap<AndroidViewHolder, LayoutNode> getHolderToLayoutNode() {
        return this.holderToLayoutNode;
    }

    public final HashMap<LayoutNode, AndroidViewHolder> getLayoutNodeToHolder() {
        return this.layoutNodeToHolder;
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        if (!(View.MeasureSpec.getMode(i2) == 1073741824)) {
            InlineClassHelperKt.throwIllegalArgumentException("widthMeasureSpec should be EXACTLY");
        }
        if (!(View.MeasureSpec.getMode(i3) == 1073741824)) {
            InlineClassHelperKt.throwIllegalArgumentException("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i2), View.MeasureSpec.getSize(i3));
        Iterator<T> it = this.holderToLayoutNode.keySet().iterator();
        while (it.hasNext()) {
            ((AndroidViewHolder) it.next()).remeasure();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        for (AndroidViewHolder androidViewHolder : this.holderToLayoutNode.keySet()) {
            androidViewHolder.layout(androidViewHolder.getLeft(), androidViewHolder.getTop(), androidViewHolder.getRight(), androidViewHolder.getBottom());
        }
    }

    public final void drawView(AndroidViewHolder androidViewHolder, Canvas canvas) {
        androidViewHolder.draw(canvas);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            LayoutNode layoutNode = this.holderToLayoutNode.get(childAt);
            if (childAt.isLayoutRequested() && layoutNode != null) {
                LayoutNode.requestRemeasure$ui_release$default(layoutNode, false, false, false, 7, null);
            }
        }
    }
}
