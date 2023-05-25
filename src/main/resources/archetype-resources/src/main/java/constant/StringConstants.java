#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.constants;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class StringConstants {

  public static final String APP_CONFIG = "app";
  public static final String FORWARD_SLASH = "/";
  public static final String DOT = ".";
  public static final String QUESTION_MARK = "?";
  public static final String AMPERSAND = "&";
  public static final String BEARER_PREFIX = "Bearer ";
  public static final String UNDERSCORE = "_";
}
