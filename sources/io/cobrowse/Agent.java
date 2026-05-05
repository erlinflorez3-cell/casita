package io.cobrowse;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class Agent {
    public final String email;
    public final String id;
    public final String name;

    Agent(Map map) throws SerializationError {
        this.id = (String) TypeUtils.checkNonNull(map.get("id"), String.class);
        this.name = (String) TypeUtils.checkNonNull(map.get("name"), String.class);
        this.email = (String) TypeUtils.check(map.get("email"), String.class);
    }
}
