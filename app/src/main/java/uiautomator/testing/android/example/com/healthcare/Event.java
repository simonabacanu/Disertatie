package uiautomator.testing.android.example.com.healthcare;

public class Event {

    private int mIdEvent;
    private String mEventName;
    private String mEventType;
    private int mTimer;

    public Event(int mIdEvent, String mEventName, String mEventType, int mTimer) {
        this.mIdEvent = mIdEvent;
        this.mEventName = mEventName;
        this.mEventType = mEventType;
        this.mTimer = mTimer;
    }

    public int getmIdEvent() {
        return mIdEvent;
    }

    public String getmEventName() {
        return mEventName;
    }

    public String getmEventType() {
        return mEventType;
    }

    public int getmTimer() {
        return mTimer;
    }

    public void setmIdEvent(int mIdEvent) {
        this.mIdEvent = mIdEvent;
    }

    public void setmEventName(String mEventName) {
        this.mEventName = mEventName;
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
                "mIdEvent=" + mIdEvent +
                ", mEventName='" + mEventName + '\'' +
                ", mEventType='" + mEventType + '\'' +
                ", mTimer=" + mTimer +
                '}';
    }
}
