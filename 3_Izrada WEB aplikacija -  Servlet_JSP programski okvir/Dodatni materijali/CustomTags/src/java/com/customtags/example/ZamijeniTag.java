package com.customtags.example;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTag;
import javax.servlet.jsp.tagext.Tag;

public class ZamijeniTag implements BodyTag {

    private PageContext pageContext;
    private Tag parentTag;
    private BodyContent bodyContent;
    private String oldString;
    private String newString;
    private JspWriter out;

    public void setPageContext(PageContext pPageContext) {
        pageContext = pPageContext;
    }

    public void setParent(Tag pParentTag) {
        parentTag = pParentTag;
    }

    public Tag getParent() {
        return parentTag;
    }

    public void setOldString(String oldString) {
        this.oldString = oldString;
    }

    public void setNewString(String newString) {
        this.newString = newString;
    }

    public void setBodyContent(BodyContent pBodyContent) {
        bodyContent = pBodyContent;
    }

    public void doInitBody() throws JspException {
    }

    public int doStartTag() throws JspException {
        return EVAL_BODY_BUFFERED;
    }

    public int doAfterBody() throws JspException {
        String text = bodyContent.getString();
        text = text.replace(oldString, newString);
        try {
            out = bodyContent.getEnclosingWriter();
            out.print(text);
        } catch (IOException e) {
            throw new JspException("Error");
        }
        return SKIP_BODY;
    }

    public int doEndTag() throws JspException {
        return EVAL_PAGE;
    }

    public void release() {
    }

}
