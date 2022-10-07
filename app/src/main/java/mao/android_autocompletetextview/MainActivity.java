package mao.android_autocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.AutoCompleteTextView);

        String country[] =
                {
                        "阿尔巴尼亚", "阿尔及利亚", "阿富汗", "阿根廷", "埃及", "爱尔兰", "澳大利亚",
                        "巴哈马", "白俄罗斯", "百慕大", "巴基斯坦", "巴拿马", "保加利亚", "巴西", "冰岛",
                        "波兰", "朝鲜", "丹麦", "厄瓜多尔", "俄罗斯", "法国", "芬兰", "菲律宾", "古巴",
                        "韩国", "荷兰", "哈萨克斯坦", "加纳", "加拿大", "柬埔寨", "利比里亚", "利比亚", "马尔代夫",
                        "美国", "蒙古", "缅甸", "秘鲁", "摩洛哥", "墨西哥", "尼日利亚", "葡萄牙", "日本",
                        "瑞典", "瑞士", "塞尔维亚", "苏丹", "泰国", "乌克兰", "西班牙", "希腊", "新加坡", "新西兰",
                        "匈牙利", "叙利亚", "牙买加", "伊拉克", "伊朗", "印度", "印度尼西亚", "英国",
                        "越南", "以色列", "中国大陆", "中国澳门", "中国香港", "中国台湾", "智利", "中非共和国"
                };

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1
                , country);
        autoCompleteTextView.setAdapter(arrayAdapter);

    }
}