#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service.impl;

import ${package}.config.AppConfig;
import ${package}.service.HelloService;
import java.util.Objects;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HelloServiceImpl implements HelloService {

  private final AppConfig appConfig;

  @Override
  public String hello() {
    return Objects.isNull(appConfig.getHelloWord()) ? "Hello word 1!" : appConfig.getHelloWord() ;
  }
}
