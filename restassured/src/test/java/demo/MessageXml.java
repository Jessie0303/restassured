package demo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MessageXml {
    private String message;
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
