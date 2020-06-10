package com.mark;

import freemarker.template.*;
import java.util.*;
import java.io.*;

public class Client {
  public static void main(String[] args) throws Exception {

    new File("dist").mkdirs();

    Configuration cfg = new Configuration(Configuration.VERSION_2_3_30);
    cfg.setDirectoryForTemplateLoading(new File("templates"));
    cfg.setDefaultEncoding("UTF-8");
    cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
    cfg.setLogTemplateExceptions(false);
    cfg.setWrapUncheckedExceptions(true);
    cfg.setFallbackOnNullLoopVariable(false);

    Map root = new HashMap();

    Template temp = cfg.getTemplate("add_book.ftl");
    Writer out = new OutputStreamWriter(new FileOutputStream("dist/add_book.html"));
    temp.process(root, out);
    out.flush();

    temp = cfg.getTemplate("disp_book.ftl");
    out = new OutputStreamWriter(new FileOutputStream("dist/disp_book.html"));
    temp.process(root, out);
  }
}
