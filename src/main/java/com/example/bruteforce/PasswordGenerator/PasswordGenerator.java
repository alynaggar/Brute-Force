package com.example.bruteforce.PasswordGenerator;

import java.util.ArrayList;
import java.util.List;

public class PasswordGenerator {
    private static final String Characters = "abcdefghijklmnopqrstuvwxyz0123456789";
    private List<String> passwords = new ArrayList<>() {
        {
            // MOST USED PASSWORDS
            add("123456");add("password");add("123456789");add("12345");add("12345678");
            add("qwerty");add("1234567");add("111111");add("1234567890");add("123123");
            add("abc123");add("1234");add("password1");add("iloveyou");add("1q2w3e4r");
            add("000000");add("qwerty123");add("zaq12wsx");add("dragon");add("sunshine");
            add("princess");add("letmein");add("654321");add("monkey");add("27653");
            add("1qaz2wsx");add("123321");add("qwertyuiop");add("superman");add("asdfghjkl");
        }
    };

    public List<String> generatePassword(int limit) {
        if (limit <= 0) {
            throw new IllegalArgumentException("Limit must be greater than 0.");
        }
        if(limit > 8){
            throw new IllegalArgumentException("Limit must be less than 8");
        }
        switch (limit) {
            case 1 -> generateOneLetterPassword();
            case 2 -> generateTwoLetterPassword();
            case 3 -> generateThreeLetterPassword();
            case 4 -> generateFourLetterPassword();
            case 5 -> generateFiveLetterPassword();
            case 6 -> generateSixLetterPassword();
            case 7 -> generateSevenLetterPassword();
            case 8 -> generateEightLetterPassword();
        }
        return passwords;
    }

    public void generateEightLetterPassword() {
        for (char i = 0; i < Characters.length(); i++) {
            for (char j = 0; j < Characters.length(); j++) {
                for (char k = 0; k < Characters.length(); k++) {
                    for (char l = 0; l < Characters.length(); l++) {
                        for (char m = 0; m < Characters.length(); m++) {
                            for (char n = 0; n < Characters.length(); n++) {
                                for (char o = 0; o < Characters.length(); o++) {
                                    for (char p = 0; p < Characters.length(); p++) {
                                        String word = String.valueOf(Characters.charAt(i)) + Characters.charAt(j) + Characters.charAt(k) + Characters.charAt(l) + Characters.charAt(m) + Characters.charAt(n) + Characters.charAt(o) + Characters.charAt(p);
                                        passwords.add(word);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void generateSevenLetterPassword() {
        for (char i = 0; i < Characters.length(); i++) {
            for (char j = 0; j < Characters.length(); j++) {
                for (char k = 0; k < Characters.length(); k++) {
                    for (char l = 0; l < Characters.length(); l++) {
                        for (char m = 0; m < Characters.length(); m++) {
                            for (char n = 0; n < Characters.length(); n++) {
                                for (char o = 0; o < Characters.length(); o++) {
                                    String word = String.valueOf(Characters.charAt(i)) + Characters.charAt(j) + Characters.charAt(k) + Characters.charAt(l) + Characters.charAt(m) + Characters.charAt(n) + Characters.charAt(o);
                                    passwords.add(word);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void generateSixLetterPassword() {
        for (char i = 0; i < Characters.length(); i++) {
            for (char j = 0; j < Characters.length(); j++) {
                for (char k = 0; k < Characters.length(); k++) {
                    for (char l = 0; l < Characters.length(); l++) {
                        for (char m = 0; m < Characters.length(); m++) {
                            for (char n = 0; n < Characters.length(); n++) {
                                String word = String.valueOf(Characters.charAt(i)) + Characters.charAt(j) + Characters.charAt(k) + Characters.charAt(l) + Characters.charAt(m) + Characters.charAt(n);
                                passwords.add(word);
                            }
                        }
                    }
                }
            }
        }
    }

    public void generateFiveLetterPassword() {
        for (char i = 0; i < Characters.length(); i++) {
            for (char j = 0; j < Characters.length(); j++) {
                for (char k = 0; k < Characters.length(); k++) {
                    for (char l = 0; l < Characters.length(); l++) {
                        for (char m = 0; m < Characters.length(); m++) {
                            String word = String.valueOf(Characters.charAt(i)) + Characters.charAt(j) + Characters.charAt(k) + Characters.charAt(l) + Characters.charAt(m);
                            passwords.add(word);
                        }
                    }
                }
            }
        }
    }

    public void generateFourLetterPassword() {
        for (char i = 0; i < Characters.length(); i++) {
            for (char j = 0; j < Characters.length(); j++) {
                for (char k = 0; k < Characters.length(); k++) {
                    for (char l = 0; l < Characters.length(); l++) {
                        String word = String.valueOf(Characters.charAt(i)) + Characters.charAt(j) + Characters.charAt(k) + Characters.charAt(l);
                        passwords.add(word);
                    }
                }
            }
        }
    }

    public void generateThreeLetterPassword() {
        for (char i = 0; i < Characters.length(); i++) {
            for (char j = 0; j < Characters.length(); j++) {
                for (char k = 0; k < Characters.length(); k++) {
                    String word = String.valueOf(Characters.charAt(i)) + Characters.charAt(j) + Characters.charAt(k);
                    passwords.add(word);
                }
            }
        }
    }

    public void generateTwoLetterPassword() {
        for (char i = 0; i < Characters.length(); i++) {
            for (char j = 0; j < Characters.length(); j++) {
                String word = String.valueOf(Characters.charAt(i)) + Characters.charAt(j);
                passwords.add(word);
            }
        }
    }

    public void generateOneLetterPassword() {
        for (char i = 0; i < Characters.length(); i++) {
                String word = String.valueOf(Characters.charAt(i));
                passwords.add(word);
        }
    }
}
