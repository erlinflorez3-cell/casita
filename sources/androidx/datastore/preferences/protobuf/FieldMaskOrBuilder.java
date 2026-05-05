package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface FieldMaskOrBuilder extends MessageLiteOrBuilder {
    String getPaths(int i2);

    ByteString getPathsBytes(int i2);

    int getPathsCount();

    List<String> getPathsList();
}
