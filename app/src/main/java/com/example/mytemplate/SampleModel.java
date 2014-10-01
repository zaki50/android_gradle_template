package com.example.mytemplate;

import net.vvakame.util.jsonpullparser.annotation.JsonKey;
import net.vvakame.util.jsonpullparser.annotation.JsonModel;

@JsonModel
public class SampleModel {
    @JsonKey
    public String dummyKey;

    public String getDummyKey() {
        return dummyKey;
    }

    public void setDummyKey(String dummyKey) {
        this.dummyKey = dummyKey;
    }
}
