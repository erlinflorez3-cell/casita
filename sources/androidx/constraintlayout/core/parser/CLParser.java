package androidx.constraintlayout.core.parser;

/* JADX INFO: loaded from: classes4.dex */
public class CLParser {
    static boolean DEBUG = false;
    private boolean hasComment = false;
    private int lineNumber;
    private String mContent;

    enum TYPE {
        UNKNOWN,
        OBJECT,
        ARRAY,
        NUMBER,
        STRING,
        KEY,
        TOKEN
    }

    public static CLObject parse(String str) throws CLParsingException {
        return new CLParser(str).parse();
    }

    public CLParser(String str) {
        this.mContent = str;
    }

    public CLObject parse() throws CLParsingException {
        char c2;
        char[] charArray = this.mContent.toCharArray();
        int length = charArray.length;
        int i2 = 1;
        this.lineNumber = 1;
        boolean z2 = false;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                i3 = -1;
                break;
            }
            char c3 = charArray[i3];
            if (c3 == '{') {
                break;
            }
            if (c3 == '\n') {
                this.lineNumber++;
            }
            i3++;
        }
        if (i3 == -1) {
            throw new CLParsingException("invalid json content", null);
        }
        CLObject cLObjectAllocate = CLObject.allocate(charArray);
        cLObjectAllocate.setLine(this.lineNumber);
        cLObjectAllocate.setStart(i3);
        int i4 = i3 + 1;
        CLElement container = cLObjectAllocate;
        while (i4 < length) {
            char c4 = charArray[i4];
            if (c4 == '\n') {
                this.lineNumber += i2;
            }
            if (this.hasComment) {
                if (c4 == '\n') {
                    this.hasComment = z2;
                } else {
                    continue;
                    i4++;
                    i2 = 1;
                    z2 = false;
                }
            }
            if (container == null) {
                break;
            }
            if (container.isDone()) {
                container = getNextJsonElement(i4, c4, container, charArray);
            } else if (container instanceof CLObject) {
                if (c4 == '}') {
                    container.setEnd(i4 - 1);
                } else {
                    container = getNextJsonElement(i4, c4, container, charArray);
                }
            } else if (!(container instanceof CLArray)) {
                boolean z3 = container instanceof CLString;
                if (z3) {
                    if (charArray[(int) container.start] == c4) {
                        container.setStart(container.start + 1);
                        container.setEnd(i4 - 1);
                    }
                } else {
                    if (container instanceof CLToken) {
                        CLToken cLToken = (CLToken) container;
                        if (!cLToken.validate(c4, i4)) {
                            throw new CLParsingException("parsing incorrect token " + cLToken.content() + " at line " + this.lineNumber, cLToken);
                        }
                    }
                    if (((container instanceof CLKey) || z3) && (((c2 = charArray[(int) container.start]) == '\'' || c2 == '\"') && c2 == c4)) {
                        container.setStart(container.start + 1);
                        container.setEnd(i4 - 1);
                    }
                    if (!container.isDone() && (c4 == '}' || c4 == ']' || c4 == ',' || c4 == ' ' || c4 == '\t' || c4 == '\r' || c4 == '\n' || c4 == ':')) {
                        long j2 = i4 - 1;
                        container.setEnd(j2);
                        if (c4 == '}' || c4 == ']') {
                            container = container.getContainer();
                            container.setEnd(j2);
                            if (container instanceof CLKey) {
                                container = container.getContainer();
                                container.setEnd(j2);
                            }
                        }
                    }
                }
            } else if (c4 == ']') {
                container.setEnd(i4 - 1);
            } else {
                container = getNextJsonElement(i4, c4, container, charArray);
            }
            if (container.isDone() && (!(container instanceof CLKey) || ((CLKey) container).mElements.size() > 0)) {
                container = container.getContainer();
            }
            i4++;
            i2 = 1;
            z2 = false;
        }
        while (container != null && !container.isDone()) {
            if (container instanceof CLString) {
                container.setStart(((int) container.start) + 1);
            }
            container.setEnd(length - 1);
            container = container.getContainer();
        }
        if (DEBUG) {
            System.out.println("Root: " + cLObjectAllocate.toJSON());
        }
        return cLObjectAllocate;
    }

    private CLElement getNextJsonElement(int i2, char c2, CLElement cLElement, char[] cArr) throws CLParsingException {
        if (c2 == '\t' || c2 == '\n' || c2 == '\r' || c2 == ' ') {
            return cLElement;
        }
        if (c2 == '\"' || c2 == '\'') {
            if (cLElement instanceof CLObject) {
                return createElement(cLElement, i2, TYPE.KEY, true, cArr);
            }
            return createElement(cLElement, i2, TYPE.STRING, true, cArr);
        }
        if (c2 == '[') {
            return createElement(cLElement, i2, TYPE.ARRAY, true, cArr);
        }
        if (c2 != ']') {
            if (c2 == '{') {
                return createElement(cLElement, i2, TYPE.OBJECT, true, cArr);
            }
            if (c2 != '}') {
                switch (c2) {
                    case '+':
                    case '-':
                    case '.':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        return createElement(cLElement, i2, TYPE.NUMBER, true, cArr);
                    case ',':
                    case ':':
                        return cLElement;
                    case '/':
                        int i3 = i2 + 1;
                        if (i3 >= cArr.length || cArr[i3] != '/') {
                            return cLElement;
                        }
                        this.hasComment = true;
                        return cLElement;
                    default:
                        if ((cLElement instanceof CLContainer) && !(cLElement instanceof CLObject)) {
                            CLElement cLElementCreateElement = createElement(cLElement, i2, TYPE.TOKEN, true, cArr);
                            CLToken cLToken = (CLToken) cLElementCreateElement;
                            if (cLToken.validate(c2, i2)) {
                                return cLElementCreateElement;
                            }
                            throw new CLParsingException("incorrect token <" + c2 + "> at line " + this.lineNumber, cLToken);
                        }
                        return createElement(cLElement, i2, TYPE.KEY, true, cArr);
                }
            }
        }
        cLElement.setEnd(i2 - 1);
        CLElement container = cLElement.getContainer();
        container.setEnd(i2);
        return container;
    }

    private CLElement createElement(CLElement cLElement, int i2, TYPE type, boolean z2, char[] cArr) {
        CLElement cLElementAllocate;
        if (DEBUG) {
            System.out.println("CREATE " + type + " at " + cArr[i2]);
        }
        switch (AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE[type.ordinal()]) {
            case 1:
                cLElementAllocate = CLObject.allocate(cArr);
                i2++;
                break;
            case 2:
                cLElementAllocate = CLArray.allocate(cArr);
                i2++;
                break;
            case 3:
                cLElementAllocate = CLString.allocate(cArr);
                break;
            case 4:
                cLElementAllocate = CLNumber.allocate(cArr);
                break;
            case 5:
                cLElementAllocate = CLKey.allocate(cArr);
                break;
            case 6:
                cLElementAllocate = CLToken.allocate(cArr);
                break;
            default:
                cLElementAllocate = null;
                break;
        }
        if (cLElementAllocate == null) {
            return null;
        }
        cLElementAllocate.setLine(this.lineNumber);
        if (z2) {
            cLElementAllocate.setStart(i2);
        }
        if (cLElement instanceof CLContainer) {
            cLElementAllocate.setContainer((CLContainer) cLElement);
        }
        return cLElementAllocate;
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.parser.CLParser$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE;

        static {
            int[] iArr = new int[TYPE.values().length];
            $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE = iArr;
            try {
                iArr[TYPE.OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE[TYPE.ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE[TYPE.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE[TYPE.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE[TYPE.KEY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$parser$CLParser$TYPE[TYPE.TOKEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }
}
