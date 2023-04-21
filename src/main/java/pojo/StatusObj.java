package pojo;

/**
 * Author: Ye Win
 * Created_Date: 15/06/2021
 * Project: @{<a href="https://github.com/yewin-mm/helper-util">...</a>}
 * Package: pojo
 */

public class StatusObj {
    String status;
    String message;

    public StatusObj() {
    }

    public StatusObj(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Status{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

}
