package com.hive.udf;

import org.apache.hadoop.hive.ql.exec.UDF;

public class MyJsonParser extends UDF {

    public String evaluate(String json,int index)
    {
        String[] fields=json.split("\"");
        String[] res = new String[]{fields[3],fields[7],fields[11],fields[15]};
        return res[index];
    }
}
