package learn.something.builder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Builder {

    public static class InternalBuilder {
        private Map<String, Object> map;

        private Builder builder;

        public InternalBuilder(Builder builder) {
            this.builder = builder;
            map = builder.resultMap;
        }

        public InternalBuilder(Builder builder, Map<String, Object> map) {
            this.builder = builder;
            this.map = map;
        }

        public InternalBuilder add(String key, Object value) {
            map.put(key, value);
            return this;
        }

        public Builder end() {
            return builder;
        }
    }

    private Map<String, Object> resultMap = new HashMap<>();

    public Builder() {
    }

    public InternalBuilder root(Map<String, Object> map) {
        resultMap.putAll(map);
        return new InternalBuilder(this);
    }

    public InternalBuilder root() {
        return new InternalBuilder(this);
    }

    public InternalBuilder inputX(String key, String xKey) {
        Map<String, List<Map<String, Object>>> inputXMap = new HashMap<>();
        List<Map<String, Object>> inputList = new ArrayList<>();
        HashMap<String, Object> inputMap = new HashMap<>();

        inputList.add(inputMap);
        inputXMap.put(xKey, inputList);
        resultMap.put(key, inputXMap);

        return new InternalBuilder(this, inputMap);
    }

    public String build() {
        return resultMap.toString();
    }
}
