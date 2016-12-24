package com.bruce.chang.testpicasso;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by Administrator
 * Date:2016/12/24
 * Time:22:40
 * Author:BruceChang
 * Function:
 */

public class PicassoListViewAdapter extends BaseAdapter {

    private Context mContext;
    public static String[] mStrings = {
            "http://p2.so.qhmsg.com/bdr/_240_/t01ffcdaedde9bcb74c.jpg",
            "http://http://pic1.desk.chinaz.com/file/201201/4/jxipbz8_p.jpg",
            "http://img.article.pchome.net/00/56/35/09/pic_lib/wm/fengjing1.jpg",
            "http://p1.so.qhmsg.com/bdr/_240_/t0189a38410d9b1a6db.jpg",
            "http://p3.so.qhmsg.com/bdr/_240_/t0118233347354d0838.jpg",
            "http://www.1tong.com/uploads/allimg/131217/1-13121G14R70-L.jpg",
            "http://ww1.sinaimg.cn/mw690/b0d9a523jw1fasfnzuyj1j20760760t2.jpg",
            "http://p1.so.qhmsg.com/bdr/_240_/t01ffd622bffeabb5e1.jpg",
            "http://p4.so.qhmsg.com/bdr/_240_/t01956d7d9ed4a92064.jpg",
            "http://ws-ugc.fithub.cc/app/2199695/dynamic/7432/f778b46711474fe9b312ea9386ab2d2b.jpg",
            "http://ws-ugc.fithub.cc/app/2199695/dynamic/7432/cb7a48787b71450f8ea941aeef95a5f9.jpg",
            "http://ws-ugc.fithub.cc/app/2199695/dynamic/7432/6690ce1ec57e47cd98d08c2eb6d1c382.jpg",
            "http://ws-ugc.fithub.cc/app/2199695/dynamic/7432/60c9a63daf7e4a2ab2f765857fa639a1.jpg",
            "http://ws-ugc.fithub.cc/app/2199695/dynamic/7432/488bbab516b84af89b60170ef299b4f1.jpg",
            "http://ws-ugc.fithub.cc/app/2199695/dynamic/7432/bc9bc6cbc59a483397ca05f09cbe26b6.jpg",
            "http://ws-ugc.fithub.cc/app/2199695/dynamic/7432/972c13f79ea74aa09d7742af3c81d00c.jpg",
            "http://ws-ugc.fithub.cc/app/2199695/dynamic/7432/e192b9612a5d4f508255c149771f4e10.jpg"
    };

    public PicassoListViewAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return mStrings.length;
    }

    @Override
    public Object getItem(int i) {
        return mStrings[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view == null) {
            view = View.inflate(mContext, R.layout.item_picasso_listview, null);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.tv_picasso_item.setText("position:" + i);
        Picasso.with(mContext)
                .load(mStrings[i])
                .placeholder(R.mipmap.fbb)//加载过程中的图片
                .error(R.mipmap.ic_launcher)
                .into(viewHolder.iv_picasso_item);


        return view;
    }

    public class ViewHolder {
        ImageView iv_picasso_item;
        TextView tv_picasso_item;

        public ViewHolder(View view) {
            iv_picasso_item = (ImageView) view.findViewById(R.id.iv_picasso_item);
            tv_picasso_item = (TextView) view.findViewById(R.id.tv_picasso_item);
        }
    }
}
