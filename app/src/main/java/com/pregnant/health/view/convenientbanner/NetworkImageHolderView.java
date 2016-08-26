package com.pregnant.health.view.convenientbanner;


import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.pregnant.health.R;
import com.pregnant.health.utils.ImageLoadProxy;
import com.pregnant.health.utils.T;

/**
 * 网络图片加载例子
 */
public class NetworkImageHolderView implements CBPageAdapter.Holder<String>{
    private ImageView imageView;
    @Override
    public View createView(Context context) {
//        你可以通过layout文件来创建，也可以像我一样用代码创建，不一定是Image，任何控件都可以进行翻页
        imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return imageView;
    }

    @Override
    public void UpdateUI(final Context context, int position, final String url) {
        imageView.setImageResource(R.drawable.ic_loading_small);
        ImageLoadProxy.displayImage(url, imageView, ImageLoadProxy.getOptions4Header());
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //点击事件
                T.showToast("click");
//                Toast.makeText(view.getContext(), "点击了第" + position + "个", Toast.LENGTH_SHORT).show();
            }
        });
    }

}