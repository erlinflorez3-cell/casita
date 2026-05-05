package kotlin.jvm.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import io.sentry.profilemeasurements.ProfileMeasurement;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;
import kotlin.reflect.KCallable;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVisibility;
import kotlin.text.StringsKt;
import kotlinx.serialization.internal.CollectionDescriptorsKt;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яr\u001d<K!&i\u0016DLc\u0003İI\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ljA0R\u0004P.`l2\u000fq|<$i@yCQU\"}(\nWNupvJ`\u001fK\u000f\u001c\u0016\u0001j2N]xk\u001e\u00172HuG3coE9fu>\u000562*8\u007f\u0006\t\u001a@H\u0018v\u0001GS\f /H\u0081BR\u001bS\r\u001a\u0018\tTĨ\u001fk\rm^8Xl\f:]\"3ipO_^}=\\\u001dNb)%zq\u001e1Ae8չ)S\u0011\u000b\u001blMGWqk\u0015\u0019-5paum5\u0007\u007fZƚ+\u0018\u0013k9>\\3\u0019'\fo1],cP<q>\u000fD\u001dJN&\u0006UX^3(2 \u0010Is!S\u0007eJdPL\u0013adFk\u0014\u0004CG ~Wq=)Ne\u00033\u0013TwWͰ#ƟX\u0012x\u0017!\\\u0006Z\u0002oNG`Z\u001aaMs\u0014rr\u0002X\u0004^S.:2e\u0005Ϧ'ھ_=;#q\u000fVR8\u000f\u0013o\u0001S\u0018b~\u0015xÚ\u0018֖.\u0013\u001c\\Ju\u0013}hV^;\u001f`ll\u0015\u0012 \u0013Nl.\u0011wُ\u0012ʽSrylSr\u00187Gh=m|~^oGtK5\u007fsF6)ΰ\u0016͖@l\u0015ZlYa\u001er^.8@[;(\u0006\u0014\\N:#h\u0014Hʡ6Ϝ5#l\u0017N\u001c,TY~\u000fwh{`\u0017bM<\u0003\u00184+]W˞^ʼsq\tK2\u0018n4ECWO'9&:vP\u0015#5\u000f*T\u001eѝNܤPv&w[\u0019.(2;WKK&_\u00177P\u001a-s\\):(˿\u0014ؠ~\u0007\n\u0011A\b<y lvJn}\u001bgb7:v\r\u0003Y\\;ј{ӶJ\u0005WeZ,iPat\tyJa\t\u0015\u0013A6%/\u007fXQ\fԞEے! \b\u001658oo\u0002q4\u001cp\"v\u000bs\u0006Dg&ohR\f5\u0012ΆK˕\u0003D*غ\u0005\u0005Hlx\u001dX^\u0017Z%=XGttf8S\f]%\u0015\u0012baGº]ǈ\u0017s\u001664\b8\u0002\u0014\u001a\"\b[/!Sck}mQ]9I=\u0015AP\b߂\u0014εA$nYh3>\u0014D,DlSd\u001b;7$j\u0001\u0013ޡ\rͲXm\u001e\u0012\u0001,T\r_+@p\f=l\r\u0003(\u0013+\u001fϊb҇d%B\u0003\u0005?AOI[?7\u0006Td9s:\u0011W#\b+j}~\u0015$YJ\u000b\u000eqϑZ܁\u000fOmEO5D\u0016_+s }\u0015\t,\u000bRZ\u001a18\u007f@\u0016K\u0007ͳ\rڀhR|x\u0018\u001d`\u007frG\r2\u0015\u0014L\f\u001f\u000bG\b!u\u0019\u0002#ϭy̢G$\u0011\u0019Jb\u0015\u001e\u0015eLU;\u000f\u0006KK\u0005\u0003\u001a7}gSi:6&V{ZȤ#Ǜ[\u0018v\fcXH(\n\u0018h@\u0017\u001c!:\u0012mbv\t\t\\Hl$Xׇ\u0004եbc{y'\u00025=\u0005\bH\u000ev<Ʀg;"}, d2 = {"\u001aj^A_0G\u001d\u001e\u0010\u0003(0\u0006\u0018/r\t$\u0003\n^\u001e\u0013U}z<w%BY\u0007\u001e7C", "\u001aj^A_0G\u001d&~{e,z\u0018xK]/wN\u000fl", "", "\u001aj^A_0G\u001d\u001e\u0010\u0003(0\u0006\u0018/r\t$\u0003\n^\u001e\u0013U}j8\u0005%48}\u001e>i#*\\GEt\u0012(\u001ew]=\u0010c9$", "8B[.f:", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "uKY.i(\bZ\u0015\b|(\n\u0004\u0005=sUkl", "/m]<g(MW#\b\t", "", "", "5dc\u000ea5Hb\u0015\u000e~h5\u000b", "u(;7T=:\u001d)\u000e~euc\r=tU", "1n]@g9NQ(\t\bl", "", "\u001aj^A_0G\u001d&~{e,z\u0018xK`8\u0005>\u0010\u001b!PE", "5dc\u0010b5Lb&\u000fxm6\n\u0017", "u(;7T=:\u001d)\u000e~euZ\u00136l\u007f&\u000bD\u000b l", "7r0/f;KO\u0017\u000e", "", "7r0/f;KO\u0017\u000e9Z5\u0006\u0013>a\u000f,\u0006I\u000f", "u(E", "u(I", "7r2<`7:\\\u001d\t\u0004", "7r2<`7:\\\u001d\t\u0004\u001d(\u0006\u00129t{7\u007fJ\n%", "7r3.g(", "7r3.g(|O\"\b\u0005m(\f\r9n\u000e", "7r56a(E", "7r56a(E\u0012\u0015\b\u0004h;x\u00183o\t6", "7r5Ba", "7r5Baj:\\\"\t\nZ;\u0001\u00138s", "7r8;a,K", "7r8;a,K\u0012\u0015\b\u0004h;x\u00183o\t6", "7r>=X5", "7r>=X5|O\"\b\u0005m(\f\r9n\u000e", "7rB2T3>R", "7rB2T3>RWz\u0004g6\f\u0005>i\n1\n", "7rE._<>", "7rE._<>\u0012\u0015\b\u0004h;x\u00183o\t6", "5dc\u001763:a'", "u(;7T=:\u001d z\u0004`uZ\u0010+s\u000e}", ";d\\/X9L", "\u001aj^A_0G\u001d&~{e,z\u0018xK]$\u0003G|\u0014\u001eGE", "5dc\u001aX4;S&\r", "<dbAX+\u001cZ\u0015\r\t^:", "5dc\u001bX:MS\u0018\\\u0002Z:\u000b\t=", "=aY2V;\"\\'\u000evg*|", "5dc\u001cU1>Q(b\u0004l;x\u0012-e", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "?tP9\\-BS\u0018gvf,", "", "5dc\u001eh(EW\u001a\u0003z]\u0015x\u0011/", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "AdP9X+,c\u0016|\u0002Z:\u000b\t=", "5dc X(ES\u0018l\u000b[*\u0004\u0005=s\u007f6:<\n !Vk\u001d@\u0001.C", "5dc X(ES\u0018l\u000b[*\u0004\u0005=s\u007f6", "Ah\\=_,'O!~", "5dc \\4IZ\u0019gvf,", "At_2e;R^\u0019\r", "\u001aj^A_0G\u001d&~{e,z\u0018xKn<\u0007@V", "5dc h7>`(\u0013\u0006^:;\u00058n\n7wO\u0005! U", "5dc h7>`(\u0013\u0006^:", "Bx_2C(KO!~\n^9\u000b", "\u001aj^A_0G\u001d&~{e,z\u0018xKn<\u0007@k\u0013$Cw\u000eKv2\u000b", "5dc!l7>>\u0015\fvf,\f\t<s>$\u0005I\u000b&\u0013Vs\u0018E\u0005", "5dc!l7>>\u0015\fvf,\f\t<s", "Dhb6U0EW(\u0013", "\u001aj^A_0G\u001d&~{e,z\u0018xKp,\nD}\u001b\u001eK~\"\u0012", "5dc#\\:BP\u001d\u0006~m@;\u00058n\n7wO\u0005! U", "5dc#\\:BP\u001d\u0006~m@", "u(;8b;EW\"H\b^-\u0004\t-tI\u000elD\u000f\u001b\u0014Kv\u0012K\u000bz", "3pd._:", "=sW2e", "3qa<e", "", "6`b566=S", "", "7r8;f;:\\\u0017~", "D`[BX", "BnBAe0GU", "\u0011n\\=T5B]\"", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ClassReference implements KClass<Object>, ClassBasedDeclarationContainer {
    public static final Companion Companion = new Companion(null);
    private static final Map<Class<? extends Function<?>>, Integer> FUNCTION_CLASSES;
    private static final HashMap<String, String> classFqNames;
    private static final HashMap<String, String> primitiveFqNames;
    private static final HashMap<String, String> primitiveWrapperFqNames;
    private static final Map<String, String> simpleNames;
    private final Class<?> jClass;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u000eӵLcz\u0004I\u0006>-6B\u0015\"4\u0012\u000e\u0007njG6L͜P.hS2\u000fy\b<$q$yCAZ\"}0\u0012WNmgtЁ[!¼?\u0006Dw+1OUޯa\u0012\u001d2\u000b\u0002M@eqS8\u000f|f\r.@:<\n\u0005\u0007\u001bXKX\t\tRc\u000e(/nxjZ\u001b[\u001d\u001e\"\u0006D!/!%\u0002\\F`l\fK_)\u0011{ZP=^^{}\u0015Tb?\u0011\u0007a$,n:\u000693T\u001b\u001fbiO\u000fOyC\u0004x+7+Ot\u0006:\u0007\u0003$\u0017;O;b!(3ӧSԃ\u0010'3Ւ4s^\u0014@\u0014\u000b}\u001d<2\u0016\u0016)X.[\"\u0015\u000fv?\u0005tc@~\nnD\u0010z\u0010>u.VĔ-ݰ\u001ffYĥ\fA\\A\u0014!\u001d 3\u0001\u001d)kV\u001e`C#\u0003~:=aBMH|\u0012i?}\u0004\u001fj`3Z΅IĬ3{\u0019фgMEfQ?1m\u0012Hro\u0007\u0007ph\u0002q\u0001O).~\u0018G*7\u0014jFt\u0005\u001aX3a\u0003ҍOɟX\u0007\u0006ܱc8j\u0004T-5\u0012^O\u0017qzOm\nS7\u001590ʧmް[9fڨ̹Uv"}, d2 = {"\u001aj^A_0G\u001d\u001e\u0010\u0003(0\u0006\u0018/r\t$\u0003\n^\u001e\u0013U}z<w%BY\u0007\u001e7,s8UN7t8(\u001e>", "", "u(E", "\u0014T=\u0010G\u0010(<\u0013\\a:\u001ajh\u001d", "", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u00138;", "", "1kP@f\rJ<\u0015\u0007zl", "\u001aiPCTuNb\u001d\u0006DA(\u000b\f\u0017a\u000b}", "", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E#|%\u001a/k\u0019\u0012", ">qX:\\;Bd\u0019_\u0007G(\u0005\t=", ">qX:\\;Bd\u0019p\bZ7\b\t<F\f\u0011wH\u0001%", "Ah\\=_,'O!~\t", "5dc\u0010_(La\u0005\u000fve0}\r/dh$\u0004@", "8B[.f:", "5dc\u0010_(La\u0007\u0003\u0003i3|q+m\u007f", "7r8;f;:\\\u0017~", "", "D`[BX", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getClassQualifiedName(Class<?> jClass) {
            String str;
            Intrinsics.checkNotNullParameter(jClass, "jClass");
            String str2 = null;
            if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
                return null;
            }
            if (!jClass.isArray()) {
                String str3 = (String) ClassReference.classFqNames.get(jClass.getName());
                return str3 == null ? jClass.getCanonicalName() : str3;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (str = (String) ClassReference.classFqNames.get(componentType.getName())) != null) {
                str2 = str + "Array";
            }
            return str2 == null ? CollectionDescriptorsKt.ARRAY_NAME : str2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
        
            if (r4 == null) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String getClassSimpleName(java.lang.Class<?> r8) {
            /*
                r7 = this;
                java.lang.String r0 = "jClass"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                boolean r1 = r8.isAnonymousClass()
                r0 = 0
                if (r1 == 0) goto Ld
            Lc:
                return r0
            Ld:
                boolean r1 = r8.isLocalClass()
                if (r1 == 0) goto L69
                java.lang.String r5 = r8.getSimpleName()
                java.lang.reflect.Method r1 = r8.getEnclosingMethod()
                r3 = 2
                r6 = 36
                if (r1 == 0) goto L3e
                kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r1 = r1.getName()
                java.lang.StringBuilder r1 = r2.append(r1)
                java.lang.StringBuilder r1 = r1.append(r6)
                java.lang.String r1 = r1.toString()
                java.lang.String r4 = kotlin.text.StringsKt.substringAfter$default(r5, r1, r0, r3, r0)
                if (r4 != 0) goto L9e
            L3e:
                java.lang.reflect.Constructor r1 = r8.getEnclosingConstructor()
                if (r1 == 0) goto L61
                kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r1 = r1.getName()
                java.lang.StringBuilder r1 = r2.append(r1)
                java.lang.StringBuilder r1 = r1.append(r6)
                java.lang.String r1 = r1.toString()
                java.lang.String r0 = kotlin.text.StringsKt.substringAfter$default(r5, r1, r0, r3, r0)
                goto Lc
            L61:
                kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
                java.lang.String r0 = kotlin.text.StringsKt.substringAfter$default(r5, r6, r0, r3, r0)
                goto Lc
            L69:
                boolean r1 = r8.isArray()
                if (r1 == 0) goto La1
                java.lang.Class r3 = r8.getComponentType()
                boolean r1 = r3.isPrimitive()
                java.lang.String r4 = "Array"
                if (r1 == 0) goto L9c
                java.util.Map r2 = kotlin.jvm.internal.ClassReference.access$getSimpleNames$cp()
                java.lang.String r1 = r3.getName()
                java.lang.Object r1 = r2.get(r1)
                java.lang.String r1 = (java.lang.String) r1
                if (r1 == 0) goto L9c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.StringBuilder r0 = r0.append(r4)
                java.lang.String r0 = r0.toString()
            L9c:
                if (r0 != 0) goto Lc
            L9e:
                r0 = r4
                goto Lc
            La1:
                java.util.Map r1 = kotlin.jvm.internal.ClassReference.access$getSimpleNames$cp()
                java.lang.String r0 = r8.getName()
                java.lang.Object r0 = r1.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                if (r0 != 0) goto Lc
                java.lang.String r0 = r8.getSimpleName()
                goto Lc
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.ClassReference.Companion.getClassSimpleName(java.lang.Class):java.lang.String");
        }

        public final boolean isInstance(Object obj, Class<?> jClass) {
            Intrinsics.checkNotNullParameter(jClass, "jClass");
            Map map = ClassReference.FUNCTION_CLASSES;
            Intrinsics.checkNotNull(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) map.get(jClass);
            if (num != null) {
                return TypeIntrinsics.isFunctionOfArity(obj, num.intValue());
            }
            if (jClass.isPrimitive()) {
                jClass = JvmClassMappingKt.getJavaObjectType(JvmClassMappingKt.getKotlinClass(jClass));
            }
            return jClass.isInstance(obj);
        }
    }

    static {
        int i2 = 0;
        List listListOf = CollectionsKt.listOf((Object[]) new Class[]{Function0.class, Function1.class, Function2.class, Function3.class, Function4.class, Function5.class, Function6.class, Function7.class, Function8.class, Function9.class, Function10.class, Function11.class, Function12.class, Function13.class, Function14.class, Function15.class, Function16.class, Function17.class, Function18.class, Function19.class, Function20.class, Function21.class, Function22.class});
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf, 10));
        for (Object obj : listListOf) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(TuplesKt.to((Class) obj, Integer.valueOf(i2)));
            i2 = i3;
        }
        FUNCTION_CLASSES = MapsKt.toMap(arrayList);
        HashMap<String, String> map = new HashMap<>();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put(ProfileMeasurement.UNIT_BYTES, "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put(TypedValues.Custom.S_FLOAT, "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        primitiveFqNames = map;
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        primitiveWrapperFqNames = map2;
        HashMap<String, String> map3 = new HashMap<>();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            Intrinsics.checkNotNull(str);
            Pair pair = TuplesKt.to(sb.append(StringsKt.substringAfterLast$default(str, '.', (String) null, 2, (Object) null)).append("CompanionObject").toString(), str + ".Companion");
            map3.put(pair.getFirst(), pair.getSecond());
        }
        for (Map.Entry<Class<? extends Function<?>>, Integer> entry : FUNCTION_CLASSES.entrySet()) {
            map3.put(entry.getKey().getName(), "kotlin.Function" + entry.getValue().intValue());
        }
        classFqNames = map3;
        HashMap<String, String> map4 = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map4.size()));
        Iterator<T> it = map4.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            linkedHashMap.put(entry2.getKey(), StringsKt.substringAfterLast$default((String) entry2.getValue(), '.', (String) null, 2, (Object) null));
        }
        simpleNames = linkedHashMap;
    }

    public ClassReference(Class<?> jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        this.jClass = jClass;
    }

    private final Void error() {
        throw new KotlinReflectionNotSupportedError();
    }

    public static /* synthetic */ void getSealedSubclasses$annotations() {
    }

    public static /* synthetic */ void getSupertypes$annotations() {
    }

    public static /* synthetic */ void getTypeParameters$annotations() {
    }

    public static /* synthetic */ void getVisibility$annotations() {
    }

    public static /* synthetic */ void isAbstract$annotations() {
    }

    public static /* synthetic */ void isCompanion$annotations() {
    }

    public static /* synthetic */ void isData$annotations() {
    }

    public static /* synthetic */ void isFinal$annotations() {
    }

    public static /* synthetic */ void isFun$annotations() {
    }

    public static /* synthetic */ void isInner$annotations() {
    }

    public static /* synthetic */ void isOpen$annotations() {
    }

    public static /* synthetic */ void isSealed$annotations() {
    }

    public static /* synthetic */ void isValue$annotations() {
    }

    @Override // kotlin.reflect.KClass
    public boolean equals(Object obj) {
        return (obj instanceof ClassReference) && Intrinsics.areEqual(JvmClassMappingKt.getJavaObjectType(this), JvmClassMappingKt.getJavaObjectType((KClass) obj));
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public List<Annotation> getAnnotations() {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public Collection<KFunction<Object>> getConstructors() {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    public Class<?> getJClass() {
        return this.jClass;
    }

    @Override // kotlin.reflect.KClass, kotlin.reflect.KDeclarationContainer
    public Collection<KCallable<?>> getMembers() {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public Collection<KClass<?>> getNestedClasses() {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public Object getObjectInstance() {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public String getQualifiedName() {
        return Companion.getClassQualifiedName(getJClass());
    }

    @Override // kotlin.reflect.KClass
    public List<KClass<? extends Object>> getSealedSubclasses() {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public String getSimpleName() {
        return Companion.getClassSimpleName(getJClass());
    }

    @Override // kotlin.reflect.KClass
    public List<KType> getSupertypes() {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public List<KTypeParameter> getTypeParameters() {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public KVisibility getVisibility() {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public int hashCode() {
        return JvmClassMappingKt.getJavaObjectType(this).hashCode();
    }

    @Override // kotlin.reflect.KClass
    public boolean isAbstract() {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public boolean isCompanion() {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public boolean isData() {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public boolean isFinal() {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public boolean isFun() {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public boolean isInner() {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public boolean isInstance(Object obj) {
        return Companion.isInstance(obj, getJClass());
    }

    @Override // kotlin.reflect.KClass
    public boolean isOpen() {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public boolean isSealed() {
        error();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public boolean isValue() {
        error();
        throw new KotlinNothingValueException();
    }

    public String toString() {
        return getJClass().toString() + " (Kotlin reflection is not available)";
    }
}
