package com.bruce.chang.testpicasso;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import jp.wasabeef.picasso.transformations.BlurTransformation;
import jp.wasabeef.picasso.transformations.ColorFilterTransformation;
import jp.wasabeef.picasso.transformations.CropCircleTransformation;
import jp.wasabeef.picasso.transformations.CropSquareTransformation;
import jp.wasabeef.picasso.transformations.CropTransformation;
import jp.wasabeef.picasso.transformations.GrayscaleTransformation;
import jp.wasabeef.picasso.transformations.MaskTransformation;
import jp.wasabeef.picasso.transformations.RoundedCornersTransformation;
import jp.wasabeef.picasso.transformations.gpu.BrightnessFilterTransformation;
import jp.wasabeef.picasso.transformations.gpu.ContrastFilterTransformation;
import jp.wasabeef.picasso.transformations.gpu.InvertFilterTransformation;
import jp.wasabeef.picasso.transformations.gpu.KuwaharaFilterTransformation;
import jp.wasabeef.picasso.transformations.gpu.PixelationFilterTransformation;
import jp.wasabeef.picasso.transformations.gpu.SepiaFilterTransformation;
import jp.wasabeef.picasso.transformations.gpu.SketchFilterTransformation;
import jp.wasabeef.picasso.transformations.gpu.SwirlFilterTransformation;
import jp.wasabeef.picasso.transformations.gpu.ToonFilterTransformation;
import jp.wasabeef.picasso.transformations.gpu.VignetteFilterTransformation;

/**
 * Created by Administrator
 * Date:2016/12/24
 * Time:22:59
 * Author:BruceChang
 * Function:
 */

public class PicassoTransformationAdapter extends BaseAdapter {
    private Context mContext;
    private List<String> mList;

    public PicassoTransformationAdapter(Context mContext) {
        this.mContext = mContext;
        mList = new ArrayList<>();
        for (int i = 1; i <= 36; i++) {
            mList.add("" + i);
        }
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int i) {
        return mList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        PicassoTransformationAdapter.ViewHolder viewHolder;
        if (view == null) {
            view = View.inflate(mContext, R.layout.item_picasso_transformation, null);
            viewHolder = new PicassoTransformationAdapter.ViewHolder(view);
            view.setTag(viewHolder);
        } else {
            viewHolder = (PicassoTransformationAdapter.ViewHolder) view.getTag();
        }

        int integer = Integer.parseInt(mList.get(i));
        viewHolder.tv_picasso_item.setText("position:" + integer);
        switch (integer) {

            case 1: {
                int width = Utils.dip2px(mContext, 133.33f);
                int height = Utils.dip2px(mContext, 126.33f);
                Picasso.with(mContext)
                        .load(R.mipmap.fbb)
                        .resize(width, height)
                        .centerCrop()
                        .transform((new MaskTransformation(mContext, R.drawable.mask_starfish)))
                        .into(viewHolder.iv_picasso_item);
                break;
            }
            case 2: {
                int width = Utils.dip2px(mContext, 150.0f);
                int height = Utils.dip2px(mContext, 100.0f);
                Picasso.with(mContext)
                        .load(R.mipmap.fbb)
                        .resize(width, height)
                        .centerCrop()
                        .transform(new MaskTransformation(mContext, R.drawable.mask_chat_right))
                        .into(viewHolder.iv_picasso_item);
                break;
            }
            case 3:
                Picasso.with(mContext)
                        .load(R.mipmap.fbb)
                        .transform(new CropTransformation(300, 100, CropTransformation.GravityHorizontal.LEFT,
                                CropTransformation.GravityVertical.TOP))
                        .into(viewHolder.iv_picasso_item);
                break;
            case 4:
                Picasso.with(mContext).load(R.mipmap.fbb)
                        .transform(new CropTransformation(300, 100)).into(viewHolder.iv_picasso_item);
                break;
            case 5:
                Picasso.with(mContext)
                        .load(R.mipmap.fbb)
                        .transform(new CropTransformation(300, 100, CropTransformation.GravityHorizontal.LEFT,
                                CropTransformation.GravityVertical.BOTTOM))
                        .into(viewHolder.iv_picasso_item);
                break;
            case 6:
                Picasso.with(mContext)
                        .load(R.mipmap.fbb)
                        .transform(new CropTransformation(300, 100, CropTransformation.GravityHorizontal.CENTER,
                                CropTransformation.GravityVertical.TOP))
                        .into(viewHolder.iv_picasso_item);
                break;
            case 7:
                Picasso.with(mContext)
                        .load(R.mipmap.fbb)
                        .transform(new CropTransformation(300, 100))
                        .into(viewHolder.iv_picasso_item);
                break;
            case 8:
                Picasso.with(mContext)
                        .load(R.mipmap.fbb)
                        .transform(new CropTransformation(300, 100, CropTransformation.GravityHorizontal.CENTER,
                                CropTransformation.GravityVertical.BOTTOM))
                        .into(viewHolder.iv_picasso_item);
                break;
            case 9:
                Picasso.with(mContext)
                        .load(R.mipmap.fbb)
                        .transform(new CropTransformation(300, 100, CropTransformation.GravityHorizontal.RIGHT,
                                CropTransformation.GravityVertical.TOP))
                        .into(viewHolder.iv_picasso_item);
                break;
            case 10:
                Picasso.with(mContext)
                        .load(R.mipmap.fbb)
                        .transform(new CropTransformation(300, 100, CropTransformation.GravityHorizontal.RIGHT,
                                CropTransformation.GravityVertical.CENTER))
                        .into(viewHolder.iv_picasso_item);
                break;
            case 11:
                Picasso.with(mContext)
                        .load(R.mipmap.fbb)
                        .transform(new CropTransformation(300, 100, CropTransformation.GravityHorizontal.RIGHT,
                                CropTransformation.GravityVertical.BOTTOM))
                        .into(viewHolder.iv_picasso_item);
                break;
            case 12:
                Picasso.with(mContext)
                        .load(R.mipmap.fbb)
                        .transform(new CropTransformation((float) 16 / (float) 9,
                                CropTransformation.GravityHorizontal.CENTER,
                                CropTransformation.GravityVertical.CENTER))
                        .into(viewHolder.iv_picasso_item);
                break;
            case 13:
                Picasso.with(mContext)
                        .load(R.mipmap.fbb)
                        .transform(new CropTransformation((float) 4 / (float) 3,
                                CropTransformation.GravityHorizontal.CENTER,
                                CropTransformation.GravityVertical.CENTER))
                        .into(viewHolder.iv_picasso_item);
                break;
            case 14:
                Picasso.with(mContext)
                        .load(R.mipmap.fbb)
                        .transform(new CropTransformation(3, CropTransformation.GravityHorizontal.CENTER,
                                CropTransformation.GravityVertical.CENTER))
                        .into(viewHolder.iv_picasso_item);
                break;
            case 15:
                Picasso.with(mContext)
                        .load(R.mipmap.fbb)
                        .transform(new CropTransformation(3, CropTransformation.GravityHorizontal.CENTER,
                                CropTransformation.GravityVertical.TOP))
                        .into(viewHolder.iv_picasso_item);
                break;
            case 16:
                Picasso.with(mContext)
                        .load(R.mipmap.fbb)
                        .transform(new CropTransformation(1, CropTransformation.GravityHorizontal.CENTER,
                                CropTransformation.GravityVertical.CENTER))
                        .into(viewHolder.iv_picasso_item);
                break;
            case 17:
                Picasso.with(mContext)
                        .load(R.mipmap.fbb)
                        .transform(new CropTransformation((float) 0.5, (float) 0.5,
                                CropTransformation.GravityHorizontal.CENTER,
                                CropTransformation.GravityVertical.CENTER))
                        .into(viewHolder.iv_picasso_item);
                break;
            case 18:
                Picasso.with(mContext)
                        .load(R.mipmap.fbb)
                        .transform(new CropTransformation((float) 0.5, (float) 0.5,
                                CropTransformation.GravityHorizontal.CENTER,
                                CropTransformation.GravityVertical.TOP))
                        .into(viewHolder.iv_picasso_item);
                break;
            case 19:
                Picasso.with(mContext)
                        .load(R.mipmap.fbb)
                        .transform(new CropTransformation((float) 0.5, (float) 0.5,
                                CropTransformation.GravityHorizontal.RIGHT,
                                CropTransformation.GravityVertical.BOTTOM))
                        .into(viewHolder.iv_picasso_item);
                break;
            case 20:
                Picasso.with(mContext)
                        .load(R.mipmap.fbb)
                        .transform(new CropTransformation((float) 0.5, 0, (float) 4 / (float) 3,
                                CropTransformation.GravityHorizontal.CENTER,
                                CropTransformation.GravityVertical.CENTER))
                        .into(viewHolder.iv_picasso_item);
                break;
            case 21:
                Picasso.with(mContext)
                        .load(R.mipmap.fbb)
                        .transform(new CropSquareTransformation())
                        .into(viewHolder.iv_picasso_item);
                break;
            case 22:
                Picasso.with(mContext)
                        .load(R.mipmap.fbb)
                        .transform(new CropCircleTransformation())
                        .into(viewHolder.iv_picasso_item);
                break;
            case 23:
                Picasso.with(mContext)
                        .load(R.mipmap.fbb)
                        .transform(new ColorFilterTransformation(Color.argb(80, 255, 0, 0)))
                        .into(viewHolder.iv_picasso_item);
                break;
            case 24:
                Picasso.with(mContext)
                        .load(R.mipmap.fbb)
                        .transform(new GrayscaleTransformation())
                        .into(viewHolder.iv_picasso_item);
                break;
            case 25:
                Picasso.with(mContext)
                        .load(R.mipmap.fbb)
                        .transform(new RoundedCornersTransformation(30, 0,
                                RoundedCornersTransformation.CornerType.BOTTOM_LEFT))
                        .into(viewHolder.iv_picasso_item);
                break;
            case 26:
                Picasso.with(mContext)
                        .load(R.mipmap.fbb)
                        .transform(new BlurTransformation(mContext, 25, 1))
                        .into(viewHolder.iv_picasso_item);
                break;
            case 27:
                Picasso.with(mContext)
                        .load(R.mipmap.fbb)
                        .transform(new ToonFilterTransformation(mContext))
                        .into(viewHolder.iv_picasso_item);
                break;
            case 28:
                Picasso.with(mContext)
                        .load(R.mipmap.fbb)
                        .transform(new SepiaFilterTransformation(mContext))
                        .into(viewHolder.iv_picasso_item);
                break;
            case 29:
                Picasso.with(mContext)
                        .load(R.mipmap.fbb)
                        .transform(new ContrastFilterTransformation(mContext, 2.0f))
                        .into(viewHolder.iv_picasso_item);
                break;
            case 30:
                Picasso.with(mContext)
                        .load(R.mipmap.fbb)
                        .transform(new InvertFilterTransformation(mContext))
                        .into(viewHolder.iv_picasso_item);
                break;
            case 31:
                Picasso.with(mContext)
                        .load(R.mipmap.fbb)
                        .transform(new PixelationFilterTransformation(mContext, 20))
                        .into(viewHolder.iv_picasso_item);
                break;
            case 32:
                Picasso.with(mContext)
                        .load(R.mipmap.fbb)
                        .transform(new SketchFilterTransformation(mContext))
                        .into(viewHolder.iv_picasso_item);
                break;
            case 33:
                Picasso.with(mContext)
                        .load(R.mipmap.fbb)
                        .transform(new SwirlFilterTransformation(mContext, 0.5f, 1.0f, new PointF(0.5f, 0.5f)))
                        .into(viewHolder.iv_picasso_item);

                break;
            case 34:
                Picasso.with(mContext)
                        .load(R.mipmap.fbb)
                        .transform(new BrightnessFilterTransformation(mContext, 0.5f))
                        .into(viewHolder.iv_picasso_item);
                break;
            case 35:
                Picasso.with(mContext)
                        .load(R.mipmap.fbb)
                        .transform(new KuwaharaFilterTransformation(mContext, 25))
                        .into(viewHolder.iv_picasso_item);
                break;
            case 36:
                Picasso.with(mContext)
                        .load(R.mipmap.fbb)
                        .transform(new VignetteFilterTransformation(mContext, new PointF(0.5f, 0.5f),
                                new float[]{0.0f, 0.0f, 0.0f}, 0f, 0.75f))
                        .into(viewHolder.iv_picasso_item);
                break;
        }


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
