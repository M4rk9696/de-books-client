package com.mark;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

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
    try(Writer out = new OutputStreamWriter(new FileOutputStream("dist/add_book.html"))) {
      temp.process(root, out);
      out.flush();
    }

    temp = cfg.getTemplate("disp_book.ftl");
    try(Writer out = new OutputStreamWriter(new FileOutputStream("dist/disp_book.html"))) {
      temp.process(root, out);
      out.flush();
    }
  }
}
