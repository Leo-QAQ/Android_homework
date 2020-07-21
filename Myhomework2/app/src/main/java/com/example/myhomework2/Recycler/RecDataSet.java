package com.example.myhomework2.Recycler;
import androidx.annotation.DrawableRes;

import com.example.myhomework2.R;

import java.util.ArrayList;
import java.util.List;
public class RecDataSet {
    public static List<RecData> getData() {
        List<RecData> result = new ArrayList();
        result.add(new RecData(R.drawable.b69094914,"孔子","敏而好学，不耻下问。"));
        result.add(new RecData(R.drawable.b147039442,"王勃","海内存知已，天涯若比邻。"));
        result.add(new RecData(R.drawable.b266577594,"高适",".莫愁前路无知已，天下谁人不识君。"));
        result.add(new RecData(R.drawable.b315206942,"李白","天生我材必有用。"));
        result.add(new RecData(R.drawable.b431386563,"林则徐","海纳百川有容乃大；壁立千仞无欲则刚。"));
        result.add(new RecData(R.drawable.b431388796,"孟子","穷则独善其身，达则兼济天下。"));
        result.add(new RecData(R.drawable.b1552514642686,"韩愈","业精于勤，荒于嬉；行成于思，毁于随。"));
        result.add(new RecData(R.drawable.b1557079214729,"杜甫","读书破万卷，下笔如有神。"));
        return result;
    }
}
