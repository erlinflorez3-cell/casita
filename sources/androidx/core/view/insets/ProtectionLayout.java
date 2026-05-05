package androidx.core.view.insets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ProtectionLayout extends FrameLayout {
    private static final Object PROTECTION_VIEW = new Object();
    private ProtectionGroup mGroup;
    private final List<Protection> mProtections;

    public ProtectionLayout(Context context) {
        super(context);
        this.mProtections = new ArrayList();
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.mProtections = new ArrayList();
    }

    public ProtectionLayout(Context context, List<Protection> list) {
        super(context);
        this.mProtections = new ArrayList();
        setProtections(list);
    }

    public void setProtections(List<Protection> list) {
        this.mProtections.clear();
        this.mProtections.addAll(list);
        if (isAttachedToWindow()) {
            removeProtectionViews();
            addProtectionViews();
            requestApplyInsets();
        }
    }

    private SystemBarStateMonitor getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof SystemBarStateMonitor) {
            return (SystemBarStateMonitor) tag;
        }
        SystemBarStateMonitor systemBarStateMonitor = new SystemBarStateMonitor(viewGroup);
        viewGroup.setTag(R.id.tag_system_bar_state_monitor, systemBarStateMonitor);
        return systemBarStateMonitor;
    }

    private void maybeUninstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof SystemBarStateMonitor) {
            SystemBarStateMonitor systemBarStateMonitor = (SystemBarStateMonitor) tag;
            if (systemBarStateMonitor.hasCallback()) {
                return;
            }
            systemBarStateMonitor.detachFromWindow();
            viewGroup.setTag(R.id.tag_system_bar_state_monitor, null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mGroup != null) {
            removeProtectionViews();
        }
        addProtectionViews();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeProtectionViews();
        maybeUninstallSystemBarStateMonitor();
    }

    private void addProtectionViews() {
        if (this.mProtections.isEmpty()) {
            return;
        }
        this.mGroup = new ProtectionGroup(getOrInstallSystemBarStateMonitor(), this.mProtections);
        int childCount = getChildCount();
        int size = this.mGroup.size();
        for (int i2 = 0; i2 < size; i2++) {
            addProtectionView(getContext(), i2 + childCount, this.mGroup.getProtection(i2));
        }
    }

    private void removeProtectionViews() {
        if (this.mGroup != null) {
            removeViews(getChildCount() - this.mGroup.size(), this.mGroup.size());
            int size = this.mGroup.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.mGroup.getProtection(i2).getAttributes().setCallback(null);
            }
            this.mGroup.dispose();
            this.mGroup = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void addProtectionView(android.content.Context r8, int r9, androidx.core.view.insets.Protection r10) {
        /*
            r7 = this;
            androidx.core.view.insets.Protection$Attributes r3 = r10.getAttributes()
            int r1 = r10.getSide()
            r0 = 1
            r4 = 4
            r6 = -1
            if (r1 == r0) goto L78
            r0 = 2
            if (r1 == r0) goto L71
            if (r1 == r4) goto L7e
            r0 = 8
            if (r1 != r0) goto L86
            int r0 = r3.getHeight()
            r5 = 80
        L1c:
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r6, r0, r5)
            androidx.core.graphics.Insets r1 = r3.getMargin()
            int r0 = r1.left
            r2.leftMargin = r0
            int r0 = r1.top
            r2.topMargin = r0
            int r0 = r1.right
            r2.rightMargin = r0
            int r0 = r1.bottom
            r2.bottomMargin = r0
            android.view.View r1 = new android.view.View
            r1.<init>(r8)
            java.lang.Object r0 = androidx.core.view.insets.ProtectionLayout.PROTECTION_VIEW
            r1.setTag(r0)
            float r0 = r3.getTranslationX()
            r1.setTranslationX(r0)
            float r0 = r3.getTranslationY()
            r1.setTranslationY(r0)
            float r0 = r3.getAlpha()
            r1.setAlpha(r0)
            boolean r0 = r3.isVisible()
            if (r0 == 0) goto L5b
            r4 = 0
        L5b:
            r1.setVisibility(r4)
            android.graphics.drawable.Drawable r0 = r3.getDrawable()
            r1.setBackground(r0)
            androidx.core.view.insets.ProtectionLayout$1 r0 = new androidx.core.view.insets.ProtectionLayout$1
            r0.<init>()
            r3.setCallback(r0)
            r7.addView(r1, r9, r2)
            return
        L71:
            int r0 = r3.getHeight()
            r5 = 48
            goto L1c
        L78:
            int r1 = r3.getWidth()
            r5 = 3
            goto L83
        L7e:
            int r1 = r3.getWidth()
            r5 = 5
        L83:
            r0 = r6
            r6 = r1
            goto L1c
        L86:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Unexpected side: "
            r1.<init>(r0)
            int r0 = r10.getSide()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.insets.ProtectionLayout.addProtectionView(android.content.Context, int, androidx.core.view.insets.Protection):void");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != PROTECTION_VIEW) {
            ProtectionGroup protectionGroup = this.mGroup;
            int childCount = getChildCount() - (protectionGroup != null ? protectionGroup.size() : 0);
            if (i2 > childCount || i2 < 0) {
                i2 = childCount;
            }
        }
        super.addView(view, i2, layoutParams);
    }
}
