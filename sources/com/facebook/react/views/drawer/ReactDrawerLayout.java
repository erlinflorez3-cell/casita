package com.facebook.react.views.drawer;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import com.facebook.common.logging.FLog;
import com.facebook.react.R;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.ReactAccessibilityDelegate;
import com.facebook.react.uimanager.events.NativeGestureUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipMessage(CodedInputStream.java:299)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:251)
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
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":\u001b\u007fјnjG6LeN.ZS8\u000fs{:%c$\bCCU \t8ޛmg\u0018g\u001dI\u0013\n\\O\u0011&|x,aU'^ܫ\u00132Pq\b>[wU9\u000f}|\u0004ڶ6\">\u0004M\u000f(5`\u0010%~sO\u001a\u001eH@\u001fG\u0019!\u0016\u0013( \u001e>N\u0005N`uZNH\u001bj\u0001Ck\u000ewQf'\u000e9CLϘJT-\u001d?t,<X7c\u001eUW\u0011\u0019j[m\t\u0006мݘ\th-:sT\u0002kNX.\u001d[ۀ̠\u0011]x;%\u0018_v$'YX\u0014O^%@w)\u0002SɝǬ\u0012\u0006-`~9(i \u000eaxIԢLг\u0006^JȕKmD\u001c=\u007fa1\u0010ӘrЂe;!\u05cb\b\b\u0013\u00146#/twſ`\u05f8d\u0015#ƘɖUK"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\rIr75fG\r7i\u0014=,P7}4+{duC\u0017r\u0002", "\u001a`]1e6BR,Hyk(\u000f\t<l{<\u0006P\u0010`)Kn\u0010<\u0006n\u0014fy27z|*aMKz\n", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3h[*@|\u0016A\\\u0019", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1W\r}Av%.`R\u0011/%", "2qP4Z0GU", "", "2qPDX9)]'\u0003\nb6\u0006", "", "2qPDX90W\u0018\u000e}", "1k^@X\u000bKO+~\b", "", "1k^@X\u000bKO+~\b\u001d\u0019|\u0005-t[1zM\u000b\u001b\u0016A|\u000eCv!CY", "=m8;g,KQ\u0019\n\nM6\r\u00072E\u0011(\u0005O", "3u", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "=mC<h*A3*~\u0004m", "=oT;79:e\u0019\f", "=oT;79:e\u0019\f9K,x\u0007>A\t'\tJ\u0005\u0016\u0011To\u0015<r35", "Adc\u0011e(PS&i\u0005l0\f\r9n", "<df\u0011e(PS&i\u0005l0\f\r9n", "Adc\u0011e(PS&i\u0005l0\f\r9n>\u0015{<~&rPn\u001bFz$/f}'7i$.", "Adc\u0011e(PS&i\bh7|\u0016>i\u007f6", "Adc\u0011e(PS&i\bh7|\u0016>i\u007f6:-\u0001\u0013\u0015VK\u0017;\u0004/9Xw-7t\u0016*[C", "Adc\u0011e(PS&p~];\u007f", "2qPDX90W\u0018\u000e}B5g\u001c", "Adc\u0011e(PS&p~];\u007fG\u001ce{&\u000b\u001c\n\u0016$Qs\r6\u0004%<Yy.7", "\u0011n\\=T5B]\"", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ReactDrawerLayout extends DrawerLayout {
    public static final Companion Companion = new Companion(null);
    public static final int DEFAULT_DRAWER_WIDTH = -1;
    private boolean dragging;
    private int drawerPosition;
    private int drawerWidth;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116Ȑ\u0005ӭ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٦lԥ&\tWȞ˝kq"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\rIr75fG\r7i\u0014=,P7}4+{duC\u0017rj,\u0001/RHW0f[H", "", "u(E", "\u0012D5\u000eH\u0013-MwkVP\fi\u0003!I^\u0017^", "", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactDrawerLayout(ReactContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.drawerPosition = GravityCompat.START;
        this.drawerWidth = -1;
        ViewCompat.setAccessibilityDelegate(this, new AccessibilityDelegateCompat() { // from class: com.facebook.react.views.drawer.ReactDrawerLayout.1
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityEvent(View host, AccessibilityEvent event) {
                Intrinsics.checkNotNullParameter(host, "host");
                Intrinsics.checkNotNullParameter(event, "event");
                super.onInitializeAccessibilityEvent(host, event);
                Object tag = host.getTag(R.id.accessibility_role);
                if (tag instanceof ReactAccessibilityDelegate.AccessibilityRole) {
                    event.setClassName(ReactAccessibilityDelegate.AccessibilityRole.getValue((ReactAccessibilityDelegate.AccessibilityRole) tag));
                }
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfoCompat info) {
                Intrinsics.checkNotNullParameter(host, "host");
                Intrinsics.checkNotNullParameter(info, "info");
                super.onInitializeAccessibilityNodeInfo(host, info);
                ReactAccessibilityDelegate.AccessibilityRole accessibilityRoleFromViewTag = ReactAccessibilityDelegate.AccessibilityRole.fromViewTag(host);
                if (accessibilityRoleFromViewTag != null) {
                    info.setClassName(ReactAccessibilityDelegate.AccessibilityRole.getValue(accessibilityRoleFromViewTag));
                }
            }
        });
    }

    public final void closeDrawer$ReactAndroid_release() {
        closeDrawer(this.drawerPosition);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        try {
            if (!super.onInterceptTouchEvent(ev)) {
                return false;
            }
            NativeGestureUtil.notifyNativeGestureStarted(this, ev);
            this.dragging = true;
            return true;
        } catch (IllegalArgumentException e2) {
            FLog.w(ReactConstants.TAG, "Error intercepting touch event.", e2);
            return false;
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout, android.view.View
    public boolean onTouchEvent(MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        if (ev.getActionMasked() == 1 && this.dragging) {
            NativeGestureUtil.notifyNativeGestureEnded(this, ev);
            this.dragging = false;
        }
        return super.onTouchEvent(ev);
    }

    public final void openDrawer$ReactAndroid_release() {
        openDrawer(this.drawerPosition);
    }

    public final void setDrawerPosition$ReactAndroid_release(int i2) {
        this.drawerPosition = i2;
        setDrawerProperties$ReactAndroid_release();
    }

    public final void setDrawerProperties$ReactAndroid_release() {
        if (getChildCount() == 2) {
            View childAt = getChildAt(1);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.drawerlayout.widget.DrawerLayout.LayoutParams");
            DrawerLayout.LayoutParams layoutParams2 = (DrawerLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = this.drawerPosition;
            layoutParams2.width = this.drawerWidth;
            childAt.setLayoutParams(layoutParams2);
            childAt.setClickable(true);
        }
    }

    public final void setDrawerWidth$ReactAndroid_release(int i2) {
        this.drawerWidth = i2;
        setDrawerProperties$ReactAndroid_release();
    }
}
