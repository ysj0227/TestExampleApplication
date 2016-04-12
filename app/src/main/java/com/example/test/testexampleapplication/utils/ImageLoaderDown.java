//package com.example.test.testexampleapplication.utils;
//
//import android.content.Context;
//import android.graphics.Bitmap;
//import android.view.View;
//import android.widget.ImageView;
//
//import com.coco_sh.ctao.R;
//import com.nostra13.universalimageloader.core.DisplayImageOptions;
//import com.nostra13.universalimageloader.core.ImageLoader;
//import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
//import com.nostra13.universalimageloader.core.display.FadeInBitmapDisplayer;
//import com.nostra13.universalimageloader.core.listener.ImageLoadingListener;
//import com.nostra13.universalimageloader.core.listener.SimpleImageLoadingListener;
//
//import java.util.Collections;
//import java.util.LinkedList;
//import java.util.List;
//
///**
// * Created by Administrator on 2016/1/5.
// * 图片
// */
//public class ImageLoaderDown {
//    public DisplayImageOptions options;
//    public ImageLoadingListener animateFirstListener = new AnimateFirstDisplayListener();
//    public ImageLoader imageLoader = ImageLoader.getInstance();
//
//    public void imgdown(Context context,String url,ImageView imageView){
//        options = new DisplayImageOptions.Builder()
//                .showImageOnLoading(R.mipmap.bg)
//                .showImageForEmptyUri(R.mipmap.bg)
//                .showImageOnFail(R.mipmap.bg)
//                .cacheInMemory(true)
//                .cacheOnDisc(true)
//                .considerExifParams(true)
//                .build();
//        imageLoader.init(ImageLoaderConfiguration.createDefault(context));
//        imageLoader.displayImage(url, imageView, options, animateFirstListener);
//
//    }
//
//    private static class AnimateFirstDisplayListener extends SimpleImageLoadingListener {
//
//        static final List<String> displayedImages = Collections.synchronizedList(new LinkedList<String>());
//
//        @Override
//        public void onLoadingComplete(String imageUri, View view, Bitmap loadedImage) {
//            if (loadedImage != null) {
//                ImageView imageView = (ImageView) view;
//                boolean firstDisplay = !displayedImages.contains(imageUri);
//                if (firstDisplay) {
//                    FadeInBitmapDisplayer.animate(imageView, 500);
//                    displayedImages.add(imageUri);
//                }
//            }
//        }
//    }
//
//
//}
