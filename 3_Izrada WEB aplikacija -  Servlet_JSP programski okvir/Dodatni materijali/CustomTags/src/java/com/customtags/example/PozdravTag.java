package com.customtags.example;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.tagext.Tag;

public class PozdravTag implements Tag {

    private PageContext pageContext;
    private Tag parentTag;

    @Override
    public int doEndTag() throws JspException {
        return EVAL_PAGE;
    }

    @Override
    public int doStartTag() throws JspException {
        try {

            JspWriter out = pageContext.getOut();
            out.print("Pozdrav s kolegija Java III!");
        } catch (Exception e) {
            throw new JspException("Error");
        }
        return SKIP_BODY;
    }

    @Override
    public Tag getParent() {
        return parentTag;
    }

    @Override
    public void release() {
    }

    @Override
    public void setPageContext(PageContext pc) {
        pageContext = pc;
    }

    @Override
    public void setParent(Tag pt) {
        parentTag = pt;
    }

}
