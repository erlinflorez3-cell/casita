package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.changelist.Operation;
import androidx.compose.runtime.changelist.Operations;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
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
/* JADX INFO: compiled from: FixupList.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яh\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0005\"4\u0012\u0006\rnj?1LeV.ZS0\u000fs{J$c$\u007fّCU }*\teNogtKb\u000bY\u000f\u000eǝ\u0001jBI]ތe\u0012%2JģG3[xE9ft>\u0005.>*8\u007f\t\t\u001a@H\u0018v\u0011CS\f\u00180F\u0081Pĥ=M3\u0019R\ţ$\u0001,\\0RDP\u0005]h8k'wLf'\u000e9-Y\u001bQl/\u001dzq A?eBC1\u0004\u0007\u0015`s?1D\"A\u0013w?'YY<[Di\u0018\u0014C4\u0018-k\u0005>\\3Z\u0011\u00145>gg[P\u0014)&\u000f,\u0011J\u0019&\u0006U^^1(} \u000ea\r;WNi\u001a^p\u001aCeD2=\u007faE\u0002)tmy;Gkg\u007f\u0013+6#/\fgo\u001dJn43T&ZQSF׀Vn*[Cl\u0012\u0012\u0013\u00068&HGFO,,<:=Nk;3!2#XFwvK\u0001xUyRvIP\u0013ގ;*\u000f1ʑHd\u0013\u0012!`f-)MJV]å\n˙$\\\u007f˓q1\u001eQgh\u0018l$έ\fɻ3f?ժ?z\u001c[Q^a:\b(ߧeV\u000f\u0016EBp\f׃ji"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u000fQVKv\u001b\"#w7", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fqo\u0018\u0007`<Pd6TPW.=\\\u007fE\u0010!i\nK2\rZ", "u(E", "=oT?T;B]\"\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fqo\u000f", ">d]1\\5@=$~\bZ;\u0001\u00138s", "Ahi2", "", "5dc \\A>", "u(8", "1kT.e", "", "1qT.g,\u001a\\\u0018b\u0004l,\n\u0018\u0018o~(", "4`RAb9R", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "7mb2e;\"\\\u0018~\u000e", "5q^Bc\bGQ\u001c\t\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iEt(?fS", "3mS\u001bb+>7\"\rzk;", "3wT0h;>/\"}[e<\u000b\f\u000bl\u0007\u0013{I\u007f\u001b IP\u0012O\u00070C", "/o_9\\,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iG\u0002,9Y\u000bu", "Ak^Af", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014'f\u0002/7zk", "@d\\2`)>`\u0001z\u0004Z.|\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-\u001fi\u001f*OCHA", "7r4:c;R", "", "7r=<g\fF^(\u0013", "Bn32U<@A(\f~g.", "", ":h]2C9>T\u001d\u0012", "CoS.g,']\u0018~", "$", "\"", "D`[BX", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u00100\u0002\u0012g", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class FixupList extends OperationsDebugStringFormattable {
    public static final int $stable = 8;
    private final Operations operations = new Operations();
    private final Operations pendingOperations = new Operations();

    public final int getSize() {
        return this.operations.getSize();
    }

    public final boolean isEmpty() {
        return this.operations.isEmpty();
    }

    public final boolean isNotEmpty() {
        return this.operations.isNotEmpty();
    }

    public final void clear() {
        this.pendingOperations.clear();
        this.operations.clear();
    }

    public final void executeAndFlushAllPendingFixups(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
        if (!this.pendingOperations.isEmpty()) {
            ComposerKt.composeImmediateRuntimeError("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        this.operations.executeAndFlushAllPendingOperations(applier, slotWriter, rememberManager);
    }

    public final void createAndInsertNode(Function0<? extends Object> function0, int i2, Anchor anchor) {
        Operations operations = this.operations;
        Operation.InsertNodeFixup insertNodeFixup = Operation.InsertNodeFixup.INSTANCE;
        operations.pushOp(insertNodeFixup);
        Operations operationsM3754constructorimpl = Operations.WriteScope.m3754constructorimpl(operations);
        Operation.InsertNodeFixup insertNodeFixup2 = Operation.InsertNodeFixup.INSTANCE;
        boolean z2 = false;
        Operations.WriteScope.m3760setObjectDKhxnng(operationsM3754constructorimpl, Operation.ObjectParameter.m3722constructorimpl(0), function0);
        Operation.InsertNodeFixup insertNodeFixup3 = Operation.InsertNodeFixup.INSTANCE;
        Operations.WriteScope.m3759setIntA6tL2VI(operationsM3754constructorimpl, Operation.IntParameter.m3711constructorimpl(0), i2);
        Operation.InsertNodeFixup insertNodeFixup4 = Operation.InsertNodeFixup.INSTANCE;
        int i3 = 1;
        Operations.WriteScope.m3760setObjectDKhxnng(operationsM3754constructorimpl, Operation.ObjectParameter.m3722constructorimpl(1), anchor);
        if (operations.pushedIntMask == operations.createExpectedArgMask(insertNodeFixup.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(insertNodeFixup.getObjects())) {
            z2 = true;
        }
        if (!z2) {
            StringBuilder sb = new StringBuilder();
            int ints = insertNodeFixup.getInts();
            int i4 = 0;
            int i5 = 0;
            while (i5 < ints) {
                int i6 = i3 << i5;
                int i7 = operations.pushedIntMask;
                if ((i6 + i7) - (i6 | i7) != 0) {
                    if (i4 > 0) {
                        sb.append(", ");
                    }
                    sb.append(insertNodeFixup.mo3683intParamNamew8GmfQM(Operation.IntParameter.m3711constructorimpl(i5)));
                    i4++;
                }
                i5++;
                i3 = 1;
            }
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb2 = new StringBuilder();
            int objects = insertNodeFixup.getObjects();
            int i8 = 0;
            for (int i9 = 0; i9 < objects; i9++) {
                if ((-1) - (((-1) - (1 << i9)) | ((-1) - operations.pushedObjectMask)) != 0) {
                    if (i4 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(insertNodeFixup.mo3684objectParamName31yXWZQ(Operation.ObjectParameter.m3722constructorimpl(i9)));
                    i8++;
                }
            }
            String string2 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
            PreconditionsKt.throwIllegalStateException("Error while pushing " + insertNodeFixup + ". Not all arguments were provided. Missing " + i4 + " int arguments (" + string + ") and " + i8 + " object arguments (" + string2 + ").");
        }
        Operations operations2 = this.pendingOperations;
        Operation.PostInsertNodeFixup postInsertNodeFixup = Operation.PostInsertNodeFixup.INSTANCE;
        operations2.pushOp(postInsertNodeFixup);
        Operations operationsM3754constructorimpl2 = Operations.WriteScope.m3754constructorimpl(operations2);
        Operation.PostInsertNodeFixup postInsertNodeFixup2 = Operation.PostInsertNodeFixup.INSTANCE;
        Operations.WriteScope.m3759setIntA6tL2VI(operationsM3754constructorimpl2, Operation.IntParameter.m3711constructorimpl(0), i2);
        Operation.PostInsertNodeFixup postInsertNodeFixup3 = Operation.PostInsertNodeFixup.INSTANCE;
        Operations.WriteScope.m3760setObjectDKhxnng(operationsM3754constructorimpl2, Operation.ObjectParameter.m3722constructorimpl(0), anchor);
        if (operations2.pushedIntMask == operations2.createExpectedArgMask(postInsertNodeFixup.getInts()) && operations2.pushedObjectMask == operations2.createExpectedArgMask(postInsertNodeFixup.getObjects())) {
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        int ints2 = postInsertNodeFixup.getInts();
        int i10 = 0;
        for (int i11 = 0; i11 < ints2; i11++) {
            if ((-1) - (((-1) - (1 << i11)) | ((-1) - operations2.pushedIntMask)) != 0) {
                if (i10 > 0) {
                    sb3.append(", ");
                }
                sb3.append(postInsertNodeFixup.mo3683intParamNamew8GmfQM(Operation.IntParameter.m3711constructorimpl(i11)));
                i10++;
            }
        }
        String string3 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(string3, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb4 = new StringBuilder();
        int objects2 = postInsertNodeFixup.getObjects();
        int i12 = 0;
        for (int i13 = 0; i13 < objects2; i13++) {
            if (((1 << i13) & operations2.pushedObjectMask) != 0) {
                if (i10 > 0) {
                    sb4.append(", ");
                }
                sb4.append(postInsertNodeFixup.mo3684objectParamName31yXWZQ(Operation.ObjectParameter.m3722constructorimpl(i13)));
                i12++;
            }
        }
        String string4 = sb4.toString();
        Intrinsics.checkNotNullExpressionValue(string4, "StringBuilder().apply(builderAction).toString()");
        PreconditionsKt.throwIllegalStateException("Error while pushing " + postInsertNodeFixup + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string3 + ") and " + i12 + " object arguments (" + string4 + ").");
    }

    public final void endNodeInsert() {
        if (!this.pendingOperations.isNotEmpty()) {
            ComposerKt.composeImmediateRuntimeError("Cannot end node insertion, there are no pending operations that can be realized.");
        }
        this.pendingOperations.popInto(this.operations);
    }

    public final <V, T> void updateNode(V v2, Function2<? super T, ? super V, Unit> function2) {
        Operations operations = this.operations;
        Operation.UpdateNode updateNode = Operation.UpdateNode.INSTANCE;
        operations.pushOp(updateNode);
        Operations operationsM3754constructorimpl = Operations.WriteScope.m3754constructorimpl(operations);
        Operation.UpdateNode updateNode2 = Operation.UpdateNode.INSTANCE;
        Operations.WriteScope.m3760setObjectDKhxnng(operationsM3754constructorimpl, Operation.ObjectParameter.m3722constructorimpl(0), v2);
        Operation.UpdateNode updateNode3 = Operation.UpdateNode.INSTANCE;
        int iM3722constructorimpl = Operation.ObjectParameter.m3722constructorimpl(1);
        Intrinsics.checkNotNull(function2, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        Operations.WriteScope.m3760setObjectDKhxnng(operationsM3754constructorimpl, iM3722constructorimpl, (Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2));
        if (operations.pushedIntMask == operations.createExpectedArgMask(updateNode.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(updateNode.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = updateNode.getInts();
        int i2 = 0;
        for (int i3 = 0; i3 < ints; i3++) {
            if (((1 << i3) & operations.pushedIntMask) != 0) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(updateNode.mo3683intParamNamew8GmfQM(Operation.IntParameter.m3711constructorimpl(i3)));
                i2++;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int objects = updateNode.getObjects();
        int i4 = 0;
        for (int i5 = 0; i5 < objects; i5++) {
            int i6 = 1 << i5;
            int i7 = operations.pushedObjectMask;
            if ((i6 + i7) - (i6 | i7) != 0) {
                if (i2 > 0) {
                    sb2.append(", ");
                }
                sb2.append(updateNode.mo3684objectParamName31yXWZQ(Operation.ObjectParameter.m3722constructorimpl(i5)));
                i4++;
            }
        }
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        PreconditionsKt.throwIllegalStateException("Error while pushing " + updateNode + ". Not all arguments were provided. Missing " + i2 + " int arguments (" + string + ") and " + i4 + " object arguments (" + string2 + ").");
    }

    @Override // androidx.compose.runtime.changelist.OperationsDebugStringFormattable
    public String toDebugString(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("FixupList instance containing " + getSize() + " operations");
        if (sb.length() > 0) {
            sb.append(":\n" + this.operations.toDebugString(str));
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
