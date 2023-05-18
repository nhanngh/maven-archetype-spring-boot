#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.config;

import static ${package}.constants.StringConstants.APP_CONFIG;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@Getter
@RequiredArgsConstructor
@ConfigurationProperties(prefix = APP_CONFIG)
@Validated
public class AppConfig {

  private final String helloWord;
}
