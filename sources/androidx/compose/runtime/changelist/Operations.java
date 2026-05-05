package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.changelist.Operation;
import java.util.Arrays;
import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
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
/* JADX INFO: compiled from: Operations.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яď\u0014D57\u001eq\u007fZDkt\nA\u000e0\u0019AJչ*, }\u000f߿r9>SmH<ɟ[*\u0015l\u00044:[,qIA]\u001a\f\"\u0011OTlon`Z\u0013C%\u0006\u001ex\u0001,QU~_\u001a\u000fHBwЀ;M\u0006=Aś|6\u001b :\">z\r\u0001(3P\u0010|\u0001KK\"\u00128@v:Z\r[\u0011\"\u0012\f@(\u00014\\oN<It]P/+\u0003oFV'mJ\u0005M\u0013HZ܋#Ǹ\u007ff[@e4M&\u001cLQ\u0013^ύ\u0007?\u007f=Ml5:CI\"k~f\u000e)-+}\u0011\u000ev4r\u001dQ\u000f\u0010m+\u0018yYg&(&~,\u0011J\u001c&\u0006UL^1(\u007f \u000eax9S\tt\u0010xZ\u007f)uf03\u001bK@I!vU\u0010XiNeަ\u0015\u000f.#/\u0003Owڍ\u0012`\u001b9\u001bȴWy_N\\`N8mmq\u0012\nz\u0002X\bvGH=\n1F\u0017SK\f=1:\u0004\u0002vH.vM\u0001vt\u0002RvTRv$YB\r\u001cZJe3\u000f\u0001XfP)MJy7\u0002\u001698\\&ciI\u001evgh\u0018~}v\u0018NG{G_~o<t\n^a̐ae a\u0001\u000bB[םf\u0005^\u0005\tʹ\u0012#`6LJH\u0019;@\u007fRz$\u0013`j:\"BYI\u0019\u000b \u000f\u0003fFO+!_\t|X\u000bbb<\u0003\u00188%\r\u000f\u0001tp\u001eΟAU:.x\"[U\u00029'Xm\"\u0017?EX\u00150\f\u007fu{|KZ\u001f.u\u0004\u0007P+(li@M\u0015\u001f~Wf\u0012/UL!y\u007fiɟ+z\u0003\u0018U\u0097n֮g\u0010rv2_zJ]T5!?l\u0001X d.\u000e\u0012J\ty{T9f\u0005N;\u0011grf8+<O\"39\b\"+lsWo#$1,/C\u0019$~8F\b\u001d'&#i40qQ\bb\u007f\u001ax;ϨHʲ˽B$**\u0011\u0001\u0011\u0007\u0006GZ\tb\u0011cPO \tZHM\u00110,'M,߱o£ݍ>\u0015u?Bl(@\u0002\u0006\u0016\u0014\rzM\u0015{p8m\u001cж\r\u000fXG\"\u000b*h5\u0012dQ.\u001aob7g.u.5oB\u0013\tJA<4ZsN\u000b\f^wJ(z.}\b\u000fEi\ts\u0004t\u001c\u001a\u0011\\\u0005\u007f%bKǷ/p)\u0005\u001f5.x{w35vX=\u001cJ\u0001\u0002TO\u001b;[\rg=+rV\u0010Ќ4\u0092\u0005\u000bM؏\u0014U\u00109\u001cGWqBƔ\u0018է\u001c|%\u00adh1GV)g\u00074n\rkc|k%\u0018=ŝZĀ-\u0001\u0003|\u001cDZ\u001b\u0019\"gr\u001ef\u0004َZߺ;C\"݅gZ7\u0011$\u0005sJ+/\u001c4[Hwpjՠ\b\u009cW=\u0006\b.,w\u0010\u0003.tW<j`܄'Ɛ\u001aq\u001eȈR\u0015!^8\u0004\\NKҝ\u0016ڷ\f6W\u05ce\u0004\u000e!mqk&%\u0017Ӓ7˭\nBSЕI\u0019q|{n\u0004\u000f9+ܕZ}\u0007/V.\u00179Ӑ.\u0018`]@ðoNWӢ\u0004_"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fqo\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fqo\u0018\u0007`<Pd6TPW.=\\\u007fE\u0010!i\nK2\rZ", "u(E", "7mc\u000ee.L", "", "7mc\u000ee.LA\u001d\u0014z", "", "=aY2V;\u001a`\u001b\r", "", "", ")KY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}", "=aY2V;\u001a`\u001b\rhbA|", "=o2<W,L", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq7", ")KP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW:y!>[}';{%w7N;x0-\u0019rj\u000f", "=o2<W,LA\u001d\u0014z", ">tb5X+\"\\(fvl2", ">tb5X+(P\u001e~xm\u0014x\u00175", "Ahi2", "5dc \\A>", "u(8", "1kT.e", "", "1qT.g,\u001ef$~xm,{d<gg$\nF", ">`a.`\nHc\"\u000e", "2dc2e4B\\\u0019gzp\u001a\u0001\u001e/", "1ta?X5MA\u001d\u0014z", "@d`B\\9>R\u0007\u0003\u0010^", "2qP6a", "Ah]8", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fqowpn\u0010]v4C[X92", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "3mbBe,\"\\(Z\b`:j\rDe[7b@|%&", "3mbBe,(P\u001e~xm\b\n\u000b=S\u0004={\u001c\u0010}\u0017C}\u001d", "3wT0h;>/\"}[e<\u000b\f\u000bl\u0007\u0013{I\u007f\u001b IY\u0019<\u0004!D]\b)E", "/o_9\\,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iG\u0002,9Y\u000bu", "Ak^Af", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014'f\u0002/7zk", "@d\\2`)>`\u0001z\u0004Z.|\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-\u001fi\u001f*OCHA", "4na\u0012T*A", "/bc6b5", "7r4:c;R", "", "7r=<g\fF^(\u0013", ">dT8B7>`\u0015\u000e~h5", ">n_", ">n_\u0016a;H", "=sW2e", ">tb5", "=oT?T;B]\"", "/qV@", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fqowxp0]v\u0015EVY,2", ">tb5B7", "Bn32U<@A(\f~g.", "", ":h]2C9>T\u001d\u0012", "BnBAe0GU", "Bn_\u0016a;\"\\\u0018~\u000eH-", ">`a.`,MS&", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq \u001d\u0010r\u0017J\u0004#OL],i(", "Bn_\u0016a;\"\\\u0018~\u000eH-D\u001b\u0002G\b)g(", "uH\u0018\u0016", "Bn_\u001cU1>Q(b\u0004],\u0010r0", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq #\u0004h,L\u0006\u0012CYJ4\\arJi", "Bn_\u001cU1>Q(b\u0004],\u0010r0-Ms\u00103r\f\u0003", "1ta?X5M=$m\u0005=,y\u00191S\u000f5\u007fI\u0003", "4na:T;(^t\f|n4|\u0012>T\n\u0016\u000bM\u0005 \u0019", "7mS2a;", "Bn2<_3>Q(\u0003\u0005g\u001a\f\u00163n\u0002", "\"", "", "\u0011n\\=T5B]\"", "\u001do8AX9:b#\f", "%qXAX\u001a<]$~", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Operations extends OperationsDebugStringFormattable {
    public static final int InitialCapacity = 16;
    private static final int MaxResizeAmount = 1024;
    private int intArgsSize;
    private int objectArgsSize;
    private int opCodesSize;
    private int pushedIntMask;
    private int pushedObjectMask;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private Operation[] opCodes = new Operation[16];
    private int[] intArgs = new int[16];
    private Object[] objectArgs = new Object[16];

    /* JADX INFO: Access modifiers changed from: private */
    public final int createExpectedArgMask(int i2) {
        if (i2 == 0) {
            return 0;
        }
        return (-1) >>> (32 - i2);
    }

    public final int getSize() {
        return this.opCodesSize;
    }

    public final boolean isEmpty() {
        return getSize() == 0;
    }

    public final boolean isNotEmpty() {
        return getSize() != 0;
    }

    public final void clear() {
        this.opCodesSize = 0;
        this.intArgsSize = 0;
        ArraysKt.fill(this.objectArgs, (Object) null, 0, this.objectArgsSize);
        this.objectArgsSize = 0;
    }

    public final void pushOp(Operation operation) {
        this.pushedIntMask = 0;
        this.pushedObjectMask = 0;
        int i2 = this.opCodesSize;
        if (i2 == this.opCodes.length) {
            Object[] objArrCopyOf = Arrays.copyOf(this.opCodes, this.opCodesSize + RangesKt.coerceAtMost(i2, 1024));
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.opCodes = (Operation[]) objArrCopyOf;
        }
        ensureIntArgsSizeAtLeast(this.intArgsSize + operation.getInts());
        ensureObjectArgsSizeAtLeast(this.objectArgsSize + operation.getObjects());
        Operation[] operationArr = this.opCodes;
        int i3 = this.opCodesSize;
        this.opCodesSize = i3 + 1;
        operationArr[i3] = operation;
        this.intArgsSize += operation.getInts();
        this.objectArgsSize += operation.getObjects();
    }

    private final int determineNewSize(int i2, int i3) {
        return RangesKt.coerceAtLeast(i2 + RangesKt.coerceAtMost(i2, 1024), i3);
    }

    private final void ensureIntArgsSizeAtLeast(int i2) {
        int[] iArr = this.intArgs;
        int length = iArr.length;
        if (i2 > length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, determineNewSize(length, i2));
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.intArgs = iArrCopyOf;
        }
    }

    private final void ensureObjectArgsSizeAtLeast(int i2) {
        Object[] objArr = this.objectArgs;
        int length = objArr.length;
        if (i2 > length) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, determineNewSize(length, i2));
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.objectArgs = objArrCopyOf;
        }
    }

    public final void push(Operation operation) {
        if (!(operation.getInts() == 0 && operation.getObjects() == 0)) {
            PreconditionsKt.throwIllegalArgumentException("Cannot push " + operation + " without arguments because it expects " + operation.getInts() + " ints and " + operation.getObjects() + " objects.");
        }
        pushOp(operation);
    }

    public final void push(Operation operation, Function1<? super WriteScope, Unit> function1) {
        pushOp(operation);
        function1.invoke(WriteScope.m3753boximpl(WriteScope.m3754constructorimpl(this)));
        if (this.pushedIntMask == createExpectedArgMask(operation.getInts()) && this.pushedObjectMask == createExpectedArgMask(operation.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = operation.getInts();
        int i2 = 0;
        for (int i3 = 0; i3 < ints; i3++) {
            int i4 = 1 << i3;
            int i5 = this.pushedIntMask;
            if ((i4 + i5) - (i4 | i5) != 0) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(operation.mo3683intParamNamew8GmfQM(Operation.IntParameter.m3711constructorimpl(i3)));
                i2++;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int objects = operation.getObjects();
        int i6 = 0;
        for (int i7 = 0; i7 < objects; i7++) {
            int i8 = 1 << i7;
            int i9 = this.pushedObjectMask;
            if ((i8 + i9) - (i8 | i9) != 0) {
                if (i2 > 0) {
                    sb2.append(", ");
                }
                sb2.append(operation.mo3684objectParamName31yXWZQ(Operation.ObjectParameter.m3722constructorimpl(i7)));
                i6++;
            }
        }
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        PreconditionsKt.throwIllegalStateException("Error while pushing " + operation + ". Not all arguments were provided. Missing " + i2 + " int arguments (" + string + ") and " + i6 + " object arguments (" + string2 + ").");
    }

    public final void pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Cannot pop(), because the stack is empty.");
        }
        Operation[] operationArr = this.opCodes;
        int i2 = this.opCodesSize - 1;
        this.opCodesSize = i2;
        Operation operation = operationArr[i2];
        Intrinsics.checkNotNull(operation);
        this.opCodes[this.opCodesSize] = null;
        int objects = operation.getObjects();
        for (int i3 = 0; i3 < objects; i3++) {
            Object[] objArr = this.objectArgs;
            int i4 = this.objectArgsSize - 1;
            this.objectArgsSize = i4;
            objArr[i4] = null;
        }
        int ints = operation.getInts();
        for (int i5 = 0; i5 < ints; i5++) {
            int[] iArr = this.intArgs;
            int i6 = this.intArgsSize - 1;
            this.intArgsSize = i6;
            iArr[i6] = 0;
        }
    }

    public final void popInto(Operations operations) {
        if (isEmpty()) {
            throw new NoSuchElementException("Cannot pop(), because the stack is empty.");
        }
        Operation[] operationArr = this.opCodes;
        int i2 = this.opCodesSize - 1;
        this.opCodesSize = i2;
        Operation operation = operationArr[i2];
        Intrinsics.checkNotNull(operation);
        this.opCodes[this.opCodesSize] = null;
        operations.pushOp(operation);
        int i3 = this.objectArgsSize;
        int i4 = operations.objectArgsSize;
        int objects = operation.getObjects();
        for (int i5 = 0; i5 < objects; i5++) {
            i4--;
            i3--;
            Object[] objArr = operations.objectArgs;
            Object[] objArr2 = this.objectArgs;
            objArr[i4] = objArr2[i3];
            objArr2[i3] = null;
        }
        int i6 = this.intArgsSize;
        int i7 = operations.intArgsSize;
        int ints = operation.getInts();
        for (int i8 = 0; i8 < ints; i8++) {
            i7--;
            i6--;
            int[] iArr = operations.intArgs;
            int[] iArr2 = this.intArgs;
            iArr[i7] = iArr2[i6];
            iArr2[i6] = 0;
        }
        this.objectArgsSize -= operation.getObjects();
        this.intArgsSize -= operation.getInts();
    }

    public final void forEach(Function1<? super OpIterator, Unit> function1) {
        if (isNotEmpty()) {
            OpIterator opIterator = new OpIterator();
            do {
                function1.invoke(opIterator);
            } while (opIterator.next());
        }
    }

    private final String indent(String str) {
        return str + "    ";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Operation peekOperation() {
        Operation operation = this.opCodes[this.opCodesSize - 1];
        Intrinsics.checkNotNull(operation);
        return operation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: topIntIndexOf-w8GmfQM, reason: not valid java name */
    public final int m3751topIntIndexOfw8GmfQM(int i2) {
        return (this.intArgsSize - peekOperation().getInts()) + i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: topObjectIndexOf-31yXWZQ, reason: not valid java name */
    public final int m3752topObjectIndexOf31yXWZQ(int i2) {
        return (this.objectArgsSize - peekOperation().getObjects()) + i2;
    }

    /* JADX INFO: compiled from: Operations.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4C\u0007\"B\u0012\u007f\u0007lkA0RnP.XU2\u000fy\u0002<$a%yCIU\"Ԃ*\teNogtMb\u000bY\u000f\u000e\u0016~k4Ic\u0005e\u0012\u00153Hī}Iݹ =g_5C\u0015$@\"Py3\u0002ʀ.J\u0016x\tF\u0014$ 8Xph[=S\u0013$*\bT\u001f/\u001d#ʸOɇLncE=/KwP[?_^\u000b\u0014ЌEù+\u000f|p,;\tUC&=S1\u0019\u0003_M\u0016Wqk\u0019\u0019+5@as\u0006Dߒ~ϬƦ/Q\u0013s\u0001=%/_x$'Ya\u0004MVʫ6\u0011+\u0006\u001bO\u001c\u0014\u0016)X.s3\u0015\">7\u0003\bk@\u0017\u001b\u0081Aȕѐe8\u001d@\u000eOsG)\u0004iai7\u0015Ұz˿\u0011 ) |A,c\u001cd-\u001b\u0003|\buҨDA`P\u0010_KtT|p\u0002B\u0004^HV߿} 2\u0017-ڛٌ8#ܼj\u0002vEϜv\nhkYׁnv?̷r7"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fqowxp0]v\u0015EVY,2", "", "AsP0^", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fqo\u000f", "1n]@g9NQ(\t\b&0\u0005\u00146", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW:y!>[}';{%w7N;x0-\u0019rjG\\'\u0013J\u007f&TVR+o\u001cpG\u001c\u001dd\u001cNt\u001a\u0015bP(vD\u0001\u001d\u000b(R\u0004;o\u0005\u001a%W\u001fupOR\u001fK\u0004\u001e\u0004\u0017", "=oT?T;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq7", "5dc\u001cc,KO(\u0003\u0005gs\u0001\u0011:l", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW:y!>[}';{%w7N;x0-\u0019rjG\\'\u0013J\u007f&TVR+o\u001cpG\u001c\u001dd\u001cNt\u001a\u0015bP(vD\u0001\u001d\u000b(R\u0004;o\u0005\u001a%W\u001fupOR\u001fK\u0004\u001eK", "3pd._:", "", "=sW2e", "3pd._:\u0006W!\n\u0002", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW:y!>[}';{%w7N;x0-\u0019rjG\\J1J\b#\u0011SJ5^\u001c\\:\u0019\u0012X\u001d$n\u0002", "6`b566=S", "", "6`b566=S`\u0003\u0003i3", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW:y!>[}';{%w7N;x0-\u0019rjG\\'\u0010", "Adc\u0016a;", "", ">`a.`,MS&", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq \u001d\u0010r\u0017J\u0004#OL],i(", "D`[BX", "Adc\u0016a;\u0006/i\u000ea+\u001d`", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW:y!>[}';{%w7N;x0-\u0019rjG\\G\u0010\u0012g", "Adc\u001cU1>Q(", "\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq #\u0004h,L\u0006\u0012CYJ4\\arJi", "Adc\u001cU1>Q(FYD/\u0010\u00128g", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW:y!>[}';{%w7N;x0-\u0019rjG\\G\u0013Sr8C\u0016U(eT<'\u0011\u0017Z\f]\u0001Pu", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW:y!>[}';{%w7N;x0-\u0019rjG\\'\u0013Sr8C\u0016U(eT<+#\u001f^\u0017P\u0001", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @JvmInline
    public static final class WriteScope {
        private final Operations stack;

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ WriteScope m3753boximpl(Operations operations) {
            return new WriteScope(operations);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static Operations m3754constructorimpl(Operations operations) {
            return operations;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m3755equalsimpl(Operations operations, Object obj) {
            return (obj instanceof WriteScope) && Intrinsics.areEqual(operations, ((WriteScope) obj).m3762unboximpl());
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m3756equalsimpl0(Operations operations, Operations operations2) {
            return Intrinsics.areEqual(operations, operations2);
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m3758hashCodeimpl(Operations operations) {
            return operations.hashCode();
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m3761toStringimpl(Operations operations) {
            return "WriteScope(stack=" + operations + ')';
        }

        public boolean equals(Object obj) {
            return m3755equalsimpl(this.stack, obj);
        }

        public int hashCode() {
            return m3758hashCodeimpl(this.stack);
        }

        public String toString() {
            return m3761toStringimpl(this.stack);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ Operations m3762unboximpl() {
            return this.stack;
        }

        private /* synthetic */ WriteScope(Operations operations) {
            this.stack = operations;
        }

        /* JADX INFO: renamed from: getOperation-impl, reason: not valid java name */
        public static final Operation m3757getOperationimpl(Operations operations) {
            return operations.peekOperation();
        }

        /* JADX INFO: renamed from: setInt-A6tL2VI, reason: not valid java name */
        public static final void m3759setIntA6tL2VI(Operations operations, int i2, int i3) {
            int i4 = 1 << i2;
            int i5 = operations.pushedIntMask;
            if (!((i5 + i4) - (i5 | i4) == 0)) {
                PreconditionsKt.throwIllegalStateException("Already pushed argument " + m3757getOperationimpl(operations).mo3683intParamNamew8GmfQM(i2));
            }
            operations.pushedIntMask = (-1) - (((-1) - operations.pushedIntMask) & ((-1) - i4));
            operations.intArgs[operations.m3751topIntIndexOfw8GmfQM(i2)] = i3;
        }

        /* JADX INFO: renamed from: setObject-DKhxnng, reason: not valid java name */
        public static final <T> void m3760setObjectDKhxnng(Operations operations, int i2, T t2) {
            int i3 = 1 << i2;
            if (!((operations.pushedObjectMask & i3) == 0)) {
                PreconditionsKt.throwIllegalStateException("Already pushed argument " + m3757getOperationimpl(operations).mo3684objectParamName31yXWZQ(i2));
            }
            operations.pushedObjectMask = (-1) - (((-1) - operations.pushedObjectMask) & ((-1) - i3));
            operations.objectArgs[operations.m3752topObjectIndexOf31yXWZQ(i2)] = t2;
        }
    }

    /* JADX INFO: compiled from: Operations.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00116B\u0005#4\u0012\u000e\u0007nj?2Le^.ZS0\u0011s{J$c$wDCU(\u0007*ޛUȥi}ñzZ9BO\tȀ|j:I\u001e\u0011k\u001b'2pqo7[yU9\u000f\u007f|\u0019܌1Ĳأ}\u0007\u0007&8UX\u001b\tQc\fX?`r@ĥ\u001b\\5$ \u0010V&\u0011 lg\u0015Ev|$NȻ\"ɅݦFP-p>\u000f\u0016\u0011Tg?\r%un7N8M\u0015SUYޚ^ÜC\u0003Gм\u000e\u0011v*?+wu.̯dÿ\u0018\u00153˽]i\u0001*t\u0005\u007fbbʯ7յgKXʫx\u0007\t\u0001%<2\u0014<kρ212h\u000e\u0015A|ɄSEX\u0005dۯ\u001c)`ِ\u001b:"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fqowpn\u0010]v4C[X92", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq=F\tA6W\u0006#KUN92", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW:y!>[}';{%w7N;x0-\u0019rjG\\'\u001d", "7mc\u0016W?", "", "=aY\u0016W?", "=o81k", "=oT?T;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq7", "5dc\u001cc,KO(\u0003\u0005g", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006t(1b\u007f >q$=\u0017-FkA\u001a$lkB\\", "5dc\u0016a;", ">`a.`,MS&", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq \u001d\u0010r\u0017J\u0004#OL],i(", "5dc\u0016a;\u0006ek`\u0003_\u0018d", "uH\u0018\u0016", "5dc\u001cU1>Q(", "\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fq #\u0004h,L\u0006\u0012CYJ4\\arJi", "5dc\u001cU1>Q(FH*@oz$Q", "uH\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "<dgA", "", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public final class OpIterator implements OperationArgContainer {
        private int intIdx;
        private int objIdx;
        private int opIdx;

        public OpIterator() {
        }

        public final boolean next() {
            if (this.opIdx >= Operations.this.opCodesSize) {
                return false;
            }
            Operation operation = getOperation();
            this.intIdx += operation.getInts();
            this.objIdx += operation.getObjects();
            int i2 = this.opIdx + 1;
            this.opIdx = i2;
            return i2 < Operations.this.opCodesSize;
        }

        public final Operation getOperation() {
            Operation operation = Operations.this.opCodes[this.opIdx];
            Intrinsics.checkNotNull(operation);
            return operation;
        }

        @Override // androidx.compose.runtime.changelist.OperationArgContainer
        /* JADX INFO: renamed from: getInt-w8GmfQM */
        public int mo3747getIntw8GmfQM(int i2) {
            return Operations.this.intArgs[this.intIdx + i2];
        }

        @Override // androidx.compose.runtime.changelist.OperationArgContainer
        /* JADX INFO: renamed from: getObject-31yXWZQ */
        public <T> T mo3748getObject31yXWZQ(int i2) {
            return (T) Operations.this.objectArgs[this.objIdx + i2];
        }
    }

    /* JADX INFO: compiled from: Operations.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005\"2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԃt\u07beSNo˧?Vh\u000e[\u000f4\u0018O̖~֒Yxe܈ƪ6F"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u0018XCHgC\"\u001fqowdm4Yr0KVW\u0002", "", "u(E", "\u0017mXA\\(E1\u0015\nv\\0\f\u001d", "", "\u001b`g\u001fX:Bh\u0019Z\u0003h<\u0006\u0018", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Deprecated(message = "7UnI\u0004}#^ \u0010g\u0012Y!8\u000enQ\u001d<\u0017vKf~K.nSz%{t`$KZlt>S#AN\u0013jU\t0\u0018NMtKsr\u001a`a\u0004~\u007f8A\f\u001b\u0005v)P~\n\u001d6\u0017;]#D:U=\f6U\u0005BF0\u0001\u0005.|i\rn", replaceWith = @ReplaceWith(expression = "toDebugString()", imports = {}))
    @InterfaceC1492Gx
    public String toString() {
        return super.toString();
    }

    @Override // androidx.compose.runtime.changelist.OperationsDebugStringFormattable
    public String toDebugString(String str) {
        StringBuilder sb = new StringBuilder();
        if (isNotEmpty()) {
            OpIterator opIterator = new OpIterator();
            int i2 = 1;
            while (true) {
                sb.append(str);
                int i3 = i2 + 1;
                sb.append(i2);
                sb.append(". ");
                StringBuilder sbAppend = sb.append(currentOpToDebugString(opIterator, str));
                Intrinsics.checkNotNullExpressionValue(sbAppend, "append(value)");
                Intrinsics.checkNotNullExpressionValue(sbAppend.append('\n'), "append('\\n')");
                if (!opIterator.next()) {
                    break;
                }
                i2 = i3;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    private final String currentOpToDebugString(OpIterator opIterator, String str) {
        Operation operation = opIterator.getOperation();
        if (operation.getInts() == 0 && operation.getObjects() == 0) {
            return operation.getName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(operation.getName());
        sb.append('(');
        String strIndent = indent(str);
        int ints = operation.getInts();
        boolean z2 = true;
        for (int i2 = 0; i2 < ints; i2++) {
            int iM3711constructorimpl = Operation.IntParameter.m3711constructorimpl(i2);
            String strMo3683intParamNamew8GmfQM = operation.mo3683intParamNamew8GmfQM(iM3711constructorimpl);
            if (!z2) {
                sb.append(", ");
            } else {
                z2 = false;
            }
            Intrinsics.checkNotNullExpressionValue(sb.append('\n'), "append('\\n')");
            sb.append(strIndent);
            sb.append(strMo3683intParamNamew8GmfQM);
            sb.append(" = ");
            sb.append(opIterator.mo3747getIntw8GmfQM(iM3711constructorimpl));
        }
        int objects = operation.getObjects();
        for (int i3 = 0; i3 < objects; i3++) {
            int iM3722constructorimpl = Operation.ObjectParameter.m3722constructorimpl(i3);
            String strMo3684objectParamName31yXWZQ = operation.mo3684objectParamName31yXWZQ(iM3722constructorimpl);
            if (!z2) {
                sb.append(", ");
            } else {
                z2 = false;
            }
            Intrinsics.checkNotNullExpressionValue(sb.append('\n'), "append('\\n')");
            sb.append(strIndent);
            sb.append(strMo3684objectParamName31yXWZQ);
            sb.append(" = ");
            sb.append(formatOpArgumentToString(opIterator.mo3748getObject31yXWZQ(iM3722constructorimpl), strIndent));
        }
        Intrinsics.checkNotNullExpressionValue(sb.append('\n'), "append('\\n')");
        sb.append(str);
        sb.append(")");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String formatOpArgumentToString(Object obj, String str) {
        if (obj == null) {
            return "null";
        }
        return obj instanceof Object[] ? toCollectionString(ArraysKt.asIterable((Object[]) obj), str) : obj instanceof int[] ? toCollectionString(ArraysKt.asIterable((int[]) obj), str) : obj instanceof long[] ? toCollectionString(ArraysKt.asIterable((long[]) obj), str) : obj instanceof float[] ? toCollectionString(ArraysKt.asIterable((float[]) obj), str) : obj instanceof double[] ? toCollectionString(ArraysKt.asIterable((double[]) obj), str) : obj instanceof Iterable ? toCollectionString((Iterable) obj, str) : obj instanceof OperationsDebugStringFormattable ? ((OperationsDebugStringFormattable) obj).toDebugString(str) : obj.toString();
    }

    private final <T> String toCollectionString(Iterable<? extends T> iterable, final String str) {
        return CollectionsKt.joinToString$default(iterable, ", ", "[", "]", 0, null, new Function1<T, CharSequence>() { // from class: androidx.compose.runtime.changelist.Operations.toCollectionString.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(T t2) {
                return Operations.this.formatOpArgumentToString(t2, str);
            }
        }, 24, null);
    }

    public final void drain(Function1<? super OpIterator, Unit> function1) {
        if (isNotEmpty()) {
            OpIterator opIterator = new OpIterator();
            do {
                function1.invoke(opIterator);
            } while (opIterator.next());
        }
        clear();
    }

    public final void executeAndFlushAllPendingOperations(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
        if (isNotEmpty()) {
            OpIterator opIterator = new OpIterator();
            do {
                opIterator.getOperation().execute(opIterator, applier, slotWriter, rememberManager);
            } while (opIterator.next());
        }
        clear();
    }
}
