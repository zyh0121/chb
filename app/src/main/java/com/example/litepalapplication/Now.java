package com.example.litepalapplication;

import com.google.gson.annotations.SerializedName;

public class Now
{
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More
    {
        @SerializedName("txt_d")
        public String info;

    }
}
