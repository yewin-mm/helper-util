package pojo;

/**
 * Author: Ye Win,
 * Created_Date: 15/06/2021,
 * Project_Link: <a href="https://github.com/yewin-mm/helper-util">helper-util</a>,
 * Package: pojo
 */

public class StatusObj {
    private String status;
    private String message;

    public StatusObj() {
    }

    public StatusObj(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Status{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

}
