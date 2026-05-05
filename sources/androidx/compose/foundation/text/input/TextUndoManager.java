package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.input.internal.undo.TextUndoOperation;
import androidx.compose.foundation.text.input.internal.undo.TextUndoOperationKt;
import androidx.compose.foundation.text.input.internal.undo.UndoManager;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: TextUndoManager.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njG9LeN9ZS8\u000fs{:'c$\bCCU ~(ޛeȞ\u0006\u0004\u001fJ\t\n{\u000e\"V\u0018z4OU\u0007]*\u0011HA\u001e@CYu=Gb\r<\u0015\"B\"fz3\u0004ʀ.H\u001ezCGY\u001f*0n\u0005\u0003X\u001bb\u001d\u001a@\u001a\u0005 I*j}f6v\u0001\u000e>=:\u001bipOok>\u0015e\rthW\u0011\u0005z6+nQ}!3n\u001b\u0007\u0001oo\u0007M\u000bU\u0005\u0017Aw:Wxo6\u0007\u0006JYۣS\u0011ut,c\u0013Y1\u001b54gcyVDlÞ~\u007f%>\n\u0018\u0014/\u0019[;&~\n$2#s\u0004F^\rvD\u0016y\u00107Me>s\u0002ݐӤfЂeK!P=\r\u0013\u001f6%\u0007{/it\u0010f$)dHc?SXCXP\u001aYkn2s9̦,˙4G\b\u07fcɮ\u0015K"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r*kG-\u0005q`Cn_5Jx'T\"", "", "7mXA\\(EA(z|b5~x8d\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@Ps5M\u0001p6La;L[qG}\u001dZ\u001bJ:\u0011\u000fb\u0017", "CmS<@(GO\u001b~\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@Ps5M\u0001p7UM6DN{9\u0016\u0012gc", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001q\u001f9]R\u0005o=-\u0015uj5\u000e-<Wu1\u0011;N?kB{<\u001e{e\u000e['\u001c\tcJyU@@\u001e\u00156M\u0001N2~\u0016\u001e\u0019?xp\fW\u001aW\u0003\u0014qP-rO#nyZP\u000ff3o\u001cnf`CI$!z\u0015\"2`7\t\u0006\u001d\u0001{Q\u0004OcP\u0015|81\u00141L", "1`]\u001fX+H", "", "5dc\u0010T5+S\u0018\t", "u(I", "1`]\"a+H", "5dc\u0010T5.\\\u0018\t", "\nrTA \u0006\u0017", "AsP4\\5@C\"}\u0005", "5dc g(@W\"\u0001jg+\u0007", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7\u001a7XSJ58'$hnB\u0003ju^\u007f&Q\u0016=,oabF\u0013\u001cD\u0019N8\t\u0014]K-D", "Adc g(@W\"\u0001jg+\u0007", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001q\u001f9]R\u0005o=-\u0015uj5\u000e-<Wu1\u0011;N?kB{<\u001e{e\u000e['\u001c\tcJy25", "AsP4\\5@C\"}\u0005\u001d+|\u0010/g{7{", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "1kT.e\u000fBa(\t\br", "", "4kd@[", "@dR<e+", "=o", "@dS<", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r*kG-ula@\u0006Q;J\u0006'\u001d", "CmS<", "\u0011n\\=T5B]\"", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextUndoManager {
    private final MutableState stagingUndo$delegate;
    private final UndoManager<TextUndoOperation> undoManager;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public TextUndoManager() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public TextUndoManager(TextUndoOperation textUndoOperation, UndoManager<TextUndoOperation> undoManager) {
        this.undoManager = undoManager;
        this.stagingUndo$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(textUndoOperation, null, 2, null);
    }

    public /* synthetic */ TextUndoManager(TextUndoOperation textUndoOperation, UndoManager undoManager, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i2) | ((-1) - 1)) != 0 ? null : textUndoOperation, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? new UndoManager(null, null, 100, 3, null) : undoManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final TextUndoOperation getStagingUndo() {
        return (TextUndoOperation) this.stagingUndo$delegate.getValue();
    }

    private final void setStagingUndo(TextUndoOperation textUndoOperation) {
        this.stagingUndo$delegate.setValue(textUndoOperation);
    }

    public final boolean getCanUndo() {
        return this.undoManager.getCanUndo$foundation_release() || getStagingUndo() != null;
    }

    public final boolean getCanRedo() {
        return this.undoManager.getCanRedo$foundation_release() && getStagingUndo() == null;
    }

    public final void undo(TextFieldState textFieldState) {
        if (getCanUndo()) {
            flush();
            TextUndoOperationKt.undo(textFieldState, this.undoManager.undo());
        }
    }

    public final void redo(TextFieldState textFieldState) {
        if (getCanRedo()) {
            TextUndoOperationKt.redo(textFieldState, this.undoManager.redo());
        }
    }

    public final void record(TextUndoOperation textUndoOperation) {
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            TextUndoOperation stagingUndo = getStagingUndo();
            if (stagingUndo == null) {
                setStagingUndo(textUndoOperation);
                return;
            }
            TextUndoOperation textUndoOperationMerge = TextUndoManagerKt.merge(stagingUndo, textUndoOperation);
            if (textUndoOperationMerge != null) {
                setStagingUndo(textUndoOperationMerge);
            } else {
                flush();
                setStagingUndo(textUndoOperation);
            }
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
        }
    }

    public final void clearHistory() {
        setStagingUndo(null);
        this.undoManager.clearHistory();
    }

    private final void flush() {
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            TextUndoOperation stagingUndo = getStagingUndo();
            if (stagingUndo != null) {
                this.undoManager.record(stagingUndo);
            }
            setStagingUndo(null);
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
        }
    }

    /* JADX INFO: compiled from: TextUndoManager.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eӵLcz\u0005Gّ1!Ǟr~P+Jv\b'o?0ǲiH<Rޠ.\u0011"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r*kG-\u0005q`Cn_5Jx'T\u000b,6d]nF\u0018\u001ccc", "", "u(E", "!`e2e", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: compiled from: TextUndoManager.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u0016DLc\u000b\u0004I\u0006>é6B\u0005\"4\u0012\u000e\u0007njO0LeN/ZS@\u000fsڔ:ơ[:ڎsGe\u001c\u000e\"7O^iwnx[9BO\u000b\u001cx̶0Icz&\"\u001d8ZqU2{om=n{N\u0005N3hLB\u0017\u000f\"BH>w#Cy\u0015B4NwRR;MK.b$L#\u00190lo^<Xnm:](1mRP7_^}{\f\u001dÙ)˼za&ѨÑ;?"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r*kG-\u0005q`Cn_5Jx'T\u000b,6d]nF\u0018\u001ccL<'\u001e\u0005f\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?MP\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r*kG-\u0005q`Cn_5Jx'T\"", "", "u(E", "CmS<@(GO\u001b~\bL(\u000e\t<", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@Ps5M\u0001p7UM6DN{9\u0016\u0012gc", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@Ps5M\u0001p6La;L[qG}\u001dZ\u001bJ:\u0011\u000fb\u0017", "@dbAb9>", "D`[BX", "A`e2", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?MP)i>)\u0015>", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class Saver implements androidx.compose.runtime.saveable.Saver<TextUndoManager, Object> {
            public static final int $stable;
            public static final Saver INSTANCE = new Saver();
            private static final androidx.compose.runtime.saveable.Saver<UndoManager<TextUndoOperation>, Object> undoManagerSaver;

            private Saver() {
            }

            static {
                UndoManager.Companion companion = UndoManager.Companion;
                final androidx.compose.runtime.saveable.Saver<TextUndoOperation, Object> saver = TextUndoOperation.Companion.getSaver();
                undoManagerSaver = new androidx.compose.runtime.saveable.Saver<UndoManager<TextUndoOperation>, Object>() { // from class: androidx.compose.foundation.text.input.TextUndoManager$Companion$Saver$special$$inlined$createSaver$1
                    @Override // androidx.compose.runtime.saveable.Saver
                    public Object save(SaverScope saverScope, UndoManager<TextUndoOperation> undoManager) {
                        Saver saver2 = saver;
                        List listCreateListBuilder = CollectionsKt.createListBuilder();
                        listCreateListBuilder.add(Integer.valueOf(((UndoManager) undoManager).capacity));
                        listCreateListBuilder.add(Integer.valueOf(((UndoManager) undoManager).undoStack.size()));
                        listCreateListBuilder.add(Integer.valueOf(((UndoManager) undoManager).redoStack.size()));
                        SnapshotStateList snapshotStateList = ((UndoManager) undoManager).undoStack;
                        int size = snapshotStateList.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            listCreateListBuilder.add(saver2.save(saverScope, snapshotStateList.get(i2)));
                        }
                        SnapshotStateList snapshotStateList2 = ((UndoManager) undoManager).redoStack;
                        int size2 = snapshotStateList2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            listCreateListBuilder.add(saver2.save(saverScope, snapshotStateList2.get(i3)));
                        }
                        return CollectionsKt.build(listCreateListBuilder);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // androidx.compose.runtime.saveable.Saver
                    public UndoManager<TextUndoOperation> restore(Object obj) {
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list = (List) obj;
                        int iIntValue = ((Number) list.get(0)).intValue();
                        int iIntValue2 = ((Number) list.get(1)).intValue();
                        int iIntValue3 = ((Number) list.get(2)).intValue();
                        Saver saver2 = saver;
                        List listCreateListBuilder = CollectionsKt.createListBuilder();
                        int i2 = 3;
                        while (i2 < iIntValue2 + 3) {
                            Object objRestore = saver2.restore(list.get(i2));
                            Intrinsics.checkNotNull(objRestore);
                            listCreateListBuilder.add(objRestore);
                            i2++;
                        }
                        List listBuild = CollectionsKt.build(listCreateListBuilder);
                        Saver saver3 = saver;
                        List listCreateListBuilder2 = CollectionsKt.createListBuilder();
                        while (i2 < iIntValue2 + iIntValue3 + 3) {
                            Object objRestore2 = saver3.restore(list.get(i2));
                            Intrinsics.checkNotNull(objRestore2);
                            listCreateListBuilder2.add(objRestore2);
                            i2++;
                        }
                        return new UndoManager<>(listBuild, CollectionsKt.build(listCreateListBuilder2), iIntValue);
                    }
                };
                $stable = 8;
            }

            @Override // androidx.compose.runtime.saveable.Saver
            public Object save(SaverScope saverScope, TextUndoManager textUndoManager) {
                TextUndoOperation stagingUndo = textUndoManager.getStagingUndo();
                return CollectionsKt.listOf(stagingUndo != null ? TextUndoOperation.Companion.getSaver().save(saverScope, stagingUndo) : null, undoManagerSaver.save(saverScope, textUndoManager.undoManager));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.compose.runtime.saveable.Saver
            public TextUndoManager restore(Object obj) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                Object obj3 = list.get(1);
                TextUndoOperation textUndoOperationRestore = obj2 != null ? TextUndoOperation.Companion.getSaver().restore(obj2) : null;
                androidx.compose.runtime.saveable.Saver<UndoManager<TextUndoOperation>, Object> saver = undoManagerSaver;
                Intrinsics.checkNotNull(obj3);
                UndoManager<TextUndoOperation> undoManagerRestore = saver.restore(obj3);
                Intrinsics.checkNotNull(undoManagerRestore);
                return new TextUndoManager(textUndoOperationRestore, undoManagerRestore);
            }
        }

        private Companion() {
        }
    }
}
