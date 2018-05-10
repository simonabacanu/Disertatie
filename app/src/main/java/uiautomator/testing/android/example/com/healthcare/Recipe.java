package uiautomator.testing.android.example.com.healthcare;

public class Recipe {

    private int mIdRecipe;
    private String mRecipeName;
    private String mDescription;
    private String mIngredients;
    private int mTime;

    public Recipe(int mIdRecipe, String mRecipeName, String mDescription, String mIngredients, int mTime) {
        this.mIdRecipe = mIdRecipe;
        this.mRecipeName = mRecipeName;
        this.mDescription = mDescription;
        this.mIngredients = mIngredients;
        this.mTime = mTime;
    }

    public int getmIdRecipe() {
        return mIdRecipe;
    }

    public String getmRecipeName() {
        return mRecipeName;
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

    public void setmIdRecipe(int mIdRecipe) {
        this.mIdRecipe = mIdRecipe;
    }

    public void setmRecipeName(String mRecipeName) {
        this.mRecipeName = mRecipeName;
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
                "mIdRecipe=" + mIdRecipe +
                ", mRecipeName='" + mRecipeName + '\'' +
                ", mDescription='" + mDescription + '\'' +
                ", mIngredients='" + mIngredients + '\'' +
                ", mTime=" + mTime +
                '}';
    }
}
