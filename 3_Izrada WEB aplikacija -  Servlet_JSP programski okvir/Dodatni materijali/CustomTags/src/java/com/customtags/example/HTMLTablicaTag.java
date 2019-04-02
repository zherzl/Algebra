package com.customtags.example;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.tagext.Tag;

public class HTMLTablicaTag implements Tag {

    private PageContext pageContext;
    private Tag parentTag;
    private int brRedaka = 5;
    private int brKolona = 5;

    public void setBrKolona(int brKolona) {
        this.brKolona = brKolona;
    }

    public void setBrRedaka(int brRedaka) {
        this.brRedaka = brRedaka;
    }

    @Override
    public int doEndTag() throws JspException {
        return EVAL_PAGE;
    }

    @Override
    public int doStartTag() throws JspException {
        try {
            JspWriter out = pageContext.getOut();
            out.print("<table style=\"background-color:#ffff00; border: 1px solid black;\">");
            for (int i = 0; i < brRedaka; i++) {
                out.print("<TR>");
                for (int j = 0; j < brKolona; j++) {
                    out.print("<TD>x</TD>");
                }
                out.print("</TR>");
            }
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
