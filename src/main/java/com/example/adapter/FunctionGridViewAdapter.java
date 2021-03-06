package com.example.adapter;

import android.content.Context;
import android.widget.SimpleAdapter;

import com.example.activity.R;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by wangz on 2016/11/20.
 */

public class FunctionGridViewAdapter{

    ArrayList arrayList;
    int imageId[] = {R.drawable.dropbox, R.drawable.instagram, R.drawable.evernote,
            R.drawable.feed, R.drawable.flickr,R.drawable.forrst};
    String description[] = {"号码纸","查看医生","药品","病例","检查","缴费"};
    SimpleAdapter simpleAdapter;
    Context context;

    public FunctionGridViewAdapter(Context context) {
        super();
        this.context = context;
        arrayList = new ArrayList();
    }
    public SimpleAdapter getAdapter(){
        simpleAdapter = new SimpleAdapter(context, getArrayList(),
                R.layout.item_main_activity_tab1_gridview,new String[]{"image", "description"},
                new int[]{R.id.imageView, R.id.textView});
        return simpleAdapter;
    }

    private ArrayList<HashMap<String, Object>> getArrayList(){
        for(int i = 0; i < imageId.length; i++){
            HashMap<String,Object> map = new HashMap<String,Object>();
            map.put("image", imageId[i]);
            map.put("description", description[i]);
            arrayList.add(map);
        }
        return arrayList;
    }
}
