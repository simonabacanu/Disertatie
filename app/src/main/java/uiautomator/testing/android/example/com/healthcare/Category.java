package uiautomator.testing.android.example.com.healthcare;

public class Category {

    private int mIdCategory;
    private String mCategoryName;

    public Category(int mIdCategory, String mCategoryName) {
        this.mIdCategory = mIdCategory;
        this.mCategoryName = mCategoryName;
    }

    public int getmIdCategory() {
        return mIdCategory;
    }

    public String getmCategoryName() {
        return mCategoryName;
    }

    public void setmIdCategory(int mIdCategory) {
        this.mIdCategory = mIdCategory;
    }

    public void setmCategoryName(String mCategoryName) {
        this.mCategoryName = mCategoryName;
    }

    @Override
    public String toString() {
        return "Category{" +
                "mIdCategory=" + mIdCategory +
                ", mCategoryName='" + mCategoryName + '\'' +
                '}';
    }
}
