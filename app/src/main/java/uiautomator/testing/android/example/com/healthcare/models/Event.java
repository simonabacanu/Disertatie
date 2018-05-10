package uiautomator.testing.android.example.com.healthcare.models;

public class Event {

    private int mId;
    private String mName;
    private String mEventType;
    private int mTimer;

    public Event () {
        mId = 0;
        mName = "";
        mEventType = "";
        mTimer = 0;
    }

    public Event(int mId, String mName, String mEventType, int mTimer) {
        this.mId = mId;
        this.mName = mName;
        this.mEventType = mEventType;
        this.mTimer = mTimer;
    }

    public int getmId() {
        return mId;
    }

    public String getmName() {
        return mName;
    }

    public String getmEventType() {
        return mEventType;
    }

    public int getmTimer() {
        return mTimer;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setmEventType(String mEventType) {
        this.mEventType = mEventType;
    }

    public void setmTimer(int mTimer) {
        this.mTimer = mTimer;
    }

    @Override
    public String toString() {
        return "Event{" +
                "mId=" + mId +
                ", mName='" + mName + '\'' +
                ", mEventType='" + mEventType + '\'' +
                ", mTimer=" + mTimer +
                '}';
    }
}
