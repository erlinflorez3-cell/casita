package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
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
/* JADX INFO: compiled from: ViewGroup.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯV\u001d̉=!4i\bDZc|\u0004W\u00068\u000b4E\u0007\"B\u0012\u007f\u0007lkA0RkP.XT2\u000fy\u0005<$a$yCIU\"Ԃ*\teNog\u0005Jb\u000bI\u000f\u000e\u0016\u000fj4I[{e\u0012\u001dYJoE4UoS9ht<\f8E0F\u0012\u0005/)RH>w+GY\u001c*0np\u0001Ĭ\u0015e3(#\u001e>N\u0013F\\\u0016OfgzpRJ3\u0014yQ|'ۢ4\u0007S\"VZ-#\u0007c$1fGE\u00175S1\u0019\u0001o\u0006ŨE\n\u0001\u0013\u007f?'Y[\u001cWdY0H#>g=m\u00046k3\\ԃ\u001011dsQV$8y\u0001\u00023U\u0014\u001f\u00166v.ǉ\u001ep\u000e#CzxiPR\bdh\u0010\u000bcF\u0017S\u0012aC\u007fӜlitI3f7*\u00055\u001eQ\u0002\u001f%im&`C&\u001bȴQI\\NX`N8hem2q)̪0\u001c;U\u001cG{?=?%e\\\u007f\u0601'\u0004\u0013Va\u007f|\u0015bxS\u0018Rv^JnD8p¥\frWr$\u0004P\u0003jT\u0011{\u001d\u0005\u000b\f\u0018+ \u000bw\u0003Ơ-(a]\t\u0002j{o2%]gg]|{&Wg^y̗Y{%os\u000f\u0014mN\u000b\u0005\u0007\trY\u0012Yj2:2vuVǵ\u0002\\\u0002\u001a6J? .\\,_;\r\u001bN\u0004,fY|7j\u000bn\u0016\u007fbX<\u0003\u0018/%\u000f\u0007Qj\u0017\bg'T\\\u0003f#;hi5G1\u001cȯnL01/\u0017s.Y\u0010Lun\u001d\u001c{V\nI.\u001ag\\_C\u0019\u0010\rNJ\u0002[P|xkR[<?z+\u0005?An/u/\u0003pZk1߁Ut00Ԯvx3\nt\u007f(atyoc\u0003\f\u0012\u0003ϗv\u0007q>T:\u000b\b?73\u0005\b(\r7=CU\u001dDv</Cb\u0014.ܓ2}z\u0011,ys\u0007Lw$uzQ\f9c8wZ5ѝ\"ٝp\u0007ZJp\u007f\u0016K)H\u001b=`A\u0013{~8{\fe͕f¡0\u0011\tXaF!|Ё8Y"}, d2 = {"1gX9W9>\\", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eoc", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"l", "5dc\u0010[0ER&~\u0004", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:]M\u000b'\"\u001d3tB\u00014<]\u0007iEm\">ML9kBg\u0003hmI\u0007l*NL", "2db0X5=O\"\u000e\t", "5dc\u0011X:<S\"}vg;\u000b", "7mS6V,L", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u0013n\u000f\u0015wI\u0003\u0017l", "5dc\u0016a+BQ\u0019\r", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:]M\u000b'\"\u001d3tB\u00014<]\u0007iDi\u001f0MQ\u0005O=-\u0002dj;\u00079", "Ahi2", "", "5dc \\A>", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:]M\u000b'\"\u001d3q", "1n]AT0Ga", "", "DhTD", "4na\u0012T*A", "", "/bc6b5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "4na\u0012T*A7\"}zq,{", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "7mS2k", "5dc", "7r4:c;R", "7r=<g\fF^(\u0013", "7sT?T;H`", "", ";h]Bf\bLa\u001d\u0001\u0004", ">kd@4:LW\u001b\b", "Adc\u001aT9@W\"\r", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"U/k\u001b>z.\u001cU\u0012*G|\u0001*Z?Cy\n", "CoS.g,&O&\u0001~g:", ":dUA", "Bn_", "@hV5g", "0ncAb4", "CoS.g,&O&\u0001~g:i\t6a\u000f,\r@", "AsP?g", "3mS", "1na2 2Mf\u0013\fze,x\u0017/"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ViewGroupKt {
    public static final View get(ViewGroup viewGroup, int i2) {
        View childAt = viewGroup.getChildAt(i2);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException("Index: " + i2 + ", Size: " + viewGroup.getChildCount());
    }

    public static final boolean contains(ViewGroup viewGroup, View view) {
        return viewGroup.indexOfChild(view) != -1;
    }

    public static final void plusAssign(ViewGroup viewGroup, View view) {
        viewGroup.addView(view);
    }

    public static final void minusAssign(ViewGroup viewGroup, View view) {
        viewGroup.removeView(view);
    }

    public static final int getSize(ViewGroup viewGroup) {
        return viewGroup.getChildCount();
    }

    public static final boolean isEmpty(ViewGroup viewGroup) {
        return viewGroup.getChildCount() == 0;
    }

    public static final boolean isNotEmpty(ViewGroup viewGroup) {
        return viewGroup.getChildCount() != 0;
    }

    public static final void forEach(ViewGroup viewGroup, Function1<? super View, Unit> function1) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            function1.invoke(viewGroup.getChildAt(i2));
        }
    }

    public static final void forEachIndexed(ViewGroup viewGroup, Function2<? super Integer, ? super View, Unit> function2) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            function2.invoke(Integer.valueOf(i2), viewGroup.getChildAt(i2));
        }
    }

    public static final IntRange getIndices(ViewGroup viewGroup) {
        return RangesKt.until(0, viewGroup.getChildCount());
    }

    /* JADX INFO: renamed from: androidx.core.view.ViewGroupKt$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: ViewGroup.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я%\u001d̉=!,\u0011\bDZc|İI\u0006>\u00116Ȑ\u0007\":\u001b\u007f\u0007ljA0ReP\u008czRճ\u0015s\u0012éTa4sS;\u0004\u001a,!QV\\j\u007fnx^QÓ\u000fN\u001d\u0007oDI\u0004x$ܟ\u000fzH}EKM\u001eD\u007ftEB\u0013!J\"f{[В&ݵL\u0010~ٙŸO\u0014"}, d2 = {"/mS?b0=fb|\u0005k,F\u001a3e\u0012qlD\u0001)xTy\u001eG\\4s]\r Di%8Z\u0002\u0007", "", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "7mS2k", "", "6`b\u001bX?M", "", "<dgA", "@d\\<i,", "", "1na2 2Mf\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 implements Iterator<View>, KMutableIterator {
        final /* synthetic */ ViewGroup $this_iterator;
        private int index;

        AnonymousClass1(ViewGroup viewGroup) {
            this.$this_iterator = viewGroup;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.$this_iterator.getChildCount();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public View next() {
            ViewGroup viewGroup = this.$this_iterator;
            int i2 = this.index;
            this.index = i2 + 1;
            View childAt = viewGroup.getChildAt(i2);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.$this_iterator;
            int i2 = this.index - 1;
            this.index = i2;
            viewGroup.removeViewAt(i2);
        }
    }

    public static final Iterator<View> iterator(ViewGroup viewGroup) {
        return new AnonymousClass1(viewGroup);
    }

    public static final Sequence<View> getChildren(final ViewGroup viewGroup) {
        return new Sequence<View>() { // from class: androidx.core.view.ViewGroupKt$children$1
            @Override // kotlin.sequences.Sequence
            public Iterator<View> iterator() {
                return ViewGroupKt.iterator(viewGroup);
            }
        };
    }

    public static final Sequence<View> getDescendants(final ViewGroup viewGroup) {
        return new Sequence<View>() { // from class: androidx.core.view.ViewGroupKt$special$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            public Iterator<View> iterator() {
                return new TreeIterator(ViewGroupKt.getChildren(viewGroup).iterator(), new Function1<View, Iterator<? extends View>>() { // from class: androidx.core.view.ViewGroupKt$descendants$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Iterator<View> invoke(View view) {
                        Sequence<View> children;
                        ViewGroup viewGroup2 = view instanceof ViewGroup ? (ViewGroup) view : null;
                        if (viewGroup2 == null || (children = ViewGroupKt.getChildren(viewGroup2)) == null) {
                            return null;
                        }
                        return children.iterator();
                    }
                });
            }
        };
    }

    public static final void setMargins(ViewGroup.MarginLayoutParams marginLayoutParams, int i2) {
        marginLayoutParams.setMargins(i2, i2, i2, i2);
    }

    public static /* synthetic */ void updateMargins$default(ViewGroup.MarginLayoutParams marginLayoutParams, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((1 & i6) != 0) {
            i2 = marginLayoutParams.leftMargin;
        }
        if ((2 & i6) != 0) {
            i3 = marginLayoutParams.topMargin;
        }
        if ((i6 + 4) - (4 | i6) != 0) {
            i4 = marginLayoutParams.rightMargin;
        }
        if ((i6 + 8) - (i6 | 8) != 0) {
            i5 = marginLayoutParams.bottomMargin;
        }
        marginLayoutParams.setMargins(i2, i3, i4, i5);
    }

    public static final void updateMargins(ViewGroup.MarginLayoutParams marginLayoutParams, int i2, int i3, int i4, int i5) {
        marginLayoutParams.setMargins(i2, i3, i4, i5);
    }

    public static /* synthetic */ void updateMarginsRelative$default(ViewGroup.MarginLayoutParams marginLayoutParams, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((-1) - (((-1) - i6) | ((-1) - 1)) != 0) {
            i2 = marginLayoutParams.getMarginStart();
        }
        if ((2 & i6) != 0) {
            i3 = marginLayoutParams.topMargin;
        }
        if ((-1) - (((-1) - i6) | ((-1) - 4)) != 0) {
            i4 = marginLayoutParams.getMarginEnd();
        }
        if ((i6 & 8) != 0) {
            i5 = marginLayoutParams.bottomMargin;
        }
        marginLayoutParams.setMarginStart(i2);
        marginLayoutParams.topMargin = i3;
        marginLayoutParams.setMarginEnd(i4);
        marginLayoutParams.bottomMargin = i5;
    }

    public static final void updateMarginsRelative(ViewGroup.MarginLayoutParams marginLayoutParams, int i2, int i3, int i4, int i5) {
        marginLayoutParams.setMarginStart(i2);
        marginLayoutParams.topMargin = i3;
        marginLayoutParams.setMarginEnd(i4);
        marginLayoutParams.bottomMargin = i5;
    }
}
