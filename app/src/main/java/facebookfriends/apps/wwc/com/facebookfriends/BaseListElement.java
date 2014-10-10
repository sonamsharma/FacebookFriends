package facebookfriends.apps.wwc.com.facebookfriends;

/**
 * Created by chonam on 10/10/14.
 */
import android.graphics.drawable.Drawable;
import  android.widget.BaseAdapter;
import android.view.View;

public abstract class BaseListElement {
    private Drawable icon;
    private String text1;
    private String text2;
    private int requestCode;
    private BaseAdapter adapter;
    protected abstract View.OnClickListener getOnClickListener();

    public void setAdapter(BaseAdapter adapter) {
        this.adapter = adapter;
    }



    protected BaseListElement(Drawable icon, String text1, String text2, int requestCode) {
        this.icon = icon;
        this.text1 = text1;
        this.text2 = text2;
        this.requestCode = requestCode;
    }

    public int getRequestCode() {
        return requestCode;
    }

    public void setText2(String text2) {
        this.text2 = text2;
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    public void setText1(String text1) {
        this.text1 = text1;
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    public Drawable getIcon() {
        return icon;
    }

    public String getText1() {
        return text1;
    }

    public String getText2() {
        return text2;
    }


}
