package uiautomator.testing.android.example.com.healthcare;

public class Program {

    private int mId;
    private String mName;


    public Program(int mId, String mName) {
        this.mId = mId;
        this.mName = mName;
    }

    public int getmId() {
        return mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    @Override
    public String toString() {
        return "Program{" +
                "mId=" + mId +
                ", mName='" + mName + '\'' +
                '}';
    }
}
