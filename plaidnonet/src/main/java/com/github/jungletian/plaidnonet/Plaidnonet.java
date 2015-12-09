package com.github.jungletian.plaidnonet;

import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 *
 * Created by zhangtianjun on 15/12/8.
 */
public class Plaidnonet extends ImageView {

    public Plaidnonet(Context context) {
        this(context, null);
    }


    public Plaidnonet(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }


    public Plaidnonet(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setImageResource(R.drawable.plaid_no_connection);
    }

    public void start() {

        final AnimatedVectorDrawable avd =
                (AnimatedVectorDrawable) getContext().getDrawable(
                        R.drawable.avd_plaid_no_connection);
        setImageDrawable(avd);
        avd.start();
    }


}
