package uiautomator.testing.android.example.com.healthcare;

public class Exercise {

    private int mId;
    private String mName;
    private int mRepetitions;
    private int mSeries;

    public Exercise(int mId, String mName, int mRepetitions, int mSeries) {
        this.mId = mId;
        this.mName = mName;
        this.mRepetitions = mRepetitions;
        this.mSeries = mSeries;
    }

    public int getmId() {
        return mId;
    }

    public String getmName() {
        return mName;
    }

    public int getmRepetitions() {
        return mRepetitions;
    }

    public int getmSeries() {
        return mSeries;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public void setmName(String mName) {
        this.mName = mName;
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
                "mId=" + mId +
                ", mName='" + mName + '\'' +
                ", mRepetitions=" + mRepetitions +
                ", mSeries=" + mSeries +
                '}';
    }
}
