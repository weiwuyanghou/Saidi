package com.w4675.bangumi;

import android.support.v4.app.Fragment;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class shouye extends Fragment implements View.OnClickListener {
    public static final String TITLE_TAG = "tabTitle";
    //  private MyOpenHelper helper = null;     //定义MyOpenHelper类的对象----用于打开数据库
    //  private SQLiteDatabase db = null;       //定义SQLiteDataBase类的对象----操作数据库
    private Button bt1, bt2;

    public static shouye newInstance(String tabTitle) {

        Bundle args = new Bundle();
        shouye fragment = new shouye();
        args.putString(TITLE_TAG, tabTitle);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, container, false);
        bt1 = view.findViewById(R.id.button);
        bt2 = view.findViewById(R.id.button2);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
//        View view1 = inflater.inflate(R.layout.listview1,null);
//       TextView ftv = view.findViewById(R.id.frtv1);
        //       ListView listView = view.findViewById(R.id.lv);
/*        ImageView iv1 = view1.findViewById(R.id.ivicon);
            ftv.setText("");
            //String Url = "data/data/com.w4675.bangumi/cache/123.jpg";
        String Url = "https://yt3.ggpht.com/a-/AAuE7mADOXw6HCuYhNqZUKYxYHLgkxtzO7loIerFFA=s300-mo-c-c0xffffffff-rj-k-no";
        Glide.with(this).load(Url).fitCenter().into(iv1);
*/
//        MyAdapter myAdapter = new MyAdapter();
        //       listView.setAdapter(myAdapter);
        return view;
    }

@Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                Add fragment1 = null;
                fragment1 = new Add();
                if (fragment1 != null) {
                    FragmentTransaction ft = getFragmentManager().beginTransaction();
                    ft.replace(R.id.cont_frame, fragment1);
                    ft.commit();
                }
                break;
            case R.id.button2:

                break;
        }

    }
}
