package androidx.core.view;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
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
/* JADX INFO: compiled from: View.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яl\u001d̉=!4i\bDZc|\u0004G\u00078\u000bDB\u0007\"2\u0012\u007f\u0007tsA0JlP.`Y2\u000fq\u0007<$i$yّCU0}*\teNogtNb\u000bY\u000f\u000eǝ\u0001jBI]ތe\u0012%2JģG3coEʠhtD\f(288\u0002\u0005\u0007\u001d2H&v\u0003ŏS\f(0Hp@Z%}\u00138*\u0006l?)\u001e\u000bg~WNnkZG>\u0013zR]U_݁\u0001W\u0013hd-\u0013\u001aq 1F]Y%'c\u00035q\n`IӑwU5vL?+w\u0013\u007f6\u0007\u007fD61Q\u001b}\u000bAl\u0016ao:'˦SmQr\u001e.}\u001e\f\u000fB\n4*7J>-H\u00066/yφxkp^(vB.\u001a\n6E%0T1;)\u0007i|K*^F*\u0005ڟ\"-\u0007\u00111aZ1p\u0017!Z\u001euASP=vm8z\u0004Ю\n\t\u0013\u0010Q\u001c0u\u001fW{?.GF=]GC9\u0007\u0012YTv%\u0005¾l]otXF(\u0012&90\u000f2~Tf\u0015k~s\u0007MWۺ\"l7\f0+ \u000b!d!S\u0010~pnkxmu%5@vF\bn«\u0012a?\u0001C;W\u0007 cX|:cLd\u0015X\u0015a\u0002-!٩.:DV\u0015(w*ov\fA2ow\"4:]1\\Cu\u001bAPo\u0015\t\u000e\n\u0011\u0010-Tc(\u0011\u001a<t72\u0001hvqu\u0019a2\rb2-opcKlť(\u0001R\u000bV\u001f~\"/ogzG|p$&m{NGJC_OU\u0019\u001f\u0001920Ls~\u000bz_\u0002*')\u001c\"\u000fih^m\u000ei~axjx`\u001bϦ(\u000f\u0014\u0001Y d.\u0019\u0002N\u0001òq\f!ZfI!;\u0002<|8-\u001a-W=\u0012\u007f$\r5sz7\u001f&wBNC\u0003ԃmo44)Ϗ,܌i\u00042\u001f.\u0014p\bu2iWqY->R9z<ZYzy\u0018B7l\u001d5XA\u0013\u0010\u0005YԪ\u000f/\u0004!MԴ\u0013\t\niv+o,SV_Xss\u0004\u001a_Qb)M\u0002x\u001esQ]\u0019\t'\n9\rat\u0018\u001dK_nW\u0011\u001a`\fy\u0019D\u0002Sb3MOӞ:Do\u0016L[T\u0018%8z.F\u0010\u0015\u001d3P6SV<e)b\\I\u0013\u001f]`O;1\u0005\u00154,<M13~vZ5d@Ak\u001d7,1ʱ\u0005\u0007>9לl?+*h\u00019E\fBq\u0002d\u0004}mԹos$:\u001e}+D84GT)e\u00072n\u000b\u0004h|c\u001f\u0012\u0015R\u0005fĹ\u0003~\u0015\u0010B\u000f\u001d\r9w\u0001wz-zU 7q\u001a1\u001bR/\u001f\f+j|ʘ-D؝-\u0014Ɲv͂+\u0006oUA\u0006\u0016)@)\n~/gw6t\u0016u\u001bh\u001d\u001a\u0016\u0011\u00029\u0017^&\u001c.x{)̝.F̍OXֶ\u000eեbc\u0004y'L54\r\bHXv\u0004*\fzq\u0007U9\n\u000f1\u0005y\u001f1^#!'{5I΄ZxĕSvǌ\u001d\u05ca\u0018\u001f>!<\u0016p20Qiw~voo\u001b;GkXrY0\u0001\u001e4ϬyȄ\b.l*\u001bMd`^x\u0017p\u0005B\u0006\u001f\u0007jVd+؊)ِ\u0001\u0003``\u0017(BY\u00132rEO\u0019Ml5G\u000f\u0007:ڇI±%5jA!N@\u001e\u0010<\u0005)\u001b:\u0011\u0006(*p\t)Ќgǋ1Jl? @g7\u000ex\u0011@cEfS0,?\u000eG̖Zߣ$Bt\u001c\"V_Fa-\u001f\u001d-84\u0001/\u0019cj\bǡ%ݜ\u0005\u0001\u0019\u000fE\u0017?~Èw{"}, d2 = {"/k[#\\,Pa", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eoc", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "5dc\u000e_3/W\u0019\u0011\t", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q\u0004g\u001d!Vv\u0012E@35e\u000e @k\u0016<\u00171;wD\u001e\u001efa\u000f", "/mR2f;H`'", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\u0013wM\u0001 &\u001d", "5dc\u000ea*>a(\t\bl", "D`[BX", "", "7r6<a,", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q\u0004u", "Adc\u0014b5>", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q5D\b", "7r8;i0LW\u0016\u0006z", "Adc\u0016a=Ba\u001d{\u0002^", "7rE6f0;Z\u0019", "Adc#\\:BP ~", ";`a4\\5\u001b](\u000e\u0005f", "", "5dc\u001aT9@W\"[\u0005m;\u0007\u0011", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q\u0004d", ";`a4\\5\u001e\\\u0018", "5dc\u001aT9@W\"^\u0004]", ";`a4\\5%S\u001a\u000e", "5dc\u001aT9@W\"ez_;", ";`a4\\5+W\u001b\u0002\n", "5dc\u001aT9@W\"k~`/\f", ";`a4\\5,b\u0015\f\n", "5dc\u001aT9@W\"l\nZ9\f", ";`a4\\5-]$", "5dc\u001aT9@W\"m\u0005i", "2n>;4;MO\u0017\u0002", "", "/bc6b5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "DhTD", "2n>;7,MO\u0017\u0002", "2n>;?(R])\u000e", "2n>;A,Qb\u007fz\u000fh<\f", "2n>;C9>2&z\r", "\u001a`]1e6BR,Hxh9|R@i\u007f:E*\n\u0017\u0005Jy\u001d'\u0004%\u0014fy2\u001eq$=ML;x\n", "2qPDG6\u001bW(\u0007vi", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u001d", "1n]3\\.", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u0006M\u0018Ew)7/", ">nbA7,EO-~y", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "2d[.l\u0010G;\u001d\u0006\u0002b:", "", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", ">nbAB5\u001a\\\u001d\u0007vm0\u0007\u0012\u000ee\u0007$\u0010@\u007f", "Adc\u001dT+=W\"\u0001", "Ahi2", "CoS.g,%O-\t\u000bm\u0017x\u0016+m\u000e", "\"", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"U.k\"F\u00074 U\u000b\u001c?{k", "0k^0^", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "CoS.g,%O-\t\u000bm\u0017x\u0016+m\u000e\u0017\u0010K\u0001\u0016", "CoS.g,)O\u0018}~g.", ":dUA", "Bn_", "@hV5g", "0ncAb4", "CoS.g,)O\u0018}~g.i\t6a\u000f,\r@", "AsP?g", "3mS", "1na2 2Mf\u0013\fze,x\u0017/"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ViewKt {

    /* JADX INFO: renamed from: androidx.core.view.ViewKt$doOnNextLayout$1 */
    /* JADX INFO: compiled from: View.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я!\u001d̉=!4i\bӵLc\u0003\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u0006\rnj?6ld߉4Ziճ?k*3l*2q[;\u0004\u001b.&\u0017Qfg\u0016qz^\u0019G'\u0006D}\u001b0W[\u0011]@\u0014bF}FKM\u001eBid\u0003>\u001d `'h}\u0013\n2*v\u0015'~QU$\u0012^E!>`\u0018e\u0005H\u00176B.\r6\\\u0016S|\\ǶaG"}, d2 = {"/mS?b0=fb|\u0005k,F\u001a3e\u0012qlD\u0001)|V.\rF`.\u001eY\u0011/\u001ei*8]Ry7", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012feIg\u0013+Q\u007f\u001d\u001ay!>[}\u0007;{%.VCHA", "=m;.l6Nbv\u0002vg.|", "", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", ":dUA", "", "Bn_", "@hV5g", "0ncAb4", "=kS\u0019X-M", "=kS!b7", "=kS\u001f\\.Ab", "=kS\u000fb;M]!", "1na2 2Mf\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class ViewOnLayoutChangeListenerC07951 implements View.OnLayoutChangeListener {
        final /* synthetic */ Function1<View, Unit> $action;

        /* JADX WARN: Multi-variable type inference failed */
        public ViewOnLayoutChangeListenerC07951(Function1<? super View, Unit> function1) {
            function1 = function1;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            view.removeOnLayoutChangeListener(this);
            function1.invoke(view);
        }
    }

    public static final void doOnNextLayout(View view, Function1<? super View, Unit> function1) {
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.core.view.ViewKt.doOnNextLayout.1
            final /* synthetic */ Function1<View, Unit> $action;

            /* JADX WARN: Multi-variable type inference failed */
            public ViewOnLayoutChangeListenerC07951(Function1<? super View, Unit> function12) {
                function1 = function12;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                view2.removeOnLayoutChangeListener(this);
                function1.invoke(view2);
            }
        });
    }

    public static final void doOnLayout(View view, final Function1<? super View, Unit> function1) {
        if (view.isLaidOut() && !view.isLayoutRequested()) {
            function1.invoke(view);
        } else {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.core.view.ViewKt$doOnLayout$$inlined$doOnNextLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    view2.removeOnLayoutChangeListener(this);
                    function1.invoke(view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.ViewKt$doOnPreDraw$1 */
    /* JADX INFO: compiled from: View.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "@t]"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class RunnableC07961 implements Runnable {
        final /* synthetic */ Function1<View, Unit> $action;
        final /* synthetic */ View $this_doOnPreDraw;

        /* JADX WARN: Multi-variable type inference failed */
        public RunnableC07961(Function1<? super View, Unit> function1, View view) {
            function1 = function1;
            view = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            function1.invoke(view);
        }
    }

    public static final OneShotPreDrawListener doOnPreDraw(View view, Function1<? super View, Unit> function1) {
        return OneShotPreDrawListener.add(view, new Runnable() { // from class: androidx.core.view.ViewKt.doOnPreDraw.1
            final /* synthetic */ Function1<View, Unit> $action;
            final /* synthetic */ View $this_doOnPreDraw;

            /* JADX WARN: Multi-variable type inference failed */
            public RunnableC07961(Function1<? super View, Unit> function12, View view2) {
                function1 = function12;
                view = view2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                function1.invoke(view);
            }
        });
    }

    public static final void doOnAttach(View view, Function1<? super View, Unit> function1) {
        if (view.isAttachedToWindow()) {
            function1.invoke(view);
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.core.view.ViewKt.doOnAttach.1
                final /* synthetic */ Function1<View, Unit> $action;
                final /* synthetic */ View $this_doOnAttach;

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                }

                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass1(View view2, Function1<? super View, Unit> function12) {
                    view = view2;
                    function1 = function12;
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view2) {
                    view.removeOnAttachStateChangeListener(this);
                    function1.invoke(view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.ViewKt$doOnAttach$1 */
    /* JADX INFO: compiled from: View.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001b\u001d̉=!4i\bӵLc\u0003\u0004Iي8\u000bDB\u0007\"2\u0012 \u0006߿pAFǏ\u0016H\\Q\u001c8\u001dk\u00144R\\TuQ=m\u001a,%Oc\u0017uurbZ9D?\n$z\u0003,wX?qܱ\u00137"}, d2 = {"/mS?b0=fb|\u0005k,F\u001a3e\u0012qlD\u0001)|V.\rF`.\u0011h\r\u001c5pTy", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012feI\\&&Cm\u0011*\u0006!DY[#3v\u0018.4GIz4'\u0015u7", "=mE6X>\u001ab(zxa,{w9W\u00041zJ\u0013", "", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "=mE6X>\u001dS(zxa,{i<o\b\u001a\u007fI\u007f!)", "1na2 2Mf\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass1 implements View.OnAttachStateChangeListener {
        final /* synthetic */ Function1<View, Unit> $action;
        final /* synthetic */ View $this_doOnAttach;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view2) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(View view2, Function1<? super View, Unit> function12) {
            view = view2;
            function1 = function12;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view2) {
            view.removeOnAttachStateChangeListener(this);
            function1.invoke(view2);
        }
    }

    public static final void doOnDetach(View view, Function1<? super View, Unit> function1) {
        if (!view.isAttachedToWindow()) {
            function1.invoke(view);
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.core.view.ViewKt.doOnDetach.1
                final /* synthetic */ Function1<View, Unit> $action;
                final /* synthetic */ View $this_doOnDetach;

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view2) {
                }

                /* JADX WARN: Multi-variable type inference failed */
                public ViewOnAttachStateChangeListenerC07941(View view2, Function1<? super View, Unit> function12) {
                    view = view2;
                    function1 = function12;
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                    view.removeOnAttachStateChangeListener(this);
                    function1.invoke(view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.ViewKt$doOnDetach$1 */
    /* JADX INFO: compiled from: View.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001b\u001d̉=!4i\bӵLc\u0003\u0004Iي8\u000bDB\u0007\"2\u0012 \u0006߿pAFǏ\u0016H\\Q\u001c8\u001dk\u00144R\\TuQ=m\u001a,%Oc\u0017uurbZ9D?\n$z\u0003,wX?qܱ\u00137"}, d2 = {"/mS?b0=fb|\u0005k,F\u001a3e\u0012qlD\u0001)|V.\rF`.\u0014Y\r\u001c5pTy", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012feI\\&&Cm\u0011*\u0006!DY[#3v\u0018.4GIz4'\u0015u7", "=mE6X>\u001ab(zxa,{w9W\u00041zJ\u0013", "", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "=mE6X>\u001dS(zxa,{i<o\b\u001a\u007fI\u007f!)", "1na2 2Mf\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class ViewOnAttachStateChangeListenerC07941 implements View.OnAttachStateChangeListener {
        final /* synthetic */ Function1<View, Unit> $action;
        final /* synthetic */ View $this_doOnDetach;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view2) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ViewOnAttachStateChangeListenerC07941(View view2, Function1<? super View, Unit> function12) {
            view = view2;
            function1 = function12;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view2) {
            view.removeOnAttachStateChangeListener(this);
            function1.invoke(view2);
        }
    }

    public static /* synthetic */ void updatePaddingRelative$default(View view, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 + 1) - (1 | i6) != 0) {
            i2 = view.getPaddingStart();
        }
        if ((-1) - (((-1) - i6) | ((-1) - 2)) != 0) {
            i3 = view.getPaddingTop();
        }
        if ((-1) - (((-1) - i6) | ((-1) - 4)) != 0) {
            i4 = view.getPaddingEnd();
        }
        if ((i6 & 8) != 0) {
            i5 = view.getPaddingBottom();
        }
        view.setPaddingRelative(i2, i3, i4, i5);
    }

    public static final void updatePaddingRelative(View view, int i2, int i3, int i4, int i5) {
        view.setPaddingRelative(i2, i3, i4, i5);
    }

    public static /* synthetic */ void updatePadding$default(View view, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((-1) - (((-1) - i6) | ((-1) - 1)) != 0) {
            i2 = view.getPaddingLeft();
        }
        if ((-1) - (((-1) - i6) | ((-1) - 2)) != 0) {
            i3 = view.getPaddingTop();
        }
        if ((i6 + 4) - (4 | i6) != 0) {
            i4 = view.getPaddingRight();
        }
        if ((-1) - (((-1) - i6) | ((-1) - 8)) != 0) {
            i5 = view.getPaddingBottom();
        }
        view.setPadding(i2, i3, i4, i5);
    }

    public static final void updatePadding(View view, int i2, int i3, int i4, int i5) {
        view.setPadding(i2, i3, i4, i5);
    }

    public static final void setPadding(View view, int i2) {
        view.setPadding(i2, i2, i2, i2);
    }

    public static final Runnable postDelayed(View view, long j2, final Function0<Unit> function0) {
        Runnable runnable = new Runnable() { // from class: androidx.core.view.ViewKt$postDelayed$runnable$1
            @Override // java.lang.Runnable
            public final void run() {
                function0.invoke();
            }
        };
        view.postDelayed(runnable, j2);
        return runnable;
    }

    public static final Runnable postOnAnimationDelayed(View view, long j2, final Function0<Unit> function0) {
        Runnable runnable = new Runnable() { // from class: androidx.core.view.ViewKt$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                function0.invoke();
            }
        };
        view.postOnAnimationDelayed(runnable, j2);
        return runnable;
    }

    public static /* synthetic */ Bitmap drawToBitmap$default(View view, Bitmap.Config config, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        return drawToBitmap(view, config);
    }

    public static final Bitmap drawToBitmap(View view, Bitmap.Config config) {
        if (!view.isLaidOut()) {
            throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.translate(-view.getScrollX(), -view.getScrollY());
        view.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static final boolean isVisible(View view) {
        return view.getVisibility() == 0;
    }

    public static final void setVisible(View view, boolean z2) {
        view.setVisibility(z2 ? 0 : 8);
    }

    public static final boolean isInvisible(View view) {
        return view.getVisibility() == 4;
    }

    public static final void setInvisible(View view, boolean z2) {
        view.setVisibility(z2 ? 4 : 0);
    }

    public static final boolean isGone(View view) {
        return view.getVisibility() == 8;
    }

    public static final void setGone(View view, boolean z2) {
        view.setVisibility(z2 ? 8 : 0);
    }

    public static final /* synthetic */ <T extends ViewGroup.LayoutParams> void updateLayoutParamsTyped(View view, Function1<? super T, Unit> function1) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.reifiedOperationMarker(1, ExifInterface.GPS_DIRECTION_TRUE);
        function1.invoke(layoutParams);
        view.setLayoutParams(layoutParams);
    }

    public static final int getMarginLeft(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.leftMargin;
        }
        return 0;
    }

    public static final int getMarginTop(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin;
        }
        return 0;
    }

    public static final int getMarginRight(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.rightMargin;
        }
        return 0;
    }

    public static final int getMarginBottom(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.bottomMargin;
        }
        return 0;
    }

    public static final int getMarginStart(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
        }
        return 0;
    }

    public static final int getMarginEnd(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd();
        }
        return 0;
    }

    public static final Sequence<ViewParent> getAncestors(View view) {
        return SequencesKt.generateSequence(view.getParent(), ViewKt$ancestors$1.INSTANCE);
    }

    public static final Sequence<View> getAllViews(View view) {
        return SequencesKt.sequence(new ViewKt$allViews$1(view, null));
    }

    public static final void updateLayoutParams(View view, Function1<? super ViewGroup.LayoutParams, Unit> function1) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        function1.invoke(layoutParams);
        view.setLayoutParams(layoutParams);
    }
}
