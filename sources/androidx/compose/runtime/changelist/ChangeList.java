package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.changelist.Operation;
import androidx.compose.runtime.changelist.Operations;
import androidx.compose.runtime.internal.IntRef;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
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
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipMessage(CodedInputStream.java:305)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:251)
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
/* JADX INFO: compiled from: ChangeList.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯŁ\u0014D57\u001eq\u007fZDkt\nA\u000e0!.Jչ*, }\u000ffp:8DsH6RY*\u0017k\u00124,Ӌ,qY;]ڼ\u0006\"\u001fOVʴonXc\u0013C\u0015\t\u001ex\u0001,Qǁ\u0001] Ɓ:Bu?;M}[Aś|6\u001b :\">y\r\u00010*PƵ~zYK\u0014۵8@\u0007:Z\rS\b\"\u0012\u0014M(\u0001$]oNLHt]P/+\u0003oHV'u0\u0005ձ\u0015Fj'\u0015vg!3@M5\u001d%Y\u0003\u000fRq?\u000b?wB\rh='3Iy_>X\u0016\u0014\u001d+e\rer,`\rQn\u0018/+UcQִ$ߊ(z*\f|\u0007؝\n'V.u\u001et\u000f&3#z\u001c`^\u000bvB.\u0003\u0012>%/\u00187;9!g\u007flk\u001d\\C\u0014\u0005;+S\u0005|/sT<o]\u001fb\bi1\u007fQ\u0006L\\\u001cq=\u001c\u00159n\u0010=\u001c0u\b_\u007f\u001fB/%e_\u00029/\u0001\u001aHro'\tn~ki\u0001_p(|.O,\u001f\u000b\t]-!yjlXZ\u0019}(b\"\u0016\u0010#$lyR S)|k\u0019mxju\nSM/]g\u000e\u0004\u000e\u0006A\u000f9Cq{\u0012wQ%5o@p'pfpv<^jL:2v\u0010@{\njf\fAW\bu*[D1Gd]\\\u0011FZA+\u0011\u0010^v9\u0017TaB3m2\u000b!\u0001~s9\tu#a,+hR9OlM!6Y2jJ{Q -\u001fõKgZs\u0015\r$#m{N\u001eJI_]U\u001f\u001f\u0001920]UN\u0003e\u007fU@V+\u0001\b@Sh\\\u0018Pn~^xjxW\u001d\u001b0*vrQ\u0010-\f\b\u0016^zuk\u0005\u000fiTar1p\u0005RF2\u001d\u001fL-I\b03M-q/M\u001a\u0006KG\u0015\u0010Ӡ\u001aw4yp,>v{\u0003Z\u0002^\u0004p\nu2i@y]\rT:$\u001b\u001arLx\u001c B7mUOVy|p\u0005@}\u000f=\u0014~\u0007Z$!Zi^+o,m^c8.[}B\u001a\f1\u001f\nkg\u001cu{`\u0019\b'\n9\u007fy\u000b ZU \u0005_\u0013\r>,\f\u0018dEkf\u0013`!$b0l\f\u0019\u0003li4\u0014C\u001cT '\u0017`J$?d?lx\u000b\u0018x\tngx!X$/\u0013A`\u00115_*6Rbr{2/[M\r)\u0003g~\u0015isHb~3(\u0007\tSYk\na\u0002d\fw-{3\b\ff\u001c-!P`39\u007f\u0015(z>(#U\u0013V-\t 1jNP1/\u0005\u000bYT\u0010\u001f\r)O!w\u0011y\u0015R\u0006\u0005[\u001a/\u001f\r5\u0015Z\u0015ct#]\nClUI\u0019\u0018o\u001ae#S}6(P-\u0012\r9^m\r\u0015#\u000e\u001fH,\n\u0016\u0011\u00199\u0017^p\u001c.xx;\u0018<YNO0;2\u0019l,\u0004y7?UD5BP\u001f\u0001x8k\retΩ\u0019W\u00073\\x|\u0003\u0001!\u0017?e.Y.\u000bU\u001f*8o!\u0002$\u0015lsF\nr)V%sj\u0001k}c;\u0003Խo*g\nëV\u001e\fxB\f\u0012\u0005l(CC\u0007SL|!^\u0003A\u0006'\u000fn65\r\fW\u0018E\u000bV:)\u0013bN#\"rnO\u0019M_UUnc\u001cEw.Q7`\u001d39H\n\u001eA?\u001f\u0011\u0019zt.\nr\r\u0001`\u007f,[&\u001bQj3g%\u0006d1(\"Ԛ:ܥ\f,\u0019Àa>h;8>\u000b\u001eR\u007fǾ7E1\u0013\u0007\u001aF\f˸\u000bz"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\fP?Dm4\u0005\u0019vp\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fqo\u0018\u0007`<Pd6TPW.=\\\u007fE\u0010!i\nK2\rZ", "u(E", "=oT?T;B]\"\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fqo\u000f", "Ahi2", "", "5dc \\A>", "u(8", "1kT.e", "", "3wT0h;>/\"}[e<\u000b\f\u000bl\u0007\u0013{I\u007f\u001b IM\u00118\u007f'5g", "/o_9\\,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iG\u0002,9Y\u000bu", "Ak^Af", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014'f\u0002/7zk", "@d\\2`)>`\u0001z\u0004Z.|\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-\u001fi\u001f*OCHA", "7r4:c;R", "", "7r=<g\fF^(\u0013", ">tb54+OO\"|zL3\u0007\u0018=B\u0014", "2hbAT5<S", ">tb547IS\"}kZ3\r\t", "/mR5b9", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iEt(?fS", "D`[BX", "", ">tb566Ig\u0002\ty^:k\u0013\u0018e\u0012\u0004\u0005>\u0004!$.y\f8\u0006)?b", "<nS2f", "", "3eU2V;Bd\u0019g\u0005],`\u0012.e\u0013", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u0012E\u0006%Bby'\u0001Q\u001f=:C<A", ">tb566Ig\u0007\u0006\u0005m\u001bx\u00066en2WI~\u001a!TV\u0018:r49c\u0007", "@db<_=>R\u0007\u000evm,", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uF\b!2`}}Av%.VR)z0-\u0015>", ">`a2a;\u001c]\"\u000ezq;", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\fWLJkG-j", "4q^:", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uF\b!2`}}Av%.VR)z0-\u0015Ua:\u0007p,Wt'\u001d", "Bn", ">tb57,:Q(\u0003\fZ;|f?r\r(\u0005Ob$!Wz", ">tb57,MS&\u0007~g,d\u0013@a|/{\u001e\u000b &Gx\u001d%\u0001$5=\u0007\u001f7\u0001", "3eU2V;Bd\u0019g\u0005],`\u0012.e\u0013\u0012\fO", ">tb576P\\'", "", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004q", ">tb585=1#\u0007\u0006h:\u0001\u00183o\t\u0016yJ\f\u0017", "/bc6b5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\u0004", "1n\\=b:Bb\u001d\t\u0004", ">tb585=1)\f\b^5\fj<o\u00103", ">tb585=;#\u0010v[3|f9n\u000f(\u0005Ok\u001e\u0013Eo\u0016<\u007f4", ">tb585Lc&~\\k6\r\u0014\u001dt{5\u000b@\u007f", ">tb585Lc&~gh6\fv>a\r7{?", ">tb58?>Q)\u000ezH7|\u0016+t\u00042\u0005Nd ", "1gP;Z,%W'\u000e", ">tb5<5LS&\u000ehe6\f\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014$Uz'7C", "4hgBc:", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u000fQVKv\u001b\"#w7", ">tb5@6OSv\u000f\bk,\u0006\u0018\u0011r\n8\u0007", "=eU@X;", ">tb5@6OS\u0002\ty^", "1nd;g", ">tb5E,ES\u0015\rzF6\u000e\u0005,l\u007f\n\tJ\u0011\"rVM\u001eI\u0004%>h", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF\u007f4Bc\u0005'7ls8UNEy8-\u0019rj\u000f", "@dU2e,GQ\u0019", ">tb5E,FS!{zk", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-!j$.ZT;x\n", ">tb5E,F]*~Xn9\n\t8ta5\u0006P\f", ">tb5E,F]*~ch+|", "@d\\<i,\u001f`#\u0007", ";ne266N\\(", ">tb5E,LS(l\u0002h;\u000b", ">tb5F0=Sx\u007f{^*\f", "3eU2V;", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", ">tb5F2B^\b\tZg+f\n\ru\r5{I\u0010x$Q\u007f\u0019", ">tb5G9B[\nz\u0002n,\u000b", ">tb5H7=O(~Vg*\u007f\u0013<e~\u0019wG\u0011\u0017", "5q^Bc\u001aE](b\u0004],\u0010", ">tb5H7=O(~Vn?[\u0005>a", "2`c.", ">tb5H7=O(~ch+|", "\"", "$", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u00100\u0002\u0012g", ">tb5H7=O(~kZ3\r\t", ">tb5H7L", ">tb5H:><#}z", "<nS2", "Bn32U<@A(\f~g.", "", ":h]2C9>T\u001d\u0012", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ChangeList extends OperationsDebugStringFormattable {
    public static final int $stable = 8;
    private final Operations operations = new Operations();

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
        this.operations.clear();
    }

    public final void executeAndFlushAllPendingChanges(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
        this.operations.executeAndFlushAllPendingOperations(applier, slotWriter, rememberManager);
    }

    public final void pushRemember(RememberObserver rememberObserver) {
        Operations operations = this.operations;
        Operation.Remember remember = Operation.Remember.INSTANCE;
        operations.pushOp(remember);
        Operations operationsM3754constructorimpl = Operations.WriteScope.m3754constructorimpl(operations);
        Operation.Remember remember2 = Operation.Remember.INSTANCE;
        Operations.WriteScope.m3760setObjectDKhxnng(operationsM3754constructorimpl, Operation.ObjectParameter.m3722constructorimpl(0), rememberObserver);
        if (operations.pushedIntMask == operations.createExpectedArgMask(remember.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(remember.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = remember.getInts();
        int i2 = 0;
        for (int i3 = 0; i3 < ints; i3++) {
            if ((-1) - (((-1) - (1 << i3)) | ((-1) - operations.pushedIntMask)) != 0) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(remember.mo3683intParamNamew8GmfQM(Operation.IntParameter.m3711constructorimpl(i3)));
                i2++;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int objects = remember.getObjects();
        int i4 = 0;
        for (int i5 = 0; i5 < objects; i5++) {
            int i6 = 1 << i5;
            int i7 = operations.pushedObjectMask;
            if ((i6 + i7) - (i6 | i7) != 0) {
                if (i2 > 0) {
                    sb2.append(", ");
                }
                sb2.append(remember.mo3684objectParamName31yXWZQ(Operation.ObjectParameter.m3722constructorimpl(i5)));
                i4++;
            }
        }
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        PreconditionsKt.throwIllegalStateException("Error while pushing " + remember + ". Not all arguments were provided. Missing " + i2 + " int arguments (" + string + ") and " + i4 + " object arguments (" + string2 + ").");
    }

    public final void pushUpdateValue(Object obj, int i2) {
        Operations operations = this.operations;
        Operation.UpdateValue updateValue = Operation.UpdateValue.INSTANCE;
        operations.pushOp(updateValue);
        Operations operationsM3754constructorimpl = Operations.WriteScope.m3754constructorimpl(operations);
        Operation.UpdateValue updateValue2 = Operation.UpdateValue.INSTANCE;
        Operations.WriteScope.m3760setObjectDKhxnng(operationsM3754constructorimpl, Operation.ObjectParameter.m3722constructorimpl(0), obj);
        Operation.UpdateValue updateValue3 = Operation.UpdateValue.INSTANCE;
        Operations.WriteScope.m3759setIntA6tL2VI(operationsM3754constructorimpl, Operation.IntParameter.m3711constructorimpl(0), i2);
        if (operations.pushedIntMask == operations.createExpectedArgMask(updateValue.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(updateValue.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = updateValue.getInts();
        int i3 = 0;
        for (int i4 = 0; i4 < ints; i4++) {
            if ((-1) - (((-1) - (1 << i4)) | ((-1) - operations.pushedIntMask)) != 0) {
                if (i3 > 0) {
                    sb.append(", ");
                }
                sb.append(updateValue.mo3683intParamNamew8GmfQM(Operation.IntParameter.m3711constructorimpl(i4)));
                i3++;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int objects = updateValue.getObjects();
        int i5 = 0;
        for (int i6 = 0; i6 < objects; i6++) {
            int i7 = 1 << i6;
            int i8 = operations.pushedObjectMask;
            if ((i7 + i8) - (i7 | i8) != 0) {
                if (i3 > 0) {
                    sb2.append(", ");
                }
                sb2.append(updateValue.mo3684objectParamName31yXWZQ(Operation.ObjectParameter.m3722constructorimpl(i6)));
                i5++;
            }
        }
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        PreconditionsKt.throwIllegalStateException("Error while pushing " + updateValue + ". Not all arguments were provided. Missing " + i3 + " int arguments (" + string + ") and " + i5 + " object arguments (" + string2 + ").");
    }

    public final void pushUpdateAnchoredValue(Object obj, Anchor anchor, int i2) {
        Operations operations = this.operations;
        Operation.UpdateAnchoredValue updateAnchoredValue = Operation.UpdateAnchoredValue.INSTANCE;
        operations.pushOp(updateAnchoredValue);
        Operations operationsM3754constructorimpl = Operations.WriteScope.m3754constructorimpl(operations);
        Operation.UpdateAnchoredValue updateAnchoredValue2 = Operation.UpdateAnchoredValue.INSTANCE;
        Operations.WriteScope.m3760setObjectDKhxnng(operationsM3754constructorimpl, Operation.ObjectParameter.m3722constructorimpl(0), obj);
        Operation.UpdateAnchoredValue updateAnchoredValue3 = Operation.UpdateAnchoredValue.INSTANCE;
        Operations.WriteScope.m3760setObjectDKhxnng(operationsM3754constructorimpl, Operation.ObjectParameter.m3722constructorimpl(1), anchor);
        Operation.UpdateAnchoredValue updateAnchoredValue4 = Operation.UpdateAnchoredValue.INSTANCE;
        Operations.WriteScope.m3759setIntA6tL2VI(operationsM3754constructorimpl, Operation.IntParameter.m3711constructorimpl(0), i2);
        if (operations.pushedIntMask == operations.createExpectedArgMask(updateAnchoredValue.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(updateAnchoredValue.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = updateAnchoredValue.getInts();
        int i3 = 0;
        for (int i4 = 0; i4 < ints; i4++) {
            int i5 = 1 << i4;
            int i6 = operations.pushedIntMask;
            if ((i5 + i6) - (i5 | i6) != 0) {
                if (i3 > 0) {
                    sb.append(", ");
                }
                sb.append(updateAnchoredValue.mo3683intParamNamew8GmfQM(Operation.IntParameter.m3711constructorimpl(i4)));
                i3++;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int objects = updateAnchoredValue.getObjects();
        int i7 = 0;
        for (int i8 = 0; i8 < objects; i8++) {
            int i9 = 1 << i8;
            int i10 = operations.pushedObjectMask;
            if ((i9 + i10) - (i9 | i10) != 0) {
                if (i3 > 0) {
                    sb2.append(", ");
                }
                sb2.append(updateAnchoredValue.mo3684objectParamName31yXWZQ(Operation.ObjectParameter.m3722constructorimpl(i8)));
                i7++;
            }
        }
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        PreconditionsKt.throwIllegalStateException("Error while pushing " + updateAnchoredValue + ". Not all arguments were provided. Missing " + i3 + " int arguments (" + string + ") and " + i7 + " object arguments (" + string2 + ").");
    }

    public final void pushAppendValue(Anchor anchor, Object obj) {
        Operations operations = this.operations;
        Operation.AppendValue appendValue = Operation.AppendValue.INSTANCE;
        operations.pushOp(appendValue);
        Operations operationsM3754constructorimpl = Operations.WriteScope.m3754constructorimpl(operations);
        Operation.AppendValue appendValue2 = Operation.AppendValue.INSTANCE;
        Operations.WriteScope.m3760setObjectDKhxnng(operationsM3754constructorimpl, Operation.ObjectParameter.m3722constructorimpl(0), anchor);
        Operation.AppendValue appendValue3 = Operation.AppendValue.INSTANCE;
        Operations.WriteScope.m3760setObjectDKhxnng(operationsM3754constructorimpl, Operation.ObjectParameter.m3722constructorimpl(1), obj);
        if (operations.pushedIntMask == operations.createExpectedArgMask(appendValue.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(appendValue.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = appendValue.getInts();
        int i2 = 0;
        for (int i3 = 0; i3 < ints; i3++) {
            if ((-1) - (((-1) - (1 << i3)) | ((-1) - operations.pushedIntMask)) != 0) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(appendValue.mo3683intParamNamew8GmfQM(Operation.IntParameter.m3711constructorimpl(i3)));
                i2++;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int objects = appendValue.getObjects();
        int i4 = 0;
        for (int i5 = 0; i5 < objects; i5++) {
            if (((1 << i5) & operations.pushedObjectMask) != 0) {
                if (i2 > 0) {
                    sb2.append(", ");
                }
                sb2.append(appendValue.mo3684objectParamName31yXWZQ(Operation.ObjectParameter.m3722constructorimpl(i5)));
                i4++;
            }
        }
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        PreconditionsKt.throwIllegalStateException("Error while pushing " + appendValue + ". Not all arguments were provided. Missing " + i2 + " int arguments (" + string + ") and " + i4 + " object arguments (" + string2 + ").");
    }

    public final void pushTrimValues(int i2) {
        Operations operations = this.operations;
        Operation.TrimParentValues trimParentValues = Operation.TrimParentValues.INSTANCE;
        operations.pushOp(trimParentValues);
        Operations operationsM3754constructorimpl = Operations.WriteScope.m3754constructorimpl(operations);
        Operation.TrimParentValues trimParentValues2 = Operation.TrimParentValues.INSTANCE;
        Operations.WriteScope.m3759setIntA6tL2VI(operationsM3754constructorimpl, Operation.IntParameter.m3711constructorimpl(0), i2);
        if (operations.pushedIntMask == operations.createExpectedArgMask(trimParentValues.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(trimParentValues.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = trimParentValues.getInts();
        int i3 = 0;
        for (int i4 = 0; i4 < ints; i4++) {
            if (((1 << i4) & operations.pushedIntMask) != 0) {
                if (i3 > 0) {
                    sb.append(", ");
                }
                sb.append(trimParentValues.mo3683intParamNamew8GmfQM(Operation.IntParameter.m3711constructorimpl(i4)));
                i3++;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int objects = trimParentValues.getObjects();
        int i5 = 0;
        for (int i6 = 0; i6 < objects; i6++) {
            if (((1 << i6) & operations.pushedObjectMask) != 0) {
                if (i3 > 0) {
                    sb2.append(", ");
                }
                sb2.append(trimParentValues.mo3684objectParamName31yXWZQ(Operation.ObjectParameter.m3722constructorimpl(i6)));
                i5++;
            }
        }
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        PreconditionsKt.throwIllegalStateException("Error while pushing " + trimParentValues + ". Not all arguments were provided. Missing " + i3 + " int arguments (" + string + ") and " + i5 + " object arguments (" + string2 + ").");
    }

    public final void pushResetSlots() {
        this.operations.push(Operation.ResetSlots.INSTANCE);
    }

    public final void pushDeactivateCurrentGroup() {
        this.operations.push(Operation.DeactivateCurrentGroup.INSTANCE);
    }

    public final void pushUpdateAuxData(Object obj) {
        Operations operations = this.operations;
        Operation.UpdateAuxData updateAuxData = Operation.UpdateAuxData.INSTANCE;
        operations.pushOp(updateAuxData);
        Operations operationsM3754constructorimpl = Operations.WriteScope.m3754constructorimpl(operations);
        Operation.UpdateAuxData updateAuxData2 = Operation.UpdateAuxData.INSTANCE;
        Operations.WriteScope.m3760setObjectDKhxnng(operationsM3754constructorimpl, Operation.ObjectParameter.m3722constructorimpl(0), obj);
        if (operations.pushedIntMask == operations.createExpectedArgMask(updateAuxData.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(updateAuxData.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = updateAuxData.getInts();
        int i2 = 0;
        for (int i3 = 0; i3 < ints; i3++) {
            if (((1 << i3) & operations.pushedIntMask) != 0) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(updateAuxData.mo3683intParamNamew8GmfQM(Operation.IntParameter.m3711constructorimpl(i3)));
                i2++;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int objects = updateAuxData.getObjects();
        int i4 = 0;
        for (int i5 = 0; i5 < objects; i5++) {
            if (((1 << i5) & operations.pushedObjectMask) != 0) {
                if (i2 > 0) {
                    sb2.append(", ");
                }
                sb2.append(updateAuxData.mo3684objectParamName31yXWZQ(Operation.ObjectParameter.m3722constructorimpl(i5)));
                i4++;
            }
        }
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        PreconditionsKt.throwIllegalStateException("Error while pushing " + updateAuxData + ". Not all arguments were provided. Missing " + i2 + " int arguments (" + string + ") and " + i4 + " object arguments (" + string2 + ").");
    }

    public final void pushEnsureRootStarted() {
        this.operations.push(Operation.EnsureRootGroupStarted.INSTANCE);
    }

    public final void pushEnsureGroupStarted(Anchor anchor) {
        Operations operations = this.operations;
        Operation.EnsureGroupStarted ensureGroupStarted = Operation.EnsureGroupStarted.INSTANCE;
        operations.pushOp(ensureGroupStarted);
        Operations operationsM3754constructorimpl = Operations.WriteScope.m3754constructorimpl(operations);
        Operation.EnsureGroupStarted ensureGroupStarted2 = Operation.EnsureGroupStarted.INSTANCE;
        Operations.WriteScope.m3760setObjectDKhxnng(operationsM3754constructorimpl, Operation.ObjectParameter.m3722constructorimpl(0), anchor);
        if (operations.pushedIntMask == operations.createExpectedArgMask(ensureGroupStarted.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(ensureGroupStarted.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = ensureGroupStarted.getInts();
        int i2 = 0;
        for (int i3 = 0; i3 < ints; i3++) {
            if ((-1) - (((-1) - (1 << i3)) | ((-1) - operations.pushedIntMask)) != 0) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(ensureGroupStarted.mo3683intParamNamew8GmfQM(Operation.IntParameter.m3711constructorimpl(i3)));
                i2++;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int objects = ensureGroupStarted.getObjects();
        int i4 = 0;
        for (int i5 = 0; i5 < objects; i5++) {
            if ((-1) - (((-1) - (1 << i5)) | ((-1) - operations.pushedObjectMask)) != 0) {
                if (i2 > 0) {
                    sb2.append(", ");
                }
                sb2.append(ensureGroupStarted.mo3684objectParamName31yXWZQ(Operation.ObjectParameter.m3722constructorimpl(i5)));
                i4++;
            }
        }
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        PreconditionsKt.throwIllegalStateException("Error while pushing " + ensureGroupStarted + ". Not all arguments were provided. Missing " + i2 + " int arguments (" + string + ") and " + i4 + " object arguments (" + string2 + ").");
    }

    public final void pushEndCurrentGroup() {
        this.operations.push(Operation.EndCurrentGroup.INSTANCE);
    }

    public final void pushSkipToEndOfCurrentGroup() {
        this.operations.push(Operation.SkipToEndOfCurrentGroup.INSTANCE);
    }

    public final void pushRemoveCurrentGroup() {
        this.operations.push(Operation.RemoveCurrentGroup.INSTANCE);
    }

    public final void pushInsertSlots(Anchor anchor, SlotTable slotTable) {
        Operations operations = this.operations;
        Operation.InsertSlots insertSlots = Operation.InsertSlots.INSTANCE;
        operations.pushOp(insertSlots);
        Operations operationsM3754constructorimpl = Operations.WriteScope.m3754constructorimpl(operations);
        Operation.InsertSlots insertSlots2 = Operation.InsertSlots.INSTANCE;
        Operations.WriteScope.m3760setObjectDKhxnng(operationsM3754constructorimpl, Operation.ObjectParameter.m3722constructorimpl(0), anchor);
        Operation.InsertSlots insertSlots3 = Operation.InsertSlots.INSTANCE;
        Operations.WriteScope.m3760setObjectDKhxnng(operationsM3754constructorimpl, Operation.ObjectParameter.m3722constructorimpl(1), slotTable);
        if (operations.pushedIntMask == operations.createExpectedArgMask(insertSlots.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(insertSlots.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = insertSlots.getInts();
        int i2 = 0;
        for (int i3 = 0; i3 < ints; i3++) {
            if ((-1) - (((-1) - (1 << i3)) | ((-1) - operations.pushedIntMask)) != 0) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(insertSlots.mo3683intParamNamew8GmfQM(Operation.IntParameter.m3711constructorimpl(i3)));
                i2++;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int objects = insertSlots.getObjects();
        int i4 = 0;
        for (int i5 = 0; i5 < objects; i5++) {
            if (((1 << i5) & operations.pushedObjectMask) != 0) {
                if (i2 > 0) {
                    sb2.append(", ");
                }
                sb2.append(insertSlots.mo3684objectParamName31yXWZQ(Operation.ObjectParameter.m3722constructorimpl(i5)));
                i4++;
            }
        }
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        PreconditionsKt.throwIllegalStateException("Error while pushing " + insertSlots + ". Not all arguments were provided. Missing " + i2 + " int arguments (" + string + ") and " + i4 + " object arguments (" + string2 + ").");
    }

    public final void pushInsertSlots(Anchor anchor, SlotTable slotTable, FixupList fixupList) {
        Operations operations = this.operations;
        Operation.InsertSlotsWithFixups insertSlotsWithFixups = Operation.InsertSlotsWithFixups.INSTANCE;
        operations.pushOp(insertSlotsWithFixups);
        Operations operationsM3754constructorimpl = Operations.WriteScope.m3754constructorimpl(operations);
        Operation.InsertSlotsWithFixups insertSlotsWithFixups2 = Operation.InsertSlotsWithFixups.INSTANCE;
        Operations.WriteScope.m3760setObjectDKhxnng(operationsM3754constructorimpl, Operation.ObjectParameter.m3722constructorimpl(0), anchor);
        Operation.InsertSlotsWithFixups insertSlotsWithFixups3 = Operation.InsertSlotsWithFixups.INSTANCE;
        Operations.WriteScope.m3760setObjectDKhxnng(operationsM3754constructorimpl, Operation.ObjectParameter.m3722constructorimpl(1), slotTable);
        Operation.InsertSlotsWithFixups insertSlotsWithFixups4 = Operation.InsertSlotsWithFixups.INSTANCE;
        Operations.WriteScope.m3760setObjectDKhxnng(operationsM3754constructorimpl, Operation.ObjectParameter.m3722constructorimpl(2), fixupList);
        if (operations.pushedIntMask == operations.createExpectedArgMask(insertSlotsWithFixups.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(insertSlotsWithFixups.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = insertSlotsWithFixups.getInts();
        int i2 = 0;
        for (int i3 = 0; i3 < ints; i3++) {
            if ((-1) - (((-1) - (1 << i3)) | ((-1) - operations.pushedIntMask)) != 0) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(insertSlotsWithFixups.mo3683intParamNamew8GmfQM(Operation.IntParameter.m3711constructorimpl(i3)));
                i2++;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int objects = insertSlotsWithFixups.getObjects();
        int i4 = 0;
        for (int i5 = 0; i5 < objects; i5++) {
            if (((1 << i5) & operations.pushedObjectMask) != 0) {
                if (i2 > 0) {
                    sb2.append(", ");
                }
                sb2.append(insertSlotsWithFixups.mo3684objectParamName31yXWZQ(Operation.ObjectParameter.m3722constructorimpl(i5)));
                i4++;
            }
        }
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        PreconditionsKt.throwIllegalStateException("Error while pushing " + insertSlotsWithFixups + ". Not all arguments were provided. Missing " + i2 + " int arguments (" + string + ") and " + i4 + " object arguments (" + string2 + ").");
    }

    public final void pushMoveCurrentGroup(int i2) {
        Operations operations = this.operations;
        Operation.MoveCurrentGroup moveCurrentGroup = Operation.MoveCurrentGroup.INSTANCE;
        operations.pushOp(moveCurrentGroup);
        Operations operationsM3754constructorimpl = Operations.WriteScope.m3754constructorimpl(operations);
        Operation.MoveCurrentGroup moveCurrentGroup2 = Operation.MoveCurrentGroup.INSTANCE;
        Operations.WriteScope.m3759setIntA6tL2VI(operationsM3754constructorimpl, Operation.IntParameter.m3711constructorimpl(0), i2);
        if (operations.pushedIntMask == operations.createExpectedArgMask(moveCurrentGroup.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(moveCurrentGroup.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = moveCurrentGroup.getInts();
        int i3 = 0;
        for (int i4 = 0; i4 < ints; i4++) {
            if ((-1) - (((-1) - (1 << i4)) | ((-1) - operations.pushedIntMask)) != 0) {
                if (i3 > 0) {
                    sb.append(", ");
                }
                sb.append(moveCurrentGroup.mo3683intParamNamew8GmfQM(Operation.IntParameter.m3711constructorimpl(i4)));
                i3++;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int objects = moveCurrentGroup.getObjects();
        int i5 = 0;
        for (int i6 = 0; i6 < objects; i6++) {
            int i7 = 1 << i6;
            int i8 = operations.pushedObjectMask;
            if ((i7 + i8) - (i7 | i8) != 0) {
                if (i3 > 0) {
                    sb2.append(", ");
                }
                sb2.append(moveCurrentGroup.mo3684objectParamName31yXWZQ(Operation.ObjectParameter.m3722constructorimpl(i6)));
                i5++;
            }
        }
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        PreconditionsKt.throwIllegalStateException("Error while pushing " + moveCurrentGroup + ". Not all arguments were provided. Missing " + i3 + " int arguments (" + string + ") and " + i5 + " object arguments (" + string2 + ").");
    }

    public final void pushEndCompositionScope(Function1<? super Composition, Unit> function1, Composition composition) {
        Operations operations = this.operations;
        Operation.EndCompositionScope endCompositionScope = Operation.EndCompositionScope.INSTANCE;
        operations.pushOp(endCompositionScope);
        Operations operationsM3754constructorimpl = Operations.WriteScope.m3754constructorimpl(operations);
        Operation.EndCompositionScope endCompositionScope2 = Operation.EndCompositionScope.INSTANCE;
        Operations.WriteScope.m3760setObjectDKhxnng(operationsM3754constructorimpl, Operation.ObjectParameter.m3722constructorimpl(0), function1);
        Operation.EndCompositionScope endCompositionScope3 = Operation.EndCompositionScope.INSTANCE;
        Operations.WriteScope.m3760setObjectDKhxnng(operationsM3754constructorimpl, Operation.ObjectParameter.m3722constructorimpl(1), composition);
        if (operations.pushedIntMask == operations.createExpectedArgMask(endCompositionScope.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(endCompositionScope.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = endCompositionScope.getInts();
        int i2 = 0;
        for (int i3 = 0; i3 < ints; i3++) {
            int i4 = 1 << i3;
            int i5 = operations.pushedIntMask;
            if ((i4 + i5) - (i4 | i5) != 0) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(endCompositionScope.mo3683intParamNamew8GmfQM(Operation.IntParameter.m3711constructorimpl(i3)));
                i2++;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int objects = endCompositionScope.getObjects();
        int i6 = 0;
        for (int i7 = 0; i7 < objects; i7++) {
            int i8 = 1 << i7;
            int i9 = operations.pushedObjectMask;
            if ((i8 + i9) - (i8 | i9) != 0) {
                if (i2 > 0) {
                    sb2.append(", ");
                }
                sb2.append(endCompositionScope.mo3684objectParamName31yXWZQ(Operation.ObjectParameter.m3722constructorimpl(i7)));
                i6++;
            }
        }
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        PreconditionsKt.throwIllegalStateException("Error while pushing " + endCompositionScope + ". Not all arguments were provided. Missing " + i2 + " int arguments (" + string + ") and " + i6 + " object arguments (" + string2 + ").");
    }

    public final void pushUseNode(Object obj) {
        if (obj instanceof ComposeNodeLifecycleCallback) {
            this.operations.push(Operation.UseCurrentNode.INSTANCE);
        }
    }

    public final <T, V> void pushUpdateNode(V v2, Function2<? super T, ? super V, Unit> function2) {
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
            int i4 = 1 << i3;
            int i5 = operations.pushedIntMask;
            if ((i4 + i5) - (i4 | i5) != 0) {
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
        int i6 = 0;
        for (int i7 = 0; i7 < objects; i7++) {
            if (((1 << i7) & operations.pushedObjectMask) != 0) {
                if (i2 > 0) {
                    sb2.append(", ");
                }
                sb2.append(updateNode.mo3684objectParamName31yXWZQ(Operation.ObjectParameter.m3722constructorimpl(i7)));
                i6++;
            }
        }
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        PreconditionsKt.throwIllegalStateException("Error while pushing " + updateNode + ". Not all arguments were provided. Missing " + i2 + " int arguments (" + string + ") and " + i6 + " object arguments (" + string2 + ").");
    }

    public final void pushRemoveNode(int i2, int i3) {
        Operations operations = this.operations;
        Operation.RemoveNode removeNode = Operation.RemoveNode.INSTANCE;
        operations.pushOp(removeNode);
        Operations operationsM3754constructorimpl = Operations.WriteScope.m3754constructorimpl(operations);
        Operation.RemoveNode removeNode2 = Operation.RemoveNode.INSTANCE;
        Operations.WriteScope.m3759setIntA6tL2VI(operationsM3754constructorimpl, Operation.IntParameter.m3711constructorimpl(0), i2);
        Operation.RemoveNode removeNode3 = Operation.RemoveNode.INSTANCE;
        Operations.WriteScope.m3759setIntA6tL2VI(operationsM3754constructorimpl, Operation.IntParameter.m3711constructorimpl(1), i3);
        if (operations.pushedIntMask == operations.createExpectedArgMask(removeNode.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(removeNode.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = removeNode.getInts();
        int i4 = 0;
        for (int i5 = 0; i5 < ints; i5++) {
            int i6 = 1 << i5;
            int i7 = operations.pushedIntMask;
            if ((i6 + i7) - (i6 | i7) != 0) {
                if (i4 > 0) {
                    sb.append(", ");
                }
                sb.append(removeNode.mo3683intParamNamew8GmfQM(Operation.IntParameter.m3711constructorimpl(i5)));
                i4++;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int objects = removeNode.getObjects();
        int i8 = 0;
        for (int i9 = 0; i9 < objects; i9++) {
            int i10 = 1 << i9;
            int i11 = operations.pushedObjectMask;
            if ((i10 + i11) - (i10 | i11) != 0) {
                if (i4 > 0) {
                    sb2.append(", ");
                }
                sb2.append(removeNode.mo3684objectParamName31yXWZQ(Operation.ObjectParameter.m3722constructorimpl(i9)));
                i8++;
            }
        }
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        PreconditionsKt.throwIllegalStateException("Error while pushing " + removeNode + ". Not all arguments were provided. Missing " + i4 + " int arguments (" + string + ") and " + i8 + " object arguments (" + string2 + ").");
    }

    public final void pushMoveNode(int i2, int i3, int i4) {
        Operations operations = this.operations;
        Operation.MoveNode moveNode = Operation.MoveNode.INSTANCE;
        operations.pushOp(moveNode);
        Operations operationsM3754constructorimpl = Operations.WriteScope.m3754constructorimpl(operations);
        Operation.MoveNode moveNode2 = Operation.MoveNode.INSTANCE;
        Operations.WriteScope.m3759setIntA6tL2VI(operationsM3754constructorimpl, Operation.IntParameter.m3711constructorimpl(1), i2);
        Operation.MoveNode moveNode3 = Operation.MoveNode.INSTANCE;
        Operations.WriteScope.m3759setIntA6tL2VI(operationsM3754constructorimpl, Operation.IntParameter.m3711constructorimpl(0), i3);
        Operation.MoveNode moveNode4 = Operation.MoveNode.INSTANCE;
        Operations.WriteScope.m3759setIntA6tL2VI(operationsM3754constructorimpl, Operation.IntParameter.m3711constructorimpl(2), i4);
        if (operations.pushedIntMask == operations.createExpectedArgMask(moveNode.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(moveNode.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = moveNode.getInts();
        int i5 = 0;
        for (int i6 = 0; i6 < ints; i6++) {
            if (((1 << i6) & operations.pushedIntMask) != 0) {
                if (i5 > 0) {
                    sb.append(", ");
                }
                sb.append(moveNode.mo3683intParamNamew8GmfQM(Operation.IntParameter.m3711constructorimpl(i6)));
                i5++;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int objects = moveNode.getObjects();
        int i7 = 0;
        for (int i8 = 0; i8 < objects; i8++) {
            if ((-1) - (((-1) - (1 << i8)) | ((-1) - operations.pushedObjectMask)) != 0) {
                if (i5 > 0) {
                    sb2.append(", ");
                }
                sb2.append(moveNode.mo3684objectParamName31yXWZQ(Operation.ObjectParameter.m3722constructorimpl(i8)));
                i7++;
            }
        }
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        PreconditionsKt.throwIllegalStateException("Error while pushing " + moveNode + ". Not all arguments were provided. Missing " + i5 + " int arguments (" + string + ") and " + i7 + " object arguments (" + string2 + ").");
    }

    public final void pushAdvanceSlotsBy(int i2) {
        Operations operations = this.operations;
        Operation.AdvanceSlotsBy advanceSlotsBy = Operation.AdvanceSlotsBy.INSTANCE;
        operations.pushOp(advanceSlotsBy);
        Operations operationsM3754constructorimpl = Operations.WriteScope.m3754constructorimpl(operations);
        Operation.AdvanceSlotsBy advanceSlotsBy2 = Operation.AdvanceSlotsBy.INSTANCE;
        Operations.WriteScope.m3759setIntA6tL2VI(operationsM3754constructorimpl, Operation.IntParameter.m3711constructorimpl(0), i2);
        if (operations.pushedIntMask == operations.createExpectedArgMask(advanceSlotsBy.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(advanceSlotsBy.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = advanceSlotsBy.getInts();
        int i3 = 0;
        for (int i4 = 0; i4 < ints; i4++) {
            if ((-1) - (((-1) - (1 << i4)) | ((-1) - operations.pushedIntMask)) != 0) {
                if (i3 > 0) {
                    sb.append(", ");
                }
                sb.append(advanceSlotsBy.mo3683intParamNamew8GmfQM(Operation.IntParameter.m3711constructorimpl(i4)));
                i3++;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int objects = advanceSlotsBy.getObjects();
        int i5 = 0;
        for (int i6 = 0; i6 < objects; i6++) {
            if ((-1) - (((-1) - (1 << i6)) | ((-1) - operations.pushedObjectMask)) != 0) {
                if (i3 > 0) {
                    sb2.append(", ");
                }
                sb2.append(advanceSlotsBy.mo3684objectParamName31yXWZQ(Operation.ObjectParameter.m3722constructorimpl(i6)));
                i5++;
            }
        }
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        PreconditionsKt.throwIllegalStateException("Error while pushing " + advanceSlotsBy + ". Not all arguments were provided. Missing " + i3 + " int arguments (" + string + ") and " + i5 + " object arguments (" + string2 + ").");
    }

    public final void pushUps(int i2) {
        Operations operations = this.operations;
        Operation.Ups ups = Operation.Ups.INSTANCE;
        operations.pushOp(ups);
        Operations operationsM3754constructorimpl = Operations.WriteScope.m3754constructorimpl(operations);
        Operation.Ups ups2 = Operation.Ups.INSTANCE;
        Operations.WriteScope.m3759setIntA6tL2VI(operationsM3754constructorimpl, Operation.IntParameter.m3711constructorimpl(0), i2);
        if (operations.pushedIntMask == operations.createExpectedArgMask(ups.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(ups.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = ups.getInts();
        int i3 = 0;
        for (int i4 = 0; i4 < ints; i4++) {
            if ((-1) - (((-1) - (1 << i4)) | ((-1) - operations.pushedIntMask)) != 0) {
                if (i3 > 0) {
                    sb.append(", ");
                }
                sb.append(ups.mo3683intParamNamew8GmfQM(Operation.IntParameter.m3711constructorimpl(i4)));
                i3++;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int objects = ups.getObjects();
        int i5 = 0;
        for (int i6 = 0; i6 < objects; i6++) {
            int i7 = 1 << i6;
            int i8 = operations.pushedObjectMask;
            if ((i7 + i8) - (i7 | i8) != 0) {
                if (i3 > 0) {
                    sb2.append(", ");
                }
                sb2.append(ups.mo3684objectParamName31yXWZQ(Operation.ObjectParameter.m3722constructorimpl(i6)));
                i5++;
            }
        }
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        PreconditionsKt.throwIllegalStateException("Error while pushing " + ups + ". Not all arguments were provided. Missing " + i3 + " int arguments (" + string + ") and " + i5 + " object arguments (" + string2 + ").");
    }

    public final void pushDowns(Object[] objArr) {
        if (objArr.length == 0) {
            return;
        }
        Operations operations = this.operations;
        Operation.Downs downs = Operation.Downs.INSTANCE;
        operations.pushOp(downs);
        Operations operationsM3754constructorimpl = Operations.WriteScope.m3754constructorimpl(operations);
        Operation.Downs downs2 = Operation.Downs.INSTANCE;
        Operations.WriteScope.m3760setObjectDKhxnng(operationsM3754constructorimpl, Operation.ObjectParameter.m3722constructorimpl(0), objArr);
        if (operations.pushedIntMask == operations.createExpectedArgMask(downs.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(downs.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = downs.getInts();
        int i2 = 0;
        for (int i3 = 0; i3 < ints; i3++) {
            if (((1 << i3) & operations.pushedIntMask) != 0) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(downs.mo3683intParamNamew8GmfQM(Operation.IntParameter.m3711constructorimpl(i3)));
                i2++;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int objects = downs.getObjects();
        int i4 = 0;
        for (int i5 = 0; i5 < objects; i5++) {
            if ((-1) - (((-1) - (1 << i5)) | ((-1) - operations.pushedObjectMask)) != 0) {
                if (i2 > 0) {
                    sb2.append(", ");
                }
                sb2.append(downs.mo3684objectParamName31yXWZQ(Operation.ObjectParameter.m3722constructorimpl(i5)));
                i4++;
            }
        }
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        PreconditionsKt.throwIllegalStateException("Error while pushing " + downs + ". Not all arguments were provided. Missing " + i2 + " int arguments (" + string + ") and " + i4 + " object arguments (" + string2 + ").");
    }

    public final void pushSideEffect(Function0<Unit> function0) {
        Operations operations = this.operations;
        Operation.SideEffect sideEffect = Operation.SideEffect.INSTANCE;
        operations.pushOp(sideEffect);
        Operations operationsM3754constructorimpl = Operations.WriteScope.m3754constructorimpl(operations);
        Operation.SideEffect sideEffect2 = Operation.SideEffect.INSTANCE;
        Operations.WriteScope.m3760setObjectDKhxnng(operationsM3754constructorimpl, Operation.ObjectParameter.m3722constructorimpl(0), function0);
        if (operations.pushedIntMask == operations.createExpectedArgMask(sideEffect.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(sideEffect.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = sideEffect.getInts();
        int i2 = 0;
        for (int i3 = 0; i3 < ints; i3++) {
            int i4 = 1 << i3;
            int i5 = operations.pushedIntMask;
            if ((i4 + i5) - (i4 | i5) != 0) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(sideEffect.mo3683intParamNamew8GmfQM(Operation.IntParameter.m3711constructorimpl(i3)));
                i2++;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int objects = sideEffect.getObjects();
        int i6 = 0;
        for (int i7 = 0; i7 < objects; i7++) {
            if (((1 << i7) & operations.pushedObjectMask) != 0) {
                if (i2 > 0) {
                    sb2.append(", ");
                }
                sb2.append(sideEffect.mo3684objectParamName31yXWZQ(Operation.ObjectParameter.m3722constructorimpl(i7)));
                i6++;
            }
        }
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        PreconditionsKt.throwIllegalStateException("Error while pushing " + sideEffect + ". Not all arguments were provided. Missing " + i2 + " int arguments (" + string + ") and " + i6 + " object arguments (" + string2 + ").");
    }

    public final void pushDetermineMovableContentNodeIndex(IntRef intRef, Anchor anchor) {
        Operations operations = this.operations;
        Operation.DetermineMovableContentNodeIndex determineMovableContentNodeIndex = Operation.DetermineMovableContentNodeIndex.INSTANCE;
        operations.pushOp(determineMovableContentNodeIndex);
        Operations operationsM3754constructorimpl = Operations.WriteScope.m3754constructorimpl(operations);
        Operation.DetermineMovableContentNodeIndex determineMovableContentNodeIndex2 = Operation.DetermineMovableContentNodeIndex.INSTANCE;
        Operations.WriteScope.m3760setObjectDKhxnng(operationsM3754constructorimpl, Operation.ObjectParameter.m3722constructorimpl(0), intRef);
        Operation.DetermineMovableContentNodeIndex determineMovableContentNodeIndex3 = Operation.DetermineMovableContentNodeIndex.INSTANCE;
        Operations.WriteScope.m3760setObjectDKhxnng(operationsM3754constructorimpl, Operation.ObjectParameter.m3722constructorimpl(1), anchor);
        if (operations.pushedIntMask == operations.createExpectedArgMask(determineMovableContentNodeIndex.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(determineMovableContentNodeIndex.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = determineMovableContentNodeIndex.getInts();
        int i2 = 0;
        for (int i3 = 0; i3 < ints; i3++) {
            if (((1 << i3) & operations.pushedIntMask) != 0) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(determineMovableContentNodeIndex.mo3683intParamNamew8GmfQM(Operation.IntParameter.m3711constructorimpl(i3)));
                i2++;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int objects = determineMovableContentNodeIndex.getObjects();
        int i4 = 0;
        for (int i5 = 0; i5 < objects; i5++) {
            if ((-1) - (((-1) - (1 << i5)) | ((-1) - operations.pushedObjectMask)) != 0) {
                if (i2 > 0) {
                    sb2.append(", ");
                }
                sb2.append(determineMovableContentNodeIndex.mo3684objectParamName31yXWZQ(Operation.ObjectParameter.m3722constructorimpl(i5)));
                i4++;
            }
        }
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        PreconditionsKt.throwIllegalStateException("Error while pushing " + determineMovableContentNodeIndex + ". Not all arguments were provided. Missing " + i2 + " int arguments (" + string + ") and " + i4 + " object arguments (" + string2 + ").");
    }

    public final void pushCopyNodesToNewAnchorLocation(List<? extends Object> list, IntRef intRef) {
        if (list.isEmpty()) {
            return;
        }
        Operations operations = this.operations;
        Operation.CopyNodesToNewAnchorLocation copyNodesToNewAnchorLocation = Operation.CopyNodesToNewAnchorLocation.INSTANCE;
        operations.pushOp(copyNodesToNewAnchorLocation);
        Operations operationsM3754constructorimpl = Operations.WriteScope.m3754constructorimpl(operations);
        Operation.CopyNodesToNewAnchorLocation copyNodesToNewAnchorLocation2 = Operation.CopyNodesToNewAnchorLocation.INSTANCE;
        Operations.WriteScope.m3760setObjectDKhxnng(operationsM3754constructorimpl, Operation.ObjectParameter.m3722constructorimpl(1), list);
        Operation.CopyNodesToNewAnchorLocation copyNodesToNewAnchorLocation3 = Operation.CopyNodesToNewAnchorLocation.INSTANCE;
        Operations.WriteScope.m3760setObjectDKhxnng(operationsM3754constructorimpl, Operation.ObjectParameter.m3722constructorimpl(0), intRef);
        if (operations.pushedIntMask == operations.createExpectedArgMask(copyNodesToNewAnchorLocation.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(copyNodesToNewAnchorLocation.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = copyNodesToNewAnchorLocation.getInts();
        int i2 = 0;
        for (int i3 = 0; i3 < ints; i3++) {
            if (((1 << i3) & operations.pushedIntMask) != 0) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(copyNodesToNewAnchorLocation.mo3683intParamNamew8GmfQM(Operation.IntParameter.m3711constructorimpl(i3)));
                i2++;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int objects = copyNodesToNewAnchorLocation.getObjects();
        int i4 = 0;
        for (int i5 = 0; i5 < objects; i5++) {
            if ((-1) - (((-1) - (1 << i5)) | ((-1) - operations.pushedObjectMask)) != 0) {
                if (i2 > 0) {
                    sb2.append(", ");
                }
                sb2.append(copyNodesToNewAnchorLocation.mo3684objectParamName31yXWZQ(Operation.ObjectParameter.m3722constructorimpl(i5)));
                i4++;
            }
        }
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        PreconditionsKt.throwIllegalStateException("Error while pushing " + copyNodesToNewAnchorLocation + ". Not all arguments were provided. Missing " + i2 + " int arguments (" + string + ") and " + i4 + " object arguments (" + string2 + ").");
    }

    public final void pushCopySlotTableToAnchorLocation(MovableContentState movableContentState, CompositionContext compositionContext, MovableContentStateReference movableContentStateReference, MovableContentStateReference movableContentStateReference2) {
        Operations operations = this.operations;
        Operation.CopySlotTableToAnchorLocation copySlotTableToAnchorLocation = Operation.CopySlotTableToAnchorLocation.INSTANCE;
        operations.pushOp(copySlotTableToAnchorLocation);
        Operations operationsM3754constructorimpl = Operations.WriteScope.m3754constructorimpl(operations);
        Operation.CopySlotTableToAnchorLocation copySlotTableToAnchorLocation2 = Operation.CopySlotTableToAnchorLocation.INSTANCE;
        Operations.WriteScope.m3760setObjectDKhxnng(operationsM3754constructorimpl, Operation.ObjectParameter.m3722constructorimpl(0), movableContentState);
        Operation.CopySlotTableToAnchorLocation copySlotTableToAnchorLocation3 = Operation.CopySlotTableToAnchorLocation.INSTANCE;
        Operations.WriteScope.m3760setObjectDKhxnng(operationsM3754constructorimpl, Operation.ObjectParameter.m3722constructorimpl(1), compositionContext);
        Operation.CopySlotTableToAnchorLocation copySlotTableToAnchorLocation4 = Operation.CopySlotTableToAnchorLocation.INSTANCE;
        Operations.WriteScope.m3760setObjectDKhxnng(operationsM3754constructorimpl, Operation.ObjectParameter.m3722constructorimpl(3), movableContentStateReference2);
        Operation.CopySlotTableToAnchorLocation copySlotTableToAnchorLocation5 = Operation.CopySlotTableToAnchorLocation.INSTANCE;
        Operations.WriteScope.m3760setObjectDKhxnng(operationsM3754constructorimpl, Operation.ObjectParameter.m3722constructorimpl(2), movableContentStateReference);
        if (operations.pushedIntMask == operations.createExpectedArgMask(copySlotTableToAnchorLocation.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(copySlotTableToAnchorLocation.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = copySlotTableToAnchorLocation.getInts();
        int i2 = 0;
        for (int i3 = 0; i3 < ints; i3++) {
            int i4 = 1 << i3;
            int i5 = operations.pushedIntMask;
            if ((i4 + i5) - (i4 | i5) != 0) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(copySlotTableToAnchorLocation.mo3683intParamNamew8GmfQM(Operation.IntParameter.m3711constructorimpl(i3)));
                i2++;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int objects = copySlotTableToAnchorLocation.getObjects();
        int i6 = 0;
        for (int i7 = 0; i7 < objects; i7++) {
            if ((-1) - (((-1) - (1 << i7)) | ((-1) - operations.pushedObjectMask)) != 0) {
                if (i2 > 0) {
                    sb2.append(", ");
                }
                sb2.append(copySlotTableToAnchorLocation.mo3684objectParamName31yXWZQ(Operation.ObjectParameter.m3722constructorimpl(i7)));
                i6++;
            }
        }
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        PreconditionsKt.throwIllegalStateException("Error while pushing " + copySlotTableToAnchorLocation + ". Not all arguments were provided. Missing " + i2 + " int arguments (" + string + ") and " + i6 + " object arguments (" + string2 + ").");
    }

    public final void pushReleaseMovableGroupAtCurrent(ControlledComposition controlledComposition, CompositionContext compositionContext, MovableContentStateReference movableContentStateReference) {
        Operations operations = this.operations;
        Operation.ReleaseMovableGroupAtCurrent releaseMovableGroupAtCurrent = Operation.ReleaseMovableGroupAtCurrent.INSTANCE;
        operations.pushOp(releaseMovableGroupAtCurrent);
        Operations operationsM3754constructorimpl = Operations.WriteScope.m3754constructorimpl(operations);
        Operation.ReleaseMovableGroupAtCurrent releaseMovableGroupAtCurrent2 = Operation.ReleaseMovableGroupAtCurrent.INSTANCE;
        Operations.WriteScope.m3760setObjectDKhxnng(operationsM3754constructorimpl, Operation.ObjectParameter.m3722constructorimpl(0), controlledComposition);
        Operation.ReleaseMovableGroupAtCurrent releaseMovableGroupAtCurrent3 = Operation.ReleaseMovableGroupAtCurrent.INSTANCE;
        Operations.WriteScope.m3760setObjectDKhxnng(operationsM3754constructorimpl, Operation.ObjectParameter.m3722constructorimpl(1), compositionContext);
        Operation.ReleaseMovableGroupAtCurrent releaseMovableGroupAtCurrent4 = Operation.ReleaseMovableGroupAtCurrent.INSTANCE;
        Operations.WriteScope.m3760setObjectDKhxnng(operationsM3754constructorimpl, Operation.ObjectParameter.m3722constructorimpl(2), movableContentStateReference);
        if (operations.pushedIntMask == operations.createExpectedArgMask(releaseMovableGroupAtCurrent.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(releaseMovableGroupAtCurrent.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = releaseMovableGroupAtCurrent.getInts();
        int i2 = 0;
        for (int i3 = 0; i3 < ints; i3++) {
            if (((1 << i3) & operations.pushedIntMask) != 0) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(releaseMovableGroupAtCurrent.mo3683intParamNamew8GmfQM(Operation.IntParameter.m3711constructorimpl(i3)));
                i2++;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int objects = releaseMovableGroupAtCurrent.getObjects();
        int i4 = 0;
        for (int i5 = 0; i5 < objects; i5++) {
            int i6 = 1 << i5;
            int i7 = operations.pushedObjectMask;
            if ((i6 + i7) - (i6 | i7) != 0) {
                if (i2 > 0) {
                    sb2.append(", ");
                }
                sb2.append(releaseMovableGroupAtCurrent.mo3684objectParamName31yXWZQ(Operation.ObjectParameter.m3722constructorimpl(i5)));
                i4++;
            }
        }
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        PreconditionsKt.throwIllegalStateException("Error while pushing " + releaseMovableGroupAtCurrent + ". Not all arguments were provided. Missing " + i2 + " int arguments (" + string + ") and " + i4 + " object arguments (" + string2 + ").");
    }

    public final void pushEndMovableContentPlacement() {
        this.operations.push(Operation.EndMovableContentPlacement.INSTANCE);
    }

    public static /* synthetic */ void pushExecuteOperationsIn$default(ChangeList changeList, ChangeList changeList2, IntRef intRef, int i2, Object obj) {
        if ((i2 + 2) - (i2 | 2) != 0) {
            intRef = null;
        }
        changeList.pushExecuteOperationsIn(changeList2, intRef);
    }

    public final void pushExecuteOperationsIn(ChangeList changeList, IntRef intRef) {
        if (changeList.isNotEmpty()) {
            Operations operations = this.operations;
            Operation.ApplyChangeList applyChangeList = Operation.ApplyChangeList.INSTANCE;
            operations.pushOp(applyChangeList);
            Operations operationsM3754constructorimpl = Operations.WriteScope.m3754constructorimpl(operations);
            Operation.ApplyChangeList applyChangeList2 = Operation.ApplyChangeList.INSTANCE;
            Operations.WriteScope.m3760setObjectDKhxnng(operationsM3754constructorimpl, Operation.ObjectParameter.m3722constructorimpl(0), changeList);
            Operation.ApplyChangeList applyChangeList3 = Operation.ApplyChangeList.INSTANCE;
            Operations.WriteScope.m3760setObjectDKhxnng(operationsM3754constructorimpl, Operation.ObjectParameter.m3722constructorimpl(1), intRef);
            if (operations.pushedIntMask == operations.createExpectedArgMask(applyChangeList.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(applyChangeList.getObjects())) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            int ints = applyChangeList.getInts();
            int i2 = 0;
            for (int i3 = 0; i3 < ints; i3++) {
                if ((-1) - (((-1) - (1 << i3)) | ((-1) - operations.pushedIntMask)) != 0) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(applyChangeList.mo3683intParamNamew8GmfQM(Operation.IntParameter.m3711constructorimpl(i3)));
                    i2++;
                }
            }
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb2 = new StringBuilder();
            int objects = applyChangeList.getObjects();
            int i4 = 0;
            for (int i5 = 0; i5 < objects; i5++) {
                if ((-1) - (((-1) - (1 << i5)) | ((-1) - operations.pushedObjectMask)) != 0) {
                    if (i2 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(applyChangeList.mo3684objectParamName31yXWZQ(Operation.ObjectParameter.m3722constructorimpl(i5)));
                    i4++;
                }
            }
            String string2 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
            PreconditionsKt.throwIllegalStateException("Error while pushing " + applyChangeList + ". Not all arguments were provided. Missing " + i2 + " int arguments (" + string + ") and " + i4 + " object arguments (" + string2 + ").");
        }
    }

    @Override // androidx.compose.runtime.changelist.OperationsDebugStringFormattable
    public String toDebugString(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("ChangeList instance containing ");
        sb.append(getSize());
        sb.append(" operations");
        if (sb.length() > 0) {
            sb.append(":\n");
            sb.append(this.operations.toDebugString(str));
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
