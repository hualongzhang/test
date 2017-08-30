package common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc                                //����SpringMVC
@ComponentScan("common")
public class WebConfig extends WebMvcConfigurerAdapter {

	//����JSP��ͼ������
     @Bean
     public ViewResolver viewResolver() {
         InternalResourceViewResolver resolver = new InternalResourceViewResolver();
         resolver.setPrefix("/WEB-INF/views/");
         resolver.setSuffix(".jsp");
         resolver.setExposeContextBeansAsAttributes(true);
         return resolver;
     }
     
      //���þ�̬��Դ�Ĵ���
      @Override
      public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
          configurer.enable();        //�Ծ�̬��Դ������ת��������ȱʡ��servlet������ʹ��DispatcherServlet
      }

	
}
