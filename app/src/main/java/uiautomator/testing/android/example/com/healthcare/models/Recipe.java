package uiautomator.testing.android.example.com.healthcare.models;

public class Recipe {

    private int mId;
    private String mName;
    private String mDescription;
    private String mIngredients;
    private int mTime;

    public Recipe () {
        mId = 0;
        mName = "";
        mDescription = "";
        mIngredients = "";
        mTime = 0;
    }

    public Recipe(int mId, String mName, String mDescription, String mIngredients, int mTime) {
        this.mId = mId;
        this.mName = mName;
        this.mDescription = mDescription;
        this.mIngredients = mIngredients;
        this.mTime = mTime;
    }

    public int getmId() {
        return mId;
    }

    public String getmName() {
        return mName;
    }

    public String getmDescription() {
        return mDescription;
    }

    public String getmIngredients() {
        return mIngredients;
    }

    public int getmTime() {
        return mTime;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public void setmIngredients(String mIngredients) {
        this.mIngredients = mIngredients;
    }

    public void setmTime(int mTime) {
        this.mTime = mTime;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "mId=" + mId +
                ", mName='" + mName + '\'' +
                ", mDescription='" + mDescription + '\'' +
                ", mIngredients='" + mIngredients + '\'' +
                ", mTime=" + mTime +
                '}';
    }
}
