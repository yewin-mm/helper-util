package pojo;

/**
 * Author: Ye Win,
 * Created_Date: 15/06/2021,
 * Project_Link: <a href="https://github.com/yewin-mm/helper-util">helper-util</a>,
 * Package: pojo
 */

public class ServiceResponse {
    private StatusObj status;
    private Object data;
    private String timestamp;

    public ServiceResponse() {
    }

    public ServiceResponse(StatusObj status, Object data, String timestamp) {
        this.status = status;
        this.data = data;
        this.timestamp = timestamp;
    }

    public StatusObj getStatus() {
        return status;
    }

    public Object getData() {
        return data;
    }

    public String getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "Response{" +
                "status=" + status +
                ", data=" + data +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }

}
