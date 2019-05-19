package irina.com.android_samples.interfaces;

public interface PhotoItemsPresenterCallback {

    void onItemSelected(PhotoItem item);
    void onItemToggleFavorite(PhotoItem item);
    void onLastItemReach(int position);

}
