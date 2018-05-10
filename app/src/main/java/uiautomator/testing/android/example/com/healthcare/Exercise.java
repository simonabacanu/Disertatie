package uiautomator.testing.android.example.com.healthcare;

public class Exercise {

    private int mIdExercise;
    private String mExerciseName;
    private int mRepetitions;
    private int mSeries;

    public Exercise(int mIdExercise, String mExerciseName, int mRepetitions, int mSeries) {
        this.mIdExercise = mIdExercise;
        this.mExerciseName = mExerciseName;
        this.mRepetitions = mRepetitions;
        this.mSeries = mSeries;
    }

    public int getmIdExercise() {
        return mIdExercise;
    }

    public String getmExerciseName() {
        return mExerciseName;
    }

    public int getmRepetitions() {
        return mRepetitions;
    }

    public int getmSeries() {
        return mSeries;
    }

    public void setmIdExercise(int mIdExercise) {
        this.mIdExercise = mIdExercise;
    }

    public void setmExerciseName(String mExerciseName) {
        this.mExerciseName = mExerciseName;
    }

    public void setmRepetitions(int mRepetitions) {
        this.mRepetitions = mRepetitions;
    }

    public void setmSeries(int mSeries) {
        this.mSeries = mSeries;
    }

    @Override
    public String toString() {
        return "Exercise{" +
                "mIdExercise=" + mIdExercise +
                ", mExerciseName='" + mExerciseName + '\'' +
                ", mRepetitions=" + mRepetitions +
                ", mSeries=" + mSeries +
                '}';
    }
}
