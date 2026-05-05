package androidx.compose.ui.platform.actionmodecallback;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
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
/* JADX INFO: compiled from: TextActionModeCallback.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b<B\u0007Ӭ4\u0012\u000e\u0007nj?DLe^.Zݷ2\u000f\u0002{<$a&yCI^\"Ԃ*\teNog\u0005Jb\u000bI\u0013\fǝ\u000f̓\\I\u0004w\u001ey\u001f@HoM3ewM;ptd\u000761P9\n\u000b\u0007\u001a8K(v)G[\u001a\u00180NuRZ\u001dO\u0015\u001a@\bT\u001f/\u001fluT6VruB?%\u0013ipP=^^}]\u001bLT5\u0014\u000fi.-P7c\u0017;R1\bbiE\u0003MyU\rx)7+wum5\u0007\u0001Џ\u0019+]\u0016&\u000e4u\u001dQ\u000f\u000eW/]}cP<C(~\n)T\u0004<#mΞͶ1\u001al&VY\u0003\u0012k@~\u0004\u000fF\u000e\u0015y6E@079U3f\u007f~k%\\W\u0014\r\u001d 3\u0001\u001d#qS<a[\u001b\u001d\u0010_Ri@kj~\u0010g`\u0006\u0006\u0007a0N46U\u001cG}'-EJ\u007fsGI9k0jtm\u0005(xjih\u0001lp(|0O,\u001f\u000b\t_-\tywlXZ\u0013\u00164b/\u0016\bAB\r}JD=\u0012dN\u0017\u000e\u001bSk$=1|6\b\n4!ebv3cS\u0014\u0014ol\u000f\u0014mW)\u0004ֽjBY6+s6\"JPz\u0012\b{rP\"\u0012`@ۇ :4ջ1^\u001bR\u0011)\u0013a\u000b\u000ewbx\u0012\u000fTa&\u0019hRu_ɝ\\ʷt{oծa.\u0003l08aS;&4cr\tB\u0004;\u000f\u000fu\u0010G\u0016N]K\u001b\u0017Lɤ\b°\u001a&A֗G?\u0019\u001e\r4R\u00043UZ\u00016q[\u0018?\u0003\r{\u001f;\u00170}\u0007\u0019q\u0003ߓvߝS`\u001fǱ\u000f`x4\u0016o {gX\tU4t\u0019cVQ\u0003\u0005i<|:\u0013\u0004M\u001f{ˡ{ݕ\u0001A5ξ?\u001f\u001c\u000b\":5cc}}<Jz\u001d)\re20:ܥ{͈Ui:ծPK_\u0014L8Dn\tYV\u0003͔\fm"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n1W\r$Av\u001e8LC9g;%\u0012d_?PR,a\u0006\u0003E[R6e:|<\u0014oV\u0015U(\t\u0003_\u0017", "", "=m00g0H\\\u0001\ty^\u000b|\u0017>r\n<", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "@dRA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "=m2<c@+S%\u000fzl;|\b", "=m?.f;>@\u0019\u000b\u000b^:\f\t.", "=m2Bg\u0019>_)~\tm,{", "=mB2_,<bt\u0006\u0002K,\t\u0019/s\u000f(z", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu^zpILX4\\a\u007fQ]~Z\f]\u0001s\u000bcP+rM\u0001$\u00194\u0013\u0003Kq~\u001b\u001a\u0018>x:#f\u0019E\t\u0019\u007fJs>-_i\tNEN,/u\u0014)\u001elC83\u0018{\")21>\u0013yb\u0015|[D=NM#\n?(G7`WM9VL}%.O\u0006\u0001 {9\u00054r<\b>3\u0001:kQq'Eb\u0002^1mIp'FE\u0011NOm~z\bnx(_\u0017\u0012l>{n)V", "5dc\u001ca\b<b\u001d\t\u0004F6{\t\u000ee\u000e7\tJ\u0015", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu", "5dc\u001ca\nH^-kzj<|\u0017>e~", "Adc\u001ca\nH^-kzj<|\u0017>e~", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$Sc(", "5dc\u001ca\nNb\u0006~\u0007n,\u000b\u0018/d", "Adc\u001ca\nNb\u0006~\u0007n,\u000b\u0018/d", "5dc\u001ca\u0017:a(~g^8\r\t=t\u007f'", "Adc\u001ca\u0017:a(~g^8\r\t=t\u007f'", "5dc\u001ca\u001a>Z\u0019|\n:3\u0004u/q\u0010(\nO\u0001\u0016", "Adc\u001ca\u001a>Z\u0019|\n:3\u0004u/q\u0010(\nO\u0001\u0016", "5dc\u001fX*M", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Gy\u0016<\u00062I#j 5|k", "Adc\u001fX*M", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019\u0017Qw\u000eK\u00049~F}\u001eFCY\u001f", "/cS\u001aX5N7(~\u0003", ";d]B", "\u001a`]1e6BRb\u0010~^>Fp/n\u0010}", "7sT:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n1W\r$Av\u001e8LC9g;%\u0012d_?PK,W\u0007\u000bVLV\u0016gavG\u001dg", "/cS\u001aX5N7(~\u0003\u001d<\u0001\u0003<e\u0007(wN\u0001", "/cS\u001ce\u0019>[#\u0010zF,\u0006\u0019\u0013t\u007f0", "1`[9U(<Y", "=m00g0H\\|\u000ezf\n\u0004\r-k\u007f'", "", ";nS2", "\u001a`]1e6BRb\u0010~^>Fd-t\u00042\u0005(\u000b\u0016\u0017\u001d", "\u001a`]1e6BRb\u0010~^>Fp/n\u0010\f\u000b@\tl", "=m2?X(MSt|\nb6\u0006p9d\u007f", "=m32f;K]-Zxm0\u0007\u0012\u0017o~(", "=m??X7:`\u0019Zxm0\u0007\u0012\u0017o~(", "CoS.g,&S\"\u000f^m,\u0005\u0017", "CoS.g,&S\"\u000f^m,\u0005\u0017mu\u0004\"\t@\b\u0017\u0013Uo", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextActionModeCallback {
    public static final int $stable = 8;
    private final Function0<Unit> onActionModeDestroy;
    private Function0<Unit> onCopyRequested;
    private Function0<Unit> onCutRequested;
    private Function0<Unit> onPasteRequested;
    private Function0<Unit> onSelectAllRequested;
    private Rect rect;

    public TextActionModeCallback() {
        this(null, null, null, null, null, null, 63, null);
    }

    public TextActionModeCallback(Function0<Unit> function0, Rect rect, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05) {
        this.onActionModeDestroy = function0;
        this.rect = rect;
        this.onCopyRequested = function02;
        this.onPasteRequested = function03;
        this.onCutRequested = function04;
        this.onSelectAllRequested = function05;
    }

    public final Function0<Unit> getOnActionModeDestroy() {
        return this.onActionModeDestroy;
    }

    public /* synthetic */ TextActionModeCallback(Function0 function0, Rect rect, Function0 function02, Function0 function03, Function0 function04, Function0 function05, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((1 & i2) != 0 ? null : function0, (2 & i2) != 0 ? Rect.Companion.getZero() : rect, (i2 + 4) - (4 | i2) != 0 ? null : function02, (-1) - (((-1) - i2) | ((-1) - 8)) != 0 ? null : function03, (i2 + 16) - (16 | i2) != 0 ? null : function04, (-1) - (((-1) - i2) | ((-1) - 32)) == 0 ? function05 : null);
    }

    public final Rect getRect() {
        return this.rect;
    }

    public final void setRect(Rect rect) {
        this.rect = rect;
    }

    public final Function0<Unit> getOnCopyRequested() {
        return this.onCopyRequested;
    }

    public final void setOnCopyRequested(Function0<Unit> function0) {
        this.onCopyRequested = function0;
    }

    public final Function0<Unit> getOnPasteRequested() {
        return this.onPasteRequested;
    }

    public final void setOnPasteRequested(Function0<Unit> function0) {
        this.onPasteRequested = function0;
    }

    public final Function0<Unit> getOnCutRequested() {
        return this.onCutRequested;
    }

    public final void setOnCutRequested(Function0<Unit> function0) {
        this.onCutRequested = function0;
    }

    public final Function0<Unit> getOnSelectAllRequested() {
        return this.onSelectAllRequested;
    }

    public final void setOnSelectAllRequested(Function0<Unit> function0) {
        this.onSelectAllRequested = function0;
    }

    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        if (menu == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null menu".toString());
        }
        if (actionMode == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode".toString());
        }
        if (this.onCopyRequested != null) {
            addMenuItem$ui_release(menu, MenuItemOption.Copy);
        }
        if (this.onPasteRequested != null) {
            addMenuItem$ui_release(menu, MenuItemOption.Paste);
        }
        if (this.onCutRequested != null) {
            addMenuItem$ui_release(menu, MenuItemOption.Cut);
        }
        if (this.onSelectAllRequested == null) {
            return true;
        }
        addMenuItem$ui_release(menu, MenuItemOption.SelectAll);
        return true;
    }

    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        if (actionMode == null || menu == null) {
            return false;
        }
        updateMenuItems$ui_release(menu);
        return true;
    }

    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        Intrinsics.checkNotNull(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == MenuItemOption.Copy.getId()) {
            Function0<Unit> function0 = this.onCopyRequested;
            if (function0 != null) {
                function0.invoke();
            }
        } else if (itemId == MenuItemOption.Paste.getId()) {
            Function0<Unit> function02 = this.onPasteRequested;
            if (function02 != null) {
                function02.invoke();
            }
        } else if (itemId == MenuItemOption.Cut.getId()) {
            Function0<Unit> function03 = this.onCutRequested;
            if (function03 != null) {
                function03.invoke();
            }
        } else {
            if (itemId != MenuItemOption.SelectAll.getId()) {
                return false;
            }
            Function0<Unit> function04 = this.onSelectAllRequested;
            if (function04 != null) {
                function04.invoke();
            }
        }
        if (actionMode == null) {
            return true;
        }
        actionMode.finish();
        return true;
    }

    public final void onDestroyActionMode() {
        Function0<Unit> function0 = this.onActionModeDestroy;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void updateMenuItems$ui_release(Menu menu) {
        addOrRemoveMenuItem(menu, MenuItemOption.Copy, this.onCopyRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.Paste, this.onPasteRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.Cut, this.onCutRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.SelectAll, this.onSelectAllRequested);
    }

    public final void addMenuItem$ui_release(Menu menu, MenuItemOption menuItemOption) {
        menu.add(0, menuItemOption.getId(), menuItemOption.getOrder(), menuItemOption.getTitleResource()).setShowAsAction(1);
    }

    private final void addOrRemoveMenuItem(Menu menu, MenuItemOption menuItemOption, Function0<Unit> function0) {
        if (function0 == null || menu.findItem(menuItemOption.getId()) != null) {
            if (function0 != null || menu.findItem(menuItemOption.getId()) == null) {
                return;
            }
            menu.removeItem(menuItemOption.getId());
            return;
        }
        addMenuItem$ui_release(menu, menuItemOption);
    }
}
