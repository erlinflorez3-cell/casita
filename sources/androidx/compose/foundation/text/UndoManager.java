package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.TextFieldValue;
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
/* JADX INFO: compiled from: UndoManager.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4B\u0007\":\u001b\u007fјnjG7LeN0ZS@\u000fs{:$c$\u007fCCU }*\teNogtO`ŏYƤ6\u0016'idHl9j\"\u00158B}?KM\u001e>˃dtD\u0007h60;\u0012\u0005/(rT\u001e\u0006\u0013Cy\u001aB4N\u0001RR;^M  \u0018V\"\u0017\u001d\u000bx\u0017<V\u007fu:]1Ii\u000bd5sH|{\u001bvX5\u001d\u000faL<p=;\u00153h\u001b\u0007\u0001a\b\tM\bU\u0007~&U<\u001a\u007fe9p\u007fB\u0019\u0002̀\u0019ǁv&dӤ\"p\u001a,CQyJ~\u0014~¾\u0007ԫ\u0011>\f\u000e\u0014.\u0019=;\u001a~\b<4ϢvYHА\u001a`H\b\tj\u0007%3\nK-O\u001a\u0015\\8ݥ%\u05ee;{\rټn/\u000fz9[\u0003\u000f7ڀ'ƻ{Q9҅\u0011KV[\"[Sl2{9̦6˙4G\b\u07fcɮ\u0015F"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri'v\u001585?Dg6\u001e\">", "", ";`g g6KS\u0018\\}Z9x\u0007>e\r6", "", "uH\u0018#", "4na0X\u0015>f(l\u0004Z7\u000b\f9t", "", ":`bAF5:^'\u0002\u0005m", "", "\u001aiPCTuEO\"\u0001DE6\u0006\u000b\u0005", "5dc\u001aT?,b#\fz]\n\u007f\u0005<a}7{M\u000f", "u(8", "@dS<F;:Q\u001f", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri'v\u001585?Dg6\u001e\"'AB\u0016p@$", "As^?X+\u001cV\u0015\fv\\;|\u0016=", "CmS<F;:Q\u001f", "", ";`Z2F5:^'\u0002\u0005m", "D`[BX", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#l J|v2MJ:\\0%%h7", "@dS<", "@d\\<i,%O'\u000ejg+\u0007", "AmP=f/Hb|\u007fc^,{\t.", "<nf", "CmS<", "\u0013mc?l", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class UndoManager {
    public static final int $stable = 8;
    private boolean forceNextSnapshot;
    private Long lastSnapshot;
    private final int maxStoredCharacters;
    private Entry redoStack;
    private int storedCharacters;
    private Entry undoStack;

    public UndoManager() {
        this(0, 1, null);
    }

    public UndoManager(int i2) {
        this.maxStoredCharacters = i2;
    }

    public /* synthetic */ UndoManager(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 + 1) - (i3 | 1) != 0 ? 100000 : i2);
    }

    public final int getMaxStoredCharacters() {
        return this.maxStoredCharacters;
    }

    /* JADX INFO: compiled from: UndoManager.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005*2\u0012\u000eј\u0017jg/\u0005|X6XS8\u000f\u0004}J#\nҕ\u0002GIV2}P\u000bҊRguq\u001bt\u0019C'\b,w\u0019ߚ ǈ\u0005ٕ\u0016\u001b:ԏ\bA9Q}BYbz<\u0013'\u0003:Fz\u001d\u0001H,\u001fƼ\u0003ټGW\u0014۵HBvB`\u0016m\u0007 \u001c\u0014Iő\u0005*"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri'v\u001585?Dg6\u001e\"'AB\u0016p@$", "", "<dgA", "D`[BX", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#l J|v2MJ:\\0%%h7", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001]\u001f-W+7t0 \u0015u \u0019\u0010r9bL\u000eCUM9fVqP]\u0010d\u0016Y5\u001b\u0005#Q(8S72\u0017uM\u000bFx\u0010U\u0005\u000eHyQFV\u0017Fj\u0011|Q)>\nJ", "5dc\u001bX?M", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7\u00067LM#g=\u001a\u0017hnwfl;[\u000b|", "Adc\u001bX?M", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001]\u001f-W+7t0 \u0015u \u0019\u0010r9bLj8", "5dc#T3NS", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006z.@i\ri&m)=.G;r3\u000f\u0011oq9\\", "Adc#T3NS", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W@\u007f0EhG\u000f7\u0001%\u000fQCBj%\u001a\u001cxa\u000fJT", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class Entry {
        private Entry next;
        private TextFieldValue value;

        public Entry(Entry entry, TextFieldValue textFieldValue) {
            this.next = entry;
            this.value = textFieldValue;
        }

        public /* synthetic */ Entry(Entry entry, TextFieldValue textFieldValue, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 + 1) - (i2 | 1) != 0 ? null : entry, textFieldValue);
        }

        public final Entry getNext() {
            return this.next;
        }

        public final void setNext(Entry entry) {
            this.next = entry;
        }

        public final TextFieldValue getValue() {
            return this.value;
        }

        public final void setValue(TextFieldValue textFieldValue) {
            this.value = textFieldValue;
        }
    }

    public static /* synthetic */ void snapshotIfNeeded$default(UndoManager undoManager, TextFieldValue textFieldValue, long j2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            j2 = UndoManager_jvmKt.timeNowMillis();
        }
        undoManager.snapshotIfNeeded(textFieldValue, j2);
    }

    public final void snapshotIfNeeded(TextFieldValue textFieldValue, long j2) {
        if (!this.forceNextSnapshot) {
            Long l2 = this.lastSnapshot;
            if (j2 <= (l2 != null ? l2.longValue() : 0L) + ((long) UndoManagerKt.getSNAPSHOTS_INTERVAL_MILLIS())) {
                return;
            }
        }
        this.lastSnapshot = Long.valueOf(j2);
        makeSnapshot(textFieldValue);
    }

    public final void forceNextSnapshot() {
        this.forceNextSnapshot = true;
    }

    public final void makeSnapshot(TextFieldValue textFieldValue) {
        TextFieldValue value;
        this.forceNextSnapshot = false;
        Entry entry = this.undoStack;
        if (Intrinsics.areEqual(textFieldValue, entry != null ? entry.getValue() : null)) {
            return;
        }
        String text = textFieldValue.getText();
        Entry entry2 = this.undoStack;
        if (Intrinsics.areEqual(text, (entry2 == null || (value = entry2.getValue()) == null) ? null : value.getText())) {
            Entry entry3 = this.undoStack;
            if (entry3 == null) {
                return;
            }
            entry3.setValue(textFieldValue);
            return;
        }
        this.undoStack = new Entry(this.undoStack, textFieldValue);
        this.redoStack = null;
        int length = this.storedCharacters + textFieldValue.getText().length();
        this.storedCharacters = length;
        if (length > this.maxStoredCharacters) {
            removeLastUndo();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void removeLastUndo() {
        /*
            r3 = this;
            androidx.compose.foundation.text.UndoManager$Entry r2 = r3.undoStack
            r1 = 0
            if (r2 == 0) goto Lc
            androidx.compose.foundation.text.UndoManager$Entry r0 = r2.getNext()
        L9:
            if (r0 != 0) goto Le
            return
        Lc:
            r0 = r1
            goto L9
        Le:
            if (r2 == 0) goto L21
            androidx.compose.foundation.text.UndoManager$Entry r0 = r2.getNext()
            if (r0 == 0) goto L21
            androidx.compose.foundation.text.UndoManager$Entry r0 = r0.getNext()
        L1a:
            if (r0 == 0) goto L23
            androidx.compose.foundation.text.UndoManager$Entry r2 = r2.getNext()
            goto Le
        L21:
            r0 = r1
            goto L1a
        L23:
            if (r2 != 0) goto L26
        L25:
            return
        L26:
            r2.setNext(r1)
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.UndoManager.removeLastUndo():void");
    }

    public final TextFieldValue undo() {
        Entry next;
        Entry entry = this.undoStack;
        if (entry == null || (next = entry.getNext()) == null) {
            return null;
        }
        this.undoStack = next;
        this.storedCharacters -= entry.getValue().getText().length();
        this.redoStack = new Entry(this.redoStack, entry.getValue());
        return next.getValue();
    }

    public final TextFieldValue redo() {
        Entry entry = this.redoStack;
        if (entry == null) {
            return null;
        }
        this.redoStack = entry.getNext();
        this.undoStack = new Entry(this.undoStack, entry.getValue());
        this.storedCharacters += entry.getValue().getText().length();
        return entry.getValue();
    }
}
