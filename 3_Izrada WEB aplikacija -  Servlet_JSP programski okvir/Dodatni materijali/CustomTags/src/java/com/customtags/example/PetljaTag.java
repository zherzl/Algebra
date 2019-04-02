package com.customtags.example;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.IterationTag;
import javax.servlet.jsp.tagext.Tag;

public class PetljaTag implements IterationTag {

    private PageContext pageContext;
    private Tag parentTag;
    private int count = 1;
    private JspWriter out;

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public int doEndTag() throws JspException {
        return EVAL_PAGE;
    }

    @Override
    public int doStartTag() throws JspException {
        out = pageContext.getOut();
        if (count > 0) {
            return EVAL_BODY_INCLUDE;
        } else {
            return SKIP_BODY;
        }
    }

    public int doAfterBody() throws JspException {
        if (--count > 0) {
            try {
                out.print("<br/>");
            } catch (Exception e) {
                throw new JspException("Error");
            }
            return EVAL_BODY_AGAIN;

        } else {
            return SKIP_BODY;
        }
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
