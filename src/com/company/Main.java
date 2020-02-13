package com.company;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        final long offset = 0;
        final int size = 15;
        long [] sequence = getSequence(offset, size);
        for (long num: sequence) {
            System.out.println(num);
        }
    }

    public static long [] getSequence(final long offset, final int size) {
        if (offset >= 9876543210L) {
            return new long[0];
        }
        ArrayList <Long> sequence = new ArrayList<>();
        Pattern pattern = Pattern.compile("^(?:(?!(?:(\\d).*\\1|\\D+)).){10}$");
        long number = 1023456789L;
        if (offset > number) {
            number = offset;
        }
        for (; sequence.size() < size && number < 9876543210L; number++) {
            Matcher matcher = pattern.matcher(""+number);
            if (matcher.matches()) {
                sequence.add(number);
            }
        }
        long [] sequenceArr = new long [sequence.size()];
        for (int i = 0; i < sequence.size(); i++) {
            sequenceArr[i] = sequence.get(i);
        }
        //long [] sequenceArr = Long.longValue(sequence.toArray(new Long[sequence.size()]));
        return sequenceArr;
    }
}
C:\Users\Ouan\IdeaProjects\Pandigit1