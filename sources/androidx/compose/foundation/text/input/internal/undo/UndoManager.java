package androidx.compose.foundation.text.input.internal.undo;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&˛\bDRш|İI\u0006>)6B\u0005\"4\u0012\u0006\rnj?0LeV7ZS0\u0012s{J$c$wFCU(}*\tUTm˧\u0005Ϻx&k\u0011\fǝ\u0007i\\I\u0004x\u0016\u0011*ro\u007fK9M}>Qf\u00058\u0015 hĲf{\u0015\r *V\u0013\u000f\u0001SM\u001c\u0012fϋ\u001f<b\u0013S\u0005(\u0016\u001e>N\u0006ɉ`g\\<\u0011pkMG#1}\u000b_5tH|{!vX5#\u000faTѨË;5#<\u001c\f\u0015js?9ӊџA\u0005v@o4W\u000eo6\u000fÜЏ\u0019+]&.\u00054c\u001dQ\u000f\u0014]i&ҫMח\u0012,\u0010|\u0002\u0016J\u000e^\u00185SF-Hn>L\nπtՂDT\u001a`H\f\tk\u0007#3\u0004K+g =Ϣcޅ\u001dN?ަU\u001f,0\u0019t1]d\u000e\u0017ٽIbNΆ=ҨD=PݐZhK|\u001cp\u0011\u0007`HΥK\u0004G}\u0017>%6\bmG59q\u0012JTg-ݓ\u000fv*֢^͕D\"vݫ֜.%"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@Ps5M\u0001p7UM6DN{9\u0016\u0012gc", "\"", "", "7mXA\\(EC\"}\u0005L;x\u00075", "", "7mXA\\(E@\u0019}\u0005L;x\u00075", "1`_.V0Mg", "", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;f-wQ|`'Vs\u0015\u0006])ChS\u0004z^", "1`]\u001fX+H", "", "5dc\u0010T5+S\u0018\t9_6\r\u0012.a\u000f,\u0006Iz$\u0017No\nJv", "u(I", "1`]\"a+H", "5dc\u0010T5.\\\u0018\t9_6\r\u0012.a\u000f,\u0006Iz$\u0017No\nJv", "@dS<F;:Q\u001f", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-\u0003w]H\u0007J0\\\u0006|", "Ahi2", "5dc \\A>", "u(8", "CmS<F;:Q\u001f", "1kT.e\u000fBa(\t\br", "", "@dR<e+", "CmS<T)ESt|\nb6\u0006", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "@dS<", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "CmS<", "\u0011n\\=T5B]\"", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class UndoManager<T> {
    private final int capacity;
    private SnapshotStateList<T> redoStack;
    private SnapshotStateList<T> undoStack;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public UndoManager() {
        this(null, null, 0, 7, null);
    }

    public UndoManager(List<? extends T> list, List<? extends T> list2, int i2) {
        this.capacity = i2;
        SnapshotStateList<T> snapshotStateList = new SnapshotStateList<>();
        snapshotStateList.addAll(list);
        this.undoStack = snapshotStateList;
        SnapshotStateList<T> snapshotStateList2 = new SnapshotStateList<>();
        snapshotStateList2.addAll(list2);
        this.redoStack = snapshotStateList2;
        if (i2 < 0) {
            throw new IllegalArgumentException("Capacity must be a positive integer".toString());
        }
        if (getSize() > i2) {
            throw new IllegalArgumentException(("Initial list of undo and redo operations have a size=(" + getSize() + ") greater than the given capacity=(" + i2 + ").").toString());
        }
    }

    public /* synthetic */ UndoManager(List list, List list2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i3) | ((-1) - 1)) != 0 ? CollectionsKt.emptyList() : list, (2 & i3) != 0 ? CollectionsKt.emptyList() : list2, (i3 & 4) != 0 ? 100 : i2);
    }

    public final boolean getCanUndo$foundation_release() {
        return !this.undoStack.isEmpty();
    }

    public final boolean getCanRedo$foundation_release() {
        return !this.redoStack.isEmpty();
    }

    public final int getSize() {
        return this.undoStack.size() + this.redoStack.size();
    }

    public final void record(T t2) {
        this.redoStack.clear();
        while (getSize() > this.capacity - 1) {
            CollectionsKt.removeFirst(this.undoStack);
        }
        this.undoStack.add(t2);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final T undo() {
        if (!getCanUndo$foundation_release()) {
            throw new IllegalStateException("It's an error to call undo while there is nothing to undo. Please first check `canUndo` value before calling the `undo` function.".toString());
        }
        T t2 = (T) CollectionsKt.removeLast(this.undoStack);
        this.redoStack.add(t2);
        return t2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final T redo() {
        if (!getCanRedo$foundation_release()) {
            throw new IllegalStateException("It's an error to call redo while there is nothing to redo. Please first check `canRedo` value before calling the `redo` function.".toString());
        }
        T t2 = (T) CollectionsKt.removeLast(this.redoStack);
        this.undoStack.add(t2);
        return t2;
    }

    public final void clearHistory() {
        this.undoStack.clear();
        this.redoStack.clear();
    }

    /* JADX INFO: compiled from: UndoManager.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012}\blʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$:xIV2\u00102\u0011_Twi~J!\u000fq\u0012\u0016\u0018\tjZH\u0004z}\u0016\u00151PsU2}\u007fK>x\u0001F\u000702h<\n\u0007\u0011\u001aXG>xAŖQñ\u00166"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@Ps5M\u0001p7UM6DN{9\u0016\u0012gL,5\u0015\u0010UJ(xM\r", "", "u(E", "1qT.g,,O*~\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?MP\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@Ps5M\u0001p7UM6DN{9\u0016\u0012gc", "\"", "7sT:F(OS&", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ <T> Saver<UndoManager<T>, Object> createSaver(final Saver<T, Object> saver) {
            Intrinsics.needClassReification();
            return new Saver<UndoManager<T>, Object>() { // from class: androidx.compose.foundation.text.input.internal.undo.UndoManager$Companion$createSaver$1
                @Override // androidx.compose.runtime.saveable.Saver
                public Object save(SaverScope saverScope, UndoManager<T> undoManager) {
                    Saver<T, Object> saver2 = saver;
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

                @Override // androidx.compose.runtime.saveable.Saver
                public UndoManager<T> restore(Object obj) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                    List list = (List) obj;
                    int iIntValue = ((Number) list.get(0)).intValue();
                    int iIntValue2 = ((Number) list.get(1)).intValue();
                    int iIntValue3 = ((Number) list.get(2)).intValue();
                    Saver<T, Object> saver2 = saver;
                    List listCreateListBuilder = CollectionsKt.createListBuilder();
                    int i2 = 3;
                    while (i2 < iIntValue2 + 3) {
                        T tRestore = saver2.restore(list.get(i2));
                        Intrinsics.checkNotNull(tRestore);
                        listCreateListBuilder.add(tRestore);
                        i2++;
                    }
                    List listBuild = CollectionsKt.build(listCreateListBuilder);
                    Saver<T, Object> saver3 = saver;
                    List listCreateListBuilder2 = CollectionsKt.createListBuilder();
                    while (i2 < iIntValue2 + iIntValue3 + 3) {
                        T tRestore2 = saver3.restore(list.get(i2));
                        Intrinsics.checkNotNull(tRestore2);
                        listCreateListBuilder2.add(tRestore2);
                        i2++;
                    }
                    return new UndoManager<>(listBuild, CollectionsKt.build(listCreateListBuilder2), iIntValue);
                }
            };
        }
    }
}
