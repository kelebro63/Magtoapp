package com.kelebro63.magtoapp.Utils;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/**
 * Created by Bistrov Alexey on 22.12.2015.
 */
public class Utils {

    public static int dpToPx(Context context, int dp) {
        return (int) (dpToPxF(context, dp) + 0.5);
    }

    public static int pxToDp(int px)
    {
        return (int) (px / Resources.getSystem().getDisplayMetrics().density);
    }

    public static float dpToPxF(Context context, float dp) {
        final DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return dp * displayMetrics.density;
    }


}
