if (num > Integer.MAX_VALUE / 10 ||
    (num == Integer.MAX_VALUE / 10 && digit > (sign == 1 ? 7 : 8))) {
    if (sign == 1) {
        return Integer.MAX_VALUE;
    } else {
        return Integer.MIN_VALUE;
    }
}
