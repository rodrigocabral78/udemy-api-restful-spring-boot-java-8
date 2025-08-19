package com.github.rodrigocabral78.apiRestFulSpringBootJava17.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtils {
  /**
   * @param passwd
   * @return String
   */
  public static String encoderPasswd(String passwd){
    if (passwd == null) return passwd;

    BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();
    return bCryptEncoder.encode(passwd);
  }

  /**
   * @param passwd
   * @param passwdEncoded
   * @return boolean
   */
  public static boolean validationPassword(String passwd, String passwdEncoded) {
    BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();
    return bCryptEncoder.matches(passwd, passwdEncoded);
  }
}
