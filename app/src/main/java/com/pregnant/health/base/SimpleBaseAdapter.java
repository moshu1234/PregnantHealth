package com.pregnant.health.base;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Adapter基类
 */
public abstract class SimpleBaseAdapter<T> extends BaseAdapter {

    protected Context mContext;
    private LayoutInflater mInflater;
    protected List<T> mDatas;

    public SimpleBaseAdapter(Context context, List<T> mDatas) {
        this.mContext = context;
        mInflater = LayoutInflater.from(mContext);
        this.mDatas = mDatas == null ? new ArrayList<T>() : new ArrayList<T>(mDatas);
    }

    public Context getContext() {
        return mContext;
    }

    public List<T> getDataList() {
        return mDatas;
    }

    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public T getItem(int position) {
        if (position >= mDatas.size())
            return null;
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    /**
     * 该方法需要子类实现，需要返回item布局的resource id
     *
     * @return resource id
     */
    public abstract int getItemResource();

    /**
     * 使用该getItemView方法替换原来的getView方法，需要子类实现
     *
     * @param position position
     * @param convertView convertView
     * @param holder holder
     */
    public abstract void bindData(int position, View convertView, ViewHolder holder);

    @SuppressWarnings("unchecked")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (null == convertView) {
            convertView = mInflater.inflate(getItemResource(), parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        bindData(position, convertView, holder);
        return convertView;
    }

    public class ViewHolder {
        private SparseArray<View> views = new SparseArray<View>();
        private View convertView;

        public ViewHolder(View convertView) {
            this.convertView = convertView;
        }

        @SuppressWarnings("unchecked")
        public <T extends View> T findView(int resId) {
            View v = views.get(resId);
            if (null == v) {
                v = convertView.findViewById(resId);
                views.put(resId, v);
            }
            return (T) v;
        }
    }

    public void addAll(List<T> elem) {
        mDatas.addAll(elem);
        notifyDataSetChanged();
    }

    public void add(T elem) {
        mDatas.add(elem);
        notifyDataSetChanged();
    }

    public void add(int location, T elem) {
        mDatas.add(location, elem);
        notifyDataSetChanged();
    }

    public void remove(T elem) {
        mDatas.remove(elem);
        notifyDataSetChanged();
    }

    public void remove(int index) {
        mDatas.remove(index);
        notifyDataSetChanged();
    }

    public void replace(int index, T elem){
        mDatas.remove(index);
        mDatas.add(index, elem);
        notifyDataSetChanged();
    }

    public void replaceAll(List<T> elem) {
        mDatas.clear();
        if (elem != null) {
            mDatas.addAll(elem);
        }
        notifyDataSetChanged();
    }

    public void clear() {
        if (mDatas == null) {
            return;
        }
        mDatas.clear();
        notifyDataSetChanged();
    }
}
