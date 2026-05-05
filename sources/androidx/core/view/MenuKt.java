package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
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
/* JADX INFO: compiled from: Menu.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯF\u001d̉=!4i\bDZc|\u0004W\u00068\u000b4C\u0007\":\u0018\u007f\u0007lkA0RnP.XS2\u000fy{<řc$\bCCU0}*\tUNog\u0005Jb\u000bI\u0012\u000e\u0016\u0007\u00124I[yu%\u001d:Zom<uok:\u0011xD\u000f82P8@ڕ\u00012XV\u001b\u000fzqW4\u0012^A!Y`\u001ae *#\u0016MN\u0001ɉ`qTEXrcJ?%\tohX7a@|{\u0019tbmˠ|ya9QO5C1{\u00035S\fs\u0011L\nm\u0015y76YNָ[@^\u000f$\u001b1_\u001d_x,\u0003\u0018aq\u001c6YOӍOZ\u00147\b\u0001\u0002\u001dL\u0006\u0014\fMR>/*f6\u001aa\u00079ԦFh\u0015lV\u0018z\u00106?%.4[=)yiai\u001e\u0015Ѡ\u0004\u001d\u0018,8\u0019nOd|\u000e\u000f\u0016aƟ}i<_VUH|\u0013\u0002=\u001c\u00057î\bB\u0015>^\u00185\f\u0013>\u0017S7\nQK!\u001a\u0003\u000fֺg\u000f\u0018n\u0002ki\u0001Th\"\u001d\u0017g.\u0017\u0016rD\u0013\u00052³\\p?\u001fg4T5\n0\u0013N](@/8(N}m0қS}#3Ä~=ip{\u000e\u00069\r2]Q\u0012\u0011\u0018\u0017λ\u0018CTd\u000bZtEs h`@\"`M\u0013\u0010&|zÏ\fƱ6C\n\u001e:2? Ë\u0019c"}, d2 = {"1gX9W9>\\", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eoc", "\u001a`]1e6BRb\u0010~^>Fp/n\u0010\f\u000b@\tl", "\u001a`]1e6BRb\u0010~^>Fp/n\u0010}", "5dc\u0010[0ER&~\u0004", "uKP;W9HW\u0018H\fb,\u000fR\u0017e\t8Q\u0004g\u001d!Vv\u0012E@35e\u000e @k\u0016<\u00171;wD\u001e\u001efa\u000f", "Ahi2", "", "5dc \\A>", "uKP;W9HW\u0018H\fb,\u000fR\u0017e\t8Q\u0004d", "1n]AT0Ga", "", "7sT:", "4na\u0012T*A", "", "/bc6b5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "4na\u0012T*A7\"}zq,{", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "7mS2k", "5dc", "7r4:c;R", "7r=<g\fF^(\u0013", "7sT?T;H`", "", ";h]Bf\bLa\u001d\u0001\u0004", "@d\\<i,\"b\u0019\u0007Vm", "1na2 2Mf\u0013\fze,x\u0017/"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MenuKt {
    public static final MenuItem get(Menu menu, int i2) {
        return menu.getItem(i2);
    }

    public static final boolean contains(Menu menu, MenuItem menuItem) {
        int size = menu.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (Intrinsics.areEqual(menu.getItem(i2), menuItem)) {
                return true;
            }
        }
        return false;
    }

    public static final void minusAssign(Menu menu, MenuItem menuItem) {
        menu.removeItem(menuItem.getItemId());
    }

    public static final int getSize(Menu menu) {
        return menu.size();
    }

    public static final boolean isEmpty(Menu menu) {
        return menu.size() == 0;
    }

    public static final boolean isNotEmpty(Menu menu) {
        return menu.size() != 0;
    }

    public static final void forEach(Menu menu, Function1<? super MenuItem, Unit> function1) {
        int size = menu.size();
        for (int i2 = 0; i2 < size; i2++) {
            function1.invoke(menu.getItem(i2));
        }
    }

    public static final void forEachIndexed(Menu menu, Function2<? super Integer, ? super MenuItem, Unit> function2) {
        int size = menu.size();
        for (int i2 = 0; i2 < size; i2++) {
            function2.invoke(Integer.valueOf(i2), menu.getItem(i2));
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.MenuKt$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: Menu.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я%\u001d̉=!,\u0011\bDZc|İI\u0006>\u00116Ȑ\u0007\":\u001b\u007f\u0007ljA0ReP\u008czRճ\u0015s\u0012éTa4sS;\u0004\u001a,!QV\\j\u007fnx^QÓ\u000fN\u001d\u0007oDI\u0004x$ܟ\u000fzH}EKM\u001eD\u007ftEB\u0013!J\"f{[В&ݵL\u0010~ٙŸO\u0014"}, d2 = {"/mS?b0=fb|\u0005k,F\u001a3e\u0012qc@\n'|V.\u0012Kv21h\b-u9", "", "\u001a`]1e6BRb\u0010~^>Fp/n\u0010\f\u000b@\tl", "7mS2k", "", "6`b\u001bX?M", "", "<dgA", "@d\\<i,", "", "1na2 2Mf\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 implements Iterator<MenuItem>, KMutableIterator {
        final /* synthetic */ Menu $this_iterator;
        private int index;

        AnonymousClass1(Menu menu) {
            this.$this_iterator = menu;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.$this_iterator.size();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public MenuItem next() {
            Menu menu = this.$this_iterator;
            int i2 = this.index;
            this.index = i2 + 1;
            MenuItem item = menu.getItem(i2);
            if (item != null) {
                return item;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public void remove() {
            Unit unit;
            Menu menu = this.$this_iterator;
            int i2 = this.index - 1;
            this.index = i2;
            MenuItem item = menu.getItem(i2);
            if (item != null) {
                menu.removeItem(item.getItemId());
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                throw new IndexOutOfBoundsException();
            }
        }
    }

    public static final Iterator<MenuItem> iterator(Menu menu) {
        return new AnonymousClass1(menu);
    }

    public static final void removeItemAt(Menu menu, int i2) {
        Unit unit;
        MenuItem item = menu.getItem(i2);
        if (item != null) {
            menu.removeItem(item.getItemId());
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static final Sequence<MenuItem> getChildren(final Menu menu) {
        return new Sequence<MenuItem>() { // from class: androidx.core.view.MenuKt$children$1
            @Override // kotlin.sequences.Sequence
            public Iterator<MenuItem> iterator() {
                return MenuKt.iterator(menu);
            }
        };
    }
}
