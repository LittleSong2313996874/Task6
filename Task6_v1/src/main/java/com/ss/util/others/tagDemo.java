package com.ss.util.others;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class tagDemo extends SimpleTagSupport {
    private Long value;
    private String type;
    private String pattern;

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void doTag() throws JspException, IOException {

        SimpleDateFormat spfmt = new SimpleDateFormat(pattern);
        String result = spfmt.format(value);

        this.getJspContext().getOut().write(result);

    }
}
