package test;



public class TestEnum {

    private TeamStatus status;

    public enum TeamStatus {
        QUALIFIED,
        DISQUALIFIED;
    }

    public boolean isQualified() {
        if(getStatus() == TeamStatus.QUALIFIED) {
            return true;
        }
        return false;
    }

    public TeamStatus getStatus() {
        return status;
    }

    public void setStatus(TeamStatus status) {
        this.status = status;
    }
}
