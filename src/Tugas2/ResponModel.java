package Tugas2;

public class ResponModel {
    private String Message;
    private String Status;
    private String Comment;

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
    }

    public ResponModel(){
    }

    ResponModel(String message, String status, String comment) {
        this.Message = message;
        this.Comment = comment;
        this.Status = status;
    }
}
