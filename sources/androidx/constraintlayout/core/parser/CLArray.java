package androidx.constraintlayout.core.parser;

/* JADX INFO: loaded from: classes4.dex */
public class CLArray extends CLContainer {
    public CLArray(char[] cArr) {
        super(cArr);
    }

    public static CLElement allocate(char[] cArr) {
        return new CLArray(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected String toJSON() {
        StringBuilder sb = new StringBuilder(getDebugName() + "[");
        boolean z2 = true;
        for (int i2 = 0; i2 < this.mElements.size(); i2++) {
            if (!z2) {
                sb.append(", ");
            } else {
                z2 = false;
            }
            sb.append(this.mElements.get(i2).toJSON());
        }
        return ((Object) sb) + "]";
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected String toFormattedJSON(int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        String json = toJSON();
        if (i3 <= 0 && json.length() + i2 < MAX_LINE) {
            sb.append(json);
        } else {
            sb.append("[\n");
            boolean z2 = true;
            for (CLElement cLElement : this.mElements) {
                if (!z2) {
                    sb.append(",\n");
                } else {
                    z2 = false;
                }
                addIndent(sb, BASE_INDENT + i2);
                sb.append(cLElement.toFormattedJSON(BASE_INDENT + i2, i3 - 1));
            }
            sb.append("\n");
            addIndent(sb, i2);
            sb.append("]");
        }
        return sb.toString();
    }
}
