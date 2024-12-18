package dev.project.computersshop.msg;
import org.springframework.http.HttpStatus;
public class Msg {
    private int code;
    private String msg;

    public Msg(String msg){
        this.msg = msg;
    }

    public Msg(HttpStatus code, String msg){
        this.code = code.value();
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(HttpStatus code) {
        this.code = code.value();
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    
}
