package fabulous.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by moluram on 6.3.17.
 */
public class FabulousWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
  protected Class<?>[] getRootConfigClasses() {
    return new Class<?>[]{ RootConfig.class };
  }

  protected Class<?>[] getServletConfigClasses() {
    return new Class<?>[]{ WebConfig.class };
  }

  protected String[] getServletMappings() {
    return new String[] { "/" };
  }
}
