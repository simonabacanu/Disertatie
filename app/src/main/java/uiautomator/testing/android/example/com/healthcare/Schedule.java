package uiautomator.testing.android.example.com.healthcare;

public class Schedule {

    private int mIdSchedule;
    private String mScheduleName;


    public Schedule(int mIdSchedule, String mScheduleName) {
        this.mIdSchedule = mIdSchedule;
        this.mScheduleName = mScheduleName;
    }

    public int getmIdSchedule() {
        return mIdSchedule;
    }

    public String getmScheduleName() {
        return mScheduleName;
    }

    public void setmIdSchedule(int mIdSchedule) {
        this.mIdSchedule = mIdSchedule;
    }

    public void setmScheduleName(String mScheduleName) {
        this.mScheduleName = mScheduleName;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "mIdSchedule=" + mIdSchedule +
                ", mScheduleName='" + mScheduleName + '\'' +
                '}';
    }
}
