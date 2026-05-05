package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;
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
/* JADX INFO: compiled from: WindowInsets.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯT\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6B\u0015\"4ߚ\u007f\u0007|jA0JgP.`\\2\u000fq\u0002<$q$yCAY\"}8\tWNmgvJh\u000bKƤ\u000e\u0016\u000fj4I[ye\u0012\u001dQJģG3coE9fx<\u00056݅R8(\u00041\u001aXH@v)D{\f@2\u0001{JV\u001bP\u001d\u001a@\ņ$\u0001,a0dD_\u0005]hAS\u0007wZf'\u000eI-Q\u001b`l';\t(2sNEP-%\u0002\u001f7Vi\\\u001b? [K|o59h\fWdt0\u0018#Hg\r\f\u0011lpMmn,?+}u{T\u001cB\u0010z*\u001fl\u000e\u001c'?N>/*f6,a\u00179g\tf\u0010\u0002Z\u007f)\u0006f\u001b3\u001dK+g9\u0017Uo`1Ne K!f1\u000f\u00159[\u0003*\u0011\u0019)l\u0010Q_j\u0007Q\u0011\\\u0018\u0001Um2\r\u0013\u00068,HG.HB%v\u001d3`s9Q=2\u0016\u0019Suy\u001d`\u0017WׂVNH̎\u0007\u0018=0\u0017\u0013+\\r\r\u0004P\u0003a\u0003ґYɟX\u0013\u0006ܱ+\"b\u0002J,E\u0012T[vv;ek\u0018=/\u0015@0ʫwް[EfڨMSi\u001fo]\u0017\u0016ELp\u0012)\u0001Pd$\\r'PD\u001fС\u001cȑ\u007fPVۼ+4E\u0005*HL3\u001fq#^Һ\"l"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7y7[CJy\u001b\"#waB\u0007p\u0002", "\u001a`]1e6BR,Hxh9|R@i\u007f:E2\u0005 \u0016Q\u0002qE\u0005%DgY);u\u0012=QMDI>& dpwd_3Us#ER$", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "\u001a`]1e6BR,Hxh9|R@i\u007f:E*\nr\"Rv\".z.4c\u0010\u0004@{\u0016=[*?yC\u001e\u001ehn\u000f", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012feI\\&&Cm\u0011*\u0006!DY[#3v\u0018.4GIz4'\u0015u7", "1n\\=b:>7\"\rzm:", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\b2VBE}\u0018'#hpGim3Mv4\u001d", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u0012*G|_ QL:uF\u0002\u001evaH\u0015F6Uu'T\"\u0012\u001d", "5dc\u0010b4I]'~^g:|\u0018=", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y4A}%w?GDj>0xqo9\u0016q\u000fX}&GY$", ">qT=T9>R", "", "5dc\u001de,IO&~y", "u(I", "Adc\u001de,IO&~y", "uY\u0018#", "@t];\\5@/\"\u0003\u0003Z;\u0001\u00138", "5dc\u001fh5GW\"\u0001Vg0\u0005\u0005>i\n1", "Adc\u001fh5GW\"\u0001Vg0\u0005\u0005>i\n1", "A`e2W\u0010Ga\u0019\u000e\t", "\u001a`]1e6BR,Hxh9|R@i\u007f:E2\u0005 \u0016Q\u0002qE\u0005%Dg[*?x\u0012=#", "5dc T=>R|\b\t^;\u000b", "u(;.a+K]\u001d}\u000e(*\u0007\u0016//\u0011,{RJ\t\u001bPn\u0018NZ.CY\r.\u0015w\u001e9IR\u0011", "Adc T=>R|\b\t^;\u000b", "uKP;W9HW\u0018\u0012D\\6\n\txv\u0004(\u000e\nr\u001b Fy  \u007f35h\f}Au!*\\\u0019~\\", "=m0=c3RE\u001d\byh>`\u0012=e\u000f6", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "7mb2g:", "=m4;W", "", "/mX:T;B]\"", "\u001a`]1e6BR,Hxh9|R@i\u007f:E2\u0005 \u0016Q\u0002qE\u0005%DgY);u\u0012=QMDI>& dp\u000f", "=m??X7:`\u0019", "=m??b.KS'\r", "@t];\\5@/\"\u0003\u0003Z;\u0001\u00138s", "", "=mBAT9M", "\u001a`]1e6BR,Hxh9|R@i\u007f:E2\u0005 \u0016Q\u0002qE\u0005%DgY);u\u0012=QMDI>& dpwcm<Wu5%VV7XaH", "0nd;W:", "=mE6X>\u001ab(zxa,{w9W\u00041zJ\u0013", "=mE6X>\u001dS(zxa,{i<o\b\u001a\u007fI\u007f!)", "D", "@t]", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class InsetsListener extends WindowInsetsAnimationCompat.Callback implements Runnable, OnApplyWindowInsetsListener, View.OnAttachStateChangeListener {
    private final WindowInsetsHolder composeInsets;
    private boolean prepared;
    private boolean runningAnimation;
    private WindowInsetsCompat savedInsets;

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
    }

    public final WindowInsetsHolder getComposeInsets() {
        return this.composeInsets;
    }

    public InsetsListener(WindowInsetsHolder windowInsetsHolder) {
        super(!windowInsetsHolder.getConsumes() ? 1 : 0);
        this.composeInsets = windowInsetsHolder;
    }

    public final boolean getPrepared() {
        return this.prepared;
    }

    public final void setPrepared(boolean z2) {
        this.prepared = z2;
    }

    public final boolean getRunningAnimation() {
        return this.runningAnimation;
    }

    public final void setRunningAnimation(boolean z2) {
        this.runningAnimation = z2;
    }

    public final WindowInsetsCompat getSavedInsets() {
        return this.savedInsets;
    }

    public final void setSavedInsets(WindowInsetsCompat windowInsetsCompat) {
        this.savedInsets = windowInsetsCompat;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public void onPrepare(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        this.prepared = true;
        this.runningAnimation = true;
        super.onPrepare(windowInsetsAnimationCompat);
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public WindowInsetsAnimationCompat.BoundsCompat onStart(WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsetsAnimationCompat.BoundsCompat boundsCompat) {
        this.prepared = false;
        return super.onStart(windowInsetsAnimationCompat, boundsCompat);
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public WindowInsetsCompat onProgress(WindowInsetsCompat windowInsetsCompat, List<WindowInsetsAnimationCompat> list) {
        WindowInsetsHolder.update$default(this.composeInsets, windowInsetsCompat, 0, 2, null);
        return this.composeInsets.getConsumes() ? WindowInsetsCompat.CONSUMED : windowInsetsCompat;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public void onEnd(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        this.prepared = false;
        this.runningAnimation = false;
        WindowInsetsCompat windowInsetsCompat = this.savedInsets;
        if (windowInsetsAnimationCompat.getDurationMillis() != 0 && windowInsetsCompat != null) {
            this.composeInsets.updateImeAnimationSource(windowInsetsCompat);
            this.composeInsets.updateImeAnimationTarget(windowInsetsCompat);
            WindowInsetsHolder.update$default(this.composeInsets, windowInsetsCompat, 0, 2, null);
        }
        this.savedInsets = null;
        super.onEnd(windowInsetsAnimationCompat);
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        this.savedInsets = windowInsetsCompat;
        this.composeInsets.updateImeAnimationTarget(windowInsetsCompat);
        if (this.prepared) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.runningAnimation) {
            this.composeInsets.updateImeAnimationSource(windowInsetsCompat);
            WindowInsetsHolder.update$default(this.composeInsets, windowInsetsCompat, 0, 2, null);
        }
        return this.composeInsets.getConsumes() ? WindowInsetsCompat.CONSUMED : windowInsetsCompat;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.prepared) {
            this.prepared = false;
            this.runningAnimation = false;
            WindowInsetsCompat windowInsetsCompat = this.savedInsets;
            if (windowInsetsCompat != null) {
                this.composeInsets.updateImeAnimationSource(windowInsetsCompat);
                WindowInsetsHolder.update$default(this.composeInsets, windowInsetsCompat, 0, 2, null);
                this.savedInsets = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }
}
