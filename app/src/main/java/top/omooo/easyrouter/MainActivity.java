package top.omooo.easyrouter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import top.omooo.router.EasyRouter;
import top.omooo.router_annotations.annotations.BindMetaDataAnn;

@BindMetaDataAnn("main")
public class MainActivity extends AppCompatActivity {

    // TODO: 2019/3/21
    /**
     * 遗留问题汇总
     * 1. JavaPoet 抛出 Map
     * 2. Logger 错误调用链
     * 3. 多个 pageName 情况
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tv_jump_to_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EasyRouter.getInstance().with(MainActivity.this).navigate("second");
            }
        });
        findViewById(R.id.tv_jump_to_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EasyRouter.getInstance().with(MainActivity.this).navigate("third");
            }
        });
    }
}
