package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: compiled from: ChangeTracker.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u0016DLcz\u0005I\u0006F\u000b6B\u0015\"4\u0012}\u0007njG6LeN/ZS8\u000fs{:(c$\bCCU \u0002*\t]ZogtN`ŏYƤ6\u0016'idHs9l\"\u00178B}?KO\u0006<gśҽ:\u0005.3j`\b\u000f\u0019\u001aXS@|\tOc\u000e(/ntjV\u001bZ\u001d\u001a@\rn$\u000f,tg|=xpkIG#1p\tNoc>\re\rt_o(\u0005r6+nIe\u00193f\u001b\u0007\u0001b\u0006\u0017Ճpܵߔg&ݳ/KykDmH/#Ag\r\f\u0005V`\u0013dx\fU2\u0016wؘOʫÂvyԫ\u0011>\n%\u0014<\u00114;2~\b<L;\u0007\u001c\\^\u001cvB.\u0006\u0012:%@\u00183Y@Kj_}S\u0019|>,\t\u001b;;\u0001\u001d(,f\u001cb-!dya1\u007fDkK%˦eǀq\u0004xçR<\u00125_\u0006?}!.E)e^\u0010\u05fd-Ƞ\u0006HLϙG\u0017nnki\u0001OvvEނ9Ҋ\r\u0010rFj\ryYӼX5\u0019M\"s\u000f\u0001\u000e˘<\u000bv˼%D"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PA/J\u007f)G;[(ZXrJi", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r*kG-ula@\u0006@<Ow'T\u000b,/X[t=z\u0016h\u001d$", "7mXA\\(E1\u001cz\u0004`,\u000b", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001q\u001f9]R\u0005o=-\u0015uj5\u000e-\nQr0IL=9XPx=!g\u001e~", "-bW.a.>a", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\fF},5W\r$Av_\u0016]R7h;\u001e\u0006h_H\u0011p\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PA/J\u007f)G;[(ZXrJRo]\nW-\rZ", "-bW.a.>a\b~\u0003i", "1gP;Z,\u001c])\b\n", "", "5dc\u0010[(GU\u0019\\\u0005n5\f", "u(8", "/o_2a+'S+\\}Z5~\t", "", ";da4X+(d\u0019\f\u0002Z7\b\r8g]+wI\u0003\u0017", ">qT\u001a\\5", ">qT\u001aT?", ">nbA7,Eb\u0015", "1kT.e\nAO\"\u0001zl", "5dc\u001ce0@W\"z\u0002K(\u0006\u000b/", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\"U\u0007\"7C", "1gP;Z,\"\\\u0018~\u000e", "5dc\u001ce0@W\"z\u0002K(\u0006\u000b/-G-\u000f\u0012ew%", "uH\u0018\u0017", "5dc\u001fT5@S", "5dc\u001fT5@S`F\u007fq}ai=", "BnBAe0GU", "", "BqP0^\nAO\"\u0001z", ">qT g(Kb", ">qT\u0012a+", ">nbA?,GU(\u0002", "\u0011gP;Z,", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ChangeTracker implements TextFieldBuffer.ChangeList {
    public static final int $stable = 8;
    private MutableVector<Change> _changes;
    private MutableVector<Change> _changesTemp;

    public ChangeTracker() {
        this(null, 1, null);
    }

    public ChangeTracker(ChangeTracker changeTracker) {
        MutableVector<Change> mutableVector;
        int size;
        int i2 = 0;
        this._changes = new MutableVector<>(new Change[16], 0);
        this._changesTemp = new MutableVector<>(new Change[16], 0);
        if (changeTracker == null || (mutableVector = changeTracker._changes) == null || (size = mutableVector.getSize()) <= 0) {
            return;
        }
        Change[] content = mutableVector.getContent();
        do {
            Change change = content[i2];
            this._changes.add(new Change(change.getPreStart(), change.getPreEnd(), change.getOriginalStart(), change.getOriginalEnd()));
            i2++;
        } while (i2 < size);
    }

    public /* synthetic */ ChangeTracker(ChangeTracker changeTracker, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : changeTracker);
    }

    @Override // androidx.compose.foundation.text.input.TextFieldBuffer.ChangeList
    public int getChangeCount() {
        return this._changes.getSize();
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void trackChange(int r9, int r10, int r11) {
        /*
            r8 = this;
            if (r9 != r10) goto L5
            if (r11 != 0) goto L5
            return
        L5:
            int r3 = java.lang.Math.min(r9, r10)
            int r5 = java.lang.Math.max(r9, r10)
            int r0 = r5 - r3
            int r11 = r11 - r0
            r4 = 0
            r2 = 0
            r7 = r4
        L13:
            androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.text.input.internal.ChangeTracker$Change> r0 = r8._changes
            int r0 = r0.getSize()
            if (r4 >= r0) goto L89
            androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.text.input.internal.ChangeTracker$Change> r0 = r8._changes
            java.lang.Object[] r0 = r0.getContent()
            r6 = r0[r4]
            androidx.compose.foundation.text.input.internal.ChangeTracker$Change r6 = (androidx.compose.foundation.text.input.internal.ChangeTracker.Change) r6
            int r0 = r6.getPreStart()
            if (r3 > r0) goto L42
            if (r0 > r5) goto L42
        L2d:
            if (r2 != 0) goto L33
            r2 = r6
        L30:
            int r4 = r4 + 1
            goto L13
        L33:
            int r0 = r6.getPreEnd()
            r2.setPreEnd(r0)
            int r0 = r6.getOriginalEnd()
            r2.setOriginalEnd(r0)
            goto L30
        L42:
            int r0 = r6.getPreEnd()
            if (r3 > r0) goto L4b
            if (r0 > r5) goto L4b
            goto L2d
        L4b:
            int r1 = r6.getPreStart()
            int r0 = r6.getPreEnd()
            if (r3 > r0) goto L58
            if (r1 > r3) goto L58
            goto L2d
        L58:
            int r1 = r6.getPreStart()
            int r0 = r6.getPreEnd()
            if (r5 > r0) goto L65
            if (r1 > r5) goto L65
            goto L2d
        L65:
            int r0 = r6.getPreStart()
            if (r0 <= r5) goto L71
            if (r7 != 0) goto L71
            r8.appendNewChange(r2, r3, r5, r11)
            r7 = 1
        L71:
            if (r7 == 0) goto L83
            int r0 = r6.getPreStart()
            int r0 = r0 + r11
            r6.setPreStart(r0)
            int r0 = r6.getPreEnd()
            int r0 = r0 + r11
            r6.setPreEnd(r0)
        L83:
            androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.text.input.internal.ChangeTracker$Change> r0 = r8._changesTemp
            r0.add(r6)
            goto L30
        L89:
            if (r7 != 0) goto L8e
            r8.appendNewChange(r2, r3, r5, r11)
        L8e:
            androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.text.input.internal.ChangeTracker$Change> r1 = r8._changes
            androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.text.input.internal.ChangeTracker$Change> r0 = r8._changesTemp
            r8._changes = r0
            r8._changesTemp = r1
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.ChangeTracker.trackChange(int, int, int):void");
    }

    public final void clearChanges() {
        this._changes.clear();
    }

    @Override // androidx.compose.foundation.text.input.TextFieldBuffer.ChangeList
    /* JADX INFO: renamed from: getRange--jx7JFs */
    public long mo1444getRangejx7JFs(int i2) {
        Change change = this._changes.getContent()[i2];
        return TextRangeKt.TextRange(change.getPreStart(), change.getPreEnd());
    }

    @Override // androidx.compose.foundation.text.input.TextFieldBuffer.ChangeList
    /* JADX INFO: renamed from: getOriginalRange--jx7JFs */
    public long mo1443getOriginalRangejx7JFs(int i2) {
        Change change = this._changes.getContent()[i2];
        return TextRangeKt.TextRange(change.getOriginalStart(), change.getOriginalEnd());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChangeList(changes=[");
        MutableVector<Change> mutableVector = this._changes;
        int size = mutableVector.getSize();
        if (size > 0) {
            Change[] content = mutableVector.getContent();
            int i2 = 0;
            do {
                Change change = content[i2];
                sb.append("(" + change.getOriginalStart() + AbstractJsonLexerKt.COMMA + change.getOriginalEnd() + ")->(" + change.getPreStart() + AbstractJsonLexerKt.COMMA + change.getPreEnd() + ')');
                if (i2 < getChangeCount() - 1) {
                    sb.append(", ");
                }
                i2++;
            } while (i2 < size);
        }
        sb.append("])");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    private final void appendNewChange(Change change, int i2, int i3, int i4) {
        int preEnd;
        if (this._changesTemp.isEmpty()) {
            preEnd = 0;
        } else {
            Change changeLast = this._changesTemp.last();
            preEnd = changeLast.getPreEnd() - changeLast.getOriginalEnd();
        }
        if (change == null) {
            int i5 = i2 - preEnd;
            change = new Change(i2, i3 + i4, i5, (i3 - i2) + i5);
        } else {
            if (change.getPreStart() > i2) {
                change.setPreStart(i2);
                change.setOriginalStart(i2);
            }
            if (i3 > change.getPreEnd()) {
                int preEnd2 = change.getPreEnd() - change.getOriginalEnd();
                change.setPreEnd(i3);
                change.setOriginalEnd(i3 - preEnd2);
            }
            change.setPreEnd(change.getPreEnd() + i4);
        }
        this._changesTemp.add(change);
    }

    /* JADX INFO: compiled from: ChangeTracker.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4T\u0007\":\u001b\u007f\u0007lkA0RqP\u008cXݺ0%ӆ,4RZd\u0015S?c\u001a\u0016\"7P^kupbZ9D\u001f\n${\u0003,wV\ta \u0013JB\u001e@ݯQoK>){D\u001582P9@ە\u0002b1V!\u000fzqLRܼ1\twHd%M3\u001bXĦ?h\b,o\u007fNdI3Ӟ;wR\u0011}ZNUڿ`\u0003S\rTT?\r%bN1F7C\u0017=S1\b\u0003aE\u0003MtU\u0005\u0017(W1Ose:p\u007fB\u0016q̈́\f&\u00044q\u001dQ\u000f\"W1]zcR$'&yBɵ=L\u0015\u0014?`.[\u001b-۳\r{{\u0001lXP0x\tɬy2N%)\u00183Y:qƟ]ň?%Vљ\u0014\u0007\u0013$1\b\u000f#a\\\u001cie3bzi1\u007fA\u0014ʷZ̆]IuՎ\td\b4\u00127g\u00025\u0007\u001f7g=E]Q#OlXҍPϼz\u0011håkkXTN)\u000f\u0018=7\u0017\u0015+\\r\u0005\u0004P\u0003Y\u0003ґYɟX\u0013\u0006ܱ+\"b\u0006J(E\u0012T^vrҽQx"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PA/J\u007f)G;[(ZXrJRo]\nW-\rZ", "", ">qT g(Kb", "", ">qT\u0012a+", "=qX4\\5:Z\u0007\u000evk;", "=qX4\\5:Zx\by", "uH8\u0016<o/", "5dc\u001ce0@W\"z\u0002>5{", "u(8", "Adc\u001ce0@W\"z\u0002>5{", "uH\u0018#", "5dc\u001ce0@W\"z\u0002L;x\u0016>", "Adc\u001ce0@W\"z\u0002L;x\u0016>", "5dc\u001de,\u001e\\\u0018", "Adc\u001de,\u001e\\\u0018", "5dc\u001de,,b\u0015\f\n", "Adc\u001de,,b\u0015\f\n", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "BnBAe0GU", "", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class Change {
        private int originalEnd;
        private int originalStart;
        private int preEnd;
        private int preStart;

        public static /* synthetic */ Change copy$default(Change change, int i2, int i3, int i4, int i5, int i6, Object obj) {
            if ((-1) - (((-1) - i6) | ((-1) - 1)) != 0) {
                i2 = change.preStart;
            }
            if ((2 & i6) != 0) {
                i3 = change.preEnd;
            }
            if ((4 & i6) != 0) {
                i4 = change.originalStart;
            }
            if ((i6 + 8) - (i6 | 8) != 0) {
                i5 = change.originalEnd;
            }
            return change.copy(i2, i3, i4, i5);
        }

        public final int component1() {
            return this.preStart;
        }

        public final int component2() {
            return this.preEnd;
        }

        public final int component3() {
            return this.originalStart;
        }

        public final int component4() {
            return this.originalEnd;
        }

        public final Change copy(int i2, int i3, int i4, int i5) {
            return new Change(i2, i3, i4, i5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Change)) {
                return false;
            }
            Change change = (Change) obj;
            return this.preStart == change.preStart && this.preEnd == change.preEnd && this.originalStart == change.originalStart && this.originalEnd == change.originalEnd;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.preStart) * 31) + Integer.hashCode(this.preEnd)) * 31) + Integer.hashCode(this.originalStart)) * 31) + Integer.hashCode(this.originalEnd);
        }

        public String toString() {
            return "Change(preStart=" + this.preStart + ", preEnd=" + this.preEnd + ", originalStart=" + this.originalStart + ", originalEnd=" + this.originalEnd + ')';
        }

        public Change(int i2, int i3, int i4, int i5) {
            this.preStart = i2;
            this.preEnd = i3;
            this.originalStart = i4;
            this.originalEnd = i5;
        }

        public final int getPreStart() {
            return this.preStart;
        }

        public final void setPreStart(int i2) {
            this.preStart = i2;
        }

        public final int getPreEnd() {
            return this.preEnd;
        }

        public final void setPreEnd(int i2) {
            this.preEnd = i2;
        }

        public final int getOriginalStart() {
            return this.originalStart;
        }

        public final void setOriginalStart(int i2) {
            this.originalStart = i2;
        }

        public final int getOriginalEnd() {
            return this.originalEnd;
        }

        public final void setOriginalEnd(int i2) {
            this.originalEnd = i2;
        }
    }
}
