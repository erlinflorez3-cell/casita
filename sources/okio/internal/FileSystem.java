package okio.internal;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;
import okio.FileMetadata;
import okio.Path;
import yg.InterfaceC1492Gx;

/* JADX INFO: renamed from: okio.internal.-FileSystem */
/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d̉=!,i\bDZc|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0JeP.`\\2\u000fq\u0007<$q$yّCU0}*\tUN\u007f,|Ϻr\u000bq\u000e.\u001c\tl<I\u0004y\f\u0012?6PqW3{rmCnxN\u000b0428(\u0006/\u001fZL\u001e|\u0013Cy\rB4NwRR;U5\u001e \u000fV /&#ɢ\rɇLlkDG=\u0011tZNU^X|{\u0010vX5\u0019\u000faL,p;C\"=S1\b\u0019¹W\u001dM\u007fU\u0005\u0017&O+wv\b:f\u000f,\u0015YP=a\u00016t\u0005\u007fhRʬCiq\\h\u000eVv#{;?4\u0012\u00149`.[\u001b\u0017\f\u001cF\rr\u0002H\u0017\u061cvT\u000e\u000fy6E-(3Y<Kj_gS\u0019|8B˜%>1\u0016\u0007'kV\u001e`C\u001c\u0003\u000ey1\u007fCmL\\\u0019q=\u001c\u0005!f\u00101\u001c0u\buɅ)@%<O[g;Ik0Ktk\u0005\u000bxh\u0002j\u0019̲X6|/O,\u001f\u000b\tE\r\u0005\u001aS\u0005\\:\u0017e\u001c\u0003\bDܱ˟$v"}, d2 = {"1n[9X*M@\u0019|\u000bk:\u0001\u001a/l\u0014", "", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eo{:\u000105/", "\u001anZ6bu)O(\u0002P", "4h[2F@Lb\u0019\u0007", "\u001anZ6bu\u001fW ~hr:\f\t7;", "AsP0^", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[N\u000eH\u0007%\u000b", ">`c5", "4n[9b>,g!\u0006~g2\u000b", "", ">nbAb9=S&", "uKZ<g3B\\b\rzj<|\u0012-e\u000eqi@\r'\u0017Pm\u000e*t/@YS\u0007As\u001a8\u0017$?r4\f)vp9\u000f9\u0013T\u00016NPWuZ\\yD\u0014\u0010i\u0012X4\u001bN5N1jX\u0016\u001f\u0014<IW\"r\u0007\u0010 W f\u007fE,\u0005<`\u001b\u007fP0lO#]\u0004TKUq.m\fmf:DC3\u0018z)\u0017wT8\u0013Q\u0017wwN\u000bc1N\u0015\u0004:m(j`FC~+", "1n\\:b5\u001c]$\u0013", "And?V,", "B`a4X;", "1n\\:b5\u001c`\u0019z\n^\u000b\u0001\u0016/c\u000f2\tD\u0001%", "2ha", ";tbA69>O(~", "1n\\:b5\u001dS ~\n^\u0019|\u0007?r\u000e,\r@\b+", "4h[2B9\u001dW&~xm6\n\u001d", ";tbA8?Ba(", "1n\\:b5\u001ef\u001d\r\nl", "1n\\:b5%W'\u000eg^*\r\u0016=i\u0011(\u0003T", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eoc", "1n\\:b5&S(zyZ;x", "\u001anZ6bu\u001fW ~b^;x\b+t{}", "Ax\\9\\5DB\u0015\f|^;", "=jX<"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class FileSystem {

    /* JADX INFO: renamed from: okio.internal.-FileSystem$collectRecursively$1 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileSystem.collectRecursively(null, null, null, null, false, false, this);
        }
    }

    /* JADX INFO: renamed from: okio.internal.-FileSystem$commonListRecursively$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,i\bDZc|\u0004W\u0006>éFB-!T\u0018\b\tvjg1re\u000f\u0097\u0011"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eo{:\u000105/", "\u001anZ6bu)O(\u0002P"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    static final class C14601 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Path>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Path $dir;
        final /* synthetic */ boolean $followSymlinks;
        final /* synthetic */ okio.FileSystem $this_commonListRecursively;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14601(Path path, okio.FileSystem fileSystem, boolean z2, Continuation<? super C14601> continuation) {
            super(2, continuation);
            this.$dir = path;
            this.$this_commonListRecursively = fileSystem;
            this.$followSymlinks = z2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C14601 c14601 = new C14601(this.$dir, this.$this_commonListRecursively, this.$followSymlinks, continuation);
            c14601.L$0 = obj;
            return c14601;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope<? super Path> sequenceScope, Continuation<? super Unit> continuation) {
            return ((C14601) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SequenceScope sequenceScope;
            ArrayDeque arrayDeque;
            Iterator<Path> it;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                sequenceScope = (SequenceScope) this.L$0;
                arrayDeque = new ArrayDeque();
                arrayDeque.addLast(this.$dir);
                it = this.$this_commonListRecursively.list(this.$dir).iterator();
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$2;
                arrayDeque = (ArrayDeque) this.L$1;
                sequenceScope = (SequenceScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            while (it.hasNext()) {
                Path next = it.next();
                this.L$0 = sequenceScope;
                this.L$1 = arrayDeque;
                this.L$2 = it;
                this.label = 1;
                if (FileSystem.collectRecursively(sequenceScope, this.$this_commonListRecursively, arrayDeque, next, this.$followSymlinks, false, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x00a7, code lost:
    
        if (r12 != false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x00a9, code lost:
    
        if (r7 != 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x00ab, code lost:
    
        r10.addLast(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00b3, code lost:
    
        r1 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0106, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object collectRecursively(kotlin.sequences.SequenceScope<? super okio.Path> r8, okio.FileSystem r9, kotlin.collections.ArrayDeque<okio.Path> r10, okio.Path r11, boolean r12, boolean r13, kotlin.coroutines.Continuation<? super kotlin.Unit> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.FileSystem.collectRecursively(kotlin.sequences.SequenceScope, okio.FileSystem, kotlin.collections.ArrayDeque, okio.Path, boolean, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0046 A[Catch: all -> 0x0059, TRY_ENTER, TryCatch #4 {all -> 0x0059, blocks: (B:46:0x0016, B:60:0x0046, B:61:0x0047, B:55:0x003d, B:47:0x0023, B:53:0x0038), top: B:83:0x0016, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0047 A[Catch: all -> 0x0059, TryCatch #4 {all -> 0x0059, blocks: (B:46:0x0016, B:60:0x0046, B:61:0x0047, B:55:0x003d, B:47:0x0023, B:53:0x0038), top: B:83:0x0016, inners: #3, #5 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void commonCopy(okio.FileSystem r5, okio.Path r6, okio.Path r7) throws java.io.IOException {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            okio.Source r4 = r5.source(r6)
            java.io.Closeable r4 = (java.io.Closeable) r4
            r3 = 0
            r1 = r4
            okio.Source r1 = (okio.Source) r1     // Catch: java.lang.Throwable -> L59
            okio.Sink r0 = r5.sink(r7)     // Catch: java.lang.Throwable -> L59
            okio.BufferedSink r2 = okio.Okio.buffer(r0)     // Catch: java.lang.Throwable -> L59
            java.io.Closeable r2 = (java.io.Closeable) r2     // Catch: java.lang.Throwable -> L59
            r0 = r2
            okio.BufferedSink r0 = (okio.BufferedSink) r0     // Catch: java.lang.Throwable -> L35
            long r0 = r0.writeAll(r1)     // Catch: java.lang.Throwable -> L35
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L35
            if (r2 == 0) goto L33
            r2.close()     // Catch: java.lang.Throwable -> L42
        L33:
            r1 = r3
            goto L43
        L35:
            r1 = move-exception
            if (r2 == 0) goto L40
            r2.close()     // Catch: java.lang.Throwable -> L3c
            goto L40
        L3c:
            r0 = move-exception
            kotlin.ExceptionsKt.addSuppressed(r1, r0)     // Catch: java.lang.Throwable -> L59
        L40:
            r0 = r3
            goto L43
        L42:
            r1 = move-exception
        L43:
            if (r1 != 0) goto L46
            goto L47
        L46:
            throw r1     // Catch: java.lang.Throwable -> L59
        L47:
            java.lang.Object r0 = (java.lang.Object) r0     // Catch: java.lang.Throwable -> L59
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L59
            long r0 = r0.longValue()     // Catch: java.lang.Throwable -> L59
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L59
            if (r4 == 0) goto L66
            r4.close()     // Catch: java.lang.Throwable -> L65
            goto L66
        L59:
            r1 = move-exception
            if (r4 == 0) goto L68
            r4.close()     // Catch: java.lang.Throwable -> L60
            goto L68
        L60:
            r0 = move-exception
            kotlin.ExceptionsKt.addSuppressed(r1, r0)
            goto L68
        L65:
            r3 = move-exception
        L66:
            r1 = r3
            r3 = r0
        L68:
            if (r1 != 0) goto L6d
            java.lang.Object r3 = (java.lang.Object) r3
            return
        L6d:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.FileSystem.commonCopy(okio.FileSystem, okio.Path, okio.Path):void");
    }

    public static final void commonCreateDirectories(okio.FileSystem fileSystem, Path dir, boolean z2) throws IOException {
        Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        Intrinsics.checkNotNullParameter(dir, "dir");
        ArrayDeque arrayDeque = new ArrayDeque();
        for (Path pathParent = dir; pathParent != null && !fileSystem.exists(pathParent); pathParent = pathParent.parent()) {
            arrayDeque.addFirst(pathParent);
        }
        if (z2 && arrayDeque.isEmpty()) {
            throw new IOException(dir + " already exists.");
        }
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            fileSystem.createDirectory((Path) it.next());
        }
    }

    public static final void commonDeleteRecursively(okio.FileSystem fileSystem, Path fileOrDirectory, boolean z2) throws IOException {
        Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        Intrinsics.checkNotNullParameter(fileOrDirectory, "fileOrDirectory");
        Iterator it = SequencesKt.sequence(new FileSystem$commonDeleteRecursively$sequence$1(fileSystem, fileOrDirectory, null)).iterator();
        while (it.hasNext()) {
            fileSystem.delete((Path) it.next(), z2 && !it.hasNext());
        }
    }

    public static final boolean commonExists(okio.FileSystem fileSystem, Path path) throws IOException {
        Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        return fileSystem.metadataOrNull(path) != null;
    }

    public static final Sequence<Path> commonListRecursively(okio.FileSystem fileSystem, Path dir, boolean z2) throws IOException {
        Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        Intrinsics.checkNotNullParameter(dir, "dir");
        return SequencesKt.sequence(new C14601(dir, fileSystem, z2, null));
    }

    public static final FileMetadata commonMetadata(okio.FileSystem fileSystem, Path path) throws IOException {
        Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        FileMetadata fileMetadataMetadataOrNull = fileSystem.metadataOrNull(path);
        if (fileMetadataMetadataOrNull != null) {
            return fileMetadataMetadataOrNull;
        }
        throw new FileNotFoundException("no such file: " + path);
    }

    public static final Path symlinkTarget(okio.FileSystem fileSystem, Path path) throws IOException {
        Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        Path symlinkTarget = fileSystem.metadata(path).getSymlinkTarget();
        if (symlinkTarget == null) {
            return null;
        }
        Path pathParent = path.parent();
        Intrinsics.checkNotNull(pathParent);
        return pathParent.resolve(symlinkTarget);
    }
}
