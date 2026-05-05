package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class PointFParser implements ValueParser<PointF> {
    public static final PointFParser INSTANCE = new PointFParser();

    private PointFParser() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.airbnb.lottie.parser.ValueParser
    public PointF parse(JsonReader jsonReader, float f2) throws IOException {
        JsonReader.Token tokenPeek = jsonReader.peek();
        if (tokenPeek != JsonReader.Token.BEGIN_ARRAY && tokenPeek != JsonReader.Token.BEGIN_OBJECT) {
            if (tokenPeek != JsonReader.Token.NUMBER) {
                throw new IllegalArgumentException("Cannot convert json to point. Next token is " + tokenPeek);
            }
            PointF pointF = new PointF(((float) jsonReader.nextDouble()) * f2, ((float) jsonReader.nextDouble()) * f2);
            while (jsonReader.hasNext()) {
                jsonReader.skipValue();
            }
            return pointF;
        }
        return JsonUtils.jsonToPoint(jsonReader, f2);
    }
}
