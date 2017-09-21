package com.bwie.test.liuhaifeng20170920;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.google.gson.Gson;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements NetDataCallback {
    private RecyclerView mrv;
    private String url="https://news-at.zhihu.com/api/4/news/latest";
    private Myadapter md;
    private Http http;
    private ArrayList<News.StoriesBean> mlist=new ArrayList<>();
    public Handler hand=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            Gson gson=new Gson();
            super.handleMessage(msg);
            if (msg.what==1){
                News news = gson.fromJson(msg.obj.toString(), News.class);
                // mlist=(ArrayList<newsdata.databean>) newsData.getData();
                mlist=(ArrayList<News.StoriesBean>) news.getStories();
                md.setdata((ArrayList<News.StoriesBean>) mlist);
                md.notifyDataSetChanged();

            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mrv=(RecyclerView)findViewById(R.id.recy);
        initdata();
        mrv.setLayoutManager(new LinearLayoutManager(this));
        md=new Myadapter(this,mlist);
        mrv.setAdapter(md);

        //RecyclerView条目的点击事件
        md.setOnItemClickListener(new Myadapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int postion) {
                Toast.makeText(MainActivity.this, mlist.get(postion).getTitle(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initdata() {
        Http http=new Http();
        http.getdata(url,this);
    }


    @Override
    public void callback(String str) {
        Message msg = Message.obtain();
        msg.what=1;
        msg.obj=str;
        hand.sendMessage(msg);

    }

    @Override
    public void err(int code, String s) {

    }
}
