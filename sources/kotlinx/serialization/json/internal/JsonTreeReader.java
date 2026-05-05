package kotlinx.serialization.json.internal;

import java.util.ArrayList;
import kotlin.DeepRecursiveFunction;
import kotlin.DeepRecursiveKt;
import kotlin.DeepRecursiveScope;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonPrimitive;
import yg.InterfaceC1492Gx;

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
@Metadata(bv = {}, d1 = {"ЯL\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njG9L͜P.`Y2şs{J$c$wECU0}*ޛWN}gvϺb\u000bY\u000f\u000eǝ\u0001jBI]xk\u0012\u00172HoE\u074ccڎm9\u000fsv\u00180608\u0012\u0005/\u001b:L\u001ex\u0013Cy\u000fܘ4@~>\u001b\u0011[\u000e2\u00124Hh\u0007,g\u007fNdR3]\u000351\u000f\u0002B|1&0ES\u001bSl';\u0001(\u001esUEC-%\u0002\u00127\\iO\u001bE\u0002?\u0015hU1YZ:ɑ<!\u000e\"'CO;p#*j\u0019i`:-qO,j^\u001b@w)\u00065H\u0014\u0010\u0016'vD=\u001cv\b<=#\b\u001aö\u000fڕ]ۍȸ~aD.u\fA0Q\u001b\u0015W8ݥ\u001b\u05ee;{\rټn/\u000fp9[\u0003\u00117ڀ\u001dƻ{Q9҅\u0011IVU\"YkuZ͒n͆.\u00048ϚČ/}\u0019.\u001d<ۄ_Q"}, d2 = {"\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006z.DY\u000b)3t_\u0013[MDZA\u001e\u0015Ua5\u0006c9$", "", "1n]3\\.N`\u0015\u000e~h5", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006[3?b[*@n\u001a0]P7z8(\u001e>", ":dg2e", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006z.DY\u000b)3t_\nJQJx0\u001c$MoC\u0010J,av4\u001d", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `L}\u0018E@\nCc\u0007}Av\u00172OSHgC\"\u001fq7 \rm;Uz0Z\u0016\\,iVnD\u0018'V\u001dR5\u0016N^O.w\u000e;(\u0017,V\u000b7oJg\u0013\u001cDwl@etU\u0004\u001e\\A<hS/#j", "7r;2a0>\\(", "", "AsP0^\u000b>^(\u0002", "", "@dP1", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006[3?b]'7u\u00167\\\u0019", "@dP149KO-", "@dP17,>^\u0006~xn9\u000b\r@e", "@dP1B)CS\u0017\u000e", "@dP1B)CS\u0017\u000e^f7\u0004", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006[3?bg\u001d<m\u0014=#", "@dP1X9", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "@dP1I(Ec\u0019", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006[3?bh-;u\u001a=QT;A", "7rBAe0GU", "\u001aj^A_0G\u001dw~zi\u0019|\u0007?r\u000e,\r@n\u0015!Roc", "", "uKZ<g3B\\b]z^7i\t-u\r6\u007fQ\u0001\u0005\u0015Qz\u000e\u0012]+?h\u0005$@7\u00148ZMKz8'\u0015v+\u0017\u0011l;R\u007f7C[R6e(6$\u0019\u000ek\n\u00182\t\u000e[\u000b\u000ekI7\u001d\u0017\u0002", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u001c%Qx"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class JsonTreeReader {
    private final boolean isLenient;
    private final AbstractJsonLexer lexer;
    private int stackDepth;

    /* JADX INFO: renamed from: kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!4i\bDZc|\u0004O\u00068é<Ȑ\u0017\"Z\u0011 \u0013vlI0rfX0bSX\u000e\u001a{d(i&\nCiV`ԍ`"}, d2 = {"\n`]<a@F])\rS", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006[3?b]'7u\u00167\\\u0019", "\u001aj^A_0G\u001dw~zi\u0019|\u0007?r\u000e,\r@n\u0015!Roc", "", "7s"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function3<DeepRecursiveScope<Unit, JsonElement>, Unit, Continuation<? super JsonElement>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(DeepRecursiveScope<Unit, JsonElement> deepRecursiveScope, Unit unit, Continuation<? super JsonElement> continuation) {
            AnonymousClass1 anonymousClass1 = JsonTreeReader.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = deepRecursiveScope;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                DeepRecursiveScope deepRecursiveScope = (DeepRecursiveScope) this.L$0;
                byte bPeekNextToken = JsonTreeReader.this.lexer.peekNextToken();
                if (bPeekNextToken == 1) {
                    return JsonTreeReader.this.readValue(true);
                }
                if (bPeekNextToken == 0) {
                    return JsonTreeReader.this.readValue(false);
                }
                if (bPeekNextToken != 6) {
                    if (bPeekNextToken == 8) {
                        return JsonTreeReader.this.readArray();
                    }
                    AbstractJsonLexer.fail$default(JsonTreeReader.this.lexer, "Can't begin reading element, unexpected token", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                this.label = 1;
                obj = JsonTreeReader.this.readObject(deepRecursiveScope, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return (JsonElement) obj;
        }
    }

    /* JADX INFO: renamed from: kotlinx.serialization.json.internal.JsonTreeReader$readObject$2, reason: invalid class name */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return JsonTreeReader.this.readObject(null, this);
        }
    }

    public JsonTreeReader(JsonConfiguration configuration, AbstractJsonLexer lexer) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        this.lexer = lexer;
        this.isLenient = configuration.isLenient();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonElement readArray() {
        byte bConsumeNextToken = this.lexer.consumeNextToken();
        if (this.lexer.peekNextToken() == 4) {
            AbstractJsonLexer.fail$default(this.lexer, "Unexpected leading comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        ArrayList arrayList = new ArrayList();
        while (this.lexer.canConsumeValue()) {
            arrayList.add(read());
            bConsumeNextToken = this.lexer.consumeNextToken();
            if (bConsumeNextToken != 4) {
                AbstractJsonLexer abstractJsonLexer = this.lexer;
                boolean z2 = bConsumeNextToken == 9;
                int i2 = abstractJsonLexer.currentPosition;
                if (!z2) {
                    AbstractJsonLexer.fail$default(abstractJsonLexer, "Expected end of the array or comma", i2, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        if (bConsumeNextToken == 8) {
            this.lexer.consumeNextToken((byte) 9);
        } else if (bConsumeNextToken == 4) {
            AbstractJsonLexer.fail$default(this.lexer, "Unexpected trailing comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        return new JsonArray(arrayList);
    }

    private final JsonElement readDeepRecursive() {
        return (JsonElement) DeepRecursiveKt.invoke(new DeepRecursiveFunction(new AnonymousClass1(null)), Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078 A[PHI: r0 r2 r3 r12
  0x0078: PHI (r0v6 byte) = (r0v3 byte), (r0v20 byte) binds: [B:23:0x0073, B:12:0x004b] A[DONT_GENERATE, DONT_INLINE]
  0x0078: PHI (r2v2 kotlinx.serialization.json.internal.JsonTreeReader) = (r2v0 kotlinx.serialization.json.internal.JsonTreeReader), (r2v5 kotlinx.serialization.json.internal.JsonTreeReader) binds: [B:23:0x0073, B:12:0x004b] A[DONT_GENERATE, DONT_INLINE]
  0x0078: PHI (r3v2 java.util.LinkedHashMap) = (r3v1 java.util.LinkedHashMap), (r3v6 java.util.LinkedHashMap) binds: [B:23:0x0073, B:12:0x004b] A[DONT_GENERATE, DONT_INLINE]
  0x0078: PHI (r12v1 kotlin.DeepRecursiveScope<kotlin.Unit, kotlinx.serialization.json.JsonElement>) = 
  (r12v0 kotlin.DeepRecursiveScope<kotlin.Unit, kotlinx.serialization.json.JsonElement>)
  (r12v2 kotlin.DeepRecursiveScope<kotlin.Unit, kotlinx.serialization.json.JsonElement>)
 binds: [B:23:0x0073, B:12:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00a0 -> B:11:0x003d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object readObject(kotlin.DeepRecursiveScope<kotlin.Unit, kotlinx.serialization.json.JsonElement> r12, kotlin.coroutines.Continuation<? super kotlinx.serialization.json.JsonElement> r13) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.JsonTreeReader.readObject(kotlin.DeepRecursiveScope, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r1 != 6) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        r7.lexer.consumeNextToken((byte) 7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        return new kotlinx.serialization.json.JsonObject(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        if (r1 == 4) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(r7.lexer, "Unexpected trailing comma", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final kotlinx.serialization.json.JsonElement readObject() {
        /*
            r7 = this;
            kotlinx.serialization.json.internal.AbstractJsonLexer r0 = r7.lexer
            r6 = 6
            byte r1 = r0.consumeNextToken(r6)
            kotlinx.serialization.json.internal.AbstractJsonLexer r0 = r7.lexer
            byte r0 = r0.peekNextToken()
            r5 = 4
            if (r0 == r5) goto L7f
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
        L15:
            kotlinx.serialization.json.internal.AbstractJsonLexer r0 = r7.lexer
            boolean r0 = r0.canConsumeValue()
            r3 = 7
            if (r0 == 0) goto L42
            boolean r0 = r7.isLenient
            if (r0 == 0) goto L56
            kotlinx.serialization.json.internal.AbstractJsonLexer r0 = r7.lexer
            java.lang.String r2 = r0.consumeStringLenient()
        L28:
            kotlinx.serialization.json.internal.AbstractJsonLexer r1 = r7.lexer
            r0 = 5
            r1.consumeNextToken(r0)
            kotlinx.serialization.json.JsonElement r1 = r7.read()
            r0 = r4
            java.util.Map r0 = (java.util.Map) r0
            r0.put(r2, r1)
            kotlinx.serialization.json.internal.AbstractJsonLexer r0 = r7.lexer
            byte r1 = r0.consumeNextToken()
            if (r1 == r5) goto L15
            if (r1 != r3) goto L6e
        L42:
            if (r1 != r6) goto L53
            kotlinx.serialization.json.internal.AbstractJsonLexer r0 = r7.lexer
            r0.consumeNextToken(r3)
        L49:
            kotlinx.serialization.json.JsonObject r0 = new kotlinx.serialization.json.JsonObject
            java.util.Map r4 = (java.util.Map) r4
            r0.<init>(r4)
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0
            return r0
        L53:
            if (r1 == r5) goto L5d
            goto L49
        L56:
            kotlinx.serialization.json.internal.AbstractJsonLexer r0 = r7.lexer
            java.lang.String r2 = r0.consumeString()
            goto L28
        L5d:
            kotlinx.serialization.json.internal.AbstractJsonLexer r0 = r7.lexer
            r4 = 6
            r5 = 0
            java.lang.String r1 = "Unexpected trailing comma"
            r2 = 0
            r3 = 0
            kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(r0, r1, r2, r3, r4, r5)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        L6e:
            kotlinx.serialization.json.internal.AbstractJsonLexer r0 = r7.lexer
            r4 = 6
            r5 = 0
            java.lang.String r1 = "Expected end of the object or comma"
            r2 = 0
            r3 = 0
            kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(r0, r1, r2, r3, r4, r5)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        L7f:
            kotlinx.serialization.json.internal.AbstractJsonLexer r0 = r7.lexer
            r4 = 6
            r5 = 0
            java.lang.String r1 = "Unexpected leading comma"
            r2 = 0
            r3 = 0
            kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(r0, r1, r2, r3, r4, r5)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.JsonTreeReader.readObject():kotlinx.serialization.json.JsonElement");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (r1 != 6) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        r7.lexer.consumeNextToken((byte) 7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        return new kotlinx.serialization.json.JsonObject(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        if (r1 == 4) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(r7.lexer, "Unexpected trailing comma", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final kotlinx.serialization.json.JsonObject readObjectImpl(kotlin.jvm.functions.Function0<? extends kotlinx.serialization.json.JsonElement> r8) {
        /*
            r7 = this;
            kotlinx.serialization.json.internal.AbstractJsonLexer r0 = r7.lexer
            r6 = 6
            byte r1 = r0.consumeNextToken(r6)
            kotlinx.serialization.json.internal.AbstractJsonLexer r0 = r7.lexer
            byte r0 = r0.peekNextToken()
            r5 = 4
            if (r0 == r5) goto L7f
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
        L15:
            kotlinx.serialization.json.internal.AbstractJsonLexer r0 = r7.lexer
            boolean r0 = r0.canConsumeValue()
            r3 = 7
            if (r0 == 0) goto L44
            boolean r0 = r7.isLenient
            if (r0 == 0) goto L56
            kotlinx.serialization.json.internal.AbstractJsonLexer r0 = r7.lexer
            java.lang.String r2 = r0.consumeStringLenient()
        L28:
            kotlinx.serialization.json.internal.AbstractJsonLexer r1 = r7.lexer
            r0 = 5
            r1.consumeNextToken(r0)
            java.lang.Object r1 = r8.invoke()
            kotlinx.serialization.json.JsonElement r1 = (kotlinx.serialization.json.JsonElement) r1
            r0 = r4
            java.util.Map r0 = (java.util.Map) r0
            r0.put(r2, r1)
            kotlinx.serialization.json.internal.AbstractJsonLexer r0 = r7.lexer
            byte r1 = r0.consumeNextToken()
            if (r1 == r5) goto L15
            if (r1 != r3) goto L6e
        L44:
            if (r1 != r6) goto L53
            kotlinx.serialization.json.internal.AbstractJsonLexer r0 = r7.lexer
            r0.consumeNextToken(r3)
        L4b:
            kotlinx.serialization.json.JsonObject r0 = new kotlinx.serialization.json.JsonObject
            java.util.Map r4 = (java.util.Map) r4
            r0.<init>(r4)
            return r0
        L53:
            if (r1 == r5) goto L5d
            goto L4b
        L56:
            kotlinx.serialization.json.internal.AbstractJsonLexer r0 = r7.lexer
            java.lang.String r2 = r0.consumeString()
            goto L28
        L5d:
            kotlinx.serialization.json.internal.AbstractJsonLexer r0 = r7.lexer
            r4 = 6
            r5 = 0
            java.lang.String r1 = "Unexpected trailing comma"
            r2 = 0
            r3 = 0
            kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(r0, r1, r2, r3, r4, r5)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        L6e:
            kotlinx.serialization.json.internal.AbstractJsonLexer r0 = r7.lexer
            r4 = 6
            r5 = 0
            java.lang.String r1 = "Expected end of the object or comma"
            r2 = 0
            r3 = 0
            kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(r0, r1, r2, r3, r4, r5)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        L7f:
            kotlinx.serialization.json.internal.AbstractJsonLexer r0 = r7.lexer
            r4 = 6
            r5 = 0
            java.lang.String r1 = "Unexpected leading comma"
            r2 = 0
            r3 = 0
            kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(r0, r1, r2, r3, r4, r5)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.JsonTreeReader.readObjectImpl(kotlin.jvm.functions.Function0):kotlinx.serialization.json.JsonObject");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonPrimitive readValue(boolean z2) {
        String strConsumeStringLenient = (this.isLenient || !z2) ? this.lexer.consumeStringLenient() : this.lexer.consumeString();
        return (z2 || !Intrinsics.areEqual(strConsumeStringLenient, "null")) ? new JsonLiteral(strConsumeStringLenient, z2, null, 4, null) : JsonNull.INSTANCE;
    }

    public final JsonElement read() {
        byte bPeekNextToken = this.lexer.peekNextToken();
        if (bPeekNextToken == 1) {
            return readValue(true);
        }
        if (bPeekNextToken == 0) {
            return readValue(false);
        }
        if (bPeekNextToken != 6) {
            if (bPeekNextToken == 8) {
                return readArray();
            }
            AbstractJsonLexer.fail$default(this.lexer, "Cannot begin reading element, unexpected token: " + ((int) bPeekNextToken), 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i2 = this.stackDepth + 1;
        this.stackDepth = i2;
        this.stackDepth--;
        return i2 == 200 ? readDeepRecursive() : readObject();
    }
}
