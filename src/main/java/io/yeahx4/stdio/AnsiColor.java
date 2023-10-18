package io.yeahx4.stdio;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum AnsiColor {
    RESET("\u001B[0m"),
    BLACK("\u001B[30m"),
    RED("\u001B[31m"),
    GREEN("\u001B[32m"),
    YELLOW("\u001B[33m"),
    BLUE("\u001B[34m"),
    CYAN("\u001B[36m"),
    WHITE("\u001B[37m"),
    BLACK_BG("\u001B[40m"),
    RED_BG( "\u001B[41m"),
    GREEN_BG("\u001B[42m"),
    YELLOW_BG("\u001B[43m"),
    BLUE_BG("\u001B[44m"),
    PURPLE_BG("\u001B[45m"),
    CYAN_BG("\u001B[46m"),
    WHITE_BG("\u001B[47m"),
    BLACK_BOLD("\033[1;30m"),
    RED_BOLD("\033[1;31m"),
    GREEN_BOLD("\033[1;32m"),
    YELLOW_BOLD("\033[1;33m"),
    BLUE_BOLD("\033[1;34m"),
    PURPLE_BOLD("\033[1;35m"),
    CYAN_BOLD("\033[1;36m"),
    WHITE_BOLD("\033[1;37m"),
    BLACK_UNDERLINE("\033[4;30m"),
    RED_UNDERLINE("\033[4;31m"),
    GREEN_UNDERLINE("\033[4;32m"),
    YELLOW_UNDERLINE("\033[4;33m"),
    BLUE_UNDERLINE("\033[4;34m"),
    PURPLE_UNDERLINE("\033[4;35m"),
    CYAN_UNDERLINE("\033[4;36m"),
    WHITE_UNDERLINE("\033[4;37m"),
    BLACK_BRIGHT("\033[0;90m"),
    RED_BRIGHT("\033[0;91m"),
    GREEN_BRIGHT("\033[0;92m"),
    YELLOW_BRIGHT("\033[0;93m"),
    BLUE_BRIGHT("\033[0;94m"),
    PURPLE_BRIGHT("\033[0;95m"),
    CYAN_BRIGHT("\033[0;96m"),
    WHITE_BRIGHT("\033[0;97m"),
    BLACK_BOLD_BRIGHT("\033[1;90m"),
    RED_BOLD_BRIGHT("\033[1;91m"),
    GREEN_BOLD_BRIGHT("\033[1;92m"),
    YELLOW_BOLD_BRIGHT("\033[1;93m"),
    BLUE_BOLD_BRIGHT("\033[1;94m"),
    PURPLE_BOLD_BRIGHT("\033[1;95m"),
    CYAN_BOLD_BRIGHT("\033[1;96m"),
    WHITE_BOLD_BRIGHT("\033[1;97m"),
    BLACK_BG_BRIGHT("\033[0;100m"),
    RED_BG_BRIGHT("\033[0;101m"),
    GREEN_BG_BRIGHT("\033[0;102m"),
    YELLOW_BG_BRIGHT("\033[0;103m"),
    BLUE_BG_BRIGHT("\033[0;104m"),
    PURPLE_BG_BRIGHT("\033[0;105m"),
    CYAN_BG_BRIGHT("\033[0;106m"),
    WHITE_BG_BRIGHT("\033[0;107m");

    private final String value;

    @Override
    public String toString() {
        return this.value;
    }
}
