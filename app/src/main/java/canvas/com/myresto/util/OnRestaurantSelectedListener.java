package canvas.com.myresto.util;

import java.util.ArrayList;

import canvas.com.myresto.models.Restaurant;

public interface OnRestaurantSelectedListener {
    public void onRestaurantSelected(Integer position, ArrayList<Restaurant> restaurants, String source);
}
